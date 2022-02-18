import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest18 {

    public static boolean debug = false;

    @Test
    public void test09001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09001");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("          HI!           ", "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09002");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu\\u0020");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09003");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = java.util.Locale.UK;
        java.util.Locale.Builder builder3 = builder0.setLocale(locale2);
        java.util.Locale locale5 = java.util.Locale.forLanguageTag("\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITAL");
        java.util.Locale.Builder builder6 = builder0.setLocale(locale5);
        java.util.Locale locale7 = builder0.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder0.setUnicodeLocaleKeyword("de_DE", "HIAN\\U0020IH");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: de_DE [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en_GB");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
    }

    @Test
    public void test09004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09004");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("cHN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "cHN" + "'", str1, "cHN");
    }

    @Test
    public void test09005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09005");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("         INGLESE        ", "\\u0065                             ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09006");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("tttttt\\u0049");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test09007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09007");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "a700u\\  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09008");
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
        java.lang.String str24 = locale22.toString();
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
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "chinois (Chine)" + "'", str15, "chinois (Chine)");
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test09009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09009");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("44\\u002344", "tttttt\\u0049", "anglais (Canada");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test09010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09010");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "iiiiiiiiiiiFrankreich", (java.lang.CharSequence) "ZH_cnFrench (Canada)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test09011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09011");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069!ih\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\", (java.lang.CharSequence) "         ITALIAN_ITALIAN_ENGLISH         ITALIAN_!IHITTAIT_ITALIAN_EGAISHE             G                          SHE             G                          SHE             G                          SHE             G                          SHE             G                          SHE             G                          SHE             G                          SHE             G                 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09012");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("........French (Canadad........", "                                                                                                        ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09013");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("ZHO", "Chinese", 5);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concatWith("", (java.lang.Object[]) strArray4);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, "", 371, (int) '9');
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ZHO" + "'", str5, "ZHO");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test09014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09014");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("Frankreich");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Frankreich" + "'", str1, "Frankreich");
    }

    @Test
    public void test09015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09015");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("iiiiiiiiiiiFrankreich", "cinese (cina)\\u0069h..", "B");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "FrkrB" + "'", str3, "FrkrB");
    }

    @Test
    public void test09016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09016");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("", 15, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test09017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09017");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("USEEEE", "Frnz\366sisch(Knd)", "nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn", (int) 'h');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "USEEEE" + "'", str4, "USEEEE");
    }

    @Test
    public void test09018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09018");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "itTAiT_ITALIAN_EgAish                                                                                ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09019");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip(" (italian,english)                                      ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(italian,english)" + "'", str1, "(italian,english)");
    }

    @Test
    public void test09020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09020");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("", "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC nailati             ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09021");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart(" NAILATI             ", "             DE_DE            uuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " NAILATI             " + "'", str2, " NAILATI             ");
    }

    @Test
    public void test09022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09022");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "anglais (Canada)", "italiaE");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09023");
        java.util.Locale locale3 = new java.util.Locale("hi!       _\\U0020_Italienisch####################################################################...", "italian_ITALIAN_English", "hcsineilatI");
        java.lang.String str4 = locale3.getDisplayVariant();
        java.lang.String str5 = locale3.getDisplayScript();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = locale3.getUnicodeLocaleType("german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "hi!       _\\u0020_italienisch####################################################################..._ITALIAN_ITALIAN_ENGLISH_hcsineilatI");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hcsineilatI" + "'", str4, "hcsineilatI");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test09024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09024");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("\\u00de\\u00", (int) '8', 26);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test09025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09025");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "44444444444444444444444444444444444444444444it                   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09026");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase(" \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n", "  \\u007a", 20);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09027");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("CA", "Englisch (Vereinigtes K\366nigreich)", "ian\\u0020");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CA" + "'", str3, "CA");
    }

    @Test
    public void test09028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09028");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("iTALIAN (ITALIAN,ENGLISH", "it\\u0052TA\\u0052i\\u0052T\\u0052_\\u0052ITA");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test09029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09029");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("", (int) 'k', "!ih                            dalleman");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!ih                            dalleman!ih                            dalleman!ih                          " + "'", str3, "!ih                            dalleman!ih                            dalleman!ih                          ");
    }

    @Test
    public void test09030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09030");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("franc", 32, 49);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09031");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("Deutsch", "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZW", 52);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "IT", (int) 'E', (int) (byte) -1);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "hhhhhhhhhh", (int) 'N', 151);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test09032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09032");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "allemand");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test09033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09033");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("            zhzhzhzhzhzhzhzhzhzhFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAzhzhzhzhzhzhzhzhzhzh", "\\u00de\\u00\\u00de\\u00\\u00d         INGLESE       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "            zhzhzhzhzhzhzhzhzhzhFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAzhzhzhzhzhzhzhzhzhzh" + "'", str2, "            zhzhzhzhzhzhzhzhzhzhFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAzhzhzhzhzhzhzhzhzhzh");
    }

    @Test
    public void test09034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09034");
        char[] charArray12 = new char[] { ' ', '4' };
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!", charArray12);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "Chinese (China)", charArray12);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u0065", charArray12);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                                                                                    ", charArray12);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "!ih", charArray12);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\\u0029", charArray12);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhfr-CA", charArray12);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhfr-CA", charArray12);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) ")dnK( hcsis\366znrF", charArray12);
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test09035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09035");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiAlphaLower('0');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09036");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("ZH_CNGGGGG", "deu", (int) 'A');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ZH_CNGGGGG" + "'", str3, "ZH_CNGGGGG");
    }

    @Test
    public void test09037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09037");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065", "FrkrB", "\\u002e");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065" + "'", str3, "\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065");
    }

    @Test
    public void test09038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09038");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("GB", 63, 90);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test09039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09039");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                                                       hi!                                                              ", ".");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09040");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("eng", (double) 79);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=79.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09041");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("Italian");
        java.util.Locale.Builder builder4 = builder0.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder4.setExtension('k', "z...");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension value: z... [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test09042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09042");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e", "\\\\\\\\\\\\\\\\\\italian_ITALIAN_English", 49);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09043");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I" + "'", str1, "\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I");
    }

    @Test
    public void test09044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09044");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("\\u0043", "Franzosisch (Kanada)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09045");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("italian (italian,english", "             \\u0049                                           ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09046");
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
        java.util.Locale locale39 = builder38.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder41 = builder38.addUnicodeLocaleAttribute("########################################################################################");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: ######################################################################################## [at index 0]");
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
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "it");
    }

    @Test
    public void test09047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09047");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("FRANZ\326SISCH\n(FRANKREICH)", "k", 49);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09048");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.GERMAN;
        java.util.Locale locale3 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str4 = locale2.getDisplayName(locale3);
        java.util.Locale.setDefault(category0, locale3);
        java.util.Locale locale8 = new java.util.Locale("\\u0020iTALIANiTALIANiTALIANiTALI\\u0020iTALIANiTALIANiTALIANiTAL", "allemand");
        java.util.Locale.setDefault(category0, locale8);
        java.util.Locale locale10 = java.util.Locale.ITALY;
        java.lang.String str11 = locale10.getScript();
        java.lang.String str12 = locale10.getDisplayVariant();
        java.util.Locale.setDefault(category0, locale10);
        java.util.Locale locale14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.setDefault(category0, locale14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Can't set default locale to NULL");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "allemand" + "'", str4, "allemand");
        org.junit.Assert.assertEquals(locale8.toString(), "\\u0020italianitalianitalianitali\\u0020italianitalianitalianital_ALLEMAND");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test09049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09049");
        java.lang.String str1 = org.apache.commons.lang3.CharUtils.toString('9');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "9" + "'", str1, "9");
    }

    @Test
    public void test09050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09050");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("GBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGTALIAN", "#####################################################################################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09051");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("Italia", "ITALIAN4", (int) 't');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09052");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('H', (int) 'u');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 117 + "'", int2 == 117);
    }

    @Test
    public void test09053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09053");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "44444444444444444444444444444444IHaaaaaaaaaaaaaaaaaaaaaaaaFranz\366sisch (Frankreich)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "!_\\U0020_itle########################################################################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09054");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("", "", (int) 'f');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test09055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09055");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("ian\\u0020", 30, "8ian\\u0020i86");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ian\\u00208ian\\u0020i868ian\\u00" + "'", str3, "ian\\u00208ian\\u0020i868ian\\u00");
    }

    @Test
    public void test09056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09056");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC\\u00d\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITAL\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\u00CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC", "zhzhzhzhzhzhzhzhzhzhfraadzhaezhafzhagzhaizhalzhamzhanzhaozhaqzharzhaszhazhzhzhzhzhzhzhzhzhzh");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 51 + "'", int2 == 51);
    }

    @Test
    public void test09057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09057");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("ANGLAIS (R                                                                                                                     ", "It_I");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ANGLAIS (R                                                                                                                     " + "'", str2, "ANGLAIS (R                                                                                                                     ");
    }

    @Test
    public void test09058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09058");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("FRANZ\326SISCH\n(FRANKREICH)", "HIAN\\U0020IH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "FRANZ\326SISCH\n(FRANKREICH)" + "'", str2, "FRANZ\326SISCH\n(FRANKREICH)");
    }

    @Test
    public void test09059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09059");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("Frnz\366sisch (Knd)", 11);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)" + "'", str2, "Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)");
    }

    @Test
    public void test09060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09060");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("                                                                    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test09061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09061");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("...LIAN", "Ialensch#########################################################################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test09062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09062");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiPrintable('u');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test09063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09063");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiitalian_ITALIAN_Englishiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii", "                                                         \\u005c         ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiitalian_ITALIAN_Englishiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii" + "'", str2, "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiitalian_ITALIAN_Englishiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
    }

    @Test
    public void test09064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09064");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "CV CW CX CY CZ DE DJ DK DM DO DZ EC EE EG EH ER ES ET FI FJ FK", "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDi...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09065");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("fr");
        java.lang.String[] strArray5 = new java.lang.String[] { "...ANiTALI", "             ", "          " };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.List<java.lang.String> strList8 = java.util.Locale.filterTags(languageRangeList1, (java.util.Collection<java.lang.String>) strList6);
        java.util.Locale.LanguageRange[] languageRangeArray9 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList10 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList10, languageRangeArray9);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        java.util.Locale.FilteringMode filteringMode17 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList18 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList10, (java.util.Collection<java.lang.String>) strList15, filteringMode17);
        java.lang.String[] strArray20 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList21 = new java.util.ArrayList<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList21, strArray20);
        java.util.List<java.lang.String> strList23 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList10, (java.util.Collection<java.lang.String>) strList21);
        java.util.Locale.LanguageRange[] languageRangeArray24 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList25 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList25, languageRangeArray24);
        java.lang.String[] strArray29 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList30 = new java.util.ArrayList<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList30, strArray29);
        java.util.Locale.FilteringMode filteringMode32 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList33 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList25, (java.util.Collection<java.lang.String>) strList30, filteringMode32);
        java.lang.String[] strArray35 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList36 = new java.util.ArrayList<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList36, strArray35);
        java.util.List<java.lang.String> strList38 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList25, (java.util.Collection<java.lang.String>) strList36);
        java.util.List<java.lang.String> strList39 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList10, (java.util.Collection<java.lang.String>) strList36);
        java.util.Locale locale40 = java.util.Locale.US;
        java.lang.String str41 = locale40.getScript();
        java.util.Set<java.lang.String> strSet42 = locale40.getUnicodeLocaleAttributes();
        java.lang.String str44 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet42, 'A');
        java.util.List<java.lang.String> strList45 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList10, (java.util.Collection<java.lang.String>) strSet42);
        java.util.Locale.LanguageRange[] languageRangeArray46 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList47 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList47, languageRangeArray46);
        java.util.Locale.LanguageRange[] languageRangeArray49 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList50 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList50, languageRangeArray49);
        java.lang.String[] strArray54 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList55 = new java.util.ArrayList<java.lang.String>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList55, strArray54);
        java.util.Locale.FilteringMode filteringMode57 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList58 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList50, (java.util.Collection<java.lang.String>) strList55, filteringMode57);
        java.util.Locale.FilteringMode filteringMode59 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList60 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList47, (java.util.Collection<java.lang.String>) strList55, filteringMode59);
        java.util.Locale.LanguageRange[] languageRangeArray61 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList62 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList62, languageRangeArray61);
        java.util.Locale.LanguageRange[] languageRangeArray64 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList65 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList65, languageRangeArray64);
        java.lang.String[] strArray69 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList70 = new java.util.ArrayList<java.lang.String>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList70, strArray69);
        java.util.Locale.FilteringMode filteringMode72 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList73 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList65, (java.util.Collection<java.lang.String>) strList70, filteringMode72);
        java.util.Locale.FilteringMode filteringMode74 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList75 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList62, (java.util.Collection<java.lang.String>) strList70, filteringMode74);
        java.util.Locale.LanguageRange[] languageRangeArray76 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList77 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList77, languageRangeArray76);
        java.lang.String[] strArray81 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList82 = new java.util.ArrayList<java.lang.String>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList82, strArray81);
        java.util.Locale.FilteringMode filteringMode84 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList85 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList77, (java.util.Collection<java.lang.String>) strList82, filteringMode84);
        java.util.List<java.lang.String> strList86 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList47, (java.util.Collection<java.lang.String>) strList75, filteringMode84);
        java.util.Locale.FilteringMode filteringMode87 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList88 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList10, (java.util.Collection<java.lang.String>) strList86, filteringMode87);
        java.lang.String str89 = java.util.Locale.lookupTag(languageRangeList1, (java.util.Collection<java.lang.String>) strList88);
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(languageRangeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + filteringMode17 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode17.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertNotNull(languageRangeArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + filteringMode32 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode32.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList33);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(strList38);
        org.junit.Assert.assertNotNull(strList39);
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(strSet42);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(strList45);
        org.junit.Assert.assertNotNull(languageRangeArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(languageRangeArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + filteringMode57 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode57.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList58);
        org.junit.Assert.assertTrue("'" + filteringMode59 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode59.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList60);
        org.junit.Assert.assertNotNull(languageRangeArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(languageRangeArray64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + filteringMode72 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode72.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList73);
        org.junit.Assert.assertTrue("'" + filteringMode74 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode74.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList75);
        org.junit.Assert.assertNotNull(languageRangeArray76);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(strArray81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertTrue("'" + filteringMode84 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode84.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList85);
        org.junit.Assert.assertNotNull(strList86);
        org.junit.Assert.assertTrue("'" + filteringMode87 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode87.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList88);
        org.junit.Assert.assertNull(str89);
    }

    @Test
    public void test09066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09066");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                         \\u005c                                                         ", "English (United Kingdom)", 90);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                    ", "");
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.split("\\u0023", "\\u0023");
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray12, "italian_ITALIAN_English");
        java.lang.String[] strArray16 = org.apache.commons.lang3.StringUtils.stripAll(strArray12, "8600u\\                                                                                                                  ");
        java.lang.String[] strArray17 = null;
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.replaceEach("en", strArray16, strArray17);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("\\\\\\\\\\\\\\\\\\italian_ITALIAN_English", strArray8, strArray17);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray8, "...fdedzcycxcwcvcucrcocncmclckcichcgcfcdcccaczbybwbvbtbsbrbqbobnbmblbjbibhbgbfbebdbbbabzaxawauatasaraqaoanamalaiagafaeada");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("zzzChina", strArray4, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 90 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "en" + "'", str18, "en");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\\\\\\\\\\\\\\\\\\italian_ITALIAN_English" + "'", str19, "\\\\\\\\\\\\\\\\\\italian_ITALIAN_English");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "                                                                                                    " + "'", str21, "                                                                                                    ");
    }

    @Test
    public void test09067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09067");
        java.util.Locale locale1 = java.util.Locale.GERMAN;
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale1.getDisplayName(locale2);
        java.util.Locale.Category category4 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale5 = java.util.Locale.getDefault(category4);
        java.lang.String str6 = locale2.getDisplayVariant(locale5);
        java.util.Locale locale7 = locale2.stripExtensions();
        java.util.Locale locale8 = locale2.stripExtensions();
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.upperCase("", locale2);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "de");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "allemand" + "'", str3, "allemand");
        org.junit.Assert.assertTrue("'" + category4 + "' != '" + java.util.Locale.Category.FORMAT + "'", category4.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale5);
// flaky:         org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test09068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09068");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "it44444444444444444en");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09069");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("TALIAN\\u0023DALLEMANDALLEMANDALLEMANDALLEMANDALLEMANDALLEMANDALLEMANDALLE", "             \\u0049             ", 7);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "aaaaaaaaaaaaaaaaaaaaaaaaaa...anitaliaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "TALIAN\\u0023DALLEMANDALLEMANDALLEMANDALLEMANDALLEMANDALLEMANDALLEMANDALLE" + "'", str5, "TALIAN\\u0023DALLEMANDALLEMANDALLEMANDALLEMANDALLEMANDALLEMANDALLEMANDALLE");
    }

    @Test
    public void test09070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09070");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC", 371, 30);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09071");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEnglischCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC", 12, "\\u000d");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEnglischCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC" + "'", str3, "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEnglischCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
    }

    @Test
    public void test09072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09072");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("\ud55c\uad6d\uc5b4\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n", "                                                                 ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test09073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09073");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("fr_FR", "France");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09074");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("X", "nglisch");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09075");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("\\u0038");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "8300u\\" + "'", str1, "8300u\\");
    }

    @Test
    public void test09076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09076");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                                                                                              italieital", "CINESE (cINA)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09077");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("                                         fr-c                                                          ", "hhhhhhhhhh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                         fr-c                                                          " + "'", str2, "                                         fr-c                                                          ");
    }

    @Test
    public void test09078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09078");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("8ian\\u0020i86", "\ud504\ub791\uc2a4\uc5b4\uce90\ub098\ub2e4)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09079");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("       ", 'u');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test09080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09080");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rZH_CN", 71);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rZH_CN" + "'", str2, "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rZH_CN");
    }

    @Test
    public void test09081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09081");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "fra");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09082");
        java.util.Locale locale1 = java.util.Locale.KOREA;
        java.lang.String str2 = locale1.getVariant();
        java.lang.String str3 = locale1.getVariant();
        java.lang.String str4 = locale1.getISO3Country();
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.upperCase("4444444fra", locale1);
        java.lang.String str6 = locale1.getISO3Country();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "KOR" + "'", str4, "KOR");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4444444FRA" + "'", str5, "4444444FRA");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "KOR" + "'", str6, "KOR");
    }

    @Test
    public void test09083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09083");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("franz\366sisch(frankreich)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "franz\366sisch(frankreich)" + "'", str1, "franz\366sisch(frankreich)");
    }

    @Test
    public void test09084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09084");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("CHINESExxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09085");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("\\U0034\\U00                                             HCSTUD                                             \\U0034\\U00 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\U0034\\U00 HCSTUD \\U0034\\U00" + "'", str1, "\\U0034\\U00 HCSTUD \\U0034\\U00");
    }

    @Test
    public void test09086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09086");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!aNCHc!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09087");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("", "                                                                    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09088");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "....................................................................................... (italian,english)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09089");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "             hcsineilatI             dddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test09090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09090");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("KoreanADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDhcstueDKoreanADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDB", (int) 'h', 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test09091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09091");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("FranzosischFranzosisch (Frankreich)", 23, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test09092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09092");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "\\U0034\\U00                                             HCSTUD                                             \\U0034\\U00");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09093");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("und");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap2 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList3 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList1, strMap2);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap4 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList5 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList1, strMap4);
        java.util.Locale locale7 = java.util.Locale.forLanguageTag("hi!");
        java.lang.String str8 = locale7.getCountry();
        java.lang.String str9 = locale7.getDisplayVariant();
        java.lang.String str10 = locale7.getCountry();
        java.util.Set<java.lang.String> strSet11 = locale7.getUnicodeLocaleAttributes();
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet11, "!_\\U0020_Itle#########################################################################################");
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet11, 'n');
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap17 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList18 = java.util.Locale.LanguageRange.parse("nailati", strMap17);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap19 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList20 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList18, strMap19);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap21 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList22 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList18, strMap21);
        java.util.Locale locale24 = java.util.Locale.FRANCE;
        java.util.Locale locale25 = java.util.Locale.ITALIAN;
        java.lang.String str27 = locale25.getExtension('h');
        java.lang.String str28 = locale24.getDisplayScript(locale25);
        java.lang.String str29 = org.apache.commons.lang3.StringUtils.lowerCase("HI!       ", locale24);
        java.lang.String str30 = locale24.getDisplayLanguage();
        java.util.Set<java.lang.String> strSet31 = locale24.getUnicodeLocaleAttributes();
        java.util.Locale.LanguageRange languageRange33 = new java.util.Locale.LanguageRange("deutsch");
        java.util.Locale.LanguageRange languageRange35 = new java.util.Locale.LanguageRange("E");
        java.lang.String str36 = languageRange35.getRange();
        java.util.Locale.LanguageRange[] languageRangeArray37 = new java.util.Locale.LanguageRange[] { languageRange33, languageRange35 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList38 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList38, languageRangeArray37);
        java.util.Locale locale40 = java.util.Locale.ITALIAN;
        java.lang.String str41 = locale40.getDisplayLanguage();
        java.util.Locale locale42 = locale40.stripExtensions();
        java.lang.String str43 = locale40.getLanguage();
        java.util.Set<java.lang.String> strSet44 = locale40.getUnicodeLocaleKeys();
        java.lang.String str46 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet44, "\\u0020iTALIANiTALIANiTALIANiTALI\\u0020iTALIANiTALIANiTALIANiTAL");
        java.util.Locale.FilteringMode filteringMode47 = java.util.Locale.FilteringMode.EXTENDED_FILTERING;
        java.util.List<java.lang.String> strList48 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList38, (java.util.Collection<java.lang.String>) strSet44, filteringMode47);
        java.util.List<java.lang.String> strList49 = java.util.Locale.filterTags(languageRangeList22, (java.util.Collection<java.lang.String>) strSet31, filteringMode47);
        java.util.List<java.lang.String> strList50 = java.util.Locale.filterTags(languageRangeList1, (java.util.Collection<java.lang.String>) strSet11, filteringMode47);
        java.lang.String str52 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strList50, "iiiiiiiiiiiFrankreich");
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(languageRangeList3);
        org.junit.Assert.assertNotNull(languageRangeList5);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(languageRangeList18);
        org.junit.Assert.assertNotNull(languageRangeList20);
        org.junit.Assert.assertNotNull(languageRangeList22);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "it");
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!       " + "'", str29, "hi!       ");
// flaky:         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "fran\347ais" + "'", str30, "fran\347ais");
        org.junit.Assert.assertNotNull(strSet31);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "e" + "'", str36, "e");
        org.junit.Assert.assertNotNull(languageRangeArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str41 + "' != '" + "italien" + "'", str41, "italien");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "it");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "it" + "'", str43, "it");
        org.junit.Assert.assertNotNull(strSet44);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertTrue("'" + filteringMode47 + "' != '" + java.util.Locale.FilteringMode.EXTENDED_FILTERING + "'", filteringMode47.equals(java.util.Locale.FilteringMode.EXTENDED_FILTERING));
        org.junit.Assert.assertNotNull(strList48);
        org.junit.Assert.assertNotNull(strList49);
        org.junit.Assert.assertNotNull(strList50);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
    }

    @Test
    public void test09094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09094");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList0 = null;
        java.util.Locale.LanguageRange[] languageRangeArray1 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList2 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList2, languageRangeArray1);
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        java.util.Locale.FilteringMode filteringMode9 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList10 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList2, (java.util.Collection<java.lang.String>) strList7, filteringMode9);
        java.lang.String[] strArray12 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        java.util.List<java.lang.String> strList15 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList2, (java.util.Collection<java.lang.String>) strList13);
        java.util.Locale.LanguageRange[] languageRangeArray16 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList17 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList17, languageRangeArray16);
        java.lang.String[] strArray21 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList22 = new java.util.ArrayList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        java.util.Locale.FilteringMode filteringMode24 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList25 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList17, (java.util.Collection<java.lang.String>) strList22, filteringMode24);
        java.lang.String[] strArray27 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList28 = new java.util.ArrayList<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList28, strArray27);
        java.util.List<java.lang.String> strList30 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList17, (java.util.Collection<java.lang.String>) strList28);
        java.util.List<java.lang.String> strList31 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList2, (java.util.Collection<java.lang.String>) strList28);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap32 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList33 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList2, strMap32);
        java.util.Locale locale34 = java.util.Locale.KOREA;
        java.util.Set<java.lang.String> strSet35 = locale34.getUnicodeLocaleAttributes();
        java.lang.String str37 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet35, "\\u005c");
        java.lang.String str39 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet35, "zhzhzhzhzhzhzhzhzhzhFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAzhzhzhzhzhzhzhzhzhzh");
        java.util.List<java.lang.String> strList40 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList2, (java.util.Collection<java.lang.String>) strSet35);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList42 = java.util.Locale.LanguageRange.parse("fr");
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
        java.util.Locale.FilteringMode filteringMode58 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList59 = java.util.Locale.filterTags(languageRangeList42, (java.util.Collection<java.lang.String>) strList52, filteringMode58);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList60 = java.util.Locale.filterTags(languageRangeList0, (java.util.Collection<java.lang.String>) strSet35, filteringMode58);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + filteringMode9 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode9.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(languageRangeArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + filteringMode24 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode24.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertNotNull(strList31);
        org.junit.Assert.assertNotNull(languageRangeList33);
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(strSet35);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(strList40);
        org.junit.Assert.assertNotNull(languageRangeList42);
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
        org.junit.Assert.assertTrue("'" + filteringMode58 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode58.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList59);
    }

    @Test
    public void test09095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09095");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("ed");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ed");
    }

    @Test
    public void test09096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09096");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("zh_CN", (int) (byte) 0, "italian");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zh_CN" + "'", str3, "zh_CN");
    }

    @Test
    public void test09097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09097");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "tTAT_ITA", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test09098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09098");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("\ud504\ub791\uc2a4");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\ud504\ub791\uc2a4" + "'", str1, "\ud504\ub791\uc2a4");
    }

    @Test
    public void test09099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09099");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("ZHO                               44\\u002344  \\u0020iTALIANiTALIANiTALIANiTALI", "H (HHHHHHHHH,CV CW CX CY CZ DE DJ DK DM DO DZ EC EE EG EH ER ES ET FI FJ FK)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ZHO                               44\\u002344  \\u0020iTALIANiTALIANiTALIANiTALI" + "'", str2, "ZHO                               44\\u002344  \\u0020iTALIANiTALIANiTALIANiTALI");
    }

    @Test
    public void test09100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09100");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "ITALIAN_italian_eNGLISH         ITALIAN_!IHitTAiT_ITALIAN_EgAish", "cCCCC...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test09101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09101");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder2.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder2.setLanguage("aaaaaaaaaaaaaaaaaaaaaaaaaa...anitaliaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: aaaaaaaaaaaaaaaaaaaaaaaaaa...anitaliaaaaaaaaaaaaaaaaaaaaaaaaaa [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test09102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09102");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("italian (italian,engl", "it");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("\\");
        boolean boolean7 = org.apache.commons.lang3.StringUtils.startsWithAny("Egsh", strArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("\\u0020TALIANTALIANTALIANiTALI", strArray3, strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 2 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test09103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09103");
        char[] charArray10 = new char[] { ' ', '4' };
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!", charArray10);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "Chinese (China)", charArray10);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u0065", charArray10);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                                                                                    ", charArray10);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "!ih", charArray10);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\\u0029", charArray10);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "E             g                          sh", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test09104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09104");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "Germa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09105");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("uuuuuuuuuuuuuuuuu\\u0066");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "uuuuuuuuuuuuuuuuu\\u0066" + "'", str1, "uuuuuuuuuuuuuuuuu\\u0066");
    }

    @Test
    public void test09106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09106");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ", (java.lang.CharSequence) "HZHZHZHZHZHZHZHZHZHZAHZSAHZRAHZQAHZOAHZNAH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09107");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "         ", "                                  \\u005c                                                         ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test09108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09108");
        java.util.Locale.Builder builder1 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder1.clear();
        java.util.Locale locale3 = java.util.Locale.UK;
        java.util.Locale.Builder builder4 = builder1.setLocale(locale3);
        java.util.Locale.setDefault(locale3);
        java.util.Locale locale7 = new java.util.Locale("en");
        boolean boolean8 = locale7.hasExtensions();
        java.util.Set<java.lang.String> strSet9 = locale7.getUnicodeLocaleKeys();
        java.util.Locale locale10 = java.util.Locale.ITALIAN;
        java.lang.String str11 = locale10.getDisplayLanguage();
        java.util.Locale locale12 = locale10.stripExtensions();
        java.lang.String str13 = locale12.getVariant();
        java.lang.String str14 = locale7.getDisplayLanguage(locale12);
        java.lang.String str15 = locale3.getDisplayVariant(locale7);
        java.lang.String str16 = locale3.getDisplayScript();
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.upperCase("kkkkkkkkkkkkkkkkkeAGAASH", locale3);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en_GB");
        org.junit.Assert.assertNotNull(builder4);
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "KKKKKKKKKKKKKKKKKEAGAASH" + "'", str17, "KKKKKKKKKKKKKKKKKEAGAASH");
    }

    @Test
    public void test09109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09109");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("\r\r...", 122, 101);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09110");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "                              444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444en");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09111");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("ADaAEaAFaAGaAIaALaAMaANaAOaAQaARaASaATaAUaAWaAXaAZaBAaBBaBDaBEaBFaBGaBHaBIaBJaBLaBMaBNaBOaBQaBRaBSaBTaBVaBWaBYaBZaCAaCCaCDaCFaCGaCHaCIaCKaCLaCMaCNaCOaCRaCUaCVaCWaCXaCYaCZaDEaDJaDKaDMaDOaDZaECaEEaEGaEHaERaESaETaFIaFJaFKaFMaFOaFRaGAaGBaGDaGEaGFaGGaGHaGIaGLaGMaGNaGPaGQaGRaGSaGTaGUaGWaGYaHKaHMaHNaHRaHTaHUaIDaIEaILaIMaINaIOaIQaIRaISaITaJEaJMaJOaJPaKEaKGaKHaKIaKMaKNaKPaKRaKWaKYaKZaLAaLBaLCaLIaLKaLRaLSaLTaLUaLVaLYaMAaMCaMDaMEaMFaMGaMHaMKaMLaMMaMNaMOaMPaMQaMRaMSaMTaMUaMVaMWaMXaMYaMZaNAaNCaNEaNFaNGaNIaNLaNOaNPaNRaNUaNZaOMaPAaPEaPFaPGaPHaPKaPLaPMaPNaPRaPSaPTaPWaPYaQAaREaROaRSaRUaRWaSAaSBaSCaSDaSEaSGaSHaSIaSJaSKaSLaSMaSNaSOaSRaSSaSTaSVaSXaSYaSZaTCaTDaTFaTGaTHaTJaTKaTLaTMaTNaTOaTRaTTaTVaTWaTZaUAaUGaUMaUSaUYaUZaVAaVCaVEaVGaVIaVNaVUaWFaWSaYEaYTaZAaZMaZW", 0, "Franz\366sisch (Kanada)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ADaAEaAFaAGaAIaALaAMaANaAOaAQaARaASaATaAUaAWaAXaAZaBAaBBaBDaBEaBFaBGaBHaBIaBJaBLaBMaBNaBOaBQaBRaBSaBTaBVaBWaBYaBZaCAaCCaCDaCFaCGaCHaCIaCKaCLaCMaCNaCOaCRaCUaCVaCWaCXaCYaCZaDEaDJaDKaDMaDOaDZaECaEEaEGaEHaERaESaETaFIaFJaFKaFMaFOaFRaGAaGBaGDaGEaGFaGGaGHaGIaGLaGMaGNaGPaGQaGRaGSaGTaGUaGWaGYaHKaHMaHNaHRaHTaHUaIDaIEaILaIMaINaIOaIQaIRaISaITaJEaJMaJOaJPaKEaKGaKHaKIaKMaKNaKPaKRaKWaKYaKZaLAaLBaLCaLIaLKaLRaLSaLTaLUaLVaLYaMAaMCaMDaMEaMFaMGaMHaMKaMLaMMaMNaMOaMPaMQaMRaMSaMTaMUaMVaMWaMXaMYaMZaNAaNCaNEaNFaNGaNIaNLaNOaNPaNRaNUaNZaOMaPAaPEaPFaPGaPHaPKaPLaPMaPNaPRaPSaPTaPWaPYaQAaREaROaRSaRUaRWaSAaSBaSCaSDaSEaSGaSHaSIaSJaSKaSLaSMaSNaSOaSRaSSaSTaSVaSXaSYaSZaTCaTDaTFaTGaTHaTJaTKaTLaTMaTNaTOaTRaTTaTVaTWaTZaUAaUGaUMaUSaUYaUZaVAaVCaVEaVGaVIaVNaVUaWFaWSaYEaYTaZAaZMaZW" + "'", str3, "ADaAEaAFaAGaAIaALaAMaANaAOaAQaARaASaATaAUaAWaAXaAZaBAaBBaBDaBEaBFaBGaBHaBIaBJaBLaBMaBNaBOaBQaBRaBSaBTaBVaBWaBYaBZaCAaCCaCDaCFaCGaCHaCIaCKaCLaCMaCNaCOaCRaCUaCVaCWaCXaCYaCZaDEaDJaDKaDMaDOaDZaECaEEaEGaEHaERaESaETaFIaFJaFKaFMaFOaFRaGAaGBaGDaGEaGFaGGaGHaGIaGLaGMaGNaGPaGQaGRaGSaGTaGUaGWaGYaHKaHMaHNaHRaHTaHUaIDaIEaILaIMaINaIOaIQaIRaISaITaJEaJMaJOaJPaKEaKGaKHaKIaKMaKNaKPaKRaKWaKYaKZaLAaLBaLCaLIaLKaLRaLSaLTaLUaLVaLYaMAaMCaMDaMEaMFaMGaMHaMKaMLaMMaMNaMOaMPaMQaMRaMSaMTaMUaMVaMWaMXaMYaMZaNAaNCaNEaNFaNGaNIaNLaNOaNPaNRaNUaNZaOMaPAaPEaPFaPGaPHaPKaPLaPMaPNaPRaPSaPTaPWaPYaQAaREaROaRSaRUaRWaSAaSBaSCaSDaSEaSGaSHaSIaSJaSKaSLaSMaSNaSOaSRaSSaSTaSVaSXaSYaSZaTCaTDaTFaTGaTHaTJaTKaTLaTMaTNaTOaTRaTTaTVaTWaTZaUAaUGaUMaUSaUYaUZaVAaVCaVEaVGaVIaVNaVUaWFaWSaYEaYTaZAaZMaZW");
    }

    @Test
    public void test09112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09112");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("             hcsineilatI             ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "             HCSINEILATI             " + "'", str1, "             HCSINEILATI             ");
    }

    @Test
    public void test09113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09113");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rFRANZ...", "Ital");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09114");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("GB", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "GB" + "'", str2, "GB");
    }

    @Test
    public void test09115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09115");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("hi!       allemandtalienischallemanditalian_TALAN_Eng    \\     ADAEAFAGAALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCCKCLCMCNCOCRCUCVCWCXCYCZDED...allemand\\u0034allemandH!allemandtalianallemand\\u0061allemand\\u0023allemandhi!allemandiTALANallemandChinese (China)allemandhi!allemandzh_CNallemandiTALANallemandenallemandtalienisch", "Canada");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test09116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09116");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("x", "TALIAN_italian_eNGLISH         ITAL");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09117");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("H (HHHHHHHHH,CV CW CX CY CZ DE DJ DK DM DO DZ EC EE EG EH ER ES ET FI FJ FK)", "\\u00de\\u00");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09118");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("CCCCCCCCCCCCCanglais (CanadaCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC", "\\u0068", "a");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CCCCCCCCCCCCCanglais (CanadaCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC" + "'", str3, "CCCCCCCCCCCCCanglais (CanadaCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
    }

    @Test
    public void test09119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09119");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("franci");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "franci" + "'", str1, "franci");
    }

    @Test
    public void test09120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09120");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.lang.String str2 = locale1.getDisplayLanguage();
        java.lang.String str3 = locale1.toLanguageTag();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "und" + "'", str3, "und");
    }

    @Test
    public void test09121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09121");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder17 = builder0.addUnicodeLocaleAttribute("                                        ITtaIt_italian_eGaISH                                 \\U006");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute:                                         ITtaIt_italian_eGaISH                                 \\U006 [at index 0]");
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
    }

    @Test
    public void test09122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09122");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                                                                                                  \\u0068", "DEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEU\\u0061", "                                                         \\u005");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                  8" + "'", str3, "                                                                                                                  8");
    }

    @Test
    public void test09123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09123");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIH", 'i');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, 'd', 40, 65);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 63");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test09124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09124");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("\\u0034", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u0034                                                                                              " + "'", str2, "\\u0034                                                                                              ");
    }

    @Test
    public void test09125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09125");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITAL\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test09126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09126");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("CCCC\\CCCC");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "CCCC\\CCCC" + "'", str1, "CCCC\\CCCC");
    }

    @Test
    public void test09127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09127");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("hi!        Italienisch italian_ITALIAN_English HI! hi! ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED... \\u0034 HI! Italian \\u0061 \\u0023 hi! iTALIAN Chinese (China) hi! zh_CN iTALIAN en Italienisch", 122);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 241 + "'", int2 == 241);
    }

    @Test
    public void test09128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09128");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("                ITA                ", "DEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEU\\u0061", 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09129");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("Franz\366sischhhhhhhhHhhhhhhhhHhhhhhhhhHhhhhhhhhHhhh", "It_I", 13);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09130");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("44444444444444444444444444444444!IH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444444444!ih" + "'", str1, "44444444444444444444444444444444!ih");
    }

    @Test
    public void test09131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09131");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray6 = new char[] { ' ', '4' };
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!", charArray6);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsAny("French (Canada)", charArray6);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(charSequence0, charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test09132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09132");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("HCSTUD \\U0034", "EnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglisch", (int) '.');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, 'F');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HCSTUD \\U0034" + "'", str5, "HCSTUD \\U0034");
    }

    @Test
    public void test09133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09133");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("FRFRFRFRFRFRFRFRFRFRFRFRFde_DEFRFRFRFRFRFRFRFRFRFRFRFRFR", "it\\u0052TA\\u0052i\\u0052T\\u0052_\\u0052ITA");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test09134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09134");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder6 = builder1.setLanguage("und");
        java.util.Locale.Builder builder7 = builder1.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder1.setLanguage("e                               ");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: e                                [at index 0]");
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
    }

    @Test
    public void test09135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09135");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rfr-CA\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r", "s (Canada)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rfr-CA\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r" + "'", str2, "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rfr-CA\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r");
    }

    @Test
    public void test09136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09136");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("!", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09137");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                        ITtaIt_italian_eGaISH                                 \\U006", "It_I");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09138");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("d", "Japanese");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "d" + "'", str2, "d");
    }

    @Test
    public void test09139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09139");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("99999\\u0021");
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '9' + "'", char1 == '9');
    }

    @Test
    public void test09140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09140");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "KOREAN (SOUTH KOREA)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09141");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("\u6cd5\u6587");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u6cd5\u6587" + "'", str1, "\u6cd5\u6587");
    }

    @Test
    public void test09142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09142");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("         ITALIAN_italian_eNGLISH", (int) '0', "FRANZ\326SISCH\n(FRANKREICH)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "FRANZ\326SI         ITALIAN_italian_eNGLISHFRANZ\326SI" + "'", str3, "FRANZ\326SI         ITALIAN_italian_eNGLISHFRANZ\326SI");
    }

    @Test
    public void test09143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09143");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("                                            HCSTUD                                             \\U0034", (int) '5');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UD                                             \\U0034" + "'", str2, "UD                                             \\U0034");
    }

    @Test
    public void test09144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09144");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("                                                                                          \\u005c         ", (int) 'R', (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "        \\u005c         " + "'", str3, "        \\u005c         ");
    }

    @Test
    public void test09145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09145");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.util.Locale locale1 = java.util.Locale.ENGLISH;
        java.lang.String str2 = locale1.getDisplayCountry();
        java.lang.String str3 = locale0.getDisplayVariant(locale1);
        java.lang.String str4 = locale0.getDisplayCountry();
        java.lang.String str5 = locale0.getScript();
        java.lang.String str7 = locale0.getExtension('d');
        java.lang.Object obj8 = null;
        boolean boolean9 = locale0.equals(obj8);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test09146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09146");
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
            java.util.Locale.Builder builder10 = builder5.setLanguageTag("AD4AE4AF4AG4AI4AL4AM4AN4AO4AQ4AR4AS4AT4AU4AW4AX4AZ4BA4BB4BD4BE4BF4BG4BH4BI4BJ4BL4BM4BN4BO4BQ4BR4BS4BT4BV4BW4BY4BZ4CA4CC4CD4CF4CG4CH4CI4CK4CL4CM4CN4CO4CR4CU4CV4CW4CX4CY4CZ4DE4DJ4DK4DM4DO4DZ4EC4EE4EG4EH4ER4ES4ET4FI4FJ4FK4FM4FO4FR4GA4GB4GD4GE4GF4GG4GH4GI4GL4GM4GN4GP4GQ4GR4GS4GT4GU4GW4GY4HK4HM4HN4HR4HT4HU4ID4IE4IL4IM4IN4IO4IQ4IR4IS4IT4JE4JM4JO4JP4KE4KG4KH4KI4KM4KN4KP4KR4KW4KY4KZ4LA4LB4LC4LI4LK4LR4LS4LT4LU4LV4LY4MA4MC4MD4ME4MF4MG4MH4MK4ML4MM4MN4MO4MP4MQ4MR4MS4MT4MU4MV4MW4MX4MY4MZ4NA4NC4NE4NF4NG4NI4NL4NO4NP4NR4NU4NZ4OM4PA4PE4PF4PG4PH4PK4PL4PM4PN4PR4PS4PT4PW4PY4QA4RE4RO4RS4RU4RW4SA4SB4SC4SD4SE4SG4SH4SI4SJ4SK4SL4SM4SN4SO4SR4SS4ST4SV4SX4SY4SZ4TC4TD4TF4TG4TH4TJ4TK4TL4TM4TN4TO4TR4TT4TV4TW4TZ4UA4UG4UM4US4UY4UZ4VA4VC4VE4VG4VI4VN4VU4WF4WS4YE4YT4ZA4ZM4ZW");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: AD4AE4AF4AG4AI4AL4AM4AN4AO4AQ4AR4AS4AT4AU4AW4AX4AZ4BA4BB4BD4BE4BF4BG4BH4BI4BJ4BL4BM4BN4BO4BQ4BR4BS4BT4BV4BW4BY4BZ4CA4CC4CD4CF4CG4CH4CI4CK4CL4CM4CN4CO4CR4CU4CV4CW4CX4CY4CZ4DE4DJ4DK4DM4DO4DZ4EC4EE4EG4EH4ER4ES4ET4FI4FJ4FK4FM4FO4FR4GA4GB4GD4GE4GF4GG4GH4GI4GL4GM4GN4GP4GQ4GR4GS4GT4GU4GW4GY4HK4HM4HN4HR4HT4HU4ID4IE4IL4IM4IN4IO4IQ4IR4IS4IT4JE4JM4JO4JP4KE4KG4KH4KI4KM4KN4KP4KR4KW4KY4KZ4LA4LB4LC4LI4LK4LR4LS4LT4LU4LV4LY4MA4MC4MD4ME4MF4MG4MH4MK4ML4MM4MN4MO4MP4MQ4MR4MS4MT4MU4MV4MW4MX4MY4MZ4NA4NC4NE4NF4NG4NI4NL4NO4NP4NR4NU4NZ4OM4PA4PE4PF4PG4PH4PK4PL4PM4PN4PR4PS4PT4PW4PY4QA4RE4RO4RS4RU4RW4SA4SB4SC4SD4SE4SG4SH4SI4SJ4SK4SL4SM4SN4SO4SR4SS4ST4SV4SX4SY4SZ4TC4TD4TF4TG4TH4TJ4TK4TL4TM4TN4TO4TR4TT4TV4TW4TZ4UA4UG4UM4US4UY4UZ4VA4VC4VE4VG4VI4VN4VU4WF4WS4YE4YT4ZA4ZM4ZW [at index 0]");
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
    public void test09147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09147");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("                                                                                         fr-", (int) 'i');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                         fr-" + "'", str2, "                                                                                         fr-");
    }

    @Test
    public void test09148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09148");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "ECANADAgCANADACANADAsh                                                                                                   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09149");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("Englisch", (int) '\r');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "     Englisch" + "'", str2, "     Englisch");
    }

    @Test
    public void test09150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09150");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("fr-CAfr-CAfr-CAfr-CAfr-CAfr-CAfr-CAfr-CAfr-CAfr-CAfr-CAfr\\u000dfr-CAfr-CAfr-CAfr-CAfr-CAfr-CAfr-CAfr-CAfr-CAfr-CAfr-CAfr");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "fr-cafr-cafr-cafr-cafr-cafr-cafr-cafr-cafr-cafr-cafr-cafr\\u000dfr-cafr-cafr-cafr-cafr-cafr-cafr-cafr-cafr-cafr-cafr-cafr" + "'", str1, "fr-cafr-cafr-cafr-cafr-cafr-cafr-cafr-cafr-cafr-cafr-cafr\\u000dfr-cafr-cafr-cafr-cafr-cafr-cafr-cafr-cafr-cafr-cafr-cafr");
    }

    @Test
    public void test09151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09151");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "        FRA         ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test09152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09152");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhfr-CA", "ITALIAN", 0);
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test09153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09153");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069!ih\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\", "                          g             E");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069!ih\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\" + "'", str2, "\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069!ih\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\");
    }

    @Test
    public void test09154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09154");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "             DE_DE            ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 30 + "'", int1 == 30);
    }

    @Test
    public void test09155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09155");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.lang.String str1 = locale0.getLanguage();
        java.lang.String str2 = locale0.getScript();
        java.lang.String str3 = locale0.getISO3Country();
        java.lang.String str4 = locale0.getCountry();
        java.lang.String str5 = locale0.getCountry();
        java.util.Locale locale6 = null;
        java.lang.String str7 = locale0.getDisplayVariant(locale6);
        java.lang.String str8 = locale0.getLanguage();
        java.util.Set<java.lang.String> strSet9 = locale0.getUnicodeLocaleKeys();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "en" + "'", str1, "en");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GBR" + "'", str3, "GBR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "GB" + "'", str4, "GB");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "GB" + "'", str5, "GB");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "en" + "'", str8, "en");
        org.junit.Assert.assertNotNull(strSet9);
    }

    @Test
    public void test09156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09156");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("         italian_ITALIAN_English");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "         italian_ITALIAN_English" + "'", str1, "         italian_ITALIAN_English");
    }

    @Test
    public void test09157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09157");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC\\u00d\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITAL\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\u00CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC", 11, 122);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09158");
        int int1 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '5');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test09159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09159");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = locale22.getExtension(')');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: )");
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\\XTALXAN_ITALIAN_ENGLXSH" + "'", str16, "\\XTALXAN_ITALIAN_ENGLXSH");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "francese" + "'", str17, "francese");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertEquals(locale22.toString(), "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test09160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09160");
        java.util.Locale locale1 = java.util.Locale.KOREA;
        java.lang.String str2 = locale1.getLanguage();
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.upperCase("TALIAN\\u0023", locale1);
        java.util.Locale locale5 = java.util.Locale.FRANCE;
        java.util.Locale locale6 = java.util.Locale.ITALIAN;
        java.lang.String str8 = locale6.getExtension('h');
        java.lang.String str9 = locale5.getDisplayScript(locale6);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.lowerCase("HI!       ", locale5);
        java.lang.String str11 = locale1.getDisplayVariant(locale5);
        java.util.Locale locale12 = java.util.Locale.GERMAN;
        java.util.Locale locale13 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str14 = locale12.getDisplayName(locale13);
        java.util.Locale.Category category15 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale16 = java.util.Locale.getDefault(category15);
        java.lang.String str17 = locale13.getDisplayVariant(locale16);
        java.util.Locale locale18 = locale13.stripExtensions();
        java.util.Locale locale21 = new java.util.Locale("France", "       !IH");
        java.util.Locale locale22 = java.util.Locale.CHINESE;
        java.util.Locale locale23 = java.util.Locale.FRENCH;
        java.lang.String str24 = locale23.getDisplayName();
        java.lang.String str26 = locale23.getExtension('C');
        java.lang.String str27 = locale22.getDisplayLanguage(locale23);
        java.util.Locale.setDefault(locale22);
        java.lang.String str29 = locale21.getDisplayVariant(locale22);
        java.lang.String str30 = locale18.getDisplayVariant(locale22);
        java.lang.String str31 = locale1.getDisplayName(locale22);
        java.lang.String str32 = locale22.getDisplayScript();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ko" + "'", str2, "ko");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "TALIAN\\U0023" + "'", str3, "TALIAN\\U0023");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "it");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!       " + "'", str10, "hi!       ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "de");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "allemand" + "'", str14, "allemand");
        org.junit.Assert.assertTrue("'" + category15 + "' != '" + java.util.Locale.Category.FORMAT + "'", category15.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale16);
// flaky:         org.junit.Assert.assertEquals(locale16.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "fr_CA");
        org.junit.Assert.assertEquals(locale21.toString(), "france_       !IH");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "zh");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "fr");
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\ud504\ub791\uc2a4\uc5b4" + "'", str24, "\ud504\ub791\uc2a4\uc5b4");
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "chinois" + "'", str27, "chinois");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
// flaky:         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\u671d\u9c9c\u6587\u97e9\u56fd)" + "'", str31, "\u671d\u9c9c\u6587\u97e9\u56fd)");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test09161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09161");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("\\u0020italianitalianitalianitali\\u0020italianitalianitalianital");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test09162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09162");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("", "tanoch");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09163");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("    IIIIIIIIII...........................");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test09164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09164");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("zzzChina", "44444444444444ITALIAN44444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444ITALIAN44444444444444" + "'", str2, "44444444444444ITALIAN44444444444444");
    }

    @Test
    public void test09165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09165");
        java.util.Locale locale1 = java.util.Locale.ENGLISH;
        java.lang.String str2 = locale1.getDisplayLanguage();
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.upperCase("!IH", locale1);
        java.lang.String str5 = locale1.getExtension('x');
        java.util.Locale locale8 = new java.util.Locale("\\u0020iTALIANiTALIANiTALIANiTALI", "French (Canada)");
        java.lang.String str9 = locale1.getDisplayScript(locale8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = locale8.getUnicodeLocaleType("                                  \\u005c                                                         ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key:                                   \\u005c                                                         ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u82f1\u6587" + "'", str2, "\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!IH" + "'", str3, "!IH");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals(locale8.toString(), "\\u0020italianitalianitalianitali_FRENCH (CANADA)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test09166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09166");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder6 = builder1.setLanguage("und");
        java.util.Locale locale7 = builder6.build();
        java.util.Locale.Builder builder9 = builder6.setLanguage("fr");
        java.util.Locale.Builder builder12 = builder9.setExtension('u', "");
        java.util.Locale locale16 = new java.util.Locale("Italian", "Italian", "English");
        java.util.Set<java.lang.String> strSet17 = locale16.getUnicodeLocaleAttributes();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder18 = builder9.setLocale(locale16);
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: ITALIAN [at index 0]");
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
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertEquals(locale16.toString(), "italian_ITALIAN_English");
        org.junit.Assert.assertNotNull(strSet17);
    }

    @Test
    public void test09167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09167");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("eagaash");
        org.junit.Assert.assertNotNull(languageRangeList1);
    }

    @Test
    public void test09168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09168");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly(charSequence0, "\\U0034\\U00                                             HCSTUD                                             \\U0034\\U00");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09169");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("", "                                                                    \\U0020ItalianItalianItalianItali", 121);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09170");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("cccccccccccccccccccccccccccccccccccccccccccccccccenglischcccccccccccccccccccccccccccccccccccccccccccccccccc", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "cccccccccccccccccccccccccccccccccccccccccccccccccenglischcccccccccccccccccccccccccccccccccccccccccccccccccc" + "'", str2, "cccccccccccccccccccccccccccccccccccccccccccccccccenglischcccccccccccccccccccccccccccccccccccccccccccccccccc");
    }

    @Test
    public void test09171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09171");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("FRANZ\326SISCH\n(FRANKREICH)", "ZH_CNGGGGG", (int) '\r');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "FRA\326SIS\n(FRAKREI)" + "'", str4, "FRA\326SIS\n(FRAKREI)");
    }

    @Test
    public void test09172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09172");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("\\U0064", "                                                                                           U0020");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\U0064" + "'", str2, "\\U0064");
    }

    @Test
    public void test09173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09173");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("\\u007", "                                             de_de                                              ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u007" + "'", str2, "\\u007");
    }

    @Test
    public void test09174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09174");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("fRANZ\326SISCH (kANADA)", (int) 'H');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test09175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09175");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                                     German (Germany)", "fran\347ais (France)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test09176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09176");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.util.Set<java.lang.Character> charSet1 = locale0.getExtensionKeys();
        java.lang.String str2 = locale0.getVariant();
        java.lang.String str3 = locale0.getDisplayName();
        java.lang.String str4 = locale0.getDisplayLanguage();
        java.lang.String str5 = locale0.getISO3Country();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertNotNull(charSet1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u610f\u5927\u5229\u6587" + "'", str3, "\u610f\u5927\u5229\u6587");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u610f\u5927\u5229\u6587" + "'", str4, "\u610f\u5927\u5229\u6587");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test09177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09177");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("Italian (Italy)", (int) '0', '.');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".................................Italian (Italy)" + "'", str3, ".................................Italian (Italy)");
    }

    @Test
    public void test09178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09178");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "Ttat_ita");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 8 + "'", int1 == 8);
    }

    @Test
    public void test09179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09179");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "\\U0034\\U00                                             HCSTUD                                             \\U0034\\U00");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 116 + "'", int1 == 116);
    }

    @Test
    public void test09180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09180");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("NAC", "anglais (Royaume-Uni)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NAC" + "'", str2, "NAC");
    }

    @Test
    public void test09181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09181");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("NC_HZ", 'd', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "NC_HZ" + "'", str3, "NC_HZ");
    }

    @Test
    public void test09182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09182");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("CINESE (cINA)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "CINESE (cINA)" + "'", str1, "CINESE (cINA)");
    }

    @Test
    public void test09183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09183");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("!ih", "cccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!ih" + "'", str2, "!ih");
    }

    @Test
    public void test09184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09184");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("francese", "Engliscu");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "francese" + "'", str2, "francese");
    }

    @Test
    public void test09185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09185");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("ITALIAN4", "Franz\366sischFranzosisch (Frankreich)uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09186");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('G', 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test09187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09187");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("erma (ermay)", "                                                 TALIAN                                                  ", 57, 24);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "erma (ermay)                                                 TALIAN                                                  " + "'", str4, "erma (ermay)                                                 TALIAN                                                  ");
    }

    @Test
    public void test09188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09188");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("                                                         \\u005c                                                        ", 'i');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                         \\u005c                                                        " + "'", str2, "                                                         \\u005c                                                        ");
    }

    @Test
    public void test09189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09189");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("ANGLAIS (R                                                                                                                     ", "franc");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09190");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("", 'd');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09191");
        java.lang.String str1 = org.apache.commons.lang3.CharUtils.unicodeEscaped((java.lang.Character) 'I');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u0049" + "'", str1, "\\u0049");
    }

    @Test
    public void test09192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09192");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)", 'U', ')');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)" + "'", str3, "Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)");
    }

    @Test
    public void test09193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09193");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("Italian");
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder3.removeUnicodeLocaleAttribute("ed");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: ed [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test09194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09194");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                     g             e", 't');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test09195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09195");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("Deutsch", "\u82f1\u6587", "                                                      Englisch                                                       ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Deutsch" + "'", str3, "Deutsch");
    }

    @Test
    public void test09196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09196");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale locale4 = java.util.Locale.CANADA;
        java.lang.String str5 = locale4.getISO3Country();
        java.util.Locale.Builder builder6 = builder3.setLocale(locale4);
        java.util.Locale locale7 = builder6.build();
        java.lang.String str8 = locale7.getDisplayLanguage();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CAN" + "'", str5, "CAN");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "English" + "'", str8, "English");
    }

    @Test
    public void test09197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09197");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("    ZH_CN    South Korea", "nglish (united kingdom)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09198");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale.Builder builder4 = builder2.clearExtensions();
        java.util.Locale.Builder builder5 = builder2.clear();
        java.util.Locale.Builder builder6 = builder2.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder2.addUnicodeLocaleAttribute("       !IH");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute:        !IH [at index 0]");
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
    public void test09199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09199");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("italiaE");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "italiae" + "'", str1, "italiae");
    }

    @Test
    public void test09200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09200");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("r-FRAAAAAAAAAAAAAAAAAAAAAAAAAAA", "FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "r-FRAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "r-FRAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test09201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09201");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("a)AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAdZH_cnFrench (Cana", "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC\\u00de\\u00CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a)AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAdZH_cnFrench (Cana" + "'", str2, "a)AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAdZH_cnFrench (Cana");
    }

    @Test
    public void test09202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09202");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "\\U0078", (java.lang.CharSequence) "FranzosischFranzosisch (Frankreich)");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "\\U0078" + "'", charSequence2, "\\U0078");
    }

    @Test
    public void test09203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09203");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder5 = builder1.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder1.setUnicodeLocaleKeyword("H!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I", "a)AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAdZH_cnFrench (Cana");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: H!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "French (Canada)" + "'", str3, "French (Canada)");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test09204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09204");
        java.util.Locale locale3 = new java.util.Locale("hi!       _\\U0020_Italienisch####################################################################...", "italian_ITALIAN_English", "hcsineilatI");
        java.lang.String str4 = locale3.getDisplayVariant();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = locale3.getISO3Language();
            org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException; message: Couldn't find 3-letter language code for hi!       _\\u0020_italienisch####################################################################...");
        } catch (java.util.MissingResourceException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "hi!       _\\u0020_italienisch####################################################################..._ITALIAN_ITALIAN_ENGLISH_hcsineilatI");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hcsineilatI" + "'", str4, "hcsineilatI");
    }

    @Test
    public void test09205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09205");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE", "       DE_DE            ", 12);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09206");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("cccccccccccccccccccccccccccccccccccccccccccccccccenglischcccccccccccccccccccccccccccccccccccccccccccccccccc", (int) 't');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09207");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("Undetermined", "zhzhzhzhzhzhzhzhzhzhFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAzhzhzhzhzhzhzhzhzhzh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Undetermined" + "'", str2, "Undetermined");
    }

    @Test
    public void test09208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09208");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "H (HHHHHHHHH,CV CW CX CY CZ DE DJ DK DM DO DZ EC EE EG EH ER ES ET FI FJ FK)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h (HHHHHHHHH,CV CW CX CY CZ DE DJ DK DM DO DZ EC EE EG EH ER ES ET FI FJ FK)" + "'", str1, "h (HHHHHHHHH,CV CW CX CY CZ DE DJ DK DM DO DZ EC EE EG EH ER ES ET FI FJ FK)");
    }

    @Test
    public void test09209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09209");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("iFranzosisch ", "                                                                                                       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "iFranzosisch" + "'", str2, "iFranzosisch");
    }

    @Test
    public void test09210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09210");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaILaaaaaaaaaaaaaaaaaaaaaaaaaaIL", '4');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test09211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09211");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("44444444444444italian44444444444444", '5');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test09212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09212");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("                                             DE_DE                                             ", "EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEitalian_ITALIAN_EnglishEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                             DE_DE                                             " + "'", str2, "                                             DE_DE                                             ");
    }

    @Test
    public void test09213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09213");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("                                                                                                       ", "ITALIA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                       " + "'", str2, "                                                                                                       ");
    }

    @Test
    public void test09214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09214");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("ititaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaiitalianititaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitai", '#');
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "\\u0078");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ititaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaiitalianititaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitai" + "'", str5, "ititaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaiitalianititaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitai");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ititaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaiitalianititaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitai" + "'", str6, "ititaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaiitalianititaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitai");
    }

    @Test
    public void test09215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09215");
        java.util.Locale locale2 = new java.util.Locale("\\u0045", "");
        java.util.Set<java.lang.String> strSet3 = locale2.getUnicodeLocaleAttributes();
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet3, 'h');
        org.junit.Assert.assertEquals(locale2.toString(), "\\u0045");
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test09216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09216");
        java.util.Locale.Builder builder1 = new java.util.Locale.Builder();
        java.util.Locale locale2 = builder1.build();
        java.util.Locale locale4 = java.util.Locale.forLanguageTag("Italian");
        java.lang.String str5 = locale2.getDisplayLanguage(locale4);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.upperCase("", locale4);
        java.lang.String str7 = locale4.getScript();
        java.util.Set<java.lang.String> strSet8 = locale4.getUnicodeLocaleAttributes();
        java.lang.String str9 = locale4.getISO3Country();
        java.lang.String str10 = locale4.getScript();
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "italian");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test09217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09217");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEnglischCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test09218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09218");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("44444444444\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITALHcsineilatI444444444444", "Franz\366sisch");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Franz\366sisch" + "'", str2, "Franz\366sisch");
    }

    @Test
    public void test09219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09219");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "k");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test09220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09220");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.GERMAN;
        java.util.Locale locale3 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str4 = locale2.getDisplayName(locale3);
        java.util.Locale.setDefault(category0, locale3);
        java.util.Locale locale8 = new java.util.Locale("\\u0020iTALIANiTALIANiTALIANiTALI\\u0020iTALIANiTALIANiTALIANiTAL", "allemand");
        java.util.Locale.setDefault(category0, locale8);
        java.util.Locale locale10 = java.util.Locale.ITALY;
        java.lang.String str11 = locale10.getScript();
        java.lang.String str12 = locale10.getDisplayVariant();
        java.util.Locale.setDefault(category0, locale10);
        java.util.Locale locale14 = java.util.Locale.getDefault(category0);
        java.util.Locale locale15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.setDefault(category0, locale15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Can't set default locale to NULL");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
// flaky:         org.junit.Assert.assertEquals(locale1.toString(), "\\u0020italianitalianitalianitali\\u0020italianitalianitalianital_ALLEMAND");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "allemand" + "'", str4, "allemand");
        org.junit.Assert.assertEquals(locale8.toString(), "\\u0020italianitalianitalianitali\\u0020italianitalianitalianital_ALLEMAND");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "it_IT");
    }

    @Test
    public void test09221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09221");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("canada", (int) 'A');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "canada" + "'", str2, "canada");
    }

    @Test
    public void test09222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09222");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("hIAN\\U0020Ih", "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rChinesisch (China)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hIAN\\U0020Ih" + "'", str2, "hIAN\\U0020Ih");
    }

    @Test
    public void test09223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09223");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("English", "Italian");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!", "", (int) (short) 10);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("", strArray3, strArray7);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray7, ' ', (int) (short) 0, (int) (byte) -1);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray7);
        java.lang.Class<?> wildcardClass14 = strArray7.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test09224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09224");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("deutsch\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\", "                                             DE_DE                                              ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09225");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("AD4AE4AF4AG4AI4AL4AM4AN4AO4AQ4AR4AS4AT4AU4AW4AX4AZ4BA4BB4BD4BE4BF4BG4BH4BI4BJ4BL4BM4BN4BO4BQ4BR4BS4BT4BV4BW4BY4BZ4CA4CC4CD4CF4CG4CH4CI4CK4CL4CM4CN4CO4CR4CU4CV4CW4CX4CY4CZ4DE4DJ4DK4DM4DO4DZ4EC4EE4EG4EH4ER4ES4ET4FI4FJ4FK4FM4FO4FR4GA4GB4GD4GE4GF4GG4GH4GI4GL4GM4GN4GP4GQ4GR4GS4GT4GU4GW4GY4HK4HM4HN4HR4HT4HU4ID4IE4IL4IM4IN4IO4IQ4IR4IS4IT4JE4JM4JO4JP4KE4KG4KH4KI4KM4KN4KP4KR4KW4KY4KZ4LA4LB4LC4LI4LK4LR4LS4LT4LU4LV4LY4MA4MC4MD4ME4MF4MG4MH4MK4ML4MM4MN4MO4MP4MQ4MR4MS4MT4MU4MV4MW4MX4MY4MZ4NA4NC4NE4NF4NG4NI4NL4NO4NP4NR4NU4NZ4OM4PA4PE4PF4PG4PH4PK4PL4PM4PN4PR4PS4PT4PW4PY4QA4RE4RO4RS4RU4RW4SA4SB4SC4SD4SE4SG4SH4SI4SJ4SK4SL4SM4SN4SO4SR4SS4ST4SV4SX4SY4SZ4TC4TD4TF4TG4TH4TJ4TK4TL4TM4TN4TO4TR4TT4TV4TW4TZ4UA4UG4UM4US4UY4UZ4VA4VC4VE4VG4VI4VN4VU4WF4WS4YE4YT4ZA4ZM4ZW", 'k');
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("    \\    ", strArray3);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "AD4AE4AF4AG4AI4AL4AM4AN4AO4AQ4AR4AS4AT4AU4AW4AX4AZ4BA4BB4BD4BE4BF4BG4BH4BI4BJ4BL4BM4BN4BO4BQ4BR4BS4BT4BV4BW4BY4BZ4CA4CC4CD4CF4CG4CH4CI4CK4CL4CM4CN4CO4CR4CU4CV4CW4CX4CY4CZ4DE4DJ4DK4DM4DO4DZ4EC4EE4EG4EH4ER4ES4ET4FI4FJ4FK4FM4FO4FR4GA4GB4GD4GE4GF4GG4GH4GI4GL4GM4GN4GP4GQ4GR4GS4GT4GU4GW4GY4HK4HM4HN4HR4HT4HU4ID4IE4IL4IM4IN4IO4IQ4IR4IS4IT4JE4JM4JO4JP4KE4KG4KH4KI4KM4KN4KP4KR4KW4KY4KZ4LA4LB4LC4LI4LK4LR4LS4LT4LU4LV4LY4MA4MC4MD4ME4MF4MG4MH4MK4ML4MM4MN4MO4MP4MQ4MR4MS4MT4MU4MV4MW4MX4MY4MZ4NA4NC4NE4NF4NG4NI4NL4NO4NP4NR4NU4NZ4OM4PA4PE4PF4PG4PH4PK4PL4PM4PN4PR4PS4PT4PW4PY4QA4RE4RO4RS4RU4RW4SA4SB4SC4SD4SE4SG4SH4SI4SJ4SK4SL4SM4SN4SO4SR4SS4ST4SV4SX4SY4SZ4TC4TD4TF4TG4TH4TJ4TK4TL4TM4TN4TO4TR4TT4TV4TW4TZ4UA4UG4UM4US4UY4UZ4VA4VC4VE4VG4VI4VN4VU4WF4WS4YE4YT4ZA4ZM4ZW" + "'", str5, "AD4AE4AF4AG4AI4AL4AM4AN4AO4AQ4AR4AS4AT4AU4AW4AX4AZ4BA4BB4BD4BE4BF4BG4BH4BI4BJ4BL4BM4BN4BO4BQ4BR4BS4BT4BV4BW4BY4BZ4CA4CC4CD4CF4CG4CH4CI4CK4CL4CM4CN4CO4CR4CU4CV4CW4CX4CY4CZ4DE4DJ4DK4DM4DO4DZ4EC4EE4EG4EH4ER4ES4ET4FI4FJ4FK4FM4FO4FR4GA4GB4GD4GE4GF4GG4GH4GI4GL4GM4GN4GP4GQ4GR4GS4GT4GU4GW4GY4HK4HM4HN4HR4HT4HU4ID4IE4IL4IM4IN4IO4IQ4IR4IS4IT4JE4JM4JO4JP4KE4KG4KH4KI4KM4KN4KP4KR4KW4KY4KZ4LA4LB4LC4LI4LK4LR4LS4LT4LU4LV4LY4MA4MC4MD4ME4MF4MG4MH4MK4ML4MM4MN4MO4MP4MQ4MR4MS4MT4MU4MV4MW4MX4MY4MZ4NA4NC4NE4NF4NG4NI4NL4NO4NP4NR4NU4NZ4OM4PA4PE4PF4PG4PH4PK4PL4PM4PN4PR4PS4PT4PW4PY4QA4RE4RO4RS4RU4RW4SA4SB4SC4SD4SE4SG4SH4SI4SJ4SK4SL4SM4SN4SO4SR4SS4ST4SV4SX4SY4SZ4TC4TD4TF4TG4TH4TJ4TK4TL4TM4TN4TO4TR4TT4TV4TW4TZ4UA4UG4UM4US4UY4UZ4VA4VC4VE4VG4VI4VN4VU4WF4WS4YE4YT4ZA4ZM4ZW");
    }

    @Test
    public void test09226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09226");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                               nailati                                                ko", 20, "\\u0061");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                               nailati                                                ko" + "'", str3, "                                               nailati                                                ko");
    }

    @Test
    public void test09227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09227");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("HI!HI!", "fra", 117);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "\\u0039", 117, (int) 'z');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HI!HI!" + "'", str4, "HI!HI!");
    }

    @Test
    public void test09228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09228");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "\\u0066", 0);
        java.lang.String[] strArray6 = java.util.Locale.getISOCountries();
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray6);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("4", strArray5, strArray6);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.stripAll(strArray5, "\\U0078");
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.concatWith("h#########################################################################################", (java.lang.Object[]) strArray12);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZW" + "'", str7, "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZW");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZW" + "'", str8, "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZW");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "4" + "'", str10, "4");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test09229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09229");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited(" italian  ", 'u');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " italian  " + "'", str2, " italian  ");
    }

    @Test
    public void test09230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09230");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("fRANZ\326SISC");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "fRANZ\326SISC" + "'", str1, "fRANZ\326SISC");
    }

    @Test
    public void test09231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09231");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("zhANzhAOzhAQzhARzhASzhAzhzhzhzhzhzhzhzhzhzh", "Italy");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09232");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("n");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("English", "Italian");
        int int6 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray5);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("englisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)", strArray2, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test09233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09233");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("...fdedzcycxcwcvcucrcocncmclckcichcgcfcdcccaczbybwbvbtbsbrbqbobnbmblbjbibhbgbfbebdbbbabzaxawauatasaraqaoanamalaiagafaeada", "    IIIIIIIIII");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...fdedzcycxcwcvcucrcocncmclckcichcgcfcdcccaczbybwbvbtbsbrbqbobnbmblbjbibhbgbfbebdbbbabzaxawauatasaraqaoanamalaiagafaeada" + "'", str2, "...fdedzcycxcwcvcucrcocncmclckcichcgcfcdcccaczbybwbvbtbsbrbqbobnbmblbjbibhbgbfbebdbbbabzaxawauatasaraqaoanamalaiagafaeada");
    }

    @Test
    public void test09234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09234");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("it_IT", "French", "                                           fRENCH (fRANCE)                                            ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test09235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09235");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("\\u0029", (int) (byte) -1, "d");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\u0029" + "'", str3, "\\u0029");
    }

    @Test
    public void test09236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09236");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("aDAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...", 71);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "WBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED..." + "'", str2, "WBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...");
    }

    @Test
    public void test09237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09237");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("nailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailati", "...                             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailati" + "'", str2, "nailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailati");
    }

    @Test
    public void test09238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09238");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("italian (italian,eng", "ADCAECAFCAGCAICALCAMCANCAOCAQCARCASCATCAUCAWCAXCAZCBACBBCBDCBECBFCBGCBHCBICBJCBLCBMCBNCBOCBQCBRCBSCBTCBVCBWCBYCBZCCACCCCCDCCFCCGCCHCCICCKCCLCCMCCNCCOCCRCCUCCVCCWCCXCCYCCZCDECDJCDKCDMCDOCDZCECCEECEGCEHCERCESCETCFICFJCFKCFMCFOCFRCGACGBCGDCGECGFCGGCGHCGICGLCGMCGNCGPCGQCGRCGSCGTCGUCGWCGYCHKCHMCHNCHRCHTCHUCIDCIECILCIMCINCIOCIQCIRCISCITCJECJMCJOCJPCKECKGCKHCKICKMCKNCKPCKRCKWCKYCKZCLACLBCLCCLICLKCLRCLSCLTCLUCLVCLYCMACMCCMDCMECMFCMGCMHCMKCMLCMMCMNCMOCMPCMQCMRCMSCMTCMUCMVCMWCMXCMYCMZCNACNCCNECNFCNGCNICNLCNOCNPCNRCNUCNZCOMCPACPECPFCPGCPHCPKCPLCPMCPNCPRCPSCPTCPWCPYCQACRECROCRSCRUCRWCSACSBCSCCSDCSECSGCSHCSICSJCSKCSLCSMCSNCSOCSRCSSCSTCSVCSXCSYCSZCTCCTDCTFCTGCTHCTJCTKCTLCTMCTNCTOCTRCTTCTVCTWCTZCUACUGCUMCUSCUYCUZCVACVCCVECVGCVICVNCVUCWFCWSCYECYTCZACZMCZW", 27);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "italian (italian,eng" + "'", str3, "italian (italian,eng");
    }

    @Test
    public void test09239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09239");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiNumeric('9');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test09240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09240");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) " italian  ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test09241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09241");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("                              it", (int) 'c');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                 it" + "'", str2, "                                                                                                 it");
    }

    @Test
    public void test09242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09242");
        java.util.Locale locale1 = java.util.Locale.getDefault();
        java.lang.String str2 = locale1.getDisplayScript();
        java.util.Locale locale3 = java.util.Locale.FRANCE;
        java.util.Locale locale4 = java.util.Locale.ITALIAN;
        java.lang.String str6 = locale4.getExtension('h');
        java.lang.String str7 = locale3.getDisplayScript(locale4);
        boolean boolean8 = locale3.hasExtensions();
        java.lang.String str9 = locale3.getVariant();
        java.util.Set<java.lang.Character> charSet10 = locale3.getExtensionKeys();
        java.lang.String str11 = locale3.toLanguageTag();
        java.lang.String str12 = locale1.getDisplayCountry(locale3);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.lowerCase("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444en", locale1);
        java.lang.String str14 = locale1.getISO3Country();
        java.lang.String str16 = locale1.getExtension('a');
        java.util.Locale locale17 = null;
        java.lang.String str18 = locale1.getDisplayCountry(locale17);
        org.junit.Assert.assertNotNull(locale1);
// flaky:         org.junit.Assert.assertEquals(locale1.toString(), "de");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "it");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(charSet10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "fr-FR" + "'", str11, "fr-FR");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444en" + "'", str13, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444en");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test09243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09243");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "E44444444444444444444444444444444!IHg44444444444444444444444444444444!IH44444444444444444444444444444444!IHs");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "E44444444444444444444444444444444!IHg44444444444444444444444444444444!IH44444444444444444444444444444444!IHs" + "'", str1, "E44444444444444444444444444444444!IHg44444444444444444444444444444444!IH44444444444444444444444444444444!IHs");
    }

    @Test
    public void test09244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09244");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("en_US", "\\u005c");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09245");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "EAGAASH                                                                                                                                                                                                                                                                                                                                                                                                    ", "\\u00de\\u00");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test09246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09246");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "E44444444444444444444444444444444!IHg44444444444444444444444444444444!IH44444444444444444444444444444444!IHsh", "anihc");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 108 + "'", int2 == 108);
    }

    @Test
    public void test09247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09247");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator(".Korean (South Korea)Korean (So", " \\U0078 ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test09248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09248");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("cor\351en (Cor\351e du Sud)", "TA...");
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       ", strArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "                                                     \\u005c         ", 997, (int) 'T');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test09249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09249");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("cinese (Cina)\\u0069h...", "\\u0078", 105);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("         ITALIAN_italian_eNGLISH         ITALIAN_!IHitTAiT_ITALIAN_EgAishE             g                          shE             g                          shE             g                          shE             g                          shE             g                          shE             g                          shE             g                          shE             g                 ", strArray2, strArray8);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "         ITALIAN_italian_eNGLISH         ITALIAN_!IHitTAiT_ITALIAN_EgAishE             g                          shE             g                          shE             g                          shE             g                          shE             g                          shE             g                          shE             g                          shE             g                 " + "'", str9, "         ITALIAN_italian_eNGLISH         ITALIAN_!IHitTAiT_ITALIAN_EgAishE             g                          shE             g                          shE             g                          shE             g                          shE             g                          shE             g                          shE             g                          shE             g                 ");
    }

    @Test
    public void test09250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09250");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("\\u006b", "u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "6b" + "'", str2, "6b");
    }

    @Test
    public void test09251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09251");
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
            java.util.Locale.Builder builder11 = builder3.setUnicodeLocaleKeyword("                                                                                                                  \\u0068", "         HITALIANH_HitalianH_HeHNGLISH");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key:                                                                                                                   \\u0068 [at index 0]");
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
    public void test09252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09252");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("italian (italian,english)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ITALIAN (ITALIAN,ENGLISH)" + "'", str1, "ITALIAN (ITALIAN,ENGLISH)");
    }

    @Test
    public void test09253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09253");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("U00\\U0034\\U00                                             HCSTUD                                             \\U0034");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "u00\\u0034\\u00                                             hcstud                                             \\u0034" + "'", str1, "u00\\u0034\\u00                                             hcstud                                             \\u0034");
    }

    @Test
    public void test09254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09254");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("069\\u0069\\u0069\\u0069\\u0069\\", "FR", 52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09255");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("2cinese (Cina...", "\\u0065                             ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test09256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09256");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.apache.commons.lang3.CharUtils.toIntValue(')');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character ) is not in the range '0' - '9'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09257");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "         italian_italian_english         italian_!ihittait_italian_egaishe             g                          she             g                          she             g                          she             g                          she             g                          she             g                          she             g                          she             g                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "         italian_italian_english         italian_!ihittait_italian_egaishe             g                          she             g                          she             g                          she             g                          she             g                          she             g                          she             g                          she             g                 " + "'", str1, "         italian_italian_english         italian_!ihittait_italian_egaishe             g                          she             g                          she             g                          she             g                          she             g                          she             g                          she             g                          she             g                 ");
    }

    @Test
    public void test09258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09258");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\\0020iTALIANiTALIANiTALIANiTALzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz", " nailati             ");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '!');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\0020!TALIAN!TALIAN!TALIAN!TALzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz" + "'", str4, "\\0020!TALIAN!TALIAN!TALIAN!TALzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
    }

    @Test
    public void test09259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09259");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("                                       \\u0020iTALIANiTALIANiTALIANiTALI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u0020iTALIANiTALIANiTALIANiTALI" + "'", str1, "\\u0020iTALIANiTALIANiTALIANiTALI");
    }

    @Test
    public void test09260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09260");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = java.util.Locale.UK;
        java.util.Locale.Builder builder3 = builder0.setLocale(locale2);
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale.Builder builder5 = new java.util.Locale.Builder();
        java.util.Locale locale6 = builder5.build();
        java.lang.String str7 = locale6.getDisplayCountry();
        java.util.Locale.Builder builder8 = builder3.setLocale(locale6);
        java.util.Locale.Builder builder9 = builder3.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder9.setLanguage("0023DALLEMANDALLEMANDALLEMANDALLEMANDALLEMANDALLEMANDALLEMANDALLE");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: 0023DALLEMANDALLEMANDALLEMANDALLEMANDALLEMANDALLEMANDALLEMANDALLE [at index 0]");
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
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test09261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09261");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF", 2);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF" + "'", str2, "FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF");
    }

    @Test
    public void test09262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09262");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("Italian");
        java.util.Locale locale4 = java.util.Locale.PRC;
        java.lang.String str5 = locale4.getDisplayName();
        java.util.Locale.Builder builder6 = builder0.setLocale(locale4);
        java.util.Locale locale7 = builder0.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder0.setExtension('U', "GBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGTALIAN");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension value: GBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGTALIAN [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Chinese (China)" + "'", str5, "Chinese (China)");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh_CN");
    }

    @Test
    public void test09263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09263");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "2ITALIANITALIANITALIANITAL", "                         fran\347                          ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test09264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09264");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("                                                                                                 ", "ZHO                                                                    \\u0020iTALIANiTALIANiTALIANiTALI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                 " + "'", str2, "                                                                                                 ");
    }

    @Test
    public void test09265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09265");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("zhzhzhzhzhzhzhzhzhzhfraadzhaezhafzhagzhaizhalzhamzhanzhaozhaqzharzhaszhazhzhzhzhzhzhzhzhzhz", "\ub3c5\uc77c\uc5b4");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09266");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("DEU", 0, 79);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09267");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "h)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09268");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("                                                                               ", 499);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                               " + "'", str2, "                                                                               ");
    }

    @Test
    public void test09269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09269");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("000000000000000000000000000000000000000000000000000000000000000CCCC\\CCCCHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH", 45);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "000000000000000000000000000000000000000000..." + "'", str2, "000000000000000000000000000000000000000000...");
    }

    @Test
    public void test09270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09270");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC", "           \\u", 26);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CCCCCCC           \\uCCCCCC" + "'", str3, "CCCCCCC           \\uCCCCCC");
    }

    @Test
    public void test09271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09271");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("4444444FRA", "\\FranzosischFranzosisch (Frankreich)0034\\FranzosischFranzosisch (Frankreich)00                                             hFranzosischFranzosisch (Frankreich)                                             \\FranzosischFranzosisch (Frankreich)0034\\FranzosischFranzosisch (Frankreich)00 (\\U0020IITALIAN\\U0020I)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test09272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09272");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("", "\uc774\ud0c8\ub9ac\uc544\uc5b4");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09273");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("nglish (united kingdom", "Italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nglish (united kingdom" + "'", str2, "nglish (united kingdom");
    }

    @Test
    public void test09274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09274");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("\\u0023", "         ITALIAN_italian_eNGLISH         ITALIAN_!IHitTAiT_ITALIAN_EgAish");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09275");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("                                                                 CANADA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                 CANADA" + "'", str1, "                                                                 CANADA");
    }

    @Test
    public void test09276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09276");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("", "     Englisch", 32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09277");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "Undetermined");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09278");
        java.util.Locale locale1 = java.util.Locale.ENGLISH;
        java.lang.String str2 = locale1.getDisplayLanguage();
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.lowerCase("!_\\u0020_iTLE#########################################################################################", locale1);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "English" + "'", str2, "English");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!_\\u0020_itle#########################################################################################" + "'", str3, "!_\\u0020_itle#########################################################################################");
    }

    @Test
    public void test09279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09279");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz\\XTALXAN_ITALIAN_ENGLXSHzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz", "nglish (united kingdom");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09280");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("Undetermined");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Undetermined" + "'", str1, "Undetermined");
    }

    @Test
    public void test09281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09281");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "Cinese (cina)\\u0069h...", (java.lang.CharSequence) "R0                                               nailati                                                ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09282");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("Azhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais cinese (cina)\\u0069h..France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzh", "zhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozho");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Azhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais cinese (cina)\\u0069h..France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzh" + "'", str2, "Azhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais cinese (cina)\\u0069h..France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzh");
    }

    @Test
    public void test09283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09283");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("ENGLISCH", (int) 'e');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ENGLISCH" + "'", str2, "ENGLISCH");
    }

    @Test
    public void test09284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09284");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("", "44                                                                                               en44", (int) 'D');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09285");
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
        java.lang.String str10 = locale3.getDisplayName();
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "italiano (Italia)" + "'", str10, "italiano (Italia)");
    }

    @Test
    public void test09286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09286");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "ECANADAgCANADACANADAsh                                                                                                  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09287");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("\\u0075", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u0075" + "'", str2, "\\u0075");
    }

    @Test
    public void test09288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09288");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("cccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc", "UND");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test09289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09289");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rfr-CA\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r", 49);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r" + "'", str2, "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r");
    }

    @Test
    public void test09290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09290");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.util.Set<java.lang.Character> charSet1 = locale0.getExtensionKeys();
        java.lang.String str2 = locale0.getVariant();
        java.lang.String str3 = locale0.getDisplayName();
        java.lang.String str4 = locale0.getDisplayLanguage();
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByCharacterType("ixii");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray6);
        boolean boolean8 = locale0.equals((java.lang.Object) strArray7);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertNotNull(charSet1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "italiano" + "'", str3, "italiano");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "italiano" + "'", str4, "italiano");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test09291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09291");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfAny("EFrankreichgFrankreichFrankreichsh", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09292");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "                                             hcstued");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09293");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "Franz\366sisc", (java.lang.CharSequence) "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCcinese (cina)\\u0069h..CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 117 + "'", int2 == 117);
    }

    @Test
    public void test09294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09294");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("ffffffffffffffffffffffffffffffffFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAfffffffffffffffffffffffffffffffff", "tedesco");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "tedesco" + "'", str2, "tedesco");
    }

    @Test
    public void test09295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09295");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("hi!       allemandtalienischallemanditalian_TALAN_Eng    \\     ADAEAFAGAALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCCKCLCMCNCOCRCUCVCWCXCYCZDED...allemand\\u0034allemandH!allemandtalianallemand\\u0061allemand\\u0023allemandhi!allemandiTALANallemandChinese (China)allemandhi!allemandzh_CNallemandiTALANallemandenallemandtalienisch", 2, 73);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!       allemandtalienischallemanditalian_TALAN_Eng    \\     ADAEAFAGAALA" + "'", str3, "!       allemandtalienischallemanditalian_TALAN_Eng    \\     ADAEAFAGAALA");
    }

    @Test
    public void test09296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09296");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "FRA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "FRA" + "'", str1, "FRA");
    }

    @Test
    public void test09297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09297");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("nglish (United Kingdom)", "french (NC_HZ)", (int) 'd', 117);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nglish (United Kingdom)french (NC_HZ)" + "'", str4, "nglish (United Kingdom)french (NC_HZ)");
    }

    @Test
    public void test09298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09298");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = java.util.Locale.UK;
        java.util.Locale.Builder builder3 = builder0.setLocale(locale2);
        java.util.Locale locale5 = java.util.Locale.forLanguageTag("\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITAL");
        java.util.Locale.Builder builder6 = builder0.setLocale(locale5);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder6.setVariant("I\\U0020ITALIANITALIANITALIANITALIIT");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: I\\U0020ITALIANITALIANITALIANITALIIT [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en_GB");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test09299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09299");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("Italian");
        java.util.Locale.Builder builder4 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder0.clear();
        java.util.Locale locale7 = java.util.Locale.forLanguageTag("\\u0020");
        java.util.Locale.Builder builder8 = builder0.setLocale(locale7);
        java.util.Locale.Builder builder9 = builder8.clear();
        java.util.Locale.Builder builder10 = builder9.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder10.removeUnicodeLocaleAttribute("harzhaszhazhzhzhzhzhzhzhzhzhz");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: harzhaszhazhzhzhzhzhzhzhzhzhz [at index 0]");
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
    public void test09300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09300");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzHSXLGNE_NAILATI_NAXLATX\\zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz", 73);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzHSXLGNE_NAILATI_NAXLATX\\zzzzz..." + "'", str2, "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzHSXLGNE_NAILATI_NAXLATX\\zzzzz...");
    }

    @Test
    public void test09301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09301");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("NC_hz\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r", "                                                                                         fr-");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NC_hz\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r" + "'", str2, "NC_hz\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r");
    }

    @Test
    public void test09302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09302");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiNumeric('t');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09303");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("", "                                       \\u0020iTALIANiTALIANiTALIANiTALI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09304");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("                                       k");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                       K" + "'", str1, "                                       K");
    }

    @Test
    public void test09305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09305");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("\\U0020IiTALIAN\\U0020I", 55, 16);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test09306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09306");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("it                   ", strMap1);
        java.util.Locale.LanguageRange[] languageRangeArray3 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList4 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList4, languageRangeArray3);
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        java.util.Locale.FilteringMode filteringMode11 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList12 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.lang.String>) strList9, filteringMode11);
        java.lang.String[] strArray32 = new java.lang.String[] { "hi!       ", "Italienisch", "italian_ITALIAN_English", "HI!", "hi!", "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...", "\\u0034", "HI!", "Italian", "\\u0061", "\\u0023", "hi!", "iTALIAN", "Chinese (China)", "hi!", "zh_CN", "iTALIAN", "en", "Italienisch" };
        java.util.ArrayList<java.lang.String> strList33 = new java.util.ArrayList<java.lang.String>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList33, strArray32);
        java.util.Locale.LanguageRange[] languageRangeArray35 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList36 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList36, languageRangeArray35);
        java.lang.String[] strArray40 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList41 = new java.util.ArrayList<java.lang.String>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList41, strArray40);
        java.util.Locale.FilteringMode filteringMode43 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList44 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList36, (java.util.Collection<java.lang.String>) strList41, filteringMode43);
        java.util.List<java.lang.String> strList45 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.lang.String>) strList33, filteringMode43);
        java.util.Locale.FilteringMode filteringMode46 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList47 = java.util.Locale.filterTags(languageRangeList2, (java.util.Collection<java.lang.String>) strList33, filteringMode46);
        java.lang.String str49 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strList47, "                                                                                           U0020");
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + filteringMode11 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode11.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(languageRangeArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + filteringMode43 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode43.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList44);
        org.junit.Assert.assertNotNull(strList45);
        org.junit.Assert.assertTrue("'" + filteringMode46 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode46.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList47);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
    }

    @Test
    public void test09307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09307");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('c', 7);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
    }

    @Test
    public void test09308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09308");
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
            java.util.Locale.Builder builder13 = builder8.setUnicodeLocaleKeyword("\\u0020italianitalianitalianitali\\u0020italianitalianitalianital", "English                                 (                United                                 Kingdom                )");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: \\u0020italianitalianitalianitali\\u0020italianitalianitalianital [at index 0]");
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
    public void test09309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09309");
        char[] charArray5 = new char[] { ' ' };
        boolean boolean6 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!", charArray5);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsAny("                                                                                                    ", charArray5);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "cinese (Cina)\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hh", charArray5);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsAny("it", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ ]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test09310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09310");
        java.lang.String str1 = org.apache.commons.lang3.CharUtils.unicodeEscaped('N');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u004e" + "'", str1, "\\u004e");
    }

    @Test
    public void test09311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09311");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("             hcsineilatI             ", "########################################################################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09312");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("Korean");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09313");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("Italian");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder3.setLanguageTag("Chinesischitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoit");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: Chinesischitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoit [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test09314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09314");
        java.util.Locale locale3 = new java.util.Locale("HI!       ", "\\U0020", "Italienisch#########################################################################################");
        java.util.Locale locale4 = locale3.stripExtensions();
        java.util.Locale locale5 = locale4.stripExtensions();
        java.lang.String str6 = locale4.toLanguageTag();
        java.util.Locale locale8 = new java.util.Locale("en");
        boolean boolean9 = locale8.hasExtensions();
        java.util.Set<java.lang.String> strSet10 = locale8.getUnicodeLocaleKeys();
        java.lang.String str11 = locale4.getDisplayName(locale8);
        java.lang.String str12 = locale8.toString();
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "en" + "'", str12, "en");
    }

    @Test
    public void test09315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09315");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("cHN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "cHN" + "'", str1, "cHN");
    }

    @Test
    public void test09316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09316");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("francese (Canada)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=francese (canada)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09317");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.GERMAN;
        java.util.Locale locale3 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str4 = locale2.getDisplayName(locale3);
        java.util.Locale.setDefault(category0, locale3);
        java.util.Locale locale6 = java.util.Locale.getDefault(category0);
        java.util.Locale locale7 = java.util.Locale.getDefault(category0);
        java.lang.Object obj8 = locale7.clone();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "allemand" + "'", str4, "allemand");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "fr_CA");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "fr_CA");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "fr_CA");
    }

    @Test
    public void test09318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09318");
        java.util.Locale locale0 = java.util.Locale.US;
        java.lang.String str1 = locale0.getScript();
        java.util.Set<java.lang.String> strSet2 = locale0.getUnicodeLocaleAttributes();
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet2, "allemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemand");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet2, "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rz...\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rFrn");
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test09319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09319");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "CCCC\\CCCCC");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test09320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09320");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("...ANiTALI", "hi!        Italienisch italian_ITALIAN_English HI! hi! ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED... \\u0034 HI! Italian \\u0061 \\u0023 hi! iTALIAN Chinese (China) hi! zh_CN iTALIAN en Italienisch");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09321");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder5 = builder1.clearExtensions();
        java.util.Locale.Builder builder6 = builder1.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder6.setUnicodeLocaleKeyword("R0                                               nailati             ", "IIIIIIIII");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: R0                                               nailati              [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "francese (Canada)" + "'", str3, "francese (Canada)");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test09322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09322");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '4', (int) 'G');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test09323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09323");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "000000000000000000000000000000000000000000000000000000000000000CCCC\\CCCC");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "000000000000000000000000000000000000000000000000000000000000000CCCC\\CCCC" + "'", str1, "000000000000000000000000000000000000000000000000000000000000000CCCC\\CCCC");
    }

    @Test
    public void test09324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09324");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder14 = builder12.setLanguageTag("b");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: b [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "cinese (Cina)" + "'", str5, "cinese (Cina)");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test09325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09325");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("ko-KR", "francia");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test09326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09326");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("\\", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test09327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09327");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("", (int) 'C', 15);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test09328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09328");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("IIIIIIIII", 65);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "IIIIIIIII" + "'", str2, "IIIIIIIII");
    }

    @Test
    public void test09329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09329");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("hi!(\\U0020,Italienisch#########################################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!(\\U0020,Italienisch#########################################################################################" + "'", str1, "hi!(\\U0020,Italienisch#########################################################################################");
    }

    @Test
    public void test09330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09330");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("", 8);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09331");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("Italian", "IAN\\U0020I");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09332");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("\\U0020", (int) 'A', 35);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test09333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09333");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "nglisch");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09334");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("anglais (Canada)CHINESE", "IAN_Englishallem");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "anglais (Canada)CHINESE" + "'", str2, "anglais (Canada)CHINESE");
    }

    @Test
    public void test09335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09335");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEnglischCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test09336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09336");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("FRANZ\366SISCH", "\ud55c\uad6d\uc5b4\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09337");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("!ih!ih!ih!ih!ih!ih!ih!ih!ih!ihtedesco    !ih!ih!ih!ih!ih!ih!iJapanese");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IHTEDESCO    !IH!IH!IH!IH!IH!IH!IjAPANESE" + "'", str1, "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IHTEDESCO    !IH!IH!IH!IH!IH!IH!IjAPANESE");
    }

    @Test
    public void test09338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09338");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("ko-KR                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ko-KR                                                                                                   " + "'", str1, "ko-KR                                                                                                   ");
    }

    @Test
    public void test09339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09339");
        java.lang.String str1 = org.apache.commons.lang3.CharUtils.unicodeEscaped('D');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u0044" + "'", str1, "\\u0044");
    }

    @Test
    public void test09340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09340");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("FRZ\326CZ(FRKREC)", "ita", "English                                 (                United                                 Kingdom                )");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test09341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09341");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("italian (italian,englcor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351", (int) 'f', 151);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\351encor\351encor\351encor\351" + "'", str3, "\351encor\351encor\351encor\351");
    }

    @Test
    public void test09342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09342");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "                              4444ALLEMAND                              4444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09343");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("4", '0');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4" + "'", str2, "4");
    }

    @Test
    public void test09344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09344");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("n", 9);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "n" + "'", str2, "n");
    }

    @Test
    public void test09345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09345");
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
            java.util.Locale.Builder builder11 = builder7.setVariant("italian (italian,engl");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: italian (italian,engl [at index 0]");
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
    }

    @Test
    public void test09346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09346");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("ko-KR                                                                                                   ", "\uc774\ud0c8\ub9ac\uc544\uc5b4");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ko-KR                                                                                                   " + "'", str2, "ko-KR                                                                                                   ");
    }

    @Test
    public void test09347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09347");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("English", "Italian");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "             HCSINEILATI             ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "E             HCSINEILATI             g             HCSINEILATI                          HCSINEILATI             sh" + "'", str6, "E             HCSINEILATI             g             HCSINEILATI                          HCSINEILATI             sh");
    }

    @Test
    public void test09348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09348");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("...!       \\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...! \\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\" + "'", str1, "...! \\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\");
    }

    @Test
    public void test09349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09349");
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
        java.lang.String str41 = locale34.getDisplayCountry();
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
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "English" + "'", str35, "English");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "!IH" + "'", str36, "!IH");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
    }

    @Test
    public void test09350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09350");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("                                                                                           U0020ITALIANITALIANITALIANITALI", "CCCC\\CCCCC                                                             ", (int) ')');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09351");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("44444444444444444444444444444444", ' ');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '4' + "'", char2 == '4');
    }

    @Test
    public void test09352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09352");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("RA", (int) '.', "8300u\\");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "8300u\\8300u\\8300u\\8300u\\8300u\\8300u\\8300u\\83RA" + "'", str3, "8300u\\8300u\\8300u\\8300u\\8300u\\8300u\\8300u\\83RA");
    }

    @Test
    public void test09353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09353");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I", "                                                         \\u0046                                                         ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                         \\u0046                                                         " + "'", str2, "                                                         \\u0046                                                         ");
    }

    @Test
    public void test09354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09354");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("\\\\\\\\\\\\\\\\\\                                  !ih                            tal                                  !ih                            an_ITALIAN_Engl                                  !ih                            sh", "CCCCCCCCCCCCCanglais (CanadaCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test09355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09355");
        java.lang.String str1 = org.apache.commons.lang3.CharUtils.toString('I');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "I" + "'", str1, "I");
    }

    @Test
    public void test09356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09356");
        java.lang.String[] strArray3 = java.util.Locale.getISOCountries();
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.endsWithAny("CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC\\u00de\\u00CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC", strArray5);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.startsWithAny("e                               ", strArray5);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.endsWithAny("\\u0038", strArray5);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZW" + "'", str6, "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZW");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test09357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09357");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\\u0034\\u00                                             hcstuD                                             \\u0034\\u00", "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rZH_cn", 49);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concatWith("!ih                            dalleman", (java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\\u0034\\u00                                             h!ih                            dallemanstuD                                             \\u0034\\u00" + "'", str5, "\\u0034\\u00                                             h!ih                            dallemanstuD                                             \\u0034\\u00");
    }

    @Test
    public void test09358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09358");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAeeeeeeeeeeeex", 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '0', (int) 'E', 116);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 69");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test09359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09359");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('C', (int) 'i');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 105 + "'", int2 == 105);
    }

    @Test
    public void test09360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09360");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("\\U0020", "allemand");
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny("\\U0020", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.concatWith("ITALIAN", (java.lang.Object[]) strArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray5);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.startsWithAny("", strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\\U0020" + "'", str7, "\\U0020");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\U0020" + "'", str8, "\\U0020");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\\U0020" + "'", str9, "\\U0020");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test09361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09361");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("ANGLAIS (ROYAUME-UNI)FRA", "             FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA             FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA             FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA             FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA23", (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09362");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("         HITALIANH_HitalianH_HeHNGLISH", '.');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "         HITALIANH_HitalianH_HeHNGLISH" + "'", str2, "         HITALIANH_HitalianH_HeHNGLISH");
    }

    @Test
    public void test09363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09363");
        java.util.Locale locale1 = new java.util.Locale("hi!       ");
        java.util.Locale locale2 = java.util.Locale.CANADA;
        java.lang.String str3 = locale1.getDisplayName(locale2);
        java.util.Locale locale4 = java.util.Locale.ITALIAN;
        java.lang.String str5 = locale4.getDisplayLanguage();
        java.util.Locale locale6 = locale4.stripExtensions();
        java.lang.String str7 = locale4.getLanguage();
        java.lang.String str8 = locale4.getISO3Language();
        java.util.Set<java.lang.String> strSet9 = locale4.getUnicodeLocaleKeys();
        java.lang.String str10 = locale2.getDisplayCountry(locale4);
        java.lang.String str11 = locale2.getLanguage();
        org.junit.Assert.assertEquals(locale1.toString(), "hi!       ");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!       " + "'", str3, "hi!       ");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "it");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Italian" + "'", str5, "Italian");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "it");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "it" + "'", str7, "it");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ita" + "'", str8, "ita");
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Canada" + "'", str10, "Canada");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "en" + "'", str11, "en");
    }

    @Test
    public void test09364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09364");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("\\U0020I...", 101);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09365");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("Franz\366sischFranzosisch (Frankreich)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "FRANZ\326SISCHFRANZOSISCH (FRANKREICH)" + "'", str1, "FRANZ\326SISCHFRANZOSISCH (FRANKREICH)");
    }

    @Test
    public void test09366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09366");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("                                  \\u005c                                                         ", 103, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test09367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09367");
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
            java.util.Locale.Builder builder15 = builder13.setLanguage("franz\366sisch(frankreich)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: franzo?sisch(frankreich) [at index 0]");
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
    public void test09368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09368");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("AD4AE4AF4AG4AI4AL4AM4AN4AO4AQ4AR4AS4AT4AU4AW4AX4AZ4BA4BB4BD4BE4BF4BG4BH4BI4BJ4BL4BM4BN4BO4BQ4BR4BS4BT4BV4BW4BY4BZ4CA4CC4CD4CF4CG4CH4CI4CK4CL4CM4CN4CO4CR4CU4CV4CW4CX4CY4CZ4DE4DJ4DK4DM4DO4DZ4EC4EE4EG4EH4ER4ES4ET4FI4FJ4FK4FM4FO4FR4GA4GB4GD4GE4GF4GG4GH4GI4GL4GM4GN4GP4GQ4GR4GS4GT4GU4GW4GY4HK4HM4HN4HR4HT4HU4ID4IE4IL4IM4IN4IO4IQ4IR4IS4IT4JE4JM4JO4JP4KE4KG4KH4KI4KM4KN4KP4KR4KW4KY4KZ4LA4LB4LC4LI4LK4LR4LS4LT4LU4LV4LY4MA4MC4MD4ME4MF4MG4MH4MK4ML4MM4MN4MO4MP4MQ4MR4MS4MT4MU4MV4MW4MX4MY4MZ4NA4NC4NE4NF4NG4NI4NL4NO4NP4NR4NU4NZ4OM4PA4PE4PF4PG4PH4PK4PL4PM4PN4PR4PS4PT4PW4PY4QA4RE4RO4RS4RU4RW4SA4SB4SC4SD4SE4SG4SH4SI4SJ4SK4SL4SM4SN4SO4SR4SS4ST4SV4SX4SY4SZ4TC4TD4TF4TG4TH4TJ4TK4TL4TM4TN4TO4TR4TT4TV4TW4TZ4UA4UG4UM4US4UY4UZ4VA4VC4VE4VG4VI4VN4VU4WF4WS4YE4YT4ZA4ZM4ZW");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AD4AE4AF4AG4AI4AL4AM4AN4AO4AQ4AR4AS4AT4AU4AW4AX4AZ4BA4BB4BD4BE4BF4BG4BH4BI4BJ4BL4BM4BN4BO4BQ4BR4BS4BT4BV4BW4BY4BZ4CA4CC4CD4CF4CG4CH4CI4CK4CL4CM4CN4CO4CR4CU4CV4CW4CX4CY4CZ4DE4DJ4DK4DM4DO4DZ4EC4EE4EG4EH4ER4ES4ET4FI4FJ4FK4FM4FO4FR4GA4GB4GD4GE4GF4GG4GH4GI4GL4GM4GN4GP4GQ4GR4GS4GT4GU4GW4GY4HK4HM4HN4HR4HT4HU4ID4IE4IL4IM4IN4IO4IQ4IR4IS4IT4JE4JM4JO4JP4KE4KG4KH4KI4KM4KN4KP4KR4KW4KY4KZ4LA4LB4LC4LI4LK4LR4LS4LT4LU4LV4LY4MA4MC4MD4ME4MF4MG4MH4MK4ML4MM4MN4MO4MP4MQ4MR4MS4MT4MU4MV4MW4MX4MY4MZ4NA4NC4NE4NF4NG4NI4NL4NO4NP4NR4NU4NZ4OM4PA4PE4PF4PG4PH4PK4PL4PM4PN4PR4PS4PT4PW4PY4QA4RE4RO4RS4RU4RW4SA4SB4SC4SD4SE4SG4SH4SI4SJ4SK4SL4SM4SN4SO4SR4SS4ST4SV4SX4SY4SZ4TC4TD4TF4TG4TH4TJ4TK4TL4TM4TN4TO4TR4TT4TV4TW4TZ4UA4UG4UM4US4UY4UZ4VA4VC4VE4VG4VI4VN4VU4WF4WS4YE4YT4ZA4ZM4Z" + "'", str1, "AD4AE4AF4AG4AI4AL4AM4AN4AO4AQ4AR4AS4AT4AU4AW4AX4AZ4BA4BB4BD4BE4BF4BG4BH4BI4BJ4BL4BM4BN4BO4BQ4BR4BS4BT4BV4BW4BY4BZ4CA4CC4CD4CF4CG4CH4CI4CK4CL4CM4CN4CO4CR4CU4CV4CW4CX4CY4CZ4DE4DJ4DK4DM4DO4DZ4EC4EE4EG4EH4ER4ES4ET4FI4FJ4FK4FM4FO4FR4GA4GB4GD4GE4GF4GG4GH4GI4GL4GM4GN4GP4GQ4GR4GS4GT4GU4GW4GY4HK4HM4HN4HR4HT4HU4ID4IE4IL4IM4IN4IO4IQ4IR4IS4IT4JE4JM4JO4JP4KE4KG4KH4KI4KM4KN4KP4KR4KW4KY4KZ4LA4LB4LC4LI4LK4LR4LS4LT4LU4LV4LY4MA4MC4MD4ME4MF4MG4MH4MK4ML4MM4MN4MO4MP4MQ4MR4MS4MT4MU4MV4MW4MX4MY4MZ4NA4NC4NE4NF4NG4NI4NL4NO4NP4NR4NU4NZ4OM4PA4PE4PF4PG4PH4PK4PL4PM4PN4PR4PS4PT4PW4PY4QA4RE4RO4RS4RU4RW4SA4SB4SC4SD4SE4SG4SH4SI4SJ4SK4SL4SM4SN4SO4SR4SS4ST4SV4SX4SY4SZ4TC4TD4TF4TG4TH4TJ4TK4TL4TM4TN4TO4TR4TT4TV4TW4TZ4UA4UG4UM4US4UY4UZ4VA4VC4VE4VG4VI4VN4VU4WF4WS4YE4YT4ZA4ZM4Z");
    }

    @Test
    public void test09369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09369");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "FRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFR", "Hhhhhhhhh");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09370");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("\n", "nglish (united kingdom)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09371");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("", "USA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09372");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("", "##################    \\XTALXAN_ITALIAN_ENGLXSH    ###################", "\ub3c5\uc77c\uc5b4", 40);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test09373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09373");
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
            java.util.Locale.Builder builder20 = builder16.setLanguageTag("             FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA             FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA             FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA             FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA23");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag:              FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA             FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA             FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA             FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA23 [at index 0]");
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
    public void test09374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09374");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'a', 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test09375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09375");
        java.util.Locale locale1 = java.util.Locale.ENGLISH;
        java.lang.String str2 = locale1.getDisplayLanguage();
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.upperCase("!IH", locale1);
        java.lang.String str5 = locale1.getExtension('x');
        java.lang.String str6 = locale1.getDisplayVariant();
        java.lang.String str7 = locale1.getCountry();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "English" + "'", str2, "English");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!IH" + "'", str3, "!IH");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test09376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09376");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("itTAiT_ITALIAN_EgAish", "bgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgtalian");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "TAiT_ITALIAN_EgAish" + "'", str2, "TAiT_ITALIAN_EgAish");
    }

    @Test
    public void test09377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09377");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("It_I");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "It_" + "'", str1, "It_");
    }

    @Test
    public void test09378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09378");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiCHN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiCHN" + "'", str1, "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiCHN");
    }

    @Test
    public void test09379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09379");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("ANGLAIS (ROYAUME-UNI)", "\\u005c");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09380");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("2iT hi!       _\\U0020_Italienisch####################################################################            2i", "eagaash                                                                                                                                                                                                                                                                                                                                                                                                    ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test09381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09381");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("cor\351en (Cor\351e du Sud)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "cor\351en (Cor\351e du Sud)" + "'", str1, "cor\351en (Cor\351e du Sud)");
    }

    @Test
    public void test09382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09382");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("Italian");
        java.util.Locale locale4 = builder3.build();
        java.util.Locale.Builder builder7 = builder3.setExtension('E', "DEUTSCH");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder3.setRegion("Deutscd");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: Deutscd [at index 0]");
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
    public void test09383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09383");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "Hhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09384");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "hi!       allemandItalienischallemanditalian_ITALIAN_EnglishallemandHI!allemandhi!allemandADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...allemand\\u0034allemandHI!allemandItalianallemand\\u0061allemand\\u0023allemandhi!allemandiTALIANallemandChinese (China)allemandhi!allemandzh_CNallemandiTALIANallemandenallemandItalienisch", (java.lang.CharSequence) "                              DE_DE                              ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test09385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09385");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("E44444444444444444444444444444444!IHg44444444444444444444444444444444!IH44444444444444444444444444444444!IHs");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=e44444444444444444444444444444444!ihg44444444444444444444444444444444!ih44444444444444444444444444444444!ihs");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09386");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "             DE_DE            ", (java.lang.CharSequence) "TALIAN_ITALIAN_ENGLISH         ITAL");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 25 + "'", int2 == 25);
    }

    @Test
    public void test09387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09387");
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
        java.lang.Class<?> wildcardClass18 = locale8.getClass();
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "English" + "'", str9, "English");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "!IH" + "'", str10, "!IH");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "en");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test09388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09388");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "    IIIIIIIIII");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09389");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZW", '\r');
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("cinese (Cina)\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hh", strArray3);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test09390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09390");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Chinesisch", "GBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGTALIAN", 997);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test09391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09391");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("gence", "hi!allemandItalienischallemanditalian_ITALIAN_EnglishallemandHI!allemandhi!allemandADAEAFAGAIA...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09392");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "\\u0065", (java.lang.CharSequence) "...EnglishEn");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test09393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09393");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("2E             giTALIANiTALIANi", "fr-CAfr-CAfr-CAfr-CAfr-CAfr-CAfr-CAfr-CAfr-CAfr-CAfr-CAfr\\u000dfr-CAfr-CAfr-CAfr-CAfr-CAfr-CAfr-CAfr-CAfr-CAfr-CAfr-CAfr", "\ud55c\uad6d\uc5b4\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test09394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09394");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("...\r\r\r\r\r\r\r\r...", 45);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09395");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("\\u0034\\u00                                             hcstuD                                             \\u0034\\u00", "C");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test09396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09396");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("            zhzhzhzhzhzhzhzhzhzhFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAzhzhzhzhzhzhzhzhzhzh", "!_\\u0020_iTLE#####################################!_\\u0020_iTLE######################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "            zhzhzhzhzhzhzhzhzhzhFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAzhzhzhzhzhzhzhzhzhzh" + "'", str2, "            zhzhzhzhzhzhzhzhzhzhFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAzhzhzhzhzhzhzhzhzhzh");
    }

    @Test
    public void test09397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09397");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "fr_FR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "fr_FR" + "'", str1, "fr_FR");
    }

    @Test
    public void test09398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09398");
        java.util.Locale locale1 = new java.util.Locale("FranzosischFranz\366sisch (Kanada)(Frankreich)");
        org.junit.Assert.assertEquals(locale1.toString(), "franzosischfranz\366sisch (kanada)(frankreich)");
    }

    @Test
    public void test09399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09399");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("anihC");
        double double2 = languageRange1.getWeight();
        char[] charArray15 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray15);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "iTALIAN", charArray15);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "it", charArray15);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "h", charArray15);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsAny("\\u0020iTALIANiTALIANiTALIANiTALI\\u0020iTALIANiTALIANiTALIANiTAL", charArray15);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "G", charArray15);
        boolean boolean22 = languageRange1.equals((java.lang.Object) "G");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "4##a a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "4##a a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[4, #, #, a,  , a]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test09400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09400");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) 't', 'F');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 't' + "'", char2 == 't');
    }

    @Test
    public void test09401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09401");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "\351encor\351encor\351encor\351");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test09402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09402");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) 'a', 'A');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'a' + "'", char2 == 'a');
    }

    @Test
    public void test09403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09403");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("\\U0020I...", "aDAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test09404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09404");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("\uc911\uad6d\uc5b4\uc911\uad6d)", "italian_ITALIAN_English", "Italienisch");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test09405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09405");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=fraadzhaezhafzhagzhaizhalzhamzhanzhaozhaqzharzhaszhaeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09406");
        java.util.Locale locale1 = new java.util.Locale("\\u0068");
        boolean boolean2 = locale1.hasExtensions();
        java.util.Locale locale5 = new java.util.Locale("!IH", "Hhhhhhhhhh");
        java.lang.String str6 = locale5.getDisplayLanguage();
        java.lang.String str7 = locale1.getDisplayName(locale5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = locale1.getUnicodeLocaleType("Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: Frnzo?sisch (Knd)Frnzo?sisch (Knd)Frnzo?sisch (Knd)Frnzo?sisch (Knd)Frnzo?sisch (Knd)Frnzo?sisch (Knd)Frnzo?sisch (Knd)Frnzo?sisch (Knd)Frnzo?sisch (Knd)Frnzo?sisch (Knd)Frnzo?sisch (Knd)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale1.toString(), "\\u0068");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals(locale5.toString(), "!ih_HHHHHHHHHH");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "!ih" + "'", str6, "!ih");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\\u0068" + "'", str7, "\\u0068");
    }

    @Test
    public void test09407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09407");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("                                                               \\U002", "             DE_DE            uuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09408");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("          HI!           ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test09409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09409");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("...! \\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\", (int) 'R');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...! \\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\                      " + "'", str2, "...! \\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\                      ");
    }

    @Test
    public void test09410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09410");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rHI!\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09411");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf(" italian  ", "italie", (int) 'i');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09412");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
    }

    @Test
    public void test09413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09413");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("             hcsineilatI             dddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test09414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09414");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("ADAAEAAFAAGAAIAALAAMAANAAOAAQAARAASAATAAUAAWAAXAAZABAABBABDABEABFABGABHABIABJABLABMABNABOABQABRABSABTABVABWABYABZACAACCACDACFACGACHACIACKACLACMACNACOACRACUACVACWACXACYACZADEADJADKADMADOADZAECAEEAEGAEHAERAESAETAFIAFJAFKAFMAFOAFRAGAAGBAGDAGEAGFAGGAGHAGIAGLAGMAGNAGPAGQAGRAGSAGTAGUAGWAGYAHKAHMAHNAHRAHTAHUAIDAIEAILAIMAINAIOAIQAIRAISAITAJEAJMAJOAJPAKEAKGAKHAKIAKMAKNAKPAKRAKWAKYAKZALAALBALCALIALKALRALSALTALUALVALYAMAAMCAMDAMEAMFAMGAMHAMKAMLAMMAMNAMOAMPAMQAMRAMSAMTAMUAMVAMWAMXAMYAMZANAANCANEANFANGANIANLANOANPANRANUANZAOMAPAAPEAPFAPGAPHAPKAPLAPMAPNAPRAPSAPTAPWAPYAQAAREAROARSARUARWASAASBASCASDASEASGASHASIASJASKASLASMASNASOASRASSASTASVASXASYASZATCATDATFATGATHATJATKATLATMATNATOATRATTATVATWATZAUAAUGAUMAUSAUYAUZAVAAVCAVEAVGAVIAVNAVUAWFAWSAYEAYTAZAAZMAZW", "hcstueD", (int) 'U', (int) '8');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ADAAEAAFAAGAAIAALAAMAANAAOAAQAARAASAATAAUAAWAAXAAZABAABBhcstueDNABOABQABRABSABTABVABWABYABZACAACCACDACFACGACHACIACKACLACMACNACOACRACUACVACWACXACYACZADEADJADKADMADOADZAECAEEAEGAEHAERAESAETAFIAFJAFKAFMAFOAFRAGAAGBAGDAGEAGFAGGAGHAGIAGLAGMAGNAGPAGQAGRAGSAGTAGUAGWAGYAHKAHMAHNAHRAHTAHUAIDAIEAILAIMAINAIOAIQAIRAISAITAJEAJMAJOAJPAKEAKGAKHAKIAKMAKNAKPAKRAKWAKYAKZALAALBALCALIALKALRALSALTALUALVALYAMAAMCAMDAMEAMFAMGAMHAMKAMLAMMAMNAMOAMPAMQAMRAMSAMTAMUAMVAMWAMXAMYAMZANAANCANEANFANGANIANLANOANPANRANUANZAOMAPAAPEAPFAPGAPHAPKAPLAPMAPNAPRAPSAPTAPWAPYAQAAREAROARSARUARWASAASBASCASDASEASGASHASIASJASKASLASMASNASOASRASSASTASVASXASYASZATCATDATFATGATHATJATKATLATMATNATOATRATTATVATWATZAUAAUGAUMAUSAUYAUZAVAAVCAVEAVGAVIAVNAVUAWFAWSAYEAYTAZAAZMAZW" + "'", str4, "ADAAEAAFAAGAAIAALAAMAANAAOAAQAARAASAATAAUAAWAAXAAZABAABBhcstueDNABOABQABRABSABTABVABWABYABZACAACCACDACFACGACHACIACKACLACMACNACOACRACUACVACWACXACYACZADEADJADKADMADOADZAECAEEAEGAEHAERAESAETAFIAFJAFKAFMAFOAFRAGAAGBAGDAGEAGFAGGAGHAGIAGLAGMAGNAGPAGQAGRAGSAGTAGUAGWAGYAHKAHMAHNAHRAHTAHUAIDAIEAILAIMAINAIOAIQAIRAISAITAJEAJMAJOAJPAKEAKGAKHAKIAKMAKNAKPAKRAKWAKYAKZALAALBALCALIALKALRALSALTALUALVALYAMAAMCAMDAMEAMFAMGAMHAMKAMLAMMAMNAMOAMPAMQAMRAMSAMTAMUAMVAMWAMXAMYAMZANAANCANEANFANGANIANLANOANPANRANUANZAOMAPAAPEAPFAPGAPHAPKAPLAPMAPNAPRAPSAPTAPWAPYAQAAREAROARSARUARWASAASBASCASDASEASGASHASIASJASKASLASMASNASOASRASSASTASVASXASYASZATCATDATFATGATHATJATKATLATMATNATOATRATTATVATWATZAUAAUGAUMAUSAUYAUZAVAAVCAVEAVGAVIAVNAVUAWFAWSAYEAYTAZAAZMAZW");
    }

    @Test
    public void test09415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09415");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "zhzhzhzhzhzhzhzhzhzhfraadzhaezhafzhagzhaizhalzhamzhanzhaozhaqzharzhaszhazhzhzhzhzhzhzhzhzhzh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09416");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("en-US");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "en-US" + "'", str1, "en-US");
    }

    @Test
    public void test09417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09417");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("", 71, 45);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09418");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rzh_CN");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09419");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("E");
        java.lang.String str2 = languageRange1.getRange();
        double double3 = languageRange1.getWeight();
        double double4 = languageRange1.getWeight();
        java.lang.String str5 = languageRange1.getRange();
        double double6 = languageRange1.getWeight();
        java.lang.String str7 = languageRange1.getRange();
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                               INGLESE                                ", "\\u007", 4);
        boolean boolean12 = languageRange1.equals((java.lang.Object) 4);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "e" + "'", str2, "e");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "e" + "'", str5, "e");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "e" + "'", str7, "e");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test09420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09420");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("en_C", 804, (int) 'N');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "en_C" + "'", str3, "en_C");
    }

    @Test
    public void test09421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09421");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("#", "HHHHHHHHH         ITALIAN_italian_eNGLISH         ITALIAN_!IHitTAiT_ITALIAN_EgAish", (int) ')');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09422");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("iFranzosisch ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "iFranzosisch" + "'", str1, "iFranzosisch");
    }

    @Test
    public void test09423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09423");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder3.clear();
        java.util.Locale.Builder builder5 = builder3.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder5.setUnicodeLocaleKeyword("...\r\r\r\r\r\r\r\r...", "HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: ...????????... [at index 0]");
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
    public void test09424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09424");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("b", "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu\\u0020", "Chinesisch (Ch");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "b" + "'", str3, "b");
    }

    @Test
    public void test09425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09425");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("Italian");
        java.util.Locale locale4 = builder3.build();
        java.util.Locale.Builder builder7 = builder3.setExtension('E', "DEUTSCH");
        java.util.Locale locale8 = builder3.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder3.setVariant("nglish (United Kingdom)french (NC_HZ)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: nglish (United Kingdom)french (NC_HZ) [at index 0]");
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
    }

    @Test
    public void test09426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09426");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("CCCC\\CCCCC                                                             ", "gERMAN (gERMANY)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CCCC\\CCCCC                                                             " + "'", str2, "CCCC\\CCCCC                                                             ");
    }

    @Test
    public void test09427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09427");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("", (double) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09428");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("2aiTALIANiTALIANiTALIANiTAL", 99, (int) 'E');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test09429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09429");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("                                                                                           U0020", (int) 'h');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                   U0020" + "'", str2, "                                                                                                   U0020");
    }

    @Test
    public void test09430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09430");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("ian\\u00208ian\\u0020i868ian\\u00");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test09431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09431");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("HI!HI!", "fra", 117);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.concatWith("hIAN\\U0020Ihi", (java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HI!HI!" + "'", str5, "HI!HI!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HI!HI!" + "'", str6, "HI!HI!");
    }

    @Test
    public void test09432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09432");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test09433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09433");
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
        java.lang.String str31 = locale19.getVariant();
        java.lang.String str32 = locale19.getLanguage();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str34 = locale19.getUnicodeLocaleType("44444444444444444444444444444444444444444444it                   ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: 44444444444444444444444444444444444444444444it                   ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "en" + "'", str32, "en");
    }

    @Test
    public void test09434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09434");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = locale12.getExtension('#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: #");
        } catch (java.lang.IllegalArgumentException e) {
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
    }

    @Test
    public void test09435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09435");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("\\\\\\\\\\\\\\\\\\                                  !ih                            tal                                  !ih                            an_ITALIAN_Engl                                  !ih                            sh", "German");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09436");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("!ih dalleman", 121);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                      !ih dalleman                                                       " + "'", str2, "                                                      !ih dalleman                                                       ");
    }

    @Test
    public void test09437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09437");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("DEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEU\\u0061", (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09438");
        java.util.Locale.Builder builder1 = new java.util.Locale.Builder();
        java.util.Locale locale2 = builder1.build();
        java.util.Locale locale4 = java.util.Locale.forLanguageTag("Italian");
        java.lang.String str5 = locale2.getDisplayLanguage(locale4);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.upperCase("", locale4);
        java.util.Locale locale7 = java.util.Locale.ITALIAN;
        java.lang.String str8 = locale7.getDisplayLanguage();
        java.util.Locale locale9 = locale7.stripExtensions();
        java.util.Locale locale11 = java.util.Locale.forLanguageTag("\\u0020");
        java.lang.String str12 = locale11.getDisplayScript();
        java.lang.String str13 = locale9.getDisplayCountry(locale11);
        java.util.Locale.Builder builder14 = new java.util.Locale.Builder();
        java.util.Locale locale15 = builder14.build();
        java.util.Locale locale17 = java.util.Locale.forLanguageTag("Italian");
        java.lang.String str18 = locale15.getDisplayLanguage(locale17);
        java.lang.String str19 = locale9.getDisplayLanguage(locale15);
        java.lang.Object obj20 = locale9.clone();
        boolean boolean21 = locale4.equals(obj20);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "italian");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "it");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Italian" + "'", str8, "Italian");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "it");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "italian");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Italian" + "'", str19, "Italian");
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "it");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "it");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "it");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test09439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09439");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) ")))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))iTALIAN");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09440");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("United Kingdom");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "United Kingdom" + "'", str1, "United Kingdom");
    }

    @Test
    public void test09441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09441");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("italieitalNC_hz\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\ritalieital", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\r\r\r\r\r\r\r\r\r\r\r\ritalieital" + "'", str2, "\r\r\r\r\r\r\r\r\r\r\r\ritalieital");
    }

    @Test
    public void test09442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09442");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('!', (int) '8');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 56 + "'", int2 == 56);
    }

    @Test
    public void test09443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09443");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "#########################################################################################eltI_0200U\\_!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09444");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!", "", (int) (short) 10);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, '4');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray5);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.split("\\U0020", "allemand");
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny("\\U0020", strArray12);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEach("", strArray5, strArray12);
        java.lang.String[] strArray16 = org.apache.commons.lang3.StringUtils.stripAll(strArray5, "Egsh");
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.concatWith("\\u0061ItalienischItalienischItalienischItalienischItalienischItalienischItalienischItalienischItalie", (java.lang.Object[]) strArray16);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "i!" + "'", str17, "i!");
    }

    @Test
    public void test09445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09445");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("itTAiT_ITALIAN_EgAish          ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=ittait_italian_egaish          ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09446");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "                                                     \\u005c         ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09447");
        java.lang.String[] strArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithAny("zhzhzhzhzhzhzhzhzhzhFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAzhzhzhzhzhzhzhzhzhzh", strArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09448");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("         ITALIAN_italian_eNGLISH         ITALIAN_!IHitTAiT_ITALIAN_EgAishE             g                          shE             g                          shE             g                          shE             g                          shE             g                          shE             g                          shE             g                          shE             g                 ");
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + ' ' + "'", char1 == ' ');
    }

    @Test
    public void test09449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09449");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("CCCCCCCCCCCCCanglais (CanadaCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC", "                                  !ih                            ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CCCCCCCCCCCCCanglais (CanadaCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC" + "'", str2, "CCCCCCCCCCCCCanglais (CanadaCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
    }

    @Test
    public void test09450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09450");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("fr-cafr-cafr-c8600u\\fr-cafr-cafr-ca", "\\u004e", "canad");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "fr-cafr-cafr-c8600u\\fr-cafr-cafr-ca" + "'", str3, "fr-cafr-cafr-c8600u\\fr-cafr-cafr-ca");
    }

    @Test
    public void test09451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09451");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("44444444444444ITALIAN44444444444444", 104);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09452");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.lang.String str1 = locale0.getDisplayLanguage();
        java.util.Locale locale2 = locale0.stripExtensions();
        java.lang.String str3 = locale0.getLanguage();
        java.lang.String str4 = locale0.getDisplayName();
        java.lang.String str5 = locale0.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Italian" + "'", str1, "Italian");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "it");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "it" + "'", str3, "it");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Italian" + "'", str4, "Italian");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "it" + "'", str5, "it");
    }

    @Test
    public void test09453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09453");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("FRAADZHAEZHAFZHAGZHAIZHALZHAMZHANZHAOZHAQZHARZHASZHAEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE", "\\\\\\\\\\\\\\HI!HI!", (int) '0');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09454");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("Chinesisch (Ch");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Chinesisch (Ch" + "'", str1, "Chinesisch (Ch");
    }

    @Test
    public void test09455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09455");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("und");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap2 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList3 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList1, strMap2);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap4 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList5 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList1, strMap4);
        java.util.Locale locale7 = java.util.Locale.forLanguageTag("hi!");
        java.lang.String str8 = locale7.getCountry();
        java.lang.String str9 = locale7.getDisplayVariant();
        java.lang.String str10 = locale7.getCountry();
        java.util.Set<java.lang.String> strSet11 = locale7.getUnicodeLocaleAttributes();
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet11, "!_\\U0020_Itle#########################################################################################");
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet11, 'n');
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap17 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList18 = java.util.Locale.LanguageRange.parse("nailati", strMap17);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap19 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList20 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList18, strMap19);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap21 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList22 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList18, strMap21);
        java.util.Locale locale24 = java.util.Locale.FRANCE;
        java.util.Locale locale25 = java.util.Locale.ITALIAN;
        java.lang.String str27 = locale25.getExtension('h');
        java.lang.String str28 = locale24.getDisplayScript(locale25);
        java.lang.String str29 = org.apache.commons.lang3.StringUtils.lowerCase("HI!       ", locale24);
        java.lang.String str30 = locale24.getDisplayLanguage();
        java.util.Set<java.lang.String> strSet31 = locale24.getUnicodeLocaleAttributes();
        java.util.Locale.LanguageRange languageRange33 = new java.util.Locale.LanguageRange("deutsch");
        java.util.Locale.LanguageRange languageRange35 = new java.util.Locale.LanguageRange("E");
        java.lang.String str36 = languageRange35.getRange();
        java.util.Locale.LanguageRange[] languageRangeArray37 = new java.util.Locale.LanguageRange[] { languageRange33, languageRange35 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList38 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList38, languageRangeArray37);
        java.util.Locale locale40 = java.util.Locale.ITALIAN;
        java.lang.String str41 = locale40.getDisplayLanguage();
        java.util.Locale locale42 = locale40.stripExtensions();
        java.lang.String str43 = locale40.getLanguage();
        java.util.Set<java.lang.String> strSet44 = locale40.getUnicodeLocaleKeys();
        java.lang.String str46 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet44, "\\u0020iTALIANiTALIANiTALIANiTALI\\u0020iTALIANiTALIANiTALIANiTAL");
        java.util.Locale.FilteringMode filteringMode47 = java.util.Locale.FilteringMode.EXTENDED_FILTERING;
        java.util.List<java.lang.String> strList48 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList38, (java.util.Collection<java.lang.String>) strSet44, filteringMode47);
        java.util.List<java.lang.String> strList49 = java.util.Locale.filterTags(languageRangeList22, (java.util.Collection<java.lang.String>) strSet31, filteringMode47);
        java.util.List<java.lang.String> strList50 = java.util.Locale.filterTags(languageRangeList1, (java.util.Collection<java.lang.String>) strSet11, filteringMode47);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap51 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList52 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList1, strMap51);
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(languageRangeList3);
        org.junit.Assert.assertNotNull(languageRangeList5);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(languageRangeList18);
        org.junit.Assert.assertNotNull(languageRangeList20);
        org.junit.Assert.assertNotNull(languageRangeList22);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "it");
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!       " + "'", str29, "hi!       ");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "French" + "'", str30, "French");
        org.junit.Assert.assertNotNull(strSet31);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "e" + "'", str36, "e");
        org.junit.Assert.assertNotNull(languageRangeArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "it");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Italian" + "'", str41, "Italian");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "it");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "it" + "'", str43, "it");
        org.junit.Assert.assertNotNull(strSet44);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertTrue("'" + filteringMode47 + "' != '" + java.util.Locale.FilteringMode.EXTENDED_FILTERING + "'", filteringMode47.equals(java.util.Locale.FilteringMode.EXTENDED_FILTERING));
        org.junit.Assert.assertNotNull(strList48);
        org.junit.Assert.assertNotNull(strList49);
        org.junit.Assert.assertNotNull(strList50);
        org.junit.Assert.assertNotNull(languageRangeList52);
    }

    @Test
    public void test09456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09456");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("         ITALIAN_italian_eNGLISH         ITALIAN_!IHitTAiT_ITALIAN_EgAishE             g                          shE             g                          shE             g                          shE             g                          shE             g                          shE             g                          shE             g                          shE             g                 ", (int) 'd');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "         ITALIAN_italian_eNGLISH         ITALIAN_!IHitTAiT_ITALIAN_EgAishE             g                          shE             g                          shE             g                          shE             g                          shE             g                          shE             g                          shE             g                          shE             g                 " + "'", str2, "         ITALIAN_italian_eNGLISH         ITALIAN_!IHitTAiT_ITALIAN_EgAishE             g                          shE             g                          shE             g                          shE             g                          shE             g                          shE             g                          shE             g                          shE             g                 ");
    }

    @Test
    public void test09457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09457");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("hi!(\\U0020,Italienisch#########################################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!(\\U0020,Italienisch#########################################################################################" + "'", str1, "hi!(\\U0020,Italienisch#########################################################################################");
    }

    @Test
    public void test09458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09458");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rfr-CA\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "fr-CA" + "'", str1, "fr-CA");
    }

    @Test
    public void test09459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09459");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("en_C");
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + 'e' + "'", char1 == 'e');
    }

    @Test
    public void test09460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09460");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("iTALIAN", "");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "\\u0020italianitalianitalianitali\\u0020italianitalianitalianital (ALLEMAND)");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "iTALIAN" + "'", str4, "iTALIAN");
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test09461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09461");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("Chinese");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "CHINESE" + "'", str1, "CHINESE");
    }

    @Test
    public void test09462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09462");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("Eagaash", 55, 'U');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EagaashUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU" + "'", str3, "EagaashUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
    }

    @Test
    public void test09463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09463");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC", 'H');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, 'T', 14, (int) 'e');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 14");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test09464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09464");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("\\u0074", "English                                 (                United                                 Kingdom                )");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test09465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09465");
        java.lang.String str1 = org.apache.commons.lang3.CharUtils.toString('!');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!" + "'", str1, "!");
    }

    @Test
    public void test09466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09466");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "\\u0065                             ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09467");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("CHINESE");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ESENIHC" + "'", str1, "ESENIHC");
    }

    @Test
    public void test09468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09468");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITAL", "                                               nailati                                                ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test09469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09469");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("Hfffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff", "enenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenen", (int) 'e');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09470");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("", '!');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '!' + "'", char2 == '!');
    }

    @Test
    public void test09471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09471");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("\\XTALXAN_ITALIAN_ENGLXSH", "TALIAN_italian_eNGLISHITAL", "Chinese");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\XTALXAN_ITALIAN_ENGLXSH" + "'", str3, "\\XTALXAN_ITALIAN_ENGLXSH");
    }

    @Test
    public void test09472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09472");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\\U0064");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\U0064" + "'", str2, "\\U0064");
    }

    @Test
    public void test09473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09473");
        char[] charArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "Hfffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09474");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("hhhhhhhhhh", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09475");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("French", "TAiT_ITALIAN_EgAish", 997);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09476");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("44444444444444ITALIAN44444444444444", "hcsineilatI");
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("hI!       ", strArray4);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.split("                                        itTAiT_ITALIAN_EgAish                                 \\u0068");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEach("englisch (         ITALIAN_ITALIAN_ENGLISH,\\u0061)", strArray4, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 3 vs 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test09477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09477");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("                                                                    NC_HZ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "NC_HZ" + "'", str1, "NC_HZ");
    }

    @Test
    public void test09478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09478");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rfr-CA\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r", "...EnglishEn");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09479");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("AhzRAhzQAhzOAhzNAh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09480");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("8600u\\                                                                                                                  ", 104, " (italian,english)                                      ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "8600u\\                                                                                                                  " + "'", str3, "8600u\\                                                                                                                  ");
    }

    @Test
    public void test09481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09481");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("Ttat_ita", "2iT hi!       _\\U0020_Italienisch####################################################################            2iT", (int) '#');
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test09482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09482");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "ran\347ais (France)                                      f                                     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test09483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09483");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzHSXLGNE_NAILATI_NAXLATX\\zzzzz...", (java.lang.CharSequence) "Egsh");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09484");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("inglese", "Azhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais cinese (cina)\\u0069h..France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzh");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09485");
        java.util.Locale locale1 = java.util.Locale.ENGLISH;
        java.lang.String str2 = locale1.getDisplayLanguage();
        java.util.Locale locale3 = locale1.stripExtensions();
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.upperCase("ko", locale3);
        java.util.Locale.setDefault(locale3);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "English" + "'", str2, "English");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "KO" + "'", str4, "KO");
    }

    @Test
    public void test09486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09486");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("italian (italian,eng", "                                                                               ");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDh...", "GBR");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.concatWith("\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", (java.lang.Object[]) strArray7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEach("bgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgtalian", strArray3, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 2 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDh..." + "'", str8, "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDh...");
    }

    @Test
    public void test09487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09487");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "CHN");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test09488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09488");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("en-CA", "       ", 32);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "en-CA" + "'", str3, "en-CA");
    }

    @Test
    public void test09489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09489");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                                                  IT44444444444444444EN", 0, "             DE_DE             ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                  IT44444444444444444EN" + "'", str3, "                                                  IT44444444444444444EN");
    }

    @Test
    public void test09490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09490");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRFrancia", '\n');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRFrancia" + "'", str2, "RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRFrancia");
    }

    @Test
    public void test09491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09491");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "KoreanADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDhcstueDKoreanADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDB");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test09492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09492");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("en-CA");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test09493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09493");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder3.addUnicodeLocaleAttribute("Italien");
        java.util.Locale.Builder builder7 = builder3.setLanguage("fr");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder3.setLanguage("4");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: 4 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test09494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09494");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("Italian");
        java.util.Locale locale4 = builder3.build();
        java.util.Locale.Builder builder7 = builder3.setExtension('E', "DEUTSCH");
        java.util.Locale locale8 = builder3.build();
        java.lang.String str9 = locale8.toString();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "italian");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "italian__#e-deutsch");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "italian__#e-deutsch" + "'", str9, "italian__#e-deutsch");
    }

    @Test
    public void test09495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09495");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("             \\u0049                                           ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u0049" + "'", str1, "\\u0049");
    }

    @Test
    public void test09496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09496");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiNumeric('5');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test09497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09497");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf(" ...", 30, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09498");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("kkkkkkkkkkkkkkkkkeAGAASH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09499");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("CKCLCMCNCOCRCUCVCWCXCYCZDEDh...IBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIaDAEAFAGA", "Chinese", 371);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09500");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("Chinese (China)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Chinese (China)" + "'", str1, "Chinese (China)");
    }
}
