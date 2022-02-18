import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest20 {

    public static boolean debug = false;

    @Test
    public void test10001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10001");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("English");
        java.lang.String str3 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) languageRange1, "");
        java.util.Locale.LanguageRange languageRange5 = new java.util.Locale.LanguageRange("a");
        java.util.Locale.LanguageRange languageRange7 = new java.util.Locale.LanguageRange("a");
        java.util.Locale.LanguageRange[] languageRangeArray8 = new java.util.Locale.LanguageRange[] { languageRange1, languageRange5, languageRange7 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList9 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList9, languageRangeArray8);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor11 = languageRangeList9.listIterator();
        java.lang.String str13 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) languageRangeItor11, "italiahI");
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join((java.util.Iterator<java.util.Locale.LanguageRange>) languageRangeItor11, "$ (JAVA.LANG)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Locale.LanguageRange" + "'", str3, "Locale.LanguageRange");
        org.junit.Assert.assertNotNull(languageRangeArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(languageRangeItor11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.util" + "'", str13, "java.util");
    }

    @Test
    public void test10002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10002");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("                                                                                                                                                                                                                                                          EN-CASTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRIN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "NIRTSGNIRTSGNIRTSGNIRTSGNIRTSGNIRTSGNIRTSGNIRTSGNIRTSGNIRTSGNIRTSGNIRTSGNIRTSGNIRTSGNIRTSGNIRTSAC-NE                                                                                                                                                                                                                                                          " + "'", str1, "NIRTSGNIRTSGNIRTSGNIRTSGNIRTSGNIRTSGNIRTSGNIRTSGNIRTSGNIRTSGNIRTSGNIRTSGNIRTSGNIRTSGNIRTSGNIRTSAC-NE                                                                                                                                                                                                                                                          ");
    }

    @Test
    public void test10003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10003");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("       hi!", (int) (byte) 1, "zh_tw_CHINCHINCHINCHINCHICHINCHINCHINCHINC");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "       hi!" + "'", str3, "       hi!");
    }

    @Test
    public void test10004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10004");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "chi..");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10005");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("\u82f1\u6587\u52a0\u62ff\u5927)", "Cina", (-1));
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "\u82f1\u6587\u52a0\u62ff\u5927)");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u82f1\u6587\u52a0\u62ff\u5927)" + "'", str5, "\u82f1\u6587\u52a0\u62ff\u5927)");
    }

    @Test
    public void test10006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10006");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("", "WT_hz");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "WT_hz" + "'", str2, "WT_hz");
    }

    @Test
    public void test10007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10007");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("\u52a0\u62ff\u5927", "                  HI                   ", 20);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny("...gggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....eng...", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test10008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10008");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("eng", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10009");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("CLASS[]", "..italiahiit_cn..italiahiit_cn..italiahiit_cn..italiahi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10010");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "                                                      java.lang                                                      ", (java.lang.CharSequence) "Engls");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10011");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("en-CA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "en-ca" + "'", str1, "en-ca");
    }

    @Test
    public void test10012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10012");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "EN_CAEN_CA_EN_CAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10013");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("AHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H", "english");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "AD.AE.AF.AG.AI.AL.AM.AN.AO.AQ.AR.AS.AT.AU.AW.AX.AZ.BA.BB.BD.BE.BF.BG.BH.BI.BJ.BL.BM.BN.BO.BQ.BR.BS.BT.BV.BW.BY.BZ.CA.CC.CD.CF.CG.CH.CI.CK.CL.CM.CN.CO.CR.CU.CV.CW.CX.CY.CZ.DE.DJ.DK.DM.DO.DZ.EC.EE.EG.EH.ER.ES.ET.FI.FJ.FK.FM.FO.FR.GA.GB.GD.GE.GF.GG.GH.GI.GL.GM.GN.GP.GQ.GR.GS.GT.GU.GW.GY.HK.HM.HN.HR.HT.HU.ID.IE.IL.IM.IN.IO.IQ.IR.IS.IT.JE.JM.JO.JP.KE.KG.KH.KI.KM.KN.KP.KR.KW.KY.KZ.LA.LB.LC.LI.LK.LR.LS.LT.LU.LV.LY.MA.MC.MD.ME.MF.MG.MH.MK.ML.MM.MN.MO.MP.MQ.MR.MS.MT.MU.MV.MW.MX.MY.MZ.NA.NC.NE.NF.NG.NI.NL.NO.NP.NR.NU.NZ.OM.PA.PE.PF.PG.PH.PK.PL.PM.PN.PR.PS.PT.PW.PY.QA.RE.RO.RS.RU.RW.SA.SB.SC.SD.SE.SG.SH.SI.SJ.SK.SL.SM.SN.SO.SR.SS.ST.SV.SX.SY.SZ.TC.TD.TF.TG.TH.TJ.TK.TL.TM.TN.TO.TR.TT.TV.TW.TZ.UA.UG.UM.US.UY.UZ.VA.VC.VE.VG.VI.VN.VU.WF.WS.YE.YT.ZA.ZM.ZW", (int) (byte) -1);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.endsWithAny("en", strArray10);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                 a                  ", strArray4, strArray10);
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.stripAll(strArray10, "ARRAYLIST");
        java.lang.String[] strArray18 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HI!STRING[]STRING[]S", "\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587");
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny("China", strArray18);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.replaceEach("ENGLHI!STRING[]STRING[]SSHI!STRING[]STRING[]S", strArray10, strArray18);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "AHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H" + "'", str5, "AHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "                 a                  " + "'", str12, "                 a                  ");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ENGLHI!STRING[]STRING[]SSHI!STRING[]STRING[]S" + "'", str20, "ENGLHI!STRING[]STRING[]SSHI!STRING[]STRING[]S");
    }

    @Test
    public void test10014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10014");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("ahi!hiCinaxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", "CHN", 99, 98);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ahi!hiCinaxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxCHN" + "'", str4, "ahi!hiCinaxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxCHN");
    }

    @Test
    public void test10015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10015");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("ANIHC      ", strMap1);
        java.util.Iterator<java.util.Locale.LanguageRange> languageRangeItor3 = languageRangeList2.iterator();
        java.util.Locale.LanguageRange languageRange4 = languageRangeItor3.next();
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
        boolean boolean25 = languageRangeList6.containsAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList20);
        java.lang.String str27 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) languageRangeList20, "CAN");
        boolean boolean28 = languageRange4.equals((java.lang.Object) str27);
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeItor3);
        org.junit.Assert.assertNotNull(languageRange4);
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
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "ArrayList" + "'", str27, "ArrayList");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test10016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10016");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName("s");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "s" + "'", str1, "s");
    }

    @Test
    public void test10017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10017");
        java.util.Locale locale1 = new java.util.Locale("e!e(Tiiwin");
        java.util.Locale locale5 = new java.util.Locale("       HI!", "ChinChinChinChinChinChinChinChinChinaaaaaaaaa#", "\u82f1\u8a9e...xxxxxFrench(France)xxxxxxxxxx...xxxxxFrench(France)xxxxxxxxxx...xxxxxFrench(France)xxxxxxxxxx");
        java.util.Locale.Builder builder6 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder8 = builder6.setScript("");
        java.util.Locale locale9 = builder6.build();
        java.lang.String str10 = locale9.getScript();
        java.lang.String str11 = locale9.getCountry();
        java.lang.String str12 = locale5.getDisplayCountry(locale9);
        java.lang.String str13 = locale1.getDisplayLanguage(locale9);
        java.util.Set<java.lang.String> strSet14 = locale9.getUnicodeLocaleAttributes();
        boolean boolean15 = locale9.hasExtensions();
        java.lang.String str16 = locale9.toLanguageTag();
        org.junit.Assert.assertEquals(locale1.toString(), "e!e(tiiwin");
// flaky:         org.junit.Assert.assertEquals(locale5.toString(), "\u82f1\u8a9e...xxxxxFrench(France)xxxxxxxxxx...xxxxxFrench(France)xxxxxxxxxx...xxxxxFrench(France)xxxxxxxxxx");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "CHINCHINCHINCHINCHINCHINCHINCHINCHINAAAAAAAAA#" + "'", str12, "CHINCHINCHINCHINCHINCHINCHINCHINCHINAAAAAAAAA#");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "e!e(tiiwin" + "'", str13, "e!e(tiiwin");
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "und" + "'", str16, "und");
    }

    @Test
    public void test10018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10018");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "h$I", "Chinaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10019");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("locle.lngugernge", "n       a                                           ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test10020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10020");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("inglenglese", "\u4e2d\u6587\u53f0\u7063)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10021");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("NIRTSGNIRTSGNIRTSGNIRTSGNIRTSGNIRTSGNIRTSGNIRTSGNIRTSGNIRTSGNIRTSGNIRTSGNIRTSGNIRTSGNIRTSGNIRTSAC-NE                                                                                                                                                                                                                                                          ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10022");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfAny("java", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10023");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("Esglish (Usitee Ststes)", 100, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Esglish (Usitee Ststes)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "Esglish (Usitee Ststes)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test10024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10024");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.getDefault(category0);
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
        java.lang.String str15 = locale5.getDisplayCountry();
        java.lang.String str16 = locale5.getDisplayLanguage();
        java.util.Locale.setDefault(category0, locale5);
        boolean boolean18 = locale5.hasExtensions();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
// flaky:         org.junit.Assert.assertEquals(locale1.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale2);
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "it");
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "anglais" + "'", str8, "anglais");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "english" + "'", str12, "english");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test10025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10025");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("ENGLIILISH", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ENGLIILISH" + "'", str2, "ENGLIILISH");
    }

    @Test
    public void test10026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10026");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("Local");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Local" + "'", str1, "Local");
    }

    @Test
    public void test10027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10027");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("                                                                                                                                                                                                                                                          en-CASTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRIN", "AN       english");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 252 + "'", int2 == 252);
    }

    @Test
    public void test10028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10028");
        char[] charArray8 = new char[] {};
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "zh-CN", charArray8);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "a", charArray8);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "  China   ", charArray8);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "zh_CN", charArray8);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "i", charArray8);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "chinois (Chine)", charArray8);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H", charArray8);
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test10029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10029");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("ENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISH", "                                                                                                   ", 16);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10030");
        java.util.Locale locale1 = new java.util.Locale("");
        java.lang.String str2 = locale1.getISO3Country();
        java.util.Locale locale3 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        java.lang.String str5 = locale3.getDisplayCountry(locale4);
        java.lang.String str6 = locale3.getLanguage();
        java.lang.String str7 = locale3.getVariant();
        java.lang.String str8 = locale1.getDisplayLanguage(locale3);
        java.lang.String str9 = locale1.getCountry();
        java.lang.String str10 = locale1.toString();
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "China" + "'", str5, "China");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "zh" + "'", str6, "zh");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test10031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10031");
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) "cINACINzcINACINA", "undaaaaaaaH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang" + "'", str2, "java.lang");
    }

    @Test
    public void test10032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10032");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("nglais", "zhcines");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10033");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("wt_hz", '#', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "wt_hz" + "'", str3, "wt_hz");
    }

    @Test
    public void test10034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10034");
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
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor68 = languageRangeList62.listIterator();
        java.lang.String str70 = org.apache.commons.lang3.StringUtils.join((java.util.Iterator<java.util.Locale.LanguageRange>) languageRangeItor68, 'u');
        java.lang.String str72 = org.apache.commons.lang3.StringUtils.join((java.util.Iterator<java.util.Locale.LanguageRange>) languageRangeItor68, "hi!hi! (                 A                 )");
        // The following exception was thrown during execution in test generation
        try {
            languageRangeItor68.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
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
// flaky:         org.junit.Assert.assertEquals(locale20.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "China" + "'", str21, "China");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "zh-CN" + "'", str22, "zh-CN");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale24);
// flaky:         org.junit.Assert.assertEquals(locale24.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "China" + "'", str25, "China");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale27);
// flaky:         org.junit.Assert.assertEquals(locale27.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "China" + "'", str28, "China");
        org.junit.Assert.assertEquals(locale32.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale34);
// flaky:         org.junit.Assert.assertEquals(locale34.toString(), "hi_HI!_cHINA");
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
        org.junit.Assert.assertNotNull(languageRangeItor68);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
    }

    @Test
    public void test10035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10035");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("CHINOIS (CHINE)4444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "jpn");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CHINOIS (CHINE)4444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str2, "CHINOIS (CHINE)4444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test10036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10036");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("Nglish  Hindi (HI!,cHINA", "\u4e2d\u6587\u4e2d\u56fd)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10037");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("EN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-ca", "               fr_CA               ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10038");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap3);
        java.util.Locale.LanguageRange[] languageRangeArray5 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList6 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList6, languageRangeArray5);
        boolean boolean8 = languageRangeList1.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList6);
        int int9 = languageRangeList1.size();
        java.util.Locale.LanguageRange[] languageRangeArray10 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList11 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList11, languageRangeArray10);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap13 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList14 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList11, strMap13);
        int int15 = languageRangeList11.size();
        java.util.List<java.util.Locale.LanguageRange> languageRangeList17 = java.util.Locale.LanguageRange.parse("hi");
        boolean boolean19 = languageRangeList17.remove((java.lang.Object) "English");
        boolean boolean20 = languageRangeList11.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList17);
        java.util.Locale.LanguageRange[] languageRangeArray21 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList22 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList22, languageRangeArray21);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap24 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList25 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList22, strMap24);
        java.lang.String[] strArray33 = new java.lang.String[] { "English", "hi", "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "", "a", "", "China" };
        java.util.ArrayList<java.lang.String> strList34 = new java.util.ArrayList<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList34, strArray33);
        java.util.List<java.lang.Class<?>> wildcardClassList36 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList34);
        java.lang.String str37 = java.util.Locale.lookupTag(languageRangeList25, (java.util.Collection<java.lang.String>) strList34);
        java.util.List<java.lang.Class<?>> wildcardClassList38 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList34);
        java.util.List<java.lang.String> strList39 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList11, (java.util.Collection<java.lang.String>) strList34);
        java.util.Locale.LanguageRange[] languageRangeArray40 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList41 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList41, languageRangeArray40);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap43 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList44 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList41, strMap43);
        int int45 = languageRangeList41.size();
        java.util.List<java.util.Locale.LanguageRange> languageRangeList47 = java.util.Locale.LanguageRange.parse("hi");
        boolean boolean49 = languageRangeList47.remove((java.lang.Object) "English");
        boolean boolean50 = languageRangeList41.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList47);
        java.lang.String[] strArray55 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("English", "hi", (int) (short) -1);
        java.lang.String[] strArray58 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("a", "");
        java.lang.String[] strArray59 = org.apache.commons.lang3.StringUtils.stripAll(strArray58);
        java.lang.String[] strArray60 = org.apache.commons.lang3.StringUtils.stripAll(strArray59);
        java.lang.String str61 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", strArray55, strArray59);
        boolean boolean62 = languageRangeList41.equals((java.lang.Object) strArray59);
        boolean boolean63 = languageRangeList11.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList41);
        java.util.Locale.LanguageRange[] languageRangeArray65 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList66 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList66, languageRangeArray65);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap68 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList69 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList66, strMap68);
        int int70 = languageRangeList66.size();
        java.util.List<java.util.Locale.LanguageRange> languageRangeList72 = java.util.Locale.LanguageRange.parse("hi");
        boolean boolean74 = languageRangeList72.remove((java.lang.Object) "English");
        boolean boolean75 = languageRangeList66.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList72);
        java.util.Locale.LanguageRange languageRange77 = new java.util.Locale.LanguageRange("English");
        java.lang.String str78 = languageRange77.getRange();
        boolean boolean79 = languageRangeList72.add(languageRange77);
        languageRangeList41.add(0, languageRange77);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap82 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList83 = java.util.Locale.LanguageRange.parse("english", strMap82);
        int int84 = languageRangeList41.lastIndexOf((java.lang.Object) languageRangeList83);
        boolean boolean85 = languageRangeList1.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList83);
        java.util.Spliterator<java.util.Locale.LanguageRange> languageRangeSpliterator86 = languageRangeList83.spliterator();
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(languageRangeArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(languageRangeArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(languageRangeList14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(languageRangeList17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(languageRangeArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(languageRangeList25);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(wildcardClassList36);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(wildcardClassList38);
        org.junit.Assert.assertNotNull(strList39);
        org.junit.Assert.assertNotNull(languageRangeArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(languageRangeList44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(languageRangeList47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h" + "'", str61, "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(languageRangeArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(languageRangeList69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertNotNull(languageRangeList72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "english" + "'", str78, "english");
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(languageRangeList83);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + (-1) + "'", int84 == (-1));
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertNotNull(languageRangeSpliterator86);
    }

    @Test
    public void test10039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10039");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "cnn                                                                                                ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10040");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("\u4e2d\u6587 (ZH)");
        java.lang.String str2 = locale1.getDisplayLanguage();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10041");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("E!E(TIIWIN", 21);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "E!E(TIIWIN" + "'", str2, "E!E(TIIWIN");
    }

    @Test
    public void test10042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10042");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("undaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10043");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("..ITALIAHi", "......44444444EnglTWNsTWN44444444......", 117);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10044");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("it                                           ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaFrancese", 36);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test10045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10045");
        char[] charArray5 = new char[] {};
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray5);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "twn", charArray5);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "SHORT", charArray5);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "AN                 a                 AN   ", charArray5);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "French", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test10046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10046");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("chn", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "chn" + "'", str2, "chn");
    }

    @Test
    public void test10047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10047");
        java.util.Locale locale2 = new java.util.Locale("CA", "CAN");
        org.junit.Assert.assertEquals(locale2.toString(), "ca_CAN");
    }

    @Test
    public void test10048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10048");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!              aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10049");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("class java.lang.string", "ARRAYLIS", (int) (byte) 100);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("LANG                                                      ", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test10050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10050");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("ncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncArrayList", 45);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10051");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("ITALIAHi", 42);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                 ITALIAHi                 " + "'", str2, "                 ITALIAHi                 ");
    }

    @Test
    public void test10052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10052");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("CHINOIS (CHINE)4444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      ", "C...", "H");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CHINOIS (CHINE)4444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      " + "'", str3, "CHINOIS (CHINE)4444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      ");
    }

    @Test
    public void test10053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10053");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("I", "Locale");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I" + "'", str2, "I");
    }

    @Test
    public void test10054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10054");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "Locale.LanguageRange");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10055");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.setLanguageTag("zh-CN");
        java.util.Locale.Builder builder5 = builder3.setLanguage("it");
        java.util.Locale.Builder builder7 = builder3.setLanguageTag("hI");
        java.util.Locale.Builder builder8 = builder3.clearExtensions();
        java.util.Locale locale11 = new java.util.Locale("italiano", "Ci_a");
        java.util.Locale locale15 = new java.util.Locale("Canada", "allemand", "cHINA");
        java.lang.String str16 = locale11.getDisplayName(locale15);
        java.util.Locale locale17 = locale11.stripExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder18 = builder8.setLocale(locale17);
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: CI_A [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals(locale11.toString(), "italiano_CI_A");
        org.junit.Assert.assertEquals(locale15.toString(), "canada_ALLEMAND_cHINA");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "italiano (CI_A)" + "'", str16, "italiano (CI_A)");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "italiano_CI_A");
    }

    @Test
    public void test10056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10056");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa              !ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HENGLISH");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10057");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                                   $", "a");
        java.lang.String str4 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) "a", "EN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-ca");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang" + "'", str4, "java.lang");
    }

    @Test
    public void test10058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10058");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("ita", "$ (JAVA.LANG)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10059");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("tring[]", 117, 280);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10060");
        java.util.Locale locale2 = new java.util.Locale("CN        ", ".....ZHCINESESE");
        org.junit.Assert.assertEquals(locale2.toString(), "cn        _.....ZHCINESESE");
    }

    @Test
    public void test10061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10061");
        java.lang.CharSequence charSequence1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "ithi!lihi!no", charSequence1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Strings must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10062");
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
        java.util.Locale.LanguageRange[] languageRangeArray23 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList24 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList24, languageRangeArray23);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap26 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList27 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList24, strMap26);
        java.util.Locale.LanguageRange[] languageRangeArray28 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList29 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList29, languageRangeArray28);
        boolean boolean31 = languageRangeList24.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList29);
        java.lang.String str33 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList29, "hi!");
        java.lang.Class[] classArray35 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray36 = (java.lang.Class<?>[]) classArray35;
        java.lang.Class<?>[] wildcardClassArray37 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray35);
        java.lang.Class<?>[] wildcardClassArray38 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray35);
        java.lang.Class[] classArray41 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray42 = (java.lang.Class<?>[]) classArray41;
        java.lang.Class<?>[] wildcardClassArray43 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray41);
        java.lang.String str44 = org.apache.commons.lang3.StringUtils.concatWith("hi!", (java.lang.Object[]) classArray41);
        boolean boolean45 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray35, (java.lang.Class<?>[]) classArray41);
        java.lang.Class[] classArray47 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray48 = (java.lang.Class<?>[]) classArray47;
        java.lang.Class<?>[] wildcardClassArray49 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray47);
        java.lang.Class<?> wildcardClass50 = null;
        java.lang.Class[] classArray52 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray53 = (java.lang.Class<?>[]) classArray52;
        wildcardClassArray53[0] = wildcardClass50;
        boolean boolean57 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray49, wildcardClassArray53, false);
        java.lang.Class[] classArray59 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray60 = (java.lang.Class<?>[]) classArray59;
        java.lang.Class<?>[] wildcardClassArray61 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray59);
        boolean boolean62 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray49, (java.lang.Class<?>[]) classArray59);
        boolean boolean63 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray35, (java.lang.Class<?>[]) classArray59);
        java.lang.Class<?>[] wildcardClassArray64 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers((java.lang.Class<?>[]) classArray59);
        java.lang.Class<?>[] wildcardClassArray65 = languageRangeList29.toArray((java.lang.Class<?>[]) classArray59);
        java.lang.Class<?>[] wildcardClassArray66 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray65);
        boolean boolean67 = languageRangeList1.remove((java.lang.Object) wildcardClassArray66);
        java.util.Locale.LanguageRange[] languageRangeArray68 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList69 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList69, languageRangeArray68);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap71 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList72 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList69, strMap71);
        int int73 = languageRangeList69.size();
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor74 = languageRangeList69.listIterator();
        java.util.Locale.LanguageRange languageRange76 = new java.util.Locale.LanguageRange("a");
        java.util.Locale.LanguageRange languageRange78 = new java.util.Locale.LanguageRange("English");
        java.lang.String str80 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) languageRange78, "");
        java.util.Locale.LanguageRange languageRange82 = new java.util.Locale.LanguageRange("English");
        java.util.Locale.LanguageRange[] languageRangeArray83 = new java.util.Locale.LanguageRange[] { languageRange76, languageRange78, languageRange82 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList84 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList84, languageRangeArray83);
        boolean boolean86 = languageRangeList69.retainAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList84);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor87 = languageRangeList84.listIterator();
        boolean boolean88 = languageRangeItor87.hasNext();
        boolean boolean89 = languageRangeItor87.hasNext();
        java.util.Locale.LanguageRange languageRange90 = languageRangeItor87.next();
        java.util.Locale.LanguageRange languageRange91 = languageRangeItor87.next();
        boolean boolean92 = languageRangeList1.add(languageRange91);
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
        org.junit.Assert.assertNotNull(languageRangeArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(languageRangeList27);
        org.junit.Assert.assertNotNull(languageRangeArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(classArray35);
        org.junit.Assert.assertNotNull(wildcardClassArray36);
        org.junit.Assert.assertNotNull(wildcardClassArray37);
        org.junit.Assert.assertNotNull(wildcardClassArray38);
        org.junit.Assert.assertNotNull(classArray41);
        org.junit.Assert.assertNotNull(wildcardClassArray42);
        org.junit.Assert.assertNotNull(wildcardClassArray43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(classArray47);
        org.junit.Assert.assertNotNull(wildcardClassArray48);
        org.junit.Assert.assertNotNull(wildcardClassArray49);
        org.junit.Assert.assertNotNull(classArray52);
        org.junit.Assert.assertNotNull(wildcardClassArray53);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(classArray59);
        org.junit.Assert.assertNotNull(wildcardClassArray60);
        org.junit.Assert.assertNotNull(wildcardClassArray61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray64);
        org.junit.Assert.assertNotNull(wildcardClassArray65);
        org.junit.Assert.assertNotNull(wildcardClassArray66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(languageRangeArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(languageRangeList72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertNotNull(languageRangeItor74);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "Locale.LanguageRange" + "'", str80, "Locale.LanguageRange");
        org.junit.Assert.assertNotNull(languageRangeArray83);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(languageRangeItor87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertNotNull(languageRange90);
        org.junit.Assert.assertNotNull(languageRange91);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
    }

    @Test
    public void test10063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10063");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("hindi(HI!,cHINA)", "ANIHC      xxxxhIxxx");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10064");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\u82f1\u6587\u52a0\u62ff\u5927)", "..italiahiit_cn..italiahiit_cn..italiahiit_cn..italiahi", 42);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test10065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10065");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("zh-cnenglh", 8);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "zh-cnenglh" + "'", str2, "zh-cnenglh");
    }

    @Test
    public void test10066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10066");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxchn     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxchn" + "'", str1, "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxchn");
    }

    @Test
    public void test10067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10067");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("\u5fb7\u6587\u5fb7\u56fd\u5fb7\u6587");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u5fb7\u6587\u5fb7\u56fd\u5fb7\u6587" + "'", str1, "\u5fb7\u6587\u5fb7\u56fd\u5fb7\u6587");
    }

    @Test
    public void test10068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10068");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("an       a");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "an       a" + "'", str1, "an       a");
    }

    @Test
    public void test10069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10069");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("AHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HENGLISH", "Chi..");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HENGLISH" + "'", str2, "AHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HENGLISH");
    }

    @Test
    public void test10070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10070");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("ESECNARF", "hina");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10071");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("English");
        java.lang.String str3 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) languageRange1, "");
        double double4 = languageRange1.getWeight();
        double double5 = languageRange1.getWeight();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Locale.LanguageRange" + "'", str3, "Locale.LanguageRange");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test10072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10072");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("zhcinesese", 43, '$');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zhcinesese$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$" + "'", str3, "zhcinesese$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
    }

    @Test
    public void test10073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10073");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("ChinChinChinChinChinChinChinChinChinaaaaaaaaa.", "\u5370\u5730\u6587", "wt_hz");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ChinChinChinChinChinChinChinChinChinaaaaaaaaa." + "'", str3, "ChinChinChinChinChinChinChinChinChinaaaaaaaaa.");
    }

    @Test
    public void test10074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10074");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "\u5317\u5370\u5ea6\u6587 (HI!,cHINA)", (java.lang.CharSequence) "           ZXXXXXXXXXXXXXXXXXXX");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10075");
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
        int int62 = languageRangeList4.indexOf((java.lang.Object) 1.0f);
        boolean boolean63 = languageRangeList4.isEmpty();
        java.util.Locale locale65 = java.util.Locale.TAIWAN;
        java.lang.String str66 = org.apache.commons.lang3.StringUtils.upperCase("", locale65);
        java.lang.String str67 = locale65.getISO3Country();
        boolean boolean68 = languageRangeList4.remove((java.lang.Object) locale65);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str70 = locale65.getUnicodeLocaleType("wt_hz");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: wt_hz");
        } catch (java.lang.IllegalArgumentException e) {
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
// flaky:         org.junit.Assert.assertEquals(locale20.toString(), "referencepipeline.head");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "China" + "'", str21, "China");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "zh-CN" + "'", str22, "zh-CN");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale24);
// flaky:         org.junit.Assert.assertEquals(locale24.toString(), "referencepipeline.head");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "China" + "'", str25, "China");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale27);
// flaky:         org.junit.Assert.assertEquals(locale27.toString(), "referencepipeline.head");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "China" + "'", str28, "China");
        org.junit.Assert.assertEquals(locale32.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale34);
// flaky:         org.junit.Assert.assertEquals(locale34.toString(), "referencepipeline.head");
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
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(locale65);
        org.junit.Assert.assertEquals(locale65.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "TWN" + "'", str67, "TWN");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test10076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10076");
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
        java.lang.String str20 = locale7.getCountry();
        java.util.Locale locale24 = new java.util.Locale("....english", "zhcinesese", ".");
        java.lang.String str25 = locale7.getDisplayName(locale24);
        java.lang.String str26 = locale7.getDisplayLanguage();
        java.lang.String str27 = locale7.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale1);
// flaky:         org.junit.Assert.assertEquals(locale1.toString(), "referencepipeline.head");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "China" + "'", str2, "China");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zh-CN" + "'", str3, "zh-CN");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zh" + "'", str4, "zh");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "it");
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "English" + "'", str10, "English");
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals(locale24.toString(), "....english_ZHCINESESE_.");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test10077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10077");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                    ", "zh-CN", 42);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny("Engls", strArray4);
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray4);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray6, '.', 46, (int) '.');
        java.lang.Class[] classArray12 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray13 = (java.lang.Class<?>[]) classArray12;
        java.lang.Class<?>[] wildcardClassArray14 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray12);
        java.lang.Class<?>[] wildcardClassArray15 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray12);
        java.lang.Class[] classArray17 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray18 = (java.lang.Class<?>[]) classArray17;
        java.lang.Class<?>[] wildcardClassArray19 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray17);
        java.lang.Class<?>[] wildcardClassArray20 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray17);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) classArray17, "zh-CN");
        boolean boolean23 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray15, (java.lang.Class<?>[]) classArray17);
        java.lang.Class[] classArray25 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray26 = (java.lang.Class<?>[]) classArray25;
        java.lang.Class<?>[] wildcardClassArray27 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray25);
        java.lang.Class<?>[] wildcardClassArray28 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray25);
        java.lang.Class[] classArray31 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray32 = (java.lang.Class<?>[]) classArray31;
        java.lang.Class<?>[] wildcardClassArray33 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray31);
        java.lang.String str34 = org.apache.commons.lang3.StringUtils.concatWith("hi!", (java.lang.Object[]) classArray31);
        boolean boolean35 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray25, (java.lang.Class<?>[]) classArray31);
        boolean boolean37 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray15, (java.lang.Class<?>[]) classArray31, true);
        java.lang.Class[] classArray39 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray40 = (java.lang.Class<?>[]) classArray39;
        java.lang.Class<?>[] wildcardClassArray41 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray39);
        java.lang.Class<?> wildcardClass42 = null;
        java.lang.Class[] classArray44 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray45 = (java.lang.Class<?>[]) classArray44;
        wildcardClassArray45[0] = wildcardClass42;
        boolean boolean49 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray41, wildcardClassArray45, false);
        java.lang.Class[] classArray51 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray52 = (java.lang.Class<?>[]) classArray51;
        java.lang.Class<?>[] wildcardClassArray53 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray51);
        boolean boolean54 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray41, (java.lang.Class<?>[]) classArray51);
        java.lang.Class[] classArray56 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray57 = (java.lang.Class<?>[]) classArray56;
        java.lang.Class<?>[] wildcardClassArray58 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray56);
        java.lang.Class<?>[] wildcardClassArray59 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray56);
        java.lang.Class[] classArray61 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray62 = (java.lang.Class<?>[]) classArray61;
        java.lang.Class<?>[] wildcardClassArray63 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray61);
        java.lang.Class<?>[] wildcardClassArray64 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray61);
        java.lang.String str66 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) classArray61, "zh-CN");
        boolean boolean67 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray59, (java.lang.Class<?>[]) classArray61);
        boolean boolean69 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray41, wildcardClassArray59, false);
        java.lang.Class<?>[] wildcardClassArray70 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray41);
        java.lang.Class<?>[] wildcardClassArray71 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray41);
        boolean boolean72 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray31, wildcardClassArray41);
        java.lang.Class[] classArray74 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray75 = (java.lang.Class<?>[]) classArray74;
        java.lang.Class<?>[] wildcardClassArray76 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray74);
        java.lang.Class<?> wildcardClass77 = null;
        java.lang.Class[] classArray79 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray80 = (java.lang.Class<?>[]) classArray79;
        wildcardClassArray80[0] = wildcardClass77;
        boolean boolean84 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray76, wildcardClassArray80, false);
        java.lang.Class<?>[] wildcardClassArray85 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray76);
        boolean boolean87 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray31, wildcardClassArray85, false);
        boolean boolean89 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray6, (java.lang.Class<?>[]) classArray31, false);
        java.lang.Class<?>[] wildcardClassArray90 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers((java.lang.Class<?>[]) classArray31);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(classArray12);
        org.junit.Assert.assertNotNull(wildcardClassArray13);
        org.junit.Assert.assertNotNull(wildcardClassArray14);
        org.junit.Assert.assertNotNull(wildcardClassArray15);
        org.junit.Assert.assertNotNull(classArray17);
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertNotNull(wildcardClassArray19);
        org.junit.Assert.assertNotNull(wildcardClassArray20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(classArray25);
        org.junit.Assert.assertNotNull(wildcardClassArray26);
        org.junit.Assert.assertNotNull(wildcardClassArray27);
        org.junit.Assert.assertNotNull(wildcardClassArray28);
        org.junit.Assert.assertNotNull(classArray31);
        org.junit.Assert.assertNotNull(wildcardClassArray32);
        org.junit.Assert.assertNotNull(wildcardClassArray33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(classArray39);
        org.junit.Assert.assertNotNull(wildcardClassArray40);
        org.junit.Assert.assertNotNull(wildcardClassArray41);
        org.junit.Assert.assertNotNull(classArray44);
        org.junit.Assert.assertNotNull(wildcardClassArray45);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(classArray51);
        org.junit.Assert.assertNotNull(wildcardClassArray52);
        org.junit.Assert.assertNotNull(wildcardClassArray53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(classArray56);
        org.junit.Assert.assertNotNull(wildcardClassArray57);
        org.junit.Assert.assertNotNull(wildcardClassArray58);
        org.junit.Assert.assertNotNull(wildcardClassArray59);
        org.junit.Assert.assertNotNull(classArray61);
        org.junit.Assert.assertNotNull(wildcardClassArray62);
        org.junit.Assert.assertNotNull(wildcardClassArray63);
        org.junit.Assert.assertNotNull(wildcardClassArray64);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray70);
        org.junit.Assert.assertNotNull(wildcardClassArray71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(classArray74);
        org.junit.Assert.assertNotNull(wildcardClassArray75);
        org.junit.Assert.assertNotNull(wildcardClassArray76);
        org.junit.Assert.assertNotNull(classArray79);
        org.junit.Assert.assertNotNull(wildcardClassArray80);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray85);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray90);
    }

    @Test
    public void test10078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10078");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("", 21);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10079");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("deu########################################");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test10080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10080");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("", "isangl");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10081");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("fran\347ais", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "fran\347ais" + "'", str2, "fran\347ais");
    }

    @Test
    public void test10082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10082");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str3 = locale2.getDisplayLanguage();
        java.lang.String str4 = locale2.getDisplayScript();
        java.util.Locale.setDefault(category0, locale2);
        java.util.Locale locale6 = java.util.Locale.getDefault(category0);
        java.util.Locale locale7 = java.util.Locale.FRENCH;
        java.util.Locale locale8 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str9 = locale8.getDisplayLanguage();
        java.util.Locale locale10 = java.util.Locale.getDefault();
        java.lang.String str11 = locale8.getDisplayCountry(locale10);
        java.util.Locale locale12 = java.util.Locale.TAIWAN;
        java.lang.String str13 = locale12.getVariant();
        java.lang.String str14 = locale8.getDisplayName(locale12);
        java.lang.String str15 = locale7.getDisplayScript(locale8);
        java.util.Locale.setDefault(category0, locale7);
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
        java.util.Locale locale29 = java.util.Locale.GERMAN;
        java.lang.String str30 = locale19.getDisplayLanguage(locale29);
        java.util.Locale locale33 = new java.util.Locale("");
        java.lang.String str34 = locale33.getDisplayLanguage();
        java.util.Locale locale35 = java.util.Locale.CANADA;
        java.lang.String str36 = locale35.getDisplayLanguage();
        java.lang.String str37 = locale33.getDisplayScript(locale35);
        java.lang.String str38 = org.apache.commons.lang3.StringUtils.lowerCase("a", locale33);
        java.lang.String str39 = locale33.getDisplayScript();
        java.lang.String str40 = locale29.getDisplayLanguage(locale33);
        java.util.Set<java.lang.String> strSet41 = locale29.getUnicodeLocaleAttributes();
        java.util.Locale locale43 = new java.util.Locale("I");
        java.lang.String str44 = locale43.getDisplayCountry();
        java.lang.String str45 = locale43.toLanguageTag();
        java.lang.String str46 = locale29.getDisplayScript(locale43);
        java.util.Locale.setDefault(category0, locale43);
        java.util.Locale locale48 = locale43.stripExtensions();
        java.lang.String str49 = locale48.toLanguageTag();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
// flaky:         org.junit.Assert.assertEquals(locale1.toString(), "referencepipeline.head");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Chinese" + "'", str3, "Chinese");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u4e2d\u6587" + "'", str9, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(locale10);
// flaky:         org.junit.Assert.assertEquals(locale10.toString(), "referencepipeline.head");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Taiwan" + "'", str11, "Taiwan");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\u4e2d\u6587\u53f0\u7063)" + "'", str14, "\u4e2d\u6587\u53f0\u7063)");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "it");
        org.junit.Assert.assertEquals(locale19.toString(), "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "anglais" + "'", str22, "anglais");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "english" + "'", str26, "english");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "de");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals(locale33.toString(), "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "anglais" + "'", str36, "anglais");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "a" + "'", str38, "a");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "German" + "'", str40, "German");
        org.junit.Assert.assertNotNull(strSet41);
        org.junit.Assert.assertEquals(locale43.toString(), "i");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "und" + "'", str45, "und");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "i");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "und" + "'", str49, "und");
    }

    @Test
    public void test10083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10083");
        char[] charArray9 = new char[] {};
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "zh-CN", charArray9);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "a", charArray9);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "  China   ", charArray9);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "zh_CN", charArray9);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "AD.AE.AF.AGchnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.AT.AU.AW.AX.AZ.BA.BB.BD.BE.BF.BG.BH.BI.BJ.BL.BM.BN.BO.BQ.BR.BS.BT.BV.BW.BY.BZ.CA.CC.CD.CF.CG.CH.CI.CK.CL.CM.CN.CO.CR.CU.CV.CW.CX.CY.CZ.DE.DJ.DK.DM.DO.DZ.EC.EE.EG.EH.ER.ES.ET.FI.FJ.FK.FM.FO.FR.GA.GB.GD.GE.GF.GG.GH.GI.GL.GM.GN.GP.GQ.GR.GS.GT.GU.GW.GY.HK.HM.HN.HR.HT.HU.ID.IE.IL.IM.IN.IO.IQ.IR.IS.IT.JE.JM.JO.JP.KE.KG.KH.KI.KM.KN.KP.KR.KW.KY.KZ.LA.LB.LC.LI.LK.LR.LS.LT.LU.LV.LY.MA.MC.MD.ME.MF.MG.MH.MK.ML.MM.MN.MO.MP.MQ.MR.MS.MT.MU.MV.MW.MX.MY.MZ.NA.NC.NE.NF.NG.NI.NL.NO.NP.NR.NU.NZ.OM.PA.PE.PF.PG.PH.PK.PL.PM.PN.PR.PS.PT.PW.PY.QA.RE.RO.RS.RU.RW.SA.SB.SC.SD.SE.SG.SH.SI.SJ.SK.SL.SM.SN.SO.SR.SS.ST.SV.SX.SY.SZ.TC.TD.TF.TG.TH.TJ.TK.TL.TM.TN.TO.TR.TT.TV.TW.TZ.UA.UG.UM.US.UY.UZ.VA.VC.VE.VG.VI.VN.VU.WF.WS.YE.YT.ZA.ZM.ZW", charArray9);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "cinese (Cina)", charArray9);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny("Japaneseuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", charArray9);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "Hindi", charArray9);
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test10084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10084");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("HI!HI!HI!HI!HI!HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HI!HI!HI!HI!HI" + "'", str1, "HI!HI!HI!HI!HI!HI");
    }

    @Test
    public void test10085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10085");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("j", "italiano (CI_A)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "j" + "'", str2, "j");
    }

    @Test
    public void test10086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10086");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "          ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10087");
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
        java.util.Locale.LanguageRange[] languageRangeArray17 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList18 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList18, languageRangeArray17);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap20 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList21 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList18, strMap20);
        java.util.Locale.LanguageRange[] languageRangeArray22 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList23 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList23, languageRangeArray22);
        boolean boolean25 = languageRangeList18.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList23);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream26 = languageRangeList23.stream();
        boolean boolean27 = languageRangeList4.containsAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList23);
        java.util.Locale.LanguageRange[] languageRangeArray28 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList29 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList29, languageRangeArray28);
        java.util.Locale locale32 = java.util.Locale.FRANCE;
        java.lang.String str33 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale32);
        java.util.Locale locale34 = java.util.Locale.US;
        java.util.Locale locale35 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale36 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale37 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale38 = java.util.Locale.getDefault();
        java.lang.String str39 = locale37.getDisplayCountry(locale38);
        java.lang.String str40 = locale37.toLanguageTag();
        java.util.Locale locale41 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale42 = java.util.Locale.getDefault();
        java.lang.String str43 = locale41.getDisplayCountry(locale42);
        java.util.Locale locale44 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale45 = java.util.Locale.getDefault();
        java.lang.String str46 = locale44.getDisplayCountry(locale45);
        java.util.Locale locale50 = new java.util.Locale("hi", "hi!", "cHINA");
        java.util.Locale locale51 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale52 = java.util.Locale.getDefault();
        java.lang.String str53 = locale51.getDisplayCountry(locale52);
        java.util.Locale locale55 = new java.util.Locale("");
        java.lang.String str56 = locale55.getDisplayVariant();
        java.util.Locale locale57 = java.util.Locale.KOREAN;
        java.util.Locale locale59 = new java.util.Locale("");
        java.util.Locale locale60 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale[] localeArray61 = new java.util.Locale[] { locale32, locale34, locale35, locale36, locale37, locale42, locale44, locale50, locale52, locale55, locale57, locale59, locale60 };
        java.util.ArrayList<java.util.Locale> localeList62 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList62, localeArray61);
        java.util.List<java.util.Locale> localeList64 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList29, (java.util.Collection<java.util.Locale>) localeList62);
        java.lang.String[] strArray72 = new java.lang.String[] { "English", "hi", "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "", "a", "", "China" };
        java.util.ArrayList<java.lang.String> strList73 = new java.util.ArrayList<java.lang.String>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList73, strArray72);
        java.util.List<java.lang.Class<?>> wildcardClassList75 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList73);
        java.util.Locale.FilteringMode filteringMode76 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList77 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList29, (java.util.Collection<java.lang.String>) strList73, filteringMode76);
        java.util.Spliterator<java.util.Locale.LanguageRange> languageRangeSpliterator78 = languageRangeList29.spliterator();
        java.lang.String str80 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) languageRangeList29, "Locale.LanguageRange");
        boolean boolean81 = languageRangeList23.containsAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList29);
        java.util.Locale.LanguageRange[] languageRangeArray82 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList83 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList83, languageRangeArray82);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap85 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList86 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList83, strMap85);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor87 = languageRangeList86.listIterator();
        boolean boolean88 = languageRangeList23.containsAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList86);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream89 = languageRangeList86.stream();
        java.lang.String str91 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList86, '#');
        java.lang.String str93 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList86, "");
        java.lang.String str95 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList86, "ad.ae.af.ag.ai.al.am.an.ao.aq.ar.as.at.au.aw.ax.az.ba.bb.bd.be.bf.bg.bh.bi.bj.bl.bm.bn.bo.bq.br.bs.bt.bv.bw.by.bz.ca.cc.cd.cf.cg.ch.ci.ck.cl.cm.cn.co.cr.cu.cv.cw.cx.cy.cz.de.dj.dk.dm.do.dz.ec.ee.eg.eh.er.es.et.fi.fj.fk.fm.fo.fr.ga.gb.gd.ge.gf.gg.gh.gi.gl.gm.gn.gp.gq.gr.gs.gt.gu.gw.gy.hk.hm.hn.hr.ht.hu.id.ie.il.im.in.io.iq.ir.is.it.je.jm.jo.jp.ke.kg.kh.ki.km.kn.kp.kr.kw.ky.kz.la.lb.lc.li.lk.lr.ls.lt.lu.lv.ly.ma.mc.md.me.mf.mg.mh.mk.ml.mm.mn.mo.mp.mq.mr.ms.mt.mu.mv.mw.mx.my.mz.na.nc.ne.nf.ng.ni.nl.no.np.nr.nu.nz.om.pa.pe.pf.pg.ph.pk.pl.pm.pn.pr.ps.pt.pw.py.qa.re.ro.rs.ru.rw.sa.sb.sc.sd.se.sg.sh.si.sj.sk.sl.sm.sn.so.sr.ss.st.sv.sx.sy.sz.tc.td.tf.tg.th.tj.tk.tl.tm.tn.to.tr.tt.tv.tw.tz.ua.ug.um.us.uy.uz.va.vc.ve.vg.vi.vn.vu.wf.ws.ye.yt.za.zm.zw");
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClassList15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(languageRangeArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(languageRangeList21);
        org.junit.Assert.assertNotNull(languageRangeArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(languageRangeStream26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(languageRangeArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "english" + "'", str33, "english");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale38);
// flaky:         org.junit.Assert.assertEquals(locale38.toString(), "referencepipeline.head");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "China" + "'", str39, "China");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "zh-CN" + "'", str40, "zh-CN");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale42);
// flaky:         org.junit.Assert.assertEquals(locale42.toString(), "referencepipeline.head");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "China" + "'", str43, "China");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale45);
// flaky:         org.junit.Assert.assertEquals(locale45.toString(), "referencepipeline.head");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "China" + "'", str46, "China");
        org.junit.Assert.assertEquals(locale50.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale52);
// flaky:         org.junit.Assert.assertEquals(locale52.toString(), "referencepipeline.head");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "China" + "'", str53, "China");
        org.junit.Assert.assertEquals(locale55.toString(), "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertNotNull(locale57);
        org.junit.Assert.assertEquals(locale57.toString(), "ko");
        org.junit.Assert.assertEquals(locale59.toString(), "");
        org.junit.Assert.assertNotNull(locale60);
        org.junit.Assert.assertEquals(locale60.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(localeList64);
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(wildcardClassList75);
        org.junit.Assert.assertTrue("'" + filteringMode76 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode76.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList77);
        org.junit.Assert.assertNotNull(languageRangeSpliterator78);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "ArrayList" + "'", str80, "ArrayList");
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(languageRangeArray82);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(languageRangeList86);
        org.junit.Assert.assertNotNull(languageRangeItor87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertNotNull(languageRangeStream89);
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "" + "'", str91, "");
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "" + "'", str93, "");
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "" + "'", str95, "");
    }

    @Test
    public void test10088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10088");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("italien", "I!Hchizh_TW");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10089");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("WT_hz", "fr");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "WT_hz" + "'", str2, "WT_hz");
    }

    @Test
    public void test10090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10090");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("                            ese (Taiwan");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ese (Taiwan" + "'", str1, "ese (Taiwan");
    }

    @Test
    public void test10091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10091");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf(".....ZHCINESES", "a");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10092");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("chinaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxchn     ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test10093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10093");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("china_CN                             ese(Taiwan");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "china_CN                             ese(Taiwan" + "'", str1, "china_CN                             ese(Taiwan");
    }

    @Test
    public void test10094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10094");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("slgne", "aa.ab.ae.af.ak.am.an.ar.as.av.ay.az.ba.be.bg.bh.bi.bm.bn.bo.br.bs.ca.ce.ch.co.cr.cs.cu.cv.cy.da.de.dv.dz.ee.el.en.eo.es.et.eu.fa.ff.fi.fj.fo.fr.fy.ga.gd.gl.gn.gu.gv.ha.he.hi.ho.hr.ht.hu.hy.hz.ia.id.ie.ig.ii.ik.in.io.is.it.iu.iw.ja.ji.jv.ka.kg.ki.kj.kk.kl.km.kn.ko.kr.ks.ku.kv.kw.ky.la.lb.lg.li.ln.lo.lt.lu.lv.mg.mh.mi.mk.ml.mn.mo.mr.ms.mt.my.na.nb.nd.ne.ng.nl.nn.no.nr.nv.ny.oc.oj.om.or.os.pa.pi.pl.ps.pt.qu.rm.rn.ro.ru.rw.sa.sc.sd.se.sg.si.sk.sl.sm.sn.so.sq.sr.ss.st.su.sv.sw.ta.te.tg.th.ti.tk.tl.tn.to.tr.ts.tt.tw.ty.ug.uk.ur.uz.ve.vi.vo.wa.wo.xh.yi.yo.za.zh.zu");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "slgne" + "'", str2, "slgne");
    }

    @Test
    public void test10095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10095");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("                                Zxxxxxxxxxxxxxxxx", "eNGLIILISH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                Zxxxxxxxxxxxxxxxx" + "'", str2, "                                Zxxxxxxxxxxxxxxxx");
    }

    @Test
    public void test10096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10096");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("                                                Hin                                                 ", "TWN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                Hin                                                 " + "'", str2, "                                                Hin                                                 ");
    }

    @Test
    public void test10097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10097");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("ChnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaChnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaChnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaChnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaChnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaChnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaChnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaChnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaChnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "...X.AZ.BA.BB.BD.BE.BF.BG.BH.BI.BJ.BL.BM.BN..");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10098");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "twn");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10099");
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
        java.util.Locale.LanguageRange[] languageRangeArray23 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList24 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList24, languageRangeArray23);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap26 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList27 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList24, strMap26);
        java.lang.String[] strArray35 = new java.lang.String[] { "English", "hi", "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "", "a", "", "China" };
        java.util.ArrayList<java.lang.String> strList36 = new java.util.ArrayList<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList36, strArray35);
        java.util.List<java.lang.Class<?>> wildcardClassList38 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList36);
        java.lang.String str39 = java.util.Locale.lookupTag(languageRangeList27, (java.util.Collection<java.lang.String>) strList36);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList41 = java.util.Locale.LanguageRange.parse("hi");
        boolean boolean43 = languageRangeList41.remove((java.lang.Object) "English");
        java.util.Locale.LanguageRange[] languageRangeArray44 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList45 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList45, languageRangeArray44);
        java.util.Locale locale48 = java.util.Locale.FRANCE;
        java.lang.String str49 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale48);
        java.util.Locale locale50 = java.util.Locale.US;
        java.util.Locale locale51 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale52 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale53 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale54 = java.util.Locale.getDefault();
        java.lang.String str55 = locale53.getDisplayCountry(locale54);
        java.lang.String str56 = locale53.toLanguageTag();
        java.util.Locale locale57 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale58 = java.util.Locale.getDefault();
        java.lang.String str59 = locale57.getDisplayCountry(locale58);
        java.util.Locale locale60 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale61 = java.util.Locale.getDefault();
        java.lang.String str62 = locale60.getDisplayCountry(locale61);
        java.util.Locale locale66 = new java.util.Locale("hi", "hi!", "cHINA");
        java.util.Locale locale67 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale68 = java.util.Locale.getDefault();
        java.lang.String str69 = locale67.getDisplayCountry(locale68);
        java.util.Locale locale71 = new java.util.Locale("");
        java.lang.String str72 = locale71.getDisplayVariant();
        java.util.Locale locale73 = java.util.Locale.KOREAN;
        java.util.Locale locale75 = new java.util.Locale("");
        java.util.Locale locale76 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale[] localeArray77 = new java.util.Locale[] { locale48, locale50, locale51, locale52, locale53, locale58, locale60, locale66, locale68, locale71, locale73, locale75, locale76 };
        java.util.ArrayList<java.util.Locale> localeList78 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList78, localeArray77);
        java.util.List<java.util.Locale> localeList80 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList45, (java.util.Collection<java.util.Locale>) localeList78);
        java.util.List<java.util.Locale> localeList81 = java.util.Locale.filter(languageRangeList41, (java.util.Collection<java.util.Locale>) localeList78);
        java.util.List<java.util.Locale> localeList82 = java.util.Locale.filter(languageRangeList27, (java.util.Collection<java.util.Locale>) localeList81);
        java.util.Locale locale83 = java.util.Locale.lookup(languageRangeList11, (java.util.Collection<java.util.Locale>) localeList81);
        java.lang.String str85 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) locale83, "enghI");
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
        org.junit.Assert.assertNotNull(languageRangeArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(languageRangeList27);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(wildcardClassList38);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(languageRangeList41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(languageRangeArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "english" + "'", str49, "english");
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale54);
// flaky:         org.junit.Assert.assertEquals(locale54.toString(), "referencepipeline.head");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "China" + "'", str55, "China");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "zh-CN" + "'", str56, "zh-CN");
        org.junit.Assert.assertNotNull(locale57);
        org.junit.Assert.assertEquals(locale57.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale58);
// flaky:         org.junit.Assert.assertEquals(locale58.toString(), "referencepipeline.head");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "China" + "'", str59, "China");
        org.junit.Assert.assertNotNull(locale60);
        org.junit.Assert.assertEquals(locale60.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale61);
// flaky:         org.junit.Assert.assertEquals(locale61.toString(), "referencepipeline.head");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "China" + "'", str62, "China");
        org.junit.Assert.assertEquals(locale66.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale67);
        org.junit.Assert.assertEquals(locale67.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale68);
// flaky:         org.junit.Assert.assertEquals(locale68.toString(), "referencepipeline.head");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "China" + "'", str69, "China");
        org.junit.Assert.assertEquals(locale71.toString(), "");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertNotNull(locale73);
        org.junit.Assert.assertEquals(locale73.toString(), "ko");
        org.junit.Assert.assertEquals(locale75.toString(), "");
        org.junit.Assert.assertNotNull(locale76);
        org.junit.Assert.assertEquals(locale76.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(localeList80);
        org.junit.Assert.assertNotNull(localeList81);
        org.junit.Assert.assertNotNull(localeList82);
        org.junit.Assert.assertNull(locale83);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "enghI" + "'", str85, "enghI");
    }

    @Test
    public void test10100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10100");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("DE ", "ia", 5);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DE " + "'", str3, "DE ");
    }

    @Test
    public void test10101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10101");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("REFERENCEPIPELINE.HEAD                        list###########", 94);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "REFERENCEPIPELINE.HEAD                        list###########                                 " + "'", str2, "REFERENCEPIPELINE.HEAD                        list###########                                 ");
    }

    @Test
    public void test10102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10102");
        java.util.Locale locale3 = new java.util.Locale("hindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHind", "locale.builder", "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hEnglish");
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleKeys();
        java.util.Set<java.lang.String> strSet5 = locale3.getUnicodeLocaleAttributes();
        org.junit.Assert.assertEquals(locale3.toString(), "hindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihind_LOCALE.BUILDER_ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hEnglish");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strSet5);
    }

    @Test
    public void test10103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10103");
        java.util.Locale locale3 = new java.util.Locale("CHINCHINCHINCHINCHICHINCHINCHINCHINC", "                                        Englisch (Kanada)                                        ", "Engl                                                          zh_C                                                          s                                                          zh_C                                                          ");
        org.junit.Assert.assertEquals(locale3.toString(), "chinchinchinchinchichinchinchinchinc_                                        ENGLISCH (KANADA)                                        _Engl                                                          zh_C                                                          s                                                          zh_C                                                          ");
    }

    @Test
    public void test10104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10104");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("deu", (int) (byte) 100, "\u4e2d\u6587\u53f0\u6e7e\u5730\u533aengliIlish)");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u4e2d\u6587\u53f0\u6e7e\u5730\u533a\u4e2d\u6587\u53f0\u6e7e\u5730\u533aengliIlish)" + "'", str3, "\u4e2d\u6587\u53f0\u6e7e\u5730\u533a\u4e2d\u6587\u53f0\u6e7e\u5730\u533aengliIlish)");
    }

    @Test
    public void test10105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10105");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("AVAJ", 8);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10106");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("Collecti");
        boolean boolean3 = org.apache.commons.lang3.StringUtils.startsWithAny("WZ.MZ.AZ.TY.EY.SW.FW.UV.NV.IV.GV.EV.CV.AV.ZU.YU.SU.MU.GU.AU.ZT.WT.VT.TT.RT.OT.NT.MT.LT.KT.JT.HT.GT.FT.DT.CT.ZS.YS.XS.VS.TS.SS.RS.OS.NS.MS.LS.KS.JS.IS.HS.GS.ES.DS.CS.BS.AS.WR.UR.SR.OR.ER.AQ.YP.WP.TP.SP.RP.NP.MP.LP.KP.HP.GP.FP.EP.AP.MO.ZN.UN.RN.PN.ON.LN.IN.GN.FN.EN.CN.AN.ZM.YM.XM.WM.VM.UM.TM.SM.RM.QM.PM.OM.NM.MM.LM.KM.HM.GM.FM.EM.DM.CM.AM.YL.VL.UL.TL.SL.RL.KL.IL.CL.BL.AL.ZK.YK.WK.RK.PK.NK.MK.IK.HK.GK.EK.PJ.OJ.MJ.EJ.TI.SI.RI.QI.OI.NI.MI.LI.EI.DI.UH.TH.RH.NH.MH.KH.YG.WG.UG.TG.SG.RG.QG.PG.NG.MG.LG.IG.HG.GG.FG.EG.DG.BG.AG.RF.OF.MF.KF.JF.IF.TE.SE.RE.HE.GE.EE.CE.ZD.OD.MD.KD.JD.ED.ZC.YC.XC.WC.VC.UC.RC.OC.NC.MC.LC.KC.IC.HC.GC.FC.DC.CC.AC.ZB.YB.WB.VB.TB.SB.RB.QB.OB.NB.MB.LB.JB.IB.HB.GB.FB.EB.DB.BB.AB.ZA.XA.WA.UA.TA.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaanhcGA.FA.EA.DA", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test10107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10107");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                redliuB.elacoL", "Esglish (Usitee Ststes)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test10108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10108");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortClassName(".....ZHCINESESEn");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ZHCINESESEn" + "'", str1, "ZHCINESESEn");
    }

    @Test
    public void test10109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10109");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("                           AHI!HI!                                                                 ", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                           AHI!HI!                                                                 " + "'", str2, "                           AHI!HI!                                                                 ");
    }

    @Test
    public void test10110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10110");
        java.util.Locale locale2 = new java.util.Locale("...                           ...", "\u4e2d\u56fd");
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "\u4e2d\u56fd");
    }

    @Test
    public void test10111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10111");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("china (Cina)", 43, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10112");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("alienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalien", 7, 117);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "alienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalien" + "'", str3, "alienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalien");
    }

    @Test
    public void test10113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10113");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("CHINCHINCHINCHINCHINCHINCHINCHINCHINAAAAAAAAA#", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10114");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("chinois", 1, 5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10115");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.setLanguageTag("zh-CN");
        java.util.Locale.Builder builder4 = builder1.clear();
        java.util.Locale.Builder builder6 = builder1.addUnicodeLocaleAttribute("zhcines");
        java.util.Locale.Builder builder7 = builder6.clear();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test10116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10116");
        java.util.Locale locale4 = new java.util.Locale("       hi!", "LOCALE#LANGUAGERANGE", "\u65e5\u6587");
        java.util.Locale locale5 = java.util.Locale.CANADA;
        java.util.Set<java.lang.String> strSet6 = locale5.getUnicodeLocaleAttributes();
        java.util.Locale locale8 = java.util.Locale.FRANCE;
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale8);
        java.lang.String str10 = locale5.getDisplayCountry(locale8);
        java.lang.String str11 = locale4.getDisplayVariant(locale8);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.upperCase("\u6cd5\u6587", locale8);
        java.util.Locale locale14 = java.util.Locale.CANADA;
        java.util.Set<java.lang.Character> charSet15 = locale14.getExtensionKeys();
        java.lang.String str16 = locale14.getISO3Country();
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.lowerCase("WT_hz", locale14);
        java.lang.String str18 = locale8.getDisplayScript(locale14);
        java.util.Set<java.lang.Character> charSet19 = locale8.getExtensionKeys();
        java.lang.String str20 = locale8.getScript();
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "\u65e5\u6587");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_CA");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "english" + "'", str9, "english");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Canada" + "'", str10, "Canada");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\u65e5\u6587" + "'", str11, "\u65e5\u6587");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\u6cd5\u6587" + "'", str12, "\u6cd5\u6587");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en_CA");
        org.junit.Assert.assertNotNull(charSet15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "CAN" + "'", str16, "CAN");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "wt_hz" + "'", str17, "wt_hz");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(charSet19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test10117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10117");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("ch (JAVA.LANG)", 21);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ch (JAVA.LANG)" + "'", str2, "ch (JAVA.LANG)");
    }

    @Test
    public void test10118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10118");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("und");
        boolean boolean3 = org.apache.commons.lang3.StringUtils.endsWithAny("chinchinchinchinchichinchinchinchinc", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test10119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10119");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("", "\u6cd5\u6587");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10120");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "e!e(Tiiwin", (java.lang.CharSequence) "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444HindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindi");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10121");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "cina");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10122");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("CHINCHINCHINCHINCHINCHINCHINCHINCHINAAAAAAAAA#", "TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRIAD.AE.AF");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10123");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("hi");
        java.lang.Object[] objArray2 = languageRangeList1.toArray();
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.parse("hi");
        java.lang.Object[] objArray5 = languageRangeList4.toArray();
        java.util.Spliterator<java.util.Locale.LanguageRange> languageRangeSpliterator6 = languageRangeList4.spliterator();
        boolean boolean7 = languageRangeList1.containsAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList4);
        java.util.Iterator<java.util.Locale.LanguageRange> languageRangeItor8 = languageRangeList1.iterator();
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(languageRangeItor8, "...X.AZ.BA.BB.BD.BE.BF.BG.BH.BI.BJ.BL.BM.BN...");
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(languageRangeSpliterator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(languageRangeItor8);
    }

    @Test
    public void test10124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10124");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.lang.String str1 = locale0.getLanguage();
        java.lang.String str2 = locale0.getLanguage();
        java.util.Locale locale3 = locale0.stripExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = locale3.getExtension('#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: #");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "it" + "'", str1, "it");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "it" + "'", str2, "it");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "it");
    }

    @Test
    public void test10125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10125");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("xxxxxxxxxxxxxxJapanesexxxxxxxxxxxxxxxxxxxxxxxxxxxxJapanesexxxxxxxxxxxxxxxxxxxxxxxxxxxxJelacoL");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=xxxxxxxxxxxxxxjapanesexxxxxxxxxxxxxxxxxxxxxxxxxxxxjapanesexxxxxxxxxxxxxxxxxxxxxxxxxxxxjelacol");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10126");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!henglish_IA_zh_CN");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!henglish_ia_zh_cn");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10127");
        char[] charArray9 = new char[] { '#', '#', ' ' };
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny("China", charArray9);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "ANIHC      ", charArray9);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "chinois (chine)", charArray9);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("\u5fb7\u6587\u5fb7\u56fd\u5fb7\u6587                                                                                                                                                                          ", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "## ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "## ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[#, #,  ]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test10128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10128");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("SHORT");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "short" + "'", str1, "short");
    }

    @Test
    public void test10129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10129");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("HI!STRING[]STRING[]S", "HArrayListfraHArrayListfraHArrayListfraHArrayListfraHArrayListfraHArrayListfraHArrayListfraHArrayListfraHArrayListfraHArrayList", "                                        Englisch (Kanada)                                        ", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HI!STRING[]STRING[]S" + "'", str4, "HI!STRING[]STRING[]S");
    }

    @Test
    public void test10130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10130");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("Zxxxxxxxxxxxxxxxxxxx", "...X.AZ.BA.BB.BD.BE.BF.BG.BH.BI.BJ.BL.BM.BN..._italiano", 3);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test10131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10131");
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
        java.lang.String str24 = locale16.getCountry();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "anglais" + "'", str5, "anglais");
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
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "anglais" + "'", str19, "anglais");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "a" + "'", str21, "a");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "German" + "'", str23, "German");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test10132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10132");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("liIlish", "", (int) ' ');
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test10133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10133");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("xxxxxxxxxxxxxxJapanesexxxxxxxxxxxxxxxxxxxxxxxxxxxxJapanesexxxxxxxxxxxxxxxxxxxxxxxxxxxxJelacoL", "     Chine");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10134");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("Zxxxxxxxxxxxxxxxxxxx", "xxxahi!hiCinaxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test10135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10135");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                                              cHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "#####################################################################################################################################################################################################################################################################################################################################hi!italiahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIital..#####################################################################################################################################################################################################################################################################################################################################", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10136");
        java.util.Locale locale0 = java.util.Locale.CANADA;
        boolean boolean1 = locale0.hasExtensions();
        java.util.Locale locale2 = java.util.Locale.ITALIAN;
        java.lang.String str3 = locale0.getDisplayScript(locale2);
        java.util.Locale.Builder builder4 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        java.util.Locale locale7 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale8 = java.util.Locale.getDefault();
        java.lang.String str9 = locale7.getDisplayCountry(locale8);
        java.lang.String str10 = locale7.toLanguageTag();
        boolean boolean11 = locale7.hasExtensions();
        java.lang.String str12 = locale7.getDisplayCountry();
        java.util.Set<java.lang.String> strSet13 = locale7.getUnicodeLocaleKeys();
        java.util.Locale.Builder builder14 = builder6.setLocale(locale7);
        java.lang.String str15 = locale2.getDisplayVariant(locale7);
        java.lang.String str17 = locale2.getExtension('x');
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "it");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale8);
// flaky:         org.junit.Assert.assertEquals(locale8.toString(), "fr_FR");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Chine" + "'", str9, "Chine");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "zh-CN" + "'", str10, "zh-CN");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Chine" + "'", str12, "Chine");
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test10137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10137");
        char[] charArray12 = new char[] { '#', '#', ' ' };
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("China", charArray12);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "ANIHC      ", charArray12);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny("CHINA", charArray12);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny("\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587          ", charArray12);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "Cina", charArray12);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsAny("Chnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray12);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "xxxIhxxxxCHINA", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "## ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "## ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[#, #,  ]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test10138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10138");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "ENGLxxxxENGLISHSxxxxENGLISH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "eNGLxxxxENGLISHSxxxxENGLISH" + "'", str1, "eNGLxxxxENGLISHSxxxxENGLISH");
    }

    @Test
    public void test10139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10139");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate(")                 A                 ( !ih!iha", (int) (short) -1, 350);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ")                 A                 ( !ih!iha" + "'", str3, ")                 A                 ( !ih!iha");
    }

    @Test
    public void test10140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10140");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("hi");
        boolean boolean3 = languageRangeList1.remove((java.lang.Object) "English");
        int int4 = languageRangeList1.size();
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor5 = languageRangeList1.listIterator();
        java.util.Locale locale6 = java.util.Locale.CANADA;
        java.lang.String str7 = locale6.getDisplayLanguage();
        java.util.Set<java.lang.String> strSet8 = locale6.getUnicodeLocaleKeys();
        java.util.Locale.LanguageRange languageRange10 = new java.util.Locale.LanguageRange("English");
        java.lang.String str12 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) languageRange10, "");
        java.util.Locale.LanguageRange languageRange14 = new java.util.Locale.LanguageRange("a");
        java.util.Locale.LanguageRange languageRange16 = new java.util.Locale.LanguageRange("a");
        java.util.Locale.LanguageRange[] languageRangeArray17 = new java.util.Locale.LanguageRange[] { languageRange10, languageRange14, languageRange16 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList18 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList18, languageRangeArray17);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor20 = languageRangeList18.listIterator();
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream21 = languageRangeList18.parallelStream();
        java.util.List<java.util.Locale.LanguageRange> languageRangeList23 = java.util.Locale.LanguageRange.parse("hi");
        int int25 = languageRangeList23.indexOf((java.lang.Object) '4');
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
        java.util.List<java.util.Locale> localeList63 = java.util.Locale.filter(languageRangeList23, (java.util.Collection<java.util.Locale>) localeList62);
        java.util.Locale.FilteringMode filteringMode64 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList65 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList18, (java.util.Collection<java.util.Locale>) localeList63, filteringMode64);
        java.util.List<java.lang.String> strList66 = java.util.Locale.filterTags(languageRangeList1, (java.util.Collection<java.lang.String>) strSet8, filteringMode64);
        java.util.Locale.Builder builder67 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder68 = builder67.clearExtensions();
        java.util.Locale.Builder builder69 = builder67.clearExtensions();
        java.util.Locale.Builder builder70 = builder69.clearExtensions();
        java.util.Locale locale71 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str72 = locale71.getISO3Language();
        java.util.Locale.Builder builder73 = builder70.setLocale(locale71);
        java.util.Locale.Builder builder75 = builder73.setRegion("ja");
        java.util.Locale.Builder builder76 = builder75.clearExtensions();
        boolean boolean77 = languageRangeList1.remove((java.lang.Object) builder76);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder79 = builder76.addUnicodeLocaleAttribute("           zxxxxxxxxxxxxxxxxxxx");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute:            zxxxxxxxxxxxxxxxxxxx [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(languageRangeItor5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "anglais" + "'", str7, "anglais");
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Locale.LanguageRange" + "'", str12, "Locale.LanguageRange");
        org.junit.Assert.assertNotNull(languageRangeArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(languageRangeItor20);
        org.junit.Assert.assertNotNull(languageRangeStream21);
        org.junit.Assert.assertNotNull(languageRangeList23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
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
// flaky:         org.junit.Assert.assertEquals(locale36.toString(), "fr_FR");
// flaky:         org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Chine" + "'", str37, "Chine");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "zh-CN" + "'", str38, "zh-CN");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale40);
// flaky:         org.junit.Assert.assertEquals(locale40.toString(), "fr_FR");
// flaky:         org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Chine" + "'", str41, "Chine");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale43);
// flaky:         org.junit.Assert.assertEquals(locale43.toString(), "fr_FR");
// flaky:         org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Chine" + "'", str44, "Chine");
        org.junit.Assert.assertEquals(locale48.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale50);
// flaky:         org.junit.Assert.assertEquals(locale50.toString(), "fr_FR");
// flaky:         org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Chine" + "'", str51, "Chine");
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
        org.junit.Assert.assertTrue("'" + filteringMode64 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode64.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList65);
        org.junit.Assert.assertNotNull(strList66);
        org.junit.Assert.assertNotNull(builder68);
        org.junit.Assert.assertNotNull(builder69);
        org.junit.Assert.assertNotNull(builder70);
        org.junit.Assert.assertNotNull(locale71);
        org.junit.Assert.assertEquals(locale71.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "zho" + "'", str72, "zho");
        org.junit.Assert.assertNotNull(builder73);
        org.junit.Assert.assertNotNull(builder75);
        org.junit.Assert.assertNotNull(builder76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
    }

    @Test
    public void test10141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10141");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("a", "", 0);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, 'a', (int) (byte) 1, (int) (byte) -1);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "Cina");
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, 'u');
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, 'a', 7, 13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 7");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "a" + "'", str9, "a");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "a" + "'", str11, "a");
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test10142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10142");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap3);
        int int5 = languageRangeList1.size();
        java.util.List<java.util.Locale.LanguageRange> languageRangeList7 = java.util.Locale.LanguageRange.parse("hi");
        boolean boolean9 = languageRangeList7.remove((java.lang.Object) "English");
        boolean boolean10 = languageRangeList1.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList7);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream11 = languageRangeList7.stream();
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(languageRangeList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(languageRangeStream11);
    }

    @Test
    public void test10143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10143");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("ANIHCxxxxhIxxx", (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10144");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "\u4e2d\u6587\u53f0\u6e7e\u5730\u533a)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u4e2d\u6587\u53f0\u6e7e\u5730\u533a)" + "'", str1, "\u4e2d\u6587\u53f0\u6e7e\u5730\u533a)");
    }

    @Test
    public void test10145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10145");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("ZHCINESESE", 7, 92);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ESE" + "'", str3, "ESE");
    }

    @Test
    public void test10146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10146");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("zh-cnenglish", "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!henglish_IA_zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10147");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("                                                                                   HINDI (HI!,CHINA)", (int) (byte) 1, 350);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                  HINDI (HI!,CHINA)" + "'", str3, "                                                                                  HINDI (HI!,CHINA)");
    }

    @Test
    public void test10148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10148");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor17 = languageRangeList13.listIterator(27);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 27");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test10149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10149");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "               class java.lang.String               ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10150");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) ".............................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................ions.EmptySet", "HI!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test10151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10151");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "ese(Taiwan$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10152");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("en-ca", "inglenglese");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "en-ca" + "'", str2, "en-ca");
    }

    @Test
    public void test10153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10153");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("xxxxxxxxinglese (canada)xxxxxxxx", "FR");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10154");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!              aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test10155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10155");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("Englis", "GBR");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Englis" + "'", str2, "Englis");
    }

    @Test
    public void test10156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10156");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap3);
        int int5 = languageRangeList1.size();
        java.util.List<java.util.Locale.LanguageRange> languageRangeList7 = java.util.Locale.LanguageRange.parse("hi");
        boolean boolean9 = languageRangeList7.remove((java.lang.Object) "English");
        boolean boolean10 = languageRangeList1.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList7);
        java.util.Locale.LanguageRange[] languageRangeArray11 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList12 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList12, languageRangeArray11);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap14 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList15 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList12, strMap14);
        int int16 = languageRangeList12.size();
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor17 = languageRangeList12.listIterator();
        java.util.Locale.LanguageRange languageRange19 = new java.util.Locale.LanguageRange("a");
        java.util.Locale.LanguageRange languageRange21 = new java.util.Locale.LanguageRange("English");
        java.lang.String str23 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) languageRange21, "");
        java.util.Locale.LanguageRange languageRange25 = new java.util.Locale.LanguageRange("English");
        java.util.Locale.LanguageRange[] languageRangeArray26 = new java.util.Locale.LanguageRange[] { languageRange19, languageRange21, languageRange25 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList27 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList27, languageRangeArray26);
        boolean boolean29 = languageRangeList12.retainAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList27);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor30 = languageRangeList27.listIterator();
        java.util.Locale.LanguageRange languageRange31 = languageRangeItor30.next();
        java.util.Locale.LanguageRange languageRange32 = languageRangeItor30.next();
        boolean boolean33 = languageRangeList1.add(languageRange32);
        java.lang.String str34 = languageRange32.getRange();
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(languageRangeList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(languageRangeArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(languageRangeList15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(languageRangeItor17);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Locale.LanguageRange" + "'", str23, "Locale.LanguageRange");
        org.junit.Assert.assertNotNull(languageRangeArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(languageRangeItor30);
        org.junit.Assert.assertNotNull(languageRange31);
        org.junit.Assert.assertNotNull(languageRange32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "english" + "'", str34, "english");
    }

    @Test
    public void test10157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10157");
        char[] charArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)Character", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10158");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder0.removeUnicodeLocaleAttribute("English");
        java.util.Locale locale6 = java.util.Locale.FRANCE;
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale6);
        java.lang.String str8 = locale6.getDisplayScript();
        java.util.Set<java.lang.String> strSet9 = locale6.getUnicodeLocaleAttributes();
        java.util.Locale.Builder builder10 = builder0.setLocale(locale6);
        java.lang.String str11 = locale6.getDisplayLanguage();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "english" + "'", str7, "english");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(builder10);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\u6cd5\u6587" + "'", str11, "\u6cd5\u6587");
    }

    @Test
    public void test10159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10159");
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
        java.util.Locale.LanguageRange[] languageRangeArray17 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList18 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList18, languageRangeArray17);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap20 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList21 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList18, strMap20);
        java.util.Locale.LanguageRange[] languageRangeArray22 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList23 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList23, languageRangeArray22);
        boolean boolean25 = languageRangeList18.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList23);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream26 = languageRangeList23.stream();
        boolean boolean27 = languageRangeList4.containsAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList23);
        java.util.Locale.LanguageRange languageRange29 = new java.util.Locale.LanguageRange("English");
        java.lang.String str30 = languageRange29.getRange();
        boolean boolean31 = languageRangeList4.add(languageRange29);
        java.util.Locale.LanguageRange[] languageRangeArray32 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList33 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList33, languageRangeArray32);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap35 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList36 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList33, strMap35);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream37 = languageRangeList33.stream();
        boolean boolean38 = languageRangeList33.isEmpty();
        java.util.Locale.LanguageRange[] languageRangeArray39 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList40 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList40, languageRangeArray39);
        java.util.Locale locale43 = java.util.Locale.FRANCE;
        java.lang.String str44 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale43);
        java.util.Locale locale45 = java.util.Locale.US;
        java.util.Locale locale46 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale47 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale48 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale49 = java.util.Locale.getDefault();
        java.lang.String str50 = locale48.getDisplayCountry(locale49);
        java.lang.String str51 = locale48.toLanguageTag();
        java.util.Locale locale52 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale53 = java.util.Locale.getDefault();
        java.lang.String str54 = locale52.getDisplayCountry(locale53);
        java.util.Locale locale55 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale56 = java.util.Locale.getDefault();
        java.lang.String str57 = locale55.getDisplayCountry(locale56);
        java.util.Locale locale61 = new java.util.Locale("hi", "hi!", "cHINA");
        java.util.Locale locale62 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale63 = java.util.Locale.getDefault();
        java.lang.String str64 = locale62.getDisplayCountry(locale63);
        java.util.Locale locale66 = new java.util.Locale("");
        java.lang.String str67 = locale66.getDisplayVariant();
        java.util.Locale locale68 = java.util.Locale.KOREAN;
        java.util.Locale locale70 = new java.util.Locale("");
        java.util.Locale locale71 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale[] localeArray72 = new java.util.Locale[] { locale43, locale45, locale46, locale47, locale48, locale53, locale55, locale61, locale63, locale66, locale68, locale70, locale71 };
        java.util.ArrayList<java.util.Locale> localeList73 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList73, localeArray72);
        java.util.List<java.util.Locale> localeList75 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList40, (java.util.Collection<java.util.Locale>) localeList73);
        java.lang.String[] strArray83 = new java.lang.String[] { "English", "hi", "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "", "a", "", "China" };
        java.util.ArrayList<java.lang.String> strList84 = new java.util.ArrayList<java.lang.String>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList84, strArray83);
        java.util.List<java.lang.Class<?>> wildcardClassList86 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList84);
        java.util.Locale.FilteringMode filteringMode87 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList88 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList40, (java.util.Collection<java.lang.String>) strList84, filteringMode87);
        java.util.Locale.FilteringMode filteringMode89 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList90 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList33, (java.util.Collection<java.lang.String>) strList84, filteringMode89);
        java.lang.String str91 = java.util.Locale.lookupTag(languageRangeList4, (java.util.Collection<java.lang.String>) strList84);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList93 = java.util.Locale.LanguageRange.parse("zh-CN");
        boolean boolean94 = languageRangeList4.retainAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList93);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream95 = languageRangeList4.parallelStream();
        java.util.Iterator<java.util.Locale.LanguageRange> languageRangeItor96 = languageRangeList4.iterator();
        java.lang.Class<?> wildcardClass97 = languageRangeList4.getClass();
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClassList15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(languageRangeArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(languageRangeList21);
        org.junit.Assert.assertNotNull(languageRangeArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(languageRangeStream26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "english" + "'", str30, "english");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(languageRangeArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(languageRangeList36);
        org.junit.Assert.assertNotNull(languageRangeStream37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(languageRangeArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "english" + "'", str44, "english");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale49);
// flaky:         org.junit.Assert.assertEquals(locale49.toString(), "zh_ZH");
// flaky:         org.junit.Assert.assertEquals("'" + str50 + "' != '" + "\u4e2d\u56fd" + "'", str50, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "zh-CN" + "'", str51, "zh-CN");
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale53);
// flaky:         org.junit.Assert.assertEquals(locale53.toString(), "zh_ZH");
// flaky:         org.junit.Assert.assertEquals("'" + str54 + "' != '" + "\u4e2d\u56fd" + "'", str54, "\u4e2d\u56fd");
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale56);
// flaky:         org.junit.Assert.assertEquals(locale56.toString(), "zh_ZH");
// flaky:         org.junit.Assert.assertEquals("'" + str57 + "' != '" + "\u4e2d\u56fd" + "'", str57, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals(locale61.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale62);
        org.junit.Assert.assertEquals(locale62.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale63);
// flaky:         org.junit.Assert.assertEquals(locale63.toString(), "zh_ZH");
// flaky:         org.junit.Assert.assertEquals("'" + str64 + "' != '" + "\u4e2d\u56fd" + "'", str64, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals(locale66.toString(), "");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertNotNull(locale68);
        org.junit.Assert.assertEquals(locale68.toString(), "ko");
        org.junit.Assert.assertEquals(locale70.toString(), "");
        org.junit.Assert.assertNotNull(locale71);
        org.junit.Assert.assertEquals(locale71.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(localeList75);
        org.junit.Assert.assertNotNull(strArray83);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertNotNull(wildcardClassList86);
        org.junit.Assert.assertTrue("'" + filteringMode87 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode87.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList88);
        org.junit.Assert.assertTrue("'" + filteringMode89 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode89.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList90);
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "english" + "'", str91, "english");
        org.junit.Assert.assertNotNull(languageRangeList93);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
        org.junit.Assert.assertNotNull(languageRangeStream95);
        org.junit.Assert.assertNotNull(languageRangeItor96);
        org.junit.Assert.assertNotNull(wildcardClass97);
    }

    @Test
    public void test10160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10160");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("locale.Builder");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "locale.Builder" + "'", str1, "locale.Builder");
    }

    @Test
    public void test10161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10161");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("english", "cHINA", (int) (byte) 1);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("Chin", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "english" + "'", str6, "english");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "english" + "'", str7, "english");
    }

    @Test
    public void test10162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10162");
        java.util.Locale locale1 = new java.util.Locale("hi!hi! (                 A                 )");
        java.lang.String str2 = locale1.getDisplayVariant();
        org.junit.Assert.assertEquals(locale1.toString(), "hi!hi! (                 a                 )");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10163");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.setLanguageTag("zh-CN");
        java.util.Locale.Builder builder5 = builder3.setLanguage("it");
        java.util.Locale.Builder builder7 = builder3.setLanguageTag("hI");
        java.util.Locale.Builder builder8 = builder3.clearExtensions();
        java.util.Locale.Category category9 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale10 = java.util.Locale.ENGLISH;
        java.util.Locale.setDefault(category9, locale10);
        java.util.Locale locale12 = java.util.Locale.JAPANESE;
        java.util.Locale locale14 = java.util.Locale.TAIWAN;
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.upperCase("", locale14);
        java.lang.String str16 = locale12.getDisplayVariant(locale14);
        java.util.Locale.setDefault(category9, locale14);
        java.util.Locale locale18 = locale14.stripExtensions();
        java.util.Locale.Builder builder19 = builder8.setLocale(locale18);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder21 = builder8.setVariant("cHIChinChinChinChinChinChinChinChinChinaaaaaaaaa#A");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: cHIChinChinChinChinChinChinChinChinChinaaaaaaaaa#A [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertTrue("'" + category9 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category9.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "ja");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(builder19);
    }

    @Test
    public void test10164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10164");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("chnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=chnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10165");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("44444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444444444444" + "'", str1, "44444444444444444444444444444444444");
    }

    @Test
    public void test10166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10166");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("it_CN", "GNAL.AVAJSTRING[]STRING[]STRING[]", (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10167");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "chinois (Chine   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10168");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("nglese", "#################################################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10169");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("avaj");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ava" + "'", str1, "ava");
    }

    @Test
    public void test10170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10170");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "\u7fa9\u5927\u5229\u6587", "cHIChinChinChinChinChinChinChinChinChinaaaaaaaaa#A");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10171");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale.Builder builder3 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder5 = builder1.setRegion("zh");
        java.util.Locale locale6 = builder1.build();
        java.util.Locale locale7 = java.util.Locale.CANADA;
        boolean boolean8 = locale7.hasExtensions();
        java.util.Locale locale9 = java.util.Locale.ITALIAN;
        java.lang.String str10 = locale7.getDisplayScript(locale9);
        java.util.Set<java.lang.String> strSet11 = locale7.getUnicodeLocaleAttributes();
        java.lang.String str12 = locale7.getVariant();
        java.lang.String str13 = locale6.getDisplayCountry(locale7);
        java.util.Locale.setDefault(locale6);
        java.util.Locale locale15 = java.util.Locale.TAIWAN;
        java.lang.String str16 = locale15.getVariant();
        java.util.Locale locale18 = java.util.Locale.FRANCE;
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale18);
        java.util.Locale.setDefault(locale18);
        java.lang.String str21 = locale15.getDisplayScript(locale18);
        java.util.Locale locale22 = java.util.Locale.CANADA;
        java.util.Set<java.lang.String> strSet23 = locale22.getUnicodeLocaleAttributes();
        java.util.Locale locale25 = java.util.Locale.FRANCE;
        java.lang.String str26 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale25);
        java.lang.String str27 = locale22.getDisplayCountry(locale25);
        java.lang.String str28 = locale18.getDisplayLanguage(locale25);
        boolean boolean29 = locale18.hasExtensions();
        boolean boolean30 = locale6.equals((java.lang.Object) boolean29);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_ZH");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "it");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ZH" + "'", str13, "ZH");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "english" + "'", str19, "english");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "en_CA");
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "english" + "'", str26, "english");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Canada" + "'", str27, "Canada");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "fran\347ais" + "'", str28, "fran\347ais");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test10172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10172");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange69 = languageRangeList50.remove(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 3, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertEquals(locale21.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Chine" + "'", str22, "Chine");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "zh-CN" + "'", str23, "zh-CN");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Chine" + "'", str26, "Chine");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Chine" + "'", str29, "Chine");
        org.junit.Assert.assertEquals(locale33.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Chine" + "'", str36, "Chine");
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
    }

    @Test
    public void test10173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10173");
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
        java.lang.Class<?>[] wildcardClassArray32 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray3);
        java.lang.Class[] classArray34 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray35 = (java.lang.Class<?>[]) classArray34;
        java.lang.Class<?>[] wildcardClassArray36 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray34);
        java.lang.Class<?>[] wildcardClassArray37 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray34);
        java.lang.Class[] classArray39 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray40 = (java.lang.Class<?>[]) classArray39;
        java.lang.Class<?>[] wildcardClassArray41 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray39);
        java.lang.Class<?>[] wildcardClassArray42 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray39);
        java.lang.String str44 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) classArray39, "zh-CN");
        boolean boolean45 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray37, (java.lang.Class<?>[]) classArray39);
        boolean boolean47 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray3, wildcardClassArray37, false);
        java.lang.Class[] classArray49 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray50 = (java.lang.Class<?>[]) classArray49;
        java.lang.Class<?>[] wildcardClassArray51 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray49);
        java.lang.Class<?>[] wildcardClassArray52 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray49);
        java.lang.Class[] classArray55 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray56 = (java.lang.Class<?>[]) classArray55;
        java.lang.Class<?>[] wildcardClassArray57 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray55);
        java.lang.String str58 = org.apache.commons.lang3.StringUtils.concatWith("hi!", (java.lang.Object[]) classArray55);
        boolean boolean59 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray49, (java.lang.Class<?>[]) classArray55);
        java.lang.Class<?>[] wildcardClassArray60 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers((java.lang.Class<?>[]) classArray55);
        java.lang.Class<?>[] wildcardClassArray61 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray60);
        java.lang.Class<?>[] wildcardClassArray62 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray60);
        java.lang.String str64 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray60, 'u');
        boolean boolean65 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray37, wildcardClassArray60);
        java.lang.Class<?>[] wildcardClassArray66 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray37);
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
        org.junit.Assert.assertNotNull(wildcardClassArray32);
        org.junit.Assert.assertNotNull(classArray34);
        org.junit.Assert.assertNotNull(wildcardClassArray35);
        org.junit.Assert.assertNotNull(wildcardClassArray36);
        org.junit.Assert.assertNotNull(wildcardClassArray37);
        org.junit.Assert.assertNotNull(classArray39);
        org.junit.Assert.assertNotNull(wildcardClassArray40);
        org.junit.Assert.assertNotNull(wildcardClassArray41);
        org.junit.Assert.assertNotNull(wildcardClassArray42);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(classArray49);
        org.junit.Assert.assertNotNull(wildcardClassArray50);
        org.junit.Assert.assertNotNull(wildcardClassArray51);
        org.junit.Assert.assertNotNull(wildcardClassArray52);
        org.junit.Assert.assertNotNull(classArray55);
        org.junit.Assert.assertNotNull(wildcardClassArray56);
        org.junit.Assert.assertNotNull(wildcardClassArray57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray60);
        org.junit.Assert.assertNotNull(wildcardClassArray61);
        org.junit.Assert.assertNotNull(wildcardClassArray62);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray66);
    }

    @Test
    public void test10174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10174");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("                                                                                                RGLA", "################################################################################################################lang");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                RGLA" + "'", str2, "                                                                                                RGLA");
    }

    @Test
    public void test10175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10175");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("Chinese", 32, 'x');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "xxxxxxxxxxxxxxxxxxxxxxxxxChinese" + "'", str3, "xxxxxxxxxxxxxxxxxxxxxxxxxChinese");
    }

    @Test
    public void test10176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10176");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("zh-cnenglh", 0, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zh-cnenglh" + "'", str3, "zh-cnenglh");
    }

    @Test
    public void test10177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10177");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "\u4e2d\u6587\u4e2d\u56fd)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10178");
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
        java.lang.String str34 = org.apache.commons.lang3.StringUtils.join((java.util.Iterator<java.util.Locale.LanguageRange>) languageRangeItor32, "lang                                                                                                ");
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
    }

    @Test
    public void test10179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10179");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.lang.Class<?>[] wildcardClassArray3 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray1);
        java.lang.Class<?>[] wildcardClassArray4 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray1);
        java.lang.Class[] classArray7 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray8 = (java.lang.Class<?>[]) classArray7;
        java.lang.Class<?>[] wildcardClassArray9 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray7);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.concatWith("hi!", (java.lang.Object[]) classArray7);
        boolean boolean11 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray1, (java.lang.Class<?>[]) classArray7);
        java.lang.Class[] classArray13 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray14 = (java.lang.Class<?>[]) classArray13;
        java.lang.Class<?>[] wildcardClassArray15 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray13);
        java.lang.Class<?> wildcardClass16 = null;
        java.lang.Class[] classArray18 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray19 = (java.lang.Class<?>[]) classArray18;
        wildcardClassArray19[0] = wildcardClass16;
        boolean boolean23 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray15, wildcardClassArray19, false);
        java.lang.Class[] classArray25 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray26 = (java.lang.Class<?>[]) classArray25;
        java.lang.Class<?>[] wildcardClassArray27 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray25);
        boolean boolean28 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray15, (java.lang.Class<?>[]) classArray25);
        boolean boolean29 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray1, (java.lang.Class<?>[]) classArray25);
        java.lang.Class<?>[] wildcardClassArray30 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers((java.lang.Class<?>[]) classArray25);
        java.lang.Class<?>[] wildcardClassArray31 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers((java.lang.Class<?>[]) classArray25);
        java.lang.Class<?>[] wildcardClassArray32 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray31);
        java.lang.Class<?>[] wildcardClassArray33 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray31);
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertNotNull(wildcardClassArray4);
        org.junit.Assert.assertNotNull(classArray7);
        org.junit.Assert.assertNotNull(wildcardClassArray8);
        org.junit.Assert.assertNotNull(wildcardClassArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(classArray13);
        org.junit.Assert.assertNotNull(wildcardClassArray14);
        org.junit.Assert.assertNotNull(wildcardClassArray15);
        org.junit.Assert.assertNotNull(classArray18);
        org.junit.Assert.assertNotNull(wildcardClassArray19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(classArray25);
        org.junit.Assert.assertNotNull(wildcardClassArray26);
        org.junit.Assert.assertNotNull(wildcardClassArray27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray30);
        org.junit.Assert.assertNotNull(wildcardClassArray31);
        org.junit.Assert.assertNotNull(wildcardClassArray32);
        org.junit.Assert.assertNotNull(wildcardClassArray33);
    }

    @Test
    public void test10180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10180");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("Chinese", "tsiLyarrAH");
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("Ci_aCi_aCi_aCi_aCi_aCi_aCi_aCi_aCi_aCi_a", strArray4);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.startsWithAny("", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test10181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10181");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("ese (Taiwanese (Taiwanese (Taiwanese (Taiwanese (Taiwanese (Taiwanese (Taiwanese (Taiwan", 44);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ese (Taiwanese (Taiwanese (Taiwanese (Taiwan" + "'", str2, "ese (Taiwanese (Taiwanese (Taiwanese (Taiwan");
    }

    @Test
    public void test10182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10182");
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
        java.util.Locale.LanguageRange[] languageRangeArray24 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList25 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList25, languageRangeArray24);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap27 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList28 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList25, strMap27);
        java.lang.String[] strArray36 = new java.lang.String[] { "English", "hi", "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "", "a", "", "China" };
        java.util.ArrayList<java.lang.String> strList37 = new java.util.ArrayList<java.lang.String>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList37, strArray36);
        java.util.List<java.lang.Class<?>> wildcardClassList39 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList37);
        java.lang.String str40 = java.util.Locale.lookupTag(languageRangeList28, (java.util.Collection<java.lang.String>) strList37);
        java.util.List<java.lang.Class<?>> wildcardClassList41 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList37);
        java.lang.String str43 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) strList37, "tring[]");
        java.util.List<java.lang.String> strList44 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList37);
        java.lang.String str46 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) languageRangeList1, "ENGLHI!STRING[]STRING[]SSHI!STRING[]STRING[]S");
        java.util.Locale.LanguageRange languageRange49 = new java.util.Locale.LanguageRange("zho");
        java.lang.String str50 = languageRange49.getRange();
        java.lang.String str51 = languageRange49.getRange();
        java.lang.String str52 = languageRange49.getRange();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange53 = languageRangeList1.set((int) (byte) 10, languageRange49);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 1");
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
        org.junit.Assert.assertNotNull(languageRangeArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(languageRangeList28);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(wildcardClassList39);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNotNull(wildcardClassList41);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "java.util" + "'", str43, "java.util");
        org.junit.Assert.assertNotNull(strList44);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "java.util" + "'", str46, "java.util");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "zho" + "'", str50, "zho");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "zho" + "'", str51, "zho");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "zho" + "'", str52, "zho");
    }

    @Test
    public void test10183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10183");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("               fr_CA               ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "fr_CA" + "'", str1, "fr_CA");
    }

    @Test
    public void test10184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10184");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("xxxxxxxxinglese (canada)xxxxxxxx", "                                                                                  HINDI (HI!,CHINA)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "xxxxxxxxinglese (canada)xxxxxxxx" + "'", str2, "xxxxxxxxinglese (canada)xxxxxxxx");
    }

    @Test
    public void test10185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10185");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("NWTSNWTLGNE", (int) 'x');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NWTSNWTLGNE" + "'", str2, "NWTSNWTLGNE");
    }

    @Test
    public void test10186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10186");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("rglAsA", "aaaaaaaaaaaaaaaaaaaingleseaaaaaaaaaaaaaaaaaaaa", (int) (byte) 1, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "raaaaaaaaaaaaaaaaaaaingleseaaaaaaaaaaaaaaaaaaaaglAsA" + "'", str4, "raaaaaaaaaaaaaaaaaaaingleseaaaaaaaaaaaaaaaaaaaaglAsA");
    }

    @Test
    public void test10187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10187");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "EN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "eN" + "'", str1, "eN");
    }

    @Test
    public void test10188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10188");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxzh-hcnczih", "redliub");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxzh-hcnczih" + "'", str2, "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxzh-hcnczih");
    }

    @Test
    public void test10189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10189");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("cinaxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", "lOCALE");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "cinaxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx" + "'", str2, "cinaxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
    }

    @Test
    public void test10190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10190");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                                                                            en_CA", 92, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                            en_CA" + "'", str3, "                                                                                            en_CA");
    }

    @Test
    public void test10191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10191");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("AD.AE.AF.AGchnaafraAD.AE.AF.AGchnaaa", (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=ad.ae.af.agchnaafraad.ae.af.agchnaaa");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10192");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("English");
        java.lang.String str3 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) languageRange1, "");
        java.util.Locale.LanguageRange languageRange5 = new java.util.Locale.LanguageRange("a");
        java.util.Locale.LanguageRange languageRange7 = new java.util.Locale.LanguageRange("a");
        java.util.Locale.LanguageRange[] languageRangeArray8 = new java.util.Locale.LanguageRange[] { languageRange1, languageRange5, languageRange7 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList9 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList9, languageRangeArray8);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor11 = languageRangeList9.listIterator();
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream12 = languageRangeList9.parallelStream();
        java.util.Spliterator<java.util.Locale.LanguageRange> languageRangeSpliterator13 = languageRangeList9.spliterator();
        java.util.Locale.LanguageRange[] languageRangeArray14 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList15 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList15, languageRangeArray14);
        java.util.Locale locale18 = java.util.Locale.FRANCE;
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale18);
        java.util.Locale locale20 = java.util.Locale.US;
        java.util.Locale locale21 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale22 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale23 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale24 = java.util.Locale.getDefault();
        java.lang.String str25 = locale23.getDisplayCountry(locale24);
        java.lang.String str26 = locale23.toLanguageTag();
        java.util.Locale locale27 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale28 = java.util.Locale.getDefault();
        java.lang.String str29 = locale27.getDisplayCountry(locale28);
        java.util.Locale locale30 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale31 = java.util.Locale.getDefault();
        java.lang.String str32 = locale30.getDisplayCountry(locale31);
        java.util.Locale locale36 = new java.util.Locale("hi", "hi!", "cHINA");
        java.util.Locale locale37 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale38 = java.util.Locale.getDefault();
        java.lang.String str39 = locale37.getDisplayCountry(locale38);
        java.util.Locale locale41 = new java.util.Locale("");
        java.lang.String str42 = locale41.getDisplayVariant();
        java.util.Locale locale43 = java.util.Locale.KOREAN;
        java.util.Locale locale45 = new java.util.Locale("");
        java.util.Locale locale46 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale[] localeArray47 = new java.util.Locale[] { locale18, locale20, locale21, locale22, locale23, locale28, locale30, locale36, locale38, locale41, locale43, locale45, locale46 };
        java.util.ArrayList<java.util.Locale> localeList48 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList48, localeArray47);
        java.util.List<java.util.Locale> localeList50 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList15, (java.util.Collection<java.util.Locale>) localeList48);
        java.lang.String[] strArray58 = new java.lang.String[] { "English", "hi", "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "", "a", "", "China" };
        java.util.ArrayList<java.lang.String> strList59 = new java.util.ArrayList<java.lang.String>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList59, strArray58);
        java.util.List<java.lang.Class<?>> wildcardClassList61 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList59);
        java.util.Locale.FilteringMode filteringMode62 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList63 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList15, (java.util.Collection<java.lang.String>) strList59, filteringMode62);
        java.lang.String str64 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList9, (java.util.Collection<java.lang.String>) strList59);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList66 = java.util.Locale.LanguageRange.parse("hi");
        boolean boolean68 = languageRangeList66.remove((java.lang.Object) "English");
        java.util.Locale.LanguageRange languageRange70 = languageRangeList66.get(0);
        boolean boolean71 = languageRangeList9.remove((java.lang.Object) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Locale.LanguageRange" + "'", str3, "Locale.LanguageRange");
        org.junit.Assert.assertNotNull(languageRangeArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(languageRangeItor11);
        org.junit.Assert.assertNotNull(languageRangeStream12);
        org.junit.Assert.assertNotNull(languageRangeSpliterator13);
        org.junit.Assert.assertNotNull(languageRangeArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "english" + "'", str19, "english");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale24);
// flaky:         org.junit.Assert.assertEquals(locale24.toString(), "");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "China" + "'", str25, "China");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "zh-CN" + "'", str26, "zh-CN");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale28);
// flaky:         org.junit.Assert.assertEquals(locale28.toString(), "");
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "China" + "'", str29, "China");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale31);
// flaky:         org.junit.Assert.assertEquals(locale31.toString(), "");
// flaky:         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "China" + "'", str32, "China");
        org.junit.Assert.assertEquals(locale36.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale38);
// flaky:         org.junit.Assert.assertEquals(locale38.toString(), "");
// flaky:         org.junit.Assert.assertEquals("'" + str39 + "' != '" + "China" + "'", str39, "China");
        org.junit.Assert.assertEquals(locale41.toString(), "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "ko");
        org.junit.Assert.assertEquals(locale45.toString(), "");
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(localeList50);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(wildcardClassList61);
        org.junit.Assert.assertTrue("'" + filteringMode62 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode62.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList63);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "english" + "'", str64, "english");
        org.junit.Assert.assertNotNull(languageRangeList66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(languageRange70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test10193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10193");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("LOCLE.LNGUGERNGE", "Chinese (China)", 6);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "L" + "'", str5, "L");
    }

    @Test
    public void test10194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10194");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("English", "hi", (int) (short) -1);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("a", "");
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray8);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray9);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", strArray5, strArray9);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.concatWith("\u4e2d\u6587\u4e2d\u570b)", (java.lang.Object[]) strArray5);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, "");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h" + "'", str11, "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "English" + "'", str12, "English");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "English" + "'", str13, "English");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "English" + "'", str15, "English");
    }

    @Test
    public void test10195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10195");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "AD.AE.AF.AGCHNAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA.AT.AU.AW.AX.AZ.BA.BB.BD.BE.BF.BG.BH.BI.BJ.BL.BM.BN.BO.BQ.BR.BS.BT.BV.BW.BY.BZ.CA.CC.CD.CF.CG.CH.CI.CK.CL.CM.CN.CO.CR.CU.CV.CW.CX.CY.CZ.DE.DJ.DK.DM.DO.DZ.EC.EE.EG.EH.ER.ES.ET.FI.FJ.FK.FM.FO.FR.GA.GB.GD.GE.GF.GG.GH.GI.GL.GM.GN.GP.GQ.GR.GS.GT.GU.GW.GY.HK.HM.HN.HR.HT.HU.ID.IE.IL.IM.IN.IO.IQ.IR.IS.IT.JE.JM.JO.JP.KE.KG.KH.KI.KM.KN.KP.KR.KW.KY.KZ.LA.LB.LC.LI.LK.LR.LS.LT.LU.LV.LY.MA.MC.MD.ME.MF.MG.MH.MK.ML.MM.MN.MO.MP.MQ.MR.MS.MT.MU.MV.MW.MX.MY.MZ.NA.NC.NE.NF.NG.NI.NL.NO.NP.NR.NU.NZ.OM.PA.PE.PF.PG.PH.PK.PL.PM.PN.PR.PS.PT.PW.PY.QA.RE.RO.RS.RU.RW.SA.SB.SC.SD.SE.SG.SH.SI.SJ.SK.SL.SM.SN.SO.SR.SS.ST.SV.SX.SY.SZ.TC.TD.TF.TG.TH.TJ.TK.TL.TM.TN.TO.TR.TT.TV.TW.TZ.UA.UG.UM.US.UY.UZ.VA.VC.VE.VG.VI.VN.VU.WF.WS.YE.YT.ZA.ZM.ZW");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AD.AE.AF.AGCHNAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA.AT.AU.AW.AX.AZ.BA.BB.BD.BE.BF.BG.BH.BI.BJ.BL.BM.BN.BO.BQ.BR.BS.BT.BV.BW.BY.BZ.CA.CC.CD.CF.CG.CH.CI.CK.CL.CM.CN.CO.CR.CU.CV.CW.CX.CY.CZ.DE.DJ.DK.DM.DO.DZ.EC.EE.EG.EH.ER.ES.ET.FI.FJ.FK.FM.FO.FR.GA.GB.GD.GE.GF.GG.GH.GI.GL.GM.GN.GP.GQ.GR.GS.GT.GU.GW.GY.HK.HM.HN.HR.HT.HU.ID.IE.IL.IM.IN.IO.IQ.IR.IS.IT.JE.JM.JO.JP.KE.KG.KH.KI.KM.KN.KP.KR.KW.KY.KZ.LA.LB.LC.LI.LK.LR.LS.LT.LU.LV.LY.MA.MC.MD.ME.MF.MG.MH.MK.ML.MM.MN.MO.MP.MQ.MR.MS.MT.MU.MV.MW.MX.MY.MZ.NA.NC.NE.NF.NG.NI.NL.NO.NP.NR.NU.NZ.OM.PA.PE.PF.PG.PH.PK.PL.PM.PN.PR.PS.PT.PW.PY.QA.RE.RO.RS.RU.RW.SA.SB.SC.SD.SE.SG.SH.SI.SJ.SK.SL.SM.SN.SO.SR.SS.ST.SV.SX.SY.SZ.TC.TD.TF.TG.TH.TJ.TK.TL.TM.TN.TO.TR.TT.TV.TW.TZ.UA.UG.UM.US.UY.UZ.VA.VC.VE.VG.VI.VN.VU.WF.WS.YE.YT.ZA.ZM.ZW" + "'", str1, "AD.AE.AF.AGCHNAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA.AT.AU.AW.AX.AZ.BA.BB.BD.BE.BF.BG.BH.BI.BJ.BL.BM.BN.BO.BQ.BR.BS.BT.BV.BW.BY.BZ.CA.CC.CD.CF.CG.CH.CI.CK.CL.CM.CN.CO.CR.CU.CV.CW.CX.CY.CZ.DE.DJ.DK.DM.DO.DZ.EC.EE.EG.EH.ER.ES.ET.FI.FJ.FK.FM.FO.FR.GA.GB.GD.GE.GF.GG.GH.GI.GL.GM.GN.GP.GQ.GR.GS.GT.GU.GW.GY.HK.HM.HN.HR.HT.HU.ID.IE.IL.IM.IN.IO.IQ.IR.IS.IT.JE.JM.JO.JP.KE.KG.KH.KI.KM.KN.KP.KR.KW.KY.KZ.LA.LB.LC.LI.LK.LR.LS.LT.LU.LV.LY.MA.MC.MD.ME.MF.MG.MH.MK.ML.MM.MN.MO.MP.MQ.MR.MS.MT.MU.MV.MW.MX.MY.MZ.NA.NC.NE.NF.NG.NI.NL.NO.NP.NR.NU.NZ.OM.PA.PE.PF.PG.PH.PK.PL.PM.PN.PR.PS.PT.PW.PY.QA.RE.RO.RS.RU.RW.SA.SB.SC.SD.SE.SG.SH.SI.SJ.SK.SL.SM.SN.SO.SR.SS.ST.SV.SX.SY.SZ.TC.TD.TF.TG.TH.TJ.TK.TL.TM.TN.TO.TR.TT.TV.TW.TZ.UA.UG.UM.US.UY.UZ.VA.VC.VE.VG.VI.VN.VU.WF.WS.YE.YT.ZA.ZM.ZW");
    }

    @Test
    public void test10196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10196");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass("ad.ae.af.ag.ai.al.am.an.ao.aq.ar.as.at.au.aw.ax.az.ba.bb.bd.be.bf.bg.bh.bi.bj.bl.bm.bn.bo.bq.br.bs.bt.bv.bw.by.bz.ca.cc.cd.cf.cg.ch.ci.ck.cl.cm.cn.co.cr.cu.cv.cw.cx.cy.cz.de.dj.dk.dm.do.dz.ec.ee.eg.eh.er.es.et.fi.fj.fk.fm.fo.fr.ga.gb.gd.ge.gf.gg.gh.gi.gl.gm.gn.gp.gq.gr.gs.gt.gu.gw.gy.hk.hm.hn.hr.ht.hu.id.ie.il.im.in.io.iq.ir.is.it.je.jm.jo.jp.ke.kg.kh.ki.km.kn.kp.kr.kw.ky.kz.la.lb.lc.li.lk.lr.ls.lt.lu.lv.ly.ma.mc.md.me.mf.mg.mh.mk.ml.mm.mn.mo.mp.mq.mr.ms.mt.mu.mv.mw.mx.my.mz.na.nc.ne.nf.ng.ni.nl.no.np.nr.nu.nz.om.pa.pe.pf.pg.ph.pk.pl.pm.pn.pr.ps.pt.pw.py.qa.re.ro.rs.ru.rw.sa.sb.sc.sd.se.sg.sh.si.sj.sk.sl.sm.sn.so.sr.ss.st.sv.sx.sy.sz.tc.td.tf.tg.th.tj.tk.tl.tm.tn.to.tr.tt.tv.tw.tz.ua.ug.um.us.uy.uz.va.vc.ve.vg.vi.vn.vu.wf.ws.ye.yt.za.zm.zw", false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ad.ae.af.ag.ai.al.am.an.ao.aq.ar.as.at.au.aw.ax.az.ba.bb.bd.be.bf.bg.bh.bi.bj.bl.bm.bn.bo.bq.br.bs.bt.bv.bw.by.bz.ca.cc.cd.cf.cg.ch.ci.ck.cl.cm.cn.co.cr.cu.cv.cw.cx.cy.cz.de.dj.dk.dm.do.dz.ec.ee.eg.eh.er.es.et.fi.fj.fk.fm.fo.fr.ga.gb.gd.ge.gf.gg.gh.gi.gl.gm.gn.gp.gq.gr.gs.gt.gu.gw.gy.hk.hm.hn.hr.ht.hu.id.ie.il.im.in.io.iq.ir.is.it.je.jm.jo.jp.ke.kg.kh.ki.km.kn.kp.kr.kw.ky.kz.la.lb.lc.li.lk.lr.ls.lt.lu.lv.ly.ma.mc.md.me.mf.mg.mh.mk.ml.mm.mn.mo.mp.mq.mr.ms.mt.mu.mv.mw.mx.my.mz.na.nc.ne.nf.ng.ni.nl.no.np.nr.nu.nz.om.pa.pe.pf.pg.ph.pk.pl.pm.pn.pr.ps.pt.pw.py.qa.re.ro.rs.ru.rw.sa.sb.sc.sd.se.sg.sh.si.sj.sk.sl.sm.sn.so.sr.ss.st.sv.sx.sy.sz.tc.td.tf.tg.th.tj.tk.tl.tm.tn.to.tr.tt.tv.tw.tz.ua.ug.um.us.uy.uz.va.vc.ve.vg.vi.vn.vu.wf.ws.ye.yt.za.zm.zw");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10197");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("locale.languagerange");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "locale.languagerange" + "'", str1, "locale.languagerange");
    }

    @Test
    public void test10198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10198");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("AN       a", "hi-china");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AN       a" + "'", str2, "AN       a");
    }

    @Test
    public void test10199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10199");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("ENGHI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ENGHI" + "'", str1, "ENGHI");
    }

    @Test
    public void test10200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10200");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("ch", '4');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test10201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10201");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "h$I");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test10202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10202");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale.Builder builder3 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder5 = builder1.setRegion("zh");
        java.util.Locale.Builder builder6 = builder5.clear();
        java.util.Locale locale7 = builder5.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder5.removeUnicodeLocaleAttribute("\u4e2d\u6587\u4e2d\u56fd)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute:    ?? (??) [at index 0]");
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
    public void test10203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10203");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("zh-cnenglish (LOCALE.LANGUAGERANGE)", "");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test10204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10204");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap3);
        int int5 = languageRangeList1.size();
        java.util.List<java.util.Locale.LanguageRange> languageRangeList7 = java.util.Locale.LanguageRange.parse("hi");
        boolean boolean9 = languageRangeList7.remove((java.lang.Object) "English");
        boolean boolean10 = languageRangeList1.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList7);
        int int11 = languageRangeList7.size();
        java.util.Iterator<java.util.Locale.LanguageRange> languageRangeItor12 = languageRangeList7.iterator();
        java.util.Iterator<java.util.Locale.LanguageRange> languageRangeItor13 = languageRangeList7.iterator();
        java.util.Locale.LanguageRange languageRange14 = languageRangeItor13.next();
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(languageRangeItor13, '.');
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(languageRangeList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(languageRangeItor12);
        org.junit.Assert.assertNotNull(languageRangeItor13);
        org.junit.Assert.assertNotNull(languageRange14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test10205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10205");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = builder0.build();
        java.util.Locale locale4 = new java.util.Locale("");
        java.util.Set<java.lang.String> strSet5 = locale4.getUnicodeLocaleKeys();
        java.lang.String str6 = locale4.getDisplayName();
        java.util.Locale.Builder builder7 = builder0.setLocale(locale4);
        java.util.Locale.Builder builder8 = builder7.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder7.addUnicodeLocaleAttribute("Collections.EmptySet");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: Collections.EmptySet [at index 0]");
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
    }

    @Test
    public void test10206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10206");
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
        java.lang.String str20 = locale7.getCountry();
        java.util.Locale locale21 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str22 = locale21.getDisplayLanguage();
        java.util.Locale locale23 = java.util.Locale.getDefault();
        java.lang.String str24 = locale21.getDisplayCountry(locale23);
        java.util.Locale locale25 = java.util.Locale.TAIWAN;
        java.lang.String str26 = locale25.getVariant();
        java.lang.String str27 = locale21.getDisplayName(locale25);
        java.lang.String str28 = locale7.getDisplayLanguage(locale21);
        java.lang.String str29 = locale7.getCountry();
        java.util.Locale locale33 = new java.util.Locale("hi", "hi!", "cHINA");
        java.lang.String str34 = locale33.getDisplayVariant();
        java.util.Locale locale35 = locale33.stripExtensions();
        java.util.Locale locale36 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale37 = java.util.Locale.getDefault();
        java.lang.String str38 = locale36.getDisplayCountry(locale37);
        java.lang.String str39 = locale36.toLanguageTag();
        java.lang.String str40 = locale36.getLanguage();
        java.util.Locale locale41 = java.util.Locale.ITALIAN;
        java.util.Locale locale43 = new java.util.Locale("");
        java.lang.String str44 = locale43.getDisplayLanguage();
        java.util.Locale locale45 = java.util.Locale.CANADA;
        java.lang.String str46 = locale45.getDisplayLanguage();
        java.lang.String str47 = locale43.getDisplayScript(locale45);
        java.util.Locale locale49 = java.util.Locale.FRANCE;
        java.lang.String str50 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale49);
        java.lang.String str51 = locale43.getDisplayCountry(locale49);
        java.lang.String str52 = locale41.getDisplayScript(locale43);
        java.util.Locale locale53 = java.util.Locale.GERMAN;
        java.lang.String str54 = locale43.getDisplayLanguage(locale53);
        java.lang.String str55 = locale36.getDisplayCountry(locale43);
        java.lang.String str56 = locale43.getCountry();
        java.util.Locale locale60 = new java.util.Locale("....english", "zhcinesese", ".");
        java.lang.String str61 = locale43.getDisplayName(locale60);
        java.lang.String str62 = locale33.getDisplayName(locale43);
        java.util.Locale locale63 = java.util.Locale.ITALIAN;
        java.util.Locale locale65 = new java.util.Locale("");
        java.lang.String str66 = locale65.getDisplayLanguage();
        java.util.Locale locale67 = java.util.Locale.CANADA;
        java.lang.String str68 = locale67.getDisplayLanguage();
        java.lang.String str69 = locale65.getDisplayScript(locale67);
        java.util.Locale locale71 = java.util.Locale.FRANCE;
        java.lang.String str72 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale71);
        java.lang.String str73 = locale65.getDisplayCountry(locale71);
        java.lang.String str74 = locale63.getDisplayScript(locale65);
        java.lang.String str75 = locale33.getDisplayName(locale65);
        java.lang.String str76 = locale7.getDisplayName(locale65);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale1);
// flaky:         org.junit.Assert.assertEquals(locale1.toString(), "");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "China" + "'", str2, "China");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zh-CN" + "'", str3, "zh-CN");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zh" + "'", str4, "zh");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "it");
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "English" + "'", str10, "English");
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "zh_TW");
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Chinese" + "'", str22, "Chinese");
        org.junit.Assert.assertNotNull(locale23);
// flaky:         org.junit.Assert.assertEquals(locale23.toString(), "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Taiwan" + "'", str24, "Taiwan");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\u4e2d\u6587\u53f0\u7063)" + "'", str27, "\u4e2d\u6587\u53f0\u7063)");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals(locale33.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "cHINA" + "'", str34, "cHINA");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale37);
// flaky:         org.junit.Assert.assertEquals(locale37.toString(), "");
// flaky:         org.junit.Assert.assertEquals("'" + str38 + "' != '" + "China" + "'", str38, "China");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "zh-CN" + "'", str39, "zh-CN");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "zh" + "'", str40, "zh");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "it");
        org.junit.Assert.assertEquals(locale43.toString(), "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "en_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str46 + "' != '" + "English" + "'", str46, "English");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "english" + "'", str50, "english");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "de");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "China" + "'", str55, "China");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals(locale60.toString(), "....english_ZHCINESESE_.");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "Hindi (HI!,cHINA)" + "'", str62, "Hindi (HI!,cHINA)");
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "it");
        org.junit.Assert.assertEquals(locale65.toString(), "");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertNotNull(locale67);
        org.junit.Assert.assertEquals(locale67.toString(), "en_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str68 + "' != '" + "English" + "'", str68, "English");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertNotNull(locale71);
        org.junit.Assert.assertEquals(locale71.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "english" + "'", str72, "english");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "Hindi (HI!,cHINA)" + "'", str75, "Hindi (HI!,cHINA)");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
    }

    @Test
    public void test10207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10207");
        java.util.Locale.Builder builder1 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale.Builder builder4 = builder2.setLanguageTag("zh-CN");
        java.util.Locale.Builder builder6 = builder4.setLanguage("CHINA");
        java.util.Locale locale7 = builder4.build();
        java.util.Locale locale8 = builder4.build();
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.lowerCase("\u4e2d\u56fd", locale8);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "china_CN");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "china_CN");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u4e2d\u56fd" + "'", str9, "\u4e2d\u56fd");
    }

    @Test
    public void test10208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10208");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("fran\347ais (France)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "fran\347ais (France)" + "'", str1, "fran\347ais (France)");
    }

    @Test
    public void test10209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10209");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("l.avajstring[]string[]string[$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$", "                                                                                                   $");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10210");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("ncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncArrayLis", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncArrayLis" + "'", str2, "ncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncArrayLis");
    }

    @Test
    public void test10211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10211");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.setLanguageTag("zh-CN");
        java.util.Locale.Builder builder5 = builder3.setLanguage("it");
        java.util.Locale.Builder builder7 = builder3.setLanguageTag("hI");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder7.setVariant("                    nglish  Hindi (HI!,cHINA)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant:                     nglish  Hindi (HI!,cHINA) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test10212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10212");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("                  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test10213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10213");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("Cina", strMap1);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList2, strMap3);
        java.util.Spliterator<java.util.Locale.LanguageRange> languageRangeSpliterator5 = languageRangeList2.spliterator();
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(languageRangeSpliterator5);
    }

    @Test
    public void test10214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10214");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale.Builder builder6 = builder4.setLanguageTag("Collecti");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder4.setVariant("JAVA.LANG");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: JAVA.LANG [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test10215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10215");
        java.util.Locale locale2 = new java.util.Locale("444444444444444444444444444444444", "ITALIAHI");
        org.junit.Assert.assertEquals(locale2.toString(), "444444444444444444444444444444444_ITALIAHI");
    }

    @Test
    public void test10216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10216");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "\u4e2d\u56fdAD.AE.AFxxxxxxxxxxxxxxxxxxxxxxxxx");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10217");
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
        java.util.Spliterator<java.util.Locale.LanguageRange> languageRangeSpliterator51 = languageRangeList1.spliterator();
        java.util.function.UnaryOperator<java.util.Locale.LanguageRange> languageRangeUnaryOperator52 = null;
        // The following exception was thrown during execution in test generation
        try {
            languageRangeList1.replaceAll(languageRangeUnaryOperator52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "China" + "'", str11, "China");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "zh-CN" + "'", str12, "zh-CN");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale14);
// flaky:         org.junit.Assert.assertEquals(locale14.toString(), "");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "China" + "'", str15, "China");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale17);
// flaky:         org.junit.Assert.assertEquals(locale17.toString(), "");
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "China" + "'", str18, "China");
        org.junit.Assert.assertEquals(locale22.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale24);
// flaky:         org.junit.Assert.assertEquals(locale24.toString(), "");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "China" + "'", str25, "China");
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
        org.junit.Assert.assertNotNull(languageRangeSpliterator51);
    }

    @Test
    public void test10218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10218");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("Taiwan", 39);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                 Taiwan" + "'", str2, "                                 Taiwan");
    }

    @Test
    public void test10219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10219");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("ad.ae.af.ag.ai.al.am.an.ao.aq.ar.as.at.au.aw.ax.az.ba.bb.bd.be.bf.bg.bh.bi.bj.bl.bm.bn.bo.bq.br.bs.bt.bv.bw.by.bz.ca.cc.cd.cf.cg.ch.ci.ck.cl.cm.cn.co.cr.cu.cv.cw.cx.cy.cz.de.dj.dk.dm.do.dz.ec.ee.eg.eh.er.es.et.fi.fj.fk.fm.fo.fr.ga.gb.gd.ge.gf.gg.gh.gi.gl.gm.gn.gp.gq.gr.gs.gt.gu.gw.gy.hk.hm.hn.hr.ht.hu.id.ie.il.im.in.io.iq.ir.is.it.je.jm.jo.jp.ke.kg.kh.ki.km.kn.kp.kr.kw.ky.kz.la.lb.lc.li.lk.lr.ls.lt.lu.lv.ly.ma.mc.md.me.mf.mg.mh.mk.ml.mm.mn.mo.mp.mq.mr.ms.mt.mu.mv.mw.mx.my.mz.na.nc.ne.nf.ng.ni.nl.no.np.nr.nu.nz.om.pa.pe.pf.pg.ph.pk.pl.pm.pn.pr.ps.pt.pw.py.qa.re.ro.rs.ru.rw.sa.sb.sc.sd.se.sg.sh.si.sj.sk.sl.sm.sn.so.sr.ss.st.sv.sx.sy.sz.tc.td.tf.tg.th.tj.tk.tl.tm.tn.to.tr.tt.tv.tw.tz.ua.ug.um.us.uy.uz.va.vc.ve.vg.vi.vn.vu.wf.ws.ye.yt.za.zm.z", 52, 747);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ad.ae.af.ag.ai.al.am.an.ao.aq.ar.as.at.au.aw.ax.az.ba.bb.bd.be.bf.bg.bh.bi.bj.bl.bm.bn.bo.bq.br.bs.bt.bv.bw.by.bz.ca.cc.cd.cf.cg.ch.ci.ck.cl.cm.cn.co.cr.cu.cv.cw.cx.cy.cz.de.dj.dk.dm.do.dz.ec.ee.eg.eh.er.es.et.fi.fj.fk.fm.fo.fr.ga.gb.gd.ge.gf.gg.gh.gi.gl.gm.gn.gp.gq.gr.gs.gt.gu.gw.gy.hk.hm.hn.hr.ht.hu.id.ie.il.im.in.io.iq.ir.is.it.je.jm.jo.jp.ke.kg.kh.ki.km.kn.kp.kr.kw.ky.kz.la.lb.lc.li.lk.lr.ls.lt.lu.lv.ly.ma.mc.md.me.mf.mg.mh.mk.ml.mm.mn.mo.mp.mq.mr.ms.mt.mu.mv.mw.mx.my.mz.na.nc.ne.nf.ng.ni.nl.no.np.nr.nu.nz.om.pa.pe.pf.pg.ph.pk.pl.pm.pn.pr.ps.pt.pw.py.qa.re.ro.rs.ru.rw.sa.sb.sc.sd.se.sg.sh.si.sj.sk.sl.sm.sn.so.sr.ss.st.sv.sx.sy.sz.tc.td.tf.tg.th.tj.tk.tl.tm.tn.to.tr.tt.tv.tw.tz.ua.ug.um.us.uy.uz.va.vc.ve.vg.vi.vn.vu.wf.ws.ye.yt.za...." + "'", str3, "ad.ae.af.ag.ai.al.am.an.ao.aq.ar.as.at.au.aw.ax.az.ba.bb.bd.be.bf.bg.bh.bi.bj.bl.bm.bn.bo.bq.br.bs.bt.bv.bw.by.bz.ca.cc.cd.cf.cg.ch.ci.ck.cl.cm.cn.co.cr.cu.cv.cw.cx.cy.cz.de.dj.dk.dm.do.dz.ec.ee.eg.eh.er.es.et.fi.fj.fk.fm.fo.fr.ga.gb.gd.ge.gf.gg.gh.gi.gl.gm.gn.gp.gq.gr.gs.gt.gu.gw.gy.hk.hm.hn.hr.ht.hu.id.ie.il.im.in.io.iq.ir.is.it.je.jm.jo.jp.ke.kg.kh.ki.km.kn.kp.kr.kw.ky.kz.la.lb.lc.li.lk.lr.ls.lt.lu.lv.ly.ma.mc.md.me.mf.mg.mh.mk.ml.mm.mn.mo.mp.mq.mr.ms.mt.mu.mv.mw.mx.my.mz.na.nc.ne.nf.ng.ni.nl.no.np.nr.nu.nz.om.pa.pe.pf.pg.ph.pk.pl.pm.pn.pr.ps.pt.pw.py.qa.re.ro.rs.ru.rw.sa.sb.sc.sd.se.sg.sh.si.sj.sk.sl.sm.sn.so.sr.ss.st.sv.sx.sy.sz.tc.td.tf.tg.th.tj.tk.tl.tm.tn.to.tr.tt.tv.tw.tz.ua.ug.um.us.uy.uz.va.vc.ve.vg.vi.vn.vu.wf.ws.ye.yt.za....");
    }

    @Test
    public void test10220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10220");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("NWTSNWTLGNE", "it                                           ", "CINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINA");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test10221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10221");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass("Esglish (Usitee Ststes)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: Esglish(UsiteeStstes)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10222");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("apanesexxxxxxxxxxxxxx", "iiiiiiiiiiiiiiiiiiiiiiiArrayListiiiiiiiiiiiiiiiiiiiiiiiArrayListiiiiiiiiiiiiiiiiiiiiiiiArrayListiiiiiiiiiiiiiiiiiiiiiiiArrayListiiiiiiiiiiiiiiiiiiiiiiiArrayListiiiiiiiiiiiiiiiiiiiiiiiArrayListiiiiiiiiiiiiiiiiiiiiiiiArrayListiiiiiiiiiiiiiiiiiiiiiiiArrayListiiiiiiiiiiiiiiiiiiiiiiiArrayList", 19);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10223");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("xxx", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "xxx" + "'", str2, "xxx");
    }

    @Test
    public void test10224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10224");
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
        java.util.Collection<java.util.Locale> localeCollection97 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale98 = java.util.Locale.lookup(languageRangeList1, localeCollection97);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
// flaky:         org.junit.Assert.assertEquals(locale46.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Chine" + "'", str47, "Chine");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "zh-CN" + "'", str48, "zh-CN");
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale50);
// flaky:         org.junit.Assert.assertEquals(locale50.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Chine" + "'", str51, "Chine");
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale53);
// flaky:         org.junit.Assert.assertEquals(locale53.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "Chine" + "'", str54, "Chine");
        org.junit.Assert.assertEquals(locale58.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale60);
// flaky:         org.junit.Assert.assertEquals(locale60.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "Chine" + "'", str61, "Chine");
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
    public void test10225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10225");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("...                         zh_C             ...", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10226");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("...X.Z.B.BB.BD.BE.BF.BG.BH.BI.BJ.BL.BM.BN...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...x.z.b.bb.bd.be.bf.bg.bh.bi.bj.bl.bm.bn..." + "'", str1, "...x.z.b.bb.bd.be.bf.bg.bh.bi.bj.bl.bm.bn...");
    }

    @Test
    public void test10227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10227");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "           zxxxxxxxxxxxxxxxxxxx");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10228");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap3);
        java.util.Iterator<java.util.Locale.LanguageRange> languageRangeItor5 = languageRangeList1.iterator();
        java.util.Locale locale8 = new java.util.Locale("");
        java.lang.String str9 = locale8.getDisplayLanguage();
        java.util.Locale locale10 = java.util.Locale.CANADA;
        java.lang.String str11 = locale10.getDisplayLanguage();
        java.lang.String str12 = locale8.getDisplayScript(locale10);
        java.lang.String str13 = locale10.getDisplayVariant();
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.upperCase("", locale10);
        java.lang.String str15 = locale10.getLanguage();
        boolean boolean16 = languageRangeList1.equals((java.lang.Object) locale10);
        java.util.Locale.LanguageRange[] languageRangeArray17 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList18 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList18, languageRangeArray17);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap20 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList21 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList18, strMap20);
        int int22 = languageRangeList18.size();
        java.util.List<java.util.Locale.LanguageRange> languageRangeList24 = java.util.Locale.LanguageRange.parse("hi");
        boolean boolean26 = languageRangeList24.remove((java.lang.Object) "English");
        boolean boolean27 = languageRangeList18.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList24);
        java.util.Locale.LanguageRange languageRange29 = new java.util.Locale.LanguageRange("English");
        java.lang.String str30 = languageRange29.getRange();
        boolean boolean31 = languageRangeList24.add(languageRange29);
        boolean boolean32 = languageRangeList1.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList24);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor34 = languageRangeList1.listIterator(116);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 116");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(languageRangeItor5);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "anglais" + "'", str11, "anglais");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "en" + "'", str15, "en");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(languageRangeArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(languageRangeList21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(languageRangeList24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "english" + "'", str30, "english");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test10229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10229");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("Italia", "ESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWAN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Italia" + "'", str2, "Italia");
    }

    @Test
    public void test10230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10230");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("hI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI", (double) 279);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=279.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10231");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap3);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor5 = languageRangeList4.listIterator();
        char[][] charArray6 = new char[][] {};
        char[][] charArray7 = languageRangeList4.toArray(charArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) charArray6, '.');
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(languageRangeItor5);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test10232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10232");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName("       hi!italiahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIital...xxxx");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "xxxx" + "'", str1, "xxxx");
    }

    @Test
    public void test10233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10233");
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
        int int62 = languageRangeList4.indexOf((java.lang.Object) 1.0f);
        boolean boolean63 = languageRangeList4.isEmpty();
        java.util.Locale locale65 = java.util.Locale.TAIWAN;
        java.lang.String str66 = org.apache.commons.lang3.StringUtils.upperCase("", locale65);
        java.lang.String str67 = locale65.getISO3Country();
        boolean boolean68 = languageRangeList4.remove((java.lang.Object) locale65);
        java.lang.String[] strArray71 = org.apache.commons.lang3.StringUtils.split("zh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CTWzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-C", '$');
        boolean boolean72 = languageRangeList4.equals((java.lang.Object) '$');
        java.util.function.UnaryOperator<java.util.Locale.LanguageRange> languageRangeUnaryOperator73 = null;
        // The following exception was thrown during execution in test generation
        try {
            languageRangeList4.replaceAll(languageRangeUnaryOperator73);
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
// flaky:         org.junit.Assert.assertEquals(locale20.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Chine" + "'", str21, "Chine");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "zh-CN" + "'", str22, "zh-CN");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale24);
// flaky:         org.junit.Assert.assertEquals(locale24.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Chine" + "'", str25, "Chine");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale27);
// flaky:         org.junit.Assert.assertEquals(locale27.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Chine" + "'", str28, "Chine");
        org.junit.Assert.assertEquals(locale32.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale34);
// flaky:         org.junit.Assert.assertEquals(locale34.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Chine" + "'", str35, "Chine");
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
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(locale65);
        org.junit.Assert.assertEquals(locale65.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "TWN" + "'", str67, "TWN");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test10234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10234");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("engliIlish", '#', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "engliIlish" + "'", str3, "engliIlish");
    }

    @Test
    public void test10235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10235");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("gnalesenic.esenicavaj", "chi..");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10236");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortClassName("xxxxxxxxxxxxxxJapanesexxxxxxxxxxxxxx");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "xxxxxxxxxxxxxxJapanesexxxxxxxxxxxxxx" + "'", str1, "xxxxxxxxxxxxxxJapanesexxxxxxxxxxxxxx");
    }

    @Test
    public void test10237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10237");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap3);
        int int5 = languageRangeList1.size();
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor6 = languageRangeList1.listIterator();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange7 = languageRangeItor6.next();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(languageRangeItor6);
    }

    @Test
    public void test10238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10238");
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
        java.util.Locale.Builder builder38 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder40 = builder38.setScript("");
        java.util.Locale.Builder builder42 = builder40.setLanguage("HI");
        java.util.Locale locale43 = builder42.build();
        java.util.Locale locale44 = builder42.build();
        int int45 = languageRangeList32.indexOf((java.lang.Object) builder42);
        java.util.Locale.Builder builder46 = builder42.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder49 = builder42.setUnicodeLocaleKeyword("fran\347ais (France)", "ingleseuingleseuingleseuinjava.lang");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: franc?ais (France) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "anglais" + "'", str21, "anglais");
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
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "hi");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "hi");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(builder46);
    }

    @Test
    public void test10239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10239");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "EnglTWNsTWN", "HI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test10240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10240");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("kor", "                                                gnalesenic.esenicavaj                                                ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10241");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("locle.lngugernge", 44);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "locle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugernge" + "'", str2, "locle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugernge");
    }

    @Test
    public void test10242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10242");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.lang.Class<?>[] wildcardClassArray3 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray1);
        java.lang.Class<?>[] wildcardClassArray4 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray1);
        java.lang.Class[] classArray7 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray8 = (java.lang.Class<?>[]) classArray7;
        java.lang.Class<?>[] wildcardClassArray9 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray7);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.concatWith("hi!", (java.lang.Object[]) classArray7);
        boolean boolean11 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray1, (java.lang.Class<?>[]) classArray7);
        java.lang.Class<?>[] wildcardClassArray12 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers((java.lang.Class<?>[]) classArray7);
        java.lang.Class<?>[] wildcardClassArray13 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray12);
        java.lang.Class<?>[] wildcardClassArray14 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray12);
        java.lang.Class<?>[] wildcardClassArray15 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray12);
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertNotNull(wildcardClassArray4);
        org.junit.Assert.assertNotNull(classArray7);
        org.junit.Assert.assertNotNull(wildcardClassArray8);
        org.junit.Assert.assertNotNull(wildcardClassArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray12);
        org.junit.Assert.assertNotNull(wildcardClassArray13);
        org.junit.Assert.assertNotNull(wildcardClassArray14);
        org.junit.Assert.assertNotNull(wildcardClassArray15);
    }

    @Test
    public void test10243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10243");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("              Locale               ", "China", (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10244");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageName("Chnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test10245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10245");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("                                                      JAVA.LANG                                                      ", " zH  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                      JAVA.LANG                                                      " + "'", str2, "                                                      JAVA.LANG                                                      ");
    }

    @Test
    public void test10246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10246");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("redliuB.elacoL", 42);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "redliuB.elacoL                            " + "'", str2, "redliuB.elacoL                            ");
    }

    @Test
    public void test10247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10247");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("An                              ", 32, (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 31 + "'", int3 == 31);
    }

    @Test
    public void test10248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10248");
        java.util.Locale locale3 = new java.util.Locale("Cinaxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", "ggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engli", "us");
        java.lang.String str4 = locale3.getDisplayLanguage();
        java.util.Set<java.lang.String> strSet5 = locale3.getUnicodeLocaleKeys();
        java.lang.String str6 = locale3.getVariant();
        java.util.Locale locale7 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale8 = java.util.Locale.getDefault();
        java.lang.String str9 = locale7.getDisplayCountry(locale8);
        java.lang.String str10 = locale7.toLanguageTag();
        java.lang.String str11 = locale7.getCountry();
        java.lang.String str12 = locale7.getISO3Country();
        java.util.Locale locale14 = new java.util.Locale("");
        java.lang.String str15 = locale14.getDisplayVariant();
        java.lang.String str16 = locale7.getDisplayLanguage(locale14);
        java.lang.String str17 = locale14.getLanguage();
        java.util.Set<java.lang.Character> charSet18 = locale14.getExtensionKeys();
        java.lang.String str19 = locale14.getVariant();
        java.lang.String str20 = locale3.getDisplayName(locale14);
        boolean boolean21 = locale3.hasExtensions();
        org.junit.Assert.assertEquals(locale3.toString(), "cinaxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx_GGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLI_us");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "cinaxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx" + "'", str4, "cinaxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "us" + "'", str6, "us");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale8);
// flaky:         org.junit.Assert.assertEquals(locale8.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Chine" + "'", str9, "Chine");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "zh-CN" + "'", str10, "zh-CN");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "CN" + "'", str11, "CN");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "CHN" + "'", str12, "CHN");
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Chinese" + "'", str16, "Chinese");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(charSet18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "cinaxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx (GGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLI,us)" + "'", str20, "cinaxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx (GGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLI,us)");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test10249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10249");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "44444444EnglTWNsTWN44444444", (java.lang.CharSequence) "                                                          zh_C                                                          ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 120 + "'", int2 == 120);
    }

    @Test
    public void test10250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10250");
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
        java.util.Spliterator<java.util.Locale.LanguageRange> languageRangeSpliterator42 = languageRangeList1.spliterator();
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap43 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList44 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList1, strMap43);
        java.util.Locale.LanguageRange languageRange45 = null;
        boolean boolean46 = languageRangeList1.add(languageRange45);
        java.util.Locale locale48 = java.util.Locale.ITALIAN;
        java.util.Locale locale50 = new java.util.Locale("");
        java.lang.String str51 = locale50.getDisplayLanguage();
        java.util.Locale locale52 = java.util.Locale.CANADA;
        java.lang.String str53 = locale52.getDisplayLanguage();
        java.lang.String str54 = locale50.getDisplayScript(locale52);
        java.util.Locale locale56 = java.util.Locale.FRANCE;
        java.lang.String str57 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale56);
        java.lang.String str58 = locale50.getDisplayCountry(locale56);
        java.lang.String str59 = locale48.getDisplayScript(locale50);
        java.lang.String str60 = org.apache.commons.lang3.StringUtils.upperCase("China", locale48);
        java.lang.String str61 = locale48.getVariant();
        java.util.Locale locale65 = new java.util.Locale("zho", "US");
        java.util.Locale locale66 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str67 = locale65.getDisplayVariant(locale66);
        java.lang.String str68 = locale66.getVariant();
        java.lang.String str69 = org.apache.commons.lang3.StringUtils.upperCase("AD.AE.AF.AG.AI.AL.AM.AN.AO.AQ.AR.AS.AT.AU.AW.AX.AZ.BA.BB.BD.BE.BF.BG.BH.BI.BJ.BL.BM.BN.BO.BQ.BR.BS.BT.BV.BW.BY.BZ.CA.CC.CD.CF.CG.CH.CI.CK.CL.CM.CN.CO.CR.CU.CV.CW.CX.CY.CZ.DE.DJ.DK.DM.DO.DZ.EC.EE.EG.EH.ER.ES.ET.FI.FJ.FK.FM.FO.FR.GA.GB.GD.GE.GF.GG.GH.GI.GL.GM.GN.GP.GQ.GR.GS.GT.GU.GW.GY.HK.HM.HN.HR.HT.HU.ID.IE.IL.IM.IN.IO.IQ.IR.IS.IT.JE.JM.JO.JP.KE.KG.KH.KI.KM.KN.KP.KR.KW.KY.KZ.LA.LB.LC.LI.LK.LR.LS.LT.LU.LV.LY.MA.MC.MD.ME.MF.MG.MH.MK.ML.MM.MN.MO.MP.MQ.MR.MS.MT.MU.MV.MW.MX.MY.MZ.NA.NC.NE.NF.NG.NI.NL.NO.NP.NR.NU.NZ.OM.PA.PE.PF.PG.PH.PK.PL.PM.PN.PR.PS.PT.PW.PY.QA.RE.RO.RS.RU.RW.SA.SB.SC.SD.SE.SG.SH.SI.SJ.SK.SL.SM.SN.SO.SR.SS.ST.SV.SX.SY.SZ.TC.TD.TF.TG.TH.TJ.TK.TL.TM.TN.TO.TR.TT.TV.TW.TZ.UA.UG.UM.US.UY.UZ.VA.VC.VE.VG.VI.VN.VU.WF.WS.YE.YT.ZA.ZM.ZW", locale66);
        java.lang.String str70 = locale66.getCountry();
        java.lang.String str71 = locale48.getDisplayLanguage(locale66);
        java.lang.String str72 = locale66.getISO3Country();
        java.util.Set<java.lang.String> strSet73 = locale66.getUnicodeLocaleAttributes();
        java.util.List<java.lang.String> strList74 = java.util.Locale.filterTags(languageRangeList1, (java.util.Collection<java.lang.String>) strSet73);
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
// flaky:         org.junit.Assert.assertEquals(locale14.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\u4e2d\u56fd" + "'", str15, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "zh-CN" + "'", str16, "zh-CN");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale18);
// flaky:         org.junit.Assert.assertEquals(locale18.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\u4e2d\u56fd" + "'", str19, "\u4e2d\u56fd");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale21);
// flaky:         org.junit.Assert.assertEquals(locale21.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\u4e2d\u56fd" + "'", str22, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals(locale26.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale28);
// flaky:         org.junit.Assert.assertEquals(locale28.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\u4e2d\u56fd" + "'", str29, "\u4e2d\u56fd");
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
        org.junit.Assert.assertNotNull(languageRangeSpliterator42);
        org.junit.Assert.assertNotNull(languageRangeList44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "it");
        org.junit.Assert.assertEquals(locale50.toString(), "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "en_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str53 + "' != '" + "\u82f1\u6587" + "'", str53, "\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNotNull(locale56);
        org.junit.Assert.assertEquals(locale56.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "english" + "'", str57, "english");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "CHINA" + "'", str60, "CHINA");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertEquals(locale65.toString(), "zho_US");
        org.junit.Assert.assertNotNull(locale66);
        org.junit.Assert.assertEquals(locale66.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "AD.AE.AF.AG.AI.AL.AM.AN.AO.AQ.AR.AS.AT.AU.AW.AX.AZ.BA.BB.BD.BE.BF.BG.BH.BI.BJ.BL.BM.BN.BO.BQ.BR.BS.BT.BV.BW.BY.BZ.CA.CC.CD.CF.CG.CH.CI.CK.CL.CM.CN.CO.CR.CU.CV.CW.CX.CY.CZ.DE.DJ.DK.DM.DO.DZ.EC.EE.EG.EH.ER.ES.ET.FI.FJ.FK.FM.FO.FR.GA.GB.GD.GE.GF.GG.GH.GI.GL.GM.GN.GP.GQ.GR.GS.GT.GU.GW.GY.HK.HM.HN.HR.HT.HU.ID.IE.IL.IM.IN.IO.IQ.IR.IS.IT.JE.JM.JO.JP.KE.KG.KH.KI.KM.KN.KP.KR.KW.KY.KZ.LA.LB.LC.LI.LK.LR.LS.LT.LU.LV.LY.MA.MC.MD.ME.MF.MG.MH.MK.ML.MM.MN.MO.MP.MQ.MR.MS.MT.MU.MV.MW.MX.MY.MZ.NA.NC.NE.NF.NG.NI.NL.NO.NP.NR.NU.NZ.OM.PA.PE.PF.PG.PH.PK.PL.PM.PN.PR.PS.PT.PW.PY.QA.RE.RO.RS.RU.RW.SA.SB.SC.SD.SE.SG.SH.SI.SJ.SK.SL.SM.SN.SO.SR.SS.ST.SV.SX.SY.SZ.TC.TD.TF.TG.TH.TJ.TK.TL.TM.TN.TO.TR.TT.TV.TW.TZ.UA.UG.UM.US.UY.UZ.VA.VC.VE.VG.VI.VN.VU.WF.WS.YE.YT.ZA.ZM.ZW" + "'", str69, "AD.AE.AF.AG.AI.AL.AM.AN.AO.AQ.AR.AS.AT.AU.AW.AX.AZ.BA.BB.BD.BE.BF.BG.BH.BI.BJ.BL.BM.BN.BO.BQ.BR.BS.BT.BV.BW.BY.BZ.CA.CC.CD.CF.CG.CH.CI.CK.CL.CM.CN.CO.CR.CU.CV.CW.CX.CY.CZ.DE.DJ.DK.DM.DO.DZ.EC.EE.EG.EH.ER.ES.ET.FI.FJ.FK.FM.FO.FR.GA.GB.GD.GE.GF.GG.GH.GI.GL.GM.GN.GP.GQ.GR.GS.GT.GU.GW.GY.HK.HM.HN.HR.HT.HU.ID.IE.IL.IM.IN.IO.IQ.IR.IS.IT.JE.JM.JO.JP.KE.KG.KH.KI.KM.KN.KP.KR.KW.KY.KZ.LA.LB.LC.LI.LK.LR.LS.LT.LU.LV.LY.MA.MC.MD.ME.MF.MG.MH.MK.ML.MM.MN.MO.MP.MQ.MR.MS.MT.MU.MV.MW.MX.MY.MZ.NA.NC.NE.NF.NG.NI.NL.NO.NP.NR.NU.NZ.OM.PA.PE.PF.PG.PH.PK.PL.PM.PN.PR.PS.PT.PW.PY.QA.RE.RO.RS.RU.RW.SA.SB.SC.SD.SE.SG.SH.SI.SJ.SK.SL.SM.SN.SO.SR.SS.ST.SV.SX.SY.SZ.TC.TD.TF.TG.TH.TJ.TK.TL.TM.TN.TO.TR.TT.TV.TW.TZ.UA.UG.UM.US.UY.UZ.VA.VC.VE.VG.VI.VN.VU.WF.WS.YE.YT.ZA.ZM.ZW");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "CA" + "'", str70, "CA");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "italien" + "'", str71, "italien");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "CAN" + "'", str72, "CAN");
        org.junit.Assert.assertNotNull(strSet73);
        org.junit.Assert.assertNotNull(strList74);
    }

    @Test
    public void test10251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10251");
        java.util.Locale locale4 = new java.util.Locale("$");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.upperCase("EnglTWNsTWN", locale4);
        java.util.Set<java.lang.String> strSet6 = locale4.getUnicodeLocaleAttributes();
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.lowerCase("ITALIEN", locale4);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.lowerCase("F   ch", locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ENGLTWNSTWN" + "'", str5, "ENGLTWNSTWN");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "italien" + "'", str7, "italien");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "f   ch" + "'", str8, "f   ch");
    }

    @Test
    public void test10252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10252");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("slgne", "\u4e2d\u6587\u53f0\u6e7e\u5730\u533a\u4e2d\u6587\u53f0\u6e7e\u5730\u533aengliIlish)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10253");
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
        java.util.Locale locale13 = null;
        java.lang.String str14 = locale2.getDisplayCountry(locale13);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "English" + "'", str5, "English");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "english" + "'", str9, "english");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test10254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10254");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("EN_ca");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("fran\347ais (France)", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10255");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.setLanguageTag("zh-CN");
        java.util.Locale.Builder builder5 = builder3.addUnicodeLocaleAttribute("inglese");
        java.util.Locale locale10 = new java.util.Locale("zh-CNenglish", "Locale.LanguageRange", "");
        java.util.Locale.setDefault(locale10);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.lowerCase("Locale.LanguageRange", locale10);
        java.lang.String str13 = locale10.getLanguage();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder14 = builder5.setLocale(locale10);
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: zh-cnenglish [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals(locale10.toString(), "zh-cnenglish_LOCALE.LANGUAGERANGE");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "locale.languagerange" + "'", str12, "locale.languagerange");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "zh-cnenglish" + "'", str13, "zh-cnenglish");
    }

    @Test
    public void test10256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10256");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "CN        ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10257");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale locale4 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale5 = java.util.Locale.getDefault();
        java.lang.String str6 = locale4.getDisplayCountry(locale5);
        java.lang.String str7 = locale4.toLanguageTag();
        java.lang.String str8 = locale4.getCountry();
        java.lang.String str9 = locale4.getISO3Country();
        java.util.Locale.Builder builder10 = builder3.setLocale(locale4);
        java.util.Locale.Builder builder12 = builder10.setLanguage("boolean");
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh-cnenglish_LOCALE.LANGUAGERANGE");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "China" + "'", str6, "China");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "zh-CN" + "'", str7, "zh-CN");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CN" + "'", str8, "CN");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "CHN" + "'", str9, "CHN");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test10258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10258");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("china", 'x');
        java.lang.Class<?>[] wildcardClassArray4 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray3);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concatWith("Hindi (HI!,cHINA)", (java.lang.Object[]) strArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(wildcardClassArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "china" + "'", str5, "china");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "china" + "'", str6, "china");
    }

    @Test
    public void test10259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10259");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.setLanguageTag("zh-CN");
        java.util.Locale locale4 = builder1.build();
        java.lang.String str6 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) builder1, "Chine");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder1.removeUnicodeLocaleAttribute("zh-TW");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: zh-TW [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Locale.Builder" + "'", str6, "Locale.Builder");
    }

    @Test
    public void test10260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10260");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "locle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugernge");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10261");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("En", "ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!", "##############acoL###############", (int) '#');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "En" + "'", str4, "En");
    }

    @Test
    public void test10262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10262");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("\u5927\u62ff\u52a0\u6587\u82f1");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxch", (int) (short) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test10263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10263");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) " ud  ", (java.lang.CharSequence) "ions.EmptySet");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10264");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("ese (Taiwanese (Taiwanese (Taiwanese (Taiwan", "en-c...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10265");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("Itali", 97);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                            Itali" + "'", str2, "                                                                                            Itali");
    }

    @Test
    public void test10266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10266");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("\u82f1\u6587\u7f8e\u56fd)", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u82f1\u6587\u7f8e\u56fd)" + "'", str2, "\u82f1\u6587\u7f8e\u56fd)");
    }

    @Test
    public void test10267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10267");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("\u65e5\u6587", "javacinese.cineselang                                                ", 120);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u65e5\u6587" + "'", str3, "\u65e5\u6587");
    }

    @Test
    public void test10268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10268");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("kor", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "kor" + "'", str2, "kor");
    }

    @Test
    public void test10269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10269");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("                                                                                           Germn", "xxxxxxx", "F   ch");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test10270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10270");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("               RGLASA               ", "slgne");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "               RGLASA               " + "'", str2, "               RGLASA               ");
    }

    @Test
    public void test10271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10271");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("Cina", "Integer");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Cina" + "'", str2, "Cina");
    }

    @Test
    public void test10272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10272");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "                                                                                                    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10273");
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
        java.util.Locale.LanguageRange[] languageRangeArray28 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList29 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList29, languageRangeArray28);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap31 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList32 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList29, strMap31);
        int int33 = languageRangeList29.size();
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor34 = languageRangeList29.listIterator();
        java.util.Locale.LanguageRange languageRange36 = new java.util.Locale.LanguageRange("a");
        java.util.Locale.LanguageRange languageRange38 = new java.util.Locale.LanguageRange("English");
        java.lang.String str40 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) languageRange38, "");
        java.util.Locale.LanguageRange languageRange42 = new java.util.Locale.LanguageRange("English");
        java.util.Locale.LanguageRange[] languageRangeArray43 = new java.util.Locale.LanguageRange[] { languageRange36, languageRange38, languageRange42 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList44 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList44, languageRangeArray43);
        boolean boolean46 = languageRangeList29.retainAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList44);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor47 = languageRangeList44.listIterator();
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap49 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList50 = java.util.Locale.LanguageRange.parse("Cina", strMap49);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap51 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList52 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList50, strMap51);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList54 = java.util.Locale.LanguageRange.parse("hi");
        boolean boolean56 = languageRangeList54.remove((java.lang.Object) "English");
        boolean boolean58 = languageRangeList54.remove((java.lang.Object) 1);
        java.util.Locale.LanguageRange[] languageRangeArray59 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList60 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList60, languageRangeArray59);
        java.util.Locale locale63 = java.util.Locale.FRANCE;
        java.lang.String str64 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale63);
        java.util.Locale locale65 = java.util.Locale.US;
        java.util.Locale locale66 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale67 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale68 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale69 = java.util.Locale.getDefault();
        java.lang.String str70 = locale68.getDisplayCountry(locale69);
        java.lang.String str71 = locale68.toLanguageTag();
        java.util.Locale locale72 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale73 = java.util.Locale.getDefault();
        java.lang.String str74 = locale72.getDisplayCountry(locale73);
        java.util.Locale locale75 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale76 = java.util.Locale.getDefault();
        java.lang.String str77 = locale75.getDisplayCountry(locale76);
        java.util.Locale locale81 = new java.util.Locale("hi", "hi!", "cHINA");
        java.util.Locale locale82 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale83 = java.util.Locale.getDefault();
        java.lang.String str84 = locale82.getDisplayCountry(locale83);
        java.util.Locale locale86 = new java.util.Locale("");
        java.lang.String str87 = locale86.getDisplayVariant();
        java.util.Locale locale88 = java.util.Locale.KOREAN;
        java.util.Locale locale90 = new java.util.Locale("");
        java.util.Locale locale91 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale[] localeArray92 = new java.util.Locale[] { locale63, locale65, locale66, locale67, locale68, locale73, locale75, locale81, locale83, locale86, locale88, locale90, locale91 };
        java.util.ArrayList<java.util.Locale> localeList93 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean94 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList93, localeArray92);
        java.util.List<java.util.Locale> localeList95 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList60, (java.util.Collection<java.util.Locale>) localeList93);
        java.util.Locale locale96 = java.util.Locale.lookup(languageRangeList54, (java.util.Collection<java.util.Locale>) localeList93);
        java.util.List<java.util.Locale> localeList97 = java.util.Locale.filter(languageRangeList52, (java.util.Collection<java.util.Locale>) localeList93);
        java.util.List<java.util.Locale> localeList98 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList44, (java.util.Collection<java.util.Locale>) localeList97);
        java.util.Locale locale99 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList13, (java.util.Collection<java.util.Locale>) localeList98);
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
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\u82f1\u6587" + "'", str21, "\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "a" + "'", str23, "a");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertNotNull(strList27);
        org.junit.Assert.assertNotNull(languageRangeArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(languageRangeList32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(languageRangeItor34);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Locale.LanguageRange" + "'", str40, "Locale.LanguageRange");
        org.junit.Assert.assertNotNull(languageRangeArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(languageRangeItor47);
        org.junit.Assert.assertNotNull(languageRangeList50);
        org.junit.Assert.assertNotNull(languageRangeList52);
        org.junit.Assert.assertNotNull(languageRangeList54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(languageRangeArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "english" + "'", str64, "english");
        org.junit.Assert.assertNotNull(locale65);
        org.junit.Assert.assertEquals(locale65.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale66);
        org.junit.Assert.assertEquals(locale66.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale67);
        org.junit.Assert.assertEquals(locale67.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale68);
        org.junit.Assert.assertEquals(locale68.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale69);
        org.junit.Assert.assertEquals(locale69.toString(), "zh-cnenglish_LOCALE.LANGUAGERANGE");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "China" + "'", str70, "China");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "zh-CN" + "'", str71, "zh-CN");
        org.junit.Assert.assertNotNull(locale72);
        org.junit.Assert.assertEquals(locale72.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale73);
        org.junit.Assert.assertEquals(locale73.toString(), "zh-cnenglish_LOCALE.LANGUAGERANGE");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "China" + "'", str74, "China");
        org.junit.Assert.assertNotNull(locale75);
        org.junit.Assert.assertEquals(locale75.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale76);
        org.junit.Assert.assertEquals(locale76.toString(), "zh-cnenglish_LOCALE.LANGUAGERANGE");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "China" + "'", str77, "China");
        org.junit.Assert.assertEquals(locale81.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale82);
        org.junit.Assert.assertEquals(locale82.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale83);
        org.junit.Assert.assertEquals(locale83.toString(), "zh-cnenglish_LOCALE.LANGUAGERANGE");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "China" + "'", str84, "China");
        org.junit.Assert.assertEquals(locale86.toString(), "");
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "" + "'", str87, "");
        org.junit.Assert.assertNotNull(locale88);
        org.junit.Assert.assertEquals(locale88.toString(), "ko");
        org.junit.Assert.assertEquals(locale90.toString(), "");
        org.junit.Assert.assertNotNull(locale91);
        org.junit.Assert.assertEquals(locale91.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray92);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
        org.junit.Assert.assertNotNull(localeList95);
        org.junit.Assert.assertNull(locale96);
        org.junit.Assert.assertNotNull(localeList97);
        org.junit.Assert.assertNotNull(localeList98);
        org.junit.Assert.assertNull(locale99);
    }

    @Test
    public void test10274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10274");
        java.util.Locale locale1 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale2 = java.util.Locale.getDefault();
        java.lang.String str3 = locale1.getDisplayCountry(locale2);
        java.lang.String str4 = locale2.getDisplayVariant();
        java.lang.String str6 = locale2.getExtension('a');
        java.lang.String str7 = locale2.getVariant();
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.upperCase("enenenenenenenenenen", locale2);
        java.util.Locale.Category category9 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale10 = java.util.Locale.getDefault(category9);
        java.util.Locale locale11 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str12 = locale11.getDisplayLanguage();
        java.lang.String str13 = locale11.getDisplayScript();
        java.util.Locale.setDefault(category9, locale11);
        java.util.Locale locale15 = java.util.Locale.getDefault(category9);
        java.util.Locale locale16 = java.util.Locale.FRENCH;
        java.util.Locale locale17 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str18 = locale17.getDisplayLanguage();
        java.util.Locale locale19 = java.util.Locale.getDefault();
        java.lang.String str20 = locale17.getDisplayCountry(locale19);
        java.util.Locale locale21 = java.util.Locale.TAIWAN;
        java.lang.String str22 = locale21.getVariant();
        java.lang.String str23 = locale17.getDisplayName(locale21);
        java.lang.String str24 = locale16.getDisplayScript(locale17);
        java.util.Locale.setDefault(category9, locale16);
        java.util.Locale locale26 = java.util.Locale.ITALIAN;
        java.util.Locale locale28 = new java.util.Locale("");
        java.lang.String str29 = locale28.getDisplayLanguage();
        java.util.Locale locale30 = java.util.Locale.CANADA;
        java.lang.String str31 = locale30.getDisplayLanguage();
        java.lang.String str32 = locale28.getDisplayScript(locale30);
        java.util.Locale locale34 = java.util.Locale.FRANCE;
        java.lang.String str35 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale34);
        java.lang.String str36 = locale28.getDisplayCountry(locale34);
        java.lang.String str37 = locale26.getDisplayScript(locale28);
        java.util.Locale locale38 = java.util.Locale.GERMAN;
        java.lang.String str39 = locale28.getDisplayLanguage(locale38);
        java.util.Locale locale42 = new java.util.Locale("");
        java.lang.String str43 = locale42.getDisplayLanguage();
        java.util.Locale locale44 = java.util.Locale.CANADA;
        java.lang.String str45 = locale44.getDisplayLanguage();
        java.lang.String str46 = locale42.getDisplayScript(locale44);
        java.lang.String str47 = org.apache.commons.lang3.StringUtils.lowerCase("a", locale42);
        java.lang.String str48 = locale42.getDisplayScript();
        java.lang.String str49 = locale38.getDisplayLanguage(locale42);
        java.util.Set<java.lang.String> strSet50 = locale38.getUnicodeLocaleAttributes();
        java.util.Locale locale52 = new java.util.Locale("I");
        java.lang.String str53 = locale52.getDisplayCountry();
        java.lang.String str54 = locale52.toLanguageTag();
        java.lang.String str55 = locale38.getDisplayScript(locale52);
        java.util.Locale.setDefault(category9, locale52);
        java.lang.String str57 = locale52.getLanguage();
        java.lang.String str58 = locale2.getDisplayName(locale52);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh-cnenglish_LOCALE.LANGUAGERANGE");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "China" + "'", str3, "China");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ENENENENENENENENENEN" + "'", str8, "ENENENENENENENENENEN");
        org.junit.Assert.assertTrue("'" + category9 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category9.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale10);
// flaky:         org.junit.Assert.assertEquals(locale10.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh_TW");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\u4e2d\u6587" + "'", str12, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "fr");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\u4e2d\u6587" + "'", str18, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "zh-cnenglish_LOCALE.LANGUAGERANGE");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Taiwan" + "'", str20, "Taiwan");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\u4e2d\u6587\u53f0\u7063)" + "'", str23, "\u4e2d\u6587\u53f0\u7063)");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "it");
        org.junit.Assert.assertEquals(locale28.toString(), "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "anglais" + "'", str31, "anglais");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "english" + "'", str35, "english");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "de");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals(locale42.toString(), "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "anglais" + "'", str45, "anglais");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "a" + "'", str47, "a");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "German" + "'", str49, "German");
        org.junit.Assert.assertNotNull(strSet50);
        org.junit.Assert.assertEquals(locale52.toString(), "i");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "und" + "'", str54, "und");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "i" + "'", str57, "i");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "zh-cnenglish (LOCALE.LANGUAGERANGE)" + "'", str58, "zh-cnenglish (LOCALE.LANGUAGERANGE)");
    }

    @Test
    public void test10275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10275");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale.Builder builder3 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder5 = builder1.setRegion("zh");
        java.util.Locale.Builder builder6 = builder5.clear();
        java.util.Locale.Builder builder7 = builder6.clearExtensions();
        java.util.Locale.Builder builder9 = builder6.addUnicodeLocaleAttribute("CAN");
        java.util.Locale.Builder builder11 = builder9.setRegion("en");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder14 = builder11.setExtension('u', "                                                wt                                                ");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension value:                                                 wt                                                 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test10276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10276");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "\u65e5\u672c");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10277");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("chinEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglish", (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=chinenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglish");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10278");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "44444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444444444444" + "'", str1, "44444444444444444444444444444444444");
    }

    @Test
    public void test10279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10279");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("chinois (chine)4444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "chinois(chine)4444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str1, "chinois(chine)4444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test10280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10280");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("f   ch", 46);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                        f   ch" + "'", str2, "                                        f   ch");
    }

    @Test
    public void test10281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10281");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("a#", "chinChinChinChinChiChinChinChinChinC", "esesenichz");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test10282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10282");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("Ese (Taiwan$$$$$$$$$slgneese (Taiwan$$$$$$$$$", "ChnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaChnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaChnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaChnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaChnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaChnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaChnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaChnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaChnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Ese (Taiwan$$$$$$$$$slgneese (Taiwan$$$$$$$$$" + "'", str2, "Ese (Taiwan$$$$$$$$$slgneese (Taiwan$$$$$$$$$");
    }

    @Test
    public void test10283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10283");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("WZ.MZ.AZ.TY.EY.SW.FW.UV.NV.IV.GV.EV.CV.AV.ZU.YU.SU.MU.GU.AU.ZT.WT.VT.TT.RT.OT.NT.MT.LT.KT.JT.HT.GT.FT.DT.CT.ZS.YS.XS.VS.TS.SS.RS.OS.NS.MS.LS.KS.JS.IS.HS.GS.ES.DS.CS.BS.AS.WR.UR.SR.OR.ER.AQ.YP.WP.TP.SP.RP.NP.MP.LP.KP.HP.GP.FP.EP.AP.MO.ZN.UN.RN.PN.ON.LN.IN.GN.FN.EN.CN.AN.ZM.YM.XM.WM.VM.UM.TM.SM.RM.QM.PM.OM.NM.MM.LM.KM.HM.GM.FM.EM.DM.CM.AM.YL.VL.UL.TL.SL.RL.KL.IL.CL.BL.AL.ZK.YK.WK.RK.PK.NK.MK.IK.HK.GK.EK.PJ.OJ.MJ.EJ.TI.SI.RI.QI.OI.NI.MI.LI.EI.DI.UH.TH.RH.NH.MH.KH.YG.WG.UG.TG.SG.RG.QG.PG.NG.MG.LG.IG.HG.GG.FG.EG.DG.BG.AG.RF.OF.MF.KF.JF.IF.TE.SE.RE.HE.GE.EE.CE.ZD.OD.MD.KD.JD.ED.ZC.YC.XC.WC.VC.UC.RC.OC.NC.MC.LC.KC.IC.HC.GC.FC.DC.CC.AC.ZB.YB.WB.VB.TB.SB.RB.QB.OB.NB.MB.LB.JB.IB.HB.GB.FB.EB.DB.BB.AB.ZA.XA.WA.UA.TA.SA.RA.QA.OA.NA.MA.LA.IA.GA.FA.EA", "Short", 97);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "WZ.MZ.AZ.TY.EY.SW.FW.UV.NV.IV.GV.EV.CV.AV.ZU.YShortA.XA.WA.UA.TA.SA.RA.QA.OA.NA.MA.LA.IA.GA.FA.EA" + "'", str3, "WZ.MZ.AZ.TY.EY.SW.FW.UV.NV.IV.GV.EV.CV.AV.ZU.YShortA.XA.WA.UA.TA.SA.RA.QA.OA.NA.MA.LA.IA.GA.FA.EA");
    }

    @Test
    public void test10284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10284");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("j", "                                rArrayL");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10285");
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
        java.lang.Class<?>[] wildcardClassArray32 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray3);
        java.lang.Class<?>[] wildcardClassArray33 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray3);
        java.util.Locale.LanguageRange[] languageRangeArray34 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList35 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList35, languageRangeArray34);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap37 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList38 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList35, strMap37);
        int int39 = languageRangeList35.size();
        java.lang.Class[] classArray41 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray42 = (java.lang.Class<?>[]) classArray41;
        java.lang.Class<?>[] wildcardClassArray43 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray41);
        boolean boolean44 = languageRangeList35.equals((java.lang.Object) wildcardClassArray43);
        boolean boolean46 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray3, wildcardClassArray43, true);
        java.lang.Class[] classArray48 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray49 = (java.lang.Class<?>[]) classArray48;
        java.lang.Class<?>[] wildcardClassArray50 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray48);
        java.lang.Class<?> wildcardClass51 = null;
        java.lang.Class[] classArray53 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray54 = (java.lang.Class<?>[]) classArray53;
        wildcardClassArray54[0] = wildcardClass51;
        boolean boolean58 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray50, wildcardClassArray54, false);
        java.lang.Class<?>[] wildcardClassArray59 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray50);
        java.lang.Class[] classArray61 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray62 = (java.lang.Class<?>[]) classArray61;
        java.lang.Class<?>[] wildcardClassArray63 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray61);
        java.lang.Class<?>[] wildcardClassArray64 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray61);
        java.lang.Class<?>[] wildcardClassArray65 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) classArray61);
        java.lang.Class[] classArray67 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray68 = (java.lang.Class<?>[]) classArray67;
        java.lang.Class<?>[] wildcardClassArray69 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray67);
        java.lang.Class<?>[] wildcardClassArray70 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray67);
        java.lang.Class<?>[] wildcardClassArray71 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray67);
        java.lang.String str72 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray71);
        boolean boolean74 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray65, wildcardClassArray71, true);
        java.lang.Class<?>[] wildcardClassArray75 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray65);
        boolean boolean77 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray50, wildcardClassArray75, true);
        java.lang.Class[] classArray79 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray80 = (java.lang.Class<?>[]) classArray79;
        java.lang.Class<?>[] wildcardClassArray81 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray79);
        java.lang.Class<?>[] wildcardClassArray82 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray79);
        java.lang.Class<?>[] wildcardClassArray83 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray79);
        java.lang.Class<?>[] wildcardClassArray84 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray83);
        java.lang.Class<?>[] wildcardClassArray85 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray83);
        boolean boolean86 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray50, wildcardClassArray85);
        boolean boolean88 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray3, wildcardClassArray85, true);
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
        org.junit.Assert.assertNotNull(wildcardClassArray32);
        org.junit.Assert.assertNotNull(wildcardClassArray33);
        org.junit.Assert.assertNotNull(languageRangeArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(languageRangeList38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(classArray41);
        org.junit.Assert.assertNotNull(wildcardClassArray42);
        org.junit.Assert.assertNotNull(wildcardClassArray43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(classArray48);
        org.junit.Assert.assertNotNull(wildcardClassArray49);
        org.junit.Assert.assertNotNull(wildcardClassArray50);
        org.junit.Assert.assertNotNull(classArray53);
        org.junit.Assert.assertNotNull(wildcardClassArray54);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray59);
        org.junit.Assert.assertNotNull(classArray61);
        org.junit.Assert.assertNotNull(wildcardClassArray62);
        org.junit.Assert.assertNotNull(wildcardClassArray63);
        org.junit.Assert.assertNotNull(wildcardClassArray64);
        org.junit.Assert.assertNotNull(wildcardClassArray65);
        org.junit.Assert.assertNotNull(classArray67);
        org.junit.Assert.assertNotNull(wildcardClassArray68);
        org.junit.Assert.assertNotNull(wildcardClassArray69);
        org.junit.Assert.assertNotNull(wildcardClassArray70);
        org.junit.Assert.assertNotNull(wildcardClassArray71);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(classArray79);
        org.junit.Assert.assertNotNull(wildcardClassArray80);
        org.junit.Assert.assertNotNull(wildcardClassArray81);
        org.junit.Assert.assertNotNull(wildcardClassArray82);
        org.junit.Assert.assertNotNull(wildcardClassArray83);
        org.junit.Assert.assertNotNull(wildcardClassArray84);
        org.junit.Assert.assertNotNull(wildcardClassArray85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
    }

    @Test
    public void test10286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10286");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("frazh-CNenglis", "US", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10287");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "ANIHC               EN_ca");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10288");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd", 46, 'u');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fduuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str3, "\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fduuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test10289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10289");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("English");
        java.lang.String str2 = languageRange1.getRange();
        java.util.Locale.LanguageRange languageRange4 = new java.util.Locale.LanguageRange("English");
        java.lang.String str5 = languageRange4.getRange();
        java.util.Locale.LanguageRange languageRange7 = new java.util.Locale.LanguageRange("English");
        java.util.Locale.LanguageRange[] languageRangeArray8 = new java.util.Locale.LanguageRange[] { languageRange1, languageRange4, languageRange7 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList9 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList9, languageRangeArray8);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream11 = languageRangeList9.stream();
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.split("hi!");
        int int14 = languageRangeList9.indexOf((java.lang.Object) strArray13);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "english" + "'", str2, "english");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "english" + "'", str5, "english");
        org.junit.Assert.assertNotNull(languageRangeArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(languageRangeStream11);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test10290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10290");
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
        java.util.Locale locale38 = new java.util.Locale("HArrayList", "englishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglish");
        java.lang.String str39 = locale20.getDisplayScript(locale38);
        java.util.Locale locale41 = new java.util.Locale("undaaaaaaa");
        java.util.Locale locale42 = java.util.Locale.ITALY;
        java.lang.String str43 = locale41.getDisplayLanguage(locale42);
        java.lang.String str44 = locale38.getDisplayCountry(locale42);
        java.lang.Object obj45 = locale42.clone();
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
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "English" + "'", str8, "English");
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
        org.junit.Assert.assertEquals(locale38.toString(), "harraylist_ENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISH");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals(locale41.toString(), "undaaaaaaa");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "undaaaaaaa" + "'", str43, "undaaaaaaa");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "ENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISH" + "'", str44, "ENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISH");
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertEquals(obj45.toString(), "it_IT");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj45), "it_IT");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj45), "it_IT");
    }

    @Test
    public void test10291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10291");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "xxxxxxxxxxxxxxxxxxxxxxxxxChinese", "chinchinchinchinchichinchinchinchinc");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10292");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "               RGLaSa               ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaCinaxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 18 + "'", int2 == 18);
    }

    @Test
    public void test10293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10293");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("CINA$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CINA$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$" + "'", str2, "CINA$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
    }

    @Test
    public void test10294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10294");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("aCOL", (int) (byte) 10, 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test10295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10295");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("hi");
        java.lang.Object[] objArray2 = languageRangeList1.toArray();
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream3 = languageRangeList1.parallelStream();
        int int5 = languageRangeList1.lastIndexOf((java.lang.Object) "Short");
        java.util.Iterator<java.util.Locale.LanguageRange> languageRangeItor6 = languageRangeList1.iterator();
        java.util.Locale.LanguageRange languageRange7 = languageRangeItor6.next();
        double double8 = languageRange7.getWeight();
        java.lang.String str9 = languageRange7.getRange();
        java.util.Locale.LanguageRange[] languageRangeArray10 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList11 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList11, languageRangeArray10);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap13 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList14 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList11, strMap13);
        java.util.Iterator<java.util.Locale.LanguageRange> languageRangeItor15 = languageRangeList11.iterator();
        java.util.Locale locale18 = new java.util.Locale("");
        java.lang.String str19 = locale18.getDisplayLanguage();
        java.util.Locale locale20 = java.util.Locale.CANADA;
        java.lang.String str21 = locale20.getDisplayLanguage();
        java.lang.String str22 = locale18.getDisplayScript(locale20);
        java.lang.String str23 = locale20.getDisplayVariant();
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.upperCase("", locale20);
        java.lang.String str25 = locale20.getLanguage();
        boolean boolean26 = languageRangeList11.equals((java.lang.Object) locale20);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream27 = languageRangeList11.parallelStream();
        java.util.Locale.LanguageRange[] languageRangeArray28 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList29 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList29, languageRangeArray28);
        java.util.Locale locale32 = java.util.Locale.FRANCE;
        java.lang.String str33 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale32);
        java.util.Locale locale34 = java.util.Locale.US;
        java.util.Locale locale35 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale36 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale37 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale38 = java.util.Locale.getDefault();
        java.lang.String str39 = locale37.getDisplayCountry(locale38);
        java.lang.String str40 = locale37.toLanguageTag();
        java.util.Locale locale41 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale42 = java.util.Locale.getDefault();
        java.lang.String str43 = locale41.getDisplayCountry(locale42);
        java.util.Locale locale44 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale45 = java.util.Locale.getDefault();
        java.lang.String str46 = locale44.getDisplayCountry(locale45);
        java.util.Locale locale50 = new java.util.Locale("hi", "hi!", "cHINA");
        java.util.Locale locale51 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale52 = java.util.Locale.getDefault();
        java.lang.String str53 = locale51.getDisplayCountry(locale52);
        java.util.Locale locale55 = new java.util.Locale("");
        java.lang.String str56 = locale55.getDisplayVariant();
        java.util.Locale locale57 = java.util.Locale.KOREAN;
        java.util.Locale locale59 = new java.util.Locale("");
        java.util.Locale locale60 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale[] localeArray61 = new java.util.Locale[] { locale32, locale34, locale35, locale36, locale37, locale42, locale44, locale50, locale52, locale55, locale57, locale59, locale60 };
        java.util.ArrayList<java.util.Locale> localeList62 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList62, localeArray61);
        java.util.List<java.util.Locale> localeList64 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList29, (java.util.Collection<java.util.Locale>) localeList62);
        java.util.List<java.util.Locale> localeList65 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList11, (java.util.Collection<java.util.Locale>) localeList62);
        boolean boolean66 = languageRange7.equals((java.lang.Object) localeList65);
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(languageRangeStream3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(languageRangeItor6);
        org.junit.Assert.assertNotNull(languageRange7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi" + "'", str9, "hi");
        org.junit.Assert.assertNotNull(languageRangeArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(languageRangeList14);
        org.junit.Assert.assertNotNull(languageRangeItor15);
        org.junit.Assert.assertEquals(locale18.toString(), "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "inglese" + "'", str21, "inglese");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "en" + "'", str25, "en");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(languageRangeStream27);
        org.junit.Assert.assertNotNull(languageRangeArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "english" + "'", str33, "english");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "it");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Cina" + "'", str39, "Cina");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "zh-CN" + "'", str40, "zh-CN");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "it");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Cina" + "'", str43, "Cina");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "it");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Cina" + "'", str46, "Cina");
        org.junit.Assert.assertEquals(locale50.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "it");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Cina" + "'", str53, "Cina");
        org.junit.Assert.assertEquals(locale55.toString(), "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertNotNull(locale57);
        org.junit.Assert.assertEquals(locale57.toString(), "ko");
        org.junit.Assert.assertEquals(locale59.toString(), "");
        org.junit.Assert.assertNotNull(locale60);
        org.junit.Assert.assertEquals(locale60.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(localeList64);
        org.junit.Assert.assertNotNull(localeList65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test10296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10296");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "esecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinese");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10297");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("redliub", (int) '#', (int) ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test10298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10298");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("chinois (chine)", "CAN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10299");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.lang.Class<?>[] wildcardClassArray3 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray1);
        java.lang.Class<?>[] wildcardClassArray4 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray1);
        java.lang.Class[] classArray6 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray7 = (java.lang.Class<?>[]) classArray6;
        java.lang.Class<?>[] wildcardClassArray8 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray6);
        java.lang.Class<?>[] wildcardClassArray9 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) classArray6, "zh-CN");
        boolean boolean12 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray4, (java.lang.Class<?>[]) classArray6);
        java.lang.Class[] classArray14 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray15 = (java.lang.Class<?>[]) classArray14;
        java.lang.Class<?>[] wildcardClassArray16 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray14);
        java.lang.Class<?>[] wildcardClassArray17 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray14);
        java.lang.Class[] classArray20 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray21 = (java.lang.Class<?>[]) classArray20;
        java.lang.Class<?>[] wildcardClassArray22 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray20);
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.concatWith("hi!", (java.lang.Object[]) classArray20);
        boolean boolean24 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray14, (java.lang.Class<?>[]) classArray20);
        boolean boolean26 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray4, (java.lang.Class<?>[]) classArray20, true);
        java.lang.Class[] classArray28 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray29 = (java.lang.Class<?>[]) classArray28;
        java.lang.Class<?>[] wildcardClassArray30 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray28);
        java.lang.Class<?>[] wildcardClassArray31 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray28);
        java.lang.Class[] classArray34 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray35 = (java.lang.Class<?>[]) classArray34;
        java.lang.Class<?>[] wildcardClassArray36 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray34);
        java.lang.String str37 = org.apache.commons.lang3.StringUtils.concatWith("hi!", (java.lang.Object[]) classArray34);
        boolean boolean38 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray28, (java.lang.Class<?>[]) classArray34);
        java.lang.Class<?>[] wildcardClassArray39 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers((java.lang.Class<?>[]) classArray34);
        java.lang.Class<?>[] wildcardClassArray40 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray39);
        boolean boolean42 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray20, wildcardClassArray40, false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str46 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray40, 'u', (int) ' ', 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertNotNull(wildcardClassArray4);
        org.junit.Assert.assertNotNull(classArray6);
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        org.junit.Assert.assertNotNull(wildcardClassArray8);
        org.junit.Assert.assertNotNull(wildcardClassArray9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(classArray14);
        org.junit.Assert.assertNotNull(wildcardClassArray15);
        org.junit.Assert.assertNotNull(wildcardClassArray16);
        org.junit.Assert.assertNotNull(wildcardClassArray17);
        org.junit.Assert.assertNotNull(classArray20);
        org.junit.Assert.assertNotNull(wildcardClassArray21);
        org.junit.Assert.assertNotNull(wildcardClassArray22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(classArray28);
        org.junit.Assert.assertNotNull(wildcardClassArray29);
        org.junit.Assert.assertNotNull(wildcardClassArray30);
        org.junit.Assert.assertNotNull(wildcardClassArray31);
        org.junit.Assert.assertNotNull(classArray34);
        org.junit.Assert.assertNotNull(wildcardClassArray35);
        org.junit.Assert.assertNotNull(wildcardClassArray36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray39);
        org.junit.Assert.assertNotNull(wildcardClassArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
    }

    @Test
    public void test10300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10300");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("\u6cd5\u6587", "cinaxxxxxcNn");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u6cd5\u6587" + "'", str2, "\u6cd5\u6587");
    }

    @Test
    public void test10301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10301");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("undaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "undaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaa" + "'", str1, "undaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaa");
    }

    @Test
    public void test10302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10302");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName("en-C...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "en-C.." + "'", str1, "en-C..");
    }

    @Test
    public void test10303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10303");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "Ithi!lihi!no");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10304");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("An                              ", 7);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "An                              " + "'", str2, "An                              ");
    }

    @Test
    public void test10305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10305");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("cHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 100, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "cHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA444444444444444444444444444444444444444444444444" + "'", str3, "cHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test10306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10306");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRIAD.AE.AF", "EnglHI!STRING[]STRING[]SsHI!STRING[]STRING[]S");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10307");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName("Locale.LanguageRange");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "LanguageRange" + "'", str1, "LanguageRange");
    }

    @Test
    public void test10308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10308");
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
        java.util.Locale.Builder builder33 = builder32.clear();
        java.util.Locale.Builder builder34 = builder33.clearExtensions();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "anglais" + "'", str13, "anglais");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "it");
        org.junit.Assert.assertEquals(locale17.toString(), "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "en_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "anglais" + "'", str20, "anglais");
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
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder34);
    }

    @Test
    public void test10309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10309");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("java . lang", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ava . lang" + "'", str2, "ava . lang");
    }

    @Test
    public void test10310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10310");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens(".", "HI");
        java.lang.Class<?>[] wildcardClassArray3 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray2);
        java.lang.Class<?>[] wildcardClassArray4 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray3, ' ', 31, 116);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 31");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertNotNull(wildcardClassArray4);
    }

    @Test
    public void test10311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10311");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortClassName("locale.languagerange");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "languagerange" + "'", str1, "languagerange");
    }

    @Test
    public void test10312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10312");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("I!Hchizh_TW", "ncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncArrayLis");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I!Hchizh_TW" + "'", str2, "I!Hchizh_TW");
    }

    @Test
    public void test10313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10313");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("\u4e2d\u6587 (ZH)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10314");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#" + "'", str1, "a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#");
    }

    @Test
    public void test10315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10315");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("rglAsA", "undaaaaaaaH", 16, 97);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "rglAsAundaaaaaaaH" + "'", str4, "rglAsAundaaaaaaaH");
    }

    @Test
    public void test10316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10316");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("\u4e2d\u56fdAD.AE.AFxxxxxxxxxxxxxxxxxxxxxxxxx", "##############acoL###############", (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10317");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("                    nglish  Hindi (HI!,cHINA", "xxxhi!xxxxxxxhi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10318");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("ENGLIILISHESE (TAIWANESE (TAIWANESE (TAIWANESE (TAIWANESE (TAIWANESE (TAIWANESE (TAIWANESE (TAIWA", '#');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test10319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10319");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("WZ.MZ.AZ.TY.EY.SW.FW.UV.NV.IV.GV.EV.CV.AV.ZU.YU.SU.MU.GU.AU.ZT.WT.VT.TT.RT.OT.NT.MT.LT.KT.JT.HT.GT.FT.DT.CT.ZS.YS.XS.VS.TS.SS.RS.OS.NS.MS.LS.KS.JS.IS.HS.GS.ES.DS.CS.BS.AS.WR.UR.SR.OR.ER.AQ.YP.WP.TP.SP.RP.NP.MP.LP.KP.HP.GP.FP.EP.AP.MO.ZN.UN.RN.PN.ON.LN.IN.GN.FN.EN.CN.AN.ZM.YM.XM.WM.VM.UM.TM.SM.RM.QM.PM.OM.NM.MM.LM.KM.HM.GM.FM.EM.DM.CM.AM.YL.VL.UL.TL.SL.RL.KL.IL.CL.BL.AL.ZK.YK.WK.RK.PK.NK.MK.IK.HK.GK.EK.PJ.OJ.MJ.EJ.TI.SI.RI.QI.OI.NI.MI.LI.EI.DI.UH.TH.RH.NH.MH.KH.YG.WG.UG.TG.SG.RG.QG.PG.NG.MG.LG.IG.HG.GG.FG.EG.DG.BG.AG.RF.OF.MF.KF.JF.IF.TE.SE.RE.HE.GE.EE.CE.ZD.OD.MD.KD.JD.ED.ZC.YC.XC.WC.VC.UC.RC.OC.NC.MC.LC.KC.IC.HC.GC.FC.DC.CC.AC.ZB.YB.WB.VB.TB.SB.RB.QB.OB.NB.MB.LB.JB.IB.HB.GB.FB.EB.DB.BB.AB.ZA.XA.WA.UA.TA.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaanhcGA.FA.EA.DA", "ese (Taiwanese (Taiwanese (Taiwanese (Taiwan", 13);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test10320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10320");
        java.util.Locale locale3 = new java.util.Locale("TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]", "ithi!li", "FRAN\307AIS");
        org.junit.Assert.assertEquals(locale3.toString(), "tring[]tring[]tring[]tring[]tring[]tring[]tring[]tring[]tring[]tring[]tring[]tring[]tring[]tring[]tring[]tring[]tring[]tring[]tring[]tring[]tring[]tring[]tring[]tring[]tring[]tring[]tring[]tring[]tring[]tring[]tring[]tring[]tring[]tring[]tring[]tring[]tring[]tring[]tring[]tring[]tring[]tring[]tring[]tring[]tring[]tring[]tring[]tring[]tring[]tring[]tring[]tring[]tring[]tring[]tring[]tring[]tring[]tring[]tring[]tring[]tring[]tring[]tring[]tring[]tring[]tring[]tring[]tring[]tring[]tring[]tring[]tring[]tring[]tring[]tring[]tring[]tring[]tring[]tring[]tring[]tring[]tring[]tring[]tring[]tring[]tring[]tring[]tring[]tring[]tring[]tring[]tring[]tring[]tring[]tring[]tring[]tring[]tring[]tring[]tring[]_ITHI!LI_FRAN\307AIS");
    }

    @Test
    public void test10321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10321");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            italiahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIital...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10322");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("An                              ", "\u6587\u4e2desenihC");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test10323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10323");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("xxxx", 3, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "xxxx" + "'", str3, "xxxx");
    }

    @Test
    public void test10324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10324");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap3);
        java.util.Spliterator<java.util.Locale.LanguageRange> languageRangeSpliterator5 = languageRangeList1.spliterator();
        languageRangeList1.clear();
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor7 = languageRangeList1.listIterator();
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor8 = languageRangeList1.listIterator();
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor9 = languageRangeList1.listIterator();
        java.util.Iterator<java.util.Locale.LanguageRange> languageRangeItor10 = languageRangeList1.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange12 = languageRangeList1.remove(279);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 279, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(languageRangeSpliterator5);
        org.junit.Assert.assertNotNull(languageRangeItor7);
        org.junit.Assert.assertNotNull(languageRangeItor8);
        org.junit.Assert.assertNotNull(languageRangeItor9);
        org.junit.Assert.assertNotNull(languageRangeItor10);
    }

    @Test
    public void test10325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10325");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("short", "string", 48);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10326");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap3);
        int int5 = languageRangeList1.size();
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor6 = languageRangeList1.listIterator();
        java.util.List<java.util.Locale.LanguageRange> languageRangeList8 = java.util.Locale.LanguageRange.parse("hi");
        int int10 = languageRangeList8.indexOf((java.lang.Object) '4');
        java.util.Locale.LanguageRange[] languageRangeArray11 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList12 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList12, languageRangeArray11);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap14 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList15 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList12, strMap14);
        int int16 = languageRangeList12.size();
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor17 = languageRangeList12.listIterator();
        java.util.Locale.LanguageRange languageRange19 = new java.util.Locale.LanguageRange("a");
        java.util.Locale.LanguageRange languageRange21 = new java.util.Locale.LanguageRange("English");
        java.lang.String str23 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) languageRange21, "");
        java.util.Locale.LanguageRange languageRange25 = new java.util.Locale.LanguageRange("English");
        java.util.Locale.LanguageRange[] languageRangeArray26 = new java.util.Locale.LanguageRange[] { languageRange19, languageRange21, languageRange25 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList27 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList27, languageRangeArray26);
        boolean boolean29 = languageRangeList12.retainAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList27);
        java.util.Locale.LanguageRange[] languageRangeArray30 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList31 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList31, languageRangeArray30);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap33 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList34 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList31, strMap33);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor35 = languageRangeList34.listIterator();
        java.lang.String[] strArray37 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList38 = new java.util.ArrayList<java.lang.String>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList38, strArray37);
        java.util.Locale.LanguageRange[] languageRangeArray40 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList41 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList41, languageRangeArray40);
        java.util.Locale locale44 = java.util.Locale.FRANCE;
        java.lang.String str45 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale44);
        java.util.Locale locale46 = java.util.Locale.US;
        java.util.Locale locale47 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale48 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale49 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale50 = java.util.Locale.getDefault();
        java.lang.String str51 = locale49.getDisplayCountry(locale50);
        java.lang.String str52 = locale49.toLanguageTag();
        java.util.Locale locale53 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale54 = java.util.Locale.getDefault();
        java.lang.String str55 = locale53.getDisplayCountry(locale54);
        java.util.Locale locale56 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale57 = java.util.Locale.getDefault();
        java.lang.String str58 = locale56.getDisplayCountry(locale57);
        java.util.Locale locale62 = new java.util.Locale("hi", "hi!", "cHINA");
        java.util.Locale locale63 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale64 = java.util.Locale.getDefault();
        java.lang.String str65 = locale63.getDisplayCountry(locale64);
        java.util.Locale locale67 = new java.util.Locale("");
        java.lang.String str68 = locale67.getDisplayVariant();
        java.util.Locale locale69 = java.util.Locale.KOREAN;
        java.util.Locale locale71 = new java.util.Locale("");
        java.util.Locale locale72 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale[] localeArray73 = new java.util.Locale[] { locale44, locale46, locale47, locale48, locale49, locale54, locale56, locale62, locale64, locale67, locale69, locale71, locale72 };
        java.util.ArrayList<java.util.Locale> localeList74 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList74, localeArray73);
        java.util.List<java.util.Locale> localeList76 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList41, (java.util.Collection<java.util.Locale>) localeList74);
        java.lang.String[] strArray84 = new java.lang.String[] { "English", "hi", "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "", "a", "", "China" };
        java.util.ArrayList<java.lang.String> strList85 = new java.util.ArrayList<java.lang.String>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList85, strArray84);
        java.util.List<java.lang.Class<?>> wildcardClassList87 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList85);
        java.util.Locale.FilteringMode filteringMode88 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList89 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList41, (java.util.Collection<java.lang.String>) strList85, filteringMode88);
        java.util.List<java.lang.String> strList90 = java.util.Locale.filterTags(languageRangeList34, (java.util.Collection<java.lang.String>) strList38, filteringMode88);
        boolean boolean91 = languageRangeList12.remove((java.lang.Object) strList90);
        java.util.List<java.lang.String> strList92 = java.util.Locale.filterTags(languageRangeList8, (java.util.Collection<java.lang.String>) strList90);
        java.lang.String str93 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList90);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(languageRangeItor6);
        org.junit.Assert.assertNotNull(languageRangeList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(languageRangeArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(languageRangeList15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(languageRangeItor17);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Locale.LanguageRange" + "'", str23, "Locale.LanguageRange");
        org.junit.Assert.assertNotNull(languageRangeArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(languageRangeArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(languageRangeList34);
        org.junit.Assert.assertNotNull(languageRangeItor35);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(languageRangeArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "english" + "'", str45, "english");
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "it");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Cina" + "'", str51, "Cina");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "zh-CN" + "'", str52, "zh-CN");
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "it");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "Cina" + "'", str55, "Cina");
        org.junit.Assert.assertNotNull(locale56);
        org.junit.Assert.assertEquals(locale56.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale57);
        org.junit.Assert.assertEquals(locale57.toString(), "it");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "Cina" + "'", str58, "Cina");
        org.junit.Assert.assertEquals(locale62.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale64);
        org.junit.Assert.assertEquals(locale64.toString(), "it");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "Cina" + "'", str65, "Cina");
        org.junit.Assert.assertEquals(locale67.toString(), "");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertNotNull(locale69);
        org.junit.Assert.assertEquals(locale69.toString(), "ko");
        org.junit.Assert.assertEquals(locale71.toString(), "");
        org.junit.Assert.assertNotNull(locale72);
        org.junit.Assert.assertEquals(locale72.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(localeList76);
        org.junit.Assert.assertNotNull(strArray84);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertNotNull(wildcardClassList87);
        org.junit.Assert.assertTrue("'" + filteringMode88 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode88.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList89);
        org.junit.Assert.assertNotNull(strList90);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNotNull(strList92);
        org.junit.Assert.assertNull(str93);
    }

    @Test
    public void test10327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10327");
        java.util.Locale locale1 = new java.util.Locale("LOCLE.LNGUGERNGE");
        boolean boolean2 = locale1.hasExtensions();
        java.lang.String str3 = locale1.getVariant();
        org.junit.Assert.assertEquals(locale1.toString(), "locle.lngugernge");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test10328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10328");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName("                                                                                                                                                                                                                                                          EN-CASTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRIN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EN-CASTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRIN" + "'", str1, "EN-CASTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRIN");
    }

    @Test
    public void test10329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10329");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("\u65e5\u6587\u65e5\u6587\u65e5\u6587\u65e5\u6587\u65e5\u6587\u65e5\u6587", "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxc", "CINA$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u65e5\u6587\u65e5\u6587\u65e5\u6587\u65e5\u6587\u65e5\u6587\u65e5\u6587" + "'", str3, "\u65e5\u6587\u65e5\u6587\u65e5\u6587\u65e5\u6587\u65e5\u6587\u65e5\u6587");
    }

    @Test
    public void test10330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10330");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("...xxxxx", 10, (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10331");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("nenenenenenenenenene");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "NENENENENENENENENENE" + "'", str1, "NENENENENENENENENENE");
    }

    @Test
    public void test10332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10332");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("it", strMap1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList2, '#');
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap5 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList6 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList2, strMap5);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap8 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList9 = java.util.Locale.LanguageRange.parse("Cina", strMap8);
        java.lang.String[] strArray13 = new java.lang.String[] { "aiaiaiaiaiaiaiaiaia", "zh-CN", "China" };
        java.util.ArrayList<java.lang.String> strList14 = new java.util.ArrayList<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList14, strArray13);
        java.util.Locale.FilteringMode filteringMode16 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList17 = java.util.Locale.filterTags(languageRangeList9, (java.util.Collection<java.lang.String>) strList14, filteringMode16);
        boolean boolean18 = languageRangeList2.contains((java.lang.Object) strList14);
        boolean boolean19 = languageRangeList2.isEmpty();
        java.lang.Object[] objArray20 = languageRangeList2.toArray();
        java.lang.Class<?> wildcardClass21 = objArray20.getClass();
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeList6);
        org.junit.Assert.assertNotNull(languageRangeList9);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + filteringMode16 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode16.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test10333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10333");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("EnglGermnsGermn", "LANGUAGERANGE");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10334");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("TWN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "TW" + "'", str1, "TW");
    }

    @Test
    public void test10335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10335");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str1 = locale0.getDisplayLanguage();
        java.util.Locale locale2 = java.util.Locale.getDefault();
        java.lang.String str3 = locale0.getDisplayCountry(locale2);
        java.lang.String str4 = locale0.getDisplayScript();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "chinois" + "'", str1, "chinois");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "it");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Taiwan" + "'", str3, "Taiwan");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test10336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10336");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "chinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachina");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10337");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("CINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINA", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test10338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10338");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("English", "hi", (int) (short) -1);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("a", "");
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray7);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEach("en", strArray4, strArray8);
        java.lang.String str11 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) strArray4, "inglese");
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "ESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWAN");
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "en" + "'", str9, "en");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "String[]" + "'", str11, "String[]");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "English" + "'", str14, "English");
    }

    @Test
    public void test10339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10339");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("slgnEslgnEslgnEfran\347ais (Canada)slgnEslgnEslgnEs", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444HindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "slgnEslgnEslgnEfran\347ais (Canada)slgnEslgnEslgnEs" + "'", str2, "slgnEslgnEslgnEfran\347ais (Canada)slgnEslgnEslgnEs");
    }

    @Test
    public void test10340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10340");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("            )ANIHc,!IH(idni", 12);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "            )ANIHc,!IH(idni            )ANIHc,!IH(idni            )ANIHc,!IH(idni            )ANIHc,!IH(idni            )ANIHc,!IH(idni            )ANIHc,!IH(idni            )ANIHc,!IH(idni            )ANIHc,!IH(idni            )ANIHc,!IH(idni            )ANIHc,!IH(idni            )ANIHc,!IH(idni            )ANIHc,!IH(idni" + "'", str2, "            )ANIHc,!IH(idni            )ANIHc,!IH(idni            )ANIHc,!IH(idni            )ANIHc,!IH(idni            )ANIHc,!IH(idni            )ANIHc,!IH(idni            )ANIHc,!IH(idni            )ANIHc,!IH(idni            )ANIHc,!IH(idni            )ANIHc,!IH(idni            )ANIHc,!IH(idni            )ANIHc,!IH(idni");
    }

    @Test
    public void test10341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10341");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("cncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncArrayList", "zh-ZH", 33);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test10342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10342");
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
        java.util.List<java.util.Locale.LanguageRange> languageRangeList16 = java.util.Locale.LanguageRange.parse("  China   ");
        boolean boolean17 = languageRangeList2.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList16);
        java.util.Iterator<java.util.Locale.LanguageRange> languageRangeItor18 = languageRangeList16.iterator();
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(languageRangeItor18, 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange21 = languageRangeItor18.next();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Locale.LanguageRange" + "'", str6, "Locale.LanguageRange");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "english" + "'", str7, "english");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(languageRangeList14);
        org.junit.Assert.assertNotNull(languageRangeList16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(languageRangeItor18);
    }

    @Test
    public void test10343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10343");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "java . lang");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10344");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("ArrayList", "inglese (Canada)                                                                                       ese(Taiwan                                                                                       ese(Taiwan                                                                                       ese(Taiwan                                           ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10345");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "AHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H", "ia");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test10346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10346");
        java.util.Locale locale0 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale1 = java.util.Locale.getDefault();
        java.lang.String str2 = locale0.getDisplayCountry(locale1);
        java.util.Locale locale3 = null;
        java.lang.String str4 = locale1.getDisplayVariant(locale3);
        java.util.Locale locale5 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale6 = java.util.Locale.getDefault();
        java.lang.String str7 = locale5.getDisplayCountry(locale6);
        java.lang.String str8 = locale5.toLanguageTag();
        java.lang.String str9 = locale1.getDisplayCountry(locale5);
        java.lang.String str11 = locale1.getExtension('x');
        java.lang.String str12 = locale1.getISO3Language();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Cina" + "'", str2, "Cina");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "it");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Cina" + "'", str7, "Cina");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "zh-CN" + "'", str8, "zh-CN");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ita" + "'", str12, "ita");
    }

    @Test
    public void test10347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10347");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("lang                                                                                                ", "I!H");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "lang                                                                                                " + "'", str2, "lang                                                                                                ");
    }

    @Test
    public void test10348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10348");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("hi!hi!hi!hi!hi!hZH_z!hi!hi!hi!hi!hi44444444444444444444444444444444444444444444444444444444444444", "CHINA", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10349");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setScript("");
        java.util.Locale.Builder builder4 = builder2.setLanguage("HI");
        java.util.Locale locale5 = java.util.Locale.FRANCE;
        java.util.Locale.Builder builder6 = builder4.setLocale(locale5);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder6.setExtension('#', "\u4e2d\u56fd");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key: # [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test10350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10350");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("AHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H", "english");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "AD.AE.AF.AG.AI.AL.AM.AN.AO.AQ.AR.AS.AT.AU.AW.AX.AZ.BA.BB.BD.BE.BF.BG.BH.BI.BJ.BL.BM.BN.BO.BQ.BR.BS.BT.BV.BW.BY.BZ.CA.CC.CD.CF.CG.CH.CI.CK.CL.CM.CN.CO.CR.CU.CV.CW.CX.CY.CZ.DE.DJ.DK.DM.DO.DZ.EC.EE.EG.EH.ER.ES.ET.FI.FJ.FK.FM.FO.FR.GA.GB.GD.GE.GF.GG.GH.GI.GL.GM.GN.GP.GQ.GR.GS.GT.GU.GW.GY.HK.HM.HN.HR.HT.HU.ID.IE.IL.IM.IN.IO.IQ.IR.IS.IT.JE.JM.JO.JP.KE.KG.KH.KI.KM.KN.KP.KR.KW.KY.KZ.LA.LB.LC.LI.LK.LR.LS.LT.LU.LV.LY.MA.MC.MD.ME.MF.MG.MH.MK.ML.MM.MN.MO.MP.MQ.MR.MS.MT.MU.MV.MW.MX.MY.MZ.NA.NC.NE.NF.NG.NI.NL.NO.NP.NR.NU.NZ.OM.PA.PE.PF.PG.PH.PK.PL.PM.PN.PR.PS.PT.PW.PY.QA.RE.RO.RS.RU.RW.SA.SB.SC.SD.SE.SG.SH.SI.SJ.SK.SL.SM.SN.SO.SR.SS.ST.SV.SX.SY.SZ.TC.TD.TF.TG.TH.TJ.TK.TL.TM.TN.TO.TR.TT.TV.TW.TZ.UA.UG.UM.US.UY.UZ.VA.VC.VE.VG.VI.VN.VU.WF.WS.YE.YT.ZA.ZM.ZW", (int) (byte) -1);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.endsWithAny("en", strArray9);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                 a                  ", strArray3, strArray9);
        java.lang.String str13 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) "                 a                  ", "#...");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "AHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H" + "'", str4, "AHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "                 a                  " + "'", str11, "                 a                  ");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "String" + "'", str13, "String");
    }

    @Test
    public void test10351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10351");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("t           hindi(HI!,cHINA)            ", "                  hI   Taiwan                  hI   xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "t           hindi(HI!,cHINA)" + "'", str2, "t           hindi(HI!,cHINA)");
    }

    @Test
    public void test10352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10352");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("it_CN", "lang                                                                                                ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test10353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10353");
        java.util.Locale locale2 = new java.util.Locale("italiano", "Ci_a");
        java.util.Locale locale6 = new java.util.Locale("Canada", "allemand", "cHINA");
        java.lang.String str7 = locale2.getDisplayName(locale6);
        java.util.Set<java.lang.Character> charSet8 = locale2.getExtensionKeys();
        java.util.Locale.Builder builder9 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder10 = builder9.clearExtensions();
        java.util.Locale.Builder builder12 = builder10.setLanguageTag("zh-CN");
        java.util.Locale.Builder builder14 = builder12.setLanguage("CHINA");
        java.util.Locale.Builder builder16 = builder14.setLanguageTag("english");
        java.util.Locale.Builder builder17 = builder16.clear();
        java.util.Locale.Builder builder18 = builder17.clearExtensions();
        boolean boolean19 = locale2.equals((java.lang.Object) builder17);
        org.junit.Assert.assertEquals(locale2.toString(), "italiano_CI_A");
        org.junit.Assert.assertEquals(locale6.toString(), "canada_ALLEMAND_cHINA");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "italiano (CI_A)" + "'", str7, "italiano (CI_A)");
        org.junit.Assert.assertNotNull(charSet8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test10354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10354");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("nawiaT");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "nawiaT" + "'", str1, "nawiaT");
    }

    @Test
    public void test10355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10355");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("anglais (Canada)                                                                                    ", "yListayListiiiiiiiiiiiiiiiiiiiiiiiArrayListiiiiiiiiiiiiiiiiiiiiiiiArrayListiiiiiiiiiiiiiiiiiiiiiiiArrayListiiiiiiiiiiiiiiiiiiiiiiiArrayListiiiiiiiiiiiiiiiiiiiiiiiArrayListiiiiiiiiiiiiiiiiiiiiiiiArrayListiiiiiiiiiiiiiiiiiiiiiiiArrayListiiiiiiiiiiiiiiiiiiiiiiiArraiiiiiiiiiiiiiiiiiiiiiiiAr", 16);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test10356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10356");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("ANIHC", "AAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test10357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10357");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("s", (int) '$', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                 s                  " + "'", str3, "                 s                  ");
    }

    @Test
    public void test10358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10358");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("", "\u5357\u97d3\u4e2d\u56fd\u4e2d\u56fd\u4e2d\u56fd\u4e2d\u56fd\u4e2d\u56fd\u4e2d\u56fd\u4e2d\u56fd\u4e2d\u56fd\u4e2d\u56fdAD");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10359");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "xxxxxxxxxxxxxxJapanesexxxxxxxxxxxxxx");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10360");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("Locale.LanguageRang", "liI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Locale.LanguageRang" + "'", str2, "Locale.LanguageRang");
    }

    @Test
    public void test10361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10361");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("", "esecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinese");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10362");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd(" ud  ", "iiiiiiiiiiiiiiiiiiiiiiistringiiiiiiiiiiiiiiiiiiiiiii");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " ud  " + "'", str2, " ud  ");
    }

    @Test
    public void test10363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10363");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("\u6587\u5fb7", "zh-CNnglese");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u6587\u5fb7" + "'", str2, "\u6587\u5fb7");
    }

    @Test
    public void test10364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10364");
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
        java.lang.Object obj71 = null;
        boolean boolean72 = languageRangeList59.equals(obj71);
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
        org.junit.Assert.assertEquals(locale16.toString(), "it");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Cina" + "'", str17, "Cina");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "zh-CN" + "'", str18, "zh-CN");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "it");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Cina" + "'", str21, "Cina");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "it");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Cina" + "'", str24, "Cina");
        org.junit.Assert.assertEquals(locale28.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "it");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Cina" + "'", str31, "Cina");
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
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test10365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10365");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("-CA", "$", (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10366");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("hi");
        boolean boolean4 = languageRangeList2.remove((java.lang.Object) "English");
        java.util.Locale.LanguageRange[] languageRangeArray5 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList6 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList6, languageRangeArray5);
        java.util.Locale locale9 = java.util.Locale.FRANCE;
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale9);
        java.util.Locale locale11 = java.util.Locale.US;
        java.util.Locale locale12 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale13 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale14 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale15 = java.util.Locale.getDefault();
        java.lang.String str16 = locale14.getDisplayCountry(locale15);
        java.lang.String str17 = locale14.toLanguageTag();
        java.util.Locale locale18 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale19 = java.util.Locale.getDefault();
        java.lang.String str20 = locale18.getDisplayCountry(locale19);
        java.util.Locale locale21 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale22 = java.util.Locale.getDefault();
        java.lang.String str23 = locale21.getDisplayCountry(locale22);
        java.util.Locale locale27 = new java.util.Locale("hi", "hi!", "cHINA");
        java.util.Locale locale28 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale29 = java.util.Locale.getDefault();
        java.lang.String str30 = locale28.getDisplayCountry(locale29);
        java.util.Locale locale32 = new java.util.Locale("");
        java.lang.String str33 = locale32.getDisplayVariant();
        java.util.Locale locale34 = java.util.Locale.KOREAN;
        java.util.Locale locale36 = new java.util.Locale("");
        java.util.Locale locale37 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale[] localeArray38 = new java.util.Locale[] { locale9, locale11, locale12, locale13, locale14, locale19, locale21, locale27, locale29, locale32, locale34, locale36, locale37 };
        java.util.ArrayList<java.util.Locale> localeList39 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList39, localeArray38);
        java.util.List<java.util.Locale> localeList41 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList6, (java.util.Collection<java.util.Locale>) localeList39);
        java.util.List<java.util.Locale> localeList42 = java.util.Locale.filter(languageRangeList2, (java.util.Collection<java.util.Locale>) localeList39);
        java.util.Locale.LanguageRange[] languageRangeArray43 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList44 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList44, languageRangeArray43);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap46 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList47 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList44, strMap46);
        int int48 = languageRangeList44.size();
        java.util.Locale.LanguageRange languageRange50 = new java.util.Locale.LanguageRange("English");
        java.util.Locale.LanguageRange languageRange52 = new java.util.Locale.LanguageRange("English");
        java.util.Locale.LanguageRange languageRange54 = new java.util.Locale.LanguageRange("a");
        java.util.Locale.LanguageRange[] languageRangeArray55 = new java.util.Locale.LanguageRange[] { languageRange50, languageRange52, languageRange54 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList56 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList56, languageRangeArray55);
        boolean boolean58 = languageRangeList44.retainAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList56);
        boolean boolean59 = languageRangeList2.containsAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList44);
        java.util.Locale locale60 = java.util.Locale.CANADA;
        java.util.Set<java.lang.Character> charSet61 = locale60.getExtensionKeys();
        boolean boolean62 = languageRangeList2.contains((java.lang.Object) locale60);
        java.util.Locale locale63 = java.util.Locale.ROOT;
        java.lang.String str64 = locale60.getDisplayName(locale63);
        java.lang.String str65 = org.apache.commons.lang3.StringUtils.lowerCase("class java.lang.String", locale63);
        java.util.Locale locale67 = new java.util.Locale("xxxhi!xxxxxxxhi");
        java.lang.String str68 = locale63.getDisplayName(locale67);
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(languageRangeArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "english" + "'", str10, "english");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "it");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Cina" + "'", str16, "Cina");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "zh-CN" + "'", str17, "zh-CN");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "it");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Cina" + "'", str20, "Cina");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "it");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Cina" + "'", str23, "Cina");
        org.junit.Assert.assertEquals(locale27.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "it");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Cina" + "'", str30, "Cina");
        org.junit.Assert.assertEquals(locale32.toString(), "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "ko");
        org.junit.Assert.assertEquals(locale36.toString(), "");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(localeList41);
        org.junit.Assert.assertNotNull(localeList42);
        org.junit.Assert.assertNotNull(languageRangeArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(languageRangeList47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(languageRangeArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(locale60);
        org.junit.Assert.assertEquals(locale60.toString(), "en_CA");
        org.junit.Assert.assertNotNull(charSet61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "English (Canada)" + "'", str64, "English (Canada)");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "class java.lang.string" + "'", str65, "class java.lang.string");
        org.junit.Assert.assertEquals(locale67.toString(), "xxxhi!xxxxxxxhi");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
    }

    @Test
    public void test10367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10367");
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
        java.util.Locale.Builder builder86 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder87 = builder86.clearExtensions();
        java.util.Locale.Builder builder88 = builder86.clearExtensions();
        java.util.Locale.Builder builder90 = builder86.removeUnicodeLocaleAttribute("English");
        boolean boolean91 = languageRangeList1.contains((java.lang.Object) builder86);
        java.util.Locale.Builder builder92 = builder86.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder94 = builder92.setVariant("                                rArrayL");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant:                                 rArrayL [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertEquals(locale43.toString(), "it");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Cina" + "'", str44, "Cina");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "zh-CN" + "'", str45, "zh-CN");
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "it");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Cina" + "'", str48, "Cina");
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "it");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Cina" + "'", str51, "Cina");
        org.junit.Assert.assertEquals(locale55.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale56);
        org.junit.Assert.assertEquals(locale56.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale57);
        org.junit.Assert.assertEquals(locale57.toString(), "it");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "Cina" + "'", str58, "Cina");
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
        org.junit.Assert.assertNotNull(builder87);
        org.junit.Assert.assertNotNull(builder88);
        org.junit.Assert.assertNotNull(builder90);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNotNull(builder92);
    }

    @Test
    public void test10368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10368");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("it", "Chin", 7);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("en_", "\u6cd5\u6587\u6cd5\u570b)");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("LOCALE#LANGUAGERANGE", strArray4, strArray7);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "LOCALE#LANGUAGERANGE" + "'", str8, "LOCALE#LANGUAGERANGE");
    }

    @Test
    public void test10369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10369");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.lang.Class<?>[] wildcardClassArray3 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray1);
        java.lang.Class<?>[] wildcardClassArray4 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray1);
        java.lang.Class[] classArray6 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray7 = (java.lang.Class<?>[]) classArray6;
        java.lang.Class<?>[] wildcardClassArray8 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray6);
        java.lang.Class<?>[] wildcardClassArray9 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) classArray6, "zh-CN");
        boolean boolean12 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray4, (java.lang.Class<?>[]) classArray6);
        java.lang.Class<?>[] wildcardClassArray13 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers((java.lang.Class<?>[]) classArray6);
        java.lang.Class[] classArray15 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray16 = (java.lang.Class<?>[]) classArray15;
        java.lang.Class<?>[] wildcardClassArray17 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray15);
        java.lang.Class<?>[] wildcardClassArray18 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray15);
        java.lang.Class<?>[] wildcardClassArray19 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) classArray15);
        java.lang.Class[] classArray21 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray22 = (java.lang.Class<?>[]) classArray21;
        java.lang.Class<?>[] wildcardClassArray23 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray21);
        java.lang.Class<?>[] wildcardClassArray24 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray21);
        java.lang.Class<?>[] wildcardClassArray25 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray21);
        java.lang.String str26 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray25);
        boolean boolean28 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray19, wildcardClassArray25, true);
        java.lang.Class<?>[] wildcardClassArray29 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray19);
        java.lang.Class[] classArray31 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray32 = (java.lang.Class<?>[]) classArray31;
        java.lang.Class<?>[] wildcardClassArray33 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray31);
        java.lang.Class<?>[] wildcardClassArray34 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray31);
        java.lang.String str36 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) wildcardClassArray34, "Chinaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        java.lang.String str37 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray34);
        boolean boolean38 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray19, wildcardClassArray34);
        boolean boolean40 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray6, wildcardClassArray19, true);
        java.lang.Class[] classArray42 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray43 = (java.lang.Class<?>[]) classArray42;
        java.lang.Class<?>[] wildcardClassArray44 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray42);
        java.lang.Class<?> wildcardClass45 = null;
        java.lang.Class[] classArray47 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray48 = (java.lang.Class<?>[]) classArray47;
        wildcardClassArray48[0] = wildcardClass45;
        boolean boolean52 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray44, wildcardClassArray48, false);
        java.lang.Class<?>[] wildcardClassArray53 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray44);
        java.lang.Class<?>[] wildcardClassArray54 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray53);
        java.lang.Class<?>[] wildcardClassArray55 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray53);
        boolean boolean57 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray19, wildcardClassArray53, true);
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertNotNull(wildcardClassArray4);
        org.junit.Assert.assertNotNull(classArray6);
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        org.junit.Assert.assertNotNull(wildcardClassArray8);
        org.junit.Assert.assertNotNull(wildcardClassArray9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray13);
        org.junit.Assert.assertNotNull(classArray15);
        org.junit.Assert.assertNotNull(wildcardClassArray16);
        org.junit.Assert.assertNotNull(wildcardClassArray17);
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertNotNull(wildcardClassArray19);
        org.junit.Assert.assertNotNull(classArray21);
        org.junit.Assert.assertNotNull(wildcardClassArray22);
        org.junit.Assert.assertNotNull(wildcardClassArray23);
        org.junit.Assert.assertNotNull(wildcardClassArray24);
        org.junit.Assert.assertNotNull(wildcardClassArray25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray29);
        org.junit.Assert.assertNotNull(classArray31);
        org.junit.Assert.assertNotNull(wildcardClassArray32);
        org.junit.Assert.assertNotNull(wildcardClassArray33);
        org.junit.Assert.assertNotNull(wildcardClassArray34);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "java.lang" + "'", str36, "java.lang");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(classArray42);
        org.junit.Assert.assertNotNull(wildcardClassArray43);
        org.junit.Assert.assertNotNull(wildcardClassArray44);
        org.junit.Assert.assertNotNull(classArray47);
        org.junit.Assert.assertNotNull(wildcardClassArray48);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray53);
        org.junit.Assert.assertNotNull(wildcardClassArray54);
        org.junit.Assert.assertNotNull(wildcardClassArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
    }

    @Test
    public void test10370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10370");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "ahi!hi! (                 A                 )", (int) (byte) 0);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test10371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10371");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("\u5317\u5370\u5ea6\u6587 (HI!,cHINA)", "                                                                                     ArrayList");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10372");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("china", "cn", 100);
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("CHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) int5, "HArrayList");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "java.lang" + "'", str7, "java.lang");
    }

    @Test
    public void test10373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10373");
        char[] charArray7 = new char[] { '#', '#', ' ' };
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "CHINA", charArray7);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "anihcxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", charArray7);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "Chine", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "## ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "## ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#, #,  ]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test10374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10374");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder0.removeUnicodeLocaleAttribute("English");
        java.util.Locale locale6 = java.util.Locale.FRANCE;
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale6);
        java.lang.String str8 = locale6.getDisplayScript();
        java.util.Set<java.lang.String> strSet9 = locale6.getUnicodeLocaleAttributes();
        java.util.Locale.Builder builder10 = builder0.setLocale(locale6);
        java.util.Locale.Builder builder12 = builder0.addUnicodeLocaleAttribute("SHORT");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder14 = builder0.setLanguage("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxch");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxch [at index 0]");
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
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test10375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10375");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("jpn", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                jpn                                                 " + "'", str2, "                                                jpn                                                 ");
    }

    @Test
    public void test10376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10376");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("l.avajstring[]string[]string[$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$", '$');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "l.avajstring[]string[]string[" + "'", str2, "l.avajstring[]string[]string[");
    }

    @Test
    public void test10377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10377");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("italiahI", 19, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaitaliahI" + "'", str3, "aaaaaaaaaaaitaliahI");
    }

    @Test
    public void test10378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10378");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("                                                Hin                                                 ", "locale");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10379");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("en-CASTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRIN", "...                         zh_C             ...", 0, 32);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "...                         zh_C             ...INGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRIN" + "'", str4, "...                         zh_C             ...INGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRIN");
    }

    @Test
    public void test10380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10380");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("                                                                                                   $", "it                                                                                                  ", "China", 252);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                                                                                   $" + "'", str4, "                                                                                                   $");
    }

    @Test
    public void test10381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10381");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("String", "$");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "  EN_   ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "String" + "'", str3, "String");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "String" + "'", str5, "String");
    }

    @Test
    public void test10382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10382");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("            )ANIHc,!IH(idni            )ANIHc,!IH(idni            )ANIHc,!IH(idni            )ANIHc,!IH(idni            )ANIHc,!IH(idni            )ANIHc,!IH(idni            )ANIHc,!IH(idni            )ANIHc,!IH(idni            )ANIHc,!IH(idni            )ANIHc,!IH(idni            )ANIHc,!IH(idni            )ANIHc,!IH(idni", "            )ANIHc,!IH(idni");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10383");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("ChinChinChinChinChiChinChinChinChinC", "France");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10384");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap3);
        int int5 = languageRangeList1.size();
        java.lang.Class[] classArray7 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray8 = (java.lang.Class<?>[]) classArray7;
        java.lang.Class<?>[] wildcardClassArray9 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray7);
        boolean boolean10 = languageRangeList1.equals((java.lang.Object) wildcardClassArray9);
        int int12 = languageRangeList1.indexOf((java.lang.Object) (short) 100);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap14 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList15 = java.util.Locale.LanguageRange.parse("it", strMap14);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList15, '#');
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap18 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList19 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList15, strMap18);
        languageRangeList15.clear();
        boolean boolean21 = languageRangeList1.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList15);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(classArray7);
        org.junit.Assert.assertNotNull(wildcardClassArray8);
        org.junit.Assert.assertNotNull(wildcardClassArray9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(languageRangeList15);
        org.junit.Assert.assertNotNull(languageRangeList19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test10385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10385");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fduuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", (int) (byte) -1, "hindiHindiHinclass java.lang.StringhindiHindiHin");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fduuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str3, "\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fduuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test10386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10386");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "...X.Z.B.BB.BD.BE.BF.BG.BH.BI.BJ.BL.BM.BN...", (java.lang.CharSequence) "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxch");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 44 + "'", int2 == 44);
    }

    @Test
    public void test10387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10387");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace(charSequence0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10388");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter(" ud  ", "nglese");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10389");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("zh-ZH", 3);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "zh-ZH" + "'", str2, "zh-ZH");
    }

    @Test
    public void test10390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10390");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("hi");
        boolean boolean3 = languageRangeList1.remove((java.lang.Object) "English");
        boolean boolean5 = languageRangeList1.remove((java.lang.Object) 1);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList7 = java.util.Locale.LanguageRange.parse("hi");
        java.lang.Object[] objArray8 = languageRangeList7.toArray();
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream9 = languageRangeList7.parallelStream();
        languageRangeList7.clear();
        boolean boolean11 = languageRangeList1.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList7);
        java.util.Locale.LanguageRange[] languageRangeArray12 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList13 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList13, languageRangeArray12);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap15 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList16 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList13, strMap15);
        int int17 = languageRangeList13.size();
        java.util.Locale.LanguageRange languageRange19 = new java.util.Locale.LanguageRange("English");
        java.util.Locale.LanguageRange languageRange21 = new java.util.Locale.LanguageRange("English");
        java.util.Locale.LanguageRange languageRange23 = new java.util.Locale.LanguageRange("a");
        java.util.Locale.LanguageRange[] languageRangeArray24 = new java.util.Locale.LanguageRange[] { languageRange19, languageRange21, languageRange23 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList25 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList25, languageRangeArray24);
        boolean boolean27 = languageRangeList13.retainAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList25);
        java.util.Spliterator<java.util.Locale.LanguageRange> languageRangeSpliterator28 = languageRangeList13.spliterator();
        boolean boolean29 = languageRangeList7.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList13);
        java.util.Spliterator<java.util.Locale.LanguageRange> languageRangeSpliterator30 = languageRangeList7.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange32 = languageRangeList7.get((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(languageRangeList7);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(languageRangeStream9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(languageRangeArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(languageRangeList16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(languageRangeArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(languageRangeSpliterator28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(languageRangeSpliterator30);
    }

    @Test
    public void test10391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10391");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("Hindi (HI!,cHINA)", 98);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hindi (HI!,cHINA)" + "'", str2, "Hindi (HI!,cHINA)");
    }

    @Test
    public void test10392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10392");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("Collections.EmptySetCollections.EmptySetCollections.EmptySetCollections.EmptySetCollections.EmptySetCollections.EmptySetCollections.EmptySetCollections.EmptySetCollections.EmptySetCollections.EmptySetCollections.EmptySetCollections.EmptySetCollections.EmptySetCollections.EmptySetCollections.EmptySetCollections.EmptySet", "lang                                                                                                ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10393");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale locale3 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        java.lang.String str5 = locale3.getDisplayCountry(locale4);
        java.lang.String str6 = locale3.toLanguageTag();
        boolean boolean7 = locale3.hasExtensions();
        java.lang.String str8 = locale3.getDisplayCountry();
        java.util.Set<java.lang.String> strSet9 = locale3.getUnicodeLocaleKeys();
        java.util.Locale.Builder builder10 = builder2.setLocale(locale3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder13 = builder10.setUnicodeLocaleKeyword("integer", "locale.languagerange");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: integer [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "it");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cina" + "'", str5, "Cina");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "zh-CN" + "'", str6, "zh-CN");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Chine" + "'", str8, "Chine");
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test10394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10394");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageName("ch");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test10395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10395");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("Japaneseuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "I###################################################################################################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10396");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "tRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRIAD.AE.AF.A", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test10397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10397");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("LANGUAGERANG", 0, (int) 'u');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10398");
        char[] charArray6 = new char[] {};
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "zh-CN", charArray6);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsAny("fra", charArray6);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "string[]", charArray6);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "German", charArray6);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "A", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test10399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10399");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("CHNAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...Anzh_TWAnzh_TWAnz", 92, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "####################CHNAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...Anzh_TWAnzh_TWAnz####################" + "'", str3, "####################CHNAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...Anzh_TWAnzh_TWAnz####################");
    }

    @Test
    public void test10400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10400");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap3);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor5 = languageRangeList4.listIterator();
        char[][] charArray6 = new char[][] {};
        char[][] charArray7 = languageRangeList4.toArray(charArray6);
        java.util.Locale.LanguageRange languageRange9 = new java.util.Locale.LanguageRange("English");
        java.lang.String str10 = languageRange9.getRange();
        java.util.Locale.LanguageRange languageRange12 = new java.util.Locale.LanguageRange("English");
        java.lang.String str13 = languageRange12.getRange();
        java.util.Locale.LanguageRange languageRange15 = new java.util.Locale.LanguageRange("English");
        java.util.Locale.LanguageRange[] languageRangeArray16 = new java.util.Locale.LanguageRange[] { languageRange9, languageRange12, languageRange15 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList17 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList17, languageRangeArray16);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream19 = languageRangeList17.stream();
        int int20 = languageRangeList4.indexOf((java.lang.Object) languageRangeList17);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList23 = java.util.Locale.LanguageRange.parse("hi");
        boolean boolean25 = languageRangeList23.remove((java.lang.Object) "English");
        java.util.Locale.LanguageRange languageRange27 = languageRangeList23.get(0);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor28 = languageRangeList23.listIterator();
        java.util.Locale.LanguageRange languageRange29 = languageRangeItor28.next();
        java.lang.String str30 = languageRange29.getRange();
        // The following exception was thrown during execution in test generation
        try {
            languageRangeList17.add(21, languageRange29);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 21, Size: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(languageRangeItor5);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "english" + "'", str10, "english");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "english" + "'", str13, "english");
        org.junit.Assert.assertNotNull(languageRangeArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(languageRangeStream19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(languageRangeList23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(languageRange27);
        org.junit.Assert.assertNotNull(languageRangeItor28);
        org.junit.Assert.assertNotNull(languageRange29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi" + "'", str30, "hi");
    }

    @Test
    public void test10401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10401");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("   ", "ANIHC      xxxxhIxxx");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test10402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10402");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("Anzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAn", 6);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Anz..." + "'", str2, "Anz...");
    }

    @Test
    public void test10403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10403");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("\u4e2d\u6587\u53f0\u6e7e\u5730\u533aengliilish)", 116);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u4e2d\u6587\u53f0\u6e7e\u5730\u533aengliilish)                                  " + "'", str2, "\u4e2d\u6587\u53f0\u6e7e\u5730\u533aengliilish)                                  ");
    }

    @Test
    public void test10404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10404");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRIAD.AE.AF");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10405");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "\u5317\u5370\u5ea6\u6587\u5317\u5370\u5ea6\u6587\u5317\u5370\u5ea6\u6587\u5317\u5370\u5ea6\u6587 (HI!,cHINcn_ITALIANOJAJAJAJAJAJAJAJAJAJAJAJAJAJ");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ????(HI!,cHINA)????(HI!,cHINA)????(HI!,cHINA)????(HI!,cHINcn_ITALIANOJAJAJAJAJAJAJAJAJAJAJAJAJAJ");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10406");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "chinEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglish");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10407");
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
        java.lang.String str20 = locale7.getCountry();
        java.util.Locale locale24 = new java.util.Locale("....english", "zhcinesese", ".");
        java.lang.String str25 = locale7.getDisplayName(locale24);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList27 = java.util.Locale.LanguageRange.parse("hi");
        boolean boolean29 = languageRangeList27.remove((java.lang.Object) "English");
        java.util.Locale.LanguageRange languageRange31 = languageRangeList27.get(0);
        java.util.Locale locale32 = java.util.Locale.JAPANESE;
        java.util.Locale locale34 = new java.util.Locale("");
        java.lang.String str35 = locale34.getDisplayLanguage();
        java.util.Locale locale36 = java.util.Locale.CANADA;
        java.lang.String str37 = locale36.getDisplayLanguage();
        java.lang.String str38 = locale34.getDisplayScript(locale36);
        java.lang.String str39 = locale36.getDisplayVariant();
        java.util.Locale locale40 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale41 = java.util.Locale.getDefault();
        java.lang.String str42 = locale40.getDisplayCountry(locale41);
        java.lang.String str43 = locale41.getDisplayVariant();
        java.lang.String str44 = locale36.getDisplayScript(locale41);
        java.lang.String str45 = locale36.getScript();
        java.lang.String str46 = locale32.getDisplayVariant(locale36);
        java.util.Locale locale47 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str48 = locale47.getDisplayLanguage();
        java.util.Locale locale49 = java.util.Locale.getDefault();
        java.lang.String str50 = locale47.getDisplayCountry(locale49);
        java.util.Locale locale51 = java.util.Locale.TAIWAN;
        java.lang.String str52 = locale51.getVariant();
        java.lang.String str53 = locale47.getDisplayName(locale51);
        java.util.Locale locale54 = locale47.stripExtensions();
        java.lang.String str55 = locale32.getDisplayName(locale54);
        boolean boolean56 = languageRangeList27.equals((java.lang.Object) locale32);
        java.lang.String str57 = locale24.getDisplayName(locale32);
        java.lang.String str58 = locale24.getCountry();
        boolean boolean59 = locale24.hasExtensions();
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
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "anglais" + "'", str10, "anglais");
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals(locale24.toString(), "....english_ZHCINESESE_.");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(languageRangeList27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(languageRange31);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "ja");
        org.junit.Assert.assertEquals(locale34.toString(), "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "en_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str37 + "' != '" + "anglais" + "'", str37, "anglais");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "it");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Cina" + "'", str42, "Cina");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "zh_TW");
// flaky:         org.junit.Assert.assertEquals("'" + str48 + "' != '" + "chinois" + "'", str48, "chinois");
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "it");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "Taiwan" + "'", str50, "Taiwan");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
// flaky:         org.junit.Assert.assertEquals("'" + str53 + "' != '" + "\u4e2d\u6587\u53f0\u7063)" + "'", str53, "\u4e2d\u6587\u53f0\u7063)");
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "\u65e5\u6587" + "'", str55, "\u65e5\u6587");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "....english (ZHCINESESE,.)" + "'", str57, "....english (ZHCINESESE,.)");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "ZHCINESESE" + "'", str58, "ZHCINESESE");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test10408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10408");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("china", 44);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10409");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("Ese (Taiwan$$$$$$$$$slgneese (Taiwan$$$$$$$$$", '4', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ese (Taiwan$$$$$$$$$slgneese (Taiwan$$$$$$$$$" + "'", str3, "Ese (Taiwan$$$$$$$$$slgneese (Taiwan$$$$$$$$$");
    }

    @Test
    public void test10410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10410");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("Chinesisch(China)", "LanguageRange");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10411");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("zh_ZH", 120);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "zh_ZH                                                                                                                   " + "'", str2, "zh_ZH                                                                                                                   ");
    }

    @Test
    public void test10412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10412");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "Integer");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10413");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("cHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA444444444444444444444444444444444444444444444444", "Ithi!lihi!no");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "cHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA444444444444444444444444444444444444444444444444" + "'", str2, "cHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test10414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10414");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("zh-CNenglish", "44444444444444444444444444444444444", 31);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10415");
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
        java.util.Spliterator<java.util.Locale.LanguageRange> languageRangeSpliterator21 = languageRangeList17.spliterator();
        java.util.Locale.LanguageRange[] languageRangeArray22 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList23 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList23, languageRangeArray22);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap25 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList26 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList23, strMap25);
        int int27 = languageRangeList23.size();
        java.util.List<java.util.Locale.LanguageRange> languageRangeList29 = java.util.Locale.LanguageRange.parse("hi");
        boolean boolean31 = languageRangeList29.remove((java.lang.Object) "English");
        boolean boolean32 = languageRangeList23.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList29);
        java.util.Locale.LanguageRange[] languageRangeArray33 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList34 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList34, languageRangeArray33);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap36 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList37 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList34, strMap36);
        java.lang.String[] strArray45 = new java.lang.String[] { "English", "hi", "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "", "a", "", "China" };
        java.util.ArrayList<java.lang.String> strList46 = new java.util.ArrayList<java.lang.String>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList46, strArray45);
        java.util.List<java.lang.Class<?>> wildcardClassList48 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList46);
        java.lang.String str49 = java.util.Locale.lookupTag(languageRangeList37, (java.util.Collection<java.lang.String>) strList46);
        java.util.List<java.lang.Class<?>> wildcardClassList50 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList46);
        java.util.List<java.lang.String> strList51 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList23, (java.util.Collection<java.lang.String>) strList46);
        java.util.Locale.LanguageRange[] languageRangeArray52 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList53 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList53, languageRangeArray52);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap55 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList56 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList53, strMap55);
        int int57 = languageRangeList53.size();
        java.util.List<java.util.Locale.LanguageRange> languageRangeList59 = java.util.Locale.LanguageRange.parse("hi");
        boolean boolean61 = languageRangeList59.remove((java.lang.Object) "English");
        boolean boolean62 = languageRangeList53.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList59);
        java.lang.String[] strArray67 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("English", "hi", (int) (short) -1);
        java.lang.String[] strArray70 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("a", "");
        java.lang.String[] strArray71 = org.apache.commons.lang3.StringUtils.stripAll(strArray70);
        java.lang.String[] strArray72 = org.apache.commons.lang3.StringUtils.stripAll(strArray71);
        java.lang.String str73 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", strArray67, strArray71);
        boolean boolean74 = languageRangeList53.equals((java.lang.Object) strArray71);
        boolean boolean75 = languageRangeList23.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList53);
        boolean boolean76 = languageRangeList17.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList23);
        boolean boolean77 = languageRangeList1.containsAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList23);
        java.util.Spliterator<java.util.Locale.LanguageRange> languageRangeSpliterator78 = languageRangeList1.spliterator();
        java.util.Iterator<java.util.Locale.LanguageRange> languageRangeItor79 = languageRangeList1.iterator();
        java.lang.Object obj80 = null;
        boolean boolean81 = languageRangeList1.contains(obj80);
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
        org.junit.Assert.assertNotNull(languageRangeSpliterator21);
        org.junit.Assert.assertNotNull(languageRangeArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(languageRangeList26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(languageRangeList29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(languageRangeArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(languageRangeList37);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(wildcardClassList48);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNotNull(wildcardClassList50);
        org.junit.Assert.assertNotNull(strList51);
        org.junit.Assert.assertNotNull(languageRangeArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(languageRangeList56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(languageRangeList59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h" + "'", str73, "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(languageRangeSpliterator78);
        org.junit.Assert.assertNotNull(languageRangeItor79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
    }

    @Test
    public void test10416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10416");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass("ac_NE", false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ac_NE");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10417");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "dddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
    }

    @Test
    public void test10418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10418");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("ahi!hi");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=ahi!hi");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10419");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "locle.lngugernge");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10420");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("AHI!HI!                                      ", "xxxahi!hiCinaxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10421");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("it_CN", (int) (short) 10, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#####it_CN" + "'", str3, "#####it_CN");
    }

    @Test
    public void test10422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10422");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "L");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10423");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap3);
        int int5 = languageRangeList1.size();
        java.util.List<java.util.Locale.LanguageRange> languageRangeList7 = java.util.Locale.LanguageRange.parse("hi");
        boolean boolean9 = languageRangeList7.remove((java.lang.Object) "English");
        boolean boolean10 = languageRangeList1.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList7);
        java.util.Locale.LanguageRange[] languageRangeArray11 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList12 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList12, languageRangeArray11);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap14 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList15 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList12, strMap14);
        java.lang.String[] strArray23 = new java.lang.String[] { "English", "hi", "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "", "a", "", "China" };
        java.util.ArrayList<java.lang.String> strList24 = new java.util.ArrayList<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList24, strArray23);
        java.util.List<java.lang.Class<?>> wildcardClassList26 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList24);
        java.lang.String str27 = java.util.Locale.lookupTag(languageRangeList15, (java.util.Collection<java.lang.String>) strList24);
        java.util.List<java.lang.Class<?>> wildcardClassList28 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList24);
        java.util.List<java.lang.String> strList29 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList24);
        java.util.Locale.LanguageRange[] languageRangeArray30 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList31 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList31, languageRangeArray30);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap33 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList34 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList31, strMap33);
        int int35 = languageRangeList31.size();
        java.util.List<java.util.Locale.LanguageRange> languageRangeList37 = java.util.Locale.LanguageRange.parse("hi");
        boolean boolean39 = languageRangeList37.remove((java.lang.Object) "English");
        boolean boolean40 = languageRangeList31.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList37);
        java.lang.String[] strArray45 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("English", "hi", (int) (short) -1);
        java.lang.String[] strArray48 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("a", "");
        java.lang.String[] strArray49 = org.apache.commons.lang3.StringUtils.stripAll(strArray48);
        java.lang.String[] strArray50 = org.apache.commons.lang3.StringUtils.stripAll(strArray49);
        java.lang.String str51 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", strArray45, strArray49);
        boolean boolean52 = languageRangeList31.equals((java.lang.Object) strArray49);
        boolean boolean53 = languageRangeList1.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList31);
        java.util.Locale.LanguageRange[] languageRangeArray55 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList56 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList56, languageRangeArray55);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap58 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList59 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList56, strMap58);
        int int60 = languageRangeList56.size();
        java.util.List<java.util.Locale.LanguageRange> languageRangeList62 = java.util.Locale.LanguageRange.parse("hi");
        boolean boolean64 = languageRangeList62.remove((java.lang.Object) "English");
        boolean boolean65 = languageRangeList56.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList62);
        java.util.Locale.LanguageRange languageRange67 = new java.util.Locale.LanguageRange("English");
        java.lang.String str68 = languageRange67.getRange();
        boolean boolean69 = languageRangeList62.add(languageRange67);
        languageRangeList31.add(0, languageRange67);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap72 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList73 = java.util.Locale.LanguageRange.parse("english", strMap72);
        int int74 = languageRangeList31.lastIndexOf((java.lang.Object) languageRangeList73);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream75 = languageRangeList73.parallelStream();
        java.lang.String str77 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList73, 'a');
        java.util.Spliterator<java.util.Locale.LanguageRange> languageRangeSpliterator78 = languageRangeList73.spliterator();
        java.util.Spliterator<java.util.Locale.LanguageRange> languageRangeSpliterator79 = languageRangeList73.spliterator();
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(languageRangeList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(languageRangeArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(languageRangeList15);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(wildcardClassList26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(wildcardClassList28);
        org.junit.Assert.assertNotNull(strList29);
        org.junit.Assert.assertNotNull(languageRangeArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(languageRangeList34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(languageRangeList37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h" + "'", str51, "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(languageRangeArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(languageRangeList59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(languageRangeList62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "english" + "'", str68, "english");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(languageRangeList73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertNotNull(languageRangeStream75);
        org.junit.Assert.assertNotNull(languageRangeSpliterator78);
        org.junit.Assert.assertNotNull(languageRangeSpliterator79);
    }

    @Test
    public void test10424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10424");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("              cinese               ", "ANIHC               EN_ca");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
    }

    @Test
    public void test10425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10425");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("ja", "java.util");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.endsWithAny("cn_ITALIANOJAJAJAJAJAJAJAJAJAJAJAJAJAJ", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test10426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10426");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("ChinChinChinChinChinChinChinChinChinaaaaaaaaa$", "                                        f   ch");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ChinChinChinChinChinChinChinChinChinaaaaaaaaa$" + "'", str2, "ChinChinChinChinChinChinChinChinChinaaaaaaaaa$");
    }

    @Test
    public void test10427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10427");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("l.avajstring[]string[]string[", "Locale.LanguageRange");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "l.avajstring[]string[]string[" + "'", str2, "l.avajstring[]string[]string[");
    }

    @Test
    public void test10428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10428");
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
        java.util.Locale.LanguageRange[] languageRangeArray29 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList30 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList30, languageRangeArray29);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap32 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList33 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList30, strMap32);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream34 = languageRangeList30.stream();
        boolean boolean35 = languageRangeList30.isEmpty();
        java.util.Locale.LanguageRange[] languageRangeArray36 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList37 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList37, languageRangeArray36);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap39 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList40 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList37, strMap39);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor41 = languageRangeList40.listIterator();
        boolean boolean42 = languageRangeList30.retainAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList40);
        java.lang.String str44 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) languageRangeList40, "Chinese");
        java.lang.String[] strArray48 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("Chin", "english");
        boolean boolean49 = org.apache.commons.lang3.StringUtils.endsWithAny("                                                                                                    ", strArray48);
        boolean boolean50 = languageRangeList40.equals((java.lang.Object) strArray48);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream51 = languageRangeList40.parallelStream();
        boolean boolean53 = languageRangeList40.remove((java.lang.Object) "A");
        java.util.Locale.LanguageRange[] languageRangeArray54 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList55 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList55, languageRangeArray54);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap57 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList58 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList55, strMap57);
        int int59 = languageRangeList55.size();
        java.util.List<java.util.Locale.LanguageRange> languageRangeList61 = java.util.Locale.LanguageRange.parse("hi");
        boolean boolean63 = languageRangeList61.remove((java.lang.Object) "English");
        boolean boolean64 = languageRangeList55.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList61);
        java.util.Locale.LanguageRange languageRange66 = new java.util.Locale.LanguageRange("English");
        java.lang.String str67 = languageRange66.getRange();
        boolean boolean68 = languageRangeList61.add(languageRange66);
        double double69 = languageRange66.getWeight();
        boolean boolean70 = languageRangeList40.add(languageRange66);
        boolean boolean71 = languageRangeList1.containsAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList40);
        java.util.function.UnaryOperator<java.util.Locale.LanguageRange> languageRangeUnaryOperator72 = null;
        // The following exception was thrown during execution in test generation
        try {
            languageRangeList1.replaceAll(languageRangeUnaryOperator72);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNotNull(languageRangeArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(languageRangeList33);
        org.junit.Assert.assertNotNull(languageRangeStream34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(languageRangeArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(languageRangeList40);
        org.junit.Assert.assertNotNull(languageRangeItor41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "java.util" + "'", str44, "java.util");
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(languageRangeStream51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(languageRangeArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(languageRangeList58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNotNull(languageRangeList61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "english" + "'", str67, "english");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 1.0d + "'", double69 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test10429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10429");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("                             HI!HI!HI!HI!HI!HI", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                             HI!HI!HI!HI!HI!HI" + "'", str2, "                             HI!HI!HI!HI!HI!HI");
    }

    @Test
    public void test10430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10430");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("GNE", "EnglANIHC      sANIHC      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "GNE" + "'", str2, "GNE");
    }

    @Test
    public void test10431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10431");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("HArrayListfraHArrayListfraHArrayListfraHArrayListfraHArrayListfraHArrayListfraHArrayListfraHArrayListfraHArrayListfraHArrayList", (int) (short) 0, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HArrayListfraHArrayListfraHArrayListfraHArrayListfraHArrayListfraHArrayListfraHArrayListfraHArrayListfraHArrayListfraHArrayList" + "'", str3, "HArrayListfraHArrayListfraHArrayListfraHArrayListfraHArrayListfraHArrayListfraHArrayListfraHArrayListfraHArrayListfraHArrayList");
    }

    @Test
    public void test10432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10432");
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
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.upperCase("China", locale1);
        java.util.Locale locale15 = java.util.Locale.TAIWAN;
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.upperCase("", locale15);
        java.lang.String str17 = locale15.getISO3Country();
        java.util.Set<java.lang.Character> charSet18 = locale15.getExtensionKeys();
        java.util.Locale locale19 = locale15.stripExtensions();
        java.lang.String str20 = locale1.getDisplayLanguage(locale15);
        java.lang.String str21 = locale1.getLanguage();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it");
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "anglais" + "'", str6, "anglais");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "english" + "'", str10, "english");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "CHINA" + "'", str13, "CHINA");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "TWN" + "'", str17, "TWN");
        org.junit.Assert.assertNotNull(charSet18);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\u7fa9\u5927\u5229\u6587" + "'", str20, "\u7fa9\u5927\u5229\u6587");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "it" + "'", str21, "it");
    }

    @Test
    public void test10433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10433");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("locale", "Japaneseuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Japaneseuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str2, "Japaneseuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test10434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10434");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "Englisch (Kanada)", true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: Englisch(Kanada)");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10435");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("CINAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "Locale.FilteringMode", 18);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CINAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXLocale.FilteringModeCINAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXLocale.FilteringModeCINAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXLocale.FilteringModeCINAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXLocale.FilteringModeCINAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXLocale.FilteringModeCINAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXLocale.FilteringModeCINAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXLocale.FilteringModeCINAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXLocale.FilteringModeCINAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXLocale.FilteringModeCINAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXLocale.FilteringModeCINAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXLocale.FilteringModeCINAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXLocale.FilteringModeCINAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXLocale.FilteringModeCINAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXLocale.FilteringModeCINAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXLocale.FilteringModeCINAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXLocale.FilteringModeCINAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXLocale.FilteringModeCINAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX" + "'", str3, "CINAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXLocale.FilteringModeCINAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXLocale.FilteringModeCINAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXLocale.FilteringModeCINAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXLocale.FilteringModeCINAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXLocale.FilteringModeCINAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXLocale.FilteringModeCINAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXLocale.FilteringModeCINAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXLocale.FilteringModeCINAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXLocale.FilteringModeCINAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXLocale.FilteringModeCINAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXLocale.FilteringModeCINAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXLocale.FilteringModeCINAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXLocale.FilteringModeCINAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXLocale.FilteringModeCINAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXLocale.FilteringModeCINAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXLocale.FilteringModeCINAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXLocale.FilteringModeCINAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
    }

    @Test
    public void test10436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10436");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("j");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, 'u', (int) (short) 1, 46);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test10437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10437");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("cinaxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "cinaxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx" + "'", str2, "cinaxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
    }

    @Test
    public void test10438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10438");
        java.util.Locale locale2 = new java.util.Locale("");
        java.lang.String str3 = locale2.getDisplayLanguage();
        java.util.Locale locale4 = java.util.Locale.CANADA;
        java.lang.String str5 = locale4.getDisplayLanguage();
        java.lang.String str6 = locale2.getDisplayScript(locale4);
        java.util.Locale locale8 = java.util.Locale.FRANCE;
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale8);
        java.lang.String str10 = locale2.getDisplayCountry(locale8);
        java.lang.String str11 = locale8.toLanguageTag();
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.upperCase("tring[]", locale8);
        java.lang.String str14 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) str12, "44444444ENGLTWNSTWN44444444");
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "anglais" + "'", str5, "anglais");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "english" + "'", str9, "english");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "fr-FR" + "'", str11, "fr-FR");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "TRING[]" + "'", str12, "TRING[]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "java.lang" + "'", str14, "java.lang");
    }

    @Test
    public void test10439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10439");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)Character", "zxxxxxxxxxxxxxxxxxxx", 8);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10440");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "chn     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10441");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("iiiiiiiiiiiiiiiiiiiiiiistringiiiiiiiiiiiiiiiiiiiiiii");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "IIIIIIIIIIIIIIIIIIIIIIISTRINGIIIIIIIIIIIIIIIIIIIIIII" + "'", str1, "IIIIIIIIIIIIIIIIIIIIIIISTRINGIIIIIIIIIIIIIIIIIIIIIII");
    }

    @Test
    public void test10442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10442");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("", " ud  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10443");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("zho", "Chin", (int) '$');
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "EN_C");
        boolean boolean7 = org.apache.commons.lang3.StringUtils.startsWithAny("de                                                                                                  ", strArray6);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test10444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10444");
        java.util.Locale locale2 = new java.util.Locale("                                                                                                   ", "acol");
        org.junit.Assert.assertEquals(locale2.toString(), "                                                                                                   _ACOL");
    }

    @Test
    public void test10445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10445");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("ANIH");
    }

    @Test
    public void test10446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10446");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortClassName("France");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "France" + "'", str1, "France");
    }

    @Test
    public void test10447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10447");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap3);
        int int5 = languageRangeList1.size();
        java.util.Locale.LanguageRange languageRange8 = new java.util.Locale.LanguageRange("string");
        java.lang.String str9 = languageRange8.getRange();
        // The following exception was thrown during execution in test generation
        try {
            languageRangeList1.add(120, languageRange8);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 120, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "string" + "'", str9, "string");
    }

    @Test
    public void test10448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10448");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("   ", "44444444444444444444laEg                                                      444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10449");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "                           AHI!HI!                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10450");
        java.util.Locale locale0 = java.util.Locale.CANADA;
        boolean boolean1 = locale0.hasExtensions();
        java.util.Locale locale2 = java.util.Locale.ITALIAN;
        java.lang.String str3 = locale0.getDisplayScript(locale2);
        java.lang.String str4 = locale0.getDisplayScript();
        java.lang.String str6 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) locale0, "iiiiiiiiiiiiiiiiiiiiiiiArrayList");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = locale0.getUnicodeLocaleType("ANIHCANIHC");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: ANIHCANIHC");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "it");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.util" + "'", str6, "java.util");
    }

    @Test
    public void test10451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10451");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fduuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10452");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = org.apache.commons.lang3.ClassUtils.getClass("china_CN");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: china_CN");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10453");
        java.util.Locale locale1 = new java.util.Locale("hi!String[]String[]S");
        java.lang.String str2 = locale1.getDisplayCountry();
        org.junit.Assert.assertEquals(locale1.toString(), "hi!string[]string[]s");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10454");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("....english (ZHCINESESE,.)", "\u5fb7\u6587\u5fb7\u56fd\u5fb7\u6587");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10455");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("                                redliuB", "                                                                                   Hindi (HI!,cHINA)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10456");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("JAVA.LANG");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JAVA.LANG" + "'", str1, "JAVA.LANG");
    }

    @Test
    public void test10457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10457");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("acoL", 11, "ncncncncncncncncn");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "acoLncncncn" + "'", str3, "acoLncncncn");
    }

    @Test
    public void test10458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10458");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "ANIHC      xxxxhIxxx");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10459");
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
        java.lang.Class<?>[] wildcardClassArray13 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray12);
        java.lang.Class[] classArray15 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray16 = (java.lang.Class<?>[]) classArray15;
        java.lang.Class<?>[] wildcardClassArray17 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray15);
        java.lang.Class<?>[] wildcardClassArray18 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray15);
        java.lang.Class<?>[] wildcardClassArray19 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray15);
        java.lang.Class<?>[] wildcardClassArray20 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray19);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray19, ' ');
        boolean boolean23 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray13, wildcardClassArray19);
        java.lang.Class[] classArray25 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray26 = (java.lang.Class<?>[]) classArray25;
        java.lang.Class<?>[] wildcardClassArray27 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray25);
        java.lang.Class<?> wildcardClass28 = null;
        java.lang.Class[] classArray30 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray31 = (java.lang.Class<?>[]) classArray30;
        wildcardClassArray31[0] = wildcardClass28;
        boolean boolean35 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray27, wildcardClassArray31, false);
        java.lang.Class<?>[] wildcardClassArray36 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray27);
        java.lang.Class<?>[] wildcardClassArray37 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray36);
        java.lang.Class<?>[] wildcardClassArray38 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray37);
        boolean boolean40 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray13, wildcardClassArray38, true);
        java.lang.Class[] classArray42 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray43 = (java.lang.Class<?>[]) classArray42;
        java.lang.Class<?>[] wildcardClassArray44 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray42);
        java.lang.Class<?>[] wildcardClassArray45 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray42);
        java.lang.Class[] classArray48 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray49 = (java.lang.Class<?>[]) classArray48;
        java.lang.Class<?>[] wildcardClassArray50 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray48);
        java.lang.String str51 = org.apache.commons.lang3.StringUtils.concatWith("hi!", (java.lang.Object[]) classArray48);
        boolean boolean52 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray42, (java.lang.Class<?>[]) classArray48);
        java.lang.Class[] classArray54 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray55 = (java.lang.Class<?>[]) classArray54;
        java.lang.Class<?>[] wildcardClassArray56 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray54);
        java.lang.Class<?> wildcardClass57 = null;
        java.lang.Class[] classArray59 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray60 = (java.lang.Class<?>[]) classArray59;
        wildcardClassArray60[0] = wildcardClass57;
        boolean boolean64 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray56, wildcardClassArray60, false);
        java.lang.Class[] classArray66 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray67 = (java.lang.Class<?>[]) classArray66;
        java.lang.Class<?>[] wildcardClassArray68 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray66);
        boolean boolean69 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray56, (java.lang.Class<?>[]) classArray66);
        boolean boolean70 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray42, (java.lang.Class<?>[]) classArray66);
        java.lang.Class<?>[] wildcardClassArray71 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers((java.lang.Class<?>[]) classArray66);
        java.lang.String str73 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) classArray66, 'u');
        boolean boolean75 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray38, (java.lang.Class<?>[]) classArray66, false);
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertNotNull(classArray6);
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray12);
        org.junit.Assert.assertNotNull(wildcardClassArray13);
        org.junit.Assert.assertNotNull(classArray15);
        org.junit.Assert.assertNotNull(wildcardClassArray16);
        org.junit.Assert.assertNotNull(wildcardClassArray17);
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertNotNull(wildcardClassArray19);
        org.junit.Assert.assertNotNull(wildcardClassArray20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(classArray25);
        org.junit.Assert.assertNotNull(wildcardClassArray26);
        org.junit.Assert.assertNotNull(wildcardClassArray27);
        org.junit.Assert.assertNotNull(classArray30);
        org.junit.Assert.assertNotNull(wildcardClassArray31);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray36);
        org.junit.Assert.assertNotNull(wildcardClassArray37);
        org.junit.Assert.assertNotNull(wildcardClassArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(classArray42);
        org.junit.Assert.assertNotNull(wildcardClassArray43);
        org.junit.Assert.assertNotNull(wildcardClassArray44);
        org.junit.Assert.assertNotNull(wildcardClassArray45);
        org.junit.Assert.assertNotNull(classArray48);
        org.junit.Assert.assertNotNull(wildcardClassArray49);
        org.junit.Assert.assertNotNull(wildcardClassArray50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(classArray54);
        org.junit.Assert.assertNotNull(wildcardClassArray55);
        org.junit.Assert.assertNotNull(wildcardClassArray56);
        org.junit.Assert.assertNotNull(classArray59);
        org.junit.Assert.assertNotNull(wildcardClassArray60);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(classArray66);
        org.junit.Assert.assertNotNull(wildcardClassArray67);
        org.junit.Assert.assertNotNull(wildcardClassArray68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray71);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
    }

    @Test
    public void test10460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10460");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("javacinese.cineselang                                                ", 39, "-CA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "javacinese.cineselang                                                " + "'", str3, "javacinese.cineselang                                                ");
    }

    @Test
    public void test10461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10461");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("fran\347ais (France)", (int) (byte) 100, "ArrayList.ListItr");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ArrayList.ListItrArrayList.ListItrArrayList.ListItrArrayList.ListItrArrayList.ListIfran\347ais (France)" + "'", str3, "ArrayList.ListItrArrayList.ListItrArrayList.ListItrArrayList.ListItrArrayList.ListIfran\347ais (France)");
    }

    @Test
    public void test10462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10462");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "latiarfatilatiarfatilatiarfatilatiar");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10463");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("          ...", "                    EN_CA                    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "..." + "'", str2, "...");
    }

    @Test
    public void test10464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10464");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "itafraital");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10465");
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
        java.util.Locale.LanguageRange[] languageRangeArray29 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList30 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList30, languageRangeArray29);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap32 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList33 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList30, strMap32);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream34 = languageRangeList30.stream();
        boolean boolean35 = languageRangeList30.isEmpty();
        java.util.Locale.LanguageRange[] languageRangeArray36 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList37 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList37, languageRangeArray36);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap39 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList40 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList37, strMap39);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor41 = languageRangeList40.listIterator();
        boolean boolean42 = languageRangeList30.retainAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList40);
        java.lang.String str44 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) languageRangeList40, "Chinese");
        java.lang.String[] strArray48 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("Chin", "english");
        boolean boolean49 = org.apache.commons.lang3.StringUtils.endsWithAny("                                                                                                    ", strArray48);
        boolean boolean50 = languageRangeList40.equals((java.lang.Object) strArray48);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream51 = languageRangeList40.parallelStream();
        boolean boolean53 = languageRangeList40.remove((java.lang.Object) "A");
        java.util.Locale.LanguageRange[] languageRangeArray54 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList55 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList55, languageRangeArray54);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap57 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList58 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList55, strMap57);
        int int59 = languageRangeList55.size();
        java.util.List<java.util.Locale.LanguageRange> languageRangeList61 = java.util.Locale.LanguageRange.parse("hi");
        boolean boolean63 = languageRangeList61.remove((java.lang.Object) "English");
        boolean boolean64 = languageRangeList55.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList61);
        java.util.Locale.LanguageRange languageRange66 = new java.util.Locale.LanguageRange("English");
        java.lang.String str67 = languageRange66.getRange();
        boolean boolean68 = languageRangeList61.add(languageRange66);
        double double69 = languageRange66.getWeight();
        boolean boolean70 = languageRangeList40.add(languageRange66);
        boolean boolean71 = languageRangeList1.containsAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList40);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange73 = languageRangeList1.get((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 2");
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
        org.junit.Assert.assertNotNull(languageRangeArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(languageRangeList33);
        org.junit.Assert.assertNotNull(languageRangeStream34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(languageRangeArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(languageRangeList40);
        org.junit.Assert.assertNotNull(languageRangeItor41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "java.util" + "'", str44, "java.util");
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(languageRangeStream51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(languageRangeArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(languageRangeList58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNotNull(languageRangeList61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "english" + "'", str67, "english");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 1.0d + "'", double69 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test10466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10466");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass("ad.ae.af.ag.ai.al.am.an.ao.aq.ar.as.at.au.aw.ax.az.ba.bb.bd.be.bf.bg.bh.bi.bj.bl.bm.bn.bo.bq.br.bs.bt.bv.bw.by.bz.ca.cc.cd.cf.cg.ch.ci.ck.cl.cm.cn.co.cr.cu.cv.cw.cx.cy.cz.de.dj.dk.dm.do.dz.ec.ee.eg.eh.er.es.et.fi.fj.fk.fm.fo.fr.ga.gb.gd.ge.gf.gg.gh.gi.gl.gm.gn.gp.gq.gr.gs.gt.gu.gw.gy.hk.hm.hn.hr.ht.hu.id.ie.il.im.in.io.iq.ir.is.it.je.jm.jo.jp.ke.kg.kh.ki.km.kn.kp.kr.kw.ky.kz.la.lb.lc.li.lk.lr.ls.lt.lu.lv.ly.ma.mc.md.me.mf.mg.mh.mk.ml.mm.mn.mo.mp.mq.mr.ms.mt.mu.mv.mw.mx.my.mz.na.nc.ne.nf.ng.ni.nl.no.np.nr.nu.nz.om.pa.pe.pf.pg.ph.pk.pl.pm.pn.pr.ps.pt.pw.py.qa.re.ro.rs.ru.rw.sa.sb.sc.sd.se.sg.sh.si.sj.sk.sl.sm.sn.so.sr.ss.st.sv.sx.sy.sz.tc.td.tf.tg.th.tj.tk.tl.tm.tn.to.tr.tt.tv.tw.tz.ua.ug.um.us.uy.uz.va.vc.ve.vg.vi.vn.vu.wf.ws.ye.yt.za.zm.zw", true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ad.ae.af.ag.ai.al.am.an.ao.aq.ar.as.at.au.aw.ax.az.ba.bb.bd.be.bf.bg.bh.bi.bj.bl.bm.bn.bo.bq.br.bs.bt.bv.bw.by.bz.ca.cc.cd.cf.cg.ch.ci.ck.cl.cm.cn.co.cr.cu.cv.cw.cx.cy.cz.de.dj.dk.dm.do.dz.ec.ee.eg.eh.er.es.et.fi.fj.fk.fm.fo.fr.ga.gb.gd.ge.gf.gg.gh.gi.gl.gm.gn.gp.gq.gr.gs.gt.gu.gw.gy.hk.hm.hn.hr.ht.hu.id.ie.il.im.in.io.iq.ir.is.it.je.jm.jo.jp.ke.kg.kh.ki.km.kn.kp.kr.kw.ky.kz.la.lb.lc.li.lk.lr.ls.lt.lu.lv.ly.ma.mc.md.me.mf.mg.mh.mk.ml.mm.mn.mo.mp.mq.mr.ms.mt.mu.mv.mw.mx.my.mz.na.nc.ne.nf.ng.ni.nl.no.np.nr.nu.nz.om.pa.pe.pf.pg.ph.pk.pl.pm.pn.pr.ps.pt.pw.py.qa.re.ro.rs.ru.rw.sa.sb.sc.sd.se.sg.sh.si.sj.sk.sl.sm.sn.so.sr.ss.st.sv.sx.sy.sz.tc.td.tf.tg.th.tj.tk.tl.tm.tn.to.tr.tt.tv.tw.tz.ua.ug.um.us.uy.uz.va.vc.ve.vg.vi.vn.vu.wf.ws.ye.yt.za.zm.zw");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10467");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("ncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncArrayLis", "         ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10468");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("            locale.builder                         locale.builder                    CHINOIS (CHINE)", 117);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10469");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("\u6cd5\u6587\u6cd5\u570b)");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test10470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10470");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#.FilteringMode", "Short", 563);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10471");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "chn     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "chn     " + "'", str1, "chn     ");
    }

    @Test
    public void test10472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10472");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("zh_tw_CHINCHINCHINCHINCHICHINCHINCHINCHINC", "French (France)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "zh_tw_CHINCHINCHINCHINCHICHINCHINCHINCHINC" + "'", str2, "zh_tw_CHINCHINCHINCHINCHICHINCHINCHINCHINC");
    }

    @Test
    public void test10473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10473");
        java.lang.String[] strArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("French (France)", strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10474");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                                        Englisch (Kanada)                                        ", 46, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                        Englisch (Kanada)                                        " + "'", str3, "                                        Englisch (Kanada)                                        ");
    }

    @Test
    public void test10475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10475");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("##############acoL###############");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "##############acoL###############" + "'", str1, "##############acoL###############");
    }

    @Test
    public void test10476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10476");
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
        java.lang.Class<?>[] wildcardClassArray13 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray12);
        java.lang.Class<?>[] wildcardClassArray14 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray12);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray12, '#');
        java.lang.Class<?>[] wildcardClassArray17 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray12);
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertNotNull(classArray6);
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray12);
        org.junit.Assert.assertNotNull(wildcardClassArray13);
        org.junit.Assert.assertNotNull(wildcardClassArray14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClassArray17);
    }

    @Test
    public void test10477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10477");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("isangl", 36);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                              isangl" + "'", str2, "                              isangl");
    }

    @Test
    public void test10478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10478");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("ChinChinChinChinChinChinChinChinChinaaaaaaaaa$", 31);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ChinChinChinChinChinChinChinChinChinaaaaaaaaa$" + "'", str2, "ChinChinChinChinChinChinChinChinChinaaaaaaaaa$");
    }

    @Test
    public void test10479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10479");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("locale.builde", "china_CN", (int) ' ');
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test10480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10480");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("hi");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList3 = java.util.Locale.LanguageRange.parse("hi");
        boolean boolean5 = languageRangeList3.remove((java.lang.Object) "English");
        boolean boolean6 = languageRangeList1.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList3);
        java.util.Locale.LanguageRange[] languageRangeArray7 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList8 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList8, languageRangeArray7);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap10 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList11 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList8, strMap10);
        java.lang.String[] strArray19 = new java.lang.String[] { "English", "hi", "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "", "a", "", "China" };
        java.util.ArrayList<java.lang.String> strList20 = new java.util.ArrayList<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList20, strArray19);
        java.util.List<java.lang.Class<?>> wildcardClassList22 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList20);
        java.lang.String str23 = java.util.Locale.lookupTag(languageRangeList11, (java.util.Collection<java.lang.String>) strList20);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList25 = java.util.Locale.LanguageRange.parse("hi");
        boolean boolean27 = languageRangeList25.remove((java.lang.Object) "English");
        java.util.Locale.LanguageRange[] languageRangeArray28 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList29 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList29, languageRangeArray28);
        java.util.Locale locale32 = java.util.Locale.FRANCE;
        java.lang.String str33 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale32);
        java.util.Locale locale34 = java.util.Locale.US;
        java.util.Locale locale35 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale36 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale37 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale38 = java.util.Locale.getDefault();
        java.lang.String str39 = locale37.getDisplayCountry(locale38);
        java.lang.String str40 = locale37.toLanguageTag();
        java.util.Locale locale41 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale42 = java.util.Locale.getDefault();
        java.lang.String str43 = locale41.getDisplayCountry(locale42);
        java.util.Locale locale44 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale45 = java.util.Locale.getDefault();
        java.lang.String str46 = locale44.getDisplayCountry(locale45);
        java.util.Locale locale50 = new java.util.Locale("hi", "hi!", "cHINA");
        java.util.Locale locale51 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale52 = java.util.Locale.getDefault();
        java.lang.String str53 = locale51.getDisplayCountry(locale52);
        java.util.Locale locale55 = new java.util.Locale("");
        java.lang.String str56 = locale55.getDisplayVariant();
        java.util.Locale locale57 = java.util.Locale.KOREAN;
        java.util.Locale locale59 = new java.util.Locale("");
        java.util.Locale locale60 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale[] localeArray61 = new java.util.Locale[] { locale32, locale34, locale35, locale36, locale37, locale42, locale44, locale50, locale52, locale55, locale57, locale59, locale60 };
        java.util.ArrayList<java.util.Locale> localeList62 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList62, localeArray61);
        java.util.List<java.util.Locale> localeList64 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList29, (java.util.Collection<java.util.Locale>) localeList62);
        java.util.List<java.util.Locale> localeList65 = java.util.Locale.filter(languageRangeList25, (java.util.Collection<java.util.Locale>) localeList62);
        java.util.List<java.util.Locale> localeList66 = java.util.Locale.filter(languageRangeList11, (java.util.Collection<java.util.Locale>) localeList65);
        java.util.Locale locale67 = java.util.Locale.lookup(languageRangeList3, (java.util.Collection<java.util.Locale>) localeList66);
        java.util.Locale.LanguageRange[] languageRangeArray68 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList69 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList69, languageRangeArray68);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap71 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList72 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList69, strMap71);
        int int73 = languageRangeList69.size();
        java.util.List<java.util.Locale.LanguageRange> languageRangeList75 = java.util.Locale.LanguageRange.parse("hi");
        boolean boolean77 = languageRangeList75.remove((java.lang.Object) "English");
        boolean boolean78 = languageRangeList69.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList75);
        boolean boolean79 = languageRangeList3.remove((java.lang.Object) languageRangeList75);
        java.util.Locale locale80 = java.util.Locale.KOREA;
        java.util.Set<java.lang.String> strSet81 = locale80.getUnicodeLocaleAttributes();
        java.util.Locale.FilteringMode filteringMode82 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList83 = java.util.Locale.filterTags(languageRangeList3, (java.util.Collection<java.lang.String>) strSet81, filteringMode82);
        java.util.List<java.lang.Class<?>> wildcardClassList84 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses(strList83);
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(languageRangeList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(languageRangeArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(languageRangeList11);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClassList22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(languageRangeList25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(languageRangeArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "english" + "'", str33, "english");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "it");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Cina" + "'", str39, "Cina");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "zh-CN" + "'", str40, "zh-CN");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "it");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Cina" + "'", str43, "Cina");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "it");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Cina" + "'", str46, "Cina");
        org.junit.Assert.assertEquals(locale50.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "it");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Cina" + "'", str53, "Cina");
        org.junit.Assert.assertEquals(locale55.toString(), "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertNotNull(locale57);
        org.junit.Assert.assertEquals(locale57.toString(), "ko");
        org.junit.Assert.assertEquals(locale59.toString(), "");
        org.junit.Assert.assertNotNull(locale60);
        org.junit.Assert.assertEquals(locale60.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(localeList64);
        org.junit.Assert.assertNotNull(localeList65);
        org.junit.Assert.assertNotNull(localeList66);
        org.junit.Assert.assertNull(locale67);
        org.junit.Assert.assertNotNull(languageRangeArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(languageRangeList72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertNotNull(languageRangeList75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(locale80);
        org.junit.Assert.assertEquals(locale80.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(strSet81);
        org.junit.Assert.assertTrue("'" + filteringMode82 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode82.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList83);
        org.junit.Assert.assertNotNull(wildcardClassList84);
    }

    @Test
    public void test10481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10481");
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
        java.lang.Class<?>[] wildcardClassArray32 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray21);
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
        org.junit.Assert.assertNotNull(wildcardClassArray32);
    }

    @Test
    public void test10482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10482");
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
        java.util.Locale.LanguageRange[] languageRangeArray37 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList38 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList38, languageRangeArray37);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap40 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList41 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList38, strMap40);
        int int42 = languageRangeList38.size();
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor43 = languageRangeList38.listIterator();
        java.util.Locale.LanguageRange languageRange45 = new java.util.Locale.LanguageRange("a");
        java.util.Locale.LanguageRange languageRange47 = new java.util.Locale.LanguageRange("English");
        java.lang.String str49 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) languageRange47, "");
        java.util.Locale.LanguageRange languageRange51 = new java.util.Locale.LanguageRange("English");
        java.util.Locale.LanguageRange[] languageRangeArray52 = new java.util.Locale.LanguageRange[] { languageRange45, languageRange47, languageRange51 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList53 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList53, languageRangeArray52);
        boolean boolean55 = languageRangeList38.retainAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList53);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor56 = languageRangeList53.listIterator();
        java.lang.String str58 = org.apache.commons.lang3.StringUtils.join((java.util.Iterator<java.util.Locale.LanguageRange>) languageRangeItor56, ' ');
        int int59 = languageRangeList1.lastIndexOf((java.lang.Object) languageRangeItor56);
        java.util.Locale.LanguageRange[] languageRangeArray60 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList61 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList61, languageRangeArray60);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap63 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList64 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList61, strMap63);
        java.lang.String[] strArray72 = new java.lang.String[] { "English", "hi", "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "", "a", "", "China" };
        java.util.ArrayList<java.lang.String> strList73 = new java.util.ArrayList<java.lang.String>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList73, strArray72);
        java.util.List<java.lang.Class<?>> wildcardClassList75 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList73);
        java.lang.String str76 = java.util.Locale.lookupTag(languageRangeList64, (java.util.Collection<java.lang.String>) strList73);
        java.util.Locale.LanguageRange[] languageRangeArray77 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList78 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList78, languageRangeArray77);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap80 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList81 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList78, strMap80);
        java.util.Locale.LanguageRange[] languageRangeArray82 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList83 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList83, languageRangeArray82);
        boolean boolean85 = languageRangeList78.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList83);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream86 = languageRangeList83.stream();
        boolean boolean87 = languageRangeList64.containsAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList83);
        java.util.Locale.LanguageRange languageRange90 = new java.util.Locale.LanguageRange("English");
        java.lang.String str92 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) languageRange90, "");
        languageRangeList83.add((int) (byte) 0, languageRange90);
        double double94 = languageRange90.getWeight();
        boolean boolean95 = languageRangeList1.add(languageRange90);
        double double96 = languageRange90.getWeight();
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
        org.junit.Assert.assertEquals(locale10.toString(), "it");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Cina" + "'", str11, "Cina");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "zh-CN" + "'", str12, "zh-CN");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "it");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Cina" + "'", str15, "Cina");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "it");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Cina" + "'", str18, "Cina");
        org.junit.Assert.assertEquals(locale22.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "it");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Cina" + "'", str25, "Cina");
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
        org.junit.Assert.assertNotNull(languageRangeArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(languageRangeList41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(languageRangeItor43);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Locale.LanguageRange" + "'", str49, "Locale.LanguageRange");
        org.junit.Assert.assertNotNull(languageRangeArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(languageRangeItor56);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(languageRangeArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(languageRangeList64);
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(wildcardClassList75);
        org.junit.Assert.assertNull(str76);
        org.junit.Assert.assertNotNull(languageRangeArray77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(languageRangeList81);
        org.junit.Assert.assertNotNull(languageRangeArray82);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(languageRangeStream86);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "Locale.LanguageRange" + "'", str92, "Locale.LanguageRange");
        org.junit.Assert.assertTrue("'" + double94 + "' != '" + 1.0d + "'", double94 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + true + "'", boolean95 == true);
        org.junit.Assert.assertTrue("'" + double96 + "' != '" + 1.0d + "'", double96 == 1.0d);
    }

    @Test
    public void test10483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10483");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "    cn    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10484");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("                                              cHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAANIHc                                              " + "'", str1, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAANIHc                                              ");
    }

    @Test
    public void test10485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10485");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("chinois(chine)4444444444444444444444444444444444444444444444444444444444444444444444444444444444444", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=chinois(chine)4444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10486");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("cinese (Cina)", 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '.', (int) (short) -1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test10487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10487");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("Cina", strMap1);
        languageRangeList2.clear();
        java.lang.Class<?> wildcardClass4 = languageRangeList2.getClass();
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test10488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10488");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("it", strMap1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList2, "cinese (Taiwan)");
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor5 = languageRangeList2.listIterator();
        java.util.Locale.Category category6 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale7 = java.util.Locale.getDefault(category6);
        java.util.Locale locale8 = java.util.Locale.getDefault(category6);
        java.util.Locale locale9 = java.util.Locale.FRENCH;
        java.util.Locale locale10 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str11 = locale10.getDisplayLanguage();
        java.util.Locale locale12 = java.util.Locale.getDefault();
        java.lang.String str13 = locale10.getDisplayCountry(locale12);
        java.util.Locale locale14 = java.util.Locale.TAIWAN;
        java.lang.String str15 = locale14.getVariant();
        java.lang.String str16 = locale10.getDisplayName(locale14);
        java.lang.String str17 = locale9.getDisplayScript(locale10);
        java.util.Locale.setDefault(category6, locale10);
        java.util.Locale locale21 = java.util.Locale.forLanguageTag("twn");
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.upperCase("ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", locale21);
        java.lang.String str23 = locale21.getVariant();
        java.util.Locale.setDefault(category6, locale21);
        java.util.Locale locale26 = java.util.Locale.TAIWAN;
        java.lang.String str27 = org.apache.commons.lang3.StringUtils.upperCase("", locale26);
        java.lang.String str28 = locale26.getISO3Country();
        java.util.Set<java.lang.Character> charSet29 = locale26.getExtensionKeys();
        java.util.Locale locale30 = locale26.stripExtensions();
        java.util.Locale locale31 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale32 = java.util.Locale.getDefault();
        java.lang.String str33 = locale31.getDisplayCountry(locale32);
        java.lang.String str34 = locale31.toLanguageTag();
        java.util.Locale locale35 = locale31.stripExtensions();
        java.lang.String str36 = locale30.getDisplayName(locale35);
        java.util.Locale.setDefault(category6, locale30);
        java.util.Locale locale38 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale39 = java.util.Locale.getDefault();
        java.lang.String str40 = locale38.getDisplayCountry(locale39);
        java.lang.String str41 = locale38.toLanguageTag();
        boolean boolean42 = locale38.hasExtensions();
        java.lang.String str43 = locale38.getDisplayCountry();
        java.util.Locale.setDefault(category6, locale38);
        int int45 = languageRangeList2.lastIndexOf((java.lang.Object) category6);
        java.util.Locale locale46 = java.util.Locale.ITALIAN;
        java.lang.String str47 = locale46.getLanguage();
        java.lang.String str48 = locale46.getDisplayVariant();
        java.util.Locale.Builder builder50 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder51 = builder50.clearExtensions();
        java.util.Locale.Builder builder53 = builder51.setLanguageTag("zh-CN");
        java.util.Locale.Builder builder55 = builder53.setLanguage("CHINA");
        java.util.Locale locale56 = builder53.build();
        java.util.Set<java.lang.String> strSet57 = locale56.getUnicodeLocaleKeys();
        java.lang.String str58 = org.apache.commons.lang3.StringUtils.lowerCase("Zxxxxxxxxxxxxxxxxxxx", locale56);
        java.lang.String str59 = locale56.getDisplayLanguage();
        java.lang.String str60 = locale46.getDisplayLanguage(locale56);
        java.util.Locale locale64 = new java.util.Locale("CHNAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "en_CA", "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
        java.util.Locale locale65 = java.util.Locale.ITALIAN;
        java.util.Locale locale67 = new java.util.Locale("");
        java.lang.String str68 = locale67.getDisplayLanguage();
        java.util.Locale locale69 = java.util.Locale.CANADA;
        java.lang.String str70 = locale69.getDisplayLanguage();
        java.lang.String str71 = locale67.getDisplayScript(locale69);
        java.util.Locale locale73 = java.util.Locale.FRANCE;
        java.lang.String str74 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale73);
        java.lang.String str75 = locale67.getDisplayCountry(locale73);
        java.lang.String str76 = locale65.getDisplayScript(locale67);
        java.util.Locale locale77 = java.util.Locale.GERMAN;
        java.lang.String str78 = locale67.getDisplayLanguage(locale77);
        java.util.Locale locale81 = new java.util.Locale("");
        java.lang.String str82 = locale81.getDisplayLanguage();
        java.util.Locale locale83 = java.util.Locale.CANADA;
        java.lang.String str84 = locale83.getDisplayLanguage();
        java.lang.String str85 = locale81.getDisplayScript(locale83);
        java.lang.String str86 = org.apache.commons.lang3.StringUtils.lowerCase("a", locale81);
        java.lang.String str87 = locale81.getDisplayScript();
        java.lang.String str88 = locale77.getDisplayLanguage(locale81);
        java.util.Set<java.lang.String> strSet89 = locale81.getUnicodeLocaleAttributes();
        java.lang.String str90 = locale64.getDisplayCountry(locale81);
        java.util.Locale locale92 = new java.util.Locale("");
        java.lang.String str93 = locale92.getDisplayVariant();
        java.lang.String str94 = locale81.getDisplayScript(locale92);
        java.util.Locale locale96 = new java.util.Locale("");
        java.lang.String str97 = locale92.getDisplayCountry(locale96);
        java.lang.String str98 = locale56.getDisplayName(locale96);
        java.util.Locale.setDefault(category6, locale96);
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeItor5);
        org.junit.Assert.assertTrue("'" + category6 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category6.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale7);
// flaky:         org.junit.Assert.assertEquals(locale7.toString(), "fr");
        org.junit.Assert.assertNotNull(locale8);
// flaky:         org.junit.Assert.assertEquals(locale8.toString(), "fr");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_TW");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chinois" + "'", str11, "chinois");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "it");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Taiwan" + "'", str13, "Taiwan");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\u4e2d\u6587\u53f0\u7063)" + "'", str16, "\u4e2d\u6587\u53f0\u7063)");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "twn");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "AHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H" + "'", str22, "AHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "TWN" + "'", str28, "TWN");
        org.junit.Assert.assertNotNull(charSet29);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "it");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Cina" + "'", str33, "Cina");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "zh-CN" + "'", str34, "zh-CN");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "\u4e2d\u6587\u53f0\u6e7e\u5730\u533a)" + "'", str36, "\u4e2d\u6587\u53f0\u6e7e\u5730\u533a)");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "it");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Cina" + "'", str40, "Cina");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "zh-CN" + "'", str41, "zh-CN");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "\u4e2d\u570b" + "'", str43, "\u4e2d\u570b");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "it");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "it" + "'", str47, "it");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertNotNull(locale56);
        org.junit.Assert.assertEquals(locale56.toString(), "china_CN");
        org.junit.Assert.assertNotNull(strSet57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "zxxxxxxxxxxxxxxxxxxx" + "'", str58, "zxxxxxxxxxxxxxxxxxxx");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "china" + "'", str59, "china");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "Italian" + "'", str60, "Italian");
        org.junit.Assert.assertEquals(locale64.toString(), "chnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa_EN_CA_ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
        org.junit.Assert.assertNotNull(locale65);
        org.junit.Assert.assertEquals(locale65.toString(), "it");
        org.junit.Assert.assertEquals(locale67.toString(), "");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertNotNull(locale69);
        org.junit.Assert.assertEquals(locale69.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "\u82f1\u6587" + "'", str70, "\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertNotNull(locale73);
        org.junit.Assert.assertEquals(locale73.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "english" + "'", str74, "english");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertNotNull(locale77);
        org.junit.Assert.assertEquals(locale77.toString(), "de");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertEquals(locale81.toString(), "");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertNotNull(locale83);
        org.junit.Assert.assertEquals(locale83.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "\u82f1\u6587" + "'", str84, "\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "" + "'", str85, "");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "a" + "'", str86, "a");
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "" + "'", str87, "");
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "German" + "'", str88, "German");
        org.junit.Assert.assertNotNull(strSet89);
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "EN_CA" + "'", str90, "EN_CA");
        org.junit.Assert.assertEquals(locale92.toString(), "");
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "" + "'", str93, "");
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "" + "'", str94, "");
        org.junit.Assert.assertEquals(locale96.toString(), "");
        org.junit.Assert.assertEquals("'" + str97 + "' != '" + "" + "'", str97, "");
        org.junit.Assert.assertEquals("'" + str98 + "' != '" + "china (China)" + "'", str98, "china (China)");
    }

    @Test
    public void test10489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10489");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("engliIlishESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "engliIlishESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWA" + "'", str1, "engliIlishESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWA");
    }

    @Test
    public void test10490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10490");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "                                redliuB");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10491");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("acoL");
        java.lang.Class<?>[] wildcardClassArray2 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray1);
        java.util.Locale.LanguageRange[] languageRangeArray3 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList4 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList4, languageRangeArray3);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap6 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList7 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, strMap6);
        java.util.Locale.LanguageRange[] languageRangeArray8 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList9 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList9, languageRangeArray8);
        boolean boolean11 = languageRangeList4.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList9);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList9, "hi!");
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
        java.lang.Class[] classArray27 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray28 = (java.lang.Class<?>[]) classArray27;
        java.lang.Class<?>[] wildcardClassArray29 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray27);
        java.lang.Class<?> wildcardClass30 = null;
        java.lang.Class[] classArray32 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray33 = (java.lang.Class<?>[]) classArray32;
        wildcardClassArray33[0] = wildcardClass30;
        boolean boolean37 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray29, wildcardClassArray33, false);
        java.lang.Class[] classArray39 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray40 = (java.lang.Class<?>[]) classArray39;
        java.lang.Class<?>[] wildcardClassArray41 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray39);
        boolean boolean42 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray29, (java.lang.Class<?>[]) classArray39);
        boolean boolean43 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray15, (java.lang.Class<?>[]) classArray39);
        java.lang.Class<?>[] wildcardClassArray44 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers((java.lang.Class<?>[]) classArray39);
        java.lang.Class<?>[] wildcardClassArray45 = languageRangeList9.toArray((java.lang.Class<?>[]) classArray39);
        java.lang.Class<?>[] wildcardClassArray46 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray45);
        java.lang.Class<?>[] wildcardClassArray47 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray46);
        boolean boolean48 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray2, wildcardClassArray46);
        java.lang.String[] strArray50 = null;
        java.lang.String[] strArray52 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("inglese");
        java.lang.String str53 = org.apache.commons.lang3.StringUtils.replaceEach("An", strArray50, strArray52);
        java.lang.Class<?>[] wildcardClassArray54 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray52);
        boolean boolean56 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray46, wildcardClassArray54, true);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(languageRangeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(languageRangeList7);
        org.junit.Assert.assertNotNull(languageRangeArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(classArray15);
        org.junit.Assert.assertNotNull(wildcardClassArray16);
        org.junit.Assert.assertNotNull(wildcardClassArray17);
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertNotNull(classArray21);
        org.junit.Assert.assertNotNull(wildcardClassArray22);
        org.junit.Assert.assertNotNull(wildcardClassArray23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(classArray27);
        org.junit.Assert.assertNotNull(wildcardClassArray28);
        org.junit.Assert.assertNotNull(wildcardClassArray29);
        org.junit.Assert.assertNotNull(classArray32);
        org.junit.Assert.assertNotNull(wildcardClassArray33);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(classArray39);
        org.junit.Assert.assertNotNull(wildcardClassArray40);
        org.junit.Assert.assertNotNull(wildcardClassArray41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray44);
        org.junit.Assert.assertNotNull(wildcardClassArray45);
        org.junit.Assert.assertNotNull(wildcardClassArray46);
        org.junit.Assert.assertNotNull(wildcardClassArray47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "An" + "'", str53, "An");
        org.junit.Assert.assertNotNull(wildcardClassArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test10492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10492");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale3 = new java.util.Locale("zh_C");
        java.util.Locale.setDefault(category0, locale3);
        java.util.Locale locale5 = java.util.Locale.getDefault(category0);
        java.util.Locale locale7 = new java.util.Locale("");
        java.util.Set<java.lang.String> strSet8 = locale7.getUnicodeLocaleKeys();
        java.lang.String str9 = locale7.getDisplayVariant();
        java.lang.String str10 = locale7.getCountry();
        java.util.Locale.setDefault(category0, locale7);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals(locale3.toString(), "zh_c");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_c");
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test10493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10493");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("Ese (Taiwan$$$$$$$$$slgneese (Taiwan$$$$$$$$$");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=ese(taiwan$$$$$$$$$slgneese(taiwan$$$$$$$$$");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10494");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("EN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-caEN-ca");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test10495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10495");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("a", "");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '$');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "a" + "'", str6, "a");
    }

    @Test
    public void test10496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10496");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("REFERENCEPIPELINE.HEAD                        list###########", (int) '4', '.');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "REFERENCEPIPELINE.HEAD                        list###########" + "'", str3, "REFERENCEPIPELINE.HEAD                        list###########");
    }

    @Test
    public void test10497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10497");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("                                                                                           Germn", "\u7063\u53f0\u6587\u4e2d");
// flaky:         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test10498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10498");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxchn     ", 8, 120);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10499");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("STRING[]", "444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10500");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setScript("");
        java.util.Locale.Builder builder4 = builder2.setLanguage("HI");
        java.util.Locale locale5 = java.util.Locale.FRANCE;
        java.util.Locale.Builder builder6 = builder4.setLocale(locale5);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder6.removeUnicodeLocaleAttribute("");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute:  [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(builder6);
    }
}
