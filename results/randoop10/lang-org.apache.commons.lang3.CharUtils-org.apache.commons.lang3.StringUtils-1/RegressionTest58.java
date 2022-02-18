import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest58 {

    public static boolean debug = false;

    @Test
    public void test29001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29001");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("cccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc", "IFTLNZ\\SISC02");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "cccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc" + "'", str2, "cccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc");
    }

    @Test
    public void test29002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29002");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444444444444fRANZ\326SISC", "ad4ae4af4ag4ai4al4am4an4ao4aq4ar4as4at4au4aw4ax4az4ba4bb4bd4be4bf4bg4bh4bi4bj4bl4bm4bn4bo4bq4br4bs4bt4bv4bw...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test29003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29003");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        java.util.Locale locale1 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str2 = locale0.getDisplayName(locale1);
        java.util.Locale.Category category3 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale4 = java.util.Locale.getDefault(category3);
        java.lang.String str5 = locale1.getDisplayVariant(locale4);
        java.util.Locale locale6 = java.util.Locale.GERMAN;
        java.util.Locale locale7 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str8 = locale6.getDisplayName(locale7);
        java.util.Locale locale9 = java.util.Locale.UK;
        java.util.Locale locale10 = java.util.Locale.GERMAN;
        java.util.Locale locale11 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str12 = locale10.getDisplayName(locale11);
        java.util.Locale locale13 = locale10.stripExtensions();
        java.lang.String str14 = locale9.getDisplayVariant(locale10);
        java.lang.String str15 = locale7.getDisplayLanguage(locale10);
        java.lang.String str16 = locale4.getDisplayName(locale7);
        java.util.Locale locale17 = java.util.Locale.ITALIAN;
        java.lang.String str18 = locale17.getDisplayLanguage();
        java.util.Locale locale19 = locale17.stripExtensions();
        java.lang.String str20 = locale17.getDisplayVariant();
        java.util.Set<java.lang.String> strSet21 = locale17.getUnicodeLocaleKeys();
        java.lang.String str22 = locale7.getDisplayVariant(locale17);
        java.lang.String str23 = locale7.getScript();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = locale7.getUnicodeLocaleType("ZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cn");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: ZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cn");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "allemand" + "'", str2, "allemand");
        org.junit.Assert.assertTrue("'" + category3 + "' != '" + java.util.Locale.Category.FORMAT + "'", category3.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "de");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "de");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "allemand" + "'", str8, "allemand");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "de");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "allemand" + "'", str12, "allemand");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "de");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Franz\366sisch" + "'", str15, "Franz\366sisch");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "allemand" + "'", str16, "allemand");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "italien" + "'", str18, "italien");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "it");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test29004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29004");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\!_\\U0020_Itle\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\", "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUU\\u0030UUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test29005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29005");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee", 'a', 'g');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee" + "'", str3, "eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee");
    }

    @Test
    public void test29006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29006");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("TALIAN\\U0023", (int) 'D', (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test29007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29007");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("2aiTALIANiTALIANiTALIANiTAL", "Rnz\366sisch(Knd                                                                                                                                                                                                               ", 99);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2aiTALIANiTALIANiTALIANiTAL" + "'", str3, "2aiTALIANiTALIANiTALIANiTAL");
    }

    @Test
    public void test29008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29008");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("iFranzosisch ", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "iFranzosisch " + "'", str2, "iFranzosisch ");
    }

    @Test
    public void test29009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29009");
        java.util.Locale locale1 = new java.util.Locale("nauruan");
        org.junit.Assert.assertEquals(locale1.toString(), "nauruan");
    }

    @Test
    public void test29010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29010");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("ittait_italian_egaish                                                                                ", (int) 'g');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  ittait_italian_egaish                                                                                " + "'", str2, "  ittait_italian_egaish                                                                                ");
    }

    @Test
    public void test29011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29011");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("23DAL", "Italia                                                  ", 52);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test29012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29012");
        java.lang.CharSequence charSequence1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "\u30d5\u30e9\u30f3\u30b9\u8a9e\u30ab\u30ca\u30c0)", charSequence1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Strings must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test29013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29013");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder5 = builder1.clear();
        java.util.Locale.Builder builder6 = builder1.clear();
        java.util.Locale locale7 = builder6.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder6.setScript("          tT           T IT ");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script:           tT           T IT  [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "fran\347ais (Canada)" + "'", str3, "fran\347ais (Canada)");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
    }

    @Test
    public void test29014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29014");
        java.util.Locale locale1 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale5 = new java.util.Locale("Italian", "Italian", "English");
        java.lang.String str6 = locale5.getDisplayCountry();
        java.lang.String str7 = locale1.getDisplayCountry(locale5);
        java.lang.String str9 = locale5.getExtension('E');
        java.util.Locale locale10 = java.util.Locale.US;
        java.lang.String str11 = locale10.toLanguageTag();
        java.lang.String str12 = locale5.getDisplayName(locale10);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.lowerCase("\\u0049", locale10);
        java.util.Set<java.lang.String> strSet14 = locale10.getUnicodeLocaleAttributes();
        java.lang.String str15 = locale10.getISO3Language();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertEquals(locale5.toString(), "italian_ITALIAN_English");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ITALIAN" + "'", str6, "ITALIAN");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "China" + "'", str7, "China");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "en-US" + "'", str11, "en-US");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "italian (ITALIAN,English)" + "'", str12, "italian (ITALIAN,English)");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\\u0049" + "'", str13, "\\u0049");
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "eng" + "'", str15, "eng");
    }

    @Test
    public void test29015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29015");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("                                        itTAiT_ITALIAN_EgAish                       )modgniK detinU( hsilgnE", "fffffffffffffffffffffffffffffffffraadzhaezhafzhagzhaizhalzhamzhanzhaozhaqzharzhacor\351e du sud");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                        itTAiT_ITALIAN_EgAish                       )modgniK detinU( hsilgnE" + "'", str2, "                                        itTAiT_ITALIAN_EgAish                       )modgniK detinU( hsilgnE");
    }

    @Test
    public void test29016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29016");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("E", "000000000000000000000000000000000000000000000FRANZ\326SISCH0000000000000000000000000000000000000000000000");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test29017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29017");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "zh_CN");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test29018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29018");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("ad4ae4af4ag4ai4al4am4an4ao4aq4ar4as4at4au4aw4ax4az4ba4bb4bd4be4bf4bg4bh4bi4bj4bl4bm4bn4bo4bq4br4bs4bt4bv4bw...R-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ad4ae4af4ag4ai4al4am4an4ao4aq4ar4as4at4au4aw4ax4az4ba4bb4bd4be4bf4bg4bh4bi4bj4bl4bm4bn4bo4bq4br4bs4bt4bv4bw...R-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAA" + "'", str1, "ad4ae4af4ag4ai4al4am4an4ao4aq4ar4as4at4au4aw4ax4az4ba4bb4bd4be4bf4bg4bh4bi4bj4bl4bm4bn4bo4bq4br4bs4bt4bv4bw...R-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test29019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29019");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale2 = new java.util.Locale("...ANiTALI");
        java.util.Locale.setDefault(category0, locale2);
        java.util.Locale locale4 = java.util.Locale.getDefault(category0);
        java.lang.String str5 = locale4.getLanguage();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = locale4.getUnicodeLocaleType("k");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: k");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertEquals(locale2.toString(), "...anitali");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "...anitali");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "...anitali" + "'", str5, "...anitali");
    }

    @Test
    public void test29020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29020");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("\\u006bCinese (Cina)\\u0069h..", "s (Canada)", "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUU\\u0030UUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", 26);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\u006bCinese (Cina)\\u0069h.." + "'", str4, "\\u006bCinese (Cina)\\u0069h..");
    }

    @Test
    public void test29021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29021");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                                             DE_DE                                             ", "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEnglischCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC...", (int) 'A');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test29022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29022");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "                                                 fRNZ\326SISCH(kND                                                  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test29023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29023");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "cana", (java.lang.CharSequence) "en_USchinois (chine)chinois (chine)chinois (chine)chinois (chine)chinois (chine)chinois (chine)chinois (chine)chinois (chine)chinois (chine)chinois (chine)chinois (chine)chinois (chine)chinois (chine)chinois (chine)chinois (chine)chinois (chine)chinois (chine)chinois (chine)chinois (chine)chinois (chine)chinois (chine)chinois (chine)chinois (chine)chinois (chine)chinois (chine)chinois (chine)chinois (chine)chinois (chine)chinois (chine)chinois (chine)chinois (chine)chinois (chine)chinois (chine)chinois (chine)chinois (chine)chinois (chine)chinois (chine)chinois (chine");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "cana" + "'", charSequence2, "cana");
    }

    @Test
    public void test29024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29024");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("korean (south korea)", (int) '\n');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "uth korea)" + "'", str2, "uth korea)");
    }

    @Test
    public void test29025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29025");
        java.util.Locale.Builder builder1 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setLanguageTag("Italian");
        java.util.Locale locale5 = java.util.Locale.PRC;
        java.lang.String str6 = locale5.getDisplayName();
        java.util.Locale.Builder builder7 = builder1.setLocale(locale5);
        java.util.Locale.Builder builder8 = builder7.clear();
        java.util.Locale locale9 = java.util.Locale.KOREAN;
        java.util.Locale.Builder builder10 = builder8.setLocale(locale9);
        java.lang.String str11 = locale9.getDisplayName();
        java.lang.String str12 = locale9.getISO3Language();
        java.util.Locale.Category category13 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale14 = java.util.Locale.getDefault(category13);
        java.util.Locale locale15 = java.util.Locale.GERMAN;
        java.util.Locale locale16 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str17 = locale15.getDisplayName(locale16);
        java.util.Locale.setDefault(category13, locale16);
        java.util.Locale.Category category19 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale20 = java.util.Locale.getDefault(category19);
        java.lang.String str22 = locale20.getExtension('x');
        java.util.Locale.setDefault(category13, locale20);
        java.util.Locale locale24 = java.util.Locale.getDefault(category13);
        java.util.Locale locale26 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale.setDefault(category13, locale26);
        java.util.Locale locale28 = java.util.Locale.FRENCH;
        java.util.Locale locale29 = java.util.Locale.ENGLISH;
        java.lang.String str30 = locale29.getDisplayCountry();
        java.lang.String str31 = locale28.getDisplayVariant(locale29);
        java.lang.String str32 = locale28.getDisplayCountry();
        java.lang.String str33 = locale28.getScript();
        java.lang.String str34 = locale28.getScript();
        java.util.Locale locale35 = java.util.Locale.FRENCH;
        java.util.Locale locale36 = java.util.Locale.ENGLISH;
        java.lang.String str37 = locale36.getDisplayCountry();
        java.lang.String str38 = locale35.getDisplayVariant(locale36);
        java.lang.String str39 = locale35.getDisplayCountry();
        java.lang.String str40 = locale35.getScript();
        java.lang.String str41 = locale35.getScript();
        java.lang.String str42 = locale28.getDisplayCountry(locale35);
        java.util.Locale.Category category43 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale44 = java.util.Locale.getDefault(category43);
        java.util.Locale locale45 = java.util.Locale.FRANCE;
        java.util.Locale locale46 = java.util.Locale.ITALIAN;
        java.lang.String str48 = locale46.getExtension('h');
        java.lang.String str49 = locale45.getDisplayScript(locale46);
        java.lang.String str50 = locale45.getISO3Country();
        java.util.Locale locale51 = java.util.Locale.GERMAN;
        java.util.Locale.setDefault(locale51);
        java.lang.String str53 = locale45.getDisplayName(locale51);
        java.lang.String str54 = locale45.getScript();
        java.util.Locale.setDefault(category43, locale45);
        java.lang.String str56 = locale28.getDisplayCountry(locale45);
        java.util.Locale.Builder builder57 = new java.util.Locale.Builder();
        java.util.Locale locale58 = builder57.build();
        java.util.Locale locale60 = java.util.Locale.forLanguageTag("Italian");
        java.lang.String str61 = locale58.getDisplayLanguage(locale60);
        java.lang.String str62 = locale45.getDisplayVariant(locale58);
        java.util.Locale.setDefault(category13, locale58);
        java.util.Locale locale64 = java.util.Locale.getDefault();
        java.lang.String str65 = locale64.getDisplayScript();
        java.util.Locale locale66 = java.util.Locale.FRANCE;
        java.util.Locale locale67 = java.util.Locale.ITALIAN;
        java.lang.String str69 = locale67.getExtension('h');
        java.lang.String str70 = locale66.getDisplayScript(locale67);
        boolean boolean71 = locale66.hasExtensions();
        java.lang.String str72 = locale66.getVariant();
        java.util.Set<java.lang.Character> charSet73 = locale66.getExtensionKeys();
        java.lang.String str74 = locale66.toLanguageTag();
        java.lang.String str75 = locale64.getDisplayCountry(locale66);
        java.lang.String str76 = locale66.getScript();
        java.util.Locale.setDefault(category13, locale66);
        java.util.Locale locale78 = java.util.Locale.getDefault(category13);
        java.lang.String str79 = locale9.getDisplayName(locale78);
        java.lang.String str80 = org.apache.commons.lang3.StringUtils.lowerCase("de_de", locale9);
        java.lang.String str81 = locale9.getISO3Language();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Chinese (China)" + "'", str6, "Chinese (China)");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "ko");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Korean" + "'", str11, "Korean");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "kor" + "'", str12, "kor");
        org.junit.Assert.assertTrue("'" + category13 + "' != '" + java.util.Locale.Category.FORMAT + "'", category13.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale14);
// flaky:         org.junit.Assert.assertEquals(locale14.toString(), "de");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "de");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "allemand" + "'", str17, "allemand");
        org.junit.Assert.assertTrue("'" + category19 + "' != '" + java.util.Locale.Category.FORMAT + "'", category19.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "fr_CA");
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "fr");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "en");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "fr");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "en");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertTrue("'" + category43 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category43.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "...anitali");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "it");
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "FRA" + "'", str50, "FRA");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "de");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Franz\366sisch (Frankreich)" + "'", str53, "Franz\366sisch (Frankreich)");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "");
        org.junit.Assert.assertNotNull(locale60);
        org.junit.Assert.assertEquals(locale60.toString(), "italian");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertNotNull(locale64);
        org.junit.Assert.assertEquals(locale64.toString(), "de");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertNotNull(locale66);
        org.junit.Assert.assertEquals(locale66.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale67);
        org.junit.Assert.assertEquals(locale67.toString(), "it");
        org.junit.Assert.assertNull(str69);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertNotNull(charSet73);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "fr-FR" + "'", str74, "fr-FR");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertNotNull(locale78);
        org.junit.Assert.assertEquals(locale78.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "cor\351en" + "'", str79, "cor\351en");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "de_de" + "'", str80, "de_de");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "kor" + "'", str81, "kor");
    }

    @Test
    public void test29026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29026");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("Franzosisch (Frankreich)", "5555555555FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAeeeeeeeeeeeex5555555555", "!ih    Deutsc!ih    Deutsc!ih    Deutsc!ih    Deutsc!ih    Deutsc!ih    Deu       ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Franzosisch (Frankreich)" + "'", str3, "Franzosisch (Frankreich)");
    }

    @Test
    public void test29027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29027");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("ranzosisch (Frankreich)kkkkkkkkkkkkkkkkkkk...");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "E             gallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemand");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test29028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29028");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("                                                                    \\u0020iTALIANiTALIANiTALIANiTALI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test29029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29029");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("Italienisch#########################################################################################", "ITALIEITALNC_HZ\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rITALIEITAL");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test29030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29030");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder0.setVariant("itTAiT_ITALIAN_EgAish");
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        java.util.Locale.Builder builder7 = builder6.clearExtensions();
        java.util.Locale.Builder builder9 = builder6.setVariant("Eagaash");
        java.util.Locale.Builder builder10 = builder9.clear();
        java.util.Locale.Builder builder11 = builder10.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder13 = builder11.setVariant("N");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: N [at index 0]");
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
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test29031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29031");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("franc", (double) 114);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=114.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test29032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29032");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = builder0.build();
        java.util.Locale locale3 = locale2.stripExtensions();
        java.util.Set<java.lang.String> strSet4 = locale2.getUnicodeLocaleAttributes();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(strSet4);
    }

    @Test
    public void test29033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29033");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("italie", "CHINESE", 406);
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("                                      ...", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test29034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29034");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test29035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29035");
        java.util.Locale locale2 = new java.util.Locale("");
        java.lang.String str3 = locale2.getDisplayName();
        java.lang.String str4 = locale2.getISO3Country();
        java.lang.String str5 = locale2.toLanguageTag();
        java.lang.String str6 = locale2.getVariant();
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.upperCase("IT_IT                       ", locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "und" + "'", str5, "und");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "IT_IT                       " + "'", str7, "IT_IT                       ");
    }

    @Test
    public void test29036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29036");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("hi!_\\U0020_Italienisch#########################################################################################", "franc", 30);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test29037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29037");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                                                                                                               )))))))))))))))))))))))))))))))))))))))))))))))))))", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test29038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29038");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz\\XTALXAN_ITALIAN_ENGLXSHzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
        java.lang.String str2 = locale1.getLanguage();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test29039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29039");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("u006800u\\nailaIi0200");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "U006800U\\NAILAII0200" + "'", str1, "U006800U\\NAILAII0200");
    }

    @Test
    public void test29040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29040");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Engl", '0');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test29041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29041");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '#', 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test29042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29042");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("EN_USEN_USEN_USEN_USEN_U         italian_italian_englishEN_USEN_USEN_USEN_USEN_US", "ECANADAGCANADACANADASH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_USEN_USEN_USEN_USEN_U         italian_italian_englishEN_USEN_USEN_USEN_USEN_US" + "'", str2, "_USEN_USEN_USEN_USEN_U         italian_italian_englishEN_USEN_USEN_USEN_USEN_US");
    }

    @Test
    public void test29043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29043");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("FRZ\326CZ(FRKREC)                                                 ", 't');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "FRZ\326CZ(FRKREC)                                                 " + "'", str2, "FRZ\326CZ(FRKREC)                                                 ");
    }

    @Test
    public void test29044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29044");
        java.util.Locale locale0 = java.util.Locale.UK;
        java.util.Locale locale1 = java.util.Locale.GERMAN;
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale1.getDisplayName(locale2);
        java.util.Locale locale4 = locale1.stripExtensions();
        java.lang.String str5 = locale0.getDisplayVariant(locale1);
        java.lang.String str6 = locale0.getDisplayCountry();
        java.lang.String str7 = locale0.getScript();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "de");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "allemand" + "'", str3, "allemand");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "de");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Royaume-Uni" + "'", str6, "Royaume-Uni");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test29045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29045");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                                             frn\347is(frnce)(CHINESE(CHINA)", 1, 46);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test29046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29046");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiitalian_ITALIAN_EnglisEiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiEsilgnE_NAILATI_nailatiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii" + "'", str1, "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiEsilgnE_NAILATI_nailatiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
    }

    @Test
    public void test29047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29047");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("5\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065" + "'", str1, "5\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065");
    }

    @Test
    public void test29048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29048");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "AzhzhzhzhzhzhzhzhzhzhE             g                          ", (java.lang.CharSequence) "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIITALIAN_ITALIAN_ENGLISHIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 104 + "'", int2 == 104);
    }

    @Test
    public void test29049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29049");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("                                                                                           u0020italianitalianitalianital", "bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbFRANZ\326SISCH (FRANKREICH)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                           u0020italianitalianitalianital" + "'", str2, "                                                                                           u0020italianitalianitalianital");
    }

    @Test
    public void test29050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29050");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("LATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATih", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATih" + "'", str2, "hHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATih");
    }

    @Test
    public void test29051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29051");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("ian\\u0020");
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + 'i' + "'", char1 == 'i');
    }

    @Test
    public void test29052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29052");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("", 12);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test29053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29053");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("\\u0069", "hi!       iTALIAN (ITALIAN,ENGLISHItalienischiTALIAN (ITALIAN,ENGLISHitalian_ITALIAN_EnglishiTALIAN (ITALIAN,ENGLISHHI!iTALIAN (ITALIAN,ENGLISHhi!iTALIAN (ITALIAN,ENGLISHADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...iTALIAN (ITALIAN,ENGLISH\\u0034iTALIAN (ITALIAN,ENGLISHHI!iTALIAN (ITALIAN,ENGLISHItalianiTALIAN (ITALIAN,ENGLISH\\u0061iTALIAN (ITALIAN,ENGLISH\\u0023iTALIAN (ITALIAN,ENGLISHhi!iTALIAN (ITALIAN,ENGLISHiTALIANiTALIAN (ITALIAN,ENGLISHChinese (China)iTALIAN (ITALIAN,ENGLISHhi!iTALIAN (ITALIAN,ENGLISHzh_CNiTALIAN (ITALIAN,ENGLISHiTALIANiTALIAN (ITALIAN,ENGLISHeniTALIAN (ITALIAN,ENGLISHItalienisch");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test29054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29054");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("##########################", "aeroK htuoS    NC_HZ    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##########################" + "'", str2, "##########################");
    }

    @Test
    public void test29055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29055");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("KoreanADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDhcstueDKoreanADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDB");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "KoreanADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDhcstueDKoreanADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDB" + "'", str1, "KoreanADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDhcstueDKoreanADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDB");
    }

    @Test
    public void test29056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29056");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("italian    ", "Fgence");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "                                                                                     ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test29057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29057");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("cCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC\\u00de\\u00CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC", 'J');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "cCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC\\u00de\\u00CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC" + "'", str2, "cCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC\\u00de\\u00CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
    }

    @Test
    public void test29058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29058");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("                                                                                           U002");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "200U                                                                                           " + "'", str1, "200U                                                                                           ");
    }

    @Test
    public void test29059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29059");
        java.util.Locale locale1 = new java.util.Locale("ADKAEKAFKAGKAIKALKAMKANKAOKAQKARKASKATKAUKAWKAXKAZKBAKBBKBDKBEKBFKBGKBHKBIKBJKBLKBMKBNKBOKBQKBRKBSKBTKBVKBWKBYKBZKCAKCCKCDKCFKCGKCHKCIKCKKCLKCMKCNKCOKCRKCUKCVKCWKCXKCYKCZKDEKDJKDKKDMKDOKDZKECKEEKEGKEHKERKESKETKFIKFJKFKKFMKFOKFRKGAKGBKGDKGEKGFKGGKGHKGIKGLKGMKGNKGPKGQKGRKGSKGTKGUKGWKGYKHKKHMKHNKHRKHTKHUKIDKIEKILKIMKINKIOKIQKIRKISKITKJEKJMKJOKJPKKEKKGKKHKKIKKMKKNKKPKKRKKWKKYKKZKLAKLBKLCKLIKLKKLRKLSKLTKLUKLVKLYKMAKMCKMDKMEKMFKMGKMHKMKKMLKMMKMNKMOKMPKMQKMRKMSKMTKMUKMVKMWKMXKMYKMZKNAKNCKNEKNFKNGKNIKNLKNOKNPKNRKNUKNZKOMKPAKPEKPFKPGKPHKPKKPLKPMKPNKPRKPSKPTKPWKPYKQAKREKROKRSKRUKRWKSAKSBKSCKSDKSEKSGKSHKSIKSJKSKKSLKSMKSNKSOKSRKSSKSTKSVKSXKSYKSZKTCKTDKTFKTGKTHKTJKTKKTLKTMKTNKTOKTRKTTKTVKTWKTZKUAKUGKUMKUSKUYKUZKVAKVCKVEKVGKVIKVNKVUKWFKWSKYEKYTKZAKZMKZW");
        java.lang.String str2 = locale1.getISO3Country();
        org.junit.Assert.assertEquals(locale1.toString(), "adkaekafkagkaikalkamkankaokaqkarkaskatkaukawkaxkazkbakbbkbdkbekbfkbgkbhkbikbjkblkbmkbnkbokbqkbrkbskbtkbvkbwkbykbzkcakcckcdkcfkcgkchkcikckkclkcmkcnkcokcrkcukcvkcwkcxkcykczkdekdjkdkkdmkdokdzkeckeekegkehkerkesketkfikfjkfkkfmkfokfrkgakgbkgdkgekgfkggkghkgikglkgmkgnkgpkgqkgrkgskgtkgukgwkgykhkkhmkhnkhrkhtkhukidkiekilkimkinkiokiqkirkiskitkjekjmkjokjpkkekkgkkhkkikkmkknkkpkkrkkwkkykkzklaklbklckliklkklrklskltkluklvklykmakmckmdkmekmfkmgkmhkmkkmlkmmkmnkmokmpkmqkmrkmskmtkmukmvkmwkmxkmykmzknaknckneknfkngkniknlknoknpknrknuknzkomkpakpekpfkpgkphkpkkplkpmkpnkprkpskptkpwkpykqakrekrokrskrukrwksaksbkscksdkseksgkshksiksjkskkslksmksnksoksrksskstksvksxksykszktcktdktfktgkthktjktkktlktmktnktoktrkttktvktwktzkuakugkumkuskuykuzkvakvckvekvgkvikvnkvukwfkwskyekytkzakzmkzw");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test29060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29060");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "                                   44444444444444ITALIAN4444444444444                                   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                   44444444444444ITALIAN4444444444444                                   " + "'", str1, "                                   44444444444444ITALIAN4444444444444                                   ");
    }

    @Test
    public void test29061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29061");
        java.util.Locale locale1 = java.util.Locale.ITALIAN;
        java.util.Set<java.lang.Character> charSet2 = locale1.getExtensionKeys();
        java.lang.String str3 = locale1.getVariant();
        java.util.Locale locale4 = locale1.stripExtensions();
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.lowerCase("chi069\\U0069\\U0069\\U0069\\U0069\\chin", locale4);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it");
        org.junit.Assert.assertNotNull(charSet2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "it");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chi069\\u0069\\u0069\\u0069\\u0069\\chin" + "'", str5, "chi069\\u0069\\u0069\\u0069\\u0069\\chin");
    }

    @Test
    public void test29062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29062");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("", "                                                                             frn\347is(frnce)(CHINESE(CHINA)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test29063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29063");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("cCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC nailati             ", 499, "                                                           ...                                                ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                           ...                                                                                                           ...                                                                                                           ...                                                                                                           ...                                   cCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC nailati             " + "'", str3, "                                                           ...                                                                                                           ...                                                                                                           ...                                                                                                           ...                                   cCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC nailati             ");
    }

    @Test
    public void test29064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29064");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("\ud55c\uad6d\uc5b4\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n", (int) '\u6cd5', 119);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test29065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29065");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("6400aUa\\\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rzh_CN", 0, 720);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6400aUa\\\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rzh_CN" + "'", str3, "6400aUa\\\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rzh_CN");
    }

    @Test
    public void test29066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29066");
        java.util.Locale locale1 = new java.util.Locale("Franz\366sisch(Frankreich)");
        org.junit.Assert.assertEquals(locale1.toString(), "franz\366sisch(frankreich)");
    }

    @Test
    public void test29067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29067");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb", "_cnFrench (Canada)AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHZ", "4444444fra", 82);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb" + "'", str4, "bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb");
    }

    @Test
    public void test29068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29068");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("Korean (Souti\\u0020iTALIANiTALIANiTALIANiTALIitBBBBBBBBB\\BBBBB Korea)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Korean (Souti\\u0020iTALIANiTALIANiTALIANiTALIitBBBBBBBBB\\BBBBB Korea)" + "'", str1, "Korean (Souti\\u0020iTALIANiTALIANiTALIANiTALIitBBBBBBBBB\\BBBBB Korea)");
    }

    @Test
    public void test29069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29069");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("hi!       allemandtalienischallemanditalian_TALAN_Eng    \\     ADAEAFAGAALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCCKCLCMCNCOCRCUCVCWCXCYCZDED...allemand\\u0034allemandH!allemandtalianallemand\\u0061allemand\\u0023allemandhi!allemandiTALANallemandChinese (China)allemandhi!allemandzh_CNallemandiTALANallemandenallemandtalienisch");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=hi!       allemandtalienischallemanditalian_talan_eng    \\     adaeafagaalamanaoaqarasatauawaxazbabbbdbebfbgbhbbjblbmbnbobqbrbsbtbvbwbybzcacccdcfcgchcckclcmcncocrcucvcwcxcyczded...allemand\\u0034allemandh!allemandtalianallemand\\u0061allemand\\u0023allemandhi!allemanditalanallemandchinese (china)allemandhi!allemandzh_cnallemanditalanallemandenallemandtalienisch");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test29070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29070");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("Italian");
        boolean boolean3 = locale1.equals((java.lang.Object) "cccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "italian");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test29071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29071");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\\', 21);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 21 + "'", int2 == 21);
    }

    @Test
    public void test29072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29072");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("                                                                  \\U0069HHHHHHHHHH", 62, 395);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "    \\U0069HHHHHHHHHH" + "'", str3, "    \\U0069HHHHHHHHHH");
    }

    @Test
    public void test29073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29073");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("\\_ITALIAN_English", "                                                                                                                                                                                                                         \\     ", 29);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test29074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29074");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("NI         d00u\\00u\\ed00u\\00u\\ed00u\\G        ES", 2);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ES" + "'", str2, "ES");
    }

    @Test
    public void test29075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29075");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("...alamanaoaqarasatauawaxazbabbbdbebfbgbhbibjblbmbnbobqbrbsbtbvbwbybzcacccdcfcgchcickclcmcncocrcucvcwcxc......alamaniiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiitalian_italian_englishiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii", (int) 'b', 'R');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...alamanaoaqarasatauawaxazbabbbdbebfbgbhbibjblbmbnbobqbrbsbtbvbwbybzcacccdcfcgchcickclcmcncocrcucvcwcxc......alamaniiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiitalian_italian_englishiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii" + "'", str3, "...alamanaoaqarasatauawaxazbabbbdbebfbgbhbibjblbmbnbobqbrbsbtbvbwbybzcacccdcfcgchcickclcmcncocrcucvcwcxc......alamaniiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiitalian_italian_englishiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
    }

    @Test
    public void test29076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29076");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("nglish ...hi!allemanditalienischallemanditalian_italian_englishallemandhi!allemandhi!allemandadaeafagaialamanaoaqarasatauawaxazbabbbdbebfbgbhbibjblbmbnbobqbrbsbtbvbwbybzcacccdcfcgchcickclcmcncocrcucvcwcxcyczded...allemand\\u0034allemandhi!allemanditalianallemand\\u0061allemand\\u0023allemandhi!allemanditalianallemandchinese(china)allemandhi!allemandzh_cnallemanditalianallemandenallemanditalienischhi!allemanditalienischallemanditalian_italian_englishallemandhi!allemandhi!allemandadaeafagaialamanaoa", "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz\\XTALXAN_ITALIAN_ENGLXSHzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz", 19);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test29077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29077");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("         ITALIAN_ITALIAN_ENGLISH         ITALIAN_!IHITTAIT_ITALIAN_EGAISHeAGAASH         ITALIAN_ITALIAN_ENGLISH         ITALIAN_!IHITTAIT_ITALIAN_EGAISHeAGAASH         ITALIAN_ITALIAN_ENGLISH         ITALIAN_!IHITTAIT_ITALIAN_EGAISHeAGAASH         ITALIAN_ITALIAN_ENGLISH         ITALIAN_!IHITTAIT_ITALIAN_EGAISHeAGAASH         ITALIAN_ITALIAN_ENGLISH         ITALIAN_!IHITTAIT_ITALIAN_EGAISHeAGAASH         ITALIAN_ITALIAN_ENGLISH         ITALIAN_!IHITTAIT_ITALIAN_EGAISH", "aaaaaaaaaaaaaaaaaaaaaaaaFranz\366sisch (Frankreich)aaaaaaaaaaaaaa...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test29078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29078");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.lang.Class<?> wildcardClass4 = builder0.getClass();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test29079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29079");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("italian (italian,english                                                                    ", "\\U0034\\U00 HCSTUD \\U0034");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test29080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29080");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("adaeafagaialamanaoaqarasatauawaxazbabbbdbebfbgbhbibjblbmbnbobqbrbsbtbvbwbybzcacccdcfcgchcickclcmcncocrcucvcwcxcyczdedf...", ")ylatI( nailatI");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test29081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29081");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("4444ALLEMAND 4444", "2", "italianE(italian,englcor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444ALLEMAND 4444" + "'", str3, "4444ALLEMAND 4444");
    }

    @Test
    public void test29082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29082");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder6 = builder4.setLanguageTag("HCSTUED");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder6.addUnicodeLocaleAttribute("                                                                                         italian (italian,e...                                                                                          ");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute:                                                                                          italian (italian,e...                                                                                           [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "fran\347ais (Canada)" + "'", str3, "fran\347ais (Canada)");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test29083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29083");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Locale locale1 = java.util.Locale.ITALIAN;
        java.lang.String str3 = locale1.getExtension('h');
        java.lang.String str4 = locale0.getDisplayScript(locale1);
        java.util.Locale locale5 = locale0.stripExtensions();
        boolean boolean6 = locale0.hasExtensions();
        java.util.Locale locale7 = locale0.stripExtensions();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "fr_FR");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr_FR");
    }

    @Test
    public void test29084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29084");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("f(KOREAN)", "hfffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test29085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29085");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("german (germany)IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII", 4);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test29086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29086");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("U!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IUzhzhzhzhzhzhzhzhzhzhFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAzhzhzhzhzhzhzhzhzhzhUFRZ\326CZ(FRKREC)Ucinese (Cina)\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hhU         ITALIAN_ITALIAN_ENGLISH         ITALIAN_!IHITTAIT_ITALIAN_EGAISHU                                      ...", "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444cinese (Cina)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "U!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IUzhzhzhzhzhzhzhzhzhzhFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAzhzhzhzhzhzhzhzhzhzhUFRZ\326CZ(FRKREC)Ucinese (Cina)\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hhU         ITALIAN_ITALIAN_ENGLISH         ITALIAN_!IHITTAIT_ITALIAN_EGAISHU                                      ..." + "'", str2, "U!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IUzhzhzhzhzhzhzhzhzhzhFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAzhzhzhzhzhzhzhzhzhzhUFRZ\326CZ(FRKREC)Ucinese (Cina)\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hhU         ITALIAN_ITALIAN_ENGLISH         ITALIAN_!IHITTAIT_ITALIAN_EGAISHU                                      ...");
    }

    @Test
    public void test29087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29087");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("fr");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList3 = java.util.Locale.LanguageRange.parse("en");
        java.util.Locale.Builder builder5 = new java.util.Locale.Builder();
        java.util.Locale locale6 = builder5.build();
        java.util.Locale locale8 = java.util.Locale.forLanguageTag("Italian");
        java.lang.String str9 = locale6.getDisplayLanguage(locale8);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.upperCase("", locale8);
        java.lang.String str11 = locale8.getScript();
        java.util.Set<java.lang.String> strSet12 = locale8.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.String> strSet13 = locale8.getUnicodeLocaleKeys();
        java.util.List<java.lang.String> strList14 = java.util.Locale.filterTags(languageRangeList3, (java.util.Collection<java.lang.String>) strSet13);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap15 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList16 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList3, strMap15);
        java.util.Locale locale17 = java.util.Locale.ITALIAN;
        java.lang.String str18 = locale17.getDisplayLanguage();
        java.util.Locale locale19 = locale17.stripExtensions();
        java.lang.String str20 = locale17.getLanguage();
        java.util.Set<java.lang.String> strSet21 = locale17.getUnicodeLocaleKeys();
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet21, "\\u0020iTALIANiTALIANiTALIANiTALI\\u0020iTALIANiTALIANiTALIANiTAL");
        java.lang.String str24 = java.util.Locale.lookupTag(languageRangeList3, (java.util.Collection<java.lang.String>) strSet21);
        java.util.Locale.LanguageRange[] languageRangeArray25 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList26 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList26, languageRangeArray25);
        java.lang.String[] strArray30 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList31 = new java.util.ArrayList<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList31, strArray30);
        java.util.Locale.FilteringMode filteringMode33 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList34 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList26, (java.util.Collection<java.lang.String>) strList31, filteringMode33);
        java.util.Locale.LanguageRange[] languageRangeArray35 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList36 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList36, languageRangeArray35);
        java.lang.String[] strArray40 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList41 = new java.util.ArrayList<java.lang.String>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList41, strArray40);
        java.util.Locale.FilteringMode filteringMode43 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList44 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList36, (java.util.Collection<java.lang.String>) strList41, filteringMode43);
        java.lang.String[] strArray46 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList47 = new java.util.ArrayList<java.lang.String>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList47, strArray46);
        java.util.List<java.lang.String> strList49 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList36, (java.util.Collection<java.lang.String>) strList47);
        java.lang.String str50 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList26, (java.util.Collection<java.lang.String>) strList47);
        java.util.Locale locale51 = java.util.Locale.ITALIAN;
        java.util.Set<java.lang.Character> charSet52 = locale51.getExtensionKeys();
        java.util.Locale locale54 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale56 = new java.util.Locale("");
        java.util.Locale locale57 = java.util.Locale.FRANCE;
        java.util.Locale locale58 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str59 = locale57.getDisplayScript(locale58);
        java.util.Locale locale60 = java.util.Locale.ENGLISH;
        java.lang.String str61 = locale60.getDisplayCountry();
        java.util.Locale locale62 = java.util.Locale.PRC;
        java.util.Locale locale63 = java.util.Locale.US;
        java.util.Locale locale64 = java.util.Locale.FRANCE;
        java.util.Locale locale65 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str66 = locale64.getDisplayScript(locale65);
        java.util.Locale locale67 = java.util.Locale.ITALIAN;
        java.util.Set<java.lang.Character> charSet68 = locale67.getExtensionKeys();
        java.util.Locale locale69 = java.util.Locale.ITALIAN;
        java.lang.String str70 = locale69.getDisplayLanguage();
        java.util.Locale locale71 = java.util.Locale.FRENCH;
        java.util.Locale locale72 = java.util.Locale.US;
        java.util.Locale locale73 = java.util.Locale.ITALIAN;
        java.lang.String str74 = locale73.getDisplayLanguage();
        java.util.Locale locale75 = java.util.Locale.FRANCE;
        java.util.Locale[] localeArray76 = new java.util.Locale[] { locale51, locale54, locale56, locale57, locale60, locale62, locale63, locale65, locale67, locale69, locale71, locale72, locale73, locale75 };
        java.util.ArrayList<java.util.Locale> localeList77 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList77, localeArray76);
        java.util.Locale locale79 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList26, (java.util.Collection<java.util.Locale>) localeList77);
        java.util.List<java.util.Locale> localeList80 = java.util.Locale.filter(languageRangeList3, (java.util.Collection<java.util.Locale>) localeList77);
        java.util.Locale locale81 = java.util.Locale.lookup(languageRangeList1, (java.util.Collection<java.util.Locale>) localeList77);
        java.util.Collection<java.util.Locale> localeCollection82 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale> localeList83 = java.util.Locale.filter(languageRangeList1, localeCollection82);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(languageRangeList3);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "italian");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(languageRangeList16);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "it");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "italien" + "'", str18, "italien");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "it");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "it" + "'", str20, "it");
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(languageRangeArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + filteringMode33 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode33.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList34);
        org.junit.Assert.assertNotNull(languageRangeArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + filteringMode43 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode43.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList44);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(strList49);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "it");
        org.junit.Assert.assertNotNull(charSet52);
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "");
        org.junit.Assert.assertEquals(locale56.toString(), "");
        org.junit.Assert.assertNotNull(locale57);
        org.junit.Assert.assertEquals(locale57.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertNotNull(locale60);
        org.junit.Assert.assertEquals(locale60.toString(), "en");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertNotNull(locale62);
        org.junit.Assert.assertEquals(locale62.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale64);
        org.junit.Assert.assertEquals(locale64.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale65);
        org.junit.Assert.assertEquals(locale65.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertNotNull(locale67);
        org.junit.Assert.assertEquals(locale67.toString(), "it");
        org.junit.Assert.assertNotNull(charSet68);
        org.junit.Assert.assertNotNull(locale69);
        org.junit.Assert.assertEquals(locale69.toString(), "it");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "italien" + "'", str70, "italien");
        org.junit.Assert.assertNotNull(locale71);
        org.junit.Assert.assertEquals(locale71.toString(), "fr");
        org.junit.Assert.assertNotNull(locale72);
        org.junit.Assert.assertEquals(locale72.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale73);
        org.junit.Assert.assertEquals(locale73.toString(), "it");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "italien" + "'", str74, "italien");
        org.junit.Assert.assertNotNull(locale75);
        org.junit.Assert.assertEquals(locale75.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(localeArray76);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNull(locale79);
        org.junit.Assert.assertNotNull(localeList80);
        org.junit.Assert.assertNotNull(locale81);
        org.junit.Assert.assertEquals(locale81.toString(), "fr");
    }

    @Test
    public void test29088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29088");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("\\u004e                                                          ", "NC_hz");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test29089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29089");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r                                                                                              Deutsch");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r                                                                                              Deutsch" + "'", str1, "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r                                                                                              Deutsch");
    }

    @Test
    public void test29090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29090");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("ad4ae4af4ag4ai4al4am4an4ao4aq4ar4as4at4au4aw4ax4az4ba4bb4bd4be4bf4bg4bh4bi4bj4bl4bm4bn4bo4bq4br4bs4bt4bv4bw4by4bz4ca4cc4cd4cf4cg4ch4ci4ck4cl4cm4cn4co4cr4cu4cv4cw4cx4cy4cz4de4dj4dk4dm4do4dz4ec4ee4eg4eh4er4es4et4fi4fj4fk4fm4fo4fr4ga4gb4gd4ge4gf4gg4gh4gi4gl4gm4gn4gp4gq4gr4gs4gt4gu4gw4gy4hk4hm4hn4hr4ht4hu4id4ie4il4im4in4io4iq4ir4is4it4je4jm4jo4jp4ke4kg4kh4ki4km4kn4kp4kr4kw4ky4kz4la4lb4lc4li4lk4lr4ls4lt4lu4lv4ly4ma4mc4md4me4mf4mg4mh4mk4ml4mm4mn4mo4mp4mq4mr4ms4mt4mu4mv4mw4mx4my4mz4na4nc4ne4nf4ng4ni4nl4no4np4nr4nu4nz4om4pa4pe4pf4pg4ph4pk4pl4pm4pn4pr4ps4pt4pw4py4qa4re4ro4rs4ru4rw4sa4sb4sc4sd4se4sg4sh4si4sj4sk4sl4sm4sn4so4sr4ss4st4sv4sx4sy4sz4tc4td4tf4tg4th4tj4tk4tl4tm4tn4to4tr4tt4tv4tw4tz4ua4ug4um4us4uy4uz4va4vc4ve4vg4vi4vn4vu4wf4ws4ye4yt4za4zm4zw", "\\u0067", "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx\\u0068 !ih !ih !ih !ih !ih !ih !ih !ih !ih");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ad4ae4af4ag4ai4al4am4an4ao4aq4ar4as4at4au4aw4ax4az4ba4bb4bd4be4bf4bg4bh4bi4bj4bl4bm4bn4bo4bq4br4bs4bt4bv4bw4by4bz4ca4cc4cd4cf4cg4ch4ci4ck4cl4cm4cn4co4cr4cu4cv4cw4cx4cy4cz4de4dj4dk4dm4do4dz4ec4ee4eg4eh4er4es4et4fi4fj4fk4fm4fo4fr4ga4gb4gd4ge4gf4gg4gh4gi4gl4gm4gn4gp4gq4gr4gs4gt4gu4gw4gy4hk4hm4hn4hr4ht4hu4id4ie4il4im4in4io4iq4ir4is4it4je4jm4jo4jp4ke4kg4kh4ki4km4kn4kp4kr4kw4ky4kz4la4lb4lc4li4lk4lr4ls4lt4lu4lv4ly4ma4mc4md4me4mf4mg4mh4mk4ml4mm4mn4mo4mp4mq4mr4ms4mt4mu4mv4mw4mx4my4mz4na4nc4ne4nf4ng4ni4nl4no4np4nr4nu4nz4om4pa4pe4pf4pg4ph4pk4pl4pm4pn4pr4ps4pt4pw4py4qa4re4ro4rs4ru4rw4sa4sb4sc4sd4se4sg4sh4si4sj4sk4sl4sm4sn4so4sr4ss4st4sv4sx4sy4sz4tc4td4tf4tg4th4tj4tk4tl4tm4tn4to4tr4tt4tv4tw4tz4ua4ug4um4us4uy4uz4va4vc4ve4vg4vi4vn4vu4wf4ws4ye4yt4za4zm4zw" + "'", str3, "ad4ae4af4ag4ai4al4am4an4ao4aq4ar4as4at4au4aw4ax4az4ba4bb4bd4be4bf4bg4bh4bi4bj4bl4bm4bn4bo4bq4br4bs4bt4bv4bw4by4bz4ca4cc4cd4cf4cg4ch4ci4ck4cl4cm4cn4co4cr4cu4cv4cw4cx4cy4cz4de4dj4dk4dm4do4dz4ec4ee4eg4eh4er4es4et4fi4fj4fk4fm4fo4fr4ga4gb4gd4ge4gf4gg4gh4gi4gl4gm4gn4gp4gq4gr4gs4gt4gu4gw4gy4hk4hm4hn4hr4ht4hu4id4ie4il4im4in4io4iq4ir4is4it4je4jm4jo4jp4ke4kg4kh4ki4km4kn4kp4kr4kw4ky4kz4la4lb4lc4li4lk4lr4ls4lt4lu4lv4ly4ma4mc4md4me4mf4mg4mh4mk4ml4mm4mn4mo4mp4mq4mr4ms4mt4mu4mv4mw4mx4my4mz4na4nc4ne4nf4ng4ni4nl4no4np4nr4nu4nz4om4pa4pe4pf4pg4ph4pk4pl4pm4pn4pr4ps4pt4pw4py4qa4re4ro4rs4ru4rw4sa4sb4sc4sd4se4sg4sh4si4sj4sk4sl4sm4sn4so4sr4ss4st4sv4sx4sy4sz4tc4td4tf4tg4th4tj4tk4tl4tm4tn4to4tr4tt4tv4tw4tz4ua4ug4um4us4uy4uz4va4vc4ve4vg4vi4vn4vu4wf4ws4ye4yt4za4zm4zw");
    }

    @Test
    public void test29091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29091");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("Italian");
        java.util.Locale.Builder builder4 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder0.clear();
        java.util.Locale.Category category6 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale7 = java.util.Locale.getDefault(category6);
        java.util.Locale locale8 = java.util.Locale.FRANCE;
        java.util.Locale locale9 = java.util.Locale.ITALIAN;
        java.lang.String str11 = locale9.getExtension('h');
        java.lang.String str12 = locale8.getDisplayScript(locale9);
        java.lang.String str13 = locale8.getISO3Country();
        java.util.Locale locale14 = java.util.Locale.GERMAN;
        java.util.Locale.setDefault(locale14);
        java.lang.String str16 = locale8.getDisplayName(locale14);
        java.lang.String str17 = locale8.getScript();
        java.util.Locale.setDefault(category6, locale8);
        java.util.Set<java.lang.String> strSet19 = locale8.getUnicodeLocaleKeys();
        java.lang.String str20 = locale8.getCountry();
        java.util.Locale locale22 = new java.util.Locale("en");
        boolean boolean23 = locale22.hasExtensions();
        java.util.Set<java.lang.String> strSet24 = locale22.getUnicodeLocaleKeys();
        java.util.Locale locale25 = java.util.Locale.ITALIAN;
        java.lang.String str26 = locale25.getDisplayLanguage();
        java.util.Locale locale27 = locale25.stripExtensions();
        java.lang.String str28 = locale27.getVariant();
        java.lang.String str29 = locale22.getDisplayLanguage(locale27);
        java.util.Locale.setDefault(locale27);
        java.lang.String str31 = locale8.getDisplayLanguage(locale27);
        java.util.Locale locale32 = java.util.Locale.FRENCH;
        java.lang.String str33 = locale32.getDisplayName();
        java.lang.String str35 = locale32.getExtension('C');
        java.lang.String str36 = locale32.getVariant();
        java.lang.String str37 = locale27.getDisplayScript(locale32);
        java.lang.String str38 = locale27.getDisplayScript();
        java.util.Locale.Builder builder39 = builder0.setLocale(locale27);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder42 = builder39.setExtension('N', "                             kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkEDkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkEDkk");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension value:                              kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkEDkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkEDkk [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + category6 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category6.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "it");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "FRA" + "'", str13, "FRA");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "de");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Franz\366sisch (Frankreich)" + "'", str16, "Franz\366sisch (Frankreich)");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "FR" + "'", str20, "FR");
        org.junit.Assert.assertEquals(locale22.toString(), "en");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "it");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "italien" + "'", str26, "italien");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "it");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "inglese" + "'", str29, "inglese");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "francese" + "'", str31, "francese");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "francese" + "'", str33, "francese");
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(builder39);
    }

    @Test
    public void test29092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29092");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("deutsch", "Deutsch");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, 'x', (int) 'e', 11);
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("HI!", "iTALIAN", (int) '#');
        java.lang.String[] strArray17 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("English", "Italian");
        java.lang.String[] strArray21 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!", "", (int) (short) 10);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("", strArray17, strArray21);
        java.lang.String str26 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray21, ' ', (int) (short) 0, (int) (byte) -1);
        java.lang.String str27 = org.apache.commons.lang3.StringUtils.replaceEach("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzitalian (italian,english", strArray13, strArray21);
        int int28 = org.apache.commons.lang3.StringUtils.indexOfAny("Ital", strArray21);
        java.lang.String str29 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray21);
        java.lang.String str31 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray21, "                                                                                              deutsch (\\)");
        java.lang.String str32 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("\ub3c5\uc77c\uc5b4Italian    italian    italian    italian    italian    italian    italian    italian    italian    italian   ", strArray3, strArray21);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzitalian (italian,english" + "'", str27, "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzitalian (italian,english");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\ub3c5\uc77c\uc5b4Italian    italian    italian    italian    italian    italian    italian    italian    italian    italian   " + "'", str32, "\ub3c5\uc77c\uc5b4Italian    italian    italian    italian    italian    italian    italian    italian    italian    italian   ");
    }

    @Test
    public void test29093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29093");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("\\u0020");
        java.lang.String str2 = locale1.getDisplayScript();
        java.lang.String str3 = locale1.getDisplayScript();
        java.util.Locale locale4 = locale1.stripExtensions();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
    }

    @Test
    public void test29094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29094");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("Rnz\366sisch(Knd                                                                                                                                                                                                               ", (int) 'R');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                  " + "'", str2, "                                                                                  ");
    }

    @Test
    public void test29095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29095");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("fr-CAfr-CAfr-C8600u\\fr-CAfr-CAfr-CAfr-CAfr-CAfr-C8600u\\fr-CAfr-CAfr-CAfr-CAfr-FranzosischFranz\366sisch (Kanada)(Frankreich)fr-CAfr-CAfr-C8600u\\fr-CAfr-CAfr-CAfr-CAfr-CAfr-C8600u\\fr-CAfr-CAfr-CAfr-CAfr-C", 6);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CAfr-C" + "'", str2, "CAfr-C");
    }

    @Test
    public void test29096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29096");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "Fgence");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test29097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29097");
        java.util.Locale locale1 = new java.util.Locale("2cinese (Cina...");
        java.util.Locale.setDefault(locale1);
        boolean boolean3 = locale1.hasExtensions();
        org.junit.Assert.assertEquals(locale1.toString(), "2cinese (cina...");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test29098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29098");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("talian\\u0032talian", 'A');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test29099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29099");
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
        java.util.Locale locale13 = new java.util.Locale("CA");
        java.lang.String str14 = locale13.getISO3Country();
        java.util.Locale.setDefault(category0, locale13);
        java.util.Locale.setDefault(locale13);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "2cinese (cina...");
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
        org.junit.Assert.assertEquals(locale13.toString(), "ca");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test29100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29100");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("HI!ALLEMANDITALIENISCHALLEMANDITALIAN_ITALIAN_ENGLISHALLEMANDHI!ALLEMANDHI!ALLEMANDADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...ALLEMAND\\U0034ALLEMANDHI!ALLEMANDITALIANALLEMAND\\U0061ALLEMAND\\U0023ALLEMANDHI!ALLEMANDITALIANALLEMANDCHINESE(CHINA)ALLEMANDHI!ALLEMANDZH_CNALLEMANDITALIANALLEMANDENALLEMANDITALIENISCH", "                                ESELGNI                               ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test29101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29101");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                                    k            ", "FRANC", "\\u005YYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYY");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                    k            " + "'", str3, "                                                    k            ");
    }

    @Test
    public void test29102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29102");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("Italia                                                               ", "        ESELGNI         d00u\\00u\\ed00u\\00u\\ed00u\\");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Italia                                                               " + "'", str2, "Italia                                                               ");
    }

    @Test
    public void test29103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29103");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("\\u005", (double) '\n');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=10.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test29104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29104");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("NAILATI                     ", "44444444444444444444444444444444!IHAAAAAAAAAAAAAAAAAAAAAAAAFRANZOSISCH (FRANKREICH)AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NAILATI                     " + "'", str2, "NAILATI                     ");
    }

    @Test
    public void test29105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29105");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("\\CCglisch", "EEEEEEEEEE       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\CCglisch" + "'", str2, "\\CCglisch");
    }

    @Test
    public void test29106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29106");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "UD                                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test29107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29107");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("aNCHc", (int) ' ', 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test29108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29108");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\u0030\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test29109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29109");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                              \\     ", "");
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Deutsch", 'i');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEach("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444en", strArray5, strArray8);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray8);
        int int11 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("ixii", strArray8);
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.stripAll(strArray8, "Chinese");
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.stripAll(strArray13);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny("000000000000000000000000000000000000000000000000000000000000000CCCC\\CCCCHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH", strArray14);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray14);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444en" + "'", str9, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444en");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Deutsch" + "'", str10, "Deutsch");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test29110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29110");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN                                                                     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test29111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29111");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "AzhzhzhzhzhzhzhzhzhzhADAAEAAFAAGAAIAALAAMAANAAOAAQAARAASAATAAUAAWAAXAAZABAABBhcstueDNABOABQABRABSABTABVABWABYABZACAACCACDACFACGACHACIACKACLACMACNACOACRACUACVACWACXACYACZADEADJADKADMADOADZAECAEEAEGAEHAERAESAETAFIAFJAFKAFMAFOAFRAGAAGBAGDAGEAGFAGGAGHAGIAGLAGMAGNAGPAGQAGRAGSAGTAGUAGWAGYAHKAHMAHNAHRAHTAHUAIDAIEAILAIMAINAIOAIQAIRAISAITAJEAJMAJOAJPAKEAKGAKHAKIAKMAKNAKPAKRAKWAKYAKZALAALBALCALIALKALRALSALTALUALVALYAMAAMCAMDAMEAMFAMGAMHAMKAMLAMMAMNAMOAMPAMQAMRAMSAMTAMUAMVAMWAMXAMYAMZANAANCANEANFANGANIANLANOANPANRANUANZAOMAPAAPEAPFAPGAPHAPKAPLAPMAPNAPRAPSAPTAPWAPYAQAAREAROARSARUARWASAASBASCASDASEASGASHASIASJASKASLASMASNASOASRASSASTASVASXASYASZATCATDATFATGATHATJATKATLATMATNATOATRATTATVATWATZAUAAUGAUMAUSAUYAUZAVAAVCAVEAVGAVIAVNAVUAWFAWSAYEAYTAZAAZMAZW");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test29112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29112");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("                                             DE_DE                                              ", "Italia", 194);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                             DE_DE                                              " + "'", str3, "                                             DE_DE                                              ");
    }

    @Test
    public void test29113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29113");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        java.util.Locale locale6 = java.util.Locale.ITALIAN;
        java.lang.String str7 = locale6.getDisplayLanguage();
        java.util.Locale locale8 = locale6.stripExtensions();
        java.lang.String str9 = locale6.getLanguage();
        java.util.Set<java.lang.String> strSet10 = locale6.getUnicodeLocaleKeys();
        java.util.Locale locale12 = java.util.Locale.FRANCE;
        java.util.Locale locale13 = java.util.Locale.ITALIAN;
        java.lang.String str15 = locale13.getExtension('h');
        java.lang.String str16 = locale12.getDisplayScript(locale13);
        java.util.Locale locale20 = new java.util.Locale("HI!       ", "\\U0020", "Italienisch#########################################################################################");
        java.lang.String str21 = locale12.getDisplayCountry(locale20);
        java.lang.String str22 = locale20.getDisplayName();
        java.lang.String str24 = locale20.getExtension('i');
        java.lang.String str25 = org.apache.commons.lang3.StringUtils.upperCase("iTALIAN                                                                 ", locale20);
        java.lang.String str26 = locale6.getDisplayVariant(locale20);
        java.util.Locale.Builder builder27 = builder4.setLocale(locale6);
        java.util.Locale locale28 = builder27.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder30 = builder27.setLanguageTag("");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Empty subtag [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "it");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "itali\340" + "'", str7, "itali\340");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "it");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "it" + "'", str9, "it");
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "it");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals(locale20.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "France" + "'", str21, "France");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!        (\\U0020,Italienisch#########################################################################################)" + "'", str22, "hi!        (\\U0020,Italienisch#########################################################################################)");
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "ITALIAN                                                                 " + "'", str25, "ITALIAN                                                                 ");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "it");
    }

    @Test
    public void test29114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29114");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("englisch", "frfrfrfrfrfrfrfrfrfrfrfrfde_defrfrfrfrfrfrfrfrfrfrfrfrfr###############################################frfrfrfrfrfrfrfrfrfrfrfrfde_defrfrfrfrfrfrfrfrfrfrfrfrfr###############################################frfrfrfrfrfrfrfrfrfrfrfrfde_defrfrfrfrfrfrfrfrfrfrfrfrfr###############################################frfrfrfrfrfrfrfrfrfrfrfrfde_defrfrfrfrfrfrfrfrfrfrfrfrfr###############################################frfrfrfrfrfrfrfrfrfrfrfrfde_defrfrfrfrfrfrfrfrfrfrfrfrfr###############################################frfrfrfrfrfrfrfrfrfrfrfrfde_defrfrfrfrfrfrfrfrfrtalian\\u002");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "englisch" + "'", str2, "englisch");
    }

    @Test
    public void test29115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29115");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                                    frankreich", 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 67 + "'", int2 == 67);
    }

    @Test
    public void test29116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29116");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiitalian_italian_englishiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii              ", "canada", 200, 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "canada" + "'", str4, "canada");
    }

    @Test
    public void test29117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29117");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("                                                                        ");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test29118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29118");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("...........................................................................................................................................................................................................................................................................................................................................................................eselgni", "A");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...........................................................................................................................................................................................................................................................................................................................................................................eselgni" + "'", str2, "...........................................................................................................................................................................................................................................................................................................................................................................eselgni");
    }

    @Test
    public void test29119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29119");
        java.util.Locale locale1 = new java.util.Locale("4300U\\                                             DUTSCH                                            ");
        java.util.Locale.Category category2 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale3 = java.util.Locale.getDefault(category2);
        java.util.Locale locale4 = java.util.Locale.FRANCE;
        java.util.Locale locale5 = java.util.Locale.ITALIAN;
        java.lang.String str7 = locale5.getExtension('h');
        java.lang.String str8 = locale4.getDisplayScript(locale5);
        java.lang.String str9 = locale4.getISO3Country();
        java.util.Locale locale10 = java.util.Locale.GERMAN;
        java.util.Locale.setDefault(locale10);
        java.lang.String str12 = locale4.getDisplayName(locale10);
        java.lang.String str13 = locale4.getScript();
        java.util.Locale.setDefault(category2, locale4);
        java.util.Set<java.lang.String> strSet15 = locale4.getUnicodeLocaleKeys();
        java.lang.String str16 = locale4.getCountry();
        java.util.Locale locale18 = new java.util.Locale("en");
        boolean boolean19 = locale18.hasExtensions();
        java.util.Set<java.lang.String> strSet20 = locale18.getUnicodeLocaleKeys();
        java.util.Locale locale21 = java.util.Locale.ITALIAN;
        java.lang.String str22 = locale21.getDisplayLanguage();
        java.util.Locale locale23 = locale21.stripExtensions();
        java.lang.String str24 = locale23.getVariant();
        java.lang.String str25 = locale18.getDisplayLanguage(locale23);
        java.util.Locale.setDefault(locale23);
        java.lang.String str27 = locale4.getDisplayLanguage(locale23);
        java.util.Locale locale28 = java.util.Locale.FRENCH;
        java.lang.String str29 = locale28.getDisplayName();
        java.lang.String str31 = locale28.getExtension('C');
        java.lang.String str32 = locale28.getVariant();
        java.lang.String str33 = locale23.getDisplayScript(locale28);
        java.lang.String str34 = locale1.getDisplayLanguage(locale23);
        java.util.Locale locale35 = java.util.Locale.FRANCE;
        java.util.Locale locale36 = java.util.Locale.ITALIAN;
        java.lang.String str38 = locale36.getExtension('h');
        java.lang.String str39 = locale35.getDisplayScript(locale36);
        java.lang.String str40 = locale35.getISO3Country();
        java.util.Locale locale41 = java.util.Locale.GERMAN;
        java.util.Locale.setDefault(locale41);
        java.lang.String str43 = locale35.getDisplayName(locale41);
        java.lang.String str44 = locale35.getScript();
        java.lang.String str45 = locale35.getLanguage();
        java.util.Locale locale46 = locale35.stripExtensions();
        java.lang.String str47 = locale23.getDisplayScript(locale46);
        org.junit.Assert.assertEquals(locale1.toString(), "4300u\\                                             dutsch                                            ");
        org.junit.Assert.assertTrue("'" + category2 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category2.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ca");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "it");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "FRA" + "'", str9, "FRA");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "de");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Franz\366sisch (Frankreich)" + "'", str12, "Franz\366sisch (Frankreich)");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "FR" + "'", str16, "FR");
        org.junit.Assert.assertEquals(locale18.toString(), "en");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "it");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "italien" + "'", str22, "italien");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "it");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "inglese" + "'", str25, "inglese");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "francese" + "'", str27, "francese");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "francese" + "'", str29, "francese");
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "4300u\\                                             dutsch                                            " + "'", str34, "4300u\\                                             dutsch                                            ");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "it");
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "FRA" + "'", str40, "FRA");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "de");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Franz\366sisch (Frankreich)" + "'", str43, "Franz\366sisch (Frankreich)");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "fr" + "'", str45, "fr");
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
    }

    @Test
    public void test29120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29120");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("talian", "GENCE", "cinese) )()C)ina)))\\)u)0069)h)...", 19);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "talian" + "'", str4, "talian");
    }

    @Test
    public void test29121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29121");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("HhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsine...", "     ", (int) 'G');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test29122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29122");
        java.util.Locale locale2 = new java.util.Locale("                                             hcstued", "tttttt\\u0049");
        java.util.Locale locale3 = locale2.stripExtensions();
        org.junit.Assert.assertEquals(locale2.toString(), "                                             hcstued_TTTTTT\\U0049");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "                                             hcstued_TTTTTT\\U0049");
    }

    @Test
    public void test29123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29123");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("GBR");
        double double2 = languageRange1.getWeight();
        java.util.Locale locale5 = new java.util.Locale("\\u002", "royaume-uni");
        java.lang.String str6 = locale5.getDisplayLanguage();
        boolean boolean7 = languageRange1.equals((java.lang.Object) locale5);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertEquals(locale5.toString(), "\\u002_ROYAUME-UNI");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\u002" + "'", str6, "\\u002");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test29124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29124");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("Yhi!", 98, "deutsch");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "deutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeuYhi!" + "'", str3, "deutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeuYhi!");
    }

    @Test
    public void test29125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29125");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("i\\u0020iTALIANiTALIANiTALIANiTALIit    \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\", "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx\\u0068 !ih !ih !ih !ih !ih !ih !ih !ih !ih", 82);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test29126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29126");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("\\u0020italianitalianitalianitali\\u0020italianitalianitalianital (ALLEMAND)");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "BFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEKoreanADA", (int) '5', 99);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test29127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29127");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\u52a0\u62ff\u5927eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee", '2');
// flaky:         org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'e' + "'", char2 == 'e');
    }

    @Test
    public void test29128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29128");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("\\u0034\\u0034\\u0034\\u0034\\u003", "Fr...", "9hhhhhhhhhh9hhhhhhhhhh");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test29129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29129");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("Eagaas8", "Germany");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test29130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29130");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              fr_C");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 498 + "'", int1 == 498);
    }

    @Test
    public void test29131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29131");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "                                                                        HSAAGAekkkkkkkkkkkkkkkkk");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                        HSAAGAekkkkkkkkkkkkkkkkk" + "'", str1, "                                                                        HSAAGAekkkkkkkkkkkkkkkkk");
    }

    @Test
    public void test29132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29132");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("", "", "francesefrancesefrancesefr\\u007");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test29133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29133");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("hi!allemandItalienischallemanditalian_ITALIAN_EnglishallemandHI!allemandhi!allemandADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...allemand\\u0034allemandHI!allemandItalianallemand\\u0061allemand\\u0023allemandhi!allemandiTALIANallemandChinese(China)allemandhi!allemandzh_CNallemandiTALIANallemandenallemandItalienisch");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test29134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29134");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "ZHO");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zHO" + "'", str1, "zHO");
    }

    @Test
    public void test29135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29135");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("fRENCH (fRANCE)");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test29136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29136");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("EcanadaGcanadacanadaSH                                                                                                  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EcanadaGcanadacanadaSH" + "'", str1, "EcanadaGcanadacanadaSH");
    }

    @Test
    public void test29137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29137");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("a700u\\  ", 20, 'Y');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "YYYYYYa700u\\  YYYYYY" + "'", str3, "YYYYYYa700u\\  YYYYYY");
    }

    @Test
    public void test29138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29138");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("...                               ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "..." + "'", str1, "...");
    }

    @Test
    public void test29139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29139");
        java.util.Locale locale3 = new java.util.Locale("e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               ", "HI!       G", "ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZhsxlgne_n");
    }

    @Test
    public void test29140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29140");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("Italian");
        java.util.Locale locale4 = java.util.Locale.PRC;
        java.lang.String str5 = locale4.getDisplayName();
        java.util.Locale.Builder builder6 = builder0.setLocale(locale4);
        java.util.Locale.Builder builder7 = builder6.clear();
        java.util.Locale.Builder builder8 = builder7.clearExtensions();
        java.util.Locale.Builder builder10 = builder7.setLanguageTag("anglais");
        java.util.Locale.Builder builder11 = builder10.clear();
        java.util.Locale.Builder builder12 = builder10.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder15 = builder10.setExtension('!', "                                             \\u0066                                              ");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key: ! [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Chinesisch (China)" + "'", str5, "Chinesisch (China)");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test29141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29141");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("hi!        (\\U0020,Italienisch#####Franzosisch (Kanada)##############################################################################", '#');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test29142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29142");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAACAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test29143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29143");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("000000000000000000000000000000000000000000000000000000000000000CCCC\\CCCC000000000000000000000000000000000000000000000000000000000000000CCCC\\CCCC0000000000000000000000000000000000000000000000000000000italiano000000000000000000000000000000000000000000000000000000000000000CCCC\\CCCC000000000000000000000000000000000000000000000000000000000000000CCCC\\CCCC0000000000000000000000000000000000000000000000000000000", 'b');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test29144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29144");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("                                                                    NC_HZ", "French (Canada)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                    NC_HZ" + "'", str2, "                                                                    NC_HZ");
    }

    @Test
    public void test29145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29145");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("I\\U0020ITALIANITALIANITALIANITALIIT", "Chinese");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I\\U0020ITALIANITALIANITALIANITALIIT" + "'", str2, "I\\U0020ITALIANITALIANITALIANITALIIT");
    }

    @Test
    public void test29146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29146");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("ZH,cnFrench (Canada)AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\\u0020iItalian\\u0020i                                                 ", 'f');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ZH,cnFrench (Canada)AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\\u0020iItalian\\u0020i                                                 " + "'", str2, "ZH,cnFrench (Canada)AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\\u0020iItalian\\u0020i                                                 ");
    }

    @Test
    public void test29147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29147");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str1, "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test29148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29148");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rzh_cn");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test29149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29149");
        java.util.Locale locale0 = java.util.Locale.ENGLISH;
        java.lang.String str1 = locale0.getDisplayLanguage();
        java.lang.String str3 = locale0.getExtension('F');
        java.lang.String str4 = locale0.getDisplayName();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "English" + "'", str1, "English");
        org.junit.Assert.assertNull(str3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "English" + "'", str4, "English");
    }

    @Test
    public void test29150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29150");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZ", (java.lang.CharSequence) "44444444444444444444444444444444!IHAAAAAAAAAAAAAAAAAAAAAAAAFRANZ\326SISCH (FRANKREICH)AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test29151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29151");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("CAN", "      ");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CAN" + "'", str3, "CAN");
    }

    @Test
    public void test29152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29152");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("und");
        java.lang.String str2 = locale1.getScript();
        java.lang.String str3 = locale1.getDisplayLanguage();
        java.lang.String str4 = locale1.getDisplayName();
        java.lang.String str5 = locale1.toString();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test29153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29153");
        char[] charArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "defgilmnoqrstuwxzbbbbdbebfbgbhbibjblbmbnbobqbrbsbtbvbwbybzccccdcfcgchcickclcmcncocrcucvcwcxcyczdedjdkdmdodzeceeegeheresetfifjfkfmfofrggbgdgegfggghgiglgmgngpgqgrgsgtgugwgyhkhmhnhrhthuidieiliminioiqirisitjejmjojpkekgkhkikmknkpkrkwkykzllblclilklrlsltlulvlymmcmdmemfmgmhmkmlmmmnmompmqmrmsmtmumvmwmxmymznncnenfngninlnonpnrnunzomppepfpgphpkplpmpnprpsptpwpyqrerorsrurwssbscsdsesgshsisjskslsmsnsosrssstsvsxsysztctdtftgthtjtktltmtntotrtttvtwtzuugumusuyuzvvcvevgvivnvuwfwsyeytzzmzw", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test29154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29154");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("zhzhzhzhzhzhzhzhzhzhE             g", "kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkedkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "zhzhzhzhzhzhzhzhzhzhE             g" + "'", str2, "zhzhzhzhzhzhzhzhzhzhE             g");
    }

    @Test
    public void test29155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29155");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("\\u0020iIalian\\u008600u\\U\\u0020iIalian\\u0020iUanglaisUFRZ\326CZ(FRKREC)Uialian    U                                                                                                      U!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IUzhzhzhzhzhzhzhzhzhzhFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAzhzhzhzhzhzhzhzhzhzhUFRZ\326CZ(FRKREC)Ucinese (Cina)\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hhU         ITALIAN_ITALIAN_ENGLISH         ITALIAN_!IHITTAIT_ITALIAN_EGAISHU                                      ...", "ZH_cnFrench (Canada)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u0020iIalian\\u008600u\\U\\u0020iIalian\\u0020iUanglaisUFRZ\326CZ(FRKREC)Uialian    U                                                                                                      U!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IUzhzhzhzhzhzhzhzhzhzhFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAzhzhzhzhzhzhzhzhzhzhUFRZ\326CZ(FRKREC)Ucinese (Cina)\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hhU         ITALIAN_ITALIAN_ENGLISH         ITALIAN_!IHITTAIT_ITALIAN_EGAISHU                                      ..." + "'", str2, "\\u0020iIalian\\u008600u\\U\\u0020iIalian\\u0020iUanglaisUFRZ\326CZ(FRKREC)Uialian    U                                                                                                      U!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IUzhzhzhzhzhzhzhzhzhzhFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAzhzhzhzhzhzhzhzhzhzhUFRZ\326CZ(FRKREC)Ucinese (Cina)\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hhU         ITALIAN_ITALIAN_ENGLISH         ITALIAN_!IHITTAIT_ITALIAN_EGAISHU                                      ...");
    }

    @Test
    public void test29156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29156");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("talienisch", (int) 'H');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test29157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29157");
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
        java.util.Locale locale10 = locale1.stripExtensions();
        java.util.Locale locale14 = new java.util.Locale("HI!       ", "\\U0020", "Italienisch#########################################################################################");
        java.util.Locale locale15 = locale14.stripExtensions();
        java.util.Locale locale16 = locale15.stripExtensions();
        java.lang.String str17 = locale16.getVariant();
        java.lang.String str18 = locale16.getLanguage();
        java.lang.String str19 = locale10.getDisplayVariant(locale16);
        java.lang.String str20 = locale16.getLanguage();
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
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "fr_CA");
        org.junit.Assert.assertEquals(locale14.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Italienisch#########################################################################################" + "'", str17, "Italienisch#########################################################################################");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!       " + "'", str18, "hi!       ");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!       " + "'", str20, "hi!       ");
    }

    @Test
    public void test29158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29158");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("                                                          4444allemand4444", "ZH_cnFrench (Canada)AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test29159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29159");
        java.util.Locale locale1 = java.util.Locale.GERMAN;
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale1.getDisplayName(locale2);
        java.util.Locale.setDefault(locale2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.upperCase("8600u\\                                                                                                                  ", locale2);
        java.lang.String str6 = locale2.getDisplayName();
        java.lang.String str8 = locale2.getExtension('C');
        java.util.Set<java.lang.String> strSet9 = locale2.getUnicodeLocaleAttributes();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "de");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "allemand" + "'", str3, "allemand");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "8600U\\                                                                                                                  " + "'", str5, "8600U\\                                                                                                                  ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "fran\347ais (Canada)" + "'", str6, "fran\347ais (Canada)");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(strSet9);
    }

    @Test
    public void test29160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29160");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("\ud504\ub791\uc2a4\uc5b4\uce90\ub098\ub2e4)_ENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENG_                                                                    \\U0020ITALIANITALIANITALIANITALI", 46);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ud504\ub791\uc2a4\uc5b4\uce90\ub098\ub2e4)_ENGENGENGENGENGENGENGENGENGENGENGEN" + "'", str2, "\ud504\ub791\uc2a4\uc5b4\uce90\ub098\ub2e4)_ENGENGENGENGENGENGENGENGENGENGENGEN");
    }

    @Test
    public void test29161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29161");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("\\u0020iTALIANiTALIANiTALIANiTALI", "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC\\u00de\\u00CCCCCCCCCCCCCCCCCCCCCCCCC...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test29162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29162");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("fr-caNINININININININININININININININININININININININININININININININININININININININININININININININ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "fr-caNINININININININININININININININININININININININININININININININININININININININININININININININ" + "'", str1, "fr-caNINININININININININININININININININININININININININININININININININININININININININININININININ");
    }

    @Test
    public void test29163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29163");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Chinese (China)", 'A');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, 'f');
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.concatWith("\u30d5\u30e9\u30f3\u30b9\u8a9e\u30d5\u30e9\u30f3\u30b9)", (java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Chinese (China)" + "'", str5, "Chinese (China)");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Chinese (China)" + "'", str7, "Chinese (China)");
    }

    @Test
    public void test29164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29164");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("                eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test29165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29165");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("HI!HI!", "_HHHHHHHHH_CV CW CX CY CZ DE DJ DK DM DO DZ EC EE EG EH ER ES ET FI FJ FK", "tali...an");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!HI!" + "'", str3, "HI!HI!");
    }

    @Test
    public void test29166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29166");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\\u0020hi!       _\\U0020_Italienisch################", "YYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYY");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test29167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29167");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("...                               ", "aEEEEEEEEEEEEE)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...                               " + "'", str2, "...                               ");
    }

    @Test
    public void test29168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29168");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("                                                                                                                      \\u006bCinese (Cina)\\u0069h..                                                                                                                      ", "Japonais");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test29169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29169");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("en");
        java.util.Locale.Builder builder3 = new java.util.Locale.Builder();
        java.util.Locale locale4 = builder3.build();
        java.util.Locale locale6 = java.util.Locale.forLanguageTag("Italian");
        java.lang.String str7 = locale4.getDisplayLanguage(locale6);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.upperCase("", locale6);
        java.lang.String str9 = locale6.getScript();
        java.util.Set<java.lang.String> strSet10 = locale6.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.String> strSet11 = locale6.getUnicodeLocaleKeys();
        java.util.List<java.lang.String> strList12 = java.util.Locale.filterTags(languageRangeList1, (java.util.Collection<java.lang.String>) strSet11);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap13 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList14 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList1, strMap13);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap15 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList16 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList1, strMap15);
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "italian");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(languageRangeList14);
        org.junit.Assert.assertNotNull(languageRangeList16);
    }

    @Test
    public void test29170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29170");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hIEnglish                                 (                United                                 Kingdom                )!English                                 (                United                                 Kingdom                )       ", "tali...an", (int) 'R');
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test29171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29171");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\351');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character e? is not in the range '0' - '9'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test29172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29172");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkEDkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk", "                                                                             zhzhzhzhzhzhzhzhzhzhfraazhaezhafzhagzhaizhalzhamzhanzhaozhaqzharzhaszhazhzhzhzhzhzhzhzhzhz2222222222222222222222222222222222222222222222222222222222222222222222222");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test29173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29173");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("DEFGILMNOQRSTUWXZBBBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVB                                                 HCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLLBLCLILKLRLSLTLULVLYMMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNNCNENFNGNINLNONPNRNUNZOMPPEPFPGPHPKPLPMPNPRPSPTPWPYQRERORSRURWSSBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUUGUMUSUYUZVVCVEVGVIVNVUWFWSYEYTZZMZW");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "DEFGILMNOQRSTUWXZBBBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVB                                                 HCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLLBLCLILKLRLSLTLULVLYMMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNNCNENFNGNINLNONPNRNUNZOMPPEPFPGPHPKPLPMPNPRPSPTPWPYQRERORSRURWSSBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUUGUMUSUYUZVVCVEVGVIVNVUWFWSYEYTZZMZW" + "'", str1, "DEFGILMNOQRSTUWXZBBBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVB                                                 HCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLLBLCLILKLRLSLTLULVLYMMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNNCNENFNGNINLNONPNRNUNZOMPPEPFPGPHPKPLPMPNPRPSPTPWPYQRERORSRURWSSBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUUGUMUSUYUZVVCVEVGVIVNVUWFWSYEYTZZMZW");
    }

    @Test
    public void test29174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29174");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuu\\U0030uuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "iFtlnz\\sisc02", "DEUTSCH\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuu\\U0030uuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str3, "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuu\\U0030uuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test29175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29175");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("e             g                                                                                     ", "talian");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "e             g                                                                                     " + "'", str2, "e             g                                                                                     ");
    }

    @Test
    public void test29176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29176");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "HI!       ALLEMANDITALIENISCHALLEMANDITALIAN_ITALIAN_ENG    \\     ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...ALLEMAND\\U0034ALLEMANDHI!ALLEMANDITALIANALLEMAND\\U0061ALLEMAND\\U0023ALLEMANDHI!ALLEMANDITALIANALLEMANDCHINESE (CHINA)ALLEMANDHI!ALLEMANDZH_CNALLEMANDITALIANALLEMANDENALLEMANDITALIENISCH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test29177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29177");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("und-itTAiT-ITALIAN-EgAish                    ", 26397);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "und-itTAiT-ITALIAN-EgAish                    " + "'", str2, "und-itTAiT-ITALIAN-EgAish                    ");
    }

    @Test
    public void test29178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29178");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rFRANZ\326SISCH\n(FRANKREICH)\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r", "                                            fRENCH (fRANCE)                                                \\u0068");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test29179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29179");
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
        java.util.Locale locale11 = java.util.Locale.ITALIAN;
        java.lang.String str12 = locale11.getDisplayLanguage();
        java.util.Locale locale13 = locale11.stripExtensions();
        java.lang.String str14 = locale11.getDisplayVariant();
        java.util.Set<java.lang.String> strSet15 = locale11.getUnicodeLocaleKeys();
        java.util.Locale.Builder builder16 = builder7.setLocale(locale11);
        java.util.Locale.Builder builder17 = builder7.clearExtensions();
        java.util.Locale.Builder builder18 = builder17.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder20 = builder18.setLanguage("de_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DE");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: de_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DE [at index 0]");
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
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "ko");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "it");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "italien" + "'", str12, "italien");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "it");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test29180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29180");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("EFrankreichgFrankreichFrankreichsh", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test29181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29181");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("xxxxxxxxxxxxxxxxxxx                             ...titxxxxxxxxxxxxxxxxxx                             ...", 400, 241);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test29182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29182");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("########################################################################################eltI_0200U\\_!", "HSXLGNE_NAILATI_NAXLATX\\");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test29183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29183");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("ADCAECAFCAGCAICALCAMCANCAOCAQCARCASCATCAUCAWCAXCAZCBACBBCBDCBECBFCBGCBHCBICBJCBLCBMCBNCBOCBQCBRCBSCBTCBVCBWCBYCBZCCACCCCCDCCFCCGCCHCCICCKCCLCCMCCNCCOCCRCCUCCVCCWCCXCCYCCZCDECDJCDKCDMCDOCDZCECCEECEGCEHCERCESCETCFICFJCFKCFMCFOCFRCGACGBCGDCGECGFCGGCGHCGICGLCGMCGNCGPCGQCGRCGSCGTCGUCGWCGYCHKCHMCHNCHRCHTCHUCIDCIECILCIMCINCIOCIQCIRCISCITCJECJMCJOCJPCKECKGCKHCKICKMCKNCKPCKRCKWCKYCKZCLACLBCLCCLICLKCLRCLSCLTCLUCLVCLYCMACMCCMDCMECMFCMGCMHCMKCMLCMMCMNCMOCMPCMQCMRCMSCMTCMUCMVCMWCMXCMYCMZCNACNCCNECNFCNGCNICNLCNOCNPCNRCNUCNZCOMCPACPECPFCPGCPHCPKCPLCPMCPNCPRCPSCPTCPWCPYCQACRECROCRSCRUCRWCSACSBCSCCSDCSECSGCSHCSICSJCSKCSLCSMCSNCSOCSRCSSCSTCSVCSXCSYCSZCTCCTDCTFCTGCTHCTJCTKCTLCTMCTNCTOCTRCTTCTVCTWCTZCUACUGCUMCUSCUYCUZCVACVCCVECVGCVICVNCVUCWFCWSCYECYTCZACZMCZW");
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + 'A' + "'", char1 == 'A');
    }

    @Test
    public void test29184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29184");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "Hhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIH", (java.lang.CharSequence) "8");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test29185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29185");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                       hi!                                                              ", "esenihc");
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("USEEEE", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test29186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29186");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("                             de_de                                             ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=de_de");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test29187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29187");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("ermany)ger", "                                                                    \\U0020ItalianItalianItalianItali", 4);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test29188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29188");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("China", 'd');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "hcierknarf");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "China" + "'", str4, "China");
    }

    @Test
    public void test29189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29189");
        java.lang.CharSequence charSequence1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rZH_CN (CAN)", charSequence1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test29190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29190");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder5 = builder4.clear();
        java.util.Locale.Builder builder7 = builder5.setLanguage("ITALIAN");
        java.util.Locale.Builder builder8 = builder5.clear();
        java.util.Locale.Builder builder9 = builder8.clearExtensions();
        java.util.Locale.Builder builder10 = builder9.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder10.addUnicodeLocaleAttribute("\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069!IH\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: \\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069!IH\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\ [at index 0]");
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
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test29191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29191");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid(" \\U0078 ", 129, (int) 'i');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test29192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29192");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("         INGLESE        ", "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx\\u0068 !ih !ih !ih !ih !ih !ih !ih !ih !ih");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test29193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29193");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "000000000000000000000000000000000000000000...", "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN                                                                     ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test29194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29194");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("  ", (int) 'G', '-');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "----------------------------------  -----------------------------------" + "'", str3, "----------------------------------  -----------------------------------");
    }

    @Test
    public void test29195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29195");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("\351encor\351encor\351encor", "NC_HZ\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\351encor\351encor\351encor" + "'", str2, "\351encor\351encor\351encor");
    }

    @Test
    public void test29196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29196");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Locale locale1 = java.util.Locale.ITALIAN;
        java.lang.String str3 = locale1.getExtension('h');
        java.lang.String str4 = locale0.getDisplayScript(locale1);
        java.util.Locale locale8 = new java.util.Locale("HI!       ", "\\U0020", "Italienisch#########################################################################################");
        java.lang.String str9 = locale0.getDisplayCountry(locale8);
        java.util.Locale.setDefault(locale0);
        java.lang.String str11 = locale0.getISO3Country();
        java.lang.String str12 = locale0.getISO3Country();
        java.util.Locale locale13 = java.util.Locale.US;
        java.lang.String str14 = locale13.toLanguageTag();
        java.util.Set<java.lang.String> strSet15 = locale13.getUnicodeLocaleKeys();
        java.util.Locale.Category category16 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale17 = java.util.Locale.getDefault(category16);
        java.lang.String str18 = locale13.getDisplayLanguage(locale17);
        java.lang.String str19 = locale0.getDisplayVariant(locale17);
        java.util.Set<java.lang.Character> charSet20 = locale17.getExtensionKeys();
        java.util.Locale locale24 = new java.util.Locale("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhfr-CA", "", "                                      )hsilgne,nailati( ");
        java.lang.String str25 = locale24.getDisplayScript();
        boolean boolean26 = locale17.equals((java.lang.Object) str25);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals(locale8.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "France" + "'", str9, "France");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "FRA" + "'", str11, "FRA");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "FRA" + "'", str12, "FRA");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "en-US" + "'", str14, "en-US");
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertTrue("'" + category16 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category16.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "anglais" + "'", str18, "anglais");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(charSet20);
        org.junit.Assert.assertEquals(locale24.toString(), "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhfr-ca__                                      )hsilgne,nailati( ");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test29197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29197");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "    ZH_CN    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test29198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29198");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("italiae", 40);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "italiae" + "'", str2, "italiae");
    }

    @Test
    public void test29199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29199");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("hcsineilati             dddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd", "CHINESExxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CHINESExxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx" + "'", str2, "CHINESExxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
    }

    @Test
    public void test29200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29200");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "Franz\366sisch (Kanada");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test29201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29201");
        char[] charArray6 = new char[] { 'i', '4', '#' };
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "en", charArray6);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "Cinese (cina)\\u0069h...", charArray6);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "...78zhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzh..", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "i4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "i4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[i, 4, #]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test29202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29202");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("e                         iItal", "frnz\366sisch(Knd)", "it_I");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test29203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29203");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("englisch (         ITALIAN_ITALIAN_ENGLISH,\\u0061)", "\\", "HIEnglish                                 (                United                                 Kingdom                )!English                                 (                United                                 Kingdom                )       ");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test29204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29204");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("a)AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAdZH_cnFrench (Cana", "                                             ITALIAN_ITALIAN_ENGLISH", "000000000000000000000000000000000000000000000000000000000000000CCCC\\CCCCHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "a)AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAdZH_cnFrench (Cana" + "'", str3, "a)AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAdZH_cnFrench (Cana");
    }

    @Test
    public void test29205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29205");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "...xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test29206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29206");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "inglesehhhhhhhhhenglisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)englisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)englisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)englisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)englisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)englisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)en", "                                                                                                    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test29207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29207");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "       !ih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test29208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29208");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("\u1111\u1173\u1105\u1161\u11bc\u1109\u1173\u110b\u1165\u110f\u1162\u1102\u1161\u1103\u1161)_ENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENG_                                                                    \\u0020iTALIANiTALIANiTALIANiTAL", 194);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NGENGENGENGENGENGENGENGENGENGENGENGENGENG_                                                                    \\u0020iTALIANiTALIANiTALIANiTAL" + "'", str2, "NGENGENGENGENGENGENGENGENGENGENGENGENGENG_                                                                    \\u0020iTALIANiTALIANiTALIANiTAL");
    }

    @Test
    public void test29209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29209");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("Italian");
        java.util.Locale locale4 = builder3.build();
        java.util.Locale.Builder builder7 = builder3.setExtension('E', "DEUTSCH");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder7.removeUnicodeLocaleAttribute("ADFAEFAFFAGFAIFALFAMFANFAOFAQFARFASFATFAUFAWFAXFAZFBAFBBFBDFBEFBFFBGFBHFBIFBJFBLFBMFBNFBOFBQFBRFBSFBTFBVFBWFBYFBZFCAFCCFCDFCFFCGFCHFCIFCKFCLFCMFCNFCOFCRFCUFCVFCWFCXFCYFCZFDEFDJFDKFDMFDOFDZFECFEEFEGFEHFERFESFETFFIFFJFFKFFMFFOFFRFGAFGBFGDFGEFGFFGGFGHFGIFGLFGMFGNFGPFGQFGRFGSFGTFGUFGWFGYFHKFHMFHNFHRFHTFHUFIDFIEFILFIMFINFIOFIQFIRFISFITFJEFJMFJOFJPFKEFKGFKHFKIFKMFKNFKPFKRFKWFKYFKZFLAFLBFLCFLIFLKFLRFLSFLTFLUFLVFLYFMAFMCFMDFMEFMFFMGFMHFMKFMLFMMFMNFMOFMPFMQFMRFMSFMTFMUFMVFMWFMXFMYFMZFNAFNCFNEFNFFNGFNIFNLFNOFNPFNRFNUFNZFOMFPAFPEFPFFPGFPHFPKFPLFPMFPNFPRFPSFPTFPWFPYFQAFREFROFRSFRUFRWFSAFSBFSCFSDFSEFSGFSHFSIFSJFSKFSLFSMFSNFSOFSRFSSFSTFSVFSXFSYFSZFTCFTDFTFFTGFTHFTJFTKFTLFTMFTNFTOFTRFTTFTVFTWFTZFUAFUGFUMFUSFUYFUZFVAFVCFVEFVGFVIFVNFVUFWFFWSFYEFYTFZAFZMFZW");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: ADFAEFAFFAGFAIFALFAMFANFAOFAQFARFASFATFAUFAWFAXFAZFBAFBBFBDFBEFBFFBGFBHFBIFBJFBLFBMFBNFBOFBQFBRFBSFBTFBVFBWFBYFBZFCAFCCFCDFCFFCGFCHFCIFCKFCLFCMFCNFCOFCRFCUFCVFCWFCXFCYFCZFDEFDJFDKFDMFDOFDZFECFEEFEGFEHFERFESFETFFIFFJFFKFFMFFOFFRFGAFGBFGDFGEFGFFGGFGHFGIFGLFGMFGNFGPFGQFGRFGSFGTFGUFGWFGYFHKFHMFHNFHRFHTFHUFIDFIEFILFIMFINFIOFIQFIRFISFITFJEFJMFJOFJPFKEFKGFKHFKIFKMFKNFKPFKRFKWFKYFKZFLAFLBFLCFLIFLKFLRFLSFLTFLUFLVFLYFMAFMCFMDFMEFMFFMGFMHFMKFMLFMMFMNFMOFMPFMQFMRFMSFMTFMUFMVFMWFMXFMYFMZFNAFNCFNEFNFFNGFNIFNLFNOFNPFNRFNUFNZFOMFPAFPEFPFFPGFPHFPKFPLFPMFPNFPRFPSFPTFPWFPYFQAFREFROFRSFRUFRWFSAFSBFSCFSDFSEFSGFSHFSIFSJFSKFSLFSMFSNFSOFSRFSSFSTFSVFSXFSYFSZFTCFTDFTFFTGFTHFTJFTKFTLFTMFTNFTOFTRFTTFTVFTWFTZFUAFUGFUMFUSFUYFUZFVAFVCFVEFVGFVIFVNFVUFWFFWSFYEFYTFZAFZMFZW [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "italian");
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test29210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29210");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("iTALIAN                                                                 ", "AD\rAE\rAF\rAG\rAI\rAL\rAM\rAN\rAO\rAQ\rAR\rAS\rAT\rAU\rAW\rAX\rAZ\rBA\rBB\rBD\rBE\rBF\rBG\rBH\rBI\rBJ\rBL\rBM\rBN\rBO\rBQ\rBR\rBS\rBT\rBV\rBW\rBY\rBZ\rCA\rCC\rCD\rCF\rCG\rCH\rCI\rCK\rCL\rCM\rCN\rCO\rCR\rCU\rCV\rCW\rCX\rCY\rCZ\rDE\rDJ\rDK\rDM\rDO\rDZ\rEC\rEE\rEG\rEH\rER\rES\rET\rFI\rFJ\rFK\rFM\rFO\rFR\rGA\rGB\rGD\rGE\rGF\rGG\rGH\rGI\rGL\rGM\rGN\rGP\rGQ\rGR\rGS\rGT\rGU\rGW\rGY\rHK\rHM\rHN\rHR\rHT\rHU\rID\rIE\rIL\rIM\rIN\rIO\rIQ\rIR\rIS\rIT\rJE\rJM\rJO\rJP\rKE\rKG\rKH\rKI\rKM\rKN\rKP\rKR\rKW\rKY\rKZ\rLA\rLB\rLC\rLI\rLK\rLR\rLS\rLT\rLU\rLV\rLY\rMA\rMC\rMD\rME\rMF\rMG\rMH\rMK\rML\rMM\rMN\rMO\rMP\rMQ\rMR\rMS\rMT\rMU\rMV\rMW\rMX\rMY\rMZ\rNA\rNC\rNE\rNF\rNG\rNI\rNL\rNO\rNP\rNR\rNU\rNZ\rOM\rPA\rPE\rPF\rPG\rPH\rPK\rPL\rPM\rPN\rPR\rPS\rPT\rPW\rPY\rQA\rRE\rRO\rRS\rRU\rRW\rSA\rSB\rSC\rSD\rSE\rSG\rSH\rSI\rSJ\rSK\rSL\rSM\rSN\rSO\rSR\rSS\rST\rSV\rSX\rSY\rSZ\rTC\rTD\rTF\rTG\rTH\rTJ\rTK\rTL\rTM\rTN\rTO\rTR\rTT\rTV\rTW\rTZ\rUA\rUG\rUM\rUS\rUY\rUZ\rVA\rVC\rVE\rVG\rVI\rVN\rVU\rWF\rWS\rYE\rYT\rZA\rZM\rZW");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "iTALIAN                                                                 " + "'", str2, "iTALIAN                                                                 ");
    }

    @Test
    public void test29211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29211");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "gERMAN (gERMANY)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test29212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29212");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("German (germany)german (germany)german (gC\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rChinesisch (China)(germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)", "U!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IUzhzhzhzhzhzhzhzhzhzhFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAzhzhzhzhzhzhzhzhzhzhUFRZ\326CZ(FRKREC)Ucinese (Cina)\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hhU         ITALIAN_ITALIAN_ENGLISH         ITALIAN_!IHITTAIT_ITALIAN_EGAISHU                                      ..");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test29213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29213");
        java.util.Locale locale1 = new java.util.Locale("en");
        boolean boolean2 = locale1.hasExtensions();
        java.util.Set<java.lang.String> strSet3 = locale1.getUnicodeLocaleKeys();
        java.util.Locale locale4 = java.util.Locale.ITALIAN;
        java.lang.String str5 = locale4.getDisplayLanguage();
        java.util.Locale locale6 = locale4.stripExtensions();
        java.lang.String str7 = locale6.getVariant();
        java.lang.String str8 = locale1.getDisplayLanguage(locale6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = locale6.getUnicodeLocaleType("francese (Francia)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: francese (Francia)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "it");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "italien" + "'", str5, "italien");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "it");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "inglese" + "'", str8, "inglese");
    }

    @Test
    public void test29214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29214");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("BFIBGIBHIBIIBJIBLIBMIBNIBOIBQIBRIBSIBTIBVIBWIBYIBZICAICCICDICFICGICHICIICKICLICMICNICOICRICUICVICWICXICYICZIDEIDJIDKIDMIDOIDZIECIEEIEGIEHIERIESIETIFIIFJIFKIFMIFOIFRIGAIGBIGDIGEIGFIGGIGHIGIIGLIGMIGNIGPIGQIGRIGSIGTIGUIGWIGYIHKI");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=bfibgibhibiibjiblibmibniboibqibribsibtibvibwibyibzicaiccicdicficgichiciickiclicmicnicoicricuicvicwicxicyiczideidjidkidmidoidziecieeiegiehieriesietifiifjifkifmifoifrigaigbigdigeigfiggighigiigligmignigpigqigrigsigtiguigwigyihki");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test29215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29215");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "Frnz\366sisch(KndFrnz\366sisch(KndFrnz\366sisch(KndFrnz\366sisch(KndFEEEEEEEEEEEEE", "8888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888E             g");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 57 + "'", int2 == 57);
    }

    @Test
    public void test29216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29216");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("  nailati                                                                                                               ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "nailati" + "'", str1, "nailati");
    }

    @Test
    public void test29217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29217");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEnglischCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC...", "iiiiiiiiiiifrankreichnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn", "french (canada)                                                                  ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test29218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29218");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("  aNIHc  ", "\uc911\uad6d\uc5b4\uc911\uad6d)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test29219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29219");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("E             g                          ", "aDAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...", (int) 'z');
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "n,eng\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\ualian (italiait");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.concatWith("\u610f\u5927\u5229\u6587", (java.lang.Object[]) strArray6);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "E" + "'", str7, "E");
    }

    @Test
    public void test29220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29220");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("ranzosisch (Frankreich)kkkkkkkkkkkkkkkkkkk...ranzosisch (Frankreich)kkkkkkkkkk\n", 103, 21);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test29221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29221");
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
        java.util.Locale locale11 = locale0.stripExtensions();
        java.util.Locale.Builder builder12 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder13 = builder12.clearExtensions();
        java.util.Locale.Builder builder15 = builder12.setLanguageTag("Italian");
        java.util.Locale locale16 = builder12.build();
        java.lang.String str17 = locale0.getDisplayCountry(locale16);
        java.util.Locale.Category category18 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale19 = java.util.Locale.getDefault(category18);
        java.util.Locale locale20 = java.util.Locale.getDefault(category18);
        java.lang.String str21 = locale20.getDisplayLanguage();
        java.lang.String str22 = locale0.getDisplayName(locale20);
        java.lang.String str23 = locale20.toLanguageTag();
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
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "italian");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "France" + "'", str17, "France");
        org.junit.Assert.assertTrue("'" + category18 + "' != '" + java.util.Locale.Category.FORMAT + "'", category18.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "de");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "de");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Deutsch" + "'", str21, "Deutsch");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Franz\366sisch (Frankreich)" + "'", str22, "Franz\366sisch (Frankreich)");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "de" + "'", str23, "de");
    }

    @Test
    public void test29222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29222");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "\\u0020iIalian\\u008600u\\U\\u0020iIalian\\u0020iUanglaisUFRZ\326CZ(FRKREC)Uialian    U                                                                                                      U!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IUzhzhzhzhzhzhzhzhzhzhFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAzhzhzhzhzhzhzhzhzhzhUFRZ\326CZ(FRKREC)Ucinese (Cina)\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hhU         ITALIAN_ITALIAN_ENGLISH         ITALIAN_!IHITTAIT_ITALIAN_EGAISHU                                      ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test29223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29223");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("Deutsch", "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZW", 52);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, "IT", (int) 'E', (int) (byte) -1);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny("keagaasheagaasheagaasheagaasheagaasheagaasheagaasheagaasheagaasheagaasheagaasheagaasheagaasheagaashe", strArray5);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.endsWithAny("\\u0054", strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test29224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29224");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("                                                         HCSTUED                                                         ");
        org.junit.Assert.assertNotNull(languageRangeList1);
    }

    @Test
    public void test29225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29225");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("       !ih", "22222222222222222222222222222222222222222222222222FRANCESE (cANADA)", 221);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test29226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29226");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("2iT hi!       _\\U0020_Italienisch####################################################################            2i", "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxESENIHC");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2iT hi!       _\\U0020_Italienisch####################################################################            2i" + "'", str2, "2iT hi!       _\\U0020_Italienisch####################################################################            2i");
    }

    @Test
    public void test29227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29227");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("en_C", "ccccccccccccccccccccccccccccccccccccccccccccc", (int) 'c');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test29228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29228");
        java.util.Locale locale2 = new java.util.Locale("\\u002", "royaume-uni");
        java.lang.String str3 = locale2.getDisplayCountry();
        java.lang.Object obj4 = locale2.clone();
        org.junit.Assert.assertEquals(locale2.toString(), "\\u002_ROYAUME-UNI");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ROYAUME-UNI" + "'", str3, "ROYAUME-UNI");
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "\\u002_ROYAUME-UNI");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "\\u002_ROYAUME-UNI");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "\\u002_ROYAUME-UNI");
    }

    @Test
    public void test29229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29229");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("                                                                                           U002", "UND");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test29230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29230");
        java.util.Locale locale3 = new java.util.Locale("fr_FR", "\ub3c5\uc77c\uc5b4", "hcsineilati");
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
        java.util.Locale locale23 = java.util.Locale.ROOT;
        java.lang.String str24 = locale12.getDisplayName(locale23);
        java.lang.String str25 = locale3.getDisplayCountry(locale23);
        java.util.Locale locale26 = java.util.Locale.ITALIAN;
        java.util.Set<java.lang.Character> charSet27 = locale26.getExtensionKeys();
        java.lang.String str28 = locale26.getVariant();
        java.lang.String str29 = locale26.getDisplayName();
        java.lang.String str30 = locale26.getCountry();
        java.lang.String str31 = locale26.getDisplayVariant();
        java.lang.String str32 = locale26.getCountry();
        java.lang.String str33 = locale23.getDisplayCountry(locale26);
        java.util.Locale.Builder builder34 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder35 = builder34.clearExtensions();
        java.util.Locale locale36 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str37 = locale36.getDisplayName();
        java.util.Locale.Builder builder38 = builder35.setLocale(locale36);
        java.util.Locale.Builder builder40 = builder35.setLanguage("und");
        java.util.Locale locale41 = builder40.build();
        java.util.Locale.Builder builder43 = builder40.setLanguage("fr");
        java.util.Locale.Category category44 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale46 = new java.util.Locale("\\u005c");
        java.util.Locale locale48 = java.util.Locale.CHINESE;
        java.lang.String str49 = org.apache.commons.lang3.StringUtils.lowerCase("Franz\366sisch (Frankreich)", locale48);
        java.lang.String str50 = locale48.getVariant();
        java.lang.String str51 = locale46.getDisplayScript(locale48);
        java.util.Locale.setDefault(locale46);
        java.util.Locale.setDefault(category44, locale46);
        java.util.Locale locale55 = java.util.Locale.FRANCE;
        java.util.Locale locale56 = java.util.Locale.ITALIAN;
        java.lang.String str58 = locale56.getExtension('h');
        java.lang.String str59 = locale55.getDisplayScript(locale56);
        java.lang.String str60 = org.apache.commons.lang3.StringUtils.lowerCase("HI!       ", locale55);
        java.lang.String str62 = locale55.getExtension('z');
        java.util.Locale.setDefault(category44, locale55);
        java.util.Locale locale64 = java.util.Locale.ITALIAN;
        java.lang.String str65 = locale64.getDisplayLanguage();
        java.util.Locale locale66 = java.util.Locale.ITALIAN;
        java.lang.String str68 = locale66.getExtension('h');
        java.lang.String str69 = locale64.getDisplayCountry(locale66);
        java.util.Set<java.lang.String> strSet70 = locale66.getUnicodeLocaleKeys();
        java.util.Locale.setDefault(category44, locale66);
        java.util.Locale.Builder builder72 = builder40.setLocale(locale66);
        java.util.Locale.Builder builder73 = builder72.clearExtensions();
        java.util.Locale locale74 = builder73.build();
        java.util.Locale locale76 = java.util.Locale.TAIWAN;
        java.lang.String str77 = org.apache.commons.lang3.StringUtils.upperCase("CV CW CX CY CZ DE DJ DK DM DO DZ EC EE EG EH ER ES ET FI FJ FK", locale76);
        java.lang.String str78 = locale76.getDisplayName();
        java.util.Locale.Builder builder79 = builder73.setLocale(locale76);
        java.lang.String str80 = locale26.getDisplayName(locale76);
        java.util.Locale locale81 = java.util.Locale.KOREAN;
        java.lang.String str82 = locale81.getDisplayVariant();
        java.util.Locale.Builder builder83 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder84 = builder83.clearExtensions();
        java.util.Locale locale85 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str86 = locale85.getDisplayName();
        java.util.Locale.Builder builder87 = builder84.setLocale(locale85);
        java.util.Locale.Builder builder89 = builder84.setLanguage("und");
        java.util.Locale locale90 = builder89.build();
        java.util.Locale locale91 = builder89.build();
        java.lang.String str92 = locale91.toLanguageTag();
        java.lang.String str93 = locale81.getDisplayScript(locale91);
        java.lang.String str94 = locale26.getDisplayLanguage(locale91);
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "\ub3c5\uc77c\uc5b4_hcsineilati");
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
        org.junit.Assert.assertEquals(locale23.toString(), "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "English" + "'", str24, "English");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\ub3c5\uc77c\uc5b4" + "'", str25, "\ub3c5\uc77c\uc5b4");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "it");
        org.junit.Assert.assertNotNull(charSet27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Italienisch" + "'", str29, "Italienisch");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Franz\366sisch (Kanada)" + "'", str37, "Franz\366sisch (Kanada)");
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "und_CA");
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertTrue("'" + category44 + "' != '" + java.util.Locale.Category.FORMAT + "'", category44.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertEquals(locale46.toString(), "\\u005c");
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "franz\366sisch (frankreich)" + "'", str49, "franz\366sisch (frankreich)");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale56);
        org.junit.Assert.assertEquals(locale56.toString(), "it");
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hi!       " + "'", str60, "hi!       ");
        org.junit.Assert.assertNull(str62);
        org.junit.Assert.assertNotNull(locale64);
        org.junit.Assert.assertEquals(locale64.toString(), "it");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "Italian" + "'", str65, "Italian");
        org.junit.Assert.assertNotNull(locale66);
        org.junit.Assert.assertEquals(locale66.toString(), "it");
        org.junit.Assert.assertNull(str68);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertNotNull(strSet70);
        org.junit.Assert.assertNotNull(builder72);
        org.junit.Assert.assertNotNull(builder73);
        org.junit.Assert.assertNotNull(locale74);
        org.junit.Assert.assertEquals(locale74.toString(), "it");
        org.junit.Assert.assertNotNull(locale76);
        org.junit.Assert.assertEquals(locale76.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "CV CW CX CY CZ DE DJ DK DM DO DZ EC EE EG EH ER ES ET FI FJ FK" + "'", str77, "CV CW CX CY CZ DE DJ DK DM DO DZ EC EE EG EH ER ES ET FI FJ FK");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "Chinese (Taiwan)" + "'", str78, "Chinese (Taiwan)");
        org.junit.Assert.assertNotNull(builder79);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "\u7fa9\u5927\u5229\u6587" + "'", str80, "\u7fa9\u5927\u5229\u6587");
        org.junit.Assert.assertNotNull(locale81);
        org.junit.Assert.assertEquals(locale81.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertNotNull(builder84);
        org.junit.Assert.assertNotNull(locale85);
        org.junit.Assert.assertEquals(locale85.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "French (Canada)" + "'", str86, "French (Canada)");
        org.junit.Assert.assertNotNull(builder87);
        org.junit.Assert.assertNotNull(builder89);
        org.junit.Assert.assertNotNull(locale90);
        org.junit.Assert.assertEquals(locale90.toString(), "und_CA");
        org.junit.Assert.assertNotNull(locale91);
        org.junit.Assert.assertEquals(locale91.toString(), "und_CA");
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "und-CA" + "'", str92, "und-CA");
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "" + "'", str93, "");
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "Italian" + "'", str94, "Italian");
    }

    @Test
    public void test29231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29231");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder5 = builder4.clear();
        java.util.Locale.Builder builder7 = builder5.setLanguage("ITALIAN");
        java.util.Locale.Builder builder8 = builder5.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder8.setScript(" tli                                                               ");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script:  tli                                                                [at index 0]");
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
    }

    @Test
    public void test29232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29232");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("en_CA...FDEDZCYCXCWCVCUCRCOCNCMCLCKCICHCGCFCDCCCACZBYBWBVBTBSBRBQBOBNBMBLBJBIBHBGBFBEBDBBBABZAXAWAUATASARAQAOANAMALAIAGAFAEADA");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!        (\\U0020,Italienisch#########################################################################################nnn", "ENGLISH");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.replaceEach("200U\\", strArray2, strArray5);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "200U\\" + "'", str6, "200U\\");
    }

    @Test
    public void test29233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29233");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("h!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!i");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test29234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29234");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("hi!        (\\U0020,Italifran\347#######################", "", (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test29235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29235");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("a700u\\", "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhfr-CA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test29236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29236");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        java.util.Locale.setDefault(locale0);
        java.lang.String str2 = locale0.toLanguageTag();
        java.util.Locale locale3 = java.util.Locale.ITALY;
        java.lang.String str4 = locale3.getScript();
        java.lang.String str5 = locale3.getDisplayCountry();
        boolean boolean6 = locale3.hasExtensions();
        java.util.Locale.setDefault(locale3);
        java.lang.String str8 = locale0.getDisplayLanguage(locale3);
        java.lang.String str9 = locale3.getDisplayVariant();
        java.util.Locale locale10 = java.util.Locale.FRENCH;
        java.util.Locale locale11 = java.util.Locale.ENGLISH;
        java.lang.String str12 = locale11.getDisplayCountry();
        java.lang.String str13 = locale10.getDisplayVariant(locale11);
        java.lang.String str14 = locale10.getDisplayCountry();
        java.lang.String str15 = locale10.getScript();
        java.lang.String str16 = locale10.getScript();
        java.util.Locale locale17 = java.util.Locale.FRENCH;
        java.util.Locale locale18 = java.util.Locale.ENGLISH;
        java.lang.String str19 = locale18.getDisplayCountry();
        java.lang.String str20 = locale17.getDisplayVariant(locale18);
        java.lang.String str21 = locale17.getDisplayCountry();
        java.lang.String str22 = locale17.getScript();
        java.lang.String str23 = locale17.getScript();
        java.lang.String str24 = locale10.getDisplayCountry(locale17);
        java.lang.String str25 = locale3.getDisplayLanguage(locale10);
        java.util.Locale.Builder builder26 = new java.util.Locale.Builder();
        java.util.Locale locale27 = builder26.build();
        java.util.Locale locale28 = java.util.Locale.FRENCH;
        java.util.Locale locale29 = java.util.Locale.ENGLISH;
        java.lang.String str30 = locale29.getDisplayCountry();
        java.lang.String str31 = locale28.getDisplayVariant(locale29);
        java.lang.String str32 = locale28.getDisplayCountry();
        java.lang.String str33 = locale28.getScript();
        java.lang.String str34 = locale28.getScript();
        java.util.Locale locale35 = java.util.Locale.FRENCH;
        java.util.Locale locale36 = java.util.Locale.ENGLISH;
        java.lang.String str37 = locale36.getDisplayCountry();
        java.lang.String str38 = locale35.getDisplayVariant(locale36);
        java.lang.String str39 = locale35.getDisplayCountry();
        java.lang.String str40 = locale35.getScript();
        java.lang.String str41 = locale35.getScript();
        java.lang.String str42 = locale28.getDisplayCountry(locale35);
        java.lang.String str43 = locale27.getDisplayVariant(locale35);
        java.util.Locale locale45 = java.util.Locale.ENGLISH;
        java.lang.String str46 = locale45.getDisplayLanguage();
        java.lang.String str47 = org.apache.commons.lang3.StringUtils.upperCase("!IH", locale45);
        java.lang.String str48 = locale45.getCountry();
        java.lang.String str49 = locale45.getCountry();
        java.lang.String str50 = locale35.getDisplayCountry(locale45);
        java.util.Locale locale54 = new java.util.Locale("HI!       ", "\\U0020", "Italienisch#########################################################################################");
        java.util.Locale locale55 = locale54.stripExtensions();
        java.lang.String str56 = locale45.getDisplayCountry(locale55);
        java.util.Locale locale59 = new java.util.Locale("                                     fran\347ais (France)                                      ", "Chinese (China");
        java.lang.String str60 = locale45.getDisplayScript(locale59);
        java.lang.String str61 = locale59.getDisplayName();
        java.lang.String str62 = locale3.getDisplayScript(locale59);
        java.lang.String str63 = locale3.getDisplayCountry();
        java.util.Locale locale64 = java.util.Locale.KOREA;
        java.lang.String str65 = locale64.getVariant();
        java.util.Locale locale67 = new java.util.Locale("en");
        boolean boolean68 = locale67.hasExtensions();
        java.lang.String str69 = locale64.getDisplayCountry(locale67);
        java.lang.String str70 = locale64.toLanguageTag();
        java.lang.String str71 = locale3.getDisplayVariant(locale64);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "de" + "'", str2, "de");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Italien" + "'", str5, "Italien");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "tedesco" + "'", str8, "tedesco");
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
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "fr");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "en");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "italien" + "'", str25, "italien");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "fr");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "en");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "fr");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "en");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "en");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "inglese" + "'", str46, "inglese");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "!IH" + "'", str47, "!IH");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals(locale54.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals(locale59.toString(), "                                     fran\347ais (france)                                      _CHINESE (CHINA");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "                                     fran\347ais (france)                                       (CHINESE (CHINA)" + "'", str61, "                                     fran\347ais (france)                                       (CHINESE (CHINA)");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "Italia" + "'", str63, "Italia");
        org.junit.Assert.assertNotNull(locale64);
        org.junit.Assert.assertEquals(locale64.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertEquals(locale67.toString(), "en");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "South Korea" + "'", str69, "South Korea");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "ko-KR" + "'", str70, "ko-KR");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
    }

    @Test
    public void test29237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29237");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "                                                                                                                                                                                                                                ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test29238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29238");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("Italian");
        java.util.Locale.Builder builder4 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder0.clear();
        java.util.Locale locale7 = java.util.Locale.forLanguageTag("\\u0020");
        java.util.Locale.Builder builder8 = builder0.setLocale(locale7);
        java.util.Locale.Builder builder11 = builder0.setExtension('u', "Italian");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder13 = builder11.setLanguageTag("5555555555FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAeeeeeeeeeeeex5555555555");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: 5555555555FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAeeeeeeeeeeeex5555555555 [at index 0]");
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
    }

    @Test
    public void test29239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29239");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("u005c", "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC##############\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rFrn");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test29240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29240");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("0!TALIAN!TALIAN!TALIAN!TALzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz", "#");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0!TALIAN!TALIAN!TALIAN!TALzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz" + "'", str2, "0!TALIAN!TALIAN!TALIAN!TALzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
    }

    @Test
    public void test29241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29241");
        java.util.Locale locale2 = java.util.Locale.forLanguageTag("hi!");
        java.lang.String str3 = locale2.getCountry();
        java.util.Locale.Builder builder4 = new java.util.Locale.Builder();
        java.util.Locale locale5 = builder4.build();
        java.util.Locale locale7 = java.util.Locale.forLanguageTag("Italian");
        java.lang.String str8 = locale5.getDisplayLanguage(locale7);
        java.lang.String str9 = locale2.getDisplayLanguage(locale5);
        java.lang.String str10 = locale2.getDisplayVariant();
        java.lang.String str11 = locale2.getDisplayName();
        java.util.Locale locale12 = locale2.stripExtensions();
        java.lang.String str13 = locale2.getDisplayScript();
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.upperCase("iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiEsilgnE_NAILATI_nailatiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii", locale2);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "italian");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIESILGNE_NAILATI_NAILATIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII" + "'", str14, "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIESILGNE_NAILATI_NAILATIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
    }

    @Test
    public void test29242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29242");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "ITALIAN_italian_eNGLISHITALIAN_!IHitTAiT_ITALIAN_EgAish");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ITALIAN_italian_eNGLISHITALIAN_!IHitTAiT_ITALIAN_EgAish" + "'", str1, "ITALIAN_italian_eNGLISHITALIAN_!IHitTAiT_ITALIAN_EgAish");
    }

    @Test
    public void test29243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29243");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("HHHHHHHHHHtTAHHHHHHHHHHT_ITAhIAN\\U0020Ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHHHHHHHHtTAHHHHHHHHHHT_ITAhIAN\\U0020Ih" + "'", str1, "HHHHHHHHHHtTAHHHHHHHHHHT_ITAhIAN\\U0020Ih");
    }

    @Test
    public void test29244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29244");
        java.util.Locale locale1 = new java.util.Locale(" (italian,english)                                      ");
        java.util.Locale locale4 = new java.util.Locale("\\u005c");
        java.util.Locale locale6 = java.util.Locale.CHINESE;
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.lowerCase("Franz\366sisch (Frankreich)", locale6);
        java.lang.String str8 = locale6.getVariant();
        java.lang.String str9 = locale4.getDisplayScript(locale6);
        java.lang.String str11 = locale4.getExtension('C');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.lowerCase("italian (ITALIAN,English)", locale4);
        java.lang.String str13 = locale4.getDisplayScript();
        java.lang.String str14 = locale1.getDisplayScript(locale4);
        java.util.Set<java.lang.String> strSet15 = locale4.getUnicodeLocaleAttributes();
        org.junit.Assert.assertEquals(locale1.toString(), " (italian,english)                                      ");
        org.junit.Assert.assertEquals(locale4.toString(), "\\u005c");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "franz\366sisch (frankreich)" + "'", str7, "franz\366sisch (frankreich)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "italian (italian,english)" + "'", str12, "italian (italian,english)");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(strSet15);
    }

    @Test
    public void test29245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29245");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rfranci", "itTAiT_ITALIAN_EgAish                                 \\u0068", 6);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test29246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29246");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("              TA...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "              ta..." + "'", str1, "              ta...");
    }

    @Test
    public void test29247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29247");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zh_CN" + "'", str1, "zh_CN");
    }

    @Test
    public void test29248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29248");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "Ital");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test29249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29249");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test29250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29250");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("frnz\366sisch#########################################)ylatI( nailatIzzzc)ylatI( nailatIzzzne)ylatI( nailatIzzzlafrnz\366sisch ", "HHHHHHHHH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test29251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29251");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("", 16, 405);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test29252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29252");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRdeRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test29253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29253");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("8600u\\");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "8600u\\" + "'", str1, "8600u\\");
    }

    @Test
    public void test29254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29254");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "\\u0066");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test29255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29255");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("\\u0066", '\\');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "u0066" + "'", str2, "u0066");
    }

    @Test
    public void test29256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29256");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("HHHHHHHHHHtTAHHHHHHHHHHT_ITAHHHHHHHHHHtTAHHHHHHHHHHT_ITAHHHHHHHHHHtTAHHHHHHHHHHT_ITAHHHHHHHHHHtTAHHHHHHHHHHT_ITAHHHHHHHHHHtTAHHHHHHHHHHT_ITAHHHHHHHHHHtTAHHHHHHHHHHT_ITAHHHHHHHHHHtTAHHHHHHHHHHT_ITAHHHHHHHHHHtTAHHHHHHHHHHT_ITAHHHHHHHHHHtTAHHHHHHHHHHT_ITAHHHHHHHHHHtTAHHHHHHHHHHT_ZH_cnFrench (Canada)HHHHHHHHHHtTAHHHHHHHHHHT_ITAHHHHHHHHHHtTAHHHHHHHHHHT_ITAHHHHHHHHHHtTAHHHHHHHHHHT_ITAHHHHHHHHHHtTAHHHHHHHHHHT_ITAHHHHHHHHHHtTAHHHHHHHHHHT_ITAHHHHHHHHHHtTAHHHHHHHHHHT_ITAHHHHHHHHHHtTAHHHHHHHHHHT_ITAHHHHHHHHHHtTAHHHHHHHHHHT_ITAHHHHHHHHHHtTAHHHHHHHHHHT_ITAHHHHHHHHHHtTAHHHHHHHHHHT_", "ILATiNA...", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test29257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29257");
        java.util.Locale locale1 = java.util.Locale.GERMAN;
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale1.getDisplayName(locale2);
        java.util.Locale locale4 = locale1.stripExtensions();
        java.util.Locale locale5 = locale1.stripExtensions();
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.upperCase("", locale1);
        java.util.Locale locale7 = java.util.Locale.FRANCE;
        java.util.Locale locale8 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str9 = locale7.getDisplayScript(locale8);
        java.util.Locale locale10 = java.util.Locale.FRANCE;
        java.util.Locale locale11 = java.util.Locale.ITALIAN;
        java.lang.String str13 = locale11.getExtension('h');
        java.lang.String str14 = locale10.getDisplayScript(locale11);
        java.lang.String str15 = locale10.getISO3Country();
        java.lang.String str16 = locale8.getDisplayVariant(locale10);
        java.lang.String str17 = locale10.getCountry();
        java.lang.String str18 = locale1.getDisplayLanguage(locale10);
        java.util.Locale locale19 = java.util.Locale.FRANCE;
        java.util.Locale locale20 = java.util.Locale.ITALIAN;
        java.lang.String str22 = locale20.getExtension('h');
        java.lang.String str23 = locale19.getDisplayScript(locale20);
        java.util.Locale locale24 = locale19.stripExtensions();
        java.lang.String str25 = locale24.getISO3Country();
        java.util.Locale locale27 = new java.util.Locale("en");
        boolean boolean28 = locale27.hasExtensions();
        java.util.Set<java.lang.String> strSet29 = locale27.getUnicodeLocaleKeys();
        java.lang.String str30 = locale24.getDisplayCountry(locale27);
        java.util.Locale.setDefault(locale24);
        java.lang.String str32 = locale24.getISO3Country();
        java.lang.String str33 = locale1.getDisplayCountry(locale24);
        java.lang.String str34 = locale1.getISO3Country();
        java.lang.String str35 = locale1.getDisplayScript();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "de");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "allemand" + "'", str3, "allemand");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "de");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "de");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "it");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "FRA" + "'", str15, "FRA");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "FR" + "'", str17, "FR");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "allemand" + "'", str18, "allemand");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "it");
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "FRA" + "'", str25, "FRA");
        org.junit.Assert.assertEquals(locale27.toString(), "en");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(strSet29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "France" + "'", str30, "France");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "FRA" + "'", str32, "FRA");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
    }

    @Test
    public void test29258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29258");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.lang.String str1 = locale0.getDisplayLanguage();
        java.util.Locale locale2 = java.util.Locale.ITALIAN;
        java.lang.String str4 = locale2.getExtension('h');
        java.lang.String str5 = locale0.getDisplayCountry(locale2);
        java.util.Set<java.lang.String> strSet6 = locale2.getUnicodeLocaleKeys();
        java.util.Locale locale8 = java.util.Locale.forLanguageTag("\\u0020");
        java.lang.String str9 = locale8.getDisplayScript();
        java.util.Locale.setDefault(locale8);
        java.lang.String str11 = locale8.getScript();
        java.lang.String str12 = locale2.getDisplayVariant(locale8);
        java.util.Locale locale13 = locale8.stripExtensions();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "italien" + "'", str1, "italien");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "it");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "");
    }

    @Test
    public void test29259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29259");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("00000000000000cor\351en (Cor\351e du Sud)", 280, 60);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "00000000000000cor\351en (Cor\351e du Sud)" + "'", str3, "00000000000000cor\351en (Cor\351e du Sud)");
    }

    @Test
    public void test29260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29260");
        java.util.Locale.Builder builder1 = new java.util.Locale.Builder();
        java.util.Locale locale2 = builder1.build();
        java.util.Locale locale4 = java.util.Locale.forLanguageTag("Italian");
        java.lang.String str5 = locale2.getDisplayLanguage(locale4);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.upperCase("", locale4);
        java.lang.String str7 = locale4.getScript();
        java.util.Set<java.lang.String> strSet8 = locale4.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.String> strSet9 = locale4.getUnicodeLocaleKeys();
        java.util.Locale.setDefault(locale4);
        java.lang.String str11 = locale4.getLanguage();
        java.util.Set<java.lang.Character> charSet12 = locale4.getExtensionKeys();
        java.util.Locale locale13 = locale4.stripExtensions();
        java.lang.String str14 = locale13.getISO3Country();
        java.util.Locale locale15 = locale13.stripExtensions();
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "italian");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "italian" + "'", str11, "italian");
        org.junit.Assert.assertNotNull(charSet12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "italian");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "italian");
    }

    @Test
    public void test29261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29261");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "\\u0066", 0);
        java.lang.String[] strArray6 = java.util.Locale.getISOCountries();
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray6);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("4", strArray5, strArray6);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray6);
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.stripAll(strArray6, "HSIAGE_NAILATI_TIATTIHI!_NAILATI         HSILGNE_NAILATI_NAILAT");
        boolean boolean14 = org.apache.commons.lang3.StringUtils.startsWithAny("italie                          (\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rZ...\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r)", strArray6);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZW" + "'", str7, "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZW");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZW" + "'", str8, "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZW");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "4" + "'", str10, "4");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test29262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29262");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("NAC", (int) 'G', 133);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test29263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29263");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("\\u0034\\u00                                   en_C\\u0034\\u00", (int) '\r', "                                                                             zhzhzhzhzhzhzhzhzhzhfraazhaezhafzhagzhaizhalzhamzhanzhaozhaqzharzhaszhazhzhzhzhzhzhzhzhzhz2222222222222222222222222222222222222222222222222222222222222222222222222");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\u0034\\u00                                   en_C\\u0034\\u00" + "'", str3, "\\u0034\\u00                                   en_C\\u0034\\u00");
    }

    @Test
    public void test29264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29264");
        java.util.Locale locale1 = java.util.Locale.CHINESE;
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("         italian_ITALIAN_English", locale1);
        java.util.Set<java.lang.String> strSet3 = locale1.getUnicodeLocaleAttributes();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "         italian_italian_english" + "'", str2, "         italian_italian_english");
        org.junit.Assert.assertNotNull(strSet3);
    }

    @Test
    public void test29265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29265");
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
        java.util.Locale locale14 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale.setDefault(category0, locale14);
        java.util.Locale locale16 = java.util.Locale.getDefault(category0);
        java.util.Set<java.lang.Character> charSet17 = locale16.getExtensionKeys();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "italian");
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
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "");
        org.junit.Assert.assertNotNull(charSet17);
    }

    @Test
    public void test29266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29266");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("italiIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIITALIAN_italian_eNGLISHIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII                                             hcsfr-CueD                                                                                          hcsfr-CueD  i");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "italiIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIITALIAN_italian_eNGLISHIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII                                             hcsfr-CueD                                                                                          hcsfr-CueD  i" + "'", str1, "italiIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIITALIAN_italian_eNGLISHIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII                                             hcsfr-CueD                                                                                          hcsfr-CueD  i");
    }

    @Test
    public void test29267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29267");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("kOREAN (sOUTH kOR", 6);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "kOREAN (sOUTH kORkOREAN (sOUTH kORkOREAN (sOUTH kORkOREAN (sOUTH kORkOREAN (sOUTH kORkOREAN (sOUTH kOR" + "'", str2, "kOREAN (sOUTH kORkOREAN (sOUTH kORkOREAN (sOUTH kORkOREAN (sOUTH kORkOREAN (sOUTH kORkOREAN (sOUTH kOR");
    }

    @Test
    public void test29268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29268");
        java.util.Locale.Builder builder1 = new java.util.Locale.Builder();
        java.util.Locale locale2 = builder1.build();
        java.util.Locale locale4 = java.util.Locale.forLanguageTag("Italian");
        java.lang.String str5 = locale2.getDisplayLanguage(locale4);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.upperCase("", locale4);
        java.lang.String str7 = locale4.getScript();
        java.util.Set<java.lang.String> strSet8 = locale4.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.String> strSet9 = locale4.getUnicodeLocaleKeys();
        java.util.Locale.setDefault(locale4);
        java.lang.String str11 = locale4.getDisplayLanguage();
        java.util.Set<java.lang.String> strSet12 = locale4.getUnicodeLocaleKeys();
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "italian");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "italian" + "'", str11, "italian");
        org.junit.Assert.assertNotNull(strSet12);
    }

    @Test
    public void test29269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29269");
        java.lang.String[] strArray1 = null;
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("\\u006e");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replaceEach("\\u0020iItalian\\u008600u\\\\atalaaa_ITALIAN_Eaglaaa\\u0020iItalian\\u008600u\\Ueutsc\\u0020iItalian\\u008600u\\\\atalaaa_ITALIAN_Eaglaaa\\u0020iItalian\\u008600u\\U", strArray1, strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\u0020iItalian\\u008600u\\\\atalaaa_ITALIAN_Eaglaaa\\u0020iItalian\\u008600u\\Ueutsc\\u0020iItalian\\u008600u\\\\atalaaa_ITALIAN_Eaglaaa\\u0020iItalian\\u008600u\\U" + "'", str4, "\\u0020iItalian\\u008600u\\\\atalaaa_ITALIAN_Eaglaaa\\u0020iItalian\\u008600u\\Ueutsc\\u0020iItalian\\u008600u\\\\atalaaa_ITALIAN_Eaglaaa\\u0020iItalian\\u008600u\\U");
    }

    @Test
    public void test29270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29270");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("francese (Francia)", "\\u000d");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test29271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29271");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("Italian");
        java.lang.String str2 = locale1.getVariant();
        java.lang.String str3 = locale1.getVariant();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "italian");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test29272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29272");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzHSXLGNE_NAILATI_NAXLATX\\zzzzz...", "00CCCC\\CCCC0000000000000000000000000000000000000000000000000000000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzHSXLGNE_NAILATI_NAXLATX\\zzzzz..." + "'", str2, "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzHSXLGNE_NAILATI_NAXLATX\\zzzzz...");
    }

    @Test
    public void test29273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29273");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiAlpha('-');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test29274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29274");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("DEUTSCH");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfAny("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!itTAiT_ITALIAN_EgAish!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\\u0068", strArray2);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "DEUTSCH" + "'", str4, "DEUTSCH");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "DEUTSCH" + "'", str5, "DEUTSCH");
    }

    @Test
    public void test29275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29275");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "ffffffffffffffffffffffffffffffffFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAfffffffffffffffffffffffffffffffff", 56);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("English", "Italian");
        int int8 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray7);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray7);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray7);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray7);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEach("c500u", strArray4, strArray7);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray7, '9', 96, 71);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Egsh" + "'", str11, "Egsh");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "c500u" + "'", str12, "c500u");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test29276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29276");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!", "                EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE                 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test29277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29277");
        java.util.Locale locale1 = java.util.Locale.FRANCE;
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale1.getDisplayScript(locale2);
        java.lang.String str4 = locale2.getVariant();
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.lowerCase("\\u0034", locale2);
        java.lang.String str6 = locale2.getCountry();
        java.lang.String str7 = locale2.toString();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\\u0034" + "'", str5, "\\u0034");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CA" + "'", str6, "CA");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "fr_CA" + "'", str7, "fr_CA");
    }

    @Test
    public void test29278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29278");
        java.util.Locale locale2 = new java.util.Locale("Italienisch#########################################################################################", "hcsFrz\366cz(frkrec)Frz\366cz(frkrec)Frz\366cz(frkrec)Frz\366cz(frkrec)Frz\366cz(frkreitalyneFrz\366cz(frkrec)Frz\366cz(frkrec)Frz\366cz(frkrec)Frz\366cz(frkrec)Frz\366cz(frkreitalylaFrz\366cz(frkrec)Frz\366cz(frkrec)Frz\366cz(frkrec)Frz\366cz(frkrec)Frz\366cz(frkreitaly");
        org.junit.Assert.assertEquals(locale2.toString(), "italienisch#########################################################################################_HCSFRZ\366CZ(FRKREC)FRZ\366CZ(FRKREC)FRZ\366CZ(FRKREC)FRZ\366CZ(FRKREC)FRZ\366CZ(FRKREITALYNEFRZ\366CZ(FRKREC)FRZ\366CZ(FRKREC)FRZ\366CZ(FRKREC)FRZ\366CZ(FRKREC)FRZ\366CZ(FRKREITALYLAFRZ\366CZ(FRKREC)FRZ\366CZ(FRKREC)FRZ\366CZ(FRKREC)FRZ\366CZ(FRKREC)FRZ\366CZ(FRKREITALY");
    }

    @Test
    public void test29279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29279");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("GBR");
        java.lang.String str2 = languageRange1.getRange();
        double double3 = languageRange1.getWeight();
        java.lang.String str4 = languageRange1.getRange();
        java.lang.String str5 = languageRange1.getRange();
        java.lang.String str6 = languageRange1.getRange();
        java.util.Locale locale9 = new java.util.Locale("Englisch", "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDh...");
        java.lang.String str10 = locale9.getCountry();
        boolean boolean11 = languageRange1.equals((java.lang.Object) str10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "gbr" + "'", str2, "gbr");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "gbr" + "'", str4, "gbr");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "gbr" + "'", str5, "gbr");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "gbr" + "'", str6, "gbr");
        org.junit.Assert.assertEquals(locale9.toString(), "englisch_ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDH...");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDH..." + "'", str10, "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDH...");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test29280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29280");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("E");
        java.lang.String str2 = languageRange1.getRange();
        double double3 = languageRange1.getWeight();
        java.lang.String str4 = languageRange1.getRange();
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens(")", 'a');
        boolean boolean8 = languageRange1.equals((java.lang.Object) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "e" + "'", str2, "e");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "e" + "'", str4, "e");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test29281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29281");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("keagaasheagaasheagaasheagaasheagaasheagaasheagaasheagaasheagaasheagaasheagaasheagaasheagaasheagaashe", "dddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddFranzosisch (Frankreich)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "keagaasheagaasheagaasheagaasheagaasheagaasheagaasheagaasheagaasheagaasheagaasheagaasheagaasheagaashe" + "'", str2, "keagaasheagaasheagaasheagaasheagaasheagaasheagaasheagaasheagaasheagaasheagaasheagaasheagaasheagaashe");
    }

    @Test
    public void test29282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29282");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "                               ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test29283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29283");
        char[] charArray14 = new char[] { ' ', '4' };
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!", charArray14);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray14);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "h", charArray14);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "h", charArray14);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "iTALIAN", charArray14);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "FRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFR", charArray14);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "...", charArray14);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsAny("ran\347ais (France)                                      f                                     ", charArray14);
        int int23 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "  \\u0020iTALIANiTALIANiTALIANiTAL  ", charArray14);
        boolean boolean24 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "HCSTUED", charArray14);
        boolean boolean25 = org.apache.commons.lang3.StringUtils.containsAny("erma (ermay)                                                 TALIAN                                                  ", charArray14);
        boolean boolean26 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "Franz\366sisch (KanadaFranz\366sisch (KanadaFranz\366sischGerma", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test29284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29284");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("en-GBDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHD");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test29285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29285");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("francese", strMap1);
        java.util.Locale locale4 = java.util.Locale.ITALIAN;
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.upperCase("de_DE", locale4);
        java.util.Set<java.lang.String> strSet6 = locale4.getUnicodeLocaleKeys();
        java.lang.String str7 = java.util.Locale.lookupTag(languageRangeList2, (java.util.Collection<java.lang.String>) strSet6);
        java.util.Locale locale8 = java.util.Locale.GERMAN;
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = locale8.getDisplayName(locale9);
        java.util.Set<java.lang.String> strSet11 = locale8.getUnicodeLocaleAttributes();
        java.util.Locale.FilteringMode filteringMode12 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList13 = java.util.Locale.filterTags(languageRangeList2, (java.util.Collection<java.lang.String>) strSet11, filteringMode12);
        java.util.Locale.LanguageRange[] languageRangeArray14 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList15 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList15, languageRangeArray14);
        java.lang.String[] strArray19 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList20 = new java.util.ArrayList<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList20, strArray19);
        java.util.Locale.FilteringMode filteringMode22 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList23 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList15, (java.util.Collection<java.lang.String>) strList20, filteringMode22);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList25 = java.util.Locale.LanguageRange.parse("fr");
        java.util.Locale.LanguageRange[] languageRangeArray26 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList27 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList27, languageRangeArray26);
        java.util.Locale.LanguageRange[] languageRangeArray29 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList30 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList30, languageRangeArray29);
        java.lang.String[] strArray34 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList35 = new java.util.ArrayList<java.lang.String>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList35, strArray34);
        java.util.Locale.FilteringMode filteringMode37 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList38 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList30, (java.util.Collection<java.lang.String>) strList35, filteringMode37);
        java.util.Locale.FilteringMode filteringMode39 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList40 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList27, (java.util.Collection<java.lang.String>) strList35, filteringMode39);
        java.util.Locale.FilteringMode filteringMode41 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList42 = java.util.Locale.filterTags(languageRangeList25, (java.util.Collection<java.lang.String>) strList35, filteringMode41);
        java.util.List<java.lang.String> strList43 = java.util.Locale.filterTags(languageRangeList2, (java.util.Collection<java.lang.String>) strList20, filteringMode41);
        java.util.Locale.LanguageRange[] languageRangeArray44 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList45 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList45, languageRangeArray44);
        java.util.Locale.LanguageRange[] languageRangeArray47 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList48 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList48, languageRangeArray47);
        java.lang.String[] strArray52 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList53 = new java.util.ArrayList<java.lang.String>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList53, strArray52);
        java.util.Locale.FilteringMode filteringMode55 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList56 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList48, (java.util.Collection<java.lang.String>) strList53, filteringMode55);
        java.util.Locale.FilteringMode filteringMode57 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList58 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList45, (java.util.Collection<java.lang.String>) strList53, filteringMode57);
        java.util.Locale locale59 = java.util.Locale.US;
        java.lang.String str60 = locale59.getScript();
        java.util.Set<java.lang.String> strSet61 = locale59.getUnicodeLocaleAttributes();
        java.lang.String str63 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet61, 'A');
        java.util.List<java.lang.String> strList64 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList45, (java.util.Collection<java.lang.String>) strSet61);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap65 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList66 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList45, strMap65);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap67 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList68 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList66, strMap67);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap69 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList70 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList68, strMap69);
        java.util.Locale locale72 = java.util.Locale.forLanguageTag("\\u0061");
        java.util.Set<java.lang.String> strSet73 = locale72.getUnicodeLocaleAttributes();
        java.util.List<java.lang.String> strList74 = java.util.Locale.filterTags(languageRangeList70, (java.util.Collection<java.lang.String>) strSet73);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList76 = java.util.Locale.LanguageRange.parse("fr");
        java.util.Locale.LanguageRange[] languageRangeArray77 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList78 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList78, languageRangeArray77);
        java.util.Locale.LanguageRange[] languageRangeArray80 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList81 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList81, languageRangeArray80);
        java.lang.String[] strArray85 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList86 = new java.util.ArrayList<java.lang.String>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList86, strArray85);
        java.util.Locale.FilteringMode filteringMode88 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList89 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList81, (java.util.Collection<java.lang.String>) strList86, filteringMode88);
        java.util.Locale.FilteringMode filteringMode90 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList91 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList78, (java.util.Collection<java.lang.String>) strList86, filteringMode90);
        java.util.Locale.FilteringMode filteringMode92 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList93 = java.util.Locale.filterTags(languageRangeList76, (java.util.Collection<java.lang.String>) strList86, filteringMode92);
        java.util.List<java.lang.String> strList94 = java.util.Locale.filterTags(languageRangeList2, (java.util.Collection<java.lang.String>) strSet73, filteringMode92);
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "it");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "DE_DE" + "'", str5, "DE_DE");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "de");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "allemand" + "'", str10, "allemand");
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertTrue("'" + filteringMode12 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode12.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(languageRangeArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + filteringMode22 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode22.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertNotNull(languageRangeList25);
        org.junit.Assert.assertNotNull(languageRangeArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(languageRangeArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + filteringMode37 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode37.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList38);
        org.junit.Assert.assertTrue("'" + filteringMode39 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode39.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList40);
        org.junit.Assert.assertTrue("'" + filteringMode41 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode41.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList42);
        org.junit.Assert.assertNotNull(strList43);
        org.junit.Assert.assertNotNull(languageRangeArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(languageRangeArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + filteringMode55 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode55.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList56);
        org.junit.Assert.assertTrue("'" + filteringMode57 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode57.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList58);
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertNotNull(strSet61);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertNotNull(strList64);
        org.junit.Assert.assertNotNull(languageRangeList66);
        org.junit.Assert.assertNotNull(languageRangeList68);
        org.junit.Assert.assertNotNull(languageRangeList70);
        org.junit.Assert.assertNotNull(locale72);
        org.junit.Assert.assertEquals(locale72.toString(), "");
        org.junit.Assert.assertNotNull(strSet73);
        org.junit.Assert.assertNotNull(strList74);
        org.junit.Assert.assertNotNull(languageRangeList76);
        org.junit.Assert.assertNotNull(languageRangeArray77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(languageRangeArray80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(strArray85);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertTrue("'" + filteringMode88 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode88.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList89);
        org.junit.Assert.assertTrue("'" + filteringMode90 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode90.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList91);
        org.junit.Assert.assertTrue("'" + filteringMode92 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode92.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList93);
        org.junit.Assert.assertNotNull(strList94);
    }

    @Test
    public void test29286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29286");
        java.util.Locale locale3 = new java.util.Locale("                                     fran\347ais (france)                                      ", "\\u0020hi!       _\\U0020_Italienisch################anihc", "fr-CAfr-CAfr-C8600u\\fr-CAfr-CAfr-CA");
        java.lang.String str4 = locale3.toString();
        org.junit.Assert.assertEquals(locale3.toString(), "                                     fran\347ais (france)                                      _\\U0020HI!       _\\U0020_ITALIENISCH################ANIHC_fr-CAfr-CAfr-C8600u\\fr-CAfr-CAfr-CA");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                     fran\347ais (france)                                      _\\U0020HI!       _\\U0020_ITALIENISCH################ANIHC_fr-CAfr-CAfr-C8600u\\fr-CAfr-CAfr-CA" + "'", str4, "                                     fran\347ais (france)                                      _\\U0020HI!       _\\U0020_ITALIENISCH################ANIHC_fr-CAfr-CAfr-C8600u\\fr-CAfr-CAfr-CA");
    }

    @Test
    public void test29287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29287");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setLanguage("ENGLISCH");
        java.util.Locale.Builder builder4 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder0.clearExtensions();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test29288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29288");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "Frnz\366sisch(KndFrnz\366sisch(KndFrnz\366sisch(KndFrnz\366sisch(KndFEEEEEEEEEEEEE");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test29289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29289");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkEDkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkEDkk");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test29290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29290");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('I', 309);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 309 + "'", int2 == 309);
    }

    @Test
    public void test29291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29291");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("FRANZ\326SISCHFRANZOSISCH (FRANKREICH)", "E g", 32);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test29292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29292");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("CHINESE");
        java.lang.String str2 = languageRange1.getRange();
        java.lang.String str3 = languageRange1.getRange();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "chinese" + "'", str2, "chinese");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chinese" + "'", str3, "chinese");
    }

    @Test
    public void test29293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29293");
        char[] charArray8 = new char[] { 'f', '4' };
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "Chinese (China)", charArray8);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "itTAiT_ITALIAN_EgAish", charArray8);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "d", charArray8);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "44444444444444444444444444444444", charArray8);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny("IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII", charArray8);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u0029nnnnnnnnnnnnnnn", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "f4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "f4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[f, 4]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test29294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29294");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("EFrankreichgFrankreichFrankreichs", "INGLESE (cANADA)");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test29295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29295");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("rrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrefrankreichgfrankreichfrankreichs");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "rrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrefrankreichgfrankreichfrankreichs" + "'", str1, "rrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrefrankreichgfrankreichfrankreichs");
    }

    @Test
    public void test29296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29296");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("ZH_cnFrench (Canada)AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\\u0020iItalian\\u0020i                                                 ", "erma (ermay)                                                 TALIAN                                                  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ZH_cnFrench (Canada)AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\\u0020iItalian\\u0020i                                                 " + "'", str2, "ZH_cnFrench (Canada)AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\\u0020iItalian\\u0020i                                                 ");
    }

    @Test
    public void test29297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29297");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("", "fran\347ais (canaaa)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test29298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29298");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("\uad6d\uc911\uc5b4\uad6d\uc911IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII", 194);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\uad6d\uc911\uc5b4\uad6d\uc911IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII                                                                                                                                                 " + "'", str2, "\uad6d\uc911\uc5b4\uad6d\uc911IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII                                                                                                                                                 ");
    }

    @Test
    public void test29299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29299");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("44444444ITALIAN444444444444444444444444ITALIAN444444444444444444444444ITALIAN444444444444444444444444ITALIAN444444444444444444444444ITALIAN444444444444444444444444ITALIAN444444444444444444444444ITALIAN444444444444444444444444ITALIAN444444444444444444444444ITALIAN4444444444", " NAILATI             ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test29300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29300");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("hsxlgnE_NAILATI_naxlatx\\", 113, 'n');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hsxlgnE_NAILATI_naxlatx\\nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn" + "'", str3, "hsxlgnE_NAILATI_naxlatx\\nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn");
    }

    @Test
    public void test29301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29301");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnEN_CA", "x-lvariant-zhIIIIIIII");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test29302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29302");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "FrancGa", (java.lang.CharSequence) "22222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222allemand22222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "FrancGa" + "'", charSequence2, "FrancGa");
    }

    @Test
    public void test29303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29303");
        java.util.Locale locale1 = new java.util.Locale("ENGLISH");
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("Frnz\366sischt(Knd)                        ");
        java.lang.String str4 = locale1.getDisplayVariant(locale3);
        org.junit.Assert.assertEquals(locale1.toString(), "english");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test29304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29304");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiAlphaUpper('j');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test29305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29305");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder5 = builder4.clear();
        java.util.Locale.Builder builder7 = builder5.setLanguage("ITALIAN");
        java.util.Locale.Builder builder8 = builder5.clear();
        java.util.Locale locale9 = builder5.build();
        java.util.Locale locale10 = builder5.build();
        java.util.Locale.Builder builder11 = builder5.clearExtensions();
        java.util.Locale locale12 = builder11.build();
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
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
    }

    @Test
    public void test29306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29306");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("\\0020!TALIAN!TALIAN!TALIAIAN_Englishallemzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz", "\n", 6);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\00\nzz" + "'", str3, "\\00\nzz");
    }

    @Test
    public void test29307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29307");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("\u97d3\u6587\u5357\u97d3)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=?? (??)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test29308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29308");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        java.util.Locale locale4 = builder3.build();
        java.lang.String str5 = locale4.getISO3Country();
        java.lang.String str6 = locale4.getLanguage();
        java.util.Set<java.lang.String> strSet7 = locale4.getUnicodeLocaleAttributes();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strSet7);
    }

    @Test
    public void test29309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29309");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "             DE_DE            uuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "             DE_DE            uuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str1, "             DE_DE            uuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test29310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29310");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("it-IT", strMap1);
        java.util.Locale.LanguageRange[] languageRangeArray3 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList4 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList4, languageRangeArray3);
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        java.util.Locale.FilteringMode filteringMode11 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList12 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.lang.String>) strList9, filteringMode11);
        java.util.Locale.LanguageRange[] languageRangeArray13 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList14 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList14, languageRangeArray13);
        java.lang.String[] strArray18 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        java.util.Locale.FilteringMode filteringMode21 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList22 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList14, (java.util.Collection<java.lang.String>) strList19, filteringMode21);
        java.lang.String[] strArray24 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList25 = new java.util.ArrayList<java.lang.String>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList25, strArray24);
        java.util.List<java.lang.String> strList27 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList14, (java.util.Collection<java.lang.String>) strList25);
        java.lang.String str28 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.lang.String>) strList25);
        java.util.Locale locale29 = java.util.Locale.CANADA_FRENCH;
        java.util.Set<java.lang.String> strSet30 = locale29.getUnicodeLocaleKeys();
        java.lang.String str31 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.lang.String>) strSet30);
        java.util.Locale.LanguageRange[] languageRangeArray32 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList33 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList33, languageRangeArray32);
        java.lang.String[] strArray37 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList38 = new java.util.ArrayList<java.lang.String>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList38, strArray37);
        java.util.Locale.FilteringMode filteringMode40 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList41 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList33, (java.util.Collection<java.lang.String>) strList38, filteringMode40);
        java.util.Locale.LanguageRange[] languageRangeArray42 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList43 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList43, languageRangeArray42);
        java.lang.String[] strArray47 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList48 = new java.util.ArrayList<java.lang.String>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList48, strArray47);
        java.util.Locale.FilteringMode filteringMode50 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList51 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList43, (java.util.Collection<java.lang.String>) strList48, filteringMode50);
        java.lang.String[] strArray53 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList54 = new java.util.ArrayList<java.lang.String>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList54, strArray53);
        java.util.List<java.lang.String> strList56 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList43, (java.util.Collection<java.lang.String>) strList54);
        java.lang.String str57 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList33, (java.util.Collection<java.lang.String>) strList54);
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
        java.util.Locale.LanguageRange[] languageRangeArray76 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList77 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList77, languageRangeArray76);
        java.lang.String[] strArray81 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList82 = new java.util.ArrayList<java.lang.String>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList82, strArray81);
        java.util.Locale.FilteringMode filteringMode84 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList85 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList77, (java.util.Collection<java.lang.String>) strList82, filteringMode84);
        java.util.Locale.FilteringMode filteringMode86 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList87 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList74, (java.util.Collection<java.lang.String>) strList82, filteringMode86);
        java.util.List<java.lang.String> strList88 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList33, (java.util.Collection<java.lang.String>) strList72, filteringMode86);
        java.util.List<java.lang.String> strList89 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.lang.String>) strList72);
        java.util.List<java.lang.String> strList90 = java.util.Locale.filterTags(languageRangeList2, (java.util.Collection<java.lang.String>) strList72);
        java.lang.String str92 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strList72, '\r');
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + filteringMode11 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode11.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(languageRangeArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + filteringMode21 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode21.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(strList27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(strSet30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(languageRangeArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + filteringMode40 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode40.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList41);
        org.junit.Assert.assertNotNull(languageRangeArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + filteringMode50 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode50.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList51);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(strList56);
        org.junit.Assert.assertNull(str57);
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
        org.junit.Assert.assertNotNull(languageRangeArray76);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(strArray81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertTrue("'" + filteringMode84 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode84.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList85);
        org.junit.Assert.assertTrue("'" + filteringMode86 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode86.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList87);
        org.junit.Assert.assertNotNull(strList88);
        org.junit.Assert.assertNotNull(strList89);
        org.junit.Assert.assertNotNull(strList90);
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "" + "'", str92, "");
    }

    @Test
    public void test29311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29311");
        java.util.Locale locale0 = java.util.Locale.CHINESE;
        java.util.Locale locale1 = java.util.Locale.FRENCH;
        java.lang.String str2 = locale1.getDisplayName();
        java.lang.String str4 = locale1.getExtension('C');
        java.lang.String str5 = locale0.getDisplayLanguage(locale1);
        java.lang.String str6 = locale1.toLanguageTag();
        java.lang.String str7 = locale1.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "French" + "'", str2, "French");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chinois" + "'", str5, "chinois");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "fr" + "'", str6, "fr");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "fr" + "'", str7, "fr");
    }

    @Test
    public void test29312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29312");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder14 = builder12.setLanguageTag("Italia                                                  ");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: Italia                                                   [at index 0]");
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
    }

    @Test
    public void test29313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29313");
        java.util.Locale locale1 = java.util.Locale.GERMAN;
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale1.getDisplayName(locale2);
        java.util.Locale.setDefault(locale2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.upperCase("8600u\\                                                                                                                  ", locale2);
        java.lang.String str6 = locale2.getDisplayName();
        java.lang.String str7 = locale2.getVariant();
        java.lang.String str8 = locale2.getCountry();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "de");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "allemand" + "'", str3, "allemand");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "8600U\\                                                                                                                  " + "'", str5, "8600U\\                                                                                                                  ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "fran\347ais (Canada)" + "'", str6, "fran\347ais (Canada)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CA" + "'", str8, "CA");
    }

    @Test
    public void test29314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29314");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale locale2 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder3.setUnicodeLocaleKeyword("italian (italian,eng", "             hcsineilati             dddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: italian (italian,eng [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test29315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29315");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("nglish ...nglish ...nglish ...nglichinoisf(Chine)", "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test29316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29316");
        java.util.Locale locale3 = new java.util.Locale("                                                 ", "HHHHHHHHHHtTAHHHHHHHHHHT_ITA", "franci");
        org.junit.Assert.assertEquals(locale3.toString(), "                                                 _HHHHHHHHHHTTAHHHHHHHHHHT_ITA_franci");
    }

    @Test
    public void test29317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29317");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("f(KOREAN)", "fran\347ais(france)(CHINESE(CHINA)fran\347ais(france)(CHINE...ALzhAMzhANzhAOzhAQzhARzhASzhA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "KOREAN)" + "'", str2, "KOREAN)");
    }

    @Test
    public void test29318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29318");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("it_I", "    \\    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "it_I" + "'", str2, "it_I");
    }

    @Test
    public void test29319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29319");
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
            java.util.Locale.Builder builder9 = builder6.setVariant("9hhhhhhhhhh                                                             hi!");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: 9hhhhhhhhhh                                                             hi! [at index 0]");
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
    public void test29320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29320");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("Hhhhhhhhh", "an\\u00");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test29321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29321");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("                                  !ih                            dalleman                                  !ih                            dalleman                                  !ih                            dalleman                                  !ih                            dalleman                                  !ih                            dalleman                                  !ih                            dalleman                                  !ih                            dalleman                ZH_CNGGGGG");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                  !IH                            DALLEMAN                                  !IH                            DALLEMAN                                  !IH                            DALLEMAN                                  !IH                            DALLEMAN                                  !IH                            DALLEMAN                                  !IH                            DALLEMAN                                  !IH                            DALLEMAN                zh_cnggggg" + "'", str1, "                                  !IH                            DALLEMAN                                  !IH                            DALLEMAN                                  !IH                            DALLEMAN                                  !IH                            DALLEMAN                                  !IH                            DALLEMAN                                  !IH                            DALLEMAN                                  !IH                            DALLEMAN                zh_cnggggg");
    }

    @Test
    public void test29322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29322");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("FRANZ\326SISCH\n(FRANKREICH)HSIAGE_NAILATI_TIATTIHI!_NAILATI         HSILGNE_NAILATI_", 507);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "FRANZ\326SISCH\n(FRANKREICH)HSIAGE_NAILATI_TIATTIHI!_NAILATI         HSILGNE_NAILATI_" + "'", str2, "FRANZ\326SISCH\n(FRANKREICH)HSIAGE_NAILATI_TIATTIHI!_NAILATI         HSILGNE_NAILATI_");
    }

    @Test
    public void test29323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29323");
        java.util.Locale locale2 = java.util.Locale.forLanguageTag("France");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.upperCase("inglese", locale2);
        java.util.Locale locale6 = new java.util.Locale("                                     fran\347ais (France)                                      ", "Chinese (China");
        java.lang.String str7 = locale6.getDisplayVariant();
        java.lang.String str8 = locale6.getCountry();
        java.lang.String str9 = locale2.getDisplayVariant(locale6);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "france");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "INGLESE" + "'", str3, "INGLESE");
        org.junit.Assert.assertEquals(locale6.toString(), "                                     fran\347ais (france)                                      _CHINESE (CHINA");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CHINESE (CHINA" + "'", str8, "CHINESE (CHINA");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test29324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29324");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("                                             DE_DE                                             ", "Frankreich)kkkkkkkkkkkkkkkkkkkEnglFrankreich)kkkkkkkkkkkkkkkkkkk", "\\u0030");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                             DE_DE                                             " + "'", str3, "                                             DE_DE                                             ");
    }

    @Test
    public void test29325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29325");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("!ih_HHHHHHHHHHDxxxxxxxxxxxxxxxxxxx                             ...titxxxxxxxxxxxxxxxxxx                             ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!IH_hhhhhhhhhhdXXXXXXXXXXXXXXXXXXX                             ...TITXXXXXXXXXXXXXXXXXX                             ..." + "'", str1, "!IH_hhhhhhhhhhdXXXXXXXXXXXXXXXXXXX                             ...TITXXXXXXXXXXXXXXXXXX                             ...");
    }

    @Test
    public void test29326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29326");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("TALIAN_ITALIAN_ENGLISH         ITALIAN_!IHITTAIT_ITALIAN_EGAISH");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test29327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29327");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("E             g                          sh", 88);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "E             g                          sh" + "'", str2, "E             g                          sh");
    }

    @Test
    public void test29328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29328");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\\u0038zho                          ");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfAny("hzhzhzhzhzhzhzhzhzhzAhzSAhzRAhzQAhzOAhzNA", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test29329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29329");
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
        java.util.Locale locale21 = java.util.Locale.getDefault(category0);
        java.util.Locale locale22 = java.util.Locale.ITALIAN;
        java.lang.String str23 = locale22.getDisplayLanguage();
        java.util.Locale locale24 = locale22.stripExtensions();
        java.util.Locale locale26 = java.util.Locale.forLanguageTag("\\u0020");
        java.lang.String str27 = locale26.getDisplayScript();
        java.lang.String str28 = locale24.getDisplayCountry(locale26);
        java.util.Locale.Builder builder29 = new java.util.Locale.Builder();
        java.util.Locale locale30 = builder29.build();
        java.util.Locale locale32 = java.util.Locale.forLanguageTag("Italian");
        java.lang.String str33 = locale30.getDisplayLanguage(locale32);
        java.lang.String str34 = locale24.getDisplayLanguage(locale30);
        java.lang.String str36 = locale30.getExtension('u');
        java.util.Set<java.lang.String> strSet37 = locale30.getUnicodeLocaleAttributes();
        java.lang.String str38 = locale30.getVariant();
        java.lang.String str39 = locale30.getDisplayLanguage();
        java.util.Locale locale41 = java.util.Locale.CHINESE;
        java.lang.String str42 = org.apache.commons.lang3.StringUtils.lowerCase("Franz\366sisch (Frankreich)", locale41);
        java.lang.String str43 = locale41.getVariant();
        java.util.Locale locale44 = java.util.Locale.FRANCE;
        java.util.Locale locale45 = java.util.Locale.ITALIAN;
        java.lang.String str47 = locale45.getExtension('h');
        java.lang.String str48 = locale44.getDisplayScript(locale45);
        java.util.Locale locale49 = locale44.stripExtensions();
        java.lang.String str50 = locale49.getISO3Country();
        boolean boolean51 = locale49.hasExtensions();
        java.lang.String str52 = locale49.getISO3Language();
        java.util.Locale locale53 = java.util.Locale.FRANCE;
        java.util.Locale locale54 = java.util.Locale.ITALIAN;
        java.lang.String str56 = locale54.getExtension('h');
        java.lang.String str57 = locale53.getDisplayScript(locale54);
        java.util.Locale locale58 = locale53.stripExtensions();
        java.lang.String str59 = locale58.getISO3Country();
        boolean boolean60 = locale58.hasExtensions();
        java.lang.String str61 = locale58.getLanguage();
        java.lang.String str62 = locale49.getDisplayLanguage(locale58);
        java.lang.String str63 = locale41.getDisplayCountry(locale49);
        java.lang.String str64 = locale41.getDisplayScript();
        java.lang.String str65 = locale30.getDisplayVariant(locale41);
        java.util.Locale.setDefault(category0, locale30);
        java.lang.String str67 = locale30.getDisplayName();
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
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "it");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Italian" + "'", str23, "Italian");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "it");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "italian");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Italian" + "'", str34, "Italian");
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(strSet37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "franz\366sisch (frankreich)" + "'", str42, "franz\366sisch (frankreich)");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "it");
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "FRA" + "'", str50, "FRA");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "fra" + "'", str52, "fra");
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "it");
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "FRA" + "'", str59, "FRA");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "fr" + "'", str61, "fr");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "fran\347ais" + "'", str62, "fran\347ais");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
    }

    @Test
    public void test29330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29330");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) 'a', 'S');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'a' + "'", char2 == 'a');
    }

    @Test
    public void test29331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29331");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.getDefault(category0);
        java.util.Locale locale3 = java.util.Locale.getDefault(category0);
        java.lang.String str4 = locale3.getISO3Country();
        java.lang.String str5 = locale3.toLanguageTag();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "und" + "'", str5, "und");
    }

    @Test
    public void test29332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29332");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("\\u0063", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test29333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29333");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("ChineseEN_CA(China)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ChineseEN_CA(China)" + "'", str1, "ChineseEN_CA(China)");
    }

    @Test
    public void test29334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29334");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("U0020ITALIANITALIANITALIANITALI", "...c!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", 23);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test29335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29335");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("...U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069!IH\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\ENGLISCH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069!IH\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\ENGLISCH" + "'", str1, "...U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069!IH\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\ENGLISCH");
    }

    @Test
    public void test29336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29336");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("Italian");
        java.util.Locale.Builder builder4 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder0.clear();
        java.util.Locale locale7 = java.util.Locale.forLanguageTag("\\u0020");
        java.util.Locale.Builder builder8 = builder0.setLocale(locale7);
        java.util.Locale.Builder builder9 = builder8.clear();
        java.util.Locale.Builder builder10 = builder8.clear();
        java.util.Locale.Builder builder11 = builder10.clearExtensions();
        java.util.Locale.Builder builder12 = builder10.clear();
        java.util.Locale locale13 = builder12.build();
        java.util.Locale.Builder builder14 = builder12.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder16 = builder14.setLanguage("...zhzhzhfran\347ais cinese (cina)\\u0069h..France)Az...");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: ...zhzhzhfranc?ais cinese (cina)\\u0069h..France)Az... [at index 0]");
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
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test29337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29337");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rz...\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rFrn", (java.lang.CharSequence) "..................jp");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test29338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29338");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz\\u0065");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "anglais (Etats-Unis)", 57, 4);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test29339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29339");
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
        java.util.Locale.Builder builder12 = new java.util.Locale.Builder();
        java.util.Locale locale13 = builder12.build();
        java.util.Locale locale15 = java.util.Locale.forLanguageTag("Italian");
        java.lang.String str16 = locale13.getDisplayLanguage(locale15);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.upperCase("", locale15);
        java.util.Locale.setDefault(locale15);
        java.util.Locale.setDefault(category0, locale15);
        java.util.Locale locale22 = java.util.Locale.getDefault();
        java.lang.String str23 = locale22.getDisplayName();
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.upperCase("tTAT_ITA", locale22);
        java.lang.String str25 = org.apache.commons.lang3.StringUtils.lowerCase("                                                                                               en", locale22);
        java.util.Locale locale29 = new java.util.Locale("\\u0023", "Italienisch", "iTALIAN");
        java.lang.String str30 = locale22.getDisplayScript(locale29);
        java.util.Locale.setDefault(category0, locale22);
        java.util.Locale locale32 = java.util.Locale.getDefault(category0);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
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
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "italian");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "italian");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "italian" + "'", str23, "italian");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "TTAT_ITA" + "'", str24, "TTAT_ITA");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "                                                                                               en" + "'", str25, "                                                                                               en");
        org.junit.Assert.assertEquals(locale29.toString(), "\\u0023_ITALIENISCH_iTALIAN");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "italian");
    }

    @Test
    public void test29340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29340");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "            zhzhzhzhzhzhzhzhzhzhfraadzhaezhafzhagzhaizhalzhamzhanzhaozhaqzharzhaszhazhzhzhzhzhzhzhzhzhzh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test29341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29341");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "! 2ITALIANITALIANITALIANITALItalienisch2ITALIANITALIANITALIANITALitalian_ITALIAN_English2ITALIANITALIANITALIANITALHI!2ITALIANITALIANITALIANITALhi!2ITALIANITALIANITALIANITALADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...2ITALIANITALIANITALIANITAL\\u00342ITALIANITALIANITALIANITALHI!2ITALIANITALIANITALIANITALItalian2ITALIANITALIANITALIANITAL\\u00612ITALIANITALIANITALIANITAL\\u00232ITALIANITALIANITALIANITALhi!2ITALIANITALIANITALIANITALiTALIAN2ITALIANITALIANITALIANITALChinese (China)2ITALIANITALIANITALIANITALhi!2ITALIANITALIANITALIANITALzh_CN2ITALIANITALIANITALIANITALiTALIAN2ITALIANITALIANITALIANITALen2ITALIANITALIANITALIANITALItalienisch");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test29342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29342");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("ADAEAFAGAIALAMANAOAQARASAAUAWAXAZBABB", "k");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ADAEAFAGAIALAMANAOAQARASAAUAWAXAZBABB" + "'", str3, "ADAEAFAGAIALAMANAOAQARASAAUAWAXAZBABB");
    }

    @Test
    public void test29343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29343");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("z (IFRANZOSISCH)", "", (int) 'z');
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny("                                                                                               en", strArray4);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "DACFACGACHACIACKACLAC", 26397, 13);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test29344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29344");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("\u30c9\u30a4\u30c4\u8a9e", "2CINESE (CINA...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test29345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29345");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("ko", "\\u0068 !ih !ih !ih !ih !ih !ih !ih !ih !ih");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test29346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29346");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBFR_CA                             ...!       \\U0034\\U0034\\U0034\\U0034\\U0034\\U0034\\U0034\\U0034\\U0034\\     CFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "adaeafagaialamanaoaqarasatauawaxazbabbbdbebfbgbhbfr_ca                             ...!       \\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\     cfcgchcickclcmcncocrcucvcwcxcyczded..." + "'", str1, "adaeafagaialamanaoaqarasatauawaxazbabbbdbebfbgbhbfr_ca                             ...!       \\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\     cfcgchcickclcmcncocrcucvcwcxcyczded...");
    }

    @Test
    public void test29347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29347");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("Italian");
        java.util.Locale locale4 = builder0.build();
        java.util.Locale locale5 = java.util.Locale.CHINESE;
        java.lang.String str6 = locale5.getISO3Language();
        java.util.Locale.Builder builder7 = builder0.setLocale(locale5);
        java.util.Locale locale8 = builder7.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder7.setLanguage("#########################################################################################eltI_0200U\\_!");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: #########################################################################################eltI_0200U\\_! [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "italian");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "zho" + "'", str6, "zho");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh");
    }

    @Test
    public void test29348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29348");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("\u1111\u1173\u1105\u1161\u11bc\u1109\u1173\u110b\u1165\u110f\u1162\u1102\u1161\u1103\u1161)_EGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEG_                                                                    \\u0020iTALIAiTALIAiTALIAiTALI");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test29349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29349");
        java.util.Locale locale1 = new java.util.Locale("cccccccccccccccccccccccccccc...cccccccccccccccccccccccccccc...A)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaDzh_CNfRENCH (cANAcccccccccccccccccccccccccccc...cccccccccccccccccccccccccccc...");
        org.junit.Assert.assertEquals(locale1.toString(), "cccccccccccccccccccccccccccc...cccccccccccccccccccccccccccc...a)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaadzh_cnfrench (canacccccccccccccccccccccccccccc...cccccccccccccccccccccccccccc...");
    }

    @Test
    public void test29350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29350");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "         R");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test29351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29351");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("\uc774\ud0c8\ub9ac\uc544\uc5b4", "ITALIAN                                                                 ", (int) '-');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test29352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29352");
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
        java.lang.String str15 = locale6.getISO3Country();
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
    }

    @Test
    public void test29353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29353");
        java.util.Locale locale1 = new java.util.Locale("");
        java.lang.String str2 = locale1.getDisplayVariant();
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test29354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29354");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("royaume-uni ", "                                        anglais (royaume-uni)FRA                                        ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test29355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29355");
        java.util.Locale.Category category1 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale2 = java.util.Locale.getDefault(category1);
        java.util.Locale locale3 = java.util.Locale.GERMAN;
        java.util.Locale locale4 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str5 = locale3.getDisplayName(locale4);
        java.util.Locale.setDefault(category1, locale4);
        java.util.Locale locale9 = new java.util.Locale("\\u0045", "");
        java.util.Locale.setDefault(category1, locale9);
        java.util.Locale.setDefault(locale9);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.upperCase("FRENCH (CANADA)", locale9);
        java.lang.String str13 = locale9.getLanguage();
        org.junit.Assert.assertTrue("'" + category1 + "' != '" + java.util.Locale.Category.FORMAT + "'", category1.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "de");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "allemand" + "'", str5, "allemand");
        org.junit.Assert.assertEquals(locale9.toString(), "\\u0045");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "FRENCH (CANADA)" + "'", str12, "FRENCH (CANADA)");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\\u0045" + "'", str13, "\\u0045");
    }

    @Test
    public void test29356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29356");
        java.util.Locale locale1 = java.util.Locale.CHINESE;
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("Franz\366sisch (Frankreich)", locale1);
        java.lang.String str3 = locale1.getDisplayName();
        java.util.Locale locale5 = java.util.Locale.forLanguageTag("NA");
        java.lang.String str6 = locale5.getVariant();
        java.lang.String str7 = locale1.getDisplayCountry(locale5);
        java.lang.String str8 = locale5.getDisplayLanguage();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "franz\366sisch (frankreich)" + "'", str2, "franz\366sisch (frankreich)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Chinese" + "'", str3, "Chinese");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "na");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Nauru" + "'", str8, "Nauru");
    }

    @Test
    public void test29357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29357");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "                                eselgni                               ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test29358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29358");
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
        java.util.Locale.LanguageRange[] languageRangeArray29 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList30 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList30, languageRangeArray29);
        java.lang.String[] strArray34 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList35 = new java.util.ArrayList<java.lang.String>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList35, strArray34);
        java.util.Locale.FilteringMode filteringMode37 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList38 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList30, (java.util.Collection<java.lang.String>) strList35, filteringMode37);
        java.util.Locale.FilteringMode filteringMode39 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList40 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList27, (java.util.Collection<java.lang.String>) strList35, filteringMode39);
        java.util.Locale.LanguageRange[] languageRangeArray41 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList42 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList42, languageRangeArray41);
        java.util.Locale.LanguageRange[] languageRangeArray44 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList45 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList45, languageRangeArray44);
        java.lang.String[] strArray49 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList50 = new java.util.ArrayList<java.lang.String>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList50, strArray49);
        java.util.Locale.FilteringMode filteringMode52 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList53 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList45, (java.util.Collection<java.lang.String>) strList50, filteringMode52);
        java.util.Locale.FilteringMode filteringMode54 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList55 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList42, (java.util.Collection<java.lang.String>) strList50, filteringMode54);
        java.util.Locale.LanguageRange[] languageRangeArray56 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList57 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList57, languageRangeArray56);
        java.lang.String[] strArray61 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList62 = new java.util.ArrayList<java.lang.String>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList62, strArray61);
        java.util.Locale.FilteringMode filteringMode64 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList65 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList57, (java.util.Collection<java.lang.String>) strList62, filteringMode64);
        java.util.List<java.lang.String> strList66 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList27, (java.util.Collection<java.lang.String>) strList55, filteringMode64);
        java.util.List<java.lang.String> strList67 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList55);
        java.lang.String str69 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strList67, "                                       k");
        java.lang.String str71 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strList67, 'S');
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
        org.junit.Assert.assertNotNull(languageRangeArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + filteringMode37 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode37.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList38);
        org.junit.Assert.assertTrue("'" + filteringMode39 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode39.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList40);
        org.junit.Assert.assertNotNull(languageRangeArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(languageRangeArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + filteringMode52 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode52.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList53);
        org.junit.Assert.assertTrue("'" + filteringMode54 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode54.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList55);
        org.junit.Assert.assertNotNull(languageRangeArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + filteringMode64 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode64.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList65);
        org.junit.Assert.assertNotNull(strList66);
        org.junit.Assert.assertNotNull(strList67);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
    }

    @Test
    public void test29359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29359");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "\r\rneilatI    E\r\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test29360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29360");
        java.util.Locale locale2 = new java.util.Locale("       !ih", "tedesco");
        java.lang.String str3 = locale2.getDisplayCountry();
        java.lang.String str4 = locale2.getLanguage();
        org.junit.Assert.assertEquals(locale2.toString(), "       !ih_TEDESCO");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "TEDESCO" + "'", str3, "TEDESCO");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "       !ih" + "'", str4, "       !ih");
    }

    @Test
    public void test29361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29361");
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
        java.util.Locale locale44 = new java.util.Locale("H", "Hhhhhhhhh", "CV CW CX CY CZ DE DJ DK DM DO DZ EC EE EG EH ER ES ET FI FJ FK");
        java.lang.String str45 = locale44.getLanguage();
        java.util.Locale.Builder builder46 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder47 = builder46.clearExtensions();
        java.util.Locale.Builder builder49 = builder46.setLanguageTag("Italian");
        java.util.Locale locale50 = builder46.build();
        java.util.Locale locale51 = java.util.Locale.CHINESE;
        java.lang.String str52 = locale51.getISO3Language();
        java.util.Locale.Builder builder53 = builder46.setLocale(locale51);
        java.lang.String str54 = locale44.getDisplayVariant(locale51);
        java.util.Locale.Builder builder55 = builder40.setLocale(locale51);
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "French (Canada)" + "'", str17, "French (Canada)");
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "italian");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Chinese (China)" + "'", str25, "Chinese (China)");
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "");
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "en_GB");
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(strSet33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "English (United Kingdom)" + "'", str34, "English (United Kingdom)");
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertEquals(locale44.toString(), "h_HHHHHHHHH_CV CW CX CY CZ DE DJ DK DM DO DZ EC EE EG EH ER ES ET FI FJ FK");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "h" + "'", str45, "h");
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "italian");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "zho" + "'", str52, "zho");
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "CV CW CX CY CZ DE DJ DK DM DO DZ EC EE EG EH ER ES ET FI FJ FK" + "'", str54, "CV CW CX CY CZ DE DJ DK DM DO DZ EC EE EG EH ER ES ET FI FJ FK");
        org.junit.Assert.assertNotNull(builder55);
    }

    @Test
    public void test29362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29362");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\\', 136);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 136 + "'", int2 == 136);
    }

    @Test
    public void test29363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29363");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("\\u0069CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC", "cccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test29364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29364");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("fr-CAfr-CAfr-CAfr-CAfr-CAfr-CAfr-CAfr-CAfr-CAfr-CAfr-CAfr\\u000dfr-CAfr-CAfr-CAfr-CAfr-CAfr-CAfr-CAfr-CAfr-CAfr-CAfr-CAfr", "         ITALIAN_italDE_DE");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "fr-CAfr-CAfr-CAfr-CAfr-CAfr-CAfr-CAfr-CAfr-CAfr-CAfr-CAfr\\u000dfr-CAfr-CAfr-CAfr-CAfr-CAfr-CAfr-CAfr-CAfr-CAfr-CAfr-CAfr" + "'", str2, "fr-CAfr-CAfr-CAfr-CAfr-CAfr-CAfr-CAfr-CAfr-CAfr-CAfr-CAfr\\u000dfr-CAfr-CAfr-CAfr-CAfr-CAfr-CAfr-CAfr-CAfr-CAfr-CAfr-CAfr");
    }

    @Test
    public void test29365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29365");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("bgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgtalian", "en-GB");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "bgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgtalia" + "'", str2, "bgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgtalia");
    }

    @Test
    public void test29366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29366");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "\\z\\z\\z\\z\\z\\z\\z\\z\\z\\zA\\zSA\\zRA\\zQA\\zOA\\zNA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test29367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29367");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("aaabaeafakamanarasavayazbabebgbhbibmbn...", (int) '-', "Z...FRN");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Z...aaabaeafakamanarasavayazbabebgbhbibmbn..." + "'", str3, "Z...aaabaeafakamanarasavayazbabebgbhbibmbn...");
    }

    @Test
    public void test29368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29368");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                        aNCHc                        ", 'a');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test29369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29369");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("ybzcacccdcfcgchcickclcmcncocrcucvcwcxcyczdedjdkdmdodzeceeegeher", "\\u00de\\u00\\u\\u00de\\u00\\u");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test29370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29370");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("cinese (Cina)\\u0069h...", 'G');
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", 'x');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiitalian_ITALIAN_EnglisEiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii", strArray3, strArray6);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiitalian_ITALIAN_EnglisEiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii" + "'", str7, "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiitalian_ITALIAN_EnglisEiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
    }

    @Test
    public void test29371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29371");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("Italian");
        java.util.Locale.Builder builder4 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder0.clear();
        java.util.Locale.Category category6 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale7 = java.util.Locale.getDefault(category6);
        java.util.Locale locale8 = java.util.Locale.FRANCE;
        java.util.Locale locale9 = java.util.Locale.ITALIAN;
        java.lang.String str11 = locale9.getExtension('h');
        java.lang.String str12 = locale8.getDisplayScript(locale9);
        java.lang.String str13 = locale8.getISO3Country();
        java.util.Locale locale14 = java.util.Locale.GERMAN;
        java.util.Locale.setDefault(locale14);
        java.lang.String str16 = locale8.getDisplayName(locale14);
        java.lang.String str17 = locale8.getScript();
        java.util.Locale.setDefault(category6, locale8);
        java.util.Set<java.lang.String> strSet19 = locale8.getUnicodeLocaleKeys();
        java.lang.String str20 = locale8.getCountry();
        java.util.Locale locale22 = new java.util.Locale("en");
        boolean boolean23 = locale22.hasExtensions();
        java.util.Set<java.lang.String> strSet24 = locale22.getUnicodeLocaleKeys();
        java.util.Locale locale25 = java.util.Locale.ITALIAN;
        java.lang.String str26 = locale25.getDisplayLanguage();
        java.util.Locale locale27 = locale25.stripExtensions();
        java.lang.String str28 = locale27.getVariant();
        java.lang.String str29 = locale22.getDisplayLanguage(locale27);
        java.util.Locale.setDefault(locale27);
        java.lang.String str31 = locale8.getDisplayLanguage(locale27);
        java.util.Locale locale32 = java.util.Locale.FRENCH;
        java.lang.String str33 = locale32.getDisplayName();
        java.lang.String str35 = locale32.getExtension('C');
        java.lang.String str36 = locale32.getVariant();
        java.lang.String str37 = locale27.getDisplayScript(locale32);
        java.lang.String str38 = locale27.getDisplayScript();
        java.util.Locale.Builder builder39 = builder0.setLocale(locale27);
        java.util.Locale locale40 = builder39.build();
        java.util.Locale.setDefault(locale40);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + category6 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category6.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "\\u0045");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "it");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "FRA" + "'", str13, "FRA");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "de");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Franz\366sisch (Frankreich)" + "'", str16, "Franz\366sisch (Frankreich)");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "FR" + "'", str20, "FR");
        org.junit.Assert.assertEquals(locale22.toString(), "en");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "it");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "italien" + "'", str26, "italien");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "it");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "inglese" + "'", str29, "inglese");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "francese" + "'", str31, "francese");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "francese" + "'", str33, "francese");
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "it");
    }

    @Test
    public void test29372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29372");
        char[] charArray10 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZW", charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                              444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444en", charArray10);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "AD\rAE\rAF\rAG\rAI\rAL\rAM\rAN\rAO\rAQ\rAR\rAS\rAT\rAU\rAW\rAX\rAZ\rBA\rBB\rBD\rBE\rBF\rBG\rBH\rBI\rBJ\rBL\rBM\rBN\rBO\rBQ\rBR\rBS\rBT\rBV\rBW\rBY\rBZ\rCA\rCC\rCD\rCF\rCG\rCH\rCI\rCK\rCL\rCM\rCN\rCO\rCR\rCU\rCV\rCW\rCX\rCY\rCZ\rDE\rDJ\rDK\rDM\rDO\rDZ\rEC\rEE\rEG\rEH\rER\rES\rET\rFI\rFJ\rFK\rFM\rFO\rFR\rGA\rGB\rGD\rGE\rGF\rGG\rGH\rGI\rGL\rGM\rGN\rGP\rGQ\rGR\rGS\rGT\rGU\rGW\rGY\rHK\rHM\rHN\rHR\rHT\rHU\rID\rIE\rIL\rIM\rIN\rIO\rIQ\rIR\rIS\rIT\rJE\rJM\rJO\rJP\rKE\rKG\rKH\rKI\rKM\rKN\rKP\rKR\rKW\rKY\rKZ\rLA\rLB\rLC\rLI\rLK\rLR\rLS\rLT\rLU\rLV\rLY\rMA\rMC\rMD\rME\rMF\rMG\rMH\rMK\rML\rMM\rMN\rMO\rMP\rMQ\rMR\rMS\rMT\rMU\rMV\rMW\rMX\rMY\rMZ\rNA\rNC\rNE\rNF\rNG\rNI\rNL\rNO\rNP\rNR\rNU\rNZ\rOM\rPA\rPE\rPF\rPG\rPH\rPK\rPL\rPM\rPN\rPR\rPS\rPT\rPW\rPY\rQA\rRE\rRO\rRS\rRU\rRW\rSA\rSB\rSC\rSD\rSE\rSG\rSH\rSI\rSJ\rSK\rSL\rSM\rSN\rSO\rSR\rSS\rST\rSV\rSX\rSY\rSZ\rTC\rTD\rTF\rTG\rTH\rTJ\rTK\rTL\rTM\rTN\rTO\rTR\rTT\rTV\rTW\rTZ\rUA\rUG\rUM\rUS\rUY\rUZ\rVA\rVC\rVE\rVG\rVI\rVN\rVU\rWF\rWS\rYE\rYT\rZA\rZM\rZW", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4##a a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4##a a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, #, #, a,  , a]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test29373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29373");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "u", (java.lang.CharSequence) "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 102 + "'", int2 == 102);
    }

    @Test
    public void test29374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29374");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "IIIIIIIIIIIIIIIIIIIIIIIIIIITALIAN_ITALIAN_ENGLIHIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test29375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29375");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDinglesehhhhhhhhhenglisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)englisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)englisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)englisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)englisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)englisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)en...", 66);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDinglesehhhhhhhhhenglisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)englisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)englisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)englisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)englisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)englisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)en..." + "'", str2, "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDinglesehhhhhhhhhenglisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)englisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)englisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)englisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)englisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)englisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)en...");
    }

    @Test
    public void test29376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29376");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "itTAiT_ITA", 52);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "English");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.concatWith("cinese (cina)\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hh", (java.lang.Object[]) strArray4);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!4444ALLEMAND4444");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test29377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29377");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("German");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "German" + "'", str1, "German");
    }

    @Test
    public void test29378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29378");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("RegnoUnito", '\351');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'R' + "'", char2 == 'R');
    }

    @Test
    public void test29379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29379");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('b', (int) 'l');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 108 + "'", int2 == 108);
    }

    @Test
    public void test29380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29380");
        java.util.Locale locale1 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale5 = new java.util.Locale("Italian", "Italian", "English");
        java.lang.String str6 = locale5.getDisplayCountry();
        java.lang.String str7 = locale1.getDisplayCountry(locale5);
        java.lang.String str9 = locale5.getExtension('E');
        java.lang.String str10 = locale5.getLanguage();
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.upperCase("it44444444444444444en", locale5);
        java.util.Set<java.lang.String> strSet12 = locale5.getUnicodeLocaleAttributes();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = locale5.getUnicodeLocaleType("\\AuA0046");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: \\AuA0046");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertEquals(locale5.toString(), "italian_ITALIAN_English");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ITALIAN" + "'", str6, "ITALIAN");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "China" + "'", str7, "China");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "italian" + "'", str10, "italian");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "IT44444444444444444EN" + "'", str11, "IT44444444444444444EN");
        org.junit.Assert.assertNotNull(strSet12);
    }

    @Test
    public void test29381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29381");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("", "!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test29382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29382");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hcstueD");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "hcstued");
    }

    @Test
    public void test29383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29383");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder6 = builder1.setLanguage("und");
        java.util.Locale locale7 = builder6.build();
        java.lang.String str8 = locale7.getDisplayScript();
        java.util.Locale locale9 = java.util.Locale.ITALIAN;
        java.lang.String str10 = locale9.getDisplayLanguage();
        java.util.Locale locale11 = locale9.stripExtensions();
        java.util.Locale locale13 = java.util.Locale.forLanguageTag("\\u0020");
        java.lang.String str14 = locale13.getDisplayScript();
        java.lang.String str15 = locale11.getDisplayCountry(locale13);
        java.lang.String str16 = locale13.getDisplayLanguage();
        java.lang.String str17 = locale13.getISO3Country();
        java.lang.String str18 = locale7.getDisplayLanguage(locale13);
        java.lang.String str19 = locale13.getDisplayVariant();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "francese (Canada)" + "'", str3, "francese (Canada)");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "und_CA");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "it");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "italiano" + "'", str10, "italiano");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "it");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Undetermined" + "'", str18, "Undetermined");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test29384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29384");
        java.lang.Object[] objArray0 = null;
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(objArray0, 'Z', 0, 71);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test29385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29385");
        java.util.Locale locale2 = new java.util.Locale("royaume-uni");
        java.lang.String str3 = locale2.getDisplayScript();
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.upperCase("CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC                       ", locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "royaume-uni");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC                       " + "'", str4, "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC                       ");
    }

    @Test
    public void test29386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29386");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("AzhzhzhzhzhzhzhzhzhzhADAAEAAFAAGAAAALAAMAANAAOAAQAARAASAATAAUAAWAAXAAZABAABBhcstueDNABOABQABRABSABTABVABWABYABZACAACCACDACFACGACHACACKACLACMACNACOACRACUACVACWACXACYACZADEADJADKADMADOADZAECAEEAEGAEHAERAESAETAFAFJAFKAFMAFOAFRAGAAGBAGDAGEAGFAGGAGHAGAGLAGMAGNAGPAGQAGRAGSAGTAGUAGWAGYAHKAHMAHNAHRAHTAHUADAEALAMANAOAQARASATAJEAJMAJOAJPAKEAKGAKHAKAKMAKNAKPAKRAKWAKYAKZALAALBALCALALKALRALSALTALUALVALYAMAAMCAMDAMEAMFAMGAMHAMKAMLAMMAMNAMOAMPAMQAMRAMSAMTAMUAMVAMWAMXAMYAMZANAANCANEANFANGANANLANOANPANRANUANZAOMAPAAPEAPFAPGAPHAPKAPLAPMAPNAPRAPSAPTAPWAPYAQAAREAROARSARUARWASAASBASCASDASEASGASHASASJASKASLASMASNASOASRASSASTASVASXASYASZATCATDATFATGATHATJATKATLATMATNATOATRATTATVATWATZAUAAUGAUMAUSAUYAUZAVAAVCAVEAVGAVAVNAVUAWFAWSAYEAYTAZAAZMAZW", "8ian\\u0020i86", 406, 35);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "AzhzhzhzhzhzhzhzhzhzhADAAEAAFAAGAAA8ian\\u0020i86MFAMGAMHAMKAMLAMMAMNAMOAMPAMQAMRAMSAMTAMUAMVAMWAMXAMYAMZANAANCANEANFANGANANLANOANPANRANUANZAOMAPAAPEAPFAPGAPHAPKAPLAPMAPNAPRAPSAPTAPWAPYAQAAREAROARSARUARWASAASBASCASDASEASGASHASASJASKASLASMASNASOASRASSASTASVASXASYASZATCATDATFATGATHATJATKATLATMATNATOATRATTATVATWATZAUAAUGAUMAUSAUYAUZAVAAVCAVEAVGAVAVNAVUAWFAWSAYEAYTAZAAZMAZW" + "'", str4, "AzhzhzhzhzhzhzhzhzhzhADAAEAAFAAGAAA8ian\\u0020i86MFAMGAMHAMKAMLAMMAMNAMOAMPAMQAMRAMSAMTAMUAMVAMWAMXAMYAMZANAANCANEANFANGANANLANOANPANRANUANZAOMAPAAPEAPFAPGAPHAPKAPLAPMAPNAPRAPSAPTAPWAPYAQAAREAROARSARUARWASAASBASCASDASEASGASHASASJASKASLASMASNASOASRASSASTASVASXASYASZATCATDATFATGATHATJATKATLATMATNATOATRATTATVATWATZAUAAUGAUMAUSAUYAUZAVAAVCAVEAVGAVAVNAVUAWFAWSAYEAYTAZAAZMAZW");
    }

    @Test
    public void test29387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29387");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "z...frn (CHINESE)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test29388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29388");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "\\CCglisch");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test29389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29389");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("und");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap2 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList3 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList1, strMap2);
        java.util.Locale locale6 = new java.util.Locale("chinois (Chine)", "\\italian_ITALIAN_English");
        java.util.Set<java.lang.String> strSet7 = locale6.getUnicodeLocaleAttributes();
        java.util.List<java.lang.String> strList8 = java.util.Locale.filterTags(languageRangeList1, (java.util.Collection<java.lang.String>) strSet7);
        java.util.Collection<java.lang.String> strCollection9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = java.util.Locale.lookupTag(languageRangeList1, strCollection9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(languageRangeList3);
        org.junit.Assert.assertEquals(locale6.toString(), "chinois (chine)_\\ITALIAN_ITALIAN_ENGLISH");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test29390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29390");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("...                             ");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test29391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29391");
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
        java.util.Locale locale16 = new java.util.Locale("en");
        boolean boolean17 = locale16.hasExtensions();
        java.util.Set<java.lang.String> strSet18 = locale16.getUnicodeLocaleKeys();
        java.util.Locale locale19 = java.util.Locale.ITALIAN;
        java.lang.String str20 = locale19.getDisplayLanguage();
        java.util.Locale locale21 = locale19.stripExtensions();
        java.lang.String str22 = locale21.getVariant();
        java.lang.String str23 = locale16.getDisplayLanguage(locale21);
        java.util.Locale.setDefault(locale21);
        java.lang.String str25 = locale2.getDisplayLanguage(locale21);
        java.lang.String str26 = locale2.getDisplayLanguage();
        java.util.Set<java.lang.String> strSet27 = locale2.getUnicodeLocaleKeys();
        java.lang.String str29 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet27, 'E');
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it");
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
        org.junit.Assert.assertEquals(locale16.toString(), "en");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "it");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "italien" + "'", str20, "italien");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "it");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "inglese" + "'", str23, "inglese");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "francese" + "'", str25, "francese");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "francese" + "'", str26, "francese");
        org.junit.Assert.assertNotNull(strSet27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test29392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29392");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("!ih                            dalleman!ih                            dalleman!ih                          ", "kOREAN (sOUTH kOR");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test29393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29393");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder6 = builder0.setExtension('z', "EAGAASH");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder6.setVariant("CCCCCCIAN\\U0020ICCCCCCC");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: CCCCCCIAN\\U0020ICCCCCCC [at index 0]");
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
    public void test29394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29394");
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
        java.lang.String str29 = locale1.getDisplayCountry(locale18);
        java.lang.String str30 = locale18.getCountry();
        java.lang.String str31 = org.apache.commons.lang3.StringUtils.upperCase("\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069!ih\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\", locale18);
        java.util.Locale locale32 = locale18.stripExtensions();
        java.util.Locale locale34 = new java.util.Locale("\\u005c");
        java.util.Locale locale36 = java.util.Locale.CHINESE;
        java.lang.String str37 = org.apache.commons.lang3.StringUtils.lowerCase("Franz\366sisch (Frankreich)", locale36);
        java.lang.String str38 = locale36.getVariant();
        java.lang.String str39 = locale34.getDisplayScript(locale36);
        java.lang.String str40 = locale18.getDisplayLanguage(locale36);
        java.lang.String str41 = locale36.toLanguageTag();
        java.lang.String str42 = locale36.getDisplayName();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str44 = locale36.getExtension('\n');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: ?");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "FR" + "'", str30, "FR");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069!IH\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\" + "'", str31, "\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069!IH\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "fr_FR");
        org.junit.Assert.assertEquals(locale34.toString(), "\\u005c");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "franz\366sisch (frankreich)" + "'", str37, "franz\366sisch (frankreich)");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "\u6cd5\u6587" + "'", str40, "\u6cd5\u6587");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "zh" + "'", str41, "zh");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "chinois" + "'", str42, "chinois");
    }

    @Test
    public void test29395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29395");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("alhi!       _\\U0020_Italienisch####################################################################          andallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemand", 79);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "alhi!       _\\U0020_Italienisch####################################################################          andallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemand" + "'", str2, "alhi!       _\\U0020_Italienisch####################################################################          andallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemand");
    }

    @Test
    public void test29396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29396");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.FRANCE;
        java.util.Locale locale3 = java.util.Locale.ITALIAN;
        java.lang.String str5 = locale3.getExtension('h');
        java.lang.String str6 = locale2.getDisplayScript(locale3);
        java.util.Locale locale7 = locale2.stripExtensions();
        java.util.Set<java.lang.String> strSet8 = locale7.getUnicodeLocaleAttributes();
        java.util.Locale.setDefault(category0, locale7);
        java.util.Locale locale11 = new java.util.Locale("\\u0068");
        boolean boolean12 = locale11.hasExtensions();
        java.util.Locale locale15 = new java.util.Locale("!IH", "Hhhhhhhhhh");
        java.lang.String str16 = locale15.getDisplayLanguage();
        java.lang.String str17 = locale11.getDisplayName(locale15);
        java.util.Set<java.lang.String> strSet18 = locale11.getUnicodeLocaleAttributes();
        java.lang.String str19 = locale11.toLanguageTag();
        java.util.Locale.setDefault(category0, locale11);
        java.util.Locale locale21 = java.util.Locale.getDefault(category0);
        java.util.Locale locale22 = java.util.Locale.getDefault(category0);
        java.util.Locale locale23 = java.util.Locale.getDefault(category0);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "it");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertEquals(locale11.toString(), "\\u0068");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals(locale15.toString(), "!ih_HHHHHHHHHH");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "!ih" + "'", str16, "!ih");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\\u0068" + "'", str17, "\\u0068");
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "und" + "'", str19, "und");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "\\u0068");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "\\u0068");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "\\u0068");
    }

    @Test
    public void test29397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29397");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "aE");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test29398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29398");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("zhzhzhzhzhzhzhzhzhzhfraadzhaezhafzhagzhaizhalzhamzhanzhaozhaqzharzhaszhazhzhzhzhzhzhzhzhzhz", "\u6cd5\u6587\u52a0\u62ff\u5927)");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("9hhhhhhhhhh          9hhhhhhhhhh", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test29399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29399");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiifrancese (Francia)", 804);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test29400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29400");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("aaaaaaaaaaaaaa", "...\r\r\r\r\r\r\r\r..");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...\r\r\r\r\r\r\r\r.." + "'", str2, "...\r\r\r\r\r\r\r\r..");
    }

    @Test
    public void test29401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29401");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbFRANZ\326SISCH (FRANKREICH)", 92, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "abbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbFRANZ\326SISCH (FRANKREICH)a" + "'", str3, "abbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbFRANZ\326SISCH (FRANKREICH)a");
    }

    @Test
    public void test29402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29402");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("dddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddfranzosisch(frankreich)", (int) (short) 0, "e             g");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "dddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddfranzosisch(frankreich)" + "'", str3, "dddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddfranzosisch(frankreich)");
    }

    @Test
    public void test29403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29403");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("okokok", strMap1);
        java.util.Locale.LanguageRange[] languageRangeArray3 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList4 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList4, languageRangeArray3);
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        java.util.Locale.FilteringMode filteringMode11 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList12 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.lang.String>) strList9, filteringMode11);
        java.lang.String[] strArray14 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        java.util.List<java.lang.String> strList17 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.lang.String>) strList15);
        java.util.Locale.LanguageRange[] languageRangeArray18 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList19 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList19, languageRangeArray18);
        java.lang.String[] strArray23 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList24 = new java.util.ArrayList<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList24, strArray23);
        java.util.Locale.FilteringMode filteringMode26 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList27 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList19, (java.util.Collection<java.lang.String>) strList24, filteringMode26);
        java.lang.String[] strArray29 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList30 = new java.util.ArrayList<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList30, strArray29);
        java.util.List<java.lang.String> strList32 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList19, (java.util.Collection<java.lang.String>) strList30);
        java.util.List<java.lang.String> strList33 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.lang.String>) strList30);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap34 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList35 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, strMap34);
        java.util.Locale locale36 = java.util.Locale.KOREA;
        java.util.Set<java.lang.String> strSet37 = locale36.getUnicodeLocaleAttributes();
        java.lang.String str39 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet37, "\\u005c");
        java.lang.String str41 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet37, "zhzhzhzhzhzhzhzhzhzhFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAzhzhzhzhzhzhzhzhzhzh");
        java.util.List<java.lang.String> strList42 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.lang.String>) strSet37);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap43 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList44 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, strMap43);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap45 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList46 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList44, strMap45);
        java.util.Locale.LanguageRange[] languageRangeArray47 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList48 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList48, languageRangeArray47);
        java.lang.String[] strArray52 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList53 = new java.util.ArrayList<java.lang.String>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList53, strArray52);
        java.util.Locale.FilteringMode filteringMode55 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList56 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList48, (java.util.Collection<java.lang.String>) strList53, filteringMode55);
        java.util.Locale.LanguageRange[] languageRangeArray57 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList58 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList58, languageRangeArray57);
        java.lang.String[] strArray62 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList63 = new java.util.ArrayList<java.lang.String>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList63, strArray62);
        java.util.Locale.FilteringMode filteringMode65 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList66 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList58, (java.util.Collection<java.lang.String>) strList63, filteringMode65);
        java.lang.String[] strArray68 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList69 = new java.util.ArrayList<java.lang.String>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList69, strArray68);
        java.util.List<java.lang.String> strList71 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList58, (java.util.Collection<java.lang.String>) strList69);
        java.lang.String str72 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList48, (java.util.Collection<java.lang.String>) strList69);
        java.util.Locale locale73 = java.util.Locale.CANADA_FRENCH;
        java.util.Set<java.lang.String> strSet74 = locale73.getUnicodeLocaleKeys();
        java.lang.String str76 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet74, "...ANiTALI");
        java.lang.String str77 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList48, (java.util.Collection<java.lang.String>) strSet74);
        java.util.Locale.Builder builder79 = new java.util.Locale.Builder();
        java.util.Locale locale80 = builder79.build();
        java.util.Locale locale82 = java.util.Locale.forLanguageTag("Italian");
        java.lang.String str83 = locale80.getDisplayLanguage(locale82);
        java.lang.String str84 = org.apache.commons.lang3.StringUtils.upperCase("", locale82);
        java.lang.String str85 = locale82.getScript();
        java.util.Set<java.lang.String> strSet86 = locale82.getUnicodeLocaleKeys();
        java.util.List<java.lang.String> strList87 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList48, (java.util.Collection<java.lang.String>) strSet86);
        java.util.List<java.lang.String> strList88 = java.util.Locale.filterTags(languageRangeList44, (java.util.Collection<java.lang.String>) strList87);
        java.lang.String str89 = java.util.Locale.lookupTag(languageRangeList2, (java.util.Collection<java.lang.String>) strList88);
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + filteringMode11 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode11.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(languageRangeArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + filteringMode26 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode26.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList27);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(strList32);
        org.junit.Assert.assertNotNull(strList33);
        org.junit.Assert.assertNotNull(languageRangeList35);
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(strSet37);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(strList42);
        org.junit.Assert.assertNotNull(languageRangeList44);
        org.junit.Assert.assertNotNull(languageRangeList46);
        org.junit.Assert.assertNotNull(languageRangeArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + filteringMode55 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode55.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList56);
        org.junit.Assert.assertNotNull(languageRangeArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + filteringMode65 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode65.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList66);
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(strList71);
        org.junit.Assert.assertNull(str72);
        org.junit.Assert.assertNotNull(locale73);
        org.junit.Assert.assertEquals(locale73.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(strSet74);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertNull(str77);
        org.junit.Assert.assertNotNull(locale80);
        org.junit.Assert.assertEquals(locale80.toString(), "");
        org.junit.Assert.assertNotNull(locale82);
        org.junit.Assert.assertEquals(locale82.toString(), "italian");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "" + "'", str83, "");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "" + "'", str84, "");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "" + "'", str85, "");
        org.junit.Assert.assertNotNull(strSet86);
        org.junit.Assert.assertNotNull(strList87);
        org.junit.Assert.assertNotNull(strList88);
        org.junit.Assert.assertNull(str89);
    }

    @Test
    public void test29404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29404");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("fr-CAfr-CAfr-C8600u\\fr-CAfr-CAfr-CA", "ZZZITALIAN (ITALY)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "fr-CAfr-CAfr-C8600u\\fr-CAfr-CAfr-CA" + "'", str2, "fr-CAfr-CAfr-C8600u\\fr-CAfr-CAfr-CA");
    }

    @Test
    public void test29405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29405");
        java.util.Locale locale3 = new java.util.Locale("\ud504\ub791\uc2a4\uc5b4\uce90\ub098\ub2e4)", "engengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengeng", "                                                                    \\u0020iTALIANiTALIANiTALIANiTALI");
        java.util.Locale locale4 = locale3.stripExtensions();
        java.util.Locale locale8 = new java.util.Locale("f", "Korean");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.upperCase("itTAiT_ITALIAN_EgAish                                                                                ", locale8);
        java.util.Locale locale12 = new java.util.Locale("\\u0045", "");
        boolean boolean13 = locale12.hasExtensions();
        java.lang.String str14 = locale12.getDisplayScript();
        java.lang.String str15 = locale8.getDisplayName(locale12);
        java.lang.String str16 = locale3.getDisplayScript(locale8);
        java.lang.String str17 = locale3.toString();
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\ud504\ub791\uc2a4\uc5b4\uce90\ub098\ub2e4)_ENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENG_                                                                    \\u0020iTALIANiTALIANiTALIANiTALI" + "'", str17, "\ud504\ub791\uc2a4\uc5b4\uce90\ub098\ub2e4)_ENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENG_                                                                    \\u0020iTALIANiTALIANiTALIANiTALI");
    }

    @Test
    public void test29406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29406");
        char[] charArray11 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray11);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "iTALIAN", charArray11);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "it", charArray11);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "h", charArray11);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny("KoreanADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLC", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4##a a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4##a a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4, #, #, a,  , a]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test29407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29407");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder5 = builder1.clearExtensions();
        java.util.Locale locale6 = java.util.Locale.ITALIAN;
        java.util.Set<java.lang.Character> charSet7 = locale6.getExtensionKeys();
        java.lang.String str8 = locale6.getVariant();
        java.lang.String str9 = locale6.getDisplayName();
        java.lang.String str10 = locale6.getDisplayName();
        java.lang.String str11 = locale6.getDisplayLanguage();
        java.util.Locale.Builder builder12 = new java.util.Locale.Builder();
        java.util.Locale locale13 = builder12.build();
        java.lang.String str14 = locale13.getDisplayCountry();
        java.lang.String str15 = locale6.getDisplayName(locale13);
        java.util.Locale.Builder builder16 = builder1.setLocale(locale6);
        java.util.Locale locale19 = java.util.Locale.forLanguageTag("France");
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.lowerCase("Frankreich", locale19);
        java.lang.String str21 = locale19.getDisplayVariant();
        java.util.Locale locale22 = java.util.Locale.ITALIAN;
        java.util.Set<java.lang.Character> charSet23 = locale22.getExtensionKeys();
        java.lang.String str24 = locale22.getVariant();
        java.lang.String str25 = locale19.getDisplayVariant(locale22);
        java.util.Locale.Builder builder26 = builder1.setLocale(locale19);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder28 = builder26.setRegion("ED_ED");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: ED_ED [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "French (Canada)" + "'", str3, "French (Canada)");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "it");
        org.junit.Assert.assertNotNull(charSet7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Italian" + "'", str9, "Italian");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Italian" + "'", str10, "Italian");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Italian" + "'", str11, "Italian");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Italian" + "'", str15, "Italian");
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "france");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "frankreich" + "'", str20, "frankreich");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "it");
        org.junit.Assert.assertNotNull(charSet23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(builder26);
    }

    @Test
    public void test29408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29408");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('A', 78);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 78 + "'", int2 == 78);
    }

    @Test
    public void test29409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29409");
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
        java.lang.String str29 = locale0.getVariant();
        java.lang.String str30 = locale0.getDisplayScript();
        java.lang.String str31 = locale0.getVariant();
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
        org.junit.Assert.assertEquals(locale16.toString(), "\\u0068");
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
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test29410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29410");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("hcierknarFEshcierknarFhcierknarFghcierknarFEdnucierknarFEshcierknarFhcierknarFghcierknarFE", 112);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test29411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29411");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "fffffffffffffffffffffffffffffffffraadzhaezhafzhagzhaizhalzhamzhanzhaozhaqzharzhacor\351e du sud", 80);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test29412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29412");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069!ih\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\engli", "nglish ...hi!allemandItalienischallemanditalian_ITALIAN_EnglishallemandHI!allemandhi!allemandADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...allemand\\u0034allemandHI!allemandItalianallemand\\u0061allemand\\u0023allemandhi!allemandiTALIANallemandChinese(China)allemandhi!allemandzh_CNallemandiTALIANallemandenallemandItalienischhi!allemandItalienischallemanditalian_ITALIAN_EnglishallemandHI!allemandhi!allemandADAEAFAGAIALAMANAOA", "                                                                                                                  \\u0068", 83);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069!ih\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\engli" + "'", str4, "\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069!ih\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\engli");
    }

    @Test
    public void test29413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29413");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeea (E             G                                                                                     ,\\U0078)", "iiiiiiiiiiiiiiiiiiiiiiiiiiiihI!       iiiiiiiiiiiiiiiiiiiiiiiiiiiii");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeea (E             G                                                                                     ,\\U0078)" + "'", str2, "eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeea (E             G                                                                                     ,\\U0078)");
    }

    @Test
    public void test29414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29414");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue(' ', 95);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 95 + "'", int2 == 95);
    }

    @Test
    public void test29415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29415");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("ffffffffffffffffffffffffffffffffFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhACor\351e du Sud", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test29416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29416");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder5 = builder1.clearExtensions();
        java.util.Locale locale6 = java.util.Locale.ITALIAN;
        java.util.Set<java.lang.Character> charSet7 = locale6.getExtensionKeys();
        java.lang.String str8 = locale6.getVariant();
        java.lang.String str9 = locale6.getDisplayName();
        java.lang.String str10 = locale6.getDisplayName();
        java.lang.String str11 = locale6.getDisplayLanguage();
        java.util.Locale.Builder builder12 = new java.util.Locale.Builder();
        java.util.Locale locale13 = builder12.build();
        java.lang.String str14 = locale13.getDisplayCountry();
        java.lang.String str15 = locale6.getDisplayName(locale13);
        java.util.Locale.Builder builder16 = builder1.setLocale(locale6);
        java.util.Locale locale17 = builder16.build();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = locale17.getUnicodeLocaleType("e                               e                   ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: e                               e                   ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "fran\347ais (Canada)" + "'", str3, "fran\347ais (Canada)");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "it");
        org.junit.Assert.assertNotNull(charSet7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "italien" + "'", str9, "italien");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "italien" + "'", str10, "italien");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "italien" + "'", str11, "italien");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Italian" + "'", str15, "Italian");
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "it");
    }

    @Test
    public void test29417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29417");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("   \\U0034\\U00");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=   \\u0034\\u00");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test29418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29418");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("EagaasiTALIAN_italian_eNGLISHITALIAN_!IHitTAiT_ITALIAN_EgAish", "\u7fa9\u5927\u5229\u6587");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test29419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29419");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("                                 GENCE", 84);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                               GENCE" + "'", str2, "                                                                               GENCE");
    }

    @Test
    public void test29420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29420");
        char[] charArray11 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray11);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny("HI!", charArray11);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "Franz\366sisch", charArray11);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("########################################################################################", charArray11);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "TALIAN\\U0023AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4##a a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4##a a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4, #, #, a,  , a]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test29421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29421");
        char[] charArray10 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "      ", charArray10);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "United State                                                                                     ", charArray10);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny("9hhhhhhhhhh_\\U00789hhhhhhhhhh_\\U00789hhhhhhhhhh_\\U00789hhhhhhhhhh_\\U00789hhhhhhhhhh_\\U00789hhhhenglish", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4##a a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4##a a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, #, #, a,  , a]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test29422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29422");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("hsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnE", '\\');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnE" + "'", str2, "hsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnE");
    }

    @Test
    public void test29423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29423");
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
        java.util.Locale.LanguageRange[] languageRangeArray17 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList18 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList18, languageRangeArray17);
        java.lang.String[] strArray22 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList23 = new java.util.ArrayList<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList23, strArray22);
        java.util.Locale.FilteringMode filteringMode25 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList26 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList18, (java.util.Collection<java.lang.String>) strList23, filteringMode25);
        java.lang.String[] strArray46 = new java.lang.String[] { "hi!       ", "Italienisch", "italian_ITALIAN_English", "HI!", "hi!", "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...", "\\u0034", "HI!", "Italian", "\\u0061", "\\u0023", "hi!", "iTALIAN", "Chinese (China)", "hi!", "zh_CN", "iTALIAN", "en", "Italienisch" };
        java.util.ArrayList<java.lang.String> strList47 = new java.util.ArrayList<java.lang.String>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList47, strArray46);
        java.util.Locale.LanguageRange[] languageRangeArray49 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList50 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList50, languageRangeArray49);
        java.lang.String[] strArray54 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList55 = new java.util.ArrayList<java.lang.String>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList55, strArray54);
        java.util.Locale.FilteringMode filteringMode57 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList58 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList50, (java.util.Collection<java.lang.String>) strList55, filteringMode57);
        java.util.List<java.lang.String> strList59 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList18, (java.util.Collection<java.lang.String>) strList47, filteringMode57);
        java.util.Locale locale60 = java.util.Locale.US;
        java.lang.String str61 = locale60.getScript();
        java.util.Set<java.lang.String> strSet62 = locale60.getUnicodeLocaleAttributes();
        java.lang.String str64 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet62, "allemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemand");
        java.util.List<java.lang.String> strList65 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList18, (java.util.Collection<java.lang.String>) strSet62);
        java.lang.String str66 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet62);
        java.util.Locale locale67 = java.util.Locale.ITALY;
        java.lang.String str68 = locale67.getDisplayLanguage();
        java.util.Locale locale69 = java.util.Locale.getDefault();
        java.lang.String str70 = locale69.getLanguage();
        java.lang.String str71 = locale69.getScript();
        java.lang.String str72 = locale69.getISO3Country();
        java.lang.String str73 = locale69.getCountry();
        java.lang.String str74 = locale69.getCountry();
        java.lang.String str75 = locale67.getDisplayScript(locale69);
        java.util.Set<java.lang.String> strSet76 = locale67.getUnicodeLocaleKeys();
        java.util.List<java.lang.String> strList77 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet76);
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
        org.junit.Assert.assertNotNull(languageRangeArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + filteringMode25 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode25.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(languageRangeArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + filteringMode57 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode57.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList58);
        org.junit.Assert.assertNotNull(strList59);
        org.junit.Assert.assertNotNull(locale60);
        org.junit.Assert.assertEquals(locale60.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertNotNull(strSet62);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertNotNull(strList65);
        org.junit.Assert.assertNull(str66);
        org.junit.Assert.assertNotNull(locale67);
        org.junit.Assert.assertEquals(locale67.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "italien" + "'", str68, "italien");
        org.junit.Assert.assertNotNull(locale69);
        org.junit.Assert.assertEquals(locale69.toString(), "de");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "de" + "'", str70, "de");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertNotNull(strSet76);
        org.junit.Assert.assertNotNull(strList77);
    }

    @Test
    public void test29424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29424");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("\\00\nzz", "\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITALI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\00\nzz" + "'", str2, "\\00\nzz");
    }

    @Test
    public void test29425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29425");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Locale locale1 = java.util.Locale.ITALIAN;
        java.lang.String str3 = locale1.getExtension('h');
        java.lang.String str4 = locale0.getDisplayScript(locale1);
        java.util.Locale locale8 = new java.util.Locale("HI!       ", "\\U0020", "Italienisch#########################################################################################");
        java.lang.String str9 = locale0.getDisplayCountry(locale8);
        java.lang.String str11 = locale8.getExtension('e');
        java.lang.String str12 = locale8.getDisplayLanguage();
        java.util.Locale locale15 = java.util.Locale.getDefault();
        java.lang.String str16 = locale15.getDisplayScript();
        java.util.Locale locale17 = java.util.Locale.FRANCE;
        java.util.Locale locale18 = java.util.Locale.ITALIAN;
        java.lang.String str20 = locale18.getExtension('h');
        java.lang.String str21 = locale17.getDisplayScript(locale18);
        boolean boolean22 = locale17.hasExtensions();
        java.lang.String str23 = locale17.getVariant();
        java.util.Set<java.lang.Character> charSet24 = locale17.getExtensionKeys();
        java.lang.String str25 = locale17.toLanguageTag();
        java.lang.String str26 = locale15.getDisplayCountry(locale17);
        java.lang.String str27 = org.apache.commons.lang3.StringUtils.lowerCase("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444en", locale15);
        java.lang.String str28 = locale15.getISO3Country();
        java.lang.String str29 = org.apache.commons.lang3.StringUtils.lowerCase("\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064", locale15);
        java.util.Locale locale30 = locale15.stripExtensions();
        java.lang.String str31 = locale8.getDisplayName(locale30);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals(locale8.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "France" + "'", str9, "France");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!       " + "'", str12, "hi!       ");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "de");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "it");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(charSet24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "fr-FR" + "'", str25, "fr-FR");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444en" + "'", str27, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444en");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064" + "'", str29, "\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "de");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!        (\\U0020,Italienisch#########################################################################################)" + "'", str31, "hi!        (\\U0020,Italienisch#########################################################################################)");
    }

    @Test
    public void test29426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29426");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("########################################################Franz\366sisc########################################################", (int) 'F');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "########################################################Franz\366sisc########################################################" + "'", str2, "########################################################Franz\366sisc########################################################");
    }

    @Test
    public void test29427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29427");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("\\u0023_ITALIENISCH_iTALIAN", "Adaeafagaialamanaoaqarasatauawaxazbabbbdbebfbgbhbibjblbmbnbobqbrbsbtbvbwbybzcacccdcfcgchcickclcmcncocrcucvcwcxcyczdedh...", 121);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test29428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29428");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                                                    fran\347ais (France)                                                     ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test29429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29429");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("555555555555555CHN555555555555555", (int) 'e');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "555555555555555CHN555555555555555" + "'", str2, "555555555555555CHN555555555555555");
    }

    @Test
    public void test29430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29430");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("FrankreichFrz\366cz(frkrec)Frz\366cz(frkrec)Frz\366cz(frkrec)Frz\366cz(frkrec)Frz\366cz(frkreitaly");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ylatierkrf(zc\366zrF)cerkrf(zc\366zrF)cerkrf(zc\366zrF)cerkrf(zc\366zrF)cerkrf(zc\366zrFhcierknarF" + "'", str1, "ylatierkrf(zc\366zrF)cerkrf(zc\366zrF)cerkrf(zc\366zrF)cerkrf(zc\366zrF)cerkrf(zc\366zrFhcierknarF");
    }

    @Test
    public void test29431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29431");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("...It...", (int) 'z');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...It..." + "'", str2, "...It...");
    }

    @Test
    public void test29432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29432");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("Italian");
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale.Builder builder6 = builder3.setScript("");
        java.util.Locale.Builder builder7 = builder6.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder6.setExtension('E', "                                                                                     g             ");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension value:                                                                                      g              [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test29433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29433");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("frankreich");
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + 'f' + "'", char1 == 'f');
    }

    @Test
    public void test29434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29434");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder5 = builder4.clear();
        java.util.Locale.Builder builder6 = builder4.clearExtensions();
        java.util.Locale.Builder builder9 = builder4.setExtension('I', "");
        java.util.Locale.Builder builder11 = builder9.setVariant("");
        java.util.Locale.Builder builder12 = builder9.clear();
        java.util.Locale.Builder builder13 = builder9.clearExtensions();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "fran\347ais (Canada)" + "'", str3, "fran\347ais (Canada)");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test29435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29435");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("\\U0049");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\U0049" + "'", str1, "\\U0049");
    }

    @Test
    public void test29436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29436");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("FR-caFR-caFR-c8600U\\FR-caFR-caFR-ca");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "FR-caFR-caFR-c8600U\\FR-caFR-caFR-ca" + "'", str1, "FR-caFR-caFR-c8600U\\FR-caFR-caFR-ca");
    }

    @Test
    public void test29437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29437");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!anchc!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "                                      italian (ITALIAN,English)                                      ", 6);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test29438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29438");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "             ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test29439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29439");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("\\u0065                             a)                                                                                                ", 44, "\\u006e");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\u0065                             a)                                                                                                " + "'", str3, "\\u0065                             a)                                                                                                ");
    }

    @Test
    public void test29440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29440");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("german (germany)german (germany)german (gc\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rchinesisch (china)(germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "german(germany)german(germany)german(gcchinesisch(china)(germany)german(germany)german(germany)german(germany)german(germany)german(germany)german(germany)german(germany)german(germany)german(germany)german(germany)german(germany)german(germany)german(germany)german(germany)german(germany)german(germany)german(germany)german(germany)german(germany)german(germany)german(germany)german(germany)german(germany)german(germany)german(germany)german(germany)german(germany)german(germany)german(germany)german(germany)german(germany)german(germany)german(germany)german(germany)german(germany)german(germany)german(germany)german(germany)german(germany)german(germany)german(germany)german(germany)german(germany)german(germany)german(germany)german(germany)german(germany)" + "'", str1, "german(germany)german(germany)german(gcchinesisch(china)(germany)german(germany)german(germany)german(germany)german(germany)german(germany)german(germany)german(germany)german(germany)german(germany)german(germany)german(germany)german(germany)german(germany)german(germany)german(germany)german(germany)german(germany)german(germany)german(germany)german(germany)german(germany)german(germany)german(germany)german(germany)german(germany)german(germany)german(germany)german(germany)german(germany)german(germany)german(germany)german(germany)german(germany)german(germany)german(germany)german(germany)german(germany)german(germany)german(germany)german(germany)german(germany)german(germany)german(germany)german(germany)german(germany)german(germany)german(germany)");
    }

    @Test
    public void test29441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29441");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("Chinesisch(China)", 371, (int) '\351');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test29442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29442");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test29443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29443");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("FranceTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "FranceTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" + "'", str1, "FranceTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT");
    }

    @Test
    public void test29444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29444");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "\\u0020iTALIANiTALIANiTALIANiT");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test29445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29445");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "NC_hz\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r", (java.lang.CharSequence) "B");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "NC_hz\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r" + "'", charSequence2, "NC_hz\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r");
    }

    @Test
    public void test29446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29446");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("443200u\\44", 52, (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
    }

    @Test
    public void test29447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29447");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("\uc911\uad6d) \r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\uc911\uad6d\uc5b4", "");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test29448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29448");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = java.util.Locale.UK;
        java.util.Locale.Builder builder3 = builder0.setLocale(locale2);
        java.util.Set<java.lang.String> strSet4 = locale2.getUnicodeLocaleAttributes();
        java.lang.String str5 = locale2.getDisplayVariant();
        boolean boolean6 = locale2.hasExtensions();
        java.util.Set<java.lang.String> strSet7 = locale2.getUnicodeLocaleKeys();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en_GB");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strSet7);
    }

    @Test
    public void test29449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29449");
        java.util.Locale locale1 = java.util.Locale.FRENCH;
        java.util.Locale locale2 = java.util.Locale.ENGLISH;
        java.lang.String str3 = locale2.getDisplayCountry();
        java.lang.String str4 = locale1.getDisplayVariant(locale2);
        java.lang.String str5 = locale1.getDisplayCountry();
        java.lang.String str6 = locale1.getScript();
        java.lang.String str7 = locale1.getScript();
        java.lang.String str8 = locale1.getDisplayVariant();
        java.util.Locale locale9 = java.util.Locale.FRANCE;
        java.util.Locale locale10 = java.util.Locale.ITALIAN;
        java.lang.String str12 = locale10.getExtension('h');
        java.lang.String str13 = locale9.getDisplayScript(locale10);
        java.util.Locale locale17 = new java.util.Locale("HI!       ", "\\U0020", "Italienisch#########################################################################################");
        java.lang.String str18 = locale9.getDisplayCountry(locale17);
        java.util.Locale.setDefault(locale9);
        java.util.Locale locale20 = locale9.stripExtensions();
        java.lang.String str21 = locale9.getDisplayName();
        java.util.Set<java.lang.String> strSet22 = locale9.getUnicodeLocaleAttributes();
        java.lang.String str23 = locale1.getDisplayLanguage(locale9);
        java.util.Set<java.lang.Character> charSet24 = locale1.getExtensionKeys();
        java.lang.String str25 = org.apache.commons.lang3.StringUtils.lowerCase("Germa", locale1);
        java.lang.String str26 = locale1.getDisplayScript();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
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
        org.junit.Assert.assertEquals(locale17.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "France" + "'", str18, "France");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "fran\347ais (France)" + "'", str21, "fran\347ais (France)");
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "fran\347ais" + "'", str23, "fran\347ais");
        org.junit.Assert.assertNotNull(charSet24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "germa" + "'", str25, "germa");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test29450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29450");
        java.util.Locale locale2 = new java.util.Locale("G", "Franz\366sisch");
        java.util.Locale locale4 = java.util.Locale.FRANCE;
        java.util.Locale locale5 = java.util.Locale.ITALIAN;
        java.lang.String str7 = locale5.getExtension('h');
        java.lang.String str8 = locale4.getDisplayScript(locale5);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.lowerCase("HI!       ", locale4);
        java.lang.String str10 = locale4.getDisplayLanguage();
        java.util.Locale locale12 = java.util.Locale.CHINESE;
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.lowerCase("Franz\366sisch (Frankreich)", locale12);
        java.lang.String str14 = locale12.getDisplayName();
        java.lang.String str15 = locale4.getDisplayCountry(locale12);
        java.lang.String str16 = locale2.getDisplayVariant(locale12);
        java.lang.String str17 = locale2.toString();
        org.junit.Assert.assertEquals(locale2.toString(), "g_FRANZ\366SISCH");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "it");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!       " + "'", str9, "hi!       ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "fran\347ais" + "'", str10, "fran\347ais");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "franz\366sisch (frankreich)" + "'", str13, "franz\366sisch (frankreich)");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chinois" + "'", str14, "chinois");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\u6cd5\u56fd" + "'", str15, "\u6cd5\u56fd");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "g_FRANZ\366SISCH" + "'", str17, "g_FRANZ\366SISCH");
    }

    @Test
    public void test29451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29451");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("LIAN_EgAish                                 \\u0068", "\\u0021");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test29452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29452");
        java.util.Locale locale2 = new java.util.Locale("France", "       !IH");
        java.util.Locale locale3 = java.util.Locale.CHINESE;
        java.util.Locale locale4 = java.util.Locale.FRENCH;
        java.lang.String str5 = locale4.getDisplayName();
        java.lang.String str7 = locale4.getExtension('C');
        java.lang.String str8 = locale3.getDisplayLanguage(locale4);
        java.util.Locale.setDefault(locale3);
        java.lang.String str10 = locale2.getDisplayVariant(locale3);
        java.lang.String str11 = locale2.toLanguageTag();
        java.util.Locale.setDefault(locale2);
        boolean boolean13 = locale2.hasExtensions();
        java.lang.String str14 = locale2.getDisplayLanguage();
        java.lang.String str15 = locale2.getScript();
        org.junit.Assert.assertEquals(locale2.toString(), "france_       !IH");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "fran\347ais" + "'", str5, "fran\347ais");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chinois" + "'", str8, "chinois");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "france" + "'", str11, "france");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "france" + "'", str14, "france");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test29453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29453");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("DEFGILMNOQRSTUWXZBBBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVB                                                 HCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLLBLCLILKLRLSLTLULVLYMMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNNCNENFNGNINLNONPNRNUNZOMPPEPFPGPHPKPLPMPNPRPSPTPWPYQRERORSRURWSSBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUUGUMUSUYUZVVCVEVGVIVNVUWFWSYEYTZZMZW", "english                                h                                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "DEFGILMNOQRSTUWXZBBBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVB                                                 HCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLLBLCLILKLRLSLTLULVLYMMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNNCNENFNGNINLNONPNRNUNZOMPPEPFPGPHPKPLPMPNPRPSPTPWPYQRERORSRURWSSBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUUGUMUSUYUZVVCVEVGVIVNVUWFWSYEYTZZMZW" + "'", str2, "DEFGILMNOQRSTUWXZBBBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVB                                                 HCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLLBLCLILKLRLSLTLULVLYMMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNNCNENFNGNINLNONPNRNUNZOMPPEPFPGPHPKPLPMPNPRPSPTPWPYQRERORSRURWSSBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUUGUMUSUYUZVVCVEVGVIVNVUWFWSYEYTZZMZW");
    }

    @Test
    public void test29454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29454");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("italian_ITALIAN_EnglisFitalian (italian,englis", (int) 'u');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                   italian_ITALIAN_EnglisFitalian (italian,englis                                    " + "'", str2, "                                   italian_ITALIAN_EnglisFitalian (italian,englis                                    ");
    }

    @Test
    public void test29455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29455");
        java.util.Locale locale3 = new java.util.Locale("HHHHHHHHH         ITAL\\u0020iItalian\\u008600u\\HHHHHHHHH         ITAL", "                                                                                                                                okokok                                                                                                                                ", "Cinese (Cina)\\u0069h..");
        org.junit.Assert.assertEquals(locale3.toString(), "hhhhhhhhh         ital\\u0020iitalian\\u008600u\\hhhhhhhhh         ital_                                                                                                                                OKOKOK                                                                                                                                _Cinese (Cina)\\u0069h..");
    }

    @Test
    public void test29456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29456");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("NC_hz\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r", 116, 38);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test29457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29457");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "AND4444", (java.lang.CharSequence) "44                                                                                               en44");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test29458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29458");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("YBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHER", "eZZZZZZZZZZZZZHCSINEILATIZZZZZZZZZZZZZgZZZZZZZZZZZZZHCSINEILATIZZZZZZZZZZZZZZZZZZZZZZZZZZHCSINEILATIZZZZZZZZZZZZZsh\\XT", "\uc601\uc5b4", (int) 'T');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "YBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHER" + "'", str4, "YBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHER");
    }

    @Test
    public void test29459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29459");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("Frankreich)kkkkkkkkkkkkkkkkkkkEnglFrankreich)kkkkkkkkkkkkkkkkkkk", (int) '2', 'k');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Frankreich)kkkkkkkkkkkkkkkkkkkEnglFrankreich)kkkkkkkkkkkkkkkkkkk" + "'", str3, "Frankreich)kkkkkkkkkkkkkkkkkkkEnglFrankreich)kkkkkkkkkkkkkkkkkkk");
    }

    @Test
    public void test29460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29460");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "\r\rneilatI    E\r\r", (java.lang.CharSequence) "R-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FR");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test29461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29461");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "ne\351roc");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test29462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29462");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("F", "5c5c5cm5c5c5c5c5c5c5cm5c5cy5c");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test29463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29463");
        java.util.Locale locale2 = new java.util.Locale("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaTtat_itaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", ")NAILATi,HCSINEILATI( 3200u\\");
        org.junit.Assert.assertEquals(locale2.toString(), "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaattat_itaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa_)NAILATI,HCSINEILATI( 3200U\\");
    }

    @Test
    public void test29464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29464");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("cHINESISCH (cHINA)", "...zhzhzhfran\347ais cinese (cina)\\u0069h..France)Az...");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test29465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29465");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder4 = builder0.clear();
        java.util.Locale.Builder builder5 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder6 = builder5.clear();
        java.util.Locale.Builder builder7 = builder5.clear();
        java.util.Locale.Builder builder8 = builder7.clear();
        java.util.Locale locale9 = java.util.Locale.CANADA;
        java.lang.String str10 = locale9.getISO3Country();
        java.util.Locale.Builder builder11 = builder8.setLocale(locale9);
        java.util.Locale locale12 = builder11.build();
        java.util.Locale.Builder builder13 = builder0.setLocale(locale12);
        java.util.Locale.Builder builder14 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder15 = builder14.clear();
        java.util.Locale locale16 = java.util.Locale.UK;
        java.util.Locale.Builder builder17 = builder14.setLocale(locale16);
        java.util.Locale.setDefault(locale16);
        java.util.Locale.Builder builder19 = builder0.setLocale(locale16);
        java.util.Locale locale20 = java.util.Locale.ITALIAN;
        java.util.Set<java.lang.Character> charSet21 = locale20.getExtensionKeys();
        java.lang.String str22 = locale20.getVariant();
        java.lang.String str23 = locale20.getDisplayName();
        java.util.Set<java.lang.Character> charSet24 = locale20.getExtensionKeys();
        java.lang.String str25 = locale16.getDisplayScript(locale20);
        java.lang.String str26 = locale16.toString();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "CAN" + "'", str10, "CAN");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_CA");
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "en_GB");
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "it");
        org.junit.Assert.assertNotNull(charSet21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Italian" + "'", str23, "Italian");
        org.junit.Assert.assertNotNull(charSet24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "en_GB" + "'", str26, "en_GB");
    }

    @Test
    public void test29466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29466");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("hi!       ");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.split("", "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC", 100);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray7, "...emandtalienischallemandi...");
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.splitByCharacterType("aDAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...");
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEach("AN\\U00FFFFFFFFFFFFFFFFFFFFFFFFFF", strArray7, strArray11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("NI", strArray2, strArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "AN\\U00FFFFFFFFFFFFFFFFFFFFFFFFFF" + "'", str12, "AN\\U00FFFFFFFFFFFFFFFFFFFFFFFFFF");
    }

    @Test
    public void test29467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29467");
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
        java.util.Locale locale11 = java.util.Locale.GERMAN;
        java.util.Locale locale12 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str13 = locale11.getDisplayName(locale12);
        java.util.Locale locale14 = locale11.stripExtensions();
        java.util.Locale locale15 = java.util.Locale.ROOT;
        java.lang.String str16 = locale15.getISO3Country();
        java.util.Set<java.lang.String> strSet17 = locale15.getUnicodeLocaleKeys();
        java.lang.String str18 = locale14.getDisplayVariant(locale15);
        java.lang.String str19 = locale9.getDisplayCountry(locale15);
        java.lang.String str20 = locale9.getCountry();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Franz\366sisch (Kanada)" + "'", str3, "Franz\366sisch (Kanada)");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "und_CA");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "und_CA");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "und_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Kanada" + "'", str10, "Kanada");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "de");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "allemand" + "'", str13, "allemand");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "de");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Canada" + "'", str19, "Canada");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "CA" + "'", str20, "CA");
    }

    @Test
    public void test29468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29468");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("\\u0045", "\\0020ItalianItalianItalianItal");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test29469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29469");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.util.Locale locale1 = java.util.Locale.ENGLISH;
        java.lang.String str2 = locale1.getDisplayCountry();
        java.lang.String str3 = locale0.getDisplayVariant(locale1);
        java.util.Set<java.lang.String> strSet4 = locale0.getUnicodeLocaleKeys();
        java.lang.String str5 = locale0.getLanguage();
        java.util.Set<java.lang.Character> charSet6 = locale0.getExtensionKeys();
        java.util.Set<java.lang.Character> charSet7 = locale0.getExtensionKeys();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "fr" + "'", str5, "fr");
        org.junit.Assert.assertNotNull(charSet6);
        org.junit.Assert.assertNotNull(charSet7);
    }

    @Test
    public void test29470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29470");
        java.util.Locale locale2 = new java.util.Locale("ITTAIT_ITALIAN_EGAISHI!_\\U0020_ITLE###########", "                                             DE_DE                                             ");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = locale2.getUnicodeLocaleType("chinesexxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx_    IIIIIIIIII_.Korean (South Korea)Korean (So");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: chinesexxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx_    IIIIIIIIII_.Korean (South Korea)Korean (So");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "ittait_italian_egaishi!_\\u0020_itle###########_                                             DE_DE                                             ");
    }

    @Test
    public void test29471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29471");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("\\u0020", "ADYAEYAFYAGYAIYALYAMYANYAOYAQYARYASYATYAUYAWYAXYAZYBAYBBYBDYBEYBFYBGYBHYBIYBJYBLYBMYBNYBOYBQYBRYBSYBTYBVYBWYBYYBZYCAYCCYCDYCFYCGYCHYCIYCKYCLYCMYCNYCOYCRYCUYCVYCWYCXYCYYCZYDEYDJYDKYDMYDOYDZYECYEEYEGYEHYERYESYETYFIYFJYFKYFMYFOYFRYGAYGBYGDYGEYGFYGGYGHYGIYGLYGMYGNYGPYGQYGRYGSYGTYGUYGWYGYYHKYHMYHNYHRYHTYHUYIDYIEYILYIMYINYIOYIQYIRYISYITYJEYJMYJOYJPYKEYKGYKHYKIYKMYKNYKPYKRYKWYKYYKZYLAYLBYLCYLIYLKYLRYLSYLTYLUYLVYLYYMAYMCYMDYMEYMFYMGYMHYMKYMLYMMYMNYMOYMPYMQYMRYMSYMTYMUYMVYMWYMXYMYYMZYNAYNCYNEYNFYNGYNIYNLYNOYNPYNRYNUYNZYOMYPAYPEYPFYPGYPHYPKYPLYPMYPNYPRYPSYPTYPWYPYYQAYREYROYRSYRUYRWYSAYSBYSCYSDYSEYSGYSHYSIYSJYSKYSLYSMYSNYSOYSRYSSYSTYSVYSXYSYYSZYTCYTDYTFYTGYTHYTJYTKYTLYTMYTNYTOYTRYTTYTVYTWYTZYUAYUGYUMYUSYUYYUZYVAYVCYVEYVGYVIYVNYVUYWFYWSYYEYYTYZAYZMYZW", (int) 'N');
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test29472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29472");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "###################################i#######...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test29473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29473");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "...                             xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test29474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29474");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("                                eselni                               ", 'A');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + ' ' + "'", char2 == ' ');
    }

    @Test
    public void test29475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29475");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("CHINESE");
        double double2 = languageRange1.getWeight();
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("Deutsch", "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZW", 52);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray7, "IT", (int) 'E', (int) (byte) -1);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.endsWithAny("", strArray7);
        boolean boolean13 = languageRange1.equals((java.lang.Object) strArray7);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test29476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29476");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("\\u0020iItalian\\u0020i", "h!       5Italensch5talan_ITALIAN_Englsh5HI!5h!5ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...5\\u00345HI!5Italan5\\u00615\\u00235h!5TALIAN5Chnese (Chna)5h!5zh_CN5TALIAN5en5Italensch");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u0020iItalian\\u0020i" + "'", str2, "\\u0020iItalian\\u0020i");
    }

    @Test
    public void test29477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29477");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("Etats-Unis", "  \\u0020iTALIANiTALIANiTALIANiTAL  ", (int) ')');
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "fr-cafr-cafr-cafr-cafr-cafr-cafr-cafr-cafr-cafr-cafr-cafr\\u000dfr-cafr-cafr-cafr-cafr-cafr-cafr-cafr-cafr-cafr-cafr-cafr");
        int int6 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray5);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test29478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29478");
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
            java.util.Locale.Builder builder15 = builder10.setUnicodeLocaleKeyword("cCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC nailati             ", "cccccc...");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: cCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC nailati              [at index 0]");
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
    public void test29479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29479");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("italieitalNC_hzitalieital", 10, (int) 'u');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "NC_hzitalieital" + "'", str3, "NC_hzitalieital");
    }

    @Test
    public void test29480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29480");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("ANGLAIS (rOYAUME-uNI)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ANGLAIS(rOYAUME-uNI)" + "'", str1, "ANGLAIS(rOYAUME-uNI)");
    }

    @Test
    public void test29481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29481");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "zh_cnggggg", (java.lang.CharSequence) "ZHO                               44\\                                             DE_DE                                             002344  \\                                             DE_DE                                             0020iTALIANiTALIANiTALIANiTALI");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "zh_cnggggg" + "'", charSequence2, "zh_cnggggg");
    }

    @Test
    public void test29482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29482");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("italCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=italcccccccccccccccccccccccccccccccccccccccccccccccccegschcccccccccccccccccccccccccccccccccccccccccccccccccc");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test29483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29483");
        java.util.Locale locale1 = new java.util.Locale("italy");
        boolean boolean2 = locale1.hasExtensions();
        java.util.Set<java.lang.Character> charSet3 = locale1.getExtensionKeys();
        boolean boolean5 = locale1.equals((java.lang.Object) "EagaasiTALIAN_italian_eNGLISHITALIAN_!IHitTAiT_ITALIAN_EgAish");
        org.junit.Assert.assertEquals(locale1.toString(), "italy");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(charSet3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test29484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29484");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray12 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray12);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "iTALIAN", charArray12);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "it", charArray12);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "h", charArray12);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                                                         ", charArray12);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence0, charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "4##a a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "4##a a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4, #, #, a,  , a]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test29485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29485");
        java.util.Locale locale1 = new java.util.Locale("en");
        java.lang.String str2 = locale1.getDisplayVariant();
        java.util.Locale.Category category3 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale4 = java.util.Locale.getDefault(category3);
        java.util.Locale locale5 = java.util.Locale.GERMAN;
        java.util.Locale locale6 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str7 = locale5.getDisplayName(locale6);
        java.util.Locale.setDefault(category3, locale6);
        java.util.Locale.Category category9 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale10 = java.util.Locale.getDefault(category9);
        java.lang.String str12 = locale10.getExtension('x');
        java.util.Locale.setDefault(category3, locale10);
        java.util.Locale locale14 = java.util.Locale.getDefault(category3);
        java.util.Locale locale16 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale.setDefault(category3, locale16);
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
        java.util.Locale.Category category33 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale34 = java.util.Locale.getDefault(category33);
        java.util.Locale locale35 = java.util.Locale.FRANCE;
        java.util.Locale locale36 = java.util.Locale.ITALIAN;
        java.lang.String str38 = locale36.getExtension('h');
        java.lang.String str39 = locale35.getDisplayScript(locale36);
        java.lang.String str40 = locale35.getISO3Country();
        java.util.Locale locale41 = java.util.Locale.GERMAN;
        java.util.Locale.setDefault(locale41);
        java.lang.String str43 = locale35.getDisplayName(locale41);
        java.lang.String str44 = locale35.getScript();
        java.util.Locale.setDefault(category33, locale35);
        java.lang.String str46 = locale18.getDisplayCountry(locale35);
        java.util.Locale.Builder builder47 = new java.util.Locale.Builder();
        java.util.Locale locale48 = builder47.build();
        java.util.Locale locale50 = java.util.Locale.forLanguageTag("Italian");
        java.lang.String str51 = locale48.getDisplayLanguage(locale50);
        java.lang.String str52 = locale35.getDisplayVariant(locale48);
        java.util.Locale.setDefault(category3, locale48);
        java.util.Locale locale54 = java.util.Locale.FRANCE;
        java.util.Locale locale55 = java.util.Locale.ITALIAN;
        java.lang.String str57 = locale55.getExtension('h');
        java.lang.String str58 = locale54.getDisplayScript(locale55);
        java.util.Locale locale59 = locale54.stripExtensions();
        java.util.Set<java.lang.Character> charSet60 = locale59.getExtensionKeys();
        java.util.Locale locale62 = java.util.Locale.ENGLISH;
        java.lang.String str63 = locale62.getDisplayLanguage();
        java.lang.String str64 = org.apache.commons.lang3.StringUtils.upperCase("!IH", locale62);
        java.lang.String str65 = locale62.getCountry();
        java.lang.String str66 = locale62.getCountry();
        boolean boolean67 = locale62.hasExtensions();
        java.lang.String str68 = locale59.getDisplayVariant(locale62);
        java.lang.String str70 = locale62.getExtension('a');
        java.lang.String str71 = locale48.getDisplayScript(locale62);
        java.lang.String str72 = locale1.getDisplayVariant(locale48);
        java.lang.String str73 = locale1.getISO3Language();
        java.util.Locale locale75 = java.util.Locale.forLanguageTag("Azhzhzhzhzhzhzhzhzhzh");
        java.lang.String str76 = locale1.getDisplayVariant(locale75);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + category3 + "' != '" + java.util.Locale.Category.FORMAT + "'", category3.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "de");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "de");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "allemand" + "'", str7, "allemand");
        org.junit.Assert.assertTrue("'" + category9 + "' != '" + java.util.Locale.Category.FORMAT + "'", category9.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "fr_CA");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "");
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
        org.junit.Assert.assertTrue("'" + category33 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category33.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale34);
// flaky:         org.junit.Assert.assertEquals(locale34.toString(), "de");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "it");
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "FRA" + "'", str40, "FRA");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "de");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Franz\366sisch (Frankreich)" + "'", str43, "Franz\366sisch (Frankreich)");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "");
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "italian");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "it");
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(charSet60);
        org.junit.Assert.assertNotNull(locale62);
        org.junit.Assert.assertEquals(locale62.toString(), "en");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "anglais" + "'", str63, "anglais");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "!IH" + "'", str64, "!IH");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertNull(str70);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "eng" + "'", str73, "eng");
        org.junit.Assert.assertNotNull(locale75);
        org.junit.Assert.assertEquals(locale75.toString(), "");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
    }

    @Test
    public void test29486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29486");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("ADAAEAAFAAGAAIAALAAMAANAAOAAQAARAAS", "\\U0034\\U00                                             HCSTUD                                             \\U0034\\U00 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ADAAEAAFAAGAAIAALAAMAANAAOAAQAARAAS" + "'", str2, "ADAAEAAFAAGAAIAALAAMAANAAOAAQAARAAS");
    }

    @Test
    public void test29487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29487");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("...LIAN");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...LIAN" + "'", str2, "...LIAN");
    }

    @Test
    public void test29488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29488");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("... g ...", "ROYAUME-UNI", "443200u\\44");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test29489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29489");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("cHINESISCH (cHINA)", "-RF", "         englisch         ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "cHINESISCH (cHINA)" + "'", str3, "cHINESISCH (cHINA)");
    }

    @Test
    public void test29490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29490");
        char[] charArray7 = new char[] { ' ', '4' };
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!", charArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "French", charArray7);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaafraaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray7);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAA...ANITALIAAAAAAAAAAAAAAAAAAAAAAAAAA", charArray7);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "anglais (Canada)", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test29491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29491");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("\\italian_ITALIAN_English", 210);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                             \\italian_ITALIAN_English                                                                                             " + "'", str2, "                                                                                             \\italian_ITALIAN_English                                                                                             ");
    }

    @Test
    public void test29492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29492");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("cor\351en (Cor\351e du Sud)", "...       g                     ...", 34);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test29493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29493");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("Italian");
        java.util.Locale.Builder builder4 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder0.clear();
        java.util.Locale locale7 = java.util.Locale.forLanguageTag("\\u0020");
        java.util.Locale.Builder builder8 = builder0.setLocale(locale7);
        java.util.Locale.Builder builder9 = builder8.clear();
        java.util.Locale.Builder builder10 = builder8.clearExtensions();
        java.util.Locale.Builder builder11 = builder10.clearExtensions();
        java.util.Locale locale12 = builder11.build();
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
    }

    @Test
    public void test29494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29494");
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
        java.util.Locale locale21 = java.util.Locale.ROOT;
        java.lang.String str22 = locale21.getISO3Language();
        java.util.Locale locale24 = new java.util.Locale("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rzh_CN");
        java.lang.String str25 = locale21.getDisplayVariant(locale24);
        java.util.Locale.setDefault(category0, locale24);
        java.util.Locale locale27 = java.util.Locale.getDefault(category0);
        java.lang.String str28 = locale27.getCountry();
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
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals(locale24.toString(), "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rzh_cn");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rzh_cn");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test29495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29495");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "6400aUa\\\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rzh_CN");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test29496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29496");
        char[] charArray12 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray12);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "         ITALIAN_italian_eNGLISH", charArray12);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "de", charArray12);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "...It...", charArray12);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny("zhzhzhzhzhzhzhzhzhzhFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAzhzhzhzhzhzhzhzhzhzh", charArray12);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "dnaHhhhhhhhhdnam", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "4##a a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "4##a a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4, #, #, a,  , a]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test29497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29497");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("Chinese (China)hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", 0, "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Chinese (China)hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh" + "'", str3, "Chinese (China)hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
    }

    @Test
    public void test29498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29498");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray7 = new char[] { '#', '4', ' ' };
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsNone(charSequence3, charArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsAny("ita", charArray7);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCcinese (cina)u0069h..CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC", charArray7);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "!!!!!!!!!!!!!!!!!!!!!!    ZH_CN    !!!!!!!!!!!!!!!!!!!!!!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test29499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29499");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("                              de_de                              ", 28);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                              de_de                              " + "'", str2, "                              de_de                              ");
    }

    @Test
    public void test29500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29500");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("", (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }
}
