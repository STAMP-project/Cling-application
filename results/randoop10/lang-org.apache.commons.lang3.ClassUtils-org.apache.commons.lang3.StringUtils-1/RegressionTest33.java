import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest33 {

    public static boolean debug = false;

    @Test
    public void test16501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16501");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale2 = java.util.Locale.FRANCE;
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale2);
        java.util.Locale.setDefault(locale2);
        java.util.Locale.Builder builder5 = builder0.setLocale(locale2);
        java.util.Locale locale6 = builder5.build();
        java.util.Locale.Builder builder8 = builder5.removeUnicodeLocaleAttribute("ANIH");
        java.util.Locale.Builder builder11 = builder5.setExtension('x', "liIlish");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder13 = builder11.removeUnicodeLocaleAttribute("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$xxxxxxxxinglese (Canada)xxxxxxxx$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$xxxxxxxxinglese (Canada)xxxxxxxx$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "english" + "'", str3, "english");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test16502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16502");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("undaaaaaaaHcHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAundaaaaaaaHcHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAundaaaaaaaHcHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAundaaaaaaaHcHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAundaaaaaaaHcHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAundaaaaaaaHcHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAundaaaaaaaHcHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAundaaaaaaaHcHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAundaaaaaaaHcHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAundaaaaaaaHcHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAundaaaaaaaHcHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAundaaaaaaaHcHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAundaaaaaaaHcHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAundaaaaaaaHcHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAundaaaaaaaHcHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAundaaaaaaaHcHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAundaaaaaaaHcHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAundaaaaaaaH", "...       ", 32);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test16503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16503");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("\u4e2d\u6587\u53f0\u6e7e\u5730\u533aengliilish)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u4e2d\u6587\u53f0\u6e7e\u5730\u533aENGLIILISH)" + "'", str1, "\u4e2d\u6587\u53f0\u6e7e\u5730\u533aENGLIILISH)");
    }

    @Test
    public void test16504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16504");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("ZHCINESESuEn");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ZHCINESESuEn" + "'", str1, "ZHCINESESuEn");
    }

    @Test
    public void test16505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16505");
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
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap45 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList46 = java.util.Locale.LanguageRange.parse("it", strMap45);
        languageRangeList46.clear();
        boolean boolean48 = languageRangeList1.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList46);
        java.util.Locale.LanguageRange[] languageRangeArray49 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList50 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList50, languageRangeArray49);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap52 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList53 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList50, strMap52);
        boolean boolean54 = languageRangeList46.containsAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList53);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap55 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList56 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList53, strMap55);
        boolean boolean57 = languageRangeList56.isEmpty();
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
        org.junit.Assert.assertEquals(locale16.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Chine" + "'", str17, "Chine");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "zh-CN" + "'", str18, "zh-CN");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Chine" + "'", str21, "Chine");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Chine" + "'", str24, "Chine");
        org.junit.Assert.assertEquals(locale28.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Chine" + "'", str31, "Chine");
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
        org.junit.Assert.assertNotNull(languageRangeList46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(languageRangeArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(languageRangeList53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(languageRangeList56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
    }

    @Test
    public void test16506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16506");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "rench(France");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test16507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16507");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("java.lang", "$");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.concatWith("char[]", (java.lang.Object[]) strArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.concatWith("cinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecines", (java.lang.Object[]) strArray4);
        java.lang.String str9 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) strArray4, "$$$$$$$$$$$$$xxxxxxxxinglese (canada)xxxxxxxx$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang" + "'", str5, "java.lang");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang" + "'", str6, "java.lang");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "java.lang" + "'", str7, "java.lang");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "java.lang" + "'", str9, "java.lang");
    }

    @Test
    public void test16508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16508");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("nwtsnwtlgne", "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii", 94);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test16509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16509");
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
        java.util.Locale.LanguageRange languageRange13 = languageRangeItor12.next();
        java.util.Locale locale15 = java.util.Locale.forLanguageTag("hI");
        java.lang.String str16 = locale15.getVariant();
        java.util.Locale locale17 = locale15.stripExtensions();
        boolean boolean18 = languageRange13.equals((java.lang.Object) locale15);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(languageRangeList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(languageRangeItor12);
        org.junit.Assert.assertNotNull(languageRange13);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "hi");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "hi");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test16510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16510");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("englishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglish", 98);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "englishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglish" + "'", str2, "englishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglish");
    }

    @Test
    public void test16511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16511");
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
        boolean boolean24 = languageRangeList11.remove((java.lang.Object) "A");
        boolean boolean26 = languageRangeList11.equals((java.lang.Object) "ENG");
        java.lang.Object[] objArray27 = languageRangeList11.toArray();
        java.lang.Class<?> wildcardClass28 = languageRangeList11.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test16512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16512");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("                                           CINACI                                            ", "N...", 83);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test16513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16513");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("rance)Italiuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "esecnarf");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "rance)Italiuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str2, "rance)Italiuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test16514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16514");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("zho", "");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("#########################English", strArray3);
        java.lang.Class<?> wildcardClass5 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test16515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16515");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("hi");
        java.lang.Object[] objArray2 = languageRangeList1.toArray();
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.parse("hi");
        java.lang.Object[] objArray5 = languageRangeList4.toArray();
        java.util.Spliterator<java.util.Locale.LanguageRange> languageRangeSpliterator6 = languageRangeList4.spliterator();
        boolean boolean7 = languageRangeList1.containsAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList4);
        java.util.Iterator<java.util.Locale.LanguageRange> languageRangeItor8 = languageRangeList1.iterator();
        java.util.Locale.Builder builder9 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder10 = builder9.clearExtensions();
        java.util.Locale.Builder builder12 = builder10.setLanguageTag("zh-CN");
        java.util.Locale.Builder builder14 = builder12.setLanguage("it");
        boolean boolean15 = languageRangeList1.remove((java.lang.Object) builder14);
        java.util.Locale.Builder builder17 = builder14.setLanguageTag("CINESE");
        java.util.Locale locale19 = java.util.Locale.forLanguageTag("HI");
        java.util.Locale.Builder builder20 = builder14.setLocale(locale19);
        java.util.Locale.Builder builder22 = builder14.setLanguage("");
        java.util.Locale.Builder builder23 = builder22.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder25 = builder23.setLanguageTag("ShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShort");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: ShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShort [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(languageRangeSpliterator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(languageRangeItor8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "hi");
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder23);
    }

    @Test
    public void test16516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16516");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUAN       A", "redliub");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test16517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16517");
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
        java.util.Locale.LanguageRange languageRange14 = languageRangeList7.get(0);
        java.lang.String str15 = languageRange14.getRange();
        double double16 = languageRange14.getWeight();
        double double17 = languageRange14.getWeight();
        java.lang.String str19 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) double17, "esecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinese");
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(languageRangeList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(languageRangeItor12);
        org.junit.Assert.assertNotNull(languageRange14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi" + "'", str15, "hi");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "java.lang" + "'", str19, "java.lang");
    }

    @Test
    public void test16518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16518");
        java.util.Locale locale3 = new java.util.Locale("chinaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                                redliuB                                   ", "#####it_CN");
        org.junit.Assert.assertEquals(locale3.toString(), "chinaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa_                                REDLIUB                                   _#####it_CN");
    }

    @Test
    public void test16519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16519");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("it", strMap1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList2, '#');
        java.util.Locale.LanguageRange[] languageRangeArray5 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList6 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList6, languageRangeArray5);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap8 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList9 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList6, strMap8);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor10 = languageRangeList9.listIterator();
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        java.util.Locale.LanguageRange[] languageRangeArray15 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList16 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList16, languageRangeArray15);
        java.util.Locale locale19 = java.util.Locale.FRANCE;
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale19);
        java.util.Locale locale21 = java.util.Locale.US;
        java.util.Locale locale22 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale23 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale24 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale25 = java.util.Locale.getDefault();
        java.lang.String str26 = locale24.getDisplayCountry(locale25);
        java.lang.String str27 = locale24.toLanguageTag();
        java.util.Locale locale28 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale29 = java.util.Locale.getDefault();
        java.lang.String str30 = locale28.getDisplayCountry(locale29);
        java.util.Locale locale31 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale32 = java.util.Locale.getDefault();
        java.lang.String str33 = locale31.getDisplayCountry(locale32);
        java.util.Locale locale37 = new java.util.Locale("hi", "hi!", "cHINA");
        java.util.Locale locale38 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale39 = java.util.Locale.getDefault();
        java.lang.String str40 = locale38.getDisplayCountry(locale39);
        java.util.Locale locale42 = new java.util.Locale("");
        java.lang.String str43 = locale42.getDisplayVariant();
        java.util.Locale locale44 = java.util.Locale.KOREAN;
        java.util.Locale locale46 = new java.util.Locale("");
        java.util.Locale locale47 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale[] localeArray48 = new java.util.Locale[] { locale19, locale21, locale22, locale23, locale24, locale29, locale31, locale37, locale39, locale42, locale44, locale46, locale47 };
        java.util.ArrayList<java.util.Locale> localeList49 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList49, localeArray48);
        java.util.List<java.util.Locale> localeList51 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList16, (java.util.Collection<java.util.Locale>) localeList49);
        java.lang.String[] strArray59 = new java.lang.String[] { "English", "hi", "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "", "a", "", "China" };
        java.util.ArrayList<java.lang.String> strList60 = new java.util.ArrayList<java.lang.String>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList60, strArray59);
        java.util.List<java.lang.Class<?>> wildcardClassList62 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList60);
        java.util.Locale.FilteringMode filteringMode63 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList64 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList16, (java.util.Collection<java.lang.String>) strList60, filteringMode63);
        java.util.List<java.lang.String> strList65 = java.util.Locale.filterTags(languageRangeList9, (java.util.Collection<java.lang.String>) strList13, filteringMode63);
        java.util.Locale.LanguageRange[] languageRangeArray66 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList67 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList67, languageRangeArray66);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap69 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList70 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList67, strMap69);
        int int71 = languageRangeList67.size();
        boolean boolean72 = languageRangeList9.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList67);
        boolean boolean73 = languageRangeList2.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList67);
        java.util.Iterator<java.util.Locale.LanguageRange> languageRangeItor74 = languageRangeList2.iterator();
        java.lang.String str76 = org.apache.commons.lang3.StringUtils.join(languageRangeItor74, '#');
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(languageRangeList9);
        org.junit.Assert.assertNotNull(languageRangeItor10);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(languageRangeArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "english" + "'", str20, "english");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Chine" + "'", str26, "Chine");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "zh-CN" + "'", str27, "zh-CN");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Chine" + "'", str30, "Chine");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Chine" + "'", str33, "Chine");
        org.junit.Assert.assertEquals(locale37.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Chine" + "'", str40, "Chine");
        org.junit.Assert.assertEquals(locale42.toString(), "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "ko");
        org.junit.Assert.assertEquals(locale46.toString(), "");
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(localeList51);
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(wildcardClassList62);
        org.junit.Assert.assertTrue("'" + filteringMode63 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode63.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList64);
        org.junit.Assert.assertNotNull(strList65);
        org.junit.Assert.assertNotNull(languageRangeArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(languageRangeList70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(languageRangeItor74);
    }

    @Test
    public void test16520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16520");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("oL");
        java.lang.String str2 = languageRange1.getRange();
        java.lang.String str3 = languageRange1.getRange();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ol" + "'", str2, "ol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ol" + "'", str3, "ol");
    }

    @Test
    public void test16521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16521");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("undaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "undaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaH" + "'", str1, "undaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaH");
    }

    @Test
    public void test16522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16522");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("                                                                                                              hI   Taiwan                  hI   xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx                                                                                            ", "anih", 52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test16523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16523");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("English", "hi", (int) (short) -1);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, "zho", (int) 'u', (int) (short) 0);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray5);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.stripAll(strArray10);
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("Locale.Builder", "zhcines############################");
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("XXXXXXXXXXFRENCH(FRANCE)XXXXXXXXXX", strArray10, strArray14);
        java.lang.String[] strArray18 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                                    ", "A");
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray18);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray18, "...e.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugernge...");
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("OCLE.LGUGERGE", strArray14, strArray18);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "XXXXXXXXXXFRENCH(FRANCE)XXXXXXXXXX" + "'", str15, "XXXXXXXXXXFRENCH(FRANCE)XXXXXXXXXX");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "                                                                                                    " + "'", str19, "                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "                                                                                                    " + "'", str21, "                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "OCLE.LGUGERGE" + "'", str22, "OCLE.LGUGERGE");
    }

    @Test
    public void test16524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16524");
        java.util.Locale locale4 = new java.util.Locale("", "ITALIAHi", "zh-CNenglis");
        java.util.Locale.Builder builder5 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        java.util.Locale locale7 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale.Builder builder8 = builder6.setLocale(locale7);
        java.util.Locale locale9 = builder8.build();
        java.util.Locale locale13 = new java.util.Locale("");
        java.util.Set<java.lang.String> strSet14 = locale13.getUnicodeLocaleKeys();
        boolean boolean15 = locale13.hasExtensions();
        java.lang.String str16 = locale13.getVariant();
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.upperCase("String", locale13);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.lowerCase("chinChinChinChinChiChinChinChinChinC", locale13);
        java.util.Set<java.lang.String> strSet19 = locale13.getUnicodeLocaleAttributes();
        java.lang.String str20 = locale9.getDisplayName(locale13);
        java.lang.String str21 = locale9.getLanguage();
        java.util.Locale locale23 = java.util.Locale.forLanguageTag("CN");
        java.util.Locale locale24 = java.util.Locale.CANADA;
        boolean boolean25 = locale24.hasExtensions();
        java.util.Locale locale26 = java.util.Locale.ITALIAN;
        java.lang.String str27 = locale24.getDisplayScript(locale26);
        java.lang.String str28 = locale23.getDisplayCountry(locale24);
        java.lang.String str29 = locale24.getDisplayScript();
        java.lang.String str30 = locale9.getDisplayLanguage(locale24);
        java.lang.String str31 = locale4.getDisplayVariant(locale24);
        java.lang.String str32 = org.apache.commons.lang3.StringUtils.lowerCase("", locale4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str33 = locale4.getISO3Country();
            org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException; message: Couldn't find 3-letter country code for ITALIAHI");
        } catch (java.util.MissingResourceException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale4.toString(), "_ITALIAHI_zh-CNenglis");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zh_CN");
        org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "STRING" + "'", str17, "STRING");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "chinchinchinchinchichinchinchinchinc" + "'", str18, "chinchinchinchinchichinchinchinchinc");
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Chinese (China)" + "'", str20, "Chinese (China)");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "zh" + "'", str21, "zh");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "cn");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "it");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Chinese" + "'", str30, "Chinese");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "zh-CNenglis" + "'", str31, "zh-CNenglis");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test16525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16525");
        java.util.Locale locale1 = java.util.Locale.US;
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("Locale.Builder", locale1);
        java.lang.String str3 = locale1.getDisplayVariant();
        java.lang.Class<?> wildcardClass4 = locale1.getClass();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LOCALE.BUILDER" + "'", str2, "LOCALE.BUILDER");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test16526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16526");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxaniCxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxaniCxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxaniCxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxaniCxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxaniC", 0, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxaniCxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxaniCxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxaniCxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxaniCxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxaniC" + "'", str3, "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxaniCxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxaniCxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxaniCxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxaniCxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxaniC");
    }

    @Test
    public void test16527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16527");
        char[] charArray9 = new char[] {};
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "zh-CN", charArray9);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "English", charArray9);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "engliIlish", charArray9);
        java.lang.String str15 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) charArray9, "EnglTWNsTWN");
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "inglese", charArray9);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny("\u4e2d\u6587\u53f0\u7063)", charArray9);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny("\u4e2d\u6587\u53f0\u7063)", charArray9);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "zh_ZH", charArray9);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "An", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "char[]" + "'", str15, "char[]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test16528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16528");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fduuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "                 a                  ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test16529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16529");
        char[] charArray10 = new char[] {};
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "zh-CN", charArray10);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "a", charArray10);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "  China   ", charArray10);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "zh_CN", charArray10);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "AD.AE.AF.AGchnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.AT.AU.AW.AX.AZ.BA.BB.BD.BE.BF.BG.BH.BI.BJ.BL.BM.BN.BO.BQ.BR.BS.BT.BV.BW.BY.BZ.CA.CC.CD.CF.CG.CH.CI.CK.CL.CM.CN.CO.CR.CU.CV.CW.CX.CY.CZ.DE.DJ.DK.DM.DO.DZ.EC.EE.EG.EH.ER.ES.ET.FI.FJ.FK.FM.FO.FR.GA.GB.GD.GE.GF.GG.GH.GI.GL.GM.GN.GP.GQ.GR.GS.GT.GU.GW.GY.HK.HM.HN.HR.HT.HU.ID.IE.IL.IM.IN.IO.IQ.IR.IS.IT.JE.JM.JO.JP.KE.KG.KH.KI.KM.KN.KP.KR.KW.KY.KZ.LA.LB.LC.LI.LK.LR.LS.LT.LU.LV.LY.MA.MC.MD.ME.MF.MG.MH.MK.ML.MM.MN.MO.MP.MQ.MR.MS.MT.MU.MV.MW.MX.MY.MZ.NA.NC.NE.NF.NG.NI.NL.NO.NP.NR.NU.NZ.OM.PA.PE.PF.PG.PH.PK.PL.PM.PN.PR.PS.PT.PW.PY.QA.RE.RO.RS.RU.RW.SA.SB.SC.SD.SE.SG.SH.SI.SJ.SK.SL.SM.SN.SO.SR.SS.ST.SV.SX.SY.SZ.TC.TD.TF.TG.TH.TJ.TK.TL.TM.TN.TO.TR.TT.TV.TW.TZ.UA.UG.UM.US.UY.UZ.VA.VC.VE.VG.VI.VN.VU.WF.WS.YE.YT.ZA.ZM.ZW", charArray10);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "HindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindi", charArray10);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "und", charArray10);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "Collections.EmptySetitaCollections.EmptySetitaCollections.EmptySetitaCollections.EmptySet", charArray10);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "unduhar[]undu", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test16530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16530");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("CINA................................................................................................", "en_CA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "INA................................................................................................" + "'", str2, "INA................................................................................................");
    }

    @Test
    public void test16531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16531");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("zhcinesese$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$", "                                              italiahi                                              ", 83);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test16532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16532");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$Englisch (Kanada)$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$", "inglese (canada)_FR_FR_$");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 33 + "'", int2 == 33);
    }

    @Test
    public void test16533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16533");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.lang.Class<?>[] wildcardClassArray3 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray1);
        java.lang.Class<?>[] wildcardClassArray4 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray1);
        java.lang.Class<?>[] wildcardClassArray5 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray1);
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray5, ' ');
        java.lang.Class<?>[] wildcardClassArray9 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray5);
        java.lang.Class<?>[] wildcardClassArray10 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray5);
        java.lang.Class<?>[] wildcardClassArray11 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray10);
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
        java.lang.Class<?>[] wildcardClassArray24 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray15);
        java.lang.Class<?>[] wildcardClassArray25 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray24);
        java.lang.Class<?>[] wildcardClassArray26 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray24);
        java.lang.String str28 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray24, '#');
        java.lang.Class<?>[] wildcardClassArray29 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray24);
        boolean boolean30 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray10, wildcardClassArray24);
        java.lang.String[] strArray33 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens(".", "HI");
        java.lang.Class<?>[] wildcardClassArray34 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray33);
        java.lang.Class<?>[] wildcardClassArray35 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray34);
        java.lang.Class[] classArray37 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray38 = (java.lang.Class<?>[]) classArray37;
        java.lang.Class<?>[] wildcardClassArray39 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray37);
        java.lang.Class<?>[] wildcardClassArray40 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray37);
        java.lang.Class<?>[] wildcardClassArray41 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray37);
        java.lang.Class<?>[] wildcardClassArray42 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray41);
        java.lang.Class[] classArray44 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray45 = (java.lang.Class<?>[]) classArray44;
        java.lang.Class<?>[] wildcardClassArray46 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray44);
        java.lang.Class<?>[] wildcardClassArray47 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray44);
        java.lang.String str49 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) wildcardClassArray47, "Chinaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        java.lang.String str50 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray47);
        boolean boolean51 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray42, wildcardClassArray47);
        java.lang.Class[] classArray53 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray54 = (java.lang.Class<?>[]) classArray53;
        java.lang.Class<?>[] wildcardClassArray55 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray53);
        java.lang.Class<?>[] wildcardClassArray56 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray53);
        java.lang.Class<?>[] wildcardClassArray57 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray53);
        boolean boolean58 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray47, (java.lang.Class<?>[]) classArray53);
        java.lang.Class<?>[] wildcardClassArray59 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray47);
        java.lang.Class<?>[] wildcardClassArray60 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray47);
        boolean boolean62 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray34, wildcardClassArray60, false);
        boolean boolean63 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray24, wildcardClassArray34);
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertNotNull(wildcardClassArray4);
        org.junit.Assert.assertNotNull(wildcardClassArray5);
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClassArray9);
        org.junit.Assert.assertNotNull(wildcardClassArray10);
        org.junit.Assert.assertNotNull(wildcardClassArray11);
        org.junit.Assert.assertNotNull(classArray13);
        org.junit.Assert.assertNotNull(wildcardClassArray14);
        org.junit.Assert.assertNotNull(wildcardClassArray15);
        org.junit.Assert.assertNotNull(classArray18);
        org.junit.Assert.assertNotNull(wildcardClassArray19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray24);
        org.junit.Assert.assertNotNull(wildcardClassArray25);
        org.junit.Assert.assertNotNull(wildcardClassArray26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(wildcardClassArray29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(wildcardClassArray34);
        org.junit.Assert.assertNotNull(wildcardClassArray35);
        org.junit.Assert.assertNotNull(classArray37);
        org.junit.Assert.assertNotNull(wildcardClassArray38);
        org.junit.Assert.assertNotNull(wildcardClassArray39);
        org.junit.Assert.assertNotNull(wildcardClassArray40);
        org.junit.Assert.assertNotNull(wildcardClassArray41);
        org.junit.Assert.assertNotNull(wildcardClassArray42);
        org.junit.Assert.assertNotNull(classArray44);
        org.junit.Assert.assertNotNull(wildcardClassArray45);
        org.junit.Assert.assertNotNull(wildcardClassArray46);
        org.junit.Assert.assertNotNull(wildcardClassArray47);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "java.lang" + "'", str49, "java.lang");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(classArray53);
        org.junit.Assert.assertNotNull(wildcardClassArray54);
        org.junit.Assert.assertNotNull(wildcardClassArray55);
        org.junit.Assert.assertNotNull(wildcardClassArray56);
        org.junit.Assert.assertNotNull(wildcardClassArray57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray59);
        org.junit.Assert.assertNotNull(wildcardClassArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    public void test16534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16534");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "                                ese (Taiwanese (Taiwanese (Taiwanese (Taiwanese (Taiwanese (Taiwanese (Taiwanese (Taiwan");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test16535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16535");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("CHINOIS (CHINE)444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "nwtsnwtlgne");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nwtsnwtlgne" + "'", str2, "nwtsnwtlgne");
    }

    @Test
    public void test16536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16536");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("", 52, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16537");
        java.lang.String[] strArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("english (United States)", strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test16538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16538");
        char[] charArray9 = new char[] { '#', '#', ' ' };
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny("", charArray9);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "arraylist###########", charArray9);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "eSESENICHZ....", charArray9);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "cnncnncnnlocale.Buildercnncnncnnc", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "## ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "## ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[#, #,  ]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test16539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16539");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("AD.AE.AF", "Hindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindi");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test16540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16540");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("Japa", 0, (int) '.');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Japa" + "'", str3, "Japa");
    }

    @Test
    public void test16541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16541");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("TWN", 47);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "TWN                                            " + "'", str2, "TWN                                            ");
    }

    @Test
    public void test16542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16542");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("string[]", (int) (byte) 1, 99);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test16543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16543");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("              javacinese.cineselang", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=javacinese.cineselang");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16544");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("rg  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "rg" + "'", str1, "rg");
    }

    @Test
    public void test16545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16545");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "Engls");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Engls" + "'", str1, "Engls");
    }

    @Test
    public void test16546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16546");
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
        java.util.Spliterator<java.util.Locale.LanguageRange> languageRangeSpliterator16 = languageRangeList13.spliterator();
        java.util.Locale.LanguageRange[] languageRangeArray17 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList18 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList18, languageRangeArray17);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap20 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList21 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList18, strMap20);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor22 = languageRangeList21.listIterator();
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList25 = new java.util.ArrayList<java.lang.String>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList25, strArray24);
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
        java.lang.String[] strArray71 = new java.lang.String[] { "English", "hi", "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "", "a", "", "China" };
        java.util.ArrayList<java.lang.String> strList72 = new java.util.ArrayList<java.lang.String>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList72, strArray71);
        java.util.List<java.lang.Class<?>> wildcardClassList74 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList72);
        java.util.Locale.FilteringMode filteringMode75 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList76 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList28, (java.util.Collection<java.lang.String>) strList72, filteringMode75);
        java.util.List<java.lang.String> strList77 = java.util.Locale.filterTags(languageRangeList21, (java.util.Collection<java.lang.String>) strList25, filteringMode75);
        java.util.List<java.lang.Class<?>> wildcardClassList78 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList25);
        java.util.List<java.lang.String> strList79 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList13, (java.util.Collection<java.lang.String>) strList25);
        java.lang.String str81 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList13, "deu");
        java.util.Locale locale83 = new java.util.Locale("");
        java.util.Set<java.lang.String> strSet84 = locale83.getUnicodeLocaleAttributes();
        java.lang.String str85 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList13, (java.util.Collection<java.lang.String>) strSet84);
        java.util.Locale locale91 = new java.util.Locale("hi", "hi!", "cHINA");
        java.lang.String str92 = locale91.getLanguage();
        java.lang.String str93 = org.apache.commons.lang3.StringUtils.upperCase("CINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINA", locale91);
        java.lang.String str94 = locale91.getDisplayLanguage();
        java.lang.String str95 = org.apache.commons.lang3.StringUtils.upperCase("German", locale91);
        java.lang.String str96 = locale91.getScript();
        boolean boolean97 = languageRangeList13.contains((java.lang.Object) str96);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(languageRangeArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(languageRangeSpliterator16);
        org.junit.Assert.assertNotNull(languageRangeArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(languageRangeList21);
        org.junit.Assert.assertNotNull(languageRangeItor22);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
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
// flaky:         org.junit.Assert.assertEquals(locale37.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Cina" + "'", str38, "Cina");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "zh-CN" + "'", str39, "zh-CN");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale41);
// flaky:         org.junit.Assert.assertEquals(locale41.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Cina" + "'", str42, "Cina");
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale44);
// flaky:         org.junit.Assert.assertEquals(locale44.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Cina" + "'", str45, "Cina");
        org.junit.Assert.assertEquals(locale49.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale51);
// flaky:         org.junit.Assert.assertEquals(locale51.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str52 + "' != '" + "Cina" + "'", str52, "Cina");
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
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(wildcardClassList74);
        org.junit.Assert.assertTrue("'" + filteringMode75 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode75.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList76);
        org.junit.Assert.assertNotNull(strList77);
        org.junit.Assert.assertNotNull(wildcardClassList78);
        org.junit.Assert.assertNotNull(strList79);
        org.junit.Assert.assertEquals(locale83.toString(), "");
        org.junit.Assert.assertNotNull(strSet84);
        org.junit.Assert.assertNull(str85);
        org.junit.Assert.assertEquals(locale91.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "hi" + "'", str92, "hi");
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "CINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINA" + "'", str93, "CINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINA");
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "hindi" + "'", str94, "hindi");
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "GERMAN" + "'", str95, "GERMAN");
        org.junit.Assert.assertEquals("'" + str96 + "' != '" + "" + "'", str96, "");
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
    }

    @Test
    public void test16547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16547");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("nawiazh-cnnawia", "Boolean");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test16548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16548");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("cn    ", "hITaiwanhIxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hITaiwanhIxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx" + "'", str2, "hITaiwanhIxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
    }

    @Test
    public void test16549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16549");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("eSESENICHZ.....");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Esesenichz....." + "'", str1, "Esesenichz.....");
    }

    @Test
    public void test16550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16550");
        java.util.Locale locale3 = new java.util.Locale("ChinChinChinChinChiChinChinChinChinC", "\u65e5\u6587\u65e5\u65e5\u65e5 (HI!,cHINA", "glish");
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "\u65e5\u6587\u65e5\u65e5\u65e5 (HI!,CHINA_glish");
    }

    @Test
    public void test16551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16551");
        java.lang.CharSequence charSequence1 = null;
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "                                 TW", charSequence1);
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "                                 TW" + "'", charSequence2, "                                 TW");
    }

    @Test
    public void test16552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16552");
        java.util.Locale locale1 = new java.util.Locale("");
        java.lang.String str2 = locale1.getDisplayLanguage();
        java.util.Locale locale3 = java.util.Locale.CANADA;
        java.lang.String str4 = locale3.getDisplayLanguage();
        java.lang.String str5 = locale1.getDisplayScript(locale3);
        java.util.Locale locale6 = java.util.Locale.ITALIAN;
        java.util.Locale locale8 = new java.util.Locale("");
        java.lang.String str9 = locale8.getDisplayLanguage();
        java.util.Locale locale10 = java.util.Locale.CANADA;
        java.lang.String str11 = locale10.getDisplayLanguage();
        java.lang.String str12 = locale8.getDisplayScript(locale10);
        java.util.Locale locale14 = java.util.Locale.FRANCE;
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale14);
        java.lang.String str16 = locale8.getDisplayCountry(locale14);
        java.lang.String str17 = locale6.getDisplayScript(locale8);
        java.lang.String str18 = locale8.getDisplayCountry();
        java.lang.String str19 = locale8.getDisplayLanguage();
        java.util.Locale locale20 = java.util.Locale.PRC;
        java.lang.String str21 = locale8.getDisplayScript(locale20);
        java.lang.String str22 = locale3.getDisplayCountry(locale8);
        java.lang.String str23 = locale8.toLanguageTag();
        java.lang.String str24 = locale8.getVariant();
        java.util.Locale locale28 = new java.util.Locale("Cinaxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", "ggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engli", "us");
        java.lang.String str29 = locale28.getDisplayLanguage();
        java.lang.String str30 = locale8.getDisplayVariant(locale28);
        java.util.Locale locale33 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale34 = java.util.Locale.getDefault();
        java.lang.String str35 = locale33.getDisplayCountry(locale34);
        java.lang.String str36 = locale33.toLanguageTag();
        java.lang.String str37 = locale33.getCountry();
        java.lang.String str38 = locale33.toLanguageTag();
        java.lang.String str39 = org.apache.commons.lang3.StringUtils.upperCase("java.lang", locale33);
        java.lang.String str40 = org.apache.commons.lang3.StringUtils.upperCase("CHINOIS (CHINE)", locale33);
        java.lang.String str41 = locale33.getISO3Country();
        java.lang.String str42 = locale8.getDisplayLanguage(locale33);
        java.lang.String str43 = locale33.getDisplayScript();
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "inglese" + "'", str4, "inglese");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "it");
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "inglese" + "'", str11, "inglese");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "english" + "'", str15, "english");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Canada" + "'", str22, "Canada");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "und" + "'", str23, "und");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals(locale28.toString(), "cinaxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx_GGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLI_us");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "cinaxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx" + "'", str29, "cinaxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale34);
// flaky:         org.junit.Assert.assertEquals(locale34.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Cina" + "'", str35, "Cina");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "zh-CN" + "'", str36, "zh-CN");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "CN" + "'", str37, "CN");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "zh-CN" + "'", str38, "zh-CN");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "JAVA.LANG" + "'", str39, "JAVA.LANG");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "CHINOIS (CHINE)" + "'", str40, "CHINOIS (CHINE)");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "CHN" + "'", str41, "CHN");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
    }

    @Test
    public void test16553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16553");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("hi");
        boolean boolean3 = languageRangeList1.remove((java.lang.Object) "English");
        java.util.Locale.LanguageRange languageRange5 = languageRangeList1.get(0);
        languageRangeList1.clear();
        java.util.List<java.util.Locale.LanguageRange> languageRangeList8 = java.util.Locale.LanguageRange.parse("cnn");
        boolean boolean9 = languageRangeList1.retainAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList8);
        java.util.Locale.LanguageRange[] languageRangeArray10 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList11 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList11, languageRangeArray10);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap13 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList14 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList11, strMap13);
        java.util.Locale.LanguageRange[] languageRangeArray15 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList16 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList16, languageRangeArray15);
        boolean boolean18 = languageRangeList11.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList16);
        languageRangeList11.clear();
        java.util.Locale.LanguageRange[] languageRangeArray20 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList21 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList21, languageRangeArray20);
        java.util.Locale locale24 = java.util.Locale.FRANCE;
        java.lang.String str25 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale24);
        java.util.Locale locale26 = java.util.Locale.US;
        java.util.Locale locale27 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale28 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale29 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale30 = java.util.Locale.getDefault();
        java.lang.String str31 = locale29.getDisplayCountry(locale30);
        java.lang.String str32 = locale29.toLanguageTag();
        java.util.Locale locale33 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale34 = java.util.Locale.getDefault();
        java.lang.String str35 = locale33.getDisplayCountry(locale34);
        java.util.Locale locale36 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale37 = java.util.Locale.getDefault();
        java.lang.String str38 = locale36.getDisplayCountry(locale37);
        java.util.Locale locale42 = new java.util.Locale("hi", "hi!", "cHINA");
        java.util.Locale locale43 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale44 = java.util.Locale.getDefault();
        java.lang.String str45 = locale43.getDisplayCountry(locale44);
        java.util.Locale locale47 = new java.util.Locale("");
        java.lang.String str48 = locale47.getDisplayVariant();
        java.util.Locale locale49 = java.util.Locale.KOREAN;
        java.util.Locale locale51 = new java.util.Locale("");
        java.util.Locale locale52 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale[] localeArray53 = new java.util.Locale[] { locale24, locale26, locale27, locale28, locale29, locale34, locale36, locale42, locale44, locale47, locale49, locale51, locale52 };
        java.util.ArrayList<java.util.Locale> localeList54 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList54, localeArray53);
        java.util.List<java.util.Locale> localeList56 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList21, (java.util.Collection<java.util.Locale>) localeList54);
        java.util.List<java.util.Locale> localeList57 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList11, (java.util.Collection<java.util.Locale>) localeList56);
        java.util.Locale.FilteringMode filteringMode58 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList59 = java.util.Locale.filter(languageRangeList1, (java.util.Collection<java.util.Locale>) localeList57, filteringMode58);
        java.lang.Object[] objArray60 = languageRangeList1.toArray();
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(languageRange5);
        org.junit.Assert.assertNotNull(languageRangeList8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(languageRangeArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(languageRangeList14);
        org.junit.Assert.assertNotNull(languageRangeArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(languageRangeArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "english" + "'", str25, "english");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale30);
// flaky:         org.junit.Assert.assertEquals(locale30.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Cina" + "'", str31, "Cina");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "zh-CN" + "'", str32, "zh-CN");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale34);
// flaky:         org.junit.Assert.assertEquals(locale34.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Cina" + "'", str35, "Cina");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale37);
// flaky:         org.junit.Assert.assertEquals(locale37.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Cina" + "'", str38, "Cina");
        org.junit.Assert.assertEquals(locale42.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale44);
// flaky:         org.junit.Assert.assertEquals(locale44.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Cina" + "'", str45, "Cina");
        org.junit.Assert.assertEquals(locale47.toString(), "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "ko");
        org.junit.Assert.assertEquals(locale51.toString(), "");
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(localeList56);
        org.junit.Assert.assertNotNull(localeList57);
        org.junit.Assert.assertTrue("'" + filteringMode58 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode58.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList59);
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray60), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray60), "[]");
    }

    @Test
    public void test16554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16554");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("REFERENCEPIPELINE.HEAD                        ", "Class[]", 279);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test16555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16555");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("zh-cnenglish", "\u82f1\u8a9e", "RITL");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test16556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16556");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder13 = builder9.addUnicodeLocaleAttribute("##############################################################################################################################################################################################################################################################################################################################################################");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: ############################################################################################################################################################################################################################################################################################################################################################## [at index 0]");
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
    }

    @Test
    public void test16557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16557");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("\u4e2d\u6587\u53f0\u6e7e\u5730\u533aengliIlish)", "GNAL.AVAJString[]String[]String[]", (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test16558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16558");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("chinois ", 234, (int) 'x');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test16559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16559");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "ANIHzhcineseszhcineseszhcineseszhcineseszhcineseszhcineseszhcineseszhcineseszhcineseszhcineseszhcineseszhcineseszhcin");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test16560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16560");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("ja", 186, "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ja$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$" + "'", str3, "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ja$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
    }

    @Test
    public void test16561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16561");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test16562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16562");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("chinChinChinChinChiChinChinChinChinC", 248);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "chinChinChinChinChiChinChinChinChinC" + "'", str2, "chinChinChinChinChiChinChinChinChinC");
    }

    @Test
    public void test16563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16563");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName("A#A#A#A#A#                      ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "A#A#A#A#A#" + "'", str1, "A#A#A#A#A#");
    }

    @Test
    public void test16564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16564");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("hsilgnE#########################", "e!e(Tiiwin", 6);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hsilgnE#########################" + "'", str3, "hsilgnE#########################");
    }

    @Test
    public void test16565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16565");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("ZH", strMap1);
        org.junit.Assert.assertNotNull(languageRangeList2);
    }

    @Test
    public void test16566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16566");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = builder0.build();
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale locale5 = java.util.Locale.forLanguageTag("allemand");
        java.util.Locale locale6 = locale5.stripExtensions();
        java.lang.String str7 = locale2.getDisplayVariant(locale6);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "allemand");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "allemand");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test16567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16567");
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
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap51 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList52 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap51);
        java.util.Spliterator<java.util.Locale.LanguageRange> languageRangeSpliterator53 = languageRangeList52.spliterator();
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream54 = languageRangeList52.stream();
        java.util.AbstractCollection[] abstractCollectionArray56 = new java.util.AbstractCollection[0];
        @SuppressWarnings("unchecked")
        java.util.AbstractCollection<java.util.Locale.LanguageRange>[] languageRangeCollectionArray57 = (java.util.AbstractCollection<java.util.Locale.LanguageRange>[]) abstractCollectionArray56;
        java.util.AbstractCollection[] abstractCollectionArray59 = new java.util.AbstractCollection[0];
        @SuppressWarnings("unchecked")
        java.util.AbstractCollection<java.util.Locale.LanguageRange>[] languageRangeCollectionArray60 = (java.util.AbstractCollection<java.util.Locale.LanguageRange>[]) abstractCollectionArray59;
        java.util.AbstractCollection[][] abstractCollectionArray62 = new java.util.AbstractCollection[2][];
        @SuppressWarnings("unchecked")
        java.util.AbstractCollection<java.util.Locale.LanguageRange>[][] languageRangeCollectionArray63 = (java.util.AbstractCollection<java.util.Locale.LanguageRange>[][]) abstractCollectionArray62;
        languageRangeCollectionArray63[0] = abstractCollectionArray56;
        languageRangeCollectionArray63[1] = abstractCollectionArray59;
        java.util.AbstractCollection<java.util.Locale.LanguageRange>[][] languageRangeCollectionArray68 = languageRangeList52.toArray(languageRangeCollectionArray63);
        java.util.Locale.Category category69 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale70 = java.util.Locale.ENGLISH;
        java.util.Locale.setDefault(category69, locale70);
        java.util.Locale locale72 = java.util.Locale.JAPANESE;
        java.util.Locale locale74 = java.util.Locale.TAIWAN;
        java.lang.String str75 = org.apache.commons.lang3.StringUtils.upperCase("", locale74);
        java.lang.String str76 = locale72.getDisplayVariant(locale74);
        java.util.Locale.setDefault(category69, locale74);
        java.lang.String str78 = locale74.getISO3Country();
        java.util.Locale locale80 = java.util.Locale.CHINA;
        java.util.Set<java.lang.Character> charSet81 = locale80.getExtensionKeys();
        java.lang.String str82 = org.apache.commons.lang3.StringUtils.lowerCase("String[]", locale80);
        java.lang.String str83 = locale80.getVariant();
        java.lang.String str84 = locale74.getDisplayVariant(locale80);
        int int85 = languageRangeList52.lastIndexOf((java.lang.Object) str84);
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
// flaky:         org.junit.Assert.assertEquals(locale10.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Cina" + "'", str11, "Cina");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "zh-CN" + "'", str12, "zh-CN");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale14);
// flaky:         org.junit.Assert.assertEquals(locale14.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Cina" + "'", str15, "Cina");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale17);
// flaky:         org.junit.Assert.assertEquals(locale17.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Cina" + "'", str18, "Cina");
        org.junit.Assert.assertEquals(locale22.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale24);
// flaky:         org.junit.Assert.assertEquals(locale24.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Cina" + "'", str25, "Cina");
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
        org.junit.Assert.assertNotNull(languageRangeList52);
        org.junit.Assert.assertNotNull(languageRangeSpliterator53);
        org.junit.Assert.assertNotNull(languageRangeStream54);
        org.junit.Assert.assertNotNull(abstractCollectionArray56);
        org.junit.Assert.assertNotNull(languageRangeCollectionArray57);
        org.junit.Assert.assertNotNull(abstractCollectionArray59);
        org.junit.Assert.assertNotNull(languageRangeCollectionArray60);
        org.junit.Assert.assertNotNull(abstractCollectionArray62);
        org.junit.Assert.assertNotNull(languageRangeCollectionArray63);
        org.junit.Assert.assertNotNull(languageRangeCollectionArray68);
        org.junit.Assert.assertTrue("'" + category69 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category69.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale70);
        org.junit.Assert.assertEquals(locale70.toString(), "en");
        org.junit.Assert.assertNotNull(locale72);
        org.junit.Assert.assertEquals(locale72.toString(), "ja");
        org.junit.Assert.assertNotNull(locale74);
        org.junit.Assert.assertEquals(locale74.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "TWN" + "'", str78, "TWN");
        org.junit.Assert.assertNotNull(locale80);
        org.junit.Assert.assertEquals(locale80.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(charSet81);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "string[]" + "'", str82, "string[]");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "" + "'", str83, "");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "" + "'", str84, "");
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + (-1) + "'", int85 == (-1));
    }

    @Test
    public void test16568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16568");
        java.util.Locale locale2 = java.util.Locale.forLanguageTag("twn");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.lowerCase("Cinaxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", locale2);
        java.lang.String str4 = locale2.getDisplayScript();
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "twn");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "cinaxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx" + "'", str3, "cinaxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test16569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16569");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxchn");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test16570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16570");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("it                                           ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "it" + "'", str1, "it");
    }

    @Test
    public void test16571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16571");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder34 = builder8.setVariant("\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587          ");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant:           h????????????????????????????????????????????????????????????????????????????????????????????????           [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test16572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16572");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("44444444444444444444444444444444444chinChin", "44444444444444444444444444444444444chinChin");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test16573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16573");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.lang.String str1 = locale0.getVariant();
        java.util.Locale locale5 = new java.util.Locale("hi", "hi!", "cHINA");
        java.lang.String str6 = locale5.getDisplayVariant();
        java.util.Locale locale7 = locale5.stripExtensions();
        java.util.Locale locale11 = new java.util.Locale("ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hEnglish", "IA", "zh_CN");
        java.util.Locale locale14 = new java.util.Locale("zho", "US");
        java.util.Locale locale15 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str16 = locale14.getDisplayVariant(locale15);
        java.lang.String str17 = locale11.getDisplayName(locale15);
        java.lang.String str18 = locale15.toLanguageTag();
        java.lang.String str19 = locale7.getDisplayCountry(locale15);
        java.lang.String str21 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) locale15, "################################################################################");
        java.lang.String str22 = locale0.getDisplayName(locale15);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList24 = java.util.Locale.LanguageRange.parse("hi");
        java.lang.Object[] objArray25 = languageRangeList24.toArray();
        java.util.List<java.util.Locale.LanguageRange> languageRangeList27 = java.util.Locale.LanguageRange.parse("hi");
        java.lang.Object[] objArray28 = languageRangeList27.toArray();
        java.util.Spliterator<java.util.Locale.LanguageRange> languageRangeSpliterator29 = languageRangeList27.spliterator();
        boolean boolean30 = languageRangeList24.containsAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList27);
        java.util.Iterator<java.util.Locale.LanguageRange> languageRangeItor31 = languageRangeList24.iterator();
        java.util.Locale.Builder builder32 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder33 = builder32.clearExtensions();
        java.util.Locale.Builder builder35 = builder33.setLanguageTag("zh-CN");
        java.util.Locale.Builder builder37 = builder35.setLanguage("it");
        boolean boolean38 = languageRangeList24.remove((java.lang.Object) builder37);
        java.util.Locale.Builder builder40 = builder37.setLanguageTag("CINESE");
        java.util.Locale locale42 = java.util.Locale.forLanguageTag("HI");
        java.util.Locale.Builder builder43 = builder37.setLocale(locale42);
        java.util.Locale locale44 = java.util.Locale.PRC;
        java.lang.String str45 = locale42.getDisplayVariant(locale44);
        java.lang.String str46 = locale15.getDisplayVariant(locale44);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals(locale5.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "cHINA" + "'", str6, "cHINA");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertEquals(locale11.toString(), "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!henglish_IA_zh_CN");
        org.junit.Assert.assertEquals(locale14.toString(), "zho_US");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!henglish (IA,zh,CN)" + "'", str17, "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!henglish (IA,zh,CN)");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "fr-CA" + "'", str18, "fr-CA");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HI!" + "'", str19, "HI!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "java.util" + "'", str21, "java.util");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "fran\347ais (France)" + "'", str22, "fran\347ais (France)");
        org.junit.Assert.assertNotNull(languageRangeList24);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(languageRangeList27);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(languageRangeSpliterator29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(languageRangeItor31);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "hi");
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
    }

    @Test
    public void test16574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16574");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("ud", "", "                                                gnalesenic.esenicavaj                                                ", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ud" + "'", str4, "ud");
    }

    @Test
    public void test16575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16575");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("ArrayList", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test16576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16576");
        java.lang.Class[] classArray2 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray3 = (java.lang.Class<?>[]) classArray2;
        java.lang.Class<?>[] wildcardClassArray4 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray2);
        java.lang.Class<?>[] wildcardClassArray5 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray2);
        java.lang.Class[] classArray8 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray9 = (java.lang.Class<?>[]) classArray8;
        java.lang.Class<?>[] wildcardClassArray10 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray8);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.concatWith("hi!", (java.lang.Object[]) classArray8);
        boolean boolean12 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray2, (java.lang.Class<?>[]) classArray8);
        java.lang.Class<?>[] wildcardClassArray13 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers((java.lang.Class<?>[]) classArray8);
        java.lang.Class<?>[] wildcardClassArray14 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray13);
        java.lang.Class[] classArray16 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray17 = (java.lang.Class<?>[]) classArray16;
        java.lang.Class<?>[] wildcardClassArray18 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray16);
        java.lang.Class<?>[] wildcardClassArray19 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray16);
        java.lang.Class[] classArray21 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray22 = (java.lang.Class<?>[]) classArray21;
        java.lang.Class<?>[] wildcardClassArray23 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray21);
        java.lang.Class<?>[] wildcardClassArray24 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray21);
        java.lang.String str26 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) classArray21, "zh-CN");
        boolean boolean27 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray19, (java.lang.Class<?>[]) classArray21);
        java.lang.Class[] classArray29 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray30 = (java.lang.Class<?>[]) classArray29;
        java.lang.Class<?>[] wildcardClassArray31 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray29);
        java.lang.Class<?>[] wildcardClassArray32 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray29);
        java.lang.Class[] classArray35 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray36 = (java.lang.Class<?>[]) classArray35;
        java.lang.Class<?>[] wildcardClassArray37 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray35);
        java.lang.String str38 = org.apache.commons.lang3.StringUtils.concatWith("hi!", (java.lang.Object[]) classArray35);
        boolean boolean39 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray29, (java.lang.Class<?>[]) classArray35);
        boolean boolean41 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray19, (java.lang.Class<?>[]) classArray35, true);
        java.lang.Class[] classArray43 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray44 = (java.lang.Class<?>[]) classArray43;
        java.lang.Class<?>[] wildcardClassArray45 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray43);
        java.lang.Class<?> wildcardClass46 = null;
        java.lang.Class[] classArray48 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray49 = (java.lang.Class<?>[]) classArray48;
        wildcardClassArray49[0] = wildcardClass46;
        boolean boolean53 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray45, wildcardClassArray49, false);
        java.lang.Class[] classArray55 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray56 = (java.lang.Class<?>[]) classArray55;
        java.lang.Class<?>[] wildcardClassArray57 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray55);
        boolean boolean58 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray45, (java.lang.Class<?>[]) classArray55);
        java.lang.Class[] classArray60 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray61 = (java.lang.Class<?>[]) classArray60;
        java.lang.Class<?>[] wildcardClassArray62 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray60);
        java.lang.Class<?>[] wildcardClassArray63 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray60);
        java.lang.Class[] classArray65 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray66 = (java.lang.Class<?>[]) classArray65;
        java.lang.Class<?>[] wildcardClassArray67 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray65);
        java.lang.Class<?>[] wildcardClassArray68 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray65);
        java.lang.String str70 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) classArray65, "zh-CN");
        boolean boolean71 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray63, (java.lang.Class<?>[]) classArray65);
        boolean boolean73 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray45, wildcardClassArray63, false);
        java.lang.Class<?>[] wildcardClassArray74 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray45);
        java.lang.Class<?>[] wildcardClassArray75 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray45);
        boolean boolean76 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray35, wildcardClassArray45);
        java.lang.Class[] classArray78 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray79 = (java.lang.Class<?>[]) classArray78;
        java.lang.Class<?>[] wildcardClassArray80 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray78);
        java.lang.Class<?> wildcardClass81 = null;
        java.lang.Class[] classArray83 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray84 = (java.lang.Class<?>[]) classArray83;
        wildcardClassArray84[0] = wildcardClass81;
        boolean boolean88 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray80, wildcardClassArray84, false);
        java.lang.Class<?>[] wildcardClassArray89 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray80);
        boolean boolean91 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray35, wildcardClassArray89, false);
        boolean boolean93 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray13, wildcardClassArray89, true);
        java.lang.String str94 = org.apache.commons.lang3.StringUtils.concatWith("", (java.lang.Object[]) wildcardClassArray13);
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertNotNull(wildcardClassArray4);
        org.junit.Assert.assertNotNull(wildcardClassArray5);
        org.junit.Assert.assertNotNull(classArray8);
        org.junit.Assert.assertNotNull(wildcardClassArray9);
        org.junit.Assert.assertNotNull(wildcardClassArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray13);
        org.junit.Assert.assertNotNull(wildcardClassArray14);
        org.junit.Assert.assertNotNull(classArray16);
        org.junit.Assert.assertNotNull(wildcardClassArray17);
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertNotNull(wildcardClassArray19);
        org.junit.Assert.assertNotNull(classArray21);
        org.junit.Assert.assertNotNull(wildcardClassArray22);
        org.junit.Assert.assertNotNull(wildcardClassArray23);
        org.junit.Assert.assertNotNull(wildcardClassArray24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(classArray29);
        org.junit.Assert.assertNotNull(wildcardClassArray30);
        org.junit.Assert.assertNotNull(wildcardClassArray31);
        org.junit.Assert.assertNotNull(wildcardClassArray32);
        org.junit.Assert.assertNotNull(classArray35);
        org.junit.Assert.assertNotNull(wildcardClassArray36);
        org.junit.Assert.assertNotNull(wildcardClassArray37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(classArray43);
        org.junit.Assert.assertNotNull(wildcardClassArray44);
        org.junit.Assert.assertNotNull(wildcardClassArray45);
        org.junit.Assert.assertNotNull(classArray48);
        org.junit.Assert.assertNotNull(wildcardClassArray49);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(classArray55);
        org.junit.Assert.assertNotNull(wildcardClassArray56);
        org.junit.Assert.assertNotNull(wildcardClassArray57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(classArray60);
        org.junit.Assert.assertNotNull(wildcardClassArray61);
        org.junit.Assert.assertNotNull(wildcardClassArray62);
        org.junit.Assert.assertNotNull(wildcardClassArray63);
        org.junit.Assert.assertNotNull(classArray65);
        org.junit.Assert.assertNotNull(wildcardClassArray66);
        org.junit.Assert.assertNotNull(wildcardClassArray67);
        org.junit.Assert.assertNotNull(wildcardClassArray68);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray74);
        org.junit.Assert.assertNotNull(wildcardClassArray75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNotNull(classArray78);
        org.junit.Assert.assertNotNull(wildcardClassArray79);
        org.junit.Assert.assertNotNull(wildcardClassArray80);
        org.junit.Assert.assertNotNull(classArray83);
        org.junit.Assert.assertNotNull(wildcardClassArray84);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray89);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "" + "'", str94, "");
    }

    @Test
    public void test16577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16577");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.setLanguageTag("zh-CN");
        java.util.Locale.Builder builder5 = builder3.setLanguage("it");
        java.util.Locale.Builder builder6 = builder3.clearExtensions();
        java.util.Locale locale7 = builder3.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder3.setVariant("                                             e!e(Tiiwin                                             ");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant:                                              e!e(Tiiwin                                              [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "it_CN");
    }

    @Test
    public void test16578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16578");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!", "enghI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!" + "'", str2, "ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!ahi!hi!");
    }

    @Test
    public void test16579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16579");
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
        java.util.Locale locale11 = builder2.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder13 = builder2.setScript("ese(China)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: ese(China) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cina" + "'", str5, "Cina");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "zh-CN" + "'", str6, "zh-CN");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\u4e2d\u570b" + "'", str8, "\u4e2d\u570b");
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh_CN");
    }

    @Test
    public void test16580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16580");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("\u4e2d\u56fd\u8a9e\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd)", "XXXXXXXXXXFRENCH(FRANCE)XXXXXXXXXXXXXXXXXXXXFRENCH(FRANCE)XXXXXXXXXXXXXXXXXXXXFRENCH(FRANCE)XXXXXXXXXXXXXXXXXXXXFRENCH(FRANCE)XXXXXXXXXXXXXXXXXXXXFRENCH(FRANCE)XXXXXXXXXXXXXXXXXXXXFRENCH(FRANCE)XXXXXXXXXXXXXXXXXXXXFRENCH(FRANCE)XXXXXXXXXXXXXXXXXXXXFRENCH(FRANCE)XXXXXXXXXXXXXXXXXXXXFRENCH(FRANCE)XXXXXXXXXXXXXXXXXXXXFRENCH(FRANCE)XXXXXXXXXXXXXXXXXXXXFRENCH(FRANCE)XXXXXXXXXXXXXXXXXXXXFRENCH(FRANCE)XXXXXXXXXXXXXXXXXXXXFRENCH(FRANCE)XXXXXXXXXX", 44);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test16581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16581");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str1 = locale0.getDisplayLanguage();
        java.util.Locale locale2 = java.util.Locale.getDefault();
        java.lang.String str3 = locale0.getDisplayCountry(locale2);
        java.util.Locale locale4 = java.util.Locale.TAIWAN;
        java.lang.String str5 = locale4.getVariant();
        java.lang.String str6 = locale0.getDisplayName(locale4);
        java.lang.String str7 = locale4.toLanguageTag();
        java.util.Locale locale9 = new java.util.Locale("En");
        java.lang.String str10 = locale9.getDisplayLanguage();
        java.lang.String str11 = locale4.getDisplayVariant(locale9);
        java.lang.String str12 = locale4.getDisplayLanguage();
        java.util.Locale.Category category13 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale14 = java.util.Locale.ENGLISH;
        java.util.Locale.setDefault(category13, locale14);
        java.util.Locale locale16 = java.util.Locale.JAPANESE;
        java.util.Locale locale18 = java.util.Locale.TAIWAN;
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.upperCase("", locale18);
        java.lang.String str20 = locale16.getDisplayVariant(locale18);
        java.util.Locale.setDefault(category13, locale18);
        java.util.Locale locale22 = java.util.Locale.getDefault(category13);
        java.lang.String str23 = locale22.getLanguage();
        java.lang.String str24 = locale4.getDisplayName(locale22);
        java.util.Locale locale25 = locale22.stripExtensions();
        java.util.Locale locale29 = new java.util.Locale("hi", "hi!", "cHINA");
        java.lang.String str30 = locale29.getDisplayVariant();
        java.util.Set<java.lang.String> strSet31 = locale29.getUnicodeLocaleAttributes();
        java.util.Locale.setDefault(locale29);
        java.lang.String str33 = locale22.getDisplayScript(locale29);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str35 = locale29.getUnicodeLocaleType("chi..T");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: chi..T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u4e2d\u6587" + "'", str1, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(locale2);
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "it");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Taiwan" + "'", str3, "Taiwan");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u4e2d\u6587\u53f0\u7063)" + "'", str6, "\u4e2d\u6587\u53f0\u7063)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "zh-TW" + "'", str7, "zh-TW");
        org.junit.Assert.assertEquals(locale9.toString(), "en");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\u82f1\u6587" + "'", str10, "\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\u4e2d\u6587" + "'", str12, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + category13 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category13.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "ja");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "zh" + "'", str23, "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\u4e2d\u6587\u53f0\u7063)" + "'", str24, "\u4e2d\u6587\u53f0\u7063)");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "zh_TW");
        org.junit.Assert.assertEquals(locale29.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "cHINA" + "'", str30, "cHINA");
        org.junit.Assert.assertNotNull(strSet31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
    }

    @Test
    public void test16582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16582");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("hi!string[]string[]s");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!string[]string[]s" + "'", str1, "hi!string[]string[]s");
    }

    @Test
    public void test16583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16583");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("slgne", "                                                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test16584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16584");
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
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream90 = languageRangeList86.stream();
        java.lang.String str92 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) languageRangeList86, "\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5...");
        boolean boolean93 = languageRangeList86.isEmpty();
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
        org.junit.Assert.assertEquals(locale38.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "China" + "'", str39, "China");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "zh-CN" + "'", str40, "zh-CN");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "China" + "'", str43, "China");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "China" + "'", str46, "China");
        org.junit.Assert.assertEquals(locale50.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "hi_HI!_cHINA");
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
        org.junit.Assert.assertNotNull(languageRangeStream90);
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "java.util" + "'", str92, "java.util");
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
    }

    @Test
    public void test16585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16585");
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
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor33 = languageRangeList4.listIterator(0);
        java.util.Locale.LanguageRange[] languageRangeArray34 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList35 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList35, languageRangeArray34);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap37 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList38 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList35, strMap37);
        java.util.Iterator<java.util.Locale.LanguageRange> languageRangeItor39 = languageRangeList35.iterator();
        java.util.Locale locale42 = new java.util.Locale("");
        java.lang.String str43 = locale42.getDisplayLanguage();
        java.util.Locale locale44 = java.util.Locale.CANADA;
        java.lang.String str45 = locale44.getDisplayLanguage();
        java.lang.String str46 = locale42.getDisplayScript(locale44);
        java.lang.String str47 = locale44.getDisplayVariant();
        java.lang.String str48 = org.apache.commons.lang3.StringUtils.upperCase("", locale44);
        java.lang.String str49 = locale44.getLanguage();
        boolean boolean50 = languageRangeList35.equals((java.lang.Object) locale44);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList52 = java.util.Locale.LanguageRange.parse("hi");
        java.lang.Object[] objArray53 = languageRangeList52.toArray();
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream54 = languageRangeList52.parallelStream();
        java.util.Locale.LanguageRange[] languageRangeArray55 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList56 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList56, languageRangeArray55);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap58 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList59 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList56, strMap58);
        java.util.Locale.LanguageRange[] languageRangeArray60 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList61 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList61, languageRangeArray60);
        boolean boolean63 = languageRangeList56.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList61);
        java.util.Locale.LanguageRange[] languageRangeArray64 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList65 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList65, languageRangeArray64);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap67 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList68 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList65, strMap67);
        java.util.Locale.LanguageRange[] languageRangeArray69 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList70 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList70, languageRangeArray69);
        boolean boolean72 = languageRangeList65.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList70);
        java.lang.String str74 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList70, "hi!");
        boolean boolean75 = languageRangeList56.remove((java.lang.Object) languageRangeList70);
        boolean boolean76 = languageRangeList52.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList70);
        boolean boolean77 = languageRangeList35.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList70);
        int int78 = languageRangeList4.indexOf((java.lang.Object) boolean77);
        int int79 = languageRangeList4.size();
        java.lang.String[] strArray83 = org.apache.commons.lang3.StringUtils.split("it", "Chin", 7);
        boolean boolean84 = languageRangeList4.contains((java.lang.Object) 7);
        java.lang.String str86 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList4, 'u');
        java.util.Spliterator<java.util.Locale.LanguageRange> languageRangeSpliterator87 = languageRangeList4.spliterator();
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
        org.junit.Assert.assertNotNull(languageRangeItor33);
        org.junit.Assert.assertNotNull(languageRangeArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(languageRangeList38);
        org.junit.Assert.assertNotNull(languageRangeItor39);
        org.junit.Assert.assertEquals(locale42.toString(), "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "\u0905\u0901\u0917\u094d\u0930\u0947\u091c\u093c\u0940" + "'", str45, "\u0905\u0901\u0917\u094d\u0930\u0947\u091c\u093c\u0940");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "en" + "'", str49, "en");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(languageRangeList52);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertNotNull(languageRangeStream54);
        org.junit.Assert.assertNotNull(languageRangeArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(languageRangeList59);
        org.junit.Assert.assertNotNull(languageRangeArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(languageRangeArray64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(languageRangeList68);
        org.junit.Assert.assertNotNull(languageRangeArray69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 1 + "'", int79 == 1);
        org.junit.Assert.assertNotNull(strArray83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(languageRangeSpliterator87);
    }

    @Test
    public void test16586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16586");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageName("C#####");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test16587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16587");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("", 17, "                                                                                              german");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                 " + "'", str3, "                 ");
    }

    @Test
    public void test16588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16588");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("esesenichz", "zh_C", (-1));
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("chnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test16589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16589");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxUSxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", "ITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITALIAHi", 12);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test16590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16590");
        java.lang.CharSequence charSequence1 = null;
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "\u5927\u62ff\u52a0\u6587\u82f1", charSequence1);
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "\u5927\u62ff\u52a0\u6587\u82f1" + "'", charSequence2, "\u5927\u62ff\u52a0\u6587\u82f1");
    }

    @Test
    public void test16591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16591");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!              aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 51);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test16592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16592");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]", true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: [LTRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING;");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16593");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "unduhar[]undu", (java.lang.CharSequence) "Chinesisch(China)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test16594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16594");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("zh-CN", "Chine");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "zh-CN" + "'", str2, "zh-CN");
    }

    @Test
    public void test16595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16595");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaCinaxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", (java.lang.CharSequence) "Integer");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test16596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16596");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortClassName("HINDI(hi!,China)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HINDI(hi!,China)" + "'", str1, "HINDI(hi!,China)");
    }

    @Test
    public void test16597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16597");
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
        java.util.Locale.LanguageRange[] languageRangeArray20 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList21 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList21, languageRangeArray20);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap23 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList24 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList21, strMap23);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream25 = languageRangeList21.stream();
        boolean boolean26 = languageRangeList21.isEmpty();
        languageRangeList21.clear();
        java.lang.String[] strArray30 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("it");
        boolean boolean31 = org.apache.commons.lang3.StringUtils.startsWithAny("ESE (tAIWAN", strArray30);
        boolean boolean32 = languageRangeList21.contains((java.lang.Object) strArray30);
        java.lang.Object[] objArray33 = languageRangeList21.toArray();
        boolean boolean34 = languageRangeList1.remove((java.lang.Object) objArray33);
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
        org.junit.Assert.assertNotNull(languageRangeArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(languageRangeList24);
        org.junit.Assert.assertNotNull(languageRangeStream25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test16598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16598");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "chinois (Chine)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "chinois (Chine)" + "'", str1, "chinois (Chine)");
    }

    @Test
    public void test16599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16599");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("CINACI", 3, 12);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ACI" + "'", str3, "ACI");
    }

    @Test
    public void test16600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16600");
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
        java.lang.String str37 = locale20.getCountry();
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
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\u0905\u0901\u0917\u094d\u0930\u0947\u091c\u093c\u0940" + "'", str8, "\u0905\u0901\u0917\u094d\u0930\u0947\u091c\u093c\u0940");
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
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
    }

    @Test
    public void test16601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16601");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("e!e(Tiiwin                                                                                       ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test16602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16602");
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
        boolean boolean20 = languageRangeList1.containsAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList15);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList22 = java.util.Locale.LanguageRange.parse("Chinese");
        boolean boolean23 = languageRangeList15.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList22);
        java.util.Locale.LanguageRange[] languageRangeArray25 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList26 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList26, languageRangeArray25);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap28 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList29 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList26, strMap28);
        int int30 = languageRangeList26.size();
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor31 = languageRangeList26.listIterator();
        java.util.Locale.LanguageRange languageRange33 = new java.util.Locale.LanguageRange("a");
        java.util.Locale.LanguageRange languageRange35 = new java.util.Locale.LanguageRange("English");
        java.lang.String str37 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) languageRange35, "");
        java.util.Locale.LanguageRange languageRange39 = new java.util.Locale.LanguageRange("English");
        java.util.Locale.LanguageRange[] languageRangeArray40 = new java.util.Locale.LanguageRange[] { languageRange33, languageRange35, languageRange39 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList41 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList41, languageRangeArray40);
        boolean boolean43 = languageRangeList26.retainAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList41);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor44 = languageRangeList41.listIterator();
        boolean boolean45 = languageRangeItor44.hasNext();
        boolean boolean46 = languageRangeItor44.hasNext();
        java.util.Locale.LanguageRange languageRange47 = languageRangeItor44.next();
        java.lang.String str48 = languageRange47.getRange();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange49 = languageRangeList15.set((int) '#', languageRange47);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Size: 0");
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(languageRangeList22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(languageRangeArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(languageRangeList29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(languageRangeItor31);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Locale.LanguageRange" + "'", str37, "Locale.LanguageRange");
        org.junit.Assert.assertNotNull(languageRangeArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(languageRangeItor44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(languageRange47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "a" + "'", str48, "a");
    }

    @Test
    public void test16603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16603");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("IT-CN", "French(France)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test16604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16604");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("Zxxxxxxxxxxxxxxxxxxx", 41);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test16605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16605");
        char[] charArray8 = new char[] {};
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "zh-CN", charArray8);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "a", charArray8);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hEnglish", charArray8);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hindi (HI!,cHINA)", charArray8);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "it", charArray8);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "YT.ZA.ZM.ZW", charArray8);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "\u4e2d\u6587\u4e2d\u570b)", charArray8);
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test16606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16606");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("\u0905\u0901\u0917\u094d\u0930\u0947\u091c\u093c\u0940", "fra");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test16607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16607");
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
        java.util.Spliterator<java.util.Locale.LanguageRange> languageRangeSpliterator69 = languageRangeList62.spliterator();
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap70 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList71 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList62, strMap70);
        java.util.function.UnaryOperator<java.util.Locale.LanguageRange> languageRangeUnaryOperator72 = null;
        // The following exception was thrown during execution in test generation
        try {
            languageRangeList62.replaceAll(languageRangeUnaryOperator72);
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
        org.junit.Assert.assertEquals(locale20.toString(), "it");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Cina" + "'", str21, "Cina");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "zh-CN" + "'", str22, "zh-CN");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "it");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Cina" + "'", str25, "Cina");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "it");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Cina" + "'", str28, "Cina");
        org.junit.Assert.assertEquals(locale32.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "it");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Cina" + "'", str35, "Cina");
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
        org.junit.Assert.assertNotNull(languageRangeSpliterator69);
        org.junit.Assert.assertNotNull(languageRangeList71);
    }

    @Test
    public void test16608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16608");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("###en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist#####", "        dddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd        ", "zh");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist#####" + "'", str3, "###en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist#####");
    }

    @Test
    public void test16609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16609");
        char[] charArray10 = new char[] {};
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "zh-CN", charArray10);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "a", charArray10);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "  China   ", charArray10);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                 a                  ", charArray10);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\u6cd5\u6587", charArray10);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "Chinaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray10);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny("zh_CN", charArray10);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "zh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CTWzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-C", charArray10);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsAny("\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5...", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test16610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16610");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("eNGLxxxxENGLISHSxxxxENGLISH", "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hEnglish");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test16611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16611");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("...NCNCNCNCNCNCNCNCNCNCARRAYLIST");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=...ncncncncncncncncncncarraylist");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16612");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("GGGGGGGGGGGGGGGGGGGGGGG....XXGLIGGGGGGGGGGGGGGGGGGGGGGG....XXGLIGGGGGGGGGGGGGGGGGGGGGGG....XXGLIGGGGGGGGGGGGGGGGGGGGGGG....XXGLIGGGGGGGGGGGGGGGGGGGGGGG....XXGLIGGGGGGGGGGGGGGGGGGGGGGG....XXGLIGGGGGGGGGGGGGGGGGGGGGGG....XXGLIGGGGGGGGGGGGGGGGGGGGGGG....XXGLIGGGGGGGGGGGGGGGGGGGGGGG....XXGLI", 'u');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "GGGGGGGGGGGGGGGGGGGGGGG....XXGLIGGGGGGGGGGGGGGGGGGGGGGG....XXGLIGGGGGGGGGGGGGGGGGGGGGGG....XXGLIGGGGGGGGGGGGGGGGGGGGGGG....XXGLIGGGGGGGGGGGGGGGGGGGGGGG....XXGLIGGGGGGGGGGGGGGGGGGGGGGG....XXGLIGGGGGGGGGGGGGGGGGGGGGGG....XXGLIGGGGGGGGGGGGGGGGGGGGGGG....XXGLIGGGGGGGGGGGGGGGGGGGGGGG....XXGLI" + "'", str2, "GGGGGGGGGGGGGGGGGGGGGGG....XXGLIGGGGGGGGGGGGGGGGGGGGGGG....XXGLIGGGGGGGGGGGGGGGGGGGGGGG....XXGLIGGGGGGGGGGGGGGGGGGGGGGG....XXGLIGGGGGGGGGGGGGGGGGGGGGGG....XXGLIGGGGGGGGGGGGGGGGGGGGGGG....XXGLIGGGGGGGGGGGGGGGGGGGGGGG....XXGLIGGGGGGGGGGGGGGGGGGGGGGG....XXGLIGGGGGGGGGGGGGGGGGGGGGGG....XXGLI");
    }

    @Test
    public void test16613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16613");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.lang.String str1 = locale0.toLanguageTag();
        java.util.Locale locale2 = locale0.stripExtensions();
        java.lang.String str3 = locale0.getISO3Language();
        java.lang.String str4 = locale0.getISO3Country();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "it" + "'", str1, "it");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "it");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ita" + "'", str3, "ita");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test16614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16614");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("zh-CNenglish", 747);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "zh-CNenglish" + "'", str2, "zh-CNenglish");
    }

    @Test
    public void test16615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16615");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("string[]");
        java.lang.String str2 = locale1.toLanguageTag();
        java.lang.String str3 = locale1.getLanguage();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "und" + "'", str2, "und");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test16616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16616");
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
        java.util.Set<java.lang.String> strSet26 = locale7.getUnicodeLocaleKeys();
        java.lang.String str27 = locale7.getScript();
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals(locale24.toString(), "....english_ZHCINESESE_.");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(strSet26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test16617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16617");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("", 551, "               class java.lang.String               ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "               class java.lang.String                              class java.lang.String                              class java.lang.String                              class java.lang.String                              class java.lang.String                              class java.lang.String                              class java.lang.String                              class java.lang.String                              class java.lang.String                              class java.lang.String                              class java.lang." + "'", str3, "               class java.lang.String                              class java.lang.String                              class java.lang.String                              class java.lang.String                              class java.lang.String                              class java.lang.String                              class java.lang.String                              class java.lang.String                              class java.lang.String                              class java.lang.String                              class java.lang.");
    }

    @Test
    public void test16618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16618");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortClassName("                                                gnalesenic.esenicavaj                                                ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "esenicavaj                                                " + "'", str1, "esenicavaj                                                ");
    }

    @Test
    public void test16619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16619");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("   CINESE    ", 1, (int) '$');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test16620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16620");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("uuuuuuuuuuuuuu...", "zh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CTWzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-", "cn (italianojajajajajajajajajajajajajaj)");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test16621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16621");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageName("\u4e2d\u56fdAD");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AF.AE" + "'", str1, "AF.AE");
    }

    @Test
    public void test16622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16622");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("chi..", 16);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "chi.." + "'", str2, "chi..");
    }

    @Test
    public void test16623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16623");
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
        java.util.Locale locale27 = java.util.Locale.getDefault(category0);
        java.lang.String str29 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) category0, "CHINOIS(CHINE");
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it");
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "inglese" + "'", str6, "inglese");
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "inglese" + "'", str20, "inglese");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "a" + "'", str22, "a");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "German" + "'", str24, "German");
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "de");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Locale.Category" + "'", str29, "Locale.Category");
    }

    @Test
    public void test16624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16624");
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
        java.util.Locale locale26 = new java.util.Locale("I");
        java.lang.String str27 = locale26.getDisplayCountry();
        java.lang.String str28 = locale26.toLanguageTag();
        java.lang.String str29 = locale12.getDisplayScript(locale26);
        java.util.Set<java.lang.Character> charSet30 = locale26.getExtensionKeys();
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
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "de");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals(locale16.toString(), "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "inglese" + "'", str19, "inglese");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "a" + "'", str21, "a");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "German" + "'", str23, "German");
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertEquals(locale26.toString(), "i");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "und" + "'", str28, "und");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(charSet30);
    }

    @Test
    public void test16625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16625");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("zh-cnenglh", "hsiliilgnexxxxxxxxxxxxxxxxxxxxxxxxx", 9);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zh-cnenglh" + "'", str3, "zh-cnenglh");
    }

    @Test
    public void test16626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16626");
        java.util.Locale locale1 = java.util.Locale.CHINA;
        java.util.Set<java.lang.Character> charSet2 = locale1.getExtensionKeys();
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.upperCase("", locale1);
        java.lang.String str4 = locale1.getDisplayLanguage();
        java.lang.String str5 = locale1.toString();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(charSet2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "cinese" + "'", str4, "cinese");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "zh_CN" + "'", str5, "zh_CN");
    }

    @Test
    public void test16627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16627");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("t                                               ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "t                                               " + "'", str1, "t                                               ");
    }

    @Test
    public void test16628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16628");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("rg", 44, "  cn    United Kingdom  cn    United Kingdom  cn    United Kingdom  cn    United Kingdom  cn    United Kingdom  cn    United Kingdom  cn    United Kingdom  cn    United Kingdom  cn    United Kingdom  cn    United Kingdom  cn    United Kingdom  cn    United Kingdom  cn    United Kingdom  cn    United Kingdom  cn    United Kingdom  cn    United Kingdom  cn    United Kingdom  cn    United Kingdom  cn    United Kingdom  cn    United Kingdom  cn    United Kingdom  cn    United Kingdom  cn    United Kingdom  cn    United Kingdom  cn    United Kingdom  cn    United Kingdom  cn    United Kingdom  cn    United Kingdom  cn    United Kingdom  cn    United Kingdom  cn    United Kingdom  cn    United Kingdom  cn    United Kingdom  cn    United Kingdom  cn    ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "rg  cn    United Kingdom  cn    United Kingd" + "'", str3, "rg  cn    United Kingdom  cn    United Kingd");
    }

    @Test
    public void test16629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16629");
        java.util.Locale locale2 = new java.util.Locale("china_CN                             ese(Taiwan", "   Z");
        java.lang.String str3 = locale2.getDisplayLanguage();
        java.lang.String str4 = locale2.getDisplayLanguage();
        org.junit.Assert.assertEquals(locale2.toString(), "china_cn                             ese(taiwan_   Z");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "china_cn                             ese(taiwan" + "'", str3, "china_cn                             ese(taiwan");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "china_cn                             ese(taiwan" + "'", str4, "china_cn                             ese(taiwan");
    }

    @Test
    public void test16630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16630");
        java.util.Locale locale2 = new java.util.Locale("LOCLE.LNGUGERNGE");
        java.lang.String str3 = locale2.getDisplayScript();
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.upperCase("", locale2);
        java.util.Locale.setDefault(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "locle.lngugernge");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test16631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16631");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("", "\u4e2d\u56fdAD", 42);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test16632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16632");
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
        java.util.Spliterator<java.util.Locale.LanguageRange> languageRangeSpliterator71 = languageRangeList1.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange73 = languageRangeList1.remove(7);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 7, Size: 0");
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
        org.junit.Assert.assertEquals(locale16.toString(), "locle.lngugernge");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "China" + "'", str17, "China");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "zh-CN" + "'", str18, "zh-CN");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "locle.lngugernge");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "China" + "'", str21, "China");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "locle.lngugernge");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "China" + "'", str24, "China");
        org.junit.Assert.assertEquals(locale28.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "locle.lngugernge");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "China" + "'", str31, "China");
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
        org.junit.Assert.assertNotNull(languageRangeSpliterator71);
    }

    @Test
    public void test16633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16633");
        java.util.Locale locale1 = new java.util.Locale("zh-cnenglish");
        java.lang.String str2 = locale1.getDisplayScript();
        org.junit.Assert.assertEquals(locale1.toString(), "zh-cnenglish");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test16634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16634");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("aaaaaaaaa$");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaa$" + "'", str1, "aaaaaaaaa$");
    }

    @Test
    public void test16635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16635");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("an       aan       aan       aan       aan       aan       aan       aan       aan       aan       aan       aan       aan       aan       aan       aan       aan       aan       aan       aan       aan       aan       aan       aan       aan       aan       aan       aan       aan       aan       aan       aan       aan       aan       aan       a", 32);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " aan       aan       aan       a" + "'", str2, " aan       aan       aan       a");
    }

    @Test
    public void test16636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16636");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "anglais (Canada)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test16637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16637");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaCinaxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", 43, 98);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test16638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16638");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("GNE", 24);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test16639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16639");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("AHI!HI!                                      .......................................................", "\u0939\u093f\u0902\u0926\u0940 (HI!,cHINA)              ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AHI!HI!                                      ......................................................." + "'", str2, "AHI!HI!                                      .......................................................");
    }

    @Test
    public void test16640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16640");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("HArrayList", "CHNAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "rrayList" + "'", str2, "rrayList");
    }

    @Test
    public void test16641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16641");
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
        boolean boolean15 = languageRangeItor13.hasNext();
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test16642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16642");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) ".", (java.lang.CharSequence) "\u0939\u093f\u0902\u0926\u0940");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test16643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16643");
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
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join((java.util.Iterator<java.util.Locale.LanguageRange>) languageRangeItor11, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Locale.LanguageRange" + "'", str3, "Locale.LanguageRange");
        org.junit.Assert.assertNotNull(languageRangeArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(languageRangeItor11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.util" + "'", str13, "java.util");
        org.junit.Assert.assertNotNull(languageRange14);
    }

    @Test
    public void test16644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16644");
        char[] charArray4 = new char[] {};
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray4);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "twn", charArray4);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsAny(".....ZHCINESESE", charArray4);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\u5317\u5370\u5ea6\u6587 (hi!,china)", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test16645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16645");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass("CLASS[]", true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: CLASS");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16646");
        java.util.Locale locale2 = new java.util.Locale("it", "cinese");
        java.lang.String str3 = locale2.getDisplayCountry();
        java.util.Locale locale7 = new java.util.Locale("zho", "US");
        java.util.Locale locale8 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str9 = locale7.getDisplayVariant(locale8);
        java.lang.String str10 = locale8.getVariant();
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.upperCase("AD.AE.AF.AG.AI.AL.AM.AN.AO.AQ.AR.AS.AT.AU.AW.AX.AZ.BA.BB.BD.BE.BF.BG.BH.BI.BJ.BL.BM.BN.BO.BQ.BR.BS.BT.BV.BW.BY.BZ.CA.CC.CD.CF.CG.CH.CI.CK.CL.CM.CN.CO.CR.CU.CV.CW.CX.CY.CZ.DE.DJ.DK.DM.DO.DZ.EC.EE.EG.EH.ER.ES.ET.FI.FJ.FK.FM.FO.FR.GA.GB.GD.GE.GF.GG.GH.GI.GL.GM.GN.GP.GQ.GR.GS.GT.GU.GW.GY.HK.HM.HN.HR.HT.HU.ID.IE.IL.IM.IN.IO.IQ.IR.IS.IT.JE.JM.JO.JP.KE.KG.KH.KI.KM.KN.KP.KR.KW.KY.KZ.LA.LB.LC.LI.LK.LR.LS.LT.LU.LV.LY.MA.MC.MD.ME.MF.MG.MH.MK.ML.MM.MN.MO.MP.MQ.MR.MS.MT.MU.MV.MW.MX.MY.MZ.NA.NC.NE.NF.NG.NI.NL.NO.NP.NR.NU.NZ.OM.PA.PE.PF.PG.PH.PK.PL.PM.PN.PR.PS.PT.PW.PY.QA.RE.RO.RS.RU.RW.SA.SB.SC.SD.SE.SG.SH.SI.SJ.SK.SL.SM.SN.SO.SR.SS.ST.SV.SX.SY.SZ.TC.TD.TF.TG.TH.TJ.TK.TL.TM.TN.TO.TR.TT.TV.TW.TZ.UA.UG.UM.US.UY.UZ.VA.VC.VE.VG.VI.VN.VU.WF.WS.YE.YT.ZA.ZM.ZW", locale8);
        java.lang.String str12 = locale8.getCountry();
        java.lang.String str13 = locale2.getDisplayScript(locale8);
        java.lang.String str14 = locale8.toLanguageTag();
        org.junit.Assert.assertEquals(locale2.toString(), "it_CINESE");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CINESE" + "'", str3, "CINESE");
        org.junit.Assert.assertEquals(locale7.toString(), "zho_US");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "AD.AE.AF.AG.AI.AL.AM.AN.AO.AQ.AR.AS.AT.AU.AW.AX.AZ.BA.BB.BD.BE.BF.BG.BH.BI.BJ.BL.BM.BN.BO.BQ.BR.BS.BT.BV.BW.BY.BZ.CA.CC.CD.CF.CG.CH.CI.CK.CL.CM.CN.CO.CR.CU.CV.CW.CX.CY.CZ.DE.DJ.DK.DM.DO.DZ.EC.EE.EG.EH.ER.ES.ET.FI.FJ.FK.FM.FO.FR.GA.GB.GD.GE.GF.GG.GH.GI.GL.GM.GN.GP.GQ.GR.GS.GT.GU.GW.GY.HK.HM.HN.HR.HT.HU.ID.IE.IL.IM.IN.IO.IQ.IR.IS.IT.JE.JM.JO.JP.KE.KG.KH.KI.KM.KN.KP.KR.KW.KY.KZ.LA.LB.LC.LI.LK.LR.LS.LT.LU.LV.LY.MA.MC.MD.ME.MF.MG.MH.MK.ML.MM.MN.MO.MP.MQ.MR.MS.MT.MU.MV.MW.MX.MY.MZ.NA.NC.NE.NF.NG.NI.NL.NO.NP.NR.NU.NZ.OM.PA.PE.PF.PG.PH.PK.PL.PM.PN.PR.PS.PT.PW.PY.QA.RE.RO.RS.RU.RW.SA.SB.SC.SD.SE.SG.SH.SI.SJ.SK.SL.SM.SN.SO.SR.SS.ST.SV.SX.SY.SZ.TC.TD.TF.TG.TH.TJ.TK.TL.TM.TN.TO.TR.TT.TV.TW.TZ.UA.UG.UM.US.UY.UZ.VA.VC.VE.VG.VI.VN.VU.WF.WS.YE.YT.ZA.ZM.ZW" + "'", str11, "AD.AE.AF.AG.AI.AL.AM.AN.AO.AQ.AR.AS.AT.AU.AW.AX.AZ.BA.BB.BD.BE.BF.BG.BH.BI.BJ.BL.BM.BN.BO.BQ.BR.BS.BT.BV.BW.BY.BZ.CA.CC.CD.CF.CG.CH.CI.CK.CL.CM.CN.CO.CR.CU.CV.CW.CX.CY.CZ.DE.DJ.DK.DM.DO.DZ.EC.EE.EG.EH.ER.ES.ET.FI.FJ.FK.FM.FO.FR.GA.GB.GD.GE.GF.GG.GH.GI.GL.GM.GN.GP.GQ.GR.GS.GT.GU.GW.GY.HK.HM.HN.HR.HT.HU.ID.IE.IL.IM.IN.IO.IQ.IR.IS.IT.JE.JM.JO.JP.KE.KG.KH.KI.KM.KN.KP.KR.KW.KY.KZ.LA.LB.LC.LI.LK.LR.LS.LT.LU.LV.LY.MA.MC.MD.ME.MF.MG.MH.MK.ML.MM.MN.MO.MP.MQ.MR.MS.MT.MU.MV.MW.MX.MY.MZ.NA.NC.NE.NF.NG.NI.NL.NO.NP.NR.NU.NZ.OM.PA.PE.PF.PG.PH.PK.PL.PM.PN.PR.PS.PT.PW.PY.QA.RE.RO.RS.RU.RW.SA.SB.SC.SD.SE.SG.SH.SI.SJ.SK.SL.SM.SN.SO.SR.SS.ST.SV.SX.SY.SZ.TC.TD.TF.TG.TH.TJ.TK.TL.TM.TN.TO.TR.TT.TV.TW.TZ.UA.UG.UM.US.UY.UZ.VA.VC.VE.VG.VI.VN.VU.WF.WS.YE.YT.ZA.ZM.ZW");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "CA" + "'", str12, "CA");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "fr-CA" + "'", str14, "fr-CA");
    }

    @Test
    public void test16647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16647");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("$ (JAVA.LANG)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "$ (JAVA.LANG)" + "'", str1, "$ (JAVA.LANG)");
    }

    @Test
    public void test16648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16648");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("\u82f1\u8a9e\u30ab\u30ca\u30c0)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u82f1\u8a9e\u30ab\u30ca\u30c0)" + "'", str1, "\u82f1\u8a9e\u30ab\u30ca\u30c0)");
    }

    @Test
    public void test16649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16649");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("chinois (Chine)", "NENENENENENENENENENE");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "chinois (Chine)" + "'", str2, "chinois (Chine)");
    }

    @Test
    public void test16650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16650");
        java.util.Locale locale2 = new java.util.Locale("italiano", "Ci_a");
        java.util.Locale locale6 = new java.util.Locale("Canada", "allemand", "cHINA");
        java.lang.String str7 = locale2.getDisplayName(locale6);
        java.util.Set<java.lang.Character> charSet8 = locale2.getExtensionKeys();
        java.lang.String str10 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) locale2, "in");
        org.junit.Assert.assertEquals(locale2.toString(), "italiano_CI_A");
        org.junit.Assert.assertEquals(locale6.toString(), "canada_ALLEMAND_cHINA");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "italiano (CI_A)" + "'", str7, "italiano (CI_A)");
        org.junit.Assert.assertNotNull(charSet8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Locale" + "'", str10, "Locale");
    }

    @Test
    public void test16651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16651");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "francese");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test16652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16652");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageName("xxxxxxx");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test16653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16653");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("", "ChnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaChnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaChnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaChnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaChnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaChnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaChnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaChnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaChnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "xxxxxxxxxxxxxxJapanesexxxxxxxxxxxxxx");
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test16654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16654");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "HINDI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test16655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16655");
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
        boolean boolean24 = languageRangeList11.remove((java.lang.Object) "A");
        java.lang.Object[] objArray25 = languageRangeList11.toArray();
        int int27 = languageRangeList11.indexOf((java.lang.Object) "ja");
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream28 = languageRangeList11.stream();
        java.util.List<java.util.Locale.LanguageRange> languageRangeList30 = java.util.Locale.LanguageRange.parse("hi");
        boolean boolean32 = languageRangeList30.remove((java.lang.Object) "English");
        java.util.Locale.LanguageRange languageRange34 = languageRangeList30.get(0);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor35 = languageRangeList30.listIterator();
        java.util.Locale.LanguageRange languageRange36 = languageRangeItor35.next();
        boolean boolean37 = languageRangeList11.add(languageRange36);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor38 = languageRangeList11.listIterator();
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(languageRangeStream28);
        org.junit.Assert.assertNotNull(languageRangeList30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(languageRange34);
        org.junit.Assert.assertNotNull(languageRangeItor35);
        org.junit.Assert.assertNotNull(languageRange36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(languageRangeItor38);
    }

    @Test
    public void test16656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16656");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("TRING[]TRIAD.AE.AF.A", "444444444444444444444444444444444", 27);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test16657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16657");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("hi");
        java.lang.Object[] objArray2 = languageRangeList1.toArray();
        java.util.Spliterator<java.util.Locale.LanguageRange> languageRangeSpliterator3 = languageRangeList1.spliterator();
        java.util.Locale.Builder builder4 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        java.util.Locale.Builder builder7 = builder5.setLanguageTag("zh-CN");
        java.util.Locale locale8 = builder5.build();
        boolean boolean9 = languageRangeList1.remove((java.lang.Object) locale8);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList11 = java.util.Locale.LanguageRange.parse("hi");
        java.util.Locale.LanguageRange[] languageRangeArray12 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList13 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList13, languageRangeArray12);
        java.util.Locale locale16 = java.util.Locale.FRANCE;
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale16);
        java.util.Locale locale18 = java.util.Locale.US;
        java.util.Locale locale19 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale20 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale21 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale22 = java.util.Locale.getDefault();
        java.lang.String str23 = locale21.getDisplayCountry(locale22);
        java.lang.String str24 = locale21.toLanguageTag();
        java.util.Locale locale25 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale26 = java.util.Locale.getDefault();
        java.lang.String str27 = locale25.getDisplayCountry(locale26);
        java.util.Locale locale28 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale29 = java.util.Locale.getDefault();
        java.lang.String str30 = locale28.getDisplayCountry(locale29);
        java.util.Locale locale34 = new java.util.Locale("hi", "hi!", "cHINA");
        java.util.Locale locale35 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale36 = java.util.Locale.getDefault();
        java.lang.String str37 = locale35.getDisplayCountry(locale36);
        java.util.Locale locale39 = new java.util.Locale("");
        java.lang.String str40 = locale39.getDisplayVariant();
        java.util.Locale locale41 = java.util.Locale.KOREAN;
        java.util.Locale locale43 = new java.util.Locale("");
        java.util.Locale locale44 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale[] localeArray45 = new java.util.Locale[] { locale16, locale18, locale19, locale20, locale21, locale26, locale28, locale34, locale36, locale39, locale41, locale43, locale44 };
        java.util.ArrayList<java.util.Locale> localeList46 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList46, localeArray45);
        java.util.List<java.util.Locale> localeList48 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList13, (java.util.Collection<java.util.Locale>) localeList46);
        java.lang.String[] strArray56 = new java.lang.String[] { "English", "hi", "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "", "a", "", "China" };
        java.util.ArrayList<java.lang.String> strList57 = new java.util.ArrayList<java.lang.String>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList57, strArray56);
        java.util.List<java.lang.Class<?>> wildcardClassList59 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList57);
        java.util.Locale.FilteringMode filteringMode60 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList61 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList13, (java.util.Collection<java.lang.String>) strList57, filteringMode60);
        java.util.Spliterator<java.util.Locale.LanguageRange> languageRangeSpliterator62 = languageRangeList13.spliterator();
        boolean boolean63 = languageRangeList11.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList13);
        boolean boolean64 = languageRangeList1.retainAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList13);
        java.util.Spliterator<java.util.Locale.LanguageRange> languageRangeSpliterator65 = languageRangeList1.spliterator();
        java.util.Spliterator<java.util.Locale.LanguageRange> languageRangeSpliterator66 = languageRangeList1.spliterator();
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(languageRangeSpliterator3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh_CN");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(languageRangeList11);
        org.junit.Assert.assertNotNull(languageRangeArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "english" + "'", str17, "english");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "locle.lngugernge");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "China" + "'", str23, "China");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "zh-CN" + "'", str24, "zh-CN");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "locle.lngugernge");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "China" + "'", str27, "China");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "locle.lngugernge");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "China" + "'", str30, "China");
        org.junit.Assert.assertEquals(locale34.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "locle.lngugernge");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "China" + "'", str37, "China");
        org.junit.Assert.assertEquals(locale39.toString(), "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "ko");
        org.junit.Assert.assertEquals(locale43.toString(), "");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(localeList48);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(wildcardClassList59);
        org.junit.Assert.assertTrue("'" + filteringMode60 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode60.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList61);
        org.junit.Assert.assertNotNull(languageRangeSpliterator62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(languageRangeSpliterator65);
        org.junit.Assert.assertNotNull(languageRangeSpliterator66);
    }

    @Test
    public void test16658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16658");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("alienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalien");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=alienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalien");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16659");
        java.util.Locale locale1 = new java.util.Locale("");
        java.util.Set<java.lang.String> strSet2 = locale1.getUnicodeLocaleKeys();
        boolean boolean3 = locale1.hasExtensions();
        java.util.Locale.setDefault(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test16660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16660");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("44444444ENGLTWNSTWN44444444", 563);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        44444444ENGLTWNSTWN44444444" + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        44444444ENGLTWNSTWN44444444");
    }

    @Test
    public void test16661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16661");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "ACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINA", "cNn");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test16662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16662");
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
        java.util.Locale.LanguageRange languageRange30 = new java.util.Locale.LanguageRange("English");
        java.lang.String str32 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) languageRange30, "");
        languageRangeList23.add((int) (byte) 0, languageRange30);
        java.util.Locale.LanguageRange[] languageRangeArray34 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList35 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList35, languageRangeArray34);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap37 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList38 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList35, strMap37);
        int int39 = languageRangeList35.size();
        java.util.List<java.util.Locale.LanguageRange> languageRangeList41 = java.util.Locale.LanguageRange.parse("hi");
        boolean boolean43 = languageRangeList41.remove((java.lang.Object) "English");
        boolean boolean44 = languageRangeList35.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList41);
        int int45 = languageRangeList41.size();
        languageRangeList41.clear();
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor47 = languageRangeList41.listIterator();
        boolean boolean48 = languageRange30.equals((java.lang.Object) languageRangeList41);
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
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Locale.LanguageRange" + "'", str32, "Locale.LanguageRange");
        org.junit.Assert.assertNotNull(languageRangeArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(languageRangeList38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(languageRangeList41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertNotNull(languageRangeItor47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test16663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16663");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("Chinese(China)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Chinese(China)" + "'", str1, "Chinese(China)");
    }

    @Test
    public void test16664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16664");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("cNn", 'x');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test16665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16665");
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
        boolean boolean11 = languageRangeList1.isEmpty();
        int int12 = languageRangeList1.size();
        java.util.Locale.LanguageRange languageRange14 = new java.util.Locale.LanguageRange("cn");
        double double15 = languageRange14.getWeight();
        java.lang.String str16 = languageRange14.getRange();
        boolean boolean17 = languageRangeList1.add(languageRange14);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList20 = languageRangeList1.subList(120, 81);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 81");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(classArray7);
        org.junit.Assert.assertNotNull(wildcardClassArray8);
        org.junit.Assert.assertNotNull(wildcardClassArray9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "cn" + "'", str16, "cn");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test16666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16666");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str3 = locale2.getDisplayLanguage();
        java.lang.String str4 = locale2.getDisplayScript();
        java.util.Locale.setDefault(category0, locale2);
        java.util.Locale locale6 = java.util.Locale.getDefault(category0);
        java.lang.String str7 = locale6.getDisplayVariant();
        java.util.Locale locale9 = new java.util.Locale("I");
        java.util.Locale locale10 = locale9.stripExtensions();
        java.lang.String str11 = locale6.getDisplayLanguage(locale10);
        java.util.Set<java.lang.Character> charSet12 = locale10.getExtensionKeys();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Chinese" + "'", str3, "Chinese");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals(locale9.toString(), "i");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "i");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Chinese" + "'", str11, "Chinese");
        org.junit.Assert.assertNotNull(charSet12);
    }

    @Test
    public void test16667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16667");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "ENGLTWNSTWN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ENGLTWNSTWN" + "'", str1, "ENGLTWNSTWN");
    }

    @Test
    public void test16668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16668");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("it", strMap1);
        languageRangeList2.clear();
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
        java.util.Locale.LanguageRange[] languageRangeArray21 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList22 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList22, languageRangeArray21);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap24 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList25 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList22, strMap24);
        java.util.Locale.LanguageRange[] languageRangeArray26 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList27 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList27, languageRangeArray26);
        boolean boolean29 = languageRangeList22.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList27);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream30 = languageRangeList27.stream();
        boolean boolean31 = languageRangeList8.containsAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList27);
        java.util.Locale.LanguageRange languageRange33 = new java.util.Locale.LanguageRange("English");
        java.lang.String str34 = languageRange33.getRange();
        boolean boolean35 = languageRangeList8.add(languageRange33);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor37 = languageRangeList8.listIterator(0);
        boolean boolean38 = languageRangeList2.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList8);
        java.util.Locale.LanguageRange[] languageRangeArray39 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList40 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList40, languageRangeArray39);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap42 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList43 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList40, strMap42);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream44 = languageRangeList40.stream();
        boolean boolean45 = languageRangeList40.isEmpty();
        languageRangeList40.clear();
        org.apache.commons.lang3.StringUtils stringUtils47 = new org.apache.commons.lang3.StringUtils();
        org.apache.commons.lang3.StringUtils stringUtils48 = new org.apache.commons.lang3.StringUtils();
        org.apache.commons.lang3.StringUtils stringUtils49 = new org.apache.commons.lang3.StringUtils();
        org.apache.commons.lang3.StringUtils stringUtils50 = new org.apache.commons.lang3.StringUtils();
        org.apache.commons.lang3.StringUtils[] stringUtilsArray51 = new org.apache.commons.lang3.StringUtils[] { stringUtils47, stringUtils48, stringUtils49, stringUtils50 };
        org.apache.commons.lang3.StringUtils stringUtils52 = new org.apache.commons.lang3.StringUtils();
        org.apache.commons.lang3.StringUtils stringUtils53 = new org.apache.commons.lang3.StringUtils();
        org.apache.commons.lang3.StringUtils stringUtils54 = new org.apache.commons.lang3.StringUtils();
        org.apache.commons.lang3.StringUtils stringUtils55 = new org.apache.commons.lang3.StringUtils();
        org.apache.commons.lang3.StringUtils[] stringUtilsArray56 = new org.apache.commons.lang3.StringUtils[] { stringUtils52, stringUtils53, stringUtils54, stringUtils55 };
        org.apache.commons.lang3.StringUtils stringUtils57 = new org.apache.commons.lang3.StringUtils();
        org.apache.commons.lang3.StringUtils stringUtils58 = new org.apache.commons.lang3.StringUtils();
        org.apache.commons.lang3.StringUtils stringUtils59 = new org.apache.commons.lang3.StringUtils();
        org.apache.commons.lang3.StringUtils stringUtils60 = new org.apache.commons.lang3.StringUtils();
        org.apache.commons.lang3.StringUtils[] stringUtilsArray61 = new org.apache.commons.lang3.StringUtils[] { stringUtils57, stringUtils58, stringUtils59, stringUtils60 };
        org.apache.commons.lang3.StringUtils stringUtils62 = new org.apache.commons.lang3.StringUtils();
        org.apache.commons.lang3.StringUtils stringUtils63 = new org.apache.commons.lang3.StringUtils();
        org.apache.commons.lang3.StringUtils stringUtils64 = new org.apache.commons.lang3.StringUtils();
        org.apache.commons.lang3.StringUtils stringUtils65 = new org.apache.commons.lang3.StringUtils();
        org.apache.commons.lang3.StringUtils[] stringUtilsArray66 = new org.apache.commons.lang3.StringUtils[] { stringUtils62, stringUtils63, stringUtils64, stringUtils65 };
        org.apache.commons.lang3.StringUtils[][] stringUtilsArray67 = new org.apache.commons.lang3.StringUtils[][] { stringUtilsArray51, stringUtilsArray56, stringUtilsArray61, stringUtilsArray66 };
        org.apache.commons.lang3.StringUtils[][] stringUtilsArray68 = languageRangeList40.toArray(stringUtilsArray67);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.StringUtils[][] stringUtilsArray69 = languageRangeList8.toArray(stringUtilsArray67);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException; message: null");
        } catch (java.lang.ArrayStoreException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(languageRangeList8);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClassList19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(languageRangeArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(languageRangeList25);
        org.junit.Assert.assertNotNull(languageRangeArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(languageRangeStream30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "english" + "'", str34, "english");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(languageRangeItor37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(languageRangeArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(languageRangeList43);
        org.junit.Assert.assertNotNull(languageRangeStream44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(stringUtilsArray51);
        org.junit.Assert.assertNotNull(stringUtilsArray56);
        org.junit.Assert.assertNotNull(stringUtilsArray61);
        org.junit.Assert.assertNotNull(stringUtilsArray66);
        org.junit.Assert.assertNotNull(stringUtilsArray67);
        org.junit.Assert.assertNotNull(stringUtilsArray68);
    }

    @Test
    public void test16669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16669");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "cnncnncnnlocale.Buildercnncnncnnc", "RGLA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test16670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16670");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("hi!hi!hi!hi!hi!hZH_z!hi!hi!hi!hi!hi44444444444444444444444444444444444444444444444444444444444444", "slgnEslgnEslgnEfran\347ais (Canada)slgnEslgnEslgnEs");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test16671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16671");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b)", 32, (int) 'u');
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 119 + "'", int3 == 119);
    }

    @Test
    public void test16672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16672");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("HArrayLi", "Ci_aCi_aCi_aCi_aCi_aCi_aCi_aCi_aCi_aCi_");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test16673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16673");
        java.util.Locale locale3 = new java.util.Locale("");
        java.lang.String str4 = locale3.getDisplayLanguage();
        java.util.Locale locale5 = java.util.Locale.CANADA;
        java.lang.String str6 = locale5.getDisplayLanguage();
        java.lang.String str7 = locale3.getDisplayScript(locale5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.lowerCase("A", locale5);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.lowerCase("china", locale5);
        java.lang.String str10 = locale5.getScript();
        java.lang.String str11 = locale5.getDisplayScript();
        java.lang.String str12 = locale5.getCountry();
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u82f1\u6587" + "'", str6, "\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "a" + "'", str8, "a");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "china" + "'", str9, "china");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "CA" + "'", str12, "CA");
    }

    @Test
    public void test16674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16674");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16675");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.setLanguageTag("zh-CN");
        java.util.Locale.Builder builder5 = builder3.setLanguage("it");
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        java.util.Locale locale7 = builder6.build();
        java.util.Locale locale8 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale9 = java.util.Locale.getDefault();
        java.lang.String str10 = locale8.getDisplayCountry(locale9);
        java.lang.String str11 = locale8.toLanguageTag();
        java.lang.String str12 = locale8.getCountry();
        java.lang.String str13 = locale8.getISO3Country();
        java.util.Locale locale15 = new java.util.Locale("");
        java.lang.String str16 = locale15.getDisplayVariant();
        java.lang.String str17 = locale8.getDisplayLanguage(locale15);
        java.util.Locale locale18 = locale15.stripExtensions();
        java.lang.String str19 = locale7.getDisplayLanguage(locale18);
        java.lang.String str20 = locale7.getCountry();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "it_CN");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "China" + "'", str10, "China");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "zh-CN" + "'", str11, "zh-CN");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "CN" + "'", str12, "CN");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "CHN" + "'", str13, "CHN");
        org.junit.Assert.assertEquals(locale15.toString(), "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Chinese" + "'", str17, "Chinese");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Italian" + "'", str19, "Italian");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "CN" + "'", str20, "CN");
    }

    @Test
    public void test16676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16676");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "unduhar[]undu");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test16677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16677");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("eN", 43, 211);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "eN" + "'", str3, "eN");
    }

    @Test
    public void test16678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16678");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("collecti", "ITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITFRITLITALIAHi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test16679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16679");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("ChinChinChinChinChinChinChinChinChinaaaaaaaaa.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=chinchinchinchinchinchinchinchinchinaaaaaaaaa.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16680");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("Locale.Builder");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "LOCALE.BUILDER" + "'", str1, "LOCALE.BUILDER");
    }

    @Test
    public void test16681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16681");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("Chinese (China)", ' ');
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", strArray4);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.split("zh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CTWzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-C", '$');
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny("ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", strArray11);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny("French (France)", strArray11);
        java.lang.String[] strArray17 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("EnglTWNsTWN", "....english", (int) (short) 0);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray17);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.replaceEach("CHINOIS(CHINE)", strArray11, strArray17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = org.apache.commons.lang3.StringUtils.replaceEach("cines                                                                                                                                                                                                                                                                                  ", strArray4, strArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 2 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "EnglTWNsTWN" + "'", str18, "EnglTWNsTWN");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "CHINOIS(CHINE)" + "'", str19, "CHINOIS(CHINE)");
    }

    @Test
    public void test16682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16682");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("44444444ENGLTWNSTWN44444444", 22, 19);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test16683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16683");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("A", "\u82f1\u6587\u52a0\u62ff\u5927)", 20);
        java.lang.Class<?>[] wildcardClassArray5 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray4);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.split("Engls", '#');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray8, '4', (int) (short) 0, 1);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("fra", strArray4, strArray8);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "string");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(wildcardClassArray5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Engls" + "'", str12, "Engls");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "fra" + "'", str13, "fra");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "A" + "'", str15, "A");
    }

    @Test
    public void test16684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16684");
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
        int int87 = languageRangeList7.size();
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
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
    }

    @Test
    public void test16685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16685");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("", "44444444444444444444444444444444444444java.uil", (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test16686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16686");
        java.util.Locale locale1 = java.util.Locale.TAIWAN;
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("", locale1);
        java.lang.String str3 = locale1.getISO3Country();
        boolean boolean4 = locale1.hasExtensions();
        boolean boolean5 = locale1.hasExtensions();
        java.util.Locale locale6 = java.util.Locale.PRC;
        java.lang.String str7 = locale6.getVariant();
        java.lang.String str8 = locale6.getDisplayVariant();
        java.lang.String str9 = locale1.getDisplayLanguage(locale6);
        java.lang.String str10 = locale1.getISO3Country();
        java.lang.String str11 = locale1.getCountry();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "TWN" + "'", str3, "TWN");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u4e2d\u6587" + "'", str9, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "TWN" + "'", str10, "TWN");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "TW" + "'", str11, "TW");
    }

    @Test
    public void test16687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16687");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("#################################################################################################", "ia", 747);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test16688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16688");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("zho", "");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '4');
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "zho" + "'", str5, "zho");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test16689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16689");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                      )JAJAJAJAJAJAJAJAJAJAJAJAJAJONAILATI( nc                     ", "ENGL....ENGLISHS....ENGLISH", (int) ' ');
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test16690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16690");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("          xxxxxxx", "WT_hz");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "          xxxxxxx" + "'", str2, "          xxxxxxx");
    }

    @Test
    public void test16691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16691");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("][gnirts", "                                             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test16692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16692");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("         HI!HI!HI!HI!HI!HI          ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=         hi!hi!hi!hi!hi!hi          ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16693");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("        ");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test16694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16694");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("            locale.builder             ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=locale.builder");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16695");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale locale4 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str5 = locale4.getISO3Language();
        java.util.Locale.Builder builder6 = builder3.setLocale(locale4);
        java.util.Locale.Builder builder7 = builder3.clear();
        java.util.Locale.Builder builder8 = builder7.clear();
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
    public void test16696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16696");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\u82f1\u6587\u7f8e\u570b)");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test16697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16697");
        java.util.Locale locale1 = new java.util.Locale("");
        java.lang.String str2 = locale1.getDisplayVariant();
        java.lang.String str4 = locale1.getExtension('a');
        java.lang.String str5 = locale1.getDisplayVariant();
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test16698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16698");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("ja");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test16699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16699");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.setLanguageTag("zh-CN");
        java.util.Locale locale4 = builder1.build();
        java.lang.String str6 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) builder1, "Chine");
        java.util.Locale.Builder builder7 = builder1.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder7.setScript("                                                                                   HINDI (HI!,CHINA)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script:                                                                                    HINDI (HI!,CHINA) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Locale.Builder" + "'", str6, "Locale.Builder");
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test16700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16700");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("UNDAAAAAAA", "ISTFRAHARRAYLISTFRAHARRAYLISTFRAHARRAYLISTFRAHARRAYLISTFRAHARRAYLISTFRAHARRAYLISTFRAHARRAYLIST");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test16701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16701");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxaniCxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxaniCxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxaniCxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxaniCxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxaniC");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test16702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16702");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("LOCLE.LNGUGERNGE", 1, 2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "OC" + "'", str3, "OC");
    }

    @Test
    public void test16703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16703");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                 ...inglese (Cnd)xxxxxxxx                                 ", "hindi (HI!,cHINA)");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test16704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16704");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("Cnxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", 35);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Cnxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx " + "'", str2, "Cnxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx ");
    }

    @Test
    public void test16705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16705");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                                                                                 ", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test16706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16706");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale.Builder builder3 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder5 = builder1.setRegion("zh");
        java.util.Locale locale6 = java.util.Locale.ITALIAN;
        java.util.Locale locale8 = new java.util.Locale("");
        java.lang.String str9 = locale8.getDisplayLanguage();
        java.util.Locale locale10 = java.util.Locale.CANADA;
        java.lang.String str11 = locale10.getDisplayLanguage();
        java.lang.String str12 = locale8.getDisplayScript(locale10);
        java.util.Locale locale14 = java.util.Locale.FRANCE;
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale14);
        java.lang.String str16 = locale8.getDisplayCountry(locale14);
        java.lang.String str17 = locale6.getDisplayScript(locale8);
        java.lang.String str18 = locale8.getDisplayCountry();
        java.lang.String str19 = locale8.getCountry();
        java.util.Locale locale20 = java.util.Locale.ITALIAN;
        java.lang.String str21 = locale20.getLanguage();
        java.lang.String str22 = locale20.getLanguage();
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
        java.util.Locale.setDefault(locale23);
        java.util.Locale locale39 = new java.util.Locale("hi", "hi!", "cHINA");
        java.util.Locale locale40 = java.util.Locale.ITALIAN;
        java.util.Locale locale42 = new java.util.Locale("");
        java.lang.String str43 = locale42.getDisplayLanguage();
        java.util.Locale locale44 = java.util.Locale.CANADA;
        java.lang.String str45 = locale44.getDisplayLanguage();
        java.lang.String str46 = locale42.getDisplayScript(locale44);
        java.util.Locale locale48 = java.util.Locale.FRANCE;
        java.lang.String str49 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale48);
        java.lang.String str50 = locale42.getDisplayCountry(locale48);
        java.lang.String str51 = locale40.getDisplayScript(locale42);
        java.util.Locale.setDefault(locale40);
        java.lang.String str53 = locale39.getDisplayVariant(locale40);
        java.lang.String str54 = locale23.getDisplayLanguage(locale40);
        java.lang.String str55 = locale20.getDisplayLanguage(locale40);
        java.util.Locale locale56 = locale40.stripExtensions();
        java.util.Locale locale57 = java.util.Locale.ITALIAN;
        java.util.Locale locale59 = new java.util.Locale("");
        java.lang.String str60 = locale59.getDisplayLanguage();
        java.util.Locale locale61 = java.util.Locale.CANADA;
        java.lang.String str62 = locale61.getDisplayLanguage();
        java.lang.String str63 = locale59.getDisplayScript(locale61);
        java.util.Locale locale65 = java.util.Locale.FRANCE;
        java.lang.String str66 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale65);
        java.lang.String str67 = locale59.getDisplayCountry(locale65);
        java.lang.String str68 = locale57.getDisplayScript(locale59);
        java.util.Locale locale69 = java.util.Locale.GERMAN;
        java.lang.String str70 = locale59.getDisplayLanguage(locale69);
        java.util.Locale locale73 = new java.util.Locale("");
        java.lang.String str74 = locale73.getDisplayLanguage();
        java.util.Locale locale75 = java.util.Locale.CANADA;
        java.lang.String str76 = locale75.getDisplayLanguage();
        java.lang.String str77 = locale73.getDisplayScript(locale75);
        java.lang.String str78 = org.apache.commons.lang3.StringUtils.lowerCase("a", locale73);
        java.lang.String str79 = locale73.getDisplayScript();
        java.lang.String str80 = locale69.getDisplayLanguage(locale73);
        java.lang.String str81 = locale40.getDisplayName(locale73);
        java.lang.String str83 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) locale40, "ese (Taiwan$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        java.lang.String str84 = locale8.getDisplayCountry(locale40);
        java.util.Locale.Builder builder85 = builder5.setLocale(locale40);
        java.util.Locale locale87 = java.util.Locale.forLanguageTag("ud");
        java.util.Locale locale88 = locale87.stripExtensions();
        java.lang.String str89 = locale40.getDisplayLanguage(locale87);
        java.lang.String str90 = locale87.getISO3Country();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "it");
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\u82f1\u6587" + "'", str11, "\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "english" + "'", str15, "english");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "it");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "it" + "'", str21, "it");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "it" + "'", str22, "it");
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
        org.junit.Assert.assertEquals(locale39.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "it");
        org.junit.Assert.assertEquals(locale42.toString(), "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "inglese" + "'", str45, "inglese");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "english" + "'", str49, "english");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "cHINA" + "'", str53, "cHINA");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "italiano" + "'", str54, "italiano");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "italiano" + "'", str55, "italiano");
        org.junit.Assert.assertNotNull(locale56);
        org.junit.Assert.assertEquals(locale56.toString(), "it");
        org.junit.Assert.assertNotNull(locale57);
        org.junit.Assert.assertEquals(locale57.toString(), "it");
        org.junit.Assert.assertEquals(locale59.toString(), "");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertNotNull(locale61);
        org.junit.Assert.assertEquals(locale61.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "inglese" + "'", str62, "inglese");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertNotNull(locale65);
        org.junit.Assert.assertEquals(locale65.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "english" + "'", str66, "english");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertNotNull(locale69);
        org.junit.Assert.assertEquals(locale69.toString(), "de");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertEquals(locale73.toString(), "");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertNotNull(locale75);
        org.junit.Assert.assertEquals(locale75.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "inglese" + "'", str76, "inglese");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "a" + "'", str78, "a");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "German" + "'", str80, "German");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "Italian" + "'", str81, "Italian");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "Locale" + "'", str83, "Locale");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "" + "'", str84, "");
        org.junit.Assert.assertNotNull(builder85);
        org.junit.Assert.assertNotNull(locale87);
        org.junit.Assert.assertEquals(locale87.toString(), "ud");
        org.junit.Assert.assertNotNull(locale88);
        org.junit.Assert.assertEquals(locale88.toString(), "ud");
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "Italian" + "'", str89, "Italian");
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "" + "'", str90, "");
    }

    @Test
    public void test16707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16707");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("\u82f1\u8a9e\u30ab\u30ca\u30c0)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u82f1\u8a9e\u30ab\u30ca\u30c0)" + "'", str1, "\u82f1\u8a9e\u30ab\u30ca\u30c0)");
    }

    @Test
    public void test16708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16708");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale locale3 = builder2.build();
        java.lang.String str4 = locale3.toLanguageTag();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = locale3.getUnicodeLocaleType("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "und" + "'", str4, "und");
    }

    @Test
    public void test16709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16709");
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
        java.util.Locale.Builder builder23 = builder20.removeUnicodeLocaleAttribute("ENG");
        java.util.Locale.Builder builder24 = builder20.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder26 = builder24.setLanguageTag("\u65e5\u6587\u65e5\u6587\u65e5\u6587\u65e5\u6587\u65e5\u6587\u65e5\u6587");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: Engls???????????? [at index 0]");
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "inglese" + "'", str11, "inglese");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "it");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Cina" + "'", str16, "Cina");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder24);
    }

    @Test
    public void test16710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16710");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("                                                                                                                                                                                                                                                   Italian  ", "English                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test16711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16711");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "#################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test16712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16712");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str1 = locale0.getDisplayLanguage();
        java.util.Locale locale2 = java.util.Locale.getDefault();
        java.lang.String str3 = locale0.getDisplayCountry(locale2);
        java.util.Locale locale4 = java.util.Locale.TAIWAN;
        java.lang.String str5 = locale4.getVariant();
        java.lang.String str6 = locale0.getDisplayName(locale4);
        java.lang.String str7 = locale4.toLanguageTag();
        java.util.Locale locale9 = new java.util.Locale("En");
        java.lang.String str10 = locale9.getDisplayLanguage();
        java.lang.String str11 = locale4.getDisplayVariant(locale9);
        java.lang.String str12 = locale9.getDisplayScript();
        java.util.Locale locale16 = new java.util.Locale("CHNAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "en_CA", "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
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
        java.util.Set<java.lang.String> strSet41 = locale33.getUnicodeLocaleAttributes();
        java.lang.String str42 = locale16.getDisplayCountry(locale33);
        java.util.Locale locale44 = new java.util.Locale("");
        java.lang.String str45 = locale44.getDisplayVariant();
        java.lang.String str46 = locale33.getDisplayScript(locale44);
        java.util.Locale locale48 = new java.util.Locale("");
        java.lang.String str49 = locale44.getDisplayCountry(locale48);
        java.lang.String str50 = locale9.getDisplayCountry(locale44);
        java.lang.String str51 = locale44.toLanguageTag();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "cinese" + "'", str1, "cinese");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "it");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Taiwan" + "'", str3, "Taiwan");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u4e2d\u6587\u53f0\u7063)" + "'", str6, "\u4e2d\u6587\u53f0\u7063)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "zh-TW" + "'", str7, "zh-TW");
        org.junit.Assert.assertEquals(locale9.toString(), "en");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "inglese" + "'", str10, "inglese");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals(locale16.toString(), "chnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa_EN_CA_ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "it");
        org.junit.Assert.assertEquals(locale19.toString(), "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "inglese" + "'", str22, "inglese");
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
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "inglese" + "'", str36, "inglese");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "a" + "'", str38, "a");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "German" + "'", str40, "German");
        org.junit.Assert.assertNotNull(strSet41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "EN_CA" + "'", str42, "EN_CA");
        org.junit.Assert.assertEquals(locale44.toString(), "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals(locale48.toString(), "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "und" + "'", str51, "und");
    }

    @Test
    public void test16713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16713");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("              Locale               ", (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test16714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16714");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("raaaaaaaaaaaaaaaaaaaingleseaaaaaaaaaaaaaaaaaaaaglAsA", "Ja");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "raaaaaaaaaaaaaaaaaaaingleseaaaaaaaaaaaaaaaaaaaaglAsA" + "'", str2, "raaaaaaaaaaaaaaaaaaaingleseaaaaaaaaaaaaaaaaaaaaglAsA");
    }

    @Test
    public void test16715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16715");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("EN-ca");
        java.util.Set<java.lang.Character> charSet2 = locale1.getExtensionKeys();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_CA");
        org.junit.Assert.assertNotNull(charSet2);
    }

    @Test
    public void test16716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16716");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("Italia", "slgnEslgnEslgnEfran\347axsx(Canada)slgnEslgnEslgnEs", "             AN       A             ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Italia" + "'", str3, "Italia");
    }

    @Test
    public void test16717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16717");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("\u4e2d\u6587\u53f0\u6e7e\u5730\u533aengliIlish", "################################################################################################################lang");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test16718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16718");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("hi");
        java.util.Locale.LanguageRange languageRange3 = new java.util.Locale.LanguageRange("cn");
        boolean boolean4 = languageRangeList1.add(languageRange3);
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
        java.util.Locale locale21 = new java.util.Locale("");
        java.lang.String str22 = locale21.getDisplayLanguage();
        java.util.Locale locale23 = java.util.Locale.CANADA;
        java.lang.String str24 = locale23.getDisplayLanguage();
        java.lang.String str25 = locale21.getDisplayScript(locale23);
        java.lang.String str26 = org.apache.commons.lang3.StringUtils.lowerCase("a", locale21);
        java.lang.String str27 = locale21.getDisplayScript();
        java.lang.String str28 = locale17.getDisplayLanguage(locale21);
        java.util.Set<java.lang.String> strSet29 = locale17.getUnicodeLocaleAttributes();
        boolean boolean30 = languageRangeList1.remove((java.lang.Object) locale17);
        java.lang.String str31 = locale17.getVariant();
        java.util.Locale locale32 = java.util.Locale.CHINA;
        java.util.Set<java.lang.Character> charSet33 = locale32.getExtensionKeys();
        java.util.Set<java.lang.String> strSet34 = locale32.getUnicodeLocaleAttributes();
        java.lang.String str35 = locale17.getDisplayName(locale32);
        java.util.Locale.setDefault(locale17);
        java.lang.String str37 = locale17.getDisplayVariant();
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
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
        org.junit.Assert.assertEquals(locale21.toString(), "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "inglese" + "'", str24, "inglese");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "a" + "'", str26, "a");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "German" + "'", str28, "German");
        org.junit.Assert.assertNotNull(strSet29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(charSet33);
        org.junit.Assert.assertNotNull(strSet34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "\u5fb7\u6587" + "'", str35, "\u5fb7\u6587");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
    }

    @Test
    public void test16719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16719");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hI");
        java.lang.String str2 = locale1.getDisplayLanguage();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hindi" + "'", str2, "Hindi");
    }

    @Test
    public void test16720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16720");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("TWN");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test16721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16721");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "####################################");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ####################################");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16722");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "GNAL.AVAJSTRING");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: GNAL/AVAJSTRING");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16723");
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
        java.lang.String str20 = locale18.getDisplayCountry();
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\u53f0\u7063" + "'", str20, "\u53f0\u7063");
    }

    @Test
    public void test16724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16724");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("ZHCINESESuEn", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=zhcinesesuen");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16725");
        java.util.Iterator<java.util.Locale.LanguageRange> languageRangeItor0 = null;
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join(languageRangeItor0, 'u');
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test16726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16726");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("\u4e2d\u56fd\u8a9e (ZH)", "Anzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAn");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test16727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16727");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("java.lang (CHINES)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "java.lang (CHINES)" + "'", str1, "java.lang (CHINES)");
    }

    @Test
    public void test16728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16728");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("chine", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test16729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16729");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("ANIHC      ", strMap1);
        java.util.Locale.LanguageRange[] languageRangeArray3 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList4 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList4, languageRangeArray3);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap6 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList7 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, strMap6);
        boolean boolean8 = languageRangeList7.isEmpty();
        boolean boolean9 = languageRangeList2.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList7);
        java.lang.Class[] classArray11 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray12 = (java.lang.Class<?>[]) classArray11;
        java.lang.Class<?>[] wildcardClassArray13 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray11);
        java.lang.Class<?> wildcardClass14 = null;
        java.lang.Class[] classArray16 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray17 = (java.lang.Class<?>[]) classArray16;
        wildcardClassArray17[0] = wildcardClass14;
        boolean boolean21 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray13, wildcardClassArray17, false);
        java.lang.Class<?>[] wildcardClassArray22 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray13);
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray23 = languageRangeList7.toArray((java.lang.reflect.GenericDeclaration[]) wildcardClassArray22);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream24 = languageRangeList7.parallelStream();
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(languageRangeList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(classArray11);
        org.junit.Assert.assertNotNull(wildcardClassArray12);
        org.junit.Assert.assertNotNull(wildcardClassArray13);
        org.junit.Assert.assertNotNull(classArray16);
        org.junit.Assert.assertNotNull(wildcardClassArray17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray22);
        org.junit.Assert.assertNotNull(genericDeclarationArray23);
        org.junit.Assert.assertNotNull(languageRangeStream24);
    }

    @Test
    public void test16730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16730");
        java.lang.String[] strArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("N", strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test16731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16731");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList0 = null;
        java.util.Locale locale2 = new java.util.Locale("");
        java.lang.String str3 = locale2.getDisplayLanguage();
        java.util.Locale locale4 = java.util.Locale.CANADA;
        java.lang.String str5 = locale4.getDisplayLanguage();
        java.lang.String str6 = locale2.getDisplayScript(locale4);
        java.lang.String str7 = locale4.getDisplayVariant();
        java.util.Locale locale8 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale9 = java.util.Locale.getDefault();
        java.lang.String str10 = locale8.getDisplayCountry(locale9);
        java.lang.String str11 = locale9.getDisplayVariant();
        java.lang.String str12 = locale4.getDisplayScript(locale9);
        java.lang.String str13 = locale4.getScript();
        java.lang.String str14 = locale4.getDisplayLanguage();
        java.util.Set<java.lang.String> strSet15 = locale4.getUnicodeLocaleKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = java.util.Locale.lookupTag(languageRangeList0, (java.util.Collection<java.lang.String>) strSet15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u82f1\u6587" + "'", str5, "\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "de");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "China" + "'", str10, "China");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\u82f1\u6587" + "'", str14, "\u82f1\u6587");
        org.junit.Assert.assertNotNull(strSet15);
    }

    @Test
    public void test16732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16732");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("AI", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAI" + "'", str2, "AIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAI");
    }

    @Test
    public void test16733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16733");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("ca", 0, '$');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ca" + "'", str3, "ca");
    }

    @Test
    public void test16734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16734");
        java.util.Locale locale1 = new java.util.Locale("\uc911\uad6d");
        org.junit.Assert.assertEquals(locale1.toString(), "\uc911\uad6d");
    }

    @Test
    public void test16735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16735");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("java.langfr_FR", 211, 27);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test16736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16736");
        java.util.Locale locale2 = new java.util.Locale("$", "java.lang");
        java.lang.String str3 = locale2.toLanguageTag();
        java.util.Locale locale4 = java.util.Locale.ITALIAN;
        java.util.Locale locale6 = new java.util.Locale("");
        java.lang.String str7 = locale6.getDisplayLanguage();
        java.util.Locale locale8 = java.util.Locale.CANADA;
        java.lang.String str9 = locale8.getDisplayLanguage();
        java.lang.String str10 = locale6.getDisplayScript(locale8);
        java.util.Locale locale12 = java.util.Locale.FRANCE;
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale12);
        java.lang.String str14 = locale6.getDisplayCountry(locale12);
        java.lang.String str15 = locale4.getDisplayScript(locale6);
        java.util.Locale locale16 = java.util.Locale.GERMAN;
        java.lang.String str17 = locale6.getDisplayLanguage(locale16);
        java.util.Locale locale20 = new java.util.Locale("");
        java.lang.String str21 = locale20.getDisplayLanguage();
        java.util.Locale locale22 = java.util.Locale.CANADA;
        java.lang.String str23 = locale22.getDisplayLanguage();
        java.lang.String str24 = locale20.getDisplayScript(locale22);
        java.lang.String str25 = org.apache.commons.lang3.StringUtils.lowerCase("a", locale20);
        java.lang.String str26 = locale20.getDisplayScript();
        java.lang.String str27 = locale16.getDisplayLanguage(locale20);
        java.util.Set<java.lang.String> strSet28 = locale16.getUnicodeLocaleAttributes();
        java.lang.String str29 = locale16.getCountry();
        java.util.Locale.Category category30 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale31 = java.util.Locale.ITALIAN;
        java.util.Locale locale33 = new java.util.Locale("");
        java.lang.String str34 = locale33.getDisplayLanguage();
        java.util.Locale locale35 = java.util.Locale.CANADA;
        java.lang.String str36 = locale35.getDisplayLanguage();
        java.lang.String str37 = locale33.getDisplayScript(locale35);
        java.util.Locale locale39 = java.util.Locale.FRANCE;
        java.lang.String str40 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale39);
        java.lang.String str41 = locale33.getDisplayCountry(locale39);
        java.lang.String str42 = locale31.getDisplayScript(locale33);
        java.util.Locale locale43 = java.util.Locale.GERMAN;
        java.lang.String str44 = locale33.getDisplayLanguage(locale43);
        java.util.Locale locale47 = new java.util.Locale("");
        java.lang.String str48 = locale47.getDisplayLanguage();
        java.util.Locale locale49 = java.util.Locale.CANADA;
        java.lang.String str50 = locale49.getDisplayLanguage();
        java.lang.String str51 = locale47.getDisplayScript(locale49);
        java.lang.String str52 = org.apache.commons.lang3.StringUtils.lowerCase("a", locale47);
        java.lang.String str53 = locale47.getDisplayScript();
        java.lang.String str54 = locale43.getDisplayLanguage(locale47);
        java.util.Set<java.lang.String> strSet55 = locale43.getUnicodeLocaleAttributes();
        java.util.Locale.setDefault(category30, locale43);
        java.lang.String str57 = locale43.getLanguage();
        java.lang.String str58 = locale16.getDisplayVariant(locale43);
        java.util.Locale locale60 = new java.util.Locale("e!e(Tiiwin");
        java.lang.String str61 = locale16.getDisplayLanguage(locale60);
        java.lang.String str62 = locale2.getDisplayName(locale60);
        java.lang.String str63 = locale60.getVariant();
        org.junit.Assert.assertEquals(locale2.toString(), "$_JAVA.LANG");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "und" + "'", str3, "und");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "it");
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u82f1\u6587" + "'", str9, "\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "english" + "'", str13, "english");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "de");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals(locale20.toString(), "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\u82f1\u6587" + "'", str23, "\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "a" + "'", str25, "a");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "German" + "'", str27, "German");
        org.junit.Assert.assertNotNull(strSet28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + category30 + "' != '" + java.util.Locale.Category.FORMAT + "'", category30.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "it");
        org.junit.Assert.assertEquals(locale33.toString(), "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "\u82f1\u6587" + "'", str36, "\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "english" + "'", str40, "english");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "de");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals(locale47.toString(), "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "\u82f1\u6587" + "'", str50, "\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "a" + "'", str52, "a");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "German" + "'", str54, "German");
        org.junit.Assert.assertNotNull(strSet55);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "de" + "'", str57, "de");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertEquals(locale60.toString(), "e!e(tiiwin");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "German" + "'", str61, "German");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "$ (JAVA.LANG)" + "'", str62, "$ (JAVA.LANG)");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
    }

    @Test
    public void test16737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16737");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("....................................................................................................Hindi (HI!,cHINA)", "fr");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "....................................................................................................Hindi (HI!,cHINA)" + "'", str2, "....................................................................................................Hindi (HI!,cHINA)");
    }

    @Test
    public void test16738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16738");
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
        java.util.Locale.LanguageRange[] languageRangeArray30 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList31 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList31, languageRangeArray30);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap33 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList34 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList31, strMap33);
        int int35 = languageRangeList31.size();
        java.util.List<java.util.Locale.LanguageRange> languageRangeList37 = java.util.Locale.LanguageRange.parse("hi");
        boolean boolean39 = languageRangeList37.remove((java.lang.Object) "English");
        boolean boolean40 = languageRangeList31.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList37);
        java.util.Locale.LanguageRange[] languageRangeArray41 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList42 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList42, languageRangeArray41);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap44 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList45 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList42, strMap44);
        int int46 = languageRangeList42.size();
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor47 = languageRangeList42.listIterator();
        java.util.Locale.LanguageRange languageRange49 = new java.util.Locale.LanguageRange("a");
        java.util.Locale.LanguageRange languageRange51 = new java.util.Locale.LanguageRange("English");
        java.lang.String str53 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) languageRange51, "");
        java.util.Locale.LanguageRange languageRange55 = new java.util.Locale.LanguageRange("English");
        java.util.Locale.LanguageRange[] languageRangeArray56 = new java.util.Locale.LanguageRange[] { languageRange49, languageRange51, languageRange55 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList57 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList57, languageRangeArray56);
        boolean boolean59 = languageRangeList42.retainAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList57);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor60 = languageRangeList57.listIterator();
        java.util.Locale.LanguageRange languageRange61 = languageRangeItor60.next();
        java.util.Locale.LanguageRange languageRange62 = languageRangeItor60.next();
        boolean boolean63 = languageRangeList31.add(languageRange62);
        double double64 = languageRange62.getWeight();
        boolean boolean65 = languageRangeList1.add(languageRange62);
        java.lang.String str67 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList1, "s");
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
        org.junit.Assert.assertNotNull(languageRangeArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(languageRangeList34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(languageRangeList37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(languageRangeArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(languageRangeList45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(languageRangeItor47);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Locale.LanguageRange" + "'", str53, "Locale.LanguageRange");
        org.junit.Assert.assertNotNull(languageRangeArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(languageRangeItor60);
        org.junit.Assert.assertNotNull(languageRange61);
        org.junit.Assert.assertNotNull(languageRange62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 1.0d + "'", double64 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
    }

    @Test
    public void test16739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16739");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "zh-cn");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "glish", 45, 116);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 45");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test16740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16740");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("javacinese.cineselang", (double) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=javacinese.cineselang");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16741");
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
        java.util.Locale.LanguageRange[] languageRangeArray87 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList88 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList88, languageRangeArray87);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap90 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList91 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList88, strMap90);
        int int92 = languageRangeList88.size();
        boolean boolean93 = languageRangeList30.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList88);
        boolean boolean94 = languageRangeList1.retainAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList30);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange96 = languageRangeList1.remove((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
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
// flaky:         org.junit.Assert.assertEquals(locale46.toString(), "fr_FR");
// flaky:         org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Chine" + "'", str47, "Chine");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "zh-CN" + "'", str48, "zh-CN");
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale50);
// flaky:         org.junit.Assert.assertEquals(locale50.toString(), "fr_FR");
// flaky:         org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Chine" + "'", str51, "Chine");
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale53);
// flaky:         org.junit.Assert.assertEquals(locale53.toString(), "fr_FR");
// flaky:         org.junit.Assert.assertEquals("'" + str54 + "' != '" + "Chine" + "'", str54, "Chine");
        org.junit.Assert.assertEquals(locale58.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale60);
// flaky:         org.junit.Assert.assertEquals(locale60.toString(), "fr_FR");
// flaky:         org.junit.Assert.assertEquals("'" + str61 + "' != '" + "Chine" + "'", str61, "Chine");
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
        org.junit.Assert.assertNotNull(languageRangeArray87);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNotNull(languageRangeList91);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 0 + "'", int92 == 0);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
    }

    @Test
    public void test16742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16742");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("english (United States)", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "english (United States)" + "'", str2, "english (United States)");
    }

    @Test
    public void test16743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16743");
        java.util.Locale locale1 = new java.util.Locale("zh-cnenglish");
        java.util.Locale locale3 = new java.util.Locale("");
        java.lang.String str4 = locale3.getDisplayLanguage();
        java.util.Locale locale5 = java.util.Locale.CANADA;
        java.lang.String str6 = locale5.getDisplayLanguage();
        java.lang.String str7 = locale3.getDisplayScript(locale5);
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
        java.lang.String str20 = locale10.getDisplayCountry();
        java.lang.String str21 = locale10.getDisplayLanguage();
        java.util.Locale locale22 = java.util.Locale.PRC;
        java.lang.String str23 = locale10.getDisplayScript(locale22);
        java.lang.String str24 = locale5.getDisplayCountry(locale10);
        java.util.Locale locale27 = new java.util.Locale("CHN", "hi!");
        java.lang.String str28 = locale5.getDisplayCountry(locale27);
        java.util.Set<java.lang.Character> charSet29 = locale5.getExtensionKeys();
        java.lang.String str30 = locale1.getDisplayLanguage(locale5);
        java.lang.String str31 = locale1.getDisplayScript();
        org.junit.Assert.assertEquals(locale1.toString(), "zh-cnenglish");
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "anglais" + "'", str6, "anglais");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "it");
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "anglais" + "'", str13, "anglais");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "english" + "'", str17, "english");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Canada" + "'", str24, "Canada");
        org.junit.Assert.assertEquals(locale27.toString(), "chn_HI!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Canada" + "'", str28, "Canada");
        org.junit.Assert.assertNotNull(charSet29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "zh-cnenglish" + "'", str30, "zh-cnenglish");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test16744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16744");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("de", "               eN                ", 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test16745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16745");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "zh_c");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test16746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16746");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("\u5951\u52aa\u514b\u6587", 0, 'u');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u5951\u52aa\u514b\u6587" + "'", str3, "\u5951\u52aa\u514b\u6587");
    }

    @Test
    public void test16747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16747");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("und-Italiano", "CHNAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ", 745);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test16748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16748");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("cHIChinChinChinChinChinChinChinChinChinaaaaaaaaa#A", "CINA................................................................................................", 2);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test16749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16749");
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
            java.util.Locale.Builder builder16 = builder9.setLanguage("cHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: cHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA [at index 0]");
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
    public void test16750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16750");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("RGLASA", "HINDI(hi!,China)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "RGLASA" + "'", str2, "RGLASA");
    }

    @Test
    public void test16751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16751");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("                                ", "ahi!hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                " + "'", str2, "                                ");
    }

    @Test
    public void test16752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16752");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("$$$$$$$$$$$$$xxxxxxxxinglese (Canada)xxxxxxxx$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test16753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16753");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("it_CN", 742, "undaaaaaaah");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahit_CN" + "'", str3, "undaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahit_CN");
    }

    @Test
    public void test16754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16754");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("CH", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test16755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16755");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("\u5317\u5370\u5ea6\u6587 (hi!,china)", "ARRAYLIST");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u5317\u5370\u5ea6\u6587 (hi!,china)" + "'", str2, "\u5317\u5370\u5ea6\u6587 (hi!,china)");
    }

    @Test
    public void test16756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16756");
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
        java.util.Locale.LanguageRange languageRange21 = new java.util.Locale.LanguageRange("English");
        java.lang.String str22 = languageRange21.getRange();
        java.util.Locale.LanguageRange languageRange24 = new java.util.Locale.LanguageRange("English");
        java.lang.String str25 = languageRange24.getRange();
        java.util.Locale.LanguageRange languageRange27 = new java.util.Locale.LanguageRange("English");
        java.util.Locale.LanguageRange[] languageRangeArray28 = new java.util.Locale.LanguageRange[] { languageRange21, languageRange24, languageRange27 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList29 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList29, languageRangeArray28);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream31 = languageRangeList29.stream();
        java.util.Locale.Builder builder32 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder33 = builder32.clearExtensions();
        java.util.Locale.Builder builder34 = builder32.clearExtensions();
        boolean boolean35 = languageRangeList29.contains((java.lang.Object) builder34);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList38 = java.util.Locale.LanguageRange.parse("HI");
        boolean boolean39 = languageRangeList29.addAll((int) (short) 0, (java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList38);
        int int41 = languageRangeList29.lastIndexOf((java.lang.Object) "...xxxxxFrench(France)xxxxxxxxxx");
        int int42 = languageRangeList29.size();
        java.util.Locale.LanguageRange[] languageRangeArray43 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList44 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList44, languageRangeArray43);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap46 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList47 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList44, strMap46);
        java.util.Locale.LanguageRange[] languageRangeArray48 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList49 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList49, languageRangeArray48);
        boolean boolean51 = languageRangeList44.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList49);
        java.util.Locale.LanguageRange[] languageRangeArray52 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList53 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList53, languageRangeArray52);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap55 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList56 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList53, strMap55);
        java.util.Locale.LanguageRange[] languageRangeArray57 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList58 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList58, languageRangeArray57);
        boolean boolean60 = languageRangeList53.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList58);
        java.lang.String str62 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList58, "hi!");
        boolean boolean63 = languageRangeList44.remove((java.lang.Object) languageRangeList58);
        java.lang.String str65 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) languageRangeList44, "cn");
        java.util.Locale locale66 = java.util.Locale.JAPANESE;
        java.util.Locale locale68 = java.util.Locale.TAIWAN;
        java.lang.String str69 = org.apache.commons.lang3.StringUtils.upperCase("", locale68);
        java.lang.String str70 = locale66.getDisplayVariant(locale68);
        java.util.Set<java.lang.Character> charSet71 = locale68.getExtensionKeys();
        java.util.Set<java.lang.String> strSet72 = locale68.getUnicodeLocaleAttributes();
        java.util.List<java.lang.String> strList73 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList44, (java.util.Collection<java.lang.String>) strSet72);
        java.util.List<java.lang.String> strList74 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList29, (java.util.Collection<java.lang.String>) strList73);
        java.lang.String str75 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList16, (java.util.Collection<java.lang.String>) strList73);
        java.util.List<java.lang.Class<?>> wildcardClassList76 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses(strList73);
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "english" + "'", str22, "english");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "english" + "'", str25, "english");
        org.junit.Assert.assertNotNull(languageRangeArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(languageRangeStream31);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(languageRangeList38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 4 + "'", int42 == 4);
        org.junit.Assert.assertNotNull(languageRangeArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(languageRangeList47);
        org.junit.Assert.assertNotNull(languageRangeArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(languageRangeArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(languageRangeList56);
        org.junit.Assert.assertNotNull(languageRangeArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "java.util" + "'", str65, "java.util");
        org.junit.Assert.assertNotNull(locale66);
        org.junit.Assert.assertEquals(locale66.toString(), "ja");
        org.junit.Assert.assertNotNull(locale68);
        org.junit.Assert.assertEquals(locale68.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertNotNull(charSet71);
        org.junit.Assert.assertNotNull(strSet72);
        org.junit.Assert.assertNotNull(strList73);
        org.junit.Assert.assertNotNull(strList74);
        org.junit.Assert.assertNull(str75);
        org.junit.Assert.assertNotNull(wildcardClassList76);
    }

    @Test
    public void test16757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16757");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("enghI", "i###################################################################################################", 17);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test16758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16758");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("cinese (Taiwan)", "hZH)I");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test16759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16759");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("\u4e2d\u56fdAD.AE.AF.A         ", 39);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test16760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16760");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("ENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISH" + "'", str1, "ENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISH");
    }

    @Test
    public void test16761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16761");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test16762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16762");
        java.util.Locale locale2 = java.util.Locale.forLanguageTag("\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587         ");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.upperCase("", locale2);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test16763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16763");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                           nawiaT(ese                                                                                       nawiaT(ese                                                                                       nawiaT(ese                                                                                       )adanaC( eselgni", 1, "rg  ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                           nawiaT(ese                                                                                       nawiaT(ese                                                                                       nawiaT(ese                                                                                       )adanaC( eselgni" + "'", str3, "                                           nawiaT(ese                                                                                       nawiaT(ese                                                                                       nawiaT(ese                                                                                       )adanaC( eselgni");
    }

    @Test
    public void test16764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16764");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("$$$$$$$$$nawiaT( eseengls$$$$$$$$$nawiaT( esE", "l....");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "$$$$$$$$$nawiaT( eseengls$$$$$$$$$nawiaT( esE" + "'", str2, "$$$$$$$$$nawiaT( eseengls$$$$$$$$$nawiaT( esE");
    }

    @Test
    public void test16765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16765");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "hi!hi! (                 A                 )");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test16766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16766");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale.Builder builder3 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder5 = builder1.setRegion("zh");
        java.util.Locale.Builder builder6 = builder5.clear();
        java.util.Locale.Builder builder7 = builder6.clearExtensions();
        java.util.Locale.Builder builder8 = builder7.clear();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test16767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16767");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("cHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "cHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "cHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test16768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16768");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("ahi!hi!hi!hi!hi!HI!ahi!hi!hi!hi!hi!", 18);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ahi!hi!hi!hi!hi..." + "'", str2, "ahi!hi!hi!hi!hi...");
    }

    @Test
    public void test16769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16769");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageName("GERMAN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test16770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16770");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "                                                                                                            undaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaH                                                                                                             ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                            undaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaH                                                                                                             " + "'", str1, "                                                                                                            undaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaH                                                                                                             ");
    }

    @Test
    public void test16771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16771");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("n ENG", (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=10.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16772");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("\u6cd5\u6cd5\u6587\u6587ST##############");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test16773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16773");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("cinaxxxxxcNn");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "cinaxxxxxcNn" + "'", str1, "cinaxxxxxcNn");
    }

    @Test
    public void test16774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16774");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("h                                                gnalesenic.esenicavaj                                                Ih                                                gnalesenic.esenicavaj                                                Ih                                                gnalesenic.esenicavaj                                                Ih                                                gnalesenic.esenicavaj                                                Ih                                                gnalesenic.esenicavaj                                                I", "AAAAAAAAAAAAAAAAA");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, 'a');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "h                                                gnalesenic.esenicavaj                                                Ih                                                gnalesenic.esenicavaj                                                Ih                                                gnalesenic.esenicavaj                                                Ih                                                gnalesenic.esenicavaj                                                Ih                                                gnalesenic.esenicavaj                                                I" + "'", str4, "h                                                gnalesenic.esenicavaj                                                Ih                                                gnalesenic.esenicavaj                                                Ih                                                gnalesenic.esenicavaj                                                Ih                                                gnalesenic.esenicavaj                                                Ih                                                gnalesenic.esenicavaj                                                I");
    }

    @Test
    public void test16775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16775");
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
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor33 = languageRangeList4.listIterator(0);
        java.util.Locale.LanguageRange[] languageRangeArray34 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList35 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList35, languageRangeArray34);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap37 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList38 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList35, strMap37);
        java.util.Locale.LanguageRange[] languageRangeArray39 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList40 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList40, languageRangeArray39);
        boolean boolean42 = languageRangeList35.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList40);
        java.util.Locale.LanguageRange[] languageRangeArray43 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList44 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList44, languageRangeArray43);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap46 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList47 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList44, strMap46);
        java.util.Locale.LanguageRange[] languageRangeArray48 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList49 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList49, languageRangeArray48);
        boolean boolean51 = languageRangeList44.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList49);
        java.lang.String str53 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList49, "hi!");
        boolean boolean54 = languageRangeList35.containsAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList49);
        java.util.Locale locale55 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale56 = java.util.Locale.getDefault();
        java.lang.String str57 = locale55.getDisplayCountry(locale56);
        java.lang.String str58 = locale56.getDisplayVariant();
        boolean boolean59 = languageRangeList35.contains((java.lang.Object) str58);
        boolean boolean60 = languageRangeList4.containsAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList35);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList63 = languageRangeList4.subList(0, 1);
        java.lang.String[] strArray66 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("ANIHC                                                                                               ", "chinois ");
        boolean boolean67 = languageRangeList63.remove((java.lang.Object) "chinois ");
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
        org.junit.Assert.assertNotNull(languageRangeItor33);
        org.junit.Assert.assertNotNull(languageRangeArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(languageRangeList38);
        org.junit.Assert.assertNotNull(languageRangeArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(languageRangeArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(languageRangeList47);
        org.junit.Assert.assertNotNull(languageRangeArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale56);
// flaky:         org.junit.Assert.assertEquals(locale56.toString(), "fr_FR");
// flaky:         org.junit.Assert.assertEquals("'" + str57 + "' != '" + "Chine" + "'", str57, "Chine");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(languageRangeList63);
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
    }

    @Test
    public void test16776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16776");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("", "English (Canada)English (CaEngls", "REDLIUB");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test16777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16777");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "                    EN_CA                    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test16778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16778");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("String[]", '$');
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny(".....................................................................................................................................................................................................................................................................................allemand......................................................................................................................................................................................................................................................................................", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test16779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16779");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("ZH_TW", "..italiahiit_cn..italiahiit_cn..italiahiit_cn..italiahi");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test16780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16780");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("slgnE", 94, 116);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "slgnE" + "'", str3, "slgnE");
    }

    @Test
    public void test16781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16781");
        java.lang.Object obj0 = null;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName(obj0, "                                                                                           GERMN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                           GERMN" + "'", str2, "                                                                                           GERMN");
    }

    @Test
    public void test16782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16782");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("#####################################Germn", "\u5951\u52aa\u514b\u6587", (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test16783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16783");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("CHIChinChinChinChinChinChinChinChinChinaaaaaaaaa#A", 98, 35);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test16784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16784");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("aaaaaaaaaaaaaaaalocale.languagerange", "ITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIEN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaalocale.languagerange" + "'", str2, "aaaaaaaaaaaaaaaalocale.languagerange");
    }

    @Test
    public void test16785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16785");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("zhcines", "zh_ZH                                                                                                                   ", 46);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test16786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16786");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "ahi!hi! (                 A                 )");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test16787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16787");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "...                                     hI                                                javacinese.cineselang   ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test16788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16788");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("English");
        java.lang.String str3 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) languageRange1, "");
        java.lang.String str4 = languageRange1.getRange();
        java.util.Locale locale6 = java.util.Locale.forLanguageTag("CN");
        java.util.Locale locale7 = java.util.Locale.CANADA;
        boolean boolean8 = locale7.hasExtensions();
        java.util.Locale locale9 = java.util.Locale.ITALIAN;
        java.lang.String str10 = locale7.getDisplayScript(locale9);
        java.lang.String str11 = locale6.getDisplayCountry(locale7);
        java.lang.String str12 = locale7.getISO3Language();
        java.lang.String str13 = locale7.getLanguage();
        boolean boolean14 = languageRange1.equals((java.lang.Object) locale7);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Locale.LanguageRange" + "'", str3, "Locale.LanguageRange");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "english" + "'", str4, "english");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "cn");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "it");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "eng" + "'", str12, "eng");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "en" + "'", str13, "en");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test16789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16789");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("china_cn        Ci_a", 0, "ese(Taiwan$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "china_cn        Ci_a" + "'", str3, "china_cn        Ci_a");
    }

    @Test
    public void test16790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16790");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("hi");
        java.lang.Object[] objArray2 = languageRangeList1.toArray();
        java.util.Spliterator<java.util.Locale.LanguageRange> languageRangeSpliterator3 = languageRangeList1.spliterator();
        java.util.Locale.Builder builder4 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        java.util.Locale.Builder builder7 = builder5.setLanguageTag("zh-CN");
        java.util.Locale locale8 = builder5.build();
        boolean boolean9 = languageRangeList1.remove((java.lang.Object) locale8);
        java.util.Locale locale10 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale11 = java.util.Locale.getDefault();
        java.lang.String str12 = locale10.getDisplayCountry(locale11);
        java.lang.String str13 = locale11.getCountry();
        java.lang.String str14 = locale11.getDisplayName();
        boolean boolean15 = languageRangeList1.remove((java.lang.Object) str14);
        java.util.Locale.LanguageRange[] languageRangeArray16 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList17 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList17, languageRangeArray16);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap19 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList20 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList17, strMap19);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor21 = languageRangeList20.listIterator();
        boolean boolean22 = languageRangeList1.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList20);
        java.util.Spliterator<java.util.Locale.LanguageRange> languageRangeSpliterator23 = languageRangeList20.spliterator();
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(languageRangeSpliterator3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh_CN");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale11);
// flaky:         org.junit.Assert.assertEquals(locale11.toString(), "fr_FR");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Chine" + "'", str12, "Chine");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "FR" + "'", str13, "FR");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "fran\347ais (France)" + "'", str14, "fran\347ais (France)");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(languageRangeArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(languageRangeList20);
        org.junit.Assert.assertNotNull(languageRangeItor21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(languageRangeSpliterator23);
    }

    @Test
    public void test16791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16791");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageName("hi!hi! (                 A                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test16792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16792");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("ggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engl", "ReferencePipeline.Head", "Arrsy...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engl" + "'", str3, "ggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engl");
    }

    @Test
    public void test16793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16793");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("  l", "ahi!hi!hi!hi!hi!HI!ahi!hi!hi!hi!hi!", 120);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test16794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16794");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("cn", '#');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '.');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "cn" + "'", str4, "cn");
    }

    @Test
    public void test16795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16795");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("esenicavaj                                                ", 530);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test16796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16796");
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
        java.util.Iterator<java.util.Locale.LanguageRange> languageRangeItor27 = languageRangeList2.iterator();
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream28 = languageRangeList2.parallelStream();
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(locale3);
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "fr_FR");
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
        org.junit.Assert.assertNotNull(languageRangeItor27);
        org.junit.Assert.assertNotNull(languageRangeStream28);
    }

    @Test
    public void test16797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16797");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass("avaj", true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: avaj");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16798");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("ci_a", "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ci_a" + "'", str2, "ci_a");
    }

    @Test
    public void test16799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16799");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("\u5370\u5730\u6587 (hi!,china)", "ccccccccccccccc", 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u5370\u5730\u6587 (hi!,china)" + "'", str3, "\u5370\u5730\u6587 (hi!,china)");
    }

    @Test
    public void test16800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16800");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxCHNAAAAA", (double) 20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=20.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16801");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortClassName("cigese");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "cigese" + "'", str1, "cigese");
    }

    @Test
    public void test16802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16802");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("\u65e5\u6587", "EnglTWNsTWN");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray3);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concatWith("                                     ARRAYLIST", (java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u65e5\u6587" + "'", str4, "\u65e5\u6587");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u65e5\u6587" + "'", str5, "\u65e5\u6587");
    }

    @Test
    public void test16803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16803");
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
        java.util.Locale.Builder builder12 = builder10.setLanguage("French");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder15 = builder10.setUnicodeLocaleKeyword("C...", "aCOL");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: C... [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale5);
// flaky:         org.junit.Assert.assertEquals(locale5.toString(), "fr_FR");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Chine" + "'", str6, "Chine");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "zh-CN" + "'", str7, "zh-CN");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CN" + "'", str8, "CN");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "CHN" + "'", str9, "CHN");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test16804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16804");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("nglese", "ese (Taiwan$$$$$$$$$slgneese (Taiwa", 12);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test16805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16805");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("it", strMap1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList2, '#');
        java.util.Locale.LanguageRange[] languageRangeArray5 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList6 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList6, languageRangeArray5);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap8 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList9 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList6, strMap8);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor10 = languageRangeList9.listIterator();
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        java.util.Locale.LanguageRange[] languageRangeArray15 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList16 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList16, languageRangeArray15);
        java.util.Locale locale19 = java.util.Locale.FRANCE;
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale19);
        java.util.Locale locale21 = java.util.Locale.US;
        java.util.Locale locale22 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale23 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale24 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale25 = java.util.Locale.getDefault();
        java.lang.String str26 = locale24.getDisplayCountry(locale25);
        java.lang.String str27 = locale24.toLanguageTag();
        java.util.Locale locale28 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale29 = java.util.Locale.getDefault();
        java.lang.String str30 = locale28.getDisplayCountry(locale29);
        java.util.Locale locale31 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale32 = java.util.Locale.getDefault();
        java.lang.String str33 = locale31.getDisplayCountry(locale32);
        java.util.Locale locale37 = new java.util.Locale("hi", "hi!", "cHINA");
        java.util.Locale locale38 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale39 = java.util.Locale.getDefault();
        java.lang.String str40 = locale38.getDisplayCountry(locale39);
        java.util.Locale locale42 = new java.util.Locale("");
        java.lang.String str43 = locale42.getDisplayVariant();
        java.util.Locale locale44 = java.util.Locale.KOREAN;
        java.util.Locale locale46 = new java.util.Locale("");
        java.util.Locale locale47 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale[] localeArray48 = new java.util.Locale[] { locale19, locale21, locale22, locale23, locale24, locale29, locale31, locale37, locale39, locale42, locale44, locale46, locale47 };
        java.util.ArrayList<java.util.Locale> localeList49 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList49, localeArray48);
        java.util.List<java.util.Locale> localeList51 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList16, (java.util.Collection<java.util.Locale>) localeList49);
        java.lang.String[] strArray59 = new java.lang.String[] { "English", "hi", "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "", "a", "", "China" };
        java.util.ArrayList<java.lang.String> strList60 = new java.util.ArrayList<java.lang.String>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList60, strArray59);
        java.util.List<java.lang.Class<?>> wildcardClassList62 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList60);
        java.util.Locale.FilteringMode filteringMode63 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList64 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList16, (java.util.Collection<java.lang.String>) strList60, filteringMode63);
        java.util.List<java.lang.String> strList65 = java.util.Locale.filterTags(languageRangeList9, (java.util.Collection<java.lang.String>) strList13, filteringMode63);
        java.util.Locale.LanguageRange[] languageRangeArray66 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList67 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList67, languageRangeArray66);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap69 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList70 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList67, strMap69);
        int int71 = languageRangeList67.size();
        boolean boolean72 = languageRangeList9.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList67);
        boolean boolean73 = languageRangeList2.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList67);
        java.util.Iterator<java.util.Locale.LanguageRange> languageRangeItor74 = languageRangeList2.iterator();
        java.util.Iterator<java.util.Locale.LanguageRange> languageRangeItor75 = languageRangeList2.iterator();
        java.util.Locale.LanguageRange[] languageRangeArray76 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList77 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList77, languageRangeArray76);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap79 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList80 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList77, strMap79);
        int int81 = languageRangeList77.size();
        java.util.List<java.util.Locale.LanguageRange> languageRangeList83 = java.util.Locale.LanguageRange.parse("hi");
        boolean boolean85 = languageRangeList83.remove((java.lang.Object) "English");
        boolean boolean86 = languageRangeList77.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList83);
        boolean boolean87 = languageRangeList2.containsAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList77);
        java.util.Locale locale90 = new java.util.Locale("ArrsyList", "       hi!");
        boolean boolean91 = locale90.hasExtensions();
        int int92 = languageRangeList77.indexOf((java.lang.Object) locale90);
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(languageRangeList9);
        org.junit.Assert.assertNotNull(languageRangeItor10);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(languageRangeArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "english" + "'", str20, "english");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale25);
// flaky:         org.junit.Assert.assertEquals(locale25.toString(), "fr_FR");
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Chine" + "'", str26, "Chine");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "zh-CN" + "'", str27, "zh-CN");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale29);
// flaky:         org.junit.Assert.assertEquals(locale29.toString(), "fr_FR");
// flaky:         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Chine" + "'", str30, "Chine");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale32);
// flaky:         org.junit.Assert.assertEquals(locale32.toString(), "fr_FR");
// flaky:         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Chine" + "'", str33, "Chine");
        org.junit.Assert.assertEquals(locale37.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale39);
// flaky:         org.junit.Assert.assertEquals(locale39.toString(), "fr_FR");
// flaky:         org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Chine" + "'", str40, "Chine");
        org.junit.Assert.assertEquals(locale42.toString(), "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "ko");
        org.junit.Assert.assertEquals(locale46.toString(), "");
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(localeList51);
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(wildcardClassList62);
        org.junit.Assert.assertTrue("'" + filteringMode63 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode63.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList64);
        org.junit.Assert.assertNotNull(strList65);
        org.junit.Assert.assertNotNull(languageRangeArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(languageRangeList70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(languageRangeItor74);
        org.junit.Assert.assertNotNull(languageRangeItor75);
        org.junit.Assert.assertNotNull(languageRangeArray76);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(languageRangeList80);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
        org.junit.Assert.assertNotNull(languageRangeList83);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertEquals(locale90.toString(), "arrsylist_       HI!");
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + (-1) + "'", int92 == (-1));
    }

    @Test
    public void test16806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16806");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("", "                 s                  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test16807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16807");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("               c                ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "c" + "'", str1, "c");
    }

    @Test
    public void test16808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16808");
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
        java.util.Collection<java.util.Locale> localeCollection92 = null;
        java.util.Locale locale93 = java.util.Locale.lookup(languageRangeList86, localeCollection92);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor94 = languageRangeList86.listIterator();
        int int95 = languageRangeList86.size();
        java.util.Iterator<java.util.Locale.LanguageRange> languageRangeItor96 = languageRangeList86.iterator();
        java.lang.String str98 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) languageRangeItor96, "eng");
        // The following exception was thrown during execution in test generation
        try {
            languageRangeItor96.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
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
// flaky:         org.junit.Assert.assertEquals(locale38.toString(), "fr_FR");
// flaky:         org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Chine" + "'", str39, "Chine");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "zh-CN" + "'", str40, "zh-CN");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale42);
// flaky:         org.junit.Assert.assertEquals(locale42.toString(), "fr_FR");
// flaky:         org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Chine" + "'", str43, "Chine");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale45);
// flaky:         org.junit.Assert.assertEquals(locale45.toString(), "fr_FR");
// flaky:         org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Chine" + "'", str46, "Chine");
        org.junit.Assert.assertEquals(locale50.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale52);
// flaky:         org.junit.Assert.assertEquals(locale52.toString(), "fr_FR");
// flaky:         org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Chine" + "'", str53, "Chine");
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
        org.junit.Assert.assertNull(locale93);
        org.junit.Assert.assertNotNull(languageRangeItor94);
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + 0 + "'", int95 == 0);
        org.junit.Assert.assertNotNull(languageRangeItor96);
        org.junit.Assert.assertEquals("'" + str98 + "' != '" + "ArrayList.Itr" + "'", str98, "ArrayList.Itr");
    }

    @Test
    public void test16809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16809");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.lang.String str1 = locale0.getDisplayName();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "italien" + "'", str1, "italien");
    }

    @Test
    public void test16810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16810");
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
        java.util.Locale locale18 = java.util.Locale.getDefault(category0);
        boolean boolean19 = locale18.hasExtensions();
        java.util.Locale locale21 = new java.util.Locale("AD.AE.AF.AGchnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.AT.AU.AW.AX.AZ.BA.BB.BD.BE.BF.BG.BH.BI.BJ.BL.BM.BN.BO.BQ.BR.BS.BT.BV.BW.BY.BZ.CA.CC.CD.CF.CG.CH.CI.CK.CL.CM.CN.CO.CR.CU.CV.CW.CX.CY.CZ.DE.DJ.DK.DM.DO.DZ.EC.EE.EG.EH.ER.ES.ET.FI.FJ.FK.FM.FO.FR.GA.GB.GD.GE.GF.GG.GH.GI.GL.GM.GN.GP.GQ.GR.GS.GT.GU.GW.GY.HK.HM.HN.HR.HT.HU.ID.IE.IL.IM.IN.IO.IQ.IR.IS.IT.JE.JM.JO.JP.KE.KG.KH.KI.KM.KN.KP.KR.KW.KY.KZ.LA.LB.LC.LI.LK.LR.LS.LT.LU.LV.LY.MA.MC.MD.ME.MF.MG.MH.MK.ML.MM.MN.MO.MP.MQ.MR.MS.MT.MU.MV.MW.MX.MY.MZ.NA.NC.NE.NF.NG.NI.NL.NO.NP.NR.NU.NZ.OM.PA.PE.PF.PG.PH.PK.PL.PM.PN.PR.PS.PT.PW.PY.QA.RE.RO.RS.RU.RW.SA.SB.SC.SD.SE.SG.SH.SI.SJ.SK.SL.SM.SN.SO.SR.SS.ST.SV.SX.SY.SZ.TC.TD.TF.TG.TH.TJ.TK.TL.TM.TN.TO.TR.TT.TV.TW.TZ.UA.UG.UM.US.UY.UZ.VA.VC.VE.VG.VI.VN.VU.WF.WS.YE.YT.ZA.ZM.ZW");
        java.util.Locale.setDefault(locale21);
        java.lang.String str23 = locale21.getDisplayLanguage();
        java.lang.String str24 = locale18.getDisplayScript(locale21);
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
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals(locale21.toString(), "ad.ae.af.agchnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.at.au.aw.ax.az.ba.bb.bd.be.bf.bg.bh.bi.bj.bl.bm.bn.bo.bq.br.bs.bt.bv.bw.by.bz.ca.cc.cd.cf.cg.ch.ci.ck.cl.cm.cn.co.cr.cu.cv.cw.cx.cy.cz.de.dj.dk.dm.do.dz.ec.ee.eg.eh.er.es.et.fi.fj.fk.fm.fo.fr.ga.gb.gd.ge.gf.gg.gh.gi.gl.gm.gn.gp.gq.gr.gs.gt.gu.gw.gy.hk.hm.hn.hr.ht.hu.id.ie.il.im.in.io.iq.ir.is.it.je.jm.jo.jp.ke.kg.kh.ki.km.kn.kp.kr.kw.ky.kz.la.lb.lc.li.lk.lr.ls.lt.lu.lv.ly.ma.mc.md.me.mf.mg.mh.mk.ml.mm.mn.mo.mp.mq.mr.ms.mt.mu.mv.mw.mx.my.mz.na.nc.ne.nf.ng.ni.nl.no.np.nr.nu.nz.om.pa.pe.pf.pg.ph.pk.pl.pm.pn.pr.ps.pt.pw.py.qa.re.ro.rs.ru.rw.sa.sb.sc.sd.se.sg.sh.si.sj.sk.sl.sm.sn.so.sr.ss.st.sv.sx.sy.sz.tc.td.tf.tg.th.tj.tk.tl.tm.tn.to.tr.tt.tv.tw.tz.ua.ug.um.us.uy.uz.va.vc.ve.vg.vi.vn.vu.wf.ws.ye.yt.za.zm.zw");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "ad.ae.af.agchnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.at.au.aw.ax.az.ba.bb.bd.be.bf.bg.bh.bi.bj.bl.bm.bn.bo.bq.br.bs.bt.bv.bw.by.bz.ca.cc.cd.cf.cg.ch.ci.ck.cl.cm.cn.co.cr.cu.cv.cw.cx.cy.cz.de.dj.dk.dm.do.dz.ec.ee.eg.eh.er.es.et.fi.fj.fk.fm.fo.fr.ga.gb.gd.ge.gf.gg.gh.gi.gl.gm.gn.gp.gq.gr.gs.gt.gu.gw.gy.hk.hm.hn.hr.ht.hu.id.ie.il.im.in.io.iq.ir.is.it.je.jm.jo.jp.ke.kg.kh.ki.km.kn.kp.kr.kw.ky.kz.la.lb.lc.li.lk.lr.ls.lt.lu.lv.ly.ma.mc.md.me.mf.mg.mh.mk.ml.mm.mn.mo.mp.mq.mr.ms.mt.mu.mv.mw.mx.my.mz.na.nc.ne.nf.ng.ni.nl.no.np.nr.nu.nz.om.pa.pe.pf.pg.ph.pk.pl.pm.pn.pr.ps.pt.pw.py.qa.re.ro.rs.ru.rw.sa.sb.sc.sd.se.sg.sh.si.sj.sk.sl.sm.sn.so.sr.ss.st.sv.sx.sy.sz.tc.td.tf.tg.th.tj.tk.tl.tm.tn.to.tr.tt.tv.tw.tz.ua.ug.um.us.uy.uz.va.vc.ve.vg.vi.vn.vu.wf.ws.ye.yt.za.zm.zw" + "'", str23, "ad.ae.af.agchnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.at.au.aw.ax.az.ba.bb.bd.be.bf.bg.bh.bi.bj.bl.bm.bn.bo.bq.br.bs.bt.bv.bw.by.bz.ca.cc.cd.cf.cg.ch.ci.ck.cl.cm.cn.co.cr.cu.cv.cw.cx.cy.cz.de.dj.dk.dm.do.dz.ec.ee.eg.eh.er.es.et.fi.fj.fk.fm.fo.fr.ga.gb.gd.ge.gf.gg.gh.gi.gl.gm.gn.gp.gq.gr.gs.gt.gu.gw.gy.hk.hm.hn.hr.ht.hu.id.ie.il.im.in.io.iq.ir.is.it.je.jm.jo.jp.ke.kg.kh.ki.km.kn.kp.kr.kw.ky.kz.la.lb.lc.li.lk.lr.ls.lt.lu.lv.ly.ma.mc.md.me.mf.mg.mh.mk.ml.mm.mn.mo.mp.mq.mr.ms.mt.mu.mv.mw.mx.my.mz.na.nc.ne.nf.ng.ni.nl.no.np.nr.nu.nz.om.pa.pe.pf.pg.ph.pk.pl.pm.pn.pr.ps.pt.pw.py.qa.re.ro.rs.ru.rw.sa.sb.sc.sd.se.sg.sh.si.sj.sk.sl.sm.sn.so.sr.ss.st.sv.sx.sy.sz.tc.td.tf.tg.th.tj.tk.tl.tm.tn.to.tr.tt.tv.tw.tz.ua.ug.um.us.uy.uz.va.vc.ve.vg.vi.vn.vu.wf.ws.ye.yt.za.zm.zw");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test16811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16811");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("zh-cnenglish (locale.languagerange)", "An                             ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test16812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16812");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "ese (Taiwanese (Taiwanese (Taiwanese (Taiwanese (Taiwanese (Taiwanese (Taiwanese (Taiwan");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test16813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16813");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("ese(Taiwan.........................................................................................", 234);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test16814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16814");
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
        java.util.Locale locale48 = java.util.Locale.getDefault(category0);
        java.lang.String str49 = locale48.getCountry();
        java.lang.String str51 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) locale48, "Xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxchn");
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ad.ae.af.agchnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.at.au.aw.ax.az.ba.bb.bd.be.bf.bg.bh.bi.bj.bl.bm.bn.bo.bq.br.bs.bt.bv.bw.by.bz.ca.cc.cd.cf.cg.ch.ci.ck.cl.cm.cn.co.cr.cu.cv.cw.cx.cy.cz.de.dj.dk.dm.do.dz.ec.ee.eg.eh.er.es.et.fi.fj.fk.fm.fo.fr.ga.gb.gd.ge.gf.gg.gh.gi.gl.gm.gn.gp.gq.gr.gs.gt.gu.gw.gy.hk.hm.hn.hr.ht.hu.id.ie.il.im.in.io.iq.ir.is.it.je.jm.jo.jp.ke.kg.kh.ki.km.kn.kp.kr.kw.ky.kz.la.lb.lc.li.lk.lr.ls.lt.lu.lv.ly.ma.mc.md.me.mf.mg.mh.mk.ml.mm.mn.mo.mp.mq.mr.ms.mt.mu.mv.mw.mx.my.mz.na.nc.ne.nf.ng.ni.nl.no.np.nr.nu.nz.om.pa.pe.pf.pg.ph.pk.pl.pm.pn.pr.ps.pt.pw.py.qa.re.ro.rs.ru.rw.sa.sb.sc.sd.se.sg.sh.si.sj.sk.sl.sm.sn.so.sr.ss.st.sv.sx.sy.sz.tc.td.tf.tg.th.tj.tk.tl.tm.tn.to.tr.tt.tv.tw.tz.ua.ug.um.us.uy.uz.va.vc.ve.vg.vi.vn.vu.wf.ws.ye.yt.za.zm.zw");
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
        org.junit.Assert.assertEquals(locale10.toString(), "ad.ae.af.agchnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.at.au.aw.ax.az.ba.bb.bd.be.bf.bg.bh.bi.bj.bl.bm.bn.bo.bq.br.bs.bt.bv.bw.by.bz.ca.cc.cd.cf.cg.ch.ci.ck.cl.cm.cn.co.cr.cu.cv.cw.cx.cy.cz.de.dj.dk.dm.do.dz.ec.ee.eg.eh.er.es.et.fi.fj.fk.fm.fo.fr.ga.gb.gd.ge.gf.gg.gh.gi.gl.gm.gn.gp.gq.gr.gs.gt.gu.gw.gy.hk.hm.hn.hr.ht.hu.id.ie.il.im.in.io.iq.ir.is.it.je.jm.jo.jp.ke.kg.kh.ki.km.kn.kp.kr.kw.ky.kz.la.lb.lc.li.lk.lr.ls.lt.lu.lv.ly.ma.mc.md.me.mf.mg.mh.mk.ml.mm.mn.mo.mp.mq.mr.ms.mt.mu.mv.mw.mx.my.mz.na.nc.ne.nf.ng.ni.nl.no.np.nr.nu.nz.om.pa.pe.pf.pg.ph.pk.pl.pm.pn.pr.ps.pt.pw.py.qa.re.ro.rs.ru.rw.sa.sb.sc.sd.se.sg.sh.si.sj.sk.sl.sm.sn.so.sr.ss.st.sv.sx.sy.sz.tc.td.tf.tg.th.tj.tk.tl.tm.tn.to.tr.tt.tv.tw.tz.ua.ug.um.us.uy.uz.va.vc.ve.vg.vi.vn.vu.wf.ws.ye.yt.za.zm.zw");
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
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "java.util" + "'", str51, "java.util");
    }

    @Test
    public void test16815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16815");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("zh_CN", "AN       A", 8);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("              Locale               ", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "twn");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "zh_C" + "'", str7, "zh_C");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "zh_C" + "'", str8, "zh_C");
    }

    @Test
    public void test16816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16816");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "\uc911\uad6d\uc5b4");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test16817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16817");
        java.lang.Object obj0 = null;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getShortClassName(obj0, "C...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "C..." + "'", str2, "C...");
    }

    @Test
    public void test16818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16818");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("Germn", "...nzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWA...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Germ" + "'", str2, "Germ");
    }

    @Test
    public void test16819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16819");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "j");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test16820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16820");
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
        java.util.Locale.LanguageRange languageRange73 = new java.util.Locale.LanguageRange("GBR");
        boolean boolean74 = languageRangeList22.add(languageRange73);
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
        org.junit.Assert.assertEquals(locale41.toString(), "ad.ae.af.agchnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.at.au.aw.ax.az.ba.bb.bd.be.bf.bg.bh.bi.bj.bl.bm.bn.bo.bq.br.bs.bt.bv.bw.by.bz.ca.cc.cd.cf.cg.ch.ci.ck.cl.cm.cn.co.cr.cu.cv.cw.cx.cy.cz.de.dj.dk.dm.do.dz.ec.ee.eg.eh.er.es.et.fi.fj.fk.fm.fo.fr.ga.gb.gd.ge.gf.gg.gh.gi.gl.gm.gn.gp.gq.gr.gs.gt.gu.gw.gy.hk.hm.hn.hr.ht.hu.id.ie.il.im.in.io.iq.ir.is.it.je.jm.jo.jp.ke.kg.kh.ki.km.kn.kp.kr.kw.ky.kz.la.lb.lc.li.lk.lr.ls.lt.lu.lv.ly.ma.mc.md.me.mf.mg.mh.mk.ml.mm.mn.mo.mp.mq.mr.ms.mt.mu.mv.mw.mx.my.mz.na.nc.ne.nf.ng.ni.nl.no.np.nr.nu.nz.om.pa.pe.pf.pg.ph.pk.pl.pm.pn.pr.ps.pt.pw.py.qa.re.ro.rs.ru.rw.sa.sb.sc.sd.se.sg.sh.si.sj.sk.sl.sm.sn.so.sr.ss.st.sv.sx.sy.sz.tc.td.tf.tg.th.tj.tk.tl.tm.tn.to.tr.tt.tv.tw.tz.ua.ug.um.us.uy.uz.va.vc.ve.vg.vi.vn.vu.wf.ws.ye.yt.za.zm.zw");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "China" + "'", str42, "China");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "zh-CN" + "'", str43, "zh-CN");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "ad.ae.af.agchnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.at.au.aw.ax.az.ba.bb.bd.be.bf.bg.bh.bi.bj.bl.bm.bn.bo.bq.br.bs.bt.bv.bw.by.bz.ca.cc.cd.cf.cg.ch.ci.ck.cl.cm.cn.co.cr.cu.cv.cw.cx.cy.cz.de.dj.dk.dm.do.dz.ec.ee.eg.eh.er.es.et.fi.fj.fk.fm.fo.fr.ga.gb.gd.ge.gf.gg.gh.gi.gl.gm.gn.gp.gq.gr.gs.gt.gu.gw.gy.hk.hm.hn.hr.ht.hu.id.ie.il.im.in.io.iq.ir.is.it.je.jm.jo.jp.ke.kg.kh.ki.km.kn.kp.kr.kw.ky.kz.la.lb.lc.li.lk.lr.ls.lt.lu.lv.ly.ma.mc.md.me.mf.mg.mh.mk.ml.mm.mn.mo.mp.mq.mr.ms.mt.mu.mv.mw.mx.my.mz.na.nc.ne.nf.ng.ni.nl.no.np.nr.nu.nz.om.pa.pe.pf.pg.ph.pk.pl.pm.pn.pr.ps.pt.pw.py.qa.re.ro.rs.ru.rw.sa.sb.sc.sd.se.sg.sh.si.sj.sk.sl.sm.sn.so.sr.ss.st.sv.sx.sy.sz.tc.td.tf.tg.th.tj.tk.tl.tm.tn.to.tr.tt.tv.tw.tz.ua.ug.um.us.uy.uz.va.vc.ve.vg.vi.vn.vu.wf.ws.ye.yt.za.zm.zw");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "China" + "'", str46, "China");
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "ad.ae.af.agchnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.at.au.aw.ax.az.ba.bb.bd.be.bf.bg.bh.bi.bj.bl.bm.bn.bo.bq.br.bs.bt.bv.bw.by.bz.ca.cc.cd.cf.cg.ch.ci.ck.cl.cm.cn.co.cr.cu.cv.cw.cx.cy.cz.de.dj.dk.dm.do.dz.ec.ee.eg.eh.er.es.et.fi.fj.fk.fm.fo.fr.ga.gb.gd.ge.gf.gg.gh.gi.gl.gm.gn.gp.gq.gr.gs.gt.gu.gw.gy.hk.hm.hn.hr.ht.hu.id.ie.il.im.in.io.iq.ir.is.it.je.jm.jo.jp.ke.kg.kh.ki.km.kn.kp.kr.kw.ky.kz.la.lb.lc.li.lk.lr.ls.lt.lu.lv.ly.ma.mc.md.me.mf.mg.mh.mk.ml.mm.mn.mo.mp.mq.mr.ms.mt.mu.mv.mw.mx.my.mz.na.nc.ne.nf.ng.ni.nl.no.np.nr.nu.nz.om.pa.pe.pf.pg.ph.pk.pl.pm.pn.pr.ps.pt.pw.py.qa.re.ro.rs.ru.rw.sa.sb.sc.sd.se.sg.sh.si.sj.sk.sl.sm.sn.so.sr.ss.st.sv.sx.sy.sz.tc.td.tf.tg.th.tj.tk.tl.tm.tn.to.tr.tt.tv.tw.tz.ua.ug.um.us.uy.uz.va.vc.ve.vg.vi.vn.vu.wf.ws.ye.yt.za.zm.zw");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "China" + "'", str49, "China");
        org.junit.Assert.assertEquals(locale53.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "ad.ae.af.agchnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.at.au.aw.ax.az.ba.bb.bd.be.bf.bg.bh.bi.bj.bl.bm.bn.bo.bq.br.bs.bt.bv.bw.by.bz.ca.cc.cd.cf.cg.ch.ci.ck.cl.cm.cn.co.cr.cu.cv.cw.cx.cy.cz.de.dj.dk.dm.do.dz.ec.ee.eg.eh.er.es.et.fi.fj.fk.fm.fo.fr.ga.gb.gd.ge.gf.gg.gh.gi.gl.gm.gn.gp.gq.gr.gs.gt.gu.gw.gy.hk.hm.hn.hr.ht.hu.id.ie.il.im.in.io.iq.ir.is.it.je.jm.jo.jp.ke.kg.kh.ki.km.kn.kp.kr.kw.ky.kz.la.lb.lc.li.lk.lr.ls.lt.lu.lv.ly.ma.mc.md.me.mf.mg.mh.mk.ml.mm.mn.mo.mp.mq.mr.ms.mt.mu.mv.mw.mx.my.mz.na.nc.ne.nf.ng.ni.nl.no.np.nr.nu.nz.om.pa.pe.pf.pg.ph.pk.pl.pm.pn.pr.ps.pt.pw.py.qa.re.ro.rs.ru.rw.sa.sb.sc.sd.se.sg.sh.si.sj.sk.sl.sm.sn.so.sr.ss.st.sv.sx.sy.sz.tc.td.tf.tg.th.tj.tk.tl.tm.tn.to.tr.tt.tv.tw.tz.ua.ug.um.us.uy.uz.va.vc.ve.vg.vi.vn.vu.wf.ws.ye.yt.za.zm.zw");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "China" + "'", str56, "China");
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
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
    }

    @Test
    public void test16821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16821");
        java.util.Locale locale4 = new java.util.Locale("hi", "hi!", "cHINA");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.lowerCase("CHNaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", locale4);
        java.util.Set<java.lang.Character> charSet6 = locale4.getExtensionKeys();
        org.junit.Assert.assertEquals(locale4.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str5, "chnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(charSet6);
    }

    @Test
    public void test16822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16822");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("\u65e5\u6587", 'u');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u65e5\u6587" + "'", str2, "\u65e5\u6587");
    }

    @Test
    public void test16823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16823");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("Esglish (Usitee Ststes)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 0, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Esglish (Usitee Ststes)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "Esglish (Usitee Ststes)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test16824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16824");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.setLanguageTag("zh-CN");
        java.util.Locale.Builder builder5 = builder3.setLanguage("it");
        java.util.Locale locale6 = builder5.build();
        java.util.Locale locale7 = builder5.build();
        java.util.Locale.Builder builder9 = builder5.setRegion("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder9.setScript("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!              aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!              aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "it_CN");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "it_CN");
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test16825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16825");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray7 = new char[] {};
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "zh-CN", charArray7);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "a", charArray7);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hEnglish", charArray7);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hindi (HI!,cHINA)", charArray7);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "AI", charArray7);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence0, charArray7);
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
    public void test16826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16826");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("ANIHCANIHC", 5, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test16827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16827");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("\u5370\u5730\u6587 (hi!,china)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u5370\u5730\u6587 (hi!,china)" + "'", str1, "\u5370\u5730\u6587 (hi!,china)");
    }

    @Test
    public void test16828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16828");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("kor", "                 a                  ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test16829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16829");
        java.lang.String[] strArray0 = java.util.Locale.getISOLanguages();
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.stripAll(strArray0, "java.lang");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray0);
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray0, '#', (int) (short) 10, 745);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 188");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test16830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16830");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.setLanguageTag("zh-CN");
        java.util.Locale.Builder builder5 = builder3.setLanguage("CHINA");
        java.util.Locale locale6 = builder5.build();
        java.util.Locale locale7 = builder5.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder5.setLanguageTag("hI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: hI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "china_CN");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "china_CN");
    }

    @Test
    public void test16831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16831");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("Italia", "ocle.lngugernge");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test16832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16832");
        java.lang.Class[] classArray2 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray3 = (java.lang.Class<?>[]) classArray2;
        java.lang.Class<?>[] wildcardClassArray4 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray2);
        java.lang.Class<?>[] wildcardClassArray5 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray2);
        java.lang.Class[] classArray8 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray9 = (java.lang.Class<?>[]) classArray8;
        java.lang.Class<?>[] wildcardClassArray10 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray8);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.concatWith("hi!", (java.lang.Object[]) classArray8);
        boolean boolean12 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray2, (java.lang.Class<?>[]) classArray8);
        java.lang.Class<?>[] wildcardClassArray13 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers((java.lang.Class<?>[]) classArray8);
        java.lang.Class<?>[] wildcardClassArray14 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray13);
        java.lang.Class[] classArray16 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray17 = (java.lang.Class<?>[]) classArray16;
        java.lang.Class<?>[] wildcardClassArray18 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray16);
        java.lang.Class<?>[] wildcardClassArray19 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray16);
        java.lang.Class[] classArray21 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray22 = (java.lang.Class<?>[]) classArray21;
        java.lang.Class<?>[] wildcardClassArray23 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray21);
        java.lang.Class<?>[] wildcardClassArray24 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray21);
        java.lang.String str26 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) classArray21, "zh-CN");
        boolean boolean27 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray19, (java.lang.Class<?>[]) classArray21);
        java.lang.Class[] classArray29 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray30 = (java.lang.Class<?>[]) classArray29;
        java.lang.Class<?>[] wildcardClassArray31 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray29);
        java.lang.Class<?>[] wildcardClassArray32 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray29);
        java.lang.Class[] classArray35 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray36 = (java.lang.Class<?>[]) classArray35;
        java.lang.Class<?>[] wildcardClassArray37 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray35);
        java.lang.String str38 = org.apache.commons.lang3.StringUtils.concatWith("hi!", (java.lang.Object[]) classArray35);
        boolean boolean39 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray29, (java.lang.Class<?>[]) classArray35);
        boolean boolean41 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray19, (java.lang.Class<?>[]) classArray35, true);
        java.lang.Class[] classArray43 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray44 = (java.lang.Class<?>[]) classArray43;
        java.lang.Class<?>[] wildcardClassArray45 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray43);
        java.lang.Class<?> wildcardClass46 = null;
        java.lang.Class[] classArray48 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray49 = (java.lang.Class<?>[]) classArray48;
        wildcardClassArray49[0] = wildcardClass46;
        boolean boolean53 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray45, wildcardClassArray49, false);
        java.lang.Class[] classArray55 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray56 = (java.lang.Class<?>[]) classArray55;
        java.lang.Class<?>[] wildcardClassArray57 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray55);
        boolean boolean58 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray45, (java.lang.Class<?>[]) classArray55);
        java.lang.Class[] classArray60 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray61 = (java.lang.Class<?>[]) classArray60;
        java.lang.Class<?>[] wildcardClassArray62 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray60);
        java.lang.Class<?>[] wildcardClassArray63 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray60);
        java.lang.Class[] classArray65 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray66 = (java.lang.Class<?>[]) classArray65;
        java.lang.Class<?>[] wildcardClassArray67 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray65);
        java.lang.Class<?>[] wildcardClassArray68 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray65);
        java.lang.String str70 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) classArray65, "zh-CN");
        boolean boolean71 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray63, (java.lang.Class<?>[]) classArray65);
        boolean boolean73 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray45, wildcardClassArray63, false);
        java.lang.Class<?>[] wildcardClassArray74 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray45);
        java.lang.Class<?>[] wildcardClassArray75 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray45);
        boolean boolean76 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray35, wildcardClassArray45);
        java.lang.Class[] classArray78 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray79 = (java.lang.Class<?>[]) classArray78;
        java.lang.Class<?>[] wildcardClassArray80 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray78);
        java.lang.Class<?> wildcardClass81 = null;
        java.lang.Class[] classArray83 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray84 = (java.lang.Class<?>[]) classArray83;
        wildcardClassArray84[0] = wildcardClass81;
        boolean boolean88 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray80, wildcardClassArray84, false);
        java.lang.Class<?>[] wildcardClassArray89 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray80);
        boolean boolean91 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray35, wildcardClassArray89, false);
        boolean boolean93 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray13, wildcardClassArray89, true);
        java.lang.String str94 = org.apache.commons.lang3.StringUtils.concatWith("italiahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIital..", (java.lang.Object[]) wildcardClassArray89);
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertNotNull(wildcardClassArray4);
        org.junit.Assert.assertNotNull(wildcardClassArray5);
        org.junit.Assert.assertNotNull(classArray8);
        org.junit.Assert.assertNotNull(wildcardClassArray9);
        org.junit.Assert.assertNotNull(wildcardClassArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray13);
        org.junit.Assert.assertNotNull(wildcardClassArray14);
        org.junit.Assert.assertNotNull(classArray16);
        org.junit.Assert.assertNotNull(wildcardClassArray17);
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertNotNull(wildcardClassArray19);
        org.junit.Assert.assertNotNull(classArray21);
        org.junit.Assert.assertNotNull(wildcardClassArray22);
        org.junit.Assert.assertNotNull(wildcardClassArray23);
        org.junit.Assert.assertNotNull(wildcardClassArray24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(classArray29);
        org.junit.Assert.assertNotNull(wildcardClassArray30);
        org.junit.Assert.assertNotNull(wildcardClassArray31);
        org.junit.Assert.assertNotNull(wildcardClassArray32);
        org.junit.Assert.assertNotNull(classArray35);
        org.junit.Assert.assertNotNull(wildcardClassArray36);
        org.junit.Assert.assertNotNull(wildcardClassArray37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(classArray43);
        org.junit.Assert.assertNotNull(wildcardClassArray44);
        org.junit.Assert.assertNotNull(wildcardClassArray45);
        org.junit.Assert.assertNotNull(classArray48);
        org.junit.Assert.assertNotNull(wildcardClassArray49);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(classArray55);
        org.junit.Assert.assertNotNull(wildcardClassArray56);
        org.junit.Assert.assertNotNull(wildcardClassArray57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(classArray60);
        org.junit.Assert.assertNotNull(wildcardClassArray61);
        org.junit.Assert.assertNotNull(wildcardClassArray62);
        org.junit.Assert.assertNotNull(wildcardClassArray63);
        org.junit.Assert.assertNotNull(classArray65);
        org.junit.Assert.assertNotNull(wildcardClassArray66);
        org.junit.Assert.assertNotNull(wildcardClassArray67);
        org.junit.Assert.assertNotNull(wildcardClassArray68);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray74);
        org.junit.Assert.assertNotNull(wildcardClassArray75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNotNull(classArray78);
        org.junit.Assert.assertNotNull(wildcardClassArray79);
        org.junit.Assert.assertNotNull(wildcardClassArray80);
        org.junit.Assert.assertNotNull(classArray83);
        org.junit.Assert.assertNotNull(wildcardClassArray84);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray89);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "" + "'", str94, "");
    }

    @Test
    public void test16833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16833");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("    Z", (int) (byte) -1, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "    Z" + "'", str3, "    Z");
    }

    @Test
    public void test16834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16834");
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
        java.util.Locale.Builder builder68 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder69 = builder68.clearExtensions();
        java.util.Locale.Builder builder71 = builder69.setLanguageTag("zh-CN");
        java.util.Locale locale72 = builder69.build();
        boolean boolean73 = languageRangeList4.contains((java.lang.Object) locale72);
        java.util.Locale.Builder builder74 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder75 = builder74.clearExtensions();
        java.util.Locale.Builder builder77 = builder75.setLanguageTag("zh-CN");
        java.util.Locale.Builder builder79 = builder77.setLanguage("CHINA");
        java.util.Locale.Builder builder81 = builder79.setLanguageTag("english");
        java.util.Locale.Builder builder82 = builder81.clear();
        java.util.Locale.Builder builder83 = builder82.clearExtensions();
        int int84 = languageRangeList4.lastIndexOf((java.lang.Object) builder82);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder86 = builder82.removeUnicodeLocaleAttribute("                                          N       A                                           ");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute:                                           N       A                                            [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
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
        org.junit.Assert.assertEquals(locale20.toString(), "ad.ae.af.agchnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.at.au.aw.ax.az.ba.bb.bd.be.bf.bg.bh.bi.bj.bl.bm.bn.bo.bq.br.bs.bt.bv.bw.by.bz.ca.cc.cd.cf.cg.ch.ci.ck.cl.cm.cn.co.cr.cu.cv.cw.cx.cy.cz.de.dj.dk.dm.do.dz.ec.ee.eg.eh.er.es.et.fi.fj.fk.fm.fo.fr.ga.gb.gd.ge.gf.gg.gh.gi.gl.gm.gn.gp.gq.gr.gs.gt.gu.gw.gy.hk.hm.hn.hr.ht.hu.id.ie.il.im.in.io.iq.ir.is.it.je.jm.jo.jp.ke.kg.kh.ki.km.kn.kp.kr.kw.ky.kz.la.lb.lc.li.lk.lr.ls.lt.lu.lv.ly.ma.mc.md.me.mf.mg.mh.mk.ml.mm.mn.mo.mp.mq.mr.ms.mt.mu.mv.mw.mx.my.mz.na.nc.ne.nf.ng.ni.nl.no.np.nr.nu.nz.om.pa.pe.pf.pg.ph.pk.pl.pm.pn.pr.ps.pt.pw.py.qa.re.ro.rs.ru.rw.sa.sb.sc.sd.se.sg.sh.si.sj.sk.sl.sm.sn.so.sr.ss.st.sv.sx.sy.sz.tc.td.tf.tg.th.tj.tk.tl.tm.tn.to.tr.tt.tv.tw.tz.ua.ug.um.us.uy.uz.va.vc.ve.vg.vi.vn.vu.wf.ws.ye.yt.za.zm.zw");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "China" + "'", str21, "China");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "zh-CN" + "'", str22, "zh-CN");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "ad.ae.af.agchnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.at.au.aw.ax.az.ba.bb.bd.be.bf.bg.bh.bi.bj.bl.bm.bn.bo.bq.br.bs.bt.bv.bw.by.bz.ca.cc.cd.cf.cg.ch.ci.ck.cl.cm.cn.co.cr.cu.cv.cw.cx.cy.cz.de.dj.dk.dm.do.dz.ec.ee.eg.eh.er.es.et.fi.fj.fk.fm.fo.fr.ga.gb.gd.ge.gf.gg.gh.gi.gl.gm.gn.gp.gq.gr.gs.gt.gu.gw.gy.hk.hm.hn.hr.ht.hu.id.ie.il.im.in.io.iq.ir.is.it.je.jm.jo.jp.ke.kg.kh.ki.km.kn.kp.kr.kw.ky.kz.la.lb.lc.li.lk.lr.ls.lt.lu.lv.ly.ma.mc.md.me.mf.mg.mh.mk.ml.mm.mn.mo.mp.mq.mr.ms.mt.mu.mv.mw.mx.my.mz.na.nc.ne.nf.ng.ni.nl.no.np.nr.nu.nz.om.pa.pe.pf.pg.ph.pk.pl.pm.pn.pr.ps.pt.pw.py.qa.re.ro.rs.ru.rw.sa.sb.sc.sd.se.sg.sh.si.sj.sk.sl.sm.sn.so.sr.ss.st.sv.sx.sy.sz.tc.td.tf.tg.th.tj.tk.tl.tm.tn.to.tr.tt.tv.tw.tz.ua.ug.um.us.uy.uz.va.vc.ve.vg.vi.vn.vu.wf.ws.ye.yt.za.zm.zw");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "China" + "'", str25, "China");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "ad.ae.af.agchnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.at.au.aw.ax.az.ba.bb.bd.be.bf.bg.bh.bi.bj.bl.bm.bn.bo.bq.br.bs.bt.bv.bw.by.bz.ca.cc.cd.cf.cg.ch.ci.ck.cl.cm.cn.co.cr.cu.cv.cw.cx.cy.cz.de.dj.dk.dm.do.dz.ec.ee.eg.eh.er.es.et.fi.fj.fk.fm.fo.fr.ga.gb.gd.ge.gf.gg.gh.gi.gl.gm.gn.gp.gq.gr.gs.gt.gu.gw.gy.hk.hm.hn.hr.ht.hu.id.ie.il.im.in.io.iq.ir.is.it.je.jm.jo.jp.ke.kg.kh.ki.km.kn.kp.kr.kw.ky.kz.la.lb.lc.li.lk.lr.ls.lt.lu.lv.ly.ma.mc.md.me.mf.mg.mh.mk.ml.mm.mn.mo.mp.mq.mr.ms.mt.mu.mv.mw.mx.my.mz.na.nc.ne.nf.ng.ni.nl.no.np.nr.nu.nz.om.pa.pe.pf.pg.ph.pk.pl.pm.pn.pr.ps.pt.pw.py.qa.re.ro.rs.ru.rw.sa.sb.sc.sd.se.sg.sh.si.sj.sk.sl.sm.sn.so.sr.ss.st.sv.sx.sy.sz.tc.td.tf.tg.th.tj.tk.tl.tm.tn.to.tr.tt.tv.tw.tz.ua.ug.um.us.uy.uz.va.vc.ve.vg.vi.vn.vu.wf.ws.ye.yt.za.zm.zw");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "China" + "'", str28, "China");
        org.junit.Assert.assertEquals(locale32.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "ad.ae.af.agchnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.at.au.aw.ax.az.ba.bb.bd.be.bf.bg.bh.bi.bj.bl.bm.bn.bo.bq.br.bs.bt.bv.bw.by.bz.ca.cc.cd.cf.cg.ch.ci.ck.cl.cm.cn.co.cr.cu.cv.cw.cx.cy.cz.de.dj.dk.dm.do.dz.ec.ee.eg.eh.er.es.et.fi.fj.fk.fm.fo.fr.ga.gb.gd.ge.gf.gg.gh.gi.gl.gm.gn.gp.gq.gr.gs.gt.gu.gw.gy.hk.hm.hn.hr.ht.hu.id.ie.il.im.in.io.iq.ir.is.it.je.jm.jo.jp.ke.kg.kh.ki.km.kn.kp.kr.kw.ky.kz.la.lb.lc.li.lk.lr.ls.lt.lu.lv.ly.ma.mc.md.me.mf.mg.mh.mk.ml.mm.mn.mo.mp.mq.mr.ms.mt.mu.mv.mw.mx.my.mz.na.nc.ne.nf.ng.ni.nl.no.np.nr.nu.nz.om.pa.pe.pf.pg.ph.pk.pl.pm.pn.pr.ps.pt.pw.py.qa.re.ro.rs.ru.rw.sa.sb.sc.sd.se.sg.sh.si.sj.sk.sl.sm.sn.so.sr.ss.st.sv.sx.sy.sz.tc.td.tf.tg.th.tj.tk.tl.tm.tn.to.tr.tt.tv.tw.tz.ua.ug.um.us.uy.uz.va.vc.ve.vg.vi.vn.vu.wf.ws.ye.yt.za.zm.zw");
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
        org.junit.Assert.assertNotNull(builder69);
        org.junit.Assert.assertNotNull(builder71);
        org.junit.Assert.assertNotNull(locale72);
        org.junit.Assert.assertEquals(locale72.toString(), "zh_CN");
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(builder75);
        org.junit.Assert.assertNotNull(builder77);
        org.junit.Assert.assertNotNull(builder79);
        org.junit.Assert.assertNotNull(builder81);
        org.junit.Assert.assertNotNull(builder82);
        org.junit.Assert.assertNotNull(builder83);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + (-1) + "'", int84 == (-1));
    }

    @Test
    public void test16835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16835");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("fran\347ais");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "fran\347ais" + "'", str1, "fran\347ais");
    }

    @Test
    public void test16836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16836");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("IIIIIIIIIIIIIIIIIIIIIIISTRINGIIIIIIIIIIIIIIIIIIIIIII");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=iiiiiiiiiiiiiiiiiiiiiiistringiiiiiiiiiiiiiiiiiiiiiii");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16837");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("                 A                ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                 a                " + "'", str1, "                 a                ");
    }

    @Test
    public void test16838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16838");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("", "ese (Taiwan$$$$$$$$$slgneese (Taiwan");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test16839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16839");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("ANIHC      ", strMap1);
        java.util.Iterator<java.util.Locale.LanguageRange> languageRangeItor3 = languageRangeList2.iterator();
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(languageRangeItor3, "english");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(languageRangeItor3, "                  hI   Taiwan                  hI                                                                       ");
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeItor3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test16840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16840");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("cHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA444444444444444444444444444444444444444444444444", "CINAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", 17);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test16841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16841");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "...X.AZ.BA.BB.BD.BE.BF.BG.BH.BI.BJ.BL.BM.BN..._italiano", "\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587         ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test16842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16842");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "Esglish (Usitee Ststes)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test16843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16843");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("zH", (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=-1.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16844");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "               RGLaSa               ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test16845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16845");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                              german", 'u');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test16846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16846");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.setLanguageTag("zh-CN");
        java.util.Locale.Builder builder5 = builder3.setLanguage("CHINA");
        java.util.Locale.Builder builder7 = builder5.setLanguageTag("english");
        java.util.Locale locale8 = builder7.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder7.setVariant("############################NHC");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: ############################NHC [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "english");
    }

    @Test
    public void test16847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16847");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                   java.util.stream");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test16848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16848");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("English");
        java.lang.String str3 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) languageRange1, "");
        java.util.Locale.LanguageRange languageRange5 = new java.util.Locale.LanguageRange("a");
        java.util.Locale.LanguageRange languageRange7 = new java.util.Locale.LanguageRange("a");
        java.util.Locale.LanguageRange[] languageRangeArray8 = new java.util.Locale.LanguageRange[] { languageRange1, languageRange5, languageRange7 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList9 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList9, languageRangeArray8);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor11 = languageRangeList9.listIterator();
        languageRangeList9.clear();
        languageRangeList9.clear();
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList9, '.');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Locale.LanguageRange" + "'", str3, "Locale.LanguageRange");
        org.junit.Assert.assertNotNull(languageRangeArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(languageRangeItor11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test16849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16849");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("ese (Taiwan$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$", "en_CA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ese (Taiwan$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$" + "'", str2, "ese (Taiwan$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
    }

    @Test
    public void test16850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16850");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("zhcines", strMap1);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList2, strMap3);
        java.util.Spliterator<java.util.Locale.LanguageRange> languageRangeSpliterator5 = languageRangeList2.spliterator();
        int int6 = languageRangeList2.size();
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(languageRangeSpliterator5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test16851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16851");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray10 = new char[] {};
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "zh-CN", charArray10);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "a", charArray10);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "  China   ", charArray10);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                 a                  ", charArray10);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny("ese (Taiwan", charArray10);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(charSequence3, charArray10);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "Class[]", charArray10);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsAny("Locale.Builder[]", charArray10);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsAny("German", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test16852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16852");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("ANIHCxxxxhIxxx");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ANIHCxxxxhIxxx" + "'", str1, "ANIHCxxxxhIxxx");
    }

    @Test
    public void test16853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16853");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "ITFRITL");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test16854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16854");
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
        java.lang.String str37 = locale36.toLanguageTag();
        java.lang.String str38 = locale36.getISO3Country();
        boolean boolean39 = locale36.hasExtensions();
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
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "it");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "it" + "'", str37, "it");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test16855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16855");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("\u4e2d\u56fd", "                                   java.util.stream");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test16856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16856");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("                                                       .");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test16857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16857");
        java.util.Locale locale2 = new java.util.Locale("\u7fa9\u5927\u5229\u6587", "redliuB.elacoL                            ");
        org.junit.Assert.assertEquals(locale2.toString(), "\u7fa9\u5927\u5229\u6587_REDLIUB.ELACOL                            ");
    }

    @Test
    public void test16858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16858");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder33 = builder31.removeUnicodeLocaleAttribute("char[]char[]char[]cITALIANOchar[]char[]char[]ch");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: char[]char[]char[]cITALIANOchar[]char[]char[]ch [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "it");
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "inglese" + "'", str12, "inglese");
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
    }

    @Test
    public void test16859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16859");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("ad.fr_CAzw                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ", "CHINES", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test16860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16860");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("KOR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "KOR" + "'", str1, "KOR");
    }

    @Test
    public void test16861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16861");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "Collections.EmptySetCollections.EmptySetCollections.EmptySetCollections.EmptySetCollections.EmptySetCollections.EmptySetCollections.EmptySetCollections.EmptySetCollections.EmptySetCollections.EmptySetCollections.EmptySetCollections.EmptySetCollections.EmptySetCollections.EmptySetCollections.EmptySetCollections.EmptySet", true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: Collections/EmptySetCollections/EmptySetCollections/EmptySetCollections/EmptySetCollections/EmptySetCollections/EmptySetCollections/EmptySetCollections/EmptySetCollections/EmptySetCollections/EmptySetCollections/EmptySetCollections/EmptySetCollections/EmptySetCollections/EmptySetCollections/EmptySetCollections/EmptySet");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16862");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass("xxxxxxxx)adanaC( eselgnixxxxxxxx", true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: xxxxxxxx)adanaC(eselgnixxxxxxxx");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16863");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str3 = locale2.getDisplayLanguage();
        java.lang.String str4 = locale2.getDisplayScript();
        java.util.Locale.setDefault(category0, locale2);
        java.lang.String str6 = locale2.getISO3Country();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "cinese" + "'", str3, "cinese");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "TWN" + "'", str6, "TWN");
    }

    @Test
    public void test16864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16864");
        java.util.Locale locale2 = new java.util.Locale("chinarglasachinarglasachinarglasachinarglasachinarglasachinarglasachinarglasachinarglasachinarglasachina", "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxchn");
        org.junit.Assert.assertEquals(locale2.toString(), "chinarglasachinarglasachinarglasachinarglasachinarglasachinarglasachinarglasachinarglasachinarglasachina_XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXCHN");
    }

    @Test
    public void test16865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16865");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("hi");
        boolean boolean3 = languageRangeList1.remove((java.lang.Object) "English");
        java.util.Locale.LanguageRange languageRange5 = languageRangeList1.get(0);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap7 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList8 = java.util.Locale.LanguageRange.parse("Cina", strMap7);
        java.util.Locale.LanguageRange languageRange10 = new java.util.Locale.LanguageRange("English");
        java.lang.String str12 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) languageRange10, "");
        java.lang.String str13 = languageRange10.getRange();
        boolean boolean14 = languageRangeList8.add(languageRange10);
        double double15 = languageRange10.getWeight();
        double double16 = languageRange10.getWeight();
        boolean boolean17 = languageRangeList1.add(languageRange10);
        java.lang.String str18 = languageRange10.getRange();
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(languageRange5);
        org.junit.Assert.assertNotNull(languageRangeList8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Locale.LanguageRange" + "'", str12, "Locale.LanguageRange");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "english" + "'", str13, "english");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "english" + "'", str18, "english");
    }

    @Test
    public void test16866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16866");
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
        java.util.Locale.Builder builder34 = builder32.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder36 = builder32.setLanguageTag("");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Empty subtag [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder34);
    }

    @Test
    public void test16867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16867");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("            )ANIHc,!IH(idni            )ANIHc,!IH(idni            )ANIHc,!IH(idni            )ANIHc,!IH(idni            )ANIHc,!IH(idni            )ANIHc,!IH(idni            )ANIHc,!IH(idni            )ANIHc,!IH(idni            )ANIHc,!IH(idni            )ANIHc,!IH(idni            )ANIHc,!IH(idni            )ANIHc,!IH(idni", "eNGLxxxxENGLISHSxxxxENGLISH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "            )ANIHc,!IH(idni            )ANIHc,!IH(idni            )ANIHc,!IH(idni            )ANIHc,!IH(idni            )ANIHc,!IH(idni            )ANIHc,!IH(idni            )ANIHc,!IH(idni            )ANIHc,!IH(idni            )ANIHc,!IH(idni            )ANIHc,!IH(idni            )ANIHc,!IH(idni            )ANIHc,!IH(idni" + "'", str2, "            )ANIHc,!IH(idni            )ANIHc,!IH(idni            )ANIHc,!IH(idni            )ANIHc,!IH(idni            )ANIHc,!IH(idni            )ANIHc,!IH(idni            )ANIHc,!IH(idni            )ANIHc,!IH(idni            )ANIHc,!IH(idni            )ANIHc,!IH(idni            )ANIHc,!IH(idni            )ANIHc,!IH(idni");
    }

    @Test
    public void test16868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16868");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("String[]");
        java.lang.String str2 = locale1.getDisplayCountry();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test16869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16869");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("United State", "ad.ae.af.ag.ai.al.am.an.ao.aq.ar.as.at.au.aw.ax.az.ba.bb.bd.be.bf.bg.bh.bi.bj.bl.bm.bn.bo.bq.br.bs.bt.bv.bw.by.bz.ca.cc.cd.cf.cg.ch.ci.ck.cl.cm.cn.co.cr.cu.cv.cw.cx.cy.cz.de.dj.dk.dm.do.dz.ec.ee.eg.eh.er.es.et.fi.fj.fk.fm.fo.fr.ga.gb.gd.ge.gf.gg.gh.gi.gl.gm.gn.gp.gq.gr.gs.gt.gu.gw.gy.hk.hm.hn.hr.ht.hu.id.ie.il.im.in.io.iq.ir.is.it.je.jm.jo.jp.ke.kg.kh.ki.km.kn.kp.kr.kw.ky.kz.la.lb.lc.li.lk.lr.ls.lt.lu.lv.ly.ma.mc.md.me.mf.mg.mh.mk.ml.mm.mn.mo.mp.mq.mr.ms.mt.mu.mv.mw.mx.my.mz.na.nc.ne.nf.ng.ni.nl.no.np.nr.nu.nz.om.pa.pe.pf.pg.ph.pk.pl.pm.pn.pr.ps.pt.pw.py.qa.re.ro.rs.ru.rw.sa.sb.sc.sd.se.sg.sh.si.sj.sk.sl.sm.sn.so.sr.ss.st.sv.sx.sy.sz.tc.td.tf.tg.th.tj.tk.tl.tm.tn.to.tr.tt.tv.tw.tz.ua.ug.um.us.uy.uz.va.vc.ve.vg.vi.vn.vu.wf.ws.ye.yt.za.zm.z", "ZH)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "United State" + "'", str3, "United State");
    }

    @Test
    public void test16870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16870");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("\u56fd\u4e2d\u6587\u4e2d   ", "Esglish (Usitee Ststes");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u56fd\u4e2d\u6587\u4e2d   " + "'", str2, "\u56fd\u4e2d\u6587\u4e2d   ");
    }

    @Test
    public void test16871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16871");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("nc-hz");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "nc-hz" + "'", str1, "nc-hz");
    }

    @Test
    public void test16872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16872");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("it", strMap1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList2, "cinese (Taiwan)");
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor5 = languageRangeList2.listIterator();
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.util.Iterator<java.util.Locale.LanguageRange>) languageRangeItor5, "");
        boolean boolean8 = languageRangeItor5.hasNext();
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.util.Iterator<java.util.Locale.LanguageRange>) languageRangeItor5, "zh-cnenglish (locale.languagerange)");
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeItor5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test16873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16873");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("                                                                                            ##_#A");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                            ##_#a" + "'", str1, "                                                                                            ##_#a");
    }

    @Test
    public void test16874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16874");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("undaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahundaaaaaaahit_CN", 'x');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test16875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16875");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("xxx", "CLASS[]");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "xxx" + "'", str2, "xxx");
    }

    @Test
    public void test16876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16876");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("AN                 a                 AN  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AN                 a                 AN" + "'", str1, "AN                 a                 AN");
    }

    @Test
    public void test16877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16877");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("...iahiit_cn..italiahiit_cn..italiahiit_cn..italiahi", "        ddddddddddddddddddddddddddd$(JAVA.LANG)ddddddddd        ", "\u4e2d\u56fd", 234);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "...iahiit_cn..italiahiit_cn..italiahiit_cn..italiahi" + "'", str4, "...iahiit_cn..italiahiit_cn..italiahiit_cn..italiahi");
    }

    @Test
    public void test16878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16878");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("hindiHindiHinclass java.lang.StringhindiHindiHin", "ncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncArrayList", 11);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hindiHindiHinclass java.lang.StringhindiHindiHin" + "'", str3, "hindiHindiHinclass java.lang.StringhindiHindiHin");
    }

    @Test
    public void test16879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16879");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "Acol");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test16880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16880");
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
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor33 = languageRangeList4.listIterator(0);
        java.util.Locale.LanguageRange[] languageRangeArray34 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList35 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList35, languageRangeArray34);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap37 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList38 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList35, strMap37);
        java.util.Locale.LanguageRange[] languageRangeArray39 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList40 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList40, languageRangeArray39);
        boolean boolean42 = languageRangeList35.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList40);
        java.util.Locale.LanguageRange[] languageRangeArray43 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList44 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList44, languageRangeArray43);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap46 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList47 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList44, strMap46);
        java.util.Locale.LanguageRange[] languageRangeArray48 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList49 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList49, languageRangeArray48);
        boolean boolean51 = languageRangeList44.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList49);
        java.lang.String str53 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList49, "hi!");
        boolean boolean54 = languageRangeList35.containsAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList49);
        java.util.Locale locale55 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale56 = java.util.Locale.getDefault();
        java.lang.String str57 = locale55.getDisplayCountry(locale56);
        java.lang.String str58 = locale56.getDisplayVariant();
        boolean boolean59 = languageRangeList35.contains((java.lang.Object) str58);
        boolean boolean60 = languageRangeList4.containsAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList35);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList63 = languageRangeList4.subList(0, 1);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream64 = languageRangeList4.stream();
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
        org.junit.Assert.assertNotNull(languageRangeItor33);
        org.junit.Assert.assertNotNull(languageRangeArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(languageRangeList38);
        org.junit.Assert.assertNotNull(languageRangeArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(languageRangeArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(languageRangeList47);
        org.junit.Assert.assertNotNull(languageRangeArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale56);
        org.junit.Assert.assertEquals(locale56.toString(), "it");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "Cina" + "'", str57, "Cina");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(languageRangeList63);
        org.junit.Assert.assertNotNull(languageRangeStream64);
    }

    @Test
    public void test16881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16881");
        java.util.Locale locale0 = java.util.Locale.JAPANESE;
        java.util.Locale locale2 = new java.util.Locale("");
        java.lang.String str3 = locale2.getDisplayLanguage();
        java.util.Locale locale4 = java.util.Locale.CANADA;
        java.lang.String str5 = locale4.getDisplayLanguage();
        java.lang.String str6 = locale2.getDisplayScript(locale4);
        java.lang.String str7 = locale4.getDisplayVariant();
        java.util.Locale locale8 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale9 = java.util.Locale.getDefault();
        java.lang.String str10 = locale8.getDisplayCountry(locale9);
        java.lang.String str11 = locale9.getDisplayVariant();
        java.lang.String str12 = locale4.getDisplayScript(locale9);
        java.lang.String str13 = locale4.getScript();
        java.lang.String str14 = locale0.getDisplayVariant(locale4);
        java.lang.String str15 = locale0.getDisplayCountry();
        java.util.Locale.setDefault(locale0);
        java.lang.String str17 = locale0.getDisplayVariant();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ja");
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u82f1\u6587" + "'", str5, "\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "it");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Cina" + "'", str10, "Cina");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test16882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16882");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("Chinese (Taiwan)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "chinese (taiwan)" + "'", str1, "chinese (taiwan)");
    }

    @Test
    public void test16883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16883");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("\u4e2d\u6587\u53f0\u6e7e\u5730\u533a)", (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test16884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16884");
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
        java.lang.Class[] classArray32 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray33 = (java.lang.Class<?>[]) classArray32;
        java.lang.Class<?>[] wildcardClassArray34 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray32);
        java.lang.Class<?> wildcardClass35 = null;
        java.lang.Class[] classArray37 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray38 = (java.lang.Class<?>[]) classArray37;
        wildcardClassArray38[0] = wildcardClass35;
        boolean boolean42 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray34, wildcardClassArray38, false);
        java.lang.Class<?>[] wildcardClassArray43 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray34);
        java.lang.Class<?>[] wildcardClassArray44 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray43);
        java.lang.Class[] classArray46 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray47 = (java.lang.Class<?>[]) classArray46;
        java.lang.Class<?>[] wildcardClassArray48 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray46);
        java.lang.Class<?> wildcardClass49 = null;
        java.lang.Class[] classArray51 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray52 = (java.lang.Class<?>[]) classArray51;
        wildcardClassArray52[0] = wildcardClass49;
        boolean boolean56 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray48, wildcardClassArray52, false);
        java.lang.Class<?>[] wildcardClassArray57 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray48);
        java.lang.Class<?>[] wildcardClassArray58 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray57);
        boolean boolean59 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray43, wildcardClassArray57);
        boolean boolean61 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray25, wildcardClassArray43, false);
        java.lang.Class<?>[] wildcardClassArray62 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray43);
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
        org.junit.Assert.assertNotNull(classArray32);
        org.junit.Assert.assertNotNull(wildcardClassArray33);
        org.junit.Assert.assertNotNull(wildcardClassArray34);
        org.junit.Assert.assertNotNull(classArray37);
        org.junit.Assert.assertNotNull(wildcardClassArray38);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray43);
        org.junit.Assert.assertNotNull(wildcardClassArray44);
        org.junit.Assert.assertNotNull(classArray46);
        org.junit.Assert.assertNotNull(wildcardClassArray47);
        org.junit.Assert.assertNotNull(wildcardClassArray48);
        org.junit.Assert.assertNotNull(classArray51);
        org.junit.Assert.assertNotNull(wildcardClassArray52);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray57);
        org.junit.Assert.assertNotNull(wildcardClassArray58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray62);
    }

    @Test
    public void test16885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16885");
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
        java.util.Locale.LanguageRange[] languageRangeArray21 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList22 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList22, languageRangeArray21);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap24 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList25 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList22, strMap24);
        int int26 = languageRangeList22.size();
        java.util.List<java.util.Locale.LanguageRange> languageRangeList28 = java.util.Locale.LanguageRange.parse("hi");
        boolean boolean30 = languageRangeList28.remove((java.lang.Object) "English");
        boolean boolean31 = languageRangeList22.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList28);
        java.util.Locale.LanguageRange[] languageRangeArray32 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList33 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList33, languageRangeArray32);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap35 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList36 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList33, strMap35);
        java.lang.String[] strArray44 = new java.lang.String[] { "English", "hi", "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "", "a", "", "China" };
        java.util.ArrayList<java.lang.String> strList45 = new java.util.ArrayList<java.lang.String>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList45, strArray44);
        java.util.List<java.lang.Class<?>> wildcardClassList47 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList45);
        java.lang.String str48 = java.util.Locale.lookupTag(languageRangeList36, (java.util.Collection<java.lang.String>) strList45);
        java.util.List<java.lang.Class<?>> wildcardClassList49 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList45);
        java.util.List<java.lang.String> strList50 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList22, (java.util.Collection<java.lang.String>) strList45);
        java.util.List<java.lang.Class<?>> wildcardClassList51 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList45);
        java.util.List<java.lang.Class<?>> wildcardClassList52 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList45);
        java.util.Locale.FilteringMode filteringMode53 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList54 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList15, (java.util.Collection<java.lang.String>) strList45, filteringMode53);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream55 = languageRangeList15.stream();
        java.util.Locale.LanguageRange[] languageRangeArray56 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList57 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList57, languageRangeArray56);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap59 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList60 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList57, strMap59);
        java.util.Iterator<java.util.Locale.LanguageRange> languageRangeItor61 = languageRangeList57.iterator();
        java.util.Locale locale64 = new java.util.Locale("");
        java.lang.String str65 = locale64.getDisplayLanguage();
        java.util.Locale locale66 = java.util.Locale.CANADA;
        java.lang.String str67 = locale66.getDisplayLanguage();
        java.lang.String str68 = locale64.getDisplayScript(locale66);
        java.lang.String str69 = locale66.getDisplayVariant();
        java.lang.String str70 = org.apache.commons.lang3.StringUtils.upperCase("", locale66);
        java.lang.String str71 = locale66.getLanguage();
        boolean boolean72 = languageRangeList57.equals((java.lang.Object) locale66);
        boolean boolean73 = languageRangeList15.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList57);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList75 = java.util.Locale.LanguageRange.parse("hi");
        java.lang.Object[] objArray76 = languageRangeList75.toArray();
        java.util.Spliterator<java.util.Locale.LanguageRange> languageRangeSpliterator77 = languageRangeList75.spliterator();
        java.util.Locale.Builder builder78 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder79 = builder78.clearExtensions();
        java.util.Locale.Builder builder81 = builder79.setLanguageTag("zh-CN");
        java.util.Locale locale82 = builder79.build();
        boolean boolean83 = languageRangeList75.remove((java.lang.Object) locale82);
        java.util.Locale locale86 = new java.util.Locale("CHN", "hi!");
        java.lang.String str87 = locale82.getDisplayLanguage(locale86);
        java.util.Set<java.lang.String> strSet88 = locale86.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.String> strSet89 = locale86.getUnicodeLocaleKeys();
        java.util.List<java.lang.String> strList90 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList57, (java.util.Collection<java.lang.String>) strSet89);
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
        org.junit.Assert.assertNotNull(languageRangeArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(languageRangeList25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(languageRangeList28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(languageRangeArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(languageRangeList36);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(wildcardClassList47);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNotNull(wildcardClassList49);
        org.junit.Assert.assertNotNull(strList50);
        org.junit.Assert.assertNotNull(wildcardClassList51);
        org.junit.Assert.assertNotNull(wildcardClassList52);
        org.junit.Assert.assertTrue("'" + filteringMode53 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode53.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList54);
        org.junit.Assert.assertNotNull(languageRangeStream55);
        org.junit.Assert.assertNotNull(languageRangeArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(languageRangeList60);
        org.junit.Assert.assertNotNull(languageRangeItor61);
        org.junit.Assert.assertEquals(locale64.toString(), "");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertNotNull(locale66);
        org.junit.Assert.assertEquals(locale66.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "\u82f1\u8a9e" + "'", str67, "\u82f1\u8a9e");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "en" + "'", str71, "en");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(languageRangeList75);
        org.junit.Assert.assertNotNull(objArray76);
        org.junit.Assert.assertNotNull(languageRangeSpliterator77);
        org.junit.Assert.assertNotNull(builder79);
        org.junit.Assert.assertNotNull(builder81);
        org.junit.Assert.assertNotNull(locale82);
        org.junit.Assert.assertEquals(locale82.toString(), "zh_CN");
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertEquals(locale86.toString(), "chn_HI!");
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "Chinese" + "'", str87, "Chinese");
        org.junit.Assert.assertNotNull(strSet88);
        org.junit.Assert.assertNotNull(strSet89);
        org.junit.Assert.assertNotNull(strList90);
    }

    @Test
    public void test16886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16886");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("har[]");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HAR[]" + "'", str1, "HAR[]");
    }

    @Test
    public void test16887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16887");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("ANIHC               EN_ca");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "anihc               en_ca" + "'", str1, "anihc               en_ca");
    }

    @Test
    public void test16888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16888");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("germn");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test16889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16889");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageName("raaaaaaaaaaaaaaaaaaaingleseaaaaaaaaaaaaaaaaaaaaglAsA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test16890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16890");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("               RGLASA               ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "RGLASA" + "'", str1, "RGLASA");
    }

    @Test
    public void test16891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16891");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove(".....zhcinesese", "dddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ".....zhcinesese" + "'", str2, ".....zhcinesese");
    }

    @Test
    public void test16892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16892");
        java.util.Locale locale3 = new java.util.Locale("zh-CNenglish", "Locale.LanguageRange", "");
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleAttributes();
        java.util.Locale.setDefault(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh-cnenglish_LOCALE.LANGUAGERANGE");
        org.junit.Assert.assertNotNull(strSet4);
    }

    @Test
    public void test16893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16893");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("FilteringMode", "zh_tw_CHINCHINCHINCHINCHICHINCHINCHINCHINC");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "FilteringMode" + "'", str2, "FilteringMode");
    }

    @Test
    public void test16894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16894");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("#######################################################################################", "enghI", (int) ' ');
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny("GBR", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test16895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16895");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("CN");
        java.util.Set<java.lang.String> strSet2 = locale1.getUnicodeLocaleKeys();
        java.lang.String str3 = locale1.getDisplayCountry();
        java.util.Set<java.lang.String> strSet4 = locale1.getUnicodeLocaleAttributes();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "cn");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(strSet4);
    }

    @Test
    public void test16896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16896");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("\u4e2d\u56fd", "GGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGA   LIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u4e2d\u56fd" + "'", str2, "\u4e2d\u56fd");
    }

    @Test
    public void test16897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16897");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "ENGL....ENGLISHS....ENGLISH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ENGL....ENGLISHS....ENGLISH" + "'", str1, "ENGL....ENGLISHS....ENGLISH");
    }

    @Test
    public void test16898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16898");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "hindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHind");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 259 + "'", int1 == 259);
    }

    @Test
    public void test16899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16899");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("can               ", 117, "italia");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "italiaitaliaitaliaitaliaitaliaitaliaitaliaitaliaitaliaitaliaitaliaitaliaitaliaitaliaitaliaitaliaitacan               " + "'", str3, "italiaitaliaitaliaitaliaitaliaitaliaitaliaitaliaitaliaitaliaitaliaitaliaitaliaitaliaitaliaitaliaitacan               ");
    }

    @Test
    public void test16900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16900");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("uuuuuxAuuuuu", "RRAYLIS");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "uuuuuxAuuuuu" + "'", str2, "uuuuuxAuuuuu");
    }

    @Test
    public void test16901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16901");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("##ITALIAN", '#');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test16902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16902");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("string[]", "trt           hindi(HI!,cHINA)            g[]");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test16903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16903");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("Cina", strMap1);
        java.lang.String[] strArray6 = new java.lang.String[] { "aiaiaiaiaiaiaiaiaia", "zh-CN", "China" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        java.util.Locale.FilteringMode filteringMode9 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList10 = java.util.Locale.filterTags(languageRangeList2, (java.util.Collection<java.lang.String>) strList7, filteringMode9);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.splitByCharacterType("ita");
        boolean boolean13 = languageRangeList2.remove((java.lang.Object) strArray12);
        java.lang.String[] strArray16 = org.apache.commons.lang3.StringUtils.split("LANG                                                      ", ' ');
        boolean boolean17 = languageRangeList2.equals((java.lang.Object) ' ');
        org.apache.commons.lang3.ClassUtils[][][] classUtilsArray18 = new org.apache.commons.lang3.ClassUtils[][][] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.ClassUtils[][][] classUtilsArray19 = languageRangeList2.toArray(classUtilsArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException; message: null");
        } catch (java.lang.ArrayStoreException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + filteringMode9 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode9.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(classUtilsArray18);
    }

    @Test
    public void test16904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16904");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("LANGUAGERANGE", "\u7fa9\u5927\u5229");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test16905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16905");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("ITAFRAITA", "                                 ...inglese (Cnd)xxxxxxxx                                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ITAFRAITA" + "'", str2, "ITAFRAITA");
    }

    @Test
    public void test16906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16906");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.setLanguageTag("zh-CN");
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        java.util.Locale.Builder builder6 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder7 = builder6.clearExtensions();
        java.util.Locale.Builder builder9 = builder7.setLanguageTag("zh-CN");
        java.util.Locale.Builder builder11 = builder9.setLanguage("CHINA");
        java.util.Locale locale12 = builder9.build();
        java.util.Locale.Builder builder13 = builder9.clearExtensions();
        java.util.Locale locale14 = builder13.build();
        java.util.Locale.Builder builder15 = builder4.setLocale(locale14);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder17 = builder4.addUnicodeLocaleAttribute("$");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: $ [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "china_CN");
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "china_CN");
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test16907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16907");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("undaaaaaaaH                                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "undaaaaaaaH                                 " + "'", str1, "undaaaaaaaH                                 ");
    }

    @Test
    public void test16908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16908");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("hi");
        java.lang.Object[] objArray2 = languageRangeList1.toArray();
        java.util.Spliterator<java.util.Locale.LanguageRange> languageRangeSpliterator3 = languageRangeList1.spliterator();
        java.util.Locale.Builder builder4 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        java.util.Locale.Builder builder7 = builder5.setLanguageTag("zh-CN");
        java.util.Locale locale8 = builder5.build();
        boolean boolean9 = languageRangeList1.remove((java.lang.Object) locale8);
        java.util.Locale locale10 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale11 = java.util.Locale.getDefault();
        java.lang.String str12 = locale10.getDisplayCountry(locale11);
        java.lang.String str13 = locale11.getCountry();
        java.lang.String str14 = locale11.getDisplayName();
        boolean boolean15 = languageRangeList1.remove((java.lang.Object) str14);
        java.util.Locale.LanguageRange[] languageRangeArray16 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList17 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList17, languageRangeArray16);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap19 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList20 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList17, strMap19);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor21 = languageRangeList20.listIterator();
        boolean boolean22 = languageRangeList1.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList20);
        java.util.Locale.LanguageRange[] languageRangeArray23 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList24 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList24, languageRangeArray23);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap26 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList27 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList24, strMap26);
        int int28 = languageRangeList24.size();
        java.util.List<java.util.Locale.LanguageRange> languageRangeList30 = java.util.Locale.LanguageRange.parse("hi");
        boolean boolean32 = languageRangeList30.remove((java.lang.Object) "English");
        boolean boolean33 = languageRangeList24.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList30);
        java.lang.String[] strArray38 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("English", "hi", (int) (short) -1);
        java.lang.String[] strArray41 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("a", "");
        java.lang.String[] strArray42 = org.apache.commons.lang3.StringUtils.stripAll(strArray41);
        java.lang.String[] strArray43 = org.apache.commons.lang3.StringUtils.stripAll(strArray42);
        java.lang.String str44 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", strArray38, strArray42);
        boolean boolean45 = languageRangeList24.equals((java.lang.Object) strArray42);
        java.util.Locale locale48 = new java.util.Locale("");
        java.lang.String str49 = locale48.getDisplayLanguage();
        java.util.Locale locale50 = java.util.Locale.CANADA;
        java.lang.String str51 = locale50.getDisplayLanguage();
        java.lang.String str52 = locale48.getDisplayScript(locale50);
        java.lang.String str53 = org.apache.commons.lang3.StringUtils.lowerCase("a", locale48);
        java.lang.String str54 = locale48.getDisplayScript();
        java.util.Set<java.lang.String> strSet55 = locale48.getUnicodeLocaleAttributes();
        java.util.List<java.lang.String> strList56 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList24, (java.util.Collection<java.lang.String>) strSet55);
        java.util.List<java.lang.String> strList57 = java.util.Locale.filterTags(languageRangeList20, (java.util.Collection<java.lang.String>) strList56);
        int int58 = languageRangeList20.size();
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(languageRangeSpliterator3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh_CN");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh-cnenglish_LOCALE.LANGUAGERANGE");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "China" + "'", str12, "China");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "LOCALE.LANGUAGERANGE" + "'", str13, "LOCALE.LANGUAGERANGE");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "zh-cnenglish (LOCALE.LANGUAGERANGE)" + "'", str14, "zh-cnenglish (LOCALE.LANGUAGERANGE)");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(languageRangeArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(languageRangeList20);
        org.junit.Assert.assertNotNull(languageRangeItor21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(languageRangeArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(languageRangeList27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(languageRangeList30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h" + "'", str44, "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals(locale48.toString(), "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "English" + "'", str51, "English");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "a" + "'", str53, "a");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNotNull(strSet55);
        org.junit.Assert.assertNotNull(strList56);
        org.junit.Assert.assertNotNull(strList57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
    }

    @Test
    public void test16909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16909");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "RGLaSa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test16910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16910");
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
        java.util.Locale.LanguageRange[] languageRangeArray17 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList18 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList18, languageRangeArray17);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap20 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList21 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList18, strMap20);
        int int22 = languageRangeList18.size();
        java.util.Locale.LanguageRange languageRange24 = new java.util.Locale.LanguageRange("English");
        java.util.Locale.LanguageRange languageRange26 = new java.util.Locale.LanguageRange("English");
        java.util.Locale.LanguageRange languageRange28 = new java.util.Locale.LanguageRange("a");
        java.util.Locale.LanguageRange[] languageRangeArray29 = new java.util.Locale.LanguageRange[] { languageRange24, languageRange26, languageRange28 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList30 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList30, languageRangeArray29);
        boolean boolean32 = languageRangeList18.retainAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList30);
        java.util.Locale locale35 = new java.util.Locale("");
        java.lang.String str36 = locale35.getDisplayLanguage();
        java.util.Locale locale37 = java.util.Locale.CANADA;
        java.lang.String str38 = locale37.getDisplayLanguage();
        java.lang.String str39 = locale35.getDisplayScript(locale37);
        java.lang.String str40 = org.apache.commons.lang3.StringUtils.lowerCase("a", locale35);
        java.lang.String str41 = locale35.getDisplayScript();
        java.util.Set<java.lang.String> strSet42 = locale35.getUnicodeLocaleAttributes();
        java.util.Locale.FilteringMode filteringMode43 = null;
        java.util.List<java.lang.String> strList44 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList30, (java.util.Collection<java.lang.String>) strSet42, filteringMode43);
        java.lang.String str46 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList30, "\u6cd5\u6587");
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor47 = languageRangeList30.listIterator();
        java.util.Locale.LanguageRange languageRange48 = languageRangeItor47.next();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange49 = languageRangeList11.set(92, languageRange48);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 92, Size: 0");
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
        org.junit.Assert.assertNotNull(languageRangeArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(languageRangeList21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(languageRangeArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals(locale35.toString(), "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "English" + "'", str38, "English");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "a" + "'", str40, "a");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(strSet42);
        org.junit.Assert.assertNotNull(strList44);
        org.junit.Assert.assertNotNull(languageRangeItor47);
        org.junit.Assert.assertNotNull(languageRange48);
    }

    @Test
    public void test16911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16911");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "cinese (Cina)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test16912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16912");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "Italien", (java.lang.CharSequence) "                                             italiahI                                             ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test16913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16913");
        char[] charArray6 = new char[] {};
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "zh-CN", charArray6);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "a", charArray6);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hEnglish", charArray6);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "tRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRIAD.AE.AF", charArray6);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny("ItaliItaliItaliItaliIta#...", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test16914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16914");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "                                                                                            ##_#a");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test16915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16915");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("\u5fb7\u6587\u5fb7\u56fd\u5fb7\u6587", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u5fb7\u6587\u5fb7\u56fd\u5fb7\u6587" + "'", str2, "\u5fb7\u6587\u5fb7\u56fd\u5fb7\u6587");
    }

    @Test
    public void test16916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16916");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "Korean (South Korea)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test16917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16917");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale3 = new java.util.Locale("");
        java.lang.String str4 = locale3.getDisplayLanguage();
        java.util.Locale locale5 = java.util.Locale.CANADA;
        java.lang.String str6 = locale5.getDisplayLanguage();
        java.lang.String str7 = locale3.getDisplayScript(locale5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.lowerCase("a", locale3);
        java.lang.String str9 = locale3.getDisplayScript();
        java.util.Locale.setDefault(category0, locale3);
        java.util.Locale locale11 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale12 = java.util.Locale.getDefault();
        java.lang.String str13 = locale11.getDisplayCountry(locale12);
        java.lang.String str14 = locale12.getDisplayVariant();
        java.util.Locale.setDefault(category0, locale12);
        java.util.Locale.Builder builder16 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder17 = builder16.clearExtensions();
        java.util.Locale.Builder builder19 = builder17.setLanguageTag("zh-CN");
        java.util.Locale.Builder builder21 = builder19.setLanguage("it");
        java.util.Locale locale22 = builder21.build();
        java.util.Locale locale23 = builder21.build();
        java.util.Locale.setDefault(category0, locale23);
        java.util.Locale locale27 = new java.util.Locale("                                                                            tsiAWIAt( ESENAWIAt( ESENAWIAt( ESENAWIAt( ESENAWIAt( ESENAWIAt( ESENAWIAt( ESENAWIAt( ESEhsilIilgneLAWIAt( ESENAWIAt( ESENAWIAt( ESENAWIAt( ESENAWIAt( ESENAWIAt( ESENAWIAt( ESENAWIAt( ESEhsilIilgneyarrAWIAt( ESENAWIAt( ESENAWIAt( ESENAWIAt( ESENAWIAt( ESENAWIAt( ESENAWIAt( ESENAWIAt( ESEhsilIilgneAAWIAt( ESENAWIAt( ESENAWIAt( ESENAWIAt( ESENAWIAt( ESENAWIAt( ESENAWIAt( ESENAWIAt( ESEhsilIilgnecncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncn", "         HI!HI!HI!HI!HI!HI          ");
        java.util.Locale locale31 = new java.util.Locale("ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hEnglish", "IA", "zh_CN");
        java.util.Locale locale34 = new java.util.Locale("zho", "US");
        java.util.Locale locale35 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str36 = locale34.getDisplayVariant(locale35);
        java.lang.String str37 = locale31.getDisplayName(locale35);
        java.lang.String str38 = locale35.toLanguageTag();
        java.lang.String str39 = locale35.getDisplayLanguage();
        java.lang.String str40 = locale27.getDisplayScript(locale35);
        java.util.Locale.setDefault(category0, locale27);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "English" + "'", str6, "English");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "a" + "'", str8, "a");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "zh-cnenglish_LOCALE.LANGUAGERANGE");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "China" + "'", str13, "China");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "it_CN");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "it_CN");
        org.junit.Assert.assertEquals(locale27.toString(), "                                                                            tsiawiat( esenawiat( esenawiat( esenawiat( esenawiat( esenawiat( esenawiat( esenawiat( esehsiliilgnelawiat( esenawiat( esenawiat( esenawiat( esenawiat( esenawiat( esenawiat( esenawiat( esehsiliilgneyarrawiat( esenawiat( esenawiat( esenawiat( esenawiat( esenawiat( esenawiat( esenawiat( esehsiliilgneaawiat( esenawiat( esenawiat( esenawiat( esenawiat( esenawiat( esenawiat( esenawiat( esehsiliilgnecncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncn_         HI!HI!HI!HI!HI!HI          ");
        org.junit.Assert.assertEquals(locale31.toString(), "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!henglish_IA_zh_CN");
        org.junit.Assert.assertEquals(locale34.toString(), "zho_US");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!henglish (IA,zh,CN)" + "'", str37, "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!henglish (IA,zh,CN)");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "fr-CA" + "'", str38, "fr-CA");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "French" + "'", str39, "French");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
    }

    @Test
    public void test16918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16918");
        java.util.Locale locale2 = new java.util.Locale("");
        java.lang.String str3 = locale2.getDisplayLanguage();
        java.util.Locale locale4 = java.util.Locale.CANADA;
        java.lang.String str5 = locale4.getDisplayLanguage();
        java.lang.String str6 = locale2.getDisplayScript(locale4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.lowerCase("a", locale2);
        java.lang.String str8 = locale2.getDisplayScript();
        java.lang.String str9 = locale2.getDisplayLanguage();
        java.util.Locale.setDefault(locale2);
        java.lang.String str11 = locale2.getDisplayVariant();
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "English" + "'", str5, "English");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "a" + "'", str7, "a");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test16919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16919");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("raaaaaaaaaaaaaaaaaaaingleseaaaaaaaaaaaaaaaaaaaaglAs", "                                ese(Taiwan");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "raaaaaaaaaaaaaaaaaaaingleseaaaaaaaaaaaaaaaaaaaaglAs" + "'", str2, "raaaaaaaaaaaaaaaaaaaingleseaaaaaaaaaaaaaaaaaaaaglAs");
    }

    @Test
    public void test16920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16920");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("chinois(chine)", 12);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "inois(chine)" + "'", str2, "inois(chine)");
    }

    @Test
    public void test16921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16921");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("chinois (chine)                                                                                                      ", "C...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "chinois (chine)                                                                                                      " + "'", str2, "chinois (chine)                                                                                                      ");
    }

    @Test
    public void test16922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16922");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("ja", 92, "...inglese (Canada)xxxxxxxx");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...inglese (Canada)xxxxxxxx...inglese (Canadaja...inglese (Canada)xxxxxxxx...inglese (Canada" + "'", str3, "...inglese (Canada)xxxxxxxx...inglese (Canadaja...inglese (Canada)xxxxxxxx...inglese (Canada");
    }

    @Test
    public void test16923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16923");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxaniC", "Acol");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxaniC" + "'", str2, "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxaniC");
    }

    @Test
    public void test16924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16924");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) " zH  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test16925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16925");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("\u65e5\u6587", "ggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "unduhar[]undu", 36);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u65e5\u6587" + "'", str4, "\u65e5\u6587");
    }

    @Test
    public void test16926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16926");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("CHN", strMap1);
        languageRangeList2.clear();
        boolean boolean4 = languageRangeList2.isEmpty();
        boolean boolean5 = languageRangeList2.isEmpty();
        java.util.Locale.LanguageRange[] languageRangeArray6 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList7 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList7, languageRangeArray6);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap9 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList10 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList7, strMap9);
        int int11 = languageRangeList7.size();
        java.lang.Class[] classArray13 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray14 = (java.lang.Class<?>[]) classArray13;
        java.lang.Class<?>[] wildcardClassArray15 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray13);
        boolean boolean16 = languageRangeList7.equals((java.lang.Object) wildcardClassArray15);
        int int18 = languageRangeList7.indexOf((java.lang.Object) (short) 100);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList20 = java.util.Locale.LanguageRange.parse("hi");
        int int22 = languageRangeList20.indexOf((java.lang.Object) '4');
        java.util.Locale.LanguageRange[] languageRangeArray23 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList24 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList24, languageRangeArray23);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap26 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList27 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList24, strMap26);
        int int28 = languageRangeList24.size();
        java.util.List<java.util.Locale.LanguageRange> languageRangeList30 = java.util.Locale.LanguageRange.parse("hi");
        boolean boolean32 = languageRangeList30.remove((java.lang.Object) "English");
        boolean boolean33 = languageRangeList24.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList30);
        java.util.Locale.LanguageRange[] languageRangeArray34 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList35 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList35, languageRangeArray34);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap37 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList38 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList35, strMap37);
        java.lang.String[] strArray46 = new java.lang.String[] { "English", "hi", "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "", "a", "", "China" };
        java.util.ArrayList<java.lang.String> strList47 = new java.util.ArrayList<java.lang.String>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList47, strArray46);
        java.util.List<java.lang.Class<?>> wildcardClassList49 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList47);
        java.lang.String str50 = java.util.Locale.lookupTag(languageRangeList38, (java.util.Collection<java.lang.String>) strList47);
        java.util.List<java.lang.Class<?>> wildcardClassList51 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList47);
        java.util.List<java.lang.String> strList52 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList24, (java.util.Collection<java.lang.String>) strList47);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap54 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList55 = java.util.Locale.LanguageRange.parse("Cina", strMap54);
        java.lang.String[] strArray59 = new java.lang.String[] { "aiaiaiaiaiaiaiaiaia", "zh-CN", "China" };
        java.util.ArrayList<java.lang.String> strList60 = new java.util.ArrayList<java.lang.String>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList60, strArray59);
        java.util.Locale.FilteringMode filteringMode62 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList63 = java.util.Locale.filterTags(languageRangeList55, (java.util.Collection<java.lang.String>) strList60, filteringMode62);
        java.util.List<java.lang.String> strList64 = java.util.Locale.filterTags(languageRangeList20, (java.util.Collection<java.lang.String>) strList47, filteringMode62);
        java.util.List<java.lang.Class<?>> wildcardClassList65 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses(strList64);
        java.util.List<java.lang.String> strList66 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList7, (java.util.Collection<java.lang.String>) strList64);
        boolean boolean67 = languageRangeList2.containsAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList7);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap69 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList70 = java.util.Locale.LanguageRange.parse("it", strMap69);
        java.lang.String str72 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList70, "cinese (Taiwan)");
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor73 = languageRangeList70.listIterator();
        boolean boolean74 = languageRangeList2.containsAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList70);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream75 = languageRangeList70.parallelStream();
        java.lang.Object[] objArray76 = languageRangeList70.toArray();
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor77 = languageRangeList70.listIterator();
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(languageRangeArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(languageRangeList10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(classArray13);
        org.junit.Assert.assertNotNull(wildcardClassArray14);
        org.junit.Assert.assertNotNull(wildcardClassArray15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(languageRangeList20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(languageRangeArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(languageRangeList27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(languageRangeList30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(languageRangeArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(languageRangeList38);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(wildcardClassList49);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNotNull(wildcardClassList51);
        org.junit.Assert.assertNotNull(strList52);
        org.junit.Assert.assertNotNull(languageRangeList55);
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + filteringMode62 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode62.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList63);
        org.junit.Assert.assertNotNull(strList64);
        org.junit.Assert.assertNotNull(wildcardClassList65);
        org.junit.Assert.assertNotNull(strList66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(languageRangeList70);
        org.junit.Assert.assertNotNull(languageRangeItor73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(languageRangeStream75);
        org.junit.Assert.assertNotNull(objArray76);
        org.junit.Assert.assertNotNull(languageRangeItor77);
    }

    @Test
    public void test16927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16927");
        char[] charArray8 = new char[] {};
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "zh-CN", charArray8);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "ad.ae.af.ag.ai.al.am.an.ao.aq.ar.as.at.au.aw.ax.az.ba.bb.bd.be.bf.bg.bh.bi.bj.bl.bm.bn.bo.bq.br.bs.bt.bv.bw.by.bz.ca.cc.cd.cf.cg.ch.ci.ck.cl.cm.cn.co.cr.cu.cv.cw.cx.cy.cz.de.dj.dk.dm.do.dz.ec.ee.eg.eh.er.es.et.fi.fj.fk.fm.fo.fr.ga.gb.gd.ge.gf.gg.gh.gi.gl.gm.gn.gp.gq.gr.gs.gt.gu.gw.gy.hk.hm.hn.hr.ht.hu.id.ie.il.im.in.io.iq.ir.is.it.je.jm.jo.jp.ke.kg.kh.ki.km.kn.kp.kr.kw.ky.kz.la.lb.lc.li.lk.lr.ls.lt.lu.lv.ly.ma.mc.md.me.mf.mg.mh.mk.ml.mm.mn.mo.mp.mq.mr.ms.mt.mu.mv.mw.mx.my.mz.na.nc.ne.nf.ng.ni.nl.no.np.nr.nu.nz.om.pa.pe.pf.pg.ph.pk.pl.pm.pn.pr.ps.pt.pw.py.qa.re.ro.rs.ru.rw.sa.sb.sc.sd.se.sg.sh.si.sj.sk.sl.sm.sn.so.sr.ss.st.sv.sx.sy.sz.tc.td.tf.tg.th.tj.tk.tl.tm.tn.to.tr.tt.tv.tw.tz.ua.ug.um.us.uy.uz.va.vc.ve.vg.vi.vn.vu.wf.ws.ye.yt.za.zm.zw", charArray8);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny("fr-FR", charArray8);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny("Chinesisch (China)", charArray8);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "\u4e2d\u56fd", charArray8);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "REFERENCEPIPELINE.HEAD", charArray8);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny("\u4e2d\u56fd\u8a9e (ZH)", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test16928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16928");
        java.util.Locale locale3 = new java.util.Locale("Collections.EmptySetCollections.EmptySetCollections.EmptySetCollections.EmptySetCollections.EmptySetCollections.EmptySetCollections.EmptySetCollections.EmptySetCollections.EmptySetCollections.EmptySetCollections.EmptySetCollections.EmptySetCollections.EmptySetCollections.EmptySetCollections.EmptySetCollections.EmptySet", "HI!HI!", "A][gnirts");
        java.util.Locale locale4 = java.util.Locale.CANADA;
        java.util.Set<java.lang.String> strSet5 = locale4.getUnicodeLocaleAttributes();
        java.lang.String str7 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) locale4, "zh-CNenglis");
        java.lang.String str8 = locale4.getLanguage();
        java.util.Locale locale11 = new java.util.Locale("it", "cinese");
        java.lang.String str12 = locale11.getDisplayCountry();
        java.lang.String str13 = locale4.getDisplayScript(locale11);
        java.lang.String str14 = locale3.getDisplayLanguage(locale4);
        org.junit.Assert.assertEquals(locale3.toString(), "collections.emptysetcollections.emptysetcollections.emptysetcollections.emptysetcollections.emptysetcollections.emptysetcollections.emptysetcollections.emptysetcollections.emptysetcollections.emptysetcollections.emptysetcollections.emptysetcollections.emptysetcollections.emptysetcollections.emptysetcollections.emptyset_HI!HI!_A][gnirts");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_CA");
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "java.util" + "'", str7, "java.util");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "en" + "'", str8, "en");
        org.junit.Assert.assertEquals(locale11.toString(), "it_CINESE");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "CINESE" + "'", str12, "CINESE");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "collections.emptysetcollections.emptysetcollections.emptysetcollections.emptysetcollections.emptysetcollections.emptysetcollections.emptysetcollections.emptysetcollections.emptysetcollections.emptysetcollections.emptysetcollections.emptysetcollections.emptysetcollections.emptysetcollections.emptysetcollections.emptyset" + "'", str14, "collections.emptysetcollections.emptysetcollections.emptysetcollections.emptysetcollections.emptysetcollections.emptysetcollections.emptysetcollections.emptysetcollections.emptysetcollections.emptysetcollections.emptysetcollections.emptysetcollections.emptysetcollections.emptysetcollections.emptysetcollections.emptyset");
    }

    @Test
    public void test16929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16929");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.setLanguageTag("zh-CN");
        java.util.Locale.Builder builder5 = builder3.setLanguage("it");
        java.util.Locale.Builder builder7 = builder5.removeUnicodeLocaleAttribute("fra");
        java.util.Locale locale8 = builder7.build();
        java.util.Locale locale9 = locale8.stripExtensions();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "it_CN");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "it_CN");
    }

    @Test
    public void test16930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16930");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("                             HI!HI!HI!HI!HI!                    nglish  Hindi (HI!,cHINA                    nglish  Hind");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                             HI!HI!HI!HI!HI!                    nglish  Hindi (HI!,cHINA                    nglish  Hind" + "'", str1, "                             HI!HI!HI!HI!HI!                    nglish  Hindi (HI!,cHINA                    nglish  Hind");
    }

    @Test
    public void test16931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16931");
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
        boolean boolean43 = languageRangeList1.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList36);
        java.lang.String[] strArray51 = new java.lang.String[] { "English", "hi", "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "", "a", "", "China" };
        java.util.ArrayList<java.lang.String> strList52 = new java.util.ArrayList<java.lang.String>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList52, strArray51);
        java.util.List<java.lang.Class<?>> wildcardClassList54 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList52);
        java.util.List<java.lang.Class<?>> wildcardClassList55 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList52);
        java.util.List<java.lang.String> strList56 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList52);
        java.util.Locale.LanguageRange[] languageRangeArray57 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList58 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList58, languageRangeArray57);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap60 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList61 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList58, strMap60);
        int int62 = languageRangeList58.size();
        java.util.Locale locale64 = new java.util.Locale("");
        java.util.Set<java.lang.String> strSet65 = locale64.getUnicodeLocaleKeys();
        java.util.Locale.FilteringMode filteringMode66 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList67 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList58, (java.util.Collection<java.lang.String>) strSet65, filteringMode66);
        java.util.List<java.lang.Class<?>> wildcardClassList68 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses(strList67);
        java.lang.String str69 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList67);
        java.util.Spliterator<java.util.Locale.LanguageRange> languageRangeSpliterator70 = languageRangeList1.spliterator();
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(languageRangeItor5);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "English" + "'", str11, "English");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "en" + "'", str15, "en");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
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
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(wildcardClassList54);
        org.junit.Assert.assertNotNull(wildcardClassList55);
        org.junit.Assert.assertNotNull(strList56);
        org.junit.Assert.assertNotNull(languageRangeArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(languageRangeList61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertEquals(locale64.toString(), "");
        org.junit.Assert.assertNotNull(strSet65);
        org.junit.Assert.assertTrue("'" + filteringMode66 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode66.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList67);
        org.junit.Assert.assertNotNull(wildcardClassList68);
        org.junit.Assert.assertNull(str69);
        org.junit.Assert.assertNotNull(languageRangeSpliterator70);
    }

    @Test
    public void test16932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16932");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("isangl", "KOR");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "isangl" + "'", str2, "isangl");
    }

    @Test
    public void test16933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16933");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap3);
        int int5 = languageRangeList1.size();
        java.util.List<java.util.Locale.LanguageRange> languageRangeList7 = java.util.Locale.LanguageRange.parse("hi");
        boolean boolean9 = languageRangeList7.remove((java.lang.Object) "English");
        boolean boolean10 = languageRangeList1.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList7);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap12 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList13 = java.util.Locale.LanguageRange.parse("ANIHC      ", strMap12);
        java.util.Locale.LanguageRange[] languageRangeArray14 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList15 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList15, languageRangeArray14);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap17 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList18 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList15, strMap17);
        boolean boolean19 = languageRangeList18.isEmpty();
        boolean boolean20 = languageRangeList13.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList18);
        java.util.Locale.LanguageRange[] languageRangeArray21 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList22 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList22, languageRangeArray21);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap24 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList25 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList22, strMap24);
        int int26 = languageRangeList22.size();
        java.util.Locale locale28 = new java.util.Locale("");
        java.util.Set<java.lang.String> strSet29 = locale28.getUnicodeLocaleKeys();
        java.util.Locale.FilteringMode filteringMode30 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList31 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList22, (java.util.Collection<java.lang.String>) strSet29, filteringMode30);
        java.util.List<java.lang.Class<?>> wildcardClassList32 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses(strList31);
        java.lang.String str33 = java.util.Locale.lookupTag(languageRangeList13, (java.util.Collection<java.lang.String>) strList31);
        java.util.List<java.lang.Class<?>> wildcardClassList34 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses(strList31);
        java.lang.String str35 = java.util.Locale.lookupTag(languageRangeList7, (java.util.Collection<java.lang.String>) strList31);
        java.util.List<java.lang.Class<?>> wildcardClassList36 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses(strList31);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(languageRangeList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(languageRangeList13);
        org.junit.Assert.assertNotNull(languageRangeArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(languageRangeList18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(languageRangeArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(languageRangeList25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals(locale28.toString(), "");
        org.junit.Assert.assertNotNull(strSet29);
        org.junit.Assert.assertTrue("'" + filteringMode30 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode30.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList31);
        org.junit.Assert.assertNotNull(wildcardClassList32);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(wildcardClassList34);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(wildcardClassList36);
    }

    @Test
    public void test16934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16934");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("chinese (taiwan)", 27, 20);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test16935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16935");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.setLanguageTag("zh-CN");
        java.util.Locale.Builder builder5 = builder3.setLanguage("it");
        java.util.Locale.Builder builder7 = builder3.setLanguageTag("hI");
        java.util.Locale.Builder builder8 = builder7.clear();
        java.util.Locale.Builder builder9 = builder8.clearExtensions();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test16936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16936");
        java.util.Locale locale3 = new java.util.Locale("cINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINA", "\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fduuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = locale3.getExtension('4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fdUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU_uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test16937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16937");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "####################CHNAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...Anzh_TWAnzh_TWAnz####################", "GGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test16938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16938");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.setLanguageTag("zh-CN");
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.lang.String str6 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) builder3, "CHNaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder3.setLanguage("rance)###########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: rance)########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################### [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Locale.Builder" + "'", str6, "Locale.Builder");
    }

    @Test
    public void test16939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16939");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = org.apache.commons.lang3.ClassUtils.getClass("                                               javacinese.cineselang                                                ");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: javacinese.cineselang");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16940");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "En", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test16941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16941");
        java.util.Locale locale1 = new java.util.Locale("SHORT");
        org.junit.Assert.assertEquals(locale1.toString(), "short");
    }

    @Test
    public void test16942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16942");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("Cina", strMap1);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList2, strMap3);
        java.util.Locale.LanguageRange[] languageRangeArray5 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList6 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList6, languageRangeArray5);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap8 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList9 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList6, strMap8);
        int int10 = languageRangeList6.size();
        boolean boolean11 = languageRangeList2.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList6);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream12 = languageRangeList2.stream();
        java.util.Locale.LanguageRange languageRange14 = new java.util.Locale.LanguageRange("zho");
        double double15 = languageRange14.getWeight();
        boolean boolean16 = languageRangeList2.add(languageRange14);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap18 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList19 = java.util.Locale.LanguageRange.parse("it", strMap18);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList19, '#');
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap22 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList23 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList19, strMap22);
        int int24 = languageRangeList2.indexOf((java.lang.Object) languageRangeList23);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap26 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList27 = java.util.Locale.LanguageRange.parse("it", strMap26);
        languageRangeList27.clear();
        java.util.Locale.LanguageRange[] languageRangeArray29 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList30 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList30, languageRangeArray29);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap32 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList33 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList30, strMap32);
        java.lang.String[] strArray41 = new java.lang.String[] { "English", "hi", "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "", "a", "", "China" };
        java.util.ArrayList<java.lang.String> strList42 = new java.util.ArrayList<java.lang.String>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList42, strArray41);
        java.util.List<java.lang.Class<?>> wildcardClassList44 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList42);
        java.lang.String str45 = java.util.Locale.lookupTag(languageRangeList33, (java.util.Collection<java.lang.String>) strList42);
        java.util.Locale.LanguageRange[] languageRangeArray46 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList47 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList47, languageRangeArray46);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap49 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList50 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList47, strMap49);
        java.util.Locale.LanguageRange[] languageRangeArray51 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList52 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList52, languageRangeArray51);
        boolean boolean54 = languageRangeList47.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList52);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream55 = languageRangeList52.stream();
        boolean boolean56 = languageRangeList33.containsAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList52);
        java.util.Locale.LanguageRange languageRange58 = new java.util.Locale.LanguageRange("English");
        java.lang.String str59 = languageRange58.getRange();
        boolean boolean60 = languageRangeList33.add(languageRange58);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor62 = languageRangeList33.listIterator(0);
        boolean boolean63 = languageRangeList27.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList33);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap64 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList65 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList33, strMap64);
        boolean boolean66 = languageRangeList23.retainAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList33);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList68 = java.util.Locale.LanguageRange.parse("zh-CN");
        java.lang.String[] strArray72 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("zh-CNnglese", "inglese", 3);
        int int73 = languageRangeList68.lastIndexOf((java.lang.Object) "zh-CNnglese");
        java.lang.String str75 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList68, 'u');
        java.util.List<java.util.Locale.LanguageRange> languageRangeList77 = java.util.Locale.LanguageRange.parse("zh-cnenglh");
        boolean boolean78 = languageRangeList68.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList77);
        boolean boolean79 = languageRangeList23.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList68);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList82 = languageRangeList68.subList(43, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(languageRangeArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(languageRangeList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(languageRangeStream12);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(languageRangeList19);
        org.junit.Assert.assertNotNull(languageRangeList23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(languageRangeList27);
        org.junit.Assert.assertNotNull(languageRangeArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(languageRangeList33);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(wildcardClassList44);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNotNull(languageRangeArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(languageRangeList50);
        org.junit.Assert.assertNotNull(languageRangeArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(languageRangeStream55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "english" + "'", str59, "english");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(languageRangeItor62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(languageRangeList65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(languageRangeList68);
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertNotNull(languageRangeList77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
    }

    @Test
    public void test16943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16943");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("CINAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "engliIlish", 51);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny("zh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CTWzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test16944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16944");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("\u4e2d\u6587\u53f0\u6e7e\u5730\u533a)", 44, 22);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u4e2d\u6587\u53f0\u6e7e\u5730\u533a)" + "'", str3, "\u4e2d\u6587\u53f0\u6e7e\u5730\u533a)");
    }

    @Test
    public void test16945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16945");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "$$$$");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test16946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16946");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("D U ", (double) 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=8.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16947");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("          ", '#');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test16948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16948");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H", "chine");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H" + "'", str2, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H");
    }

    @Test
    public void test16949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16949");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii", ' ');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test16950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16950");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaITHI!LIHI!NO", "GERMAN");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test16951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16951");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxzh-cnenglh");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test16952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16952");
        java.util.Locale locale1 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale2 = java.util.Locale.getDefault();
        java.lang.String str3 = locale1.getDisplayCountry(locale2);
        java.lang.String str4 = locale1.toLanguageTag();
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.upperCase("AI", locale1);
        java.lang.String str7 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) "AI", "en-c...");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale2);
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Chine" + "'", str3, "Chine");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zh-CN" + "'", str4, "zh-CN");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "AI" + "'", str5, "AI");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "String" + "'", str7, "String");
    }

    @Test
    public void test16953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16953");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("it", strMap1);
        java.util.Locale locale3 = java.util.Locale.getDefault();
        int int4 = languageRangeList2.lastIndexOf((java.lang.Object) locale3);
        java.lang.String str5 = locale3.getScript();
        java.util.Set<java.lang.Character> charSet6 = locale3.getExtensionKeys();
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(locale3);
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "fr_CA");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(charSet6);
    }

    @Test
    public void test16954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16954");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("        dddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd        ", "\u82f1\u6587\u7f8e\u570b)", 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test16955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16955");
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
        java.util.Locale locale48 = java.util.Locale.getDefault(category0);
        java.util.Locale locale50 = java.util.Locale.ITALIAN;
        java.util.Locale locale52 = new java.util.Locale("");
        java.lang.String str53 = locale52.getDisplayLanguage();
        java.util.Locale locale54 = java.util.Locale.CANADA;
        java.lang.String str55 = locale54.getDisplayLanguage();
        java.lang.String str56 = locale52.getDisplayScript(locale54);
        java.util.Locale locale58 = java.util.Locale.FRANCE;
        java.lang.String str59 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale58);
        java.lang.String str60 = locale52.getDisplayCountry(locale58);
        java.lang.String str61 = locale50.getDisplayScript(locale52);
        java.lang.String str62 = org.apache.commons.lang3.StringUtils.upperCase("China", locale50);
        java.util.Set<java.lang.Character> charSet63 = locale50.getExtensionKeys();
        boolean boolean64 = locale50.hasExtensions();
        java.lang.String str65 = locale50.getCountry();
        java.util.Locale.setDefault(category0, locale50);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
// flaky:         org.junit.Assert.assertEquals(locale1.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_TW");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chinois" + "'", str3, "chinois");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u4e2d\u6587" + "'", str9, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(locale10);
// flaky:         org.junit.Assert.assertEquals(locale10.toString(), "fr_CA");
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
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "it");
        org.junit.Assert.assertEquals(locale52.toString(), "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "English" + "'", str55, "English");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "english" + "'", str59, "english");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "CHINA" + "'", str62, "CHINA");
        org.junit.Assert.assertNotNull(charSet63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
    }

    @Test
    public void test16956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16956");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("ChinChinChinNHCChinChinChin");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=chinchinchinnhcchinchinchin");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16957");
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
        languageRangeList23.clear();
        java.lang.String[] strArray85 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("en_CA", "");
        boolean boolean86 = languageRangeList23.equals((java.lang.Object) "en_CA");
        languageRangeList23.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange89 = languageRangeList23.remove(22);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 22, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
// flaky:         org.junit.Assert.assertEquals(locale38.toString(), "fr_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Chine" + "'", str39, "Chine");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "zh-CN" + "'", str40, "zh-CN");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale42);
// flaky:         org.junit.Assert.assertEquals(locale42.toString(), "fr_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Chine" + "'", str43, "Chine");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale45);
// flaky:         org.junit.Assert.assertEquals(locale45.toString(), "fr_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Chine" + "'", str46, "Chine");
        org.junit.Assert.assertEquals(locale50.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale52);
// flaky:         org.junit.Assert.assertEquals(locale52.toString(), "fr_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Chine" + "'", str53, "Chine");
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
        org.junit.Assert.assertNotNull(strArray85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
    }

    @Test
    public void test16958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16958");
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
        java.lang.String str20 = locale15.getCountry();
        java.util.Locale.setDefault(locale15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = locale15.getUnicodeLocaleType("                                           cinaci                                            ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key:                                            cinaci                                            ");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "inglese" + "'", str11, "inglese");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale15);
// flaky:         org.junit.Assert.assertEquals(locale15.toString(), "fr_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Chine" + "'", str16, "Chine");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(builder19);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "CA" + "'", str20, "CA");
    }

    @Test
    public void test16959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16959");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("...       ", 9, 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test16960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16960");
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
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream11 = languageRangeList6.parallelStream();
        java.lang.Object[] objArray12 = languageRangeList6.toArray();
        java.lang.Object[] objArray13 = languageRangeList6.toArray();
        java.lang.Class<?> wildcardClass14 = languageRangeList6.getClass();
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(languageRangeArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(languageRangeStream11);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test16961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16961");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("cines", "REFERENCEPIPELINE.HEAD                        ", "italiahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIital..");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "cines" + "'", str3, "cines");
    }

    @Test
    public void test16962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16962");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "\u4e2d\u56fdAD");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u4e2d\u56fdAD" + "'", str1, "\u4e2d\u56fdAD");
    }

    @Test
    public void test16963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16963");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("HINDI(hi!,China)", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test16964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16964");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("H", "und-Italiano", 39);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test16965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16965");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.setLanguageTag("zh-CN");
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.lang.String str6 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) builder3, "CHNaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        java.util.Locale.Builder builder8 = builder3.setLanguageTag("CN");
        java.util.Locale.Builder builder10 = builder8.addUnicodeLocaleAttribute("CHN");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder8.removeUnicodeLocaleAttribute("itaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaita");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: itaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaita [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Locale.Builder" + "'", str6, "Locale.Builder");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test16966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16966");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                               javacinese.cineselang                                                ", "ENENENENENENENENENEN");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test16967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16967");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("Chin", "english");
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny("                                                                                                    ", strArray4);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "zh_CN");
        int int8 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("ca", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test16968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16968");
        java.util.Locale locale1 = java.util.Locale.UK;
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("cncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncArrayList", locale1);
        java.lang.String str3 = locale1.getISO3Language();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCARRAYLIST" + "'", str2, "CNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCARRAYLIST");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "eng" + "'", str3, "eng");
    }

    @Test
    public void test16969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16969");
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
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor33 = languageRangeList4.listIterator(0);
        boolean boolean34 = languageRangeItor33.hasNext();
        boolean boolean35 = languageRangeItor33.hasNext();
        java.lang.String str37 = org.apache.commons.lang3.StringUtils.join((java.util.Iterator<java.util.Locale.LanguageRange>) languageRangeItor33, 'x');
        boolean boolean38 = languageRangeItor33.hasNext();
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
        org.junit.Assert.assertNotNull(languageRangeItor33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test16970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16970");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "\u4e2d\u6587 (ZH)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test16971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16971");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("en-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-caen-ca", "                                             ", 22);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test16972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16972");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "aaaaaaaaa$", (java.lang.CharSequence) "                           AHI!HI!                                                                 ");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "aaaaaaaaa$" + "'", charSequence2, "aaaaaaaaa$");
    }

    @Test
    public void test16973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16973");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.setLanguageTag("zh-CN");
        java.util.Locale.Builder builder5 = builder3.setLanguage("CHINA");
        java.util.Locale.Builder builder7 = builder5.setLanguageTag("english");
        java.util.Locale.Builder builder8 = builder7.clear();
        java.util.Locale locale9 = builder7.build();
        java.util.Locale locale11 = new java.util.Locale("ccccccccccccccc");
        java.util.Locale locale12 = locale11.stripExtensions();
        java.lang.String str13 = locale9.getDisplayVariant(locale12);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertEquals(locale11.toString(), "ccccccccccccccc");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "ccccccccccccccc");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test16974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16974");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("HI!STRING[]STRING[]S", "arraylist##########");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test16975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16975");
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
        java.util.Locale.LanguageRange languageRange71 = new java.util.Locale.LanguageRange("zho");
        double double72 = languageRange71.getWeight();
        boolean boolean73 = languageRangeList1.add(languageRange71);
        java.util.Iterator<java.util.Locale.LanguageRange> languageRangeItor74 = languageRangeList1.iterator();
        boolean boolean75 = languageRangeItor74.hasNext();
        java.lang.String str77 = org.apache.commons.lang3.StringUtils.join(languageRangeItor74, 'a');
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
// flaky:         org.junit.Assert.assertEquals(locale21.toString(), "fr_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Chine" + "'", str22, "Chine");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "zh-CN" + "'", str23, "zh-CN");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale25);
// flaky:         org.junit.Assert.assertEquals(locale25.toString(), "fr_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Chine" + "'", str26, "Chine");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale28);
// flaky:         org.junit.Assert.assertEquals(locale28.toString(), "fr_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Chine" + "'", str29, "Chine");
        org.junit.Assert.assertEquals(locale33.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale35);
// flaky:         org.junit.Assert.assertEquals(locale35.toString(), "fr_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Chine" + "'", str36, "Chine");
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
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 1.0d + "'", double72 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(languageRangeItor74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
    }

    @Test
    public void test16976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16976");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("italiahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIital...");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "chi...", 350, 280);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test16977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16977");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("zhcineses", "a#");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "zhcineses" + "'", str2, "zhcineses");
    }

    @Test
    public void test16978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16978");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "fr-FRSTI-F", (java.lang.CharSequence) ".............................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................ions.EmptySet");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test16979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16979");
        java.util.Locale locale1 = new java.util.Locale("hindi");
        org.junit.Assert.assertEquals(locale1.toString(), "hindi");
    }

    @Test
    public void test16980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16980");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.setLanguageTag("zh-CN");
        java.util.Locale.Builder builder5 = builder3.setLanguage("CHINA");
        java.util.Locale.Builder builder7 = builder5.setLanguageTag("english");
        java.util.Locale locale8 = builder7.build();
        java.util.Locale.Builder builder9 = builder7.clearExtensions();
        java.util.Locale.Builder builder10 = builder9.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder9.setRegion("nglishaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: nglishaaaaaaaaaaaa [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "english");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test16981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16981");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("hi");
        int int3 = languageRangeList1.indexOf((java.lang.Object) '4');
        boolean boolean5 = languageRangeList1.contains((java.lang.Object) 8);
        java.lang.Object[] objArray6 = languageRangeList1.toArray();
        java.util.Collection<java.lang.String> strCollection7 = null;
        java.util.Locale.LanguageRange[] languageRangeArray8 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList9 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList9, languageRangeArray8);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap11 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList12 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList9, strMap11);
        int int13 = languageRangeList9.size();
        java.util.Locale locale15 = new java.util.Locale("");
        java.util.Set<java.lang.String> strSet16 = locale15.getUnicodeLocaleKeys();
        java.util.Locale.FilteringMode filteringMode17 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList18 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList9, (java.util.Collection<java.lang.String>) strSet16, filteringMode17);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList19 = java.util.Locale.filterTags(languageRangeList1, strCollection7, filteringMode17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(languageRangeArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(languageRangeList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals(locale15.toString(), "");
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertTrue("'" + filteringMode17 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode17.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList18);
    }

    @Test
    public void test16982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16982");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("....english (ZHCINESESE,.)", "ANIHC   ENGLTWNSTWNaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test16983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16983");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                                                                                    ", "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test16984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16984");
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
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor33 = languageRangeList4.listIterator(0);
        java.util.Locale.LanguageRange[] languageRangeArray34 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList35 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList35, languageRangeArray34);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap37 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList38 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList35, strMap37);
        java.util.Locale.LanguageRange[] languageRangeArray39 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList40 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList40, languageRangeArray39);
        boolean boolean42 = languageRangeList35.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList40);
        java.util.Locale.LanguageRange[] languageRangeArray43 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList44 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList44, languageRangeArray43);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap46 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList47 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList44, strMap46);
        java.util.Locale.LanguageRange[] languageRangeArray48 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList49 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList49, languageRangeArray48);
        boolean boolean51 = languageRangeList44.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList49);
        java.lang.String str53 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList49, "hi!");
        boolean boolean54 = languageRangeList35.containsAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList49);
        java.util.Locale locale55 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale56 = java.util.Locale.getDefault();
        java.lang.String str57 = locale55.getDisplayCountry(locale56);
        java.lang.String str58 = locale56.getDisplayVariant();
        boolean boolean59 = languageRangeList35.contains((java.lang.Object) str58);
        boolean boolean60 = languageRangeList4.containsAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList35);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList63 = languageRangeList4.subList(0, 1);
        java.lang.String str65 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList63, "cina_NCNCNCNCNCNCGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLICNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCARRAYLIST");
        java.util.Locale.LanguageRange languageRange68 = new java.util.Locale.LanguageRange("en");
        java.lang.String str69 = languageRange68.getRange();
        // The following exception was thrown during execution in test generation
        try {
            languageRangeList63.add(13, languageRange68);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 13, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(languageRangeItor33);
        org.junit.Assert.assertNotNull(languageRangeArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(languageRangeList38);
        org.junit.Assert.assertNotNull(languageRangeArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(languageRangeArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(languageRangeList47);
        org.junit.Assert.assertNotNull(languageRangeArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale56);
// flaky:         org.junit.Assert.assertEquals(locale56.toString(), "fr_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str57 + "' != '" + "Chine" + "'", str57, "Chine");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(languageRangeList63);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "en" + "'", str69, "en");
    }

    @Test
    public void test16985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16985");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageName("HINDI(hi!,China)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test16986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16986");
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
        java.lang.Class<?>[] wildcardClassArray15 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray14);
        java.lang.Class<?>[] wildcardClassArray16 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray14);
        java.lang.Class<?>[] wildcardClassArray17 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray14);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray17, '.');
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertNotNull(classArray6);
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray12);
        org.junit.Assert.assertNotNull(wildcardClassArray13);
        org.junit.Assert.assertNotNull(wildcardClassArray14);
        org.junit.Assert.assertNotNull(wildcardClassArray15);
        org.junit.Assert.assertNotNull(wildcardClassArray16);
        org.junit.Assert.assertNotNull(wildcardClassArray17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test16987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16987");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = org.apache.commons.lang3.ClassUtils.getClass("German");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: German");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16988");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("          cnn           ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "          cnn           " + "'", str1, "          cnn           ");
    }

    @Test
    public void test16989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16989");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName("chnaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test16990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16990");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "ENGHi     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test16991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16991");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "          xxxxxxxL          xxxxxxxL          xxxxxxxL          xxxxxxxL          xxxxxxxL          xxxxxxxL          xxxxxxxL          xxxxxxxL          xxxxxxxL          xxxxxxxL          xxxxxxxL          xxxxxxxL          xxxxxxxL          xxxxxxxL          xxxxxxxL          xxxxxxxL          xxxxxxxL          xxxxxxxL          xxxxxxxL          xxxxxxxL          xxxxxxxL          xxxxxxxL          xxxxxxxL          xxxxxxxL          xxxxxxxL          xxxxxxxL          xxxxxxxL          xxxxxxxL          xxxxxxxL          xxxxxxxL          xxxxxxxL          xxxxxxxL          xxxxxxxL          xxxxxxxL          xxxxxxxL          xxxxxxxL          xxxxxxxL          xxxxxxxL          xxxxxxxL          xxxxxxxL          xxxxxxxL          xxxxxxxL          xxxxxxxL          xxxxxxxL          xxxxxxxL          xxxxxxxL          xxxxxxxL          xxxxxxx", (java.lang.CharSequence) "BooleanIABooleanIABooleanIABooleanIABooleanIABooleanIABooleanIABooleanIABooleanIABooleanIABooleanIABooleanIABooleanIABooleanIABooleanIABooleanIABooleanIABooleanIABooleanIABooleanIABooleanIABooleanIABooleanIABooleanIABooleanIABooleanIABooleanIABooleanIABooleanIABooleanIABooleanIABooleanIABooleanIABooleanIABooleanIABooleanIABooleanIABooleanIABooleanIABooleanIABooleanIABooleanIABooleanIABooleanIABooleanIABooleanIABooleanIABooleanIABooleanIABooleanIABooleanIABoolean");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test16992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16992");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("Hindi (HI!,cHINA)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "Anzh_TWAnzh_TWAnzh_TWAnzh_TWAnen-ca");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test16993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16993");
        char[] charArray10 = new char[] { '#', '#', ' ' };
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny("China", charArray10);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "ANIHC      ", charArray10);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "chinois (chine)", charArray10);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "...................................................................................", charArray10);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) ".                                                                                                   ", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "## ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "## ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[#, #,  ]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test16994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16994");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("                                                                                        jAPA", "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test16995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16995");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "sti-f");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "sti-f" + "'", str1, "sti-f");
    }

    @Test
    public void test16996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16996");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("$");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "$" + "'", str1, "$");
    }

    @Test
    public void test16997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16997");
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
        java.util.Locale locale15 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale.Category category16 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale17 = java.util.Locale.getDefault(category16);
        java.util.Locale locale18 = java.util.Locale.getDefault(category16);
        java.util.Locale locale19 = java.util.Locale.FRENCH;
        java.util.Locale locale20 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str21 = locale20.getDisplayLanguage();
        java.util.Locale locale22 = java.util.Locale.getDefault();
        java.lang.String str23 = locale20.getDisplayCountry(locale22);
        java.util.Locale locale24 = java.util.Locale.TAIWAN;
        java.lang.String str25 = locale24.getVariant();
        java.lang.String str26 = locale20.getDisplayName(locale24);
        java.lang.String str27 = locale19.getDisplayScript(locale20);
        java.util.Locale.setDefault(category16, locale20);
        java.util.Locale locale31 = java.util.Locale.forLanguageTag("twn");
        java.lang.String str32 = org.apache.commons.lang3.StringUtils.upperCase("ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", locale31);
        java.lang.String str33 = locale31.getVariant();
        java.util.Locale.setDefault(category16, locale31);
        java.lang.String str36 = locale31.getExtension('a');
        java.lang.String str37 = locale15.getDisplayVariant(locale31);
        java.util.Locale locale38 = java.util.Locale.ITALIAN;
        java.util.Locale locale40 = new java.util.Locale("");
        java.lang.String str41 = locale40.getDisplayLanguage();
        java.util.Locale locale42 = java.util.Locale.CANADA;
        java.lang.String str43 = locale42.getDisplayLanguage();
        java.lang.String str44 = locale40.getDisplayScript(locale42);
        java.util.Locale locale46 = java.util.Locale.FRANCE;
        java.lang.String str47 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale46);
        java.lang.String str48 = locale40.getDisplayCountry(locale46);
        java.lang.String str49 = locale38.getDisplayScript(locale40);
        java.util.Locale locale50 = java.util.Locale.GERMAN;
        java.lang.String str51 = locale40.getDisplayLanguage(locale50);
        java.util.Locale locale54 = new java.util.Locale("");
        java.lang.String str55 = locale54.getDisplayLanguage();
        java.util.Locale locale56 = java.util.Locale.CANADA;
        java.lang.String str57 = locale56.getDisplayLanguage();
        java.lang.String str58 = locale54.getDisplayScript(locale56);
        java.lang.String str59 = org.apache.commons.lang3.StringUtils.lowerCase("a", locale54);
        java.lang.String str60 = locale54.getDisplayScript();
        java.lang.String str61 = locale50.getDisplayLanguage(locale54);
        java.lang.String str62 = locale31.getDisplayLanguage(locale50);
        java.util.Locale.Builder builder63 = builder12.setLocale(locale31);
        java.lang.String str64 = locale31.getLanguage();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_TW");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chinois" + "'", str7, "chinois");
        org.junit.Assert.assertNotNull(locale8);
// flaky:         org.junit.Assert.assertEquals(locale8.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Taiwan" + "'", str9, "Taiwan");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Locale.Builder" + "'", str14, "Locale.Builder");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "zh_TW");
        org.junit.Assert.assertTrue("'" + category16 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category16.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale17);
// flaky:         org.junit.Assert.assertEquals(locale17.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(locale18);
// flaky:         org.junit.Assert.assertEquals(locale18.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "fr");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "zh_TW");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "chinois" + "'", str21, "chinois");
        org.junit.Assert.assertNotNull(locale22);
// flaky:         org.junit.Assert.assertEquals(locale22.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Taiwan" + "'", str23, "Taiwan");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\u4e2d\u6587\u53f0\u7063)" + "'", str26, "\u4e2d\u6587\u53f0\u7063)");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "twn");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "AHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H" + "'", str32, "AHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "it");
        org.junit.Assert.assertEquals(locale40.toString(), "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "English" + "'", str43, "English");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "english" + "'", str47, "english");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "de");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals(locale54.toString(), "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertNotNull(locale56);
        org.junit.Assert.assertEquals(locale56.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "English" + "'", str57, "English");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "a" + "'", str59, "a");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "German" + "'", str61, "German");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "twn" + "'", str62, "twn");
        org.junit.Assert.assertNotNull(builder63);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "twn" + "'", str64, "twn");
    }

    @Test
    public void test16998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16998");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("Cina", strMap1);
        java.util.Locale.LanguageRange languageRange4 = new java.util.Locale.LanguageRange("English");
        java.lang.String str6 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) languageRange4, "");
        java.lang.String str7 = languageRange4.getRange();
        boolean boolean8 = languageRangeList2.add(languageRange4);
        java.util.Locale.LanguageRange languageRange10 = new java.util.Locale.LanguageRange("English");
        java.lang.String str11 = languageRange10.getRange();
        java.lang.String str12 = languageRange10.getRange();
        boolean boolean13 = languageRangeList2.add(languageRange10);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList2, '.');
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Locale.LanguageRange" + "'", str6, "Locale.LanguageRange");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "english" + "'", str7, "english");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "english" + "'", str11, "english");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "english" + "'", str12, "english");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test16999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16999");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("         ZH_TW          ", "", 746);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 24 + "'", int3 == 24);
    }

    @Test
    public void test17000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test17000");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale3 = new java.util.Locale("");
        java.lang.String str4 = locale3.getDisplayLanguage();
        java.util.Locale locale5 = java.util.Locale.CANADA;
        java.lang.String str6 = locale5.getDisplayLanguage();
        java.lang.String str7 = locale3.getDisplayScript(locale5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.lowerCase("a", locale3);
        java.lang.String str9 = locale3.getDisplayScript();
        java.util.Locale.setDefault(category0, locale3);
        java.util.Locale locale11 = java.util.Locale.getDefault(category0);
        java.util.Locale locale12 = java.util.Locale.getDefault(category0);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "English" + "'", str6, "English");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "a" + "'", str8, "a");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
    }
}
