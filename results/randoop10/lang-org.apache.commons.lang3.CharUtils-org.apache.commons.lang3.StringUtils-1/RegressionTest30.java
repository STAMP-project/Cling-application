import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest30 {

    public static boolean debug = false;

    @Test
    public void test15001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15001");
        java.util.Locale locale1 = java.util.Locale.CHINESE;
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("Franz\366sisch (Frankreich)", locale1);
        java.lang.String str3 = locale1.getLanguage();
        java.util.Locale locale4 = locale1.stripExtensions();
        java.lang.String str6 = locale4.getExtension('N');
        java.util.Locale locale7 = java.util.Locale.FRENCH;
        java.util.Locale locale8 = java.util.Locale.ENGLISH;
        java.lang.String str9 = locale8.getDisplayCountry();
        java.lang.String str10 = locale7.getDisplayVariant(locale8);
        java.lang.String str11 = locale7.getDisplayCountry();
        java.lang.String str12 = locale7.getScript();
        java.lang.String str13 = locale7.getScript();
        java.util.Locale locale14 = java.util.Locale.FRENCH;
        java.util.Locale locale15 = java.util.Locale.ENGLISH;
        java.lang.String str16 = locale15.getDisplayCountry();
        java.lang.String str17 = locale14.getDisplayVariant(locale15);
        java.lang.String str18 = locale14.getDisplayCountry();
        java.lang.String str19 = locale14.getScript();
        java.lang.String str20 = locale14.getScript();
        java.lang.String str21 = locale7.getDisplayCountry(locale14);
        java.util.Locale.Category category22 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale23 = java.util.Locale.getDefault(category22);
        java.util.Locale locale24 = java.util.Locale.FRANCE;
        java.util.Locale locale25 = java.util.Locale.ITALIAN;
        java.lang.String str27 = locale25.getExtension('h');
        java.lang.String str28 = locale24.getDisplayScript(locale25);
        java.lang.String str29 = locale24.getISO3Country();
        java.util.Locale locale30 = java.util.Locale.GERMAN;
        java.util.Locale.setDefault(locale30);
        java.lang.String str32 = locale24.getDisplayName(locale30);
        java.lang.String str33 = locale24.getScript();
        java.util.Locale.setDefault(category22, locale24);
        java.lang.String str35 = locale7.getDisplayCountry(locale24);
        java.lang.String str36 = locale24.getVariant();
        java.util.Locale locale38 = new java.util.Locale("francese (Canada)");
        java.lang.String str39 = locale24.getDisplayName(locale38);
        boolean boolean40 = locale38.hasExtensions();
        java.lang.String str41 = locale4.getDisplayLanguage(locale38);
        java.lang.String str42 = locale4.getDisplayCountry();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "franz\366sisch (frankreich)" + "'", str2, "franz\366sisch (frankreich)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zh" + "'", str3, "zh");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "fr");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "en");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + category22 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category22.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale23);
// flaky:         org.junit.Assert.assertEquals(locale23.toString(), "it");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "it");
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "FRA" + "'", str29, "FRA");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "de");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Franz\366sisch (Frankreich)" + "'", str32, "Franz\366sisch (Frankreich)");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals(locale38.toString(), "francese (canada)");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "French (France)" + "'", str39, "French (France)");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Chinese" + "'", str41, "Chinese");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
    }

    @Test
    public void test15002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15002");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("R0", "Cinese (Cina)\\u0069h...");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test15003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15003");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("bgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgtalian");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "bgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgtalian" + "'", str1, "bgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgtalian");
    }

    @Test
    public void test15004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15004");
        java.util.Locale locale1 = new java.util.Locale("AD4AE4AF4AG4AI4AL4AM4AN4AO4AQ4AR4AS4AT4AU4AW4AX4AZ4BA4BB4BD4BE4BF4BG4BH4BI4BJ4BL4BM4BN4BO4BQ4BR4BS4BT4BV4BW4BY4BZ4CA4CC4CD4CF4CG4CH4CI4CK4CL4CM4CN4CO4CR4CU4CV4CW4CX4CY4CZ4DE4DJ4DK4DM4DO4DZ4EC4EE4EG4EH4ER4ES4ET4FI4FJ4FK4FM4FO4FR4GA4GB4GD4GE4GF4GG4GH4GI4GL4GM4GN4GP4GQ4GR4GS4GT4GU4GW4GY4HK4HM4HN4HR4HT4HU4ID4IE4IL4IM4IN4IO4IQ4IR4IS4IT4JE4JM4JO4JP4KE4KG4KH4KI4KM4KN4KP4KR4KW4KY4KZ4LA4LB4LC4LI4LK4LR4LS4LT4LU4LV4LY4MA4MC4MD4ME4MF4MG4MH4MK4ML4MM4MN4MO4MP4MQ4MR4MS4MT4MU4MV4MW4MX4MY4MZ4NA4NC4NE4NF4NG4NI4NL4NO4NP4NR4NU4NZ4OM4PA4PE4PF4PG4PH4PK4PL4PM4PN4PR4PS4PT4PW4PY4QA4RE4RO4RS4RU4RW4SA4SB4SC4SD4SE4SG4SH4SI4SJ4SK4SL4SM4SN4SO4SR4SS4ST4SV4SX4SY4SZ4TC4TD4TF4TG4TH4TJ4TK4TL4TM4TN4TO4TR4TT4TV4TW4TZ4UA4UG4UM4US4UY4UZ4VA4VC4VE4VG4VI4VN4VU4WF4WS4YE4YT4ZA4ZM4ZW");
        java.util.Set<java.lang.Character> charSet2 = locale1.getExtensionKeys();
        org.junit.Assert.assertEquals(locale1.toString(), "ad4ae4af4ag4ai4al4am4an4ao4aq4ar4as4at4au4aw4ax4az4ba4bb4bd4be4bf4bg4bh4bi4bj4bl4bm4bn4bo4bq4br4bs4bt4bv4bw4by4bz4ca4cc4cd4cf4cg4ch4ci4ck4cl4cm4cn4co4cr4cu4cv4cw4cx4cy4cz4de4dj4dk4dm4do4dz4ec4ee4eg4eh4er4es4et4fi4fj4fk4fm4fo4fr4ga4gb4gd4ge4gf4gg4gh4gi4gl4gm4gn4gp4gq4gr4gs4gt4gu4gw4gy4hk4hm4hn4hr4ht4hu4id4ie4il4im4in4io4iq4ir4is4it4je4jm4jo4jp4ke4kg4kh4ki4km4kn4kp4kr4kw4ky4kz4la4lb4lc4li4lk4lr4ls4lt4lu4lv4ly4ma4mc4md4me4mf4mg4mh4mk4ml4mm4mn4mo4mp4mq4mr4ms4mt4mu4mv4mw4mx4my4mz4na4nc4ne4nf4ng4ni4nl4no4np4nr4nu4nz4om4pa4pe4pf4pg4ph4pk4pl4pm4pn4pr4ps4pt4pw4py4qa4re4ro4rs4ru4rw4sa4sb4sc4sd4se4sg4sh4si4sj4sk4sl4sm4sn4so4sr4ss4st4sv4sx4sy4sz4tc4td4tf4tg4th4tj4tk4tl4tm4tn4to4tr4tt4tv4tw4tz4ua4ug4um4us4uy4uz4va4vc4ve4vg4vi4vn4vu4wf4ws4ye4yt4za4zm4zw");
        org.junit.Assert.assertNotNull(charSet2);
    }

    @Test
    public void test15005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15005");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("United State                                                                                     ", "Eng");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "United State                                                                                     " + "'", str2, "United State                                                                                     ");
    }

    @Test
    public void test15006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15006");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA             FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA             FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA             FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA23", (java.lang.CharSequence) "\\u0068       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih   ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test15007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15007");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("H", "zh-TW", 100);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test15008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15008");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                                                                                                    ");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '#');
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny("                                                         \\u005c                                                         ", strArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "\\U0020");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                                                                                    " + "'", str4, "                                                                                                    ");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "                                                                                                    " + "'", str7, "                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "                                                                                                    " + "'", str8, "                                                                                                    ");
    }

    @Test
    public void test15009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15009");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz\\XTALXAN_ITALIAN_ENGLXSHzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz", (int) 'A');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz\\XTALXAN_ITALIAN_ENGLXSHzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz" + "'", str2, "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz\\XTALXAN_ITALIAN_ENGLXSHzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
    }

    @Test
    public void test15010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15010");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("", "en_GB", (int) 'E');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test15011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15011");
        char[] charArray10 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZW", charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "en-GB", charArray10);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4##a a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4##a a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, #, #, a,  , a]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test15012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15012");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("\\\\\\\\\\\\\\\\\\\\\\\\kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkDEkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk\\\\\\\\\\\\\\\\\\\\\\\\", 0, "\\                                               nailati                                              ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\\\\\\\\\\\\\\\\\\\\\\\kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkDEkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk\\\\\\\\\\\\\\\\\\\\\\\\" + "'", str3, "\\\\\\\\\\\\\\\\\\\\\\\\kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkDEkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk\\\\\\\\\\\\\\\\\\\\\\\\");
    }

    @Test
    public void test15013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15013");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiPrintable('U');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test15014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15014");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "ta...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test15015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15015");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("                          g             E", "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test15016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15016");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("\\u0029", (int) 'C', (int) '\r');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test15017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15017");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF", "FR_fr");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF" + "'", str2, "FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF");
    }

    @Test
    public void test15018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15018");
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
        int int23 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "44444444444444444444444444444444444444444444it                   ", charArray13);
        boolean boolean24 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444en", charArray13);
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 44 + "'", int23 == 44);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test15019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15019");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiAlphaLower('l');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test15020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15020");
        java.util.Locale.Category category0 = null;
        java.util.Locale locale2 = java.util.Locale.KOREA;
        java.lang.String str3 = locale2.getVariant();
        java.lang.String str4 = locale2.getVariant();
        java.lang.String str5 = locale2.getISO3Country();
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.upperCase("4444444fra", locale2);
        java.util.Locale.setDefault(locale2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.setDefault(category0, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Category cannot be NULL");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "KOR" + "'", str5, "KOR");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4444444FRA" + "'", str6, "4444444FRA");
    }

    @Test
    public void test15021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15021");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("\\u0043", (int) '2', '\r');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\u0043\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r" + "'", str3, "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\u0043\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r");
    }

    @Test
    public void test15022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15022");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("italiae");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ITALIAE" + "'", str1, "ITALIAE");
    }

    @Test
    public void test15023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15023");
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
        java.util.Locale locale13 = builder12.build();
        java.util.Locale.Builder builder14 = builder12.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder16 = builder12.setScript("...It...");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: ...It... [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\uc911\uad6d\uc5b4\uc911\uad6d)" + "'", str5, "\uc911\uad6d\uc5b4\uc911\uad6d)");
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
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test15024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15024");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "                                          francese (Canada)                                           ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test15025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15025");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("talian (FRA,Undetermined)", "u005c", 220);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "talian (FRA,Undetermined)" + "'", str3, "talian (FRA,Undetermined)");
    }

    @Test
    public void test15026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15026");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("Cinese (cina)\\u0069h...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test15027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15027");
        java.util.Locale locale1 = new java.util.Locale("    \\    ");
        org.junit.Assert.assertEquals(locale1.toString(), "    \\    ");
    }

    @Test
    public void test15028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15028");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("aaaaaaaaaaaaaaaaaaaaaaaaaa...anitaliaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaa...anitaliaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaa...anitaliaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test15029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15029");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("20IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I", "         italian_ITALIAN_English");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "20IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I" + "'", str2, "20IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I");
    }

    @Test
    public void test15030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15030");
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
        java.lang.String str33 = locale18.getISO3Language();
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
        org.junit.Assert.assertEquals(locale17.toString(), "ko_KR");
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
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "fra" + "'", str33, "fra");
    }

    @Test
    public void test15031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15031");
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
        java.util.Locale.Category category18 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale20 = new java.util.Locale("...ANiTALI");
        java.util.Locale.setDefault(category18, locale20);
        java.util.Locale locale22 = java.util.Locale.getDefault(category18);
        java.lang.String str23 = locale22.getLanguage();
        java.lang.String str24 = locale22.getISO3Country();
        java.lang.String str25 = locale22.getISO3Country();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder26 = builder17.setLocale(locale22);
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: ...anitali [at index 0]");
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
        org.junit.Assert.assertTrue("'" + category18 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category18.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertEquals(locale20.toString(), "...anitali");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "...anitali");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "...anitali" + "'", str23, "...anitali");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test15032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15032");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("\\U0020ItalianItalianItalianItali\\U0020ItalianItalianItalianItal");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u0020italianitalianitalianitali\\u0020italianitalianitalianital" + "'", str1, "\\u0020italianitalianitalianitali\\u0020italianitalianitalianital");
    }

    @Test
    public void test15033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15033");
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
        java.lang.String str35 = locale33.getDisplayName();
        java.util.Locale locale36 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str37 = locale36.toLanguageTag();
        java.lang.String str38 = locale33.getDisplayVariant(locale36);
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
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "                                     fran\347ais (france)                                       (CHINESE (CHINA)" + "'", str35, "                                     fran\347ais (france)                                       (CHINESE (CHINA)");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "fr-CA" + "'", str37, "fr-CA");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
    }

    @Test
    public void test15034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15034");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("    \\XTALXAN_ITALIAN_ENGLXSH    R0                                               nailati             ", (int) 'u', (int) '\r');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test15035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15035");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                                                            fr_FR                  ", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test15036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15036");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        java.util.Locale locale1 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str2 = locale0.getDisplayName(locale1);
        java.util.Locale.Category category3 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale4 = java.util.Locale.getDefault(category3);
        java.lang.String str5 = locale1.getDisplayVariant(locale4);
        java.util.Locale locale6 = locale1.stripExtensions();
        java.util.Locale.setDefault(locale1);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "allemand" + "'", str2, "allemand");
        org.junit.Assert.assertTrue("'" + category3 + "' != '" + java.util.Locale.Category.FORMAT + "'", category3.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_CA");
    }

    @Test
    public void test15037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15037");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "it_IT", (java.lang.CharSequence) "AzhzhzhzhzhzhzhzhzhzhE             g");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test15038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15038");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("                                             hcstued                                             ", "\\U0020");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test15039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15039");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("ad4ae4af4ag4ai4al4am4an4ao4aq4ar4as4at4au4aw4ax4az4ba4bb4bd4be4bf4bg4bh4bi4bj4bl4bm4bn4bo4bq4br4bs4bt4bv4bw4by4bz4ca4cc4cd4cf4cg4ch4ci4ck4cl4cm4cn4co4cr4cu4cv4cw4cx4cy4cz4de4dj4dk4dm4do4dz4ec4ee4eg4eh4er4es4et4fi4fj4fk4fm4fo4fr4ga4gb4gd4ge4gf4gg4gh4gi4gl4gm4gn4gp4gq4gr4gs4gt4gu4gw4gy4hk4hm4hn4hr4ht4hu4id4ie4il4im4in4io4iq4ir4is4it4je4jm4jo4jp4ke4kg4kh4ki4km4kn4kp4kr4kw4ky4kz4la4lb4lc4li4lk4lr4ls4lt4lu4lv4ly4ma4mc4md4me4mf4mg4mh4mk4ml4mm4mn4mo4mp4mq4mr4ms4mt4mu4mv4mw4mx4my4mz4na4nc4ne4nf4ng4ni4nl4no4np4nr4nu4nz4om4pa4pe4pf4pg4ph4pk4pl4pm4pn4pr4ps4pt4pw4py4qa4re4ro4rs4ru4rw4sa4sb4sc4sd4se4sg4sh4si4sj4sk4sl4sm4sn4so4sr4ss4st4sv4sx4sy4sz4tc4td4tf4tg4th4tj4tk4tl4tm4tn4to4tr4tt4tv4tw4tz4ua4ug4um4us4uy4uz4va4vc4ve4vg4vi4vn4vu4wf4ws4ye4yt4za4zm4zw", "\\u0020italianitalianitalianitali\\u0020italianitalianitalianital");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test15040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15040");
        java.lang.String[] strArray0 = java.util.Locale.getISOCountries();
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray0);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray0, ' ', (int) 'x', (int) (byte) 10);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray0, "\\U0034\\U00                                             HCSTUD                                             \\U0034\\U00", 23, 21);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZW" + "'", str1, "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZW");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZW" + "'", str10, "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZW");
    }

    @Test
    public void test15041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15041");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("                                                               \\U002   ", 51, (int) 'U');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                               \\U002   " + "'", str3, "                                                               \\U002   ");
    }

    @Test
    public void test15042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15042");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "\u82f1\u8a9e");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u82f1\u8a9e" + "'", str1, "\u82f1\u8a9e");
    }

    @Test
    public void test15043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15043");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("\uc774\ud0c8\ub9ac\uc544\uc5b4", "Royaume-Uni");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\uc774\ud0c8\ub9ac\uc544\uc5b4" + "'", str2, "\uc774\ud0c8\ub9ac\uc544\uc5b4");
    }

    @Test
    public void test15044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15044");
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
        java.lang.String str20 = locale8.getLanguage();
        java.lang.String str21 = locale8.getCountry();
        java.util.Locale.setDefault(locale8);
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "fran\347ais" + "'", str17, "fran\347ais");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "fr" + "'", str20, "fr");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test15045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15045");
        java.util.Locale locale1 = new java.util.Locale("AD4AE4AF4AG4AI4AL4AM4AN4AO4AQ4AR4AS4AT4AU4AW4AX4AZ4BA4BB4BD4BE4BF4BG4BH4BI4BJ4BL4BM4BN4BO4BQ4BR4BS4BT4BV4BW4BY4BZ4CA4CC4CD4CF4CG4CH4CI4CK4CL4CM4CN4CO4CR4CU4CV4CW4CX4CY4CZ4DE4DJ4DK4DM4DO4DZ4EC4EE4EG4EH4ER4ES4ET4FI4FJ4FK4FM4FO4FR4GA4GB4GD4GE4GF4GG4GH4GI4GL4GM4GN4GP4GQ4GR4GS4GT4GU4GW4GY4HK4HM4HN4HR4HT4HU4ID4IE4IL4IM4IN4IO4IQ4IR4IS4IT4JE4JM4JO4JP4KE4KG4KH4KI4KM4KN4KP4KR4KW4KY4KZ4LA4LB4LC4LI4LK4LR4LS4LT4LU4LV4LY4MA4MC4MD4ME4MF4MG4MH4MK4ML4MM4MN4MO4MP4MQ4MR4MS4MT4MU4MV4MW4MX4MY4MZ4NA4NC4NE4NF4NG4NI4NL4NO4NP4NR4NU4NZ4OM4PA4PE4PF4PG4PH4PK4PL4PM4PN4PR4PS4PT4PW4PY4QA4RE4RO4RS4RU4RW4SA4SB4SC4SD4SE4SG4SH4SI4SJ4SK4SL4SM4SN4SO4SR4SS4ST4SV4SX4SY4SZ4TC4TD4TF4TG4TH4TJ4TK4TL4TM4TN4TO4TR4TT4TV4TW4TZ4UA4UG4UM4US4UY4UZ4VA4VC4VE4VG4VI4VN4VU4WF4WS4YE4YT4ZA4ZM4ZW");
        java.lang.String str2 = locale1.getVariant();
        org.junit.Assert.assertEquals(locale1.toString(), "ad4ae4af4ag4ai4al4am4an4ao4aq4ar4as4at4au4aw4ax4az4ba4bb4bd4be4bf4bg4bh4bi4bj4bl4bm4bn4bo4bq4br4bs4bt4bv4bw4by4bz4ca4cc4cd4cf4cg4ch4ci4ck4cl4cm4cn4co4cr4cu4cv4cw4cx4cy4cz4de4dj4dk4dm4do4dz4ec4ee4eg4eh4er4es4et4fi4fj4fk4fm4fo4fr4ga4gb4gd4ge4gf4gg4gh4gi4gl4gm4gn4gp4gq4gr4gs4gt4gu4gw4gy4hk4hm4hn4hr4ht4hu4id4ie4il4im4in4io4iq4ir4is4it4je4jm4jo4jp4ke4kg4kh4ki4km4kn4kp4kr4kw4ky4kz4la4lb4lc4li4lk4lr4ls4lt4lu4lv4ly4ma4mc4md4me4mf4mg4mh4mk4ml4mm4mn4mo4mp4mq4mr4ms4mt4mu4mv4mw4mx4my4mz4na4nc4ne4nf4ng4ni4nl4no4np4nr4nu4nz4om4pa4pe4pf4pg4ph4pk4pl4pm4pn4pr4ps4pt4pw4py4qa4re4ro4rs4ru4rw4sa4sb4sc4sd4se4sg4sh4si4sj4sk4sl4sm4sn4so4sr4ss4st4sv4sx4sy4sz4tc4td4tf4tg4th4tj4tk4tl4tm4tn4to4tr4tt4tv4tw4tz4ua4ug4um4us4uy4uz4va4vc4ve4vg4vi4vn4vu4wf4ws4ye4yt4za4zm4zw");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test15046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15046");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz\\XTALXAN_ITALIAN_ENGLXSHzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz\\XTALXAN_ITALIAN_ENGLXSHzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz" + "'", str1, "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz\\XTALXAN_ITALIAN_ENGLXSHzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
    }

    @Test
    public void test15047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15047");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("!ih", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!ih" + "'", str2, "!ih");
    }

    @Test
    public void test15048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15048");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiAlphanumeric('b');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test15049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15049");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiitalian_ITALIAN_EnglisEiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test15050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15050");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.lang.String str2 = locale0.getExtension('h');
        java.util.Locale.setDefault(locale0);
        java.util.Locale locale4 = null;
        java.lang.String str5 = locale0.getDisplayCountry(locale4);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test15051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15051");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("francefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrance", "HI!       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "francefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrance" + "'", str2, "francefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrance");
    }

    @Test
    public void test15052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15052");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("anihc!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "anihc!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str1, "anihc!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test15053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15053");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("zH_cnFrench (Canada)AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\\u0020iItalian\\u0020i                                                 ", "francese (Canada)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "zH_cnFrench (Canada)AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\\u0020iItalian\\u0020i                                                 " + "'", str2, "zH_cnFrench (Canada)AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\\u0020iItalian\\u0020i                                                 ");
    }

    @Test
    public void test15054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15054");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "                                 KOREAN (SOUTH KOREA)", (java.lang.CharSequence) "CCCCCCC           \\uCCCCCC");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 42 + "'", int2 == 42);
    }

    @Test
    public void test15055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15055");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "c500u");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "c500u" + "'", str1, "c500u");
    }

    @Test
    public void test15056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15056");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("", "                                      france                                      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                      france                                      " + "'", str2, "                                      france                                      ");
    }

    @Test
    public void test15057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15057");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("Korean (South Korea)", "hi!        (\\u0020,italienisch#########################################################################################)", "EnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglish");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Korean (South Korea)" + "'", str3, "Korean (South Korea)");
    }

    @Test
    public void test15058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15058");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("2E             giTALIANiTALIANi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "2E             giTALIANiTALIANi" + "'", str1, "2E             giTALIANiTALIANi");
    }

    @Test
    public void test15059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15059");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "fr");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Fr" + "'", str1, "Fr");
    }

    @Test
    public void test15060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15060");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Eagaash", "h", (int) 'f');
        boolean boolean7 = org.apache.commons.lang3.StringUtils.endsWithAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaafraaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray6);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray6);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.startsWithAny("FRA", strArray6);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.startsWithAny("ittait_italian_egaish          ", strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test15061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15061");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("en_CA...FDEDZCYCXCWCVCUCRCOCNCMCLCKCICHCGCFCDCCCACZBYBWBVBTBSBRBQBOBNBMBLBJBIBHBGBFBEBDBBBABZAXAWAUATASARAQAOANAMALAIAGAFAEADA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EN_ca...fdedzcycxcwcvcucrcocncmclckcichcgcfcdcccaczbybwbvbtbsbrbqbobnbmblbjbibhbgbfbebdbbbabzaxawauatasaraqaoanamalaiagafaeada" + "'", str1, "EN_ca...fdedzcycxcwcvcucrcocncmclckcichcgcfcdcccaczbybwbvbtbsbrbqbobnbmblbjbibhbgbfbebdbbbabzaxawauatasaraqaoanamalaiagafaeada");
    }

    @Test
    public void test15062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15062");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) 'h', 'F');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'h' + "'", char2 == 'h');
    }

    @Test
    public void test15063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15063");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "        \\u005c         canadacanadacanadacan");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test15064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15064");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("     Englisch", "Franzosisch (Kanada)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test15065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15065");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("                   ", "DEUTSCH\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\", "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhfr-CA");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test15066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15066");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("tal", '#');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test15067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15067");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("          2cinese (Cina)iTALIANiTALIANiTALIANiTAL", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "          2cinese (Cina)iTALIANiTALIANiTALIANiTAL" + "'", str2, "          2cinese (Cina)iTALIANiTALIANiTALIANiTAL");
    }

    @Test
    public void test15068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15068");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("Deutsch\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\", "fr-cafr-cafr-c8600u\\fr-cafr-cafr-ca");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test15069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15069");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzHSXLGNE_NAILATI_NAXLATX\\zzzzz...", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzHSXLGNE_NAILATI_NAXLATX\\zzzzz..." + "'", str2, "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzHSXLGNE_NAILATI_NAXLATX\\zzzzz...");
    }

    @Test
    public void test15070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15070");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("                                                                                     German (Germany)", 'G');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ermany)German (G                                                                                     " + "'", str2, "ermany)German (G                                                                                     ");
    }

    @Test
    public void test15071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15071");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "!_\\U0020_Itle");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!_\\U0020_Itle" + "'", str1, "!_\\U0020_Itle");
    }

    @Test
    public void test15072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15072");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("hi!        (\\U0020,Italienisch#########################################################################################nnn", 99);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test15073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15073");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati" + "'", str1, "    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati");
    }

    @Test
    public void test15074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15074");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("KorezhzhzhzhzhzhzhzhzhzhFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAzhzhzhzhzhzhzemandn (South Korea)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "KorezhzhzhzhzhzhzhzhzhzhFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAzhzhzhzhzhzhzemandn (South Korea)" + "'", str1, "KorezhzhzhzhzhzhzhzhzhzhFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAzhzhzhzhzhzhzemandn (South Korea)");
    }

    @Test
    public void test15075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15075");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                        ", "Fr...", 9);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test15076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15076");
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
        java.util.Locale locale19 = new java.util.Locale("HI!       ", "\\U0020", "Italienisch#########################################################################################");
        java.util.Locale locale20 = locale19.stripExtensions();
        java.lang.String str21 = locale10.getDisplayName(locale19);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "it" + "'", str1, "it");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "francese (Canada)" + "'", str8, "francese (Canada)");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "de_DE");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals(locale19.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "German (Germany)" + "'", str21, "German (Germany)");
    }

    @Test
    public void test15077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15077");
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
        boolean boolean12 = locale10.equals((java.lang.Object) "HI!HI     \\u005c         ");
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "French (Canada)" + "'", str3, "French (Canada)");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test15078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15078");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("2222222222222222222italian_ITALIAN_EnglisFitalian (italian,englis", "Aiiiiiiiiiiiiiiiiitalian_italian_englishiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test15079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15079");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("chinoisf(Chine)", 49, "nglish ...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nglish ...nglish ...nglish ...nglichinoisf(Chine)" + "'", str3, "nglish ...nglish ...nglish ...nglichinoisf(Chine)");
    }

    @Test
    public void test15080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15080");
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
        java.util.Collection<java.util.Locale> localeCollection83 = null;
        java.util.Locale locale84 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, localeCollection83);
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
        org.junit.Assert.assertNull(locale84);
    }

    @Test
    public void test15081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15081");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", 'h');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, ')');
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "englisch (         ITALIAN_ITALIAN_ENGLISH,\\u0061");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray7);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.split("E             g", ' ');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("fran\347ais (Canada)", strArray7, strArray11);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "fran\347ais (Canada)" + "'", str12, "fran\347ais (Canada)");
    }

    @Test
    public void test15082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15082");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("\\u0065");
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\\' + "'", char1 == '\\');
    }

    @Test
    public void test15083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15083");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "EN_ca...fdedzcycxcwcvcucrcocncmclckcichcgcfcdcccaczbybwbvbtbsbrbqbobnbmblbjbibhbgbfbebdbbbabzaxawauatasaraqaoanamalaiagafaeada", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test15084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15084");
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
        java.util.Locale locale13 = java.util.Locale.getDefault(category0);
        java.lang.String str14 = locale13.getDisplayVariant();
        java.lang.String str16 = locale13.getExtension('I');
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
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test15085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15085");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("", "\\u0074", "        \\u005c         ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test15086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15086");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "Und-iTALIAN");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test15087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15087");
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
        java.util.Locale locale44 = new java.util.Locale("United Kingdom", "\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u", "EnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglisch");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder45 = builder39.setLocale(locale44);
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: united kingdom [at index 0]");
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
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "it");
    }

    @Test
    public void test15088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15088");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("french", 'k');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "french" + "'", str2, "french");
    }

    @Test
    public void test15089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15089");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("Azhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais cinese (cina)u0069h..France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzh", "kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkNI");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test15090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15090");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("\\u0068       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih   ", (int) '8', (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test15091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15091");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("Italian (Italy)", "KO", "HHHHHHHHH         ITAL\\u0020iItalian\\u008600u\\HHHHHHHHH         ITAL", (int) 'k');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Italian (Italy)" + "'", str4, "Italian (Italy)");
    }

    @Test
    public void test15092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15092");
        java.util.Locale locale3 = new java.util.Locale("italienisch", "EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEitalian_ITALIAN_EnglishEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   ti");
    }

    @Test
    public void test15093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15093");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("HHHHHHHHHHtTAHHHHHHHHHHT_ITA", "hIAN\\U0020Ih", (int) 'g', (int) 'f');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHHHHHHHHHtTAHHHHHHHHHHT_ITAhIAN\\U0020Ih" + "'", str4, "HHHHHHHHHHtTAHHHHHHHHHHT_ITAhIAN\\U0020Ih");
    }

    @Test
    public void test15094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15094");
        java.util.Locale locale2 = java.util.Locale.forLanguageTag("France");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.lowerCase("Frankreich", locale2);
        java.lang.String str4 = locale2.getDisplayVariant();
        java.util.Locale locale5 = java.util.Locale.ITALIAN;
        java.util.Set<java.lang.Character> charSet6 = locale5.getExtensionKeys();
        java.lang.String str7 = locale5.getVariant();
        java.lang.String str8 = locale2.getDisplayVariant(locale5);
        java.lang.String str9 = locale2.getScript();
        java.lang.String str10 = locale2.getDisplayCountry();
        java.util.Locale locale11 = locale2.stripExtensions();
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "france");
    }

    @Test
    public void test15095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15095");
        java.util.Locale locale0 = java.util.Locale.PRC;
        java.lang.String str1 = locale0.getDisplayVariant();
        java.lang.String str2 = locale0.getDisplayName();
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
        java.lang.String str32 = locale3.getVariant();
        java.lang.String str33 = locale0.getDisplayName(locale3);
        java.lang.String str34 = locale0.toLanguageTag();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Chinese (China)" + "'", str2, "Chinese (China)");
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
// flaky:         org.junit.Assert.assertEquals(locale19.toString(), "...anitali");
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
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "chinois (Chine)" + "'", str33, "chinois (Chine)");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "zh-CN" + "'", str34, "zh-CN");
    }

    @Test
    public void test15096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15096");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = java.util.Locale.UK;
        java.util.Locale.Builder builder3 = builder0.setLocale(locale2);
        java.lang.String str4 = locale2.getLanguage();
        java.lang.String str5 = locale2.getDisplayCountry();
        java.lang.Class<?> wildcardClass6 = locale2.getClass();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en_GB");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "en" + "'", str4, "en");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Royaume-Uni" + "'", str5, "Royaume-Uni");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test15097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15097");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                                                         \\u005c         ", '\\');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray3);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("...FDEDZCYCXCWCVCUCRCOCNCMCLCKC         ITALIAN_ITALIAN_ENGLISH         ITALIAN_!IHITTAIT_ITALIAN_EGAISHCHCGCFCDCCCACZBYBWBVBTBSBRBQBOBNBMBLBJB         ITALIAN_ITALIAN_ENGLISH         ITALIAN_!IHITTAIT_ITALIAN_EGAISHBHBGBFBEBDBBBABZAXAWAUATASARAQAOANAMALA         ITALIAN_ITALIAN_ENGLISH         ITALIAN_!IHITTAIT_ITALIAN_EGAISHAGAFAEADA", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                                         u005c         " + "'", str4, "                                                         u005c         ");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test15098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15098");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("English", "Italian");
        int int5 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.concatWith("             ", (java.lang.Object[]) strArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, "44444444444444444444444444444444!IH");
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.stripAll(strArray6, "de");
        boolean boolean12 = org.apache.commons.lang3.StringUtils.startsWithAny("           \\u", strArray6);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "E             g                          sh" + "'", str7, "E             g                          sh");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "E44444444444444444444444444444444!IHg44444444444444444444444444444444!IH44444444444444444444444444444444!IHsh" + "'", str9, "E44444444444444444444444444444444!IHg44444444444444444444444444444444!IH44444444444444444444444444444444!IHsh");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test15099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15099");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz\\XTALXAN_ITALIAN_ENGLXSHzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz", (java.lang.CharSequence) "E             g");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 104 + "'", int2 == 104);
    }

    @Test
    public void test15100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15100");
        java.util.Locale locale3 = new java.util.Locale("e", "\\u0061", "\n");
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
        java.lang.String str33 = locale21.getVariant();
        java.util.Locale locale35 = new java.util.Locale("francese (Canada)");
        java.lang.String str36 = locale21.getDisplayName(locale35);
        java.lang.String str37 = locale3.getDisplayLanguage(locale21);
        java.util.Set<java.lang.String> strSet38 = locale3.getUnicodeLocaleAttributes();
        org.junit.Assert.assertEquals(locale3.toString(), "e_\\U0061_\n");
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
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals(locale35.toString(), "francese (canada)");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "French (France)" + "'", str36, "French (France)");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "e" + "'", str37, "e");
        org.junit.Assert.assertNotNull(strSet38);
    }

    @Test
    public void test15101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15101");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) ")dnK( hcsis\366znrF                              ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test15102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15102");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("EFrankreichgFrankreichFrankreichs", (int) 'l', 'R');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRREFrankreichgFrankreichFrankreichs" + "'", str3, "RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRREFrankreichgFrankreichFrankreichs");
    }

    @Test
    public void test15103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15103");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "nailati");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 7 + "'", int1 == 7);
    }

    @Test
    public void test15104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15104");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "4444444fra                                                                                              ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 104 + "'", int1 == 104);
    }

    @Test
    public void test15105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15105");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("X");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "X" + "'", str1, "X");
    }

    @Test
    public void test15106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15106");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("Azhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais cinese (cina)\\u0069h..France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzh", 13);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hzhzhzhzhzhzh" + "'", str2, "hzhzhzhzhzhzh");
    }

    @Test
    public void test15107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15107");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("...                             xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=...xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test15108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15108");
        java.util.Locale locale1 = new java.util.Locale("\\U0078");
        java.lang.String str2 = locale1.getISO3Country();
        java.lang.String str3 = locale1.getVariant();
        org.junit.Assert.assertEquals(locale1.toString(), "\\u0078");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test15109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15109");
        char[] charArray8 = new char[] { 'f', '4' };
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "Chinese (China)", charArray8);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "itTAiT_ITALIAN_EgAish", charArray8);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC\\u00de\\u00CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC", charArray8);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "ADaAEaAFaAGaAIaALaAMaANaAOaAQaARaASaATaAUaAWaAXaAZaBAaBBaBDaBEaBFaBGaBHaBIaBJaBLaBMaBNaBOaBQaBRaBSaBTaBVaBWaBYaBZaCAaCCaCDaCFaCGaCHaCIaCKaCLaCMaCNaCOaCRaCUaCVaCWaCXaCYaCZaDEaDJaDKaDMaDOaDZaECaEEaEGaEHaERaESaETaFIaFJaFKaFMaFOaFRaGAaGBaGDaGEaGFaGGaGHaGIaGLaGMaGNaGPaGQaGRaGSaGTaGUaGWaGYaHKaHMaHNaHRaHTaHUaIDaIEaILaIMaINaIOaIQaIRaISaITaJEaJMaJOaJPaKEaKGaKHaKIaKMaKNaKPaKRaKWaKYaKZaLAaLBaLCaLIaLKaLRaLSaLTaLUaLVaLYaMAaMCaMDaMEaMFaMGaMHaMKaMLaMMaMNaMOaMPaMQaMRaMSaMTaMUaMVaMWaMXaMYaMZaNAaNCaNEaNFaNGaNIaNLaNOaNPaNRaNUaNZaOMaPAaPEaPFaPGaPHaPKaPLaPMaPNaPRaPSaPTaPWaPYaQAaREaROaRSaRUaRWaSAaSBaSCaSDaSEaSGaSHaSIaSJaSKaSLaSMaSNaSOaSRaSSaSTaSVaSXaSYaSZaTCaTDaTFaTGaTHaTJaTKaTLaTMaTNaTOaTRaTTaTVaTWaTZaUAaUGaUMaUSaUYaUZaVAaVCaVEaVGaVIaVNaVUaWFaWSaYEaYTaZAaZMaZW", charArray8);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "dddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddFranzosisch (Frankreich)", charArray8);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny("CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "f4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "f4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[f, 4]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test15110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15110");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("E");
        java.lang.String str2 = languageRange1.getRange();
        double double3 = languageRange1.getWeight();
        double double4 = languageRange1.getWeight();
        java.lang.String str5 = languageRange1.getRange();
        double double6 = languageRange1.getWeight();
        java.lang.String str7 = languageRange1.getRange();
        double double8 = languageRange1.getWeight();
        double double9 = languageRange1.getWeight();
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
        java.util.Locale.LanguageRange[] languageRangeArray25 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList26 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList26, languageRangeArray25);
        java.util.Locale.LanguageRange[] languageRangeArray28 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList29 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList29, languageRangeArray28);
        java.lang.String[] strArray33 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList34 = new java.util.ArrayList<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList34, strArray33);
        java.util.Locale.FilteringMode filteringMode36 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList37 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList29, (java.util.Collection<java.lang.String>) strList34, filteringMode36);
        java.util.Locale.FilteringMode filteringMode38 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList39 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList26, (java.util.Collection<java.lang.String>) strList34, filteringMode38);
        java.util.Locale.LanguageRange[] languageRangeArray40 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList41 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList41, languageRangeArray40);
        java.lang.String[] strArray45 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList46 = new java.util.ArrayList<java.lang.String>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList46, strArray45);
        java.util.Locale.FilteringMode filteringMode48 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList49 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList41, (java.util.Collection<java.lang.String>) strList46, filteringMode48);
        java.util.List<java.lang.String> strList50 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList11, (java.util.Collection<java.lang.String>) strList39, filteringMode48);
        java.lang.String str52 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strList50, '4');
        java.lang.String str54 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strList50, "Fgence");
        java.lang.String str56 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strList50, "cinese (cina)\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hh");
        boolean boolean57 = languageRange1.equals((java.lang.Object) "cinese (cina)\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "e" + "'", str2, "e");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "e" + "'", str5, "e");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "e" + "'", str7, "e");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
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
        org.junit.Assert.assertNotNull(languageRangeArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(languageRangeArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + filteringMode36 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode36.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList37);
        org.junit.Assert.assertTrue("'" + filteringMode38 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode38.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList39);
        org.junit.Assert.assertNotNull(languageRangeArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + filteringMode48 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode48.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList49);
        org.junit.Assert.assertNotNull(strList50);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test15111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15111");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "Chinese", (java.lang.CharSequence) "AD5AE5AF5AG5AI5AL5AM5AN5AO5AQ5AR5AS5AT5AU5AW5AX5AZ5BA5BB5BD5BE5BF5BG5BH5BI5BJ5BL5BM5BN5BO5BQ5BR5BS5BT5BV5BW5BY5BZ5CA5CC5CD5CF5CG5CH5CI5CK5CL5CM5CN5CO5CR5CU5CV5CW5CX5CY5CZ5DE5DJ5DK5DM5DO5DZ5EC5EE5EG5EH5ER5ES5ET5FI5FJ5FK5FM5FO5FR5GA5GB5GD5GE5GF5GG5GH5GI5GL5GM5GN5GP5GQ5GR5GS5GT5GU5GW5GY5HK5HM5HN5HR5HT5HU5ID5IE5IL5IM5IN5IO5IQ5IR5IS5IT5JE5JM5JO5JP5KE5KG5KH5KI5KM5KN5KP5KR5KW5KY5KZ5LA5LB5LC5LI5LK5LR5LS5LT5LU5LV5LY5MA5MC5MD5ME5MF5MG5MH5MK5ML5MM5MN5MO5MP5MQ5MR5MS5MT5MU5MV5MW5MX5MY5MZ5NA5NC5NE5NF5NG5NI5NL5NO5NP5NR5NU5NZ5OM5PA5PE5PF5PG5PH5PK5PL5PM5PN5PR5PS5PT5PW5PY5QA5RE5RO5RS5RU5RW5SA5SB5SC5SD5SE5SG5SH5SI5SJ5SK5SL5SM5SN5SO5SR5SS5ST5SV5SX5SY5SZ5TC5TD5TF5TG5TH5TJ5TK5TL5TM5TN5TO5TR5TT5TV5TW5TZ5UA5UG5UM5US5UY5UZ5VA5VC5VE5VG5VI5VN5VU5WF5WS5YE5YT5ZA5ZM5ZW");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test15112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15112");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Locale locale1 = java.util.Locale.ITALIAN;
        java.lang.String str3 = locale1.getExtension('h');
        java.lang.String str4 = locale0.getDisplayScript(locale1);
        java.util.Locale locale5 = locale0.stripExtensions();
        java.lang.String str7 = locale5.getExtension('R');
        java.lang.String str8 = locale5.getDisplayName();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "fr_FR");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "fran\347ais (France)" + "'", str8, "fran\347ais (France)");
    }

    @Test
    public void test15113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15113");
        char[] charArray8 = new char[] { ' ', '4' };
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!", charArray8);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "u", charArray8);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny("Chinese (China", charArray8);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny("H!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I", charArray8);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "inglese (Canada)", charArray8);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny("Italienisch", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test15114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15114");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("\\u0063", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=\\u0063");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test15115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15115");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("zhzhzhzhzhzhzhzhzhzhfraadzhaezhafzhagzhaizhalzhamzhanzhaozhaqzharzhaszhazhzhzhzhzhzhzhzhzhz2222222222222222222222222222222222222222222222222222222222222222222222222");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=zhzhzhzhzhzhzhzhzhzhfraadzhaezhafzhagzhaizhalzhamzhanzhaozhaqzharzhaszhazhzhzhzhzhzhzhzhzhz2222222222222222222222222222222222222222222222222222222222222222222222222");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test15116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15116");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("\\xtalxan_ITALIAN_Englxsh", "...EnglishEnYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYY");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test15117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15117");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) 'B', 'x');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'B' + "'", char2 == 'B');
    }

    @Test
    public void test15118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15118");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("...! \\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\                      ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...! \\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\" + "'", str1, "...! \\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\");
    }

    @Test
    public void test15119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15119");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("", "EEEEEEEEEFRAEEEEEEEEE", "italian (italian,engl");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test15120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15120");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("...!       \\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test15121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15121");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "                                                                                               en");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test15122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15122");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("ECANADAgCANADACANADAsh                                                                                                   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ecanadaGcanadacanadaSH                                                                                                   " + "'", str1, "ecanadaGcanadacanadaSH                                                                                                   ");
    }

    @Test
    public void test15123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15123");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("32AhzSAhzRAhzQAhzOAhzNAhzMAhzLAhzIAhzGAhzFAhzEAhzDAARF             AhzSAhzRAhzQAhzOAhzNAhzMAhzLAhzIAhzGAhzFAhzEAhzDAARF             AhzSAhzRAhzQAhzOAhzNAhzMAhzLAhzIAhzGAhzFAhzEAhzDAARF             AhzSAhzRAhzQAhzOAhzNAhzMAhzLAhzIAhzGAhzFAhzEAhzDAARF");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "32AhzSAhzRAhzQAhzOAhzNAhzMAhzLAhzIAhzGAhzFAhzEAhzDAARF             AhzSAhzRAhzQAhzOAhzNAhzMAhzLAhzIAhzGAhzFAhzEAhzDAARF             AhzSAhzRAhzQAhzOAhzNAhzMAhzLAhzIAhzGAhzFAhzEAhzDAARF             AhzSAhzRAhzQAhzOAhzNAhzMAhzLAhzIAhzGAhzFAhzEAhzDAARF" + "'", str1, "32AhzSAhzRAhzQAhzOAhzNAhzMAhzLAhzIAhzGAhzFAhzEAhzDAARF             AhzSAhzRAhzQAhzOAhzNAhzMAhzLAhzIAhzGAhzFAhzEAhzDAARF             AhzSAhzRAhzQAhzOAhzNAhzMAhzLAhzIAhzGAhzFAhzEAhzDAARF             AhzSAhzRAhzQAhzOAhzNAhzMAhzLAhzIAhzGAhzFAhzEAhzDAARF");
    }

    @Test
    public void test15124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15124");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("ilatinailatinailatinailati0200u\\", (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test15125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15125");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("FRENCH", 27);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "FRENCH                     " + "'", str2, "FRENCH                     ");
    }

    @Test
    public void test15126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15126");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz\\XTALXAN_ITALIAN_ENGLXSHzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz\\XTALXAN_ITALIAN_ENGLXSHzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz" + "'", str1, "Zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz\\XTALXAN_ITALIAN_ENGLXSHzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
    }

    @Test
    public void test15127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15127");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("\\U0020IiTALIAN\\U0020I");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\U0020IiTALIAN\\U0020I" + "'", str1, "\\U0020IiTALIAN\\U0020I");
    }

    @Test
    public void test15128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15128");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "\\u0046");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u0046" + "'", str1, "\\u0046");
    }

    @Test
    public void test15129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15129");
        java.util.Locale locale3 = new java.util.Locale("...ENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENG_                                                                    \\u00...", "!!!!!!!!!!!!!!!!!!!!!!    zh_cn    !!!!!!!!!!!!!!!!!!!!!!", "ADaAEaAFaAGaAIaALaAMaANaAOaAQaARaASaATaAUaAWaAXaAZaBAaBBaBDaBEaBFaBGaBHaBIaBJaBLaBMaBNaBOaBQaBRaBSaBTaBVaBWaBYaBZaCAaCCaCDaCFaCGaCHaCIaCKaCLaCMaCNaCOaCRaCUaCVaCWaCXaCYaCZaDEaDJaDKaDMaDOaDZaECaEEaEGaEHaERaESaETaFIaFJaFKaFMaFOaFRaGAaGBaGDaGEaGFaGGaGHaGIaGLaGMaGNaGPaGQaGRaGSaGTaGUaGWaGYaHKaHMaHNaHRaHTaHUaIDaIEaILaIMaINaIOaIQaIRaISaITaJEaJMaJOaJPaKEaKGaKHaKIaKMaKNaKPaKRaKWaKYaKZaLAaLBaLCaLIaLKaLRaLSaLTaLUaLVaLYaMAaMCaMDaMEaMFaMGaMHaMKaMLaMMaMNaMOaMPaMQaMRaMSaMTaMUaMVaMWaMXaMYaMZaNAaNCaNEaNFaNGaNIaNLaNOaNPaNRaNUaNZaOMaPAaPEaPFaPGaPHaPKaPLaPMaPNaPRaPSaPTaPWaPYaQAaREaROaRSaRUaRWaSAaSBaSCaSDaSEaSGaSHaSIaSJaSKaSLaSMaSNaSOaSRaSSaSTaSVaSXaSYaSZaTCaTDaTFaTGaTHaTJaTKaTLaTMaTNaTOaTRaTTaTVaTWaTZaUAaUGaUMaUSaUYaUZaVAaVCaVEaVGaVIaVNaVUaWFaWSaYEaYTaZAaZMaZW");
    }

    @Test
    public void test15130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15130");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("Undetermined", "\\u00de\\u00\\u\\u00de\\u00\\u");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Undetermined" + "'", str2, "Undetermined");
    }

    @Test
    public void test15131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15131");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("                                                               \\u002", "!!!!!!!!!!!!!!!!!!!!!!    zh_cn    !!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test15132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15132");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("Und-iTALIAN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Und-iTALIAN" + "'", str1, "Und-iTALIAN");
    }

    @Test
    public void test15133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15133");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("jpn", "ZHO");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test15134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15134");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("                                       k");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test15135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15135");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("okokok", 262);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                okokok                                                                                                                                " + "'", str2, "                                                                                                                                okokok                                                                                                                                ");
    }

    @Test
    public void test15136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15136");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("E", "\\u0069hhhhhhhhhh", (int) (byte) 100);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "E" + "'", str4, "E");
    }

    @Test
    public void test15137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15137");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("it_I", "italian (italian,englcor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test15138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15138");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("b", "fran\347");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "b" + "'", str2, "b");
    }

    @Test
    public void test15139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15139");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("YBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHER", 34);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test15140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15140");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hi!");
        java.lang.String str2 = locale1.getCountry();
        java.lang.String str3 = locale1.getDisplayVariant();
        java.util.Locale locale4 = locale1.stripExtensions();
        java.lang.String str5 = locale4.getISO3Country();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test15141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15141");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("0!TALIAN!TALIAN!TALIAN!TALzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0!TALIAN!TALIAN!TALIAN!TALzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz" + "'", str1, "0!TALIAN!TALIAN!TALIAN!TALzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
    }

    @Test
    public void test15142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15142");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "en-GBDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHD");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test15143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15143");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "...\r\r\r\r\r\r\r\r...");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 14 + "'", int1 == 14);
    }

    @Test
    public void test15144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15144");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("English", "Italian");
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!", "", (int) (short) 10);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("", strArray4, strArray8);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray8, ' ', (int) (short) 0, (int) (byte) -1);
        java.lang.String[] strArray17 = org.apache.commons.lang3.StringUtils.split("Frnz\366sisch(Knd)", "iTALIAN", 35);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!", strArray8, strArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strArray17);
    }

    @Test
    public void test15145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15145");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("it", 'a');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, 'e');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "R0                                               nailati                                                ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "it" + "'", str4, "it");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "it" + "'", str6, "it");
    }

    @Test
    public void test15146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15146");
        java.util.Locale locale0 = java.util.Locale.PRC;
        java.lang.String str1 = locale0.getDisplayVariant();
        java.util.Locale locale2 = java.util.Locale.FRENCH;
        java.util.Locale locale3 = java.util.Locale.ENGLISH;
        java.lang.String str4 = locale3.getDisplayCountry();
        java.lang.String str5 = locale2.getDisplayVariant(locale3);
        java.lang.String str6 = locale0.getDisplayScript(locale3);
        java.util.Locale.Category category7 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale9 = new java.util.Locale("\\u005c");
        java.util.Locale locale11 = java.util.Locale.CHINESE;
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.lowerCase("Franz\366sisch (Frankreich)", locale11);
        java.lang.String str13 = locale11.getVariant();
        java.lang.String str14 = locale9.getDisplayScript(locale11);
        java.util.Locale.setDefault(locale9);
        java.util.Locale.setDefault(category7, locale9);
        java.util.Locale locale18 = java.util.Locale.FRANCE;
        java.util.Locale locale19 = java.util.Locale.ITALIAN;
        java.lang.String str21 = locale19.getExtension('h');
        java.lang.String str22 = locale18.getDisplayScript(locale19);
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.lowerCase("HI!       ", locale18);
        java.lang.String str25 = locale18.getExtension('z');
        java.util.Locale.setDefault(category7, locale18);
        boolean boolean27 = locale0.equals((java.lang.Object) locale18);
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
        org.junit.Assert.assertTrue("'" + category7 + "' != '" + java.util.Locale.Category.FORMAT + "'", category7.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertEquals(locale9.toString(), "\\u005c");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "franz\366sisch (frankreich)" + "'", str12, "franz\366sisch (frankreich)");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "it");
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!       " + "'", str23, "hi!       ");
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test15147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15147");
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
        java.lang.String[] strArray42 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList43 = new java.util.ArrayList<java.lang.String>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList43, strArray42);
        java.util.List<java.lang.String> strList45 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList32, (java.util.Collection<java.lang.String>) strList43);
        java.util.Locale.LanguageRange[] languageRangeArray46 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList47 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList47, languageRangeArray46);
        java.lang.String[] strArray51 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList52 = new java.util.ArrayList<java.lang.String>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList52, strArray51);
        java.util.Locale.FilteringMode filteringMode54 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList55 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList47, (java.util.Collection<java.lang.String>) strList52, filteringMode54);
        java.lang.String[] strArray57 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList58 = new java.util.ArrayList<java.lang.String>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList58, strArray57);
        java.util.List<java.lang.String> strList60 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList47, (java.util.Collection<java.lang.String>) strList58);
        java.util.List<java.lang.String> strList61 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList32, (java.util.Collection<java.lang.String>) strList58);
        java.util.Locale.FilteringMode filteringMode62 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList63 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList61, filteringMode62);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap64 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList65 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap64);
        java.util.Locale locale66 = java.util.Locale.US;
        java.lang.String str67 = locale66.getScript();
        java.util.Set<java.lang.String> strSet68 = locale66.getUnicodeLocaleAttributes();
        java.lang.String str70 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet68, 'A');
        java.lang.String str72 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet68, "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rFRANZ\326SISCH\n(FRANKREICH)\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r");
        java.lang.String str73 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet68);
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
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(strList45);
        org.junit.Assert.assertNotNull(languageRangeArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + filteringMode54 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode54.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList55);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(strList60);
        org.junit.Assert.assertNotNull(strList61);
        org.junit.Assert.assertTrue("'" + filteringMode62 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode62.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList63);
        org.junit.Assert.assertNotNull(languageRangeList65);
        org.junit.Assert.assertNotNull(locale66);
        org.junit.Assert.assertEquals(locale66.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertNotNull(strSet68);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertNull(str73);
    }

    @Test
    public void test15148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15148");
        java.util.Locale locale1 = java.util.Locale.ITALIAN;
        java.lang.String str2 = locale1.getDisplayLanguage();
        java.util.Locale locale3 = locale1.stripExtensions();
        java.util.Locale locale5 = java.util.Locale.forLanguageTag("\\u0020");
        java.lang.String str6 = locale5.getDisplayScript();
        java.lang.String str7 = locale3.getDisplayCountry(locale5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.lowerCase("\ud504\ub791\uc2a4\uc5b4", locale3);
        java.lang.String str9 = locale3.toLanguageTag();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = locale3.getUnicodeLocaleType("FRANZOSI         ITALIAN_italian_eNGLISHFRANZOSI");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: FRANZOSI         ITALIAN_italian_eNGLISHFRANZOSI");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Italian" + "'", str2, "Italian");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "it");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\ud504\ub791\uc2a4\uc5b4" + "'", str8, "\ud504\ub791\uc2a4\uc5b4");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "it" + "'", str9, "it");
    }

    @Test
    public void test15149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15149");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("United State                                                                                     ", 'u');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test15150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15150");
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
        java.lang.String str13 = locale10.getDisplayName();
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "English" + "'", str13, "English");
    }

    @Test
    public void test15151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15151");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("\\u0020hi!       _\\U0020_Italienisch################anihc");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test15152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15152");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("italian_ITALIAN_English", "Franzosisch (Kanada)", (int) (short) 0);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concatWith("                                                                                                                                                                                                     englisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)", (java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "italian_ITALIAN_English" + "'", str5, "italian_ITALIAN_English");
    }

    @Test
    public void test15153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15153");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("Hhhhhhhhh", "HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhhhhhhh" + "'", str2, "Hhhhhhhhh");
    }

    @Test
    public void test15154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15154");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("a", "8600u\\U\\u0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test15155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15155");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("ZH_NGGGGG", "\\u0030");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ZH_NGGGGG" + "'", str2, "ZH_NGGGGG");
    }

    @Test
    public void test15156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15156");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rHI!\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r", "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCcinese (cina)u0069h..CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC", "ECANADAgCANADACANADAsh");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rHI!\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r" + "'", str3, "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rHI!\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r");
    }

    @Test
    public void test15157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15157");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444en");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test15158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15158");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("FFFF");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test15159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15159");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "zhzhzhzhzhzhzhzhzhzhE             ", (java.lang.CharSequence) "ITA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test15160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15160");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "                                                           X                                                            ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test15161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15161");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("it_I", "BFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEKoreanADA");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test15162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15162");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("hi!       dItalienischditalian_ITALIAN_EnglishdHI!dhi!dADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...d\\u0034dHI!dItaliand\\u0061d\\u0023dhi!diTALIANdChinese (China)dhi!dzh_CNdiTALIANdendItalienisch", "ITALIAN4");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!       dItalienischditalian_ITALIAN_EnglishdHI!dhi!dADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...d\\u0034dHI!dItaliand\\u0061d\\u0023dhi!diTALIANdChinese (China)dhi!dzh_CNdiTALIANdendItalienisch" + "'", str2, "hi!       dItalienischditalian_ITALIAN_EnglishdHI!dhi!dADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...d\\u0034dHI!dItaliand\\u0061d\\u0023dhi!diTALIANdChinese (China)dhi!dzh_CNdiTALIANdendItalienisch");
    }

    @Test
    public void test15163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15163");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("neilatI    E", 16, '\r');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\rneilatI    E\r\r" + "'", str3, "\r\rneilatI    E\r\r");
    }

    @Test
    public void test15164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15164");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("         ITALIAN_italian_eNGLISH         ITALIAN_!IHitTAiT_ITALIAN_EgAish");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ITALIAN_italian_eNGLISH         ITALIAN_!IHitTAiT_ITALIAN_EgAish" + "'", str1, "ITALIAN_italian_eNGLISH         ITALIAN_!IHitTAiT_ITALIAN_EgAish");
    }

    @Test
    public void test15165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15165");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("Frnz\366sisch(Knd)", (int) '\n', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test15166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15166");
        java.util.Locale locale0 = java.util.Locale.ENGLISH;
        java.lang.String str1 = locale0.getDisplayLanguage();
        java.lang.Class<?> wildcardClass2 = locale0.getClass();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "English" + "'", str1, "English");
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test15167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15167");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkDEkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk", (java.lang.CharSequence) "\\U000ITALIANITALIANITALIANITALI\\U000ITALIANITALIANITALIANITALHcsineilatI");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkDEkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk" + "'", charSequence2, "kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkDEkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk");
    }

    @Test
    public void test15168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15168");
        java.util.Locale locale0 = java.util.Locale.CANADA;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByCharacterType("I");
        boolean boolean4 = locale1.equals((java.lang.Object) "I");
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_CA");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test15169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15169");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("cinese (cina)\\u0069h..", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=cinese(cina)\\u0069h..");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test15170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15170");
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
            java.util.Locale.Builder builder11 = builder9.setLanguage("hcsineilati");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: hcsineilati [at index 0]");
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
    public void test15171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15171");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("4300U\\                                             DUTSCH                                            ", (int) '\ud504', (int) 'N');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test15172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15172");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("\\u0059", 73, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                 \\u0059                                  " + "'", str3, "                                 \\u0059                                  ");
    }

    @Test
    public void test15173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15173");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("\\u0044");
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\\' + "'", char1 == '\\');
    }

    @Test
    public void test15174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15174");
        java.util.Locale locale1 = java.util.Locale.FRANCE;
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale1.getDisplayScript(locale2);
        java.util.Locale locale4 = java.util.Locale.FRANCE;
        java.util.Locale locale5 = java.util.Locale.ITALIAN;
        java.lang.String str7 = locale5.getExtension('h');
        java.lang.String str8 = locale4.getDisplayScript(locale5);
        java.lang.String str9 = locale4.getISO3Country();
        java.lang.String str10 = locale2.getDisplayVariant(locale4);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.upperCase("\\u0020iTALIANiTALIANiTALIANiTALI", locale2);
        java.lang.String str12 = locale2.getISO3Country();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "it");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "FRA" + "'", str9, "FRA");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\\U0020ITALIANITALIANITALIANITALI" + "'", str11, "\\U0020ITALIANITALIANITALIANITALI");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "CAN" + "'", str12, "CAN");
    }

    @Test
    public void test15175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15175");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("FR_CA                             ...!       \\U0034\\U0034\\U0034\\U0034\\U0034\\U0034\\U0034\\U0034\\U0034\\     ", 'D');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test15176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15176");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("francese");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "francese" + "'", str1, "francese");
    }

    @Test
    public void test15177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15177");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("Deutsch");
        java.util.Locale locale2 = java.util.Locale.ITALY;
        java.lang.String str3 = locale2.getScript();
        java.lang.String str4 = locale2.getDisplayCountry();
        boolean boolean5 = locale2.hasExtensions();
        java.util.Locale.setDefault(locale2);
        boolean boolean7 = locale2.hasExtensions();
        java.lang.String str8 = locale2.getISO3Country();
        java.util.Locale locale9 = java.util.Locale.FRANCE;
        java.util.Locale locale10 = java.util.Locale.ITALIAN;
        java.lang.String str12 = locale10.getExtension('h');
        java.lang.String str13 = locale9.getDisplayScript(locale10);
        boolean boolean14 = locale9.hasExtensions();
        java.lang.String str15 = locale9.getVariant();
        java.util.Set<java.lang.String> strSet16 = locale9.getUnicodeLocaleKeys();
        java.lang.String str17 = locale2.getDisplayLanguage(locale9);
        java.lang.String str18 = locale1.getDisplayCountry(locale9);
        java.lang.String str19 = locale9.getDisplayName();
        java.lang.String str20 = locale9.getDisplayCountry();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "deutsch");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Italy" + "'", str4, "Italy");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ITA" + "'", str8, "ITA");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "it");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "italien" + "'", str17, "italien");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "francese (Francia)" + "'", str19, "francese (Francia)");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Francia" + "'", str20, "Francia");
    }

    @Test
    public void test15178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15178");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("EagaashUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "eAGAASHuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str1, "eAGAASHuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test15179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15179");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("\u30d5\u30e9\u30f3\u30b9\u8a9e\u30ab\u30ca\u30c0)", (int) 'd', (int) 'e');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test15180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15180");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("Korean (South Korea)", 97);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Korean (South Korea)" + "'", str2, "Korean (South Korea)");
    }

    @Test
    public void test15181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15181");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("tedesco    ", "x", (int) (byte) 10);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.startsWithAny("ANGLAIS (ROYAUME-UNI)", strArray5);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.endsWithAny("        \\u005c         canadacanadacanadacan", strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test15182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15182");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("E");
        java.lang.String str2 = languageRange1.getRange();
        double double3 = languageRange1.getWeight();
        java.lang.String str4 = languageRange1.getRange();
        java.lang.String str5 = languageRange1.getRange();
        double double6 = languageRange1.getWeight();
        double double7 = languageRange1.getWeight();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "e" + "'", str2, "e");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "e" + "'", str4, "e");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "e" + "'", str5, "e");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test15183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15183");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC", 9);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC" + "'", str2, "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
    }

    @Test
    public void test15184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15184");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("\\u0035", "anihC");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test15185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15185");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("Franz\366sisch (Frankreich)", "\\u0065");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("it_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_I", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Franz\366sisch (Frankreich)" + "'", str4, "Franz\366sisch (Frankreich)");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test15186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15186");
        char[] charArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rfr-CA\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test15187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15187");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("                          ...", "                                                  IT44444444444444444EN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                          ..." + "'", str2, "                          ...");
    }

    @Test
    public void test15188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15188");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("\\U0034\\U0034\\U0034\\U0034\\U0034\\U0034\\U0034\\U0034\\U0034\\HI!       \\U0034\\U0034\\U0034\\U0034\\U0034\\U0034\\U0034\\U0034\\U0034\\", "hi!_\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test15189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15189");
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
        java.lang.String str23 = locale21.getCountry();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
// flaky:         org.junit.Assert.assertEquals(locale1.toString(), "fr_FR");
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "CA" + "'", str23, "CA");
    }

    @Test
    public void test15190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15190");
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
        java.util.Locale locale52 = java.util.Locale.PRC;
        java.lang.String str53 = locale52.getDisplayVariant();
        java.util.Locale locale54 = java.util.Locale.FRENCH;
        java.util.Locale locale55 = java.util.Locale.ENGLISH;
        java.lang.String str56 = locale55.getDisplayCountry();
        java.lang.String str57 = locale54.getDisplayVariant(locale55);
        java.lang.String str58 = locale52.getDisplayScript(locale55);
        java.util.Set<java.lang.String> strSet59 = locale52.getUnicodeLocaleAttributes();
        java.lang.String str60 = java.util.Locale.lookupTag(languageRangeList51, (java.util.Collection<java.lang.String>) strSet59);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap61 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList62 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList51, strMap61);
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
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "fr");
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "en");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertNotNull(strSet59);
        org.junit.Assert.assertNull(str60);
        org.junit.Assert.assertNotNull(languageRangeList62);
    }

    @Test
    public void test15191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15191");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\U0046", "             DE_DE            uuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test15192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15192");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("cinese (cina)\\u0069h..", "    \\    ", "))))))))))))))))))))))))))))))))))))))))))))))))))))", 52);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "cinese (cina)\\u0069h.." + "'", str4, "cinese (cina)\\u0069h..");
    }

    @Test
    public void test15193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15193");
        char[] charArray11 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray11);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "iTALIAN", charArray11);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "allemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemand", charArray11);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                                                                           U0020ITALIANITALIANITALIANITALI", charArray11);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                   deutsch                    ", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4##a a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4##a a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4, #, #, a,  , a]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test15194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15194");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "444444444it", (java.lang.CharSequence) "French (France)");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "444444444it" + "'", charSequence2, "444444444it");
    }

    @Test
    public void test15195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15195");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("\uc601\uc5b4");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\uc601\uc5b4" + "'", str1, "\uc601\uc5b4");
    }

    @Test
    public void test15196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15196");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("HI!(\\U0020,ITALIENISCH#########################################################################################)", "hi!        (\\U0020,Italienisch#####Franzosisch (Kanada)##############################################################################", 111);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!(\\U0020,ITALIENISCH#########################################################################################)" + "'", str3, "HI!(\\U0020,ITALIENISCH#########################################################################################)");
    }

    @Test
    public void test15197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15197");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("cinese (cina)\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "cinese (cina)\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hh" + "'", str1, "cinese (cina)\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hh");
    }

    @Test
    public void test15198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15198");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("Royaume-Uni", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test15199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15199");
        char[] charArray10 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray10);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "fr", charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny("\ud504\ub791\uc2a4\uc5b4\uce90\ub098\ub2e4)_ENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENG_                                                                    \\u0020iTALIANiTALIANiTALIANiTALI", charArray10);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "...fdedzcycxcwcvcucrcocncmclckcichcgcfcdcccaczbybwbvbtbsbrbqbobnbmblbjbibhbgbfbebdbbbabzaxawauatasaraqaoanamalaiagafaeada", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4##a a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4##a a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, #, #, a,  , a]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test15200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15200");
        java.util.Locale locale3 = new java.util.Locale("HI!       ", "\\U0020", "Italienisch#########################################################################################");
        java.util.Locale locale4 = locale3.stripExtensions();
        java.util.Locale locale5 = locale4.stripExtensions();
        java.lang.String str6 = locale5.getVariant();
        java.lang.String str7 = locale5.toLanguageTag();
        java.lang.String str8 = locale5.getDisplayVariant();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = locale5.getUnicodeLocaleType("1");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Italienisch#########################################################################################" + "'", str6, "Italienisch#########################################################################################");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "und" + "'", str7, "und");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Italienisch#########################################################################################" + "'", str8, "Italienisch#########################################################################################");
    }

    @Test
    public void test15201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15201");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("ian\\u0020i", "ixii", 45);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test15202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15202");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("aaaaaaaaaaaaaaaaaaaaaaaaFranzosisch(Frankreich)aaaaaaaaaaaaaaaaaaaaaaaa", (int) '9', (int) 'U');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaa");
    }

    @Test
    public void test15203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15203");
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
        java.util.Locale locale38 = java.util.Locale.FRANCE;
        java.util.Locale locale39 = java.util.Locale.ITALIAN;
        java.lang.String str41 = locale39.getExtension('h');
        java.lang.String str42 = locale38.getDisplayScript(locale39);
        java.util.Locale locale46 = new java.util.Locale("HI!       ", "\\U0020", "Italienisch#########################################################################################");
        java.lang.String str47 = locale38.getDisplayCountry(locale46);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder48 = builder8.setLocale(locale46);
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: hi!        [at index 0]");
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
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Italian" + "'", str15, "Italian");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Italian" + "'", str16, "Italian");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Italian" + "'", str17, "Italian");
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
// flaky:         org.junit.Assert.assertEquals("'" + str34 + "' != '" + "French" + "'", str34, "French");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "anglais (Canada)" + "'", str35, "anglais (Canada)");
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "it");
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals(locale46.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "France" + "'", str47, "France");
    }

    @Test
    public void test15204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15204");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("EN_ca...fdedzcycxcwcvcucrcocncmclckcichcgcfcdcccaczbybwbvbtbsbrbqbobnbmblbjbibhbgbfbebdbbbabzaxawauatasaraqaoanamalaiagafaeada", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EN_ca....." + "'", str2, "EN_ca.....");
    }

    @Test
    public void test15205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15205");
        java.util.Locale locale1 = new java.util.Locale("a700u\\");
        org.junit.Assert.assertEquals(locale1.toString(), "a700u\\");
    }

    @Test
    public void test15206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15206");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("         ITALIAN_ITALIAN_ENGLISH         ITALIAN_!IHITTAIT_ITALIAN_EGAISHE             G                          SHE             G                          SHE             G                          SHE             G                          SHE             G                          SHE             G                          SHE             G                          SHE             G                 ", "32AhzSAhzRAhzQAhzOAhzNAhzMAhzLAhzIAhzGAhzFAhzEAhzDAARF             AhzSAhzRAhzQAhzOAhzNAhzMAhzLAhzIAhzGAhzFAhzEAhzDAARF             AhzSAhzRAhzQAhzOAhzNAhzMAhzLAhzIAhzGAhzFAhzEAhzDAARF             AhzSAhzRAhzQAhzOAhzNAhzMAhzLAhzIAhzGAhzFAhzEAhzDAARF");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test15207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15207");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("Italian");
        java.util.Locale locale4 = builder3.build();
        java.util.Locale.Builder builder7 = builder3.setExtension('E', "DEUTSCH");
        java.util.Locale locale8 = builder3.build();
        java.util.Locale.Builder builder9 = builder3.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder3.setExtension('\r', "Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key: ? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "italian");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "italian__#e-deutsch");
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test15208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15208");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "                                                                                           U0020");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test15209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15209");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("E             G                                                                                     ", "   h", "fffffffffffff                                                                        ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "E             G                                                                                     " + "'", str3, "E             G                                                                                     ");
    }

    @Test
    public void test15210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15210");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("                                 \\u0059                                  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u0059" + "'", str1, "\\u0059");
    }

    @Test
    public void test15211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15211");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "JP", (java.lang.CharSequence) "Frnz\366sisch(Knd");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 14 + "'", int2 == 14);
    }

    @Test
    public void test15212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15212");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAscii('g');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test15213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15213");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale locale3 = java.util.Locale.KOREA;
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleAttributes();
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet4, "\\u0020iTALIANiTALIANiTALIANiTALI");
        java.lang.String str7 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet4);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap8 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList9 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap8);
        java.util.Collection<java.lang.String> strCollection10 = null;
        java.lang.String str11 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strCollection10);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(languageRangeList9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test15214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15214");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("d", "ko", (int) 'U');
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test15215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15215");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("ZHO", "Chinese", 5);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concatWith("", (java.lang.Object[]) strArray4);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, 'U', (int) (byte) 10, 6);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, "\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069!IH\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\CCglisch");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ZHO" + "'", str5, "ZHO");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ZHO" + "'", str12, "ZHO");
    }

    @Test
    public void test15216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15216");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.lang.String str1 = locale0.getDisplayLanguage();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.toLanguageTag();
        java.lang.String str4 = locale0.getDisplayName(locale2);
        java.lang.String str5 = locale2.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "italien" + "'", str1, "italien");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "fr-CA" + "'", str3, "fr-CA");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "italien" + "'", str4, "italien");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "fr_CA" + "'", str5, "fr_CA");
    }

    @Test
    public void test15217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15217");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("\\u0061", 'a', 'G');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\u0061" + "'", str3, "\\u0061");
    }

    @Test
    public void test15218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15218");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "Iinglese", (java.lang.CharSequence) "f (KOREAN)");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "Iinglese" + "'", charSequence2, "Iinglese");
    }

    @Test
    public void test15219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15219");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left(" Italia  Italia  Italia  Italia  Italia  Italia  Italia DEUTSCH Italia  Italia  Italia  Italia  Italia  Italia  Italia  ", 8);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " Italia " + "'", str2, " Italia ");
    }

    @Test
    public void test15220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15220");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("iiiiiiiiii");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "iiiiiiiiii" + "'", str1, "iiiiiiiiii");
    }

    @Test
    public void test15221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15221");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("adaeafagaialamanaoaqarasatauawaxazbabbbdbebfbgbhbibjblbmbnbobqbrbsbtbvbwbybzcacccdcfcgchcickclcmcncocrcucvcwcxcyczded...", 10, (int) 'k');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...alamanaoaqarasatauawaxazbabbbdbebfbgbhbibjblbmbnbobqbrbsbtbvbwbybzcacccdcfcgchcickclcmcncocrcucvcwcxc..." + "'", str3, "...alamanaoaqarasatauawaxazbabbbdbebfbgbhbibjblbmbnbobqbrbsbtbvbwbybzcacccdcfcgchcickclcmcncocrcucvcwcxc...");
    }

    @Test
    public void test15222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15222");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("          2cinese (Cina)iTALIANiTALIANiTALIANiTAL", "fr-C", (int) '2');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "          2cinese (Cina)iTALIANiTALIANiTALIANiTAL" + "'", str3, "          2cinese (Cina)iTALIANiTALIANiTALIANiTAL");
    }

    @Test
    public void test15223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15223");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("AnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihC", "AD4AE4AF4AG4AI4AL4AM4AN4AO4AQ4AR4AS4AT4AU4AW4AX4AZ4BA4BB4BD4BE4BF4BG4BH4BI4BJ4BL4BM4BN4BO4BQ4BR4BS4BT4BV4BW4BY4BZ4CA4CC4CD4CF4CG4CH4CI4CK4CL4CM4CN4CO4CR4CU4CV4CW4CX4CY4CZ4DE4DJ4DK4DM4DO4DZ4EC4EE4EG4EH4ER4ES4ET4FI4FJ4FK4FM4FO4FR4GA4GB4GD4GE4GF4GG4GH4GI4GL4GM4GN4GP4GQ4GR4GS4GT4GU4GW4GY4HK4HM4HN4HR4HT4HU4ID4IE4IL4IM4IN4IO4IQ4IR4IS4IT4JE4JM4JO4JP4KE4KG4KH4KI4KM4KN4KP4KR4KW4KY4KZ4LA4LB4LC4LI4LK4LR4LS4LT4LU4LV4LY4MA4MC4MD4ME4MF4MG4MH4MK4ML4MM4MN4MO4MP4MQ4MR4MS4MT4MU4MV4MW4MX4MY4MZ4NA4NC4NE4NF4NG4NI4NL4NO4NP4NR4NU4NZ4OM4PA4PE4PF4PG4PH4PK4PL4PM4PN4PR4PS4PT4PW4PY4QA4RE4RO4RS4RU4RW4SA4SB4SC4SD4SE4SG4SH4SI4SJ4SK4SL4SM4SN4SO4SR4SS4ST4SV4SX4SY4SZ4TC4TD4TF4TG4TH4TJ4TK4TL4TM4TN4TO4TR4TT4TV4TW4TZ4UA4UG4UM4US4UY4UZ4VA4VC4VE4VG4VI4VN4VU4WF4WS4YE4YT4ZA4ZM4ZW");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihC" + "'", str2, "AnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihC");
    }

    @Test
    public void test15224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15224");
        java.util.Locale locale2 = new java.util.Locale("    \\    ", "  \\u005   ");
        org.junit.Assert.assertEquals(locale2.toString(), "    \\    _  \\U005   ");
    }

    @Test
    public void test15225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15225");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("                                        itTAiT_ITALIAN_EgAish                                 \\u0068", (int) '2', 264);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "LIAN_EgAish                                 \\u0068" + "'", str3, "LIAN_EgAish                                 \\u0068");
    }

    @Test
    public void test15226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15226");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("             hcsineilatI             dddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hcsineilatI             dddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd" + "'", str1, "hcsineilatI             dddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd");
    }

    @Test
    public void test15227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15227");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                                            fr_FR                  ", 54, (int) 'E');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test15228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15228");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("nglish (united kingdom", "ITITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAIITALIANITITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAI", ")dnK( hcsis\366znrF                              ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nglish (united kingdom" + "'", str3, "nglish (united kingdom");
    }

    @Test
    public void test15229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15229");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("hhhhhhhhhh (                                                                                     G             )", '5', 'N');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhhhhhhhhh (                                                                                     G             )" + "'", str3, "hhhhhhhhhh (                                                                                     G             )");
    }

    @Test
    public void test15230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15230");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("Franz\366sischFranzosisch (Frankreich)kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk", "fran\347ais (Canada)", "  ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Franz\366sischFranzosisch (Frankreich)kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk" + "'", str3, "Franz\366sischFranzosisch (Frankreich)kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk");
    }

    @Test
    public void test15231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15231");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("Franz\366sisch (Kanada", 122);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Franz\366sisch (Kanada" + "'", str2, "Franz\366sisch (Kanada");
    }

    @Test
    public void test15232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15232");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("         HITALIANH_HitalianH_HeHNGLISH", "EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE", "hhhhhhhhH", 27);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "         HITALIANH_HitalianH_HeHNGLISH" + "'", str4, "         HITALIANH_HitalianH_HeHNGLISH");
    }

    @Test
    public void test15233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15233");
        java.util.Locale locale2 = new java.util.Locale("\\u0020iTALIANiTALIANiTALIANiTALI\\u0020iTALIANiTALIANiTALIANiTAL", "allemand");
        java.lang.String str3 = locale2.getDisplayCountry();
        java.lang.String str4 = locale2.getLanguage();
        org.junit.Assert.assertEquals(locale2.toString(), "\\u0020italianitalianitalianitali\\u0020italianitalianitalianital_ALLEMAND");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ALLEMAND" + "'", str3, "ALLEMAND");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\u0020italianitalianitalianitali\\u0020italianitalianitalianital" + "'", str4, "\\u0020italianitalianitalianitali\\u0020italianitalianitalianital");
    }

    @Test
    public void test15234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15234");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("inglese...........................................................................................................................................................................................................................................................................................................................................................................");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...........................................................................................................................................................................................................................................................................................................................................................................eselgni" + "'", str1, "...........................................................................................................................................................................................................................................................................................................................................................................eselgni");
    }

    @Test
    public void test15235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15235");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("", "!ih                            dalleman!ih                            dalleman!ih                          ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test15236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15236");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("                                                                    \\U0020ItalianItalianItalianItali", "Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhz");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                    \\U0020ItalianItalianItalianItali" + "'", str2, "                                                                    \\U0020ItalianItalianItalianItali");
    }

    @Test
    public void test15237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15237");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "i!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test15238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15238");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...", "\\u0020iItalian\\u0020i                                                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED..." + "'", str2, "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...");
    }

    @Test
    public void test15239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15239");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "....................................................................................... (italian,english)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test15240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15240");
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
            java.util.Locale.Builder builder20 = builder18.setRegion("                                               8300u\\                                                ");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region:                                                8300u\\                                                 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "francese (Canada)" + "'", str3, "francese (Canada)");
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
    public void test15241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15241");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhz", 374);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhz" + "'", str2, "ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhz");
    }

    @Test
    public void test15242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15242");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("A", ".Korean (South Korea)Korean (So", 309);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test15243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15243");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "2222222222222222222italian_ITALIAN_EnglisFitalian (italian,englis");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test15244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15244");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("ermanglischIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII nglischIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII(nglischIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIermaynglischIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII)nglischIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII                                                 nglischIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIITALIANnglischIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII                                                  ", 'x', 'f');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ermanglischIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII nglischIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII(nglischIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIermaynglischIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII)nglischIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII                                                 nglischIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIITALIANnglischIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII                                                  " + "'", str3, "ermanglischIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII nglischIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII(nglischIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIermaynglischIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII)nglischIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII                                                 nglischIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIITALIANnglischIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII                                                  ");
    }

    @Test
    public void test15245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15245");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("Franz\366sisch (Kanada)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "FRANZ\326SISCH (KANADA)" + "'", str1, "FRANZ\326SISCH (KANADA)");
    }

    @Test
    public void test15246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15246");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder5 = builder1.clear();
        java.util.Locale.Builder builder6 = builder5.clear();
        java.util.Locale.Builder builder8 = builder5.setLanguage("zh");
        java.util.Locale.Builder builder9 = builder8.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder9.removeUnicodeLocaleAttribute("ed");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: ed [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "francese (Canada)" + "'", str3, "francese (Canada)");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test15247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15247");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("Italian");
        boolean boolean3 = org.apache.commons.lang3.StringUtils.startsWithAny("ZH_cnFrench (Canada)", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test15248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15248");
        java.util.Locale locale2 = new java.util.Locale("X", "\\u000a");
        java.lang.String str3 = locale2.toLanguageTag();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = locale2.getUnicodeLocaleType("eng");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: eng");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "x_\\U000A");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "und" + "'", str3, "und");
    }

    @Test
    public void test15249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15249");
        char char1 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) '7');
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '7' + "'", char1 == '7');
    }

    @Test
    public void test15250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15250");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("South Korea", "                                         fr-c                                                          ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test15251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15251");
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
        java.util.Locale.Category category17 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale18 = java.util.Locale.getDefault(category17);
        java.util.Locale locale19 = java.util.Locale.FRANCE;
        java.util.Locale locale20 = java.util.Locale.ITALIAN;
        java.lang.String str22 = locale20.getExtension('h');
        java.lang.String str23 = locale19.getDisplayScript(locale20);
        java.lang.String str24 = locale19.getISO3Country();
        java.util.Locale locale25 = java.util.Locale.GERMAN;
        java.util.Locale.setDefault(locale25);
        java.lang.String str27 = locale19.getDisplayName(locale25);
        java.lang.String str28 = locale19.getScript();
        java.util.Locale.setDefault(category17, locale19);
        java.lang.String str30 = locale2.getDisplayCountry(locale19);
        java.lang.String str31 = locale19.getCountry();
        java.lang.String str32 = org.apache.commons.lang3.StringUtils.upperCase("\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069!ih\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\", locale19);
        java.util.Locale locale33 = locale19.stripExtensions();
        java.util.Locale locale35 = new java.util.Locale("\\u005c");
        java.util.Locale locale37 = java.util.Locale.CHINESE;
        java.lang.String str38 = org.apache.commons.lang3.StringUtils.lowerCase("Franz\366sisch (Frankreich)", locale37);
        java.lang.String str39 = locale37.getVariant();
        java.lang.String str40 = locale35.getDisplayScript(locale37);
        java.lang.String str41 = locale19.getDisplayLanguage(locale37);
        java.lang.String str42 = org.apache.commons.lang3.StringUtils.upperCase("Italia", locale37);
        java.lang.String str43 = locale37.getDisplayName();
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
        org.junit.Assert.assertTrue("'" + category17 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category17.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale18);
// flaky:         org.junit.Assert.assertEquals(locale18.toString(), "it");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "it");
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "FRA" + "'", str24, "FRA");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "de");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Franz\366sisch (Frankreich)" + "'", str27, "Franz\366sisch (Frankreich)");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "FR" + "'", str31, "FR");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069!IH\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\" + "'", str32, "\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069!IH\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "fr_FR");
        org.junit.Assert.assertEquals(locale35.toString(), "\\u005c");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "franz\366sisch (frankreich)" + "'", str38, "franz\366sisch (frankreich)");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "\u6cd5\u6587" + "'", str41, "\u6cd5\u6587");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "ITALIA" + "'", str42, "ITALIA");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "chinois" + "'", str43, "chinois");
    }

    @Test
    public void test15252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15252");
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
        java.util.Locale locale73 = new java.util.Locale("HI!       ", "\\U0020", "Italienisch#########################################################################################");
        java.util.Locale locale74 = locale73.stripExtensions();
        java.util.Locale locale75 = locale74.stripExtensions();
        java.lang.String str76 = locale74.toLanguageTag();
        java.util.Locale locale78 = new java.util.Locale("en");
        boolean boolean79 = locale78.hasExtensions();
        java.util.Set<java.lang.String> strSet80 = locale78.getUnicodeLocaleKeys();
        java.lang.String str81 = locale74.getDisplayName(locale78);
        java.util.Locale locale85 = new java.util.Locale("HI!       ", "\\U0020", "Italienisch#########################################################################################");
        java.util.Locale locale86 = locale85.stripExtensions();
        java.lang.String str87 = locale78.getDisplayName(locale86);
        java.util.Set<java.lang.String> strSet88 = locale86.getUnicodeLocaleKeys();
        java.lang.String str90 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet88, 'A');
        java.lang.String str91 = java.util.Locale.lookupTag(languageRangeList2, (java.util.Collection<java.lang.String>) strSet88);
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
        org.junit.Assert.assertEquals(locale73.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertNotNull(locale74);
        org.junit.Assert.assertEquals(locale74.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertNotNull(locale75);
        org.junit.Assert.assertEquals(locale75.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "und" + "'", str76, "und");
        org.junit.Assert.assertEquals(locale78.toString(), "en");
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(strSet80);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "hi!        (\\U0020,Italienisch#########################################################################################)" + "'", str81, "hi!        (\\U0020,Italienisch#########################################################################################)");
        org.junit.Assert.assertEquals(locale85.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertNotNull(locale86);
        org.junit.Assert.assertEquals(locale86.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "English" + "'", str87, "English");
        org.junit.Assert.assertNotNull(strSet88);
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "" + "'", str90, "");
        org.junit.Assert.assertNull(str91);
    }

    @Test
    public void test15253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15253");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0" + "'", str1, "0");
    }

    @Test
    public void test15254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15254");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("\\u0020italianitalianitalianitali\\u0020italianitalianitalianital");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u0020italianitalianitalianitali\\u0020italianitalianitalianital" + "'", str1, "\\u0020italianitalianitalianitali\\u0020italianitalianitalianital");
    }

    @Test
    public void test15255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15255");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069!IH\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\engli", (java.lang.CharSequence) "#########FranzosischFranzosisch (Frankreich)########TALIAN_italian_eNGLISHITAL");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test15256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15256");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("fra");
        java.lang.String str2 = locale1.getDisplayName();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fra");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "fra" + "'", str2, "fra");
    }

    @Test
    public void test15257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15257");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("Italian");
        java.util.Locale.Builder builder4 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder0.clear();
        java.util.Locale locale7 = java.util.Locale.forLanguageTag("\\u0020");
        java.util.Locale.Builder builder8 = builder0.setLocale(locale7);
        java.util.Locale.Builder builder11 = builder0.setExtension('u', "Italian");
        java.util.Locale.Builder builder13 = builder0.setLanguageTag("ixii");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder16 = builder0.setExtension('\ud504', "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key: ?? [at index 0]");
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
    }

    @Test
    public void test15258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15258");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("hi!allemandItalienischallemanditalian_ITALIAN_EnglishallemandHI!allemandhi!allemandADAEAFAGAIA...", (int) 'R');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ienischallemanditalian_ITALIAN_EnglishallemandHI!allemandhi!allemandADAEAFAGAIA..." + "'", str2, "ienischallemanditalian_ITALIAN_EnglishallemandHI!allemandhi!allemandADAEAFAGAIA...");
    }

    @Test
    public void test15259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15259");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("         italian_italian_english         italian_!ihittait_italian_egaishe             g                          she             g                          she             g                          she             g                          she             g                          she             g                          she             g                          she             g                 ", "fR          2cinese (cina)italianitalianitalianitalH          2cinese (cina)italianitalianitalianitalfR          2cinese (cina)italianitalianitalianital)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test15260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15260");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder5 = builder1.clear();
        java.util.Locale.Builder builder7 = builder1.setLanguage("RA");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder1.setScript("2iT hi!       _\\U0020_Italienisch####################################################################            2iT");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: 2iT hi!       _\\U0020_Italienisch####################################################################            2iT [at index 0]");
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
    }

    @Test
    public void test15261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15261");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("ESENIHC", "", 0);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ESENIHC" + "'", str4, "ESENIHC");
    }

    @Test
    public void test15262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15262");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED..", "\\U006E");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test15263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15263");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("aaaaaaaaaaaaaaaaDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEU\\u0061aaaaaaaaaaaaaaaa", "ITALIAN (ITALIAN,ENGLCOR\311ENCOR\311ENCOR\311ENCOR\311ENCOR\311ENCOR\311ENCOR\311ENCOR\311ENCOR\311ENCOR\311ENCOR\311ENCOR\311ENCOR\311ENCOR\311ENCOR\311ENCOR\311ENCOR");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test15264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15264");
        java.util.Locale locale3 = new java.util.Locale("\\u0023", "Italienisch", "iTALIAN");
        java.lang.String str4 = locale3.getDisplayVariant();
        java.lang.String str5 = locale3.getDisplayCountry();
        java.lang.String str6 = locale3.getCountry();
        java.util.Locale locale7 = locale3.stripExtensions();
        org.junit.Assert.assertEquals(locale3.toString(), "\\u0023_ITALIENISCH_iTALIAN");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "iTALIAN" + "'", str4, "iTALIAN");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ITALIENISCH" + "'", str5, "ITALIENISCH");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ITALIENISCH" + "'", str6, "ITALIENISCH");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "\\u0023_ITALIENISCH_iTALIAN");
    }

    @Test
    public void test15265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15265");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("ITTAIT_ITALIAN_EGAISH                                                                                ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test15266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15266");
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
        java.lang.String str17 = locale14.getDisplayCountry();
        java.lang.String str18 = locale14.getDisplayName();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "italien" + "'", str1, "italien");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "it");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "it" + "'", str3, "it");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ita" + "'", str4, "ita");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "fran\347ais (Canada)" + "'", str9, "fran\347ais (Canada)");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "italian");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HI!" + "'", str15, "HI!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "italian" + "'", str18, "italian");
    }

    @Test
    public void test15267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15267");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("\\u002e", "ANGLAIS (ROYAUME-UNI)FRA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test15268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15268");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("ffffffffffffffffffffffffffffffffFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhACor\351e du Sud", "fran\347");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test15269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15269");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("ranzosisch (Frankreich)kkkkkkkkkkkkkkkkkkk...");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "E             gallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemand");
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.split("HI!");
        boolean boolean9 = org.apache.commons.lang3.StringUtils.endsWithAny("franz\366sisch (frankreich)", strArray8);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray8);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.stripAll(strArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.startsWithAny("))))))))))))))))))))))))))))))))))))))))))))))))))))", strArray10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEach("ZH_cnFrench (Canada)AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\\u0020iItalian\\u0020i                                                 ", strArray4, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 2 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test15270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15270");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                             de_de                                              ", "\\u00de\\u00\\u\\u00de\\u00\\u", "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxCHINESE");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                             xx_xx                                              " + "'", str3, "                                             xx_xx                                              ");
    }

    @Test
    public void test15271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15271");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setLanguage("ENGLISCH");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder3.setScript("nc_HZ                                                                  ");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: nc_HZ                                                                   [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test15272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15272");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "Cinese (Cina)\\u0069h...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test15273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15273");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'g');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character g is not in the range '0' - '9'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test15274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15274");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("ititaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaiitalianititaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitai", 96, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "itaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaita" + "'", str3, "itaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaita");
    }

    @Test
    public void test15275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15275");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("                                                                                                                  8", "2CINESE(CINA...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                  8" + "'", str2, "                                                                                                                  8");
    }

    @Test
    public void test15276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15276");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("Frnz\366sisch(Knd", "anglaisaaaaaaaaaaaaaaaaDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEU\\u0061aaaaaaaaaaaaaaaa(Royaume-Uni)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Frnz\366sisch(Knd" + "'", str2, "Frnz\366sisch(Knd");
    }

    @Test
    public void test15277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15277");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("Eagaash", 21, 'g');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "gggggggEagaashggggggg" + "'", str3, "gggggggEagaashggggggg");
    }

    @Test
    public void test15278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15278");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC", "\ud504\ub791\uc2a4");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC" + "'", str2, "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
    }

    @Test
    public void test15279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15279");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("Chinesisch", "...anitali", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaafranz\366sisch (kanada)_ZH_CN");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test15280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15280");
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
        java.util.Locale locale10 = locale6.stripExtensions();
        java.lang.String str11 = locale10.toLanguageTag();
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "cor\351en (Cor\351e du Sud)" + "'", str9, "cor\351en (Cor\351e du Sud)");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ko-KR" + "'", str11, "ko-KR");
    }

    @Test
    public void test15281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15281");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "tTAT_ITA                                                                                                ", (java.lang.CharSequence) "                                                                                     g             ");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "tTAT_ITA                                                                                                " + "'", charSequence2, "tTAT_ITA                                                                                                ");
    }

    @Test
    public void test15282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15282");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("44444444444444444444444444444444IHaaaaaaaaaaaaaaaaaaaaaaaaFranz\366sisch (Frankreich)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "ran\347ais (France)                                      f                                     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444444IHaaaaaaaaaaaaaaaaaaaaaaaaFranz\366sisch (Frankreich)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "44444444444444444444444444444444IHaaaaaaaaaaaaaaaaaaaaaaaaFranz\366sisch (Frankreich)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test15283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15283");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("AnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihC", "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rfranci");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test15284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15284");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("English (Canada)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "English (Canada)" + "'", str1, "English (Canada)");
    }

    @Test
    public void test15285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15285");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("LHcsineilat");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "LHcsineilat" + "'", str1, "LHcsineilat");
    }

    @Test
    public void test15286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15286");
        char char1 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) 'g');
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + 'g' + "'", char1 == 'g');
    }

    @Test
    public void test15287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15287");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("Francia");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray1);
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Francia" + "'", str2, "Francia");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Francia" + "'", str3, "Francia");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Francia" + "'", str4, "Francia");
    }

    @Test
    public void test15288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15288");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'h', 537);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 537 + "'", int2 == 537);
    }

    @Test
    public void test15289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15289");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("1", 'E');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1" + "'", str2, "1");
    }

    @Test
    public void test15290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15290");
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
        java.util.Locale locale18 = new java.util.Locale("TALIAN", "FRA", "Undetermined");
        java.lang.String str19 = locale18.toLanguageTag();
        java.lang.String str20 = locale18.getDisplayName();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder21 = builder10.setLocale(locale18);
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: FRA [at index 0]");
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
        org.junit.Assert.assertEquals(locale18.toString(), "talian_FRA_Undetermined");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "talian" + "'", str19, "talian");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "talian (FRA,Undetermined)" + "'", str20, "talian (FRA,Undetermined)");
    }

    @Test
    public void test15291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15291");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("\\u00de\\u00", "44444444ITALIAN444444444444444444444444ITALIAN444444444444444444444444ITALIAN444444444444444444444444ITALIAN444444444444444444444444ITALIAN444444444444444444444444ITALIAN444444444444444444444444ITALIAN444444444444444444444444ITALIAN444444444444444444444444ITALIAN4444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test15292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15292");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("de_DE");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "de_de" + "'", str1, "de_de");
    }

    @Test
    public void test15293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15293");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'a', (int) 'z');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 122 + "'", int2 == 122);
    }

    @Test
    public void test15294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15294");
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
        java.util.Locale locale24 = locale8.stripExtensions();
        java.lang.String str25 = locale8.getDisplayScript();
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
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test15295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15295");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder5 = builder4.clear();
        java.util.Locale.Builder builder6 = builder4.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder6.removeUnicodeLocaleAttribute("nnnnnnnnnnnnnnnnnnnnnnnnhi!nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: nnnnnnnnnnnnnnnnnnnnnnnnhi!nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn [at index 0]");
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
    public void test15296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15296");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "nailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailati");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test15297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15297");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("hi!       ");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "E             g                                                                                     ");
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("", strArray5);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.split("ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...");
        int int11 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("ADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhATzhAUzhAWzhAXzhAZzhBAzhBBzhBDzhBEzhBFzhBGzhBHzhBIzhBJzhBLzhBMzhBNzhBOzhBQzhBRzhBSzhBTzhBVzhBWzhBYzhBZzhCAzhCCzhCDzhCFzhCGzhCHzhCIzhCKzhCLzhCMzhCNzhCOzhCRzhCUzhCVzhCWzhCXzhCYzhCZzhDEzhDJzhDKzhDMzhDOzhDZzhECzhEEzhEGzhEHzhERzhESzhETzhFIzhFJzhFKzhFMzhFOzhFRzhGAzhGBzhGDzhGEzhGFzhGGzhGHzhGIzhGLzhGMzhGNzhGPzhGQzhGRzhGSzhGTzhGUzhGWzhGYzhHKzhHMzhHNzhHRzhHTzhHUzhIDzhIEzhILzhIMzhINzhIOzhIQzhIRzhISzhITzhJEzhJMzhJOzhJPzhKEzhKGzhKHzhKIzhKMzhKNzhKPzhKRzhKWzhKYzhKZzhLAzhLBzhLCzhLIzhLKzhLRzhLSzhLTzhLUzhLVzhLYzhMAzhMCzhMDzhMEzhMFzhMGzhMHzhMKzhMLzhMMzhMNzhMOzhMPzhMQzhMRzhMSzhMTzhMUzhMVzhMWzhMXzhMYzhMZzhNAzhNCzhNEzhNFzhNGzhNIzhNLzhNOzhNPzhNRzhNUzhNZzhOMzhPAzhPEzhPFzhPGzhPHzhPKzhPLzhPMzhPNzhPRzhPSzhPTzhPWzhPYzhQAzhREzhROzhRSzhRUzhRWzhSAzhSBzhSCzhSDzhSEzhSGzhSHzhSIzhSJzhSKzhSLzhSMzhSNzhSOzhSRzhSSzhSTzhSVzhSXzhSYzhSZzhTCzhTDzhTFzhTGzhTHzhTJzhTKzhTLzhTMzhTNzhTOzhTRzhTTzhTVzhTWzhTZzhUAzhUGzhUMzhUSzhUYzhUZzhVAzhVCzhVEzhVGzhVIzhVNzhVUzhWFzhWSzhYEzhYTzhZAzhZMzhZW", strArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.startsWithAny("R", strArray10);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rfra", strArray5, strArray10);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rfra" + "'", str13, "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rfra");
    }

    @Test
    public void test15298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15298");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "ROYAUME-UNI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test15299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15299");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "2ITALIANITALIANITALIANITAL", (java.lang.CharSequence) "eCANADAgCANADACANADAsh                                                                                                  ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test15300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15300");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.lang.String str1 = locale0.getDisplayLanguage();
        java.util.Locale locale2 = locale0.stripExtensions();
        java.lang.String str3 = locale0.getLanguage();
        java.util.Set<java.lang.String> strSet4 = locale0.getUnicodeLocaleKeys();
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet4, "French (Canada)");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet4, "ZHO");
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet4, "44444444444444444444444444444444444444444444it                   zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Italian" + "'", str1, "Italian");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "it");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "it" + "'", str3, "it");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test15301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15301");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("talHan", "FRANZOSI         ITALIAN_italian_eNGLISHFRANZOSI");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test15302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15302");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDi...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDi..." + "'", str1, "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDi...");
    }

    @Test
    public void test15303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15303");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE", "                                  !ih                            dalleman");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE" + "'", str2, "EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE");
    }

    @Test
    public void test15304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15304");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("CCCCCCCCCCCCCCCCCCCCCCCCCCfrz\366cz(frkrec)CCCCCCCCCCCCCCCCCCCCCCCCCC");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test15305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15305");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("hIAN\\U0020Ihi", "e", 100, 100);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hIAN\\U0020Ihie" + "'", str4, "hIAN\\U0020Ihie");
    }

    @Test
    public void test15306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15306");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("\\u0038zho                          ", "iiiiiiiiiiifrankreichnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u0038zho                          " + "'", str2, "\\u0038zho                          ");
    }

    @Test
    public void test15307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15307");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse(" italian  ", strMap1);
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
        java.util.List<java.lang.String> strList59 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.lang.String>) strList43, filteringMode57);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap60 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList61 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, strMap60);
        java.util.Locale locale62 = java.util.Locale.ROOT;
        java.lang.String str63 = locale62.getISO3Country();
        java.util.Set<java.lang.String> strSet64 = locale62.getUnicodeLocaleKeys();
        java.util.List<java.lang.String> strList65 = java.util.Locale.filterTags(languageRangeList61, (java.util.Collection<java.lang.String>) strSet64);
        java.lang.String str67 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet64, "FRENCH (CANADA)");
        java.lang.String str68 = java.util.Locale.lookupTag(languageRangeList2, (java.util.Collection<java.lang.String>) strSet64);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap69 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList70 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList2, strMap69);
        java.util.Locale.LanguageRange[] languageRangeArray71 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList72 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList72, languageRangeArray71);
        java.util.Locale.LanguageRange[] languageRangeArray74 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList75 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList75, languageRangeArray74);
        java.lang.String[] strArray79 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList80 = new java.util.ArrayList<java.lang.String>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList80, strArray79);
        java.util.Locale.FilteringMode filteringMode82 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList83 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList75, (java.util.Collection<java.lang.String>) strList80, filteringMode82);
        java.util.Locale.FilteringMode filteringMode84 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList85 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList72, (java.util.Collection<java.lang.String>) strList80, filteringMode84);
        java.util.Collection<java.util.Locale> localeCollection86 = null;
        java.util.List<java.util.Locale> localeList87 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList72, localeCollection86);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale88 = java.util.Locale.lookup(languageRangeList2, localeCollection86);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(languageRangeArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + filteringMode55 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode55.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList56);
        org.junit.Assert.assertTrue("'" + filteringMode57 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode57.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList58);
        org.junit.Assert.assertNotNull(strList59);
        org.junit.Assert.assertNotNull(languageRangeList61);
        org.junit.Assert.assertNotNull(locale62);
        org.junit.Assert.assertEquals(locale62.toString(), "");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertNotNull(strSet64);
        org.junit.Assert.assertNotNull(strList65);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertNull(str68);
        org.junit.Assert.assertNotNull(languageRangeList70);
        org.junit.Assert.assertNotNull(languageRangeArray71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(languageRangeArray74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(strArray79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertTrue("'" + filteringMode82 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode82.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList83);
        org.junit.Assert.assertTrue("'" + filteringMode84 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode84.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList85);
        org.junit.Assert.assertNotNull(localeList87);
    }

    @Test
    public void test15308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15308");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("anihc!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "CANADA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "anihc!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "anihc!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test15309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15309");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd(" italian  ", "   cor\351en    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " italia" + "'", str2, " italia");
    }

    @Test
    public void test15310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15310");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("HI!       ", '7');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!       " + "'", str2, "HI!       ");
    }

    @Test
    public void test15311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15311");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("                                               nailati                                                ko", "HI!       _\\u0020_iTALIENISCH####################################################################...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                               nailati                                                ko" + "'", str2, "                                               nailati                                                ko");
    }

    @Test
    public void test15312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15312");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder5 = builder1.clear();
        java.util.Locale.Builder builder6 = builder5.clear();
        java.util.Locale.Builder builder8 = builder5.setLanguage("zh");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder8.setLanguageTag("ECANADA                                      ...g                                      ...CANADACANADA                                      ...sh                                      ...                                                                                                   ");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: ECANADA                                      ...g                                      ...CANADACANADA                                      ...sh                                      ...                                                                                                    [at index 0]");
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
    public void test15313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15313");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzHSXLGNE_NAILATI_NAXLATX\\zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test15314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15314");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("Franz\366sisch (Kanada)", "                                                                                           U0020ITALIANITALIANITALIANITALI", 16);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test15315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15315");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("00000000000000cor\351en (Cor\351e du Sud)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "00000000000000COR\311EN (cOR\311E DU sUD)" + "'", str1, "00000000000000COR\311EN (cOR\311E DU sUD)");
    }

    @Test
    public void test15316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15316");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("iTALIAN");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test15317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15317");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "allemand");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test15318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15318");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("a)AAAAAAAAAAAAAAAAAAAAAAAAAAHIAN\\U0020IHa)AAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAA)aHI0200U\\NAIHAAAAAAAAAAAAAAAAAAAAAAAAAA)a" + "'", str1, "AAAAAAAAAAAAAAAAAAAAAAAAAA)aHI0200U\\NAIHAAAAAAAAAAAAAAAAAAAAAAAAAA)a");
    }

    @Test
    public void test15319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15319");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "44                                                                                    \\U002");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test15320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15320");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("...IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test15321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15321");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("f");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, '!', 0, 16);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test15322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15322");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("Franz\366sisch", 118);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test15323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15323");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "                                                                                                                                                                                                                                                                           ", (java.lang.CharSequence) "adaeafagaialamanaoaqarasatauawaxazbabbbdbebfbgbhbibjblbmbnbobqbrbsbtbvbwbybzcacccdcfcgchcickclcmcncocrcucvcwcxcyczded8...");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "adaeafagaialamanaoaqarasatauawaxazbabbbdbebfbgbhbibjblbmbnbobqbrbsbtbvbwbybzcacccdcfcgchcickclcmcncocrcucvcwcxcyczded8..." + "'", charSequence2, "adaeafagaialamanaoaqarasatauawaxazbabbbdbebfbgbhbibjblbmbnbobqbrbsbtbvbwbybzcacccdcfcgchcickclcmcncocrcucvcwcxcyczded8...");
    }

    @Test
    public void test15324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15324");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("FRANZ\326SISCHFRANZOSISCH (FRANKREICFRANZ\326SISCHFRANZOSISCH (FRANKREICH", 'B', '\\');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "FRANZ\326SISCHFRANZOSISCH (FRANKREICFRANZ\326SISCHFRANZOSISCH (FRANKREICH" + "'", str3, "FRANZ\326SISCHFRANZOSISCH (FRANKREICFRANZ\326SISCHFRANZOSISCH (FRANKREICH");
    }

    @Test
    public void test15325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15325");
        java.util.Locale locale0 = java.util.Locale.ROOT;
        java.lang.String str1 = locale0.getISO3Country();
        java.lang.String str2 = locale0.getDisplayVariant();
        java.lang.String str3 = locale0.getVariant();
        java.util.Locale locale4 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale8 = new java.util.Locale("Italian", "Italian", "English");
        java.lang.String str9 = locale8.getDisplayCountry();
        java.lang.String str10 = locale4.getDisplayCountry(locale8);
        java.lang.String str11 = locale0.getDisplayLanguage(locale4);
        java.util.Locale locale12 = java.util.Locale.ITALIAN;
        java.util.Set<java.lang.Character> charSet13 = locale12.getExtensionKeys();
        java.lang.String str14 = locale12.getVariant();
        java.lang.String str15 = locale12.getDisplayName();
        java.lang.String str16 = locale12.getCountry();
        java.util.Set<java.lang.String> strSet17 = locale12.getUnicodeLocaleKeys();
        java.lang.String str18 = locale12.getScript();
        java.lang.String str19 = locale12.getDisplayCountry();
        java.lang.String str20 = locale0.getDisplayVariant(locale12);
        java.lang.String str21 = locale0.getDisplayCountry();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertEquals(locale8.toString(), "italian_ITALIAN_English");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ITALIAN" + "'", str9, "ITALIAN");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "China" + "'", str10, "China");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "it");
        org.junit.Assert.assertNotNull(charSet13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Italian" + "'", str15, "Italian");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test15326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15326");
        java.util.Locale locale3 = new java.util.Locale("cCCC\\CCCC", "... g ...", "....................................................................................... (italian,english)");
        org.junit.Assert.assertEquals(locale3.toString(), "cccc\\cccc_... G ..._....................................................................................... (italian,english)");
    }

    @Test
    public void test15327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15327");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) '\u6cd5', '#');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\u6cd5' + "'", char2 == '\u6cd5');
    }

    @Test
    public void test15328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15328");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("Italia");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ailatI" + "'", str1, "ailatI");
    }

    @Test
    public void test15329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15329");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("taly");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test15330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15330");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("zH_cnFrench (Canada)AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\\u0020iItalian\\u0020i                                                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test15331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15331");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("!ih                            dalleman!ih                            dalleman!ih                          ", "8600u\\                                                                                                                  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test15332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15332");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("ESExxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxNCHI", "", "e");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test15333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15333");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("italian (italian,english)", "chinesisch(China)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test15334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15334");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'd');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character d is not in the range '0' - '9'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test15335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15335");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("   h", (int) (short) 1, 71);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   h" + "'", str3, "   h");
    }

    @Test
    public void test15336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15336");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("\\u0029fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran", '\u6cd5');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u0029fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran" + "'", str2, "\\u0029fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran");
    }

    @Test
    public void test15337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15337");
        java.util.Locale locale1 = java.util.Locale.FRANCE;
        java.util.Locale locale2 = java.util.Locale.ITALIAN;
        java.lang.String str4 = locale2.getExtension('h');
        java.lang.String str5 = locale1.getDisplayScript(locale2);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.lowerCase("HI!       ", locale1);
        java.lang.String str7 = locale1.getDisplayLanguage();
        java.util.Set<java.lang.String> strSet8 = locale1.getUnicodeLocaleAttributes();
        java.lang.String str10 = locale1.getExtension('E');
        java.lang.String str11 = locale1.getDisplayScript();
        boolean boolean12 = locale1.hasExtensions();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "it");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!       " + "'", str6, "hi!       ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "French" + "'", str7, "French");
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test15338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15338");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIH", 'i');
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "allemand");
        java.lang.Class<?> wildcardClass5 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test15339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15339");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "0023DALLEMANDALLEMANDALLEMANDALLEMANDALLEMANDALLEMANDALLEMANDALLE");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test15340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15340");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiAlphanumeric('\u6cd5');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test15341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15341");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("en_ca", "FRANZ\326SISCHF(FRANKREICH)", "DE");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test15342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15342");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("zh-TW", "nglish (United Kingdom");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test15343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15343");
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
        java.lang.Object obj22 = locale1.clone();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "italien" + "'", str2, "italien");
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
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertEquals(obj22.toString(), "it");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj22), "it");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj22), "it");
    }

    @Test
    public void test15344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15344");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("N", "fr-C");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "N" + "'", str2, "N");
    }

    @Test
    public void test15345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15345");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "         ITALIAN_italian_eNGLISH         ITALIAN_!IHitTAiT_ITALIAN_EgAish");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test15346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15346");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("Italian");
        java.util.Locale.Builder builder4 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder0.clear();
        java.util.Locale locale7 = java.util.Locale.forLanguageTag("\\u0020");
        java.util.Locale.Builder builder8 = builder0.setLocale(locale7);
        java.util.Locale.Builder builder9 = builder8.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder9.setLanguageTag("!ih!ih!ih!ih!ih!ih!ih!ih!ih!ihtedesco    !ih!ih!ih!ih!ih!ih!ih!ih!ih!ih");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: !ih!ih!ih!ih!ih!ih!ih!ih!ih!ihtedesco    !ih!ih!ih!ih!ih!ih!ih!ih!ih!ih [at index 0]");
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
    }

    @Test
    public void test15347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15347");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                             DE_DE                                              ", "france", "                                                                                              deutsch");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                             DE_DE                                              " + "'", str3, "                                             DE_DE                                              ");
    }

    @Test
    public void test15348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15348");
        java.util.Locale locale3 = new java.util.Locale("Italian", "Italian", "English");
        boolean boolean4 = locale3.hasExtensions();
        java.lang.String str5 = locale3.getDisplayLanguage();
        org.junit.Assert.assertEquals(locale3.toString(), "italian_ITALIAN_English");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "italian" + "'", str5, "italian");
    }

    @Test
    public void test15349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15349");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("Italie                         ", "", 99);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny("", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.concatWith("Italian (Italy)", (java.lang.Object[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Italie                         " + "'", str7, "Italie                         ");
    }

    @Test
    public void test15350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15350");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "\\u0020iTALIANiTALIANiTALIANiTALI\\u0020iTALIANiTALIANiTALIANiTAL");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test15351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15351");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("                                                               \\U0020", (int) 'I');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                 \\U0020  " + "'", str2, "                                                                 \\U0020  ");
    }

    @Test
    public void test15352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15352");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("8300u\\8300u\\8300u\\8300u\\8300u\\8300u\\8300u\\83RA");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test15353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15353");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC", 34);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test15354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15354");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("hi!       _\\U0020_Italienisch####################################################################", "D  \\u007a");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test15355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15355");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                                                                                                                     ", (int) (byte) 10, 3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test15356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15356");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("!ih!ih!ih!ih!ih!ih!ih!ih!ih!ihtedesco    !ih!ih!ih!ih!ih!ih!ih!ih!ih!ih", '2');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test15357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15357");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("ian\\u0020", "aaaaaaaaaaaaaaaaaaaaaaaaaaILATiNA...aaaaaaaaaaaaaaaaaaaaaaaaaa");
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("de", "itTAiT_ITALIAN_EgAish");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.concatWith("4", (java.lang.Object[]) strArray8);
        java.lang.String[] strArray15 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "Deutsch");
        java.lang.String[] strArray17 = org.apache.commons.lang3.StringUtils.stripAll(strArray15, "franz\366sisch (frankreich)");
        boolean boolean18 = org.apache.commons.lang3.StringUtils.startsWithAny("ENGLISCH", strArray17);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny("itTAiT_ITA", strArray17);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.concatWith("franz\366sisch (frankreich)", (java.lang.Object[]) strArray17);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("anihC", strArray8, strArray17);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("ADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhATzhAUzhAWzhAXzhAZzhBAzhBBzhBDzhBEzhBFzhBGzhBHzhBIzhBJzhBLzhBMzhBNzhBOzhBQzhBRzhBSzhBTzhBVzhBWzhBYzhBZzhCAzhCCzhCDzhCFzhCGzhCHzhCIzhCKzhCLzhCMzhCNzhCOzhCRzhCUzhCVzhCWzhCXzhCYzhCZzhDEzhDJzhDKzhDMzhDOzhDZzhECzhEEzhEGzhEHzhERzhESzhETzhFIzhFJzhFKzhFMzhFOzhFRzhGAzhGBzhGDzhGEzhGFzhGGzhGHzhGIzhGLzhGMzhGNzhGPzhGQzhGRzhGSzhGTzhGUzhGWzhGYzhHKzhHMzhHNzhHRzhHTzhHUzhIDzhIEzhILzhIMzhINzhIOzhIQzhIRzhISzhITzhJEzhJMzhJOzhJPzhKEzhKGzhKHzhKIzhKMzhKNzhKPzhKRzhKWzhKYzhKZzhLAzhLBzhLCzhLIzhLKzhLRzhLSzhLTzhLUzhLVzhLYzhMAzhMCzhMDzhMEzhMFzhMGzhMHzhMKzhMLzhMMzhMNzhMOzhMPzhMQzhMRzhMSzhMTzhMUzhMVzhMWzhMXzhMYzhMZzhNAzhNCzhNEzhNFzhNGzhNIzhNLzhNOzhNPzhNRzhNUzhNZzhOMzhPAzhPEzhPFzhPGzhPHzhPKzhPLzhPMzhPNzhPRzhPSzhPTzhPWzhPYzhQAzhREzhROzhRSzhRUzhRWzhSAzhSBzhSCzhSDzhSEzhSGzhSHzhSIzhSJzhSKzhSLzhSMzhSNzhSOzhSRzhSSzhSTzhSVzhSXzhSYzhSZzhTCzhTDzhTFzhTGzhTHzhTJzhTKzhTLzhTMzhTNzhTOzhTRzhTTzhTVzhTWzhTZzhUAzhUGzhUMzhUSzhUYzhUZzhVAzhVCzhVEzhVGzhVIzhVNzhVUzhWFzhWSzhYEzhYTzhZAzhZMzhZW", strArray3, strArray8);
        java.lang.String str26 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, 'U', 395, (int) 'T');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "de" + "'", str9, "de");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "anihC" + "'", str21, "anihC");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "ADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhATzhAUzhAWzhAXzhAZzhBAzhBBzhBDzhBEzhBFzhBGzhBHzhBIzhBJzhBLzhBMzhBNzhBOzhBQzhBRzhBSzhBTzhBVzhBWzhBYzhBZzhCAzhCCzhCDzhCFzhCGzhCHzhCIzhCKzhCLzhCMzhCNzhCOzhCRzhCUzhCVzhCWzhCXzhCYzhCZzhDEzhDJzhDKzhDMzhDOzhDZzhECzhEEzhEGzhEHzhERzhESzhETzhFIzhFJzhFKzhFMzhFOzhFRzhGAzhGBzhGDzhGEzhGFzhGGzhGHzhGIzhGLzhGMzhGNzhGPzhGQzhGRzhGSzhGTzhGUzhGWzhGYzhHKzhHMzhHNzhHRzhHTzhHUzhIDzhIEzhILzhIMzhINzhIOzhIQzhIRzhISzhITzhJEzhJMzhJOzhJPzhKEzhKGzhKHzhKIzhKMzhKNzhKPzhKRzhKWzhKYzhKZzhLAzhLBzhLCzhLIzhLKzhLRzhLSzhLTzhLUzhLVzhLYzhMAzhMCzhMDzhMEzhMFzhMGzhMHzhMKzhMLzhMMzhMNzhMOzhMPzhMQzhMRzhMSzhMTzhMUzhMVzhMWzhMXzhMYzhMZzhNAzhNCzhNEzhNFzhNGzhNIzhNLzhNOzhNPzhNRzhNUzhNZzhOMzhPAzhPEzhPFzhPGzhPHzhPKzhPLzhPMzhPNzhPRzhPSzhPTzhPWzhPYzhQAzhREzhROzhRSzhRUzhRWzhSAzhSBzhSCzhSDzhSEzhSGzhSHzhSIzhSJzhSKzhSLzhSMzhSNzhSOzhSRzhSSzhSTzhSVzhSXzhSYzhSZzhTCzhTDzhTFzhTGzhTHzhTJzhTKzhTLzhTMzhTNzhTOzhTRzhTTzhTVzhTWzhTZzhUAzhUGzhUMzhUSzhUYzhUZzhVAzhVCzhVEzhVGzhVIzhVNzhVUzhWFzhWSzhYEzhYTzhZAzhZMzhZW" + "'", str22, "ADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhATzhAUzhAWzhAXzhAZzhBAzhBBzhBDzhBEzhBFzhBGzhBHzhBIzhBJzhBLzhBMzhBNzhBOzhBQzhBRzhBSzhBTzhBVzhBWzhBYzhBZzhCAzhCCzhCDzhCFzhCGzhCHzhCIzhCKzhCLzhCMzhCNzhCOzhCRzhCUzhCVzhCWzhCXzhCYzhCZzhDEzhDJzhDKzhDMzhDOzhDZzhECzhEEzhEGzhEHzhERzhESzhETzhFIzhFJzhFKzhFMzhFOzhFRzhGAzhGBzhGDzhGEzhGFzhGGzhGHzhGIzhGLzhGMzhGNzhGPzhGQzhGRzhGSzhGTzhGUzhGWzhGYzhHKzhHMzhHNzhHRzhHTzhHUzhIDzhIEzhILzhIMzhINzhIOzhIQzhIRzhISzhITzhJEzhJMzhJOzhJPzhKEzhKGzhKHzhKIzhKMzhKNzhKPzhKRzhKWzhKYzhKZzhLAzhLBzhLCzhLIzhLKzhLRzhLSzhLTzhLUzhLVzhLYzhMAzhMCzhMDzhMEzhMFzhMGzhMHzhMKzhMLzhMMzhMNzhMOzhMPzhMQzhMRzhMSzhMTzhMUzhMVzhMWzhMXzhMYzhMZzhNAzhNCzhNEzhNFzhNGzhNIzhNLzhNOzhNPzhNRzhNUzhNZzhOMzhPAzhPEzhPFzhPGzhPHzhPKzhPLzhPMzhPNzhPRzhPSzhPTzhPWzhPYzhQAzhREzhROzhRSzhRUzhRWzhSAzhSBzhSCzhSDzhSEzhSGzhSHzhSIzhSJzhSKzhSLzhSMzhSNzhSOzhSRzhSSzhSTzhSVzhSXzhSYzhSZzhTCzhTDzhTFzhTGzhTHzhTJzhTKzhTLzhTMzhTNzhTOzhTRzhTTzhTVzhTWzhTZzhUAzhUGzhUMzhUSzhUYzhUZzhVAzhVCzhVEzhVGzhVIzhVNzhVUzhWFzhWSzhYEzhYTzhZAzhZMzhZW");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test15358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15358");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.util.Locale locale1 = java.util.Locale.ENGLISH;
        java.lang.String str2 = locale1.getDisplayCountry();
        java.lang.String str3 = locale0.getDisplayVariant(locale1);
        java.lang.String str4 = locale0.getDisplayCountry();
        java.lang.String str5 = locale0.getScript();
        java.util.Locale locale6 = java.util.Locale.KOREA;
        java.lang.String str7 = locale6.getLanguage();
        java.lang.String str8 = locale0.getDisplayName(locale6);
        java.lang.String str9 = locale0.getDisplayName();
        java.lang.String str10 = locale0.getDisplayCountry();
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "francese" + "'", str9, "francese");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test15359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15359");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("ITALIAN                                                                 ", "", "fRANZ\326SISC", 117);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ITALIAN                                                                 " + "'", str4, "ITALIAN                                                                 ");
    }

    @Test
    public void test15360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15360");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("allemand (Allemagne)", "aDAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDh...", "h!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!i");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "allemand (Allemagne)" + "'", str3, "allemand (Allemagne)");
    }

    @Test
    public void test15361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15361");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("fRANZ\326SISCH (kANADA)", "    \\XTALXAN_ITALIAN_ENGLXSH    ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test15362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15362");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("ti");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder0.setExtension('0', "h_HHHHHHHHH_CV CW CX CY CZ DE DJ DK DM DO DZ EC EE EG EH ER ES ET FI FJ FK");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key: 0 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test15363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15363");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("iTALIAN_italian_eNGLISHITALIAN_!IHitTAiT_ITALIAN_EgAish", "!       allemandtalienischallemanditalian_TALAN_Eng    \\     ADAEAFAGAALA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!       allemandtalienischallemanditalian_TALAN_Eng    \\     ADAEAFAGAALA" + "'", str2, "!       allemandtalienischallemanditalian_TALAN_Eng    \\     ADAEAFAGAALA");
    }

    @Test
    public void test15364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15364");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("eNGLISH", "    ZH_CN    South Korea");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test15365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15365");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("AzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs cAnese (cAna)u0069h..France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)Azhzhzhzhzhzhzhzhzhzh", "hsiAgE_NAILATI_TiATtiHI!_NAILATI         HSILGNe_nailati_NAILATI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs cAnese (cAna)u0069h..France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)Azhzhzhzhzhzhzhzhzhzh" + "'", str2, "AzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs cAnese (cAna)u0069h..France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)Azhzhzhzhzhzhzhzhzhzh");
    }

    @Test
    public void test15366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15366");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("...LIAN", (int) 'I');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test15367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15367");
        java.util.Locale locale3 = new java.util.Locale("                                                                                                              ITALIEITAL", "iFranzosisch ", "cccccccccccccccccccccccccccccccccccccccccccccccccccccccc");
        org.junit.Assert.assertEquals(locale3.toString(), "                                                                                                              italieital_IFRANZOSISCH _cccccccccccccccccccccccccccccccccccccccccccccccccccccccc");
    }

    @Test
    public void test15368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15368");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("en_GB", "hi!(\\U0020,Italienisch#########################################################################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test15369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15369");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("hi!DEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEU\\u0061DEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEU\\u0061DEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEU\\u0061DEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEU\\u0061DEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEU\\u0061DEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEU\\u0061DEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEU\\u0061_\\U0020_Italienisch#########################################################################################");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=hi!deutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeu\\u0061deutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeu\\u0061deutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeu\\u0061deutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeu\\u0061deutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeu\\u0061deutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeu\\u0061deutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeu\\u0061_\\u0020_italienisch#########################################################################################");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test15370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15370");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("fr");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap2 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList3 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList1, strMap2);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap4 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList5 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList3, strMap4);
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(languageRangeList3);
        org.junit.Assert.assertNotNull(languageRangeList5);
    }

    @Test
    public void test15371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15371");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("\\                                               nailati                                              ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\                                               NAILATI                                              " + "'", str1, "\\                                               NAILATI                                              ");
    }

    @Test
    public void test15372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15372");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("ITITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAIITALIANITITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAI", (double) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=ititaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaiitalianititaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitai");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test15373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15373");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("\\u004e", 64);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u004e                                                          " + "'", str2, "\\u004e                                                          ");
    }

    @Test
    public void test15374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15374");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("B", "\uc911\uad6d\uc5b4\uc911\uad6d)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "B" + "'", str2, "B");
    }

    @Test
    public void test15375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15375");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("Hhhhhhhhh", (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test15376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15376");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069!IH\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test15377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15377");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "i\\u0020italianitalianitalianitaliit         \\xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test15378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15378");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("rnz\366sisch(Knd");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "rnz\366sisch(Knd" + "'", str1, "rnz\366sisch(Knd");
    }

    @Test
    public void test15379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15379");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("francese (Canada)", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=francese(canada)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test15380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15380");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "                                h                                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test15381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15381");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiAlphaUpper('D');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test15382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15382");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "nailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailati");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test15383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15383");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("...It...", "h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...It..." + "'", str2, "...It...");
    }

    @Test
    public void test15384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15384");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Locale locale1 = java.util.Locale.ITALIAN;
        java.lang.String str3 = locale1.getExtension('h');
        java.lang.String str4 = locale0.getDisplayScript(locale1);
        boolean boolean5 = locale0.hasExtensions();
        java.lang.String str6 = locale0.getVariant();
        java.util.Set<java.lang.String> strSet7 = locale0.getUnicodeLocaleKeys();
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet7, '.');
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test15385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15385");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("US", "zho                                                                    \\u0020italianitalianitalianitali");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "US" + "'", str2, "US");
    }

    @Test
    public void test15386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15386");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test15387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15387");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("#########FranzosischFranzosisch (Frankreich)########TALIAN_italian_eNGLISHITAL", "                   deutsch                    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                   deutsch                    " + "'", str2, "                   deutsch                    ");
    }

    @Test
    public void test15388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15388");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("                                               nailati                                                ko", "...anitalij...anitalij...anitalij...anitalij...anitalij...anitalij...anitalij...anitalij...anitali");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test15389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15389");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "de_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DE");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test15390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15390");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("Cinese (Cina)\\u0069h...", 997, 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Cinese (Cina)\\u0069h..." + "'", str3, "Cinese (Cina)\\u0069h...");
    }

    @Test
    public void test15391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15391");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("Italian");
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale.Builder builder6 = builder3.setScript("");
        java.util.Locale locale7 = builder6.build();
        java.lang.String str8 = locale7.getLanguage();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = locale7.getISO3Language();
            org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException; message: Couldn't find 3-letter language code for italian");
        } catch (java.util.MissingResourceException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "italian");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "italian" + "'", str8, "italian");
    }

    @Test
    public void test15392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15392");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("44d444", 89, 31);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44d444" + "'", str3, "44d444");
    }

    @Test
    public void test15393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15393");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("Azhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzh", 53, "Korean (South Korea)Korean (Songlish ...Korean (South Korea)Korean (So");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Azhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzh" + "'", str3, "Azhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzh");
    }

    @Test
    public void test15394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15394");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("\\XTALXAN_ITALIAN_ENGLXSH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HSXLGNE_NAILATI_NAXLATX\\" + "'", str1, "HSXLGNE_NAILATI_NAXLATX\\");
    }

    @Test
    public void test15395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15395");
        java.util.Locale locale1 = new java.util.Locale("nc_HZ");
        org.junit.Assert.assertEquals(locale1.toString(), "nc_hz");
    }

    @Test
    public void test15396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15396");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "iTALIAN (ITALIAN,ENGLISH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ITALIAN (ITALIAN,ENGLISH" + "'", str1, "ITALIAN (ITALIAN,ENGLISH");
    }

    @Test
    public void test15397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15397");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("de_de");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test15398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15398");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("hi!(\\U0020,Italienisch############################################hi!       ", 72);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!(\\U0020,Italienisch############################################hi!       " + "'", str2, "hi!(\\U0020,Italienisch############################################hi!       ");
    }

    @Test
    public void test15399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15399");
        java.util.Locale locale3 = new java.util.Locale("8600u\\                                 hsiAgE_NAILATI_TiATti", "ITTAIT_ITALIAN_EGAISH          ", "         INGLESE        ");
        org.junit.Assert.assertEquals(locale3.toString(), "8600u\\                                 hsiage_nailati_tiatti_ITTAIT_ITALIAN_EGAISH          _         INGLESE        ");
    }

    @Test
    public void test15400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15400");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("2iTALIANiTALIANiTALIANiTAL", "AzhzhzhzhzhzhzhzhzhzhE             g");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2iTALIANiTALIANiTALIANiTAL" + "'", str2, "2iTALIANiTALIANiTALIANiTAL");
    }

    @Test
    public void test15401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15401");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test15402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15402");
        char char1 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) 'B');
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + 'B' + "'", char1 == 'B');
    }

    @Test
    public void test15403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15403");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder4 = builder0.clear();
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder5.addUnicodeLocaleAttribute("\\U0034\\U00                                             HCSTUD                                             \\U0034\\U00 ");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: \\U0034\\U00                                             HCSTUD                                             \\U0034\\U00  [at index 0]");
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
    public void test15404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15404");
        java.util.Locale locale1 = new java.util.Locale("ALLEMAND");
        org.junit.Assert.assertEquals(locale1.toString(), "allemand");
    }

    @Test
    public void test15405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15405");
        java.util.Locale locale3 = new java.util.Locale("francese (Francia)", "Fr ncG ", "hi!        (\\U0020,Italienisch#########################################################################################)");
        org.junit.Assert.assertEquals(locale3.toString(), "francese (francia)_FR NCG _hi!        (\\U0020,Italienisch#########################################################################################)");
    }

    @Test
    public void test15406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15406");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("ChineseEN_CA(China)", "nglischIIIIIIIIIIIIIIIIIIIIIIIIIIII");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test15407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15407");
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
        java.util.Locale.Builder builder13 = builder7.removeUnicodeLocaleAttribute("ALLEMAND");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder15 = builder13.setLanguageTag("Cinese (Cina)\\u0069h...");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: Cinese (Cina)\\u0069h... [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u4e2d\u6587\u4e2d\u56fd)" + "'", str5, "\u4e2d\u6587\u4e2d\u56fd)");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "ko");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test15408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15408");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("Hi!        Italienisch italian_ITALIAN_English HI! hi! ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED... \\u0034 HI! Italian \\u0061 \\u0023 hi! iTALIAN Chinese (China) hi! zh_CN iTALIAN en Italienisch", ')', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Hi!        Italienisch italian_ITALIAN_English HI! hi! ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED... \\u0034 HI! Italian \\u0061 \\u0023 hi! iTALIAN Chinese (China4 hi! zh_CN iTALIAN en Italienisch" + "'", str3, "Hi!        Italienisch italian_ITALIAN_English HI! hi! ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED... \\u0034 HI! Italian \\u0061 \\u0023 hi! iTALIAN Chinese (China4 hi! zh_CN iTALIAN en Italienisch");
    }

    @Test
    public void test15409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15409");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "ITALIAN_italian_eNGLISH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test15410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15410");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "...! \\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\                      ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...! \\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\                      " + "'", str1, "...! \\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\                      ");
    }

    @Test
    public void test15411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15411");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("fr-ca", (double) 264);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=264.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test15412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15412");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("ECANADAgCANADACANADAsh", "Und-iTALIAN");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test15413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15413");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder5 = builder4.clear();
        java.util.Locale.Builder builder7 = builder5.setLanguage("ITALIAN");
        java.util.Locale locale8 = builder5.build();
        java.util.Locale.Builder builder9 = builder5.clearExtensions();
        java.util.Locale locale10 = java.util.Locale.ROOT;
        java.lang.String str11 = locale10.getISO3Country();
        java.util.Set<java.lang.String> strSet12 = locale10.getUnicodeLocaleKeys();
        java.util.Locale.Builder builder13 = builder9.setLocale(locale10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder15 = builder13.setRegion("zh-CN");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: zh-CN [at index 0]");
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
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "italian");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test15414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15414");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                    ", "");
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rz...\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rFrn", "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC\\u00d\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITAL\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\u00CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny(" ...", strArray8);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("aaaaaaaaaaaaaaaaaaaaaaaaFranzosisch(Frankreich)aaaaaaaaaaaaaaaaaaaaaaaa", strArray4, strArray8);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.startsWithAny("nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnhiHnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaFranzosisch(Frankreich)aaaaaaaaaaaaaaaaaaaaaaaa" + "'", str10, "aaaaaaaaaaaaaaaaaaaaaaaaFranzosisch(Frankreich)aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test15415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15415");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("cCCC\\CCCC", "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!aNCHc!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test15416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15416");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("\\u0069", "BFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEKoreanADA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u0069" + "'", str2, "\\u0069");
    }

    @Test
    public void test15417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15417");
        java.util.Locale locale0 = java.util.Locale.PRC;
        java.lang.String str1 = locale0.getDisplayVariant();
        java.lang.String str2 = locale0.getDisplayName();
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
        java.lang.String str32 = locale3.getVariant();
        java.lang.String str33 = locale0.getDisplayName(locale3);
        java.util.Locale locale36 = new java.util.Locale("\\u0020iTALIANiTALIANiTALIANiTALI", "French (Canada)");
        java.util.Set<java.lang.String> strSet37 = locale36.getUnicodeLocaleAttributes();
        java.lang.String str38 = locale0.getDisplayLanguage(locale36);
        java.util.Locale locale41 = new java.util.Locale("hi!       ");
        java.util.Locale locale42 = java.util.Locale.CANADA;
        java.lang.String str43 = locale41.getDisplayName(locale42);
        java.lang.String str44 = org.apache.commons.lang3.StringUtils.upperCase("BGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGTALIAN", locale41);
        java.lang.String str45 = locale36.getDisplayScript(locale41);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str47 = locale36.getUnicodeLocaleType("aDAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: aDAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Chinese (China)" + "'", str2, "Chinese (China)");
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
// flaky:         org.junit.Assert.assertEquals(locale19.toString(), "");
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
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "chinois (Chine)" + "'", str33, "chinois (Chine)");
        org.junit.Assert.assertEquals(locale36.toString(), "\\u0020italianitalianitalianitali_FRENCH (CANADA)");
        org.junit.Assert.assertNotNull(strSet37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Chinese" + "'", str38, "Chinese");
        org.junit.Assert.assertEquals(locale41.toString(), "hi!       ");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!       " + "'", str43, "hi!       ");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "BGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGTALIAN" + "'", str44, "BGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGTALIAN");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
    }

    @Test
    public void test15418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15418");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "         INGLESE        ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test15419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15419");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "GGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGitalian", (java.lang.CharSequence) "hcsineilatI");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 36 + "'", int2 == 36);
    }

    @Test
    public void test15420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15420");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("    ZH_CN    South Korea");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=    zh_cn    south korea");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test15421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15421");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("                                                      Englisch                                                       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                      englisch                                                       " + "'", str1, "                                                      englisch                                                       ");
    }

    @Test
    public void test15422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15422");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "\\U000ITALIANITALIANITALIANITALI\\U000ITALIANITALIANITALIANITALHcsineilatI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\U000ITALIANITALIANITALIANITALI\\U000ITALIANITALIANITALIANITALHcsineilatI" + "'", str1, "\\U000ITALIANITALIANITALIANITALI\\U000ITALIANITALIANITALIANITALHcsineilatI");
    }

    @Test
    public void test15423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15423");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("8600u\\U\\u0", 56);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                              8600u\\U\\u0" + "'", str2, "                                              8600u\\U\\u0");
    }

    @Test
    public void test15424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15424");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale.Builder builder6 = builder4.setLanguage("");
        java.util.Locale.Builder builder7 = builder6.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder6.setLanguageTag("\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: \\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064 [at index 0]");
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
    }

    @Test
    public void test15425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15425");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITAL (allemand)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITAL (ALLEMAND)" + "'", str1, "\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITAL (ALLEMAND)");
    }

    @Test
    public void test15426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15426");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzHSXLGNE_NAILATI_NAXLATX\\zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz", (int) (byte) 0, (int) '2');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzHSXLGNE_N" + "'", str3, "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzHSXLGNE_N");
    }

    @Test
    public void test15427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15427");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("ADKAEKAFKAGKAIKALKAMKANKAOKAQKARKASKATKAUKAWKAXKAZKBAKBBKBDKBEKBFKBGKBHKBIKBJKBLKBMKBNKBOKBQKBRKBSKBTKBVKBWKBYKBZKCAKCCKCDKCFKCGKCHKCIKCKKCLKCMKCNKCOKCRKCUKCVKCWKCXKCYKCZKDEKDJKDKKDMKDOKDZKECKEEKEGKEHKERKESKETKFIKFJKFKKFMKFOKFRKGAKGBKGDKGEKGFKGGKGHKGIKGLKGMKGNKGPKGQKGRKGSKGTKGUKGWKGYKHKKHMKHNKHRKHTKHUKIDKIEKILKIMKINKIOKIQKIRKISKITKJEKJMKJOKJPKKEKKGKKHKKIKKMKKNKKPKKRKKWKKYKKZKLAKLBKLCKLIKLKKLRKLSKLTKLUKLVKLYKMAKMCKMDKMEKMFKMGKMHKMKKMLKMMKMNKMOKMPKMQKMRKMSKMTKMUKMVKMWKMXKMYKMZKNAKNCKNEKNFKNGKNIKNLKNOKNPKNRKNUKNZKOMKPAKPEKPFKPGKPHKPKKPLKPMKPNKPRKPSKPTKPWKPYKQAKREKROKRSKRUKRWKSAKSBKSCKSDKSEKSGKSHKSIKSJKSKKSLKSMKSNKSOKSRKSSKSTKSVKSXKSYKSZKTCKTDKTFKTGKTHKTJKTKKTLKTMKTNKTOKTRKTTKTVKTWKTZKUAKUGKUMKUSKUYKUZKVAKVCKVEKVGKVIKVNKVUKWFKWSKYEKYTKZAKZMKZW", (int) 'f');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ADKAEKAFKAGKAIKALKAMKANKAOKAQKARKASKATKAUKAWKAXKAZKBAKBBKBDKBEKBFKBGKBHKBIKBJKBLKBMKBNKBOKBQKBRKBSKBTKBVKBWKBYKBZKCAKCCKCDKCFKCGKCHKCIKCKKCLKCMKCNKCOKCRKCUKCVKCWKCXKCYKCZKDEKDJKDKKDMKDOKDZKECKEEKEGKEHKERKESKETKFIKFJKFKKFMKFOKFRKGAKGBKGDKGEKGFKGGKGHKGIKGLKGMKGNKGPKGQKGRKGSKGTKGUKGWKGYKHKKHMKHNKHRKHTKHUKIDKIEKILKIMKINKIOKIQKIRKISKITKJEKJMKJOKJPKKEKKGKKHKKIKKMKKNKKPKKRKKWKKYKKZKLAKLBKLCKLIKLKKLRKLSKLTKLUKLVKLYKMAKMCKMDKMEKMFKMGKMHKMKKMLKMMKMNKMOKMPKMQKMRKMSKMTKMUKMVKMWKMXKMYKMZKNAKNCKNEKNFKNGKNIKNLKNOKNPKNRKNUKNZKOMKPAKPEKPFKPGKPHKPKKPLKPMKPNKPRKPSKPTKPWKPYKQAKREKROKRSKRUKRWKSAKSBKSCKSDKSEKSGKSHKSIKSJKSKKSLKSMKSNKSOKSRKSSKSTKSVKSXKSYKSZKTCKTDKTFKTGKTHKTJKTKKTLKTMKTNKTOKTRKTTKTVKTWKTZKUAKUGKUMKUSKUYKUZKVAKVCKVEKVGKVIKVNKVUKWFKWSKYEKYTKZAKZMKZW" + "'", str2, "ADKAEKAFKAGKAIKALKAMKANKAOKAQKARKASKATKAUKAWKAXKAZKBAKBBKBDKBEKBFKBGKBHKBIKBJKBLKBMKBNKBOKBQKBRKBSKBTKBVKBWKBYKBZKCAKCCKCDKCFKCGKCHKCIKCKKCLKCMKCNKCOKCRKCUKCVKCWKCXKCYKCZKDEKDJKDKKDMKDOKDZKECKEEKEGKEHKERKESKETKFIKFJKFKKFMKFOKFRKGAKGBKGDKGEKGFKGGKGHKGIKGLKGMKGNKGPKGQKGRKGSKGTKGUKGWKGYKHKKHMKHNKHRKHTKHUKIDKIEKILKIMKINKIOKIQKIRKISKITKJEKJMKJOKJPKKEKKGKKHKKIKKMKKNKKPKKRKKWKKYKKZKLAKLBKLCKLIKLKKLRKLSKLTKLUKLVKLYKMAKMCKMDKMEKMFKMGKMHKMKKMLKMMKMNKMOKMPKMQKMRKMSKMTKMUKMVKMWKMXKMYKMZKNAKNCKNEKNFKNGKNIKNLKNOKNPKNRKNUKNZKOMKPAKPEKPFKPGKPHKPKKPLKPMKPNKPRKPSKPTKPWKPYKQAKREKROKRSKRUKRWKSAKSBKSCKSDKSEKSGKSHKSIKSJKSKKSLKSMKSNKSOKSRKSSKSTKSVKSXKSYKSZKTCKTDKTFKTGKTHKTJKTKKTLKTMKTNKTOKTRKTTKTVKTWKTZKUAKUGKUMKUSKUYKUZKVAKVCKVEKVGKVIKVNKVUKWFKWSKYEKYTKZAKZMKZW");
    }

    @Test
    public void test15428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15428");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                                                                                              DEUTSCH", "          ", (int) '\ud504');
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test15429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15429");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("FR_CA                             ...!       \\U0034\\U0034\\U0034\\U0034\\U0034\\U0034\\U0034\\U0034\\U0034\\     ", "44444444444444444444444444444444444444444444it                   zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz", (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test15430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15430");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("I", "italian(italian,eng", 89, (int) '5');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Iitalian(italian,eng" + "'", str4, "Iitalian(italian,eng");
    }

    @Test
    public void test15431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15431");
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
        java.lang.String str23 = locale15.getDisplayVariant();
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "italien" + "'", str18, "italien");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "english                                h                                 " + "'", str22, "english                                h                                 ");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test15432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15432");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "KR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "KR" + "'", str1, "KR");
    }

    @Test
    public void test15433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15433");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("cCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEnglischCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC", "en_US                ita                ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "cCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEnglischCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC" + "'", str2, "cCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEnglischCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
    }

    @Test
    public void test15434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15434");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("hi!        (\\u0020,italienisch#########################################################################################)", "...It...", 220);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test15435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15435");
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
        java.util.Set<java.lang.Character> charSet10 = locale1.getExtensionKeys();
        java.util.Locale locale11 = locale1.stripExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = locale1.getUnicodeLocaleType("0034\\U00");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: 0034\\U00");
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
        org.junit.Assert.assertNotNull(charSet10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "fr_CA");
    }

    @Test
    public void test15436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15436");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("ITALIAN (ITALIAN,ENGLCOR\311ENCOR\311ENCOR\311ENCOR\311ENCOR\311ENCOR\311ENCOR\311ENCOR\311ENCOR\311ENCOR\311ENCOR\311ENCOR\311ENCOR\311ENCOR\311ENCOR\311ENCOR\311ENCOR", "aaaaaaaaaaaaaaaaaaaaaaaaaaAnihCaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAC");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ITALIAN (ITALIAN,ENGLCOR\311ENCOR\311ENCOR\311ENCOR\311ENCOR\311ENCOR\311ENCOR\311ENCOR\311ENCOR\311ENCOR\311ENCOR\311ENCOR\311ENCOR\311ENCOR\311ENCOR\311ENCOR\311ENCOR" + "'", str2, "ITALIAN (ITALIAN,ENGLCOR\311ENCOR\311ENCOR\311ENCOR\311ENCOR\311ENCOR\311ENCOR\311ENCOR\311ENCOR\311ENCOR\311ENCOR\311ENCOR\311ENCOR\311ENCOR\311ENCOR\311ENCOR\311ENCOR");
    }

    @Test
    public void test15437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15437");
        java.util.Locale locale3 = new java.util.Locale("italy", "ecanadaGcanadacanadaSH                                                                                                   ", "KoreanADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLC");
        org.junit.Assert.assertEquals(locale3.toString(), "italy_ECANADAGCANADACANADASH                                                                                                   _KoreanADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLC");
    }

    @Test
    public void test15438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15438");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("8600u\\                                 hsiAgE_NAILATI_TiATti", (int) 'F');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test15439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15439");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRdeRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR", "zho                                                                    \\u0020italianitalianitalianitali");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRdeRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR" + "'", str2, "RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRdeRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR");
    }

    @Test
    public void test15440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15440");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast(")dnK( hcsis\366znrF", "2aiTALIANiTALIANiTALIANiTAL");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ")dnK( hcsis\366znrF" + "'", str2, ")dnK( hcsis\366znrF");
    }

    @Test
    public void test15441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15441");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("it                   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "it" + "'", str1, "it");
    }

    @Test
    public void test15442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15442");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("englischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglisch", "ITALIAN4");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test15443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15443");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("iTALIAN                                                                 ", "cccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "iTALIAN                                                                 " + "'", str2, "iTALIAN                                                                 ");
    }

    @Test
    public void test15444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15444");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("zhzhzhzhzhzhzhzhzhzhE             ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zhzhzhzhzhzhzhzhzhzhE" + "'", str1, "zhzhzhzhzhzhzhzhzhzhE");
    }

    @Test
    public void test15445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15445");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test15446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15446");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("Ital", "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test15447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15447");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("anglais (Canada)CHINESE", 118, (int) 'u');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test15448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15448");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r..." + "'", str1, "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r...");
    }

    @Test
    public void test15449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15449");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("Regno Unito");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "rEGNO uNITO" + "'", str1, "rEGNO uNITO");
    }

    @Test
    public void test15450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15450");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("Franz\366sisc", "zh_TW");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test15451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15451");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "FFFF", (java.lang.CharSequence) "                                      )HSILGNE,NAILATI( ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 56 + "'", int2 == 56);
    }

    @Test
    public void test15452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15452");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=ffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test15453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15453");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("44\\u002344");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44\\u002344" + "'", str1, "44\\u002344");
    }

    @Test
    public void test15454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15454");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HIAN\\U0020IH", "iiiiiiiiiiiiiiiiiiiiiiiiiiiihI!       iiiiiiiiiiiiiiiiiiiiiiiiiiiii");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test15455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15455");
        java.util.Locale locale2 = new java.util.Locale("TALIAN\\u0023aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "und-iTALIAN");
        java.lang.String str3 = locale2.getScript();
        org.junit.Assert.assertEquals(locale2.toString(), "talian\\u0023aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa_UND-ITALIAN");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test15456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15456");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("iTALIAN (ITALIAN,ENGLISH", "aaaaaaaaaaaaaaaaaaaaaaaaFranzosisch(Frankreich)aaaaaaaaaaaaaaaaaaaaaaaa", "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "iTALIAN (ITALIAN,ENGLISH" + "'", str3, "iTALIAN (ITALIAN,ENGLISH");
    }

    @Test
    public void test15457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15457");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("...#####################################################################", 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=...#####################################################################");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test15458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15458");
        java.util.Locale locale0 = java.util.Locale.PRC;
        java.lang.String str1 = locale0.getDisplayName();
        java.lang.String str2 = locale0.getCountry();
        java.util.Locale locale4 = new java.util.Locale("francese");
        java.util.Set<java.lang.String> strSet5 = locale4.getUnicodeLocaleKeys();
        java.lang.String str6 = locale0.getDisplayScript(locale4);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "chinois (Chine)" + "'", str1, "chinois (Chine)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CN" + "'", str2, "CN");
        org.junit.Assert.assertEquals(locale4.toString(), "francese");
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test15459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15459");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAscii('T');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test15460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15460");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("                                                                                     German (Germany)", "fr_CA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                     German (Germany)" + "'", str2, "                                                                                     German (Germany)");
    }

    @Test
    public void test15461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15461");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "ranzosisch (Frankreich)kkkkkkkkkkkkkkkkkkk...ranzosisch (Frankreich)kkkkkkkkkk\n", (java.lang.CharSequence) "ccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test15462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15462");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("nglischIIIIIIIIIIIIIIIIIIIIIIIIIIII", "ZhozhozhozhozhozhozhozhozhozhozhoItaliazhozhozhozhozhozhozhozhozhozhozhoz", 104);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test15463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15463");
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
            java.util.Locale.Builder builder20 = builder16.setExtension('\ud504', "");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key: ?? [at index 0]");
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
    public void test15464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15464");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rz...\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "z..." + "'", str1, "z...");
    }

    @Test
    public void test15465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15465");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("\\u0034", "h########################################################################################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test15466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15466");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("ECANADAgCANADACANADAsh                                                                                                  ", "ffffffffffffffffffffffffffffffffFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhACor\351e du Sud", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test15467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15467");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("IXII", "de_DE");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test15468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15468");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("Italian");
        java.util.Locale locale4 = builder0.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder0.setUnicodeLocaleKeyword("de                                                                                                                      ", "FranzosischFranz\366sisch (Kanada)(Frankreich)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: de                                                                                                                       [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "italian");
    }

    @Test
    public void test15469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15469");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("DEFGILMNOQRSTUWXZBBBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCCCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLLBLCLILKLRLSLTLULVLYMMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNNCNENFNGNINLNONPNRNUNZOMPPEPFPGPHPKPLPMPNPRPSPTPWPYQRERORSRURWSSBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUUGUMUSUYUZVVCVEVGVIVNVUWFWSYEYTZZMZW", "                                                                                           u0020italianitalianitalianitali");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test15470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15470");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder4.addUnicodeLocaleAttribute("hhhhhhhhhh");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: hhhhhhhhhh [at index 0]");
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
    public void test15471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15471");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("COR\311EN");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concatWith("...u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069!IH\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\englisch", (java.lang.Object[]) strArray3);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("anglais (Canada)", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "COR\311EN" + "'", str4, "COR\311EN");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test15472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15472");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "                              4444ALLEMAND                              4444");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 76 + "'", int1 == 76);
    }

    @Test
    public void test15473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15473");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "zhzhzhzhzhzhzhzhzhzhE");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test15474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15474");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("\\u0061                                                                                                                                                                                                                                                                                                                                                                             ", "FRAADZHAEZHAFZHAGZHAIZHALZHAMZHANZHAOZHAQZHARZHASZHAEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test15475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15475");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("hEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglish", "", "...FDEDZCYCXCWCVCUCRCOCNCMCLCKC         ITALIAN_ITALIAN_ENGLISH         ITALIAN_!IHITTAIT_ITALIAN_EGAISHCHCGCFCDCCCACZBYBWBVBTBSBRBQBOBNBMBLBJB         ITALIAN_ITALIAN_ENGLISH         ITALIAN_!IHITTAIT_ITALIAN_EGAISHBHBGBFBEBDBBBABZAXAWAUATASARAQAOANAMALA         ITALIAN_ITALIAN_ENGLISH         ITALIAN_!IHITTAIT_ITALIAN_EGAISHAGAFAEADA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglish" + "'", str3, "hEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglish");
    }

    @Test
    public void test15476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15476");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "inglese...........................................................................................................................................................................................................................................................................................................................................................................", (java.lang.CharSequence) "44d48600u\\");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "inglese..........................................................................................................................................................................................................................................................................................................................................................................." + "'", charSequence2, "inglese...........................................................................................................................................................................................................................................................................................................................................................................");
    }

    @Test
    public void test15477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15477");
        char[] charArray7 = new char[] { ' ', '4' };
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!", charArray7);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "Chinese (China)", charArray7);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "...       g                     ...", charArray7);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "United Kingdom", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
    }

    @Test
    public void test15478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15478");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("#########FranzosischFranzosisch (Frankreich)########TALIAN_italian_eNGLISHITAL", 4);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#########FranzosischFranzosisch (Frankreich)########TALIAN_italian_eNGLISHITAL" + "'", str2, "#########FranzosischFranzosisch (Frankreich)########TALIAN_italian_eNGLISHITAL");
    }

    @Test
    public void test15479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15479");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("\u52a0\u62ff\u5927eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee", "BFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEKoreanADA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u52a0\u62ff\u5927eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee" + "'", str2, "\u52a0\u62ff\u5927eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee");
    }

    @Test
    public void test15480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15480");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("                                                                                                                  8");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test15481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15481");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("FRANZ\326SISCH");
        java.lang.String str2 = locale1.getDisplayLanguage();
        java.lang.String str3 = locale1.getISO3Language();
        java.lang.String str4 = locale1.toString();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test15482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15482");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.lang.String str1 = locale0.getDisplayLanguage();
        java.util.Locale locale2 = locale0.stripExtensions();
        java.lang.String str3 = locale0.getLanguage();
        java.lang.String str4 = locale0.getISO3Language();
        java.lang.String str5 = locale0.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "italien" + "'", str1, "italien");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "it");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "it" + "'", str3, "it");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ita" + "'", str4, "ita");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "it" + "'", str5, "it");
    }

    @Test
    public void test15483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15483");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale2 = new java.util.Locale("\\u005c");
        java.util.Locale locale4 = java.util.Locale.CHINESE;
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.lowerCase("Franz\366sisch (Frankreich)", locale4);
        java.lang.String str6 = locale4.getVariant();
        java.lang.String str7 = locale2.getDisplayScript(locale4);
        java.util.Locale.setDefault(locale2);
        java.util.Locale.setDefault(category0, locale2);
        java.util.Locale locale10 = java.util.Locale.getDefault(category0);
        java.util.Locale locale11 = java.util.Locale.getDefault(category0);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertEquals(locale2.toString(), "\\u005c");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "franz\366sisch (frankreich)" + "'", str5, "franz\366sisch (frankreich)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "\\u005c");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "\\u005c");
    }

    @Test
    public void test15484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15484");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("                                             de_de                                              ", "DEUTSCH\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test15485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15485");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("###################################i####################################", "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###################################i####################################" + "'", str2, "###################################i####################################");
    }

    @Test
    public void test15486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15486");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("44444444444444444444444444444444!IH", 100, 89);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test15487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15487");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("TALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIAN", "alzzzItalian (Italy)enzzzItalian (Italy)czzzItalian (Italy)#########################################################################################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test15488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15488");
        java.util.Locale locale0 = java.util.Locale.ROOT;
        java.lang.String str1 = locale0.getISO3Country();
        java.lang.String str2 = locale0.getDisplayVariant();
        java.lang.String str3 = locale0.getVariant();
        java.util.Locale locale4 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale8 = new java.util.Locale("Italian", "Italian", "English");
        java.lang.String str9 = locale8.getDisplayCountry();
        java.lang.String str10 = locale4.getDisplayCountry(locale8);
        java.lang.String str11 = locale0.getDisplayLanguage(locale4);
        java.lang.String str12 = locale4.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertEquals(locale8.toString(), "italian_ITALIAN_English");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ITALIAN" + "'", str9, "ITALIAN");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "China" + "'", str10, "China");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "zh_CN" + "'", str12, "zh_CN");
    }

    @Test
    public void test15489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15489");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("...HBI...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...HBI..." + "'", str1, "...HBI...");
    }

    @Test
    public void test15490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15490");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "italiaE", "E             HCSINEILATI             g             HCSINEILATI                          HCSINEILATI             sh");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test15491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15491");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains(" italia", 42);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test15492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15492");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC" + "'", str1, "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
    }

    @Test
    public void test15493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15493");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("ANGLAIS (ROYAUME-UNI)fra");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "anglais (royaume-uni)fra" + "'", str1, "anglais (royaume-uni)fra");
    }

    @Test
    public void test15494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15494");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("Franz\366sisch(Frankreich)", "5\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Franz\366sisch(Frankreich)" + "'", str2, "Franz\366sisch(Frankreich)");
    }

    @Test
    public void test15495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15495");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("hi!        (\\u0020,italienisch#########################################################################################)", 52, 90);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test15496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15496");
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
        java.lang.String str12 = locale11.getDisplayCountry();
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test15497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15497");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'U', (int) 'f');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 102 + "'", int2 == 102);
    }

    @Test
    public void test15498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15498");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("GBR", "nglish ...hi!allemandItalienischallemanditalian_ITALIAN_EnglishallemandHI!allemandhi!allemandADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...allemand\\u0034allemandHI!allemandItalianallemand\\u0061allemand\\u0023allemandhi!allemandiTALIANallemandChinese(China)allemandhi!allemandzh_CNallemandiTALIANallemandenallemandItalienischhi!allemandItalienischallemanditalian_ITALIAN_EnglishallemandHI!allemandhi!allemandADAEAFAGAIALAMANAOA", 499);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test15499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15499");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("CHINESExxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxESENIHC" + "'", str1, "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxESENIHC");
    }

    @Test
    public void test15500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15500");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("SUen_", "francefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrance");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "SUen_" + "'", str2, "SUen_");
    }
}
