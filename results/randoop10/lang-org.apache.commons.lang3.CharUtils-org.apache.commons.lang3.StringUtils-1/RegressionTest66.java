import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest66 {

    public static boolean debug = false;

    @Test
    public void test33001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest66.test33001");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "\\u671d");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test33002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest66.test33002");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("ChineseB(China)", "                                                                                                                                                                                                                                                                                                                                                                      It_                                                                                                                                                                                                                                                                                                                                                                       ", 48);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test33003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest66.test33003");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("NC_H", "", (int) (byte) 100);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test33004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest66.test33004");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("italCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC", "tit", "hi!allemandItalienischallemanditalian_ITALIAN_EnglishallemandHI!allemandhi!allemandADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...allemand\\u0034allemandHI!allemandItalianallemand\\u0061allemand\\u0023allemandhi!allemandiTALIANallemandChinese(China)allemandhi!allemandzh_CNallemandiTALIANallemandenallemandItalienisch");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "italCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC" + "'", str3, "italCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
    }

    @Test
    public void test33005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest66.test33005");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("DE\rDJ\rDK\rDM\rDO\rDZ\rEC\rEE\rEG\rEH\rER\rES\rET\rFI\rFJ\rFK\rFM\rFO\rFR\rGA\rGB\rGD\rGE\rGF\rGG\rGH\rGI\rGL\rGM\rGN\rGP\rGQ", "ckclcmcncocrcucvcwcxcyczdedh...ibjblbmbnbobqbrbsbtbvbwbybzcacccdcfcgchcialamanaoaqarasatauawaxazbabbbdbebfbgbhbiadaeafaga");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test33006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest66.test33006");
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
        java.lang.String str21 = locale20.getDisplayName();
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "French (France)" + "'", str21, "French (France)");
    }

    @Test
    public void test33007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest66.test33007");
        java.util.Locale locale1 = new java.util.Locale("\\xtalxan_ITALIAN_Englxsh");
        java.lang.String str2 = locale1.getDisplayScript();
        org.junit.Assert.assertEquals(locale1.toString(), "\\xtalxan_italian_englxsh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test33008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest66.test33008");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("TALIAN\\u0023DALLEMANDALLEMANDALLEMANDALLEMANDALLEMANDALLEMANDALLEMANDALLE");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "TALIAN\\u0023DALLEMANDALLEMANDALLEMANDALLEMANDALLEMANDALLEMANDALLEMANDALLE" + "'", str1, "TALIAN\\u0023DALLEMANDALLEMANDALLEMANDALLEMANDALLEMANDALLEMANDALLEMANDALLE");
    }

    @Test
    public void test33009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest66.test33009");
        char[] charArray11 = new char[] { ' ', '4' };
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!", charArray11);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray11);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "h", charArray11);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "h", charArray11);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "iTALIAN", charArray11);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "8600u\\", charArray11);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\\U0078", charArray11);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "adaeafagaialamanaoaqarasatauawaxazbabbbdbebfbgbhbibjblbmbnbobqbrbsbtbvbwbybzcacccdcfcgchcickclcmcncocrcucvcwcxcyczded8...", charArray11);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "itTAiT_ITA", charArray11);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test33010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest66.test33010");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "                                                                                                                                                                                                            hcsineilat                                                  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test33011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest66.test33011");
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
        java.util.Locale locale12 = locale9.stripExtensions();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "French (Canada)" + "'", str4, "French (Canada)");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "italian");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "                                                                                                        " + "'", str10, "                                                                                                        ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "italian" + "'", str11, "italian");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "italian");
    }

    @Test
    public void test33012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest66.test33012");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("FRANC", "2cinese (Cina)iTALIANiTALIANiTALIANiTAL");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "FRANC" + "'", str2, "FRANC");
    }

    @Test
    public void test33013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest66.test33013");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("E             g                                                                                     ", 't');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test33014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest66.test33014");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069!IH\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\ENGLISCH", "FRANZOSI         ITALIAN_italian_eNGLISHFRANZOSI", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069!\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\EC" + "'", str3, "\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069!\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\EC");
    }

    @Test
    public void test33015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest66.test33015");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals(charSequence0, (java.lang.CharSequence) "\\u0034\\u00                                             hcstud                                             \\u0034\\u00");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test33016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest66.test33016");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder6 = builder1.setLanguage("und");
        java.util.Locale locale7 = builder6.build();
        java.lang.String str8 = locale7.getLanguage();
        java.util.Set<java.lang.String> strSet9 = locale7.getUnicodeLocaleKeys();
        java.util.Set<java.lang.String> strSet10 = locale7.getUnicodeLocaleAttributes();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "French (Canada)" + "'", str3, "French (Canada)");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "und_CA");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "und" + "'", str8, "und");
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(strSet10);
    }

    @Test
    public void test33017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest66.test33017");
        java.lang.String[] strArray0 = java.util.Locale.getISOCountries();
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray0);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray0, ' ', (int) 'x', (int) (byte) 10);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZW" + "'", str1, "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZW");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test33018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest66.test33018");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("0020iIalian\\u008600u", "\uc601\uc5b4");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByCharacterType("HI!       ");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray5);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray5, "ENGLISCH (         italian_italian_english,\\U0061");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEach("8ian\\u0020i86 (ITALIAN (ITALIAN,ENGLISH))", strArray3, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 6 vs 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test33019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest66.test33019");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("ZHO", 363);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                    ZHO                                                                                                                                                                                    " + "'", str2, "                                                                                                                                                                                    ZHO                                                                                                                                                                                    ");
    }

    @Test
    public void test33020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest66.test33020");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) " hi!       _\\u0020...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test33021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest66.test33021");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("ZHZHZHZHZHZHZHZHZHZHFRAADZHAEZHAFZHAGZHAIZHALZHAMZHANZHAOZHAQZHARZHASZHAZHZHZHZHZHZHZHZHZHZ2222222222222222222222222222222222222222222222222222222222222222222222222", "                \\     ", "\\u0034\\u00                                             hcstued                                             \\u0034\\u00");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ZHZHZHZHZHZHZHZHZHZHFRAADZHAEZHAFZHAGZHAIZHALZHAMZHANZHAOZHAQZHARZHASZHAZHZHZHZHZHZHZHZHZHZ2222222222222222222222222222222222222222222222222222222222222222222222222" + "'", str3, "ZHZHZHZHZHZHZHZHZHZHFRAADZHAEZHAFZHAGZHAIZHALZHAMZHANZHAOZHAQZHARZHASZHAZHZHZHZHZHZHZHZHZHZ2222222222222222222222222222222222222222222222222222222222222222222222222");
    }

    @Test
    public void test33022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest66.test33022");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "itFranz\366sischTAFranz\366sischiFranz\366sischTFranz\366sisch_Franz\366sischITA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test33023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest66.test33023");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("8888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888E             g");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "8888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888E             g" + "'", str1, "8888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888E             g");
    }

    @Test
    public void test33024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest66.test33024");
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
        java.lang.String[] strArray26 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList27 = new java.util.ArrayList<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList27, strArray26);
        java.util.List<java.lang.String> strList29 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList16, (java.util.Collection<java.lang.String>) strList27);
        java.util.Locale.LanguageRange[] languageRangeArray30 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList31 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList31, languageRangeArray30);
        java.lang.String[] strArray35 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList36 = new java.util.ArrayList<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList36, strArray35);
        java.util.Locale.FilteringMode filteringMode38 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList39 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList31, (java.util.Collection<java.lang.String>) strList36, filteringMode38);
        java.lang.String[] strArray41 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList42 = new java.util.ArrayList<java.lang.String>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList42, strArray41);
        java.util.List<java.lang.String> strList44 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList31, (java.util.Collection<java.lang.String>) strList42);
        java.util.List<java.lang.String> strList45 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList16, (java.util.Collection<java.lang.String>) strList42);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap46 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList47 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList16, strMap46);
        java.lang.String[] strArray77 = new java.lang.String[] { "FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA", "h", "\\u0066", "franz\366sisch (frankreich)", "ian\\u0020i", "zh", "\\U0020", "Chinesisch (China)", "allemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemand", "English", "itTAiT_ITALIAN_EgAish", "FRA", "!IH", "Englisch", "\\u0020iTALIANiTALIANiTALIANiTALI\\u0020iTALIANiTALIANiTALIANiTAL", "deutsch", "\\u0020iItalian\\u0020i", "\\u0020iItalian\\u0020i", "frankreich", "       !IH", "AD4AE4AF4AG4AI4AL4AM4AN4AO4AQ4AR4AS4AT4AU4AW4AX4AZ4BA4BB4BD4BE4BF4BG4BH4BI4BJ4BL4BM4BN4BO4BQ4BR4BS4BT4BV4BW4BY4BZ4CA4CC4CD4CF4CG4CH4CI4CK4CL4CM4CN4CO4CR4CU4CV4CW4CX4CY4CZ4DE4DJ4DK4DM4DO4DZ4EC4EE4EG4EH4ER4ES4ET4FI4FJ4FK4FM4FO4FR4GA4GB4GD4GE4GF4GG4GH4GI4GL4GM4GN4GP4GQ4GR4GS4GT4GU4GW4GY4HK4HM4HN4HR4HT4HU4ID4IE4IL4IM4IN4IO4IQ4IR4IS4IT4JE4JM4JO4JP4KE4KG4KH4KI4KM4KN4KP4KR4KW4KY4KZ4LA4LB4LC4LI4LK4LR4LS4LT4LU4LV4LY4MA4MC4MD4ME4MF4MG4MH4MK4ML4MM4MN4MO4MP4MQ4MR4MS4MT4MU4MV4MW4MX4MY4MZ4NA4NC4NE4NF4NG4NI4NL4NO4NP4NR4NU4NZ4OM4PA4PE4PF4PG4PH4PK4PL4PM4PN4PR4PS4PT4PW4PY4QA4RE4RO4RS4RU4RW4SA4SB4SC4SD4SE4SG4SH4SI4SJ4SK4SL4SM4SN4SO4SR4SS4ST4SV4SX4SY4SZ4TC4TD4TF4TG4TH4TJ4TK4TL4TM4TN4TO4TR4TT4TV4TW4TZ4UA4UG4UM4US4UY4UZ4VA4VC4VE4VG4VI4VN4VU4WF4WS4YE4YT4ZA4ZM4ZW", "ADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhATzhAUzhAWzhAXzhAZzhBAzhBBzhBDzhBEzhBFzhBGzhBHzhBIzhBJzhBLzhBMzhBNzhBOzhBQzhBRzhBSzhBTzhBVzhBWzhBYzhBZzhCAzhCCzhCDzhCFzhCGzhCHzhCIzhCKzhCLzhCMzhCNzhCOzhCRzhCUzhCVzhCWzhCXzhCYzhCZzhDEzhDJzhDKzhDMzhDOzhDZzhECzhEEzhEGzhEHzhERzhESzhETzhFIzhFJzhFKzhFMzhFOzhFRzhGAzhGBzhGDzhGEzhGFzhGGzhGHzhGIzhGLzhGMzhGNzhGPzhGQzhGRzhGSzhGTzhGUzhGWzhGYzhHKzhHMzhHNzhHRzhHTzhHUzhIDzhIEzhILzhIMzhINzhIOzhIQzhIRzhISzhITzhJEzhJMzhJOzhJPzhKEzhKGzhKHzhKIzhKMzhKNzhKPzhKRzhKWzhKYzhKZzhLAzhLBzhLCzhLIzhLKzhLRzhLSzhLTzhLUzhLVzhLYzhMAzhMCzhMDzhMEzhMFzhMGzhMHzhMKzhMLzhMMzhMNzhMOzhMPzhMQzhMRzhMSzhMTzhMUzhMVzhMWzhMXzhMYzhMZzhNAzhNCzhNEzhNFzhNGzhNIzhNLzhNOzhNPzhNRzhNUzhNZzhOMzhPAzhPEzhPFzhPGzhPHzhPKzhPLzhPMzhPNzhPRzhPSzhPTzhPWzhPYzhQAzhREzhROzhRSzhRUzhRWzhSAzhSBzhSCzhSDzhSEzhSGzhSHzhSIzhSJzhSKzhSLzhSMzhSNzhSOzhSRzhSSzhSTzhSVzhSXzhSYzhSZzhTCzhTDzhTFzhTGzhTHzhTJzhTKzhTLzhTMzhTNzhTOzhTRzhTTzhTVzhTWzhTZzhUAzhUGzhUMzhUSzhUYzhUZzhVAzhVCzhVEzhVGzhVIzhVNzhVUzhWFzhWSzhYEzhYTzhZAzhZMzhZW", "4", "    \\     ", "ian\\u0020i", "CAN", "ENGLISCH", "zh_CN", "\r" };
        java.util.ArrayList<java.lang.String> strList78 = new java.util.ArrayList<java.lang.String>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList78, strArray77);
        java.lang.String str80 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList16, (java.util.Collection<java.lang.String>) strList78);
        java.util.Locale.FilteringMode filteringMode81 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList82 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList78, filteringMode81);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap83 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList84 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap83);
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
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(strList29);
        org.junit.Assert.assertNotNull(languageRangeArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + filteringMode38 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode38.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList39);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(strList44);
        org.junit.Assert.assertNotNull(strList45);
        org.junit.Assert.assertNotNull(languageRangeList47);
        org.junit.Assert.assertNotNull(strArray77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNull(str80);
        org.junit.Assert.assertTrue("'" + filteringMode81 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode81.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList82);
        org.junit.Assert.assertNotNull(languageRangeList84);
    }

    @Test
    public void test33025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest66.test33025");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder5 = builder4.clear();
        java.util.Locale.Builder builder6 = builder4.clearExtensions();
        java.util.Locale.Builder builder9 = builder4.setExtension('I', "");
        java.util.Locale locale10 = java.util.Locale.GERMAN;
        java.util.Locale locale11 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str12 = locale10.getDisplayName(locale11);
        java.util.Locale locale13 = locale10.stripExtensions();
        java.lang.String str14 = locale10.getScript();
        java.lang.String str15 = locale10.getDisplayLanguage();
        java.util.Locale locale16 = java.util.Locale.ITALIAN;
        java.lang.String str17 = locale16.getDisplayLanguage();
        java.util.Locale locale18 = locale16.stripExtensions();
        java.lang.String str19 = locale10.getDisplayScript(locale18);
        java.util.Locale.Builder builder20 = builder9.setLocale(locale18);
        java.util.Locale locale21 = null;
        java.lang.String str22 = locale18.getDisplayVariant(locale21);
        java.util.Locale.Builder builder23 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder24 = builder23.clearExtensions();
        java.util.Locale locale25 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str26 = locale25.getDisplayName();
        java.util.Locale.Builder builder27 = builder24.setLocale(locale25);
        java.util.Locale.Builder builder28 = builder27.clear();
        java.util.Locale.Builder builder30 = builder28.setLanguage("ITALIAN");
        java.util.Locale.Builder builder32 = builder30.setLanguage("FRA");
        java.util.Locale.Builder builder33 = builder30.clear();
        java.util.Locale locale34 = builder33.build();
        java.lang.String str35 = locale34.getDisplayCountry();
        java.lang.String str36 = locale18.getDisplayScript(locale34);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "French (Canada)" + "'", str3, "French (Canada)");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "de");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "allemand" + "'", str12, "allemand");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "de");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "German" + "'", str15, "German");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "it");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Italian" + "'", str17, "Italian");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "it");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "French (Canada)" + "'", str26, "French (Canada)");
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
    }

    @Test
    public void test33026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest66.test33026");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("italian", 'i');
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test33027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest66.test33027");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("tttttttfr-c                 ttttttt", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaFranz\366sisc", 5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test33028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest66.test33028");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!", "", (int) (short) 10);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, '4');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray4);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.split("\\U0020", "allemand");
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny("\\U0020", strArray11);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEach("", strArray4, strArray11);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String[] strArray16 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\u00de\\u00\\u00de\\u00\\u00d         INGLESE        \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, '9');
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test33029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest66.test33029");
        java.util.Locale locale2 = new java.util.Locale("eagaash", "                                                                              ");
        boolean boolean3 = locale2.hasExtensions();
        org.junit.Assert.assertEquals(locale2.toString(), "eagaash_                                                                              ");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test33030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest66.test33030");
        java.util.Locale locale2 = new java.util.Locale("nglischIIIIIIIIIIIIIIIIIIIIIIIIIIII", "                                                                                                       ");
        org.junit.Assert.assertEquals(locale2.toString(), "nglischiiiiiiiiiiiiiiiiiiiiiiiiiiii_                                                                                                       ");
    }

    @Test
    public void test33031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest66.test33031");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "\u82f1\u6587", (java.lang.CharSequence) "000000000000000000000000000000000000000000000000000000000000000CCCC\\CCCC");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "\u82f1\u6587" + "'", charSequence2, "\u82f1\u6587");
    }

    @Test
    public void test33032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest66.test33032");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) 'T', 'A');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'T' + "'", char2 == 'T');
    }

    @Test
    public void test33033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest66.test33033");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '#', 220);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 220 + "'", int2 == 220);
    }

    @Test
    public void test33034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest66.test33034");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("LATINAILATINAILATINAILATI)ANIC( ESENIC2", "  aNIHc  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LATINAILATINAILATINAILATI)ANIC( ESENIC2" + "'", str2, "LATINAILATINAILATINAILATI)ANIC( ESENIC2");
    }

    @Test
    public void test33035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest66.test33035");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkNI", "ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhz");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkNI" + "'", str2, "kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkNI");
    }

    @Test
    public void test33036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest66.test33036");
        java.lang.String str1 = org.apache.commons.lang3.CharUtils.unicodeEscaped((java.lang.Character) 'l');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u006c" + "'", str1, "\\u006c");
    }

    @Test
    public void test33037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest66.test33037");
        java.util.Locale locale4 = new java.util.Locale("HI!       ", "\\U0020", "Italienisch#########################################################################################");
        java.util.Locale locale5 = locale4.stripExtensions();
        java.util.Locale locale6 = locale5.stripExtensions();
        java.lang.String str7 = locale5.toLanguageTag();
        java.util.Locale locale9 = new java.util.Locale("en");
        boolean boolean10 = locale9.hasExtensions();
        java.util.Set<java.lang.String> strSet11 = locale9.getUnicodeLocaleKeys();
        java.lang.String str12 = locale5.getDisplayName(locale9);
        java.util.Locale locale16 = new java.util.Locale("HI!       ", "\\U0020", "Italienisch#########################################################################################");
        java.util.Locale locale17 = locale16.stripExtensions();
        java.lang.String str18 = locale9.getDisplayName(locale17);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.upperCase("ie                         iitalit", locale17);
        org.junit.Assert.assertEquals(locale4.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "und" + "'", str7, "und");
        org.junit.Assert.assertEquals(locale9.toString(), "en");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!        (\\U0020,Italienisch#########################################################################################)" + "'", str12, "hi!        (\\U0020,Italienisch#########################################################################################)");
        org.junit.Assert.assertEquals(locale16.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "English" + "'", str18, "English");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "IE                         IITALIT" + "'", str19, "IE                         IITALIT");
    }

    @Test
    public void test33038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest66.test33038");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("................................... (italian,english)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "................................... (italian,english)" + "'", str1, "................................... (italian,english)");
    }

    @Test
    public void test33039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest66.test33039");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("hi!", 69);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!                                                                  " + "'", str2, "hi!                                                                  ");
    }

    @Test
    public void test33040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest66.test33040");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "ccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc", (java.lang.CharSequence) "BFIBGIBHIBIIBJIBLIBMIBNIBOIBQIBRIBSIBTIBVIBWIBYIBZICAICCICDICFICGICHICIICKICLICMICNICOICRICUICVICWICXICYICZIDEIDJIDKIDMIDOIDZIECIEEIEGIEHIERIESIETIFIIFJIFKIFMIFOIFRIGAIGBIGDIGEIGFIGGIGHIGIIGLIGMIGNIGPIGQIGRIGSIGTIGUIGWIGYIHKI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test33041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest66.test33041");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("  \\u005    (...U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069!IH\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\ENGLISCH)", "Azhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0cinese0(cina)Uu!!i9h..France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)A", (int) 'c');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test33042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest66.test33042");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("eeeeeeeeeeeee", (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=eeeeeeeeeeeee");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test33043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest66.test33043");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                                                                              ECANADAgCANADACANADAsh                                                                              ECANADAgCANADACANADAsh                                                              ", "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                              ECANADAgCANADACANADAsh                                                                              ECANADAgCANADACANADAsh                                                              " + "'", str2, "                                                                              ECANADAgCANADACANADAsh                                                                              ECANADAgCANADACANADAsh                                                              ");
    }

    @Test
    public void test33044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest66.test33044");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("en_CA", 25);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "en_CAen_CAen_CAen_CAen_CAen_CAen_CAen_CAen_CAen_CAen_CAen_CAen_CAen_CAen_CAen_CAen_CAen_CAen_CAen_CAen_CAen_CAen_CAen_CAen_CA" + "'", str2, "en_CAen_CAen_CAen_CAen_CAen_CAen_CAen_CAen_CAen_CAen_CAen_CAen_CAen_CAen_CAen_CAen_CAen_CAen_CAen_CAen_CAen_CAen_CAen_CAen_CA");
    }

    @Test
    public void test33045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest66.test33045");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "fran\347ais (France)fr-CA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test33046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest66.test33046");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("\\u0034\\u00                                             hDi!        (\\U0020,ItalicniueD#########################################################################################stuD                                             \\u0034\\u00");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test33047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest66.test33047");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "italiae");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test33048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest66.test33048");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("Italia", (int) '.', "\\U0020IiTALIAN\\U0020I");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U002Italia" + "'", str3, "\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U002Italia");
    }

    @Test
    public void test33049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest66.test33049");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Locale locale1 = java.util.Locale.ITALIAN;
        java.lang.String str3 = locale1.getExtension('h');
        java.lang.String str4 = locale0.getDisplayScript(locale1);
        java.lang.String str5 = locale0.getISO3Country();
        java.util.Locale locale6 = locale0.stripExtensions();
        boolean boolean7 = locale6.hasExtensions();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "FRA" + "'", str5, "FRA");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_FR");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test33050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest66.test33050");
        char[] charArray8 = new char[] { 'f', '4' };
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "Chinese (China)", charArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\u0061ItalifnischItalifnischItalifnischItalifnischItalifnischItalifnischItalifnischItalifnischItalif", charArray8);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "ADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhATzhAUzhAWzhAXzhAZzhBAzhBBzhBDzhBEzhBFzhBGzhBHzhBIzhBJzhBLzhBMzhBNzhBOzhBQzhBRzhBSzhBTzhBVzhBWzhBYzhBZzhCAzhCCzhCDzhCFzhCGzhCHzhCIzhCKzhCLzhCMzhCNzhCOzhCRzhCUzhCVzhCWzhCXzhCYzhCZzhDEzhDJzhDKzhDMzhDOzhDZzhECzhEEzhEGzhEHzhERzhESzhETzhFIzhFJzhFKzhFMzhFOzhFRzhGAzhGBzhGDzhGEzhGFzhGGzhGHzhGIzhGLzhGMzhGNzhGPzhGQzhGRzhGSzhGTzhGUzhGWzhGYzhHKzhHMzhHNzhHRzhHTzhHUzhIDzhIEzhILzhIMzhINzhIOzhIQzhIRzhISzhITzhJEzhJMzhJOzhJPzhKEzhKGzhKHzhKIzhKMzhKNzhKPzhKRzhKWzhKYzhKZzhLAzhLBzhLCzhLIzhLKzhLRzhLSzhLTzhLUzhLVzhLYzhMAzhMCzhMDzhMEzhMFzhMGzhMHzhMKzhMLzhMMzhMNzhMOzhMPzhMQzhMRzhMSzhMTzhMUzhMVzhMWzhMXzhMYzhMZzhNAzhNCzhNEzhNFzhNGzhNIzhNLzhNOzhNPzhNRzhNUzhNZzhOMzhPAzhPEzhPFzhPGzhPHzhPKzhPLzhPMzhPNzhPRzhPSzhPTzhPWzhPYzhQAzhREzhROzhRSzhRUzhRWzhSAzhSBzhSCzhSDzhSEzhSGzhSHzhSIzhSJzhSKzhSLzhSMzhSNzhSOzhSRzhSSzhSTzhSVzhSXzhSYzhSZzhTCzhTDzhTFzhTGzhTHzhTJzhTKzhTLzhTMzhTNzhTOzhTRzhTTzhTVzhTWzhTZzhUAzhUGzhUMzhUSzhUYzhUZzhVAzhVCzhVEzhVGzhVIzhVNzhVUzhWFzhWSzhYEzhYTzhZAzhZMzhZW", charArray8);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny("!_\\u0020_iTLE#####################################!_\\u0020_iTLE######################################", charArray8);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "             hcsineilatI             ", charArray8);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "00000000...", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "f4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "f4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[f, 4]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test33051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest66.test33051");
        java.util.Locale locale1 = new java.util.Locale("44444444444444444444444444444444!IH");
        java.util.Locale locale2 = java.util.Locale.FRANCE;
        java.util.Locale locale3 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str4 = locale2.getDisplayScript(locale3);
        java.lang.String str5 = locale3.getVariant();
        java.util.Locale locale7 = new java.util.Locale("");
        java.util.Locale.setDefault(locale7);
        java.lang.String str9 = locale3.getDisplayName(locale7);
        java.lang.String str10 = locale1.getDisplayCountry(locale3);
        java.util.Locale locale12 = java.util.Locale.KOREA;
        java.lang.String str13 = locale12.getLanguage();
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.upperCase("TALIAN\\u0023", locale12);
        java.util.Locale locale16 = java.util.Locale.FRANCE;
        java.util.Locale locale17 = java.util.Locale.ITALIAN;
        java.lang.String str19 = locale17.getExtension('h');
        java.lang.String str20 = locale16.getDisplayScript(locale17);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.lowerCase("HI!       ", locale16);
        java.lang.String str22 = locale12.getDisplayVariant(locale16);
        java.lang.String str23 = locale1.getDisplayLanguage(locale12);
        java.lang.String str24 = locale1.getLanguage();
        java.lang.String str25 = locale1.getDisplayScript();
        org.junit.Assert.assertEquals(locale1.toString(), "44444444444444444444444444444444!ih");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "French (Canada)" + "'", str9, "French (Canada)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ko" + "'", str13, "ko");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "TALIAN\\U0023" + "'", str14, "TALIAN\\U0023");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "it");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!       " + "'", str21, "hi!       ");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "44444444444444444444444444444444!ih" + "'", str23, "44444444444444444444444444444444!ih");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "44444444444444444444444444444444!ih" + "'", str24, "44444444444444444444444444444444!ih");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test33052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest66.test33052");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder4 = builder2.setScript("");
        java.util.Locale.Builder builder5 = builder4.clear();
        java.util.Locale.Builder builder6 = builder4.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder4.setUnicodeLocaleKeyword("Engl", "H (HHHHHHHHH,CV CW CX CY CZ DE DJ DK DM DO DZ EC EE EG EH ER ES ET FI FJ FK)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: Engl [at index 0]");
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
    public void test33053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest66.test33053");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("ITALIAN", "FRANZ\326SISCH", (int) (byte) -1);
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, 't', (int) '\u671d', 200);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test33054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest66.test33054");
        java.util.Locale locale2 = java.util.Locale.forLanguageTag("Deutsch");
        java.lang.String str3 = locale2.getDisplayCountry();
        java.util.Locale locale5 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale6 = java.util.Locale.FRANCE;
        java.util.Locale locale7 = java.util.Locale.ITALIAN;
        java.lang.String str9 = locale7.getExtension('h');
        java.lang.String str10 = locale6.getDisplayScript(locale7);
        java.lang.String str11 = locale6.getISO3Country();
        java.util.Locale locale12 = java.util.Locale.GERMAN;
        java.util.Locale.setDefault(locale12);
        java.lang.String str14 = locale6.getDisplayName(locale12);
        java.lang.String str15 = locale5.getDisplayLanguage(locale12);
        java.lang.String str16 = locale2.getDisplayVariant(locale12);
        java.lang.String str17 = locale2.getDisplayVariant();
        java.util.Locale locale18 = java.util.Locale.ENGLISH;
        java.util.Locale.setDefault(locale18);
        java.lang.String str20 = locale2.getDisplayCountry(locale18);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.upperCase("ECANADAgCANADACANADAsh", locale18);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = locale18.getExtension('\\');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: \\");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "deutsch");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "it");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "FRA" + "'", str11, "FRA");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "de");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Franz\366sisch (Frankreich)" + "'", str14, "Franz\366sisch (Frankreich)");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "en");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "ECANADAGCANADACANADASH" + "'", str21, "ECANADAGCANADACANADASH");
    }

    @Test
    public void test33055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest66.test33055");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("\\u0068       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih   ", 28, 200);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\u0068       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih   " + "'", str3, "\\u0068       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih   ");
    }

    @Test
    public void test33056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest66.test33056");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("ko-KR", "                               English(UnitedKingdom)                               ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ko-KR" + "'", str2, "ko-KR");
    }

    @Test
    public void test33057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest66.test33057");
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
        java.lang.Object obj11 = locale0.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
        org.junit.Assert.assertTrue("'" + category1 + "' != '" + java.util.Locale.Category.FORMAT + "'", category1.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "de");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "allemand" + "'", str5, "allemand");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "GB" + "'", str10, "GB");
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "en_GB");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "en_GB");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "en_GB");
    }

    @Test
    public void test33058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest66.test33058");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("italien", (int) 'n', '\u671d');
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d" + "'", str3, "\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d");
    }

    @Test
    public void test33059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest66.test33059");
        java.util.Locale locale0 = java.util.Locale.UK;
        java.util.Locale.Category category1 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale2 = java.util.Locale.getDefault(category1);
        java.util.Locale locale3 = java.util.Locale.GERMAN;
        java.util.Locale locale4 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str5 = locale3.getDisplayName(locale4);
        java.util.Locale.setDefault(category1, locale4);
        java.util.Set<java.lang.String> strSet7 = locale4.getUnicodeLocaleKeys();
        java.lang.String str8 = locale0.getDisplayVariant(locale4);
        java.lang.String str9 = locale0.toLanguageTag();
        java.util.Set<java.lang.String> strSet10 = locale0.getUnicodeLocaleKeys();
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet10, '\351');
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
        org.junit.Assert.assertTrue("'" + category1 + "' != '" + java.util.Locale.Category.FORMAT + "'", category1.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "de");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "allemand" + "'", str5, "allemand");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "en-GB" + "'", str9, "en-GB");
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test33060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest66.test33060");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("                                               TALY                                                ", "2222222222222222222italian_ITALIAN_EnglisFitalian (italian,englis");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                               TALY                                                " + "'", str2, "                                               TALY                                                ");
    }

    @Test
    public void test33061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest66.test33061");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("                             kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkEDkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkEDkk", "", 45);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhfr-ca", strArray4);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test33062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest66.test33062");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("h (CCCCCCCCC,CV CW CX CY CZ DE DJ DK DM DO DZ EC EE EG EC ER ES EC FC FJ FK)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H (CCCCCCCCC,CV CW CX CY CZ DE DJ DK DM DO DZ EC EE EG EC ER ES EC FC FJ FK)" + "'", str1, "H (CCCCCCCCC,CV CW CX CY CZ DE DJ DK DM DO DZ EC EE EG EC ER ES EC FC FJ FK)");
    }

    @Test
    public void test33063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest66.test33063");
        java.lang.String[] strArray0 = null;
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.stripAll(strArray0, "HCSTUED");
        org.junit.Assert.assertNull(strArray2);
    }

    @Test
    public void test33064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest66.test33064");
        java.lang.String str1 = org.apache.commons.lang3.CharUtils.unicodeEscaped((java.lang.Character) '\351');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u00e9" + "'", str1, "\\u00e9");
    }

    @Test
    public void test33065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest66.test33065");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("                                ESELGNI                               ", "AzhzhzhzhzhzhzhzhzhzhE             g                         ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 33 + "'", int2 == 33);
    }

    @Test
    public void test33066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest66.test33066");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("HHHHHHHHHILATILGNe_nailati_NAI         HSILATI!_NAI_TiATtiHILATIhsiAgE_NA");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test33067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest66.test33067");
        java.util.Locale locale3 = new java.util.Locale("I\\U0020ITALIANITALIANITALIANITALIIT", "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\!_\\u0020_itle\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\", "E                               ");
        org.junit.Assert.assertEquals(locale3.toString(), "i\\u0020italianitalianitalianitaliit_\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\!_\\U0020_ITLE\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\_E                               ");
    }

    @Test
    public void test33068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest66.test33068");
        char[] charArray10 = new char[] { ' ', '4' };
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!", charArray10);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "u", charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "en-US", charArray10);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny("US", charArray10);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "cinese (cina)\\u0069h...", charArray10);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "Franz\366sischFranzosisch (Frankreich)uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", charArray10);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\ud504\ub791\uc2a4hi!(\\u0020,italienisch#########################################################################################)", charArray10);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCcinese (cina)u0069h..CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test33069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest66.test33069");
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
        java.lang.String str13 = locale12.getDisplayCountry();
        java.lang.String str14 = locale12.getLanguage();
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "zh" + "'", str14, "zh");
    }

    @Test
    public void test33070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest66.test33070");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.GERMAN;
        java.util.Locale locale3 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str4 = locale2.getDisplayName(locale3);
        java.util.Locale.setDefault(category0, locale3);
        java.util.Locale locale6 = java.util.Locale.getDefault(category0);
        java.util.Locale locale7 = java.util.Locale.getDefault(category0);
        java.util.Locale locale9 = java.util.Locale.forLanguageTag("hi!");
        java.lang.String str10 = locale9.getCountry();
        java.lang.String str11 = locale7.getDisplayScript(locale9);
        java.util.Set<java.lang.String> strSet12 = locale7.getUnicodeLocaleKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = locale7.getUnicodeLocaleType("italie                          (\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rZ...\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: italie                          (????????????????????????????????????????????????Z...?????????????????????????????????????????????????)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "allemand" + "'", str4, "allemand");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(strSet12);
    }

    @Test
    public void test33071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest66.test33071");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaauuuuuuuuuuuuuuuuu\\u0066", "Frz\366cz(frkrec)Frz\366cz(frkrec)Frz\366cz(frkrec)Frz\366cz(frkrec)Frz\366cz(frkreitaly", 374);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test33072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest66.test33072");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("ylatierkrf(zc\366zrF)cerkrf(zc\366zrF)cerkrf(zc\366zrF)cerkrf(zc\366zrF)cerkrf(zc\366zrFhcierknarF", "TIT", (int) 'h');
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test33073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest66.test33073");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("", 107);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test33074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest66.test33074");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                          inglesehhhhhhhhh                                          ", "\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test33075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest66.test33075");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          IAN\\U0020I", (java.lang.CharSequence) "\\u0061ItalienischItalienischItalienischItalienischItalienischItalienischItalienischItalienischItalie");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          IAN\\U0020I" + "'", charSequence2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          IAN\\U0020I");
    }

    @Test
    public void test33076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest66.test33076");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.Locale.FilteringMode filteringMode8 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList9 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList6, filteringMode8);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap10 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList11 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap10);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList13 = java.util.Locale.LanguageRange.parse("ALLEMAND");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap14 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList15 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList13, strMap14);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList17 = java.util.Locale.LanguageRange.parse("en");
        java.util.Locale.LanguageRange[] languageRangeArray18 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList19 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList19, languageRangeArray18);
        java.lang.String[] strArray23 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList24 = new java.util.ArrayList<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList24, strArray23);
        java.util.Locale.FilteringMode filteringMode26 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList27 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList19, (java.util.Collection<java.lang.String>) strList24, filteringMode26);
        java.util.Locale.LanguageRange[] languageRangeArray28 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList29 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList29, languageRangeArray28);
        java.lang.String[] strArray33 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList34 = new java.util.ArrayList<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList34, strArray33);
        java.util.Locale.FilteringMode filteringMode36 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList37 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList29, (java.util.Collection<java.lang.String>) strList34, filteringMode36);
        java.lang.String[] strArray39 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList40 = new java.util.ArrayList<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList40, strArray39);
        java.util.List<java.lang.String> strList42 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList29, (java.util.Collection<java.lang.String>) strList40);
        java.lang.String str43 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList19, (java.util.Collection<java.lang.String>) strList40);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap45 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList46 = java.util.Locale.LanguageRange.parse("ENGLISCH", strMap45);
        java.util.Locale locale47 = java.util.Locale.ITALIAN;
        java.util.Set<java.lang.Character> charSet48 = locale47.getExtensionKeys();
        java.lang.String str49 = locale47.getVariant();
        java.lang.String str50 = locale47.getDisplayName();
        java.lang.String str51 = locale47.getCountry();
        java.util.Set<java.lang.String> strSet52 = locale47.getUnicodeLocaleKeys();
        java.lang.String str53 = java.util.Locale.lookupTag(languageRangeList46, (java.util.Collection<java.lang.String>) strSet52);
        java.util.Locale.LanguageRange[] languageRangeArray54 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList55 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList55, languageRangeArray54);
        java.util.Locale.LanguageRange[] languageRangeArray57 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList58 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList58, languageRangeArray57);
        java.lang.String[] strArray62 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList63 = new java.util.ArrayList<java.lang.String>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList63, strArray62);
        java.util.Locale.FilteringMode filteringMode65 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList66 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList58, (java.util.Collection<java.lang.String>) strList63, filteringMode65);
        java.util.Locale.FilteringMode filteringMode67 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList68 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList55, (java.util.Collection<java.lang.String>) strList63, filteringMode67);
        java.util.Collection<java.util.Locale> localeCollection69 = null;
        java.util.List<java.util.Locale> localeList70 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList55, localeCollection69);
        java.util.Locale locale71 = java.util.Locale.lookup(languageRangeList46, (java.util.Collection<java.util.Locale>) localeList70);
        java.util.List<java.util.Locale> localeList72 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList19, (java.util.Collection<java.util.Locale>) localeList70);
        java.util.List<java.util.Locale> localeList73 = java.util.Locale.filter(languageRangeList17, (java.util.Collection<java.util.Locale>) localeList70);
        java.util.Locale locale74 = java.util.Locale.lookup(languageRangeList15, (java.util.Collection<java.util.Locale>) localeList73);
        java.util.Locale locale75 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList73);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + filteringMode8 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode8.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(languageRangeList11);
        org.junit.Assert.assertNotNull(languageRangeList13);
        org.junit.Assert.assertNotNull(languageRangeList15);
        org.junit.Assert.assertNotNull(languageRangeList17);
        org.junit.Assert.assertNotNull(languageRangeArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + filteringMode26 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode26.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList27);
        org.junit.Assert.assertNotNull(languageRangeArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + filteringMode36 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode36.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList37);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(strList42);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNotNull(languageRangeList46);
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "it");
        org.junit.Assert.assertNotNull(charSet48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "\u610f\u5927\u5229\u6587" + "'", str50, "\u610f\u5927\u5229\u6587");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNotNull(strSet52);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertNotNull(languageRangeArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(languageRangeArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + filteringMode65 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode65.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList66);
        org.junit.Assert.assertTrue("'" + filteringMode67 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode67.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList68);
        org.junit.Assert.assertNotNull(localeList70);
        org.junit.Assert.assertNull(locale71);
        org.junit.Assert.assertNotNull(localeList72);
        org.junit.Assert.assertNotNull(localeList73);
        org.junit.Assert.assertNull(locale74);
        org.junit.Assert.assertNull(locale75);
    }

    @Test
    public void test33077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest66.test33077");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("                                                                              INGLESE                                ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "INGLESE" + "'", str1, "INGLESE");
    }

    @Test
    public void test33078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest66.test33078");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "FRENCH", "TALY");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test33079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest66.test33079");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "Italy", "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIECANADAgCANADACANADAshIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test33080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest66.test33080");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("    \\XTALXAN_ITALIAN_ENGLXSH    R0                                               nailati             ");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test33081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest66.test33081");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale locale5 = java.util.Locale.GERMANY;
        java.util.Locale.Builder builder6 = builder1.setLocale(locale5);
        java.util.Set<java.lang.String> strSet7 = locale5.getUnicodeLocaleAttributes();
        java.lang.String str8 = locale5.getVariant();
        java.lang.String str9 = locale5.getCountry();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u6cd5\u6587\u52a0\u62ff\u5927)" + "'", str3, "\u6cd5\u6587\u52a0\u62ff\u5927)");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "de_DE");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "DE" + "'", str9, "DE");
    }

    @Test
    public void test33082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest66.test33082");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                        it                         ", "", 84);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test33083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest66.test33083");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale.Builder builder4 = builder2.clearExtensions();
        java.util.Locale.Builder builder5 = builder2.clear();
        java.util.Locale.Builder builder6 = builder2.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder2.removeUnicodeLocaleAttribute("zhzhzhzhzhzhzhzhzhzhfraazhaezhafzhagzhaizhalzhamzhanzhaozhaqzharzhaszhazhzhzhzhzhzhzhzhzhz2222222222222222222222222222222222222222222222222222222222222222222222222");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: zhzhzhzhzhzhzhzhzhzhfraazhaezhafzhagzhaizhalzhamzhanzhaozhaqzharzhaszhazhzhzhzhzhzhzhzhzhz2222222222222222222222222222222222222222222222222222222222222222222222222 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test33084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest66.test33084");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("hsilgne,nailati( nailati", "...!       \\u003.\\u003.\\u003.\\u003.\\u003.\\u003.\\u003.\\u003.\\u003.\\");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hsilgne,nailati( nailati" + "'", str2, "hsilgne,nailati( nailati");
    }

    @Test
    public void test33085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest66.test33085");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("\u610f\u5927\u5229\u6587");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u610f\u5927\u5229\u6587" + "'", str1, "\u610f\u5927\u5229\u6587");
    }

    @Test
    public void test33086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest66.test33086");
        java.util.Locale locale1 = java.util.Locale.ITALIAN;
        java.lang.String str2 = locale1.getDisplayLanguage();
        java.util.Locale locale3 = locale1.stripExtensions();
        java.util.Locale locale5 = java.util.Locale.forLanguageTag("\\u0020");
        java.lang.String str6 = locale5.getDisplayScript();
        java.lang.String str7 = locale3.getDisplayCountry(locale5);
        java.util.Locale.Builder builder8 = new java.util.Locale.Builder();
        java.util.Locale locale9 = builder8.build();
        java.util.Locale locale11 = java.util.Locale.forLanguageTag("Italian");
        java.lang.String str12 = locale9.getDisplayLanguage(locale11);
        java.lang.String str13 = locale3.getDisplayLanguage(locale9);
        java.lang.String str15 = locale9.getExtension('u');
        java.lang.String str16 = locale9.getDisplayScript();
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.upperCase("ad4ae4af4ag4ai4al4am4an4ao4aq4ar4as4at4au4aw4ax4az4ba4bb4bd4be4bf4bg4bh4bi4bj4bl4bm4bn4bo4bq4br4bs4bt4bv4bw...R-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAA", locale9);
        boolean boolean18 = locale9.hasExtensions();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u610f\u5927\u5229\u6587" + "'", str2, "\u610f\u5927\u5229\u6587");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "it");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "italian");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Italian" + "'", str13, "Italian");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "AD4AE4AF4AG4AI4AL4AM4AN4AO4AQ4AR4AS4AT4AU4AW4AX4AZ4BA4BB4BD4BE4BF4BG4BH4BI4BJ4BL4BM4BN4BO4BQ4BR4BS4BT4BV4BW...R-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAA" + "'", str17, "AD4AE4AF4AG4AI4AL4AM4AN4AO4AQ4AR4AS4AT4AU4AW4AX4AZ4BA4BB4BD4BE4BF4BG4BH4BI4BJ4BL4BM4BN4BO4BQ4BR4BS4BT4BV4BW...R-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test33087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest66.test33087");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("KKKKKKKKKKKKKKKKKEAGAASH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "KKKKKKKKKKKKKKKKKEAGAASH" + "'", str1, "KKKKKKKKKKKKKKKKKEAGAASH");
    }

    @Test
    public void test33088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest66.test33088");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("fr-CA", 'A');
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, 'i', 314, 5);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test33089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest66.test33089");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "alzzzItalian (Italy)enzzzItalian (Italy)czzzItalian (Italy)#########################################################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test33090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest66.test33090");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("FRANZ\366SISCH", "                                                                                       nglish ...nglish ...nglish ...nglichinoisf(Chine)                                                                                       ", 28);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test33091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest66.test33091");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("iTALIAN                                                                ALLEMAND");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test33092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest66.test33092");
        char[] charArray12 = new char[] { ' ', '4' };
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!", charArray12);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "Chinese (China)", charArray12);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u0065", charArray12);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                                                                                    ", charArray12);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "!ih", charArray12);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "italiano", charArray12);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "HI!(\\U0020,ITALIENISCH#########################################################################################)", charArray12);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "englisch", charArray12);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u00de\\u00", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test33093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest66.test33093");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "\r\rgl\r\rh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test33094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest66.test33094");
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
        java.util.List<java.lang.String> strList56 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList40, filteringMode54);
        java.lang.String str58 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strList40, "Italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian");
        java.lang.String str60 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strList40, "frtatiIi2tatathIEnglish                                 (                United                                 Kingdom                )!English                                 (                United                                 Kingdom                )       ");
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
        org.junit.Assert.assertNotNull(strList56);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
    }

    @Test
    public void test33095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest66.test33095");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("ttfr-c                 ttttttt", 42);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test33096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest66.test33096");
        java.util.Locale locale2 = new java.util.Locale("8600u\\                                                                                                                  ", "a44444444444444SaaS44444444444444at");
        org.junit.Assert.assertEquals(locale2.toString(), "8600u\\                                                                                                                  _A44444444444444SAAS44444444444444AT");
    }

    @Test
    public void test33097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest66.test33097");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("neilRtI    E", "Hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "neilRtI    E" + "'", str2, "neilRtI    E");
    }

    @Test
    public void test33098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest66.test33098");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("\\", 367);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\" + "'", str2, "\\");
    }

    @Test
    public void test33099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest66.test33099");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("   Franz\366sisch (Kanada)", "HI!HI     \\u005c");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "   Franz\366sisch (Kanada)" + "'", str2, "   Franz\366sisch (Kanada)");
    }

    @Test
    public void test33100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest66.test33100");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("HHHHHHHHHHtTAHHHHHHHHHHT_ITAhIAN\\U0020Ih", "                                                                                                                                                                                                                                                                                   \\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\hi!       \\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test33101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest66.test33101");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder5 = builder4.clear();
        java.util.Locale.Builder builder7 = builder5.setLanguage("ITALIAN");
        java.util.Locale.Builder builder9 = builder7.setLanguage("italien");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder9.setScript("                                                                                                              ...");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script:                                                                                                               ... [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u6cd5\u6587\u52a0\u62ff\u5927)" + "'", str3, "\u6cd5\u6587\u52a0\u62ff\u5927)");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test33102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest66.test33102");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("rEGNO uNITO", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test33103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest66.test33103");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\aUa0046", 44);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test33104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest66.test33104");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("RegnoUnito", 83);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                    RegnoUnito                                     " + "'", str2, "                                    RegnoUnito                                     ");
    }

    @Test
    public void test33105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest66.test33105");
        java.util.Locale locale2 = java.util.Locale.forLanguageTag("France");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.lowerCase("Frankreich", locale2);
        java.lang.String str4 = locale2.getDisplayVariant();
        java.util.Locale locale5 = java.util.Locale.ITALIAN;
        java.util.Set<java.lang.Character> charSet6 = locale5.getExtensionKeys();
        java.lang.String str7 = locale5.getVariant();
        java.lang.String str8 = locale2.getDisplayVariant(locale5);
        java.util.Locale locale11 = new java.util.Locale("                                     fran\347ais (France)                                      ", "Chinese (China");
        java.lang.String str12 = locale2.getDisplayLanguage(locale11);
        java.util.Locale locale13 = java.util.Locale.ITALIAN;
        java.util.Set<java.lang.Character> charSet14 = locale13.getExtensionKeys();
        java.lang.String str15 = locale13.getVariant();
        java.lang.String str16 = locale13.getDisplayName();
        java.lang.String str17 = locale13.getCountry();
        java.util.Set<java.lang.String> strSet18 = locale13.getUnicodeLocaleKeys();
        java.lang.String str19 = locale13.getScript();
        java.lang.String str20 = locale11.getDisplayVariant(locale13);
        java.util.Set<java.lang.String> strSet21 = locale13.getUnicodeLocaleAttributes();
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "france");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "frankreich" + "'", str3, "frankreich");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "it");
        org.junit.Assert.assertNotNull(charSet6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals(locale11.toString(), "                                     fran\347ais (france)                                      _CHINESE (CHINA");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "france" + "'", str12, "france");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "it");
        org.junit.Assert.assertNotNull(charSet14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\u610f\u5927\u5229\u6587" + "'", str16, "\u610f\u5927\u5229\u6587");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(strSet21);
    }

    @Test
    public void test33106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest66.test33106");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("Chinesisch", 11);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test33107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest66.test33107");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("talan");
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + 't' + "'", char1 == 't');
    }

    @Test
    public void test33108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest66.test33108");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("\\0020iTALIANiTALIANiTALIANiTALzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzLATiNAILATiNAILATiNAILATi0200\\" + "'", str1, "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzLATiNAILATiNAILATiNAILATi0200\\");
    }

    @Test
    public void test33109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest66.test33109");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray7 = new char[] { ' ' };
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsAny("                                                                                                    ", charArray7);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsAny("FRENCH (CANADA)", charArray7);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny("", charArray7);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence1, charArray7);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "FRZ\326CZ(FRKREC)", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[ ]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test33110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest66.test33110");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("aaabaeafakamanarasavayazbabebgbhbibmbn...", 71, '7');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "777777777777777777777777777777aaabaeafakamanarasavayazbabebgbhbibmbn..." + "'", str3, "777777777777777777777777777777aaabaeafakamanarasavayazbabebgbhbibmbn...");
    }

    @Test
    public void test33111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest66.test33111");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("HHHHHHHHH         ITAL\\u0020iItalian\\...", "HHHHHHHHH", (int) '5');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test33112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest66.test33112");
        java.util.Locale locale1 = java.util.Locale.ITALIAN;
        java.lang.String str2 = locale1.getDisplayLanguage();
        java.util.Locale locale3 = locale1.stripExtensions();
        java.util.Locale locale5 = java.util.Locale.forLanguageTag("\\u0020");
        java.lang.String str6 = locale5.getDisplayScript();
        java.lang.String str7 = locale3.getDisplayCountry(locale5);
        java.util.Locale.Builder builder8 = new java.util.Locale.Builder();
        java.util.Locale locale9 = builder8.build();
        java.util.Locale locale11 = java.util.Locale.forLanguageTag("Italian");
        java.lang.String str12 = locale9.getDisplayLanguage(locale11);
        java.lang.String str13 = locale3.getDisplayLanguage(locale9);
        java.lang.String str15 = locale9.getExtension('u');
        java.util.Set<java.lang.String> strSet16 = locale9.getUnicodeLocaleAttributes();
        java.util.Locale locale17 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str18 = locale17.getDisplayName();
        java.lang.String str19 = locale9.getDisplayLanguage(locale17);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.upperCase("44\\u002344", locale9);
        java.lang.String str21 = locale9.getCountry();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u610f\u5927\u5229\u6587" + "'", str2, "\u610f\u5927\u5229\u6587");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "it");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "italian");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Italian" + "'", str13, "Italian");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "fr_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\u6cd5\u6587\u52a0\u62ff\u5927)" + "'", str18, "\u6cd5\u6587\u52a0\u62ff\u5927)");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "44\\U002344" + "'", str20, "44\\U002344");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test33113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest66.test33113");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("Royaume-Uniiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii", "         ITALIAN_italian_eNGLISH         ITALIAN_!IHitTAiT_ITALIAN_EgAish");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test33114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest66.test33114");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("NGENGENGENGENGENGENGENGENGENGENGENGENGENG_                                                                    \\u0020iTALIANiTALIANiTALIANiTAL");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "NGENGENGENGENGENGENGENGENGENGENGENGENGENG_\\u0020iTALIANiTALIANiTALIANiTAL" + "'", str1, "NGENGENGENGENGENGENGENGENGENGENGENGENGENG_\\u0020iTALIANiTALIANiTALIANiTAL");
    }

    @Test
    public void test33115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest66.test33115");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = java.util.Locale.UK;
        java.util.Locale.Builder builder3 = builder0.setLocale(locale2);
        java.lang.String str4 = locale2.getLanguage();
        java.lang.String str5 = locale2.getDisplayCountry();
        java.util.Set<java.lang.Character> charSet6 = locale2.getExtensionKeys();
        java.lang.String str7 = locale2.getDisplayLanguage();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en_GB");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "en" + "'", str4, "en");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u82f1\u56fd" + "'", str5, "\u82f1\u56fd");
        org.junit.Assert.assertNotNull(charSet6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u82f1\u6587" + "'", str7, "\u82f1\u6587");
    }

    @Test
    public void test33116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest66.test33116");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '9', 18);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
    }

    @Test
    public void test33117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest66.test33117");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("iTALIAN (ITALIAN,NGLIH", (int) '-');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "iTALIAN (ITALIAN,NGLIHiTALIAN (ITALIAN,NGLIHiTALIAN (ITALIAN,NGLIHiTALIAN (ITALIAN,NGLIHiTALIAN (ITALIAN,NGLIHiTALIAN (ITALIAN,NGLIHiTALIAN (ITALIAN,NGLIHiTALIAN (ITALIAN,NGLIHiTALIAN (ITALIAN,NGLIHiTALIAN (ITALIAN,NGLIHiTALIAN (ITALIAN,NGLIHiTALIAN (ITALIAN,NGLIHiTALIAN (ITALIAN,NGLIHiTALIAN (ITALIAN,NGLIHiTALIAN (ITALIAN,NGLIHiTALIAN (ITALIAN,NGLIHiTALIAN (ITALIAN,NGLIHiTALIAN (ITALIAN,NGLIHiTALIAN (ITALIAN,NGLIHiTALIAN (ITALIAN,NGLIHiTALIAN (ITALIAN,NGLIHiTALIAN (ITALIAN,NGLIHiTALIAN (ITALIAN,NGLIHiTALIAN (ITALIAN,NGLIHiTALIAN (ITALIAN,NGLIHiTALIAN (ITALIAN,NGLIHiTALIAN (ITALIAN,NGLIHiTALIAN (ITALIAN,NGLIHiTALIAN (ITALIAN,NGLIHiTALIAN (ITALIAN,NGLIHiTALIAN (ITALIAN,NGLIHiTALIAN (ITALIAN,NGLIHiTALIAN (ITALIAN,NGLIHiTALIAN (ITALIAN,NGLIHiTALIAN (ITALIAN,NGLIHiTALIAN (ITALIAN,NGLIHiTALIAN (ITALIAN,NGLIHiTALIAN (ITALIAN,NGLIHiTALIAN (ITALIAN,NGLIHiTALIAN (ITALIAN,NGLIHiTALIAN (ITALIAN,NGLIHiTALIAN (ITALIAN,NGLIHiTALIAN (ITALIAN,NGLIHiTALIAN (ITALIAN,NGLIHiTALIAN (ITALIAN,NGLIH" + "'", str2, "iTALIAN (ITALIAN,NGLIHiTALIAN (ITALIAN,NGLIHiTALIAN (ITALIAN,NGLIHiTALIAN (ITALIAN,NGLIHiTALIAN (ITALIAN,NGLIHiTALIAN (ITALIAN,NGLIHiTALIAN (ITALIAN,NGLIHiTALIAN (ITALIAN,NGLIHiTALIAN (ITALIAN,NGLIHiTALIAN (ITALIAN,NGLIHiTALIAN (ITALIAN,NGLIHiTALIAN (ITALIAN,NGLIHiTALIAN (ITALIAN,NGLIHiTALIAN (ITALIAN,NGLIHiTALIAN (ITALIAN,NGLIHiTALIAN (ITALIAN,NGLIHiTALIAN (ITALIAN,NGLIHiTALIAN (ITALIAN,NGLIHiTALIAN (ITALIAN,NGLIHiTALIAN (ITALIAN,NGLIHiTALIAN (ITALIAN,NGLIHiTALIAN (ITALIAN,NGLIHiTALIAN (ITALIAN,NGLIHiTALIAN (ITALIAN,NGLIHiTALIAN (ITALIAN,NGLIHiTALIAN (ITALIAN,NGLIHiTALIAN (ITALIAN,NGLIHiTALIAN (ITALIAN,NGLIHiTALIAN (ITALIAN,NGLIHiTALIAN (ITALIAN,NGLIHiTALIAN (ITALIAN,NGLIHiTALIAN (ITALIAN,NGLIHiTALIAN (ITALIAN,NGLIHiTALIAN (ITALIAN,NGLIHiTALIAN (ITALIAN,NGLIHiTALIAN (ITALIAN,NGLIHiTALIAN (ITALIAN,NGLIHiTALIAN (ITALIAN,NGLIHiTALIAN (ITALIAN,NGLIHiTALIAN (ITALIAN,NGLIHiTALIAN (ITALIAN,NGLIHiTALIAN (ITALIAN,NGLIHiTALIAN (ITALIAN,NGLIHiTALIAN (ITALIAN,NGLIHiTALIAN (ITALIAN,NGLIH");
    }

    @Test
    public void test33118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest66.test33118");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                              \\     ", "");
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Deutsch", 'i');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEach("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444en", strArray5, strArray8);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray8);
        int int11 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("ixii", strArray8);
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.stripAll(strArray8, "Chinese");
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.stripAll(strArray13);
        java.lang.String[] strArray17 = org.apache.commons.lang3.StringUtils.split("CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCcinese (cina)\\u0069h..CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC", "CCCCCCIAN\\U0020ICCCCCCC");
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("", strArray14, strArray17);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444en" + "'", str9, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444en");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Deutsch" + "'", str10, "Deutsch");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test33119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest66.test33119");
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
        java.util.Locale.Builder builder39 = builder38.clearExtensions();
        java.util.Locale locale40 = builder39.build();
        java.util.Locale.Builder builder41 = builder39.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder43 = builder39.setScript("E");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: E [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u6cd5\u6587\u52a0\u62ff\u5927)" + "'", str3, "\u6cd5\u6587\u52a0\u62ff\u5927)");
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
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "it");
        org.junit.Assert.assertNotNull(builder41);
    }

    @Test
    public void test33120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest66.test33120");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder3.clear();
        java.util.Locale.Builder builder6 = builder3.setScript("");
        java.util.Locale.Builder builder7 = builder6.clear();
        java.util.Locale locale8 = builder7.build();
        java.util.Locale locale13 = new java.util.Locale("hi!", "English", "");
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.upperCase("hhhhhhhhhh", locale13);
        java.lang.String str15 = locale13.toLanguageTag();
        java.lang.String str16 = locale8.getDisplayVariant(locale13);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertEquals(locale13.toString(), "hi!_ENGLISH");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HHHHHHHHHH" + "'", str14, "HHHHHHHHHH");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "und" + "'", str15, "und");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test33121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest66.test33121");
        java.util.Locale locale1 = new java.util.Locale("                                                         \\u005c                                                        ");
        java.util.Locale.setDefault(locale1);
        java.lang.String str3 = locale1.getDisplayLanguage();
        org.junit.Assert.assertEquals(locale1.toString(), "                                                         \\u005c                                                        ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                         \\u005c                                                        " + "'", str3, "                                                         \\u005c                                                        ");
    }

    @Test
    public void test33122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest66.test33122");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("FR-", (int) 'b');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test33123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest66.test33123");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("Franzosisch (!ih!ih!ih!ih!ih!ih!ih!ih!ih!ihtedesco    !ih!ih!ih!ih!ih!ih!ih!ih!ih!ihFranzosisch (", (int) (short) 100, "\ud55c\uad6d\uc5b4\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str3, "\ud55c\uad6d\uc5b4");
    }

    @Test
    public void test33124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest66.test33124");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("francese (canada)", "hi!       allemandItalienischallemanditalian_ITALIAN_Eng    \\     ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...allemand\\u0034allemandHI!allemandItalianallemand\\u0061allemand\\u0023allemandhi!allemandiTALIANallemandChinese (China)allemandhi!allemandzh_CNallemandiTALIANallemandenallemandItalienisch");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "francese (canada)" + "'", str2, "francese (canada)");
    }

    @Test
    public void test33125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest66.test33125");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       ");
        java.lang.String str2 = locale1.getDisplayVariant();
        java.util.Set<java.lang.Character> charSet3 = locale1.getExtensionKeys();
        java.lang.String str4 = locale1.getDisplayLanguage();
        java.lang.String str5 = locale1.getDisplayScript();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(charSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test33126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest66.test33126");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("hi!allemandItalienischallemanditalian_ITALIAN_EnglishallemandHI!allemandhi!allemandADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...allemand\\u0034allemandHI!allemandItalianallemand\\u0061allemand\\u0023allemandhi!allemandiTALIANallemandChinese(China)allemandhi!allemandzh_CNallemandiTALIANallemandenallemandItalienisch", 73);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!allemandItalienischallemanditalian_ITALIAN_EnglishallemandHI!allemandhi!allemandADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...allemand\\u0034allemandHI!allemandItalianallemand\\u0061allemand\\u0023allemandhi!allemandiTALIANallemandChinese(China)allemandhi!allemandzh_CNallemandiTALIANallemandenallemandItalienisch" + "'", str2, "hi!allemandItalienischallemanditalian_ITALIAN_EnglishallemandHI!allemandhi!allemandADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...allemand\\u0034allemandHI!allemandItalianallemand\\u0061allemand\\u0023allemandhi!allemandiTALIANallemandChinese(China)allemandhi!allemandzh_CNallemandiTALIANallemandenallemandItalienisch");
    }

    @Test
    public void test33127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest66.test33127");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("                                              italiano#########FranzosischFranzosisch (Frankreich)########TALIAN_italian_eNGLISHITAL", "                                                                                                               )))))))))))))))))))))))))))))))))))))))))))))))))))");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                              italiano#########FranzosischFranzosisch (Frankreich)########TALIAN_italian_eNGLISHITAL" + "'", str2, "                                              italiano#########FranzosischFranzosisch (Frankreich)########TALIAN_italian_eNGLISHITAL");
    }

    @Test
    public void test33128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest66.test33128");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("hI!hI!hI!hI!hI!CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC\\u00d\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITAL\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\u00CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test33129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest66.test33129");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.lang.String str2 = locale0.getExtension('h');
        java.lang.String str3 = locale0.getVariant();
        java.util.Set<java.lang.String> strSet4 = locale0.getUnicodeLocaleAttributes();
        java.util.Locale locale6 = new java.util.Locale("it hi!       _\\U0020...T hi!       _\\U0020...Ai hi!       _\\U0020...T hi!       _\\U0020..._ hi!       _\\U0020...ITA");
        java.lang.String str7 = locale0.getDisplayVariant(locale6);
        java.lang.String str8 = locale6.getDisplayName();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertEquals(locale6.toString(), "it hi!       _\\u0020...t hi!       _\\u0020...ai hi!       _\\u0020...t hi!       _\\u0020..._ hi!       _\\u0020...ita");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "it hi!       _\\u0020...t hi!       _\\u0020...ai hi!       _\\u0020...t hi!       _\\u0020..._ hi!       _\\u0020...ita" + "'", str8, "it hi!       _\\u0020...t hi!       _\\u0020...ai hi!       _\\u0020...t hi!       _\\u0020..._ hi!       _\\u0020...ita");
    }

    @Test
    public void test33130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest66.test33130");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("1\\u0061\\u0061\\u0061                           ", 0, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1\\u0061\\u0061\\u0061                           " + "'", str3, "1\\u0061\\u0061\\u0061                           ");
    }

    @Test
    public void test33131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest66.test33131");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("ititaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaiitalianititaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitai", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '!', 0, 220);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test33132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest66.test33132");
        java.util.Locale locale2 = java.util.Locale.forLanguageTag("hi!");
        java.lang.String str3 = locale2.getCountry();
        java.util.Locale.Builder builder4 = new java.util.Locale.Builder();
        java.util.Locale locale5 = builder4.build();
        java.util.Locale locale7 = java.util.Locale.forLanguageTag("Italian");
        java.lang.String str8 = locale5.getDisplayLanguage(locale7);
        java.lang.String str9 = locale2.getDisplayLanguage(locale5);
        boolean boolean10 = locale5.hasExtensions();
        java.lang.String str11 = locale5.getDisplayLanguage();
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.upperCase("", locale5);
        boolean boolean13 = locale5.hasExtensions();
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "italian");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test33133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest66.test33133");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder3.clear();
        java.util.Locale.Builder builder5 = builder3.clearExtensions();
        java.util.Locale locale6 = builder3.build();
        java.util.Locale locale7 = builder3.build();
        java.util.Locale locale8 = builder3.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder3.setUnicodeLocaleKeyword("", "EN_CA");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key:  [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
    }

    @Test
    public void test33134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest66.test33134");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "en_CA...FDEDZCYCXCWCVCUCRCOCNCMCLCKCICHCGCFCDCCCACZBYBWBVBTBSBRBQBOBNBMBLBJBIBHBGBFBEBDBBBABZAXAWAUATASARAQAOANAMALAIAGAFAEADA", (java.lang.CharSequence) "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiitalian_ITALIAN_Englishiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test33135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest66.test33135");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("Hhhhhhhhhh", "\u52a0\u62ff\u5927eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test33136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest66.test33136");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "EnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglisch", (int) '8');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test33137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest66.test33137");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("...\\U0066  gggggggggggggggggggggg", "NC_hz");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...\\U0066  gggggggggggggggggggggg" + "'", str2, "...\\U0066  gggggggggggggggggggggg");
    }

    @Test
    public void test33138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest66.test33138");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("talian\\u0032talian");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=talian\\u0032talian");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test33139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest66.test33139");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                         ITTAIT_ITALIAN_EGAISH", 'g');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test33140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest66.test33140");
        java.util.Locale locale3 = new java.util.Locale("fr-c                 ", "                 \\u0069hhhhhhhhhh                 ", "r0                                               nailati");
        org.junit.Assert.assertEquals(locale3.toString(), "fr-c                 _                 \\U0069HHHHHHHHHH                 _r0                                               nailati");
    }

    @Test
    public void test33141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest66.test33141");
        java.util.Locale locale2 = new java.util.Locale("DEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEU\\u0061");
        java.lang.String str3 = locale2.getDisplayCountry();
        java.lang.String str4 = locale2.getVariant();
        boolean boolean5 = locale2.hasExtensions();
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.upperCase("frnz\366sisch (knd)", locale2);
        java.lang.String str7 = locale2.getDisplayVariant();
        java.util.Locale locale9 = java.util.Locale.ENGLISH;
        java.lang.String str10 = locale9.getDisplayLanguage();
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.upperCase("!IH", locale9);
        java.lang.String str12 = locale9.getCountry();
        java.lang.String str13 = locale9.getISO3Language();
        java.lang.String str14 = locale9.getDisplayName();
        java.util.Locale locale15 = java.util.Locale.GERMAN;
        java.util.Locale locale16 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str17 = locale15.getDisplayName(locale16);
        java.util.Locale.setDefault(locale16);
        java.lang.String str19 = locale9.getDisplayCountry(locale16);
        java.lang.String str20 = locale2.getDisplayScript(locale9);
        org.junit.Assert.assertEquals(locale2.toString(), "deutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeu\\u0061");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "FRNZ\326SISCH (KND)" + "'", str6, "FRNZ\326SISCH (KND)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "English" + "'", str10, "English");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "!IH" + "'", str11, "!IH");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "eng" + "'", str13, "eng");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "English" + "'", str14, "English");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "de");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "allemand" + "'", str17, "allemand");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test33142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest66.test33142");
        java.util.Locale locale3 = new java.util.Locale("ko", "Franz\366sisch (Frankreich)", "\\u0034\\u00                                             hcstued                                             \\u0034\\u00 (\\U0020IITALIAN\\U0020I)");
        java.lang.String str4 = locale3.getScript();
        java.util.List<java.util.Locale.LanguageRange> languageRangeList6 = java.util.Locale.LanguageRange.parse("en");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap7 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList8 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList6, strMap7);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap10 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList11 = java.util.Locale.LanguageRange.parse(" italian  ", strMap10);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap12 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList13 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList11, strMap12);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap14 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList15 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList13, strMap14);
        java.util.Locale.LanguageRange[] languageRangeArray16 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList17 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList17, languageRangeArray16);
        java.util.Locale.LanguageRange[] languageRangeArray19 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList20 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList20, languageRangeArray19);
        java.lang.String[] strArray24 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList25 = new java.util.ArrayList<java.lang.String>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList25, strArray24);
        java.util.Locale.FilteringMode filteringMode27 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList28 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList20, (java.util.Collection<java.lang.String>) strList25, filteringMode27);
        java.util.Locale.FilteringMode filteringMode29 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList30 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList17, (java.util.Collection<java.lang.String>) strList25, filteringMode29);
        java.util.Locale.LanguageRange[] languageRangeArray31 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList32 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList32, languageRangeArray31);
        java.util.Locale.LanguageRange[] languageRangeArray34 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList35 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList35, languageRangeArray34);
        java.lang.String[] strArray39 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList40 = new java.util.ArrayList<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList40, strArray39);
        java.util.Locale.FilteringMode filteringMode42 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList43 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList35, (java.util.Collection<java.lang.String>) strList40, filteringMode42);
        java.util.Locale.FilteringMode filteringMode44 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList45 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList32, (java.util.Collection<java.lang.String>) strList40, filteringMode44);
        java.util.Locale.LanguageRange[] languageRangeArray46 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList47 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList47, languageRangeArray46);
        java.lang.String[] strArray51 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList52 = new java.util.ArrayList<java.lang.String>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList52, strArray51);
        java.util.Locale.FilteringMode filteringMode54 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList55 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList47, (java.util.Collection<java.lang.String>) strList52, filteringMode54);
        java.util.List<java.lang.String> strList56 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList17, (java.util.Collection<java.lang.String>) strList45, filteringMode54);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap58 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList59 = java.util.Locale.LanguageRange.parse("nailati", strMap58);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap60 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList61 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList59, strMap60);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap62 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList63 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList61, strMap62);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap65 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList66 = java.util.Locale.LanguageRange.parse("ENGLISCH", strMap65);
        java.util.Locale locale67 = java.util.Locale.ITALIAN;
        java.util.Set<java.lang.Character> charSet68 = locale67.getExtensionKeys();
        java.lang.String str69 = locale67.getVariant();
        java.lang.String str70 = locale67.getDisplayName();
        java.lang.String str71 = locale67.getCountry();
        java.util.Set<java.lang.String> strSet72 = locale67.getUnicodeLocaleKeys();
        java.lang.String str73 = java.util.Locale.lookupTag(languageRangeList66, (java.util.Collection<java.lang.String>) strSet72);
        java.util.Locale.LanguageRange[] languageRangeArray74 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList75 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList75, languageRangeArray74);
        java.util.Locale.LanguageRange[] languageRangeArray77 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList78 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList78, languageRangeArray77);
        java.lang.String[] strArray82 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList83 = new java.util.ArrayList<java.lang.String>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList83, strArray82);
        java.util.Locale.FilteringMode filteringMode85 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList86 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList78, (java.util.Collection<java.lang.String>) strList83, filteringMode85);
        java.util.Locale.FilteringMode filteringMode87 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList88 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList75, (java.util.Collection<java.lang.String>) strList83, filteringMode87);
        java.util.Collection<java.util.Locale> localeCollection89 = null;
        java.util.List<java.util.Locale> localeList90 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList75, localeCollection89);
        java.util.Locale locale91 = java.util.Locale.lookup(languageRangeList66, (java.util.Collection<java.util.Locale>) localeList90);
        java.util.Locale locale92 = java.util.Locale.lookup(languageRangeList61, (java.util.Collection<java.util.Locale>) localeList90);
        java.util.List<java.util.Locale> localeList93 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList17, (java.util.Collection<java.util.Locale>) localeList90);
        java.util.Locale locale94 = java.util.Locale.lookup(languageRangeList13, (java.util.Collection<java.util.Locale>) localeList90);
        java.util.Locale locale95 = java.util.Locale.lookup(languageRangeList8, (java.util.Collection<java.util.Locale>) localeList90);
        boolean boolean96 = locale3.equals((java.lang.Object) localeList90);
        org.junit.Assert.assertEquals(locale3.toString(), "ko_FRANZ\366SISCH (FRANKREICH)_\\u0034\\u00                                             hcstued                                             \\u0034\\u00 (\\U0020IITALIAN\\U0020I)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(languageRangeList6);
        org.junit.Assert.assertNotNull(languageRangeList8);
        org.junit.Assert.assertNotNull(languageRangeList11);
        org.junit.Assert.assertNotNull(languageRangeList13);
        org.junit.Assert.assertNotNull(languageRangeList15);
        org.junit.Assert.assertNotNull(languageRangeArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(languageRangeArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + filteringMode27 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode27.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList28);
        org.junit.Assert.assertTrue("'" + filteringMode29 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode29.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertNotNull(languageRangeArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(languageRangeArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + filteringMode42 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode42.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList43);
        org.junit.Assert.assertTrue("'" + filteringMode44 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode44.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList45);
        org.junit.Assert.assertNotNull(languageRangeArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + filteringMode54 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode54.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList55);
        org.junit.Assert.assertNotNull(strList56);
        org.junit.Assert.assertNotNull(languageRangeList59);
        org.junit.Assert.assertNotNull(languageRangeList61);
        org.junit.Assert.assertNotNull(languageRangeList63);
        org.junit.Assert.assertNotNull(languageRangeList66);
        org.junit.Assert.assertNotNull(locale67);
        org.junit.Assert.assertEquals(locale67.toString(), "it");
        org.junit.Assert.assertNotNull(charSet68);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "italien" + "'", str70, "italien");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertNotNull(strSet72);
        org.junit.Assert.assertNull(str73);
        org.junit.Assert.assertNotNull(languageRangeArray74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(languageRangeArray77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(strArray82);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertTrue("'" + filteringMode85 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode85.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList86);
        org.junit.Assert.assertTrue("'" + filteringMode87 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode87.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList88);
        org.junit.Assert.assertNotNull(localeList90);
        org.junit.Assert.assertNull(locale91);
        org.junit.Assert.assertNull(locale92);
        org.junit.Assert.assertNotNull(localeList93);
        org.junit.Assert.assertNull(locale94);
        org.junit.Assert.assertNull(locale95);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
    }
}
