import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest64 {

    public static boolean debug = false;

    @Test
    public void test32001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32001");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                                                                                        e                        ", 537);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test32002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32002");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("anglais");
        java.lang.String str2 = languageRange1.getRange();
        java.lang.String str3 = languageRange1.getRange();
        double double4 = languageRange1.getWeight();
        double double5 = languageRange1.getWeight();
        double double6 = languageRange1.getWeight();
        java.lang.String str7 = languageRange1.getRange();
        java.util.Locale.Category category8 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale10 = new java.util.Locale("...ANiTALI");
        java.util.Locale.setDefault(category8, locale10);
        java.util.Locale locale12 = java.util.Locale.FRANCE;
        java.util.Locale locale13 = java.util.Locale.ITALIAN;
        java.lang.String str15 = locale13.getExtension('h');
        java.lang.String str16 = locale12.getDisplayScript(locale13);
        java.util.Locale locale17 = locale12.stripExtensions();
        java.lang.String str18 = locale17.getISO3Country();
        java.util.Locale locale20 = new java.util.Locale("en");
        boolean boolean21 = locale20.hasExtensions();
        java.util.Set<java.lang.String> strSet22 = locale20.getUnicodeLocaleKeys();
        java.lang.String str23 = locale17.getDisplayCountry(locale20);
        java.lang.String str24 = locale17.getISO3Language();
        java.lang.String str25 = locale17.getLanguage();
        java.util.Locale.setDefault(category8, locale17);
        java.util.Locale locale28 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale.setDefault(category8, locale28);
        boolean boolean30 = languageRange1.equals((java.lang.Object) category8);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "anglais" + "'", str2, "anglais");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "anglais" + "'", str3, "anglais");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "anglais" + "'", str7, "anglais");
        org.junit.Assert.assertTrue("'" + category8 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category8.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertEquals(locale10.toString(), "...anitali");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "it");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "FRA" + "'", str18, "FRA");
        org.junit.Assert.assertEquals(locale20.toString(), "en");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "France" + "'", str23, "France");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "fra" + "'", str24, "fra");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "fr" + "'", str25, "fr");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test32003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32003");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("ANDITALIANALLEMANDCHINESE(CHINA)ALLEMANDHI!ALLEMANDZH_CNALLEMANDITALIANALLEMANDENALLEMANDITALIENISCH", "a)AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAdZH_cnFrench (Cana");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ANDITALIANALLEMANDCHINESE(CHINA)ALLEMANDHI!ALLEMANDZH_CNALLEMANDITALIANALLEMANDENALLEMANDITALIENISCH" + "'", str2, "ANDITALIANALLEMANDCHINESE(CHINA)ALLEMANDHI!ALLEMANDZH_CNALLEMANDITALIANALLEMANDENALLEMANDITALIENISCH");
    }

    @Test
    public void test32004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32004");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("(C)ALANALANALANAL", "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIITALIAN_ITALIAN_ENGLISHIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test32005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32005");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "\\u0020iItalian\\u008600u\\");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test32006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32006");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkEDkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk", "englischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglisch");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "englischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglisch" + "'", str2, "englischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglisch");
    }

    @Test
    public void test32007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32007");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\\", "                                                                                           u0020italianitalianitalianitali", 395);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test32008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32008");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEa", "!       aitalianitalianitalianitaliTALIENISCHaitalianitalianitalianitalITALIAN_italian_eNGLISHaitalianitalianitalianitalhi!aitalianitalianitalianitalHI!aitalianitalianitalianitaladaeafagaialamanaoaqarasatauawaxazbabbbdbebfbgbhbibjblbmbnbobqbrbsbtbvbwbybzcacccdcfcgchcickclcmcncocrcucvcwcxcyczded...aitalianitalianitalianital\\U0034aitalianitalianitalianitalhi!aitalianitalianitalianitaliTALIANaitalianitalianitalianital\\U0061aitalianitalianitalianital\\U00a3aitalianitalianitalianitalHI!aitalianitalianitalianitalItalianaitalianitalianitalianitalcHINESE (cHINA)aitalianitalianitalianitalHI!aitalianitalianitalianitalZH_cnaitalianitalianitalianitalItalianaitalianitalianitalianitalENaitalianitalianitalianitaliTALIENISCH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test32009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32009");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("                                                                              INGLESE                                ", "hi!deutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeu\\u0061deutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeu\\u0061deutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeu\\u0061deutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeu\\u0061deutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeu\\u0061deutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeu\\u0061deutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeu\\u0061_\\u0020_italienisch#########################################################################################", "inglese", 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                                                              INGLESE                                " + "'", str4, "                                                                              INGLESE                                ");
    }

    @Test
    public void test32010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32010");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test32011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32011");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "EagaashUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", "\\u0043");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test32012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32012");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("Hfffffffffcanad", "DACFACGACHACIACKACLAC", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test32013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32013");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "gsh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Gsh" + "'", str1, "Gsh");
    }

    @Test
    public void test32014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32014");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN                                                                     ", "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiir-FRAAAAAAAAAAAAAAAAAAAAAAAAAAA", 54);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test32015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32015");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("UD                                 ", "ZHO                                                                    \\u0020iTALIANiTALIANiTALIANiTALI", "nc_HZ                                                                  ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UDHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH" + "'", str3, "UDHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
    }

    @Test
    public void test32016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32016");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("Italian");
        java.util.Locale.Builder builder4 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder0.clear();
        java.util.Locale locale7 = java.util.Locale.forLanguageTag("\\u0020");
        java.util.Locale.Builder builder8 = builder0.setLocale(locale7);
        java.util.Locale.Builder builder9 = builder8.clear();
        java.util.Locale.Builder builder10 = builder8.clearExtensions();
        java.util.Locale.Builder builder12 = builder10.addUnicodeLocaleAttribute("emand");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder14 = builder12.setScript("RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRdeRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRdeRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR [at index 0]");
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
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test32017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32017");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZ", "English                                 (                United                                 Kingdom                )");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test32018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32018");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList0 = null;
        java.util.Locale locale1 = java.util.Locale.ROOT;
        java.lang.String str2 = locale1.getISO3Country();
        java.util.Set<java.lang.String> strSet3 = locale1.getUnicodeLocaleKeys();
        java.util.Set<java.lang.String> strSet4 = locale1.getUnicodeLocaleKeys();
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet4, 'A');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = java.util.Locale.lookupTag(languageRangeList0, (java.util.Collection<java.lang.String>) strSet4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test32019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32019");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("                                                                                                           FR_frGGGGG", "\uc601\uc5b4                              \\\uc601\uc5b4                              ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 107 + "'", int2 == 107);
    }

    @Test
    public void test32020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32020");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("fr-FR", "ad4ae4af4ag4ai4al4am4an4ao4aq4ar4as4at4au4aw4ax4az4ba4bb4bd4be4bf4bg4bh4bi4bj4bl4bm4bn4bo4bq4br4bs4bt4bv4bw...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test32021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32021");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("\\u002", "nc_HZ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test32022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32022");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = locale2.getUnicodeLocaleType("zhazhzhzhzhzhzhzhzhzhzh");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: zhazhzhzhzhzhzhzhzhzhzh");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test32023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32023");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("z..alhi!       _\\U0020_Italienisch####################################################################          andallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemand", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaallemand", (int) '#');
        boolean boolean6 = org.apache.commons.lang3.StringUtils.startsWithAny("R0", strArray5);
        int int7 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("\\U0047", strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test32024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32024");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder5 = builder4.clear();
        java.util.Locale.Builder builder7 = builder5.setLanguage("ITALIAN");
        java.util.Locale.Builder builder9 = builder7.setLanguage("FRA");
        java.util.Locale.Builder builder10 = builder7.clearExtensions();
        java.util.Locale locale12 = java.util.Locale.ITALIAN;
        java.util.Set<java.lang.Character> charSet13 = locale12.getExtensionKeys();
        java.lang.String str14 = locale12.getVariant();
        java.lang.String str15 = locale12.getDisplayName();
        java.lang.String str16 = locale12.getCountry();
        java.util.Set<java.lang.String> strSet17 = locale12.getUnicodeLocaleKeys();
        java.util.Set<java.lang.String> strSet18 = locale12.getUnicodeLocaleKeys();
        java.util.Locale locale19 = java.util.Locale.ITALIAN;
        java.util.Set<java.lang.Character> charSet20 = locale19.getExtensionKeys();
        java.lang.String str21 = locale19.getVariant();
        java.lang.String str22 = locale19.getDisplayName();
        java.lang.String str23 = locale19.getCountry();
        java.util.Set<java.lang.String> strSet24 = locale19.getUnicodeLocaleKeys();
        java.util.Set<java.lang.String> strSet25 = locale19.getUnicodeLocaleKeys();
        java.lang.String str26 = locale12.getDisplayLanguage(locale19);
        java.util.Locale locale28 = java.util.Locale.FRANCE;
        java.util.Locale locale29 = java.util.Locale.ITALIAN;
        java.lang.String str31 = locale29.getExtension('h');
        java.lang.String str32 = locale28.getDisplayScript(locale29);
        java.lang.String str33 = org.apache.commons.lang3.StringUtils.lowerCase("HI!       ", locale28);
        java.lang.String str35 = locale28.getExtension('z');
        java.lang.String str36 = locale12.getDisplayName(locale28);
        java.lang.String str37 = org.apache.commons.lang3.StringUtils.lowerCase("                                                               \\u002", locale28);
        boolean boolean38 = locale28.hasExtensions();
        java.util.Locale.Builder builder39 = builder10.setLocale(locale28);
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
        java.util.Locale locale53 = java.util.Locale.ITALIAN;
        java.lang.String str54 = locale53.getDisplayLanguage();
        java.util.Locale locale55 = locale53.stripExtensions();
        java.util.Locale locale57 = java.util.Locale.forLanguageTag("\\u0020");
        java.lang.String str58 = locale57.getDisplayScript();
        java.lang.String str59 = locale55.getDisplayCountry(locale57);
        java.util.Set<java.lang.String> strSet60 = locale57.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.Character> charSet61 = locale57.getExtensionKeys();
        java.util.Locale.setDefault(category40, locale57);
        java.util.Locale locale63 = java.util.Locale.getDefault(category40);
        java.util.Locale locale64 = java.util.Locale.ITALIAN;
        java.util.Set<java.lang.Character> charSet65 = locale64.getExtensionKeys();
        java.lang.String str66 = locale64.getVariant();
        java.lang.String str67 = locale64.getDisplayName();
        java.lang.String str68 = locale64.getDisplayName();
        java.lang.String str69 = locale64.getDisplayLanguage();
        java.util.Locale.Builder builder70 = new java.util.Locale.Builder();
        java.util.Locale locale71 = builder70.build();
        java.lang.String str72 = locale71.getDisplayCountry();
        java.lang.String str73 = locale64.getDisplayName(locale71);
        java.util.Locale locale74 = java.util.Locale.CANADA;
        java.lang.String str75 = locale74.getISO3Country();
        java.lang.String str76 = locale71.getDisplayCountry(locale74);
        java.util.Set<java.lang.Character> charSet77 = locale71.getExtensionKeys();
        java.util.Locale.setDefault(category40, locale71);
        java.lang.String str79 = locale28.getDisplayCountry(locale71);
        java.util.Locale locale80 = locale71.stripExtensions();
        java.lang.String[] strArray82 = java.util.Locale.getISOCountries();
        java.lang.String[] strArray84 = org.apache.commons.lang3.StringUtils.stripAll(strArray82, "");
        java.lang.String str85 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray84);
        boolean boolean86 = org.apache.commons.lang3.StringUtils.endsWithAny("CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC\\u00de\\u00CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC", strArray84);
        boolean boolean87 = locale71.equals((java.lang.Object) "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC\\u00de\\u00CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "French (Canada)" + "'", str3, "French (Canada)");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "it");
        org.junit.Assert.assertNotNull(charSet13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Italian" + "'", str15, "Italian");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "it");
        org.junit.Assert.assertNotNull(charSet20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Italian" + "'", str22, "Italian");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "italiano" + "'", str26, "italiano");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "it");
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!       " + "'", str33, "hi!       ");
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "italien" + "'", str36, "italien");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "                                                               \\u002" + "'", str37, "                                                               \\u002");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertTrue("'" + category40 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category40.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "en_GB");
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
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "it");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "italien" + "'", str54, "italien");
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "it");
        org.junit.Assert.assertNotNull(locale57);
        org.junit.Assert.assertEquals(locale57.toString(), "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertNotNull(strSet60);
        org.junit.Assert.assertNotNull(charSet61);
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "");
        org.junit.Assert.assertNotNull(locale64);
        org.junit.Assert.assertEquals(locale64.toString(), "it");
        org.junit.Assert.assertNotNull(charSet65);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "Italian" + "'", str67, "Italian");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "Italian" + "'", str68, "Italian");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "Italian" + "'", str69, "Italian");
        org.junit.Assert.assertNotNull(locale71);
        org.junit.Assert.assertEquals(locale71.toString(), "");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "Italian" + "'", str73, "Italian");
        org.junit.Assert.assertNotNull(locale74);
        org.junit.Assert.assertEquals(locale74.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "CAN" + "'", str75, "CAN");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertNotNull(charSet77);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "France" + "'", str79, "France");
        org.junit.Assert.assertNotNull(locale80);
        org.junit.Assert.assertEquals(locale80.toString(), "");
        org.junit.Assert.assertNotNull(strArray82);
        org.junit.Assert.assertNotNull(strArray84);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZW" + "'", str85, "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZW");
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
    }

    @Test
    public void test32025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32025");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("kkkkkkkkkkkkkkkkkkkk)dnk(hcsis\366znrfkkkkkkkkkkkkkkkkkkkk", "\uc601\uc5b4                                                                                                  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "kkkkkkkkkkkkkkkkkkkk)dnk(hcsis\366znrfkkkkkkkkkkkkkkkkkkkk" + "'", str2, "kkkkkkkkkkkkkkkkkkkk)dnk(hcsis\366znrfkkkkkkkkkkkkkkkkkkkk");
    }

    @Test
    public void test32026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32026");
        char[] charArray11 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray11);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "      ", charArray11);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "United State                                                                                     ", charArray11);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) " \\U0078 ", charArray11);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!       allemandtalienischallemanditalian_TALAN_Eng    \\     ADAEAFAGAALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCCKCLCMCNCOCRCUCVCWCXCYCZDED...allemand\\u0034allemandH!allemandtalianallemand\\u0061allemand\\u0023allemandhi!allemandiTALANallemandChinese (China)allemandhi!allemandzh_CNallemandiTALANallemandenallemandtalienisch", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4##a a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4##a a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4, #, #, a,  , a]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test32027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32027");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = java.util.Locale.UK;
        java.util.Locale.Builder builder3 = builder0.setLocale(locale2);
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale.Builder builder5 = new java.util.Locale.Builder();
        java.util.Locale locale6 = builder5.build();
        java.lang.String str7 = locale6.getDisplayCountry();
        java.util.Locale.Builder builder8 = builder3.setLocale(locale6);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder3.setExtension('i', "cinese777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension value: cinese777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en_GB");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test32028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32028");
        java.util.Locale locale0 = java.util.Locale.CHINESE;
        java.util.Locale locale1 = java.util.Locale.FRENCH;
        java.lang.String str2 = locale1.getDisplayName();
        java.lang.String str4 = locale1.getExtension('C');
        java.lang.String str5 = locale0.getDisplayLanguage(locale1);
        java.lang.String str6 = locale1.getISO3Country();
        java.util.Locale locale7 = locale1.stripExtensions();
        java.lang.String str8 = locale7.getCountry();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "French" + "'", str2, "French");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chinois" + "'", str5, "chinois");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test32029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32029");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("\n", (int) (short) -1, " 1\\u0061\\u0061\\u0061                           ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
    }

    @Test
    public void test32030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32030");
        java.util.Locale locale3 = new java.util.Locale("    ...", "fr-FR", "1\\u0061\\u0061\\u0061");
        org.junit.Assert.assertEquals(locale3.toString(), "    ..._FR-FR_1\\u0061\\u0061\\u0061");
    }

    @Test
    public void test32031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32031");
        java.util.Locale locale1 = java.util.Locale.ITALIAN;
        java.lang.String str2 = locale1.getDisplayLanguage();
        java.util.Locale locale3 = locale1.stripExtensions();
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.lowerCase("ccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc", locale3);
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
        java.util.Locale locale16 = java.util.Locale.CANADA;
        java.lang.String str17 = locale16.getISO3Country();
        java.lang.String str18 = locale13.getDisplayCountry(locale16);
        java.util.Locale locale19 = java.util.Locale.FRENCH;
        java.util.Locale locale20 = java.util.Locale.ENGLISH;
        java.lang.String str21 = locale20.getDisplayCountry();
        java.lang.String str22 = locale19.getDisplayVariant(locale20);
        java.lang.String str23 = locale19.getDisplayCountry();
        java.lang.String str24 = locale19.getScript();
        java.util.Locale locale25 = java.util.Locale.KOREA;
        java.lang.String str26 = locale25.getLanguage();
        java.lang.String str27 = locale19.getDisplayName(locale25);
        java.lang.String str28 = locale19.getDisplayName();
        java.lang.String str29 = locale16.getDisplayName(locale19);
        java.lang.String str30 = org.apache.commons.lang3.StringUtils.upperCase("Azhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais cinese (cina)\\u0069h..France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzh", locale16);
        java.lang.String str31 = locale16.getDisplayCountry();
        java.lang.String str32 = locale16.getVariant();
        java.lang.String str33 = locale3.getDisplayName(locale16);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Italian" + "'", str2, "Italian");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "it");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc" + "'", str4, "ccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc");
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
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "CAN" + "'", str17, "CAN");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "fr");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "en");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "ko" + "'", str26, "ko");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\ud504\ub791\uc2a4\uc5b4" + "'", str27, "\ud504\ub791\uc2a4\uc5b4");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "French" + "'", str28, "French");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "anglais (Canada)" + "'", str29, "anglais (Canada)");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "AZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS CINESE (CINA)\\U0069H..FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZH" + "'", str30, "AZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS CINESE (CINA)\\U0069H..FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZH");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Canada" + "'", str31, "Canada");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Italian" + "'", str33, "Italian");
    }

    @Test
    public void test32032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32032");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "5");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test32033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32033");
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
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet12, '\\');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet12, "\351K44444444444444444444444444444444!");
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "de");
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test32034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32034");
        java.util.Locale locale2 = new java.util.Locale("cHN", "ete");
        java.util.Locale.setDefault(locale2);
        java.util.Locale locale6 = new java.util.Locale("9hhhhhhhhhh", "  \\u007a");
        java.lang.String str7 = locale2.getDisplayName(locale6);
        java.util.Locale.Builder builder8 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder9 = builder8.clear();
        java.util.Locale.Builder builder10 = builder8.clear();
        java.util.Locale.Builder builder12 = builder10.setScript("");
        java.util.Locale.Builder builder13 = builder12.clear();
        java.util.Locale.Category category14 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale15 = java.util.Locale.FRANCE;
        java.util.Locale locale16 = java.util.Locale.ITALIAN;
        java.lang.String str18 = locale16.getExtension('h');
        java.lang.String str19 = locale15.getDisplayScript(locale16);
        java.util.Locale locale23 = new java.util.Locale("HI!       ", "\\U0020", "Italienisch#########################################################################################");
        java.lang.String str24 = locale15.getDisplayCountry(locale23);
        java.util.Locale.setDefault(locale15);
        java.util.Locale locale26 = locale15.stripExtensions();
        java.lang.String str27 = locale15.getDisplayName();
        java.util.Set<java.lang.String> strSet28 = locale15.getUnicodeLocaleAttributes();
        java.util.Locale.setDefault(category14, locale15);
        java.util.Locale.Builder builder30 = builder13.setLocale(locale15);
        java.util.Locale.Category category31 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale32 = java.util.Locale.ITALIAN;
        java.util.Set<java.lang.Character> charSet33 = locale32.getExtensionKeys();
        java.lang.String str34 = locale32.getVariant();
        java.lang.String str35 = locale32.getDisplayScript();
        java.util.Locale.setDefault(category31, locale32);
        java.util.Locale locale38 = java.util.Locale.forLanguageTag("hi!");
        java.lang.String str39 = locale38.getCountry();
        java.util.Locale.Builder builder40 = new java.util.Locale.Builder();
        java.util.Locale locale41 = builder40.build();
        java.util.Locale locale43 = java.util.Locale.forLanguageTag("Italian");
        java.lang.String str44 = locale41.getDisplayLanguage(locale43);
        java.lang.String str45 = locale38.getDisplayLanguage(locale41);
        boolean boolean46 = locale41.hasExtensions();
        java.lang.String str47 = locale32.getDisplayScript(locale41);
        java.lang.String str48 = locale15.getDisplayCountry(locale32);
        java.lang.String str49 = locale32.getScript();
        java.lang.String str50 = locale6.getDisplayVariant(locale32);
        java.util.Locale locale51 = locale6.stripExtensions();
        org.junit.Assert.assertEquals(locale2.toString(), "chn_ETE");
        org.junit.Assert.assertEquals(locale6.toString(), "9hhhhhhhhhh_  \\U007A");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Chinook jargon (ETE)" + "'", str7, "Chinook jargon (ETE)");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertTrue("'" + category14 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category14.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "it");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals(locale23.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "France" + "'", str24, "France");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "fran\347ais (France)" + "'", str27, "fran\347ais (France)");
        org.junit.Assert.assertNotNull(strSet28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertTrue("'" + category31 + "' != '" + java.util.Locale.Category.FORMAT + "'", category31.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "it");
        org.junit.Assert.assertNotNull(charSet33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "");
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "italian");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Francia" + "'", str48, "Francia");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "9hhhhhhhhhh_  \\U007A");
    }

    @Test
    public void test32035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32035");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "fr-");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "fr-" + "'", str1, "fr-");
    }

    @Test
    public void test32036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32036");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDh...", "\ud504\ub791\uc2a4\uc5b4\uce90\ub098\ub2e4)_ENGENGENGENGENGENGENGENGENGENGENGEN", "HI!HI     \\u005c         ", 60);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDh..." + "'", str4, "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDh...");
    }

    @Test
    public void test32037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32037");
        java.util.Locale.Builder builder1 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder1.clear();
        java.util.Locale locale3 = java.util.Locale.UK;
        java.util.Locale.Builder builder4 = builder1.setLocale(locale3);
        java.util.Locale locale6 = java.util.Locale.forLanguageTag("\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITAL");
        java.util.Locale.Builder builder7 = builder1.setLocale(locale6);
        java.lang.String str8 = locale6.getScript();
        java.lang.String str9 = locale6.getScript();
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.lowerCase("A700U\\  ", locale6);
        java.lang.Class<?> wildcardClass11 = locale6.getClass();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en_GB");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "a700u\\  " + "'", str10, "a700u\\  ");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test32038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32038");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HI!       ", "zhzhzhzhzhzhzhzhzhzhFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAzhzhzhzhzhzhzhzhzhzh", 7);
        int int8 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("", strArray7);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray7, "\\xtalxan_ITALIAN_Englxsh", (int) 'A', 5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEach("und-itTAiT-ITALIAN-EgAish", strArray2, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test32039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32039");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("cccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc...", 78);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "cccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc...             " + "'", str2, "cccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc...             ");
    }

    @Test
    public void test32040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32040");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("########################################################################################eltI_0200U\\_!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "########################################################################################elti_0200u\\_!" + "'", str1, "########################################################################################elti_0200u\\_!");
    }

    @Test
    public void test32041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32041");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("OHZ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "OHZ" + "'", str1, "OHZ");
    }

    @Test
    public void test32042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32042");
        java.util.Locale locale3 = new java.util.Locale("frfrfrfrfrfrfrfrfrfrfrfrfde_defrfrfrfrfrfrfrfrfrfrfrfrfr###############################################frfrfrfrfrfrfrfrfrfrfrfrfde_defrfrfrfrfrfrfrfrfrfrfrfrfr###############################################frfrfrfrfrfrfrfrfrfrfrfrfde_defrfrfrfrfrfrfrfrfrfrfrfrfr###############################################frfrfrfrfrfrfrfrfrfrfrfrfde_defrfrfrfrfrfrfrfrfrfrfrfrfr###############################################frfrfrfrfrfrfrfrfrfrfrfrfde_defrfrfrfrfrfrfrfrfrfrfrfrfr###############################################frfrfrfrfrfrfrfrfrfrfrfrfde_defrfrfrfrfrfrfrfrfrtalian\\u002", "allemand (Allemagne)", "iFtlnz\\sisc02");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = locale3.getISO3Country();
            org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException; message: Couldn't find 3-letter country code for ALLEMAND (ALLEMAGNE)");
        } catch (java.util.MissingResourceException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "frfrfrfrfrfrfrfrfrfrfrfrfde_defrfrfrfrfrfrfrfrfrfrfrfrfr###############################################frfrfrfrfrfrfrfrfrfrfrfrfde_defrfrfrfrfrfrfrfrfrfrfrfrfr###############################################frfrfrfrfrfrfrfrfrfrfrfrfde_defrfrfrfrfrfrfrfrfrfrfrfrfr###############################################frfrfrfrfrfrfrfrfrfrfrfrfde_defrfrfrfrfrfrfrfrfrfrfrfrfr###############################################frfrfrfrfrfrfrfrfrfrfrfrfde_defrfrfrfrfrfrfrfrfrfrfrfrfr###############################################frfrfrfrfrfrfrfrfrfrfrfrfde_defrfrfrfrfrfrfrfrfrtalian\\u002_ALLEMAND (ALLEMAGNE)_iFtlnz\\sisc02");
    }

    @Test
    public void test32043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32043");
        java.lang.Iterable<java.lang.String> strIterable0 = null;
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join(strIterable0, "                                          inglesehhhhhhhhh                                          ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test32044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32044");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("E44444444444444444444444444444444!IHG44444444444444444444444444444444!IH44444444444444444444444444444444!IHSH", "FrankreichFrz\366cz(frkrec)Frz\366cz(frkrec)Frz\366cz(frkrec)Frz\366cz(frkrec)Frz\366cz(frkreitaly");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "E44444444444444444444444444444444!IHG44444444444444444444444444444444!IH44444444444444444444444444444444!IHSH" + "'", str2, "E44444444444444444444444444444444!IHG44444444444444444444444444444444!IH44444444444444444444444444444444!IHSH");
    }

    @Test
    public void test32045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32045");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("nglish (United Kingdom");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test32046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32046");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("-", "9hhhhhhhhhh          9hhhhhhhhhh  ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test32047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32047");
        java.util.Locale locale3 = new java.util.Locale("...ANiTALI", "                           NNNNNNNNNNNNNNNNNN                               ZH_CN    South Korea    ZH_CN    Sout", "                                             DE_DE                                              ");
        java.lang.String str4 = locale3.getVariant();
        org.junit.Assert.assertEquals(locale3.toString(), "...anitali_                           NNNNNNNNNNNNNNNNNN                               ZH_CN    SOUTH KOREA    ZH_CN    SOUT_                                             DE_DE                                              ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                             DE_DE                                              " + "'", str4, "                                             DE_DE                                              ");
    }

    @Test
    public void test32048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32048");
        java.util.Locale locale1 = new java.util.Locale("fran\347ais(france)(CHINESE(CHINA)fran\347ais(france)(CHINE...ALzhAMzhANzhAOzhAQzhARzhASzhA");
        org.junit.Assert.assertEquals(locale1.toString(), "fran\347ais(france)(chinese(china)fran\347ais(france)(chine...alzhamzhanzhaozhaqzharzhaszha");
    }

    @Test
    public void test32049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32049");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("KorezhzhzhzhzhzhzhzhzhzhFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAzhzhzhzhzhzhzemandn (South Korea)", "t");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test32050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32050");
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
        java.util.Locale.Builder builder14 = builder11.setVariant("");
        java.util.Locale locale15 = builder14.build();
        java.util.Locale.Builder builder16 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder17 = builder16.clearExtensions();
        java.util.Locale locale18 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str19 = locale18.getDisplayName();
        java.util.Locale.Builder builder20 = builder17.setLocale(locale18);
        java.util.Locale locale21 = java.util.Locale.GERMANY;
        java.util.Locale.Builder builder22 = builder17.setLocale(locale21);
        java.util.Set<java.lang.String> strSet23 = locale21.getUnicodeLocaleAttributes();
        java.lang.String str24 = locale21.getDisplayName();
        java.util.Locale locale28 = new java.util.Locale("HI!       ", "\\U0020", "Italienisch#########################################################################################");
        java.util.Locale locale29 = locale28.stripExtensions();
        java.util.Locale locale30 = locale29.stripExtensions();
        java.util.Locale.setDefault(locale29);
        java.lang.String str32 = locale21.getDisplayName(locale29);
        java.util.Locale locale34 = java.util.Locale.forLanguageTag("aDAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...");
        java.lang.String str35 = locale34.getISO3Country();
        java.lang.String str36 = locale21.getDisplayName(locale34);
        java.lang.String str37 = locale15.getDisplayLanguage(locale21);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chinois (Chine)" + "'", str5, "chinois (Chine)");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "");
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "French (Canada)" + "'", str19, "French (Canada)");
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "de_DE");
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "German (Germany)" + "'", str24, "German (Germany)");
        org.junit.Assert.assertEquals(locale28.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "German (Germany)" + "'", str32, "German (Germany)");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "German (Germany)" + "'", str36, "German (Germany)");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
    }

    @Test
    public void test32051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32051");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("hi! _\\0020_Italienisch####################################################################", "             FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA             FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA             FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA             FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA23", 103);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! _\\0020_Italienisch####################################################################" + "'", str3, "hi! _\\0020_Italienisch####################################################################");
    }

    @Test
    public void test32052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32052");
        java.util.Locale locale0 = java.util.Locale.PRC;
        java.lang.String str1 = locale0.getDisplayVariant();
        java.util.Locale locale2 = java.util.Locale.FRENCH;
        java.util.Locale locale3 = java.util.Locale.ENGLISH;
        java.lang.String str4 = locale3.getDisplayCountry();
        java.lang.String str5 = locale2.getDisplayVariant(locale3);
        java.lang.String str6 = locale0.getDisplayScript(locale3);
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
        java.lang.String str19 = locale3.getDisplayCountry(locale9);
        java.util.Locale.Builder builder21 = new java.util.Locale.Builder();
        java.util.Locale locale22 = builder21.build();
        java.util.Locale locale24 = java.util.Locale.forLanguageTag("Italian");
        java.lang.String str25 = locale22.getDisplayLanguage(locale24);
        java.lang.String str26 = org.apache.commons.lang3.StringUtils.upperCase("", locale24);
        java.lang.String str27 = locale3.getDisplayName(locale24);
        java.util.Locale locale31 = new java.util.Locale("HI!       ", "\\U0020", "Italienisch#########################################################################################");
        java.util.Locale locale32 = locale31.stripExtensions();
        java.util.Locale.setDefault(locale32);
        java.util.Locale locale34 = locale32.stripExtensions();
        java.lang.String str35 = locale24.getDisplayVariant(locale32);
        java.lang.String str36 = locale32.getDisplayName();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "italian");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "English" + "'", str27, "English");
        org.junit.Assert.assertEquals(locale31.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!        (\\U0020,Italienisch#########################################################################################)" + "'", str36, "hi!        (\\U0020,Italienisch#########################################################################################)");
    }

    @Test
    public void test32053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32053");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.lang.String str1 = locale0.getDisplayLanguage();
        java.util.Locale locale2 = locale0.stripExtensions();
        java.lang.String str3 = locale0.getLanguage();
        java.lang.String str4 = locale0.getDisplayName();
        java.util.Locale locale7 = new java.util.Locale("\\u0020iTALIANiTALIANiTALIANiTALI\\u0020iTALIANiTALIANiTALIANiTAL", "allemand");
        java.lang.String str8 = locale7.getDisplayCountry();
        java.lang.String str9 = locale0.getDisplayScript(locale7);
        java.lang.String str10 = locale0.getVariant();
        java.lang.String str11 = locale0.getISO3Country();
        java.lang.String str12 = locale0.getLanguage();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Italian" + "'", str1, "Italian");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "it");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "it" + "'", str3, "it");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Italian" + "'", str4, "Italian");
        org.junit.Assert.assertEquals(locale7.toString(), "\\u0020italianitalianitalianitali\\u0020italianitalianitalianital_ALLEMAND");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ALLEMAND" + "'", str8, "ALLEMAND");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "it" + "'", str12, "it");
    }

    @Test
    public void test32054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32054");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("ko-KR", "\u53f0\u7063");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test32055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32055");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("italian (italian,englcor                                                         \\u005c         italian (italian,englcor", 54, "HSIAGE_NAILATI_TIATTIHI!_NAILATI         HSILGNE_NAILATI_NAILA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "italian (italian,englcor                                                         \\u005c         italian (italian,englcor" + "'", str3, "italian (italian,englcor                                                         \\u005c         italian (italian,englcor");
    }

    @Test
    public void test32056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32056");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("#########################################)ylatI( nailatIzzzc)ylatI( nailatIzzzne)ylatI( nailatIzzzla", (int) 'n', (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test32057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32057");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("Hcsineilat", 'b');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'H' + "'", char2 == 'H');
    }

    @Test
    public void test32058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32058");
        java.lang.String str1 = org.apache.commons.lang3.CharUtils.toString((java.lang.Character) '7');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "7" + "'", str1, "7");
    }

    @Test
    public void test32059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32059");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "\uc601\uc5b4\uc601\uc5b4\uc601\uc5b4\uc601\uc5b4es K\366\uc601\uc5b4\uc601\uc5b4ch)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test32060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32060");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                                ", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test32061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32061");
        java.util.Locale locale2 = new java.util.Locale("en_GB", "Hcsineilat");
        org.junit.Assert.assertEquals(locale2.toString(), "en_gb_HCSINEILAT");
    }

    @Test
    public void test32062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32062");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("CHINA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "CHINA" + "'", str1, "CHINA");
    }

    @Test
    public void test32063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32063");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("anglais (royaume-uni)fra", 812);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test32064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32064");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("                                      )HSILGNanglais (Etats-Unis)", "Eagaash");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test32065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32065");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r                                                                                              Deutsch");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test32066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32066");
        java.util.Locale.Builder builder1 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale locale3 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str4 = locale3.getDisplayName();
        java.util.Locale.Builder builder5 = builder2.setLocale(locale3);
        java.util.Locale.Builder builder6 = builder5.clear();
        java.util.Locale.Builder builder8 = builder6.setLanguage("ITALIAN");
        java.util.Locale locale9 = builder6.build();
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.lowerCase("                                                                                                        ", locale9);
        java.util.Set<java.lang.String> strSet11 = locale9.getUnicodeLocaleAttributes();
        java.lang.String str12 = locale9.getVariant();
        java.util.Set<java.lang.String> strSet13 = locale9.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.String> strSet14 = locale9.getUnicodeLocaleKeys();
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
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(strSet14);
    }

    @Test
    public void test32067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32067");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "...u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069!IH\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\englisc");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test32068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32068");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("FRANZ\326SISCH\n(FRANKREICH)HSIAGE_NAILATI_TIATTIHI!_NAILATI         HSILGNE_NAILATI_", "                                                                                                                                                                                                                                                                                                                                                                   tit                                                                                                                                                                                                                                                                                                                                                                   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test32069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32069");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "german (germany)german (geringlesehhhhhhhhH (germany)german (germany)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test32070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32070");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("KOR");
        java.lang.String str2 = languageRange1.getRange();
        java.lang.String str3 = languageRange1.getRange();
        java.lang.String str4 = languageRange1.getRange();
        double double5 = languageRange1.getWeight();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "kor" + "'", str2, "kor");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "kor" + "'", str3, "kor");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "kor" + "'", str4, "kor");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test32071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32071");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("NAILATI", "latIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIH", (int) 'd');
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test32072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32072");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("English (Canada)", "EFrankreichgFrankreichFrankreichsEFrankreicundEFrankreichgFrankreichFrankreichsEFrankreich", 804);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test32073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32073");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("a700u\\  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test32074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32074");
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
        java.util.Locale locale14 = builder13.build();
        java.lang.String str15 = locale14.getCountry();
        java.util.Locale locale17 = new java.util.Locale("AN_English2ITALIANITALIANITALIANITALHI!2ITALIANITALIANITALIANITALhi!2ITALIANITALIANITALIANITALADAEAFAGAIA");
        java.lang.String str18 = locale14.getDisplayScript(locale17);
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals(locale17.toString(), "an_english2italianitalianitalianitalhi!2italianitalianitalianitalhi!2italianitalianitalianitaladaeafagaia");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test32075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32075");
        java.util.Locale locale1 = java.util.Locale.TAIWAN;
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("CV CW CX CY CZ DE DJ DK DM DO DZ EC EE EG EH ER ES ET FI FJ FK", locale1);
        java.lang.String str3 = locale1.getDisplayName();
        java.lang.String str4 = locale1.toLanguageTag();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CV CW CX CY CZ DE DJ DK DM DO DZ EC EE EG EH ER ES ET FI FJ FK" + "'", str2, "CV CW CX CY CZ DE DJ DK DM DO DZ EC EE EG EH ER ES ET FI FJ FK");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Chinese (Taiwan)" + "'", str3, "Chinese (Taiwan)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zh-TW" + "'", str4, "zh-TW");
    }

    @Test
    public void test32076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32076");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.util.Locale locale1 = java.util.Locale.ENGLISH;
        java.lang.String str2 = locale1.getDisplayCountry();
        java.lang.String str3 = locale0.getDisplayVariant(locale1);
        java.lang.String str4 = locale0.getDisplayCountry();
        java.lang.String str5 = locale0.getScript();
        java.util.Locale locale6 = java.util.Locale.KOREA;
        java.lang.String str7 = locale6.getLanguage();
        java.lang.String str8 = locale0.getDisplayName(locale6);
        java.lang.String str9 = locale6.getDisplayName();
        java.util.Locale locale13 = new java.util.Locale("    \\XTALXAN_ITALIAN_ENGLXSH    ", "2iTALIANiTALIANiTALIANiTAL", "NC_HZ");
        java.lang.String str14 = locale6.getDisplayName(locale13);
        java.util.Locale locale18 = new java.util.Locale("fr_FR", "\ub3c5\uc77c\uc5b4", "hcsineilati");
        java.util.Locale locale22 = new java.util.Locale("HI!       ", "\\U0020", "Italienisch#########################################################################################");
        java.util.Locale locale23 = locale22.stripExtensions();
        java.util.Locale locale24 = locale23.stripExtensions();
        java.lang.String str25 = locale23.toLanguageTag();
        java.util.Locale locale27 = new java.util.Locale("en");
        boolean boolean28 = locale27.hasExtensions();
        java.util.Set<java.lang.String> strSet29 = locale27.getUnicodeLocaleKeys();
        java.lang.String str30 = locale23.getDisplayName(locale27);
        java.util.Locale locale34 = new java.util.Locale("HI!       ", "\\U0020", "Italienisch#########################################################################################");
        java.util.Locale locale35 = locale34.stripExtensions();
        java.lang.String str36 = locale27.getDisplayName(locale35);
        java.lang.String str37 = locale27.getCountry();
        java.util.Locale locale38 = java.util.Locale.ROOT;
        java.lang.String str39 = locale27.getDisplayName(locale38);
        java.lang.String str40 = locale18.getDisplayCountry(locale38);
        java.lang.String str41 = locale6.getDisplayLanguage(locale18);
        java.lang.String str42 = locale18.getVariant();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ko" + "'", str7, "ko");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\ud504\ub791\uc2a4\uc5b4" + "'", str8, "\ud504\ub791\uc2a4\uc5b4");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Korean (South Korea)" + "'", str9, "Korean (South Korea)");
        org.junit.Assert.assertEquals(locale13.toString(), "    \\xtalxan_italian_englxsh    _2ITALIANITALIANITALIANITAL_NC_HZ");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Korean (South Korea)" + "'", str14, "Korean (South Korea)");
// flaky:         org.junit.Assert.assertEquals(locale18.toString(), "\ub3c5\uc77c\uc5b4_hcsineilati");
        org.junit.Assert.assertEquals(locale22.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "und" + "'", str25, "und");
        org.junit.Assert.assertEquals(locale27.toString(), "en");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(strSet29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!        (\\U0020,Italienisch#########################################################################################)" + "'", str30, "hi!        (\\U0020,Italienisch#########################################################################################)");
        org.junit.Assert.assertEquals(locale34.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "English" + "'", str36, "English");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "English" + "'", str39, "English");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "\ub3c5\uc77c\uc5b4" + "'", str40, "\ub3c5\uc77c\uc5b4");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Korean" + "'", str41, "Korean");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hcsineilati" + "'", str42, "hcsineilati");
    }

    @Test
    public void test32077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32077");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("...###############################", "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC nailati");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test32078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32078");
        java.util.Locale locale1 = java.util.Locale.ENGLISH;
        java.lang.String str2 = locale1.getDisplayLanguage();
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.upperCase("!IH", locale1);
        java.util.Set<java.lang.Character> charSet4 = locale1.getExtensionKeys();
        java.lang.String str5 = locale1.getDisplayVariant();
        java.util.Locale locale8 = java.util.Locale.forLanguageTag("France");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.upperCase("inglese", locale8);
        java.lang.String str10 = locale8.getVariant();
        java.util.Locale locale11 = locale8.stripExtensions();
        java.lang.String str12 = locale11.getCountry();
        java.util.Locale locale15 = java.util.Locale.forLanguageTag("France");
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.lowerCase("Frankreich", locale15);
        java.lang.String str17 = locale15.getDisplayVariant();
        java.util.Locale locale18 = java.util.Locale.ITALIAN;
        java.util.Set<java.lang.Character> charSet19 = locale18.getExtensionKeys();
        java.lang.String str20 = locale18.getVariant();
        java.lang.String str21 = locale15.getDisplayVariant(locale18);
        java.util.Locale locale24 = new java.util.Locale("                                     fran\347ais (France)                                      ", "Chinese (China");
        java.lang.String str25 = locale15.getDisplayLanguage(locale24);
        java.lang.String str26 = locale11.getDisplayName(locale24);
        java.lang.String str27 = locale11.getDisplayVariant();
        java.lang.String str28 = locale1.getDisplayCountry(locale11);
        java.util.Locale locale30 = java.util.Locale.FRANCE;
        java.util.Locale locale31 = java.util.Locale.ITALIAN;
        java.lang.String str33 = locale31.getExtension('h');
        java.lang.String str34 = locale30.getDisplayScript(locale31);
        java.util.Locale locale35 = locale30.stripExtensions();
        java.lang.String str36 = locale35.getISO3Country();
        java.util.Locale locale38 = new java.util.Locale("en");
        boolean boolean39 = locale38.hasExtensions();
        java.util.Set<java.lang.String> strSet40 = locale38.getUnicodeLocaleKeys();
        java.lang.String str41 = locale35.getDisplayCountry(locale38);
        java.util.Locale locale43 = new java.util.Locale("en");
        boolean boolean44 = locale43.hasExtensions();
        java.lang.String str45 = locale38.getDisplayCountry(locale43);
        java.lang.String str46 = org.apache.commons.lang3.StringUtils.lowerCase("Frnz\366sisch (Knd)", locale38);
        java.lang.String str47 = locale38.getDisplayLanguage();
        java.lang.String str48 = locale38.getDisplayScript();
        java.lang.String str49 = locale38.getDisplayVariant();
        java.lang.String str50 = locale38.getISO3Language();
        java.lang.String str51 = locale1.getDisplayCountry(locale38);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "English" + "'", str2, "English");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!IH" + "'", str3, "!IH");
        org.junit.Assert.assertNotNull(charSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "france");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "INGLESE" + "'", str9, "INGLESE");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "france");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "france");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "frankreich" + "'", str16, "frankreich");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "it");
        org.junit.Assert.assertNotNull(charSet19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals(locale24.toString(), "                                     fran\347ais (france)                                      _CHINESE (CHINA");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "france" + "'", str25, "france");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "france" + "'", str26, "france");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "it");
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "FRA" + "'", str36, "FRA");
        org.junit.Assert.assertEquals(locale38.toString(), "en");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(strSet40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "France" + "'", str41, "France");
        org.junit.Assert.assertEquals(locale43.toString(), "en");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "frnz\366sisch (knd)" + "'", str46, "frnz\366sisch (knd)");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "English" + "'", str47, "English");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "eng" + "'", str50, "eng");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
    }

    @Test
    public void test32079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32079");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("TITHI!HI!", "    \\     ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test32080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32080");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("E");
        java.lang.String str2 = languageRange1.getRange();
        double double3 = languageRange1.getWeight();
        double double4 = languageRange1.getWeight();
        double double5 = languageRange1.getWeight();
        double double6 = languageRange1.getWeight();
        double double7 = languageRange1.getWeight();
        java.lang.String str8 = languageRange1.getRange();
        java.lang.String str9 = languageRange1.getRange();
        java.lang.String str10 = languageRange1.getRange();
        double double11 = languageRange1.getWeight();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "e" + "'", str2, "e");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "e" + "'", str8, "e");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "e" + "'", str9, "e");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "e" + "'", str10, "e");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test32081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32081");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("FR_FRFR_FRFR_FRFR_FRFR_FRFR_FRFR_FRFR_FRFR_FRFR_FRFR_FRFR_FRFR_FRFR_FRFR_FRFR_FRFR_FRFR_FRFR_FRFR_FRFR_FRFR_FRFR_FRFR_FR", "Ital");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test32082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32082");
        java.util.Locale locale1 = new java.util.Locale("fra");
        java.util.Set<java.lang.String> strSet2 = locale1.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.String> strSet3 = locale1.getUnicodeLocaleKeys();
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet3, "ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZhsxlgne_n");
        org.junit.Assert.assertEquals(locale1.toString(), "fra");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test32083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32083");
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
        java.util.Locale locale15 = builder14.build();
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
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "ixii");
    }

    @Test
    public void test32084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32084");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "hcsineilatI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test32085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32085");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("na)AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAdZH_cnFrench (C", "UDHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH", (int) 'i');
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test32086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32086");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("hi!       ", "                                                     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test32087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32087");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("44d48600u\\", "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiEsilgnE_NAILATI_nailatiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii", 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44d48600u\\" + "'", str3, "44d48600u\\");
    }

    @Test
    public void test32088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32088");
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
        java.util.Locale.Builder builder18 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder19 = builder18.clear();
        java.util.Locale locale20 = java.util.Locale.UK;
        java.util.Locale.Builder builder21 = builder18.setLocale(locale20);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.lowerCase("Royaume-Uni", locale20);
        java.lang.String str23 = locale20.getDisplayLanguage();
        java.lang.String str24 = locale7.getDisplayScript(locale20);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "allemand" + "'", str2, "allemand");
        org.junit.Assert.assertTrue("'" + category3 + "' != '" + java.util.Locale.Category.FORMAT + "'", category3.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!        (\\U0020,Italienisch#########################################################################################)" + "'", str16, "hi!        (\\U0020,Italienisch#########################################################################################)");
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "en_GB");
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "royaume-uni" + "'", str22, "royaume-uni");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "English" + "'", str23, "English");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test32089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32089");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\renglisch\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test32090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32090");
        java.util.Locale locale3 = new java.util.Locale("\\u0045", "");
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleAttributes();
        java.lang.String str5 = locale3.getLanguage();
        java.lang.String str6 = locale3.getLanguage();
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.lowerCase("en_US", locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "\\u0045");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\\u0045" + "'", str5, "\\u0045");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\u0045" + "'", str6, "\\u0045");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "en_us" + "'", str7, "en_us");
    }

    @Test
    public void test32091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32091");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "\uc601\uc5b4\uc601\uc5b4\uc601\uc5b4\uc601\uc5b4\uc601\uc5b4\uc601\uc5b4\uc601\uc5b4\uc601\uc5b4\uc601\uc5b4\uc601\uc5b4                                                                                                  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test32092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32092");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "00000000000000coreen (coree du sud)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test32093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32093");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("...EnglishEnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn", "                                                                                                                  \\u0068");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...EnglishEnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn" + "'", str2, "...EnglishEnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn");
    }

    @Test
    public void test32094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32094");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("NC_HZ\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test32095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32095");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "Chinesisch (China", 32);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("zosischFranzosisch (Frankreich)", 'k');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("\uc601\uc5b4\uc601\uc5b4\uc601\uc5b4\uc601\uc5b4\uc601\uc5b4\uc601\uc5b4\uc601\uc5b4\uc601\uc5b4\uc601\uc5b4\uc601\uc5b4                                                                                                  ", strArray4, strArray7);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\uc601\uc5b4\uc601\uc5b4\uc601\uc5b4\uc601\uc5b4\uc601\uc5b4\uc601\uc5b4\uc601\uc5b4\uc601\uc5b4\uc601\uc5b4\uc601\uc5b4                                                                                                  " + "'", str8, "\uc601\uc5b4\uc601\uc5b4\uc601\uc5b4\uc601\uc5b4\uc601\uc5b4\uc601\uc5b4\uc601\uc5b4\uc601\uc5b4\uc601\uc5b4\uc601\uc5b4                                                                                                  ");
    }

    @Test
    public void test32096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32096");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("Italian");
        java.util.Locale.Builder builder4 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder0.clear();
        java.util.Locale locale6 = builder5.build();
        java.lang.String str8 = locale6.getExtension('f');
        java.util.Locale locale9 = locale6.stripExtensions();
        java.lang.String str10 = locale6.toString();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test32097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32097");
        java.util.Locale.Builder builder1 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale locale3 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str4 = locale3.getDisplayName();
        java.util.Locale.Builder builder5 = builder2.setLocale(locale3);
        java.util.Locale.Builder builder6 = builder5.clear();
        java.util.Locale.Builder builder8 = builder6.setLanguage("ITALIAN");
        java.util.Locale locale9 = builder6.build();
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.upperCase("hi!", locale9);
        java.lang.String str11 = locale9.getCountry();
        java.util.Locale.setDefault(locale9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = locale9.getISO3Language();
            org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException; message: Couldn't find 3-letter language code for italian");
        } catch (java.util.MissingResourceException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "French (Canada)" + "'", str4, "French (Canada)");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "italian");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HI!" + "'", str10, "HI!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test32098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32098");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("HHHHHHHHH         ITAL\\u0020iItalian\\u008600u\\HHHHHHHHH         ITAL", "00000000...", 47);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test32099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32099");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rZH_CN (CAN)", "U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITAL");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test32100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32100");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rZH_CN (CAN)", "\\u0020iItalian\\u0020i                                                 ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test32101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32101");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rChinesisch (China", "Hian\\u0020iH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rChinesisch (China" + "'", str2, "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rChinesisch (China");
    }

    @Test
    public void test32102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32102");
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
        java.util.Locale.Builder builder46 = builder0.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder48 = builder0.addUnicodeLocaleAttribute("");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute:  [at index 0]");
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
        org.junit.Assert.assertEquals(locale19.toString(), "italian");
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
        org.junit.Assert.assertNotNull(builder46);
    }

    @Test
    public void test32103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32103");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("             hcsineilatI             dddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd", "italian_italian_englisfitalian (italian,englis", (int) 'j');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test32104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32104");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("en_GB", "4444444444444444444444444444444444444             DE_DE            44444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "en_GB" + "'", str2, "en_GB");
    }

    @Test
    public void test32105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32105");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("ADKAEKAFKAGKAIKALKAMKANKAOKAQKARKASKATKAUKAWKAXKAZKBAKBBKBDKBEKBFKBGKBHKBIKBJKBLKBMKBNKBOKBQKBRKBSKBTKBVKBWKBYKBZKCAKCCKCDKCFKCGKCHKCIKCKKCLKCMKCNKCOKCRKCUKCVKCWKCXKCYKCZKDEKDJKDKKDMKDOKDZKECKEEKEGKEHKERKESKETKFIKFJKFKKFMKFOKFRKGAKGBKGDKGEKGFKGGKGHKGIKGLKGMKGNKGPKGQKGRKGSKGTKGUKGWKGYKHKKHMKHNKHRKHTKHUKIDKIEKILKIMKINKIOKIQKIRKISKITKJEKJMKJOKJPKKEKKGKKHKKIKKMKKNKKPKKRKKWKKYKKZKLAKLBKLCKLIKLKKLRKLSKLTKLUKLVKLYKMAKMCKMDKMEKMFKMGKMHKMKKMLKMMKMNKMOKMPKMQKMRKMSKMTKMUKMVKMWKMXKMYKMZKNAKNCKNEKNFKNGKNIKNLKNOKNPKNRKNUKNZKOMKPAKPEKPFKPGKPHKPKKPLKPMKPNKPRKPSKPTKPWKPYKQAKREKROKRSKRUKRWKSAKSBKSCKSDKSEKSGKSHKSIKSJKSKKSLKSMKSNKSOKSRKSSKSTKSVKSXKSYKSZKTCKTDKTFKTGKTHKTJKTKKTLKTMKTNKTOKTRKTTKTVKTWKTZKUAKUGKUMKUSKUYKUZKVAKVCKVEKVGKVIKVNKVUKWFKWSKYEKYTKZAKZMKZW", "Englisch", 96);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ADKAKAFKAGKAIKALKAMKANKAOKAQKARKASKATKAUKAWKAXKAZKBAKBBKBDKBKBFKBGKBHKBIKBJKBLKBMKBNKBOKBQKBRKBSKBTKBVKBWKBYKBZKCAKCCKCDKCFKCGKCHKCIKCKKCLKCMKCNKCOKCRKCUKCVKCWKCXKCYKCZKDKDJKDKKDMKDOKDZKCKKGKHKRKSKTKFIKFJKFKKFMKFOKFRKGAKGBKGDKGKGFKGGKGHKGIKGLKGMKGNKGPKGQKGRKGSKGTKGUKGWKGYKHKKHMKHNKHRKHTKHUKIDKIKILKIMKINKIOKIQKIRKISKITKJKJMKJOKJPKKKKGKKHKKIKKMKKNKKPKKRKKWKKYKKZKLAKLBKLCKLIKLKKLRKLSKLTKLUKLVKLYKMAKMCKMDKMKMFKMGKMHKMKKMLKMMKMNKMOKMPKMQKMRKMSKMTKMUKMVKMWKMXKMYKMZKNAKNCKNKNFKNGKNIKNLKNOKNPKNRKNUKNZKOMKPAKPKPFKPGKPHKPKKPLKPMKPNKPRKPSKPTKPWKPYKQAKRKROKRSKRUKRWKSAKSBKSCKSDKSKSGKSHKSIKSJKSKKSLKSMKSNKSOKSRKSSKSTKSVKSXKSYKSZKTCKTDKTFKTGKTHKTJKTKKTLKTMKTNKTOKTRKTTKTVKTWKTZKUAKUGKUMKUSKUYKUZKVAKVCKVKVGKVIKVNKVUKWFKWSKYKYTKZAKZMKZW" + "'", str4, "ADKAKAFKAGKAIKALKAMKANKAOKAQKARKASKATKAUKAWKAXKAZKBAKBBKBDKBKBFKBGKBHKBIKBJKBLKBMKBNKBOKBQKBRKBSKBTKBVKBWKBYKBZKCAKCCKCDKCFKCGKCHKCIKCKKCLKCMKCNKCOKCRKCUKCVKCWKCXKCYKCZKDKDJKDKKDMKDOKDZKCKKGKHKRKSKTKFIKFJKFKKFMKFOKFRKGAKGBKGDKGKGFKGGKGHKGIKGLKGMKGNKGPKGQKGRKGSKGTKGUKGWKGYKHKKHMKHNKHRKHTKHUKIDKIKILKIMKINKIOKIQKIRKISKITKJKJMKJOKJPKKKKGKKHKKIKKMKKNKKPKKRKKWKKYKKZKLAKLBKLCKLIKLKKLRKLSKLTKLUKLVKLYKMAKMCKMDKMKMFKMGKMHKMKKMLKMMKMNKMOKMPKMQKMRKMSKMTKMUKMVKMWKMXKMYKMZKNAKNCKNKNFKNGKNIKNLKNOKNPKNRKNUKNZKOMKPAKPKPFKPGKPHKPKKPLKPMKPNKPRKPSKPTKPWKPYKQAKRKROKRSKRUKRWKSAKSBKSCKSDKSKSGKSHKSIKSJKSKKSLKSMKSNKSOKSRKSSKSTKSVKSXKSYKSZKTCKTDKTFKTGKTHKTJKTKKTLKTMKTNKTOKTRKTTKTVKTWKTZKUAKUGKUMKUSKUYKUZKVAKVCKVKVGKVIKVNKVUKWFKWSKYKYTKZAKZMKZW");
    }

    @Test
    public void test32106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32106");
        java.util.Locale.Category category1 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale2 = java.util.Locale.getDefault(category1);
        java.util.Locale locale3 = java.util.Locale.GERMAN;
        java.util.Locale locale4 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str5 = locale3.getDisplayName(locale4);
        java.util.Locale.setDefault(category1, locale4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.lowerCase("                                                                                                    ", locale4);
        java.lang.String str8 = locale4.getCountry();
        org.junit.Assert.assertTrue("'" + category1 + "' != '" + java.util.Locale.Category.FORMAT + "'", category1.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "de");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "allemand" + "'", str5, "allemand");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "                                                                                                    " + "'", str7, "                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CA" + "'", str8, "CA");
    }

    @Test
    public void test32107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32107");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                         \\u005c                                                        ", "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rzh_CN", 60);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test32108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32108");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("", 328);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test32109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32109");
        java.util.Locale locale4 = new java.util.Locale("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rFRANZ\326SISCH\n(FRANKREICH)\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r", "Deutsc", "...ANiTALI");
        java.lang.String str5 = locale4.getDisplayLanguage();
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.upperCase("       !i.", locale4);
        java.util.Locale locale7 = java.util.Locale.GERMAN;
        java.util.Locale locale8 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str9 = locale7.getDisplayName(locale8);
        java.util.Locale locale10 = java.util.Locale.UK;
        java.util.Locale locale11 = java.util.Locale.GERMAN;
        java.util.Locale locale12 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str13 = locale11.getDisplayName(locale12);
        java.util.Locale locale14 = locale11.stripExtensions();
        java.lang.String str15 = locale10.getDisplayVariant(locale11);
        java.lang.String str16 = locale8.getDisplayLanguage(locale11);
        java.util.Locale locale17 = locale8.stripExtensions();
        java.lang.String str18 = locale17.getDisplayName();
        java.lang.String str19 = locale4.getDisplayVariant(locale17);
        boolean boolean20 = locale4.hasExtensions();
        org.junit.Assert.assertEquals(locale4.toString(), "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rfranz\326sisch\n(frankreich)\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r_DEUTSC_...ANiTALI");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rfranz\326sisch\n(frankreich)\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r" + "'", str5, "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rfranz\326sisch\n(frankreich)\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "       !I." + "'", str6, "       !I.");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "de");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "allemand" + "'", str9, "allemand");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "de");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "allemand" + "'", str13, "allemand");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "de");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Franz\366sisch" + "'", str16, "Franz\366sisch");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "fran\347ais (Canada)" + "'", str18, "fran\347ais (Canada)");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "...ANiTALI" + "'", str19, "...ANiTALI");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test32110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32110");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "lllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllll00000000000000cor\351en (Cor\351e du Sud)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test32111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32111");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("", "J");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test32112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32112");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("2CINESE(CINA...                                                                                  ", (int) 'e', 'B');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "BBBB2CINESE(CINA...                                                                                  " + "'", str3, "BBBB2CINESE(CINA...                                                                                  ");
    }

    @Test
    public void test32113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32113");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("                                                   ", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test32114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32114");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("                                                                                                   hsADANACADANACgADANACE");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hsADANACADANACgADANACE" + "'", str1, "hsADANACADANACgADANACE");
    }

    @Test
    public void test32115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32115");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                              DE_DE                              ", 'd');
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.split("anglais (Royaume-Uni)");
        boolean boolean7 = org.apache.commons.lang3.StringUtils.endsWithAny("FR-CAFR-CAFR-C8600U\\FR-CAFR-CAFR-CA", strArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, "aaaaaaaaaaaaaaaaDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEU\\u0061aaaaaaaaaaaaaaaa");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEach("FRANZ\366SISCH", strArray3, strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "anglaisaaaaaaaaaaaaaaaaDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEU\\u0061aaaaaaaaaaaaaaaa(Royaume-Uni)" + "'", str9, "anglaisaaaaaaaaaaaaaaaaDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEU\\u0061aaaaaaaaaaaaaaaa(Royaume-Uni)");
    }

    @Test
    public void test32116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32116");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("hi!", "                                                         it_IT                                                         ", 374);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test32117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32117");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("IIIIIIIIIIIIIIIIIIIIIIIIIIITALIAN_ITALIAN_ENGLIHIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaallemandnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn", 347);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IIIIIIIIIIIIIIIIIIIIIIIIIIITALIAN_ITALIAN_ENGLIHIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII" + "'", str3, "IIIIIIIIIIIIIIIIIIIIIIIIIIITALIAN_ITALIAN_ENGLIHIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
    }

    @Test
    public void test32118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32118");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("IT");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, 'n', 8, 136);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 8");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test32119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32119");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("Chi esisch(Chi a)", 34);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test32120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32120");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "fffffffffffffffffffffffffffffffffffffffffffffffffffffffffff                                     fran\347ais (France)                                      fffffffffffffffffffffffffffffffffffffffffffffffffffffffffff");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "fffffffffffffffffffffffffffffffffffffffffffffffffffffffffff                                     fran\347ais (France)                                      fffffffffffffffffffffffffffffffffffffffffffffffffffffffffff" + "'", str1, "fffffffffffffffffffffffffffffffffffffffffffffffffffffffffff                                     fran\347ais (France)                                      fffffffffffffffffffffffffffffffffffffffffffffffffffffffffff");
    }

    @Test
    public void test32121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32121");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("Eagaas\\\\\\\\\\\\\\HI!HI!", "    \\     ");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("AD4AE4AF4AG4AI4AL4AM4AN4AO4AQ4AR4AS4AT4AU4AW4AX4AZ4BA4BB4BD4BE4BF4BG4BH4BI4BJ4BL4BM4BN4BO4BQ4BR4BS4BT4BV4BW...R-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAA", strArray3);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Eagaas\\\\\\\\\\\\\\HI!HI!" + "'", str5, "Eagaas\\\\\\\\\\\\\\HI!HI!");
    }

    @Test
    public void test32122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32122");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.split("ADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhATzhAUzhAWzhAXzhAZzhBAzhBBzhBDzhBEzhBFzhBGzhBHzhBIzhBJzhBLzhBMzhBNzhBOzhBQzhBRzhBSzhBTzhBVzhBWzhBYzhBZzhCAzhCCzhCDzhCFzhCGzhCHzhCIzhCKzhCLzhCMzhCNzhCOzhCRzhCUzhCVzhCWzhCXzhCYzhCZzhDEzhDJzhDKzhDMzhDOzhDZzhECzhEEzhEGzhEHzhERzhESzhETzhFIzhFJzhFKzhFMzhFOzhFRzhGAzhGBzhGDzhGEzhGFzhGGzhGHzhGIzhGLzhGMzhGNzhGPzhGQzhGRzhGSzhGTzhGUzhGWzhGYzhHKzhHMzhHNzhHRzhHTzhHUzhIDzhIEzhILzhIMzhINzhIOzhIQzhIRzhISzhITzhJEzhJMzhJOzhJPzhKEzhKGzhKHzhKIzhKMzhKNzhKPzhKRzhKWzhKYzhKZzhLAzhLBzhLCzhLIzhLKzhLRzhLSzhLTzhLUzhLVzhLYzhMAzhMCzhMDzhMEzhMFzhMGzhMHzhMKzhMLzhMMzhMNzhMOzhMPzhMQzhMRzhMSzhMTzhMUzhMVzhMWzhMXzhMYzhMZzhNAzhNCzhNEzhNFzhNGzhNIzhNLzhNOzhNPzhNRzhNUzhNZzhOMzhPAzhPEzhPFzhPGzhPHzhPKzhPLzhPMzhPNzhPRzhPSzhPTzhPWzhPYzhQAzhREzhROzhRSzhRUzhRWzhSAzhSBzhSCzhSDzhSEzhSGzhSHzhSIzhSJzhSKzhSLzhSMzhSNzhSOzhSRzhSSzhSTzhSVzhSXzhSYzhSZzhTCzhTDzhTFzhTGzhTHzhTJzhTKzhTLzhTMzhTNzhTOzhTRzhTTzhTVzhTWzhTZzhUAzhUGzhUMzhUSzhUYzhUZzhVAzhVCzhVEzhVGzhVIzhVNzhVUzhWFzhWSzhYEzhYTzhZAzhZMzhZW", "\\u0065", 104);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.endsWithAny("\\u0066", strArray6);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny("2cinese (Cina...", strArray6);
        int int9 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("\u30d5\u30e9\u30f3\u30b9\u8a9e\u30ab\u30ca\u30c0)", strArray6);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhATzhAUzhAWzhAXzhAZzhBAzhBBzhBDzhBEzhBFzhBGzhBHzhBIzhBJzhBLzhBMzhBNzhBOzhBQzhBRzhBSzhBTzhBVzhBWzhBYzhBZzhCAzhCCzhCDzhCFzhCGzhCHzhCIzhCKzhCLzhCMzhCNzhCOzhCRzhCUzhCVzhCWzhCXzhCYzhCZzhDEzhDJzhDKzhDMzhDOzhDZzhECzhEEzhEGzhEHzhERzhESzhETzhFIzhFJzhFKzhFMzhFOzhFRzhGAzhGBzhGDzhGEzhGFzhGGzhGHzhGIzhGLzhGMzhGNzhGPzhGQzhGRzhGSzhGTzhGUzhGWzhGYzhHKzhHMzhHNzhHRzhHTzhHUzhIDzhIEzhILzhIMzhINzhIOzhIQzhIRzhISzhITzhJEzhJMzhJOzhJPzhKEzhKGzhKHzhKIzhKMzhKNzhKPzhKRzhKWzhKYzhKZzhLAzhLBzhLCzhLIzhLKzhLRzhLSzhLTzhLUzhLVzhLYzhMAzhMCzhMDzhMEzhMFzhMGzhMHzhMKzhMLzhMMzhMNzhMOzhMPzhMQzhMRzhMSzhMTzhMUzhMVzhMWzhMXzhMYzhMZzhNAzhNCzhNEzhNFzhNGzhNIzhNLzhNOzhNPzhNRzhNUzhNZzhOMzhPAzhPEzhPFzhPGzhPHzhPKzhPLzhPMzhPNzhPRzhPSzhPTzhPWzhPYzhQAzhREzhROzhRSzhRUzhRWzhSAzhSBzhSCzhSDzhSEzhSGzhSHzhSIzhSJzhSKzhSLzhSMzhSNzhSOzhSRzhSSzhSTzhSVzhSXzhSYzhSZzhTCzhTDzhTFzhTGzhTHzhTJzhTKzhTLzhTMzhTNzhTOzhTRzhTTzhTVzhTWzhTZzhUAzhUGzhUMzhUSzhUYzhUZzhVAzhVCzhVEzhVGzhVIzhVNzhVUzhWFzhWSzhYEzhYTzhZAzhZMzhZW" + "'", str10, "ADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhATzhAUzhAWzhAXzhAZzhBAzhBBzhBDzhBEzhBFzhBGzhBHzhBIzhBJzhBLzhBMzhBNzhBOzhBQzhBRzhBSzhBTzhBVzhBWzhBYzhBZzhCAzhCCzhCDzhCFzhCGzhCHzhCIzhCKzhCLzhCMzhCNzhCOzhCRzhCUzhCVzhCWzhCXzhCYzhCZzhDEzhDJzhDKzhDMzhDOzhDZzhECzhEEzhEGzhEHzhERzhESzhETzhFIzhFJzhFKzhFMzhFOzhFRzhGAzhGBzhGDzhGEzhGFzhGGzhGHzhGIzhGLzhGMzhGNzhGPzhGQzhGRzhGSzhGTzhGUzhGWzhGYzhHKzhHMzhHNzhHRzhHTzhHUzhIDzhIEzhILzhIMzhINzhIOzhIQzhIRzhISzhITzhJEzhJMzhJOzhJPzhKEzhKGzhKHzhKIzhKMzhKNzhKPzhKRzhKWzhKYzhKZzhLAzhLBzhLCzhLIzhLKzhLRzhLSzhLTzhLUzhLVzhLYzhMAzhMCzhMDzhMEzhMFzhMGzhMHzhMKzhMLzhMMzhMNzhMOzhMPzhMQzhMRzhMSzhMTzhMUzhMVzhMWzhMXzhMYzhMZzhNAzhNCzhNEzhNFzhNGzhNIzhNLzhNOzhNPzhNRzhNUzhNZzhOMzhPAzhPEzhPFzhPGzhPHzhPKzhPLzhPMzhPNzhPRzhPSzhPTzhPWzhPYzhQAzhREzhROzhRSzhRUzhRWzhSAzhSBzhSCzhSDzhSEzhSGzhSHzhSIzhSJzhSKzhSLzhSMzhSNzhSOzhSRzhSSzhSTzhSVzhSXzhSYzhSZzhTCzhTDzhTFzhTGzhTHzhTJzhTKzhTLzhTMzhTNzhTOzhTRzhTTzhTVzhTWzhTZzhUAzhUGzhUMzhUSzhUYzhUZzhVAzhVCzhVEzhVGzhVIzhVNzhVUzhWFzhWSzhYEzhYTzhZAzhZMzhZW");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhATzhAUzhAWzhAXzhAZzhBAzhBBzhBDzhBEzhBFzhBGzhBHzhBIzhBJzhBLzhBMzhBNzhBOzhBQzhBRzhBSzhBTzhBVzhBWzhBYzhBZzhCAzhCCzhCDzhCFzhCGzhCHzhCIzhCKzhCLzhCMzhCNzhCOzhCRzhCUzhCVzhCWzhCXzhCYzhCZzhDEzhDJzhDKzhDMzhDOzhDZzhECzhEEzhEGzhEHzhERzhESzhETzhFIzhFJzhFKzhFMzhFOzhFRzhGAzhGBzhGDzhGEzhGFzhGGzhGHzhGIzhGLzhGMzhGNzhGPzhGQzhGRzhGSzhGTzhGUzhGWzhGYzhHKzhHMzhHNzhHRzhHTzhHUzhIDzhIEzhILzhIMzhINzhIOzhIQzhIRzhISzhITzhJEzhJMzhJOzhJPzhKEzhKGzhKHzhKIzhKMzhKNzhKPzhKRzhKWzhKYzhKZzhLAzhLBzhLCzhLIzhLKzhLRzhLSzhLTzhLUzhLVzhLYzhMAzhMCzhMDzhMEzhMFzhMGzhMHzhMKzhMLzhMMzhMNzhMOzhMPzhMQzhMRzhMSzhMTzhMUzhMVzhMWzhMXzhMYzhMZzhNAzhNCzhNEzhNFzhNGzhNIzhNLzhNOzhNPzhNRzhNUzhNZzhOMzhPAzhPEzhPFzhPGzhPHzhPKzhPLzhPMzhPNzhPRzhPSzhPTzhPWzhPYzhQAzhREzhROzhRSzhRUzhRWzhSAzhSBzhSCzhSDzhSEzhSGzhSHzhSIzhSJzhSKzhSLzhSMzhSNzhSOzhSRzhSSzhSTzhSVzhSXzhSYzhSZzhTCzhTDzhTFzhTGzhTHzhTJzhTKzhTLzhTMzhTNzhTOzhTRzhTTzhTVzhTWzhTZzhUAzhUGzhUMzhUSzhUYzhUZzhVAzhVCzhVEzhVGzhVIzhVNzhVUzhWFzhWSzhYEzhYTzhZAzhZMzhZW" + "'", str11, "ADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhATzhAUzhAWzhAXzhAZzhBAzhBBzhBDzhBEzhBFzhBGzhBHzhBIzhBJzhBLzhBMzhBNzhBOzhBQzhBRzhBSzhBTzhBVzhBWzhBYzhBZzhCAzhCCzhCDzhCFzhCGzhCHzhCIzhCKzhCLzhCMzhCNzhCOzhCRzhCUzhCVzhCWzhCXzhCYzhCZzhDEzhDJzhDKzhDMzhDOzhDZzhECzhEEzhEGzhEHzhERzhESzhETzhFIzhFJzhFKzhFMzhFOzhFRzhGAzhGBzhGDzhGEzhGFzhGGzhGHzhGIzhGLzhGMzhGNzhGPzhGQzhGRzhGSzhGTzhGUzhGWzhGYzhHKzhHMzhHNzhHRzhHTzhHUzhIDzhIEzhILzhIMzhINzhIOzhIQzhIRzhISzhITzhJEzhJMzhJOzhJPzhKEzhKGzhKHzhKIzhKMzhKNzhKPzhKRzhKWzhKYzhKZzhLAzhLBzhLCzhLIzhLKzhLRzhLSzhLTzhLUzhLVzhLYzhMAzhMCzhMDzhMEzhMFzhMGzhMHzhMKzhMLzhMMzhMNzhMOzhMPzhMQzhMRzhMSzhMTzhMUzhMVzhMWzhMXzhMYzhMZzhNAzhNCzhNEzhNFzhNGzhNIzhNLzhNOzhNPzhNRzhNUzhNZzhOMzhPAzhPEzhPFzhPGzhPHzhPKzhPLzhPMzhPNzhPRzhPSzhPTzhPWzhPYzhQAzhREzhROzhRSzhRUzhRWzhSAzhSBzhSCzhSDzhSEzhSGzhSHzhSIzhSJzhSKzhSLzhSMzhSNzhSOzhSRzhSSzhSTzhSVzhSXzhSYzhSZzhTCzhTDzhTFzhTGzhTHzhTJzhTKzhTLzhTMzhTNzhTOzhTRzhTTzhTVzhTWzhTZzhUAzhUGzhUMzhUSzhUYzhUZzhVAzhVCzhVEzhVGzhVIzhVNzhVUzhWFzhWSzhYEzhYTzhZAzhZMzhZW");
    }

    @Test
    public void test32123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32123");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder6 = builder1.setLanguage("und");
        java.util.Locale.Builder builder8 = builder6.setLanguage("");
        java.util.Locale.Builder builder9 = builder8.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder9.setLanguageTag("cor\351en (cor\351e du sud) (RA)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: core?en (core?e du sud) (RA) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "fran\347ais (Canada)" + "'", str3, "fran\347ais (Canada)");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test32124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32124");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder5 = builder4.clear();
        java.util.Locale.Builder builder7 = builder5.setLanguage("ITALIAN");
        java.util.Locale.Builder builder9 = builder7.setLanguage("FRA");
        java.util.Locale.Builder builder10 = builder7.clear();
        java.util.Locale.Builder builder13 = builder7.setExtension('F', "eNGLISCU");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder15 = builder7.setRegion("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\uc911\uad6d\uc5b4\uc911\uad6d)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: ?????????????????????????????????????????????????????? (??????) [at index 0]");
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
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test32125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32125");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.util.Locale locale1 = java.util.Locale.ENGLISH;
        java.lang.String str2 = locale1.getDisplayCountry();
        java.lang.String str3 = locale0.getDisplayVariant(locale1);
        java.lang.String str4 = locale0.getDisplayCountry();
        java.lang.String str5 = locale0.getScript();
        java.lang.Object obj6 = locale0.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "fr");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "fr");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "fr");
    }

    @Test
    public void test32126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32126");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale locale5 = java.util.Locale.GERMANY;
        java.util.Locale.Builder builder6 = builder1.setLocale(locale5);
        java.util.Set<java.lang.String> strSet7 = locale5.getUnicodeLocaleAttributes();
        java.lang.String str8 = locale5.getVariant();
        java.lang.String str9 = locale5.getScript();
        java.lang.String str10 = locale5.toString();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "fran\347ais (Canada)" + "'", str3, "fran\347ais (Canada)");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "de_DE");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "de_DE" + "'", str10, "de_DE");
    }

    @Test
    public void test32127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32127");
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
        java.util.Locale.Builder builder42 = builder0.setExtension('H', "");
        java.util.Locale.Builder builder43 = builder42.clearExtensions();
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
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder43);
    }

    @Test
    public void test32128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32128");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("...                             xxxxxxxxxxxxxxxxxxtit...                             xxxxxxxxxxxxxxxxxxx", "CHINA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...                             xxxxxxxxxxxxxxxxxxtit...                             xxxxxxxxxxxxxxxxxxx" + "'", str2, "...                             xxxxxxxxxxxxxxxxxxtit...                             xxxxxxxxxxxxxxxxxxx");
    }

    @Test
    public void test32129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32129");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("4444444FR", 80, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test32130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32130");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale locale5 = builder3.build();
        java.lang.String str6 = locale5.getISO3Country();
        java.lang.Object obj7 = locale5.clone();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "");
    }

    @Test
    public void test32131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32131");
        java.util.Locale locale1 = java.util.Locale.FRANCE;
        java.util.Locale locale2 = java.util.Locale.ITALIAN;
        java.lang.String str4 = locale2.getExtension('h');
        java.lang.String str5 = locale1.getDisplayScript(locale2);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.lowerCase("HI!       ", locale1);
        java.lang.String str7 = locale1.getDisplayLanguage();
        java.util.Set<java.lang.String> strSet8 = locale1.getUnicodeLocaleAttributes();
        java.lang.String str10 = locale1.getExtension('E');
        java.util.Locale locale11 = java.util.Locale.US;
        java.lang.String str12 = locale11.getScript();
        java.util.Set<java.lang.String> strSet13 = locale11.getUnicodeLocaleAttributes();
        java.lang.String str14 = locale11.getCountry();
        java.util.Locale.setDefault(locale11);
        java.util.Locale locale17 = java.util.Locale.ENGLISH;
        java.lang.String str18 = locale17.getDisplayLanguage();
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.upperCase("!IH", locale17);
        java.lang.String str20 = locale17.getCountry();
        java.lang.String str21 = locale17.getCountry();
        java.lang.String str22 = locale11.getDisplayLanguage(locale17);
        java.util.Set<java.lang.String> strSet23 = locale11.getUnicodeLocaleKeys();
        java.lang.String str24 = locale1.getDisplayName(locale11);
        java.lang.String str25 = locale1.getDisplayCountry();
        java.util.Set<java.lang.String> strSet26 = locale1.getUnicodeLocaleKeys();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "it");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!       " + "'", str6, "hi!       ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "francese" + "'", str7, "francese");
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "US" + "'", str14, "US");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "en");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "English" + "'", str18, "English");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "!IH" + "'", str19, "!IH");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "English" + "'", str22, "English");
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "French (France)" + "'", str24, "French (France)");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "France" + "'", str25, "France");
        org.junit.Assert.assertNotNull(strSet26);
    }

    @Test
    public void test32132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32132");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("                                                                                     German (Germany)", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=german(germany)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test32133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32133");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("deutsch");
        java.lang.String str2 = languageRange1.getRange();
        java.lang.String str3 = languageRange1.getRange();
        java.lang.String str4 = languageRange1.getRange();
        double double5 = languageRange1.getWeight();
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("e                               ", "                                                                                                        ");
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray9, 'H');
        java.lang.String[] strArray15 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\\xtalxan_ITALIAN_Englxsh", "Englisch", 104);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                          \\u0046", strArray9, strArray15);
        boolean boolean17 = languageRange1.equals((java.lang.Object) "                          \\u0046");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "deutsch" + "'", str2, "deutsch");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "deutsch" + "'", str3, "deutsch");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "deutsch" + "'", str4, "deutsch");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "e                               " + "'", str11, "e                               ");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "                          \\u0046" + "'", str16, "                          \\u0046");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test32134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32134");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("TALIAN_italian_eNGLISHITAL");
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("anglais (Canada)CHINESE", strArray3);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("\uc5b4\uc77c\ub3c5", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test32135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32135");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("                                             hcsfr-CueD                                         ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hcsfr-CueD                                         ..." + "'", str1, "hcsfr-CueD                                         ...");
    }

    @Test
    public void test32136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32136");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("dI!        (\\u0020,iTALICNIUEd#########################################################################################", 223, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaadI!        (\\u0020,iTALICNIUEd#########################################################################################aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaadI!        (\\u0020,iTALICNIUEd#########################################################################################aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test32137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32137");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "\351K44444444444444444444444444444444!", (java.lang.CharSequence) "                                                                                                                   \\u0038zho                                                                                                                                            ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 264 + "'", int2 == 264);
    }

    @Test
    public void test32138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32138");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "United State", "fRANZ\326SISCH (kANADA)fRANZ\326S                                                                 fRANZ\326SISCH (kANADA)fRANZ\326SI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test32139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32139");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("Italian");
        java.util.Locale.Builder builder4 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder0.clear();
        java.util.Locale.Builder builder7 = builder0.setVariant("CANADA");
        java.util.Locale.Builder builder9 = new java.util.Locale.Builder();
        java.util.Locale locale10 = builder9.build();
        java.util.Locale locale12 = java.util.Locale.forLanguageTag("Italian");
        java.lang.String str13 = locale10.getDisplayLanguage(locale12);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.upperCase("", locale12);
        java.lang.String str15 = locale12.getScript();
        java.util.Set<java.lang.String> strSet16 = locale12.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.String> strSet17 = locale12.getUnicodeLocaleKeys();
        java.util.Locale.Builder builder18 = builder7.setLocale(locale12);
        java.lang.String str19 = locale12.getDisplayName();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
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
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "italian" + "'", str19, "italian");
    }

    @Test
    public void test32140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32140");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("cCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC\\u00de\\u00CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC", 'b');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test32141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32141");
        java.lang.CharSequence charSequence4 = null;
        char[] charArray15 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray15);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "iTALIAN", charArray15);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "it", charArray15);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "italian_ITALIAN_English", charArray15);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(charSequence4, charArray15);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\\u0020iItalian\\u008600u\\U\\u0020iItalian\\u0020iUanglaisUFRZ\326CZ(FRKREC)Uitalian    U                                                                                                      U!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IUzhzhzhzhzhzhzhzhzhzhFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAzhzhzhzhzhzhzhzhzhzhUFRZ\326CZ(FRKREC)Ucinese (Cina)\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hhU         ITALIAN_ITALIAN_ENGLISH         ITALIAN_!IHITTAIT_ITALIAN_EGAISHU                                      ...", charArray15);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "    ZH_CN    South Korea", charArray15);
        int int23 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "         0         ", charArray15);
        boolean boolean24 = org.apache.commons.lang3.StringUtils.containsAny("cines", charArray15);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "4##a a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "4##a a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[4, #, #, a,  , a]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 9 + "'", int21 == 9);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test32142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32142");
        java.util.Locale locale1 = new java.util.Locale("\\u005c");
        java.util.Locale locale3 = java.util.Locale.CHINESE;
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.lowerCase("Franz\366sisch (Frankreich)", locale3);
        java.lang.String str5 = locale3.getVariant();
        java.lang.String str6 = locale1.getDisplayScript(locale3);
        java.lang.String str7 = locale3.getVariant();
        java.lang.String str8 = locale3.getISO3Country();
        java.util.Set<java.lang.String> strSet9 = locale3.getUnicodeLocaleAttributes();
        org.junit.Assert.assertEquals(locale1.toString(), "\\u005c");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "franz\366sisch (frankreich)" + "'", str4, "franz\366sisch (frankreich)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strSet9);
    }

    @Test
    public void test32143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32143");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("######################################################################################################################", "44444444444444444444444444444444IHaaaaaaaaaaaaaaaaaaaaaaaaFranz\366sisch (Frankreich)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "######################################################################################################################" + "'", str2, "######################################################################################################################");
    }

    @Test
    public void test32144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32144");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDKorean (Souti\\u0020iTALIANiTALIANiTALIANiTALIitBBBBBBBBB\\BBBBB Korea)...", "frz\366cz(frkrec)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDKorean (Souti\\u0020iTALIANiTALIANiTALIANiTALIitBBBBBBBBB\\BBBBB Korea)..." + "'", str2, "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDKorean (Souti\\u0020iTALIANiTALIANiTALIANiTALIitBBBBBBBBB\\BBBBB Korea)...");
    }

    @Test
    public void test32145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32145");
        java.util.Locale locale3 = new java.util.Locale("FRA\326SIS\n(FRAKREI)", "bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbFRANZ\326SISCH (FRANKREICH)", "                   nailati                               ");
        org.junit.Assert.assertEquals(locale3.toString(), "fra\326sis\n(frakrei)_BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBFRANZ\326SISCH (FRANKREICH)_                   nailati                               ");
    }

    @Test
    public void test32146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32146");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("Nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnhi!nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn", "AhzRAhzQAhzOAhzNAh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnhi!nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn" + "'", str2, "Nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnhi!nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn");
    }

    @Test
    public void test32147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32147");
        java.util.Locale locale1 = new java.util.Locale("royaume-uni");
        java.lang.String str2 = locale1.getDisplayName();
        java.lang.String str3 = locale1.getVariant();
        java.util.Locale.LanguageRange[] languageRangeArray4 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList5 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList5, languageRangeArray4);
        java.util.Locale.LanguageRange[] languageRangeArray7 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList8 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList8, languageRangeArray7);
        java.lang.String[] strArray12 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        java.util.Locale.FilteringMode filteringMode15 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList16 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList8, (java.util.Collection<java.lang.String>) strList13, filteringMode15);
        java.util.Locale.FilteringMode filteringMode17 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList18 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList5, (java.util.Collection<java.lang.String>) strList13, filteringMode17);
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
        java.util.Locale.LanguageRange[] languageRangeArray34 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList35 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList35, languageRangeArray34);
        java.lang.String[] strArray39 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList40 = new java.util.ArrayList<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList40, strArray39);
        java.util.Locale.FilteringMode filteringMode42 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList43 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList35, (java.util.Collection<java.lang.String>) strList40, filteringMode42);
        java.lang.String[] strArray45 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList46 = new java.util.ArrayList<java.lang.String>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList46, strArray45);
        java.util.List<java.lang.String> strList48 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList35, (java.util.Collection<java.lang.String>) strList46);
        java.util.List<java.lang.String> strList49 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList20, (java.util.Collection<java.lang.String>) strList46);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap50 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList51 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList20, strMap50);
        java.lang.String[] strArray81 = new java.lang.String[] { "FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA", "h", "\\u0066", "franz\366sisch (frankreich)", "ian\\u0020i", "zh", "\\U0020", "Chinesisch (China)", "allemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemand", "English", "itTAiT_ITALIAN_EgAish", "FRA", "!IH", "Englisch", "\\u0020iTALIANiTALIANiTALIANiTALI\\u0020iTALIANiTALIANiTALIANiTAL", "deutsch", "\\u0020iItalian\\u0020i", "\\u0020iItalian\\u0020i", "frankreich", "       !IH", "AD4AE4AF4AG4AI4AL4AM4AN4AO4AQ4AR4AS4AT4AU4AW4AX4AZ4BA4BB4BD4BE4BF4BG4BH4BI4BJ4BL4BM4BN4BO4BQ4BR4BS4BT4BV4BW4BY4BZ4CA4CC4CD4CF4CG4CH4CI4CK4CL4CM4CN4CO4CR4CU4CV4CW4CX4CY4CZ4DE4DJ4DK4DM4DO4DZ4EC4EE4EG4EH4ER4ES4ET4FI4FJ4FK4FM4FO4FR4GA4GB4GD4GE4GF4GG4GH4GI4GL4GM4GN4GP4GQ4GR4GS4GT4GU4GW4GY4HK4HM4HN4HR4HT4HU4ID4IE4IL4IM4IN4IO4IQ4IR4IS4IT4JE4JM4JO4JP4KE4KG4KH4KI4KM4KN4KP4KR4KW4KY4KZ4LA4LB4LC4LI4LK4LR4LS4LT4LU4LV4LY4MA4MC4MD4ME4MF4MG4MH4MK4ML4MM4MN4MO4MP4MQ4MR4MS4MT4MU4MV4MW4MX4MY4MZ4NA4NC4NE4NF4NG4NI4NL4NO4NP4NR4NU4NZ4OM4PA4PE4PF4PG4PH4PK4PL4PM4PN4PR4PS4PT4PW4PY4QA4RE4RO4RS4RU4RW4SA4SB4SC4SD4SE4SG4SH4SI4SJ4SK4SL4SM4SN4SO4SR4SS4ST4SV4SX4SY4SZ4TC4TD4TF4TG4TH4TJ4TK4TL4TM4TN4TO4TR4TT4TV4TW4TZ4UA4UG4UM4US4UY4UZ4VA4VC4VE4VG4VI4VN4VU4WF4WS4YE4YT4ZA4ZM4ZW", "ADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhATzhAUzhAWzhAXzhAZzhBAzhBBzhBDzhBEzhBFzhBGzhBHzhBIzhBJzhBLzhBMzhBNzhBOzhBQzhBRzhBSzhBTzhBVzhBWzhBYzhBZzhCAzhCCzhCDzhCFzhCGzhCHzhCIzhCKzhCLzhCMzhCNzhCOzhCRzhCUzhCVzhCWzhCXzhCYzhCZzhDEzhDJzhDKzhDMzhDOzhDZzhECzhEEzhEGzhEHzhERzhESzhETzhFIzhFJzhFKzhFMzhFOzhFRzhGAzhGBzhGDzhGEzhGFzhGGzhGHzhGIzhGLzhGMzhGNzhGPzhGQzhGRzhGSzhGTzhGUzhGWzhGYzhHKzhHMzhHNzhHRzhHTzhHUzhIDzhIEzhILzhIMzhINzhIOzhIQzhIRzhISzhITzhJEzhJMzhJOzhJPzhKEzhKGzhKHzhKIzhKMzhKNzhKPzhKRzhKWzhKYzhKZzhLAzhLBzhLCzhLIzhLKzhLRzhLSzhLTzhLUzhLVzhLYzhMAzhMCzhMDzhMEzhMFzhMGzhMHzhMKzhMLzhMMzhMNzhMOzhMPzhMQzhMRzhMSzhMTzhMUzhMVzhMWzhMXzhMYzhMZzhNAzhNCzhNEzhNFzhNGzhNIzhNLzhNOzhNPzhNRzhNUzhNZzhOMzhPAzhPEzhPFzhPGzhPHzhPKzhPLzhPMzhPNzhPRzhPSzhPTzhPWzhPYzhQAzhREzhROzhRSzhRUzhRWzhSAzhSBzhSCzhSDzhSEzhSGzhSHzhSIzhSJzhSKzhSLzhSMzhSNzhSOzhSRzhSSzhSTzhSVzhSXzhSYzhSZzhTCzhTDzhTFzhTGzhTHzhTJzhTKzhTLzhTMzhTNzhTOzhTRzhTTzhTVzhTWzhTZzhUAzhUGzhUMzhUSzhUYzhUZzhVAzhVCzhVEzhVGzhVIzhVNzhVUzhWFzhWSzhYEzhYTzhZAzhZMzhZW", "4", "    \\     ", "ian\\u0020i", "CAN", "ENGLISCH", "zh_CN", "\r" };
        java.util.ArrayList<java.lang.String> strList82 = new java.util.ArrayList<java.lang.String>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList82, strArray81);
        java.lang.String str84 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList20, (java.util.Collection<java.lang.String>) strList82);
        java.util.Locale.FilteringMode filteringMode85 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList86 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList5, (java.util.Collection<java.lang.String>) strList82, filteringMode85);
        boolean boolean87 = locale1.equals((java.lang.Object) languageRangeList5);
        org.junit.Assert.assertEquals(locale1.toString(), "royaume-uni");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "royaume-uni" + "'", str2, "royaume-uni");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(languageRangeArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(languageRangeArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + filteringMode15 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode15.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertTrue("'" + filteringMode17 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode17.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
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
        org.junit.Assert.assertNotNull(languageRangeArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + filteringMode42 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode42.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList43);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(strList48);
        org.junit.Assert.assertNotNull(strList49);
        org.junit.Assert.assertNotNull(languageRangeList51);
        org.junit.Assert.assertNotNull(strArray81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNull(str84);
        org.junit.Assert.assertTrue("'" + filteringMode85 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode85.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList86);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
    }

    @Test
    public void test32148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32148");
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
        java.lang.String str12 = locale1.getVariant();
        org.junit.Assert.assertEquals(locale1.toString(), "\\u0068");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "allemand" + "'", str4, "allemand");
        org.junit.Assert.assertTrue("'" + category5 + "' != '" + java.util.Locale.Category.FORMAT + "'", category5.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr_CA");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "CA" + "'", str10, "CA");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test32149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32149");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("                                 44444444444444444444444444444444                                             hcstued                                            ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444444444                                             hcstued" + "'", str1, "44444444444444444444444444444444                                             hcstued");
    }

    @Test
    public void test32150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32150");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("Hgerman (germany)!       ", "\u82f1\u56fd");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test32151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32151");
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
        java.util.Locale locale29 = new java.util.Locale("\\u0020iTALIANiTALIANiTALIANiTALI\\u0020iTALIANiTALIANiTALIANiTAL");
        java.lang.String str30 = locale29.getScript();
        java.lang.String str31 = locale9.getDisplayCountry(locale29);
        java.util.Locale.Builder builder32 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder33 = builder32.clearExtensions();
        java.util.Locale.Builder builder35 = builder32.setLanguageTag("Italian");
        java.util.Locale locale36 = java.util.Locale.PRC;
        java.lang.String str37 = locale36.getDisplayName();
        java.util.Locale.Builder builder38 = builder32.setLocale(locale36);
        java.lang.String str39 = locale36.getISO3Language();
        java.lang.String str40 = locale36.getScript();
        java.lang.String str41 = locale29.getDisplayScript(locale36);
        java.lang.String str42 = locale29.getVariant();
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
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(charSet26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "fran\347ais" + "'", str27, "fran\347ais");
        org.junit.Assert.assertEquals(locale29.toString(), "\\u0020italianitalianitalianitali\\u0020italianitalianitalianital");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Chinese (China)" + "'", str37, "Chinese (China)");
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "zho" + "'", str39, "zho");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
    }

    @Test
    public void test32152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32152");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.ITALIAN;
        java.lang.String str2 = locale1.getDisplayLanguage();
        java.util.Locale locale3 = locale1.stripExtensions();
        java.util.Locale.setDefault(category0, locale1);
        java.util.Locale locale8 = new java.util.Locale("44444444444444444444444444444444!IH", "HHHHHHHHHH", "8ian\\u0020i86");
        java.util.Locale locale9 = java.util.Locale.ITALIAN;
        java.lang.String str10 = locale9.getDisplayLanguage();
        java.util.Locale locale11 = java.util.Locale.ITALIAN;
        java.lang.String str13 = locale11.getExtension('h');
        java.lang.String str14 = locale9.getDisplayCountry(locale11);
        java.lang.String str15 = locale11.toLanguageTag();
        java.lang.String str16 = locale8.getDisplayCountry(locale11);
        java.util.Locale locale17 = java.util.Locale.GERMANY;
        java.util.Locale locale18 = locale17.stripExtensions();
        java.lang.String str19 = locale17.getISO3Language();
        java.lang.String str20 = locale11.getDisplayScript(locale17);
        java.lang.String str21 = locale1.getDisplayScript(locale11);
        java.lang.String str22 = locale11.getCountry();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Italian" + "'", str2, "Italian");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "it");
        org.junit.Assert.assertEquals(locale8.toString(), "44444444444444444444444444444444!ih_HHHHHHHHHH_8ian\\u0020i86");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "it");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "italiano" + "'", str10, "italiano");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "it");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "it" + "'", str15, "it");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HHHHHHHHHH" + "'", str16, "HHHHHHHHHH");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "deu" + "'", str19, "deu");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test32153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32153");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "\u7fa9\u5927\u5229\u6587          ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test32154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32154");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("             \\u0049             ", "ADA\\A\\AGA0A5AMANAOAQARASA6A0AWAXAZBABBBDB\\B\\BGBHB0BJB5BMBNBOBQBRBSB6BVBWBYBZCACCCDC\\CGCHC0CKC5CMCNCOCRC0CVCWCXCYCZD\\D\\...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "             \\u0049             " + "'", str2, "             \\u0049             ");
    }

    @Test
    public void test32155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32155");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("Etats-Unis", "zhAzhzhzhzhzhzhzhzhzh", "fr", 40);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Etats-Unis" + "'", str4, "Etats-Unis");
    }

    @Test
    public void test32156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32156");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.lang.String str1 = locale0.getDisplayName();
        java.lang.String str3 = locale0.getExtension('C');
        java.lang.String str4 = locale0.getVariant();
        java.util.Locale locale5 = java.util.Locale.CHINESE;
        java.util.Locale locale6 = java.util.Locale.FRENCH;
        java.lang.String str7 = locale6.getDisplayName();
        java.lang.String str9 = locale6.getExtension('C');
        java.lang.String str10 = locale5.getDisplayLanguage(locale6);
        java.lang.String str11 = locale6.getISO3Country();
        java.lang.String str13 = locale6.getExtension('z');
        java.lang.String str14 = locale0.getDisplayVariant(locale6);
        java.util.Locale locale16 = new java.util.Locale("");
        java.util.Locale.setDefault(locale16);
        java.util.Set<java.lang.Character> charSet18 = locale16.getExtensionKeys();
        java.util.Locale locale20 = new java.util.Locale("TA...");
        java.lang.String str21 = locale16.getDisplayCountry(locale20);
        java.lang.String str22 = locale20.getDisplayScript();
        java.util.Locale locale23 = java.util.Locale.ENGLISH;
        java.util.Set<java.lang.String> strSet24 = locale23.getUnicodeLocaleAttributes();
        java.lang.String str25 = locale20.getDisplayVariant(locale23);
        java.util.Locale locale26 = java.util.Locale.UK;
        java.util.Locale.Category category27 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale28 = java.util.Locale.getDefault(category27);
        java.util.Locale locale29 = java.util.Locale.GERMAN;
        java.util.Locale locale30 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str31 = locale29.getDisplayName(locale30);
        java.util.Locale.setDefault(category27, locale30);
        java.util.Set<java.lang.String> strSet33 = locale30.getUnicodeLocaleKeys();
        java.lang.String str34 = locale26.getDisplayVariant(locale30);
        java.lang.String str35 = locale26.getCountry();
        java.lang.String str36 = locale23.getDisplayScript(locale26);
        java.lang.String str37 = locale6.getDisplayLanguage(locale23);
        java.util.Locale locale38 = java.util.Locale.FRANCE;
        java.util.Locale locale39 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str40 = locale38.getDisplayScript(locale39);
        java.util.Locale locale41 = java.util.Locale.FRANCE;
        java.util.Locale locale42 = java.util.Locale.ITALIAN;
        java.lang.String str44 = locale42.getExtension('h');
        java.lang.String str45 = locale41.getDisplayScript(locale42);
        java.lang.String str46 = locale41.getISO3Country();
        java.lang.String str47 = locale39.getDisplayVariant(locale41);
        java.lang.String str48 = locale41.getDisplayCountry();
        boolean boolean49 = locale23.equals((java.lang.Object) locale41);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "francese" + "'", str1, "francese");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "francese" + "'", str7, "francese");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chinois" + "'", str10, "chinois");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals(locale16.toString(), "");
        org.junit.Assert.assertNotNull(charSet18);
        org.junit.Assert.assertEquals(locale20.toString(), "ta...");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "en");
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "en_GB");
        org.junit.Assert.assertTrue("'" + category27 + "' != '" + java.util.Locale.Category.FORMAT + "'", category27.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "de");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "allemand" + "'", str31, "allemand");
        org.junit.Assert.assertNotNull(strSet33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "GB" + "'", str35, "GB");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "French" + "'", str37, "French");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "it");
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "FRA" + "'", str46, "FRA");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "France" + "'", str48, "France");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test32157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32157");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder6 = builder1.setLanguage("und");
        java.util.Locale locale7 = builder6.build();
        java.util.Locale locale8 = builder6.build();
        java.util.Locale.Builder builder9 = builder6.clearExtensions();
        java.util.Locale.Builder builder10 = builder9.clearExtensions();
        java.util.Locale.Builder builder12 = builder9.setLanguageTag("Etats-Unis");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder14 = builder9.setLanguage("EFrankreichgFrankreichFrankreichs");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: EFrankreichgFrankreichFrankreichs [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test32158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32158");
        java.util.Locale.Category category1 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale2 = java.util.Locale.getDefault(category1);
        java.util.Locale locale3 = java.util.Locale.GERMAN;
        java.util.Locale locale4 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str5 = locale3.getDisplayName(locale4);
        java.util.Locale.setDefault(category1, locale4);
        java.util.Locale locale9 = new java.util.Locale("\\u0020iTALIANiTALIANiTALIANiTALI\\u0020iTALIANiTALIANiTALIANiTAL", "allemand");
        java.util.Locale.setDefault(category1, locale9);
        java.util.Locale locale11 = java.util.Locale.getDefault(category1);
        java.util.Locale locale12 = java.util.Locale.GERMAN;
        java.util.Locale locale13 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str14 = locale12.getDisplayName(locale13);
        java.util.Locale.setDefault(locale13);
        java.util.Locale.setDefault(category1, locale13);
        java.util.Locale locale17 = java.util.Locale.CHINESE;
        java.util.Locale locale18 = java.util.Locale.FRENCH;
        java.lang.String str19 = locale18.getDisplayName();
        java.lang.String str21 = locale18.getExtension('C');
        java.lang.String str22 = locale17.getDisplayLanguage(locale18);
        java.lang.String str23 = locale17.getScript();
        java.util.Locale.setDefault(category1, locale17);
        java.util.Locale locale25 = java.util.Locale.getDefault(category1);
        java.util.Locale locale26 = java.util.Locale.getDefault(category1);
        java.lang.String str27 = org.apache.commons.lang3.StringUtils.lowerCase("                                                          4444allemand4444", locale26);
        org.junit.Assert.assertTrue("'" + category1 + "' != '" + java.util.Locale.Category.FORMAT + "'", category1.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "de");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "allemand" + "'", str5, "allemand");
        org.junit.Assert.assertEquals(locale9.toString(), "\\u0020italianitalianitalianitali\\u0020italianitalianitalianital_ALLEMAND");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "\\u0020italianitalianitalianitali\\u0020italianitalianitalianital_ALLEMAND");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "de");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "allemand" + "'", str14, "allemand");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "zh");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "fran\347ais" + "'", str19, "fran\347ais");
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "chinois" + "'", str22, "chinois");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "zh");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "                                                          4444allemand4444" + "'", str27, "                                                          4444allemand4444");
    }

    @Test
    public void test32159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32159");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("44444444444", (int) 'h', 29);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test32160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32160");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("itFranz\366sischTAFranz\366sischiFranz\366sischTFranz\366sisch_Franz\366sischITA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "itFranz\366sischTAFranz\366sischiFranz\366sischTFranz\366sisch_Franz\366sischITA" + "'", str1, "itFranz\366sischTAFranz\366sischiFranz\366sischTFranz\366sisch_Franz\366sischITA");
    }

    @Test
    public void test32161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32161");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "xxxxxxxxxxxxxxxxxxxx");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "xxxxxxxxxxxxxxxxxxxx" + "'", str1, "xxxxxxxxxxxxxxxxxxxx");
    }

    @Test
    public void test32162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32162");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!zH_CN", "Franz\366sisch (Kanada)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!zH_CN" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!zH_CN");
    }

    @Test
    public void test32163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32163");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "iiiiiiiiiiiFrankreichNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test32164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32164");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("zhzhzhzhzhzhzhzhzhzhFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAzhzhzhzhzhzhzemand", "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\aUa0046");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test32165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32165");
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
        java.util.Locale.Builder builder20 = builder0.setLanguage("en");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder22 = builder20.setLanguageTag("");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Empty subtag [at index 0]");
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
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "de_DE");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
    }

    @Test
    public void test32166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32166");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = java.util.Locale.UK;
        java.util.Locale.Builder builder3 = builder0.setLocale(locale2);
        java.util.Locale locale5 = java.util.Locale.forLanguageTag("\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITAL");
        java.util.Locale.Builder builder6 = builder0.setLocale(locale5);
        java.util.Locale.Category category7 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale8 = java.util.Locale.getDefault(category7);
        java.util.Locale locale9 = java.util.Locale.FRANCE;
        java.util.Locale locale10 = java.util.Locale.ITALIAN;
        java.lang.String str12 = locale10.getExtension('h');
        java.lang.String str13 = locale9.getDisplayScript(locale10);
        java.lang.String str14 = locale9.getISO3Country();
        java.util.Locale locale15 = java.util.Locale.GERMAN;
        java.util.Locale.setDefault(locale15);
        java.lang.String str17 = locale9.getDisplayName(locale15);
        java.lang.String str18 = locale9.getScript();
        java.util.Locale.setDefault(category7, locale9);
        java.util.Locale locale20 = java.util.Locale.getDefault(category7);
        java.util.Locale locale21 = java.util.Locale.getDefault(category7);
        java.util.Locale.Category category22 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale23 = java.util.Locale.getDefault(category22);
        java.util.Locale locale24 = java.util.Locale.GERMAN;
        java.util.Locale locale25 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str26 = locale24.getDisplayName(locale25);
        java.util.Locale.setDefault(category22, locale25);
        java.util.Locale locale30 = new java.util.Locale("\\u0020iTALIANiTALIANiTALIANiTALI\\u0020iTALIANiTALIANiTALIANiTAL", "allemand");
        java.util.Locale.setDefault(category22, locale30);
        java.util.Locale locale32 = java.util.Locale.getDefault(category22);
        java.util.Locale locale34 = new java.util.Locale("en");
        java.lang.String str35 = locale32.getDisplayCountry(locale34);
        java.util.Set<java.lang.Character> charSet36 = locale34.getExtensionKeys();
        java.util.Locale.setDefault(category7, locale34);
        java.lang.String str38 = locale5.getDisplayLanguage(locale34);
        boolean boolean39 = locale5.hasExtensions();
        java.util.Locale locale41 = java.util.Locale.ENGLISH;
        java.lang.String str42 = locale41.getDisplayLanguage();
        java.util.Locale locale43 = locale41.stripExtensions();
        java.lang.String str44 = org.apache.commons.lang3.StringUtils.upperCase("ko", locale43);
        java.lang.String str45 = locale43.toLanguageTag();
        java.lang.String str46 = locale5.getDisplayCountry(locale43);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en_GB");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertTrue("'" + category7 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category7.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr_CA");
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
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "fr_FR");
        org.junit.Assert.assertTrue("'" + category22 + "' != '" + java.util.Locale.Category.FORMAT + "'", category22.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "de");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "de");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "allemand" + "'", str26, "allemand");
        org.junit.Assert.assertEquals(locale30.toString(), "\\u0020italianitalianitalianitali\\u0020italianitalianitalianital_ALLEMAND");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "\\u0020italianitalianitalianitali\\u0020italianitalianitalianital_ALLEMAND");
        org.junit.Assert.assertEquals(locale34.toString(), "en");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "ALLEMAND" + "'", str35, "ALLEMAND");
        org.junit.Assert.assertNotNull(charSet36);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "en");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "English" + "'", str42, "English");
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "en");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "KO" + "'", str44, "KO");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "en" + "'", str45, "en");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
    }

    @Test
    public void test32167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32167");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("U005C", 43, 872);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test32168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32168");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("                                                 ", "und-RA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test32169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32169");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("rrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrefrankreichgfrankreichfrankreichsrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrefrankrecinese (cina)\\u0069h...rrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrefrankreichgfrankreichfrankreichsrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrefrankrei");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=rrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrefrankreichgfrankreichfrankreichsrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrefrankrecinese (cina)\\u0069h...rrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrefrankreichgfrankreichfrankreichsrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrefrankrei");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test32170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32170");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("talian_ITALIAN_English         ital", "francesefrancesefrancesefr\\u0075");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "talian_ITALIAN_English         ital" + "'", str2, "talian_ITALIAN_English         ital");
    }

    @Test
    public void test32171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32171");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'a', 74);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 74 + "'", int2 == 74);
    }

    @Test
    public void test32172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32172");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("                                               ##########                                               ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "##########" + "'", str1, "##########");
    }

    @Test
    public void test32173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32173");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("chinois", "iTALIAN                                                                 ");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "anglais (Royaume-Uni)", 100, 56);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, 'l', 100, 55);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '!', 34, (int) 'S');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 34");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test32174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32174");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "und-CA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test32175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32175");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.FRANCE;
        java.util.Locale locale3 = java.util.Locale.ITALIAN;
        java.lang.String str5 = locale3.getExtension('h');
        java.lang.String str6 = locale2.getDisplayScript(locale3);
        java.util.Locale locale7 = locale2.stripExtensions();
        java.util.Locale.setDefault(category0, locale2);
        java.util.Locale.Builder builder10 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder11 = builder10.clear();
        java.util.Locale locale12 = java.util.Locale.UK;
        java.util.Locale.Builder builder13 = builder10.setLocale(locale12);
        java.util.Locale.Builder builder14 = builder13.clearExtensions();
        java.util.Locale.Builder builder15 = new java.util.Locale.Builder();
        java.util.Locale locale16 = builder15.build();
        java.lang.String str17 = locale16.getDisplayCountry();
        java.util.Locale.Builder builder18 = builder13.setLocale(locale16);
        java.util.Locale.Builder builder19 = builder13.clear();
        java.util.Locale locale21 = new java.util.Locale("it");
        java.util.Locale.Builder builder22 = new java.util.Locale.Builder();
        java.util.Locale locale23 = builder22.build();
        java.util.Locale locale24 = java.util.Locale.FRENCH;
        java.util.Locale locale25 = java.util.Locale.ENGLISH;
        java.lang.String str26 = locale25.getDisplayCountry();
        java.lang.String str27 = locale24.getDisplayVariant(locale25);
        java.lang.String str28 = locale24.getDisplayCountry();
        java.lang.String str29 = locale24.getScript();
        java.lang.String str30 = locale24.getScript();
        java.util.Locale locale31 = java.util.Locale.FRENCH;
        java.util.Locale locale32 = java.util.Locale.ENGLISH;
        java.lang.String str33 = locale32.getDisplayCountry();
        java.lang.String str34 = locale31.getDisplayVariant(locale32);
        java.lang.String str35 = locale31.getDisplayCountry();
        java.lang.String str36 = locale31.getScript();
        java.lang.String str37 = locale31.getScript();
        java.lang.String str38 = locale24.getDisplayCountry(locale31);
        java.lang.String str39 = locale23.getDisplayVariant(locale31);
        java.util.Locale locale41 = java.util.Locale.ENGLISH;
        java.lang.String str42 = locale41.getDisplayLanguage();
        java.lang.String str43 = org.apache.commons.lang3.StringUtils.upperCase("!IH", locale41);
        java.lang.String str44 = locale41.getCountry();
        java.lang.String str45 = locale41.getCountry();
        java.lang.String str46 = locale31.getDisplayCountry(locale41);
        java.util.Locale locale50 = new java.util.Locale("HI!       ", "\\U0020", "Italienisch#########################################################################################");
        java.util.Locale locale51 = locale50.stripExtensions();
        java.lang.String str52 = locale41.getDisplayCountry(locale51);
        java.lang.String str53 = locale21.getDisplayScript(locale51);
        java.lang.String str54 = locale21.getDisplayName();
        java.util.Locale.Builder builder55 = builder19.setLocale(locale21);
        java.lang.String str56 = locale21.getISO3Country();
        java.lang.String str57 = org.apache.commons.lang3.StringUtils.lowerCase("ALLEMAND", locale21);
        java.util.Locale.setDefault(category0, locale21);
        java.util.Locale locale59 = java.util.Locale.CHINESE;
        java.util.Locale locale60 = java.util.Locale.FRENCH;
        java.lang.String str61 = locale60.getDisplayName();
        java.lang.String str63 = locale60.getExtension('C');
        java.lang.String str64 = locale59.getDisplayLanguage(locale60);
        java.util.Locale locale65 = java.util.Locale.JAPANESE;
        java.util.Locale locale67 = java.util.Locale.forLanguageTag("Deutsch");
        java.util.Locale.setDefault(locale67);
        java.lang.String str69 = locale65.getDisplayCountry(locale67);
        java.lang.String str70 = locale65.getVariant();
        java.lang.String str71 = locale59.getDisplayScript(locale65);
        java.util.Locale.setDefault(category0, locale65);
        java.util.Locale locale73 = java.util.Locale.getDefault(category0);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "\\u0020italianitalianitalianitali\\u0020italianitalianitalianital_ALLEMAND");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "it");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_GB");
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertEquals(locale21.toString(), "it");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "fr");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "en");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "fr");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "en");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "en");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "English" + "'", str42, "English");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "!IH" + "'", str43, "!IH");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals(locale50.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "Italian" + "'", str54, "Italian");
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "allemand" + "'", str57, "allemand");
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "zh");
        org.junit.Assert.assertNotNull(locale60);
        org.junit.Assert.assertEquals(locale60.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "French" + "'", str61, "French");
        org.junit.Assert.assertNull(str63);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "chinois" + "'", str64, "chinois");
        org.junit.Assert.assertNotNull(locale65);
        org.junit.Assert.assertEquals(locale65.toString(), "ja");
        org.junit.Assert.assertNotNull(locale67);
        org.junit.Assert.assertEquals(locale67.toString(), "deutsch");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertNotNull(locale73);
        org.junit.Assert.assertEquals(locale73.toString(), "ja");
    }

    @Test
    public void test32176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32176");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("\ub3c5\uc77c\uc5b4Italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian", 18, 328);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ub3c5\uc77c\uc5b4Italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian" + "'", str3, "\ub3c5\uc77c\uc5b4Italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian");
    }

    @Test
    public void test32177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32177");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rfr-CA\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r", 'u');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "Franz\366sisch(Frankreich)", 99, (int) 'I');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rfr-CA\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r" + "'", str7, "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rfr-CA\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r");
    }

    @Test
    public void test32178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32178");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDh...");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test32179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32179");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("Korean (South Kor", "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\u0043\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r", "                 francesefrancesefrancesefr\\u0075                  ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Korean (South Kor" + "'", str3, "Korean (South Kor");
    }

    @Test
    public void test32180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32180");
        java.util.Locale locale2 = new java.util.Locale("                                     fran\347ais (France)                                      ", "Chinese (China");
        java.lang.String str3 = locale2.getLanguage();
        java.util.Set<java.lang.Character> charSet4 = locale2.getExtensionKeys();
        org.junit.Assert.assertEquals(locale2.toString(), "                                     fran\347ais (france)                                      _CHINESE (CHINA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                     fran\347ais (france)                                      " + "'", str3, "                                     fran\347ais (france)                                      ");
        org.junit.Assert.assertNotNull(charSet4);
    }

    @Test
    public void test32181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32181");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("aEEEEEEEEEEEEE)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aEEEEEEEEEEEEE)" + "'", str1, "aEEEEEEEEEEEEE)");
    }

    @Test
    public void test32182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32182");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "\\u0061");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test32183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32183");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("-RFCFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF", "hhcsineilatihhcsineilatihhcsineilatihhcsineilatihhcsineilatihhcsine...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-RFCFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF" + "'", str2, "-RFCFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF");
    }

    @Test
    public void test32184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32184");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("u0034\\u00                                             hcstuD                                             \\u0034\\u00", 1, 'G');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "u0034\\u00                                             hcstuD                                             \\u0034\\u00" + "'", str3, "u0034\\u00                                             hcstuD                                             \\u0034\\u00");
    }

    @Test
    public void test32185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32185");
        java.util.Locale locale1 = new java.util.Locale("hi!       ");
        java.lang.String str2 = locale1.getDisplayScript();
        boolean boolean3 = locale1.hasExtensions();
        java.util.Locale locale4 = java.util.Locale.ROOT;
        java.lang.String str5 = locale4.getISO3Country();
        java.lang.String str6 = locale4.getDisplayVariant();
        java.lang.String str7 = locale4.getDisplayVariant();
        java.lang.String str8 = locale4.getDisplayName();
        java.util.Set<java.lang.String> strSet9 = locale4.getUnicodeLocaleKeys();
        java.util.Locale locale11 = java.util.Locale.forLanguageTag("\\u0020");
        java.lang.String str12 = locale11.getDisplayScript();
        java.lang.String str13 = locale4.getDisplayVariant(locale11);
        java.lang.String str14 = locale4.getDisplayVariant();
        java.lang.String str15 = locale1.getDisplayName(locale4);
        org.junit.Assert.assertEquals(locale1.toString(), "hi!       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!       " + "'", str15, "hi!       ");
    }

    @Test
    public void test32186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32186");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("fr-cafr-cafr-cafr-cafr-cafr-cafr-cafr-cafr-cafr-cafr-cafr\\u000dfr-cafr-cafr-cafr-cafr-cafr-cafr-cafr-cafr-cafr-cafr-cafr", "\\U0049", 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "fr-cafr-cafr-cafr-cafr-cafr-cafr-cafr-cafr-cafr-cafr-cafr\\u000dfr-cafr-cafr-cafr-cafr-cafr-cafr-cafr-cafr-cafr-cafr-cafr" + "'", str3, "fr-cafr-cafr-cafr-cafr-cafr-cafr-cafr-cafr-cafr-cafr-cafr\\u000dfr-cafr-cafr-cafr-cafr-cafr-cafr-cafr-cafr-cafr-cafr-cafr");
    }

    @Test
    public void test32187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32187");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiAlphaLower('1');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test32188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32188");
        java.util.Locale locale2 = new java.util.Locale("", "");
        java.lang.String str3 = locale2.getVariant();
        java.lang.String str4 = locale2.getDisplayCountry();
        java.util.Locale locale5 = locale2.stripExtensions();
        java.util.Locale.Category category6 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale7 = java.util.Locale.getDefault(category6);
        java.util.Locale locale8 = java.util.Locale.GERMAN;
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = locale8.getDisplayName(locale9);
        java.util.Locale.setDefault(category6, locale9);
        java.util.Set<java.lang.String> strSet12 = locale9.getUnicodeLocaleKeys();
        java.lang.String str13 = locale9.getLanguage();
        java.lang.String str14 = locale9.getDisplayCountry();
        java.lang.String str15 = locale2.getDisplayScript(locale9);
        java.lang.String str16 = locale9.getDisplayScript();
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertTrue("'" + category6 + "' != '" + java.util.Locale.Category.FORMAT + "'", category6.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "ja");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "de");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "allemand" + "'", str10, "allemand");
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "fr" + "'", str13, "fr");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Canada" + "'", str14, "Canada");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test32189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32189");
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
        java.util.Locale.Category category42 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale43 = java.util.Locale.getDefault(category42);
        java.util.Locale locale44 = java.util.Locale.FRANCE;
        java.util.Locale locale45 = java.util.Locale.ITALIAN;
        java.lang.String str47 = locale45.getExtension('h');
        java.lang.String str48 = locale44.getDisplayScript(locale45);
        java.lang.String str49 = locale44.getISO3Country();
        java.util.Locale locale50 = java.util.Locale.GERMAN;
        java.util.Locale.setDefault(locale50);
        java.lang.String str52 = locale44.getDisplayName(locale50);
        java.lang.String str53 = locale44.getScript();
        java.util.Locale.setDefault(category42, locale44);
        java.util.Set<java.lang.String> strSet55 = locale44.getUnicodeLocaleKeys();
        java.lang.String str57 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet55, '#');
        java.lang.String str59 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet55, "e                               e                               e        ");
        java.util.List<java.lang.String> strList60 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet55);
        java.lang.String str62 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strList60, 'T');
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
        org.junit.Assert.assertTrue("'" + category42 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category42.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "deutsch");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "it");
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "FRA" + "'", str49, "FRA");
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "de");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "Franz\366sisch (Frankreich)" + "'", str52, "Franz\366sisch (Frankreich)");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNotNull(strSet55);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertNotNull(strList60);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
    }

    @Test
    public void test32190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32190");
        java.util.Locale locale2 = new java.util.Locale("dddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddfranzosisch(frankreich)", "Hi!       _\\u0020_italienisch####################################################################...");
        org.junit.Assert.assertEquals(locale2.toString(), "dddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddfranzosisch(frankreich)_HI!       _\\U0020_ITALIENISCH####################################################################...");
    }

    @Test
    public void test32191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32191");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkCOR\311ENkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk", "ENGLISH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test32192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32192");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("GBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGTALIAN", "ZHAZHZHZHZHZHZHZHZHZHZH_und-ca", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test32193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32193");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("Koreanisch", "TALIAN\\u002");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test32194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32194");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) 'g', '\n');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'g' + "'", char2 == 'g');
    }

    @Test
    public void test32195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32195");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("fran\347ais(france)(CHINESE(CHINA)fran\347ais(france)(CHINE...ALzhAMzhANzhAOzhAQzhARzhASzhA", "hsilgnE_NAILATI_nailati\\");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test32196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32196");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("#####################################################################################", "cinese) )()C)ina)))\\)u)0069)h)...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#####################################################################################" + "'", str2, "#####################################################################################");
    }

    @Test
    public void test32197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32197");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("nauruan");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "nauruan" + "'", str1, "nauruan");
    }

    @Test
    public void test32198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32198");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("china", "...                             ");
        java.lang.String[] strArray4 = null;
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIn44444444444444alia44444444444444itIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII", strArray3, strArray4);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIn44444444444444alia44444444444444itIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII" + "'", str5, "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIn44444444444444alia44444444444444itIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "china" + "'", str6, "china");
    }

    @Test
    public void test32199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32199");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "          ita                ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test32200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32200");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "                                                                      ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test32201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32201");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("IT                   ", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test32202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32202");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("...444444444444444444444444444444444444444444444444444                              ", (int) 'I');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...444444444444444444444444444444444444444444444444444                              " + "'", str2, "...444444444444444444444444444444444444444444444444444                              ");
    }

    @Test
    public void test32203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32203");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("FRAADzAEzAFzAGzAIzALzAMzANzAOzAQzARzAzAx", 'C', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "FRAADzAEzAFzAGzAIzALzAMzANzAOzAQzARzAzAx" + "'", str3, "FRAADzAEzAFzAGzAIzALzAMzANzAOzAQzARzAzAx");
    }

    @Test
    public void test32204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32204");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("gggggggEagaashggggggg");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=gggggggeagaashggggggg");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test32205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32205");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("........French (Canadad........", 'D');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test32206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32206");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("ZHO", "Chinese", 5);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concatWith("", (java.lang.Object[]) strArray4);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ZHO" + "'", str5, "ZHO");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ZHO" + "'", str7, "ZHO");
    }

    @Test
    public void test32207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32207");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "rrrrrrrrrrrrrrrr\\U000A");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test32208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32208");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("GBR");
        java.lang.String str2 = languageRange1.getRange();
        double double3 = languageRange1.getWeight();
        double double4 = languageRange1.getWeight();
        boolean boolean6 = languageRange1.equals((java.lang.Object) "Hgerman (germany)!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "gbr" + "'", str2, "gbr");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test32209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32209");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                          nnnnnnnnnnnnnnnnnnne                               ", "uuuuuuuuuuuuuuuuu\\u0066", 47);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test32210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32210");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("            ", "########################################################################################elti_0200u\\_!", "xxxxxxxxxxxxxxxxxx                                                   ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test32211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32211");
        java.util.Locale.Builder builder1 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale locale3 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str4 = locale3.getDisplayName();
        java.util.Locale.Builder builder5 = builder2.setLocale(locale3);
        java.util.Locale.Builder builder6 = builder5.clear();
        java.util.Locale.Builder builder8 = builder6.setLanguage("ITALIAN");
        java.util.Locale locale9 = builder6.build();
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.lowerCase("                                                                                                        ", locale9);
        java.util.Set<java.lang.String> strSet11 = locale9.getUnicodeLocaleAttributes();
        java.lang.String str12 = locale9.getVariant();
        java.util.Set<java.lang.String> strSet13 = locale9.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.String> strSet14 = locale9.getUnicodeLocaleAttributes();
        java.util.Locale.Category category15 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale16 = java.util.Locale.getDefault(category15);
        java.util.Locale locale17 = java.util.Locale.GERMAN;
        java.util.Locale locale18 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str19 = locale17.getDisplayName(locale18);
        java.util.Locale.setDefault(category15, locale18);
        java.util.Locale locale23 = new java.util.Locale("\\u0020iTALIANiTALIANiTALIANiTALI\\u0020iTALIANiTALIANiTALIANiTAL", "allemand");
        java.util.Locale.setDefault(category15, locale23);
        java.util.Locale locale25 = java.util.Locale.getDefault(category15);
        java.util.Locale locale26 = java.util.Locale.GERMAN;
        java.util.Locale locale27 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str28 = locale26.getDisplayName(locale27);
        java.util.Locale.setDefault(locale27);
        java.util.Locale.setDefault(category15, locale27);
        java.util.Locale locale31 = java.util.Locale.CHINESE;
        java.util.Locale locale32 = java.util.Locale.FRENCH;
        java.lang.String str33 = locale32.getDisplayName();
        java.lang.String str35 = locale32.getExtension('C');
        java.lang.String str36 = locale31.getDisplayLanguage(locale32);
        java.lang.String str37 = locale31.getScript();
        java.util.Locale.setDefault(category15, locale31);
        java.util.Set<java.lang.String> strSet39 = locale31.getUnicodeLocaleAttributes();
        java.util.Locale locale40 = locale31.stripExtensions();
        java.lang.String str41 = locale9.getDisplayVariant(locale31);
        java.util.Set<java.lang.String> strSet42 = locale9.getUnicodeLocaleAttributes();
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
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertTrue("'" + category15 + "' != '" + java.util.Locale.Category.FORMAT + "'", category15.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "de");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "de");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "allemand" + "'", str19, "allemand");
        org.junit.Assert.assertEquals(locale23.toString(), "\\u0020italianitalianitalianitali\\u0020italianitalianitalianital_ALLEMAND");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "\\u0020italianitalianitalianitali\\u0020italianitalianitalianital_ALLEMAND");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "de");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "allemand" + "'", str28, "allemand");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "zh");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "fran\347ais" + "'", str33, "fran\347ais");
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "chinois" + "'", str36, "chinois");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(strSet39);
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(strSet42);
    }

    @Test
    public void test32212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32212");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'U', 713);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 713 + "'", int2 == 713);
    }

    @Test
    public void test32213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32213");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("e                               e                   ", "                EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE                 ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test32214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32214");
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
        java.util.Locale.LanguageRange[] languageRangeArray19 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList20 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList20, languageRangeArray19);
        java.util.Locale locale22 = java.util.Locale.KOREA;
        java.util.Set<java.lang.String> strSet23 = locale22.getUnicodeLocaleAttributes();
        java.lang.String str25 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet23, "\\u0020iTALIANiTALIANiTALIANiTALI");
        java.lang.String str26 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList20, (java.util.Collection<java.lang.String>) strSet23);
        java.lang.String str27 = java.util.Locale.lookupTag(languageRangeList1, (java.util.Collection<java.lang.String>) strSet23);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap28 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList29 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList1, strMap28);
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
        org.junit.Assert.assertNotNull(languageRangeArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(languageRangeList29);
    }

    @Test
    public void test32215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32215");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("                                                                                         italian (italian,e...                                                                                          ", (double) 49);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=49.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test32216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32216");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("Chineseenglisch (         ITALIAN_ITALIAN_ENGLISH,\\u0061)(China)", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Chineseenglisch (         ITALIAN_ITALIAN_ENGLISH,\\u0061)(China)" + "'", str2, "Chineseenglisch (         ITALIAN_ITALIAN_ENGLISH,\\u0061)(China)");
    }

    @Test
    public void test32217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32217");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('A', (int) '\u6cd5');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 27861 + "'", int2 == 27861);
    }

    @Test
    public void test32218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32218");
        java.util.Locale locale1 = java.util.Locale.ITALY;
        java.lang.String str2 = locale1.getDisplayLanguage();
        java.util.Locale locale3 = java.util.Locale.getDefault();
        java.lang.String str4 = locale3.getLanguage();
        java.lang.String str5 = locale3.getScript();
        java.lang.String str6 = locale3.getISO3Country();
        java.lang.String str7 = locale3.getCountry();
        java.lang.String str8 = locale3.getCountry();
        java.lang.String str9 = locale1.getDisplayScript(locale3);
        java.util.Locale locale11 = new java.util.Locale("CCCCCCCCCCCCCanglais (CanadaCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
        java.lang.String str12 = locale1.getDisplayScript(locale11);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.lowerCase("  \\u007a555555555555555555555555555555555", locale11);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "italien" + "'", str2, "italien");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "fr" + "'", str4, "fr");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CAN" + "'", str6, "CAN");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CA" + "'", str7, "CA");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CA" + "'", str8, "CA");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals(locale11.toString(), "cccccccccccccanglais (canadaccccccccccccccccccccccccccccccccccccccc");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "  \\u007a555555555555555555555555555555555" + "'", str13, "  \\u007a555555555555555555555555555555555");
    }

    @Test
    public void test32219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32219");
        java.util.Locale locale2 = java.util.Locale.forLanguageTag("France");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.lowerCase("Frankreich", locale2);
        java.lang.String str4 = locale2.getDisplayVariant();
        java.util.Locale locale5 = java.util.Locale.ITALIAN;
        java.util.Set<java.lang.Character> charSet6 = locale5.getExtensionKeys();
        java.lang.String str7 = locale5.getVariant();
        java.lang.String str8 = locale2.getDisplayVariant(locale5);
        java.lang.String str9 = locale5.getISO3Country();
        java.util.Locale locale12 = new java.util.Locale("HHHHHHHHHH", "");
        java.util.Locale locale14 = java.util.Locale.forLanguageTag("\\u0020");
        java.util.Locale locale16 = java.util.Locale.CHINESE;
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.lowerCase("         italian_ITALIAN_English", locale16);
        java.lang.String str18 = locale16.toLanguageTag();
        java.lang.String str19 = locale14.getDisplayName(locale16);
        java.util.Set<java.lang.Character> charSet20 = locale14.getExtensionKeys();
        java.lang.String str21 = locale12.getDisplayCountry(locale14);
        java.lang.String str22 = locale5.getDisplayScript(locale12);
        java.util.Set<java.lang.String> strSet23 = locale12.getUnicodeLocaleKeys();
        java.lang.Class<?> wildcardClass24 = locale12.getClass();
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "france");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "frankreich" + "'", str3, "frankreich");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "it");
        org.junit.Assert.assertNotNull(charSet6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals(locale12.toString(), "hhhhhhhhhh");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "         italian_italian_english" + "'", str17, "         italian_italian_english");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "zh" + "'", str18, "zh");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(charSet20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test32220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32220");
        java.util.Locale locale2 = new java.util.Locale("cor\351en (Cor\351e du Sud)", "RA");
        java.util.Locale locale3 = java.util.Locale.CHINESE;
        java.lang.String str4 = locale3.getCountry();
        java.lang.String str5 = locale2.getDisplayName(locale3);
        java.lang.String str6 = locale3.getDisplayCountry();
        boolean boolean7 = locale3.hasExtensions();
        org.junit.Assert.assertEquals(locale2.toString(), "cor\351en (cor\351e du sud)_RA");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "cor\351en (cor\351e du sud) (RA)" + "'", str5, "cor\351en (cor\351e du sud) (RA)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test32221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32221");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("   \\U0034\\U00", (double) '\u671d');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=26397.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test32222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32222");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("h");
        java.lang.String str2 = languageRange1.getRange();
        java.lang.String str3 = languageRange1.getRange();
        java.lang.String str4 = languageRange1.getRange();
        double double5 = languageRange1.getWeight();
        double double6 = languageRange1.getWeight();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h" + "'", str2, "h");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "h" + "'", str3, "h");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "h" + "'", str4, "h");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test32223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32223");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("nglisch", " (italian,english)                                      ");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test32224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32224");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("ranzosisch (Frankreich)kkkkkkkkkkkkkkkkkkk...");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "E             gallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemand");
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny("                               INGLESE                                ", strArray3);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.split("\\u0023", "\\u0023");
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray9);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEach("", strArray3, strArray9);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test32225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32225");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("EnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglisch", "frtatiIi2tatat");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglisch" + "'", str2, "EnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglisch");
    }

    @Test
    public void test32226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32226");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("                 ", 406);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                 " + "'", str2, "                 ");
    }

    @Test
    public void test32227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32227");
        char[] charArray6 = new char[] { ' ', '4' };
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!", charArray6);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "Chinese (China)", charArray6);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                           ...                                                ", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test32228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32228");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("CHINESE");
        double double2 = languageRange1.getWeight();
        java.lang.String str3 = languageRange1.getRange();
        java.util.Locale.Builder builder5 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder6 = builder5.clear();
        java.util.Locale locale7 = java.util.Locale.UK;
        java.util.Locale.Builder builder8 = builder5.setLocale(locale7);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.lowerCase("Royaume-Uni", locale7);
        java.lang.String str10 = locale7.getDisplayLanguage();
        boolean boolean11 = languageRange1.equals((java.lang.Object) locale7);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chinese" + "'", str3, "chinese");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_GB");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "royaume-uni" + "'", str9, "royaume-uni");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "anglais" + "'", str10, "anglais");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test32229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32229");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiCHN");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test32230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32230");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "ESExxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxNCHI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test32231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32231");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIESILGNE_NAILATI_NAILATIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test32232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32232");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("hi!allemandItalienischallemanditalian_ITALIAN_EnglishallemandHI!allemandhi!allemandADAEAFAGAIA...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!allemandItalienischallemanditalian_ITALIAN_EnglishallemandHI!allemandhi!allemandADAEAFAGAIA..." + "'", str1, "hi!allemandItalienischallemanditalian_ITALIAN_EnglishallemandHI!allemandhi!allemandADAEAFAGAIA...");
    }

    @Test
    public void test32233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32233");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("United Kingdom", "inglesehhhhhhhhH", (int) 'a');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concatWith("Fgence", (java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UFgenceFgencetFgenced KFgenceFgenceFgencedom" + "'", str5, "UFgenceFgencetFgenced KFgenceFgenceFgencedom");
    }

    @Test
    public void test32234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32234");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "AzhzhzhzhzhzhzhzhzhzhADAAEAAFAAGAAA8ian\\u0020i86MFAMGAMHAMKAMLAMMAMNAMOAMPAMQAMRAMSAMTAMUAMVAMWAMXAMYAMZANAANCANEANFANGANANLANOANPANRANUANZAOMAPAAPEAPFAPGAPHAPKAPLAPMAPNAPRAPSAPTAPWAPYAQAAREAROARSARUARWASAASBASCASDASEASGASHASASJASKASLASMASNASOASRASSASTASVASXASYASZATCATDATFATGATHATJATKATLATMATNATOATRATTATVATWATZAUAAUGAUMAUSAUYAUZAVAAVCAVEAVGAVAVNAVUAWFAWSAYEAYTAZAAZMAZW");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AzhzhzhzhzhzhzhzhzhzhADAAEAAFAAGAAA8ian\\u0020i86MFAMGAMHAMKAMLAMMAMNAMOAMPAMQAMRAMSAMTAMUAMVAMWAMXAMYAMZANAANCANEANFANGANANLANOANPANRANUANZAOMAPAAPEAPFAPGAPHAPKAPLAPMAPNAPRAPSAPTAPWAPYAQAAREAROARSARUARWASAASBASCASDASEASGASHASASJASKASLASMASNASOASRASSASTASVASXASYASZATCATDATFATGATHATJATKATLATMATNATOATRATTATVATWATZAUAAUGAUMAUSAUYAUZAVAAVCAVEAVGAVAVNAVUAWFAWSAYEAYTAZAAZMAZW" + "'", str1, "AzhzhzhzhzhzhzhzhzhzhADAAEAAFAAGAAA8ian\\u0020i86MFAMGAMHAMKAMLAMMAMNAMOAMPAMQAMRAMSAMTAMUAMVAMWAMXAMYAMZANAANCANEANFANGANANLANOANPANRANUANZAOMAPAAPEAPFAPGAPHAPKAPLAPMAPNAPRAPSAPTAPWAPYAQAAREAROARSARUARWASAASBASCASDASEASGASHASASJASKASLASMASNASOASRASSASTASVASXASYASZATCATDATFATGATHATJATKATLATMATNATOATRATTATVATWATZAUAAUGAUMAUSAUYAUZAVAAVCAVEAVGAVAVNAVUAWFAWSAYEAYTAZAAZMAZW");
    }

    @Test
    public void test32235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32235");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("", "44d48600u\\");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test32236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32236");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("GBR");
        java.lang.String str2 = languageRange1.getRange();
        double double3 = languageRange1.getWeight();
        double double4 = languageRange1.getWeight();
        java.lang.String str5 = languageRange1.getRange();
        java.lang.String str6 = languageRange1.getRange();
        double double7 = languageRange1.getWeight();
        double double8 = languageRange1.getWeight();
        java.lang.String str9 = languageRange1.getRange();
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap11 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList12 = java.util.Locale.LanguageRange.parse("DEU", strMap11);
        boolean boolean13 = languageRange1.equals((java.lang.Object) "DEU");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "gbr" + "'", str2, "gbr");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "gbr" + "'", str5, "gbr");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "gbr" + "'", str6, "gbr");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "gbr" + "'", str9, "gbr");
        org.junit.Assert.assertNotNull(languageRangeList12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test32237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32237");
        java.util.Locale locale0 = java.util.Locale.UK;
        java.util.Locale.Category category1 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale2 = java.util.Locale.getDefault(category1);
        java.util.Locale locale3 = java.util.Locale.GERMAN;
        java.util.Locale locale4 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str5 = locale3.getDisplayName(locale4);
        java.util.Locale.setDefault(category1, locale4);
        java.util.Set<java.lang.String> strSet7 = locale4.getUnicodeLocaleKeys();
        java.lang.String str8 = locale0.getDisplayVariant(locale4);
        java.lang.String str9 = locale0.getDisplayLanguage();
        java.util.Locale locale11 = java.util.Locale.CHINESE;
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.lowerCase("Franz\366sisch (Frankreich)", locale11);
        java.lang.String str13 = locale11.getVariant();
        boolean boolean14 = locale11.hasExtensions();
        java.lang.String str15 = locale0.getDisplayName(locale11);
        java.lang.String str16 = locale11.getDisplayCountry();
        boolean boolean17 = locale11.hasExtensions();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
        org.junit.Assert.assertTrue("'" + category1 + "' != '" + java.util.Locale.Category.FORMAT + "'", category1.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "de");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "allemand" + "'", str5, "allemand");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "anglais" + "'", str9, "anglais");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "franz\366sisch (frankreich)" + "'", str12, "franz\366sisch (frankreich)");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\u82f1\u6587\u82f1\u56fd)" + "'", str15, "\u82f1\u6587\u82f1\u56fd)");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test32238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32238");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("#########FranzosischFranzosisch (Frankreich", "                               English(UnitedKingdom)                               ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test32239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32239");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("8600u\\U\\u0");
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '8' + "'", char1 == '8');
    }

    @Test
    public void test32240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32240");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("Deutsch", "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZW", 52);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "en-GB");
        boolean boolean7 = org.apache.commons.lang3.StringUtils.endsWithAny("iTALIAN                                                                 ", strArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "........French (Canadad........", 8, 241);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Deutsch" + "'", str6, "Deutsch");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test32241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32241");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE", "german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test32242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32242");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r8600u\\U\\u0\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r", 'f');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r8600u\\U\\u0\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r" + "'", str2, "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r8600u\\U\\u0\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r");
    }

    @Test
    public void test32243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32243");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("\u7fa9\u5927\u5229\u6587");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=????");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test32244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32244");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("\\u00de\\u00                                                         HCSTUED                                                         ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u00de\\u00 HCSTUED" + "'", str1, "\\u00de\\u00 HCSTUED");
    }

    @Test
    public void test32245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32245");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("!ih!ih!ih!ih!ih!ih!ih!ih!ih!ihtedesco    !ih!ih!ih!ih!ih!ih!ih!ih!ih!ih", "hi!       YItalienischYitalian_ITALIAN_EnglishYHI!Yhi!YADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...Y\\u0034YHI!YItalianY\\u0061Y\\u0023Yhi!YiTALIANYChinese (China)Yhi!Yzh_CNYiTALIANYenYItalienisch", 95, 89);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "!ih!ih!ih!ih!ih!ih!ih!ih!ih!ihtedesco    !ih!ih!ih!ih!ih!ih!ih!ih!ih!ihhi!       YItalienischYitalian_ITALIAN_EnglishYHI!Yhi!YADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...Y\\u0034YHI!YItalianY\\u0061Y\\u0023Yhi!YiTALIANYChinese (China)Yhi!Yzh_CNYiTALIANYenYItalienisch" + "'", str4, "!ih!ih!ih!ih!ih!ih!ih!ih!ih!ihtedesco    !ih!ih!ih!ih!ih!ih!ih!ih!ih!ihhi!       YItalienischYitalian_ITALIAN_EnglishYHI!Yhi!YADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...Y\\u0034YHI!YItalianY\\u0061Y\\u0023Yhi!YiTALIANYChinese (China)Yhi!Yzh_CNYiTALIANYenYItalienisch");
    }

    @Test
    public void test32246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32246");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("cinese777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "cinese777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777" + "'", str1, "cinese777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777");
    }

    @Test
    public void test32247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32247");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("Deutschland                                                                                                                                                                                                                                                                                                                                                                                                ", "englisch (         ITALIAN_ITALIAN_ENGLISH,\\u0061", 105);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test32248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32248");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("                                             hcstued                                            ", '0');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + ' ' + "'", char2 == ' ');
    }

    @Test
    public void test32249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32249");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale.Builder builder4 = builder2.clearExtensions();
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        java.util.Locale.Builder builder6 = builder5.clear();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test32250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32250");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee      eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee", "ZHO                               44\\U002344  \\U0020ITALIANITALIANITALIANITALI");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test32251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32251");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("\\u0038ZHO                          ", 60, 537);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test32252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32252");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("9hhhhhhhhhh9hhhhhhhhhh", 51);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "9hhhhhhhhhh9hhhhhhhhhh" + "'", str2, "9hhhhhhhhhh9hhhhhhhhhh");
    }

    @Test
    public void test32253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32253");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.Set<java.lang.Character> charSet1 = locale0.getExtensionKeys();
        java.lang.String str2 = locale0.toLanguageTag();
        java.lang.String str3 = locale0.getVariant();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(charSet1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ko-KR" + "'", str2, "ko-KR");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test32254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32254");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("ital", "\\XTALXAN_ITALIAN_ENGLXSH    R0                                               nailati");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test32255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32255");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("\\u004a", "ZH_cnFrench (Canada)AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITAL", 68);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\u004a" + "'", str4, "\\u004a");
    }

    @Test
    public void test32256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32256");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale.Builder builder2 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale locale4 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str5 = locale4.getDisplayName();
        java.util.Locale.Builder builder6 = builder3.setLocale(locale4);
        java.util.Locale.Builder builder7 = builder6.clear();
        java.util.Locale.Builder builder8 = builder6.clearExtensions();
        java.util.Locale.Builder builder11 = builder6.setExtension('I', "");
        java.util.Locale locale12 = java.util.Locale.GERMAN;
        java.util.Locale locale13 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str14 = locale12.getDisplayName(locale13);
        java.util.Locale locale15 = locale12.stripExtensions();
        java.lang.String str16 = locale12.getScript();
        java.lang.String str17 = locale12.getDisplayLanguage();
        java.util.Locale locale18 = java.util.Locale.ITALIAN;
        java.lang.String str19 = locale18.getDisplayLanguage();
        java.util.Locale locale20 = locale18.stripExtensions();
        java.lang.String str21 = locale12.getDisplayScript(locale20);
        java.util.Locale.Builder builder22 = builder11.setLocale(locale20);
        java.lang.String str23 = locale1.getDisplayName(locale20);
        java.util.Locale locale25 = java.util.Locale.ENGLISH;
        java.lang.String str26 = locale25.getDisplayLanguage();
        java.lang.String str27 = org.apache.commons.lang3.StringUtils.upperCase("!IH", locale25);
        java.util.Set<java.lang.Character> charSet28 = locale25.getExtensionKeys();
        java.lang.String str29 = locale25.getDisplayVariant();
        java.lang.String str30 = locale25.getLanguage();
        java.lang.String str31 = locale20.getDisplayCountry(locale25);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "fran\347ais (Canada)" + "'", str5, "fran\347ais (Canada)");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "de");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "allemand" + "'", str14, "allemand");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "de");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "allemand" + "'", str17, "allemand");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "it");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "italien" + "'", str19, "italien");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "it");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "en");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "anglais" + "'", str26, "anglais");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "!IH" + "'", str27, "!IH");
        org.junit.Assert.assertNotNull(charSet28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "en" + "'", str30, "en");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test32257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32257");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("Hian\\u0020iH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hian\\u0020iH" + "'", str1, "Hian\\u0020iH");
    }

    @Test
    public void test32258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32258");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("...ish ...", "ZH_CN", 22);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...ish ...ZH_CN...ish ...ZH_CN...ish ...ZH_CN...ish ...ZH_CN...ish ...ZH_CN...ish ...ZH_CN...ish ...ZH_CN...ish ...ZH_CN...ish ...ZH_CN...ish ...ZH_CN...ish ...ZH_CN...ish ...ZH_CN...ish ...ZH_CN...ish ...ZH_CN...ish ...ZH_CN...ish ...ZH_CN...ish ...ZH_CN...ish ...ZH_CN...ish ...ZH_CN...ish ...ZH_CN...ish ...ZH_CN...ish ..." + "'", str3, "...ish ...ZH_CN...ish ...ZH_CN...ish ...ZH_CN...ish ...ZH_CN...ish ...ZH_CN...ish ...ZH_CN...ish ...ZH_CN...ish ...ZH_CN...ish ...ZH_CN...ish ...ZH_CN...ish ...ZH_CN...ish ...ZH_CN...ish ...ZH_CN...ish ...ZH_CN...ish ...ZH_CN...ish ...ZH_CN...ish ...ZH_CN...ish ...ZH_CN...ish ...ZH_CN...ish ...ZH_CN...ish ...ZH_CN...ish ...");
    }

    @Test
    public void test32259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32259");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("HI!hi!", 221);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!hi!                                                                                                                                                                                                                       " + "'", str2, "HI!hi!                                                                                                                                                                                                                       ");
    }

    @Test
    public void test32260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32260");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("4444444FR", "                                        itTAiT_ITALIAN_EgAish                       )modgniK detinU( hsilgnE");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444FR" + "'", str2, "4444444FR");
    }

    @Test
    public void test32261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32261");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.FRANCE;
        java.util.Locale locale3 = java.util.Locale.ITALIAN;
        java.lang.String str5 = locale3.getExtension('h');
        java.lang.String str6 = locale2.getDisplayScript(locale3);
        java.util.Locale locale7 = locale2.stripExtensions();
        java.util.Locale.setDefault(category0, locale2);
        java.util.Locale locale9 = java.util.Locale.getDefault(category0);
        java.util.Locale.Builder builder10 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder11 = builder10.clearExtensions();
        java.util.Locale.Builder builder13 = builder10.setLanguageTag("Italian");
        java.util.Locale locale14 = builder13.build();
        java.util.Locale.Builder builder17 = builder13.setExtension('E', "DEUTSCH");
        java.util.Locale locale18 = builder13.build();
        java.util.Locale.Builder builder19 = builder13.clear();
        java.util.Locale locale20 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str21 = locale20.getCountry();
        java.lang.String str22 = locale20.toLanguageTag();
        java.util.Locale.Builder builder23 = builder13.setLocale(locale20);
        java.lang.String str24 = locale9.getDisplayVariant(locale20);
        java.util.Locale locale25 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale29 = new java.util.Locale("Italian", "Italian", "English");
        java.lang.String str30 = locale29.getDisplayCountry();
        java.lang.String str31 = locale25.getDisplayCountry(locale29);
        java.lang.String str32 = locale25.getVariant();
        java.util.Set<java.lang.String> strSet33 = locale25.getUnicodeLocaleKeys();
        java.lang.String str34 = locale25.getVariant();
        java.lang.String str35 = locale25.getDisplayName();
        java.lang.String str36 = locale20.getDisplayLanguage(locale25);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "it");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "italian");
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "italian__#e-deutsch");
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "CA" + "'", str21, "CA");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "fr-CA" + "'", str22, "fr-CA");
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "zh_CN");
        org.junit.Assert.assertEquals(locale29.toString(), "italian_ITALIAN_English");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "ITALIAN" + "'", str30, "ITALIAN");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "China" + "'", str31, "China");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(strSet33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "chinois (Chine)" + "'", str35, "chinois (Chine)");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "\u6cd5\u6587" + "'", str36, "\u6cd5\u6587");
    }

    @Test
    public void test32262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32262");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("", "                              444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444en");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test32263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32263");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder6 = builder0.setExtension('z', "EAGAASH");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder6.setExtension('G', "frfrfrfrfrfrfrfrfrfrfrfrfde_defrfrfrfrfrfrfrfrfrfrfrfrfr###############################################frfrfrfrfrfrfrfrfrfrfrfrfde_defrfrfrfrfrfrfrfrfrfrfrfrfr###############################################frfrfrfrfrfrfrfrfrfrfrfrfde_defrfrfrfrfrfrfrfrfrfrfrfrfr###############################################frfrfrfrfrfrfrfrfrfrfrfrfde_defrfrfrfrfrfrfrfrfrfrfrfrfr###############################################frfrfrfrfrfrfrfrfrfrfrfrfde_defrfrfrfrfrfrfrfrfrfrfrfrfr###############################################frfrfrfrfrfrfrfrfrfrfrfrfde_defrfrfrfrfrfrfrfrfrtalian\\u002");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension value: frfrfrfrfrfrfrfrfrfrfrfrfde [at index 0]");
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
    public void test32264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32264");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("ranzosisch (Frankreich)kkkkkkkkkkkkkkkkkkk...");
        boolean boolean3 = org.apache.commons.lang3.StringUtils.startsWithAny("Zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz\\XTALXAN_ITALIAN_ENGLXSHzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test32265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32265");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("aaUabUaeUafUakUamUanUarUasUavUayUazUbaUbeUbgUbhUbiUbmUbnUboUbrUbsUcaUceUchUcoUcrUcsUcuUcvUcyUdaUdeUdvUdzUeeUelUenUeoUesUetUeuUfaUffUfiUfjUfoUfrUfyUgaUgdUglUgnUguUgvUhaUheUhiUhoUhrUhtUhuUhyUhzUiaUidUieUigUiiUikUinUioUisUitUiuUiwUjaUjiUjvUkaUkgUkiUkjUkkUklUkmUknUkoUkrUksUkuUkvUkwUkyUlaUlbUlgUliUlnUloUltUluUlvUmgUmhUmiUmkUmlUmnUmoUmrUmsUmtUmyUnaUnbUndUneUngUnlUnnUnoUnrUnvUnyUocUojUomUorUosUpaUpiUplUpsUptUquUrmUrnUroUruUrwUsaUscUsdUseUsgUsiUskUslUsmUsnUsoUsqUsrUssUstUsuUsvUswUtaUteUtgUthUtiUtkUtlUtnUtoUtrUtsUttUtwUtyUugUukUurUuzUveUviUvoUwaUwoUxhUyiUyoUzaUzhUzu");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aauabuaeuafuakuamuanuaruasuavuayuazubaubeubgubhubiubmubnuboubrubsucauceuchucoucrucsucuucvucyudaudeudvudzueeueluenueouesuetueuufauffufiufjufoufrufyugaugduglugnuguugvuhauheuhiuhouhruhtuhuuhyuhzuiauiduieuiguiiuikuinuiouisuituiuuiwujaujiujvukaukgukiukjukkuklukmuknukoukruksukuukvukwukyulaulbulguliulnuloultuluulvumgumhumiumkumlumnumoumrumsumtumyunaunbunduneungunlunnunounrunvunyuocuojuomuoruosupaupiuplupsuptuquurmurnurouruurwusauscusduseusgusiuskuslusmusnusousqusrussustusuusvuswutauteutguthutiutkutlutnutoutrutsuttutwutyuuguukuuruuzuveuviuvouwauwouxhuyiuyouzauzhuzu" + "'", str1, "aauabuaeuafuakuamuanuaruasuavuayuazubaubeubgubhubiubmubnuboubrubsucauceuchucoucrucsucuucvucyudaudeudvudzueeueluenueouesuetueuufauffufiufjufoufrufyugaugduglugnuguugvuhauheuhiuhouhruhtuhuuhyuhzuiauiduieuiguiiuikuinuiouisuituiuuiwujaujiujvukaukgukiukjukkuklukmuknukoukruksukuukvukwukyulaulbulguliulnuloultuluulvumgumhumiumkumlumnumoumrumsumtumyunaunbunduneungunlunnunounrunvunyuocuojuomuoruosupaupiuplupsuptuquurmurnurouruurwusauscusduseusgusiuskuslusmusnusousqusrussustusuusvuswutauteutguthutiutkutlutnutoutrutsuttutwutyuuguukuuruuzuveuviuvouwauwouxhuyiuyouzauzhuzu");
    }

    @Test
    public void test32266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32266");
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
        boolean boolean13 = locale4.hasExtensions();
        java.util.Set<java.lang.String> strSet14 = locale4.getUnicodeLocaleAttributes();
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strSet14);
    }

    @Test
    public void test32267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32267");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("englischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglisch", 194);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "englischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischen" + "'", str2, "englischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischen");
    }

    @Test
    public void test32268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32268");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("it\\u0052TA\\u0052i\\u0052T\\u0052_\\u0052ITA                                                                                                                                                                                                                                                                                                                                                                              ", "Hcsineilat");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "it\\u0052TA\\u0052i\\u0052T\\u0052_\\u0052ITA                                                                                                                                                                                                                                                                                                                                                                              " + "'", str2, "it\\u0052TA\\u0052i\\u0052T\\u0052_\\u0052ITA                                                                                                                                                                                                                                                                                                                                                                              ");
    }

    @Test
    public void test32269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32269");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("nglisch");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test32270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32270");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITAL\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\", "Deutscd\\XTALXAN_ITALIAN_ENGLXSH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITAL\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\" + "'", str2, "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITAL\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
    }

    @Test
    public void test32271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32271");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("\r\rneilatI    E\r\r");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=??neilatie??");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test32272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32272");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("\\u0061", "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!itTAiT_ITALIAN_EgAish!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\\u0068");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny("hhhhhhhhhhhhhran\347aisa(France)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaafaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test32273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32273");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("hcsnela                                                ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hcsnela" + "'", str1, "hcsnela");
    }

    @Test
    public void test32274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32274");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder5 = builder1.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder5.setScript("ta...");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: ta... [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "French (Canada)" + "'", str3, "French (Canada)");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test32275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32275");
        java.util.Locale locale0 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale4 = new java.util.Locale("Italian", "Italian", "English");
        java.lang.String str5 = locale4.getDisplayCountry();
        java.lang.String str6 = locale0.getDisplayCountry(locale4);
        java.lang.String str8 = locale4.getExtension('E');
        java.util.Locale locale9 = java.util.Locale.US;
        java.lang.String str10 = locale9.toLanguageTag();
        java.lang.String str11 = locale4.getDisplayName(locale9);
        java.util.Locale locale12 = java.util.Locale.FRENCH;
        java.util.Locale locale13 = java.util.Locale.ENGLISH;
        java.lang.String str14 = locale13.getDisplayCountry();
        java.lang.String str15 = locale12.getDisplayVariant(locale13);
        java.lang.String str16 = locale12.getDisplayCountry();
        java.lang.String str17 = locale12.getScript();
        java.lang.String str18 = locale12.getScript();
        java.util.Locale locale19 = java.util.Locale.FRENCH;
        java.util.Locale locale20 = java.util.Locale.ENGLISH;
        java.lang.String str21 = locale20.getDisplayCountry();
        java.lang.String str22 = locale19.getDisplayVariant(locale20);
        java.lang.String str23 = locale19.getDisplayCountry();
        java.lang.String str24 = locale19.getScript();
        java.lang.String str25 = locale19.getScript();
        java.lang.String str26 = locale12.getDisplayCountry(locale19);
        java.util.Locale.Category category27 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale28 = java.util.Locale.getDefault(category27);
        java.util.Locale locale29 = java.util.Locale.FRANCE;
        java.util.Locale locale30 = java.util.Locale.ITALIAN;
        java.lang.String str32 = locale30.getExtension('h');
        java.lang.String str33 = locale29.getDisplayScript(locale30);
        java.lang.String str34 = locale29.getISO3Country();
        java.util.Locale locale35 = java.util.Locale.GERMAN;
        java.util.Locale.setDefault(locale35);
        java.lang.String str37 = locale29.getDisplayName(locale35);
        java.lang.String str38 = locale29.getScript();
        java.util.Locale.setDefault(category27, locale29);
        java.lang.String str40 = locale12.getDisplayCountry(locale29);
        java.lang.String str41 = locale9.getDisplayScript(locale12);
        java.lang.String str42 = locale12.getDisplayLanguage();
        java.lang.Object obj43 = locale12.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals(locale4.toString(), "italian_ITALIAN_English");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ITALIAN" + "'", str5, "ITALIAN");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "China" + "'", str6, "China");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "en-US" + "'", str10, "en-US");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "italian (ITALIAN,English)" + "'", str11, "italian (ITALIAN,English)");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "fr");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "fr");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "en");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + category27 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category27.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "italian");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "it");
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "FRA" + "'", str34, "FRA");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "de");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Franz\366sisch (Frankreich)" + "'", str37, "Franz\366sisch (Frankreich)");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "fran\347ais" + "'", str42, "fran\347ais");
        org.junit.Assert.assertNotNull(obj43);
        org.junit.Assert.assertEquals(obj43.toString(), "fr");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj43), "fr");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj43), "fr");
    }

    @Test
    public void test32276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32276");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("Cinese (cina)\\u0069h...");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test32277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32277");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("Dhi!", "u005c", 507);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test32278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32278");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("aE");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList3 = java.util.Locale.LanguageRange.parse("d");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap5 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList6 = java.util.Locale.LanguageRange.parse("nailati", strMap5);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap7 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList8 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList6, strMap7);
        java.util.Locale.LanguageRange[] languageRangeArray9 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList10 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList10, languageRangeArray9);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        java.util.Locale.FilteringMode filteringMode17 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList18 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList10, (java.util.Collection<java.lang.String>) strList15, filteringMode17);
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
        java.lang.String str34 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList10, (java.util.Collection<java.lang.String>) strList31);
        java.util.Locale locale35 = java.util.Locale.CANADA_FRENCH;
        java.util.Set<java.lang.String> strSet36 = locale35.getUnicodeLocaleKeys();
        java.lang.String str37 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList10, (java.util.Collection<java.lang.String>) strSet36);
        java.util.Locale.LanguageRange[] languageRangeArray38 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList39 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList39, languageRangeArray38);
        java.lang.String[] strArray43 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList44 = new java.util.ArrayList<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList44, strArray43);
        java.util.Locale.FilteringMode filteringMode46 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList47 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList39, (java.util.Collection<java.lang.String>) strList44, filteringMode46);
        java.util.Locale.LanguageRange[] languageRangeArray48 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList49 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList49, languageRangeArray48);
        java.lang.String[] strArray53 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList54 = new java.util.ArrayList<java.lang.String>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList54, strArray53);
        java.util.Locale.FilteringMode filteringMode56 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList57 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList49, (java.util.Collection<java.lang.String>) strList54, filteringMode56);
        java.lang.String[] strArray59 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList60 = new java.util.ArrayList<java.lang.String>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList60, strArray59);
        java.util.List<java.lang.String> strList62 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList49, (java.util.Collection<java.lang.String>) strList60);
        java.lang.String str63 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList39, (java.util.Collection<java.lang.String>) strList60);
        java.util.Locale locale64 = java.util.Locale.ITALIAN;
        java.util.Set<java.lang.Character> charSet65 = locale64.getExtensionKeys();
        java.util.Locale locale67 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale69 = new java.util.Locale("");
        java.util.Locale locale70 = java.util.Locale.FRANCE;
        java.util.Locale locale71 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str72 = locale70.getDisplayScript(locale71);
        java.util.Locale locale73 = java.util.Locale.ENGLISH;
        java.lang.String str74 = locale73.getDisplayCountry();
        java.util.Locale locale75 = java.util.Locale.PRC;
        java.util.Locale locale76 = java.util.Locale.US;
        java.util.Locale locale77 = java.util.Locale.FRANCE;
        java.util.Locale locale78 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str79 = locale77.getDisplayScript(locale78);
        java.util.Locale locale80 = java.util.Locale.ITALIAN;
        java.util.Set<java.lang.Character> charSet81 = locale80.getExtensionKeys();
        java.util.Locale locale82 = java.util.Locale.ITALIAN;
        java.lang.String str83 = locale82.getDisplayLanguage();
        java.util.Locale locale84 = java.util.Locale.FRENCH;
        java.util.Locale locale85 = java.util.Locale.US;
        java.util.Locale locale86 = java.util.Locale.ITALIAN;
        java.lang.String str87 = locale86.getDisplayLanguage();
        java.util.Locale locale88 = java.util.Locale.FRANCE;
        java.util.Locale[] localeArray89 = new java.util.Locale[] { locale64, locale67, locale69, locale70, locale73, locale75, locale76, locale78, locale80, locale82, locale84, locale85, locale86, locale88 };
        java.util.ArrayList<java.util.Locale> localeList90 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean91 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList90, localeArray89);
        java.util.Locale locale92 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList39, (java.util.Collection<java.util.Locale>) localeList90);
        java.util.List<java.util.Locale> localeList93 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList10, (java.util.Collection<java.util.Locale>) localeList90);
        java.util.List<java.util.Locale> localeList94 = java.util.Locale.filter(languageRangeList8, (java.util.Collection<java.util.Locale>) localeList93);
        java.util.List<java.util.Locale> localeList95 = java.util.Locale.filter(languageRangeList3, (java.util.Collection<java.util.Locale>) localeList93);
        java.util.List<java.util.Locale> localeList96 = java.util.Locale.filter(languageRangeList1, (java.util.Collection<java.util.Locale>) localeList93);
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(languageRangeList3);
        org.junit.Assert.assertNotNull(languageRangeList6);
        org.junit.Assert.assertNotNull(languageRangeList8);
        org.junit.Assert.assertNotNull(languageRangeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + filteringMode17 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode17.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
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
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(strSet36);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(languageRangeArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + filteringMode46 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode46.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList47);
        org.junit.Assert.assertNotNull(languageRangeArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + filteringMode56 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode56.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList57);
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(strList62);
        org.junit.Assert.assertNull(str63);
        org.junit.Assert.assertNotNull(locale64);
        org.junit.Assert.assertEquals(locale64.toString(), "it");
        org.junit.Assert.assertNotNull(charSet65);
        org.junit.Assert.assertNotNull(locale67);
        org.junit.Assert.assertEquals(locale67.toString(), "");
        org.junit.Assert.assertEquals(locale69.toString(), "");
        org.junit.Assert.assertNotNull(locale70);
        org.junit.Assert.assertEquals(locale70.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale71);
        org.junit.Assert.assertEquals(locale71.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertNotNull(locale73);
        org.junit.Assert.assertEquals(locale73.toString(), "en");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertNotNull(locale75);
        org.junit.Assert.assertEquals(locale75.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale76);
        org.junit.Assert.assertEquals(locale76.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale77);
        org.junit.Assert.assertEquals(locale77.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale78);
        org.junit.Assert.assertEquals(locale78.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertNotNull(locale80);
        org.junit.Assert.assertEquals(locale80.toString(), "it");
        org.junit.Assert.assertNotNull(charSet81);
        org.junit.Assert.assertNotNull(locale82);
        org.junit.Assert.assertEquals(locale82.toString(), "it");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "italien" + "'", str83, "italien");
        org.junit.Assert.assertNotNull(locale84);
        org.junit.Assert.assertEquals(locale84.toString(), "fr");
        org.junit.Assert.assertNotNull(locale85);
        org.junit.Assert.assertEquals(locale85.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale86);
        org.junit.Assert.assertEquals(locale86.toString(), "it");
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "italien" + "'", str87, "italien");
        org.junit.Assert.assertNotNull(locale88);
        org.junit.Assert.assertEquals(locale88.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(localeArray89);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertNull(locale92);
        org.junit.Assert.assertNotNull(localeList93);
        org.junit.Assert.assertNotNull(localeList94);
        org.junit.Assert.assertNotNull(localeList95);
        org.junit.Assert.assertNotNull(localeList96);
    }

    @Test
    public void test32279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32279");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, '.');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d" + "'", str3, "\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d");
    }

    @Test
    public void test32280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32280");
        java.util.Locale locale2 = new java.util.Locale("Azhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais cinese (cina)\\u0069h..France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzh", "Franz\366sischFranzosisch (Frankreich)uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        java.util.Locale.Category category3 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale5 = new java.util.Locale("\\u005c");
        java.util.Locale locale7 = java.util.Locale.CHINESE;
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.lowerCase("Franz\366sisch (Frankreich)", locale7);
        java.lang.String str9 = locale7.getVariant();
        java.lang.String str10 = locale5.getDisplayScript(locale7);
        java.util.Locale.setDefault(locale5);
        java.util.Locale.setDefault(category3, locale5);
        java.util.Locale locale14 = java.util.Locale.FRANCE;
        java.util.Locale locale15 = java.util.Locale.ITALIAN;
        java.lang.String str17 = locale15.getExtension('h');
        java.lang.String str18 = locale14.getDisplayScript(locale15);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.lowerCase("HI!       ", locale14);
        java.lang.String str21 = locale14.getExtension('z');
        java.util.Locale.setDefault(category3, locale14);
        java.util.Locale locale23 = java.util.Locale.getDefault(category3);
        java.util.Locale locale24 = java.util.Locale.getDefault(category3);
        java.lang.String str25 = locale24.getDisplayVariant();
        boolean boolean26 = locale24.hasExtensions();
        java.lang.String str27 = locale24.getVariant();
        java.lang.String str28 = locale24.toLanguageTag();
        java.lang.String str29 = locale2.getDisplayCountry(locale24);
        org.junit.Assert.assertEquals(locale2.toString(), "azhzhzhzhzhzhzhfrancais (france)azhzhzhzhzhzhzhzhzhzhfrancais (france)azhzhzhzhzhzhzhzhzhzhfrancais cinese (cina)\\u0069h..france)azhzhzhzhzhzhzhzhzhzhfrancais (france)azhzhzhzhzhzhzhzhzhzhfrancais (france)azhzhzhzhzhzhzhzhzhzhfrancais (france)azhzhzhzhzhzhzhzhzhzhfrancais (france)azhzhzhzhzhzhzhzhzhzhfrancais (france)azhzhzhzhzhzhzhzhzhzhfrancais (france)azhzhzhzhzhzhzhzhzhzhfrancais (france)azhzhzhzhzhzhzhzhzhzhfrancais (france)azhzhzhzhzhzhzhzhzhzhfrancais (france)azhzhzhzhzhzhzhzhzhzhfrancais (france)azhzhzhzhzhzhzhzhzhzhfrancais (france)azhzhzhzhzhzhzhzhzhzhfrancais (france)azhzhzhzhzhzhzhzhzhzhfrancais (france)azhzhzhzhzhzhzhzhzhzhfrancais (france)azhzhzhzhzhzhzhzhzhzhfrancais (france)azhzhzhzhzhzhzhzhzhzhfrancais (france)azhzhzhzhzhzhzhzhzhzhfrancais (france)azhzhzhzhzhzhzhzhzhzhfrancais (france)azhzhzhzhzhzhzhzhzhzh_FRANZ\366SISCHFRANZOSISCH (FRANKREICH)UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
        org.junit.Assert.assertTrue("'" + category3 + "' != '" + java.util.Locale.Category.FORMAT + "'", category3.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertEquals(locale5.toString(), "\\u005c");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "franz\366sisch (frankreich)" + "'", str8, "franz\366sisch (frankreich)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "it");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!       " + "'", str19, "hi!       ");
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "fr-FR" + "'", str28, "fr-FR");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "FRANZ\366SISCHFRANZOSISCH (FRANKREICH)UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU" + "'", str29, "FRANZ\366SISCHFRANZOSISCH (FRANKREICH)UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
    }

    @Test
    public void test32281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32281");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("HHHHHHHHHHtTAHHHHHHHHHHT_ITAhIAN\\U0020Ih", 122);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test32282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32282");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnEN_CA", 109);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnEN_CA                                                                          " + "'", str2, "nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnEN_CA                                                                          ");
    }

    @Test
    public void test32283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32283");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "ILATiNA...royaume-uniroyaume-uniroy");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test32284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32284");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rzh_cn (can)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test32285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32285");
        java.util.Locale locale3 = new java.util.Locale("HI!       ", "\\U0020", "Italienisch#########################################################################################");
        java.util.Locale locale4 = locale3.stripExtensions();
        java.util.Locale.setDefault(locale4);
        java.util.Locale locale6 = locale4.stripExtensions();
        java.util.Locale locale8 = java.util.Locale.forLanguageTag("hi!        (\\U0020,Italienisch#########################################################################################nnn");
        java.lang.String str9 = locale6.getDisplayScript(locale8);
        java.lang.String str10 = locale8.getDisplayVariant();
        org.junit.Assert.assertEquals(locale3.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test32286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32286");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                                    FR-                                                     ", '\351', 'Z');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                    FR-                                                     " + "'", str3, "                                                    FR-                                                     ");
    }

    @Test
    public void test32287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32287");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("k");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "K" + "'", str1, "K");
    }

    @Test
    public void test32288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32288");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("FRAADZHAEZHAFZHAGZHAIZHALZHAMZHANZHAOZHAQZHARZHASZHAEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test32289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32289");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("ZH_cn");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ZH_cn" + "'", str1, "ZH_cn");
    }

    @Test
    public void test32290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32290");
        char[] charArray7 = new char[] { ' ', '4' };
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!", charArray7);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsAny("French (Canada)", charArray7);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny("                                                                                         E    Italien", charArray7);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "ZH_cnFrench (Canada)AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\\u0020iItalian\\u0020i                                                 ", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 11 + "'", int12 == 11);
    }

    @Test
    public void test32291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32291");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("\\u002d", "!ih_HHHHHHHHHHDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDD");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test32292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32292");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray9 = new char[] { 'f', '4' };
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "Chinese (China)", charArray9);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "itTAiT_ITALIAN_EgAish", charArray9);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC\\u00de\\u00CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC", charArray9);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "frankreich", charArray9);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIH", charArray9);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "z...Frn", charArray9);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly(charSequence0, charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "f4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "f4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[f, 4]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test32293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32293");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\\U0069HHHHHHHHHH", "AD  \\u007");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test32294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32294");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("italienisch");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "italienisch" + "'", str1, "italienisch");
    }

    @Test
    public void test32295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32295");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "AzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs cAnese (cAna)u0069h..France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)Azhzhzhzhzhzhzhzhzhzh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test32296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32296");
        java.util.Locale locale1 = new java.util.Locale("\\u005c");
        java.util.Locale locale3 = java.util.Locale.CHINESE;
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.lowerCase("Franz\366sisch (Frankreich)", locale3);
        java.lang.String str5 = locale3.getVariant();
        java.lang.String str6 = locale1.getDisplayScript(locale3);
        java.lang.String str8 = locale1.getExtension('C');
        java.lang.String str9 = locale1.getDisplayScript();
        java.lang.String str10 = locale1.getScript();
        java.util.Locale locale11 = java.util.Locale.FRANCE;
        java.util.Locale locale12 = java.util.Locale.ITALIAN;
        java.lang.String str14 = locale12.getExtension('h');
        java.lang.String str15 = locale11.getDisplayScript(locale12);
        java.util.Locale locale19 = new java.util.Locale("HI!       ", "\\U0020", "Italienisch#########################################################################################");
        java.lang.String str20 = locale11.getDisplayCountry(locale19);
        java.lang.String str22 = locale19.getExtension('e');
        java.lang.String str23 = locale19.getDisplayLanguage();
        java.lang.String str24 = locale19.getDisplayName();
        java.lang.String str25 = locale1.getDisplayVariant(locale19);
        org.junit.Assert.assertEquals(locale1.toString(), "\\u005c");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "franz\366sisch (frankreich)" + "'", str4, "franz\366sisch (frankreich)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "it");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals(locale19.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "France" + "'", str20, "France");
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!       " + "'", str23, "hi!       ");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!        (\\U0020,Italienisch#########################################################################################)" + "'", str24, "hi!        (\\U0020,Italienisch#########################################################################################)");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test32297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32297");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("    \\    ", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAChineAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "    \\    " + "'", str2, "    \\    ");
    }

    @Test
    public void test32298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32298");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("\\U0069cccccccccccccccccccccccccccccccceGSCHccccccccccccccccccccccccccccccccccccccccccccccccc");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u0069CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC" + "'", str1, "\\u0069CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
    }

    @Test
    public void test32299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32299");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("", "", 79);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test32300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32300");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                                                                                                        englisch         en", 80, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                        englisch         en" + "'", str3, "                                                                                                        englisch         en");
    }

    @Test
    public void test32301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32301");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "Frankreich)kkkkkkkkkkkkkkkkkkkEnglFrankreich)kkkkkkkkkkkkkkkkkkk");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test32302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32302");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("hcsnela                                                gggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggg", "Azhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzh");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test32303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32303");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("ECANADAGCANADACANADASH", "                                                                                              DEUTSCH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test32304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32304");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "         ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test32305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32305");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("\\u0043");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test32306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32306");
        java.util.Locale locale3 = new java.util.Locale("                                                     \\u005c         ", "", "");
        java.lang.String str4 = locale3.getVariant();
        org.junit.Assert.assertEquals(locale3.toString(), "                                                     \\u005c         ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test32307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32307");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("ED_ED", "defgilmnoqrstuwxzbbbbdbebfbgbhbibjblbmbnbobqbrbsbtbvbwbybzccccdcfcgchcickclcmcncocrcucvcwcxcyczdedjdkdmdodzeceeegeheresetfifjfkfmfofrggbgdgegfggghgiglgmgngpgqgrgsgtgugwgyhkhmhnhrhthuidieiliminioiqirisitjejmjojpkekgkhkikmknkpkrkwkykzllblclilklrlsltlulvlymmcmdmemfmgmhmkmlmmmnmompmqmrmsmtmumvmwmxmymznncnenfngninlnonpnrnunzomppepfpgphpkplpmpnprpsptpwpyqrerorsrurwssbscsdsesgshsisjskslsmsnsosrssstsvsxsysztctdtftgthtjtktltmtntotrtttvtwtzuugumusuyuzvvcvevgvivnvuwfwsyeytzzmzw");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test32308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32308");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('H', 224);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 224 + "'", int2 == 224);
    }

    @Test
    public void test32309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32309");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("                                                                                                         German (Germany)", "tenenco");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test32310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32310");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("inglesehhhhhhhhHITTAIT_ITALIAN_EGAISH          ", "Franz\366sisc");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "inglesehhhhhhhhHITTAIT_ITALIAN_EGAISH          " + "'", str2, "inglesehhhhhhhhHITTAIT_ITALIAN_EGAISH          ");
    }

    @Test
    public void test32311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32311");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("            ", "44444444444444444444444444444444444444444444it                           ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "            " + "'", str2, "            ");
    }

    @Test
    public void test32312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32312");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("\uc601\uc5b4", 114);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test32313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32313");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\\', 720);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 720 + "'", int2 == 720);
    }

    @Test
    public void test32314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32314");
        java.util.Locale locale3 = new java.util.Locale("HI!       ", "\\U0020", "Italienisch#########################################################################################");
        java.util.Locale locale4 = locale3.stripExtensions();
        java.util.Locale locale5 = locale4.stripExtensions();
        java.lang.String str6 = locale4.toLanguageTag();
        java.util.Locale locale8 = new java.util.Locale("en");
        boolean boolean9 = locale8.hasExtensions();
        java.util.Set<java.lang.String> strSet10 = locale8.getUnicodeLocaleKeys();
        java.lang.String str11 = locale4.getDisplayName(locale8);
        java.util.Locale locale15 = new java.util.Locale("englisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)", "zhzhzhzhzhzhzhzhzhzhFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAzhzhzhzhzhzhzemand", "\n");
        java.lang.String str16 = locale4.getDisplayLanguage(locale15);
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
        org.junit.Assert.assertEquals(locale15.toString(), "engliscccccccccccccccccccccccccccccccccccccccccccccccccegschccccccccccccccccccccccccccccccccccccccccccccccccccalian_english,\\u0061)_ZHZHZHZHZHZHZHZHZHZHFRAADZHAEZHAFZHAGZHAIZHALZHAMZHANZHAOZHAQZHARZHASZHAZHZHZHZHZHZHZEMAND_\n");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!       " + "'", str16, "hi!       ");
    }

    @Test
    public void test32315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32315");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("\\XTALXAN_ITALIAN_ENGLXSH                                                 ", "\uad6d\uc911\uc5b4\uad6d\uc911IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test32316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32316");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                             hcstued                                             ", "                                                                                               EN");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, ' ');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hcstued" + "'", str4, "hcstued");
    }

    @Test
    public void test32317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32317");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test32318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32318");
        java.util.Locale locale0 = java.util.Locale.CHINESE;
        java.lang.String str1 = locale0.getCountry();
        java.lang.String str2 = locale0.getLanguage();
        java.util.Locale.Category category3 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale4 = java.util.Locale.getDefault(category3);
        java.util.Locale locale5 = java.util.Locale.GERMAN;
        java.util.Locale locale6 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str7 = locale5.getDisplayName(locale6);
        java.util.Locale.setDefault(category3, locale6);
        java.util.Locale locale11 = new java.util.Locale("\\u0020iTALIANiTALIANiTALIANiTALI\\u0020iTALIANiTALIANiTALIANiTAL", "allemand");
        java.util.Locale.setDefault(category3, locale11);
        java.lang.String str13 = locale0.getDisplayLanguage(locale11);
        java.util.Locale locale14 = java.util.Locale.getDefault();
        java.lang.String str15 = locale14.getDisplayName();
        java.lang.String str16 = locale14.getScript();
        java.lang.String str17 = locale0.getDisplayVariant(locale14);
        java.lang.String str18 = locale0.getDisplayScript();
        java.lang.Object obj19 = locale0.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "zh" + "'", str2, "zh");
        org.junit.Assert.assertTrue("'" + category3 + "' != '" + java.util.Locale.Category.FORMAT + "'", category3.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "de");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "allemand" + "'", str7, "allemand");
        org.junit.Assert.assertEquals(locale11.toString(), "\\u0020italianitalianitalianitali\\u0020italianitalianitalianital_ALLEMAND");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Chinese" + "'", str13, "Chinese");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!        (\\U0020,Italienisch#########################################################################################)" + "'", str15, "hi!        (\\U0020,Italienisch#########################################################################################)");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "zh");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "zh");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "zh");
    }

    @Test
    public void test32319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32319");
        java.lang.String[] strArray1 = null;
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split(")dnK( hcsis\366znrF", '#');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("germa", strArray1, strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "germa" + "'", str5, "germa");
    }

    @Test
    public void test32320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32320");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance(charSequence0, (java.lang.CharSequence) "FFFF");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Strings must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test32321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32321");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("hcsineilatI9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999", (int) (short) 0, 720);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test32322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32322");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        java.lang.String str4 = locale3.getCountry();
        java.util.Locale.setDefault(category0, locale3);
        java.util.Locale.Category category6 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale7 = java.util.Locale.getDefault(category6);
        java.util.Locale locale8 = java.util.Locale.getDefault(category6);
        java.util.Locale.setDefault(category0, locale8);
        java.lang.String str10 = locale8.getDisplayName();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "\\u0020italianitalianitalianitali\\u0020italianitalianitalianital_ALLEMAND");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + category6 + "' != '" + java.util.Locale.Category.FORMAT + "'", category6.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test32323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32323");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("TALIAN\\u0023DALLEMANDALLEMANDALLEMANDALLEMANDALLEMANDALLEMANDALLEMANDALLE", "Egsh", 72);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "TALIAN\\u0023DALLEMANDALLEMANDALLEMANDALLEMANDALLEMANDALLEMANDALLEMANDALLE" + "'", str4, "TALIAN\\u0023DALLEMANDALLEMANDALLEMANDALLEMANDALLEMANDALLEMANDALLEMANDALLE");
    }

    @Test
    public void test32324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32324");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("keagaasheagaasheagaasheagaasheagaasheagaasheagaasheagaasheagaasheagaasheagaasheagaasheagaasheagaashe", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=keagaasheagaasheagaasheagaasheagaasheagaasheagaasheagaasheagaasheagaasheagaasheagaasheagaasheagaashe");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test32325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32325");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("nnnnnnnnnnnnnnnnnCinese (cina)\\u0069h...", "\u82f1\u56fd");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test32326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32326");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "\ud504\ub791\uc2a4\uc5b4\uce90\ub098\ub2e4)_engengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengeng_                                                                    \\u0020italianitalianitalianital");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test32327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32327");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("\u6cd5\u6587", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u6cd5\u6587" + "'", str2, "\u6cd5\u6587");
    }

    @Test
    public void test32328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32328");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("en_CA", 'i');
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test32329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32329");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("Italian");
        java.util.Locale.Builder builder4 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder0.clear();
        java.util.Locale locale7 = java.util.Locale.forLanguageTag("\\u0020");
        java.util.Locale.Builder builder8 = builder0.setLocale(locale7);
        java.util.Locale.Builder builder11 = builder0.setExtension('u', "Italian");
        java.util.Locale.Builder builder13 = builder0.setLanguageTag("ixii");
        java.util.Locale.Builder builder15 = builder13.setLanguage("TALY");
        java.util.Locale locale16 = java.util.Locale.FRANCE;
        java.util.Locale locale17 = java.util.Locale.ITALIAN;
        java.lang.String str19 = locale17.getExtension('h');
        java.lang.String str20 = locale16.getDisplayScript(locale17);
        java.lang.String str21 = locale16.getISO3Country();
        java.util.Locale locale22 = java.util.Locale.GERMAN;
        java.util.Locale.setDefault(locale22);
        java.lang.String str24 = locale16.getDisplayName(locale22);
        java.lang.String str25 = locale16.getScript();
        java.lang.String str26 = locale16.getLanguage();
        java.lang.String str27 = locale16.getISO3Language();
        java.util.Set<java.lang.String> strSet28 = locale16.getUnicodeLocaleAttributes();
        java.lang.String str29 = locale16.getDisplayVariant();
        java.util.Locale.Builder builder30 = builder15.setLocale(locale16);
        java.lang.String str31 = locale16.getDisplayVariant();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "fr" + "'", str26, "fr");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "fra" + "'", str27, "fra");
        org.junit.Assert.assertNotNull(strSet28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test32330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32330");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("HZHZHZHZHZHZHZHZHZHZAHZSAHZRAHZQAHZOAHZNAH", 55);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "      HZHZHZHZHZHZHZHZHZHZAHZSAHZRAHZQAHZOAHZNAH       " + "'", str2, "      HZHZHZHZHZHZHZHZHZHZAHZSAHZRAHZQAHZOAHZNAH       ");
    }

    @Test
    public void test32331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32331");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("SH", "gERMAN (gERMANY)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test32332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32332");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("a)AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAdZH_cnFrench (Cana", "x-lvariant-CAN");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test32333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32333");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaadI!        (\\u0020,iTALICNIUEd#########################################################################################aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaadI!        (\\u0020,iTALICNIUEd#########################################################################################aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaadI!        (\\u0020,iTALICNIUEd#########################################################################################aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test32334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32334");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("Fr", 327, 400);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test32335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32335");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("Cinese (Cina)\\u0069h..", 111, 194);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test32336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32336");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("COR\311EN", "anglais (Canada)CH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test32337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32337");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "UD                                             \\U0034");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test32338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32338");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("engliscu", "  \\U005    (...U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069!IH\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\ENGLISCH)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "engliscu" + "'", str2, "engliscu");
    }

    @Test
    public void test32339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32339");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "francesefrancesefrancesefr\\u007");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test32340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32340");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("FR_CA                                                   ", 280, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   ti");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                FR_CA                                                   " + "'", str3, "                                                                                                                                                                                                                                FR_CA                                                   ");
    }

    @Test
    public void test32341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32341");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("                                                                                           u0020italianitalianitalianitali", "", 314);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test32342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32342");
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
            java.util.Locale.Builder builder16 = builder13.setLanguage("0023dallemandallemandallemandallemandallemandallemandallemandalle");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: 0023dallemandallemandallemandallemandallemandallemandallemandalle [at index 0]");
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
    public void test32343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32343");
        java.util.Locale locale1 = java.util.Locale.ITALIAN;
        java.lang.String str2 = locale1.getDisplayLanguage();
        java.util.Locale locale3 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str4 = locale3.toLanguageTag();
        java.lang.String str5 = locale1.getDisplayName(locale3);
        java.lang.String str6 = locale3.getDisplayScript();
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.upperCase("DE_DE", locale3);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Italienisch" + "'", str2, "Italienisch");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "fr-CA" + "'", str4, "fr-CA");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "italien" + "'", str5, "italien");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "DE_DE" + "'", str7, "DE_DE");
    }

    @Test
    public void test32344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32344");
        java.util.Locale locale1 = java.util.Locale.ENGLISH;
        java.lang.String str2 = locale1.getDisplayLanguage();
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.upperCase("!IH", locale1);
        java.lang.String str4 = locale1.getCountry();
        java.lang.String str5 = locale1.getCountry();
        boolean boolean6 = locale1.hasExtensions();
        java.util.Locale locale7 = java.util.Locale.GERMAN;
        java.util.Locale locale8 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str9 = locale7.getDisplayName(locale8);
        java.util.Locale locale10 = locale7.stripExtensions();
        java.lang.String str11 = locale1.getDisplayVariant(locale7);
        java.util.Locale locale12 = locale7.stripExtensions();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Englisch" + "'", str2, "Englisch");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!IH" + "'", str3, "!IH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "de");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "allemand" + "'", str9, "allemand");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "de");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "de");
    }

    @Test
    public void test32345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32345");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("ecanadaGcanadacanadaSH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ecanadaGcanadacanadaSH" + "'", str1, "ecanadaGcanadacanadaSH");
    }

    @Test
    public void test32346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32346");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder5 = builder4.clear();
        java.util.Locale.Builder builder6 = builder4.clearExtensions();
        java.util.Locale locale7 = builder6.build();
        java.util.Set<java.lang.Character> charSet8 = locale7.getExtensionKeys();
        java.util.Set<java.lang.Character> charSet9 = locale7.getExtensionKeys();
        java.util.Locale.setDefault(locale7);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Franz\366sisch (Kanada)" + "'", str3, "Franz\366sisch (Kanada)");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertNotNull(charSet8);
        org.junit.Assert.assertNotNull(charSet9);
    }

    @Test
    public void test32347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32347");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("rrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrefrankreichgfrankreichfrankreichsrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrefrankrecinese (cina)\\u0069h...rrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrefrankreichgfrankreichfrankreichsrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrefrankrei", "", "                  iTALIE                                           ", (int) 'G');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "rrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrefrankreichgfrankreichfrankreichsrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrefrankrecinese (cina)\\u0069h...rrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrefrankreichgfrankreichfrankreichsrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrefrankrei" + "'", str4, "rrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrefrankreichgfrankreichfrankreichsrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrefrankrecinese (cina)\\u0069h...rrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrefrankreichgfrankreichfrankreichsrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrefrankrei");
    }

    @Test
    public void test32348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32348");
        java.util.Locale locale3 = new java.util.Locale("FR-C                 ", "...c!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "          fr-ca");
        org.junit.Assert.assertEquals(locale3.toString(), "fr-c                 _...C!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!_          fr-ca");
    }

    @Test
    public void test32349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32349");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'x', (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test32350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32350");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                                          4444allemand4444", "             x-lvariant-CAN              ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test32351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32351");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("English", "Italian");
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!", "", (int) (short) 10);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("", strArray6, strArray10);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, 'a');
        java.lang.String[] strArray15 = org.apache.commons.lang3.StringUtils.stripAll(strArray6, "                                                                                                    ");
        int int16 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("hi!       allemandItalienischallemanditalian_ITALIAN_EnglishallemandHI!allemandhi!allemandADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...allemand\\u0034allemandHI!allemandItalianallemand\\u0061allemand\\u0023allemandhi!allemandiTALIANallemandChinese (China)allemandhi!allemandzh_CNallemandiTALIANallemandenallemandItalienisch", strArray15);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.endsWithAny("9hhhhhhhhhh", strArray15);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray15, 'u');
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.concatWith("italian (italian,eng", (java.lang.Object[]) strArray15);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Eagaash" + "'", str13, "Eagaash");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 395 + "'", int16 == 395);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Euguush" + "'", str19, "Euguush");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Eitalian (italian,enggitalian (italian,engitalian (italian,engsh" + "'", str20, "Eitalian (italian,enggitalian (italian,engitalian (italian,engsh");
    }

    @Test
    public void test32352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32352");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("h########################################################################################", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test32353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32353");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("anglais (Canada)CH", "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN                                                                     ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test32354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32354");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder6 = builder1.setLanguage("und");
        java.util.Locale locale7 = builder6.build();
        java.util.Locale locale8 = builder6.build();
        java.util.Locale.Builder builder9 = builder6.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder9.addUnicodeLocaleAttribute("                                                                                              deutsch (\\)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute:                                                                                               deutsch (\\) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test32355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32355");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("HcsineilatI", "hi!2ITALIANITALIANITALIANITALItalienish2ITALIANITALIANITALIANITALitalian_ITALIAN_English2ITALIANITALIANITALIANITALHI!2ITALIANITALIANITALIANITALhi!2ITALIANITALIANITALIANITALADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...2ITALIANITALIANITALIANITAL342ITALIANITALIANITALIANITALHI!2ITALIANITALIANITALIANITALItalian2ITALIANITALIANITALIANITAL612ITALIANITALIANITALIANITAL232ITALIANITALIANITALIANITALhi!2ITALIANITALIANITALIANITALiTALIAN2ITALIANITALIANITALIANITALChinese(China)2ITALIANITALIANITALIANITALhi!2ITALIANITALIANITALIANITALzh_CN2ITALIANITALIANITALIANITALiTALIAN2ITALIANITALIANITALIANITALen2ITALIANITALIANITALIANITALItalienish", "ENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENG");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HcsineilatI" + "'", str3, "HcsineilatI");
    }

    @Test
    public void test32356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32356");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("                                                           X                                                            ", "South Korea", (int) 'H');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test32357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32357");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("", "\\u671d");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test32358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32358");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                                                                                               EN", "                                                                                                              italieital");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test32359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32359");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder6 = builder1.setLanguage("und");
        java.util.Locale locale7 = builder6.build();
        java.util.Locale.Builder builder9 = builder6.setLanguage("fr");
        java.util.Locale.Builder builder10 = builder9.clear();
        java.util.Locale.Builder builder12 = builder10.setVariant("");
        java.util.Locale locale14 = java.util.Locale.ITALIAN;
        java.util.Set<java.lang.Character> charSet15 = locale14.getExtensionKeys();
        java.lang.String str16 = locale14.getVariant();
        java.lang.String str17 = locale14.getDisplayName();
        java.lang.String str18 = locale14.getDisplayName();
        java.lang.String str19 = locale14.getDisplayVariant();
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.lowerCase("cinese (Cina)\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hh", locale14);
        java.util.Locale locale21 = locale14.stripExtensions();
        java.util.Locale.Builder builder22 = builder12.setLocale(locale21);
        java.util.Locale.Builder builder23 = builder12.clear();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "French (Canada)" + "'", str3, "French (Canada)");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "und_CA");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "it");
        org.junit.Assert.assertNotNull(charSet15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Italian" + "'", str17, "Italian");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Italian" + "'", str18, "Italian");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "cinese (cina)\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hh" + "'", str20, "cinese (cina)\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hh");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "it");
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder23);
    }

    @Test
    public void test32360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32360");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("germa", "        \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\!_\\U0020_Itle\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\         ");
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("########################################################################################eltI_0200U\\_!", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.endsWithAny("AD\rAE\rAF\rAG\rAI\rAL\rAM\rAN\rAO\rAQ\rAR\rAS\rAT\rAU\rAW\rAX\rAZ\rBA\rBB\rBD\rBE\rBF\rBG\rBH\rBI\rBJ\rBL\rBM\rBN\rBO\rBQ\rBR\rBS\rBT\rBV\rBW\rBY\rBZ\rCA\rCC\rCD\rCF\rCG\rCH\rCI\rCK\rCL\rCM\rCN\rCO\rCR\rCU\rCV\rCW\rCX\rCY\rCZ\rDE\rDJ\rDK\rDM\rDO\rDZ\rEC\rEE\rEG\rEH\rER\rES\rET\rFI\rFJ\rFK\rFM\rFO\rFR\rGA\rGB\rGD\rGE\rGF\rGG\rGH\rGI\rGL\rGM\rGN\rGP\rGQ\rGR\rGS\rGT\rGU\rGW\rGY\rHK\rHM\rHN\rHR\rHT\rHU\rID\rIE\rIL\rIM\rIN\rIO\rIQ\rIR\rIS\rIT\rJE\rJM\rJO\rJP\rKE\rKG\rKH\rKI\rKM\rKN\rKP\rKR\rKW\rKY\rKZ\rLA\rLB\rLC\rLI\rLK\rLR\rLS\rLT\rLU\rLV\rLY\rMA\rMC\rMD\rME\rMF\rMG\rMH\rMK\rML\rMM\rMN\rMO\rMP\rMQ\rMR\rMS\rMT\rMU\rMV\rMW\rMX\rMY\rMZ\rNA\rNC\rNE\rNF\rNG\rNI\rNL\rNO\rNP\rNR\rNU\rNZ\rOM\rPA\rPE\rPF\rPG\rPH\rPK\rPL\rPM\rPN\rPR\rPS\rPT\rPW\rPY\rQA\rRE\rRO\rRS\rRU\rRW\rSA\rSB\rSC\rSD\rSE\rSG\rSH\rSI\rSJ\rSK\rSL\rSM\rSN\rSO\rSR\rSS\rST\rSV\rSX\rSY\rSZ\rTC\rTD\rTF\rTG\rTH\rTJ\rTK\rTL\rTM\rTN\rTO\rTR\rTT\rTV\rTW\rTZ\rUA\rUG\rUM\rUS\rUY\rUZ\rVA\rVC\rVE\rVG\rVI\rVN\rVU\rWF\rWS\rYE\rYT\rZA\rZM\rZW", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "grma" + "'", str6, "grma");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test32361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32361");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("h (CCCCCCCCC,CV CW CX CY CZ DE DJ DK DM DO DZ EC EE EG EC ER ES EC FC FJ FK)", "aaaaaaaaaaaaaaaaaaaaaaaaaa...anitaliaaaaaaaaaaaaaaaaaaaaaaaaaa", 117);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test32362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32362");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("\ub3c5\uc77c\uc5b4", "it_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_I");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test32363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32363");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("en-GBDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCH", "italieitalNC_hzitalieital", 0, 83);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "italieitalNC_hzitalieital" + "'", str4, "italieitalNC_hzitalieital");
    }

    @Test
    public void test32364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32364");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty(charSequence0, (java.lang.CharSequence) "\ud504\ub791\uc2a4\uc5b4\uce90\ub098\ub2e4)_ENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENG_                                                                    \\U0020ITALIANITALIANITALIANITALI");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "\ud504\ub791\uc2a4\uc5b4\uce90\ub098\ub2e4)_ENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENG_                                                                    \\U0020ITALIANITALIANITALIANITALI" + "'", charSequence2, "\ud504\ub791\uc2a4\uc5b4\uce90\ub098\ub2e4)_ENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENG_                                                                    \\U0020ITALIANITALIANITALIANITALI");
    }

    @Test
    public void test32365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32365");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiPrintable('\ud504');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test32366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32366");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("und-CA", "nglish (United Kingdom)french (NC_HZ)", "Ckkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "und-CA" + "'", str3, "und-CA");
    }

    @Test
    public void test32367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32367");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "0034\\u00");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0034\\u00" + "'", str1, "0034\\u00");
    }

    @Test
    public void test32368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32368");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                      ...", "\\u000d");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "ECANADAgCANADACANADAsh                                                                                                  ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test32369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32369");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("eR-GB", "...hbi...");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", 'a');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("taly", strArray4, strArray7);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray7, "nailatiko", 122, 37);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.endsWithAny("                                                                                                                                                                                                                                                                                                                                                                      it_                                                                                                                                                                                                                                                                                                                                                                       ", strArray7);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "taly" + "'", str8, "taly");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test32370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32370");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("fRANZ\326SISCH (kANADA)", 'J');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test32371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32371");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("italiIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIITALIAN_italian_eNGLISHIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII                                             hcsfr-CueD                                                                                          hcsfr-CueD  i", "             DE_DE            uuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test32372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32372");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("\\u005c", "frz\366cz(frkrec)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test32373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32373");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("\\u0061");
        java.util.Set<java.lang.String> strSet2 = locale1.getUnicodeLocaleAttributes();
        java.lang.String str3 = locale1.getVariant();
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap5 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList6 = java.util.Locale.LanguageRange.parse("F", strMap5);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap8 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList9 = java.util.Locale.LanguageRange.parse("nailati", strMap8);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap10 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList11 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList9, strMap10);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap12 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList13 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList11, strMap12);
        java.lang.String[] strArray26 = new java.lang.String[] { "\\u0020iItalian\\u008600u\\", "\\u0020iItalian\\u0020i", "anglais", "FRZ\326CZ(FRKREC)", "italian    ", "                                                                                                      ", "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I", "zhzhzhzhzhzhzhzhzhzhFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAzhzhzhzhzhzhzhzhzhzh", "FRZ\326CZ(FRKREC)", "cinese (Cina)\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hh", "         ITALIAN_ITALIAN_ENGLISH         ITALIAN_!IHITTAIT_ITALIAN_EGAISH", "                                      ..." };
        java.util.ArrayList<java.lang.String> strList27 = new java.util.ArrayList<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList27, strArray26);
        java.lang.String str29 = java.util.Locale.lookupTag(languageRangeList11, (java.util.Collection<java.lang.String>) strList27);
        java.util.List<java.lang.String> strList30 = java.util.Locale.filterTags(languageRangeList6, (java.util.Collection<java.lang.String>) strList27);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap31 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList32 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList6, strMap31);
        boolean boolean33 = locale1.equals((java.lang.Object) languageRangeList32);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(languageRangeList6);
        org.junit.Assert.assertNotNull(languageRangeList9);
        org.junit.Assert.assertNotNull(languageRangeList11);
        org.junit.Assert.assertNotNull(languageRangeList13);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertNotNull(languageRangeList32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test32374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32374");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("frnz\366sisch (knd)");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test32375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32375");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase(".Korean (South Korea)Korean (So");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".korean (south korea)korean (so" + "'", str1, ".korean (south korea)korean (so");
    }

    @Test
    public void test32376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32376");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("fr");
        java.lang.String[] strArray5 = new java.lang.String[] { "...ANiTALI", "             ", "          " };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.List<java.lang.String> strList8 = java.util.Locale.filterTags(languageRangeList1, (java.util.Collection<java.lang.String>) strList6);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap9 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList10 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList1, strMap9);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap11 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList12 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList10, strMap11);
        java.util.Locale locale15 = new java.util.Locale("9hhhhhhhhhh", "\\u0078");
        java.util.Set<java.lang.String> strSet16 = locale15.getUnicodeLocaleKeys();
        java.util.List<java.lang.String> strList17 = java.util.Locale.filterTags(languageRangeList10, (java.util.Collection<java.lang.String>) strSet16);
        java.util.Locale.Builder builder18 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder19 = builder18.clearExtensions();
        java.util.Locale locale20 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str21 = locale20.getDisplayName();
        java.util.Locale.Builder builder22 = builder19.setLocale(locale20);
        java.util.Locale.Builder builder23 = builder19.clearExtensions();
        java.util.Locale locale24 = java.util.Locale.ITALIAN;
        java.util.Set<java.lang.Character> charSet25 = locale24.getExtensionKeys();
        java.lang.String str26 = locale24.getVariant();
        java.lang.String str27 = locale24.getDisplayName();
        java.lang.String str28 = locale24.getDisplayName();
        java.lang.String str29 = locale24.getDisplayLanguage();
        java.util.Locale.Builder builder30 = new java.util.Locale.Builder();
        java.util.Locale locale31 = builder30.build();
        java.lang.String str32 = locale31.getDisplayCountry();
        java.lang.String str33 = locale24.getDisplayName(locale31);
        java.util.Locale.Builder builder34 = builder19.setLocale(locale24);
        java.util.Locale locale35 = builder34.build();
        java.util.Locale.Builder builder36 = builder34.clear();
        java.util.Locale locale37 = builder36.build();
        java.util.Set<java.lang.String> strSet38 = locale37.getUnicodeLocaleKeys();
        java.util.Locale.FilteringMode filteringMode39 = java.util.Locale.FilteringMode.EXTENDED_FILTERING;
        java.util.List<java.lang.String> strList40 = java.util.Locale.filterTags(languageRangeList10, (java.util.Collection<java.lang.String>) strSet38, filteringMode39);
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(languageRangeList10);
        org.junit.Assert.assertNotNull(languageRangeList12);
        org.junit.Assert.assertEquals(locale15.toString(), "9hhhhhhhhhh_\\U0078");
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "French (Canada)" + "'", str21, "French (Canada)");
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "it");
        org.junit.Assert.assertNotNull(charSet25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Italian" + "'", str27, "Italian");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Italian" + "'", str28, "Italian");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Italian" + "'", str29, "Italian");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Italian" + "'", str33, "Italian");
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "it");
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "");
        org.junit.Assert.assertNotNull(strSet38);
        org.junit.Assert.assertTrue("'" + filteringMode39 + "' != '" + java.util.Locale.FilteringMode.EXTENDED_FILTERING + "'", filteringMode39.equals(java.util.Locale.FilteringMode.EXTENDED_FILTERING));
        org.junit.Assert.assertNotNull(strList40);
    }

    @Test
    public void test32377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32377");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("           \\u", (int) '8');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test32378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32378");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.lang.String str1 = locale0.getDisplayName();
        java.lang.String str3 = locale0.getExtension('C');
        java.lang.String str4 = locale0.getVariant();
        java.util.Locale locale5 = java.util.Locale.CHINESE;
        java.util.Locale locale6 = java.util.Locale.FRENCH;
        java.lang.String str7 = locale6.getDisplayName();
        java.lang.String str9 = locale6.getExtension('C');
        java.lang.String str10 = locale5.getDisplayLanguage(locale6);
        java.lang.String str11 = locale6.getISO3Country();
        java.lang.String str13 = locale6.getExtension('z');
        java.lang.String str14 = locale0.getDisplayVariant(locale6);
        java.lang.String str15 = locale6.getDisplayLanguage();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "French" + "'", str1, "French");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "French" + "'", str7, "French");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chinois" + "'", str10, "chinois");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "French" + "'", str15, "French");
    }

    @Test
    public void test32379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32379");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center(")", 51, 'D');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DDDDDDDDDDDDDDDDDDDDDDDDD)DDDDDDDDDDDDDDDDDDDDDDDDD" + "'", str3, "DDDDDDDDDDDDDDDDDDDDDDDDD)DDDDDDDDDDDDDDDDDDDDDDDDD");
    }

    @Test
    public void test32380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32380");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("Iinglese", "FR-CAFR-CAFR-C8600U\\FR-CAFR-CAFR-CA", "");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test32381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32381");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "FR\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\ub3c5\uc77c\uc5b4\r\r\r\r\rfraH\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\ub3c5\uc77c\uc5b4\r\r\r\r\rfrafR\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\ub3c5\uc77c\uc5b4\r\r\r\r\rfra)");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 84 + "'", int1 == 84);
    }

    @Test
    public void test32382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32382");
        java.util.Locale locale0 = java.util.Locale.ROOT;
        java.lang.String str1 = locale0.getISO3Country();
        java.util.Set<java.lang.String> strSet2 = locale0.getUnicodeLocaleKeys();
        java.lang.Class<?> wildcardClass3 = locale0.getClass();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test32383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32383");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("FRANZ\326SISCH (FRANKREICH)", 0, "French (France)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "FRANZ\326SISCH (FRANKREICH)" + "'", str3, "FRANZ\326SISCH (FRANKREICH)");
    }

    @Test
    public void test32384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32384");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("FRANZ\326SISCH\n(FRANKREICH)HSIAGE_NAILATI_TIATTIHI!_NAILATI         HSILGNE_NAILATI_", "fffffffffffff                                                                        ", "chinesisch(China)");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test32385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32385");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("it hi!       _\\U0020...T hi!       _\\U0020...Ai hi!       _\\U0020...T hi!       _\\U0020..._ hi!       _\\U0020...ITA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "it hi!       _\\U0020...T hi!       _\\U0020...Ai hi!       _\\U0020...T hi!       _\\U0020..._ hi!       _\\U0020...ITA" + "'", str1, "it hi!       _\\U0020...T hi!       _\\U0020...Ai hi!       _\\U0020...T hi!       _\\U0020..._ hi!       _\\U0020...ITA");
    }

    @Test
    public void test32386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32386");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("FR-CAFR-CAFR-C8600U\\FR-CAFR-CAFR-CA", 1, "\\u0055");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "FR-CAFR-CAFR-C8600U\\FR-CAFR-CAFR-CA" + "'", str3, "FR-CAFR-CAFR-C8600U\\FR-CAFR-CAFR-CA");
    }

    @Test
    public void test32387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32387");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("2\\iTALIANiTALIANiTALIANiT", "kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkNI", "\\u0063");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2\\iTALAiTALAiTALAiT" + "'", str3, "2\\iTALAiTALAiTALAiT");
    }

    @Test
    public void test32388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32388");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("\uc601\uc5b4", "bgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgtalian");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test32389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32389");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("latInailatInailatInailatI0200U\\ilatInailatInailatInailatI0200U\\", "         ITALIAN_ITALIAN_ENGLISH         ITALIAN_!IHITTAIT_ITALIAN_EGAISHE             G                          SHE             G                          SHE             G                          SHE             G                          SHE             G                          SHE             G                          SHE             G                          SHE             G                ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test32390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32390");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("iIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIITALIAN_italian_eNGLISHIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII                                             hcsfr-CueD                                                                                          hcsfr-CueD  ", 'C');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'i' + "'", char2 == 'i');
    }

    @Test
    public void test32391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32391");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test32392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32392");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("Allemagne", "HHHHHHHHHHtTAHHHHHHHHHHT_ITAHHHHHHHHHHtTAHHHHHHHHHHT_ITAHHHHHHHHHHtTAHHHHHHHHHHT_ITAHHHHHHHHHHtTAHHHHHHHHHHT_ITAHHHHHHHHHHtTAHHHHHHHHHHT_ITAHHHHHHHHHHtTAHHHHHHHHHHT_ITAHHHHHHHHHHtTAHHHHHHHHHHT_ITAHHHHHHHHHHtTAHHHHHHHHHHT_ITAHHHHHHHHHHtTAHHHHHHHHHHT_ITAHHHHHHHHHHtTAHHHHHHHHHHT_ZH_eCCaaa)HHHHHHHHHHtTAHHHHHHHHHHT_ITAHHHHHHHHHHtTAHHHHHHHHHHT_ITAHHHHHHHHHHtTAHHHHHHHHHHT_ITAHHHHHHHHHHtTAHHHHHHHHHHT_ITAHHHHHHHHHHtTAHHHHHHHHHHT_ITAHHHHHHHHHHtTAHHHHHHHHHHT_ITAHHHHHHHHHHtTAHHHHHHHHHHT_ITAHHHHHHHHHHtTAHHHHHHHHHHT_ITAHHHHHHHHHHtTAHHHHHHHHHHT_ITAHHHHHHHHHHtTAHHHHHHHHHHT_");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test32393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32393");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("!       2italianitalianitalianitalitalienisch2italianitalianitalianitalitalian_italian_english2italianitalianitalianitalhi!2italianitalianitalianitalhi!2italianitalianitalianitaladaeafagaialamanaoaqarasatauawaxazbabbbdbebfbgbhbibjblbmbnbobqbrbsbtbvbwbybzcacccdcfcgchcickclcmcncocrcucvcwcxcyczded...2italianitalianitalianital\\u00342italianitalianitalianitalhi!2italianitalianitalianitalitalian2italianitalianitalianital\\u00612italianitalianitalianital\\u00232italianitalianitalianitalhi!2italianitalianitalianitalitalian2italianitalianitalianitalchinese (china)2italianitalianitalianitalhi!2italianitalianitalianitalzh_cn2italianitalianitalianitalitalian2italianitalianitalianitalen2italianitalianitalianitalitalienisch", "(FRANKREICH)a");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test32394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32394");
        java.util.Locale locale1 = java.util.Locale.UK;
        java.util.Locale.Category category2 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale3 = java.util.Locale.getDefault(category2);
        java.util.Locale locale4 = java.util.Locale.GERMAN;
        java.util.Locale locale5 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str6 = locale4.getDisplayName(locale5);
        java.util.Locale.setDefault(category2, locale5);
        java.util.Set<java.lang.String> strSet8 = locale5.getUnicodeLocaleKeys();
        java.lang.String str9 = locale1.getDisplayVariant(locale5);
        java.lang.String str10 = locale1.getDisplayLanguage();
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.lowerCase("francese (canada)", locale1);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_GB");
        org.junit.Assert.assertTrue("'" + category2 + "' != '" + java.util.Locale.Category.FORMAT + "'", category2.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "de");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "allemand" + "'", str6, "allemand");
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "English" + "'", str10, "English");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "francese (canada)" + "'", str11, "francese (canada)");
    }

    @Test
    public void test32395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32395");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder6 = builder1.setLanguage("und");
        java.util.Locale locale7 = builder6.build();
        java.lang.String str8 = locale7.getDisplayScript();
        java.lang.String str9 = locale7.getDisplayCountry();
        java.util.Locale locale10 = null;
        java.lang.String str11 = locale7.getDisplayVariant(locale10);
        java.lang.String str12 = locale7.getDisplayLanguage();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "French (Canada)" + "'", str3, "French (Canada)");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "und_CA");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Canada" + "'", str9, "Canada");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Undetermined" + "'", str12, "Undetermined");
    }

    @Test
    public void test32396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32396");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("zh_cnfrench (canada)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zh_cnfrench (canada)" + "'", str1, "zh_cnfrench (canada)");
    }

    @Test
    public void test32397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32397");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb" + "'", str1, "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb");
    }

    @Test
    public void test32398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32398");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("                                                                             \\U0020ITALIANITALIANITALIANITALI", "\\U005YYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYY", 80);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test32399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32399");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                              \\     ", "");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "Euguush");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray6);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("eNGLISH", "Franz\366sisch(Frankreich)", 122);
        int int13 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("2cinese (cina)italianitalianitalianital", strArray12);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("nailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailati", strArray6, strArray12);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\\" + "'", str7, "\\");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "nailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailati" + "'", str14, "nailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailati");
    }

    @Test
    public void test32400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32400");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("4444444FR", "\\u00de\\u00\\u\\u00de\\u00\\u", 220);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444FR" + "'", str3, "4444444FR");
    }

    @Test
    public void test32401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32401");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.FRANCE;
        java.util.Locale locale3 = java.util.Locale.ITALIAN;
        java.lang.String str5 = locale3.getExtension('h');
        java.lang.String str6 = locale2.getDisplayScript(locale3);
        java.util.Locale locale7 = locale2.stripExtensions();
        java.util.Locale.setDefault(category0, locale2);
        java.util.Locale.Builder builder10 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder11 = builder10.clear();
        java.util.Locale locale12 = java.util.Locale.UK;
        java.util.Locale.Builder builder13 = builder10.setLocale(locale12);
        java.util.Locale.Builder builder14 = builder13.clearExtensions();
        java.util.Locale.Builder builder15 = new java.util.Locale.Builder();
        java.util.Locale locale16 = builder15.build();
        java.lang.String str17 = locale16.getDisplayCountry();
        java.util.Locale.Builder builder18 = builder13.setLocale(locale16);
        java.util.Locale.Builder builder19 = builder13.clear();
        java.util.Locale locale21 = new java.util.Locale("it");
        java.util.Locale.Builder builder22 = new java.util.Locale.Builder();
        java.util.Locale locale23 = builder22.build();
        java.util.Locale locale24 = java.util.Locale.FRENCH;
        java.util.Locale locale25 = java.util.Locale.ENGLISH;
        java.lang.String str26 = locale25.getDisplayCountry();
        java.lang.String str27 = locale24.getDisplayVariant(locale25);
        java.lang.String str28 = locale24.getDisplayCountry();
        java.lang.String str29 = locale24.getScript();
        java.lang.String str30 = locale24.getScript();
        java.util.Locale locale31 = java.util.Locale.FRENCH;
        java.util.Locale locale32 = java.util.Locale.ENGLISH;
        java.lang.String str33 = locale32.getDisplayCountry();
        java.lang.String str34 = locale31.getDisplayVariant(locale32);
        java.lang.String str35 = locale31.getDisplayCountry();
        java.lang.String str36 = locale31.getScript();
        java.lang.String str37 = locale31.getScript();
        java.lang.String str38 = locale24.getDisplayCountry(locale31);
        java.lang.String str39 = locale23.getDisplayVariant(locale31);
        java.util.Locale locale41 = java.util.Locale.ENGLISH;
        java.lang.String str42 = locale41.getDisplayLanguage();
        java.lang.String str43 = org.apache.commons.lang3.StringUtils.upperCase("!IH", locale41);
        java.lang.String str44 = locale41.getCountry();
        java.lang.String str45 = locale41.getCountry();
        java.lang.String str46 = locale31.getDisplayCountry(locale41);
        java.util.Locale locale50 = new java.util.Locale("HI!       ", "\\U0020", "Italienisch#########################################################################################");
        java.util.Locale locale51 = locale50.stripExtensions();
        java.lang.String str52 = locale41.getDisplayCountry(locale51);
        java.lang.String str53 = locale21.getDisplayScript(locale51);
        java.lang.String str54 = locale21.getDisplayName();
        java.util.Locale.Builder builder55 = builder19.setLocale(locale21);
        java.lang.String str56 = locale21.getISO3Country();
        java.lang.String str57 = org.apache.commons.lang3.StringUtils.lowerCase("ALLEMAND", locale21);
        java.util.Locale.setDefault(category0, locale21);
        java.lang.String str59 = locale21.getDisplayCountry();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "it");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_GB");
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertEquals(locale21.toString(), "it");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "fr");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "en");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "fr");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "en");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "en");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "English" + "'", str42, "English");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "!IH" + "'", str43, "!IH");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals(locale50.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "Italian" + "'", str54, "Italian");
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "allemand" + "'", str57, "allemand");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
    }

    @Test
    public void test32402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32402");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("ti");
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
        java.util.Locale.Builder builder22 = builder0.setLocale(locale20);
        java.util.Locale.Builder builder23 = builder0.clearExtensions();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertTrue("'" + category3 + "' != '" + java.util.Locale.Category.FORMAT + "'", category3.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "it");
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
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder23);
    }

    @Test
    public void test32403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32403");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("EagaashUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", 69);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test32404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32404");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("                          fr-C                           ", "          tt           t it ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 26 + "'", int2 == 26);
    }

    @Test
    public void test32405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32405");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rfr-CA\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "fr-CA" + "'", str1, "fr-CA");
    }

    @Test
    public void test32406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32406");
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
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strList12, "hi!       _\\U0020_Italienisch####################################################################...");
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strList12, "                                                                                  ");
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
    public void test32407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32407");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("          ita                ", "aDAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDh..", (int) 'Z');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test32408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32408");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("germa", "        \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\!_\\U0020_Itle\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\         ");
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("########################################################################################eltI_0200U\\_!", strArray4);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.split("italian    ", "Fgence");
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray9, 'E');
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny("en", strArray9);
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.stripAll(strArray9, "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rfra");
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                   deutsch                    ", strArray4, strArray14);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "italiaE    " + "'", str11, "italiaE    ");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "                   deutsch                    " + "'", str15, "                   deutsch                    ");
    }

    @Test
    public void test32409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32409");
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
        java.util.Locale.Builder builder41 = builder39.setVariant("Chinese");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder43 = builder39.removeUnicodeLocaleAttribute("francesefrancesefrancesefr\\u007");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: francesefrancesefrancesefr\\u007 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + category6 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category6.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr_CA");
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
        org.junit.Assert.assertNotNull(builder41);
    }

    @Test
    public void test32410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32410");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("", 'e');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'e' + "'", char2 == 'e');
    }

    @Test
    public void test32411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32411");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("\\u0020italianitalianitalianitali");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=\\u0020italianitalianitalianitali");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test32412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32412");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "...HBI...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test32413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32413");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("ITALIEITAL99999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ITALIEITAL99999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999" + "'", str1, "ITALIEITAL99999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999");
    }

    @Test
    public void test32414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32414");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("EnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglish", "\u4e2d\u6587", 24);
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("    ...", strArray5);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.startsWithAny("                                                  i44444444444444444en", strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test32415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32415");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("AzhzhzhzhzhzhzhzhzhzhE             g                          ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AzhzhzhzhzhzhzhzhzhzhE             g                         " + "'", str1, "AzhzhzhzhzhzhzhzhzhzhE             g                         ");
    }

    @Test
    public void test32416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32416");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "FR-caFR-caFR-c8600U\\FR-caFR-caFR-ca");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test32417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32417");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'D', 16);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 16 + "'", int2 == 16);
    }

    @Test
    public void test32418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32418");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("FranzosischFranz\366sisch (Kanada)(Frankreich)", (double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=10.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test32419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32419");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("\\u0062", "aaaaaaaaaaaaaaaaaaaaaaaaFranz\366sisch (Frankreich)aaaaaaaaaaaaaa...", (int) 'Z');
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test32420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32420");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("", 220);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test32421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32421");
        java.util.Locale locale1 = new java.util.Locale("hi!       ");
        java.lang.String str2 = locale1.getDisplayScript();
        java.util.Locale locale4 = java.util.Locale.ROOT;
        java.lang.String str5 = locale4.getISO3Country();
        java.util.Set<java.lang.String> strSet6 = locale4.getUnicodeLocaleKeys();
        java.util.Locale locale7 = locale4.stripExtensions();
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.upperCase("2E             giTALIANiTALIANiTALIANiTAL", locale4);
        java.util.Locale.setDefault(locale4);
        java.util.Locale locale10 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str11 = locale10.getDisplayName();
        java.lang.String str12 = locale10.getScript();
        java.util.Set<java.lang.String> strSet13 = locale10.getUnicodeLocaleKeys();
        java.lang.String str14 = locale4.getDisplayLanguage(locale10);
        java.lang.String str15 = locale1.getDisplayCountry(locale4);
        java.util.Locale.setDefault(locale4);
        org.junit.Assert.assertEquals(locale1.toString(), "hi!       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2E             GITALIANITALIANITALIANITAL" + "'", str8, "2E             GITALIANITALIANITALIANITAL");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "French (Canada)" + "'", str11, "French (Canada)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test32422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32422");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("       ", 38);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test32423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32423");
        char[] charArray6 = new char[] { ' ', '4' };
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!", charArray6);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "u", charArray6);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsAny("n", charArray6);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "EnglischEnglischEnglisc(italian,english)EnglischEnglischEnglisc", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test32424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32424");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("\uc601\uc5b4                                                                                                  ", "fr-ca");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test32425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32425");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("Italian");
        java.util.Locale locale4 = builder3.build();
        java.util.Locale.Builder builder7 = builder3.setExtension('E', "DEUTSCH");
        java.util.Locale locale8 = builder3.build();
        java.util.Locale.Builder builder9 = builder3.clear();
        java.util.Locale locale10 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str11 = locale10.getCountry();
        java.lang.String str12 = locale10.toLanguageTag();
        java.util.Locale.Builder builder13 = builder3.setLocale(locale10);
        java.util.Locale locale15 = java.util.Locale.forLanguageTag("italian");
        java.util.Locale locale16 = locale15.stripExtensions();
        java.util.Locale.Builder builder17 = builder13.setLocale(locale15);
        java.util.Set<java.lang.Character> charSet18 = locale15.getExtensionKeys();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "italian");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "italian__#e-deutsch");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "CA" + "'", str11, "CA");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "fr-CA" + "'", str12, "fr-CA");
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "italian");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "italian");
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(charSet18);
    }

    @Test
    public void test32426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32426");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.getDefault(category0);
        java.lang.String str3 = locale2.getDisplayVariant();
        java.lang.String str4 = locale2.getDisplayCountry();
        java.util.Set<java.lang.String> strSet5 = locale2.getUnicodeLocaleAttributes();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strSet5);
    }

    @Test
    public void test32427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32427");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("fr-", "\\xtalxan_ITALIAN_Englxsh", "\\U0069HHHHHHHHHH");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "fr-" + "'", str3, "fr-");
    }

    @Test
    public void test32428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32428");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("Eagaash");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray3);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("HI!HI!", "fra", 117);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEach("\r", strArray3, strArray8);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny("ZH_cn", strArray8);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Eagaash" + "'", str4, "Eagaash");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\r" + "'", str9, "\r");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test32429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32429");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("500u\\                                                         ", 753, (int) 'N');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test32430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32430");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder5 = builder4.clear();
        java.util.Locale locale6 = builder5.build();
        java.util.Locale.Builder builder7 = builder5.clear();
        java.util.Locale.Builder builder9 = builder5.removeUnicodeLocaleAttribute("chinois");
        java.util.Locale locale10 = builder5.build();
        java.util.Locale.Builder builder11 = builder5.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder14 = builder5.setUnicodeLocaleKeyword("4444allemand4444", "ZZZITALIAN (ITALY)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: 4444allemand4444 [at index 0]");
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
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test32431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32431");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("             hcsineilati             dddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd", "!_\\u0020_itle########################################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "             hcsineilati             dddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd" + "'", str2, "             hcsineilati             dddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd");
    }

    @Test
    public void test32432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32432");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("000000000000000000000000000000000000000000000FRANZ\326SISCH0000000000000000000000000000000000000000000000", (int) (short) -1, 'l');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "000000000000000000000000000000000000000000000FRANZ\326SISCH0000000000000000000000000000000000000000000000" + "'", str3, "000000000000000000000000000000000000000000000FRANZ\326SISCH0000000000000000000000000000000000000000000000");
    }

    @Test
    public void test32433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32433");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("IXII", "hI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "IXII" + "'", str2, "IXII");
    }

    @Test
    public void test32434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32434");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("hhhhhhhhhhhhhhhhhhh", 15);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh" + "'", str2, "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
    }

    @Test
    public void test32435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32435");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                     \\u002e");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test32436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32436");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("gERMAN (gERMANY");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "gERMAN (gERMANY" + "'", str1, "gERMAN (gERMANY");
    }

    @Test
    public void test32437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32437");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("\\u0034\\u00hcstuD\\u0034\\u00", "R-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FR");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test32438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32438");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder3.clear();
        java.util.Locale.Builder builder5 = builder3.clearExtensions();
        java.util.Locale.Builder builder6 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder7 = builder6.clear();
        java.util.Locale locale8 = java.util.Locale.UK;
        java.util.Locale.Builder builder9 = builder6.setLocale(locale8);
        java.util.Locale.setDefault(locale8);
        java.util.Locale locale12 = new java.util.Locale("en");
        boolean boolean13 = locale12.hasExtensions();
        java.util.Set<java.lang.String> strSet14 = locale12.getUnicodeLocaleKeys();
        java.util.Locale locale15 = java.util.Locale.ITALIAN;
        java.lang.String str16 = locale15.getDisplayLanguage();
        java.util.Locale locale17 = locale15.stripExtensions();
        java.lang.String str18 = locale17.getVariant();
        java.lang.String str19 = locale12.getDisplayLanguage(locale17);
        java.lang.String str20 = locale8.getDisplayVariant(locale12);
        java.lang.String str21 = locale8.getDisplayScript();
        java.lang.String str22 = locale8.getDisplayCountry();
        java.util.Locale.Builder builder23 = builder3.setLocale(locale8);
        java.util.Locale.Builder builder25 = builder23.setLanguage("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder27 = builder25.setLanguage("     e                               e                               e            ");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language:      e                               e                               e             [at index 0]");
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
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en_GB");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertEquals(locale12.toString(), "en");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "it");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Italian" + "'", str16, "Italian");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "it");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "inglese" + "'", str19, "inglese");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "United Kingdom" + "'", str22, "United Kingdom");
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
    }

    @Test
    public void test32439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32439");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("k", "...u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069!IH\\u006");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "k" + "'", str2, "k");
    }

    @Test
    public void test32440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32440");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("aNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHc", 109);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test32441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32441");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("44444444444\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITALHcsineilatI444444444444", "r-FR", "royaume-uni");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITALHcsineilatI444444444444" + "'", str3, "44444444444\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITALHcsineilatI444444444444");
    }

    @Test
    public void test32442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32442");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("C", '7');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test32443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32443");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069!IH\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\ENGLISCH", 2, ')');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069!IH\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\ENGLISCH" + "'", str3, "\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069!IH\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\ENGLISCH");
    }

    @Test
    public void test32444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32444");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("   \r");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test32445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32445");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder5 = builder1.clear();
        java.util.Locale.Builder builder6 = builder1.clear();
        java.util.Locale locale7 = builder6.build();
        java.lang.String str8 = locale7.getVariant();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "French (Canada)" + "'", str3, "French (Canada)");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test32446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32446");
        char[] charArray7 = new char[] { 'f', '4' };
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "Chinese (China)", charArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\u0061ItalifnischItalifnischItalifnischItalifnischItalifnischItalifnischItalifnischItalifnischItalif", charArray7);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "French (Canada)", charArray7);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "EagaashUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", charArray7);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "          2cinese (cina)italianitalianitalianital", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "f4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "f4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[f, 4]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test32447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32447");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                                                                                                                          ADAEAFAGAIALAMANAOAQARASAAUAWAXAZBABB                                                                                                                                           ", "600u\\                                 hsiage_nailati_tiatti                                        ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test32448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32448");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("...                             xxxxxxxxxxxxxxxxxxtit...                             xxxxxxxxxxxxxxxxxxx", "\\aUa0046", 9, 8);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "...     \\aUa0046                       xxxxxxxxxxxxxxxxxxtit...                             xxxxxxxxxxxxxxxxxxx" + "'", str4, "...     \\aUa0046                       xxxxxxxxxxxxxxxxxxtit...                             xxxxxxxxxxxxxxxxxxx");
    }

    @Test
    public void test32449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32449");
        java.util.Locale locale2 = java.util.Locale.FRANCE;
        java.util.Locale locale3 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str4 = locale2.getDisplayScript(locale3);
        java.lang.String str5 = locale3.getVariant();
        java.util.Locale locale7 = new java.util.Locale("");
        java.util.Locale.setDefault(locale7);
        java.lang.String str9 = locale3.getDisplayName(locale7);
        java.util.Locale locale11 = new java.util.Locale("\\u0068");
        boolean boolean12 = locale11.hasExtensions();
        java.util.Locale locale15 = new java.util.Locale("!IH", "Hhhhhhhhhh");
        java.lang.String str16 = locale15.getDisplayLanguage();
        java.lang.String str17 = locale11.getDisplayName(locale15);
        java.lang.String str18 = locale11.getDisplayCountry();
        java.lang.String str19 = locale3.getDisplayCountry(locale11);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.lowerCase("c                       ", locale11);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.upperCase("fr_CA                                                   ", locale11);
        java.lang.String str22 = locale11.getDisplayName();
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "French (Canada)" + "'", str9, "French (Canada)");
        org.junit.Assert.assertEquals(locale11.toString(), "\\u0068");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals(locale15.toString(), "!ih_HHHHHHHHHH");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "!ih" + "'", str16, "!ih");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\\u0068" + "'", str17, "\\u0068");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Canada" + "'", str19, "Canada");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "c                       " + "'", str20, "c                       ");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "FR_CA                                                   " + "'", str21, "FR_CA                                                   ");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\\u0068" + "'", str22, "\\u0068");
    }

    @Test
    public void test32450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32450");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("                                      )hsilgne,nailati( ", "\\u0021NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test32451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32451");
        java.util.Locale locale0 = java.util.Locale.ENGLISH;
        java.util.Set<java.lang.Character> charSet1 = locale0.getExtensionKeys();
        java.lang.String str2 = locale0.toLanguageTag();
        java.lang.String str3 = locale0.toLanguageTag();
        java.lang.String str4 = locale0.getScript();
        java.util.Set<java.lang.String> strSet5 = locale0.getUnicodeLocaleAttributes();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en");
        org.junit.Assert.assertNotNull(charSet1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "en" + "'", str2, "en");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "en" + "'", str3, "en");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strSet5);
    }

    @Test
    public void test32452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32452");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("Francia                                                                                                                                                                                                                                                                 ", "RF_rf");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test32453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32453");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "Eagaash");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Eagaash" + "'", str1, "Eagaash");
    }

    @Test
    public void test32454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32454");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz\\XTALXAN_ITALIAN_ENGLXSHzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz", "FRFRFRFRFRFRFRFRFRFRFRFRFde_DEFRFRFRFRFRFRFRFRFRFRFRFRFR###############################################", 24);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test32455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32455");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDk...", 62, "_\\u0020_italienisch####################################################################...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDk..." + "'", str3, "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDk...");
    }

    @Test
    public void test32456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32456");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzh", "\\u0048", 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '\r', 87, 88);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 87");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test32457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32457");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxNCHI", (java.lang.CharSequence) "8600u\\                                 hsiAgE_NAILATI_TiATti                                        ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test32458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32458");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("               Deutschland");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test32459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32459");
        java.lang.String str1 = org.apache.commons.lang3.CharUtils.toString((java.lang.Character) '\u6cd5');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u6cd5" + "'", str1, "\u6cd5");
    }

    @Test
    public void test32460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32460");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("chinesexxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", " (sOUTH kORN (sOUTH kORkOREAN (sOUTH kORkOREAN (sOUTH kORkOREAN (sOUTH kORkOREAN (sOUTH kORkOREANkOREA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test32461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32461");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("und");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList3 = java.util.Locale.LanguageRange.parse("fr");
        java.util.Locale locale4 = java.util.Locale.ROOT;
        java.lang.String str5 = locale4.getISO3Country();
        java.util.Set<java.lang.String> strSet6 = locale4.getUnicodeLocaleKeys();
        java.lang.String str7 = java.util.Locale.lookupTag(languageRangeList3, (java.util.Collection<java.lang.String>) strSet6);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList9 = java.util.Locale.LanguageRange.parse("en");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap10 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList11 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList9, strMap10);
        java.util.Locale.LanguageRange[] languageRangeArray12 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList13 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList13, languageRangeArray12);
        java.lang.String[] strArray17 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        java.util.Locale.FilteringMode filteringMode20 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList21 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList13, (java.util.Collection<java.lang.String>) strList18, filteringMode20);
        java.util.Locale.LanguageRange[] languageRangeArray22 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList23 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList23, languageRangeArray22);
        java.lang.String[] strArray27 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList28 = new java.util.ArrayList<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList28, strArray27);
        java.util.Locale.FilteringMode filteringMode30 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList31 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList23, (java.util.Collection<java.lang.String>) strList28, filteringMode30);
        java.lang.String[] strArray33 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList34 = new java.util.ArrayList<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList34, strArray33);
        java.util.List<java.lang.String> strList36 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList23, (java.util.Collection<java.lang.String>) strList34);
        java.lang.String str37 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList13, (java.util.Collection<java.lang.String>) strList34);
        java.util.Locale.LanguageRange[] languageRangeArray38 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList39 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList39, languageRangeArray38);
        java.util.Locale.LanguageRange[] languageRangeArray41 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList42 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList42, languageRangeArray41);
        java.lang.String[] strArray46 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList47 = new java.util.ArrayList<java.lang.String>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList47, strArray46);
        java.util.Locale.FilteringMode filteringMode49 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList50 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList42, (java.util.Collection<java.lang.String>) strList47, filteringMode49);
        java.util.Locale.FilteringMode filteringMode51 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList52 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList39, (java.util.Collection<java.lang.String>) strList47, filteringMode51);
        java.util.Locale.LanguageRange[] languageRangeArray53 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList54 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList54, languageRangeArray53);
        java.util.Locale.LanguageRange[] languageRangeArray56 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList57 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList57, languageRangeArray56);
        java.lang.String[] strArray61 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList62 = new java.util.ArrayList<java.lang.String>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList62, strArray61);
        java.util.Locale.FilteringMode filteringMode64 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList65 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList57, (java.util.Collection<java.lang.String>) strList62, filteringMode64);
        java.util.Locale.FilteringMode filteringMode66 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList67 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList54, (java.util.Collection<java.lang.String>) strList62, filteringMode66);
        java.util.List<java.lang.String> strList68 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList13, (java.util.Collection<java.lang.String>) strList52, filteringMode66);
        java.lang.String str69 = java.util.Locale.lookupTag(languageRangeList11, (java.util.Collection<java.lang.String>) strList52);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap71 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList72 = java.util.Locale.LanguageRange.parse("ENGLISCH", strMap71);
        java.util.Locale locale73 = java.util.Locale.ITALIAN;
        java.util.Set<java.lang.Character> charSet74 = locale73.getExtensionKeys();
        java.lang.String str75 = locale73.getVariant();
        java.lang.String str76 = locale73.getDisplayName();
        java.lang.String str77 = locale73.getCountry();
        java.util.Set<java.lang.String> strSet78 = locale73.getUnicodeLocaleKeys();
        java.lang.String str79 = java.util.Locale.lookupTag(languageRangeList72, (java.util.Collection<java.lang.String>) strSet78);
        java.lang.String str81 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet78, "X");
        java.util.List<java.lang.String> strList82 = java.util.Locale.filterTags(languageRangeList11, (java.util.Collection<java.lang.String>) strSet78);
        java.util.List<java.lang.String> strList83 = java.util.Locale.filterTags(languageRangeList3, (java.util.Collection<java.lang.String>) strSet78);
        java.util.List<java.lang.String> strList84 = java.util.Locale.filterTags(languageRangeList1, (java.util.Collection<java.lang.String>) strList83);
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(languageRangeList3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(languageRangeList9);
        org.junit.Assert.assertNotNull(languageRangeList11);
        org.junit.Assert.assertNotNull(languageRangeArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + filteringMode20 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode20.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(languageRangeArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + filteringMode30 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode30.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList31);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(strList36);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(languageRangeArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(languageRangeArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + filteringMode49 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode49.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList50);
        org.junit.Assert.assertTrue("'" + filteringMode51 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode51.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList52);
        org.junit.Assert.assertNotNull(languageRangeArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(languageRangeArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + filteringMode64 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode64.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList65);
        org.junit.Assert.assertTrue("'" + filteringMode66 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode66.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList67);
        org.junit.Assert.assertNotNull(strList68);
        org.junit.Assert.assertNull(str69);
        org.junit.Assert.assertNotNull(languageRangeList72);
        org.junit.Assert.assertNotNull(locale73);
        org.junit.Assert.assertEquals(locale73.toString(), "it");
        org.junit.Assert.assertNotNull(charSet74);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "Italian" + "'", str76, "Italian");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertNotNull(strSet78);
        org.junit.Assert.assertNull(str79);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
        org.junit.Assert.assertNotNull(strList82);
        org.junit.Assert.assertNotNull(strList83);
        org.junit.Assert.assertNotNull(strList84);
    }

    @Test
    public void test32462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32462");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("h");
        java.lang.String str2 = languageRange1.getRange();
        java.lang.String str3 = languageRange1.getRange();
        double double4 = languageRange1.getWeight();
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("     Englisch", "FRA\326SIS\n(FRAKREI)");
        boolean boolean8 = languageRange1.equals((java.lang.Object) "     Englisch");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h" + "'", str2, "h");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "h" + "'", str3, "h");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test32463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32463");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("                                                                                                               ))))))))))))))))))))))))))))))))))))))))))))))))))))", "zHO");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                               ))))))))))))))))))))))))))))))))))))))))))))))))))))" + "'", str2, "                                                                                                               ))))))))))))))))))))))))))))))))))))))))))))))))))))");
    }

    @Test
    public void test32464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32464");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("z...", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test32465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32465");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("HSXLGNE_NAILATI_NAXLATX\\", 65);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
    }

    @Test
    public void test32466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32466");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("", 34, '-');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "----------------------------------" + "'", str3, "----------------------------------");
    }

    @Test
    public void test32467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32467");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("ITALIAN4ITALIAN4ITALIAN4ITALIA    IIIIIIIIII...........................", 107, "                                                          nnnnnnnnnnnnnnnnnnne                               ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                  ITALIAN4ITALIAN4ITALIAN4ITALIA    IIIIIIIIII...........................                  " + "'", str3, "                  ITALIAN4ITALIAN4ITALIAN4ITALIA    IIIIIIIIII...........................                  ");
    }

    @Test
    public void test32468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32468");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                ");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test32469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32469");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "FR-caFR-caFR-c8600U\\FR-caFR-caFR-ca", (java.lang.CharSequence) "hi!       9Italienisch9italian_ITALIAN_English9HI!9hi!9ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...9\\u00349HI!9Italian9\\u00619\\u00239hi!9iTALIAN9Chinese (China)9hi!9zh_CN9iTALIAN9en9Italienisch");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "FR-caFR-caFR-c8600U\\FR-caFR-caFR-ca" + "'", charSequence2, "FR-caFR-caFR-c8600U\\FR-caFR-caFR-ca");
    }

    @Test
    public void test32470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32470");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("\\u005", "", (int) '\\');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, 'A');
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("\\u005", "", (int) '\\');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEach("\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069!IH\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\", strArray6, strArray12);
        java.lang.String[] strArray17 = org.apache.commons.lang3.StringUtils.split("\uc601\uc5b4", "4444444fra", 0);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                                                                                                                  \\U0068", strArray6, strArray17);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.endsWithAny("\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u0...xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u0", strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\u005" + "'", str8, "\\u005");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069!IH\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\" + "'", str13, "\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069!IH\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "                                                                                                                  \\U0068" + "'", str18, "                                                                                                                  \\U0068");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test32471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32471");
        java.util.Locale locale1 = java.util.Locale.ENGLISH;
        java.lang.String str2 = locale1.getDisplayLanguage();
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.upperCase("!IH", locale1);
        java.util.Set<java.lang.Character> charSet4 = locale1.getExtensionKeys();
        java.util.Locale.Category category5 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale6 = java.util.Locale.getDefault(category5);
        java.util.Locale locale7 = java.util.Locale.getDefault(category5);
        java.util.Locale locale8 = java.util.Locale.FRENCH;
        java.util.Locale locale9 = java.util.Locale.ENGLISH;
        java.lang.String str10 = locale9.getDisplayCountry();
        java.lang.String str11 = locale8.getDisplayVariant(locale9);
        java.lang.String str12 = locale9.getDisplayVariant();
        java.util.Locale locale14 = java.util.Locale.forLanguageTag("\\u0020");
        java.lang.String str15 = locale14.getDisplayScript();
        java.util.Locale.setDefault(locale14);
        java.lang.String str17 = locale14.getScript();
        java.lang.String str18 = locale9.getDisplayCountry(locale14);
        java.lang.String str19 = locale7.getDisplayVariant(locale14);
        java.lang.String str20 = locale1.getDisplayVariant(locale7);
        java.lang.Object obj21 = locale7.clone();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "English" + "'", str2, "English");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!IH" + "'", str3, "!IH");
        org.junit.Assert.assertNotNull(charSet4);
        org.junit.Assert.assertTrue("'" + category5 + "' != '" + java.util.Locale.Category.FORMAT + "'", category5.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals(obj21.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj21), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj21), "");
    }

    @Test
    public void test32472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32472");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                              \\     ", "");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Deutsch", 'i');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEach("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444en", strArray4, strArray7);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray7);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.startsWithAny("hhhhhhhhhhhhhhhgencehhhhhhhhhhhhhhh", strArray7);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444en" + "'", str8, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444en");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Deutsch" + "'", str9, "Deutsch");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test32473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32473");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "\ud504\ub791\uc2a4\uc5b4,A)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test32474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32474");
        java.util.Locale locale2 = new java.util.Locale("\\u0068");
        boolean boolean3 = locale2.hasExtensions();
        java.util.Locale locale6 = new java.util.Locale("!IH", "Hhhhhhhhhh");
        java.lang.String str7 = locale6.getDisplayLanguage();
        java.lang.String str8 = locale2.getDisplayName(locale6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.upperCase("Franz\366sischFranzosisch (Frankreich)uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", locale2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = locale2.getUnicodeLocaleType("                                                 aNCHc                                                 ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key:                                                  aNCHc                                                 ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "\\u0068");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals(locale6.toString(), "!ih_HHHHHHHHHH");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "!ih" + "'", str7, "!ih");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\u0068" + "'", str8, "\\u0068");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "FRANZ\326SISCHFRANZOSISCH (FRANKREICH)UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU" + "'", str9, "FRANZ\326SISCHFRANZOSISCH (FRANKREICH)UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
    }

    @Test
    public void test32475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32475");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("FRFRFRFRFRFRFRFRFRFRFRFRFd", (int) 'T');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "FRFRFRFRFRFRFRFRFRFRFRFRFd                                                          " + "'", str2, "FRFRFRFRFRFRFRFRFRFRFRFRFd                                                          ");
    }

    @Test
    public void test32476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32476");
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
        java.lang.String str11 = locale7.getDisplayVariant();
        java.lang.String str12 = locale7.getVariant();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "allemand" + "'", str4, "allemand");
        org.junit.Assert.assertTrue("'" + category6 + "' != '" + java.util.Locale.Category.FORMAT + "'", category6.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr_CA");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test32477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32477");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "GGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGkorezhzhzhzhzhzhzhzhzhzhfraadzhaezhafzhagzhaizhalzhamzhanzhaozhaqzharzhaszhazhzhzhzhzhzhzemandn (south korea)");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 267 + "'", int1 == 267);
    }

    @Test
    public void test32478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32478");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("...\r\r\r\r\r\r\r\r...", "English");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test32479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32479");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "!_\\U0020_Itle#########################################################################################");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test32480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32480");
        char[] charArray11 = new char[] { ' ', '4' };
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!", charArray11);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "en", charArray11);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("       !IH", charArray11);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "China", charArray11);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny("n       nn", charArray11);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny("\\u0020hi!       _\\U0020_Italienisch################", charArray11);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII", charArray11);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsAny("UD", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test32481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32481");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "\\u0034\\u00hcstuD\\u0034\\u00");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test32482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32482");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) 'F', 'b');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'F' + "'", char2 == 'F');
    }

    @Test
    public void test32483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32483");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("           e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test32484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32484");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("\\atalaaa_ITALIAN_Eaglaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaalgaE_NAILATI_aaalata\\" + "'", str1, "aaalgaE_NAILATI_aaalata\\");
    }

    @Test
    public void test32485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32485");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("ais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)A             ", "                                                                              \\                                                                                   \\                                                                                   \\       Hcsineilat");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test32486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32486");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("GBR");
        double double2 = languageRange1.getWeight();
        double double3 = languageRange1.getWeight();
        double double4 = languageRange1.getWeight();
        double double5 = languageRange1.getWeight();
        java.lang.String str6 = languageRange1.getRange();
        java.lang.String str7 = languageRange1.getRange();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "gbr" + "'", str6, "gbr");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "gbr" + "'", str7, "gbr");
    }

    @Test
    public void test32487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32487");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("x-lvariant-A", "i");
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.split("u", 'A');
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("BGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGTALIAN");
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEach("!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I", strArray8, strArray10);
        java.lang.String[] strArray16 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("!IH", "       !IH", (int) (byte) 1);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray16, ' ');
        int int19 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray16);
        java.lang.String[] strArray22 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "Deutsch");
        java.lang.String[] strArray24 = org.apache.commons.lang3.StringUtils.stripAll(strArray22, "franz\366sisch (frankreich)");
        java.lang.String str26 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray22, ' ');
        java.lang.String str27 = org.apache.commons.lang3.StringUtils.replaceEach("It_I", strArray16, strArray22);
        java.lang.String str28 = org.apache.commons.lang3.StringUtils.replaceEach("\\U0069HHHHHHHHHH", strArray8, strArray16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str29 = org.apache.commons.lang3.StringUtils.replaceEach("francefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrance", strArray3, strArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 2 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I" + "'", str11, "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "!IH" + "'", str18, "!IH");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "It_I" + "'", str27, "It_I");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\\U0069HHHHHHHHHH" + "'", str28, "\\U0069HHHHHHHHHH");
    }

    @Test
    public void test32488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32488");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("ITTAIT_ITALIAN_EGAISHI!_\\U0020_ITLE###########", "uuuuu");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ITTAIT_ITALIAN_EGAISHI!_\\U0020_ITLE###########" + "'", str2, "ITTAIT_ITALIAN_EGAISHI!_\\U0020_ITLE###########");
    }

    @Test
    public void test32489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32489");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "ermanglischIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII nglischIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII(nglischIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIermaynglischIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII)nglischIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII                                                 nglischIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIITALIANnglischIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII                                                  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ermanglischIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII nglischIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII(nglischIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIermaynglischIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII)nglischIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII                                                 nglischIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIITALIANnglischIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII                                                  " + "'", str1, "ermanglischIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII nglischIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII(nglischIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIermaynglischIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII)nglischIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII                                                 nglischIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIITALIANnglischIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII                                                  ");
    }

    @Test
    public void test32490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32490");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("BFIBGIBHIBIIBJIBLIBMIBNIBOIBQIBRIBSIBTIBVIBWIBYIBZICAICCICDICFICGICHICIICKICLICMICNICOICRICUICVICWICXICYICZIDEIDJIDKIDMIDOIDZIECIEEIEGIEHIERIESIETIFIIFJIFKIFMIFOIFRIGAIGBIGDIGEIGFIGGIGHIGIIGLIGMIGNIGPIGQIGRIGSIGTIGUIGWIGYIHKIHM", "", 25);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 227 + "'", int3 == 227);
    }

    @Test
    public void test32491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32491");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("Azhzhzhzhzhzhzhzhzhzh");
        java.lang.String str2 = locale1.getDisplayLanguage();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test32492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32492");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("E44444444444444444444444444444444!IHg44444444444444444444444444444444!IH44444444444444444444444444444444!IHsh", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test32493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32493");
        java.util.Locale locale0 = java.util.Locale.ITALY;
        java.lang.String str1 = locale0.getScript();
        java.lang.String str2 = locale0.getDisplayCountry();
        boolean boolean3 = locale0.hasExtensions();
        java.util.Locale.setDefault(locale0);
        boolean boolean5 = locale0.hasExtensions();
        java.lang.String str6 = locale0.getISO3Country();
        java.util.Locale locale7 = java.util.Locale.FRANCE;
        java.util.Locale locale8 = java.util.Locale.ITALIAN;
        java.lang.String str10 = locale8.getExtension('h');
        java.lang.String str11 = locale7.getDisplayScript(locale8);
        boolean boolean12 = locale7.hasExtensions();
        java.lang.String str13 = locale7.getVariant();
        java.util.Set<java.lang.String> strSet14 = locale7.getUnicodeLocaleKeys();
        java.lang.String str15 = locale0.getDisplayLanguage(locale7);
        java.lang.String str17 = locale0.getExtension('a');
        java.util.Set<java.lang.String> strSet18 = locale0.getUnicodeLocaleKeys();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Italy" + "'", str2, "Italy");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ITA" + "'", str6, "ITA");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "it");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "italien" + "'", str15, "italien");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(strSet18);
    }

    @Test
    public void test32494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32494");
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
        java.lang.String str23 = locale21.getISO3Language();
        java.lang.String str25 = locale21.getExtension('k');
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it_IT");
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "und" + "'", str23, "und");
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test32495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32495");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                            fr_FR                  ", "Italia                                                               ", 100);
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test32496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32496");
        java.lang.String str1 = org.apache.commons.lang3.CharUtils.toString((java.lang.Character) '1');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1" + "'", str1, "1");
    }

    @Test
    public void test32497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32497");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("FR-CAFR-CAFR-CAFR-CAFR-CAFR-CAFR-CAFR-CAFR-CAFR-CAFR-CAFR\\U000DFR-CAFR-CAFR-CAFR-CAFR-CAFR-CAFR-CAFR-CAFR-CAFR-CAFR-CAFR", 163);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test32498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32498");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("fr-cafr-cafr-c8600u\\fr-cafr-cafr-ca", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "fr-cafr-cafr-c8600u\\fr-cafr-cafr-ca" + "'", str2, "fr-cafr-cafr-c8600u\\fr-cafr-cafr-ca");
    }

    @Test
    public void test32499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32499");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                                               \\U0052", 116, 'I');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII                                                               \\U0052" + "'", str3, "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII                                                               \\U0052");
    }

    @Test
    public void test32500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32500");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("\\u0034\\u00hcstuD\\u0034\\u0", "ITALIAN_ITALIAN_ENGLISH         ITALIAN_!IHITTAIT_ITALIAN_EGAISHE             G                          SHE             G                          SHE             G                          SHE             G                          SHE             G                          SHE             G                          SHE             G                          SHE             G");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }
}
