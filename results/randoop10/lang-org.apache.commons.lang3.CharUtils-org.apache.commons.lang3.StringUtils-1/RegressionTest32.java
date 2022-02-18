import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest32 {

    public static boolean debug = false;

    @Test
    public void test16001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16001");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("h (HHHHHHHHH,CV CW CX CY CZ DE DJ DK DM DO DZ EC EE EG EH ER ES ET FI FJ FK)", "aaaaaaaaaaaaaaaaaaaaaaaaFranz\366sisch(Frankreich)aaaaaaaaaaaaaaaaaaaaaaaa", 309);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test16002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16002");
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
        java.lang.String str18 = locale8.getScript();
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test16003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16003");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("aE", "CGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...", 65);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test16004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16004");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("\\u0020iItalian\\u008600u\\U\\u0020iItalian\\u0020iUanglaisUFRZ\326CZ(FRKREC)Uitalian    U                                                                                                      U!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IUzhzhzhzhzhzhzhzhzhzhFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAzhzhzhzhzhzhzhzhzhzhUFRZ\326CZ(FRKREC)Ucinese (Cina)\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hhU         ITALIAN_ITALIAN_ENGLISH         ITALIAN_!IHITTAIT_ITALIAN_EGAISHU                                      ...");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=\\u0020iitalian\\u008600u\\u\\u0020iitalian\\u0020iuanglaisufrzo?cz(frkrec)uitalian    u                                                                                                      u!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!iuzhzhzhzhzhzhzhzhzhzhfraadzhaezhafzhagzhaizhalzhamzhanzhaozhaqzharzhaszhazhzhzhzhzhzhzhzhzhzhufrzo?cz(frkrec)ucinese (cina)\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hhu         italian_italian_english         italian_!ihittait_italian_egaishu                                      ...");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16005");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("IENISCH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HCSINEI" + "'", str1, "HCSINEI");
    }

    @Test
    public void test16006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16006");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("hi!       _\\U0020_Italienisch####################################################################...", 13);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test16007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16007");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                          \\u005c         ", "kor", 6);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test16008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16008");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("FRDzhEzhFzhGzhIzhLzhMzhNzhOzhQzhRzhSzheeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee", "coreano (Corea del Sud)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "FRDzhEzhFzhGzhIzhLzhMzhNzhOzhQzhRzhSzheeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee" + "'", str2, "FRDzhEzhFzhGzhIzhLzhMzhNzhOzhQzhRzhSzheeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee");
    }

    @Test
    public void test16009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16009");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("RRRRRRRRRRRRRR...       g                     ...RRRRRRRRRRRRRRR", "\\u007");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test16010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16010");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("Franzosisch (Frankreich)");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.concatWith("Franz\366sisch (Kanada)", (java.lang.Object[]) strArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "", 108, (int) '0');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "FranzosischFranz\366sisch (Kanada)(Frankreich)" + "'", str3, "FranzosischFranz\366sisch (Kanada)(Frankreich)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test16011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16011");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "\\u0066", 0);
        java.lang.String[] strArray5 = java.util.Locale.getISOCountries();
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray5);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("4", strArray4, strArray5);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray5);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray10);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray10, 'Y');
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZW" + "'", str6, "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZW");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZW" + "'", str7, "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZW");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "4" + "'", str9, "4");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZW" + "'", str11, "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZW");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ADYAEYAFYAGYAIYALYAMYANYAOYAQYARYASYATYAUYAWYAXYAZYBAYBBYBDYBEYBFYBGYBHYBIYBJYBLYBMYBNYBOYBQYBRYBSYBTYBVYBWYBYYBZYCAYCCYCDYCFYCGYCHYCIYCKYCLYCMYCNYCOYCRYCUYCVYCWYCXYCYYCZYDEYDJYDKYDMYDOYDZYECYEEYEGYEHYERYESYETYFIYFJYFKYFMYFOYFRYGAYGBYGDYGEYGFYGGYGHYGIYGLYGMYGNYGPYGQYGRYGSYGTYGUYGWYGYYHKYHMYHNYHRYHTYHUYIDYIEYILYIMYINYIOYIQYIRYISYITYJEYJMYJOYJPYKEYKGYKHYKIYKMYKNYKPYKRYKWYKYYKZYLAYLBYLCYLIYLKYLRYLSYLTYLUYLVYLYYMAYMCYMDYMEYMFYMGYMHYMKYMLYMMYMNYMOYMPYMQYMRYMSYMTYMUYMVYMWYMXYMYYMZYNAYNCYNEYNFYNGYNIYNLYNOYNPYNRYNUYNZYOMYPAYPEYPFYPGYPHYPKYPLYPMYPNYPRYPSYPTYPWYPYYQAYREYROYRSYRUYRWYSAYSBYSCYSDYSEYSGYSHYSIYSJYSKYSLYSMYSNYSOYSRYSSYSTYSVYSXYSYYSZYTCYTDYTFYTGYTHYTJYTKYTLYTMYTNYTOYTRYTTYTVYTWYTZYUAYUGYUMYUSYUYYUZYVAYVCYVEYVGYVIYVNYVUYWFYWSYYEYYTYZAYZMYZW" + "'", str13, "ADYAEYAFYAGYAIYALYAMYANYAOYAQYARYASYATYAUYAWYAXYAZYBAYBBYBDYBEYBFYBGYBHYBIYBJYBLYBMYBNYBOYBQYBRYBSYBTYBVYBWYBYYBZYCAYCCYCDYCFYCGYCHYCIYCKYCLYCMYCNYCOYCRYCUYCVYCWYCXYCYYCZYDEYDJYDKYDMYDOYDZYECYEEYEGYEHYERYESYETYFIYFJYFKYFMYFOYFRYGAYGBYGDYGEYGFYGGYGHYGIYGLYGMYGNYGPYGQYGRYGSYGTYGUYGWYGYYHKYHMYHNYHRYHTYHUYIDYIEYILYIMYINYIOYIQYIRYISYITYJEYJMYJOYJPYKEYKGYKHYKIYKMYKNYKPYKRYKWYKYYKZYLAYLBYLCYLIYLKYLRYLSYLTYLUYLVYLYYMAYMCYMDYMEYMFYMGYMHYMKYMLYMMYMNYMOYMPYMQYMRYMSYMTYMUYMVYMWYMXYMYYMZYNAYNCYNEYNFYNGYNIYNLYNOYNPYNRYNUYNZYOMYPAYPEYPFYPGYPHYPKYPLYPMYPNYPRYPSYPTYPWYPYYQAYREYROYRSYRUYRWYSAYSBYSCYSDYSEYSGYSHYSIYSJYSKYSLYSMYSNYSOYSRYSSYSTYSVYSXYSYYSZYTCYTDYTFYTGYTHYTJYTKYTLYTMYTNYTOYTRYTTYTVYTWYTZYUAYUGYUMYUSYUYYUZYVAYVCYVEYVGYVIYVNYVUYWFYWSYYEYYTYZAYZMYZW");
    }

    @Test
    public void test16012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16012");
        java.util.Locale locale1 = new java.util.Locale("Egallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallman");
        org.junit.Assert.assertEquals(locale1.toString(), "egallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallman");
    }

    @Test
    public void test16013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16013");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        java.util.Locale.setDefault(locale0);
        java.lang.String str2 = locale0.toLanguageTag();
        java.util.Locale locale3 = java.util.Locale.ITALY;
        java.lang.String str4 = locale3.getScript();
        java.lang.String str5 = locale3.getDisplayCountry();
        boolean boolean6 = locale3.hasExtensions();
        java.util.Locale.setDefault(locale3);
        java.lang.String str8 = locale0.getDisplayLanguage(locale3);
        java.lang.String str9 = locale3.getLanguage();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "de" + "'", str2, "de");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Italien" + "'", str5, "Italien");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "tedesco" + "'", str8, "tedesco");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "it" + "'", str9, "it");
    }

    @Test
    public void test16014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16014");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("8300u\\", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test16015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16015");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("FRANZ\326SISCH (KANADA)", "ete");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ete" + "'", str2, "ete");
    }

    @Test
    public void test16016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16016");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("ne\351roc", "             FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA", "ZH_NGGGGG");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ne\351roc" + "'", str3, "ne\351roc");
    }

    @Test
    public void test16017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16017");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("\\\\\\\\\\\\\\\\\\\\\\\\kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkDEkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk\\\\\\\\\\\\\\\\\\\\\\\\", "FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA             FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA             FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA             FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA23");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\\\\\\\\\\\\\\\\\\\\\\\kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkDEkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk\\\\\\\\\\\\\\\\\\\\\\\\" + "'", str2, "\\\\\\\\\\\\\\\\\\\\\\\\kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkDEkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk\\\\\\\\\\\\\\\\\\\\\\\\");
    }

    @Test
    public void test16018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16018");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("44444444444444444444444444444444!IHAAAAAAAAAAAAAAAAAAAAAAAAFRANZ\326SISCH (FRANKREICH)AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444444!IHAAAAAAAAAAAAAAAAAAAAAAAAFRANZ\326SISCH (FRANKREICH)AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "44444444444444444444444444444444!IHAAAAAAAAAAAAAAAAAAAAAAAAFRANZ\326SISCH (FRANKREICH)AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test16019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16019");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("\\u0020TALIANTALIANTALIANiTALI", "R0                                               NAILATI             ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test16020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16020");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("                                                               \\U002   ", "e             g");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\U002   " + "'", str2, "\\U002   ");
    }

    @Test
    public void test16021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16021");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance(charSequence0, (java.lang.CharSequence) " (italian,english)                                      ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Strings must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16022");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("ZH_CN");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test16023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16023");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.GERMAN;
        java.util.Locale locale3 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str4 = locale2.getDisplayName(locale3);
        java.util.Locale.setDefault(category0, locale3);
        java.util.Locale locale8 = new java.util.Locale("\\u0020iTALIANiTALIANiTALIANiTALI\\u0020iTALIANiTALIANiTALIANiTAL", "allemand");
        java.util.Locale.setDefault(category0, locale8);
        java.util.Locale locale10 = java.util.Locale.getDefault(category0);
        java.util.Locale locale13 = java.util.Locale.forLanguageTag("France");
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.lowerCase("tedesco    ", locale13);
        java.util.Locale.setDefault(category0, locale13);
        java.util.Locale locale16 = java.util.Locale.getDefault(category0);
        java.lang.String str17 = locale16.getLanguage();
        java.lang.String str18 = locale16.getDisplayLanguage();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "allemand" + "'", str4, "allemand");
        org.junit.Assert.assertEquals(locale8.toString(), "\\u0020italianitalianitalianitali\\u0020italianitalianitalianital_ALLEMAND");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "\\u0020italianitalianitalianitali\\u0020italianitalianitalianital_ALLEMAND");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "france");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "tedesco    " + "'", str14, "tedesco    ");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "france");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "france" + "'", str17, "france");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "france" + "'", str18, "france");
    }

    @Test
    public void test16024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16024");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                              Deutsch", "italian_ITALIAN_English");
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("FRA", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test16025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16025");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("\\u0020hi!       _\\U0020_Italienisch################", 56, 24);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test16026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16026");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rzh_CN", "Chinese (China)", 79);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test16027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16027");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder16 = builder14.setRegion("CCCC\\CCCCC                                                             ");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: CCCC\\CCCCC                                                              [at index 0]");
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
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test16028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16028");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aNCHc", "\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065", 64);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test16029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16029");
        char char1 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) '\u6cd5');
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\u6cd5' + "'", char1 == '\u6cd5');
    }

    @Test
    public void test16030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16030");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("fr-CAfr-CAfr-C8600u\\fr-CAfr-CAfr-CA", "44444444444444444444444444444444!ih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "fr-CAfr-CAfr-C8600u\\fr-CAfr-CAfr-CA" + "'", str2, "fr-CAfr-CAfr-C8600u\\fr-CAfr-CAfr-CA");
    }

    @Test
    public void test16031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16031");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("\\u0054", "FR_CA                             ...!       \\U0034\\U0034\\U0034\\U0034\\U0034\\U0034\\U0034\\U0034\\U0034\\");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test16032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16032");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rfra", "IIIIIIIIII9999999999999999999999999999999");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rfra" + "'", str2, "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rfra");
    }

    @Test
    public void test16033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16033");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("english", "tenenco");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "english" + "'", str2, "english");
    }

    @Test
    public void test16034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16034");
        java.util.Locale locale3 = new java.util.Locale("\\u0023", "Italienisch", "iTALIAN");
        java.lang.String str4 = locale3.getDisplayVariant();
        java.lang.String str5 = locale3.getDisplayCountry();
        java.lang.String str6 = locale3.getCountry();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = locale3.getISO3Language();
            org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException; message: Couldn't find 3-letter language code for \\u0023");
        } catch (java.util.MissingResourceException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "\\u0023_ITALIENISCH_iTALIAN");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "iTALIAN" + "'", str4, "iTALIAN");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ITALIENISCH" + "'", str5, "ITALIENISCH");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ITALIENISCH" + "'", str6, "ITALIENISCH");
    }

    @Test
    public void test16035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16035");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("fr-CA", (double) 220);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=220.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16036");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "             DE_DE            ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "             DE_DE            " + "'", str1, "             DE_DE            ");
    }

    @Test
    public void test16037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16037");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByCharacterType("ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "h");
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny("INGLESE", strArray4);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.startsWithAny("#########################################################################################eltI_0200U\\_!", strArray4);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.concatWith("inglesehhhhhhhhhenglisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)englisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)englisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)englisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)englisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)englisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)en", (java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDh..." + "'", str6, "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDh...");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDinglesehhhhhhhhhenglisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)englisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)englisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)englisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)englisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)englisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)en..." + "'", str9, "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDinglesehhhhhhhhhenglisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)englisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)englisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)englisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)englisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)englisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)en...");
    }

    @Test
    public void test16038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16038");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("ZH_cnFrench (Canada)AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "HHHHHHHHH         ITALIAN_italian_eNGLISH         ITALIAN_!IHitTAiT_ITALIAN_EgAish");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test16039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16039");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("44444444444444444444444444444444444444444444it                   ", "                                                                                ian\\u00208ian\\u0020i868ian\\u00");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                ian\\u00208ian\\u0020i868ian\\u00" + "'", str2, "                                                                                ian\\u00208ian\\u0020i868ian\\u00");
    }

    @Test
    public void test16040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16040");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.lang.String str1 = locale0.getDisplayLanguage();
        java.util.Locale locale2 = locale0.stripExtensions();
        java.util.Set<java.lang.String> strSet3 = locale2.getUnicodeLocaleKeys();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "italiano" + "'", str1, "italiano");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "it");
        org.junit.Assert.assertNotNull(strSet3);
    }

    @Test
    public void test16041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16041");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("TITHI!HI!", "China");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "TITHI!HI!" + "'", str2, "TITHI!HI!");
    }

    @Test
    public void test16042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16042");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("ADYAEYAFYAGYAIYALYAMYANYAOYAQYARYASYATYAUYAWYAXYAZYBAYBBYBDYBEYBFYBGYBHYBIYBJYBLYBMYBNYBOYBQYBRYBSYBTYBVYBWYBYYBZYCAYCCYCDYCFYCGYCHYCIYCKYCLYCMYCNYCOYCRYCUYCVYCWYCXYCYYCZYDEYDJYDKYDMYDOYDZYECYEEYEGYEHYERYESYETYFIYFJYFKYFMYFOYFRYGAYGBYGDYGEYGFYGGYGHYGIYGLYGMYGNYGPYGQYGRYGSYGTYGUYGWYGYYHKYHMYHNYHRYHTYHUYIDYIEYILYIMYINYIOYIQYIRYISYITYJEYJMYJOYJPYKEYKGYKHYKIYKMYKNYKPYKRYKWYKYYKZYLAYLBYLCYLIYLKYLRYLSYLTYLUYLVYLYYMAYMCYMDYMEYMFYMGYMHYMKYMLYMMYMNYMOYMPYMQYMRYMSYMTYMUYMVYMWYMXYMYYMZYNAYNCYNEYNFYNGYNIYNLYNOYNPYNRYNUYNZYOMYPAYPEYPFYPGYPHYPKYPLYPMYPNYPRYPSYPTYPWYPYYQAYREYROYRSYRUYRWYSAYSBYSCYSDYSEYSGYSHYSIYSJYSKYSLYSMYSNYSOYSRYSSYSTYSVYSXYSYYSZYTCYTDYTFYTGYTHYTJYTKYTLYTMYTNYTOYTRYTTYTVYTWYTZYUAYUGYUMYUSYUYYUZYVAYVCYVEYVGYVIYVNYVUYWFYWSYYEYYTYZAYZMYZW", (double) 267);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=267.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16043");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("eng", "\\u0061ItalifnischItalifnischItalifnischItalifnischItalifnischItalifnischItalifnischItalifnischItalif");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test16044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16044");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEnglischCCCCCCCCCCC...", "Cinese (Cina)\\u0069h...", "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test16045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16045");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("", "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiitalian_ITALIAN_Englishiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii", (int) 'Y');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test16046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16046");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        java.lang.String str4 = locale3.getCountry();
        java.util.Locale.setDefault(category0, locale3);
        java.util.Locale.Category category6 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale7 = java.util.Locale.getDefault(category6);
        java.util.Locale locale8 = java.util.Locale.getDefault(category6);
        java.util.Locale.setDefault(category0, locale8);
        java.lang.String str10 = locale8.toString();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "france");
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
    public void test16047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16047");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("E44444444444444444444444444444444!IHG44444444444444444444444444444444!IH44444444444444444444444444444444!IHSH", "ADkAEkAFkAGkAIkALkAMkANkAOkAQkARkASkATkAUkAWkAXkAZkBAkBBkBDkBEkBFkBGkBHkBIkBJkBLkBMkBNkBOkBQkBRkBSkBTkBVkBWkBYkBZkCAkCCkCDkCFkCGkCHkCIkCKkCLkCMkCNkCOkCRkCUkCVkCWkCXkCYkCZkDEkDJkDKkDMkDOkDZkECkEEkEGkEHkERkESkETkFIkFJkFKkFMkFOkFRkGAkGBkGDkGEkGFkGGkGHkGIkGLkGMkGNkGPkGQkGRkGSkGTkGUkGWkGYkHKkHMkHNkHRkHTkHUkIDkIEkILkIMkINkIOkIQkIRkISkITkJEkJMkJOkJPkKEkKGkKHkKIkKMkKNkKPkKRkKWkKYkKZkLAkLBkLCkLIkLKkLRkLSkLTkLUkLVkLYkMAkMCkMDkMEkMFkMGkMHkMKkMLkMMkMNkMOkMPkMQkMRkMSkMTkMUkMVkMWkMXkMYkMZkNAkNCkNEkNFkNGkNIkNLkNOkNPkNRkNUkNZkOMkPAkPEkPFkPGkPHkPKkPLkPMkPNkPRkPSkPTkPWkPYkQAkREkROkRSkRUkRWkSAkSBkSCkSDkSEkSGkSHkSIkSJkSKkSLkSMkSNkSOkSRkSSkSTkSVkSXkSYkSZkTCkTDkTFkTGkTHkTJkTKkTLkTMkTNkTOkTRkTTkTVkTWkTZkUAkUGkUMkUSkUYkUZkVAkVCkVEkVGkVIkVNkVUkWFkWSkYEkYTkZAkZMkZW", 371);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test16048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16048");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("                                                       a");
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + ' ' + "'", char1 == ' ');
    }

    @Test
    public void test16049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16049");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("HIAN\\U0020IH", "fr-CAfr-CAfr-C8600u\\fr-CAfr-CAfr-CA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HIAN\\U0020IH" + "'", str2, "HIAN\\U0020IH");
    }

    @Test
    public void test16050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16050");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("9hhhhhhhhhh", "anihc!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test16051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16051");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder0.setVariant("itTAiT_ITALIAN_EgAish");
        java.util.Locale locale6 = builder0.build();
        java.lang.String str7 = locale6.getScript();
        java.lang.String str8 = locale6.toLanguageTag();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "und-itTAiT-ITALIAN-EgAish" + "'", str8, "und-itTAiT-ITALIAN-EgAish");
    }

    @Test
    public void test16052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16052");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder4 = builder2.setScript("");
        java.util.Locale.Builder builder5 = builder4.clear();
        java.util.Locale.Builder builder6 = builder4.clearExtensions();
        java.util.Locale locale7 = builder6.build();
        java.util.Locale.Builder builder8 = builder6.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder6.setLanguage("                           NNNNNNNNNNNNNNNNNN                           ");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language:                            NNNNNNNNNNNNNNNNNN                            [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test16053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16053");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("\\u0020iItalian\\u008600u\\U\\u0020iItalian\\u0020iUanglaisUFRZ\326CZ(FRKREC)Uitalian    U                                                                                                      U!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IUzhzhzhzhzhzhzhzhzhzhFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAzhzhzhzhzhzhzhzhzhzhUFRZ\326CZ(FRKREC)Ucinese (Cina)\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hhU         ITALIAN_ITALIAN_ENGLISH         ITALIAN_!IHITTAIT_ITALIAN_EGAISHU                                      ...", 95);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                         U!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IUzhzhzhzhzhzhzhzhzhzhFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAzhzhzhzhzhzhzhzhzhzhUFRZ\326CZ(FRKREC)Ucinese (Cina)\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hhU         ITALIAN_ITALIAN_ENGLISH         ITALIAN_!IHITTAIT_ITALIAN_EGAISHU                                      ..." + "'", str2, "                                                                                         U!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IUzhzhzhzhzhzhzhzhzhzhFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAzhzhzhzhzhzhzhzhzhzhUFRZ\326CZ(FRKREC)Ucinese (Cina)\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hhU         ITALIAN_ITALIAN_ENGLISH         ITALIAN_!IHITTAIT_ITALIAN_EGAISHU                                      ...");
    }

    @Test
    public void test16054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16054");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder24 = builder22.setRegion("ranzosisch (Frankreich)kkkkkkkkkkkkkkkkkkk...ranzosisch (Frankreich)kkkkkkkkkk\n");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: ranzosisch (Frankreich)kkkkkkkkkkkkkkkkkkk...ranzosisch (Frankreich)kkkkkkkkkk? [at index 0]");
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
    }

    @Test
    public void test16055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16055");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "                                                                                                               ))))))))))))))))))))))))))))))))))))))))))))))))))))");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test16056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16056");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        java.util.Locale locale4 = builder0.build();
        java.util.Locale locale5 = java.util.Locale.UK;
        java.util.Locale.Category category6 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale7 = java.util.Locale.getDefault(category6);
        java.util.Locale locale8 = java.util.Locale.GERMAN;
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = locale8.getDisplayName(locale9);
        java.util.Locale.setDefault(category6, locale9);
        java.util.Set<java.lang.String> strSet12 = locale9.getUnicodeLocaleKeys();
        java.lang.String str13 = locale5.getDisplayVariant(locale9);
        java.lang.String str14 = locale9.toLanguageTag();
        java.lang.String str15 = locale4.getDisplayLanguage(locale9);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_GB");
        org.junit.Assert.assertTrue("'" + category6 + "' != '" + java.util.Locale.Category.FORMAT + "'", category6.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale7);
// flaky:         org.junit.Assert.assertEquals(locale7.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "de");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "allemand" + "'", str10, "allemand");
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "fr-CA" + "'", str14, "fr-CA");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test16057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16057");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "englisch (         ITALIAN_ITALIAN_ENGLISH,\\u0061)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test16058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16058");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069!ih\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\engli", (int) 'U', 29);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test16059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16059");
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
        java.lang.String str60 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strList58, "0");
        java.lang.String str62 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strList58, "Eagaash");
        java.lang.String str64 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strList58, 'R');
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
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
    }

    @Test
    public void test16060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16060");
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
        java.lang.String str42 = locale36.toString();
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
// flaky:         org.junit.Assert.assertEquals(locale17.toString(), "fr_FR");
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
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "zh" + "'", str42, "zh");
    }

    @Test
    public void test16061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16061");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("FRANZ\326SISCH\n(FRANKREICH)");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, '2');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "H (HHHHHHHHH,CV CW CX CY CZ DE DJ DK DM DO DZ EC EE E...", (int) 'E', 9);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "FRANZ\326SISCH2(FRANKREICH)" + "'", str3, "FRANZ\326SISCH2(FRANKREICH)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test16062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16062");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("dallemandallemandallemandallemandallemandallemandallemandallennnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn", "NI         D00U\\00U\\ED00U\\00U\\ED00U\\G        ESEL", (int) (short) 0);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test16063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16063");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("\uc911\uad6d\uc5b4\uc911\uad6d)", (int) '5', 103);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test16064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16064");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("\\u0020iItalian\\u008600u");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByCharacterType("itTAiT_ITA");
        boolean boolean7 = org.apache.commons.lang3.StringUtils.startsWithAny("                                                    ", strArray6);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.concatWith("Franz\366sisch", (java.lang.Object[]) strArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEach("harzhaszhazhzhzhzhzhzhzhzhzhz", strArray2, strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 9 vs 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "itFranz\366sischTAFranz\366sischiFranz\366sischTFranz\366sisch_Franz\366sischITA" + "'", str8, "itFranz\366sischTAFranz\366sischiFranz\366sischTFranz\366sisch_Franz\366sischITA");
    }

    @Test
    public void test16065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16065");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("                                                      englisch                                                       ", "E44444444444444444444444444444444!IHg44444444444444444444444444444444!IH44444444444444444444444444444444!IHs", "##################    \\XTALXAN_ITALIAN_ENGLXSH    ###################");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test16066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16066");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("en_ca", 'a');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'e' + "'", char2 == 'e');
    }

    @Test
    public void test16067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16067");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "Egallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallman");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test16068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16068");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("nglisch                                                                                                                                                                                                                                                               ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "nglisch" + "'", str1, "nglisch");
    }

    @Test
    public void test16069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16069");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder8.setRegion("2ITALIANITALIANITALIANITAL");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: 2ITALIANITALIANITALIANITAL [at index 0]");
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
    }

    @Test
    public void test16070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16070");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\\u0021", '4');
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\u0021" + "'", str3, "\\u0021");
    }

    @Test
    public void test16071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16071");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("fr-C", (int) '9');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                          fr-C                           " + "'", str2, "                          fr-C                           ");
    }

    @Test
    public void test16072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16072");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("\\U0047", "\ub3c5\uc77c\uc5b4", "E", 51);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\U0047" + "'", str4, "\\U0047");
    }

    @Test
    public void test16073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16073");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("English", "Italian");
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!", "", (int) (short) 10);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("", strArray4, strArray8);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.endsWithAny("allemand", strArray4);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Egsh" + "'", str13, "Egsh");
    }

    @Test
    public void test16074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16074");
        java.util.Locale locale1 = java.util.Locale.CHINESE;
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("         italian_ITALIAN_English", locale1);
        java.lang.String str3 = locale1.getDisplayName();
        java.util.Locale.setDefault(locale1);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "         italian_italian_english" + "'", str2, "         italian_italian_english");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chinois" + "'", str3, "chinois");
    }

    @Test
    public void test16075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16075");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "44444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test16076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16076");
        java.util.Locale locale1 = java.util.Locale.ROOT;
        java.lang.String str2 = locale1.getISO3Language();
        java.util.Locale locale4 = new java.util.Locale("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rzh_CN");
        java.lang.String str5 = locale1.getDisplayVariant(locale4);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.upperCase("         ITALIAN_italian_eNGLISH         ITALIAN_!IHitTAiT_ITALIAN_EgAish", locale1);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals(locale4.toString(), "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rzh_cn");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "         ITALIAN_ITALIAN_ENGLISH         ITALIAN_!IHITTAIT_ITALIAN_EGAISH" + "'", str6, "         ITALIAN_ITALIAN_ENGLISH         ITALIAN_!IHITTAIT_ITALIAN_EGAISH");
    }

    @Test
    public void test16077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16077");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\\u0061ItalienischItalienischItalienischItalienischItalienischItalienischItalienischItalienischItalie");
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC\\u00de\\u00CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC", strArray3);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\!_\\U0020_Itle\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test16078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16078");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder0.setVariant("itTAiT_ITALIAN_EgAish");
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        java.util.Locale.Builder builder7 = builder6.clearExtensions();
        java.util.Locale.Builder builder9 = builder6.setVariant("Eagaash");
        java.util.Locale.Builder builder10 = builder9.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder10.removeUnicodeLocaleAttribute("fran\347ais (France)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: franc?ais (France) [at index 0]");
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
    }

    @Test
    public void test16079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16079");
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
        java.lang.String str19 = locale11.getISO3Language();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u82f1\u6587" + "'", str2, "\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!IH" + "'", str3, "!IH");
        org.junit.Assert.assertNotNull(charSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u6cd5\u6587\u52a0\u62ff\u5927)" + "'", str9, "\u6cd5\u6587\u52a0\u62ff\u5927)");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "de_DE");
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "it");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\u610f\u5927\u5229\u6587" + "'", str16, "\u610f\u5927\u5229\u6587");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "tedesco" + "'", str17, "tedesco");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Englisch" + "'", str18, "Englisch");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "deu" + "'", str19, "deu");
    }

    @Test
    public void test16080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16080");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("\\u0068 !ih !ih !ih !ih !ih !ih !ih !ih !ih", (int) 'I', 'x');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx\\u0068 !ih !ih !ih !ih !ih !ih !ih !ih !ih" + "'", str3, "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx\\u0068 !ih !ih !ih !ih !ih !ih !ih !ih !ih");
    }

    @Test
    public void test16081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16081");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rFRANZ...", "                                                                                        e                               ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test16082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16082");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("44444444444444444444444444444444!IHaaaaaaaaaaaaaaaaaaaaaaaaFranz\366sisch (Frankreich)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "Frankreich)kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk", 120);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test16083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16083");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("franz\366sisch (frankreich)", 'G');
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByCharacterType("ixii");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEach("\\u0061ItalienischItalienischItalienischItalienischItalienischItalienischItalienischItalienischItalie", strArray4, strArray6);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "TALY");
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("!IH", "       !IH", (int) (byte) 1);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray14, ' ');
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray14, "Fr ncG ");
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.replaceEach("Japanese", strArray4, strArray14);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\\u0061ItalienischItalienischItalienischItalienischItalienischItalienischItalienischItalienischItalie" + "'", str7, "\\u0061ItalienischItalienischItalienischItalienischItalienischItalienischItalienischItalienischItalie");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "franz\366sisch (frankreich)" + "'", str10, "franz\366sisch (frankreich)");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "!IH" + "'", str16, "!IH");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "!IH" + "'", str18, "!IH");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Japanese" + "'", str19, "Japanese");
    }

    @Test
    public void test16084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16084");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "\ud55c\uad6d\uc5b4\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test16085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16085");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!       _\\U0020_Italienisch#########################################################################################" + "'", str1, "hi!       _\\U0020_Italienisch#########################################################################################");
    }

    @Test
    public void test16086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16086");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("                                                                                                              italieital", "                                                   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                              italieital" + "'", str2, "                                                                                                              italieital");
    }

    @Test
    public void test16087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16087");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "\\u0020 (AD4AE4AF4AG4AI4AL4AM4AN4AO4AQ4AR4AS4AT4AU4AW4AX4AZ4BA4BB4BD4BE4BF4BG4BH4BI4BJ4BL4BM4BN4BO4BQ4BR4BS4BT4BV4BW4BY4BZ4CA4CC4CD4CF4CG4CH4CI4CK4CL4CM4CN4CO4CR4CU4CV4CW4CX4CY4CZ4DE4DJ4DK4DM4DO4DZ4EC4EE4EG4EH4ER4ES4ET4FI4FJ4FK4FM4FO4FR4GA4GB4GD4GE4GF4GG4GH4GI4GL4GM4GN4GP4GQ4GR4GS4GT4GU4GW4GY4HK4HM4HN4HR4HT4HU4ID4IE4IL4IM4IN4IO4IQ4IR4IS4IT4JE4JM4JO4JP4KE4KG4KH4KI4KM4KN4KP4KR4KW4KY4KZ4LA4LB4LC4LI4LK4LR4LS4LT4LU4LV4LY4MA4MC4MD4ME4MF4MG4MH4MK4ML4MM4MN4MO4MP4MQ4MR4MS4MT4MU4MV4MW4MX4MY4MZ4NA4NC4NE4NF4NG4NI4NL4NO4NP4NR4NU4NZ4OM4PA4PE4PF4PG4PH4PK4PL4PM4PN4PR4PS4PT4PW4PY4QA4RE4RO4RS4RU4RW4SA4SB4SC4SD4SE4SG4SH4SI4SJ4SK4SL4SM4SN4SO4SR4SS4ST4SV4SX4SY4SZ4TC4TD4TF4TG4TH4TJ4TK4TL4TM4TN4TO4TR4TT4TV4TW4TZ4UA4UG4UM4US4UY4UZ4VA4VC4VE4VG4VI4VN4VU4WF4WS4YE4YT4ZA4ZM4ZW)", "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZW");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test16088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16088");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("ITALIANITALIAN", "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rzh_cn", "i\\u0020italianitalianitalianitaliit         \\xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test16089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16089");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("aNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHc", "........French (Canadad........");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test16090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16090");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("french (NC_HZ)", "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC\\xtalxan_ITALIAN_EnglxshCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "french (NC_HZ)" + "'", str2, "french (NC_HZ)");
    }

    @Test
    public void test16091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16091");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("             DE_DE            ", "allemand (Allemagne)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "             DE_DE            " + "'", str2, "             DE_DE            ");
    }

    @Test
    public void test16092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16092");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("inglesehhhhhhhhH", "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rZH_cn");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "inglesehhhhhhhhH" + "'", str2, "inglesehhhhhhhhH");
    }

    @Test
    public void test16093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16093");
        int int1 = org.apache.commons.lang3.CharUtils.toIntValue('7');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 7 + "'", int1 == 7);
    }

    @Test
    public void test16094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16094");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiControl('l');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test16095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16095");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC", "                              ");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC" + "'", str3, "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC" + "'", str4, "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
    }

    @Test
    public void test16096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16096");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("WBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...", 'B');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, 'D', (int) 'F', 52);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test16097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16097");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('F', (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test16098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16098");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("German (Germany)", 65);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                        German (Germany)                         " + "'", str2, "                        German (Germany)                         ");
    }

    @Test
    public void test16099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16099");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("FRANZ\326SISCHFRANZOSISCH (FRANKREICH)UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", 0, '0');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "FRANZ\326SISCHFRANZOSISCH (FRANKREICH)UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU" + "'", str3, "FRANZ\326SISCHFRANZOSISCH (FRANKREICH)UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
    }

    @Test
    public void test16100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16100");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("HI!HI     \\u005c", (int) '5', 'g');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!HI     \\u005cggggggggggggggggggggggggggggggggggggg" + "'", str3, "HI!HI     \\u005cggggggggggggggggggggggggggggggggggggg");
    }

    @Test
    public void test16101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16101");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.util.Set<java.lang.Character> charSet1 = locale0.getExtensionKeys();
        java.lang.String str2 = locale0.getVariant();
        java.lang.String str3 = locale0.getDisplayName();
        java.util.Set<java.lang.Character> charSet4 = locale0.getExtensionKeys();
        java.lang.String str5 = locale0.getISO3Country();
        java.util.Set<java.lang.Character> charSet6 = locale0.getExtensionKeys();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertNotNull(charSet1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u610f\u5927\u5229\u6587" + "'", str3, "\u610f\u5927\u5229\u6587");
        org.junit.Assert.assertNotNull(charSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(charSet6);
    }

    @Test
    public void test16102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16102");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("FRANZ\326SISCHFRANZOSISCH (FRANKREICH)", 64, 25);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test16103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16103");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.lang.String str2 = locale1.getDisplayScript();
        java.lang.String str4 = locale1.getExtension('F');
        java.lang.String str5 = locale1.toLanguageTag();
        java.lang.String str6 = locale1.getDisplayVariant();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "zh" + "'", str5, "zh");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test16104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16104");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("NC_hz");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zh_CN" + "'", str1, "zh_CN");
    }

    @Test
    public void test16105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16105");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("                              444444444444444444444444444444444444444444444444444...", "hzhzhzhzhz");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                              444444444444444444444444444444444444444444444444444..." + "'", str2, "                              444444444444444444444444444444444444444444444444444...");
    }

    @Test
    public void test16106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16106");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("0034\\U00", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test16107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16107");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("nglish (united kingdom)", "                                 \\u0059                                  ", 49);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test16108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16108");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("DEFGILMNOQRSTUWXZBBBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCCCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLLBLCLILKLRLSLTLULVLYMMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNNCNENFNGNINLNONPNRNUNZOMPPEPFPGPHPKPLPMPNPRPSPTPWPYQRERORSRURWSSBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUUGUMUSUYUZVVCVEVGVIVNVUWFWSYEYTZZMZW");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "DEFGILMNOQRSTUWXZBBBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCCCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLLBLCLILKLRLSLTLULVLYMMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNNCNENFNGNINLNONPNRNUNZOMPPEPFPGPHPKPLPMPNPRPSPTPWPYQRERORSRURWSSBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUUGUMUSUYUZVVCVEVGVIVNVUWFWSYEYTZZMZW" + "'", str1, "DEFGILMNOQRSTUWXZBBBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCCCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLLBLCLILKLRLSLTLULVLYMMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNNCNENFNGNINLNONPNRNUNZOMPPEPFPGPHPKPLPMPNPRPSPTPWPYQRERORSRURWSSBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUUGUMUSUYUZVVCVEVGVIVNVUWFWSYEYTZZMZW");
    }

    @Test
    public void test16109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16109");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("Canada", "\\u0034", 81);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Canada" + "'", str3, "Canada");
    }

    @Test
    public void test16110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16110");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("italian(italian,eng", (double) 85);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=85.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16111");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("Chinese", "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Chinese" + "'", str2, "Chinese");
    }

    @Test
    public void test16112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16112");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("D");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "d" + "'", str1, "d");
    }

    @Test
    public void test16113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16113");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("\u671d\u9c9c\u6587\u97e9\u56fd)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=??? (??)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16114");
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
            java.util.Locale.Builder builder14 = builder10.setUnicodeLocaleKeyword("", "France");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key:  [at index 0]");
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
    public void test16115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16115");
        java.lang.String str1 = org.apache.commons.lang3.CharUtils.unicodeEscaped((java.lang.Character) 'U');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u0055" + "'", str1, "\\u0055");
    }

    @Test
    public void test16116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16116");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r                                                                                              Deutsch", (int) 't');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r                                                                                              Deutsch" + "'", str2, "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r                                                                                              Deutsch");
    }

    @Test
    public void test16117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16117");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("E             g                          ");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray1);
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Eg" + "'", str3, "Eg");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Eg" + "'", str4, "Eg");
    }

    @Test
    public void test16118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16118");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("\\U0064", "f (KOREAN)", 63, (int) '\ud504');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\U0064f (KOREAN)" + "'", str4, "\\U0064f (KOREAN)");
    }

    @Test
    public void test16119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16119");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("\u30d5\u30e9\u30f3\u30b9\u8a9e\u30ab\u30ca\u30c0)", 103, 'I');
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u30d5\u30e9\u30f3\u30b9\u8a9e\u30ab\u30ca\u30c0)IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII" + "'", str3, "\u30d5\u30e9\u30f3\u30b9\u8a9e\u30ab\u30ca\u30c0)IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
    }

    @Test
    public void test16120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16120");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("de", 395);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test16121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16121");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("tal", "hIAN\\U0020Ih");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test16122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16122");
        java.lang.CharSequence charSequence1 = null;
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "                                                                            fr_FR                  ", charSequence1);
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "                                                                            fr_FR                  " + "'", charSequence2, "                                                                            fr_FR                  ");
    }

    @Test
    public void test16123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16123");
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
        java.util.Locale.Builder builder23 = builder22.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder25 = builder22.addUnicodeLocaleAttribute("frdzhezhfzhgzhizhlzhmzhnzhozhqzhrzhszheeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: frdzhezhfzhgzhizhlzhmzhnzhozhqzhrzhszheeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertTrue("'" + category3 + "' != '" + java.util.Locale.Category.FORMAT + "'", category3.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "ko");
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
    public void test16124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16124");
        java.util.Locale locale1 = java.util.Locale.PRC;
        java.lang.String str2 = locale1.getDisplayVariant();
        java.util.Locale locale3 = java.util.Locale.FRENCH;
        java.util.Locale locale4 = java.util.Locale.ENGLISH;
        java.lang.String str5 = locale4.getDisplayCountry();
        java.lang.String str6 = locale3.getDisplayVariant(locale4);
        java.lang.String str7 = locale1.getDisplayScript(locale4);
        java.util.Locale locale9 = java.util.Locale.FRANCE;
        java.util.Locale locale10 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str11 = locale9.getDisplayScript(locale10);
        java.util.Locale locale12 = java.util.Locale.FRANCE;
        java.util.Locale locale13 = java.util.Locale.ITALIAN;
        java.lang.String str15 = locale13.getExtension('h');
        java.lang.String str16 = locale12.getDisplayScript(locale13);
        java.lang.String str17 = locale12.getISO3Country();
        java.lang.String str18 = locale10.getDisplayVariant(locale12);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.upperCase("\\u0020iTALIANiTALIANiTALIANiTALI", locale10);
        java.lang.String str20 = locale4.getDisplayCountry(locale10);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.upperCase("\u97d3\u6587\u5357\u97d3)", locale4);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "it");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "FRA" + "'", str17, "FRA");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\\U0020ITALIANITALIANITALIANITALI" + "'", str19, "\\U0020ITALIANITALIANITALIANITALI");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\u97d3\u6587\u5357\u97d3)" + "'", str21, "\u97d3\u6587\u5357\u97d3)");
    }

    @Test
    public void test16125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16125");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("...EnglishEnYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYY", "NE_NAILATI_", (int) (byte) 1);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test16126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16126");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("Germa", 54, "Franz\366sisch (Kanada");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Franz\366sisch (KanadaFranz\366sisch (KanadaFranz\366sischGerma" + "'", str3, "Franz\366sisch (KanadaFranz\366sisch (KanadaFranz\366sischGerma");
    }

    @Test
    public void test16127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16127");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("\\\\\\\\\\\\\\\\\\italian_ITALIAN_English", "\uc911\uad6d\uc5b4\uc911\uad6d)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test16128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16128");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "ITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITIT");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test16129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16129");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder5 = builder4.clear();
        java.util.Locale locale6 = builder5.build();
        java.util.Locale.Builder builder7 = builder5.clear();
        java.util.Locale.Builder builder8 = builder7.clear();
        java.util.Locale locale9 = builder8.build();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "fran\347ais (Canada)" + "'", str3, "fran\347ais (Canada)");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
    }

    @Test
    public void test16130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16130");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCcinese (cina)u0069h..CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC", 63, '\ud504');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCcinese (cina)u0069h..CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC" + "'", str3, "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCcinese (cina)u0069h..CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
    }

    @Test
    public void test16131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16131");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "E44444444444444444444444444444444!IHG44444444444444444444444444444444!IH44444444444444444444444444444444!IHSH");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 109 + "'", int1 == 109);
    }

    @Test
    public void test16132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16132");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("                                                                                                                     ");
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + ' ' + "'", char1 == ' ');
    }

    @Test
    public void test16133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16133");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("...! \\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\                      ", "IIIIIIIIII");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test16134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16134");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEnglischCCCCCCCCCCC...", "!ih                            dalleman");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test16135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16135");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("\\u0034\\u00                                   en_C\\u0034\\u00                                    ", "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT       !ih");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test16136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16136");
        java.util.Locale locale3 = new java.util.Locale("\\u0075", "AD4AE4AF4AG4AI4AL4AM4AN4AO4AQ4AR4AS4AT4AU4AW4AX4AZ4BA4BB4BD4BE4BF4BG4BH4BI4BJ4BL4BM4BN4BO4BQ4BR4BS4BT4BV4BW4BY4BZ4CA4CC4CD4CF4CG4CH4CI4CK4CL4CM4CN4CO4CR4CU4CV4CW4CX4CY4CZ4DE4DJ4DK4DM4DO4DZ4EC4EE4EG4EH4ER4ES4ET4FI4FJ4FK4FM4FO4FR4GA4GB4GD4GE4GF4GG4GH4GI4GL4GM4GN4GP4GQ4GR4GS4GT4GU4GW4GY4HK4HM4HN4HR4HT4HU4ID4IE4IL4IM4IN4IO4IQ4IR4IS4IT4JE4JM4JO4JP4KE4KG4KH4KI4KM4KN4KP4KR4KW4KY4KZ4LA4LB4LC4LI4LK4LR4LS4LT4LU4LV4LY4MA4MC4MD4ME4MF4MG4MH4MK4ML4MM4MN4MO4MP4MQ4MR4MS4MT4MU4MV4MW4MX4MY4MZ4NA4NC4NE4NF4NG4NI4NL4NO4NP4NR4NU4NZ4OM4PA4PE4PF4PG4PH4PK4PL4PM4PN4PR4PS4PT4PW4PY4QA4RE4RO4RS4RU4RW4SA4SB4SC4SD4SE4SG4SH4SI4SJ4SK4SL4SM4SN4SO4SR4SS4ST4SV4SX4SY4SZ4TC4TD4TF4TG4TH4TJ4TK4TL4TM4TN4TO4TR4TT4TV4TW4TZ4UA4UG4UM4US4UY4UZ4VA4VC4VE4VG4VI4VN4VU4WF4WS4YE4YT4ZA4ZM4ZW", "ITALIAN_italian_eNGLISH         ITALIAN_!IHitTAiT_ITALIAN_EgAish");
        java.util.Locale.Category category4 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale5 = java.util.Locale.getDefault(category4);
        java.util.Locale locale6 = java.util.Locale.GERMAN;
        java.util.Locale locale7 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str8 = locale6.getDisplayName(locale7);
        java.util.Locale.setDefault(category4, locale7);
        java.util.Locale.Category category10 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale11 = java.util.Locale.getDefault(category10);
        java.lang.String str13 = locale11.getExtension('x');
        java.util.Locale.setDefault(category4, locale11);
        java.util.Locale locale15 = java.util.Locale.getDefault(category4);
        java.util.Locale locale16 = java.util.Locale.ITALY;
        java.lang.String str17 = locale16.getScript();
        java.util.Locale.setDefault(category4, locale16);
        java.util.Locale locale19 = java.util.Locale.getDefault(category4);
        java.util.Locale locale20 = java.util.Locale.getDefault(category4);
        java.lang.String str21 = locale3.getDisplayName(locale20);
        org.junit.Assert.assertEquals(locale3.toString(), "\\u0075_AD4AE4AF4AG4AI4AL4AM4AN4AO4AQ4AR4AS4AT4AU4AW4AX4AZ4BA4BB4BD4BE4BF4BG4BH4BI4BJ4BL4BM4BN4BO4BQ4BR4BS4BT4BV4BW4BY4BZ4CA4CC4CD4CF4CG4CH4CI4CK4CL4CM4CN4CO4CR4CU4CV4CW4CX4CY4CZ4DE4DJ4DK4DM4DO4DZ4EC4EE4EG4EH4ER4ES4ET4FI4FJ4FK4FM4FO4FR4GA4GB4GD4GE4GF4GG4GH4GI4GL4GM4GN4GP4GQ4GR4GS4GT4GU4GW4GY4HK4HM4HN4HR4HT4HU4ID4IE4IL4IM4IN4IO4IQ4IR4IS4IT4JE4JM4JO4JP4KE4KG4KH4KI4KM4KN4KP4KR4KW4KY4KZ4LA4LB4LC4LI4LK4LR4LS4LT4LU4LV4LY4MA4MC4MD4ME4MF4MG4MH4MK4ML4MM4MN4MO4MP4MQ4MR4MS4MT4MU4MV4MW4MX4MY4MZ4NA4NC4NE4NF4NG4NI4NL4NO4NP4NR4NU4NZ4OM4PA4PE4PF4PG4PH4PK4PL4PM4PN4PR4PS4PT4PW4PY4QA4RE4RO4RS4RU4RW4SA4SB4SC4SD4SE4SG4SH4SI4SJ4SK4SL4SM4SN4SO4SR4SS4ST4SV4SX4SY4SZ4TC4TD4TF4TG4TH4TJ4TK4TL4TM4TN4TO4TR4TT4TV4TW4TZ4UA4UG4UM4US4UY4UZ4VA4VC4VE4VG4VI4VN4VU4WF4WS4YE4YT4ZA4ZM4ZW_ITALIAN_italian_eNGLISH         ITALIAN_!IHitTAiT_ITALIAN_EgAish");
        org.junit.Assert.assertTrue("'" + category4 + "' != '" + java.util.Locale.Category.FORMAT + "'", category4.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "de");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "allemand" + "'", str8, "allemand");
        org.junit.Assert.assertTrue("'" + category10 + "' != '" + java.util.Locale.Category.FORMAT + "'", category10.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "fr_CA");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\\u0075 (AD4AE4AF4AG4AI4AL4AM4AN4AO4AQ4AR4AS4AT4AU4AW4AX4AZ4BA4BB4BD4BE4BF4BG4BH4BI4BJ4BL4BM4BN4BO4BQ4BR4BS4BT4BV4BW4BY4BZ4CA4CC4CD4CF4CG4CH4CI4CK4CL4CM4CN4CO4CR4CU4CV4CW4CX4CY4CZ4DE4DJ4DK4DM4DO4DZ4EC4EE4EG4EH4ER4ES4ET4FI4FJ4FK4FM4FO4FR4GA4GB4GD4GE4GF4GG4GH4GI4GL4GM4GN4GP4GQ4GR4GS4GT4GU4GW4GY4HK4HM4HN4HR4HT4HU4ID4IE4IL4IM4IN4IO4IQ4IR4IS4IT4JE4JM4JO4JP4KE4KG4KH4KI4KM4KN4KP4KR4KW4KY4KZ4LA4LB4LC4LI4LK4LR4LS4LT4LU4LV4LY4MA4MC4MD4ME4MF4MG4MH4MK4ML4MM4MN4MO4MP4MQ4MR4MS4MT4MU4MV4MW4MX4MY4MZ4NA4NC4NE4NF4NG4NI4NL4NO4NP4NR4NU4NZ4OM4PA4PE4PF4PG4PH4PK4PL4PM4PN4PR4PS4PT4PW4PY4QA4RE4RO4RS4RU4RW4SA4SB4SC4SD4SE4SG4SH4SI4SJ4SK4SL4SM4SN4SO4SR4SS4ST4SV4SX4SY4SZ4TC4TD4TF4TG4TH4TJ4TK4TL4TM4TN4TO4TR4TT4TV4TW4TZ4UA4UG4UM4US4UY4UZ4VA4VC4VE4VG4VI4VN4VU4WF4WS4YE4YT4ZA4ZM4ZW,ITALIAN,italian,eNGLISH         ITALIAN,!IHitTAiT,ITALIAN,EgAish)" + "'", str21, "\\u0075 (AD4AE4AF4AG4AI4AL4AM4AN4AO4AQ4AR4AS4AT4AU4AW4AX4AZ4BA4BB4BD4BE4BF4BG4BH4BI4BJ4BL4BM4BN4BO4BQ4BR4BS4BT4BV4BW4BY4BZ4CA4CC4CD4CF4CG4CH4CI4CK4CL4CM4CN4CO4CR4CU4CV4CW4CX4CY4CZ4DE4DJ4DK4DM4DO4DZ4EC4EE4EG4EH4ER4ES4ET4FI4FJ4FK4FM4FO4FR4GA4GB4GD4GE4GF4GG4GH4GI4GL4GM4GN4GP4GQ4GR4GS4GT4GU4GW4GY4HK4HM4HN4HR4HT4HU4ID4IE4IL4IM4IN4IO4IQ4IR4IS4IT4JE4JM4JO4JP4KE4KG4KH4KI4KM4KN4KP4KR4KW4KY4KZ4LA4LB4LC4LI4LK4LR4LS4LT4LU4LV4LY4MA4MC4MD4ME4MF4MG4MH4MK4ML4MM4MN4MO4MP4MQ4MR4MS4MT4MU4MV4MW4MX4MY4MZ4NA4NC4NE4NF4NG4NI4NL4NO4NP4NR4NU4NZ4OM4PA4PE4PF4PG4PH4PK4PL4PM4PN4PR4PS4PT4PW4PY4QA4RE4RO4RS4RU4RW4SA4SB4SC4SD4SE4SG4SH4SI4SJ4SK4SL4SM4SN4SO4SR4SS4ST4SV4SX4SY4SZ4TC4TD4TF4TG4TH4TJ4TK4TL4TM4TN4TO4TR4TT4TV4TW4TZ4UA4UG4UM4US4UY4UZ4VA4VC4VE4VG4VI4VN4VU4WF4WS4YE4YT4ZA4ZM4ZW,ITALIAN,italian,eNGLISH         ITALIAN,!IHitTAiT,ITALIAN,EgAish)");
    }

    @Test
    public void test16137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16137");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("CINESE (cINA)", "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rChinesisch (China)", 51);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test16138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16138");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("\u671d\u9c9c\u6587\u97e9\u56fd)", "de                                                                                                                      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u671d\u9c9c\u6587\u97e9\u56fd)" + "'", str2, "\u671d\u9c9c\u6587\u97e9\u56fd)");
    }

    @Test
    public void test16139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16139");
        java.util.Locale locale1 = java.util.Locale.ENGLISH;
        java.lang.String str2 = locale1.getDisplayLanguage();
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.upperCase("!IH", locale1);
        java.lang.String str4 = locale1.getCountry();
        java.lang.String str5 = locale1.getCountry();
        boolean boolean6 = locale1.hasExtensions();
        java.lang.String str7 = locale1.getVariant();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "English" + "'", str2, "English");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!IH" + "'", str3, "!IH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test16140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16140");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("             DE_DE            ", "CCCC\\CCCCC                                                             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "             DE_DE            " + "'", str2, "             DE_DE            ");
    }

    @Test
    public void test16141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16141");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("44444444444444444444444444444444!IHg44444444444444444444444444444444!IH44444444444444444444444444444444!IH", '9');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444444!IHg44444444444444444444444444444444!IH44444444444444444444444444444444!IH" + "'", str2, "44444444444444444444444444444444!IHg44444444444444444444444444444444!IH44444444444444444444444444444444!IH");
    }

    @Test
    public void test16142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16142");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiAlpha('7');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test16143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16143");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder5 = builder4.clear();
        java.util.Locale.Builder builder7 = builder5.setLanguage("ITALIAN");
        java.util.Locale.Builder builder8 = builder7.clear();
        java.util.Locale.Builder builder10 = builder7.addUnicodeLocaleAttribute("CANADA");
        java.util.Locale.Builder builder11 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder12 = builder11.clearExtensions();
        java.util.Locale.Builder builder14 = builder11.setLanguageTag("Italian");
        java.util.Locale locale15 = java.util.Locale.PRC;
        java.lang.String str16 = locale15.getDisplayName();
        java.util.Locale.Builder builder17 = builder11.setLocale(locale15);
        java.lang.String str18 = locale15.getISO3Language();
        java.util.Locale.Builder builder19 = builder7.setLocale(locale15);
        java.util.Locale locale20 = java.util.Locale.GERMAN;
        java.util.Locale locale21 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str22 = locale20.getDisplayName(locale21);
        java.util.Locale.Category category23 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale24 = java.util.Locale.getDefault(category23);
        java.lang.String str25 = locale21.getDisplayVariant(locale24);
        java.lang.String str26 = locale24.toLanguageTag();
        java.util.Locale.Builder builder27 = builder19.setLocale(locale24);
        java.util.Locale.Builder builder29 = builder27.setVariant("CHINA");
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "French (Canada)" + "'", str3, "French (Canada)");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Chinese (China)" + "'", str16, "Chinese (China)");
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "zho" + "'", str18, "zho");
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "de");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "allemand" + "'", str22, "allemand");
        org.junit.Assert.assertTrue("'" + category23 + "' != '" + java.util.Locale.Category.FORMAT + "'", category23.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "it-IT" + "'", str26, "it-IT");
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
    }

    @Test
    public void test16144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16144");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("AzhzhzhzhzhzhzhzhzhzhE             g                          ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AzhzhzhzhzhzhzhzhzhzhE             g" + "'", str1, "AzhzhzhzhzhzhzhzhzhzhE             g");
    }

    @Test
    public void test16145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16145");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("SUen_", (double) 'B');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=66.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16146");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "ADkAEkAFkAGkAIkALkAMkANkAOkAQkARkASkATkAUkAWkAXkAZkBAkBBkBDkBEkBFkBGkBHkBIkBJkBLkBMkBNkBOkBQkBRkBSkBTkBVkBWkBYkBZkCAkCCkCDkCFkCGkCHkCIkCKkCLkCMkCNkCOkCRkCUkCVkCWkCXkCYkCZkDEkDJkDKkDMkDOkDZkECkEEkEGkEHkERkESkETkFIkFJkFKkFMkFOkFRkGAkGBkGDkGEkGFkGGkGHkGIkGLkGMkGNkGPkGQkGRkGSkGTkGUkGWkGYkHKkHMkHNkHRkHTkHUkIDkIEkILkIMkINkIOkIQkIRkISkITkJEkJMkJOkJPkKEkKGkKHkKIkKMkKNkKPkKRkKWkKYkKZkLAkLBkLCkLIkLKkLRkLSkLTkLUkLVkLYkMAkMCkMDkMEkMFkMGkMHkMKkMLkMMkMNkMOkMPkMQkMRkMSkMTkMUkMVkMWkMXkMYkMZkNAkNCkNEkNFkNGkNIkNLkNOkNPkNRkNUkNZkOMkPAkPEkPFkPGkPHkPKkPLkPMkPNkPRkPSkPTkPWkPYkQAkREkROkRSkRUkRWkSAkSBkSCkSDkSEkSGkSHkSIkSJkSKkSLkSMkSNkSOkSRkSSkSTkSVkSXkSYkSZkTCkTDkTFkTGkTHkTJkTKkTLkTMkTNkTOkTRkTTkTVkTWkTZkUAkUGkUMkUSkUYkUZkVAkVCkVEkVGkVIkVNkVUkWFkWSkYEkYTkZAkZMkZW");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test16147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16147");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\\u0065                             ", "eR-GB");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test16148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16148");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("ITALIAN_ITALIAN_ENGLISF", 'k');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ITALIAN_ITALIAN_ENGLISF" + "'", str2, "ITALIAN_ITALIAN_ENGLISF");
    }

    @Test
    public void test16149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16149");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiAlpha('b');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test16150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16150");
        char[] charArray8 = new char[] { 'f', '4' };
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "Chinese (China)", charArray8);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "itTAiT_ITALIAN_EgAish", charArray8);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "d", charArray8);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "nglish (United Kingdom", charArray8);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny("ZH_CNGGGGG", charArray8);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "RA", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "f4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "f4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[f, 4]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test16151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16151");
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
        java.lang.String str21 = locale7.getScript();
        java.lang.Object obj22 = locale7.clone();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "English" + "'", str2, "English");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!IH" + "'", str3, "!IH");
        org.junit.Assert.assertNotNull(charSet4);
        org.junit.Assert.assertTrue("'" + category5 + "' != '" + java.util.Locale.Category.FORMAT + "'", category5.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "it_IT");
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertEquals(obj22.toString(), "it_IT");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj22), "it_IT");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj22), "it_IT");
    }

    @Test
    public void test16152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16152");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaaaaaaaCaaaaaaaaaaaa", '4');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test16153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16153");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("5555555555", 32);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "           5555555555           " + "'", str2, "           5555555555           ");
    }

    @Test
    public void test16154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16154");
        java.util.Locale locale2 = new java.util.Locale("                                                                                                         ", "en-GB");
        java.util.Locale locale3 = locale2.stripExtensions();
        java.util.Locale locale4 = locale2.stripExtensions();
        org.junit.Assert.assertEquals(locale2.toString(), "                                                                                                         _EN-GB");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "                                                                                                         _EN-GB");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "                                                                                                         _EN-GB");
    }

    @Test
    public void test16155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16155");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("ZH_NGGGGG", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test16156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16156");
        java.util.Locale locale1 = new java.util.Locale("e             g                                                                                     ");
        java.lang.String str2 = locale1.getDisplayScript();
        org.junit.Assert.assertEquals(locale1.toString(), "e             g                                                                                     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test16157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16157");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("cHINESISCH(cHINA)");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test16158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16158");
        java.util.Locale locale2 = new java.util.Locale("\\u0034\\u00                                             hcstueD                                             \\u0034\\u00", "\\u0020iItalian\\u0020i");
        java.util.Locale locale3 = java.util.Locale.US;
        java.lang.String str4 = locale3.getScript();
        java.util.Locale locale5 = java.util.Locale.getDefault();
        java.lang.String str6 = locale5.getLanguage();
        java.lang.String str7 = locale5.getScript();
        java.lang.String str8 = locale3.getDisplayScript(locale5);
        java.lang.String str9 = locale2.getDisplayName(locale5);
        java.util.Locale locale10 = locale2.stripExtensions();
        java.lang.String str11 = locale10.getScript();
        org.junit.Assert.assertEquals(locale2.toString(), "\\u0034\\u00                                             hcstued                                             \\u0034\\u00_\\U0020IITALIAN\\U0020I");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\\u0034\\u00                                             hcstued                                             \\u0034\\u00 (\\U0020IITALIAN\\U0020I)" + "'", str9, "\\u0034\\u00                                             hcstued                                             \\u0034\\u00 (\\U0020IITALIAN\\U0020I)");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "\\u0034\\u00                                             hcstued                                             \\u0034\\u00_\\U0020IITALIAN\\U0020I");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test16159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16159");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                                                                    NC_HZ", 16, 371);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test16160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16160");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiControl('\u6cd5');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test16161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16161");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                                           X                                                            ", "  aNIHc   ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test16162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16162");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("ad4ae4af4ag4ai4al4am4an4ao4aq4ar4as4at4au4aw4ax4az4ba4bb4bd4be4bf4bg4bh4bi4bj4bl4bm4bn4bo4bq4br4bs4bt4bv4bw...", "ITALIANITALIAN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ad4ae4af4ag4ai4al4am4an4ao4aq4ar4as4at4au4aw4ax4az4ba4bb4bd4be4bf4bg4bh4bi4bj4bl4bm4bn4bo4bq4br4bs4bt4bv4bw..." + "'", str2, "ad4ae4af4ag4ai4al4am4an4ao4aq4ar4as4at4au4aw4ax4az4ba4bb4bd4be4bf4bg4bh4bi4bj4bl4bm4bn4bo4bq4br4bs4bt4bv4bw...");
    }

    @Test
    public void test16163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16163");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("                                                    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                    " + "'", str1, "                                                    ");
    }

    @Test
    public void test16164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16164");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("d", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test16165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16165");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("                                             hcstueD                                             ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hcstueD" + "'", str1, "hcstueD");
    }

    @Test
    public void test16166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16166");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("Japanese");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test16167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16167");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("\\U0034\\U00                                             HdI!        (\\u0020,iTALICNIUEd#########################################################################################STUd                                             \\U0034\\U00", "TALIAN\\u0023");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test16168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16168");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati", "2IT HI!       _\\U0020_ITALIENISCH####################################################################            2I");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test16169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16169");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\n', 8);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
    }

    @Test
    public void test16170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16170");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("99999\\u0021", "\\FranzosischFranzosisch (Frankreich)0034\\FranzosischFranzosisch (Frankreich)00                                             hFranzosischFranzosisch (Frankreich)                                             \\FranzosischFranzosisch (Frankreich)0034\\FranzosischFranzosisch (Frankreich)00 (\\U0020IITALIAN\\U0020I)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test16171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16171");
        char[] charArray8 = new char[] { ' ', '4' };
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!", charArray8);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "u", charArray8);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "en-US", charArray8);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny("US", charArray8);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\uc911\uad6d)", charArray8);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "k", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test16172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16172");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("allemand", (int) '5');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "allemand" + "'", str2, "allemand");
    }

    @Test
    public void test16173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16173");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("C", "frz\366cz(frkrec)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test16174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16174");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder5 = builder4.clear();
        java.util.Locale.Builder builder7 = builder5.setLanguage("ITALIAN");
        java.util.Locale.Builder builder8 = builder5.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder8.setExtension('U', "\\u0043");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension value: \\u0043 [at index 0]");
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
    public void test16175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16175");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("Zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz\\XTALXAN_ITALIAN_ENGLXSHzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz", "nglish (United Kingdom)", 12);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test16176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16176");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "aaaaaaaaaaaaCaaaaaaaaaaaa", (java.lang.CharSequence) "   \\U0034\\U00");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "aaaaaaaaaaaaCaaaaaaaaaaaa" + "'", charSequence2, "aaaaaaaaaaaaCaaaaaaaaaaaa");
    }

    @Test
    public void test16177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16177");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("EnglishI\\U0020ITALIANITALIANITALIANITALIIT I\\U0020ITALIANITALIANITALIANITALIIT(I\\U0020ITALIANITALIANITALIANITALIITUnitedI\\U0020ITALIANITALIANITALIANITALIIT I\\U0020ITALIANITALIANITALIANITALIITKingdomI\\U0020ITALIANITALIANITALIANITALIIT)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EnglishI\\U0020ITALIANITALIANITALIANITALIIT I\\U0020ITALIANITALIANITALIANITALIIT(I\\U0020ITALIANITALIANITALIANITALIITUnitedI\\U0020ITALIANITALIANITALIANITALIIT I\\U0020ITALIANITALIANITALIANITALIITKingdomI\\U0020ITALIANITALIANITALIANITALIIT)" + "'", str1, "EnglishI\\U0020ITALIANITALIANITALIANITALIIT I\\U0020ITALIANITALIANITALIANITALIIT(I\\U0020ITALIANITALIANITALIANITALIITUnitedI\\U0020ITALIANITALIANITALIANITALIIT I\\U0020ITALIANITALIANITALIANITALIITKingdomI\\U0020ITALIANITALIANITALIANITALIIT)");
    }

    @Test
    public void test16178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16178");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("\\u006b", "Cinese (Cina)\\u0069h..", 23, 151);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\u006bCinese (Cina)\\u0069h.." + "'", str4, "\\u006bCinese (Cina)\\u0069h..");
    }

    @Test
    public void test16179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16179");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf(" \\U0078 ", 117, (int) 'u');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test16180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16180");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "\u97d3\u6587\u5357\u97d3)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test16181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16181");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("Deutsch", "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZW", 52);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, "IT", (int) 'E', (int) (byte) -1);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.endsWithAny("", strArray5);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.stripAll(strArray5, "nailati");
        boolean boolean13 = org.apache.commons.lang3.StringUtils.endsWithAny("                                                                    \\U0020ItalianItalianItalianItali", strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test16182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16182");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder15 = builder13.setRegion("\\u0034\\u00                                             hcstueD                                             \\u0034\\u00");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: \\u0034\\u00                                             hcstueD                                             \\u0034\\u00 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test16183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16183");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("BFIBGIBHIBIIBJIBLIBMIBNIBOIBQIBRIBSIBTIBVIBWIBYIBZICAICCICDICFICGICHICIICKICLICMICNICOICRICUICVICWICXICYICZIDEIDJIDKIDMIDOIDZIECIEEIEGIEHIERIESIETIFIIFJIFKIFMIFOIFRIGAIGBIGDIGEIGFIGGIGHIGIIGLIGMIGNIGPIGQIGRIGSIGTIGUIGWIGYIHKIHM", "\uc774\ud0c8\ub9ac\uc544\uc5b4", 53, 267);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\uc774\ud0c8\ub9ac\uc544\uc5b4" + "'", str4, "\uc774\ud0c8\ub9ac\uc544\uc5b4");
    }

    @Test
    public void test16184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16184");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("TITcnarfesecnarfesecnarf5700u\\rfesecnarfesecnarfesecnarf5700u\\rfesecnarfesecnarfesecnarf5700u\\rfesecnarfesecnarfesecnarf", "...cccaczbybwbvbtbsbrbqbobnbmblbjbibhbgbfbebdbbbabzaxawauatasaraqaoan...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test16185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16185");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder18 = builder8.setVariant("!IH!IH\\\\\\\\\\\\\\");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: !IH!IH\\\\\\\\\\\\\\ [at index 0]");
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
    }

    @Test
    public void test16186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16186");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("\\u0065", "...78zhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzh..                                                          ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test16187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16187");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("                                NI                                 bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb", "!ih                            dllm!ih                            dllm!ih                          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test16188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16188");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("n       nn");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "n       nn" + "'", str1, "n       nn");
    }

    @Test
    public void test16189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16189");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("!ih    Deutsc", ")dnK( hcsis\366znrF");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test16190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16190");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("\\u0061ItalienischItalienischItalienischItalienischItalienischItalienischItalienischItalienischItalie");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test16191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16191");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "zH_CN");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test16192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16192");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                                                                                              ITALIEITAL", 163, 't');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ttttttttttttttttttttt                                                                                                              ITALIEITALtttttttttttttttttttttt" + "'", str3, "ttttttttttttttttttttt                                                                                                              ITALIEITALtttttttttttttttttttttt");
    }

    @Test
    public void test16193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16193");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder5 = builder4.clear();
        java.util.Locale.Builder builder7 = builder5.setLanguage("ITALIAN");
        java.util.Locale.Builder builder8 = builder5.clear();
        java.util.Locale locale9 = builder5.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder5.setVariant("                                                                    \\U0020ItalianItalianItalianItali");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant:                                                                     \\U0020ItalianItalianItalianItali [at index 0]");
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
    }

    @Test
    public void test16194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16194");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("               china                                                                                                      ", "\\u0032");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test16195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16195");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("French (Canadad", "\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0...", "i\\u0020italianitalianitalianitaliit         \\xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "French (Canadad" + "'", str3, "French (Canadad");
    }

    @Test
    public void test16196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16196");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC", 96);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC                       " + "'", str2, "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC                       ");
    }

    @Test
    public void test16197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16197");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("hcstueD", "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hcstueD" + "'", str2, "hcstueD");
    }

    @Test
    public void test16198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16198");
        java.util.Locale locale1 = java.util.Locale.GERMAN;
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale1.getDisplayName(locale2);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.upperCase("HI!", locale1);
        java.lang.String str5 = locale1.getScript();
        java.lang.String str6 = locale1.toLanguageTag();
        java.lang.String str7 = locale1.getCountry();
        java.lang.String str8 = locale1.getDisplayCountry();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "de");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "allemand" + "'", str3, "allemand");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HI!" + "'", str4, "HI!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "de" + "'", str6, "de");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test16199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16199");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("2iT hi!       _\\U0020_Italienisch####################################################################            2i", "Italienisch#########################################################################################", (int) 'n');
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test16200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16200");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("deutsch");
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("fr-FR", strArray3);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray3);
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC                       ", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "deutsch" + "'", str5, "deutsch");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test16201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16201");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("HI!", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16202");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("esenihC");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test16203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16203");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                                         ", "    \\     ", (int) 'C');
        boolean boolean6 = org.apache.commons.lang3.StringUtils.endsWithAny("\\u0061ItalienischItalienischItalienischItalienischItalienischItalienischItalienischItalienischItalie", strArray5);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.split("Franzosisch (Frankreich)");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEach("adaeafagaialamanaoaqarasatauawaxazbabbbdbebfbgbhbibjblbmbnbobqbrbsbtbvbwbybzcacccdcfcgchcickclcmcncocrcucvcwcxcyczdedh...", strArray5, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test16204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16204");
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
        java.util.Locale.setDefault(locale39);
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
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "French" + "'", str33, "French");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(strSet36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
    }

    @Test
    public void test16205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16205");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("CHINESExxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", 109, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test16206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16206");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("        \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "        \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\..." + "'", str1, "        \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...");
    }

    @Test
    public void test16207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16207");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("...\r\r\r\r\r\r\r\r...", "", "\u6cd5\u570b");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...\r\r\r\r\r\r\r\r..." + "'", str3, "...\r\r\r\r\r\r\r\r...");
    }

    @Test
    public void test16208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16208");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("zhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhz\\U0078zhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzh", "HI!HI     \\u005cggggggggggggggggggggggggggggggggggggg", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test16209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16209");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "allAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmand");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "allAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmand" + "'", str1, "allAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmand");
    }

    @Test
    public void test16210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16210");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("f (KOREAN)", "...78zhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzh..                                                          ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test16211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16211");
        java.util.Locale locale1 = java.util.Locale.ENGLISH;
        java.lang.String str2 = locale1.getDisplayLanguage();
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.upperCase("!IH", locale1);
        java.lang.String str4 = locale1.getCountry();
        java.lang.String str5 = locale1.getCountry();
        boolean boolean6 = locale1.hasExtensions();
        java.lang.String str7 = locale1.toLanguageTag();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "English" + "'", str2, "English");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!IH" + "'", str3, "!IH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "en" + "'", str7, "en");
    }

    @Test
    public void test16212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16212");
        java.util.Locale locale1 = java.util.Locale.ITALIAN;
        java.util.Set<java.lang.Character> charSet2 = locale1.getExtensionKeys();
        java.lang.String str3 = locale1.getVariant();
        java.lang.String str4 = locale1.getDisplayName();
        java.lang.String str5 = locale1.getCountry();
        java.util.Set<java.lang.String> strSet6 = locale1.getUnicodeLocaleKeys();
        java.util.Set<java.lang.String> strSet7 = locale1.getUnicodeLocaleKeys();
        java.util.Locale locale8 = java.util.Locale.ITALIAN;
        java.util.Set<java.lang.Character> charSet9 = locale8.getExtensionKeys();
        java.lang.String str10 = locale8.getVariant();
        java.lang.String str11 = locale8.getDisplayName();
        java.lang.String str12 = locale8.getCountry();
        java.util.Set<java.lang.String> strSet13 = locale8.getUnicodeLocaleKeys();
        java.util.Set<java.lang.String> strSet14 = locale8.getUnicodeLocaleKeys();
        java.lang.String str15 = locale1.getDisplayLanguage(locale8);
        java.util.Locale locale17 = java.util.Locale.FRANCE;
        java.util.Locale locale18 = java.util.Locale.ITALIAN;
        java.lang.String str20 = locale18.getExtension('h');
        java.lang.String str21 = locale17.getDisplayScript(locale18);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.lowerCase("HI!       ", locale17);
        java.lang.String str24 = locale17.getExtension('z');
        java.lang.String str25 = locale1.getDisplayName(locale17);
        java.lang.String str26 = org.apache.commons.lang3.StringUtils.lowerCase("                                                               \\u002", locale17);
        boolean boolean27 = locale17.hasExtensions();
        java.util.Set<java.lang.String> strSet28 = locale17.getUnicodeLocaleKeys();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it");
        org.junit.Assert.assertNotNull(charSet2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Italian" + "'", str4, "Italian");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "it");
        org.junit.Assert.assertNotNull(charSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Italian" + "'", str11, "Italian");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "italiano" + "'", str15, "italiano");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "it");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!       " + "'", str22, "hi!       ");
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "italien" + "'", str25, "italien");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "                                                               \\u002" + "'", str26, "                                                               \\u002");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(strSet28);
    }

    @Test
    public void test16213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16213");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("        \\u005c         ", "EcanadaGcanadacanadaSH                                                                                                   ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
    }

    @Test
    public void test16214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16214");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "        \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "        \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\..." + "'", str1, "        \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...");
    }

    @Test
    public void test16215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16215");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("eAGAASHuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", 'e');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AGAASHuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str2, "AGAASHuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test16216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16216");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf(")))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))italian", 63);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test16217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16217");
        java.util.Locale locale0 = java.util.Locale.ROOT;
        java.lang.String str1 = locale0.getISO3Country();
        java.lang.String str2 = locale0.getDisplayVariant();
        java.lang.String str3 = locale0.getVariant();
        java.lang.String str4 = locale0.getISO3Language();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test16218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16218");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "Italia                                                               ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test16219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16219");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\0020iTALIANiTALIANiTALIANiTALzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz", "Frankreich");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test16220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16220");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("f (KOREAN)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "f(KOREAN)" + "'", str1, "f(KOREAN)");
    }

    @Test
    public void test16221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16221");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA             FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA             FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA             FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA2");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test16222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16222");
        char[] charArray10 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZW", charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                              444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444en", charArray10);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "ta...", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4##a a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4##a a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, #, #, a,  , a]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test16223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16223");
        java.util.Locale locale2 = new java.util.Locale("France", "       !IH");
        java.util.Locale locale3 = java.util.Locale.CHINESE;
        java.util.Locale locale4 = java.util.Locale.FRENCH;
        java.lang.String str5 = locale4.getDisplayName();
        java.lang.String str7 = locale4.getExtension('C');
        java.lang.String str8 = locale3.getDisplayLanguage(locale4);
        java.util.Locale.setDefault(locale3);
        java.lang.String str10 = locale2.getDisplayVariant(locale3);
        java.lang.String str11 = locale2.toLanguageTag();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = locale2.getUnicodeLocaleType("und-itTAiT-ITALIAN-EgAish");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: und-itTAiT-ITALIAN-EgAish");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "france_       !IH");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "French" + "'", str5, "French");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chinois" + "'", str8, "chinois");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "france" + "'", str11, "france");
    }

    @Test
    public void test16224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16224");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder6 = builder1.setLanguage("und");
        java.util.Locale.Builder builder7 = builder1.clear();
        java.util.Locale locale9 = java.util.Locale.JAPANESE;
        java.lang.String str10 = locale9.getISO3Country();
        java.lang.String str11 = locale9.getVariant();
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.upperCase("it", locale9);
        java.util.Locale.Builder builder13 = builder1.setLocale(locale9);
        java.util.Locale.Builder builder15 = builder1.removeUnicodeLocaleAttribute("emand");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder17 = builder1.setScript("hi!       _\\U0020_Italienisch####################################################################...");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: hi!       _\\U0020_Italienisch####################################################################... [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u6cd5\u6587\u52a0\u62ff\u5927)" + "'", str3, "\u6cd5\u6587\u52a0\u62ff\u5927)");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "IT" + "'", str12, "IT");
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test16225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16225");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT       !ih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test16226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16226");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("\\u0045", "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC\\xtalxan_ITALIAN_EnglxshCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u0045" + "'", str2, "\\u0045");
    }

    @Test
    public void test16227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16227");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("CHINESE (CHINA)CHINESE (CHINA)CHINESE (CHINA)CHINESE (CHINA)CHINESE (CHINA)CHINESE (CHINA)CHINESen_C", "RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR (italian,english)                                       (italian,english)                                       (italian,english)                                       (italian,english)                                       (italian,english)                                      i (italian,english)                                      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CHINESE (CHINA)CHINESE (CHINA)CHINESE (CHINA)CHINESE (CHINA)CHINESE (CHINA)CHINESE (CHINA)CHINESen_C" + "'", str2, "CHINESE (CHINA)CHINESE (CHINA)CHINESE (CHINA)CHINESE (CHINA)CHINESE (CHINA)CHINESE (CHINA)CHINESen_C");
    }

    @Test
    public void test16228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16228");
        java.lang.String[] strArray0 = null;
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.stripAll(strArray0, "z...frn");
        org.junit.Assert.assertNull(strArray2);
    }

    @Test
    public void test16229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16229");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("...78zhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzh..");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...78ZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZH.." + "'", str1, "...78ZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZH..");
    }

    @Test
    public void test16230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16230");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\351encor\351encor\351encor\351", "78");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test16231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16231");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("en-CA", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test16232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16232");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("tititititiAiiiiiiiiiiiiiiiiitalian_italian_englishiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiitititititit", "aDAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...", "AD4AE4AF4AG4AI4AL4AM4AN4AO4AQ4AR4AS4AT4AU4AW4AX4AZ4BA4BB4BD4BE4BF4BG4BH4BI4BJ4BL4BM4BN4BO4BQ4BR4BS4BT4BV4BW...R-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAA", (int) 'z');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "tititititiAiiiiiiiiiiiiiiiiitalian_italian_englishiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiitititititit" + "'", str4, "tititititiAiiiiiiiiiiiiiiiiitalian_italian_englishiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiitititititit");
    }

    @Test
    public void test16233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16233");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("JP", "ITALIAN4");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test16234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16234");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\aUa0046", (java.lang.CharSequence) "Eegeesh");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test16235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16235");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("\\u00de\\u00\\u00de\\u00\\u00d         INGLESE        ", 15);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u00de\\u00\\u00de\\u00\\u00d         INGLESE        " + "'", str2, "\\u00de\\u00\\u00de\\u00\\u00d         INGLESE        ");
    }

    @Test
    public void test16236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16236");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDH...", "ADHAEHAFHAGHAIHALHAMHANHAOHAQHARHASHATHAUHAWHAXHAZHBAHBBHBDHBEHBFHBGHBHHBIHBJHBLHBMHBNHBOHBQHBRHBSHBTHBVHBWHBYHBZHCAHCCHCDHCFHCGHCHHCIHCKHCLHCMHCNHCOHCRHCUHCVHCWHCXHCYHCZHDEHDJHDKHDMHDOHDZHECHEEHEGHEHHERHESHETHFIHFJHFKHFMHFOHFRHGAHGBHGDHGEHGFHGGHGHHGIHGLHGMHGNHGPHGQHGRHGSHGTHGUHGWHGYHHKHHMHHNHHRHHTHHUHIDHIEHILHIMHINHIOHIQHIRHISHITHJEHJMHJOHJPHKEHKGHKHHKIHKMHKNHKPHKRHKWHKYHKZHLAHLBHLCHLIHLKHLRHLSHLTHLUHLVHLYHMAHMCHMDHMEHMFHMGHMHHMKHMLHMMHMNHMOHMPHMQHMRHMSHMTHMUHMVHMWHMXHMYHMZHNAHNCHNEHNFHNGHNIHNLHNOHNPHNRHNUHNZHOMHPAHPEHPFHPGHPHHPKHPLHPMHPNHPRHPSHPTHPWHPYHQAHREHROHRSHRUHRWHSAHSBHSCHSDHSEHSGHSHHSIHSJHSKHSLHSMHSNHSOHSRHSSHSTHSVHSXHSYHSZHTCHTDHTFHTGHTHHTJHTKHTLHTMHTNHTOHTRHTTHTVHTWHTZHUAHUGHUMHUSHUYHUZHVAHVCHVEHVGHVIHVNHVUHWFHWSHYEHYTHZAHZMHZW");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test16237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16237");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.FRANCE;
        java.util.Locale locale3 = java.util.Locale.ITALIAN;
        java.lang.String str5 = locale3.getExtension('h');
        java.lang.String str6 = locale2.getDisplayScript(locale3);
        java.util.Locale locale7 = locale2.stripExtensions();
        java.util.Locale.setDefault(category0, locale2);
        java.util.Locale locale9 = java.util.Locale.getDefault(category0);
        java.util.Locale locale10 = java.util.Locale.CANADA;
        java.util.Locale locale11 = locale10.stripExtensions();
        java.util.Locale.setDefault(category0, locale11);
        java.lang.String str13 = locale11.getVariant();
        java.lang.String str14 = locale11.getScript();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
// flaky:         org.junit.Assert.assertEquals(locale1.toString(), "");
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
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test16238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16238");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("TALY", "HcsineilatI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test16239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16239");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "hzhzhzhzhz");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test16240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16240");
        char[] charArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("\uc601\uc5b4", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test16241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16241");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiitalian_italian_englishiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii", 'A');
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "tali...an");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test16242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16242");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("4444ALLEMAND 4444", "\\U0020ITALIANITALIANITALIANITAL", (int) 'R');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test16243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16243");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC", "Italienisch#########################################################################################", 3);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC" + "'", str4, "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
    }

    @Test
    public void test16244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16244");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "tenenco");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test16245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16245");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("Iitalian(italian,eng", (int) 'b', "\u52a0\u62ff\u5927eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u52a0\u62ff\u5927\u52a0\u62ff\u5927eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee" + "'", str3, "\u52a0\u62ff\u5927\u52a0\u62ff\u5927eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee");
    }

    @Test
    public void test16246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16246");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "             ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test16247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16247");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("Cinese (Cina)\\u0069h..", 4, 395);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test16248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16248");
        java.util.Locale locale1 = java.util.Locale.ENGLISH;
        java.lang.String str2 = locale1.getDisplayLanguage();
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.upperCase("!IH", locale1);
        java.lang.String str5 = locale1.getExtension('x');
        java.util.Locale locale8 = new java.util.Locale("\\u0020iTALIANiTALIANiTALIANiTALI", "French (Canada)");
        java.lang.String str9 = locale1.getDisplayScript(locale8);
        java.lang.String str11 = locale1.getExtension('a');
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
        java.lang.String str41 = locale29.getVariant();
        java.util.Locale locale43 = new java.util.Locale("francese (Canada)");
        java.lang.String str44 = locale29.getDisplayName(locale43);
        boolean boolean45 = locale43.hasExtensions();
        java.lang.String str46 = locale1.getDisplayLanguage(locale43);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "English" + "'", str2, "English");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!IH" + "'", str3, "!IH");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals(locale8.toString(), "\\u0020italianitalianitalianitali_FRENCH (CANADA)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str11);
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
// flaky:         org.junit.Assert.assertEquals(locale28.toString(), "");
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
        org.junit.Assert.assertEquals(locale43.toString(), "francese (canada)");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "French (France)" + "'", str44, "French (France)");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "English" + "'", str46, "English");
    }

    @Test
    public void test16249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16249");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("\\u000a", "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rFRANZ...", "ZH_cnFrench (Canada)AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 71);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\u000a" + "'", str4, "\\u000a");
    }

    @Test
    public void test16250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16250");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("Hi!       _\\U0020_Italienisch#########################################################################################", 55, "I");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Hi!       _\\U0020_Italienisch#########################################################################################" + "'", str3, "Hi!       _\\U0020_Italienisch#########################################################################################");
    }

    @Test
    public void test16251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16251");
        java.util.Locale locale3 = new java.util.Locale("                                                                                               EN", "", "hi!        (\\U0020,Italienisch#####Franzosisch (Kanada)##############################################################################");
        org.junit.Assert.assertEquals(locale3.toString(), "                                                                                               en__hi!        (\\U0020,Italienisch#####Franzosisch (Kanada)##############################################################################");
    }

    @Test
    public void test16252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16252");
        java.util.Locale locale3 = new java.util.Locale("KoreanADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDhcstueDKoreanADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDB", "         ITALIAN_italian_eNGLISH         ITALIAN_!IH", "             \\u0049                                           xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        org.junit.Assert.assertEquals(locale3.toString(), "koreanadaeafagaialamanaoaqarasatauawaxazbabbbdhcstuedkoreanadaeafagaialamanaoaqarasatauawaxazbabbbdb_         ITALIAN_ITALIAN_ENGLISH         ITALIAN_!IH_             \\u0049                                           xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
    }

    @Test
    public void test16253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16253");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("talian");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test16254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16254");
        java.util.Locale locale2 = new java.util.Locale("\\u0020iTALIANiTALIANiTALIANiT", "fr-CA");
        org.junit.Assert.assertEquals(locale2.toString(), "\\u0020italianitalianitalianit_FR-CA");
    }

    @Test
    public void test16255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16255");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("ian\\u0020", "", "...#####################################################################");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test16256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16256");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("             hcsineilati             dddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd", "FR_CA                             ...!       \\U0034\\U0034\\U0034\\U0034\\U0034\\U0034\\U0034\\U0034\\U0034\\     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "             hcsineilati             dddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd" + "'", str2, "             hcsineilati             dddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd");
    }

    @Test
    public void test16257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16257");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("IIIIIIIII", "cor\351en (cor\351e du sud) (RA)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test16258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16258");
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
        java.util.Locale locale15 = java.util.Locale.ENGLISH;
        java.lang.String str16 = locale15.getDisplayLanguage();
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.upperCase("!IH", locale15);
        java.lang.String str18 = locale15.getCountry();
        java.lang.String str19 = locale15.getCountry();
        boolean boolean20 = locale15.hasExtensions();
        java.util.Set<java.lang.String> strSet21 = locale15.getUnicodeLocaleAttributes();
        java.lang.String str22 = locale15.getISO3Language();
        java.lang.String str23 = locale15.getScript();
        java.util.Locale.Builder builder24 = builder8.setLocale(locale15);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder26 = builder8.setScript("eCANADAgCANADACANADAsh                                                                                                  ");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: eCANADAgCANADACANADAsh                                                                                                   [at index 0]");
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
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "italian");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chinois (Chine)" + "'", str11, "chinois (Chine)");
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "en");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "anglais" + "'", str16, "anglais");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "!IH" + "'", str17, "!IH");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "eng" + "'", str22, "eng");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(builder24);
    }

    @Test
    public void test16259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16259");
        java.util.Locale locale2 = new java.util.Locale("                ", "\u30d5\u30e9\u30f3\u30b9\u8a9e\u30ab\u30ca\u30c0)IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "\u30d5\u30e9\u30f3\u30b9\u8a9e\u30ab\u30ca\u30c0)IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
    }

    @Test
    public void test16260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16260");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("44444444444\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITALHcsineilatI444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITALHcsineilatI444444444444" + "'", str1, "44444444444\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITALHcsineilatI444444444444");
    }

    @Test
    public void test16261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16261");
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
        java.util.Locale locale25 = java.util.Locale.getDefault();
        java.lang.String str26 = locale25.getDisplayScript();
        java.util.Locale locale27 = java.util.Locale.FRANCE;
        java.util.Locale locale28 = java.util.Locale.ITALIAN;
        java.lang.String str30 = locale28.getExtension('h');
        java.lang.String str31 = locale27.getDisplayScript(locale28);
        boolean boolean32 = locale27.hasExtensions();
        java.lang.String str33 = locale27.getVariant();
        java.util.Set<java.lang.Character> charSet34 = locale27.getExtensionKeys();
        java.lang.String str35 = locale27.toLanguageTag();
        java.lang.String str36 = locale25.getDisplayCountry(locale27);
        java.lang.String str37 = org.apache.commons.lang3.StringUtils.lowerCase("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444en", locale25);
        java.lang.String str38 = locale25.getISO3Country();
        java.lang.String str40 = locale25.getExtension('a');
        boolean boolean41 = locale19.equals((java.lang.Object) str40);
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
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "de");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "it");
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(charSet34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "fr-FR" + "'", str35, "fr-FR");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444en" + "'", str37, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444en");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test16262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16262");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("8600u\\", "FRANZ\326SISCHF(FRANKREICH)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test16263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16263");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("             ", "d8                                                                                                                      ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test16264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16264");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("deutsch");
        double double2 = languageRange1.getWeight();
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("FranzosischFranzosisch (Frankreich)", "CHN");
        boolean boolean6 = languageRange1.equals((java.lang.Object) "FranzosischFranzosisch (Frankreich)");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test16265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16265");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("000000000000000000000000000000000000000000000000000000000000000CCCC\\CCCC", 16, "gence");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "000000000000000000000000000000000000000000000000000000000000000CCCC\\CCCC" + "'", str3, "000000000000000000000000000000000000000000000000000000000000000CCCC\\CCCC");
    }

    @Test
    public void test16266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16266");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            " + "'", str1, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ");
    }

    @Test
    public void test16267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16267");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("Egsh", "R");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Egsh" + "'", str2, "Egsh");
    }

    @Test
    public void test16268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16268");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "ad4ae4af4ag4ai4al4am4an4ao4aq4ar4as4at4au4aw4ax4az4ba4bb4bd4be4bf4bg4bh4bi4bj4bl4bm4bn4bo4bq4br4bs4bt4bv4bw4by4bz4ca4cc4cd4cf4cg4ch4ci4ck4cl4cm4cn4co4cr4cu4cv4cw4cx4cy4cz4de4dj4dk4dm4do4dz4ec4ee4eg4eh4er4es4et4fi4fj4fk4fm4fo4fr4ga4gb4gd4ge4gf4gg4gh4gi4gl4gm4gn4gp4gq4gr4gs4gt4gu4gw4gy4hk4hm4hn4hr4ht4hu4id4ie4il4im4in4io4iq4ir4is4it4je4jm4jo4jp4ke4kg4kh4ki4km4kn4kp4kr4kw4ky4kz4la4lb4lc4li4lk4lr4ls4lt4lu4lv4ly4ma4mc4md4me4mf4mg4mh4mk4ml4mm4mn4mo4mp4mq4mr4ms4mt4mu4mv4mw4mx4my4mz4na4nc4ne4nf4ng4ni4nl4no4np4nr4nu4nz4om4pa4pe4pf4pg4ph4pk4pl4pm4pn4pr4ps4pt4pw4py4qa4re4ro4rs4ru4rw4sa4sb4sc4sd4se4sg4sh4si4sj4sk4sl4sm4sn4so4sr4ss4st4sv4sx4sy4sz4tc4td4tf4tg4th4tj4tk4tl4tm4tn4to4tr4tt4tv4tw4tz4ua4ug4um4us4uy4uz4va4vc4ve4vg4vi4vn4vu4wf4ws4ye4yt4za4zm4zw");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test16269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16269");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("\\u0020TALIANTALIANTALIANiTALI", "!_\\U0020_Itle", 200);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\u0020TALIANTALIANTALIANiTALI" + "'", str3, "\\u0020TALIANTALIANTALIANiTALI");
    }

    @Test
    public void test16270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16270");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("!       allemandtalienischallemanditalian_TALAN_Eng    \\     ADAEAFAGAALA", 'Y');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test16271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16271");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "Eagaas\\\\\\\\\\\\\\HI!HI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test16272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16272");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("X", 23);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test16273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16273");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("#AAAAA", (double) 'i');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=105.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16274");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("TAiT_ITALIAN_EgAish");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "TAiT_ITALIAN_EgAish" + "'", str1, "TAiT_ITALIAN_EgAish");
    }

    @Test
    public void test16275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16275");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz\\u0065", "!_\\U0020_itle########################################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!_\\U0020_itle########################################################################################" + "'", str2, "!_\\U0020_itle########################################################################################");
    }

    @Test
    public void test16276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16276");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("9hhhhhhhhhh_\\U0078", 111);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test16277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16277");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("        ESELGNI         d00u\\00u\\ed00u\\00u\\ed00u\\", "\uc601\uc5b4                                                                                                  ", 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "        ESELGNI         d00u\\00u\\ed00u\\00u\\ed00u\\" + "'", str3, "        ESELGNI         d00u\\00u\\ed00u\\00u\\ed00u\\");
    }

    @Test
    public void test16278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16278");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\u6cd5\u6587");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test16279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16279");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiAlphaUpper('\u6cd5');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test16280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16280");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("Undetermined", 62);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Undetermined" + "'", str2, "Undetermined");
    }

    @Test
    public void test16281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16281");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("ZH_cn");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfAny("                                      fra", strArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, 'u');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ZH_cn" + "'", str5, "ZH_cn");
    }

    @Test
    public void test16282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16282");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("latIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIH", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=latihhcsineilatihhcsineilatihhcsineilatihhcsineilatihhcsineilatihhcsineilatihhcsineilatihhcsineilatihhcsineilatihhcsineilatihhcsineilatihhcsineilatihhcsineilatihhcsineilatihhcsineilatihhcsineilatihhcsineilatihhcsineilatihhcsineilatihhcsineilatihhcsineilatihhcsineilatihhcsineilatihhcsineilatihhcsineilatihhcsineilatih");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16283");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("NI         d00u\\00u\\ed00u\\00u\\ed00u\\G        ESEL");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "NI d00u\\00u\\ed00u\\00u\\ed00u\\G ESEL" + "'", str1, "NI d00u\\00u\\ed00u\\00u\\ed00u\\G ESEL");
    }

    @Test
    public void test16284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16284");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens(" \\U0078 ", "EAGAASH", (int) ' ');
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test16285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16285");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.lang.String str3 = locale1.getExtension('x');
        java.lang.String str4 = locale1.getDisplayLanguage();
        java.lang.String str5 = locale1.getLanguage();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
// flaky:         org.junit.Assert.assertEquals(locale1.toString(), "italian");
        org.junit.Assert.assertNull(str3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "italian" + "'", str4, "italian");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "italian" + "'", str5, "italian");
    }

    @Test
    public void test16286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16286");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder4 = builder2.setScript("");
        java.util.Locale.Builder builder5 = builder4.clear();
        java.util.Locale.Builder builder6 = builder5.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder5.setExtension('Y', "Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension value: Frnzo?sisch (Knd)Frnzo?sisch (Knd)Frnzo?sisch (Knd)Frnzo?sisch (Knd)Frnzo?sisch (Knd)Frnzo?sisch (Knd)Frnzo?sisch (Knd)Frnzo?sisch (Knd)Frnzo?sisch (Knd)Frnzo?sisch (Knd)Frnzo?sisch (Knd) [at index 0]");
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
    public void test16287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16287");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "R0                                               nailati             ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "r0                                               nailati             " + "'", str1, "r0                                               nailati             ");
    }

    @Test
    public void test16288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16288");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder22 = builder20.setScript("                                      ITALIAN (italian,eNGLISH)                                      ");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script:                                       ITALIAN (italian,eNGLISH)                                       [at index 0]");
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
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "de");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "allemand" + "'", str12, "allemand");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "de");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "German" + "'", str15, "German");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Italian" + "'", str17, "Italian");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "it");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(builder20);
    }

    @Test
    public void test16289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16289");
        java.util.Locale locale1 = java.util.Locale.FRANCE;
        java.util.Locale locale2 = java.util.Locale.ITALIAN;
        java.lang.String str4 = locale2.getExtension('h');
        java.lang.String str5 = locale1.getDisplayScript(locale2);
        boolean boolean6 = locale1.hasExtensions();
        java.lang.String str7 = locale1.getVariant();
        java.util.Set<java.lang.Character> charSet8 = locale1.getExtensionKeys();
        java.lang.String str9 = locale1.toLanguageTag();
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.upperCase("\\U0020", locale1);
        java.lang.String str11 = locale1.toLanguageTag();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "it");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charSet8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "fr-FR" + "'", str9, "fr-FR");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\\U0020" + "'", str10, "\\U0020");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "fr-FR" + "'", str11, "fr-FR");
    }

    @Test
    public void test16290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16290");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("cccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc...", "hi!       dItalienischditalian_ITALIAN_EnglishdHI!dhi!dADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...d\\u0034dHI!dItaliand\\u0061d\\u0023dhi!diTALIANdChinese (China)dhi!dzh_CNdiTALIANdendItalienisch", "...                             ", 499);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "cccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc..." + "'", str4, "cccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc...");
    }

    @Test
    public void test16291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16291");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("    \\     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\" + "'", str1, "\\");
    }

    @Test
    public void test16292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16292");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("NC_hz\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\aUa0046");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test16293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16293");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("hsiAgE_NAILATI_TiATtiHI!_NAILATI         HSILGNe_nailati_NAILATI         HHHHHHHHH", 'I');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "         HHHHHHHHHILATILGNe_nailati_NAI         HSILATI!_NAI_TiATtiHILATIhsiAgE_NA" + "'", str2, "         HHHHHHHHHILATILGNe_nailati_NAI         HSILATI!_NAI_TiATtiHILATIhsiAgE_NA");
    }

    @Test
    public void test16294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16294");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\\u0020iItalian\\u0020i                                                 ", "\\u00de\\u00\\u\\u00de\\u00\\u", (int) 'z');
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("AzhzhzhzhzhzhzhzhzhzhE             g", "TIT", 15);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray8, "itTAiT_ITALIAN_EgAish");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("Eg", strArray4, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 11 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test16295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16295");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "FRFRFRFRFRFRFRFRFRFRFRFRFde_DEFRFRFRFRFRFRFRFRFRFRFRFRFR");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test16296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16296");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("\\u", "2E             giTALIANiTALIANi");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test16297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16297");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("NNNNNNNNNNNNNNNNNN", 99);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NNNNNNNNNNNNNNNNNN                                                                                 " + "'", str2, "NNNNNNNNNNNNNNNNNN                                                                                 ");
    }

    @Test
    public void test16298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16298");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "#AAAAA", (java.lang.CharSequence) "9hhhhhhhhhh          9hhhhhhhhhh   ");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "#AAAAA" + "'", charSequence2, "#AAAAA");
    }

    @Test
    public void test16299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16299");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.apache.commons.lang3.CharUtils.toIntValue('R');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character R is not in the range '0' - '9'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16300");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("\\u0061ItalifnischItalifnischItalifnischItalifnischItalifnischItalifnischItalifnischItalifnischItalif", "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxESENIHC");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test16301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16301");
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
        java.lang.String str10 = locale7.getLanguage();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Italian" + "'", str6, "Italian");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "it");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "it" + "'", str10, "it");
    }

    @Test
    public void test16302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16302");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "E             g                                                                                     ", "Franzosisch(Frankreich)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test16303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16303");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "H (HHHHHHHHH,CV CW CX CY CZ DE DJ DK DM DO DZ EC EE EG EH ER ES ET FI FJ FK)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H (HHHHHHHHH,CV CW CX CY CZ DE DJ DK DM DO DZ EC EE EG EH ER ES ET FI FJ FK)" + "'", str1, "H (HHHHHHHHH,CV CW CX CY CZ DE DJ DK DM DO DZ EC EE EG EH ER ES ET FI FJ FK)");
    }

    @Test
    public void test16304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16304");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "iTTAIT_ITALIAN_EGAISH          ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "iTTAIT_ITALIAN_EGAISH          " + "'", str1, "iTTAIT_ITALIAN_EGAISH          ");
    }

    @Test
    public void test16305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16305");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("italienisch", (double) 92);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=92.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16306");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("5", 9);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test16307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16307");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("itTAiT_ITA", "hi!       ");
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny("99999\\u0021", strArray4);
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("Hhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIH", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test16308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16308");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("", (int) '2', 223);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test16309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16309");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "\\u0020iTALIANiTALIANiTALIANiT");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 29 + "'", int1 == 29);
    }

    @Test
    public void test16310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16310");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("N");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "N" + "'", str1, "N");
    }

    @Test
    public void test16311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16311");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "                               e", (java.lang.CharSequence) "!_\\u0020_itle########################################################################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test16312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16312");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                                                                                                                okokok                                                                                                                                ", 'Y', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                okokok                                                                                                                                " + "'", str3, "                                                                                                                                okokok                                                                                                                                ");
    }

    @Test
    public void test16313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16313");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("tit", 104, "...                             xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...                             xxxxxxxxxxxxxxxxxxtit...                             xxxxxxxxxxxxxxxxxxx" + "'", str3, "...                             xxxxxxxxxxxxxxxxxxtit...                             xxxxxxxxxxxxxxxxxxx");
    }

    @Test
    public void test16314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16314");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "########################################################################################eltI_0200U\\_!", (java.lang.CharSequence) "ITALIAN (ITALIAN,ENGLCOR\311ENCOR\311ENCOR\311ENCOR\311ENCOR\311ENCOR\311ENCOR\311ENCOR\311ENCOR\311ENCOR\311ENCOR\311ENCOR\311ENCOR\311ENCOR\311ENCOR\311ENCOR\311ENCOR");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "########################################################################################eltI_0200U\\_!" + "'", charSequence2, "########################################################################################eltI_0200U\\_!");
    }

    @Test
    public void test16315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16315");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("english");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test16316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16316");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("HI!       ALLEMANDITALIENISCHALLEMANDITALIAN_ITALIAN_ENG    \\     ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...ALLEMAND\\U0034ALLEMANDHI!ALLEMANDITALIANALLEMAND\\U0061ALLEMAND\\U0023ALLEMANDHI!ALLEMANDITALIANALLEMANDCHINESE (CHINA)ALLEMANDHI!ALLEMANDZH_CNALLEMANDITALIANALLEMANDENALLEMANDITALIENISCH", 40);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!       ALLEMANDITALIENISCHALLEMANDITALIAN_ITALIAN_ENG    \\     ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...ALLEMAND\\U0034ALLEMANDHI!ALLEMANDITALIANALLEMAND\\U0061ALLEMAND\\U0023ALLEMANDHI!ALLEMANDITALIANALLEMANDCHINESE (CHINA)ALLEMANDHI!ALLEMANDZH_CNALLEMANDITALIANALLEMANDENALLEMANDITALIENISCH" + "'", str2, "HI!       ALLEMANDITALIENISCHALLEMANDITALIAN_ITALIAN_ENG    \\     ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...ALLEMAND\\U0034ALLEMANDHI!ALLEMANDITALIANALLEMAND\\U0061ALLEMAND\\U0023ALLEMANDHI!ALLEMANDITALIANALLEMANDCHINESE (CHINA)ALLEMANDHI!ALLEMANDZH_CNALLEMANDITALIANALLEMANDENALLEMANDITALIENISCH");
    }

    @Test
    public void test16317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16317");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("", "\\u0055", (int) '7');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test16318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16318");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("    IIIIIIIIII", 102);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "    IIIIIIIIII" + "'", str2, "    IIIIIIIIII");
    }

    @Test
    public void test16319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16319");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("KoreanADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDhcstueDKoreanADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDB", (int) 'T', 95);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "TAUAWAXAZBA" + "'", str3, "TAUAWAXAZBA");
    }

    @Test
    public void test16320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16320");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test16321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16321");
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
        java.lang.String str12 = locale4.getDisplayLanguage();
        java.util.Set<java.lang.String> strSet13 = locale4.getUnicodeLocaleKeys();
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "italian" + "'", str12, "italian");
        org.junit.Assert.assertNotNull(strSet13);
    }

    @Test
    public void test16322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16322");
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
        java.lang.Object obj13 = locale8.clone();
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
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "en");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "en");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "en");
    }

    @Test
    public void test16323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16323");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("...U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069!IH\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\ENGLISCH", 'H', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069!I#\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\ENGLISC#" + "'", str3, "...U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069!I#\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\ENGLISC#");
    }

    @Test
    public void test16324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16324");
        java.util.Locale locale0 = java.util.Locale.ITALY;
        java.lang.String str1 = locale0.getScript();
        java.util.Locale.Category category2 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale3 = java.util.Locale.getDefault(category2);
        java.util.Locale locale4 = java.util.Locale.getDefault(category2);
        java.util.Locale locale5 = java.util.Locale.getDefault(category2);
        boolean boolean6 = locale5.hasExtensions();
        java.lang.String str7 = locale0.getDisplayCountry(locale5);
        java.lang.String str8 = locale0.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + category2 + "' != '" + java.util.Locale.Category.FORMAT + "'", category2.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "italian");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "italian");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "italian");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Italy" + "'", str7, "Italy");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "it_IT" + "'", str8, "it_IT");
    }

    @Test
    public void test16325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16325");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC", "2aiTALIANiTALIANiTALIANiTAL", 24, 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2aiTALIANiTALIANiTALIANiTALCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC" + "'", str4, "2aiTALIANiTALIANiTALIANiTALCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
    }

    @Test
    public void test16326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16326");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) '7', '8');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '7' + "'", char2 == '7');
    }

    @Test
    public void test16327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16327");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                             zhzhzhzhzhzhzhzhzhzhfraadzhaezhafzhagzhaizhalzhamzhanzhaozhaqzharzhaszhazhzhzhzhzhzhzhzhzhz2222222222222222222222222222222222222222222222222222222222222222222222222", "nailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailati");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test16328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16328");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "\u97d3\u6587\u5357\u97d3)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test16329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16329");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAscii('!');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test16330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16330");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Locale locale1 = java.util.Locale.ITALIAN;
        java.lang.String str3 = locale1.getExtension('h');
        java.lang.String str4 = locale0.getDisplayScript(locale1);
        java.util.Locale locale8 = new java.util.Locale("HI!       ", "\\U0020", "Italienisch#########################################################################################");
        java.lang.String str9 = locale0.getDisplayCountry(locale8);
        java.util.Locale.setDefault(locale0);
        java.lang.String str12 = locale0.getExtension('d');
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals(locale8.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "France" + "'", str9, "France");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test16331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16331");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder5 = builder4.clear();
        java.util.Locale.Builder builder7 = builder5.setLanguage("ITALIAN");
        java.util.Locale.Builder builder9 = builder7.setLanguage("FRA");
        java.util.Locale.Builder builder10 = builder7.clear();
        java.util.Locale.Builder builder11 = builder7.clear();
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
    public void test16332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16332");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("KKKKKKKKKKKKKKKKKKKK)DNK(HCSIS\326ZNRFKKKKKKKKKKKKKKKKKKKK", "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu\\u0020");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "KKKKKKKKKKKKKKKKKKKK)DNK(HCSIS\326ZNRFKKKKKKKKKKKKKKKKKKKK" + "'", str2, "KKKKKKKKKKKKKKKKKKKK)DNK(HCSIS\326ZNRFKKKKKKKKKKKKKKKKKKKK");
    }

    @Test
    public void test16333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16333");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("ckclcmcncocrcucvcwcxcyczdedh...ibjblbmbnbobqbrbsbtbvbwbybzcacccdcfcgchcialamanaoaqarasatauawaxazbabbbdbebfbgbhbiadaeafaga", "hi!iiiiiii_\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test16334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16334");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)", "KoreanADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDhcstueDKoreanADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDB");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test16335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16335");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rz...\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test16336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16336");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("hcsineilati             dddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd");
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + 'h' + "'", char1 == 'h');
    }

    @Test
    public void test16337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16337");
        java.util.Locale locale2 = new java.util.Locale("francesefrancesefrancesefr\\u0075francesefrancesefrancesefr\\u0075francesefrancesefrancesefr\\u0075francesefrancesefrancTIT", "fr-C                 ");
        org.junit.Assert.assertEquals(locale2.toString(), "francesefrancesefrancesefr\\u0075francesefrancesefrancesefr\\u0075francesefrancesefrancesefr\\u0075francesefrancesefranctit_FR-C                 ");
    }

    @Test
    public void test16338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16338");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "Zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz\\XTALXAN_ITALIAN_ENGLXSHzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test16339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16339");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("GBR");
        java.lang.String str2 = languageRange1.getRange();
        double double3 = languageRange1.getWeight();
        java.lang.String str4 = languageRange1.getRange();
        double double5 = languageRange1.getWeight();
        double double6 = languageRange1.getWeight();
        java.lang.String str7 = languageRange1.getRange();
        boolean boolean9 = languageRange1.equals((java.lang.Object) "    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "gbr" + "'", str2, "gbr");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "gbr" + "'", str4, "gbr");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "gbr" + "'", str7, "gbr");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test16340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16340");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "dddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddfranzosisch (frankreich)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test16341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16341");
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
        java.util.Locale locale20 = locale15.stripExtensions();
        java.lang.String str21 = locale15.getDisplayScript();
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Canada" + "'", str10, "Canada");
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
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test16342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16342");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("000000000000000000000000000000000000000000000000000000000000000CCCC\\CCCC", 13, 'E');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "000000000000000000000000000000000000000000000000000000000000000CCCC\\CCCC" + "'", str3, "000000000000000000000000000000000000000000000000000000000000000CCCC\\CCCC");
    }

    @Test
    public void test16343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16343");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("AzhzhzhzhzhzhzhzhzhzhE             g", "44444444444444NAILATI44444444444444", 5);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zhzhzhzhzhzhzhzhzhzhE             g" + "'", str4, "zhzhzhzhzhzhzhzhzhzhE             g");
    }

    @Test
    public void test16344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16344");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("nc_HZ", "Iitalian(italian,eng");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nc_HZ" + "'", str2, "nc_HZ");
    }

    @Test
    public void test16345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16345");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Locale locale1 = java.util.Locale.ITALIAN;
        java.lang.String str3 = locale1.getExtension('h');
        java.lang.String str4 = locale0.getDisplayScript(locale1);
        java.util.Locale locale8 = new java.util.Locale("HI!       ", "\\U0020", "Italienisch#########################################################################################");
        java.lang.String str9 = locale0.getDisplayCountry(locale8);
        java.util.Locale.setDefault(locale0);
        java.lang.String str11 = locale0.getISO3Country();
        java.util.Locale locale12 = java.util.Locale.PRC;
        java.lang.String str13 = locale12.getDisplayVariant();
        java.util.Locale locale14 = java.util.Locale.FRENCH;
        java.util.Locale locale15 = java.util.Locale.ENGLISH;
        java.lang.String str16 = locale15.getDisplayCountry();
        java.lang.String str17 = locale14.getDisplayVariant(locale15);
        java.lang.String str18 = locale12.getDisplayScript(locale15);
        java.util.Locale locale20 = java.util.Locale.FRANCE;
        java.util.Locale locale21 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str22 = locale20.getDisplayScript(locale21);
        java.util.Locale locale23 = java.util.Locale.FRANCE;
        java.util.Locale locale24 = java.util.Locale.ITALIAN;
        java.lang.String str26 = locale24.getExtension('h');
        java.lang.String str27 = locale23.getDisplayScript(locale24);
        java.lang.String str28 = locale23.getISO3Country();
        java.lang.String str29 = locale21.getDisplayVariant(locale23);
        java.lang.String str30 = org.apache.commons.lang3.StringUtils.upperCase("\\u0020iTALIANiTALIANiTALIANiTALI", locale21);
        java.lang.String str31 = locale15.getDisplayCountry(locale21);
        java.util.Locale.setDefault(locale15);
        java.lang.String str33 = locale0.getDisplayVariant(locale15);
        java.lang.Object obj34 = locale15.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals(locale8.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "France" + "'", str9, "France");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "FRA" + "'", str11, "FRA");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "fr");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "en");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "it");
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "FRA" + "'", str28, "FRA");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "\\U0020ITALIANITALIANITALIANITALI" + "'", str30, "\\U0020ITALIANITALIANITALIANITALI");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertEquals(obj34.toString(), "en");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj34), "en");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj34), "en");
    }

    @Test
    public void test16346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16346");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\\u006b");
        java.lang.String[] strArray3 = null;
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replaceEach("\\u0038", strArray2, strArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '2');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\u0038" + "'", str4, "\\u0038");
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test16347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16347");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("Eagaas", "\\U0069\\U0069\\U", "\\u0020iItalian\\u008600u");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Eagaas" + "'", str3, "Eagaas");
    }

    @Test
    public void test16348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16348");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn                                                                         u005c         ", 'u');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'n' + "'", char2 == 'n');
    }

    @Test
    public void test16349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16349");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("Azhzhzhzhzhzhzhzhzhzh", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Azhzhzhzhzhzhzhzhzhzh" + "'", str2, "Azhzhzhzhzhzhzhzhzhzh");
    }

    @Test
    public void test16350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16350");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        java.lang.String str4 = locale3.getCountry();
        java.util.Locale.setDefault(category0, locale3);
        java.util.Locale locale7 = new java.util.Locale("en");
        boolean boolean8 = locale7.hasExtensions();
        java.util.Set<java.lang.String> strSet9 = locale7.getUnicodeLocaleKeys();
        java.util.Locale locale10 = java.util.Locale.ITALIAN;
        java.lang.String str11 = locale10.getDisplayLanguage();
        java.util.Locale locale12 = locale10.stripExtensions();
        java.lang.String str13 = locale12.getVariant();
        java.lang.String str14 = locale7.getDisplayLanguage(locale12);
        java.util.Locale.setDefault(category0, locale12);
        java.util.Locale locale16 = locale12.stripExtensions();
        java.util.Set<java.lang.Character> charSet17 = locale12.getExtensionKeys();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
// flaky:         org.junit.Assert.assertEquals(locale1.toString(), "it");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "it");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Italian" + "'", str11, "Italian");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "it");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "inglese" + "'", str14, "inglese");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "it");
        org.junit.Assert.assertNotNull(charSet17);
    }

    @Test
    public void test16351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16351");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("                                                  HSIAGE_NAILATI_TIATTIHI!_NAILATI HSILGNE_NAILATI_NAILAT", 55, 15);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...E_NAILATI..." + "'", str3, "...E_NAILATI...");
    }

    @Test
    public void test16352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16352");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "en-GBDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHD", (java.lang.CharSequence) "z");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test16353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16353");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("DE_DE", "FRAADzAEzAFzAGzAIzALzAMzANzAOzAQzARzAzAx", (int) 'e', 82);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "DE_DEFRAADzAEzAFzAGzAIzALzAMzANzAOzAQzARzAzAx" + "'", str4, "DE_DEFRAADzAEzAFzAGzAIzALzAMzANzAOzAQzARzAzAx");
    }

    @Test
    public void test16354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16354");
        java.util.Locale locale2 = new java.util.Locale("gERMAN (gERMANY)", "it_IT");
        java.lang.String str3 = locale2.getDisplayVariant();
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("ixii", "\u30d5\u30e9\u30f3\u30b9\u8a9e\u30ab\u30ca\u30c0)");
        boolean boolean7 = locale2.equals((java.lang.Object) "ixii");
        org.junit.Assert.assertEquals(locale2.toString(), "german (germany)_IT_IT");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test16355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16355");
        java.util.Locale locale3 = new java.util.Locale("ENGLISCH", "         ITALIAN_italian_eNGLISH", "\\u0061");
        java.lang.String str4 = locale3.getDisplayName();
        java.lang.String str5 = locale3.getDisplayName();
        java.lang.Class<?> wildcardClass6 = locale3.getClass();
        org.junit.Assert.assertEquals(locale3.toString(), "englisch_         ITALIAN_ITALIAN_ENGLISH_\\u0061");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "englisch (         ITALIAN_ITALIAN_ENGLISH,\\u0061)" + "'", str4, "englisch (         ITALIAN_ITALIAN_ENGLISH,\\u0061)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "englisch (         ITALIAN_ITALIAN_ENGLISH,\\u0061)" + "'", str5, "englisch (         ITALIAN_ITALIAN_ENGLISH,\\u0061)");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test16356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16356");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("talienisch", 0, 'C');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "talienisch" + "'", str3, "talienisch");
    }

    @Test
    public void test16357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16357");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.getDefault(category0);
        java.util.Locale locale4 = java.util.Locale.forLanguageTag("fra");
        java.util.Locale.setDefault(category0, locale4);
        java.util.Locale locale6 = java.util.Locale.FRANCE;
        java.util.Locale locale7 = java.util.Locale.ITALIAN;
        java.lang.String str9 = locale7.getExtension('h');
        java.lang.String str10 = locale6.getDisplayScript(locale7);
        java.util.Locale locale14 = new java.util.Locale("HI!       ", "\\U0020", "Italienisch#########################################################################################");
        java.lang.String str15 = locale6.getDisplayCountry(locale14);
        java.util.Locale.setDefault(locale6);
        java.lang.String str17 = locale6.getISO3Country();
        java.lang.String str18 = locale6.getISO3Country();
        java.util.Locale locale19 = java.util.Locale.US;
        java.lang.String str20 = locale19.toLanguageTag();
        java.util.Set<java.lang.String> strSet21 = locale19.getUnicodeLocaleKeys();
        java.util.Locale.Category category22 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale23 = java.util.Locale.getDefault(category22);
        java.lang.String str24 = locale19.getDisplayLanguage(locale23);
        java.lang.String str25 = locale6.getDisplayVariant(locale23);
        java.util.Locale.setDefault(category0, locale23);
        java.util.Locale locale27 = java.util.Locale.getDefault(category0);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fra");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "it");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals(locale14.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "France" + "'", str15, "France");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "FRA" + "'", str17, "FRA");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "FRA" + "'", str18, "FRA");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "en-US" + "'", str20, "en-US");
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertTrue("'" + category22 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category22.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "anglais" + "'", str24, "anglais");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "fr_FR");
    }

    @Test
    public void test16358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16358");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("   \r", 406);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test16359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16359");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("HSIAGE_NAILATI_TIATTIHI!_NAILATI         HSILGNE_NAILATI_NAILAT", 'i', '\\');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HSIAGE_NAILATI_TIATTIHI!_NAILATI         HSILGNE_NAILATI_NAILAT" + "'", str3, "HSIAGE_NAILATI_TIATTIHI!_NAILATI         HSILGNE_NAILATI_NAILAT");
    }

    @Test
    public void test16360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16360");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("france", "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC\\u00de\\u00CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "france" + "'", str2, "france");
    }

    @Test
    public void test16361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16361");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("talian");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "talian" + "'", str1, "talian");
    }

    @Test
    public void test16362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16362");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("U005C", 97, 'T');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTU005CTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" + "'", str3, "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTU005CTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT");
    }

    @Test
    public void test16363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16363");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!", "", (int) (short) 10);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, '4');
        boolean boolean7 = org.apache.commons.lang3.StringUtils.startsWithAny("\\u0020", strArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "FRANZ\326SISCH (KANADA)", 9, 29);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test16364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16364");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("e...", 5);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "e..." + "'", str2, "e...");
    }

    @Test
    public void test16365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16365");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("anglais", "Englisch!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "citalian_ITALIAN_Englishna)\\u0069h...");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test16366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16366");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("BFIBGIBHIBIIBJIBLIBMIBNIBOIBQIBRIBSIBTIBVIBWIBYIBZICAICCICDICFICGICHICIICKICLICMICNICOICRICUICVICWICXICYICZIDEIDJIDKIDMIDOIDZIECIEEIEGIEHIERIESIETIFIIFJIFKIFMIFOIFRIGAIGBIGDIGEIGFIGGIGHIGIIGLIGMIGNIGPIGQIGRIGSIGTIGUIGWIGYIHKIHM");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "BFIBGIBHIBIIBJIBLIBMIBNIBOIBQIBRIBSIBTIBVIBWIBYIBZICAICCICDICFICGICHICIICKICLICMICNICOICRICUICVICWICXICYICZIDEIDJIDKIDMIDOIDZIECIEEIEGIEHIERIESIETIFIIFJIFKIFMIFOIFRIGAIGBIGDIGEIGFIGGIGHIGIIGLIGMIGNIGPIGQIGRIGSIGTIGUIGWIGYIHKIH" + "'", str1, "BFIBGIBHIBIIBJIBLIBMIBNIBOIBQIBRIBSIBTIBVIBWIBYIBZICAICCICDICFICGICHICIICKICLICMICNICOICRICUICVICWICXICYICZIDEIDJIDKIDMIDOIDZIECIEEIEGIEHIERIESIETIFIIFJIFKIFMIFOIFRIGAIGBIGDIGEIGFIGGIGHIGIIGLIGMIGNIGPIGQIGRIGSIGTIGUIGWIGYIHKIH");
    }

    @Test
    public void test16367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16367");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("\u30d5\u30e9\u30f3\u30b9\u8a9e\u30d5\u30e9\u30f3\u30b9)", "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDiFranzosisch ...", 267);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test16368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16368");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!       _\\U0020_Italienisch#########################################################################################", "44\\u002344");
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("English", "Italian");
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!", "", (int) (short) 10);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("", strArray9, strArray13);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny("       !IH", strArray13);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny("FRANZ\326SISCH", strArray13);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.replaceEach("", strArray3, strArray13);
        java.lang.String[] strArray19 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh99999\\u0021hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(strArray19);
    }

    @Test
    public void test16369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16369");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("cinese (Cina)", 'D');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test16370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16370");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '7', 136);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
    }

    @Test
    public void test16371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16371");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder5 = builder4.clear();
        java.util.Locale locale6 = builder5.build();
        java.util.Locale.Builder builder7 = builder5.clear();
        java.util.Locale.Builder builder9 = builder5.removeUnicodeLocaleAttribute("chinois");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder9.setVariant("aaaaaaaaaaaaaaaaaaaaaaaaaaILaaaaaaaaaaaaaaaaaaaaaaaaaaIL");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: aaaaaaaaaaaaaaaaaaaaaaaaaaILaaaaaaaaaaaaaaaaaaaaaaaaaaIL [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "French (Canada)" + "'", str3, "French (Canada)");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test16372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16372");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('k', (int) '\r');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 13 + "'", int2 == 13);
    }

    @Test
    public void test16373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16373");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + 'I' + "'", char1 == 'I');
    }

    @Test
    public void test16374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16374");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                                  \\u0068");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u0068" + "'", str2, "\\u0068");
    }

    @Test
    public void test16375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16375");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("GGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGitalian", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "GGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGitalian" + "'", str2, "GGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGitalian");
    }

    @Test
    public void test16376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16376");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("0023DAL", "\\u0065                             a)                                                                                                           ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test16377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16377");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC\\u00d\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITAL\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\u00CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test16378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16378");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!frankreich!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!frankreich!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str1, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!frankreich!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test16379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16379");
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
        boolean boolean19 = locale15.hasExtensions();
        java.lang.String str20 = locale15.getScript();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
// flaky:         org.junit.Assert.assertEquals(locale1.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale2);
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "en_US");
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test16380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16380");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "ECANADAgCANADACANADAsh                                                                                                   ", "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCcinese (cina)u0069h..CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test16381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16381");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "ne\351roc");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test16382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16382");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIITALIAN_ITALIAN_ENGLISHIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII", 'Y');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIITALIAN_ITALIAN_ENGLISHIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII" + "'", str2, "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIITALIAN_ITALIAN_ENGLISHIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
    }

    @Test
    public void test16383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16383");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "Chinese", "c500u");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test16384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16384");
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
        java.util.Locale locale11 = java.util.Locale.FRENCH;
        java.util.Locale locale12 = java.util.Locale.ENGLISH;
        java.lang.String str13 = locale12.getDisplayCountry();
        java.lang.String str14 = locale11.getDisplayVariant(locale12);
        java.util.Set<java.lang.String> strSet15 = locale11.getUnicodeLocaleKeys();
        java.util.Locale locale16 = java.util.Locale.ITALIAN;
        java.lang.String str17 = locale16.getDisplayLanguage();
        java.util.Locale locale18 = locale16.stripExtensions();
        java.lang.String str19 = locale18.getVariant();
        java.lang.String str20 = locale11.getDisplayVariant(locale18);
        java.lang.String str21 = locale1.getDisplayScript(locale11);
        java.util.Locale locale22 = locale11.stripExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = locale22.getExtension('.');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "fr");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "it");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Italian" + "'", str17, "Italian");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "it");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "fr");
    }

    @Test
    public void test16385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16385");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "chinois (Chine)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test16386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16386");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("nailati", strMap1);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList2, strMap3);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap5 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList6 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList2, strMap5);
        java.util.Locale.Builder builder7 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder8 = builder7.clearExtensions();
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = locale9.getDisplayName();
        java.util.Locale.Builder builder11 = builder8.setLocale(locale9);
        java.util.Locale locale12 = java.util.Locale.GERMANY;
        java.util.Locale.Builder builder13 = builder8.setLocale(locale12);
        java.util.Set<java.lang.String> strSet14 = locale12.getUnicodeLocaleAttributes();
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet14, "ita");
        java.lang.String str17 = java.util.Locale.lookupTag(languageRangeList6, (java.util.Collection<java.lang.String>) strSet14);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap18 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList19 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList6, strMap18);
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(languageRangeList6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "French (Canada)" + "'", str10, "French (Canada)");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "de_DE");
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(languageRangeList19);
    }

    @Test
    public void test16387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16387");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\\u0020iTALIANiTALIANiTALIANiTALI\\u0020iTALIANiTALIANiTALIANiTAL", "h");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("kkkkkkkkkkkkkkkkkeAGAASHuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", strArray4);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, 'u', 17, 16);
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("Italienisch#########################################################################################", "!IH");
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.concatWith("HI!HI!", (java.lang.Object[]) strArray14);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray14, 'R');
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("cinese", strArray4, strArray14);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Italienisch#########################################################################################" + "'", str15, "Italienisch#########################################################################################");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Italienisch#########################################################################################" + "'", str17, "Italienisch#########################################################################################");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "cinese" + "'", str18, "cinese");
    }

    @Test
    public void test16388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16388");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("hsiAgE_NAILATI_TiATtiHI!_NAILATI         HSILGNe_nailati_NAILATI         HHHHHHHHH", (double) 'B');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=66.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16389");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "\\u0069hhhhhhhhhh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test16390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16390");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("", (int) '#', "R-FRAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "R-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FR" + "'", str3, "R-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FR");
    }

    @Test
    public void test16391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16391");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("u Italia u", 84);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "u Italia u                                                                          " + "'", str2, "u Italia u                                                                          ");
    }

    @Test
    public void test16392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16392");
        java.lang.Object[] objArray0 = null;
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(objArray0, 'e', 0, 24);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test16393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16393");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("IAN_Englishallem", "\ud504           fr_FR                  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "IAN_Englishallem" + "'", str2, "IAN_Englishallem");
    }

    @Test
    public void test16394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16394");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d");
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\\' + "'", char1 == '\\');
    }

    @Test
    public void test16395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16395");
        java.lang.String str1 = org.apache.commons.lang3.CharUtils.unicodeEscaped('T');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u0054" + "'", str1, "\\u0054");
    }

    @Test
    public void test16396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16396");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII", " Italia  Italia  Italia  Italia  Italia  Italia  Italia DEUTSCH Italia  Italia  Italia  Italia  Italia  Italia  Italia  ", 122);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII" + "'", str3, "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
    }

    @Test
    public void test16397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16397");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("hi!DEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEU\\u0061DEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEU\\u0061DEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEU\\u0061DEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEU\\u0061DEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEU\\u0061DEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEU\\u0061DEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEU\\u0061_\\U0020_Italienisch#########################################################################################");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=hi!deutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeu\\u0061deutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeu\\u0061deutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeu\\u0061deutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeu\\u0061deutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeu\\u0061deutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeu\\u0061deutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeu\\u0061_\\u0020_italienisch#########################################################################################");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16398");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("it-IT");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "it-IT" + "'", str1, "it-IT");
    }

    @Test
    public void test16399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16399");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\aUa0046", "z...\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rFrn", (int) 'l');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test16400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16400");
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
            java.util.Locale.Builder builder14 = builder7.setScript("it                   ");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: it                    [at index 0]");
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
    public void test16401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16401");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "TEDESCO");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test16402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16402");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("hi!        Italienisch italian_ITALIAN_English HI! hi! ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED... \\u0034 HI! Italian \\u0061 \\u0023 hi! iTALIAN Chinese (China) hi! zh_CN iTALIAN en Italienisch", "    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!        Italienisch italian_ITALIAN_English HI! hi! ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED... \\u0034 HI! Italian \\u0061 \\u0023 hi! iTALIAN Chinese (China) hi! zh_CN iTALIAN en Italienisch" + "'", str2, "hi!        Italienisch italian_ITALIAN_English HI! hi! ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED... \\u0034 HI! Italian \\u0061 \\u0023 hi! iTALIAN Chinese (China) hi! zh_CN iTALIAN en Italienisch");
    }

    @Test
    public void test16403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16403");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("ZH_cnFrench (Canada)AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\\u0020iItalian\\u0020i                                                 ", 113, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test16404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16404");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("CGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...", '.');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'C' + "'", char2 == 'C');
    }

    @Test
    public void test16405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16405");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("", "000000000000000000000000000000000000000000000000000000000000000CCCC\\CCCC000000000000000000000000000000000000000000000000000000000000000CCCC\\CCCC0000000000000000000000000000000000000000000000000000000italiano000000000000000000000000000000000000000000000000000000000000000CCCC\\CCCC000000000000000000000000000000000000000000000000000000000000000CCCC\\CCCC0000000000000000000000000000000000000000000000000000000", "ADaAEaAFaAGaAIaALaAMaANaAOaAQaARaASaATaAUaAWaAXaAZaBAaBBaBDaBEaBFaBGaBHaBIaBJaBLaBMaBNaBOaBQaBRaBSaBTaBVaBWaBYaBZaCAaCCaCDaCFaCGaCHaCIaCKaCLaCMaCNaCOaCRaCUaCVaCWaCXaCYaCZaDEaDJaDKaDMaDOaDZaECaEEaEGaEHaERaESaETaFIaFJaFKaFMaFOaFRaGAaGBaGDaGEaGFaGGaGHaGIaGLaGMaGNaGPaGQaGRaGSaGTaGUaGWaGYaHKaHMaHNaHRaHTaHUaIDaIEaILaIMaINaIOaIQaIRaISaITaJEaJMaJOaJPaKEaKGaKHaKIaKMaKNaKPaKRaKWaKYaKZaLAaLBaLCaLIaLKaLRaLSaLTaLUaLVaLYaMAaMCaMDaMEaMFaMGaMHaMKaMLaMMaMNaMOaMPaMQaMRaMSaMTaMUaMVaMWaMXaMYaMZaNAaNCaNEaNFaNGaNIaNLaNOaNPaNRaNUaNZaOMaPAaPEaPFaPGaPHaPKaPLaPMaPNaPRaPSaPTaPWaPYaQAaREaROaRSaRUaRWaSAaSBaSCaSDaSEaSGaSHaSIaSJaSKaSLaSMaSNaSOaSRaSSaSTaSVaSXaSYaSZaTCaTDaTFaTGaTHaTJaTKaTLaTMaTNaTOaTRaTTaTVaTWaTZaUAaUGaUMaUSaUYaUZaVAaVCaVEaVGaVIaVNaVUaWFaWSaYEaYTaZAaZMaZW", (int) ')');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test16406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16406");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                         E    Italien", "FgenceFgenceFgenceFgenceFgenceFgenceFgenceFgenceFgenceFgenceFgenceFgenceFgenceFgenceFgenceFgenceFgenceFgenceFgenceFgenceFgenceFgenceFgenceFgenceFgenceFgenceFgenceFgenceFgenceFgenceFgenceFgenceFgenceFgenceFgenceFgenceFgenceFgenceFgenceFgenceFgenceFgenceFgenceFgenceFgenceFgenceFgenceFgence");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test16407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16407");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "\u30ab\u30ca\u30c0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test16408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16408");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("\\u0034\\u00                                             hcstueD                                             \\u0034\\u00", (int) 'l');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test16409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16409");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "eNGLISH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test16410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16410");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("United State", "                                             hcstued");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test16411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16411");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("\\u0020iItalian\\u008600u", (int) (short) 10, 'D');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\u0020iItalian\\u008600u" + "'", str3, "\\u0020iItalian\\u008600u");
    }

    @Test
    public void test16412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16412");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("Deutsch (Deutschland)", '7');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Deutsch (Deutschland)" + "'", str2, "Deutsch (Deutschland)");
    }

    @Test
    public void test16413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16413");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase(" hi!       _\\U0020_Italienisch####################################################################            ", "rEGNO uNITO");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " hi!       _\\U0020_Italienisch####################################################################            " + "'", str2, " hi!       _\\U0020_Italienisch####################################################################            ");
    }

    @Test
    public void test16414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16414");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!", 52, 314);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test16415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16415");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "talienisch", "FRZ\326CZ(FRKREC)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test16416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16416");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("                                                                                                               ))))))))))))))))))))))))))))))))))))))))))))))))))))");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                               )))))))))))))))))))))))))))))))))))))))))))))))))))" + "'", str1, "                                                                                                               )))))))))))))))))))))))))))))))))))))))))))))))))))");
    }

    @Test
    public void test16417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16417");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("GBR");
        java.lang.String str2 = languageRange1.getRange();
        double double3 = languageRange1.getWeight();
        java.lang.String str4 = languageRange1.getRange();
        double double5 = languageRange1.getWeight();
        double double6 = languageRange1.getWeight();
        java.lang.String str7 = languageRange1.getRange();
        char[] charArray17 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray17);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "X", charArray17);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsAny("Korean", charArray17);
        boolean boolean21 = languageRange1.equals((java.lang.Object) charArray17);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "gbr" + "'", str2, "gbr");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "gbr" + "'", str4, "gbr");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "gbr" + "'", str7, "gbr");
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "4##a a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "4##a a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[4, #, #, a,  , a]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test16418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16418");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("2CINESE (CINA...", 804);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test16419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16419");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("aE");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aE" + "'", str1, "aE");
    }

    @Test
    public void test16420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16420");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("fr-CA", 'A');
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny("zhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozho", strArray3);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "EnglishI\\U0020ITALIANITALIANITALIANITALIIT I\\U0020ITALIANITALIANITALIANITALIIT(I\\U0020ITALIANITALIANITALIANITALIITUnitedI\\U0020ITALIANITALIANITALIANITALIIT I\\U0020ITALIANITALIANITALIANITALIITKingdomI\\U0020ITALIANITALIANITALIANITALIIT)");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test16421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16421");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("\\U0069\\U0069\\U", "         ITALIAN_ITALIAN_ENGLISH         ITALIAN_!IHITTAIT_ITALIAN_EGAISHE             G                          SHE             G                          SHE             G                          SHE             G                          SHE             G                          SHE             G                          SHE             G                          SHE             G                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\U0069\\U0069\\U" + "'", str2, "\\U0069\\U0069\\U");
    }

    @Test
    public void test16422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16422");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("Azhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais cinese (cina)\\u0069h..France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzh", "hi!       _\\U0020_Italienisch#########################################################################################", 71);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test16423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16423");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCcinese (cina)\\u0069h..CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCcinese (cina)\\u0069h..CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC" + "'", str1, "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCcinese (cina)\\u0069h..CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
    }

    @Test
    public void test16424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16424");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("IIIIIIIIIIIn44444444444444alia44444444444444itIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII", "iFranzosisch ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "IIIIIIIIIIIn44444444444444alia44444444444444itIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII" + "'", str2, "IIIIIIIIIIIn44444444444444alia44444444444444itIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
    }

    @Test
    public void test16425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16425");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("                                               nailati                                                ", "German");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                               nailati                                                " + "'", str2, "                                               nailati                                                ");
    }

    @Test
    public void test16426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16426");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("U", 122);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test16427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16427");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "ZH_CN");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny("#########FranzosischFranzosisch (Frankreich)", strArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, "iFranzosisch ");
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, 'k');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDiFranzosisch ..." + "'", str8, "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDiFranzosisch ...");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDk..." + "'", str10, "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDk...");
    }

    @Test
    public void test16428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16428");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("anglais (Canada", 56);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "anglais (Canada" + "'", str2, "anglais (Canada");
    }

    @Test
    public void test16429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16429");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("R", 101);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test16430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16430");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("EnglischEnglischEnglisc(italian,english)EnglischEnglischEnglisc", 105);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test16431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16431");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test16432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16432");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "DEU", "\\u0029");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test16433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16433");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("Franz\366sisc", (int) '.', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaFranz\366sisc" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaFranz\366sisc");
    }

    @Test
    public void test16434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16434");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065", "        \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test16435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16435");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("\\U0020ITALIANITALIANITALIANITALI", "\\U0078");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\U0020ITALIANITALIANITALIANITALI" + "'", str2, "\\U0020ITALIANITALIANITALIANITALI");
    }

    @Test
    public void test16436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16436");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("                                                                 \\U0020  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\U0020" + "'", str1, "\\U0020");
    }

    @Test
    public void test16437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16437");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkDEkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkDEkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk" + "'", str2, "kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkDEkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk");
    }

    @Test
    public void test16438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16438");
        java.util.Locale locale0 = java.util.Locale.ENGLISH;
        java.util.Locale.setDefault(locale0);
        java.util.Locale locale2 = java.util.Locale.FRANCE;
        java.util.Locale locale3 = java.util.Locale.ITALIAN;
        java.lang.String str5 = locale3.getExtension('h');
        java.lang.String str6 = locale2.getDisplayScript(locale3);
        boolean boolean7 = locale2.hasExtensions();
        java.lang.String str8 = locale2.getVariant();
        java.lang.String str9 = locale2.getLanguage();
        java.util.Set<java.lang.String> strSet10 = locale2.getUnicodeLocaleKeys();
        java.lang.String str11 = locale2.getVariant();
        java.lang.String str12 = locale2.getDisplayScript();
        java.util.Locale locale13 = java.util.Locale.GERMAN;
        java.util.Locale.setDefault(locale13);
        java.lang.String str15 = locale13.toLanguageTag();
        java.util.Locale locale16 = java.util.Locale.ITALY;
        java.lang.String str17 = locale16.getScript();
        java.lang.String str18 = locale16.getDisplayCountry();
        boolean boolean19 = locale16.hasExtensions();
        java.util.Locale.setDefault(locale16);
        java.lang.String str21 = locale13.getDisplayLanguage(locale16);
        java.lang.String str22 = locale16.getDisplayVariant();
        java.lang.String str23 = locale2.getDisplayName(locale16);
        java.lang.String str24 = locale0.getDisplayName(locale2);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "it");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "fr" + "'", str9, "fr");
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "de");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "de" + "'", str15, "de");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Italien" + "'", str18, "Italien");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "tedesco" + "'", str21, "tedesco");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "francese (Francia)" + "'", str23, "francese (Francia)");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "anglais" + "'", str24, "anglais");
    }

    @Test
    public void test16439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16439");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hi!");
        java.lang.String str2 = locale1.getCountry();
        java.util.Locale.Builder builder3 = new java.util.Locale.Builder();
        java.util.Locale locale4 = builder3.build();
        java.util.Locale locale6 = java.util.Locale.forLanguageTag("Italian");
        java.lang.String str7 = locale4.getDisplayLanguage(locale6);
        java.lang.String str8 = locale1.getDisplayLanguage(locale4);
        java.lang.String str9 = locale1.getDisplayVariant();
        java.lang.String str10 = locale1.getDisplayVariant();
        java.lang.String str11 = locale1.toString();
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test16440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16440");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("hIAN\\U0020Ihie", "FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test16441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16441");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("iTALIAN_italian_eNGLISHITALIAN_!IHitTAiT_ITALIAN_EgAish", "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEnglischCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC", 6);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test16442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16442");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "anihC");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test16443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16443");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("\\U0046", "\ud504\ub791\uc2a4\uc5b4\uce90\ub098\ub2e4)_ENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENG_                                                                    \\u0020iTALIANiTALIANiTALIANiTALI");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test16444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16444");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.GERMAN;
        java.util.Locale locale3 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str4 = locale2.getDisplayName(locale3);
        java.util.Locale.setDefault(category0, locale3);
        java.util.Locale locale8 = new java.util.Locale("\\u0020iTALIANiTALIANiTALIANiTALI\\u0020iTALIANiTALIANiTALIANiTAL", "allemand");
        java.util.Locale.setDefault(category0, locale8);
        java.util.Locale locale10 = java.util.Locale.getDefault(category0);
        java.util.Locale locale11 = java.util.Locale.GERMAN;
        java.util.Locale locale12 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str13 = locale11.getDisplayName(locale12);
        java.util.Locale.setDefault(locale12);
        java.util.Locale.setDefault(category0, locale12);
        java.util.Locale locale16 = java.util.Locale.CHINESE;
        java.util.Locale locale17 = java.util.Locale.FRENCH;
        java.lang.String str18 = locale17.getDisplayName();
        java.lang.String str20 = locale17.getExtension('C');
        java.lang.String str21 = locale16.getDisplayLanguage(locale17);
        java.lang.String str22 = locale16.getScript();
        java.util.Locale.setDefault(category0, locale16);
        java.lang.String str24 = locale16.toString();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "allemand" + "'", str4, "allemand");
        org.junit.Assert.assertEquals(locale8.toString(), "\\u0020italianitalianitalianitali\\u0020italianitalianitalianital_ALLEMAND");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "\\u0020italianitalianitalianitali\\u0020italianitalianitalianital_ALLEMAND");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "de");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "allemand" + "'", str13, "allemand");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "zh");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "fran\347ais" + "'", str18, "fran\347ais");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "chinois" + "'", str21, "chinois");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "zh" + "'", str24, "zh");
    }

    @Test
    public void test16445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16445");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDF...", "jp");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test16446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16446");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("2IT HI!       _\\U0020_ITALIENISCH####################################################################            2I");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "2ITHI!_\\U0020_ITALIENISCH####################################################################2I" + "'", str1, "2ITHI!_\\U0020_ITALIENISCH####################################################################2I");
    }

    @Test
    public void test16447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16447");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("azhzhzhzhzhzhzhfran\347ais (france)azhzhzhzhzhzhzhzhzhzhfran\347ais (france)azhzhzhzhzhzhzhzhzhzhfran\347ais cinese (cina)\\u0069h..france)azhzhzhzhzhzhzhzhzhzhfran\347ais (france)azhzhzhzhzhzhzhzhzhzhfran\347ais (france)azhzhzhzhzhzhzhzhzhzhfran\347ais (france)azhzhzhzhzhzhzhzhzhzhfran\347ais (france)azhzhzhzhzhzhzhzhzhzhfran\347ais (france)azhzhzhzhzhzhzhzhzhzhfran\347ais (france)azhzhzhzhzhzhzhzhzhzhfran\347ais (france)azhzhzhzhzhzhzhzhzhzhfran\347ais (france)azhzhzhzhzhzhzhzhzhzhfran\347ais (france)azhzhzhzhzhzhzhzhzhzhfran\347ais (france)azhzhzhzhzhzhzhzhzhzhfran\347ais (france)azhzhzhzhzhzhzhzhzhzhfran\347ais (france)azhzhzhzhzhzhzhzhzhzhfran\347ais (france)azhzhzhzhzhzhzhzhzhzhfran\347ais (france)azhzhzhzhzhzhzhzhzhzhfran\347ais (france)azhzhzhzhzhzhzhzhzhzhfran\347ais (france)azhzhzhzhzhzhzhzhzhzhfran\347ais (france)azhzhzhzhzhzhzhzhzhzhfran\347ais (france)azhzhzhzhzhzhzhzhzhzh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS CINESE (CINA)\\U0069H..FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZH" + "'", str1, "AZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS CINESE (CINA)\\U0069H..FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZH");
    }

    @Test
    public void test16448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16448");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "\\u000a");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test16449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16449");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("ITALIAN_italian_eNGLISH", "ITA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test16450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16450");
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
        java.util.Locale.Builder builder45 = builder44.clearExtensions();
        java.util.Locale.Builder builder46 = builder45.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder49 = builder46.setUnicodeLocaleKeyword("                                             DE_DE                                              ", "Korean (South Korea)Korean (Songlish ...Korean (South Korea)Korean (So");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key:                                              DE_DE                                               [at index 0]");
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
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "italiano" + "'", str14, "italiano");
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
// flaky:         org.junit.Assert.assertEquals("'" + str39 + "' != '" + "francese" + "'", str39, "francese");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(strSet42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder46);
    }

    @Test
    public void test16451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16451");
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
        java.lang.Class<?> wildcardClass46 = builder44.getClass();
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
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "italiano" + "'", str14, "italiano");
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
// flaky:         org.junit.Assert.assertEquals("'" + str39 + "' != '" + "francese" + "'", str39, "francese");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(strSet42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "it");
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test16452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16452");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = java.util.Locale.UK;
        java.util.Locale.Builder builder3 = builder0.setLocale(locale2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder3.setLanguage("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rcHINESISCH (cHINA)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: ????????????????????????????????????????????????????????????????????????????????????cHINESISCH (cHINA) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en_GB");
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test16453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16453");
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
        java.util.Locale.setDefault(locale8);
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\\u0066" + "'", str14, "\\u0066");
    }

    @Test
    public void test16454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16454");
        java.lang.String[] strArray4 = java.util.Locale.getISOCountries();
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.concatWith("zh", (java.lang.Object[]) strArray7);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray7);
        int int10 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("inglese", strArray7);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.startsWithAny("hi!", strArray7);
        int int12 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("", strArray7);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZW" + "'", str5, "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZW");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZW" + "'", str6, "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZW");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhATzhAUzhAWzhAXzhAZzhBAzhBBzhBDzhBEzhBFzhBGzhBHzhBIzhBJzhBLzhBMzhBNzhBOzhBQzhBRzhBSzhBTzhBVzhBWzhBYzhBZzhCAzhCCzhCDzhCFzhCGzhCHzhCIzhCKzhCLzhCMzhCNzhCOzhCRzhCUzhCVzhCWzhCXzhCYzhCZzhDEzhDJzhDKzhDMzhDOzhDZzhECzhEEzhEGzhEHzhERzhESzhETzhFIzhFJzhFKzhFMzhFOzhFRzhGAzhGBzhGDzhGEzhGFzhGGzhGHzhGIzhGLzhGMzhGNzhGPzhGQzhGRzhGSzhGTzhGUzhGWzhGYzhHKzhHMzhHNzhHRzhHTzhHUzhIDzhIEzhILzhIMzhINzhIOzhIQzhIRzhISzhITzhJEzhJMzhJOzhJPzhKEzhKGzhKHzhKIzhKMzhKNzhKPzhKRzhKWzhKYzhKZzhLAzhLBzhLCzhLIzhLKzhLRzhLSzhLTzhLUzhLVzhLYzhMAzhMCzhMDzhMEzhMFzhMGzhMHzhMKzhMLzhMMzhMNzhMOzhMPzhMQzhMRzhMSzhMTzhMUzhMVzhMWzhMXzhMYzhMZzhNAzhNCzhNEzhNFzhNGzhNIzhNLzhNOzhNPzhNRzhNUzhNZzhOMzhPAzhPEzhPFzhPGzhPHzhPKzhPLzhPMzhPNzhPRzhPSzhPTzhPWzhPYzhQAzhREzhROzhRSzhRUzhRWzhSAzhSBzhSCzhSDzhSEzhSGzhSHzhSIzhSJzhSKzhSLzhSMzhSNzhSOzhSRzhSSzhSTzhSVzhSXzhSYzhSZzhTCzhTDzhTFzhTGzhTHzhTJzhTKzhTLzhTMzhTNzhTOzhTRzhTTzhTVzhTWzhTZzhUAzhUGzhUMzhUSzhUYzhUZzhVAzhVCzhVEzhVGzhVIzhVNzhVUzhWFzhWSzhYEzhYTzhZAzhZMzhZW" + "'", str8, "ADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhATzhAUzhAWzhAXzhAZzhBAzhBBzhBDzhBEzhBFzhBGzhBHzhBIzhBJzhBLzhBMzhBNzhBOzhBQzhBRzhBSzhBTzhBVzhBWzhBYzhBZzhCAzhCCzhCDzhCFzhCGzhCHzhCIzhCKzhCLzhCMzhCNzhCOzhCRzhCUzhCVzhCWzhCXzhCYzhCZzhDEzhDJzhDKzhDMzhDOzhDZzhECzhEEzhEGzhEHzhERzhESzhETzhFIzhFJzhFKzhFMzhFOzhFRzhGAzhGBzhGDzhGEzhGFzhGGzhGHzhGIzhGLzhGMzhGNzhGPzhGQzhGRzhGSzhGTzhGUzhGWzhGYzhHKzhHMzhHNzhHRzhHTzhHUzhIDzhIEzhILzhIMzhINzhIOzhIQzhIRzhISzhITzhJEzhJMzhJOzhJPzhKEzhKGzhKHzhKIzhKMzhKNzhKPzhKRzhKWzhKYzhKZzhLAzhLBzhLCzhLIzhLKzhLRzhLSzhLTzhLUzhLVzhLYzhMAzhMCzhMDzhMEzhMFzhMGzhMHzhMKzhMLzhMMzhMNzhMOzhMPzhMQzhMRzhMSzhMTzhMUzhMVzhMWzhMXzhMYzhMZzhNAzhNCzhNEzhNFzhNGzhNIzhNLzhNOzhNPzhNRzhNUzhNZzhOMzhPAzhPEzhPFzhPGzhPHzhPKzhPLzhPMzhPNzhPRzhPSzhPTzhPWzhPYzhQAzhREzhROzhRSzhRUzhRWzhSAzhSBzhSCzhSDzhSEzhSGzhSHzhSIzhSJzhSKzhSLzhSMzhSNzhSOzhSRzhSSzhSTzhSVzhSXzhSYzhSZzhTCzhTDzhTFzhTGzhTHzhTJzhTKzhTLzhTMzhTNzhTOzhTRzhTTzhTVzhTWzhTZzhUAzhUGzhUMzhUSzhUYzhUZzhVAzhVCzhVEzhVGzhVIzhVNzhVUzhWFzhWSzhYEzhYTzhZAzhZMzhZW");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZW" + "'", str9, "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZW");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test16455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16455");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale.Builder builder4 = builder2.clearExtensions();
        java.util.Locale.Builder builder5 = builder2.clear();
        java.util.Locale.Builder builder6 = builder2.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder2.addUnicodeLocaleAttribute("                                             de_de                                             ");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute:                                              de_de                                              [at index 0]");
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
    public void test16456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16456");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("NC_hz\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r");
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
        java.lang.String str15 = locale4.getScript();
        java.lang.String str16 = locale1.getDisplayCountry(locale4);
        java.lang.String str17 = locale4.toLanguageTag();
        java.lang.String[] strArray21 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!", "", (int) (short) 10);
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray21, '4');
        java.lang.String[] strArray24 = org.apache.commons.lang3.StringUtils.stripAll(strArray21);
        java.lang.String[] strArray26 = org.apache.commons.lang3.StringUtils.stripAll(strArray24, "!IH");
        java.lang.String[] strArray27 = org.apache.commons.lang3.StringUtils.stripAll(strArray24);
        java.lang.String[] strArray29 = org.apache.commons.lang3.StringUtils.stripAll(strArray27, "0");
        boolean boolean30 = locale4.equals((java.lang.Object) strArray27);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertTrue("'" + category2 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category2.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "\\u0066");
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "fr-FR" + "'", str17, "fr-FR");
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test16457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16457");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("", "harzhaszhazhzhzhzhzhzhzhzhzhz");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test16458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16458");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("         R", "Germany", "cinese (Cina)", 221);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "         R" + "'", str4, "         R");
    }

    @Test
    public void test16459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16459");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("44444444444444444444444444444444", "                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444444" + "'", str2, "44444444444444444444444444444444");
    }

    @Test
    public void test16460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16460");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Chinese (Taiwan)", "zhzhzhzhzhzhzhzhzhzhfraadzhaezhafzhagzhaizhalzhamzhanzhaozhaqzharzhaszhazhzhzhzhzhzhzhzhzhz2222222222222222222222222222222222222222222222222222222222222222222222222");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test16461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16461");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("nglisch", "it\\u0052TA\\u0052i\\u0052T\\u0052_\\u0052ITA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test16462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16462");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "CCCC\\CCCC");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test16463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16463");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder3.clear();
        java.util.Locale.Builder builder6 = builder4.setVariant("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder4.setExtension('\\', "X");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key: \\ [at index 0]");
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
    public void test16464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16464");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) 'x', 'T');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'x' + "'", char2 == 'x');
    }

    @Test
    public void test16465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16465");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiAlphaLower('5');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test16466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16466");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkDEkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk", 'G');
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                                         ", "    \\     ", (int) 'C');
        boolean boolean9 = org.apache.commons.lang3.StringUtils.endsWithAny("\\u0061ItalienischItalienischItalienischItalienischItalienischItalienischItalienischItalienischItalie", strArray8);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("canad", strArray3, strArray8);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "canad" + "'", str10, "canad");
    }

    @Test
    public void test16467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16467");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("TALIAN\\u002", "Hi!       _\\U0020_Italienisch#########################################################################################", 7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test16468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16468");
        java.util.Locale locale1 = java.util.Locale.FRANCE;
        java.util.Locale locale2 = java.util.Locale.ITALIAN;
        java.lang.String str4 = locale2.getExtension('h');
        java.lang.String str5 = locale1.getDisplayScript(locale2);
        java.util.Locale locale6 = locale1.stripExtensions();
        java.util.Set<java.lang.Character> charSet7 = locale6.getExtensionKeys();
        java.util.Locale locale9 = java.util.Locale.ENGLISH;
        java.lang.String str10 = locale9.getDisplayLanguage();
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.upperCase("!IH", locale9);
        java.lang.String str12 = locale9.getCountry();
        java.lang.String str13 = locale9.getCountry();
        boolean boolean14 = locale9.hasExtensions();
        java.lang.String str15 = locale6.getDisplayVariant(locale9);
        java.util.Locale locale16 = java.util.Locale.FRANCE;
        java.util.Locale locale17 = java.util.Locale.ITALIAN;
        java.lang.String str19 = locale17.getExtension('h');
        java.lang.String str20 = locale16.getDisplayScript(locale17);
        java.util.Locale locale21 = locale16.stripExtensions();
        java.util.Locale locale22 = java.util.Locale.getDefault();
        java.lang.String str23 = locale22.getLanguage();
        java.lang.String str24 = locale16.getDisplayCountry(locale22);
        java.lang.String str25 = locale16.toLanguageTag();
        java.lang.String str26 = locale16.getScript();
        java.lang.String str27 = locale6.getDisplayName(locale16);
        java.lang.String str28 = org.apache.commons.lang3.StringUtils.upperCase("aaaaaaaaaaaaaaaaaaaaaaaaaa...ANiTALIaaaaaaaaaaaaaaaaaaaaaaaaaa", locale16);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "it");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(charSet7);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "anglais" + "'", str10, "anglais");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "!IH" + "'", str11, "!IH");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "it");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "de");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "de" + "'", str23, "de");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Frankreich" + "'", str24, "Frankreich");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "fr-FR" + "'", str25, "fr-FR");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "fran\347ais (France)" + "'", str27, "fran\347ais (France)");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAA...ANITALIAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str28, "AAAAAAAAAAAAAAAAAAAAAAAAAA...ANITALIAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test16469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16469");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITAL (ALLEMAND)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITAL (ALLEMAND)" + "'", str1, "\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITAL (ALLEMAND)");
    }

    @Test
    public void test16470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16470");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("\u671d\u9c9c\u6587\u97e9\u56fd)", 4);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test16471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16471");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder4 = builder0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder0.setLanguageTag("\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069!IH\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: \\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069!IH\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\ [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test16472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16472");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Locale locale1 = java.util.Locale.ITALIAN;
        java.lang.String str3 = locale1.getExtension('h');
        java.lang.String str4 = locale0.getDisplayScript(locale1);
        boolean boolean5 = locale0.hasExtensions();
        java.lang.String str6 = locale0.getVariant();
        java.lang.String str7 = locale0.getLanguage();
        java.util.Set<java.lang.String> strSet8 = locale0.getUnicodeLocaleKeys();
        java.lang.String str9 = locale0.getVariant();
        java.util.Locale locale12 = new java.util.Locale("                                             hcstueD                                             ", "\ud504\ub791\uc2a4\uc5b4");
        java.lang.String str13 = locale12.getDisplayLanguage();
        java.lang.String str14 = locale0.getDisplayScript(locale12);
        java.lang.String str15 = locale12.getDisplayVariant();
        java.lang.Class<?> wildcardClass16 = locale12.getClass();
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
// flaky:         org.junit.Assert.assertEquals(locale12.toString(), "\ud504\ub791\uc2a4\uc5b4");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "                                             hcstued                                             " + "'", str13, "                                             hcstued                                             ");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test16473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16473");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                        ittait_italian_egaish                                 \\u006", "!_\\U0020_Itle");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 41 + "'", int2 == 41);
    }

    @Test
    public void test16474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16474");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList0 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("CAN");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.parse("und");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap5 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList6 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList4, strMap5);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap8 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList9 = java.util.Locale.LanguageRange.parse(" italian  ", strMap8);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap10 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList11 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList9, strMap10);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap12 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList13 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList11, strMap12);
        java.util.Locale.LanguageRange[] languageRangeArray14 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList15 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList15, languageRangeArray14);
        java.util.Locale.LanguageRange[] languageRangeArray17 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList18 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList18, languageRangeArray17);
        java.lang.String[] strArray22 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList23 = new java.util.ArrayList<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList23, strArray22);
        java.util.Locale.FilteringMode filteringMode25 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList26 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList18, (java.util.Collection<java.lang.String>) strList23, filteringMode25);
        java.util.Locale.FilteringMode filteringMode27 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList28 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList15, (java.util.Collection<java.lang.String>) strList23, filteringMode27);
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
        java.util.List<java.lang.String> strList54 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList15, (java.util.Collection<java.lang.String>) strList43, filteringMode52);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap56 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList57 = java.util.Locale.LanguageRange.parse("nailati", strMap56);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap58 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList59 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList57, strMap58);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap60 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList61 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList59, strMap60);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap63 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList64 = java.util.Locale.LanguageRange.parse("ENGLISCH", strMap63);
        java.util.Locale locale65 = java.util.Locale.ITALIAN;
        java.util.Set<java.lang.Character> charSet66 = locale65.getExtensionKeys();
        java.lang.String str67 = locale65.getVariant();
        java.lang.String str68 = locale65.getDisplayName();
        java.lang.String str69 = locale65.getCountry();
        java.util.Set<java.lang.String> strSet70 = locale65.getUnicodeLocaleKeys();
        java.lang.String str71 = java.util.Locale.lookupTag(languageRangeList64, (java.util.Collection<java.lang.String>) strSet70);
        java.util.Locale.LanguageRange[] languageRangeArray72 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList73 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList73, languageRangeArray72);
        java.util.Locale.LanguageRange[] languageRangeArray75 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList76 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList76, languageRangeArray75);
        java.lang.String[] strArray80 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList81 = new java.util.ArrayList<java.lang.String>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList81, strArray80);
        java.util.Locale.FilteringMode filteringMode83 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList84 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList76, (java.util.Collection<java.lang.String>) strList81, filteringMode83);
        java.util.Locale.FilteringMode filteringMode85 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList86 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList73, (java.util.Collection<java.lang.String>) strList81, filteringMode85);
        java.util.Collection<java.util.Locale> localeCollection87 = null;
        java.util.List<java.util.Locale> localeList88 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList73, localeCollection87);
        java.util.Locale locale89 = java.util.Locale.lookup(languageRangeList64, (java.util.Collection<java.util.Locale>) localeList88);
        java.util.Locale locale90 = java.util.Locale.lookup(languageRangeList59, (java.util.Collection<java.util.Locale>) localeList88);
        java.util.List<java.util.Locale> localeList91 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList15, (java.util.Collection<java.util.Locale>) localeList88);
        java.util.Locale locale92 = java.util.Locale.lookup(languageRangeList11, (java.util.Collection<java.util.Locale>) localeList88);
        java.util.Locale locale93 = java.util.Locale.lookup(languageRangeList4, (java.util.Collection<java.util.Locale>) localeList88);
        java.util.List<java.util.Locale> localeList94 = java.util.Locale.filter(languageRangeList2, (java.util.Collection<java.util.Locale>) localeList88);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale95 = java.util.Locale.lookup(languageRangeList0, (java.util.Collection<java.util.Locale>) localeList88);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(languageRangeList6);
        org.junit.Assert.assertNotNull(languageRangeList9);
        org.junit.Assert.assertNotNull(languageRangeList11);
        org.junit.Assert.assertNotNull(languageRangeList13);
        org.junit.Assert.assertNotNull(languageRangeArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(languageRangeArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + filteringMode25 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode25.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertTrue("'" + filteringMode27 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode27.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList28);
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
        org.junit.Assert.assertNotNull(strList54);
        org.junit.Assert.assertNotNull(languageRangeList57);
        org.junit.Assert.assertNotNull(languageRangeList59);
        org.junit.Assert.assertNotNull(languageRangeList61);
        org.junit.Assert.assertNotNull(languageRangeList64);
        org.junit.Assert.assertNotNull(locale65);
        org.junit.Assert.assertEquals(locale65.toString(), "it");
        org.junit.Assert.assertNotNull(charSet66);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "italien" + "'", str68, "italien");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertNotNull(strSet70);
        org.junit.Assert.assertNull(str71);
        org.junit.Assert.assertNotNull(languageRangeArray72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(languageRangeArray75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertTrue("'" + filteringMode83 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode83.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList84);
        org.junit.Assert.assertTrue("'" + filteringMode85 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode85.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList86);
        org.junit.Assert.assertNotNull(localeList88);
        org.junit.Assert.assertNull(locale89);
        org.junit.Assert.assertNull(locale90);
        org.junit.Assert.assertNotNull(localeList91);
        org.junit.Assert.assertNull(locale92);
        org.junit.Assert.assertNull(locale93);
        org.junit.Assert.assertNotNull(localeList94);
    }

    @Test
    public void test16475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16475");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.GERMAN;
        java.util.Locale locale3 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str4 = locale2.getDisplayName(locale3);
        java.util.Locale.setDefault(category0, locale3);
        java.util.Set<java.lang.String> strSet6 = locale3.getUnicodeLocaleKeys();
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet6, "Egallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallman");
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "de");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "allemand" + "'", str4, "allemand");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test16476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16476");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hi!");
        java.lang.String str2 = locale1.getCountry();
        java.util.Locale.Builder builder3 = new java.util.Locale.Builder();
        java.util.Locale locale4 = builder3.build();
        java.util.Locale locale6 = java.util.Locale.forLanguageTag("Italian");
        java.lang.String str7 = locale4.getDisplayLanguage(locale6);
        java.lang.String str8 = locale1.getDisplayLanguage(locale4);
        java.lang.String str9 = locale1.getDisplayVariant();
        java.util.Locale.Builder builder10 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder11 = builder10.clearExtensions();
        java.util.Locale.Builder builder13 = builder10.setLanguageTag("Italian");
        java.util.Locale locale14 = java.util.Locale.PRC;
        java.lang.String str15 = locale14.getDisplayName();
        java.util.Locale.Builder builder16 = builder10.setLocale(locale14);
        java.util.Locale locale18 = java.util.Locale.forLanguageTag("\\u0020");
        java.lang.String str19 = locale18.getDisplayScript();
        java.util.Locale.setDefault(locale18);
        java.util.Locale.Builder builder21 = builder10.setLocale(locale18);
        java.util.Locale locale22 = builder10.build();
        java.lang.String str23 = locale1.getDisplayLanguage(locale22);
        java.util.Set<java.lang.String> strSet24 = locale1.getUnicodeLocaleAttributes();
        java.lang.String str26 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet24, "");
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
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "chinois (Chine)" + "'", str15, "chinois (Chine)");
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test16477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16477");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r                                                                                              Deutsch", "ITALIAN4ITALIAN4ITALIAN4ITALIA    IIIIIIIIII...........................", "aaaaaaaaaaaaaaaaaaaaaaaaaa...anitaliaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r                                                                                              Deutsch" + "'", str3, "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r                                                                                              Deutsch");
    }

    @Test
    public void test16478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16478");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("und-KO", "FranzosischFranzosisch (Frankreich)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "und-KO" + "'", str2, "und-KO");
    }

    @Test
    public void test16479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16479");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("nglish ...nglish ...nglish ...nglichinoisf(Chine)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test16480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16480");
        java.util.Locale locale1 = new java.util.Locale("en");
        boolean boolean2 = locale1.hasExtensions();
        java.util.Set<java.lang.String> strSet3 = locale1.getUnicodeLocaleKeys();
        java.util.Locale locale4 = java.util.Locale.ITALIAN;
        java.lang.String str5 = locale4.getDisplayLanguage();
        java.util.Locale locale6 = locale4.stripExtensions();
        java.lang.String str7 = locale6.getVariant();
        java.lang.String str8 = locale1.getDisplayLanguage(locale6);
        java.lang.Object obj9 = locale6.clone();
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "it");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Italian" + "'", str5, "Italian");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "it");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "inglese" + "'", str8, "inglese");
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "it");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "it");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "it");
    }

    @Test
    public void test16481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16481");
        char[] charArray9 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny("             ", charArray9);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "fran\347ais (Canada)", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4##a a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4##a a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, #, #, a,  , a]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test16482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16482");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "\ud504\ub791\uc2a4\uc5b4\uce90\ub098\ub2e4)", "Cor\351e du Sud");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test16483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16483");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\!_\\U0020_Itle\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\!_\\u0020_itle\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\" + "'", str1, "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\!_\\u0020_itle\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
    }

    @Test
    public void test16484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16484");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "Frz\366cz(frkrec)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Frz\366cz(frkrec)" + "'", str1, "Frz\366cz(frkrec)");
    }

    @Test
    public void test16485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16485");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiNumeric('Y');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test16486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16486");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Ialensch#########################################################################################");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test16487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16487");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder6 = builder1.setLanguage("und");
        java.util.Locale.Builder builder7 = builder1.clear();
        java.util.Locale locale9 = java.util.Locale.JAPANESE;
        java.lang.String str10 = locale9.getISO3Country();
        java.lang.String str11 = locale9.getVariant();
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.upperCase("it", locale9);
        java.util.Locale.Builder builder13 = builder1.setLocale(locale9);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder15 = builder1.setScript("                              4444ALLEMAND                              4444");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script:                               4444ALLEMAND                              4444 [at index 0]");
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
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "IT" + "'", str12, "IT");
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test16488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16488");
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
        java.util.Locale locale14 = new java.util.Locale("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhfr-CA", "", "                                      )hsilgne,nailati( ");
        java.lang.String str15 = locale14.getISO3Country();
        java.util.Locale.setDefault(category0, locale14);
        java.lang.String str17 = locale14.getLanguage();
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
        org.junit.Assert.assertEquals(locale14.toString(), "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhfr-ca__                                      )hsilgne,nailati( ");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhfr-ca" + "'", str17, "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhfr-ca");
    }

    @Test
    public void test16489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16489");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("e             g                                                                                     ", "HARZHASZHAZHZHZHZHZHZHZHZHZHZ", 56);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test16490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16490");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "gbr");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test16491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16491");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "fr-CA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "fr-CA" + "'", str1, "fr-CA");
    }

    @Test
    public void test16492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16492");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("anglais (Canada)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "anglais (Canada)" + "'", str1, "anglais (Canada)");
    }

    @Test
    public void test16493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16493");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("AzhzhzhzhzhzhzhzhzhzhE             g");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AzhzhzhzhzhzhzhzhzhzhE             g" + "'", str1, "AzhzhzhzhzhzhzhzhzhzhE             g");
    }

    @Test
    public void test16494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16494");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEnglischCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "                                             hcstued", (int) 'i', 31);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test16495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16495");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!aNCHc!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", 314, 55);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...c!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str3, "...c!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test16496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16496");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("AZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS CINESE (CINA)\\U0069H..FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZH", "... g ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS CINESE (CINA)\\U0069H..FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZH" + "'", str2, "AZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS CINESE (CINA)\\U0069H..FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZH");
    }

    @Test
    public void test16497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16497");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("Italia", "Deutschland");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test16498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16498");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder19 = builder17.setRegion("                                                                                                      ");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region:                                                                                                        [at index 0]");
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
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "it");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Italian" + "'", str12, "Italian");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "it");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder17);
    }

    @Test
    public void test16499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16499");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("z...\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rFrn", "alhi!       _\\U0020_Italienisch####################################################################          andallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemand", 3, (int) 'l');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "z..alhi!       _\\U0020_Italienisch####################################################################          andallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemand" + "'", str4, "z..alhi!       _\\U0020_Italienisch####################################################################          andallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemand");
    }

    @Test
    public void test16500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16500");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('G', 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }
}
