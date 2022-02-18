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
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("EN_caEN_cINA$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$EN_caEN_c", "HArrayLi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test15002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15002");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("English");
        java.lang.String str2 = languageRange1.getRange();
        java.util.Locale.LanguageRange languageRange4 = new java.util.Locale.LanguageRange("English");
        java.lang.String str5 = languageRange4.getRange();
        java.util.Locale.LanguageRange languageRange7 = new java.util.Locale.LanguageRange("English");
        java.util.Locale.LanguageRange[] languageRangeArray8 = new java.util.Locale.LanguageRange[] { languageRange1, languageRange4, languageRange7 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList9 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList9, languageRangeArray8);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream11 = languageRangeList9.stream();
        java.util.Locale.Builder builder12 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder13 = builder12.clearExtensions();
        java.util.Locale.Builder builder14 = builder12.clearExtensions();
        boolean boolean15 = languageRangeList9.contains((java.lang.Object) builder14);
        java.util.Locale locale16 = java.util.Locale.ITALIAN;
        java.lang.String str17 = locale16.getLanguage();
        java.lang.String str18 = locale16.getLanguage();
        java.util.Locale.Builder builder19 = builder14.setLocale(locale16);
        java.util.Locale.Builder builder20 = builder14.clearExtensions();
        java.util.Locale.Builder builder21 = builder14.clear();
        java.util.Locale.Builder builder22 = builder14.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder24 = builder22.setVariant("\u7fa9\u5927\u5229\u6587");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: ???? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "english" + "'", str2, "english");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "english" + "'", str5, "english");
        org.junit.Assert.assertNotNull(languageRangeArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(languageRangeStream11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "it");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "it" + "'", str17, "it");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "it" + "'", str18, "it");
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder22);
    }

    @Test
    public void test15003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15003");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("rglAsAundaaaaaaaH");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test15004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15004");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("ANIHCxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", "ReferencePipeline.Head", 279, 120);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ANIHCxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxReferencePipeline.Head" + "'", str4, "ANIHCxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxReferencePipeline.Head");
    }

    @Test
    public void test15005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15005");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaFrancese");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test15006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15006");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("Ja", "GGGGGGGGGGGGGGGGGGGGGGG....XXGLIGGGGGGGGGGGGGGGGGGGGGGG....XXGLIGGGGGGGGGGGGGGGGGGGGGGG....XXGLIGGGGGGGGGGGGGGGGGGGGGGG....XXGLIGGGGGGGGGGGGGGGGGGGGGGG....XXGLIGGGGGGGGGGGGGGGGGGGGGGG....XXGLIGGGGGGGGGGGGGGGGGGGGGGG....XXGLIGGGGGGGGGGGGGGGGGGGGGGG....XXGLIGGGGGGGGGGGGGGGGGGGGGGG....XXGLI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test15007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15007");
        char[] charArray8 = new char[] {};
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "zh-CN", charArray8);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "a", charArray8);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "  China   ", charArray8);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "zh_CN", charArray8);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "AD.AE.AF.AGchnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.AT.AU.AW.AX.AZ.BA.BB.BD.BE.BF.BG.BH.BI.BJ.BL.BM.BN.BO.BQ.BR.BS.BT.BV.BW.BY.BZ.CA.CC.CD.CF.CG.CH.CI.CK.CL.CM.CN.CO.CR.CU.CV.CW.CX.CY.CZ.DE.DJ.DK.DM.DO.DZ.EC.EE.EG.EH.ER.ES.ET.FI.FJ.FK.FM.FO.FR.GA.GB.GD.GE.GF.GG.GH.GI.GL.GM.GN.GP.GQ.GR.GS.GT.GU.GW.GY.HK.HM.HN.HR.HT.HU.ID.IE.IL.IM.IN.IO.IQ.IR.IS.IT.JE.JM.JO.JP.KE.KG.KH.KI.KM.KN.KP.KR.KW.KY.KZ.LA.LB.LC.LI.LK.LR.LS.LT.LU.LV.LY.MA.MC.MD.ME.MF.MG.MH.MK.ML.MM.MN.MO.MP.MQ.MR.MS.MT.MU.MV.MW.MX.MY.MZ.NA.NC.NE.NF.NG.NI.NL.NO.NP.NR.NU.NZ.OM.PA.PE.PF.PG.PH.PK.PL.PM.PN.PR.PS.PT.PW.PY.QA.RE.RO.RS.RU.RW.SA.SB.SC.SD.SE.SG.SH.SI.SJ.SK.SL.SM.SN.SO.SR.SS.ST.SV.SX.SY.SZ.TC.TD.TF.TG.TH.TJ.TK.TL.TM.TN.TO.TR.TT.TV.TW.TZ.UA.UG.UM.US.UY.UZ.VA.VC.VE.VG.VI.VN.VU.WF.WS.YE.YT.ZA.ZM.ZW", charArray8);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "zhcines############################", charArray8);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "nglish  hindi (hi!,china", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test15008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15008");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("xxxxxxxxinglese (canada)xxxxxxxx", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test15009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15009");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuan       a", "FR", 107);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test15010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15010");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxCHNAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxCHNAAAAA" + "'", str1, "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxCHNAAAAA");
    }

    @Test
    public void test15011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15011");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("a#a#a#a#a#", "\u4e2d\u56fd\u8a9e (ZH)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test15012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15012");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "                                                                                                   $");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
    }

    @Test
    public void test15013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15013");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "l.avajstring[]string[]string[$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$undaaaaaaal.avajstring[]string[]string[$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$undaaaaaaal.avajstring[]string[]string[$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$undaaaaaaal.avajstring[]string[]string[$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$undaaaaaaal.avajstring[]string[]string[$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$undaaaaaaal.avajstring[]string[]string[$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$undaaaaaaal.avajstring[]string[]string[$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$undaaaaaaal.avajstring[]string[]string[$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$undaaaaaaal.avajstring[]string[]string[$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test15014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15014");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("string[]", "ANIH");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test15015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15015");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("En", "####################################################################################################################################################################################################################################################################################################################################rance)Italiuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu#####################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "En" + "'", str2, "En");
    }

    @Test
    public void test15016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15016");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale locale4 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str5 = locale4.getISO3Language();
        java.util.Locale.Builder builder6 = builder3.setLocale(locale4);
        java.util.Locale.Builder builder8 = builder6.setRegion("ja");
        java.util.Locale.Builder builder9 = builder8.clearExtensions();
        java.util.Locale.Builder builder11 = builder9.removeUnicodeLocaleAttribute("SHORT");
        java.util.Locale locale12 = builder9.build();
        java.util.Locale.Builder builder14 = builder9.setLanguage("IA");
        java.util.Locale.Builder builder15 = builder9.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder18 = builder15.setUnicodeLocaleKeyword("hindi", "                                                                                                   $");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: hindi [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "zho" + "'", str5, "zho");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "zh_JA");
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test15017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15017");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("zh-cn", "                                 ...inglese (Cnd)xxxxxxxx                                 ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test15018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15018");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale locale4 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str5 = locale4.getISO3Language();
        java.util.Locale.Builder builder6 = builder3.setLocale(locale4);
        java.util.Locale.Builder builder8 = builder6.setRegion("ja");
        java.util.Locale.Builder builder9 = builder8.clearExtensions();
        java.util.Locale.Builder builder11 = builder9.removeUnicodeLocaleAttribute("SHORT");
        java.util.Locale locale12 = builder9.build();
        java.util.Locale.Builder builder14 = builder9.setLanguage("IA");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder16 = builder14.setLanguage("xxANIHCxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: xxANIHCxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "zho" + "'", str5, "zho");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "zh_JA");
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test15019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15019");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fduuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", 0, 16);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test15020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15020");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("zxxxxxxxxxxxxxxxxxxx", '#', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zxxxxxxxxxxxxxxxxxxx" + "'", str3, "zxxxxxxxxxxxxxxxxxxx");
    }

    @Test
    public void test15021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15021");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("          ...", 23);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "          ...          ...          ...          ...          ...          ...          ...          ...          ...          ...          ...          ...          ...          ...          ...          ...          ...          ...          ...          ...          ...          ...          ..." + "'", str2, "          ...          ...          ...          ...          ...          ...          ...          ...          ...          ...          ...          ...          ...          ...          ...          ...          ...          ...          ...          ...          ...          ...          ...");
    }

    @Test
    public void test15022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15022");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "\u4e2d");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test15023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15023");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRIAD.AE.AF.A", 20);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "TRING[]TRIAD.AE.AF.A" + "'", str2, "TRING[]TRIAD.AE.AF.A");
    }

    @Test
    public void test15024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15024");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "#######################################################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test15025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15025");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("hi");
        boolean boolean3 = languageRangeList1.remove((java.lang.Object) "English");
        java.util.Locale.LanguageRange languageRange5 = languageRangeList1.get(0);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor6 = languageRangeList1.listIterator();
        java.lang.String str8 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) languageRangeList1, "AN       a");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList10 = java.util.Locale.LanguageRange.parse("hi");
        java.lang.Object[] objArray11 = languageRangeList10.toArray();
        java.util.List<java.util.Locale.LanguageRange> languageRangeList13 = java.util.Locale.LanguageRange.parse("hi");
        java.lang.Object[] objArray14 = languageRangeList13.toArray();
        java.util.Spliterator<java.util.Locale.LanguageRange> languageRangeSpliterator15 = languageRangeList13.spliterator();
        boolean boolean16 = languageRangeList10.containsAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList13);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList18 = java.util.Locale.LanguageRange.parse("hi");
        java.lang.Object[] objArray19 = languageRangeList18.toArray();
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream20 = languageRangeList18.parallelStream();
        java.util.Locale.LanguageRange[] languageRangeArray21 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList22 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList22, languageRangeArray21);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap24 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList25 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList22, strMap24);
        java.util.Locale.LanguageRange[] languageRangeArray26 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList27 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList27, languageRangeArray26);
        boolean boolean29 = languageRangeList22.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList27);
        java.util.Locale.LanguageRange[] languageRangeArray30 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList31 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList31, languageRangeArray30);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap33 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList34 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList31, strMap33);
        java.util.Locale.LanguageRange[] languageRangeArray35 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList36 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList36, languageRangeArray35);
        boolean boolean38 = languageRangeList31.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList36);
        java.lang.String str40 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList36, "hi!");
        boolean boolean41 = languageRangeList22.remove((java.lang.Object) languageRangeList36);
        boolean boolean42 = languageRangeList18.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList36);
        java.util.Locale.LanguageRange languageRange44 = new java.util.Locale.LanguageRange("cn");
        boolean boolean45 = languageRangeList18.add(languageRange44);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream46 = languageRangeList18.stream();
        boolean boolean48 = languageRangeList18.contains((java.lang.Object) "\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587          ");
        boolean boolean49 = languageRangeList13.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList18);
        int int50 = languageRangeList13.size();
        boolean boolean51 = languageRangeList1.containsAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList13);
        java.util.Locale.LanguageRange languageRange53 = new java.util.Locale.LanguageRange("English");
        java.lang.String str54 = languageRange53.getRange();
        java.util.Locale.LanguageRange languageRange56 = new java.util.Locale.LanguageRange("English");
        java.lang.String str57 = languageRange56.getRange();
        java.util.Locale.LanguageRange languageRange59 = new java.util.Locale.LanguageRange("English");
        java.util.Locale.LanguageRange[] languageRangeArray60 = new java.util.Locale.LanguageRange[] { languageRange53, languageRange56, languageRange59 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList61 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList61, languageRangeArray60);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream63 = languageRangeList61.stream();
        java.util.Locale.Builder builder64 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder65 = builder64.clearExtensions();
        java.util.Locale.Builder builder66 = builder64.clearExtensions();
        boolean boolean67 = languageRangeList61.contains((java.lang.Object) builder66);
        java.util.Locale locale68 = java.util.Locale.ITALIAN;
        java.lang.String str69 = locale68.getLanguage();
        java.lang.String str70 = locale68.getLanguage();
        java.util.Locale.Builder builder71 = builder66.setLocale(locale68);
        int int72 = languageRangeList1.lastIndexOf((java.lang.Object) locale68);
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(languageRange5);
        org.junit.Assert.assertNotNull(languageRangeItor6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ArrayList" + "'", str8, "ArrayList");
        org.junit.Assert.assertNotNull(languageRangeList10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(languageRangeList13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(languageRangeSpliterator15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(languageRangeList18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(languageRangeStream20);
        org.junit.Assert.assertNotNull(languageRangeArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(languageRangeList25);
        org.junit.Assert.assertNotNull(languageRangeArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(languageRangeArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(languageRangeList34);
        org.junit.Assert.assertNotNull(languageRangeArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(languageRangeStream46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "english" + "'", str54, "english");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "english" + "'", str57, "english");
        org.junit.Assert.assertNotNull(languageRangeArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(languageRangeStream63);
        org.junit.Assert.assertNotNull(builder65);
        org.junit.Assert.assertNotNull(builder66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(locale68);
        org.junit.Assert.assertEquals(locale68.toString(), "it");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "it" + "'", str69, "it");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "it" + "'", str70, "it");
        org.junit.Assert.assertNotNull(builder71);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
    }

    @Test
    public void test15026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15026");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("T", 0, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "T" + "'", str3, "T");
    }

    @Test
    public void test15027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15027");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("               RGLASA               ", 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test15028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15028");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("har[]", "ch");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test15029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15029");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("a", "cHINA");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "zho");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "a" + "'", str5, "a");
    }

    @Test
    public void test15030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15030");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "                                                                                            en_CA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test15031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15031");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("               eN                ", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "               eN                " + "'", str2, "               eN                ");
    }

    @Test
    public void test15032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15032");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("cinaxxxxxcNn", "xxxxxxxxxxxxafxxxxxxxxxxxxx");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test15033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15033");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("AnAnAnAnAnAnxxxxxxxxinglese (Canada)xxxxxxxx", (int) (short) 10, "                                                      java.lang                                     ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AnAnAnAnAnAnxxxxxxxxinglese (Canada)xxxxxxxx" + "'", str3, "AnAnAnAnAnAnxxxxxxxxinglese (Canada)xxxxxxxx");
    }

    @Test
    public void test15034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15034");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap3);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream5 = languageRangeList1.stream();
        boolean boolean6 = languageRangeList1.isEmpty();
        java.util.Locale.LanguageRange[] languageRangeArray7 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList8 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList8, languageRangeArray7);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap10 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList11 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList8, strMap10);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor12 = languageRangeList11.listIterator();
        boolean boolean13 = languageRangeList1.retainAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList11);
        java.lang.String str15 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) languageRangeList11, "Chinese");
        java.lang.String[] strArray19 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("Chin", "english");
        boolean boolean20 = org.apache.commons.lang3.StringUtils.endsWithAny("                                                                                                    ", strArray19);
        boolean boolean21 = languageRangeList11.equals((java.lang.Object) strArray19);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream22 = languageRangeList11.parallelStream();
        java.lang.Object[] objArray23 = languageRangeList11.toArray();
        java.util.Spliterator<java.util.Locale.LanguageRange> languageRangeSpliterator24 = languageRangeList11.spliterator();
        java.util.Locale.LanguageRange[] languageRangeArray25 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList26 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList26, languageRangeArray25);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap28 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList29 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList26, strMap28);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream30 = languageRangeList26.stream();
        boolean boolean31 = languageRangeList26.isEmpty();
        java.util.Locale.LanguageRange[] languageRangeArray32 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList33 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList33, languageRangeArray32);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap35 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList36 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList33, strMap35);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor37 = languageRangeList36.listIterator();
        boolean boolean38 = languageRangeList26.retainAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList36);
        java.lang.String str40 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) languageRangeList36, "Chinese");
        java.lang.String[] strArray44 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("Chin", "english");
        boolean boolean45 = org.apache.commons.lang3.StringUtils.endsWithAny("                                                                                                    ", strArray44);
        boolean boolean46 = languageRangeList36.equals((java.lang.Object) strArray44);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream47 = languageRangeList36.parallelStream();
        java.lang.Object[] objArray48 = languageRangeList36.toArray();
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap50 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList51 = java.util.Locale.LanguageRange.parse("it", strMap50);
        java.lang.String str53 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList51, '#');
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap54 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList55 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList51, strMap54);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap57 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList58 = java.util.Locale.LanguageRange.parse("Cina", strMap57);
        java.lang.String[] strArray62 = new java.lang.String[] { "aiaiaiaiaiaiaiaiaia", "zh-CN", "China" };
        java.util.ArrayList<java.lang.String> strList63 = new java.util.ArrayList<java.lang.String>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList63, strArray62);
        java.util.Locale.FilteringMode filteringMode65 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList66 = java.util.Locale.filterTags(languageRangeList58, (java.util.Collection<java.lang.String>) strList63, filteringMode65);
        boolean boolean67 = languageRangeList51.contains((java.lang.Object) strList63);
        boolean boolean68 = languageRangeList51.isEmpty();
        java.util.Spliterator<java.util.Locale.LanguageRange> languageRangeSpliterator69 = languageRangeList51.spliterator();
        boolean boolean70 = languageRangeList36.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList51);
        boolean boolean71 = languageRangeList11.containsAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList36);
        java.util.Locale locale72 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale73 = java.util.Locale.getDefault();
        java.lang.String str74 = locale72.getDisplayCountry(locale73);
        java.lang.String str75 = locale72.getLanguage();
        java.lang.String str76 = locale72.getDisplayScript();
        java.util.Locale locale77 = locale72.stripExtensions();
        int int78 = languageRangeList36.indexOf((java.lang.Object) locale72);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor80 = languageRangeList36.listIterator(47);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 47");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(languageRangeStream5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(languageRangeArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(languageRangeList11);
        org.junit.Assert.assertNotNull(languageRangeItor12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "java.util" + "'", str15, "java.util");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(languageRangeStream22);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
        org.junit.Assert.assertNotNull(languageRangeSpliterator24);
        org.junit.Assert.assertNotNull(languageRangeArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(languageRangeList29);
        org.junit.Assert.assertNotNull(languageRangeStream30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(languageRangeArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(languageRangeList36);
        org.junit.Assert.assertNotNull(languageRangeItor37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "java.util" + "'", str40, "java.util");
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(languageRangeStream47);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray48), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray48), "[]");
        org.junit.Assert.assertNotNull(languageRangeList51);
        org.junit.Assert.assertNotNull(languageRangeList55);
        org.junit.Assert.assertNotNull(languageRangeList58);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + filteringMode65 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode65.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(languageRangeSpliterator69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(locale72);
        org.junit.Assert.assertEquals(locale72.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale73);
// flaky:         org.junit.Assert.assertEquals(locale73.toString(), "");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "China" + "'", str74, "China");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "zh" + "'", str75, "zh");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertNotNull(locale77);
        org.junit.Assert.assertEquals(locale77.toString(), "zh_CN");
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
    }

    @Test
    public void test15035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15035");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("hi");
        java.lang.Object[] objArray2 = languageRangeList1.toArray();
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream3 = languageRangeList1.parallelStream();
        int int5 = languageRangeList1.lastIndexOf((java.lang.Object) "Short");
        java.util.Iterator<java.util.Locale.LanguageRange> languageRangeItor6 = languageRangeList1.iterator();
        java.util.Locale.LanguageRange[] languageRangeArray7 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList8 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList8, languageRangeArray7);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap10 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList11 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList8, strMap10);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor12 = languageRangeList11.listIterator();
        java.util.Locale.LanguageRange[] languageRangeArray13 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList14 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList14, languageRangeArray13);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap16 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList17 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList14, strMap16);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor18 = languageRangeList17.listIterator();
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList21 = new java.util.ArrayList<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList21, strArray20);
        java.util.Locale.LanguageRange[] languageRangeArray23 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList24 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList24, languageRangeArray23);
        java.util.Locale locale27 = java.util.Locale.FRANCE;
        java.lang.String str28 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale27);
        java.util.Locale locale29 = java.util.Locale.US;
        java.util.Locale locale30 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale31 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale32 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale33 = java.util.Locale.getDefault();
        java.lang.String str34 = locale32.getDisplayCountry(locale33);
        java.lang.String str35 = locale32.toLanguageTag();
        java.util.Locale locale36 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale37 = java.util.Locale.getDefault();
        java.lang.String str38 = locale36.getDisplayCountry(locale37);
        java.util.Locale locale39 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale40 = java.util.Locale.getDefault();
        java.lang.String str41 = locale39.getDisplayCountry(locale40);
        java.util.Locale locale45 = new java.util.Locale("hi", "hi!", "cHINA");
        java.util.Locale locale46 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale47 = java.util.Locale.getDefault();
        java.lang.String str48 = locale46.getDisplayCountry(locale47);
        java.util.Locale locale50 = new java.util.Locale("");
        java.lang.String str51 = locale50.getDisplayVariant();
        java.util.Locale locale52 = java.util.Locale.KOREAN;
        java.util.Locale locale54 = new java.util.Locale("");
        java.util.Locale locale55 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale[] localeArray56 = new java.util.Locale[] { locale27, locale29, locale30, locale31, locale32, locale37, locale39, locale45, locale47, locale50, locale52, locale54, locale55 };
        java.util.ArrayList<java.util.Locale> localeList57 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList57, localeArray56);
        java.util.List<java.util.Locale> localeList59 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList24, (java.util.Collection<java.util.Locale>) localeList57);
        java.lang.String[] strArray67 = new java.lang.String[] { "English", "hi", "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "", "a", "", "China" };
        java.util.ArrayList<java.lang.String> strList68 = new java.util.ArrayList<java.lang.String>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList68, strArray67);
        java.util.List<java.lang.Class<?>> wildcardClassList70 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList68);
        java.util.Locale.FilteringMode filteringMode71 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList72 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList24, (java.util.Collection<java.lang.String>) strList68, filteringMode71);
        java.util.List<java.lang.String> strList73 = java.util.Locale.filterTags(languageRangeList17, (java.util.Collection<java.lang.String>) strList21, filteringMode71);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor74 = languageRangeList17.listIterator();
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream75 = languageRangeList17.parallelStream();
        boolean boolean76 = languageRangeList11.remove((java.lang.Object) languageRangeStream75);
        java.util.Locale.Builder builder77 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder79 = builder77.setScript("");
        boolean boolean80 = languageRangeList11.contains((java.lang.Object) "");
        boolean boolean81 = languageRangeList1.containsAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList11);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange83 = languageRangeList1.remove(39);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 39, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(languageRangeStream3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(languageRangeItor6);
        org.junit.Assert.assertNotNull(languageRangeArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(languageRangeList11);
        org.junit.Assert.assertNotNull(languageRangeItor12);
        org.junit.Assert.assertNotNull(languageRangeArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(languageRangeList17);
        org.junit.Assert.assertNotNull(languageRangeItor18);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(languageRangeArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "english" + "'", str28, "english");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale33);
// flaky:         org.junit.Assert.assertEquals(locale33.toString(), "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "China" + "'", str34, "China");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "zh-CN" + "'", str35, "zh-CN");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale37);
// flaky:         org.junit.Assert.assertEquals(locale37.toString(), "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "China" + "'", str38, "China");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale40);
// flaky:         org.junit.Assert.assertEquals(locale40.toString(), "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "China" + "'", str41, "China");
        org.junit.Assert.assertEquals(locale45.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale47);
// flaky:         org.junit.Assert.assertEquals(locale47.toString(), "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "China" + "'", str48, "China");
        org.junit.Assert.assertEquals(locale50.toString(), "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "ko");
        org.junit.Assert.assertEquals(locale54.toString(), "");
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(localeList59);
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(wildcardClassList70);
        org.junit.Assert.assertTrue("'" + filteringMode71 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode71.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList72);
        org.junit.Assert.assertNotNull(strList73);
        org.junit.Assert.assertNotNull(languageRangeItor74);
        org.junit.Assert.assertNotNull(languageRangeStream75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(builder79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
    }

    @Test
    public void test15036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15036");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test15037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15037");
        java.util.Locale locale2 = new java.util.Locale("                                                                                                 ", "NENENENENENENENENENE");
        java.lang.String str3 = locale2.getDisplayVariant();
        org.junit.Assert.assertEquals(locale2.toString(), "                                                                                                 _NENENENENENENENENENE");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test15038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15038");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("\u7fa9\u5927\u5229", 252, 990);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test15039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15039");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("nnnnnnnnnnnnnnnnnann", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nnnnnnnnnnnnnnnnnann" + "'", str2, "nnnnnnnnnnnnnnnnnann");
    }

    @Test
    public void test15040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15040");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("ssalcGERMAN", "CINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test15041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15041");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter(")                 A                 ( !ih!iha", "i###################################################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test15042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15042");
        java.util.Locale locale3 = new java.util.Locale("italiano", "Ci_a");
        java.util.Locale locale7 = new java.util.Locale("Canada", "allemand", "cHINA");
        java.lang.String str8 = locale3.getDisplayName(locale7);
        java.util.Set<java.lang.Character> charSet9 = locale3.getExtensionKeys();
        java.util.Locale locale10 = java.util.Locale.KOREA;
        java.lang.String str11 = locale3.getDisplayVariant(locale10);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.upperCase("LANGUAGERANGE", locale10);
        java.lang.String str13 = locale10.getScript();
        org.junit.Assert.assertEquals(locale3.toString(), "italiano_CI_A");
        org.junit.Assert.assertEquals(locale7.toString(), "canada_ALLEMAND_cHINA");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "italiano (CI_A)" + "'", str8, "italiano (CI_A)");
        org.junit.Assert.assertNotNull(charSet9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "LANGUAGERANGE" + "'", str12, "LANGUAGERANGE");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test15043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15043");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("esecnarf", "undaaaaaaa", (int) 'x', 46);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "esecnarfundaaaaaaa" + "'", str4, "esecnarfundaaaaaaa");
    }

    @Test
    public void test15044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15044");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap3);
        int int5 = languageRangeList1.size();
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor6 = languageRangeList1.listIterator();
        java.util.Locale.LanguageRange languageRange8 = new java.util.Locale.LanguageRange("a");
        java.util.Locale.LanguageRange languageRange10 = new java.util.Locale.LanguageRange("English");
        java.lang.String str12 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) languageRange10, "");
        java.util.Locale.LanguageRange languageRange14 = new java.util.Locale.LanguageRange("English");
        java.util.Locale.LanguageRange[] languageRangeArray15 = new java.util.Locale.LanguageRange[] { languageRange8, languageRange10, languageRange14 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList16 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList16, languageRangeArray15);
        boolean boolean18 = languageRangeList1.retainAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList16);
        java.util.Locale.LanguageRange[] languageRangeArray19 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList20 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList20, languageRangeArray19);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap22 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList23 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList20, strMap22);
        int int24 = languageRangeList20.size();
        java.util.Locale.LanguageRange languageRange26 = new java.util.Locale.LanguageRange("English");
        java.util.Locale.LanguageRange languageRange28 = new java.util.Locale.LanguageRange("English");
        java.util.Locale.LanguageRange languageRange30 = new java.util.Locale.LanguageRange("a");
        java.util.Locale.LanguageRange[] languageRangeArray31 = new java.util.Locale.LanguageRange[] { languageRange26, languageRange28, languageRange30 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList32 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList32, languageRangeArray31);
        boolean boolean34 = languageRangeList20.retainAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList32);
        java.util.Locale locale37 = new java.util.Locale("");
        java.lang.String str38 = locale37.getDisplayLanguage();
        java.util.Locale locale39 = java.util.Locale.CANADA;
        java.lang.String str40 = locale39.getDisplayLanguage();
        java.lang.String str41 = locale37.getDisplayScript(locale39);
        java.lang.String str42 = org.apache.commons.lang3.StringUtils.lowerCase("a", locale37);
        java.lang.String str43 = locale37.getDisplayScript();
        java.util.Set<java.lang.String> strSet44 = locale37.getUnicodeLocaleAttributes();
        java.util.Locale.FilteringMode filteringMode45 = null;
        java.util.List<java.lang.String> strList46 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList32, (java.util.Collection<java.lang.String>) strSet44, filteringMode45);
        java.lang.String str48 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList32, "\u6cd5\u6587");
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream49 = languageRangeList32.stream();
        java.util.List<java.util.Locale.LanguageRange> languageRangeList51 = java.util.Locale.LanguageRange.parse("hi");
        boolean boolean53 = languageRangeList51.remove((java.lang.Object) "English");
        java.util.Locale.LanguageRange languageRange55 = languageRangeList51.get(0);
        boolean boolean56 = languageRangeList32.retainAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList51);
        boolean boolean57 = languageRangeList1.retainAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList32);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList59 = java.util.Locale.LanguageRange.parse("hi");
        boolean boolean61 = languageRangeList59.remove((java.lang.Object) "English");
        java.util.Locale.LanguageRange languageRange63 = languageRangeList59.get(0);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor64 = languageRangeList59.listIterator();
        java.lang.String str66 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) languageRangeList59, "AN       a");
        java.util.Locale.Builder builder67 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder68 = builder67.clearExtensions();
        java.util.Locale.Builder builder70 = builder68.setLanguageTag("zh-CN");
        java.util.Locale.Builder builder72 = builder70.setLanguage("CHINA");
        java.util.Locale locale73 = builder70.build();
        java.util.Locale.Builder builder74 = builder70.clearExtensions();
        java.util.Locale.Builder builder75 = builder70.clear();
        boolean boolean76 = languageRangeList59.contains((java.lang.Object) builder75);
        java.util.Locale.Builder builder77 = builder75.clearExtensions();
        java.util.Locale.Builder builder79 = builder77.setLanguage("CN");
        boolean boolean80 = languageRangeList32.contains((java.lang.Object) builder77);
        java.util.Locale locale81 = builder77.build();
        java.lang.String str83 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) locale81, "le.Builder[]aLoc");
        java.lang.String str84 = locale81.toLanguageTag();
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(languageRangeItor6);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Locale.LanguageRange" + "'", str12, "Locale.LanguageRange");
        org.junit.Assert.assertNotNull(languageRangeArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(languageRangeArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(languageRangeList23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(languageRangeArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals(locale37.toString(), "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "English" + "'", str40, "English");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "a" + "'", str42, "a");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(strSet44);
        org.junit.Assert.assertNotNull(strList46);
        org.junit.Assert.assertNotNull(languageRangeStream49);
        org.junit.Assert.assertNotNull(languageRangeList51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(languageRange55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(languageRangeList59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(languageRange63);
        org.junit.Assert.assertNotNull(languageRangeItor64);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "ArrayList" + "'", str66, "ArrayList");
        org.junit.Assert.assertNotNull(builder68);
        org.junit.Assert.assertNotNull(builder70);
        org.junit.Assert.assertNotNull(builder72);
        org.junit.Assert.assertNotNull(locale73);
        org.junit.Assert.assertEquals(locale73.toString(), "china_CN");
        org.junit.Assert.assertNotNull(builder74);
        org.junit.Assert.assertNotNull(builder75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(builder77);
        org.junit.Assert.assertNotNull(builder79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(locale81);
        org.junit.Assert.assertEquals(locale81.toString(), "cn");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "Locale" + "'", str83, "Locale");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "cn" + "'", str84, "cn");
    }

    @Test
    public void test15045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15045");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.setLanguageTag("zh-CN");
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale.Builder builder6 = builder3.setLanguageTag("ANIHC");
        java.util.Locale locale7 = builder3.build();
        java.util.Locale locale8 = builder3.build();
        java.util.Locale.Builder builder10 = builder3.setLanguage("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder10.setRegion("it_CN");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: it_CN [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "anihc");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "anihc");
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test15046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15046");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap3);
        int int5 = languageRangeList1.size();
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor6 = languageRangeList1.listIterator();
        java.util.Locale.LanguageRange languageRange8 = new java.util.Locale.LanguageRange("a");
        java.util.Locale.LanguageRange languageRange10 = new java.util.Locale.LanguageRange("English");
        java.lang.String str12 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) languageRange10, "");
        java.util.Locale.LanguageRange languageRange14 = new java.util.Locale.LanguageRange("English");
        java.util.Locale.LanguageRange[] languageRangeArray15 = new java.util.Locale.LanguageRange[] { languageRange8, languageRange10, languageRange14 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList16 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList16, languageRangeArray15);
        boolean boolean18 = languageRangeList1.retainAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList16);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor19 = languageRangeList16.listIterator();
        boolean boolean20 = languageRangeItor19.hasNext();
        boolean boolean21 = languageRangeItor19.hasNext();
        java.util.Locale.LanguageRange languageRange22 = languageRangeItor19.next();
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.join((java.util.Iterator<java.util.Locale.LanguageRange>) languageRangeItor19, "                                                                            Hindi (HI!,cHINA)");
        languageRangeItor19.remove();
        java.lang.String str27 = org.apache.commons.lang3.StringUtils.join((java.util.Iterator<java.util.Locale.LanguageRange>) languageRangeItor19, "#####################################################################################################################################################################################################################################################################################################################################hi!italiahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIital.");
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(languageRangeItor6);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Locale.LanguageRange" + "'", str12, "Locale.LanguageRange");
        org.junit.Assert.assertNotNull(languageRangeArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(languageRangeItor19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(languageRange22);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test15047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15047");
        java.util.Locale locale3 = new java.util.Locale("hi", "hi!", "cHINA");
        java.lang.String str4 = locale3.getLanguage();
        java.util.Locale locale8 = new java.util.Locale("hi", "hi!", "cHINA");
        java.lang.String str9 = locale8.getDisplayVariant();
        java.util.Locale locale10 = locale8.stripExtensions();
        java.util.Locale locale11 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale12 = java.util.Locale.getDefault();
        java.lang.String str13 = locale11.getDisplayCountry(locale12);
        java.lang.String str14 = locale11.toLanguageTag();
        java.lang.String str15 = locale11.getLanguage();
        java.util.Locale locale16 = java.util.Locale.ITALIAN;
        java.util.Locale locale18 = new java.util.Locale("");
        java.lang.String str19 = locale18.getDisplayLanguage();
        java.util.Locale locale20 = java.util.Locale.CANADA;
        java.lang.String str21 = locale20.getDisplayLanguage();
        java.lang.String str22 = locale18.getDisplayScript(locale20);
        java.util.Locale locale24 = java.util.Locale.FRANCE;
        java.lang.String str25 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale24);
        java.lang.String str26 = locale18.getDisplayCountry(locale24);
        java.lang.String str27 = locale16.getDisplayScript(locale18);
        java.util.Locale locale28 = java.util.Locale.GERMAN;
        java.lang.String str29 = locale18.getDisplayLanguage(locale28);
        java.lang.String str30 = locale11.getDisplayCountry(locale18);
        java.lang.String str31 = locale18.getCountry();
        java.util.Locale locale35 = new java.util.Locale("....english", "zhcinesese", ".");
        java.lang.String str36 = locale18.getDisplayName(locale35);
        java.lang.String str37 = locale8.getDisplayName(locale18);
        java.lang.String str38 = locale3.getDisplayScript(locale8);
        java.lang.String str39 = locale3.getDisplayName();
        org.junit.Assert.assertEquals(locale3.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi" + "'", str4, "hi");
        org.junit.Assert.assertEquals(locale8.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "cHINA" + "'", str9, "cHINA");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale12);
// flaky:         org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "China" + "'", str13, "China");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "zh-CN" + "'", str14, "zh-CN");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "zh" + "'", str15, "zh");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "it");
        org.junit.Assert.assertEquals(locale18.toString(), "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "English" + "'", str21, "English");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "english" + "'", str25, "english");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "de");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "China" + "'", str30, "China");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals(locale35.toString(), "....english_ZHCINESESE_.");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Hindi (HI!,cHINA)" + "'", str37, "Hindi (HI!,cHINA)");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Hindi (HI!,cHINA)" + "'", str39, "Hindi (HI!,cHINA)");
    }

    @Test
    public void test15048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15048");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("wt_hz", "HI!STRING[]STRING[]S");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test15049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15049");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("                                    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test15050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15050");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("zhcinesese$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$", 248);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test15051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15051");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("TALIAHi", 211, "ITFRITL");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITALIAHi" + "'", str3, "ITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITALIAHi");
    }

    @Test
    public void test15052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15052");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("OCLE.LGUGERGE", "CHNAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test15053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15053");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("di", "I!Hchizh_");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test15054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15054");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("china", "ENGLISH");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test15055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15055");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap3);
        java.util.Spliterator<java.util.Locale.LanguageRange> languageRangeSpliterator5 = languageRangeList1.spliterator();
        languageRangeList1.clear();
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor7 = languageRangeList1.listIterator();
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream8 = languageRangeList1.parallelStream();
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList1, "frfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfr");
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(languageRangeSpliterator5);
        org.junit.Assert.assertNotNull(languageRangeItor7);
        org.junit.Assert.assertNotNull(languageRangeStream8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test15056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15056");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("aI", "rglAsA", 27);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test15057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15057");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "An");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test15058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15058");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap3);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor5 = languageRangeList4.listIterator();
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        java.util.Locale.LanguageRange[] languageRangeArray10 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList11 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList11, languageRangeArray10);
        java.util.Locale locale14 = java.util.Locale.FRANCE;
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale14);
        java.util.Locale locale16 = java.util.Locale.US;
        java.util.Locale locale17 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale18 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale19 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale20 = java.util.Locale.getDefault();
        java.lang.String str21 = locale19.getDisplayCountry(locale20);
        java.lang.String str22 = locale19.toLanguageTag();
        java.util.Locale locale23 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale24 = java.util.Locale.getDefault();
        java.lang.String str25 = locale23.getDisplayCountry(locale24);
        java.util.Locale locale26 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale27 = java.util.Locale.getDefault();
        java.lang.String str28 = locale26.getDisplayCountry(locale27);
        java.util.Locale locale32 = new java.util.Locale("hi", "hi!", "cHINA");
        java.util.Locale locale33 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale34 = java.util.Locale.getDefault();
        java.lang.String str35 = locale33.getDisplayCountry(locale34);
        java.util.Locale locale37 = new java.util.Locale("");
        java.lang.String str38 = locale37.getDisplayVariant();
        java.util.Locale locale39 = java.util.Locale.KOREAN;
        java.util.Locale locale41 = new java.util.Locale("");
        java.util.Locale locale42 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale[] localeArray43 = new java.util.Locale[] { locale14, locale16, locale17, locale18, locale19, locale24, locale26, locale32, locale34, locale37, locale39, locale41, locale42 };
        java.util.ArrayList<java.util.Locale> localeList44 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList44, localeArray43);
        java.util.List<java.util.Locale> localeList46 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList11, (java.util.Collection<java.util.Locale>) localeList44);
        java.lang.String[] strArray54 = new java.lang.String[] { "English", "hi", "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "", "a", "", "China" };
        java.util.ArrayList<java.lang.String> strList55 = new java.util.ArrayList<java.lang.String>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList55, strArray54);
        java.util.List<java.lang.Class<?>> wildcardClassList57 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList55);
        java.util.Locale.FilteringMode filteringMode58 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList59 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList11, (java.util.Collection<java.lang.String>) strList55, filteringMode58);
        java.util.List<java.lang.String> strList60 = java.util.Locale.filterTags(languageRangeList4, (java.util.Collection<java.lang.String>) strList8, filteringMode58);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor61 = languageRangeList4.listIterator();
        java.util.function.UnaryOperator<java.util.Locale.LanguageRange> languageRangeUnaryOperator62 = null;
        // The following exception was thrown during execution in test generation
        try {
            languageRangeList4.replaceAll(languageRangeUnaryOperator62);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(languageRangeItor5);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(languageRangeArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "english" + "'", str15, "english");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale20);
// flaky:         org.junit.Assert.assertEquals(locale20.toString(), "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "China" + "'", str21, "China");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "zh-CN" + "'", str22, "zh-CN");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale24);
// flaky:         org.junit.Assert.assertEquals(locale24.toString(), "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "China" + "'", str25, "China");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale27);
// flaky:         org.junit.Assert.assertEquals(locale27.toString(), "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "China" + "'", str28, "China");
        org.junit.Assert.assertEquals(locale32.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale34);
// flaky:         org.junit.Assert.assertEquals(locale34.toString(), "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "China" + "'", str35, "China");
        org.junit.Assert.assertEquals(locale37.toString(), "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "ko");
        org.junit.Assert.assertEquals(locale41.toString(), "");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(localeList46);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(wildcardClassList57);
        org.junit.Assert.assertTrue("'" + filteringMode58 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode58.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList59);
        org.junit.Assert.assertNotNull(strList60);
        org.junit.Assert.assertNotNull(languageRangeItor61);
    }

    @Test
    public void test15059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15059");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("hi");
        java.lang.Object[] objArray2 = languageRangeList1.toArray();
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream3 = languageRangeList1.parallelStream();
        int int5 = languageRangeList1.lastIndexOf((java.lang.Object) "Short");
        java.util.Iterator<java.util.Locale.LanguageRange> languageRangeItor6 = languageRangeList1.iterator();
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "Engls", (int) (byte) 1);
        int int11 = languageRangeList1.lastIndexOf((java.lang.Object) "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
        int int13 = languageRangeList1.lastIndexOf((java.lang.Object) ".......................HI.......................");
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(languageRangeStream3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(languageRangeItor6);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test15060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15060");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("HI", strMap1);
        java.lang.String str4 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) languageRangeList2, "\u53f0\u7063");
        boolean boolean6 = languageRangeList2.equals((java.lang.Object) "EN_CA");
        java.util.Locale locale7 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale8 = java.util.Locale.getDefault();
        java.lang.String str9 = locale7.getDisplayCountry(locale8);
        java.lang.String str10 = locale7.toLanguageTag();
        java.lang.String str11 = locale7.getLanguage();
        java.util.Locale locale12 = java.util.Locale.ITALIAN;
        java.util.Locale locale14 = new java.util.Locale("");
        java.lang.String str15 = locale14.getDisplayLanguage();
        java.util.Locale locale16 = java.util.Locale.CANADA;
        java.lang.String str17 = locale16.getDisplayLanguage();
        java.lang.String str18 = locale14.getDisplayScript(locale16);
        java.util.Locale locale20 = java.util.Locale.FRANCE;
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale20);
        java.lang.String str22 = locale14.getDisplayCountry(locale20);
        java.lang.String str23 = locale12.getDisplayScript(locale14);
        java.util.Locale locale24 = java.util.Locale.GERMAN;
        java.lang.String str25 = locale14.getDisplayLanguage(locale24);
        java.lang.String str26 = locale7.getDisplayCountry(locale14);
        java.util.Locale locale27 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale28 = java.util.Locale.getDefault();
        java.lang.String str29 = locale27.getDisplayCountry(locale28);
        java.util.Locale locale30 = null;
        java.lang.String str31 = locale28.getDisplayVariant(locale30);
        java.util.Locale locale32 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale33 = java.util.Locale.getDefault();
        java.lang.String str34 = locale32.getDisplayCountry(locale33);
        java.lang.String str35 = locale32.toLanguageTag();
        java.lang.String str36 = locale28.getDisplayCountry(locale32);
        java.lang.String str37 = locale7.getDisplayName(locale32);
        java.util.Set<java.lang.String> strSet38 = locale32.getUnicodeLocaleKeys();
        java.lang.String str40 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) strSet38, "hi!hi! (                 A                 )#################################################");
        java.lang.String str41 = java.util.Locale.lookupTag(languageRangeList2, (java.util.Collection<java.lang.String>) strSet38);
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ArrayList" + "'", str4, "ArrayList");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale8);
// flaky:         org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "China" + "'", str9, "China");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "zh-CN" + "'", str10, "zh-CN");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "zh" + "'", str11, "zh");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "it");
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "English" + "'", str17, "English");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "english" + "'", str21, "english");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "de");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "China" + "'", str26, "China");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale28);
// flaky:         org.junit.Assert.assertEquals(locale28.toString(), "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "China" + "'", str29, "China");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale33);
// flaky:         org.junit.Assert.assertEquals(locale33.toString(), "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "China" + "'", str34, "China");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "zh-CN" + "'", str35, "zh-CN");
// flaky:         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
// flaky:         org.junit.Assert.assertEquals("'" + str37 + "' != '" + "\u4e2d\u6587\u4e2d\u56fd)" + "'", str37, "\u4e2d\u6587\u4e2d\u56fd)");
        org.junit.Assert.assertNotNull(strSet38);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "java.util" + "'", str40, "java.util");
        org.junit.Assert.assertNull(str41);
    }

    @Test
    public void test15061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15061");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.lang.String str1 = locale0.getLanguage();
        java.lang.String str2 = locale0.getDisplayVariant();
        java.util.Locale.Builder builder4 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        java.util.Locale.Builder builder7 = builder5.setLanguageTag("zh-CN");
        java.util.Locale.Builder builder9 = builder7.setLanguage("CHINA");
        java.util.Locale locale10 = builder7.build();
        java.util.Set<java.lang.String> strSet11 = locale10.getUnicodeLocaleKeys();
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.lowerCase("Zxxxxxxxxxxxxxxxxxxx", locale10);
        java.lang.String str13 = locale10.getDisplayLanguage();
        java.lang.String str14 = locale0.getDisplayLanguage(locale10);
        java.lang.String str15 = locale0.getVariant();
        java.util.Locale locale16 = locale0.stripExtensions();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "it" + "'", str1, "it");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "china_CN");
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "zxxxxxxxxxxxxxxxxxxx" + "'", str12, "zxxxxxxxxxxxxxxxxxxx");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "china" + "'", str13, "china");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Italian" + "'", str14, "Italian");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "it");
    }

    @Test
    public void test15062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15062");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("java . lang", "\u4e2d\u56fdAD.AE.AF");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test15063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15063");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.setLanguageTag("zh-CN");
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale.Builder builder6 = builder3.setLanguageTag("ANIHC");
        java.util.Locale.Builder builder7 = builder3.clearExtensions();
        java.lang.String str9 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) builder3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder3.setRegion("zh-cnenglh");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: zh-cnenglh [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Locale.Builder" + "'", str9, "Locale.Builder");
    }

    @Test
    public void test15064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15064");
        java.util.Locale locale1 = new java.util.Locale("Italiano");
        org.junit.Assert.assertEquals(locale1.toString(), "italiano");
    }

    @Test
    public void test15065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15065");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("                       Hindi                        ", "zh-cn");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                       Hindi                        " + "'", str2, "                       Hindi                        ");
    }

    @Test
    public void test15066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15066");
        char[] charArray7 = new char[] {};
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "zh-CN", charArray7);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsAny("                 a                  ", charArray7);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) ".", charArray7);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "#################################################################################################", charArray7);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "CHINCHINCHINCHINCHINCHINCHINCHINCHINAAAAAAAAA#", charArray7);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) ".english", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test15067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15067");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("\u6587\u5fb7", ".....ZHCINESESE", 31);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concatWith("ololololololololololololololololololololololololololololololololololololololololololololololololololololololololololololololololololololololololololololololololololololololololololololololololololololololololololololololololololololol", (java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u6587\u5fb7" + "'", str5, "\u6587\u5fb7");
    }

    @Test
    public void test15068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15068");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("\u5fb7\u6587", "                                redliuB                                   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                redliuB                                   " + "'", str2, "                                redliuB                                   ");
    }

    @Test
    public void test15069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15069");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("italiahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIital...", "englCNsCNxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test15070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15070");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("ENGL....ENGLISHS....ENGLISH", "slgnEslgnEslgnEfran\347axsx(Canada)slgnEslgnEslgnEs");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test15071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15071");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("slgnE", '.', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "slgnE" + "'", str3, "slgnE");
    }

    @Test
    public void test15072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15072");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("         HI!HI!HI!HI!HI!HI          ", '$');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "         HI!HI!HI!HI!HI!HI          " + "'", str2, "         HI!HI!HI!HI!HI!HI          ");
    }

    @Test
    public void test15073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15073");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("EnglGermnsGermn", "cinaxxxxxcNn");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test15074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15074");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("java.langfr_FR", 0, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.langfr_FR" + "'", str3, "java.langfr_FR");
    }

    @Test
    public void test15075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15075");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortClassName("ARRAYLIST");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ARRAYLIST" + "'", str1, "ARRAYLIST");
    }

    @Test
    public void test15076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15076");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("English");
        java.lang.String str2 = languageRange1.getRange();
        java.util.Locale.LanguageRange languageRange4 = new java.util.Locale.LanguageRange("English");
        java.lang.String str5 = languageRange4.getRange();
        java.util.Locale.LanguageRange languageRange7 = new java.util.Locale.LanguageRange("English");
        java.util.Locale.LanguageRange[] languageRangeArray8 = new java.util.Locale.LanguageRange[] { languageRange1, languageRange4, languageRange7 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList9 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList9, languageRangeArray8);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream11 = languageRangeList9.stream();
        boolean boolean12 = languageRangeList9.isEmpty();
        java.util.function.UnaryOperator<java.util.Locale.LanguageRange> languageRangeUnaryOperator13 = null;
        // The following exception was thrown during execution in test generation
        try {
            languageRangeList9.replaceAll(languageRangeUnaryOperator13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "english" + "'", str2, "english");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "english" + "'", str5, "english");
        org.junit.Assert.assertNotNull(languageRangeArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(languageRangeStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test15077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15077");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "...gggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....eng..");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...gggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....eng.." + "'", str1, "...gggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....eng..");
    }

    @Test
    public void test15078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15078");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("englhi!string[]string[]sshi!string[]string[]s");
        java.lang.String str2 = locale1.getVariant();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test15079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15079");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.getDefault(category0);
        java.util.Locale locale3 = java.util.Locale.getDefault(category0);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
// flaky:         org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(locale3);
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "");
    }

    @Test
    public void test15080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15080");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("t           hindi(HI!,cHINA)", 211, '.');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...........................................................................................t           hindi(HI!,cHINA)............................................................................................" + "'", str3, "...........................................................................................t           hindi(HI!,cHINA)............................................................................................");
    }

    @Test
    public void test15081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15081");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("                  hI                   ", "##############acoL###############");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                  hI                   " + "'", str2, "                  hI                   ");
    }

    @Test
    public void test15082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15082");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("a", "cHINA");
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("LOCALE.LANGUAGERANGE", strArray4);
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("util", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) "util", "string[]");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "String" + "'", str8, "String");
    }

    @Test
    public void test15083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15083");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("chinchinchinchinchinchinchinchinchinaaaaaaaaa#", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 20);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("         HI!HI!HI!HI!HI!HI          ", "locale.builde", (int) 'u');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEach("ja", strArray4, strArray8);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ja" + "'", str9, "ja");
    }

    @Test
    public void test15084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15084");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap3);
        int int5 = languageRangeList1.size();
        java.util.Locale.LanguageRange languageRange7 = new java.util.Locale.LanguageRange("English");
        java.util.Locale.LanguageRange languageRange9 = new java.util.Locale.LanguageRange("English");
        java.util.Locale.LanguageRange languageRange11 = new java.util.Locale.LanguageRange("a");
        java.util.Locale.LanguageRange[] languageRangeArray12 = new java.util.Locale.LanguageRange[] { languageRange7, languageRange9, languageRange11 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList13 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList13, languageRangeArray12);
        boolean boolean15 = languageRangeList1.retainAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList13);
        java.util.Locale locale18 = new java.util.Locale("");
        java.lang.String str19 = locale18.getDisplayLanguage();
        java.util.Locale locale20 = java.util.Locale.CANADA;
        java.lang.String str21 = locale20.getDisplayLanguage();
        java.lang.String str22 = locale18.getDisplayScript(locale20);
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.lowerCase("a", locale18);
        java.lang.String str24 = locale18.getDisplayScript();
        java.util.Set<java.lang.String> strSet25 = locale18.getUnicodeLocaleAttributes();
        java.util.Locale.FilteringMode filteringMode26 = null;
        java.util.List<java.lang.String> strList27 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList13, (java.util.Collection<java.lang.String>) strSet25, filteringMode26);
        java.lang.String str29 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList13, "\u6cd5\u6587");
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream30 = languageRangeList13.stream();
        java.util.List<java.util.Locale.LanguageRange> languageRangeList32 = java.util.Locale.LanguageRange.parse("hi");
        boolean boolean34 = languageRangeList32.remove((java.lang.Object) "English");
        java.util.Locale.LanguageRange languageRange36 = languageRangeList32.get(0);
        boolean boolean37 = languageRangeList13.retainAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList32);
        java.lang.Object[] objArray38 = languageRangeList13.toArray();
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor40 = languageRangeList13.listIterator((int) (short) 0);
        boolean boolean41 = languageRangeItor40.hasNext();
        // The following exception was thrown during execution in test generation
        try {
            languageRangeItor40.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(languageRangeArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals(locale18.toString(), "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "English" + "'", str21, "English");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "a" + "'", str23, "a");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertNotNull(strList27);
        org.junit.Assert.assertNotNull(languageRangeStream30);
        org.junit.Assert.assertNotNull(languageRangeList32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(languageRange36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[]");
        org.junit.Assert.assertNotNull(languageRangeItor40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test15085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15085");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("CHN     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "CHN" + "'", str1, "CHN");
    }

    @Test
    public void test15086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15086");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "N...", "          xxxxxxxL          xxxxxxxL          xxxxxxxL          xxxxxxxL          xxxxxxxL          xxxxxxxL          xxxxxxxL          xxxxxxxL          xxxxxxxL          xxxxxxxL          xxxxxxxL          xxxxxxxL          xxxxxxxL          xxxxxxxL          xxxxxxxL          xxxxxxxL          xxxxxxxL          xxxxxxxL          xxxxxxxL          xxxxxxxL          xxxxxxxL          xxxxxxxL          xxxxxxxL          xxxxxxxL          xxxxxxxL          xxxxxxxL          xxxxxxxL          xxxxxxxL          xxxxxxxL          xxxxxxxL          xxxxxxxL          xxxxxxxL          xxxxxxxL          xxxxxxxL          xxxxxxxL          xxxxxxxL          xxxxxxxL          xxxxxxxL          xxxxxxxL          xxxxxxxL          xxxxxxxL          xxxxxxxL          xxxxxxxL          xxxxxxxL          xxxxxxxL          xxxxxxxL          xxxxxxxL          xxxxxxx");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test15087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15087");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "twn");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test15088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15088");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("                                redliuB", (double) 33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=33.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test15089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15089");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("en-ca", "444444444444444444444444444444444444444444444444AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAANIHc");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test15090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15090");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("hi");
        java.lang.Object[] objArray2 = languageRangeList1.toArray();
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream3 = languageRangeList1.parallelStream();
        java.util.Locale.LanguageRange[] languageRangeArray4 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList5 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList5, languageRangeArray4);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap7 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList8 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList5, strMap7);
        java.lang.String[] strArray16 = new java.lang.String[] { "English", "hi", "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "", "a", "", "China" };
        java.util.ArrayList<java.lang.String> strList17 = new java.util.ArrayList<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList17, strArray16);
        java.util.List<java.lang.Class<?>> wildcardClassList19 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList17);
        java.lang.String str20 = java.util.Locale.lookupTag(languageRangeList8, (java.util.Collection<java.lang.String>) strList17);
        java.util.List<java.lang.Class<?>> wildcardClassList21 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList17);
        java.util.List<java.lang.String> strList22 = java.util.Locale.filterTags(languageRangeList1, (java.util.Collection<java.lang.String>) strList17);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList24 = java.util.Locale.LanguageRange.parse("hi");
        boolean boolean26 = languageRangeList24.remove((java.lang.Object) "English");
        java.util.Locale.LanguageRange[] languageRangeArray27 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList28 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList28, languageRangeArray27);
        java.util.Locale locale31 = java.util.Locale.FRANCE;
        java.lang.String str32 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale31);
        java.util.Locale locale33 = java.util.Locale.US;
        java.util.Locale locale34 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale35 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale36 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale37 = java.util.Locale.getDefault();
        java.lang.String str38 = locale36.getDisplayCountry(locale37);
        java.lang.String str39 = locale36.toLanguageTag();
        java.util.Locale locale40 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale41 = java.util.Locale.getDefault();
        java.lang.String str42 = locale40.getDisplayCountry(locale41);
        java.util.Locale locale43 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale44 = java.util.Locale.getDefault();
        java.lang.String str45 = locale43.getDisplayCountry(locale44);
        java.util.Locale locale49 = new java.util.Locale("hi", "hi!", "cHINA");
        java.util.Locale locale50 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale51 = java.util.Locale.getDefault();
        java.lang.String str52 = locale50.getDisplayCountry(locale51);
        java.util.Locale locale54 = new java.util.Locale("");
        java.lang.String str55 = locale54.getDisplayVariant();
        java.util.Locale locale56 = java.util.Locale.KOREAN;
        java.util.Locale locale58 = new java.util.Locale("");
        java.util.Locale locale59 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale[] localeArray60 = new java.util.Locale[] { locale31, locale33, locale34, locale35, locale36, locale41, locale43, locale49, locale51, locale54, locale56, locale58, locale59 };
        java.util.ArrayList<java.util.Locale> localeList61 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList61, localeArray60);
        java.util.List<java.util.Locale> localeList63 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList28, (java.util.Collection<java.util.Locale>) localeList61);
        java.util.List<java.util.Locale> localeList64 = java.util.Locale.filter(languageRangeList24, (java.util.Collection<java.util.Locale>) localeList61);
        java.util.Locale.LanguageRange[] languageRangeArray65 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList66 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList66, languageRangeArray65);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap68 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList69 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList66, strMap68);
        int int70 = languageRangeList66.size();
        java.util.Locale.LanguageRange languageRange72 = new java.util.Locale.LanguageRange("English");
        java.util.Locale.LanguageRange languageRange74 = new java.util.Locale.LanguageRange("English");
        java.util.Locale.LanguageRange languageRange76 = new java.util.Locale.LanguageRange("a");
        java.util.Locale.LanguageRange[] languageRangeArray77 = new java.util.Locale.LanguageRange[] { languageRange72, languageRange74, languageRange76 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList78 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList78, languageRangeArray77);
        boolean boolean80 = languageRangeList66.retainAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList78);
        boolean boolean81 = languageRangeList24.containsAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList66);
        java.util.Locale locale82 = java.util.Locale.CANADA;
        java.util.Set<java.lang.Character> charSet83 = locale82.getExtensionKeys();
        boolean boolean84 = languageRangeList24.contains((java.lang.Object) locale82);
        boolean boolean85 = languageRangeList1.contains((java.lang.Object) languageRangeList24);
        java.util.Locale.LanguageRange languageRange87 = languageRangeList1.get((int) (byte) 0);
        double double88 = languageRange87.getWeight();
        double double89 = languageRange87.getWeight();
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(languageRangeStream3);
        org.junit.Assert.assertNotNull(languageRangeArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(languageRangeList8);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClassList19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(wildcardClassList21);
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertNotNull(languageRangeList24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(languageRangeArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "english" + "'", str32, "english");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale37);
// flaky:         org.junit.Assert.assertEquals(locale37.toString(), "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "China" + "'", str38, "China");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "zh-CN" + "'", str39, "zh-CN");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale41);
// flaky:         org.junit.Assert.assertEquals(locale41.toString(), "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "China" + "'", str42, "China");
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale44);
// flaky:         org.junit.Assert.assertEquals(locale44.toString(), "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "China" + "'", str45, "China");
        org.junit.Assert.assertEquals(locale49.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale51);
// flaky:         org.junit.Assert.assertEquals(locale51.toString(), "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "China" + "'", str52, "China");
        org.junit.Assert.assertEquals(locale54.toString(), "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertNotNull(locale56);
        org.junit.Assert.assertEquals(locale56.toString(), "ko");
        org.junit.Assert.assertEquals(locale58.toString(), "");
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(localeList63);
        org.junit.Assert.assertNotNull(localeList64);
        org.junit.Assert.assertNotNull(languageRangeArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(languageRangeList69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertNotNull(languageRangeArray77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(locale82);
        org.junit.Assert.assertEquals(locale82.toString(), "en_CA");
        org.junit.Assert.assertNotNull(charSet83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(languageRange87);
        org.junit.Assert.assertTrue("'" + double88 + "' != '" + 1.0d + "'", double88 == 1.0d);
        org.junit.Assert.assertTrue("'" + double89 + "' != '" + 1.0d + "'", double89 == 1.0d);
    }

    @Test
    public void test15091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15091");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap3);
        int int5 = languageRangeList1.size();
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor6 = languageRangeList1.listIterator();
        java.lang.String str8 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) languageRangeList1, "....english");
        java.util.Locale.LanguageRange[] languageRangeArray9 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList10 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList10, languageRangeArray9);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap12 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList13 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList10, strMap12);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor14 = languageRangeList13.listIterator();
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList17 = new java.util.ArrayList<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList17, strArray16);
        java.util.Locale.LanguageRange[] languageRangeArray19 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList20 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList20, languageRangeArray19);
        java.util.Locale locale23 = java.util.Locale.FRANCE;
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale23);
        java.util.Locale locale25 = java.util.Locale.US;
        java.util.Locale locale26 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale27 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale28 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale29 = java.util.Locale.getDefault();
        java.lang.String str30 = locale28.getDisplayCountry(locale29);
        java.lang.String str31 = locale28.toLanguageTag();
        java.util.Locale locale32 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale33 = java.util.Locale.getDefault();
        java.lang.String str34 = locale32.getDisplayCountry(locale33);
        java.util.Locale locale35 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale36 = java.util.Locale.getDefault();
        java.lang.String str37 = locale35.getDisplayCountry(locale36);
        java.util.Locale locale41 = new java.util.Locale("hi", "hi!", "cHINA");
        java.util.Locale locale42 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale43 = java.util.Locale.getDefault();
        java.lang.String str44 = locale42.getDisplayCountry(locale43);
        java.util.Locale locale46 = new java.util.Locale("");
        java.lang.String str47 = locale46.getDisplayVariant();
        java.util.Locale locale48 = java.util.Locale.KOREAN;
        java.util.Locale locale50 = new java.util.Locale("");
        java.util.Locale locale51 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale[] localeArray52 = new java.util.Locale[] { locale23, locale25, locale26, locale27, locale28, locale33, locale35, locale41, locale43, locale46, locale48, locale50, locale51 };
        java.util.ArrayList<java.util.Locale> localeList53 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList53, localeArray52);
        java.util.List<java.util.Locale> localeList55 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList20, (java.util.Collection<java.util.Locale>) localeList53);
        java.lang.String[] strArray63 = new java.lang.String[] { "English", "hi", "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "", "a", "", "China" };
        java.util.ArrayList<java.lang.String> strList64 = new java.util.ArrayList<java.lang.String>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList64, strArray63);
        java.util.List<java.lang.Class<?>> wildcardClassList66 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList64);
        java.util.Locale.FilteringMode filteringMode67 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList68 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList20, (java.util.Collection<java.lang.String>) strList64, filteringMode67);
        java.util.List<java.lang.String> strList69 = java.util.Locale.filterTags(languageRangeList13, (java.util.Collection<java.lang.String>) strList17, filteringMode67);
        java.util.Locale.LanguageRange[] languageRangeArray70 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList71 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList71, languageRangeArray70);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap73 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList74 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList71, strMap73);
        int int75 = languageRangeList71.size();
        boolean boolean76 = languageRangeList13.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList71);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap77 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList78 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList13, strMap77);
        boolean boolean79 = languageRangeList1.containsAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList78);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap80 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList81 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap80);
        int int82 = languageRangeList81.size();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange84 = languageRangeList81.remove((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(languageRangeItor6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ArrayList" + "'", str8, "ArrayList");
        org.junit.Assert.assertNotNull(languageRangeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(languageRangeList13);
        org.junit.Assert.assertNotNull(languageRangeItor14);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(languageRangeArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "english" + "'", str24, "english");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale29);
// flaky:         org.junit.Assert.assertEquals(locale29.toString(), "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "China" + "'", str30, "China");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "zh-CN" + "'", str31, "zh-CN");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale33);
// flaky:         org.junit.Assert.assertEquals(locale33.toString(), "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "China" + "'", str34, "China");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale36);
// flaky:         org.junit.Assert.assertEquals(locale36.toString(), "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "China" + "'", str37, "China");
        org.junit.Assert.assertEquals(locale41.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale43);
// flaky:         org.junit.Assert.assertEquals(locale43.toString(), "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "China" + "'", str44, "China");
        org.junit.Assert.assertEquals(locale46.toString(), "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "ko");
        org.junit.Assert.assertEquals(locale50.toString(), "");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(localeList55);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(wildcardClassList66);
        org.junit.Assert.assertTrue("'" + filteringMode67 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode67.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList68);
        org.junit.Assert.assertNotNull(strList69);
        org.junit.Assert.assertNotNull(languageRangeArray70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(languageRangeList74);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(languageRangeList78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(languageRangeList81);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
    }

    @Test
    public void test15092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15092");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "EnglisaCOL");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test15093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15093");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("\u4e2d", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u4e2d" + "'", str2, "\u4e2d");
    }

    @Test
    public void test15094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15094");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap3);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor5 = languageRangeList4.listIterator();
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        java.util.Locale.LanguageRange[] languageRangeArray10 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList11 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList11, languageRangeArray10);
        java.util.Locale locale14 = java.util.Locale.FRANCE;
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale14);
        java.util.Locale locale16 = java.util.Locale.US;
        java.util.Locale locale17 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale18 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale19 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale20 = java.util.Locale.getDefault();
        java.lang.String str21 = locale19.getDisplayCountry(locale20);
        java.lang.String str22 = locale19.toLanguageTag();
        java.util.Locale locale23 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale24 = java.util.Locale.getDefault();
        java.lang.String str25 = locale23.getDisplayCountry(locale24);
        java.util.Locale locale26 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale27 = java.util.Locale.getDefault();
        java.lang.String str28 = locale26.getDisplayCountry(locale27);
        java.util.Locale locale32 = new java.util.Locale("hi", "hi!", "cHINA");
        java.util.Locale locale33 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale34 = java.util.Locale.getDefault();
        java.lang.String str35 = locale33.getDisplayCountry(locale34);
        java.util.Locale locale37 = new java.util.Locale("");
        java.lang.String str38 = locale37.getDisplayVariant();
        java.util.Locale locale39 = java.util.Locale.KOREAN;
        java.util.Locale locale41 = new java.util.Locale("");
        java.util.Locale locale42 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale[] localeArray43 = new java.util.Locale[] { locale14, locale16, locale17, locale18, locale19, locale24, locale26, locale32, locale34, locale37, locale39, locale41, locale42 };
        java.util.ArrayList<java.util.Locale> localeList44 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList44, localeArray43);
        java.util.List<java.util.Locale> localeList46 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList11, (java.util.Collection<java.util.Locale>) localeList44);
        java.lang.String[] strArray54 = new java.lang.String[] { "English", "hi", "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "", "a", "", "China" };
        java.util.ArrayList<java.lang.String> strList55 = new java.util.ArrayList<java.lang.String>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList55, strArray54);
        java.util.List<java.lang.Class<?>> wildcardClassList57 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList55);
        java.util.Locale.FilteringMode filteringMode58 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList59 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList11, (java.util.Collection<java.lang.String>) strList55, filteringMode58);
        java.util.List<java.lang.String> strList60 = java.util.Locale.filterTags(languageRangeList4, (java.util.Collection<java.lang.String>) strList8, filteringMode58);
        java.util.Locale.LanguageRange[] languageRangeArray61 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList62 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList62, languageRangeArray61);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap64 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList65 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList62, strMap64);
        int int66 = languageRangeList62.size();
        boolean boolean67 = languageRangeList4.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList62);
        java.lang.String str69 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) languageRangeList62, "");
        java.lang.String[] strArray72 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("ANIHC      xxxxhIxxx");
        java.lang.String[] strArray73 = null;
        java.lang.String str74 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("fr_CA", strArray72, strArray73);
        boolean boolean75 = languageRangeList62.equals((java.lang.Object) "fr_CA");
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(languageRangeItor5);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(languageRangeArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "english" + "'", str15, "english");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale20);
// flaky:         org.junit.Assert.assertEquals(locale20.toString(), "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "China" + "'", str21, "China");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "zh-CN" + "'", str22, "zh-CN");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale24);
// flaky:         org.junit.Assert.assertEquals(locale24.toString(), "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "China" + "'", str25, "China");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale27);
// flaky:         org.junit.Assert.assertEquals(locale27.toString(), "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "China" + "'", str28, "China");
        org.junit.Assert.assertEquals(locale32.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale34);
// flaky:         org.junit.Assert.assertEquals(locale34.toString(), "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "China" + "'", str35, "China");
        org.junit.Assert.assertEquals(locale37.toString(), "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "ko");
        org.junit.Assert.assertEquals(locale41.toString(), "");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(localeList46);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(wildcardClassList57);
        org.junit.Assert.assertTrue("'" + filteringMode58 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode58.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList59);
        org.junit.Assert.assertNotNull(strList60);
        org.junit.Assert.assertNotNull(languageRangeArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(languageRangeList65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "java.util" + "'", str69, "java.util");
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "fr_CA" + "'", str74, "fr_CA");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
    }

    @Test
    public void test15095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15095");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("CHNAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "chnaaaaaaaaaaaaaaaaaaaaaaaaaaaaa..." + "'", str1, "chnaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
    }

    @Test
    public void test15096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15096");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("hi");
        java.lang.Object[] objArray2 = languageRangeList1.toArray();
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream3 = languageRangeList1.parallelStream();
        java.util.Locale.LanguageRange[] languageRangeArray4 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList5 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList5, languageRangeArray4);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap7 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList8 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList5, strMap7);
        java.util.Locale.LanguageRange[] languageRangeArray9 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList10 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList10, languageRangeArray9);
        boolean boolean12 = languageRangeList5.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList10);
        java.util.Locale.LanguageRange[] languageRangeArray13 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList14 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList14, languageRangeArray13);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap16 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList17 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList14, strMap16);
        java.util.Locale.LanguageRange[] languageRangeArray18 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList19 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList19, languageRangeArray18);
        boolean boolean21 = languageRangeList14.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList19);
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList19, "hi!");
        boolean boolean24 = languageRangeList5.remove((java.lang.Object) languageRangeList19);
        boolean boolean25 = languageRangeList1.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList19);
        java.util.Locale.LanguageRange languageRange27 = new java.util.Locale.LanguageRange("cn");
        boolean boolean28 = languageRangeList1.add(languageRange27);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream29 = languageRangeList1.stream();
        java.lang.Object obj30 = null;
        boolean boolean31 = languageRangeList1.contains(obj30);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor32 = languageRangeList1.listIterator();
        java.util.List<java.util.Locale.LanguageRange> languageRangeList35 = java.util.Locale.LanguageRange.parse("hi");
        java.lang.Object[] objArray36 = languageRangeList35.toArray();
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream37 = languageRangeList35.parallelStream();
        java.util.Locale.LanguageRange[] languageRangeArray38 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList39 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList39, languageRangeArray38);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap41 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList42 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList39, strMap41);
        java.util.Locale.LanguageRange[] languageRangeArray43 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList44 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList44, languageRangeArray43);
        boolean boolean46 = languageRangeList39.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList44);
        java.util.Locale.LanguageRange[] languageRangeArray47 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList48 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList48, languageRangeArray47);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap50 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList51 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList48, strMap50);
        java.util.Locale.LanguageRange[] languageRangeArray52 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList53 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList53, languageRangeArray52);
        boolean boolean55 = languageRangeList48.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList53);
        java.lang.String str57 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList53, "hi!");
        boolean boolean58 = languageRangeList39.remove((java.lang.Object) languageRangeList53);
        boolean boolean59 = languageRangeList35.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList53);
        java.util.Locale.LanguageRange languageRange61 = new java.util.Locale.LanguageRange("cn");
        boolean boolean62 = languageRangeList35.add(languageRange61);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream63 = languageRangeList35.stream();
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap64 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList65 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList35, strMap64);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean66 = languageRangeList1.addAll(186, (java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList65);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 186, Size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(languageRangeStream3);
        org.junit.Assert.assertNotNull(languageRangeArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(languageRangeList8);
        org.junit.Assert.assertNotNull(languageRangeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(languageRangeArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(languageRangeList17);
        org.junit.Assert.assertNotNull(languageRangeArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(languageRangeStream29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(languageRangeItor32);
        org.junit.Assert.assertNotNull(languageRangeList35);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertNotNull(languageRangeStream37);
        org.junit.Assert.assertNotNull(languageRangeArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(languageRangeList42);
        org.junit.Assert.assertNotNull(languageRangeArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(languageRangeArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(languageRangeList51);
        org.junit.Assert.assertNotNull(languageRangeArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(languageRangeStream63);
        org.junit.Assert.assertNotNull(languageRangeList65);
    }

    @Test
    public void test15097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15097");
        java.util.Locale locale1 = new java.util.Locale("fr-FR");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = locale1.getExtension('4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale1.toString(), "fr-fr");
    }

    @Test
    public void test15098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15098");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxchn     ", "\u4e2d\u56fdAD.AE.AFananananananananananananananananananananan", (int) 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxchn     " + "'", str3, "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxchn     ");
    }

    @Test
    public void test15099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15099");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "United States");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test15100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15100");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("CHINA", strMap1);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap4 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList5 = java.util.Locale.LanguageRange.parse("Cina", strMap4);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap6 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList7 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList5, strMap6);
        java.util.Locale.LanguageRange[] languageRangeArray8 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList9 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList9, languageRangeArray8);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap11 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList12 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList9, strMap11);
        int int13 = languageRangeList9.size();
        boolean boolean14 = languageRangeList5.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList9);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream15 = languageRangeList5.stream();
        java.util.Locale.LanguageRange[] languageRangeArray16 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList17 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList17, languageRangeArray16);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap19 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList20 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList17, strMap19);
        int int21 = languageRangeList17.size();
        java.util.List<java.util.Locale.LanguageRange> languageRangeList23 = java.util.Locale.LanguageRange.parse("hi");
        boolean boolean25 = languageRangeList23.remove((java.lang.Object) "English");
        boolean boolean26 = languageRangeList17.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList23);
        java.lang.String[] strArray31 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("English", "hi", (int) (short) -1);
        java.lang.String[] strArray34 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("a", "");
        java.lang.String[] strArray35 = org.apache.commons.lang3.StringUtils.stripAll(strArray34);
        java.lang.String[] strArray36 = org.apache.commons.lang3.StringUtils.stripAll(strArray35);
        java.lang.String str37 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", strArray31, strArray35);
        boolean boolean38 = languageRangeList17.equals((java.lang.Object) strArray35);
        java.util.Locale locale41 = new java.util.Locale("");
        java.lang.String str42 = locale41.getDisplayLanguage();
        java.util.Locale locale43 = java.util.Locale.CANADA;
        java.lang.String str44 = locale43.getDisplayLanguage();
        java.lang.String str45 = locale41.getDisplayScript(locale43);
        java.lang.String str46 = org.apache.commons.lang3.StringUtils.lowerCase("a", locale41);
        java.lang.String str47 = locale41.getDisplayScript();
        java.util.Set<java.lang.String> strSet48 = locale41.getUnicodeLocaleAttributes();
        java.util.List<java.lang.String> strList49 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList17, (java.util.Collection<java.lang.String>) strSet48);
        java.util.List<java.lang.String> strList50 = java.util.Locale.filterTags(languageRangeList5, (java.util.Collection<java.lang.String>) strSet48);
        java.lang.String str51 = java.util.Locale.lookupTag(languageRangeList2, (java.util.Collection<java.lang.String>) strSet48);
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeList5);
        org.junit.Assert.assertNotNull(languageRangeList7);
        org.junit.Assert.assertNotNull(languageRangeArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(languageRangeList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(languageRangeStream15);
        org.junit.Assert.assertNotNull(languageRangeArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(languageRangeList20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(languageRangeList23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h" + "'", str37, "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals(locale41.toString(), "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "English" + "'", str44, "English");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "a" + "'", str46, "a");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(strSet48);
        org.junit.Assert.assertNotNull(strList49);
        org.junit.Assert.assertNotNull(strList50);
        org.junit.Assert.assertNull(str51);
    }

    @Test
    public void test15101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15101");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("java.util", "                                                javacinese.cineselang                                                ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test15102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15102");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("hi!", "i", 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test15103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15103");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = org.apache.commons.lang3.ClassUtils.getClass("$$$$$$$$$$$$$$$$$a$$$$$$$$$$$$$$$$$");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: $$$$$$$$$$$$$$$$$a$$$$$$$$$$$$$$$$$");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test15104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15104");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "NIRTSGNIRTSGNIRTSGNIRTSGNIRTSGNIRTSGNIRTSGNIRTSGNIRTSGNIRTSGNIRTSGNIRTSGNIRTSGNIRTSGNIRTSGNIRTSAC-NE                                                                                                                                                                                                                                                          ", "TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test15105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15105");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "AD.AE.AF", (java.lang.CharSequence) "francese");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "AD.AE.AF" + "'", charSequence2, "AD.AE.AF");
    }

    @Test
    public void test15106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15106");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("N...", "ITALIEN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "N..." + "'", str2, "N...");
    }

    @Test
    public void test15107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15107");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("E!E(TIIWIN", "                                           ITALIAHi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test15108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15108");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "\u4e2d\u56fdAD.AE.AFananananananananananananananananananananan");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test15109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15109");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("slgnEslgnEslgnEfran\347axsx(Canada)slgnEslgnEslgnEs", "undaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaH", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test15110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15110");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("china-CN");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test15111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15111");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("class java.lang.string");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test15112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15112");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("l.avajstring[]string[]string[", 5);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "l...." + "'", str2, "l....");
    }

    @Test
    public void test15113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15113");
        java.util.Locale locale0 = java.util.Locale.CANADA;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.String> strSet2 = locale0.getUnicodeLocaleAttributes();
        java.lang.String str3 = locale0.getDisplayVariant();
        java.util.Set<java.lang.Character> charSet4 = locale0.getExtensionKeys();
        boolean boolean5 = locale0.hasExtensions();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_CA");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charSet4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test15114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15114");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap3);
        int int5 = languageRangeList1.size();
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor6 = languageRangeList1.listIterator();
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.util.Iterator<java.util.Locale.LanguageRange>) languageRangeItor6, "Chinaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.util.Iterator<java.util.Locale.LanguageRange>) languageRangeItor6, 'x');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.util.Iterator<java.util.Locale.LanguageRange>) languageRangeItor6, "                                              italiahi                                              t                                              italiahi                                              l                                              italiahi                                                                                            italiahi                                                                                            italiahi                                              o");
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(languageRangeItor6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test15115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15115");
        java.lang.Object[] objArray0 = null;
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join(objArray0, 'x');
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test15116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15116");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale locale4 = java.util.Locale.FRANCE;
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale4);
        java.util.Locale locale6 = java.util.Locale.US;
        java.util.Locale locale7 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale8 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale9 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale10 = java.util.Locale.getDefault();
        java.lang.String str11 = locale9.getDisplayCountry(locale10);
        java.lang.String str12 = locale9.toLanguageTag();
        java.util.Locale locale13 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale14 = java.util.Locale.getDefault();
        java.lang.String str15 = locale13.getDisplayCountry(locale14);
        java.util.Locale locale16 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale17 = java.util.Locale.getDefault();
        java.lang.String str18 = locale16.getDisplayCountry(locale17);
        java.util.Locale locale22 = new java.util.Locale("hi", "hi!", "cHINA");
        java.util.Locale locale23 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale24 = java.util.Locale.getDefault();
        java.lang.String str25 = locale23.getDisplayCountry(locale24);
        java.util.Locale locale27 = new java.util.Locale("");
        java.lang.String str28 = locale27.getDisplayVariant();
        java.util.Locale locale29 = java.util.Locale.KOREAN;
        java.util.Locale locale31 = new java.util.Locale("");
        java.util.Locale locale32 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale[] localeArray33 = new java.util.Locale[] { locale4, locale6, locale7, locale8, locale9, locale14, locale16, locale22, locale24, locale27, locale29, locale31, locale32 };
        java.util.ArrayList<java.util.Locale> localeList34 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList34, localeArray33);
        java.util.List<java.util.Locale> localeList36 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList34);
        java.lang.String[] strArray44 = new java.lang.String[] { "English", "hi", "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "", "a", "", "China" };
        java.util.ArrayList<java.lang.String> strList45 = new java.util.ArrayList<java.lang.String>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList45, strArray44);
        java.util.List<java.lang.Class<?>> wildcardClassList47 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList45);
        java.util.Locale.FilteringMode filteringMode48 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList49 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList45, filteringMode48);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream50 = languageRangeList1.parallelStream();
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor51 = languageRangeList1.listIterator();
        java.util.Locale locale52 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str53 = locale52.getDisplayLanguage();
        java.util.Locale locale54 = java.util.Locale.getDefault();
        java.lang.String str55 = locale52.getDisplayCountry(locale54);
        java.util.Locale locale56 = java.util.Locale.TAIWAN;
        java.lang.String str57 = locale56.getVariant();
        java.lang.String str58 = locale52.getDisplayName(locale56);
        java.util.Locale locale59 = locale56.stripExtensions();
        java.util.Locale.setDefault(locale56);
        java.util.Set<java.lang.String> strSet61 = locale56.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.String> strSet62 = locale56.getUnicodeLocaleKeys();
        int int63 = languageRangeList1.lastIndexOf((java.lang.Object) strSet62);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "english" + "'", str5, "english");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale10);
// flaky:         org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "China" + "'", str11, "China");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "zh-CN" + "'", str12, "zh-CN");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale14);
// flaky:         org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "China" + "'", str15, "China");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale17);
// flaky:         org.junit.Assert.assertEquals(locale17.toString(), "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "China" + "'", str18, "China");
        org.junit.Assert.assertEquals(locale22.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale24);
// flaky:         org.junit.Assert.assertEquals(locale24.toString(), "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "China" + "'", str25, "China");
        org.junit.Assert.assertEquals(locale27.toString(), "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "ko");
        org.junit.Assert.assertEquals(locale31.toString(), "");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(localeList36);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(wildcardClassList47);
        org.junit.Assert.assertTrue("'" + filteringMode48 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode48.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList49);
        org.junit.Assert.assertNotNull(languageRangeStream50);
        org.junit.Assert.assertNotNull(languageRangeItor51);
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Chinese" + "'", str53, "Chinese");
        org.junit.Assert.assertNotNull(locale54);
// flaky:         org.junit.Assert.assertEquals(locale54.toString(), "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "Taiwan" + "'", str55, "Taiwan");
        org.junit.Assert.assertNotNull(locale56);
        org.junit.Assert.assertEquals(locale56.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
// flaky:         org.junit.Assert.assertEquals("'" + str58 + "' != '" + "\u4e2d\u6587\u53f0\u7063)" + "'", str58, "\u4e2d\u6587\u53f0\u7063)");
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(strSet61);
        org.junit.Assert.assertNotNull(strSet62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
    }

    @Test
    public void test15117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15117");
        java.lang.Object obj0 = null;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName(obj0, "Hindi (HI!,cHINA                                                                                                     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hindi (HI!,cHINA                                                                                                     " + "'", str2, "Hindi (HI!,cHINA                                                                                                     ");
    }

    @Test
    public void test15118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15118");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap3);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor5 = languageRangeList4.listIterator();
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        java.util.Locale.LanguageRange[] languageRangeArray10 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList11 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList11, languageRangeArray10);
        java.util.Locale locale14 = java.util.Locale.FRANCE;
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale14);
        java.util.Locale locale16 = java.util.Locale.US;
        java.util.Locale locale17 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale18 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale19 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale20 = java.util.Locale.getDefault();
        java.lang.String str21 = locale19.getDisplayCountry(locale20);
        java.lang.String str22 = locale19.toLanguageTag();
        java.util.Locale locale23 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale24 = java.util.Locale.getDefault();
        java.lang.String str25 = locale23.getDisplayCountry(locale24);
        java.util.Locale locale26 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale27 = java.util.Locale.getDefault();
        java.lang.String str28 = locale26.getDisplayCountry(locale27);
        java.util.Locale locale32 = new java.util.Locale("hi", "hi!", "cHINA");
        java.util.Locale locale33 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale34 = java.util.Locale.getDefault();
        java.lang.String str35 = locale33.getDisplayCountry(locale34);
        java.util.Locale locale37 = new java.util.Locale("");
        java.lang.String str38 = locale37.getDisplayVariant();
        java.util.Locale locale39 = java.util.Locale.KOREAN;
        java.util.Locale locale41 = new java.util.Locale("");
        java.util.Locale locale42 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale[] localeArray43 = new java.util.Locale[] { locale14, locale16, locale17, locale18, locale19, locale24, locale26, locale32, locale34, locale37, locale39, locale41, locale42 };
        java.util.ArrayList<java.util.Locale> localeList44 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList44, localeArray43);
        java.util.List<java.util.Locale> localeList46 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList11, (java.util.Collection<java.util.Locale>) localeList44);
        java.lang.String[] strArray54 = new java.lang.String[] { "English", "hi", "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "", "a", "", "China" };
        java.util.ArrayList<java.lang.String> strList55 = new java.util.ArrayList<java.lang.String>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList55, strArray54);
        java.util.List<java.lang.Class<?>> wildcardClassList57 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList55);
        java.util.Locale.FilteringMode filteringMode58 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList59 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList11, (java.util.Collection<java.lang.String>) strList55, filteringMode58);
        java.util.List<java.lang.String> strList60 = java.util.Locale.filterTags(languageRangeList4, (java.util.Collection<java.lang.String>) strList8, filteringMode58);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor61 = languageRangeList4.listIterator();
        int int62 = languageRangeList4.size();
        java.util.List<java.util.Locale.LanguageRange> languageRangeList64 = java.util.Locale.LanguageRange.parse("HI");
        boolean boolean65 = languageRangeList4.equals((java.lang.Object) languageRangeList64);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList68 = java.util.Locale.LanguageRange.parse("hi");
        java.lang.Object[] objArray69 = languageRangeList68.toArray();
        java.util.Spliterator<java.util.Locale.LanguageRange> languageRangeSpliterator70 = languageRangeList68.spliterator();
        java.util.Locale.LanguageRange languageRange72 = languageRangeList68.get((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            languageRangeList4.add(745, languageRange72);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 745, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(languageRangeItor5);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(languageRangeArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "english" + "'", str15, "english");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale20);
// flaky:         org.junit.Assert.assertEquals(locale20.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Cina" + "'", str21, "Cina");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "zh-CN" + "'", str22, "zh-CN");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale24);
// flaky:         org.junit.Assert.assertEquals(locale24.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Cina" + "'", str25, "Cina");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale27);
// flaky:         org.junit.Assert.assertEquals(locale27.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Cina" + "'", str28, "Cina");
        org.junit.Assert.assertEquals(locale32.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale34);
// flaky:         org.junit.Assert.assertEquals(locale34.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Cina" + "'", str35, "Cina");
        org.junit.Assert.assertEquals(locale37.toString(), "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "ko");
        org.junit.Assert.assertEquals(locale41.toString(), "");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(localeList46);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(wildcardClassList57);
        org.junit.Assert.assertTrue("'" + filteringMode58 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode58.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList59);
        org.junit.Assert.assertNotNull(strList60);
        org.junit.Assert.assertNotNull(languageRangeItor61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(languageRangeList64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(languageRangeList68);
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertNotNull(languageRangeSpliterator70);
        org.junit.Assert.assertNotNull(languageRange72);
    }

    @Test
    public void test15119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15119");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "Locale.LanguageRange");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test15120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15120");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("zh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CTWzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-C", '$');
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny("ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", strArray5);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny("French (France)", strArray5);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("EnglTWNsTWN", "....english", (int) (short) 0);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray11);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEach("CHINOIS(CHINE)", strArray5, strArray11);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "EnglTWNsTWN" + "'", str12, "EnglTWNsTWN");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "CHINOIS(CHINE)" + "'", str13, "CHINOIS(CHINE)");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "zh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CTWzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-C" + "'", str14, "zh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CTWzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-C");
    }

    @Test
    public void test15121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15121");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("Cina", strMap1);
        java.util.Locale.LanguageRange languageRange4 = new java.util.Locale.LanguageRange("English");
        java.lang.String str6 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) languageRange4, "");
        java.lang.String str7 = languageRange4.getRange();
        boolean boolean8 = languageRangeList2.add(languageRange4);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList2, 'x');
        boolean boolean11 = languageRangeList2.isEmpty();
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList2, "");
        int int14 = languageRangeList2.size();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList17 = languageRangeList2.subList(52, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(52) > toIndex(1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Locale.LanguageRange" + "'", str6, "Locale.LanguageRange");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "english" + "'", str7, "english");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test15122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15122");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("#########################English                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ", 35, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test15123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15123");
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) "hindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihind_LOCALE.BUILDER_ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hEnglish", "ITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITALIAHi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "String" + "'", str2, "String");
    }

    @Test
    public void test15124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15124");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("Italien", 5, 23);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "en" + "'", str3, "en");
    }

    @Test
    public void test15125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15125");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("\u4e2d\u6587string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string", "                                              italiahi                                              ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u4e2d\u6587string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string" + "'", str2, "\u4e2d\u6587string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string");
    }

    @Test
    public void test15126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15126");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("cl                                   java.util.stream", "                      hArrayList");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test15127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15127");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("XXXXXXXXXXXXXXJAPANESEXXXXXXXXXXXXXX");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=xxxxxxxxxxxxxxjapanesexxxxxxxxxxxxxx");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test15128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15128");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("alienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalien", "English (United States)", "LOCALE.BUILDER");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ALROLEALROLEALROLEALROLEALROLEALROLEALROLEALROLEALROLEALROLEALROLEALROLEALROLEALROLEALROLEALRO" + "'", str3, "ALROLEALROLEALROLEALROLEALROLEALROLEALROLEALROLEALROLEALROLEALROLEALROLEALROLEALROLEALROLEALRO");
    }

    @Test
    public void test15129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15129");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("ava", 747);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ava" + "'", str2, "ava");
    }

    @Test
    public void test15130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15130");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("twn");
        boolean boolean3 = org.apache.commons.lang3.StringUtils.startsWithAny("       hi!", strArray2);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "TALIAHi");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, "ciCINAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXLocale.FilteringModeCINAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXLocale.FilteringModeCINAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXLocale.FilteringModeCINAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXLocale.FilteringModeCINAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXLocale.FilteringModeCINAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXLocale.FilteringModeCINAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXLocale.FilteringModeCINAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXLocale.FilteringModeCINAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXLocale.FilteringModeCINAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXLocale.FilteringModeCINAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXLocale.FilteringModeCINAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXLocale.FilteringModeCINAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXLocale.FilteringModeCINAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXLocale.FilteringModeCINAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXLocale.FilteringModeCINAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXLocale.FilteringModeCINAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXLocale.FilteringModeCINAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "twn" + "'", str7, "twn");
    }

    @Test
    public void test15131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15131");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("\u53f0\u6e7e\u5730\u533a####", "CHINCHINCHINCHINCHICHINCHINCHINCHINC");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u53f0\u6e7e\u5730\u533a####" + "'", str2, "\u53f0\u6e7e\u5730\u533a####");
    }

    @Test
    public void test15132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15132");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.setLanguageTag("zh-CN");
        java.util.Locale.Builder builder5 = builder3.setLanguage("CHINA");
        java.util.Locale locale6 = builder3.build();
        java.util.Locale.Builder builder7 = builder3.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder3.setLanguage("gnalesenic.esenicavaj");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: gnalesenic.esenicavaj [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "china_CN");
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test15133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15133");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("cn");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList1, '$');
        java.util.AbstractCollection[] abstractCollectionArray5 = new java.util.AbstractCollection[0];
        @SuppressWarnings("unchecked")
        java.util.AbstractCollection<java.util.Locale.LanguageRange>[] languageRangeCollectionArray6 = (java.util.AbstractCollection<java.util.Locale.LanguageRange>[]) abstractCollectionArray5;
        java.util.AbstractCollection[][] abstractCollectionArray8 = new java.util.AbstractCollection[1][];
        @SuppressWarnings("unchecked")
        java.util.AbstractCollection<java.util.Locale.LanguageRange>[][] languageRangeCollectionArray9 = (java.util.AbstractCollection<java.util.Locale.LanguageRange>[][]) abstractCollectionArray8;
        languageRangeCollectionArray9[0] = abstractCollectionArray5;
        java.util.AbstractCollection[] abstractCollectionArray13 = new java.util.AbstractCollection[0];
        @SuppressWarnings("unchecked")
        java.util.AbstractCollection<java.util.Locale.LanguageRange>[] languageRangeCollectionArray14 = (java.util.AbstractCollection<java.util.Locale.LanguageRange>[]) abstractCollectionArray13;
        java.util.AbstractCollection[][] abstractCollectionArray16 = new java.util.AbstractCollection[1][];
        @SuppressWarnings("unchecked")
        java.util.AbstractCollection<java.util.Locale.LanguageRange>[][] languageRangeCollectionArray17 = (java.util.AbstractCollection<java.util.Locale.LanguageRange>[][]) abstractCollectionArray16;
        languageRangeCollectionArray17[0] = abstractCollectionArray13;
        java.util.AbstractCollection[][][] abstractCollectionArray21 = new java.util.AbstractCollection[2][][];
        @SuppressWarnings("unchecked")
        java.util.AbstractCollection<java.util.Locale.LanguageRange>[][][] languageRangeCollectionArray22 = (java.util.AbstractCollection<java.util.Locale.LanguageRange>[][][]) abstractCollectionArray21;
        languageRangeCollectionArray22[0] = languageRangeCollectionArray9;
        languageRangeCollectionArray22[1] = languageRangeCollectionArray17;
        // The following exception was thrown during execution in test generation
        try {
            java.util.AbstractCollection<java.util.Locale.LanguageRange>[][][] languageRangeCollectionArray27 = languageRangeList1.toArray(languageRangeCollectionArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException; message: null");
        } catch (java.lang.ArrayStoreException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(abstractCollectionArray5);
        org.junit.Assert.assertNotNull(languageRangeCollectionArray6);
        org.junit.Assert.assertNotNull(abstractCollectionArray8);
        org.junit.Assert.assertNotNull(languageRangeCollectionArray9);
        org.junit.Assert.assertNotNull(abstractCollectionArray13);
        org.junit.Assert.assertNotNull(languageRangeCollectionArray14);
        org.junit.Assert.assertNotNull(abstractCollectionArray16);
        org.junit.Assert.assertNotNull(languageRangeCollectionArray17);
        org.junit.Assert.assertNotNull(abstractCollectionArray21);
        org.junit.Assert.assertNotNull(languageRangeCollectionArray22);
    }

    @Test
    public void test15134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15134");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H", "                 A                  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H" + "'", str2, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H");
    }

    @Test
    public void test15135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15135");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("it", strMap1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList2, '#');
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor6 = languageRangeList2.listIterator(1);
        java.util.Locale locale7 = java.util.Locale.CANADA;
        java.util.Set<java.lang.String> strSet8 = locale7.getUnicodeLocaleAttributes();
        java.util.Locale locale10 = java.util.Locale.FRANCE;
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale10);
        java.lang.String str12 = locale7.getDisplayCountry(locale10);
        java.util.Set<java.lang.String> strSet13 = locale10.getUnicodeLocaleKeys();
        java.lang.String str14 = java.util.Locale.lookupTag(languageRangeList2, (java.util.Collection<java.lang.String>) strSet13);
        java.util.Locale.LanguageRange languageRange16 = languageRangeList2.remove(0);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList2, "englhi!string[]string[]sshi!string[]string[]s");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange20 = languageRangeList2.remove(561);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 561, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeItor6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_CA");
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "english" + "'", str11, "english");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Canada" + "'", str12, "Canada");
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(languageRange16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test15136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15136");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("xxxxxxxxxxxxafxxxxxxxxxxxxx", "                           AHI!HI!                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test15137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15137");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("af", "..................chinois (chine)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "af" + "'", str2, "af");
    }

    @Test
    public void test15138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15138");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("AN       A", "locle.lngugernge");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test15139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15139");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("Object[]", 4);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Object[]" + "'", str2, "Object[]");
    }

    @Test
    public void test15140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15140");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("china (China)", 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=china (china)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test15141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15141");
        java.util.Locale locale1 = java.util.Locale.ENGLISH;
        java.util.Locale locale2 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str3 = locale1.getDisplayCountry(locale2);
        java.lang.String str4 = locale2.getCountry();
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.lowerCase("string", locale2);
        java.lang.String str6 = locale2.getISO3Language();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CN" + "'", str4, "CN");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "string" + "'", str5, "string");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "zho" + "'", str6, "zho");
    }

    @Test
    public void test15142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15142");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 234 + "'", int2 == 234);
    }

    @Test
    public void test15143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15143");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.setLanguageTag("zh-CN");
        java.util.Locale.Builder builder5 = builder3.setLanguage("it");
        java.util.Locale.Builder builder6 = builder5.clear();
        java.util.Locale locale8 = new java.util.Locale("");
        java.lang.String str9 = locale8.getDisplayLanguage();
        java.util.Locale locale10 = java.util.Locale.CANADA;
        java.lang.String str11 = locale10.getDisplayLanguage();
        java.lang.String str12 = locale8.getDisplayScript(locale10);
        java.lang.String str13 = locale10.getDisplayVariant();
        java.util.Locale locale14 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale15 = java.util.Locale.getDefault();
        java.lang.String str16 = locale14.getDisplayCountry(locale15);
        java.lang.String str17 = locale15.getDisplayVariant();
        java.lang.String str18 = locale10.getDisplayScript(locale15);
        java.util.Locale.Builder builder19 = builder5.setLocale(locale15);
        java.util.Locale.Builder builder20 = builder19.clearExtensions();
        java.util.Locale.Builder builder21 = builder20.clear();
        java.util.Locale.Builder builder23 = builder21.addUnicodeLocaleAttribute("ita");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder25 = builder23.setVariant("n");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: n [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "inglese" + "'", str11, "inglese");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale15);
// flaky:         org.junit.Assert.assertEquals(locale15.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Cina" + "'", str16, "Cina");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
    }

    @Test
    public void test15144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15144");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap3);
        java.util.Locale.LanguageRange[] languageRangeArray5 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList6 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList6, languageRangeArray5);
        boolean boolean8 = languageRangeList1.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList6);
        java.util.Locale.LanguageRange[] languageRangeArray9 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList10 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList10, languageRangeArray9);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap12 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList13 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList10, strMap12);
        java.util.Locale.LanguageRange[] languageRangeArray14 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList15 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList15, languageRangeArray14);
        boolean boolean17 = languageRangeList10.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList15);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList15, "hi!");
        boolean boolean20 = languageRangeList1.remove((java.lang.Object) languageRangeList15);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor21 = languageRangeList1.listIterator();
        boolean boolean22 = languageRangeList1.isEmpty();
        java.util.Locale.Builder builder23 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder25 = builder23.setScript("");
        java.util.Locale.Builder builder27 = builder25.setLanguage("HI");
        int int28 = languageRangeList1.indexOf((java.lang.Object) builder27);
        java.util.Locale.Builder builder29 = builder27.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder31 = builder29.setLanguage("Hindi (HI!,cHINA");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: Hindi (HI!,cHINA [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(languageRangeArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(languageRangeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(languageRangeList13);
        org.junit.Assert.assertNotNull(languageRangeArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(languageRangeItor21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(builder29);
    }

    @Test
    public void test15145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15145");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("Object[]", 'x');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Object[]" + "'", str2, "Object[]");
    }

    @Test
    public void test15146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15146");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("Cina", strMap1);
        languageRangeList2.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange5 = languageRangeList2.remove(47);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 47, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeList2);
    }

    @Test
    public void test15147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15147");
        java.util.Locale locale2 = java.util.Locale.forLanguageTag("allemand");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.lowerCase("wt_hz", locale2);
        java.lang.String str4 = locale2.getLanguage();
        java.lang.String str5 = locale2.getDisplayScript();
        java.lang.String str6 = locale2.getDisplayCountry();
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "allemand");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "wt_hz" + "'", str3, "wt_hz");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "allemand" + "'", str4, "allemand");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test15148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15148");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("AN       english4444444444444444444444444444", "AD.AE.AF.AG.AI.AL.AM.AN.AO.AQ.AR.AS.AT.AU.AW.AX.AZ.BA.BB.BD.BE.BF.BG.BH.BI.BJ.BL.BM.BN.BO.BQ.BR.BS.BT.BV.BW.BY.BZ.CA.CC.CD.CF.CG.CH.CI.CK.CL.CM.CN.CO.CR.CU.CV.CW.CX.CY.CZ.DE.DJ.DK.DM.DO.DZ.EC.EE.EG.EH.ER.ES.ET.FI.FJ.FK.FM.FO.FR.GA.GB.GD.GE.GF.GG.GH.GI.GL.GM.GN.GP.GQ.GR.GS.GT.GU.GW.GY.HK.HM.HN.HR.HT.HU.ID.IE.IL.IM.IN.IO.IQ.IR.IS.IT.JE.JM.JO.JP.KE.KG.KH.KI.KM.KN.KP.KR.KW.KY.KZ.LA.LB.LC.LI.LK.LR.LS.LT.LU.LV.LY.MA.MC.MD.ME.MF.MG.MH.MK.ML.MM.MN.MO.MP.MQ.MR.MS.MT.MU.MV.MW.MX.MY.MZ.NA.NC.NE.NF.NG.NI.NL.NO.NP.NR.NU.NZ.OM.PA.PE.PF.PG.PH.PK.PL.PM.PN.PR.PS.PT.PW.PY.QA.RE.RO.RS.RU.RW.SA.SB.SC.SD.SE.SG.SH.SI.SJ.SK.SL.SM.SN.SO.SR.SS.ST.SV.SX.SY.SZ.TC.TD.TF.TG.TH.TJ.TK.TL.TM.TN.TO.TR.TT.TV.TW.TZ.UA.UG.UM.US.UY.UZ.VA.VC.VE.VG.VI.VN.VU.WF.WS.YE.YT.ZA.ZM.ZW");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test15149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15149");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap3);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream5 = languageRangeList1.stream();
        boolean boolean6 = languageRangeList1.isEmpty();
        java.util.Locale.LanguageRange[] languageRangeArray7 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList8 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList8, languageRangeArray7);
        java.util.Locale locale11 = java.util.Locale.FRANCE;
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale11);
        java.util.Locale locale13 = java.util.Locale.US;
        java.util.Locale locale14 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale15 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale16 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale17 = java.util.Locale.getDefault();
        java.lang.String str18 = locale16.getDisplayCountry(locale17);
        java.lang.String str19 = locale16.toLanguageTag();
        java.util.Locale locale20 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale21 = java.util.Locale.getDefault();
        java.lang.String str22 = locale20.getDisplayCountry(locale21);
        java.util.Locale locale23 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale24 = java.util.Locale.getDefault();
        java.lang.String str25 = locale23.getDisplayCountry(locale24);
        java.util.Locale locale29 = new java.util.Locale("hi", "hi!", "cHINA");
        java.util.Locale locale30 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale31 = java.util.Locale.getDefault();
        java.lang.String str32 = locale30.getDisplayCountry(locale31);
        java.util.Locale locale34 = new java.util.Locale("");
        java.lang.String str35 = locale34.getDisplayVariant();
        java.util.Locale locale36 = java.util.Locale.KOREAN;
        java.util.Locale locale38 = new java.util.Locale("");
        java.util.Locale locale39 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale[] localeArray40 = new java.util.Locale[] { locale11, locale13, locale14, locale15, locale16, locale21, locale23, locale29, locale31, locale34, locale36, locale38, locale39 };
        java.util.ArrayList<java.util.Locale> localeList41 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList41, localeArray40);
        java.util.List<java.util.Locale> localeList43 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList8, (java.util.Collection<java.util.Locale>) localeList41);
        java.lang.String[] strArray51 = new java.lang.String[] { "English", "hi", "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "", "a", "", "China" };
        java.util.ArrayList<java.lang.String> strList52 = new java.util.ArrayList<java.lang.String>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList52, strArray51);
        java.util.List<java.lang.Class<?>> wildcardClassList54 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList52);
        java.util.Locale.FilteringMode filteringMode55 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList56 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList8, (java.util.Collection<java.lang.String>) strList52, filteringMode55);
        java.util.Locale.FilteringMode filteringMode57 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList58 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList52, filteringMode57);
        boolean boolean59 = languageRangeList1.isEmpty();
        java.lang.Object[] objArray60 = languageRangeList1.toArray();
        java.util.Locale locale61 = java.util.Locale.CANADA;
        java.util.Set<java.lang.String> strSet62 = locale61.getUnicodeLocaleAttributes();
        java.util.Locale locale64 = java.util.Locale.FRANCE;
        java.lang.String str65 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale64);
        java.lang.String str66 = locale61.getDisplayCountry(locale64);
        java.util.Set<java.lang.String> strSet67 = locale64.getUnicodeLocaleAttributes();
        java.util.List<java.lang.String> strList68 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet67);
        java.util.Locale.LanguageRange languageRange71 = new java.util.Locale.LanguageRange("English");
        java.lang.String str73 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) languageRange71, "");
        java.util.Locale.LanguageRange languageRange75 = new java.util.Locale.LanguageRange("a");
        java.util.Locale.LanguageRange languageRange77 = new java.util.Locale.LanguageRange("a");
        java.util.Locale.LanguageRange[] languageRangeArray78 = new java.util.Locale.LanguageRange[] { languageRange71, languageRange75, languageRange77 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList79 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList79, languageRangeArray78);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor81 = languageRangeList79.listIterator();
        java.util.Locale.LanguageRange languageRange82 = languageRangeItor81.next();
        double double83 = languageRange82.getWeight();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange84 = languageRangeList1.set(120, languageRange82);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 120, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(languageRangeStream5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(languageRangeArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "english" + "'", str12, "english");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale17);
// flaky:         org.junit.Assert.assertEquals(locale17.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Cina" + "'", str18, "Cina");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "zh-CN" + "'", str19, "zh-CN");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale21);
// flaky:         org.junit.Assert.assertEquals(locale21.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Cina" + "'", str22, "Cina");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale24);
// flaky:         org.junit.Assert.assertEquals(locale24.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Cina" + "'", str25, "Cina");
        org.junit.Assert.assertEquals(locale29.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale31);
// flaky:         org.junit.Assert.assertEquals(locale31.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Cina" + "'", str32, "Cina");
        org.junit.Assert.assertEquals(locale34.toString(), "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "ko");
        org.junit.Assert.assertEquals(locale38.toString(), "");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(localeList43);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(wildcardClassList54);
        org.junit.Assert.assertTrue("'" + filteringMode55 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode55.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList56);
        org.junit.Assert.assertTrue("'" + filteringMode57 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode57.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray60), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray60), "[]");
        org.junit.Assert.assertNotNull(locale61);
        org.junit.Assert.assertEquals(locale61.toString(), "en_CA");
        org.junit.Assert.assertNotNull(strSet62);
        org.junit.Assert.assertNotNull(locale64);
        org.junit.Assert.assertEquals(locale64.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "english" + "'", str65, "english");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "Canada" + "'", str66, "Canada");
        org.junit.Assert.assertNotNull(strSet67);
        org.junit.Assert.assertNotNull(strList68);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "Locale.LanguageRange" + "'", str73, "Locale.LanguageRange");
        org.junit.Assert.assertNotNull(languageRangeArray78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(languageRangeItor81);
        org.junit.Assert.assertNotNull(languageRange82);
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + 1.0d + "'", double83 == 1.0d);
    }

    @Test
    public void test15150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15150");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("chn", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "chn" + "'", str2, "chn");
    }

    @Test
    public void test15151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15151");
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) "....................................................................................................", "          xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxchnxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxchnxxxxxxxxxxxxxxxxxxxxxxxxxnglais");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang" + "'", str2, "java.lang");
    }

    @Test
    public void test15152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15152");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("zh_tw", "Italian (Italy)", 93);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test15153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15153");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap3);
        java.util.Locale.LanguageRange[] languageRangeArray5 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList6 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList6, languageRangeArray5);
        boolean boolean8 = languageRangeList1.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList6);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList6, "hi!");
        java.lang.Class[] classArray12 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray13 = (java.lang.Class<?>[]) classArray12;
        java.lang.Class<?>[] wildcardClassArray14 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray12);
        java.lang.Class<?>[] wildcardClassArray15 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray12);
        java.lang.Class[] classArray18 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray19 = (java.lang.Class<?>[]) classArray18;
        java.lang.Class<?>[] wildcardClassArray20 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray18);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.concatWith("hi!", (java.lang.Object[]) classArray18);
        boolean boolean22 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray12, (java.lang.Class<?>[]) classArray18);
        java.lang.Class[] classArray24 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray25 = (java.lang.Class<?>[]) classArray24;
        java.lang.Class<?>[] wildcardClassArray26 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray24);
        java.lang.Class<?> wildcardClass27 = null;
        java.lang.Class[] classArray29 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray30 = (java.lang.Class<?>[]) classArray29;
        wildcardClassArray30[0] = wildcardClass27;
        boolean boolean34 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray26, wildcardClassArray30, false);
        java.lang.Class[] classArray36 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray37 = (java.lang.Class<?>[]) classArray36;
        java.lang.Class<?>[] wildcardClassArray38 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray36);
        boolean boolean39 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray26, (java.lang.Class<?>[]) classArray36);
        boolean boolean40 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray12, (java.lang.Class<?>[]) classArray36);
        java.lang.Class<?>[] wildcardClassArray41 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers((java.lang.Class<?>[]) classArray36);
        java.lang.Class<?>[] wildcardClassArray42 = languageRangeList6.toArray((java.lang.Class<?>[]) classArray36);
        java.lang.Class<?>[] wildcardClassArray43 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray42);
        java.lang.Class<?>[] wildcardClassArray44 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray43);
        java.lang.Class<?>[] wildcardClassArray45 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray43);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(languageRangeArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(classArray12);
        org.junit.Assert.assertNotNull(wildcardClassArray13);
        org.junit.Assert.assertNotNull(wildcardClassArray14);
        org.junit.Assert.assertNotNull(wildcardClassArray15);
        org.junit.Assert.assertNotNull(classArray18);
        org.junit.Assert.assertNotNull(wildcardClassArray19);
        org.junit.Assert.assertNotNull(wildcardClassArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(classArray24);
        org.junit.Assert.assertNotNull(wildcardClassArray25);
        org.junit.Assert.assertNotNull(wildcardClassArray26);
        org.junit.Assert.assertNotNull(classArray29);
        org.junit.Assert.assertNotNull(wildcardClassArray30);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(classArray36);
        org.junit.Assert.assertNotNull(wildcardClassArray37);
        org.junit.Assert.assertNotNull(wildcardClassArray38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray41);
        org.junit.Assert.assertNotNull(wildcardClassArray42);
        org.junit.Assert.assertNotNull(wildcardClassArray43);
        org.junit.Assert.assertNotNull(wildcardClassArray44);
        org.junit.Assert.assertNotNull(wildcardClassArray45);
    }

    @Test
    public void test15154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15154");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("af", "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxch");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "af" + "'", str2, "af");
    }

    @Test
    public void test15155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15155");
        java.util.Locale locale3 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        java.lang.String str5 = locale3.getDisplayCountry(locale4);
        java.lang.String str6 = locale3.toLanguageTag();
        java.lang.String str7 = locale3.getCountry();
        java.lang.String str8 = locale3.toLanguageTag();
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.upperCase("java.lang", locale3);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.upperCase("CHINOIS (CHINE)", locale3);
        java.lang.String str11 = locale3.getISO3Country();
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.lowerCase("AHI!HI!                                      ", locale3);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cina" + "'", str5, "Cina");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "zh-CN" + "'", str6, "zh-CN");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CN" + "'", str7, "CN");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "zh-CN" + "'", str8, "zh-CN");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JAVA.LANG" + "'", str9, "JAVA.LANG");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "CHINOIS (CHINE)" + "'", str10, "CHINOIS (CHINE)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "CHN" + "'", str11, "CHN");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ahi!hi!                                      " + "'", str12, "ahi!hi!                                      ");
    }

    @Test
    public void test15156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15156");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("......", (int) (short) 100, 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test15157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15157");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("#######################################################################################", "\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fduuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test15158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15158");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("A", "eNGLIILISH                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A" + "'", str2, "A");
    }

    @Test
    public void test15159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15159");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("##########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################..................chinois (Chine)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "##########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################..................chinois (Chine)" + "'", str1, "##########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################..................chinois (Chine)");
    }

    @Test
    public void test15160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15160");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "China");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test15161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15161");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("INGLESE (CANADA)", "aiaiaiaiaiaiaiaiai");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test15162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15162");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("EN_ca", "eselgnNC-hz", 12);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("                            ese (Taiwan", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test15163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15163");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("#...", "FRA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test15164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15164");
        java.util.Locale locale3 = new java.util.Locale("zh-CNenglish", "Locale.LanguageRange", "");
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleAttributes();
        java.util.Locale locale5 = java.util.Locale.ITALIAN;
        java.lang.String str6 = locale5.getLanguage();
        java.lang.String str7 = locale5.getLanguage();
        java.util.Locale locale8 = java.util.Locale.ITALIAN;
        java.util.Locale locale10 = new java.util.Locale("");
        java.lang.String str11 = locale10.getDisplayLanguage();
        java.util.Locale locale12 = java.util.Locale.CANADA;
        java.lang.String str13 = locale12.getDisplayLanguage();
        java.lang.String str14 = locale10.getDisplayScript(locale12);
        java.util.Locale locale16 = java.util.Locale.FRANCE;
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale16);
        java.lang.String str18 = locale10.getDisplayCountry(locale16);
        java.lang.String str19 = locale8.getDisplayScript(locale10);
        java.util.Locale.setDefault(locale8);
        java.util.Locale locale24 = new java.util.Locale("hi", "hi!", "cHINA");
        java.util.Locale locale25 = java.util.Locale.ITALIAN;
        java.util.Locale locale27 = new java.util.Locale("");
        java.lang.String str28 = locale27.getDisplayLanguage();
        java.util.Locale locale29 = java.util.Locale.CANADA;
        java.lang.String str30 = locale29.getDisplayLanguage();
        java.lang.String str31 = locale27.getDisplayScript(locale29);
        java.util.Locale locale33 = java.util.Locale.FRANCE;
        java.lang.String str34 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale33);
        java.lang.String str35 = locale27.getDisplayCountry(locale33);
        java.lang.String str36 = locale25.getDisplayScript(locale27);
        java.util.Locale.setDefault(locale25);
        java.lang.String str38 = locale24.getDisplayVariant(locale25);
        java.lang.String str39 = locale8.getDisplayLanguage(locale25);
        java.lang.String str40 = locale5.getDisplayLanguage(locale25);
        java.util.Locale locale41 = locale25.stripExtensions();
        java.lang.String str42 = locale41.toLanguageTag();
        java.lang.String str43 = locale41.getISO3Country();
        java.lang.String str44 = locale3.getDisplayVariant(locale41);
        org.junit.Assert.assertEquals(locale3.toString(), "zh-cnenglish_LOCALE.LANGUAGERANGE");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "it");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "it" + "'", str6, "it");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "it" + "'", str7, "it");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "it");
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "inglese" + "'", str13, "inglese");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "english" + "'", str17, "english");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals(locale24.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "it");
        org.junit.Assert.assertEquals(locale27.toString(), "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "inglese" + "'", str30, "inglese");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "english" + "'", str34, "english");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "cHINA" + "'", str38, "cHINA");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "italiano" + "'", str39, "italiano");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "italiano" + "'", str40, "italiano");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "it");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "it" + "'", str42, "it");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
    }

    @Test
    public void test15165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15165");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("  en_   ", (-1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test15166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15166");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("", 0, "gneslgneslgnefran\347ais (canada)slgneslgneslgnesslgneslgneslgnefran\347ais (canada)slgneslgneslgnesslgneslgneslgnefran\347ais (canada)slgneslgneslgnesslgneslgneslgnefran\347ais (canada)slgneslgneslgnesslgneslgneslgnefran\347ais (canada)slgneslgneslgnesslgneslgneslgnefran\347ais (canada)slgneslgneslgnesslgneslgneslgnefran\347ais (canada)slgneslgneslgnesslgneslgneslg.......................HI.......................slgneslgneslgnefran\347ais (canada)slgneslgneslgnesslgneslgneslgnefran\347ais (canada)slgneslgneslgnesslgneslgneslgnefran\347ais (canada)slgneslgneslgnesslgneslgneslgnefran\347ais (canada)slgneslgneslgnesslgneslgneslgnefran\347ais (canada)slgneslgneslgnesslgneslgneslgnefran\347ais (canada)slgneslgneslgnesslgneslgneslgnefran\347ais (canada)slgneslgneslgnesslgneslgneslg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test15167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15167");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("cinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecines", "ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!", "engliIlishenglcinese (Cina)", 116);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "cinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecines" + "'", str4, "cinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecines");
    }

    @Test
    public void test15168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15168");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("......44444444EnglTWNsTWN44444444......", "ANIHCZHCINESESEXXXXX");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test15169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15169");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("\u4e2d\u56fd", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u4e2d\u56fd" + "'", str2, "\u4e2d\u56fd");
    }

    @Test
    public void test15170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15170");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("rglAsA", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test15171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15171");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = org.apache.commons.lang3.ClassUtils.getClass("");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test15172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15172");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance(charSequence0, (java.lang.CharSequence) "IIIIIIIIIIIIIIIIIIIIIIISTRINGIIIIIIIIIIIIIIIIIIIIIII");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Strings must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test15173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15173");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("              Locale               ", ".", 39);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, 'a');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, 'x');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "              Locale               " + "'", str5, "              Locale               ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "              Locale               " + "'", str7, "              Locale               ");
    }

    @Test
    public void test15174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15174");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("HARRAYLISTFRAHARRAYLISTFRAHARRAYLISTFRAHARRAYLISTFRAHARRAYLISTFRAHARRAYLISTFRAHARRAYLISTFRAHARRAYLISTFRAHARRAYLISTFRAHARRAYLIST", "us");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HARRAYLISTFRAHARRAYLISTFRAHARRAYLISTFRAHARRAYLISTFRAHARRAYLISTFRAHARRAYLISTFRAHARRAYLISTFRAHARRAYLISTFRAHARRAYLISTFRAHARRAYLIST" + "'", str2, "HARRAYLISTFRAHARRAYLISTFRAHARRAYLISTFRAHARRAYLISTFRAHARRAYLISTFRAHARRAYLISTFRAHARRAYLISTFRAHARRAYLISTFRAHARRAYLISTFRAHARRAYLIST");
    }

    @Test
    public void test15175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15175");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("it", "Chin", 7);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.startsWithAny("n       a", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "t" + "'", str6, "t");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test15176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15176");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hITaiwanhIxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        java.lang.Object obj2 = locale1.clone();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "");
    }

    @Test
    public void test15177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15177");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("Italian");
        boolean boolean3 = languageRangeList1.equals((java.lang.Object) "String[]");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList6 = java.util.Locale.LanguageRange.parse("hi");
        java.lang.Object[] objArray7 = languageRangeList6.toArray();
        java.util.Spliterator<java.util.Locale.LanguageRange> languageRangeSpliterator8 = languageRangeList6.spliterator();
        java.util.Locale.LanguageRange languageRange10 = languageRangeList6.get((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            languageRangeList1.add(33, languageRange10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 33, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(languageRangeList6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(languageRangeSpliterator8);
        org.junit.Assert.assertNotNull(languageRange10);
    }

    @Test
    public void test15178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15178");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("anih");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "ANIHC               EN_ca                                                                 ");
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("\u4e2d", strArray4);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test15179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15179");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxzh-hcnczih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test15180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15180");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = org.apache.commons.lang3.ClassUtils.getClass("....english (ZHCINESESE,.)");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ////english(ZHCINESESE,/)");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test15181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15181");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("itfritl", strMap1);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.parse("hi");
        boolean boolean6 = languageRangeList4.remove((java.lang.Object) "English");
        boolean boolean8 = languageRangeList4.remove((java.lang.Object) 1);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList10 = java.util.Locale.LanguageRange.parse("hi");
        java.lang.Object[] objArray11 = languageRangeList10.toArray();
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream12 = languageRangeList10.parallelStream();
        languageRangeList10.clear();
        boolean boolean14 = languageRangeList4.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList10);
        boolean boolean15 = languageRangeList2.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList10);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList17 = java.util.Locale.LanguageRange.parse("hi");
        java.util.Locale.LanguageRange[] languageRangeArray18 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList19 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList19, languageRangeArray18);
        java.util.Locale locale22 = java.util.Locale.FRANCE;
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale22);
        java.util.Locale locale24 = java.util.Locale.US;
        java.util.Locale locale25 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale26 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale27 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale28 = java.util.Locale.getDefault();
        java.lang.String str29 = locale27.getDisplayCountry(locale28);
        java.lang.String str30 = locale27.toLanguageTag();
        java.util.Locale locale31 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale32 = java.util.Locale.getDefault();
        java.lang.String str33 = locale31.getDisplayCountry(locale32);
        java.util.Locale locale34 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale35 = java.util.Locale.getDefault();
        java.lang.String str36 = locale34.getDisplayCountry(locale35);
        java.util.Locale locale40 = new java.util.Locale("hi", "hi!", "cHINA");
        java.util.Locale locale41 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale42 = java.util.Locale.getDefault();
        java.lang.String str43 = locale41.getDisplayCountry(locale42);
        java.util.Locale locale45 = new java.util.Locale("");
        java.lang.String str46 = locale45.getDisplayVariant();
        java.util.Locale locale47 = java.util.Locale.KOREAN;
        java.util.Locale locale49 = new java.util.Locale("");
        java.util.Locale locale50 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale[] localeArray51 = new java.util.Locale[] { locale22, locale24, locale25, locale26, locale27, locale32, locale34, locale40, locale42, locale45, locale47, locale49, locale50 };
        java.util.ArrayList<java.util.Locale> localeList52 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList52, localeArray51);
        java.util.List<java.util.Locale> localeList54 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList19, (java.util.Collection<java.util.Locale>) localeList52);
        java.util.List<java.util.Locale> localeList55 = java.util.Locale.filter(languageRangeList17, (java.util.Collection<java.util.Locale>) localeList54);
        java.util.List<java.util.Locale> localeList56 = java.util.Locale.filter(languageRangeList10, (java.util.Collection<java.util.Locale>) localeList54);
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(languageRangeList10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(languageRangeStream12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(languageRangeList17);
        org.junit.Assert.assertNotNull(languageRangeArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "english" + "'", str23, "english");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "it");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Cina" + "'", str29, "Cina");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "zh-CN" + "'", str30, "zh-CN");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "it");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Cina" + "'", str33, "Cina");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "it");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Cina" + "'", str36, "Cina");
        org.junit.Assert.assertEquals(locale40.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "it");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Cina" + "'", str43, "Cina");
        org.junit.Assert.assertEquals(locale45.toString(), "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "ko");
        org.junit.Assert.assertEquals(locale49.toString(), "");
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(localeList54);
        org.junit.Assert.assertNotNull(localeList55);
        org.junit.Assert.assertNotNull(localeList56);
    }

    @Test
    public void test15182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15182");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "Z......................");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test15183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15183");
        java.util.Locale locale1 = new java.util.Locale("chnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        java.lang.String str2 = locale1.getDisplayVariant();
        boolean boolean3 = locale1.hasExtensions();
        org.junit.Assert.assertEquals(locale1.toString(), "chnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test15184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15184");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("china_CN", "A][gnirts");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "china_CN" + "'", str2, "china_CN");
    }

    @Test
    public void test15185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15185");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "nc-hz", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test15186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15186");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("                           java.uil", "zh-cnenglish");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                           java.u" + "'", str2, "                           java.u");
    }

    @Test
    public void test15187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15187");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("us", "Cinaxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", "GNE", 43);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "us" + "'", str4, "us");
    }

    @Test
    public void test15188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15188");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = builder1.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder4 = builder1.setScript("CINAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXLocale.FilteringModeCINAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXLocale.FilteringModeCINAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXLocale.FilteringModeCINAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXLocale.FilteringModeCINAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXLocale.FilteringModeCINAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXLocale.FilteringModeCINAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXLocale.FilteringModeCINAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXLocale.FilteringModeCINAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXLocale.FilteringModeCINAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXLocale.FilteringModeCINAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXLocale.FilteringModeCINAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXLocale.FilteringModeCINAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXLocale.FilteringModeCINAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXLocale.FilteringModeCINAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXLocale.FilteringModeCINAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXLocale.FilteringModeCINAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXLocale.FilteringModeCINAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: CINAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXLocale.FilteringModeCINAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXLocale.FilteringModeCINAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXLocale.FilteringModeCINAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXLocale.FilteringModeCINAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXLocale.FilteringModeCINAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXLocale.FilteringModeCINAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXLocale.FilteringModeCINAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXLocale.FilteringModeCINAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXLocale.FilteringModeCINAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXLocale.FilteringModeCINAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXLocale.FilteringModeCINAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXLocale.FilteringModeCINAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXLocale.FilteringModeCINAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXLocale.FilteringModeCINAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXLocale.FilteringModeCINAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXLocale.FilteringModeCINAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXLocale.FilteringModeCINAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
    }

    @Test
    public void test15189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15189");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder0.removeUnicodeLocaleAttribute("English");
        java.util.Locale locale5 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale6 = java.util.Locale.getDefault();
        java.lang.String str7 = locale5.getDisplayCountry(locale6);
        java.lang.String str8 = locale5.toLanguageTag();
        java.lang.String str9 = locale5.getCountry();
        java.lang.String str10 = locale5.getISO3Country();
        java.util.Locale locale12 = new java.util.Locale("");
        java.lang.String str13 = locale12.getDisplayVariant();
        java.lang.String str14 = locale5.getDisplayLanguage(locale12);
        java.lang.String str15 = locale12.getLanguage();
        java.util.Set<java.lang.Character> charSet16 = locale12.getExtensionKeys();
        java.lang.String str17 = locale12.getVariant();
        java.util.Locale.Builder builder18 = builder4.setLocale(locale12);
        java.util.Locale locale19 = java.util.Locale.ITALIAN;
        java.lang.String str20 = locale19.getLanguage();
        java.lang.String str21 = locale19.getLanguage();
        java.util.Locale locale22 = java.util.Locale.ITALIAN;
        java.util.Locale locale24 = new java.util.Locale("");
        java.lang.String str25 = locale24.getDisplayLanguage();
        java.util.Locale locale26 = java.util.Locale.CANADA;
        java.lang.String str27 = locale26.getDisplayLanguage();
        java.lang.String str28 = locale24.getDisplayScript(locale26);
        java.util.Locale locale30 = java.util.Locale.FRANCE;
        java.lang.String str31 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale30);
        java.lang.String str32 = locale24.getDisplayCountry(locale30);
        java.lang.String str33 = locale22.getDisplayScript(locale24);
        java.util.Locale.setDefault(locale22);
        java.util.Locale locale38 = new java.util.Locale("hi", "hi!", "cHINA");
        java.util.Locale locale39 = java.util.Locale.ITALIAN;
        java.util.Locale locale41 = new java.util.Locale("");
        java.lang.String str42 = locale41.getDisplayLanguage();
        java.util.Locale locale43 = java.util.Locale.CANADA;
        java.lang.String str44 = locale43.getDisplayLanguage();
        java.lang.String str45 = locale41.getDisplayScript(locale43);
        java.util.Locale locale47 = java.util.Locale.FRANCE;
        java.lang.String str48 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale47);
        java.lang.String str49 = locale41.getDisplayCountry(locale47);
        java.lang.String str50 = locale39.getDisplayScript(locale41);
        java.util.Locale.setDefault(locale39);
        java.lang.String str52 = locale38.getDisplayVariant(locale39);
        java.lang.String str53 = locale22.getDisplayLanguage(locale39);
        java.lang.String str54 = locale19.getDisplayLanguage(locale39);
        java.util.Locale locale55 = locale39.stripExtensions();
        java.util.Locale.Builder builder56 = builder4.setLocale(locale39);
        java.util.Locale.Builder builder57 = builder4.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder59 = builder57.setScript("                                                                                                    ");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script:                                                                                                      [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "it");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Cina" + "'", str7, "Cina");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "zh-CN" + "'", str8, "zh-CN");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "CN" + "'", str9, "CN");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "CHN" + "'", str10, "CHN");
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Chinese" + "'", str14, "Chinese");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(charSet16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "it");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "it" + "'", str20, "it");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "it" + "'", str21, "it");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "it");
        org.junit.Assert.assertEquals(locale24.toString(), "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "inglese" + "'", str27, "inglese");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "english" + "'", str31, "english");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals(locale38.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "it");
        org.junit.Assert.assertEquals(locale41.toString(), "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "inglese" + "'", str44, "inglese");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "english" + "'", str48, "english");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "cHINA" + "'", str52, "cHINA");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "italiano" + "'", str53, "italiano");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "italiano" + "'", str54, "italiano");
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "it");
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(builder57);
    }

    @Test
    public void test15190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15190");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("anih", "ch (java.lang)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test15191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15191");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale.Builder builder3 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder5 = builder1.setRegion("zh");
        java.util.Locale.Builder builder6 = builder5.clear();
        java.util.Locale locale7 = builder5.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder5.setExtension('#', "          xxxxxxxL          xxxxxxxL          xxxxxxxL          xxxxxxxL          xxxxxxxL          xxxxxxxL          xxxxxxxL          xxxxxxxL          xxxxxxxL          xxxxxxxL          xxxxxxxL          xxxxxxxL          xxxxxxxL          xxxxxxxL          xxxxxxxL          xxxxxxxL          xxxxxxxL          xxxxxxxL          xxxxxxxL          xxxxxxxL          xxxxxxxL          xxxxxxxL          xxxxxxxL          xxxxxxxL          xxxxxxxL          xxxxxxxL          xxxxxxxL          xxxxxxxL          xxxxxxxL          xxxxxxxL          xxxxxxxL          xxxxxxxL          xxxxxxxL          xxxxxxxL          xxxxxxxL          xxxxxxxL          xxxxxxxL          xxxxxxxL          xxxxxxxL          xxxxxxxL          xxxxxxxL          xxxxxxxL          xxxxxxxL          xxxxxxxL          xxxxxxxL          xxxxxxxL          xxxxxxxL          xxxxxxx");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key: # [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
    }

    @Test
    public void test15192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15192");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setScript("");
        java.util.Locale.Builder builder4 = builder2.setLanguage("HI");
        java.util.Locale.Builder builder5 = builder4.clear();
        java.util.Locale locale6 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str7 = locale6.getDisplayLanguage();
        java.util.Locale locale8 = java.util.Locale.getDefault();
        java.lang.String str9 = locale6.getDisplayCountry(locale8);
        java.util.Locale.Builder builder10 = builder5.setLocale(locale8);
        java.util.Locale.Builder builder12 = builder10.setLanguage("RGLaSa");
        java.lang.String str14 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) builder12, "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxUSxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder16 = builder12.setLanguage("ChinChinChinChinChinChinChinChinChinaaaaaaaaa.");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: ChinChinChinChinChinChinChinChinChinaaaaaaaaa. [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "cinese" + "'", str7, "cinese");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "it");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Taiwan" + "'", str9, "Taiwan");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Locale.Builder" + "'", str14, "Locale.Builder");
    }

    @Test
    public void test15193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15193");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("n       a");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test15194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15194");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("it                                                                                                  ", "le.Builder[]aLoc");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test15195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15195");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("zh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CTWzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-C");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CTWzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-C" + "'", str1, "zh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CTWzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-C");
    }

    @Test
    public void test15196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15196");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.util.Locale locale2 = new java.util.Locale("");
        java.lang.String str3 = locale2.getDisplayLanguage();
        java.util.Locale locale4 = java.util.Locale.CANADA;
        java.lang.String str5 = locale4.getDisplayLanguage();
        java.lang.String str6 = locale2.getDisplayScript(locale4);
        java.util.Locale locale8 = java.util.Locale.FRANCE;
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale8);
        java.lang.String str10 = locale2.getDisplayCountry(locale8);
        java.lang.String str11 = locale0.getDisplayScript(locale2);
        java.lang.String str12 = locale2.getDisplayCountry();
        java.lang.String str13 = locale2.getCountry();
        java.lang.String str14 = locale2.getLanguage();
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap16 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList17 = java.util.Locale.LanguageRange.parse("cHINA", strMap16);
        java.util.Locale locale19 = java.util.Locale.forLanguageTag("CN");
        java.util.Locale locale20 = java.util.Locale.CANADA;
        boolean boolean21 = locale20.hasExtensions();
        java.util.Locale locale22 = java.util.Locale.ITALIAN;
        java.lang.String str23 = locale20.getDisplayScript(locale22);
        java.lang.String str24 = locale19.getDisplayCountry(locale20);
        java.lang.String str25 = locale20.getISO3Language();
        int int26 = languageRangeList17.indexOf((java.lang.Object) locale20);
        java.lang.String str27 = locale2.getDisplayName(locale20);
        java.lang.String str28 = locale2.getDisplayVariant();
        java.lang.String str29 = locale2.getDisplayName();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "inglese" + "'", str5, "inglese");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "english" + "'", str9, "english");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(languageRangeList17);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "cn");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "it");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "eng" + "'", str25, "eng");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test15197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15197");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("ca", strMap1);
        org.junit.Assert.assertNotNull(languageRangeList2);
    }

    @Test
    public void test15198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15198");
        java.lang.CharSequence charSequence0 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence0, "cHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test15199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15199");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap3);
        int int5 = languageRangeList1.size();
        java.util.Locale.LanguageRange languageRange7 = new java.util.Locale.LanguageRange("English");
        java.util.Locale.LanguageRange languageRange9 = new java.util.Locale.LanguageRange("English");
        java.util.Locale.LanguageRange languageRange11 = new java.util.Locale.LanguageRange("a");
        java.util.Locale.LanguageRange[] languageRangeArray12 = new java.util.Locale.LanguageRange[] { languageRange7, languageRange9, languageRange11 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList13 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList13, languageRangeArray12);
        boolean boolean15 = languageRangeList1.retainAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList13);
        java.util.Locale locale18 = new java.util.Locale("");
        java.lang.String str19 = locale18.getDisplayLanguage();
        java.util.Locale locale20 = java.util.Locale.CANADA;
        java.lang.String str21 = locale20.getDisplayLanguage();
        java.lang.String str22 = locale18.getDisplayScript(locale20);
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.lowerCase("a", locale18);
        java.lang.String str24 = locale18.getDisplayScript();
        java.util.Set<java.lang.String> strSet25 = locale18.getUnicodeLocaleAttributes();
        java.util.Locale.FilteringMode filteringMode26 = null;
        java.util.List<java.lang.String> strList27 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList13, (java.util.Collection<java.lang.String>) strSet25, filteringMode26);
        java.lang.String str29 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList13, "\u6cd5\u6587");
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream30 = languageRangeList13.stream();
        java.util.List<java.util.Locale.LanguageRange> languageRangeList32 = java.util.Locale.LanguageRange.parse("hi");
        boolean boolean34 = languageRangeList32.remove((java.lang.Object) "English");
        java.util.Locale.LanguageRange languageRange36 = languageRangeList32.get(0);
        boolean boolean37 = languageRangeList13.retainAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList32);
        java.lang.Object[] objArray38 = languageRangeList13.toArray();
        java.lang.Object obj39 = null;
        int int40 = languageRangeList13.indexOf(obj39);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(languageRangeArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals(locale18.toString(), "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "inglese" + "'", str21, "inglese");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "a" + "'", str23, "a");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertNotNull(strList27);
        org.junit.Assert.assertNotNull(languageRangeStream30);
        org.junit.Assert.assertNotNull(languageRangeList32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(languageRange36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
    }

    @Test
    public void test15200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15200");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("cNXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "################################################################################", 0);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test15201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15201");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName("Japanese");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test15202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15202");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test15203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15203");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap3);
        java.util.Locale.LanguageRange[] languageRangeArray5 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList6 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList6, languageRangeArray5);
        boolean boolean8 = languageRangeList1.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList6);
        java.util.Locale.LanguageRange[] languageRangeArray9 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList10 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList10, languageRangeArray9);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap12 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList13 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList10, strMap12);
        java.util.Locale.LanguageRange[] languageRangeArray14 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList15 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList15, languageRangeArray14);
        boolean boolean17 = languageRangeList10.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList15);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList15, "hi!");
        boolean boolean20 = languageRangeList1.remove((java.lang.Object) languageRangeList15);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor21 = languageRangeList1.listIterator();
        java.util.List<java.util.Locale.LanguageRange> languageRangeList23 = java.util.Locale.LanguageRange.parse("zh-CN");
        java.lang.String[] strArray27 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("zh-CNnglese", "inglese", 3);
        int int28 = languageRangeList23.lastIndexOf((java.lang.Object) "zh-CNnglese");
        java.lang.String str30 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList23, "Hindi");
        java.lang.String str32 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList23, 'u');
        int int34 = languageRangeList23.lastIndexOf((java.lang.Object) "CN");
        boolean boolean35 = languageRangeList1.contains((java.lang.Object) languageRangeList23);
        languageRangeList1.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList39 = languageRangeList1.subList(20, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 97");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(languageRangeArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(languageRangeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(languageRangeList13);
        org.junit.Assert.assertNotNull(languageRangeArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(languageRangeItor21);
        org.junit.Assert.assertNotNull(languageRangeList23);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test15204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15204");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "\u4e2d\u6587\u53f0\u7063)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test15205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15205");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("OCLE.LNGUGERNGE");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ocle.lngugernge" + "'", str1, "ocle.lngugernge");
    }

    @Test
    public void test15206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15206");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("English");
        java.lang.String str2 = languageRange1.getRange();
        java.util.Locale.LanguageRange languageRange4 = new java.util.Locale.LanguageRange("English");
        java.lang.String str5 = languageRange4.getRange();
        java.util.Locale.LanguageRange languageRange7 = new java.util.Locale.LanguageRange("English");
        java.util.Locale.LanguageRange[] languageRangeArray8 = new java.util.Locale.LanguageRange[] { languageRange1, languageRange4, languageRange7 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList9 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList9, languageRangeArray8);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream11 = languageRangeList9.stream();
        java.util.Locale.Builder builder12 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder13 = builder12.clearExtensions();
        java.util.Locale.Builder builder14 = builder12.clearExtensions();
        boolean boolean15 = languageRangeList9.contains((java.lang.Object) builder14);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList18 = java.util.Locale.LanguageRange.parse("HI");
        boolean boolean19 = languageRangeList9.addAll((int) (short) 0, (java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList18);
        int int21 = languageRangeList9.lastIndexOf((java.lang.Object) "...xxxxxFrench(France)xxxxxxxxxx");
        java.util.Locale locale22 = java.util.Locale.ITALIAN;
        java.util.Locale locale24 = new java.util.Locale("");
        java.lang.String str25 = locale24.getDisplayLanguage();
        java.util.Locale locale26 = java.util.Locale.CANADA;
        java.lang.String str27 = locale26.getDisplayLanguage();
        java.lang.String str28 = locale24.getDisplayScript(locale26);
        java.util.Locale locale30 = java.util.Locale.FRANCE;
        java.lang.String str31 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale30);
        java.lang.String str32 = locale24.getDisplayCountry(locale30);
        java.lang.String str33 = locale22.getDisplayScript(locale24);
        java.util.Locale locale34 = java.util.Locale.GERMAN;
        java.lang.String str35 = locale24.getDisplayLanguage(locale34);
        java.util.Locale locale38 = new java.util.Locale("");
        java.lang.String str39 = locale38.getDisplayLanguage();
        java.util.Locale locale40 = java.util.Locale.CANADA;
        java.lang.String str41 = locale40.getDisplayLanguage();
        java.lang.String str42 = locale38.getDisplayScript(locale40);
        java.lang.String str43 = org.apache.commons.lang3.StringUtils.lowerCase("a", locale38);
        java.lang.String str44 = locale38.getDisplayScript();
        java.lang.String str45 = locale34.getDisplayLanguage(locale38);
        java.util.Set<java.lang.String> strSet46 = locale38.getUnicodeLocaleAttributes();
        java.lang.String str47 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList9, (java.util.Collection<java.lang.String>) strSet46);
        java.lang.Class<?> wildcardClass48 = strSet46.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "english" + "'", str2, "english");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "english" + "'", str5, "english");
        org.junit.Assert.assertNotNull(languageRangeArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(languageRangeStream11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(languageRangeList18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "it");
        org.junit.Assert.assertEquals(locale24.toString(), "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "inglese" + "'", str27, "inglese");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "english" + "'", str31, "english");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "de");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals(locale38.toString(), "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "inglese" + "'", str41, "inglese");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "a" + "'", str43, "a");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "German" + "'", str45, "German");
        org.junit.Assert.assertNotNull(strSet46);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test15207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15207");
        java.util.Locale locale0 = java.util.Locale.JAPANESE;
        java.util.Locale locale2 = java.util.Locale.TAIWAN;
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.upperCase("", locale2);
        java.lang.String str4 = locale0.getDisplayVariant(locale2);
        java.util.Set<java.lang.Character> charSet5 = locale2.getExtensionKeys();
        java.util.Set<java.lang.String> strSet6 = locale2.getUnicodeLocaleAttributes();
        java.util.Locale locale9 = new java.util.Locale("ahi!hi!", "                 a                 ");
        java.lang.String str10 = locale2.getDisplayScript(locale9);
        java.lang.String str11 = locale9.getDisplayCountry();
        java.lang.String str12 = locale9.getDisplayScript();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = locale9.getUnicodeLocaleType("...x.z.b.bb.bd.be.bf.bg.bh.bi.bj.bl.bm.bn..");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: ...x.z.b.bb.bd.be.bf.bg.bh.bi.bj.bl.bm.bn..");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ja");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(charSet5);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertEquals(locale9.toString(), "ahi!hi!_                 A                 ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "                 A                 " + "'", str11, "                 A                 ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test15208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15208");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("engliIlish", "locale.languagerange");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test15209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15209");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("ENGHi", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ENGHi     " + "'", str2, "ENGHi     ");
    }

    @Test
    public void test15210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15210");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("Cina", strMap1);
        java.util.Locale.LanguageRange languageRange4 = new java.util.Locale.LanguageRange("English");
        java.lang.String str6 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) languageRange4, "");
        java.lang.String str7 = languageRange4.getRange();
        boolean boolean8 = languageRangeList2.add(languageRange4);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList2, 'x');
        boolean boolean12 = languageRangeList2.contains((java.lang.Object) "Chine");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap13 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList14 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList2, strMap13);
        java.util.Locale.LanguageRange[] languageRangeArray15 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList16 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList16, languageRangeArray15);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap18 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList19 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList16, strMap18);
        int int20 = languageRangeList16.size();
        java.util.List<java.util.Locale.LanguageRange> languageRangeList22 = java.util.Locale.LanguageRange.parse("hi");
        boolean boolean24 = languageRangeList22.remove((java.lang.Object) "English");
        boolean boolean25 = languageRangeList16.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList22);
        int int26 = languageRangeList22.size();
        languageRangeList22.clear();
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor28 = languageRangeList22.listIterator();
        java.util.List<java.util.Locale.LanguageRange> languageRangeList30 = java.util.Locale.LanguageRange.parse("hi");
        java.util.Locale.LanguageRange[] languageRangeArray31 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList32 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList32, languageRangeArray31);
        java.util.Locale locale35 = java.util.Locale.FRANCE;
        java.lang.String str36 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale35);
        java.util.Locale locale37 = java.util.Locale.US;
        java.util.Locale locale38 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale39 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale40 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale41 = java.util.Locale.getDefault();
        java.lang.String str42 = locale40.getDisplayCountry(locale41);
        java.lang.String str43 = locale40.toLanguageTag();
        java.util.Locale locale44 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale45 = java.util.Locale.getDefault();
        java.lang.String str46 = locale44.getDisplayCountry(locale45);
        java.util.Locale locale47 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale48 = java.util.Locale.getDefault();
        java.lang.String str49 = locale47.getDisplayCountry(locale48);
        java.util.Locale locale53 = new java.util.Locale("hi", "hi!", "cHINA");
        java.util.Locale locale54 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale55 = java.util.Locale.getDefault();
        java.lang.String str56 = locale54.getDisplayCountry(locale55);
        java.util.Locale locale58 = new java.util.Locale("");
        java.lang.String str59 = locale58.getDisplayVariant();
        java.util.Locale locale60 = java.util.Locale.KOREAN;
        java.util.Locale locale62 = new java.util.Locale("");
        java.util.Locale locale63 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale[] localeArray64 = new java.util.Locale[] { locale35, locale37, locale38, locale39, locale40, locale45, locale47, locale53, locale55, locale58, locale60, locale62, locale63 };
        java.util.ArrayList<java.util.Locale> localeList65 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList65, localeArray64);
        java.util.List<java.util.Locale> localeList67 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList32, (java.util.Collection<java.util.Locale>) localeList65);
        java.util.List<java.util.Locale> localeList68 = java.util.Locale.filter(languageRangeList30, (java.util.Collection<java.util.Locale>) localeList67);
        java.util.Locale.FilteringMode filteringMode69 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList70 = java.util.Locale.filter(languageRangeList22, (java.util.Collection<java.util.Locale>) localeList67, filteringMode69);
        boolean boolean71 = languageRangeList14.retainAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList22);
        int int72 = languageRangeList22.size();
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Locale.LanguageRange" + "'", str6, "Locale.LanguageRange");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "english" + "'", str7, "english");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(languageRangeList14);
        org.junit.Assert.assertNotNull(languageRangeArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(languageRangeList19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(languageRangeList22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(languageRangeItor28);
        org.junit.Assert.assertNotNull(languageRangeList30);
        org.junit.Assert.assertNotNull(languageRangeArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "english" + "'", str36, "english");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "it");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Cina" + "'", str42, "Cina");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "zh-CN" + "'", str43, "zh-CN");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "it");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Cina" + "'", str46, "Cina");
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "it");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Cina" + "'", str49, "Cina");
        org.junit.Assert.assertEquals(locale53.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "it");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "Cina" + "'", str56, "Cina");
        org.junit.Assert.assertEquals(locale58.toString(), "");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertNotNull(locale60);
        org.junit.Assert.assertEquals(locale60.toString(), "ko");
        org.junit.Assert.assertEquals(locale62.toString(), "");
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(localeList67);
        org.junit.Assert.assertNotNull(localeList68);
        org.junit.Assert.assertTrue("'" + filteringMode69 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode69.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
    }

    @Test
    public void test15211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15211");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.lang.Class<?>[] wildcardClassArray3 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray1);
        java.lang.Class<?>[] wildcardClassArray4 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray1);
        java.lang.Class<?>[] wildcardClassArray5 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray1);
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray5, ' ');
        java.lang.Class[] classArray10 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray11 = (java.lang.Class<?>[]) classArray10;
        java.lang.Class<?>[] wildcardClassArray12 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray10);
        java.lang.Class<?> wildcardClass13 = null;
        java.lang.Class[] classArray15 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray16 = (java.lang.Class<?>[]) classArray15;
        wildcardClassArray16[0] = wildcardClass13;
        boolean boolean20 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray12, wildcardClassArray16, false);
        java.lang.Class<?>[] wildcardClassArray21 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray12);
        java.lang.Class<?>[] wildcardClassArray22 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray21);
        java.lang.Class<?>[] wildcardClassArray23 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray21);
        java.lang.Class<?>[] wildcardClassArray24 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray23);
        boolean boolean25 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray5, wildcardClassArray23);
        java.lang.Class<?>[] wildcardClassArray26 = null;
        boolean boolean27 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray5, wildcardClassArray26);
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertNotNull(wildcardClassArray4);
        org.junit.Assert.assertNotNull(wildcardClassArray5);
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(classArray10);
        org.junit.Assert.assertNotNull(wildcardClassArray11);
        org.junit.Assert.assertNotNull(wildcardClassArray12);
        org.junit.Assert.assertNotNull(classArray15);
        org.junit.Assert.assertNotNull(wildcardClassArray16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray21);
        org.junit.Assert.assertNotNull(wildcardClassArray22);
        org.junit.Assert.assertNotNull(wildcardClassArray23);
        org.junit.Assert.assertNotNull(wildcardClassArray24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test15212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15212");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        java.util.Locale locale4 = new java.util.Locale("ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hEnglish", "IA", "zh_CN");
        java.util.Locale locale7 = new java.util.Locale("zho", "US");
        java.util.Locale locale8 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str9 = locale7.getDisplayVariant(locale8);
        java.lang.String str10 = locale4.getDisplayName(locale8);
        java.lang.String str11 = locale8.toLanguageTag();
        java.lang.String str12 = locale0.getDisplayName(locale8);
        java.util.Locale.setDefault(locale0);
        java.util.Set<java.lang.String> strSet14 = locale0.getUnicodeLocaleAttributes();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de");
        org.junit.Assert.assertEquals(locale4.toString(), "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!henglish_IA_zh_CN");
        org.junit.Assert.assertEquals(locale7.toString(), "zho_US");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!henglish (IA,zh,CN)" + "'", str10, "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!henglish (IA,zh,CN)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "fr-CA" + "'", str11, "fr-CA");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "allemand" + "'", str12, "allemand");
        org.junit.Assert.assertNotNull(strSet14);
    }

    @Test
    public void test15213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15213");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "############################NHC");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 31 + "'", int1 == 31);
    }

    @Test
    public void test15214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15214");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("#########################English                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ", "XXXXXXXXXXFRENCH(FRANCE)XXXXXXXXXX                                                           ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#########################English                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 " + "'", str2, "#########################English                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ");
    }

    @Test
    public void test15215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15215");
        java.util.Locale locale1 = new java.util.Locale("zh_C");
        java.util.Locale.Category category2 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale3 = java.util.Locale.ENGLISH;
        java.util.Locale.setDefault(category2, locale3);
        java.util.Locale locale5 = java.util.Locale.JAPANESE;
        java.util.Locale locale7 = java.util.Locale.TAIWAN;
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.upperCase("", locale7);
        java.lang.String str9 = locale5.getDisplayVariant(locale7);
        java.util.Locale.setDefault(category2, locale7);
        java.lang.String str11 = locale7.getVariant();
        java.lang.String str12 = locale1.getDisplayScript(locale7);
        java.lang.String str13 = locale1.getDisplayCountry();
        java.lang.String str14 = locale1.getLanguage();
        java.lang.String str15 = locale1.getScript();
        java.util.Locale.Category category16 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale19 = new java.util.Locale("");
        java.lang.String str20 = locale19.getDisplayLanguage();
        java.util.Locale locale21 = java.util.Locale.CANADA;
        java.lang.String str22 = locale21.getDisplayLanguage();
        java.lang.String str23 = locale19.getDisplayScript(locale21);
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.lowerCase("a", locale19);
        java.lang.String str25 = locale19.getDisplayScript();
        java.util.Locale.setDefault(category16, locale19);
        java.util.Set<java.lang.Character> charSet27 = locale19.getExtensionKeys();
        java.lang.String str28 = locale1.getDisplayScript(locale19);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_c");
        org.junit.Assert.assertTrue("'" + category2 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category2.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "ja");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "zh_c" + "'", str14, "zh_c");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + category16 + "' != '" + java.util.Locale.Category.FORMAT + "'", category16.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertEquals(locale19.toString(), "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\u82f1\u6587" + "'", str22, "\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "a" + "'", str24, "a");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(charSet27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test15216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15216");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "engliIlishESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWA", "Locale.Category");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test15217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15217");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("", "en_");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test15218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15218");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("CINA................................................................................................", "aD.AE.AF.AGchnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.AT.AU.AW.AX.AZ.BA.BB.BD.BE.BF.BG.BH.BI.BJ.BL.BM.BN.BO.BQ.BR.BS.BT.BV.BW.BY.BZ.CA.CC.CD.CF.CG.CH.CI.CK.CL.CM.CN.CO.CR.CU.CV.CW.CX.CY.CZ.DE.DJ.DK.DM.DO.DZ.EC.EE.EG.EH.ER.ES.ET.FI.FJ.FK.FM.FO.FR.GA.GB.GD.GE.GF.GG.GH.GI.GL.GM.GN.GP.GQ.GR.GS.GT.GU.GW.GY.HK.HM.HN.HR.HT.HU.ID.IE.IL.IM.IN.IO.IQ.IR.IS.IT.JE.JM.JO.JP.KE.KG.KH.KI.KM.KN.KP.KR.KW.KY.KZ.LA.LB.LC.LI.LK.LR.LS.LT.LU.LV.LY.MA.MC.MD.ME.MF.MG.MH.MK.ML.MM.MN.MO.MP.MQ.MR.MS.MT.MU.MV.MW.MX.MY.MZ.NA.NC.NE.NF.NG.NI.NL.NO.NP.NR.NU.NZ.OM.PA.PE.PF.PG.PH.PK.PL.PM.PN.PR.PS.PT.PW.PY.QA.RE.RO.RS.RU.RW.SA.SB.SC.SD.SE.SG.SH.SI.SJ.SK.SL.SM.SN.SO.SR.SS.ST.SV.SX.SY.SZ.TC.TD.TF.TG.TH.TJ.TK.TL.TM.TN.TO.TR.TT.TV.TW.TZ.UA.UG.UM.US.UY.UZ.VA.VC.VE.VG.VI.VN.VU.WF.WS.YE.YT.ZA.ZM.ZW", (int) ' ');
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test15219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15219");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder0.removeUnicodeLocaleAttribute("English");
        java.util.Locale locale6 = java.util.Locale.FRANCE;
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale6);
        java.lang.String str8 = locale6.getDisplayScript();
        java.util.Set<java.lang.String> strSet9 = locale6.getUnicodeLocaleAttributes();
        java.util.Locale.Builder builder10 = builder0.setLocale(locale6);
        java.util.Locale.Builder builder11 = builder0.clear();
        java.util.Locale locale12 = builder0.build();
        java.util.Locale locale13 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str14 = locale13.getISO3Language();
        java.lang.String str15 = locale13.getDisplayName();
        java.lang.String str16 = locale13.getDisplayName();
        java.util.Locale locale20 = new java.util.Locale("Cinaxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", "ggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engli", "us");
        java.util.Locale locale21 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale22 = java.util.Locale.getDefault();
        java.lang.String str23 = locale21.getDisplayCountry(locale22);
        java.lang.String str24 = locale21.toLanguageTag();
        java.lang.String str25 = locale21.getCountry();
        java.lang.String str26 = locale21.getISO3Country();
        java.util.Locale locale28 = new java.util.Locale("");
        java.lang.String str29 = locale28.getDisplayVariant();
        java.lang.String str30 = locale21.getDisplayLanguage(locale28);
        java.util.Locale locale31 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale32 = java.util.Locale.getDefault();
        java.lang.String str33 = locale31.getDisplayCountry(locale32);
        java.lang.String str34 = locale31.toLanguageTag();
        java.lang.String str35 = locale31.getLanguage();
        java.util.Locale locale36 = java.util.Locale.ITALIAN;
        java.util.Locale locale38 = new java.util.Locale("");
        java.lang.String str39 = locale38.getDisplayLanguage();
        java.util.Locale locale40 = java.util.Locale.CANADA;
        java.lang.String str41 = locale40.getDisplayLanguage();
        java.lang.String str42 = locale38.getDisplayScript(locale40);
        java.util.Locale locale44 = java.util.Locale.FRANCE;
        java.lang.String str45 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale44);
        java.lang.String str46 = locale38.getDisplayCountry(locale44);
        java.lang.String str47 = locale36.getDisplayScript(locale38);
        java.util.Locale locale48 = java.util.Locale.GERMAN;
        java.lang.String str49 = locale38.getDisplayLanguage(locale48);
        java.lang.String str50 = locale31.getDisplayCountry(locale38);
        java.lang.String str51 = locale38.getCountry();
        java.util.Locale locale55 = new java.util.Locale("....english", "zhcinesese", ".");
        java.lang.String str56 = locale38.getDisplayName(locale55);
        java.lang.String str57 = locale28.getDisplayName(locale55);
        java.lang.String str58 = locale20.getDisplayVariant(locale55);
        java.util.Locale locale62 = new java.util.Locale("undaaaaaaa", "\u4e2d\u6587\u4e2d\u570b)", "");
        java.lang.String str63 = locale55.getDisplayCountry(locale62);
        java.lang.String str64 = locale55.getVariant();
        java.lang.String str65 = locale13.getDisplayVariant(locale55);
        java.lang.String str66 = locale55.getCountry();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder67 = builder0.setLocale(locale55);
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: ....english [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "english" + "'", str7, "english");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "zho" + "'", str14, "zho");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\u4e2d\u6587\u53f0\u7063)" + "'", str15, "\u4e2d\u6587\u53f0\u7063)");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\u4e2d\u6587\u53f0\u7063)" + "'", str16, "\u4e2d\u6587\u53f0\u7063)");
        org.junit.Assert.assertEquals(locale20.toString(), "cinaxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx_GGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLI_us");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "de");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "China" + "'", str23, "China");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "zh-CN" + "'", str24, "zh-CN");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "CN" + "'", str25, "CN");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "CHN" + "'", str26, "CHN");
        org.junit.Assert.assertEquals(locale28.toString(), "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Chinese" + "'", str30, "Chinese");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "de");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "China" + "'", str33, "China");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "zh-CN" + "'", str34, "zh-CN");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "zh" + "'", str35, "zh");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "it");
        org.junit.Assert.assertEquals(locale38.toString(), "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "\u82f1\u6587" + "'", str41, "\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "english" + "'", str45, "english");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "de");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "China" + "'", str50, "China");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals(locale55.toString(), "....english_ZHCINESESE_.");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "us" + "'", str58, "us");
// flaky:         org.junit.Assert.assertEquals(locale62.toString(), "\u4e2d\u6587\u4e2d\u570b)");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "ZHCINESESE" + "'", str63, "ZHCINESESE");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "." + "'", str64, ".");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "ZHCINESESE" + "'", str66, "ZHCINESESE");
    }

    @Test
    public void test15220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15220");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "cHIChinChinChinChinChinChinChinChinChinaaaaaaaaa#A");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test15221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15221");
        java.util.Locale.Builder builder1 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale.Builder builder4 = builder2.setLanguageTag("zh-CN");
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        java.lang.String str7 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) builder4, "CHNaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        java.util.Locale.Builder builder9 = builder4.setLanguageTag("CN");
        java.util.Locale.Builder builder11 = builder9.addUnicodeLocaleAttribute("CHN");
        java.util.Locale.Builder builder12 = builder11.clear();
        java.util.Locale locale13 = java.util.Locale.PRC;
        java.lang.String str14 = locale13.getDisplayName();
        boolean boolean15 = locale13.hasExtensions();
        java.util.Locale locale17 = java.util.Locale.CHINA;
        java.util.Set<java.lang.Character> charSet18 = locale17.getExtensionKeys();
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.lowerCase("String[]", locale17);
        java.lang.String str20 = locale13.getDisplayScript(locale17);
        java.util.Locale.Builder builder21 = builder12.setLocale(locale17);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.lowerCase("AN       english4444444444444444444444444444", locale17);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Locale.Builder" + "'", str7, "Locale.Builder");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\u4e2d\u6587\u4e2d\u570b)" + "'", str14, "\u4e2d\u6587\u4e2d\u570b)");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(charSet18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "string[]" + "'", str19, "string[]");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "an       english4444444444444444444444444444" + "'", str22, "an       english4444444444444444444444444444");
    }

    @Test
    public void test15222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15222");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap3);
        java.util.Locale.LanguageRange[] languageRangeArray5 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList6 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList6, languageRangeArray5);
        boolean boolean8 = languageRangeList1.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList6);
        java.util.Locale.LanguageRange[] languageRangeArray9 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList10 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList10, languageRangeArray9);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap12 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList13 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList10, strMap12);
        java.util.Locale.LanguageRange[] languageRangeArray14 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList15 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList15, languageRangeArray14);
        boolean boolean17 = languageRangeList10.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList15);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList15, "hi!");
        boolean boolean20 = languageRangeList1.remove((java.lang.Object) languageRangeList15);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor21 = languageRangeList1.listIterator();
        java.util.List<java.util.Locale.LanguageRange> languageRangeList23 = java.util.Locale.LanguageRange.parse("zh-CN");
        java.lang.String[] strArray27 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("zh-CNnglese", "inglese", 3);
        int int28 = languageRangeList23.lastIndexOf((java.lang.Object) "zh-CNnglese");
        java.lang.String str30 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList23, "Hindi");
        java.lang.String str32 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList23, 'u');
        int int34 = languageRangeList23.lastIndexOf((java.lang.Object) "CN");
        boolean boolean35 = languageRangeList1.contains((java.lang.Object) languageRangeList23);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream36 = languageRangeList1.parallelStream();
        java.util.Spliterator<java.util.Locale.LanguageRange> languageRangeSpliterator37 = languageRangeList1.spliterator();
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(languageRangeArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(languageRangeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(languageRangeList13);
        org.junit.Assert.assertNotNull(languageRangeArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(languageRangeItor21);
        org.junit.Assert.assertNotNull(languageRangeList23);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(languageRangeStream36);
        org.junit.Assert.assertNotNull(languageRangeSpliterator37);
    }

    @Test
    public void test15223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15223");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                Zxxxxxxxxxxxxxxxx", 6, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                Zxxxxxxxxxxxxxxxx" + "'", str3, "                                Zxxxxxxxxxxxxxxxx");
    }

    @Test
    public void test15224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15224");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "undaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test15225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15225");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale locale4 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str5 = locale4.getISO3Language();
        java.util.Locale.Builder builder6 = builder3.setLocale(locale4);
        java.util.Locale.Builder builder7 = builder3.clearExtensions();
        java.util.Locale locale9 = java.util.Locale.ITALIAN;
        java.util.Locale locale11 = new java.util.Locale("");
        java.lang.String str12 = locale11.getDisplayLanguage();
        java.util.Locale locale13 = java.util.Locale.CANADA;
        java.lang.String str14 = locale13.getDisplayLanguage();
        java.lang.String str15 = locale11.getDisplayScript(locale13);
        java.util.Locale locale17 = java.util.Locale.FRANCE;
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale17);
        java.lang.String str19 = locale11.getDisplayCountry(locale17);
        java.lang.String str20 = locale9.getDisplayScript(locale11);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.upperCase("China", locale9);
        java.util.Locale locale23 = java.util.Locale.TAIWAN;
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.upperCase("", locale23);
        java.lang.String str25 = locale23.getISO3Country();
        java.util.Set<java.lang.Character> charSet26 = locale23.getExtensionKeys();
        java.util.Locale locale27 = locale23.stripExtensions();
        java.lang.String str28 = locale9.getDisplayLanguage(locale23);
        java.util.Locale.Builder builder29 = builder7.setLocale(locale9);
        java.util.Locale locale30 = builder7.build();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "zho" + "'", str5, "zho");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "it");
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\u82f1\u6587" + "'", str14, "\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "english" + "'", str18, "english");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "CHINA" + "'", str21, "CHINA");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "TWN" + "'", str25, "TWN");
        org.junit.Assert.assertNotNull(charSet26);
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\u7fa9\u5927\u5229\u6587" + "'", str28, "\u7fa9\u5927\u5229\u6587");
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "it");
    }

    @Test
    public void test15226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15226");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("Cina", strMap1);
        java.util.Locale locale4 = new java.util.Locale("");
        java.lang.String str5 = locale4.getDisplayLanguage();
        java.util.Locale locale6 = java.util.Locale.CANADA;
        java.lang.String str7 = locale6.getDisplayLanguage();
        java.lang.String str8 = locale4.getDisplayScript(locale6);
        java.lang.String str9 = locale6.getDisplayVariant();
        int int10 = languageRangeList2.indexOf((java.lang.Object) str9);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList13 = languageRangeList2.subList(211, 19);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 19");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u82f1\u6587" + "'", str7, "\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test15227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15227");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("", "..ITALIAHiit_CN..ITALIAHiit_CN..ITALIAHiit_CN..ITALIAH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test15228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15228");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "loca");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test15229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15229");
        java.util.Locale locale2 = java.util.Locale.forLanguageTag("CN");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.parse("hi");
        java.util.Locale.LanguageRange languageRange6 = new java.util.Locale.LanguageRange("cn");
        boolean boolean7 = languageRangeList4.add(languageRange6);
        java.util.Locale locale8 = java.util.Locale.ITALIAN;
        java.util.Locale locale10 = new java.util.Locale("");
        java.lang.String str11 = locale10.getDisplayLanguage();
        java.util.Locale locale12 = java.util.Locale.CANADA;
        java.lang.String str13 = locale12.getDisplayLanguage();
        java.lang.String str14 = locale10.getDisplayScript(locale12);
        java.util.Locale locale16 = java.util.Locale.FRANCE;
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale16);
        java.lang.String str18 = locale10.getDisplayCountry(locale16);
        java.lang.String str19 = locale8.getDisplayScript(locale10);
        java.util.Locale locale20 = java.util.Locale.GERMAN;
        java.lang.String str21 = locale10.getDisplayLanguage(locale20);
        java.util.Locale locale24 = new java.util.Locale("");
        java.lang.String str25 = locale24.getDisplayLanguage();
        java.util.Locale locale26 = java.util.Locale.CANADA;
        java.lang.String str27 = locale26.getDisplayLanguage();
        java.lang.String str28 = locale24.getDisplayScript(locale26);
        java.lang.String str29 = org.apache.commons.lang3.StringUtils.lowerCase("a", locale24);
        java.lang.String str30 = locale24.getDisplayScript();
        java.lang.String str31 = locale20.getDisplayLanguage(locale24);
        java.util.Set<java.lang.String> strSet32 = locale20.getUnicodeLocaleAttributes();
        boolean boolean33 = languageRangeList4.remove((java.lang.Object) locale20);
        java.lang.String str34 = locale20.getVariant();
        java.util.Locale locale35 = java.util.Locale.CHINA;
        java.util.Set<java.lang.Character> charSet36 = locale35.getExtensionKeys();
        java.util.Set<java.lang.String> strSet37 = locale35.getUnicodeLocaleAttributes();
        java.lang.String str38 = locale20.getDisplayName(locale35);
        java.lang.String str39 = locale2.getDisplayName(locale35);
        java.lang.String str40 = org.apache.commons.lang3.StringUtils.lowerCase("$$$$$$$$$$$$$xxxxxxxxinglese (Canada)xxxxxxxx$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$", locale35);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "cn");
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "it");
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\u82f1\u6587" + "'", str13, "\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "english" + "'", str17, "english");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "de");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals(locale24.toString(), "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\u82f1\u6587" + "'", str27, "\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "a" + "'", str29, "a");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "German" + "'", str31, "German");
        org.junit.Assert.assertNotNull(strSet32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(charSet36);
        org.junit.Assert.assertNotNull(strSet37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "\u5fb7\u6587" + "'", str38, "\u5fb7\u6587");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "cn" + "'", str39, "cn");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "$$$$$$$$$$$$$xxxxxxxxinglese (canada)xxxxxxxx$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$" + "'", str40, "$$$$$$$$$$$$$xxxxxxxxinglese (canada)xxxxxxxx$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
    }

    @Test
    public void test15230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15230");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("...x.az.ba.bb.bd.be.bf.bg.bh.bi.bj.bl.bm.bn..._ITALIANO");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test15231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15231");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("it", strMap1);
        java.util.Locale locale3 = java.util.Locale.getDefault();
        int int4 = languageRangeList2.lastIndexOf((java.lang.Object) locale3);
        java.util.Locale.LanguageRange[] languageRangeArray5 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList6 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList6, languageRangeArray5);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap8 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList9 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList6, strMap8);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor10 = languageRangeList9.listIterator();
        java.util.Locale.LanguageRange[] languageRangeArray11 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList12 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList12, languageRangeArray11);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap14 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList15 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList12, strMap14);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor16 = languageRangeList15.listIterator();
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        java.util.Locale.LanguageRange[] languageRangeArray21 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList22 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList22, languageRangeArray21);
        java.util.Locale locale25 = java.util.Locale.FRANCE;
        java.lang.String str26 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale25);
        java.util.Locale locale27 = java.util.Locale.US;
        java.util.Locale locale28 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale29 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale30 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale31 = java.util.Locale.getDefault();
        java.lang.String str32 = locale30.getDisplayCountry(locale31);
        java.lang.String str33 = locale30.toLanguageTag();
        java.util.Locale locale34 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale35 = java.util.Locale.getDefault();
        java.lang.String str36 = locale34.getDisplayCountry(locale35);
        java.util.Locale locale37 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale38 = java.util.Locale.getDefault();
        java.lang.String str39 = locale37.getDisplayCountry(locale38);
        java.util.Locale locale43 = new java.util.Locale("hi", "hi!", "cHINA");
        java.util.Locale locale44 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale45 = java.util.Locale.getDefault();
        java.lang.String str46 = locale44.getDisplayCountry(locale45);
        java.util.Locale locale48 = new java.util.Locale("");
        java.lang.String str49 = locale48.getDisplayVariant();
        java.util.Locale locale50 = java.util.Locale.KOREAN;
        java.util.Locale locale52 = new java.util.Locale("");
        java.util.Locale locale53 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale[] localeArray54 = new java.util.Locale[] { locale25, locale27, locale28, locale29, locale30, locale35, locale37, locale43, locale45, locale48, locale50, locale52, locale53 };
        java.util.ArrayList<java.util.Locale> localeList55 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList55, localeArray54);
        java.util.List<java.util.Locale> localeList57 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList22, (java.util.Collection<java.util.Locale>) localeList55);
        java.lang.String[] strArray65 = new java.lang.String[] { "English", "hi", "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "", "a", "", "China" };
        java.util.ArrayList<java.lang.String> strList66 = new java.util.ArrayList<java.lang.String>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList66, strArray65);
        java.util.List<java.lang.Class<?>> wildcardClassList68 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList66);
        java.util.Locale.FilteringMode filteringMode69 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList70 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList22, (java.util.Collection<java.lang.String>) strList66, filteringMode69);
        java.util.List<java.lang.String> strList71 = java.util.Locale.filterTags(languageRangeList15, (java.util.Collection<java.lang.String>) strList19, filteringMode69);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor72 = languageRangeList15.listIterator();
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream73 = languageRangeList15.parallelStream();
        boolean boolean74 = languageRangeList9.remove((java.lang.Object) languageRangeStream73);
        boolean boolean75 = languageRangeList2.containsAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList9);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream76 = languageRangeList9.stream();
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "de");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(languageRangeArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(languageRangeList9);
        org.junit.Assert.assertNotNull(languageRangeItor10);
        org.junit.Assert.assertNotNull(languageRangeArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(languageRangeList15);
        org.junit.Assert.assertNotNull(languageRangeItor16);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(languageRangeArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "english" + "'", str26, "english");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "de");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "China" + "'", str32, "China");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "zh-CN" + "'", str33, "zh-CN");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "de");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "China" + "'", str36, "China");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "de");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "China" + "'", str39, "China");
        org.junit.Assert.assertEquals(locale43.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "de");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "China" + "'", str46, "China");
        org.junit.Assert.assertEquals(locale48.toString(), "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "ko");
        org.junit.Assert.assertEquals(locale52.toString(), "");
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(localeList57);
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(wildcardClassList68);
        org.junit.Assert.assertTrue("'" + filteringMode69 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode69.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList70);
        org.junit.Assert.assertNotNull(strList71);
        org.junit.Assert.assertNotNull(languageRangeItor72);
        org.junit.Assert.assertNotNull(languageRangeStream73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(languageRangeStream76);
    }

    @Test
    public void test15232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15232");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("e!e(Tiiwin                                                                                       ", "##################EnglCNsCN###################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "e!e(Tiiwin                                                                                       " + "'", str2, "e!e(Tiiwin                                                                                       ");
    }

    @Test
    public void test15233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15233");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("i##################################################################################################", "esecnarfundaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test15234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15234");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("ANIHCxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", 117);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                       ANIHCxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx" + "'", str2, "                       ANIHCxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
    }

    @Test
    public void test15235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15235");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("nglais", "ese(China)");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test15236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15236");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("nglais", 15);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "    nglais     " + "'", str2, "    nglais     ");
    }

    @Test
    public void test15237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15237");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("a", "", 0);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, 'a', (int) (byte) 1, (int) (byte) -1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "Cina");
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, 'u');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.concatWith(".....ZHCINESESEn", (java.lang.Object[]) strArray4);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, 'u', 18, (int) (byte) 1);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "a" + "'", str10, "a");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "a" + "'", str12, "a");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "a" + "'", str13, "a");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test15238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15238");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("...e.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugernge...", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!              aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test15239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15239");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("hi");
        boolean boolean3 = languageRangeList1.remove((java.lang.Object) "English");
        java.util.Locale.LanguageRange[] languageRangeArray4 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList5 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList5, languageRangeArray4);
        java.util.Locale locale8 = java.util.Locale.FRANCE;
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale8);
        java.util.Locale locale10 = java.util.Locale.US;
        java.util.Locale locale11 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale12 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale13 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale14 = java.util.Locale.getDefault();
        java.lang.String str15 = locale13.getDisplayCountry(locale14);
        java.lang.String str16 = locale13.toLanguageTag();
        java.util.Locale locale17 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale18 = java.util.Locale.getDefault();
        java.lang.String str19 = locale17.getDisplayCountry(locale18);
        java.util.Locale locale20 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale21 = java.util.Locale.getDefault();
        java.lang.String str22 = locale20.getDisplayCountry(locale21);
        java.util.Locale locale26 = new java.util.Locale("hi", "hi!", "cHINA");
        java.util.Locale locale27 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale28 = java.util.Locale.getDefault();
        java.lang.String str29 = locale27.getDisplayCountry(locale28);
        java.util.Locale locale31 = new java.util.Locale("");
        java.lang.String str32 = locale31.getDisplayVariant();
        java.util.Locale locale33 = java.util.Locale.KOREAN;
        java.util.Locale locale35 = new java.util.Locale("");
        java.util.Locale locale36 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale[] localeArray37 = new java.util.Locale[] { locale8, locale10, locale11, locale12, locale13, locale18, locale20, locale26, locale28, locale31, locale33, locale35, locale36 };
        java.util.ArrayList<java.util.Locale> localeList38 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList38, localeArray37);
        java.util.List<java.util.Locale> localeList40 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList5, (java.util.Collection<java.util.Locale>) localeList38);
        java.util.List<java.util.Locale> localeList41 = java.util.Locale.filter(languageRangeList1, (java.util.Collection<java.util.Locale>) localeList38);
        java.util.Locale.LanguageRange[] languageRangeArray42 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList43 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList43, languageRangeArray42);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap45 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList46 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList43, strMap45);
        int int47 = languageRangeList43.size();
        java.util.Locale.LanguageRange languageRange49 = new java.util.Locale.LanguageRange("English");
        java.util.Locale.LanguageRange languageRange51 = new java.util.Locale.LanguageRange("English");
        java.util.Locale.LanguageRange languageRange53 = new java.util.Locale.LanguageRange("a");
        java.util.Locale.LanguageRange[] languageRangeArray54 = new java.util.Locale.LanguageRange[] { languageRange49, languageRange51, languageRange53 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList55 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList55, languageRangeArray54);
        boolean boolean57 = languageRangeList43.retainAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList55);
        boolean boolean58 = languageRangeList1.containsAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList43);
        java.lang.String str60 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList1, 'u');
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream61 = languageRangeList1.parallelStream();
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(languageRangeArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "english" + "'", str9, "english");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "de");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "China" + "'", str15, "China");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "zh-CN" + "'", str16, "zh-CN");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "de");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "China" + "'", str19, "China");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "de");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "China" + "'", str22, "China");
        org.junit.Assert.assertEquals(locale26.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "de");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "China" + "'", str29, "China");
        org.junit.Assert.assertEquals(locale31.toString(), "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "ko");
        org.junit.Assert.assertEquals(locale35.toString(), "");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(localeList40);
        org.junit.Assert.assertNotNull(localeList41);
        org.junit.Assert.assertNotNull(languageRangeArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(languageRangeList46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(languageRangeArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(languageRangeStream61);
    }

    @Test
    public void test15240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15240");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("hI", "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuItali");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hI" + "'", str2, "hI");
    }

    @Test
    public void test15241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15241");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("zh_tw", "            locale.builder                         locale.builder                    CHINOIS (CHINE)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test15242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15242");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("aragonese");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aragonese" + "'", str1, "aragonese");
    }

    @Test
    public void test15243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15243");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("undaaaaaaa", (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test15244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15244");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("CHINCHINCHINCHINCHICHINCHINCHINCHINC");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "CHINCHINCHINCHINCHICHINCHINCHINCHINC" + "'", str1, "CHINCHINCHINCHINCHICHINCHINCHINCHINC");
    }

    @Test
    public void test15245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15245");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi", "A", (int) (short) -1);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '4');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi" + "'", str5, "hi");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi" + "'", str6, "hi");
    }

    @Test
    public void test15246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15246");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap3);
        int int5 = languageRangeList1.size();
        java.util.Locale.LanguageRange languageRange7 = new java.util.Locale.LanguageRange("English");
        java.util.Locale.LanguageRange languageRange9 = new java.util.Locale.LanguageRange("English");
        java.util.Locale.LanguageRange languageRange11 = new java.util.Locale.LanguageRange("a");
        java.util.Locale.LanguageRange[] languageRangeArray12 = new java.util.Locale.LanguageRange[] { languageRange7, languageRange9, languageRange11 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList13 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList13, languageRangeArray12);
        boolean boolean15 = languageRangeList1.retainAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList13);
        java.util.Locale locale18 = new java.util.Locale("");
        java.lang.String str19 = locale18.getDisplayLanguage();
        java.util.Locale locale20 = java.util.Locale.CANADA;
        java.lang.String str21 = locale20.getDisplayLanguage();
        java.lang.String str22 = locale18.getDisplayScript(locale20);
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.lowerCase("a", locale18);
        java.lang.String str24 = locale18.getDisplayScript();
        java.util.Set<java.lang.String> strSet25 = locale18.getUnicodeLocaleAttributes();
        java.util.Locale.FilteringMode filteringMode26 = null;
        java.util.List<java.lang.String> strList27 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList13, (java.util.Collection<java.lang.String>) strSet25, filteringMode26);
        java.lang.String str29 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList13, "\u6cd5\u6587");
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream30 = languageRangeList13.stream();
        boolean boolean31 = languageRangeList13.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange33 = languageRangeList13.remove(51);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 51, Size: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(languageRangeArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals(locale18.toString(), "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\u82f1\u6587" + "'", str21, "\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "a" + "'", str23, "a");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertNotNull(strList27);
        org.junit.Assert.assertNotNull(languageRangeStream30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test15247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15247");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("$$$$$$$$$nawiaT( eseengls$$$$$$$$$nawiaT( esE", 649, 20);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test15248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15248");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("locle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugernge", '.');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "lngugernge.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.locle" + "'", str2, "lngugernge.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.locle");
    }

    @Test
    public void test15249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15249");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.lang.String str1 = locale0.getLanguage();
        java.lang.String str2 = locale0.getLanguage();
        java.util.Locale locale3 = java.util.Locale.ITALIAN;
        java.util.Locale locale5 = new java.util.Locale("");
        java.lang.String str6 = locale5.getDisplayLanguage();
        java.util.Locale locale7 = java.util.Locale.CANADA;
        java.lang.String str8 = locale7.getDisplayLanguage();
        java.lang.String str9 = locale5.getDisplayScript(locale7);
        java.util.Locale locale11 = java.util.Locale.FRANCE;
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale11);
        java.lang.String str13 = locale5.getDisplayCountry(locale11);
        java.lang.String str14 = locale3.getDisplayScript(locale5);
        java.util.Locale.setDefault(locale3);
        java.util.Locale locale19 = new java.util.Locale("hi", "hi!", "cHINA");
        java.util.Locale locale20 = java.util.Locale.ITALIAN;
        java.util.Locale locale22 = new java.util.Locale("");
        java.lang.String str23 = locale22.getDisplayLanguage();
        java.util.Locale locale24 = java.util.Locale.CANADA;
        java.lang.String str25 = locale24.getDisplayLanguage();
        java.lang.String str26 = locale22.getDisplayScript(locale24);
        java.util.Locale locale28 = java.util.Locale.FRANCE;
        java.lang.String str29 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale28);
        java.lang.String str30 = locale22.getDisplayCountry(locale28);
        java.lang.String str31 = locale20.getDisplayScript(locale22);
        java.util.Locale.setDefault(locale20);
        java.lang.String str33 = locale19.getDisplayVariant(locale20);
        java.lang.String str34 = locale3.getDisplayLanguage(locale20);
        java.lang.String str35 = locale0.getDisplayLanguage(locale20);
        java.util.Locale locale36 = locale20.stripExtensions();
        java.util.Locale locale40 = new java.util.Locale("", "zh-cnenglish (LOCALE.LANGUAGERANGE)", "");
        java.lang.String str41 = locale36.getDisplayScript(locale40);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "it" + "'", str1, "it");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "it" + "'", str2, "it");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "it");
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\u82f1\u6587" + "'", str8, "\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "english" + "'", str12, "english");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals(locale19.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "it");
        org.junit.Assert.assertEquals(locale22.toString(), "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "inglese" + "'", str25, "inglese");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "english" + "'", str29, "english");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "cHINA" + "'", str33, "cHINA");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "italiano" + "'", str34, "italiano");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "italiano" + "'", str35, "italiano");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "it");
        org.junit.Assert.assertEquals(locale40.toString(), "_ZH-CNENGLISH (LOCALE.LANGUAGERANGE)");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
    }

    @Test
    public void test15250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15250");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("ngls");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ngl" + "'", str1, "ngl");
    }

    @Test
    public void test15251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15251");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("l", 3);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  l" + "'", str2, "  l");
    }

    @Test
    public void test15252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15252");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("zh-cnenglh", "\u56fd\u4e2d\u6587\u4e2d   AD.AE.AF.A", "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zh-cnenglh" + "'", str3, "zh-cnenglh");
    }

    @Test
    public void test15253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15253");
        java.util.Locale locale0 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale1 = java.util.Locale.getDefault();
        java.lang.String str2 = locale0.getDisplayCountry(locale1);
        java.lang.String str3 = locale0.toLanguageTag();
        java.lang.String str4 = locale0.getLanguage();
        java.util.Locale locale5 = java.util.Locale.ITALIAN;
        java.util.Locale locale7 = new java.util.Locale("");
        java.lang.String str8 = locale7.getDisplayLanguage();
        java.util.Locale locale9 = java.util.Locale.CANADA;
        java.lang.String str10 = locale9.getDisplayLanguage();
        java.lang.String str11 = locale7.getDisplayScript(locale9);
        java.util.Locale locale13 = java.util.Locale.FRANCE;
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale13);
        java.lang.String str15 = locale7.getDisplayCountry(locale13);
        java.lang.String str16 = locale5.getDisplayScript(locale7);
        java.util.Locale locale17 = java.util.Locale.GERMAN;
        java.lang.String str18 = locale7.getDisplayLanguage(locale17);
        java.lang.String str19 = locale0.getDisplayCountry(locale7);
        java.util.Locale.setDefault(locale0);
        java.lang.String str21 = locale0.getLanguage();
        boolean boolean22 = locale0.hasExtensions();
        java.util.Locale locale23 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str24 = locale23.getDisplayLanguage();
        java.util.Locale locale25 = java.util.Locale.getDefault();
        java.lang.String str26 = locale23.getDisplayCountry(locale25);
        java.util.Locale locale27 = java.util.Locale.TAIWAN;
        java.lang.String str28 = locale27.getVariant();
        java.lang.String str29 = locale23.getDisplayName(locale27);
        java.lang.String str30 = locale27.toLanguageTag();
        java.util.Locale locale32 = new java.util.Locale("En");
        java.lang.String str33 = locale32.getDisplayLanguage();
        java.lang.String str34 = locale27.getDisplayVariant(locale32);
        java.lang.String str35 = locale0.getDisplayScript(locale32);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Cina" + "'", str2, "Cina");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zh-CN" + "'", str3, "zh-CN");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zh" + "'", str4, "zh");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "it");
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "inglese" + "'", str10, "inglese");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "english" + "'", str14, "english");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "de");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "China" + "'", str19, "China");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "zh" + "'", str21, "zh");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\u4e2d\u6587" + "'", str24, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\u53f0\u6e7e\u5730\u533a" + "'", str26, "\u53f0\u6e7e\u5730\u533a");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\u4e2d\u6587\u53f0\u7063)" + "'", str29, "\u4e2d\u6587\u53f0\u7063)");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "zh-TW" + "'", str30, "zh-TW");
        org.junit.Assert.assertEquals(locale32.toString(), "en");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "\u82f1\u6587" + "'", str33, "\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
    }

    @Test
    public void test15254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15254");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "cHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test15255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15255");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "e!e(tiiwin                        ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test15256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15256");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("                         a                          ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                          a                         " + "'", str1, "                          a                         ");
    }

    @Test
    public void test15257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15257");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxchn     ", "WT");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test15258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15258");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("ol", " ZH  ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test15259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15259");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("cn");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange3 = languageRangeList1.remove(990);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 990, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeList1);
    }

    @Test
    public void test15260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15260");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("s", "                                                      java.lang                                                      ", "CLASS[]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "s" + "'", str3, "s");
    }

    @Test
    public void test15261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15261");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "........locale.builde");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test15262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15262");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hEnglish", "                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test15263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15263");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("i###################################################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "i###################################################################################################" + "'", str1, "i###################################################################################################");
    }

    @Test
    public void test15264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15264");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap3);
        int int5 = languageRangeList1.size();
        java.util.Locale.LanguageRange languageRange7 = new java.util.Locale.LanguageRange("English");
        java.util.Locale.LanguageRange languageRange9 = new java.util.Locale.LanguageRange("English");
        java.util.Locale.LanguageRange languageRange11 = new java.util.Locale.LanguageRange("a");
        java.util.Locale.LanguageRange[] languageRangeArray12 = new java.util.Locale.LanguageRange[] { languageRange7, languageRange9, languageRange11 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList13 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList13, languageRangeArray12);
        boolean boolean15 = languageRangeList1.retainAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList13);
        java.util.Spliterator<java.util.Locale.LanguageRange> languageRangeSpliterator16 = languageRangeList1.spliterator();
        languageRangeList1.clear();
        java.util.Iterator<java.util.Locale.LanguageRange> languageRangeItor18 = languageRangeList1.iterator();
        java.lang.String str20 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) languageRangeItor18, "ESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWAN");
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(languageRangeItor18, "C...");
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(languageRangeArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(languageRangeSpliterator16);
        org.junit.Assert.assertNotNull(languageRangeItor18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "java.util" + "'", str20, "java.util");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test15265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15265");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("nch(France)xxxxxxxxxx");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test15266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15266");
        char[] charArray7 = new char[] {};
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "zh-CN", charArray7);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "a", charArray7);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "  China   ", charArray7);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "zh_CN", charArray7);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "TW", charArray7);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                                wt                                                ", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test15267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15267");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("", "cCHNAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAina (CCHNAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAina)", 52, 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "cCHNAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAina (CCHNAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAina)" + "'", str4, "cCHNAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAina (CCHNAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAina)");
    }

    @Test
    public void test15268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15268");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "ad.ae.af.ag.ai.al.am.an.ao.aq.ar.as.at.au.aw.ax.az.ba.bb.bd.be.bf.bg.bh.bi.bj.bl.bm.bn.bo.bq.br.bs.bt.bv.bw.by.bz.ca.cc.cd.cf.cg.ch.ci.ck.cl.cm.cn.co.cr.cu.cv.cw.cx.cy.cz.de.dj.dk.dm.do.dz.ec.ee.eg.eh.er.es.et.fi.fj.fk.fm.fo.fr.ga.gb.gd.ge.gf.gg.gh.gi.gl.gm.gn.gp.gq.gr.gs.gt.gu.gw.gy.hk.hm.hn.hr.ht.hu.id.ie.il.im.in.io.iq.ir.is.it.je.jm.jo.jp.ke.kg.kh.ki.km.kn.kp.kr.kw.ky.kz.la.lb.lc.li.lk.lr.ls.lt.lu.lv.ly.ma.mc.md.me.mf.mg.mh.mk.ml.mm.mn.mo.mp.mq.mr.ms.mt.mu.mv.mw.mx.my.mz.na.nc.ne.nf.ng.ni.nl.no.np.nr.nu.nz.om.pa.pe.pf.pg.ph.pk.pl.pm.pn.pr.ps.pt.pw.py.qa.re.ro.rs.ru.rw.sa.sb.sc.sd.se.sg.sh.si.sj.sk.sl.sm.sn.so.sr.ss.st.sv.sx.sy.sz.tc.td.tf.tg.th.tj.tk.tl.tm.tn.to.tr.tt.tv.tw.tz.ua.ug.um.us.uy.uz.va.vc.ve.vg.vi.vn.vu.wf.ws.ye.yt.za....");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test15269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15269");
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) "FRA", "\u6cd5\u6cd5\u6587\u6587ST##############");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "String" + "'", str2, "String");
    }

    @Test
    public void test15270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15270");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("\u0939\u093f\u0902\u0926\u0940", 51);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test15271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15271");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("cINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINA", "eNGLIILISH", "java.util.stream", 81);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "cINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINA" + "'", str4, "cINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINA");
    }

    @Test
    public void test15272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15272");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByCharacterType("Hindi (HI!,cHINA)");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny("IA", strArray3);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]", strArray3);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test15273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15273");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("LOCALE#LANGUAGERANGE", "it                                           it          AD.AE.AF.AGchnaafraAD.AE.AF.AGchnaaa", 33);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test15274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15274");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale.Builder builder3 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder5 = builder1.setRegion("zh");
        java.util.Locale.Builder builder6 = builder5.clear();
        java.util.Locale.Builder builder7 = builder6.clearExtensions();
        java.util.Locale.Builder builder9 = builder6.addUnicodeLocaleAttribute("CAN");
        java.util.Locale locale10 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale11 = java.util.Locale.getDefault();
        java.lang.String str12 = locale10.getDisplayCountry(locale11);
        java.lang.String str13 = locale10.toLanguageTag();
        java.lang.String str14 = locale10.getVariant();
        java.util.Locale.Builder builder15 = builder6.setLocale(locale10);
        java.util.Locale locale17 = java.util.Locale.forLanguageTag("CN");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList19 = java.util.Locale.LanguageRange.parse("hi");
        java.util.Locale.LanguageRange languageRange21 = new java.util.Locale.LanguageRange("cn");
        boolean boolean22 = languageRangeList19.add(languageRange21);
        java.util.Locale locale23 = java.util.Locale.ITALIAN;
        java.util.Locale locale25 = new java.util.Locale("");
        java.lang.String str26 = locale25.getDisplayLanguage();
        java.util.Locale locale27 = java.util.Locale.CANADA;
        java.lang.String str28 = locale27.getDisplayLanguage();
        java.lang.String str29 = locale25.getDisplayScript(locale27);
        java.util.Locale locale31 = java.util.Locale.FRANCE;
        java.lang.String str32 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale31);
        java.lang.String str33 = locale25.getDisplayCountry(locale31);
        java.lang.String str34 = locale23.getDisplayScript(locale25);
        java.util.Locale locale35 = java.util.Locale.GERMAN;
        java.lang.String str36 = locale25.getDisplayLanguage(locale35);
        java.util.Locale locale39 = new java.util.Locale("");
        java.lang.String str40 = locale39.getDisplayLanguage();
        java.util.Locale locale41 = java.util.Locale.CANADA;
        java.lang.String str42 = locale41.getDisplayLanguage();
        java.lang.String str43 = locale39.getDisplayScript(locale41);
        java.lang.String str44 = org.apache.commons.lang3.StringUtils.lowerCase("a", locale39);
        java.lang.String str45 = locale39.getDisplayScript();
        java.lang.String str46 = locale35.getDisplayLanguage(locale39);
        java.util.Set<java.lang.String> strSet47 = locale35.getUnicodeLocaleAttributes();
        boolean boolean48 = languageRangeList19.remove((java.lang.Object) locale35);
        java.lang.String str49 = locale35.getVariant();
        java.util.Locale locale50 = java.util.Locale.CHINA;
        java.util.Set<java.lang.Character> charSet51 = locale50.getExtensionKeys();
        java.util.Set<java.lang.String> strSet52 = locale50.getUnicodeLocaleAttributes();
        java.lang.String str53 = locale35.getDisplayName(locale50);
        java.lang.String str54 = locale17.getDisplayName(locale50);
        java.lang.String str55 = locale10.getDisplayVariant(locale50);
        java.lang.String str56 = locale10.getCountry();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\u4e2d\u56fd" + "'", str12, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "zh-CN" + "'", str13, "zh-CN");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "cn");
        org.junit.Assert.assertNotNull(languageRangeList19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "it");
        org.junit.Assert.assertEquals(locale25.toString(), "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\u82f1\u6587" + "'", str28, "\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "english" + "'", str32, "english");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "de");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals(locale39.toString(), "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "\u82f1\u6587" + "'", str42, "\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "a" + "'", str44, "a");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "German" + "'", str46, "German");
        org.junit.Assert.assertNotNull(strSet47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(charSet51);
        org.junit.Assert.assertNotNull(strSet52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "\u5fb7\u6587" + "'", str53, "\u5fb7\u6587");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "cn" + "'", str54, "cn");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "CN" + "'", str56, "CN");
    }

    @Test
    public void test15275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15275");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "FranceseFranceseFranceseFranceseFrancslgne");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test15276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15276");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test15277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15277");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("DE       ", "\u30d2\u30f3\u30c7\u30a3\u30fc\u8a9e (HI!,cHINA)", "h                                                gnalesenic.esenicavaj                                                I");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DE       " + "'", str3, "DE       ");
    }

    @Test
    public void test15278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15278");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("RBG", "class java.lang.Stringclass java.lang.String");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test15279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15279");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("ita", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ita" + "'", str2, "ita");
    }

    @Test
    public void test15280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15280");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("Ci_aCi_aCi_aCi_aCi_aCi_aCi_aCi_aCi_aCi_", (double) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=ci_aci_aci_aci_aci_aci_aci_aci_aci_aci_");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test15281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15281");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.setLanguageTag("zh-CN");
        java.util.Locale.Builder builder5 = builder3.setLanguage("CHINA");
        java.util.Locale locale7 = java.util.Locale.ITALIAN;
        java.util.Locale locale9 = new java.util.Locale("");
        java.lang.String str10 = locale9.getDisplayLanguage();
        java.util.Locale locale11 = java.util.Locale.CANADA;
        java.lang.String str12 = locale11.getDisplayLanguage();
        java.lang.String str13 = locale9.getDisplayScript(locale11);
        java.util.Locale locale15 = java.util.Locale.FRANCE;
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale15);
        java.lang.String str17 = locale9.getDisplayCountry(locale15);
        java.lang.String str18 = locale7.getDisplayScript(locale9);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.upperCase("China", locale7);
        java.lang.String str20 = locale7.getVariant();
        java.util.Locale locale24 = new java.util.Locale("zho", "US");
        java.util.Locale locale25 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str26 = locale24.getDisplayVariant(locale25);
        java.lang.String str27 = locale25.getVariant();
        java.lang.String str28 = org.apache.commons.lang3.StringUtils.upperCase("AD.AE.AF.AG.AI.AL.AM.AN.AO.AQ.AR.AS.AT.AU.AW.AX.AZ.BA.BB.BD.BE.BF.BG.BH.BI.BJ.BL.BM.BN.BO.BQ.BR.BS.BT.BV.BW.BY.BZ.CA.CC.CD.CF.CG.CH.CI.CK.CL.CM.CN.CO.CR.CU.CV.CW.CX.CY.CZ.DE.DJ.DK.DM.DO.DZ.EC.EE.EG.EH.ER.ES.ET.FI.FJ.FK.FM.FO.FR.GA.GB.GD.GE.GF.GG.GH.GI.GL.GM.GN.GP.GQ.GR.GS.GT.GU.GW.GY.HK.HM.HN.HR.HT.HU.ID.IE.IL.IM.IN.IO.IQ.IR.IS.IT.JE.JM.JO.JP.KE.KG.KH.KI.KM.KN.KP.KR.KW.KY.KZ.LA.LB.LC.LI.LK.LR.LS.LT.LU.LV.LY.MA.MC.MD.ME.MF.MG.MH.MK.ML.MM.MN.MO.MP.MQ.MR.MS.MT.MU.MV.MW.MX.MY.MZ.NA.NC.NE.NF.NG.NI.NL.NO.NP.NR.NU.NZ.OM.PA.PE.PF.PG.PH.PK.PL.PM.PN.PR.PS.PT.PW.PY.QA.RE.RO.RS.RU.RW.SA.SB.SC.SD.SE.SG.SH.SI.SJ.SK.SL.SM.SN.SO.SR.SS.ST.SV.SX.SY.SZ.TC.TD.TF.TG.TH.TJ.TK.TL.TM.TN.TO.TR.TT.TV.TW.TZ.UA.UG.UM.US.UY.UZ.VA.VC.VE.VG.VI.VN.VU.WF.WS.YE.YT.ZA.ZM.ZW", locale25);
        java.lang.String str29 = locale25.getCountry();
        java.lang.String str30 = locale7.getDisplayLanguage(locale25);
        java.util.Locale.Builder builder31 = builder3.setLocale(locale25);
        java.util.Locale.Builder builder33 = builder31.addUnicodeLocaleAttribute("CINESE");
        java.util.Locale.Builder builder34 = builder31.clearExtensions();
        java.util.Locale.Builder builder35 = builder31.clear();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "it");
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\u82f1\u6587" + "'", str12, "\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "english" + "'", str16, "english");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "CHINA" + "'", str19, "CHINA");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals(locale24.toString(), "zho_US");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "AD.AE.AF.AG.AI.AL.AM.AN.AO.AQ.AR.AS.AT.AU.AW.AX.AZ.BA.BB.BD.BE.BF.BG.BH.BI.BJ.BL.BM.BN.BO.BQ.BR.BS.BT.BV.BW.BY.BZ.CA.CC.CD.CF.CG.CH.CI.CK.CL.CM.CN.CO.CR.CU.CV.CW.CX.CY.CZ.DE.DJ.DK.DM.DO.DZ.EC.EE.EG.EH.ER.ES.ET.FI.FJ.FK.FM.FO.FR.GA.GB.GD.GE.GF.GG.GH.GI.GL.GM.GN.GP.GQ.GR.GS.GT.GU.GW.GY.HK.HM.HN.HR.HT.HU.ID.IE.IL.IM.IN.IO.IQ.IR.IS.IT.JE.JM.JO.JP.KE.KG.KH.KI.KM.KN.KP.KR.KW.KY.KZ.LA.LB.LC.LI.LK.LR.LS.LT.LU.LV.LY.MA.MC.MD.ME.MF.MG.MH.MK.ML.MM.MN.MO.MP.MQ.MR.MS.MT.MU.MV.MW.MX.MY.MZ.NA.NC.NE.NF.NG.NI.NL.NO.NP.NR.NU.NZ.OM.PA.PE.PF.PG.PH.PK.PL.PM.PN.PR.PS.PT.PW.PY.QA.RE.RO.RS.RU.RW.SA.SB.SC.SD.SE.SG.SH.SI.SJ.SK.SL.SM.SN.SO.SR.SS.ST.SV.SX.SY.SZ.TC.TD.TF.TG.TH.TJ.TK.TL.TM.TN.TO.TR.TT.TV.TW.TZ.UA.UG.UM.US.UY.UZ.VA.VC.VE.VG.VI.VN.VU.WF.WS.YE.YT.ZA.ZM.ZW" + "'", str28, "AD.AE.AF.AG.AI.AL.AM.AN.AO.AQ.AR.AS.AT.AU.AW.AX.AZ.BA.BB.BD.BE.BF.BG.BH.BI.BJ.BL.BM.BN.BO.BQ.BR.BS.BT.BV.BW.BY.BZ.CA.CC.CD.CF.CG.CH.CI.CK.CL.CM.CN.CO.CR.CU.CV.CW.CX.CY.CZ.DE.DJ.DK.DM.DO.DZ.EC.EE.EG.EH.ER.ES.ET.FI.FJ.FK.FM.FO.FR.GA.GB.GD.GE.GF.GG.GH.GI.GL.GM.GN.GP.GQ.GR.GS.GT.GU.GW.GY.HK.HM.HN.HR.HT.HU.ID.IE.IL.IM.IN.IO.IQ.IR.IS.IT.JE.JM.JO.JP.KE.KG.KH.KI.KM.KN.KP.KR.KW.KY.KZ.LA.LB.LC.LI.LK.LR.LS.LT.LU.LV.LY.MA.MC.MD.ME.MF.MG.MH.MK.ML.MM.MN.MO.MP.MQ.MR.MS.MT.MU.MV.MW.MX.MY.MZ.NA.NC.NE.NF.NG.NI.NL.NO.NP.NR.NU.NZ.OM.PA.PE.PF.PG.PH.PK.PL.PM.PN.PR.PS.PT.PW.PY.QA.RE.RO.RS.RU.RW.SA.SB.SC.SD.SE.SG.SH.SI.SJ.SK.SL.SM.SN.SO.SR.SS.ST.SV.SX.SY.SZ.TC.TD.TF.TG.TH.TJ.TK.TL.TM.TN.TO.TR.TT.TV.TW.TZ.UA.UG.UM.US.UY.UZ.VA.VC.VE.VG.VI.VN.VU.WF.WS.YE.YT.ZA.ZM.ZW");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "CA" + "'", str29, "CA");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "italien" + "'", str30, "italien");
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder35);
    }

    @Test
    public void test15282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15282");
        java.util.Locale locale2 = new java.util.Locale("...X.Z.B.BB.BD.BE.BF.BG.BH.BI.BJ.BL.BM.BN...", "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
        org.junit.Assert.assertEquals(locale2.toString(), "...x.z.b.bb.bd.be.bf.bg.bh.bi.bj.bl.bm.bn..._AHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H");
    }

    @Test
    public void test15283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15283");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("####################################", "EN_CAEN_CA_EN_CAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "####################################" + "'", str2, "####################################");
    }

    @Test
    public void test15284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15284");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("ithi!li", "inglese");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test15285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15285");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = builder0.build();
        java.util.Locale locale3 = builder0.build();
        java.lang.String str5 = locale3.getExtension('a');
        java.util.Set<java.lang.Character> charSet6 = locale3.getExtensionKeys();
        java.lang.Object obj7 = locale3.clone();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(charSet6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "");
    }

    @Test
    public void test15286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15286");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid(".........nawiaT( eseengls.........nawiaT( esE", 19, (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test15287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15287");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("          ...          ...          ...          ...          ...          ...          ...          ...          ...          ...          ...          ...          ...          ...          ...          ...          ...          ...          ...          ...          ...          ...          ...", "it                                           it          AD.AE.AF.AGchnaafraAD.AE.AF.AGchnaaa", 24);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test15288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15288");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("enenenenenen");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "nenenenenene" + "'", str1, "nenenenenene");
    }

    @Test
    public void test15289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15289");
        java.util.Locale.Builder builder1 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.clearExtensions();
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale locale5 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str6 = locale5.getISO3Language();
        java.util.Locale.Builder builder7 = builder4.setLocale(locale5);
        java.util.Locale.Builder builder9 = builder7.setRegion("ja");
        java.util.Locale.Builder builder10 = builder9.clearExtensions();
        java.util.Locale locale11 = java.util.Locale.ITALIAN;
        java.util.Set<java.lang.String> strSet12 = locale11.getUnicodeLocaleAttributes();
        java.lang.String str13 = locale11.getISO3Country();
        java.util.Locale.Builder builder14 = builder9.setLocale(locale11);
        java.lang.String str15 = locale11.getCountry();
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.lowerCase("                       ANIHCxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", locale11);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "zho" + "'", str6, "zho");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "it");
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "                       anihcxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx" + "'", str16, "                       anihcxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
    }

    @Test
    public void test15290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15290");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("\u4e2d\u56fdAD.AE.AF", 24, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u4e2d\u56fdAD.AE.AF" + "'", str3, "\u4e2d\u56fdAD.AE.AF");
    }

    @Test
    public void test15291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15291");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap3);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream5 = languageRangeList1.stream();
        boolean boolean6 = languageRangeList1.isEmpty();
        java.util.Locale.LanguageRange[] languageRangeArray7 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList8 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList8, languageRangeArray7);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap10 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList11 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList8, strMap10);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor12 = languageRangeList11.listIterator();
        boolean boolean13 = languageRangeList1.retainAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList11);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap15 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList16 = java.util.Locale.LanguageRange.parse("Cina", strMap15);
        java.lang.String[] strArray20 = new java.lang.String[] { "aiaiaiaiaiaiaiaiaia", "zh-CN", "China" };
        java.util.ArrayList<java.lang.String> strList21 = new java.util.ArrayList<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList21, strArray20);
        java.util.Locale.FilteringMode filteringMode23 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList24 = java.util.Locale.filterTags(languageRangeList16, (java.util.Collection<java.lang.String>) strList21, filteringMode23);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap26 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList27 = java.util.Locale.LanguageRange.parse("Cina", strMap26);
        java.lang.String[] strArray31 = new java.lang.String[] { "aiaiaiaiaiaiaiaiaia", "zh-CN", "China" };
        java.util.ArrayList<java.lang.String> strList32 = new java.util.ArrayList<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList32, strArray31);
        java.util.Locale.FilteringMode filteringMode34 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList35 = java.util.Locale.filterTags(languageRangeList27, (java.util.Collection<java.lang.String>) strList32, filteringMode34);
        java.util.List<java.lang.String> strList36 = java.util.Locale.filterTags(languageRangeList11, (java.util.Collection<java.lang.String>) strList21, filteringMode34);
        java.util.List<java.lang.Class<?>> wildcardClassList37 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses(strList36);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(languageRangeStream5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(languageRangeArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(languageRangeList11);
        org.junit.Assert.assertNotNull(languageRangeItor12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(languageRangeList16);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + filteringMode23 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode23.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(languageRangeList27);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + filteringMode34 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode34.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList35);
        org.junit.Assert.assertNotNull(strList36);
        org.junit.Assert.assertNotNull(wildcardClassList37);
    }

    @Test
    public void test15292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15292");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("                       Hindi                        ", "taiwan");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                       Hindi                        " + "'", str2, "                       Hindi                        ");
    }

    @Test
    public void test15293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15293");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("ava . lang");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ava . lang" + "'", str1, "ava . lang");
    }

    @Test
    public void test15294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15294");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("United Kingdom");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test15295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15295");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("Cina", strMap1);
        java.util.Locale.LanguageRange languageRange4 = new java.util.Locale.LanguageRange("English");
        java.lang.String str6 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) languageRange4, "");
        java.lang.String str7 = languageRange4.getRange();
        boolean boolean8 = languageRangeList2.add(languageRange4);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList2, 'x');
        boolean boolean12 = languageRangeList2.contains((java.lang.Object) "Chine");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap13 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList14 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList2, strMap13);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream15 = languageRangeList14.stream();
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream16 = languageRangeList14.parallelStream();
        java.util.List<java.util.Locale.LanguageRange> languageRangeList18 = java.util.Locale.LanguageRange.parse("hi");
        java.lang.Object[] objArray19 = languageRangeList18.toArray();
        java.util.Spliterator<java.util.Locale.LanguageRange> languageRangeSpliterator20 = languageRangeList18.spliterator();
        java.util.Locale.LanguageRange languageRange22 = languageRangeList18.get((int) (byte) 0);
        boolean boolean23 = languageRangeList14.containsAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList18);
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Locale.LanguageRange" + "'", str6, "Locale.LanguageRange");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "english" + "'", str7, "english");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(languageRangeList14);
        org.junit.Assert.assertNotNull(languageRangeStream15);
        org.junit.Assert.assertNotNull(languageRangeStream16);
        org.junit.Assert.assertNotNull(languageRangeList18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(languageRangeSpliterator20);
        org.junit.Assert.assertNotNull(languageRange22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test15296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15296");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("hi");
        boolean boolean3 = languageRangeList1.remove((java.lang.Object) "English");
        boolean boolean5 = languageRangeList1.remove((java.lang.Object) 1);
        java.util.Locale.LanguageRange[] languageRangeArray6 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList7 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList7, languageRangeArray6);
        java.util.Locale locale10 = java.util.Locale.FRANCE;
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale10);
        java.util.Locale locale12 = java.util.Locale.US;
        java.util.Locale locale13 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale14 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale15 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale16 = java.util.Locale.getDefault();
        java.lang.String str17 = locale15.getDisplayCountry(locale16);
        java.lang.String str18 = locale15.toLanguageTag();
        java.util.Locale locale19 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale20 = java.util.Locale.getDefault();
        java.lang.String str21 = locale19.getDisplayCountry(locale20);
        java.util.Locale locale22 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale23 = java.util.Locale.getDefault();
        java.lang.String str24 = locale22.getDisplayCountry(locale23);
        java.util.Locale locale28 = new java.util.Locale("hi", "hi!", "cHINA");
        java.util.Locale locale29 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale30 = java.util.Locale.getDefault();
        java.lang.String str31 = locale29.getDisplayCountry(locale30);
        java.util.Locale locale33 = new java.util.Locale("");
        java.lang.String str34 = locale33.getDisplayVariant();
        java.util.Locale locale35 = java.util.Locale.KOREAN;
        java.util.Locale locale37 = new java.util.Locale("");
        java.util.Locale locale38 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale[] localeArray39 = new java.util.Locale[] { locale10, locale12, locale13, locale14, locale15, locale20, locale22, locale28, locale30, locale33, locale35, locale37, locale38 };
        java.util.ArrayList<java.util.Locale> localeList40 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList40, localeArray39);
        java.util.List<java.util.Locale> localeList42 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList7, (java.util.Collection<java.util.Locale>) localeList40);
        java.util.Locale locale43 = java.util.Locale.lookup(languageRangeList1, (java.util.Collection<java.util.Locale>) localeList40);
        java.lang.String[] strArray48 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("English", "hi", (int) (short) -1);
        java.lang.String[] strArray51 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("a", "");
        java.lang.String[] strArray52 = org.apache.commons.lang3.StringUtils.stripAll(strArray51);
        java.lang.String[] strArray53 = org.apache.commons.lang3.StringUtils.stripAll(strArray52);
        java.lang.String str54 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", strArray48, strArray52);
        int int55 = languageRangeList1.indexOf((java.lang.Object) strArray48);
        boolean boolean57 = languageRangeList1.equals((java.lang.Object) 100L);
        java.util.Locale.LanguageRange[] languageRangeArray58 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList59 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList59, languageRangeArray58);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap61 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList62 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList59, strMap61);
        int int63 = languageRangeList59.size();
        java.lang.Class[] classArray65 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray66 = (java.lang.Class<?>[]) classArray65;
        java.lang.Class<?>[] wildcardClassArray67 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray65);
        boolean boolean68 = languageRangeList59.equals((java.lang.Object) wildcardClassArray67);
        boolean boolean69 = languageRangeList59.isEmpty();
        boolean boolean70 = languageRangeList1.retainAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList59);
        boolean boolean71 = languageRangeList1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor73 = languageRangeList1.listIterator(43);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 43");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(languageRangeArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "english" + "'", str11, "english");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\u4e2d\u56fd" + "'", str17, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "zh-CN" + "'", str18, "zh-CN");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\u4e2d\u56fd" + "'", str21, "\u4e2d\u56fd");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\u4e2d\u56fd" + "'", str24, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals(locale28.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\u4e2d\u56fd" + "'", str31, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals(locale33.toString(), "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "ko");
        org.junit.Assert.assertEquals(locale37.toString(), "");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(localeList42);
        org.junit.Assert.assertNull(locale43);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h" + "'", str54, "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(languageRangeArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(languageRangeList62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertNotNull(classArray65);
        org.junit.Assert.assertNotNull(wildcardClassArray66);
        org.junit.Assert.assertNotNull(wildcardClassArray67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
    }

    @Test
    public void test15297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15297");
        char[] charArray5 = new char[] {};
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray5);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "zh-CN", charArray5);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "English", charArray5);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "engliIlish", charArray5);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "liI", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test15298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15298");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("ACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINA", "       hi!", 2);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test15299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15299");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("hi");
        java.lang.Object[] objArray2 = languageRangeList1.toArray();
        java.util.Spliterator<java.util.Locale.LanguageRange> languageRangeSpliterator3 = languageRangeList1.spliterator();
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                                                                                  US", "DE ");
        boolean boolean7 = languageRangeList1.remove((java.lang.Object) strArray6);
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(languageRangeSpliterator3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test15300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15300");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.util.Locale locale2 = new java.util.Locale("");
        java.lang.String str3 = locale2.getDisplayLanguage();
        java.util.Locale locale4 = java.util.Locale.CANADA;
        java.lang.String str5 = locale4.getDisplayLanguage();
        java.lang.String str6 = locale2.getDisplayScript(locale4);
        java.util.Locale locale8 = java.util.Locale.FRANCE;
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale8);
        java.lang.String str10 = locale2.getDisplayCountry(locale8);
        java.lang.String str11 = locale0.getDisplayScript(locale2);
        java.util.Locale locale12 = java.util.Locale.GERMAN;
        java.lang.String str13 = locale2.getDisplayLanguage(locale12);
        java.util.Locale locale16 = new java.util.Locale("");
        java.lang.String str17 = locale16.getDisplayLanguage();
        java.util.Locale locale18 = java.util.Locale.CANADA;
        java.lang.String str19 = locale18.getDisplayLanguage();
        java.lang.String str20 = locale16.getDisplayScript(locale18);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.lowerCase("a", locale16);
        java.lang.String str22 = locale16.getDisplayScript();
        java.lang.String str23 = locale12.getDisplayLanguage(locale16);
        java.util.Set<java.lang.String> strSet24 = locale12.getUnicodeLocaleAttributes();
        java.lang.String str25 = locale12.getCountry();
        java.util.Locale.Category category26 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale27 = java.util.Locale.ITALIAN;
        java.util.Locale locale29 = new java.util.Locale("");
        java.lang.String str30 = locale29.getDisplayLanguage();
        java.util.Locale locale31 = java.util.Locale.CANADA;
        java.lang.String str32 = locale31.getDisplayLanguage();
        java.lang.String str33 = locale29.getDisplayScript(locale31);
        java.util.Locale locale35 = java.util.Locale.FRANCE;
        java.lang.String str36 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale35);
        java.lang.String str37 = locale29.getDisplayCountry(locale35);
        java.lang.String str38 = locale27.getDisplayScript(locale29);
        java.util.Locale locale39 = java.util.Locale.GERMAN;
        java.lang.String str40 = locale29.getDisplayLanguage(locale39);
        java.util.Locale locale43 = new java.util.Locale("");
        java.lang.String str44 = locale43.getDisplayLanguage();
        java.util.Locale locale45 = java.util.Locale.CANADA;
        java.lang.String str46 = locale45.getDisplayLanguage();
        java.lang.String str47 = locale43.getDisplayScript(locale45);
        java.lang.String str48 = org.apache.commons.lang3.StringUtils.lowerCase("a", locale43);
        java.lang.String str49 = locale43.getDisplayScript();
        java.lang.String str50 = locale39.getDisplayLanguage(locale43);
        java.util.Set<java.lang.String> strSet51 = locale39.getUnicodeLocaleAttributes();
        java.util.Locale.setDefault(category26, locale39);
        java.lang.String str53 = locale39.getLanguage();
        java.lang.String str54 = locale12.getDisplayVariant(locale39);
        java.util.Locale locale58 = new java.util.Locale("hi", "hi!", "cHINA");
        java.lang.String str59 = locale58.getDisplayVariant();
        java.util.Set<java.lang.String> strSet60 = locale58.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.String> strSet61 = locale58.getUnicodeLocaleKeys();
        java.lang.String str62 = locale39.getDisplayCountry(locale58);
        java.util.Locale locale63 = java.util.Locale.FRENCH;
        java.util.Locale locale64 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale65 = java.util.Locale.getDefault();
        java.lang.String str66 = locale64.getDisplayCountry(locale65);
        java.lang.String str67 = locale64.toLanguageTag();
        java.lang.String str68 = locale64.getLanguage();
        java.util.Locale locale69 = java.util.Locale.ITALIAN;
        java.util.Locale locale71 = new java.util.Locale("");
        java.lang.String str72 = locale71.getDisplayLanguage();
        java.util.Locale locale73 = java.util.Locale.CANADA;
        java.lang.String str74 = locale73.getDisplayLanguage();
        java.lang.String str75 = locale71.getDisplayScript(locale73);
        java.util.Locale locale77 = java.util.Locale.FRANCE;
        java.lang.String str78 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale77);
        java.lang.String str79 = locale71.getDisplayCountry(locale77);
        java.lang.String str80 = locale69.getDisplayScript(locale71);
        java.util.Locale locale81 = java.util.Locale.GERMAN;
        java.lang.String str82 = locale71.getDisplayLanguage(locale81);
        java.lang.String str83 = locale64.getDisplayCountry(locale71);
        java.util.Locale locale84 = locale64.stripExtensions();
        java.lang.String str85 = locale63.getDisplayName(locale64);
        java.lang.String str86 = locale58.getDisplayScript(locale64);
        java.lang.String str87 = locale64.getDisplayVariant();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u82f1\u6587" + "'", str5, "\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "english" + "'", str9, "english");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "de");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals(locale16.toString(), "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\u82f1\u6587" + "'", str19, "\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "a" + "'", str21, "a");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "German" + "'", str23, "German");
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + category26 + "' != '" + java.util.Locale.Category.FORMAT + "'", category26.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "it");
        org.junit.Assert.assertEquals(locale29.toString(), "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\u82f1\u6587" + "'", str32, "\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "english" + "'", str36, "english");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "de");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals(locale43.toString(), "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "\u82f1\u6587" + "'", str46, "\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "a" + "'", str48, "a");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "German" + "'", str50, "German");
        org.junit.Assert.assertNotNull(strSet51);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "de" + "'", str53, "de");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals(locale58.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "cHINA" + "'", str59, "cHINA");
        org.junit.Assert.assertNotNull(strSet60);
        org.junit.Assert.assertNotNull(strSet61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "fr");
        org.junit.Assert.assertNotNull(locale64);
        org.junit.Assert.assertEquals(locale64.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale65);
        org.junit.Assert.assertEquals(locale65.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "\u4e2d\u56fd" + "'", str66, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "zh-CN" + "'", str67, "zh-CN");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "zh" + "'", str68, "zh");
        org.junit.Assert.assertNotNull(locale69);
        org.junit.Assert.assertEquals(locale69.toString(), "it");
        org.junit.Assert.assertEquals(locale71.toString(), "");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertNotNull(locale73);
        org.junit.Assert.assertEquals(locale73.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "\u82f1\u6587" + "'", str74, "\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertNotNull(locale77);
        org.junit.Assert.assertEquals(locale77.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "english" + "'", str78, "english");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertNotNull(locale81);
        org.junit.Assert.assertEquals(locale81.toString(), "de");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "China" + "'", str83, "China");
        org.junit.Assert.assertNotNull(locale84);
        org.junit.Assert.assertEquals(locale84.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "\u6cd5\u6587" + "'", str85, "\u6cd5\u6587");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "" + "'", str86, "");
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "" + "'", str87, "");
    }

    @Test
    public void test15301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15301");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("chinois(chine)", "$$$$$$$$$$$$$$$$$a$$$$$$$$$$$$$$$$$");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test15302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15302");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("I!HchinaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaI!HchinaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaI!H", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           Taiwan", "...gggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....eng...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "I!HchinaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaI!HchinaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaI!H" + "'", str3, "I!HchinaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaI!HchinaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaI!H");
    }

    @Test
    public void test15303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15303");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("                                           ITALIAHi", "CollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollectiCollecti");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test15304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15304");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "GNAL.AVAJSTRING[]STRING[]STRING[]", false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: [LGNAL/AVAJSTRING[]STRING[]STRING;");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test15305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15305");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("                                    ", "CI_A");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                    " + "'", str2, "                                    ");
    }

    @Test
    public void test15306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15306");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("collecti", "iiiiiiiiiiiiiiiiiiiiiiiArrayList", 16);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test15307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15307");
        java.util.Locale locale0 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale1 = java.util.Locale.getDefault();
        java.lang.String str2 = locale0.getDisplayCountry(locale1);
        java.lang.String str3 = locale0.toLanguageTag();
        java.lang.String str4 = locale0.getCountry();
        java.lang.String str5 = locale0.getISO3Country();
        java.util.Locale locale7 = new java.util.Locale("");
        java.lang.String str8 = locale7.getDisplayVariant();
        java.lang.String str9 = locale0.getDisplayLanguage(locale7);
        java.util.Locale locale10 = locale7.stripExtensions();
        java.lang.String str11 = locale7.getCountry();
        java.util.Set<java.lang.Character> charSet12 = locale7.getExtensionKeys();
        boolean boolean13 = locale7.hasExtensions();
        java.lang.Class<?> wildcardClass14 = locale7.getClass();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u4e2d\u56fd" + "'", str2, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zh-CN" + "'", str3, "zh-CN");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CN" + "'", str4, "CN");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CHN" + "'", str5, "CHN");
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Chinese" + "'", str9, "Chinese");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(charSet12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test15308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15308");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("#########################       HI!", 747, 21);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...########       HI!" + "'", str3, "...########       HI!");
    }

    @Test
    public void test15309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15309");
        java.util.Locale locale1 = java.util.Locale.CHINA;
        java.util.Set<java.lang.Character> charSet2 = locale1.getExtensionKeys();
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.upperCase("", locale1);
        java.lang.String str4 = locale1.getDisplayCountry();
        java.lang.String str5 = locale1.toString();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(charSet2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u4e2d\u56fd" + "'", str4, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "zh_CN" + "'", str5, "zh_CN");
    }

    @Test
    public void test15310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15310");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("ListfraHAr");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "LISTFRAHAR" + "'", str1, "LISTFRAHAR");
    }

    @Test
    public void test15311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15311");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("frfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfr", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaCinaxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test15312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15312");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("zu", 4, "CHINCHINCHINCHINCHICHINCHINCHINCHINC");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CzuC" + "'", str3, "CzuC");
    }

    @Test
    public void test15313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15313");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "                       Hindi                        ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test15314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15314");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("English", "hi", (int) (short) -1);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, "zho", (int) 'u', (int) (short) 0);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny("CHINOIS (CHINE)", strArray5);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray5);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny("hindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindi", strArray5);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, "SEXXXXXXXXXXXXXX", 252, 33);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test15315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15315");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("English");
        java.lang.String str3 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) languageRange1, "");
        java.util.Locale.LanguageRange languageRange5 = new java.util.Locale.LanguageRange("a");
        java.util.Locale.LanguageRange languageRange7 = new java.util.Locale.LanguageRange("a");
        java.util.Locale.LanguageRange[] languageRangeArray8 = new java.util.Locale.LanguageRange[] { languageRange1, languageRange5, languageRange7 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList9 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList9, languageRangeArray8);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor11 = languageRangeList9.listIterator();
        java.lang.String str13 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) languageRangeItor11, "italiahI");
        java.util.Locale.LanguageRange languageRange14 = languageRangeItor11.next();
        languageRangeItor11.remove();
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join((java.util.Iterator<java.util.Locale.LanguageRange>) languageRangeItor11, "hi!              ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Locale.LanguageRange" + "'", str3, "Locale.LanguageRange");
        org.junit.Assert.assertNotNull(languageRangeArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(languageRangeItor11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.util" + "'", str13, "java.util");
        org.junit.Assert.assertNotNull(languageRange14);
    }

    @Test
    public void test15316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15316");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("hi");
        java.lang.Object[] objArray2 = languageRangeList1.toArray();
        java.util.Spliterator<java.util.Locale.LanguageRange> languageRangeSpliterator3 = languageRangeList1.spliterator();
        java.util.Locale.Builder builder4 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        java.util.Locale.Builder builder7 = builder5.setLanguageTag("zh-CN");
        java.util.Locale locale8 = builder5.build();
        boolean boolean9 = languageRangeList1.remove((java.lang.Object) locale8);
        java.util.Iterator<java.util.Locale.LanguageRange> languageRangeItor10 = languageRangeList1.iterator();
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap12 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList13 = java.util.Locale.LanguageRange.parse("it", strMap12);
        boolean boolean14 = languageRangeList1.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList13);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor15 = languageRangeList13.listIterator();
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream16 = languageRangeList13.parallelStream();
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(languageRangeSpliterator3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh_CN");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(languageRangeItor10);
        org.junit.Assert.assertNotNull(languageRangeList13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(languageRangeItor15);
        org.junit.Assert.assertNotNull(languageRangeStream16);
    }

    @Test
    public void test15317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15317");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("hi");
        boolean boolean3 = languageRangeList1.remove((java.lang.Object) "English");
        boolean boolean5 = languageRangeList1.remove((java.lang.Object) 1);
        java.util.Locale.LanguageRange[] languageRangeArray6 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList7 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList7, languageRangeArray6);
        java.util.Locale locale10 = java.util.Locale.FRANCE;
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale10);
        java.util.Locale locale12 = java.util.Locale.US;
        java.util.Locale locale13 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale14 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale15 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale16 = java.util.Locale.getDefault();
        java.lang.String str17 = locale15.getDisplayCountry(locale16);
        java.lang.String str18 = locale15.toLanguageTag();
        java.util.Locale locale19 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale20 = java.util.Locale.getDefault();
        java.lang.String str21 = locale19.getDisplayCountry(locale20);
        java.util.Locale locale22 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale23 = java.util.Locale.getDefault();
        java.lang.String str24 = locale22.getDisplayCountry(locale23);
        java.util.Locale locale28 = new java.util.Locale("hi", "hi!", "cHINA");
        java.util.Locale locale29 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale30 = java.util.Locale.getDefault();
        java.lang.String str31 = locale29.getDisplayCountry(locale30);
        java.util.Locale locale33 = new java.util.Locale("");
        java.lang.String str34 = locale33.getDisplayVariant();
        java.util.Locale locale35 = java.util.Locale.KOREAN;
        java.util.Locale locale37 = new java.util.Locale("");
        java.util.Locale locale38 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale[] localeArray39 = new java.util.Locale[] { locale10, locale12, locale13, locale14, locale15, locale20, locale22, locale28, locale30, locale33, locale35, locale37, locale38 };
        java.util.ArrayList<java.util.Locale> localeList40 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList40, localeArray39);
        java.util.List<java.util.Locale> localeList42 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList7, (java.util.Collection<java.util.Locale>) localeList40);
        java.util.Locale locale43 = java.util.Locale.lookup(languageRangeList1, (java.util.Collection<java.util.Locale>) localeList40);
        java.lang.String[] strArray48 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("English", "hi", (int) (short) -1);
        java.lang.String[] strArray51 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("a", "");
        java.lang.String[] strArray52 = org.apache.commons.lang3.StringUtils.stripAll(strArray51);
        java.lang.String[] strArray53 = org.apache.commons.lang3.StringUtils.stripAll(strArray52);
        java.lang.String str54 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", strArray48, strArray52);
        int int55 = languageRangeList1.indexOf((java.lang.Object) strArray48);
        boolean boolean57 = languageRangeList1.equals((java.lang.Object) 100L);
        java.util.Locale locale58 = java.util.Locale.ITALIAN;
        java.util.Locale locale60 = new java.util.Locale("");
        java.lang.String str61 = locale60.getDisplayLanguage();
        java.util.Locale locale62 = java.util.Locale.CANADA;
        java.lang.String str63 = locale62.getDisplayLanguage();
        java.lang.String str64 = locale60.getDisplayScript(locale62);
        java.util.Locale locale66 = java.util.Locale.FRANCE;
        java.lang.String str67 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale66);
        java.lang.String str68 = locale60.getDisplayCountry(locale66);
        java.lang.String str69 = locale58.getDisplayScript(locale60);
        java.lang.String str70 = locale60.getDisplayCountry();
        java.lang.String str71 = locale60.getDisplayLanguage();
        java.util.Locale locale72 = java.util.Locale.PRC;
        java.lang.String str73 = locale60.getDisplayScript(locale72);
        boolean boolean74 = languageRangeList1.equals((java.lang.Object) locale72);
        java.util.Iterator<java.util.Locale.LanguageRange> languageRangeItor75 = languageRangeList1.iterator();
        java.util.Iterator<java.util.Locale.LanguageRange> languageRangeItor76 = languageRangeList1.iterator();
        java.util.Locale.LanguageRange languageRange77 = languageRangeItor76.next();
        double double78 = languageRange77.getWeight();
        java.lang.Object obj79 = null;
        boolean boolean80 = languageRange77.equals(obj79);
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(languageRangeArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "english" + "'", str11, "english");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\u4e2d\u56fd" + "'", str17, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "zh-CN" + "'", str18, "zh-CN");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\u4e2d\u56fd" + "'", str21, "\u4e2d\u56fd");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\u4e2d\u56fd" + "'", str24, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals(locale28.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\u4e2d\u56fd" + "'", str31, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals(locale33.toString(), "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "ko");
        org.junit.Assert.assertEquals(locale37.toString(), "");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(localeList42);
        org.junit.Assert.assertNull(locale43);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h" + "'", str54, "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "it");
        org.junit.Assert.assertEquals(locale60.toString(), "");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertNotNull(locale62);
        org.junit.Assert.assertEquals(locale62.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "\u82f1\u6587" + "'", str63, "\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertNotNull(locale66);
        org.junit.Assert.assertEquals(locale66.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "english" + "'", str67, "english");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertNotNull(locale72);
        org.junit.Assert.assertEquals(locale72.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(languageRangeItor75);
        org.junit.Assert.assertNotNull(languageRangeItor76);
        org.junit.Assert.assertNotNull(languageRange77);
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 1.0d + "'", double78 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
    }

    @Test
    public void test15318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15318");
        char[] charArray9 = new char[] {};
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "zh-CN", charArray9);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "a", charArray9);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "  China   ", charArray9);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                 a                  ", charArray9);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "ArrayList###########", charArray9);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "lang                                                      ", charArray9);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                                            en_CA", charArray9);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!HI!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test15319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15319");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "NCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCARRAYLISTRING[]NCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCARRAYLISTRING[]NCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCARRAYLISTRING[]NCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCARRAYLISTRING[]NCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCARRAYLISTRING[]NCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCARRAYLIS");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test15320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15320");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("                  ArrayList.ListItr");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ArrayList.ListItr" + "'", str1, "ArrayList.ListItr");
    }

    @Test
    public void test15321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15321");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Cina", "AN       a", 1);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi", "A", (int) (short) -1);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.stripAll(strArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.endsWithAny("AI", strArray11);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("", strArray5, strArray11);
        java.lang.String[] strArray16 = org.apache.commons.lang3.StringUtils.splitByCharacterType("");
        int int17 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("acol", strArray16);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.replaceEach("GNE", strArray11, strArray16);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray16, '#', (int) (byte) 10, 0);
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray16);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "GNE" + "'", str18, "GNE");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test15322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15322");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("ARRAYLIS", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAANIHc                                              ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ARRAYLIS" + "'", str2, "ARRAYLIS");
    }

    @Test
    public void test15323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15323");
        java.util.Locale locale3 = new java.util.Locale("zho", "US");
        java.util.Locale locale4 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str5 = locale3.getDisplayVariant(locale4);
        java.lang.String str6 = locale4.getDisplayScript();
        java.lang.String str7 = locale4.toLanguageTag();
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.upperCase("zH", locale4);
        org.junit.Assert.assertEquals(locale3.toString(), "zho_US");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "fr-CA" + "'", str7, "fr-CA");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ZH" + "'", str8, "ZH");
    }

    @Test
    public void test15324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15324");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale.Builder builder3 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder4 = builder1.clearExtensions();
        java.util.Locale.Builder builder6 = builder1.setVariant("");
        java.util.Locale locale7 = builder6.build();
        java.util.Locale.Builder builder8 = builder6.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder8.setScript("nglish  Hindi (HI!,cHINA");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: nglish  Hindi (HI!,cHINA [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test15325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15325");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.setLanguageTag("zh-CN");
        java.util.Locale.Builder builder5 = builder3.setLanguage("it");
        java.util.Locale.Builder builder6 = builder5.clear();
        java.util.Locale locale8 = new java.util.Locale("");
        java.lang.String str9 = locale8.getDisplayLanguage();
        java.util.Locale locale10 = java.util.Locale.CANADA;
        java.lang.String str11 = locale10.getDisplayLanguage();
        java.lang.String str12 = locale8.getDisplayScript(locale10);
        java.lang.String str13 = locale10.getDisplayVariant();
        java.util.Locale locale14 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale15 = java.util.Locale.getDefault();
        java.lang.String str16 = locale14.getDisplayCountry(locale15);
        java.lang.String str17 = locale15.getDisplayVariant();
        java.lang.String str18 = locale10.getDisplayScript(locale15);
        java.util.Locale.Builder builder19 = builder5.setLocale(locale15);
        java.util.Locale.Builder builder20 = builder19.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder22 = builder20.setVariant("chinchinchinchinchinchinchinchinchinaaaaaaaaa#");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: chinchinchinchinchinchinchinchinchinaaaaaaaaa# [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\u82f1\u6587" + "'", str11, "\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\u4e2d\u56fd" + "'", str16, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder20);
    }

    @Test
    public void test15326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15326");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("hi");
        java.lang.Object[] objArray2 = languageRangeList1.toArray();
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream3 = languageRangeList1.parallelStream();
        languageRangeList1.clear();
        java.util.Spliterator<java.util.Locale.LanguageRange> languageRangeSpliterator5 = languageRangeList1.spliterator();
        java.util.Locale.LanguageRange[] languageRangeArray6 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList7 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList7, languageRangeArray6);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap9 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList10 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList7, strMap9);
        int int11 = languageRangeList7.size();
        java.util.Locale.LanguageRange languageRange13 = new java.util.Locale.LanguageRange("English");
        java.util.Locale.LanguageRange languageRange15 = new java.util.Locale.LanguageRange("English");
        java.util.Locale.LanguageRange languageRange17 = new java.util.Locale.LanguageRange("a");
        java.util.Locale.LanguageRange[] languageRangeArray18 = new java.util.Locale.LanguageRange[] { languageRange13, languageRange15, languageRange17 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList19 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList19, languageRangeArray18);
        boolean boolean21 = languageRangeList7.retainAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList19);
        java.util.Locale.LanguageRange[] languageRangeArray22 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList23 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList23, languageRangeArray22);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap25 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList26 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList23, strMap25);
        java.util.Spliterator<java.util.Locale.LanguageRange> languageRangeSpliterator27 = languageRangeList23.spliterator();
        java.util.Locale.LanguageRange[] languageRangeArray28 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList29 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList29, languageRangeArray28);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap31 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList32 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList29, strMap31);
        int int33 = languageRangeList29.size();
        java.util.List<java.util.Locale.LanguageRange> languageRangeList35 = java.util.Locale.LanguageRange.parse("hi");
        boolean boolean37 = languageRangeList35.remove((java.lang.Object) "English");
        boolean boolean38 = languageRangeList29.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList35);
        java.util.Locale.LanguageRange[] languageRangeArray39 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList40 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList40, languageRangeArray39);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap42 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList43 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList40, strMap42);
        java.lang.String[] strArray51 = new java.lang.String[] { "English", "hi", "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "", "a", "", "China" };
        java.util.ArrayList<java.lang.String> strList52 = new java.util.ArrayList<java.lang.String>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList52, strArray51);
        java.util.List<java.lang.Class<?>> wildcardClassList54 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList52);
        java.lang.String str55 = java.util.Locale.lookupTag(languageRangeList43, (java.util.Collection<java.lang.String>) strList52);
        java.util.List<java.lang.Class<?>> wildcardClassList56 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList52);
        java.util.List<java.lang.String> strList57 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList29, (java.util.Collection<java.lang.String>) strList52);
        java.util.Locale.LanguageRange[] languageRangeArray58 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList59 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList59, languageRangeArray58);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap61 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList62 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList59, strMap61);
        int int63 = languageRangeList59.size();
        java.util.List<java.util.Locale.LanguageRange> languageRangeList65 = java.util.Locale.LanguageRange.parse("hi");
        boolean boolean67 = languageRangeList65.remove((java.lang.Object) "English");
        boolean boolean68 = languageRangeList59.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList65);
        java.lang.String[] strArray73 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("English", "hi", (int) (short) -1);
        java.lang.String[] strArray76 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("a", "");
        java.lang.String[] strArray77 = org.apache.commons.lang3.StringUtils.stripAll(strArray76);
        java.lang.String[] strArray78 = org.apache.commons.lang3.StringUtils.stripAll(strArray77);
        java.lang.String str79 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", strArray73, strArray77);
        boolean boolean80 = languageRangeList59.equals((java.lang.Object) strArray77);
        boolean boolean81 = languageRangeList29.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList59);
        boolean boolean82 = languageRangeList23.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList29);
        boolean boolean83 = languageRangeList7.containsAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList29);
        boolean boolean84 = languageRangeList1.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList7);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap85 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList86 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList7, strMap85);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange88 = languageRangeList7.remove(107);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 107, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(languageRangeStream3);
        org.junit.Assert.assertNotNull(languageRangeSpliterator5);
        org.junit.Assert.assertNotNull(languageRangeArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(languageRangeList10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(languageRangeArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(languageRangeArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(languageRangeList26);
        org.junit.Assert.assertNotNull(languageRangeSpliterator27);
        org.junit.Assert.assertNotNull(languageRangeArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(languageRangeList32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(languageRangeList35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(languageRangeArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(languageRangeList43);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(wildcardClassList54);
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertNotNull(wildcardClassList56);
        org.junit.Assert.assertNotNull(strList57);
        org.junit.Assert.assertNotNull(languageRangeArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(languageRangeList62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertNotNull(languageRangeList65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertNotNull(strArray76);
        org.junit.Assert.assertNotNull(strArray77);
        org.junit.Assert.assertNotNull(strArray78);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h" + "'", str79, "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(languageRangeList86);
    }

    @Test
    public void test15327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15327");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("nglish", 18, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nglishaaaaaaaaaaaa" + "'", str3, "nglishaaaaaaaaaaaa");
    }

    @Test
    public void test15328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15328");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("I!H", "EnglHI!STRING[]STRING[]SsHI!STRING[]STRING[]S");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test15329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15329");
        java.util.Locale locale2 = new java.util.Locale("][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts", "Ja");
        java.lang.String str3 = locale2.toString();
        org.junit.Assert.assertEquals(locale2.toString(), "][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts_JA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts_JA" + "'", str3, "][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts_JA");
    }

    @Test
    public void test15330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15330");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale.Builder builder3 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder5 = builder1.setRegion("zh");
        java.util.Locale.Builder builder6 = builder1.clear();
        java.util.Locale locale7 = builder1.build();
        java.util.Locale locale8 = builder1.build();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
    }

    @Test
    public void test15331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15331");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("hi-china", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa              !ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test15332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15332");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("ions.EmptySet", "xxxxxxxxxxFrlich(Fraicl)xxxxxxxxxx");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test15333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15333");
        java.util.Locale locale1 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str2 = locale1.getDisplayLanguage();
        java.util.Locale locale3 = java.util.Locale.getDefault();
        java.lang.String str4 = locale1.getDisplayCountry(locale3);
        java.util.Locale.LanguageRange[] languageRangeArray5 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList6 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList6, languageRangeArray5);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap8 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList9 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList6, strMap8);
        java.lang.String[] strArray17 = new java.lang.String[] { "English", "hi", "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "", "a", "", "China" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        java.util.List<java.lang.Class<?>> wildcardClassList20 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList18);
        java.lang.String str21 = java.util.Locale.lookupTag(languageRangeList9, (java.util.Collection<java.lang.String>) strList18);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList23 = java.util.Locale.LanguageRange.parse("hi");
        boolean boolean25 = languageRangeList23.remove((java.lang.Object) "English");
        java.util.Locale.LanguageRange[] languageRangeArray26 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList27 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList27, languageRangeArray26);
        java.util.Locale locale30 = java.util.Locale.FRANCE;
        java.lang.String str31 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale30);
        java.util.Locale locale32 = java.util.Locale.US;
        java.util.Locale locale33 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale34 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale35 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale36 = java.util.Locale.getDefault();
        java.lang.String str37 = locale35.getDisplayCountry(locale36);
        java.lang.String str38 = locale35.toLanguageTag();
        java.util.Locale locale39 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale40 = java.util.Locale.getDefault();
        java.lang.String str41 = locale39.getDisplayCountry(locale40);
        java.util.Locale locale42 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale43 = java.util.Locale.getDefault();
        java.lang.String str44 = locale42.getDisplayCountry(locale43);
        java.util.Locale locale48 = new java.util.Locale("hi", "hi!", "cHINA");
        java.util.Locale locale49 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale50 = java.util.Locale.getDefault();
        java.lang.String str51 = locale49.getDisplayCountry(locale50);
        java.util.Locale locale53 = new java.util.Locale("");
        java.lang.String str54 = locale53.getDisplayVariant();
        java.util.Locale locale55 = java.util.Locale.KOREAN;
        java.util.Locale locale57 = new java.util.Locale("");
        java.util.Locale locale58 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale[] localeArray59 = new java.util.Locale[] { locale30, locale32, locale33, locale34, locale35, locale40, locale42, locale48, locale50, locale53, locale55, locale57, locale58 };
        java.util.ArrayList<java.util.Locale> localeList60 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList60, localeArray59);
        java.util.List<java.util.Locale> localeList62 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList27, (java.util.Collection<java.util.Locale>) localeList60);
        java.util.List<java.util.Locale> localeList63 = java.util.Locale.filter(languageRangeList23, (java.util.Collection<java.util.Locale>) localeList60);
        java.util.List<java.util.Locale> localeList64 = java.util.Locale.filter(languageRangeList9, (java.util.Collection<java.util.Locale>) localeList63);
        java.util.Locale.LanguageRange[] languageRangeArray65 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList66 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList66, languageRangeArray65);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap68 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList69 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList66, strMap68);
        java.util.Spliterator<java.util.Locale.LanguageRange> languageRangeSpliterator70 = languageRangeList66.spliterator();
        languageRangeList66.clear();
        boolean boolean72 = languageRangeList9.retainAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList66);
        java.util.Locale locale76 = new java.util.Locale("hi", "hi!", "cHINA");
        java.lang.String str77 = locale76.getDisplayVariant();
        java.util.Locale locale78 = locale76.stripExtensions();
        int int79 = languageRangeList9.lastIndexOf((java.lang.Object) locale76);
        java.lang.String str80 = locale1.getDisplayCountry(locale76);
        java.lang.String str81 = org.apache.commons.lang3.StringUtils.lowerCase("STRING", locale76);
        java.lang.String str82 = locale76.getDisplayCountry();
        java.util.Locale locale85 = new java.util.Locale("zh-CNnglese", "Chin");
        java.lang.String str86 = locale85.getVariant();
        java.lang.String str87 = locale76.getDisplayName(locale85);
        java.util.Set<java.lang.String> strSet88 = locale85.getUnicodeLocaleKeys();
        java.util.Set<java.lang.Character> charSet89 = locale85.getExtensionKeys();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u4e2d\u6587" + "'", str2, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u53f0\u6e7e\u5730\u533a" + "'", str4, "\u53f0\u6e7e\u5730\u533a");
        org.junit.Assert.assertNotNull(languageRangeArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(languageRangeList9);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClassList20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(languageRangeList23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(languageRangeArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "english" + "'", str31, "english");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "\u4e2d\u56fd" + "'", str37, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "zh-CN" + "'", str38, "zh-CN");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "\u4e2d\u56fd" + "'", str41, "\u4e2d\u56fd");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "\u4e2d\u56fd" + "'", str44, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals(locale48.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "\u4e2d\u56fd" + "'", str51, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals(locale53.toString(), "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "ko");
        org.junit.Assert.assertEquals(locale57.toString(), "");
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(localeList62);
        org.junit.Assert.assertNotNull(localeList63);
        org.junit.Assert.assertNotNull(localeList64);
        org.junit.Assert.assertNotNull(languageRangeArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(languageRangeList69);
        org.junit.Assert.assertNotNull(languageRangeSpliterator70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertEquals(locale76.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "cHINA" + "'", str77, "cHINA");
        org.junit.Assert.assertNotNull(locale78);
        org.junit.Assert.assertEquals(locale78.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + (-1) + "'", int79 == (-1));
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "Taiwan" + "'", str80, "Taiwan");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "string" + "'", str81, "string");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "HI!" + "'", str82, "HI!");
        org.junit.Assert.assertEquals(locale85.toString(), "zh-cnnglese_CHIN");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "" + "'", str86, "");
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "Hindi (HI!,cHINA)" + "'", str87, "Hindi (HI!,cHINA)");
        org.junit.Assert.assertNotNull(strSet88);
        org.junit.Assert.assertNotNull(charSet89);
    }

    @Test
    public void test15334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15334");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("  cn    ", "nenglis");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test15335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15335");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("ArrayList.ListItr", 83);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ArrayList.ListItr" + "'", str2, "ArrayList.ListItr");
    }

    @Test
    public void test15336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15336");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("undundundundundundundundundundundundundundundundundundundundundundundundundundundundundundundundundundundundundundundundundundundundundundundundundundundund", (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=10.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test15337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15337");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale locale4 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str5 = locale4.getISO3Language();
        java.util.Locale.Builder builder6 = builder3.setLocale(locale4);
        java.util.Locale.Builder builder7 = builder3.clear();
        java.util.Locale.Builder builder8 = builder3.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder8.setUnicodeLocaleKeyword("\u672c\u65e5", "chi..T");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: ?? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "zho" + "'", str5, "zho");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test15338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15338");
        java.util.Locale locale2 = java.util.Locale.forLanguageTag("englCNsCN");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.upperCase("  en_   ", locale2);
        java.util.Locale locale6 = new java.util.Locale("CHINOIS (CHINE)444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
        java.lang.String str7 = locale2.getDisplayCountry(locale6);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  EN_   " + "'", str3, "  EN_   ");
        org.junit.Assert.assertEquals(locale6.toString(), "chinois (chine)444444444444444444444444444444444444444444444444444444444444444444444444444444444444_AHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test15339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15339");
        java.util.Locale locale3 = new java.util.Locale("$");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.upperCase("EnglTWNsTWN", locale3);
        java.util.Set<java.lang.String> strSet5 = locale3.getUnicodeLocaleAttributes();
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.lowerCase("ITALIEN", locale3);
        boolean boolean7 = locale3.hasExtensions();
        java.lang.String str8 = locale3.toLanguageTag();
        java.util.Locale.Builder builder9 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder10 = builder9.clearExtensions();
        java.util.Locale.Builder builder11 = builder9.clearExtensions();
        java.util.Locale.Builder builder12 = builder11.clearExtensions();
        java.util.Locale locale13 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale14 = java.util.Locale.getDefault();
        java.lang.String str15 = locale13.getDisplayCountry(locale14);
        java.lang.String str16 = locale13.toLanguageTag();
        java.lang.String str17 = locale13.getCountry();
        java.lang.String str18 = locale13.getISO3Country();
        java.util.Locale.Builder builder19 = builder12.setLocale(locale13);
        java.util.Locale locale20 = builder19.build();
        java.lang.String str21 = locale3.getDisplayLanguage(locale20);
        org.junit.Assert.assertEquals(locale3.toString(), "$");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ENGLTWNSTWN" + "'", str4, "ENGLTWNSTWN");
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "italien" + "'", str6, "italien");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "und" + "'", str8, "und");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\u4e2d\u56fd" + "'", str15, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "zh-CN" + "'", str16, "zh-CN");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "CN" + "'", str17, "CN");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "CHN" + "'", str18, "CHN");
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "$" + "'", str21, "$");
    }

    @Test
    public void test15340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15340");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("ngls", "\u4e2d\u6587\u53f0\u7063)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test15341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15341");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("  cn    ", "                                                                  xxxxxxxxxxFrench(France)xxxxxxxxxx");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test15342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15342");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("#...", "xxxxxxxxxxxxxxxxxxxxxxxxxChinese");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test15343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15343");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("Engls");
        java.lang.String str2 = languageRange1.getRange();
        double double3 = languageRange1.getWeight();
        java.util.Locale locale6 = new java.util.Locale("it", "cinese");
        java.lang.String str7 = locale6.getScript();
        java.lang.String str8 = locale6.getDisplayCountry();
        boolean boolean9 = languageRange1.equals((java.lang.Object) locale6);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "engls" + "'", str2, "engls");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertEquals(locale6.toString(), "it_CINESE");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CINESE" + "'", str8, "CINESE");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test15344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15344");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5...", "hsilgnE#########################");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test15345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15345");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale.Builder builder2 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale.Builder builder5 = builder3.setLanguageTag("zh-CN");
        java.util.Locale.Builder builder7 = builder5.setLanguage("it");
        java.util.Locale locale8 = builder7.build();
        java.util.Locale locale10 = java.util.Locale.TAIWAN;
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.upperCase("", locale10);
        java.lang.String str12 = locale10.getDisplayScript();
        java.lang.String str13 = locale8.getDisplayLanguage(locale10);
        boolean boolean14 = locale10.hasExtensions();
        java.util.Locale.setDefault(category0, locale10);
        java.lang.String str16 = locale10.getDisplayScript();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "it_CN");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\u7fa9\u5927\u5229\u6587" + "'", str13, "\u7fa9\u5927\u5229\u6587");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test15346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15346");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("it", strMap1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList2, '#');
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor6 = languageRangeList2.listIterator(1);
        java.util.Locale locale7 = java.util.Locale.CANADA;
        java.util.Set<java.lang.String> strSet8 = locale7.getUnicodeLocaleAttributes();
        java.util.Locale locale10 = java.util.Locale.FRANCE;
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale10);
        java.lang.String str12 = locale7.getDisplayCountry(locale10);
        java.util.Set<java.lang.String> strSet13 = locale10.getUnicodeLocaleKeys();
        java.lang.String str14 = java.util.Locale.lookupTag(languageRangeList2, (java.util.Collection<java.lang.String>) strSet13);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor15 = languageRangeList2.listIterator();
        java.util.Collection<java.util.Locale.LanguageRange> languageRangeCollection16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = languageRangeList2.retainAll(languageRangeCollection16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeItor6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_CA");
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "english" + "'", str11, "english");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Canada" + "'", str12, "Canada");
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(languageRangeItor15);
    }

    @Test
    public void test15347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15347");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("aaaaaaaaa$", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "$" + "'", str2, "$");
    }

    @Test
    public void test15348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15348");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap3);
        java.util.Spliterator<java.util.Locale.LanguageRange> languageRangeSpliterator5 = languageRangeList1.spliterator();
        boolean boolean6 = languageRangeList1.isEmpty();
        java.util.List<java.util.Locale.LanguageRange> languageRangeList8 = java.util.Locale.LanguageRange.parse("hi");
        boolean boolean10 = languageRangeList8.remove((java.lang.Object) "English");
        java.util.Locale.LanguageRange[] languageRangeArray11 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList12 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList12, languageRangeArray11);
        java.util.Locale locale15 = java.util.Locale.FRANCE;
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale15);
        java.util.Locale locale17 = java.util.Locale.US;
        java.util.Locale locale18 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale19 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale20 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale21 = java.util.Locale.getDefault();
        java.lang.String str22 = locale20.getDisplayCountry(locale21);
        java.lang.String str23 = locale20.toLanguageTag();
        java.util.Locale locale24 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale25 = java.util.Locale.getDefault();
        java.lang.String str26 = locale24.getDisplayCountry(locale25);
        java.util.Locale locale27 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale28 = java.util.Locale.getDefault();
        java.lang.String str29 = locale27.getDisplayCountry(locale28);
        java.util.Locale locale33 = new java.util.Locale("hi", "hi!", "cHINA");
        java.util.Locale locale34 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale35 = java.util.Locale.getDefault();
        java.lang.String str36 = locale34.getDisplayCountry(locale35);
        java.util.Locale locale38 = new java.util.Locale("");
        java.lang.String str39 = locale38.getDisplayVariant();
        java.util.Locale locale40 = java.util.Locale.KOREAN;
        java.util.Locale locale42 = new java.util.Locale("");
        java.util.Locale locale43 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale[] localeArray44 = new java.util.Locale[] { locale15, locale17, locale18, locale19, locale20, locale25, locale27, locale33, locale35, locale38, locale40, locale42, locale43 };
        java.util.ArrayList<java.util.Locale> localeList45 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList45, localeArray44);
        java.util.List<java.util.Locale> localeList47 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList12, (java.util.Collection<java.util.Locale>) localeList45);
        java.util.List<java.util.Locale> localeList48 = java.util.Locale.filter(languageRangeList8, (java.util.Collection<java.util.Locale>) localeList45);
        java.util.Locale.LanguageRange[] languageRangeArray49 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList50 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList50, languageRangeArray49);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap52 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList53 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList50, strMap52);
        int int54 = languageRangeList50.size();
        java.util.Locale.LanguageRange languageRange56 = new java.util.Locale.LanguageRange("English");
        java.util.Locale.LanguageRange languageRange58 = new java.util.Locale.LanguageRange("English");
        java.util.Locale.LanguageRange languageRange60 = new java.util.Locale.LanguageRange("a");
        java.util.Locale.LanguageRange[] languageRangeArray61 = new java.util.Locale.LanguageRange[] { languageRange56, languageRange58, languageRange60 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList62 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList62, languageRangeArray61);
        boolean boolean64 = languageRangeList50.retainAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList62);
        boolean boolean65 = languageRangeList8.containsAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList50);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream66 = languageRangeList50.parallelStream();
        boolean boolean67 = languageRangeList1.retainAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList50);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor68 = languageRangeList1.listIterator();
        java.lang.Object[] objArray69 = languageRangeList1.toArray();
        java.lang.String str71 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) languageRangeList1, "ese (Taiwan");
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(languageRangeSpliterator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(languageRangeList8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(languageRangeArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "english" + "'", str16, "english");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\u4e2d\u56fd" + "'", str22, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "zh-CN" + "'", str23, "zh-CN");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\u4e2d\u56fd" + "'", str26, "\u4e2d\u56fd");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\u4e2d\u56fd" + "'", str29, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals(locale33.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "\u4e2d\u56fd" + "'", str36, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals(locale38.toString(), "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "ko");
        org.junit.Assert.assertEquals(locale42.toString(), "");
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(localeList47);
        org.junit.Assert.assertNotNull(localeList48);
        org.junit.Assert.assertNotNull(languageRangeArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(languageRangeList53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(languageRangeArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(languageRangeStream66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(languageRangeItor68);
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray69), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray69), "[]");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "ArrayList" + "'", str71, "ArrayList");
    }

    @Test
    public void test15349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15349");
        java.lang.Class[] classArray2 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray3 = (java.lang.Class<?>[]) classArray2;
        java.lang.Class<?>[] wildcardClassArray4 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray2);
        java.lang.Class<?>[] wildcardClassArray5 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray2);
        java.lang.Class[] classArray7 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray8 = (java.lang.Class<?>[]) classArray7;
        java.lang.Class<?>[] wildcardClassArray9 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray7);
        java.lang.Class<?>[] wildcardClassArray10 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray7);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) classArray7, "zh-CN");
        boolean boolean13 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray5, (java.lang.Class<?>[]) classArray7);
        java.lang.Class[] classArray15 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray16 = (java.lang.Class<?>[]) classArray15;
        java.lang.Class<?>[] wildcardClassArray17 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray15);
        java.lang.Class<?>[] wildcardClassArray18 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray15);
        java.lang.Class[] classArray21 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray22 = (java.lang.Class<?>[]) classArray21;
        java.lang.Class<?>[] wildcardClassArray23 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray21);
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.concatWith("hi!", (java.lang.Object[]) classArray21);
        boolean boolean25 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray15, (java.lang.Class<?>[]) classArray21);
        boolean boolean27 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray5, (java.lang.Class<?>[]) classArray21, true);
        java.lang.Class[] classArray29 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray30 = (java.lang.Class<?>[]) classArray29;
        java.lang.Class<?>[] wildcardClassArray31 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray29);
        java.lang.Class<?> wildcardClass32 = null;
        java.lang.Class[] classArray34 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray35 = (java.lang.Class<?>[]) classArray34;
        wildcardClassArray35[0] = wildcardClass32;
        boolean boolean39 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray31, wildcardClassArray35, false);
        java.lang.Class[] classArray41 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray42 = (java.lang.Class<?>[]) classArray41;
        java.lang.Class<?>[] wildcardClassArray43 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray41);
        boolean boolean44 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray31, (java.lang.Class<?>[]) classArray41);
        java.lang.Class[] classArray46 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray47 = (java.lang.Class<?>[]) classArray46;
        java.lang.Class<?>[] wildcardClassArray48 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray46);
        java.lang.Class<?>[] wildcardClassArray49 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray46);
        java.lang.Class[] classArray51 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray52 = (java.lang.Class<?>[]) classArray51;
        java.lang.Class<?>[] wildcardClassArray53 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray51);
        java.lang.Class<?>[] wildcardClassArray54 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray51);
        java.lang.String str56 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) classArray51, "zh-CN");
        boolean boolean57 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray49, (java.lang.Class<?>[]) classArray51);
        boolean boolean59 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray31, wildcardClassArray49, false);
        java.lang.Class<?>[] wildcardClassArray60 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray31);
        java.lang.Class<?>[] wildcardClassArray61 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray31);
        boolean boolean62 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray21, wildcardClassArray31);
        java.lang.Class[] classArray64 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray65 = (java.lang.Class<?>[]) classArray64;
        java.lang.Class<?>[] wildcardClassArray66 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray64);
        java.lang.Class<?> wildcardClass67 = null;
        java.lang.Class[] classArray69 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray70 = (java.lang.Class<?>[]) classArray69;
        wildcardClassArray70[0] = wildcardClass67;
        boolean boolean74 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray66, wildcardClassArray70, false);
        java.lang.Class<?>[] wildcardClassArray75 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray66);
        boolean boolean77 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray21, wildcardClassArray75, false);
        java.lang.String str78 = org.apache.commons.lang3.StringUtils.concatWith("444444444444444444444444444444444444444444444444AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAANIHc", (java.lang.Object[]) wildcardClassArray75);
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertNotNull(wildcardClassArray4);
        org.junit.Assert.assertNotNull(wildcardClassArray5);
        org.junit.Assert.assertNotNull(classArray7);
        org.junit.Assert.assertNotNull(wildcardClassArray8);
        org.junit.Assert.assertNotNull(wildcardClassArray9);
        org.junit.Assert.assertNotNull(wildcardClassArray10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(classArray15);
        org.junit.Assert.assertNotNull(wildcardClassArray16);
        org.junit.Assert.assertNotNull(wildcardClassArray17);
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertNotNull(classArray21);
        org.junit.Assert.assertNotNull(wildcardClassArray22);
        org.junit.Assert.assertNotNull(wildcardClassArray23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(classArray29);
        org.junit.Assert.assertNotNull(wildcardClassArray30);
        org.junit.Assert.assertNotNull(wildcardClassArray31);
        org.junit.Assert.assertNotNull(classArray34);
        org.junit.Assert.assertNotNull(wildcardClassArray35);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(classArray41);
        org.junit.Assert.assertNotNull(wildcardClassArray42);
        org.junit.Assert.assertNotNull(wildcardClassArray43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(classArray46);
        org.junit.Assert.assertNotNull(wildcardClassArray47);
        org.junit.Assert.assertNotNull(wildcardClassArray48);
        org.junit.Assert.assertNotNull(wildcardClassArray49);
        org.junit.Assert.assertNotNull(classArray51);
        org.junit.Assert.assertNotNull(wildcardClassArray52);
        org.junit.Assert.assertNotNull(wildcardClassArray53);
        org.junit.Assert.assertNotNull(wildcardClassArray54);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray60);
        org.junit.Assert.assertNotNull(wildcardClassArray61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(classArray64);
        org.junit.Assert.assertNotNull(wildcardClassArray65);
        org.junit.Assert.assertNotNull(wildcardClassArray66);
        org.junit.Assert.assertNotNull(classArray69);
        org.junit.Assert.assertNotNull(wildcardClassArray70);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
    }

    @Test
    public void test15350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15350");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(" Italian  ", "GNAL.AVAJItalian (Italy)Italian (Italy)Italian");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test15351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15351");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("slgneslgneslgnefran\347ais (canada)slgneslgneslgnes", "EN-CASTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRIN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "slgneslgneslgnefran\347ais (canada)slgneslgneslgnes" + "'", str2, "slgneslgneslgnefran\347ais (canada)slgneslgneslgnes");
    }

    @Test
    public void test15352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15352");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "slgnEslgnEslgnEfran\347axsx(Canada)slgnEslgnEslgnEs");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test15353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15353");
        char[] charArray8 = new char[] {};
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "zh-CN", charArray8);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "a", charArray8);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "  China   ", charArray8);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "C", charArray8);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "italianojajajajajajajajajajajajajaj", charArray8);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "WZ.MZ.AZ.TY.EY.SW.FW.UV.NV.IV.GV.EV.CV.AV.ZU.YU.SU.MU.GU.AU.ZT.WT.VT.TT.RT.OT.NT.MT.LT.KT.JT.HT.GT.FT.DT.CT.ZS.YS.XS.VS.TS.SS.RS.OS.NS.MS.LS.KS.JS.IS.HS.GS.ES.DS.CS.BS.AS.WR.UR.SR.OR.ER.AQ.YP.WP.TP.SP.RP.NP.MP.LP.KP.HP.GP.FP.EP.AP.MO.ZN.UN.RN.PN.ON.LN.IN.GN.FN.EN.CN.AN.ZM.YM.XM.WM.VM.UM.TM.SM.RM.QM.PM.OM.NM.MM.LM.KM.HM.GM.FM.EM.DM.CM.AM.YL.VL.UL.TL.SL.RL.KL.IL.CL.BL.AL.ZK.YK.WK.RK.PK.NK.MK.IK.HK.GK.EK.PJ.OJ.MJ.EJ.TI.SI.RI.QI.OI.NI.MI.LI.EI.DI.UH.TH.RH.NH.MH.KH.YG.WG.UG.TG.SG.RG.QG.PG.NG.MG.LG.IG.HG.GG.FG.EG.DG.BG.AG.RF.OF.MF.KF.JF.IF.TE.SE.RE.HE.GE.EE.CE.ZD.OD.MD.KD.JD.ED.ZC.YC.XC.WC.VC.UC.RC.OC.NC.MC.LC.KC.IC.HC.GC.FC.DC.CC.AC.ZB.YB.WB.VB.TB.SB.RB.QB.OB.NB.MB.LB.JB.IB.HB.GB.FB.EB.DB.BB.AB.ZA.XA.WA.UA.TA.SA.RA.QA.OA.NA.MA.LA.IA.GA.FA.EA.DA", charArray8);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "AHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test15354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15354");
        java.util.Locale locale3 = new java.util.Locale("......", "ocle.Bulde", "US");
        org.junit.Assert.assertEquals(locale3.toString(), "......_OCLE.BULDE_US");
    }

    @Test
    public void test15355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15355");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("xxxxxxxxxxFrench(France)xxxxxxxxxx", "ingleseu", 36);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray4);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.endsWithAny("", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test15356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15356");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap3);
        int int5 = languageRangeList1.size();
        java.util.Locale.LanguageRange languageRange7 = new java.util.Locale.LanguageRange("English");
        java.util.Locale.LanguageRange languageRange9 = new java.util.Locale.LanguageRange("English");
        java.util.Locale.LanguageRange languageRange11 = new java.util.Locale.LanguageRange("a");
        java.util.Locale.LanguageRange[] languageRangeArray12 = new java.util.Locale.LanguageRange[] { languageRange7, languageRange9, languageRange11 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList13 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList13, languageRangeArray12);
        boolean boolean15 = languageRangeList1.retainAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList13);
        java.util.Locale.LanguageRange[] languageRangeArray16 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList17 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList17, languageRangeArray16);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap19 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList20 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList17, strMap19);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor21 = languageRangeList20.listIterator();
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList24 = new java.util.ArrayList<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList24, strArray23);
        java.util.Locale.LanguageRange[] languageRangeArray26 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList27 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList27, languageRangeArray26);
        java.util.Locale locale30 = java.util.Locale.FRANCE;
        java.lang.String str31 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale30);
        java.util.Locale locale32 = java.util.Locale.US;
        java.util.Locale locale33 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale34 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale35 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale36 = java.util.Locale.getDefault();
        java.lang.String str37 = locale35.getDisplayCountry(locale36);
        java.lang.String str38 = locale35.toLanguageTag();
        java.util.Locale locale39 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale40 = java.util.Locale.getDefault();
        java.lang.String str41 = locale39.getDisplayCountry(locale40);
        java.util.Locale locale42 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale43 = java.util.Locale.getDefault();
        java.lang.String str44 = locale42.getDisplayCountry(locale43);
        java.util.Locale locale48 = new java.util.Locale("hi", "hi!", "cHINA");
        java.util.Locale locale49 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale50 = java.util.Locale.getDefault();
        java.lang.String str51 = locale49.getDisplayCountry(locale50);
        java.util.Locale locale53 = new java.util.Locale("");
        java.lang.String str54 = locale53.getDisplayVariant();
        java.util.Locale locale55 = java.util.Locale.KOREAN;
        java.util.Locale locale57 = new java.util.Locale("");
        java.util.Locale locale58 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale[] localeArray59 = new java.util.Locale[] { locale30, locale32, locale33, locale34, locale35, locale40, locale42, locale48, locale50, locale53, locale55, locale57, locale58 };
        java.util.ArrayList<java.util.Locale> localeList60 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList60, localeArray59);
        java.util.List<java.util.Locale> localeList62 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList27, (java.util.Collection<java.util.Locale>) localeList60);
        java.lang.String[] strArray70 = new java.lang.String[] { "English", "hi", "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "", "a", "", "China" };
        java.util.ArrayList<java.lang.String> strList71 = new java.util.ArrayList<java.lang.String>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList71, strArray70);
        java.util.List<java.lang.Class<?>> wildcardClassList73 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList71);
        java.util.Locale.FilteringMode filteringMode74 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList75 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList27, (java.util.Collection<java.lang.String>) strList71, filteringMode74);
        java.util.List<java.lang.String> strList76 = java.util.Locale.filterTags(languageRangeList20, (java.util.Collection<java.lang.String>) strList24, filteringMode74);
        java.util.List<java.lang.String> strList77 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList24);
        java.util.List<java.lang.Class<?>> wildcardClassList78 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList24);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(languageRangeArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(languageRangeArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(languageRangeList20);
        org.junit.Assert.assertNotNull(languageRangeItor21);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(languageRangeArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "english" + "'", str31, "english");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "\u4e2d\u56fd" + "'", str37, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "zh-CN" + "'", str38, "zh-CN");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "\u4e2d\u56fd" + "'", str41, "\u4e2d\u56fd");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "\u4e2d\u56fd" + "'", str44, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals(locale48.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "\u4e2d\u56fd" + "'", str51, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals(locale53.toString(), "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "ko");
        org.junit.Assert.assertEquals(locale57.toString(), "");
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(localeList62);
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(wildcardClassList73);
        org.junit.Assert.assertTrue("'" + filteringMode74 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode74.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList75);
        org.junit.Assert.assertNotNull(strList76);
        org.junit.Assert.assertNotNull(strList77);
        org.junit.Assert.assertNotNull(wildcardClassList78);
    }

    @Test
    public void test15357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15357");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                    EN_CA                    ", 4, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                    EN_CA                    " + "'", str3, "                    EN_CA                    ");
    }

    @Test
    public void test15358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15358");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("Anzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAn", "elacoLelacoLelacoLelacoLelacoL");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Anzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAn" + "'", str2, "Anzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAn");
    }

    @Test
    public void test15359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15359");
        java.util.Locale locale0 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale1 = java.util.Locale.getDefault();
        java.lang.String str2 = locale0.getDisplayCountry(locale1);
        java.lang.String str3 = locale0.toLanguageTag();
        java.lang.String str4 = locale0.getCountry();
        java.lang.String str5 = locale0.getISO3Country();
        java.util.Locale locale7 = new java.util.Locale("");
        java.lang.String str8 = locale7.getDisplayVariant();
        java.lang.String str9 = locale0.getDisplayLanguage(locale7);
        java.util.Locale locale10 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale11 = java.util.Locale.getDefault();
        java.lang.String str12 = locale10.getDisplayCountry(locale11);
        java.lang.String str13 = locale10.toLanguageTag();
        java.lang.String str14 = locale10.getLanguage();
        java.util.Locale locale15 = java.util.Locale.ITALIAN;
        java.util.Locale locale17 = new java.util.Locale("");
        java.lang.String str18 = locale17.getDisplayLanguage();
        java.util.Locale locale19 = java.util.Locale.CANADA;
        java.lang.String str20 = locale19.getDisplayLanguage();
        java.lang.String str21 = locale17.getDisplayScript(locale19);
        java.util.Locale locale23 = java.util.Locale.FRANCE;
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale23);
        java.lang.String str25 = locale17.getDisplayCountry(locale23);
        java.lang.String str26 = locale15.getDisplayScript(locale17);
        java.util.Locale locale27 = java.util.Locale.GERMAN;
        java.lang.String str28 = locale17.getDisplayLanguage(locale27);
        java.lang.String str29 = locale10.getDisplayCountry(locale17);
        java.lang.String str30 = locale17.getCountry();
        java.util.Locale locale34 = new java.util.Locale("....english", "zhcinesese", ".");
        java.lang.String str35 = locale17.getDisplayName(locale34);
        java.lang.String str36 = locale7.getDisplayName(locale34);
        java.lang.String str37 = locale34.getDisplayLanguage();
        java.util.Set<java.lang.Character> charSet38 = locale34.getExtensionKeys();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u4e2d\u56fd" + "'", str2, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zh-CN" + "'", str3, "zh-CN");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CN" + "'", str4, "CN");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CHN" + "'", str5, "CHN");
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Chinese" + "'", str9, "Chinese");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\u4e2d\u56fd" + "'", str12, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "zh-CN" + "'", str13, "zh-CN");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "zh" + "'", str14, "zh");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "it");
        org.junit.Assert.assertEquals(locale17.toString(), "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\u82f1\u6587" + "'", str20, "\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "english" + "'", str24, "english");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "de");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "China" + "'", str29, "China");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals(locale34.toString(), "....english_ZHCINESESE_.");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "....english" + "'", str37, "....english");
        org.junit.Assert.assertNotNull(charSet38);
    }

    @Test
    public void test15360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15360");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("############################NHC", "Esglish (Usitee Ststes", 13);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test15361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15361");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "\u5317\u5370\u5ea6\u6587 (HI!,cHINA)");
// flaky:         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 39 + "'", int1 == 39);
    }

    @Test
    public void test15362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15362");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("zH", strMap1);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap4 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList5 = java.util.Locale.LanguageRange.parse("it", strMap4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList5, '#');
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap8 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList9 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList5, strMap8);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap11 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList12 = java.util.Locale.LanguageRange.parse("Cina", strMap11);
        java.lang.String[] strArray16 = new java.lang.String[] { "aiaiaiaiaiaiaiaiaia", "zh-CN", "China" };
        java.util.ArrayList<java.lang.String> strList17 = new java.util.ArrayList<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList17, strArray16);
        java.util.Locale.FilteringMode filteringMode19 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList20 = java.util.Locale.filterTags(languageRangeList12, (java.util.Collection<java.lang.String>) strList17, filteringMode19);
        boolean boolean21 = languageRangeList5.contains((java.lang.Object) strList17);
        languageRangeList5.clear();
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream23 = languageRangeList5.stream();
        boolean boolean24 = languageRangeList2.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList5);
        java.lang.String str26 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList5, 'a');
        java.util.Spliterator<java.util.Locale.LanguageRange> languageRangeSpliterator27 = languageRangeList5.spliterator();
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeList5);
        org.junit.Assert.assertNotNull(languageRangeList9);
        org.junit.Assert.assertNotNull(languageRangeList12);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + filteringMode19 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode19.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(languageRangeStream23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(languageRangeSpliterator27);
    }

    @Test
    public void test15363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15363");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "\u4e2d\u56fd");
// flaky:         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test15364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15364");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale.Builder builder3 = builder1.setLocale(locale2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder1.setUnicodeLocaleKeyword("ISTFRAHARRAYLISTFRAHARRAYLISTFRAHARRAYLISTFRAHARRAYLISTFRAHARRAYLISTFRAHARRAYLISTFRAHARRAYLIST", "                                              italiahi                                              ");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: ISTFRAHARRAYLISTFRAHARRAYLISTFRAHARRAYLISTFRAHARRAYLISTFRAHARRAYLISTFRAHARRAYLISTFRAHARRAYLIST [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test15365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15365");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "CHINOIS(CHINE)", "hindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihind (LOCALE.BUILDER,ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hEnglish)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test15366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15366");
        char[] charArray6 = new char[] {};
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "zh-CN", charArray6);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "a", charArray6);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "  China   ", charArray6);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "CINACI", charArray6);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "latiarfatilatiarfatilatiarfatilatiarfatilatiarfatilatiarfatilatiarfatilatiarfatilatiarfatilatiarfati", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test15367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15367");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("HI!HI!HI!HI!HI!Hzh_Z!ZH_TWHI!HI!HI!HI!HI!Hzh_Z!H", 51, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#HI!HI!HI!HI!HI!Hzh_Z!ZH_TWHI!HI!HI!HI!HI!Hzh_Z!H##" + "'", str3, "#HI!HI!HI!HI!HI!Hzh_Z!ZH_TWHI!HI!HI!HI!HI!Hzh_Z!H##");
    }

    @Test
    public void test15368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15368");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap3);
        int int5 = languageRangeList1.size();
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor6 = languageRangeList1.listIterator();
        java.util.Locale.LanguageRange languageRange8 = new java.util.Locale.LanguageRange("a");
        java.util.Locale.LanguageRange languageRange10 = new java.util.Locale.LanguageRange("English");
        java.lang.String str12 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) languageRange10, "");
        java.util.Locale.LanguageRange languageRange14 = new java.util.Locale.LanguageRange("English");
        java.util.Locale.LanguageRange[] languageRangeArray15 = new java.util.Locale.LanguageRange[] { languageRange8, languageRange10, languageRange14 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList16 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList16, languageRangeArray15);
        boolean boolean18 = languageRangeList1.retainAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList16);
        java.util.Iterator<java.util.Locale.LanguageRange> languageRangeItor19 = languageRangeList1.iterator();
        java.util.List<java.util.Locale.LanguageRange> languageRangeList21 = java.util.Locale.LanguageRange.parse("hi");
        java.lang.Object[] objArray22 = languageRangeList21.toArray();
        boolean boolean23 = languageRangeList1.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList21);
        java.lang.Object[] objArray24 = languageRangeList21.toArray();
        languageRangeList21.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList28 = languageRangeList21.subList(252, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(languageRangeItor6);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Locale.LanguageRange" + "'", str12, "Locale.LanguageRange");
        org.junit.Assert.assertNotNull(languageRangeArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(languageRangeItor19);
        org.junit.Assert.assertNotNull(languageRangeList21);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(objArray24);
    }

    @Test
    public void test15369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15369");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.setLanguageTag("zh-CN");
        java.util.Locale.Builder builder5 = builder3.setLanguage("it");
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        java.util.Locale.Builder builder8 = builder5.setLanguage("Engls");
        java.util.Locale locale10 = new java.util.Locale("");
        java.lang.String str11 = locale10.getDisplayLanguage();
        java.util.Locale locale12 = java.util.Locale.CANADA;
        java.lang.String str13 = locale12.getDisplayLanguage();
        java.lang.String str14 = locale10.getDisplayScript(locale12);
        java.util.Locale locale15 = java.util.Locale.ITALIAN;
        java.util.Locale locale17 = new java.util.Locale("");
        java.lang.String str18 = locale17.getDisplayLanguage();
        java.util.Locale locale19 = java.util.Locale.CANADA;
        java.lang.String str20 = locale19.getDisplayLanguage();
        java.lang.String str21 = locale17.getDisplayScript(locale19);
        java.util.Locale locale23 = java.util.Locale.FRANCE;
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale23);
        java.lang.String str25 = locale17.getDisplayCountry(locale23);
        java.lang.String str26 = locale15.getDisplayScript(locale17);
        java.lang.String str27 = locale17.getDisplayCountry();
        java.lang.String str28 = locale17.getDisplayLanguage();
        java.util.Locale locale29 = java.util.Locale.PRC;
        java.lang.String str30 = locale17.getDisplayScript(locale29);
        java.lang.String str31 = locale12.getDisplayCountry(locale17);
        java.util.Locale.Builder builder32 = builder8.setLocale(locale12);
        java.util.Set<java.lang.String> strSet33 = locale12.getUnicodeLocaleAttributes();
        java.lang.String str34 = locale12.getScript();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\u82f1\u6587" + "'", str13, "\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "it");
        org.junit.Assert.assertEquals(locale17.toString(), "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\u82f1\u6587" + "'", str20, "\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "english" + "'", str24, "english");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Canada" + "'", str31, "Canada");
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(strSet33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
    }

    @Test
    public void test15370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15370");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("cinese(Taiwan)", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXZH-CNENGLH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "cinese(Taiwan)" + "'", str2, "cinese(Taiwan)");
    }

    @Test
    public void test15371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15371");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap3);
        java.util.Locale locale6 = new java.util.Locale("");
        java.lang.String str7 = locale6.getDisplayLanguage();
        java.util.Locale locale8 = java.util.Locale.CANADA;
        java.lang.String str9 = locale8.getDisplayLanguage();
        java.lang.String str10 = locale6.getDisplayScript(locale8);
        int int11 = languageRangeList1.indexOf((java.lang.Object) locale6);
        java.util.Spliterator<java.util.Locale.LanguageRange> languageRangeSpliterator12 = languageRangeList1.spliterator();
        java.lang.String str14 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) languageRangeList1, "chinChinChinChinChiChinChinChinChinC");
        java.lang.String[] strArray20 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("English", "hi", (int) (short) -1);
        java.lang.String[] strArray23 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("a", "");
        java.lang.String[] strArray24 = org.apache.commons.lang3.StringUtils.stripAll(strArray23);
        java.lang.String str25 = org.apache.commons.lang3.StringUtils.replaceEach("en", strArray20, strArray24);
        int int26 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("zh-CNenglish", strArray24);
        java.lang.String[] strArray28 = org.apache.commons.lang3.StringUtils.stripAll(strArray24, ".....");
        java.lang.String[] strArray29 = languageRangeList1.toArray(strArray24);
        java.lang.String str33 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray24, '.', 98, 31);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u82f1\u6587" + "'", str9, "\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(languageRangeSpliterator12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "java.util" + "'", str14, "java.util");
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "en" + "'", str25, "en");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
    }

    @Test
    public void test15372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15372");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("\u30c9\u30a4\u30c4\u8a9e", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=?????");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test15373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15373");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap3);
        int int5 = languageRangeList1.size();
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor6 = languageRangeList1.listIterator();
        java.util.Locale.LanguageRange[] languageRangeArray7 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList8 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList8, languageRangeArray7);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap10 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList11 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList8, strMap10);
        int int12 = languageRangeList8.size();
        java.util.Locale locale14 = new java.util.Locale("");
        java.util.Set<java.lang.String> strSet15 = locale14.getUnicodeLocaleKeys();
        java.util.Locale.FilteringMode filteringMode16 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList17 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList8, (java.util.Collection<java.lang.String>) strSet15, filteringMode16);
        java.util.List<java.lang.Class<?>> wildcardClassList18 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses(strList17);
        java.lang.String str19 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList17);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange21 = languageRangeList1.remove(44);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 44, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(languageRangeItor6);
        org.junit.Assert.assertNotNull(languageRangeArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(languageRangeList11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertTrue("'" + filteringMode16 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode16.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(wildcardClassList18);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test15374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15374");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("deu########################################");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=deu########################################");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test15375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15375");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("it", strMap1);
        java.util.Locale locale3 = java.util.Locale.getDefault();
        int int4 = languageRangeList2.lastIndexOf((java.lang.Object) locale3);
        java.util.Locale.LanguageRange[] languageRangeArray5 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList6 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList6, languageRangeArray5);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap8 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList9 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList6, strMap8);
        java.util.Locale.LanguageRange[] languageRangeArray10 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList11 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList11, languageRangeArray10);
        boolean boolean13 = languageRangeList6.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList11);
        java.util.Locale.LanguageRange[] languageRangeArray14 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList15 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList15, languageRangeArray14);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap17 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList18 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList15, strMap17);
        java.util.Locale.LanguageRange[] languageRangeArray19 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList20 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList20, languageRangeArray19);
        boolean boolean22 = languageRangeList15.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList20);
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList20, "hi!");
        boolean boolean25 = languageRangeList6.remove((java.lang.Object) languageRangeList20);
        boolean boolean26 = languageRangeList2.containsAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList6);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream27 = languageRangeList6.parallelStream();
        java.util.Locale.LanguageRange languageRange30 = new java.util.Locale.LanguageRange("Engls");
        java.lang.String str31 = languageRange30.getRange();
        double double32 = languageRange30.getWeight();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange33 = languageRangeList6.set(280, languageRange30);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 280, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(languageRangeArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(languageRangeList9);
        org.junit.Assert.assertNotNull(languageRangeArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(languageRangeArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(languageRangeList18);
        org.junit.Assert.assertNotNull(languageRangeArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(languageRangeStream27);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "engls" + "'", str31, "engls");
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 1.0d + "'", double32 == 1.0d);
    }

    @Test
    public void test15376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15376");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap3);
        java.util.Locale.LanguageRange[] languageRangeArray5 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList6 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList6, languageRangeArray5);
        boolean boolean8 = languageRangeList1.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList6);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList6, "hi!");
        java.lang.Class[] classArray12 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray13 = (java.lang.Class<?>[]) classArray12;
        java.lang.Class<?>[] wildcardClassArray14 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray12);
        java.lang.Class<?>[] wildcardClassArray15 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray12);
        java.lang.Class[] classArray18 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray19 = (java.lang.Class<?>[]) classArray18;
        java.lang.Class<?>[] wildcardClassArray20 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray18);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.concatWith("hi!", (java.lang.Object[]) classArray18);
        boolean boolean22 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray12, (java.lang.Class<?>[]) classArray18);
        java.lang.Class[] classArray24 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray25 = (java.lang.Class<?>[]) classArray24;
        java.lang.Class<?>[] wildcardClassArray26 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray24);
        java.lang.Class<?> wildcardClass27 = null;
        java.lang.Class[] classArray29 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray30 = (java.lang.Class<?>[]) classArray29;
        wildcardClassArray30[0] = wildcardClass27;
        boolean boolean34 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray26, wildcardClassArray30, false);
        java.lang.Class[] classArray36 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray37 = (java.lang.Class<?>[]) classArray36;
        java.lang.Class<?>[] wildcardClassArray38 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray36);
        boolean boolean39 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray26, (java.lang.Class<?>[]) classArray36);
        boolean boolean40 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray12, (java.lang.Class<?>[]) classArray36);
        java.lang.Class<?>[] wildcardClassArray41 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers((java.lang.Class<?>[]) classArray36);
        java.lang.Class<?>[] wildcardClassArray42 = languageRangeList6.toArray((java.lang.Class<?>[]) classArray36);
        java.lang.Class<?>[] wildcardClassArray43 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray42);
        java.lang.String str44 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) wildcardClassArray42);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(languageRangeArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(classArray12);
        org.junit.Assert.assertNotNull(wildcardClassArray13);
        org.junit.Assert.assertNotNull(wildcardClassArray14);
        org.junit.Assert.assertNotNull(wildcardClassArray15);
        org.junit.Assert.assertNotNull(classArray18);
        org.junit.Assert.assertNotNull(wildcardClassArray19);
        org.junit.Assert.assertNotNull(wildcardClassArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(classArray24);
        org.junit.Assert.assertNotNull(wildcardClassArray25);
        org.junit.Assert.assertNotNull(wildcardClassArray26);
        org.junit.Assert.assertNotNull(classArray29);
        org.junit.Assert.assertNotNull(wildcardClassArray30);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(classArray36);
        org.junit.Assert.assertNotNull(wildcardClassArray37);
        org.junit.Assert.assertNotNull(wildcardClassArray38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray41);
        org.junit.Assert.assertNotNull(wildcardClassArray42);
        org.junit.Assert.assertNotNull(wildcardClassArray43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
    }

    @Test
    public void test15377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15377");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("   JAJAJAJAJAJAJAJAJAJAJAJAJAJ)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JAJAJAJAJAJAJAJAJAJAJAJAJAJ)" + "'", str1, "JAJAJAJAJAJAJAJAJAJAJAJAJAJ)");
    }

    @Test
    public void test15378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15378");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("chinchinchinchinchichinchinchinchinc");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test15379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15379");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("                 a                 ", "IIIIIIIIIIIIIIIIIIIIIIISTRINGIIIIIIIIIIIIIIIIIIIIIII");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                 a                 " + "'", str2, "                 a                 ");
    }

    @Test
    public void test15380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15380");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "xxxxxxxxinglese (canada)xxxxxxxx");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test15381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15381");
        java.util.Locale locale3 = new java.util.Locale("Cinaxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", "ggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engli", "us");
        java.lang.String str4 = locale3.getDisplayScript();
        java.util.Locale locale7 = new java.util.Locale("zh_C");
        java.util.Locale.Category category8 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale9 = java.util.Locale.ENGLISH;
        java.util.Locale.setDefault(category8, locale9);
        java.util.Locale locale11 = java.util.Locale.JAPANESE;
        java.util.Locale locale13 = java.util.Locale.TAIWAN;
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.upperCase("", locale13);
        java.lang.String str15 = locale11.getDisplayVariant(locale13);
        java.util.Locale.setDefault(category8, locale13);
        java.lang.String str17 = locale13.getVariant();
        java.lang.String str18 = locale7.getDisplayScript(locale13);
        java.util.Locale locale21 = new java.util.Locale("italiano", "Ci_a");
        java.util.Locale locale25 = new java.util.Locale("Canada", "allemand", "cHINA");
        java.lang.String str26 = locale21.getDisplayName(locale25);
        java.lang.String str27 = locale21.getLanguage();
        java.lang.String str29 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) locale21, "GGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGL");
        java.lang.String str30 = locale13.getDisplayLanguage(locale21);
        java.lang.String str31 = org.apache.commons.lang3.StringUtils.upperCase("locale.builder", locale13);
        java.lang.String str32 = locale3.getDisplayLanguage(locale13);
        java.lang.String str33 = locale13.getLanguage();
        org.junit.Assert.assertEquals(locale3.toString(), "cinaxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx_GGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLI_us");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals(locale7.toString(), "zh_c");
        org.junit.Assert.assertTrue("'" + category8 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category8.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "ja");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals(locale21.toString(), "italiano_CI_A");
        org.junit.Assert.assertEquals(locale25.toString(), "canada_ALLEMAND_cHINA");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "italiano (CI_A)" + "'", str26, "italiano (CI_A)");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "italiano" + "'", str27, "italiano");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Locale" + "'", str29, "Locale");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Chinese" + "'", str30, "Chinese");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "LOCALE.BUILDER" + "'", str31, "LOCALE.BUILDER");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "cinaxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx" + "'", str32, "cinaxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "zh" + "'", str33, "zh");
    }

    @Test
    public void test15382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15382");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("CHN", strMap1);
        languageRangeList2.clear();
        boolean boolean4 = languageRangeList2.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange6 = languageRangeList2.get(83);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 83, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test15383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15383");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray7 = new char[] {};
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "zh-CN", charArray7);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "English", charArray7);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "engliIlish", charArray7);
        java.lang.String str13 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) charArray7, "EnglTWNsTWN");
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny("i", charArray7);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "ARRAYLIS", charArray7);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsNone(charSequence0, charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "char[]" + "'", str13, "char[]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test15384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15384");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("                     cn (ITALIANOJAJAJAJAJAJAJAJAJAJAJAJAJAJ)                      ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                      )JAJAJAJAJAJAJAJAJAJAJAJAJAJONAILATI( nc                     " + "'", str1, "                      )JAJAJAJAJAJAJAJAJAJAJAJAJAJONAILATI( nc                     ");
    }

    @Test
    public void test15385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15385");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "nnnnnnnnnnnnnnnnnann", (java.lang.CharSequence) "                                        f   ch");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 46 + "'", int2 == 46);
    }

    @Test
    public void test15386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15386");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "rgla");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test15387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15387");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.setLanguageTag("zh-CN");
        java.util.Locale.Builder builder5 = builder3.setLanguage("it");
        java.util.Locale.Builder builder7 = builder5.removeUnicodeLocaleAttribute("fra");
        java.util.Locale locale8 = builder7.build();
        java.util.Locale.Builder builder9 = builder7.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder9.setUnicodeLocaleKeyword("\u5370\u5ea6\u6587", "t                                               ");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: ??? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "it_CN");
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test15388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15388");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("\u4e2d\u6587\u4e2d\u570b)", "                                                                                                RGLA", 19);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test15389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15389");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("it                                           it          AD.AE.AF.AGchnaafraAD.AE.AF.AGchnaaa", "EN_C", 9);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test15390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15390");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("cinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecines", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "cinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecines" + "'", str2, "cinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecines");
    }

    @Test
    public void test15391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15391");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("aaaaaaadnu", "############################NHC");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test15392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15392");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("\u53f0\u7063", 35, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u53f0\u7063aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "\u53f0\u7063aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test15393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15393");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("italiahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIital...xxxxx");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "italiahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIital...xxxxx" + "'", str1, "italiahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIital...xxxxx");
    }

    @Test
    public void test15394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15394");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName("Double");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test15395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15395");
        java.util.Locale locale0 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale1 = java.util.Locale.getDefault();
        java.lang.String str2 = locale0.getDisplayCountry(locale1);
        java.lang.String str3 = locale0.toLanguageTag();
        java.lang.String str4 = locale0.getLanguage();
        java.util.Locale locale5 = java.util.Locale.ITALIAN;
        java.util.Locale locale7 = new java.util.Locale("");
        java.lang.String str8 = locale7.getDisplayLanguage();
        java.util.Locale locale9 = java.util.Locale.CANADA;
        java.lang.String str10 = locale9.getDisplayLanguage();
        java.lang.String str11 = locale7.getDisplayScript(locale9);
        java.util.Locale locale13 = java.util.Locale.FRANCE;
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale13);
        java.lang.String str15 = locale7.getDisplayCountry(locale13);
        java.lang.String str16 = locale5.getDisplayScript(locale7);
        java.util.Locale locale17 = java.util.Locale.GERMAN;
        java.lang.String str18 = locale7.getDisplayLanguage(locale17);
        java.lang.String str19 = locale0.getDisplayCountry(locale7);
        java.util.Locale locale20 = locale0.stripExtensions();
        java.util.Locale locale21 = java.util.Locale.ITALIAN;
        java.lang.String str22 = locale21.getISO3Language();
        java.util.Locale.Builder builder23 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder24 = builder23.clearExtensions();
        java.util.Locale.Builder builder26 = builder24.setLanguageTag("zh-CN");
        java.util.Locale.Builder builder28 = builder26.setLanguage("it");
        java.util.Locale.Builder builder29 = builder28.clear();
        java.util.Locale locale31 = new java.util.Locale("");
        java.lang.String str32 = locale31.getDisplayLanguage();
        java.util.Locale locale33 = java.util.Locale.CANADA;
        java.lang.String str34 = locale33.getDisplayLanguage();
        java.lang.String str35 = locale31.getDisplayScript(locale33);
        java.lang.String str36 = locale33.getDisplayVariant();
        java.util.Locale locale37 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale38 = java.util.Locale.getDefault();
        java.lang.String str39 = locale37.getDisplayCountry(locale38);
        java.lang.String str40 = locale38.getDisplayVariant();
        java.lang.String str41 = locale33.getDisplayScript(locale38);
        java.util.Locale.Builder builder42 = builder28.setLocale(locale38);
        java.util.Locale.Builder builder43 = builder42.clearExtensions();
        java.util.Locale.Builder builder44 = builder43.clear();
        java.util.Locale.Builder builder46 = builder43.removeUnicodeLocaleAttribute("inglese");
        java.util.Locale.Builder builder47 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder48 = builder47.clearExtensions();
        java.util.Locale.Builder builder50 = builder48.setLanguageTag("zh-CN");
        java.util.Locale.Builder builder52 = builder50.setLanguage("it");
        java.util.Locale.Builder builder53 = builder52.clear();
        java.util.Locale locale55 = new java.util.Locale("");
        java.lang.String str56 = locale55.getDisplayLanguage();
        java.util.Locale locale57 = java.util.Locale.CANADA;
        java.lang.String str58 = locale57.getDisplayLanguage();
        java.lang.String str59 = locale55.getDisplayScript(locale57);
        java.lang.String str60 = locale57.getDisplayVariant();
        java.util.Locale locale61 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale62 = java.util.Locale.getDefault();
        java.lang.String str63 = locale61.getDisplayCountry(locale62);
        java.lang.String str64 = locale62.getDisplayVariant();
        java.lang.String str65 = locale57.getDisplayScript(locale62);
        java.util.Locale.Builder builder66 = builder52.setLocale(locale62);
        java.util.Locale.Builder builder67 = builder66.clearExtensions();
        java.util.Locale locale69 = java.util.Locale.ITALIAN;
        java.util.Locale locale71 = new java.util.Locale("");
        java.lang.String str72 = locale71.getDisplayLanguage();
        java.util.Locale locale73 = java.util.Locale.CANADA;
        java.lang.String str74 = locale73.getDisplayLanguage();
        java.lang.String str75 = locale71.getDisplayScript(locale73);
        java.util.Locale locale77 = java.util.Locale.FRANCE;
        java.lang.String str78 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale77);
        java.lang.String str79 = locale71.getDisplayCountry(locale77);
        java.lang.String str80 = locale69.getDisplayScript(locale71);
        java.lang.String str81 = org.apache.commons.lang3.StringUtils.upperCase("China", locale69);
        java.util.Locale locale83 = java.util.Locale.TAIWAN;
        java.lang.String str84 = org.apache.commons.lang3.StringUtils.upperCase("", locale83);
        java.lang.String str85 = locale83.getISO3Country();
        java.util.Set<java.lang.Character> charSet86 = locale83.getExtensionKeys();
        java.util.Locale locale87 = locale83.stripExtensions();
        java.lang.String str88 = locale69.getDisplayLanguage(locale83);
        java.util.Locale.Builder builder89 = builder66.setLocale(locale69);
        java.util.Locale.Builder builder90 = builder46.setLocale(locale69);
        java.lang.String str91 = locale21.getDisplayCountry(locale69);
        java.lang.String str92 = locale0.getDisplayVariant(locale69);
        java.lang.String str93 = locale69.getDisplayName();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u4e2d\u56fd" + "'", str2, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zh-CN" + "'", str3, "zh-CN");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zh" + "'", str4, "zh");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "it");
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\u82f1\u6587" + "'", str10, "\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "english" + "'", str14, "english");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "de");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "China" + "'", str19, "China");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "it");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "ita" + "'", str22, "ita");
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertEquals(locale31.toString(), "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "\u82f1\u6587" + "'", str34, "\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "\u4e2d\u56fd" + "'", str39, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertEquals(locale55.toString(), "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertNotNull(locale57);
        org.junit.Assert.assertEquals(locale57.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "\u82f1\u6587" + "'", str58, "\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertNotNull(locale61);
        org.junit.Assert.assertEquals(locale61.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale62);
        org.junit.Assert.assertEquals(locale62.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "\u4e2d\u56fd" + "'", str63, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertNotNull(builder66);
        org.junit.Assert.assertNotNull(builder67);
        org.junit.Assert.assertNotNull(locale69);
        org.junit.Assert.assertEquals(locale69.toString(), "it");
        org.junit.Assert.assertEquals(locale71.toString(), "");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertNotNull(locale73);
        org.junit.Assert.assertEquals(locale73.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "\u82f1\u6587" + "'", str74, "\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertNotNull(locale77);
        org.junit.Assert.assertEquals(locale77.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "english" + "'", str78, "english");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "CHINA" + "'", str81, "CHINA");
        org.junit.Assert.assertNotNull(locale83);
        org.junit.Assert.assertEquals(locale83.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "" + "'", str84, "");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "TWN" + "'", str85, "TWN");
        org.junit.Assert.assertNotNull(charSet86);
        org.junit.Assert.assertNotNull(locale87);
        org.junit.Assert.assertEquals(locale87.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "\u7fa9\u5927\u5229\u6587" + "'", str88, "\u7fa9\u5927\u5229\u6587");
        org.junit.Assert.assertNotNull(builder89);
        org.junit.Assert.assertNotNull(builder90);
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "" + "'", str91, "");
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "" + "'", str92, "");
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "\u7fa9\u5927\u5229\u6587" + "'", str93, "\u7fa9\u5927\u5229\u6587");
    }

    @Test
    public void test15396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15396");
        java.lang.CharSequence charSequence1 = null;
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "\u0939\u093f\u0902\u0926\u0940 (HI!,cHINA)", charSequence1);
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "\u0939\u093f\u0902\u0926\u0940 (HI!,cHINA)" + "'", charSequence2, "\u0939\u093f\u0902\u0926\u0940 (HI!,cHINA)");
    }

    @Test
    public void test15397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15397");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray8 = new char[] {};
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "zh-CN", charArray8);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "English", charArray8);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "engliIlish", charArray8);
        java.lang.String str14 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) charArray8, "EnglTWNsTWN");
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "FR", charArray8);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsNone(charSequence2, charArray8);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "it-CN", charArray8);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "anihcxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "char[]" + "'", str14, "char[]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test15398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15398");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "zaa.ab.ae.af.ak.am.an.ar.as.av.ay.az.ba.be.bg.bh.bi.bm.bn.bo.br.bs.ca.ce.ch.co.cr.cs.cu.cv.cy.da.de.dv.dz.ee.el.en.eo.es.et.eu.fa.ff.fi.fj.fo.fr.fy.ga.gd.gl.gn.gu.gv.ha.he.hi.ho.hr.ht.hu.hy.hz.ia.id.ie.ig.ii.ik.in.io.is.it.iu.iw.ja.ji.jv.ka.kg.ki.kj.kk.kl.km.kn.ko.kr.ks.ku.kv.kw.ky.la.lb.lg.li.ln.lo.lt.lu.lv.mg.mh.mi.mk.ml.mn.mo.mr.ms.mt.my.na.nb.nd.ne.ng.nl.nn.no.nr.nv.ny.oc.oj.om.or.os.pa.pi.pl.ps.pt.qu.rm.rn.ro.ru.rw.sa.sc.sd.se.sg.si.sk.sl.sm.sn.so.sq.sr.ss.st.su.sv.sw.ta.te.tg.th.ti.tk.tl.tn.to.tr.ts.tt.tw.ty.ug.uk.ur.uz.ve.vi.vo.wa.wo.xh.yi.yo.za.zh.zu", (java.lang.CharSequence) "Hindi (HI!...");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "zaa.ab.ae.af.ak.am.an.ar.as.av.ay.az.ba.be.bg.bh.bi.bm.bn.bo.br.bs.ca.ce.ch.co.cr.cs.cu.cv.cy.da.de.dv.dz.ee.el.en.eo.es.et.eu.fa.ff.fi.fj.fo.fr.fy.ga.gd.gl.gn.gu.gv.ha.he.hi.ho.hr.ht.hu.hy.hz.ia.id.ie.ig.ii.ik.in.io.is.it.iu.iw.ja.ji.jv.ka.kg.ki.kj.kk.kl.km.kn.ko.kr.ks.ku.kv.kw.ky.la.lb.lg.li.ln.lo.lt.lu.lv.mg.mh.mi.mk.ml.mn.mo.mr.ms.mt.my.na.nb.nd.ne.ng.nl.nn.no.nr.nv.ny.oc.oj.om.or.os.pa.pi.pl.ps.pt.qu.rm.rn.ro.ru.rw.sa.sc.sd.se.sg.si.sk.sl.sm.sn.so.sq.sr.ss.st.su.sv.sw.ta.te.tg.th.ti.tk.tl.tn.to.tr.ts.tt.tw.ty.ug.uk.ur.uz.ve.vi.vo.wa.wo.xh.yi.yo.za.zh.zu" + "'", charSequence2, "zaa.ab.ae.af.ak.am.an.ar.as.av.ay.az.ba.be.bg.bh.bi.bm.bn.bo.br.bs.ca.ce.ch.co.cr.cs.cu.cv.cy.da.de.dv.dz.ee.el.en.eo.es.et.eu.fa.ff.fi.fj.fo.fr.fy.ga.gd.gl.gn.gu.gv.ha.he.hi.ho.hr.ht.hu.hy.hz.ia.id.ie.ig.ii.ik.in.io.is.it.iu.iw.ja.ji.jv.ka.kg.ki.kj.kk.kl.km.kn.ko.kr.ks.ku.kv.kw.ky.la.lb.lg.li.ln.lo.lt.lu.lv.mg.mh.mi.mk.ml.mn.mo.mr.ms.mt.my.na.nb.nd.ne.ng.nl.nn.no.nr.nv.ny.oc.oj.om.or.os.pa.pi.pl.ps.pt.qu.rm.rn.ro.ru.rw.sa.sc.sd.se.sg.si.sk.sl.sm.sn.so.sq.sr.ss.st.su.sv.sw.ta.te.tg.th.ti.tk.tl.tn.to.tr.ts.tt.tw.ty.ug.uk.ur.uz.ve.vi.vo.wa.wo.xh.yi.yo.za.zh.zu");
    }

    @Test
    public void test15399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15399");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\u4e2d\u6587\u4e2d\u56fd)", "anglais");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "", 16, 93);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test15400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15400");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("aaaaaaadnu", "EnglHI!STRING[]STRING[]SsHI!STRING[]STRING[]SEnglHI!STRING[]STRING[]SsHI!STRING[]STRING[]SEnglHI!STRING[]STRING[]SsHI!STRING[]STRING[]SEnglHI!STRING[]STRING[]SsHI!STRING[]STRING[]SEnglHI!STRING[]STRING[]SsHI!STRING[]STRING[]SEnglHI!STRING[]STRING[]SsHI!STRING[]STRING[]SEnglHI!STRING[]STRING[]SsHI!STRING[]STRING[]SEnglHI!STRING[]STRING[]SsHI!STRING[]STRING[]SEnglHI!STRING[]STRING[]SsHI!STRING[]STRING[]SEnglHI!STRING[]STRING[]SsHI!STRING[]STRING[]S");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test15401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15401");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("CINACI", "\ud504\ub791\uc2a4\uc5b4", "Engls");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CINACI" + "'", str3, "CINACI");
    }

    @Test
    public void test15402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15402");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "redliuB.elacoL                            ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test15403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15403");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)Character");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)Character" + "'", str1, "CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)Character");
    }

    @Test
    public void test15404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15404");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("444444444][gnirts4444444444", "   CINESE       CINESE       CINESE       CINESE       CINESE       CINESE       CINESE       CGNE");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444][gnirts4444444444" + "'", str2, "444444444][gnirts4444444444");
    }

    @Test
    public void test15405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15405");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith(" a", "rglAsA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test15406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15406");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("italiahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIital...xxxxx");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "italiahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIital...xxxxx" + "'", str1, "italiahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIital...xxxxx");
    }

    @Test
    public void test15407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15407");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("esesenichz", "zh_C", (-1));
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!", "                 a                  ");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEach("ita", strArray5, strArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.endsWithAny("               c                ", strArray8);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray8);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ita" + "'", str9, "ita");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test15408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15408");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("hi");
        java.lang.Object[] objArray2 = languageRangeList1.toArray();
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream3 = languageRangeList1.parallelStream();
        java.util.Locale.LanguageRange[] languageRangeArray4 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList5 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList5, languageRangeArray4);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap7 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList8 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList5, strMap7);
        java.util.Locale.LanguageRange[] languageRangeArray9 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList10 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList10, languageRangeArray9);
        boolean boolean12 = languageRangeList5.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList10);
        java.util.Locale.LanguageRange[] languageRangeArray13 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList14 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList14, languageRangeArray13);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap16 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList17 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList14, strMap16);
        java.util.Locale.LanguageRange[] languageRangeArray18 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList19 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList19, languageRangeArray18);
        boolean boolean21 = languageRangeList14.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList19);
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList19, "hi!");
        boolean boolean24 = languageRangeList5.remove((java.lang.Object) languageRangeList19);
        boolean boolean25 = languageRangeList1.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList19);
        java.util.Locale.LanguageRange languageRange27 = new java.util.Locale.LanguageRange("cn");
        boolean boolean28 = languageRangeList1.add(languageRange27);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream29 = languageRangeList1.stream();
        java.lang.Object obj30 = null;
        boolean boolean31 = languageRangeList1.contains(obj30);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor32 = languageRangeList1.listIterator();
        java.util.Spliterator<java.util.Locale.LanguageRange> languageRangeSpliterator33 = languageRangeList1.spliterator();
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(languageRangeStream3);
        org.junit.Assert.assertNotNull(languageRangeArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(languageRangeList8);
        org.junit.Assert.assertNotNull(languageRangeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(languageRangeArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(languageRangeList17);
        org.junit.Assert.assertNotNull(languageRangeArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(languageRangeStream29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(languageRangeItor32);
        org.junit.Assert.assertNotNull(languageRangeSpliterator33);
    }

    @Test
    public void test15409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15409");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("it", strMap1);
        java.util.Locale locale3 = java.util.Locale.getDefault();
        int int4 = languageRangeList2.lastIndexOf((java.lang.Object) locale3);
        java.util.Locale.LanguageRange[] languageRangeArray5 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList6 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList6, languageRangeArray5);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap8 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList9 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList6, strMap8);
        java.util.Locale.LanguageRange[] languageRangeArray10 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList11 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList11, languageRangeArray10);
        boolean boolean13 = languageRangeList6.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList11);
        java.util.Locale.LanguageRange[] languageRangeArray14 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList15 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList15, languageRangeArray14);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap17 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList18 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList15, strMap17);
        java.util.Locale.LanguageRange[] languageRangeArray19 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList20 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList20, languageRangeArray19);
        boolean boolean22 = languageRangeList15.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList20);
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList20, "hi!");
        boolean boolean25 = languageRangeList6.remove((java.lang.Object) languageRangeList20);
        boolean boolean26 = languageRangeList2.containsAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList6);
        java.util.Collection<java.util.Locale> localeCollection27 = null;
        java.util.List<java.util.Locale> localeList28 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList6, localeCollection27);
        java.util.Locale.LanguageRange languageRange30 = new java.util.Locale.LanguageRange("English");
        java.lang.String str32 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) languageRange30, "");
        java.util.Locale.LanguageRange languageRange34 = new java.util.Locale.LanguageRange("a");
        java.util.Locale.LanguageRange languageRange36 = new java.util.Locale.LanguageRange("a");
        java.util.Locale.LanguageRange[] languageRangeArray37 = new java.util.Locale.LanguageRange[] { languageRange30, languageRange34, languageRange36 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList38 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList38, languageRangeArray37);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor40 = languageRangeList38.listIterator();
        java.util.Spliterator<java.util.Locale.LanguageRange> languageRangeSpliterator41 = languageRangeList38.spliterator();
        boolean boolean42 = languageRangeList6.retainAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList38);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap43 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList44 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList6, strMap43);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap45 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList46 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList6, strMap45);
        java.util.Locale.LanguageRange languageRange49 = new java.util.Locale.LanguageRange("English");
        java.lang.String str50 = languageRange49.getRange();
        java.util.Locale.LanguageRange[] languageRangeArray51 = new java.util.Locale.LanguageRange[] { languageRange49 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList52 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList52, languageRangeArray51);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList55 = java.util.Locale.LanguageRange.parse("hi");
        boolean boolean57 = languageRangeList55.remove((java.lang.Object) "English");
        java.util.Locale.LanguageRange[] languageRangeArray58 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList59 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList59, languageRangeArray58);
        java.util.Locale locale62 = java.util.Locale.FRANCE;
        java.lang.String str63 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale62);
        java.util.Locale locale64 = java.util.Locale.US;
        java.util.Locale locale65 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale66 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale67 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale68 = java.util.Locale.getDefault();
        java.lang.String str69 = locale67.getDisplayCountry(locale68);
        java.lang.String str70 = locale67.toLanguageTag();
        java.util.Locale locale71 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale72 = java.util.Locale.getDefault();
        java.lang.String str73 = locale71.getDisplayCountry(locale72);
        java.util.Locale locale74 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale75 = java.util.Locale.getDefault();
        java.lang.String str76 = locale74.getDisplayCountry(locale75);
        java.util.Locale locale80 = new java.util.Locale("hi", "hi!", "cHINA");
        java.util.Locale locale81 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale82 = java.util.Locale.getDefault();
        java.lang.String str83 = locale81.getDisplayCountry(locale82);
        java.util.Locale locale85 = new java.util.Locale("");
        java.lang.String str86 = locale85.getDisplayVariant();
        java.util.Locale locale87 = java.util.Locale.KOREAN;
        java.util.Locale locale89 = new java.util.Locale("");
        java.util.Locale locale90 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale[] localeArray91 = new java.util.Locale[] { locale62, locale64, locale65, locale66, locale67, locale72, locale74, locale80, locale82, locale85, locale87, locale89, locale90 };
        java.util.ArrayList<java.util.Locale> localeList92 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean93 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList92, localeArray91);
        java.util.List<java.util.Locale> localeList94 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList59, (java.util.Collection<java.util.Locale>) localeList92);
        java.util.List<java.util.Locale> localeList95 = java.util.Locale.filter(languageRangeList55, (java.util.Collection<java.util.Locale>) localeList92);
        java.util.Locale locale96 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList52, (java.util.Collection<java.util.Locale>) localeList95);
        java.util.Locale.LanguageRange languageRange98 = languageRangeList52.remove((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            languageRangeList6.add((int) ' ', languageRange98);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(languageRangeArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(languageRangeList9);
        org.junit.Assert.assertNotNull(languageRangeArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(languageRangeArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(languageRangeList18);
        org.junit.Assert.assertNotNull(languageRangeArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(localeList28);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Locale.LanguageRange" + "'", str32, "Locale.LanguageRange");
        org.junit.Assert.assertNotNull(languageRangeArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(languageRangeItor40);
        org.junit.Assert.assertNotNull(languageRangeSpliterator41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(languageRangeList44);
        org.junit.Assert.assertNotNull(languageRangeList46);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "english" + "'", str50, "english");
        org.junit.Assert.assertNotNull(languageRangeArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(languageRangeList55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(languageRangeArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(locale62);
        org.junit.Assert.assertEquals(locale62.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "english" + "'", str63, "english");
        org.junit.Assert.assertNotNull(locale64);
        org.junit.Assert.assertEquals(locale64.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale65);
        org.junit.Assert.assertEquals(locale65.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale66);
        org.junit.Assert.assertEquals(locale66.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale67);
        org.junit.Assert.assertEquals(locale67.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale68);
        org.junit.Assert.assertEquals(locale68.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "\u4e2d\u56fd" + "'", str69, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "zh-CN" + "'", str70, "zh-CN");
        org.junit.Assert.assertNotNull(locale71);
        org.junit.Assert.assertEquals(locale71.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale72);
        org.junit.Assert.assertEquals(locale72.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "\u4e2d\u56fd" + "'", str73, "\u4e2d\u56fd");
        org.junit.Assert.assertNotNull(locale74);
        org.junit.Assert.assertEquals(locale74.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale75);
        org.junit.Assert.assertEquals(locale75.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "\u4e2d\u56fd" + "'", str76, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals(locale80.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale81);
        org.junit.Assert.assertEquals(locale81.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale82);
        org.junit.Assert.assertEquals(locale82.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "\u4e2d\u56fd" + "'", str83, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals(locale85.toString(), "");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "" + "'", str86, "");
        org.junit.Assert.assertNotNull(locale87);
        org.junit.Assert.assertEquals(locale87.toString(), "ko");
        org.junit.Assert.assertEquals(locale89.toString(), "");
        org.junit.Assert.assertNotNull(locale90);
        org.junit.Assert.assertEquals(locale90.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray91);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertNotNull(localeList94);
        org.junit.Assert.assertNotNull(localeList95);
        org.junit.Assert.assertNull(locale96);
        org.junit.Assert.assertNotNull(languageRange98);
    }

    @Test
    public void test15410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15410");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test15411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15411");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "UNDAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UNDAAAAAAA" + "'", str1, "UNDAAAAAAA");
    }

    @Test
    public void test15412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15412");
        java.util.Locale locale2 = new java.util.Locale("hi-china", "rance)");
        org.junit.Assert.assertEquals(locale2.toString(), "hi-china_RANCE)");
    }

    @Test
    public void test15413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15413");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("aaaaaaadnu", "CHINOIS (CHINE)4444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      ", "ITALIAHi");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test15414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15414");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aI", "frfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfr");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test15415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15415");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("slgnEslgnEslgnEfran\347ais (Canada)slgnEslgnEslgnEs", 21, "\u4e2d\u56fdAD.AE.AF.A         ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "slgnEslgnEslgnEfran\347ais (Canada)slgnEslgnEslgnEs" + "'", str3, "slgnEslgnEslgnEfran\347ais (Canada)slgnEslgnEslgnEs");
    }

    @Test
    public void test15416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15416");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("class java.lang.string");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test15417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15417");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("\u53f0\u7063                             ", 649);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test15418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15418");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("AD.AE.AF.AGchnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.AT.AU.AW.AX.AZ.BA.BB.BD.BE.BF.BG.BH.BI.BJ.BL.BM.BN.BO.BQ.BR.BS.BT.BV.BW.BY.BZ.CA.CC.CD.CF.CG.CH.CI.CK.CL.CM.CN.CO.CR.CU.CV.CW.CX.CY.CZ.DE.DJ.DK.DM.DO.DZ.EC.EE.EG.EH.ER.ES.ET.FI.FJ.FK.FM.FO.FR.GA.GB.GD.GE.GF.GG.GH.GI.GL.GM.GN.GP.GQ.GR.GS.GT.GU.GW.GY.HK.HM.HN.HR.HT.HU.ID.IE.IL.IM.IN.IO.IQ.IR.IS.IT.JE.JM.JO.JP.KE.KG.KH.KI.KM.KN.KP.KR.KW.KY.KZ.LA.LB.LC.LI.LK.LR.LS.LT.LU.LV.LY.MA.MC.MD.ME.MF.MG.MH.MK.ML.MM.MN.MO.MP.MQ.MR.MS.MT.MU.MV.MW.MX.MY.MZ.NA.NC.NE.NF.NG.NI.NL.NO.NP.NR.NU.NZ.OM.PA.PE.PF.PG.PH.PK.PL.PM.PN.PR.PS.PT.PW.PY.QA.RE.RO.RS.RU.RW.SA.SB.SC.SD.SE.SG.SH.SI.SJ.SK.SL.SM.SN.SO.SR.SS.ST.SV.SX.SY.SZ.TC.TD.TF.TG.TH.TJ.TK.TL.TM.TN.TO.TR.TT.TV.TW.TZ.UA.UG.UM.US.UY.UZ.VA.VC.VE.VG.VI.VN.VU.WF.WS.YE.YT.ZA.ZM.ZW", "aaabaeafakamanarasavayazbabebgbhbibmbnbobrbscacechcocrcscucvcydadedvdzeeeleneoeseteufafffifjfofrfygagdglgngugvhahehihohrhthuhyhziaidieigiiikinioisitiuiwjajijvkakgkikjkkklkmknkokrkskukvkwkylalblglilnloltlulvmgmhmimkmlmnmomrmsmtmynanbndnengnlnnnonrnvnyocojomorospapiplpsptqurmrnrorurwsascsdsesgsiskslsmsnsosqsrssstsusvswtatetgthtitktltntotrtstttwtyugukuruzvevivowawoxhyiyozazhzu");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test15419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15419");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("en-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CA", 747);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "en-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CA                                                                                                                                                                                                                                                                 " + "'", str2, "en-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CA                                                                                                                                                                                                                                                                 ");
    }

    @Test
    public void test15420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15420");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap3);
        java.lang.String[] strArray12 = new java.lang.String[] { "English", "hi", "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "", "a", "", "China" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        java.util.List<java.lang.Class<?>> wildcardClassList15 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList13);
        java.lang.String str16 = java.util.Locale.lookupTag(languageRangeList4, (java.util.Collection<java.lang.String>) strList13);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList18 = java.util.Locale.LanguageRange.parse("hi");
        boolean boolean20 = languageRangeList18.remove((java.lang.Object) "English");
        java.util.Locale.LanguageRange[] languageRangeArray21 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList22 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList22, languageRangeArray21);
        java.util.Locale locale25 = java.util.Locale.FRANCE;
        java.lang.String str26 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale25);
        java.util.Locale locale27 = java.util.Locale.US;
        java.util.Locale locale28 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale29 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale30 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale31 = java.util.Locale.getDefault();
        java.lang.String str32 = locale30.getDisplayCountry(locale31);
        java.lang.String str33 = locale30.toLanguageTag();
        java.util.Locale locale34 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale35 = java.util.Locale.getDefault();
        java.lang.String str36 = locale34.getDisplayCountry(locale35);
        java.util.Locale locale37 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale38 = java.util.Locale.getDefault();
        java.lang.String str39 = locale37.getDisplayCountry(locale38);
        java.util.Locale locale43 = new java.util.Locale("hi", "hi!", "cHINA");
        java.util.Locale locale44 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale45 = java.util.Locale.getDefault();
        java.lang.String str46 = locale44.getDisplayCountry(locale45);
        java.util.Locale locale48 = new java.util.Locale("");
        java.lang.String str49 = locale48.getDisplayVariant();
        java.util.Locale locale50 = java.util.Locale.KOREAN;
        java.util.Locale locale52 = new java.util.Locale("");
        java.util.Locale locale53 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale[] localeArray54 = new java.util.Locale[] { locale25, locale27, locale28, locale29, locale30, locale35, locale37, locale43, locale45, locale48, locale50, locale52, locale53 };
        java.util.ArrayList<java.util.Locale> localeList55 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList55, localeArray54);
        java.util.List<java.util.Locale> localeList57 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList22, (java.util.Collection<java.util.Locale>) localeList55);
        java.util.List<java.util.Locale> localeList58 = java.util.Locale.filter(languageRangeList18, (java.util.Collection<java.util.Locale>) localeList55);
        java.util.List<java.util.Locale> localeList59 = java.util.Locale.filter(languageRangeList4, (java.util.Collection<java.util.Locale>) localeList58);
        java.util.Locale.LanguageRange[] languageRangeArray60 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList61 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList61, languageRangeArray60);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap63 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList64 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList61, strMap63);
        java.util.Spliterator<java.util.Locale.LanguageRange> languageRangeSpliterator65 = languageRangeList61.spliterator();
        languageRangeList61.clear();
        boolean boolean67 = languageRangeList4.retainAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList61);
        java.util.Iterator<java.util.Locale.LanguageRange> languageRangeItor68 = languageRangeList61.iterator();
        java.util.Iterator<java.util.Locale.LanguageRange> languageRangeItor69 = languageRangeList61.iterator();
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClassList15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(languageRangeList18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(languageRangeArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "english" + "'", str26, "english");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale31);
// flaky:         org.junit.Assert.assertEquals(locale31.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Cina" + "'", str32, "Cina");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "zh-CN" + "'", str33, "zh-CN");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale35);
// flaky:         org.junit.Assert.assertEquals(locale35.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Cina" + "'", str36, "Cina");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale38);
// flaky:         org.junit.Assert.assertEquals(locale38.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Cina" + "'", str39, "Cina");
        org.junit.Assert.assertEquals(locale43.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale45);
// flaky:         org.junit.Assert.assertEquals(locale45.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Cina" + "'", str46, "Cina");
        org.junit.Assert.assertEquals(locale48.toString(), "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "ko");
        org.junit.Assert.assertEquals(locale52.toString(), "");
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(localeList57);
        org.junit.Assert.assertNotNull(localeList58);
        org.junit.Assert.assertNotNull(localeList59);
        org.junit.Assert.assertNotNull(languageRangeArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(languageRangeList64);
        org.junit.Assert.assertNotNull(languageRangeSpliterator65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(languageRangeItor68);
        org.junit.Assert.assertNotNull(languageRangeItor69);
    }

    @Test
    public void test15421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15421");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("CINESE");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap2 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList3 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList1, strMap2);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList5 = java.util.Locale.LanguageRange.parse("hi");
        java.lang.Object[] objArray6 = languageRangeList5.toArray();
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream7 = languageRangeList5.parallelStream();
        java.util.Locale.LanguageRange[] languageRangeArray8 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList9 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList9, languageRangeArray8);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap11 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList12 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList9, strMap11);
        java.util.Locale.LanguageRange[] languageRangeArray13 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList14 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList14, languageRangeArray13);
        boolean boolean16 = languageRangeList9.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList14);
        java.util.Locale.LanguageRange[] languageRangeArray17 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList18 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList18, languageRangeArray17);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap20 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList21 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList18, strMap20);
        java.util.Locale.LanguageRange[] languageRangeArray22 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList23 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList23, languageRangeArray22);
        boolean boolean25 = languageRangeList18.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList23);
        java.lang.String str27 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList23, "hi!");
        boolean boolean28 = languageRangeList9.remove((java.lang.Object) languageRangeList23);
        boolean boolean29 = languageRangeList5.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList23);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream30 = languageRangeList23.stream();
        java.lang.String str32 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList23, 'x');
        boolean boolean33 = languageRangeList1.retainAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList23);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream34 = languageRangeList1.parallelStream();
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(languageRangeList3);
        org.junit.Assert.assertNotNull(languageRangeList5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(languageRangeStream7);
        org.junit.Assert.assertNotNull(languageRangeArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(languageRangeList12);
        org.junit.Assert.assertNotNull(languageRangeArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(languageRangeArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(languageRangeList21);
        org.junit.Assert.assertNotNull(languageRangeArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(languageRangeStream30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(languageRangeStream34);
    }

    @Test
    public void test15422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15422");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("                           java.uil");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                           java.uil" + "'", str1, "                           java.uil");
    }

    @Test
    public void test15423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15423");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("hi");
        java.lang.Object[] objArray2 = languageRangeList1.toArray();
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.parse("hi");
        java.lang.Object[] objArray5 = languageRangeList4.toArray();
        java.util.Spliterator<java.util.Locale.LanguageRange> languageRangeSpliterator6 = languageRangeList4.spliterator();
        boolean boolean7 = languageRangeList1.containsAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList4);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList9 = java.util.Locale.LanguageRange.parse("hi");
        java.lang.Object[] objArray10 = languageRangeList9.toArray();
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream11 = languageRangeList9.parallelStream();
        java.util.Locale.LanguageRange[] languageRangeArray12 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList13 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList13, languageRangeArray12);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap15 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList16 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList13, strMap15);
        java.util.Locale.LanguageRange[] languageRangeArray17 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList18 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList18, languageRangeArray17);
        boolean boolean20 = languageRangeList13.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList18);
        java.util.Locale.LanguageRange[] languageRangeArray21 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList22 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList22, languageRangeArray21);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap24 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList25 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList22, strMap24);
        java.util.Locale.LanguageRange[] languageRangeArray26 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList27 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList27, languageRangeArray26);
        boolean boolean29 = languageRangeList22.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList27);
        java.lang.String str31 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList27, "hi!");
        boolean boolean32 = languageRangeList13.remove((java.lang.Object) languageRangeList27);
        boolean boolean33 = languageRangeList9.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList27);
        java.util.Locale.LanguageRange languageRange35 = new java.util.Locale.LanguageRange("cn");
        boolean boolean36 = languageRangeList9.add(languageRange35);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream37 = languageRangeList9.stream();
        boolean boolean39 = languageRangeList9.contains((java.lang.Object) "\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587          ");
        boolean boolean40 = languageRangeList4.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList9);
        java.util.Locale.LanguageRange[] languageRangeArray41 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList42 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList42, languageRangeArray41);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap44 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList45 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList42, strMap44);
        java.lang.String[] strArray53 = new java.lang.String[] { "English", "hi", "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "", "a", "", "China" };
        java.util.ArrayList<java.lang.String> strList54 = new java.util.ArrayList<java.lang.String>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList54, strArray53);
        java.util.List<java.lang.Class<?>> wildcardClassList56 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList54);
        java.lang.String str57 = java.util.Locale.lookupTag(languageRangeList45, (java.util.Collection<java.lang.String>) strList54);
        java.util.Locale.LanguageRange[] languageRangeArray58 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList59 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList59, languageRangeArray58);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap61 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList62 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList59, strMap61);
        java.util.Locale.LanguageRange[] languageRangeArray63 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList64 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList64, languageRangeArray63);
        boolean boolean66 = languageRangeList59.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList64);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream67 = languageRangeList64.stream();
        boolean boolean68 = languageRangeList45.containsAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList64);
        java.util.Locale.LanguageRange languageRange71 = new java.util.Locale.LanguageRange("English");
        java.lang.String str73 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) languageRange71, "");
        languageRangeList64.add((int) (byte) 0, languageRange71);
        double double75 = languageRange71.getWeight();
        boolean boolean76 = languageRangeList9.add(languageRange71);
        java.util.Iterator<java.util.Locale.LanguageRange> languageRangeItor77 = languageRangeList9.iterator();
        java.util.Locale locale79 = new java.util.Locale("");
        java.util.Set<java.lang.String> strSet80 = locale79.getUnicodeLocaleKeys();
        java.lang.String str81 = java.util.Locale.lookupTag(languageRangeList9, (java.util.Collection<java.lang.String>) strSet80);
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(languageRangeSpliterator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(languageRangeList9);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(languageRangeStream11);
        org.junit.Assert.assertNotNull(languageRangeArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(languageRangeList16);
        org.junit.Assert.assertNotNull(languageRangeArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(languageRangeArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(languageRangeList25);
        org.junit.Assert.assertNotNull(languageRangeArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(languageRangeStream37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(languageRangeArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(languageRangeList45);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(wildcardClassList56);
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertNotNull(languageRangeArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(languageRangeList62);
        org.junit.Assert.assertNotNull(languageRangeArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(languageRangeStream67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "Locale.LanguageRange" + "'", str73, "Locale.LanguageRange");
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 1.0d + "'", double75 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNotNull(languageRangeItor77);
        org.junit.Assert.assertEquals(locale79.toString(), "");
        org.junit.Assert.assertNotNull(strSet80);
        org.junit.Assert.assertNull(str81);
    }

    @Test
    public void test15424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15424");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.ENGLISH;
        java.util.Locale.setDefault(category0, locale1);
        java.util.Locale locale3 = java.util.Locale.JAPANESE;
        java.util.Locale locale5 = java.util.Locale.TAIWAN;
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.upperCase("", locale5);
        java.lang.String str7 = locale3.getDisplayVariant(locale5);
        java.util.Locale.setDefault(category0, locale5);
        java.util.Locale locale9 = java.util.Locale.JAPANESE;
        java.util.Locale locale11 = new java.util.Locale("");
        java.lang.String str12 = locale11.getDisplayLanguage();
        java.util.Locale locale13 = java.util.Locale.CANADA;
        java.lang.String str14 = locale13.getDisplayLanguage();
        java.lang.String str15 = locale11.getDisplayScript(locale13);
        java.lang.String str16 = locale13.getDisplayVariant();
        java.util.Locale locale17 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale18 = java.util.Locale.getDefault();
        java.lang.String str19 = locale17.getDisplayCountry(locale18);
        java.lang.String str20 = locale18.getDisplayVariant();
        java.lang.String str21 = locale13.getDisplayScript(locale18);
        java.lang.String str22 = locale13.getScript();
        java.lang.String str23 = locale9.getDisplayVariant(locale13);
        java.util.Locale locale24 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str25 = locale24.getDisplayLanguage();
        java.util.Locale locale26 = java.util.Locale.getDefault();
        java.lang.String str27 = locale24.getDisplayCountry(locale26);
        java.util.Locale locale28 = java.util.Locale.TAIWAN;
        java.lang.String str29 = locale28.getVariant();
        java.lang.String str30 = locale24.getDisplayName(locale28);
        java.util.Locale locale31 = locale24.stripExtensions();
        java.lang.String str32 = locale9.getDisplayName(locale31);
        java.util.Locale.setDefault(category0, locale9);
        java.util.Locale locale35 = java.util.Locale.forLanguageTag("FR");
        java.util.Locale.setDefault(category0, locale35);
        java.util.Locale locale39 = new java.util.Locale("");
        java.lang.String str40 = locale39.getDisplayLanguage();
        java.util.Locale locale41 = java.util.Locale.CANADA;
        java.lang.String str42 = locale41.getDisplayLanguage();
        java.lang.String str43 = locale39.getDisplayScript(locale41);
        java.lang.String str44 = org.apache.commons.lang3.StringUtils.lowerCase("a", locale39);
        java.lang.String str45 = locale39.getDisplayScript();
        java.util.Set<java.lang.String> strSet46 = locale39.getUnicodeLocaleAttributes();
        java.util.Locale locale47 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale48 = java.util.Locale.getDefault();
        java.lang.String str49 = locale47.getDisplayCountry(locale48);
        java.lang.String str50 = locale47.toLanguageTag();
        java.lang.String str51 = locale47.getLanguage();
        java.util.Locale locale52 = java.util.Locale.ITALIAN;
        java.util.Locale locale54 = new java.util.Locale("");
        java.lang.String str55 = locale54.getDisplayLanguage();
        java.util.Locale locale56 = java.util.Locale.CANADA;
        java.lang.String str57 = locale56.getDisplayLanguage();
        java.lang.String str58 = locale54.getDisplayScript(locale56);
        java.util.Locale locale60 = java.util.Locale.FRANCE;
        java.lang.String str61 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale60);
        java.lang.String str62 = locale54.getDisplayCountry(locale60);
        java.lang.String str63 = locale52.getDisplayScript(locale54);
        java.util.Locale locale64 = java.util.Locale.GERMAN;
        java.lang.String str65 = locale54.getDisplayLanguage(locale64);
        java.lang.String str66 = locale47.getDisplayCountry(locale54);
        java.util.Locale locale67 = locale47.stripExtensions();
        java.lang.String str68 = locale39.getDisplayVariant(locale67);
        java.util.Locale.setDefault(locale39);
        java.util.Locale.setDefault(category0, locale39);
        java.util.Locale locale71 = java.util.Locale.getDefault(category0);
        java.util.Locale.Builder builder73 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder74 = builder73.clearExtensions();
        java.util.Locale.Builder builder76 = builder74.setLanguageTag("zh-CN");
        java.util.Locale.Builder builder78 = builder76.setLanguage("CHINA");
        java.util.Locale locale79 = builder76.build();
        java.util.Set<java.lang.String> strSet80 = locale79.getUnicodeLocaleKeys();
        java.lang.String str81 = org.apache.commons.lang3.StringUtils.lowerCase("Zxxxxxxxxxxxxxxxxxxx", locale79);
        java.lang.String str82 = locale79.getDisplayLanguage();
        java.util.Locale.setDefault(category0, locale79);
        java.lang.String str84 = locale79.getDisplayName();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ja");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "ja");
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\u82f1\u6587" + "'", str14, "\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale18);
// flaky:         org.junit.Assert.assertEquals(locale18.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Cina" + "'", str19, "Cina");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\u4e2d\u6587" + "'", str25, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(locale26);
// flaky:         org.junit.Assert.assertEquals(locale26.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Taiwan" + "'", str27, "Taiwan");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
// flaky:         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "\u4e2d\u6587\u53f0\u7063)" + "'", str30, "\u4e2d\u6587\u53f0\u7063)");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\u65e5\u6587" + "'", str32, "\u65e5\u6587");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "fr");
        org.junit.Assert.assertEquals(locale39.toString(), "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "anglais" + "'", str42, "anglais");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "a" + "'", str44, "a");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(strSet46);
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale48);
// flaky:         org.junit.Assert.assertEquals(locale48.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Cina" + "'", str49, "Cina");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "zh-CN" + "'", str50, "zh-CN");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "zh" + "'", str51, "zh");
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "it");
        org.junit.Assert.assertEquals(locale54.toString(), "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertNotNull(locale56);
        org.junit.Assert.assertEquals(locale56.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "anglais" + "'", str57, "anglais");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertNotNull(locale60);
        org.junit.Assert.assertEquals(locale60.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "english" + "'", str61, "english");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertNotNull(locale64);
        org.junit.Assert.assertEquals(locale64.toString(), "de");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "China" + "'", str66, "China");
        org.junit.Assert.assertNotNull(locale67);
        org.junit.Assert.assertEquals(locale67.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertNotNull(locale71);
        org.junit.Assert.assertEquals(locale71.toString(), "");
        org.junit.Assert.assertNotNull(builder74);
        org.junit.Assert.assertNotNull(builder76);
        org.junit.Assert.assertNotNull(builder78);
        org.junit.Assert.assertNotNull(locale79);
        org.junit.Assert.assertEquals(locale79.toString(), "china_CN");
        org.junit.Assert.assertNotNull(strSet80);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "zxxxxxxxxxxxxxxxxxxx" + "'", str81, "zxxxxxxxxxxxxxxxxxxx");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "china" + "'", str82, "china");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "china (China)" + "'", str84, "china (China)");
    }

    @Test
    public void test15425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15425");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = org.apache.commons.lang3.ClassUtils.getClass("JaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJc");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: JaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJc");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test15426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15426");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("jpn", ".......................HI.......................");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jpn" + "'", str2, "jpn");
    }

    @Test
    public void test15427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15427");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("en_", "YT.ZA.ZM.Z");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test15428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15428");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuchina (Chine)", "!HI!HI!HI!HI!HI!HENGLISH");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test15429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15429");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("cina", (int) '#', "languagerange");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "languagerangelacinalanguagerangelan" + "'", str3, "languagerangelacinalanguagerangelan");
    }

    @Test
    public void test15430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15430");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("HI!HI!HI!HI!HI!HI");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = locale1.getUnicodeLocaleType("elacoL");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: elacoL");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test15431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15431");
        java.util.Locale locale1 = java.util.Locale.CHINA;
        java.util.Set<java.lang.Character> charSet2 = locale1.getExtensionKeys();
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.upperCase("", locale1);
        java.lang.String str4 = locale1.getDisplayCountry();
        java.lang.String str5 = locale1.getDisplayName();
        java.util.Set<java.lang.Character> charSet6 = locale1.getExtensionKeys();
        java.lang.String str7 = locale1.getCountry();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(charSet2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Cina" + "'", str4, "Cina");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "cinese (Cina)" + "'", str5, "cinese (Cina)");
        org.junit.Assert.assertNotNull(charSet6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CN" + "'", str7, "CN");
    }

    @Test
    public void test15432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15432");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("          xxxxxxx", "  cn    United Kingdom  cn    United Kingdom  cn    United Kingdom  cn    United Kingdom  cn    United Kingdom  cn    United Kingdom  cn    United Kingdom  cn    United Kingdom  cn    United Kingdom  cn    United Kingdom  cn    United Kingdom  cn    United Kingdom  cn    United Kingdom  cn    United Kingdom  cn    United Kingdom  cn    United Kingdom  cn    United Kingdom  cn    United Kingdom  cn    United Kingdom  cn    United Kingdom  cn    United Kingdom  cn    United Kingdom  cn    United Kingdom  cn    United Kingdom  cn    United Kingdom  cn    United Kingdom  cn    United Kingdom  cn    United Kingdom  cn    United Kingdom  cn    United Kingdom  cn    United Kingdom  cn    United Kingdom  cn    United Kingdom  cn    United Kingdom  cn    ", "444444444444444444444444444444444");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test15433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15433");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("hi");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList3 = java.util.Locale.LanguageRange.parse("hi");
        boolean boolean5 = languageRangeList3.remove((java.lang.Object) "English");
        boolean boolean6 = languageRangeList1.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList3);
        java.util.Locale.LanguageRange[] languageRangeArray8 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList9 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList9, languageRangeArray8);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap11 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList12 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList9, strMap11);
        java.lang.String[] strArray20 = new java.lang.String[] { "English", "hi", "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "", "a", "", "China" };
        java.util.ArrayList<java.lang.String> strList21 = new java.util.ArrayList<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList21, strArray20);
        java.util.List<java.lang.Class<?>> wildcardClassList23 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList21);
        java.lang.String str24 = java.util.Locale.lookupTag(languageRangeList12, (java.util.Collection<java.lang.String>) strList21);
        java.util.Locale.LanguageRange[] languageRangeArray25 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList26 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList26, languageRangeArray25);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap28 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList29 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList26, strMap28);
        java.util.Locale.LanguageRange[] languageRangeArray30 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList31 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList31, languageRangeArray30);
        boolean boolean33 = languageRangeList26.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList31);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream34 = languageRangeList31.stream();
        boolean boolean35 = languageRangeList12.containsAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList31);
        java.util.Locale.LanguageRange[] languageRangeArray36 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList37 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList37, languageRangeArray36);
        java.util.Locale locale40 = java.util.Locale.FRANCE;
        java.lang.String str41 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale40);
        java.util.Locale locale42 = java.util.Locale.US;
        java.util.Locale locale43 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale44 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale45 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale46 = java.util.Locale.getDefault();
        java.lang.String str47 = locale45.getDisplayCountry(locale46);
        java.lang.String str48 = locale45.toLanguageTag();
        java.util.Locale locale49 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale50 = java.util.Locale.getDefault();
        java.lang.String str51 = locale49.getDisplayCountry(locale50);
        java.util.Locale locale52 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale53 = java.util.Locale.getDefault();
        java.lang.String str54 = locale52.getDisplayCountry(locale53);
        java.util.Locale locale58 = new java.util.Locale("hi", "hi!", "cHINA");
        java.util.Locale locale59 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale60 = java.util.Locale.getDefault();
        java.lang.String str61 = locale59.getDisplayCountry(locale60);
        java.util.Locale locale63 = new java.util.Locale("");
        java.lang.String str64 = locale63.getDisplayVariant();
        java.util.Locale locale65 = java.util.Locale.KOREAN;
        java.util.Locale locale67 = new java.util.Locale("");
        java.util.Locale locale68 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale[] localeArray69 = new java.util.Locale[] { locale40, locale42, locale43, locale44, locale45, locale50, locale52, locale58, locale60, locale63, locale65, locale67, locale68 };
        java.util.ArrayList<java.util.Locale> localeList70 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList70, localeArray69);
        java.util.List<java.util.Locale> localeList72 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList37, (java.util.Collection<java.util.Locale>) localeList70);
        java.lang.String[] strArray80 = new java.lang.String[] { "English", "hi", "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "", "a", "", "China" };
        java.util.ArrayList<java.lang.String> strList81 = new java.util.ArrayList<java.lang.String>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList81, strArray80);
        java.util.List<java.lang.Class<?>> wildcardClassList83 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList81);
        java.util.Locale.FilteringMode filteringMode84 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList85 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList37, (java.util.Collection<java.lang.String>) strList81, filteringMode84);
        java.util.Spliterator<java.util.Locale.LanguageRange> languageRangeSpliterator86 = languageRangeList37.spliterator();
        java.lang.String str88 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) languageRangeList37, "Locale.LanguageRange");
        boolean boolean89 = languageRangeList31.containsAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList37);
        java.util.Locale.LanguageRange languageRange91 = new java.util.Locale.LanguageRange("English");
        java.lang.String str92 = languageRange91.getRange();
        boolean boolean93 = languageRangeList31.add(languageRange91);
        java.lang.String str94 = languageRange91.getRange();
        languageRangeList1.add(0, languageRange91);
        java.util.Iterator<java.util.Locale.LanguageRange> languageRangeItor96 = languageRangeList1.iterator();
        java.lang.String str98 = org.apache.commons.lang3.StringUtils.join(languageRangeItor96, '$');
        languageRangeItor96.remove();
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(languageRangeList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(languageRangeArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(languageRangeList12);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClassList23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(languageRangeArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(languageRangeList29);
        org.junit.Assert.assertNotNull(languageRangeArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(languageRangeStream34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(languageRangeArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "english" + "'", str41, "english");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale46);
// flaky:         org.junit.Assert.assertEquals(locale46.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Cina" + "'", str47, "Cina");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "zh-CN" + "'", str48, "zh-CN");
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale50);
// flaky:         org.junit.Assert.assertEquals(locale50.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Cina" + "'", str51, "Cina");
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale53);
// flaky:         org.junit.Assert.assertEquals(locale53.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str54 + "' != '" + "Cina" + "'", str54, "Cina");
        org.junit.Assert.assertEquals(locale58.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale60);
// flaky:         org.junit.Assert.assertEquals(locale60.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str61 + "' != '" + "Cina" + "'", str61, "Cina");
        org.junit.Assert.assertEquals(locale63.toString(), "");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertNotNull(locale65);
        org.junit.Assert.assertEquals(locale65.toString(), "ko");
        org.junit.Assert.assertEquals(locale67.toString(), "");
        org.junit.Assert.assertNotNull(locale68);
        org.junit.Assert.assertEquals(locale68.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(localeList72);
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertNotNull(wildcardClassList83);
        org.junit.Assert.assertTrue("'" + filteringMode84 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode84.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList85);
        org.junit.Assert.assertNotNull(languageRangeSpliterator86);
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "ArrayList" + "'", str88, "ArrayList");
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "english" + "'", str92, "english");
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "english" + "'", str94, "english");
        org.junit.Assert.assertNotNull(languageRangeItor96);
    }

    @Test
    public void test15434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15434");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("e!e(Tiiwin", "Cina");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test15435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15435");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "GGGGGGGGGGGGGGGGGGGGGGG....XXGLIGGGGGGGGGGGGGGGGGGGGGGG....XXGLIGGGGGGGGGGGGGGGGGGGGGGG....XXGLIGGGGGGGGGGGGGGGGGGGGGGG....XXGLIGGGGGGGGGGGGGGGGGGGGGGG....XXGLIGGGGGGGGGGGGGGGGGGGGGGG....XXGLIGGGGGGGGGGGGGGGGGGGGGGG....XXGLIGGGGGGGGGGGGGGGGGGGGGGG....XXGLIGGGGGGGGGGGGGGGGGGGGGGG....XXGLI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test15436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15436");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("Xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxchn");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test15437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15437");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("itfritl", strMap1);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.parse("hi");
        int int6 = languageRangeList4.indexOf((java.lang.Object) '4');
        java.util.Locale.LanguageRange[] languageRangeArray7 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList8 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList8, languageRangeArray7);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap10 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList11 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList8, strMap10);
        int int12 = languageRangeList8.size();
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor13 = languageRangeList8.listIterator();
        java.util.Locale.LanguageRange languageRange15 = new java.util.Locale.LanguageRange("a");
        java.util.Locale.LanguageRange languageRange17 = new java.util.Locale.LanguageRange("English");
        java.lang.String str19 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) languageRange17, "");
        java.util.Locale.LanguageRange languageRange21 = new java.util.Locale.LanguageRange("English");
        java.util.Locale.LanguageRange[] languageRangeArray22 = new java.util.Locale.LanguageRange[] { languageRange15, languageRange17, languageRange21 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList23 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList23, languageRangeArray22);
        boolean boolean25 = languageRangeList8.retainAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList23);
        java.util.Locale.LanguageRange[] languageRangeArray26 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList27 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList27, languageRangeArray26);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap29 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList30 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList27, strMap29);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor31 = languageRangeList30.listIterator();
        java.lang.String[] strArray33 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList34 = new java.util.ArrayList<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList34, strArray33);
        java.util.Locale.LanguageRange[] languageRangeArray36 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList37 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList37, languageRangeArray36);
        java.util.Locale locale40 = java.util.Locale.FRANCE;
        java.lang.String str41 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale40);
        java.util.Locale locale42 = java.util.Locale.US;
        java.util.Locale locale43 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale44 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale45 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale46 = java.util.Locale.getDefault();
        java.lang.String str47 = locale45.getDisplayCountry(locale46);
        java.lang.String str48 = locale45.toLanguageTag();
        java.util.Locale locale49 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale50 = java.util.Locale.getDefault();
        java.lang.String str51 = locale49.getDisplayCountry(locale50);
        java.util.Locale locale52 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale53 = java.util.Locale.getDefault();
        java.lang.String str54 = locale52.getDisplayCountry(locale53);
        java.util.Locale locale58 = new java.util.Locale("hi", "hi!", "cHINA");
        java.util.Locale locale59 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale60 = java.util.Locale.getDefault();
        java.lang.String str61 = locale59.getDisplayCountry(locale60);
        java.util.Locale locale63 = new java.util.Locale("");
        java.lang.String str64 = locale63.getDisplayVariant();
        java.util.Locale locale65 = java.util.Locale.KOREAN;
        java.util.Locale locale67 = new java.util.Locale("");
        java.util.Locale locale68 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale[] localeArray69 = new java.util.Locale[] { locale40, locale42, locale43, locale44, locale45, locale50, locale52, locale58, locale60, locale63, locale65, locale67, locale68 };
        java.util.ArrayList<java.util.Locale> localeList70 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList70, localeArray69);
        java.util.List<java.util.Locale> localeList72 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList37, (java.util.Collection<java.util.Locale>) localeList70);
        java.lang.String[] strArray80 = new java.lang.String[] { "English", "hi", "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "", "a", "", "China" };
        java.util.ArrayList<java.lang.String> strList81 = new java.util.ArrayList<java.lang.String>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList81, strArray80);
        java.util.List<java.lang.Class<?>> wildcardClassList83 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList81);
        java.util.Locale.FilteringMode filteringMode84 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList85 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList37, (java.util.Collection<java.lang.String>) strList81, filteringMode84);
        java.util.List<java.lang.String> strList86 = java.util.Locale.filterTags(languageRangeList30, (java.util.Collection<java.lang.String>) strList34, filteringMode84);
        boolean boolean87 = languageRangeList8.remove((java.lang.Object) strList86);
        java.util.List<java.lang.String> strList88 = java.util.Locale.filterTags(languageRangeList4, (java.util.Collection<java.lang.String>) strList86);
        java.util.Locale.FilteringMode filteringMode89 = null;
        java.util.List<java.lang.String> strList90 = java.util.Locale.filterTags(languageRangeList2, (java.util.Collection<java.lang.String>) strList86, filteringMode89);
        java.lang.Class<?> wildcardClass91 = strList90.getClass();
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(languageRangeArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(languageRangeList11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(languageRangeItor13);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Locale.LanguageRange" + "'", str19, "Locale.LanguageRange");
        org.junit.Assert.assertNotNull(languageRangeArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(languageRangeArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(languageRangeList30);
        org.junit.Assert.assertNotNull(languageRangeItor31);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(languageRangeArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "english" + "'", str41, "english");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale46);
// flaky:         org.junit.Assert.assertEquals(locale46.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Cina" + "'", str47, "Cina");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "zh-CN" + "'", str48, "zh-CN");
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale50);
// flaky:         org.junit.Assert.assertEquals(locale50.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Cina" + "'", str51, "Cina");
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale53);
// flaky:         org.junit.Assert.assertEquals(locale53.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str54 + "' != '" + "Cina" + "'", str54, "Cina");
        org.junit.Assert.assertEquals(locale58.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale60);
// flaky:         org.junit.Assert.assertEquals(locale60.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str61 + "' != '" + "Cina" + "'", str61, "Cina");
        org.junit.Assert.assertEquals(locale63.toString(), "");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertNotNull(locale65);
        org.junit.Assert.assertEquals(locale65.toString(), "ko");
        org.junit.Assert.assertEquals(locale67.toString(), "");
        org.junit.Assert.assertNotNull(locale68);
        org.junit.Assert.assertEquals(locale68.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(localeList72);
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertNotNull(wildcardClassList83);
        org.junit.Assert.assertTrue("'" + filteringMode84 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode84.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList85);
        org.junit.Assert.assertNotNull(strList86);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNotNull(strList88);
        org.junit.Assert.assertNotNull(strList90);
        org.junit.Assert.assertNotNull(wildcardClass91);
    }

    @Test
    public void test15438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15438");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("ese(Taiwan$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$", "                  hI   Taiwan                  hI   ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test15439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15439");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("                                                gnalesenic.esenicavaj                                                ", "SIA\307NARF", "zh_Z");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test15440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15440");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("English");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "I###################################################################################################");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("$$ZH_TW$$$", strArray2, strArray5);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "$$ZH_TW$$$" + "'", str6, "$$ZH_TW$$$");
    }

    @Test
    public void test15441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15441");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("italiano (CI_A)", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test15442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15442");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("it", strMap1);
        languageRangeList2.clear();
        java.lang.Object[] objArray4 = languageRangeList2.toArray();
        int int6 = languageRangeList2.indexOf((java.lang.Object) "util");
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test15443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15443");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("iHAILATI..", (int) 'a', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "iHAILATI..aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "iHAILATI..aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test15444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15444");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("ITAFRAITA", "            HI!HI!HI!HI!HI!HI            ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test15445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15445");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.lang.Class<?>[] wildcardClassArray3 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray1);
        java.lang.Class<?> wildcardClass4 = null;
        java.lang.Class[] classArray6 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray7 = (java.lang.Class<?>[]) classArray6;
        wildcardClassArray7[0] = wildcardClass4;
        boolean boolean11 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray3, wildcardClassArray7, false);
        java.lang.Class[] classArray13 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray14 = (java.lang.Class<?>[]) classArray13;
        java.lang.Class<?>[] wildcardClassArray15 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray13);
        boolean boolean16 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray3, (java.lang.Class<?>[]) classArray13);
        java.lang.Class[] classArray18 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray19 = (java.lang.Class<?>[]) classArray18;
        java.lang.Class<?>[] wildcardClassArray20 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray18);
        java.lang.Class<?>[] wildcardClassArray21 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray18);
        java.lang.Class[] classArray23 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray24 = (java.lang.Class<?>[]) classArray23;
        java.lang.Class<?>[] wildcardClassArray25 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray23);
        java.lang.Class<?>[] wildcardClassArray26 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray23);
        java.lang.String str28 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) classArray23, "zh-CN");
        boolean boolean29 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray21, (java.lang.Class<?>[]) classArray23);
        boolean boolean31 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray3, wildcardClassArray21, false);
        java.lang.Class[] classArray33 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray34 = (java.lang.Class<?>[]) classArray33;
        java.lang.Class<?>[] wildcardClassArray35 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray33);
        java.lang.Class<?>[] wildcardClassArray36 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray33);
        java.lang.Class[] classArray39 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray40 = (java.lang.Class<?>[]) classArray39;
        java.lang.Class<?>[] wildcardClassArray41 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray39);
        java.lang.String str42 = org.apache.commons.lang3.StringUtils.concatWith("hi!", (java.lang.Object[]) classArray39);
        boolean boolean43 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray33, (java.lang.Class<?>[]) classArray39);
        java.lang.Class[] classArray45 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray46 = (java.lang.Class<?>[]) classArray45;
        java.lang.Class<?>[] wildcardClassArray47 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray45);
        java.lang.Class<?> wildcardClass48 = null;
        java.lang.Class[] classArray50 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray51 = (java.lang.Class<?>[]) classArray50;
        wildcardClassArray51[0] = wildcardClass48;
        boolean boolean55 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray47, wildcardClassArray51, false);
        java.lang.Class[] classArray57 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray58 = (java.lang.Class<?>[]) classArray57;
        java.lang.Class<?>[] wildcardClassArray59 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray57);
        boolean boolean60 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray47, (java.lang.Class<?>[]) classArray57);
        boolean boolean61 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray33, (java.lang.Class<?>[]) classArray57);
        java.lang.Class<?>[] wildcardClassArray62 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers((java.lang.Class<?>[]) classArray57);
        java.lang.Class<?>[] wildcardClassArray63 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers((java.lang.Class<?>[]) classArray57);
        boolean boolean64 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray21, wildcardClassArray63);
        java.lang.Class<?>[] wildcardClassArray65 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray63);
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertNotNull(classArray6);
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(classArray13);
        org.junit.Assert.assertNotNull(wildcardClassArray14);
        org.junit.Assert.assertNotNull(wildcardClassArray15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(classArray18);
        org.junit.Assert.assertNotNull(wildcardClassArray19);
        org.junit.Assert.assertNotNull(wildcardClassArray20);
        org.junit.Assert.assertNotNull(wildcardClassArray21);
        org.junit.Assert.assertNotNull(classArray23);
        org.junit.Assert.assertNotNull(wildcardClassArray24);
        org.junit.Assert.assertNotNull(wildcardClassArray25);
        org.junit.Assert.assertNotNull(wildcardClassArray26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(classArray33);
        org.junit.Assert.assertNotNull(wildcardClassArray34);
        org.junit.Assert.assertNotNull(wildcardClassArray35);
        org.junit.Assert.assertNotNull(wildcardClassArray36);
        org.junit.Assert.assertNotNull(classArray39);
        org.junit.Assert.assertNotNull(wildcardClassArray40);
        org.junit.Assert.assertNotNull(wildcardClassArray41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(classArray45);
        org.junit.Assert.assertNotNull(wildcardClassArray46);
        org.junit.Assert.assertNotNull(wildcardClassArray47);
        org.junit.Assert.assertNotNull(classArray50);
        org.junit.Assert.assertNotNull(wildcardClassArray51);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(classArray57);
        org.junit.Assert.assertNotNull(wildcardClassArray58);
        org.junit.Assert.assertNotNull(wildcardClassArray59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray62);
        org.junit.Assert.assertNotNull(wildcardClassArray63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray65);
    }

    @Test
    public void test15446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15446");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.ITALIAN;
        java.util.Locale locale3 = new java.util.Locale("");
        java.lang.String str4 = locale3.getDisplayLanguage();
        java.util.Locale locale5 = java.util.Locale.CANADA;
        java.lang.String str6 = locale5.getDisplayLanguage();
        java.lang.String str7 = locale3.getDisplayScript(locale5);
        java.util.Locale locale9 = java.util.Locale.FRANCE;
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale9);
        java.lang.String str11 = locale3.getDisplayCountry(locale9);
        java.lang.String str12 = locale1.getDisplayScript(locale3);
        java.util.Locale locale13 = java.util.Locale.GERMAN;
        java.lang.String str14 = locale3.getDisplayLanguage(locale13);
        java.util.Locale locale17 = new java.util.Locale("");
        java.lang.String str18 = locale17.getDisplayLanguage();
        java.util.Locale locale19 = java.util.Locale.CANADA;
        java.lang.String str20 = locale19.getDisplayLanguage();
        java.lang.String str21 = locale17.getDisplayScript(locale19);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.lowerCase("a", locale17);
        java.lang.String str23 = locale17.getDisplayScript();
        java.lang.String str24 = locale13.getDisplayLanguage(locale17);
        java.util.Set<java.lang.String> strSet25 = locale13.getUnicodeLocaleAttributes();
        java.util.Locale.setDefault(category0, locale13);
        java.util.Locale.Category category27 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale28 = java.util.Locale.getDefault(category27);
        java.util.Locale locale29 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str30 = locale29.getDisplayLanguage();
        java.lang.String str31 = locale29.getDisplayScript();
        java.util.Locale.setDefault(category27, locale29);
        java.util.Locale.setDefault(category0, locale29);
        java.util.Locale locale34 = java.util.Locale.getDefault(category0);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it");
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "English" + "'", str6, "English");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "english" + "'", str10, "english");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "de");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals(locale17.toString(), "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "English" + "'", str20, "English");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "a" + "'", str22, "a");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "German" + "'", str24, "German");
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertTrue("'" + category27 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category27.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale28);
// flaky:         org.junit.Assert.assertEquals(locale28.toString(), "en");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Chinese" + "'", str30, "Chinese");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "zh_TW");
    }

    @Test
    public void test15447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15447");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("                                ese (Taiwanese (Taiwanese (Taiwanese (Taiwanese (Taiwanese (Taiwanese (Taiwanese (Taiwan", "\u0939\u093f\u0902\u0926\u0940 (HI!,cHINA)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                ese (Taiwanese (Taiwanese (Taiwanese (Taiwanese (Taiwanese (Taiwanese (Taiwanese (Taiwan" + "'", str2, "                                ese (Taiwanese (Taiwanese (Taiwanese (Taiwanese (Taiwanese (Taiwanese (Taiwanese (Taiwan");
    }

    @Test
    public void test15448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15448");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "china-CN");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test15449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15449");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("anglais (Canada", "                                                                                                 ", 649, 83);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "anglais (Canada                                                                                                 " + "'", str4, "anglais (Canada                                                                                                 ");
    }

    @Test
    public void test15450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15450");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "                 A                  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test15451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15451");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setScript("");
        java.util.Locale.Builder builder4 = builder2.setLanguage("HI");
        java.util.Locale locale5 = builder4.build();
        java.util.Locale.Builder builder6 = builder4.clearExtensions();
        java.util.Locale.Builder builder7 = builder6.clearExtensions();
        java.util.Locale.Builder builder9 = builder6.setLanguage("ARRAYLIS");
        java.util.Locale.Builder builder11 = builder9.addUnicodeLocaleAttribute("cines");
        java.util.Locale locale12 = java.util.Locale.ITALIAN;
        java.util.Locale locale14 = new java.util.Locale("");
        java.lang.String str15 = locale14.getDisplayLanguage();
        java.util.Locale locale16 = java.util.Locale.CANADA;
        java.lang.String str17 = locale16.getDisplayLanguage();
        java.lang.String str18 = locale14.getDisplayScript(locale16);
        java.util.Locale locale20 = java.util.Locale.FRANCE;
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale20);
        java.lang.String str22 = locale14.getDisplayCountry(locale20);
        java.lang.String str23 = locale12.getDisplayScript(locale14);
        java.util.Locale locale24 = java.util.Locale.GERMAN;
        java.lang.String str25 = locale14.getDisplayLanguage(locale24);
        java.util.Locale locale28 = new java.util.Locale("");
        java.lang.String str29 = locale28.getDisplayLanguage();
        java.util.Locale locale30 = java.util.Locale.CANADA;
        java.lang.String str31 = locale30.getDisplayLanguage();
        java.lang.String str32 = locale28.getDisplayScript(locale30);
        java.lang.String str33 = org.apache.commons.lang3.StringUtils.lowerCase("a", locale28);
        java.lang.String str34 = locale28.getDisplayScript();
        java.lang.String str35 = locale24.getDisplayLanguage(locale28);
        java.util.Set<java.lang.String> strSet36 = locale28.getUnicodeLocaleAttributes();
        java.util.Locale.Builder builder37 = builder9.setLocale(locale28);
        java.util.Set<java.lang.String> strSet38 = locale28.getUnicodeLocaleAttributes();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "hi");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "it");
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\u82f1\u6587" + "'", str17, "\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "english" + "'", str21, "english");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "de");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals(locale28.toString(), "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\u82f1\u6587" + "'", str31, "\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "a" + "'", str33, "a");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "German" + "'", str35, "German");
        org.junit.Assert.assertNotNull(strSet36);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(strSet38);
    }

    @Test
    public void test15452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15452");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("e!e(Tiiwin", 9, 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test15453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15453");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName("ChinesHinChinesHinChinesHinChinesHinChinesHinliIlish");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test15454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15454");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("cl                                   java.util.stream", "                       ANIHCxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", "english");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test15455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15455");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.setLanguageTag("zh-CN");
        java.util.Locale.Builder builder5 = builder3.setLanguage("CHINA");
        java.util.Locale locale6 = builder3.build();
        java.util.Locale locale7 = builder3.build();
        java.lang.String str8 = locale7.getVariant();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "china_CN");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "china_CN");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test15456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15456");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.lang.Class<?>[] wildcardClassArray3 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray1);
        java.lang.Class<?> wildcardClass4 = null;
        java.lang.Class[] classArray6 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray7 = (java.lang.Class<?>[]) classArray6;
        wildcardClassArray7[0] = wildcardClass4;
        boolean boolean11 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray3, wildcardClassArray7, false);
        java.lang.Class<?>[] wildcardClassArray12 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray3);
        java.lang.String str14 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) wildcardClassArray3, "n       a");
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertNotNull(classArray6);
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "java.lang" + "'", str14, "java.lang");
    }

    @Test
    public void test15457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15457");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("cHINA", "zh-CNenglish", 100);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "ChinChinChinChinChinChinChinChinChinaaaaaaaaa#");
        java.lang.String str7 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) str5, "][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts_JA");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "cHIChinChinChinChinChinChinChinChinChinaaaaaaaaa#A" + "'", str5, "cHIChinChinChinChinChinChinChinChinChinaaaaaaaaa#A");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "String" + "'", str7, "String");
    }

    @Test
    public void test15458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15458");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("", "                                                                                                   ", (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test15459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15459");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "har[]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test15460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15460");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList3 = java.util.Locale.LanguageRange.parse("hi");
        java.util.Locale.LanguageRange languageRange5 = new java.util.Locale.LanguageRange("cn");
        boolean boolean6 = languageRangeList3.add(languageRange5);
        java.util.Locale.LanguageRange[] languageRangeArray7 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList8 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList8, languageRangeArray7);
        java.util.Locale locale11 = java.util.Locale.FRANCE;
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale11);
        java.util.Locale locale13 = java.util.Locale.US;
        java.util.Locale locale14 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale15 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale16 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale17 = java.util.Locale.getDefault();
        java.lang.String str18 = locale16.getDisplayCountry(locale17);
        java.lang.String str19 = locale16.toLanguageTag();
        java.util.Locale locale20 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale21 = java.util.Locale.getDefault();
        java.lang.String str22 = locale20.getDisplayCountry(locale21);
        java.util.Locale locale23 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale24 = java.util.Locale.getDefault();
        java.lang.String str25 = locale23.getDisplayCountry(locale24);
        java.util.Locale locale29 = new java.util.Locale("hi", "hi!", "cHINA");
        java.util.Locale locale30 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale31 = java.util.Locale.getDefault();
        java.lang.String str32 = locale30.getDisplayCountry(locale31);
        java.util.Locale locale34 = new java.util.Locale("");
        java.lang.String str35 = locale34.getDisplayVariant();
        java.util.Locale locale36 = java.util.Locale.KOREAN;
        java.util.Locale locale38 = new java.util.Locale("");
        java.util.Locale locale39 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale[] localeArray40 = new java.util.Locale[] { locale11, locale13, locale14, locale15, locale16, locale21, locale23, locale29, locale31, locale34, locale36, locale38, locale39 };
        java.util.ArrayList<java.util.Locale> localeList41 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList41, localeArray40);
        java.util.List<java.util.Locale> localeList43 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList8, (java.util.Collection<java.util.Locale>) localeList41);
        java.lang.String[] strArray51 = new java.lang.String[] { "English", "hi", "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "", "a", "", "China" };
        java.util.ArrayList<java.lang.String> strList52 = new java.util.ArrayList<java.lang.String>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList52, strArray51);
        java.util.List<java.lang.Class<?>> wildcardClassList54 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList52);
        java.util.Locale.FilteringMode filteringMode55 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList56 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList8, (java.util.Collection<java.lang.String>) strList52, filteringMode55);
        java.util.Spliterator<java.util.Locale.LanguageRange> languageRangeSpliterator57 = languageRangeList8.spliterator();
        java.lang.String str59 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) languageRangeList8, "Locale.LanguageRange");
        int int60 = languageRangeList3.indexOf((java.lang.Object) "Locale.LanguageRange");
        languageRangeList3.clear();
        java.lang.String[] strArray66 = org.apache.commons.lang3.StringUtils.split("english", "cHINA", (int) (byte) 1);
        int int67 = org.apache.commons.lang3.StringUtils.indexOfAny("Chin", strArray66);
        java.lang.String str68 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray66);
        java.lang.String[] strArray69 = org.apache.commons.lang3.StringUtils.stripAll(strArray66);
        int int70 = languageRangeList3.lastIndexOf((java.lang.Object) strArray69);
        java.lang.String[] strArray74 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!henglish (IA,zh,CN)", "italiano", 3);
        java.lang.String str75 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                                                                                            Itali", strArray69, strArray74);
        int int76 = org.apache.commons.lang3.StringUtils.indexOfAny("        ", strArray69);
        org.junit.Assert.assertNotNull(languageRangeList3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(languageRangeArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "english" + "'", str12, "english");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale17);
// flaky:         org.junit.Assert.assertEquals(locale17.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Cina" + "'", str18, "Cina");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "zh-CN" + "'", str19, "zh-CN");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale21);
// flaky:         org.junit.Assert.assertEquals(locale21.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Cina" + "'", str22, "Cina");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale24);
// flaky:         org.junit.Assert.assertEquals(locale24.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Cina" + "'", str25, "Cina");
        org.junit.Assert.assertEquals(locale29.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale31);
// flaky:         org.junit.Assert.assertEquals(locale31.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Cina" + "'", str32, "Cina");
        org.junit.Assert.assertEquals(locale34.toString(), "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "ko");
        org.junit.Assert.assertEquals(locale38.toString(), "");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(localeList43);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(wildcardClassList54);
        org.junit.Assert.assertTrue("'" + filteringMode55 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode55.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList56);
        org.junit.Assert.assertNotNull(languageRangeSpliterator57);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "ArrayList" + "'", str59, "ArrayList");
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "english" + "'", str68, "english");
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "                                                                                            Itali" + "'", str75, "                                                                                            Itali");
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
    }

    @Test
    public void test15461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15461");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("hi", "iiiiiiiiiiiiiiiiiiiiiiiArrayList");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "h" + "'", str3, "h");
    }

    @Test
    public void test15462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15462");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "xxxxx...latiIhailatiIhailatiIhailatiIhailatiIhailatiIhailatiIhailatiIhailatiIhailatiIhailatiIhailati", "uuuuuxxxxxxxxxxxxxxJ$p$nesexxxxxxxxxxxxxxuuuuu");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test15463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15463");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap3);
        int int5 = languageRangeList1.size();
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor6 = languageRangeList1.listIterator();
        java.util.Locale.LanguageRange languageRange8 = new java.util.Locale.LanguageRange("a");
        java.util.Locale.LanguageRange languageRange10 = new java.util.Locale.LanguageRange("English");
        java.lang.String str12 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) languageRange10, "");
        java.util.Locale.LanguageRange languageRange14 = new java.util.Locale.LanguageRange("English");
        java.util.Locale.LanguageRange[] languageRangeArray15 = new java.util.Locale.LanguageRange[] { languageRange8, languageRange10, languageRange14 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList16 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList16, languageRangeArray15);
        boolean boolean18 = languageRangeList1.retainAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList16);
        java.lang.String[] strArray21 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hI", "ingleseu");
        boolean boolean22 = languageRangeList16.contains((java.lang.Object) "ingleseu");
        java.util.Iterator<java.util.Locale.LanguageRange> languageRangeItor23 = languageRangeList16.iterator();
        java.lang.String str25 = org.apache.commons.lang3.StringUtils.join(languageRangeItor23, "A][gnirts");
        languageRangeItor23.remove();
        java.lang.String str28 = org.apache.commons.lang3.StringUtils.join(languageRangeItor23, 'x');
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(languageRangeItor6);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Locale.LanguageRange" + "'", str12, "Locale.LanguageRange");
        org.junit.Assert.assertNotNull(languageRangeArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(languageRangeItor23);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test15464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15464");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("ArrayL", "tRING[]TRING[]TRING[]TRING[]TRING[]T...", "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ArrayL" + "'", str3, "ArrayL");
    }

    @Test
    public void test15465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15465");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.lang.String str1 = locale0.toLanguageTag();
        java.util.Locale.Builder builder2 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale.Builder builder5 = builder3.setLanguageTag("zh-CN");
        java.util.Locale.Builder builder7 = builder5.setLanguage("it");
        java.util.Locale.Builder builder8 = builder7.clearExtensions();
        java.util.Locale.Builder builder10 = builder7.setLanguage("Engls");
        java.util.Locale locale12 = new java.util.Locale("");
        java.lang.String str13 = locale12.getDisplayLanguage();
        java.util.Locale locale14 = java.util.Locale.CANADA;
        java.lang.String str15 = locale14.getDisplayLanguage();
        java.lang.String str16 = locale12.getDisplayScript(locale14);
        java.util.Locale locale17 = java.util.Locale.ITALIAN;
        java.util.Locale locale19 = new java.util.Locale("");
        java.lang.String str20 = locale19.getDisplayLanguage();
        java.util.Locale locale21 = java.util.Locale.CANADA;
        java.lang.String str22 = locale21.getDisplayLanguage();
        java.lang.String str23 = locale19.getDisplayScript(locale21);
        java.util.Locale locale25 = java.util.Locale.FRANCE;
        java.lang.String str26 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale25);
        java.lang.String str27 = locale19.getDisplayCountry(locale25);
        java.lang.String str28 = locale17.getDisplayScript(locale19);
        java.lang.String str29 = locale19.getDisplayCountry();
        java.lang.String str30 = locale19.getDisplayLanguage();
        java.util.Locale locale31 = java.util.Locale.PRC;
        java.lang.String str32 = locale19.getDisplayScript(locale31);
        java.lang.String str33 = locale14.getDisplayCountry(locale19);
        java.util.Locale.Builder builder34 = builder10.setLocale(locale14);
        java.lang.String str35 = locale14.getCountry();
        java.lang.String str36 = locale14.getCountry();
        java.lang.String str37 = locale0.getDisplayLanguage(locale14);
        java.lang.String str38 = locale14.toString();
        org.junit.Assert.assertNotNull(locale0);
// flaky:         org.junit.Assert.assertEquals(locale0.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "it" + "'", str1, "it");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\u82f1\u6587" + "'", str15, "\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "it");
        org.junit.Assert.assertEquals(locale19.toString(), "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\u82f1\u6587" + "'", str22, "\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "english" + "'", str26, "english");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Canada" + "'", str33, "Canada");
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "CA" + "'", str35, "CA");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "CA" + "'", str36, "CA");
// flaky:         org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Italian" + "'", str37, "Italian");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "en_CA" + "'", str38, "en_CA");
    }

    @Test
    public void test15466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15466");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("ad.ae.af.ag.ai.al.am.an.ao.aq.ar.as.at.au.aw.ax.az.ba.bb.bd.be.bf.bg.bh.bi.bj.bl.bm.bn.bo.bq.br.bs.bt.bv.bw.by.bz.ca.cc.cd.cf.cg.ch.ci.ck.cl.cm.cn.co.cr.cu.cv.cw.cx.cy.cz.de.dj.dk.dm.do.dz.ec.ee.eg.eh.er.es.et.fi.fj.fk.fm.fo.fr.ga.gb.gd.ge.gf.gg.gh.gi.gl.gm.gn.gp.gq.gr.gs.gt.gu.gw.gy.hk.hm.hn.hr.ht.hu.id.ie.il.im.in.io.iq.ir.is.it.je.jm.jo.jp.ke.kg.kh.ki.km.kn.kp.kr.kw.ky.kz.la.lb.lc.li.lk.lr.ls.lt.lu.lv.ly.ma.mc.md.me.mf.mg.mh.mk.ml.mm.mn.mo.mp.mq.mr.ms.mt.mu.mv.mw.mx.my.mz.na.nc.ne.nf.ng.ni.nl.no.np.nr.nu.nz.om.pa.pe.pf.pg.ph.pk.pl.pm.pn.pr.ps.pt.pw.py.qa.re.ro.rs.ru.rw.sa.sb.sc.sd.se.sg.sh.si.sj.sk.sl.sm.sn.so.sr.ss.st.sv.sx.sy.sz.tc.td.tf.tg.th.tj.tk.tl.tm.tn.to.tr.tt.tv.tw.tz.ua.ug.um.us.uy.uz.va.vc.ve.vg.vi.vn.vu.wf.ws.ye.yt.za.zm.z", 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test15467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15467");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("chinois (chine)4444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      ", 45);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                             " + "'", str2, "                                             ");
    }

    @Test
    public void test15468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15468");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("rance)###########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", 'u');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "rance)###########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################" + "'", str2, "rance)###########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
    }

    @Test
    public void test15469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15469");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "elacoLelacoLelacoLelacoLelacoL", (java.lang.CharSequence) "h$Iuuuuuu");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "elacoLelacoLelacoLelacoLelacoL" + "'", charSequence2, "elacoLelacoLelacoLelacoLelacoL");
    }

    @Test
    public void test15470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15470");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = org.apache.commons.lang3.ClassUtils.getClass("##################EnglCNsCN###################");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ##################EnglCNsCN###################");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test15471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15471");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("                zH                ", "ad.fr_CAzw", "en-C..", 35);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                zH                " + "'", str4, "                zH                ");
    }

    @Test
    public void test15472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15472");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.setLanguageTag("zh-CN");
        java.util.Locale.Builder builder5 = builder3.setLanguage("CHINA");
        java.util.Locale locale6 = builder3.build();
        java.util.Locale.Builder builder8 = builder3.setLanguage("");
        java.util.Locale.Builder builder9 = builder3.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder3.setRegion("anihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihc");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: anihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihcaaaaaaadnuanihc [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "china_CN");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test15473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15473");
        char[] charArray3 = new char[] {};
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray3);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "\u6cd5\u56fd", charArray3);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "java.uil", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test15474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15474");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxchn", '.');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxchn" + "'", str2, "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxchn");
    }

    @Test
    public void test15475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15475");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("ggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engl");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "GGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGL" + "'", str1, "GGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGL");
    }

    @Test
    public void test15476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15476");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("ITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITALIAHi", "in");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test15477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15477");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("short", 'x');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "short" + "'", str2, "short");
    }

    @Test
    public void test15478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15478");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("cnncnncnnlocale.Buildercnncnncnnc", "\u4e2d\u56fdAD.AE.AFxxxxxxxxxxxxxxxxxxxxxxxxx");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "cnncnncnnlocale.Buildercnncnncnnc" + "'", str2, "cnncnncnnlocale.Buildercnncnncnnc");
    }

    @Test
    public void test15479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15479");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("hi");
        int int3 = languageRangeList1.indexOf((java.lang.Object) '4');
        java.util.Locale.LanguageRange[] languageRangeArray4 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList5 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList5, languageRangeArray4);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap7 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList8 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList5, strMap7);
        int int9 = languageRangeList5.size();
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor10 = languageRangeList5.listIterator();
        java.util.Locale.LanguageRange languageRange12 = new java.util.Locale.LanguageRange("a");
        java.util.Locale.LanguageRange languageRange14 = new java.util.Locale.LanguageRange("English");
        java.lang.String str16 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) languageRange14, "");
        java.util.Locale.LanguageRange languageRange18 = new java.util.Locale.LanguageRange("English");
        java.util.Locale.LanguageRange[] languageRangeArray19 = new java.util.Locale.LanguageRange[] { languageRange12, languageRange14, languageRange18 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList20 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList20, languageRangeArray19);
        boolean boolean22 = languageRangeList5.retainAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList20);
        java.util.Locale.LanguageRange[] languageRangeArray23 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList24 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList24, languageRangeArray23);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap26 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList27 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList24, strMap26);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor28 = languageRangeList27.listIterator();
        java.lang.String[] strArray30 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList31 = new java.util.ArrayList<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList31, strArray30);
        java.util.Locale.LanguageRange[] languageRangeArray33 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList34 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList34, languageRangeArray33);
        java.util.Locale locale37 = java.util.Locale.FRANCE;
        java.lang.String str38 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale37);
        java.util.Locale locale39 = java.util.Locale.US;
        java.util.Locale locale40 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale41 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale42 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale43 = java.util.Locale.getDefault();
        java.lang.String str44 = locale42.getDisplayCountry(locale43);
        java.lang.String str45 = locale42.toLanguageTag();
        java.util.Locale locale46 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale47 = java.util.Locale.getDefault();
        java.lang.String str48 = locale46.getDisplayCountry(locale47);
        java.util.Locale locale49 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale50 = java.util.Locale.getDefault();
        java.lang.String str51 = locale49.getDisplayCountry(locale50);
        java.util.Locale locale55 = new java.util.Locale("hi", "hi!", "cHINA");
        java.util.Locale locale56 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale57 = java.util.Locale.getDefault();
        java.lang.String str58 = locale56.getDisplayCountry(locale57);
        java.util.Locale locale60 = new java.util.Locale("");
        java.lang.String str61 = locale60.getDisplayVariant();
        java.util.Locale locale62 = java.util.Locale.KOREAN;
        java.util.Locale locale64 = new java.util.Locale("");
        java.util.Locale locale65 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale[] localeArray66 = new java.util.Locale[] { locale37, locale39, locale40, locale41, locale42, locale47, locale49, locale55, locale57, locale60, locale62, locale64, locale65 };
        java.util.ArrayList<java.util.Locale> localeList67 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList67, localeArray66);
        java.util.List<java.util.Locale> localeList69 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList34, (java.util.Collection<java.util.Locale>) localeList67);
        java.lang.String[] strArray77 = new java.lang.String[] { "English", "hi", "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "", "a", "", "China" };
        java.util.ArrayList<java.lang.String> strList78 = new java.util.ArrayList<java.lang.String>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList78, strArray77);
        java.util.List<java.lang.Class<?>> wildcardClassList80 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList78);
        java.util.Locale.FilteringMode filteringMode81 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList82 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList34, (java.util.Collection<java.lang.String>) strList78, filteringMode81);
        java.util.List<java.lang.String> strList83 = java.util.Locale.filterTags(languageRangeList27, (java.util.Collection<java.lang.String>) strList31, filteringMode81);
        boolean boolean84 = languageRangeList5.remove((java.lang.Object) strList83);
        java.util.List<java.lang.String> strList85 = java.util.Locale.filterTags(languageRangeList1, (java.util.Collection<java.lang.String>) strList83);
        java.lang.Class<?> wildcardClass86 = strList83.getClass();
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(languageRangeArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(languageRangeList8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(languageRangeItor10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Locale.LanguageRange" + "'", str16, "Locale.LanguageRange");
        org.junit.Assert.assertNotNull(languageRangeArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(languageRangeArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(languageRangeList27);
        org.junit.Assert.assertNotNull(languageRangeItor28);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(languageRangeArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "english" + "'", str38, "english");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale43);
// flaky:         org.junit.Assert.assertEquals(locale43.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Cina" + "'", str44, "Cina");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "zh-CN" + "'", str45, "zh-CN");
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale47);
// flaky:         org.junit.Assert.assertEquals(locale47.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Cina" + "'", str48, "Cina");
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale50);
// flaky:         org.junit.Assert.assertEquals(locale50.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Cina" + "'", str51, "Cina");
        org.junit.Assert.assertEquals(locale55.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale56);
        org.junit.Assert.assertEquals(locale56.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale57);
// flaky:         org.junit.Assert.assertEquals(locale57.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str58 + "' != '" + "Cina" + "'", str58, "Cina");
        org.junit.Assert.assertEquals(locale60.toString(), "");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertNotNull(locale62);
        org.junit.Assert.assertEquals(locale62.toString(), "ko");
        org.junit.Assert.assertEquals(locale64.toString(), "");
        org.junit.Assert.assertNotNull(locale65);
        org.junit.Assert.assertEquals(locale65.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(localeList69);
        org.junit.Assert.assertNotNull(strArray77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(wildcardClassList80);
        org.junit.Assert.assertTrue("'" + filteringMode81 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode81.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList82);
        org.junit.Assert.assertNotNull(strList83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(strList85);
        org.junit.Assert.assertNotNull(wildcardClass86);
    }

    @Test
    public void test15480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15480");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = builder0.build();
        java.util.Locale locale4 = new java.util.Locale("");
        java.util.Set<java.lang.String> strSet5 = locale4.getUnicodeLocaleKeys();
        java.lang.String str6 = locale4.getDisplayName();
        java.util.Locale.Builder builder7 = builder0.setLocale(locale4);
        java.util.Locale.Builder builder8 = builder7.clearExtensions();
        java.util.Locale locale9 = java.util.Locale.ITALIAN;
        java.util.Set<java.lang.String> strSet10 = locale9.getUnicodeLocaleAttributes();
        java.util.Locale.Builder builder11 = builder7.setLocale(locale9);
        java.util.Locale.Builder builder12 = builder7.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder14 = builder7.setRegion("rglAsA");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: rglAsA [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "it");
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test15481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15481");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("", "ava . lang");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test15482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15482");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("char[]");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "char[]" + "'", str1, "char[]");
    }

    @Test
    public void test15483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15483");
        java.util.Locale locale1 = new java.util.Locale("STI-F");
        java.lang.String str2 = locale1.getVariant();
        org.junit.Assert.assertEquals(locale1.toString(), "sti-f");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test15484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15484");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("", (int) ' ', (int) 'u');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test15485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15485");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.util.Locale locale2 = new java.util.Locale("");
        java.lang.String str3 = locale2.getDisplayLanguage();
        java.util.Locale locale4 = java.util.Locale.CANADA;
        java.lang.String str5 = locale4.getDisplayLanguage();
        java.lang.String str6 = locale2.getDisplayScript(locale4);
        java.util.Locale locale8 = java.util.Locale.FRANCE;
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale8);
        java.lang.String str10 = locale2.getDisplayCountry(locale8);
        java.lang.String str11 = locale0.getDisplayScript(locale2);
        java.lang.String str12 = locale2.getDisplayCountry();
        java.lang.String str13 = locale2.getCountry();
        java.util.Locale locale14 = java.util.Locale.ITALIAN;
        java.lang.String str15 = locale14.getLanguage();
        java.lang.String str16 = locale14.getLanguage();
        java.util.Locale locale17 = java.util.Locale.ITALIAN;
        java.util.Locale locale19 = new java.util.Locale("");
        java.lang.String str20 = locale19.getDisplayLanguage();
        java.util.Locale locale21 = java.util.Locale.CANADA;
        java.lang.String str22 = locale21.getDisplayLanguage();
        java.lang.String str23 = locale19.getDisplayScript(locale21);
        java.util.Locale locale25 = java.util.Locale.FRANCE;
        java.lang.String str26 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale25);
        java.lang.String str27 = locale19.getDisplayCountry(locale25);
        java.lang.String str28 = locale17.getDisplayScript(locale19);
        java.util.Locale.setDefault(locale17);
        java.util.Locale locale33 = new java.util.Locale("hi", "hi!", "cHINA");
        java.util.Locale locale34 = java.util.Locale.ITALIAN;
        java.util.Locale locale36 = new java.util.Locale("");
        java.lang.String str37 = locale36.getDisplayLanguage();
        java.util.Locale locale38 = java.util.Locale.CANADA;
        java.lang.String str39 = locale38.getDisplayLanguage();
        java.lang.String str40 = locale36.getDisplayScript(locale38);
        java.util.Locale locale42 = java.util.Locale.FRANCE;
        java.lang.String str43 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale42);
        java.lang.String str44 = locale36.getDisplayCountry(locale42);
        java.lang.String str45 = locale34.getDisplayScript(locale36);
        java.util.Locale.setDefault(locale34);
        java.lang.String str47 = locale33.getDisplayVariant(locale34);
        java.lang.String str48 = locale17.getDisplayLanguage(locale34);
        java.lang.String str49 = locale14.getDisplayLanguage(locale34);
        java.util.Locale locale50 = locale34.stripExtensions();
        java.util.Locale locale51 = java.util.Locale.ITALIAN;
        java.util.Locale locale53 = new java.util.Locale("");
        java.lang.String str54 = locale53.getDisplayLanguage();
        java.util.Locale locale55 = java.util.Locale.CANADA;
        java.lang.String str56 = locale55.getDisplayLanguage();
        java.lang.String str57 = locale53.getDisplayScript(locale55);
        java.util.Locale locale59 = java.util.Locale.FRANCE;
        java.lang.String str60 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale59);
        java.lang.String str61 = locale53.getDisplayCountry(locale59);
        java.lang.String str62 = locale51.getDisplayScript(locale53);
        java.util.Locale locale63 = java.util.Locale.GERMAN;
        java.lang.String str64 = locale53.getDisplayLanguage(locale63);
        java.util.Locale locale67 = new java.util.Locale("");
        java.lang.String str68 = locale67.getDisplayLanguage();
        java.util.Locale locale69 = java.util.Locale.CANADA;
        java.lang.String str70 = locale69.getDisplayLanguage();
        java.lang.String str71 = locale67.getDisplayScript(locale69);
        java.lang.String str72 = org.apache.commons.lang3.StringUtils.lowerCase("a", locale67);
        java.lang.String str73 = locale67.getDisplayScript();
        java.lang.String str74 = locale63.getDisplayLanguage(locale67);
        java.lang.String str75 = locale34.getDisplayName(locale67);
        java.lang.String str77 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) locale34, "ese (Taiwan$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        java.lang.String str78 = locale2.getDisplayCountry(locale34);
        java.lang.String str79 = locale34.getDisplayScript();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u82f1\u6587" + "'", str5, "\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "english" + "'", str9, "english");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "it");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "it" + "'", str15, "it");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "it" + "'", str16, "it");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "it");
        org.junit.Assert.assertEquals(locale19.toString(), "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\u82f1\u6587" + "'", str22, "\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "english" + "'", str26, "english");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals(locale33.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "it");
        org.junit.Assert.assertEquals(locale36.toString(), "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "inglese" + "'", str39, "inglese");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "english" + "'", str43, "english");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "cHINA" + "'", str47, "cHINA");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "italiano" + "'", str48, "italiano");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "italiano" + "'", str49, "italiano");
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "it");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "it");
        org.junit.Assert.assertEquals(locale53.toString(), "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "inglese" + "'", str56, "inglese");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "english" + "'", str60, "english");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "de");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertEquals(locale67.toString(), "");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertNotNull(locale69);
        org.junit.Assert.assertEquals(locale69.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "inglese" + "'", str70, "inglese");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "a" + "'", str72, "a");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "German" + "'", str74, "German");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "Italian" + "'", str75, "Italian");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "Locale" + "'", str77, "Locale");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
    }

    @Test
    public void test15486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15486");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("arraylist##########", "Japaneseuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test15487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15487");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "       hi!italiahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIital...xxxx", "ava . lang");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test15488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15488");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("a#a#a#a#a#");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a#a#a#a#a#" + "'", str1, "a#a#a#a#a#");
    }

    @Test
    public void test15489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15489");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                                                           d                                                            ", "Germn");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test15490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15490");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "cHIChinChinChinChinChinChinChinChinChinaaaaaaaaa#A");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test15491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15491");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("nawiaT", 46);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nawiaT" + "'", str2, "nawiaT");
    }

    @Test
    public void test15492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15492");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("nwtsnwtlgne", "italienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalien", 649);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test15493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15493");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("A");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "A" + "'", str4, "A");
    }

    @Test
    public void test15494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15494");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.setLanguageTag("zh-CN");
        java.util.Locale.Builder builder5 = builder3.setLanguage("CHINA");
        java.util.Locale locale6 = builder3.build();
        java.util.Locale.Builder builder7 = builder3.clearExtensions();
        java.util.Locale locale9 = java.util.Locale.CANADA;
        java.lang.String str10 = locale9.toLanguageTag();
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.upperCase("hi!", locale9);
        java.lang.String str13 = locale9.getExtension('a');
        java.util.Locale.Builder builder14 = builder7.setLocale(locale9);
        java.util.Locale.Builder builder15 = builder14.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder17 = builder14.setLanguageTag("ANIHC               EN_ca                                                                 ");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: ANIHC               EN_ca                                                                  [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "china_CN");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "en-CA" + "'", str10, "en-CA");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HI!" + "'", str11, "HI!");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test15495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15495");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("String[]");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "String[]" + "'", str1, "String[]");
    }

    @Test
    public void test15496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15496");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("hi");
        java.lang.Object[] objArray2 = languageRangeList1.toArray();
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream3 = languageRangeList1.parallelStream();
        java.util.Locale.LanguageRange[] languageRangeArray4 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList5 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList5, languageRangeArray4);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap7 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList8 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList5, strMap7);
        java.util.Locale.LanguageRange[] languageRangeArray9 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList10 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList10, languageRangeArray9);
        boolean boolean12 = languageRangeList5.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList10);
        java.util.Locale.LanguageRange[] languageRangeArray13 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList14 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList14, languageRangeArray13);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap16 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList17 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList14, strMap16);
        java.util.Locale.LanguageRange[] languageRangeArray18 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList19 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList19, languageRangeArray18);
        boolean boolean21 = languageRangeList14.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList19);
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList19, "hi!");
        boolean boolean24 = languageRangeList5.remove((java.lang.Object) languageRangeList19);
        boolean boolean25 = languageRangeList1.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList19);
        java.lang.Object obj26 = null;
        int int27 = languageRangeList1.indexOf(obj26);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange29 = languageRangeList1.remove((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(languageRangeStream3);
        org.junit.Assert.assertNotNull(languageRangeArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(languageRangeList8);
        org.junit.Assert.assertNotNull(languageRangeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(languageRangeArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(languageRangeList17);
        org.junit.Assert.assertNotNull(languageRangeArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test15497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15497");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444HindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHind");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444HindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHind" + "'", str1, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444HindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHind");
    }

    @Test
    public void test15498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15498");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("                                              italiahi                                              t                                              italiahi                                              l                                              italiahi                                                                                            italiahi                                                                                            italiahi                                              o");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                              italiahi                                              t                                              italiahi                                              l                                              italiahi                                                                                            italiahi                                                                                            italiahi                                              " + "'", str1, "                                              italiahi                                              t                                              italiahi                                              l                                              italiahi                                                                                            italiahi                                                                                            italiahi                                              ");
    }

    @Test
    public void test15499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15499");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.setLanguageTag("zh-CN");
        java.util.Locale.Builder builder5 = builder3.setLanguage("CHINA");
        java.util.Locale locale6 = builder3.build();
        java.util.Locale.Builder builder8 = builder3.setLanguage("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder8.setScript("Locale");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: Locale [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "china_CN");
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test15500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15500");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuan       a", "XXXXXXXXXXFRENCH(FRANCE)XXXXXXXXXX                                                           ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "XXXXXXXXXXFRENCH(FRANCE)XXXXXXXXXX                                                           " + "'", str2, "XXXXXXXXXXFRENCH(FRANCE)XXXXXXXXXX                                                           ");
    }
}
