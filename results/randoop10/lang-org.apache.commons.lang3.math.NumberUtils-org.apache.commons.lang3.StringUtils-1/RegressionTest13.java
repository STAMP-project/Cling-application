import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest13 {

    public static boolean debug = false;

    @Test
    public void test06501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06501");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("de");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test06502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06502");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("JPN                                                                                                                                                                                                                                                                                                          ", '#', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JPN                                                                                                                                                                                                                                                                                                          " + "'", str3, "JPN                                                                                                                                                                                                                                                                                                          ");
    }

    @Test
    public void test06503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06503");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        java.util.List<java.lang.String> strList9 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList7);
        java.util.Locale.LanguageRange[] languageRangeArray10 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList11 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList11, languageRangeArray10);
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi" };
        java.util.ArrayList<java.lang.String> strList17 = new java.util.ArrayList<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList17, strArray16);
        java.util.List<java.lang.String> strList19 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList11, (java.util.Collection<java.lang.String>) strList17);
        java.lang.String str20 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList17);
        java.util.Locale.LanguageRange[] languageRangeArray21 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList22 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList22, languageRangeArray21);
        java.util.Locale locale25 = java.util.Locale.getDefault();
        java.lang.String str26 = org.apache.commons.lang3.StringUtils.lowerCase("", locale25);
        java.util.Locale.setDefault(locale25);
        java.util.Locale locale29 = java.util.Locale.getDefault();
        java.lang.String str30 = org.apache.commons.lang3.StringUtils.lowerCase("", locale29);
        java.util.Locale.setDefault(locale29);
        java.util.Locale locale32 = java.util.Locale.KOREA;
        java.util.Locale locale33 = locale32.stripExtensions();
        java.util.Locale locale35 = java.util.Locale.FRANCE;
        java.lang.String str36 = org.apache.commons.lang3.StringUtils.upperCase("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!", locale35);
        java.util.Locale locale37 = java.util.Locale.getDefault();
        java.lang.String str38 = locale37.getDisplayLanguage();
        java.util.Locale locale40 = java.util.Locale.getDefault();
        java.lang.String str41 = org.apache.commons.lang3.StringUtils.upperCase("", locale40);
        java.util.Locale locale42 = java.util.Locale.GERMANY;
        java.util.Locale locale43 = java.util.Locale.GERMANY;
        java.util.Locale locale44 = java.util.Locale.GERMANY;
        java.lang.String str45 = locale44.getVariant();
        java.util.Locale locale46 = java.util.Locale.KOREA;
        java.util.Locale locale47 = locale46.stripExtensions();
        java.util.Locale locale48 = java.util.Locale.KOREA;
        java.util.Locale locale49 = locale48.stripExtensions();
        java.util.Locale locale50 = java.util.Locale.KOREA;
        java.util.Locale locale51 = java.util.Locale.PRC;
        java.util.Locale locale52 = java.util.Locale.KOREA;
        java.lang.String str53 = locale52.getScript();
        java.util.Locale locale54 = java.util.Locale.GERMANY;
        java.util.Locale[] localeArray55 = new java.util.Locale[] { locale25, locale29, locale32, locale35, locale37, locale40, locale42, locale43, locale44, locale46, locale49, locale50, locale51, locale52, locale54 };
        java.util.ArrayList<java.util.Locale> localeList56 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList56, localeArray55);
        java.util.Locale.FilteringMode filteringMode58 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList59 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList22, (java.util.Collection<java.util.Locale>) localeList56, filteringMode58);
        java.util.Locale locale60 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList59);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap61 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList62 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap61);
        java.util.Locale locale64 = new java.util.Locale("");
        java.lang.String str65 = locale64.getVariant();
        java.util.Locale locale66 = java.util.Locale.TAIWAN;
        java.lang.String str67 = locale64.getDisplayScript(locale66);
        java.util.Set<java.lang.String> strSet68 = locale64.getUnicodeLocaleAttributes();
        java.lang.String str69 = java.util.Locale.lookupTag(languageRangeList62, (java.util.Collection<java.lang.String>) strSet68);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(languageRangeArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(languageRangeArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(locale25);
// flaky:         org.junit.Assert.assertEquals(locale25.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(locale29);
// flaky:         org.junit.Assert.assertEquals(locale29.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!!" + "'", str36, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!!");
        org.junit.Assert.assertNotNull(locale37);
// flaky:         org.junit.Assert.assertEquals(locale37.toString(), "fr_FR");
// flaky:         org.junit.Assert.assertEquals("'" + str38 + "' != '" + "fran\347ais" + "'", str38, "fran\347ais");
        org.junit.Assert.assertNotNull(locale40);
// flaky:         org.junit.Assert.assertEquals(locale40.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "de_DE");
        org.junit.Assert.assertNotNull(localeArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + filteringMode58 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode58.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList59);
        org.junit.Assert.assertNull(locale60);
        org.junit.Assert.assertNotNull(languageRangeList62);
        org.junit.Assert.assertEquals(locale64.toString(), "");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertNotNull(locale66);
        org.junit.Assert.assertEquals(locale66.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertNotNull(strSet68);
        org.junit.Assert.assertNull(str69);
    }

    @Test
    public void test06504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06504");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih" + "'", str2, "ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih");
    }

    @Test
    public void test06505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06505");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("ADuAEuAFuAGuAIuALuAMuANuAOuAQuARuASuATuAUuAWuAXuAZuBAuBBuBDuBEuBFuBGuBHuBIuBJuBLuBMuBNuBOuBQuBRuBSuBTuBVuBWuBYuBZuCAuCCuCDuCFuCGuCHuCIuCKuCLuCMuCNuCOuCRuCUuCVuCWuCXuCYuCZuDEuDJuDKuDMuDOuDZuECuEEuEGuEHuERuESuETuFIuFJuFKuFMuFOuFRuGAuGBuGDuGEuGFuGGuGHuGIuGLuGMuGNuGPuGQuGRuGSuGTuGUuGWuGYuHKuHMuHNuHRuHTuHUuIDuIEuILuIMuINuIOuIQuIRuISuITuJEuJMuJOuJPuKEuKGuKHuKIuKMuKNuKPuKRuKWuKYuKZuLAuLBuLCuLIuLKuLRuLSuLTuLUuLVuLYuMAuMCuMDuMEuMFuMGuMHuMKuMLuMMuMNuMOuMPuMQuMRuMSuMTuMUuMVuMWuMXuMYuMZuNAuNCuNEuNFuNGuNIuNLuNOuNPuNRuNUuNZuOMuPAuPEuPFuPGuPHuPKuPLuPMuPNuPRuPSuPTuPWuPYuQAuREuROuRSuRUuRWuSAuSBuSCuSDuSEuSGuSHuSIuSJuSKuSLuSMuSNuSOuSRuSSuSTuSVuSXuSYuSZuTCuTDuTFuTGuTHuTJuTKuTLuTMuTNuTOuTRuTTuTVuTWuTZuUAuUGuUMuUSuUYuUZuVAuVCuVEuVGuVIuVNuVUuWFuWSuYEuYTuZAuZMuZW");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ADuAEuAFuAGuAIuALuAMuANuAOuAQuARuASuATuAUuAWuAXuAZuBAuBBuBDuBEuBFuBGuBHuBIuBJuBLuBMuBNuBOuBQuBRuBSuBTuBVuBWuBYuBZuCAuCCuCDuCFuCGuCHuCIuCKuCLuCMuCNuCOuCRuCUuCVuCWuCXuCYuCZuDEuDJuDKuDMuDOuDZuECuEEuEGuEHuERuESuETuFIuFJuFKuFMuFOuFRuGAuGBuGDuGEuGFuGGuGHuGIuGLuGMuGNuGPuGQuGRuGSuGTuGUuGWuGYuHKuHMuHNuHRuHTuHUuIDuIEuILuIMuINuIOuIQuIRuISuITuJEuJMuJOuJPuKEuKGuKHuKIuKMuKNuKPuKRuKWuKYuKZuLAuLBuLCuLIuLKuLRuLSuLTuLUuLVuLYuMAuMCuMDuMEuMFuMGuMHuMKuMLuMMuMNuMOuMPuMQuMRuMSuMTuMUuMVuMWuMXuMYuMZuNAuNCuNEuNFuNGuNIuNLuNOuNPuNRuNUuNZuOMuPAuPEuPFuPGuPHuPKuPLuPMuPNuPRuPSuPTuPWuPYuQAuREuROuRSuRUuRWuSAuSBuSCuSDuSEuSGuSHuSIuSJuSKuSLuSMuSNuSOuSRuSSuSTuSVuSXuSYuSZuTCuTDuTFuTGuTHuTJuTKuTLuTMuTNuTOuTRuTTuTVuTWuTZuUAuUGuUMuUSuUYuUZuVAuVCuVEuVGuVIuVNuVUuWFuWSuYEuYTuZAuZMuZW" + "'", str1, "ADuAEuAFuAGuAIuALuAMuANuAOuAQuARuASuATuAUuAWuAXuAZuBAuBBuBDuBEuBFuBGuBHuBIuBJuBLuBMuBNuBOuBQuBRuBSuBTuBVuBWuBYuBZuCAuCCuCDuCFuCGuCHuCIuCKuCLuCMuCNuCOuCRuCUuCVuCWuCXuCYuCZuDEuDJuDKuDMuDOuDZuECuEEuEGuEHuERuESuETuFIuFJuFKuFMuFOuFRuGAuGBuGDuGEuGFuGGuGHuGIuGLuGMuGNuGPuGQuGRuGSuGTuGUuGWuGYuHKuHMuHNuHRuHTuHUuIDuIEuILuIMuINuIOuIQuIRuISuITuJEuJMuJOuJPuKEuKGuKHuKIuKMuKNuKPuKRuKWuKYuKZuLAuLBuLCuLIuLKuLRuLSuLTuLUuLVuLYuMAuMCuMDuMEuMFuMGuMHuMKuMLuMMuMNuMOuMPuMQuMRuMSuMTuMUuMVuMWuMXuMYuMZuNAuNCuNEuNFuNGuNIuNLuNOuNPuNRuNUuNZuOMuPAuPEuPFuPGuPHuPKuPLuPMuPNuPRuPSuPTuPWuPYuQAuREuROuRSuRUuRWuSAuSBuSCuSDuSEuSGuSHuSIuSJuSKuSLuSMuSNuSOuSRuSSuSTuSVuSXuSYuSZuTCuTDuTFuTGuTHuTJuTKuTLuTMuTNuTOuTRuTTuTVuTWuTZuUAuUGuUMuUSuUYuUZuVAuVCuVEuVGuVIuVNuVUuWFuWSuYEuYTuZAuZMuZW");
    }

    @Test
    public void test06506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06506");
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.valueOf((long) (-1), 5);
        org.junit.Assert.assertNotNull(bigDecimal2);
    }

    @Test
    public void test06507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06507");
        byte[] byteArray2 = new byte[] { (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.math.BigInteger bigInteger4 = new java.math.BigInteger((int) (short) -1, byteArray2);
        java.math.BigInteger bigInteger6 = bigInteger4.pow((int) 'a');
        byte[] byteArray7 = bigInteger4.toByteArray();
        long long8 = bigInteger4.longValueExact();
        java.lang.String str10 = bigInteger4.toString(0);
        byte[] byteArray13 = new byte[] { (byte) 1 };
        byte byte14 = org.apache.commons.lang3.math.NumberUtils.min(byteArray13);
        java.math.BigInteger bigInteger15 = new java.math.BigInteger((int) (short) -1, byteArray13);
        java.math.BigInteger bigInteger16 = new java.math.BigInteger(byteArray13);
        boolean boolean17 = bigInteger4.equals((java.lang.Object) byteArray13);
        java.math.BigDecimal bigDecimal18 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal19 = bigDecimal18.negate();
        java.math.BigDecimal bigDecimal22 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal23 = bigDecimal19.subtract(bigDecimal22);
        java.math.BigInteger bigInteger24 = bigDecimal23.toBigInteger();
        double double25 = bigInteger24.doubleValue();
        byte[] byteArray28 = new byte[] { (byte) 1 };
        byte byte29 = org.apache.commons.lang3.math.NumberUtils.min(byteArray28);
        java.math.BigInteger bigInteger30 = new java.math.BigInteger((int) (short) -1, byteArray28);
        java.math.BigInteger bigInteger31 = bigInteger24.gcd(bigInteger30);
        java.math.BigDecimal bigDecimal32 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal33 = bigDecimal32.negate();
        java.math.BigDecimal bigDecimal36 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal37 = bigDecimal33.subtract(bigDecimal36);
        java.math.BigInteger bigInteger38 = bigDecimal37.toBigInteger();
        java.math.BigInteger bigInteger39 = bigInteger30.or(bigInteger38);
        byte[] byteArray40 = bigInteger39.toByteArray();
        byte byte41 = org.apache.commons.lang3.math.NumberUtils.min(byteArray40);
        java.math.BigInteger bigInteger42 = new java.math.BigInteger(byteArray40);
        java.math.BigInteger bigInteger43 = bigInteger4.gcd(bigInteger42);
        java.math.MathContext mathContext44 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal45 = new java.math.BigDecimal(bigInteger43, mathContext44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1]");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1" + "'", str10, "-1");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[1]");
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) 1 + "'", byte14 == (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(bigDecimal18);
        org.junit.Assert.assertNotNull(bigDecimal19);
        org.junit.Assert.assertNotNull(bigDecimal22);
        org.junit.Assert.assertNotNull(bigDecimal23);
        org.junit.Assert.assertNotNull(bigInteger24);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[1]");
        org.junit.Assert.assertTrue("'" + byte29 + "' != '" + (byte) 1 + "'", byte29 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger31);
        org.junit.Assert.assertNotNull(bigDecimal32);
        org.junit.Assert.assertNotNull(bigDecimal33);
        org.junit.Assert.assertNotNull(bigDecimal36);
        org.junit.Assert.assertNotNull(bigDecimal37);
        org.junit.Assert.assertNotNull(bigInteger38);
        org.junit.Assert.assertNotNull(bigInteger39);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[-1]");
        org.junit.Assert.assertTrue("'" + byte41 + "' != '" + (byte) -1 + "'", byte41 == (byte) -1);
        org.junit.Assert.assertNotNull(bigInteger43);
    }

    @Test
    public void test06508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06508");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal5 = bigDecimal1.subtract(bigDecimal4);
        java.lang.String str6 = bigDecimal1.toPlainString();
        java.math.BigDecimal bigDecimal7 = java.math.BigDecimal.ZERO;
        double double8 = bigDecimal7.doubleValue();
        java.math.BigDecimal bigDecimal10 = bigDecimal7.movePointLeft((int) (byte) -1);
        java.math.BigInteger bigInteger11 = bigDecimal7.unscaledValue();
        long long12 = bigDecimal7.longValue();
        java.math.BigDecimal bigDecimal13 = bigDecimal1.subtract(bigDecimal7);
        java.math.BigDecimal bigDecimal14 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal15 = bigDecimal14.negate();
        java.math.BigDecimal bigDecimal16 = bigDecimal14.negate();
        java.lang.String str17 = bigDecimal14.toString();
        java.math.BigDecimal bigDecimal19 = new java.math.BigDecimal((double) 1L);
        java.lang.Object[] objArray22 = new java.lang.Object[] { (short) 10, (short) 100 };
        java.lang.String str26 = org.apache.commons.lang3.StringUtils.join(objArray22, "hi!", (int) (byte) 100, (int) (short) -1);
        boolean boolean27 = bigDecimal19.equals((java.lang.Object) (short) -1);
        java.math.BigDecimal bigDecimal28 = bigDecimal14.max(bigDecimal19);
        java.math.BigDecimal bigDecimal29 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal30 = bigDecimal29.negate();
        java.math.BigDecimal bigDecimal33 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal34 = bigDecimal30.subtract(bigDecimal33);
        java.math.BigDecimal bigDecimal35 = java.math.BigDecimal.TEN;
        java.math.BigDecimal bigDecimal36 = bigDecimal33.min(bigDecimal35);
        java.math.BigDecimal bigDecimal38 = bigDecimal36.movePointRight((int) (short) -2);
        java.math.BigDecimal bigDecimal39 = bigDecimal14.min(bigDecimal36);
        int int40 = bigDecimal1.compareTo(bigDecimal39);
        java.math.MathContext mathContext41 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal42 = bigDecimal1.plus(mathContext41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0" + "'", str6, "0");
        org.junit.Assert.assertNotNull(bigDecimal7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(bigDecimal10);
        org.junit.Assert.assertNotNull(bigInteger11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(bigDecimal13);
        org.junit.Assert.assertNotNull(bigDecimal14);
        org.junit.Assert.assertNotNull(bigDecimal15);
        org.junit.Assert.assertNotNull(bigDecimal16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "0" + "'", str17, "0");
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[10, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[10, 100]");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(bigDecimal28);
        org.junit.Assert.assertNotNull(bigDecimal29);
        org.junit.Assert.assertNotNull(bigDecimal30);
        org.junit.Assert.assertNotNull(bigDecimal33);
        org.junit.Assert.assertNotNull(bigDecimal34);
        org.junit.Assert.assertNotNull(bigDecimal35);
        org.junit.Assert.assertNotNull(bigDecimal36);
        org.junit.Assert.assertNotNull(bigDecimal38);
        org.junit.Assert.assertNotNull(bigDecimal39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test06509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06509");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.ONE;
        java.math.BigDecimal bigDecimal3 = bigDecimal1.min(bigDecimal2);
        java.lang.String str4 = bigDecimal1.toPlainString();
        java.lang.String str5 = bigDecimal1.toPlainString();
        java.math.BigDecimal bigDecimal6 = null;
        java.math.MathContext mathContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal8 = bigDecimal1.divideToIntegralValue(bigDecimal6, mathContext7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal2);
        org.junit.Assert.assertNotNull(bigDecimal3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0" + "'", str5, "0");
    }

    @Test
    public void test06510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06510");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.lang.String str7 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList5);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList9 = java.util.Locale.LanguageRange.parse("English");
        java.util.Locale.LanguageRange[] languageRangeArray10 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList11 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList11, languageRangeArray10);
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi" };
        java.util.ArrayList<java.lang.String> strList17 = new java.util.ArrayList<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList17, strArray16);
        java.util.List<java.lang.String> strList19 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList11, (java.util.Collection<java.lang.String>) strList17);
        java.util.Locale.LanguageRange[] languageRangeArray20 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList21 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList21, languageRangeArray20);
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi" };
        java.util.ArrayList<java.lang.String> strList27 = new java.util.ArrayList<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList27, strArray26);
        java.util.List<java.lang.String> strList29 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList21, (java.util.Collection<java.lang.String>) strList27);
        java.lang.String str30 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList11, (java.util.Collection<java.lang.String>) strList27);
        java.util.Locale.LanguageRange[] languageRangeArray31 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList32 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList32, languageRangeArray31);
        java.util.Locale locale35 = java.util.Locale.getDefault();
        java.lang.String str36 = org.apache.commons.lang3.StringUtils.lowerCase("", locale35);
        java.util.Locale.setDefault(locale35);
        java.util.Locale locale39 = java.util.Locale.getDefault();
        java.lang.String str40 = org.apache.commons.lang3.StringUtils.lowerCase("", locale39);
        java.util.Locale.setDefault(locale39);
        java.util.Locale locale42 = java.util.Locale.KOREA;
        java.util.Locale locale43 = locale42.stripExtensions();
        java.util.Locale locale45 = java.util.Locale.FRANCE;
        java.lang.String str46 = org.apache.commons.lang3.StringUtils.upperCase("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!", locale45);
        java.util.Locale locale47 = java.util.Locale.getDefault();
        java.lang.String str48 = locale47.getDisplayLanguage();
        java.util.Locale locale50 = java.util.Locale.getDefault();
        java.lang.String str51 = org.apache.commons.lang3.StringUtils.upperCase("", locale50);
        java.util.Locale locale52 = java.util.Locale.GERMANY;
        java.util.Locale locale53 = java.util.Locale.GERMANY;
        java.util.Locale locale54 = java.util.Locale.GERMANY;
        java.lang.String str55 = locale54.getVariant();
        java.util.Locale locale56 = java.util.Locale.KOREA;
        java.util.Locale locale57 = locale56.stripExtensions();
        java.util.Locale locale58 = java.util.Locale.KOREA;
        java.util.Locale locale59 = locale58.stripExtensions();
        java.util.Locale locale60 = java.util.Locale.KOREA;
        java.util.Locale locale61 = java.util.Locale.PRC;
        java.util.Locale locale62 = java.util.Locale.KOREA;
        java.lang.String str63 = locale62.getScript();
        java.util.Locale locale64 = java.util.Locale.GERMANY;
        java.util.Locale[] localeArray65 = new java.util.Locale[] { locale35, locale39, locale42, locale45, locale47, locale50, locale52, locale53, locale54, locale56, locale59, locale60, locale61, locale62, locale64 };
        java.util.ArrayList<java.util.Locale> localeList66 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList66, localeArray65);
        java.util.Locale.FilteringMode filteringMode68 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList69 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList32, (java.util.Collection<java.util.Locale>) localeList66, filteringMode68);
        java.util.Locale locale70 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList11, (java.util.Collection<java.util.Locale>) localeList69);
        java.util.Locale locale71 = java.util.Locale.lookup(languageRangeList9, (java.util.Collection<java.util.Locale>) localeList69);
        java.util.Locale locale72 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList69);
        java.util.Locale locale74 = new java.util.Locale("");
        java.lang.String str75 = locale74.getVariant();
        java.util.Locale locale76 = java.util.Locale.TAIWAN;
        java.lang.String str77 = locale74.getDisplayScript(locale76);
        java.lang.String str78 = locale74.getVariant();
        java.lang.String str79 = locale74.getVariant();
        java.lang.String str80 = locale74.toLanguageTag();
        java.util.Locale.Builder builder81 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder83 = builder81.setLanguageTag("eng");
        java.util.Locale.Builder builder84 = builder83.clearExtensions();
        java.util.Locale locale85 = java.util.Locale.FRANCE;
        java.util.Locale.Builder builder86 = builder84.setLocale(locale85);
        java.util.Locale.Builder builder88 = builder84.setRegion("US");
        java.util.Locale locale89 = builder84.build();
        java.lang.String str90 = locale74.getDisplayLanguage(locale89);
        java.util.Set<java.lang.String> strSet91 = locale74.getUnicodeLocaleKeys();
        java.lang.String str92 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet91);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(languageRangeList9);
        org.junit.Assert.assertNotNull(languageRangeArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNotNull(languageRangeArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(strList29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(languageRangeArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(locale35);
// flaky:         org.junit.Assert.assertEquals(locale35.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(locale39);
// flaky:         org.junit.Assert.assertEquals(locale39.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!!" + "'", str46, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!!");
        org.junit.Assert.assertNotNull(locale47);
// flaky:         org.junit.Assert.assertEquals(locale47.toString(), "fr_FR");
// flaky:         org.junit.Assert.assertEquals("'" + str48 + "' != '" + "fran\347ais" + "'", str48, "fran\347ais");
        org.junit.Assert.assertNotNull(locale50);
// flaky:         org.junit.Assert.assertEquals(locale50.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertNotNull(locale56);
        org.junit.Assert.assertEquals(locale56.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale57);
        org.junit.Assert.assertEquals(locale57.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale60);
        org.junit.Assert.assertEquals(locale60.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale61);
        org.junit.Assert.assertEquals(locale61.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale62);
        org.junit.Assert.assertEquals(locale62.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertNotNull(locale64);
        org.junit.Assert.assertEquals(locale64.toString(), "de_DE");
        org.junit.Assert.assertNotNull(localeArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + filteringMode68 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode68.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList69);
        org.junit.Assert.assertNull(locale70);
        org.junit.Assert.assertNull(locale71);
        org.junit.Assert.assertNull(locale72);
        org.junit.Assert.assertEquals(locale74.toString(), "");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertNotNull(locale76);
        org.junit.Assert.assertEquals(locale76.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "und" + "'", str80, "und");
        org.junit.Assert.assertNotNull(builder83);
        org.junit.Assert.assertNotNull(builder84);
        org.junit.Assert.assertNotNull(locale85);
        org.junit.Assert.assertEquals(locale85.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(builder86);
        org.junit.Assert.assertNotNull(builder88);
        org.junit.Assert.assertNotNull(locale89);
        org.junit.Assert.assertEquals(locale89.toString(), "fr_US");
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "" + "'", str90, "");
        org.junit.Assert.assertNotNull(strSet91);
        org.junit.Assert.assertNull(str92);
    }

    @Test
    public void test06511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06511");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("\u30a4\u30bf\u30ea\u30a2", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test06512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06512");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByCharacterType("zho");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.split("", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEach("\ub3c5\uc77c\uc5b4\ub3c5\uc77c)", strArray4, strArray7);
        int int9 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI", strArray7);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray7, '#');
        boolean boolean12 = org.apache.commons.lang3.StringUtils.endsWithAny("rbg", strArray7);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\ub3c5\uc77c\uc5b4\ub3c5\uc77c)" + "'", str8, "\ub3c5\uc77c\uc5b4\ub3c5\uc77c)");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test06513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06513");
        java.util.Locale locale2 = new java.util.Locale("it_IT", "GB");
        org.junit.Assert.assertEquals(locale2.toString(), "it_it_GB");
    }

    @Test
    public void test06514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06514");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal2 = bigDecimal0.negate();
        java.lang.String str3 = bigDecimal0.toString();
        java.math.BigDecimal bigDecimal5 = new java.math.BigDecimal((double) 1L);
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 10, (short) 100 };
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(objArray8, "hi!", (int) (byte) 100, (int) (short) -1);
        boolean boolean13 = bigDecimal5.equals((java.lang.Object) (short) -1);
        java.math.BigDecimal bigDecimal14 = bigDecimal0.max(bigDecimal5);
        java.math.BigDecimal bigDecimal17 = java.math.BigDecimal.valueOf((long) (byte) -1, 0);
        java.math.BigDecimal bigDecimal18 = bigDecimal17.plus();
        java.math.BigDecimal bigDecimal19 = bigDecimal0.remainder(bigDecimal17);
        java.math.BigInteger bigInteger20 = bigDecimal0.toBigIntegerExact();
        java.math.BigDecimal bigDecimal22 = java.math.BigDecimal.valueOf(301L);
        java.math.BigDecimal bigDecimal24 = bigDecimal22.movePointLeft((int) (byte) -1);
        java.lang.String str25 = bigDecimal24.toEngineeringString();
        java.math.BigDecimal bigDecimal26 = bigDecimal0.add(bigDecimal24);
        java.math.BigDecimal bigDecimal27 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal28 = bigDecimal27.negate();
        java.math.BigDecimal bigDecimal29 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal30 = bigDecimal29.negate();
        java.math.BigDecimal bigDecimal31 = bigDecimal29.negate();
        java.lang.String str32 = bigDecimal31.toEngineeringString();
        java.math.BigDecimal bigDecimal33 = bigDecimal28.multiply(bigDecimal31);
        java.math.BigDecimal bigDecimal35 = bigDecimal31.movePointRight(100);
        java.lang.String str36 = bigDecimal31.toEngineeringString();
        java.lang.String str37 = bigDecimal31.toPlainString();
        java.math.BigDecimal bigDecimal38 = bigDecimal31.ulp();
        java.math.BigDecimal bigDecimal39 = java.math.BigDecimal.ONE;
        java.math.BigDecimal bigDecimal40 = bigDecimal39.abs();
        int int41 = bigDecimal40.precision();
        java.math.BigDecimal bigDecimal42 = bigDecimal31.max(bigDecimal40);
        java.math.BigDecimal bigDecimal43 = java.math.BigDecimal.TEN;
        long long44 = bigDecimal43.longValueExact();
        java.math.BigDecimal bigDecimal45 = bigDecimal43.ulp();
        java.lang.String str46 = bigDecimal43.toString();
        java.math.BigDecimal bigDecimal47 = java.math.BigDecimal.TEN;
        long long48 = bigDecimal47.longValueExact();
        java.math.BigDecimal bigDecimal49 = java.math.BigDecimal.ZERO;
        double double50 = bigDecimal49.doubleValue();
        java.math.BigDecimal bigDecimal52 = bigDecimal49.movePointLeft((int) (byte) -1);
        int int53 = bigDecimal52.intValue();
        java.math.BigDecimal bigDecimal54 = bigDecimal47.add(bigDecimal52);
        java.math.BigDecimal bigDecimal55 = bigDecimal43.add(bigDecimal54);
        java.math.BigDecimal bigDecimal56 = bigDecimal40.max(bigDecimal55);
        java.math.MathContext mathContext57 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal58 = bigDecimal26.remainder(bigDecimal56, mathContext57);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0" + "'", str3, "0");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[10, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[10, 100]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bigDecimal14);
        org.junit.Assert.assertNotNull(bigDecimal17);
        org.junit.Assert.assertNotNull(bigDecimal18);
        org.junit.Assert.assertNotNull(bigDecimal19);
        org.junit.Assert.assertNotNull(bigInteger20);
        org.junit.Assert.assertNotNull(bigDecimal22);
        org.junit.Assert.assertNotNull(bigDecimal24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "3010" + "'", str25, "3010");
        org.junit.Assert.assertNotNull(bigDecimal26);
        org.junit.Assert.assertNotNull(bigDecimal27);
        org.junit.Assert.assertNotNull(bigDecimal28);
        org.junit.Assert.assertNotNull(bigDecimal29);
        org.junit.Assert.assertNotNull(bigDecimal30);
        org.junit.Assert.assertNotNull(bigDecimal31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "0" + "'", str32, "0");
        org.junit.Assert.assertNotNull(bigDecimal33);
        org.junit.Assert.assertNotNull(bigDecimal35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "0" + "'", str36, "0");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "0" + "'", str37, "0");
        org.junit.Assert.assertNotNull(bigDecimal38);
        org.junit.Assert.assertNotNull(bigDecimal39);
        org.junit.Assert.assertNotNull(bigDecimal40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertNotNull(bigDecimal42);
        org.junit.Assert.assertNotNull(bigDecimal43);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 10L + "'", long44 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "10" + "'", str46, "10");
        org.junit.Assert.assertNotNull(bigDecimal47);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 10L + "'", long48 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal49);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
        org.junit.Assert.assertNotNull(bigDecimal52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(bigDecimal54);
        org.junit.Assert.assertNotNull(bigDecimal55);
        org.junit.Assert.assertNotNull(bigDecimal56);
    }

    @Test
    public void test06515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06515");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("-1UND0", (int) (short) -16960, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06516");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale.Builder builder1 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale locale3 = builder2.build();
        java.util.Locale.setDefault(category0, locale3);
        java.util.Locale locale5 = java.util.Locale.CANADA;
        java.util.Locale locale6 = java.util.Locale.KOREA;
        java.util.Locale locale7 = locale6.stripExtensions();
        java.lang.String str8 = locale5.getDisplayVariant(locale7);
        java.lang.String str9 = locale7.getDisplayCountry();
        java.util.Locale.setDefault(category0, locale7);
        java.util.Locale locale11 = java.util.Locale.FRANCE;
        java.lang.String str12 = locale7.getDisplayVariant(locale11);
        java.util.Locale locale13 = java.util.Locale.JAPANESE;
        java.util.Locale.setDefault(locale13);
        java.lang.String str15 = locale11.getDisplayVariant(locale13);
        java.util.Locale locale16 = locale11.stripExtensions();
        java.lang.String str17 = locale11.getScript();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Cor\351e du Sud" + "'", str9, "Cor\351e du Sud");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test06517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06517");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal2 = bigDecimal1.abs();
        java.math.BigDecimal bigDecimal4 = bigDecimal1.pow((int) (byte) 1);
        java.math.BigInteger bigInteger5 = bigDecimal4.unscaledValue();
        java.lang.String str7 = bigInteger5.toString((int) '4');
        java.math.BigInteger bigInteger8 = bigInteger5.abs();
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal2);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigInteger5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0" + "'", str7, "0");
        org.junit.Assert.assertNotNull(bigInteger8);
    }

    @Test
    public void test06518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06518");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("             hi!uuu             ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!uuu" + "'", str1, "hi!uuu");
    }

    @Test
    public void test06519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06519");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        double double1 = bigDecimal0.doubleValue();
        java.math.BigInteger bigInteger2 = bigDecimal0.toBigInteger();
        java.math.BigInteger bigInteger4 = bigInteger2.setBit(4);
        double double5 = bigInteger2.doubleValue();
        int int6 = bigInteger2.signum();
        long long7 = bigInteger2.longValue();
        java.lang.Object obj8 = null;
        boolean boolean9 = bigInteger2.equals(obj8);
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(bigInteger2);
        org.junit.Assert.assertNotNull(bigInteger4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test06520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06520");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "\u30a4\u30bf\u30ea\u30a2");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06521");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal5 = bigDecimal1.subtract(bigDecimal4);
        java.math.BigInteger bigInteger6 = bigDecimal5.toBigInteger();
        double double7 = bigInteger6.doubleValue();
        byte[] byteArray10 = new byte[] { (byte) 1 };
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.min(byteArray10);
        java.math.BigInteger bigInteger12 = new java.math.BigInteger((int) (short) -1, byteArray10);
        java.math.BigInteger bigInteger13 = bigInteger6.gcd(bigInteger12);
        java.math.BigInteger bigInteger14 = bigInteger12.negate();
        java.math.BigDecimal bigDecimal15 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal16 = bigDecimal15.negate();
        java.math.BigDecimal bigDecimal19 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal20 = bigDecimal16.subtract(bigDecimal19);
        java.math.BigInteger bigInteger21 = bigDecimal20.toBigInteger();
        double double22 = bigInteger21.doubleValue();
        byte[] byteArray25 = new byte[] { (byte) 1 };
        byte byte26 = org.apache.commons.lang3.math.NumberUtils.min(byteArray25);
        java.math.BigInteger bigInteger27 = new java.math.BigInteger((int) (short) -1, byteArray25);
        java.math.BigInteger bigInteger28 = bigInteger21.gcd(bigInteger27);
        java.math.BigDecimal bigDecimal29 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal30 = bigDecimal29.negate();
        java.math.BigDecimal bigDecimal33 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal34 = bigDecimal30.subtract(bigDecimal33);
        java.math.BigInteger bigInteger35 = bigDecimal34.toBigInteger();
        java.math.BigInteger bigInteger36 = bigInteger27.or(bigInteger35);
        short short37 = bigInteger27.shortValueExact();
        byte[] byteArray40 = new byte[] { (byte) 1 };
        byte byte41 = org.apache.commons.lang3.math.NumberUtils.min(byteArray40);
        java.math.BigInteger bigInteger42 = new java.math.BigInteger((int) (short) -1, byteArray40);
        java.math.BigInteger bigInteger44 = bigInteger42.pow((int) 'a');
        java.math.BigInteger bigInteger46 = bigInteger42.shiftLeft((int) (short) 1);
        java.math.BigInteger bigInteger47 = bigInteger27.xor(bigInteger46);
        java.math.BigInteger bigInteger48 = bigInteger46.not();
        java.math.BigInteger bigInteger49 = bigInteger14.min(bigInteger46);
        java.math.MathContext mathContext51 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal52 = new java.math.BigDecimal(bigInteger14, (int) (short) -16960, mathContext51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[1]");
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 1 + "'", byte11 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger13);
        org.junit.Assert.assertNotNull(bigInteger14);
        org.junit.Assert.assertNotNull(bigDecimal15);
        org.junit.Assert.assertNotNull(bigDecimal16);
        org.junit.Assert.assertNotNull(bigDecimal19);
        org.junit.Assert.assertNotNull(bigDecimal20);
        org.junit.Assert.assertNotNull(bigInteger21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[1]");
        org.junit.Assert.assertTrue("'" + byte26 + "' != '" + (byte) 1 + "'", byte26 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger28);
        org.junit.Assert.assertNotNull(bigDecimal29);
        org.junit.Assert.assertNotNull(bigDecimal30);
        org.junit.Assert.assertNotNull(bigDecimal33);
        org.junit.Assert.assertNotNull(bigDecimal34);
        org.junit.Assert.assertNotNull(bigInteger35);
        org.junit.Assert.assertNotNull(bigInteger36);
        org.junit.Assert.assertTrue("'" + short37 + "' != '" + (short) -1 + "'", short37 == (short) -1);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[1]");
        org.junit.Assert.assertTrue("'" + byte41 + "' != '" + (byte) 1 + "'", byte41 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger44);
        org.junit.Assert.assertNotNull(bigInteger46);
        org.junit.Assert.assertNotNull(bigInteger47);
        org.junit.Assert.assertNotNull(bigInteger48);
        org.junit.Assert.assertNotNull(bigInteger49);
    }

    @Test
    public void test06522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06522");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = builder1.build();
        java.util.Locale.Builder builder3 = builder1.clear();
        java.util.Locale.Builder builder5 = builder1.removeUnicodeLocaleAttribute("CAN");
        java.util.Locale locale6 = builder5.build();
        java.lang.String str7 = locale6.getLanguage();
        java.util.Locale locale10 = new java.util.Locale("JA", "                                                                                                 ");
        java.lang.String str11 = locale6.getDisplayCountry(locale10);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals(locale10.toString(), "ja_                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test06523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06523");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("\u65e5\u672c\u8a9e", "kr", (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06524");
        java.util.Locale locale3 = new java.util.Locale("hi", "hi!uuu", "Korean (South Korea)");
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleKeys();
        java.lang.String str5 = locale3.getISO3Language();
        org.junit.Assert.assertEquals(locale3.toString(), "hi_HI!UUU_Korean (South Korea)");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hin" + "'", str5, "hin");
    }

    @Test
    public void test06525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06525");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "\u30a4\u30bf\u30ea\u30a2\u8a9e     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06526");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "zh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cnzh-cn");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06527");
        java.math.BigDecimal bigDecimal1 = java.math.BigDecimal.valueOf((long) (byte) 0);
        byte byte2 = bigDecimal1.byteValueExact();
        java.math.BigDecimal bigDecimal4 = bigDecimal1.pow(2);
        long long5 = bigDecimal1.longValue();
        java.math.BigDecimal bigDecimal7 = java.math.BigDecimal.valueOf((-2.0d));
        java.math.BigInteger bigInteger8 = bigDecimal7.toBigIntegerExact();
        int int9 = bigDecimal7.scale();
        int int10 = bigDecimal7.scale();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal12 = bigDecimal1.divide(bigDecimal7, (int) (short) 117);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding mode");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(bigDecimal7);
        org.junit.Assert.assertNotNull(bigInteger8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test06528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06528");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("", "fr", 0);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray4);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByCharacterType("zho");
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray7, "ZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZ");
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEach("\uc601\uc5b4\uc601\uad6d)", strArray4, strArray7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray7, "1.00E-95", (-4), (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\uc601\uc5b4\uc601\uad6d)" + "'", str10, "\uc601\uc5b4\uc601\uad6d)");
    }

    @Test
    public void test06529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06529");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("...du Sud");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test06530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06530");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\u30a4\u30bf\u30ea\u30a2\u8a9e", "Korean(SouthKorea)en-cen-cen");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test06531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06531");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setLanguageTag("eng");
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale.Builder builder4 = builder3.clear();
        java.util.Locale.Builder builder5 = builder3.clear();
        java.util.Locale.Builder builder7 = builder5.addUnicodeLocaleAttribute("eng");
        java.util.Locale.Builder builder9 = builder5.setLanguage("CN");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder9.removeUnicodeLocaleAttribute("   0   ");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute:    0    [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test06532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06532");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 100, (short) (byte) -1, (short) -5);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -5 + "'", short3 == (short) -5);
    }

    @Test
    public void test06533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06533");
        java.math.BigDecimal bigDecimal1 = java.math.BigDecimal.valueOf((double) (-1L));
        int int2 = bigDecimal1.precision();
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test06534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06534");
        byte[] byteArray2 = new byte[] { (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.math.BigInteger bigInteger4 = new java.math.BigInteger((int) (short) -1, byteArray2);
        java.math.BigInteger bigInteger6 = bigInteger4.pow((int) 'a');
        java.math.BigInteger bigInteger8 = bigInteger4.shiftLeft((int) (short) 1);
        java.math.BigInteger bigInteger10 = bigInteger8.flipBit(1);
        java.math.BigInteger bigInteger11 = bigInteger8.abs();
        java.math.BigInteger bigInteger13 = bigInteger11.setBit((int) (byte) 0);
        java.math.BigInteger bigInteger14 = bigInteger13.abs();
        java.math.BigDecimal bigDecimal15 = new java.math.BigDecimal(bigInteger14);
        java.math.BigDecimal bigDecimal17 = new java.math.BigDecimal(120);
        java.math.BigDecimal bigDecimal20 = java.math.BigDecimal.valueOf((long) (byte) -1, 0);
        java.math.BigDecimal bigDecimal21 = bigDecimal20.plus();
        java.math.BigDecimal bigDecimal22 = bigDecimal17.multiply(bigDecimal21);
        java.math.BigDecimal bigDecimal23 = java.math.BigDecimal.TEN;
        long long24 = bigDecimal23.longValueExact();
        java.math.BigDecimal bigDecimal25 = bigDecimal23.ulp();
        java.lang.String str26 = bigDecimal23.toString();
        java.math.BigDecimal bigDecimal27 = java.math.BigDecimal.TEN;
        long long28 = bigDecimal27.longValueExact();
        java.math.BigDecimal bigDecimal29 = java.math.BigDecimal.ZERO;
        double double30 = bigDecimal29.doubleValue();
        java.math.BigDecimal bigDecimal32 = bigDecimal29.movePointLeft((int) (byte) -1);
        int int33 = bigDecimal32.intValue();
        java.math.BigDecimal bigDecimal34 = bigDecimal27.add(bigDecimal32);
        java.math.BigDecimal bigDecimal35 = bigDecimal23.add(bigDecimal34);
        java.math.BigDecimal bigDecimal37 = bigDecimal35.pow((int) '#');
        int int38 = bigDecimal17.compareTo(bigDecimal35);
        java.math.BigDecimal bigDecimal40 = new java.math.BigDecimal((int) (short) -2);
        java.math.BigDecimal bigDecimal41 = bigDecimal40.plus();
        java.math.BigDecimal bigDecimal42 = bigDecimal35.min(bigDecimal40);
        java.math.BigInteger bigInteger43 = bigDecimal42.toBigIntegerExact();
        java.math.BigDecimal bigDecimal44 = bigDecimal42.abs();
        java.math.MathContext mathContext45 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal46 = bigDecimal15.subtract(bigDecimal44, mathContext45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertNotNull(bigInteger8);
        org.junit.Assert.assertNotNull(bigInteger10);
        org.junit.Assert.assertNotNull(bigInteger11);
        org.junit.Assert.assertNotNull(bigInteger13);
        org.junit.Assert.assertNotNull(bigInteger14);
        org.junit.Assert.assertNotNull(bigDecimal20);
        org.junit.Assert.assertNotNull(bigDecimal21);
        org.junit.Assert.assertNotNull(bigDecimal22);
        org.junit.Assert.assertNotNull(bigDecimal23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 10L + "'", long24 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "10" + "'", str26, "10");
        org.junit.Assert.assertNotNull(bigDecimal27);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 10L + "'", long28 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertNotNull(bigDecimal32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(bigDecimal34);
        org.junit.Assert.assertNotNull(bigDecimal35);
        org.junit.Assert.assertNotNull(bigDecimal37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertNotNull(bigDecimal41);
        org.junit.Assert.assertNotNull(bigDecimal42);
        org.junit.Assert.assertNotNull(bigInteger43);
        org.junit.Assert.assertNotNull(bigDecimal44);
    }

    @Test
    public void test06535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06535");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "ENGLISH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test06536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06536");
        byte[] byteArray2 = new byte[] { (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.math.BigInteger bigInteger4 = new java.math.BigInteger((int) (short) -1, byteArray2);
        java.math.BigInteger bigInteger6 = bigInteger4.pow((int) 'a');
        java.math.BigDecimal bigDecimal7 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal8 = bigDecimal7.negate();
        java.math.BigDecimal bigDecimal11 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal12 = bigDecimal8.subtract(bigDecimal11);
        java.math.BigInteger bigInteger13 = bigDecimal12.toBigInteger();
        double double14 = bigInteger13.doubleValue();
        byte[] byteArray17 = new byte[] { (byte) 1 };
        byte byte18 = org.apache.commons.lang3.math.NumberUtils.min(byteArray17);
        java.math.BigInteger bigInteger19 = new java.math.BigInteger((int) (short) -1, byteArray17);
        java.math.BigInteger bigInteger20 = bigInteger13.gcd(bigInteger19);
        java.math.BigDecimal bigDecimal21 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal22 = bigDecimal21.negate();
        java.math.BigDecimal bigDecimal25 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal26 = bigDecimal22.subtract(bigDecimal25);
        java.math.BigInteger bigInteger27 = bigDecimal26.toBigInteger();
        java.math.BigInteger bigInteger28 = bigInteger19.or(bigInteger27);
        java.math.BigInteger bigInteger29 = bigInteger6.min(bigInteger28);
        java.math.BigDecimal bigDecimal30 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal31 = bigDecimal30.negate();
        java.math.BigDecimal bigDecimal34 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal35 = bigDecimal31.subtract(bigDecimal34);
        java.math.BigInteger bigInteger36 = bigDecimal35.toBigInteger();
        java.math.BigInteger bigInteger37 = bigInteger36.negate();
        java.math.BigInteger bigInteger38 = bigInteger29.multiply(bigInteger36);
        int int39 = bigInteger36.getLowestSetBit();
        long long40 = bigInteger36.longValue();
        long long41 = bigInteger36.longValue();
        int int42 = bigInteger36.signum();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertNotNull(bigDecimal7);
        org.junit.Assert.assertNotNull(bigDecimal8);
        org.junit.Assert.assertNotNull(bigDecimal11);
        org.junit.Assert.assertNotNull(bigDecimal12);
        org.junit.Assert.assertNotNull(bigInteger13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[1]");
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) 1 + "'", byte18 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger20);
        org.junit.Assert.assertNotNull(bigDecimal21);
        org.junit.Assert.assertNotNull(bigDecimal22);
        org.junit.Assert.assertNotNull(bigDecimal25);
        org.junit.Assert.assertNotNull(bigDecimal26);
        org.junit.Assert.assertNotNull(bigInteger27);
        org.junit.Assert.assertNotNull(bigInteger28);
        org.junit.Assert.assertNotNull(bigInteger29);
        org.junit.Assert.assertNotNull(bigDecimal30);
        org.junit.Assert.assertNotNull(bigDecimal31);
        org.junit.Assert.assertNotNull(bigDecimal34);
        org.junit.Assert.assertNotNull(bigDecimal35);
        org.junit.Assert.assertNotNull(bigInteger36);
        org.junit.Assert.assertNotNull(bigInteger37);
        org.junit.Assert.assertNotNull(bigInteger38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test06537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06537");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IHXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "iH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IHXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX" + "'", str1, "iH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IHXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
    }

    @Test
    public void test06538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06538");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("     zh-cn", "ita", (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06539");
        java.util.Locale locale1 = java.util.Locale.FRANCE;
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!", locale1);
        java.lang.String str3 = locale1.getCountry();
        java.lang.String str4 = locale1.getVariant();
        java.util.Locale locale5 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str6 = locale1.getDisplayLanguage(locale5);
        java.lang.String str7 = locale1.getISO3Country();
        java.util.Set<java.lang.Character> charSet8 = locale1.getExtensionKeys();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!!" + "'", str2, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "FR" + "'", str3, "FR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u6cd5\u6587" + "'", str6, "\u6cd5\u6587");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "FRA" + "'", str7, "FRA");
        org.junit.Assert.assertNotNull(charSet8);
    }

    @Test
    public void test06540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06540");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setLanguageTag("eng");
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale.Builder builder4 = builder2.clear();
        java.util.Locale.Builder builder5 = builder2.clearExtensions();
        java.util.Locale.Builder builder7 = builder2.setRegion("");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test06541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06541");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("South Korea", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06542");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(6L, 0L, (long) '#');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
    }

    @Test
    public void test06543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06543");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal5 = bigDecimal1.subtract(bigDecimal4);
        java.math.BigInteger bigInteger6 = bigDecimal5.toBigInteger();
        java.math.BigDecimal bigDecimal7 = bigDecimal5.negate();
        java.math.BigDecimal bigDecimal9 = bigDecimal7.scaleByPowerOfTen(301);
        double double10 = bigDecimal7.doubleValue();
        java.math.BigInteger bigInteger11 = bigDecimal7.toBigInteger();
        java.math.BigDecimal bigDecimal13 = bigDecimal7.movePointLeft((int) (short) 1);
        java.math.BigDecimal bigDecimal15 = bigDecimal7.scaleByPowerOfTen((int) 'u');
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertNotNull(bigDecimal7);
        org.junit.Assert.assertNotNull(bigDecimal9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-98d + "'", double10 == 1.0E-98d);
        org.junit.Assert.assertNotNull(bigInteger11);
        org.junit.Assert.assertNotNull(bigDecimal13);
        org.junit.Assert.assertNotNull(bigDecimal15);
    }

    @Test
    public void test06544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06544");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                                         French (France)                                         ", 'u');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                         French (France)                                         " + "'", str2, "                                         French (France)                                         ");
    }

    @Test
    public void test06545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06545");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "xxxxxxxxxxxxxxxxxxxxxxxxxxxen-ca");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06546");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal5 = bigDecimal1.subtract(bigDecimal4);
        java.math.BigInteger bigInteger6 = bigDecimal5.toBigInteger();
        java.math.BigDecimal bigDecimal7 = bigDecimal5.negate();
        java.lang.String str8 = bigDecimal7.toString();
        java.math.BigDecimal bigDecimal9 = bigDecimal7.stripTrailingZeros();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger10 = bigDecimal7.toBigIntegerExact();
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Rounding necessary");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertNotNull(bigDecimal7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1.00E-98" + "'", str8, "1.00E-98");
        org.junit.Assert.assertNotNull(bigDecimal9);
    }

    @Test
    public void test06547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06547");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("fr-FR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "fr-FR" + "'", str1, "fr-FR");
    }

    @Test
    public void test06548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06548");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("eNGLISCH (vEREINIGTES k\326NIGREICH)", "\u7f8e\u56fd\u7f8e\u56fd\u7f8e\u56fd", "\u82f1\u6587");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test06549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06549");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("ENG                                                                                                                                                                                                                                                                                                          ", "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ENG                                                                                                                                                                                                                                                                                                          " + "'", str2, "ENG                                                                                                                                                                                                                                                                                                          ");
    }

    @Test
    public void test06550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06550");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06551");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("zh-CN", strMap1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList2, "englisch");
        java.util.Locale.LanguageRange[] languageRangeArray5 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList6 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList6, languageRangeArray5);
        java.util.Locale locale9 = java.util.Locale.getDefault();
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.lowerCase("", locale9);
        java.util.Locale.setDefault(locale9);
        java.util.Locale locale13 = java.util.Locale.getDefault();
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.lowerCase("", locale13);
        java.util.Locale.setDefault(locale13);
        java.util.Locale locale16 = java.util.Locale.KOREA;
        java.util.Locale locale17 = locale16.stripExtensions();
        java.util.Locale locale19 = java.util.Locale.FRANCE;
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.upperCase("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!", locale19);
        java.util.Locale locale21 = java.util.Locale.getDefault();
        java.lang.String str22 = locale21.getDisplayLanguage();
        java.util.Locale locale24 = java.util.Locale.getDefault();
        java.lang.String str25 = org.apache.commons.lang3.StringUtils.upperCase("", locale24);
        java.util.Locale locale26 = java.util.Locale.GERMANY;
        java.util.Locale locale27 = java.util.Locale.GERMANY;
        java.util.Locale locale28 = java.util.Locale.GERMANY;
        java.lang.String str29 = locale28.getVariant();
        java.util.Locale locale30 = java.util.Locale.KOREA;
        java.util.Locale locale31 = locale30.stripExtensions();
        java.util.Locale locale32 = java.util.Locale.KOREA;
        java.util.Locale locale33 = locale32.stripExtensions();
        java.util.Locale locale34 = java.util.Locale.KOREA;
        java.util.Locale locale35 = java.util.Locale.PRC;
        java.util.Locale locale36 = java.util.Locale.KOREA;
        java.lang.String str37 = locale36.getScript();
        java.util.Locale locale38 = java.util.Locale.GERMANY;
        java.util.Locale[] localeArray39 = new java.util.Locale[] { locale9, locale13, locale16, locale19, locale21, locale24, locale26, locale27, locale28, locale30, locale33, locale34, locale35, locale36, locale38 };
        java.util.ArrayList<java.util.Locale> localeList40 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList40, localeArray39);
        java.util.Locale.FilteringMode filteringMode42 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList43 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList6, (java.util.Collection<java.util.Locale>) localeList40, filteringMode42);
        java.util.Locale locale44 = java.util.Locale.lookup(languageRangeList2, (java.util.Collection<java.util.Locale>) localeList40);
        java.util.Locale locale46 = new java.util.Locale("");
        java.lang.String str47 = locale46.getVariant();
        java.util.Locale locale48 = java.util.Locale.TAIWAN;
        java.lang.String str49 = locale46.getDisplayScript(locale48);
        java.util.Set<java.lang.String> strSet50 = locale46.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.String> strSet51 = locale46.getUnicodeLocaleAttributes();
        java.lang.String str52 = locale44.getDisplayName(locale46);
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!!" + "'", str20, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!!");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\u65e5\u672c\u8a9e" + "'", str22, "\u65e5\u672c\u8a9e");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "de_DE");
        org.junit.Assert.assertNotNull(localeArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + filteringMode42 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode42.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList43);
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "zh_CN");
        org.junit.Assert.assertEquals(locale46.toString(), "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNotNull(strSet50);
        org.junit.Assert.assertNotNull(strSet51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "Chinese (China)" + "'", str52, "Chinese (China)");
    }

    @Test
    public void test06552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06552");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) -2, (byte) -2, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -2 + "'", byte3 == (byte) -2);
    }

    @Test
    public void test06553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06553");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale.Builder builder1 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale locale3 = builder2.build();
        java.util.Locale.setDefault(category0, locale3);
        java.util.Locale locale5 = java.util.Locale.CANADA;
        java.util.Locale locale6 = java.util.Locale.KOREA;
        java.util.Locale locale7 = locale6.stripExtensions();
        java.lang.String str8 = locale5.getDisplayVariant(locale7);
        java.lang.String str9 = locale7.getDisplayCountry();
        java.util.Locale.setDefault(category0, locale7);
        java.util.Locale locale11 = java.util.Locale.FRANCE;
        java.lang.String str12 = locale7.getDisplayVariant(locale11);
        java.util.Locale locale13 = java.util.Locale.JAPANESE;
        java.util.Locale.setDefault(locale13);
        java.lang.String str15 = locale11.getDisplayVariant(locale13);
        java.lang.String str17 = locale13.getExtension('a');
        java.util.Locale locale19 = new java.util.Locale("\u6587");
        java.lang.String str20 = locale13.getDisplayLanguage(locale19);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u5927\u97d3\u6c11\u56fd" + "'", str9, "\u5927\u97d3\u6c11\u56fd");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals(locale19.toString(), "\u6587");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Japanese" + "'", str20, "Japanese");
    }

    @Test
    public void test06554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06554");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("KR                               ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "KR" + "'", str1, "KR");
    }

    @Test
    public void test06555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06555");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("frz-C ", (int) (short) 35, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "frz-C aaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "frz-C aaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test06556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06556");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 0, (byte) 34, (byte) -33);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -33 + "'", byte3 == (byte) -33);
    }

    @Test
    public void test06557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06557");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal5 = bigDecimal1.subtract(bigDecimal4);
        java.math.BigInteger bigInteger6 = bigDecimal5.toBigInteger();
        double double7 = bigInteger6.doubleValue();
        byte[] byteArray10 = new byte[] { (byte) 1 };
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.min(byteArray10);
        java.math.BigInteger bigInteger12 = new java.math.BigInteger((int) (short) -1, byteArray10);
        java.math.BigInteger bigInteger13 = bigInteger6.gcd(bigInteger12);
        java.math.BigDecimal bigDecimal14 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal15 = bigDecimal14.negate();
        java.math.BigDecimal bigDecimal18 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal19 = bigDecimal15.subtract(bigDecimal18);
        java.math.BigInteger bigInteger20 = bigDecimal19.toBigInteger();
        java.math.BigInteger bigInteger21 = bigInteger12.or(bigInteger20);
        short short22 = bigInteger12.shortValueExact();
        boolean boolean24 = bigInteger12.testBit((int) (short) 0);
        int int25 = bigInteger12.bitCount();
        java.lang.String str27 = bigInteger12.toString((int) (short) 10);
        int int28 = bigInteger12.intValueExact();
        java.math.BigDecimal bigDecimal29 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal30 = bigDecimal29.negate();
        java.math.BigDecimal bigDecimal33 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal34 = bigDecimal30.subtract(bigDecimal33);
        java.math.BigInteger bigInteger35 = bigDecimal34.toBigInteger();
        byte[] byteArray36 = bigInteger35.toByteArray();
        java.math.BigDecimal bigDecimal37 = java.math.BigDecimal.ZERO;
        double double38 = bigDecimal37.doubleValue();
        java.math.BigInteger bigInteger39 = bigDecimal37.toBigInteger();
        byte[] byteArray42 = new byte[] { (byte) 1 };
        byte byte43 = org.apache.commons.lang3.math.NumberUtils.min(byteArray42);
        java.math.BigInteger bigInteger44 = new java.math.BigInteger((int) (short) -1, byteArray42);
        java.math.BigInteger bigInteger46 = bigInteger44.pow((int) 'a');
        byte[] byteArray47 = bigInteger44.toByteArray();
        long long48 = bigInteger44.longValueExact();
        java.math.BigInteger bigInteger49 = bigInteger39.or(bigInteger44);
        byte byte50 = bigInteger44.byteValueExact();
        java.math.BigDecimal bigDecimal52 = new java.math.BigDecimal(bigInteger44, (int) (byte) 0);
        java.math.BigInteger bigInteger54 = bigInteger44.setBit(7);
        java.math.BigInteger bigInteger56 = bigInteger44.clearBit((int) (byte) 1);
        java.math.BigInteger bigInteger57 = bigInteger35.remainder(bigInteger44);
        long long58 = bigInteger44.longValueExact();
        byte[] byteArray60 = new byte[] { (byte) 1 };
        byte byte61 = org.apache.commons.lang3.math.NumberUtils.min(byteArray60);
        java.math.BigInteger bigInteger62 = new java.math.BigInteger(byteArray60);
        java.math.BigDecimal bigDecimal63 = new java.math.BigDecimal(bigInteger62);
        boolean boolean64 = bigInteger44.equals((java.lang.Object) bigDecimal63);
        java.math.BigInteger bigInteger65 = bigInteger12.add(bigInteger44);
        java.math.BigInteger bigInteger67 = bigInteger12.shiftRight(320);
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[1]");
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 1 + "'", byte11 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger13);
        org.junit.Assert.assertNotNull(bigDecimal14);
        org.junit.Assert.assertNotNull(bigDecimal15);
        org.junit.Assert.assertNotNull(bigDecimal18);
        org.junit.Assert.assertNotNull(bigDecimal19);
        org.junit.Assert.assertNotNull(bigInteger20);
        org.junit.Assert.assertNotNull(bigInteger21);
        org.junit.Assert.assertTrue("'" + short22 + "' != '" + (short) -1 + "'", short22 == (short) -1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "-1" + "'", str27, "-1");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(bigDecimal29);
        org.junit.Assert.assertNotNull(bigDecimal30);
        org.junit.Assert.assertNotNull(bigDecimal33);
        org.junit.Assert.assertNotNull(bigDecimal34);
        org.junit.Assert.assertNotNull(bigInteger35);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[0]");
        org.junit.Assert.assertNotNull(bigDecimal37);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertNotNull(bigInteger39);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[1]");
        org.junit.Assert.assertTrue("'" + byte43 + "' != '" + (byte) 1 + "'", byte43 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger46);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray47), "[-1]");
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + (-1L) + "'", long48 == (-1L));
        org.junit.Assert.assertNotNull(bigInteger49);
        org.junit.Assert.assertTrue("'" + byte50 + "' != '" + (byte) -1 + "'", byte50 == (byte) -1);
        org.junit.Assert.assertNotNull(bigInteger54);
        org.junit.Assert.assertNotNull(bigInteger56);
        org.junit.Assert.assertNotNull(bigInteger57);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + (-1L) + "'", long58 == (-1L));
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray60), "[1]");
        org.junit.Assert.assertTrue("'" + byte61 + "' != '" + (byte) 1 + "'", byte61 == (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(bigInteger65);
        org.junit.Assert.assertNotNull(bigInteger67);
    }

    @Test
    public void test06558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06558");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                                    ", (int) 'x', "\u82f1\u6587\u82f1\u56fd");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u82f1\u6587\u82f1\u56fd\u82f1\u6587\u82f1\u56fd\u82f1\u6587\u82f1\u56fd\u82f1\u6587\u82f1\u56fd\u82f1\u6587\u82f1\u56fd\u82f1\u6587\u82f1\u56fd\u82f1\u6587\u82f1\u56fd\u82f1\u6587                                                    " + "'", str3, "\u82f1\u6587\u82f1\u56fd\u82f1\u6587\u82f1\u56fd\u82f1\u6587\u82f1\u56fd\u82f1\u6587\u82f1\u56fd\u82f1\u6587\u82f1\u56fd\u82f1\u6587\u82f1\u56fd\u82f1\u6587\u82f1\u56fd\u82f1\u6587                                                    ");
    }

    @Test
    public void test06559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06559");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("        fR", "   chinois");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06560");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("TWN", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "TWN                                                                                                 " + "'", str2, "TWN                                                                                                 ");
    }

    @Test
    public void test06561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06561");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "de_DE");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test06562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06562");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("Japanisch");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test06563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06563");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal5 = bigDecimal1.subtract(bigDecimal4);
        java.math.BigInteger bigInteger6 = bigDecimal5.toBigInteger();
        java.math.BigDecimal bigDecimal7 = new java.math.BigDecimal(bigInteger6);
        java.math.BigDecimal bigDecimal8 = java.math.BigDecimal.ZERO;
        double double9 = bigDecimal8.doubleValue();
        java.math.BigInteger bigInteger10 = bigDecimal8.toBigInteger();
        byte[] byteArray13 = new byte[] { (byte) 1 };
        byte byte14 = org.apache.commons.lang3.math.NumberUtils.min(byteArray13);
        java.math.BigInteger bigInteger15 = new java.math.BigInteger((int) (short) -1, byteArray13);
        java.math.BigInteger bigInteger17 = bigInteger15.pow((int) 'a');
        byte[] byteArray18 = bigInteger15.toByteArray();
        long long19 = bigInteger15.longValueExact();
        java.math.BigInteger bigInteger20 = bigInteger10.or(bigInteger15);
        byte[] byteArray23 = new byte[] { (byte) 1 };
        byte byte24 = org.apache.commons.lang3.math.NumberUtils.min(byteArray23);
        java.math.BigInteger bigInteger25 = new java.math.BigInteger((int) (short) -1, byteArray23);
        java.math.BigInteger bigInteger27 = bigInteger25.pow((int) 'a');
        byte[] byteArray28 = bigInteger25.toByteArray();
        long long29 = bigInteger25.longValueExact();
        java.lang.String str31 = bigInteger25.toString(0);
        int int32 = bigInteger25.intValueExact();
        java.math.BigInteger bigInteger33 = bigInteger20.subtract(bigInteger25);
        java.math.BigDecimal bigDecimal34 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal35 = bigDecimal34.negate();
        java.math.BigDecimal bigDecimal38 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal39 = bigDecimal35.subtract(bigDecimal38);
        java.math.BigInteger bigInteger40 = bigDecimal39.toBigInteger();
        java.math.BigInteger bigInteger41 = bigInteger40.negate();
        java.math.BigDecimal bigDecimal42 = java.math.BigDecimal.ZERO;
        double double43 = bigDecimal42.doubleValue();
        java.math.BigInteger bigInteger44 = bigDecimal42.toBigInteger();
        byte[] byteArray47 = new byte[] { (byte) 1 };
        byte byte48 = org.apache.commons.lang3.math.NumberUtils.min(byteArray47);
        java.math.BigInteger bigInteger49 = new java.math.BigInteger((int) (short) -1, byteArray47);
        java.math.BigInteger bigInteger51 = bigInteger49.pow((int) 'a');
        byte[] byteArray52 = bigInteger49.toByteArray();
        long long53 = bigInteger49.longValueExact();
        java.math.BigInteger bigInteger54 = bigInteger44.or(bigInteger49);
        byte[] byteArray57 = new byte[] { (byte) 1 };
        byte byte58 = org.apache.commons.lang3.math.NumberUtils.min(byteArray57);
        java.math.BigInteger bigInteger59 = new java.math.BigInteger((int) (short) -1, byteArray57);
        java.math.BigInteger bigInteger61 = bigInteger59.pow((int) 'a');
        byte[] byteArray62 = bigInteger59.toByteArray();
        long long63 = bigInteger59.longValueExact();
        java.lang.String str65 = bigInteger59.toString(0);
        int int66 = bigInteger59.intValueExact();
        java.math.BigInteger bigInteger67 = bigInteger54.subtract(bigInteger59);
        java.math.BigInteger bigInteger68 = bigInteger40.min(bigInteger54);
        java.math.BigInteger bigInteger69 = bigInteger33.gcd(bigInteger68);
        int int70 = bigInteger33.bitLength();
        java.math.BigInteger bigInteger71 = bigInteger6.andNot(bigInteger33);
        java.math.BigInteger bigInteger72 = bigInteger6.not();
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertNotNull(bigDecimal8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(bigInteger10);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[1]");
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) 1 + "'", byte14 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger17);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[-1]");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
        org.junit.Assert.assertNotNull(bigInteger20);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[1]");
        org.junit.Assert.assertTrue("'" + byte24 + "' != '" + (byte) 1 + "'", byte24 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger27);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[-1]");
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-1L) + "'", long29 == (-1L));
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "-1" + "'", str31, "-1");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(bigInteger33);
        org.junit.Assert.assertNotNull(bigDecimal34);
        org.junit.Assert.assertNotNull(bigDecimal35);
        org.junit.Assert.assertNotNull(bigDecimal38);
        org.junit.Assert.assertNotNull(bigDecimal39);
        org.junit.Assert.assertNotNull(bigInteger40);
        org.junit.Assert.assertNotNull(bigInteger41);
        org.junit.Assert.assertNotNull(bigDecimal42);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertNotNull(bigInteger44);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray47), "[1]");
        org.junit.Assert.assertTrue("'" + byte48 + "' != '" + (byte) 1 + "'", byte48 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger51);
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray52), "[-1]");
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + (-1L) + "'", long53 == (-1L));
        org.junit.Assert.assertNotNull(bigInteger54);
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray57), "[1]");
        org.junit.Assert.assertTrue("'" + byte58 + "' != '" + (byte) 1 + "'", byte58 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger61);
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray62), "[-1]");
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + (-1L) + "'", long63 == (-1L));
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "-1" + "'", str65, "-1");
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertNotNull(bigInteger67);
        org.junit.Assert.assertNotNull(bigInteger68);
        org.junit.Assert.assertNotNull(bigInteger69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertNotNull(bigInteger71);
        org.junit.Assert.assertNotNull(bigInteger72);
    }

    @Test
    public void test06564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06564");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", "hI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI", (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06565");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih", (double) (-10L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=-10.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06566");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("                              ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test06567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06567");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("en_US", 'a');
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "h");
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("en_US", 'a');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray9);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEach("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!", strArray4, strArray9);
        int int12 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("orean###", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "en_US" + "'", str10, "en_US");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!" + "'", str11, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test06568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06568");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        double double1 = bigDecimal0.doubleValue();
        java.math.BigDecimal bigDecimal3 = bigDecimal0.movePointLeft((int) (byte) -1);
        int int4 = bigDecimal3.intValue();
        java.math.BigDecimal bigDecimal5 = bigDecimal3.stripTrailingZeros();
        java.math.MathContext mathContext6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal7 = bigDecimal5.abs(mathContext6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(bigDecimal3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(bigDecimal5);
    }

    @Test
    public void test06569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06569");
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        java.util.Locale locale1 = java.util.Locale.PRC;
        java.util.Locale locale2 = null;
        java.lang.String str3 = locale1.getDisplayScript(locale2);
        java.lang.String str4 = locale1.getCountry();
        java.lang.String str5 = locale0.getDisplayLanguage(locale1);
        java.lang.String str6 = locale0.getCountry();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CN" + "'", str4, "CN");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u4e2d\u6587" + "'", str5, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "TW" + "'", str6, "TW");
    }

    @Test
    public void test06570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06570");
        java.util.Locale locale1 = java.util.Locale.UK;
        java.lang.String str2 = locale1.getDisplayName();
        java.util.Locale locale3 = java.util.Locale.GERMANY;
        java.lang.String str4 = locale3.getVariant();
        java.lang.String str5 = locale3.getDisplayScript();
        java.lang.String str6 = locale1.getDisplayCountry(locale3);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.lowerCase("hI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIhi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!", locale3);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_GB");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9)" + "'", str2, "\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9)");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Vereinigtes K\366nigreich" + "'", str6, "Vereinigtes K\366nigreich");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!" + "'", str7, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!");
    }

    @Test
    public void test06571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06571");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9)UnitedxStates", "en-CA");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("engcn");
        int int8 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("it_IT!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih", strArray7);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEach("China", strArray4, strArray7);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.endsWithAny("VEREINIGTES KONIGREICH", strArray7);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "China" + "'", str9, "China");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test06572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06572");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("\u97e9\u56fd", "anglais");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u97e9\u56fd" + "'", str2, "\u97e9\u56fd");
    }

    @Test
    public void test06573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06573");
        short[] shortArray5 = new short[] { (byte) -1, (byte) 100, (byte) 10, (short) 0, (short) 0 };
        short short6 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        short short7 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        short short8 = org.apache.commons.lang3.math.NumberUtils.min(shortArray5);
        short short9 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        short short10 = org.apache.commons.lang3.math.NumberUtils.min(shortArray5);
        short short11 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[-1, 100, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 100 + "'", short7 == (short) 100);
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) -1 + "'", short8 == (short) -1);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 100 + "'", short9 == (short) 100);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) -1 + "'", short10 == (short) -1);
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 100 + "'", short11 == (short) 100);
    }

    @Test
    public void test06574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06574");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("hi", "en", 0);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "\ud504\ub791", 3, (int) (short) -2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test06575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06575");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal2 = bigDecimal0.movePointLeft((int) (byte) 0);
        java.math.BigDecimal bigDecimal3 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal4 = bigDecimal3.negate();
        java.math.BigDecimal bigDecimal5 = java.math.BigDecimal.ONE;
        java.math.BigDecimal bigDecimal6 = bigDecimal4.min(bigDecimal5);
        java.math.BigDecimal bigDecimal7 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal8 = bigDecimal7.negate();
        java.math.BigDecimal bigDecimal11 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal12 = bigDecimal8.subtract(bigDecimal11);
        java.math.BigDecimal[] bigDecimalArray13 = bigDecimal5.divideAndRemainder(bigDecimal11);
        java.math.BigDecimal bigDecimal14 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal15 = bigDecimal14.negate();
        java.math.BigDecimal bigDecimal18 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal19 = bigDecimal15.subtract(bigDecimal18);
        java.math.BigDecimal bigDecimal20 = java.math.BigDecimal.TEN;
        java.math.BigDecimal bigDecimal21 = bigDecimal18.min(bigDecimal20);
        java.math.BigDecimal bigDecimal22 = bigDecimal11.divideToIntegralValue(bigDecimal21);
        java.math.BigDecimal bigDecimal23 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal24 = bigDecimal23.negate();
        java.math.BigDecimal bigDecimal25 = java.math.BigDecimal.TEN;
        long long26 = bigDecimal25.longValueExact();
        java.math.BigDecimal bigDecimal27 = bigDecimal25.ulp();
        java.lang.String str28 = bigDecimal25.toString();
        int int29 = bigDecimal23.compareTo(bigDecimal25);
        java.math.BigInteger bigInteger30 = bigDecimal23.toBigInteger();
        java.math.BigDecimal bigDecimal31 = bigDecimal23.ulp();
        java.math.BigDecimal bigDecimal32 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal33 = bigDecimal32.negate();
        java.math.BigDecimal bigDecimal34 = java.math.BigDecimal.ONE;
        java.math.BigDecimal bigDecimal35 = bigDecimal33.min(bigDecimal34);
        int int36 = bigDecimal23.compareTo(bigDecimal35);
        int int37 = bigDecimal22.compareTo(bigDecimal35);
        java.math.BigDecimal bigDecimal39 = java.math.BigDecimal.valueOf((long) (byte) 0);
        byte byte40 = bigDecimal39.byteValueExact();
        java.math.BigDecimal bigDecimal42 = bigDecimal39.pow(2);
        java.math.BigDecimal bigDecimal43 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal44 = bigDecimal43.negate();
        java.math.BigDecimal bigDecimal45 = java.math.BigDecimal.TEN;
        long long46 = bigDecimal45.longValueExact();
        java.math.BigDecimal bigDecimal47 = bigDecimal45.ulp();
        java.lang.String str48 = bigDecimal45.toString();
        int int49 = bigDecimal43.compareTo(bigDecimal45);
        java.math.BigDecimal bigDecimal51 = java.math.BigDecimal.valueOf((long) (byte) 100);
        java.math.BigDecimal bigDecimal53 = bigDecimal45.divide(bigDecimal51, (int) (short) 1);
        java.math.BigDecimal bigDecimal54 = bigDecimal42.add(bigDecimal45);
        java.math.BigDecimal bigDecimal55 = bigDecimal35.divideToIntegralValue(bigDecimal45);
        java.math.BigDecimal bigDecimal56 = bigDecimal0.max(bigDecimal55);
        java.math.BigDecimal bigDecimal57 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal59 = bigDecimal57.movePointLeft((int) (byte) 0);
        java.math.BigDecimal bigDecimal60 = bigDecimal57.abs();
        float float61 = bigDecimal60.floatValue();
        java.math.BigDecimal bigDecimal62 = bigDecimal60.stripTrailingZeros();
        java.lang.String str63 = bigDecimal62.toString();
        java.math.MathContext mathContext64 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal65 = bigDecimal55.divideToIntegralValue(bigDecimal62, mathContext64);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal2);
        org.junit.Assert.assertNotNull(bigDecimal3);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigDecimal6);
        org.junit.Assert.assertNotNull(bigDecimal7);
        org.junit.Assert.assertNotNull(bigDecimal8);
        org.junit.Assert.assertNotNull(bigDecimal11);
        org.junit.Assert.assertNotNull(bigDecimal12);
        org.junit.Assert.assertNotNull(bigDecimalArray13);
        org.junit.Assert.assertNotNull(bigDecimal14);
        org.junit.Assert.assertNotNull(bigDecimal15);
        org.junit.Assert.assertNotNull(bigDecimal18);
        org.junit.Assert.assertNotNull(bigDecimal19);
        org.junit.Assert.assertNotNull(bigDecimal20);
        org.junit.Assert.assertNotNull(bigDecimal21);
        org.junit.Assert.assertNotNull(bigDecimal22);
        org.junit.Assert.assertNotNull(bigDecimal23);
        org.junit.Assert.assertNotNull(bigDecimal24);
        org.junit.Assert.assertNotNull(bigDecimal25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 10L + "'", long26 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "10" + "'", str28, "10");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(bigInteger30);
        org.junit.Assert.assertNotNull(bigDecimal31);
        org.junit.Assert.assertNotNull(bigDecimal32);
        org.junit.Assert.assertNotNull(bigDecimal33);
        org.junit.Assert.assertNotNull(bigDecimal34);
        org.junit.Assert.assertNotNull(bigDecimal35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNotNull(bigDecimal39);
        org.junit.Assert.assertTrue("'" + byte40 + "' != '" + (byte) 0 + "'", byte40 == (byte) 0);
        org.junit.Assert.assertNotNull(bigDecimal42);
        org.junit.Assert.assertNotNull(bigDecimal43);
        org.junit.Assert.assertNotNull(bigDecimal44);
        org.junit.Assert.assertNotNull(bigDecimal45);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 10L + "'", long46 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "10" + "'", str48, "10");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNotNull(bigDecimal51);
        org.junit.Assert.assertNotNull(bigDecimal53);
        org.junit.Assert.assertNotNull(bigDecimal54);
        org.junit.Assert.assertNotNull(bigDecimal55);
        org.junit.Assert.assertNotNull(bigDecimal56);
        org.junit.Assert.assertNotNull(bigDecimal57);
        org.junit.Assert.assertNotNull(bigDecimal59);
        org.junit.Assert.assertNotNull(bigDecimal60);
        org.junit.Assert.assertTrue("'" + float61 + "' != '" + 0.0f + "'", float61 == 0.0f);
        org.junit.Assert.assertNotNull(bigDecimal62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "0" + "'", str63, "0");
    }

    @Test
    public void test06576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06576");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str1, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test06577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06577");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal5 = bigDecimal1.subtract(bigDecimal4);
        java.math.BigInteger bigInteger6 = bigDecimal5.toBigInteger();
        double double7 = bigInteger6.doubleValue();
        byte[] byteArray10 = new byte[] { (byte) 1 };
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.min(byteArray10);
        java.math.BigInteger bigInteger12 = new java.math.BigInteger((int) (short) -1, byteArray10);
        java.math.BigInteger bigInteger13 = bigInteger6.gcd(bigInteger12);
        java.math.BigDecimal bigDecimal14 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal15 = bigDecimal14.negate();
        java.math.BigDecimal bigDecimal18 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal19 = bigDecimal15.subtract(bigDecimal18);
        java.math.BigInteger bigInteger20 = bigDecimal19.toBigInteger();
        java.math.BigInteger bigInteger21 = bigInteger12.or(bigInteger20);
        java.math.BigInteger bigInteger23 = bigInteger20.shiftRight((int) (short) -1);
        java.math.BigDecimal bigDecimal24 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal25 = bigDecimal24.negate();
        java.math.BigDecimal bigDecimal28 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal29 = bigDecimal25.subtract(bigDecimal28);
        java.math.BigInteger bigInteger30 = bigDecimal29.toBigInteger();
        double double31 = bigInteger30.doubleValue();
        byte[] byteArray34 = new byte[] { (byte) 1 };
        byte byte35 = org.apache.commons.lang3.math.NumberUtils.min(byteArray34);
        java.math.BigInteger bigInteger36 = new java.math.BigInteger((int) (short) -1, byteArray34);
        java.math.BigInteger bigInteger37 = bigInteger30.gcd(bigInteger36);
        java.math.BigDecimal bigDecimal38 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal39 = bigDecimal38.negate();
        java.math.BigDecimal bigDecimal42 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal43 = bigDecimal39.subtract(bigDecimal42);
        java.math.BigInteger bigInteger44 = bigDecimal43.toBigInteger();
        java.math.BigInteger bigInteger45 = bigInteger36.or(bigInteger44);
        java.math.BigInteger bigInteger47 = bigInteger44.shiftRight((int) (short) -1);
        java.math.BigInteger bigInteger48 = bigInteger23.max(bigInteger44);
        java.math.BigInteger bigInteger50 = bigInteger44.shiftLeft((-1));
        java.lang.Object obj51 = null;
        boolean boolean52 = bigInteger44.equals(obj51);
        java.math.BigDecimal bigDecimal53 = new java.math.BigDecimal(bigInteger44);
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[1]");
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 1 + "'", byte11 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger13);
        org.junit.Assert.assertNotNull(bigDecimal14);
        org.junit.Assert.assertNotNull(bigDecimal15);
        org.junit.Assert.assertNotNull(bigDecimal18);
        org.junit.Assert.assertNotNull(bigDecimal19);
        org.junit.Assert.assertNotNull(bigInteger20);
        org.junit.Assert.assertNotNull(bigInteger21);
        org.junit.Assert.assertNotNull(bigInteger23);
        org.junit.Assert.assertNotNull(bigDecimal24);
        org.junit.Assert.assertNotNull(bigDecimal25);
        org.junit.Assert.assertNotNull(bigDecimal28);
        org.junit.Assert.assertNotNull(bigDecimal29);
        org.junit.Assert.assertNotNull(bigInteger30);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[1]");
        org.junit.Assert.assertTrue("'" + byte35 + "' != '" + (byte) 1 + "'", byte35 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger37);
        org.junit.Assert.assertNotNull(bigDecimal38);
        org.junit.Assert.assertNotNull(bigDecimal39);
        org.junit.Assert.assertNotNull(bigDecimal42);
        org.junit.Assert.assertNotNull(bigDecimal43);
        org.junit.Assert.assertNotNull(bigInteger44);
        org.junit.Assert.assertNotNull(bigInteger45);
        org.junit.Assert.assertNotNull(bigInteger47);
        org.junit.Assert.assertNotNull(bigInteger48);
        org.junit.Assert.assertNotNull(bigInteger50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test06578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06578");
        byte[] byteArray4 = new byte[] { (byte) 1 };
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray4);
        java.math.BigInteger bigInteger6 = new java.math.BigInteger((int) (short) -1, byteArray4);
        java.math.BigInteger bigInteger7 = new java.math.BigInteger(byteArray4);
        java.math.BigInteger bigInteger8 = new java.math.BigInteger((int) (short) -1, byteArray4);
        java.math.BigInteger bigInteger9 = new java.math.BigInteger(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger10 = new java.math.BigInteger((int) 'u', byteArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Invalid signum value");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1]");
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 1 + "'", byte5 == (byte) 1);
    }

    @Test
    public void test06579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06579");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "\ub3c5\uc77c\uc5b4\ub3c5\uc77c) ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06580");
        float[] floatArray5 = new float[] { '4', 0L, 4, 1L, 1 };
        float float6 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        float float7 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        float float8 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        float float9 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        float float10 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        float float11 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        float float12 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        float float13 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[52.0, 0.0, 4.0, 1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 52.0f + "'", float7 == 52.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 52.0f + "'", float8 == 52.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 52.0f + "'", float9 == 52.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 52.0f + "'", float11 == 52.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 52.0f + "'", float12 == 52.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.0f + "'", float13 == 0.0f);
    }

    @Test
    public void test06581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06581");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("French", (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06582");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance(charSequence0, (java.lang.CharSequence) "\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Strings must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06583");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("French (France)", "0", (int) (short) 1, 8);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "F0France)" + "'", str4, "F0France)");
    }

    @Test
    public void test06584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06584");
        java.util.Locale locale0 = java.util.Locale.PRC;
        java.util.Locale locale1 = null;
        java.lang.String str2 = locale0.getDisplayScript(locale1);
        java.util.Locale.setDefault(locale0);
        java.lang.String str4 = locale0.getDisplayLanguage();
        boolean boolean5 = locale0.hasExtensions();
        java.util.Locale locale6 = java.util.Locale.KOREA;
        java.util.Locale locale7 = locale6.stripExtensions();
        java.util.Locale locale8 = java.util.Locale.getDefault();
        java.lang.String str9 = locale8.getDisplayLanguage();
        java.lang.String str10 = locale8.getDisplayCountry();
        java.lang.String str11 = locale7.getDisplayName(locale8);
        java.lang.String str12 = locale0.getDisplayScript(locale8);
        java.lang.String str13 = locale8.getDisplayCountry();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u4e2d\u6587" + "'", str4, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u4e2d\u6587" + "'", str9, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\u4e2d\u56fd" + "'", str10, "\u4e2d\u56fd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\u671d\u9c9c\u6587\u97e9\u56fd)" + "'", str11, "\u671d\u9c9c\u6587\u97e9\u56fd)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\u4e2d\u56fd" + "'", str13, "\u4e2d\u56fd");
    }

    @Test
    public void test06585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06585");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal5 = bigDecimal1.subtract(bigDecimal4);
        java.math.BigInteger bigInteger6 = bigDecimal5.toBigInteger();
        double double7 = bigInteger6.doubleValue();
        byte[] byteArray10 = new byte[] { (byte) 1 };
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.min(byteArray10);
        java.math.BigInteger bigInteger12 = new java.math.BigInteger((int) (short) -1, byteArray10);
        java.math.BigInteger bigInteger13 = bigInteger6.gcd(bigInteger12);
        java.math.BigDecimal bigDecimal14 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal15 = bigDecimal14.negate();
        java.math.BigDecimal bigDecimal18 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal19 = bigDecimal15.subtract(bigDecimal18);
        java.math.BigInteger bigInteger20 = bigDecimal19.toBigInteger();
        java.math.BigInteger bigInteger21 = bigInteger12.or(bigInteger20);
        java.math.BigInteger bigInteger23 = bigInteger20.shiftRight((int) (short) -1);
        java.math.BigDecimal bigDecimal24 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal25 = bigDecimal24.negate();
        java.math.BigDecimal bigDecimal28 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal29 = bigDecimal25.subtract(bigDecimal28);
        java.math.BigInteger bigInteger30 = bigDecimal29.toBigInteger();
        double double31 = bigInteger30.doubleValue();
        byte[] byteArray34 = new byte[] { (byte) 1 };
        byte byte35 = org.apache.commons.lang3.math.NumberUtils.min(byteArray34);
        java.math.BigInteger bigInteger36 = new java.math.BigInteger((int) (short) -1, byteArray34);
        java.math.BigInteger bigInteger37 = bigInteger30.gcd(bigInteger36);
        java.math.BigDecimal bigDecimal38 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal39 = bigDecimal38.negate();
        java.math.BigDecimal bigDecimal42 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal43 = bigDecimal39.subtract(bigDecimal42);
        java.math.BigInteger bigInteger44 = bigDecimal43.toBigInteger();
        java.math.BigInteger bigInteger45 = bigInteger36.or(bigInteger44);
        java.math.BigInteger bigInteger47 = bigInteger44.shiftRight((int) (short) -1);
        java.math.BigInteger bigInteger48 = bigInteger23.max(bigInteger44);
        java.math.BigInteger bigInteger50 = bigInteger44.shiftLeft((-1));
        java.math.BigInteger bigInteger52 = bigInteger44.shiftRight(5);
        boolean boolean54 = bigInteger52.isProbablePrime((int) (byte) 10);
        java.math.MathContext mathContext55 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal56 = new java.math.BigDecimal(bigInteger52, mathContext55);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[1]");
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 1 + "'", byte11 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger13);
        org.junit.Assert.assertNotNull(bigDecimal14);
        org.junit.Assert.assertNotNull(bigDecimal15);
        org.junit.Assert.assertNotNull(bigDecimal18);
        org.junit.Assert.assertNotNull(bigDecimal19);
        org.junit.Assert.assertNotNull(bigInteger20);
        org.junit.Assert.assertNotNull(bigInteger21);
        org.junit.Assert.assertNotNull(bigInteger23);
        org.junit.Assert.assertNotNull(bigDecimal24);
        org.junit.Assert.assertNotNull(bigDecimal25);
        org.junit.Assert.assertNotNull(bigDecimal28);
        org.junit.Assert.assertNotNull(bigDecimal29);
        org.junit.Assert.assertNotNull(bigInteger30);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[1]");
        org.junit.Assert.assertTrue("'" + byte35 + "' != '" + (byte) 1 + "'", byte35 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger37);
        org.junit.Assert.assertNotNull(bigDecimal38);
        org.junit.Assert.assertNotNull(bigDecimal39);
        org.junit.Assert.assertNotNull(bigDecimal42);
        org.junit.Assert.assertNotNull(bigDecimal43);
        org.junit.Assert.assertNotNull(bigInteger44);
        org.junit.Assert.assertNotNull(bigInteger45);
        org.junit.Assert.assertNotNull(bigInteger47);
        org.junit.Assert.assertNotNull(bigInteger48);
        org.junit.Assert.assertNotNull(bigInteger50);
        org.junit.Assert.assertNotNull(bigInteger52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test06586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06586");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.TEN;
        java.math.BigInteger bigInteger1 = bigDecimal0.toBigInteger();
        java.math.BigInteger bigInteger2 = bigDecimal0.unscaledValue();
        float float3 = bigDecimal0.floatValue();
        java.math.MathContext mathContext4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal5 = bigDecimal0.plus(mathContext4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigInteger1);
        org.junit.Assert.assertNotNull(bigInteger2);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void test06587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06587");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("                                                                                                     fr-FRDeutschland", "\uc911\uad6d\uc5b4");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                     fr-FRDeutschland" + "'", str2, "                                                                                                     fr-FRDeutschland");
    }

    @Test
    public void test06588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06588");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal5 = bigDecimal1.subtract(bigDecimal4);
        java.math.BigInteger bigInteger6 = bigDecimal5.toBigInteger();
        double double7 = bigInteger6.doubleValue();
        byte[] byteArray10 = new byte[] { (byte) 1 };
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.min(byteArray10);
        java.math.BigInteger bigInteger12 = new java.math.BigInteger((int) (short) -1, byteArray10);
        java.math.BigInteger bigInteger13 = bigInteger6.gcd(bigInteger12);
        java.math.BigDecimal bigDecimal14 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal15 = bigDecimal14.negate();
        java.math.BigDecimal bigDecimal18 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal19 = bigDecimal15.subtract(bigDecimal18);
        java.math.BigInteger bigInteger20 = bigDecimal19.toBigInteger();
        java.math.BigInteger bigInteger21 = bigInteger12.or(bigInteger20);
        java.math.BigInteger bigInteger23 = bigInteger20.shiftRight((int) (short) -1);
        java.math.BigDecimal bigDecimal24 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal25 = bigDecimal24.negate();
        java.math.BigDecimal bigDecimal28 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal29 = bigDecimal25.subtract(bigDecimal28);
        java.math.BigInteger bigInteger30 = bigDecimal29.toBigInteger();
        double double31 = bigInteger30.doubleValue();
        byte[] byteArray34 = new byte[] { (byte) 1 };
        byte byte35 = org.apache.commons.lang3.math.NumberUtils.min(byteArray34);
        java.math.BigInteger bigInteger36 = new java.math.BigInteger((int) (short) -1, byteArray34);
        java.math.BigInteger bigInteger37 = bigInteger30.gcd(bigInteger36);
        java.math.BigDecimal bigDecimal38 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal39 = bigDecimal38.negate();
        java.math.BigDecimal bigDecimal42 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal43 = bigDecimal39.subtract(bigDecimal42);
        java.math.BigInteger bigInteger44 = bigDecimal43.toBigInteger();
        java.math.BigInteger bigInteger45 = bigInteger36.or(bigInteger44);
        java.math.BigInteger bigInteger47 = bigInteger44.shiftRight((int) (short) -1);
        java.math.BigInteger bigInteger48 = bigInteger23.max(bigInteger44);
        java.math.BigInteger bigInteger50 = bigInteger44.shiftLeft((-1));
        java.lang.Object obj51 = null;
        boolean boolean52 = bigInteger44.equals(obj51);
        java.math.BigInteger bigInteger54 = bigInteger44.setBit(11);
        java.math.BigInteger bigInteger55 = bigInteger44.not();
        java.math.BigDecimal bigDecimal56 = java.math.BigDecimal.ZERO;
        double double57 = bigDecimal56.doubleValue();
        java.math.BigInteger bigInteger58 = bigDecimal56.toBigInteger();
        java.math.BigInteger bigInteger60 = bigInteger58.setBit(4);
        long long61 = bigInteger60.longValueExact();
        int int62 = bigInteger60.getLowestSetBit();
        java.math.BigInteger bigInteger63 = bigInteger44.add(bigInteger60);
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[1]");
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 1 + "'", byte11 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger13);
        org.junit.Assert.assertNotNull(bigDecimal14);
        org.junit.Assert.assertNotNull(bigDecimal15);
        org.junit.Assert.assertNotNull(bigDecimal18);
        org.junit.Assert.assertNotNull(bigDecimal19);
        org.junit.Assert.assertNotNull(bigInteger20);
        org.junit.Assert.assertNotNull(bigInteger21);
        org.junit.Assert.assertNotNull(bigInteger23);
        org.junit.Assert.assertNotNull(bigDecimal24);
        org.junit.Assert.assertNotNull(bigDecimal25);
        org.junit.Assert.assertNotNull(bigDecimal28);
        org.junit.Assert.assertNotNull(bigDecimal29);
        org.junit.Assert.assertNotNull(bigInteger30);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[1]");
        org.junit.Assert.assertTrue("'" + byte35 + "' != '" + (byte) 1 + "'", byte35 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger37);
        org.junit.Assert.assertNotNull(bigDecimal38);
        org.junit.Assert.assertNotNull(bigDecimal39);
        org.junit.Assert.assertNotNull(bigDecimal42);
        org.junit.Assert.assertNotNull(bigDecimal43);
        org.junit.Assert.assertNotNull(bigInteger44);
        org.junit.Assert.assertNotNull(bigInteger45);
        org.junit.Assert.assertNotNull(bigInteger47);
        org.junit.Assert.assertNotNull(bigInteger48);
        org.junit.Assert.assertNotNull(bigInteger50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(bigInteger54);
        org.junit.Assert.assertNotNull(bigInteger55);
        org.junit.Assert.assertNotNull(bigDecimal56);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.0d + "'", double57 == 0.0d);
        org.junit.Assert.assertNotNull(bigInteger58);
        org.junit.Assert.assertNotNull(bigInteger60);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 16L + "'", long61 == 16L);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 4 + "'", int62 == 4);
        org.junit.Assert.assertNotNull(bigInteger63);
    }

    @Test
    public void test06589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06589");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("0.00E+3", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "   0.00E+3" + "'", str2, "   0.00E+3");
    }

    @Test
    public void test06590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06590");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("en", "UitdStts");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06591");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("npj");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "npj" + "'", str1, "npj");
    }

    @Test
    public void test06592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06592");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        double double1 = bigDecimal0.doubleValue();
        java.math.BigInteger bigInteger2 = bigDecimal0.toBigInteger();
        byte[] byteArray5 = new byte[] { (byte) 1 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        java.math.BigInteger bigInteger7 = new java.math.BigInteger((int) (short) -1, byteArray5);
        java.math.BigInteger bigInteger9 = bigInteger7.pow((int) 'a');
        byte[] byteArray10 = bigInteger7.toByteArray();
        long long11 = bigInteger7.longValueExact();
        java.math.BigInteger bigInteger12 = bigInteger2.or(bigInteger7);
        byte[] byteArray15 = new byte[] { (byte) 1 };
        byte byte16 = org.apache.commons.lang3.math.NumberUtils.min(byteArray15);
        java.math.BigInteger bigInteger17 = new java.math.BigInteger((int) (short) -1, byteArray15);
        java.math.BigInteger bigInteger19 = bigInteger17.pow((int) 'a');
        byte[] byteArray20 = bigInteger17.toByteArray();
        long long21 = bigInteger17.longValueExact();
        java.lang.String str23 = bigInteger17.toString(0);
        int int24 = bigInteger17.intValueExact();
        java.math.BigInteger bigInteger25 = bigInteger12.subtract(bigInteger17);
        java.math.BigDecimal bigDecimal26 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal27 = bigDecimal26.negate();
        java.math.BigDecimal bigDecimal30 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal31 = bigDecimal27.subtract(bigDecimal30);
        java.math.BigInteger bigInteger32 = bigDecimal31.toBigInteger();
        java.math.BigInteger bigInteger33 = bigInteger32.negate();
        java.math.BigDecimal bigDecimal34 = java.math.BigDecimal.ZERO;
        double double35 = bigDecimal34.doubleValue();
        java.math.BigInteger bigInteger36 = bigDecimal34.toBigInteger();
        byte[] byteArray39 = new byte[] { (byte) 1 };
        byte byte40 = org.apache.commons.lang3.math.NumberUtils.min(byteArray39);
        java.math.BigInteger bigInteger41 = new java.math.BigInteger((int) (short) -1, byteArray39);
        java.math.BigInteger bigInteger43 = bigInteger41.pow((int) 'a');
        byte[] byteArray44 = bigInteger41.toByteArray();
        long long45 = bigInteger41.longValueExact();
        java.math.BigInteger bigInteger46 = bigInteger36.or(bigInteger41);
        byte[] byteArray49 = new byte[] { (byte) 1 };
        byte byte50 = org.apache.commons.lang3.math.NumberUtils.min(byteArray49);
        java.math.BigInteger bigInteger51 = new java.math.BigInteger((int) (short) -1, byteArray49);
        java.math.BigInteger bigInteger53 = bigInteger51.pow((int) 'a');
        byte[] byteArray54 = bigInteger51.toByteArray();
        long long55 = bigInteger51.longValueExact();
        java.lang.String str57 = bigInteger51.toString(0);
        int int58 = bigInteger51.intValueExact();
        java.math.BigInteger bigInteger59 = bigInteger46.subtract(bigInteger51);
        java.math.BigInteger bigInteger60 = bigInteger32.min(bigInteger46);
        java.math.BigInteger bigInteger61 = bigInteger25.gcd(bigInteger60);
        byte[] byteArray64 = new byte[] { (byte) 1 };
        byte byte65 = org.apache.commons.lang3.math.NumberUtils.min(byteArray64);
        java.math.BigInteger bigInteger66 = new java.math.BigInteger((int) (short) -1, byteArray64);
        java.math.BigInteger bigInteger68 = bigInteger66.pow((int) 'a');
        java.math.BigDecimal bigDecimal69 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal70 = bigDecimal69.negate();
        java.math.BigDecimal bigDecimal73 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal74 = bigDecimal70.subtract(bigDecimal73);
        java.math.BigInteger bigInteger75 = bigDecimal74.toBigInteger();
        double double76 = bigInteger75.doubleValue();
        byte[] byteArray79 = new byte[] { (byte) 1 };
        byte byte80 = org.apache.commons.lang3.math.NumberUtils.min(byteArray79);
        java.math.BigInteger bigInteger81 = new java.math.BigInteger((int) (short) -1, byteArray79);
        java.math.BigInteger bigInteger82 = bigInteger75.gcd(bigInteger81);
        java.math.BigDecimal bigDecimal83 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal84 = bigDecimal83.negate();
        java.math.BigDecimal bigDecimal87 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal88 = bigDecimal84.subtract(bigDecimal87);
        java.math.BigInteger bigInteger89 = bigDecimal88.toBigInteger();
        java.math.BigInteger bigInteger90 = bigInteger81.or(bigInteger89);
        java.math.BigInteger bigInteger91 = bigInteger68.min(bigInteger90);
        java.math.BigInteger bigInteger92 = bigInteger60.add(bigInteger91);
        java.lang.String str93 = bigInteger92.toString();
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(bigInteger2);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1]");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 1 + "'", byte6 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger9);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[-1]");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(bigInteger12);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[1]");
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) 1 + "'", byte16 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger19);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[-1]");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-1" + "'", str23, "-1");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(bigInteger25);
        org.junit.Assert.assertNotNull(bigDecimal26);
        org.junit.Assert.assertNotNull(bigDecimal27);
        org.junit.Assert.assertNotNull(bigDecimal30);
        org.junit.Assert.assertNotNull(bigDecimal31);
        org.junit.Assert.assertNotNull(bigInteger32);
        org.junit.Assert.assertNotNull(bigInteger33);
        org.junit.Assert.assertNotNull(bigDecimal34);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertNotNull(bigInteger36);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[1]");
        org.junit.Assert.assertTrue("'" + byte40 + "' != '" + (byte) 1 + "'", byte40 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger43);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray44), "[-1]");
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + (-1L) + "'", long45 == (-1L));
        org.junit.Assert.assertNotNull(bigInteger46);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray49), "[1]");
        org.junit.Assert.assertTrue("'" + byte50 + "' != '" + (byte) 1 + "'", byte50 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger53);
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray54), "[-1]");
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + (-1L) + "'", long55 == (-1L));
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "-1" + "'", str57, "-1");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertNotNull(bigInteger59);
        org.junit.Assert.assertNotNull(bigInteger60);
        org.junit.Assert.assertNotNull(bigInteger61);
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray64), "[1]");
        org.junit.Assert.assertTrue("'" + byte65 + "' != '" + (byte) 1 + "'", byte65 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger68);
        org.junit.Assert.assertNotNull(bigDecimal69);
        org.junit.Assert.assertNotNull(bigDecimal70);
        org.junit.Assert.assertNotNull(bigDecimal73);
        org.junit.Assert.assertNotNull(bigDecimal74);
        org.junit.Assert.assertNotNull(bigInteger75);
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 0.0d + "'", double76 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray79), "[1]");
        org.junit.Assert.assertTrue("'" + byte80 + "' != '" + (byte) 1 + "'", byte80 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger82);
        org.junit.Assert.assertNotNull(bigDecimal83);
        org.junit.Assert.assertNotNull(bigDecimal84);
        org.junit.Assert.assertNotNull(bigDecimal87);
        org.junit.Assert.assertNotNull(bigDecimal88);
        org.junit.Assert.assertNotNull(bigInteger89);
        org.junit.Assert.assertNotNull(bigInteger90);
        org.junit.Assert.assertNotNull(bigInteger91);
        org.junit.Assert.assertNotNull(bigInteger92);
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "-2" + "'", str93, "-2");
    }

    @Test
    public void test06593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06593");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("iH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IHXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!Hi" + "'", str1, "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!Hi");
    }

    @Test
    public void test06594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06594");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("                                                                                                                                                     #                                                                                                                                                      ", "Japanisch");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                     #                                                                                                                                                      " + "'", str2, "                                                                                                                                                     #                                                                                                                                                      ");
    }

    @Test
    public void test06595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06595");
        java.math.MathContext mathContext1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal2 = new java.math.BigDecimal(34, mathContext1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06596");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("#", "x", 296);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06597");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        java.util.List<java.lang.String> strList9 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList7);
        java.util.Locale locale10 = java.util.Locale.TAIWAN;
        java.util.Locale locale11 = java.util.Locale.getDefault();
        java.lang.String str12 = locale11.getDisplayLanguage();
        java.util.Locale locale13 = java.util.Locale.CANADA_FRENCH;
        java.util.Locale locale14 = java.util.Locale.GERMANY;
        java.lang.String str15 = locale14.getVariant();
        java.util.Locale locale16 = java.util.Locale.KOREA;
        java.util.Locale locale17 = java.util.Locale.ENGLISH;
        java.util.Locale locale18 = java.util.Locale.CHINA;
        java.util.Locale locale19 = java.util.Locale.FRANCE;
        java.util.Locale locale20 = java.util.Locale.ITALIAN;
        java.util.Locale locale22 = java.util.Locale.getDefault();
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.upperCase("", locale22);
        java.util.Locale locale24 = java.util.Locale.PRC;
        java.lang.String str25 = locale24.getISO3Language();
        java.util.Locale locale26 = java.util.Locale.KOREA;
        java.util.Locale locale27 = locale26.stripExtensions();
        java.util.Locale locale28 = java.util.Locale.KOREA;
        java.util.Locale locale29 = locale28.stripExtensions();
        java.util.Locale locale32 = java.util.Locale.FRANCE;
        java.lang.String str33 = org.apache.commons.lang3.StringUtils.upperCase("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!", locale32);
        java.lang.String str34 = org.apache.commons.lang3.StringUtils.lowerCase("hi", locale32);
        java.util.Locale locale35 = java.util.Locale.KOREA;
        java.util.Locale locale36 = locale35.stripExtensions();
        java.util.Locale locale37 = java.util.Locale.ENGLISH;
        java.util.Locale locale38 = java.util.Locale.ENGLISH;
        java.util.Locale locale40 = java.util.Locale.getDefault();
        java.lang.String str41 = org.apache.commons.lang3.StringUtils.lowerCase("", locale40);
        java.util.Locale.setDefault(locale40);
        java.util.Locale locale43 = java.util.Locale.TAIWAN;
        java.util.Locale locale44 = java.util.Locale.ENGLISH;
        java.util.Locale locale45 = java.util.Locale.KOREA;
        java.lang.String str46 = locale45.getScript();
        java.util.Locale locale47 = java.util.Locale.PRC;
        java.util.Locale locale48 = null;
        java.lang.String str49 = locale47.getDisplayScript(locale48);
        java.util.Locale locale50 = java.util.Locale.PRC;
        java.util.Locale locale52 = java.util.Locale.getDefault();
        java.lang.String str53 = org.apache.commons.lang3.StringUtils.lowerCase("", locale52);
        java.util.Locale[] localeArray54 = new java.util.Locale[] { locale10, locale11, locale13, locale14, locale16, locale17, locale18, locale19, locale20, locale22, locale24, locale27, locale28, locale32, locale35, locale37, locale38, locale40, locale43, locale44, locale45, locale47, locale50, locale52 };
        java.util.ArrayList<java.util.Locale> localeList55 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList55, localeArray54);
        java.util.Locale locale57 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList55);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap58 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList59 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap58);
        java.lang.String str61 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList59, ' ');
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap62 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList63 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList59, strMap62);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\u4e2d\u6587" + "'", str12, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "en");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "it");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "zho" + "'", str25, "zho");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!!" + "'", str33, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi" + "'", str34, "hi");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "en");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "en");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "en");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNotNull(localeArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNull(locale57);
        org.junit.Assert.assertNotNull(languageRangeList59);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertNotNull(languageRangeList63);
    }

    @Test
    public void test06598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06598");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("fr_FRu Sud");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "fr_FRu Sud" + "'", str1, "fr_FRu Sud");
    }

    @Test
    public void test06599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06599");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI", "zh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-Chi!", 4);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih", "");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("z-CN", strArray5, strArray8);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny("Enhinh", strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "z-CN" + "'", str9, "z-CN");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test06600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06600");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("frazho", "United StatesUnited StatesUnited StatesUnited StatesUnited StatesUnited StatesUnited StatesUnited StatesUnited StatesUn0", (int) (short) 16);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test06601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06601");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ONE;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.abs();
        int int2 = bigDecimal1.intValue();
        java.math.BigDecimal bigDecimal4 = bigDecimal1.pow(120);
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(bigDecimal4);
    }

    @Test
    public void test06602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06602");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("00", "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06603");
        java.math.BigDecimal bigDecimal1 = java.math.BigDecimal.valueOf((double) 32);
        org.junit.Assert.assertNotNull(bigDecimal1);
    }

    @Test
    public void test06604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06604");
        java.util.Locale locale1 = new java.util.Locale("\uc911\uad6d\uc5b4\uc911\uad6d)");
        java.lang.Object obj2 = locale1.clone();
        org.junit.Assert.assertEquals(locale1.toString(), "\uc911\uad6d\uc5b4\uc911\uad6d)");
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "\uc911\uad6d\uc5b4\uc911\uad6d)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "\uc911\uad6d\uc5b4\uc911\uad6d)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "\uc911\uad6d\uc5b4\uc911\uad6d)");
    }

    @Test
    public void test06605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06605");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("\uc911\uad6d\uc5b4\uc911\uad6d)");
        java.lang.String str2 = locale1.getDisplayName();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06606");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setLanguageTag("eng");
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale locale4 = java.util.Locale.FRANCE;
        java.util.Locale.Builder builder5 = builder3.setLocale(locale4);
        java.util.Locale.Builder builder7 = builder5.addUnicodeLocaleAttribute("engcn");
        java.util.Locale.Builder builder9 = builder7.setVariant("");
        java.util.Locale locale10 = java.util.Locale.getDefault();
        java.lang.String str11 = locale10.getDisplayLanguage();
        java.lang.String str12 = locale10.getDisplayCountry();
        java.lang.String str13 = locale10.getDisplayScript();
        java.util.Locale.Builder builder14 = builder9.setLocale(locale10);
        java.util.Locale.Builder builder17 = builder14.setExtension('a', "ko_KR");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\u4e2d\u6587" + "'", str11, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\u4e2d\u56fd" + "'", str12, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder17);
    }

    @Test
    public void test06607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06607");
        char[] charArray18 = new char[] { ' ', '#', '4', '#', '4', ' ' };
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!", charArray18);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "en_US", charArray18);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", charArray18);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "zho", charArray18);
        int int23 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "zho", charArray18);
        int int24 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "zh-CN", charArray18);
        boolean boolean25 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "#_ENG", charArray18);
        boolean boolean26 = org.apache.commons.lang3.StringUtils.containsAny("China", charArray18);
        int int27 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "zh-CN", charArray18);
        boolean boolean28 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "engcn", charArray18);
        int int29 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\u5fb7\u56fd", charArray18);
        int int30 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "CHN", charArray18);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal31 = new java.math.BigDecimal(charArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), " #4#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), " #4#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[ , #, 4, #, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test06608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06608");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("CHN", (double) 0L);
        java.lang.String str3 = languageRange2.getRange();
        double double4 = languageRange2.getWeight();
        java.lang.String str5 = languageRange2.getRange();
        java.lang.String str6 = languageRange2.getRange();
        boolean boolean8 = languageRange2.equals((java.lang.Object) "\u610f\u5927\u5229");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chn" + "'", str3, "chn");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chn" + "'", str5, "chn");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chn" + "'", str6, "chn");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test06609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06609");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuEnhinh", (int) 'u');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuEnhinh" + "'", str2, "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuEnhinh");
    }

    @Test
    public void test06610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06610");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("0.0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000100", "frz-C aaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0.0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000100" + "'", str2, "0.0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000100");
    }

    @Test
    public void test06611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06611");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("\u65e5\u672c\u8a9e");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test06612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06612");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06613");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 0L, (double) 296L, (double) 34);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 296.0d + "'", double3 == 296.0d);
    }

    @Test
    public void test06614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06614");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.ONE;
        java.math.BigDecimal bigDecimal3 = bigDecimal1.min(bigDecimal2);
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal5 = bigDecimal4.negate();
        java.math.BigDecimal bigDecimal8 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal9 = bigDecimal5.subtract(bigDecimal8);
        java.math.BigDecimal[] bigDecimalArray10 = bigDecimal2.divideAndRemainder(bigDecimal8);
        java.math.BigDecimal bigDecimal11 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal12 = bigDecimal11.negate();
        java.math.BigDecimal bigDecimal15 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal16 = bigDecimal12.subtract(bigDecimal15);
        java.math.BigDecimal bigDecimal17 = java.math.BigDecimal.TEN;
        java.math.BigDecimal bigDecimal18 = bigDecimal15.min(bigDecimal17);
        java.math.BigDecimal bigDecimal19 = bigDecimal8.divideToIntegralValue(bigDecimal18);
        java.math.BigDecimal bigDecimal20 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal21 = bigDecimal20.negate();
        java.math.BigDecimal bigDecimal22 = java.math.BigDecimal.TEN;
        long long23 = bigDecimal22.longValueExact();
        java.math.BigDecimal bigDecimal24 = bigDecimal22.ulp();
        java.lang.String str25 = bigDecimal22.toString();
        int int26 = bigDecimal20.compareTo(bigDecimal22);
        java.math.BigInteger bigInteger27 = bigDecimal20.toBigInteger();
        java.math.BigDecimal bigDecimal28 = bigDecimal20.ulp();
        java.math.BigDecimal bigDecimal29 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal30 = bigDecimal29.negate();
        java.math.BigDecimal bigDecimal31 = java.math.BigDecimal.ONE;
        java.math.BigDecimal bigDecimal32 = bigDecimal30.min(bigDecimal31);
        int int33 = bigDecimal20.compareTo(bigDecimal32);
        int int34 = bigDecimal19.compareTo(bigDecimal32);
        int int35 = bigDecimal19.precision();
        java.math.BigDecimal bigDecimal36 = java.math.BigDecimal.ONE;
        java.math.BigDecimal bigDecimal37 = bigDecimal36.abs();
        java.lang.String str38 = bigDecimal37.toPlainString();
        short short39 = bigDecimal37.shortValueExact();
        java.math.RoundingMode roundingMode40 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal41 = bigDecimal19.divide(bigDecimal37, roundingMode40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal2);
        org.junit.Assert.assertNotNull(bigDecimal3);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigDecimal8);
        org.junit.Assert.assertNotNull(bigDecimal9);
        org.junit.Assert.assertNotNull(bigDecimalArray10);
        org.junit.Assert.assertNotNull(bigDecimal11);
        org.junit.Assert.assertNotNull(bigDecimal12);
        org.junit.Assert.assertNotNull(bigDecimal15);
        org.junit.Assert.assertNotNull(bigDecimal16);
        org.junit.Assert.assertNotNull(bigDecimal17);
        org.junit.Assert.assertNotNull(bigDecimal18);
        org.junit.Assert.assertNotNull(bigDecimal19);
        org.junit.Assert.assertNotNull(bigDecimal20);
        org.junit.Assert.assertNotNull(bigDecimal21);
        org.junit.Assert.assertNotNull(bigDecimal22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 10L + "'", long23 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "10" + "'", str25, "10");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(bigInteger27);
        org.junit.Assert.assertNotNull(bigDecimal28);
        org.junit.Assert.assertNotNull(bigDecimal29);
        org.junit.Assert.assertNotNull(bigDecimal30);
        org.junit.Assert.assertNotNull(bigDecimal31);
        org.junit.Assert.assertNotNull(bigDecimal32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(bigDecimal36);
        org.junit.Assert.assertNotNull(bigDecimal37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "1" + "'", str38, "1");
        org.junit.Assert.assertTrue("'" + short39 + "' != '" + (short) 1 + "'", short39 == (short) 1);
    }

    @Test
    public void test06615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06615");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "   0.00E+3", "                              ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test06616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06616");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setLanguageTag("eng");
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale.Builder builder4 = builder3.clear();
        java.util.Locale.Builder builder5 = builder3.clear();
        java.util.Locale.Builder builder7 = builder5.addUnicodeLocaleAttribute("eng");
        java.util.Locale.Builder builder9 = builder5.setLanguage("CN");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder5.setExtension('u', "\u82f1\u6587");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension value: ititititititititititititititititititititititititititititititititititititititititititititititititititititititititititititititititititititititititititititititititititititititititititititititititititititititititititititititititititititititititititititititititititititititititititititititititititititit?? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test06617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06617");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "0E-100", "ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test06618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06618");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("de_DE", 296, 'x');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "de_DExxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx" + "'", str3, "de_DExxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
    }

    @Test
    public void test06619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06619");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "1HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI" + "'", str1, "1HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
    }

    @Test
    public void test06620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06620");
        byte[] byteArray2 = new byte[] { (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.math.BigInteger bigInteger4 = new java.math.BigInteger((int) (short) -1, byteArray2);
        java.math.BigInteger bigInteger6 = bigInteger4.pow((int) 'a');
        byte[] byteArray7 = bigInteger4.toByteArray();
        long long8 = bigInteger4.longValueExact();
        java.lang.String str10 = bigInteger4.toString(0);
        byte[] byteArray13 = new byte[] { (byte) 1 };
        byte byte14 = org.apache.commons.lang3.math.NumberUtils.min(byteArray13);
        java.math.BigInteger bigInteger15 = new java.math.BigInteger((int) (short) -1, byteArray13);
        java.math.BigInteger bigInteger16 = new java.math.BigInteger(byteArray13);
        boolean boolean17 = bigInteger4.equals((java.lang.Object) byteArray13);
        java.math.BigInteger bigInteger18 = new java.math.BigInteger(byteArray13);
        long long19 = bigInteger18.longValue();
        long long20 = bigInteger18.longValueExact();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1]");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1" + "'", str10, "-1");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[1]");
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) 1 + "'", byte14 == (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1L + "'", long19 == 1L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
    }

    @Test
    public void test06621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06621");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("", "\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test06622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06622");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("0.00E+3", (int) (short) -16960);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06623");
        java.util.Locale locale0 = java.util.Locale.CANADA;
        java.util.Locale locale1 = java.util.Locale.KOREA;
        java.util.Locale locale2 = locale1.stripExtensions();
        java.lang.String str3 = locale0.getDisplayVariant(locale2);
        java.lang.String str4 = locale0.getDisplayLanguage();
        java.lang.String str5 = locale0.getDisplayVariant();
        java.util.Locale locale6 = locale0.stripExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = locale6.getExtension('4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u82f1\u6587" + "'", str4, "\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en_CA");
    }

    @Test
    public void test06624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06624");
        java.util.Locale locale0 = java.util.Locale.GERMANY;
        java.util.Locale locale1 = java.util.Locale.PRC;
        java.lang.String str2 = locale0.getDisplayScript(locale1);
        java.util.Locale.setDefault(locale1);
        java.util.Locale locale5 = java.util.Locale.getDefault();
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.lowerCase("", locale5);
        java.util.Locale.setDefault(locale5);
        java.lang.String str8 = locale1.getDisplayScript(locale5);
        java.util.Locale locale11 = new java.util.Locale("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", "\ub3c5\uc77c\uc5b4\ub3c5\uc77c)hi");
        java.lang.String str12 = locale1.getDisplayScript(locale11);
        java.lang.String str13 = locale1.getISO3Country();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
// flaky:         org.junit.Assert.assertEquals(locale11.toString(), "\ub3c5\uc77c\uc5b4\ub3c5\uc77c)HI");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "CHN" + "'", str13, "CHN");
    }

    @Test
    public void test06625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06625");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\u5fb7\u56fd", "0.000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000035");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06626");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("en-US", " ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test06627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06627");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "Koreanisch (S\374dkorea)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06628");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("1.00E-98", "D");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06629");
        java.util.Locale locale0 = java.util.Locale.ENGLISH;
        java.lang.String str1 = locale0.getDisplayScript();
        java.lang.String str2 = locale0.getISO3Language();
        java.lang.String str3 = locale0.getLanguage();
        java.lang.String str4 = locale0.getScript();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "eng" + "'", str2, "eng");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "en" + "'", str3, "en");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test06630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06630");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("\u82f1\u8a9e");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u82f1\u8a9e" + "'", str1, "\u82f1\u8a9e");
    }

    @Test
    public void test06631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06631");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("\u56fd\u548c\u5171\u6c11\u4eba\u83ef\u4e2d\u56fd\u548c\u5171\u6c11\u4eba\u83ef\u4e2d\u56fd\u548c\u5171\u6c11\u4eba\u83ef\u4e2d\u56fd\u548c\u5171\u6c11\u4eba\u83ef\u4e2d\u56fd\u548c\u5171\u6c11\u4eba\u83ef\u4e2d\u56fd\u548c\u5171\u6c11\u4eba\u83ef\u4e2d\u56fd\u548c\u5171\u6c11\u4eba\u83ef\u4e2d\u56fd\u548c\u5171\u6c11\u4eba\u83ef\u4e2d\u56fd\u548c\u5171\u6c11\u4eba\u83ef\u4e2d\u56fd\u548c\u5171\u6c11\u4eba\u83ef\u4e2d\u56fd\u548c\u5171\u6c11\u4eba\u83ef\u4e2d\u56fd\u548c\u5171\u6c11\u4eba\u83ef\u4e2d", "     zh-cn");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u56fd\u548c\u5171\u6c11\u4eba\u83ef\u4e2d\u56fd\u548c\u5171\u6c11\u4eba\u83ef\u4e2d\u56fd\u548c\u5171\u6c11\u4eba\u83ef\u4e2d\u56fd\u548c\u5171\u6c11\u4eba\u83ef\u4e2d\u56fd\u548c\u5171\u6c11\u4eba\u83ef\u4e2d\u56fd\u548c\u5171\u6c11\u4eba\u83ef\u4e2d\u56fd\u548c\u5171\u6c11\u4eba\u83ef\u4e2d\u56fd\u548c\u5171\u6c11\u4eba\u83ef\u4e2d\u56fd\u548c\u5171\u6c11\u4eba\u83ef\u4e2d\u56fd\u548c\u5171\u6c11\u4eba\u83ef\u4e2d\u56fd\u548c\u5171\u6c11\u4eba\u83ef\u4e2d\u56fd\u548c\u5171\u6c11\u4eba\u83ef\u4e2d" + "'", str2, "\u56fd\u548c\u5171\u6c11\u4eba\u83ef\u4e2d\u56fd\u548c\u5171\u6c11\u4eba\u83ef\u4e2d\u56fd\u548c\u5171\u6c11\u4eba\u83ef\u4e2d\u56fd\u548c\u5171\u6c11\u4eba\u83ef\u4e2d\u56fd\u548c\u5171\u6c11\u4eba\u83ef\u4e2d\u56fd\u548c\u5171\u6c11\u4eba\u83ef\u4e2d\u56fd\u548c\u5171\u6c11\u4eba\u83ef\u4e2d\u56fd\u548c\u5171\u6c11\u4eba\u83ef\u4e2d\u56fd\u548c\u5171\u6c11\u4eba\u83ef\u4e2d\u56fd\u548c\u5171\u6c11\u4eba\u83ef\u4e2d\u56fd\u548c\u5171\u6c11\u4eba\u83ef\u4e2d\u56fd\u548c\u5171\u6c11\u4eba\u83ef\u4e2d");
    }

    @Test
    public void test06632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06632");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("ENGLISH", "0.000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000035");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ENGLISH" + "'", str2, "ENGLISH");
    }

    @Test
    public void test06633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06633");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IHXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "\u4e2d\u6587\ub3c5\uc77c\uc5b4\ub3c5\uc77c))");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IHXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX" + "'", str2, "IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IHXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
    }

    @Test
    public void test06634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06634");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.endsWithAny("10", strArray3);
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test06635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06635");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.TEN;
        long long1 = bigDecimal0.longValueExact();
        int int2 = bigDecimal0.intValue();
        short short3 = bigDecimal0.shortValue();
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 10L + "'", long1 == 10L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test06636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06636");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.TEN;
        long long1 = bigDecimal0.longValueExact();
        int int2 = bigDecimal0.intValue();
        java.math.BigDecimal bigDecimal4 = bigDecimal0.scaleByPowerOfTen(0);
        java.math.BigDecimal bigDecimal5 = java.math.BigDecimal.TEN;
        long long6 = bigDecimal5.longValueExact();
        java.math.BigDecimal bigDecimal7 = bigDecimal5.ulp();
        java.math.BigDecimal bigDecimal8 = bigDecimal4.remainder(bigDecimal7);
        java.math.BigDecimal bigDecimal9 = java.math.BigDecimal.ZERO;
        double double10 = bigDecimal9.doubleValue();
        java.math.BigInteger bigInteger11 = bigDecimal9.toBigInteger();
        byte[] byteArray14 = new byte[] { (byte) 1 };
        byte byte15 = org.apache.commons.lang3.math.NumberUtils.min(byteArray14);
        java.math.BigInteger bigInteger16 = new java.math.BigInteger((int) (short) -1, byteArray14);
        java.math.BigInteger bigInteger18 = bigInteger16.pow((int) 'a');
        byte[] byteArray19 = bigInteger16.toByteArray();
        long long20 = bigInteger16.longValueExact();
        java.math.BigInteger bigInteger21 = bigInteger11.or(bigInteger16);
        byte byte22 = bigInteger16.byteValueExact();
        java.math.BigDecimal bigDecimal24 = new java.math.BigDecimal(bigInteger16, (int) (byte) 0);
        java.math.BigDecimal bigDecimal26 = new java.math.BigDecimal(bigInteger16, (int) '#');
        java.math.BigDecimal bigDecimal27 = bigDecimal8.subtract(bigDecimal26);
        java.math.BigDecimal bigDecimal29 = new java.math.BigDecimal((double) 1L);
        java.math.BigDecimal bigDecimal30 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal31 = bigDecimal30.negate();
        java.math.BigDecimal bigDecimal34 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal35 = bigDecimal31.subtract(bigDecimal34);
        java.lang.String str36 = bigDecimal31.toPlainString();
        java.math.BigDecimal bigDecimal37 = java.math.BigDecimal.ZERO;
        double double38 = bigDecimal37.doubleValue();
        java.math.BigDecimal bigDecimal40 = bigDecimal37.movePointLeft((int) (byte) -1);
        java.math.BigInteger bigInteger41 = bigDecimal37.unscaledValue();
        long long42 = bigDecimal37.longValue();
        java.math.BigDecimal bigDecimal43 = bigDecimal31.subtract(bigDecimal37);
        double double44 = bigDecimal37.doubleValue();
        java.math.BigDecimal bigDecimal45 = bigDecimal29.min(bigDecimal37);
        java.math.BigDecimal bigDecimal47 = java.math.BigDecimal.valueOf((long) (byte) 0);
        byte byte48 = bigDecimal47.byteValueExact();
        java.math.BigDecimal bigDecimal50 = bigDecimal47.pow(2);
        java.math.BigDecimal bigDecimal51 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal52 = bigDecimal51.negate();
        java.math.BigDecimal bigDecimal53 = java.math.BigDecimal.TEN;
        long long54 = bigDecimal53.longValueExact();
        java.math.BigDecimal bigDecimal55 = bigDecimal53.ulp();
        java.lang.String str56 = bigDecimal53.toString();
        int int57 = bigDecimal51.compareTo(bigDecimal53);
        java.math.BigDecimal bigDecimal59 = java.math.BigDecimal.valueOf((long) (byte) 100);
        java.math.BigDecimal bigDecimal61 = bigDecimal53.divide(bigDecimal59, (int) (short) 1);
        java.math.BigDecimal bigDecimal62 = bigDecimal50.add(bigDecimal53);
        java.math.BigDecimal bigDecimal63 = bigDecimal37.subtract(bigDecimal62);
        int int64 = bigDecimal26.compareTo(bigDecimal63);
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 10L + "'", long1 == 10L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal7);
        org.junit.Assert.assertNotNull(bigDecimal8);
        org.junit.Assert.assertNotNull(bigDecimal9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(bigInteger11);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[1]");
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) 1 + "'", byte15 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger18);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[-1]");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
        org.junit.Assert.assertNotNull(bigInteger21);
        org.junit.Assert.assertTrue("'" + byte22 + "' != '" + (byte) -1 + "'", byte22 == (byte) -1);
        org.junit.Assert.assertNotNull(bigDecimal27);
        org.junit.Assert.assertNotNull(bigDecimal30);
        org.junit.Assert.assertNotNull(bigDecimal31);
        org.junit.Assert.assertNotNull(bigDecimal34);
        org.junit.Assert.assertNotNull(bigDecimal35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "0" + "'", str36, "0");
        org.junit.Assert.assertNotNull(bigDecimal37);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertNotNull(bigDecimal40);
        org.junit.Assert.assertNotNull(bigInteger41);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertNotNull(bigDecimal43);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
        org.junit.Assert.assertNotNull(bigDecimal45);
        org.junit.Assert.assertNotNull(bigDecimal47);
        org.junit.Assert.assertTrue("'" + byte48 + "' != '" + (byte) 0 + "'", byte48 == (byte) 0);
        org.junit.Assert.assertNotNull(bigDecimal50);
        org.junit.Assert.assertNotNull(bigDecimal51);
        org.junit.Assert.assertNotNull(bigDecimal52);
        org.junit.Assert.assertNotNull(bigDecimal53);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 10L + "'", long54 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "10" + "'", str56, "10");
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertNotNull(bigDecimal59);
        org.junit.Assert.assertNotNull(bigDecimal61);
        org.junit.Assert.assertNotNull(bigDecimal62);
        org.junit.Assert.assertNotNull(bigDecimal63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 1 + "'", int64 == 1);
    }

    @Test
    public void test06637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06637");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal2 = bigDecimal0.negate();
        java.lang.String str3 = bigDecimal0.toString();
        java.math.BigDecimal bigDecimal5 = bigDecimal0.scaleByPowerOfTen(0);
        java.math.BigDecimal bigDecimal6 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal7 = bigDecimal6.negate();
        java.math.BigDecimal bigDecimal8 = java.math.BigDecimal.TEN;
        long long9 = bigDecimal8.longValueExact();
        java.math.BigDecimal bigDecimal10 = bigDecimal8.ulp();
        java.lang.String str11 = bigDecimal8.toString();
        int int12 = bigDecimal6.compareTo(bigDecimal8);
        java.math.BigDecimal bigDecimal14 = java.math.BigDecimal.valueOf((long) (byte) 100);
        java.math.BigDecimal bigDecimal16 = bigDecimal8.divide(bigDecimal14, (int) (short) 1);
        java.math.BigDecimal bigDecimal17 = java.math.BigDecimal.TEN;
        long long18 = bigDecimal17.longValueExact();
        java.math.BigDecimal bigDecimal19 = bigDecimal16.max(bigDecimal17);
        java.math.BigDecimal bigDecimal20 = bigDecimal0.add(bigDecimal16);
        java.math.MathContext mathContext21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal22 = bigDecimal16.plus(mathContext21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0" + "'", str3, "0");
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigDecimal6);
        org.junit.Assert.assertNotNull(bigDecimal7);
        org.junit.Assert.assertNotNull(bigDecimal8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "10" + "'", str11, "10");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(bigDecimal14);
        org.junit.Assert.assertNotNull(bigDecimal16);
        org.junit.Assert.assertNotNull(bigDecimal17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10L + "'", long18 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal19);
        org.junit.Assert.assertNotNull(bigDecimal20);
    }

    @Test
    public void test06638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06638");
        byte[] byteArray2 = new byte[] { (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.math.BigInteger bigInteger4 = new java.math.BigInteger((int) (short) -1, byteArray2);
        java.math.BigInteger bigInteger6 = bigInteger4.pow((int) 'a');
        java.math.BigInteger bigInteger8 = bigInteger4.shiftLeft((int) (short) 1);
        int int9 = bigInteger8.intValueExact();
        java.math.BigInteger bigInteger10 = bigInteger8.abs();
        java.math.BigDecimal bigDecimal11 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal12 = bigDecimal11.negate();
        java.math.BigDecimal bigDecimal15 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal16 = bigDecimal12.subtract(bigDecimal15);
        java.math.BigInteger bigInteger17 = bigDecimal16.toBigInteger();
        byte[] byteArray18 = bigInteger17.toByteArray();
        java.math.BigDecimal bigDecimal19 = new java.math.BigDecimal(bigInteger17);
        byte[] byteArray22 = new byte[] { (byte) 1 };
        byte byte23 = org.apache.commons.lang3.math.NumberUtils.min(byteArray22);
        java.math.BigInteger bigInteger24 = new java.math.BigInteger((int) (short) -1, byteArray22);
        java.math.BigInteger bigInteger26 = bigInteger24.pow((int) 'a');
        java.math.BigInteger bigInteger28 = bigInteger24.shiftLeft((int) (short) 1);
        int int29 = bigInteger28.intValueExact();
        java.math.BigInteger bigInteger30 = bigInteger28.abs();
        java.math.BigInteger bigInteger31 = bigInteger17.min(bigInteger28);
        java.math.BigInteger bigInteger32 = bigInteger8.xor(bigInteger28);
        java.math.BigInteger bigInteger33 = bigInteger32.not();
        boolean boolean35 = bigInteger32.testBit((int) 'u');
        boolean boolean37 = bigInteger32.isProbablePrime((int) (byte) -2);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertNotNull(bigInteger8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2) + "'", int9 == (-2));
        org.junit.Assert.assertNotNull(bigInteger10);
        org.junit.Assert.assertNotNull(bigDecimal11);
        org.junit.Assert.assertNotNull(bigDecimal12);
        org.junit.Assert.assertNotNull(bigDecimal15);
        org.junit.Assert.assertNotNull(bigDecimal16);
        org.junit.Assert.assertNotNull(bigInteger17);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[0]");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[1]");
        org.junit.Assert.assertTrue("'" + byte23 + "' != '" + (byte) 1 + "'", byte23 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger26);
        org.junit.Assert.assertNotNull(bigInteger28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-2) + "'", int29 == (-2));
        org.junit.Assert.assertNotNull(bigInteger30);
        org.junit.Assert.assertNotNull(bigInteger31);
        org.junit.Assert.assertNotNull(bigInteger32);
        org.junit.Assert.assertNotNull(bigInteger33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test06639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06639");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal5 = bigDecimal1.subtract(bigDecimal4);
        java.math.BigInteger bigInteger6 = bigDecimal5.toBigInteger();
        double double7 = bigInteger6.doubleValue();
        byte[] byteArray10 = new byte[] { (byte) 1 };
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.min(byteArray10);
        java.math.BigInteger bigInteger12 = new java.math.BigInteger((int) (short) -1, byteArray10);
        java.math.BigInteger bigInteger13 = bigInteger6.gcd(bigInteger12);
        java.math.BigDecimal bigDecimal14 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal15 = bigDecimal14.negate();
        java.math.BigDecimal bigDecimal18 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal19 = bigDecimal15.subtract(bigDecimal18);
        java.math.BigInteger bigInteger20 = bigDecimal19.toBigInteger();
        java.math.BigInteger bigInteger21 = bigInteger12.or(bigInteger20);
        java.math.BigInteger bigInteger23 = bigInteger20.shiftRight((int) (short) -1);
        java.math.BigDecimal bigDecimal24 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal25 = bigDecimal24.negate();
        java.math.BigDecimal bigDecimal28 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal29 = bigDecimal25.subtract(bigDecimal28);
        java.math.BigInteger bigInteger30 = bigDecimal29.toBigInteger();
        double double31 = bigInteger30.doubleValue();
        byte[] byteArray34 = new byte[] { (byte) 1 };
        byte byte35 = org.apache.commons.lang3.math.NumberUtils.min(byteArray34);
        java.math.BigInteger bigInteger36 = new java.math.BigInteger((int) (short) -1, byteArray34);
        java.math.BigInteger bigInteger37 = bigInteger30.gcd(bigInteger36);
        java.math.BigDecimal bigDecimal38 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal39 = bigDecimal38.negate();
        java.math.BigDecimal bigDecimal42 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal43 = bigDecimal39.subtract(bigDecimal42);
        java.math.BigInteger bigInteger44 = bigDecimal43.toBigInteger();
        java.math.BigInteger bigInteger45 = bigInteger36.or(bigInteger44);
        java.math.BigInteger bigInteger47 = bigInteger44.shiftRight((int) (short) -1);
        java.math.BigInteger bigInteger48 = bigInteger23.max(bigInteger44);
        java.math.BigInteger bigInteger50 = bigInteger44.shiftLeft((-1));
        byte[] byteArray53 = new byte[] { (byte) 1 };
        byte byte54 = org.apache.commons.lang3.math.NumberUtils.min(byteArray53);
        java.math.BigInteger bigInteger55 = new java.math.BigInteger((int) (short) -1, byteArray53);
        java.math.BigInteger bigInteger57 = bigInteger55.pow((int) 'a');
        byte[] byteArray58 = bigInteger55.toByteArray();
        long long59 = bigInteger55.longValueExact();
        java.lang.String str61 = bigInteger55.toString(0);
        int int62 = bigInteger55.intValueExact();
        java.math.BigDecimal bigDecimal63 = new java.math.BigDecimal(bigInteger55);
        java.math.BigInteger bigInteger64 = bigInteger50.subtract(bigInteger55);
        java.math.BigDecimal bigDecimal65 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal66 = bigDecimal65.negate();
        java.math.BigDecimal bigDecimal67 = bigDecimal65.negate();
        int int68 = bigDecimal67.intValueExact();
        java.math.BigInteger bigInteger69 = bigDecimal67.toBigInteger();
        java.math.BigInteger bigInteger70 = bigInteger55.min(bigInteger69);
        java.math.BigInteger bigInteger72 = bigInteger70.clearBit((int) (short) 1024);
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[1]");
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 1 + "'", byte11 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger13);
        org.junit.Assert.assertNotNull(bigDecimal14);
        org.junit.Assert.assertNotNull(bigDecimal15);
        org.junit.Assert.assertNotNull(bigDecimal18);
        org.junit.Assert.assertNotNull(bigDecimal19);
        org.junit.Assert.assertNotNull(bigInteger20);
        org.junit.Assert.assertNotNull(bigInteger21);
        org.junit.Assert.assertNotNull(bigInteger23);
        org.junit.Assert.assertNotNull(bigDecimal24);
        org.junit.Assert.assertNotNull(bigDecimal25);
        org.junit.Assert.assertNotNull(bigDecimal28);
        org.junit.Assert.assertNotNull(bigDecimal29);
        org.junit.Assert.assertNotNull(bigInteger30);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[1]");
        org.junit.Assert.assertTrue("'" + byte35 + "' != '" + (byte) 1 + "'", byte35 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger37);
        org.junit.Assert.assertNotNull(bigDecimal38);
        org.junit.Assert.assertNotNull(bigDecimal39);
        org.junit.Assert.assertNotNull(bigDecimal42);
        org.junit.Assert.assertNotNull(bigDecimal43);
        org.junit.Assert.assertNotNull(bigInteger44);
        org.junit.Assert.assertNotNull(bigInteger45);
        org.junit.Assert.assertNotNull(bigInteger47);
        org.junit.Assert.assertNotNull(bigInteger48);
        org.junit.Assert.assertNotNull(bigInteger50);
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray53), "[1]");
        org.junit.Assert.assertTrue("'" + byte54 + "' != '" + (byte) 1 + "'", byte54 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger57);
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray58), "[-1]");
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + (-1L) + "'", long59 == (-1L));
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "-1" + "'", str61, "-1");
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertNotNull(bigInteger64);
        org.junit.Assert.assertNotNull(bigDecimal65);
        org.junit.Assert.assertNotNull(bigDecimal66);
        org.junit.Assert.assertNotNull(bigDecimal67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNotNull(bigInteger69);
        org.junit.Assert.assertNotNull(bigInteger70);
        org.junit.Assert.assertNotNull(bigInteger72);
    }

    @Test
    public void test06640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06640");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, '4');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test06641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06641");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("UNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUND", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUND" + "'", str2, "UNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUNDUND");
    }

    @Test
    public void test06642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06642");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("0000");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06643");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        double double1 = bigDecimal0.doubleValue();
        java.math.BigInteger bigInteger2 = bigDecimal0.toBigInteger();
        java.math.BigInteger bigInteger4 = bigInteger2.setBit(4);
        java.math.BigDecimal bigDecimal5 = java.math.BigDecimal.ZERO;
        double double6 = bigDecimal5.doubleValue();
        java.math.BigInteger bigInteger7 = bigDecimal5.toBigInteger();
        byte[] byteArray10 = new byte[] { (byte) 1 };
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.min(byteArray10);
        java.math.BigInteger bigInteger12 = new java.math.BigInteger((int) (short) -1, byteArray10);
        java.math.BigInteger bigInteger14 = bigInteger12.pow((int) 'a');
        byte[] byteArray15 = bigInteger12.toByteArray();
        long long16 = bigInteger12.longValueExact();
        java.math.BigInteger bigInteger17 = bigInteger7.or(bigInteger12);
        java.math.BigInteger bigInteger18 = bigInteger2.multiply(bigInteger17);
        java.math.BigInteger bigInteger19 = bigInteger18.nextProbablePrime();
        java.math.BigInteger bigInteger20 = bigInteger18.not();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = bigInteger20.testBit((int) (byte) -33);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Negative bit address");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(bigInteger2);
        org.junit.Assert.assertNotNull(bigInteger4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(bigInteger7);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[1]");
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 1 + "'", byte11 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[-1]");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertNotNull(bigInteger17);
        org.junit.Assert.assertNotNull(bigInteger18);
        org.junit.Assert.assertNotNull(bigInteger19);
        org.junit.Assert.assertNotNull(bigInteger20);
    }

    @Test
    public void test06644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06644");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "JapanesezhJapanesezhJapanesezhJapanesezhJapanesezhJapanesezhJapanesezhJapanesezhJapanesezhJapanesezhJapanesezhJapanesezhJapanesezhJapanesezhJapanesezhJapanesezhJapanesezhJapanesezhJapanesezhJapanesezhJapanesezhJapanesezhJapanesezhJapanesezhJapanesezhJapanesezhJapanesezhJapanesezhJapanesezhJapanesezhJapanesezhJapanesezhJapanese");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JapanesezhJapanesezhJapanesezhJapanesezhJapanesezhJapanesezhJapanesezhJapanesezhJapanesezhJapanesezhJapanesezhJapanesezhJapanesezhJapanesezhJapanesezhJapanesezhJapanesezhJapanesezhJapanesezhJapanesezhJapanesezhJapanesezhJapanesezhJapanesezhJapanesezhJapanesezhJapanesezhJapanesezhJapanesezhJapanesezhJapanesezhJapanesezhJapanese" + "'", str1, "JapanesezhJapanesezhJapanesezhJapanesezhJapanesezhJapanesezhJapanesezhJapanesezhJapanesezhJapanesezhJapanesezhJapanesezhJapanesezhJapanesezhJapanesezhJapanesezhJapanesezhJapanesezhJapanesezhJapanesezhJapanesezhJapanesezhJapanesezhJapanesezhJapanesezhJapanesezhJapanesezhJapanesezhJapanesezhJapanesezhJapanesezhJapanesezhJapanese");
    }

    @Test
    public void test06645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06645");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        double double1 = bigDecimal0.doubleValue();
        java.math.BigDecimal bigDecimal3 = bigDecimal0.movePointLeft((int) (byte) -1);
        java.math.BigDecimal bigDecimal5 = bigDecimal0.movePointRight((int) (short) 1);
        java.math.BigDecimal bigDecimal6 = java.math.BigDecimal.ZERO;
        double double7 = bigDecimal6.doubleValue();
        int int8 = bigDecimal5.compareTo(bigDecimal6);
        java.math.BigDecimal bigDecimal9 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal10 = bigDecimal9.negate();
        java.math.BigDecimal bigDecimal11 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal12 = bigDecimal11.negate();
        java.math.BigDecimal bigDecimal13 = bigDecimal11.negate();
        java.lang.String str14 = bigDecimal13.toEngineeringString();
        java.math.BigDecimal bigDecimal15 = bigDecimal10.multiply(bigDecimal13);
        java.math.BigDecimal bigDecimal17 = bigDecimal10.movePointLeft(0);
        java.math.MathContext mathContext18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal19 = bigDecimal5.subtract(bigDecimal10, mathContext18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(bigDecimal3);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigDecimal6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(bigDecimal9);
        org.junit.Assert.assertNotNull(bigDecimal10);
        org.junit.Assert.assertNotNull(bigDecimal11);
        org.junit.Assert.assertNotNull(bigDecimal12);
        org.junit.Assert.assertNotNull(bigDecimal13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0" + "'", str14, "0");
        org.junit.Assert.assertNotNull(bigDecimal15);
        org.junit.Assert.assertNotNull(bigDecimal17);
    }

    @Test
    public void test06646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06646");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("\u30d5\u30e9\u30f3\u30b9\u8a9e\u30d5\u30e9\u30f3\u30b9)", 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test06647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06647");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setLanguageTag("eng");
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale locale4 = java.util.Locale.FRANCE;
        java.util.Locale.Builder builder5 = builder3.setLocale(locale4);
        java.util.Locale.Builder builder6 = builder3.clear();
        java.util.Locale.Builder builder7 = builder3.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder7.setLanguage("\u82f1\u6587\u82f1\u56fd)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: aaa?? (??) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test06648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06648");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 0, (short) (byte) 34, (short) (byte) 2);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 34 + "'", short3 == (short) 34);
    }

    @Test
    public void test06649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06649");
        java.util.Locale locale0 = java.util.Locale.JAPAN;
        java.lang.String str1 = locale0.getScript();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ja_JP");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test06650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06650");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setLanguageTag("eng");
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale locale4 = java.util.Locale.FRANCE;
        java.util.Locale.Builder builder5 = builder3.setLocale(locale4);
        java.util.Locale locale6 = java.util.Locale.FRENCH;
        java.lang.String str7 = locale6.getVariant();
        java.util.Locale locale8 = locale6.stripExtensions();
        java.lang.String str9 = locale8.getDisplayCountry();
        java.util.Locale locale10 = locale8.stripExtensions();
        java.lang.String str11 = locale8.getDisplayLanguage();
        java.util.Locale.Builder builder12 = builder5.setLocale(locale8);
        java.util.Locale.Builder builder13 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder15 = builder13.setLanguageTag("eng");
        java.util.Locale.Builder builder16 = builder15.clearExtensions();
        java.util.Locale locale17 = java.util.Locale.FRANCE;
        java.util.Locale.Builder builder18 = builder16.setLocale(locale17);
        java.util.Locale.Builder builder20 = builder18.addUnicodeLocaleAttribute("engcn");
        java.util.Locale locale21 = builder18.build();
        java.util.Locale.Builder builder22 = builder5.setLocale(locale21);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder24 = builder5.setLanguageTag("#_HI!");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: #_HI! [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\u6cd5\u6587" + "'", str11, "\u6cd5\u6587");
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "fr_FR_#u-engcn");
        org.junit.Assert.assertNotNull(builder22);
    }

    @Test
    public void test06651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06651");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "-2-2-zh-C                                                                                                            ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06652");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 16, (short) (byte) 100, (short) 16);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test06653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06653");
        char[] charArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\uc5b4\uad6d\ud55c\u6cd5\u6587\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd)", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06654");
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.valueOf((long) (-1), (int) 'u');
        java.math.BigDecimal bigDecimal3 = java.math.BigDecimal.ONE;
        java.math.BigDecimal bigDecimal4 = bigDecimal3.abs();
        java.math.BigDecimal bigDecimal5 = bigDecimal2.min(bigDecimal4);
        java.math.BigInteger bigInteger6 = bigDecimal5.unscaledValue();
        short short7 = bigInteger6.shortValueExact();
        java.math.BigInteger bigInteger9 = bigInteger6.shiftLeft((int) (short) 10);
        java.math.BigInteger bigInteger10 = bigInteger6.not();
        org.junit.Assert.assertNotNull(bigDecimal2);
        org.junit.Assert.assertNotNull(bigDecimal3);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) -1 + "'", short7 == (short) -1);
        org.junit.Assert.assertNotNull(bigInteger9);
        org.junit.Assert.assertNotNull(bigInteger10);
    }

    @Test
    public void test06655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06655");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "_         ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06656");
        java.util.Locale locale2 = new java.util.Locale("10.0E-99", "0");
        java.lang.String str3 = locale2.getDisplayScript();
        org.junit.Assert.assertEquals(locale2.toString(), "10.0e-99_0");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test06657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06657");
        java.util.Locale locale0 = java.util.Locale.PRC;
        java.util.Locale locale1 = null;
        java.lang.String str2 = locale0.getDisplayScript(locale1);
        java.lang.String str3 = locale0.getScript();
        java.lang.String str4 = locale0.getDisplayScript();
        java.util.Locale.setDefault(locale0);
        java.util.Locale locale7 = java.util.Locale.FRANCE;
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.upperCase("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!", locale7);
        java.lang.String str9 = locale7.getCountry();
        java.lang.String str10 = locale7.getVariant();
        java.util.Locale locale11 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str12 = locale7.getDisplayLanguage(locale11);
        java.lang.String str13 = locale7.getISO3Country();
        java.lang.String str14 = locale0.getDisplayScript(locale7);
        java.util.Locale.Builder builder15 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder17 = builder15.setLanguageTag("eng");
        java.util.Locale.Builder builder18 = builder17.clearExtensions();
        java.util.Locale locale19 = java.util.Locale.FRANCE;
        java.util.Locale.Builder builder20 = builder18.setLocale(locale19);
        java.util.Locale locale21 = java.util.Locale.FRENCH;
        java.lang.String str22 = locale21.getVariant();
        java.util.Locale locale23 = locale21.stripExtensions();
        java.lang.String str24 = locale23.getDisplayCountry();
        java.util.Locale locale25 = locale23.stripExtensions();
        java.lang.String str26 = locale23.getDisplayLanguage();
        java.util.Locale.Builder builder27 = builder20.setLocale(locale23);
        java.lang.String str28 = locale7.getDisplayScript(locale23);
        java.util.Locale.setDefault(locale23);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!!" + "'", str8, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "FR" + "'", str9, "FR");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\u6cd5\u6587" + "'", str12, "\u6cd5\u6587");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "FRA" + "'", str13, "FRA");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\u6cd5\u6587" + "'", str26, "\u6cd5\u6587");
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test06658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06658");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("\u82f1\u6587\u82f1\u56fd", "fra ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06659");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("fra", "eng", "English (United Kingdom)", (int) 'a');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "fra" + "'", str4, "fra");
    }

    @Test
    public void test06660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06660");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.min(byteArray1);
        java.math.BigInteger bigInteger3 = new java.math.BigInteger(byteArray1);
        int int4 = bigInteger3.signum();
        java.math.BigDecimal bigDecimal5 = java.math.BigDecimal.ZERO;
        double double6 = bigDecimal5.doubleValue();
        java.math.BigInteger bigInteger7 = bigDecimal5.toBigInteger();
        byte[] byteArray10 = new byte[] { (byte) 1 };
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.min(byteArray10);
        java.math.BigInteger bigInteger12 = new java.math.BigInteger((int) (short) -1, byteArray10);
        java.math.BigInteger bigInteger14 = bigInteger12.pow((int) 'a');
        byte[] byteArray15 = bigInteger12.toByteArray();
        long long16 = bigInteger12.longValueExact();
        java.math.BigInteger bigInteger17 = bigInteger7.or(bigInteger12);
        byte[] byteArray20 = new byte[] { (byte) 1 };
        byte byte21 = org.apache.commons.lang3.math.NumberUtils.min(byteArray20);
        java.math.BigInteger bigInteger22 = new java.math.BigInteger((int) (short) -1, byteArray20);
        java.math.BigInteger bigInteger24 = bigInteger22.pow((int) 'a');
        byte[] byteArray25 = bigInteger22.toByteArray();
        long long26 = bigInteger22.longValueExact();
        java.lang.String str28 = bigInteger22.toString(0);
        int int29 = bigInteger22.intValueExact();
        java.math.BigInteger bigInteger30 = bigInteger17.subtract(bigInteger22);
        java.math.BigDecimal bigDecimal31 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal32 = bigDecimal31.negate();
        java.math.BigDecimal bigDecimal35 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal36 = bigDecimal32.subtract(bigDecimal35);
        java.math.BigInteger bigInteger37 = bigDecimal36.toBigInteger();
        java.math.BigInteger bigInteger38 = bigInteger37.negate();
        java.math.BigDecimal bigDecimal39 = java.math.BigDecimal.ZERO;
        double double40 = bigDecimal39.doubleValue();
        java.math.BigInteger bigInteger41 = bigDecimal39.toBigInteger();
        byte[] byteArray44 = new byte[] { (byte) 1 };
        byte byte45 = org.apache.commons.lang3.math.NumberUtils.min(byteArray44);
        java.math.BigInteger bigInteger46 = new java.math.BigInteger((int) (short) -1, byteArray44);
        java.math.BigInteger bigInteger48 = bigInteger46.pow((int) 'a');
        byte[] byteArray49 = bigInteger46.toByteArray();
        long long50 = bigInteger46.longValueExact();
        java.math.BigInteger bigInteger51 = bigInteger41.or(bigInteger46);
        byte[] byteArray54 = new byte[] { (byte) 1 };
        byte byte55 = org.apache.commons.lang3.math.NumberUtils.min(byteArray54);
        java.math.BigInteger bigInteger56 = new java.math.BigInteger((int) (short) -1, byteArray54);
        java.math.BigInteger bigInteger58 = bigInteger56.pow((int) 'a');
        byte[] byteArray59 = bigInteger56.toByteArray();
        long long60 = bigInteger56.longValueExact();
        java.lang.String str62 = bigInteger56.toString(0);
        int int63 = bigInteger56.intValueExact();
        java.math.BigInteger bigInteger64 = bigInteger51.subtract(bigInteger56);
        java.math.BigInteger bigInteger65 = bigInteger37.min(bigInteger51);
        java.math.BigInteger bigInteger66 = bigInteger30.gcd(bigInteger65);
        byte[] byteArray69 = new byte[] { (byte) 1 };
        byte byte70 = org.apache.commons.lang3.math.NumberUtils.min(byteArray69);
        java.math.BigInteger bigInteger71 = new java.math.BigInteger((int) (short) -1, byteArray69);
        java.math.BigInteger bigInteger73 = bigInteger71.pow((int) 'a');
        int int74 = bigInteger73.bitLength();
        java.math.BigInteger bigInteger75 = bigInteger65.max(bigInteger73);
        java.math.BigInteger[] bigIntegerArray76 = bigInteger3.divideAndRemainder(bigInteger75);
        java.lang.String str77 = bigInteger75.toString();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[1]");
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2 == (byte) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(bigInteger7);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[1]");
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 1 + "'", byte11 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[-1]");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertNotNull(bigInteger17);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[1]");
        org.junit.Assert.assertTrue("'" + byte21 + "' != '" + (byte) 1 + "'", byte21 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger24);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[-1]");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-1L) + "'", long26 == (-1L));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "-1" + "'", str28, "-1");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(bigInteger30);
        org.junit.Assert.assertNotNull(bigDecimal31);
        org.junit.Assert.assertNotNull(bigDecimal32);
        org.junit.Assert.assertNotNull(bigDecimal35);
        org.junit.Assert.assertNotNull(bigDecimal36);
        org.junit.Assert.assertNotNull(bigInteger37);
        org.junit.Assert.assertNotNull(bigInteger38);
        org.junit.Assert.assertNotNull(bigDecimal39);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertNotNull(bigInteger41);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray44), "[1]");
        org.junit.Assert.assertTrue("'" + byte45 + "' != '" + (byte) 1 + "'", byte45 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger48);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray49), "[-1]");
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + (-1L) + "'", long50 == (-1L));
        org.junit.Assert.assertNotNull(bigInteger51);
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray54), "[1]");
        org.junit.Assert.assertTrue("'" + byte55 + "' != '" + (byte) 1 + "'", byte55 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger58);
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray59), "[-1]");
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + (-1L) + "'", long60 == (-1L));
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "-1" + "'", str62, "-1");
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertNotNull(bigInteger64);
        org.junit.Assert.assertNotNull(bigInteger65);
        org.junit.Assert.assertNotNull(bigInteger66);
        org.junit.Assert.assertNotNull(byteArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray69), "[1]");
        org.junit.Assert.assertTrue("'" + byte70 + "' != '" + (byte) 1 + "'", byte70 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertNotNull(bigInteger75);
        org.junit.Assert.assertNotNull(bigIntegerArray76);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "-1" + "'", str77, "-1");
    }

    @Test
    public void test06661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06661");
        java.util.Locale locale2 = new java.util.Locale("0.0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000100");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.lowerCase("             HI!UUU             ", locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "0.0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000100");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "             hi!uuu             " + "'", str3, "             hi!uuu             ");
    }

    @Test
    public void test06662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06662");
        byte[] byteArray2 = new byte[] { (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.math.BigInteger bigInteger4 = new java.math.BigInteger((int) (short) -1, byteArray2);
        java.math.BigInteger bigInteger6 = bigInteger4.pow((int) 'a');
        byte[] byteArray7 = bigInteger4.toByteArray();
        long long8 = bigInteger4.longValueExact();
        java.lang.String str10 = bigInteger4.toString(0);
        byte[] byteArray13 = new byte[] { (byte) 1 };
        byte byte14 = org.apache.commons.lang3.math.NumberUtils.min(byteArray13);
        java.math.BigInteger bigInteger15 = new java.math.BigInteger((int) (short) -1, byteArray13);
        java.math.BigInteger bigInteger16 = bigInteger4.and(bigInteger15);
        java.math.BigInteger bigInteger17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger18 = bigInteger16.add(bigInteger17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1]");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1" + "'", str10, "-1");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[1]");
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) 1 + "'", byte14 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger16);
    }

    @Test
    public void test06663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06663");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("zho", (short) 34);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 34 + "'", short2 == (short) 34);
    }

    @Test
    public void test06664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06664");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setLanguageTag("eng");
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale.Builder builder4 = builder2.clear();
        java.util.Locale.Builder builder5 = builder2.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder5.setScript("\ud55c\uad6d\uc5b4");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: ???????? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test06665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06665");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "A");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test06666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06666");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal5 = bigDecimal1.subtract(bigDecimal4);
        java.math.BigInteger bigInteger6 = bigDecimal5.toBigInteger();
        java.math.BigInteger bigInteger7 = bigInteger6.negate();
        java.math.BigInteger bigInteger9 = bigInteger7.flipBit((int) (short) 0);
        byte byte10 = bigInteger9.byteValueExact();
        java.math.BigInteger bigInteger11 = bigInteger9.not();
        java.math.BigDecimal bigDecimal12 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal13 = bigDecimal12.negate();
        java.math.BigDecimal bigDecimal16 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal17 = bigDecimal13.subtract(bigDecimal16);
        java.math.BigInteger bigInteger18 = bigDecimal17.toBigInteger();
        double double19 = bigInteger18.doubleValue();
        byte[] byteArray22 = new byte[] { (byte) 1 };
        byte byte23 = org.apache.commons.lang3.math.NumberUtils.min(byteArray22);
        java.math.BigInteger bigInteger24 = new java.math.BigInteger((int) (short) -1, byteArray22);
        java.math.BigInteger bigInteger25 = bigInteger18.gcd(bigInteger24);
        java.math.BigDecimal bigDecimal26 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal27 = bigDecimal26.negate();
        java.math.BigDecimal bigDecimal30 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal31 = bigDecimal27.subtract(bigDecimal30);
        java.math.BigInteger bigInteger32 = bigDecimal31.toBigInteger();
        java.math.BigInteger bigInteger33 = bigInteger24.or(bigInteger32);
        short short34 = bigInteger24.shortValueExact();
        byte[] byteArray37 = new byte[] { (byte) 1 };
        byte byte38 = org.apache.commons.lang3.math.NumberUtils.min(byteArray37);
        java.math.BigInteger bigInteger39 = new java.math.BigInteger((int) (short) -1, byteArray37);
        java.math.BigInteger bigInteger41 = bigInteger39.pow((int) 'a');
        java.math.BigInteger bigInteger43 = bigInteger39.shiftLeft((int) (short) 1);
        java.math.BigInteger bigInteger44 = bigInteger24.xor(bigInteger43);
        int int45 = bigInteger43.intValue();
        java.math.BigDecimal bigDecimal46 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal47 = bigDecimal46.negate();
        java.math.BigDecimal bigDecimal50 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal51 = bigDecimal47.subtract(bigDecimal50);
        java.math.BigInteger bigInteger52 = bigDecimal51.toBigInteger();
        double double53 = bigInteger52.doubleValue();
        byte[] byteArray56 = new byte[] { (byte) 1 };
        byte byte57 = org.apache.commons.lang3.math.NumberUtils.min(byteArray56);
        java.math.BigInteger bigInteger58 = new java.math.BigInteger((int) (short) -1, byteArray56);
        java.math.BigInteger bigInteger59 = bigInteger52.gcd(bigInteger58);
        java.math.BigDecimal bigDecimal60 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal61 = bigDecimal60.negate();
        java.math.BigDecimal bigDecimal64 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal65 = bigDecimal61.subtract(bigDecimal64);
        java.math.BigInteger bigInteger66 = bigDecimal65.toBigInteger();
        java.math.BigInteger bigInteger67 = bigInteger58.or(bigInteger66);
        short short68 = bigInteger58.shortValueExact();
        boolean boolean70 = bigInteger58.testBit((int) (short) 0);
        int int71 = bigInteger58.bitCount();
        java.math.BigInteger[] bigIntegerArray72 = bigInteger43.divideAndRemainder(bigInteger58);
        int int73 = bigInteger43.bitLength();
        java.math.BigInteger bigInteger74 = bigInteger9.and(bigInteger43);
        java.math.BigInteger bigInteger75 = bigInteger9.abs();
        boolean boolean77 = bigInteger75.isProbablePrime(34);
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertNotNull(bigInteger7);
        org.junit.Assert.assertNotNull(bigInteger9);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 1 + "'", byte10 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger11);
        org.junit.Assert.assertNotNull(bigDecimal12);
        org.junit.Assert.assertNotNull(bigDecimal13);
        org.junit.Assert.assertNotNull(bigDecimal16);
        org.junit.Assert.assertNotNull(bigDecimal17);
        org.junit.Assert.assertNotNull(bigInteger18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[1]");
        org.junit.Assert.assertTrue("'" + byte23 + "' != '" + (byte) 1 + "'", byte23 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger25);
        org.junit.Assert.assertNotNull(bigDecimal26);
        org.junit.Assert.assertNotNull(bigDecimal27);
        org.junit.Assert.assertNotNull(bigDecimal30);
        org.junit.Assert.assertNotNull(bigDecimal31);
        org.junit.Assert.assertNotNull(bigInteger32);
        org.junit.Assert.assertNotNull(bigInteger33);
        org.junit.Assert.assertTrue("'" + short34 + "' != '" + (short) -1 + "'", short34 == (short) -1);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[1]");
        org.junit.Assert.assertTrue("'" + byte38 + "' != '" + (byte) 1 + "'", byte38 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger41);
        org.junit.Assert.assertNotNull(bigInteger43);
        org.junit.Assert.assertNotNull(bigInteger44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-2) + "'", int45 == (-2));
        org.junit.Assert.assertNotNull(bigDecimal46);
        org.junit.Assert.assertNotNull(bigDecimal47);
        org.junit.Assert.assertNotNull(bigDecimal50);
        org.junit.Assert.assertNotNull(bigDecimal51);
        org.junit.Assert.assertNotNull(bigInteger52);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray56), "[1]");
        org.junit.Assert.assertTrue("'" + byte57 + "' != '" + (byte) 1 + "'", byte57 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger59);
        org.junit.Assert.assertNotNull(bigDecimal60);
        org.junit.Assert.assertNotNull(bigDecimal61);
        org.junit.Assert.assertNotNull(bigDecimal64);
        org.junit.Assert.assertNotNull(bigDecimal65);
        org.junit.Assert.assertNotNull(bigInteger66);
        org.junit.Assert.assertNotNull(bigInteger67);
        org.junit.Assert.assertTrue("'" + short68 + "' != '" + (short) -1 + "'", short68 == (short) -1);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertNotNull(bigIntegerArray72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 1 + "'", int73 == 1);
        org.junit.Assert.assertNotNull(bigInteger74);
        org.junit.Assert.assertNotNull(bigInteger75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
    }

    @Test
    public void test06667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06667");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u82f1\u8a9e\u30a4\u30ae\u30ea" + "'", str1, "\u82f1\u8a9e\u30a4\u30ae\u30ea");
    }

    @Test
    public void test06668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06668");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        int int2 = bigDecimal1.signum();
        long long3 = bigDecimal1.longValue();
        int int4 = bigDecimal1.intValueExact();
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test06669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06669");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale.Builder builder1 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale locale3 = builder2.build();
        java.util.Locale.setDefault(category0, locale3);
        java.util.Locale locale5 = java.util.Locale.FRENCH;
        java.lang.String str6 = locale5.getVariant();
        java.util.Locale locale7 = locale5.stripExtensions();
        java.lang.String str8 = locale7.getDisplayCountry();
        java.util.Locale locale9 = locale7.stripExtensions();
        java.util.Locale.setDefault(category0, locale9);
        java.util.Locale locale12 = java.util.Locale.CANADA;
        java.util.Locale locale13 = java.util.Locale.GERMANY;
        java.util.Locale locale14 = java.util.Locale.PRC;
        java.lang.String str15 = locale13.getDisplayScript(locale14);
        java.util.Locale locale16 = java.util.Locale.JAPANESE;
        java.lang.String str17 = locale16.getISO3Language();
        java.lang.String str18 = locale13.getDisplayScript(locale16);
        java.lang.String str19 = locale12.getDisplayLanguage(locale13);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.lowerCase("#_ENG", locale12);
        java.util.Locale.setDefault(category0, locale12);
        java.util.Locale locale23 = new java.util.Locale("South Koreaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        java.lang.String str24 = locale12.getDisplayVariant(locale23);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "jpn" + "'", str17, "jpn");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Englisch" + "'", str19, "Englisch");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "#_eng" + "'", str20, "#_eng");
        org.junit.Assert.assertEquals(locale23.toString(), "south koreaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test06670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06670");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        double double1 = bigDecimal0.doubleValue();
        java.math.BigInteger bigInteger2 = bigDecimal0.toBigInteger();
        byte[] byteArray5 = new byte[] { (byte) 1 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        java.math.BigInteger bigInteger7 = new java.math.BigInteger((int) (short) -1, byteArray5);
        java.math.BigInteger bigInteger9 = bigInteger7.pow((int) 'a');
        byte[] byteArray10 = bigInteger7.toByteArray();
        long long11 = bigInteger7.longValueExact();
        java.math.BigInteger bigInteger12 = bigInteger2.or(bigInteger7);
        byte byte13 = bigInteger7.byteValueExact();
        java.math.BigDecimal bigDecimal15 = new java.math.BigDecimal(bigInteger7, (int) (byte) 0);
        int int16 = bigInteger7.signum();
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(bigInteger2);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1]");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 1 + "'", byte6 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger9);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[-1]");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(bigInteger12);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) -1 + "'", byte13 == (byte) -1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test06671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06671");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("hi", "en");
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("en-US", "fra", 4);
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.split("", "h", 4);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("", strArray9, strArray13);
        java.lang.String[] strArray17 = org.apache.commons.lang3.StringUtils.split("\u4e2d\u6587", 'u');
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray17, "", 10, (-2));
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("zhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhoz", strArray13, strArray17);
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("3.01E-50", strArray3, strArray13);
        java.lang.String[] strArray24 = org.apache.commons.lang3.StringUtils.stripAll(strArray13);
        java.lang.String str25 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray13);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "zhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhoz" + "'", str22, "zhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhoz");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "3.01E-50" + "'", str23, "3.01E-50");
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test06672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06672");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "-2-2-zh-C                                                                                                            ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 117 + "'", int1 == 117);
    }

    @Test
    public void test06673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06673");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal5 = bigDecimal1.subtract(bigDecimal4);
        java.math.BigInteger bigInteger6 = bigDecimal5.toBigInteger();
        double double7 = bigInteger6.doubleValue();
        byte[] byteArray10 = new byte[] { (byte) 1 };
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.min(byteArray10);
        java.math.BigInteger bigInteger12 = new java.math.BigInteger((int) (short) -1, byteArray10);
        java.math.BigInteger bigInteger13 = bigInteger6.gcd(bigInteger12);
        java.math.BigDecimal bigDecimal14 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal15 = bigDecimal14.negate();
        java.math.BigDecimal bigDecimal18 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal19 = bigDecimal15.subtract(bigDecimal18);
        java.math.BigInteger bigInteger20 = bigDecimal19.toBigInteger();
        java.math.BigInteger bigInteger21 = bigInteger12.or(bigInteger20);
        byte[] byteArray22 = bigInteger21.toByteArray();
        byte[] byteArray24 = new byte[] { (byte) 1 };
        byte byte25 = org.apache.commons.lang3.math.NumberUtils.min(byteArray24);
        java.math.BigInteger bigInteger26 = new java.math.BigInteger(byteArray24);
        java.math.BigDecimal bigDecimal27 = new java.math.BigDecimal(bigInteger26);
        short short28 = bigInteger26.shortValueExact();
        int int29 = bigInteger26.bitLength();
        java.math.BigInteger[] bigIntegerArray30 = bigInteger21.divideAndRemainder(bigInteger26);
        java.math.BigDecimal bigDecimal31 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal32 = bigDecimal31.negate();
        java.math.BigDecimal bigDecimal35 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal36 = bigDecimal32.subtract(bigDecimal35);
        java.math.BigInteger bigInteger37 = bigDecimal36.toBigInteger();
        double double38 = bigInteger37.doubleValue();
        byte[] byteArray41 = new byte[] { (byte) 1 };
        byte byte42 = org.apache.commons.lang3.math.NumberUtils.min(byteArray41);
        java.math.BigInteger bigInteger43 = new java.math.BigInteger((int) (short) -1, byteArray41);
        java.math.BigInteger bigInteger44 = bigInteger37.gcd(bigInteger43);
        java.math.BigInteger bigInteger45 = bigInteger26.andNot(bigInteger43);
        java.math.BigDecimal bigDecimal46 = java.math.BigDecimal.ZERO;
        double double47 = bigDecimal46.doubleValue();
        java.math.BigInteger bigInteger48 = bigDecimal46.toBigInteger();
        byte[] byteArray51 = new byte[] { (byte) 1 };
        byte byte52 = org.apache.commons.lang3.math.NumberUtils.min(byteArray51);
        java.math.BigInteger bigInteger53 = new java.math.BigInteger((int) (short) -1, byteArray51);
        java.math.BigInteger bigInteger55 = bigInteger53.pow((int) 'a');
        byte[] byteArray56 = bigInteger53.toByteArray();
        long long57 = bigInteger53.longValueExact();
        java.math.BigInteger bigInteger58 = bigInteger48.or(bigInteger53);
        byte[] byteArray61 = new byte[] { (byte) 1 };
        byte byte62 = org.apache.commons.lang3.math.NumberUtils.min(byteArray61);
        java.math.BigInteger bigInteger63 = new java.math.BigInteger((int) (short) -1, byteArray61);
        java.math.BigInteger bigInteger65 = bigInteger63.pow((int) 'a');
        byte[] byteArray66 = bigInteger63.toByteArray();
        long long67 = bigInteger63.longValueExact();
        java.lang.String str69 = bigInteger63.toString(0);
        int int70 = bigInteger63.intValueExact();
        java.math.BigInteger bigInteger71 = bigInteger58.subtract(bigInteger63);
        java.math.BigInteger bigInteger72 = bigInteger26.add(bigInteger58);
        short short73 = bigInteger58.shortValueExact();
        byte byte74 = bigInteger58.byteValueExact();
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[1]");
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 1 + "'", byte11 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger13);
        org.junit.Assert.assertNotNull(bigDecimal14);
        org.junit.Assert.assertNotNull(bigDecimal15);
        org.junit.Assert.assertNotNull(bigDecimal18);
        org.junit.Assert.assertNotNull(bigDecimal19);
        org.junit.Assert.assertNotNull(bigInteger20);
        org.junit.Assert.assertNotNull(bigInteger21);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[-1]");
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[1]");
        org.junit.Assert.assertTrue("'" + byte25 + "' != '" + (byte) 1 + "'", byte25 == (byte) 1);
        org.junit.Assert.assertTrue("'" + short28 + "' != '" + (short) 1 + "'", short28 == (short) 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(bigIntegerArray30);
        org.junit.Assert.assertNotNull(bigDecimal31);
        org.junit.Assert.assertNotNull(bigDecimal32);
        org.junit.Assert.assertNotNull(bigDecimal35);
        org.junit.Assert.assertNotNull(bigDecimal36);
        org.junit.Assert.assertNotNull(bigInteger37);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[1]");
        org.junit.Assert.assertTrue("'" + byte42 + "' != '" + (byte) 1 + "'", byte42 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger44);
        org.junit.Assert.assertNotNull(bigInteger45);
        org.junit.Assert.assertNotNull(bigDecimal46);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
        org.junit.Assert.assertNotNull(bigInteger48);
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray51), "[1]");
        org.junit.Assert.assertTrue("'" + byte52 + "' != '" + (byte) 1 + "'", byte52 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger55);
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray56), "[-1]");
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + (-1L) + "'", long57 == (-1L));
        org.junit.Assert.assertNotNull(bigInteger58);
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[1]");
        org.junit.Assert.assertTrue("'" + byte62 + "' != '" + (byte) 1 + "'", byte62 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger65);
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray66), "[-1]");
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + (-1L) + "'", long67 == (-1L));
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "-1" + "'", str69, "-1");
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertNotNull(bigInteger71);
        org.junit.Assert.assertNotNull(bigInteger72);
        org.junit.Assert.assertTrue("'" + short73 + "' != '" + (short) -1 + "'", short73 == (short) -1);
        org.junit.Assert.assertTrue("'" + byte74 + "' != '" + (byte) -1 + "'", byte74 == (byte) -1);
    }

    @Test
    public void test06674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06674");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "\uc911\uad6d", "en-ca");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06675");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("\u65e5\u672c");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"########??\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06676");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("th Korea)en-cen-cenuKorean (So");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test06677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06677");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("4503599627370497");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06678");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("", "             hi!uuu             ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06679");
        java.math.BigDecimal bigDecimal1 = java.math.BigDecimal.valueOf((long) (byte) 0);
        double double2 = bigDecimal1.doubleValue();
        java.math.BigDecimal bigDecimal4 = bigDecimal1.scaleByPowerOfTen((int) (byte) -2);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(bigDecimal4);
    }

    @Test
    public void test06680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06680");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("SETATSxDETINU", "\ub3c5\uc77c\uc5b4\ub3c5\uc77c)hi");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test06681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06681");
        java.util.Locale locale2 = new java.util.Locale("ENG", "\u30d5\u30e9\u30f3\u30b9\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd)");
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "\u30d5\u30e9\u30f3\u30b9\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd)");
    }

    @Test
    public void test06682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06682");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("fr-FR", "IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IHXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "fr-FR" + "'", str3, "fr-FR");
    }

    @Test
    public void test06683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06683");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "\u11af\u1175\u110b\u11a8\u1169\u1103\u1165\u110b\u11af\u1175\u110b\u11a8\u1169\u1103\u6587\u4e2d");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06684");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06685");
        byte[] byteArray2 = new byte[] { (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.math.BigInteger bigInteger4 = new java.math.BigInteger((int) (short) -1, byteArray2);
        java.math.BigInteger bigInteger5 = bigInteger4.not();
        java.math.BigDecimal bigDecimal6 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal7 = bigDecimal6.negate();
        java.math.BigDecimal bigDecimal10 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal11 = bigDecimal7.subtract(bigDecimal10);
        java.math.BigInteger bigInteger12 = bigDecimal11.toBigInteger();
        double double13 = bigInteger12.doubleValue();
        byte[] byteArray16 = new byte[] { (byte) 1 };
        byte byte17 = org.apache.commons.lang3.math.NumberUtils.min(byteArray16);
        java.math.BigInteger bigInteger18 = new java.math.BigInteger((int) (short) -1, byteArray16);
        java.math.BigInteger bigInteger19 = bigInteger12.gcd(bigInteger18);
        java.math.BigDecimal bigDecimal20 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal21 = bigDecimal20.negate();
        java.math.BigDecimal bigDecimal24 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal25 = bigDecimal21.subtract(bigDecimal24);
        java.math.BigInteger bigInteger26 = bigDecimal25.toBigInteger();
        java.math.BigInteger bigInteger27 = bigInteger18.or(bigInteger26);
        java.math.BigInteger bigInteger29 = bigInteger26.shiftRight((int) (short) -1);
        java.math.BigDecimal bigDecimal30 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal31 = bigDecimal30.negate();
        java.math.BigDecimal bigDecimal34 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal35 = bigDecimal31.subtract(bigDecimal34);
        java.math.BigInteger bigInteger36 = bigDecimal35.toBigInteger();
        double double37 = bigInteger36.doubleValue();
        byte[] byteArray40 = new byte[] { (byte) 1 };
        byte byte41 = org.apache.commons.lang3.math.NumberUtils.min(byteArray40);
        java.math.BigInteger bigInteger42 = new java.math.BigInteger((int) (short) -1, byteArray40);
        java.math.BigInteger bigInteger43 = bigInteger36.gcd(bigInteger42);
        java.math.BigDecimal bigDecimal44 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal45 = bigDecimal44.negate();
        java.math.BigDecimal bigDecimal48 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal49 = bigDecimal45.subtract(bigDecimal48);
        java.math.BigInteger bigInteger50 = bigDecimal49.toBigInteger();
        java.math.BigInteger bigInteger51 = bigInteger42.or(bigInteger50);
        java.math.BigInteger bigInteger53 = bigInteger50.shiftRight((int) (short) -1);
        java.math.BigInteger bigInteger54 = bigInteger29.max(bigInteger50);
        java.lang.String str56 = bigInteger54.toString((int) 'a');
        java.math.BigDecimal bigDecimal57 = java.math.BigDecimal.ZERO;
        double double58 = bigDecimal57.doubleValue();
        java.math.BigInteger bigInteger59 = bigDecimal57.toBigInteger();
        byte[] byteArray62 = new byte[] { (byte) 1 };
        byte byte63 = org.apache.commons.lang3.math.NumberUtils.min(byteArray62);
        java.math.BigInteger bigInteger64 = new java.math.BigInteger((int) (short) -1, byteArray62);
        java.math.BigInteger bigInteger66 = bigInteger64.pow((int) 'a');
        byte[] byteArray67 = bigInteger64.toByteArray();
        long long68 = bigInteger64.longValueExact();
        java.math.BigInteger bigInteger69 = bigInteger59.or(bigInteger64);
        byte byte70 = bigInteger64.byteValueExact();
        boolean boolean72 = bigInteger64.testBit(100);
        java.lang.Object obj73 = null;
        boolean boolean74 = bigInteger64.equals(obj73);
        java.lang.String str76 = bigInteger64.toString(0);
        java.math.BigInteger bigInteger77 = bigInteger54.remainder(bigInteger64);
        java.math.BigInteger bigInteger78 = bigInteger5.multiply(bigInteger64);
        java.lang.Class<?> wildcardClass79 = bigInteger64.getClass();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger5);
        org.junit.Assert.assertNotNull(bigDecimal6);
        org.junit.Assert.assertNotNull(bigDecimal7);
        org.junit.Assert.assertNotNull(bigDecimal10);
        org.junit.Assert.assertNotNull(bigDecimal11);
        org.junit.Assert.assertNotNull(bigInteger12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[1]");
        org.junit.Assert.assertTrue("'" + byte17 + "' != '" + (byte) 1 + "'", byte17 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger19);
        org.junit.Assert.assertNotNull(bigDecimal20);
        org.junit.Assert.assertNotNull(bigDecimal21);
        org.junit.Assert.assertNotNull(bigDecimal24);
        org.junit.Assert.assertNotNull(bigDecimal25);
        org.junit.Assert.assertNotNull(bigInteger26);
        org.junit.Assert.assertNotNull(bigInteger27);
        org.junit.Assert.assertNotNull(bigInteger29);
        org.junit.Assert.assertNotNull(bigDecimal30);
        org.junit.Assert.assertNotNull(bigDecimal31);
        org.junit.Assert.assertNotNull(bigDecimal34);
        org.junit.Assert.assertNotNull(bigDecimal35);
        org.junit.Assert.assertNotNull(bigInteger36);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[1]");
        org.junit.Assert.assertTrue("'" + byte41 + "' != '" + (byte) 1 + "'", byte41 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger43);
        org.junit.Assert.assertNotNull(bigDecimal44);
        org.junit.Assert.assertNotNull(bigDecimal45);
        org.junit.Assert.assertNotNull(bigDecimal48);
        org.junit.Assert.assertNotNull(bigDecimal49);
        org.junit.Assert.assertNotNull(bigInteger50);
        org.junit.Assert.assertNotNull(bigInteger51);
        org.junit.Assert.assertNotNull(bigInteger53);
        org.junit.Assert.assertNotNull(bigInteger54);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "0" + "'", str56, "0");
        org.junit.Assert.assertNotNull(bigDecimal57);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 0.0d + "'", double58 == 0.0d);
        org.junit.Assert.assertNotNull(bigInteger59);
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray62), "[1]");
        org.junit.Assert.assertTrue("'" + byte63 + "' != '" + (byte) 1 + "'", byte63 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger66);
        org.junit.Assert.assertNotNull(byteArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray67), "[-1]");
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + (-1L) + "'", long68 == (-1L));
        org.junit.Assert.assertNotNull(bigInteger69);
        org.junit.Assert.assertTrue("'" + byte70 + "' != '" + (byte) -1 + "'", byte70 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "-1" + "'", str76, "-1");
        org.junit.Assert.assertNotNull(bigInteger77);
        org.junit.Assert.assertNotNull(bigInteger78);
        org.junit.Assert.assertNotNull(wildcardClass79);
    }

    @Test
    public void test06686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06686");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("aauabuaeuafuakuamuanuaruasuavuayuazubaubeubgubhubiubmubnuboubrubsucauceuchucoucrucsucuucvucyudaudeudvudzueeueluenueouesuetueuufauffufiufjufoufrufyugaugduglugnuguugvuhauheuhiuhouhruhtuhuuhyuhzuiauiduieuiguiiuikuinuiouisuituiuuiwujaujiujvukaukgukiukjukkuklukmuknukoukruksukuukvukwukyulaulbulguliulnuloultuluulvumgumhumiumkumlumnumoumrumsumtumyunaunbunduneungunlunnunounrunvunyuocuojuomuoruosupaupiuplupsuptuquurmurnurouruurwusauscusduseusgusiuskuslusmusnusousqusrussustusuusvuswutauteutguthutiutkutlutnutoutrutsuttutwutyuuguukuuruuzuveuviuvouwauwouxhuyiuyouzauzhuzu", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06687");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setLanguageTag("eng");
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale.Builder builder4 = builder2.clear();
        java.util.Locale.Builder builder5 = builder2.clearExtensions();
        java.util.Locale.Builder builder6 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder7 = builder6.clearExtensions();
        java.util.Locale locale8 = builder7.build();
        java.util.Locale.Builder builder9 = builder2.setLocale(locale8);
        java.util.Locale locale10 = builder9.build();
        java.util.Locale.Builder builder11 = builder9.clear();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test06688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06688");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(0.0d, 1.073741825E9d, (-2.0d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.073741825E9d + "'", double3 == 1.073741825E9d);
    }

    @Test
    public void test06689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06689");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = builder1.build();
        java.lang.String str3 = locale2.getDisplayLanguage();
        java.lang.String str4 = locale2.toLanguageTag();
        java.lang.String str5 = locale2.getDisplayCountry();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "und" + "'", str4, "und");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test06690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06690");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setLanguageTag("eng");
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale.Builder builder4 = builder2.clear();
        java.util.Locale.Builder builder5 = builder2.clearExtensions();
        java.util.Locale locale6 = java.util.Locale.PRC;
        java.util.Locale locale7 = null;
        java.lang.String str8 = locale6.getDisplayScript(locale7);
        java.util.Locale.setDefault(locale6);
        java.util.Locale locale10 = locale6.stripExtensions();
        java.util.Locale.Builder builder11 = builder2.setLocale(locale6);
        java.util.Locale locale12 = java.util.Locale.GERMANY;
        java.lang.String str13 = locale12.getVariant();
        java.lang.String str14 = locale12.getDisplayScript();
        java.util.Locale locale15 = java.util.Locale.KOREA;
        java.util.Locale locale16 = locale15.stripExtensions();
        java.lang.String str17 = locale12.getDisplayName(locale16);
        java.util.Locale.Builder builder18 = builder11.setLocale(locale12);
        java.util.Locale.Builder builder19 = builder11.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder21 = builder11.removeUnicodeLocaleAttribute("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "ko_KR");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\ub3c5\uc77c\uc5b4\ub3c5\uc77c)" + "'", str17, "\ub3c5\uc77c\uc5b4\ub3c5\uc77c)");
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder19);
    }

    @Test
    public void test06691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06691");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("ko_KR");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test06692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06692");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("", "\uc5b4\uad6d\ud55c                                                                                                                                                                                                                                                                                                        ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06693");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("", "\u82f1\u6587\u82f1\u56fd\u82f1\u6587\u82f1\u56fd\u82f1\u6587\u82f1\u56fd\u82f1\u6587\u82f1\u56fd\u82f1\u6587\u82f1\u56fd\u82f1\u6587\u82f1\u56fd\u82f1\u6587\u82f1\u56fd\u82f1\u6587                                                    ", (int) (short) -18, 30);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u82f1\u6587\u82f1\u56fd\u82f1\u6587\u82f1\u56fd\u82f1\u6587\u82f1\u56fd\u82f1\u6587\u82f1\u56fd\u82f1\u6587\u82f1\u56fd\u82f1\u6587\u82f1\u56fd\u82f1\u6587\u82f1\u56fd\u82f1\u6587                                                    " + "'", str4, "\u82f1\u6587\u82f1\u56fd\u82f1\u6587\u82f1\u56fd\u82f1\u6587\u82f1\u56fd\u82f1\u6587\u82f1\u56fd\u82f1\u6587\u82f1\u56fd\u82f1\u6587\u82f1\u56fd\u82f1\u6587\u82f1\u56fd\u82f1\u6587                                                    ");
    }

    @Test
    public void test06694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06694");
        char[] charArray5 = new char[] {};
        boolean boolean6 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "zh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-Chi!", charArray5);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\uc77c\ub3c5\uc5b4\uc77c\ub3c5", charArray5);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "e", charArray5);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "FRENCH", charArray5);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "orean###", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test06695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06695");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = builder1.build();
        java.lang.String str3 = locale2.getDisplayLanguage();
        java.lang.String str4 = locale2.toLanguageTag();
        java.lang.String str5 = locale2.getDisplayVariant();
        java.lang.String str6 = locale2.getDisplayLanguage();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "und" + "'", str4, "und");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test06696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06696");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("\u6cd5\u56fd", 3);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd" + "'", str2, "\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd");
    }

    @Test
    public void test06697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06697");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("\uc911\uad6d\uc5b4\uc911\uad6d)", "e");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06698");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal5 = bigDecimal1.subtract(bigDecimal4);
        java.math.BigInteger bigInteger6 = bigDecimal5.toBigInteger();
        long long7 = bigInteger6.longValue();
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test06699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06699");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal5 = bigDecimal1.subtract(bigDecimal4);
        java.math.BigInteger bigInteger6 = bigDecimal5.toBigInteger();
        double double7 = bigInteger6.doubleValue();
        byte[] byteArray10 = new byte[] { (byte) 1 };
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.min(byteArray10);
        java.math.BigInteger bigInteger12 = new java.math.BigInteger((int) (short) -1, byteArray10);
        java.math.BigInteger bigInteger13 = bigInteger6.gcd(bigInteger12);
        java.math.BigDecimal bigDecimal14 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal15 = bigDecimal14.negate();
        java.math.BigDecimal bigDecimal18 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal19 = bigDecimal15.subtract(bigDecimal18);
        java.math.BigInteger bigInteger20 = bigDecimal19.toBigInteger();
        java.math.BigInteger bigInteger21 = bigInteger12.or(bigInteger20);
        short short22 = bigInteger12.shortValueExact();
        byte[] byteArray25 = new byte[] { (byte) 1 };
        byte byte26 = org.apache.commons.lang3.math.NumberUtils.min(byteArray25);
        java.math.BigInteger bigInteger27 = new java.math.BigInteger((int) (short) -1, byteArray25);
        java.math.BigInteger bigInteger29 = bigInteger27.pow((int) 'a');
        java.math.BigInteger bigInteger31 = bigInteger27.shiftLeft((int) (short) 1);
        java.math.BigInteger bigInteger32 = bigInteger12.xor(bigInteger31);
        int int33 = bigInteger12.getLowestSetBit();
        boolean boolean35 = bigInteger12.isProbablePrime(1);
        java.math.BigDecimal bigDecimal36 = java.math.BigDecimal.TEN;
        long long37 = bigDecimal36.longValueExact();
        java.math.BigDecimal bigDecimal38 = java.math.BigDecimal.ZERO;
        double double39 = bigDecimal38.doubleValue();
        java.math.BigDecimal bigDecimal41 = bigDecimal38.movePointLeft((int) (byte) -1);
        int int42 = bigDecimal41.intValue();
        java.math.BigDecimal bigDecimal43 = bigDecimal36.add(bigDecimal41);
        java.math.BigDecimal bigDecimal44 = bigDecimal41.abs();
        java.math.BigInteger bigInteger45 = bigDecimal44.toBigIntegerExact();
        java.math.BigInteger bigInteger46 = bigInteger12.subtract(bigInteger45);
        byte[] byteArray49 = new byte[] { (byte) 1 };
        byte byte50 = org.apache.commons.lang3.math.NumberUtils.min(byteArray49);
        java.math.BigInteger bigInteger51 = new java.math.BigInteger((int) (short) -1, byteArray49);
        java.math.BigInteger bigInteger53 = bigInteger51.pow((int) 'a');
        java.math.BigInteger bigInteger55 = bigInteger51.shiftLeft((int) (short) 1);
        int int56 = bigInteger55.intValueExact();
        java.math.BigInteger bigInteger57 = bigInteger55.abs();
        java.math.BigDecimal bigDecimal58 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal59 = bigDecimal58.negate();
        java.math.BigDecimal bigDecimal62 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal63 = bigDecimal59.subtract(bigDecimal62);
        java.math.BigInteger bigInteger64 = bigDecimal63.toBigInteger();
        byte[] byteArray65 = bigInteger64.toByteArray();
        java.math.BigDecimal bigDecimal66 = new java.math.BigDecimal(bigInteger64);
        byte[] byteArray69 = new byte[] { (byte) 1 };
        byte byte70 = org.apache.commons.lang3.math.NumberUtils.min(byteArray69);
        java.math.BigInteger bigInteger71 = new java.math.BigInteger((int) (short) -1, byteArray69);
        java.math.BigInteger bigInteger73 = bigInteger71.pow((int) 'a');
        java.math.BigInteger bigInteger75 = bigInteger71.shiftLeft((int) (short) 1);
        int int76 = bigInteger75.intValueExact();
        java.math.BigInteger bigInteger77 = bigInteger75.abs();
        java.math.BigInteger bigInteger78 = bigInteger64.min(bigInteger75);
        java.math.BigInteger bigInteger79 = bigInteger55.xor(bigInteger75);
        java.math.BigInteger bigInteger80 = bigInteger79.nextProbablePrime();
        java.math.BigInteger bigInteger81 = bigInteger45.mod(bigInteger80);
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[1]");
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 1 + "'", byte11 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger13);
        org.junit.Assert.assertNotNull(bigDecimal14);
        org.junit.Assert.assertNotNull(bigDecimal15);
        org.junit.Assert.assertNotNull(bigDecimal18);
        org.junit.Assert.assertNotNull(bigDecimal19);
        org.junit.Assert.assertNotNull(bigInteger20);
        org.junit.Assert.assertNotNull(bigInteger21);
        org.junit.Assert.assertTrue("'" + short22 + "' != '" + (short) -1 + "'", short22 == (short) -1);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[1]");
        org.junit.Assert.assertTrue("'" + byte26 + "' != '" + (byte) 1 + "'", byte26 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger29);
        org.junit.Assert.assertNotNull(bigInteger31);
        org.junit.Assert.assertNotNull(bigInteger32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(bigDecimal36);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 10L + "'", long37 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal38);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertNotNull(bigDecimal41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(bigDecimal43);
        org.junit.Assert.assertNotNull(bigDecimal44);
        org.junit.Assert.assertNotNull(bigInteger45);
        org.junit.Assert.assertNotNull(bigInteger46);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray49), "[1]");
        org.junit.Assert.assertTrue("'" + byte50 + "' != '" + (byte) 1 + "'", byte50 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger53);
        org.junit.Assert.assertNotNull(bigInteger55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-2) + "'", int56 == (-2));
        org.junit.Assert.assertNotNull(bigInteger57);
        org.junit.Assert.assertNotNull(bigDecimal58);
        org.junit.Assert.assertNotNull(bigDecimal59);
        org.junit.Assert.assertNotNull(bigDecimal62);
        org.junit.Assert.assertNotNull(bigDecimal63);
        org.junit.Assert.assertNotNull(bigInteger64);
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray65), "[0]");
        org.junit.Assert.assertNotNull(byteArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray69), "[1]");
        org.junit.Assert.assertTrue("'" + byte70 + "' != '" + (byte) 1 + "'", byte70 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger73);
        org.junit.Assert.assertNotNull(bigInteger75);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-2) + "'", int76 == (-2));
        org.junit.Assert.assertNotNull(bigInteger77);
        org.junit.Assert.assertNotNull(bigInteger78);
        org.junit.Assert.assertNotNull(bigInteger79);
        org.junit.Assert.assertNotNull(bigInteger80);
        org.junit.Assert.assertNotNull(bigInteger81);
    }

    @Test
    public void test06700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06700");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("japanese", (-33), (int) (byte) 34);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06701");
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.valueOf((-1025L), (int) 'u');
        org.junit.Assert.assertNotNull(bigDecimal2);
    }

    @Test
    public void test06702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06702");
        java.util.Locale locale1 = new java.util.Locale("");
        java.lang.String str2 = locale1.getVariant();
        java.util.Locale locale3 = java.util.Locale.TAIWAN;
        java.lang.String str4 = locale1.getDisplayScript(locale3);
        java.util.Set<java.lang.String> strSet5 = locale1.getUnicodeLocaleKeys();
        java.util.Locale locale6 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str7 = locale6.getScript();
        java.lang.String str8 = locale1.getDisplayCountry(locale6);
        java.util.Locale locale12 = new java.util.Locale("hi", "hi!uuu", "Korean (South Korea)");
        java.util.Locale locale13 = locale12.stripExtensions();
        java.lang.String str14 = locale12.getDisplayVariant();
        java.lang.String str15 = locale12.getISO3Language();
        java.lang.String str16 = locale1.getDisplayName(locale12);
        java.lang.String str17 = locale1.getDisplayCountry();
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals(locale12.toString(), "hi_HI!UUU_Korean (South Korea)");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "hi_HI!UUU_Korean (South Korea)");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Korean (South Korea)" + "'", str14, "Korean (South Korea)");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hin" + "'", str15, "hin");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test06703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06703");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 299L, (float) 0, (float) 99L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test06704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06704");
        byte[] byteArray2 = new byte[] { (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.math.BigInteger bigInteger4 = new java.math.BigInteger((int) (short) -1, byteArray2);
        java.math.BigInteger bigInteger6 = bigInteger4.pow((int) 'a');
        java.math.BigInteger bigInteger8 = bigInteger4.shiftLeft((int) (short) 1);
        boolean boolean10 = bigInteger8.isProbablePrime((int) '4');
        short short11 = bigInteger8.shortValueExact();
        byte[] byteArray14 = new byte[] { (byte) 1 };
        byte byte15 = org.apache.commons.lang3.math.NumberUtils.min(byteArray14);
        java.math.BigInteger bigInteger16 = new java.math.BigInteger((int) (short) -1, byteArray14);
        java.math.BigInteger bigInteger18 = bigInteger16.pow((int) 'a');
        java.math.BigInteger bigInteger20 = bigInteger16.shiftLeft((int) (short) 1);
        int int21 = bigInteger20.intValueExact();
        java.math.BigInteger bigInteger22 = bigInteger20.abs();
        java.math.BigInteger bigInteger23 = bigInteger8.add(bigInteger22);
        java.math.BigDecimal bigDecimal24 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal25 = bigDecimal24.negate();
        java.math.BigDecimal bigDecimal28 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal29 = bigDecimal25.subtract(bigDecimal28);
        java.math.BigInteger bigInteger30 = bigDecimal29.toBigInteger();
        double double31 = bigInteger30.doubleValue();
        byte byte32 = bigInteger30.byteValueExact();
        byte[] byteArray35 = new byte[] { (byte) 1 };
        byte byte36 = org.apache.commons.lang3.math.NumberUtils.min(byteArray35);
        java.math.BigInteger bigInteger37 = new java.math.BigInteger((int) (short) -1, byteArray35);
        java.math.BigInteger bigInteger39 = bigInteger37.pow((int) 'a');
        java.math.BigInteger bigInteger41 = bigInteger37.shiftLeft((int) (short) 1);
        int int42 = bigInteger41.intValueExact();
        int int43 = bigInteger30.compareTo(bigInteger41);
        float float44 = bigInteger41.floatValue();
        java.math.BigInteger bigInteger46 = bigInteger41.pow((int) 'u');
        java.math.BigInteger bigInteger47 = bigInteger22.add(bigInteger41);
        boolean boolean49 = bigInteger22.isProbablePrime(100);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertNotNull(bigInteger8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) -2 + "'", short11 == (short) -2);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[1]");
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) 1 + "'", byte15 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger18);
        org.junit.Assert.assertNotNull(bigInteger20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-2) + "'", int21 == (-2));
        org.junit.Assert.assertNotNull(bigInteger22);
        org.junit.Assert.assertNotNull(bigInteger23);
        org.junit.Assert.assertNotNull(bigDecimal24);
        org.junit.Assert.assertNotNull(bigDecimal25);
        org.junit.Assert.assertNotNull(bigDecimal28);
        org.junit.Assert.assertNotNull(bigDecimal29);
        org.junit.Assert.assertNotNull(bigInteger30);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertTrue("'" + byte32 + "' != '" + (byte) 0 + "'", byte32 == (byte) 0);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[1]");
        org.junit.Assert.assertTrue("'" + byte36 + "' != '" + (byte) 1 + "'", byte36 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger39);
        org.junit.Assert.assertNotNull(bigInteger41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-2) + "'", int42 == (-2));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertTrue("'" + float44 + "' != '" + (-2.0f) + "'", float44 == (-2.0f));
        org.junit.Assert.assertNotNull(bigInteger46);
        org.junit.Assert.assertNotNull(bigInteger47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
    }

    @Test
    public void test06705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06705");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        double double1 = bigDecimal0.doubleValue();
        java.math.BigDecimal bigDecimal3 = bigDecimal0.movePointLeft((int) (byte) -1);
        java.math.BigDecimal bigDecimal5 = bigDecimal3.scaleByPowerOfTen(35);
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(bigDecimal3);
        org.junit.Assert.assertNotNull(bigDecimal5);
    }

    @Test
    public void test06706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06706");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("\u4e2d\u6587\u1103\u1169\u11a8\u110b\u1175\u11af\u110b\u1165\u1103\u1169\u11a8\u110b\u1175\u11af))");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u4e2d\u6587\u1103\u1169\u11a8\u110b\u1175\u11af\u110b\u1165\u1103\u1169\u11a8\u110b\u1175\u11af))" + "'", str1, "\u4e2d\u6587\u1103\u1169\u11a8\u110b\u1175\u11af\u110b\u1165\u1103\u1169\u11a8\u110b\u1175\u11af))");
    }

    @Test
    public void test06707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06707");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("GBR");
        java.lang.String str2 = locale1.toLanguageTag();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "gbr");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "gbr" + "'", str2, "gbr");
    }

    @Test
    public void test06708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06708");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "Enhinh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Enhinh" + "'", str1, "Enhinh");
    }

    @Test
    public void test06709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06709");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal5 = bigDecimal1.subtract(bigDecimal4);
        java.math.BigInteger bigInteger6 = bigDecimal5.toBigInteger();
        double double7 = bigInteger6.doubleValue();
        byte byte8 = bigInteger6.byteValueExact();
        java.util.Locale.LanguageRange[] languageRangeArray9 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList10 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList10, languageRangeArray9);
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        java.util.List<java.lang.String> strList18 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList10, (java.util.Collection<java.lang.String>) strList16);
        java.util.Locale.LanguageRange[] languageRangeArray19 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList20 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList20, languageRangeArray19);
        java.lang.String[] strArray25 = new java.lang.String[] { "hi!", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi" };
        java.util.ArrayList<java.lang.String> strList26 = new java.util.ArrayList<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList26, strArray25);
        java.util.List<java.lang.String> strList28 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList20, (java.util.Collection<java.lang.String>) strList26);
        java.lang.String str29 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList10, (java.util.Collection<java.lang.String>) strList26);
        java.util.Locale.LanguageRange[] languageRangeArray30 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList31 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList31, languageRangeArray30);
        java.util.Locale locale34 = java.util.Locale.getDefault();
        java.lang.String str35 = org.apache.commons.lang3.StringUtils.lowerCase("", locale34);
        java.util.Locale.setDefault(locale34);
        java.util.Locale locale38 = java.util.Locale.getDefault();
        java.lang.String str39 = org.apache.commons.lang3.StringUtils.lowerCase("", locale38);
        java.util.Locale.setDefault(locale38);
        java.util.Locale locale41 = java.util.Locale.KOREA;
        java.util.Locale locale42 = locale41.stripExtensions();
        java.util.Locale locale44 = java.util.Locale.FRANCE;
        java.lang.String str45 = org.apache.commons.lang3.StringUtils.upperCase("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!", locale44);
        java.util.Locale locale46 = java.util.Locale.getDefault();
        java.lang.String str47 = locale46.getDisplayLanguage();
        java.util.Locale locale49 = java.util.Locale.getDefault();
        java.lang.String str50 = org.apache.commons.lang3.StringUtils.upperCase("", locale49);
        java.util.Locale locale51 = java.util.Locale.GERMANY;
        java.util.Locale locale52 = java.util.Locale.GERMANY;
        java.util.Locale locale53 = java.util.Locale.GERMANY;
        java.lang.String str54 = locale53.getVariant();
        java.util.Locale locale55 = java.util.Locale.KOREA;
        java.util.Locale locale56 = locale55.stripExtensions();
        java.util.Locale locale57 = java.util.Locale.KOREA;
        java.util.Locale locale58 = locale57.stripExtensions();
        java.util.Locale locale59 = java.util.Locale.KOREA;
        java.util.Locale locale60 = java.util.Locale.PRC;
        java.util.Locale locale61 = java.util.Locale.KOREA;
        java.lang.String str62 = locale61.getScript();
        java.util.Locale locale63 = java.util.Locale.GERMANY;
        java.util.Locale[] localeArray64 = new java.util.Locale[] { locale34, locale38, locale41, locale44, locale46, locale49, locale51, locale52, locale53, locale55, locale58, locale59, locale60, locale61, locale63 };
        java.util.ArrayList<java.util.Locale> localeList65 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList65, localeArray64);
        java.util.Locale.FilteringMode filteringMode67 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList68 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList31, (java.util.Collection<java.util.Locale>) localeList65, filteringMode67);
        java.util.Locale locale69 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList10, (java.util.Collection<java.util.Locale>) localeList68);
        boolean boolean70 = bigInteger6.equals((java.lang.Object) locale69);
        boolean boolean72 = bigInteger6.equals((java.lang.Object) "\u4e2d\u56fd");
        java.math.BigInteger bigInteger74 = bigInteger6.shiftLeft((int) '4');
        boolean boolean76 = bigInteger6.testBit(2);
        java.math.BigInteger bigInteger78 = bigInteger6.shiftRight(52);
        int int79 = bigInteger78.intValue();
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(languageRangeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(languageRangeArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(strList28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(languageRangeArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!!" + "'", str45, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!!");
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "\u4e2d\u6587" + "'", str47, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale56);
        org.junit.Assert.assertEquals(locale56.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale57);
        org.junit.Assert.assertEquals(locale57.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale60);
        org.junit.Assert.assertEquals(locale60.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale61);
        org.junit.Assert.assertEquals(locale61.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "de_DE");
        org.junit.Assert.assertNotNull(localeArray64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + filteringMode67 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode67.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList68);
        org.junit.Assert.assertNull(locale69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(bigInteger74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(bigInteger78);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
    }

    @Test
    public void test06710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06710");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("United StatesUnited StatesUnited StatesUnited StatesUnited StatesUnited StatesUnited StatesUnited St", 'u');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test06711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06711");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setLanguageTag("eng");
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale.Builder builder4 = builder2.clear();
        java.util.Locale.Builder builder5 = builder2.clearExtensions();
        java.util.Locale.Builder builder6 = builder2.clearExtensions();
        java.util.Locale.Builder builder7 = builder6.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder6.addUnicodeLocaleAttribute("");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute:  [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test06712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06712");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("undxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", "KOR");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test06713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06713");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) (-33L), (float) 101, (float) 52);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-33.0f) + "'", float3 == (-33.0f));
    }

    @Test
    public void test06714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06714");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\ud504\ub791\uc2a4\uc5b4-1.0", "Englisch", 120);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "\u4e2d\u6587\u4e2d\u56fd)");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\ud504\ub791\uc2a4\uc5b4-1.0" + "'", str5, "\ud504\ub791\uc2a4\uc5b4-1.0");
    }

    @Test
    public void test06715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06715");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("chinois");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "chinois" + "'", str1, "chinois");
    }

    @Test
    public void test06716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06716");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("SETATS DETINU", "-1)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "SETATS DETINU" + "'", str2, "SETATS DETINU");
    }

    @Test
    public void test06717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06717");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("2ETAT2-DETINU", "KOREAN (SOUTH KOREA)EN-CEN-CEN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2ETAT2-DETINU" + "'", str2, "2ETAT2-DETINU");
    }

    @Test
    public void test06718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06718");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("1", "\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9)UnitedxStates");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06719");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "South Koreaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "south Koreaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "south Koreaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test06720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06720");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "AJ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06721");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("Eng                                                                                                                                                                                                                                                                                     itEng                                                                                                                                                                                                                                                                                      ", "UNDXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Eng                                                                                                                                                                                                                                                                                     itEng                                                                                                                                                                                                                                                                                      " + "'", str2, "Eng                                                                                                                                                                                                                                                                                     itEng                                                                                                                                                                                                                                                                                      ");
    }

    @Test
    public void test06722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06722");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.ONE;
        java.math.BigDecimal bigDecimal3 = bigDecimal1.min(bigDecimal2);
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal5 = bigDecimal4.negate();
        java.math.BigDecimal bigDecimal8 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal9 = bigDecimal5.subtract(bigDecimal8);
        java.math.BigDecimal[] bigDecimalArray10 = bigDecimal2.divideAndRemainder(bigDecimal8);
        java.math.BigDecimal bigDecimal11 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal12 = bigDecimal11.negate();
        java.math.BigDecimal bigDecimal15 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal16 = bigDecimal12.subtract(bigDecimal15);
        java.math.BigDecimal bigDecimal17 = java.math.BigDecimal.TEN;
        java.math.BigDecimal bigDecimal18 = bigDecimal15.min(bigDecimal17);
        java.math.BigDecimal bigDecimal19 = bigDecimal8.divideToIntegralValue(bigDecimal18);
        java.math.BigDecimal bigDecimal20 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal21 = bigDecimal20.negate();
        java.math.BigDecimal bigDecimal22 = java.math.BigDecimal.TEN;
        long long23 = bigDecimal22.longValueExact();
        java.math.BigDecimal bigDecimal24 = bigDecimal22.ulp();
        java.lang.String str25 = bigDecimal22.toString();
        int int26 = bigDecimal20.compareTo(bigDecimal22);
        java.math.BigInteger bigInteger27 = bigDecimal20.toBigInteger();
        java.math.BigDecimal bigDecimal28 = bigDecimal20.ulp();
        java.math.BigDecimal bigDecimal29 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal30 = bigDecimal29.negate();
        java.math.BigDecimal bigDecimal31 = java.math.BigDecimal.ONE;
        java.math.BigDecimal bigDecimal32 = bigDecimal30.min(bigDecimal31);
        int int33 = bigDecimal20.compareTo(bigDecimal32);
        int int34 = bigDecimal19.compareTo(bigDecimal32);
        java.math.BigDecimal bigDecimal36 = java.math.BigDecimal.valueOf((long) (byte) 0);
        byte byte37 = bigDecimal36.byteValueExact();
        java.math.BigDecimal bigDecimal39 = bigDecimal36.pow(2);
        java.math.BigDecimal bigDecimal40 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal41 = bigDecimal40.negate();
        java.math.BigDecimal bigDecimal42 = java.math.BigDecimal.TEN;
        long long43 = bigDecimal42.longValueExact();
        java.math.BigDecimal bigDecimal44 = bigDecimal42.ulp();
        java.lang.String str45 = bigDecimal42.toString();
        int int46 = bigDecimal40.compareTo(bigDecimal42);
        java.math.BigDecimal bigDecimal48 = java.math.BigDecimal.valueOf((long) (byte) 100);
        java.math.BigDecimal bigDecimal50 = bigDecimal42.divide(bigDecimal48, (int) (short) 1);
        java.math.BigDecimal bigDecimal51 = bigDecimal39.add(bigDecimal42);
        java.math.BigDecimal bigDecimal52 = bigDecimal32.divideToIntegralValue(bigDecimal42);
        java.lang.String str53 = bigDecimal32.toString();
        java.math.BigDecimal bigDecimal54 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal55 = bigDecimal54.negate();
        java.math.BigDecimal bigDecimal58 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal59 = bigDecimal55.subtract(bigDecimal58);
        java.math.BigDecimal bigDecimal60 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal61 = bigDecimal60.negate();
        java.math.BigDecimal bigDecimal62 = java.math.BigDecimal.ONE;
        java.math.BigDecimal bigDecimal63 = bigDecimal61.min(bigDecimal62);
        java.math.BigDecimal bigDecimal64 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal65 = bigDecimal64.negate();
        java.math.BigDecimal bigDecimal68 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal69 = bigDecimal65.subtract(bigDecimal68);
        java.math.BigDecimal[] bigDecimalArray70 = bigDecimal62.divideAndRemainder(bigDecimal68);
        java.math.BigDecimal bigDecimal71 = bigDecimal59.min(bigDecimal68);
        float float72 = bigDecimal59.floatValue();
        java.math.BigInteger bigInteger73 = bigDecimal59.toBigInteger();
        java.math.BigDecimal[] bigDecimalArray74 = bigDecimal32.divideAndRemainder(bigDecimal59);
        java.lang.String str75 = bigDecimal32.toPlainString();
        java.math.MathContext mathContext76 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal77 = bigDecimal32.abs(mathContext76);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal2);
        org.junit.Assert.assertNotNull(bigDecimal3);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigDecimal8);
        org.junit.Assert.assertNotNull(bigDecimal9);
        org.junit.Assert.assertNotNull(bigDecimalArray10);
        org.junit.Assert.assertNotNull(bigDecimal11);
        org.junit.Assert.assertNotNull(bigDecimal12);
        org.junit.Assert.assertNotNull(bigDecimal15);
        org.junit.Assert.assertNotNull(bigDecimal16);
        org.junit.Assert.assertNotNull(bigDecimal17);
        org.junit.Assert.assertNotNull(bigDecimal18);
        org.junit.Assert.assertNotNull(bigDecimal19);
        org.junit.Assert.assertNotNull(bigDecimal20);
        org.junit.Assert.assertNotNull(bigDecimal21);
        org.junit.Assert.assertNotNull(bigDecimal22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 10L + "'", long23 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "10" + "'", str25, "10");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(bigInteger27);
        org.junit.Assert.assertNotNull(bigDecimal28);
        org.junit.Assert.assertNotNull(bigDecimal29);
        org.junit.Assert.assertNotNull(bigDecimal30);
        org.junit.Assert.assertNotNull(bigDecimal31);
        org.junit.Assert.assertNotNull(bigDecimal32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNotNull(bigDecimal36);
        org.junit.Assert.assertTrue("'" + byte37 + "' != '" + (byte) 0 + "'", byte37 == (byte) 0);
        org.junit.Assert.assertNotNull(bigDecimal39);
        org.junit.Assert.assertNotNull(bigDecimal40);
        org.junit.Assert.assertNotNull(bigDecimal41);
        org.junit.Assert.assertNotNull(bigDecimal42);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 10L + "'", long43 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "10" + "'", str45, "10");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(bigDecimal48);
        org.junit.Assert.assertNotNull(bigDecimal50);
        org.junit.Assert.assertNotNull(bigDecimal51);
        org.junit.Assert.assertNotNull(bigDecimal52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "0" + "'", str53, "0");
        org.junit.Assert.assertNotNull(bigDecimal54);
        org.junit.Assert.assertNotNull(bigDecimal55);
        org.junit.Assert.assertNotNull(bigDecimal58);
        org.junit.Assert.assertNotNull(bigDecimal59);
        org.junit.Assert.assertNotNull(bigDecimal60);
        org.junit.Assert.assertNotNull(bigDecimal61);
        org.junit.Assert.assertNotNull(bigDecimal62);
        org.junit.Assert.assertNotNull(bigDecimal63);
        org.junit.Assert.assertNotNull(bigDecimal64);
        org.junit.Assert.assertNotNull(bigDecimal65);
        org.junit.Assert.assertNotNull(bigDecimal68);
        org.junit.Assert.assertNotNull(bigDecimal69);
        org.junit.Assert.assertNotNull(bigDecimalArray70);
        org.junit.Assert.assertNotNull(bigDecimal71);
        org.junit.Assert.assertTrue("'" + float72 + "' != '" + (-0.0f) + "'", float72 == (-0.0f));
        org.junit.Assert.assertNotNull(bigInteger73);
        org.junit.Assert.assertNotNull(bigDecimalArray74);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "0" + "'", str75, "0");
    }

    @Test
    public void test06723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06723");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "1H");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test06724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06724");
        java.math.MathContext mathContext1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal2 = new java.math.BigDecimal("1.00E-95", mathContext1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06725");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle(" ", "                                                                                                                                                                                                                                                                        HindiHindiHindiRF-RFHindiHindiHindi", (int) (short) 34);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
    }

    @Test
    public void test06726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06726");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "a");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test06727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06727");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI", "   JA");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test06728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06728");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("\u65e5\u6587", "#_HI!", " ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u65e5\u6587" + "'", str3, "\u65e5\u6587");
    }

    @Test
    public void test06729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06729");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("#_HI!", "\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927", (int) (short) -1);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test06730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06730");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setLanguageTag("eng");
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale locale4 = java.util.Locale.FRANCE;
        java.util.Locale.Builder builder5 = builder3.setLocale(locale4);
        java.util.Locale.Builder builder7 = builder3.setRegion("US");
        java.util.Locale locale8 = builder3.build();
        java.util.Locale locale9 = java.util.Locale.PRC;
        java.util.Locale locale10 = null;
        java.lang.String str11 = locale9.getDisplayScript(locale10);
        java.lang.String str12 = locale9.getScript();
        java.lang.String str13 = locale9.getDisplayScript();
        boolean boolean14 = locale9.hasExtensions();
        java.lang.String str15 = locale8.getDisplayLanguage(locale9);
        java.lang.String str16 = locale9.getISO3Country();
        java.util.Locale locale17 = java.util.Locale.CHINA;
        java.lang.String str18 = locale17.getDisplayCountry();
        java.lang.String str20 = locale17.getExtension('a');
        java.lang.String str21 = locale17.getISO3Country();
        java.util.Locale.Category category22 = java.util.Locale.Category.DISPLAY;
        java.math.BigDecimal bigDecimal23 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal24 = bigDecimal23.negate();
        java.math.BigDecimal bigDecimal27 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal28 = bigDecimal24.subtract(bigDecimal27);
        java.math.BigInteger bigInteger29 = bigDecimal28.toBigInteger();
        double double30 = bigInteger29.doubleValue();
        byte[] byteArray33 = new byte[] { (byte) 1 };
        byte byte34 = org.apache.commons.lang3.math.NumberUtils.min(byteArray33);
        java.math.BigInteger bigInteger35 = new java.math.BigInteger((int) (short) -1, byteArray33);
        java.math.BigInteger bigInteger36 = bigInteger29.gcd(bigInteger35);
        java.math.BigInteger bigInteger37 = bigInteger35.negate();
        java.math.BigDecimal bigDecimal38 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal39 = bigDecimal38.negate();
        java.math.BigDecimal bigDecimal42 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal43 = bigDecimal39.subtract(bigDecimal42);
        java.math.BigInteger bigInteger44 = bigDecimal43.toBigInteger();
        double double45 = bigInteger44.doubleValue();
        byte[] byteArray48 = new byte[] { (byte) 1 };
        byte byte49 = org.apache.commons.lang3.math.NumberUtils.min(byteArray48);
        java.math.BigInteger bigInteger50 = new java.math.BigInteger((int) (short) -1, byteArray48);
        java.math.BigInteger bigInteger51 = bigInteger44.gcd(bigInteger50);
        java.math.BigDecimal bigDecimal52 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal53 = bigDecimal52.negate();
        java.math.BigDecimal bigDecimal56 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal57 = bigDecimal53.subtract(bigDecimal56);
        java.math.BigInteger bigInteger58 = bigDecimal57.toBigInteger();
        java.math.BigInteger bigInteger59 = bigInteger50.or(bigInteger58);
        short short60 = bigInteger50.shortValueExact();
        byte byte61 = bigInteger50.byteValueExact();
        java.math.BigInteger bigInteger62 = bigInteger35.and(bigInteger50);
        java.util.Locale locale63 = java.util.Locale.UK;
        boolean boolean64 = bigInteger62.equals((java.lang.Object) locale63);
        java.util.Locale.setDefault(category22, locale63);
        java.lang.String str66 = locale17.getDisplayLanguage(locale63);
        java.lang.String str67 = locale9.getDisplayLanguage(locale17);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr_US");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\u6cd5\u6587" + "'", str15, "\u6cd5\u6587");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "CHN" + "'", str16, "CHN");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\u4e2d\u56fd" + "'", str18, "\u4e2d\u56fd");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "CHN" + "'", str21, "CHN");
        org.junit.Assert.assertTrue("'" + category22 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category22.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(bigDecimal23);
        org.junit.Assert.assertNotNull(bigDecimal24);
        org.junit.Assert.assertNotNull(bigDecimal27);
        org.junit.Assert.assertNotNull(bigDecimal28);
        org.junit.Assert.assertNotNull(bigInteger29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[1]");
        org.junit.Assert.assertTrue("'" + byte34 + "' != '" + (byte) 1 + "'", byte34 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger36);
        org.junit.Assert.assertNotNull(bigInteger37);
        org.junit.Assert.assertNotNull(bigDecimal38);
        org.junit.Assert.assertNotNull(bigDecimal39);
        org.junit.Assert.assertNotNull(bigDecimal42);
        org.junit.Assert.assertNotNull(bigDecimal43);
        org.junit.Assert.assertNotNull(bigInteger44);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[1]");
        org.junit.Assert.assertTrue("'" + byte49 + "' != '" + (byte) 1 + "'", byte49 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger51);
        org.junit.Assert.assertNotNull(bigDecimal52);
        org.junit.Assert.assertNotNull(bigDecimal53);
        org.junit.Assert.assertNotNull(bigDecimal56);
        org.junit.Assert.assertNotNull(bigDecimal57);
        org.junit.Assert.assertNotNull(bigInteger58);
        org.junit.Assert.assertNotNull(bigInteger59);
        org.junit.Assert.assertTrue("'" + short60 + "' != '" + (short) -1 + "'", short60 == (short) -1);
        org.junit.Assert.assertTrue("'" + byte61 + "' != '" + (byte) -1 + "'", byte61 == (byte) -1);
        org.junit.Assert.assertNotNull(bigInteger62);
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "en_GB");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "Chinese" + "'", str66, "Chinese");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "\u4e2d\u6587" + "'", str67, "\u4e2d\u6587");
    }

    @Test
    public void test06731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06731");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("united states", "zh-cnzh-cn", (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06732");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("#_eng", "\u9c9c\u6587\u97e9\u56fd)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#_eng" + "'", str2, "#_eng");
    }

    @Test
    public void test06733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06733");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal("CN  ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06734");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("\u82f1\u6587\u82f1\u56fd)");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test06735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06735");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "jpn");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jpn" + "'", str1, "jpn");
    }

    @Test
    public void test06736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06736");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aaaaaaaaaunited statesaaaaaaaaaa", "\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9", 16);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test06737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06737");
        char[] charArray13 = new char[] { ' ', '#', '4', '#', '4', ' ' };
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!", charArray13);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "en_US", charArray13);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", charArray13);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "zho", charArray13);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "und ", charArray13);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsAny("\u97e9\u56fd", charArray13);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "Cennese", charArray13);
        java.math.MathContext mathContext23 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal24 = new java.math.BigDecimal(charArray13, 0, (-1), mathContext23);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Bad offset or len arguments for char[] input.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), " #4#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), " #4#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[ , #, 4, #, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test06738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06738");
        java.util.Locale locale3 = new java.util.Locale("\u30a4\u30bf\u30ea\u30a2\u8a9e", "ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!");
        java.util.Locale.Category category4 = java.util.Locale.Category.FORMAT;
        java.util.Locale.Builder builder5 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        java.util.Locale locale7 = builder6.build();
        java.util.Locale.setDefault(category4, locale7);
        java.util.Locale locale10 = java.util.Locale.forLanguageTag("Chinese");
        java.util.Locale locale11 = java.util.Locale.PRC;
        java.util.Locale locale12 = null;
        java.lang.String str13 = locale11.getDisplayScript(locale12);
        java.util.Locale.setDefault(locale11);
        java.util.Locale locale15 = locale11.stripExtensions();
        java.lang.String str16 = locale10.getDisplayVariant(locale11);
        java.util.Locale.setDefault(category4, locale10);
        java.util.Locale locale18 = java.util.Locale.getDefault(category4);
        java.lang.String str19 = locale3.getDisplayScript(locale18);
        java.lang.String str20 = locale3.getDisplayCountry();
        org.junit.Assert.assertEquals(locale3.toString(), "\u30a4\u30bf\u30ea\u30a2\u8a9e_IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH_hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!");
        org.junit.Assert.assertTrue("'" + category4 + "' != '" + java.util.Locale.Category.FORMAT + "'", category4.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "chinese");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "chinese");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH" + "'", str20, "IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH");
    }

    @Test
    public void test06739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06739");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("dnu", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!", 0);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, 'a');
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "dnu" + "'", str5, "dnu");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "dnu" + "'", str7, "dnu");
    }

    @Test
    public void test06740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06740");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("orean###", "\ub3c5\uc77c\uc5b4\ub3c5\uc77c)hi", "und ", (int) '4');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "orean###" + "'", str4, "orean###");
    }

    @Test
    public void test06741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06741");
        java.util.Locale locale0 = java.util.Locale.UK;
        java.lang.String str1 = locale0.getDisplayName();
        java.util.Locale locale2 = java.util.Locale.GERMANY;
        java.lang.String str3 = locale2.getVariant();
        java.lang.String str4 = locale2.getDisplayScript();
        java.lang.String str5 = locale0.getDisplayCountry(locale2);
        java.lang.Object obj6 = locale0.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u82f1\u6587\u82f1\u56fd)" + "'", str1, "\u82f1\u6587\u82f1\u56fd)");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Vereinigtes K\366nigreich" + "'", str5, "Vereinigtes K\366nigreich");
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "en_GB");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "en_GB");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "en_GB");
    }

    @Test
    public void test06742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06742");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setLanguageTag("eng");
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale.Builder builder4 = builder3.clear();
        java.util.Locale.Builder builder5 = builder3.clear();
        java.util.Locale.Builder builder7 = builder5.addUnicodeLocaleAttribute("eng");
        java.util.Locale.Builder builder9 = builder5.setLanguage("CN");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder9.removeUnicodeLocaleAttribute("0.00000000000000000000000000000000SETATS DETINU");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: 0.00000000000000000000000000000000SETATS DETINU [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test06743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06743");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("france", "1.00E-95");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "france" + "'", str2, "france");
    }

    @Test
    public void test06744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06744");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        double double1 = bigDecimal0.doubleValue();
        java.math.BigInteger bigInteger2 = bigDecimal0.toBigInteger();
        byte[] byteArray5 = new byte[] { (byte) 1 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        java.math.BigInteger bigInteger7 = new java.math.BigInteger((int) (short) -1, byteArray5);
        java.math.BigInteger bigInteger9 = bigInteger7.pow((int) 'a');
        byte[] byteArray10 = bigInteger7.toByteArray();
        long long11 = bigInteger7.longValueExact();
        java.math.BigInteger bigInteger12 = bigInteger2.or(bigInteger7);
        byte byte13 = bigInteger7.byteValueExact();
        java.math.BigDecimal bigDecimal15 = new java.math.BigDecimal(bigInteger7, (int) (byte) 0);
        java.math.BigInteger bigInteger17 = bigInteger7.setBit(7);
        java.math.BigInteger bigInteger19 = bigInteger7.clearBit((int) (byte) 1);
        long long20 = bigInteger7.longValueExact();
        java.lang.String str22 = bigInteger7.toString(0);
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(bigInteger2);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1]");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 1 + "'", byte6 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger9);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[-1]");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(bigInteger12);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) -1 + "'", byte13 == (byte) -1);
        org.junit.Assert.assertNotNull(bigInteger17);
        org.junit.Assert.assertNotNull(bigInteger19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-1" + "'", str22, "-1");
    }

    @Test
    public void test06745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06745");
        java.util.Locale.Builder builder1 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder1.setLanguageTag("eng");
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale locale5 = java.util.Locale.FRANCE;
        java.util.Locale.Builder builder6 = builder4.setLocale(locale5);
        java.util.Locale locale7 = java.util.Locale.FRENCH;
        java.lang.String str8 = locale7.getVariant();
        java.util.Locale locale9 = locale7.stripExtensions();
        java.lang.String str10 = locale9.getDisplayCountry();
        java.util.Locale locale11 = locale9.stripExtensions();
        java.lang.String str12 = locale9.getDisplayLanguage();
        java.util.Locale.Builder builder13 = builder6.setLocale(locale9);
        java.util.Locale.Builder builder14 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder16 = builder14.setLanguageTag("eng");
        java.util.Locale.Builder builder17 = builder16.clearExtensions();
        java.util.Locale locale18 = java.util.Locale.FRANCE;
        java.util.Locale.Builder builder19 = builder17.setLocale(locale18);
        java.util.Locale.Builder builder21 = builder19.addUnicodeLocaleAttribute("engcn");
        java.util.Locale locale22 = builder19.build();
        java.util.Locale.Builder builder23 = builder6.setLocale(locale22);
        java.util.Locale locale24 = java.util.Locale.CHINA;
        java.util.Locale.Builder builder25 = builder23.setLocale(locale24);
        java.lang.String str26 = org.apache.commons.lang3.StringUtils.upperCase("\ud504\ub791\uc2a4\uc5b4\ubbf8\uad6d\u82f1\u6587\u82f1\u56fd\ud504\ub791\uc2a4\uc5b4\ubbf8\uad6d\u82f1\u6587\u82f1\u56fd\ud504\ub791\uc2a4\uc5b4\ubbf8\uad6d\u82f1\u6587\u82f1\u56fd\ud504\ub791\uc2a4\uc5b4\ubbf8\uad6d\u82f1\u6587\u82f1\u56fd\ud504\ub791\uc2a4\uc5b4\ubbf8\uad6d\u82f1\u6587\u82f1\u56fd\ud504\ub791\uc2a4\uc5b4\ubbf8\uad6d\u82f1\u6587\u82f1\u56fd\ud504\ub791\uc2a4\uc5b4\ubbf8\uad6d)", locale24);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\u6cd5\u6587" + "'", str12, "\u6cd5\u6587");
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "fr_FR_#u-engcn");
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\ud504\ub791\uc2a4\uc5b4\ubbf8\uad6d\u82f1\u6587\u82f1\u56fd\ud504\ub791\uc2a4\uc5b4\ubbf8\uad6d\u82f1\u6587\u82f1\u56fd\ud504\ub791\uc2a4\uc5b4\ubbf8\uad6d\u82f1\u6587\u82f1\u56fd\ud504\ub791\uc2a4\uc5b4\ubbf8\uad6d\u82f1\u6587\u82f1\u56fd\ud504\ub791\uc2a4\uc5b4\ubbf8\uad6d\u82f1\u6587\u82f1\u56fd\ud504\ub791\uc2a4\uc5b4\ubbf8\uad6d\u82f1\u6587\u82f1\u56fd\ud504\ub791\uc2a4\uc5b4\ubbf8\uad6d)" + "'", str26, "\ud504\ub791\uc2a4\uc5b4\ubbf8\uad6d\u82f1\u6587\u82f1\u56fd\ud504\ub791\uc2a4\uc5b4\ubbf8\uad6d\u82f1\u6587\u82f1\u56fd\ud504\ub791\uc2a4\uc5b4\ubbf8\uad6d\u82f1\u6587\u82f1\u56fd\ud504\ub791\uc2a4\uc5b4\ubbf8\uad6d\u82f1\u6587\u82f1\u56fd\ud504\ub791\uc2a4\uc5b4\ubbf8\uad6d\u82f1\u6587\u82f1\u56fd\ud504\ub791\uc2a4\uc5b4\ubbf8\uad6d\u82f1\u6587\u82f1\u56fd\ud504\ub791\uc2a4\uc5b4\ubbf8\uad6d)");
    }

    @Test
    public void test06746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06746");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aaaaaaaaaUNITED STATESaaaaaaaaaa", "\uc774\ud0c8\ub9ac\uc544\uc5b4");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06747");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("AJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJ", (int) 'a', "UNDUNDUNDUNDUNDUNDUNDUNDUNDUND");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJ" + "'", str3, "AJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJ");
    }

    @Test
    public void test06748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06748");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setLanguageTag("eng");
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale.Builder builder4 = builder2.clear();
        java.util.Locale.Builder builder5 = builder2.clearExtensions();
        java.util.Locale locale6 = java.util.Locale.PRC;
        java.util.Locale locale7 = null;
        java.lang.String str8 = locale6.getDisplayScript(locale7);
        java.util.Locale.setDefault(locale6);
        java.util.Locale locale10 = locale6.stripExtensions();
        java.util.Locale.Builder builder11 = builder2.setLocale(locale6);
        java.util.Locale locale12 = java.util.Locale.GERMANY;
        java.lang.String str13 = locale12.getVariant();
        java.lang.String str14 = locale12.getDisplayScript();
        java.util.Locale locale15 = java.util.Locale.KOREA;
        java.util.Locale locale16 = locale15.stripExtensions();
        java.lang.String str17 = locale12.getDisplayName(locale16);
        java.util.Locale.Builder builder18 = builder11.setLocale(locale12);
        java.util.Locale.Builder builder19 = builder11.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder21 = builder19.setVariant("ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "ko_KR");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\ub3c5\uc77c\uc5b4\ub3c5\uc77c)" + "'", str17, "\ub3c5\uc77c\uc5b4\ub3c5\uc77c)");
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder19);
    }

    @Test
    public void test06749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06749");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("en-US", 'u');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, 'a');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "en-US" + "'", str4, "en-US");
    }

    @Test
    public void test06750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06750");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        double double1 = bigDecimal0.doubleValue();
        java.math.BigInteger bigInteger2 = bigDecimal0.toBigInteger();
        byte[] byteArray5 = new byte[] { (byte) 1 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        java.math.BigInteger bigInteger7 = new java.math.BigInteger((int) (short) -1, byteArray5);
        java.math.BigInteger bigInteger9 = bigInteger7.pow((int) 'a');
        byte[] byteArray10 = bigInteger7.toByteArray();
        long long11 = bigInteger7.longValueExact();
        java.math.BigInteger bigInteger12 = bigInteger2.or(bigInteger7);
        byte byte13 = bigInteger7.byteValueExact();
        boolean boolean15 = bigInteger7.testBit(100);
        byte[] byteArray18 = new byte[] { (byte) 1 };
        byte byte19 = org.apache.commons.lang3.math.NumberUtils.min(byteArray18);
        java.math.BigInteger bigInteger20 = new java.math.BigInteger((int) (short) -1, byteArray18);
        java.math.BigInteger bigInteger22 = bigInteger20.pow((int) 'a');
        java.math.BigInteger bigInteger24 = bigInteger20.shiftLeft((int) (short) 1);
        java.math.BigDecimal bigDecimal25 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal26 = bigDecimal25.negate();
        java.math.BigDecimal bigDecimal27 = java.math.BigDecimal.ONE;
        java.math.BigDecimal bigDecimal28 = bigDecimal26.min(bigDecimal27);
        java.lang.String str29 = bigDecimal26.toPlainString();
        boolean boolean30 = bigInteger24.equals((java.lang.Object) bigDecimal26);
        java.math.BigInteger bigInteger31 = bigInteger7.divide(bigInteger24);
        byte[] byteArray34 = new byte[] { (byte) 1 };
        byte byte35 = org.apache.commons.lang3.math.NumberUtils.min(byteArray34);
        java.math.BigInteger bigInteger36 = new java.math.BigInteger((int) (short) -1, byteArray34);
        java.math.BigInteger bigInteger38 = bigInteger36.pow((int) 'a');
        byte[] byteArray39 = bigInteger36.toByteArray();
        long long40 = bigInteger36.longValueExact();
        java.lang.String str42 = bigInteger36.toString(0);
        byte[] byteArray45 = new byte[] { (byte) 1 };
        byte byte46 = org.apache.commons.lang3.math.NumberUtils.min(byteArray45);
        java.math.BigInteger bigInteger47 = new java.math.BigInteger((int) (short) -1, byteArray45);
        java.math.BigInteger bigInteger48 = new java.math.BigInteger(byteArray45);
        boolean boolean49 = bigInteger36.equals((java.lang.Object) byteArray45);
        java.lang.String str50 = bigInteger36.toString();
        java.math.BigInteger bigInteger51 = bigInteger24.remainder(bigInteger36);
        java.math.BigDecimal bigDecimal52 = java.math.BigDecimal.ZERO;
        double double53 = bigDecimal52.doubleValue();
        java.math.BigInteger bigInteger54 = bigDecimal52.toBigInteger();
        byte[] byteArray57 = new byte[] { (byte) 1 };
        byte byte58 = org.apache.commons.lang3.math.NumberUtils.min(byteArray57);
        java.math.BigInteger bigInteger59 = new java.math.BigInteger((int) (short) -1, byteArray57);
        java.math.BigInteger bigInteger61 = bigInteger59.pow((int) 'a');
        byte[] byteArray62 = bigInteger59.toByteArray();
        long long63 = bigInteger59.longValueExact();
        java.math.BigInteger bigInteger64 = bigInteger54.or(bigInteger59);
        byte[] byteArray67 = new byte[] { (byte) 1 };
        byte byte68 = org.apache.commons.lang3.math.NumberUtils.min(byteArray67);
        java.math.BigInteger bigInteger69 = new java.math.BigInteger((int) (short) -1, byteArray67);
        java.math.BigInteger bigInteger71 = bigInteger69.pow((int) 'a');
        byte[] byteArray72 = bigInteger69.toByteArray();
        long long73 = bigInteger69.longValueExact();
        java.lang.String str75 = bigInteger69.toString(0);
        int int76 = bigInteger69.intValueExact();
        java.math.BigInteger bigInteger77 = bigInteger64.subtract(bigInteger69);
        java.math.BigInteger bigInteger78 = bigInteger24.and(bigInteger64);
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(bigInteger2);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1]");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 1 + "'", byte6 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger9);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[-1]");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(bigInteger12);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) -1 + "'", byte13 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[1]");
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) 1 + "'", byte19 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger22);
        org.junit.Assert.assertNotNull(bigInteger24);
        org.junit.Assert.assertNotNull(bigDecimal25);
        org.junit.Assert.assertNotNull(bigDecimal26);
        org.junit.Assert.assertNotNull(bigDecimal27);
        org.junit.Assert.assertNotNull(bigDecimal28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "0" + "'", str29, "0");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(bigInteger31);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[1]");
        org.junit.Assert.assertTrue("'" + byte35 + "' != '" + (byte) 1 + "'", byte35 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger38);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[-1]");
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + (-1L) + "'", long40 == (-1L));
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "-1" + "'", str42, "-1");
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray45), "[1]");
        org.junit.Assert.assertTrue("'" + byte46 + "' != '" + (byte) 1 + "'", byte46 == (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "-1" + "'", str50, "-1");
        org.junit.Assert.assertNotNull(bigInteger51);
        org.junit.Assert.assertNotNull(bigDecimal52);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
        org.junit.Assert.assertNotNull(bigInteger54);
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray57), "[1]");
        org.junit.Assert.assertTrue("'" + byte58 + "' != '" + (byte) 1 + "'", byte58 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger61);
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray62), "[-1]");
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + (-1L) + "'", long63 == (-1L));
        org.junit.Assert.assertNotNull(bigInteger64);
        org.junit.Assert.assertNotNull(byteArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray67), "[1]");
        org.junit.Assert.assertTrue("'" + byte68 + "' != '" + (byte) 1 + "'", byte68 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger71);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray72), "[-1]");
        org.junit.Assert.assertTrue("'" + long73 + "' != '" + (-1L) + "'", long73 == (-1L));
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "-1" + "'", str75, "-1");
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
        org.junit.Assert.assertNotNull(bigInteger77);
        org.junit.Assert.assertNotNull(bigInteger78);
    }

    @Test
    public void test06751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06751");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.TEN;
        long long3 = bigDecimal2.longValueExact();
        java.math.BigDecimal bigDecimal4 = bigDecimal2.ulp();
        java.lang.String str5 = bigDecimal2.toString();
        int int6 = bigDecimal0.compareTo(bigDecimal2);
        java.math.BigDecimal bigDecimal8 = java.math.BigDecimal.valueOf((long) (byte) 100);
        java.math.BigDecimal bigDecimal10 = bigDecimal2.divide(bigDecimal8, (int) (short) 1);
        java.math.BigDecimal bigDecimal11 = java.math.BigDecimal.TEN;
        long long12 = bigDecimal11.longValueExact();
        java.math.BigDecimal bigDecimal13 = bigDecimal10.max(bigDecimal11);
        java.math.BigDecimal bigDecimal14 = java.math.BigDecimal.TEN;
        long long15 = bigDecimal14.longValueExact();
        java.math.BigDecimal bigDecimal16 = bigDecimal14.ulp();
        java.math.BigDecimal bigDecimal17 = bigDecimal11.subtract(bigDecimal14);
        java.math.BigDecimal bigDecimal20 = java.math.BigDecimal.valueOf((long) (-1), (int) 'u');
        java.math.BigDecimal bigDecimal21 = java.math.BigDecimal.ONE;
        java.math.BigDecimal bigDecimal22 = bigDecimal21.abs();
        java.math.BigDecimal bigDecimal23 = bigDecimal20.min(bigDecimal22);
        java.math.BigDecimal bigDecimal25 = java.math.BigDecimal.valueOf((double) (-1.0f));
        int int26 = bigDecimal22.compareTo(bigDecimal25);
        java.math.BigDecimal bigDecimal27 = bigDecimal17.divide(bigDecimal25);
        java.math.BigDecimal bigDecimal29 = java.math.BigDecimal.valueOf((long) (byte) 100);
        java.math.BigDecimal bigDecimal30 = bigDecimal27.max(bigDecimal29);
        int int31 = bigDecimal27.precision();
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10" + "'", str5, "10");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(bigDecimal8);
        org.junit.Assert.assertNotNull(bigDecimal10);
        org.junit.Assert.assertNotNull(bigDecimal11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal13);
        org.junit.Assert.assertNotNull(bigDecimal14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal16);
        org.junit.Assert.assertNotNull(bigDecimal17);
        org.junit.Assert.assertNotNull(bigDecimal20);
        org.junit.Assert.assertNotNull(bigDecimal21);
        org.junit.Assert.assertNotNull(bigDecimal22);
        org.junit.Assert.assertNotNull(bigDecimal23);
        org.junit.Assert.assertNotNull(bigDecimal25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(bigDecimal27);
        org.junit.Assert.assertNotNull(bigDecimal29);
        org.junit.Assert.assertNotNull(bigDecimal30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
    }

    @Test
    public void test06752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06752");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("zh-cnzh-cn", '#', 'x');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zh-cnzh-cn" + "'", str3, "zh-cnzh-cn");
    }

    @Test
    public void test06753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06753");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(0.0f, (float) 10L, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void test06754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06754");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("hi!uuuaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (-4L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-4L) + "'", long2 == (-4L));
    }

    @Test
    public void test06755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06755");
        java.util.Locale locale1 = new java.util.Locale("fr");
        org.junit.Assert.assertEquals(locale1.toString(), "fr");
    }

    @Test
    public void test06756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06756");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("United StatesUnited StatesUnited StatesUnited StatesUnited StatesUnited StatesUnited StatesUnited St", "2#2#2#2#2#2#2#2#2#2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-zh-CN");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test06757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06757");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("44444444444444444444444444444zh", "                                                                                                                   00");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test06758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06758");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("\u4e2d\u6587", "HI!H");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u4e2d\u6587" + "'", str2, "\u4e2d\u6587");
    }

    @Test
    public void test06759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06759");
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal((double) 7.0f);
    }

    @Test
    public void test06760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06760");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.ONE;
        java.math.BigDecimal bigDecimal3 = bigDecimal1.min(bigDecimal2);
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal5 = bigDecimal4.negate();
        java.math.BigDecimal bigDecimal8 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal9 = bigDecimal5.subtract(bigDecimal8);
        java.math.BigDecimal[] bigDecimalArray10 = bigDecimal2.divideAndRemainder(bigDecimal8);
        java.math.BigDecimal bigDecimal11 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal12 = bigDecimal11.negate();
        java.math.BigDecimal bigDecimal15 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal16 = bigDecimal12.subtract(bigDecimal15);
        java.math.BigDecimal bigDecimal17 = java.math.BigDecimal.TEN;
        java.math.BigDecimal bigDecimal18 = bigDecimal15.min(bigDecimal17);
        java.math.BigDecimal bigDecimal19 = bigDecimal8.divideToIntegralValue(bigDecimal18);
        java.math.BigDecimal bigDecimal20 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal21 = bigDecimal20.negate();
        java.math.BigDecimal bigDecimal22 = java.math.BigDecimal.TEN;
        long long23 = bigDecimal22.longValueExact();
        java.math.BigDecimal bigDecimal24 = bigDecimal22.ulp();
        java.lang.String str25 = bigDecimal22.toString();
        int int26 = bigDecimal20.compareTo(bigDecimal22);
        java.math.BigInteger bigInteger27 = bigDecimal20.toBigInteger();
        java.math.BigDecimal bigDecimal28 = bigDecimal20.ulp();
        java.math.BigDecimal bigDecimal29 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal30 = bigDecimal29.negate();
        java.math.BigDecimal bigDecimal31 = java.math.BigDecimal.ONE;
        java.math.BigDecimal bigDecimal32 = bigDecimal30.min(bigDecimal31);
        int int33 = bigDecimal20.compareTo(bigDecimal32);
        int int34 = bigDecimal19.compareTo(bigDecimal32);
        java.lang.String str35 = bigDecimal19.toEngineeringString();
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal2);
        org.junit.Assert.assertNotNull(bigDecimal3);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigDecimal8);
        org.junit.Assert.assertNotNull(bigDecimal9);
        org.junit.Assert.assertNotNull(bigDecimalArray10);
        org.junit.Assert.assertNotNull(bigDecimal11);
        org.junit.Assert.assertNotNull(bigDecimal12);
        org.junit.Assert.assertNotNull(bigDecimal15);
        org.junit.Assert.assertNotNull(bigDecimal16);
        org.junit.Assert.assertNotNull(bigDecimal17);
        org.junit.Assert.assertNotNull(bigDecimal18);
        org.junit.Assert.assertNotNull(bigDecimal19);
        org.junit.Assert.assertNotNull(bigDecimal20);
        org.junit.Assert.assertNotNull(bigDecimal21);
        org.junit.Assert.assertNotNull(bigDecimal22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 10L + "'", long23 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "10" + "'", str25, "10");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(bigInteger27);
        org.junit.Assert.assertNotNull(bigDecimal28);
        org.junit.Assert.assertNotNull(bigDecimal29);
        org.junit.Assert.assertNotNull(bigDecimal30);
        org.junit.Assert.assertNotNull(bigDecimal31);
        org.junit.Assert.assertNotNull(bigDecimal32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "1" + "'", str35, "1");
    }

    @Test
    public void test06761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06761");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("fr-FR-u-engcn", 7, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "fr-FR-u-engcn" + "'", str3, "fr-FR-u-engcn");
    }

    @Test
    public void test06762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06762");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal("AD AE AF AG AI AL AM AN AO AQ AR AS AT AU AW AX AZ BA BB BD BE BF BG BH BI BJ BL BM BN BO BQ BR BS BT BV BW BY BZ CA CC CD CF CG CH CI CK CL CM CN CO CR CU CV CW CX CY CZ DE DJ DK DM DO DZ EC EE EG EH ER ES ET FI FJ FK FM FO FR GA GB GD GE GF GG GH GI GL GM GN GP GQ GR GS GT GU GW GY HK HM HN HR HT HU ID IE IL IM IN IO IQ IR IS IT JE JM JO JP KE KG KH KI KM KN KP KR KW KY KZ LA LB LC LI LK LR LS LT LU LV LY MA MC MD ME MF MG MH MK ML MM MN MO MP MQ MR MS MT MU MV MW MX MY MZ NA NC NE NF NG NI NL NO NP NR NU NZ OM PA PE PF PG PH PK PL PM PN PR PS PT PW PY QA RE RO RS RU RW SA SB SC SD SE SG SH SI SJ SK SL SM SN SO SR SS ST SV SX SY SZ TC TD TF TG TH TJ TK TL TM TN TO TR TT TV TW TZ UA UG UM US UY UZ VA VC VE VG VI VN VU WF WS YE YT ZA ZM ZW");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06763");
        java.util.Locale locale2 = java.util.Locale.forLanguageTag("Chinese");
        java.lang.String str3 = locale2.getDisplayVariant();
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.upperCase("\ud55c\uad6d\uc5b4", locale2);
        java.lang.String str5 = locale2.getDisplayLanguage();
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "chinese");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str4, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chinese" + "'", str5, "chinese");
    }

    @Test
    public void test06764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06764");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setLanguageTag("eng");
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale.Builder builder4 = builder3.clear();
        java.util.Locale.Builder builder5 = builder3.clear();
        java.util.Locale.Builder builder7 = builder5.addUnicodeLocaleAttribute("eng");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder7.addUnicodeLocaleAttribute("");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute:  [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test06765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06765");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ONE;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.abs();
        java.lang.String str2 = bigDecimal1.toPlainString();
        java.math.BigDecimal bigDecimal3 = bigDecimal1.stripTrailingZeros();
        int int4 = bigDecimal3.intValue();
        java.math.BigDecimal bigDecimal5 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal6 = bigDecimal5.negate();
        java.math.BigDecimal bigDecimal7 = java.math.BigDecimal.TEN;
        long long8 = bigDecimal7.longValueExact();
        java.math.BigDecimal bigDecimal9 = bigDecimal7.ulp();
        java.lang.String str10 = bigDecimal7.toString();
        int int11 = bigDecimal5.compareTo(bigDecimal7);
        java.math.BigDecimal bigDecimal13 = java.math.BigDecimal.valueOf((long) (byte) 100);
        java.math.BigDecimal bigDecimal15 = bigDecimal7.divide(bigDecimal13, (int) (short) 1);
        java.lang.String str16 = bigDecimal15.toPlainString();
        java.math.BigDecimal bigDecimal17 = java.math.BigDecimal.ZERO;
        double double18 = bigDecimal17.doubleValue();
        java.math.BigDecimal bigDecimal20 = bigDecimal17.movePointLeft((int) (byte) -1);
        int int21 = bigDecimal20.intValue();
        java.math.BigDecimal bigDecimal22 = bigDecimal15.add(bigDecimal20);
        java.math.BigDecimal bigDecimal23 = bigDecimal3.add(bigDecimal15);
        java.math.BigDecimal bigDecimal24 = null;
        java.math.RoundingMode roundingMode25 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal26 = bigDecimal23.divide(bigDecimal24, roundingMode25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1" + "'", str2, "1");
        org.junit.Assert.assertNotNull(bigDecimal3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigDecimal6);
        org.junit.Assert.assertNotNull(bigDecimal7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10" + "'", str10, "10");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(bigDecimal13);
        org.junit.Assert.assertNotNull(bigDecimal15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "0" + "'", str16, "0");
        org.junit.Assert.assertNotNull(bigDecimal17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(bigDecimal20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(bigDecimal22);
        org.junit.Assert.assertNotNull(bigDecimal23);
    }

    @Test
    public void test06766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06766");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.TEN;
        long long1 = bigDecimal0.longValueExact();
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.ZERO;
        double double3 = bigDecimal2.doubleValue();
        java.math.BigDecimal bigDecimal5 = bigDecimal2.movePointLeft((int) (byte) -1);
        int int6 = bigDecimal5.intValue();
        java.math.BigDecimal bigDecimal7 = bigDecimal0.add(bigDecimal5);
        long long8 = bigDecimal0.longValue();
        java.math.BigDecimal bigDecimal9 = java.math.BigDecimal.ZERO;
        double double10 = bigDecimal9.doubleValue();
        java.math.BigDecimal bigDecimal12 = bigDecimal9.movePointLeft((int) (byte) -1);
        java.math.BigInteger bigInteger13 = bigDecimal9.unscaledValue();
        java.lang.String str14 = bigDecimal9.toString();
        int int15 = bigDecimal9.intValue();
        java.math.RoundingMode roundingMode17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal18 = bigDecimal0.divide(bigDecimal9, 11, roundingMode17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 10L + "'", long1 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(bigDecimal7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(bigDecimal12);
        org.junit.Assert.assertNotNull(bigInteger13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0" + "'", str14, "0");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test06767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06767");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = new java.math.BigInteger("Korean##############################################################################################");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"K\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06768");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setLanguageTag("eng");
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale.Builder builder4 = builder2.clear();
        java.util.Locale.Builder builder5 = builder2.clearExtensions();
        java.util.Locale.Builder builder6 = builder2.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder2.setLanguage("KR                               ");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: KR                                [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test06769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06769");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("en-c");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test06770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06770");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("hI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIhi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIhi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06771");
        short[] shortArray5 = new short[] { (byte) 1, (short) 100, (byte) -1, (byte) 0, (short) 16 };
        short short6 = org.apache.commons.lang3.math.NumberUtils.min(shortArray5);
        short short7 = org.apache.commons.lang3.math.NumberUtils.min(shortArray5);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[1, 100, -1, 0, 16]");
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) -1 + "'", short6 == (short) -1);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) -1 + "'", short7 == (short) -1);
    }

    @Test
    public void test06772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06772");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "-1UND0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06773");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("\ub300\ud55c\ubbfc\uad6d");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\ub300\ud55c\ubbfc\uad6d" + "'", str1, "\ub300\ud55c\ubbfc\uad6d");
    }

    @Test
    public void test06774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06774");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "hi!hi!hi!hi!hi!hchnhi!hi!hi!hi!hi!h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06775");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("FRZJA-JAcJA ", "Eng                                                                                                                                                                                                                                                                                     itEng                                                                                                                                                                                                                                                                                      ", "TW");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "FRZJA-JAcJA" + "'", str3, "FRZJA-JAcJA");
    }

    @Test
    public void test06776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06776");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("GB");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "gb");
    }

    @Test
    public void test06777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06777");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\u6cd5\u6587", '#');
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.split("Japanisch", '#');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("en-CA", strArray3, strArray6);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "en-CA" + "'", str7, "en-CA");
    }

    @Test
    public void test06778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06778");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.ONE;
        java.math.BigDecimal bigDecimal3 = bigDecimal1.min(bigDecimal2);
        float float4 = bigDecimal1.floatValue();
        byte byte5 = bigDecimal1.byteValueExact();
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal2);
        org.junit.Assert.assertNotNull(bigDecimal3);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 0 + "'", byte5 == (byte) 0);
    }

    @Test
    public void test06779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06779");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.min(byteArray1);
        java.math.BigInteger bigInteger3 = new java.math.BigInteger(byteArray1);
        int int4 = bigInteger3.signum();
        short short5 = bigInteger3.shortValueExact();
        java.math.BigInteger bigInteger7 = bigInteger3.flipBit((int) '4');
        java.math.BigDecimal bigDecimal8 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal9 = bigDecimal8.negate();
        java.math.BigDecimal bigDecimal12 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal13 = bigDecimal9.subtract(bigDecimal12);
        java.math.BigInteger bigInteger14 = bigDecimal13.toBigInteger();
        double double15 = bigInteger14.doubleValue();
        byte[] byteArray18 = new byte[] { (byte) 1 };
        byte byte19 = org.apache.commons.lang3.math.NumberUtils.min(byteArray18);
        java.math.BigInteger bigInteger20 = new java.math.BigInteger((int) (short) -1, byteArray18);
        java.math.BigInteger bigInteger21 = bigInteger14.gcd(bigInteger20);
        java.math.BigDecimal bigDecimal22 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal23 = bigDecimal22.negate();
        java.math.BigDecimal bigDecimal26 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal27 = bigDecimal23.subtract(bigDecimal26);
        java.math.BigInteger bigInteger28 = bigDecimal27.toBigInteger();
        java.math.BigInteger bigInteger29 = bigInteger20.or(bigInteger28);
        short short30 = bigInteger20.shortValueExact();
        int int31 = bigInteger20.getLowestSetBit();
        long long32 = bigInteger20.longValue();
        java.math.BigDecimal bigDecimal33 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal34 = bigDecimal33.negate();
        java.math.BigDecimal bigDecimal37 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal38 = bigDecimal34.subtract(bigDecimal37);
        java.math.BigInteger bigInteger39 = bigDecimal38.toBigInteger();
        java.math.BigInteger bigInteger40 = bigInteger39.negate();
        java.math.BigInteger bigInteger41 = bigInteger20.gcd(bigInteger39);
        java.math.BigInteger bigInteger42 = bigInteger7.xor(bigInteger41);
        java.math.MathContext mathContext43 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal44 = new java.math.BigDecimal(bigInteger42, mathContext43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[1]");
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2 == (byte) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 1 + "'", short5 == (short) 1);
        org.junit.Assert.assertNotNull(bigInteger7);
        org.junit.Assert.assertNotNull(bigDecimal8);
        org.junit.Assert.assertNotNull(bigDecimal9);
        org.junit.Assert.assertNotNull(bigDecimal12);
        org.junit.Assert.assertNotNull(bigDecimal13);
        org.junit.Assert.assertNotNull(bigInteger14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[1]");
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) 1 + "'", byte19 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger21);
        org.junit.Assert.assertNotNull(bigDecimal22);
        org.junit.Assert.assertNotNull(bigDecimal23);
        org.junit.Assert.assertNotNull(bigDecimal26);
        org.junit.Assert.assertNotNull(bigDecimal27);
        org.junit.Assert.assertNotNull(bigInteger28);
        org.junit.Assert.assertNotNull(bigInteger29);
        org.junit.Assert.assertTrue("'" + short30 + "' != '" + (short) -1 + "'", short30 == (short) -1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-1L) + "'", long32 == (-1L));
        org.junit.Assert.assertNotNull(bigDecimal33);
        org.junit.Assert.assertNotNull(bigDecimal34);
        org.junit.Assert.assertNotNull(bigDecimal37);
        org.junit.Assert.assertNotNull(bigDecimal38);
        org.junit.Assert.assertNotNull(bigInteger39);
        org.junit.Assert.assertNotNull(bigInteger40);
        org.junit.Assert.assertNotNull(bigInteger41);
        org.junit.Assert.assertNotNull(bigInteger42);
    }

    @Test
    public void test06780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06780");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        int int2 = bigDecimal1.signum();
        long long3 = bigDecimal1.longValue();
        java.math.BigDecimal bigDecimal4 = bigDecimal1.abs();
        byte[] byteArray7 = new byte[] { (byte) 1 };
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.min(byteArray7);
        java.math.BigInteger bigInteger9 = new java.math.BigInteger((int) (short) -1, byteArray7);
        java.math.BigInteger bigInteger11 = bigInteger9.pow((int) 'a');
        java.math.BigDecimal bigDecimal13 = new java.math.BigDecimal(bigInteger11, (int) (byte) 0);
        int int14 = bigDecimal13.signum();
        java.math.BigDecimal bigDecimal15 = bigDecimal4.divideToIntegralValue(bigDecimal13);
        int int16 = bigDecimal4.signum();
        java.math.BigInteger bigInteger17 = bigDecimal4.toBigInteger();
        int int18 = bigInteger17.bitLength();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger20 = bigInteger17.clearBit((-2));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Negative bit address");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 1 + "'", byte8 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(bigDecimal15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(bigInteger17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test06781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06781");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ONE;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.ulp();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.valueOf((long) (byte) 100, 97);
        java.math.MathContext mathContext5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal6 = bigDecimal1.multiply(bigDecimal4, mathContext5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal4);
    }

    @Test
    public void test06782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06782");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        java.util.List<java.lang.String> strList9 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList7);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList1, ' ');
        java.util.Locale.LanguageRange[] languageRangeArray12 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList13 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList13, languageRangeArray12);
        java.lang.String[] strArray16 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList17 = new java.util.ArrayList<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList17, strArray16);
        java.lang.String str19 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList13, (java.util.Collection<java.lang.String>) strList17);
        java.util.Locale.FilteringMode filteringMode20 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList21 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList17, filteringMode20);
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList1, "\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9)United States");
        java.lang.String str25 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList1, "0.0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000100");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList27 = java.util.Locale.LanguageRange.parse("English");
        java.util.Locale.LanguageRange[] languageRangeArray28 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList29 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList29, languageRangeArray28);
        java.lang.String[] strArray34 = new java.lang.String[] { "hi!", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi" };
        java.util.ArrayList<java.lang.String> strList35 = new java.util.ArrayList<java.lang.String>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList35, strArray34);
        java.util.List<java.lang.String> strList37 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList29, (java.util.Collection<java.lang.String>) strList35);
        java.lang.String str39 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList29, ' ');
        java.util.Locale.LanguageRange[] languageRangeArray40 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList41 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList41, languageRangeArray40);
        java.lang.String[] strArray44 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList45 = new java.util.ArrayList<java.lang.String>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList45, strArray44);
        java.lang.String str47 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList41, (java.util.Collection<java.lang.String>) strList45);
        java.util.Locale.FilteringMode filteringMode48 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList49 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList29, (java.util.Collection<java.lang.String>) strList45, filteringMode48);
        java.util.List<java.lang.String> strList50 = java.util.Locale.filterTags(languageRangeList27, (java.util.Collection<java.lang.String>) strList45);
        java.lang.String str51 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList45);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(languageRangeArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + filteringMode20 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode20.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(languageRangeList27);
        org.junit.Assert.assertNotNull(languageRangeArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(strList37);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(languageRangeArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertTrue("'" + filteringMode48 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode48.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList49);
        org.junit.Assert.assertNotNull(strList50);
        org.junit.Assert.assertNull(str51);
    }

    @Test
    public void test06783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06783");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal5 = bigDecimal1.subtract(bigDecimal4);
        java.lang.String str6 = bigDecimal1.toPlainString();
        java.lang.String str7 = bigDecimal1.toPlainString();
        java.math.BigDecimal bigDecimal9 = bigDecimal1.movePointLeft((-2));
        java.math.MathContext mathContext10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal11 = bigDecimal9.plus(mathContext10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0" + "'", str6, "0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0" + "'", str7, "0");
        org.junit.Assert.assertNotNull(bigDecimal9);
    }

    @Test
    public void test06784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06784");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("120120120120120120120120120120120120120120120120120120120120120120120120120120120120120120120120", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "120120120120120120120120120120120120120120120120120120120120120120120120120120120120120120120120" + "'", str2, "120120120120120120120120120120120120120120120120120120120120120120120120120120120120120120120120");
    }

    @Test
    public void test06785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06785");
        byte[] byteArray2 = new byte[] { (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.math.BigInteger bigInteger4 = new java.math.BigInteger((int) (short) -1, byteArray2);
        java.math.BigInteger bigInteger6 = bigInteger4.pow((int) 'a');
        java.math.BigInteger bigInteger8 = bigInteger4.shiftLeft((int) (short) 1);
        boolean boolean10 = bigInteger8.isProbablePrime((int) '4');
        java.math.BigInteger bigInteger12 = java.math.BigInteger.valueOf((long) ' ');
        java.math.BigInteger bigInteger13 = bigInteger8.max(bigInteger12);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertNotNull(bigInteger8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(bigInteger12);
        org.junit.Assert.assertNotNull(bigInteger13);
    }

    @Test
    public void test06786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06786");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9                                             ", (int) 'a', 'a');
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9                                             " + "'", str3, "\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9                                             ");
    }

    @Test
    public void test06787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06787");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9)", "-1UND0", (int) (byte) 1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9)" + "'", str4, "\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9)");
    }

    @Test
    public void test06788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06788");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("zh-TW", 97);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "zh-TW                                                                                            " + "'", str2, "zh-TW                                                                                            ");
    }

    @Test
    public void test06789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06789");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ONE;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.ulp();
        java.math.BigDecimal bigDecimal3 = new java.math.BigDecimal((-4.0d));
        java.math.BigDecimal bigDecimal4 = bigDecimal3.abs();
        java.math.BigDecimal bigDecimal6 = bigDecimal4.scaleByPowerOfTen(1);
        java.math.BigDecimal[] bigDecimalArray7 = bigDecimal1.divideAndRemainder(bigDecimal6);
        java.math.BigDecimal bigDecimal8 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal9 = bigDecimal8.negate();
        java.math.BigDecimal bigDecimal10 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal11 = bigDecimal10.negate();
        java.math.BigDecimal bigDecimal12 = bigDecimal10.negate();
        java.lang.String str13 = bigDecimal12.toEngineeringString();
        java.math.BigDecimal bigDecimal14 = bigDecimal9.multiply(bigDecimal12);
        java.math.BigDecimal bigDecimal16 = bigDecimal12.movePointRight(100);
        java.math.BigInteger bigInteger17 = bigDecimal12.toBigInteger();
        java.math.BigDecimal bigDecimal19 = bigDecimal12.setScale(0);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal20 = bigDecimal1.remainder(bigDecimal19);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Division by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal6);
        org.junit.Assert.assertNotNull(bigDecimalArray7);
        org.junit.Assert.assertNotNull(bigDecimal8);
        org.junit.Assert.assertNotNull(bigDecimal9);
        org.junit.Assert.assertNotNull(bigDecimal10);
        org.junit.Assert.assertNotNull(bigDecimal11);
        org.junit.Assert.assertNotNull(bigDecimal12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0" + "'", str13, "0");
        org.junit.Assert.assertNotNull(bigDecimal14);
        org.junit.Assert.assertNotNull(bigDecimal16);
        org.junit.Assert.assertNotNull(bigInteger17);
        org.junit.Assert.assertNotNull(bigDecimal19);
    }

    @Test
    public void test06790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06790");
        byte[] byteArray2 = new byte[] { (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.math.BigInteger bigInteger4 = new java.math.BigInteger((int) (short) -1, byteArray2);
        java.math.BigInteger bigInteger6 = bigInteger4.pow((int) 'a');
        byte[] byteArray7 = bigInteger4.toByteArray();
        long long8 = bigInteger4.longValueExact();
        java.lang.String str10 = bigInteger4.toString(0);
        byte[] byteArray13 = new byte[] { (byte) 1 };
        byte byte14 = org.apache.commons.lang3.math.NumberUtils.min(byteArray13);
        java.math.BigInteger bigInteger15 = new java.math.BigInteger((int) (short) -1, byteArray13);
        java.math.BigInteger bigInteger16 = bigInteger4.and(bigInteger15);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger18 = bigInteger15.clearBit((int) (short) -5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Negative bit address");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1]");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1" + "'", str10, "-1");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[1]");
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) 1 + "'", byte14 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger16);
    }

    @Test
    public void test06791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06791");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06792");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("A", "fr-FR", 33);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test06793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06793");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("", (int) (short) 1024, (int) (short) 34);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test06794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06794");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06795");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("Hindi", 35, "rbg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "rbgrbgrbgrbgrbgHindirbgrbgrbgrbgrbg" + "'", str3, "rbgrbgrbgrbgrbgHindirbgrbgrbgrbgrbg");
    }

    @Test
    public void test06796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06796");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.lang.String str1 = locale0.getScript();
        java.util.Set<java.lang.String> strSet2 = locale0.getUnicodeLocaleKeys();
        java.util.Locale locale3 = locale0.stripExtensions();
        java.lang.String str4 = locale0.getCountry();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "KR" + "'", str4, "KR");
    }

    @Test
    public void test06797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06797");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("UNITED STATES", 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test06798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06798");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal5 = bigDecimal1.subtract(bigDecimal4);
        java.math.BigInteger bigInteger6 = bigDecimal5.toBigInteger();
        double double7 = bigInteger6.doubleValue();
        byte[] byteArray10 = new byte[] { (byte) 1 };
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.min(byteArray10);
        java.math.BigInteger bigInteger12 = new java.math.BigInteger((int) (short) -1, byteArray10);
        java.math.BigInteger bigInteger13 = bigInteger6.gcd(bigInteger12);
        java.math.BigDecimal bigDecimal14 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal15 = bigDecimal14.negate();
        java.math.BigDecimal bigDecimal18 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal19 = bigDecimal15.subtract(bigDecimal18);
        java.math.BigInteger bigInteger20 = bigDecimal19.toBigInteger();
        java.math.BigInteger bigInteger21 = bigInteger12.or(bigInteger20);
        boolean boolean23 = bigInteger21.testBit(117);
        byte[] byteArray26 = new byte[] { (byte) 1 };
        byte byte27 = org.apache.commons.lang3.math.NumberUtils.min(byteArray26);
        java.math.BigInteger bigInteger28 = new java.math.BigInteger((int) (short) -1, byteArray26);
        java.math.BigInteger bigInteger30 = bigInteger28.pow((int) 'a');
        java.math.BigInteger bigInteger32 = bigInteger28.flipBit((int) 'a');
        java.math.BigInteger bigInteger33 = bigInteger21.divide(bigInteger32);
        java.lang.String str34 = bigInteger21.toString();
        byte[] byteArray37 = new byte[] { (byte) 1 };
        byte byte38 = org.apache.commons.lang3.math.NumberUtils.min(byteArray37);
        java.math.BigInteger bigInteger39 = new java.math.BigInteger((int) (short) -1, byteArray37);
        java.math.BigInteger bigInteger41 = bigInteger39.pow((int) 'a');
        byte[] byteArray42 = bigInteger39.toByteArray();
        long long43 = bigInteger39.longValueExact();
        byte byte44 = bigInteger39.byteValueExact();
        java.lang.String str46 = bigInteger39.toString((int) (byte) 10);
        java.math.BigDecimal bigDecimal47 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal48 = bigDecimal47.negate();
        java.math.BigDecimal bigDecimal51 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal52 = bigDecimal48.subtract(bigDecimal51);
        java.math.BigInteger bigInteger53 = bigDecimal52.toBigInteger();
        java.math.BigInteger bigInteger54 = bigInteger53.negate();
        java.math.BigInteger bigInteger55 = bigInteger39.xor(bigInteger53);
        java.math.BigInteger bigInteger56 = bigInteger21.subtract(bigInteger53);
        long long57 = bigInteger53.longValueExact();
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[1]");
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 1 + "'", byte11 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger13);
        org.junit.Assert.assertNotNull(bigDecimal14);
        org.junit.Assert.assertNotNull(bigDecimal15);
        org.junit.Assert.assertNotNull(bigDecimal18);
        org.junit.Assert.assertNotNull(bigDecimal19);
        org.junit.Assert.assertNotNull(bigInteger20);
        org.junit.Assert.assertNotNull(bigInteger21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[1]");
        org.junit.Assert.assertTrue("'" + byte27 + "' != '" + (byte) 1 + "'", byte27 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger30);
        org.junit.Assert.assertNotNull(bigInteger32);
        org.junit.Assert.assertNotNull(bigInteger33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "-1" + "'", str34, "-1");
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[1]");
        org.junit.Assert.assertTrue("'" + byte38 + "' != '" + (byte) 1 + "'", byte38 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger41);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[-1]");
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + (-1L) + "'", long43 == (-1L));
        org.junit.Assert.assertTrue("'" + byte44 + "' != '" + (byte) -1 + "'", byte44 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "-1" + "'", str46, "-1");
        org.junit.Assert.assertNotNull(bigDecimal47);
        org.junit.Assert.assertNotNull(bigDecimal48);
        org.junit.Assert.assertNotNull(bigDecimal51);
        org.junit.Assert.assertNotNull(bigDecimal52);
        org.junit.Assert.assertNotNull(bigInteger53);
        org.junit.Assert.assertNotNull(bigInteger54);
        org.junit.Assert.assertNotNull(bigInteger55);
        org.junit.Assert.assertNotNull(bigInteger56);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 0L + "'", long57 == 0L);
    }

    @Test
    public void test06799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06799");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal5 = bigDecimal1.subtract(bigDecimal4);
        java.math.BigInteger bigInteger6 = bigDecimal5.toBigInteger();
        double double7 = bigInteger6.doubleValue();
        byte[] byteArray10 = new byte[] { (byte) 1 };
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.min(byteArray10);
        java.math.BigInteger bigInteger12 = new java.math.BigInteger((int) (short) -1, byteArray10);
        java.math.BigInteger bigInteger13 = bigInteger6.gcd(bigInteger12);
        java.math.BigDecimal bigDecimal14 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal15 = bigDecimal14.negate();
        java.math.BigDecimal bigDecimal18 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal19 = bigDecimal15.subtract(bigDecimal18);
        java.math.BigInteger bigInteger20 = bigDecimal19.toBigInteger();
        java.math.BigInteger bigInteger21 = bigInteger12.or(bigInteger20);
        short short22 = bigInteger12.shortValueExact();
        byte[] byteArray25 = new byte[] { (byte) 1 };
        byte byte26 = org.apache.commons.lang3.math.NumberUtils.min(byteArray25);
        java.math.BigInteger bigInteger27 = new java.math.BigInteger((int) (short) -1, byteArray25);
        java.math.BigInteger bigInteger29 = bigInteger27.pow((int) 'a');
        java.math.BigInteger bigInteger31 = bigInteger27.shiftLeft((int) (short) 1);
        java.math.BigInteger bigInteger32 = bigInteger12.xor(bigInteger31);
        java.math.BigDecimal bigDecimal34 = new java.math.BigDecimal(bigInteger31, (int) '#');
        java.math.BigDecimal bigDecimal35 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal36 = bigDecimal35.negate();
        java.math.BigDecimal bigDecimal39 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal40 = bigDecimal36.subtract(bigDecimal39);
        java.math.BigInteger bigInteger41 = bigDecimal40.toBigInteger();
        double double42 = bigInteger41.doubleValue();
        byte[] byteArray45 = new byte[] { (byte) 1 };
        byte byte46 = org.apache.commons.lang3.math.NumberUtils.min(byteArray45);
        java.math.BigInteger bigInteger47 = new java.math.BigInteger((int) (short) -1, byteArray45);
        java.math.BigInteger bigInteger48 = bigInteger41.gcd(bigInteger47);
        java.math.BigDecimal bigDecimal49 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal50 = bigDecimal49.negate();
        java.math.BigDecimal bigDecimal53 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal54 = bigDecimal50.subtract(bigDecimal53);
        java.math.BigInteger bigInteger55 = bigDecimal54.toBigInteger();
        java.math.BigInteger bigInteger56 = bigInteger47.or(bigInteger55);
        byte[] byteArray57 = bigInteger56.toByteArray();
        byte[] byteArray59 = new byte[] { (byte) 1 };
        byte byte60 = org.apache.commons.lang3.math.NumberUtils.min(byteArray59);
        java.math.BigInteger bigInteger61 = new java.math.BigInteger(byteArray59);
        java.math.BigDecimal bigDecimal62 = new java.math.BigDecimal(bigInteger61);
        short short63 = bigInteger61.shortValueExact();
        int int64 = bigInteger61.bitLength();
        java.math.BigInteger[] bigIntegerArray65 = bigInteger56.divideAndRemainder(bigInteger61);
        int int66 = bigInteger61.intValue();
        java.math.BigInteger bigInteger68 = bigInteger61.shiftLeft(117);
        java.math.BigInteger bigInteger69 = bigInteger31.max(bigInteger68);
        boolean boolean71 = bigInteger69.isProbablePrime((-4));
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[1]");
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 1 + "'", byte11 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger13);
        org.junit.Assert.assertNotNull(bigDecimal14);
        org.junit.Assert.assertNotNull(bigDecimal15);
        org.junit.Assert.assertNotNull(bigDecimal18);
        org.junit.Assert.assertNotNull(bigDecimal19);
        org.junit.Assert.assertNotNull(bigInteger20);
        org.junit.Assert.assertNotNull(bigInteger21);
        org.junit.Assert.assertTrue("'" + short22 + "' != '" + (short) -1 + "'", short22 == (short) -1);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[1]");
        org.junit.Assert.assertTrue("'" + byte26 + "' != '" + (byte) 1 + "'", byte26 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger29);
        org.junit.Assert.assertNotNull(bigInteger31);
        org.junit.Assert.assertNotNull(bigInteger32);
        org.junit.Assert.assertNotNull(bigDecimal35);
        org.junit.Assert.assertNotNull(bigDecimal36);
        org.junit.Assert.assertNotNull(bigDecimal39);
        org.junit.Assert.assertNotNull(bigDecimal40);
        org.junit.Assert.assertNotNull(bigInteger41);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray45), "[1]");
        org.junit.Assert.assertTrue("'" + byte46 + "' != '" + (byte) 1 + "'", byte46 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger48);
        org.junit.Assert.assertNotNull(bigDecimal49);
        org.junit.Assert.assertNotNull(bigDecimal50);
        org.junit.Assert.assertNotNull(bigDecimal53);
        org.junit.Assert.assertNotNull(bigDecimal54);
        org.junit.Assert.assertNotNull(bigInteger55);
        org.junit.Assert.assertNotNull(bigInteger56);
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray57), "[-1]");
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray59), "[1]");
        org.junit.Assert.assertTrue("'" + byte60 + "' != '" + (byte) 1 + "'", byte60 == (byte) 1);
        org.junit.Assert.assertTrue("'" + short63 + "' != '" + (short) 1 + "'", short63 == (short) 1);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 1 + "'", int64 == 1);
        org.junit.Assert.assertNotNull(bigIntegerArray65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 1 + "'", int66 == 1);
        org.junit.Assert.assertNotNull(bigInteger68);
        org.junit.Assert.assertNotNull(bigInteger69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
    }

    @Test
    public void test06800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06800");
        long[] longArray5 = new long[] { ' ', (byte) -1, (short) 0, 1L, (short) 10 };
        long long6 = org.apache.commons.lang3.math.NumberUtils.min(longArray5);
        long long7 = org.apache.commons.lang3.math.NumberUtils.min(longArray5);
        long long8 = org.apache.commons.lang3.math.NumberUtils.min(longArray5);
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray5);
        long long10 = org.apache.commons.lang3.math.NumberUtils.min(longArray5);
        long long11 = org.apache.commons.lang3.math.NumberUtils.min(longArray5);
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[32, -1, 0, 1, 10]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 32L + "'", long9 == 32L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
    }

    @Test
    public void test06801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06801");
        char[] charArray8 = new char[] { 'x', '#', '4', ' ', 'a' };
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "Chinese", charArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "\ub3c5\uc77c\uc5b4\ub3c5\uc77c\ub3c5\uc77c\uc5b4\ub3c5\uc77c\ub3c5\uc77c\uc5b4\ub3c5\uc77c)hiengCN", charArray8);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny("UND ", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "x#4 a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "x#4 a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[x, #, 4,  , a]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test06802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06802");
        java.util.Locale locale1 = java.util.Locale.ITALIAN;
        java.lang.String str2 = locale1.getLanguage();
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.upperCase("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", locale1);
        java.util.Locale locale4 = java.util.Locale.GERMANY;
        java.util.Locale locale5 = java.util.Locale.PRC;
        java.lang.String str6 = locale4.getDisplayScript(locale5);
        java.util.Locale locale7 = java.util.Locale.JAPANESE;
        java.lang.String str8 = locale7.getISO3Language();
        java.lang.String str9 = locale4.getDisplayScript(locale7);
        java.lang.String str10 = locale1.getDisplayScript(locale4);
        java.lang.String str11 = locale1.getDisplayScript();
        java.util.Locale.Builder builder12 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder14 = builder12.setLanguageTag("eng");
        java.util.Locale.Builder builder15 = builder14.clearExtensions();
        java.util.Locale locale16 = java.util.Locale.FRANCE;
        java.util.Locale.Builder builder17 = builder15.setLocale(locale16);
        java.util.Locale locale18 = java.util.Locale.FRENCH;
        java.lang.String str19 = locale18.getVariant();
        java.util.Locale locale20 = locale18.stripExtensions();
        java.lang.String str21 = locale20.getDisplayCountry();
        java.util.Locale locale22 = locale20.stripExtensions();
        java.lang.String str23 = locale20.getDisplayLanguage();
        java.util.Locale.Builder builder24 = builder17.setLocale(locale20);
        java.util.Locale.Builder builder25 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder27 = builder25.setLanguageTag("eng");
        java.util.Locale.Builder builder28 = builder27.clearExtensions();
        java.util.Locale locale29 = java.util.Locale.FRANCE;
        java.util.Locale.Builder builder30 = builder28.setLocale(locale29);
        java.util.Locale.Builder builder32 = builder30.addUnicodeLocaleAttribute("engcn");
        java.util.Locale locale33 = builder30.build();
        java.util.Locale.Builder builder34 = builder17.setLocale(locale33);
        java.util.Locale locale35 = java.util.Locale.FRENCH;
        java.lang.String str36 = locale35.getISO3Country();
        java.util.Locale.Builder builder37 = builder17.setLocale(locale35);
        java.lang.String str38 = locale1.getDisplayName(locale35);
        java.util.Locale locale40 = java.util.Locale.forLanguageTag("fr-FRDeutschland");
        java.util.Locale locale41 = locale40.stripExtensions();
        java.lang.String str42 = locale40.toLanguageTag();
        java.util.Locale.Builder builder43 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder45 = builder43.setLanguageTag("eng");
        java.util.Locale.Builder builder46 = builder45.clear();
        java.util.Locale.Builder builder47 = builder46.clear();
        java.util.Locale.Builder builder48 = builder46.clear();
        java.util.Locale.Builder builder49 = builder48.clearExtensions();
        java.util.Locale locale50 = builder48.build();
        java.util.Locale locale51 = java.util.Locale.UK;
        java.lang.String str52 = locale51.getDisplayName();
        java.util.Locale locale54 = java.util.Locale.FRANCE;
        java.lang.String str55 = org.apache.commons.lang3.StringUtils.upperCase("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!", locale54);
        java.lang.String str56 = locale54.getCountry();
        java.lang.String str57 = locale54.getVariant();
        java.util.Locale locale58 = locale54.stripExtensions();
        java.lang.String str59 = locale51.getDisplayScript(locale54);
        java.lang.String str60 = locale50.getDisplayLanguage(locale51);
        java.lang.String str61 = locale40.getDisplayLanguage(locale51);
        java.lang.String str62 = locale35.getDisplayName(locale51);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "it" + "'", str2, "it");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!" + "'", str3, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "jpn" + "'", str8, "jpn");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\u6cd5\u6587" + "'", str23, "\u6cd5\u6587");
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "fr_FR_#u-engcn");
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "italien" + "'", str38, "italien");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "fr");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "fr" + "'", str42, "fr");
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "en_GB");
// flaky:         org.junit.Assert.assertEquals("'" + str52 + "' != '" + "\u82f1\u6587\u82f1\u56fd)" + "'", str52, "\u82f1\u6587\u82f1\u56fd)");
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!!" + "'", str55, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!!");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "FR" + "'", str56, "FR");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "French" + "'", str61, "French");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "French" + "'", str62, "French");
    }

    @Test
    public void test06803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06803");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.TEN;
        long long3 = bigDecimal2.longValueExact();
        java.math.BigDecimal bigDecimal4 = bigDecimal2.ulp();
        java.lang.String str5 = bigDecimal2.toString();
        int int6 = bigDecimal0.compareTo(bigDecimal2);
        java.math.BigDecimal bigDecimal8 = java.math.BigDecimal.valueOf((long) (byte) 100);
        java.math.BigDecimal bigDecimal10 = bigDecimal2.divide(bigDecimal8, (int) (short) 1);
        java.math.BigDecimal bigDecimal11 = java.math.BigDecimal.TEN;
        long long12 = bigDecimal11.longValueExact();
        java.math.BigDecimal bigDecimal13 = bigDecimal10.max(bigDecimal11);
        java.math.BigDecimal bigDecimal14 = bigDecimal10.negate();
        int int15 = bigDecimal14.intValueExact();
        java.math.BigDecimal bigDecimal17 = bigDecimal14.movePointRight((-4));
        java.math.MathContext mathContext18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal19 = bigDecimal17.abs(mathContext18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10" + "'", str5, "10");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(bigDecimal8);
        org.junit.Assert.assertNotNull(bigDecimal10);
        org.junit.Assert.assertNotNull(bigDecimal11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal13);
        org.junit.Assert.assertNotNull(bigDecimal14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(bigDecimal17);
    }

    @Test
    public void test06804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06804");
        byte[] byteArray2 = new byte[] { (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.math.BigInteger bigInteger4 = new java.math.BigInteger((int) (short) -1, byteArray2);
        java.math.BigInteger bigInteger5 = new java.math.BigInteger(byteArray2);
        java.math.BigInteger bigInteger6 = new java.math.BigInteger(byteArray2);
        java.math.BigDecimal bigDecimal7 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal8 = bigDecimal7.negate();
        java.math.BigDecimal bigDecimal11 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal12 = bigDecimal8.subtract(bigDecimal11);
        java.math.BigInteger bigInteger13 = bigDecimal12.toBigInteger();
        double double14 = bigInteger13.doubleValue();
        byte[] byteArray17 = new byte[] { (byte) 1 };
        byte byte18 = org.apache.commons.lang3.math.NumberUtils.min(byteArray17);
        java.math.BigInteger bigInteger19 = new java.math.BigInteger((int) (short) -1, byteArray17);
        java.math.BigInteger bigInteger20 = bigInteger13.gcd(bigInteger19);
        java.math.BigDecimal bigDecimal21 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal22 = bigDecimal21.negate();
        java.math.BigDecimal bigDecimal25 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal26 = bigDecimal22.subtract(bigDecimal25);
        java.math.BigInteger bigInteger27 = bigDecimal26.toBigInteger();
        java.math.BigInteger bigInteger28 = bigInteger19.or(bigInteger27);
        double double29 = bigInteger28.doubleValue();
        java.math.BigInteger bigInteger30 = bigInteger6.divide(bigInteger28);
        java.math.BigInteger bigInteger32 = bigInteger28.pow(3);
        short short33 = bigInteger28.shortValueExact();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
        org.junit.Assert.assertNotNull(bigDecimal7);
        org.junit.Assert.assertNotNull(bigDecimal8);
        org.junit.Assert.assertNotNull(bigDecimal11);
        org.junit.Assert.assertNotNull(bigDecimal12);
        org.junit.Assert.assertNotNull(bigInteger13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[1]");
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) 1 + "'", byte18 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger20);
        org.junit.Assert.assertNotNull(bigDecimal21);
        org.junit.Assert.assertNotNull(bigDecimal22);
        org.junit.Assert.assertNotNull(bigDecimal25);
        org.junit.Assert.assertNotNull(bigDecimal26);
        org.junit.Assert.assertNotNull(bigInteger27);
        org.junit.Assert.assertNotNull(bigInteger28);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + (-1.0d) + "'", double29 == (-1.0d));
        org.junit.Assert.assertNotNull(bigInteger30);
        org.junit.Assert.assertNotNull(bigInteger32);
        org.junit.Assert.assertTrue("'" + short33 + "' != '" + (short) -1 + "'", short33 == (short) -1);
    }

    @Test
    public void test06805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06805");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06806");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("China");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test06807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06807");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setLanguageTag("eng");
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        java.util.Locale locale4 = builder0.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder0.setUnicodeLocaleKeyword("EN", "SETATS DETINU");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword type: SETATS DETINU [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "eng");
    }

    @Test
    public void test06808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06808");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("en-GB", (double) 13L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=13.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06809");
        java.math.BigDecimal bigDecimal1 = java.math.BigDecimal.valueOf((double) 117);
        double double2 = bigDecimal1.doubleValue();
        java.math.BigDecimal bigDecimal3 = bigDecimal1.ulp();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal5 = bigDecimal4.negate();
        java.math.BigDecimal bigDecimal6 = bigDecimal4.negate();
        java.lang.String str7 = bigDecimal4.toString();
        java.math.BigDecimal bigDecimal9 = new java.math.BigDecimal((double) 1L);
        java.lang.Object[] objArray12 = new java.lang.Object[] { (short) 10, (short) 100 };
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(objArray12, "hi!", (int) (byte) 100, (int) (short) -1);
        boolean boolean17 = bigDecimal9.equals((java.lang.Object) (short) -1);
        java.math.BigDecimal bigDecimal18 = bigDecimal4.max(bigDecimal9);
        java.math.BigDecimal bigDecimal21 = java.math.BigDecimal.valueOf((long) (byte) -1, 0);
        java.math.BigDecimal bigDecimal22 = bigDecimal21.plus();
        java.math.BigDecimal bigDecimal23 = bigDecimal4.remainder(bigDecimal21);
        java.math.BigDecimal bigDecimal24 = bigDecimal3.add(bigDecimal23);
        java.math.BigDecimal bigDecimal25 = bigDecimal3.abs();
        java.math.BigDecimal bigDecimal26 = java.math.BigDecimal.TEN;
        long long27 = bigDecimal26.longValueExact();
        int int28 = bigDecimal26.intValue();
        java.math.BigDecimal bigDecimal30 = bigDecimal26.scaleByPowerOfTen(0);
        java.math.BigDecimal bigDecimal31 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal32 = bigDecimal31.negate();
        java.math.BigDecimal bigDecimal35 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal36 = bigDecimal32.subtract(bigDecimal35);
        java.math.BigDecimal bigDecimal37 = java.math.BigDecimal.TEN;
        java.math.BigDecimal bigDecimal38 = bigDecimal35.min(bigDecimal37);
        java.lang.String str39 = bigDecimal38.toPlainString();
        java.math.BigDecimal bigDecimal40 = bigDecimal26.subtract(bigDecimal38);
        java.math.BigDecimal bigDecimal42 = bigDecimal40.movePointLeft(9);
        java.math.MathContext mathContext43 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal44 = bigDecimal3.divide(bigDecimal42, mathContext43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 117.0d + "'", double2 == 117.0d);
        org.junit.Assert.assertNotNull(bigDecimal3);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigDecimal6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0" + "'", str7, "0");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[10, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[10, 100]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(bigDecimal18);
        org.junit.Assert.assertNotNull(bigDecimal21);
        org.junit.Assert.assertNotNull(bigDecimal22);
        org.junit.Assert.assertNotNull(bigDecimal23);
        org.junit.Assert.assertNotNull(bigDecimal24);
        org.junit.Assert.assertNotNull(bigDecimal25);
        org.junit.Assert.assertNotNull(bigDecimal26);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 10L + "'", long27 == 10L);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
        org.junit.Assert.assertNotNull(bigDecimal30);
        org.junit.Assert.assertNotNull(bigDecimal31);
        org.junit.Assert.assertNotNull(bigDecimal32);
        org.junit.Assert.assertNotNull(bigDecimal35);
        org.junit.Assert.assertNotNull(bigDecimal36);
        org.junit.Assert.assertNotNull(bigDecimal37);
        org.junit.Assert.assertNotNull(bigDecimal38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "0.0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000100" + "'", str39, "0.0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000100");
        org.junit.Assert.assertNotNull(bigDecimal40);
        org.junit.Assert.assertNotNull(bigDecimal42);
    }

    @Test
    public void test06810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06810");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("#_eng", 35);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06811");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal5 = bigDecimal1.subtract(bigDecimal4);
        java.math.BigInteger bigInteger6 = bigDecimal5.toBigInteger();
        double double7 = bigInteger6.doubleValue();
        byte[] byteArray10 = new byte[] { (byte) 1 };
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.min(byteArray10);
        java.math.BigInteger bigInteger12 = new java.math.BigInteger((int) (short) -1, byteArray10);
        java.math.BigInteger bigInteger13 = bigInteger6.gcd(bigInteger12);
        java.math.BigDecimal bigDecimal14 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal15 = bigDecimal14.negate();
        java.math.BigDecimal bigDecimal18 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal19 = bigDecimal15.subtract(bigDecimal18);
        java.math.BigInteger bigInteger20 = bigDecimal19.toBigInteger();
        java.math.BigInteger bigInteger21 = bigInteger12.or(bigInteger20);
        java.math.BigInteger bigInteger23 = bigInteger20.shiftRight((int) (short) -1);
        java.math.BigDecimal bigDecimal24 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal25 = bigDecimal24.negate();
        java.math.BigDecimal bigDecimal28 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal29 = bigDecimal25.subtract(bigDecimal28);
        java.math.BigInteger bigInteger30 = bigDecimal29.toBigInteger();
        double double31 = bigInteger30.doubleValue();
        byte[] byteArray34 = new byte[] { (byte) 1 };
        byte byte35 = org.apache.commons.lang3.math.NumberUtils.min(byteArray34);
        java.math.BigInteger bigInteger36 = new java.math.BigInteger((int) (short) -1, byteArray34);
        java.math.BigInteger bigInteger37 = bigInteger30.gcd(bigInteger36);
        java.math.BigDecimal bigDecimal38 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal39 = bigDecimal38.negate();
        java.math.BigDecimal bigDecimal42 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal43 = bigDecimal39.subtract(bigDecimal42);
        java.math.BigInteger bigInteger44 = bigDecimal43.toBigInteger();
        java.math.BigInteger bigInteger45 = bigInteger36.or(bigInteger44);
        java.math.BigInteger bigInteger47 = bigInteger44.shiftRight((int) (short) -1);
        java.math.BigInteger bigInteger48 = bigInteger23.max(bigInteger44);
        java.math.BigInteger bigInteger50 = bigInteger44.shiftLeft((-1));
        java.math.BigInteger bigInteger52 = bigInteger44.shiftRight(5);
        java.lang.String str54 = bigInteger52.toString((int) '4');
        java.math.BigInteger bigInteger55 = bigInteger52.abs();
        int int56 = bigInteger52.intValueExact();
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[1]");
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 1 + "'", byte11 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger13);
        org.junit.Assert.assertNotNull(bigDecimal14);
        org.junit.Assert.assertNotNull(bigDecimal15);
        org.junit.Assert.assertNotNull(bigDecimal18);
        org.junit.Assert.assertNotNull(bigDecimal19);
        org.junit.Assert.assertNotNull(bigInteger20);
        org.junit.Assert.assertNotNull(bigInteger21);
        org.junit.Assert.assertNotNull(bigInteger23);
        org.junit.Assert.assertNotNull(bigDecimal24);
        org.junit.Assert.assertNotNull(bigDecimal25);
        org.junit.Assert.assertNotNull(bigDecimal28);
        org.junit.Assert.assertNotNull(bigDecimal29);
        org.junit.Assert.assertNotNull(bigInteger30);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[1]");
        org.junit.Assert.assertTrue("'" + byte35 + "' != '" + (byte) 1 + "'", byte35 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger37);
        org.junit.Assert.assertNotNull(bigDecimal38);
        org.junit.Assert.assertNotNull(bigDecimal39);
        org.junit.Assert.assertNotNull(bigDecimal42);
        org.junit.Assert.assertNotNull(bigDecimal43);
        org.junit.Assert.assertNotNull(bigInteger44);
        org.junit.Assert.assertNotNull(bigInteger45);
        org.junit.Assert.assertNotNull(bigInteger47);
        org.junit.Assert.assertNotNull(bigInteger48);
        org.junit.Assert.assertNotNull(bigInteger50);
        org.junit.Assert.assertNotNull(bigInteger52);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "0" + "'", str54, "0");
        org.junit.Assert.assertNotNull(bigInteger55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
    }

    @Test
    public void test06812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06812");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("\u82f1\u8a9e\u30a4\u30ae\u30ea", "TWN                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u82f1\u8a9e\u30a4\u30ae\u30ea" + "'", str2, "\u82f1\u8a9e\u30a4\u30ae\u30ea");
    }

    @Test
    public void test06813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06813");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9                                             ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=         rf-rf                               ?? (?????                                             ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06814");
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.valueOf((long) 301, (int) '4');
        java.math.BigDecimal bigDecimal4 = bigDecimal2.scaleByPowerOfTen(7);
        java.math.MathContext mathContext5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal6 = bigDecimal2.plus(mathContext5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal2);
        org.junit.Assert.assertNotNull(bigDecimal4);
    }

    @Test
    public void test06815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06815");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("\uc77c\ub3c5\uc5b4\uc77c\ub3c5");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \")??????( ????????\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06816");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("\u82f1\u8a9e\u30a4\u30ad\u3099\u30ea\u30b9) ", "aauabuaeuafuakuamuanuaruasuavuayuazubaubeubgubhubiubmubnuboubrubsucauceuchucoucrucsucuucvucyudaudeudvudzueeueluenueouesuetueuufauffufiufjufoufrufyugaugduglugnuguugvuhauheuhiuhouhruhtuhuuhyuhzuiauiduieuiguiiuikuinuiouisuituiuuiwujaujiujvukaukgukiukjukkuklukmuknukoukruksukuukvukwukyulaulbulguliulnuloultuluulvumgumhumiumkumlumnumoumrumsumtumyunaunbunduneungunlunnunounrunvunyuocuojuomuoruosupaupiuplupsuptuquurmurnurouruurwusauscusduseusgusiuskuslusmusnusousqusrussustusuusvuswutauteutguthutiutkutlutnutoutrutsuttutwutyuuguukuuruuzuveuviuvouwauwouxhuyiuyouzauzhuzu", "\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u82f1\u8a9e\u30a4\u30ad\u3099\u30ea\u30b9) " + "'", str3, "\u82f1\u8a9e\u30a4\u30ad\u3099\u30ea\u30b9) ");
    }

    @Test
    public void test06817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06817");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("\u97e9\u56fd");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u97e9\u56fd" + "'", str1, "\u97e9\u56fd");
    }

    @Test
    public void test06818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06818");
        java.math.BigInteger bigInteger1 = java.math.BigInteger.valueOf(100L);
        org.junit.Assert.assertNotNull(bigInteger1);
    }

    @Test
    public void test06819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06819");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06820");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 10, (short) -2, (short) (byte) -33);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -33 + "'", short3 == (short) -33);
    }

    @Test
    public void test06821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06821");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("FRA", 1, 4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "FRA" + "'", str3, "FRA");
    }

    @Test
    public void test06822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06822");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("VEREINIGTES K\326NIGREICH           ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "VEREINIGTES K\326NIGREICH          " + "'", str1, "VEREINIGTES K\326NIGREICH          ");
    }

    @Test
    public void test06823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06823");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        java.util.List<java.lang.String> strList9 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList7);
        java.util.Locale.LanguageRange[] languageRangeArray10 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList11 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList11, languageRangeArray10);
        java.lang.String[] strArray14 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        java.lang.String str17 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList11, (java.util.Collection<java.lang.String>) strList15);
        java.lang.String str18 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList15);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList1, "English");
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList1, '4');
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList1, "10");
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(languageRangeArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test06824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06824");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) (byte) 10, 7, (int) (byte) 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test06825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06825");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "                                                                                                                                                                                                                                                                        HindiHindiHindiRF-RFHindiHindiHindi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06826");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "Koreanisch(S\374dkorea)", "FR-FR");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test06827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06827");
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal(0L);
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal3 = bigDecimal2.negate();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.TEN;
        long long5 = bigDecimal4.longValueExact();
        java.math.BigDecimal bigDecimal6 = bigDecimal4.ulp();
        java.lang.String str7 = bigDecimal4.toString();
        int int8 = bigDecimal2.compareTo(bigDecimal4);
        int int9 = bigDecimal4.precision();
        int int10 = bigDecimal4.precision();
        java.math.BigDecimal bigDecimal11 = bigDecimal1.divideToIntegralValue(bigDecimal4);
        short short12 = bigDecimal1.shortValue();
        org.junit.Assert.assertNotNull(bigDecimal2);
        org.junit.Assert.assertNotNull(bigDecimal3);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10" + "'", str7, "10");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(bigDecimal11);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
    }

    @Test
    public void test06828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06828");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        double double1 = bigDecimal0.doubleValue();
        java.math.BigDecimal bigDecimal3 = bigDecimal0.movePointLeft((int) (byte) -1);
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal5 = bigDecimal4.negate();
        java.math.BigDecimal bigDecimal6 = bigDecimal4.negate();
        java.lang.String str7 = bigDecimal4.toString();
        java.math.BigDecimal bigDecimal9 = bigDecimal4.scaleByPowerOfTen(0);
        java.math.BigDecimal bigDecimal10 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal11 = bigDecimal10.negate();
        java.math.BigDecimal bigDecimal12 = java.math.BigDecimal.TEN;
        long long13 = bigDecimal12.longValueExact();
        java.math.BigDecimal bigDecimal14 = bigDecimal12.ulp();
        java.lang.String str15 = bigDecimal12.toString();
        int int16 = bigDecimal10.compareTo(bigDecimal12);
        java.math.BigDecimal bigDecimal18 = java.math.BigDecimal.valueOf((long) (byte) 100);
        java.math.BigDecimal bigDecimal20 = bigDecimal12.divide(bigDecimal18, (int) (short) 1);
        java.math.BigDecimal bigDecimal21 = java.math.BigDecimal.TEN;
        long long22 = bigDecimal21.longValueExact();
        java.math.BigDecimal bigDecimal23 = bigDecimal20.max(bigDecimal21);
        java.math.BigDecimal bigDecimal24 = bigDecimal4.add(bigDecimal20);
        java.math.BigDecimal bigDecimal25 = bigDecimal0.multiply(bigDecimal4);
        java.math.BigDecimal bigDecimal26 = java.math.BigDecimal.TEN;
        long long27 = bigDecimal26.longValueExact();
        java.math.BigDecimal bigDecimal28 = bigDecimal26.ulp();
        java.lang.String str29 = bigDecimal26.toString();
        java.math.BigDecimal bigDecimal30 = bigDecimal26.stripTrailingZeros();
        java.math.BigDecimal bigDecimal31 = bigDecimal4.remainder(bigDecimal30);
        java.math.BigInteger bigInteger32 = bigDecimal30.unscaledValue();
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(bigDecimal3);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigDecimal6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0" + "'", str7, "0");
        org.junit.Assert.assertNotNull(bigDecimal9);
        org.junit.Assert.assertNotNull(bigDecimal10);
        org.junit.Assert.assertNotNull(bigDecimal11);
        org.junit.Assert.assertNotNull(bigDecimal12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10" + "'", str15, "10");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(bigDecimal18);
        org.junit.Assert.assertNotNull(bigDecimal20);
        org.junit.Assert.assertNotNull(bigDecimal21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 10L + "'", long22 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal23);
        org.junit.Assert.assertNotNull(bigDecimal24);
        org.junit.Assert.assertNotNull(bigDecimal25);
        org.junit.Assert.assertNotNull(bigDecimal26);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 10L + "'", long27 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "10" + "'", str29, "10");
        org.junit.Assert.assertNotNull(bigDecimal30);
        org.junit.Assert.assertNotNull(bigDecimal31);
        org.junit.Assert.assertNotNull(bigInteger32);
    }

    @Test
    public void test06829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06829");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("Eng                                                                                                                                                                                                                                                                                                          ", "\u671d\u9c9c\u6587\u30a4\u30bf\u30ea\u30a2\u8a9e\u671d\u9c9c\u6587\u30a4\u30bf\u30ea\u30a2\u8a9e\u671d\u9c9c\u6587\u30a4\u30bf\u30ea\u30a2\u8a9e\u671d\u9c9c\u6587\u30a4\u30bf\u30ea\u30a2\u8a9e\u671d\u9c9c\u6587\u30a4\u30bf\u30ea\u30a2\u8a9e\u671d\u9c9c\u6587", (-2));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06830");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal5 = bigDecimal1.subtract(bigDecimal4);
        java.math.BigInteger bigInteger6 = bigDecimal5.toBigInteger();
        double double7 = bigInteger6.doubleValue();
        byte[] byteArray10 = new byte[] { (byte) 1 };
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.min(byteArray10);
        java.math.BigInteger bigInteger12 = new java.math.BigInteger((int) (short) -1, byteArray10);
        java.math.BigInteger bigInteger13 = bigInteger6.gcd(bigInteger12);
        java.math.BigDecimal bigDecimal14 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal15 = bigDecimal14.negate();
        java.math.BigDecimal bigDecimal18 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal19 = bigDecimal15.subtract(bigDecimal18);
        java.math.BigInteger bigInteger20 = bigDecimal19.toBigInteger();
        java.math.BigInteger bigInteger21 = bigInteger12.or(bigInteger20);
        short short22 = bigInteger12.shortValueExact();
        byte[] byteArray25 = new byte[] { (byte) 1 };
        byte byte26 = org.apache.commons.lang3.math.NumberUtils.min(byteArray25);
        java.math.BigInteger bigInteger27 = new java.math.BigInteger((int) (short) -1, byteArray25);
        java.math.BigInteger bigInteger29 = bigInteger27.pow((int) 'a');
        java.math.BigInteger bigInteger31 = bigInteger27.shiftLeft((int) (short) 1);
        java.math.BigInteger bigInteger32 = bigInteger12.xor(bigInteger31);
        java.math.BigDecimal bigDecimal34 = new java.math.BigDecimal(bigInteger31, (int) '#');
        java.math.BigDecimal bigDecimal35 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal36 = bigDecimal35.negate();
        java.math.BigDecimal bigDecimal39 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal40 = bigDecimal36.subtract(bigDecimal39);
        java.math.BigInteger bigInteger41 = bigDecimal40.toBigInteger();
        double double42 = bigInteger41.doubleValue();
        byte[] byteArray45 = new byte[] { (byte) 1 };
        byte byte46 = org.apache.commons.lang3.math.NumberUtils.min(byteArray45);
        java.math.BigInteger bigInteger47 = new java.math.BigInteger((int) (short) -1, byteArray45);
        java.math.BigInteger bigInteger48 = bigInteger41.gcd(bigInteger47);
        java.math.BigDecimal bigDecimal49 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal50 = bigDecimal49.negate();
        java.math.BigDecimal bigDecimal53 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal54 = bigDecimal50.subtract(bigDecimal53);
        java.math.BigInteger bigInteger55 = bigDecimal54.toBigInteger();
        java.math.BigInteger bigInteger56 = bigInteger47.or(bigInteger55);
        byte[] byteArray57 = bigInteger56.toByteArray();
        byte[] byteArray59 = new byte[] { (byte) 1 };
        byte byte60 = org.apache.commons.lang3.math.NumberUtils.min(byteArray59);
        java.math.BigInteger bigInteger61 = new java.math.BigInteger(byteArray59);
        java.math.BigDecimal bigDecimal62 = new java.math.BigDecimal(bigInteger61);
        short short63 = bigInteger61.shortValueExact();
        int int64 = bigInteger61.bitLength();
        java.math.BigInteger[] bigIntegerArray65 = bigInteger56.divideAndRemainder(bigInteger61);
        int int66 = bigInteger61.intValue();
        java.math.BigInteger bigInteger68 = bigInteger61.shiftLeft(117);
        java.math.BigInteger bigInteger69 = bigInteger31.max(bigInteger68);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger71 = bigInteger69.clearBit((int) (short) -18);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Negative bit address");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[1]");
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 1 + "'", byte11 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger13);
        org.junit.Assert.assertNotNull(bigDecimal14);
        org.junit.Assert.assertNotNull(bigDecimal15);
        org.junit.Assert.assertNotNull(bigDecimal18);
        org.junit.Assert.assertNotNull(bigDecimal19);
        org.junit.Assert.assertNotNull(bigInteger20);
        org.junit.Assert.assertNotNull(bigInteger21);
        org.junit.Assert.assertTrue("'" + short22 + "' != '" + (short) -1 + "'", short22 == (short) -1);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[1]");
        org.junit.Assert.assertTrue("'" + byte26 + "' != '" + (byte) 1 + "'", byte26 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger29);
        org.junit.Assert.assertNotNull(bigInteger31);
        org.junit.Assert.assertNotNull(bigInteger32);
        org.junit.Assert.assertNotNull(bigDecimal35);
        org.junit.Assert.assertNotNull(bigDecimal36);
        org.junit.Assert.assertNotNull(bigDecimal39);
        org.junit.Assert.assertNotNull(bigDecimal40);
        org.junit.Assert.assertNotNull(bigInteger41);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray45), "[1]");
        org.junit.Assert.assertTrue("'" + byte46 + "' != '" + (byte) 1 + "'", byte46 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger48);
        org.junit.Assert.assertNotNull(bigDecimal49);
        org.junit.Assert.assertNotNull(bigDecimal50);
        org.junit.Assert.assertNotNull(bigDecimal53);
        org.junit.Assert.assertNotNull(bigDecimal54);
        org.junit.Assert.assertNotNull(bigInteger55);
        org.junit.Assert.assertNotNull(bigInteger56);
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray57), "[-1]");
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray59), "[1]");
        org.junit.Assert.assertTrue("'" + byte60 + "' != '" + (byte) 1 + "'", byte60 == (byte) 1);
        org.junit.Assert.assertTrue("'" + short63 + "' != '" + (short) 1 + "'", short63 == (short) 1);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 1 + "'", int64 == 1);
        org.junit.Assert.assertNotNull(bigIntegerArray65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 1 + "'", int66 == 1);
        org.junit.Assert.assertNotNull(bigInteger68);
        org.junit.Assert.assertNotNull(bigInteger69);
    }

    @Test
    public void test06831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06831");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\uc911\uad6d\uc5b4\uc911\uad6d)", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", 10);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, 'a', 120, (int) (byte) 1);
        int int9 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test06832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06832");
        java.util.Locale locale0 = java.util.Locale.CANADA;
        java.lang.String str1 = locale0.toLanguageTag();
        java.util.Locale locale4 = new java.util.Locale("\u4e2d\u6587", "\ub3c5\uc77c\uc5b4\ub3c5\uc77c)");
        java.lang.String str5 = locale0.getDisplayScript(locale4);
        java.lang.String str6 = locale0.getISO3Language();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "en-CA" + "'", str1, "en-CA");
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "\u4e2d\u6587\ub3c5\uc77c\uc5b4\ub3c5\uc77c)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "eng" + "'", str6, "eng");
    }

    @Test
    public void test06833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06833");
        java.util.Locale locale0 = java.util.Locale.PRC;
        java.util.Locale locale1 = null;
        java.lang.String str2 = locale0.getDisplayScript(locale1);
        java.lang.String str3 = locale0.getScript();
        java.lang.String str4 = locale0.getDisplayScript();
        java.util.Locale.setDefault(locale0);
        java.util.Locale locale7 = java.util.Locale.FRANCE;
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.upperCase("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!", locale7);
        java.lang.String str9 = locale7.getCountry();
        java.lang.String str10 = locale7.getVariant();
        java.util.Locale locale11 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str12 = locale7.getDisplayLanguage(locale11);
        java.lang.String str13 = locale7.getISO3Country();
        java.lang.String str14 = locale0.getDisplayScript(locale7);
        java.util.Locale.Builder builder15 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder17 = builder15.setLanguageTag("eng");
        java.util.Locale.Builder builder18 = builder17.clearExtensions();
        java.util.Locale locale19 = java.util.Locale.FRANCE;
        java.util.Locale.Builder builder20 = builder18.setLocale(locale19);
        java.util.Locale locale21 = java.util.Locale.FRENCH;
        java.lang.String str22 = locale21.getVariant();
        java.util.Locale locale23 = locale21.stripExtensions();
        java.lang.String str24 = locale23.getDisplayCountry();
        java.util.Locale locale25 = locale23.stripExtensions();
        java.lang.String str26 = locale23.getDisplayLanguage();
        java.util.Locale.Builder builder27 = builder20.setLocale(locale23);
        java.lang.String str28 = locale7.getDisplayScript(locale23);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str30 = locale23.getExtension('4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!!" + "'", str8, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "FR" + "'", str9, "FR");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\u6cd5\u6587" + "'", str12, "\u6cd5\u6587");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "FRA" + "'", str13, "FRA");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\u6cd5\u6587" + "'", str26, "\u6cd5\u6587");
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test06834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06834");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.TEN;
        long long3 = bigDecimal2.longValueExact();
        java.math.BigDecimal bigDecimal4 = bigDecimal2.ulp();
        java.lang.String str5 = bigDecimal2.toString();
        int int6 = bigDecimal0.compareTo(bigDecimal2);
        short short7 = bigDecimal0.shortValueExact();
        java.math.BigDecimal bigDecimal9 = bigDecimal0.scaleByPowerOfTen((-1));
        double double10 = bigDecimal9.doubleValue();
        java.math.BigDecimal bigDecimal11 = bigDecimal9.negate();
        java.math.BigDecimal bigDecimal12 = java.math.BigDecimal.TEN;
        long long13 = bigDecimal12.longValueExact();
        java.math.BigDecimal bigDecimal14 = bigDecimal12.ulp();
        java.lang.String str15 = bigDecimal12.toString();
        java.math.BigDecimal bigDecimal16 = java.math.BigDecimal.TEN;
        long long17 = bigDecimal16.longValueExact();
        java.math.BigDecimal bigDecimal18 = java.math.BigDecimal.ZERO;
        double double19 = bigDecimal18.doubleValue();
        java.math.BigDecimal bigDecimal21 = bigDecimal18.movePointLeft((int) (byte) -1);
        int int22 = bigDecimal21.intValue();
        java.math.BigDecimal bigDecimal23 = bigDecimal16.add(bigDecimal21);
        java.math.BigDecimal bigDecimal24 = bigDecimal12.add(bigDecimal23);
        java.math.BigDecimal bigDecimal26 = bigDecimal24.pow((int) '#');
        java.math.BigDecimal bigDecimal27 = java.math.BigDecimal.TEN;
        long long28 = bigDecimal27.longValueExact();
        java.math.BigDecimal bigDecimal29 = bigDecimal27.ulp();
        java.math.BigDecimal bigDecimal31 = bigDecimal29.movePointLeft((int) (short) 10);
        java.math.BigDecimal bigDecimal32 = bigDecimal29.plus();
        java.math.BigDecimal bigDecimal34 = bigDecimal29.movePointLeft(2);
        java.math.BigDecimal bigDecimal35 = bigDecimal24.add(bigDecimal34);
        java.math.BigDecimal bigDecimal36 = bigDecimal24.negate();
        java.math.BigDecimal bigDecimal37 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal39 = bigDecimal37.movePointLeft((int) (byte) 0);
        java.lang.String str40 = bigDecimal39.toPlainString();
        byte byte41 = bigDecimal39.byteValueExact();
        java.math.BigDecimal bigDecimal42 = java.math.BigDecimal.ZERO;
        double double43 = bigDecimal42.doubleValue();
        java.math.BigInteger bigInteger44 = bigDecimal42.toBigInteger();
        byte[] byteArray47 = new byte[] { (byte) 1 };
        byte byte48 = org.apache.commons.lang3.math.NumberUtils.min(byteArray47);
        java.math.BigInteger bigInteger49 = new java.math.BigInteger((int) (short) -1, byteArray47);
        java.math.BigInteger bigInteger51 = bigInteger49.pow((int) 'a');
        byte[] byteArray52 = bigInteger49.toByteArray();
        long long53 = bigInteger49.longValueExact();
        java.math.BigInteger bigInteger54 = bigInteger44.or(bigInteger49);
        byte byte55 = bigInteger49.byteValueExact();
        java.math.BigDecimal bigDecimal57 = new java.math.BigDecimal(bigInteger49, (int) (byte) 0);
        java.math.BigDecimal bigDecimal58 = bigDecimal39.multiply(bigDecimal57);
        java.math.BigDecimal[] bigDecimalArray59 = bigDecimal36.divideAndRemainder(bigDecimal57);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal62 = bigDecimal9.divide(bigDecimal57, 0, 320);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding mode");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10" + "'", str5, "10");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 0 + "'", short7 == (short) 0);
        org.junit.Assert.assertNotNull(bigDecimal9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(bigDecimal11);
        org.junit.Assert.assertNotNull(bigDecimal12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10" + "'", str15, "10");
        org.junit.Assert.assertNotNull(bigDecimal16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10L + "'", long17 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(bigDecimal21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(bigDecimal23);
        org.junit.Assert.assertNotNull(bigDecimal24);
        org.junit.Assert.assertNotNull(bigDecimal26);
        org.junit.Assert.assertNotNull(bigDecimal27);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 10L + "'", long28 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal29);
        org.junit.Assert.assertNotNull(bigDecimal31);
        org.junit.Assert.assertNotNull(bigDecimal32);
        org.junit.Assert.assertNotNull(bigDecimal34);
        org.junit.Assert.assertNotNull(bigDecimal35);
        org.junit.Assert.assertNotNull(bigDecimal36);
        org.junit.Assert.assertNotNull(bigDecimal37);
        org.junit.Assert.assertNotNull(bigDecimal39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "0" + "'", str40, "0");
        org.junit.Assert.assertTrue("'" + byte41 + "' != '" + (byte) 0 + "'", byte41 == (byte) 0);
        org.junit.Assert.assertNotNull(bigDecimal42);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertNotNull(bigInteger44);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray47), "[1]");
        org.junit.Assert.assertTrue("'" + byte48 + "' != '" + (byte) 1 + "'", byte48 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger51);
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray52), "[-1]");
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + (-1L) + "'", long53 == (-1L));
        org.junit.Assert.assertNotNull(bigInteger54);
        org.junit.Assert.assertTrue("'" + byte55 + "' != '" + (byte) -1 + "'", byte55 == (byte) -1);
        org.junit.Assert.assertNotNull(bigDecimal58);
        org.junit.Assert.assertNotNull(bigDecimalArray59);
    }

    @Test
    public void test06835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06835");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "english");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06836");
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal((double) 100.0f);
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal3 = bigDecimal2.negate();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.TEN;
        long long5 = bigDecimal4.longValueExact();
        java.math.BigDecimal bigDecimal6 = bigDecimal4.ulp();
        java.lang.String str7 = bigDecimal4.toString();
        int int8 = bigDecimal2.compareTo(bigDecimal4);
        java.math.BigDecimal bigDecimal10 = java.math.BigDecimal.valueOf((long) (byte) 100);
        java.math.BigDecimal bigDecimal12 = bigDecimal4.divide(bigDecimal10, (int) (short) 1);
        java.math.BigDecimal bigDecimal13 = java.math.BigDecimal.TEN;
        long long14 = bigDecimal13.longValueExact();
        java.math.BigDecimal bigDecimal15 = bigDecimal12.max(bigDecimal13);
        java.math.BigDecimal bigDecimal16 = java.math.BigDecimal.TEN;
        long long17 = bigDecimal16.longValueExact();
        java.math.BigDecimal bigDecimal18 = bigDecimal16.ulp();
        java.math.BigDecimal bigDecimal19 = bigDecimal13.subtract(bigDecimal16);
        double double20 = bigDecimal16.doubleValue();
        java.math.BigDecimal bigDecimal21 = bigDecimal1.divideToIntegralValue(bigDecimal16);
        java.math.BigDecimal bigDecimal22 = java.math.BigDecimal.ZERO;
        double double23 = bigDecimal22.doubleValue();
        java.math.BigInteger bigInteger24 = bigDecimal22.toBigInteger();
        java.lang.String str25 = bigDecimal22.toPlainString();
        java.math.BigDecimal bigDecimal26 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal27 = bigDecimal26.negate();
        java.math.BigDecimal bigDecimal28 = bigDecimal26.negate();
        int int29 = bigDecimal28.intValueExact();
        java.math.BigDecimal bigDecimal30 = bigDecimal22.max(bigDecimal28);
        int int31 = bigDecimal30.precision();
        java.math.BigDecimal bigDecimal32 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal33 = bigDecimal32.negate();
        java.math.BigDecimal bigDecimal34 = bigDecimal32.negate();
        java.lang.String str35 = bigDecimal32.toString();
        java.math.BigDecimal bigDecimal37 = bigDecimal32.scaleByPowerOfTen(0);
        java.math.BigDecimal bigDecimal38 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal39 = bigDecimal38.negate();
        java.math.BigDecimal bigDecimal40 = java.math.BigDecimal.TEN;
        long long41 = bigDecimal40.longValueExact();
        java.math.BigDecimal bigDecimal42 = bigDecimal40.ulp();
        java.lang.String str43 = bigDecimal40.toString();
        int int44 = bigDecimal38.compareTo(bigDecimal40);
        java.math.BigDecimal bigDecimal46 = java.math.BigDecimal.valueOf((long) (byte) 100);
        java.math.BigDecimal bigDecimal48 = bigDecimal40.divide(bigDecimal46, (int) (short) 1);
        java.math.BigDecimal bigDecimal49 = java.math.BigDecimal.TEN;
        long long50 = bigDecimal49.longValueExact();
        java.math.BigDecimal bigDecimal51 = bigDecimal48.max(bigDecimal49);
        java.math.BigDecimal bigDecimal52 = bigDecimal32.add(bigDecimal48);
        int int53 = bigDecimal30.compareTo(bigDecimal48);
        java.math.BigDecimal bigDecimal54 = bigDecimal16.subtract(bigDecimal30);
        java.math.BigDecimal bigDecimal55 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal56 = bigDecimal55.negate();
        java.math.BigDecimal bigDecimal57 = bigDecimal56.abs();
        int int58 = bigDecimal56.intValueExact();
        java.math.BigDecimal bigDecimal59 = bigDecimal16.min(bigDecimal56);
        java.math.BigDecimal bigDecimal60 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal61 = bigDecimal60.negate();
        java.math.BigDecimal bigDecimal62 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal63 = bigDecimal62.negate();
        java.math.BigDecimal bigDecimal64 = bigDecimal62.negate();
        java.lang.String str65 = bigDecimal64.toEngineeringString();
        java.math.BigDecimal bigDecimal66 = bigDecimal61.multiply(bigDecimal64);
        java.math.BigDecimal bigDecimal68 = bigDecimal61.movePointLeft(0);
        java.math.MathContext mathContext69 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal70 = bigDecimal16.remainder(bigDecimal68, mathContext69);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal2);
        org.junit.Assert.assertNotNull(bigDecimal3);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10" + "'", str7, "10");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(bigDecimal10);
        org.junit.Assert.assertNotNull(bigDecimal12);
        org.junit.Assert.assertNotNull(bigDecimal13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal15);
        org.junit.Assert.assertNotNull(bigDecimal16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10L + "'", long17 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal18);
        org.junit.Assert.assertNotNull(bigDecimal19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
        org.junit.Assert.assertNotNull(bigDecimal21);
        org.junit.Assert.assertNotNull(bigDecimal22);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertNotNull(bigInteger24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "0" + "'", str25, "0");
        org.junit.Assert.assertNotNull(bigDecimal26);
        org.junit.Assert.assertNotNull(bigDecimal27);
        org.junit.Assert.assertNotNull(bigDecimal28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(bigDecimal30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(bigDecimal32);
        org.junit.Assert.assertNotNull(bigDecimal33);
        org.junit.Assert.assertNotNull(bigDecimal34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "0" + "'", str35, "0");
        org.junit.Assert.assertNotNull(bigDecimal37);
        org.junit.Assert.assertNotNull(bigDecimal38);
        org.junit.Assert.assertNotNull(bigDecimal39);
        org.junit.Assert.assertNotNull(bigDecimal40);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 10L + "'", long41 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "10" + "'", str43, "10");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(bigDecimal46);
        org.junit.Assert.assertNotNull(bigDecimal48);
        org.junit.Assert.assertNotNull(bigDecimal49);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 10L + "'", long50 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal51);
        org.junit.Assert.assertNotNull(bigDecimal52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(bigDecimal54);
        org.junit.Assert.assertNotNull(bigDecimal55);
        org.junit.Assert.assertNotNull(bigDecimal56);
        org.junit.Assert.assertNotNull(bigDecimal57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(bigDecimal59);
        org.junit.Assert.assertNotNull(bigDecimal60);
        org.junit.Assert.assertNotNull(bigDecimal61);
        org.junit.Assert.assertNotNull(bigDecimal62);
        org.junit.Assert.assertNotNull(bigDecimal63);
        org.junit.Assert.assertNotNull(bigDecimal64);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "0" + "'", str65, "0");
        org.junit.Assert.assertNotNull(bigDecimal66);
        org.junit.Assert.assertNotNull(bigDecimal68);
    }

    @Test
    public void test06837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06837");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test06838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06838");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("\u82f1\u8a9e", "zh-cnzh-cn", 16);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u82f1\u8a9e" + "'", str3, "\u82f1\u8a9e");
    }

    @Test
    public void test06839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06839");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("# (HI!)", (-2), "\u65e5\u672c\u8a9e");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "# (HI!)" + "'", str3, "# (HI!)");
    }

    @Test
    public void test06840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06840");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("eng", "GBR");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("10");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.concatWith("\ud504\ub791\uc2a4\uc5b4", (java.lang.Object[]) strArray7);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI", strArray4, strArray7);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.concatWith("\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9", (java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10" + "'", str8, "10");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI" + "'", str9, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "eng" + "'", str10, "eng");
    }

    @Test
    public void test06841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06841");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("0.0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000100", (int) (short) -5, "00");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0.0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000100" + "'", str3, "0.0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000100");
    }

    @Test
    public void test06842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06842");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "United StatesUnited StatesUnited StatesUnited StatesUnited StatesUnited StatesUnited StatesUnited St", "UNITED STATES");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06843");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "                                                         dnu                                                         ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                         dnu                                                         " + "'", str1, "                                                         dnu                                                         ");
    }

    @Test
    public void test06844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06844");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("\ud504\ub791\uc2a4\uc5b4", '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '#', (int) (short) 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test06845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06845");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IHXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "\u97e9\u56fd");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IHXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX" + "'", str2, "IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IHXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
    }

    @Test
    public void test06846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06846");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("...du Sud", "\u4e2d\u56fd\u8a9e");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06847");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal5 = bigDecimal1.subtract(bigDecimal4);
        java.math.BigDecimal bigDecimal6 = java.math.BigDecimal.TEN;
        java.math.BigDecimal bigDecimal7 = bigDecimal4.min(bigDecimal6);
        java.math.BigDecimal bigDecimal9 = bigDecimal7.movePointRight((int) (short) -2);
        java.math.BigDecimal bigDecimal11 = new java.math.BigDecimal((double) 100.0f);
        java.math.BigDecimal bigDecimal12 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal13 = bigDecimal12.negate();
        java.math.BigDecimal bigDecimal14 = java.math.BigDecimal.TEN;
        long long15 = bigDecimal14.longValueExact();
        java.math.BigDecimal bigDecimal16 = bigDecimal14.ulp();
        java.lang.String str17 = bigDecimal14.toString();
        int int18 = bigDecimal12.compareTo(bigDecimal14);
        java.math.BigDecimal bigDecimal20 = java.math.BigDecimal.valueOf((long) (byte) 100);
        java.math.BigDecimal bigDecimal22 = bigDecimal14.divide(bigDecimal20, (int) (short) 1);
        java.math.BigDecimal bigDecimal23 = java.math.BigDecimal.TEN;
        long long24 = bigDecimal23.longValueExact();
        java.math.BigDecimal bigDecimal25 = bigDecimal22.max(bigDecimal23);
        java.math.BigDecimal bigDecimal26 = java.math.BigDecimal.TEN;
        long long27 = bigDecimal26.longValueExact();
        java.math.BigDecimal bigDecimal28 = bigDecimal26.ulp();
        java.math.BigDecimal bigDecimal29 = bigDecimal23.subtract(bigDecimal26);
        double double30 = bigDecimal26.doubleValue();
        java.math.BigDecimal bigDecimal31 = bigDecimal11.divideToIntegralValue(bigDecimal26);
        java.math.BigDecimal bigDecimal32 = java.math.BigDecimal.ZERO;
        double double33 = bigDecimal32.doubleValue();
        java.math.BigInteger bigInteger34 = bigDecimal32.toBigInteger();
        java.lang.String str35 = bigDecimal32.toPlainString();
        java.math.BigDecimal bigDecimal36 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal37 = bigDecimal36.negate();
        java.math.BigDecimal bigDecimal38 = bigDecimal36.negate();
        int int39 = bigDecimal38.intValueExact();
        java.math.BigDecimal bigDecimal40 = bigDecimal32.max(bigDecimal38);
        int int41 = bigDecimal40.precision();
        java.math.BigDecimal bigDecimal42 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal43 = bigDecimal42.negate();
        java.math.BigDecimal bigDecimal44 = bigDecimal42.negate();
        java.lang.String str45 = bigDecimal42.toString();
        java.math.BigDecimal bigDecimal47 = bigDecimal42.scaleByPowerOfTen(0);
        java.math.BigDecimal bigDecimal48 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal49 = bigDecimal48.negate();
        java.math.BigDecimal bigDecimal50 = java.math.BigDecimal.TEN;
        long long51 = bigDecimal50.longValueExact();
        java.math.BigDecimal bigDecimal52 = bigDecimal50.ulp();
        java.lang.String str53 = bigDecimal50.toString();
        int int54 = bigDecimal48.compareTo(bigDecimal50);
        java.math.BigDecimal bigDecimal56 = java.math.BigDecimal.valueOf((long) (byte) 100);
        java.math.BigDecimal bigDecimal58 = bigDecimal50.divide(bigDecimal56, (int) (short) 1);
        java.math.BigDecimal bigDecimal59 = java.math.BigDecimal.TEN;
        long long60 = bigDecimal59.longValueExact();
        java.math.BigDecimal bigDecimal61 = bigDecimal58.max(bigDecimal59);
        java.math.BigDecimal bigDecimal62 = bigDecimal42.add(bigDecimal58);
        int int63 = bigDecimal40.compareTo(bigDecimal58);
        java.math.BigDecimal bigDecimal64 = bigDecimal26.subtract(bigDecimal40);
        java.math.BigDecimal bigDecimal66 = bigDecimal26.movePointRight((int) '#');
        java.math.BigDecimal bigDecimal67 = bigDecimal7.add(bigDecimal26);
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigDecimal6);
        org.junit.Assert.assertNotNull(bigDecimal7);
        org.junit.Assert.assertNotNull(bigDecimal9);
        org.junit.Assert.assertNotNull(bigDecimal12);
        org.junit.Assert.assertNotNull(bigDecimal13);
        org.junit.Assert.assertNotNull(bigDecimal14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "10" + "'", str17, "10");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(bigDecimal20);
        org.junit.Assert.assertNotNull(bigDecimal22);
        org.junit.Assert.assertNotNull(bigDecimal23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 10L + "'", long24 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal25);
        org.junit.Assert.assertNotNull(bigDecimal26);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 10L + "'", long27 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal28);
        org.junit.Assert.assertNotNull(bigDecimal29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 10.0d + "'", double30 == 10.0d);
        org.junit.Assert.assertNotNull(bigDecimal31);
        org.junit.Assert.assertNotNull(bigDecimal32);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertNotNull(bigInteger34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "0" + "'", str35, "0");
        org.junit.Assert.assertNotNull(bigDecimal36);
        org.junit.Assert.assertNotNull(bigDecimal37);
        org.junit.Assert.assertNotNull(bigDecimal38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(bigDecimal40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertNotNull(bigDecimal42);
        org.junit.Assert.assertNotNull(bigDecimal43);
        org.junit.Assert.assertNotNull(bigDecimal44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "0" + "'", str45, "0");
        org.junit.Assert.assertNotNull(bigDecimal47);
        org.junit.Assert.assertNotNull(bigDecimal48);
        org.junit.Assert.assertNotNull(bigDecimal49);
        org.junit.Assert.assertNotNull(bigDecimal50);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 10L + "'", long51 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "10" + "'", str53, "10");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertNotNull(bigDecimal56);
        org.junit.Assert.assertNotNull(bigDecimal58);
        org.junit.Assert.assertNotNull(bigDecimal59);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 10L + "'", long60 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal61);
        org.junit.Assert.assertNotNull(bigDecimal62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertNotNull(bigDecimal64);
        org.junit.Assert.assertNotNull(bigDecimal66);
        org.junit.Assert.assertNotNull(bigDecimal67);
    }

    @Test
    public void test06848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06848");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", "chinese", 563);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06849");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("ENGLISH", 34);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "             ENGLISH              " + "'", str2, "             ENGLISH              ");
    }

    @Test
    public void test06850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06850");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setLanguageTag("eng");
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale.Builder builder5 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder7 = builder5.setLanguageTag("eng");
        java.util.Locale.Builder builder8 = builder7.clearExtensions();
        java.util.Locale locale9 = java.util.Locale.FRANCE;
        java.util.Locale.Builder builder10 = builder8.setLocale(locale9);
        java.util.Locale.Builder builder12 = builder10.addUnicodeLocaleAttribute("engcn");
        java.util.Locale.Builder builder14 = builder10.setScript("");
        java.util.Locale locale16 = java.util.Locale.forLanguageTag("-1UND0");
        java.util.Locale.Builder builder17 = builder10.setLocale(locale16);
        java.util.Locale.Builder builder18 = builder4.setLocale(locale16);
        java.util.Locale.Builder builder19 = builder18.clear();
        java.util.Locale locale20 = java.util.Locale.UK;
        java.lang.String str21 = locale20.getDisplayName();
        java.lang.String str22 = locale20.getLanguage();
        java.util.Locale.Builder builder23 = builder18.setLocale(locale20);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder25 = builder18.setLanguageTag("                              ");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag:                                [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "");
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "en_GB");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\u82f1\u6587\u82f1\u56fd)" + "'", str21, "\u82f1\u6587\u82f1\u56fd)");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "en" + "'", str22, "en");
        org.junit.Assert.assertNotNull(builder23);
    }

    @Test
    public void test06851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06851");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("\uc601\uc5b4\uc601\uad6d)");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test06852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06852");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("fr_FR", "\u30d5\u30e9\u30f3\u30b9\u8a9e\u30d5\u30e9\u30f3\u30b9)", (int) (short) -33);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test06853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06853");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("fr-FRDeutschland", "kor");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06854");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.min(byteArray1);
        java.math.BigInteger bigInteger3 = new java.math.BigInteger(byteArray1);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        java.math.BigInteger bigInteger6 = new java.math.BigInteger(byteArray1);
        java.math.BigDecimal bigDecimal8 = new java.math.BigDecimal(bigInteger6, (int) (byte) 1);
        java.math.BigDecimal bigDecimal9 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal11 = bigDecimal9.movePointLeft((int) (byte) 0);
        java.math.BigDecimal bigDecimal12 = bigDecimal9.abs();
        java.math.BigDecimal bigDecimal13 = bigDecimal12.abs();
        java.math.BigDecimal bigDecimal14 = bigDecimal8.subtract(bigDecimal12);
        long long15 = bigDecimal14.longValue();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[1]");
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 1 + "'", byte4 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 1 + "'", byte5 == (byte) 1);
        org.junit.Assert.assertNotNull(bigDecimal9);
        org.junit.Assert.assertNotNull(bigDecimal11);
        org.junit.Assert.assertNotNull(bigDecimal12);
        org.junit.Assert.assertNotNull(bigDecimal13);
        org.junit.Assert.assertNotNull(bigDecimal14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test06855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06855");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("   chinois", "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "   chinois" + "'", str2, "   chinois");
    }

    @Test
    public void test06856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06856");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal5 = bigDecimal1.subtract(bigDecimal4);
        java.math.BigInteger bigInteger6 = bigDecimal5.toBigInteger();
        byte[] byteArray7 = bigInteger6.toByteArray();
        java.math.BigDecimal bigDecimal8 = new java.math.BigDecimal(bigInteger6);
        byte[] byteArray11 = new byte[] { (byte) 1 };
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.min(byteArray11);
        java.math.BigInteger bigInteger13 = new java.math.BigInteger((int) (short) -1, byteArray11);
        java.math.BigInteger bigInteger15 = bigInteger13.pow((int) 'a');
        java.math.BigInteger bigInteger17 = bigInteger13.shiftLeft((int) (short) 1);
        int int18 = bigInteger17.intValueExact();
        java.math.BigInteger bigInteger19 = bigInteger17.abs();
        java.math.BigInteger bigInteger20 = bigInteger6.min(bigInteger17);
        java.lang.String str21 = bigInteger17.toString();
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[1]");
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 1 + "'", byte12 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger15);
        org.junit.Assert.assertNotNull(bigInteger17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2) + "'", int18 == (-2));
        org.junit.Assert.assertNotNull(bigInteger19);
        org.junit.Assert.assertNotNull(bigInteger20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-2" + "'", str21, "-2");
    }

    @Test
    public void test06857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06857");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", (-10.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-10.0f) + "'", float2 == (-10.0f));
    }

    @Test
    public void test06858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06858");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("\u6cd5\u6587TWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTW", "Korean", 1073741825, (int) (short) -2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Korean" + "'", str4, "Korean");
    }

    @Test
    public void test06859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06859");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("fR");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test06860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06860");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        double double1 = bigDecimal0.doubleValue();
        java.math.BigDecimal bigDecimal3 = bigDecimal0.movePointLeft((int) (byte) -1);
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal5 = bigDecimal4.negate();
        java.math.BigDecimal bigDecimal6 = bigDecimal4.negate();
        java.lang.String str7 = bigDecimal4.toString();
        java.math.BigDecimal bigDecimal9 = bigDecimal4.scaleByPowerOfTen(0);
        java.math.BigDecimal bigDecimal10 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal11 = bigDecimal10.negate();
        java.math.BigDecimal bigDecimal12 = java.math.BigDecimal.TEN;
        long long13 = bigDecimal12.longValueExact();
        java.math.BigDecimal bigDecimal14 = bigDecimal12.ulp();
        java.lang.String str15 = bigDecimal12.toString();
        int int16 = bigDecimal10.compareTo(bigDecimal12);
        java.math.BigDecimal bigDecimal18 = java.math.BigDecimal.valueOf((long) (byte) 100);
        java.math.BigDecimal bigDecimal20 = bigDecimal12.divide(bigDecimal18, (int) (short) 1);
        java.math.BigDecimal bigDecimal21 = java.math.BigDecimal.TEN;
        long long22 = bigDecimal21.longValueExact();
        java.math.BigDecimal bigDecimal23 = bigDecimal20.max(bigDecimal21);
        java.math.BigDecimal bigDecimal24 = bigDecimal4.add(bigDecimal20);
        java.math.BigDecimal bigDecimal25 = bigDecimal0.multiply(bigDecimal4);
        java.math.BigDecimal bigDecimal26 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal27 = bigDecimal26.negate();
        java.math.BigDecimal bigDecimal30 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal31 = bigDecimal27.subtract(bigDecimal30);
        java.lang.String str32 = bigDecimal27.toPlainString();
        java.math.BigDecimal bigDecimal33 = java.math.BigDecimal.ZERO;
        double double34 = bigDecimal33.doubleValue();
        java.math.BigDecimal bigDecimal36 = bigDecimal33.movePointLeft((int) (byte) -1);
        java.math.BigInteger bigInteger37 = bigDecimal33.unscaledValue();
        long long38 = bigDecimal33.longValue();
        java.math.BigDecimal bigDecimal39 = bigDecimal27.subtract(bigDecimal33);
        java.math.BigDecimal bigDecimal40 = bigDecimal33.ulp();
        java.math.BigDecimal bigDecimal41 = bigDecimal25.multiply(bigDecimal33);
        java.math.BigDecimal bigDecimal42 = java.math.BigDecimal.TEN;
        long long43 = bigDecimal42.longValueExact();
        java.math.BigDecimal bigDecimal44 = bigDecimal42.ulp();
        int int45 = bigDecimal44.precision();
        java.math.BigDecimal bigDecimal46 = bigDecimal41.remainder(bigDecimal44);
        java.math.BigDecimal bigDecimal47 = java.math.BigDecimal.ZERO;
        double double48 = bigDecimal47.doubleValue();
        java.math.BigInteger bigInteger49 = bigDecimal47.toBigInteger();
        java.math.BigDecimal bigDecimal50 = bigDecimal47.negate();
        java.math.BigInteger bigInteger51 = bigDecimal47.toBigIntegerExact();
        java.math.BigDecimal bigDecimal54 = java.math.BigDecimal.valueOf((long) 301, (int) '4');
        java.math.BigDecimal bigDecimal56 = java.math.BigDecimal.valueOf((long) (byte) 0);
        byte byte57 = bigDecimal56.byteValueExact();
        java.math.BigDecimal bigDecimal59 = bigDecimal56.pow(2);
        java.math.BigDecimal bigDecimal60 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal61 = bigDecimal60.negate();
        java.math.BigDecimal bigDecimal62 = java.math.BigDecimal.TEN;
        long long63 = bigDecimal62.longValueExact();
        java.math.BigDecimal bigDecimal64 = bigDecimal62.ulp();
        java.lang.String str65 = bigDecimal62.toString();
        int int66 = bigDecimal60.compareTo(bigDecimal62);
        java.math.BigDecimal bigDecimal68 = java.math.BigDecimal.valueOf((long) (byte) 100);
        java.math.BigDecimal bigDecimal70 = bigDecimal62.divide(bigDecimal68, (int) (short) 1);
        java.math.BigDecimal bigDecimal71 = bigDecimal59.add(bigDecimal62);
        java.math.BigDecimal bigDecimal72 = bigDecimal62.negate();
        java.math.BigDecimal[] bigDecimalArray73 = bigDecimal54.divideAndRemainder(bigDecimal62);
        java.math.BigDecimal[] bigDecimalArray74 = bigDecimal47.divideAndRemainder(bigDecimal54);
        java.math.BigDecimal bigDecimal75 = bigDecimal54.negate();
        java.math.RoundingMode roundingMode77 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal78 = bigDecimal41.divide(bigDecimal54, (int) ' ', roundingMode77);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(bigDecimal3);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigDecimal6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0" + "'", str7, "0");
        org.junit.Assert.assertNotNull(bigDecimal9);
        org.junit.Assert.assertNotNull(bigDecimal10);
        org.junit.Assert.assertNotNull(bigDecimal11);
        org.junit.Assert.assertNotNull(bigDecimal12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10" + "'", str15, "10");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(bigDecimal18);
        org.junit.Assert.assertNotNull(bigDecimal20);
        org.junit.Assert.assertNotNull(bigDecimal21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 10L + "'", long22 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal23);
        org.junit.Assert.assertNotNull(bigDecimal24);
        org.junit.Assert.assertNotNull(bigDecimal25);
        org.junit.Assert.assertNotNull(bigDecimal26);
        org.junit.Assert.assertNotNull(bigDecimal27);
        org.junit.Assert.assertNotNull(bigDecimal30);
        org.junit.Assert.assertNotNull(bigDecimal31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "0" + "'", str32, "0");
        org.junit.Assert.assertNotNull(bigDecimal33);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertNotNull(bigDecimal36);
        org.junit.Assert.assertNotNull(bigInteger37);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertNotNull(bigDecimal39);
        org.junit.Assert.assertNotNull(bigDecimal40);
        org.junit.Assert.assertNotNull(bigDecimal41);
        org.junit.Assert.assertNotNull(bigDecimal42);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 10L + "'", long43 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertNotNull(bigDecimal46);
        org.junit.Assert.assertNotNull(bigDecimal47);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
        org.junit.Assert.assertNotNull(bigInteger49);
        org.junit.Assert.assertNotNull(bigDecimal50);
        org.junit.Assert.assertNotNull(bigInteger51);
        org.junit.Assert.assertNotNull(bigDecimal54);
        org.junit.Assert.assertNotNull(bigDecimal56);
        org.junit.Assert.assertTrue("'" + byte57 + "' != '" + (byte) 0 + "'", byte57 == (byte) 0);
        org.junit.Assert.assertNotNull(bigDecimal59);
        org.junit.Assert.assertNotNull(bigDecimal60);
        org.junit.Assert.assertNotNull(bigDecimal61);
        org.junit.Assert.assertNotNull(bigDecimal62);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 10L + "'", long63 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal64);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "10" + "'", str65, "10");
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertNotNull(bigDecimal68);
        org.junit.Assert.assertNotNull(bigDecimal70);
        org.junit.Assert.assertNotNull(bigDecimal71);
        org.junit.Assert.assertNotNull(bigDecimal72);
        org.junit.Assert.assertNotNull(bigDecimalArray73);
        org.junit.Assert.assertNotNull(bigDecimalArray74);
        org.junit.Assert.assertNotNull(bigDecimal75);
    }

    @Test
    public void test06861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06861");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("fr", (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test06862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06862");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("             hi!uuu             ####################################################################", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "             hi!uuu             ####################################################################" + "'", str2, "             hi!uuu             ####################################################################");
    }

    @Test
    public void test06863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06863");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal("zh-cn");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06864");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.TEN;
        long long3 = bigDecimal2.longValueExact();
        java.math.BigDecimal bigDecimal4 = bigDecimal2.ulp();
        java.lang.String str5 = bigDecimal2.toString();
        int int6 = bigDecimal0.compareTo(bigDecimal2);
        java.math.BigDecimal bigDecimal8 = java.math.BigDecimal.valueOf((long) (byte) 100);
        java.math.BigDecimal bigDecimal10 = bigDecimal2.divide(bigDecimal8, (int) (short) 1);
        java.math.BigDecimal bigDecimal11 = java.math.BigDecimal.TEN;
        long long12 = bigDecimal11.longValueExact();
        java.math.BigDecimal bigDecimal13 = bigDecimal10.max(bigDecimal11);
        int int14 = bigDecimal13.scale();
        java.math.BigDecimal bigDecimal15 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal16 = bigDecimal15.negate();
        java.math.BigDecimal bigDecimal17 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal18 = bigDecimal17.negate();
        java.math.BigDecimal bigDecimal19 = bigDecimal17.negate();
        java.lang.String str20 = bigDecimal19.toEngineeringString();
        java.math.BigDecimal bigDecimal21 = bigDecimal16.multiply(bigDecimal19);
        java.math.BigDecimal bigDecimal23 = bigDecimal19.movePointRight(100);
        java.lang.String str24 = bigDecimal19.toEngineeringString();
        java.lang.String str25 = bigDecimal19.toPlainString();
        java.math.BigDecimal bigDecimal26 = bigDecimal19.ulp();
        java.math.BigDecimal bigDecimal27 = java.math.BigDecimal.ONE;
        java.math.BigDecimal bigDecimal28 = bigDecimal27.abs();
        int int29 = bigDecimal28.precision();
        java.math.BigDecimal bigDecimal30 = bigDecimal19.max(bigDecimal28);
        int int31 = bigDecimal28.intValueExact();
        java.math.BigDecimal bigDecimal32 = java.math.BigDecimal.TEN;
        long long33 = bigDecimal32.longValueExact();
        java.math.BigDecimal bigDecimal34 = bigDecimal32.ulp();
        java.lang.String str35 = bigDecimal32.toString();
        java.math.BigDecimal bigDecimal36 = bigDecimal32.stripTrailingZeros();
        int int37 = bigDecimal36.intValue();
        java.math.BigDecimal bigDecimal39 = bigDecimal36.scaleByPowerOfTen(100);
        short short40 = bigDecimal36.shortValueExact();
        java.math.BigDecimal bigDecimal41 = bigDecimal28.remainder(bigDecimal36);
        int int42 = bigDecimal36.scale();
        java.math.RoundingMode roundingMode43 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal44 = bigDecimal13.divide(bigDecimal36, roundingMode43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10" + "'", str5, "10");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(bigDecimal8);
        org.junit.Assert.assertNotNull(bigDecimal10);
        org.junit.Assert.assertNotNull(bigDecimal11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(bigDecimal15);
        org.junit.Assert.assertNotNull(bigDecimal16);
        org.junit.Assert.assertNotNull(bigDecimal17);
        org.junit.Assert.assertNotNull(bigDecimal18);
        org.junit.Assert.assertNotNull(bigDecimal19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "0" + "'", str20, "0");
        org.junit.Assert.assertNotNull(bigDecimal21);
        org.junit.Assert.assertNotNull(bigDecimal23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "0" + "'", str24, "0");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "0" + "'", str25, "0");
        org.junit.Assert.assertNotNull(bigDecimal26);
        org.junit.Assert.assertNotNull(bigDecimal27);
        org.junit.Assert.assertNotNull(bigDecimal28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(bigDecimal30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(bigDecimal32);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 10L + "'", long33 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "10" + "'", str35, "10");
        org.junit.Assert.assertNotNull(bigDecimal36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
        org.junit.Assert.assertNotNull(bigDecimal39);
        org.junit.Assert.assertTrue("'" + short40 + "' != '" + (short) 10 + "'", short40 == (short) 10);
        org.junit.Assert.assertNotNull(bigDecimal41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
    }

    @Test
    public void test06865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06865");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("Hindi", (double) (-10));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-10.0d) + "'", double2 == (-10.0d));
    }

    @Test
    public void test06866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06866");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("South Koreaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"South Koreaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06867");
        java.util.Random random2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger3 = new java.math.BigInteger((int) '4', 52, random2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06868");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "French");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "French" + "'", str1, "French");
    }

    @Test
    public void test06869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06869");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        double double1 = bigDecimal0.doubleValue();
        java.math.BigInteger bigInteger2 = bigDecimal0.toBigInteger();
        byte[] byteArray5 = new byte[] { (byte) 1 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        java.math.BigInteger bigInteger7 = new java.math.BigInteger((int) (short) -1, byteArray5);
        java.math.BigInteger bigInteger9 = bigInteger7.pow((int) 'a');
        byte[] byteArray10 = bigInteger7.toByteArray();
        long long11 = bigInteger7.longValueExact();
        java.math.BigInteger bigInteger12 = bigInteger2.or(bigInteger7);
        byte[] byteArray15 = new byte[] { (byte) 1 };
        byte byte16 = org.apache.commons.lang3.math.NumberUtils.min(byteArray15);
        java.math.BigInteger bigInteger17 = new java.math.BigInteger((int) (short) -1, byteArray15);
        java.math.BigInteger bigInteger19 = bigInteger17.pow((int) 'a');
        byte[] byteArray20 = bigInteger17.toByteArray();
        long long21 = bigInteger17.longValueExact();
        java.lang.String str23 = bigInteger17.toString(0);
        int int24 = bigInteger17.intValueExact();
        java.math.BigInteger bigInteger25 = bigInteger12.subtract(bigInteger17);
        java.math.BigInteger bigInteger27 = bigInteger25.clearBit((int) 'a');
        java.math.BigInteger bigInteger28 = bigInteger25.nextProbablePrime();
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(bigInteger2);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1]");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 1 + "'", byte6 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger9);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[-1]");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(bigInteger12);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[1]");
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) 1 + "'", byte16 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger19);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[-1]");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-1" + "'", str23, "-1");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(bigInteger25);
        org.junit.Assert.assertNotNull(bigInteger27);
        org.junit.Assert.assertNotNull(bigInteger28);
    }

    @Test
    public void test06870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06870");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((-1), (int) (short) 0, 5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06871");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9                                             ", "\ub3c5\uc77c\uc5b4\ub3c5\uc77c) ", (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06872");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setLanguageTag("eng");
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale locale4 = java.util.Locale.FRANCE;
        java.util.Locale.Builder builder5 = builder3.setLocale(locale4);
        java.util.Locale.Builder builder6 = builder3.clear();
        java.util.Locale.Builder builder7 = builder3.clearExtensions();
        java.util.Locale locale8 = java.util.Locale.GERMANY;
        java.util.Locale locale9 = java.util.Locale.PRC;
        java.lang.String str10 = locale8.getDisplayScript(locale9);
        java.util.Locale locale11 = java.util.Locale.JAPANESE;
        java.lang.String str12 = locale11.getISO3Language();
        java.lang.String str13 = locale8.getDisplayScript(locale11);
        java.lang.String str14 = locale8.getLanguage();
        java.util.Locale.Builder builder15 = builder7.setLocale(locale8);
        boolean boolean16 = locale8.hasExtensions();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "jpn" + "'", str12, "jpn");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "de" + "'", str14, "de");
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test06873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06873");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("English (United Kingdom)", 9, "IT...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "English (United Kingdom)" + "'", str3, "English (United Kingdom)");
    }

    @Test
    public void test06874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06874");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal5 = bigDecimal1.subtract(bigDecimal4);
        java.math.BigInteger bigInteger6 = bigDecimal5.toBigInteger();
        double double7 = bigInteger6.doubleValue();
        byte[] byteArray10 = new byte[] { (byte) 1 };
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.min(byteArray10);
        java.math.BigInteger bigInteger12 = new java.math.BigInteger((int) (short) -1, byteArray10);
        java.math.BigInteger bigInteger13 = bigInteger6.gcd(bigInteger12);
        java.math.BigDecimal bigDecimal14 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal15 = bigDecimal14.negate();
        java.math.BigDecimal bigDecimal18 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal19 = bigDecimal15.subtract(bigDecimal18);
        java.math.BigInteger bigInteger20 = bigDecimal19.toBigInteger();
        java.math.BigInteger bigInteger21 = bigInteger12.or(bigInteger20);
        short short22 = bigInteger12.shortValueExact();
        byte[] byteArray25 = new byte[] { (byte) 1 };
        byte byte26 = org.apache.commons.lang3.math.NumberUtils.min(byteArray25);
        java.math.BigInteger bigInteger27 = new java.math.BigInteger((int) (short) -1, byteArray25);
        java.math.BigInteger bigInteger29 = bigInteger27.pow((int) 'a');
        java.math.BigInteger bigInteger31 = bigInteger27.shiftLeft((int) (short) 1);
        java.math.BigInteger bigInteger32 = bigInteger12.xor(bigInteger31);
        java.math.BigInteger bigInteger33 = bigInteger31.not();
        java.math.BigDecimal bigDecimal34 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal35 = bigDecimal34.negate();
        java.math.BigDecimal bigDecimal38 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal39 = bigDecimal35.subtract(bigDecimal38);
        java.math.BigInteger bigInteger40 = bigDecimal39.toBigInteger();
        java.math.BigInteger bigInteger41 = bigInteger40.negate();
        boolean boolean43 = bigInteger40.isProbablePrime(1073741825);
        java.math.BigInteger bigInteger44 = bigInteger31.subtract(bigInteger40);
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[1]");
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 1 + "'", byte11 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger13);
        org.junit.Assert.assertNotNull(bigDecimal14);
        org.junit.Assert.assertNotNull(bigDecimal15);
        org.junit.Assert.assertNotNull(bigDecimal18);
        org.junit.Assert.assertNotNull(bigDecimal19);
        org.junit.Assert.assertNotNull(bigInteger20);
        org.junit.Assert.assertNotNull(bigInteger21);
        org.junit.Assert.assertTrue("'" + short22 + "' != '" + (short) -1 + "'", short22 == (short) -1);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[1]");
        org.junit.Assert.assertTrue("'" + byte26 + "' != '" + (byte) 1 + "'", byte26 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger29);
        org.junit.Assert.assertNotNull(bigInteger31);
        org.junit.Assert.assertNotNull(bigInteger32);
        org.junit.Assert.assertNotNull(bigInteger33);
        org.junit.Assert.assertNotNull(bigDecimal34);
        org.junit.Assert.assertNotNull(bigDecimal35);
        org.junit.Assert.assertNotNull(bigDecimal38);
        org.junit.Assert.assertNotNull(bigDecimal39);
        org.junit.Assert.assertNotNull(bigInteger40);
        org.junit.Assert.assertNotNull(bigInteger41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(bigInteger44);
    }

    @Test
    public void test06875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06875");
        java.math.BigDecimal bigDecimal1 = java.math.BigDecimal.valueOf((long) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal4 = bigDecimal1.setScale(0, (int) (short) 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding mode");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal1);
    }

    @Test
    public void test06876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06876");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06877");
        java.math.BigDecimal bigDecimal1 = java.math.BigDecimal.valueOf(117L);
        java.math.MathContext mathContext2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal3 = bigDecimal1.negate(mathContext2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal1);
    }

    @Test
    public void test06878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06878");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9)unitedxstates", (int) (byte) -2, (int) (short) 16);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06879");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("-1)", "uauauauayuiyuaxuawuawuavuivuevuauuauukuuguuytuwtuttustuatuatuntultuktuituatugtuetuatuwsuvsuusutsussuasuqsuasunsumsulsuksuisugsuesudsucsuasuwauuauaunaumauuqutpuspulpuipuapusauaumaujaucauynuvnuanuanunnulnugnuenudnubnuanuymutmusmuamuamunmulmukmuimuamugmuvluulutlualunluiluglublualuykuwkuvkuukuskuakuakunkumkulkukkujkuikugkuakuvjuijuajuwiuuiutiusiuaiuniukiuiiugiueiudiuaiuauyauuautauauauiaueauauvguugungulgudguaguyauauaujauiauauauueuteuseuaeuneuleueeuaduvdueduaduycuvcuucuscuacuacuacuecuacusbuabuabunbumbuibuabugbuebuabuauyauvausauaunaumaukauaueaubau");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06880");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "China");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06881");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587" + "'", str1, "\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587");
    }

    @Test
    public void test06882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06882");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal5 = bigDecimal1.subtract(bigDecimal4);
        java.math.BigInteger bigInteger6 = bigDecimal5.toBigInteger();
        double double7 = bigInteger6.doubleValue();
        byte[] byteArray10 = new byte[] { (byte) 1 };
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.min(byteArray10);
        java.math.BigInteger bigInteger12 = new java.math.BigInteger((int) (short) -1, byteArray10);
        java.math.BigInteger bigInteger13 = bigInteger6.gcd(bigInteger12);
        java.math.BigInteger bigInteger14 = bigInteger12.negate();
        java.math.BigDecimal bigDecimal15 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal16 = bigDecimal15.negate();
        java.math.BigDecimal bigDecimal19 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal20 = bigDecimal16.subtract(bigDecimal19);
        java.math.BigInteger bigInteger21 = bigDecimal20.toBigInteger();
        double double22 = bigInteger21.doubleValue();
        byte[] byteArray25 = new byte[] { (byte) 1 };
        byte byte26 = org.apache.commons.lang3.math.NumberUtils.min(byteArray25);
        java.math.BigInteger bigInteger27 = new java.math.BigInteger((int) (short) -1, byteArray25);
        java.math.BigInteger bigInteger28 = bigInteger21.gcd(bigInteger27);
        java.math.BigDecimal bigDecimal29 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal30 = bigDecimal29.negate();
        java.math.BigDecimal bigDecimal33 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal34 = bigDecimal30.subtract(bigDecimal33);
        java.math.BigInteger bigInteger35 = bigDecimal34.toBigInteger();
        java.math.BigInteger bigInteger36 = bigInteger27.or(bigInteger35);
        short short37 = bigInteger27.shortValueExact();
        byte byte38 = bigInteger27.byteValueExact();
        java.math.BigInteger bigInteger39 = bigInteger12.and(bigInteger27);
        java.util.Locale locale40 = java.util.Locale.UK;
        boolean boolean41 = bigInteger39.equals((java.lang.Object) locale40);
        java.lang.String str42 = locale40.getVariant();
        java.lang.String str44 = locale40.getExtension('a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str46 = locale40.getUnicodeLocaleType("englisch");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: englisch");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[1]");
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 1 + "'", byte11 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger13);
        org.junit.Assert.assertNotNull(bigInteger14);
        org.junit.Assert.assertNotNull(bigDecimal15);
        org.junit.Assert.assertNotNull(bigDecimal16);
        org.junit.Assert.assertNotNull(bigDecimal19);
        org.junit.Assert.assertNotNull(bigDecimal20);
        org.junit.Assert.assertNotNull(bigInteger21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[1]");
        org.junit.Assert.assertTrue("'" + byte26 + "' != '" + (byte) 1 + "'", byte26 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger28);
        org.junit.Assert.assertNotNull(bigDecimal29);
        org.junit.Assert.assertNotNull(bigDecimal30);
        org.junit.Assert.assertNotNull(bigDecimal33);
        org.junit.Assert.assertNotNull(bigDecimal34);
        org.junit.Assert.assertNotNull(bigInteger35);
        org.junit.Assert.assertNotNull(bigInteger36);
        org.junit.Assert.assertTrue("'" + short37 + "' != '" + (short) -1 + "'", short37 == (short) -1);
        org.junit.Assert.assertTrue("'" + byte38 + "' != '" + (byte) -1 + "'", byte38 == (byte) -1);
        org.junit.Assert.assertNotNull(bigInteger39);
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "en_GB");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNull(str44);
    }

    @Test
    public void test06883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06883");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setLanguageTag("eng");
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale.Builder builder4 = builder2.clear();
        java.util.Locale.Builder builder5 = builder2.clearExtensions();
        java.util.Locale.Builder builder6 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder7 = builder6.clearExtensions();
        java.util.Locale locale8 = builder7.build();
        java.util.Locale.Builder builder9 = builder2.setLocale(locale8);
        java.util.Locale.Builder builder11 = builder9.setLanguage("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder14 = builder11.setUnicodeLocaleKeyword("en-c", "\uc5b4\uad6d\ud55c");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: en-c [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test06884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06884");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "chinois");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06885");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("Deutschland", "zh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-Chi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Deutschland" + "'", str2, "Deutschland");
    }

    @Test
    public void test06886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06886");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("kr", "zh-cn", (int) 'x', 120);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "krzh-cn" + "'", str4, "krzh-cn");
    }

    @Test
    public void test06887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06887");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("\ub3c5\uc77c\uc5b4\ub3c5\uc77c)HI", (-1), 'x');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ub3c5\uc77c\uc5b4\ub3c5\uc77c)HI" + "'", str3, "\ub3c5\uc77c\uc5b4\ub3c5\uc77c)HI");
    }

    @Test
    public void test06888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06888");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("1", "Enhinh");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06889");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.min(byteArray1);
        java.math.BigInteger bigInteger3 = new java.math.BigInteger(byteArray1);
        int int4 = bigInteger3.signum();
        short short5 = bigInteger3.shortValueExact();
        java.math.BigInteger bigInteger7 = bigInteger3.flipBit((int) '4');
        java.math.BigDecimal bigDecimal8 = java.math.BigDecimal.ZERO;
        double double9 = bigDecimal8.doubleValue();
        java.math.BigInteger bigInteger10 = bigDecimal8.toBigInteger();
        java.math.BigInteger bigInteger12 = bigInteger10.setBit(4);
        java.math.BigDecimal bigDecimal13 = java.math.BigDecimal.ZERO;
        double double14 = bigDecimal13.doubleValue();
        java.math.BigInteger bigInteger15 = bigDecimal13.toBigInteger();
        byte[] byteArray18 = new byte[] { (byte) 1 };
        byte byte19 = org.apache.commons.lang3.math.NumberUtils.min(byteArray18);
        java.math.BigInteger bigInteger20 = new java.math.BigInteger((int) (short) -1, byteArray18);
        java.math.BigInteger bigInteger22 = bigInteger20.pow((int) 'a');
        byte[] byteArray23 = bigInteger20.toByteArray();
        long long24 = bigInteger20.longValueExact();
        java.math.BigInteger bigInteger25 = bigInteger15.or(bigInteger20);
        java.math.BigInteger bigInteger26 = bigInteger10.multiply(bigInteger25);
        java.math.BigInteger bigInteger27 = bigInteger3.remainder(bigInteger25);
        byte[] byteArray28 = bigInteger3.toByteArray();
        byte byte29 = org.apache.commons.lang3.math.NumberUtils.min(byteArray28);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[1]");
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2 == (byte) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 1 + "'", short5 == (short) 1);
        org.junit.Assert.assertNotNull(bigInteger7);
        org.junit.Assert.assertNotNull(bigDecimal8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(bigInteger10);
        org.junit.Assert.assertNotNull(bigInteger12);
        org.junit.Assert.assertNotNull(bigDecimal13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(bigInteger15);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[1]");
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) 1 + "'", byte19 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger22);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[-1]");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-1L) + "'", long24 == (-1L));
        org.junit.Assert.assertNotNull(bigInteger25);
        org.junit.Assert.assertNotNull(bigInteger26);
        org.junit.Assert.assertNotNull(bigInteger27);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[1]");
        org.junit.Assert.assertTrue("'" + byte29 + "' != '" + (byte) 1 + "'", byte29 == (byte) 1);
    }

    @Test
    public void test06890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06890");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.TEN;
        long long1 = bigDecimal0.longValueExact();
        java.math.BigDecimal bigDecimal2 = bigDecimal0.ulp();
        java.lang.String str3 = bigDecimal0.toString();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.TEN;
        long long5 = bigDecimal4.longValueExact();
        java.math.BigDecimal bigDecimal6 = java.math.BigDecimal.ZERO;
        double double7 = bigDecimal6.doubleValue();
        java.math.BigDecimal bigDecimal9 = bigDecimal6.movePointLeft((int) (byte) -1);
        int int10 = bigDecimal9.intValue();
        java.math.BigDecimal bigDecimal11 = bigDecimal4.add(bigDecimal9);
        java.math.BigDecimal bigDecimal12 = bigDecimal0.add(bigDecimal11);
        java.math.BigDecimal bigDecimal13 = java.math.BigDecimal.ZERO;
        double double14 = bigDecimal13.doubleValue();
        java.math.BigInteger bigInteger15 = bigDecimal13.toBigInteger();
        java.lang.String str16 = bigDecimal13.toPlainString();
        java.math.BigDecimal bigDecimal17 = bigDecimal0.add(bigDecimal13);
        java.lang.String str18 = bigDecimal13.toPlainString();
        java.math.BigDecimal bigDecimal20 = bigDecimal13.setScale(563);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal23 = bigDecimal20.setScale(100, (-1025));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding mode");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 10L + "'", long1 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10" + "'", str3, "10");
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(bigDecimal9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(bigDecimal11);
        org.junit.Assert.assertNotNull(bigDecimal12);
        org.junit.Assert.assertNotNull(bigDecimal13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(bigInteger15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "0" + "'", str16, "0");
        org.junit.Assert.assertNotNull(bigDecimal17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "0" + "'", str18, "0");
        org.junit.Assert.assertNotNull(bigDecimal20);
    }

    @Test
    public void test06891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06891");
        java.math.BigDecimal bigDecimal1 = java.math.BigDecimal.valueOf((double) 6);
        java.math.BigInteger bigInteger2 = bigDecimal1.unscaledValue();
        java.math.BigDecimal bigDecimal3 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal4 = bigDecimal3.negate();
        java.math.BigDecimal bigDecimal5 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal6 = bigDecimal5.negate();
        java.math.BigDecimal bigDecimal7 = bigDecimal5.negate();
        java.lang.String str8 = bigDecimal7.toEngineeringString();
        java.math.BigDecimal bigDecimal9 = bigDecimal4.multiply(bigDecimal7);
        java.math.BigDecimal bigDecimal11 = bigDecimal7.movePointRight(100);
        java.lang.String str12 = bigDecimal7.toEngineeringString();
        java.lang.String str13 = bigDecimal7.toPlainString();
        java.math.BigDecimal bigDecimal14 = bigDecimal7.ulp();
        java.math.BigDecimal bigDecimal15 = java.math.BigDecimal.ONE;
        java.math.BigDecimal bigDecimal16 = bigDecimal15.abs();
        int int17 = bigDecimal16.precision();
        java.math.BigDecimal bigDecimal18 = bigDecimal7.max(bigDecimal16);
        java.math.MathContext mathContext19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal20 = bigDecimal1.divideToIntegralValue(bigDecimal18, mathContext19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigInteger2);
        org.junit.Assert.assertNotNull(bigDecimal3);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigDecimal6);
        org.junit.Assert.assertNotNull(bigDecimal7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0" + "'", str8, "0");
        org.junit.Assert.assertNotNull(bigDecimal9);
        org.junit.Assert.assertNotNull(bigDecimal11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0" + "'", str12, "0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0" + "'", str13, "0");
        org.junit.Assert.assertNotNull(bigDecimal14);
        org.junit.Assert.assertNotNull(bigDecimal15);
        org.junit.Assert.assertNotNull(bigDecimal16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(bigDecimal18);
    }

    @Test
    public void test06892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06892");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("4444444444444444444444444444444444444444444444en_US4444444444444444444444444444444444444444444444", "United StatesUnited StatesUnited StatesUnited StatesUnited StatesUnited StatesUnited StatesUnited St");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06893");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("en-CA", "it_IT!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test06894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06894");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setLanguageTag("eng");
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale locale4 = java.util.Locale.FRANCE;
        java.util.Locale.Builder builder5 = builder3.setLocale(locale4);
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder5.setRegion("FRENCH");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: FRENCH [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test06895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06895");
        java.util.Locale locale2 = new java.util.Locale("   0   ", "AD AE AF AG AI AL AM AN AO AQ AR AS AT AU AW AX AZ BA BB BD BE BF BG BH BI BJ BL BM BN BO BQ BR BS BT BV BW BY BZ CA CC CD CF CG CH CI CK CL CM CN CO CR CU CV CW CX CY CZ DE DJ DK DM DO DZ EC EE EG EH ER ES ET FI FJ FK FM FO FR GA GB GD GE GF GG GH GI GL GM GN GP GQ GR GS GT GU GW GY HK HM HN HR HT HU ID IE IL IM IN IO IQ IR IS IT JE JM JO JP KE KG KH KI KM KN KP KR KW KY KZ LA LB LC LI LK LR LS LT LU LV LY MA MC MD ME MF MG MH MK ML MM MN MO MP MQ MR MS MT MU MV MW MX MY MZ NA NC NE NF NG NI NL NO NP NR NU NZ OM PA PE PF PG PH PK PL PM PN PR PS PT PW PY QA RE RO RS RU RW SA SB SC SD SE SG SH SI SJ SK SL SM SN SO SR SS ST SV SX SY SZ TC TD TF TG TH TJ TK TL TM TN TO TR TT TV TW TZ UA UG UM US UY UZ VA VC VE VG VI VN VU WF WS YE YT ZA ZM ZW");
        org.junit.Assert.assertEquals(locale2.toString(), "   0   _AD AE AF AG AI AL AM AN AO AQ AR AS AT AU AW AX AZ BA BB BD BE BF BG BH BI BJ BL BM BN BO BQ BR BS BT BV BW BY BZ CA CC CD CF CG CH CI CK CL CM CN CO CR CU CV CW CX CY CZ DE DJ DK DM DO DZ EC EE EG EH ER ES ET FI FJ FK FM FO FR GA GB GD GE GF GG GH GI GL GM GN GP GQ GR GS GT GU GW GY HK HM HN HR HT HU ID IE IL IM IN IO IQ IR IS IT JE JM JO JP KE KG KH KI KM KN KP KR KW KY KZ LA LB LC LI LK LR LS LT LU LV LY MA MC MD ME MF MG MH MK ML MM MN MO MP MQ MR MS MT MU MV MW MX MY MZ NA NC NE NF NG NI NL NO NP NR NU NZ OM PA PE PF PG PH PK PL PM PN PR PS PT PW PY QA RE RO RS RU RW SA SB SC SD SE SG SH SI SJ SK SL SM SN SO SR SS ST SV SX SY SZ TC TD TF TG TH TJ TK TL TM TN TO TR TT TV TW TZ UA UG UM US UY UZ VA VC VE VG VI VN VU WF WS YE YT ZA ZM ZW");
    }

    @Test
    public void test06896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06896");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) (byte) -33, (int) ' ', (int) (byte) -33);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-33) + "'", int3 == (-33));
    }

    @Test
    public void test06897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06897");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("AJ", "\u4e2d\u6587\u1103\u1169\u11a8\u110b\u1175\u11af\u110b\u1165\u1103\u1169\u11a8\u110b\u1175\u11af))");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.split("CN  ", "zh", (int) 'u');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEach("                                                                                                                                                                                                                                                                                                          gne", strArray3, strArray7);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "                                                                                                                                                                                                                                                                                                          gne" + "'", str8, "                                                                                                                                                                                                                                                                                                          gne");
    }

    @Test
    public void test06898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06898");
        java.util.Locale locale0 = java.util.Locale.JAPAN;
        java.lang.String str1 = locale0.getISO3Country();
        java.lang.String str3 = locale0.getExtension('u');
        java.lang.String str4 = locale0.getLanguage();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ja_JP");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JPN" + "'", str1, "JPN");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ja" + "'", str4, "ja");
    }

    @Test
    public void test06899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06899");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "0E+1");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test06900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06900");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("frz-C ", 4, (int) (byte) -2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test06901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06901");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal3 = bigDecimal2.negate();
        java.math.BigDecimal bigDecimal4 = bigDecimal2.negate();
        java.lang.String str5 = bigDecimal4.toEngineeringString();
        java.math.BigDecimal bigDecimal6 = bigDecimal1.multiply(bigDecimal4);
        java.math.BigDecimal bigDecimal8 = bigDecimal4.movePointRight(100);
        java.math.BigDecimal bigDecimal9 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal10 = bigDecimal9.negate();
        java.math.BigDecimal bigDecimal11 = bigDecimal9.negate();
        int int12 = bigDecimal8.compareTo(bigDecimal9);
        java.math.BigDecimal bigDecimal14 = bigDecimal8.movePointLeft(0);
        java.math.BigDecimal bigDecimal15 = bigDecimal14.stripTrailingZeros();
        java.math.BigDecimal bigDecimal16 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal17 = bigDecimal16.negate();
        java.math.BigDecimal bigDecimal18 = bigDecimal16.negate();
        java.lang.String str19 = bigDecimal18.toEngineeringString();
        java.math.BigDecimal bigDecimal20 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal21 = bigDecimal20.negate();
        java.math.BigDecimal bigDecimal22 = bigDecimal21.abs();
        java.math.BigDecimal bigDecimal24 = bigDecimal21.pow((int) (byte) 1);
        java.math.BigDecimal bigDecimal25 = bigDecimal18.add(bigDecimal21);
        java.math.BigDecimal bigDecimal26 = bigDecimal18.stripTrailingZeros();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal27 = bigDecimal14.divide(bigDecimal18);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Division undefined");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal2);
        org.junit.Assert.assertNotNull(bigDecimal3);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0" + "'", str5, "0");
        org.junit.Assert.assertNotNull(bigDecimal6);
        org.junit.Assert.assertNotNull(bigDecimal8);
        org.junit.Assert.assertNotNull(bigDecimal9);
        org.junit.Assert.assertNotNull(bigDecimal10);
        org.junit.Assert.assertNotNull(bigDecimal11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(bigDecimal14);
        org.junit.Assert.assertNotNull(bigDecimal15);
        org.junit.Assert.assertNotNull(bigDecimal16);
        org.junit.Assert.assertNotNull(bigDecimal17);
        org.junit.Assert.assertNotNull(bigDecimal18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "0" + "'", str19, "0");
        org.junit.Assert.assertNotNull(bigDecimal20);
        org.junit.Assert.assertNotNull(bigDecimal21);
        org.junit.Assert.assertNotNull(bigDecimal22);
        org.junit.Assert.assertNotNull(bigDecimal24);
        org.junit.Assert.assertNotNull(bigDecimal25);
        org.junit.Assert.assertNotNull(bigDecimal26);
    }

    @Test
    public void test06902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06902");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "HI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06903");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("\u82f1\u6587\u82f1\u56fd)", "de_DExxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06904");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "FRENCH", "Chinese (China)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06905");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "\uc911\uad6d\uc5b4");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test06906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06906");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("", "z-C");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06907");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("ZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZ", (short) 1024);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1024 + "'", short2 == (short) 1024);
    }

    @Test
    public void test06908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06908");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("CN", "\u82f1\u6587\u82f1\u56fd)", 301);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test06909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06909");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "                                                                                                                                                     #                                                                                                                                                      ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06910");
        java.math.BigDecimal bigDecimal1 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal2 = bigDecimal1.negate();
        java.math.BigDecimal bigDecimal5 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal6 = bigDecimal2.subtract(bigDecimal5);
        java.math.BigInteger bigInteger7 = bigDecimal6.toBigInteger();
        byte[] byteArray8 = bigInteger7.toByteArray();
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray8);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.min(byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = new java.math.BigInteger((int) (short) 100, byteArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Invalid signum value");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal2);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigDecimal6);
        org.junit.Assert.assertNotNull(bigInteger7);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0]");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 0 + "'", byte9 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 0 + "'", byte10 == (byte) 0);
    }

    @Test
    public void test06911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06911");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("h");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("en-US", 'u');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, '4', (int) 'x', 3);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray5);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("2-", strArray2, strArray10);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2-" + "'", str11, "2-");
    }

    @Test
    public void test06912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06912");
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.valueOf((long) (byte) -1, 0);
        java.math.BigDecimal bigDecimal3 = bigDecimal2.plus();
        java.math.BigDecimal bigDecimal4 = bigDecimal3.negate();
        double double5 = bigDecimal4.doubleValue();
        org.junit.Assert.assertNotNull(bigDecimal2);
        org.junit.Assert.assertNotNull(bigDecimal3);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test06913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06913");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("120120120120120120120120120120120120120120120120120120120120120120120120120120120120120120120120", "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test06914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06914");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 16, 299L, 296L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 299L + "'", long3 == 299L);
    }

    @Test
    public void test06915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06915");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setLanguageTag("eng");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder4 = builder2.addUnicodeLocaleAttribute("en_US");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: en_US [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test06916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06916");
        java.util.Locale locale2 = java.util.Locale.FRANCE;
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.upperCase("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!", locale2);
        java.lang.String str4 = locale2.getCountry();
        java.lang.String str5 = locale2.getVariant();
        java.lang.String str6 = locale2.getDisplayScript();
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.lowerCase("en-GB", locale2);
        java.lang.String str8 = locale2.getCountry();
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!!" + "'", str3, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "FR" + "'", str4, "FR");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "en-gb" + "'", str7, "en-gb");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "FR" + "'", str8, "FR");
    }

    @Test
    public void test06917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06917");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = new java.math.BigInteger("EN-CA");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06918");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("Englisch44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", (float) 2L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
    }

    @Test
    public void test06919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06919");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("             ENGLISH              ", (int) (short) 34);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "             ENGLISH              " + "'", str2, "             ENGLISH              ");
    }

    @Test
    public void test06920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06920");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 320L, (float) 300L, (float) 320L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 320.0f + "'", float3 == 320.0f);
    }

    @Test
    public void test06921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06921");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("0.0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000100", "", 563);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test06922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06922");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "\u671d\u9c9c\u6587\u97e9\u56fdu)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06923");
        java.math.BigDecimal bigDecimal1 = java.math.BigDecimal.valueOf((long) (byte) 0);
        byte byte2 = bigDecimal1.byteValueExact();
        java.math.BigDecimal bigDecimal4 = bigDecimal1.pow(2);
        java.math.BigDecimal bigDecimal5 = bigDecimal1.abs();
        java.math.BigDecimal bigDecimal6 = java.math.BigDecimal.ONE;
        java.math.BigDecimal bigDecimal7 = bigDecimal6.stripTrailingZeros();
        java.math.BigDecimal bigDecimal8 = bigDecimal5.multiply(bigDecimal6);
        java.math.BigDecimal bigDecimal9 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal10 = bigDecimal9.negate();
        java.math.BigDecimal bigDecimal11 = java.math.BigDecimal.ONE;
        java.math.BigDecimal bigDecimal12 = bigDecimal10.min(bigDecimal11);
        java.math.BigDecimal bigDecimal13 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal14 = bigDecimal13.negate();
        java.math.BigDecimal bigDecimal17 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal18 = bigDecimal14.subtract(bigDecimal17);
        java.math.BigDecimal[] bigDecimalArray19 = bigDecimal11.divideAndRemainder(bigDecimal17);
        java.math.MathContext mathContext20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal21 = bigDecimal6.add(bigDecimal11, mathContext20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigDecimal6);
        org.junit.Assert.assertNotNull(bigDecimal7);
        org.junit.Assert.assertNotNull(bigDecimal8);
        org.junit.Assert.assertNotNull(bigDecimal9);
        org.junit.Assert.assertNotNull(bigDecimal10);
        org.junit.Assert.assertNotNull(bigDecimal11);
        org.junit.Assert.assertNotNull(bigDecimal12);
        org.junit.Assert.assertNotNull(bigDecimal13);
        org.junit.Assert.assertNotNull(bigDecimal14);
        org.junit.Assert.assertNotNull(bigDecimal17);
        org.junit.Assert.assertNotNull(bigDecimal18);
        org.junit.Assert.assertNotNull(bigDecimalArray19);
    }

    @Test
    public void test06924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06924");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        double double1 = bigDecimal0.doubleValue();
        java.math.BigInteger bigInteger2 = bigDecimal0.toBigInteger();
        byte[] byteArray5 = new byte[] { (byte) 1 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        java.math.BigInteger bigInteger7 = new java.math.BigInteger((int) (short) -1, byteArray5);
        java.math.BigInteger bigInteger9 = bigInteger7.pow((int) 'a');
        byte[] byteArray10 = bigInteger7.toByteArray();
        long long11 = bigInteger7.longValueExact();
        java.math.BigInteger bigInteger12 = bigInteger2.or(bigInteger7);
        byte[] byteArray15 = new byte[] { (byte) 1 };
        byte byte16 = org.apache.commons.lang3.math.NumberUtils.min(byteArray15);
        java.math.BigInteger bigInteger17 = new java.math.BigInteger((int) (short) -1, byteArray15);
        java.math.BigInteger bigInteger19 = bigInteger17.pow((int) 'a');
        java.math.BigInteger bigInteger21 = bigInteger17.shiftLeft((int) (short) 1);
        boolean boolean23 = bigInteger21.isProbablePrime((int) '4');
        java.math.BigInteger bigInteger24 = bigInteger7.divide(bigInteger21);
        int int25 = bigInteger7.intValue();
        boolean boolean27 = bigInteger7.isProbablePrime((int) 'u');
        java.lang.String str29 = bigInteger7.toString((int) (byte) 10);
        java.math.BigDecimal bigDecimal30 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal31 = bigDecimal30.negate();
        java.math.BigDecimal bigDecimal34 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal35 = bigDecimal31.subtract(bigDecimal34);
        java.math.BigInteger bigInteger36 = bigDecimal35.toBigInteger();
        byte[] byteArray37 = bigInteger36.toByteArray();
        java.math.BigDecimal bigDecimal38 = new java.math.BigDecimal(bigInteger36);
        byte[] byteArray40 = new byte[] { (byte) 1 };
        byte byte41 = org.apache.commons.lang3.math.NumberUtils.min(byteArray40);
        java.math.BigInteger bigInteger42 = new java.math.BigInteger(byteArray40);
        java.math.BigDecimal bigDecimal43 = new java.math.BigDecimal(bigInteger42);
        short short44 = bigInteger42.shortValueExact();
        java.math.BigInteger bigInteger45 = bigInteger36.modInverse(bigInteger42);
        int int46 = bigInteger45.intValueExact();
        java.math.BigInteger bigInteger47 = bigInteger7.and(bigInteger45);
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(bigInteger2);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1]");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 1 + "'", byte6 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger9);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[-1]");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(bigInteger12);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[1]");
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) 1 + "'", byte16 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger19);
        org.junit.Assert.assertNotNull(bigInteger21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(bigInteger24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "-1" + "'", str29, "-1");
        org.junit.Assert.assertNotNull(bigDecimal30);
        org.junit.Assert.assertNotNull(bigDecimal31);
        org.junit.Assert.assertNotNull(bigDecimal34);
        org.junit.Assert.assertNotNull(bigDecimal35);
        org.junit.Assert.assertNotNull(bigInteger36);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[0]");
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[1]");
        org.junit.Assert.assertTrue("'" + byte41 + "' != '" + (byte) 1 + "'", byte41 == (byte) 1);
        org.junit.Assert.assertTrue("'" + short44 + "' != '" + (short) 1 + "'", short44 == (short) 1);
        org.junit.Assert.assertNotNull(bigInteger45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(bigInteger47);
    }

    @Test
    public void test06925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06925");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("UNITED STATES                                                                                    ", (-33));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UNITED STATES                                                                                    " + "'", str2, "UNITED STATES                                                                                    ");
    }

    @Test
    public void test06926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06926");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("\u82f1\u8a9e\u30a4\u30ad\u3099\u30ea\u30b9) ", 10, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u82f1\u8a9e\u30a4\u30ad\u3099\u30ea\u30b9) " + "'", str3, "\u82f1\u8a9e\u30a4\u30ad\u3099\u30ea\u30b9) ");
    }

    @Test
    public void test06927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06927");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("fr-FR-u-engcn", 2, 13);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "fr-FR-u-engcn" + "'", str3, "fr-FR-u-engcn");
    }

    @Test
    public void test06928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06928");
        char[] charArray18 = new char[] { ' ', '#', '4', '#', '4', ' ' };
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!", charArray18);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "en_US", charArray18);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", charArray18);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "zho", charArray18);
        int int23 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "zho", charArray18);
        int int24 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "zh-CN", charArray18);
        boolean boolean25 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "#_ENG", charArray18);
        boolean boolean26 = org.apache.commons.lang3.StringUtils.containsAny("China", charArray18);
        int int27 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "ko-KR", charArray18);
        boolean boolean28 = org.apache.commons.lang3.StringUtils.containsAny("gbr", charArray18);
        boolean boolean29 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "KR                               ", charArray18);
        int int30 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "-1", charArray18);
        java.math.MathContext mathContext31 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal32 = new java.math.BigDecimal(charArray18, mathContext31);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), " #4#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), " #4#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[ , #, 4, #, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test06929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06929");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "und ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06930");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setLanguageTag("eng");
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale.Builder builder4 = builder2.clear();
        java.util.Locale.Builder builder5 = builder2.clearExtensions();
        java.util.Locale locale6 = java.util.Locale.PRC;
        java.util.Locale locale7 = null;
        java.lang.String str8 = locale6.getDisplayScript(locale7);
        java.util.Locale.setDefault(locale6);
        java.util.Locale locale10 = locale6.stripExtensions();
        java.util.Locale.Builder builder11 = builder2.setLocale(locale6);
        java.util.Locale locale12 = java.util.Locale.GERMANY;
        java.lang.String str13 = locale12.getVariant();
        java.lang.String str14 = locale12.getDisplayScript();
        java.util.Locale locale15 = java.util.Locale.KOREA;
        java.util.Locale locale16 = locale15.stripExtensions();
        java.lang.String str17 = locale12.getDisplayName(locale16);
        java.util.Locale.Builder builder18 = builder11.setLocale(locale12);
        java.util.Locale.Builder builder20 = builder18.setLanguage("kor");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder22 = builder18.setLanguageTag("h");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: h [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "ko_KR");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\ub3c5\uc77c\uc5b4\ub3c5\uc77c)" + "'", str17, "\ub3c5\uc77c\uc5b4\ub3c5\uc77c)");
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
    }

    @Test
    public void test06931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06931");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal3 = bigDecimal2.negate();
        java.math.BigDecimal bigDecimal4 = bigDecimal2.negate();
        java.lang.String str5 = bigDecimal4.toEngineeringString();
        java.math.BigDecimal bigDecimal6 = bigDecimal1.multiply(bigDecimal4);
        java.math.BigDecimal bigDecimal8 = bigDecimal4.movePointRight(100);
        java.math.BigDecimal bigDecimal9 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal10 = bigDecimal9.negate();
        java.math.BigDecimal bigDecimal11 = bigDecimal9.negate();
        int int12 = bigDecimal8.compareTo(bigDecimal9);
        java.math.BigDecimal bigDecimal14 = bigDecimal8.movePointLeft(0);
        java.math.BigDecimal bigDecimal16 = java.math.BigDecimal.valueOf((double) (-1.0f));
        java.math.BigDecimal bigDecimal17 = java.math.BigDecimal.ZERO;
        double double18 = bigDecimal17.doubleValue();
        java.math.BigInteger bigInteger19 = bigDecimal17.toBigInteger();
        byte[] byteArray22 = new byte[] { (byte) 1 };
        byte byte23 = org.apache.commons.lang3.math.NumberUtils.min(byteArray22);
        java.math.BigInteger bigInteger24 = new java.math.BigInteger((int) (short) -1, byteArray22);
        java.math.BigInteger bigInteger26 = bigInteger24.pow((int) 'a');
        byte[] byteArray27 = bigInteger24.toByteArray();
        long long28 = bigInteger24.longValueExact();
        java.math.BigInteger bigInteger29 = bigInteger19.or(bigInteger24);
        byte[] byteArray32 = new byte[] { (byte) 1 };
        byte byte33 = org.apache.commons.lang3.math.NumberUtils.min(byteArray32);
        java.math.BigInteger bigInteger34 = new java.math.BigInteger((int) (short) -1, byteArray32);
        java.math.BigInteger bigInteger36 = bigInteger34.pow((int) 'a');
        byte[] byteArray37 = bigInteger34.toByteArray();
        long long38 = bigInteger34.longValueExact();
        java.lang.String str40 = bigInteger34.toString(0);
        int int41 = bigInteger34.intValueExact();
        java.math.BigInteger bigInteger42 = bigInteger29.subtract(bigInteger34);
        java.math.BigDecimal bigDecimal43 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal44 = bigDecimal43.negate();
        java.math.BigDecimal bigDecimal47 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal48 = bigDecimal44.subtract(bigDecimal47);
        java.math.BigInteger bigInteger49 = bigDecimal48.toBigInteger();
        java.math.BigInteger bigInteger50 = bigInteger49.negate();
        java.math.BigDecimal bigDecimal51 = java.math.BigDecimal.ZERO;
        double double52 = bigDecimal51.doubleValue();
        java.math.BigInteger bigInteger53 = bigDecimal51.toBigInteger();
        byte[] byteArray56 = new byte[] { (byte) 1 };
        byte byte57 = org.apache.commons.lang3.math.NumberUtils.min(byteArray56);
        java.math.BigInteger bigInteger58 = new java.math.BigInteger((int) (short) -1, byteArray56);
        java.math.BigInteger bigInteger60 = bigInteger58.pow((int) 'a');
        byte[] byteArray61 = bigInteger58.toByteArray();
        long long62 = bigInteger58.longValueExact();
        java.math.BigInteger bigInteger63 = bigInteger53.or(bigInteger58);
        byte[] byteArray66 = new byte[] { (byte) 1 };
        byte byte67 = org.apache.commons.lang3.math.NumberUtils.min(byteArray66);
        java.math.BigInteger bigInteger68 = new java.math.BigInteger((int) (short) -1, byteArray66);
        java.math.BigInteger bigInteger70 = bigInteger68.pow((int) 'a');
        byte[] byteArray71 = bigInteger68.toByteArray();
        long long72 = bigInteger68.longValueExact();
        java.lang.String str74 = bigInteger68.toString(0);
        int int75 = bigInteger68.intValueExact();
        java.math.BigInteger bigInteger76 = bigInteger63.subtract(bigInteger68);
        java.math.BigInteger bigInteger77 = bigInteger49.min(bigInteger63);
        java.math.BigInteger bigInteger78 = bigInteger42.gcd(bigInteger77);
        java.math.BigDecimal bigDecimal79 = new java.math.BigDecimal(bigInteger77);
        java.lang.String str80 = bigDecimal79.toPlainString();
        int int81 = bigDecimal16.compareTo(bigDecimal79);
        int int82 = bigDecimal8.compareTo(bigDecimal79);
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal2);
        org.junit.Assert.assertNotNull(bigDecimal3);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0" + "'", str5, "0");
        org.junit.Assert.assertNotNull(bigDecimal6);
        org.junit.Assert.assertNotNull(bigDecimal8);
        org.junit.Assert.assertNotNull(bigDecimal9);
        org.junit.Assert.assertNotNull(bigDecimal10);
        org.junit.Assert.assertNotNull(bigDecimal11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(bigDecimal14);
        org.junit.Assert.assertNotNull(bigDecimal16);
        org.junit.Assert.assertNotNull(bigDecimal17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(bigInteger19);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[1]");
        org.junit.Assert.assertTrue("'" + byte23 + "' != '" + (byte) 1 + "'", byte23 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger26);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[-1]");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-1L) + "'", long28 == (-1L));
        org.junit.Assert.assertNotNull(bigInteger29);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[1]");
        org.junit.Assert.assertTrue("'" + byte33 + "' != '" + (byte) 1 + "'", byte33 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger36);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[-1]");
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + (-1L) + "'", long38 == (-1L));
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "-1" + "'", str40, "-1");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(bigInteger42);
        org.junit.Assert.assertNotNull(bigDecimal43);
        org.junit.Assert.assertNotNull(bigDecimal44);
        org.junit.Assert.assertNotNull(bigDecimal47);
        org.junit.Assert.assertNotNull(bigDecimal48);
        org.junit.Assert.assertNotNull(bigInteger49);
        org.junit.Assert.assertNotNull(bigInteger50);
        org.junit.Assert.assertNotNull(bigDecimal51);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 0.0d + "'", double52 == 0.0d);
        org.junit.Assert.assertNotNull(bigInteger53);
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray56), "[1]");
        org.junit.Assert.assertTrue("'" + byte57 + "' != '" + (byte) 1 + "'", byte57 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger60);
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[-1]");
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + (-1L) + "'", long62 == (-1L));
        org.junit.Assert.assertNotNull(bigInteger63);
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray66), "[1]");
        org.junit.Assert.assertTrue("'" + byte67 + "' != '" + (byte) 1 + "'", byte67 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger70);
        org.junit.Assert.assertNotNull(byteArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray71), "[-1]");
        org.junit.Assert.assertTrue("'" + long72 + "' != '" + (-1L) + "'", long72 == (-1L));
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "-1" + "'", str74, "-1");
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertNotNull(bigInteger76);
        org.junit.Assert.assertNotNull(bigInteger77);
        org.junit.Assert.assertNotNull(bigInteger78);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "-1" + "'", str80, "-1");
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 1 + "'", int82 == 1);
    }

    @Test
    public void test06932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06932");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("JPN");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06933");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("HindiHindiHindiRF-RFHindiHindiHindi", 'x');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HindiHindiHindiRF-RFHindiHindiHindi" + "'", str2, "HindiHindiHindiRF-RFHindiHindiHindi");
    }

    @Test
    public void test06934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06934");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("\u6587");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u6587" + "'", str1, "\u6587");
    }

    @Test
    public void test06935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06935");
        byte[] byteArray2 = new byte[] { (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.math.BigInteger bigInteger4 = new java.math.BigInteger((int) (short) -1, byteArray2);
        java.math.BigInteger bigInteger5 = new java.math.BigInteger(byteArray2);
        java.math.BigInteger bigInteger6 = new java.math.BigInteger(byteArray2);
        java.math.BigDecimal bigDecimal7 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal8 = bigDecimal7.negate();
        java.math.BigDecimal bigDecimal11 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal12 = bigDecimal8.subtract(bigDecimal11);
        java.math.BigInteger bigInteger13 = bigDecimal12.toBigInteger();
        double double14 = bigInteger13.doubleValue();
        byte[] byteArray17 = new byte[] { (byte) 1 };
        byte byte18 = org.apache.commons.lang3.math.NumberUtils.min(byteArray17);
        java.math.BigInteger bigInteger19 = new java.math.BigInteger((int) (short) -1, byteArray17);
        java.math.BigInteger bigInteger20 = bigInteger13.gcd(bigInteger19);
        java.math.BigDecimal bigDecimal21 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal22 = bigDecimal21.negate();
        java.math.BigDecimal bigDecimal25 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal26 = bigDecimal22.subtract(bigDecimal25);
        java.math.BigInteger bigInteger27 = bigDecimal26.toBigInteger();
        java.math.BigInteger bigInteger28 = bigInteger19.or(bigInteger27);
        double double29 = bigInteger28.doubleValue();
        java.math.BigInteger bigInteger30 = bigInteger6.divide(bigInteger28);
        float float31 = bigInteger30.floatValue();
        byte[] byteArray34 = new byte[] { (byte) 1 };
        byte byte35 = org.apache.commons.lang3.math.NumberUtils.min(byteArray34);
        java.math.BigInteger bigInteger36 = new java.math.BigInteger((int) (short) -1, byteArray34);
        java.math.BigInteger bigInteger38 = bigInteger36.pow((int) 'a');
        byte[] byteArray39 = bigInteger36.toByteArray();
        java.math.BigInteger bigInteger40 = bigInteger30.divide(bigInteger36);
        java.math.BigInteger bigInteger42 = bigInteger40.shiftLeft(52);
        // The following exception was thrown during execution in test generation
        try {
            byte byte43 = bigInteger42.byteValueExact();
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: BigInteger out of byte range");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
        org.junit.Assert.assertNotNull(bigDecimal7);
        org.junit.Assert.assertNotNull(bigDecimal8);
        org.junit.Assert.assertNotNull(bigDecimal11);
        org.junit.Assert.assertNotNull(bigDecimal12);
        org.junit.Assert.assertNotNull(bigInteger13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[1]");
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) 1 + "'", byte18 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger20);
        org.junit.Assert.assertNotNull(bigDecimal21);
        org.junit.Assert.assertNotNull(bigDecimal22);
        org.junit.Assert.assertNotNull(bigDecimal25);
        org.junit.Assert.assertNotNull(bigDecimal26);
        org.junit.Assert.assertNotNull(bigInteger27);
        org.junit.Assert.assertNotNull(bigInteger28);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + (-1.0d) + "'", double29 == (-1.0d));
        org.junit.Assert.assertNotNull(bigInteger30);
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + (-1.0f) + "'", float31 == (-1.0f));
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[1]");
        org.junit.Assert.assertTrue("'" + byte35 + "' != '" + (byte) 1 + "'", byte35 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger38);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[-1]");
        org.junit.Assert.assertNotNull(bigInteger40);
        org.junit.Assert.assertNotNull(bigInteger42);
    }

    @Test
    public void test06936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06936");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.ONE;
        java.math.BigDecimal bigDecimal3 = bigDecimal1.min(bigDecimal2);
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal5 = bigDecimal4.negate();
        java.math.BigDecimal bigDecimal8 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal9 = bigDecimal5.subtract(bigDecimal8);
        java.math.BigDecimal[] bigDecimalArray10 = bigDecimal2.divideAndRemainder(bigDecimal8);
        java.math.BigDecimal bigDecimal11 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal12 = bigDecimal11.negate();
        java.math.BigDecimal bigDecimal15 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal16 = bigDecimal12.subtract(bigDecimal15);
        java.math.BigDecimal bigDecimal17 = java.math.BigDecimal.TEN;
        java.math.BigDecimal bigDecimal18 = bigDecimal15.min(bigDecimal17);
        java.math.BigDecimal bigDecimal19 = bigDecimal8.divideToIntegralValue(bigDecimal18);
        java.math.BigDecimal bigDecimal20 = java.math.BigDecimal.TEN;
        long long21 = bigDecimal20.longValueExact();
        java.math.BigDecimal bigDecimal22 = bigDecimal20.ulp();
        java.lang.String str23 = bigDecimal20.toString();
        java.math.BigDecimal bigDecimal24 = java.math.BigDecimal.TEN;
        long long25 = bigDecimal24.longValueExact();
        java.math.BigDecimal bigDecimal26 = java.math.BigDecimal.ZERO;
        double double27 = bigDecimal26.doubleValue();
        java.math.BigDecimal bigDecimal29 = bigDecimal26.movePointLeft((int) (byte) -1);
        int int30 = bigDecimal29.intValue();
        java.math.BigDecimal bigDecimal31 = bigDecimal24.add(bigDecimal29);
        java.math.BigDecimal bigDecimal32 = bigDecimal20.add(bigDecimal31);
        java.math.BigDecimal bigDecimal33 = bigDecimal18.min(bigDecimal32);
        java.math.MathContext mathContext34 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal35 = bigDecimal33.negate(mathContext34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal2);
        org.junit.Assert.assertNotNull(bigDecimal3);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigDecimal8);
        org.junit.Assert.assertNotNull(bigDecimal9);
        org.junit.Assert.assertNotNull(bigDecimalArray10);
        org.junit.Assert.assertNotNull(bigDecimal11);
        org.junit.Assert.assertNotNull(bigDecimal12);
        org.junit.Assert.assertNotNull(bigDecimal15);
        org.junit.Assert.assertNotNull(bigDecimal16);
        org.junit.Assert.assertNotNull(bigDecimal17);
        org.junit.Assert.assertNotNull(bigDecimal18);
        org.junit.Assert.assertNotNull(bigDecimal19);
        org.junit.Assert.assertNotNull(bigDecimal20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 10L + "'", long21 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "10" + "'", str23, "10");
        org.junit.Assert.assertNotNull(bigDecimal24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 10L + "'", long25 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal26);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertNotNull(bigDecimal29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(bigDecimal31);
        org.junit.Assert.assertNotNull(bigDecimal32);
        org.junit.Assert.assertNotNull(bigDecimal33);
    }

    @Test
    public void test06937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06937");
        java.math.MathContext mathContext1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal2 = new java.math.BigDecimal(13.0d, mathContext1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06938");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale.Builder builder1 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale locale3 = builder2.build();
        java.util.Locale.setDefault(category0, locale3);
        java.util.Locale locale5 = java.util.Locale.getDefault(category0);
        java.util.Locale locale6 = java.util.Locale.getDefault(category0);
        java.util.Locale locale7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = locale6.getDisplayName(locale7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
    }

    @Test
    public void test06939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06939");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        double double1 = bigDecimal0.doubleValue();
        java.math.BigInteger bigInteger2 = bigDecimal0.toBigInteger();
        byte[] byteArray5 = new byte[] { (byte) 1 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        java.math.BigInteger bigInteger7 = new java.math.BigInteger((int) (short) -1, byteArray5);
        java.math.BigInteger bigInteger9 = bigInteger7.pow((int) 'a');
        byte[] byteArray10 = bigInteger7.toByteArray();
        long long11 = bigInteger7.longValueExact();
        java.math.BigInteger bigInteger12 = bigInteger2.or(bigInteger7);
        byte byte13 = bigInteger7.byteValueExact();
        boolean boolean15 = bigInteger7.testBit(100);
        byte[] byteArray18 = new byte[] { (byte) 1 };
        byte byte19 = org.apache.commons.lang3.math.NumberUtils.min(byteArray18);
        java.math.BigInteger bigInteger20 = new java.math.BigInteger((int) (short) -1, byteArray18);
        java.math.BigInteger bigInteger22 = bigInteger20.pow((int) 'a');
        java.math.BigInteger bigInteger24 = bigInteger20.shiftLeft((int) (short) 1);
        java.math.BigDecimal bigDecimal25 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal26 = bigDecimal25.negate();
        java.math.BigDecimal bigDecimal27 = java.math.BigDecimal.ONE;
        java.math.BigDecimal bigDecimal28 = bigDecimal26.min(bigDecimal27);
        java.lang.String str29 = bigDecimal26.toPlainString();
        boolean boolean30 = bigInteger24.equals((java.lang.Object) bigDecimal26);
        java.math.BigInteger bigInteger31 = bigInteger7.divide(bigInteger24);
        short short32 = bigInteger31.shortValueExact();
        byte[] byteArray35 = new byte[] { (byte) 1 };
        byte byte36 = org.apache.commons.lang3.math.NumberUtils.min(byteArray35);
        java.math.BigInteger bigInteger37 = new java.math.BigInteger((int) (short) -1, byteArray35);
        java.math.BigInteger bigInteger38 = bigInteger37.not();
        int int39 = bigInteger37.bitCount();
        java.math.BigInteger bigInteger41 = bigInteger37.clearBit(2);
        int int42 = bigInteger31.compareTo(bigInteger41);
        java.math.BigInteger bigInteger44 = bigInteger31.flipBit(300);
        int int45 = bigInteger44.bitLength();
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(bigInteger2);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1]");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 1 + "'", byte6 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger9);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[-1]");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(bigInteger12);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) -1 + "'", byte13 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[1]");
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) 1 + "'", byte19 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger22);
        org.junit.Assert.assertNotNull(bigInteger24);
        org.junit.Assert.assertNotNull(bigDecimal25);
        org.junit.Assert.assertNotNull(bigDecimal26);
        org.junit.Assert.assertNotNull(bigDecimal27);
        org.junit.Assert.assertNotNull(bigDecimal28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "0" + "'", str29, "0");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(bigInteger31);
        org.junit.Assert.assertTrue("'" + short32 + "' != '" + (short) 0 + "'", short32 == (short) 0);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[1]");
        org.junit.Assert.assertTrue("'" + byte36 + "' != '" + (byte) 1 + "'", byte36 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(bigInteger41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertNotNull(bigInteger44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 301 + "'", int45 == 301);
    }

    @Test
    public void test06940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06940");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                                                                                                                                                                                                                                                                                          gne", "\u6cd5\u6587TWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTWTW", "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                                                                          gne" + "'", str3, "                                                                                                                                                                                                                                                                                                          gne");
    }

    @Test
    public void test06941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06941");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setLanguageTag("eng");
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale locale4 = java.util.Locale.FRANCE;
        java.util.Locale.Builder builder5 = builder3.setLocale(locale4);
        java.util.Locale.Builder builder7 = builder5.addUnicodeLocaleAttribute("engcn");
        java.util.Locale locale8 = builder5.build();
        java.util.Locale.Builder builder9 = builder5.clearExtensions();
        java.util.Locale.Builder builder10 = builder5.clearExtensions();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr_FR_#u-engcn");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test06942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06942");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        double double1 = bigDecimal0.doubleValue();
        java.math.BigInteger bigInteger2 = bigDecimal0.toBigInteger();
        byte[] byteArray5 = new byte[] { (byte) 1 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        java.math.BigInteger bigInteger7 = new java.math.BigInteger((int) (short) -1, byteArray5);
        java.math.BigInteger bigInteger9 = bigInteger7.pow((int) 'a');
        byte[] byteArray10 = bigInteger7.toByteArray();
        long long11 = bigInteger7.longValueExact();
        java.math.BigInteger bigInteger12 = bigInteger2.or(bigInteger7);
        byte[] byteArray15 = new byte[] { (byte) 1 };
        byte byte16 = org.apache.commons.lang3.math.NumberUtils.min(byteArray15);
        java.math.BigInteger bigInteger17 = new java.math.BigInteger((int) (short) -1, byteArray15);
        java.math.BigInteger bigInteger19 = bigInteger17.pow((int) 'a');
        java.math.BigInteger bigInteger21 = bigInteger17.shiftLeft((int) (short) 1);
        boolean boolean23 = bigInteger21.isProbablePrime((int) '4');
        java.math.BigInteger bigInteger24 = bigInteger7.divide(bigInteger21);
        int int25 = bigInteger7.intValue();
        int int26 = bigInteger7.getLowestSetBit();
        byte[] byteArray29 = new byte[] { (byte) 1 };
        byte byte30 = org.apache.commons.lang3.math.NumberUtils.min(byteArray29);
        java.math.BigInteger bigInteger31 = new java.math.BigInteger((int) (short) -1, byteArray29);
        java.math.BigInteger bigInteger33 = bigInteger31.pow((int) 'a');
        java.math.BigInteger bigInteger35 = bigInteger31.shiftLeft((int) (short) 1);
        boolean boolean37 = bigInteger35.isProbablePrime((int) '4');
        short short38 = bigInteger35.shortValueExact();
        java.math.BigDecimal bigDecimal39 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal40 = bigDecimal39.negate();
        java.math.BigDecimal bigDecimal43 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal44 = bigDecimal40.subtract(bigDecimal43);
        java.math.BigInteger bigInteger45 = bigDecimal44.toBigInteger();
        double double46 = bigInteger45.doubleValue();
        byte[] byteArray49 = new byte[] { (byte) 1 };
        byte byte50 = org.apache.commons.lang3.math.NumberUtils.min(byteArray49);
        java.math.BigInteger bigInteger51 = new java.math.BigInteger((int) (short) -1, byteArray49);
        java.math.BigInteger bigInteger52 = bigInteger45.gcd(bigInteger51);
        java.math.BigDecimal bigDecimal53 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal54 = bigDecimal53.negate();
        java.math.BigDecimal bigDecimal57 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal58 = bigDecimal54.subtract(bigDecimal57);
        java.math.BigInteger bigInteger59 = bigDecimal58.toBigInteger();
        double double60 = bigInteger59.doubleValue();
        byte[] byteArray63 = new byte[] { (byte) 1 };
        byte byte64 = org.apache.commons.lang3.math.NumberUtils.min(byteArray63);
        java.math.BigInteger bigInteger65 = new java.math.BigInteger((int) (short) -1, byteArray63);
        java.math.BigInteger bigInteger66 = bigInteger59.gcd(bigInteger65);
        java.math.BigDecimal bigDecimal67 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal68 = bigDecimal67.negate();
        java.math.BigDecimal bigDecimal71 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal72 = bigDecimal68.subtract(bigDecimal71);
        java.math.BigInteger bigInteger73 = bigDecimal72.toBigInteger();
        java.math.BigInteger bigInteger74 = bigInteger65.or(bigInteger73);
        short short75 = bigInteger65.shortValueExact();
        byte[] byteArray78 = new byte[] { (byte) 1 };
        byte byte79 = org.apache.commons.lang3.math.NumberUtils.min(byteArray78);
        java.math.BigInteger bigInteger80 = new java.math.BigInteger((int) (short) -1, byteArray78);
        java.math.BigInteger bigInteger82 = bigInteger80.pow((int) 'a');
        java.math.BigInteger bigInteger84 = bigInteger80.shiftLeft((int) (short) 1);
        java.math.BigInteger bigInteger85 = bigInteger65.xor(bigInteger84);
        java.math.BigInteger bigInteger86 = bigInteger84.not();
        java.math.BigInteger bigInteger87 = bigInteger52.and(bigInteger86);
        java.math.BigInteger bigInteger88 = bigInteger35.subtract(bigInteger86);
        java.math.BigInteger bigInteger90 = bigInteger35.clearBit((int) 'u');
        java.math.BigInteger bigInteger92 = bigInteger90.clearBit((int) (byte) 1);
        java.math.BigInteger bigInteger93 = bigInteger7.multiply(bigInteger90);
        boolean boolean95 = bigInteger93.isProbablePrime((int) (short) -33);
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(bigInteger2);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1]");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 1 + "'", byte6 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger9);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[-1]");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(bigInteger12);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[1]");
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) 1 + "'", byte16 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger19);
        org.junit.Assert.assertNotNull(bigInteger21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(bigInteger24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[1]");
        org.junit.Assert.assertTrue("'" + byte30 + "' != '" + (byte) 1 + "'", byte30 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger33);
        org.junit.Assert.assertNotNull(bigInteger35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + short38 + "' != '" + (short) -2 + "'", short38 == (short) -2);
        org.junit.Assert.assertNotNull(bigDecimal39);
        org.junit.Assert.assertNotNull(bigDecimal40);
        org.junit.Assert.assertNotNull(bigDecimal43);
        org.junit.Assert.assertNotNull(bigDecimal44);
        org.junit.Assert.assertNotNull(bigInteger45);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray49), "[1]");
        org.junit.Assert.assertTrue("'" + byte50 + "' != '" + (byte) 1 + "'", byte50 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger52);
        org.junit.Assert.assertNotNull(bigDecimal53);
        org.junit.Assert.assertNotNull(bigDecimal54);
        org.junit.Assert.assertNotNull(bigDecimal57);
        org.junit.Assert.assertNotNull(bigDecimal58);
        org.junit.Assert.assertNotNull(bigInteger59);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 0.0d + "'", double60 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray63), "[1]");
        org.junit.Assert.assertTrue("'" + byte64 + "' != '" + (byte) 1 + "'", byte64 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger66);
        org.junit.Assert.assertNotNull(bigDecimal67);
        org.junit.Assert.assertNotNull(bigDecimal68);
        org.junit.Assert.assertNotNull(bigDecimal71);
        org.junit.Assert.assertNotNull(bigDecimal72);
        org.junit.Assert.assertNotNull(bigInteger73);
        org.junit.Assert.assertNotNull(bigInteger74);
        org.junit.Assert.assertTrue("'" + short75 + "' != '" + (short) -1 + "'", short75 == (short) -1);
        org.junit.Assert.assertNotNull(byteArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray78), "[1]");
        org.junit.Assert.assertTrue("'" + byte79 + "' != '" + (byte) 1 + "'", byte79 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger82);
        org.junit.Assert.assertNotNull(bigInteger84);
        org.junit.Assert.assertNotNull(bigInteger85);
        org.junit.Assert.assertNotNull(bigInteger86);
        org.junit.Assert.assertNotNull(bigInteger87);
        org.junit.Assert.assertNotNull(bigInteger88);
        org.junit.Assert.assertNotNull(bigInteger90);
        org.junit.Assert.assertNotNull(bigInteger92);
        org.junit.Assert.assertNotNull(bigInteger93);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + true + "'", boolean95 == true);
    }

    @Test
    public void test06943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06943");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal5 = bigDecimal1.subtract(bigDecimal4);
        java.math.BigInteger bigInteger6 = bigDecimal5.toBigInteger();
        double double7 = bigInteger6.doubleValue();
        byte[] byteArray10 = new byte[] { (byte) 1 };
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.min(byteArray10);
        java.math.BigInteger bigInteger12 = new java.math.BigInteger((int) (short) -1, byteArray10);
        java.math.BigInteger bigInteger13 = bigInteger6.gcd(bigInteger12);
        java.math.BigDecimal bigDecimal14 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal15 = bigDecimal14.negate();
        java.math.BigDecimal bigDecimal18 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal19 = bigDecimal15.subtract(bigDecimal18);
        java.math.BigInteger bigInteger20 = bigDecimal19.toBigInteger();
        java.math.BigInteger bigInteger21 = bigInteger12.or(bigInteger20);
        short short22 = bigInteger12.shortValueExact();
        byte[] byteArray25 = new byte[] { (byte) 1 };
        byte byte26 = org.apache.commons.lang3.math.NumberUtils.min(byteArray25);
        java.math.BigInteger bigInteger27 = new java.math.BigInteger((int) (short) -1, byteArray25);
        java.math.BigInteger bigInteger29 = bigInteger27.pow((int) 'a');
        java.math.BigInteger bigInteger31 = bigInteger27.shiftLeft((int) (short) 1);
        java.math.BigInteger bigInteger32 = bigInteger12.xor(bigInteger31);
        float float33 = bigInteger31.floatValue();
        java.math.MathContext mathContext34 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal35 = new java.math.BigDecimal(bigInteger31, mathContext34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[1]");
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 1 + "'", byte11 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger13);
        org.junit.Assert.assertNotNull(bigDecimal14);
        org.junit.Assert.assertNotNull(bigDecimal15);
        org.junit.Assert.assertNotNull(bigDecimal18);
        org.junit.Assert.assertNotNull(bigDecimal19);
        org.junit.Assert.assertNotNull(bigInteger20);
        org.junit.Assert.assertNotNull(bigInteger21);
        org.junit.Assert.assertTrue("'" + short22 + "' != '" + (short) -1 + "'", short22 == (short) -1);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[1]");
        org.junit.Assert.assertTrue("'" + byte26 + "' != '" + (byte) 1 + "'", byte26 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger29);
        org.junit.Assert.assertNotNull(bigInteger31);
        org.junit.Assert.assertNotNull(bigInteger32);
        org.junit.Assert.assertTrue("'" + float33 + "' != '" + (-2.0f) + "'", float33 == (-2.0f));
    }

    @Test
    public void test06944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06944");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("uzuhzuazuoyuiyuhxuowuawuovuivuevuzuuruukuuguuytuwtuttusturtuotuntultuktuituhtugtuetuatuwsuvsuusutsussursuqsuosunsumsulsuksuisugsuesudsucsuasuwruuruorunrumruuqutpuspulpuipuapusouroumoujoucouynuvnurnuonunnulnugnuenudnubnuanuymutmusmurmuomunmulmukmuimuhmugmuvluulutluolunluiluglublualuykuwkuvkuukuskurkuokunkumkulkukkujkuikugkuakuvjuijuajuwiuuiutiusiuoiuniukiuiiugiueiudiuaiuzhuyhuuhuthurhuohuihuehuahuvguugungulgudguaguyfurfuofujfuifuffuafuueuteuseuoeuneuleueeuzduvdueduaduycuvcuucuscurcuocuhcuecuacusburbuobunbumbuibuhbugbuebuabuzauyauvausauraunaumaukaufaueaubauaa", "\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, 'a');
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "uauauauayuiyuaxuawuawuavuivuevuauuauukuuguuytuwtuttustuatuatuntultuktuituatugtuetuatuwsuvsuusutsussuasuqsuasunsumsulsuksuisugsuesudsucsuasuwauuauaunaumauuqutpuspulpuipuapusauaumaujaucauynuvnuanuanunnulnugnuenudnubnuanuymutmusmuamuamunmulmukmuimuamugmuvluulutlualunluiluglublualuykuwkuvkuukuskuakuakunkumkulkukkujkuikugkuakuvjuijuajuwiuuiutiusiuaiuniukiuiiugiueiudiuaiuauyauuautauauauiaueauauvguugungulgudguaguyauauaujauiauauauueuteuseuaeuneuleueeuaduvdueduaduycuvcuucuscuacuacuacuecuacusbuabuabunbumbuibuabugbuebuabuauyauvausauaunaumaukauaueaubau" + "'", str4, "uauauauayuiyuaxuawuawuavuivuevuauuauukuuguuytuwtuttustuatuatuntultuktuituatugtuetuatuwsuvsuusutsussuasuqsuasunsumsulsuksuisugsuesudsucsuasuwauuauaunaumauuqutpuspulpuipuapusauaumaujaucauynuvnuanuanunnulnugnuenudnubnuanuymutmusmuamuamunmulmukmuimuamugmuvluulutlualunluiluglublualuykuwkuvkuukuskuakuakunkumkulkukkujkuikugkuakuvjuijuajuwiuuiutiusiuaiuniukiuiiugiueiudiuaiuauyauuautauauauiaueauauvguugungulgudguaguyauauaujauiauauauueuteuseuaeuneuleueeuaduvdueduaduycuvcuucuscuacuacuacuecuacusbuabuabunbumbuibuabugbuebuabuauyauvausauaunaumaukauaueaubau");
        org.junit.Assert.assertNotNull(strArray5);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "uuuuyuiyuxuwuwuvuivuevuuuuukuuguuytuwtuttustututuntultuktuitutugtuetutuwsuvsuusutsussusuqsusunsumsulsuksuisugsuesudsucsusuwuuuunumuuqutpuspulpuipupusuumujucuynuvnunununnulnugnuenudnubnunuymutmusmumumunmulmukmuimumugmuvluulutlulunluiluglubluluykuwkuvkuukuskukukunkumkulkukkujkuikugkukuvjuijujuwiuuiutiusiuiuniukiuiiugiueiudiuiuuyuuutuuuiueuuvguugungulgudguguyuuujuiuuuueuteuseueuneuleueeuduvdueduduycuvcuucuscucucucuecucusbububunbumbuibubugbuebubuuyuvusuunumukuueubu" + "'", str6, "uuuuyuiyuxuwuwuvuivuevuuuuukuuguuytuwtuttustututuntultuktuitutugtuetutuwsuvsuusutsussusuqsusunsumsulsuksuisugsuesudsucsusuwuuuunumuuqutpuspulpuipupusuumujucuynuvnunununnulnugnuenudnubnunuymutmusmumumunmulmukmuimumugmuvluulutlulunluiluglubluluykuwkuvkuukuskukukunkumkulkukkujkuikugkukuvjuijujuwiuuiutiusiuiuniukiuiiugiueiudiuiuuyuuutuuuiueuuvguugungulgudguguyuuujuiuuuueuteuseueuneuleueeuduvdueduduycuvcuucuscucucucuecucusbububunbumbuibubugbuebubuuyuvusuunumukuueubu");
    }

    @Test
    public void test06945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06945");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal5 = bigDecimal1.subtract(bigDecimal4);
        java.math.BigInteger bigInteger6 = bigDecimal5.toBigInteger();
        double double7 = bigInteger6.doubleValue();
        byte[] byteArray10 = new byte[] { (byte) 1 };
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.min(byteArray10);
        java.math.BigInteger bigInteger12 = new java.math.BigInteger((int) (short) -1, byteArray10);
        java.math.BigInteger bigInteger13 = bigInteger6.gcd(bigInteger12);
        java.math.BigDecimal bigDecimal14 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal15 = bigDecimal14.negate();
        java.math.BigDecimal bigDecimal18 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal19 = bigDecimal15.subtract(bigDecimal18);
        java.math.BigInteger bigInteger20 = bigDecimal19.toBigInteger();
        java.math.BigInteger bigInteger21 = bigInteger12.or(bigInteger20);
        short short22 = bigInteger12.shortValueExact();
        int int23 = bigInteger12.getLowestSetBit();
        long long24 = bigInteger12.longValueExact();
        java.math.BigInteger bigInteger25 = bigInteger12.not();
        byte[] byteArray28 = new byte[] { (byte) 1 };
        byte byte29 = org.apache.commons.lang3.math.NumberUtils.min(byteArray28);
        java.math.BigInteger bigInteger30 = new java.math.BigInteger((int) (short) -1, byteArray28);
        java.math.BigInteger bigInteger32 = bigInteger30.pow((int) 'a');
        int int33 = bigInteger32.bitCount();
        java.math.BigInteger bigInteger34 = bigInteger12.or(bigInteger32);
        java.math.BigDecimal bigDecimal35 = java.math.BigDecimal.ZERO;
        double double36 = bigDecimal35.doubleValue();
        java.math.BigInteger bigInteger37 = bigDecimal35.toBigInteger();
        byte[] byteArray40 = new byte[] { (byte) 1 };
        byte byte41 = org.apache.commons.lang3.math.NumberUtils.min(byteArray40);
        java.math.BigInteger bigInteger42 = new java.math.BigInteger((int) (short) -1, byteArray40);
        java.math.BigInteger bigInteger44 = bigInteger42.pow((int) 'a');
        byte[] byteArray45 = bigInteger42.toByteArray();
        long long46 = bigInteger42.longValueExact();
        java.math.BigInteger bigInteger47 = bigInteger37.or(bigInteger42);
        byte[] byteArray50 = new byte[] { (byte) 1 };
        byte byte51 = org.apache.commons.lang3.math.NumberUtils.min(byteArray50);
        java.math.BigInteger bigInteger52 = new java.math.BigInteger((int) (short) -1, byteArray50);
        java.math.BigInteger bigInteger54 = bigInteger52.pow((int) 'a');
        byte[] byteArray55 = bigInteger52.toByteArray();
        long long56 = bigInteger52.longValueExact();
        java.lang.String str58 = bigInteger52.toString(0);
        int int59 = bigInteger52.intValueExact();
        java.math.BigInteger bigInteger60 = bigInteger47.subtract(bigInteger52);
        java.math.BigInteger bigInteger62 = bigInteger60.clearBit((int) 'a');
        java.math.BigInteger bigInteger63 = bigInteger32.min(bigInteger60);
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[1]");
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 1 + "'", byte11 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger13);
        org.junit.Assert.assertNotNull(bigDecimal14);
        org.junit.Assert.assertNotNull(bigDecimal15);
        org.junit.Assert.assertNotNull(bigDecimal18);
        org.junit.Assert.assertNotNull(bigDecimal19);
        org.junit.Assert.assertNotNull(bigInteger20);
        org.junit.Assert.assertNotNull(bigInteger21);
        org.junit.Assert.assertTrue("'" + short22 + "' != '" + (short) -1 + "'", short22 == (short) -1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-1L) + "'", long24 == (-1L));
        org.junit.Assert.assertNotNull(bigInteger25);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[1]");
        org.junit.Assert.assertTrue("'" + byte29 + "' != '" + (byte) 1 + "'", byte29 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(bigInteger34);
        org.junit.Assert.assertNotNull(bigDecimal35);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertNotNull(bigInteger37);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[1]");
        org.junit.Assert.assertTrue("'" + byte41 + "' != '" + (byte) 1 + "'", byte41 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger44);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray45), "[-1]");
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + (-1L) + "'", long46 == (-1L));
        org.junit.Assert.assertNotNull(bigInteger47);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray50), "[1]");
        org.junit.Assert.assertTrue("'" + byte51 + "' != '" + (byte) 1 + "'", byte51 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger54);
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray55), "[-1]");
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + (-1L) + "'", long56 == (-1L));
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "-1" + "'", str58, "-1");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(bigInteger60);
        org.junit.Assert.assertNotNull(bigInteger62);
        org.junit.Assert.assertNotNull(bigInteger63);
    }

    @Test
    public void test06946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06946");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "\uc5b4\uad6d\ud55c\u6cd5\u6587\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd)", (java.lang.CharSequence) "aaaaaaaaaUNITED STATESaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "\uc5b4\uad6d\ud55c\u6cd5\u6587\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd)" + "'", charSequence2, "\uc5b4\uad6d\ud55c\u6cd5\u6587\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd\u6cd5\u56fd)");
    }

    @Test
    public void test06947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06947");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal2 = bigDecimal1.abs();
        int int3 = bigDecimal1.intValueExact();
        java.math.BigInteger bigInteger4 = bigDecimal1.toBigInteger();
        java.math.BigDecimal bigDecimal5 = bigDecimal1.ulp();
        java.lang.String str6 = bigDecimal5.toEngineeringString();
        java.math.BigDecimal bigDecimal7 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal8 = bigDecimal7.negate();
        java.math.BigDecimal bigDecimal9 = bigDecimal7.negate();
        java.lang.String str10 = bigDecimal7.toString();
        java.math.BigDecimal bigDecimal12 = new java.math.BigDecimal((double) 1L);
        java.lang.Object[] objArray15 = new java.lang.Object[] { (short) 10, (short) 100 };
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(objArray15, "hi!", (int) (byte) 100, (int) (short) -1);
        boolean boolean20 = bigDecimal12.equals((java.lang.Object) (short) -1);
        java.math.BigDecimal bigDecimal21 = bigDecimal7.max(bigDecimal12);
        java.math.BigDecimal bigDecimal22 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal23 = bigDecimal22.negate();
        java.math.BigDecimal bigDecimal26 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal27 = bigDecimal23.subtract(bigDecimal26);
        java.math.BigDecimal bigDecimal28 = java.math.BigDecimal.TEN;
        java.math.BigDecimal bigDecimal29 = bigDecimal26.min(bigDecimal28);
        java.math.BigDecimal bigDecimal31 = bigDecimal29.movePointRight((int) (short) -2);
        java.math.BigDecimal bigDecimal32 = bigDecimal7.min(bigDecimal29);
        java.math.BigDecimal bigDecimal33 = java.math.BigDecimal.TEN;
        long long34 = bigDecimal33.longValueExact();
        int int35 = bigDecimal33.intValue();
        java.math.BigDecimal[] bigDecimalArray36 = bigDecimal29.divideAndRemainder(bigDecimal33);
        java.math.BigDecimal bigDecimal37 = bigDecimal33.abs();
        java.math.BigDecimal bigDecimal38 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal39 = bigDecimal38.negate();
        java.math.BigDecimal bigDecimal40 = java.math.BigDecimal.ONE;
        java.math.BigDecimal bigDecimal41 = bigDecimal39.min(bigDecimal40);
        java.math.BigDecimal bigDecimal42 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal43 = bigDecimal42.negate();
        java.math.BigDecimal bigDecimal46 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal47 = bigDecimal43.subtract(bigDecimal46);
        java.math.BigDecimal[] bigDecimalArray48 = bigDecimal40.divideAndRemainder(bigDecimal46);
        java.math.BigDecimal bigDecimal49 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal50 = bigDecimal49.negate();
        java.math.BigDecimal bigDecimal53 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal54 = bigDecimal50.subtract(bigDecimal53);
        java.math.BigDecimal bigDecimal55 = java.math.BigDecimal.TEN;
        java.math.BigDecimal bigDecimal56 = bigDecimal53.min(bigDecimal55);
        java.math.BigDecimal bigDecimal57 = bigDecimal46.divideToIntegralValue(bigDecimal56);
        java.lang.String str58 = bigDecimal56.toEngineeringString();
        long long59 = bigDecimal56.longValue();
        byte[] byteArray62 = new byte[] { (byte) 1 };
        byte byte63 = org.apache.commons.lang3.math.NumberUtils.min(byteArray62);
        java.math.BigInteger bigInteger64 = new java.math.BigInteger((int) (short) -1, byteArray62);
        java.math.BigInteger bigInteger66 = bigInteger64.pow((int) 'a');
        java.math.BigInteger bigInteger68 = bigInteger64.shiftLeft((int) (short) 1);
        java.math.BigDecimal bigDecimal70 = new java.math.BigDecimal(bigInteger64, 34);
        java.math.BigDecimal bigDecimal73 = bigDecimal56.divide(bigDecimal70, 100, 7);
        java.math.BigDecimal bigDecimal74 = bigDecimal33.add(bigDecimal56);
        java.math.MathContext mathContext75 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal76 = bigDecimal5.multiply(bigDecimal56, mathContext75);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(bigInteger4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1" + "'", str6, "1");
        org.junit.Assert.assertNotNull(bigDecimal7);
        org.junit.Assert.assertNotNull(bigDecimal8);
        org.junit.Assert.assertNotNull(bigDecimal9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0" + "'", str10, "0");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[10, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[10, 100]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(bigDecimal21);
        org.junit.Assert.assertNotNull(bigDecimal22);
        org.junit.Assert.assertNotNull(bigDecimal23);
        org.junit.Assert.assertNotNull(bigDecimal26);
        org.junit.Assert.assertNotNull(bigDecimal27);
        org.junit.Assert.assertNotNull(bigDecimal28);
        org.junit.Assert.assertNotNull(bigDecimal29);
        org.junit.Assert.assertNotNull(bigDecimal31);
        org.junit.Assert.assertNotNull(bigDecimal32);
        org.junit.Assert.assertNotNull(bigDecimal33);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 10L + "'", long34 == 10L);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 10 + "'", int35 == 10);
        org.junit.Assert.assertNotNull(bigDecimalArray36);
        org.junit.Assert.assertNotNull(bigDecimal37);
        org.junit.Assert.assertNotNull(bigDecimal38);
        org.junit.Assert.assertNotNull(bigDecimal39);
        org.junit.Assert.assertNotNull(bigDecimal40);
        org.junit.Assert.assertNotNull(bigDecimal41);
        org.junit.Assert.assertNotNull(bigDecimal42);
        org.junit.Assert.assertNotNull(bigDecimal43);
        org.junit.Assert.assertNotNull(bigDecimal46);
        org.junit.Assert.assertNotNull(bigDecimal47);
        org.junit.Assert.assertNotNull(bigDecimalArray48);
        org.junit.Assert.assertNotNull(bigDecimal49);
        org.junit.Assert.assertNotNull(bigDecimal50);
        org.junit.Assert.assertNotNull(bigDecimal53);
        org.junit.Assert.assertNotNull(bigDecimal54);
        org.junit.Assert.assertNotNull(bigDecimal55);
        org.junit.Assert.assertNotNull(bigDecimal56);
        org.junit.Assert.assertNotNull(bigDecimal57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "10.0E-99" + "'", str58, "10.0E-99");
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 0L + "'", long59 == 0L);
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray62), "[1]");
        org.junit.Assert.assertTrue("'" + byte63 + "' != '" + (byte) 1 + "'", byte63 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger66);
        org.junit.Assert.assertNotNull(bigInteger68);
        org.junit.Assert.assertNotNull(bigDecimal73);
        org.junit.Assert.assertNotNull(bigDecimal74);
    }

    @Test
    public void test06948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06948");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(4, 0, (int) (short) 1024);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test06949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06949");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("jpnjpnjpnjpnjpnjpnjpnjpnjpnjpn");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "\u65e5\u672c");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test06950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06950");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setLanguageTag("eng");
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale locale4 = builder2.build();
        java.util.Locale locale6 = new java.util.Locale("0.0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000100");
        java.lang.String str7 = locale6.getDisplayName();
        java.lang.String str8 = locale4.getDisplayName(locale6);
        java.lang.String str9 = locale6.getScript();
        java.util.Locale locale10 = java.util.Locale.KOREA;
        java.util.Locale locale11 = locale10.stripExtensions();
        java.util.Locale.setDefault(locale10);
        java.lang.String str13 = locale6.getDisplayScript(locale10);
        java.lang.Object obj14 = locale10.clone();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertEquals(locale6.toString(), "0.0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000100");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0.0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000100" + "'", str7, "0.0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000100");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "ko_KR");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "ko_KR");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "ko_KR");
    }

    @Test
    public void test06951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06951");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("Chinese");
        java.util.Locale locale3 = java.util.Locale.CANADA;
        java.util.Locale locale4 = java.util.Locale.GERMANY;
        java.util.Locale locale5 = java.util.Locale.PRC;
        java.lang.String str6 = locale4.getDisplayScript(locale5);
        java.util.Locale locale7 = java.util.Locale.JAPANESE;
        java.lang.String str8 = locale7.getISO3Language();
        java.lang.String str9 = locale4.getDisplayScript(locale7);
        java.lang.String str10 = locale3.getDisplayLanguage(locale4);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.lowerCase("#_ENG", locale3);
        java.util.Locale locale12 = locale3.stripExtensions();
        java.lang.String str13 = locale1.getDisplayVariant(locale3);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "chinese");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "jpn" + "'", str8, "jpn");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Englisch" + "'", str10, "Englisch");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#_eng" + "'", str11, "#_eng");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test06952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06952");
        byte[] byteArray2 = new byte[] { (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.math.BigInteger bigInteger4 = new java.math.BigInteger((int) (short) -1, byteArray2);
        java.math.BigInteger bigInteger6 = bigInteger4.pow((int) 'a');
        java.math.BigInteger bigInteger8 = bigInteger4.shiftLeft((int) (short) 1);
        int int9 = bigInteger8.intValueExact();
        java.math.BigInteger bigInteger10 = bigInteger8.abs();
        java.math.BigDecimal bigDecimal11 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal12 = bigDecimal11.negate();
        java.math.BigDecimal bigDecimal15 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal16 = bigDecimal12.subtract(bigDecimal15);
        java.math.BigInteger bigInteger17 = bigDecimal16.toBigInteger();
        java.math.BigInteger bigInteger18 = bigInteger17.negate();
        java.math.BigDecimal bigDecimal19 = java.math.BigDecimal.ZERO;
        double double20 = bigDecimal19.doubleValue();
        java.math.BigInteger bigInteger21 = bigDecimal19.toBigInteger();
        byte[] byteArray24 = new byte[] { (byte) 1 };
        byte byte25 = org.apache.commons.lang3.math.NumberUtils.min(byteArray24);
        java.math.BigInteger bigInteger26 = new java.math.BigInteger((int) (short) -1, byteArray24);
        java.math.BigInteger bigInteger28 = bigInteger26.pow((int) 'a');
        byte[] byteArray29 = bigInteger26.toByteArray();
        long long30 = bigInteger26.longValueExact();
        java.math.BigInteger bigInteger31 = bigInteger21.or(bigInteger26);
        byte[] byteArray34 = new byte[] { (byte) 1 };
        byte byte35 = org.apache.commons.lang3.math.NumberUtils.min(byteArray34);
        java.math.BigInteger bigInteger36 = new java.math.BigInteger((int) (short) -1, byteArray34);
        java.math.BigInteger bigInteger38 = bigInteger36.pow((int) 'a');
        byte[] byteArray39 = bigInteger36.toByteArray();
        long long40 = bigInteger36.longValueExact();
        java.lang.String str42 = bigInteger36.toString(0);
        int int43 = bigInteger36.intValueExact();
        java.math.BigInteger bigInteger44 = bigInteger31.subtract(bigInteger36);
        java.math.BigInteger bigInteger45 = bigInteger17.min(bigInteger31);
        java.math.BigDecimal bigDecimal46 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal47 = bigDecimal46.negate();
        java.math.BigDecimal bigDecimal50 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal51 = bigDecimal47.subtract(bigDecimal50);
        java.math.BigInteger bigInteger52 = bigDecimal51.toBigInteger();
        double double53 = bigInteger52.doubleValue();
        byte[] byteArray56 = new byte[] { (byte) 1 };
        byte byte57 = org.apache.commons.lang3.math.NumberUtils.min(byteArray56);
        java.math.BigInteger bigInteger58 = new java.math.BigInteger((int) (short) -1, byteArray56);
        java.math.BigInteger bigInteger59 = bigInteger52.gcd(bigInteger58);
        java.math.BigDecimal bigDecimal60 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal61 = bigDecimal60.negate();
        java.math.BigDecimal bigDecimal64 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal65 = bigDecimal61.subtract(bigDecimal64);
        java.math.BigInteger bigInteger66 = bigDecimal65.toBigInteger();
        java.math.BigInteger bigInteger67 = bigInteger58.or(bigInteger66);
        boolean boolean69 = bigInteger67.testBit(117);
        double double70 = bigInteger67.doubleValue();
        java.math.BigInteger bigInteger71 = bigInteger31.subtract(bigInteger67);
        boolean boolean73 = bigInteger31.testBit((int) (byte) 10);
        java.math.BigInteger bigInteger74 = bigInteger10.divide(bigInteger31);
        int int75 = bigInteger31.bitCount();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertNotNull(bigInteger8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2) + "'", int9 == (-2));
        org.junit.Assert.assertNotNull(bigInteger10);
        org.junit.Assert.assertNotNull(bigDecimal11);
        org.junit.Assert.assertNotNull(bigDecimal12);
        org.junit.Assert.assertNotNull(bigDecimal15);
        org.junit.Assert.assertNotNull(bigDecimal16);
        org.junit.Assert.assertNotNull(bigInteger17);
        org.junit.Assert.assertNotNull(bigInteger18);
        org.junit.Assert.assertNotNull(bigDecimal19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNotNull(bigInteger21);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[1]");
        org.junit.Assert.assertTrue("'" + byte25 + "' != '" + (byte) 1 + "'", byte25 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger28);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[-1]");
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-1L) + "'", long30 == (-1L));
        org.junit.Assert.assertNotNull(bigInteger31);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[1]");
        org.junit.Assert.assertTrue("'" + byte35 + "' != '" + (byte) 1 + "'", byte35 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger38);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[-1]");
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + (-1L) + "'", long40 == (-1L));
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "-1" + "'", str42, "-1");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(bigInteger44);
        org.junit.Assert.assertNotNull(bigInteger45);
        org.junit.Assert.assertNotNull(bigDecimal46);
        org.junit.Assert.assertNotNull(bigDecimal47);
        org.junit.Assert.assertNotNull(bigDecimal50);
        org.junit.Assert.assertNotNull(bigDecimal51);
        org.junit.Assert.assertNotNull(bigInteger52);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray56), "[1]");
        org.junit.Assert.assertTrue("'" + byte57 + "' != '" + (byte) 1 + "'", byte57 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger59);
        org.junit.Assert.assertNotNull(bigDecimal60);
        org.junit.Assert.assertNotNull(bigDecimal61);
        org.junit.Assert.assertNotNull(bigDecimal64);
        org.junit.Assert.assertNotNull(bigDecimal65);
        org.junit.Assert.assertNotNull(bigInteger66);
        org.junit.Assert.assertNotNull(bigInteger67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + (-1.0d) + "'", double70 == (-1.0d));
        org.junit.Assert.assertNotNull(bigInteger71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(bigInteger74);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
    }

    @Test
    public void test06953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06953");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("-2-2-zh-C");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test06954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06954");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "\u82f1\u8a9e\u30a4\u30ae\u30ea\u30b9) ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06955");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) -1, (short) 100, (short) (byte) 2);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test06956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06956");
        java.math.BigDecimal bigDecimal1 = java.math.BigDecimal.valueOf((double) 11);
        org.junit.Assert.assertNotNull(bigDecimal1);
    }

    @Test
    public void test06957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06957");
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal(117.0d);
    }

    @Test
    public void test06958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06958");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("\u9c9c\u6587\u97e9\u56fd)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06959");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal("2#2#2#2#2#2#2#2#2#2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-zh-CN");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06960");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 2, (byte) 100, (byte) 2);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 2 + "'", byte3 == (byte) 2);
    }

    @Test
    public void test06961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06961");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "EN-GB", (int) 'a');
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test06962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06962");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 31, 33L, (long) (byte) 2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 2L + "'", long3 == 2L);
    }

    @Test
    public void test06963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06963");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("Canada", "\u4e2d\u6587\u4e2d\u570b)");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test06964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06964");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("AJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJ", 52, "UND ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJ" + "'", str3, "AJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJ");
    }

    @Test
    public void test06965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06965");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal3 = bigDecimal2.negate();
        java.math.BigDecimal bigDecimal4 = bigDecimal2.negate();
        java.lang.String str5 = bigDecimal4.toEngineeringString();
        java.math.BigDecimal bigDecimal6 = bigDecimal1.multiply(bigDecimal4);
        java.math.BigDecimal bigDecimal8 = bigDecimal4.movePointRight(100);
        java.math.BigInteger bigInteger9 = bigDecimal4.toBigInteger();
        java.math.BigDecimal bigDecimal11 = bigDecimal4.setScale(0);
        java.math.BigDecimal bigDecimal12 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal13 = bigDecimal12.negate();
        java.math.BigDecimal bigDecimal14 = bigDecimal13.abs();
        int int15 = bigDecimal13.intValueExact();
        java.math.BigInteger bigInteger16 = bigDecimal13.toBigInteger();
        java.math.BigDecimal bigDecimal17 = bigDecimal13.plus();
        long long18 = bigDecimal17.longValue();
        java.math.MathContext mathContext19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal20 = bigDecimal4.divide(bigDecimal17, mathContext19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal2);
        org.junit.Assert.assertNotNull(bigDecimal3);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0" + "'", str5, "0");
        org.junit.Assert.assertNotNull(bigDecimal6);
        org.junit.Assert.assertNotNull(bigDecimal8);
        org.junit.Assert.assertNotNull(bigInteger9);
        org.junit.Assert.assertNotNull(bigDecimal11);
        org.junit.Assert.assertNotNull(bigDecimal12);
        org.junit.Assert.assertNotNull(bigDecimal13);
        org.junit.Assert.assertNotNull(bigDecimal14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(bigInteger16);
        org.junit.Assert.assertNotNull(bigDecimal17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test06966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06966");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal5 = bigDecimal1.subtract(bigDecimal4);
        java.math.BigInteger bigInteger6 = bigDecimal5.toBigInteger();
        double double7 = bigInteger6.doubleValue();
        byte[] byteArray10 = new byte[] { (byte) 1 };
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.min(byteArray10);
        java.math.BigInteger bigInteger12 = new java.math.BigInteger((int) (short) -1, byteArray10);
        java.math.BigInteger bigInteger13 = bigInteger6.gcd(bigInteger12);
        java.math.BigInteger bigInteger14 = bigInteger12.negate();
        java.math.BigDecimal bigDecimal15 = java.math.BigDecimal.ZERO;
        double double16 = bigDecimal15.doubleValue();
        java.math.BigInteger bigInteger17 = bigDecimal15.toBigInteger();
        byte[] byteArray20 = new byte[] { (byte) 1 };
        byte byte21 = org.apache.commons.lang3.math.NumberUtils.min(byteArray20);
        java.math.BigInteger bigInteger22 = new java.math.BigInteger((int) (short) -1, byteArray20);
        java.math.BigInteger bigInteger24 = bigInteger22.pow((int) 'a');
        byte[] byteArray25 = bigInteger22.toByteArray();
        long long26 = bigInteger22.longValueExact();
        java.math.BigInteger bigInteger27 = bigInteger17.or(bigInteger22);
        byte[] byteArray30 = new byte[] { (byte) 1 };
        byte byte31 = org.apache.commons.lang3.math.NumberUtils.min(byteArray30);
        java.math.BigInteger bigInteger32 = new java.math.BigInteger((int) (short) -1, byteArray30);
        java.math.BigInteger bigInteger34 = bigInteger32.pow((int) 'a');
        byte[] byteArray35 = bigInteger32.toByteArray();
        long long36 = bigInteger32.longValueExact();
        java.lang.String str38 = bigInteger32.toString(0);
        int int39 = bigInteger32.intValueExact();
        java.math.BigInteger bigInteger40 = bigInteger27.subtract(bigInteger32);
        java.math.BigInteger bigInteger41 = bigInteger12.subtract(bigInteger40);
        java.math.BigDecimal bigDecimal42 = java.math.BigDecimal.ZERO;
        double double43 = bigDecimal42.doubleValue();
        java.math.BigInteger bigInteger44 = bigDecimal42.toBigInteger();
        java.math.BigInteger bigInteger46 = bigInteger44.setBit(4);
        java.math.BigDecimal bigDecimal47 = java.math.BigDecimal.ZERO;
        double double48 = bigDecimal47.doubleValue();
        java.math.BigInteger bigInteger49 = bigDecimal47.toBigInteger();
        byte[] byteArray52 = new byte[] { (byte) 1 };
        byte byte53 = org.apache.commons.lang3.math.NumberUtils.min(byteArray52);
        java.math.BigInteger bigInteger54 = new java.math.BigInteger((int) (short) -1, byteArray52);
        java.math.BigInteger bigInteger56 = bigInteger54.pow((int) 'a');
        byte[] byteArray57 = bigInteger54.toByteArray();
        long long58 = bigInteger54.longValueExact();
        java.math.BigInteger bigInteger59 = bigInteger49.or(bigInteger54);
        java.math.BigInteger bigInteger60 = bigInteger44.multiply(bigInteger59);
        java.math.BigInteger bigInteger61 = bigInteger12.andNot(bigInteger59);
        java.math.BigDecimal bigDecimal62 = new java.math.BigDecimal(bigInteger12);
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[1]");
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 1 + "'", byte11 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger13);
        org.junit.Assert.assertNotNull(bigInteger14);
        org.junit.Assert.assertNotNull(bigDecimal15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(bigInteger17);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[1]");
        org.junit.Assert.assertTrue("'" + byte21 + "' != '" + (byte) 1 + "'", byte21 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger24);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[-1]");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-1L) + "'", long26 == (-1L));
        org.junit.Assert.assertNotNull(bigInteger27);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[1]");
        org.junit.Assert.assertTrue("'" + byte31 + "' != '" + (byte) 1 + "'", byte31 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger34);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[-1]");
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-1L) + "'", long36 == (-1L));
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "-1" + "'", str38, "-1");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(bigInteger40);
        org.junit.Assert.assertNotNull(bigInteger41);
        org.junit.Assert.assertNotNull(bigDecimal42);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertNotNull(bigInteger44);
        org.junit.Assert.assertNotNull(bigInteger46);
        org.junit.Assert.assertNotNull(bigDecimal47);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
        org.junit.Assert.assertNotNull(bigInteger49);
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray52), "[1]");
        org.junit.Assert.assertTrue("'" + byte53 + "' != '" + (byte) 1 + "'", byte53 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger56);
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray57), "[-1]");
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + (-1L) + "'", long58 == (-1L));
        org.junit.Assert.assertNotNull(bigInteger59);
        org.junit.Assert.assertNotNull(bigInteger60);
        org.junit.Assert.assertNotNull(bigInteger61);
    }

    @Test
    public void test06967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06967");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-zh-CN", "3.01E-50");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test06968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06968");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(52, 16, (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
    }

    @Test
    public void test06969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06969");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("\u30a4\u30bf\u30ea\u30a2\u8a9e     ", (int) (short) 0, 320);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u30a4\u30bf\u30ea\u30a2\u8a9e     " + "'", str3, "\u30a4\u30bf\u30ea\u30a2\u8a9e     ");
    }

    @Test
    public void test06970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06970");
        java.util.Locale locale1 = new java.util.Locale("\uc911\uad6d\uc5b4\uc911\uad6d)");
        java.lang.String str2 = locale1.getVariant();
        org.junit.Assert.assertEquals(locale1.toString(), "\uc911\uad6d\uc5b4\uc911\uad6d)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06971");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("dnu0E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+10E+1");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test06972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06972");
        java.util.Locale locale3 = new java.util.Locale("2#2#2#2#2#2#2#2#2#2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-zh-CN", "en-GB", "Eng                                                                                                                                                                                                                                                                                                          ");
        java.util.Set<java.lang.Character> charSet4 = locale3.getExtensionKeys();
        org.junit.Assert.assertEquals(locale3.toString(), "2#2#2#2#2#2#2#2#2#2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-2-zh-cn_EN-GB_Eng                                                                                                                                                                                                                                                                                                          ");
        org.junit.Assert.assertNotNull(charSet4);
    }

    @Test
    public void test06973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06973");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("united states");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "united states" + "'", str1, "united states");
    }

    @Test
    public void test06974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06974");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal5 = bigDecimal1.subtract(bigDecimal4);
        java.math.BigInteger bigInteger6 = bigDecimal5.toBigInteger();
        double double7 = bigInteger6.doubleValue();
        byte[] byteArray10 = new byte[] { (byte) 1 };
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.min(byteArray10);
        java.math.BigInteger bigInteger12 = new java.math.BigInteger((int) (short) -1, byteArray10);
        java.math.BigInteger bigInteger13 = bigInteger6.gcd(bigInteger12);
        java.math.BigDecimal bigDecimal14 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal15 = bigDecimal14.negate();
        java.math.BigDecimal bigDecimal18 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal19 = bigDecimal15.subtract(bigDecimal18);
        java.math.BigInteger bigInteger20 = bigDecimal19.toBigInteger();
        java.math.BigInteger bigInteger21 = bigInteger12.or(bigInteger20);
        java.math.BigInteger bigInteger23 = bigInteger20.shiftRight((int) (short) -1);
        java.math.BigDecimal bigDecimal24 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal25 = bigDecimal24.negate();
        java.math.BigDecimal bigDecimal28 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal29 = bigDecimal25.subtract(bigDecimal28);
        java.math.BigInteger bigInteger30 = bigDecimal29.toBigInteger();
        double double31 = bigInteger30.doubleValue();
        byte[] byteArray34 = new byte[] { (byte) 1 };
        byte byte35 = org.apache.commons.lang3.math.NumberUtils.min(byteArray34);
        java.math.BigInteger bigInteger36 = new java.math.BigInteger((int) (short) -1, byteArray34);
        java.math.BigInteger bigInteger37 = bigInteger30.gcd(bigInteger36);
        java.math.BigDecimal bigDecimal38 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal39 = bigDecimal38.negate();
        java.math.BigDecimal bigDecimal42 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal43 = bigDecimal39.subtract(bigDecimal42);
        java.math.BigInteger bigInteger44 = bigDecimal43.toBigInteger();
        java.math.BigInteger bigInteger45 = bigInteger36.or(bigInteger44);
        java.math.BigInteger bigInteger47 = bigInteger44.shiftRight((int) (short) -1);
        java.math.BigInteger bigInteger48 = bigInteger23.max(bigInteger44);
        java.math.BigInteger bigInteger50 = bigInteger44.shiftLeft((-1));
        byte[] byteArray53 = new byte[] { (byte) 1 };
        byte byte54 = org.apache.commons.lang3.math.NumberUtils.min(byteArray53);
        java.math.BigInteger bigInteger55 = new java.math.BigInteger((int) (short) -1, byteArray53);
        java.math.BigInteger bigInteger57 = bigInteger55.pow((int) 'a');
        byte[] byteArray58 = bigInteger55.toByteArray();
        long long59 = bigInteger55.longValueExact();
        java.lang.String str61 = bigInteger55.toString(0);
        int int62 = bigInteger55.intValueExact();
        java.math.BigDecimal bigDecimal63 = new java.math.BigDecimal(bigInteger55);
        java.math.BigInteger bigInteger64 = bigInteger50.subtract(bigInteger55);
        java.math.BigInteger bigInteger66 = bigInteger50.shiftRight((int) ' ');
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[1]");
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 1 + "'", byte11 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger13);
        org.junit.Assert.assertNotNull(bigDecimal14);
        org.junit.Assert.assertNotNull(bigDecimal15);
        org.junit.Assert.assertNotNull(bigDecimal18);
        org.junit.Assert.assertNotNull(bigDecimal19);
        org.junit.Assert.assertNotNull(bigInteger20);
        org.junit.Assert.assertNotNull(bigInteger21);
        org.junit.Assert.assertNotNull(bigInteger23);
        org.junit.Assert.assertNotNull(bigDecimal24);
        org.junit.Assert.assertNotNull(bigDecimal25);
        org.junit.Assert.assertNotNull(bigDecimal28);
        org.junit.Assert.assertNotNull(bigDecimal29);
        org.junit.Assert.assertNotNull(bigInteger30);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[1]");
        org.junit.Assert.assertTrue("'" + byte35 + "' != '" + (byte) 1 + "'", byte35 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger37);
        org.junit.Assert.assertNotNull(bigDecimal38);
        org.junit.Assert.assertNotNull(bigDecimal39);
        org.junit.Assert.assertNotNull(bigDecimal42);
        org.junit.Assert.assertNotNull(bigDecimal43);
        org.junit.Assert.assertNotNull(bigInteger44);
        org.junit.Assert.assertNotNull(bigInteger45);
        org.junit.Assert.assertNotNull(bigInteger47);
        org.junit.Assert.assertNotNull(bigInteger48);
        org.junit.Assert.assertNotNull(bigInteger50);
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray53), "[1]");
        org.junit.Assert.assertTrue("'" + byte54 + "' != '" + (byte) 1 + "'", byte54 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger57);
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray58), "[-1]");
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + (-1L) + "'", long59 == (-1L));
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "-1" + "'", str61, "-1");
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertNotNull(bigInteger64);
        org.junit.Assert.assertNotNull(bigInteger66);
    }

    @Test
    public void test06975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06975");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("CAN", "I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!!", 32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06976");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("Eng                                                                                                                                                                                                                                                                                     itEng                                                                                                                                                                                                                                                                                      ", "zh-cn");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06977");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal2 = bigDecimal0.movePointLeft((int) (byte) 0);
        java.lang.String str3 = bigDecimal2.toPlainString();
        byte byte4 = bigDecimal2.byteValueExact();
        java.math.BigDecimal bigDecimal5 = java.math.BigDecimal.ZERO;
        double double6 = bigDecimal5.doubleValue();
        java.math.BigInteger bigInteger7 = bigDecimal5.toBigInteger();
        byte[] byteArray10 = new byte[] { (byte) 1 };
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.min(byteArray10);
        java.math.BigInteger bigInteger12 = new java.math.BigInteger((int) (short) -1, byteArray10);
        java.math.BigInteger bigInteger14 = bigInteger12.pow((int) 'a');
        byte[] byteArray15 = bigInteger12.toByteArray();
        long long16 = bigInteger12.longValueExact();
        java.math.BigInteger bigInteger17 = bigInteger7.or(bigInteger12);
        byte byte18 = bigInteger12.byteValueExact();
        java.math.BigDecimal bigDecimal20 = new java.math.BigDecimal(bigInteger12, (int) (byte) 0);
        java.math.BigDecimal bigDecimal21 = bigDecimal2.multiply(bigDecimal20);
        java.math.BigDecimal bigDecimal22 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal23 = bigDecimal22.negate();
        java.math.BigDecimal bigDecimal24 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal25 = bigDecimal24.negate();
        java.math.BigDecimal bigDecimal26 = bigDecimal24.negate();
        java.lang.String str27 = bigDecimal26.toEngineeringString();
        java.math.BigDecimal bigDecimal28 = bigDecimal23.multiply(bigDecimal26);
        java.math.BigDecimal bigDecimal30 = bigDecimal26.movePointRight(100);
        byte[] byteArray33 = new byte[] { (byte) 1 };
        byte byte34 = org.apache.commons.lang3.math.NumberUtils.min(byteArray33);
        java.math.BigInteger bigInteger35 = new java.math.BigInteger((int) (short) -1, byteArray33);
        java.math.BigInteger bigInteger37 = bigInteger35.pow((int) 'a');
        java.math.BigDecimal bigDecimal39 = new java.math.BigDecimal(bigInteger37, (int) (byte) 0);
        java.util.Locale locale40 = java.util.Locale.PRC;
        java.lang.String str41 = locale40.getISO3Language();
        boolean boolean42 = bigDecimal39.equals((java.lang.Object) str41);
        java.math.BigDecimal bigDecimal45 = bigDecimal26.divide(bigDecimal39, (int) (short) 100, (int) (short) 1);
        java.math.BigDecimal bigDecimal47 = bigDecimal45.movePointLeft(563);
        java.math.MathContext mathContext48 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal49 = bigDecimal20.multiply(bigDecimal47, mathContext48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertNotNull(bigDecimal2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0" + "'", str3, "0");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 0 + "'", byte4 == (byte) 0);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(bigInteger7);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[1]");
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 1 + "'", byte11 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[-1]");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertNotNull(bigInteger17);
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) -1 + "'", byte18 == (byte) -1);
        org.junit.Assert.assertNotNull(bigDecimal21);
        org.junit.Assert.assertNotNull(bigDecimal22);
        org.junit.Assert.assertNotNull(bigDecimal23);
        org.junit.Assert.assertNotNull(bigDecimal24);
        org.junit.Assert.assertNotNull(bigDecimal25);
        org.junit.Assert.assertNotNull(bigDecimal26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "0" + "'", str27, "0");
        org.junit.Assert.assertNotNull(bigDecimal28);
        org.junit.Assert.assertNotNull(bigDecimal30);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[1]");
        org.junit.Assert.assertTrue("'" + byte34 + "' != '" + (byte) 1 + "'", byte34 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger37);
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "zho" + "'", str41, "zho");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(bigDecimal45);
        org.junit.Assert.assertNotNull(bigDecimal47);
    }

    @Test
    public void test06978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06978");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("z-CN");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny("CAN", strArray3);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("english", "fra ", 299);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.endsWithAny("hindi (HI!UUU,Korean (South Korea))", strArray10);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("\u30d5\u30e9\u30f3\u30b9\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd)", strArray3, strArray10);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\u30d5\u30e9\u30f3\u30b9\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd)" + "'", str12, "\u30d5\u30e9\u30f3\u30b9\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd)");
    }

    @Test
    public void test06979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06979");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("AJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJ" + "'", str1, "AJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJ");
    }

    @Test
    public void test06980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06980");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("\u5927\u97d3\u6c11\u56fd", "KORKORKORKORKORKORKORKORKORKORKORK");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06981");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("en-US");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "en-US" + "'", str1, "en-US");
    }

    @Test
    public void test06982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06982");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("englisch", "\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587", (int) 'u');
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test06983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06983");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("zh-cn");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("france", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06984");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("United StatesUnited StatesUnited StatesUnited StatesUnited StatesUnited StatesUnited StatesUnited St", 1, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "United StatesUnited StatesUnited StatesUnited StatesUnited StatesUnited StatesUnited StatesUnited St" + "'", str3, "United StatesUnited StatesUnited StatesUnited StatesUnited StatesUnited StatesUnited StatesUnited St");
    }

    @Test
    public void test06985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06985");
        java.math.MathContext mathContext1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal2 = new java.math.BigDecimal("00", mathContext1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06986");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(7.0f, (float) 100, (float) 11);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test06987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06987");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "kor");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Kor" + "'", str1, "Kor");
    }

    @Test
    public void test06988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06988");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("                                                         dnu                                                         ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "dnu" + "'", str1, "dnu");
    }

    @Test
    public void test06989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06989");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        double double1 = bigDecimal0.doubleValue();
        java.math.BigDecimal bigDecimal3 = bigDecimal0.movePointLeft((int) (byte) -1);
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal5 = bigDecimal4.negate();
        java.math.BigDecimal bigDecimal6 = bigDecimal4.negate();
        java.lang.String str7 = bigDecimal4.toString();
        java.math.BigDecimal bigDecimal9 = bigDecimal4.scaleByPowerOfTen(0);
        java.math.BigDecimal bigDecimal10 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal11 = bigDecimal10.negate();
        java.math.BigDecimal bigDecimal12 = java.math.BigDecimal.TEN;
        long long13 = bigDecimal12.longValueExact();
        java.math.BigDecimal bigDecimal14 = bigDecimal12.ulp();
        java.lang.String str15 = bigDecimal12.toString();
        int int16 = bigDecimal10.compareTo(bigDecimal12);
        java.math.BigDecimal bigDecimal18 = java.math.BigDecimal.valueOf((long) (byte) 100);
        java.math.BigDecimal bigDecimal20 = bigDecimal12.divide(bigDecimal18, (int) (short) 1);
        java.math.BigDecimal bigDecimal21 = java.math.BigDecimal.TEN;
        long long22 = bigDecimal21.longValueExact();
        java.math.BigDecimal bigDecimal23 = bigDecimal20.max(bigDecimal21);
        java.math.BigDecimal bigDecimal24 = bigDecimal4.add(bigDecimal20);
        java.math.BigDecimal bigDecimal25 = bigDecimal0.multiply(bigDecimal4);
        java.math.BigDecimal bigDecimal26 = bigDecimal25.ulp();
        double double27 = bigDecimal25.doubleValue();
        int int28 = bigDecimal25.signum();
        java.math.BigDecimal bigDecimal30 = java.math.BigDecimal.valueOf((long) (byte) 0);
        java.math.BigDecimal bigDecimal31 = bigDecimal30.stripTrailingZeros();
        int int32 = bigDecimal31.precision();
        java.lang.String str33 = bigDecimal31.toPlainString();
        java.math.BigDecimal bigDecimal36 = java.math.BigDecimal.valueOf((-1L), 7);
        java.math.BigDecimal bigDecimal37 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal38 = bigDecimal37.negate();
        java.math.BigDecimal bigDecimal39 = bigDecimal37.negate();
        java.lang.String str40 = bigDecimal37.toString();
        java.math.BigDecimal bigDecimal42 = new java.math.BigDecimal((double) 1L);
        java.lang.Object[] objArray45 = new java.lang.Object[] { (short) 10, (short) 100 };
        java.lang.String str49 = org.apache.commons.lang3.StringUtils.join(objArray45, "hi!", (int) (byte) 100, (int) (short) -1);
        boolean boolean50 = bigDecimal42.equals((java.lang.Object) (short) -1);
        java.math.BigDecimal bigDecimal51 = bigDecimal37.max(bigDecimal42);
        int int52 = bigDecimal36.compareTo(bigDecimal51);
        java.math.BigDecimal bigDecimal53 = bigDecimal51.negate();
        java.math.BigDecimal bigDecimal54 = bigDecimal31.min(bigDecimal51);
        java.math.RoundingMode roundingMode55 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal56 = bigDecimal25.divide(bigDecimal31, roundingMode55);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(bigDecimal3);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigDecimal6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0" + "'", str7, "0");
        org.junit.Assert.assertNotNull(bigDecimal9);
        org.junit.Assert.assertNotNull(bigDecimal10);
        org.junit.Assert.assertNotNull(bigDecimal11);
        org.junit.Assert.assertNotNull(bigDecimal12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10" + "'", str15, "10");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(bigDecimal18);
        org.junit.Assert.assertNotNull(bigDecimal20);
        org.junit.Assert.assertNotNull(bigDecimal21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 10L + "'", long22 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal23);
        org.junit.Assert.assertNotNull(bigDecimal24);
        org.junit.Assert.assertNotNull(bigDecimal25);
        org.junit.Assert.assertNotNull(bigDecimal26);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(bigDecimal30);
        org.junit.Assert.assertNotNull(bigDecimal31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "0" + "'", str33, "0");
        org.junit.Assert.assertNotNull(bigDecimal36);
        org.junit.Assert.assertNotNull(bigDecimal37);
        org.junit.Assert.assertNotNull(bigDecimal38);
        org.junit.Assert.assertNotNull(bigDecimal39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "0" + "'", str40, "0");
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray45), "[10, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray45), "[10, 100]");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(bigDecimal51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNotNull(bigDecimal53);
        org.junit.Assert.assertNotNull(bigDecimal54);
    }

    @Test
    public void test06990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06990");
        java.math.BigDecimal bigDecimal1 = java.math.BigDecimal.valueOf((-2.0d));
        short short2 = bigDecimal1.shortValueExact();
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih", "");
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Vereinigtes K\366nigreich", "");
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEach("\u65e5\u672c\u8a9e", strArray7, strArray10);
        java.lang.String[] strArray16 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "FR", (int) (short) 1);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.startsWithAny("#", strArray16);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.replaceEach("United States", strArray7, strArray16);
        boolean boolean19 = bigDecimal1.equals((java.lang.Object) "United States");
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -2 + "'", short2 == (short) -2);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\u65e5\u672c\u8a9e" + "'", str11, "\u65e5\u672c\u8a9e");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "United States" + "'", str18, "United States");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test06991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06991");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("\u4e2d\u56fd\u8a9eaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (int) 'u', '4');
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u4e2d\u56fd\u8a9eaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "\u4e2d\u56fd\u8a9eaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test06992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06992");
        java.math.BigDecimal bigDecimal1 = java.math.BigDecimal.valueOf((double) 10L);
        java.math.BigDecimal bigDecimal3 = bigDecimal1.movePointLeft(33);
        java.math.BigDecimal bigDecimal5 = bigDecimal3.pow(35);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = bigDecimal3.intValueExact();
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Rounding necessary");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal3);
        org.junit.Assert.assertNotNull(bigDecimal5);
    }

    @Test
    public void test06993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06993");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("\u11af\u1175\u110b\u11a8\u1169\u1103\u1165\u110b\u11af\u1175\u110b\u11a8\u1169\u1103\u6587\u4e2d");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u11af\u1175\u110b\u11a8\u1169\u1103\u1165\u110b\u11af\u1175\u110b\u11a8\u1169\u1103\u6587\u4e2d" + "'", str1, "\u11af\u1175\u110b\u11a8\u1169\u1103\u1165\u110b\u11af\u1175\u110b\u11a8\u1169\u1103\u6587\u4e2d");
    }

    @Test
    public void test06994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06994");
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal(120);
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.valueOf((long) (byte) -1, 0);
        java.math.BigDecimal bigDecimal5 = bigDecimal4.plus();
        java.math.BigDecimal bigDecimal6 = bigDecimal1.multiply(bigDecimal5);
        java.math.BigDecimal bigDecimal7 = java.math.BigDecimal.TEN;
        long long8 = bigDecimal7.longValueExact();
        java.math.BigDecimal bigDecimal9 = bigDecimal7.ulp();
        java.lang.String str10 = bigDecimal7.toString();
        java.math.BigDecimal bigDecimal11 = java.math.BigDecimal.TEN;
        long long12 = bigDecimal11.longValueExact();
        java.math.BigDecimal bigDecimal13 = java.math.BigDecimal.ZERO;
        double double14 = bigDecimal13.doubleValue();
        java.math.BigDecimal bigDecimal16 = bigDecimal13.movePointLeft((int) (byte) -1);
        int int17 = bigDecimal16.intValue();
        java.math.BigDecimal bigDecimal18 = bigDecimal11.add(bigDecimal16);
        java.math.BigDecimal bigDecimal19 = bigDecimal7.add(bigDecimal18);
        java.math.BigDecimal bigDecimal21 = bigDecimal19.pow((int) '#');
        int int22 = bigDecimal1.compareTo(bigDecimal19);
        java.math.BigDecimal bigDecimal24 = bigDecimal19.setScale(9);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigDecimal6);
        org.junit.Assert.assertNotNull(bigDecimal7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10" + "'", str10, "10");
        org.junit.Assert.assertNotNull(bigDecimal11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertNotNull(bigDecimal13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(bigDecimal16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(bigDecimal18);
        org.junit.Assert.assertNotNull(bigDecimal19);
        org.junit.Assert.assertNotNull(bigDecimal21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(bigDecimal24);
    }

    @Test
    public void test06995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06995");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("engCN", "hi", (int) (short) 10);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("1.00E-98", "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEach("CN", strArray5, strArray8);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, 'u', (int) (byte) 1, 1);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.concatWith("0.00000000000000000000000000000000SETATS DETINU", (java.lang.Object[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "CN" + "'", str9, "CN");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "engCN" + "'", str14, "engCN");
    }

    @Test
    public void test06996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06996");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.min(byteArray1);
        java.math.BigInteger bigInteger3 = new java.math.BigInteger(byteArray1);
        int int4 = bigInteger3.signum();
        java.math.BigDecimal bigDecimal6 = new java.math.BigDecimal(bigInteger3, 300);
        byte[] byteArray9 = new byte[] { (byte) 1 };
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.min(byteArray9);
        java.math.BigInteger bigInteger11 = new java.math.BigInteger((int) (short) -1, byteArray9);
        java.math.BigInteger bigInteger13 = bigInteger11.pow((int) 'a');
        java.math.BigInteger bigInteger15 = bigInteger11.shiftLeft((int) (short) 1);
        int int16 = bigInteger15.intValueExact();
        java.math.BigInteger bigInteger17 = bigInteger15.abs();
        java.math.BigDecimal bigDecimal18 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal19 = bigDecimal18.negate();
        java.math.BigDecimal bigDecimal22 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal23 = bigDecimal19.subtract(bigDecimal22);
        java.math.BigInteger bigInteger24 = bigDecimal23.toBigInteger();
        byte[] byteArray25 = bigInteger24.toByteArray();
        java.math.BigDecimal bigDecimal26 = new java.math.BigDecimal(bigInteger24);
        byte[] byteArray29 = new byte[] { (byte) 1 };
        byte byte30 = org.apache.commons.lang3.math.NumberUtils.min(byteArray29);
        java.math.BigInteger bigInteger31 = new java.math.BigInteger((int) (short) -1, byteArray29);
        java.math.BigInteger bigInteger33 = bigInteger31.pow((int) 'a');
        java.math.BigInteger bigInteger35 = bigInteger31.shiftLeft((int) (short) 1);
        int int36 = bigInteger35.intValueExact();
        java.math.BigInteger bigInteger37 = bigInteger35.abs();
        java.math.BigInteger bigInteger38 = bigInteger24.min(bigInteger35);
        java.math.BigInteger bigInteger39 = bigInteger15.xor(bigInteger35);
        java.math.BigInteger bigInteger40 = bigInteger3.max(bigInteger39);
        byte byte41 = bigInteger40.byteValue();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[1]");
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2 == (byte) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[1]");
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 1 + "'", byte10 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger13);
        org.junit.Assert.assertNotNull(bigInteger15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-2) + "'", int16 == (-2));
        org.junit.Assert.assertNotNull(bigInteger17);
        org.junit.Assert.assertNotNull(bigDecimal18);
        org.junit.Assert.assertNotNull(bigDecimal19);
        org.junit.Assert.assertNotNull(bigDecimal22);
        org.junit.Assert.assertNotNull(bigDecimal23);
        org.junit.Assert.assertNotNull(bigInteger24);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[0]");
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[1]");
        org.junit.Assert.assertTrue("'" + byte30 + "' != '" + (byte) 1 + "'", byte30 == (byte) 1);
        org.junit.Assert.assertNotNull(bigInteger33);
        org.junit.Assert.assertNotNull(bigInteger35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-2) + "'", int36 == (-2));
        org.junit.Assert.assertNotNull(bigInteger37);
        org.junit.Assert.assertNotNull(bigInteger38);
        org.junit.Assert.assertNotNull(bigInteger39);
        org.junit.Assert.assertNotNull(bigInteger40);
        org.junit.Assert.assertTrue("'" + byte41 + "' != '" + (byte) 1 + "'", byte41 == (byte) 1);
    }

    @Test
    public void test06997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06997");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal("                                                                                                                                                                                                                                                                                                           ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06998");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih" + "'", str1, "ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih");
    }

    @Test
    public void test06999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06999");
        char[] charArray9 = new char[] { 'x', '#', '4', ' ', 'a' };
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "Chinese", charArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "\ub3c5\uc77c\uc5b4\ub3c5\uc77c\ub3c5\uc77c\uc5b4\ub3c5\uc77c\ub3c5\uc77c\uc5b4\ub3c5\uc77c)hiengCN", charArray9);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\u65e5\u672c\u8a9e", charArray9);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "ita", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "x#4 a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "x#4 a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[x, #, 4,  , a]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test07000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test07000");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        java.util.List<java.lang.String> strList9 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList7);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList1, ' ');
        java.util.Locale.LanguageRange[] languageRangeArray12 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList13 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList13, languageRangeArray12);
        java.lang.String[] strArray16 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList17 = new java.util.ArrayList<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList17, strArray16);
        java.lang.String str19 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList13, (java.util.Collection<java.lang.String>) strList17);
        java.util.Locale.FilteringMode filteringMode20 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList21 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList17, filteringMode20);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap22 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList23 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap22);
        java.lang.String str25 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList23, '#');
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(languageRangeArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + filteringMode20 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode20.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(languageRangeList23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }
}
