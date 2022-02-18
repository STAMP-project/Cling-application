import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest37 {

    public static boolean debug = false;

    @Test
    public void test18501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18501");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.util.Set<java.lang.Character> charSet1 = locale0.getExtensionKeys();
        java.lang.String str2 = locale0.getVariant();
        java.lang.String str3 = locale0.getDisplayName();
        java.lang.String str4 = locale0.getDisplayName();
        java.lang.String str5 = locale0.getDisplayLanguage();
        java.lang.String str7 = locale0.getExtension('e');
        java.util.Locale locale8 = locale0.stripExtensions();
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
        java.lang.String str27 = locale0.getDisplayName(locale23);
        java.util.Set<java.lang.String> strSet28 = locale23.getUnicodeLocaleKeys();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertNotNull(charSet1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Italian" + "'", str3, "Italian");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Italian" + "'", str4, "Italian");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Italian" + "'", str5, "Italian");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "it");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\\u0034" + "'", str14, "\\u0034");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "French (Canada)" + "'", str15, "French (Canada)");
        org.junit.Assert.assertTrue("'" + category16 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category16.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale17);
// flaky:         org.junit.Assert.assertEquals(locale17.toString(), "\\u005c");
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "italien" + "'", str27, "italien");
        org.junit.Assert.assertNotNull(strSet28);
    }

    @Test
    public void test18502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18502");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("Italian");
        java.util.Locale locale4 = builder0.build();
        java.util.Locale locale5 = java.util.Locale.CHINESE;
        java.lang.String str6 = locale5.getISO3Language();
        java.util.Locale.Builder builder7 = builder0.setLocale(locale5);
        java.util.Locale.Builder builder8 = builder7.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder7.setUnicodeLocaleKeyword("ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZ", "hcsineilati");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZ [at index 0]");
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
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test18503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18503");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("zh_CN", 241, 68);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test18504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18504");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("italian    ", "zhANzhAOzhAQzhARzhASzhAzhzhzhzhzhzhzhzhzhzh", 17);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, 'x');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "italian    " + "'", str5, "italian    ");
    }

    @Test
    public void test18505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18505");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "french (canada)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test18506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18506");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("9hhhhhhhhhh_\\U0078", 27);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "         9hhhhhhhhhh_\\U0078" + "'", str2, "         9hhhhhhhhhh_\\U0078");
    }

    @Test
    public void test18507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18507");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "\\U0020ITALIANITALIANITALIANITAL");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test18508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18508");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "englischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglisch", (java.lang.CharSequence) "                                                                                                               italian  ");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "englischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglisch" + "'", charSequence2, "englischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglisch");
    }

    @Test
    public void test18509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18509");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("FRANZ\326SISCHFRANZOSISCH (FRANKREICH)", "HI!hi!", (int) 'U');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "itTAiT_ITALIAN_EgAish                                                                               ", 374, (int) 'B');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test18510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18510");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test18511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18511");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("\uc601\uc5b4");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test18512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18512");
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
        java.util.Locale.LanguageRange[] languageRangeArray13 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList14 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList14, languageRangeArray13);
        java.lang.String[] strArray18 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        java.util.Locale.FilteringMode filteringMode21 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList22 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList14, (java.util.Collection<java.lang.String>) strList19, filteringMode21);
        java.util.Locale.FilteringMode filteringMode23 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList24 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList11, (java.util.Collection<java.lang.String>) strList19, filteringMode23);
        java.util.Collection<java.util.Locale> localeCollection25 = null;
        java.util.List<java.util.Locale> localeList26 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList11, localeCollection25);
        java.util.Locale locale27 = java.util.Locale.lookup(languageRangeList2, (java.util.Collection<java.util.Locale>) localeList26);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap28 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList29 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList2, strMap28);
        java.util.Locale locale30 = java.util.Locale.ITALIAN;
        java.lang.String str31 = locale30.getDisplayLanguage();
        java.util.Locale locale32 = locale30.stripExtensions();
        java.lang.String str33 = locale30.getLanguage();
        java.util.Set<java.lang.String> strSet34 = locale30.getUnicodeLocaleKeys();
        java.lang.String str36 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet34, "\\u0020iTALIANiTALIANiTALIANiTALI\\u0020iTALIANiTALIANiTALIANiTAL");
        java.lang.String str38 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet34, "DEUTSCH");
        java.util.List<java.lang.String> strList39 = java.util.Locale.filterTags(languageRangeList29, (java.util.Collection<java.lang.String>) strSet34);
        java.lang.String str41 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strList39, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!aNCHc!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "it");
        org.junit.Assert.assertNotNull(charSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "italien" + "'", str6, "italien");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(languageRangeArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(languageRangeArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + filteringMode21 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode21.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertTrue("'" + filteringMode23 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode23.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(localeList26);
        org.junit.Assert.assertNull(locale27);
        org.junit.Assert.assertNotNull(languageRangeList29);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "it");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "italien" + "'", str31, "italien");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "it");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "it" + "'", str33, "it");
        org.junit.Assert.assertNotNull(strSet34);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(strList39);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
    }

    @Test
    public void test18513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18513");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("de_DE", "fRENCH (fRANCE)");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test18514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18514");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\\u0020iTALIANiTALIANiTALIANiTALI", "                                                    ", (int) 'u');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray4);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.endsWithAny("titititititit", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\\u0020iTALIANiTALIANiTALIANiTALI" + "'", str5, "\\u0020iTALIANiTALIANiTALIANiTALI");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test18515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18515");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("Italian");
        java.util.Locale locale4 = builder3.build();
        java.util.Locale locale5 = builder3.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder3.setScript("Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhz");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: Azhzhzhzhzhzhzhzhzhzhfranc?ais (France)Azhzhzhzhzhzhzhzhzhzhfranc?ais (France)Azhzhzhzhzhzhzhzhzhzhfranc?ais (France)Azhzhzhzhzhzhzhzhzhzhfranc?ais (France)Azhzhzhzhzhzhzhzhzhzhfranc?ais (France)Azhzhzhzhzhzhzhzhzhzhfranc?ais (France)Azhzhzhzhzhzhzhzhzhzhfranc?ais (France)Azhzhzhzhzhzhzhzhzhzhfranc?ais (France)Azhzhzhzhzhzhzhzhzhzhfranc?ais (France)Azhzhzhzhzhzhzhzhzhzhfranc?ais (France)Azhzhzhzhzhzhzhzhzhzhfranc?ais (France)Azhzhzhzhzhzhzhzhzhzhfranc?ais (France)Azhzhzhzhzhzhzhzhzhzhfranc?ais (France)Azhzhzhzhzhzhzhzhzhzhfranc?ais (France)Azhzhzhzhzhzhzhzhzhzhfranc?ais (France)Azhzhzhzhzhzhzhzhzhzhfranc?ais (France)Azhzhzhzhzhzhzhzhzhzhfranc?ais (France)Azhzhzhzhzhzhzhzhzhzhfranc?ais (France)Azhzhzhzhzhzhzhzhzhzhfranc?ais (France)Azhzhzhzhzhzhzhzhzhzhfranc?ais (France)Azhzhzhzhzhzhzhzhzhzhfranc?ais (France)Azhzhzhzhzhzhzhzhzhzhfranc?ais (France)Azhzhzhzhzhzhzhzhzhz [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "italian");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "italian");
    }

    @Test
    public void test18516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18516");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("4444444fra");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444FRA" + "'", str1, "4444444FRA");
    }

    @Test
    public void test18517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18517");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("ILATiNA...royaume-uniroyaume-uniroy", "  \\u007a");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test18518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18518");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("", 51);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                   " + "'", str2, "                                                   ");
    }

    @Test
    public void test18519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18519");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Locale locale1 = java.util.Locale.ITALIAN;
        java.lang.String str3 = locale1.getExtension('h');
        java.lang.String str4 = locale0.getDisplayScript(locale1);
        java.lang.String str5 = locale0.getISO3Country();
        java.util.Locale locale6 = java.util.Locale.GERMAN;
        java.util.Locale.setDefault(locale6);
        java.lang.String str8 = locale0.getDisplayName(locale6);
        java.lang.String str9 = locale0.getScript();
        java.lang.String str10 = locale0.getCountry();
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "FR" + "'", str10, "FR");
    }

    @Test
    public void test18520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18520");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("HCSTUD \\U0034");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HCSTUD \\U0034" + "'", str1, "HCSTUD \\U0034");
    }

    @Test
    public void test18521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18521");
        java.util.Locale locale0 = java.util.Locale.CHINESE;
        java.util.Locale locale1 = java.util.Locale.FRENCH;
        java.lang.String str2 = locale1.getDisplayName();
        java.lang.String str4 = locale1.getExtension('C');
        java.lang.String str5 = locale0.getDisplayLanguage(locale1);
        java.lang.String str6 = locale1.getISO3Country();
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Italien", "\\0020iTALIANiTALIANiTALIANiTALzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz", (int) 'e');
        boolean boolean11 = locale1.equals((java.lang.Object) "\\0020iTALIANiTALIANiTALIANiTALzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Franz\366sisch" + "'", str2, "Franz\366sisch");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chinois" + "'", str5, "chinois");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test18522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18522");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("...EnglishEnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn", "   \\U0034\\U00");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test18523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18523");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "zhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozho");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test18524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18524");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale locale4 = java.util.Locale.CHINESE;
        java.lang.String str5 = locale4.getCountry();
        java.util.Locale.Builder builder6 = builder3.setLocale(locale4);
        java.util.Locale.Builder builder8 = builder3.removeUnicodeLocaleAttribute("italy");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder3.addUnicodeLocaleAttribute("                                                      !ih dalleman                                                       ");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute:                                                       !ih dalleman                                                        [at index 0]");
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
    }

    @Test
    public void test18525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18525");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("444444444it");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444it" + "'", str1, "444444444it");
    }

    @Test
    public void test18526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18526");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("GBR");
        java.lang.String str2 = languageRange1.getRange();
        double double3 = languageRange1.getWeight();
        double double4 = languageRange1.getWeight();
        java.lang.String str5 = languageRange1.getRange();
        java.lang.String str6 = languageRange1.getRange();
        java.util.Locale locale8 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale9 = java.util.Locale.FRANCE;
        java.util.Locale locale10 = java.util.Locale.ITALIAN;
        java.lang.String str12 = locale10.getExtension('h');
        java.lang.String str13 = locale9.getDisplayScript(locale10);
        java.lang.String str14 = locale9.getISO3Country();
        java.util.Locale locale15 = java.util.Locale.GERMAN;
        java.util.Locale.setDefault(locale15);
        java.lang.String str17 = locale9.getDisplayName(locale15);
        java.lang.String str18 = locale8.getDisplayLanguage(locale15);
        java.util.Locale.Category category19 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale20 = java.util.Locale.getDefault(category19);
        java.util.Locale locale22 = java.util.Locale.forLanguageTag("hi!");
        java.lang.String str23 = locale22.getCountry();
        java.util.Locale.setDefault(category19, locale22);
        java.util.Locale.Category category25 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale26 = java.util.Locale.getDefault(category25);
        java.util.Locale locale27 = java.util.Locale.getDefault(category25);
        java.util.Locale.setDefault(category19, locale27);
        java.lang.String str29 = locale8.getDisplayName(locale27);
        java.util.Locale locale30 = locale8.stripExtensions();
        boolean boolean31 = languageRange1.equals((java.lang.Object) locale8);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "gbr" + "'", str2, "gbr");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "gbr" + "'", str5, "gbr");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "gbr" + "'", str6, "gbr");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
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
        org.junit.Assert.assertTrue("'" + category19 + "' != '" + java.util.Locale.Category.FORMAT + "'", category19.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "de");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + category25 + "' != '" + java.util.Locale.Category.FORMAT + "'", category25.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test18527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18527");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         italian_ITALIAN_EnglisF", "Azhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais cinese (cina)\\u0069h..France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)A");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test18528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18528");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\\u0046", "\\0020iTALIANiTALIANiTALIANiTAL");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concatWith("i\\u0020italianitalianitalianitaliit         \\xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", (java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\u0046" + "'", str4, "\\u0046");
    }

    @Test
    public void test18529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18529");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTU005CTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT", "en_US                ita                ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test18530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18530");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "#AAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test18531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18531");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("JP");
        boolean boolean2 = locale1.hasExtensions();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "jp");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test18532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18532");
        java.util.Locale locale3 = new java.util.Locale("hi!", "English", "");
        java.lang.String str4 = locale3.getDisplayVariant();
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
        java.lang.String str18 = locale7.getScript();
        java.lang.String str19 = locale3.getDisplayLanguage(locale7);
        java.util.Locale locale20 = locale3.stripExtensions();
        java.lang.String str21 = locale3.getISO3Language();
        org.junit.Assert.assertEquals(locale3.toString(), "hi!_ENGLISH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + category5 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category5.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "de");
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "hi!_ENGLISH");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test18533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18533");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiControl('\u671d');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test18534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18534");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("                                        itTAiT_ITALIAN_EgAish                       )modgniK detinU( hsilgnE", "99999\\u0021", "8", 92);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                        itTAiT_ITALIAN_EgAish                       )modgniK detinU( hsilgnE" + "'", str4, "                                        itTAiT_ITALIAN_EgAish                       )modgniK detinU( hsilgnE");
    }

    @Test
    public void test18535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18535");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkedkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk", "CANADA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test18536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18536");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("zhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhz\\U0078zhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzh", "hi!DEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEU\\u0061DEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEU\\u0061DEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEU\\u0061DEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEU\\u0061DEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEU\\u0061DEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEU\\u0061DEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEU\\u0061_\\U0020_Italienisch#########################################################################################");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concatWith("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxNCHI", (java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhz\\U0078zhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzh" + "'", str4, "zhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhz\\U0078zhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzh");
    }

    @Test
    public void test18537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18537");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("ZHO", " \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test18538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18538");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("aaaaaaaaaaaaaaaaaaaaaaaaaaILaaaaaaaaaaaaaaaaaaaaaaaaaaIL", "hi!        (\\U0020,Italienisch#########################################################################################nnn");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test18539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18539");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("italian (italian,english", 'c');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test18540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18540");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "\\\\\\\\\\\\\\\\\\                                  !ih                            tal                                  !ih                            an_ITALIAN_Engl                                  !ih                            sh");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test18541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18541");
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
        boolean boolean20 = locale0.hasExtensions();
        java.lang.Object obj21 = locale0.clone();
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals(obj21.toString(), "fr_FR");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj21), "fr_FR");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj21), "fr_FR");
    }

    @Test
    public void test18542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18542");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("Ialensch#########################################################################################", "tedesco    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test18543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18543");
        char[] charArray8 = new char[] { ' ', '4' };
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!", charArray8);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny("French (Canada)", charArray8);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", charArray8);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "englisch", charArray8);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "zhANzhAOzhAQzhARzhASzhAzhzhzhzhzhzhzhzhzhzh", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test18544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18544");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("44444444444444ITALIAN4444444444", "", 163);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test18545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18545");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("Iinglese");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Iinglese" + "'", str1, "Iinglese");
    }

    @Test
    public void test18546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18546");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("", 'c', '5');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test18547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18547");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("HHHHHHHHH", "...HBI...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test18548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18548");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("2", (double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=97.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test18549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18549");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "\\u004e                                                          ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test18550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18550");
        java.util.Locale locale3 = new java.util.Locale("                                                     \\u005c         ", "", "");
        java.lang.String str5 = locale3.getExtension('x');
        org.junit.Assert.assertEquals(locale3.toString(), "                                                     \\u005c         ");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test18551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18551");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("zho", "                                               8300u\\                                                ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "zho" + "'", str2, "zho");
    }

    @Test
    public void test18552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18552");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("Frnz\366sisch (Knd)", "DEFGILMNOQRSTUWXZBBBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCCCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLLBLCLILKLRLSLTLULVLYMMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNNCNENFNGNINLNONPNRNUNZOMPPEPFPGPHPKPLPMPNPRPSPTPWPYQRERORSRURWSSBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUUGUMUSUYUZVVCVEVGVIVNVUWFWSYEYTZZMZW");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test18553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18553");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "francese (Canada)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test18554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18554");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", 'h');
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concatWith("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxESENIHC", (java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test18555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18555");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "\\U0023");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test18556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18556");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "\u4e2d\u6587\u4e2d\u56fd)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test18557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18557");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "hi!       allemandItalienischallemanditalian_ITALIAN_EnglishallemandHI!allemandhi!allemandADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...allemand\\u0034allemandHI!allemandItalianallemand\\u0061allemand\\u0023allemandhi!allemandiTALIANallemandChinese (China)allemandhi!allemandzh_CNallemandiTALIANallemandenallemandItalienisch");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!       allemandItalienischallemanditalian_ITALIAN_EnglishallemandHI!allemandhi!allemandADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...allemand\\u0034allemandHI!allemandItalianallemand\\u0061allemand\\u0023allemandhi!allemandiTALIANallemandChinese (China)allemandhi!allemandzh_CNallemandiTALIANallemandenallemandItalienisch" + "'", str1, "hi!       allemandItalienischallemanditalian_ITALIAN_EnglishallemandHI!allemandhi!allemandADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...allemand\\u0034allemandHI!allemandItalianallemand\\u0061allemand\\u0023allemandhi!allemandiTALIANallemandChinese (China)allemandhi!allemandzh_CNallemandiTALIANallemandenallemandItalienisch");
    }

    @Test
    public void test18558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18558");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABB");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test18559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18559");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                  HSIAGE_NAILATI_TIATTIHI!_NAILATI HSILGNE_NAILATI_NAILAT", "cCCC\\CCCC", (int) 'U');
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test18560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18560");
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
        java.util.Locale locale45 = builder44.build();
        java.util.Locale.Builder builder46 = builder44.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder48 = builder46.setScript("iTTAIT_ITALIAN_EGAISH          ");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: iTTAIT_ITALIAN_EGAISH           [at index 0]");
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
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "it");
        org.junit.Assert.assertNotNull(builder46);
    }

    @Test
    public void test18561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18561");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "zhzhzhzhzhzhzhzhzhzhE             g", (java.lang.CharSequence) "...alamanaoaqarasatauawaxazbabbbdbebfbgbhbibjblbmbnbobqbrbsbtbvbwbybzcacccdcfcgchcickclcmcncocrcucvcwcxc......alamaniiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiitalian_italian_englishiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 216 + "'", int2 == 216);
    }

    @Test
    public void test18562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18562");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("8600u\\", 264, 23);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "8600u\\" + "'", str3, "8600u\\");
    }

    @Test
    public void test18563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18563");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("\\u005", 262, 'Y');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\u005YYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYY" + "'", str3, "\\u005YYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYY");
    }

    @Test
    public void test18564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18564");
        char[] charArray12 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray12);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "         ITALIAN_italian_eNGLISH", charArray12);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "          HI!           ", charArray12);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "      ", charArray12);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "e             g                                                                                     ", charArray12);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny("########################################################Franz\366sisc########################################################", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "4##a a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "4##a a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4, #, #, a,  , a]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test18565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18565");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("italieitalNC_hz\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\ritalieital", "TITcnarfesecnarfesecnarf5700u\\rfesecnarfesecnarfesecnarf5700u\\rfesecnarfesecnarfesecnarf5700u\\rfesecnarfesecnarfesecnarf");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "italieitalNC_hz\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\ritalieital" + "'", str2, "italieitalNC_hz\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\ritalieital");
    }

    @Test
    public void test18566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18566");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("                ITA                ", 164);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test18567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18567");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("h_HHHHHHHHH_CV CW CX CY CZ DE DJ DK DM DO DZ EC EE EG EH ER ES ET FI FJ FK", "\351encor\351encor\351encor\351");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h_HHHHHHHHH_CV CW CX CY CZ DE DJ DK DM DO DZ EC EE EG EH ER ES ET FI FJ FK" + "'", str2, "h_HHHHHHHHH_CV CW CX CY CZ DE DJ DK DM DO DZ EC EE EG EH ER ES ET FI FJ FK");
    }

    @Test
    public void test18568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18568");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("royaume-uni ", "inglesehhhhhhhhH");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test18569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18569");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("                                                                                        e                               ", "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIITALIAN_ITALIAN_ENGLISHIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII", 57);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZW", '\r');
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny("cinese (Cina)\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hh", strArray9);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray9);
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.split("HI!");
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.concatWith("iTALIAN", (java.lang.Object[]) strArray14);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("HHHHHHHHHH", strArray9, strArray14);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.replaceEach("Und-iTALIAN", strArray4, strArray9);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray9);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZW" + "'", str11, "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZW");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HI!" + "'", str15, "HI!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HHHHHHHHHH" + "'", str16, "HHHHHHHHHH");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Und-iTALIAN" + "'", str17, "Und-iTALIAN");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test18570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18570");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test18571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18571");
        java.util.Locale locale1 = new java.util.Locale(")))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))\\u0039");
        java.lang.String str2 = locale1.toLanguageTag();
        org.junit.Assert.assertEquals(locale1.toString(), ")))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))\\u0039");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "und" + "'", str2, "und");
    }

    @Test
    public void test18572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18572");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = locale1.getUnicodeLocaleType("\u4e2d\u6587\u4e2d\u56fd)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: ?? (??)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
// flaky:         org.junit.Assert.assertEquals(locale1.toString(), "de");
    }

    @Test
    public void test18573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18573");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder5 = builder1.clear();
        java.util.Locale.Builder builder7 = builder1.setLanguage("RA");
        java.util.Locale.Builder builder9 = builder7.setLanguage("");
        java.util.Locale locale11 = java.util.Locale.KOREA;
        java.lang.String str12 = locale11.getLanguage();
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.upperCase("TALIAN\\u0023", locale11);
        java.util.Locale locale15 = java.util.Locale.FRANCE;
        java.util.Locale locale16 = java.util.Locale.ITALIAN;
        java.lang.String str18 = locale16.getExtension('h');
        java.lang.String str19 = locale15.getDisplayScript(locale16);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.lowerCase("HI!       ", locale15);
        java.lang.String str21 = locale11.getDisplayVariant(locale15);
        java.util.Locale.Builder builder22 = builder7.setLocale(locale11);
        java.util.Locale locale23 = builder7.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder26 = builder7.setExtension('n', "\\u006bCinese (Cina)\\u0069h..");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension value: \\u006bCinese (Cina)\\u0069h.. [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Franz\366sisch (Kanada)" + "'", str3, "Franz\366sisch (Kanada)");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ko" + "'", str12, "ko");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "TALIAN\\U0023" + "'", str13, "TALIAN\\U0023");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "it");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!       " + "'", str20, "hi!       ");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "ko_KR");
    }

    @Test
    public void test18574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18574");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("\\u0023", 53, 'U');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\u0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU" + "'", str3, "\\u0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
    }

    @Test
    public void test18575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18575");
        java.util.Locale locale2 = new java.util.Locale("AnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihC", "hi!(\\U0020,Italienisch############################################hi!       ");
        org.junit.Assert.assertEquals(locale2.toString(), "anihcanihcanihcanihcanihcanihcanihcanihcanihcanihcanihcanihcanihcanihcanihcanihcanihcanihcanihcanihcanihcanihcanihcanihcanihcanihcanihcanihcanihcanihcanihcanihcanihcanihcanihcanihcanihcanihcanihcanihcanihcanihcanihcanihcanihcanihcanihcanihcanihcanihcanihcanihcanihcanihcanihcanihcanihcanihcanihcanihcanihcanihcanihcanihcanihcanihcanihcanihcanihcanihcanihcanihcanihcanihcanihcanihcanihcanihcanihcanihcanihcanihcanihcanihcanihcanihcanihcanihcanihcanihcanihcanihcanihcanihcanihcanihcanihcanihcanihcanihc_HI!(\\U0020,ITALIENISCH############################################HI!       ");
    }

    @Test
    public void test18576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18576");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "\\U0020IiTALIAN\\U0020I", (java.lang.CharSequence) "FRENCH");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test18577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18577");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale2 = new java.util.Locale("...ANiTALI");
        java.util.Locale.setDefault(category0, locale2);
        java.util.Locale locale4 = java.util.Locale.FRANCE;
        java.util.Locale locale5 = java.util.Locale.ITALIAN;
        java.lang.String str7 = locale5.getExtension('h');
        java.lang.String str8 = locale4.getDisplayScript(locale5);
        java.util.Locale locale9 = locale4.stripExtensions();
        java.lang.String str10 = locale9.getISO3Country();
        java.util.Locale locale12 = new java.util.Locale("en");
        boolean boolean13 = locale12.hasExtensions();
        java.util.Set<java.lang.String> strSet14 = locale12.getUnicodeLocaleKeys();
        java.lang.String str15 = locale9.getDisplayCountry(locale12);
        java.lang.String str16 = locale9.getISO3Language();
        java.lang.String str17 = locale9.getLanguage();
        java.util.Locale.setDefault(category0, locale9);
        java.util.Locale locale20 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale.setDefault(category0, locale20);
        java.lang.String str22 = locale20.getISO3Language();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertEquals(locale2.toString(), "...anitali");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "it");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "FRA" + "'", str10, "FRA");
        org.junit.Assert.assertEquals(locale12.toString(), "en");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "France" + "'", str15, "France");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "fra" + "'", str16, "fra");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "fr" + "'", str17, "fr");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test18578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18578");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("i", "         ITALIAN_ITALIAN_ENGLISH         ITALIAN_!IHITTAIT_ITALIAN_EGAISH", (int) 'E');
        java.lang.Class<?> wildcardClass4 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test18579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18579");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("!ih!ih!ih!ih!ih!ih!ih!ih!ih!ihtedesco    !ih!ih!ih!ih!ih!ih!ih!ih!ih!ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ih!ih!ih!ih!ih!ih!ih!ih!ih!ihtedesco    !ih!ih!ih!ih!ih!ih!ih!ih!ih!ih" + "'", str1, "!ih!ih!ih!ih!ih!ih!ih!ih!ih!ihtedesco    !ih!ih!ih!ih!ih!ih!ih!ih!ih!ih");
    }

    @Test
    public void test18580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18580");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "ADCAECAFCAGCAICALCAMCANCAOCAQCARCASCATCAUCAWCAXCAZCBACBBCBDCBECBFCBGCBHCBICBJCBLCBMCBNCBOCBQCBRCBSCBTCBVCBWCBYCBZCCACCCCCDCCFCCGCCHCCICCKCCLCCMCCNCCOCCRCCUCCVCCWCCXCCYCCZCDECDJCDKCDMCDOCDZCECCEECEGCEHCERCESCETCFICFJCFKCFMCFOCFRCGACGBCGDCGECGFCGGCGHCGICGLCGMCGNCGPCGQCGRCGSCGTCGUCGWCGYCHKCHMCHNCHRCHTCHUCIDCIECILCIMCINCIOCIQCIRCISCITCJECJMCJOCJPCKECKGCKHCKICKMCKNCKPCKRCKWCKYCKZCLACLBCLCCLICLKCLRCLSCLTCLUCLVCLYCMACMCCMDCMECMFCMGCMHCMKCMLCMMCMNCMOCMPCMQCMRCMSCMTCMUCMVCMWCMXCMYCMZCNACNCCNECNFCNGCNICNLCNOCNPCNRCNUCNZCOMCPACPECPFCPGCPHCPKCPLCPMCPNCPRCPSCPTCPWCPYCQACRECROCRSCRUCRWCSACSBCSCCSDCSECSGCSHCSICSJCSKCSLCSMCSNCSOCSRCSSCSTCSVCSXCSYCSZCTCCTDCTFCTGCTHCTJCTKCTLCTMCTNCTOCTRCTTCTVCTWCTZCUACUGCUMCUSCUYCUZCVACVCCVECVGCVICVNCVUCWFCWSCYECYTCZACZMCZW", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test18581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18581");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\\u0020iItalian\\u0020i                                                 ", 'a');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test18582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18582");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList0 = null;
        java.util.Locale.Category category1 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale2 = java.util.Locale.getDefault(category1);
        java.util.Locale locale3 = java.util.Locale.GERMAN;
        java.util.Locale locale4 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str5 = locale3.getDisplayName(locale4);
        java.util.Locale.setDefault(category1, locale4);
        java.util.Locale.Category category7 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale8 = java.util.Locale.getDefault(category7);
        java.lang.String str10 = locale8.getExtension('x');
        java.util.Locale.setDefault(category1, locale8);
        java.util.Locale locale15 = new java.util.Locale("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhfr-CA", "", "                                      )hsilgne,nailati( ");
        java.lang.String str16 = locale15.getISO3Country();
        java.util.Locale.setDefault(category1, locale15);
        java.util.Locale locale18 = java.util.Locale.US;
        java.lang.String str19 = locale18.getScript();
        java.util.Set<java.lang.String> strSet20 = locale18.getUnicodeLocaleAttributes();
        java.lang.String str21 = locale18.getCountry();
        java.util.Locale.setDefault(locale18);
        java.util.Locale.setDefault(category1, locale18);
        java.util.Set<java.lang.String> strSet24 = locale18.getUnicodeLocaleKeys();
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap26 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList27 = java.util.Locale.LanguageRange.parse("FRA", strMap26);
        java.util.Locale.LanguageRange[] languageRangeArray28 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList29 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList29, languageRangeArray28);
        java.util.Locale.LanguageRange[] languageRangeArray31 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList32 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList32, languageRangeArray31);
        java.lang.String[] strArray36 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList37 = new java.util.ArrayList<java.lang.String>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList37, strArray36);
        java.util.Locale.FilteringMode filteringMode39 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList40 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList32, (java.util.Collection<java.lang.String>) strList37, filteringMode39);
        java.util.Locale.FilteringMode filteringMode41 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList42 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList29, (java.util.Collection<java.lang.String>) strList37, filteringMode41);
        java.util.Collection<java.util.Locale> localeCollection43 = null;
        java.util.List<java.util.Locale> localeList44 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList29, localeCollection43);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap46 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList47 = java.util.Locale.LanguageRange.parse("francese", strMap46);
        java.util.Locale locale49 = java.util.Locale.ITALIAN;
        java.lang.String str50 = org.apache.commons.lang3.StringUtils.upperCase("de_DE", locale49);
        java.util.Set<java.lang.String> strSet51 = locale49.getUnicodeLocaleKeys();
        java.lang.String str52 = java.util.Locale.lookupTag(languageRangeList47, (java.util.Collection<java.lang.String>) strSet51);
        java.util.Locale locale53 = java.util.Locale.GERMAN;
        java.util.Locale locale54 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str55 = locale53.getDisplayName(locale54);
        java.util.Set<java.lang.String> strSet56 = locale53.getUnicodeLocaleAttributes();
        java.util.Locale.FilteringMode filteringMode57 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList58 = java.util.Locale.filterTags(languageRangeList47, (java.util.Collection<java.lang.String>) strSet56, filteringMode57);
        java.util.List<java.util.Locale> localeList59 = java.util.Locale.filter(languageRangeList27, (java.util.Collection<java.util.Locale>) localeList44, filteringMode57);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList60 = java.util.Locale.filterTags(languageRangeList0, (java.util.Collection<java.lang.String>) strSet24, filteringMode57);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + category1 + "' != '" + java.util.Locale.Category.FORMAT + "'", category1.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale2);
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "de");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "allemand" + "'", str5, "allemand");
        org.junit.Assert.assertTrue("'" + category7 + "' != '" + java.util.Locale.Category.FORMAT + "'", category7.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr_CA");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals(locale15.toString(), "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhfr-ca__                                      )hsilgne,nailati( ");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "US" + "'", str21, "US");
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertNotNull(languageRangeList27);
        org.junit.Assert.assertNotNull(languageRangeArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(languageRangeArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + filteringMode39 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode39.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList40);
        org.junit.Assert.assertTrue("'" + filteringMode41 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode41.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList42);
        org.junit.Assert.assertNotNull(localeList44);
        org.junit.Assert.assertNotNull(languageRangeList47);
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "it");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "DE_DE" + "'", str50, "DE_DE");
        org.junit.Assert.assertNotNull(strSet51);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "de");
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "allemand" + "'", str55, "allemand");
        org.junit.Assert.assertNotNull(strSet56);
        org.junit.Assert.assertTrue("'" + filteringMode57 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode57.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList58);
        org.junit.Assert.assertNotNull(localeList59);
    }

    @Test
    public void test18583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18583");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("         9hhhhhhhhhh_\\U0078", (int) 'U', "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              fr_C");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                   9hhhhhhhhhh_\\U0078" + "'", str3, "                                                                   9hhhhhhhhhh_\\U0078");
    }

    @Test
    public void test18584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18584");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("English(UnitedKingdom)", "\ud504\ub791\uc2a4\uc5b4\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test18585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18585");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkedkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk", "\\u0039");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkedkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk" + "'", str2, "kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkedkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk");
    }

    @Test
    public void test18586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18586");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC", "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzHSXLGNE_NAILATI_NAXLATX\\zzzzz...", "    ZH_CN    ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC" + "'", str3, "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
    }

    @Test
    public void test18587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18587");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("GGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGitalian", "FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA             FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA             FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA             FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA23");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "GGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGitalian" + "'", str2, "GGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGitalian");
    }

    @Test
    public void test18588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18588");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("9", "T", 241);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test18589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18589");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("\\U0034\\U00 HCSTUD \\U0034\\U00", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 28 + "'", int2 == 28);
    }

    @Test
    public void test18590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18590");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiitalian_italian_englishiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiitalian_italian_englishiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test18591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18591");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("Egsh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Egsh" + "'", str1, "Egsh");
    }

    @Test
    public void test18592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18592");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("Korean", "e             HCSINEILATI             g             HCSINEILATI                          HCSINEILATI             sh", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test18593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18593");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC\\xtalxan_ITALIAN_EnglxshCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC", "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC nailati             ", 30);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, 'R');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC\\xtalxan_ITALIAN_EnglxshCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC" + "'", str5, "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC\\xtalxan_ITALIAN_EnglxshCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
    }

    @Test
    public void test18594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18594");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("NC_hz\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r", "aaaaaaaaaaaaaa", "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITAL\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\", 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "NC_hz\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r" + "'", str4, "NC_hz\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r");
    }

    @Test
    public void test18595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18595");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("  \\u005    (...U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069!IH\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\ENGLISCH)", "n", "8600u\\U\\u0");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test18596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18596");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("\uad6d\uc911\uc5b4\uad6d\uc911IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII", ")ADANAc( ESECNARF", "hhhhhhhhhh (                                                                                     G             )", 12);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\uad6d\uc911\uc5b4\uad6d\uc911IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII" + "'", str4, "\uad6d\uc911\uc5b4\uad6d\uc911IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
    }

    @Test
    public void test18597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18597");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("UUUUUUUUUUUUUUUUUUUUUUUUUUUUUU\\u0030UUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", 'l');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUU\\u0030UUUUUUUUUUUUUUUUUUUUUUUUUUUUUU" + "'", str2, "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUU\\u0030UUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
    }

    @Test
    public void test18598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18598");
        java.util.Locale locale1 = new java.util.Locale("                                                         \\u005c                                                        ");
        java.util.Locale.setDefault(locale1);
        java.util.Set<java.lang.Character> charSet3 = locale1.getExtensionKeys();
        java.lang.String str4 = locale1.getISO3Country();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = locale1.getUnicodeLocaleType("             \\u0049                                           ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key:              \\u0049                                           ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale1.toString(), "                                                         \\u005c                                                        ");
        org.junit.Assert.assertNotNull(charSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test18599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18599");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("R-FRAAAAAAAAAAAAAAAAAAAAAAAAAAA", "...anitalij...anitalij...anitalij...anitalij...anitalij...anitalij...anitalij...anitalij...anitali");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...anitalij...anitalij...anitalij...anitalij...anitalij...anitalij...anitalij...anitalij...anitali" + "'", str2, "...anitalij...anitalij...anitalij...anitalij...anitalij...anitalij...anitalij...anitalij...anitali");
    }

    @Test
    public void test18600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18600");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("E");
        double double2 = languageRange1.getWeight();
        java.lang.String str3 = languageRange1.getRange();
        java.lang.String str4 = languageRange1.getRange();
        java.lang.String str5 = languageRange1.getRange();
        java.lang.Object obj6 = null;
        boolean boolean7 = languageRange1.equals(obj6);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "e" + "'", str3, "e");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "e" + "'", str4, "e");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "e" + "'", str5, "e");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test18601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18601");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder6 = builder1.setLanguage("und");
        java.util.Locale.Builder builder8 = builder6.setLanguage("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder6.setLanguageTag("444444444it");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: 444444444it [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "French (Canada)" + "'", str3, "French (Canada)");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test18602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18602");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "\\u0063");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u0063" + "'", str1, "\\u0063");
    }

    @Test
    public void test18603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18603");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("allAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmand");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=allamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamand");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test18604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18604");
        java.lang.CharSequence charSequence1 = null;
        java.lang.CharSequence charSequence2 = null;
        char[] charArray9 = new char[] { ' ', '4' };
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!", charArray9);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "u", charArray9);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "en-US", charArray9);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "cinese (cina)\\u0069h...", charArray9);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone(charSequence2, charArray9);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence1, charArray9);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "English(UnitedKingdom)", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test18605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18605");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaAnihCaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAC", (int) 'z', 111);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test18606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18606");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("nglish ...", 38);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "              nglish ...              " + "'", str2, "              nglish ...              ");
    }

    @Test
    public void test18607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18607");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.lang.String str2 = locale1.getDisplayScript();
        java.lang.String str3 = locale1.getLanguage();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
// flaky:         org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test18608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18608");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("LHcsineilat", "                                                         \\u005c                                                        ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LHcsineilat" + "'", str2, "LHcsineilat");
    }

    @Test
    public void test18609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18609");
        java.util.Locale locale0 = java.util.Locale.US;
        java.lang.String str1 = locale0.toLanguageTag();
        java.util.Set<java.lang.String> strSet2 = locale0.getUnicodeLocaleKeys();
        java.util.Locale locale4 = java.util.Locale.forLanguageTag("hi!");
        java.lang.String str5 = locale4.getCountry();
        java.lang.String str6 = locale4.getDisplayVariant();
        java.util.Locale locale7 = locale4.stripExtensions();
        java.lang.String str8 = locale4.getScript();
        java.lang.String str9 = locale0.getDisplayName(locale4);
        boolean boolean10 = locale4.hasExtensions();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "en-US" + "'", str1, "en-US");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "English (United States)" + "'", str9, "English (United States)");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test18610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18610");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Locale locale1 = java.util.Locale.ITALIAN;
        java.lang.String str3 = locale1.getExtension('h');
        java.lang.String str4 = locale0.getDisplayScript(locale1);
        java.util.Locale locale5 = locale0.stripExtensions();
        java.util.Locale locale6 = java.util.Locale.getDefault();
        java.lang.String str7 = locale6.getLanguage();
        java.lang.String str8 = locale0.getDisplayCountry(locale6);
        java.util.Set<java.lang.String> strSet9 = locale0.getUnicodeLocaleAttributes();
        java.lang.String str10 = locale0.getDisplayLanguage();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale6);
// flaky:         org.junit.Assert.assertEquals(locale6.toString(), "");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "France" + "'", str8, "France");
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "French" + "'", str10, "French");
    }

    @Test
    public void test18611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18611");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "HHHHHHHHHH");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test18612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18612");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("                                ESELGNI                               ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                eselgni                               " + "'", str1, "                                eselgni                               ");
    }

    @Test
    public void test18613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18613");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder3.setLanguage("italian");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder5.setRegion("deutsch\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: deutsch\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\ [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test18614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18614");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("IT", "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhfr-ca");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "IT" + "'", str2, "IT");
    }

    @Test
    public void test18615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18615");
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
        java.util.Locale.setDefault(locale2);
        java.lang.String str16 = locale2.getLanguage();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
// flaky:         org.junit.Assert.assertEquals(locale1.toString(), "");
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "fr" + "'", str16, "fr");
    }

    @Test
    public void test18616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18616");
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
        java.lang.String str24 = locale23.getLanguage();
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "fr" + "'", str24, "fr");
    }

    @Test
    public void test18617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18617");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("fr-FR", "ITALIAN_italian_eNGLISHITALIAN_!IHitTAiT_ITALIAN_EgAish", (int) 'f');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test18618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18618");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("IT_IT", "Eagaas");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "IT_IT" + "'", str2, "IT_IT");
    }

    @Test
    public void test18619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18619");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("Regno Unito", 105, (int) 'E');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Regno Unito" + "'", str3, "Regno Unito");
    }

    @Test
    public void test18620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18620");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF" + "'", str1, "FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF");
    }

    @Test
    public void test18621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18621");
        char[] charArray11 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray11);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "iTALIAN", charArray11);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u0020iItalian\\u0020i", charArray11);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("aDAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDh...", charArray11);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "44444444444444444444444444444444IHaaaaaaaaaaaaaaaaaaaaaaaaFranz\366sisch (Frankreich)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4##a a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4##a a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4, #, #, a,  , a]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test18622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18622");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "alhi!       _\\U0020_Italienisch####################################################################          andallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemand");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test18623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18623");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("                   ", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test18624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18624");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("nglish (United Kingdom)", (int) 'n', "8600u\\                                 hsiAgE_NAILATI_TiATti");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "8600u\\                                 hsiAgE_NAILATI_TiATti8600u\\                     nglish (United Kingdom)" + "'", str3, "8600u\\                                 hsiAgE_NAILATI_TiATti8600u\\                     nglish (United Kingdom)");
    }

    @Test
    public void test18625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18625");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("ititaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitai", 53, 'R');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ititaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitai" + "'", str3, "ititaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitai");
    }

    @Test
    public void test18626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18626");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("\\u0034\\u00 hcstud \\u0034\\u00");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\U0034\\U00 HCSTUD \\U0034\\U00" + "'", str1, "\\U0034\\U00 HCSTUD \\U0034\\U00");
    }

    @Test
    public void test18627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18627");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('t', 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test18628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18628");
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
        java.util.Locale locale15 = java.util.Locale.TAIWAN;
        boolean boolean16 = locale15.hasExtensions();
        java.util.Set<java.lang.String> strSet17 = locale15.getUnicodeLocaleKeys();
        java.lang.String str18 = locale9.getDisplayName(locale15);
        java.util.Locale.setDefault(locale15);
        java.lang.Class<?> wildcardClass20 = locale15.getClass();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_FR");
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
        org.junit.Assert.assertEquals(locale15.toString(), "zh_TW");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test18629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18629");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("2CINESE (CINA.", (double) 'D');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=68.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test18630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18630");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxNCHI", "ITALIE");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ITALIE" + "'", str2, "ITALIE");
    }

    @Test
    public void test18631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18631");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("...       g                     ...", 'R');
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("                                                                        ", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test18632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18632");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "\uc601\uc5b4");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test18633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18633");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("englischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglisch", 42, "english                                h                                 ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "englischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglisch" + "'", str3, "englischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglisch");
    }

    @Test
    public void test18634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18634");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBV");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=adaeafagaialamanaoaqarasatauawaxazbabbbdbebfbgbhbibjblbmbnbobqbrbsbtbv");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test18635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18635");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "CCCCCCCCCCCCCanglais (CanadaCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test18636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18636");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("und", "fr_CA                                                   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "und" + "'", str2, "und");
    }

    @Test
    public void test18637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18637");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("                   ", "u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", 133);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test18638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18638");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED..");
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + 'A' + "'", char1 == 'A');
    }

    @Test
    public void test18639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18639");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("Chinesischitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoit", 0, 16);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test18640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18640");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiitalian_ITALIAN_Englishiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii", (int) '.', (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test18641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18641");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("Fr ncG ", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Fr ncG " + "'", str2, "Fr ncG ");
    }

    @Test
    public void test18642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18642");
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
            java.util.Locale.Builder builder39 = builder8.setLanguageTag("i\\u0020iTALIANiTALIANiTALIANiTALIit         \\");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: i\\u0020iTALIANiTALIANiTALIANiTALIit         \\ [at index 0]");
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\u7fa9\u5927\u5229\u6587" + "'", str15, "\u7fa9\u5927\u5229\u6587");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\u7fa9\u5927\u5229\u6587" + "'", str16, "\u7fa9\u5927\u5229\u6587");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\u7fa9\u5927\u5229\u6587" + "'", str17, "\u7fa9\u5927\u5229\u6587");
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
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "\u6cd5\u6587" + "'", str34, "\u6cd5\u6587");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "anglais (Canada)" + "'", str35, "anglais (Canada)");
        org.junit.Assert.assertNotNull(builder37);
    }

    @Test
    public void test18643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18643");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("    \\     ", 79);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test18644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18644");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder4 = builder2.setScript("");
        java.util.Locale.Builder builder5 = builder4.clear();
        java.util.Locale.Builder builder6 = builder5.clear();
        java.util.Locale.Builder builder7 = builder5.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder7.setLanguageTag("korezhzhzhzhzhzhzhzhzhzhfraadzhaezTtat_itahagzhaizhalzhamzhanzhaozhaqzharzhaszhazhzhzhzhzhzhzemandn (south korea)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: korezhzhzhzhzhzhzhzhzhzhfraadzhaezTtat_itahagzhaizhalzhamzhanzhaozhaqzharzhaszhazhzhzhzhzhzhzemandn (south korea) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test18645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18645");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "\u30a4\u30bf\u30ea\u30a2\u8a9e");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test18646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18646");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("zosischFranzosisch (Frankreich)", "RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR (italian,english)                                       (italian,english)                                       (italian,english)                                       (italian,english)                                       (italian,english)                                      i (italian,english)                                      ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test18647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18647");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "F");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "f" + "'", str1, "f");
    }

    @Test
    public void test18648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18648");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("\u6cd5\u56fd");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test18649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18649");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder5 = builder1.clear();
        java.util.Locale.Builder builder6 = builder5.clear();
        java.util.Locale.Builder builder8 = builder5.setLanguage("zh");
        java.util.Locale.Builder builder9 = builder8.clear();
        java.util.Locale locale11 = new java.util.Locale("en");
        boolean boolean12 = locale11.hasExtensions();
        java.util.Set<java.lang.String> strSet13 = locale11.getUnicodeLocaleKeys();
        java.util.Locale locale14 = java.util.Locale.ITALIAN;
        java.lang.String str15 = locale14.getDisplayLanguage();
        java.util.Locale locale16 = locale14.stripExtensions();
        java.lang.String str17 = locale16.getVariant();
        java.lang.String str18 = locale11.getDisplayLanguage(locale16);
        java.lang.String str19 = locale11.getDisplayCountry();
        java.util.Locale.Builder builder20 = builder9.setLocale(locale11);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder22 = builder20.removeUnicodeLocaleAttribute("");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute:  [at index 0]");
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
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertEquals(locale11.toString(), "en");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "it");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "italien" + "'", str15, "italien");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "it");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "inglese" + "'", str18, "inglese");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(builder20);
    }

    @Test
    public void test18650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18650");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("...LIAN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...LIAN" + "'", str1, "...LIAN");
    }

    @Test
    public void test18651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18651");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("CCCCCCIAN\\U0020ICCCCCCC", 'G');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'C' + "'", char2 == 'C');
    }

    @Test
    public void test18652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18652");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("z...\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r...", "Franz\366sischFranzosisch (Frankreich)uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test18653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18653");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("GBR");
        java.lang.String str2 = languageRange1.getRange();
        double double3 = languageRange1.getWeight();
        double double4 = languageRange1.getWeight();
        double double5 = languageRange1.getWeight();
        java.util.Locale locale6 = java.util.Locale.ROOT;
        java.lang.String str7 = locale6.getISO3Language();
        java.util.Set<java.lang.String> strSet8 = locale6.getUnicodeLocaleKeys();
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
        java.lang.String str50 = locale6.getDisplayName(locale40);
        boolean boolean51 = languageRange1.equals((java.lang.Object) locale6);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "gbr" + "'", str2, "gbr");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strSet8);
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
// flaky:         org.junit.Assert.assertEquals(locale25.toString(), "fr_FR");
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
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test18654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18654");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee", " \\U0066  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee" + "'", str2, "FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee");
    }

    @Test
    public void test18655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18655");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("FRANZOSI         ITALIAN_italian_eNGLISHFRANZOSI", 5, 'C');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "FRANZOSI         ITALIAN_italian_eNGLISHFRANZOSI" + "'", str3, "FRANZOSI         ITALIAN_italian_eNGLISHFRANZOSI");
    }

    @Test
    public void test18656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18656");
        java.util.Locale locale0 = java.util.Locale.ROOT;
        java.lang.String str1 = locale0.getISO3Country();
        java.util.Set<java.lang.String> strSet2 = locale0.getUnicodeLocaleKeys();
        java.util.Set<java.lang.String> strSet3 = locale0.getUnicodeLocaleKeys();
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet3, 'A');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet3, "talian");
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test18657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18657");
        char[] charArray9 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray9);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "iTALIAN", charArray9);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                             hcsfr-CueD                                             ", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4##a a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4##a a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, #, #, a,  , a]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test18658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18658");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("deu", strMap1);
        org.junit.Assert.assertNotNull(languageRangeList2);
    }

    @Test
    public void test18659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18659");
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
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strList14, "FRDzhEzhFzhGzhIzhLzhMzhNzhOzhQzhRzhSzheeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee");
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strList14, 'T');
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test18660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18660");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC", "\\U0046", 34);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test18661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18661");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("\\u0061ItalifnischItalifnischItalifnischItalifnischItalifnischItalifnischItalifnischItalifnischItalif");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("WBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test18662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18662");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "FRTTAT_ITA", (java.lang.CharSequence) "GBR");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test18663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18663");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                    FR-                                                     ", 0, 9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test18664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18664");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCcinese (cina)u0069h..CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCcinese (cina)u0069h..CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC" + "'", str1, "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCcinese (cina)u0069h..CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
    }

    @Test
    public void test18665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18665");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("it hi!       _\\U0020...T hi!       _\\U0020...Ai hi!       _\\U0020...T hi!       _\\U0020..._ hi!       _\\U0020...ITA", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "it hi!       _\\U0020...T hi!       _\\U0020...Ai hi!       _\\U0020...T hi!       _\\U0020..._ hi!       _\\U0020...ITA" + "'", str2, "it hi!       _\\U0020...T hi!       _\\U0020...Ai hi!       _\\U0020...T hi!       _\\U0020..._ hi!       _\\U0020...ITA");
    }

    @Test
    public void test18666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18666");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("8600u\\U\\u0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "8600u\\U\\u0" + "'", str1, "8600u\\U\\u0");
    }

    @Test
    public void test18667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18667");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder6 = builder1.setLanguage("und");
        java.util.Locale locale7 = builder6.build();
        java.util.Locale.Builder builder9 = builder6.setLanguage("fr");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder9.setUnicodeLocaleKeyword("aaaaaaaaaaaaCaaaaaaaaaaaa", "cor\351en (cor\351e du sud) (RA)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: aaaaaaaaaaaaCaaaaaaaaaaaa [at index 0]");
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
    }

    @Test
    public void test18668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18668");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("ENGLISCH (         italian_italian_english,\\U0061)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=englisch(italian_italian_english");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test18669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18669");
        java.util.Locale locale2 = new java.util.Locale("\\u0045", "");
        java.util.Set<java.lang.String> strSet3 = locale2.getUnicodeLocaleAttributes();
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet3, "Fgence");
        org.junit.Assert.assertEquals(locale2.toString(), "\\u0045");
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test18670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18670");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("ran\347ais (France)                                      f                                     ", "italian (italian,eng_KOKOKO_      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ran\347ais (France)                                      f                                     " + "'", str2, "ran\347ais (France)                                      f                                     ");
    }

    @Test
    public void test18671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18671");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "         italian_italian_engl");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test18672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18672");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Locale locale1 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str2 = locale0.getDisplayScript(locale1);
        java.util.Set<java.lang.String> strSet3 = locale0.getUnicodeLocaleAttributes();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(strSet3);
    }

    @Test
    public void test18673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18673");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("ECANADAgCANADACANADAsh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ECANADAgCANADACANADAsh" + "'", str1, "ECANADAgCANADACANADAsh");
    }

    @Test
    public void test18674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18674");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "FRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFR");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test18675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18675");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(charSequence0, charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test18676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18676");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("CHINESE (CHINA)CHINESE (CHINA)CHINESE (CHINA)CHINESE (CHINA)CHINESE (CHINA)CHINESE (CHINA)CHINESen_C", "\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITALHcsineilatI", 63);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test18677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18677");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder0.addUnicodeLocaleAttribute("\\u0020TALIANTALIANTALIANiTALI");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: \\u0020TALIANTALIANTALIANiTALI [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test18678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18678");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069!ih\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\engli");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069!ih\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\engli" + "'", str1, "\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069!ih\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\engli");
    }

    @Test
    public void test18679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18679");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("fran\347", "ienischallemanditalian_ITALIAN_EnglishallemandHI!allemandhi!allemandADAEAFAGAIA...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "fran\347" + "'", str2, "fran\347");
    }

    @Test
    public void test18680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18680");
        char[] charArray11 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray11);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny("HI!", charArray11);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\u0068", charArray11);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "!ih!ih!ih!ih!ih!ih!ih!ih!ih!ihtedesco    !ih!ih!ih!ih!ih!ih!ih!ih!ih!ih", charArray11);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "FranzosischFranz\366sisch (Kanada)(Frankreich)", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4##a a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4##a a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4, #, #, a,  , a]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 37 + "'", int15 == 37);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test18681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18681");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("                EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE                 ", "FRANZ\366SISCH");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test18682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18682");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("                                                   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test18683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18683");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("\\u0034\\u00                                             h!ih                            dallemanstuD                                             \\u0034\\u00", "FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test18684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18684");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "ZH_cnFrench (Canada)AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\r\r\r\r\r\r\r\r\\u0061ItalienischItalienischItalienischItalienischItalienischItalienischItalienischItalienischItalie\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\u0061ItalienischItalienischItalienischItalienischItalienischItalienischItalienischItalienischItalie\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\u0061ItalienischI", "F");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test18685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18685");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\\u0061", '\\');
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("fran\347ais (France)", strArray4);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "       !ih", (int) '\n', 1);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "itTAiT_ITALIAN_EgAish", 62, (int) (byte) 0);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny("Regno Unito", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test18686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18686");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder4 = builder2.setScript("");
        java.util.Locale.Builder builder5 = builder4.clear();
        java.util.Locale.Builder builder8 = builder5.setExtension('i', "");
        java.util.Locale.Builder builder9 = builder5.clearExtensions();
        java.util.Locale.Builder builder11 = builder5.setLanguage("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder13 = builder11.setVariant("22222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222FRANCESE (cANADA)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: 22222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222FRANCESE (cANADA) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test18687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18687");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split(")))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))iTALIAN");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test18688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18688");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test18689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18689");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("                                  !ih                            ", "EEEEEEEEEFRAEEEEEEEEE", 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                  !ih                            " + "'", str3, "                                  !ih                            ");
    }

    @Test
    public void test18690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18690");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("     ", 29, "KOREAN (SOUTH KOREA)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "KOREAN (SOUTH KOREA)KORE     " + "'", str3, "KOREAN (SOUTH KOREA)KORE     ");
    }

    @Test
    public void test18691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18691");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "inglesehhhhhhhhhenglisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)englisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)englisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)englisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)englisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)englisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)en");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test18692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18692");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("Korean (South Korea)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Korean (South Korea)" + "'", str1, "Korean (South Korea)");
    }

    @Test
    public void test18693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18693");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale locale4 = java.util.Locale.CHINESE;
        java.lang.String str5 = locale4.getCountry();
        java.util.Locale.Builder builder6 = builder3.setLocale(locale4);
        java.util.Locale locale7 = builder6.build();
        java.util.Locale locale8 = java.util.Locale.CANADA;
        java.lang.String str9 = locale8.getISO3Country();
        java.util.Locale.Builder builder10 = builder6.setLocale(locale8);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "CAN" + "'", str9, "CAN");
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test18694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18694");
        java.util.Locale locale0 = java.util.Locale.CHINESE;
        java.util.Locale locale1 = java.util.Locale.FRENCH;
        java.lang.String str2 = locale1.getDisplayName();
        java.lang.String str4 = locale1.getExtension('C');
        java.lang.String str5 = locale0.getDisplayLanguage(locale1);
        java.lang.String str6 = locale1.getISO3Country();
        java.lang.String str7 = locale1.getDisplayName();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "French" + "'", str2, "French");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chinois" + "'", str5, "chinois");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "French" + "'", str7, "French");
    }

    @Test
    public void test18695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18695");
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
        java.util.Locale.Builder builder19 = new java.util.Locale.Builder();
        java.util.Locale locale20 = builder19.build();
        java.util.Locale locale21 = java.util.Locale.FRENCH;
        java.util.Locale locale22 = java.util.Locale.ENGLISH;
        java.lang.String str23 = locale22.getDisplayCountry();
        java.lang.String str24 = locale21.getDisplayVariant(locale22);
        java.lang.String str25 = locale21.getDisplayCountry();
        java.lang.String str26 = locale21.getScript();
        java.lang.String str27 = locale21.getScript();
        java.util.Locale locale28 = java.util.Locale.FRENCH;
        java.util.Locale locale29 = java.util.Locale.ENGLISH;
        java.lang.String str30 = locale29.getDisplayCountry();
        java.lang.String str31 = locale28.getDisplayVariant(locale29);
        java.lang.String str32 = locale28.getDisplayCountry();
        java.lang.String str33 = locale28.getScript();
        java.lang.String str34 = locale28.getScript();
        java.lang.String str35 = locale21.getDisplayCountry(locale28);
        java.lang.String str36 = locale20.getDisplayVariant(locale28);
        java.util.Locale locale38 = java.util.Locale.ENGLISH;
        java.lang.String str39 = locale38.getDisplayLanguage();
        java.lang.String str40 = org.apache.commons.lang3.StringUtils.upperCase("!IH", locale38);
        java.lang.String str41 = locale38.getCountry();
        java.lang.String str42 = locale38.getCountry();
        java.lang.String str43 = locale28.getDisplayCountry(locale38);
        java.util.Locale locale44 = java.util.Locale.CANADA_FRENCH;
        java.util.Set<java.lang.Character> charSet45 = locale44.getExtensionKeys();
        java.lang.String str46 = locale28.getDisplayLanguage(locale44);
        java.lang.String str47 = locale16.getDisplayLanguage(locale44);
        java.util.Locale locale48 = java.util.Locale.PRC;
        java.lang.String str49 = locale48.getDisplayVariant();
        java.lang.String str50 = locale48.getDisplayName();
        java.util.Locale locale51 = java.util.Locale.FRENCH;
        java.util.Locale locale52 = java.util.Locale.ENGLISH;
        java.lang.String str53 = locale52.getDisplayCountry();
        java.lang.String str54 = locale51.getDisplayVariant(locale52);
        java.lang.String str55 = locale51.getDisplayCountry();
        java.lang.String str56 = locale51.getScript();
        java.lang.String str57 = locale51.getScript();
        java.util.Locale locale58 = java.util.Locale.FRENCH;
        java.util.Locale locale59 = java.util.Locale.ENGLISH;
        java.lang.String str60 = locale59.getDisplayCountry();
        java.lang.String str61 = locale58.getDisplayVariant(locale59);
        java.lang.String str62 = locale58.getDisplayCountry();
        java.lang.String str63 = locale58.getScript();
        java.lang.String str64 = locale58.getScript();
        java.lang.String str65 = locale51.getDisplayCountry(locale58);
        java.util.Locale.Category category66 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale67 = java.util.Locale.getDefault(category66);
        java.util.Locale locale68 = java.util.Locale.FRANCE;
        java.util.Locale locale69 = java.util.Locale.ITALIAN;
        java.lang.String str71 = locale69.getExtension('h');
        java.lang.String str72 = locale68.getDisplayScript(locale69);
        java.lang.String str73 = locale68.getISO3Country();
        java.util.Locale locale74 = java.util.Locale.GERMAN;
        java.util.Locale.setDefault(locale74);
        java.lang.String str76 = locale68.getDisplayName(locale74);
        java.lang.String str77 = locale68.getScript();
        java.util.Locale.setDefault(category66, locale68);
        java.lang.String str79 = locale51.getDisplayCountry(locale68);
        java.lang.String str80 = locale51.getVariant();
        java.lang.String str81 = locale48.getDisplayName(locale51);
        java.util.Locale locale84 = new java.util.Locale("\\u0020iTALIANiTALIANiTALIANiTALI", "French (Canada)");
        java.util.Set<java.lang.String> strSet85 = locale84.getUnicodeLocaleAttributes();
        java.lang.String str86 = locale48.getDisplayLanguage(locale84);
        java.util.Locale locale89 = new java.util.Locale("hi!       ");
        java.util.Locale locale90 = java.util.Locale.CANADA;
        java.lang.String str91 = locale89.getDisplayName(locale90);
        java.lang.String str92 = org.apache.commons.lang3.StringUtils.upperCase("BGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGTALIAN", locale89);
        java.lang.String str93 = locale84.getDisplayScript(locale89);
        java.lang.String str94 = locale16.getDisplayCountry(locale84);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Italian" + "'", str1, "Italian");
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
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "fr");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "en");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "fr");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "en");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "en");
// flaky:         org.junit.Assert.assertEquals("'" + str39 + "' != '" + "English" + "'", str39, "English");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "!IH" + "'", str40, "!IH");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(charSet45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "fran\347ais" + "'", str46, "fran\347ais");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "                                     fran\347ais (france)                                      " + "'", str47, "                                     fran\347ais (france)                                      ");
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
// flaky:         org.junit.Assert.assertEquals("'" + str50 + "' != '" + "Chinese (China)" + "'", str50, "Chinese (China)");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "fr");
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "en");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "fr");
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "en");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertTrue("'" + category66 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category66.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale67);
// flaky:         org.junit.Assert.assertEquals(locale67.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale68);
        org.junit.Assert.assertEquals(locale68.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale69);
        org.junit.Assert.assertEquals(locale69.toString(), "it");
        org.junit.Assert.assertNull(str71);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "FRA" + "'", str73, "FRA");
        org.junit.Assert.assertNotNull(locale74);
        org.junit.Assert.assertEquals(locale74.toString(), "de");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "Franz\366sisch (Frankreich)" + "'", str76, "Franz\366sisch (Frankreich)");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "chinois (Chine)" + "'", str81, "chinois (Chine)");
        org.junit.Assert.assertEquals(locale84.toString(), "\\u0020italianitalianitalianitali_FRENCH (CANADA)");
        org.junit.Assert.assertNotNull(strSet85);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "Chinese" + "'", str86, "Chinese");
        org.junit.Assert.assertEquals(locale89.toString(), "hi!       ");
        org.junit.Assert.assertNotNull(locale90);
        org.junit.Assert.assertEquals(locale90.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "hi!       " + "'", str91, "hi!       ");
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "BGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGTALIAN" + "'", str92, "BGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGTALIAN");
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "" + "'", str93, "");
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "CHINESE (CHINA" + "'", str94, "CHINESE (CHINA");
    }

    @Test
    public void test18696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18696");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("AD4AE4AF4AG4AI4AL4AM4AN4AO4AQ4AR4AS4AT4AU4AW4AX4AZ4BA4BB4BD4BE4BF4BG4BH4BI4BJ4BL4BM4BN4BO4BQ4BR4BS4BT4BV4BW...R-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAA", 73, 95);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 73 + "'", int3 == 73);
    }

    @Test
    public void test18697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18697");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("\\u0029E             g", "italian (italian,englcor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor", 74);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test18698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18698");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("\\u0045");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u0045" + "'", str1, "\\u0045");
    }

    @Test
    public void test18699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18699");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzitalian (italian,english", "\\U0078");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test18700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18700");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("...                             ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "..." + "'", str1, "...");
    }

    @Test
    public void test18701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18701");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("                                                                                                        ", (int) 't', (int) 'g');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                    ..." + "'", str3, "                                                                                                    ...");
    }

    @Test
    public void test18702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18702");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("TEDESCO");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "tedesco" + "'", str1, "tedesco");
    }

    @Test
    public void test18703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18703");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("ADAEAFAGAIALAMANAOAQARASAAUAWAXAZBABB", 314, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                          ADAEAFAGAIALAMANAOAQARASAAUAWAXAZBABB                                                                                                                                           " + "'", str3, "                                                                                                                                          ADAEAFAGAIALAMANAOAQARASAAUAWAXAZBABB                                                                                                                                           ");
    }

    @Test
    public void test18704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18704");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("hIAN\\U0020Ih", "                                                                                                 it");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hIAN\\U0020Ih" + "'", str2, "hIAN\\U0020Ih");
    }

    @Test
    public void test18705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18705");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("francese", 100, '8');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "francese88888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888" + "'", str3, "francese88888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888");
    }

    @Test
    public void test18706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18706");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale locale4 = java.util.Locale.CHINESE;
        java.lang.String str5 = locale4.getCountry();
        java.util.Locale.Builder builder6 = builder3.setLocale(locale4);
        java.util.Locale.Builder builder7 = builder6.clear();
        java.util.Locale locale8 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale12 = new java.util.Locale("Italian", "Italian", "English");
        java.lang.String str13 = locale12.getDisplayCountry();
        java.lang.String str14 = locale8.getDisplayCountry(locale12);
        java.lang.String str15 = locale8.getISO3Language();
        java.util.Locale.Builder builder16 = builder6.setLocale(locale8);
        java.lang.String str17 = locale8.toString();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh_CN");
        org.junit.Assert.assertEquals(locale12.toString(), "italian_ITALIAN_English");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ITALIAN" + "'", str13, "ITALIAN");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "China" + "'", str14, "China");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "zho" + "'", str15, "zho");
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "zh_CN" + "'", str17, "zh_CN");
    }

    @Test
    public void test18707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18707");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("zhzhzhzhzhzhzhzhzhzhE             g", "adaeafagaialamanaoaqarasatauawaxazbabbbdbebfbgbhbibjblbmbnbobqbrbsbtbvbwbybzcacccdcfcgchcickclcmcncocrcucvcwcxcyczded8...", 151);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test18708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18708");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("uuuuu", "8600u\\");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test18709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18709");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("\ud55c\uad6d\uc5b4", 65, (int) (short) 100);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str3, "\ud55c\uad6d\uc5b4");
    }

    @Test
    public void test18710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18710");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("Italian");
        java.util.Locale.Builder builder4 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder0.clear();
        java.util.Locale locale7 = java.util.Locale.forLanguageTag("\\u0020");
        java.util.Locale.Builder builder8 = builder0.setLocale(locale7);
        java.util.Locale.Builder builder11 = builder0.setExtension('u', "Italian");
        java.util.Locale.Builder builder12 = builder11.clearExtensions();
        java.util.Locale locale13 = builder12.build();
        java.util.Locale locale15 = java.util.Locale.forLanguageTag("\\u0020");
        java.util.Locale locale17 = java.util.Locale.CHINESE;
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.lowerCase("         italian_ITALIAN_English", locale17);
        java.lang.String str19 = locale17.toLanguageTag();
        java.lang.String str20 = locale15.getDisplayName(locale17);
        java.util.Locale.Builder builder21 = builder12.setLocale(locale15);
        java.util.Locale.Builder builder23 = builder12.setLanguage("");
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "         italian_italian_english" + "'", str18, "         italian_italian_english");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "zh" + "'", str19, "zh");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
    }

    @Test
    public void test18711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18711");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaFranz\366sisc", (java.lang.CharSequence) "zzzItalian (Italy)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test18712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18712");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("z...", "\\u0034                                                                                              ", 13);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test18713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18713");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("", "anau00");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test18714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18714");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("china", "\\u0034\\u00                                             hcstuD                                             \\u0034\\u00", "ADAAEAAFAAGAAIAALAAMAANAAOAAQAARAAS");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test18715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18715");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("korezhzhzhzhzhzhzhzhzhzhfraadzhaezTtat_itahagzhaizhalzhamzhanzhaozhaqzharzhaszhazhzhzhzhzhzhzemandn (south korea)", "HI!       ALLEMANDITALIENISCHALLEMANDITALIAN_ITALIAN_ENG    \\     ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...ALLEMAND\\U0034ALLEMANDHI!ALLEMANDITALIANALLEMAND\\U0061ALLEMAND\\U0023ALLEMANDHI!ALLEMANDITALIANALLEMANDCHINESE (CHINA)ALLEMANDHI!ALLEMANDZH_CNALLEMANDITALIANALLEMANDENALLEMANDITALIENISCH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test18716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18716");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)" + "'", str1, "GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)");
    }

    @Test
    public void test18717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18717");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HHHHHHHHH         ITALIAN_italian_eNGLISH         ITALIAN_!IHitTAiT_ITALIAN_EgAis", "                                               8300u\\                                                ", (int) (byte) -1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHHHHHHHHITALIAN_italian_eNGLISHITALIAN_!IHitTAiT_ITALIAN_EgAis" + "'", str4, "HHHHHHHHHITALIAN_italian_eNGLISHITALIAN_!IHitTAiT_ITALIAN_EgAis");
    }

    @Test
    public void test18718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18718");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("hhhhhhhhH", "HI!       ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test18719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18719");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444en");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, 'H');
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray5);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444en" + "'", str2, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444en");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444Hen" + "'", str4, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444Hen");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test18720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18720");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\!_\\u0020_itle\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\!_\\u0020_itle\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\" + "'", str1, "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\!_\\u0020_itle\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
    }

    @Test
    public void test18721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18721");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("r-FRAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "r-FRAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "r-FRAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test18722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18722");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaFranz\366sisc", "\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069!IH\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\ENGLISCH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaFranz\366sisc" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaFranz\366sisc");
    }

    @Test
    public void test18723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18723");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("francefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrance");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test18724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18724");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("italian (italian,englcor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351", (int) '9');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "italian (italian,englcor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351" + "'", str2, "italian (italian,englcor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351");
    }

    @Test
    public void test18725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18725");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("fRANZ\326SISC", "NI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test18726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18726");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.lang.String str1 = locale0.getDisplayLanguage();
        java.util.Locale locale2 = locale0.stripExtensions();
        java.lang.String str3 = locale0.getDisplayVariant();
        java.lang.String str4 = locale0.getISO3Language();
        java.lang.String str5 = locale0.getVariant();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "italien" + "'", str1, "italien");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "it");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ita" + "'", str4, "ita");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test18727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18727");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("eAGAAS");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "eAGAAS" + "'", str1, "eAGAAS");
    }

    @Test
    public void test18728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18728");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("China", "zosischFranzosisch (Frankreich)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test18729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18729");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('a', 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test18730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18730");
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
        java.util.Locale locale21 = java.util.Locale.forLanguageTag("Italian");
        java.lang.String str22 = locale21.getVariant();
        java.lang.String str23 = locale0.getDisplayName(locale21);
        boolean boolean24 = locale21.hasExtensions();
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
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "italian");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "French (France)" + "'", str23, "French (France)");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test18731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18731");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("ccccccccccccccccccccccccccccccccccccccccccccccc\\u00de\\u00ccccccccccccccccccccccccccccccccccccccccccccccc", "", 309, 53);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ccccccccccccccccccccccccccccccccccccccccccccccc\\u00de" + "'", str4, "ccccccccccccccccccccccccccccccccccccccccccccccc\\u00de");
    }

    @Test
    public void test18732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18732");
        java.util.Locale locale3 = new java.util.Locale("china", "\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I", "Korean (South Korea)");
        org.junit.Assert.assertEquals(locale3.toString(), "china_\\U0020IITALIAN\\U0020I\\U0020IITALIAN\\U0020I\\U0020IITALIAN\\U0020I\\U0020IITALIAN\\U0020I\\U0020IITALIAN\\U0020I\\U0020IITALIAN\\U0020I\\U0020IITALIAN\\U0020I\\U0020IITALIAN\\U0020I\\U0020IITALIAN\\U0020I\\U0020IITALIAN\\U0020I\\U0020IITALIAN\\U0020I\\U0020IITALIAN\\U0020I\\U0020IITALIAN\\U0020I\\U0020IITALIAN\\U0020I\\U0020IITALIAN\\U0020I\\U0020IITALIAN\\U0020I\\U0020IITALIAN\\U0020I\\U0020IITALIAN\\U0020I\\U0020IITALIAN\\U0020I\\U0020IITALIAN\\U0020I\\U0020IITALIAN\\U0020I\\U0020IITALIAN\\U0020I\\U0020IITALIAN\\U0020I\\U0020IITALIAN\\U0020I\\U0020IITALIAN\\U0020I\\U0020IITALIAN\\U0020I\\U0020IITALIAN\\U0020I\\U0020IITALIAN\\U0020I\\U0020IITALIAN\\U0020I\\U0020IITALIAN\\U0020I\\U0020IITALIAN\\U0020I\\U0020IITALIAN\\U0020I\\U0020IITALIAN\\U0020I\\U0020IITALIAN\\U0020I\\U0020IITALIAN\\U0020I_Korean (South Korea)");
    }

    @Test
    public void test18733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18733");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "hhh italia");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test18734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18734");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Locale locale1 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str2 = locale0.getDisplayScript(locale1);
        java.lang.String str3 = locale1.getVariant();
        java.util.Locale locale5 = new java.util.Locale("");
        java.util.Locale.setDefault(locale5);
        java.lang.String str7 = locale1.getDisplayName(locale5);
        java.lang.String str8 = locale1.getDisplayScript();
        java.lang.String str9 = locale1.getDisplayScript();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "French (Canada)" + "'", str7, "French (Canada)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test18735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18735");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("00000000000000COR\311EN (cOR\311E DU sUD)", 35, 'D');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "00000000000000COR\311EN (cOR\311E DU sUD)" + "'", str3, "00000000000000COR\311EN (cOR\311E DU sUD)");
    }

    @Test
    public void test18736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18736");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("\u6cd5\u56fd", "                                      ...", 15);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny("#########################################)ylatI( nailatIzzzc)ylatI( nailatIzzzne)ylatI( nailatIzzzla", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u6cd5\u56fd" + "'", str5, "\u6cd5\u56fd");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test18737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18737");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("\\0020iTALIANiTALIANiTALIANiTALzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz", 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test18738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18738");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("\\u0034\\u00                                             hDi!        (\\U0020,ItalicniueD#########################################################################################stuD                                             \\u0034\\u00", "8");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test18739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18739");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Korean", 'C');
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.split("\\u0034\\u00                                             hcstued                                             \\u0034\\u00 (\\U0020IITALIAN\\U0020I)", "Deutscd", (int) '\n');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.concatWith("FranzosischFranzosisch (Frankreich)", (java.lang.Object[]) strArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.startsWithAny("G", strArray9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("fr-CA", strArray3, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\\FranzosischFranzosisch (Frankreich)0034\\FranzosischFranzosisch (Frankreich)00                                             hFranzosischFranzosisch (Frankreich)                                             \\FranzosischFranzosisch (Frankreich)0034\\FranzosischFranzosisch (Frankreich)00 (\\U0020IITALIAN\\U0020I)" + "'", str10, "\\FranzosischFranzosisch (Frankreich)0034\\FranzosischFranzosisch (Frankreich)00                                             hFranzosischFranzosisch (Frankreich)                                             \\FranzosischFranzosisch (Frankreich)0034\\FranzosischFranzosisch (Frankreich)00 (\\U0020IITALIAN\\U0020I)");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test18740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18740");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("      ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test18741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18741");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("english                                h                                 ", "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\ub3c5\uc77c\uc5b4\r\r\r\r\rfra");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test18742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18742");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("i\\u0020italianitalianitalianitaliit         \\xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", (double) 314);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=314.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test18743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18743");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("Koreanisch", "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTU005CTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT", (int) '5');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test18744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18744");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale locale7 = new java.util.Locale("hi!       _\\U0020_Italienisch####################################################################...", "italian_ITALIAN_English", "hcsineilatI");
        java.lang.String str8 = locale7.getDisplayVariant();
        java.lang.String str9 = locale7.getDisplayScript();
        java.lang.String str10 = locale7.getLanguage();
        java.util.Locale locale11 = locale7.stripExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder2.setLocale(locale11);
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: hi!       _\\u0020_italienisch####################################################################... [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertEquals(locale7.toString(), "hi!       _\\u0020_italienisch####################################################################..._ITALIAN_ITALIAN_ENGLISH_hcsineilatI");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hcsineilatI" + "'", str8, "hcsineilatI");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!       _\\u0020_italienisch####################################################################..." + "'", str10, "hi!       _\\u0020_italienisch####################################################################...");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "hi!       _\\u0020_italienisch####################################################################..._ITALIAN_ITALIAN_ENGLISH_hcsineilatI");
    }

    @Test
    public void test18745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18745");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("talian\\u0032talian", "Italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian", (int) 'R');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test18746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18746");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "Franzosisch(Frankreich)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test18747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18747");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = builder0.build();
        java.util.Set<java.lang.String> strSet3 = locale2.getUnicodeLocaleAttributes();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(strSet3);
    }

    @Test
    public void test18748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18748");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064", 42);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064" + "'", str2, "\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064");
    }

    @Test
    public void test18749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18749");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder1.setLanguage("eAGAASH");
        java.util.Locale locale4 = builder1.build();
        java.util.Locale.Builder builder5 = builder1.clear();
        java.util.Locale.Builder builder6 = builder1.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder6.setExtension('R', "HZHZHZHZHZHZHZHZHZHZAHZSAHZRAHZQAHZOAHZNAH");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension value: HZHZHZHZHZHZHZHZHZHZAHZSAHZRAHZQAHZOAHZNAH [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "eagaash");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test18750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18750");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("hi!       allemandItalienischallemanditalian_ITALIAN_EnglishallemandHI!allemandhi!allemandADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...allemand\\u0034allemandHI!allemandItalianallemand\\u0061allemand\\u0023allemandhi!allemandiTALIANallemandChinese (China)allemandhi!allemandzh_CNallemandiTALIANallemandenallemandItalienisch", 95, "ffffffffffffffffffffffffffffffffFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhACor\351e du Sud");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!       allemandItalienischallemanditalian_ITALIAN_EnglishallemandHI!allemandhi!allemandADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...allemand\\u0034allemandHI!allemandItalianallemand\\u0061allemand\\u0023allemandhi!allemandiTALIANallemandChinese (China)allemandhi!allemandzh_CNallemandiTALIANallemandenallemandItalienisch" + "'", str3, "hi!       allemandItalienischallemanditalian_ITALIAN_EnglishallemandHI!allemandhi!allemandADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...allemand\\u0034allemandHI!allemandItalianallemand\\u0061allemand\\u0023allemandhi!allemandiTALIANallemandChinese (China)allemandhi!allemandzh_CNallemandiTALIANallemandenallemandItalienisch");
    }

    @Test
    public void test18751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18751");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("Italian");
        java.util.Locale locale4 = builder0.build();
        java.util.Locale locale5 = java.util.Locale.CHINESE;
        java.lang.String str6 = locale5.getISO3Language();
        java.util.Locale.Builder builder7 = builder0.setLocale(locale5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = locale5.getUnicodeLocaleType("HHHHHHHHHHtTAHHHHHHHHHHT_ITA");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: HHHHHHHHHHtTAHHHHHHHHHHT_ITA");
        } catch (java.lang.IllegalArgumentException e) {
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
    }

    @Test
    public void test18752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18752");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "B");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test18753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18753");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = java.util.Locale.UK;
        java.util.Locale.Builder builder3 = builder0.setLocale(locale2);
        java.lang.String str4 = locale2.getVariant();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = locale2.getUnicodeLocaleType("                                                                                         italian (italian,e...                                                                                          ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key:                                                                                          italian (italian,e...                                                                                          ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en_GB");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test18754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18754");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("...ENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENG_                                                                    \\u00...", 32);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...ENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENG_                                                                    \\u00..." + "'", str2, "...ENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENG_                                                                    \\u00...");
    }

    @Test
    public void test18755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18755");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("...FDEDZCYCXCWCVCUCRCOCNCMCLCKCICHCGCFCDCCCACZBYBWBVBTBSBRBQBOBNBMBLBJBIBHBGBFBEBDBBBABZAXAWAUATASARAQAOANAMALAIAGAFAEADA", "hI!       ", (int) ' ');
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "                                     fran\347ais (france)                                      ");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, "IIIIIIIIII");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "...FDEDZCYCXCWCVCUCRCOCNCMCLCKCIIIIIIIIIICHCGCFCDCCCACZBYBWBVBTBSBRBQBOBNBMBLBJBIIIIIIIIIIBHBGBFBEBDBBBABZAXAWAUATASARAQAOANAMALAIIIIIIIIIIAGAFAEADA" + "'", str7, "...FDEDZCYCXCWCVCUCRCOCNCMCLCKCIIIIIIIIIICHCGCFCDCCCACZBYBWBVBTBSBRBQBOBNBMBLBJBIIIIIIIIIIBHBGBFBEBDBBBABZAXAWAUATASARAQAOANAMALAIIIIIIIIIIAGAFAEADA");
    }

    @Test
    public void test18756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18756");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("i\\u0020iTALIANiTALIANiTALIANiTALIitBBBBBBBBB\\BBBBB", "Cor\351e du Sud");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test18757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18757");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "REHEGEEECEZDODMDKDJDEDZCYCXCWCVCUCRCOCNCMCLCKCICHCGCFCDCCCACZBY");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test18758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18758");
        char[] charArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "EnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglish", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test18759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18759");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("inglesehhhhhhhhh");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test18760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18760");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("                                                         hcstued                                                         ", "e");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test18761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18761");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("EEEEEEEEEEEEE", "ko_KR", "\\u000d");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EEEEEEEEEEEEE" + "'", str3, "EEEEEEEEEEEEE");
    }

    @Test
    public void test18762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18762");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("\\u0034\\u00                                             hcstuD                                             \\u0034\\u00");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u0034\\u00hcstuD\\u0034\\u00" + "'", str1, "\\u0034\\u00hcstuD\\u0034\\u00");
    }

    @Test
    public void test18763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18763");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "francesefrancesefrancesefr\\u0075", "00000000000000COR\311EN (cOR\311E DU sUD)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test18764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18764");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("en");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap2 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList3 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList1, strMap2);
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
        java.lang.String[] strArray48 = new java.lang.String[] { "hi!       ", "Italienisch", "italian_ITALIAN_English", "HI!", "hi!", "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...", "\\u0034", "HI!", "Italian", "\\u0061", "\\u0023", "hi!", "iTALIAN", "Chinese (China)", "hi!", "zh_CN", "iTALIAN", "en", "Italienisch" };
        java.util.ArrayList<java.lang.String> strList49 = new java.util.ArrayList<java.lang.String>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList49, strArray48);
        java.util.Locale.LanguageRange[] languageRangeArray51 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList52 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList52, languageRangeArray51);
        java.lang.String[] strArray56 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList57 = new java.util.ArrayList<java.lang.String>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList57, strArray56);
        java.util.Locale.FilteringMode filteringMode59 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList60 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList52, (java.util.Collection<java.lang.String>) strList57, filteringMode59);
        java.util.List<java.lang.String> strList61 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList20, (java.util.Collection<java.lang.String>) strList49, filteringMode59);
        java.util.List<java.lang.String> strList62 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList5, (java.util.Collection<java.lang.String>) strList49);
        java.util.List<java.lang.String> strList63 = java.util.Locale.filterTags(languageRangeList3, (java.util.Collection<java.lang.String>) strList62);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap65 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList66 = java.util.Locale.LanguageRange.parse("ENGLISCH", strMap65);
        java.util.Locale locale67 = java.util.Locale.ITALIAN;
        java.util.Set<java.lang.Character> charSet68 = locale67.getExtensionKeys();
        java.lang.String str69 = locale67.getVariant();
        java.lang.String str70 = locale67.getDisplayName();
        java.lang.String str71 = locale67.getCountry();
        java.util.Set<java.lang.String> strSet72 = locale67.getUnicodeLocaleKeys();
        java.lang.String str73 = java.util.Locale.lookupTag(languageRangeList66, (java.util.Collection<java.lang.String>) strSet72);
        java.lang.String str75 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet72, "X");
        java.util.List<java.lang.String> strList76 = java.util.Locale.filterTags(languageRangeList3, (java.util.Collection<java.lang.String>) strSet72);
        java.lang.String str78 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strList76, "Eagaash");
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(languageRangeList3);
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
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(languageRangeArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + filteringMode59 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode59.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList60);
        org.junit.Assert.assertNotNull(strList61);
        org.junit.Assert.assertNotNull(strList62);
        org.junit.Assert.assertNotNull(strList63);
        org.junit.Assert.assertNotNull(languageRangeList66);
        org.junit.Assert.assertNotNull(locale67);
        org.junit.Assert.assertEquals(locale67.toString(), "it");
        org.junit.Assert.assertNotNull(charSet68);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "Italian" + "'", str70, "Italian");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertNotNull(strSet72);
        org.junit.Assert.assertNull(str73);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertNotNull(strList76);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
    }

    @Test
    public void test18765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18765");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("                                                                                                         German (Germany)", "                                                                                     g             e");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test18766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18766");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("!_\\u0020_iTLE#####################################!_\\u0020_iTLE######################################");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test18767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18767");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                                             hcsfr-CueD                                         ...", 23, 'b');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                             hcsfr-CueD                                         ..." + "'", str3, "                                             hcsfr-CueD                                         ...");
    }

    @Test
    public void test18768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18768");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("(italian,english)", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test18769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18769");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("", "aaaaaaaaaaaaaaaaaaaaaaaaFranzosisch(Frankreich)aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test18770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18770");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("Frz\366cz(frkrec)");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test18771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18771");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 28);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str2, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test18772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18772");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r                                                  it44444444444444444en", "Royaume-Uni");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test18773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18773");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("                                                                                           U0020");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                           U002" + "'", str1, "                                                                                           U002");
    }

    @Test
    public void test18774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18774");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("hi!       fr_FR                  Italienischfr_FR                  italian_ITALIAN_Englishfr_FR                  HI!fr_FR                  hi!fr_FR                  ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...fr_FR                  \\u0034fr_FR                  HI!fr_FR                  Italianfr_FR                  \\u0061fr_FR                  \\u0023fr_FR                  hi!fr_FR                  iTALIANfr_FR                  Chinese (China)fr_FR                  hi!fr_FR                  zh_CNfr_FR                  iTALIANfr_FR                  enfr_FR                  Italienisch", "DE");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "DE" + "'", str2, "DE");
    }

    @Test
    public void test18775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18775");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('H', 111);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 111 + "'", int2 == 111);
    }

    @Test
    public void test18776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18776");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzHSXLGNE_NAILATI_NAXLATX\\zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz", "tedesco    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzHSXLGNE_NAILATI_NAXLATX\\zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz" + "'", str2, "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzHSXLGNE_NAILATI_NAXLATX\\zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
    }

    @Test
    public void test18777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18777");
        char[] charArray7 = new char[] { ' ', '4' };
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!", charArray7);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsAny("French (Canada)", charArray7);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", charArray7);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzHSXLGNE_N", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test18778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18778");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) 'g', '\ud504');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'g' + "'", char2 == 'g');
    }

    @Test
    public void test18779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18779");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("\\u0020iItalian\\u0020i                                                 ", 109);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test18780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18780");
        java.util.Locale locale1 = java.util.Locale.ITALIAN;
        java.util.Set<java.lang.Character> charSet2 = locale1.getExtensionKeys();
        java.lang.String str3 = locale1.getVariant();
        java.lang.String str4 = locale1.getDisplayName();
        java.lang.String str5 = locale1.getDisplayName();
        java.lang.String str6 = locale1.getDisplayLanguage();
        java.util.Locale.Builder builder7 = new java.util.Locale.Builder();
        java.util.Locale locale8 = builder7.build();
        java.lang.String str9 = locale8.getDisplayCountry();
        java.lang.String str10 = locale1.getDisplayName(locale8);
        java.util.Locale locale11 = java.util.Locale.CANADA;
        java.lang.String str12 = locale11.getISO3Country();
        java.lang.String str13 = locale8.getDisplayCountry(locale11);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.upperCase("TALIAN\\u0023aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", locale8);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it");
        org.junit.Assert.assertNotNull(charSet2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Italian" + "'", str4, "Italian");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Italian" + "'", str5, "Italian");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Italian" + "'", str6, "Italian");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Italian" + "'", str10, "Italian");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "CAN" + "'", str12, "CAN");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "TALIAN\\U0023AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str14, "TALIAN\\U0023AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test18781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18781");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("g             E", "                       \\u0020                        ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test18782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18782");
        java.util.Locale locale1 = new java.util.Locale("cccccccccccccccccccccccccccccccccccccccccccccccccenglischcccccccccccccccccccccccccccccccccccccccccccccccccc");
        org.junit.Assert.assertEquals(locale1.toString(), "cccccccccccccccccccccccccccccccccccccccccccccccccenglischcccccccccccccccccccccccccccccccccccccccccccccccccc");
    }

    @Test
    public void test18783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18783");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("#", "########################################################Franz\366sisc########################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#" + "'", str2, "#");
    }

    @Test
    public void test18784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18784");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("A700U\\  ", 118);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test18785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18785");
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
        java.lang.String str33 = locale17.getISO3Country();
        java.lang.String str35 = locale17.getExtension('c');
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
        org.junit.Assert.assertEquals(locale16.toString(), "");
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
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "FRA" + "'", str33, "FRA");
        org.junit.Assert.assertNull(str35);
    }

    @Test
    public void test18786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18786");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) ")", "Germany");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test18787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18787");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiNumeric('C');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test18788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18788");
        java.util.Locale locale2 = new java.util.Locale("!IH", "Hhhhhhhhhh");
        java.lang.String str3 = locale2.getDisplayLanguage();
        java.lang.String str4 = locale2.getScript();
        org.junit.Assert.assertEquals(locale2.toString(), "!ih_HHHHHHHHHH");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!ih" + "'", str3, "!ih");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test18789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18789");
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
        java.util.Set<java.lang.Character> charSet15 = locale12.getExtensionKeys();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "de");
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
        org.junit.Assert.assertNotNull(charSet15);
    }

    @Test
    public void test18790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18790");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("                              444444444444444444444444444444444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...444444444444444444444444444444444444444444444444444                              " + "'", str1, "...444444444444444444444444444444444444444444444444444                              ");
    }

    @Test
    public void test18791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18791");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("                                ESELGNI                               ", "4300u\\                                             dutsch                                            ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test18792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18792");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "HSXLGNE_NAILATI_NAXLATX\\");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test18793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18793");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("                   ", "en_GB", (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test18794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18794");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("                                  \\u005c                                                         ", "ttttttttttttttttttttt                                                                                                              ITALIEITALtttttttttttttttttttttt");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                  \\u005c                                                         " + "'", str2, "                                  \\u005c                                                         ");
    }

    @Test
    public void test18795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18795");
        java.util.Locale locale2 = java.util.Locale.ENGLISH;
        java.lang.String str3 = locale2.getDisplayLanguage();
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.upperCase("!IH", locale2);
        java.lang.String str5 = locale2.getCountry();
        java.lang.String str6 = locale2.getISO3Language();
        java.lang.String str7 = locale2.getDisplayName();
        java.lang.String str8 = locale2.getISO3Country();
        boolean boolean9 = locale2.hasExtensions();
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.lowerCase("\u671d\u9c9c\u6587", locale2);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "anglais" + "'", str3, "anglais");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "!IH" + "'", str4, "!IH");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "eng" + "'", str6, "eng");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "anglais" + "'", str7, "anglais");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\u671d\u9c9c\u6587" + "'", str10, "\u671d\u9c9c\u6587");
    }

    @Test
    public void test18796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18796");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("iiiiiiiiiiifrankreichnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn", (int) 'u');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       iiiiiiiiiiifrankreichnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn        " + "'", str2, "       iiiiiiiiiiifrankreichnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn        ");
    }

    @Test
    public void test18797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18797");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("KR", "bbbbbbbbbb   cor\351en    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test18798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18798");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "ANGLAIS (ROYAUME-UNI)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test18799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18799");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("                                             DE_DE                                              ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                              ED_ED                                             " + "'", str1, "                                              ED_ED                                             ");
    }

    @Test
    public void test18800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18800");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("\u52a0\u62ff\u5927eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee", 113);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u52a0\u62ff\u5927eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee     " + "'", str2, "\u52a0\u62ff\u5927eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee     ");
    }

    @Test
    public void test18801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18801");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\\u000a", "it44444444444444444en", 104);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test18802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18802");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("\\u00de\\u00\\u\\u00de\\u00\\u", "\uc911\uad6d)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test18803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18803");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("                                                  it44444444444444444en", "\\u0029", (int) 'F');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test18804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18804");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("FRANCESE (CANADA)", "FRANZ\326SISCH2(FRANKREICH)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test18805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18805");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("itTAiT_ITALIAN_EgAish                                                                               ", 151);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "itTAiT_ITALIAN_EgAish                                                                               " + "'", str2, "itTAiT_ITALIAN_EgAish                                                                               ");
    }

    @Test
    public void test18806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18806");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("Korean (South Korea)", "Hhhhhhhhhh", 4);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concatWith("i\\u0020iTALIANiTALIANiTALIANiTALIitBBBBBBBBB\\BBBBB", (java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Korean (Souti\\u0020iTALIANiTALIANiTALIANiTALIitBBBBBBBBB\\BBBBB Korea)" + "'", str5, "Korean (Souti\\u0020iTALIANiTALIANiTALIANiTALIitBBBBBBBBB\\BBBBB Korea)");
    }

    @Test
    public void test18807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18807");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("hzhzhzhzhzhzhzhzhzhzahzsahzrahzqahzoahznahzmahzlahziahzgahzfahzeahzdaarfhzhzhzhzhzhzhzhzhzhz", 'R');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'h' + "'", char2 == 'h');
    }

    @Test
    public void test18808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18808");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("frankreich", "AAAAAAAAAAAAAAAAAAAAAAAAAA)aHI0200U\\NAIHAAAAAAAAAAAAAAAAAAAAAAAAAA)a", "emand");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "frnkreich" + "'", str3, "frnkreich");
    }

    @Test
    public void test18809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18809");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("    \\XTALXAN_ITALIAN_ENGLXSH    R0                                               nailati            ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\XTALXAN_ITALIAN_ENGLXSH    R0                                               nailati" + "'", str1, "\\XTALXAN_ITALIAN_ENGLXSH    R0                                               nailati");
    }

    @Test
    public void test18810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18810");
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
        java.lang.String str27 = org.apache.commons.lang3.StringUtils.upperCase("                                                                                                                                                                                           z...\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r...                                                                                                                                                                    italian_ITALIAN_EnglisF", locale26);
        org.junit.Assert.assertTrue("'" + category1 + "' != '" + java.util.Locale.Category.FORMAT + "'", category1.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale2);
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "fr_FR");
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "                                                                                                                                                                                           Z...\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r...                                                                                                                                                                    ITALIAN_ITALIAN_ENGLISF" + "'", str27, "                                                                                                                                                                                           Z...\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r...                                                                                                                                                                    ITALIAN_ITALIAN_ENGLISF");
    }

    @Test
    public void test18811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18811");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("e             HCSINEILATI             g             HCSINEILATI                          HCSINEILATI             sh", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaafranz\366sisch (kanada)_ZH_CN");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test18812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18812");
        java.util.Locale locale3 = new java.util.Locale("\\u0023", "Italienisch", "iTALIAN");
        java.lang.String str4 = locale3.getDisplayVariant();
        java.util.Locale.setDefault(locale3);
        java.util.Locale locale8 = new java.util.Locale("hhhhhhhhhh", "                                                                                     g             ");
        java.util.Set<java.lang.String> strSet9 = locale8.getUnicodeLocaleAttributes();
        java.lang.String str10 = locale3.getDisplayLanguage(locale8);
        org.junit.Assert.assertEquals(locale3.toString(), "\\u0023_ITALIENISCH_iTALIAN");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "iTALIAN" + "'", str4, "iTALIAN");
        org.junit.Assert.assertEquals(locale8.toString(), "hhhhhhhhhh_                                                                                     G             ");
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\\u0023" + "'", str10, "\\u0023");
    }

    @Test
    public void test18813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18813");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("de-DE", (int) (byte) -1, "fr-CAfr-CAfr-CAfr-CAfr-CAfr-CAfr-CAfr-CAfr-CAfr-CAfr-CAfr\\u000dfr-CAfr-CAfr-CAfr-CAfr-CAfr-CAfr-CAfr-CAfr-CAfr-CAfr-CAfr");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "de-DE" + "'", str3, "de-DE");
    }

    @Test
    public void test18814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18814");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("jpn", "ZH_cnFrench (Canada)AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test18815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18815");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("french (canada)", 81, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "french (canada)                                                                  " + "'", str3, "french (canada)                                                                  ");
    }

    @Test
    public void test18816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18816");
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
        java.util.Locale.Builder builder13 = builder10.clear();
        java.util.Locale.Builder builder14 = builder10.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder16 = builder14.setScript("CN");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: CN [at index 0]");
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
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test18817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18817");
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
        java.lang.String str12 = locale1.getDisplayName();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "English" + "'", str2, "English");
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "English" + "'", str12, "English");
    }

    @Test
    public void test18818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18818");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("(C)ALANALANALANAL");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(C)ALANALANALANAL" + "'", str1, "(C)ALANALANALANAL");
    }

    @Test
    public void test18819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18819");
        java.util.Locale locale2 = new java.util.Locale("", "");
        java.lang.String str3 = locale2.getVariant();
        java.lang.String str4 = locale2.getDisplayCountry();
        java.util.Locale locale5 = locale2.stripExtensions();
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Franz\366sisch (Kanada", '4');
        boolean boolean10 = org.apache.commons.lang3.StringUtils.startsWithAny("\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069!IH\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\", strArray9);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray9);
        boolean boolean12 = locale5.equals((java.lang.Object) int11);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test18820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18820");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("GBR");
        java.lang.String str2 = languageRange1.getRange();
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("\\u0061ItalifnischItalifnischItalifnischItalifnischItalifnischItalifnischItalifnischItalifnischItalif");
        boolean boolean5 = languageRange1.equals((java.lang.Object) strArray4);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "gbr" + "'", str2, "gbr");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test18821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18821");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("hcsineilatI             dddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hcsineilatI             dddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd" + "'", str1, "hcsineilatI             dddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd");
    }

    @Test
    public void test18822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18822");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "EN_CA", (java.lang.CharSequence) "\u4e2d\u6587\u4e2d\u56fd)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test18823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18823");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                                             hcstued", 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test18824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18824");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiPrintable('5');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test18825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18825");
        java.util.Locale locale0 = java.util.Locale.US;
        java.lang.String str1 = locale0.toLanguageTag();
        java.util.Set<java.lang.String> strSet2 = locale0.getUnicodeLocaleKeys();
        java.util.Locale locale4 = java.util.Locale.forLanguageTag("hi!");
        java.lang.String str5 = locale4.getCountry();
        java.lang.String str6 = locale4.getDisplayVariant();
        java.util.Locale locale7 = locale4.stripExtensions();
        java.lang.String str8 = locale4.getScript();
        java.lang.String str9 = locale0.getDisplayName(locale4);
        java.lang.String str10 = locale4.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "en-US" + "'", str1, "en-US");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "English (United States)" + "'", str9, "English (United States)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test18826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18826");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("\\u0034\\u00                                             hcstud                                             \\u0034\\u00 ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test18827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18827");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("\\u0034\\u00                                             h!ih                            dallemanstuD                                             \\u0034\\u00", 7);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test18828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18828");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!frankreich!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!frankreich!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str1, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!frankreich!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test18829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18829");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("\\u0034\\u00 hcstud \\u0034\\u00");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u0034\\u00hcstud\\u0034\\u00" + "'", str1, "\\u0034\\u00hcstud\\u0034\\u00");
    }

    @Test
    public void test18830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18830");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("TALY", 99);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                               TALY                                                " + "'", str2, "                                               TALY                                                ");
    }

    @Test
    public void test18831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18831");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rzh_cn", "ITALIANITALIANITALIANITALI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rzh_cn" + "'", str2, "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rzh_cn");
    }

    @Test
    public void test18832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18832");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("JP", "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC                       ", 0, 121);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC                       " + "'", str4, "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC                       ");
    }

    @Test
    public void test18833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18833");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "dddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddfranzosisch (frankreich)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test18834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18834");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("Hi!       _\\U0020_Italienisch####################################################################          ", "00000000000000COR\311EN (cOR\311E DU sUD)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!       _\\U0020_Italienisch####################################################################          " + "'", str2, "Hi!       _\\U0020_Italienisch####################################################################          ");
    }

    @Test
    public void test18835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18835");
        java.util.Locale locale3 = new java.util.Locale("\\u0023", "Italienisch", "iTALIAN");
        java.lang.String str4 = locale3.getDisplayVariant();
        java.util.Locale locale5 = locale3.stripExtensions();
        java.lang.String str6 = locale5.getDisplayScript();
        java.lang.String str7 = locale5.getDisplayVariant();
        org.junit.Assert.assertEquals(locale3.toString(), "\\u0023_ITALIENISCH_iTALIAN");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "iTALIAN" + "'", str4, "iTALIAN");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "\\u0023_ITALIENISCH_iTALIAN");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "iTALIAN" + "'", str7, "iTALIAN");
    }

    @Test
    public void test18836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18836");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("\\u000a", 82);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u000a" + "'", str2, "\\u000a");
    }

    @Test
    public void test18837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18837");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("E44444444444444444444444444444444!IHg44444444444444444444444444444444!IH44444444444444444444444444444444!IHsh", "\\u0043", 54);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test18838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18838");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "\\u0065                             a)                                                                                                           ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test18839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18839");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZW", "ITALIAN_ITALIAN_ENGLISF", 30);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZW" + "'", str4, "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZW");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test18840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18840");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("NA", "cCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC\\u00de\\u00CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NA" + "'", str2, "NA");
    }

    @Test
    public void test18841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18841");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000deutsch\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000deutsch\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test18842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18842");
        java.util.Locale locale1 = new java.util.Locale("hcstueD");
        org.junit.Assert.assertEquals(locale1.toString(), "hcstued");
    }

    @Test
    public void test18843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18843");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA23");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA23" + "'", str1, "FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA23");
    }

    @Test
    public void test18844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18844");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.lang.String str1 = locale0.getDisplayLanguage();
        java.util.Locale.setDefault(locale0);
        java.lang.String str3 = locale0.getISO3Country();
        java.lang.String str4 = locale0.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Italian" + "'", str1, "Italian");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "it" + "'", str4, "it");
    }

    @Test
    public void test18845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18845");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("\\u0052", 'k');
        java.lang.Class<?> wildcardClass3 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test18846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18846");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("ian\\u0020", "", "FRANZ\326SISCH(FRANKREICH)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ian\\u0020" + "'", str3, "ian\\u0020");
    }

    @Test
    public void test18847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18847");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("\uc774\ud0c8\ub9ac\uc544\uc5b4", 40);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\uc774\ud0c8\ub9ac\uc544\uc5b4                  " + "'", str2, "\uc774\ud0c8\ub9ac\uc544\uc5b4                  ");
    }

    @Test
    public void test18848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18848");
        java.util.Locale.Category category1 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale2 = java.util.Locale.getDefault(category1);
        java.util.Locale locale3 = java.util.Locale.GERMAN;
        java.util.Locale locale4 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str5 = locale3.getDisplayName(locale4);
        java.util.Locale.setDefault(category1, locale4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.lowerCase("                                                                                                    ", locale4);
        java.util.Locale.Category category8 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale9 = java.util.Locale.getDefault(category8);
        java.util.Locale locale10 = java.util.Locale.FRANCE;
        java.util.Locale locale11 = java.util.Locale.ITALIAN;
        java.lang.String str13 = locale11.getExtension('h');
        java.lang.String str14 = locale10.getDisplayScript(locale11);
        java.util.Locale locale15 = locale10.stripExtensions();
        java.util.Locale.setDefault(category8, locale10);
        java.util.Locale.Builder builder18 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder19 = builder18.clear();
        java.util.Locale locale20 = java.util.Locale.UK;
        java.util.Locale.Builder builder21 = builder18.setLocale(locale20);
        java.util.Locale.Builder builder22 = builder21.clearExtensions();
        java.util.Locale.Builder builder23 = new java.util.Locale.Builder();
        java.util.Locale locale24 = builder23.build();
        java.lang.String str25 = locale24.getDisplayCountry();
        java.util.Locale.Builder builder26 = builder21.setLocale(locale24);
        java.util.Locale.Builder builder27 = builder21.clear();
        java.util.Locale locale29 = new java.util.Locale("it");
        java.util.Locale.Builder builder30 = new java.util.Locale.Builder();
        java.util.Locale locale31 = builder30.build();
        java.util.Locale locale32 = java.util.Locale.FRENCH;
        java.util.Locale locale33 = java.util.Locale.ENGLISH;
        java.lang.String str34 = locale33.getDisplayCountry();
        java.lang.String str35 = locale32.getDisplayVariant(locale33);
        java.lang.String str36 = locale32.getDisplayCountry();
        java.lang.String str37 = locale32.getScript();
        java.lang.String str38 = locale32.getScript();
        java.util.Locale locale39 = java.util.Locale.FRENCH;
        java.util.Locale locale40 = java.util.Locale.ENGLISH;
        java.lang.String str41 = locale40.getDisplayCountry();
        java.lang.String str42 = locale39.getDisplayVariant(locale40);
        java.lang.String str43 = locale39.getDisplayCountry();
        java.lang.String str44 = locale39.getScript();
        java.lang.String str45 = locale39.getScript();
        java.lang.String str46 = locale32.getDisplayCountry(locale39);
        java.lang.String str47 = locale31.getDisplayVariant(locale39);
        java.util.Locale locale49 = java.util.Locale.ENGLISH;
        java.lang.String str50 = locale49.getDisplayLanguage();
        java.lang.String str51 = org.apache.commons.lang3.StringUtils.upperCase("!IH", locale49);
        java.lang.String str52 = locale49.getCountry();
        java.lang.String str53 = locale49.getCountry();
        java.lang.String str54 = locale39.getDisplayCountry(locale49);
        java.util.Locale locale58 = new java.util.Locale("HI!       ", "\\U0020", "Italienisch#########################################################################################");
        java.util.Locale locale59 = locale58.stripExtensions();
        java.lang.String str60 = locale49.getDisplayCountry(locale59);
        java.lang.String str61 = locale29.getDisplayScript(locale59);
        java.lang.String str62 = locale29.getDisplayName();
        java.util.Locale.Builder builder63 = builder27.setLocale(locale29);
        java.lang.String str64 = locale29.getISO3Country();
        java.lang.String str65 = org.apache.commons.lang3.StringUtils.lowerCase("ALLEMAND", locale29);
        java.util.Locale.setDefault(category8, locale29);
        java.lang.String str67 = locale4.getDisplayName(locale29);
        org.junit.Assert.assertTrue("'" + category1 + "' != '" + java.util.Locale.Category.FORMAT + "'", category1.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "it");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "de");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "allemand" + "'", str5, "allemand");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "                                                                                                    " + "'", str7, "                                                                                                    ");
        org.junit.Assert.assertTrue("'" + category8 + "' != '" + java.util.Locale.Category.FORMAT + "'", category8.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "it");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "en_GB");
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertEquals(locale29.toString(), "it");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "fr");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "en");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
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
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "en");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "inglese" + "'", str50, "inglese");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "!IH" + "'", str51, "!IH");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals(locale58.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "italiano" + "'", str62, "italiano");
        org.junit.Assert.assertNotNull(builder63);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "allemand" + "'", str65, "allemand");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "francese (Canada)" + "'", str67, "francese (Canada)");
    }

    @Test
    public void test18849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18849");
        java.util.Locale locale2 = new java.util.Locale("ITTAIT_ITALIAN_EGAISH                                                                                ", "aaaaaaaaaaaaaaaaaaaaaaaaFranzos...");
        java.util.Set<java.lang.String> strSet3 = locale2.getUnicodeLocaleAttributes();
        org.junit.Assert.assertEquals(locale2.toString(), "ittait_italian_egaish                                                                                _AAAAAAAAAAAAAAAAAAAAAAAAFRANZOS...");
        org.junit.Assert.assertNotNull(strSet3);
    }

    @Test
    public void test18850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18850");
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
        java.lang.String str16 = locale2.getLanguage();
        java.util.Locale.setDefault(locale2);
        java.util.Set<java.lang.Character> charSet18 = locale2.getExtensionKeys();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
// flaky:         org.junit.Assert.assertEquals(locale1.toString(), "en_US");
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "fr" + "'", str16, "fr");
        org.junit.Assert.assertNotNull(charSet18);
    }

    @Test
    public void test18851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18851");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!" + "'", str1, "HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!");
    }

    @Test
    public void test18852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18852");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("", "!ih dalleman", "fffffffffffff                                                                        ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test18853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18853");
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
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap31 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList32 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap31);
        java.util.Locale locale33 = java.util.Locale.KOREA;
        java.util.Set<java.lang.String> strSet34 = locale33.getUnicodeLocaleAttributes();
        java.lang.String str36 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet34, "\\u005c");
        java.lang.String str38 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet34, "zhzhzhzhzhzhzhzhzhzhFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAzhzhzhzhzhzhzhzhzhzh");
        java.util.List<java.lang.String> strList39 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet34);
        java.lang.String str41 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strList39, '\\');
        java.lang.String str43 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strList39, 'H');
        java.lang.String str45 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strList39, "                                             DE_DE                                              ");
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
        org.junit.Assert.assertNotNull(languageRangeList32);
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(strSet34);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(strList39);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
    }

    @Test
    public void test18854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18854");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn                                                                     ", "!ih                            dllm!ih                            dllm!ih                          ", 73);
        java.lang.Class<?> wildcardClass4 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test18855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18855");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder3.clear();
        java.util.Locale.Builder builder5 = builder3.clearExtensions();
        java.util.Locale locale6 = builder3.build();
        java.util.Locale locale7 = builder3.build();
        java.util.Set<java.lang.Character> charSet8 = locale7.getExtensionKeys();
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
        org.junit.Assert.assertNotNull(charSet8);
    }

    @Test
    public void test18856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18856");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhz", "8600u\\                                 hsiAgE_NAILATI_TiATti                                        ", (int) 'n');
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test18857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18857");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "coreano (Corea del Sud)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "coreano (Corea del Sud)" + "'", str1, "coreano (Corea del Sud)");
    }

    @Test
    public void test18858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18858");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         italian_ITALIAN_EnglisF", "nailati");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         italian_ITALIAN_EnglisF" + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         italian_ITALIAN_EnglisF");
    }

    @Test
    public void test18859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18859");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("nglish (United Kingdom", ".Korean (South Korea)Korean (So");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test18860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18860");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("FrkrB", "frn\347is(frnce)(CHINESE(CHINA)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test18861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18861");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("KOREAN", "canada");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "KOREAN" + "'", str2, "KOREAN");
    }

    @Test
    public void test18862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18862");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("\\u0020iItalian\\u008600u");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u0020iItalian\\u008600u" + "'", str1, "\\u0020iItalian\\u008600u");
    }

    @Test
    public void test18863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18863");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("!ih_HHHHHHHHHH", (int) 'H');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test18864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18864");
        java.util.Locale locale3 = new java.util.Locale("                                                                                                    ", " ", "Chinese (China)");
        java.lang.String str5 = locale3.getExtension('b');
        org.junit.Assert.assertEquals(locale3.toString(), "                                                                                                    _ _Chinese (China)");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test18865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18865");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("", (int) (short) 0, 17);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test18866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18866");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("Deutscd\\XTALXAN_ITALIAN_ENGLXSH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "DEUTSCD\\XTALXAN_ITALIAN_ENGLXSH" + "'", str1, "DEUTSCD\\XTALXAN_ITALIAN_ENGLXSH");
    }

    @Test
    public void test18867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18867");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("English (United Kingdom)", "esenihC");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "English (United Kingdom)" + "'", str2, "English (United Kingdom)");
    }

    @Test
    public void test18868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18868");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r                                                                                              Deutsch", "                ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r              Deutsch" + "'", str2, "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r              Deutsch");
    }

    @Test
    public void test18869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18869");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder5 = builder4.clear();
        java.util.Locale.Builder builder7 = builder5.setLanguage("ITALIAN");
        java.util.Locale.Builder builder8 = builder7.clear();
        java.util.Locale locale9 = builder7.build();
        java.util.Set<java.lang.Character> charSet10 = locale9.getExtensionKeys();
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
        org.junit.Assert.assertNotNull(charSet10);
    }

    @Test
    public void test18870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18870");
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
        java.util.Locale.LanguageRange[] languageRangeArray19 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList20 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList20, languageRangeArray19);
        java.util.Locale.LanguageRange[] languageRangeArray22 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList23 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList23, languageRangeArray22);
        java.lang.String[] strArray27 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList28 = new java.util.ArrayList<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList28, strArray27);
        java.util.Locale.FilteringMode filteringMode30 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList31 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList23, (java.util.Collection<java.lang.String>) strList28, filteringMode30);
        java.util.Locale.FilteringMode filteringMode32 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList33 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList20, (java.util.Collection<java.lang.String>) strList28, filteringMode32);
        java.util.Locale.LanguageRange[] languageRangeArray34 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList35 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList35, languageRangeArray34);
        java.util.Locale.LanguageRange[] languageRangeArray37 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList38 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList38, languageRangeArray37);
        java.lang.String[] strArray42 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList43 = new java.util.ArrayList<java.lang.String>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList43, strArray42);
        java.util.Locale.FilteringMode filteringMode45 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList46 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList38, (java.util.Collection<java.lang.String>) strList43, filteringMode45);
        java.util.Locale.FilteringMode filteringMode47 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList48 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList35, (java.util.Collection<java.lang.String>) strList43, filteringMode47);
        java.util.Locale.LanguageRange[] languageRangeArray49 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList50 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList50, languageRangeArray49);
        java.lang.String[] strArray54 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList55 = new java.util.ArrayList<java.lang.String>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList55, strArray54);
        java.util.Locale.FilteringMode filteringMode57 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList58 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList50, (java.util.Collection<java.lang.String>) strList55, filteringMode57);
        java.util.List<java.lang.String> strList59 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList20, (java.util.Collection<java.lang.String>) strList48, filteringMode57);
        java.lang.String str61 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strList59, '4');
        java.lang.String str63 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strList59, "Fgence");
        java.lang.String str65 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strList59, "cinese (cina)\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hh");
        java.util.List<java.lang.String> strList66 = java.util.Locale.filterTags(languageRangeList18, (java.util.Collection<java.lang.String>) strList59);
        java.lang.String str68 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strList66, "ecanadaGcanadacanadaSH                                                                                                   ");
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
        org.junit.Assert.assertNotNull(languageRangeArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(languageRangeArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + filteringMode30 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode30.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList31);
        org.junit.Assert.assertTrue("'" + filteringMode32 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode32.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList33);
        org.junit.Assert.assertNotNull(languageRangeArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(languageRangeArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + filteringMode45 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode45.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList46);
        org.junit.Assert.assertTrue("'" + filteringMode47 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode47.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList48);
        org.junit.Assert.assertNotNull(languageRangeArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + filteringMode57 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode57.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList58);
        org.junit.Assert.assertNotNull(strList59);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertNotNull(strList66);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
    }

    @Test
    public void test18871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18871");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("", 109, 82);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test18872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18872");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaafranz\366sisch (kanada)_ZH_CN", (java.lang.CharSequence) "0655de06550655de06550655d         INGS        ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 105 + "'", int2 == 105);
    }

    @Test
    public void test18873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18873");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("latIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIH", "enenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenen");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "", 102, (int) 'g');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test18874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18874");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("Italienisch", "                                                                                     g             e", (int) 'f');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Italienisch" + "'", str3, "Italienisch");
    }

    @Test
    public void test18875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18875");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("Z...FRN", "ititaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaiitalianititaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitai", "44\\u002344");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test18876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18876");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("", "fr_FR");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test18877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18877");
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
        java.util.Locale.LanguageRange[] languageRangeArray36 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList37 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList37, languageRangeArray36);
        java.lang.String[] strArray41 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList42 = new java.util.ArrayList<java.lang.String>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList42, strArray41);
        java.util.Locale.FilteringMode filteringMode44 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList45 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList37, (java.util.Collection<java.lang.String>) strList42, filteringMode44);
        java.lang.String[] strArray47 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList48 = new java.util.ArrayList<java.lang.String>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList48, strArray47);
        java.util.List<java.lang.String> strList50 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList37, (java.util.Collection<java.lang.String>) strList48);
        java.lang.String str51 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList27, (java.util.Collection<java.lang.String>) strList48);
        java.util.Locale locale52 = java.util.Locale.ITALIAN;
        java.util.Set<java.lang.Character> charSet53 = locale52.getExtensionKeys();
        java.util.Locale locale55 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale57 = new java.util.Locale("");
        java.util.Locale locale58 = java.util.Locale.FRANCE;
        java.util.Locale locale59 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str60 = locale58.getDisplayScript(locale59);
        java.util.Locale locale61 = java.util.Locale.ENGLISH;
        java.lang.String str62 = locale61.getDisplayCountry();
        java.util.Locale locale63 = java.util.Locale.PRC;
        java.util.Locale locale64 = java.util.Locale.US;
        java.util.Locale locale65 = java.util.Locale.FRANCE;
        java.util.Locale locale66 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str67 = locale65.getDisplayScript(locale66);
        java.util.Locale locale68 = java.util.Locale.ITALIAN;
        java.util.Set<java.lang.Character> charSet69 = locale68.getExtensionKeys();
        java.util.Locale locale70 = java.util.Locale.ITALIAN;
        java.lang.String str71 = locale70.getDisplayLanguage();
        java.util.Locale locale72 = java.util.Locale.FRENCH;
        java.util.Locale locale73 = java.util.Locale.US;
        java.util.Locale locale74 = java.util.Locale.ITALIAN;
        java.lang.String str75 = locale74.getDisplayLanguage();
        java.util.Locale locale76 = java.util.Locale.FRANCE;
        java.util.Locale[] localeArray77 = new java.util.Locale[] { locale52, locale55, locale57, locale58, locale61, locale63, locale64, locale66, locale68, locale70, locale72, locale73, locale74, locale76 };
        java.util.ArrayList<java.util.Locale> localeList78 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList78, localeArray77);
        java.util.Locale locale80 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList27, (java.util.Collection<java.util.Locale>) localeList78);
        java.util.List<java.util.Locale> localeList81 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList78);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap82 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList83 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap82);
        java.util.Locale locale84 = java.util.Locale.UK;
        java.util.Locale.Category category85 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale86 = java.util.Locale.getDefault(category85);
        java.util.Locale locale87 = java.util.Locale.GERMAN;
        java.util.Locale locale88 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str89 = locale87.getDisplayName(locale88);
        java.util.Locale.setDefault(category85, locale88);
        java.util.Set<java.lang.String> strSet91 = locale88.getUnicodeLocaleKeys();
        java.lang.String str92 = locale84.getDisplayVariant(locale88);
        java.lang.String str93 = locale84.getCountry();
        java.lang.String str94 = locale84.getDisplayVariant();
        java.util.Set<java.lang.String> strSet95 = locale84.getUnicodeLocaleKeys();
        java.util.List<java.lang.String> strList96 = java.util.Locale.filterTags(languageRangeList83, (java.util.Collection<java.lang.String>) strSet95);
        java.lang.String str98 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet95, 'f');
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
        org.junit.Assert.assertNotNull(languageRangeArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + filteringMode44 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode44.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList45);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(strList50);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "it");
        org.junit.Assert.assertNotNull(charSet53);
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "");
        org.junit.Assert.assertEquals(locale57.toString(), "");
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertNotNull(locale61);
        org.junit.Assert.assertEquals(locale61.toString(), "en");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale64);
        org.junit.Assert.assertEquals(locale64.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale65);
        org.junit.Assert.assertEquals(locale65.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale66);
        org.junit.Assert.assertEquals(locale66.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertNotNull(locale68);
        org.junit.Assert.assertEquals(locale68.toString(), "it");
        org.junit.Assert.assertNotNull(charSet69);
        org.junit.Assert.assertNotNull(locale70);
        org.junit.Assert.assertEquals(locale70.toString(), "it");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "italien" + "'", str71, "italien");
        org.junit.Assert.assertNotNull(locale72);
        org.junit.Assert.assertEquals(locale72.toString(), "fr");
        org.junit.Assert.assertNotNull(locale73);
        org.junit.Assert.assertEquals(locale73.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale74);
        org.junit.Assert.assertEquals(locale74.toString(), "it");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "italien" + "'", str75, "italien");
        org.junit.Assert.assertNotNull(locale76);
        org.junit.Assert.assertEquals(locale76.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(localeArray77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNull(locale80);
        org.junit.Assert.assertNotNull(localeList81);
        org.junit.Assert.assertNotNull(languageRangeList83);
        org.junit.Assert.assertNotNull(locale84);
        org.junit.Assert.assertEquals(locale84.toString(), "en_GB");
        org.junit.Assert.assertTrue("'" + category85 + "' != '" + java.util.Locale.Category.FORMAT + "'", category85.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale86);
        org.junit.Assert.assertEquals(locale86.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale87);
        org.junit.Assert.assertEquals(locale87.toString(), "de");
        org.junit.Assert.assertNotNull(locale88);
        org.junit.Assert.assertEquals(locale88.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "allemand" + "'", str89, "allemand");
        org.junit.Assert.assertNotNull(strSet91);
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "" + "'", str92, "");
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "GB" + "'", str93, "GB");
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "" + "'", str94, "");
        org.junit.Assert.assertNotNull(strSet95);
        org.junit.Assert.assertNotNull(strList96);
        org.junit.Assert.assertEquals("'" + str98 + "' != '" + "" + "'", str98, "");
    }

    @Test
    public void test18878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18878");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) ')', 103);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 103 + "'", int2 == 103);
    }

    @Test
    public void test18879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18879");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder6 = builder1.setLanguage("und");
        java.util.Locale locale7 = builder6.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder6.addUnicodeLocaleAttribute("hcsineilatI");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: hcsineilatI [at index 0]");
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
    }

    @Test
    public void test18880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18880");
        java.util.Locale locale1 = java.util.Locale.FRANCE;
        java.util.Locale locale2 = java.util.Locale.ITALIAN;
        java.lang.String str4 = locale2.getExtension('h');
        java.lang.String str5 = locale1.getDisplayScript(locale2);
        boolean boolean6 = locale1.hasExtensions();
        java.lang.String str7 = locale1.getVariant();
        java.util.Set<java.lang.Character> charSet8 = locale1.getExtensionKeys();
        java.lang.String str9 = locale1.getDisplayLanguage();
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.lowerCase("ANGLAIS (ROYAUME-UNI)fra", locale1);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "it");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charSet8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "fran\347ais" + "'", str9, "fran\347ais");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "anglais (royaume-uni)fra" + "'", str10, "anglais (royaume-uni)fra");
    }

    @Test
    public void test18881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18881");
        char[] charArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "Zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz\\XTALXAN_ITALIAN_ENGLXSHzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test18882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18882");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hi!");
        java.lang.String str2 = locale1.getCountry();
        java.util.Locale.Builder builder3 = new java.util.Locale.Builder();
        java.util.Locale locale4 = builder3.build();
        java.util.Locale locale6 = java.util.Locale.forLanguageTag("Italian");
        java.lang.String str7 = locale4.getDisplayLanguage(locale6);
        java.lang.String str8 = locale1.getDisplayLanguage(locale4);
        java.lang.String str9 = locale1.getDisplayVariant();
        java.lang.String str10 = locale1.getDisplayName();
        java.util.Locale locale11 = locale1.stripExtensions();
        java.util.Locale.Category category12 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale13 = java.util.Locale.getDefault(category12);
        java.util.Locale locale14 = java.util.Locale.getDefault(category12);
        java.lang.String str15 = locale14.getDisplayVariant();
        java.util.Locale locale16 = locale14.stripExtensions();
        java.lang.String str17 = locale11.getDisplayVariant(locale16);
        boolean boolean18 = locale11.hasExtensions();
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
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertTrue("'" + category12 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category12.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test18883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18883");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("fr_CA                             ...HI!fr_CA                             ...!", "!       2ITALIANITALIANITALIANITALItalienisch2ITALIANITALIANITALIANITALitalian_ITALIAN_English2ITALIANITALIANITALIANITALHI!2ITALIANITALIANITALIANITALhi!2ITALIANITALIANITALIANITALADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...2ITALIANITALIANITALIANITAL\\u00342ITALIANITALIANITALIANITALHI!2ITALIANITALIANITALIANITALItalian2ITALIANITALIANITALIANITAL\\u00612ITALIANITALIANITALIANITAL\\u00232ITALIANITALIANITALIANITALhi!2ITALIANITALIANITALIANITALiTALIAN2ITALIANITALIANITALIANITALChinese (China)2ITALIANITALIANITALIANITALhi!2ITALIANITALIANITALIANITALzh_CN2ITALIANITALIANITALIANITALiTALIAN2ITALIANITALIANITALIANITALen2ITALIANITALIANITALIANITALItalienisch", 224);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test18884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18884");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("KoreanADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDhcstueDKoreanADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDB");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "KoreanADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDhcstueDKoreanADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDB" + "'", str1, "KoreanADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDhcstueDKoreanADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDB");
    }

    @Test
    public void test18885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18885");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA", 406, (int) ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...ALzhAMzhANzhAOzhAQzhARzhASzhA" + "'", str3, "...ALzhAMzhANzhAOzhAQzhARzhASzhA");
    }

    @Test
    public void test18886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18886");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("e ITALIAN,ENGLISHa");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test18887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18887");
        java.util.Locale.Category category1 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale2 = java.util.Locale.getDefault(category1);
        java.util.Locale locale3 = java.util.Locale.getDefault(category1);
        java.util.Locale locale4 = java.util.Locale.getDefault(category1);
        java.util.Set<java.lang.String> strSet5 = locale4.getUnicodeLocaleAttributes();
        java.lang.String str6 = locale4.getDisplayVariant();
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.lowerCase("china", locale4);
        org.junit.Assert.assertTrue("'" + category1 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category1.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "china" + "'", str7, "china");
    }

    @Test
    public void test18888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18888");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("Iitalian(italian,eng", "Eg");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test18889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18889");
        java.util.Locale locale0 = java.util.Locale.ENGLISH;
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = locale0.getDisplayName(locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en");
    }

    @Test
    public void test18890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18890");
        java.util.Locale locale0 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale4 = new java.util.Locale("Italian", "Italian", "English");
        java.lang.String str5 = locale4.getDisplayCountry();
        java.lang.String str6 = locale0.getDisplayCountry(locale4);
        java.lang.String str8 = locale4.getExtension('E');
        java.lang.Object obj9 = locale4.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals(locale4.toString(), "italian_ITALIAN_English");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ITALIAN" + "'", str5, "ITALIAN");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "China" + "'", str6, "China");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "italian_ITALIAN_English");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "italian_ITALIAN_English");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "italian_ITALIAN_English");
    }

    @Test
    public void test18891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18891");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("\ud504\ub791\uc2a4\uc5b4\uce90\ub098\ub2e4)_ENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENG_                                                                    \\U0020ITALIANITALIANITALIANITALI", "italian    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ud504\ub791\uc2a4\uc5b4\uce90\ub098\ub2e4)_ENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENG_                                                                    \\U0020ITALIANITALIANITALIANITALI" + "'", str2, "\ud504\ub791\uc2a4\uc5b4\uce90\ub098\ub2e4)_ENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENG_                                                                    \\U0020ITALIANITALIANITALIANITALI");
    }

    @Test
    public void test18892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18892");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) ".................................Italian (Italy)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test18893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18893");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("\\u0020iTALIANiTALIANiTALIANiTALI", "dallemandallemandallemandallemandallemandallemandallemandallennnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test18894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18894");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("inglesehhhhhhhhH", 't');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "inglesehhhhhhhhH" + "'", str2, "inglesehhhhhhhhH");
    }

    @Test
    public void test18895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18895");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("Italian");
        java.util.Locale.Builder builder4 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder0.clear();
        java.util.Locale locale7 = java.util.Locale.forLanguageTag("\\u0020");
        java.util.Locale.Builder builder8 = builder0.setLocale(locale7);
        java.util.Locale.Builder builder11 = builder0.setExtension('u', "Italian");
        java.util.Locale.Builder builder12 = builder11.clearExtensions();
        java.util.Locale.Builder builder13 = builder12.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder16 = builder13.setUnicodeLocaleKeyword("", "\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key:  [at index 0]");
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
    }

    @Test
    public void test18896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18896");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("\\U0069\\U0069\\U", 32, 56);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test18897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18897");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test18898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18898");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("aaaaaaaaaaaaaaaaaaaaaaaaFranz\366sisch(Frankreich)aaaaaaaaaaaaaaaaaaaaaaaa", 371, "\u82f1\u6587");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTaaaaaaaaaaaaaaaaaaaaaaaaFranz\366sisch(Frankreich)aaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTaaaaaaaaaaaaaaaaaaaaaaaaFranz\366sisch(Frankreich)aaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test18899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18899");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("b");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test18900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18900");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("ian\\u0020i");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test18901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18901");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("5\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065", (int) 'a', "\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069!ih\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\engli");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065" + "'", str3, "5\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065");
    }

    @Test
    public void test18902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18902");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("                                         fr-c                                                          ", 'x');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + ' ' + "'", char2 == ' ');
    }

    @Test
    public void test18903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18903");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("Deutscd", "hi!       5Italienisch5italian_ITALIAN_English5HI!5hi!5ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...5\\u00345HI!5Italian5\\u00615\\u00235hi!5iTALIAN5Chinese (China)5hi!5zh_CN5iTALIAN5en5Italienisch", 262, 76);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Deutscdhi!       5Italienisch5italian_ITALIAN_English5HI!5hi!5ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...5\\u00345HI!5Italian5\\u00615\\u00235hi!5iTALIAN5Chinese (China)5hi!5zh_CN5iTALIAN5en5Italienisch" + "'", str4, "Deutscdhi!       5Italienisch5italian_ITALIAN_English5HI!5hi!5ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...5\\u00345HI!5Italian5\\u00615\\u00235hi!5iTALIAN5Chinese (China)5hi!5zh_CN5iTALIAN5en5Italienisch");
    }

    @Test
    public void test18904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18904");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("cHINESISCH(cHINA)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "cHINESISCH(cHINA)" + "'", str1, "cHINESISCH(cHINA)");
    }

    @Test
    public void test18905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18905");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzHSXLGNE_NAILATI_NAXLATX\\zzzzz...", 82, 220);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test18906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18906");
        char[] charArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "     ", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test18907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18907");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("nglish ...", "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\!_\\u0020_itle\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test18908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18908");
        java.util.Locale.Builder builder1 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setLanguageTag("Italian");
        java.util.Locale locale5 = builder4.build();
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.lowerCase("CANADA", locale5);
        java.lang.String str7 = locale5.getScript();
        java.lang.String str8 = locale5.toLanguageTag();
        java.lang.String str9 = locale5.toString();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "italian");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "canada" + "'", str6, "canada");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "italian" + "'", str8, "italian");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "italian" + "'", str9, "italian");
    }

    @Test
    public void test18909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18909");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("  \\u007a555555555555555555555555555555555", 72, '\u671d');
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d  \\\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d" + "'", str3, "\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d  \\\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d");
    }

    @Test
    public void test18910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18910");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "                                                         \\u005c                                                         ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test18911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18911");
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
        java.util.Locale.Builder builder12 = builder11.clearExtensions();
        java.util.Locale.Builder builder13 = builder12.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder15 = builder13.setLanguageTag("EagaasiTALIAN_italian_eNGLISHITALIAN_!IHitTAiT_ITALIAN_EgAish");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: EagaasiTALIAN_italian_eNGLISHITALIAN_!IHitTAiT_ITALIAN_EgAish [at index 0]");
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
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test18912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18912");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("                                                                                                                                          ADAEAFAGAIALAMANAOAQARASAAUAWAXAZBABB                                                                                                                                           ", "                                                     DE_DE                                              ", "hsiAgE_NAILATI_TiATtiHI!_NAILATI         HSILGNe_nailati_NAILATI");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test18913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18913");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "fran\347ais (France)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test18914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18914");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder4 = builder2.setScript("");
        java.util.Locale.Builder builder5 = builder4.clear();
        java.util.Locale.Builder builder6 = builder4.clearExtensions();
        java.util.Locale.Builder builder7 = builder6.clearExtensions();
        java.util.Locale.Builder builder9 = builder6.removeUnicodeLocaleAttribute("francese");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder9.setLanguageTag("    ...");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag:     ... [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test18915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18915");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "tititititiAiiiiiiiiiiiiiiiiitalian_italian_englishiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiitititititit");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test18916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18916");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("                                          francese (Canada)                                           ", "ZhozhozhozhozhozhozhozhozhozhozhoItaliazhozhozhozhozhozhozhozhozhozhozhoz");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test18917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18917");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("ADCAECAFCAGCAICALCAMCANCAOCAQCARCASCATCAUCAWCAXCAZCBACBBCBDCBECBFCBGCBHCBICBJCBLCBMCBNCBOCBQCBRCBSCBTCBVCBWCBYCBZCCACCCCCDCCFCCGCCHCCICCKCCLCCMCCNCCOCCRCCUCCVCCWCCXCCYCCZCDECDJCDKCDMCDOCDZCECCEECEGCEHCERCESCETCFICFJCFKCFMCFOCFRCGACGBCGDCGECGFCGGCGHCGICGLCGMCGNCGPCGQCGRCGSCGTCGUCGWCGYCHKCHMCHNCHRCHTCHUCIDCIECILCIMCINCIOCIQCIRCISCITCJECJMCJOCJPCKECKGCKHCKICKMCKNCKPCKRCKWCKYCKZCLACLBCLCCLICLKCLRCLSCLTCLUCLVCLYCMACMCCMDCMECMFCMGCMHCMKCMLCMMCMNCMOCMPCMQCMRCMSCMTCMUCMVCMWCMXCMYCMZCNACNCCNECNFCNGCNICNLCNOCNPCNRCNUCNZCOMCPACPECPFCPGCPHCPKCPLCPMCPNCPRCPSCPTCPWCPYCQACRECROCRSCRUCRWCSACSBCSCCSDCSECSGCSHCSICSJCSKCSLCSMCSNCSOCSRCSSCSTCSVCSXCSYCSZCTCCTDCTFCTGCTHCTJCTKCTLCTMCTNCTOCTRCTTCTVCTWCTZCUACUGCUMCUSCUYCUZCVACVCCVECVGCVICVNCVUCWFCWSCYECYTCZACZMCZW");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ADCAECAFCAGCAICALCAMCANCAOCAQCARCASCATCAUCAWCAXCAZCBACBBCBDCBECBFCBGCBHCBICBJCBLCBMCBNCBOCBQCBRCBSCBTCBVCBWCBYCBZCCACCCCCDCCFCCGCCHCCICCKCCLCCMCCNCCOCCRCCUCCVCCWCCXCCYCCZCDECDJCDKCDMCDOCDZCECCEECEGCEHCERCESCETCFICFJCFKCFMCFOCFRCGACGBCGDCGECGFCGGCGHCGICGLCGMCGNCGPCGQCGRCGSCGTCGUCGWCGYCHKCHMCHNCHRCHTCHUCIDCIECILCIMCINCIOCIQCIRCISCITCJECJMCJOCJPCKECKGCKHCKICKMCKNCKPCKRCKWCKYCKZCLACLBCLCCLICLKCLRCLSCLTCLUCLVCLYCMACMCCMDCMECMFCMGCMHCMKCMLCMMCMNCMOCMPCMQCMRCMSCMTCMUCMVCMWCMXCMYCMZCNACNCCNECNFCNGCNICNLCNOCNPCNRCNUCNZCOMCPACPECPFCPGCPHCPKCPLCPMCPNCPRCPSCPTCPWCPYCQACRECROCRSCRUCRWCSACSBCSCCSDCSECSGCSHCSICSJCSKCSLCSMCSNCSOCSRCSSCSTCSVCSXCSYCSZCTCCTDCTFCTGCTHCTJCTKCTLCTMCTNCTOCTRCTTCTVCTWCTZCUACUGCUMCUSCUYCUZCVACVCCVECVGCVICVNCVUCWFCWSCYECYTCZACZMCZW" + "'", str1, "ADCAECAFCAGCAICALCAMCANCAOCAQCARCASCATCAUCAWCAXCAZCBACBBCBDCBECBFCBGCBHCBICBJCBLCBMCBNCBOCBQCBRCBSCBTCBVCBWCBYCBZCCACCCCCDCCFCCGCCHCCICCKCCLCCMCCNCCOCCRCCUCCVCCWCCXCCYCCZCDECDJCDKCDMCDOCDZCECCEECEGCEHCERCESCETCFICFJCFKCFMCFOCFRCGACGBCGDCGECGFCGGCGHCGICGLCGMCGNCGPCGQCGRCGSCGTCGUCGWCGYCHKCHMCHNCHRCHTCHUCIDCIECILCIMCINCIOCIQCIRCISCITCJECJMCJOCJPCKECKGCKHCKICKMCKNCKPCKRCKWCKYCKZCLACLBCLCCLICLKCLRCLSCLTCLUCLVCLYCMACMCCMDCMECMFCMGCMHCMKCMLCMMCMNCMOCMPCMQCMRCMSCMTCMUCMVCMWCMXCMYCMZCNACNCCNECNFCNGCNICNLCNOCNPCNRCNUCNZCOMCPACPECPFCPGCPHCPKCPLCPMCPNCPRCPSCPTCPWCPYCQACRECROCRSCRUCRWCSACSBCSCCSDCSECSGCSHCSICSJCSKCSLCSMCSNCSOCSRCSSCSTCSVCSXCSYCSZCTCCTDCTFCTGCTHCTJCTKCTLCTMCTNCTOCTRCTTCTVCTWCTZCUACUGCUMCUSCUYCUZCVACVCCVECVGCVICVNCVUCWFCWSCYECYTCZACZMCZW");
    }

    @Test
    public void test18918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18918");
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
        java.lang.String str15 = locale2.getDisplayScript();
        java.util.Locale.Category category16 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale17 = java.util.Locale.getDefault(category16);
        java.util.Locale locale18 = java.util.Locale.GERMAN;
        java.util.Locale locale19 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str20 = locale18.getDisplayName(locale19);
        java.util.Locale.setDefault(category16, locale19);
        java.util.Locale.Category category22 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale23 = java.util.Locale.getDefault(category22);
        java.lang.String str25 = locale23.getExtension('x');
        java.util.Locale.setDefault(category16, locale23);
        java.util.Locale locale27 = java.util.Locale.getDefault(category16);
        java.util.Locale locale29 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale.setDefault(category16, locale29);
        java.util.Locale locale32 = java.util.Locale.FRANCE;
        java.util.Locale locale33 = java.util.Locale.ITALIAN;
        java.lang.String str35 = locale33.getExtension('h');
        java.lang.String str36 = locale32.getDisplayScript(locale33);
        java.util.Locale locale37 = locale32.stripExtensions();
        java.lang.String str38 = locale37.getISO3Country();
        java.util.Locale locale40 = new java.util.Locale("en");
        boolean boolean41 = locale40.hasExtensions();
        java.util.Set<java.lang.String> strSet42 = locale40.getUnicodeLocaleKeys();
        java.lang.String str43 = locale37.getDisplayCountry(locale40);
        java.util.Locale locale45 = new java.util.Locale("en");
        boolean boolean46 = locale45.hasExtensions();
        java.lang.String str47 = locale40.getDisplayCountry(locale45);
        java.lang.String str48 = org.apache.commons.lang3.StringUtils.lowerCase("Frnz\366sisch (Knd)", locale40);
        java.util.Locale locale49 = locale40.stripExtensions();
        java.util.Locale.setDefault(category16, locale49);
        java.lang.String str51 = locale49.getDisplayLanguage();
        java.lang.String str52 = locale2.getDisplayCountry(locale49);
        java.lang.String str53 = locale2.getDisplayCountry();
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
        org.junit.Assert.assertTrue("'" + category16 + "' != '" + java.util.Locale.Category.FORMAT + "'", category16.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "de");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "allemand" + "'", str20, "allemand");
        org.junit.Assert.assertTrue("'" + category22 + "' != '" + java.util.Locale.Category.FORMAT + "'", category22.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "fr_CA");
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "it");
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "FRA" + "'", str38, "FRA");
        org.junit.Assert.assertEquals(locale40.toString(), "en");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(strSet42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "France" + "'", str43, "France");
        org.junit.Assert.assertEquals(locale45.toString(), "en");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "frnz\366sisch (knd)" + "'", str48, "frnz\366sisch (knd)");
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "en");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "English" + "'", str51, "English");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "United Kingdom" + "'", str52, "United Kingdom");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "United Kingdom" + "'", str53, "United Kingdom");
    }

    @Test
    public void test18919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18919");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("KOR");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\\u0041", "engengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengeng", (int) '!');
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                              \\     ", "");
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Deutsch", 'i');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.replaceEach("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444en", strArray11, strArray14);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray14);
        int int17 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("ixii", strArray14);
        java.lang.String[] strArray19 = org.apache.commons.lang3.StringUtils.stripAll(strArray14, "Chinese");
        java.lang.String[] strArray20 = org.apache.commons.lang3.StringUtils.stripAll(strArray19);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                              444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444en", strArray6, strArray20);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray20);
        boolean boolean23 = languageRange1.equals((java.lang.Object) int22);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444en" + "'", str15, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444en");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Deutsch" + "'", str16, "Deutsch");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "                              444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444en" + "'", str21, "                              444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444en");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test18920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18920");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("GBR", "                                        ITtaIt_italian_eGaISH                                 \\U0068", "z...Frn", 14);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "GBR" + "'", str4, "GBR");
    }

    @Test
    public void test18921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18921");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "                                                                 \\U0020  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test18922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18922");
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
        java.lang.String str18 = locale8.getCountry();
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
        java.lang.String str36 = locale8.getDisplayVariant(locale26);
        java.util.Locale locale37 = java.util.Locale.FRANCE;
        java.util.Locale locale38 = java.util.Locale.ITALIAN;
        java.lang.String str40 = locale38.getExtension('h');
        java.lang.String str41 = locale37.getDisplayScript(locale38);
        java.lang.String str42 = locale37.getISO3Country();
        java.util.Locale locale43 = java.util.Locale.GERMAN;
        java.util.Locale.setDefault(locale43);
        java.lang.String str45 = locale37.getDisplayName(locale43);
        java.lang.String str46 = locale37.getScript();
        java.lang.String str47 = locale8.getDisplayVariant(locale37);
        java.lang.String str48 = locale8.getISO3Language();
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "de");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "allemand" + "'", str21, "allemand");
        org.junit.Assert.assertTrue("'" + category22 + "' != '" + java.util.Locale.Category.FORMAT + "'", category22.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "en");
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
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "anglais" + "'", str35, "anglais");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "it");
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "FRA" + "'", str42, "FRA");
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "de");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Franz\366sisch (Frankreich)" + "'", str45, "Franz\366sisch (Frankreich)");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "eng" + "'", str48, "eng");
    }

    @Test
    public void test18923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18923");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("44                                                                                               en44");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test18924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18924");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDH...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test18925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18925");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("deutsch");
        java.lang.String str2 = languageRange1.getRange();
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("\\u002e", "                                                         \\u0046                                                         ");
        boolean boolean6 = languageRange1.equals((java.lang.Object) "                                                         \\u0046                                                         ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "deutsch" + "'", str2, "deutsch");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test18926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18926");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("hhhhhhhhhh", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=hhhhhhhhhh");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test18927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18927");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rH !\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test18928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18928");
        char[] charArray10 = new char[] { 'A', 't', '\r', 'f', 'R' };
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny("cccccccccccccccccccccccccccccccccccccccccccccccccenglischcccccccccccccccccccccccccccccccccccccccccccccccccc", charArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny("It_I", charArray10);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "AhzRAhzQAhzOAhzNAh", charArray10);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "ITA", charArray10);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "C\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rChinesisch (China)", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "At\rfR");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "At\rfR");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[A, t, \r, f, R]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test18929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18929");
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
        java.util.Locale.LanguageRange[] languageRangeArray13 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList14 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList14, languageRangeArray13);
        java.lang.String[] strArray18 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        java.util.Locale.FilteringMode filteringMode21 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList22 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList14, (java.util.Collection<java.lang.String>) strList19, filteringMode21);
        java.util.Locale.FilteringMode filteringMode23 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList24 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList11, (java.util.Collection<java.lang.String>) strList19, filteringMode23);
        java.util.Collection<java.util.Locale> localeCollection25 = null;
        java.util.List<java.util.Locale> localeList26 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList11, localeCollection25);
        java.util.Locale locale27 = java.util.Locale.lookup(languageRangeList2, (java.util.Collection<java.util.Locale>) localeList26);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap28 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList29 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList2, strMap28);
        java.util.Locale locale30 = java.util.Locale.CANADA_FRENCH;
        java.util.Set<java.lang.String> strSet31 = locale30.getUnicodeLocaleKeys();
        java.lang.String str33 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet31, "...ANiTALI");
        java.util.List<java.lang.String> strList34 = java.util.Locale.filterTags(languageRangeList29, (java.util.Collection<java.lang.String>) strSet31);
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
        org.junit.Assert.assertNotNull(languageRangeArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + filteringMode21 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode21.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertTrue("'" + filteringMode23 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode23.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(localeList26);
        org.junit.Assert.assertNull(locale27);
        org.junit.Assert.assertNotNull(languageRangeList29);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(strSet31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(strList34);
    }

    @Test
    public void test18930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18930");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("hh9600u\\hhhhhhhhhh9600u\\hhhhhhhhhh9600u\\hhhhhhhhhh9600u\\)anic( esenic", "Fr ncG", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hh9600u\\hhhhhhhhhh9600u\\hhhhhhhhhh9600u\\hhhhhhhhhh9600u\\)anic( esenic" + "'", str3, "hh9600u\\hhhhhhhhhh9600u\\hhhhhhhhhh9600u\\hhhhhhhhhh9600u\\)anic( esenic");
    }

    @Test
    public void test18931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18931");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\uc601\uc5b4");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "dddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddFranzosisch (Frankreich)", (int) 'f', 2);
        org.junit.Assert.assertNotNull(strArray1);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test18932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18932");
        char[] charArray16 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray16);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "iTALIAN", charArray16);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "it", charArray16);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "h", charArray16);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                                                         ", charArray16);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsAny("Englisch", charArray16);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC", charArray16);
        boolean boolean24 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "ko-KR                                                                                                   ", charArray16);
        boolean boolean25 = org.apache.commons.lang3.StringUtils.containsAny("           e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               ", charArray16);
        boolean boolean26 = org.apache.commons.lang3.StringUtils.containsAny("ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDh...", charArray16);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "4##a a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "4##a a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[4, #, #, a,  , a]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test18933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18933");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("erma (ermay)                                                 TALIAN                                                  ");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test18934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18934");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("u005c", "\\u0065                             a)                                                                                                           ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "u005c" + "'", str2, "u005c");
    }

    @Test
    public void test18935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18935");
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
            java.util.Locale.Builder builder14 = builder11.setUnicodeLocaleKeyword("          2cinese (cina)italianitalianitalianital", "9hhhhhhhhhh          9hhhhhhhhhh   ");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key:           2cinese (cina)italianitalianitalianital [at index 0]");
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
    public void test18936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18936");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("ADYAEYAFYAGYAIYALYAMYANYAOYAQYARYASYATYAUYAWYAXYAZYBAYBBYBDYBEYBFYBGYBHYBIYBJYBLYBMYBNYBOYBQYBRYBSYBTYBVYBWYBYYBZYCAYCCYCDYCFYCGYCHYCIYCKYCLYCMYCNYCOYCRYCUYCVYCWYCXYCYYCZYDEYDJYDKYDMYDOYDZYECYEEYEGYEHYERYESYETYFIYFJYFKYFMYFOYFRYGAYGBYGDYGEYGFYGGYGHYGIYGLYGMYGNYGPYGQYGRYGSYGTYGUYGWYGYYHKYHMYHNYHRYHTYHUYIDYIEYILYIMYINYIOYIQYIRYISYITYJEYJMYJOYJPYKEYKGYKHYKIYKMYKNYKPYKRYKWYKYYKZYLAYLBYLCYLIYLKYLRYLSYLTYLUYLVYLYYMAYMCYMDYMEYMFYMGYMHYMKYMLYMMYMNYMOYMPYMQYMRYMSYMTYMUYMVYMWYMXYMYYMZYNAYNCYNEYNFYNGYNIYNLYNOYNPYNRYNUYNZYOMYPAYPEYPFYPGYPHYPKYPLYPMYPNYPRYPSYPTYPWYPYYQAYREYROYRSYRUYRWYSAYSBYSCYSDYSEYSGYSHYSIYSJYSKYSLYSMYSNYSOYSRYSSYSTYSVYSXYSYYSZYTCYTDYTFYTGYTHYTJYTKYTLYTMYTNYTOYTRYTTYTVYTWYTZYUAYUGYUMYUSYUYYUZYVAYVCYVEYVGYVIYVNYVUYWFYWSYYEYYTYZAYZMYZW", "ECANADA                                      ...g                                      ...CANADACANADA                                      ...sh                                      ...                                                                                                   ", "alhi!       _\\U0020_Italienisch####################################################################          andallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemand");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ADYAEYAFYAGYAIYALYAMYANYAOYAQYARYASYATYAUYAWYAXYAZYBAYBBYBDYBEYBFYBGYBHYBIYBJYBLYBMYBNYBOYBQYBRYBSYBTYBVYBWYBYYBZYCAYCCYCDYCFYCGYCHYCIYCKYCLYCMYCNYCOYCRYCUYCVYCWYCXYCYYCZYDEYDJYDKYDMYDOYDZYECYEEYEGYEHYERYESYETYFIYFJYFKYFMYFOYFRYGAYGBYGDYGEYGFYGGYGHYGIYGLYGMYGNYGPYGQYGRYGSYGTYGUYGWYGYYHKYHMYHNYHRYHTYHUYIDYIEYILYIMYINYIOYIQYIRYISYITYJEYJMYJOYJPYKEYKGYKHYKIYKMYKNYKPYKRYKWYKYYKZYLAYLBYLCYLIYLKYLRYLSYLTYLUYLVYLYYMAYMCYMDYMEYMFYMGYMHYMKYMLYMMYMNYMOYMPYMQYMRYMSYMTYMUYMVYMWYMXYMYYMZYNAYNCYNEYNFYNGYNIYNLYNOYNPYNRYNUYNZYOMYPAYPEYPFYPGYPHYPKYPLYPMYPNYPRYPSYPTYPWYPYYQAYREYROYRSYRUYRWYSAYSBYSCYSDYSEYSGYSHYSIYSJYSKYSLYSMYSNYSOYSRYSSYSTYSVYSXYSYYSZYTCYTDYTFYTGYTHYTJYTKYTLYTMYTNYTOYTRYTTYTVYTWYTZYUAYUGYUMYUSYUYYUZYVAYVCYVEYVGYVIYVNYVUYWFYWSYYEYYTYZAYZMYZW" + "'", str3, "ADYAEYAFYAGYAIYALYAMYANYAOYAQYARYASYATYAUYAWYAXYAZYBAYBBYBDYBEYBFYBGYBHYBIYBJYBLYBMYBNYBOYBQYBRYBSYBTYBVYBWYBYYBZYCAYCCYCDYCFYCGYCHYCIYCKYCLYCMYCNYCOYCRYCUYCVYCWYCXYCYYCZYDEYDJYDKYDMYDOYDZYECYEEYEGYEHYERYESYETYFIYFJYFKYFMYFOYFRYGAYGBYGDYGEYGFYGGYGHYGIYGLYGMYGNYGPYGQYGRYGSYGTYGUYGWYGYYHKYHMYHNYHRYHTYHUYIDYIEYILYIMYINYIOYIQYIRYISYITYJEYJMYJOYJPYKEYKGYKHYKIYKMYKNYKPYKRYKWYKYYKZYLAYLBYLCYLIYLKYLRYLSYLTYLUYLVYLYYMAYMCYMDYMEYMFYMGYMHYMKYMLYMMYMNYMOYMPYMQYMRYMSYMTYMUYMVYMWYMXYMYYMZYNAYNCYNEYNFYNGYNIYNLYNOYNPYNRYNUYNZYOMYPAYPEYPFYPGYPHYPKYPLYPMYPNYPRYPSYPTYPWYPYYQAYREYROYRSYRUYRWYSAYSBYSCYSDYSEYSGYSHYSIYSJYSKYSLYSMYSNYSOYSRYSSYSTYSVYSXYSYYSZYTCYTDYTFYTGYTHYTJYTKYTLYTMYTNYTOYTRYTTYTVYTWYTZYUAYUGYUMYUSYUYYUZYVAYVCYVEYVGYVIYVNYVUYWFYWSYYEYYTYZAYZMYZW");
    }

    @Test
    public void test18937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18937");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("                                                                                                                  \\u0068", "...444444444444444444444444444444444444444444444444444                              ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                  \\u0068" + "'", str2, "                                                                                                                  \\u0068");
    }

    @Test
    public void test18938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18938");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "english                                h                                 ", (java.lang.CharSequence) "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiitalian_ITALIAN_Englishiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 103 + "'", int2 == 103);
    }

    @Test
    public void test18939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18939");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDF...", "99999\\u0021");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDF..." + "'", str2, "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDF...");
    }

    @Test
    public void test18940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18940");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder5 = builder4.clear();
        java.util.Locale.Builder builder6 = builder4.clearExtensions();
        java.util.Locale.Builder builder8 = builder6.setLanguage("UND");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder8.removeUnicodeLocaleAttribute("!ih dalleman");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: !ih dalleman [at index 0]");
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
    }

    @Test
    public void test18941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18941");
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
        java.util.Locale locale28 = java.util.Locale.ITALIAN;
        java.lang.String str29 = locale28.getDisplayLanguage();
        java.util.Locale locale30 = locale28.stripExtensions();
        java.util.Locale locale32 = java.util.Locale.forLanguageTag("\\u0020");
        java.lang.String str33 = locale32.getDisplayScript();
        java.lang.String str34 = locale30.getDisplayCountry(locale32);
        java.lang.String str35 = org.apache.commons.lang3.StringUtils.lowerCase("\ud504\ub791\uc2a4\uc5b4", locale30);
        java.lang.String str36 = locale30.toLanguageTag();
        java.lang.String str37 = locale19.getDisplayVariant(locale30);
        java.lang.String str38 = locale19.toLanguageTag();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Franz\366sisch (Kanada)" + "'", str3, "Franz\366sisch (Kanada)");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "it");
        org.junit.Assert.assertNotNull(charSet7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Italienisch" + "'", str9, "Italienisch");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Italienisch" + "'", str10, "Italienisch");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Italienisch" + "'", str11, "Italienisch");
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
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "it");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Italienisch" + "'", str29, "Italienisch");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "it");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "\ud504\ub791\uc2a4\uc5b4" + "'", str35, "\ud504\ub791\uc2a4\uc5b4");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "it" + "'", str36, "it");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "france" + "'", str38, "france");
    }

    @Test
    public void test18942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18942");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'n', 56);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 56 + "'", int2 == 56);
    }

    @Test
    public void test18943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18943");
        java.util.Locale locale2 = new java.util.Locale("French", "NC_HZ");
        java.util.Locale locale3 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale7 = new java.util.Locale("Italian", "Italian", "English");
        java.lang.String str8 = locale7.getDisplayCountry();
        java.lang.String str9 = locale3.getDisplayCountry(locale7);
        java.lang.String str10 = locale2.getDisplayVariant(locale3);
        java.lang.Object obj11 = locale3.clone();
        org.junit.Assert.assertEquals(locale2.toString(), "french_NC_HZ");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
        org.junit.Assert.assertEquals(locale7.toString(), "italian_ITALIAN_English");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ITALIAN" + "'", str8, "ITALIAN");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "China" + "'", str9, "China");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "zh_CN");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "zh_CN");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "zh_CN");
    }

    @Test
    public void test18944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18944");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("FR_fr", "hcstueD");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "FR_fr" + "'", str2, "FR_fr");
    }

    @Test
    public void test18945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18945");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("Italian");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder3.setRegion("aaaaaaaaaaaaaaaaaaaaaaaaFranz\366sisch(Frankreich)aaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: aaaaaaaaaaaaaaaaaaaaaaaaFranzo?sisch(Frankreich)aaaaaaaaaaaaaaaaaaaaaaaa [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test18946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18946");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("ITTAIT_ITALIAN_EGAISH                                                                                ", "Chinesischitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoit", (-1));
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, 'E');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ITTAIT_ITALIAN_EGAISH                                                                                " + "'", str5, "ITTAIT_ITALIAN_EGAISH                                                                                ");
    }

    @Test
    public void test18947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18947");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("\\u0034\\u00                                             hcstued                                             \\u0034\\u00 (\\U0020IITALIAN\\U0020I)", "Deutscd", (int) '\n');
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "...\r\r\r\r\r\r\r\r..");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test18948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18948");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                                                                           U0020ITALIANITALIANITALIANITALI", 'g', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                           U0020ITALIANITALIANITALIANITALI" + "'", str3, "                                                                                           U0020ITALIANITALIANITALIANITALI");
    }

    @Test
    public void test18949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18949");
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
        java.util.Locale.Builder builder17 = builder7.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder19 = builder7.removeUnicodeLocaleAttribute("5c");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: 5c [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Franz\366sisch (Kanada)" + "'", str3, "Franz\366sisch (Kanada)");
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
        org.junit.Assert.assertNotNull(builder17);
    }

    @Test
    public void test18950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18950");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("           e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               ", "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rChinesisch (China)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test18951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18951");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("", (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test18952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18952");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rH !\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rH !\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r" + "'", str1, "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rH !\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r");
    }

    @Test
    public void test18953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18953");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            " + "'", str1, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ");
    }

    @Test
    public void test18954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18954");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "\\u0020)TALIAN)TALIAN)TALIANiTALI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u0020)TALIAN)TALIAN)TALIANiTALI" + "'", str1, "\\u0020)TALIAN)TALIAN)TALIANiTALI");
    }

    @Test
    public void test18955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18955");
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
        java.util.Locale locale11 = builder8.build();
        java.lang.String str12 = locale11.getDisplayVariant();
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
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test18956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18956");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("                                                                        ", "korezhzhzhzhzhzhzhzhzhzhfraadzhaezhafzhagzhaizhalzhamzhanzhaozhaqzharzhaszhazhzhzhzhzhzhzemandn (south korea)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test18957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18957");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("iTALIAN (ITALIAN,ENGLISH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "iTALIAN (ITALIAN,ENGLISH" + "'", str1, "iTALIAN (ITALIAN,ENGLISH");
    }

    @Test
    public void test18958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18958");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("Franz\366sischFranzosisch(Frankreich)kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk", "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!zH_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Franz\366sischFranzosisch(Frankreich)kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk" + "'", str2, "Franz\366sischFranzosisch(Frankreich)kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk");
    }

    @Test
    public void test18959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18959");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("hi!        (\\U0020,Italienisch#####Franzosisch (Kanada)##############################################################################", 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test18960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18960");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("IIIIIIIIII9999999999999999999999999999999", "                                                 TALIAN                                                  ", 64);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test18961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18961");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "HI!       ALLEMANDITALIENISCHALLEMANDITALIAN_ITALIAN_ENG    \\     ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...ALLEMAND\\U0034ALLEMANDHI!ALLEMANDITALIANALLEMAND\\U0061ALLEMAND\\U0023ALLEMANDHI!ALLEMANDITALIANALLEMANDCHINESE (CHINA)ALLEMANDHI!ALLEMANDZH_CNALLEMANDITALIANALLEMANDENALLEMANDITALIENISCH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test18962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18962");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "TITcnarfesecnarfesecnarf5700u\\rfesecnarfesecnarfesecnarf5700u\\rfesecnarfesecnarfesecnarf5700u\\rfesecnarfesecnarfesecnarf");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test18963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18963");
        java.util.Locale locale3 = new java.util.Locale("fra", "\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITAL (allemand)", "uni");
        org.junit.Assert.assertEquals(locale3.toString(), "fra_\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITAL (ALLEMAND)_uni");
    }

    @Test
    public void test18964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18964");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\ud55c\uad6d\uc5b4", '\u671d');
// flaky:         org.junit.Assert.assertTrue("'" + char2 + "' != '" + ' ' + "'", char2 == ' ');
    }

    @Test
    public void test18965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18965");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("NC_H");
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + 'N' + "'", char1 == 'N');
    }

    @Test
    public void test18966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18966");
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
        java.util.Locale locale43 = new java.util.Locale("", "");
        java.lang.String str44 = locale43.getVariant();
        java.lang.String str45 = locale43.getDisplayCountry();
        java.util.Locale locale46 = java.util.Locale.FRANCE;
        java.util.Locale locale47 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str48 = locale46.getDisplayScript(locale47);
        java.lang.String str49 = locale47.getVariant();
        java.util.Locale locale51 = new java.util.Locale("");
        java.util.Locale.setDefault(locale51);
        java.lang.String str53 = locale47.getDisplayName(locale51);
        java.lang.String str54 = locale47.getDisplayScript();
        java.lang.String str55 = locale43.getDisplayVariant(locale47);
        java.lang.String str56 = locale18.getDisplayScript(locale47);
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
// flaky:         org.junit.Assert.assertEquals(locale17.toString(), "fra");
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
        org.junit.Assert.assertEquals(locale43.toString(), "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals(locale51.toString(), "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "French (Canada)" + "'", str53, "French (Canada)");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
    }

    @Test
    public void test18967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18967");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "                                                                                                           ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test18968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18968");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder5 = builder4.clear();
        java.util.Locale.Builder builder7 = builder5.setLanguage("ITALIAN");
        java.util.Locale.Builder builder8 = builder5.clearExtensions();
        java.util.Locale locale9 = builder8.build();
        java.util.Locale locale10 = java.util.Locale.PRC;
        java.lang.String str11 = locale10.getDisplayName();
        java.util.Locale.Builder builder12 = builder8.setLocale(locale10);
        java.util.Locale.Builder builder13 = builder8.clear();
        java.util.Locale.Builder builder14 = builder8.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder16 = builder14.setScript("fran\347");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: franc? [at index 0]");
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
        org.junit.Assert.assertEquals(locale9.toString(), "italian");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Chinese (China)" + "'", str11, "Chinese (China)");
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test18969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18969");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("Hhhhhhhhhh", ')');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, " \\U0078 ", 77, 17);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test18970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18970");
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
        java.util.Set<java.lang.Character> charSet39 = locale36.getExtensionKeys();
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Italian" + "'", str13, "Italian");
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
        org.junit.Assert.assertEquals(locale22.toString(), "");
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
        org.junit.Assert.assertNotNull(charSet39);
    }

    @Test
    public void test18971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18971");
        java.util.Locale locale1 = java.util.Locale.ENGLISH;
        java.util.Set<java.lang.Character> charSet2 = locale1.getExtensionKeys();
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.lowerCase("EAGAASH                                                                                                                                                                                                                                                                                                                                                                                                    ", locale1);
        java.lang.String str4 = locale1.getISO3Language();
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("\\u005", "", (int) '\\');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray9, 'A');
        java.lang.String[] strArray15 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("\\u005", "", (int) '\\');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.replaceEach("\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069!IH\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\", strArray9, strArray15);
        boolean boolean17 = locale1.equals((java.lang.Object) str16);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(charSet2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "eagaash                                                                                                                                                                                                                                                                                                                                                                                                    " + "'", str3, "eagaash                                                                                                                                                                                                                                                                                                                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "eng" + "'", str4, "eng");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\\u005" + "'", str11, "\\u005");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069!IH\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\" + "'", str16, "\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069!IH\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test18972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18972");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder0.setVariant("itTAiT_ITALIAN_EgAish");
        java.util.Locale locale6 = builder0.build();
        java.util.Locale.Builder builder7 = builder0.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder7.setLanguage("ITALIANITALIANITALIANITALI");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: ITALIANITALIANITALIANITALI [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test18973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18973");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder3.clear();
        java.util.Locale.Builder builder6 = builder3.setScript("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder3.setLanguageTag("\uc5b4\uc77c\ub3c5");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: ???????? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test18974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18974");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "\uc601\uc5b4                                                                                                              ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test18975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18975");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\\u0045", "i\\u0020iTALIANiTALIANiTALIANiTALIit         \\");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\u0045" + "'", str3, "\\u0045");
    }

    @Test
    public void test18976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18976");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("...U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069!I#\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\ENGLISC#", "e                               e                   ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test18977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18977");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd(" hi!       _\\U0020_Italienisch####################################################################           ", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " hi!       _\\U0020_Italienisch####################################################################           " + "'", str2, " hi!       _\\U0020_Italienisch####################################################################           ");
    }

    @Test
    public void test18978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18978");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("talian_ITALIAN_English");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "TALIAN_ITALIAN_ENGLISH" + "'", str1, "TALIAN_ITALIAN_ENGLISH");
    }

    @Test
    public void test18979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18979");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("\ub3c5\uc77c\uc5b4", (int) 'z', "Italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ub3c5\uc77c\uc5b4Italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian  " + "'", str3, "\ub3c5\uc77c\uc5b4Italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian  ");
    }

    @Test
    public void test18980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18980");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("franc");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "FRANC" + "'", str1, "FRANC");
    }

    @Test
    public void test18981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18981");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('!', 90);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 90 + "'", int2 == 90);
    }

    @Test
    public void test18982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18982");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("g       ...", "\\u0034\\u00                                             hcstueD                                             \\u0034\\u00");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "g       ..." + "'", str2, "g       ...");
    }

    @Test
    public void test18983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18983");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("iTTAIT_ITALIAN_EGAISH          ", '7');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'i' + "'", char2 == 'i');
    }

    @Test
    public void test18984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18984");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("\uc601\uc5b4", "\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test18985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18985");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("AhzRAhzQAhzOAhzNAh", 54, (int) 'x');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test18986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18986");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "                                                    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test18987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18987");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("ckclcmcncocrcucvcwcxcyczdedh...ibjblbmbnbobqbrbsbtbvbwbybzcacccdcfcgchcialamanaoaqarasatauawaxazbabbbdbebfbgbhbiadaeafaga");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test18988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18988");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("ta...", (int) '.');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test18989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18989");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("ZHO", "Chinese", 5);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.concatWith("", (java.lang.Object[]) strArray6);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray6);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.endsWithAny("anihc", strArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.startsWithAny("                                             de_de                                             ", strArray8);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ZHO" + "'", str7, "ZHO");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test18990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18990");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("HHHHHHHHH         ITAL\\u0020iItalian\\u008600u\\HHHHHHHHH         ITAL", "...u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069!IH\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\englisch");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHHHHHHH         ITAL\\u0020iItalian\\u008600u\\HHHHHHHHH         ITAL" + "'", str2, "HHHHHHHHH         ITAL\\u0020iItalian\\u008600u\\HHHHHHHHH         ITAL");
    }

    @Test
    public void test18991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18991");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("italy");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test18992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18992");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("GBR");
        java.lang.String str2 = languageRange1.getRange();
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.parse("en");
        boolean boolean5 = languageRange1.equals((java.lang.Object) languageRangeList4);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "gbr" + "'", str2, "gbr");
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test18993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18993");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "frn\347is(frnce)(CHINESE(CHINA)", (int) '2');
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test18994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18994");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("zhazhzhzhzhzhzhzhzhzhzh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ZHAZHZHZHZHZHZHZHZHZHZH" + "'", str1, "ZHAZHZHZHZHZHZHZHZHZHZH");
    }

    @Test
    public void test18995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18995");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("HARZHASZHAZHZHZHZHZHZHZHZHZHZ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HARZHASZHAZHZHZHZHZHZHZHZHZHZ" + "'", str1, "HARZHASZHAZHZHZHZHZHZHZHZHZHZ");
    }

    @Test
    public void test18996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18996");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("\\u0020iTALIANiTALIANiTALIANiTAL", "\\u0061", (int) '4');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray3);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2iTALIANiTALIANiTALIANiTAL" + "'", str4, "2iTALIANiTALIANiTALIANiTAL");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2iTALIANiTALIANiTALIANiTAL" + "'", str5, "2iTALIANiTALIANiTALIANiTAL");
    }

    @Test
    public void test18997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18997");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                                             \\u0066                                              ", 19, 347);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test18998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18998");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "fr-CAfr-CAfr-C8600u\\fr-CAfr-CAfr-CAfr-CAfr-CAfr-C8600u\\fr-CAffr-CAfr-CAfr-C8600u\\fr-CAfr-CAfr-CAfr-CAfr-CAfr-C8600u\\fr-CAf");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test18999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18999");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("!_\\u0020_itle########################################################################################", "\\!u!00!de!\\!u!0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!_\\u0020_itle########################################################################################" + "'", str2, "!_\\u0020_itle########################################################################################");
    }

    @Test
    public void test19000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test19000");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("it                   ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=it                   ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }
}
