import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest34 {

    public static boolean debug = false;

    @Test
    public void test17001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17001");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("HI!       ALLEMANDITALIENISCHALLEMANDITALIAN_ITALIAN_ENG    \\     ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...ALLEMAND\\U0034ALLEMANDHI!ALLEMANDITALIANALLEMAND\\U0061ALLEMAND\\U0023ALLEMANDHI!ALLEMANDITALIANALLEMANDCHINESE (CHINA)ALLEMANDHI!ALLEMANDZH_CNALLEMANDITALIANALLEMANDENALLEMANDITALIENISCH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!       ALLEMANDITALIENISCHALLEMANDITALIAN_ITALIAN_ENG    \\     ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...ALLEMAND\\U0034ALLEMANDHI!ALLEMANDITALIANALLEMAND\\U0061ALLEMAND\\U0023ALLEMANDHI!ALLEMANDITALIANALLEMANDCHINESE (CHINA)ALLEMANDHI!ALLEMANDZH_CNALLEMANDITALIANALLEMANDENALLEMANDITALIENISCH" + "'", str1, "HI!       ALLEMANDITALIENISCHALLEMANDITALIAN_ITALIAN_ENG    \\     ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...ALLEMAND\\U0034ALLEMANDHI!ALLEMANDITALIANALLEMAND\\U0061ALLEMAND\\U0023ALLEMANDHI!ALLEMANDITALIANALLEMANDCHINESE (CHINA)ALLEMANDHI!ALLEMANDZH_CNALLEMANDITALIANALLEMANDENALLEMANDITALIENISCH");
    }

    @Test
    public void test17002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17002");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens(" hi!       _\\U0020...", "francese (Canada)", 109);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test17003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17003");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("cor\351en (Cor\351e du Sud)", "Chinese", (int) 'h');
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("                              it", strArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, "                                                                                                 ");
        boolean boolean9 = org.apache.commons.lang3.StringUtils.endsWithAny("\\u0034\\u00                                             hcstud                                             \\u0034\\u00 ", strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "cor\351en (Cor\351e du Sud)" + "'", str8, "cor\351en (Cor\351e du Sud)");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test17004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17004");
        java.lang.String[] strArray0 = java.util.Locale.getISOCountries();
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray0);
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray0);
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray0);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, 'a');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, 'e', 9, 14);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZW" + "'", str1, "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZW");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZW" + "'", str2, "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZW");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ADaAEaAFaAGaAIaALaAMaANaAOaAQaARaASaATaAUaAWaAXaAZaBAaBBaBDaBEaBFaBGaBHaBIaBJaBLaBMaBNaBOaBQaBRaBSaBTaBVaBWaBYaBZaCAaCCaCDaCFaCGaCHaCIaCKaCLaCMaCNaCOaCRaCUaCVaCWaCXaCYaCZaDEaDJaDKaDMaDOaDZaECaEEaEGaEHaERaESaETaFIaFJaFKaFMaFOaFRaGAaGBaGDaGEaGFaGGaGHaGIaGLaGMaGNaGPaGQaGRaGSaGTaGUaGWaGYaHKaHMaHNaHRaHTaHUaIDaIEaILaIMaINaIOaIQaIRaISaITaJEaJMaJOaJPaKEaKGaKHaKIaKMaKNaKPaKRaKWaKYaKZaLAaLBaLCaLIaLKaLRaLSaLTaLUaLVaLYaMAaMCaMDaMEaMFaMGaMHaMKaMLaMMaMNaMOaMPaMQaMRaMSaMTaMUaMVaMWaMXaMYaMZaNAaNCaNEaNFaNGaNIaNLaNOaNPaNRaNUaNZaOMaPAaPEaPFaPGaPHaPKaPLaPMaPNaPRaPSaPTaPWaPYaQAaREaROaRSaRUaRWaSAaSBaSCaSDaSEaSGaSHaSIaSJaSKaSLaSMaSNaSOaSRaSSaSTaSVaSXaSYaSZaTCaTDaTFaTGaTHaTJaTKaTLaTMaTNaTOaTRaTTaTVaTWaTZaUAaUGaUMaUSaUYaUZaVAaVCaVEaVGaVIaVNaVUaWFaWSaYEaYTaZAaZMaZW" + "'", str5, "ADaAEaAFaAGaAIaALaAMaANaAOaAQaARaASaATaAUaAWaAXaAZaBAaBBaBDaBEaBFaBGaBHaBIaBJaBLaBMaBNaBOaBQaBRaBSaBTaBVaBWaBYaBZaCAaCCaCDaCFaCGaCHaCIaCKaCLaCMaCNaCOaCRaCUaCVaCWaCXaCYaCZaDEaDJaDKaDMaDOaDZaECaEEaEGaEHaERaESaETaFIaFJaFKaFMaFOaFRaGAaGBaGDaGEaGFaGGaGHaGIaGLaGMaGNaGPaGQaGRaGSaGTaGUaGWaGYaHKaHMaHNaHRaHTaHUaIDaIEaILaIMaINaIOaIQaIRaISaITaJEaJMaJOaJPaKEaKGaKHaKIaKMaKNaKPaKRaKWaKYaKZaLAaLBaLCaLIaLKaLRaLSaLTaLUaLVaLYaMAaMCaMDaMEaMFaMGaMHaMKaMLaMMaMNaMOaMPaMQaMRaMSaMTaMUaMVaMWaMXaMYaMZaNAaNCaNEaNFaNGaNIaNLaNOaNPaNRaNUaNZaOMaPAaPEaPFaPGaPHaPKaPLaPMaPNaPRaPSaPTaPWaPYaQAaREaROaRSaRUaRWaSAaSBaSCaSDaSEaSGaSHaSIaSJaSKaSLaSMaSNaSOaSRaSSaSTaSVaSXaSYaSZaTCaTDaTFaTGaTHaTJaTKaTLaTMaTNaTOaTRaTTaTVaTWaTZaUAaUGaUMaUSaUYaUZaVAaVCaVEaVGaVIaVNaVUaWFaWSaYEaYTaZAaZMaZW");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZW" + "'", str6, "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZW");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AQeAReASeATeAU" + "'", str10, "AQeAReASeATeAU");
    }

    @Test
    public void test17005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17005");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("\\u0023", "\\u0023");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "");
        boolean boolean6 = org.apache.commons.lang3.StringUtils.endsWithAny("E             g", strArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, "TA...");
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, "ECANADAgCANADACANADAsh                                                                                                   ");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test17006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17006");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'A', 49);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 49 + "'", int2 == 49);
    }

    @Test
    public void test17007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17007");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("hfffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff", "...ANiTALI", "\\u0020iTALIANiTALIANiTALIANiTALI\\u0020iTALIANiTALIANiTALIANiTAL");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test17008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17008");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) 'h', 'a');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'h' + "'", char2 == 'h');
    }

    @Test
    public void test17009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17009");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("en-US", "...dedcfcgchcickclcmcncocrcucvcwcxcyczdbebfbgbhbibjblbmbnbobqbrbsbtbvbwbybzcacccdaeafagaialamanaoaqarasatauawaxazbabbbda");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test17010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17010");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("20IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I", "Di!        (\\U0020,ItalicniueD#########################################################################################", 11);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test17011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17011");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.lang.String str1 = locale0.getDisplayLanguage();
        java.util.Locale locale2 = locale0.stripExtensions();
        java.lang.String str3 = locale0.getLanguage();
        java.lang.String str4 = locale0.getDisplayName();
        java.util.Locale locale7 = new java.util.Locale("\\u0020iTALIANiTALIANiTALIANiTALI\\u0020iTALIANiTALIANiTALIANiTAL", "allemand");
        java.lang.String str8 = locale7.getDisplayCountry();
        java.lang.String str9 = locale0.getDisplayScript(locale7);
        java.util.Locale locale11 = java.util.Locale.forLanguageTag("8ian\\u0020i86");
        java.lang.String str12 = locale11.getScript();
        java.util.Set<java.lang.Character> charSet13 = locale11.getExtensionKeys();
        java.lang.String str14 = locale0.getDisplayName(locale11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = locale11.getExtension('4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(charSet13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Italian" + "'", str14, "Italian");
    }

    @Test
    public void test17012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17012");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("", "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\ub3c5\uc77c\uc5b4\r\r\r\r\rfra");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test17013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17013");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("         ITALIAN_italDE_DE", 264);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test17014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17014");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("itTAiT_ITA");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray1);
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test17015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17015");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("", 52);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test17016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17016");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("CHINA", '\u6cd5');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test17017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17017");
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
        java.lang.String str12 = locale8.getISO3Country();
        java.lang.String str13 = locale8.toLanguageTag();
        java.lang.String str14 = locale8.getDisplayName();
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "en" + "'", str13, "en");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "English" + "'", str14, "English");
    }

    @Test
    public void test17018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17018");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("Italian");
        java.util.Locale locale4 = java.util.Locale.PRC;
        java.lang.String str5 = locale4.getDisplayName();
        java.util.Locale.Builder builder6 = builder0.setLocale(locale4);
        java.util.Locale locale7 = builder0.build();
        java.util.Locale.Builder builder8 = builder0.clear();
        java.lang.Class<?> wildcardClass9 = builder8.getClass();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Chinese (China)" + "'", str5, "Chinese (China)");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test17019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17019");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "                                                   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test17020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17020");
        char[] charArray5 = new char[] { ' ' };
        boolean boolean6 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!", charArray5);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsAny("                                                                                                    ", charArray5);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "Canada", charArray5);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "cCCC\\CCCC", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ ]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test17021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17021");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("fr-CA", "nglishEnglishEnglishEnglishEnglishEnglishEnglishEnglish");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test17022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17022");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "                                             hcsfr-CueD                                             ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test17023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17023");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("NC_HZ", 41, 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test17024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17024");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "Ttat_ita");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test17025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17025");
        java.util.Locale.Builder builder1 = new java.util.Locale.Builder();
        java.util.Locale locale2 = builder1.build();
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
        java.lang.String str18 = locale2.getDisplayVariant(locale10);
        java.util.Locale locale20 = java.util.Locale.ENGLISH;
        java.lang.String str21 = locale20.getDisplayLanguage();
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.upperCase("!IH", locale20);
        java.lang.String str23 = locale20.getCountry();
        java.lang.String str24 = locale20.getCountry();
        java.lang.String str25 = locale10.getDisplayCountry(locale20);
        java.util.Locale locale29 = new java.util.Locale("HI!       ", "\\U0020", "Italienisch#########################################################################################");
        java.util.Locale locale30 = locale29.stripExtensions();
        java.lang.String str31 = locale20.getDisplayCountry(locale30);
        java.util.Locale locale34 = new java.util.Locale("                                     fran\347ais (France)                                      ", "Chinese (China");
        java.lang.String str35 = locale20.getDisplayScript(locale34);
        java.lang.String str36 = org.apache.commons.lang3.StringUtils.lowerCase("ko-KR                                                                                                    ", locale20);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "en");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "English" + "'", str21, "English");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "!IH" + "'", str22, "!IH");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals(locale29.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals(locale34.toString(), "                                     fran\347ais (france)                                      _CHINESE (CHINA");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "ko-kr                                                                                                    " + "'", str36, "ko-kr                                                                                                    ");
    }

    @Test
    public void test17026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17026");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("nailati", strMap1);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList2, strMap3);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap5 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList6 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList2, strMap5);
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
        java.util.Locale locale35 = java.util.Locale.lookup(languageRangeList6, (java.util.Collection<java.util.Locale>) localeList33);
        java.util.Locale.Category category36 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale37 = java.util.Locale.getDefault(category36);
        java.lang.String str38 = locale37.getDisplayScript();
        java.util.Set<java.lang.String> strSet39 = locale37.getUnicodeLocaleKeys();
        java.util.List<java.lang.String> strList40 = java.util.Locale.filterTags(languageRangeList6, (java.util.Collection<java.lang.String>) strSet39);
        java.util.Locale.LanguageRange languageRange42 = new java.util.Locale.LanguageRange("deutsch");
        java.util.Locale.LanguageRange languageRange44 = new java.util.Locale.LanguageRange("E");
        java.lang.String str45 = languageRange44.getRange();
        java.util.Locale.LanguageRange[] languageRangeArray46 = new java.util.Locale.LanguageRange[] { languageRange42, languageRange44 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList47 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList47, languageRangeArray46);
        java.util.Locale locale49 = java.util.Locale.ITALIAN;
        java.lang.String str50 = locale49.getDisplayLanguage();
        java.util.Locale locale51 = locale49.stripExtensions();
        java.lang.String str52 = locale49.getLanguage();
        java.util.Set<java.lang.String> strSet53 = locale49.getUnicodeLocaleKeys();
        java.lang.String str55 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet53, "\\u0020iTALIANiTALIANiTALIANiTALI\\u0020iTALIANiTALIANiTALIANiTAL");
        java.util.Locale.FilteringMode filteringMode56 = java.util.Locale.FilteringMode.EXTENDED_FILTERING;
        java.util.List<java.lang.String> strList57 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList47, (java.util.Collection<java.lang.String>) strSet53, filteringMode56);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap58 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList59 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList47, strMap58);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap61 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList62 = java.util.Locale.LanguageRange.parse("nailati", strMap61);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap63 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList64 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList62, strMap63);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap65 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList66 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList64, strMap65);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap68 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList69 = java.util.Locale.LanguageRange.parse("ENGLISCH", strMap68);
        java.util.Locale locale70 = java.util.Locale.ITALIAN;
        java.util.Set<java.lang.Character> charSet71 = locale70.getExtensionKeys();
        java.lang.String str72 = locale70.getVariant();
        java.lang.String str73 = locale70.getDisplayName();
        java.lang.String str74 = locale70.getCountry();
        java.util.Set<java.lang.String> strSet75 = locale70.getUnicodeLocaleKeys();
        java.lang.String str76 = java.util.Locale.lookupTag(languageRangeList69, (java.util.Collection<java.lang.String>) strSet75);
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
        java.util.Collection<java.util.Locale> localeCollection92 = null;
        java.util.List<java.util.Locale> localeList93 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList78, localeCollection92);
        java.util.Locale locale94 = java.util.Locale.lookup(languageRangeList69, (java.util.Collection<java.util.Locale>) localeList93);
        java.util.Locale locale95 = java.util.Locale.lookup(languageRangeList64, (java.util.Collection<java.util.Locale>) localeList93);
        java.util.List<java.util.Locale> localeList96 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList47, (java.util.Collection<java.util.Locale>) localeList93);
        java.util.Locale.FilteringMode filteringMode97 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList98 = java.util.Locale.filter(languageRangeList6, (java.util.Collection<java.util.Locale>) localeList93, filteringMode97);
        java.lang.Class<?> wildcardClass99 = localeList98.getClass();
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(languageRangeList6);
        org.junit.Assert.assertNotNull(languageRangeList9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "it");
        org.junit.Assert.assertNotNull(charSet11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Italian" + "'", str13, "Italian");
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
        org.junit.Assert.assertTrue("'" + category36 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category36.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale37);
// flaky:         org.junit.Assert.assertEquals(locale37.toString(), "\\u005c");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(strSet39);
        org.junit.Assert.assertNotNull(strList40);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "e" + "'", str45, "e");
        org.junit.Assert.assertNotNull(languageRangeArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "it");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "Italian" + "'", str50, "Italian");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "it");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "it" + "'", str52, "it");
        org.junit.Assert.assertNotNull(strSet53);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertTrue("'" + filteringMode56 + "' != '" + java.util.Locale.FilteringMode.EXTENDED_FILTERING + "'", filteringMode56.equals(java.util.Locale.FilteringMode.EXTENDED_FILTERING));
        org.junit.Assert.assertNotNull(strList57);
        org.junit.Assert.assertNotNull(languageRangeList59);
        org.junit.Assert.assertNotNull(languageRangeList62);
        org.junit.Assert.assertNotNull(languageRangeList64);
        org.junit.Assert.assertNotNull(languageRangeList66);
        org.junit.Assert.assertNotNull(languageRangeList69);
        org.junit.Assert.assertNotNull(locale70);
        org.junit.Assert.assertEquals(locale70.toString(), "it");
        org.junit.Assert.assertNotNull(charSet71);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "Italian" + "'", str73, "Italian");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertNotNull(strSet75);
        org.junit.Assert.assertNull(str76);
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
        org.junit.Assert.assertNotNull(localeList93);
        org.junit.Assert.assertNull(locale94);
        org.junit.Assert.assertNull(locale95);
        org.junit.Assert.assertNotNull(localeList96);
        org.junit.Assert.assertTrue("'" + filteringMode97 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode97.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList98);
        org.junit.Assert.assertNotNull(wildcardClass99);
    }

    @Test
    public void test17027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17027");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "ch (Frankreich)kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test17028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17028");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("hzhzhzhzhzhzhzhzhzhzAhzSAhzRAhzQAhzOAhzNAhz");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hzhzhzhzhzhzhzhzhzhzAhzSAhzRAhzQAhzOAhzNAhz" + "'", str1, "hzhzhzhzhzhzhzhzhzhzAhzSAhzRAhzQAhzOAhzNAhz");
    }

    @Test
    public void test17029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17029");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("hI!", "\uc601\uc5b4\uc601\uc5b4\uc601\uc5b4\uc601\uc5b4\uc601\uc5b4\uc601\uc5b4\uc601\uc5b4\uc601\uc5b4\uc601\uc5b4\uc601\uc5b4                                                                                                  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test17030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17030");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder5 = builder4.clear();
        java.util.Locale.Builder builder7 = builder5.setLanguage("ITALIAN");
        java.util.Locale.Builder builder8 = builder5.clear();
        java.util.Locale locale9 = builder5.build();
        java.util.Locale.Builder builder11 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder12 = builder11.clearExtensions();
        java.util.Locale.Builder builder14 = builder11.setLanguageTag("Italian");
        java.util.Locale locale15 = java.util.Locale.PRC;
        java.lang.String str16 = locale15.getDisplayName();
        java.util.Locale.Builder builder17 = builder11.setLocale(locale15);
        java.lang.String str18 = locale15.getISO3Language();
        java.lang.String str19 = locale15.getScript();
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.lowerCase("", locale15);
        java.lang.String str21 = locale9.getDisplayName(locale15);
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
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Chinese (China)" + "'", str16, "Chinese (China)");
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "zho" + "'", str18, "zho");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test17031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17031");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "TITITITITITIT");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test17032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17032");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "                                                                                                                  8", (java.lang.CharSequence) "Franzosisch(Frankreich)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 115 + "'", int2 == 115);
    }

    @Test
    public void test17033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17033");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('d', 90);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 90 + "'", int2 == 90);
    }

    @Test
    public void test17034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17034");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("KO", "z...\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rFrn", 6);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "KO" + "'", str3, "KO");
    }

    @Test
    public void test17035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17035");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaILATiNA...aaaaaaaaaaaaaaaaaaaaaaaaaa", "FranzosischFranzosisch (Frankreich)", 65);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test17036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17036");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder6 = builder1.setLanguage("und");
        java.util.Locale locale7 = builder6.build();
        java.util.Locale locale8 = builder6.build();
        java.util.Locale.Builder builder9 = builder6.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder6.setVariant("iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiitalian_ITALIAN_Englishiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiitalian_ITALIAN_Englishiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii [at index 0]");
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
    public void test17037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17037");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("TALIAN", "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC\\u00de\\u00CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC", 96);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\ud55c\uad6d\uc5b4", "und", 56);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEach("44444444444444444444444444444444!IHaaaaaaaaaaaaaaaaaaaaaaaaFranz\366sisch (Frankreich)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray4, strArray8);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray8, "aaaaaaaaaaaaaaaaaaaaaaaaaa...anitaliaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "44444444444444444444444444444444!IHaaaaaaaaaaaaaaaaaaaaaaaaFranz\366sisch (Frankreich)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str9, "44444444444444444444444444444444!IHaaaaaaaaaaaaaaaaaaaaaaaaFranz\366sisch (Frankreich)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str11, "\ud55c\uad6d\uc5b4");
    }

    @Test
    public void test17038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17038");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "           \\            ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test17039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17039");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("                                            fRENCH (fRANCE)                                                \\u0068");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=french(france)\\u0068");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17040");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "\\\\\\\\\\\\\\\\\\                                  !ih                            tal                                  !ih                            an_ITALIAN_Engl                                  !ih                            sh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\\\\\\\\\\\\\\\\\                                  !ih                            tal                                  !ih                            an_ITALIAN_Engl                                  !ih                            sh" + "'", str1, "\\\\\\\\\\\\\\\\\\                                  !ih                            tal                                  !ih                            an_ITALIAN_Engl                                  !ih                            sh");
    }

    @Test
    public void test17041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17041");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444Hen", "zhANzhAOzhAQzhARzhASzhAzhzhzhzhzhzhzhzhzhzh", "Italie                         ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test17042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17042");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("anglais (royaume-uni)fra");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test17043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17043");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("    \\    ", "cor\351en (cor\351e du sud) (RA)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test17044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17044");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder2.setLanguageTag("                                                       a");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag:                                                        a [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test17045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17045");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("...........................................................................................................................................................................................................................................................................................................................................................................eselgni");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...........................................................................................................................................................................................................................................................................................................................................................................eselgni" + "'", str1, "...........................................................................................................................................................................................................................................................................................................................................................................eselgni");
    }

    @Test
    public void test17046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17046");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("zhzhzhzhzhzhzhzhzhzhfraadzhaezhafzhagzhaizhalzhamzhanzhaozhaqzharzhaszhazhzhzhzhzhzhzhzhzhz", "6b");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("\\u007a", "Frnz\366sisch (Knd)");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.concatWith("fr_CA", (java.lang.Object[]) strArray7);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray7, "It_");
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("U0020ITALIANITALIANITALIANITALI", strArray3, strArray7);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\u007a" + "'", str8, "\\u007a");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\\u007a" + "'", str10, "\\u007a");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "U0020ITALIANITALIANITALIANITALI" + "'", str11, "U0020ITALIANITALIANITALIANITALI");
    }

    @Test
    public void test17047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17047");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!", "", (int) (short) 10);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, '4');
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray5);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray8, "!IH");
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.stripAll(strArray8);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.concatWith("", (java.lang.Object[]) strArray11);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.endsWithAny("\u610f\u5927\u5229\u6587", strArray11);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray11, 'F', 108, (int) '#');
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test17048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17048");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("ITALIE", "Italie");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test17049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17049");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("United State                                                                                     ", 6, 224);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test17050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17050");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("", 40);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test17051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17051");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        java.util.Locale locale1 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str2 = locale0.getDisplayName(locale1);
        java.util.Locale locale3 = locale0.stripExtensions();
        java.lang.String str4 = locale0.getScript();
        java.lang.String str5 = locale0.getDisplayLanguage();
        java.util.Locale.setDefault(locale0);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "allemand" + "'", str2, "allemand");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "de");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "German" + "'", str5, "German");
    }

    @Test
    public void test17052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17052");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("...                             ", "\\XTALXAN_ITALIAN_ENGLXSH                                                 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test17053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17053");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("!IH!IH!IH!IH!IH!IH!IH!IH!IH!IHTEDESCO    !IH!IH!IH!IH!IH!IH!IH!IH!IH!IHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '!' + "'", char1 == '!');
    }

    @Test
    public void test17054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17054");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test17055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17055");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.GERMAN;
        java.util.Locale locale3 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str4 = locale2.getDisplayName(locale3);
        java.util.Locale.setDefault(category0, locale3);
        java.util.Locale locale8 = new java.util.Locale("\\u0020iTALIANiTALIANiTALIANiTALI\\u0020iTALIANiTALIANiTALIANiTAL", "allemand");
        java.util.Locale.setDefault(category0, locale8);
        java.util.Locale locale10 = java.util.Locale.getDefault(category0);
        java.util.Locale.Category category11 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale12 = java.util.Locale.getDefault(category11);
        java.util.Locale.setDefault(category0, locale12);
        java.lang.String str14 = locale12.getDisplayScript();
        java.util.Locale locale18 = new java.util.Locale("H", "Hhhhhhhhh", "CV CW CX CY CZ DE DJ DK DM DO DZ EC EE EG EH ER ES ET FI FJ FK");
        java.lang.String str19 = locale12.getDisplayCountry(locale18);
        boolean boolean20 = locale18.hasExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = locale18.getUnicodeLocaleType("\u82f1\u6587");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: ??");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + category11 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category11.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "de");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals(locale18.toString(), "h_HHHHHHHHH_CV CW CX CY CZ DE DJ DK DM DO DZ EC EE EG EH ER ES ET FI FJ FK");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test17056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17056");
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
        java.util.Locale.Builder builder15 = new java.util.Locale.Builder();
        java.util.Locale locale16 = builder15.build();
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
        java.lang.String str32 = locale16.getDisplayVariant(locale24);
        java.util.Locale locale34 = java.util.Locale.ENGLISH;
        java.lang.String str35 = locale34.getDisplayLanguage();
        java.lang.String str36 = org.apache.commons.lang3.StringUtils.upperCase("!IH", locale34);
        java.lang.String str37 = locale34.getCountry();
        java.lang.String str38 = locale34.getCountry();
        java.lang.String str39 = locale24.getDisplayCountry(locale34);
        java.lang.String str40 = locale0.getDisplayCountry(locale34);
        java.lang.String str41 = locale34.toLanguageTag();
        java.lang.String str43 = locale34.getExtension('z');
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
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "");
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
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "en");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Englisch" + "'", str35, "Englisch");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "!IH" + "'", str36, "!IH");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "en" + "'", str41, "en");
        org.junit.Assert.assertNull(str43);
    }

    @Test
    public void test17057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17057");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("E             g", "chinois", "italy");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test17058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17058");
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
        java.util.Locale.Builder builder13 = builder12.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder16 = builder13.setExtension(')', "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key: ) [at index 0]");
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
    public void test17059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17059");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("\\U0064f (KOREAN)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test17060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17060");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("italy");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "italy" + "'", str1, "italy");
    }

    @Test
    public void test17061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17061");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("ffffffffffffffffffffffffffffffffFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhACor\351e du Sud", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=fffffffffffffffffffffffffffffffffraadzhaezhafzhagzhaizhalzhamzhanzhaozhaqzharzhacore?edusud");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17062");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("\u5fb7\u6587");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u5fb7\u6587" + "'", str1, "\u5fb7\u6587");
    }

    @Test
    public void test17063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17063");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("it_I", "Chinesisch(China)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "it_I" + "'", str2, "it_I");
    }

    @Test
    public void test17064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17064");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("ANGLAIS (R                                                                                                                     ", "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC                       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ANGLAIS (R                                                                                                                     " + "'", str2, "ANGLAIS (R                                                                                                                     ");
    }

    @Test
    public void test17065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17065");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\\u0041", "engengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengeng", (int) '!');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\u0041" + "'", str4, "\\u0041");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\\u0041" + "'", str5, "\\u0041");
    }

    @Test
    public void test17066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17066");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("", "44                                                                                               en44");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test17067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17067");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("allemand", "...u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069!IH\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\englisc", 220);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test17068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17068");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("Deutschland", "44444444444444NAILATI44444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test17069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17069");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("Chinese", "HhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhHHHHHHHHHH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Chinese" + "'", str2, "Chinese");
    }

    @Test
    public void test17070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17070");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("BFIBGIBHIBIIBJIBLIBMIBNIBOIBQIBRIBSIBTIBVIBWIBYIBZICAICCICDICFICGICHICIICKICLICMICNICOICRICUICVICWICXICYICZIDEIDJIDKIDMIDOIDZIECIEEIEGIEHIERIESIETIFIIFJIFKIFMIFOIFRIGAIGBIGDIGEIGFIGGIGHIGIIGLIGMIGNIGPIGQIGRIGSIGTIGUIGWIGYIHKIHM", "de_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DE");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "BFIBGIBHIBIIBJIBLIBMIBNIBOIBQIBRIBSIBTIBVIBWIBYIBZICAICCICDICFICGICHICIICKICLICMICNICOICRICUICVICWICXICYICZIDEIDJIDKIDMIDOIDZIECIEEIEGIEHIERIESIETIFIIFJIFKIFMIFOIFRIGAIGBIGDIGEIGFIGGIGHIGIIGLIGMIGNIGPIGQIGRIGSIGTIGUIGWIGYIHKIHM" + "'", str2, "BFIBGIBHIBIIBJIBLIBMIBNIBOIBQIBRIBSIBTIBVIBWIBYIBZICAICCICDICFICGICHICIICKICLICMICNICOICRICUICVICWICXICYICZIDEIDJIDKIDMIDOIDZIECIEEIEGIEHIERIESIETIFIIFJIFKIFMIFOIFRIGAIGBIGDIGEIGFIGGIGHIGIIGLIGMIGNIGPIGQIGRIGSIGTIGUIGWIGYIHKIHM");
    }

    @Test
    public void test17071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17071");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder6 = builder1.setLanguage("und");
        java.util.Locale locale7 = builder6.build();
        java.util.Locale.Builder builder8 = builder6.clearExtensions();
        java.util.Locale.Builder builder9 = builder8.clearExtensions();
        java.util.Locale locale13 = new java.util.Locale("HI!       ", "\\U0020", "Italienisch#########################################################################################");
        java.util.Locale locale14 = locale13.stripExtensions();
        java.util.Locale.setDefault(locale14);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder16 = builder9.setLocale(locale14);
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: hi!        [at index 0]");
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
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertEquals(locale13.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
    }

    @Test
    public void test17072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17072");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("tTAT_ITA", "\u6cd5\u6587\u52a0\u62ff\u5927)");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "inglesehhhhhhhhHITTAIT_ITALIAN_EGAISH          ", 4, 57);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test17073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17073");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('T', (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test17074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17074");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("5\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065", "\\XTALXAN_ITALIAN_ENGLXSHRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR", 45);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065" + "'", str3, "5\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065");
    }

    @Test
    public void test17075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17075");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("0023dallemandallemandallemandallemandallemandallemandallemandalle", "4444444444NAILATI444444444444444444444444NAILATI444444444444444444444444NAILATI444444444444444444444444NAILATI444444444444444444444444NAILATI444444444444444444444444NAILATI444444444444444444444444NAILATI444444444444444444444444NAILATI444444444444444444444444NAILATI444444444444444444444444NAILATI44444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0023dallemandallemandallemandallemandallemandallemandallemandalle" + "'", str2, "0023dallemandallemandallemandallemandallemandallemandallemandalle");
    }

    @Test
    public void test17076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17076");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test17077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17077");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("und");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap2 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList3 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList1, strMap2);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap4 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList5 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList1, strMap4);
        java.util.Locale.LanguageRange[] languageRangeArray6 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList7 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList7, languageRangeArray6);
        java.util.Locale.LanguageRange[] languageRangeArray9 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList10 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList10, languageRangeArray9);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        java.util.Locale.FilteringMode filteringMode17 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList18 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList10, (java.util.Collection<java.lang.String>) strList15, filteringMode17);
        java.util.Locale.FilteringMode filteringMode19 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList20 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList7, (java.util.Collection<java.lang.String>) strList15, filteringMode19);
        java.util.Locale.LanguageRange[] languageRangeArray21 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList22 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList22, languageRangeArray21);
        java.lang.String[] strArray26 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList27 = new java.util.ArrayList<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList27, strArray26);
        java.util.Locale.FilteringMode filteringMode29 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList30 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList22, (java.util.Collection<java.lang.String>) strList27, filteringMode29);
        java.lang.String[] strArray50 = new java.lang.String[] { "hi!       ", "Italienisch", "italian_ITALIAN_English", "HI!", "hi!", "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...", "\\u0034", "HI!", "Italian", "\\u0061", "\\u0023", "hi!", "iTALIAN", "Chinese (China)", "hi!", "zh_CN", "iTALIAN", "en", "Italienisch" };
        java.util.ArrayList<java.lang.String> strList51 = new java.util.ArrayList<java.lang.String>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList51, strArray50);
        java.util.Locale.LanguageRange[] languageRangeArray53 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList54 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList54, languageRangeArray53);
        java.lang.String[] strArray58 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList59 = new java.util.ArrayList<java.lang.String>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList59, strArray58);
        java.util.Locale.FilteringMode filteringMode61 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList62 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList54, (java.util.Collection<java.lang.String>) strList59, filteringMode61);
        java.util.List<java.lang.String> strList63 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList22, (java.util.Collection<java.lang.String>) strList51, filteringMode61);
        java.util.List<java.lang.String> strList64 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList7, (java.util.Collection<java.lang.String>) strList51);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap65 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList66 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList7, strMap65);
        java.util.Locale.LanguageRange[] languageRangeArray67 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList68 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList68, languageRangeArray67);
        java.util.Locale.LanguageRange[] languageRangeArray70 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList71 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList71, languageRangeArray70);
        java.lang.String[] strArray75 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList76 = new java.util.ArrayList<java.lang.String>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList76, strArray75);
        java.util.Locale.FilteringMode filteringMode78 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList79 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList71, (java.util.Collection<java.lang.String>) strList76, filteringMode78);
        java.util.Locale.FilteringMode filteringMode80 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList81 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList68, (java.util.Collection<java.lang.String>) strList76, filteringMode80);
        java.util.Collection<java.util.Locale> localeCollection82 = null;
        java.util.List<java.util.Locale> localeList83 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList68, localeCollection82);
        java.util.List<java.util.Locale> localeList84 = java.util.Locale.filter(languageRangeList66, (java.util.Collection<java.util.Locale>) localeList83);
        java.util.List<java.util.Locale> localeList85 = java.util.Locale.filter(languageRangeList1, (java.util.Collection<java.util.Locale>) localeList83);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList87 = java.util.Locale.LanguageRange.parse("fr");
        java.lang.String[] strArray91 = new java.lang.String[] { "...ANiTALI", "             ", "          " };
        java.util.ArrayList<java.lang.String> strList92 = new java.util.ArrayList<java.lang.String>();
        boolean boolean93 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList92, strArray91);
        java.util.List<java.lang.String> strList94 = java.util.Locale.filterTags(languageRangeList87, (java.util.Collection<java.lang.String>) strList92);
        java.lang.String str95 = java.util.Locale.lookupTag(languageRangeList1, (java.util.Collection<java.lang.String>) strList94);
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(languageRangeList3);
        org.junit.Assert.assertNotNull(languageRangeList5);
        org.junit.Assert.assertNotNull(languageRangeArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(languageRangeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + filteringMode17 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode17.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertTrue("'" + filteringMode19 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode19.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(languageRangeArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + filteringMode29 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode29.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(languageRangeArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + filteringMode61 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode61.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList62);
        org.junit.Assert.assertNotNull(strList63);
        org.junit.Assert.assertNotNull(strList64);
        org.junit.Assert.assertNotNull(languageRangeList66);
        org.junit.Assert.assertNotNull(languageRangeArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(languageRangeArray70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(strArray75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + filteringMode78 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode78.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList79);
        org.junit.Assert.assertTrue("'" + filteringMode80 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode80.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList81);
        org.junit.Assert.assertNotNull(localeList83);
        org.junit.Assert.assertNotNull(localeList84);
        org.junit.Assert.assertNotNull(localeList85);
        org.junit.Assert.assertNotNull(languageRangeList87);
        org.junit.Assert.assertNotNull(strArray91);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertNotNull(strList94);
        org.junit.Assert.assertNull(str95);
    }

    @Test
    public void test17078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17078");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("United States");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test17079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17079");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAscii('Y');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test17080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17080");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("CCCCCCCCCCCCCCCCCCCCCCCCCCfrz\366cz(frkrec)CCCCCCCCCCCCCCCCCCCCCCCCCC                                                                                                                                                                                                                                                                                                                                                    ", "IIIIIIIIIIIIIIIIIIIIIIIIIIITALIAN_ITALIAN_ENGLISHIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test17081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17081");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("\uc774\ud0c8\ub9ac\uc544\uc5b4", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test17082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17082");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("\351encor\351encor\351encor");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=e?encore?encore?encor");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17083");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "\\U000ITALIANITALIANITALIANITALI\\U000ITALIANITALIANITALIANITALHcsineilatI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test17084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17084");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC                       ", "           e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               ", "#", 19);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC                       " + "'", str4, "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC                       ");
    }

    @Test
    public void test17085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17085");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("                ITA                ", 56);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test17086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17086");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("    \\    ", "\\u0038");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "    \\    " + "'", str2, "    \\    ");
    }

    @Test
    public void test17087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17087");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("00000000000000coreen (Coree du Sud", 0, 38);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "00000000000000coreen (Coree du Sud" + "'", str3, "00000000000000coreen (Coree du Sud");
    }

    @Test
    public void test17088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17088");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("zho", "\\u0020iTALIANiTALIANiTALIANiTAL", 14);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zho" + "'", str3, "zho");
    }

    @Test
    public void test17089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17089");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "                                             hcsfr-CueD                                             ", (java.lang.CharSequence) "eAGAASH                                                                                                                                                                                                                                                                                                                                                                                                    ");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "                                             hcsfr-CueD                                             " + "'", charSequence2, "                                             hcsfr-CueD                                             ");
    }

    @Test
    public void test17090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17090");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "   h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "   h" + "'", str1, "   h");
    }

    @Test
    public void test17091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17091");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("chineseaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "chineseaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "chineseaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test17092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17092");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("hi!        (\\u0020,italienisch#########################################################################################)", "             \\u0049                                           xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", "CCCCCCCCCCCCCanglais (CanadaCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!        (\\u0020,italienisch#########################################################################################)" + "'", str3, "hi!        (\\u0020,italienisch#########################################################################################)");
    }

    @Test
    public void test17093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17093");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "44444444444444ITALIAN4444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test17094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17094");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("EnglishI\\U0020ITALIANITALIANITALIANITALIIT I\\U0020ITALIANITALIANITALIANITALIIT(I\\U0020ITALIANITALIANITALIANITALIITUnitedI\\U0020ITALIANITALIANITALIANITALIIT I\\U0020ITALIANITALIANITALIANITALIITKingdomI\\U0020ITALIANITALIANITALIANITALIIT)", "FRFRFRFRFRFRFRFRFRFRFRFRFde_DEFRFRFRFRFRFRFRFRFRFRFRFRFR");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test17095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17095");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("Chinesisch", "hi!        (\\U0020,Italienisch#########################################################################################)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Chinesisch" + "'", str2, "Chinesisch");
    }

    @Test
    public void test17096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17096");
        java.util.Locale locale0 = java.util.Locale.ROOT;
        java.lang.String str1 = locale0.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test17097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17097");
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
            java.util.Locale.Builder builder10 = builder7.setExtension('f', "Deutsch\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension value: Deutsch\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\ [at index 0]");
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
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test17098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17098");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf(" \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n", (int) 'g');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test17099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17099");
        char[] charArray12 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray12);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "iTALIAN", charArray12);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "allemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemand", charArray12);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "Fr ncG ", charArray12);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aNIHc", charArray12);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "ANGLAIS (ROYAUME-UNI)", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "4##a a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "4##a a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4, #, #, a,  , a]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test17100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17100");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.lang.String str1 = locale0.getDisplayLanguage();
        java.util.Locale locale2 = locale0.stripExtensions();
        java.lang.String str3 = locale0.getLanguage();
        java.lang.String str4 = locale0.getDisplayName();
        java.util.Locale locale7 = new java.util.Locale("\\u0020iTALIANiTALIANiTALIANiTALI\\u0020iTALIANiTALIANiTALIANiTAL", "allemand");
        java.lang.String str8 = locale7.getDisplayCountry();
        java.lang.String str9 = locale0.getDisplayScript(locale7);
        java.util.Locale locale11 = java.util.Locale.forLanguageTag("8ian\\u0020i86");
        java.lang.String str12 = locale11.getScript();
        java.util.Set<java.lang.Character> charSet13 = locale11.getExtensionKeys();
        java.lang.String str14 = locale0.getDisplayName(locale11);
        java.util.Set<java.lang.String> strSet15 = locale11.getUnicodeLocaleAttributes();
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
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(charSet13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Italian" + "'", str14, "Italian");
        org.junit.Assert.assertNotNull(strSet15);
    }

    @Test
    public void test17101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17101");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("hi!(\\U0020,Italienisch############################################hi!       ", 537);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!(\\U0020,Italienisch############################################hi!       " + "'", str2, "hi!(\\U0020,Italienisch############################################hi!       ");
    }

    @Test
    public void test17102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17102");
        java.util.Locale locale2 = new java.util.Locale("HHHHHHHHHH", "");
        java.util.Locale locale4 = java.util.Locale.forLanguageTag("\\u0020");
        java.util.Locale locale6 = java.util.Locale.CHINESE;
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.lowerCase("         italian_ITALIAN_English", locale6);
        java.lang.String str8 = locale6.toLanguageTag();
        java.lang.String str9 = locale4.getDisplayName(locale6);
        java.util.Set<java.lang.Character> charSet10 = locale4.getExtensionKeys();
        java.lang.String str11 = locale2.getDisplayCountry(locale4);
        java.lang.Object obj12 = locale2.clone();
        org.junit.Assert.assertEquals(locale2.toString(), "hhhhhhhhhh");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "         italian_italian_english" + "'", str7, "         italian_italian_english");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "zh" + "'", str8, "zh");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(charSet10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "hhhhhhhhhh");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "hhhhhhhhhh");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "hhhhhhhhhh");
    }

    @Test
    public void test17103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17103");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("italiaE", "...\r\r\r\r\r\r\r\r...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "italiaE" + "'", str2, "italiaE");
    }

    @Test
    public void test17104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17104");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("hh9600u\\hhhhhhhhhh9600u\\hhhhhhhhhh9600u\\hhhhhhhhhh9600u\\)anic( esenic", "", 16);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test17105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17105");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiNumeric('N');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test17106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17106");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("f_KOREAN", "FR-FR");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test17107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17107");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "\\u0029fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test17108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17108");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNEnglisch (Vereinigtes K\366nigreich)Englisch (Vereinigtes K\366nigreich)Englisch (Vereinigtes K\366nigreich)Englisch (Vereinig");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test17109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17109");
        char[] charArray9 = new char[] { ' ', '4' };
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!", charArray9);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny("French (Canada)", charArray9);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", charArray9);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "englisch", charArray9);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\u4e2d\u6587", charArray9);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "Italie", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test17110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17110");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "                                             hcstued                                             ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test17111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17111");
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
            java.util.Locale.Builder builder46 = builder5.setLanguageTag("tali...an");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: tali...an [at index 0]");
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Italian" + "'", str14, "Italian");
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
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "French" + "'", str39, "French");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(strSet42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(builder44);
    }

    @Test
    public void test17112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17112");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("                                                                                        e                               ", "                                                                                                 ", "rEGNO uNITO");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test17113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17113");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("anglais (Canada)CHINESE", (double) 'h');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=104.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17114");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("de-DE");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "de-DE" + "'", str1, "de-DE");
    }

    @Test
    public void test17115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17115");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("...It...", "44444444444444ITALIAN44444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test17116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17116");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069!IH\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\", "Iitalian(italian,eng", (int) (byte) 0);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test17117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17117");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList0 = null;
        java.util.Locale.Category category1 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale2 = java.util.Locale.getDefault(category1);
        java.util.Locale locale3 = java.util.Locale.GERMAN;
        java.util.Locale locale4 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str5 = locale3.getDisplayName(locale4);
        java.util.Locale.setDefault(category1, locale4);
        java.util.Set<java.lang.String> strSet7 = locale4.getUnicodeLocaleKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList8 = java.util.Locale.filterTags(languageRangeList0, (java.util.Collection<java.lang.String>) strSet7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + category1 + "' != '" + java.util.Locale.Category.FORMAT + "'", category1.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale2);
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "de");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "allemand" + "'", str5, "allemand");
        org.junit.Assert.assertNotNull(strSet7);
    }

    @Test
    public void test17118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17118");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiPrintable('D');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test17119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17119");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("\\u0020__AD4AE4AF4AG4AI4AL4AM4AN4AO4AQ4AR4AS4AT4AU4AW4AX4AZ4BA4BB4BD4BE4BF4BG4BH4BI4BJ4BL4BM4BN4BO4BQ4BR4BS4BT4BV4BW4BY4BZ4CA4CC4CD4CF4CG4CH4CI4CK4CL4CM4CN4CO4CR4CU4CV4CW4CX4CY4CZ4DE4DJ4DK4DM4DO4DZ4EC4EE4EG4EH4ER4ES4ET4FI4FJ4FK4FM4FO4FR4GA4GB4GD4GE4GF4GG4GH4GI4GL4GM4GN4GP4GQ4GR4GS4GT4GU4GW4GY4HK4HM4HN4HR4HT4HU4ID4IE4IL4IM4IN4IO4IQ4IR4IS4IT4JE4JM4JO4JP4KE4KG4KH4KI4KM4KN4KP4KR4KW4KY4KZ4LA4LB4LC4LI4LK4LR4LS4LT4LU4LV4LY4MA4MC4MD4ME4MF4MG4MH4MK4ML4MM4MN4MO4MP4MQ4MR4MS4MT4MU4MV4MW4MX4MY4MZ4NA4NC4NE4NF4NG4NI4NL4NO4NP4NR4NU4NZ4OM4PA4PE4PF4PG4PH4PK4PL4PM4PN4PR4PS4PT4PW4PY4QA4RE4RO4RS4RU4RW4SA4SB4SC4SD4SE4SG4SH4SI4SJ4SK4SL4SM4SN4SO4SR4SS4ST4SV4SX4SY4SZ4TC4TD4TF4TG4TH4TJ4TK4TL4TM4TN4TO4TR4TT4TV4TW4TZ4UA4UG4UM4US4UY4UZ4VA4VC4VE4VG4VI4VN4VU4WF4WS4YE4YT4ZA4ZM4ZW", (int) 'H');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 78 + "'", int2 == 78);
    }

    @Test
    public void test17120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17120");
        java.util.Locale locale2 = new java.util.Locale("ITALIAE", "France");
        org.junit.Assert.assertEquals(locale2.toString(), "italiae_FRANCE");
    }

    @Test
    public void test17121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17121");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) 'N', 'R');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'N' + "'", char2 == 'N');
    }

    @Test
    public void test17122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17122");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("CCCCCCCCCCCCCCCCCCCCCCCCCCfrz\366cz(frkrec)CCCCCCCCCCCCCCCCCCCCCCCCCC", "", 499, 136);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CCCCCCCCCCCCCCCCCCCCCCCCCCfrz\366cz(frkrec)CCCCCCCCCCCCCCCCCCCCCCCCCC" + "'", str4, "CCCCCCCCCCCCCCCCCCCCCCCCCCfrz\366cz(frkrec)CCCCCCCCCCCCCCCCCCCCCCCCCC");
    }

    @Test
    public void test17123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17123");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("G");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, '2');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "G" + "'", str4, "G");
    }

    @Test
    public void test17124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17124");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("kkkkkkkkkkkkkkkkkeAGAASHuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", 99, "fr-ca");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "kkkkkkkkkkkkkkkkkeAGAASHuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuufr-cafr-cafr-cafr-cafr-caf" + "'", str3, "kkkkkkkkkkkkkkkkkeAGAASHuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuufr-cafr-cafr-cafr-cafr-caf");
    }

    @Test
    public void test17125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17125");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("und");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("!IH", "       !IH", (int) (byte) 1);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray7, ' ');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("hi!        (\\U0020,Italienisch#########################################################################################)", strArray2, strArray7);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "und" + "'", str3, "und");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "!IH" + "'", str9, "!IH");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!        (\\U0020,Italienisch#########################################################################################)" + "'", str10, "hi!        (\\U0020,Italienisch#########################################################################################)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "und" + "'", str11, "und");
    }

    @Test
    public void test17126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17126");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444en");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny("erma (ermay)                                                 TALIAN                                                  ", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test17127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17127");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("                                             hcstued                                            ", "\\u0020italianitalianitalianitali\\u0020italianitalianitalianital (ALLEMAND)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                             hcstued                                            " + "'", str2, "                                             hcstued                                            ");
    }

    @Test
    public void test17128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17128");
        char[] charArray11 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray11);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "         ITALIAN_italian_eNGLISH", charArray11);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "          HI!           ", charArray11);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "AD4AE4AF4AG4AI4AL4AM4AN4AO4AQ4AR4AS4AT4AU4AW4AX4AZ4BA4BB4BD4BE4BF4BG4BH4BI4BJ4BL4BM4BN4BO4BQ4BR4BS4BT4BV4BW4BY4BZ4CA4CC4CD4CF4CG4CH4CI4CK4CL4CM4CN4CO4CR4CU4CV4CW4CX4CY4CZ4DE4DJ4DK4DM4DO4DZ4EC4EE4EG4EH4ER4ES4ET4FI4FJ4FK4FM4FO4FR4GA4GB4GD4GE4GF4GG4GH4GI4GL4GM4GN4GP4GQ4GR4GS4GT4GU4GW4GY4HK4HM4HN4HR4HT4HU4ID4IE4IL4IM4IN4IO4IQ4IR4IS4IT4JE4JM4JO4JP4KE4KG4KH4KI4KM4KN4KP4KR4KW4KY4KZ4LA4LB4LC4LI4LK4LR4LS4LT4LU4LV4LY4MA4MC4MD4ME4MF4MG4MH4MK4ML4MM4MN4MO4MP4MQ4MR4MS4MT4MU4MV4MW4MX4MY4MZ4NA4NC4NE4NF4NG4NI4NL4NO4NP4NR4NU4NZ4OM4PA4PE4PF4PG4PH4PK4PL4PM4PN4PR4PS4PT4PW4PY4QA4RE4RO4RS4RU4RW4SA4SB4SC4SD4SE4SG4SH4SI4SJ4SK4SL4SM4SN4SO4SR4SS4ST4SV4SX4SY4SZ4TC4TD4TF4TG4TH4TJ4TK4TL4TM4TN4TO4TR4TT4TV4TW4TZ4UA4UG4UM4US4UY4UZ4VA4VC4VE4VG4VI4VN4VU4WF4WS4YE4YT4ZA4ZM4ZW", charArray11);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRdeRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4##a a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4##a a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4, #, #, a,  , a]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test17129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17129");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("000000000000000000000000000000000000000000000000000000000000000CCCC\\CCCC000000000000000000000000000000000000000000000000000000000000000CCCC\\CCCC0000000000000000000000000000000000000000000000000000000italiano000000000000000000000000000000000000000000000000000000000000000CCCC\\CCCC000000000000000000000000000000000000000000000000000000000000000CCCC\\CCCC0000000000000000000000000000000000000000000000000000000", (int) 'T');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000000000000000CCCC\\CCCC0000000000000000000000000000000000000000000000000000000" + "'", str2, "00000000000000000000CCCC\\CCCC0000000000000000000000000000000000000000000000000000000");
    }

    @Test
    public void test17130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17130");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("                                             de_de                                             ", "AnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihC");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                             de_de                                             " + "'", str2, "                                             de_de                                             ");
    }

    @Test
    public void test17131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17131");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("nglish (united kingdom)", "J", 34);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)" + "'", str3, "nglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)");
    }

    @Test
    public void test17132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17132");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "                        aNCHc                        ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test17133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17133");
        java.util.Locale locale3 = new java.util.Locale("\\U0020IiTALIAN\\U0020I", "ITTAIT_ITALIAN_EGAISH          ", "44444444444\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITALHcsineilatI444444444444");
        org.junit.Assert.assertEquals(locale3.toString(), "\\u0020iitalian\\u0020i_ITTAIT_ITALIAN_EGAISH          _44444444444\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITALHcsineilatI444444444444");
    }

    @Test
    public void test17134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17134");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("hi!deutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeu\\u0061deutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeu\\u0061deutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeu\\u0061deutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeu\\u0061deutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeu\\u0061deutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeu\\u0061deutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeu\\u0061_\\u0020_italienisch#########################################################################################", "alzzzItalian (Italy)enzzzItalian (Italy)czzzItalian (Italy)#########################################################################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test17135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17135");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("\u52a0\u62ff\u5927eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u52a0\u62ff\u5927eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee" + "'", str2, "\u52a0\u62ff\u5927eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee");
    }

    @Test
    public void test17136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17136");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "Eagaas\\\\\\\\\\\\\\HI!HI!", "0023DAL");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test17137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17137");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "                                                                              \\     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                              \\     " + "'", str1, "                                                                              \\     ");
    }

    @Test
    public void test17138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17138");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("Und-iTALIAN", "\\u0034\\u00                                             hcstuD                                             \\u0034\\u00");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Und-iTALIAN" + "'", str2, "Und-iTALIAN");
    }

    @Test
    public void test17139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17139");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray12 = new char[] { ' ', '4' };
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!", charArray12);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "Chinese (China)", charArray12);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u0065", charArray12);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                                                                                    ", charArray12);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "!ih", charArray12);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsOnly(charSequence3, charArray12);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "1\\u0061\\u0061\\u0061                           ", charArray12);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "IENISCH", charArray12);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "AnihC", charArray12);
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test17140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17140");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\\u0020TALIANTALIANTALIANiTALI", 'c');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void test17141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17141");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC\\u00de\\u00CCCCCCCCCCCCCCCCCCCCCCCCC...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC\\u00de\\u00CCCCCCCCCCCCCCCCCCCCCCCCC..." + "'", str1, "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC\\u00de\\u00CCCCCCCCCCCCCCCCCCCCCCCCC...");
    }

    @Test
    public void test17142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17142");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("CHN", "Eg");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CHN" + "'", str2, "CHN");
    }

    @Test
    public void test17143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17143");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "          ita                ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test17144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17144");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("Frnz\366sisch (Knd)", (int) '\n');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test17145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17145");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("69\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069!IH\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\englisch", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test17146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17146");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "g             E");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test17147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17147");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                         fran\347                          ", "U");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                         fran\347                          " + "'", str2, "                         fran\347                          ");
    }

    @Test
    public void test17148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17148");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("9hhhhhhhhhh                                                             ", "hcsineilat");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "9hhhhhhhhhh                                                             " + "'", str2, "9hhhhhhhhhh                                                             ");
    }

    @Test
    public void test17149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17149");
        char[] charArray11 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray11);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "iTALIAN", charArray11);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "allemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemand", charArray11);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "FFFF", charArray11);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) " (ITALIAN,ENGLISH)", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4##a a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4##a a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4, #, #, a,  , a]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test17150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17150");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("", 262, "                                                                              ECANADAgCANADACANADAsh");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                              ECANADAgCANADACANADAsh                                                                              ECANADAgCANADACANADAsh                                                              " + "'", str3, "                                                                              ECANADAgCANADACANADAsh                                                                              ECANADAgCANADACANADAsh                                                              ");
    }

    @Test
    public void test17151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17151");
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
        java.util.Locale locale13 = builder11.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder16 = builder11.setExtension('C', "\\u0020__AD4AE4AF4AG4AI4AL4AM4AN4AO4AQ4AR4AS4AT4AU4AW4AX4AZ4BA4BB4BD4BE4BF4BG4BH4BI4BJ4BL4BM4BN4BO4BQ4BR4BS4BT4BV4BW4BY4BZ4CA4CC4CD4CF4CG4CH4CI4CK4CL4CM4CN4CO4CR4CU4CV4CW4CX4CY4CZ4DE4DJ4DK4DM4DO4DZ4EC4EE4EG4EH4ER4ES4ET4FI4FJ4FK4FM4FO4FR4GA4GB4GD4GE4GF4GG4GH4GI4GL4GM4GN4GP4GQ4GR4GS4GT4GU4GW4GY4HK4HM4HN4HR4HT4HU4ID4IE4IL4IM4IN4IO4IQ4IR4IS4IT4JE4JM4JO4JP4KE4KG4KH4KI4KM4KN4KP4KR4KW4KY4KZ4LA4LB4LC4LI4LK4LR4LS4LT4LU4LV4LY4MA4MC4MD4ME4MF4MG4MH4MK4ML4MM4MN4MO4MP4MQ4MR4MS4MT4MU4MV4MW4MX4MY4MZ4NA4NC4NE4NF4NG4NI4NL4NO4NP4NR4NU4NZ4OM4PA4PE4PF4PG4PH4PK4PL4PM4PN4PR4PS4PT4PW4PY4QA4RE4RO4RS4RU4RW4SA4SB4SC4SD4SE4SG4SH4SI4SJ4SK4SL4SM4SN4SO4SR4SS4ST4SV4SX4SY4SZ4TC4TD4TF4TG4TH4TJ4TK4TL4TM4TN4TO4TR4TT4TV4TW4TZ4UA4UG4UM4US4UY4UZ4VA4VC4VE4VG4VI4VN4VU4WF4WS4YE4YT4ZA4ZM4ZW");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension value: \\u0020 [at index 0]");
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
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "italien");
    }

    @Test
    public void test17152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17152");
        int int1 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '2');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test17153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17153");
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
        java.lang.String str28 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strList26, 'i');
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeList5);
        org.junit.Assert.assertNotNull(languageRangeList7);
        org.junit.Assert.assertNotNull(languageRangeList9);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test17154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17154");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("anglais (royaume-uni)FRA", 77, 46);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test17155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17155");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiPrintable('l');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test17156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17156");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "NE_NAILATI_");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test17157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17157");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("hh9600u\\hhhhhhhhhh9600u\\hhhhhhhhhh9600u\\hhhhhhhhhh9600u\\)anic( esenic", 164);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hh9600u\\hhhhhhhhhh9600u\\hhhhhhhhhh9600u\\hhhhhhhhhh9600u\\)anic( esenic" + "'", str2, "hh9600u\\hhhhhhhhhh9600u\\hhhhhhhhhh9600u\\hhhhhhhhhh9600u\\)anic( esenic");
    }

    @Test
    public void test17158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17158");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("n       nn", "...LIAN", "                              DE_DE                              ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "n       nn" + "'", str3, "n       nn");
    }

    @Test
    public void test17159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17159");
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
        java.util.Locale locale14 = builder8.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder17 = builder8.setExtension('2', "TALIAN_ITALIAN_ENGLISH         ITALIAN_!IHITTAIT_ITALIAN_EGAISH");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key: 2 [at index 0]");
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
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "");
    }

    @Test
    public void test17160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17160");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("6b");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=6b");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17161");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "FRAADZHAEZHAFZHAGZHAIZHALZHAMZHANZHAOZHAQZHARZHASZHAEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test17162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17162");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("44444444444444444444444444444444!IH", "                                                                                               en", "                                             hcstued");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444!IH" + "'", str3, "44444444444444444444444444444444!IH");
    }

    @Test
    public void test17163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17163");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("fran\347ais", "\ud504\ub791\uc2a4HI!(\\U0020,ITALIENISCH#########################################################################################)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "fran\347ais" + "'", str2, "fran\347ais");
    }

    @Test
    public void test17164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17164");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        java.lang.String str4 = locale3.getCountry();
        java.util.Locale.setDefault(category0, locale3);
        java.util.Locale locale6 = java.util.Locale.ENGLISH;
        java.lang.String str7 = locale6.getDisplayCountry();
        java.util.Set<java.lang.String> strSet8 = locale6.getUnicodeLocaleAttributes();
        java.lang.String str9 = locale3.getDisplayName(locale6);
        java.lang.String str10 = locale6.getDisplayVariant();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
// flaky:         org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test17165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17165");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d" + "'", str1, "\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d");
    }

    @Test
    public void test17166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17166");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("Egsh", "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Egsh" + "'", str2, "Egsh");
    }

    @Test
    public void test17167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17167");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("\ub3c5\uc77c\uc5b4", "\\U0034\\U00                                             HCSTUD                                             \\U0034\\U00 ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test17168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17168");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("", "E", (int) ')');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "\\u0038", 40, 17);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test17169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17169");
        char[] charArray8 = new char[] { 'i', '4', '#' };
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "en", charArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "ita", charArray8);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny("FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA", charArray8);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "tanoch", charArray8);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "ITALIENISC", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "i4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "i4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[i, 4, #]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test17170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17170");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder3.removeUnicodeLocaleAttribute("anglais (royaume-uni)fra");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: anglais (royaume-uni)fra [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test17171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17171");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("\\u0020italianitalianitalianitali\\u0020italianitalianitalianital (ALLEMAND)", "Chinese (China", (int) '\\');
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "G");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray7);
        int int9 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("        \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\!_\\U0020_Itle\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\         ", strArray7);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test17172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17172");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("Hhhhhhhhhh", "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhhhhhhhh" + "'", str2, "Hhhhhhhhhh");
    }

    @Test
    public void test17173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17173");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("hIAN\\U0020Ihie", "\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITAL (ALLEMAND)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test17174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17174");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("g             E", "ADAAEAAFAAGAAIAALAAMAANAAOAAQAARAASAATAAUAAWAAXAAZABAABBhcstueDNABOABQABRABSABTABVABWABYABZACAACCACDACFACGACHACIACKACLACMACNACOACRACUACVACWACXACYACZADEADJADKADMADOADZAECAEEAEGAEHAERAESAETAFIAFJAFKAFMAFOAFRAGAAGBAGDAGEAGFAGGAGHAGIAGLAGMAGNAGPAGQAGRAGSAGTAGUAGWAGYAHKAHMAHNAHRAHTAHUAIDAIEAILAIMAINAIOAIQAIRAISAITAJEAJMAJOAJPAKEAKGAKHAKIAKMAKNAKPAKRAKWAKYAKZALAALBALCALIALKALRALSALTALUALVALYAMAAMCAMDAMEAMFAMGAMHAMKAMLAMMAMNAMOAMPAMQAMRAMSAMTAMUAMVAMWAMXAMYAMZANAANCANEANFANGANIANLANOANPANRANUANZAOMAPAAPEAPFAPGAPHAPKAPLAPMAPNAPRAPSAPTAPWAPYAQAAREAROARSARUARWASAASBASCASDASEASGASHASIASJASKASLASMASNASOASRASSASTASVASXASYASZATCATDATFATGATHATJATKATLATMATNATOATRATTATVATWATZAUAAUGAUMAUSAUYAUZAVAAVCAVEAVGAVIAVNAVUAWFAWSAYEAYTAZAAZMAZW", (int) 'B');
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test17175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17175");
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
        java.lang.String str14 = locale11.getDisplayVariant();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "zh" + "'", str2, "zh");
        org.junit.Assert.assertTrue("'" + category3 + "' != '" + java.util.Locale.Category.FORMAT + "'", category3.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "de");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "allemand" + "'", str7, "allemand");
        org.junit.Assert.assertEquals(locale11.toString(), "\\u0020italianitalianitalianitali\\u0020italianitalianitalianital_ALLEMAND");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Chinese" + "'", str13, "Chinese");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test17176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17176");
        java.util.Locale locale1 = new java.util.Locale("\\u0020__AD4AE4AF4AG4AI4AL4AM4AN4AO4AQ4AR4AS4AT4AU4AW4AX4AZ4BA4BB4BD4BE4BF4BG4BH4BI4BJ4BL4BM4BN4BO4BQ4BR4BS4BT4BV4BW4BY4BZ4CA4CC4CD4CF4CG4CH4CI4CK4CL4CM4CN4CO4CR4CU4CV4CW4CX4CY4CZ4DE4DJ4DK4DM4DO4DZ4EC4EE4EG4EH4ER4ES4ET4FI4FJ4FK4FM4FO4FR4GA4GB4GD4GE4GF4GG4GH4GI4GL4GM4GN4GP4GQ4GR4GS4GT4GU4GW4GY4HK4HM4HN4HR4HT4HU4ID4IE4IL4IM4IN4IO4IQ4IR4IS4IT4JE4JM4JO4JP4KE4KG4KH4KI4KM4KN4KP4KR4KW4KY4KZ4LA4LB4LC4LI4LK4LR4LS4LT4LU4LV4LY4MA4MC4MD4ME4MF4MG4MH4MK4ML4MM4MN4MO4MP4MQ4MR4MS4MT4MU4MV4MW4MX4MY4MZ4NA4NC4NE4NF4NG4NI4NL4NO4NP4NR4NU4NZ4OM4PA4PE4PF4PG4PH4PK4PL4PM4PN4PR4PS4PT4PW4PY4QA4RE4RO4RS4RU4RW4SA4SB4SC4SD4SE4SG4SH4SI4SJ4SK4SL4SM4SN4SO4SR4SS4ST4SV4SX4SY4SZ4TC4TD4TF4TG4TH4TJ4TK4TL4TM4TN4TO4TR4TT4TV4TW4TZ4UA4UG4UM4US4UY4UZ4VA4VC4VE4VG4VI4VN4VU4WF4WS4YE4YT4ZA4ZM4ZW");
        org.junit.Assert.assertEquals(locale1.toString(), "\\u0020__ad4ae4af4ag4ai4al4am4an4ao4aq4ar4as4at4au4aw4ax4az4ba4bb4bd4be4bf4bg4bh4bi4bj4bl4bm4bn4bo4bq4br4bs4bt4bv4bw4by4bz4ca4cc4cd4cf4cg4ch4ci4ck4cl4cm4cn4co4cr4cu4cv4cw4cx4cy4cz4de4dj4dk4dm4do4dz4ec4ee4eg4eh4er4es4et4fi4fj4fk4fm4fo4fr4ga4gb4gd4ge4gf4gg4gh4gi4gl4gm4gn4gp4gq4gr4gs4gt4gu4gw4gy4hk4hm4hn4hr4ht4hu4id4ie4il4im4in4io4iq4ir4is4it4je4jm4jo4jp4ke4kg4kh4ki4km4kn4kp4kr4kw4ky4kz4la4lb4lc4li4lk4lr4ls4lt4lu4lv4ly4ma4mc4md4me4mf4mg4mh4mk4ml4mm4mn4mo4mp4mq4mr4ms4mt4mu4mv4mw4mx4my4mz4na4nc4ne4nf4ng4ni4nl4no4np4nr4nu4nz4om4pa4pe4pf4pg4ph4pk4pl4pm4pn4pr4ps4pt4pw4py4qa4re4ro4rs4ru4rw4sa4sb4sc4sd4se4sg4sh4si4sj4sk4sl4sm4sn4so4sr4ss4st4sv4sx4sy4sz4tc4td4tf4tg4th4tj4tk4tl4tm4tn4to4tr4tt4tv4tw4tz4ua4ug4um4us4uy4uz4va4vc4ve4vg4vi4vn4vu4wf4ws4ye4yt4za4zm4zw");
    }

    @Test
    public void test17177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17177");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("TEDESCO", "                       \\u0020                        ", (int) 'i');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test17178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17178");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "                                             xx_xx                                              ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test17179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17179");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("DALLEMANDALLEMANDALLEMANDALLEMANDALLEMANDALLEMANDALLEMANDALLE");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "DALLEMANDALLEMANDALLEMANDALLEMANDALLEMANDALLEMANDALLEMANDALLE" + "'", str1, "DALLEMANDALLEMANDALLEMANDALLEMANDALLEMANDALLEMANDALLEMANDALLE");
    }

    @Test
    public void test17180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17180");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("\u1112\u1161\u11ab\u1100\u116e\u11a8\u110b\u1165\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n", "itFranz\366sischTAFranz\366sischiFranz\366sischTFranz\366sisch_Franz\366sischITA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u1112\u1161\u11ab\u1100\u116e\u11a8\u110b\u1165\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n" + "'", str2, "\u1112\u1161\u11ab\u1100\u116e\u11a8\u110b\u1165\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }

    @Test
    public void test17181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17181");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("\\U005", "AND4444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\U005" + "'", str2, "\\U005");
    }

    @Test
    public void test17182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17182");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("         ITALIAN_italian_eNGLISH         ITALIAN_!IHitTAiT_ITALIAN_EgAish", "HI!tttttttHI!tttttttHI!tttttttHI!tttttttHI!tttttttHI!tttttttHI!tttttttHI!tttttttHI!tttttttHI!tttttttHI!tttttttHI!tttttttHI!tttttttHI!tttttttHI!tttttttHI!", 220);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test17183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17183");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("gERMAN (gERMANY)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "German (Germany)" + "'", str1, "German (Germany)");
    }

    @Test
    public void test17184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17184");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("", '.');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test17185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17185");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("Chinese (China", 'a');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test17186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17186");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII", (int) 'k');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII" + "'", str2, "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
    }

    @Test
    public void test17187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17187");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("Italian");
        java.util.Locale locale4 = java.util.Locale.PRC;
        java.lang.String str5 = locale4.getDisplayName();
        java.util.Locale.Builder builder6 = builder0.setLocale(locale4);
        java.util.Locale.Builder builder7 = builder6.clear();
        java.util.Locale.Builder builder8 = builder7.clearExtensions();
        java.util.Locale.Builder builder10 = builder7.setLanguageTag("anglais");
        java.util.Locale.Builder builder12 = builder10.setVariant("hcstued");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder14 = builder10.removeUnicodeLocaleAttribute("                                       k");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute:                                        k [at index 0]");
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
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test17188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17188");
        java.util.Locale locale1 = new java.util.Locale("Frnz\366sisch(Knd");
        org.junit.Assert.assertEquals(locale1.toString(), "frnz\366sisch(knd");
    }

    @Test
    public void test17189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17189");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Deutscd\\XTALXAN_ITALIAN_ENGLXSH");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test17190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17190");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("    \\XTALXAN_ITALIAN_ENGLXSH    ", "44444444444444444444444444444444!IH");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "aaaaaaaaaaaaaaaaDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEU\\u0061aaaaaaaaaaaaaaaa");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test17191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17191");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e", 52);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "e                               e                   " + "'", str2, "e                               e                   ");
    }

    @Test
    public void test17192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17192");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "AzhzhzhzhzhzhzhzhzhzhE             g                          ", "hi!        (\\U0020,Italienisch#########################################################################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test17193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17193");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("zh_TW", "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rZH_CN (CAN)");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test17194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17194");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "\\u0061");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test17195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17195");
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
        java.util.Locale locale27 = java.util.Locale.ENGLISH;
        java.lang.String str28 = locale27.getDisplayLanguage();
        java.lang.String str29 = org.apache.commons.lang3.StringUtils.upperCase("!IH", locale27);
        java.lang.String str30 = locale27.getDisplayCountry();
        boolean boolean31 = locale10.equals((java.lang.Object) locale27);
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
        org.junit.Assert.assertEquals(locale27.toString(), "en");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "inglese" + "'", str28, "inglese");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "!IH" + "'", str29, "!IH");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test17196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17196");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i" + "'", str1, "\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i");
    }

    @Test
    public void test17197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17197");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("ITALIAN (italian,eNGLISH)", "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC                       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ITALIAN (italian,eNGLISH)" + "'", str2, "ITALIAN (italian,eNGLISH)");
    }

    @Test
    public void test17198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17198");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("inglese (Canada)", 103);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test17199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17199");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiAlphaLower('g');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test17200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17200");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("  \\u005    (...U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069!IH\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\ENGLISCH)");
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + ' ' + "'", char1 == ' ');
    }

    @Test
    public void test17201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17201");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) '\n', 'f');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\n' + "'", char2 == '\n');
    }

    @Test
    public void test17202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17202");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "SUen_", (java.lang.CharSequence) "...alamanaoaqarasatauawaxazbabbbdbebfbgbhbibjblbmbnbobqbrbsbtbvbwbybzcacccdcfcgchcickclcmcncocrcucvcwcxc...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 105 + "'", int2 == 105);
    }

    @Test
    public void test17203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17203");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("44444444444444444444444444444444444444444444it                   ", "italien");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test17204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17204");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("R", "kkkkkkkkkkkkkkkkkeAGAASHuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuufr-cafr-cafr-cafr-cafr-caf", 51);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test17205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17205");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('#', 56);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 56 + "'", int2 == 56);
    }

    @Test
    public void test17206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17206");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("hi!        Italienisch italian_ITALIAN_English HI! hi! ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED... \\u0034 HI! Italian \\u0061 \\u0023 hi! iTALIAN Chinese (China) hi! zh_CN iTALIAN en Italienisch", (int) 'h', '!');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!        Italienisch italian_ITALIAN_English HI! hi! ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED... \\u0034 HI! Italian \\u0061 \\u0023 hi! iTALIAN Chinese (China) hi! zh_CN iTALIAN en Italienisch" + "'", str3, "hi!        Italienisch italian_ITALIAN_English HI! hi! ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED... \\u0034 HI! Italian \\u0061 \\u0023 hi! iTALIAN Chinese (China) hi! zh_CN iTALIAN en Italienisch");
    }

    @Test
    public void test17207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17207");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("Francia");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap2 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList3 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList1, strMap2);
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(languageRangeList3);
    }

    @Test
    public void test17208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17208");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("x", (int) ')');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "x" + "'", str2, "x");
    }

    @Test
    public void test17209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17209");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("fRANZ\326SISCH (kANADA)", "ECANADA                                      ...g                                      ...CANADACANADA                                      ...sh                                      ...                                                                                                   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test17210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17210");
        java.lang.String[] strArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithAny("\\u0020iTALIANiTALIANiTALIANiTALI\\u0020iTALIANiTALIANiTALIANiTAL", strArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test17211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17211");
        java.util.Locale locale3 = new java.util.Locale("Italian", "Italian", "English");
        boolean boolean4 = locale3.hasExtensions();
        java.util.Set<java.lang.String> strSet5 = locale3.getUnicodeLocaleAttributes();
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet5, "alzzzItalian (Italy)enzzzItalian (Italy)czzzItalian (Italy)#########################################################################################");
        org.junit.Assert.assertEquals(locale3.toString(), "italian_ITALIAN_English");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test17212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17212");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("8600u\\                                                                                                                  ", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "8600u\\                                                                                                                  " + "'", str2, "8600u\\                                                                                                                  ");
    }

    @Test
    public void test17213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17213");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Locale locale1 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str2 = locale0.getDisplayScript(locale1);
        java.lang.String str3 = locale1.getVariant();
        java.lang.String str5 = locale1.getExtension('i');
        java.util.Locale.setDefault(locale1);
        java.lang.String str7 = locale1.getDisplayCountry();
        java.util.Locale locale8 = java.util.Locale.CHINA;
        java.lang.String str9 = locale1.getDisplayScript(locale8);
        java.lang.String str11 = locale8.getExtension('e');
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Canada" + "'", str7, "Canada");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test17214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17214");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("                        German (Germany)                         ", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                        German (Germany)                         " + "'", str2, "                        German (Germany)                         ");
    }

    @Test
    public void test17215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17215");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("fr-CA", 'A');
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "fr-C" + "'", str3, "fr-C");
    }

    @Test
    public void test17216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17216");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("hcstued-e#__nailati", "                                                                 CANADA", "                                                                    \\u0020iTALIANiTALIANiTALIANiTALI");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test17217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17217");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("anglais (Royaume-Uni)", "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r...", 395);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test17218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17218");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder15 = builder12.setUnicodeLocaleKeyword("zzzChina", "        \\u005c         ");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: zzzChina [at index 0]");
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
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test17219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17219");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("FRANZOSI         ITALIAN_italian_eNGLISHFRANZOSI", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "FRANZOSI         ITALIAN_italian_eNGLISHFRANZOSI" + "'", str2, "FRANZOSI         ITALIAN_italian_eNGLISHFRANZOSI");
    }

    @Test
    public void test17220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17220");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder5.setRegion("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              fr_C");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region:                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               fr_C [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test17221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17221");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\\u0043", "Chinesisch (Ch", 120);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test17222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17222");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("INGLESEINGLESEINGLESEINItalia                                                  INGLESEINGLESEINGLESEING", (int) 'A', (int) 'F');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test17223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17223");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("\\u0023", "\\u0023");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "italian_ITALIAN_English");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "8600u\\                                                                                                                  ");
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.split("it_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_I", "I\\U0020ITALIANITALIANITALIANITALIIT", 76);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEach("Franz\366sischFranzosisch (Frankreich)uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", strArray3, strArray11);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Franz\366sischFranzosisch (Frankreich)uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str12, "Franz\366sischFranzosisch (Frankreich)uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test17224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17224");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("i!_\\u0020_iTLE#####################################!_\\u0020_iTLE######################################", "NC_hz\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test17225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17225");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "nglisch", (java.lang.CharSequence) "ZHO                               44\\u002344  \\u0020iTALIANiTALIANiTALIANiTALI");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "nglisch" + "'", charSequence2, "nglisch");
    }

    @Test
    public void test17226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17226");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "Chinesisch (China", 32);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test17227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17227");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("aaaaaaaaaaaaaaaaaaaaaaaaFranzosisch(Frankreich)aaaaaaaaaaaaaaaaaaaaaaaa", 34);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaFranzos..." + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaFranzos...");
    }

    @Test
    public void test17228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17228");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween(" \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n", "it                   ", "\\U0069HHHHHHHHHH");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test17229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17229");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("CANADA", "Italienisch", "ITITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAI");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CANADA" + "'", str3, "CANADA");
    }

    @Test
    public void test17230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17230");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("             hcsineilati             dddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd", "           e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               ", 116);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny("        \\u005c         canadacanadacanadacan", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test17231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17231");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hi!       _\\U0020_Italienisch####################################################################          ");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test17232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17232");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("    \\XTALXAN_ITALIAN_ENGLXSH    R0                                               nailati            ", "           e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "    \\XTALXAN_ITALIAN_ENGLXSH    R0                                               nailati            " + "'", str2, "    \\XTALXAN_ITALIAN_ENGLXSH    R0                                               nailati            ");
    }

    @Test
    public void test17233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17233");
        java.util.Locale locale3 = new java.util.Locale("                                                                                                    ", " ", "Chinese (China)");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = locale3.getExtension('.');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "                                                                                                    _ _Chinese (China)");
    }

    @Test
    public void test17234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17234");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder3.clear();
        java.util.Locale.Builder builder5 = builder3.clearExtensions();
        java.util.Locale.Builder builder6 = builder3.clear();
        java.util.Locale.Builder builder7 = builder6.clearExtensions();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test17235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17235");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder1.setLanguage("\\U0020ItalianItalianItalianItali\\U0020ItalianItalianItalianItal");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: \\U0020ItalianItalianItalianItali\\U0020ItalianItalianItalianItal [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "French (Canada)" + "'", str3, "French (Canada)");
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test17236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17236");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "adaeafagaialamanaoaqarasatauawaxazbabbbdbebfbgbhbibjblbmbnbobqbrbsbtbvbwbybzcacccdcfcgchcickclcmcncocrcucvcwcxcyczded8...", 116);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("HI!       ", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test17237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17237");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("00000000000000coreen (Coree du Sud)", "           5555555555           ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000000000coreen (Coree du Sud)" + "'", str2, "00000000000000coreen (Coree du Sud)");
    }

    @Test
    public void test17238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17238");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC\\u00de\\u00CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC", 6);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test17239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17239");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("italiaE");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "italiaE" + "'", str1, "italiaE");
    }

    @Test
    public void test17240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17240");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("         ", "44                                                                                               en44");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test17241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17241");
        char[] charArray13 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray13);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("HI!", charArray13);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "Franz\366sisch", charArray13);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "Italien", charArray13);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC\\u00d\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITAL\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\u00CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC", charArray13);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "", charArray13);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\U0047", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "4##a a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "4##a a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[4, #, #, a,  , a]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test17242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17242");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("44444444444444NAILATI44444444444444", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444NAILATI44444444444444" + "'", str2, "44444444444444NAILATI44444444444444");
    }

    @Test
    public void test17243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17243");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("Cor\351e du Sud");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Cor\351eduSud" + "'", str1, "Cor\351eduSud");
    }

    @Test
    public void test17244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17244");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("\\u0054", "Fr ncG ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u0054" + "'", str2, "\\u0054");
    }

    @Test
    public void test17245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17245");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("\\u0059", "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u0059" + "'", str2, "\\u0059");
    }

    @Test
    public void test17246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17246");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder4 = builder0.clear();
        java.util.Locale locale5 = builder4.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder4.setVariant("\\u0034\\u00                                   en_C\\u0034\\u00");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: \\u0034\\u00                                   en_C\\u0034\\u00 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
    }

    @Test
    public void test17247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17247");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("aDAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test17248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17248");
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
        boolean boolean18 = locale9.hasExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = locale9.getUnicodeLocaleType("It_I");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: It_I");
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test17249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17249");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("cccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc", '5');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'c' + "'", char2 == 'c');
    }

    @Test
    public void test17250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17250");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("hI!       G", "##################    \\XTALXAN_ITALIAN_ENGLXSH    ###################", (int) (byte) 10, 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "##################    \\XTALXAN_ITALIAN_ENGLXSH    ###################G" + "'", str4, "##################    \\XTALXAN_ITALIAN_ENGLXSH    ###################G");
    }

    @Test
    public void test17251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17251");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("", "ITALIAN4ITALIAN4ITALIAN4ITALIA    IIIIIIIIII...........................");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test17252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17252");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("Franzosisch (Kanada)", "FRANZ\366SISCH", "CCCC\\CCCC", 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Franzosisch (Kanada)" + "'", str4, "Franzosisch (Kanada)");
    }

    @Test
    public void test17253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17253");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("Ttat_ita", (int) 'H', (int) 'A');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test17254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17254");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("JP", "...dedcfcgchcickclcmcncocrcucvcwcxcyczdbebfbgbhbibjblbmbnbobqbrbsbtbvbwbybzcacccdaeafagaialamanaoaqarasatauawaxazbabbbda", "                              DE_DE                              ", 36);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JP" + "'", str4, "JP");
    }

    @Test
    public void test17255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17255");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("           e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e" + "'", str1, "e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e");
    }

    @Test
    public void test17256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17256");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "\\0020ItalianItalianItalianItal", (java.lang.CharSequence) "itTAiT_ITALIAN_EgAish");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 26 + "'", int2 == 26);
    }

    @Test
    public void test17257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17257");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiAlphanumeric('t');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test17258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17258");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("GGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGitalian", "AzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs cAnese (cAna)u0069h..France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)Azhzhzhzhzhzhzhzhzhzh");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test17259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17259");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('a', (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test17260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17260");
        java.lang.String str1 = org.apache.commons.lang3.CharUtils.toString('l');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "l" + "'", str1, "l");
    }

    @Test
    public void test17261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17261");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("4444ALLEMAND4444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444allemand4444" + "'", str1, "4444allemand4444");
    }

    @Test
    public void test17262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17262");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("\\u", '!');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "\\u005c");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\u" + "'", str4, "\\u");
    }

    @Test
    public void test17263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17263");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("gbr", 'e');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concatWith("Italie", (java.lang.Object[]) strArray3);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "anihc!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "gbr" + "'", str4, "gbr");
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test17264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17264");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale locale4 = java.util.Locale.CHINESE;
        java.lang.String str5 = locale4.getCountry();
        java.util.Locale.Builder builder6 = builder3.setLocale(locale4);
        java.util.Locale locale7 = builder6.build();
        java.lang.String str8 = locale7.toLanguageTag();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "zh" + "'", str8, "zh");
    }

    @Test
    public void test17265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17265");
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
        java.util.Locale locale30 = java.util.Locale.GERMAN;
        java.util.Locale locale31 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str32 = locale30.getDisplayName(locale31);
        java.util.Locale.setDefault(locale31);
        java.lang.String str34 = org.apache.commons.lang3.StringUtils.upperCase("8600u\\                                                                                                                  ", locale31);
        java.lang.String str35 = locale31.getDisplayName();
        java.lang.String str36 = locale17.getDisplayScript(locale31);
        java.lang.String str37 = locale17.getDisplayCountry();
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
// flaky:         org.junit.Assert.assertEquals(locale16.toString(), "fr_FR");
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
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "de");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "allemand" + "'", str32, "allemand");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "8600U\\                                                                                                                  " + "'", str34, "8600U\\                                                                                                                  ");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "fran\347ais (Canada)" + "'", str35, "fran\347ais (Canada)");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "France" + "'", str37, "France");
    }

    @Test
    public void test17266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17266");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("...78zhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzh...", "GGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGFRA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test17267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17267");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("AhzRAhzQAhzOAhzNAh", "adaeafagaialamanaoaqarasatauawaxazbabbbdbebfbgbhbibjblbmbnbobqbrbsbtbvbwbybzcacccdcfcgchcickclcmcncocrcucvcwcxcyczded...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test17268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17268");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test17269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17269");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("Chinese (China)                                                                                                           ", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=chinese(china)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17270");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rcHINESISCH (cHINA)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "cHINESISCH (cHINA)" + "'", str1, "cHINESISCH (cHINA)");
    }

    @Test
    public void test17271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17271");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "\ud504\ub791\uc2a4\uc5b4\uce90\ub098\ub2e4)", (java.lang.CharSequence) "CINESE (cINA)");
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test17272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17272");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("eAGAASH                                                                                                                                                                                                                                                                                                                                                                                                    ", "HI!       ALLEMANDITALIENISCHALLEMANDITALIAN_ITALIAN_ENG    \\     ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...ALLEMAND\\U0034ALLEMANDHI!ALLEMANDITALIANALLEMAND\\U0061ALLEMAND\\U0023ALLEMANDHI!ALLEMANDITALIANALLEMANDCHINESE (CHINA)ALLEMANDHI!ALLEMANDZH_CNALLEMANDITALIANALLEMANDENALLEMANDITALIENISCH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test17273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17273");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("nglisch", 'R');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nglisch" + "'", str2, "nglisch");
    }

    @Test
    public void test17274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17274");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("h!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!i", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
    }

    @Test
    public void test17275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17275");
        java.util.Locale.Builder builder2 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale locale4 = java.util.Locale.UK;
        java.util.Locale.Builder builder5 = builder2.setLocale(locale4);
        java.util.Locale locale7 = java.util.Locale.forLanguageTag("\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITAL");
        java.util.Locale.Builder builder8 = builder2.setLocale(locale7);
        java.util.Locale locale9 = java.util.Locale.PRC;
        java.lang.String str10 = locale9.getDisplayVariant();
        java.lang.String str11 = locale7.getDisplayCountry(locale9);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.upperCase("                                                       hi!                                                              ", locale9);
        java.lang.String str14 = locale9.getExtension('E');
        java.lang.String str15 = locale9.getDisplayScript();
        java.util.Locale locale18 = new java.util.Locale("\\u0020iTALIANiTALIANiTALIANiTALI", "French (Canada)");
        java.lang.String str19 = locale9.getDisplayVariant(locale18);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.lowerCase("\\u0054", locale9);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_GB");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "                                                       HI!                                                              " + "'", str12, "                                                       HI!                                                              ");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals(locale18.toString(), "\\u0020italianitalianitalianitali_FRENCH (CANADA)");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\\u0054" + "'", str20, "\\u0054");
    }

    @Test
    public void test17276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17276");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("     e                               e                               e            ");
        org.junit.Assert.assertNotNull(languageRangeList1);
    }

    @Test
    public void test17277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17277");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("frn\347is(frnce)(CHINESE(CHINA)", 13);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "frn\347is(frnce)(CHINESE(CHINA)" + "'", str2, "frn\347is(frnce)(CHINESE(CHINA)");
    }

    @Test
    public void test17278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17278");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "fr_CA                                                   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test17279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17279");
        java.util.Locale locale3 = new java.util.Locale("", "");
        java.util.Locale locale4 = java.util.Locale.FRENCH;
        java.util.Locale locale5 = java.util.Locale.ENGLISH;
        java.lang.String str6 = locale5.getDisplayCountry();
        java.lang.String str7 = locale4.getDisplayVariant(locale5);
        java.lang.String str8 = locale4.getDisplayCountry();
        java.lang.String str9 = locale4.getScript();
        java.lang.String str10 = locale4.getScript();
        java.lang.String str11 = locale3.getDisplayCountry(locale4);
        java.lang.String str12 = locale3.getLanguage();
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.upperCase("                                                                                                                  \\u0068", locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "                                                                                                                  \\U0068" + "'", str13, "                                                                                                                  \\U0068");
    }

    @Test
    public void test17280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17280");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('d', (int) 'd');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test17281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17281");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "44444444444444italian44444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444italian44444444444444" + "'", str1, "44444444444444italian44444444444444");
    }

    @Test
    public void test17282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17282");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder4 = builder0.clear();
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder5.setUnicodeLocaleKeyword(" \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\\U0020ITALIANITALIANITALIANITALI", "a");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key:  ????????????????????????????????????\\U0020ITALIANITALIANITALIANITALI [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test17283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17283");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("\\u0020", 72, (int) 't');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test17284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17284");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad(" Italia  Italia  Italia  Italia  Italia  Italia  Italia DEUTSCH Italia  Italia  Italia  Italia  Italia  Italia  Italia  ", 101, 'U');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " Italia  Italia  Italia  Italia  Italia  Italia  Italia DEUTSCH Italia  Italia  Italia  Italia  Italia  Italia  Italia  " + "'", str3, " Italia  Italia  Italia  Italia  Italia  Italia  Italia DEUTSCH Italia  Italia  Italia  Italia  Italia  Italia  Italia  ");
    }

    @Test
    public void test17285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17285");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("itaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaita", 26);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aitaitaitaitaitaitaitaitaita" + "'", str2, "aitaitaitaitaitaitaitaitaita");
    }

    @Test
    public void test17286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17286");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("                                                                    \\U0020ItalianItalianItalianItali", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=\\u0020italianitalianitalianitali");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17287");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.getDefault(category0);
        java.util.Locale locale3 = java.util.Locale.getDefault(category0);
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleAttributes();
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet4, 'B');
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
// flaky:         org.junit.Assert.assertEquals(locale1.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale2);
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale3);
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "en_US");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test17288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17288");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                                                         \\u0046                                                         ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test17289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17289");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("             hcsineilatI             dddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd", "franz\366sisch (frankreich)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test17290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17290");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC                       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC                       " + "'", str1, "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC                       ");
    }

    @Test
    public void test17291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17291");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "cinese (Cina)\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hh");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 69 + "'", int1 == 69);
    }

    @Test
    public void test17292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17292");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("zH_CN", 136, '!');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!zH_CN" + "'", str3, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!zH_CN");
    }

    @Test
    public void test17293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17293");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("de_de", "\uc601\uc5b4\uc601\uc5b4\uc601\uc5b4\uc601\uc5b4\uc601\uc5b4\uc601\uc5b4\uc601\uc5b4\uc601\uc5b4\uc601\uc5b4\uc601\uc5b4                                                                                                  ", "ITALIAE");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "de_de" + "'", str3, "de_de");
    }

    @Test
    public void test17294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17294");
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
        java.util.Locale.Builder builder13 = builder11.setVariant("Fgence");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder15 = builder11.setRegion("Franz\366sischFranzosisch (Frankreich)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: Franzo?sischFranzosisch (Frankreich) [at index 0]");
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
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test17295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17295");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("Franz\366sisc", 122, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "########################################################Franz\366sisc########################################################" + "'", str3, "########################################################Franz\366sisc########################################################");
    }

    @Test
    public void test17296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17296");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("                          ...", "aE");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test17297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17297");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("                                              \\     ", "tttttttfr-C                 ttttttt");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                              \\     " + "'", str2, "                                              \\     ");
    }

    @Test
    public void test17298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17298");
        java.util.Locale locale2 = new java.util.Locale("FR-FR", "adaeafagaialamanaoaqarasatauawaxazbabbbdbebfbgbhbibjblbmbnbobqbrbsbtbvbwbybzcacccdcfcgchcickclcmcncocrcucvcwcxcyczdedh...");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = locale2.getISO3Language();
            org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException; message: Couldn't find 3-letter language code for fr-fr");
        } catch (java.util.MissingResourceException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "fr-fr_ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDH...");
    }

    @Test
    public void test17299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17299");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT       !ih", "uuuuuuuuuuuuuuuuu\\u0066", 89);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test17300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17300");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("FR_fr", 10, 'G');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "FR_frGGGGG" + "'", str3, "FR_frGGGGG");
    }

    @Test
    public void test17301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17301");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("2iT hi!       _\\U0020_Italienisch####################################################################            2i");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test17302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17302");
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
        java.lang.String str11 = locale10.toString();
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "fr_CA" + "'", str11, "fr_CA");
    }

    @Test
    public void test17303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17303");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("inglese", "x-lvariant-ZH", (int) '0');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test17304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17304");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList0 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("I");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList2, strMap3);
        java.util.Locale.LanguageRange[] languageRangeArray5 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList6 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList6, languageRangeArray5);
        java.util.Locale locale8 = java.util.Locale.KOREA;
        java.util.Set<java.lang.String> strSet9 = locale8.getUnicodeLocaleAttributes();
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet9, "\\u0020iTALIANiTALIANiTALIANiTALI");
        java.lang.String str12 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList6, (java.util.Collection<java.lang.String>) strSet9);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap13 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList14 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList6, strMap13);
        java.util.Locale.LanguageRange[] languageRangeArray15 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList16 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList16, languageRangeArray15);
        java.lang.String[] strArray20 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList21 = new java.util.ArrayList<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList21, strArray20);
        java.util.Locale.FilteringMode filteringMode23 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList24 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList16, (java.util.Collection<java.lang.String>) strList21, filteringMode23);
        java.util.Locale.LanguageRange[] languageRangeArray25 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList26 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList26, languageRangeArray25);
        java.lang.String[] strArray30 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList31 = new java.util.ArrayList<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList31, strArray30);
        java.util.Locale.FilteringMode filteringMode33 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList34 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList26, (java.util.Collection<java.lang.String>) strList31, filteringMode33);
        java.lang.String[] strArray36 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList37 = new java.util.ArrayList<java.lang.String>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList37, strArray36);
        java.util.List<java.lang.String> strList39 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList26, (java.util.Collection<java.lang.String>) strList37);
        java.lang.String str40 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList16, (java.util.Collection<java.lang.String>) strList37);
        java.util.Locale.LanguageRange[] languageRangeArray41 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList42 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList42, languageRangeArray41);
        java.lang.String[] strArray46 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList47 = new java.util.ArrayList<java.lang.String>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList47, strArray46);
        java.util.Locale.FilteringMode filteringMode49 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList50 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList42, (java.util.Collection<java.lang.String>) strList47, filteringMode49);
        java.util.Locale.LanguageRange[] languageRangeArray51 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList52 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList52, languageRangeArray51);
        java.lang.String[] strArray56 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList57 = new java.util.ArrayList<java.lang.String>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList57, strArray56);
        java.util.Locale.FilteringMode filteringMode59 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList60 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList52, (java.util.Collection<java.lang.String>) strList57, filteringMode59);
        java.lang.String[] strArray62 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList63 = new java.util.ArrayList<java.lang.String>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList63, strArray62);
        java.util.List<java.lang.String> strList65 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList52, (java.util.Collection<java.lang.String>) strList63);
        java.lang.String str66 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList42, (java.util.Collection<java.lang.String>) strList63);
        java.util.Locale locale67 = java.util.Locale.ITALIAN;
        java.util.Set<java.lang.Character> charSet68 = locale67.getExtensionKeys();
        java.util.Locale locale70 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale72 = new java.util.Locale("");
        java.util.Locale locale73 = java.util.Locale.FRANCE;
        java.util.Locale locale74 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str75 = locale73.getDisplayScript(locale74);
        java.util.Locale locale76 = java.util.Locale.ENGLISH;
        java.lang.String str77 = locale76.getDisplayCountry();
        java.util.Locale locale78 = java.util.Locale.PRC;
        java.util.Locale locale79 = java.util.Locale.US;
        java.util.Locale locale80 = java.util.Locale.FRANCE;
        java.util.Locale locale81 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str82 = locale80.getDisplayScript(locale81);
        java.util.Locale locale83 = java.util.Locale.ITALIAN;
        java.util.Set<java.lang.Character> charSet84 = locale83.getExtensionKeys();
        java.util.Locale locale85 = java.util.Locale.ITALIAN;
        java.lang.String str86 = locale85.getDisplayLanguage();
        java.util.Locale locale87 = java.util.Locale.FRENCH;
        java.util.Locale locale88 = java.util.Locale.US;
        java.util.Locale locale89 = java.util.Locale.ITALIAN;
        java.lang.String str90 = locale89.getDisplayLanguage();
        java.util.Locale locale91 = java.util.Locale.FRANCE;
        java.util.Locale[] localeArray92 = new java.util.Locale[] { locale67, locale70, locale72, locale73, locale76, locale78, locale79, locale81, locale83, locale85, locale87, locale88, locale89, locale91 };
        java.util.ArrayList<java.util.Locale> localeList93 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean94 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList93, localeArray92);
        java.util.Locale locale95 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList42, (java.util.Collection<java.util.Locale>) localeList93);
        java.util.List<java.util.Locale> localeList96 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList16, (java.util.Collection<java.util.Locale>) localeList93);
        java.util.Locale locale97 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList6, (java.util.Collection<java.util.Locale>) localeList96);
        java.util.List<java.util.Locale> localeList98 = java.util.Locale.filter(languageRangeList4, (java.util.Collection<java.util.Locale>) localeList96);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale99 = java.util.Locale.lookup(languageRangeList0, (java.util.Collection<java.util.Locale>) localeList96);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(languageRangeArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(languageRangeList14);
        org.junit.Assert.assertNotNull(languageRangeArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + filteringMode23 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode23.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(languageRangeArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + filteringMode33 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode33.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList34);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(strList39);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNotNull(languageRangeArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + filteringMode49 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode49.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList50);
        org.junit.Assert.assertNotNull(languageRangeArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + filteringMode59 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode59.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList60);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(strList65);
        org.junit.Assert.assertNull(str66);
        org.junit.Assert.assertNotNull(locale67);
        org.junit.Assert.assertEquals(locale67.toString(), "it");
        org.junit.Assert.assertNotNull(charSet68);
        org.junit.Assert.assertNotNull(locale70);
        org.junit.Assert.assertEquals(locale70.toString(), "");
        org.junit.Assert.assertEquals(locale72.toString(), "");
        org.junit.Assert.assertNotNull(locale73);
        org.junit.Assert.assertEquals(locale73.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale74);
        org.junit.Assert.assertEquals(locale74.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertNotNull(locale76);
        org.junit.Assert.assertEquals(locale76.toString(), "en");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertNotNull(locale78);
        org.junit.Assert.assertEquals(locale78.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale79);
        org.junit.Assert.assertEquals(locale79.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale80);
        org.junit.Assert.assertEquals(locale80.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale81);
        org.junit.Assert.assertEquals(locale81.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertNotNull(locale83);
        org.junit.Assert.assertEquals(locale83.toString(), "it");
        org.junit.Assert.assertNotNull(charSet84);
        org.junit.Assert.assertNotNull(locale85);
        org.junit.Assert.assertEquals(locale85.toString(), "it");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "italien" + "'", str86, "italien");
        org.junit.Assert.assertNotNull(locale87);
        org.junit.Assert.assertEquals(locale87.toString(), "fr");
        org.junit.Assert.assertNotNull(locale88);
        org.junit.Assert.assertEquals(locale88.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale89);
        org.junit.Assert.assertEquals(locale89.toString(), "it");
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "italien" + "'", str90, "italien");
        org.junit.Assert.assertNotNull(locale91);
        org.junit.Assert.assertEquals(locale91.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(localeArray92);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
        org.junit.Assert.assertNull(locale95);
        org.junit.Assert.assertNotNull(localeList96);
        org.junit.Assert.assertNull(locale97);
        org.junit.Assert.assertNotNull(localeList98);
    }

    @Test
    public void test17305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17305");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("         ITALIAN_italian_eNGLISH         ITALIAN_!IHitTAiT_ITALIAN_EgAish", "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test17306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17306");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "nglish ...hi!allemandItalienischallemanditalian_ITALIAN_EnglishallemandHI!allemandhi!allemandADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...allemand\\u0034allemandHI!allemandItalianallemand\\u0061allemand\\u0023allemandhi!allemandiTALIANallemandChinese(China)allemandhi!allemandzh_CNallemandiTALIANallemandenallemandItalienischhi!allemandItalienischallemanditalian_ITALIAN_EnglishallemandHI!allemandhi!allemandADAEAFAGAIALAMANAOA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test17307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17307");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("...", "ITALIAN_ITALIAN_ENGLISF");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "..." + "'", str2, "...");
    }

    @Test
    public void test17308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17308");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("##################    \\XTALXAN_ITALIAN_ENGLXSH    ###################", "r-FR");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test17309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17309");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("BGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGTALIAN", (int) (short) -1, 35);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test17310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17310");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r", "anau00", 97);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test17311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17311");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "hzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test17312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17312");
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
        java.util.Set<java.lang.String> strSet21 = locale0.getUnicodeLocaleKeys();
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
        org.junit.Assert.assertNotNull(strSet21);
    }

    @Test
    public void test17313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17313");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("                                                                                                 it", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              fr_C");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "it" + "'", str2, "it");
    }

    @Test
    public void test17314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17314");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('U', 111);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 111 + "'", int2 == 111);
    }

    @Test
    public void test17315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17315");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("ita", "r-FRAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ita" + "'", str2, "ita");
    }

    @Test
    public void test17316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17316");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase(" (italian,english)", "latIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIH");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test17317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17317");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace(" hi!       _\\U0020...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!_\\U0020..." + "'", str1, "hi!_\\U0020...");
    }

    @Test
    public void test17318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17318");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "....................................................................................... (italian,english)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test17319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17319");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "...                               ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test17320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17320");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("...u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069!IH\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\englisch", (int) 'l');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 99 + "'", int2 == 99);
    }

    @Test
    public void test17321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17321");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("1", 77);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                            1" + "'", str2, "                                                                            1");
    }

    @Test
    public void test17322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17322");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("\\u0029", "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu\\u0020", "         0         ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test17323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17323");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("BFIBGIBHIBIIBJIBLIBMIBNIBOIBQIBRIBSIBTIBVIBWIBYIBZICAICCICDICFICGICHICIICKICLICMICNICOICRICUICVICWICXICYICZIDEIDJIDKIDMIDOIDZIECIEEIEGIEHIERIESIETIFIIFJIFKIFMIFOIFRIGAIGBIGDIGEIGFIGGIGHIGIIGLIGMIGNIGPIGQIGRIGSIGTIGUIGWIGYIHKIH", "und-iTALIAN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "BFIBGIBHIBIIBJIBLIBMIBNIBOIBQIBRIBSIBTIBVIBWIBYIBZICAICCICDICFICGICHICIICKICLICMICNICOICRICUICVICWICXICYICZIDEIDJIDKIDMIDOIDZIECIEEIEGIEHIERIESIETIFIIFJIFKIFMIFOIFRIGAIGBIGDIGEIGFIGGIGHIGIIGLIGMIGNIGPIGQIGRIGSIGTIGUIGWIGYIHKIH" + "'", str2, "BFIBGIBHIBIIBJIBLIBMIBNIBOIBQIBRIBSIBTIBVIBWIBYIBZICAICCICDICFICGICHICIICKICLICMICNICOICRICUICVICWICXICYICZIDEIDJIDKIDMIDOIDZIECIEEIEGIEHIERIESIETIFIIFJIFKIFMIFOIFRIGAIGBIGDIGEIGFIGGIGHIGIIGLIGMIGNIGPIGQIGRIGSIGTIGUIGWIGYIHKIH");
    }

    @Test
    public void test17324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17324");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("Deutscd\\XTALXAN_ITALIAN_ENGLXSH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Deutscd\\XTALXAN_ITALIAN_ENGLXSH" + "'", str1, "Deutscd\\XTALXAN_ITALIAN_ENGLXSH");
    }

    @Test
    public void test17325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17325");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("", "\uc911\uad6d)", "9hhhhhhhhhh          ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test17326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17326");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "   \\U0034\\U00", (java.lang.CharSequence) "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzitalian (italian,english");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test17327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17327");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("gbr                                                                          ", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "gbr                                                                          " + "'", str2, "gbr                                                                          ");
    }

    @Test
    public void test17328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17328");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) 'b', 'a');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'b' + "'", char2 == 'b');
    }

    @Test
    public void test17329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17329");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Locale locale1 = java.util.Locale.ITALIAN;
        java.lang.String str3 = locale1.getExtension('h');
        java.lang.String str4 = locale0.getDisplayScript(locale1);
        java.util.Locale locale5 = locale0.stripExtensions();
        java.util.Locale locale6 = java.util.Locale.getDefault();
        java.lang.String str7 = locale6.getLanguage();
        java.lang.String str8 = locale0.getDisplayCountry(locale6);
        java.lang.Class<?> wildcardClass9 = locale0.getClass();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "fr" + "'", str7, "fr");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "France" + "'", str8, "France");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test17330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17330");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("Franz\366sischFranzosisch (Frankreich)uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "Italienisch#########################################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Franz\366sischFranzosisch (Frankreich)uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str2, "Franz\366sischFranzosisch (Frankreich)uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test17331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17331");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("!IH", "!IH");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray2);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "cCCCC...", 76, 29);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test17332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17332");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("           e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e           " + "'", str1, "                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e           ");
    }

    @Test
    public void test17333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17333");
        char[] charArray11 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray11);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny("HI!", charArray11);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\u0068", charArray11);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "!ih!ih!ih!ih!ih!ih!ih!ih!ih!ihtedesco    !ih!ih!ih!ih!ih!ih!ih!ih!ih!ih", charArray11);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\uc601\uc5b4                                                                                                  ", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4##a a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4##a a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4, #, #, a,  , a]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 37 + "'", int15 == 37);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test17334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17334");
        char[] charArray7 = new char[] { 'f', '4' };
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "Chinese (China)", charArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\u0061ItalifnischItalifnischItalifnischItalifnischItalifnischItalifnischItalifnischItalifnischItalif", charArray7);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "ADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhATzhAUzhAWzhAXzhAZzhBAzhBBzhBDzhBEzhBFzhBGzhBHzhBIzhBJzhBLzhBMzhBNzhBOzhBQzhBRzhBSzhBTzhBVzhBWzhBYzhBZzhCAzhCCzhCDzhCFzhCGzhCHzhCIzhCKzhCLzhCMzhCNzhCOzhCRzhCUzhCVzhCWzhCXzhCYzhCZzhDEzhDJzhDKzhDMzhDOzhDZzhECzhEEzhEGzhEHzhERzhESzhETzhFIzhFJzhFKzhFMzhFOzhFRzhGAzhGBzhGDzhGEzhGFzhGGzhGHzhGIzhGLzhGMzhGNzhGPzhGQzhGRzhGSzhGTzhGUzhGWzhGYzhHKzhHMzhHNzhHRzhHTzhHUzhIDzhIEzhILzhIMzhINzhIOzhIQzhIRzhISzhITzhJEzhJMzhJOzhJPzhKEzhKGzhKHzhKIzhKMzhKNzhKPzhKRzhKWzhKYzhKZzhLAzhLBzhLCzhLIzhLKzhLRzhLSzhLTzhLUzhLVzhLYzhMAzhMCzhMDzhMEzhMFzhMGzhMHzhMKzhMLzhMMzhMNzhMOzhMPzhMQzhMRzhMSzhMTzhMUzhMVzhMWzhMXzhMYzhMZzhNAzhNCzhNEzhNFzhNGzhNIzhNLzhNOzhNPzhNRzhNUzhNZzhOMzhPAzhPEzhPFzhPGzhPHzhPKzhPLzhPMzhPNzhPRzhPSzhPTzhPWzhPYzhQAzhREzhROzhRSzhRUzhRWzhSAzhSBzhSCzhSDzhSEzhSGzhSHzhSIzhSJzhSKzhSLzhSMzhSNzhSOzhSRzhSSzhSTzhSVzhSXzhSYzhSZzhTCzhTDzhTFzhTGzhTHzhTJzhTKzhTLzhTMzhTNzhTOzhTRzhTTzhTVzhTWzhTZzhUAzhUGzhUMzhUSzhUYzhUZzhVAzhVCzhVEzhVGzhVIzhVNzhVUzhWFzhWSzhYEzhYTzhZAzhZMzhZW", charArray7);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny("!_\\u0020_iTLE#####################################!_\\u0020_iTLE######################################", charArray7);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u0069", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "f4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "f4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[f, 4]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test17335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17335");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiAlpha('\u671d');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test17336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17336");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("fr_CA", "de", (int) 'H');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "fr_CA" + "'", str4, "fr_CA");
    }

    @Test
    public void test17337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17337");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("FRANZ\326SISCH\n(FRANKREICH)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "FRANZ\326SISCH\n(FRANKREICH)" + "'", str1, "FRANZ\326SISCH\n(FRANKREICH)");
    }

    @Test
    public void test17338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17338");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("Frnz\366sisch (Knd)", 11, 63);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test17339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17339");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("HI!HI     \\u005c", "FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAeeeeeeeeeeeex");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test17340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17340");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("ADHAEHAFHAGHAIHALHAMHANHAOHAQHARHASHATHAUHAWHAXHAZHBAHBBHBDHBEHBFHBGHBHHBIHBJHBLHBMHBNHBOHBQHBRHBSHBTHBVHBWHBYHBZHCAHCCHCDHCFHCGHCHHCIHCKHCLHCMHCNHCOHCRHCUHCVHCWHCXHCYHCZHDEHDJHDKHDMHDOHDZHECHEEHEGHEHHERHESHETHFIHFJHFKHFMHFOHFRHGAHGBHGDHGEHGFHGGHGHHGIHGLHGMHGNHGPHGQHGRHGSHGTHGUHGWHGYHHKHHMHHNHHRHHTHHUHIDHIEHILHIMHINHIOHIQHIRHISHITHJEHJMHJOHJPHKEHKGHKHHKIHKMHKNHKPHKRHKWHKYHKZHLAHLBHLCHLIHLKHLRHLSHLTHLUHLVHLYHMAHMCHMDHMEHMFHMGHMHHMKHMLHMMHMNHMOHMPHMQHMRHMSHMTHMUHMVHMWHMXHMYHMZHNAHNCHNEHNFHNGHNIHNLHNOHNPHNRHNUHNZHOMHPAHPEHPFHPGHPHHPKHPLHPMHPNHPRHPSHPTHPWHPYHQAHREHROHRSHRUHRWHSAHSBHSCHSDHSEHSGHSHHSIHSJHSKHSLHSMHSNHSOHSRHSSHSTHSVHSXHSYHSZHTCHTDHTFHTGHTHHTJHTKHTLHTMHTNHTOHTRHTTHTVHTWHTZHUAHUGHUMHUSHUYHUZHVAHVCHVEHVGHVIHVNHVUHWFHWSHYEHYTHZAHZMHZW", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=adhaehafhaghaihalhamhanhaohaqharhashathauhawhaxhazhbahbbhbdhbehbfhbghbhhbihbjhblhbmhbnhbohbqhbrhbshbthbvhbwhbyhbzhcahcchcdhcfhcghchhcihckhclhcmhcnhcohcrhcuhcvhcwhcxhcyhczhdehdjhdkhdmhdohdzhecheeheghehherheshethfihfjhfkhfmhfohfrhgahgbhgdhgehgfhgghghhgihglhgmhgnhgphgqhgrhgshgthguhgwhgyhhkhhmhhnhhrhhthhuhidhiehilhimhinhiohiqhirhishithjehjmhjohjphkehkghkhhkihkmhknhkphkrhkwhkyhkzhlahlbhlchlihlkhlrhlshlthluhlvhlyhmahmchmdhmehmfhmghmhhmkhmlhmmhmnhmohmphmqhmrhmshmthmuhmvhmwhmxhmyhmzhnahnchnehnfhnghnihnlhnohnphnrhnuhnzhomhpahpehpfhpghphhpkhplhpmhpnhprhpshpthpwhpyhqahrehrohrshruhrwhsahsbhschsdhsehsghshhsihsjhskhslhsmhsnhsohsrhsshsthsvhsxhsyhszhtchtdhtfhtghthhtjhtkhtlhtmhtnhtohtrhtthtvhtwhtzhuahughumhushuyhuzhvahvchvehvghvihvnhvuhwfhwshyehythzahzmhzw");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17341");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "I");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test17342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17342");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("!ih                            dalleman");
        java.lang.String str2 = locale1.getLanguage();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test17343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17343");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED..");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED.." + "'", str1, "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED..");
    }

    @Test
    public void test17344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17344");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "444444444it", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test17345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17345");
        char[] charArray8 = new char[] { ' ', '4' };
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!", charArray8);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray8);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "h", charArray8);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "44444444444444NAILATI44444444444444", charArray8);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "zh_CN", charArray8);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "             ", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test17346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17346");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("ti");
        java.util.Locale locale4 = new java.util.Locale("\\u005c");
        java.util.Locale locale6 = java.util.Locale.CHINESE;
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.lowerCase("Franz\366sisch (Frankreich)", locale6);
        java.lang.String str8 = locale6.getVariant();
        java.lang.String str9 = locale4.getDisplayScript(locale6);
        java.lang.String str11 = locale4.getExtension('C');
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder0.setLocale(locale4);
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: \\u005c [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertEquals(locale4.toString(), "\\u005c");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "franz\366sisch (frankreich)" + "'", str7, "franz\366sisch (frankreich)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test17347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17347");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "                         fran\347                          ", (java.lang.CharSequence) "ITALIENISC");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 56 + "'", int2 == 56);
    }

    @Test
    public void test17348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17348");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "aDAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aDAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED..." + "'", str1, "aDAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...");
    }

    @Test
    public void test17349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17349");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("hi!        (\\U0020,Italienisch#########################################################################################", "", "UND");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test17350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17350");
        java.util.Locale locale2 = new java.util.Locale("u", "Franz\366sischFranzosisch (Frankreich)kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk");
        org.junit.Assert.assertEquals(locale2.toString(), "u_FRANZ\366SISCHFRANZOSISCH (FRANKREICH)KKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKK");
    }

    @Test
    public void test17351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17351");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("    IIIIIIIIII...........................");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=iiiiiiiiii...........................");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17352");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("                                                                    \\U0020ItalianItalianItalianItali", "                                                                                     g             e");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test17353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17353");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale locale4 = builder3.build();
        java.lang.Object obj5 = locale4.clone();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "");
    }

    @Test
    public void test17354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17354");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("", "                                             \\u0066                                              ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test17355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17355");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("fr-CAfr-CAfr-C8600u\\fr-CAfr-CAfr-CAfr-CAfr-CAfr-C8600u\\fr-CAffr-CAfr-CAfr-C8600u\\fr-CAfr-CAfr-CAfr-CAfr-CAfr-C8600u\\fr-CAf", "                          \\u0046");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test17356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17356");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("und", "BFIBGIBHIBIIBJIBLIBMIBNIBOIBQIBRIBSIBTIBVIBWIBYIBZICAICCICDICFICGICHICIICKICLICMICNICOICRICUICVICWICXICYICZIDEIDJIDKIDMIDOIDZIECIEEIEGIEHIERIESIETIFIIFJIFKIFMIFOIFRIGAIGBIGDIGEIGFIGGIGHIGIIGLIGMIGNIGPIGQIGRIGSIGTIGUIGWIGYIHKIHM");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "und" + "'", str2, "und");
    }

    @Test
    public void test17357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17357");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("inglesehhhhhhhhhenglisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)englisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)englisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)englisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)englisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)englisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)en", 71);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "inglesehhhhhhhhhenglisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC" + "'", str2, "inglesehhhhhhhhhenglisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
    }

    @Test
    public void test17358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17358");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder2.setScript("");
        java.util.Locale.Builder builder5 = builder2.clear();
        java.util.Locale.Builder builder6 = builder5.clear();
        java.util.Locale locale7 = java.util.Locale.CHINA;
        java.util.Locale locale8 = locale7.stripExtensions();
        java.util.Locale.Builder builder9 = builder5.setLocale(locale7);
        java.util.Set<java.lang.Character> charSet10 = locale7.getExtensionKeys();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(charSet10);
    }

    @Test
    public void test17359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17359");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("\\u000d", "\\u0047");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u000d" + "'", str2, "\\u000d");
    }

    @Test
    public void test17360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17360");
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
        java.util.Locale locale30 = java.util.Locale.ITALY;
        java.lang.String str31 = locale30.getScript();
        java.lang.String str32 = locale30.getDisplayCountry();
        boolean boolean33 = locale30.hasExtensions();
        java.util.Locale.setDefault(locale30);
        boolean boolean35 = locale30.hasExtensions();
        java.lang.String str36 = locale30.getISO3Country();
        java.lang.String str37 = locale5.getDisplayScript(locale30);
        java.lang.String str38 = locale30.getISO3Country();
        java.lang.String str39 = locale30.getCountry();
        java.lang.String str40 = locale30.getISO3Language();
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
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Italian" + "'", str9, "Italian");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "it");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "it" + "'", str14, "it");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Italian" + "'", str15, "Italian");
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "fr_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "French (Canada)" + "'", str19, "French (Canada)");
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
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
// flaky:         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Italy" + "'", str32, "Italy");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "ITA" + "'", str36, "ITA");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "ITA" + "'", str38, "ITA");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "IT" + "'", str39, "IT");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "ita" + "'", str40, "ita");
    }

    @Test
    public void test17361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17361");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("44444444444444444444444444444444!IHaaaaaaaaaaaaaaaaaaaaaaaaFranz\366sisch (Frankreich)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "Hi!        Italienisch italian_ITALIAN_English HI! hi! ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED... \\u0034 HI! Italian \\u0061 \\u0023 hi! iTALIAN Chinese (China) hi! zh_CN iTALIAN en Italienisch");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test17362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17362");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "de-de", (java.lang.CharSequence) "         HITALIANH_HitalianH_HeHNGLISH");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test17363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17363");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("Korean", "IXII");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test17364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17364");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("francese (Canada)", "ITALIANITALIAN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "francese (Canada)" + "'", str2, "francese (Canada)");
    }

    @Test
    public void test17365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17365");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "...u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069!IH\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\englisc");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test17366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17366");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       " + "'", str1, "HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       ");
    }

    @Test
    public void test17367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17367");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069!IH\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\", "", (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test17368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17368");
        char[] charArray6 = new char[] { ' ', '4' };
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!", charArray6);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "u", charArray6);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "francese", charArray6);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "ZH_CNGGGGG", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test17369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17369");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("\\u002e", 0, 67);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test17370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17370");
        java.lang.String str1 = org.apache.commons.lang3.CharUtils.unicodeEscaped('b');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u0062" + "'", str1, "\\u0062");
    }

    @Test
    public void test17371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17371");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("Frnz\366sisch (Knd)", "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rFRANZ...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test17372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17372");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIITALIAN_ITALIAN_ENGLISHIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test17373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17373");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("                                  !ih                            dalleman", "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz\\u0065");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test17374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17374");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("x", "#####################################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test17375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17375");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("h (HHHHHHHHH,CV CW CX CY CZ DE DJ DK DM DO DZ EC EE EG EH ER ES ET FI FJ FK)", "44444444444\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITALHcsineilatI444444444444", "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC\\u00de\\u00CCCCCCCCCCCCCCCCCCCCCCCCC...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "h (CCCCCCCCC,CV CW CX CY CZ DE DJ DK DM DO DZ EC EE EG EC ER ES EC FC FJ FK)" + "'", str3, "h (CCCCCCCCC,CV CW CX CY CZ DE DJ DK DM DO DZ EC EE EG EC ER ES EC FC FJ FK)");
    }

    @Test
    public void test17376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17376");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("FRFRFRFRFRFRFRFRFRFRFRFRFde_DEFRFRFRFRFRFRFRFRFRFRFRFRFR", (int) 'g', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "FRFRFRFRFRFRFRFRFRFRFRFRFde_DEFRFRFRFRFRFRFRFRFRFRFRFRFR###############################################" + "'", str3, "FRFRFRFRFRFRFRFRFRFRFRFRFde_DEFRFRFRFRFRFRFRFRFRFRFRFRFR###############################################");
    }

    @Test
    public void test17377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17377");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("RRRRRRRRRRRRRR...       g                     ...RRRRRRRRRRRRRRR", "\\U0034\\U00 HCSTUD \\U0034");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "RRRRRRRRRRRRRR...       g                     ...RRRRRRRRRRRRRRR" + "'", str2, "RRRRRRRRRRRRRR...       g                     ...RRRRRRRRRRRRRRR");
    }

    @Test
    public void test17378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17378");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("\\U0066", 9);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " \\U0066  " + "'", str2, " \\U0066  ");
    }

    @Test
    public void test17379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17379");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "hsiAgE_NAILATI_TiATtiHI!_NAILATI         HSILGNe_nailati_NAILATI         HHHHHHHHH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test17380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17380");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase(" NAILATI             ", "Italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test17381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17381");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("\ub3c5\uc77c\uc5b4", '#');
        java.lang.String[] strArray4 = null;
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.replaceEach("", strArray3, strArray4);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test17382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17382");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("########################################################################################", "cHINESISCH (cHINA)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "########################################################################################" + "'", str2, "########################################################################################");
    }

    @Test
    public void test17383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17383");
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
            java.util.Locale.Builder builder12 = builder9.setUnicodeLocaleKeyword("NAILAT", "00000000000000coreen (Coree du Sud");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: NAILAT [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "francese (Canada)" + "'", str3, "francese (Canada)");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test17384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17384");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCcinese (cina)u0069h..CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC", "2IT HI!       _\\U0020_ITALIENISCH####################################################################            2I");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test17385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17385");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("italian (italian,english                                                                    ", 21);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "italian (italian,e..." + "'", str2, "italian (italian,e...");
    }

    @Test
    public void test17386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17386");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("z...", "german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)", (int) '0');
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test17387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17387");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("h########################################################################################", "2CINESE (CINA)ITALIANITALIANITALIANITAL");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h########################################################################################" + "'", str2, "h########################################################################################");
    }

    @Test
    public void test17388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17388");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "44d444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test17389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17389");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("talian_ITALIAN_English", "ecanadaGcanadacanadaSH", "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!frankreich!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "t!li!!_ITALIAN_E!glish" + "'", str3, "t!li!!_ITALIAN_E!glish");
    }

    @Test
    public void test17390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17390");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("5555555555", "an\\u00", 6);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test17391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17391");
        java.util.Locale locale2 = java.util.Locale.forLanguageTag("France");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.lowerCase("Frankreich", locale2);
        java.lang.String str4 = locale2.getCountry();
        java.util.Locale.Builder builder5 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder6 = builder5.clear();
        java.util.Locale.Builder builder7 = builder5.clear();
        java.util.Locale.Builder builder8 = builder7.clear();
        java.util.Locale locale9 = java.util.Locale.CANADA;
        java.lang.String str10 = locale9.getISO3Country();
        java.util.Locale.Builder builder11 = builder8.setLocale(locale9);
        boolean boolean12 = locale9.hasExtensions();
        java.lang.String str13 = locale9.getDisplayCountry();
        java.lang.String str14 = locale9.toLanguageTag();
        java.lang.String str15 = locale2.getDisplayCountry(locale9);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "france");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "frankreich" + "'", str3, "frankreich");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "CAN" + "'", str10, "CAN");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Canada" + "'", str13, "Canada");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "en-CA" + "'", str14, "en-CA");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test17392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17392");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("\u6cd5\u56fd", 5);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test17393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17393");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("4444444444444444444444444444444444444             DE_DE            44444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444444444444444             DE_DE            44444444444444444444444444444444444444" + "'", str1, "4444444444444444444444444444444444444             DE_DE            44444444444444444444444444444444444444");
    }

    @Test
    public void test17394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17394");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("tedesco");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "tedesco" + "'", str1, "tedesco");
    }

    @Test
    public void test17395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17395");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("fr-cafr-cafr-c8600u\\fr-cafr-cafr-caEEEEEE", "FR-FR", 120);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test17396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17396");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("x-lvariant-CAN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "x-lvariant-can" + "'", str1, "x-lvariant-can");
    }

    @Test
    public void test17397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17397");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("itTAiT_ITALIAN_EgAish                                                                                ", '\u6cd5');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'i' + "'", char2 == 'i');
    }

    @Test
    public void test17398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17398");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("EFrankreichgFrankreichFrankreichsEFrankreicundEFrankreichgFrankreichFrankreichsEFrankreich", "ranzosisch (Frankreich)kkkkkkkkkkkkkkkkkkk...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test17399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17399");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "Franzosisch (Kanada)", (java.lang.CharSequence) "inglesehhhhhhhhHITTAIT_ITALIAN_EGAISH          ");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "Franzosisch (Kanada)" + "'", charSequence2, "Franzosisch (Kanada)");
    }

    @Test
    public void test17400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17400");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("EEEEEEEEEFRAEEEEEEEEECCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEnglischCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC", "ITA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test17401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17401");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("AzhzhzhzhzhzhzhzhzhzhADAAEAAFAAGAAIAALAAMAANAAOAAQAARAASAATAAUAAWAAXAAZABAABBhcstueDNABOABQABRABSABTABVABWABYABZACAACCACDACFACGACHACIACKACLACMACNACOACRACUACVACWACXACYACZADEADJADKADMADOADZAECAEEAEGAEHAERAESAETAFIAFJAFKAFMAFOAFRAGAAGBAGDAGEAGFAGGAGHAGIAGLAGMAGNAGPAGQAGRAGSAGTAGUAGWAGYAHKAHMAHNAHRAHTAHUAIDAIEAILAIMAINAIOAIQAIRAISAITAJEAJMAJOAJPAKEAKGAKHAKIAKMAKNAKPAKRAKWAKYAKZALAALBALCALIALKALRALSALTALUALVALYAMAAMCAMDAMEAMFAMGAMHAMKAMLAMMAMNAMOAMPAMQAMRAMSAMTAMUAMVAMWAMXAMYAMZANAANCANEANFANGANIANLANOANPANRANUANZAOMAPAAPEAPFAPGAPHAPKAPLAPMAPNAPRAPSAPTAPWAPYAQAAREAROARSARUARWASAASBASCASDASEASGASHASIASJASKASLASMASNASOASRASSASTASVASXASYASZATCATDATFATGATHATJATKATLATMATNATOATRATTATVATWATZAUAAUGAUMAUSAUYAUZAVAAVCAVEAVGAVIAVNAVUAWFAWSAYEAYTAZAAZMAZW", 62, "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUU\\u0030UUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AzhzhzhzhzhzhzhzhzhzhADAAEAAFAAGAAIAALAAMAANAAOAAQAARAASAATAAUAAWAAXAAZABAABBhcstueDNABOABQABRABSABTABVABWABYABZACAACCACDACFACGACHACIACKACLACMACNACOACRACUACVACWACXACYACZADEADJADKADMADOADZAECAEEAEGAEHAERAESAETAFIAFJAFKAFMAFOAFRAGAAGBAGDAGEAGFAGGAGHAGIAGLAGMAGNAGPAGQAGRAGSAGTAGUAGWAGYAHKAHMAHNAHRAHTAHUAIDAIEAILAIMAINAIOAIQAIRAISAITAJEAJMAJOAJPAKEAKGAKHAKIAKMAKNAKPAKRAKWAKYAKZALAALBALCALIALKALRALSALTALUALVALYAMAAMCAMDAMEAMFAMGAMHAMKAMLAMMAMNAMOAMPAMQAMRAMSAMTAMUAMVAMWAMXAMYAMZANAANCANEANFANGANIANLANOANPANRANUANZAOMAPAAPEAPFAPGAPHAPKAPLAPMAPNAPRAPSAPTAPWAPYAQAAREAROARSARUARWASAASBASCASDASEASGASHASIASJASKASLASMASNASOASRASSASTASVASXASYASZATCATDATFATGATHATJATKATLATMATNATOATRATTATVATWATZAUAAUGAUMAUSAUYAUZAVAAVCAVEAVGAVIAVNAVUAWFAWSAYEAYTAZAAZMAZW" + "'", str3, "AzhzhzhzhzhzhzhzhzhzhADAAEAAFAAGAAIAALAAMAANAAOAAQAARAASAATAAUAAWAAXAAZABAABBhcstueDNABOABQABRABSABTABVABWABYABZACAACCACDACFACGACHACIACKACLACMACNACOACRACUACVACWACXACYACZADEADJADKADMADOADZAECAEEAEGAEHAERAESAETAFIAFJAFKAFMAFOAFRAGAAGBAGDAGEAGFAGGAGHAGIAGLAGMAGNAGPAGQAGRAGSAGTAGUAGWAGYAHKAHMAHNAHRAHTAHUAIDAIEAILAIMAINAIOAIQAIRAISAITAJEAJMAJOAJPAKEAKGAKHAKIAKMAKNAKPAKRAKWAKYAKZALAALBALCALIALKALRALSALTALUALVALYAMAAMCAMDAMEAMFAMGAMHAMKAMLAMMAMNAMOAMPAMQAMRAMSAMTAMUAMVAMWAMXAMYAMZANAANCANEANFANGANIANLANOANPANRANUANZAOMAPAAPEAPFAPGAPHAPKAPLAPMAPNAPRAPSAPTAPWAPYAQAAREAROARSARUARWASAASBASCASDASEASGASHASIASJASKASLASMASNASOASRASSASTASVASXASYASZATCATDATFATGATHATJATKATLATMATNATOATRATTATVATWATZAUAAUGAUMAUSAUYAUZAVAAVCAVEAVGAVIAVNAVUAWFAWSAYEAYTAZAAZMAZW");
    }

    @Test
    public void test17402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17402");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAscii('7');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test17403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17403");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("NNNNNNNNNNNNNNNNNN                                                                                 ", "it-IT");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test17404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17404");
        java.util.Locale locale1 = java.util.Locale.JAPANESE;
        java.lang.String str2 = locale1.getISO3Country();
        java.lang.String str3 = locale1.getVariant();
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.upperCase("it", locale1);
        java.lang.String str5 = locale1.toString();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "IT" + "'", str4, "IT");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ja" + "'", str5, "ja");
    }

    @Test
    public void test17405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17405");
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
            java.util.Locale.Builder builder16 = builder7.setLanguageTag("0034\\U00");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: 0034\\U00 [at index 0]");
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
    public void test17406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17406");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder6 = builder1.setLanguage("und");
        java.util.Locale locale7 = builder6.build();
        java.util.Locale.Builder builder9 = builder6.setLanguage("fr");
        java.util.Locale.Builder builder10 = builder6.clearExtensions();
        java.util.Locale locale11 = builder10.build();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "francese (Canada)" + "'", str3, "francese (Canada)");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "und_CA");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "fr_CA");
    }

    @Test
    public void test17407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17407");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("talian\\u0032talian", (double) 374);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=374.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17408");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("\\u0054", "aTWaTZaUAaUGaUMaUSaUYaUZaVAaVCaVEaVGaVIaVNaVUaWFaWSaYEaYTaZAaZMaZW", "royaume-uni");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test17409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17409");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("\\\\\\\\\\\\\\\\\\\\\\\\kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkDEkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk\\\\\\\\\\\\\\\\\\\\\\\\");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\\\\\\\\\\\\\\\\\\\\\\\kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkDEkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk\\\\\\\\\\\\\\\\\\\\\\\\" + "'", str1, "\\\\\\\\\\\\\\\\\\\\\\\\kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkDEkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk\\\\\\\\\\\\\\\\\\\\\\\\");
    }

    @Test
    public void test17410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17410");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("ranzosisch (Frankreich)kkkkkkkkkkkkkkkkkkk...ranzosisch (Frankreich)kkkkkkkkkk\n");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ranzosisch (Frankreich)kkkkkkkkkkkkkkkkkkk...ranzosisch (Frankreich)kkkkkkkkkk" + "'", str1, "ranzosisch (Frankreich)kkkkkkkkkkkkkkkkkkk...ranzosisch (Frankreich)kkkkkkkkkk");
    }

    @Test
    public void test17411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17411");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiAlphanumeric('7');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test17412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17412");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("iTALIAN (ITALIAN,ENGLISH", (int) 'E');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test17413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17413");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("iTALIAN_italian_eNGLISHITALIAN_!IHitTAiT_ITALIAN_EgAish", "AGAASHuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test17414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17414");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "hi! allemandtalienischallemanditalian_TALAN_Eng \\ ADAEAFAGAALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCCKCLCMCNCOCRCUCVCWCXCYCZDED...allemand\\u0034allemandH!allemandtalianallemand\\u0061allemand\\u0023allemandhi!allemandiTALANallemandChinese (China)allemandhi!allemandzh_CNallemandiTALANallemandenallemandtalienisch");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 347 + "'", int1 == 347);
    }

    @Test
    public void test17415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17415");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("!ih                            dalleman!ih                            dalleman!ih                          ", "               Deutschland", (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test17416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17416");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "f_KOREAN", (java.lang.CharSequence) "ITALIENISC");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test17417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17417");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("r-FRAAAAAAAAAAAAAAAAAAAAAAAAAAA", "ITTAIT_ITALIAN_EGAISHI!_\\U0020_ITLE###########");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test17418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17418");
        java.util.Locale locale1 = java.util.Locale.ENGLISH;
        java.lang.String str2 = locale1.getDisplayLanguage();
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.upperCase("!IH", locale1);
        java.util.Set<java.lang.Character> charSet4 = locale1.getExtensionKeys();
        java.util.Set<java.lang.String> strSet5 = locale1.getUnicodeLocaleAttributes();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "English" + "'", str2, "English");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!IH" + "'", str3, "!IH");
        org.junit.Assert.assertNotNull(charSet4);
        org.junit.Assert.assertNotNull(strSet5);
    }

    @Test
    public void test17419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17419");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("NAILAT", "                                        #u##2#iTALIANiTALIANiTALIANiT");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NAILAT" + "'", str2, "NAILAT");
    }

    @Test
    public void test17420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17420");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("e             HCSINEILATI             g             HCSINEILATI                          HCSINEILATI             sh", 224, 73);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...       HCSINEILATI                          HCSINEILATI             sh" + "'", str3, "...       HCSINEILATI                          HCSINEILATI             sh");
    }

    @Test
    public void test17421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17421");
        java.util.Locale locale2 = new java.util.Locale("nglish ...nglish ...nglish ...nglichinoisf(Chine)", "\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITALHcsineilatI");
        org.junit.Assert.assertEquals(locale2.toString(), "nglish ...nglish ...nglish ...nglichinoisf(chine)_\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITALHCSINEILATI");
    }

    @Test
    public void test17422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17422");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder5 = builder1.clear();
        java.util.Locale.Builder builder6 = builder5.clear();
        java.util.Locale.Builder builder8 = builder5.setLanguage("zh");
        java.util.Locale.Builder builder9 = builder8.clear();
        java.util.Locale locale10 = java.util.Locale.GERMAN;
        java.util.Locale locale11 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str12 = locale10.getDisplayName(locale11);
        java.util.Locale locale13 = locale10.stripExtensions();
        java.lang.String str14 = locale13.toLanguageTag();
        java.lang.String str15 = locale13.getISO3Language();
        java.util.Locale.Builder builder16 = builder8.setLocale(locale13);
        java.util.Locale.Builder builder17 = builder16.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder19 = builder17.setScript("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         italian_ITALIAN_EnglisF");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script:                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          italian_ITALIAN_EnglisF [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "French (Canada)" + "'", str3, "French (Canada)");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "de");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "allemand" + "'", str12, "allemand");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "de");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "de" + "'", str14, "de");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "deu" + "'", str15, "deu");
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder17);
    }

    @Test
    public void test17423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17423");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("CAN", 27);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CAN" + "'", str2, "CAN");
    }

    @Test
    public void test17424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17424");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("!_\\U0020_Itle", "cinese (Cina)\\u0069h...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!_\\U0020_Itle" + "'", str2, "!_\\U0020_Itle");
    }

    @Test
    public void test17425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17425");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rFRANZ\326SISCH\n(FRANKREICH)\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test17426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17426");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.getDefault(category0);
        java.util.Locale locale3 = java.util.Locale.getDefault(category0);
        java.util.Locale locale4 = java.util.Locale.getDefault(category0);
        java.util.Locale locale5 = java.util.Locale.getDefault(category0);
        java.lang.String str6 = locale5.getISO3Country();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
// flaky:         org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(locale3);
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(locale5);
// flaky:         org.junit.Assert.assertEquals(locale5.toString(), "");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test17427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17427");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("", (int) (short) -1, 30);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test17428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17428");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "Frnz\366sisch(Knd)", (java.lang.CharSequence) "AhzRAhzQAhzOAhzNAh");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test17429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17429");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "HHHHHHHHHH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test17430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17430");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("LIAN_EgAish                                 \\u0068");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=lian_egaish\\u0068");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17431");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("Italian");
        java.util.Locale locale4 = java.util.Locale.PRC;
        java.lang.String str5 = locale4.getDisplayName();
        java.util.Locale.Builder builder6 = builder0.setLocale(locale4);
        java.util.Locale.Builder builder8 = builder6.removeUnicodeLocaleAttribute("china");
        java.util.Locale.Builder builder9 = builder8.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder9.removeUnicodeLocaleAttribute("Cor\351eduSud");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: Core?eduSud [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Chinese (China)" + "'", str5, "Chinese (China)");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test17432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17432");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder6 = builder1.setLanguage("und");
        java.util.Locale locale7 = builder6.build();
        java.util.Locale locale8 = builder6.build();
        java.lang.Object obj9 = null;
        boolean boolean10 = locale8.equals(obj9);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "French (Canada)" + "'", str3, "French (Canada)");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "und_CA");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "und_CA");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test17433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17433");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("it hi!       _\\U0020...T hi!       _\\U0020...Ai hi!       _\\U0020...T hi!       _\\U0020..._ hi!       _\\U0020...ITA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "it hi!       _\\U0020...T hi!       _\\U0020...Ai hi!       _\\U0020...T hi!       _\\U0020..._ hi!       _\\U0020...ITA" + "'", str1, "it hi!       _\\U0020...T hi!       _\\U0020...Ai hi!       _\\U0020...T hi!       _\\U0020..._ hi!       _\\U0020...ITA");
    }

    @Test
    public void test17434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17434");
        java.util.Locale locale2 = new java.util.Locale("zhAzhzhzhzhzhzhzhzhzhzh", "und-CA");
        java.lang.String str3 = locale2.toString();
        org.junit.Assert.assertEquals(locale2.toString(), "zhazhzhzhzhzhzhzhzhzhzh_UND-CA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zhazhzhzhzhzhzhzhzhzhzh_UND-CA" + "'", str3, "zhazhzhzhzhzhzhzhzhzhzh_UND-CA");
    }

    @Test
    public void test17435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17435");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "HARZHASZHAZHZHZHZHZHZHZHZHZHZ", "########################################################################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test17436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17436");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("\\u0075 (AD4AE4AF4AG4AI4AL4AM4AN4AO4AQ4AR4AS4AT4AU4AW4AX4AZ4BA4BB4BD4BE4BF4BG4BH4BI4BJ4BL4BM4BN4BO4BQ4BR4BS4BT4BV4BW4BY4BZ4CA4CC4CD4CF4CG4CH4CI4CK4CL4CM4CN4CO4CR4CU4CV4CW4CX4CY4CZ4DE4DJ4DK4DM4DO4DZ4EC4EE4EG4EH4ER4ES4ET4FI4FJ4FK4FM4FO4FR4GA4GB4GD4GE4GF4GG4GH4GI4GL4GM4GN4GP4GQ4GR4GS4GT4GU4GW4GY4HK4HM4HN4HR4HT4HU4ID4IE4IL4IM4IN4IO4IQ4IR4IS4IT4JE4JM4JO4JP4KE4KG4KH4KI4KM4KN4KP4KR4KW4KY4KZ4LA4LB4LC4LI4LK4LR4LS4LT4LU4LV4LY4MA4MC4MD4ME4MF4MG4MH4MK4ML4MM4MN4MO4MP4MQ4MR4MS4MT4MU4MV4MW4MX4MY4MZ4NA4NC4NE4NF4NG4NI4NL4NO4NP4NR4NU4NZ4OM4PA4PE4PF4PG4PH4PK4PL4PM4PN4PR4PS4PT4PW4PY4QA4RE4RO4RS4RU4RW4SA4SB4SC4SD4SE4SG4SH4SI4SJ4SK4SL4SM4SN4SO4SR4SS4ST4SV4SX4SY4SZ4TC4TD4TF4TG4TH4TJ4TK4TL4TM4TN4TO4TR4TT4TV4TW4TZ4UA4UG4UM4US4UY4UZ4VA4VC4VE4VG4VI4VN4VU4WF4WS4YE4YT4ZA4ZM4ZW,ITALIAN,italian,eNGLISH         ITALIAN,!IHitTAiT,ITALIAN,EgAish)", (int) '\n', 19);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4AE4AF4AG4AI4AL4AM4" + "'", str3, "4AE4AF4AG4AI4AL4AM4");
    }

    @Test
    public void test17437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17437");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("hi!       ");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "E             g                                                                                     ");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test17438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17438");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUU\\u0030UUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test17439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17439");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("44d48600u\\", "ENGLISH", "fffffffffffffYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERfffffffffffff");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test17440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17440");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("emand", 44);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test17441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17441");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder6 = builder1.setLanguage("und");
        java.util.Locale locale7 = builder6.build();
        java.lang.String str8 = locale7.getDisplayScript();
        java.lang.String str9 = locale7.getDisplayCountry();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = locale7.getExtension('5');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: 5");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Canada" + "'", str9, "Canada");
    }

    @Test
    public void test17442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17442");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("44444444444444444444444444444444!IHaaaaaaaaaaaaaaaaaaaaaaaaFranz\366sisch (Frankreich)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (int) (short) 100, 118);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaa");
    }

    @Test
    public void test17443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17443");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder6 = builder1.setLanguage("und");
        java.util.Locale locale7 = builder6.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder6.setVariant("ititaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaiitalianititaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitai");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: ititaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaiitalianititaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitai [at index 0]");
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
    }

    @Test
    public void test17444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17444");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("#", "f_KOREAN", 113);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test17445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17445");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "cCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEnglischCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test17446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17446");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("Italia", "HI!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test17447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17447");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("erma (ermay)                                                 TALIAN                                                  ", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "erma (ermay)                                                 TALIAN                                                  " + "'", str2, "erma (ermay)                                                 TALIAN                                                  ");
    }

    @Test
    public void test17448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17448");
        java.util.Locale locale1 = new java.util.Locale("                ita                ");
        org.junit.Assert.assertEquals(locale1.toString(), "                ita                ");
    }

    @Test
    public void test17449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17449");
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
        java.util.Locale.Builder builder16 = builder12.setExtension('h', "Italian");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder18 = builder16.setVariant("44444444444444ITALIAN44444444444444");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: 44444444444444ITALIAN44444444444444 [at index 0]");
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
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test17450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17450");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("cCCC\\CCCC", "\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069!IH\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\", "Chinese (China)                                                                                                           ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "cCCC\\CCCC" + "'", str3, "cCCC\\CCCC");
    }

    @Test
    public void test17451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17451");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("NC_HZ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "NC_H" + "'", str1, "NC_H");
    }

    @Test
    public void test17452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17452");
        java.lang.String str1 = org.apache.commons.lang3.CharUtils.toString((java.lang.Character) 'D');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "D" + "'", str1, "D");
    }

    @Test
    public void test17453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17453");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("gERMAN (gERMANY)", 65);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test17454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17454");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("8600u\\                                 hsiAgE_NAILATI_TiATti                                        ", "##################    \\XTALXAN_ITALIAN_ENGLXSH    ###################", "tit");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "8600u\\                                 hsiAgE_NAILATI_TiATti                                        " + "'", str3, "8600u\\                                 hsiAgE_NAILATI_TiATti                                        ");
    }

    @Test
    public void test17455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17455");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("South Korea", "       DE_DE            ", 37);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test17456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17456");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace(" ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test17457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17457");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rZH_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rZH_CN" + "'", str1, "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rZH_CN");
    }

    @Test
    public void test17458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17458");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("CCCCCCIAN\\U0020ICCCCCCC", (double) 118);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=118.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17459");
        char[] charArray6 = new char[] { ' ' };
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsAny("                                                                                                    ", charArray6);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "Canada", charArray6);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u0052", charArray6);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aE", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[ ]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test17460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17460");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiitalian_ITALIAN_Englishiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii", "\\u0034");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiitalian_ITALIAN_Englishiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii" + "'", str2, "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiitalian_ITALIAN_Englishiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
    }

    @Test
    public void test17461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17461");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("Italian");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.concatWith("DE\rDJ\rDK\rDM\rDO\rDZ\rEC\rEE\rEG\rEH\rER\rES\rET\rFI\rFJ\rFK\rFM\rFO\rFR\rGA\rGB\rGD\rGE\rGF\rGG\rGH\rGI\rGL\rGM\rGN\rGP\rGQ", (java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Italian" + "'", str3, "Italian");
    }

    @Test
    public void test17462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17462");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("    IIIIIIIIII");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "IIIIIIIIII" + "'", str1, "IIIIIIIIII");
    }

    @Test
    public void test17463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17463");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("\\XTALXAN_ITALIAN_ENGLXSHRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR", (int) 'N', (int) 'G');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test17464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17464");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("\\u0020iItalian\\u008600u\\\\atalaaa_ITALIAN_Eaglaaa\\u0020iItalian\\u008600u\\U", "francese (Francia)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test17465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17465");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByCharacterType("HI!       ");
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiitalian_ITALIAN_Englishiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii", strArray4);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.startsWithAny("Franz\366sisch (Frankreich)", strArray4);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny("8300u\\", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test17466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17466");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("FgenceFgenceFgenceFgenceFgenceFgenceFgenceFgenceFgenceFgenceFgenceFgenceFgenceFgenceFgenceFgenceFgenceFgenceFgenceFgenceFgenceFgenceFgenceFgenceFgenceFgenceFgenceFgenceFgenceFgenceFgenceFgenceFgenceFgenceFgenceFgenceFgenceFgenceFgenceFgenceFgenceFgenceFgenceFgenceFgenceFgenceFgenceFgence", (int) ')');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "FgenceFgenceFgenceFgenceFgenceFgenceFgenc" + "'", str2, "FgenceFgenceFgenceFgenceFgenceFgenceFgenc");
    }

    @Test
    public void test17467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17467");
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
        java.lang.String str16 = locale12.getDisplayScript();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
// flaky:         org.junit.Assert.assertEquals(locale1.toString(), "zh");
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test17468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17468");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("FR");
        java.lang.String str2 = languageRange1.getRange();
        boolean boolean4 = languageRange1.equals((java.lang.Object) "taly");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "fr" + "'", str2, "fr");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test17469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17469");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC\\u00de\\u00CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC", 65);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test17470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17470");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("", "LHcsineilat");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test17471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17471");
        java.util.Locale locale1 = new java.util.Locale("                                                                              ECANADAgCANADACANADAsh");
        java.lang.String str2 = locale1.getISO3Country();
        org.junit.Assert.assertEquals(locale1.toString(), "                                                                              ecanadagcanadacanadash");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test17472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17472");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("...hbi...", "000000000000000000000000000000000000000000000000000000000000000CCCC\\CCCCHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test17473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17473");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("CCCCCCC           \\uCCCCCC", "It_");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test17474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17474");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\r', 3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test17475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17475");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("hi!DEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEU\\u0061DEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEU\\u0061DEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEU\\u0061DEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEU\\u0061DEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEU\\u0061DEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEU\\u0061DEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEU\\u0061_\\U0020_Italienisch#########################################################################################", "aaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test17476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17476");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("italian (italian,english)", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=italian(italian");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17477");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("AzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs cAnese (cAna)u0069h..France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)Azhzhzhzhzhzhzhzhzhzh", "z");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test17478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17478");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("iFtlnz\\sisc02rankreich)00      ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "iFtlnz\\sisc02rankreich)00" + "'", str1, "iFtlnz\\sisc02rankreich)00");
    }

    @Test
    public void test17479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17479");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("E             g                          ");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("anau00", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test17480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17480");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "i\\u0020iTALIANiTALIANiTALIANiTALIit");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test17481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17481");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale locale5 = java.util.Locale.GERMANY;
        java.util.Locale.Builder builder6 = builder1.setLocale(locale5);
        java.util.Locale locale8 = java.util.Locale.forLanguageTag("\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITAL");
        java.util.Locale.Builder builder9 = builder6.setLocale(locale8);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder9.setUnicodeLocaleKeyword("cinese (cina)\\u0069h..", "                                                                    \\u0020iTALIANiTALIANiTALIANiTALI");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: cinese (cina)\\u0069h.. [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "fran\347ais (Canada)" + "'", str3, "fran\347ais (Canada)");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "de_DE");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test17482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17482");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "ITALIAN_ITALIAN_ENGLISF");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test17483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17483");
        java.util.Locale.Builder builder1 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setLanguageTag("Italian");
        java.util.Locale locale5 = java.util.Locale.PRC;
        java.lang.String str6 = locale5.getDisplayName();
        java.util.Locale.Builder builder7 = builder1.setLocale(locale5);
        java.lang.String str8 = locale5.getISO3Language();
        java.lang.String str9 = locale5.getScript();
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.lowerCase("", locale5);
        java.lang.String str11 = locale5.toLanguageTag();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chinois (Chine)" + "'", str6, "chinois (Chine)");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "zho" + "'", str8, "zho");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "zh-CN" + "'", str11, "zh-CN");
    }

    @Test
    public void test17484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17484");
        java.lang.String str1 = org.apache.commons.lang3.CharUtils.toString('Y');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Y" + "'", str1, "Y");
    }

    @Test
    public void test17485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17485");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("Frnz\366sisch(Knd", (int) '\\');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test17486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17486");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("italie", 76);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "italie" + "'", str2, "italie");
    }

    @Test
    public void test17487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17487");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder14 = builder9.setRegion("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rZH_CN (CAN)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: ???????????????????????????????????????????????????????????????????????????????????????????????????ZH_CN (CAN) [at index 0]");
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
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test17488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17488");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("i\\u0020italianitalianitalianitaliit         \\xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IHTEDESCO    !IH!IH!IH!IH!IH!IH!IH!IH!IH!IH", (int) '\u671d');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test17489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17489");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("ChineseEN_CA(China)", "\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ChineseEN_CA(China)" + "'", str2, "ChineseEN_CA(China)");
    }

    @Test
    public void test17490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17490");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("FranzosischFranzosisch (Frankreich)", "RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRFrancia");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "zosischFranzosisch (Frankreich)" + "'", str2, "zosischFranzosisch (Frankreich)");
    }

    @Test
    public void test17491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17491");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("\\xtalxan_ITALIAN_Englxsh", "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz\\u0065");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\xtalxan_ITALIAN_Englxsh" + "'", str2, "\\xtalxan_ITALIAN_Englxsh");
    }

    @Test
    public void test17492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17492");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("e                               ", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "e                               " + "'", str2, "e                               ");
    }

    @Test
    public void test17493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17493");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "hhhhhhhhH", (java.lang.CharSequence) "                                                               \\u002");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 68 + "'", int2 == 68);
    }

    @Test
    public void test17494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17494");
        java.lang.String str1 = org.apache.commons.lang3.CharUtils.toString('.');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "." + "'", str1, ".");
    }

    @Test
    public void test17495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17495");
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
            java.util.Locale.Builder builder12 = builder9.setLanguage("                                                                                     German (Germany)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language:                                                                                      German (Germany) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chinois (Chine)" + "'", str5, "chinois (Chine)");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "ko");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "ko");
    }

    @Test
    public void test17496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17496");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("tedesco    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "tedesco" + "'", str1, "tedesco");
    }

    @Test
    public void test17497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17497");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("ITALIAN_italian_eNGLISH", "\\u0020TALIANTALIANTALIANiTALI");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\\italian_ITALIAN_English", "#########FranzosischFranzosisch (Frankreich)");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEach("hi!        (\\U0020,Italienisch#########################################################################################nnn", strArray3, strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 13 vs 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test17498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17498");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        java.util.Locale.Builder builder7 = builder4.setRegion("IT");
        java.util.Locale locale11 = new java.util.Locale("  \\u005   ", "...u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069!IH\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\englisch");
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.upperCase("E44444444444444444444444444444444!IHg44444444444444444444444444444444!IH44444444444444444444444444444444!IHsh", locale11);
        java.util.Set<java.lang.String> strSet13 = locale11.getUnicodeLocaleAttributes();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder14 = builder7.setLocale(locale11);
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language:   \\u005    [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertEquals(locale11.toString(), "  \\u005   _...U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069!IH\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\ENGLISCH");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "E44444444444444444444444444444444!IHG44444444444444444444444444444444!IH44444444444444444444444444444444!IHSH" + "'", str12, "E44444444444444444444444444444444!IHG44444444444444444444444444444444!IH44444444444444444444444444444444!IHSH");
        org.junit.Assert.assertNotNull(strSet13);
    }

    @Test
    public void test17499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17499");
        java.util.Locale locale3 = new java.util.Locale("ITALIAN_ITALIAN_ENGLISF", "", "...E_NAILATI...");
        org.junit.Assert.assertEquals(locale3.toString(), "italian_italian_englisf__...E_NAILATI...");
    }

    @Test
    public void test17500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17500");
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
        java.util.Locale locale18 = null;
        java.lang.String str19 = locale8.getDisplayVariant(locale18);
        java.util.Set<java.lang.String> strSet20 = locale8.getUnicodeLocaleKeys();
        java.util.Locale locale22 = new java.util.Locale("");
        java.lang.String str23 = locale22.getDisplayName();
        java.lang.String str24 = locale22.getDisplayLanguage();
        java.lang.String str25 = locale8.getDisplayVariant(locale22);
        java.lang.String str26 = locale8.getDisplayVariant();
        java.lang.String str27 = locale8.getDisplayCountry();
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
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "fran\347ais" + "'", str17, "fran\347ais");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertEquals(locale22.toString(), "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }
}
