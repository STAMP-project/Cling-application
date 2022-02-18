import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest39 {

    public static boolean debug = false;

    @Test
    public void test19501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19501");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("LISTFRAHAR", 32, 528);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test19502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19502");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("cese (fa)");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test19503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19503");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("                                                           d                                                            ", "xxxxxxxxxxxxxxxxxxxxxxxxxChinese", "chinarglasachinarglasachinarglasachinarglasachinarglasachinarglasachinarglasachinarglasachinarglasachin");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test19504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19504");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("it", strMap1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList2, "cinese (Taiwan)");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap6 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList7 = java.util.Locale.LanguageRange.parse("Cina", strMap6);
        java.util.Locale.LanguageRange languageRange9 = new java.util.Locale.LanguageRange("English");
        java.lang.String str11 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) languageRange9, "");
        java.lang.String str12 = languageRange9.getRange();
        boolean boolean13 = languageRangeList7.add(languageRange9);
        boolean boolean14 = languageRangeList2.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList7);
        java.lang.Object[] objArray15 = languageRangeList2.toArray();
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeList7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Locale.LanguageRange" + "'", str11, "Locale.LanguageRange");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "english" + "'", str12, "english");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(objArray15);
    }

    @Test
    public void test19505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19505");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "AD.AE.AFindi(HI!,cHINA)            ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test19506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19506");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("hi");
        java.lang.Object[] objArray2 = languageRangeList1.toArray();
        java.util.Spliterator<java.util.Locale.LanguageRange> languageRangeSpliterator3 = languageRangeList1.spliterator();
        java.util.Locale.Builder builder4 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        java.util.Locale.Builder builder7 = builder5.setLanguageTag("zh-CN");
        java.util.Locale locale8 = builder5.build();
        boolean boolean9 = languageRangeList1.remove((java.lang.Object) locale8);
        int int10 = languageRangeList1.size();
        java.util.function.UnaryOperator<java.util.Locale.LanguageRange> languageRangeUnaryOperator11 = null;
        // The following exception was thrown during execution in test generation
        try {
            languageRangeList1.replaceAll(languageRangeUnaryOperator11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test19507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19507");
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
        java.util.Locale locale19 = java.util.Locale.getDefault(category0);
        java.util.Locale.Builder builder20 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder21 = builder20.clearExtensions();
        java.util.Locale.Builder builder23 = builder21.setLanguageTag("zh-CN");
        java.util.Locale.Builder builder25 = builder23.setLanguage("it");
        java.util.Locale locale26 = builder25.build();
        java.lang.String str27 = locale26.getScript();
        java.util.Locale.setDefault(category0, locale26);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
// flaky:         org.junit.Assert.assertEquals(locale1.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(locale2);
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
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
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "");
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "it_CN");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test19508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19508");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("i!", (int) (byte) 10, 31);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test19509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19509");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("          xxxxxx", "........locale.builde");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "          xxxxxx" + "'", str2, "          xxxxxx");
    }

    @Test
    public void test19510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19510");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageName("\u4e2d\u6587\u53f0\u6e7e\u5730\u533aengliilish)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test19511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19511");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("$ (JAVA.LANG)", 94, 116);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test19512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19512");
        char[] charArray9 = new char[] {};
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "zh-CN", charArray9);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "a", charArray9);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "  China   ", charArray9);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "C", charArray9);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "ENGLTWNSTWN", charArray9);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "Locale", charArray9);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "le.Builder[]aLoc", charArray9);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587          ", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test19513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19513");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("\u4e2d\u6587", "                       ANIHCxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u4e2d\u6587" + "'", str2, "\u4e2d\u6587");
    }

    @Test
    public void test19514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19514");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("cinaxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx (GGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLI,us)", "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$", 43);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test19515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19515");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "anglais(Canada");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "anglais(Canada" + "'", str1, "anglais(Canada");
    }

    @Test
    public void test19516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19516");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("Cina", "  cn    United Kingdom  cn    United Kingdom  cn    United Kingdom  cn    United Kingdom  cn    United Kingdom  cn    United Kingdom  cn    United Kingdom  cn    United Kingdom  cn    United Kingdom  cn    United Kingdom  cn    United Kingdom  cn    United Kingdom  cn    United Kingdom  cn    United Kingdom  cn    United Kingdom  cn    United Kingdom  cn    United Kingdom  cn    United Kingdom  cn    United Kingdom  cn    United Kingdom  cn    United Kingdom  cn    United Kingdom  cn    United Kingdom  cn    United Kingdom  cn    United Kingdom  cn    United Kingdom  cn    United Kingdom  cn    United Kingdom  cn    United Kingdom  cn    United Kingdom  cn    United Kingdom  cn    United Kingdom  cn    United Kingdom  cn    United Kingdom  cn    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Cina" + "'", str2, "Cina");
    }

    @Test
    public void test19517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19517");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts_JA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test19518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19518");
        java.util.Locale locale0 = java.util.Locale.US;
        java.lang.String str1 = locale0.getDisplayName();
        java.lang.String str2 = locale0.getLanguage();
        java.util.Locale.LanguageRange[] languageRangeArray3 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList4 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList4, languageRangeArray3);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap6 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList7 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, strMap6);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor8 = languageRangeList7.listIterator();
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        java.util.Locale.LanguageRange[] languageRangeArray13 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList14 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList14, languageRangeArray13);
        java.util.Locale locale17 = java.util.Locale.FRANCE;
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale17);
        java.util.Locale locale19 = java.util.Locale.US;
        java.util.Locale locale20 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale21 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale22 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale23 = java.util.Locale.getDefault();
        java.lang.String str24 = locale22.getDisplayCountry(locale23);
        java.lang.String str25 = locale22.toLanguageTag();
        java.util.Locale locale26 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale27 = java.util.Locale.getDefault();
        java.lang.String str28 = locale26.getDisplayCountry(locale27);
        java.util.Locale locale29 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale30 = java.util.Locale.getDefault();
        java.lang.String str31 = locale29.getDisplayCountry(locale30);
        java.util.Locale locale35 = new java.util.Locale("hi", "hi!", "cHINA");
        java.util.Locale locale36 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale37 = java.util.Locale.getDefault();
        java.lang.String str38 = locale36.getDisplayCountry(locale37);
        java.util.Locale locale40 = new java.util.Locale("");
        java.lang.String str41 = locale40.getDisplayVariant();
        java.util.Locale locale42 = java.util.Locale.KOREAN;
        java.util.Locale locale44 = new java.util.Locale("");
        java.util.Locale locale45 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale[] localeArray46 = new java.util.Locale[] { locale17, locale19, locale20, locale21, locale22, locale27, locale29, locale35, locale37, locale40, locale42, locale44, locale45 };
        java.util.ArrayList<java.util.Locale> localeList47 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList47, localeArray46);
        java.util.List<java.util.Locale> localeList49 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList14, (java.util.Collection<java.util.Locale>) localeList47);
        java.lang.String[] strArray57 = new java.lang.String[] { "English", "hi", "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "", "a", "", "China" };
        java.util.ArrayList<java.lang.String> strList58 = new java.util.ArrayList<java.lang.String>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList58, strArray57);
        java.util.List<java.lang.Class<?>> wildcardClassList60 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList58);
        java.util.Locale.FilteringMode filteringMode61 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList62 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList14, (java.util.Collection<java.lang.String>) strList58, filteringMode61);
        java.util.List<java.lang.String> strList63 = java.util.Locale.filterTags(languageRangeList7, (java.util.Collection<java.lang.String>) strList11, filteringMode61);
        int int65 = languageRangeList7.indexOf((java.lang.Object) 1.0f);
        boolean boolean66 = languageRangeList7.isEmpty();
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap68 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList69 = java.util.Locale.LanguageRange.parse("it", strMap68);
        java.lang.String str71 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList69, "cinese (Taiwan)");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap73 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList74 = java.util.Locale.LanguageRange.parse("Cina", strMap73);
        java.util.Locale.LanguageRange languageRange76 = new java.util.Locale.LanguageRange("English");
        java.lang.String str78 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) languageRange76, "");
        java.lang.String str79 = languageRange76.getRange();
        boolean boolean80 = languageRangeList74.add(languageRange76);
        boolean boolean81 = languageRangeList69.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList74);
        boolean boolean82 = languageRangeList7.equals((java.lang.Object) boolean81);
        java.util.Locale.LanguageRange[] languageRangeArray83 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList84 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList84, languageRangeArray83);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap86 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList87 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList84, strMap86);
        int int88 = languageRangeList84.size();
        java.util.Locale locale89 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str90 = locale89.getISO3Language();
        java.lang.String str92 = locale89.getUnicodeLocaleType("AI");
        java.util.Set<java.lang.String> strSet93 = locale89.getUnicodeLocaleAttributes();
        boolean boolean94 = languageRangeList84.contains((java.lang.Object) locale89);
        java.lang.String str95 = locale89.getISO3Country();
        boolean boolean96 = languageRangeList7.contains((java.lang.Object) locale89);
        java.lang.String str97 = locale0.getDisplayCountry(locale89);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "inglese (Stati Uniti)" + "'", str1, "inglese (Stati Uniti)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "en" + "'", str2, "en");
        org.junit.Assert.assertNotNull(languageRangeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(languageRangeList7);
        org.junit.Assert.assertNotNull(languageRangeItor8);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(languageRangeArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "english" + "'", str18, "english");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale23);
// flaky:         org.junit.Assert.assertEquals(locale23.toString(), "fr_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Chine" + "'", str24, "Chine");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "zh-CN" + "'", str25, "zh-CN");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale27);
// flaky:         org.junit.Assert.assertEquals(locale27.toString(), "fr_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Chine" + "'", str28, "Chine");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale30);
// flaky:         org.junit.Assert.assertEquals(locale30.toString(), "fr_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Chine" + "'", str31, "Chine");
        org.junit.Assert.assertEquals(locale35.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale37);
// flaky:         org.junit.Assert.assertEquals(locale37.toString(), "fr_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Chine" + "'", str38, "Chine");
        org.junit.Assert.assertEquals(locale40.toString(), "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "ko");
        org.junit.Assert.assertEquals(locale44.toString(), "");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(localeList49);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(wildcardClassList60);
        org.junit.Assert.assertTrue("'" + filteringMode61 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode61.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList62);
        org.junit.Assert.assertNotNull(strList63);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(languageRangeList69);
        org.junit.Assert.assertNotNull(languageRangeList74);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "Locale.LanguageRange" + "'", str78, "Locale.LanguageRange");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "english" + "'", str79, "english");
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(languageRangeArray83);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(languageRangeList87);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 0 + "'", int88 == 0);
        org.junit.Assert.assertNotNull(locale89);
        org.junit.Assert.assertEquals(locale89.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "fra" + "'", str90, "fra");
        org.junit.Assert.assertNull(str92);
        org.junit.Assert.assertNotNull(strSet93);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "CAN" + "'", str95, "CAN");
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertEquals("'" + str97 + "' != '" + "Etats-Unis" + "'", str97, "Etats-Unis");
    }

    @Test
    public void test19519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19519");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("collections.emptysetcollections.emptysetcollections.emptysetcollections.emptysetcollections.emptysetcollections.emptysetcollections.emptysetcollections.emptysetcollections.emptysetcollections.emptysetcollections.emptysetcollections.emptysetcollections.emptysetcollections.emptysetcollections.emptysetcollections.emptyset", "\u4e2d\u6587\u4e2d\u570b)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "...ccccc", 209);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "collections.emptysetcollections.emptysetcollections.emptysetcollections.emptysetcollections.emptysetcollections.emptysetcollections.emptysetcollections.emptysetcollections.emptysetcollections.emptysetcollections.emptysetcollections.emptysetcollections.emptysetcollections.emptysetcollections.emptysetcollections.emptyset" + "'", str4, "collections.emptysetcollections.emptysetcollections.emptysetcollections.emptysetcollections.emptysetcollections.emptysetcollections.emptysetcollections.emptysetcollections.emptysetcollections.emptysetcollections.emptysetcollections.emptysetcollections.emptysetcollections.emptysetcollections.emptysetcollections.emptyset");
    }

    @Test
    public void test19520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19520");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("444444ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h" + "'", str1, "444444ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
    }

    @Test
    public void test19521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19521");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("anih", "\u4e2d\u6587string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string", (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test19522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19522");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "iHAILATI..aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test19523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19523");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("hi");
        boolean boolean3 = languageRangeList1.remove((java.lang.Object) "English");
        java.util.Locale.LanguageRange languageRange5 = languageRangeList1.get(0);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor6 = languageRangeList1.listIterator();
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList1, "                                                      JAVA.LANG                                                      ");
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("en-C..");
        boolean boolean11 = languageRangeList1.equals((java.lang.Object) strArray10);
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(languageRange5);
        org.junit.Assert.assertNotNull(languageRangeItor6);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test19524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19524");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("##############acoL###############", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##############acoL###############" + "'", str2, "##############acoL###############");
    }

    @Test
    public void test19525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19525");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "rrayList");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test19526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19526");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf(" a", 39, 17);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test19527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19527");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder21 = builder5.setRegion("\u53f0\u7063                             ");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: ??                              [at index 0]");
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
// flaky:         org.junit.Assert.assertEquals(locale15.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Cina" + "'", str16, "Cina");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(builder19);
    }

    @Test
    public void test19528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19528");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("German", (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test19529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19529");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale locale4 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str5 = locale4.getISO3Language();
        java.util.Locale.Builder builder6 = builder3.setLocale(locale4);
        java.util.Locale.Builder builder7 = builder3.clear();
        java.util.Locale locale8 = builder3.build();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "zho" + "'", str5, "zho");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
    }

    @Test
    public void test19530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19530");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("Itali", 3);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Itali" + "'", str2, "Itali");
    }

    @Test
    public void test19531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19531");
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
            java.util.Locale.Builder builder22 = builder8.setUnicodeLocaleKeyword("CINACI", "");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: CINACI [at index 0]");
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
    public void test19532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19532");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("44444444444444444444444444444444444444java.uil", "CI_A", 23);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test19533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19533");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("AFZH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AFZH" + "'", str1, "AFZH");
    }

    @Test
    public void test19534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19534");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("fr-CA", strMap1);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream3 = languageRangeList2.parallelStream();
        java.util.function.UnaryOperator<java.util.Locale.LanguageRange> languageRangeUnaryOperator4 = null;
        // The following exception was thrown during execution in test generation
        try {
            languageRangeList2.replaceAll(languageRangeUnaryOperator4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeStream3);
    }

    @Test
    public void test19535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19535");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("ese(Taiwan.........................................................................................", "\u5927\u62ff\u52a0\u6587\u82f1");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ese(Taiwan........................................................................................." + "'", str2, "ese(Taiwan.........................................................................................");
    }

    @Test
    public void test19536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19536");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                 A                 ", 'u');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '4');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                 A                 " + "'", str4, "                 A                 ");
    }

    @Test
    public void test19537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19537");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "ACI", "   esesenichz");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test19538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19538");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!henglish (IA,zh,CN)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!henglish (ia,zh,cn)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test19539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19539");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("locale.languagerange", 11);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "locale.languagerange" + "'", str2, "locale.languagerange");
    }

    @Test
    public void test19540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19540");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("HArrayListfraHArrayListfraHArrayListfraHArrayListfraHArrayListfraHArrayListfraHArrayListfraHArrayListfraHArrayListfraHArrayList");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "haRRAYlISTFRAhaRRAYlISTFRAhaRRAYlISTFRAhaRRAYlISTFRAhaRRAYlISTFRAhaRRAYlISTFRAhaRRAYlISTFRAhaRRAYlISTFRAhaRRAYlISTFRAhaRRAYlIST" + "'", str1, "haRRAYlISTFRAhaRRAYlISTFRAhaRRAYlISTFRAhaRRAYlISTFRAhaRRAYlISTFRAhaRRAYlISTFRAhaRRAYlISTFRAhaRRAYlISTFRAhaRRAYlISTFRAhaRRAYlIST");
    }

    @Test
    public void test19541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19541");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("LANGUAGERANGEAD.AE.AF.AGchnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.AT.AU.AW.AX.AZ.BA.BB.BD.BE.BF.BG.BH.BI.BJ.BL.BM.BN.BO.BQ.BR.BS.BT.BV.BW.BY.BZ.CA.CC.CD.CF.CG.CH.CI.CK.CL.CM.CN.CO.CR.CU.CV.CW.CX.CY.CZ.DE.DJ.DK.DM.DO.DZ.EC.EE.EG.EH.ER.ES.ET.FI.FJ.FK.FM.FO.FR.GA.GB.GD.GE.GF.GG.GH.GI.GL.GM.GN.GP.GQ.GR.GS.GT.GU.GW.GY.HK.HM.HN.HR.HT.HU.ID.IE.IL.IM.IN.IO.IQ.IR.IS.IT.JE.JM.JO.JP.KE.KG.KH.KI.KM.KN.KP.KR.KW.KY.KZ.LA.LB.LC.LI.LK.LR.LS.LT.LU.LV.LY.MA.MC.MD.ME.MF.MG.MH.MK.ML.MM.MN.MO.MP.MQ.MR.MS.MT.MU.MV.MW.MX.MY.MZ.NA.NC.NE.NF.NG.NI.NL.NO.NP.NR.NU.NZ.OM.PA.PE.PF.PG.PH.PK.PL.PM.PN.PR.PS.PT.PW.PY.QA.RE.RO.RS.RU.RW.SA.SB.SC.SD.SE.SG.SH.SI.SJ.SK.SL.SM.SN.SO.SR.SS.ST.SV.SX.SY.SZ.TC.TD.TF.TG.TH.TJ.TK.TL.TM.TN.TO.TR.TT.TV.TW.TZ.UA.UG.UM.US.UY.UZ.VA.VC.VE.VG.VI.VN.VU.WF.WS.YE.YT.ZA.ZM.ZW", 248, 45);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test19542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19542");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("EN-ca");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EN-ca" + "'", str1, "EN-ca");
    }

    @Test
    public void test19543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19543");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("ITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIEN", "444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIEN" + "'", str2, "ITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIEN");
    }

    @Test
    public void test19544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19544");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("chinois");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "chinois" + "'", str1, "chinois");
    }

    @Test
    public void test19545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19545");
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
        java.util.List<java.lang.Class<?>> wildcardClassList91 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses(strList86);
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
        org.junit.Assert.assertNotNull(wildcardClassList91);
    }

    @Test
    public void test19546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19546");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("hindi (HI!,cHINA)", "xxxhi!xxxxxxxhi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "xxxhi!xxxxxxxhi" + "'", str2, "xxxhi!xxxxxxxhi");
    }

    @Test
    public void test19547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19547");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("                                                                                                                                                                                                                                                          EN-CASTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRIN", "Chinese(China)Chinese(China)Chinese(China)Chinese(China)Chinese(China)Chinese(China)Chinese(China)Chinese(China)Chinese(China)Chinese(China)Chinese(China)Chinese(China)Chinese(China)Chinese(China)Chinese(China)Chinese(China)Chinese(China)Chinese(China)Chinese(China)Chinese(China)Chinese(China)Chinese(China)Chinese(China)Chinese(China)Chinese(China)Chinese(China)Chinese(China)Chinese(China)Chinese(China)Chinese(China)Chinese(China)Chinese(China)Chinese(China)Chinese(China)Chinese(China)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test19548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19548");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("                                           CINACI                                            ", 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=                                           cinaci                                            ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test19549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19549");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("itfritl", "ANIHCxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxReferencePipeline.Head");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test19550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19550");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("cinaxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", 35, 563);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "x" + "'", str3, "x");
    }

    @Test
    public void test19551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19551");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("ChinChinChinNHCChinChinChin", 31, 43);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test19552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19552");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("ahi!hi! (                 A               ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ahi!hi! (                 A" + "'", str1, "ahi!hi! (                 A");
    }

    @Test
    public void test19553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19553");
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
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream32 = languageRangeList1.stream();
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
        org.junit.Assert.assertNotNull(languageRangeStream32);
    }

    @Test
    public void test19554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19554");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("Collecti");
        java.util.Set<java.lang.Character> charSet2 = locale1.getExtensionKeys();
        java.lang.Class[] classArray4 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray5 = (java.lang.Class<?>[]) classArray4;
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray4);
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray4);
        java.lang.Class<?>[] wildcardClassArray8 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray4);
        java.lang.Class<?>[] wildcardClassArray9 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray8);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray8, ' ');
        java.lang.Class<?>[] wildcardClassArray12 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray8);
        java.lang.Class<?>[] wildcardClassArray13 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray8);
        java.lang.Class<?>[] wildcardClassArray14 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray13);
        java.lang.Class[] classArray16 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray17 = (java.lang.Class<?>[]) classArray16;
        java.lang.Class<?>[] wildcardClassArray18 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray16);
        java.lang.Class<?> wildcardClass19 = null;
        java.lang.Class[] classArray21 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray22 = (java.lang.Class<?>[]) classArray21;
        wildcardClassArray22[0] = wildcardClass19;
        boolean boolean26 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray18, wildcardClassArray22, false);
        java.lang.Class<?>[] wildcardClassArray27 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray18);
        java.lang.Class<?>[] wildcardClassArray28 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray27);
        java.lang.Class<?>[] wildcardClassArray29 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray27);
        java.lang.String str31 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray27, '#');
        java.lang.Class<?>[] wildcardClassArray32 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray27);
        boolean boolean33 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray13, wildcardClassArray27);
        boolean boolean34 = locale1.equals((java.lang.Object) wildcardClassArray13);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "collecti");
        org.junit.Assert.assertNotNull(charSet2);
        org.junit.Assert.assertNotNull(classArray4);
        org.junit.Assert.assertNotNull(wildcardClassArray5);
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        org.junit.Assert.assertNotNull(wildcardClassArray8);
        org.junit.Assert.assertNotNull(wildcardClassArray9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClassArray12);
        org.junit.Assert.assertNotNull(wildcardClassArray13);
        org.junit.Assert.assertNotNull(wildcardClassArray14);
        org.junit.Assert.assertNotNull(classArray16);
        org.junit.Assert.assertNotNull(wildcardClassArray17);
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertNotNull(classArray21);
        org.junit.Assert.assertNotNull(wildcardClassArray22);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray27);
        org.junit.Assert.assertNotNull(wildcardClassArray28);
        org.junit.Assert.assertNotNull(wildcardClassArray29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(wildcardClassArray32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test19555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19555");
        java.util.Locale locale1 = new java.util.Locale("I");
        java.lang.String str2 = locale1.getDisplayCountry();
        java.lang.String str3 = locale1.toLanguageTag();
        java.util.Locale locale4 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str5 = locale4.getDisplayLanguage();
        java.lang.String str6 = locale1.getDisplayCountry(locale4);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList8 = java.util.Locale.LanguageRange.parse("hi");
        boolean boolean10 = languageRangeList8.remove((java.lang.Object) "English");
        boolean boolean12 = languageRangeList8.remove((java.lang.Object) 1);
        java.util.Locale.LanguageRange[] languageRangeArray13 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList14 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList14, languageRangeArray13);
        java.util.Locale locale17 = java.util.Locale.FRANCE;
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale17);
        java.util.Locale locale19 = java.util.Locale.US;
        java.util.Locale locale20 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale21 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale22 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale23 = java.util.Locale.getDefault();
        java.lang.String str24 = locale22.getDisplayCountry(locale23);
        java.lang.String str25 = locale22.toLanguageTag();
        java.util.Locale locale26 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale27 = java.util.Locale.getDefault();
        java.lang.String str28 = locale26.getDisplayCountry(locale27);
        java.util.Locale locale29 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale30 = java.util.Locale.getDefault();
        java.lang.String str31 = locale29.getDisplayCountry(locale30);
        java.util.Locale locale35 = new java.util.Locale("hi", "hi!", "cHINA");
        java.util.Locale locale36 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale37 = java.util.Locale.getDefault();
        java.lang.String str38 = locale36.getDisplayCountry(locale37);
        java.util.Locale locale40 = new java.util.Locale("");
        java.lang.String str41 = locale40.getDisplayVariant();
        java.util.Locale locale42 = java.util.Locale.KOREAN;
        java.util.Locale locale44 = new java.util.Locale("");
        java.util.Locale locale45 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale[] localeArray46 = new java.util.Locale[] { locale17, locale19, locale20, locale21, locale22, locale27, locale29, locale35, locale37, locale40, locale42, locale44, locale45 };
        java.util.ArrayList<java.util.Locale> localeList47 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList47, localeArray46);
        java.util.List<java.util.Locale> localeList49 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList14, (java.util.Collection<java.util.Locale>) localeList47);
        java.util.Locale locale50 = java.util.Locale.lookup(languageRangeList8, (java.util.Collection<java.util.Locale>) localeList47);
        java.lang.String[] strArray55 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("English", "hi", (int) (short) -1);
        java.lang.String[] strArray58 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("a", "");
        java.lang.String[] strArray59 = org.apache.commons.lang3.StringUtils.stripAll(strArray58);
        java.lang.String[] strArray60 = org.apache.commons.lang3.StringUtils.stripAll(strArray59);
        java.lang.String str61 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", strArray55, strArray59);
        int int62 = languageRangeList8.indexOf((java.lang.Object) strArray55);
        boolean boolean64 = languageRangeList8.equals((java.lang.Object) 100L);
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
        java.lang.String str77 = locale67.getDisplayCountry();
        java.lang.String str78 = locale67.getDisplayLanguage();
        java.util.Locale locale79 = java.util.Locale.PRC;
        java.lang.String str80 = locale67.getDisplayScript(locale79);
        boolean boolean81 = languageRangeList8.equals((java.lang.Object) locale79);
        java.util.Iterator<java.util.Locale.LanguageRange> languageRangeItor82 = languageRangeList8.iterator();
        java.util.Iterator<java.util.Locale.LanguageRange> languageRangeItor83 = languageRangeList8.iterator();
        java.util.Locale.LanguageRange languageRange84 = languageRangeItor83.next();
        double double85 = languageRange84.getWeight();
        boolean boolean86 = locale1.equals((java.lang.Object) double85);
        org.junit.Assert.assertEquals(locale1.toString(), "i");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "und" + "'", str3, "und");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u4e2d\u6587" + "'", str5, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(languageRangeList8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(languageRangeArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "english" + "'", str18, "english");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale23);
// flaky:         org.junit.Assert.assertEquals(locale23.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Cina" + "'", str24, "Cina");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "zh-CN" + "'", str25, "zh-CN");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale27);
// flaky:         org.junit.Assert.assertEquals(locale27.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Cina" + "'", str28, "Cina");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale30);
// flaky:         org.junit.Assert.assertEquals(locale30.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Cina" + "'", str31, "Cina");
        org.junit.Assert.assertEquals(locale35.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale37);
// flaky:         org.junit.Assert.assertEquals(locale37.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Cina" + "'", str38, "Cina");
        org.junit.Assert.assertEquals(locale40.toString(), "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "ko");
        org.junit.Assert.assertEquals(locale44.toString(), "");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(localeList49);
        org.junit.Assert.assertNull(locale50);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h" + "'", str61, "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
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
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertNotNull(locale79);
        org.junit.Assert.assertEquals(locale79.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(languageRangeItor82);
        org.junit.Assert.assertNotNull(languageRangeItor83);
        org.junit.Assert.assertNotNull(languageRange84);
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + 1.0d + "'", double85 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
    }

    @Test
    public void test19556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19556");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "gnalesenic.esenicavaj", "EN_CA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test19557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19557");
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
        java.util.Spliterator<java.util.Locale.LanguageRange> languageRangeSpliterator12 = languageRangeList6.spliterator();
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(languageRangeArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(languageRangeStream11);
        org.junit.Assert.assertNotNull(languageRangeSpliterator12);
    }

    @Test
    public void test19558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19558");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("ESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWAN", "INA$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$", 43);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test19559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19559");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("xxxxxxxxxxxxxxJapanesexxxxxxxxxxxxxxxxxxxxxxxxxxxxJapanesexxxxxxxxxxxxxxxxxxxxxxxxxxxxJelacoL", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "xxxxxxxxxxxxxxJapanesexxxxxxxxxxxxxxxxxxxxxxxxxxxxJapanesexxxxxxxxxxxxxxxxxxxxxxxxxxxxJelacoL" + "'", str2, "xxxxxxxxxxxxxxJapanesexxxxxxxxxxxxxxxxxxxxxxxxxxxxJapanesexxxxxxxxxxxxxxxxxxxxxxxxxxxxJelacoL");
    }

    @Test
    public void test19560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19560");
        java.util.Locale locale2 = new java.util.Locale("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "444444444][gnirts4444444444");
        java.lang.String str3 = locale2.getVariant();
        org.junit.Assert.assertEquals(locale2.toString(), "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu_444444444][GNIRTS4444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test19561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19561");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("hi");
        int int3 = languageRangeList1.indexOf((java.lang.Object) '4');
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
        java.util.List<java.util.Locale> localeList41 = java.util.Locale.filter(languageRangeList1, (java.util.Collection<java.util.Locale>) localeList40);
        java.util.Locale.Builder builder42 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder43 = builder42.clearExtensions();
        java.util.Locale.Builder builder45 = builder43.setLanguageTag("zh-CN");
        java.util.Locale.Builder builder47 = builder45.setLanguage("CHINA");
        java.util.Locale.Builder builder49 = builder47.setLanguageTag("english");
        java.util.Locale locale50 = builder49.build();
        boolean boolean51 = languageRangeList1.contains((java.lang.Object) locale50);
        java.lang.String str52 = locale50.getScript();
        java.util.Locale.setDefault(locale50);
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
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
// flaky:         org.junit.Assert.assertEquals(locale14.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Cina" + "'", str15, "Cina");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "zh-CN" + "'", str16, "zh-CN");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale18);
// flaky:         org.junit.Assert.assertEquals(locale18.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Cina" + "'", str19, "Cina");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale21);
// flaky:         org.junit.Assert.assertEquals(locale21.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Cina" + "'", str22, "Cina");
        org.junit.Assert.assertEquals(locale26.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale28);
// flaky:         org.junit.Assert.assertEquals(locale28.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Cina" + "'", str29, "Cina");
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
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "english");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
    }

    @Test
    public void test19562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19562");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$xxxxxxxxinglese (Canada)xxxxxxxx$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$", "china (China)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$xxxxxxxxinglese (Canada)xxxxxxxx$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$" + "'", str2, "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$xxxxxxxxinglese (Canada)xxxxxxxx$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
    }

    @Test
    public void test19563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19563");
        java.util.Locale locale3 = new java.util.Locale("                                redliuB.elacoL", "javacinese.cineselang                                                ", "..................chinois (Chine)");
        org.junit.Assert.assertEquals(locale3.toString(), "                                redliub.elacol_JAVACINESE.CINESELANG                                                _..................chinois (Chine)");
    }

    @Test
    public void test19564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19564");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale locale4 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str5 = locale4.getISO3Language();
        java.util.Locale.Builder builder6 = builder3.setLocale(locale4);
        java.util.Locale.Builder builder7 = builder3.clearExtensions();
        java.util.Locale locale8 = builder3.build();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = locale8.getExtension('4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: 4");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh_TW");
    }

    @Test
    public void test19565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19565");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale2 = java.util.Locale.FRANCE;
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale2);
        java.util.Locale.setDefault(locale2);
        java.util.Locale.Builder builder5 = builder0.setLocale(locale2);
        java.util.Locale.Builder builder6 = builder0.clearExtensions();
        java.util.Locale locale7 = builder6.build();
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "english" + "'", str3, "english");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr_FR");
    }

    @Test
    public void test19566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19566");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("EN-CASTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRIN", 561, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444EN-CASTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRIN" + "'", str3, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444EN-CASTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRIN");
    }

    @Test
    public void test19567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19567");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "$$$$$$$$$$$$$xxxxxxxxinglese (canada)xxxxxxxx$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test19568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19568");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortClassName("AAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAAAAAAAAA" + "'", str1, "AAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test19569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19569");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str1 = locale0.getDisplayLanguage();
        java.util.Locale locale2 = java.util.Locale.getDefault();
        java.lang.String str3 = locale0.getDisplayCountry(locale2);
        java.util.Locale locale4 = java.util.Locale.TAIWAN;
        java.lang.String str5 = locale4.getVariant();
        java.lang.String str6 = locale0.getDisplayName(locale4);
        java.lang.String str7 = locale4.getVariant();
        java.util.Locale.Builder builder8 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder9 = builder8.clearExtensions();
        java.util.Locale locale10 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale.Builder builder11 = builder9.setLocale(locale10);
        java.util.Locale.Builder builder13 = builder9.setRegion("zh");
        java.util.Locale locale14 = builder9.build();
        java.lang.String str15 = locale14.getScript();
        java.util.Locale.setDefault(locale14);
        java.lang.String str17 = locale14.toLanguageTag();
        java.lang.String str18 = locale4.getDisplayCountry(locale14);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "chinois" + "'", str1, "chinois");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Taiwan" + "'", str3, "Taiwan");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u4e2d\u6587\u53f0\u7063)" + "'", str6, "\u4e2d\u6587\u53f0\u7063)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_ZH");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "zh-ZH" + "'", str17, "zh-ZH");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\u53f0\u6e7e\u5730\u533a" + "'", str18, "\u53f0\u6e7e\u5730\u533a");
    }

    @Test
    public void test19570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19570");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap3);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor5 = languageRangeList4.listIterator();
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.util.Iterator<java.util.Locale.LanguageRange>) languageRangeItor5, ' ');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.util.Iterator<java.util.Locale.LanguageRange>) languageRangeItor5, 'a');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.util.Iterator<java.util.Locale.LanguageRange>) languageRangeItor5, 'u');
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange12 = languageRangeItor5.next();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(languageRangeItor5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test19571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19571");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "CHNaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test19572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19572");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu       HI!uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "                                              italiahi                                              t                                              italiahi                                              l                                              italiahi                                                                                            italiahi                                                                                            italiahi                                              ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu       HI!uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str2, "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu       HI!uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test19573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19573");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.setLanguageTag("zh-CN");
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.lang.String str6 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) builder3, "CHNaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        java.util.Locale.Builder builder8 = builder3.setLanguageTag("CN");
        java.util.Locale.Builder builder9 = builder3.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder9.setExtension('u', "englishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglish");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension value: englishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglish [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Locale.Builder" + "'", str6, "Locale.Builder");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test19574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19574");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor75 = languageRangeList67.listIterator(31);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 31");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertEquals(locale25.toString(), "zh_ZH");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\u4e2d\u56fd" + "'", str26, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "zh-CN" + "'", str27, "zh-CN");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "zh_ZH");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "\u4e2d\u56fd" + "'", str30, "\u4e2d\u56fd");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "zh_ZH");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "\u4e2d\u56fd" + "'", str33, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals(locale37.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "zh_ZH");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "\u4e2d\u56fd" + "'", str40, "\u4e2d\u56fd");
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
    }

    @Test
    public void test19575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19575");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("...   gnalesenic.esenicavaj                                                Ih                                     ...", "\u4e2d\u6587\u53f0\u7063)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test19576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19576");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("zh-cn", "Hi!hi! (", 990);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test19577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19577");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("HI", strMap1);
        java.lang.String str4 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) languageRangeList2, "\u53f0\u7063");
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream5 = languageRangeList2.stream();
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList2, "");
        java.util.Locale.LanguageRange languageRange9 = new java.util.Locale.LanguageRange("English");
        java.lang.String str11 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) languageRange9, "");
        double double12 = languageRange9.getWeight();
        boolean boolean13 = languageRangeList2.add(languageRange9);
        java.util.Locale.Builder builder14 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder16 = builder14.setScript("");
        java.util.Locale.Builder builder18 = builder16.setLanguage("HI");
        java.util.Locale locale19 = builder18.build();
        boolean boolean20 = languageRangeList2.equals((java.lang.Object) builder18);
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ArrayList" + "'", str4, "ArrayList");
        org.junit.Assert.assertNotNull(languageRangeStream5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Locale.LanguageRange" + "'", str11, "Locale.LanguageRange");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "hi");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test19578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19578");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("PANESEXXXXXXXXXXXXXXPANESEXXXXXXXXXXXXXXPANESEXXXXXXXXXXXXXXPANESEXXXXXXXXXXXXXXPANESEXXXXXXXXXXXXXXPANESEXXXXXXXXXXXXXXPANESEXXXXXXXXXXXXXXPANESEXXXXXXXXXXXXXXPANESEXXXXXXXXXXXXXXPANESEXXXXXXXXXXXXXXPANESEXXXXXXXXXXXXXXPANESEXXXXXXXXXXXXXXPANESEXXXXXXXXXXXXXXPANESEXXXXXXXXXXXXXXPANESEXXXXXXXXXXXXXXPANESEXXXXXXXXXXXXXXPANESEXXXXXXXXXXXXXXPANESEXXXXXXXXXXXXXXPANESEXXXXXXXXXXXXXXPANESEXXXXXXXXXXXXXXPANESEXXXXXXXXXXXXXXPANESEXXXXXXXXXXXXXXPANESEXXXXXXXXXXXXXXPANESEXXXXXXXXXXXXXXPANESEXXXXXXXXXXXXXXPANESEXXXXXXXXXXXXXXPANESEXXXXXXXXXXXXXXPANESEXXXXXXXXXXXXXXPANESEXXXXXXXXXXXXXXPANESEXXXXXXXXXXXXXXPANESEXXXXXXXXXXXXXXPANESEXXXXXXXXXXXXXXPANESEXXXXXXXXXXXXXXPANESEXXXXXXXXXXXXXXPANESEXXXXXXXXXXXXXXPANESEXXXXXXXXXXXXXXPANESEXXXXXXXXXXXXXXPANESEXXXXXXXXXXXXXXPANESEXXXXXXXXXXXXXXPANESEXXXXXXXXXXXXXXPANESEXXXXXXXXXXXXXXPANESEXXXXXXXXXXXXXXPANESEXXXXXXXXXXXXXXPANESEXXXXXXXXXXXXXXPANESEXXXXXXXXXXXXXXPANESEXXXXXXXXXXXXXXPANESEXXXXXXXXXXXXXXPANESEXXXXXXXXXXXXXX");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "panesexxxxxxxxxxxxxxpanesexxxxxxxxxxxxxxpanesexxxxxxxxxxxxxxpanesexxxxxxxxxxxxxxpanesexxxxxxxxxxxxxxpanesexxxxxxxxxxxxxxpanesexxxxxxxxxxxxxxpanesexxxxxxxxxxxxxxpanesexxxxxxxxxxxxxxpanesexxxxxxxxxxxxxxpanesexxxxxxxxxxxxxxpanesexxxxxxxxxxxxxxpanesexxxxxxxxxxxxxxpanesexxxxxxxxxxxxxxpanesexxxxxxxxxxxxxxpanesexxxxxxxxxxxxxxpanesexxxxxxxxxxxxxxpanesexxxxxxxxxxxxxxpanesexxxxxxxxxxxxxxpanesexxxxxxxxxxxxxxpanesexxxxxxxxxxxxxxpanesexxxxxxxxxxxxxxpanesexxxxxxxxxxxxxxpanesexxxxxxxxxxxxxxpanesexxxxxxxxxxxxxxpanesexxxxxxxxxxxxxxpanesexxxxxxxxxxxxxxpanesexxxxxxxxxxxxxxpanesexxxxxxxxxxxxxxpanesexxxxxxxxxxxxxxpanesexxxxxxxxxxxxxxpanesexxxxxxxxxxxxxxpanesexxxxxxxxxxxxxxpanesexxxxxxxxxxxxxxpanesexxxxxxxxxxxxxxpanesexxxxxxxxxxxxxxpanesexxxxxxxxxxxxxxpanesexxxxxxxxxxxxxxpanesexxxxxxxxxxxxxxpanesexxxxxxxxxxxxxxpanesexxxxxxxxxxxxxxpanesexxxxxxxxxxxxxxpanesexxxxxxxxxxxxxxpanesexxxxxxxxxxxxxxpanesexxxxxxxxxxxxxxpanesexxxxxxxxxxxxxxpanesexxxxxxxxxxxxxxpanesexxxxxxxxxxxxxx" + "'", str1, "panesexxxxxxxxxxxxxxpanesexxxxxxxxxxxxxxpanesexxxxxxxxxxxxxxpanesexxxxxxxxxxxxxxpanesexxxxxxxxxxxxxxpanesexxxxxxxxxxxxxxpanesexxxxxxxxxxxxxxpanesexxxxxxxxxxxxxxpanesexxxxxxxxxxxxxxpanesexxxxxxxxxxxxxxpanesexxxxxxxxxxxxxxpanesexxxxxxxxxxxxxxpanesexxxxxxxxxxxxxxpanesexxxxxxxxxxxxxxpanesexxxxxxxxxxxxxxpanesexxxxxxxxxxxxxxpanesexxxxxxxxxxxxxxpanesexxxxxxxxxxxxxxpanesexxxxxxxxxxxxxxpanesexxxxxxxxxxxxxxpanesexxxxxxxxxxxxxxpanesexxxxxxxxxxxxxxpanesexxxxxxxxxxxxxxpanesexxxxxxxxxxxxxxpanesexxxxxxxxxxxxxxpanesexxxxxxxxxxxxxxpanesexxxxxxxxxxxxxxpanesexxxxxxxxxxxxxxpanesexxxxxxxxxxxxxxpanesexxxxxxxxxxxxxxpanesexxxxxxxxxxxxxxpanesexxxxxxxxxxxxxxpanesexxxxxxxxxxxxxxpanesexxxxxxxxxxxxxxpanesexxxxxxxxxxxxxxpanesexxxxxxxxxxxxxxpanesexxxxxxxxxxxxxxpanesexxxxxxxxxxxxxxpanesexxxxxxxxxxxxxxpanesexxxxxxxxxxxxxxpanesexxxxxxxxxxxxxxpanesexxxxxxxxxxxxxxpanesexxxxxxxxxxxxxxpanesexxxxxxxxxxxxxxpanesexxxxxxxxxxxxxxpanesexxxxxxxxxxxxxxpanesexxxxxxxxxxxxxxpanesexxxxxxxxxxxxxx");
    }

    @Test
    public void test19579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19579");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("EN-ca");
        java.util.Set<java.lang.String> strSet2 = locale1.getUnicodeLocaleAttributes();
        java.lang.String str3 = locale1.getDisplayScript();
        java.util.Set<java.lang.String> strSet4 = locale1.getUnicodeLocaleKeys();
        java.lang.String str5 = locale1.getScript();
        java.lang.String str6 = locale1.toLanguageTag();
        java.lang.String str7 = locale1.getLanguage();
        java.lang.String str8 = locale1.getISO3Country();
        boolean boolean9 = locale1.hasExtensions();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_CA");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "en-CA" + "'", str6, "en-CA");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "en" + "'", str7, "en");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CAN" + "'", str8, "CAN");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test19580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19580");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "ITALIAHi", "\uc911\uad6d\uc5b4");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test19581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19581");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("44444444engltwnstwn44444444", "chinaundaaaaaaachinaundaaaaaaachinaundaaaaaaahi-chinaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachina");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test19582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19582");
        java.util.Locale locale3 = new java.util.Locale("rance)Itali", "ad.ae.af.ag.ai.al.am.an.ao.aq.ar.as.at.au.aw.ax.az.ba.bb.bd.be.bf.bg.bh.bi.bj.bl.bm.bn.bo.bq.br.bs.bt.bv.bw.by.bz.ca.cc.cd.cf.cg.ch.ci.ck.cl.cm.cn.co.cr.cu.cv.cw.cx.cy.cz.de.dj.dk.dm.do.dz.ec.ee.eg.eh.er.es.et.fi.fj.fk.fm.fo.fr.ga.gb.gd.ge.gf.gg.gh.gi.gl.gm.gn.gp.gq.gr.gs.gt.gu.gw.gy.hk.hm.hn.hr.ht.hu.id.ie.il.im.in.io.iq.ir.is.it.je.jm.jo.jp.ke.kg.kh.ki.km.kn.kp.kr.kw.ky.kz.la.lb.lc.li.lk.lr.ls.lt.lu.lv.ly.ma.mc.md.me.mf.mg.mh.mk.ml.mm.mn.mo.mp.mq.mr.ms.mt.mu.mv.mw.mx.my.mz.na.nc.ne.nf.ng.ni.nl.no.np.nr.nu.nz.om.pa.pe.pf.pg.ph.pk.pl.pm.pn.pr.ps.pt.pw.py.qa.re.ro.rs.ru.rw.sa.sb.sc.sd.se.sg.sh.si.sj.sk.sl.sm.sn.so.sr.ss.st.sv.sx.sy.sz.tc.td.tf.tg.th.tj.tk.tl.tm.tn.to.tr.tt.tv.tw.tz.ua.ug.um.us.uy.uz.va.vc.ve.vg.vi.vn.vu.wf.ws.ye.yt.za.zm.zw", "ENENENENENENENENENEN");
        java.util.Locale locale4 = locale3.stripExtensions();
        java.lang.String str5 = locale3.toLanguageTag();
        org.junit.Assert.assertEquals(locale3.toString(), "rance)itali_AD.AE.AF.AG.AI.AL.AM.AN.AO.AQ.AR.AS.AT.AU.AW.AX.AZ.BA.BB.BD.BE.BF.BG.BH.BI.BJ.BL.BM.BN.BO.BQ.BR.BS.BT.BV.BW.BY.BZ.CA.CC.CD.CF.CG.CH.CI.CK.CL.CM.CN.CO.CR.CU.CV.CW.CX.CY.CZ.DE.DJ.DK.DM.DO.DZ.EC.EE.EG.EH.ER.ES.ET.FI.FJ.FK.FM.FO.FR.GA.GB.GD.GE.GF.GG.GH.GI.GL.GM.GN.GP.GQ.GR.GS.GT.GU.GW.GY.HK.HM.HN.HR.HT.HU.ID.IE.IL.IM.IN.IO.IQ.IR.IS.IT.JE.JM.JO.JP.KE.KG.KH.KI.KM.KN.KP.KR.KW.KY.KZ.LA.LB.LC.LI.LK.LR.LS.LT.LU.LV.LY.MA.MC.MD.ME.MF.MG.MH.MK.ML.MM.MN.MO.MP.MQ.MR.MS.MT.MU.MV.MW.MX.MY.MZ.NA.NC.NE.NF.NG.NI.NL.NO.NP.NR.NU.NZ.OM.PA.PE.PF.PG.PH.PK.PL.PM.PN.PR.PS.PT.PW.PY.QA.RE.RO.RS.RU.RW.SA.SB.SC.SD.SE.SG.SH.SI.SJ.SK.SL.SM.SN.SO.SR.SS.ST.SV.SX.SY.SZ.TC.TD.TF.TG.TH.TJ.TK.TL.TM.TN.TO.TR.TT.TV.TW.TZ.UA.UG.UM.US.UY.UZ.VA.VC.VE.VG.VI.VN.VU.WF.WS.YE.YT.ZA.ZM.ZW_ENENENENENENENENENEN");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "rance)itali_AD.AE.AF.AG.AI.AL.AM.AN.AO.AQ.AR.AS.AT.AU.AW.AX.AZ.BA.BB.BD.BE.BF.BG.BH.BI.BJ.BL.BM.BN.BO.BQ.BR.BS.BT.BV.BW.BY.BZ.CA.CC.CD.CF.CG.CH.CI.CK.CL.CM.CN.CO.CR.CU.CV.CW.CX.CY.CZ.DE.DJ.DK.DM.DO.DZ.EC.EE.EG.EH.ER.ES.ET.FI.FJ.FK.FM.FO.FR.GA.GB.GD.GE.GF.GG.GH.GI.GL.GM.GN.GP.GQ.GR.GS.GT.GU.GW.GY.HK.HM.HN.HR.HT.HU.ID.IE.IL.IM.IN.IO.IQ.IR.IS.IT.JE.JM.JO.JP.KE.KG.KH.KI.KM.KN.KP.KR.KW.KY.KZ.LA.LB.LC.LI.LK.LR.LS.LT.LU.LV.LY.MA.MC.MD.ME.MF.MG.MH.MK.ML.MM.MN.MO.MP.MQ.MR.MS.MT.MU.MV.MW.MX.MY.MZ.NA.NC.NE.NF.NG.NI.NL.NO.NP.NR.NU.NZ.OM.PA.PE.PF.PG.PH.PK.PL.PM.PN.PR.PS.PT.PW.PY.QA.RE.RO.RS.RU.RW.SA.SB.SC.SD.SE.SG.SH.SI.SJ.SK.SL.SM.SN.SO.SR.SS.ST.SV.SX.SY.SZ.TC.TD.TF.TG.TH.TJ.TK.TL.TM.TN.TO.TR.TT.TV.TW.TZ.UA.UG.UM.US.UY.UZ.VA.VC.VE.VG.VI.VN.VU.WF.WS.YE.YT.ZA.ZM.ZW_ENENENENENENENENENEN");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "und" + "'", str5, "und");
    }

    @Test
    public void test19583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19583");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("HI!HI!HI!HI!HI!Hzh_Z!HI!HI!HI!HI!HI", "chinchinchinchinchinchinchinchinchin$$$$$$$$$#");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test19584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19584");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("a", "", 0);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, 'a', (int) (byte) 1, (int) (byte) -1);
        int int9 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("hi!", strArray4);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test19585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19585");
        java.util.Locale.Builder builder1 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder1.setScript("");
        java.util.Locale locale4 = builder1.build();
        java.util.Locale locale5 = builder1.build();
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.upperCase("class java.lang.String.class java.lang.String.class java.lang.String", locale5);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CLASS JAVA.LANG.STRING.CLASS JAVA.LANG.STRING.CLASS JAVA.LANG.STRING" + "'", str6, "CLASS JAVA.LANG.STRING.CLASS JAVA.LANG.STRING.CLASS JAVA.LANG.STRING");
    }

    @Test
    public void test19586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19586");
        java.util.Locale.Builder builder1 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale.Builder builder4 = builder2.setLanguageTag("zh-CN");
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        java.util.Locale.Builder builder7 = builder4.setLanguageTag("ANIHC");
        java.util.Locale locale8 = builder4.build();
        java.util.Locale.Builder builder9 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder10 = builder9.clearExtensions();
        java.util.Locale locale11 = builder9.build();
        java.util.Locale locale12 = builder9.build();
        java.lang.String str14 = locale12.getExtension('a');
        java.lang.String str15 = locale8.getDisplayName(locale12);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.lowerCase("HindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindi", locale8);
        char[] charArray27 = new char[] {};
        int int28 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray27);
        boolean boolean29 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "zh-CN", charArray27);
        int int30 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "a", charArray27);
        int int31 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "  China   ", charArray27);
        int int32 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                 a                  ", charArray27);
        int int33 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\u6cd5\u6587", charArray27);
        int int34 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "Chinaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray27);
        boolean boolean35 = org.apache.commons.lang3.StringUtils.containsAny("zh_CN", charArray27);
        boolean boolean36 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "ggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engli", charArray27);
        boolean boolean37 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                              italiahi                                              t                                              italiahi                                              l                                              italiahi                                                                                            italiahi                                                                                            italiahi                                              ", charArray27);
        boolean boolean38 = locale8.equals((java.lang.Object) charArray27);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "anihc");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "anihc" + "'", str15, "anihc");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindi" + "'", str16, "hindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindi");
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray27), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray27), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray27), "[]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test19587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19587");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("\u4e2d\u6587\u53f0\u7063)", "..ITALIAHiit_CN..ITALIAHiit_CN..ITALIAHiit_CN..ITALIAHi", 16);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test19588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19588");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Locale locale2 = new java.util.Locale("");
        java.lang.String str3 = locale2.getDisplayLanguage();
        java.util.Locale locale4 = java.util.Locale.CANADA;
        java.lang.String str5 = locale4.getDisplayLanguage();
        java.lang.String str6 = locale2.getDisplayScript(locale4);
        java.util.Locale.Builder builder7 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder8 = builder7.clearExtensions();
        java.util.Locale locale9 = builder7.build();
        java.lang.String str10 = locale2.getDisplayCountry(locale9);
        java.lang.String str11 = locale0.getDisplayScript(locale9);
        java.lang.Class<?> wildcardClass12 = locale0.getClass();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u82f1\u6587" + "'", str5, "\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test19589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19589");
        java.lang.String[] strArray1 = java.util.Locale.getISOLanguages();
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.stripAll(strArray1);
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("", strArray1);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, 'a', 8, 117);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "asaavaayaazabaabeabgabhabiabmabnaboabrabsacaaceachacoacracsacuacvacyadaadeadvadzaeeaelaenaeoaesaetaeuafaaffafiafjafoafrafyagaagdaglagnaguagvahaaheahiahoahrahtahuahyahzaiaaidaieaigaiiaikainaioaisaitaiuaiwajaajiajvakaakgakiakjakkaklakmaknakoakraksakuakvakwakyalaalbalgalialnaloaltalualvamgamhamiamkamlamnamoamramsamtamyanaanband" + "'", str7, "asaavaayaazabaabeabgabhabiabmabnaboabrabsacaaceachacoacracsacuacvacyadaadeadvadzaeeaelaenaeoaesaetaeuafaaffafiafjafoafrafyagaagdaglagnaguagvahaaheahiahoahrahtahuahyahzaiaaidaieaigaiiaikainaioaisaitaiuaiwajaajiajvakaakgakiakjakkaklakmaknakoakraksakuakvakwakyalaalbalgalialnaloaltalualvamgamhamiamkamlamnamoamramsamtamyanaanband");
    }

    @Test
    public void test19590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19590");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("A", "\u82f1\u6587\u52a0\u62ff\u5927)", 20);
        java.lang.Class<?>[] wildcardClassArray8 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray7);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.split("Engls", '#');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray11, '4', (int) (short) 0, 1);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("fra", strArray7, strArray11);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap18 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList19 = java.util.Locale.LanguageRange.parse("Cina", strMap18);
        java.lang.String[] strArray23 = new java.lang.String[] { "aiaiaiaiaiaiaiaiaia", "zh-CN", "China" };
        java.util.ArrayList<java.lang.String> strList24 = new java.util.ArrayList<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList24, strArray23);
        java.util.Locale.FilteringMode filteringMode26 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList27 = java.util.Locale.filterTags(languageRangeList19, (java.util.Collection<java.lang.String>) strList24, filteringMode26);
        java.lang.String[] strArray29 = org.apache.commons.lang3.StringUtils.splitByCharacterType("ita");
        boolean boolean30 = languageRangeList19.remove((java.lang.Object) strArray29);
        java.lang.String str31 = org.apache.commons.lang3.StringUtils.replaceEach("xxxxxxxxxxFrench (France)xxxxxxxxxx", strArray11, strArray29);
        java.lang.String[] strArray35 = org.apache.commons.lang3.StringUtils.split("cinese (Cina)", "TW", (-1));
        java.lang.String str36 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray35);
        java.lang.Class<?>[] wildcardClassArray37 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray35);
        java.lang.String str38 = org.apache.commons.lang3.StringUtils.replaceEach("AHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HENGLISH", strArray29, strArray35);
        boolean boolean39 = org.apache.commons.lang3.StringUtils.startsWithAny("UNDAAAAAAA", strArray35);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(wildcardClassArray8);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Engls" + "'", str15, "Engls");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "fra" + "'", str16, "fra");
        org.junit.Assert.assertNotNull(languageRangeList19);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + filteringMode26 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode26.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList27);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "xxxxxxxxxxFrench (France)xxxxxxxxxx" + "'", str31, "xxxxxxxxxxFrench (France)xxxxxxxxxx");
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "cinese (Cina)" + "'", str36, "cinese (Cina)");
        org.junit.Assert.assertNotNull(wildcardClassArray37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "AHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HENGLISH" + "'", str38, "AHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HENGLISH");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test19591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19591");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("..................chinois (Chine)", ".....zhcinesese");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "..................chinois (Chine)" + "'", str2, "..................chinois (Chine)");
    }

    @Test
    public void test19592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19592");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.setLanguageTag("zh-CN");
        java.util.Locale.Builder builder5 = builder3.setLanguage("CHINA");
        java.util.Locale.Builder builder7 = builder5.setLanguageTag("english");
        java.util.Locale locale8 = builder7.build();
        java.util.Locale.Builder builder9 = builder7.clearExtensions();
        java.util.Locale.Builder builder10 = builder9.clear();
        java.util.Locale.Builder builder11 = builder10.clearExtensions();
        java.util.Locale.Category category12 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale15 = new java.util.Locale("");
        java.lang.String str16 = locale15.getDisplayLanguage();
        java.util.Locale locale17 = java.util.Locale.CANADA;
        java.lang.String str18 = locale17.getDisplayLanguage();
        java.lang.String str19 = locale15.getDisplayScript(locale17);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.lowerCase("a", locale15);
        java.lang.String str21 = locale15.getDisplayScript();
        java.util.Locale.setDefault(category12, locale15);
        java.util.Set<java.lang.Character> charSet23 = locale15.getExtensionKeys();
        java.lang.String str25 = locale15.getExtension('x');
        java.util.Locale.Builder builder26 = builder11.setLocale(locale15);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "english");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertTrue("'" + category12 + "' != '" + java.util.Locale.Category.FORMAT + "'", category12.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertEquals(locale15.toString(), "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\u82f1\u6587" + "'", str18, "\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "a" + "'", str20, "a");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(charSet23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(builder26);
    }

    @Test
    public void test19593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19593");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("hi!hi!hi!hi!hi!hZH_z!hi!hi!hi!hi!hi44444444444444444444444444444444444444444444444444444444444444", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!hi!hi!hi!hZH_z!hi!hi!hi!hi!hi44444444444444444444444444444444444444444444444444444444444444" + "'", str2, "hi!hi!hi!hi!hi!hZH_z!hi!hi!hi!hi!hi44444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test19594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19594");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("nglish", "Locale.FilteringMode", 17, 18);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nglishLocale.FilteringMode" + "'", str4, "nglishLocale.FilteringMode");
    }

    @Test
    public void test19595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19595");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("Francese");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "francese" + "'", str1, "francese");
    }

    @Test
    public void test19596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19596");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("AAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test19597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19597");
        char[] charArray8 = new char[] {};
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "zh-CN", charArray8);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "a", charArray8);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "  China   ", charArray8);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "zh_CN", charArray8);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "TW", charArray8);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "cCHNAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAina (CCHNAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAina)", charArray8);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "\u4e2d\u56fd\u8a9e\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd)", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test19598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19598");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "HI!HI!HI!HI!HI!Hzh_Z!ZH_TWHI!HI!HI!HI!HI!Hzh_Z!H");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test19599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19599");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.setLanguageTag("zh-CN");
        java.util.Locale.Builder builder5 = builder3.setLanguage("it");
        java.util.Locale.Builder builder6 = new java.util.Locale.Builder();
        java.util.Locale locale8 = java.util.Locale.FRANCE;
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale8);
        java.util.Locale.setDefault(locale8);
        java.util.Locale.Builder builder11 = builder6.setLocale(locale8);
        java.lang.String str13 = locale8.getExtension('x');
        java.util.Locale.Builder builder14 = builder3.setLocale(locale8);
        java.util.Locale.Builder builder16 = builder14.setScript("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder18 = builder14.setRegion("ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!haCOL");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!haCOL [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "english" + "'", str9, "english");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test19600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19600");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("java                                ", "EN_CA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java                                " + "'", str2, "java                                ");
    }

    @Test
    public void test19601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19601");
        java.lang.String[] strArray1 = null;
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("ESE", "loca");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                                                                                     ArrayList", strArray1, strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "                                                                                     ArrayList" + "'", str5, "                                                                                     ArrayList");
    }

    @Test
    public void test19602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19602");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("EnglGermnsGermn", '#');
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EnglGermnsGermn" + "'", str3, "EnglGermnsGermn");
    }

    @Test
    public void test19603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19603");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("E!E(TIIWIN", "    z");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test19604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19604");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("\u53f0\u7063$$$$$$$$", ' ', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u53f0\u7063$$$$$$$$" + "'", str3, "\u53f0\u7063$$$$$$$$");
    }

    @Test
    public void test19605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19605");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("n       a", "lOCALE.bUILDER[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test19606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19606");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap3);
        int int5 = languageRangeList1.size();
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor6 = languageRangeList1.listIterator();
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.util.Iterator<java.util.Locale.LanguageRange>) languageRangeItor6, "h");
        boolean boolean9 = languageRangeItor6.hasNext();
        boolean boolean10 = languageRangeItor6.hasNext();
        java.lang.String str12 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) languageRangeItor6, "Short");
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join((java.util.Iterator<java.util.Locale.LanguageRange>) languageRangeItor6, 'u');
        // The following exception was thrown during execution in test generation
        try {
            languageRangeItor6.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(languageRangeItor6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "java.util" + "'", str12, "java.util");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test19607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19607");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("##############acoL###############");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "##############acol###############" + "'", str1, "##############acol###############");
    }

    @Test
    public void test19608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19608");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter(".........                  cinese.........", "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ja$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test19609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19609");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("italia", "Locale.Builder");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test19610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19610");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "ItaliItaliItaliItaliItaliItaliItaliItaliItali", 94);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test19611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19611");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("languagerange", "italie", "I!HCHIZH_TW");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "languagerange" + "'", str3, "languagerange");
    }

    @Test
    public void test19612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19612");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "hindi(HI!,cHINA)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hindi(HI!,cHINA)" + "'", str1, "hindi(HI!,cHINA)");
    }

    @Test
    public void test19613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19613");
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
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap12 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList13 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList6, strMap12);
        java.util.Locale.LanguageRange languageRange15 = new java.util.Locale.LanguageRange("Engls");
        java.lang.String str16 = languageRange15.getRange();
        boolean boolean17 = languageRangeList6.add(languageRange15);
        java.lang.String str18 = languageRange15.getRange();
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(languageRangeArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(languageRangeStream11);
        org.junit.Assert.assertNotNull(languageRangeList13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "engls" + "'", str16, "engls");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "engls" + "'", str18, "engls");
    }

    @Test
    public void test19614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19614");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap3);
        java.util.Locale.LanguageRange[] languageRangeArray5 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList6 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList6, languageRangeArray5);
        boolean boolean8 = languageRangeList1.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList6);
        languageRangeList1.clear();
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
        java.util.List<java.util.Locale> localeList47 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList46);
        int int48 = languageRangeList1.size();
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap49 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList50 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap49);
        boolean boolean52 = languageRangeList1.remove((java.lang.Object) "iiiiiiiiiiiiiiiiiiiiiiArrayListiiiiiiiiiiiiiiiiiiiiiiiArrayListiiiiiiiiiiiiiiiiiiiiiiiArrayListiiiiiiiiiiiiiiiiiiiiiiiArrayListiiiiiiiiiiiiiiiiiiiiiiiArrayListiiiiiiiiiiiiiiiiiiiiiiiArrayListiiiiiiiiiiiiiiiiiiiiiiiArrayListiiiiiiiiiiiiiiiiiiiiiiiArrayListiiiiiiiiiiiiiiiiiiiiiiiArrayList");
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(languageRangeArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
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
        org.junit.Assert.assertEquals(locale20.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Chine" + "'", str21, "Chine");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "zh-CN" + "'", str22, "zh-CN");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Chine" + "'", str25, "Chine");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Chine" + "'", str28, "Chine");
        org.junit.Assert.assertEquals(locale32.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "fr_FR");
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
        org.junit.Assert.assertNotNull(localeList47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(languageRangeList50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test19615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19615");
        java.util.Locale locale1 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str2 = locale1.getDisplayLanguage();
        java.util.Locale locale3 = java.util.Locale.getDefault();
        java.lang.String str4 = locale1.getDisplayCountry(locale3);
        java.util.Locale locale5 = java.util.Locale.TAIWAN;
        java.lang.String str6 = locale5.getVariant();
        java.lang.String str7 = locale1.getDisplayName(locale5);
        java.util.Locale locale8 = locale5.stripExtensions();
        java.util.Locale.setDefault(locale5);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.lowerCase("44444444444444444444444444444444444chinChin (HI!,cHINA44444444444444444444444444444444444chinChin (HI!,cHINA44444444444444444444444444444444444chinChin (HI!,cHINA44444444444444444444444444444444444chinChin (HI!,cHINA44444444444444444444444444444444444chinChin (HI!,cHINA44444444444444444444444444444444444chinChin", locale5);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "chinois" + "'", str2, "chinois");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Taiwan" + "'", str4, "Taiwan");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u4e2d\u6587\u53f0\u7063)" + "'", str7, "\u4e2d\u6587\u53f0\u7063)");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "44444444444444444444444444444444444chinchin (hi!,china44444444444444444444444444444444444chinchin (hi!,china44444444444444444444444444444444444chinchin (hi!,china44444444444444444444444444444444444chinchin (hi!,china44444444444444444444444444444444444chinchin (hi!,china44444444444444444444444444444444444chinchin" + "'", str10, "44444444444444444444444444444444444chinchin (hi!,china44444444444444444444444444444444444chinchin (hi!,china44444444444444444444444444444444444chinchin (hi!,china44444444444444444444444444444444444chinchin (hi!,china44444444444444444444444444444444444chinchin (hi!,china44444444444444444444444444444444444chinchin");
    }

    @Test
    public void test19616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19616");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "AN       english");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aN       english" + "'", str1, "aN       english");
    }

    @Test
    public void test19617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19617");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("\u6cd5\u6cd5\u6587\u6587ST", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    chinEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglish");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test19618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19618");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("  en_   ", "...       ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test19619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19619");
        java.util.Locale locale1 = new java.util.Locale("ENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISH");
        java.lang.String str2 = locale1.toLanguageTag();
        java.util.Locale locale3 = locale1.stripExtensions();
        java.util.Locale.setDefault(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "englishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglish");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "und" + "'", str2, "und");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "englishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglish");
    }

    @Test
    public void test19620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19620");
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
        java.util.Locale.Category category36 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale37 = java.util.Locale.ENGLISH;
        java.util.Locale.setDefault(category36, locale37);
        java.util.Locale locale39 = java.util.Locale.JAPANESE;
        java.util.Locale locale41 = java.util.Locale.TAIWAN;
        java.lang.String str42 = org.apache.commons.lang3.StringUtils.upperCase("", locale41);
        java.lang.String str43 = locale39.getDisplayVariant(locale41);
        java.util.Locale.setDefault(category36, locale41);
        java.util.Locale locale45 = java.util.Locale.getDefault(category36);
        java.lang.String str46 = locale45.getLanguage();
        java.lang.String str47 = locale0.getDisplayCountry(locale45);
        java.util.Locale locale50 = new java.util.Locale("");
        java.lang.String str51 = locale50.getDisplayLanguage();
        java.util.Locale locale52 = java.util.Locale.CANADA;
        java.lang.String str53 = locale52.getDisplayLanguage();
        java.lang.String str54 = locale50.getDisplayScript(locale52);
        java.lang.String str55 = org.apache.commons.lang3.StringUtils.lowerCase("a", locale50);
        java.lang.String str56 = locale50.getDisplayScript();
        java.lang.String str57 = locale50.getDisplayLanguage();
        java.lang.String str59 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) locale50, "");
        java.lang.String str60 = locale50.getDisplayScript();
        java.lang.String str61 = locale0.getDisplayLanguage(locale50);
        java.lang.String str62 = locale0.getDisplayCountry();
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
        org.junit.Assert.assertTrue("'" + category36 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category36.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "en");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "ja");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "zh" + "'", str46, "zh");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals(locale50.toString(), "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "\u82f1\u6587" + "'", str53, "\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "a" + "'", str55, "a");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "Locale" + "'", str59, "Locale");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "Italian" + "'", str61, "Italian");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
    }

    @Test
    public void test19621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19621");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("A#a#a#a#a#");
        java.util.Set<java.lang.Character> charSet2 = locale1.getExtensionKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = locale1.getExtension('#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: #");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(charSet2);
    }

    @Test
    public void test19622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19622");
        java.util.Locale locale2 = new java.util.Locale("################################################################################################################lang", "");
        java.lang.String str3 = locale2.toString();
        org.junit.Assert.assertEquals(locale2.toString(), "################################################################################################################lang");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "################################################################################################################lang" + "'", str3, "################################################################################################################lang");
    }

    @Test
    public void test19623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19623");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("latiarfatilatiarfatilatiarfatilatiar", "it_IT", 15, 279);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "latiarfatilatiait_IT" + "'", str4, "latiarfatilatiait_IT");
    }

    @Test
    public void test19624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19624");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("z", "CA", (int) '#');
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "fra");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, 'u');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray5);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "z" + "'", str7, "z");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "z" + "'", str8, "z");
    }

    @Test
    public void test19625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19625");
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) "lang                                                      ", "...x.az.ba.bb.bd.be.eSESENICHZ......_ITALIANO");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang" + "'", str2, "java.lang");
    }

    @Test
    public void test19626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19626");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("a", "");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                    ", "zh-CN", 42);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.endsWithAny("Engls", strArray11);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("HI!STRING[]STRING[]S", strArray6, strArray11);
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.stripAll(strArray6);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HI!STRING[]STRING[]S" + "'", str13, "HI!STRING[]STRING[]S");
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test19627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19627");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fduuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test19628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19628");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("$$$$$$$$$nawiaT(eseengls$$$$$$$$$nawiaT(esE", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=$$$$$$$$$nawiat(eseengls$$$$$$$$$nawiat(ese");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test19629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19629");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("twn");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny("       hi!", strArray3);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny("CINAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test19630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19630");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("string");
        java.lang.String str2 = languageRange1.getRange();
        java.lang.String str3 = languageRange1.getRange();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "string" + "'", str2, "string");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "string" + "'", str3, "string");
    }

    @Test
    public void test19631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19631");
        java.util.Locale locale2 = java.util.Locale.CANADA;
        java.lang.String str3 = locale2.toLanguageTag();
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.upperCase("hi!", locale2);
        java.util.Locale locale6 = java.util.Locale.CHINA;
        java.util.Set<java.lang.Character> charSet7 = locale6.getExtensionKeys();
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.lowerCase("String[]", locale6);
        java.lang.String str9 = locale6.getVariant();
        java.lang.String str10 = locale2.getDisplayVariant(locale6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.lowerCase("ANIH", locale6);
        java.util.Locale.Builder builder12 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder13 = builder12.clearExtensions();
        java.util.Locale locale14 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale.Builder builder15 = builder13.setLocale(locale14);
        java.util.Locale.Builder builder17 = builder13.setRegion("zh");
        java.util.Locale locale18 = builder13.build();
        java.util.Locale locale19 = java.util.Locale.CANADA;
        boolean boolean20 = locale19.hasExtensions();
        java.util.Locale locale21 = java.util.Locale.ITALIAN;
        java.lang.String str22 = locale19.getDisplayScript(locale21);
        java.util.Set<java.lang.String> strSet23 = locale19.getUnicodeLocaleAttributes();
        java.lang.String str24 = locale19.getVariant();
        java.lang.String str25 = locale18.getDisplayCountry(locale19);
        java.lang.String str26 = locale18.getScript();
        java.lang.String str27 = locale6.getDisplayName(locale18);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "en-CA" + "'", str3, "en-CA");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HI!" + "'", str4, "HI!");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(charSet7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "string[]" + "'", str8, "string[]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "anih" + "'", str11, "anih");
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "zh_ZH");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "it");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "ZH" + "'", str25, "ZH");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\u4e2d\u6587\u4e2d\u56fd)" + "'", str27, "\u4e2d\u6587\u4e2d\u56fd)");
    }

    @Test
    public void test19632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19632");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains(" ud ", "A][gnirts");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test19633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19633");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("AD.AE.AF.AGchnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.AT.AU.AW.AX.AZ.BA.BB.BD.BE.BF.BG.BH.BI.BJ.BL.BM.BN.BO.BQ.BR.BS.BT.BV.BW.BY.BZ.CA.CC.CD.CF.CG.CH.CI.CK.CL.CM.CN.CO.CR.CU.CV.CW.CX.CY.CZ.DE.DJ.DK.DM.DO.DZ.EC.EE.EG.EH.ER.ES.ET.FI.FJ.FK.FM.FO.FR.GA.GB.GD.GE.GF.GG.GH.GI.GL.GM.GN.GP.GQ.GR.GS.GT.GU.GW.GY.HK.HM.HN.HR.HT.HU.ID.IE.IL.IM.IN.IO.IQ.IR.IS.IT.JE.JM.JO.JP.KE.KG.KH.KI.KM.KN.KP.KR.KW.KY.KZ.LA.LB.LC.LI.LK.LR.LS.LT.LU.LV.LY.MA.MC.MD.ME.MF.MG.MH.MK.ML.MM.MN.MO.MP.MQ.MR.MS.MT.MU.MV.MW.MX.MY.MZ.NA.NC.NE.NF.NG.NI.NL.NO.NP.NR.NU.NZ.OM.PA.PE.PF.PG.PH.PK.PL.PM.PN.PR.PS.PT.PW.PY.QA.RE.RO.RS.RU.RW.SA.SB.SC.SD.SE.SG.SH.SI.SJ.SK.SL.SM.SN.SO.SR.SS.ST.SV.SX.SY.SZ.TC.TD.TF.TG.TH.TJ.TK.TL.TM.TN.TO.TR.TT.TV.TW.TZ.UA.UG.UM.US.UY.UZ.VA.VC.VE.VG.VI.VN.VU.WF.WS.YE.YT.ZA.ZM.ZW", "ANIHC   ENGLTWNSTWNaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 5);
        java.lang.String[] strArray5 = null;
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("En", strArray4, strArray5);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray5);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "En" + "'", str6, "En");
        org.junit.Assert.assertNull(strArray7);
    }

    @Test
    public void test19634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19634");
        char[] charArray7 = new char[] {};
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "zh-CN", charArray7);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "a", charArray7);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "  China   ", charArray7);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "C", charArray7);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "italianojajajajajajajajajajajajajaj", charArray7);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny("\u56fd\u4e2d", charArray7);
        java.lang.Class<?> wildcardClass15 = charArray7.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test19635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19635");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("ocle.bulde (F   CH,arraylist###########en,CAarraylist###########en,CAarraylist###########en,CAarraylist###########en,CAarraylist###########en,CAarraylist###########en,CAarraylist###########en,CAarraylist###########en,CAarraylist###########en,CAarraylist###########en,CAarraylist###########en,CAarraylist###########en,CAarraylist###########en,CAarraylist###########en,CAarraylist###########en,CAarraylist###########en,CAarraylist###########en,CAarraylist###########en,CAarraylist###########en,CAarraylist###########en,CAarraylist###########en,CAarraylist###########en,CAarraylist###########en,CAarraylist###########en,CAarraylist###########en,CAarraylist###########en,CAarraylist###########en,CAarraylist###########en,CAarraylist###########en,CAarraylist###########en,CAarraylist###########en,CAarraylist###########en,CAarraylist###########en,CAarraylist###########en,CAarraylist###########en,CAarraylist###########)", "$English (Canada)(JAVA.LANG)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test19636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19636");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale.Builder builder3 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder4 = builder1.clearExtensions();
        java.util.Locale.Builder builder6 = builder1.setVariant("");
        java.util.Locale.Builder builder7 = builder1.clear();
        java.util.Locale locale8 = builder7.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder7.setLanguage("                                         Hindi (HI!,cHINA)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language:                                          Hindi (HI!,cHINA) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
    }

    @Test
    public void test19637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19637");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("                         ", 41);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                         " + "'", str2, "                         ");
    }

    @Test
    public void test19638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19638");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "L.AVAJSTRING[]STRING[]STRING");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test19639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19639");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b\u82f1\u6587\u7f8e\u570b)", "                                                                                            Itali", 100);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test19640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19640");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("                      hArrayList", "ZWD U ", 120, 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "          ZWD U " + "'", str4, "          ZWD U ");
    }

    @Test
    public void test19641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19641");
        java.util.Locale locale1 = new java.util.Locale("\u53f0\u6e7e\u5730\u533a####");
        org.junit.Assert.assertEquals(locale1.toString(), "\u53f0\u6e7e\u5730\u533a####");
    }

    @Test
    public void test19642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19642");
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
        java.util.Locale.LanguageRange languageRange96 = languageRangeList93.remove(0);
        double double97 = languageRange96.getWeight();
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
        org.junit.Assert.assertEquals(locale49.toString(), "it");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "Cina" + "'", str50, "Cina");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "zh-CN" + "'", str51, "zh-CN");
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "it");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "Cina" + "'", str54, "Cina");
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale56);
        org.junit.Assert.assertEquals(locale56.toString(), "it");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "Cina" + "'", str57, "Cina");
        org.junit.Assert.assertEquals(locale61.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale62);
        org.junit.Assert.assertEquals(locale62.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "it");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "Cina" + "'", str64, "Cina");
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
        org.junit.Assert.assertNotNull(languageRange96);
        org.junit.Assert.assertTrue("'" + double97 + "' != '" + 1.0d + "'", double97 == 1.0d);
    }

    @Test
    public void test19643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19643");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("elacoLelacoLelacoLelacoLelacoL", "", 44);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 30 + "'", int3 == 30);
    }

    @Test
    public void test19644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19644");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("francese", "frfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfr");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "francese" + "'", str2, "francese");
    }

    @Test
    public void test19645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19645");
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
            java.util.Locale.Builder builder31 = builder27.setLanguage("I!HCHIZH_TW");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: I!HCHIZH_TW [at index 0]");
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
    public void test19646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19646");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("ch (JAVA.LANG)", "                 a                 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test19647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19647");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("N...", "A.FA.EA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test19648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19648");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("Anz...", "...                           ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Anz..." + "'", str2, "Anz...");
    }

    @Test
    public void test19649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19649");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("...................................................................................");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test19650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19650");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("en_CA", " (HI!,cHINA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "en_CA" + "'", str2, "en_CA");
    }

    @Test
    public void test19651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19651");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("CN                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               ", "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "chinChinChinChinChiChinChinChinChinC");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test19652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19652");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("\u5951\u52aa\u514b\u6587");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test19653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19653");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!henglish", "GGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLI", "##############acol###############");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!henglish" + "'", str3, "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!henglish");
    }

    @Test
    public void test19654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19654");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("cnn", "                                             italiahI                                             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "cnn" + "'", str2, "cnn");
    }

    @Test
    public void test19655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19655");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAITHI!LIHI!NO");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test19656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19656");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "                  hI   Taiwan                  hI   ", (java.lang.CharSequence) "di");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "                  hI   Taiwan                  hI   " + "'", charSequence2, "                  hI   Taiwan                  hI   ");
    }

    @Test
    public void test19657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19657");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("en_cauuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444EN-CASTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRIN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "en_cauuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str2, "en_cauuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test19658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19658");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("English", "hi!", (int) (byte) 0);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.endsWithAny("China", strArray5);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, "a", (int) '4', (int) ' ');
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.stripAll(strArray5, "twn");
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny("\u6cd5\u6587", strArray12);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray12, "en");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Englensen" + "'", str15, "Englensen");
    }

    @Test
    public void test19659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19659");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("\u4e2d\u6587", "                                                                                                 ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test19660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19660");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "anglais (Canada)                                                                                    ", "Anz...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test19661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19661");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("  China   ");
        boolean boolean3 = org.apache.commons.lang3.StringUtils.startsWithAny("hi-china", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test19662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19662");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("#################################################################################################");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.split("cinaxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", "                                     ARRAYLIST");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.concatWith("LOCALE#LANGUAGERANGE", (java.lang.Object[]) strArray7);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray7);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEach("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", strArray3, strArray9);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "cinaxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx" + "'", str8, "cinaxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str10, "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test19663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19663");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("....english (ZHCINESESE,.)", "                                                javacinese.cineselang                                                ", 10);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("English", "hi!", (int) (byte) 0);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.concatWith("TWN", (java.lang.Object[]) strArray10);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray10);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny("                                                      java.lang                                                      ", strArray10);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEach("", strArray4, strArray10);
        java.lang.String[] strArray16 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "chinois (chine)");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "EnglTWNsTWN" + "'", str11, "EnglTWNsTWN");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Engls" + "'", str12, "Engls");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(strArray16);
    }

    @Test
    public void test19664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19664");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("#####################################################################################################################################################################################################################################################################################################################################hi!italiahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIital..#####################################################################################################################################################################################################################################################################################################################################", "Anzh_TWAnzh_TWAnz####################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test19665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19665");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap3);
        int int5 = languageRangeList1.size();
        java.util.Locale locale6 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str7 = locale6.getISO3Language();
        java.lang.String str9 = locale6.getUnicodeLocaleType("AI");
        java.util.Set<java.lang.String> strSet10 = locale6.getUnicodeLocaleAttributes();
        boolean boolean11 = languageRangeList1.contains((java.lang.Object) locale6);
        int int13 = languageRangeList1.indexOf((java.lang.Object) "in");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap15 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList16 = java.util.Locale.LanguageRange.parse("Cina", strMap15);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap17 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList18 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList16, strMap17);
        java.util.Locale.LanguageRange[] languageRangeArray19 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList20 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList20, languageRangeArray19);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap22 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList23 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList20, strMap22);
        int int24 = languageRangeList20.size();
        boolean boolean25 = languageRangeList16.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList20);
        java.lang.String str27 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList20, "\u5927\u62ff\u52a0\u6587\u82f1");
        java.util.Locale.LanguageRange[] languageRangeArray28 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList29 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList29, languageRangeArray28);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap31 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList32 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList29, strMap31);
        java.lang.String[] strArray40 = new java.lang.String[] { "English", "hi", "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "", "a", "", "China" };
        java.util.ArrayList<java.lang.String> strList41 = new java.util.ArrayList<java.lang.String>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList41, strArray40);
        java.util.List<java.lang.Class<?>> wildcardClassList43 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList41);
        java.lang.String str44 = java.util.Locale.lookupTag(languageRangeList32, (java.util.Collection<java.lang.String>) strList41);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList46 = java.util.Locale.LanguageRange.parse("hi");
        boolean boolean48 = languageRangeList46.remove((java.lang.Object) "English");
        java.util.Locale.LanguageRange[] languageRangeArray49 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList50 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList50, languageRangeArray49);
        java.util.Locale locale53 = java.util.Locale.FRANCE;
        java.lang.String str54 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale53);
        java.util.Locale locale55 = java.util.Locale.US;
        java.util.Locale locale56 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale57 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale58 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale59 = java.util.Locale.getDefault();
        java.lang.String str60 = locale58.getDisplayCountry(locale59);
        java.lang.String str61 = locale58.toLanguageTag();
        java.util.Locale locale62 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale63 = java.util.Locale.getDefault();
        java.lang.String str64 = locale62.getDisplayCountry(locale63);
        java.util.Locale locale65 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale66 = java.util.Locale.getDefault();
        java.lang.String str67 = locale65.getDisplayCountry(locale66);
        java.util.Locale locale71 = new java.util.Locale("hi", "hi!", "cHINA");
        java.util.Locale locale72 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale73 = java.util.Locale.getDefault();
        java.lang.String str74 = locale72.getDisplayCountry(locale73);
        java.util.Locale locale76 = new java.util.Locale("");
        java.lang.String str77 = locale76.getDisplayVariant();
        java.util.Locale locale78 = java.util.Locale.KOREAN;
        java.util.Locale locale80 = new java.util.Locale("");
        java.util.Locale locale81 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale[] localeArray82 = new java.util.Locale[] { locale53, locale55, locale56, locale57, locale58, locale63, locale65, locale71, locale73, locale76, locale78, locale80, locale81 };
        java.util.ArrayList<java.util.Locale> localeList83 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList83, localeArray82);
        java.util.List<java.util.Locale> localeList85 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList50, (java.util.Collection<java.util.Locale>) localeList83);
        java.util.List<java.util.Locale> localeList86 = java.util.Locale.filter(languageRangeList46, (java.util.Collection<java.util.Locale>) localeList83);
        java.util.List<java.util.Locale> localeList87 = java.util.Locale.filter(languageRangeList32, (java.util.Collection<java.util.Locale>) localeList86);
        java.util.List<java.util.Locale> localeList88 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList20, (java.util.Collection<java.util.Locale>) localeList87);
        java.util.List<java.util.Locale> localeList89 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList88);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "fra" + "'", str7, "fra");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(languageRangeList16);
        org.junit.Assert.assertNotNull(languageRangeList18);
        org.junit.Assert.assertNotNull(languageRangeArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(languageRangeList23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(languageRangeArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(languageRangeList32);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(wildcardClassList43);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNotNull(languageRangeList46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(languageRangeArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "english" + "'", str54, "english");
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale56);
        org.junit.Assert.assertEquals(locale56.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale57);
        org.junit.Assert.assertEquals(locale57.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "it");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "Cina" + "'", str60, "Cina");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "zh-CN" + "'", str61, "zh-CN");
        org.junit.Assert.assertNotNull(locale62);
        org.junit.Assert.assertEquals(locale62.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "it");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "Cina" + "'", str64, "Cina");
        org.junit.Assert.assertNotNull(locale65);
        org.junit.Assert.assertEquals(locale65.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale66);
        org.junit.Assert.assertEquals(locale66.toString(), "it");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "Cina" + "'", str67, "Cina");
        org.junit.Assert.assertEquals(locale71.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale72);
        org.junit.Assert.assertEquals(locale72.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale73);
        org.junit.Assert.assertEquals(locale73.toString(), "it");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "Cina" + "'", str74, "Cina");
        org.junit.Assert.assertEquals(locale76.toString(), "");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertNotNull(locale78);
        org.junit.Assert.assertEquals(locale78.toString(), "ko");
        org.junit.Assert.assertEquals(locale80.toString(), "");
        org.junit.Assert.assertNotNull(locale81);
        org.junit.Assert.assertEquals(locale81.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray82);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertNotNull(localeList85);
        org.junit.Assert.assertNotNull(localeList86);
        org.junit.Assert.assertNotNull(localeList87);
        org.junit.Assert.assertNotNull(localeList88);
        org.junit.Assert.assertNotNull(localeList89);
    }

    @Test
    public void test19666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19666");
        java.util.Locale locale1 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale2 = java.util.Locale.getDefault();
        java.lang.String str3 = locale1.getDisplayCountry(locale2);
        java.lang.String str4 = locale1.toLanguageTag();
        java.lang.String str5 = locale1.getCountry();
        java.lang.String str6 = locale1.getISO3Country();
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.upperCase("", locale1);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "it");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Cina" + "'", str3, "Cina");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zh-CN" + "'", str4, "zh-CN");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CN" + "'", str5, "CN");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CHN" + "'", str6, "CHN");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test19667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19667");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("AVAJString[]String[]String[]x");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=avajstring[]string[]string[]x");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test19668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19668");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortClassName("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               fr");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               fr" + "'", str1, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               fr");
    }

    @Test
    public void test19669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19669");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("e!e(Tiiwin                                                                                       ");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.split("english", "cHINA", (int) (byte) 1);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray7, "Chinese", 8, (int) (byte) -1);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.startsWithAny("\u56fd\u4e2d\u6587\u4e2d   ", strArray7);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEach("ZHCINESESE", strArray2, strArray7);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ZHCINESESE" + "'", str13, "ZHCINESESE");
    }

    @Test
    public void test19670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19670");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("\u82f1\u8a9e", (int) '#', "\u4e2d\u6587\u53f0\u6e7e\u5730\u533aengliilish)                                  ");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u82f1\u8a9e" + "'", str3, "\u82f1\u8a9e");
    }

    @Test
    public void test19671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19671");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.getDefault(category0);
        java.util.Locale locale3 = java.util.Locale.getDefault(category0);
        java.util.Locale locale4 = java.util.Locale.getDefault(category0);
        java.lang.String str5 = locale4.getScript();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test19672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19672");
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
        java.lang.String str15 = locale9.getDisplayName();
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test19673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19673");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("ahi!hi!", 21, (int) 'u');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test19674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19674");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("$$$$$$$$$$$$$$$$$a$$$$$$$$$$$$$$$$$", 119, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "$$$$$$$$$$$$$$$$$a$$$$$$$$$$$$$$$$$                                                                                    " + "'", str3, "$$$$$$$$$$$$$$$$$a$$$$$$$$$$$$$$$$$                                                                                    ");
    }

    @Test
    public void test19675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19675");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("$$$$$$$$$nawiaT( eseengls$$$$$$$$$nawiaT( esE", "xxxxx...latiIhailatiIhailatiIhailatiIhailatiIhailatiIhailatiIhailatiIhailatiIhailatiIhailatiIhailati");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test19676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19676");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("                             HI!HI!HI!HI!HI!                    nglish  Hindi (HI!,cHINA                    nglish  Hind", "xGNAL.AVAJString[]String[]String[]");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test19677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19677");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "AAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 17 + "'", int1 == 17);
    }

    @Test
    public void test19678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19678");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("undaaaaaaaH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UNDAAAAAAAH" + "'", str1, "UNDAAAAAAAH");
    }

    @Test
    public void test19679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19679");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("GNIRTSGNIRTS");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "GNIRTSGNIRTS" + "'", str1, "GNIRTSGNIRTS");
    }

    @Test
    public void test19680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19680");
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
        java.lang.String str32 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList1, '.');
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream33 = languageRangeList1.stream();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange35 = languageRangeList1.remove(44);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 44, Size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
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
        org.junit.Assert.assertEquals(locale21.toString(), "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\u82f1\u6587" + "'", str24, "\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "a" + "'", str26, "a");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "German" + "'", str28, "German");
        org.junit.Assert.assertNotNull(strSet29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(languageRangeStream33);
    }

    @Test
    public void test19681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19681");
        java.util.Locale locale0 = java.util.Locale.ENGLISH;
        java.util.Locale locale1 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str2 = locale0.getDisplayCountry(locale1);
        java.util.Locale locale5 = new java.util.Locale("");
        java.lang.String str6 = locale5.getDisplayLanguage();
        java.util.Locale locale7 = java.util.Locale.CANADA;
        java.lang.String str8 = locale7.getDisplayLanguage();
        java.lang.String str9 = locale5.getDisplayScript(locale7);
        java.lang.String str10 = locale7.getDisplayVariant();
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.upperCase("", locale7);
        java.lang.String str12 = locale7.getLanguage();
        java.lang.String str13 = locale1.getDisplayScript(locale7);
        java.lang.String str14 = locale7.getDisplayName();
        java.util.Locale locale16 = java.util.Locale.forLanguageTag("HI");
        java.util.Locale.Builder builder17 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder18 = builder17.clearExtensions();
        java.util.Locale locale19 = builder17.build();
        java.lang.String str20 = locale19.getDisplayName();
        java.lang.String str21 = locale16.getDisplayVariant(locale19);
        java.lang.String str22 = locale16.getLanguage();
        java.lang.String str23 = locale7.getDisplayName(locale16);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\u82f1\u6587" + "'", str8, "\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "en" + "'", str12, "en");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\u82f1\u6587\u52a0\u62ff\u5927)" + "'", str14, "\u82f1\u6587\u52a0\u62ff\u5927)");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "hi");
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi" + "'", str22, "hi");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\u0905\u0901\u0917\u094d\u0930\u0947\u091c\u093c\u0940 (Canada)" + "'", str23, "\u0905\u0901\u0917\u094d\u0930\u0947\u091c\u093c\u0940 (Canada)");
    }

    @Test
    public void test19682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19682");
        java.util.Locale locale2 = java.util.Locale.ITALIAN;
        java.util.Locale locale4 = new java.util.Locale("");
        java.lang.String str5 = locale4.getDisplayLanguage();
        java.util.Locale locale6 = java.util.Locale.CANADA;
        java.lang.String str7 = locale6.getDisplayLanguage();
        java.lang.String str8 = locale4.getDisplayScript(locale6);
        java.util.Locale locale10 = java.util.Locale.FRANCE;
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale10);
        java.lang.String str12 = locale4.getDisplayCountry(locale10);
        java.lang.String str13 = locale2.getDisplayScript(locale4);
        java.util.Locale locale14 = java.util.Locale.GERMAN;
        java.lang.String str15 = locale4.getDisplayLanguage(locale14);
        java.util.Locale locale18 = new java.util.Locale("");
        java.lang.String str19 = locale18.getDisplayLanguage();
        java.util.Locale locale20 = java.util.Locale.CANADA;
        java.lang.String str21 = locale20.getDisplayLanguage();
        java.lang.String str22 = locale18.getDisplayScript(locale20);
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.lowerCase("a", locale18);
        java.lang.String str24 = locale18.getDisplayScript();
        java.lang.String str25 = locale14.getDisplayLanguage(locale18);
        java.util.Set<java.lang.String> strSet26 = locale18.getUnicodeLocaleAttributes();
        java.util.Locale.setDefault(locale18);
        java.lang.String str28 = org.apache.commons.lang3.StringUtils.lowerCase("\u5370\u5730\u6587 (HI!,cHINA)", locale18);
        java.lang.String str29 = org.apache.commons.lang3.StringUtils.lowerCase("chi..T", locale18);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str31 = locale18.getExtension('.');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "it");
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u82f1\u6587" + "'", str7, "\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "english" + "'", str11, "english");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "de");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals(locale18.toString(), "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\u82f1\u6587" + "'", str21, "\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "a" + "'", str23, "a");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "German" + "'", str25, "German");
        org.junit.Assert.assertNotNull(strSet26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\u5370\u5730\u6587 (hi!,china)" + "'", str28, "\u5370\u5730\u6587 (hi!,china)");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "chi..t" + "'", str29, "chi..t");
    }

    @Test
    public void test19683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19683");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("nawazh-cnnawa", "...x.z.b.bb.bd.be.bf.bg.bh.bi.bj.bl.bm.bn...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test19684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19684");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("it", strMap1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList2, '#');
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor6 = languageRangeList2.listIterator(1);
        java.lang.Object[] objArray7 = languageRangeList2.toArray();
        java.lang.Object obj8 = null;
        int int9 = languageRangeList2.indexOf(obj8);
        java.util.Locale.LanguageRange[] languageRangeArray10 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList11 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList11, languageRangeArray10);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap13 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList14 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList11, strMap13);
        java.lang.String[] strArray22 = new java.lang.String[] { "English", "hi", "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "", "a", "", "China" };
        java.util.ArrayList<java.lang.String> strList23 = new java.util.ArrayList<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList23, strArray22);
        java.util.List<java.lang.Class<?>> wildcardClassList25 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList23);
        java.lang.String str26 = java.util.Locale.lookupTag(languageRangeList14, (java.util.Collection<java.lang.String>) strList23);
        java.util.Locale.LanguageRange[] languageRangeArray27 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList28 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList28, languageRangeArray27);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap30 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList31 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList28, strMap30);
        java.util.Locale.LanguageRange[] languageRangeArray32 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList33 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList33, languageRangeArray32);
        boolean boolean35 = languageRangeList28.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList33);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream36 = languageRangeList33.stream();
        boolean boolean37 = languageRangeList14.containsAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList33);
        java.util.Locale.LanguageRange[] languageRangeArray38 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList39 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList39, languageRangeArray38);
        java.util.Locale locale42 = java.util.Locale.FRANCE;
        java.lang.String str43 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale42);
        java.util.Locale locale44 = java.util.Locale.US;
        java.util.Locale locale45 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale46 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale47 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale48 = java.util.Locale.getDefault();
        java.lang.String str49 = locale47.getDisplayCountry(locale48);
        java.lang.String str50 = locale47.toLanguageTag();
        java.util.Locale locale51 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale52 = java.util.Locale.getDefault();
        java.lang.String str53 = locale51.getDisplayCountry(locale52);
        java.util.Locale locale54 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale55 = java.util.Locale.getDefault();
        java.lang.String str56 = locale54.getDisplayCountry(locale55);
        java.util.Locale locale60 = new java.util.Locale("hi", "hi!", "cHINA");
        java.util.Locale locale61 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale62 = java.util.Locale.getDefault();
        java.lang.String str63 = locale61.getDisplayCountry(locale62);
        java.util.Locale locale65 = new java.util.Locale("");
        java.lang.String str66 = locale65.getDisplayVariant();
        java.util.Locale locale67 = java.util.Locale.KOREAN;
        java.util.Locale locale69 = new java.util.Locale("");
        java.util.Locale locale70 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale[] localeArray71 = new java.util.Locale[] { locale42, locale44, locale45, locale46, locale47, locale52, locale54, locale60, locale62, locale65, locale67, locale69, locale70 };
        java.util.ArrayList<java.util.Locale> localeList72 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList72, localeArray71);
        java.util.List<java.util.Locale> localeList74 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList39, (java.util.Collection<java.util.Locale>) localeList72);
        java.lang.String[] strArray82 = new java.lang.String[] { "English", "hi", "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "", "a", "", "China" };
        java.util.ArrayList<java.lang.String> strList83 = new java.util.ArrayList<java.lang.String>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList83, strArray82);
        java.util.List<java.lang.Class<?>> wildcardClassList85 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList83);
        java.util.Locale.FilteringMode filteringMode86 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList87 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList39, (java.util.Collection<java.lang.String>) strList83, filteringMode86);
        java.util.Spliterator<java.util.Locale.LanguageRange> languageRangeSpliterator88 = languageRangeList39.spliterator();
        java.lang.String str90 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) languageRangeList39, "Locale.LanguageRange");
        boolean boolean91 = languageRangeList33.containsAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList39);
        java.util.Locale.LanguageRange languageRange93 = new java.util.Locale.LanguageRange("English");
        java.lang.String str94 = languageRange93.getRange();
        boolean boolean95 = languageRangeList33.add(languageRange93);
        java.lang.String str96 = languageRange93.getRange();
        java.lang.String str97 = languageRange93.getRange();
        double double98 = languageRange93.getWeight();
        boolean boolean99 = languageRangeList2.add(languageRange93);
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeItor6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(languageRangeArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(languageRangeList14);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClassList25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(languageRangeArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(languageRangeList31);
        org.junit.Assert.assertNotNull(languageRangeArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(languageRangeStream36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(languageRangeArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "english" + "'", str43, "english");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "China" + "'", str49, "China");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "zh-CN" + "'", str50, "zh-CN");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "China" + "'", str53, "China");
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "China" + "'", str56, "China");
        org.junit.Assert.assertEquals(locale60.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale61);
        org.junit.Assert.assertEquals(locale61.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale62);
        org.junit.Assert.assertEquals(locale62.toString(), "");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "China" + "'", str63, "China");
        org.junit.Assert.assertEquals(locale65.toString(), "");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertNotNull(locale67);
        org.junit.Assert.assertEquals(locale67.toString(), "ko");
        org.junit.Assert.assertEquals(locale69.toString(), "");
        org.junit.Assert.assertNotNull(locale70);
        org.junit.Assert.assertEquals(locale70.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(localeList74);
        org.junit.Assert.assertNotNull(strArray82);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertNotNull(wildcardClassList85);
        org.junit.Assert.assertTrue("'" + filteringMode86 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode86.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList87);
        org.junit.Assert.assertNotNull(languageRangeSpliterator88);
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "ArrayList" + "'", str90, "ArrayList");
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "english" + "'", str94, "english");
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + true + "'", boolean95 == true);
        org.junit.Assert.assertEquals("'" + str96 + "' != '" + "english" + "'", str96, "english");
        org.junit.Assert.assertEquals("'" + str97 + "' != '" + "english" + "'", str97, "english");
        org.junit.Assert.assertTrue("'" + double98 + "' != '" + 1.0d + "'", double98 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + true + "'", boolean99 == true);
    }

    @Test
    public void test19685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19685");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale.Builder builder3 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder5 = builder1.setRegion("zh");
        java.util.Locale.Builder builder6 = builder5.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder6.setExtension('a', "NCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCARRAYLISTRING[]NCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCARRAYLISTRING[]NCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCARRAYLISTRING[]NCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCARRAYLISTRING[]NCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCARRAYLISTRING[]NCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCARRAYLIS");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension value: NCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCARRAYLISTRING[]NCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCARRAYLISTRING[]NCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCARRAYLISTRING[]NCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCARRAYLISTRING[]NCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCARRAYLISTRING[]NCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCARRAYLIS [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test19686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19686");
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
        boolean boolean97 = languageRangeList1.isEmpty();
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
        org.junit.Assert.assertEquals(locale46.toString(), "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "China" + "'", str47, "China");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "zh-CN" + "'", str48, "zh-CN");
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "China" + "'", str51, "China");
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "China" + "'", str54, "China");
        org.junit.Assert.assertEquals(locale58.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale60);
        org.junit.Assert.assertEquals(locale60.toString(), "");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "China" + "'", str61, "China");
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
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
    }

    @Test
    public void test19687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19687");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("di");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "di" + "'", str1, "di");
    }

    @Test
    public void test19688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19688");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "ZH-cnENGLISH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test19689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19689");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi", "A", (int) (short) -1);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("Chin", "english");
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEach("cinese (Taiwan)", strArray7, strArray10);
        int int12 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("cinese (Cina)", strArray10);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny("en_CA", strArray10);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.endsWithAny("hi!string[]string[]s", strArray10);
        java.lang.String[] strArray15 = org.apache.commons.lang3.StringUtils.stripAll(strArray10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray10, '.', 698, 990);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 698");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "cinese (Taiwan)" + "'", str11, "cinese (Taiwan)");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test19690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19690");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "TWN", "\u5730\u533aengliIlish)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test19691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19691");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("en");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.stripAll(strArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, 'a', 0, 9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test19692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19692");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("#################################################################################################");
        java.util.Locale locale2 = locale1.stripExtensions();
        java.lang.String str3 = locale1.getDisplayName();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test19693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19693");
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
        java.lang.String str34 = locale29.getDisplayScript();
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
        org.junit.Assert.assertEquals(locale28.toString(), "");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Chinese" + "'", str30, "Chinese");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
    }

    @Test
    public void test19694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19694");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                                             italiahi                                              ", 2, "lOCALE.bUILDER[]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                             italiahi                                              " + "'", str3, "                                             italiahi                                              ");
    }

    @Test
    public void test19695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19695");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("Object[]");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Object[]" + "'", str1, "Object[]");
    }

    @Test
    public void test19696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19696");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "e!e(tiiwin                        ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "e!e(tiiwin                        " + "'", str1, "e!e(tiiwin                        ");
    }

    @Test
    public void test19697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19697");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens(".", "HI");
        java.lang.Class<?>[] wildcardClassArray3 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray2);
        java.lang.Class<?>[] wildcardClassArray4 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray4, "xxxxxxxxxxFrench (France)xxxxxxxxxx", 649, 44);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertNotNull(wildcardClassArray4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test19698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19698");
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
        java.util.Set<java.lang.Character> charSet14 = locale1.getExtensionKeys();
        java.lang.String str15 = locale1.toLanguageTag();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it");
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u82f1\u6587" + "'", str6, "\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "english" + "'", str10, "english");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "CHINA" + "'", str13, "CHINA");
        org.junit.Assert.assertNotNull(charSet14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "it" + "'", str15, "it");
    }

    @Test
    public void test19699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19699");
        java.util.Locale locale1 = new java.util.Locale("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              fr                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ");
        org.junit.Assert.assertEquals(locale1.toString(), "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              fr                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ");
    }

    @Test
    public void test19700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19700");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("AN       english444444444444444444444444444", 15, 32);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "h444444444444444444444444444" + "'", str3, "h444444444444444444444444444");
    }

    @Test
    public void test19701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19701");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                redliuB", "                                                                                       ese(Taiwan");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test19702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19702");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("allemand", " (HI!,cHINA", 107);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test19703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19703");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuchina (Chine)");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "italiahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIital...xxxx", 742, 6);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test19704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19704");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("l", 742);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test19705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19705");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "java.uil");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test19706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19706");
        char[] charArray9 = new char[] { '#', '#', ' ' };
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny("", charArray9);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "arraylist###########", charArray9);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "eSESENICHZ....", charArray9);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts][gnirts_JA", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "## ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "## ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[#, #,  ]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test19707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19707");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, ".....ZHCINESESE");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: /////ZHCINESESE");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test19708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19708");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap3);
        java.util.Locale.LanguageRange[] languageRangeArray5 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList6 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList6, languageRangeArray5);
        boolean boolean8 = languageRangeList1.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList6);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream9 = languageRangeList6.stream();
        java.util.Iterator<java.util.Locale.LanguageRange> languageRangeItor10 = languageRangeList6.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange12 = languageRangeList6.get(990);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 990, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(languageRangeArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(languageRangeStream9);
        org.junit.Assert.assertNotNull(languageRangeItor10);
    }

    @Test
    public void test19709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19709");
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
        int int16 = languageRangeList9.size();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "english" + "'", str2, "english");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "english" + "'", str5, "english");
        org.junit.Assert.assertNotNull(languageRangeArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(languageRangeStream11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
    }

    @Test
    public void test19710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19710");
        java.util.Locale locale1 = new java.util.Locale("ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        java.util.Locale locale3 = new java.util.Locale("");
        java.lang.String str4 = locale3.getDisplayLanguage();
        java.util.Locale locale5 = java.util.Locale.CANADA;
        java.lang.String str6 = locale5.getDisplayLanguage();
        java.lang.String str7 = locale3.getDisplayScript(locale5);
        java.lang.String str8 = locale5.getDisplayVariant();
        java.util.Locale locale9 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale10 = java.util.Locale.getDefault();
        java.lang.String str11 = locale9.getDisplayCountry(locale10);
        java.lang.String str12 = locale10.getDisplayVariant();
        java.lang.String str13 = locale5.getDisplayScript(locale10);
        java.lang.String str14 = locale5.getISO3Language();
        java.lang.String str15 = locale5.getLanguage();
        java.util.Locale.Builder builder16 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder17 = builder16.clearExtensions();
        java.util.Locale.Builder builder18 = builder16.clearExtensions();
        java.util.Locale.Builder builder19 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder20 = builder19.clearExtensions();
        java.util.Locale locale21 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale.Builder builder22 = builder20.setLocale(locale21);
        java.util.Locale locale23 = builder22.build();
        java.util.Locale locale27 = new java.util.Locale("");
        java.util.Set<java.lang.String> strSet28 = locale27.getUnicodeLocaleKeys();
        boolean boolean29 = locale27.hasExtensions();
        java.lang.String str30 = locale27.getVariant();
        java.lang.String str31 = org.apache.commons.lang3.StringUtils.upperCase("String", locale27);
        java.lang.String str32 = org.apache.commons.lang3.StringUtils.lowerCase("chinChinChinChinChiChinChinChinChinC", locale27);
        java.util.Set<java.lang.String> strSet33 = locale27.getUnicodeLocaleAttributes();
        java.lang.String str34 = locale23.getDisplayName(locale27);
        java.util.Locale.Builder builder35 = builder18.setLocale(locale23);
        java.lang.String str36 = locale23.getDisplayVariant();
        java.lang.String str37 = locale5.getDisplayLanguage(locale23);
        java.lang.String str38 = locale5.toLanguageTag();
        java.lang.String str39 = locale1.getDisplayName(locale5);
        java.lang.String str40 = locale5.getDisplayVariant();
        org.junit.Assert.assertEquals(locale1.toString(), "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u82f1\u6587" + "'", str6, "\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "China" + "'", str11, "China");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "eng" + "'", str14, "eng");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "en" + "'", str15, "en");
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "zh_CN");
        org.junit.Assert.assertEquals(locale27.toString(), "");
        org.junit.Assert.assertNotNull(strSet28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "STRING" + "'", str31, "STRING");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "chinchinchinchinchichinchinchinchinc" + "'", str32, "chinchinchinchinchichinchinchinchinc");
        org.junit.Assert.assertNotNull(strSet33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Chinese (China)" + "'", str34, "Chinese (China)");
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "\u82f1\u6587" + "'", str37, "\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "en-CA" + "'", str38, "en-CA");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str39, "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
    }

    @Test
    public void test19711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19711");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("lOCALE.bUILDER", 46, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "lOCALE.bUILDER################################" + "'", str3, "lOCALE.bUILDER################################");
    }

    @Test
    public void test19712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19712");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "aaaaaaaaaaaitaliahI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AaaaaaaaaaaitaliahI" + "'", str1, "AaaaaaaaaaaitaliahI");
    }

    @Test
    public void test19713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19713");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("                                redliuB.elacoL");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "Chinese (China)");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test19714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19714");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.setLanguageTag("zh-CN");
        java.util.Locale.Builder builder5 = builder3.setLanguage("it");
        java.util.Locale.Builder builder6 = new java.util.Locale.Builder();
        java.util.Locale locale8 = java.util.Locale.FRANCE;
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale8);
        java.util.Locale.setDefault(locale8);
        java.util.Locale.Builder builder11 = builder6.setLocale(locale8);
        java.lang.String str13 = locale8.getExtension('x');
        java.util.Locale.Builder builder14 = builder3.setLocale(locale8);
        java.util.Locale.Builder builder16 = builder14.setScript("");
        java.util.Locale.Builder builder18 = builder16.setScript("");
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "english" + "'", str9, "english");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test19715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19715");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "ITAFRAITA", (java.lang.CharSequence) "locle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugerngelocle.lngugernge");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test19716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19716");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("English                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ", 15, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test19717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19717");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("hi");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList3 = java.util.Locale.LanguageRange.parse("hi");
        boolean boolean5 = languageRangeList3.remove((java.lang.Object) "English");
        boolean boolean6 = languageRangeList1.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList3);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList8 = java.util.Locale.LanguageRange.parse("hi");
        boolean boolean10 = languageRangeList8.remove((java.lang.Object) "English");
        boolean boolean12 = languageRangeList8.remove((java.lang.Object) 1);
        java.util.Locale.LanguageRange[] languageRangeArray13 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList14 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList14, languageRangeArray13);
        java.util.Locale locale17 = java.util.Locale.FRANCE;
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale17);
        java.util.Locale locale19 = java.util.Locale.US;
        java.util.Locale locale20 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale21 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale22 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale23 = java.util.Locale.getDefault();
        java.lang.String str24 = locale22.getDisplayCountry(locale23);
        java.lang.String str25 = locale22.toLanguageTag();
        java.util.Locale locale26 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale27 = java.util.Locale.getDefault();
        java.lang.String str28 = locale26.getDisplayCountry(locale27);
        java.util.Locale locale29 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale30 = java.util.Locale.getDefault();
        java.lang.String str31 = locale29.getDisplayCountry(locale30);
        java.util.Locale locale35 = new java.util.Locale("hi", "hi!", "cHINA");
        java.util.Locale locale36 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale37 = java.util.Locale.getDefault();
        java.lang.String str38 = locale36.getDisplayCountry(locale37);
        java.util.Locale locale40 = new java.util.Locale("");
        java.lang.String str41 = locale40.getDisplayVariant();
        java.util.Locale locale42 = java.util.Locale.KOREAN;
        java.util.Locale locale44 = new java.util.Locale("");
        java.util.Locale locale45 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale[] localeArray46 = new java.util.Locale[] { locale17, locale19, locale20, locale21, locale22, locale27, locale29, locale35, locale37, locale40, locale42, locale44, locale45 };
        java.util.ArrayList<java.util.Locale> localeList47 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList47, localeArray46);
        java.util.List<java.util.Locale> localeList49 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList14, (java.util.Collection<java.util.Locale>) localeList47);
        java.util.Locale locale50 = java.util.Locale.lookup(languageRangeList8, (java.util.Collection<java.util.Locale>) localeList47);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap52 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList53 = java.util.Locale.LanguageRange.parse("it", strMap52);
        languageRangeList53.clear();
        boolean boolean55 = languageRangeList8.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList53);
        languageRangeList8.clear();
        boolean boolean57 = languageRangeList1.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList8);
        java.util.Locale locale60 = new java.util.Locale("Francese", "Englisch");
        int int61 = languageRangeList8.lastIndexOf((java.lang.Object) locale60);
        int int62 = languageRangeList8.size();
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(languageRangeList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(languageRangeList8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(languageRangeArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "english" + "'", str18, "english");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Chine" + "'", str24, "Chine");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "zh-CN" + "'", str25, "zh-CN");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Chine" + "'", str28, "Chine");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Chine" + "'", str31, "Chine");
        org.junit.Assert.assertEquals(locale35.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Chine" + "'", str38, "Chine");
        org.junit.Assert.assertEquals(locale40.toString(), "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "ko");
        org.junit.Assert.assertEquals(locale44.toString(), "");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(localeList49);
        org.junit.Assert.assertNull(locale50);
        org.junit.Assert.assertNotNull(languageRangeList53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertEquals(locale60.toString(), "francese_ENGLISCH");
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
    }

    @Test
    public void test19718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19718");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "###############################EnglHI!STRING[]STRING[]SsHI!STRING[]STRING[]S", (java.lang.CharSequence) "                                                                                        jAPA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test19719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19719");
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
        languageRangeList73.clear();
        java.lang.String str78 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList73, "Locale.Builder[]stringstringstri");
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream79 = languageRangeList73.parallelStream();
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
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertNotNull(languageRangeStream79);
    }

    @Test
    public void test19720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19720");
        java.util.Locale locale1 = new java.util.Locale("");
        java.lang.String str2 = locale1.getDisplayLanguage();
        java.util.Locale locale3 = java.util.Locale.CANADA;
        java.lang.String str4 = locale3.getDisplayLanguage();
        java.lang.String str5 = locale1.getDisplayScript(locale3);
        boolean boolean6 = locale1.hasExtensions();
        java.lang.String str7 = locale1.getDisplayCountry();
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "anglais" + "'", str4, "anglais");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test19721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19721");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "rench(France");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test19722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19722");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.setLanguageTag("zh-CN");
        java.util.Locale.Builder builder5 = builder3.setLanguage("it");
        java.util.Locale.Builder builder6 = builder5.clear();
        java.util.Locale.Builder builder7 = builder6.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder7.removeUnicodeLocaleAttribute("                      #a#a#a#a#a");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute:                       #a#a#a#a#a [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test19723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19723");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("    cn                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test19724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19724");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "redliub.elacol");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test19725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19725");
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
        int int14 = languageRangeList10.size();
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor15 = languageRangeList10.listIterator();
        java.util.Locale.LanguageRange languageRange17 = new java.util.Locale.LanguageRange("a");
        java.util.Locale.LanguageRange languageRange19 = new java.util.Locale.LanguageRange("English");
        java.lang.String str21 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) languageRange19, "");
        java.util.Locale.LanguageRange languageRange23 = new java.util.Locale.LanguageRange("English");
        java.util.Locale.LanguageRange[] languageRangeArray24 = new java.util.Locale.LanguageRange[] { languageRange17, languageRange19, languageRange23 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList25 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList25, languageRangeArray24);
        boolean boolean27 = languageRangeList10.retainAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList25);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor28 = languageRangeList25.listIterator();
        boolean boolean29 = languageRangeItor28.hasNext();
        boolean boolean30 = languageRangeItor28.hasNext();
        java.util.Locale.LanguageRange languageRange31 = languageRangeItor28.next();
        int int32 = languageRangeList1.lastIndexOf((java.lang.Object) languageRange31);
        java.util.Locale.LanguageRange[] languageRangeArray34 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList35 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList35, languageRangeArray34);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap37 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList38 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList35, strMap37);
        int int39 = languageRangeList35.size();
        java.util.List<java.util.Locale.LanguageRange> languageRangeList41 = java.util.Locale.LanguageRange.parse("hi");
        boolean boolean43 = languageRangeList41.remove((java.lang.Object) "English");
        boolean boolean44 = languageRangeList35.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList41);
        java.lang.String[] strArray49 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("English", "hi", (int) (short) -1);
        java.lang.String[] strArray52 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("a", "");
        java.lang.String[] strArray53 = org.apache.commons.lang3.StringUtils.stripAll(strArray52);
        java.lang.String[] strArray54 = org.apache.commons.lang3.StringUtils.stripAll(strArray53);
        java.lang.String str55 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", strArray49, strArray53);
        boolean boolean56 = languageRangeList35.equals((java.lang.Object) strArray53);
        char[] charArray66 = new char[] { '#', '#', ' ' };
        boolean boolean67 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!", charArray66);
        boolean boolean68 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!", charArray66);
        boolean boolean69 = org.apache.commons.lang3.StringUtils.containsAny("China", charArray66);
        boolean boolean70 = org.apache.commons.lang3.StringUtils.containsAny("", charArray66);
        int int71 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "LOCLE.LNGUGERNGE", charArray66);
        int int72 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "chnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray66);
        boolean boolean73 = languageRangeList35.equals((java.lang.Object) charArray66);
        int int74 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "iiiiiiiiiiiiiiiiiiiiiiistringiiiiiiiiiiiiiiiiiiiiiii", charArray66);
        boolean boolean75 = languageRange31.equals((java.lang.Object) "iiiiiiiiiiiiiiiiiiiiiiistringiiiiiiiiiiiiiiiiiiiiiii");
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(languageRangeItor6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ArrayList" + "'", str8, "ArrayList");
        org.junit.Assert.assertNotNull(languageRangeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(languageRangeList13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(languageRangeItor15);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Locale.LanguageRange" + "'", str21, "Locale.LanguageRange");
        org.junit.Assert.assertNotNull(languageRangeArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(languageRangeItor28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(languageRange31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(languageRangeArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(languageRangeList38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(languageRangeList41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h" + "'", str55, "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(charArray66);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray66), "## ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray66), "## ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray66), "[#, #,  ]");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
    }

    @Test
    public void test19726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19726");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("latiarfati");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test19727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19727");
        java.util.Locale locale1 = java.util.Locale.CANADA;
        java.util.Set<java.lang.Character> charSet2 = locale1.getExtensionKeys();
        java.lang.String str3 = locale1.getISO3Country();
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.lowerCase("WT_hz", locale1);
        java.lang.String str5 = locale1.getScript();
        java.lang.Object obj6 = locale1.clone();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_CA");
        org.junit.Assert.assertNotNull(charSet2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CAN" + "'", str3, "CAN");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "wt_hz" + "'", str4, "wt_hz");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "en_CA");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "en_CA");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "en_CA");
    }

    @Test
    public void test19728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19728");
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
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream42 = languageRangeList1.parallelStream();
        java.util.Locale.LanguageRange[] languageRangeArray44 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList45 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList45, languageRangeArray44);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap47 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList48 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList45, strMap47);
        int int49 = languageRangeList45.size();
        java.util.List<java.util.Locale.LanguageRange> languageRangeList51 = java.util.Locale.LanguageRange.parse("hi");
        boolean boolean53 = languageRangeList51.remove((java.lang.Object) "English");
        boolean boolean54 = languageRangeList45.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList51);
        java.util.Locale.LanguageRange[] languageRangeArray55 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList56 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList56, languageRangeArray55);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap58 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList59 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList56, strMap58);
        int int60 = languageRangeList56.size();
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor61 = languageRangeList56.listIterator();
        java.util.Locale.LanguageRange languageRange63 = new java.util.Locale.LanguageRange("a");
        java.util.Locale.LanguageRange languageRange65 = new java.util.Locale.LanguageRange("English");
        java.lang.String str67 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) languageRange65, "");
        java.util.Locale.LanguageRange languageRange69 = new java.util.Locale.LanguageRange("English");
        java.util.Locale.LanguageRange[] languageRangeArray70 = new java.util.Locale.LanguageRange[] { languageRange63, languageRange65, languageRange69 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList71 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList71, languageRangeArray70);
        boolean boolean73 = languageRangeList56.retainAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList71);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor74 = languageRangeList71.listIterator();
        java.util.Locale.LanguageRange languageRange75 = languageRangeItor74.next();
        java.util.Locale.LanguageRange languageRange76 = languageRangeItor74.next();
        boolean boolean77 = languageRangeList45.add(languageRange76);
        double double78 = languageRange76.getWeight();
        double double79 = languageRange76.getWeight();
        // The following exception was thrown during execution in test generation
        try {
            languageRangeList1.add(209, languageRange76);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 209, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertEquals(locale14.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Chine" + "'", str15, "Chine");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "zh-CN" + "'", str16, "zh-CN");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Chine" + "'", str19, "Chine");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Chine" + "'", str22, "Chine");
        org.junit.Assert.assertEquals(locale26.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Chine" + "'", str29, "Chine");
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
        org.junit.Assert.assertNotNull(languageRangeStream42);
        org.junit.Assert.assertNotNull(languageRangeArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(languageRangeList48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(languageRangeList51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(languageRangeArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(languageRangeList59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(languageRangeItor61);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "Locale.LanguageRange" + "'", str67, "Locale.LanguageRange");
        org.junit.Assert.assertNotNull(languageRangeArray70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(languageRangeItor74);
        org.junit.Assert.assertNotNull(languageRange75);
        org.junit.Assert.assertNotNull(languageRange76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 1.0d + "'", double78 == 1.0d);
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + 1.0d + "'", double79 == 1.0d);
    }

    @Test
    public void test19729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19729");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("HindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindi", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test19730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19730");
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
        java.lang.Object[] objArray28 = languageRangeList13.toArray();
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor30 = languageRangeList13.listIterator(0);
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
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(languageRangeItor30);
    }

    @Test
    public void test19731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19731");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("444444444444444444444444444444444444CHN     ", 24);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444444444444444CHN     " + "'", str2, "444444444444444444444444444444444444CHN     ");
    }

    @Test
    public void test19732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19732");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("asaavaayaazabaabeabgabhabiabmabnaboabrabsacaaceachacoacracsacuacvacyadaadeadvadzaeeaelaenaeoaesaetaeuafaaffafiafjafoafrafyagaagdaglagnaguagvahaaheahiahoahrahtahuahyahzaiaaidaieaigaiiaikainaioaisaitaiuaiwajaajiajvakaakgakiakjakkaklakmaknakoakraksakuakvakwakyalaalbalgalialnaloaltalualvamgamhamiamkamlamnamoamramsamtamyanaanband", 120, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "asaavaayaazabaabeabgabhabiabmabnaboabrabsacaaceachacoacracsacuacvacyadaadeadvadzaeeaelaenaeoaesaetaeuafaaffafiafjafoafrafyagaagdaglagnaguagvahaaheahiahoahrahtahuahyahzaiaaidaieaigaiiaikainaioaisaitaiuaiwajaajiajvakaakgakiakjakkaklakmaknakoakraksakuakvakwakyalaalbalgalialnaloaltalualvamgamhamiamkamlamnamoamramsamtamyanaanband" + "'", str3, "asaavaayaazabaabeabgabhabiabmabnaboabrabsacaaceachacoacracsacuacvacyadaadeadvadzaeeaelaenaeoaesaetaeuafaaffafiafjafoafrafyagaagdaglagnaguagvahaaheahiahoahrahtahuahyahzaiaaidaieaigaiiaikainaioaisaitaiuaiwajaajiajvakaakgakiakjakkaklakmaknakoakraksakuakvakwakyalaalbalgalialnaloaltalualvamgamhamiamkamlamnamoamramsamtamyanaanband");
    }

    @Test
    public void test19733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19733");
        char[] charArray7 = new char[] {};
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "zh-CN", charArray7);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "a", charArray7);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "  China   ", charArray7);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                 a                  ", charArray7);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\u4e2d\u56fd", charArray7);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "CINAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXLocale.FilteringModeCINAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXLocale.FilteringModeCINAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXLocale.FilteringModeCINAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXLocale.FilteringModeCINAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXLocale.FilteringModeCINAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXLocale.FilteringModeCINAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXLocale.FilteringModeCINAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXLocale.FilteringModeCINAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXLocale.FilteringModeCINAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXLocale.FilteringModeCINAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXLocale.FilteringModeCINAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXLocale.FilteringModeCINAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXLocale.FilteringModeCINAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXLocale.FilteringModeCINAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXLocale.FilteringModeCINAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXLocale.FilteringModeCINAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXLocale.FilteringModeCINAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test19734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19734");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale.Builder builder3 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder4 = builder1.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder4.addUnicodeLocaleAttribute("                                                                                       ESE(TAIWAN");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute:                                                                                        ESE(TAIWAN [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test19735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19735");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("STRING[]", "                                                                  xxxxxxxxxxFrench(France)xxxxxxxxxx", (int) (byte) 10);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test19736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19736");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("INGLESE (CANADA)_FR_FR_$", "nenglis", 279);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "INGLESE (CANADA)_FR_FR_$" + "'", str4, "INGLESE (CANADA)_FR_FR_$");
    }

    @Test
    public void test19737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19737");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("EN_cauuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "A#a#a#a#a#", 42);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test19738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19738");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "cn (italianojajajajajajajajajajajajajaj)", (java.lang.CharSequence) " zH  ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test19739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19739");
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
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap25 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList26 = java.util.Locale.LanguageRange.parse("it", strMap25);
        java.lang.String str28 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList26, '#');
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap29 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList30 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList26, strMap29);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap32 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList33 = java.util.Locale.LanguageRange.parse("Cina", strMap32);
        java.lang.String[] strArray37 = new java.lang.String[] { "aiaiaiaiaiaiaiaiaia", "zh-CN", "China" };
        java.util.ArrayList<java.lang.String> strList38 = new java.util.ArrayList<java.lang.String>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList38, strArray37);
        java.util.Locale.FilteringMode filteringMode40 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList41 = java.util.Locale.filterTags(languageRangeList33, (java.util.Collection<java.lang.String>) strList38, filteringMode40);
        boolean boolean42 = languageRangeList26.contains((java.lang.Object) strList38);
        boolean boolean43 = languageRangeList26.isEmpty();
        java.util.Spliterator<java.util.Locale.LanguageRange> languageRangeSpliterator44 = languageRangeList26.spliterator();
        boolean boolean45 = languageRangeList11.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList26);
        java.util.Locale.LanguageRange[] languageRangeArray46 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList47 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList47, languageRangeArray46);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap49 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList50 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList47, strMap49);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream51 = languageRangeList47.stream();
        boolean boolean52 = languageRangeList47.isEmpty();
        java.util.Locale.LanguageRange[] languageRangeArray53 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList54 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList54, languageRangeArray53);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap56 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList57 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList54, strMap56);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor58 = languageRangeList57.listIterator();
        boolean boolean59 = languageRangeList47.retainAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList57);
        java.util.Locale.LanguageRange[] languageRangeArray60 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList61 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList61, languageRangeArray60);
        java.util.Locale locale64 = java.util.Locale.FRANCE;
        java.lang.String str65 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale64);
        java.util.Locale locale66 = java.util.Locale.US;
        java.util.Locale locale67 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale68 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale69 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale70 = java.util.Locale.getDefault();
        java.lang.String str71 = locale69.getDisplayCountry(locale70);
        java.lang.String str72 = locale69.toLanguageTag();
        java.util.Locale locale73 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale74 = java.util.Locale.getDefault();
        java.lang.String str75 = locale73.getDisplayCountry(locale74);
        java.util.Locale locale76 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale77 = java.util.Locale.getDefault();
        java.lang.String str78 = locale76.getDisplayCountry(locale77);
        java.util.Locale locale82 = new java.util.Locale("hi", "hi!", "cHINA");
        java.util.Locale locale83 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale84 = java.util.Locale.getDefault();
        java.lang.String str85 = locale83.getDisplayCountry(locale84);
        java.util.Locale locale87 = new java.util.Locale("");
        java.lang.String str88 = locale87.getDisplayVariant();
        java.util.Locale locale89 = java.util.Locale.KOREAN;
        java.util.Locale locale91 = new java.util.Locale("");
        java.util.Locale locale92 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale[] localeArray93 = new java.util.Locale[] { locale64, locale66, locale67, locale68, locale69, locale74, locale76, locale82, locale84, locale87, locale89, locale91, locale92 };
        java.util.ArrayList<java.util.Locale> localeList94 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean95 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList94, localeArray93);
        java.util.List<java.util.Locale> localeList96 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList61, (java.util.Collection<java.util.Locale>) localeList94);
        java.util.Locale.FilteringMode filteringMode97 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList98 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList47, (java.util.Collection<java.util.Locale>) localeList94, filteringMode97);
        java.util.Locale locale99 = java.util.Locale.lookup(languageRangeList26, (java.util.Collection<java.util.Locale>) localeList98);
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
        org.junit.Assert.assertNotNull(languageRangeList26);
        org.junit.Assert.assertNotNull(languageRangeList30);
        org.junit.Assert.assertNotNull(languageRangeList33);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + filteringMode40 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode40.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(languageRangeSpliterator44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(languageRangeArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(languageRangeList50);
        org.junit.Assert.assertNotNull(languageRangeStream51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(languageRangeArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(languageRangeList57);
        org.junit.Assert.assertNotNull(languageRangeItor58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(languageRangeArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(locale64);
        org.junit.Assert.assertEquals(locale64.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "english" + "'", str65, "english");
        org.junit.Assert.assertNotNull(locale66);
        org.junit.Assert.assertEquals(locale66.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale67);
        org.junit.Assert.assertEquals(locale67.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale68);
        org.junit.Assert.assertEquals(locale68.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale69);
        org.junit.Assert.assertEquals(locale69.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale70);
        org.junit.Assert.assertEquals(locale70.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "Chine" + "'", str71, "Chine");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "zh-CN" + "'", str72, "zh-CN");
        org.junit.Assert.assertNotNull(locale73);
        org.junit.Assert.assertEquals(locale73.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale74);
        org.junit.Assert.assertEquals(locale74.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "Chine" + "'", str75, "Chine");
        org.junit.Assert.assertNotNull(locale76);
        org.junit.Assert.assertEquals(locale76.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale77);
        org.junit.Assert.assertEquals(locale77.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "Chine" + "'", str78, "Chine");
        org.junit.Assert.assertEquals(locale82.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale83);
        org.junit.Assert.assertEquals(locale83.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale84);
        org.junit.Assert.assertEquals(locale84.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "Chine" + "'", str85, "Chine");
        org.junit.Assert.assertEquals(locale87.toString(), "");
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "" + "'", str88, "");
        org.junit.Assert.assertNotNull(locale89);
        org.junit.Assert.assertEquals(locale89.toString(), "ko");
        org.junit.Assert.assertEquals(locale91.toString(), "");
        org.junit.Assert.assertNotNull(locale92);
        org.junit.Assert.assertEquals(locale92.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray93);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + true + "'", boolean95 == true);
        org.junit.Assert.assertNotNull(localeList96);
        org.junit.Assert.assertTrue("'" + filteringMode97 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode97.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList98);
        org.junit.Assert.assertNull(locale99);
    }

    @Test
    public void test19740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19740");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.lang.String str1 = locale0.getDisplayLanguage();
        java.util.Locale.setDefault(locale0);
        java.lang.String str3 = locale0.getScript();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "italien" + "'", str1, "italien");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test19741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19741");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("I!HchinaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaI!HchinaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaI!H", 528, 44);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaI!H" + "'", str3, "...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaI!H");
    }

    @Test
    public void test19742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19742");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("REFERENCEPIPELINE.HEAD                        list###########                                 ", "FR-CA", "                    java                    ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "REFERENCEPIPELINE.HEAD                        list###########                                 " + "'", str3, "REFERENCEPIPELINE.HEAD                        list###########                                 ");
    }

    @Test
    public void test19743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19743");
        java.util.Locale locale1 = new java.util.Locale("LOCLE.LNGUGERNGE");
        boolean boolean2 = locale1.hasExtensions();
        boolean boolean3 = locale1.hasExtensions();
        java.util.Locale locale4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = locale1.getDisplayName(locale4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale1.toString(), "locle.lngugernge");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test19744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19744");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", '.');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test19745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19745");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("wt_hz");
        java.util.Locale locale2 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale3 = java.util.Locale.getDefault();
        java.lang.String str4 = locale2.getDisplayCountry(locale3);
        java.lang.String str5 = locale2.toLanguageTag();
        java.lang.String str6 = locale2.getLanguage();
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
        java.util.Locale locale19 = java.util.Locale.GERMAN;
        java.lang.String str20 = locale9.getDisplayLanguage(locale19);
        java.lang.String str21 = locale2.getDisplayCountry(locale9);
        java.lang.String str22 = locale9.getCountry();
        java.util.Locale locale26 = new java.util.Locale("....english", "zhcinesese", ".");
        java.lang.String str27 = locale9.getDisplayName(locale26);
        java.lang.String str28 = locale9.getLanguage();
        java.lang.String str29 = locale1.getDisplayVariant(locale9);
        java.util.Locale locale32 = new java.util.Locale("unduhar[]undu", "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuItali");
        java.lang.String str33 = locale9.getDisplayLanguage(locale32);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "it");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Cina" + "'", str4, "Cina");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "zh-CN" + "'", str5, "zh-CN");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "zh" + "'", str6, "zh");
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
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "de");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "China" + "'", str21, "China");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals(locale26.toString(), "....english_ZHCINESESE_.");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals(locale32.toString(), "unduhar[]undu_UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUITALI");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
    }

    @Test
    public void test19746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19746");
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
        java.util.Locale locale12 = new java.util.Locale("");
        java.util.Set<java.lang.String> strSet13 = locale12.getUnicodeLocaleKeys();
        java.lang.String str14 = locale12.getDisplayName();
        java.util.Locale.Builder builder15 = builder10.setLocale(locale12);
        java.util.Set<java.lang.String> strSet16 = locale12.getUnicodeLocaleKeys();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "it");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cina" + "'", str5, "Cina");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "zh-CN" + "'", str6, "zh-CN");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Cina" + "'", str8, "Cina");
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(strSet16);
    }

    @Test
    public void test19747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19747");
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
        int int31 = languageRangeList1.size();
        java.util.Locale.Category category32 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale36 = new java.util.Locale("       hi!", "LOCALE#LANGUAGERANGE", "\u65e5\u6587");
        java.util.Locale locale37 = java.util.Locale.CANADA;
        java.util.Set<java.lang.String> strSet38 = locale37.getUnicodeLocaleAttributes();
        java.util.Locale locale40 = java.util.Locale.FRANCE;
        java.lang.String str41 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale40);
        java.lang.String str42 = locale37.getDisplayCountry(locale40);
        java.lang.String str43 = locale36.getDisplayVariant(locale40);
        java.util.Locale.setDefault(category32, locale40);
        java.util.Locale locale45 = java.util.Locale.getDefault(category32);
        java.lang.String str47 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) category32, "java.langfr_FR");
        boolean boolean48 = languageRangeList1.contains((java.lang.Object) str47);
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
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2 + "'", int31 == 2);
        org.junit.Assert.assertTrue("'" + category32 + "' != '" + java.util.Locale.Category.FORMAT + "'", category32.equals(java.util.Locale.Category.FORMAT));
// flaky:         org.junit.Assert.assertEquals(locale36.toString(), "\u65e5\u6587");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "en_CA");
        org.junit.Assert.assertNotNull(strSet38);
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "english" + "'", str41, "english");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Canada" + "'", str42, "Canada");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "\u65e5\u6587" + "'", str43, "\u65e5\u6587");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "java.util" + "'", str47, "java.util");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test19748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19748");
        java.util.Locale locale3 = new java.util.Locale("zho", "US");
        java.util.Locale locale4 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str5 = locale3.getDisplayVariant(locale4);
        java.lang.String str6 = locale4.getVariant();
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.upperCase("AD.AE.AF.AG.AI.AL.AM.AN.AO.AQ.AR.AS.AT.AU.AW.AX.AZ.BA.BB.BD.BE.BF.BG.BH.BI.BJ.BL.BM.BN.BO.BQ.BR.BS.BT.BV.BW.BY.BZ.CA.CC.CD.CF.CG.CH.CI.CK.CL.CM.CN.CO.CR.CU.CV.CW.CX.CY.CZ.DE.DJ.DK.DM.DO.DZ.EC.EE.EG.EH.ER.ES.ET.FI.FJ.FK.FM.FO.FR.GA.GB.GD.GE.GF.GG.GH.GI.GL.GM.GN.GP.GQ.GR.GS.GT.GU.GW.GY.HK.HM.HN.HR.HT.HU.ID.IE.IL.IM.IN.IO.IQ.IR.IS.IT.JE.JM.JO.JP.KE.KG.KH.KI.KM.KN.KP.KR.KW.KY.KZ.LA.LB.LC.LI.LK.LR.LS.LT.LU.LV.LY.MA.MC.MD.ME.MF.MG.MH.MK.ML.MM.MN.MO.MP.MQ.MR.MS.MT.MU.MV.MW.MX.MY.MZ.NA.NC.NE.NF.NG.NI.NL.NO.NP.NR.NU.NZ.OM.PA.PE.PF.PG.PH.PK.PL.PM.PN.PR.PS.PT.PW.PY.QA.RE.RO.RS.RU.RW.SA.SB.SC.SD.SE.SG.SH.SI.SJ.SK.SL.SM.SN.SO.SR.SS.ST.SV.SX.SY.SZ.TC.TD.TF.TG.TH.TJ.TK.TL.TM.TN.TO.TR.TT.TV.TW.TZ.UA.UG.UM.US.UY.UZ.VA.VC.VE.VG.VI.VN.VU.WF.WS.YE.YT.ZA.ZM.ZW", locale4);
        java.lang.String str8 = locale4.getCountry();
        java.lang.String str9 = locale4.getScript();
        java.lang.String str10 = locale4.getDisplayVariant();
        java.lang.String str11 = locale4.getDisplayVariant();
        java.lang.String str12 = locale4.getISO3Language();
        org.junit.Assert.assertEquals(locale3.toString(), "zho_US");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AD.AE.AF.AG.AI.AL.AM.AN.AO.AQ.AR.AS.AT.AU.AW.AX.AZ.BA.BB.BD.BE.BF.BG.BH.BI.BJ.BL.BM.BN.BO.BQ.BR.BS.BT.BV.BW.BY.BZ.CA.CC.CD.CF.CG.CH.CI.CK.CL.CM.CN.CO.CR.CU.CV.CW.CX.CY.CZ.DE.DJ.DK.DM.DO.DZ.EC.EE.EG.EH.ER.ES.ET.FI.FJ.FK.FM.FO.FR.GA.GB.GD.GE.GF.GG.GH.GI.GL.GM.GN.GP.GQ.GR.GS.GT.GU.GW.GY.HK.HM.HN.HR.HT.HU.ID.IE.IL.IM.IN.IO.IQ.IR.IS.IT.JE.JM.JO.JP.KE.KG.KH.KI.KM.KN.KP.KR.KW.KY.KZ.LA.LB.LC.LI.LK.LR.LS.LT.LU.LV.LY.MA.MC.MD.ME.MF.MG.MH.MK.ML.MM.MN.MO.MP.MQ.MR.MS.MT.MU.MV.MW.MX.MY.MZ.NA.NC.NE.NF.NG.NI.NL.NO.NP.NR.NU.NZ.OM.PA.PE.PF.PG.PH.PK.PL.PM.PN.PR.PS.PT.PW.PY.QA.RE.RO.RS.RU.RW.SA.SB.SC.SD.SE.SG.SH.SI.SJ.SK.SL.SM.SN.SO.SR.SS.ST.SV.SX.SY.SZ.TC.TD.TF.TG.TH.TJ.TK.TL.TM.TN.TO.TR.TT.TV.TW.TZ.UA.UG.UM.US.UY.UZ.VA.VC.VE.VG.VI.VN.VU.WF.WS.YE.YT.ZA.ZM.ZW" + "'", str7, "AD.AE.AF.AG.AI.AL.AM.AN.AO.AQ.AR.AS.AT.AU.AW.AX.AZ.BA.BB.BD.BE.BF.BG.BH.BI.BJ.BL.BM.BN.BO.BQ.BR.BS.BT.BV.BW.BY.BZ.CA.CC.CD.CF.CG.CH.CI.CK.CL.CM.CN.CO.CR.CU.CV.CW.CX.CY.CZ.DE.DJ.DK.DM.DO.DZ.EC.EE.EG.EH.ER.ES.ET.FI.FJ.FK.FM.FO.FR.GA.GB.GD.GE.GF.GG.GH.GI.GL.GM.GN.GP.GQ.GR.GS.GT.GU.GW.GY.HK.HM.HN.HR.HT.HU.ID.IE.IL.IM.IN.IO.IQ.IR.IS.IT.JE.JM.JO.JP.KE.KG.KH.KI.KM.KN.KP.KR.KW.KY.KZ.LA.LB.LC.LI.LK.LR.LS.LT.LU.LV.LY.MA.MC.MD.ME.MF.MG.MH.MK.ML.MM.MN.MO.MP.MQ.MR.MS.MT.MU.MV.MW.MX.MY.MZ.NA.NC.NE.NF.NG.NI.NL.NO.NP.NR.NU.NZ.OM.PA.PE.PF.PG.PH.PK.PL.PM.PN.PR.PS.PT.PW.PY.QA.RE.RO.RS.RU.RW.SA.SB.SC.SD.SE.SG.SH.SI.SJ.SK.SL.SM.SN.SO.SR.SS.ST.SV.SX.SY.SZ.TC.TD.TF.TG.TH.TJ.TK.TL.TM.TN.TO.TR.TT.TV.TW.TZ.UA.UG.UM.US.UY.UZ.VA.VC.VE.VG.VI.VN.VU.WF.WS.YE.YT.ZA.ZM.ZW");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CA" + "'", str8, "CA");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "fra" + "'", str12, "fra");
    }

    @Test
    public void test19749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19749");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("$English (Canada)(JAVA.LANG)", 21);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test19750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19750");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("cnn                                                                                                ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "cnn" + "'", str1, "cnn");
    }

    @Test
    public void test19751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19751");
        java.util.Locale locale2 = new java.util.Locale("   Z", "Anzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAn");
        org.junit.Assert.assertEquals(locale2.toString(), "   z_ANZH_TWANZH_TWANZH_TWANZH_TWANZH_TWANZH_TWANZH_TWANZH_TWANZH_TWANZH_TWANZH_TWANZH_TWANZH_TWANZH_TWANZH_TWANZH_TWANZH_TWANZH_TWANZH_TWANZH_TWANZH_TWANZH_TWANZH_TWANZH_TWANZH_TWANZH_TWANZH_TWANZH_TWANZH_TWANZH_TWANZH_TWANZH_TWANZH_TWANZH_TWANZH_TWANZH_TWANZH_TWANZH_TWANZH_TWANZH_TWANZH_TWANZH_TWANZH_TWANZH_TWANZH_TWANZH_TWANZH_TWANZH_TWANZH_TWANZH_TWANZH_TWANZH_TWANZH_TWANZH_TWANZH_TWANZH_TWANZH_TWANZH_TWANZH_TWANZH_TWANZH_TWANZH_TWANZH_TWANZH_TWANZH_TWANZH_TWANZH_TWANZH_TWANZH_TWANZH_TWANZH_TWANZH_TWANZH_TWANZH_TWANZH_TWANZH_TWANZH_TWANZH_TWANZH_TWANZH_TWANZH_TWANZH_TWANZH_TWANZH_TWANZH_TWANZH_TWANZH_TWANZH_TWANZH_TWANZH_TWANZH_TWANZH_TWANZH_TWANZH_TWANZH_TWANZH_TWAN");
    }

    @Test
    public void test19752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19752");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("taiwan", "java.uHAR[].............................................................................................il", 44);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test19753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19753");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("enghI", "            )ANIHc,!IH(idni            )ANIHc,!IH(idni            )ANIHc,!IH(idni            )ANIHc,!IH(idni            )ANIHc,!IH(idni            )ANIHc,!IH(idni            )ANIHc,!IH(idni            )ANIHc,!IH(idni            )ANIHc,!IH(idni            )ANIHc,!IH(idni            )ANIHc,!IH(idni            )ANIHc,!IH(idni");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test19754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19754");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("rrayList", "fch", 698);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test19755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19755");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("ESE (tAIWAN", "LOCALE#LANGUAGERANGE", 350);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test19756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19756");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setScript("");
        java.util.Locale.Builder builder4 = builder2.setLanguage("HI");
        java.util.Locale locale5 = builder4.build();
        java.util.Locale locale6 = builder4.build();
        java.lang.String str8 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) builder4, "\u4e2d\u6587 (ZH)");
        java.util.Locale.Builder builder9 = builder4.clear();
        java.util.Locale.Builder builder10 = builder4.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder13 = builder4.setExtension(' ', "...X.AZ.BA.BB.BD.BE.BF.BG.BH.BI.BJ.BL.BM.BN..._italiano");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key:   [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "hi");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "hi");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Locale.Builder" + "'", str8, "Locale.Builder");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test19757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19757");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("                                           ITALIAHi", "IAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                           ITALIAHi" + "'", str2, "                                           ITALIAHi");
    }

    @Test
    public void test19758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19758");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("                                                                                            ##_#A");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=                                                                                            ##_#a");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test19759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19759");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("XXXXXXXXXXFRENCH(FRANCE)XXXXXXXXXXzh_TWXXXXXXXXXXFRENCH(FRANCE)XXXXXXXXXXzh_TWXXXXXXXXXXFRENCH(FRANCE)XXXXXXXXXXzh_TWXXXXXXXXXXFRENCH(FRANCE)XXXXXXXXXXzh_TWXXXXXXXXXXFRENCH(FRANCE)XXXXXXXXXXzh_TWXXXXXXXXXXFRENCH(FRANCE)XXXXXXXXXXzh_TWXXXXXXXXXXFRENCH(FRANCE)XXXXXXXXXXzh_TWXXXXXXXXXXFRENCH(FRANCE)XXXXXXXXXX", 6);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test19760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19760");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("elacoLelacoLelacoLelacoLelacoL", "rg  cn    United Kingdom  cn    United Kingd");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test19761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19761");
        java.util.Locale locale3 = new java.util.Locale("zho", "US");
        java.util.Locale locale4 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str5 = locale3.getDisplayVariant(locale4);
        java.lang.String str6 = locale4.getVariant();
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.upperCase("AD.AE.AF.AG.AI.AL.AM.AN.AO.AQ.AR.AS.AT.AU.AW.AX.AZ.BA.BB.BD.BE.BF.BG.BH.BI.BJ.BL.BM.BN.BO.BQ.BR.BS.BT.BV.BW.BY.BZ.CA.CC.CD.CF.CG.CH.CI.CK.CL.CM.CN.CO.CR.CU.CV.CW.CX.CY.CZ.DE.DJ.DK.DM.DO.DZ.EC.EE.EG.EH.ER.ES.ET.FI.FJ.FK.FM.FO.FR.GA.GB.GD.GE.GF.GG.GH.GI.GL.GM.GN.GP.GQ.GR.GS.GT.GU.GW.GY.HK.HM.HN.HR.HT.HU.ID.IE.IL.IM.IN.IO.IQ.IR.IS.IT.JE.JM.JO.JP.KE.KG.KH.KI.KM.KN.KP.KR.KW.KY.KZ.LA.LB.LC.LI.LK.LR.LS.LT.LU.LV.LY.MA.MC.MD.ME.MF.MG.MH.MK.ML.MM.MN.MO.MP.MQ.MR.MS.MT.MU.MV.MW.MX.MY.MZ.NA.NC.NE.NF.NG.NI.NL.NO.NP.NR.NU.NZ.OM.PA.PE.PF.PG.PH.PK.PL.PM.PN.PR.PS.PT.PW.PY.QA.RE.RO.RS.RU.RW.SA.SB.SC.SD.SE.SG.SH.SI.SJ.SK.SL.SM.SN.SO.SR.SS.ST.SV.SX.SY.SZ.TC.TD.TF.TG.TH.TJ.TK.TL.TM.TN.TO.TR.TT.TV.TW.TZ.UA.UG.UM.US.UY.UZ.VA.VC.VE.VG.VI.VN.VU.WF.WS.YE.YT.ZA.ZM.ZW", locale4);
        java.lang.String str8 = locale4.getDisplayScript();
        java.util.Locale locale9 = locale4.stripExtensions();
        java.util.Locale locale12 = new java.util.Locale("italiano", "Ci_a");
        java.util.Locale locale16 = new java.util.Locale("Canada", "allemand", "cHINA");
        java.lang.String str17 = locale12.getDisplayName(locale16);
        java.util.Set<java.lang.String> strSet18 = locale16.getUnicodeLocaleAttributes();
        java.util.Locale.setDefault(locale16);
        java.lang.String str20 = locale9.getDisplayName(locale16);
        org.junit.Assert.assertEquals(locale3.toString(), "zho_US");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AD.AE.AF.AG.AI.AL.AM.AN.AO.AQ.AR.AS.AT.AU.AW.AX.AZ.BA.BB.BD.BE.BF.BG.BH.BI.BJ.BL.BM.BN.BO.BQ.BR.BS.BT.BV.BW.BY.BZ.CA.CC.CD.CF.CG.CH.CI.CK.CL.CM.CN.CO.CR.CU.CV.CW.CX.CY.CZ.DE.DJ.DK.DM.DO.DZ.EC.EE.EG.EH.ER.ES.ET.FI.FJ.FK.FM.FO.FR.GA.GB.GD.GE.GF.GG.GH.GI.GL.GM.GN.GP.GQ.GR.GS.GT.GU.GW.GY.HK.HM.HN.HR.HT.HU.ID.IE.IL.IM.IN.IO.IQ.IR.IS.IT.JE.JM.JO.JP.KE.KG.KH.KI.KM.KN.KP.KR.KW.KY.KZ.LA.LB.LC.LI.LK.LR.LS.LT.LU.LV.LY.MA.MC.MD.ME.MF.MG.MH.MK.ML.MM.MN.MO.MP.MQ.MR.MS.MT.MU.MV.MW.MX.MY.MZ.NA.NC.NE.NF.NG.NI.NL.NO.NP.NR.NU.NZ.OM.PA.PE.PF.PG.PH.PK.PL.PM.PN.PR.PS.PT.PW.PY.QA.RE.RO.RS.RU.RW.SA.SB.SC.SD.SE.SG.SH.SI.SJ.SK.SL.SM.SN.SO.SR.SS.ST.SV.SX.SY.SZ.TC.TD.TF.TG.TH.TJ.TK.TL.TM.TN.TO.TR.TT.TV.TW.TZ.UA.UG.UM.US.UY.UZ.VA.VC.VE.VG.VI.VN.VU.WF.WS.YE.YT.ZA.ZM.ZW" + "'", str7, "AD.AE.AF.AG.AI.AL.AM.AN.AO.AQ.AR.AS.AT.AU.AW.AX.AZ.BA.BB.BD.BE.BF.BG.BH.BI.BJ.BL.BM.BN.BO.BQ.BR.BS.BT.BV.BW.BY.BZ.CA.CC.CD.CF.CG.CH.CI.CK.CL.CM.CN.CO.CR.CU.CV.CW.CX.CY.CZ.DE.DJ.DK.DM.DO.DZ.EC.EE.EG.EH.ER.ES.ET.FI.FJ.FK.FM.FO.FR.GA.GB.GD.GE.GF.GG.GH.GI.GL.GM.GN.GP.GQ.GR.GS.GT.GU.GW.GY.HK.HM.HN.HR.HT.HU.ID.IE.IL.IM.IN.IO.IQ.IR.IS.IT.JE.JM.JO.JP.KE.KG.KH.KI.KM.KN.KP.KR.KW.KY.KZ.LA.LB.LC.LI.LK.LR.LS.LT.LU.LV.LY.MA.MC.MD.ME.MF.MG.MH.MK.ML.MM.MN.MO.MP.MQ.MR.MS.MT.MU.MV.MW.MX.MY.MZ.NA.NC.NE.NF.NG.NI.NL.NO.NP.NR.NU.NZ.OM.PA.PE.PF.PG.PH.PK.PL.PM.PN.PR.PS.PT.PW.PY.QA.RE.RO.RS.RU.RW.SA.SB.SC.SD.SE.SG.SH.SI.SJ.SK.SL.SM.SN.SO.SR.SS.ST.SV.SX.SY.SZ.TC.TD.TF.TG.TH.TJ.TK.TL.TM.TN.TO.TR.TT.TV.TW.TZ.UA.UG.UM.US.UY.UZ.VA.VC.VE.VG.VI.VN.VU.WF.WS.YE.YT.ZA.ZM.ZW");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr_CA");
        org.junit.Assert.assertEquals(locale12.toString(), "italiano_CI_A");
        org.junit.Assert.assertEquals(locale16.toString(), "canada_ALLEMAND_cHINA");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "italiano (CI_A)" + "'", str17, "italiano (CI_A)");
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "French (Canada)" + "'", str20, "French (Canada)");
    }

    @Test
    public void test19762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19762");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd)" + "'", str1, "\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd)");
    }

    @Test
    public void test19763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19763");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)Character");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)Character" + "'", str1, "CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)Character");
    }

    @Test
    public void test19764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19764");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "HAR[].............................................................................................");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test19765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19765");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                                                                                                    ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test19766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19766");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("  cn    ", "Collections");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test19767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19767");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("inglese", 94, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444inglese" + "'", str3, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444inglese");
    }

    @Test
    public void test19768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19768");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("alc");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "alc" + "'", str1, "alc");
    }

    @Test
    public void test19769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19769");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("                                   ", "###################################German");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                   " + "'", str2, "                                   ");
    }

    @Test
    public void test19770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19770");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("WT_hz", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            italiahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIital...", "xxxxxxx");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "WT_hz" + "'", str3, "WT_hz");
    }

    @Test
    public void test19771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19771");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "444444444444444444444444444444444444CHN     ", "             AN       A");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test19772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19772");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("               fr_CA                          ", "ahpanesexxxxxxxxxxxxxxah");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test19773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19773");
        java.util.Locale locale0 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale1 = java.util.Locale.getDefault();
        java.lang.String str2 = locale0.getDisplayCountry(locale1);
        java.lang.String str3 = locale0.toLanguageTag();
        boolean boolean4 = locale0.hasExtensions();
        java.lang.String str5 = locale0.getDisplayCountry();
        java.util.Set<java.lang.String> strSet6 = locale0.getUnicodeLocaleKeys();
        java.lang.String str7 = locale0.getScript();
        java.util.Locale locale8 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale9 = java.util.Locale.getDefault();
        java.lang.String str10 = locale8.getDisplayCountry(locale9);
        java.lang.String str11 = locale8.toLanguageTag();
        java.lang.String str12 = locale8.getLanguage();
        java.util.Locale locale13 = java.util.Locale.ITALIAN;
        java.util.Locale locale15 = new java.util.Locale("");
        java.lang.String str16 = locale15.getDisplayLanguage();
        java.util.Locale locale17 = java.util.Locale.CANADA;
        java.lang.String str18 = locale17.getDisplayLanguage();
        java.lang.String str19 = locale15.getDisplayScript(locale17);
        java.util.Locale locale21 = java.util.Locale.FRANCE;
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale21);
        java.lang.String str23 = locale15.getDisplayCountry(locale21);
        java.lang.String str24 = locale13.getDisplayScript(locale15);
        java.util.Locale locale25 = java.util.Locale.GERMAN;
        java.lang.String str26 = locale15.getDisplayLanguage(locale25);
        java.lang.String str27 = locale8.getDisplayCountry(locale15);
        java.lang.String str28 = locale15.getCountry();
        java.util.Locale locale32 = new java.util.Locale("....english", "zhcinesese", ".");
        java.lang.String str33 = locale15.getDisplayName(locale32);
        java.lang.String str34 = locale15.getDisplayName();
        java.util.Locale locale35 = java.util.Locale.KOREA;
        java.util.Set<java.lang.String> strSet36 = locale35.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.String> strSet37 = locale35.getUnicodeLocaleAttributes();
        java.lang.String str38 = locale15.getDisplayLanguage(locale35);
        java.lang.String str39 = locale0.getDisplayCountry(locale35);
        java.lang.String str40 = locale0.getISO3Country();
        boolean boolean42 = locale0.equals((java.lang.Object) "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444ITA");
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale1);
// flaky:         org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u4e2d\u56fd" + "'", str2, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zh-CN" + "'", str3, "zh-CN");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u4e2d\u56fd" + "'", str5, "\u4e2d\u56fd");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale9);
// flaky:         org.junit.Assert.assertEquals(locale9.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\u4e2d\u56fd" + "'", str10, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "zh-CN" + "'", str11, "zh-CN");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "zh" + "'", str12, "zh");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "it");
        org.junit.Assert.assertEquals(locale15.toString(), "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "en_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\u82f1\u6587" + "'", str18, "\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "english" + "'", str22, "english");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "de");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "China" + "'", str27, "China");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals(locale32.toString(), "....english_ZHCINESESE_.");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(strSet36);
        org.junit.Assert.assertNotNull(strSet37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "\uc911\uad6d" + "'", str39, "\uc911\uad6d");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "CHN" + "'", str40, "CHN");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test19774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19774");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("Hindi");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test19775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19775");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("rg  cn    United Kingdom  cn    United Kingd", "String");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "rg  cn    United Kingdom  cn    United Kingd" + "'", str2, "rg  cn    United Kingdom  cn    United Kingd");
    }

    @Test
    public void test19776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19776");
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
        java.util.Locale.Builder builder11 = builder10.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder13 = builder10.addUnicodeLocaleAttribute("Localei#########################");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: Localei######################### [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u4e2d\u56fd" + "'", str5, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "zh-CN" + "'", str6, "zh-CN");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\u4e2d\u56fd" + "'", str8, "\u4e2d\u56fd");
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test19777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19777");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("chnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...", 'x');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "chnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa..." + "'", str2, "chnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
    }

    @Test
    public void test19778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19778");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("tsiLyarrAH", (double) 93);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=93.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test19779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19779");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("AN       englis", (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test19780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19780");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "zh-ZH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test19781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19781");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "$$$$");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: $$$$");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test19782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19782");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("                         ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test19783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19783");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("cinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecines");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test19784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19784");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("char[]char[]char[]cITALIANOchar[]char[]char[]ch", "nawiaT");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test19785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19785");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("ANGLAIS (CANADA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ANGLAIS (CANADA" + "'", str1, "ANGLAIS (CANADA");
    }

    @Test
    public void test19786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19786");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.setLanguageTag("zh-CN");
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        java.util.Locale.Builder builder7 = builder5.addUnicodeLocaleAttribute("util");
        java.util.Locale.Builder builder8 = builder5.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder8.setVariant("hArrayList");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: hArrayList [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test19787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19787");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("ccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccngls");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccngls" + "'", str1, "ccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccngls");
    }

    @Test
    public void test19788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19788");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName("TW");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "TW" + "'", str1, "TW");
    }

    @Test
    public void test19789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19789");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("   CINESE       CINESE       CINESE       CINESE       CINESE       CINESE       CINESE       CGNE", "CINA$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test19790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19790");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("\u82f1\u6587\u52a0\u62ff\u5927)", "A", "tRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRIAD.AE.AF.A");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u82f1\u6587\u52a0\u62ff\u5927)" + "'", str3, "\u82f1\u6587\u52a0\u62ff\u5927)");
    }

    @Test
    public void test19791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19791");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("HArrayList", "H", (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test19792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19792");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("Italian", 317, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaItalian" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaItalian");
    }

    @Test
    public void test19793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19793");
        java.util.Locale locale1 = new java.util.Locale("");
        java.lang.String str2 = locale1.getDisplayLanguage();
        java.util.Locale locale3 = java.util.Locale.CANADA;
        java.lang.String str4 = locale3.getDisplayLanguage();
        java.lang.String str5 = locale1.getDisplayScript(locale3);
        java.lang.String str6 = locale3.getDisplayVariant();
        java.util.Locale locale7 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale8 = java.util.Locale.getDefault();
        java.lang.String str9 = locale7.getDisplayCountry(locale8);
        java.lang.String str10 = locale8.getDisplayVariant();
        java.lang.String str11 = locale3.getDisplayScript(locale8);
        java.lang.String str12 = locale3.getDisplayVariant();
        java.lang.String str13 = locale3.getISO3Language();
        java.util.Set<java.lang.String> strSet14 = locale3.getUnicodeLocaleAttributes();
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u82f1\u6587" + "'", str4, "\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale8);
// flaky:         org.junit.Assert.assertEquals(locale8.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u4e2d\u56fd" + "'", str9, "\u4e2d\u56fd");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "eng" + "'", str13, "eng");
        org.junit.Assert.assertNotNull(strSet14);
    }

    @Test
    public void test19794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19794");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("                                 ...inglese (Canada)xxxxxxxx                                 HI!HI!HI!HI!HI!Hzh_Z!HI!HI!HI!HI!HI4444444444444444444444444444444444444444444444444444444444444HI!HI!HI!HI!HI!Hzh_Z!HI!HI!HI!HI!HI4444444444444444444444444444444444444444444444444444444444444HI!HI!HI!HI!HI!Hzh_Z!HI!HI!HI!HI!HI4444444444444444444444444444444444444444444444444444444444444HI!HI!HI!HI!HI!Hzh_Z!HI!HI!HI!HI!HI4444444444444444444444444444444444444444444444444444444444444HI!HI!HI!HI!HI!Hzh_Z!HI!HI!HI!HI!HI4444444444444444444444444444444444444444444444444444444444444HI!HI!HI!HI!HI!Hzh_Z!HI!HI!HI!HI!HI4444444444444444444444444444444444444444444444444444444444444HI!HI!HI!HI!HI!Hzh_Z!HI!HI!HI!HI!HI4444444444444444444444444444444444444444444444444444444444444HI!HI!HI!HI!HI!Hzh_Z!HI!HI!HI!HI!HI4444444444444444444444444444444444444444444444444444444444444HI!HI!HI!HI!HI!Hzh_Z!HI!HI!HI!HI!HI4444444444444444444444444444444444444444444444444444444444444HI!HI!HI!HI!HI!Hzh_Z!HI!HI!HI!HI!", 17);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                 " + "'", str2, "                 ");
    }

    @Test
    public void test19795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19795");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("   ");
        boolean boolean3 = org.apache.commons.lang3.StringUtils.startsWithAny("zhcinesese", strArray2);
        java.lang.String str5 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) boolean3, "Double");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang" + "'", str5, "java.lang");
    }

    @Test
    public void test19796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19796");
        java.lang.CharSequence charSequence1 = null;
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "arraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########", charSequence1);
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "arraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########" + "'", charSequence2, "arraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########");
    }

    @Test
    public void test19797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19797");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("An                              ", strMap1);
        org.junit.Assert.assertNotNull(languageRangeList2);
    }

    @Test
    public void test19798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19798");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("Hindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindi", "\u4e2d\u56fd\u8a9e (ZH)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test19799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19799");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("\u82f1\u6587\u7f8e\u56fd)", "               class java.lang.string               ", 698);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test19800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19800");
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
        java.util.Locale locale16 = builder9.build();
        java.lang.String str17 = locale16.getDisplayVariant();
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
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "ia_JA");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test19801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19801");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fdxxx", 12);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test19802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19802");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "AVAJ", " a");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test19803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19803");
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
        boolean boolean44 = languageRangeList1.isEmpty();
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor45 = languageRangeList1.listIterator();
        java.util.Iterator<java.util.Locale.LanguageRange> languageRangeItor46 = languageRangeList1.iterator();
        java.lang.String str48 = org.apache.commons.lang3.StringUtils.join(languageRangeItor46, '.');
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
// flaky:         org.junit.Assert.assertEquals(locale16.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\u4e2d\u56fd" + "'", str17, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "zh-CN" + "'", str18, "zh-CN");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale20);
// flaky:         org.junit.Assert.assertEquals(locale20.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\u4e2d\u56fd" + "'", str21, "\u4e2d\u56fd");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale23);
// flaky:         org.junit.Assert.assertEquals(locale23.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\u4e2d\u56fd" + "'", str24, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals(locale28.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale30);
// flaky:         org.junit.Assert.assertEquals(locale30.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\u4e2d\u56fd" + "'", str31, "\u4e2d\u56fd");
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
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(languageRangeItor45);
        org.junit.Assert.assertNotNull(languageRangeItor46);
    }

    @Test
    public void test19804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19804");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                                    ", "A");
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("................................................................................ions.EmptySet", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test19805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19805");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale.Builder builder3 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder5 = builder1.setRegion("zh");
        java.util.Locale.Builder builder6 = builder1.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder6.setExtension('u', "NWTSNWTLGNE");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension value: NWTSNWTLGNE [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test19806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19806");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange(" zH  ", (double) 26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=26.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test19807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19807");
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
        java.util.Locale.Category category78 = java.util.Locale.Category.FORMAT;
        boolean boolean79 = languageRangeList23.remove((java.lang.Object) category78);
        java.util.Locale locale80 = java.util.Locale.ITALIAN;
        java.lang.String str81 = locale80.getLanguage();
        java.lang.String str82 = locale80.getLanguage();
        java.util.Set<java.lang.String> strSet83 = locale80.getUnicodeLocaleAttributes();
        java.lang.String str84 = locale80.getISO3Language();
        java.util.Locale.setDefault(category78, locale80);
        java.util.Set<java.lang.Character> charSet86 = locale80.getExtensionKeys();
        java.util.Locale.Builder builder87 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder88 = builder87.clearExtensions();
        java.util.Locale locale89 = builder87.build();
        java.lang.String str90 = locale89.getDisplayName();
        java.util.Locale locale91 = null;
        java.lang.String str92 = locale89.getDisplayVariant(locale91);
        java.lang.String str93 = locale89.getDisplayVariant();
        java.lang.String str94 = locale89.getVariant();
        java.lang.String str95 = locale80.getDisplayLanguage(locale89);
        java.util.Set<java.lang.String> strSet96 = locale89.getUnicodeLocaleKeys();
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
        org.junit.Assert.assertTrue("'" + category78 + "' != '" + java.util.Locale.Category.FORMAT + "'", category78.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(locale80);
        org.junit.Assert.assertEquals(locale80.toString(), "it");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "it" + "'", str81, "it");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "it" + "'", str82, "it");
        org.junit.Assert.assertNotNull(strSet83);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "ita" + "'", str84, "ita");
        org.junit.Assert.assertNotNull(charSet86);
        org.junit.Assert.assertNotNull(builder88);
        org.junit.Assert.assertNotNull(locale89);
        org.junit.Assert.assertEquals(locale89.toString(), "");
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "" + "'", str90, "");
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "" + "'", str92, "");
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "" + "'", str93, "");
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "" + "'", str94, "");
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "Italian" + "'", str95, "Italian");
        org.junit.Assert.assertNotNull(strSet96);
    }

    @Test
    public void test19808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19808");
        java.util.Locale locale1 = new java.util.Locale("cINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINA");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = locale1.getUnicodeLocaleType("ENGLTWNSTWN");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: ENGLTWNSTWN");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale1.toString(), "cinacinacinacinacinacinacinacinacinacinacinacinacinacinacinacinacinacinacinacinacinacinacinacinacinacinacinacinacinacinacinacinacinacinacinacinacinacinacina");
    }

    @Test
    public void test19809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19809");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("#################################################################################################", 'a');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concatWith("hi!italiahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIital..", (java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#################################################################################################" + "'", str4, "#################################################################################################");
    }

    @Test
    public void test19810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19810");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("\u82f1\u8a9e...XXXXXFRENCH(FRANCE)XXXXXXXXXX...XXXXXFRENCH(FRANCE)XXXXXXXXXX..", 35, "HINDI(hi!,China)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u82f1\u8a9e...XXXXXFRENCH(FRANCE)XXXXXXXXXX...XXXXXFRENCH(FRANCE)XXXXXXXXXX.." + "'", str3, "\u82f1\u8a9e...XXXXXFRENCH(FRANCE)XXXXXXXXXX...XXXXXFRENCH(FRANCE)XXXXXXXXXX..");
    }

    @Test
    public void test19811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19811");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "chinenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglish", (java.lang.CharSequence) "\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587          ");
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 339 + "'", int2 == 339);
    }

    @Test
    public void test19812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19812");
        java.util.Locale locale1 = new java.util.Locale("$");
        java.lang.String str2 = locale1.getDisplayName();
        java.util.Set<java.lang.String> strSet3 = locale1.getUnicodeLocaleKeys();
        org.junit.Assert.assertEquals(locale1.toString(), "$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "$" + "'", str2, "$");
        org.junit.Assert.assertNotNull(strSet3);
    }

    @Test
    public void test19813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19813");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.setLanguageTag("zh-CN");
        java.util.Locale.Builder builder5 = builder3.setLanguage("it");
        java.util.Locale.Builder builder6 = builder5.clear();
        java.util.Locale.Builder builder7 = builder6.clear();
        java.util.Locale.Builder builder9 = builder7.setLanguageTag("slgne");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder7.setScript("chinchinchinchinchichinchinchinchinc");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: chinchinchinchinchichinchinchinchinc [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test19814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19814");
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
        boolean boolean14 = locale12.hasExtensions();
        java.lang.String str15 = locale12.getDisplayCountry();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u82f1\u6587" + "'", str5, "\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "english" + "'", str9, "english");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "de");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test19815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19815");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("fran\347ais (Canada)");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test19816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19816");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap3);
        int int5 = languageRangeList1.size();
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor6 = languageRangeList1.listIterator();
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.util.Iterator<java.util.Locale.LanguageRange>) languageRangeItor6, 'u');
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(languageRangeItor6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test19817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19817");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.lang.Class<?>[] wildcardClassArray3 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray1);
        java.lang.Class<?>[] wildcardClassArray4 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray1);
        java.lang.Class<?>[] wildcardClassArray5 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray5, '.');
        java.lang.Class[] classArray10 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray11 = (java.lang.Class<?>[]) classArray10;
        java.lang.Class<?>[] wildcardClassArray12 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray10);
        java.lang.Class<?>[] wildcardClassArray13 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray10);
        java.lang.Class[] classArray15 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray16 = (java.lang.Class<?>[]) classArray15;
        java.lang.Class<?>[] wildcardClassArray17 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray15);
        java.lang.Class<?>[] wildcardClassArray18 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray15);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) classArray15, "zh-CN");
        boolean boolean21 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray13, (java.lang.Class<?>[]) classArray15);
        java.lang.Class[] classArray23 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray24 = (java.lang.Class<?>[]) classArray23;
        java.lang.Class<?>[] wildcardClassArray25 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray23);
        java.lang.Class<?>[] wildcardClassArray26 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray23);
        java.lang.Class[] classArray29 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray30 = (java.lang.Class<?>[]) classArray29;
        java.lang.Class<?>[] wildcardClassArray31 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray29);
        java.lang.String str32 = org.apache.commons.lang3.StringUtils.concatWith("hi!", (java.lang.Object[]) classArray29);
        boolean boolean33 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray23, (java.lang.Class<?>[]) classArray29);
        boolean boolean35 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray13, (java.lang.Class<?>[]) classArray29, true);
        java.lang.Class[] classArray37 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray38 = (java.lang.Class<?>[]) classArray37;
        java.lang.Class<?>[] wildcardClassArray39 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray37);
        java.lang.Class<?> wildcardClass40 = null;
        java.lang.Class[] classArray42 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray43 = (java.lang.Class<?>[]) classArray42;
        wildcardClassArray43[0] = wildcardClass40;
        boolean boolean47 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray39, wildcardClassArray43, false);
        java.lang.Class[] classArray49 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray50 = (java.lang.Class<?>[]) classArray49;
        java.lang.Class<?>[] wildcardClassArray51 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray49);
        boolean boolean52 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray39, (java.lang.Class<?>[]) classArray49);
        java.lang.Class[] classArray54 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray55 = (java.lang.Class<?>[]) classArray54;
        java.lang.Class<?>[] wildcardClassArray56 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray54);
        java.lang.Class<?>[] wildcardClassArray57 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray54);
        java.lang.Class[] classArray59 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray60 = (java.lang.Class<?>[]) classArray59;
        java.lang.Class<?>[] wildcardClassArray61 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray59);
        java.lang.Class<?>[] wildcardClassArray62 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray59);
        java.lang.String str64 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) classArray59, "zh-CN");
        boolean boolean65 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray57, (java.lang.Class<?>[]) classArray59);
        boolean boolean67 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray39, wildcardClassArray57, false);
        java.lang.Class<?>[] wildcardClassArray68 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray39);
        java.lang.Class<?>[] wildcardClassArray69 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray39);
        boolean boolean70 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray29, wildcardClassArray39);
        boolean boolean72 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray5, (java.lang.Class<?>[]) classArray29, false);
        java.lang.String[] strArray75 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("German", "zhcinesese");
        java.lang.Class<?>[] wildcardClassArray76 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray75);
        boolean boolean77 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray29, wildcardClassArray76);
        java.lang.Class<?>[] wildcardClassArray78 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) classArray29);
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertNotNull(wildcardClassArray4);
        org.junit.Assert.assertNotNull(wildcardClassArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(classArray10);
        org.junit.Assert.assertNotNull(wildcardClassArray11);
        org.junit.Assert.assertNotNull(wildcardClassArray12);
        org.junit.Assert.assertNotNull(wildcardClassArray13);
        org.junit.Assert.assertNotNull(classArray15);
        org.junit.Assert.assertNotNull(wildcardClassArray16);
        org.junit.Assert.assertNotNull(wildcardClassArray17);
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(classArray23);
        org.junit.Assert.assertNotNull(wildcardClassArray24);
        org.junit.Assert.assertNotNull(wildcardClassArray25);
        org.junit.Assert.assertNotNull(wildcardClassArray26);
        org.junit.Assert.assertNotNull(classArray29);
        org.junit.Assert.assertNotNull(wildcardClassArray30);
        org.junit.Assert.assertNotNull(wildcardClassArray31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(classArray37);
        org.junit.Assert.assertNotNull(wildcardClassArray38);
        org.junit.Assert.assertNotNull(wildcardClassArray39);
        org.junit.Assert.assertNotNull(classArray42);
        org.junit.Assert.assertNotNull(wildcardClassArray43);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(classArray49);
        org.junit.Assert.assertNotNull(wildcardClassArray50);
        org.junit.Assert.assertNotNull(wildcardClassArray51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(classArray54);
        org.junit.Assert.assertNotNull(wildcardClassArray55);
        org.junit.Assert.assertNotNull(wildcardClassArray56);
        org.junit.Assert.assertNotNull(wildcardClassArray57);
        org.junit.Assert.assertNotNull(classArray59);
        org.junit.Assert.assertNotNull(wildcardClassArray60);
        org.junit.Assert.assertNotNull(wildcardClassArray61);
        org.junit.Assert.assertNotNull(wildcardClassArray62);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray68);
        org.junit.Assert.assertNotNull(wildcardClassArray69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(strArray75);
        org.junit.Assert.assertNotNull(wildcardClassArray76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray78);
    }

    @Test
    public void test19818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19818");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("NCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCARRAYLISTRING[]NCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCARRAYLISTRING[]NCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCARRAYLISTRING[]NCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCARRAYLISTRING[]NCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCARRAYLISTRING[]NCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCARRAYLIS", "rance)Itali");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test19819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19819");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("latiarfati", "HI!STRING[]STRING[]S");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test19820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19820");
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
            java.util.Locale.Builder builder17 = builder9.setScript("englhi!string[]string[]sshi!string[]string[]s");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: englhi!string[]string[]sshi!string[]string[]s [at index 0]");
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
    public void test19821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19821");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale locale5 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale.Builder builder6 = builder4.setLocale(locale5);
        java.util.Locale locale7 = builder6.build();
        java.util.Locale locale11 = new java.util.Locale("");
        java.util.Set<java.lang.String> strSet12 = locale11.getUnicodeLocaleKeys();
        boolean boolean13 = locale11.hasExtensions();
        java.lang.String str14 = locale11.getVariant();
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.upperCase("String", locale11);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.lowerCase("chinChinChinChinChiChinChinChinChinC", locale11);
        java.util.Set<java.lang.String> strSet17 = locale11.getUnicodeLocaleAttributes();
        java.lang.String str18 = locale7.getDisplayName(locale11);
        java.util.Locale.Builder builder19 = builder2.setLocale(locale7);
        java.lang.String str20 = locale7.getDisplayVariant();
        java.lang.String str21 = locale7.getISO3Language();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh_CN");
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "STRING" + "'", str15, "STRING");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "chinchinchinchinchichinchinchinchinc" + "'", str16, "chinchinchinchinchichinchinchinchinc");
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Chinese (China)" + "'", str18, "Chinese (China)");
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "zho" + "'", str21, "zho");
    }

    @Test
    public void test19822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19822");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                            AHI!HI!                                                                 ", 43, "                 a                ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                            AHI!HI!                                                                 " + "'", str3, "                            AHI!HI!                                                                 ");
    }

    @Test
    public void test19823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19823");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("CINA", 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test19824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19824");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test19825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19825");
        java.util.Locale locale1 = new java.util.Locale("hi!hi! (                 A                 )");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList3 = java.util.Locale.LanguageRange.parse("hi");
        java.lang.Object[] objArray4 = languageRangeList3.toArray();
        java.util.Spliterator<java.util.Locale.LanguageRange> languageRangeSpliterator5 = languageRangeList3.spliterator();
        java.util.Locale.Builder builder6 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder7 = builder6.clearExtensions();
        java.util.Locale.Builder builder9 = builder7.setLanguageTag("zh-CN");
        java.util.Locale locale10 = builder7.build();
        boolean boolean11 = languageRangeList3.remove((java.lang.Object) locale10);
        java.lang.String str13 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) locale10, "us");
        java.lang.String str14 = locale1.getDisplayScript(locale10);
        java.lang.String str15 = locale1.toLanguageTag();
        org.junit.Assert.assertEquals(locale1.toString(), "hi!hi! (                 a                 )");
        org.junit.Assert.assertNotNull(languageRangeList3);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(languageRangeSpliterator5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_CN");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.util" + "'", str13, "java.util");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "und" + "'", str15, "und");
    }

    @Test
    public void test19826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19826");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("zh-cnenglh");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList1, "HI!STRING[]STRING[]S");
        java.util.Locale locale6 = new java.util.Locale("CHN", "hi!");
        java.lang.String str7 = locale6.getVariant();
        boolean boolean8 = languageRangeList1.equals((java.lang.Object) locale6);
        java.util.Locale.Builder builder9 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder10 = builder9.clearExtensions();
        java.util.Locale.Builder builder12 = builder10.setLanguageTag("zh-CN");
        java.util.Locale.Builder builder14 = builder12.setLanguage("it");
        java.util.Locale.Builder builder15 = builder14.clear();
        java.util.Locale locale17 = new java.util.Locale("");
        java.lang.String str18 = locale17.getDisplayLanguage();
        java.util.Locale locale19 = java.util.Locale.CANADA;
        java.lang.String str20 = locale19.getDisplayLanguage();
        java.lang.String str21 = locale17.getDisplayScript(locale19);
        java.lang.String str22 = locale19.getDisplayVariant();
        java.util.Locale locale23 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale24 = java.util.Locale.getDefault();
        java.lang.String str25 = locale23.getDisplayCountry(locale24);
        java.lang.String str26 = locale24.getDisplayVariant();
        java.lang.String str27 = locale19.getDisplayScript(locale24);
        java.util.Locale.Builder builder28 = null; // flaky: builder14.setLocale(locale24);
        java.util.Locale.Builder builder29 = null; // flaky: builder28.clearExtensions();
        java.util.Locale.Builder builder30 = null; // flaky: builder29.clear();
        java.util.Locale locale32 = java.util.Locale.forLanguageTag("TALIAHi");
        java.util.Locale locale35 = new java.util.Locale("italiano", "Ci_a");
        java.lang.String str36 = locale32.getDisplayVariant(locale35);
        java.util.Locale.Builder builder37 = null; // flaky: builder30.setLocale(locale32);
        java.util.Set<java.lang.String> strSet38 = locale32.getUnicodeLocaleKeys();
        java.lang.String str39 = java.util.Locale.lookupTag(languageRangeList1, (java.util.Collection<java.lang.String>) strSet38);
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertEquals(locale6.toString(), "chn_HI!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertEquals(locale17.toString(), "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "en_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\u82f1\u6587" + "'", str20, "\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale24);
// flaky:         org.junit.Assert.assertEquals(locale24.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\u4e2d\u56fd" + "'", str25, "\u4e2d\u56fd");
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
// flaky:         org.junit.Assert.assertNotNull(builder28);
// flaky:         org.junit.Assert.assertNotNull(builder29);
// flaky:         org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "taliahi");
        org.junit.Assert.assertEquals(locale35.toString(), "italiano_CI_A");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
// flaky:         org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(strSet38);
        org.junit.Assert.assertNull(str39);
    }

    @Test
    public void test19827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19827");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("ithi!lihi!no                                                                                        ", "hindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ithi!lihi!no                                                                                        " + "'", str2, "ithi!lihi!no                                                                                        ");
    }

    @Test
    public void test19828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19828");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("ggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engl", 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test19829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19829");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore(".HI.!.HI.!.HI.!.HI.!.HI.!", "\u5317\u5370\u5ea6\u6587 (HI!,cHINA)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ".HI.!.HI.!.HI.!.HI.!.HI.!" + "'", str2, ".HI.!.HI.!.HI.!.HI.!.HI.!");
    }

    @Test
    public void test19830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19830");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("FR", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "FR" + "'", str2, "FR");
    }

    @Test
    public void test19831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19831");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("english", strMap1);
        java.util.Locale.LanguageRange[] languageRangeArray3 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList4 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList4, languageRangeArray3);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap6 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList7 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, strMap6);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap9 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList10 = java.util.Locale.LanguageRange.parse("Cina", strMap9);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap11 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList12 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList10, strMap11);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList14 = java.util.Locale.LanguageRange.parse("hi");
        boolean boolean16 = languageRangeList14.remove((java.lang.Object) "English");
        boolean boolean18 = languageRangeList14.remove((java.lang.Object) 1);
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
        java.util.Locale locale56 = java.util.Locale.lookup(languageRangeList14, (java.util.Collection<java.util.Locale>) localeList53);
        java.util.List<java.util.Locale> localeList57 = java.util.Locale.filter(languageRangeList12, (java.util.Collection<java.util.Locale>) localeList53);
        java.util.Locale.FilteringMode filteringMode58 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList59 = java.util.Locale.filter(languageRangeList7, (java.util.Collection<java.util.Locale>) localeList57, filteringMode58);
        java.util.List<java.util.Locale> localeList60 = java.util.Locale.filter(languageRangeList2, (java.util.Collection<java.util.Locale>) localeList57);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream61 = languageRangeList2.stream();
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(languageRangeList7);
        org.junit.Assert.assertNotNull(languageRangeList10);
        org.junit.Assert.assertNotNull(languageRangeList12);
        org.junit.Assert.assertNotNull(languageRangeList14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
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
// flaky:         org.junit.Assert.assertEquals(locale29.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "\u4e2d\u56fd" + "'", str30, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "zh-CN" + "'", str31, "zh-CN");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale33);
// flaky:         org.junit.Assert.assertEquals(locale33.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str34 + "' != '" + "\u4e2d\u56fd" + "'", str34, "\u4e2d\u56fd");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale36);
// flaky:         org.junit.Assert.assertEquals(locale36.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str37 + "' != '" + "\u4e2d\u56fd" + "'", str37, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals(locale41.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale43);
// flaky:         org.junit.Assert.assertEquals(locale43.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str44 + "' != '" + "\u4e2d\u56fd" + "'", str44, "\u4e2d\u56fd");
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
        org.junit.Assert.assertNull(locale56);
        org.junit.Assert.assertNotNull(localeList57);
        org.junit.Assert.assertTrue("'" + filteringMode58 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode58.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList59);
        org.junit.Assert.assertNotNull(localeList60);
        org.junit.Assert.assertNotNull(languageRangeStream61);
    }

    @Test
    public void test19832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19832");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("Englensen", "                                rArrayL");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Englensen" + "'", str2, "Englensen");
    }

    @Test
    public void test19833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19833");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap3);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor5 = languageRangeList4.listIterator();
        java.util.Locale.LanguageRange[] languageRangeArray6 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList7 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList7, languageRangeArray6);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap9 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList10 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList7, strMap9);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor11 = languageRangeList10.listIterator();
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList14 = new java.util.ArrayList<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList14, strArray13);
        java.util.Locale.LanguageRange[] languageRangeArray16 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList17 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList17, languageRangeArray16);
        java.util.Locale locale20 = java.util.Locale.FRANCE;
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale20);
        java.util.Locale locale22 = java.util.Locale.US;
        java.util.Locale locale23 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale24 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale25 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale26 = java.util.Locale.getDefault();
        java.lang.String str27 = locale25.getDisplayCountry(locale26);
        java.lang.String str28 = locale25.toLanguageTag();
        java.util.Locale locale29 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale30 = java.util.Locale.getDefault();
        java.lang.String str31 = locale29.getDisplayCountry(locale30);
        java.util.Locale locale32 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale33 = java.util.Locale.getDefault();
        java.lang.String str34 = locale32.getDisplayCountry(locale33);
        java.util.Locale locale38 = new java.util.Locale("hi", "hi!", "cHINA");
        java.util.Locale locale39 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale40 = java.util.Locale.getDefault();
        java.lang.String str41 = locale39.getDisplayCountry(locale40);
        java.util.Locale locale43 = new java.util.Locale("");
        java.lang.String str44 = locale43.getDisplayVariant();
        java.util.Locale locale45 = java.util.Locale.KOREAN;
        java.util.Locale locale47 = new java.util.Locale("");
        java.util.Locale locale48 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale[] localeArray49 = new java.util.Locale[] { locale20, locale22, locale23, locale24, locale25, locale30, locale32, locale38, locale40, locale43, locale45, locale47, locale48 };
        java.util.ArrayList<java.util.Locale> localeList50 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList50, localeArray49);
        java.util.List<java.util.Locale> localeList52 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList17, (java.util.Collection<java.util.Locale>) localeList50);
        java.lang.String[] strArray60 = new java.lang.String[] { "English", "hi", "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "", "a", "", "China" };
        java.util.ArrayList<java.lang.String> strList61 = new java.util.ArrayList<java.lang.String>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList61, strArray60);
        java.util.List<java.lang.Class<?>> wildcardClassList63 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList61);
        java.util.Locale.FilteringMode filteringMode64 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList65 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList17, (java.util.Collection<java.lang.String>) strList61, filteringMode64);
        java.util.List<java.lang.String> strList66 = java.util.Locale.filterTags(languageRangeList10, (java.util.Collection<java.lang.String>) strList14, filteringMode64);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor67 = languageRangeList10.listIterator();
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream68 = languageRangeList10.parallelStream();
        boolean boolean69 = languageRangeList4.remove((java.lang.Object) languageRangeStream68);
        java.util.Iterator<java.util.Locale.LanguageRange> languageRangeItor70 = languageRangeList4.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList73 = languageRangeList4.subList((int) '$', 98);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 98");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(languageRangeItor5);
        org.junit.Assert.assertNotNull(languageRangeArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(languageRangeList10);
        org.junit.Assert.assertNotNull(languageRangeItor11);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(languageRangeArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "english" + "'", str21, "english");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale26);
// flaky:         org.junit.Assert.assertEquals(locale26.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\u4e2d\u56fd" + "'", str27, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "zh-CN" + "'", str28, "zh-CN");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale30);
// flaky:         org.junit.Assert.assertEquals(locale30.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\u4e2d\u56fd" + "'", str31, "\u4e2d\u56fd");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale33);
// flaky:         org.junit.Assert.assertEquals(locale33.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str34 + "' != '" + "\u4e2d\u56fd" + "'", str34, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals(locale38.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale40);
// flaky:         org.junit.Assert.assertEquals(locale40.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str41 + "' != '" + "\u4e2d\u56fd" + "'", str41, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals(locale43.toString(), "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "ko");
        org.junit.Assert.assertEquals(locale47.toString(), "");
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(localeList52);
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(wildcardClassList63);
        org.junit.Assert.assertTrue("'" + filteringMode64 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode64.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList65);
        org.junit.Assert.assertNotNull(strList66);
        org.junit.Assert.assertNotNull(languageRangeItor67);
        org.junit.Assert.assertNotNull(languageRangeStream68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(languageRangeItor70);
    }

    @Test
    public void test19834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19834");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageName("\u5317\u5370\u5ea6\u6587\u5317\u5370\u5ea6\u6587\u5317\u5370\u5ea6\u6587\u5317\u5370\u5ea6\u6587 (HI!,cHINcn_ITALIANOJAJAJAJAJAJAJAJAJAJAJAJAJAJ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test19835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19835");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("", "#a");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test19836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19836");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Collections.EmptySetitaCollections.EmptySetitaCollections.EmptySetitaCollections.EmptySet", "china_CN");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "Object[]");
        int int7 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("china-CN", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
    }

    @Test
    public void test19837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19837");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName("CHNAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "CHNAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "CHNAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test19838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19838");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap3);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream5 = languageRangeList1.stream();
        boolean boolean6 = languageRangeList1.isEmpty();
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap8 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList9 = java.util.Locale.LanguageRange.parse("HI", strMap8);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream10 = languageRangeList9.stream();
        boolean boolean11 = languageRangeList1.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList9);
        java.util.Locale.LanguageRange[] languageRangeArray12 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList13 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList13, languageRangeArray12);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap15 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList16 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList13, strMap15);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor17 = languageRangeList16.listIterator();
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList20 = new java.util.ArrayList<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList20, strArray19);
        java.util.Locale.LanguageRange[] languageRangeArray22 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList23 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList23, languageRangeArray22);
        java.util.Locale locale26 = java.util.Locale.FRANCE;
        java.lang.String str27 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale26);
        java.util.Locale locale28 = java.util.Locale.US;
        java.util.Locale locale29 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale30 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale31 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale32 = java.util.Locale.getDefault();
        java.lang.String str33 = locale31.getDisplayCountry(locale32);
        java.lang.String str34 = locale31.toLanguageTag();
        java.util.Locale locale35 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale36 = java.util.Locale.getDefault();
        java.lang.String str37 = locale35.getDisplayCountry(locale36);
        java.util.Locale locale38 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale39 = java.util.Locale.getDefault();
        java.lang.String str40 = locale38.getDisplayCountry(locale39);
        java.util.Locale locale44 = new java.util.Locale("hi", "hi!", "cHINA");
        java.util.Locale locale45 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale46 = java.util.Locale.getDefault();
        java.lang.String str47 = locale45.getDisplayCountry(locale46);
        java.util.Locale locale49 = new java.util.Locale("");
        java.lang.String str50 = locale49.getDisplayVariant();
        java.util.Locale locale51 = java.util.Locale.KOREAN;
        java.util.Locale locale53 = new java.util.Locale("");
        java.util.Locale locale54 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale[] localeArray55 = new java.util.Locale[] { locale26, locale28, locale29, locale30, locale31, locale36, locale38, locale44, locale46, locale49, locale51, locale53, locale54 };
        java.util.ArrayList<java.util.Locale> localeList56 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList56, localeArray55);
        java.util.List<java.util.Locale> localeList58 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList23, (java.util.Collection<java.util.Locale>) localeList56);
        java.lang.String[] strArray66 = new java.lang.String[] { "English", "hi", "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "", "a", "", "China" };
        java.util.ArrayList<java.lang.String> strList67 = new java.util.ArrayList<java.lang.String>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList67, strArray66);
        java.util.List<java.lang.Class<?>> wildcardClassList69 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList67);
        java.util.Locale.FilteringMode filteringMode70 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList71 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList23, (java.util.Collection<java.lang.String>) strList67, filteringMode70);
        java.util.List<java.lang.String> strList72 = java.util.Locale.filterTags(languageRangeList16, (java.util.Collection<java.lang.String>) strList20, filteringMode70);
        java.util.Locale.LanguageRange[] languageRangeArray73 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList74 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList74, languageRangeArray73);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap76 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList77 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList74, strMap76);
        int int78 = languageRangeList74.size();
        boolean boolean79 = languageRangeList16.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList74);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap80 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList81 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList16, strMap80);
        boolean boolean82 = languageRangeList9.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList81);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(languageRangeStream5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(languageRangeList9);
        org.junit.Assert.assertNotNull(languageRangeStream10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(languageRangeArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(languageRangeList16);
        org.junit.Assert.assertNotNull(languageRangeItor17);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(languageRangeArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "english" + "'", str27, "english");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale32);
// flaky:         org.junit.Assert.assertEquals(locale32.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "\u4e2d\u56fd" + "'", str33, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "zh-CN" + "'", str34, "zh-CN");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale36);
// flaky:         org.junit.Assert.assertEquals(locale36.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str37 + "' != '" + "\u4e2d\u56fd" + "'", str37, "\u4e2d\u56fd");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale39);
// flaky:         org.junit.Assert.assertEquals(locale39.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str40 + "' != '" + "\u4e2d\u56fd" + "'", str40, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals(locale44.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale46);
// flaky:         org.junit.Assert.assertEquals(locale46.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str47 + "' != '" + "\u4e2d\u56fd" + "'", str47, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals(locale49.toString(), "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "ko");
        org.junit.Assert.assertEquals(locale53.toString(), "");
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(localeList58);
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(wildcardClassList69);
        org.junit.Assert.assertTrue("'" + filteringMode70 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode70.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList71);
        org.junit.Assert.assertNotNull(strList72);
        org.junit.Assert.assertNotNull(languageRangeArray73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(languageRangeList77);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(languageRangeList81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
    }

    @Test
    public void test19839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19839");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("ggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaITHI!LIHI!NO");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test19840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19840");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("                                           ", "yListayListiiiiiiiiiiiiiiiiiiiiiiiArrayListiiiiiiiiiiiiiiiiiiiiiiiArrayListiiiiiiiiiiiiiiiiiiiiiiiArrayListiiiiiiiiiiiiiiiiiiiiiiiArrayListiiiiiiiiiiiiiiiiiiiiiiiArrayListiiiiiiiiiiiiiiiiiiiiiiiArrayListiiiiiiiiiiiiiiiiiiiiiiiArrayListiiiiiiiiiiiiiiiii");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test19841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19841");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("deu", "...ggggggggItaliano...ggggggggg", 259);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test19842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19842");
        java.util.Locale locale3 = new java.util.Locale("");
        java.lang.String str4 = locale3.getDisplayLanguage();
        java.util.Locale locale5 = java.util.Locale.CANADA;
        java.lang.String str6 = locale5.getDisplayLanguage();
        java.lang.String str7 = locale3.getDisplayScript(locale5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.lowerCase("A", locale5);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.lowerCase("china", locale5);
        java.lang.String str10 = locale5.getScript();
        java.lang.String str11 = locale5.getDisplayScript();
        java.lang.String str12 = locale5.toLanguageTag();
        java.util.Set<java.lang.Character> charSet13 = locale5.getExtensionKeys();
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u82f1\u6587" + "'", str6, "\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "a" + "'", str8, "a");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "china" + "'", str9, "china");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "en-CA" + "'", str12, "en-CA");
        org.junit.Assert.assertNotNull(charSet13);
    }

    @Test
    public void test19843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19843");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("REFERENCEPIPELINE.HEAD                        ", 94, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test19844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19844");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("a", "");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi", "A", (int) (short) -1);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("HI!STRING[]STRING[]S", strArray3, strArray8);
        java.lang.Class<?>[] wildcardClassArray10 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray3);
        java.lang.Class<?>[] wildcardClassArray11 = null;
        boolean boolean13 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray10, wildcardClassArray11, true);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HI!STRING[]STRING[]S" + "'", str9, "HI!STRING[]STRING[]S");
        org.junit.Assert.assertNotNull(wildcardClassArray10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test19845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19845");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.setLanguageTag("zh-CN");
        java.util.Locale.Builder builder5 = builder3.setLanguage("it");
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        java.util.Locale.Builder builder8 = builder5.setLanguage("Engls");
        java.util.Locale.Builder builder9 = builder8.clearExtensions();
        java.util.Locale locale10 = builder8.build();
        java.util.Locale.Builder builder11 = builder8.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder13 = builder11.setLanguage("                             HI!HI!HI!HI!HI!                    nglish  Hindi (HI!,cHINA                    nglish  Hind");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language:                              HI!HI!HI!HI!HI!                    nglish  Hindi (HI!,cHINA                    nglish  Hind [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "engls_CN");
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test19846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19846");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "LANG                                                      ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test19847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19847");
        char[] charArray7 = new char[] {};
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "zh-CN", charArray7);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "a", charArray7);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hEnglish", charArray7);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hindi (HI!,cHINA)", charArray7);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "AI", charArray7);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "AHI!HI!", charArray7);
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test19848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19848");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("\u82f1\u8a9e...xxxxxFrench(France)xxxxxxxxxx...xxxxxFrench(France)xxxxxxxxxx..");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u82f1\u8a9e...xxxxxFrench(France)xxxxxxxxxx...xxxxxFrench(France)xxxxxxxxxx.." + "'", str1, "\u82f1\u8a9e...xxxxxFrench(France)xxxxxxxxxx...xxxxxFrench(France)xxxxxxxxxx..");
    }

    @Test
    public void test19849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19849");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("AN       english444444444444444444444444444", "###############################En", "chi...");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test19850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19850");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\u82f1\u8a9e", "");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "Hindi (HI!,cHINA");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u82f1\u8a9e" + "'", str4, "\u82f1\u8a9e");
    }

    @Test
    public void test19851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19851");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("engltwnstwn", "in");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test19852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19852");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                                                                                                                                                                                                                                                  Ese (Taiwan$$$$$$$$$slgneese (Taiwan$$$$$$$$$                                                                                                                                                                                                                                                   ", "English", 234);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test19853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19853");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray5 = new char[] {};
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray5);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "zh-CN", charArray5);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "ad.ae.af.ag.ai.al.am.an.ao.aq.ar.as.at.au.aw.ax.az.ba.bb.bd.be.bf.bg.bh.bi.bj.bl.bm.bn.bo.bq.br.bs.bt.bv.bw.by.bz.ca.cc.cd.cf.cg.ch.ci.ck.cl.cm.cn.co.cr.cu.cv.cw.cx.cy.cz.de.dj.dk.dm.do.dz.ec.ee.eg.eh.er.es.et.fi.fj.fk.fm.fo.fr.ga.gb.gd.ge.gf.gg.gh.gi.gl.gm.gn.gp.gq.gr.gs.gt.gu.gw.gy.hk.hm.hn.hr.ht.hu.id.ie.il.im.in.io.iq.ir.is.it.je.jm.jo.jp.ke.kg.kh.ki.km.kn.kp.kr.kw.ky.kz.la.lb.lc.li.lk.lr.ls.lt.lu.lv.ly.ma.mc.md.me.mf.mg.mh.mk.ml.mm.mn.mo.mp.mq.mr.ms.mt.mu.mv.mw.mx.my.mz.na.nc.ne.nf.ng.ni.nl.no.np.nr.nu.nz.om.pa.pe.pf.pg.ph.pk.pl.pm.pn.pr.ps.pt.pw.py.qa.re.ro.rs.ru.rw.sa.sb.sc.sd.se.sg.sh.si.sj.sk.sl.sm.sn.so.sr.ss.st.sv.sx.sy.sz.tc.td.tf.tg.th.tj.tk.tl.tm.tn.to.tr.tt.tv.tw.tz.ua.ug.um.us.uy.uz.va.vc.ve.vg.vi.vn.vu.wf.ws.ye.yt.za.zm.zw", charArray5);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone(charSequence1, charArray5);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsAny("44444444EnglTWNsTWN44444444", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test19854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19854");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("n");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "n" + "'", str1, "n");
    }

    @Test
    public void test19855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19855");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("Chine", "\u4e2d\u6587\u4e2d\u570b)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test19856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19856");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("US");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByCharacterType("inglese");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.replaceEach("German", strArray2, strArray4);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "Acol");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "German" + "'", str5, "German");
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test19857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19857");
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
        int int14 = languageRangeList10.size();
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor15 = languageRangeList10.listIterator();
        java.util.Locale.LanguageRange languageRange17 = new java.util.Locale.LanguageRange("a");
        java.util.Locale.LanguageRange languageRange19 = new java.util.Locale.LanguageRange("English");
        java.lang.String str21 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) languageRange19, "");
        java.util.Locale.LanguageRange languageRange23 = new java.util.Locale.LanguageRange("English");
        java.util.Locale.LanguageRange[] languageRangeArray24 = new java.util.Locale.LanguageRange[] { languageRange17, languageRange19, languageRange23 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList25 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList25, languageRangeArray24);
        boolean boolean27 = languageRangeList10.retainAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList25);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor28 = languageRangeList25.listIterator();
        boolean boolean29 = languageRangeItor28.hasNext();
        boolean boolean30 = languageRangeItor28.hasNext();
        java.util.Locale.LanguageRange languageRange31 = languageRangeItor28.next();
        int int32 = languageRangeList1.lastIndexOf((java.lang.Object) languageRange31);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange34 = languageRangeList1.remove((int) (short) 0);
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(languageRangeItor15);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Locale.LanguageRange" + "'", str21, "Locale.LanguageRange");
        org.junit.Assert.assertNotNull(languageRangeArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(languageRangeItor28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(languageRange31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
    }

    @Test
    public void test19858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19858");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "!i");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!i" + "'", str1, "!i");
    }

    @Test
    public void test19859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19859");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("l.avajstring[]string[]string[", '#');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test19860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19860");
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
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream19 = languageRangeList16.parallelStream();
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
        java.lang.String[] strArray64 = new java.lang.String[] { "English", "hi", "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "", "a", "", "China" };
        java.util.ArrayList<java.lang.String> strList65 = new java.util.ArrayList<java.lang.String>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList65, strArray64);
        java.util.List<java.lang.Class<?>> wildcardClassList67 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList65);
        java.util.Locale.FilteringMode filteringMode68 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList69 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList21, (java.util.Collection<java.lang.String>) strList65, filteringMode68);
        java.util.Locale.LanguageRange[] languageRangeArray70 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList71 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList71, languageRangeArray70);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap73 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList74 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList71, strMap73);
        java.lang.String[] strArray82 = new java.lang.String[] { "English", "hi", "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "", "a", "", "China" };
        java.util.ArrayList<java.lang.String> strList83 = new java.util.ArrayList<java.lang.String>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList83, strArray82);
        java.util.List<java.lang.Class<?>> wildcardClassList85 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList83);
        java.lang.String str86 = java.util.Locale.lookupTag(languageRangeList74, (java.util.Collection<java.lang.String>) strList83);
        java.util.List<java.lang.Class<?>> wildcardClassList87 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList83);
        java.lang.String str88 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList21, (java.util.Collection<java.lang.String>) strList83);
        java.util.List<java.lang.String> strList89 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList16, (java.util.Collection<java.lang.String>) strList83);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(languageRangeItor6);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Locale.LanguageRange" + "'", str12, "Locale.LanguageRange");
        org.junit.Assert.assertNotNull(languageRangeArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(languageRangeStream19);
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
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(wildcardClassList67);
        org.junit.Assert.assertTrue("'" + filteringMode68 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode68.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList69);
        org.junit.Assert.assertNotNull(languageRangeArray70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(languageRangeList74);
        org.junit.Assert.assertNotNull(strArray82);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertNotNull(wildcardClassList85);
        org.junit.Assert.assertNull(str86);
        org.junit.Assert.assertNotNull(wildcardClassList87);
        org.junit.Assert.assertNull(str88);
        org.junit.Assert.assertNotNull(strList89);
    }

    @Test
    public void test19861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19861");
        java.util.Iterator<java.util.Locale.LanguageRange> languageRangeItor0 = null;
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join(languageRangeItor0, 'x');
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test19862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19862");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    chinEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglish", "                                           nawiaT(ese                                                                                       nawiaT(ese                                                                                       nawiaT(ese                                                                                       )adanaC( eselgni");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test19863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19863");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("LANGUAGERANG", "                                                                                           Germn");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LANGUAGERANG" + "'", str2, "LANGUAGERANG");
    }

    @Test
    public void test19864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19864");
        java.util.Locale locale1 = new java.util.Locale("                         a                          ");
        org.junit.Assert.assertEquals(locale1.toString(), "                         a                          ");
    }

    @Test
    public void test19865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19865");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("", "N");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test19866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19866");
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        java.lang.String str1 = locale0.getVariant();
        java.util.Locale locale3 = java.util.Locale.FRANCE;
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale3);
        java.util.Locale.setDefault(locale3);
        java.lang.String str6 = locale0.getDisplayScript(locale3);
        java.util.Locale locale7 = java.util.Locale.CANADA;
        java.util.Set<java.lang.String> strSet8 = locale7.getUnicodeLocaleAttributes();
        java.util.Locale locale10 = java.util.Locale.FRANCE;
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale10);
        java.lang.String str12 = locale7.getDisplayCountry(locale10);
        java.lang.String str13 = locale3.getDisplayLanguage(locale10);
        java.lang.String str14 = locale3.getISO3Country();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "english" + "'", str4, "english");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_CA");
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "english" + "'", str11, "english");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Canada" + "'", str12, "Canada");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "fran\347ais" + "'", str13, "fran\347ais");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "FRA" + "'", str14, "FRA");
    }

    @Test
    public void test19867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19867");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("STRING[]", "panesexxxxxxxxxxxxxxpanesexxxxxxxxxxxxxxpanesexxxxxxxxxxxxxxpanesexxxxxxxxxxxxxxpanesexxxxxxxxxxxxxxpanesexxxxxxxxxxxxxxpanesexxxxxxxxxxxxxxpanesexxxxxxxxxxxxxxpanesexxxxxxxxxxxxxxpanesexxxxxxxxxxxxxxpanesexxxxxxxxxxxxxxpanesexxxxxxxxxxxxxxpanesexxxxxxxxxxxxxxpanesexxxxxxxxxxxxxxpanesexxxxxxxxxxxxxxpanesexxxxxxxxxxxxxxpanesexxxxxxxxxxxxxxpanesexxxxxxxxxxxxxxpanesexxxxxxxxxxxxxxpanesexxxxxxxxxxxxxxpanesexxxxxxxxxxxxxxpanesexxxxxxxxxxxxxxpanesexxxxxxxxxxxxxxpanesexxxxxxxxxxxxxxpanesexxxxxxxxxxxxxxpanesexxxxxxxxxxxxxxpanesexxxxxxxxxxxxxxpanesexxxxxxxxxxxxxxpanesexxxxxxxxxxxxxxpanesexxxxxxxxxxxxxxpanesexxxxxxxxxxxxxxpanesexxxxxxxxxxxxxxpanesexxxxxxxxxxxxxxpanesexxxxxxxxxxxxxxpanesexxxxxxxxxxxxxxpanesexxxxxxxxxxxxxxpanesexxxxxxxxxxxxxxpanesexxxxxxxxxxxxxxpanesexxxxxxxxxxxxxxpanesexxxxxxxxxxxxxxpanesexxxxxxxxxxxxxxpanesexxxxxxxxxxxxxxpanesexxxxxxxxxxxxxxpanesexxxxxxxxxxxxxxpanesexxxxxxxxxxxxxxpanesexxxxxxxxxxxxxxpanesexxxxxxxxxxxxxxpanesexxxxxxxxxxxxxx", "referencepipeline.head                        list");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test19868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19868");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("esecnarF", "LANG                                                      ", 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test19869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19869");
        char[] charArray9 = new char[] {};
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "zh-CN", charArray9);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny("                 a                  ", charArray9);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "i", charArray9);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny("", charArray9);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "$$$$$$$$$nawiaT( eseengls$$$$$$$$$nawiaT( esE", charArray9);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                  hI   Taiwan                  hI   xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", charArray9);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$Englisch (Kanada)$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$", charArray9);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "panesexxxxxxxxxxxxxx", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test19870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19870");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("d u ", 3, "czuc");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "d u " + "'", str3, "d u ");
    }

    @Test
    public void test19871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19871");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("cHINA", "latiarfatilatiait_IT");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "cHINA" + "'", str2, "cHINA");
    }

    @Test
    public void test19872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19872");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("\u82f1\u6587$$$$$$$$$$$$$$$$$$$$", "Itali", 259);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test19873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19873");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "friFRSTIiF");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test19874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19874");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                  hI   Taiwan                  hI                                                                       ", 119, 'u');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                  hI   Taiwan                  hI                                                                       " + "'", str3, "                  hI   Taiwan                  hI                                                                       ");
    }

    @Test
    public void test19875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19875");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("XXXXXXXXXXFRENCH(FRANCE)XXXXXXXXXX                                                           ", 32);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test19876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19876");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                                                                                                            undaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaH                                                                                                             ", "EN_ca", (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test19877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19877");
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
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap68 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList69 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList4, strMap68);
        java.util.Locale.Category category70 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale71 = java.util.Locale.getDefault(category70);
        java.util.Locale locale72 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str73 = locale72.getDisplayLanguage();
        java.lang.String str74 = locale72.getDisplayScript();
        java.util.Locale.setDefault(category70, locale72);
        java.util.Locale locale76 = java.util.Locale.getDefault(category70);
        boolean boolean77 = languageRangeList4.remove((java.lang.Object) category70);
        java.util.Locale locale78 = java.util.Locale.getDefault(category70);
        java.util.Locale locale79 = java.util.Locale.getDefault(category70);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList81 = java.util.Locale.LanguageRange.parse("hi");
        java.lang.Object[] objArray82 = languageRangeList81.toArray();
        java.util.Spliterator<java.util.Locale.LanguageRange> languageRangeSpliterator83 = languageRangeList81.spliterator();
        java.util.Locale.Builder builder84 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder85 = builder84.clearExtensions();
        java.util.Locale.Builder builder87 = builder85.setLanguageTag("zh-CN");
        java.util.Locale locale88 = builder85.build();
        boolean boolean89 = languageRangeList81.remove((java.lang.Object) locale88);
        java.lang.String str90 = locale88.getDisplayName();
        java.util.Locale.Builder builder91 = new java.util.Locale.Builder();
        java.util.Locale locale93 = java.util.Locale.FRANCE;
        java.lang.String str94 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale93);
        java.util.Locale.setDefault(locale93);
        java.util.Locale.Builder builder96 = builder91.setLocale(locale93);
        java.lang.String str97 = locale88.getDisplayVariant(locale93);
        java.util.Locale.setDefault(category70, locale88);
        java.lang.String str99 = locale88.getVariant();
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
        org.junit.Assert.assertEquals(locale20.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Chine" + "'", str21, "Chine");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "zh-CN" + "'", str22, "zh-CN");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Chine" + "'", str25, "Chine");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Chine" + "'", str28, "Chine");
        org.junit.Assert.assertEquals(locale32.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "fr_FR");
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
        org.junit.Assert.assertNotNull(languageRangeArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(languageRangeList65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(languageRangeList69);
        org.junit.Assert.assertTrue("'" + category70 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category70.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale71);
        org.junit.Assert.assertEquals(locale71.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale72);
        org.junit.Assert.assertEquals(locale72.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "chinois" + "'", str73, "chinois");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertNotNull(locale76);
        org.junit.Assert.assertEquals(locale76.toString(), "zh_TW");
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(locale78);
        org.junit.Assert.assertEquals(locale78.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale79);
        org.junit.Assert.assertEquals(locale79.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(languageRangeList81);
        org.junit.Assert.assertNotNull(objArray82);
        org.junit.Assert.assertNotNull(languageRangeSpliterator83);
        org.junit.Assert.assertNotNull(builder85);
        org.junit.Assert.assertNotNull(builder87);
        org.junit.Assert.assertNotNull(locale88);
        org.junit.Assert.assertEquals(locale88.toString(), "zh_CN");
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str90 + "' != '" + "\u4e2d\u6587\u4e2d\u570b)" + "'", str90, "\u4e2d\u6587\u4e2d\u570b)");
        org.junit.Assert.assertNotNull(locale93);
        org.junit.Assert.assertEquals(locale93.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "english" + "'", str94, "english");
        org.junit.Assert.assertNotNull(builder96);
        org.junit.Assert.assertEquals("'" + str97 + "' != '" + "" + "'", str97, "");
        org.junit.Assert.assertEquals("'" + str99 + "' != '" + "" + "'", str99, "");
    }

    @Test
    public void test19878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19878");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("############################NHC", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NHC" + "'", str2, "NHC");
    }

    @Test
    public void test19879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19879");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("ese(China)", "referencepipeline.head                        list###########                                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test19880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19880");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "$$$$$$$$$nawiaT( eseengls$$$$$$$$$nawiaT( esE");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 45 + "'", int1 == 45);
    }

    @Test
    public void test19881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19881");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("\u82f1\u6587$$$$$$$$$$$$$$$$$$$$", '#');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test19882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19882");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("INGLESE", (int) (byte) 10, '$');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "$$$INGLESE" + "'", str3, "$$$INGLESE");
    }

    @Test
    public void test19883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19883");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.setLanguageTag("zh-CN");
        java.util.Locale.Builder builder4 = builder1.clear();
        java.util.Locale.Builder builder6 = builder1.addUnicodeLocaleAttribute("zhcines");
        java.util.Locale.Builder builder7 = builder1.clearExtensions();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test19884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19884");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = org.apache.commons.lang3.ClassUtils.getClass("unduhar[]unduunduhar[]unduunduhar[]unduunduhar[]unduunduhar[]unduunduhar[]unduunduhar[]unduunduhar[]unduunduhar[]unduunduhar[]unduunduhar[]unduunduhar[]unduunduhar[]unduunduhar[]unduunduhar[]undu");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: unduhar[]unduunduhar[]unduunduhar[]unduunduhar[]unduunduhar[]unduunduhar[]unduunduhar[]unduunduhar[]unduunduhar[]unduunduhar[]unduunduhar[]unduunduhar[]unduunduhar[]unduunduhar[]unduunduhar[]undu");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test19885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19885");
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
            java.util.Locale.Builder builder24 = builder22.setScript("#####################################Germn");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: #####################################Germn [at index 0]");
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
    public void test19886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19886");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaNHC", 'a');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test19887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19887");
        char[] charArray5 = new char[] { '#', '#', ' ' };
        boolean boolean6 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!", charArray5);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "it_IT", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "## ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "## ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[#, #,  ]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test19888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19888");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("Chinese(China)", "      444444444444444444444444444444444      ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test19889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19889");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("italie", "                  hI   Taiwan                  hI   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test19890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19890");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("inglese (Stati Uniti)", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test19891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19891");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("ANIHCxxxxhIxxx", "  cn    ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test19892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19892");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("ANIHC", ".", 10);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxaniCxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxaniCxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxaniCxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxaniCxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxaniC4444444444444444444444444444444444444444444444444444444444444444444444444444444444444", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test19893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19893");
        java.util.Locale locale3 = new java.util.Locale("CHNAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "en_CA", "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
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
        java.util.Set<java.lang.String> strSet28 = locale20.getUnicodeLocaleAttributes();
        java.lang.String str29 = locale3.getDisplayCountry(locale20);
        java.util.Locale locale31 = new java.util.Locale("");
        java.lang.String str32 = locale31.getDisplayVariant();
        java.lang.String str33 = locale20.getDisplayScript(locale31);
        java.util.Locale locale35 = new java.util.Locale("");
        java.lang.String str36 = locale31.getDisplayCountry(locale35);
        java.util.Locale.setDefault(locale35);
        org.junit.Assert.assertEquals(locale3.toString(), "chnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa_EN_CA_ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
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
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "EN_CA" + "'", str29, "EN_CA");
        org.junit.Assert.assertEquals(locale31.toString(), "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals(locale35.toString(), "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
    }

    @Test
    public void test19894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19894");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("...                            avaj                                                          ", 83, 'x');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...                            avaj                                                          " + "'", str3, "...                            avaj                                                          ");
    }

    @Test
    public void test19895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19895");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "\u4e2d\u6587\u53f0\u6e7e\u5730\u533aenglihlish");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u4e2d\u6587\u53f0\u6e7e\u5730\u533aenglihlish" + "'", str1, "\u4e2d\u6587\u53f0\u6e7e\u5730\u533aenglihlish");
    }

    @Test
    public void test19896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19896");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("arraylist###########");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test19897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19897");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("ENENENENENENENENENEN", "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", 46);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test19898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19898");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("ArrayList.ListItrArrayLiLocale.Builder[]rrayList.ListItrArrayList.ListIfran\347ais (France)");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test19899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19899");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("F   ch", "GGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGA   LIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLI");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test19900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19900");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("H                                                GNALESENIC.ESENICAVAJ                                                I", "", 1);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test19901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19901");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("AD.AE.AF.AGchnaafraAD.AE.AF.AGchnaaauuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test19902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19902");
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
        boolean boolean28 = languageRangeList13.isEmpty();
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
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test19903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19903");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#.FilteringMode", "\u82f1\u8a9e...xxxxxFrench(France)xxxxxxxxxx...xxxxxFrench(France)xxxxxxxxxx...xxxxxFrench(France)xxxxxxxxxx", "                                                                                            Itali");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test19904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19904");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "CHNAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", (java.lang.CharSequence) "zh_tw_CHINCHINCHINCHINCHICHINCHINCHINCHINC");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "CHNAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", charSequence2, "CHNAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test19905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19905");
        char[] charArray6 = new char[] {};
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray6);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "twn", charArray6);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsAny("", charArray6);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "nglese", charArray6);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\u7fa9\u5927\u5229\u6587", charArray6);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\u4e2d\u56fdAD.AE.AF.A         ", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test19906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19906");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("TWN", "LOCALE.LANGUAGERANGE");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test19907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19907");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "deu");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test19908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19908");
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
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap62 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList63 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList4, strMap62);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream64 = languageRangeList63.parallelStream();
        java.util.Locale.LanguageRange[] languageRangeArray65 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList66 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList66, languageRangeArray65);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap68 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList69 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList66, strMap68);
        int int70 = languageRangeList66.size();
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor71 = languageRangeList66.listIterator();
        java.util.Locale.LanguageRange languageRange73 = new java.util.Locale.LanguageRange("a");
        java.util.Locale.LanguageRange languageRange75 = new java.util.Locale.LanguageRange("English");
        java.lang.String str77 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) languageRange75, "");
        java.util.Locale.LanguageRange languageRange79 = new java.util.Locale.LanguageRange("English");
        java.util.Locale.LanguageRange[] languageRangeArray80 = new java.util.Locale.LanguageRange[] { languageRange73, languageRange75, languageRange79 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList81 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList81, languageRangeArray80);
        boolean boolean83 = languageRangeList66.retainAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList81);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor84 = languageRangeList81.listIterator();
        java.util.Locale.LanguageRange languageRange85 = languageRangeItor84.next();
        java.lang.String str86 = languageRange85.getRange();
        boolean boolean87 = languageRangeList63.add(languageRange85);
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
        org.junit.Assert.assertEquals(locale20.toString(), "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "China" + "'", str21, "China");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "zh-CN" + "'", str22, "zh-CN");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "China" + "'", str25, "China");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "China" + "'", str28, "China");
        org.junit.Assert.assertEquals(locale32.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "");
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
        org.junit.Assert.assertNotNull(languageRangeList63);
        org.junit.Assert.assertNotNull(languageRangeStream64);
        org.junit.Assert.assertNotNull(languageRangeArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(languageRangeList69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertNotNull(languageRangeItor71);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "Locale.LanguageRange" + "'", str77, "Locale.LanguageRange");
        org.junit.Assert.assertNotNull(languageRangeArray80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(languageRangeItor84);
        org.junit.Assert.assertNotNull(languageRange85);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "a" + "'", str86, "a");
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
    }

    @Test
    public void test19909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19909");
        java.util.Locale locale2 = new java.util.Locale("italiano", "Ci_a");
        java.util.Locale locale6 = new java.util.Locale("Canada", "allemand", "cHINA");
        java.lang.String str7 = locale2.getDisplayName(locale6);
        java.util.Set<java.lang.Character> charSet8 = locale2.getExtensionKeys();
        java.util.Locale locale9 = java.util.Locale.KOREA;
        java.lang.String str10 = locale2.getDisplayVariant(locale9);
        java.lang.String str11 = locale9.getISO3Country();
        java.util.Locale locale12 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale13 = java.util.Locale.getDefault();
        java.lang.String str14 = locale12.getDisplayCountry(locale13);
        java.lang.String str15 = locale12.toLanguageTag();
        java.lang.String str16 = locale12.getCountry();
        java.lang.String str17 = locale12.toLanguageTag();
        java.lang.String str18 = locale12.getISO3Country();
        java.lang.String str19 = locale12.toLanguageTag();
        java.lang.String str20 = locale9.getDisplayVariant(locale12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = locale12.getExtension('#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: #");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "italiano_CI_A");
        org.junit.Assert.assertEquals(locale6.toString(), "canada_ALLEMAND_cHINA");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "italiano (CI_A)" + "'", str7, "italiano (CI_A)");
        org.junit.Assert.assertNotNull(charSet8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "KOR" + "'", str11, "KOR");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "China" + "'", str14, "China");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "zh-CN" + "'", str15, "zh-CN");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "CN" + "'", str16, "CN");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "zh-CN" + "'", str17, "zh-CN");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "CHN" + "'", str18, "CHN");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "zh-CN" + "'", str19, "zh-CN");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test19910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19910");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("Ese (Taiwan$$$$$$$$$slgneese (Taiwan$$$$$$$$$");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Ese (Taiwan$$$$$$$$$slgneese (Taiwan$$$$$$$$$" + "'", str1, "Ese (Taiwan$$$$$$$$$slgneese (Taiwan$$$$$$$$$");
    }

    @Test
    public void test19911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19911");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("                                             italiahi                                              ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                             italiahi                                              " + "'", str1, "                                             italiahi                                              ");
    }

    @Test
    public void test19912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19912");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("LOCALE#LANGUAGERANGE", "java                                ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LOCALE#LANGUAGERANGE" + "'", str2, "LOCALE#LANGUAGERANGE");
    }

    @Test
    public void test19913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19913");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("tw", 29, "yListayListiiiiiiiiiiiiiiiiiiiiiiiArrayListiiiiiiiiiiiiiiiiiiiiiiiArrayListiiiiiiiiiiiiiiiiiiiiiiiArrayListiiiiiiiiiiiiiiiiiiiiiiiArrayListiiiiiiiiiiiiiiiiiiiiiiiArrayListiiiiiiiiiiiiiiiiiiiiiiiArrayListiiiiiiiiiiiiiiiiiiiiiiiArrayListiiiiiiiiiiiiiiiiiiiiiiiArraiiiiiiiiiiiiiiiiiiiiiiiAr");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "yListayListiitwyListayListiii" + "'", str3, "yListayListiitwyListayListiii");
    }

    @Test
    public void test19914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19914");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("zH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zH" + "'", str1, "zH");
    }

    @Test
    public void test19915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19915");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("NCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCARRAYLISTRING[]NCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCARRAYLISTRING[]NCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCARRAYLISTRING[]NCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCARRAYLISTRING[]NCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCARRAYLISTRING[]NCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCARRAYLIS", "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuchina (Chine)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test19916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19916");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("Ci_aCi_aCi_aCi_aCi_aCi_aCi_aCi_aCi_aCi_");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "CI_ACI_ACI_ACI_ACI_ACI_ACI_ACI_ACI_ACI_" + "'", str1, "CI_ACI_ACI_ACI_ACI_ACI_ACI_ACI_ACI_ACI_");
    }

    @Test
    public void test19917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19917");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("Locale", "xxxxxxxxxxxxxxJapanesexxxxxxxxxxxxxxxxxxxxxxxxxxxxJapanesexxxxxxxxxxxxxxxxxxxxxxxxxxxxJelacoL");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test19918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19918");
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
        java.util.Locale.Category category78 = java.util.Locale.Category.FORMAT;
        boolean boolean79 = languageRangeList23.remove((java.lang.Object) category78);
        java.util.Locale locale80 = java.util.Locale.ITALIAN;
        java.lang.String str81 = locale80.getLanguage();
        java.lang.String str82 = locale80.getLanguage();
        java.util.Set<java.lang.String> strSet83 = locale80.getUnicodeLocaleAttributes();
        java.lang.String str84 = locale80.getISO3Language();
        java.util.Locale.setDefault(category78, locale80);
        java.util.Locale locale86 = java.util.Locale.getDefault(category78);
        java.util.Locale locale87 = java.util.Locale.getDefault(category78);
        java.util.Locale locale88 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale89 = java.util.Locale.getDefault();
        java.lang.String str90 = locale88.getDisplayCountry(locale89);
        java.lang.String str91 = locale88.toLanguageTag();
        java.lang.String str92 = locale88.getCountry();
        java.util.Set<java.lang.String> strSet93 = locale88.getUnicodeLocaleAttributes();
        java.lang.String str94 = locale88.getDisplayName();
        java.util.Locale.setDefault(category78, locale88);
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
        org.junit.Assert.assertTrue("'" + category78 + "' != '" + java.util.Locale.Category.FORMAT + "'", category78.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(locale80);
        org.junit.Assert.assertEquals(locale80.toString(), "it");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "it" + "'", str81, "it");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "it" + "'", str82, "it");
        org.junit.Assert.assertNotNull(strSet83);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "ita" + "'", str84, "ita");
        org.junit.Assert.assertNotNull(locale86);
        org.junit.Assert.assertEquals(locale86.toString(), "it");
        org.junit.Assert.assertNotNull(locale87);
        org.junit.Assert.assertEquals(locale87.toString(), "it");
        org.junit.Assert.assertNotNull(locale88);
        org.junit.Assert.assertEquals(locale88.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale89);
        org.junit.Assert.assertEquals(locale89.toString(), "");
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "China" + "'", str90, "China");
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "zh-CN" + "'", str91, "zh-CN");
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "CN" + "'", str92, "CN");
        org.junit.Assert.assertNotNull(strSet93);
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "Chinese (China)" + "'", str94, "Chinese (China)");
    }

    @Test
    public void test19919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19919");
        java.util.Locale locale1 = java.util.Locale.PRC;
        java.lang.String str2 = locale1.getDisplayName();
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.upperCase("##############################################", locale1);
        java.util.Locale locale4 = java.util.Locale.FRANCE;
        java.lang.String str5 = locale4.getVariant();
        java.util.Locale locale7 = new java.util.Locale("");
        java.lang.String str8 = locale7.getDisplayLanguage();
        java.util.Locale locale9 = java.util.Locale.CANADA;
        java.lang.String str10 = locale9.getDisplayLanguage();
        java.lang.String str11 = locale7.getDisplayScript(locale9);
        java.util.Locale locale13 = java.util.Locale.FRANCE;
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale13);
        java.lang.String str15 = locale7.getDisplayCountry(locale13);
        java.lang.String str16 = locale4.getDisplayScript(locale7);
        java.lang.String str17 = locale4.getDisplayLanguage();
        java.lang.String str18 = locale1.getDisplayName(locale4);
        java.lang.String str19 = locale4.getDisplayCountry();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Chinese (China)" + "'", str2, "Chinese (China)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "##############################################" + "'", str3, "##############################################");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "French" + "'", str17, "French");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "chinois (Chine)" + "'", str18, "chinois (Chine)");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "France" + "'", str19, "France");
    }

    @Test
    public void test19920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19920");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("                  arraylist.listitr", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arraylist.listitr" + "'", str2, "arraylist.listitr");
    }

    @Test
    public void test19921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19921");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("CINA................................................................................................", "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxchn");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CINA................................................................................................" + "'", str2, "CINA................................................................................................");
    }

    @Test
    public void test19922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19922");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("                                                                                   HINDI (HI!,CHINA)", "              cinese               ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test19923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19923");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("   ");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("$", "");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("raaaaaaaaaaaaaaaaaaaingleseaaaaaaaaaaaaaaaaaaaaglAs", strArray2, strArray6);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "raaaaaaaaaaaaaaaaaaaingleseaaaaaaaaaaaaaaaaaaaaglAs" + "'", str7, "raaaaaaaaaaaaaaaaaaaingleseaaaaaaaaaaaaaaaaaaaaglAs");
    }

    @Test
    public void test19924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19924");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaafr");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test19925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19925");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "chi...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "chi..." + "'", str1, "chi...");
    }

    @Test
    public void test19926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19926");
        java.util.Locale locale2 = new java.util.Locale("");
        java.lang.String str3 = locale2.getDisplayLanguage();
        java.util.Locale locale4 = java.util.Locale.CANADA;
        java.lang.String str5 = locale4.getDisplayLanguage();
        java.lang.String str6 = locale2.getDisplayScript(locale4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.lowerCase("a", locale2);
        java.lang.String str8 = locale2.getDisplayScript();
        java.util.Set<java.lang.String> strSet9 = locale2.getUnicodeLocaleAttributes();
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
        java.util.Locale locale30 = locale10.stripExtensions();
        java.lang.String str31 = locale2.getDisplayVariant(locale30);
        java.util.Locale locale32 = locale2.stripExtensions();
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "English" + "'", str5, "English");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "a" + "'", str7, "a");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "China" + "'", str12, "China");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "zh-CN" + "'", str13, "zh-CN");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "zh" + "'", str14, "zh");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "it");
        org.junit.Assert.assertEquals(locale17.toString(), "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "English" + "'", str20, "English");
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
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "");
    }

    @Test
    public void test19927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19927");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("A#A#A#A#A#                      ", "cinaxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A#A#A#A#A#                      " + "'", str2, "A#A#A#A#A#                      ");
    }

    @Test
    public void test19928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19928");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("ZHCINESESE", 17);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ZHCINESESE       " + "'", str2, "ZHCINESESE       ");
    }

    @Test
    public void test19929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19929");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale locale3 = builder2.build();
        java.util.Locale.Builder builder4 = builder2.clearExtensions();
        java.util.Locale.Builder builder5 = builder4.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder4.removeUnicodeLocaleAttribute("\u6cd5\u6587");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: ?? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test19930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19930");
        java.util.Locale locale0 = java.util.Locale.CHINESE;
        java.util.Locale locale1 = java.util.Locale.JAPANESE;
        java.util.Locale locale3 = java.util.Locale.TAIWAN;
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.upperCase("", locale3);
        java.lang.String str5 = locale1.getDisplayVariant(locale3);
        java.util.Set<java.lang.Character> charSet6 = locale3.getExtensionKeys();
        java.util.Set<java.lang.String> strSet7 = locale3.getUnicodeLocaleAttributes();
        java.util.Locale locale10 = new java.util.Locale("ahi!hi!", "                 a                 ");
        java.lang.String str11 = locale3.getDisplayScript(locale10);
        java.lang.String str12 = locale0.getDisplayName(locale3);
        java.lang.String str14 = locale3.getExtension('u');
        java.util.Locale.Builder builder15 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder16 = builder15.clearExtensions();
        java.util.Locale.Builder builder18 = builder16.setLanguageTag("zh-CN");
        java.util.Locale.Builder builder20 = builder18.setLanguage("CHINA");
        java.util.Locale locale21 = builder18.build();
        java.util.Set<java.lang.String> strSet22 = locale21.getUnicodeLocaleKeys();
        java.lang.String str23 = locale21.getDisplayCountry();
        java.lang.String str24 = locale21.getScript();
        java.util.Locale locale27 = java.util.Locale.forLanguageTag("FR");
        java.lang.String str28 = org.apache.commons.lang3.StringUtils.lowerCase("EnglHI!STRING[]STRING[]SsHI!STRING[]STRING[]S", locale27);
        java.lang.String str29 = locale21.getDisplayName(locale27);
        java.lang.String str30 = locale3.getDisplayLanguage(locale27);
        java.util.Locale.Builder builder31 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder32 = builder31.clearExtensions();
        java.util.Locale.Builder builder34 = builder32.setLanguageTag("zh-CN");
        java.util.Locale.Builder builder35 = builder34.clearExtensions();
        java.util.Locale.Builder builder37 = builder34.setLanguageTag("ANIHC");
        java.util.Locale locale39 = java.util.Locale.forLanguageTag("ud");
        java.util.Locale.Builder builder40 = builder37.setLocale(locale39);
        java.lang.String str41 = locale27.getDisplayVariant(locale39);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ja");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(charSet6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertEquals(locale10.toString(), "ahi!hi!_                 A                 ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\u4e2d\u6587" + "'", str12, "\u4e2d\u6587");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "china_CN");
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "China" + "'", str23, "China");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "englhi!string[]string[]sshi!string[]string[]s" + "'", str28, "englhi!string[]string[]sshi!string[]string[]s");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "china (Chine)" + "'", str29, "china (Chine)");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "chinois" + "'", str30, "chinois");
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "ud");
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
    }

    @Test
    public void test19931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19931");
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
        int int18 = languageRangeList1.size();
        java.lang.Object[] objArray19 = languageRangeList1.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList22 = languageRangeList1.subList(81, 19);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 19");
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
        org.junit.Assert.assertNotNull(languageRangeSpliterator16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
    }

    @Test
    public void test19932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19932");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortClassName("REDLIUB");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "REDLIUB" + "'", str1, "REDLIUB");
    }

    @Test
    public void test19933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19933");
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
        java.util.Locale.Builder builder20 = builder18.setScript("");
        java.util.Locale.Builder builder21 = builder20.clear();
        java.util.Locale.Category category22 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale23 = java.util.Locale.ENGLISH;
        java.util.Locale.setDefault(category22, locale23);
        java.util.Locale locale25 = java.util.Locale.JAPANESE;
        java.util.Locale locale27 = java.util.Locale.TAIWAN;
        java.lang.String str28 = org.apache.commons.lang3.StringUtils.upperCase("", locale27);
        java.lang.String str29 = locale25.getDisplayVariant(locale27);
        java.util.Locale.setDefault(category22, locale27);
        java.util.Locale locale31 = locale27.stripExtensions();
        java.util.Locale.Builder builder32 = builder20.setLocale(locale27);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "China" + "'", str7, "China");
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
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertTrue("'" + category22 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category22.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "en");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "ja");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(builder32);
    }

    @Test
    public void test19934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19934");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "...       ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test19935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19935");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("AHI!HI!                                      .......................................................", 116);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AHI!HI!                                      ......................................................." + "'", str2, "AHI!HI!                                      .......................................................");
    }

    @Test
    public void test19936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19936");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("Englensen", '.');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test19937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19937");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)Character", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXZH-CNENGLH", "Xxxxxxxxinglese (Canada)xxxxxxxx");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)Character" + "'", str3, "CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)CharacterengliIlishenglcinese(Cina)Character");
    }

    @Test
    public void test19938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19938");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.setLanguageTag("zh-CN");
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.lang.String str6 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) builder3, "CHNaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        java.util.Locale.Builder builder8 = builder3.setLanguageTag("CN");
        java.util.Locale.Builder builder10 = builder8.addUnicodeLocaleAttribute("CHN");
        java.util.Locale.Builder builder11 = builder10.clear();
        java.util.Locale locale12 = java.util.Locale.PRC;
        java.lang.String str13 = locale12.getDisplayName();
        boolean boolean14 = locale12.hasExtensions();
        java.util.Locale locale16 = java.util.Locale.CHINA;
        java.util.Set<java.lang.Character> charSet17 = locale16.getExtensionKeys();
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.lowerCase("String[]", locale16);
        java.lang.String str19 = locale12.getDisplayScript(locale16);
        java.util.Locale.Builder builder20 = builder11.setLocale(locale16);
        java.lang.Class<?> wildcardClass21 = locale16.getClass();
        java.lang.String str23 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) wildcardClass21, "...X.Z.B.BB.BD.BE.BF.BG.BH.BI.BJ.BL.BM.BN...");
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Locale.Builder" + "'", str6, "Locale.Builder");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\u4e2d\u6587\u4e2d\u570b)" + "'", str13, "\u4e2d\u6587\u4e2d\u570b)");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(charSet17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "string[]" + "'", str18, "string[]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "java.lang" + "'", str23, "java.lang");
    }

    @Test
    public void test19939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19939");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("ch");
        java.lang.String str2 = locale1.getISO3Language();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ch");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "cha" + "'", str2, "cha");
    }

    @Test
    public void test19940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19940");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Ci_aCi_aCi_aCi_aCi_aCi_aCi_aCi_aCi_aCi_a");
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("English", "hi", (int) (short) -1);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("a", "");
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.stripAll(strArray11);
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.stripAll(strArray12);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", strArray8, strArray12);
        int int15 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxUSxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", strArray12);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("enenenenenen", strArray2, strArray12);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h" + "'", str14, "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "enenenenenen" + "'", str16, "enenenenenen");
    }

    @Test
    public void test19941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19941");
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
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap16 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList17 = java.util.Locale.LanguageRange.parse("ANIHC      ", strMap16);
        java.util.Locale.LanguageRange[] languageRangeArray18 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList19 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList19, languageRangeArray18);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap21 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList22 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList19, strMap21);
        boolean boolean23 = languageRangeList22.isEmpty();
        boolean boolean24 = languageRangeList17.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList22);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap26 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList27 = java.util.Locale.LanguageRange.parse("cHINA", strMap26);
        boolean boolean28 = languageRangeList22.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList27);
        int int29 = languageRangeList2.lastIndexOf((java.lang.Object) boolean28);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange31 = languageRangeList2.remove(22);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 22, Size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Locale.LanguageRange" + "'", str6, "Locale.LanguageRange");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "english" + "'", str7, "english");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(languageRangeList14);
        org.junit.Assert.assertNotNull(languageRangeList17);
        org.junit.Assert.assertNotNull(languageRangeArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(languageRangeList22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(languageRangeList27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
    }

    @Test
    public void test19942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19942");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.setLanguageTag("zh-CN");
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale.Builder builder6 = builder3.setLanguageTag("ANIHC");
        java.util.Locale.Builder builder7 = builder3.clearExtensions();
        java.util.Locale.Builder builder8 = builder3.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder8.setLanguageTag("nnnnnnnnnnnnnnnnnann");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: nnnnnnnnnnnnnnnnnann [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test19943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19943");
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
        languageRangeList7.clear();
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList7, '4');
        java.util.Locale.LanguageRange[] languageRangeArray15 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList16 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList16, languageRangeArray15);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap18 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList19 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList16, strMap18);
        int int20 = languageRangeList16.size();
        java.util.List<java.util.Locale.LanguageRange> languageRangeList22 = java.util.Locale.LanguageRange.parse("hi");
        boolean boolean24 = languageRangeList22.remove((java.lang.Object) "English");
        boolean boolean25 = languageRangeList16.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList22);
        java.util.Locale.LanguageRange[] languageRangeArray26 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList27 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList27, languageRangeArray26);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap29 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList30 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList27, strMap29);
        java.lang.String[] strArray38 = new java.lang.String[] { "English", "hi", "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "", "a", "", "China" };
        java.util.ArrayList<java.lang.String> strList39 = new java.util.ArrayList<java.lang.String>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList39, strArray38);
        java.util.List<java.lang.Class<?>> wildcardClassList41 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList39);
        java.lang.String str42 = java.util.Locale.lookupTag(languageRangeList30, (java.util.Collection<java.lang.String>) strList39);
        java.util.List<java.lang.Class<?>> wildcardClassList43 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList39);
        java.util.List<java.lang.String> strList44 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList16, (java.util.Collection<java.lang.String>) strList39);
        java.util.List<java.lang.String> strList45 = java.util.Locale.filterTags(languageRangeList7, (java.util.Collection<java.lang.String>) strList44);
        java.lang.String str47 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList7, '.');
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(languageRangeList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(languageRangeArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(languageRangeList19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(languageRangeList22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(languageRangeArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(languageRangeList30);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(wildcardClassList41);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNotNull(wildcardClassList43);
        org.junit.Assert.assertNotNull(strList44);
        org.junit.Assert.assertNotNull(strList45);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
    }

    @Test
    public void test19944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19944");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("lang                                                                                                ", "   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test19945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19945");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale.Builder builder1 = new java.util.Locale.Builder();
        java.util.Locale locale3 = java.util.Locale.FRANCE;
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale3);
        java.util.Locale.setDefault(locale3);
        java.util.Locale.Builder builder6 = builder1.setLocale(locale3);
        java.lang.String str8 = locale3.getExtension('x');
        java.util.Locale locale9 = java.util.Locale.PRC;
        java.lang.String str10 = locale9.getDisplayName();
        java.lang.String str11 = locale3.getDisplayCountry(locale9);
        java.util.Locale.setDefault(category0, locale9);
        java.util.Locale locale14 = new java.util.Locale("");
        java.lang.String str15 = locale14.getDisplayLanguage();
        java.util.Locale locale16 = java.util.Locale.CANADA;
        java.lang.String str17 = locale16.getDisplayLanguage();
        java.lang.String str18 = locale14.getDisplayScript(locale16);
        java.lang.String str19 = locale16.getDisplayVariant();
        java.util.Locale locale20 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale21 = java.util.Locale.getDefault();
        java.lang.String str22 = locale20.getDisplayCountry(locale21);
        java.lang.String str23 = locale21.getDisplayVariant();
        java.lang.String str24 = locale16.getDisplayScript(locale21);
        java.lang.String str25 = locale16.getISO3Language();
        java.lang.String str26 = locale16.getLanguage();
        java.util.Locale.setDefault(category0, locale16);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "english" + "'", str4, "english");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chinois (Chine)" + "'", str10, "chinois (Chine)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\u6cd5\u56fd" + "'", str11, "\u6cd5\u56fd");
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\u82f1\u6587" + "'", str17, "\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Chine" + "'", str22, "Chine");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "eng" + "'", str25, "eng");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "en" + "'", str26, "en");
    }

    @Test
    public void test19946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19946");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "GNAL.AVAJSTRING[]STRING[]STRING[");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test19947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19947");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("\u56fd\u4e2d\u6587\u4e2d   ", "...................................................................................");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u56fd\u4e2d\u6587\u4e2d   " + "'", str2, "\u56fd\u4e2d\u6587\u4e2d   ");
    }

    @Test
    public void test19948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19948");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("ANIHC      ", strMap1);
        java.util.Locale.LanguageRange[] languageRangeArray3 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList4 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList4, languageRangeArray3);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap6 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList7 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, strMap6);
        boolean boolean8 = languageRangeList7.isEmpty();
        boolean boolean9 = languageRangeList2.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList7);
        languageRangeList7.clear();
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream11 = languageRangeList7.stream();
        java.util.Locale.LanguageRange[] languageRangeArray12 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList13 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList13, languageRangeArray12);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap15 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList16 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList13, strMap15);
        int int17 = languageRangeList13.size();
        java.util.List<java.util.Locale.LanguageRange> languageRangeList19 = java.util.Locale.LanguageRange.parse("hi");
        boolean boolean21 = languageRangeList19.remove((java.lang.Object) "English");
        boolean boolean22 = languageRangeList13.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList19);
        int int23 = languageRangeList19.size();
        java.util.Iterator<java.util.Locale.LanguageRange> languageRangeItor24 = languageRangeList19.iterator();
        int int25 = languageRangeList19.size();
        java.util.Locale.LanguageRange[] languageRangeArray26 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList27 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList27, languageRangeArray26);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap29 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList30 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList27, strMap29);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList32 = java.util.Locale.LanguageRange.parse("hi");
        java.lang.Object[] objArray33 = languageRangeList32.toArray();
        java.util.Spliterator<java.util.Locale.LanguageRange> languageRangeSpliterator34 = languageRangeList32.spliterator();
        boolean boolean35 = languageRangeList27.containsAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList32);
        java.util.Locale.LanguageRange languageRange37 = new java.util.Locale.LanguageRange("English");
        java.lang.String str39 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) languageRange37, "");
        java.util.Locale.LanguageRange languageRange41 = new java.util.Locale.LanguageRange("a");
        java.util.Locale.LanguageRange languageRange43 = new java.util.Locale.LanguageRange("a");
        java.util.Locale.LanguageRange[] languageRangeArray44 = new java.util.Locale.LanguageRange[] { languageRange37, languageRange41, languageRange43 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList45 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList45, languageRangeArray44);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor47 = languageRangeList45.listIterator();
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream48 = languageRangeList45.parallelStream();
        java.util.List<java.util.Locale.LanguageRange> languageRangeList50 = java.util.Locale.LanguageRange.parse("hi");
        int int52 = languageRangeList50.indexOf((java.lang.Object) '4');
        java.util.Locale.LanguageRange[] languageRangeArray53 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList54 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList54, languageRangeArray53);
        java.util.Locale locale57 = java.util.Locale.FRANCE;
        java.lang.String str58 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale57);
        java.util.Locale locale59 = java.util.Locale.US;
        java.util.Locale locale60 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale61 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale62 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale63 = java.util.Locale.getDefault();
        java.lang.String str64 = locale62.getDisplayCountry(locale63);
        java.lang.String str65 = locale62.toLanguageTag();
        java.util.Locale locale66 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale67 = java.util.Locale.getDefault();
        java.lang.String str68 = locale66.getDisplayCountry(locale67);
        java.util.Locale locale69 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale70 = java.util.Locale.getDefault();
        java.lang.String str71 = locale69.getDisplayCountry(locale70);
        java.util.Locale locale75 = new java.util.Locale("hi", "hi!", "cHINA");
        java.util.Locale locale76 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale77 = java.util.Locale.getDefault();
        java.lang.String str78 = locale76.getDisplayCountry(locale77);
        java.util.Locale locale80 = new java.util.Locale("");
        java.lang.String str81 = locale80.getDisplayVariant();
        java.util.Locale locale82 = java.util.Locale.KOREAN;
        java.util.Locale locale84 = new java.util.Locale("");
        java.util.Locale locale85 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale[] localeArray86 = new java.util.Locale[] { locale57, locale59, locale60, locale61, locale62, locale67, locale69, locale75, locale77, locale80, locale82, locale84, locale85 };
        java.util.ArrayList<java.util.Locale> localeList87 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList87, localeArray86);
        java.util.List<java.util.Locale> localeList89 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList54, (java.util.Collection<java.util.Locale>) localeList87);
        java.util.List<java.util.Locale> localeList90 = java.util.Locale.filter(languageRangeList50, (java.util.Collection<java.util.Locale>) localeList89);
        java.util.Locale.FilteringMode filteringMode91 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList92 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList45, (java.util.Collection<java.util.Locale>) localeList90, filteringMode91);
        java.util.Locale locale93 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList27, (java.util.Collection<java.util.Locale>) localeList90);
        java.util.Locale locale94 = java.util.Locale.lookup(languageRangeList19, (java.util.Collection<java.util.Locale>) localeList90);
        boolean boolean95 = languageRangeList7.retainAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList19);
        java.util.Spliterator<java.util.Locale.LanguageRange> languageRangeSpliterator96 = languageRangeList19.spliterator();
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(languageRangeList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(languageRangeStream11);
        org.junit.Assert.assertNotNull(languageRangeArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(languageRangeList16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(languageRangeList19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(languageRangeItor24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(languageRangeArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(languageRangeList30);
        org.junit.Assert.assertNotNull(languageRangeList32);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertNotNull(languageRangeSpliterator34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Locale.LanguageRange" + "'", str39, "Locale.LanguageRange");
        org.junit.Assert.assertNotNull(languageRangeArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(languageRangeItor47);
        org.junit.Assert.assertNotNull(languageRangeStream48);
        org.junit.Assert.assertNotNull(languageRangeList50);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNotNull(languageRangeArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(locale57);
        org.junit.Assert.assertEquals(locale57.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "english" + "'", str58, "english");
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale60);
        org.junit.Assert.assertEquals(locale60.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale61);
        org.junit.Assert.assertEquals(locale61.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale62);
        org.junit.Assert.assertEquals(locale62.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "Chine" + "'", str64, "Chine");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "zh-CN" + "'", str65, "zh-CN");
        org.junit.Assert.assertNotNull(locale66);
        org.junit.Assert.assertEquals(locale66.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale67);
        org.junit.Assert.assertEquals(locale67.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "Chine" + "'", str68, "Chine");
        org.junit.Assert.assertNotNull(locale69);
        org.junit.Assert.assertEquals(locale69.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale70);
        org.junit.Assert.assertEquals(locale70.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "Chine" + "'", str71, "Chine");
        org.junit.Assert.assertEquals(locale75.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale76);
        org.junit.Assert.assertEquals(locale76.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale77);
        org.junit.Assert.assertEquals(locale77.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "Chine" + "'", str78, "Chine");
        org.junit.Assert.assertEquals(locale80.toString(), "");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
        org.junit.Assert.assertNotNull(locale82);
        org.junit.Assert.assertEquals(locale82.toString(), "ko");
        org.junit.Assert.assertEquals(locale84.toString(), "");
        org.junit.Assert.assertNotNull(locale85);
        org.junit.Assert.assertEquals(locale85.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray86);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertNotNull(localeList89);
        org.junit.Assert.assertNotNull(localeList90);
        org.junit.Assert.assertTrue("'" + filteringMode91 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode91.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList92);
        org.junit.Assert.assertNull(locale93);
        org.junit.Assert.assertNull(locale94);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertNotNull(languageRangeSpliterator96);
    }

    @Test
    public void test19949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19949");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("ENENENENENENENENENEN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ENENENENENENENENENE" + "'", str1, "ENENENENENENENENENE");
    }

    @Test
    public void test19950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19950");
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
        java.lang.String str23 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) languageRangeList1, "Chinese (China)");
        java.util.Locale.LanguageRange[] languageRangeArray24 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList25 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList25, languageRangeArray24);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap27 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList28 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList25, strMap27);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor29 = languageRangeList28.listIterator();
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList32 = new java.util.ArrayList<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList32, strArray31);
        java.util.Locale.LanguageRange[] languageRangeArray34 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList35 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList35, languageRangeArray34);
        java.util.Locale locale38 = java.util.Locale.FRANCE;
        java.lang.String str39 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale38);
        java.util.Locale locale40 = java.util.Locale.US;
        java.util.Locale locale41 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale42 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale43 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale44 = java.util.Locale.getDefault();
        java.lang.String str45 = locale43.getDisplayCountry(locale44);
        java.lang.String str46 = locale43.toLanguageTag();
        java.util.Locale locale47 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale48 = java.util.Locale.getDefault();
        java.lang.String str49 = locale47.getDisplayCountry(locale48);
        java.util.Locale locale50 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale51 = java.util.Locale.getDefault();
        java.lang.String str52 = locale50.getDisplayCountry(locale51);
        java.util.Locale locale56 = new java.util.Locale("hi", "hi!", "cHINA");
        java.util.Locale locale57 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale58 = java.util.Locale.getDefault();
        java.lang.String str59 = locale57.getDisplayCountry(locale58);
        java.util.Locale locale61 = new java.util.Locale("");
        java.lang.String str62 = locale61.getDisplayVariant();
        java.util.Locale locale63 = java.util.Locale.KOREAN;
        java.util.Locale locale65 = new java.util.Locale("");
        java.util.Locale locale66 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale[] localeArray67 = new java.util.Locale[] { locale38, locale40, locale41, locale42, locale43, locale48, locale50, locale56, locale58, locale61, locale63, locale65, locale66 };
        java.util.ArrayList<java.util.Locale> localeList68 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList68, localeArray67);
        java.util.List<java.util.Locale> localeList70 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList35, (java.util.Collection<java.util.Locale>) localeList68);
        java.lang.String[] strArray78 = new java.lang.String[] { "English", "hi", "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "", "a", "", "China" };
        java.util.ArrayList<java.lang.String> strList79 = new java.util.ArrayList<java.lang.String>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList79, strArray78);
        java.util.List<java.lang.Class<?>> wildcardClassList81 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList79);
        java.util.Locale.FilteringMode filteringMode82 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList83 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList35, (java.util.Collection<java.lang.String>) strList79, filteringMode82);
        java.util.List<java.lang.String> strList84 = java.util.Locale.filterTags(languageRangeList28, (java.util.Collection<java.lang.String>) strList32, filteringMode82);
        java.util.List<java.lang.Class<?>> wildcardClassList85 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses(strList84);
        java.util.List<java.lang.Class<?>> wildcardClassList86 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses(strList84);
        java.lang.String str87 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList84);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream88 = languageRangeList1.parallelStream();
        java.util.Spliterator<java.util.Locale.LanguageRange> languageRangeSpliterator89 = languageRangeList1.spliterator();
        java.util.function.UnaryOperator<java.util.Locale.LanguageRange> languageRangeUnaryOperator90 = null;
        // The following exception was thrown during execution in test generation
        try {
            languageRangeList1.replaceAll(languageRangeUnaryOperator90);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "ArrayList" + "'", str23, "ArrayList");
        org.junit.Assert.assertNotNull(languageRangeArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(languageRangeList28);
        org.junit.Assert.assertNotNull(languageRangeItor29);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(languageRangeArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "english" + "'", str39, "english");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Chine" + "'", str45, "Chine");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "zh-CN" + "'", str46, "zh-CN");
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Chine" + "'", str49, "Chine");
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "Chine" + "'", str52, "Chine");
        org.junit.Assert.assertEquals(locale56.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale57);
        org.junit.Assert.assertEquals(locale57.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "Chine" + "'", str59, "Chine");
        org.junit.Assert.assertEquals(locale61.toString(), "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "ko");
        org.junit.Assert.assertEquals(locale65.toString(), "");
        org.junit.Assert.assertNotNull(locale66);
        org.junit.Assert.assertEquals(locale66.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(localeList70);
        org.junit.Assert.assertNotNull(strArray78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(wildcardClassList81);
        org.junit.Assert.assertTrue("'" + filteringMode82 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode82.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList83);
        org.junit.Assert.assertNotNull(strList84);
        org.junit.Assert.assertNotNull(wildcardClassList85);
        org.junit.Assert.assertNotNull(wildcardClassList86);
        org.junit.Assert.assertNull(str87);
        org.junit.Assert.assertNotNull(languageRangeStream88);
        org.junit.Assert.assertNotNull(languageRangeSpliterator89);
    }

    @Test
    public void test19951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19951");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("friFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfricines                                                                                                                                                                                                                                                                                  friFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfri", (int) 'u');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "friFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfricines                                                                                                                                                                                                                                                                                  friFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfri" + "'", str2, "friFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfricines                                                                                                                                                                                                                                                                                  friFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfri");
    }

    @Test
    public void test19952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19952");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("Z......................", 7, 107);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Z......................" + "'", str3, "Z......................");
    }

    @Test
    public void test19953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19953");
        java.util.Locale locale2 = new java.util.Locale("italiano", "Ci_a");
        boolean boolean3 = locale2.hasExtensions();
        java.lang.String str5 = locale2.getExtension('u');
        org.junit.Assert.assertEquals(locale2.toString(), "italiano_CI_A");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test19954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19954");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("CN        ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "        NC" + "'", str1, "        NC");
    }

    @Test
    public void test19955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19955");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap3);
        int int5 = languageRangeList1.size();
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor6 = languageRangeList1.listIterator();
        boolean boolean7 = languageRangeItor6.hasNext();
        java.lang.String str9 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) languageRangeItor6, "");
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(languageRangeItor6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ArrayList.ListItr" + "'", str9, "ArrayList.ListItr");
    }

    @Test
    public void test19956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19956");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("...........................................................................................t           hindi(HI!,cHINA)............................................................................................");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...........................................................................................t           hindi(HI!,cHINA)............................................................................................" + "'", str1, "...........................................................................................t           hindi(HI!,cHINA)............................................................................................");
    }

    @Test
    public void test19957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19957");
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
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream26 = languageRangeList1.parallelStream();
        java.util.Spliterator<java.util.Locale.LanguageRange> languageRangeSpliterator27 = languageRangeList1.spliterator();
        java.util.Locale locale29 = new java.util.Locale("Taiwan");
        java.lang.String str30 = locale29.getDisplayCountry();
        java.lang.String str31 = locale29.getScript();
        int int32 = languageRangeList1.lastIndexOf((java.lang.Object) str31);
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
        org.junit.Assert.assertNotNull(languageRangeStream26);
        org.junit.Assert.assertNotNull(languageRangeSpliterator27);
        org.junit.Assert.assertEquals(locale29.toString(), "taiwan");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
    }

    @Test
    public void test19958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19958");
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
        double double18 = languageRange14.getWeight();
        boolean boolean20 = languageRange14.equals((java.lang.Object) "cinese (Taiwan)");
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
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test19959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19959");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder0.removeUnicodeLocaleAttribute("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444)enihc(sionihc");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: 4444444444444444444444444444444444444444444444444444444444444444444444444444444444444)enihc(sionihc [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test19960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19960");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("...       ", "ZH");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test19961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19961");
        java.util.Locale locale2 = new java.util.Locale("...xxxxx", "WT_hz");
        org.junit.Assert.assertEquals(locale2.toString(), "...xxxxx_WT_HZ");
    }

    @Test
    public void test19962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19962");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("                                           nawiaT(ese                                                                                       nawiaT(ese                                                                                       nawiaT(ese                                                                                       )adanaC( eselgni", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                           nawiaT(ese                                                                                       nawiaT(ese                                                                                       nawiaT(ese                                                                                       )adanaC( eselgni" + "'", str2, "                                           nawiaT(ese                                                                                       nawiaT(ese                                                                                       nawiaT(ese                                                                                       )adanaC( eselgni");
    }

    @Test
    public void test19963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19963");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("ItaliItaliItaliItaliIta#...", 31, "xxANIHCxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ItaliItaliItaliItaliIta#...xxAN" + "'", str3, "ItaliItaliItaliItaliIta#...xxAN");
    }

    @Test
    public void test19964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19964");
        java.util.Locale locale3 = new java.util.Locale("nglais", "                    nglish  Hindi (HI!,cHINA", "Hindi (HI!,cHINA)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        java.lang.String str4 = locale3.getDisplayVariant();
        org.junit.Assert.assertEquals(locale3.toString(), "nglais_                    NGLISH  HINDI (HI!,CHINA_Hindi (HI!,cHINA)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hindi (HI!,cHINA)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str4, "Hindi (HI!,cHINA)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test19965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19965");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("asaavaayaazabaabeabgabhabiabmabnaboabrabsacaaceachacoacracsacuacvacyadaadeadvadzaeeaelaenaeoaesaetaeuafaaffafiafjafoafrafyagaagdaglagnaguagvahaaheahiahoahrahtahuahyahzaiaaidaieaigaiiaikainaioaisaitaiuaiwajaajiajvakaakgakiakjakkaklakmaknakoakraksakuakvakwakyalaalbalgalialnaloaltalualvamgamhamiamkamlamnamoamramsamtamyanaanband", "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test19966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19966");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("\u53f0\u6e7e\u5730\u533a####", "inglese (Stati Uniti)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u53f0\u6e7e\u5730\u533a####" + "'", str2, "\u53f0\u6e7e\u5730\u533a####");
    }

    @Test
    public void test19967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19967");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap3);
        java.util.Locale.LanguageRange[] languageRangeArray5 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList6 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList6, languageRangeArray5);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap8 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList9 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList6, strMap8);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor10 = languageRangeList9.listIterator();
        char[][] charArray11 = new char[][] {};
        char[][] charArray12 = languageRangeList9.toArray(charArray11);
        char[][] charArray13 = languageRangeList1.toArray(charArray12);
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
        java.util.Spliterator<java.util.Locale.LanguageRange> languageRangeSpliterator51 = languageRangeList15.spliterator();
        java.util.Spliterator<java.util.Locale.LanguageRange> languageRangeSpliterator52 = languageRangeList15.spliterator();
        boolean boolean53 = languageRangeList1.containsAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList15);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor54 = languageRangeList15.listIterator();
        java.lang.String str56 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList15, '4');
        java.util.Locale.LanguageRange[] languageRangeArray57 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList58 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList58, languageRangeArray57);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap60 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList61 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList58, strMap60);
        int int62 = languageRangeList58.size();
        java.util.Locale.LanguageRange languageRange64 = new java.util.Locale.LanguageRange("English");
        java.util.Locale.LanguageRange languageRange66 = new java.util.Locale.LanguageRange("English");
        java.util.Locale.LanguageRange languageRange68 = new java.util.Locale.LanguageRange("a");
        java.util.Locale.LanguageRange[] languageRangeArray69 = new java.util.Locale.LanguageRange[] { languageRange64, languageRange66, languageRange68 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList70 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList70, languageRangeArray69);
        boolean boolean72 = languageRangeList58.retainAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList70);
        boolean boolean74 = languageRangeList70.equals((java.lang.Object) "Cina");
        java.lang.Object[] objArray75 = languageRangeList70.toArray();
        java.util.Locale.LanguageRange[] languageRangeArray77 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList78 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList78, languageRangeArray77);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap80 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList81 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList78, strMap80);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream82 = languageRangeList78.stream();
        boolean boolean83 = languageRangeList78.isEmpty();
        java.lang.String str85 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList78, '#');
        boolean boolean86 = languageRangeList70.addAll(0, (java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList78);
        boolean boolean87 = languageRangeList15.retainAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList78);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(languageRangeArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(languageRangeList9);
        org.junit.Assert.assertNotNull(languageRangeItor10);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertNotNull(charArray13);
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
        org.junit.Assert.assertEquals(locale24.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Chine" + "'", str25, "Chine");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "zh-CN" + "'", str26, "zh-CN");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Chine" + "'", str29, "Chine");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Chine" + "'", str32, "Chine");
        org.junit.Assert.assertEquals(locale36.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Chine" + "'", str39, "Chine");
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
        org.junit.Assert.assertNotNull(languageRangeSpliterator51);
        org.junit.Assert.assertNotNull(languageRangeSpliterator52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(languageRangeItor54);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertNotNull(languageRangeArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(languageRangeList61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(languageRangeArray69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(objArray75);
        org.junit.Assert.assertNotNull(languageRangeArray77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(languageRangeList81);
        org.junit.Assert.assertNotNull(languageRangeStream82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "" + "'", str85, "");
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
    }

    @Test
    public void test19968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19968");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("################################################################################################################lang", 35, 51);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###################################################" + "'", str3, "###################################################");
    }

    @Test
    public void test19969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19969");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "javacinese.cineselang                                                ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test19970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19970");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("Chinaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", ' ');
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Chinaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "Chinaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test19971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19971");
        java.util.Locale locale1 = new java.util.Locale("ENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISH");
        java.lang.String str2 = locale1.toLanguageTag();
        java.util.Locale locale3 = locale1.stripExtensions();
        java.util.Locale locale4 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale.setDefault(locale4);
        java.lang.String str6 = locale4.getDisplayCountry();
        java.lang.String str7 = locale1.getDisplayVariant(locale4);
        boolean boolean8 = locale4.hasExtensions();
        java.lang.String str10 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) boolean8, "                CHINOIS(CHINE)                 ");
        org.junit.Assert.assertEquals(locale1.toString(), "englishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglish");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "und" + "'", str2, "und");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "englishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglish");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u4e2d\u56fd" + "'", str6, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.lang" + "'", str10, "java.lang");
    }

    @Test
    public void test19972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19972");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("", "                    nglish  Hindi (HI!,cHINA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test19973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19973");
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
        java.lang.Object[] objArray21 = languageRangeList15.toArray();
        java.util.Locale.LanguageRange[] languageRangeArray22 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList23 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList23, languageRangeArray22);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap25 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList26 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList23, strMap25);
        int int27 = languageRangeList23.size();
        java.lang.Class[] classArray29 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray30 = (java.lang.Class<?>[]) classArray29;
        java.lang.Class<?>[] wildcardClassArray31 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray29);
        boolean boolean32 = languageRangeList23.equals((java.lang.Object) wildcardClassArray31);
        boolean boolean33 = languageRangeList23.isEmpty();
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor34 = languageRangeList23.listIterator();
        boolean boolean35 = languageRangeList15.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList23);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap37 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList38 = java.util.Locale.LanguageRange.parse("Cina", strMap37);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap39 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList40 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList38, strMap39);
        java.util.Locale.LanguageRange[] languageRangeArray41 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList42 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList42, languageRangeArray41);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap44 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList45 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList42, strMap44);
        int int46 = languageRangeList42.size();
        boolean boolean47 = languageRangeList38.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList42);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream48 = languageRangeList38.stream();
        java.util.Locale.LanguageRange languageRange50 = new java.util.Locale.LanguageRange("zho");
        double double51 = languageRange50.getWeight();
        boolean boolean52 = languageRangeList38.add(languageRange50);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap54 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList55 = java.util.Locale.LanguageRange.parse("it", strMap54);
        java.lang.String str57 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList55, '#');
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap58 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList59 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList55, strMap58);
        int int60 = languageRangeList38.indexOf((java.lang.Object) languageRangeList59);
        boolean boolean61 = languageRangeList23.containsAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList38);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList64 = languageRangeList23.subList((int) 'a', 18);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 18");
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
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertNotNull(languageRangeArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(languageRangeList26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(classArray29);
        org.junit.Assert.assertNotNull(wildcardClassArray30);
        org.junit.Assert.assertNotNull(wildcardClassArray31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(languageRangeItor34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(languageRangeList38);
        org.junit.Assert.assertNotNull(languageRangeList40);
        org.junit.Assert.assertNotNull(languageRangeArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(languageRangeList45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(languageRangeStream48);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 1.0d + "'", double51 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(languageRangeList55);
        org.junit.Assert.assertNotNull(languageRangeList59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    }

    @Test
    public void test19974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19974");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "java.lang");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "java.lang" + "'", str1, "java.lang");
    }

    @Test
    public void test19975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19975");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder4.setVariant("tRING[]TRING[]TRING[]TRING[]TRING[]T...");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: tRING[]TRING[]TRING[]TRING[]TRING[]T... [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test19976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19976");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "aN");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test19977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19977");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName("An                             ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test19978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19978");
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
        java.util.Locale.LanguageRange languageRange83 = new java.util.Locale.LanguageRange("English");
        java.lang.String str84 = languageRange83.getRange();
        boolean boolean85 = languageRangeList23.add(languageRange83);
        java.lang.String[] strArray89 = org.apache.commons.lang3.StringUtils.split("CNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCARRAYLIST", '#');
        boolean boolean90 = org.apache.commons.lang3.StringUtils.endsWithAny("ja", strArray89);
        boolean boolean91 = languageRange83.equals((java.lang.Object) boolean90);
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
        org.junit.Assert.assertEquals(locale38.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "\u4e2d\u56fd" + "'", str39, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "zh-CN" + "'", str40, "zh-CN");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "\u4e2d\u56fd" + "'", str43, "\u4e2d\u56fd");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "\u4e2d\u56fd" + "'", str46, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals(locale50.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "\u4e2d\u56fd" + "'", str53, "\u4e2d\u56fd");
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
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "english" + "'", str84, "english");
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertNotNull(strArray89);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
    }

    @Test
    public void test19979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19979");
        java.util.Locale.Category category1 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale4 = new java.util.Locale("");
        java.lang.String str5 = locale4.getDisplayLanguage();
        java.util.Locale locale6 = java.util.Locale.CANADA;
        java.lang.String str7 = locale6.getDisplayLanguage();
        java.lang.String str8 = locale4.getDisplayScript(locale6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.lowerCase("a", locale4);
        java.lang.String str10 = locale4.getDisplayScript();
        java.util.Locale.setDefault(category1, locale4);
        java.util.Locale locale12 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale13 = java.util.Locale.getDefault();
        java.lang.String str14 = locale12.getDisplayCountry(locale13);
        java.lang.String str15 = locale13.getDisplayVariant();
        java.util.Locale.setDefault(category1, locale13);
        java.util.Locale locale17 = java.util.Locale.getDefault(category1);
        java.util.Locale locale20 = new java.util.Locale("zho", "US");
        java.util.Locale locale21 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str22 = locale20.getDisplayVariant(locale21);
        java.util.Locale.setDefault(category1, locale20);
        java.lang.String str24 = locale20.getLanguage();
        java.lang.String str25 = org.apache.commons.lang3.StringUtils.lowerCase("                  hI   Taiwan                  hI                                                                       ", locale20);
        org.junit.Assert.assertTrue("'" + category1 + "' != '" + java.util.Locale.Category.FORMAT + "'", category1.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u82f1\u6587" + "'", str7, "\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "a" + "'", str9, "a");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\u4e2d\u56fd" + "'", str14, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "zh_CN");
        org.junit.Assert.assertEquals(locale20.toString(), "zho_US");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "zho" + "'", str24, "zho");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "                  hi   taiwan                  hi                                                                       " + "'", str25, "                  hi   taiwan                  hi                                                                       ");
    }

    @Test
    public void test19980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19980");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale.Builder builder3 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder5 = builder1.setRegion("zh");
        java.util.Locale.Builder builder6 = builder5.clear();
        java.util.Locale.Builder builder7 = builder6.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder6.setLanguageTag("##############################################");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: ############################################## [at index 0]");
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
    }

    @Test
    public void test19981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19981");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  A   ", "hsilgnE#########################hsilgnE#########################hsilgnE#########################hsilgnE#########################hsilgnE#########################hsilgnE#########################hsilgnE#########################hsilgnE#########################hsilgnE#########################hsilgnE#########################hsilgnE#########################hsilgnE#########################hsilgnE#########################hsilgnE#########################hsilgnE#########################hsilgnE#########################hsilgnE################ShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShort");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test19982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19982");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ArrsyList", 339);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                   " + "'", str2, "                                                                                                                                                                                                                                                                                                                                                   ");
    }

    @Test
    public void test19983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19983");
        java.util.Locale locale0 = java.util.Locale.CANADA;
        boolean boolean1 = locale0.hasExtensions();
        java.util.Locale locale2 = java.util.Locale.ITALIAN;
        java.lang.String str3 = locale0.getDisplayScript(locale2);
        java.lang.String str4 = locale0.getDisplayScript();
        java.lang.String str5 = locale0.getDisplayName();
        java.util.Set<java.lang.Character> charSet6 = locale0.getExtensionKeys();
        java.lang.String str7 = locale0.getDisplayVariant();
        java.lang.String str8 = locale0.getVariant();
        java.util.Set<java.lang.String> strSet9 = locale0.getUnicodeLocaleAttributes();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "it");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u82f1\u6587\u52a0\u62ff\u5927)" + "'", str5, "\u82f1\u6587\u52a0\u62ff\u5927)");
        org.junit.Assert.assertNotNull(charSet6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strSet9);
    }

    @Test
    public void test19984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19984");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("ChinesHin");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "CHINESHIN" + "'", str1, "CHINESHIN");
    }

    @Test
    public void test19985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19985");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "uuuuuxxxxxxxxxxxxxxJ$p$nesexxxxxxxxxxxxxxuuuuu");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test19986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19986");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("xxxx", "h                                                gnalesenic.esenicavaj                                                I", "ncncnncnchar[].............................................................................................ncncnncnc");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test19987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19987");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = org.apache.commons.lang3.ClassUtils.getClass("\u4e2d\u56fd");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: cnn??");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test19988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19988");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("\ud504\ub791\uc2a4\uc5b4", "          ...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test19989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19989");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("A   ", "...########       HI!", "HI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "A   " + "'", str3, "A   ");
    }

    @Test
    public void test19990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19990");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            italiahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIital...", (java.lang.CharSequence) "AaaaaaaaaaaitaliahI");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 729 + "'", int2 == 729);
    }

    @Test
    public void test19991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19991");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("CINACI", "L.AVAJSTRING[]STRING[]STRING[");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test19992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19992");
        char[] charArray12 = new char[] {};
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "zh-CN", charArray12);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("                 a                  ", charArray12);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) ".", charArray12);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi", charArray12);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "de", charArray12);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsAny("EN", charArray12);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "EnglTWNsTWN", charArray12);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "ITALIAHi", charArray12);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "italiahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIital...xxxx", charArray12);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsAny("ingleseuingleseuingleseuinjava.lang", charArray12);
        boolean boolean24 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                 xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxchn                                  ", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test19993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19993");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("can               ", "h$Iuuuuuu");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "can               " + "'", str2, "can               ");
    }

    @Test
    public void test19994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19994");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("A#A#A#A#A#", "en-CA");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test19995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19995");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("EnglisaCOL", 16, 23);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test19996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19996");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("zh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CTWzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-C", "sti-f");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test19997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19997");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("                       TW", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test19998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19998");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("ahi!hi!hi!hi!hi...", 32);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ahi!hi!hi!hi!hi..." + "'", str2, "ahi!hi!hi!hi!hi...");
    }

    @Test
    public void test19999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19999");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("              cinese               ", ")");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test20000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test20000");
        java.util.Locale locale3 = new java.util.Locale("zho", "US");
        java.util.Locale locale4 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str5 = locale3.getDisplayVariant(locale4);
        java.lang.String str6 = locale4.getVariant();
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.upperCase("AD.AE.AF.AG.AI.AL.AM.AN.AO.AQ.AR.AS.AT.AU.AW.AX.AZ.BA.BB.BD.BE.BF.BG.BH.BI.BJ.BL.BM.BN.BO.BQ.BR.BS.BT.BV.BW.BY.BZ.CA.CC.CD.CF.CG.CH.CI.CK.CL.CM.CN.CO.CR.CU.CV.CW.CX.CY.CZ.DE.DJ.DK.DM.DO.DZ.EC.EE.EG.EH.ER.ES.ET.FI.FJ.FK.FM.FO.FR.GA.GB.GD.GE.GF.GG.GH.GI.GL.GM.GN.GP.GQ.GR.GS.GT.GU.GW.GY.HK.HM.HN.HR.HT.HU.ID.IE.IL.IM.IN.IO.IQ.IR.IS.IT.JE.JM.JO.JP.KE.KG.KH.KI.KM.KN.KP.KR.KW.KY.KZ.LA.LB.LC.LI.LK.LR.LS.LT.LU.LV.LY.MA.MC.MD.ME.MF.MG.MH.MK.ML.MM.MN.MO.MP.MQ.MR.MS.MT.MU.MV.MW.MX.MY.MZ.NA.NC.NE.NF.NG.NI.NL.NO.NP.NR.NU.NZ.OM.PA.PE.PF.PG.PH.PK.PL.PM.PN.PR.PS.PT.PW.PY.QA.RE.RO.RS.RU.RW.SA.SB.SC.SD.SE.SG.SH.SI.SJ.SK.SL.SM.SN.SO.SR.SS.ST.SV.SX.SY.SZ.TC.TD.TF.TG.TH.TJ.TK.TL.TM.TN.TO.TR.TT.TV.TW.TZ.UA.UG.UM.US.UY.UZ.VA.VC.VE.VG.VI.VN.VU.WF.WS.YE.YT.ZA.ZM.ZW", locale4);
        java.lang.String str8 = locale4.getDisplayScript();
        java.util.Locale.setDefault(locale4);
        java.util.Locale.Builder builder10 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder11 = builder10.clearExtensions();
        java.util.Locale.Builder builder13 = builder11.setLanguageTag("zh-CN");
        java.util.Locale.Builder builder15 = builder13.setLanguage("CHINA");
        java.util.Locale locale16 = builder13.build();
        java.util.Locale.setDefault(locale16);
        java.util.Locale locale18 = locale16.stripExtensions();
        java.lang.String str19 = locale4.getDisplayCountry(locale16);
        org.junit.Assert.assertEquals(locale3.toString(), "zho_US");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AD.AE.AF.AG.AI.AL.AM.AN.AO.AQ.AR.AS.AT.AU.AW.AX.AZ.BA.BB.BD.BE.BF.BG.BH.BI.BJ.BL.BM.BN.BO.BQ.BR.BS.BT.BV.BW.BY.BZ.CA.CC.CD.CF.CG.CH.CI.CK.CL.CM.CN.CO.CR.CU.CV.CW.CX.CY.CZ.DE.DJ.DK.DM.DO.DZ.EC.EE.EG.EH.ER.ES.ET.FI.FJ.FK.FM.FO.FR.GA.GB.GD.GE.GF.GG.GH.GI.GL.GM.GN.GP.GQ.GR.GS.GT.GU.GW.GY.HK.HM.HN.HR.HT.HU.ID.IE.IL.IM.IN.IO.IQ.IR.IS.IT.JE.JM.JO.JP.KE.KG.KH.KI.KM.KN.KP.KR.KW.KY.KZ.LA.LB.LC.LI.LK.LR.LS.LT.LU.LV.LY.MA.MC.MD.ME.MF.MG.MH.MK.ML.MM.MN.MO.MP.MQ.MR.MS.MT.MU.MV.MW.MX.MY.MZ.NA.NC.NE.NF.NG.NI.NL.NO.NP.NR.NU.NZ.OM.PA.PE.PF.PG.PH.PK.PL.PM.PN.PR.PS.PT.PW.PY.QA.RE.RO.RS.RU.RW.SA.SB.SC.SD.SE.SG.SH.SI.SJ.SK.SL.SM.SN.SO.SR.SS.ST.SV.SX.SY.SZ.TC.TD.TF.TG.TH.TJ.TK.TL.TM.TN.TO.TR.TT.TV.TW.TZ.UA.UG.UM.US.UY.UZ.VA.VC.VE.VG.VI.VN.VU.WF.WS.YE.YT.ZA.ZM.ZW" + "'", str7, "AD.AE.AF.AG.AI.AL.AM.AN.AO.AQ.AR.AS.AT.AU.AW.AX.AZ.BA.BB.BD.BE.BF.BG.BH.BI.BJ.BL.BM.BN.BO.BQ.BR.BS.BT.BV.BW.BY.BZ.CA.CC.CD.CF.CG.CH.CI.CK.CL.CM.CN.CO.CR.CU.CV.CW.CX.CY.CZ.DE.DJ.DK.DM.DO.DZ.EC.EE.EG.EH.ER.ES.ET.FI.FJ.FK.FM.FO.FR.GA.GB.GD.GE.GF.GG.GH.GI.GL.GM.GN.GP.GQ.GR.GS.GT.GU.GW.GY.HK.HM.HN.HR.HT.HU.ID.IE.IL.IM.IN.IO.IQ.IR.IS.IT.JE.JM.JO.JP.KE.KG.KH.KI.KM.KN.KP.KR.KW.KY.KZ.LA.LB.LC.LI.LK.LR.LS.LT.LU.LV.LY.MA.MC.MD.ME.MF.MG.MH.MK.ML.MM.MN.MO.MP.MQ.MR.MS.MT.MU.MV.MW.MX.MY.MZ.NA.NC.NE.NF.NG.NI.NL.NO.NP.NR.NU.NZ.OM.PA.PE.PF.PG.PH.PK.PL.PM.PN.PR.PS.PT.PW.PY.QA.RE.RO.RS.RU.RW.SA.SB.SC.SD.SE.SG.SH.SI.SJ.SK.SL.SM.SN.SO.SR.SS.ST.SV.SX.SY.SZ.TC.TD.TF.TG.TH.TJ.TK.TL.TM.TN.TO.TR.TT.TV.TW.TZ.UA.UG.UM.US.UY.UZ.VA.VC.VE.VG.VI.VN.VU.WF.WS.YE.YT.ZA.ZM.ZW");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "china_CN");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "china_CN");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Canada" + "'", str19, "Canada");
    }
}
