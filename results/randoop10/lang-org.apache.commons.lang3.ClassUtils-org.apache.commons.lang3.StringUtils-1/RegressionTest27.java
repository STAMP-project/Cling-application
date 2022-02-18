import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest27 {

    public static boolean debug = false;

    @Test
    public void test13501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13501");
        java.lang.String[] strArray0 = java.util.Locale.getISOLanguages();
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.stripAll(strArray0, "java.lang");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test13502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13502");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("\u4e2d\u56fdAD.AE.AFxxxxxxxxxxxxxxxxxxxxxxxxx", "Hindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test13503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13503");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("ChinChinChinChinChinChinChinChinChinaaaaaaaaa#");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ChinChinChinChinChinChinChinChinChinaaaaaaaaa#" + "'", str1, "ChinChinChinChinChinChinChinChinChinaaaaaaaaa#");
    }

    @Test
    public void test13504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13504");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("LANG                                                      ", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LANG" + "'", str2, "LANG");
    }

    @Test
    public void test13505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13505");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaCharacteraaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "Korean (South Korea)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test13506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13506");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("uuuuuxxxxxxxxxxxxxxJapanesexxxxxxxxxxxxxxuuuuu", 'a', '$');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "uuuuuxxxxxxxxxxxxxxJ$p$nesexxxxxxxxxxxxxxuuuuu" + "'", str3, "uuuuuxxxxxxxxxxxxxxJ$p$nesexxxxxxxxxxxxxxuuuuu");
    }

    @Test
    public void test13507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13507");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("HI!HI!HI!HI!HI!HI", 41, "                            ese (Taiwan");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "            HI!HI!HI!HI!HI!HI            " + "'", str3, "            HI!HI!HI!HI!HI!HI            ");
    }

    @Test
    public void test13508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13508");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u4e2d" + "'", str1, "\u4e2d");
    }

    @Test
    public void test13509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13509");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("xxxxxxx");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "xxxxxxx" + "'", str1, "xxxxxxx");
    }

    @Test
    public void test13510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13510");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "alienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalienitalien", (java.lang.CharSequence) "iai");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 107 + "'", int2 == 107);
    }

    @Test
    public void test13511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13511");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("RGLA", 'x');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "RGLA" + "'", str2, "RGLA");
    }

    @Test
    public void test13512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13512");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("cines                                                                                                                                                                                                                                                                                  ", 745, "friFRSTIiF");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "friFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfricines                                                                                                                                                                                                                                                                                  friFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfri" + "'", str3, "friFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfricines                                                                                                                                                                                                                                                                                  friFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfri");
    }

    @Test
    public void test13513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13513");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "ed", 15);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test13514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13514");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxzh-hcnczih", "en_CA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test13515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13515");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("chinaundaaaaaaachinaundaaaaaaachinaundaaaaaaahi-chinaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachina", "Character");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test13516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13516");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "zhcinesese$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zhcinesese$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$" + "'", str1, "zhcinesese$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
    }

    @Test
    public void test13517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13517");
        java.util.Locale locale0 = java.util.Locale.JAPANESE;
        java.util.Locale locale2 = java.util.Locale.TAIWAN;
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.upperCase("", locale2);
        java.lang.String str4 = locale0.getDisplayVariant(locale2);
        java.lang.String str5 = locale2.getLanguage();
        java.lang.Object obj6 = locale2.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ja");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "zh" + "'", str5, "zh");
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "zh_TW");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "zh_TW");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "zh_TW");
    }

    @Test
    public void test13518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13518");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.lang.Class<?>[] wildcardClassArray3 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray1);
        java.lang.Class<?>[] wildcardClassArray4 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray1);
        java.lang.Class<?>[] wildcardClassArray5 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray1);
        java.lang.Class[] classArray7 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray8 = (java.lang.Class<?>[]) classArray7;
        java.lang.Class<?>[] wildcardClassArray9 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray7);
        java.lang.Class<?> wildcardClass10 = null;
        java.lang.Class[] classArray12 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray13 = (java.lang.Class<?>[]) classArray12;
        wildcardClassArray13[0] = wildcardClass10;
        boolean boolean17 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray9, wildcardClassArray13, false);
        java.lang.Class<?>[] wildcardClassArray18 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray9);
        boolean boolean19 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray5, wildcardClassArray18);
        java.lang.Class<?>[] wildcardClassArray20 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray18);
        java.lang.Class<?>[] wildcardClassArray21 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray20);
        java.lang.Class[] classArray23 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray24 = (java.lang.Class<?>[]) classArray23;
        java.lang.Class<?>[] wildcardClassArray25 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray23);
        java.lang.Class<?> wildcardClass26 = null;
        java.lang.Class[] classArray28 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray29 = (java.lang.Class<?>[]) classArray28;
        wildcardClassArray29[0] = wildcardClass26;
        boolean boolean33 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray25, wildcardClassArray29, false);
        java.lang.Class[] classArray35 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray36 = (java.lang.Class<?>[]) classArray35;
        java.lang.Class<?>[] wildcardClassArray37 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray35);
        boolean boolean38 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray25, (java.lang.Class<?>[]) classArray35);
        java.lang.Class<?>[] wildcardClassArray39 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray25);
        java.lang.Class<?>[] wildcardClassArray40 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray39);
        boolean boolean42 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray21, wildcardClassArray39, true);
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertNotNull(wildcardClassArray4);
        org.junit.Assert.assertNotNull(wildcardClassArray5);
        org.junit.Assert.assertNotNull(classArray7);
        org.junit.Assert.assertNotNull(wildcardClassArray8);
        org.junit.Assert.assertNotNull(wildcardClassArray9);
        org.junit.Assert.assertNotNull(classArray12);
        org.junit.Assert.assertNotNull(wildcardClassArray13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray20);
        org.junit.Assert.assertNotNull(wildcardClassArray21);
        org.junit.Assert.assertNotNull(classArray23);
        org.junit.Assert.assertNotNull(wildcardClassArray24);
        org.junit.Assert.assertNotNull(wildcardClassArray25);
        org.junit.Assert.assertNotNull(classArray28);
        org.junit.Assert.assertNotNull(wildcardClassArray29);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(classArray35);
        org.junit.Assert.assertNotNull(wildcardClassArray36);
        org.junit.Assert.assertNotNull(wildcardClassArray37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray39);
        org.junit.Assert.assertNotNull(wildcardClassArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
    }

    @Test
    public void test13519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13519");
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
        java.lang.String str15 = locale0.getVariant();
        java.lang.String str16 = locale0.getISO3Language();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ja");
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u82f1\u6587" + "'", str5, "\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale9);
// flaky:         org.junit.Assert.assertEquals(locale9.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\u4e2d\u56fd" + "'", str10, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "jpn" + "'", str16, "jpn");
    }

    @Test
    public void test13520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13520");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageName("hI   Taiwan                  hI   xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test13521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13521");
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
        java.util.Locale locale18 = new java.util.Locale("CHNAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "en_CA", "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
        java.util.Locale locale19 = java.util.Locale.ITALIAN;
        java.util.Locale locale21 = new java.util.Locale("");
        java.lang.String str22 = locale21.getDisplayLanguage();
        java.util.Locale locale23 = java.util.Locale.CANADA;
        java.lang.String str24 = locale23.getDisplayLanguage();
        java.lang.String str25 = locale21.getDisplayScript(locale23);
        java.util.Locale locale27 = java.util.Locale.FRANCE;
        java.lang.String str28 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale27);
        java.lang.String str29 = locale21.getDisplayCountry(locale27);
        java.lang.String str30 = locale19.getDisplayScript(locale21);
        java.util.Locale locale31 = java.util.Locale.GERMAN;
        java.lang.String str32 = locale21.getDisplayLanguage(locale31);
        java.util.Locale locale35 = new java.util.Locale("");
        java.lang.String str36 = locale35.getDisplayLanguage();
        java.util.Locale locale37 = java.util.Locale.CANADA;
        java.lang.String str38 = locale37.getDisplayLanguage();
        java.lang.String str39 = locale35.getDisplayScript(locale37);
        java.lang.String str40 = org.apache.commons.lang3.StringUtils.lowerCase("a", locale35);
        java.lang.String str41 = locale35.getDisplayScript();
        java.lang.String str42 = locale31.getDisplayLanguage(locale35);
        java.util.Set<java.lang.String> strSet43 = locale35.getUnicodeLocaleAttributes();
        java.lang.String str44 = locale18.getDisplayCountry(locale35);
        java.util.Locale locale46 = new java.util.Locale("");
        java.lang.String str47 = locale46.getDisplayVariant();
        java.lang.String str48 = locale35.getDisplayScript(locale46);
        java.util.Locale locale50 = new java.util.Locale("");
        java.lang.String str51 = locale46.getDisplayCountry(locale50);
        java.lang.String str52 = locale10.getDisplayName(locale50);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str54 = locale10.getExtension('4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertEquals(locale18.toString(), "chnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa_EN_CA_ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "it");
        org.junit.Assert.assertEquals(locale21.toString(), "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "en_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\u82f1\u6587" + "'", str24, "\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "english" + "'", str28, "english");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "de");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals(locale35.toString(), "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "en_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str38 + "' != '" + "\u82f1\u6587" + "'", str38, "\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "a" + "'", str40, "a");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "German" + "'", str42, "German");
        org.junit.Assert.assertNotNull(strSet43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "EN_CA" + "'", str44, "EN_CA");
        org.junit.Assert.assertEquals(locale46.toString(), "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals(locale50.toString(), "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "china (China)" + "'", str52, "china (China)");
    }

    @Test
    public void test13522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13522");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList0 = null;
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap2 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList3 = java.util.Locale.LanguageRange.parse("Cina", strMap2);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap4 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList5 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList3, strMap4);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList7 = java.util.Locale.LanguageRange.parse("hi");
        boolean boolean9 = languageRangeList7.remove((java.lang.Object) "English");
        boolean boolean11 = languageRangeList7.remove((java.lang.Object) 1);
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
        java.util.Locale locale49 = java.util.Locale.lookup(languageRangeList7, (java.util.Collection<java.util.Locale>) localeList46);
        java.util.List<java.util.Locale> localeList50 = java.util.Locale.filter(languageRangeList5, (java.util.Collection<java.util.Locale>) localeList46);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale> localeList51 = java.util.Locale.filter(languageRangeList0, (java.util.Collection<java.util.Locale>) localeList46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeList3);
        org.junit.Assert.assertNotNull(languageRangeList5);
        org.junit.Assert.assertNotNull(languageRangeList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
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
// flaky:         org.junit.Assert.assertEquals(locale22.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\u4e2d\u56fd" + "'", str23, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "zh-CN" + "'", str24, "zh-CN");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale26);
// flaky:         org.junit.Assert.assertEquals(locale26.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\u4e2d\u56fd" + "'", str27, "\u4e2d\u56fd");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale29);
// flaky:         org.junit.Assert.assertEquals(locale29.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "\u4e2d\u56fd" + "'", str30, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals(locale34.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale36);
// flaky:         org.junit.Assert.assertEquals(locale36.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str37 + "' != '" + "\u4e2d\u56fd" + "'", str37, "\u4e2d\u56fd");
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
        org.junit.Assert.assertNull(locale49);
        org.junit.Assert.assertNotNull(localeList50);
    }

    @Test
    public void test13523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13523");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("fr-CA", strMap1);
        java.util.Locale.LanguageRange[] languageRangeArray3 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList4 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList4, languageRangeArray3);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap6 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList7 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, strMap6);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList9 = java.util.Locale.LanguageRange.parse("hi");
        java.lang.Object[] objArray10 = languageRangeList9.toArray();
        java.util.Spliterator<java.util.Locale.LanguageRange> languageRangeSpliterator11 = languageRangeList9.spliterator();
        boolean boolean12 = languageRangeList4.containsAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList9);
        boolean boolean13 = languageRangeList2.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList4);
        java.util.Locale.LanguageRange[] languageRangeArray14 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList15 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList15, languageRangeArray14);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap17 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList18 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList15, strMap17);
        int int19 = languageRangeList15.size();
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor20 = languageRangeList15.listIterator();
        java.util.Locale.LanguageRange languageRange22 = new java.util.Locale.LanguageRange("a");
        java.util.Locale.LanguageRange languageRange24 = new java.util.Locale.LanguageRange("English");
        java.lang.String str26 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) languageRange24, "");
        java.util.Locale.LanguageRange languageRange28 = new java.util.Locale.LanguageRange("English");
        java.util.Locale.LanguageRange[] languageRangeArray29 = new java.util.Locale.LanguageRange[] { languageRange22, languageRange24, languageRange28 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList30 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList30, languageRangeArray29);
        boolean boolean32 = languageRangeList15.retainAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList30);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor33 = languageRangeList30.listIterator();
        boolean boolean34 = languageRangeList4.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList30);
        java.lang.Class<?> wildcardClass35 = languageRangeList4.getClass();
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(languageRangeList7);
        org.junit.Assert.assertNotNull(languageRangeList9);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(languageRangeSpliterator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(languageRangeArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(languageRangeList18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(languageRangeItor20);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Locale.LanguageRange" + "'", str26, "Locale.LanguageRange");
        org.junit.Assert.assertNotNull(languageRangeArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(languageRangeItor33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test13524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13524");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("i###################################################################################################", 31);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test13525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13525");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "ZH-cnENGLISH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test13526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13526");
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
        java.util.Locale.Builder builder46 = builder42.clear();
        java.util.Locale.Builder builder47 = builder42.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder49 = builder47.setLanguageTag("Ci_aCi_aCi_aCi_aCi_aCi_aCi_aCi_aCi_aCi_a");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: Ci_aCi_aCi_aCi_aCi_aCi_aCi_aCi_aCi_aCi_a [at index 0]");
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
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "anglais" + "'", str21, "anglais");
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
        org.junit.Assert.assertNotNull(builder47);
    }

    @Test
    public void test13527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13527");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("e!e(tiiwin", 34, "\u5fb7\u6587\u5fb7\u56fd\u5fb7\u6587                                                                                                                                                                          ");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "e!e(tiiwin                        " + "'", str3, "e!e(tiiwin                        ");
    }

    @Test
    public void test13528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13528");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$", "                                             italiahi                                              ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$" + "'", str2, "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
    }

    @Test
    public void test13529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13529");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setScript("");
        java.util.Locale.Builder builder4 = builder0.setRegion("AI");
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
        java.util.Locale locale43 = new java.util.Locale("HArrayList", "englishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglish");
        java.lang.String str44 = locale25.getDisplayScript(locale43);
        java.util.Locale locale46 = java.util.Locale.TAIWAN;
        java.lang.String str47 = org.apache.commons.lang3.StringUtils.upperCase("", locale46);
        java.lang.String str48 = locale25.getDisplayLanguage(locale46);
        java.util.Locale.Builder builder49 = builder0.setLocale(locale25);
        java.util.Locale.Builder builder50 = builder49.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder52 = builder49.setVariant("xxxIhxxxxCHINA");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: xxxIhxxxxCHINA [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
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
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "anglais" + "'", str13, "anglais");
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
        org.junit.Assert.assertEquals(locale43.toString(), "harraylist_ENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISH");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "\u7fa9\u5927\u5229\u6587" + "'", str48, "\u7fa9\u5927\u5229\u6587");
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder50);
    }

    @Test
    public void test13530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13530");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("                                rArrayL", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                rArrayL                                                             " + "'", str2, "                                rArrayL                                                             ");
    }

    @Test
    public void test13531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13531");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = builder0.build();
        java.util.Locale locale3 = builder0.build();
        java.lang.String str4 = locale3.getDisplayScript();
        java.lang.String str5 = locale3.getLanguage();
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
        java.util.Locale locale18 = java.util.Locale.GERMAN;
        java.lang.String str19 = locale8.getDisplayLanguage(locale18);
        java.util.Locale locale22 = new java.util.Locale("");
        java.lang.String str23 = locale22.getDisplayLanguage();
        java.util.Locale locale24 = java.util.Locale.CANADA;
        java.lang.String str25 = locale24.getDisplayLanguage();
        java.lang.String str26 = locale22.getDisplayScript(locale24);
        java.lang.String str27 = org.apache.commons.lang3.StringUtils.lowerCase("a", locale22);
        java.lang.String str28 = locale22.getDisplayScript();
        java.lang.String str29 = locale18.getDisplayLanguage(locale22);
        java.util.Set<java.lang.String> strSet30 = locale18.getUnicodeLocaleAttributes();
        java.lang.String str31 = locale18.getCountry();
        java.util.Locale.Category category32 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale33 = java.util.Locale.ITALIAN;
        java.util.Locale locale35 = new java.util.Locale("");
        java.lang.String str36 = locale35.getDisplayLanguage();
        java.util.Locale locale37 = java.util.Locale.CANADA;
        java.lang.String str38 = locale37.getDisplayLanguage();
        java.lang.String str39 = locale35.getDisplayScript(locale37);
        java.util.Locale locale41 = java.util.Locale.FRANCE;
        java.lang.String str42 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale41);
        java.lang.String str43 = locale35.getDisplayCountry(locale41);
        java.lang.String str44 = locale33.getDisplayScript(locale35);
        java.util.Locale locale45 = java.util.Locale.GERMAN;
        java.lang.String str46 = locale35.getDisplayLanguage(locale45);
        java.util.Locale locale49 = new java.util.Locale("");
        java.lang.String str50 = locale49.getDisplayLanguage();
        java.util.Locale locale51 = java.util.Locale.CANADA;
        java.lang.String str52 = locale51.getDisplayLanguage();
        java.lang.String str53 = locale49.getDisplayScript(locale51);
        java.lang.String str54 = org.apache.commons.lang3.StringUtils.lowerCase("a", locale49);
        java.lang.String str55 = locale49.getDisplayScript();
        java.lang.String str56 = locale45.getDisplayLanguage(locale49);
        java.util.Set<java.lang.String> strSet57 = locale45.getUnicodeLocaleAttributes();
        java.util.Locale.setDefault(category32, locale45);
        java.lang.String str59 = locale45.getLanguage();
        java.lang.String str60 = locale18.getDisplayVariant(locale45);
        java.lang.String str61 = locale45.getScript();
        java.lang.String str62 = locale3.getDisplayCountry(locale45);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "it");
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "inglese" + "'", str11, "inglese");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "english" + "'", str15, "english");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "de");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals(locale22.toString(), "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "inglese" + "'", str25, "inglese");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "a" + "'", str27, "a");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "German" + "'", str29, "German");
        org.junit.Assert.assertNotNull(strSet30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + category32 + "' != '" + java.util.Locale.Category.FORMAT + "'", category32.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "it");
        org.junit.Assert.assertEquals(locale35.toString(), "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "inglese" + "'", str38, "inglese");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "english" + "'", str42, "english");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "de");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals(locale49.toString(), "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "inglese" + "'", str52, "inglese");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "a" + "'", str54, "a");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "German" + "'", str56, "German");
        org.junit.Assert.assertNotNull(strSet57);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "de" + "'", str59, "de");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
    }

    @Test
    public void test13532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13532");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "Anzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test13533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13533");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("  China   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "China" + "'", str1, "China");
    }

    @Test
    public void test13534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13534");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "TW");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test13535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13535");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "\u52a0\u62ff\u5927");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str2, "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test13536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13536");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("   JAJAJAJAJAJAJAJAJAJAJAJAJAJ)", "xxxxxxxxinglese (canada)xxxxxxxx");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test13537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13537");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("IA", "\u82f1\u6587\u52a0\u62ff\u5927)", 52);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IA" + "'", str3, "IA");
    }

    @Test
    public void test13538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13538");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("En", (-1), 'x');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "En" + "'", str3, "En");
    }

    @Test
    public void test13539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13539");
        java.util.Locale locale1 = new java.util.Locale("");
        java.lang.String str2 = locale1.getDisplayVariant();
        java.util.Locale locale4 = java.util.Locale.TAIWAN;
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.upperCase("", locale4);
        java.lang.String str6 = locale4.getISO3Country();
        boolean boolean7 = locale4.hasExtensions();
        boolean boolean8 = locale4.hasExtensions();
        java.lang.String str9 = locale4.getLanguage();
        java.util.Set<java.lang.String> strSet10 = locale4.getUnicodeLocaleKeys();
        java.lang.String str11 = locale1.getDisplayCountry(locale4);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "TWN" + "'", str6, "TWN");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "zh" + "'", str9, "zh");
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test13540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13540");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxanic");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXANIC" + "'", str1, "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXANIC");
    }

    @Test
    public void test13541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13541");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063)", true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ??/(??)??/(??)??/(??)??/(??)??/(??)??/(??)??/(??)??/(??)??/(??)??/(??)??/(??)??/(??)??/(??)??/(??)??/(??)??/(??)??/(??)??/(??)??/(??)??/(??)??/(??)??/(??)??/(??)??/(??)??/(??)??/(??)??/(??)??/(??)??/(??)??/(??)??/(??)??/(??)??/(??)??/(??)??/(??)??/(??)");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13542");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("TWN");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny("###############################EnglHI!STRING[]STRING[]SsHI!STRING[]STRING[]S###############################EnglHI!STRING[]STRING[]SsHI!STRING[]STRING[]S###############################EnglHI!STRING[]STRING[]SsHI!STRING[]STRING[]S###############################EnglHI!STRING[]STRING[]SsHI!STRING[]STRING[]S###############################EnglHI!STRING[]STRING[]SsHI!STRING[]STRING[]S###############################EnglHI!STRING[]STRING[]SsHI!STRING[]STRING[]S###############################EnglHI!STRING[]STRING[]SsHI!STRING[]STRING[]S###############################EnglHI!STRING[]STRING[]SsHI!STRING[]STRING[]S###############################EnglHI!STRING[]STRING[]SsHI!STRING[]STRING[]S", strArray3);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny("AI", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test13543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13543");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("francese", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444)4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 13);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test13544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13544");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("cinaxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx (GGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLI,us)", "GGGGGGGGGGGGGGGGGGGGGGG....XXGLIGGGGGGGGGGGGGGGGGGGGGGG....XXGLIGGGGGGGGGGGGGGGGGGGGGGG....XXGLIGGGGGGGGGGGGGGGGGGGGGGG....XXGLIGGGGGGGGGGGGGGGGGGGGGGG....XXGLIGGGGGGGGGGGGGGGGGGGGGGG....XXGLIGGGGGGGGGGGGGGGGGGGGGGG....XXGLIGGGGGGGGGGGGGGGGGGGGGGG....XXGLIGGGGGGGGGGGGGGGGGGGGGGG....XXGLI");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test13545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13545");
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
        java.util.Set<java.lang.String> strSet37 = locale36.getUnicodeLocaleAttributes();
        java.lang.String str38 = locale36.getVariant();
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
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "inglese" + "'", str8, "inglese");
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
        org.junit.Assert.assertNotNull(strSet37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
    }

    @Test
    public void test13546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13546");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("                                              italiahi                                              t                                              italiahi                                              l                                              italiahi                                                                                            italiahi                                                                                            italiahi                                              o", (double) 252);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=252.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13547");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("zh_Z", 18);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "zh_Z" + "'", str2, "zh_Z");
    }

    @Test
    public void test13548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13548");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "sti-f");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test13549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13549");
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
        java.lang.String str26 = locale13.getCountry();
        java.util.Locale.Category category27 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale28 = java.util.Locale.ITALIAN;
        java.util.Locale locale30 = new java.util.Locale("");
        java.lang.String str31 = locale30.getDisplayLanguage();
        java.util.Locale locale32 = java.util.Locale.CANADA;
        java.lang.String str33 = locale32.getDisplayLanguage();
        java.lang.String str34 = locale30.getDisplayScript(locale32);
        java.util.Locale locale36 = java.util.Locale.FRANCE;
        java.lang.String str37 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale36);
        java.lang.String str38 = locale30.getDisplayCountry(locale36);
        java.lang.String str39 = locale28.getDisplayScript(locale30);
        java.util.Locale locale40 = java.util.Locale.GERMAN;
        java.lang.String str41 = locale30.getDisplayLanguage(locale40);
        java.util.Locale locale44 = new java.util.Locale("");
        java.lang.String str45 = locale44.getDisplayLanguage();
        java.util.Locale locale46 = java.util.Locale.CANADA;
        java.lang.String str47 = locale46.getDisplayLanguage();
        java.lang.String str48 = locale44.getDisplayScript(locale46);
        java.lang.String str49 = org.apache.commons.lang3.StringUtils.lowerCase("a", locale44);
        java.lang.String str50 = locale44.getDisplayScript();
        java.lang.String str51 = locale40.getDisplayLanguage(locale44);
        java.util.Set<java.lang.String> strSet52 = locale40.getUnicodeLocaleAttributes();
        java.util.Locale.setDefault(category27, locale40);
        java.lang.String str54 = locale40.getLanguage();
        java.lang.String str55 = locale13.getDisplayVariant(locale40);
        java.lang.String str56 = locale13.getDisplayName();
        java.lang.String str57 = org.apache.commons.lang3.StringUtils.upperCase("$", locale13);
        java.util.Locale locale58 = locale13.stripExtensions();
        java.lang.String str59 = locale58.getDisplayVariant();
        java.lang.String str61 = locale58.getExtension('a');
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it");
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "English" + "'", str6, "English");
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
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "English" + "'", str20, "English");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "a" + "'", str22, "a");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "German" + "'", str24, "German");
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + category27 + "' != '" + java.util.Locale.Category.FORMAT + "'", category27.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "it");
        org.junit.Assert.assertEquals(locale30.toString(), "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "en_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "English" + "'", str33, "English");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "english" + "'", str37, "english");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "de");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals(locale44.toString(), "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "en_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str47 + "' != '" + "English" + "'", str47, "English");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "a" + "'", str49, "a");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "German" + "'", str51, "German");
        org.junit.Assert.assertNotNull(strSet52);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "de" + "'", str54, "de");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
// flaky:         org.junit.Assert.assertEquals("'" + str56 + "' != '" + "German" + "'", str56, "German");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "$" + "'", str57, "$");
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "de");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertNull(str61);
    }

    @Test
    public void test13550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13550");
        java.lang.String[] strArray7 = new java.lang.String[] { "English", "hi", "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "", "a", "", "China" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        java.util.List<java.lang.Class<?>> wildcardClassList10 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList8);
        java.util.List<java.lang.Class<?>> wildcardClassList11 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList8);
        java.util.List<java.lang.Class<?>> wildcardClassList12 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList8);
        java.util.List<java.lang.Class<?>> wildcardClassList13 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList8);
        java.util.List<java.lang.Class<?>> wildcardClassList14 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList8);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClassList10);
        org.junit.Assert.assertNotNull(wildcardClassList11);
        org.junit.Assert.assertNotNull(wildcardClassList12);
        org.junit.Assert.assertNotNull(wildcardClassList13);
        org.junit.Assert.assertNotNull(wildcardClassList14);
    }

    @Test
    public void test13551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13551");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("h                                                gnalesenic.esenicavaj                                                I");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h                                                gnalesenic.esenicavaj                                                I" + "'", str1, "h                                                gnalesenic.esenicavaj                                                I");
    }

    @Test
    public void test13552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13552");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("ad.ae.af.ag.ai.al.am.an.ao.aq.ar.as.at.au.aw.ax.az.ba.bb.bd.be.bf.bg.bh.bi.bj.bl.bm.bn.bo.bq.br.bs.bt.bv.bw.by.bz.ca.cc.cd.cf.cg.ch.ci.ck.cl.cm.cn.co.cr.cu.cv.cw.cx.cy.cz.de.dj.dk.dm.do.dz.ec.ee.eg.eh.er.es.et.fi.fj.fk.fm.fo.fr.ga.gb.gd.ge.gf.gg.gh.gi.gl.gm.gn.gp.gq.gr.gs.gt.gu.gw.gy.hk.hm.hn.hr.ht.hu.id.ie.il.im.in.io.iq.ir.is.it.je.jm.jo.jp.ke.kg.kh.ki.km.kn.kp.kr.kw.ky.kz.la.lb.lc.li.lk.lr.ls.lt.lu.lv.ly.ma.mc.md.me.mf.mg.mh.mk.ml.mm.mn.mo.mp.mq.mr.ms.mt.mu.mv.mw.mx.my.mz.na.nc.ne.nf.ng.ni.nl.no.np.nr.nu.nz.om.pa.pe.pf.pg.ph.pk.pl.pm.pn.pr.ps.pt.pw.py.qa.re.ro.rs.ru.rw.sa.sb.sc.sd.se.sg.sh.si.sj.sk.sl.sm.sn.so.sr.ss.st.sv.sx.sy.sz.tc.td.tf.tg.th.tj.tk.tl.tm.tn.to.tr.tt.tv.tw.tz.ua.ug.um.us.uy.uz.va.vc.ve.vg.vi.vn.vu.wf.ws.ye.yt.za.zm.zw", "zho", (int) (byte) 0);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny("\u82f1\u6587\u7f8e\u56fd)", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test13553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13553");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("i", "ese(Taiwan$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$", 1);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test13554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13554");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "FRAN\307AIS");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test13555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13555");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("", "ENG");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test13556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13556");
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
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) classArray7);
        java.lang.Class<?>[] wildcardClassArray13 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers((java.lang.Class<?>[]) classArray7);
        java.lang.Class<?>[] wildcardClassArray14 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray13);
        java.lang.Class[] classArray16 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray17 = (java.lang.Class<?>[]) classArray16;
        java.lang.Class<?>[] wildcardClassArray18 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray16);
        java.lang.Class<?>[] wildcardClassArray19 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray16);
        java.lang.Class[] classArray22 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray23 = (java.lang.Class<?>[]) classArray22;
        java.lang.Class<?>[] wildcardClassArray24 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray22);
        java.lang.String str25 = org.apache.commons.lang3.StringUtils.concatWith("hi!", (java.lang.Object[]) classArray22);
        boolean boolean26 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray16, (java.lang.Class<?>[]) classArray22);
        java.lang.Class[] classArray28 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray29 = (java.lang.Class<?>[]) classArray28;
        java.lang.Class<?>[] wildcardClassArray30 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray28);
        java.lang.Class<?> wildcardClass31 = null;
        java.lang.Class[] classArray33 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray34 = (java.lang.Class<?>[]) classArray33;
        wildcardClassArray34[0] = wildcardClass31;
        boolean boolean38 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray30, wildcardClassArray34, false);
        java.lang.Class[] classArray40 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray41 = (java.lang.Class<?>[]) classArray40;
        java.lang.Class<?>[] wildcardClassArray42 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray40);
        boolean boolean43 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray30, (java.lang.Class<?>[]) classArray40);
        boolean boolean44 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray16, (java.lang.Class<?>[]) classArray40);
        java.lang.Class<?>[] wildcardClassArray45 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers((java.lang.Class<?>[]) classArray40);
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
        java.lang.Class<?>[] wildcardClassArray58 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray49);
        java.lang.Class<?>[] wildcardClassArray59 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray58);
        java.lang.Class[] classArray61 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray62 = (java.lang.Class<?>[]) classArray61;
        java.lang.Class<?>[] wildcardClassArray63 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray61);
        java.lang.Class<?> wildcardClass64 = null;
        java.lang.Class[] classArray66 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray67 = (java.lang.Class<?>[]) classArray66;
        wildcardClassArray67[0] = wildcardClass64;
        boolean boolean71 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray63, wildcardClassArray67, false);
        java.lang.Class<?>[] wildcardClassArray72 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray63);
        java.lang.Class<?>[] wildcardClassArray73 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray72);
        boolean boolean74 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray58, wildcardClassArray72);
        boolean boolean76 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray40, wildcardClassArray58, false);
        java.lang.Class<?>[] wildcardClassArray77 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) classArray40);
        boolean boolean78 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray13, (java.lang.Class<?>[]) classArray40);
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertNotNull(wildcardClassArray4);
        org.junit.Assert.assertNotNull(classArray7);
        org.junit.Assert.assertNotNull(wildcardClassArray8);
        org.junit.Assert.assertNotNull(wildcardClassArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClassArray13);
        org.junit.Assert.assertNotNull(wildcardClassArray14);
        org.junit.Assert.assertNotNull(classArray16);
        org.junit.Assert.assertNotNull(wildcardClassArray17);
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertNotNull(wildcardClassArray19);
        org.junit.Assert.assertNotNull(classArray22);
        org.junit.Assert.assertNotNull(wildcardClassArray23);
        org.junit.Assert.assertNotNull(wildcardClassArray24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(classArray28);
        org.junit.Assert.assertNotNull(wildcardClassArray29);
        org.junit.Assert.assertNotNull(wildcardClassArray30);
        org.junit.Assert.assertNotNull(classArray33);
        org.junit.Assert.assertNotNull(wildcardClassArray34);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(classArray40);
        org.junit.Assert.assertNotNull(wildcardClassArray41);
        org.junit.Assert.assertNotNull(wildcardClassArray42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray45);
        org.junit.Assert.assertNotNull(classArray47);
        org.junit.Assert.assertNotNull(wildcardClassArray48);
        org.junit.Assert.assertNotNull(wildcardClassArray49);
        org.junit.Assert.assertNotNull(classArray52);
        org.junit.Assert.assertNotNull(wildcardClassArray53);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray58);
        org.junit.Assert.assertNotNull(wildcardClassArray59);
        org.junit.Assert.assertNotNull(classArray61);
        org.junit.Assert.assertNotNull(wildcardClassArray62);
        org.junit.Assert.assertNotNull(wildcardClassArray63);
        org.junit.Assert.assertNotNull(classArray66);
        org.junit.Assert.assertNotNull(wildcardClassArray67);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray72);
        org.junit.Assert.assertNotNull(wildcardClassArray73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
    }

    @Test
    public void test13557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13557");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleAttributes();
        java.util.Locale locale5 = new java.util.Locale("$");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.upperCase("EnglTWNsTWN", locale5);
        java.util.Set<java.lang.String> strSet7 = locale5.getUnicodeLocaleAttributes();
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.lowerCase("ITALIEN", locale5);
        java.lang.String str9 = locale0.getDisplayVariant(locale5);
        java.lang.String str10 = locale5.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertEquals(locale5.toString(), "$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ENGLTWNSTWN" + "'", str6, "ENGLTWNSTWN");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "italien" + "'", str8, "italien");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "$" + "'", str10, "$");
    }

    @Test
    public void test13558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13558");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("#########################English                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "English                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 " + "'", str2, "English                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ");
    }

    @Test
    public void test13559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13559");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.setLanguageTag("zh-CN");
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale.Builder builder6 = builder3.setLanguageTag("ANIHC");
        java.util.Locale.Builder builder7 = builder3.clearExtensions();
        java.util.Locale.Builder builder8 = builder3.clearExtensions();
        java.util.Locale.Builder builder10 = builder8.setScript("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder10.setLanguage("WZ.MZ.AZ.TY.EY.SW.FW.UV.NV.IV.GV.EV.CV.AV.ZU.YShortA.XA.WA.UA.TA.SA.RA.QA.OA.NA.MA.LA.IA.GA.FA.EA");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: WZ.MZ.AZ.TY.EY.SW.FW.UV.NV.IV.GV.EV.CV.AV.ZU.YShortA.XA.WA.UA.TA.SA.RA.QA.OA.NA.MA.LA.IA.GA.FA.EA [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test13560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13560");
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
        java.util.List<java.util.Locale.LanguageRange> languageRangeList63 = java.util.Locale.LanguageRange.parse("zh-CN");
        boolean boolean64 = languageRangeList4.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList63);
        boolean boolean65 = languageRangeList63.isEmpty();
        java.util.Locale.LanguageRange[] languageRangeArray66 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList67 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList67, languageRangeArray66);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap69 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList70 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList67, strMap69);
        int int71 = languageRangeList67.size();
        java.util.List<java.util.Locale.LanguageRange> languageRangeList73 = java.util.Locale.LanguageRange.parse("hi");
        boolean boolean75 = languageRangeList73.remove((java.lang.Object) "English");
        boolean boolean76 = languageRangeList67.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList73);
        java.lang.String[] strArray79 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("a", "");
        java.lang.String[] strArray80 = org.apache.commons.lang3.StringUtils.stripAll(strArray79);
        java.lang.String[] strArray81 = org.apache.commons.lang3.StringUtils.stripAll(strArray79);
        java.lang.String[] strArray82 = org.apache.commons.lang3.StringUtils.stripAll(strArray81);
        boolean boolean83 = languageRangeList73.contains((java.lang.Object) strArray82);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList85 = java.util.Locale.LanguageRange.parse("hi");
        int int87 = languageRangeList85.indexOf((java.lang.Object) '4');
        java.util.Spliterator<java.util.Locale.LanguageRange> languageRangeSpliterator88 = languageRangeList85.spliterator();
        java.util.Locale locale89 = java.util.Locale.CANADA;
        java.lang.String str90 = locale89.getDisplayLanguage();
        java.util.Set<java.lang.String> strSet91 = locale89.getUnicodeLocaleKeys();
        java.lang.String str92 = java.util.Locale.lookupTag(languageRangeList85, (java.util.Collection<java.lang.String>) strSet91);
        java.lang.String str93 = java.util.Locale.lookupTag(languageRangeList73, (java.util.Collection<java.lang.String>) strSet91);
        java.lang.String str94 = java.util.Locale.lookupTag(languageRangeList63, (java.util.Collection<java.lang.String>) strSet91);
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
// flaky:         org.junit.Assert.assertEquals(locale20.toString(), "zh-cnenglish_LOCALE.LANGUAGERANGE");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "China" + "'", str21, "China");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "zh-CN" + "'", str22, "zh-CN");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale24);
// flaky:         org.junit.Assert.assertEquals(locale24.toString(), "zh-cnenglish_LOCALE.LANGUAGERANGE");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "China" + "'", str25, "China");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale27);
// flaky:         org.junit.Assert.assertEquals(locale27.toString(), "zh-cnenglish_LOCALE.LANGUAGERANGE");
// flaky:         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "China" + "'", str28, "China");
        org.junit.Assert.assertEquals(locale32.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale34);
// flaky:         org.junit.Assert.assertEquals(locale34.toString(), "zh-cnenglish_LOCALE.LANGUAGERANGE");
// flaky:         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "China" + "'", str35, "China");
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
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(languageRangeArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(languageRangeList70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertNotNull(languageRangeList73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(strArray79);
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertNotNull(strArray81);
        org.junit.Assert.assertNotNull(strArray82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(languageRangeList85);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + (-1) + "'", int87 == (-1));
        org.junit.Assert.assertNotNull(languageRangeSpliterator88);
        org.junit.Assert.assertNotNull(locale89);
        org.junit.Assert.assertEquals(locale89.toString(), "en_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str90 + "' != '" + "English" + "'", str90, "English");
        org.junit.Assert.assertNotNull(strSet91);
        org.junit.Assert.assertNull(str92);
        org.junit.Assert.assertNull(str93);
        org.junit.Assert.assertNull(str94);
    }

    @Test
    public void test13561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13561");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("tw", ".................................................................................$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test13562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13562");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale.Builder builder3 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder4 = builder1.clear();
        java.util.Locale.Builder builder5 = builder1.clear();
        java.util.Locale.Builder builder6 = builder5.clear();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test13563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13563");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("Cina", strMap1);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList2, strMap3);
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
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor66 = languageRangeList9.listIterator();
        int int67 = languageRangeList9.size();
        java.util.List<java.util.Locale.LanguageRange> languageRangeList69 = java.util.Locale.LanguageRange.parse("HI");
        boolean boolean70 = languageRangeList9.equals((java.lang.Object) languageRangeList69);
        boolean boolean72 = languageRangeList9.remove((java.lang.Object) "....english (ZHCINESESE,.)");
        boolean boolean73 = languageRangeList2.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList9);
        java.lang.String str75 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList2, '4');
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeList4);
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
// flaky:         org.junit.Assert.assertEquals(locale25.toString(), "zh-cnenglish_LOCALE.LANGUAGERANGE");
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "China" + "'", str26, "China");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "zh-CN" + "'", str27, "zh-CN");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale29);
// flaky:         org.junit.Assert.assertEquals(locale29.toString(), "zh-cnenglish_LOCALE.LANGUAGERANGE");
// flaky:         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "China" + "'", str30, "China");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale32);
// flaky:         org.junit.Assert.assertEquals(locale32.toString(), "zh-cnenglish_LOCALE.LANGUAGERANGE");
// flaky:         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "China" + "'", str33, "China");
        org.junit.Assert.assertEquals(locale37.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale39);
// flaky:         org.junit.Assert.assertEquals(locale39.toString(), "zh-cnenglish_LOCALE.LANGUAGERANGE");
// flaky:         org.junit.Assert.assertEquals("'" + str40 + "' != '" + "China" + "'", str40, "China");
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
        org.junit.Assert.assertNotNull(languageRangeItor66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertNotNull(languageRangeList69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
    }

    @Test
    public void test13564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13564");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = org.apache.commons.lang3.ClassUtils.getClass("UNDAAAAAAA");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: UNDAAAAAAA");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13565");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#.FilteringMode", (java.lang.CharSequence) "\u4e2d\u6587\u53f0\u7063)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 248 + "'", int2 == 248);
    }

    @Test
    public void test13566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13566");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("EN_CAEN_CA_EN_CAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EN_CAEN_CA_EN_CAA" + "'", str1, "EN_CAEN_CA_EN_CAA");
    }

    @Test
    public void test13567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13567");
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
        java.util.List<java.util.Locale.LanguageRange> languageRangeList25 = java.util.Locale.LanguageRange.parse("hi");
        int int27 = languageRangeList25.indexOf((java.lang.Object) '4');
        languageRangeList25.clear();
        java.util.List<java.util.Locale.LanguageRange> languageRangeList30 = java.util.Locale.LanguageRange.parse("hi");
        java.util.Locale.LanguageRange languageRange32 = new java.util.Locale.LanguageRange("cn");
        boolean boolean33 = languageRangeList30.add(languageRange32);
        int int35 = languageRangeList30.indexOf((java.lang.Object) "xxxxxxxxinglese (Canada)xxxxxxxx");
        int int36 = languageRangeList30.size();
        java.util.Locale locale37 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str38 = locale37.getISO3Language();
        java.lang.String str40 = locale37.getUnicodeLocaleType("AI");
        java.util.Set<java.lang.String> strSet41 = locale37.getUnicodeLocaleAttributes();
        java.util.List<java.lang.String> strList42 = java.util.Locale.filterTags(languageRangeList30, (java.util.Collection<java.lang.String>) strSet41);
        java.util.List<java.lang.String> strList43 = java.util.Locale.filterTags(languageRangeList25, (java.util.Collection<java.lang.String>) strSet41);
        java.util.Locale.LanguageRange[] languageRangeArray44 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList45 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList45, languageRangeArray44);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap47 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList48 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList45, strMap47);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream49 = languageRangeList45.stream();
        boolean boolean50 = languageRangeList45.isEmpty();
        java.util.Locale.LanguageRange[] languageRangeArray51 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList52 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList52, languageRangeArray51);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap54 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList55 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList52, strMap54);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor56 = languageRangeList55.listIterator();
        boolean boolean57 = languageRangeList45.retainAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList55);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap59 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList60 = java.util.Locale.LanguageRange.parse("Cina", strMap59);
        java.lang.String[] strArray64 = new java.lang.String[] { "aiaiaiaiaiaiaiaiaia", "zh-CN", "China" };
        java.util.ArrayList<java.lang.String> strList65 = new java.util.ArrayList<java.lang.String>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList65, strArray64);
        java.util.Locale.FilteringMode filteringMode67 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList68 = java.util.Locale.filterTags(languageRangeList60, (java.util.Collection<java.lang.String>) strList65, filteringMode67);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap70 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList71 = java.util.Locale.LanguageRange.parse("Cina", strMap70);
        java.lang.String[] strArray75 = new java.lang.String[] { "aiaiaiaiaiaiaiaiaia", "zh-CN", "China" };
        java.util.ArrayList<java.lang.String> strList76 = new java.util.ArrayList<java.lang.String>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList76, strArray75);
        java.util.Locale.FilteringMode filteringMode78 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList79 = java.util.Locale.filterTags(languageRangeList71, (java.util.Collection<java.lang.String>) strList76, filteringMode78);
        java.util.List<java.lang.String> strList80 = java.util.Locale.filterTags(languageRangeList55, (java.util.Collection<java.lang.String>) strList65, filteringMode78);
        java.util.List<java.lang.String> strList81 = java.util.Locale.filterTags(languageRangeList21, (java.util.Collection<java.lang.String>) strSet41, filteringMode78);
        java.util.Locale.LanguageRange languageRange84 = new java.util.Locale.LanguageRange("Chine");
        languageRangeList21.add((int) (byte) 0, languageRange84);
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
        org.junit.Assert.assertNotNull(languageRangeList25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(languageRangeList30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2 + "'", int36 == 2);
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "fra" + "'", str38, "fra");
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNotNull(strSet41);
        org.junit.Assert.assertNotNull(strList42);
        org.junit.Assert.assertNotNull(strList43);
        org.junit.Assert.assertNotNull(languageRangeArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(languageRangeList48);
        org.junit.Assert.assertNotNull(languageRangeStream49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(languageRangeArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(languageRangeList55);
        org.junit.Assert.assertNotNull(languageRangeItor56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(languageRangeList60);
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + filteringMode67 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode67.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList68);
        org.junit.Assert.assertNotNull(languageRangeList71);
        org.junit.Assert.assertNotNull(strArray75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + filteringMode78 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode78.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList79);
        org.junit.Assert.assertNotNull(strList80);
        org.junit.Assert.assertNotNull(strList81);
    }

    @Test
    public void test13568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13568");
        java.util.Locale locale0 = java.util.Locale.PRC;
        java.lang.String str1 = locale0.getDisplayName();
        boolean boolean2 = locale0.hasExtensions();
        java.util.Locale locale4 = java.util.Locale.CHINA;
        java.util.Set<java.lang.Character> charSet5 = locale4.getExtensionKeys();
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.lowerCase("String[]", locale4);
        java.lang.String str7 = locale0.getDisplayScript(locale4);
        java.util.Locale locale8 = locale0.stripExtensions();
        java.lang.String str9 = locale8.getLanguage();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Chinese (China)" + "'", str1, "Chinese (China)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(charSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "string[]" + "'", str6, "string[]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "zh" + "'", str9, "zh");
    }

    @Test
    public void test13569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13569");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("XXXXXXXXXXXXXXJAPANESEXXXXXXXXXXXXXX", 20, 530);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "SEXXXXXXXXXXXXXX" + "'", str3, "SEXXXXXXXXXXXXXX");
    }

    @Test
    public void test13570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13570");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange87 = languageRangeList1.remove(94);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 94, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
// flaky:         org.junit.Assert.assertEquals(locale37.toString(), "zh-cnenglish_LOCALE.LANGUAGERANGE");
// flaky:         org.junit.Assert.assertEquals("'" + str38 + "' != '" + "China" + "'", str38, "China");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "zh-CN" + "'", str39, "zh-CN");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale41);
// flaky:         org.junit.Assert.assertEquals(locale41.toString(), "zh-cnenglish_LOCALE.LANGUAGERANGE");
// flaky:         org.junit.Assert.assertEquals("'" + str42 + "' != '" + "China" + "'", str42, "China");
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale44);
// flaky:         org.junit.Assert.assertEquals(locale44.toString(), "zh-cnenglish_LOCALE.LANGUAGERANGE");
// flaky:         org.junit.Assert.assertEquals("'" + str45 + "' != '" + "China" + "'", str45, "China");
        org.junit.Assert.assertEquals(locale49.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale51);
// flaky:         org.junit.Assert.assertEquals(locale51.toString(), "zh-cnenglish_LOCALE.LANGUAGERANGE");
// flaky:         org.junit.Assert.assertEquals("'" + str52 + "' != '" + "China" + "'", str52, "China");
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
    }

    @Test
    public void test13571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13571");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("ArrayList", '.');
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "English");
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("inglese", '4');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("class java.lang.Stringclass java.lang.Stringclass java.lang.String", strArray5, strArray8);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray5);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "class java.lang.Stringclass java.lang.Stringclass java.lang.String" + "'", str9, "class java.lang.Stringclass java.lang.Stringclass java.lang.String");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ArrayList" + "'", str10, "ArrayList");
    }

    @Test
    public void test13572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13572");
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
        boolean boolean17 = languageRangeList13.equals((java.lang.Object) "Cina");
        boolean boolean19 = languageRangeList13.contains((java.lang.Object) (byte) 1);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(languageRangeArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test13573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13573");
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
        java.lang.Object[] objArray53 = languageRangeList1.toArray();
        java.lang.String str57 = org.apache.commons.lang3.StringUtils.join(objArray53, "AD.AE.AF.AGchnaafraAD.AE.AF.AGchnaaa", 33, 27);
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
// flaky:         org.junit.Assert.assertEquals(locale10.toString(), "zh-cnenglish_LOCALE.LANGUAGERANGE");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "China" + "'", str11, "China");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "zh-CN" + "'", str12, "zh-CN");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale14);
// flaky:         org.junit.Assert.assertEquals(locale14.toString(), "zh-cnenglish_LOCALE.LANGUAGERANGE");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "China" + "'", str15, "China");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale17);
// flaky:         org.junit.Assert.assertEquals(locale17.toString(), "zh-cnenglish_LOCALE.LANGUAGERANGE");
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "China" + "'", str18, "China");
        org.junit.Assert.assertEquals(locale22.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale24);
// flaky:         org.junit.Assert.assertEquals(locale24.toString(), "zh-cnenglish_LOCALE.LANGUAGERANGE");
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
        org.junit.Assert.assertNotNull(languageRangeList52);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray53), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray53), "[]");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
    }

    @Test
    public void test13574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13574");
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
        java.lang.Class<?>[] wildcardClassArray12 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray3);
        java.lang.Class[] classArray14 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray15 = (java.lang.Class<?>[]) classArray14;
        java.lang.Class<?>[] wildcardClassArray16 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray14);
        java.lang.Class<?>[] wildcardClassArray17 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray14);
        java.lang.Class<?>[] wildcardClassArray18 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) classArray14);
        java.lang.Class[] classArray20 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray21 = (java.lang.Class<?>[]) classArray20;
        java.lang.Class<?>[] wildcardClassArray22 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray20);
        java.lang.Class<?>[] wildcardClassArray23 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray20);
        java.lang.Class<?>[] wildcardClassArray24 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray20);
        java.lang.String str25 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray24);
        boolean boolean27 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray18, wildcardClassArray24, true);
        java.lang.Class<?>[] wildcardClassArray28 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray18);
        boolean boolean30 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray3, wildcardClassArray28, true);
        java.lang.String[] strArray33 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                      java.lang                                                      ", "Cinaxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        java.lang.Class<?>[] wildcardClassArray34 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray33);
        java.lang.Class<?>[] wildcardClassArray35 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray34);
        java.lang.Class<?>[] wildcardClassArray36 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray34);
        boolean boolean37 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray3, wildcardClassArray34);
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertNotNull(classArray6);
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray12);
        org.junit.Assert.assertNotNull(classArray14);
        org.junit.Assert.assertNotNull(wildcardClassArray15);
        org.junit.Assert.assertNotNull(wildcardClassArray16);
        org.junit.Assert.assertNotNull(wildcardClassArray17);
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertNotNull(classArray20);
        org.junit.Assert.assertNotNull(wildcardClassArray21);
        org.junit.Assert.assertNotNull(wildcardClassArray22);
        org.junit.Assert.assertNotNull(wildcardClassArray23);
        org.junit.Assert.assertNotNull(wildcardClassArray24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(wildcardClassArray34);
        org.junit.Assert.assertNotNull(wildcardClassArray35);
        org.junit.Assert.assertNotNull(wildcardClassArray36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test13575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13575");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("\u5370\u5730\u6587 (HI!,cHINA)", 32, (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test13576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13576");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("EN_ca", ".Cinaxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx..");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EN_ca" + "'", str2, "EN_ca");
    }

    @Test
    public void test13577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13577");
        java.lang.String[] strArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny("Chnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test13578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13578");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("ngls", 100, "c");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccngls" + "'", str3, "ccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccngls");
    }

    @Test
    public void test13579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13579");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("lang)", 0, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "lang)" + "'", str3, "lang)");
    }

    @Test
    public void test13580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13580");
        java.util.Locale locale0 = java.util.Locale.ROOT;
        java.lang.String str1 = locale0.toLanguageTag();
        java.util.Locale locale2 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale3 = java.util.Locale.getDefault();
        java.lang.String str4 = locale2.getDisplayCountry(locale3);
        java.lang.String str5 = locale2.toLanguageTag();
        boolean boolean6 = locale2.hasExtensions();
        java.lang.String str7 = locale2.getDisplayCountry();
        java.util.Set<java.lang.String> strSet8 = locale2.getUnicodeLocaleKeys();
        java.lang.String str9 = locale0.getDisplayScript(locale2);
        boolean boolean10 = locale2.hasExtensions();
        java.lang.String str11 = locale2.getCountry();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "und" + "'", str1, "und");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale3);
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "zh-cnenglish_LOCALE.LANGUAGERANGE");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "China" + "'", str4, "China");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "zh-CN" + "'", str5, "zh-CN");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "China" + "'", str7, "China");
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "CN" + "'", str11, "CN");
    }

    @Test
    public void test13581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13581");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("ahi!hi!");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "ESE");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test13582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13582");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("hi");
        java.lang.Object[] objArray2 = languageRangeList1.toArray();
        java.util.Spliterator<java.util.Locale.LanguageRange> languageRangeSpliterator3 = languageRangeList1.spliterator();
        java.util.Locale.Builder builder4 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        java.util.Locale.Builder builder7 = builder5.setLanguageTag("zh-CN");
        java.util.Locale locale8 = builder5.build();
        boolean boolean9 = languageRangeList1.remove((java.lang.Object) locale8);
        int int10 = languageRangeList1.size();
        java.util.Spliterator<java.util.Locale.LanguageRange> languageRangeSpliterator11 = languageRangeList1.spliterator();
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor12 = languageRangeList1.listIterator();
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(languageRangeSpliterator3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh_CN");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(languageRangeSpliterator11);
        org.junit.Assert.assertNotNull(languageRangeItor12);
    }

    @Test
    public void test13583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13583");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("zh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CTWzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-C");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CTWzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-" + "'", str1, "zh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CTWzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-");
    }

    @Test
    public void test13584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13584");
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
        java.util.Locale locale22 = builder21.build();
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
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "");
    }

    @Test
    public void test13585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13585");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5...", (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test13586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13586");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor85 = languageRangeList3.listIterator(9);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 9");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
// flaky:         org.junit.Assert.assertEquals(locale38.toString(), "zh-cnenglish_LOCALE.LANGUAGERANGE");
// flaky:         org.junit.Assert.assertEquals("'" + str39 + "' != '" + "China" + "'", str39, "China");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "zh-CN" + "'", str40, "zh-CN");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale42);
// flaky:         org.junit.Assert.assertEquals(locale42.toString(), "zh-cnenglish_LOCALE.LANGUAGERANGE");
// flaky:         org.junit.Assert.assertEquals("'" + str43 + "' != '" + "China" + "'", str43, "China");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale45);
// flaky:         org.junit.Assert.assertEquals(locale45.toString(), "zh-cnenglish_LOCALE.LANGUAGERANGE");
// flaky:         org.junit.Assert.assertEquals("'" + str46 + "' != '" + "China" + "'", str46, "China");
        org.junit.Assert.assertEquals(locale50.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale52);
// flaky:         org.junit.Assert.assertEquals(locale52.toString(), "zh-cnenglish_LOCALE.LANGUAGERANGE");
// flaky:         org.junit.Assert.assertEquals("'" + str53 + "' != '" + "China" + "'", str53, "China");
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
    }

    @Test
    public void test13587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13587");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("enghI", "                                              italiahi                                              t                                              italiahi                                              l                                              italiahi                                                                                            italiahi                                                                                            italiahi                                              o", 81);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "enghI" + "'", str3, "enghI");
    }

    @Test
    public void test13588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13588");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "String");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test13589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13589");
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
            java.util.Locale.Builder builder17 = builder15.setVariant("an       aan       aan       aan       aan       aan       aan       aan       aan       aan       aan       aan       aan       aan       aan       aan       aan       aan       aan       aan       aan       aan       aan       aan       aan       aan       aan       aan       aan       aan       aan       aan       aan       aan       aan       a");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: an       aan       aan       aan       aan       aan       aan       aan       aan       aan       aan       aan       aan       aan       aan       aan       aan       aan       aan       aan       aan       aan       aan       aan       aan       aan       aan       aan       aan       aan       aan       aan       aan       aan       aan       a [at index 0]");
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
    public void test13590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13590");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "CHINOIS (CHINE)4444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "CHINOIS (CHINE)4444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      " + "'", str1, "CHINOIS (CHINE)4444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      ");
    }

    @Test
    public void test13591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13591");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "\u5317\u5370\u5ea6\u6587", (java.lang.CharSequence) "t                                               ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test13592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13592");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("                                                jpn                                                 ", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test13593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13593");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("ENGLTWNSTWN", "slgneslgneslgnefran\347ais (canada)slgneslgneslgnesslgneslgneslgnefran\347ais (canada)slgneslgneslgnesslgneslgneslgnefran\347ais (canada)slgneslgneslgnesslgneslgneslgnefran\347ais (canada)slgneslgneslgnesslgneslgneslgnefran\347ais (canada)slgneslgneslgnesslgneslgneslgnefran\347ais (canada)slgneslgneslgnesslgneslgneslgnefran\347ais (canada)slgneslgneslgnesslgneslgneslg.......................HI.......................slgneslgneslgnefran\347ais (canada)slgneslgneslgnesslgneslgneslgnefran\347ais (canada)slgneslgneslgnesslgneslgneslgnefran\347ais (canada)slgneslgneslgnesslgneslgneslgnefran\347ais (canada)slgneslgneslgnesslgneslgneslgnefran\347ais (canada)slgneslgneslgnesslgneslgneslgnefran\347ais (canada)slgneslgneslgnesslgneslgneslgnefran\347ais (canada)slgneslgneslgnesslgneslgneslgn", "          ...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ENGLTWNSTWN" + "'", str3, "ENGLTWNSTWN");
    }

    @Test
    public void test13594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13594");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("ESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWAN");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=ese(taiwanese(taiwanese(taiwanese(taiwanese(taiwanese(taiwanese(taiwanese(taiwanese(taiwanese(taiwanese(taiwanese(taiwanese(taiwanese(taiwanese(taiwanese(taiwanese(taiwanese(taiwanese(taiwanese(taiwanese(taiwanese(taiwanese(taiwanese(taiwanese(taiwanese(taiwanese(taiwanese(taiwanese(taiwanese(taiwanese(taiwanese(taiwanese(taiwanese(taiwanese(taiwanese(taiwanese(taiwanese(taiwanese(taiwan");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13595");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("ggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test13596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13596");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("collecti", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!              aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test13597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13597");
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
        java.lang.String str78 = org.apache.commons.lang3.StringUtils.join(languageRangeItor76, "     Chine");
        java.lang.String str80 = org.apache.commons.lang3.StringUtils.join(languageRangeItor76, "e!e(Tiiwin");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange81 = languageRangeItor76.next();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
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
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "it");
        org.junit.Assert.assertEquals(locale60.toString(), "");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertNotNull(locale62);
        org.junit.Assert.assertEquals(locale62.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "inglese" + "'", str63, "inglese");
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
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
    }

    @Test
    public void test13598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13598");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "LANG      ", 6);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str3, "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test13599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13599");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("ArrayList.Itr", 98, "..............................            locale.builder             ...............................");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "..............................            ArrayList.Itr..............................            l" + "'", str3, "..............................            ArrayList.Itr..............................            l");
    }

    @Test
    public void test13600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13600");
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
        java.util.Iterator<java.util.Locale.LanguageRange> languageRangeItor26 = languageRangeList19.iterator();
        boolean boolean27 = languageRangeItor26.hasNext();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange28 = languageRangeItor26.next();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
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
        org.junit.Assert.assertNotNull(languageRangeItor26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test13601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13601");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                jpn                                                 ", "hArrayList");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test13602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13602");
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
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream21 = languageRangeList1.stream();
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
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream72 = languageRangeList23.parallelStream();
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap73 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList74 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList23, strMap73);
        boolean boolean75 = languageRangeList1.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList74);
        java.util.Locale locale77 = java.util.Locale.forLanguageTag("EN-ca");
        java.lang.String str78 = locale77.getLanguage();
        boolean boolean79 = languageRangeList1.equals((java.lang.Object) str78);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange81 = languageRangeList1.remove(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
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
        org.junit.Assert.assertNotNull(languageRangeStream21);
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
        org.junit.Assert.assertEquals(locale32.toString(), "it");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Cina" + "'", str33, "Cina");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "zh-CN" + "'", str34, "zh-CN");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "it");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Cina" + "'", str37, "Cina");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "it");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Cina" + "'", str40, "Cina");
        org.junit.Assert.assertEquals(locale44.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "it");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Cina" + "'", str47, "Cina");
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
        org.junit.Assert.assertNotNull(languageRangeStream72);
        org.junit.Assert.assertNotNull(languageRangeList74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(locale77);
        org.junit.Assert.assertEquals(locale77.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "en" + "'", str78, "en");
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
    }

    @Test
    public void test13603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13603");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.lang.Class<?>[] wildcardClassArray3 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray1);
        java.lang.Class<?>[] wildcardClassArray4 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray1);
        java.lang.Class<?>[] wildcardClassArray5 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) wildcardClassArray5);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray5, '.', 44, 17);
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertNotNull(wildcardClassArray4);
        org.junit.Assert.assertNotNull(wildcardClassArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test13604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13604");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("\u4e2d\u6587\u53f0\u6e7e\u5730\u533aengliilish)", "Engl....englishs....english");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test13605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13605");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "hi!hi! (                 A                 )");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi!hi! (                 A                 )" + "'", str1, "Hi!hi! (                 A                 )");
    }

    @Test
    public void test13606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13606");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("...istfraHArrayListfraHArrayListfraHArrayListfraHArrayListfraHArrayListfraHArrayListfraHArrayL...", "                     cn (ITALIANOJAJAJAJAJAJAJAJAJAJAJAJAJAJ)                      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...istfraHArrayListfraHArrayListfraHArrayListfraHArrayListfraHArrayListfraHArrayListfraHArrayL..." + "'", str2, "...istfraHArrayListfraHArrayListfraHArrayListfraHArrayListfraHArrayListfraHArrayListfraHArrayL...");
    }

    @Test
    public void test13607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13607");
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
        java.util.Locale.LanguageRange[] languageRangeArray16 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList17 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList17, languageRangeArray16);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap19 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList20 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList17, strMap19);
        int int21 = languageRangeList17.size();
        java.util.Locale locale22 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str23 = locale22.getISO3Language();
        java.lang.String str25 = locale22.getUnicodeLocaleType("AI");
        java.util.Set<java.lang.String> strSet26 = locale22.getUnicodeLocaleAttributes();
        boolean boolean27 = languageRangeList17.contains((java.lang.Object) locale22);
        java.util.Spliterator<java.util.Locale.LanguageRange> languageRangeSpliterator28 = languageRangeList17.spliterator();
        java.util.Locale.FilteringMode[] filteringModeArray29 = new java.util.Locale.FilteringMode[] {};
        java.util.Locale.FilteringMode[] filteringModeArray30 = languageRangeList17.toArray(filteringModeArray29);
        boolean boolean31 = languageRangeList14.containsAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList17);
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Locale.LanguageRange" + "'", str6, "Locale.LanguageRange");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "english" + "'", str7, "english");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(languageRangeList14);
        org.junit.Assert.assertNotNull(languageRangeStream15);
        org.junit.Assert.assertNotNull(languageRangeArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(languageRangeList20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "fra" + "'", str23, "fra");
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(strSet26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(languageRangeSpliterator28);
        org.junit.Assert.assertNotNull(filteringModeArray29);
        org.junit.Assert.assertNotNull(filteringModeArray30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test13608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13608");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale4 = new java.util.Locale("       hi!", "LOCALE#LANGUAGERANGE", "\u65e5\u6587");
        java.util.Locale locale5 = java.util.Locale.CANADA;
        java.util.Set<java.lang.String> strSet6 = locale5.getUnicodeLocaleAttributes();
        java.util.Locale locale8 = java.util.Locale.FRANCE;
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale8);
        java.lang.String str10 = locale5.getDisplayCountry(locale8);
        java.lang.String str11 = locale4.getDisplayVariant(locale8);
        java.util.Locale.setDefault(category0, locale8);
        java.lang.String str13 = locale8.getVariant();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "\u65e5\u6587");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_CA");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "english" + "'", str9, "english");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Canada" + "'", str10, "Canada");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\u65e5\u6587" + "'", str11, "\u65e5\u6587");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test13609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13609");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("e!e(Tiiwin");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=e!e(tiiwin");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13610");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("javacinese.cineselang                                                ", 116);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                               javacinese.cineselang                                                " + "'", str2, "                                               javacinese.cineselang                                                ");
    }

    @Test
    public void test13611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13611");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("44444444444444444444444444444444444chinChin (HI!,cHINA44444444444444444444444444444444444chinChin (HI!,cHINA44444444444444444444444444444444444chinChin (HI!,cHINA44444444444444444444444444444444444chinChin (HI!,cHINA44444444444444444444444444444444444chinChin (HI!,cHINA44444444444444444444444444444444444chinChin", 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=44444444444444444444444444444444444chinchin (hi!,china44444444444444444444444444444444444chinchin (hi!,china44444444444444444444444444444444444chinchin (hi!,china44444444444444444444444444444444444chinchin (hi!,china44444444444444444444444444444444444chinchin (hi!,china44444444444444444444444444444444444chinchin");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13612");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("FR", "444444ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test13613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13613");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("INA$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$", "EnglGermnsGermn");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test13614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13614");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("", "#########################English");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test13615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13615");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("undaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaHundaaaaaaaH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UNDAAAAAAAhUNDAAAAAAAhUNDAAAAAAAhUNDAAAAAAAhUNDAAAAAAAhUNDAAAAAAAhUNDAAAAAAAhUNDAAAAAAAhUNDAAAAAAAhUNDAAAAAAAhUNDAAAAAAAhUNDAAAAAAAhUNDAAAAAAAhUNDAAAAAAAhUNDAAAAAAAhUNDAAAAAAAhUNDAAAAAAAhUNDAAAAAAAhUNDAAAAAAAhUNDAAAAAAAhUNDAAAAAAAhUNDAAAAAAAhUNDAAAAAAAhUNDAAAAAAAhUNDAAAAAAAhUNDAAAAAAAhUNDAAAAAAAhUNDAAAAAAAhUNDAAAAAAAhUNDAAAAAAAhUNDAAAAAAAhUNDAAAAAAAhUNDAAAAAAAhUNDAAAAAAAhUNDAAAAAAAhUNDAAAAAAAhUNDAAAAAAAhUNDAAAAAAAhUNDAAAAAAAhUNDAAAAAAAhUNDAAAAAAAhUNDAAAAAAAhUNDAAAAAAAhUNDAAAAAAAhUNDAAAAAAAhUNDAAAAAAAhUNDAAAAAAAhUNDAAAAAAAh" + "'", str1, "UNDAAAAAAAhUNDAAAAAAAhUNDAAAAAAAhUNDAAAAAAAhUNDAAAAAAAhUNDAAAAAAAhUNDAAAAAAAhUNDAAAAAAAhUNDAAAAAAAhUNDAAAAAAAhUNDAAAAAAAhUNDAAAAAAAhUNDAAAAAAAhUNDAAAAAAAhUNDAAAAAAAhUNDAAAAAAAhUNDAAAAAAAhUNDAAAAAAAhUNDAAAAAAAhUNDAAAAAAAhUNDAAAAAAAhUNDAAAAAAAhUNDAAAAAAAhUNDAAAAAAAhUNDAAAAAAAhUNDAAAAAAAhUNDAAAAAAAhUNDAAAAAAAhUNDAAAAAAAhUNDAAAAAAAhUNDAAAAAAAhUNDAAAAAAAhUNDAAAAAAAhUNDAAAAAAAhUNDAAAAAAAhUNDAAAAAAAhUNDAAAAAAAhUNDAAAAAAAhUNDAAAAAAAhUNDAAAAAAAhUNDAAAAAAAhUNDAAAAAAAhUNDAAAAAAAhUNDAAAAAAAhUNDAAAAAAAhUNDAAAAAAAhUNDAAAAAAAhUNDAAAAAAAh");
    }

    @Test
    public void test13616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13616");
        java.util.Locale locale0 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale1 = java.util.Locale.getDefault();
        java.lang.String str2 = locale0.getDisplayCountry(locale1);
        java.lang.String str3 = locale1.getDisplayVariant();
        java.lang.String str5 = locale1.getExtension('a');
        java.lang.String str6 = locale1.getDisplayLanguage();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Cina" + "'", str2, "Cina");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "italiano" + "'", str6, "italiano");
    }

    @Test
    public void test13617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13617");
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
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream68 = languageRangeList3.parallelStream();
        java.lang.Object[] objArray69 = languageRangeList3.toArray();
        java.util.Iterator<java.util.Locale.LanguageRange> languageRangeItor70 = languageRangeList3.iterator();
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream71 = languageRangeList3.parallelStream();
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
        org.junit.Assert.assertNotNull(languageRangeStream68);
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertNotNull(languageRangeItor70);
        org.junit.Assert.assertNotNull(languageRangeStream71);
    }

    @Test
    public void test13618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13618");
        java.util.Locale locale3 = new java.util.Locale("italiahI", "", "Locale.Builder");
        java.util.Locale.setDefault(locale3);
        java.util.Locale locale8 = new java.util.Locale("CN", "italianojajajajajajajajajajajajajaj", "");
        java.lang.String str9 = locale8.toLanguageTag();
        java.lang.String str10 = locale3.getDisplayScript(locale8);
        org.junit.Assert.assertEquals(locale3.toString(), "italiahi__Locale.Builder");
        org.junit.Assert.assertEquals(locale8.toString(), "cn_ITALIANOJAJAJAJAJAJAJAJAJAJAJAJAJAJ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "cn" + "'", str9, "cn");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test13619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13619");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName("a#");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test13620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13620");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("Locale", "ud", 747);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("Chinese", "slgneslgneslgnefran\347ais (canada)slgneslgneslgnes");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEach("cHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", strArray5, strArray8);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.concatWith("chinaundaaaaaaachinaundaaaaaaachinaundaaaaaaahi-chinaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachinaundaaaaaaachina", (java.lang.Object[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "cHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str9, "cHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Locale" + "'", str10, "Locale");
    }

    @Test
    public void test13621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13621");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("zh-cnenglh");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList1, "HI!STRING[]STRING[]S");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList6 = languageRangeList1.subList((int) (short) 0, (int) (short) 1);
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(languageRangeList6);
    }

    @Test
    public void test13622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13622");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!              aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "italiahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahI", 116);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test13623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13623");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("inglese", "\u5357\u97d3");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "inglese" + "'", str2, "inglese");
    }

    @Test
    public void test13624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13624");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("", "REFERENCEPIPELINE.HEAD");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test13625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13625");
        java.util.Locale locale3 = new java.util.Locale("Cina", "ncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncArrayList", "");
        java.util.Locale locale4 = locale3.stripExtensions();
        java.util.Locale locale8 = new java.util.Locale("Cinaxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", "ggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engli", "us");
        java.lang.String str9 = locale8.getDisplayLanguage();
        java.util.Locale locale12 = new java.util.Locale("italiano", "Ci_a");
        java.util.Locale locale16 = new java.util.Locale("Canada", "allemand", "cHINA");
        java.lang.String str17 = locale12.getDisplayName(locale16);
        java.util.Set<java.lang.Character> charSet18 = locale12.getExtensionKeys();
        java.util.Locale locale19 = java.util.Locale.KOREA;
        java.lang.String str20 = locale12.getDisplayVariant(locale19);
        java.lang.String str21 = locale12.getScript();
        java.lang.String str22 = locale8.getDisplayCountry(locale12);
        java.lang.String str23 = locale4.getDisplayLanguage(locale12);
        java.lang.String str24 = locale4.getLanguage();
        org.junit.Assert.assertEquals(locale3.toString(), "cina_NCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCARRAYLIST");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "cina_NCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCARRAYLIST");
        org.junit.Assert.assertEquals(locale8.toString(), "cinaxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx_GGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLI_us");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "cinaxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx" + "'", str9, "cinaxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        org.junit.Assert.assertEquals(locale12.toString(), "italiano_CI_A");
        org.junit.Assert.assertEquals(locale16.toString(), "canada_ALLEMAND_cHINA");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "italiano (CI_A)" + "'", str17, "italiano (CI_A)");
        org.junit.Assert.assertNotNull(charSet18);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "GGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLI" + "'", str22, "GGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLI");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "cina" + "'", str23, "cina");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "cina" + "'", str24, "cina");
    }

    @Test
    public void test13626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13626");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("A][gnirts", "               eN                ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test13627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13627");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("\u4e2d\u570b", 24);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test13628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13628");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "Chinese (China)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Chinese (China)" + "'", str1, "Chinese (China)");
    }

    @Test
    public void test13629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13629");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("\u82f1\u6587\u7f8e\u56fd)", "arraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test13630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13630");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageName("iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test13631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13631");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("                                                                  xxxxxxxxxxFrench(France)xxxxxxxxxx", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=xxxxxxxxxxfrench(france)xxxxxxxxxx");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13632");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "  cn    United Kingdom  cn    United Kingdom  cn    United Kingdom  cn    United Kingdom  cn    United Kingdom  cn    United Kingdom  cn    United Kingdom  cn    United Kingdom  cn    United Kingdom  cn    United Kingdom  cn    United Kingdom  cn    United Kingdom  cn    United Kingdom  cn    United Kingdom  cn    United Kingdom  cn    United Kingdom  cn    United Kingdom  cn    United Kingdom  cn    United Kingdom  cn    United Kingdom  cn    United Kingdom  cn    United Kingdom  cn    United Kingdom  cn    United Kingdom  cn    United Kingdom  cn    United Kingdom  cn    United Kingdom  cn    United Kingdom  cn    United Kingdom  cn    United Kingdom  cn    United Kingdom  cn    United Kingdom  cn    United Kingdom  cn    United Kingdom  cn    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test13633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13633");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("cNXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", '$');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test13634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13634");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("\u65e5\u6587", "ArrayList");
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("ITALIAHiITALIAHiITALIAHiITALIAHiITALIAHiITALIAHiITALIAHiITALIAHiITALIAHiITALIAHiITALIAHiITAL...XXXX", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test13635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13635");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("hi");
        java.util.Locale.LanguageRange[] languageRangeArray2 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList3 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList3, languageRangeArray2);
        java.util.Locale locale6 = java.util.Locale.FRANCE;
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale6);
        java.util.Locale locale8 = java.util.Locale.US;
        java.util.Locale locale9 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale10 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale11 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale12 = java.util.Locale.getDefault();
        java.lang.String str13 = locale11.getDisplayCountry(locale12);
        java.lang.String str14 = locale11.toLanguageTag();
        java.util.Locale locale15 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale16 = java.util.Locale.getDefault();
        java.lang.String str17 = locale15.getDisplayCountry(locale16);
        java.util.Locale locale18 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale19 = java.util.Locale.getDefault();
        java.lang.String str20 = locale18.getDisplayCountry(locale19);
        java.util.Locale locale24 = new java.util.Locale("hi", "hi!", "cHINA");
        java.util.Locale locale25 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale26 = java.util.Locale.getDefault();
        java.lang.String str27 = locale25.getDisplayCountry(locale26);
        java.util.Locale locale29 = new java.util.Locale("");
        java.lang.String str30 = locale29.getDisplayVariant();
        java.util.Locale locale31 = java.util.Locale.KOREAN;
        java.util.Locale locale33 = new java.util.Locale("");
        java.util.Locale locale34 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale[] localeArray35 = new java.util.Locale[] { locale6, locale8, locale9, locale10, locale11, locale16, locale18, locale24, locale26, locale29, locale31, locale33, locale34 };
        java.util.ArrayList<java.util.Locale> localeList36 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList36, localeArray35);
        java.util.List<java.util.Locale> localeList38 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList3, (java.util.Collection<java.util.Locale>) localeList36);
        java.util.List<java.util.Locale> localeList39 = java.util.Locale.filter(languageRangeList1, (java.util.Collection<java.util.Locale>) localeList38);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream40 = languageRangeList1.parallelStream();
        boolean boolean42 = languageRangeList1.remove((java.lang.Object) "francese");
        java.util.Spliterator<java.util.Locale.LanguageRange> languageRangeSpliterator43 = languageRangeList1.spliterator();
        boolean boolean44 = languageRangeList1.isEmpty();
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(languageRangeArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "english" + "'", str7, "english");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "italiahi__Locale.Builder");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "China" + "'", str13, "China");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "zh-CN" + "'", str14, "zh-CN");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "italiahi__Locale.Builder");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "China" + "'", str17, "China");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "italiahi__Locale.Builder");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "China" + "'", str20, "China");
        org.junit.Assert.assertEquals(locale24.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "italiahi__Locale.Builder");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "China" + "'", str27, "China");
        org.junit.Assert.assertEquals(locale29.toString(), "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "ko");
        org.junit.Assert.assertEquals(locale33.toString(), "");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(localeList38);
        org.junit.Assert.assertNotNull(localeList39);
        org.junit.Assert.assertNotNull(languageRangeStream40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(languageRangeSpliterator43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test13636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13636");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByCharacterType("hI");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("italianojajajajajajajajajajajajajaj", strArray3);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "                                                gnalesenic.esenicavaj                                                ");
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("Chin", "english");
        boolean boolean13 = org.apache.commons.lang3.StringUtils.endsWithAny("                                                                                                    ", strArray12);
        java.lang.String[] strArray15 = org.apache.commons.lang3.StringUtils.stripAll(strArray12, "zh_CN");
        boolean boolean16 = org.apache.commons.lang3.StringUtils.endsWithAny("a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#.FilteringMode", strArray12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxchn", strArray3, strArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 2 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hI" + "'", str4, "hI");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "h                                                gnalesenic.esenicavaj                                                I" + "'", str7, "h                                                gnalesenic.esenicavaj                                                I");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test13637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13637");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("AD.FR_CAZW", '$', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AD.FR_CAZW" + "'", str3, "AD.FR_CAZW");
    }

    @Test
    public void test13638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13638");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("", 31);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test13639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13639");
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
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream68 = languageRangeList3.parallelStream();
        java.lang.String str70 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) languageRangeStream68, "cn (ITALIANOJAJAJAJAJAJAJAJAJAJAJAJAJAJ)");
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
        org.junit.Assert.assertEquals(locale38.toString(), "italiahi__Locale.Builder");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "China" + "'", str39, "China");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "zh-CN" + "'", str40, "zh-CN");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "italiahi__Locale.Builder");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "China" + "'", str43, "China");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "italiahi__Locale.Builder");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "China" + "'", str46, "China");
        org.junit.Assert.assertEquals(locale50.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "italiahi__Locale.Builder");
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
        org.junit.Assert.assertNotNull(localeList65);
        org.junit.Assert.assertNotNull(localeList66);
        org.junit.Assert.assertNull(locale67);
        org.junit.Assert.assertNotNull(languageRangeStream68);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "java.util.stream" + "'", str70, "java.util.stream");
    }

    @Test
    public void test13640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13640");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("44444444444444444444444444444444444", "italiahI");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test13641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13641");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("ChinChinChinChinChinChinChinChinChinaaaaaaaaa$", 98);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ChinChinChinChinChinChinChinChinChinaaaaaaaaa$                                                    " + "'", str2, "ChinChinChinChinChinChinChinChinChinaaaaaaaaa$                                                    ");
    }

    @Test
    public void test13642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13642");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("###############################EnglHI!STRING[]STRING[]SsHI!STRING[]STRING[]S###############################EnglHI!STRING[]STRING[]SsHI!STRING[]STRING[]S###############################EnglHI!STRING[]STRING[]SsHI!STRING[]STRING[]S###############################EnglHI!STRING[]STRING[]SsHI!STRING[]STRING[]S###############################EnglHI!STRING[]STRING[]SsHI!STRING[]STRING[]S###############################EnglHI!STRING[]STRING[]SsHI!STRING[]STRING[]S###############################EnglHI!STRING[]STRING[]SsHI!STRING[]STRING[]S###############################EnglHI!STRING[]STRING[]SsHI!STRING[]STRING[]S###############################EnglHI!STRING[]STRING[]SsHI!STRING[]STRING[]S", "\u82f1\u8a9e");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test13643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13643");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("it", strMap1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList2, '#');
        java.lang.Object[] objArray5 = languageRangeList2.toArray();
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void test13644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13644");
        java.util.Locale locale0 = java.util.Locale.JAPAN;
        java.util.Locale.setDefault(locale0);
        java.util.Set<java.lang.String> strSet2 = locale0.getUnicodeLocaleKeys();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(strSet2);
    }

    @Test
    public void test13645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13645");
        java.lang.CharSequence charSequence0 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference(charSequence0, (java.lang.CharSequence) "CHINCHINCHINCHINCHICHINCHINCHINCHINC");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test13646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13646");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("            locale.builder             ");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test13647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13647");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "\u4e2d\u6587\u53f0\u7063", true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: String[]String[]String[]S??(??");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13648");
        char[] charArray5 = new char[] {};
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray5);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "zh-CN", charArray5);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsAny("                 a                  ", charArray5);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "chnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray5);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsAny("china (China)", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test13649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13649");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("                            ese (Taiwan", "englhi!string[]string[]sshi!string[]string[]s");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "englhi!string[]string[]sshi!string[]string[]s" + "'", str2, "englhi!string[]string[]sshi!string[]string[]s");
    }

    @Test
    public void test13650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13650");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("             an       a", 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13651");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("LOCALE#LANGUAGERANGE", "ad.ae.af.ag.ai.al.am.an.ao.aq.ar.as.at.au.aw.ax.az.ba.bb.bd.be.bf.bg.bh.bi.bj.bl.bm.bn.bo.bq.br.bs.bt.bv.bw.by.bz.ca.cc.cd.cf.cg.ch.ci.ck.cl.cm.cn.co.cr.cu.cv.cw.cx.cy.cz.de.dj.dk.dm.do.dz.ec.ee.eg.eh.er.es.et.fi.fj.fk.fm.fo.fr.ga.gb.gd.ge.gf.gg.gh.gi.gl.gm.gn.gp.gq.gr.gs.gt.gu.gw.gy.hk.hm.hn.hr.ht.hu.id.ie.il.im.in.io.iq.ir.is.it.je.jm.jo.jp.ke.kg.kh.ki.km.kn.kp.kr.kw.ky.kz.la.lb.lc.li.lk.lr.ls.lt.lu.lv.ly.ma.mc.md.me.mf.mg.mh.mk.ml.mm.mn.mo.mp.mq.mr.ms.mt.mu.mv.mw.mx.my.mz.na.nc.ne.nf.ng.ni.nl.no.np.nr.nu.nz.om.pa.pe.pf.pg.ph.pk.pl.pm.pn.pr.ps.pt.pw.py.qa.re.ro.rs.ru.rw.sa.sb.sc.sd.se.sg.sh.si.sj.sk.sl.sm.sn.so.sr.ss.st.sv.sx.sy.sz.tc.td.tf.tg.th.tj.tk.tl.tm.tn.to.tr.tt.tv.tw.tz.ua.ug.um.us.uy.uz.va.vc.ve.vg.vi.vn.vu.wf.ws.ye.yt.za.zm.z");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test13652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13652");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("char[]", "FR-CA", 4);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test13653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13653");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("         HI!HI!HI!HI!HI!HI          ", "oL");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test13654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13654");
        java.util.Locale locale3 = new java.util.Locale("France", "italianojajajajajajajajajajajajajaj", "cn (ITALIANOJAJAJAJAJAJAJAJAJAJAJAJAJAJ)");
        org.junit.Assert.assertEquals(locale3.toString(), "france_ITALIANOJAJAJAJAJAJAJAJAJAJAJAJAJAJ_cn (ITALIANOJAJAJAJAJAJAJAJAJAJAJAJAJAJ)");
    }

    @Test
    public void test13655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13655");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("inglenglese", 15, 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test13656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13656");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("                                                                                            ##_#A", "CHINOIS (CHINE)444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                            ##_#A" + "'", str2, "                                                                                            ##_#A");
    }

    @Test
    public void test13657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13657");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName("\u65e5\u6587");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u65e5\u6587" + "'", str1, "\u65e5\u6587");
    }

    @Test
    public void test13658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13658");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "English (United States)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "english (United States)" + "'", str1, "english (United States)");
    }

    @Test
    public void test13659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13659");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "englCNsCNxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test13660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13660");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("         HI!HI!HI!HI!HI!HI          ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "         HI!HI!HI!HI!HI!HI          " + "'", str1, "         HI!HI!HI!HI!HI!HI          ");
    }

    @Test
    public void test13661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13661");
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
        java.lang.Class<?>[] wildcardClassArray16 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray13);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) classArray13, "zh-CN");
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) classArray13, ' ', 100, 0);
        boolean boolean24 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray7, (java.lang.Class<?>[]) classArray13, false);
        java.lang.Class<?>[] wildcardClassArray25 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray7);
        java.lang.Class<?>[] wildcardClassArray26 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray25);
        java.util.Locale.LanguageRange[] languageRangeArray27 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList28 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList28, languageRangeArray27);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap30 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList31 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList28, strMap30);
        java.util.Locale.LanguageRange[] languageRangeArray32 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList33 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList33, languageRangeArray32);
        boolean boolean35 = languageRangeList28.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList33);
        java.lang.String str37 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList33, "hi!");
        java.lang.Class[] classArray39 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray40 = (java.lang.Class<?>[]) classArray39;
        java.lang.Class<?>[] wildcardClassArray41 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray39);
        java.lang.Class<?>[] wildcardClassArray42 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray39);
        java.lang.Class[] classArray45 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray46 = (java.lang.Class<?>[]) classArray45;
        java.lang.Class<?>[] wildcardClassArray47 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray45);
        java.lang.String str48 = org.apache.commons.lang3.StringUtils.concatWith("hi!", (java.lang.Object[]) classArray45);
        boolean boolean49 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray39, (java.lang.Class<?>[]) classArray45);
        java.lang.Class[] classArray51 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray52 = (java.lang.Class<?>[]) classArray51;
        java.lang.Class<?>[] wildcardClassArray53 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray51);
        java.lang.Class<?> wildcardClass54 = null;
        java.lang.Class[] classArray56 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray57 = (java.lang.Class<?>[]) classArray56;
        wildcardClassArray57[0] = wildcardClass54;
        boolean boolean61 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray53, wildcardClassArray57, false);
        java.lang.Class[] classArray63 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray64 = (java.lang.Class<?>[]) classArray63;
        java.lang.Class<?>[] wildcardClassArray65 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray63);
        boolean boolean66 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray53, (java.lang.Class<?>[]) classArray63);
        boolean boolean67 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray39, (java.lang.Class<?>[]) classArray63);
        java.lang.Class<?>[] wildcardClassArray68 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers((java.lang.Class<?>[]) classArray63);
        java.lang.Class<?>[] wildcardClassArray69 = languageRangeList33.toArray((java.lang.Class<?>[]) classArray63);
        java.lang.Class<?>[] wildcardClassArray70 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray69);
        java.lang.Class<?>[] wildcardClassArray71 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray70);
        java.lang.Class<?>[] wildcardClassArray72 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray70);
        boolean boolean74 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray26, wildcardClassArray72, true);
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertNotNull(classArray6);
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(classArray13);
        org.junit.Assert.assertNotNull(wildcardClassArray14);
        org.junit.Assert.assertNotNull(wildcardClassArray15);
        org.junit.Assert.assertNotNull(wildcardClassArray16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray25);
        org.junit.Assert.assertNotNull(wildcardClassArray26);
        org.junit.Assert.assertNotNull(languageRangeArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(languageRangeList31);
        org.junit.Assert.assertNotNull(languageRangeArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(classArray39);
        org.junit.Assert.assertNotNull(wildcardClassArray40);
        org.junit.Assert.assertNotNull(wildcardClassArray41);
        org.junit.Assert.assertNotNull(wildcardClassArray42);
        org.junit.Assert.assertNotNull(classArray45);
        org.junit.Assert.assertNotNull(wildcardClassArray46);
        org.junit.Assert.assertNotNull(wildcardClassArray47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(classArray51);
        org.junit.Assert.assertNotNull(wildcardClassArray52);
        org.junit.Assert.assertNotNull(wildcardClassArray53);
        org.junit.Assert.assertNotNull(classArray56);
        org.junit.Assert.assertNotNull(wildcardClassArray57);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(classArray63);
        org.junit.Assert.assertNotNull(wildcardClassArray64);
        org.junit.Assert.assertNotNull(wildcardClassArray65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray68);
        org.junit.Assert.assertNotNull(wildcardClassArray69);
        org.junit.Assert.assertNotNull(wildcardClassArray70);
        org.junit.Assert.assertNotNull(wildcardClassArray71);
        org.junit.Assert.assertNotNull(wildcardClassArray72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
    }

    @Test
    public void test13662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13662");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("builder", "GNAL.AVAJSTRING[]STRING[]STRING[]", "FranceseFranceseFranceseFranceseFrancslgne");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test13663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13663");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("ENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISH", "Collecti", 94);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test13664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13664");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "\u0905\u0901\u0917\u094d\u0930\u0947\u091c\u093c\u0940 (italiano)", (java.lang.CharSequence) "       hi!italiahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIital...xxxx");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test13665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13665");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "Chi..");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test13666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13666");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("zh-cn", 15, "nawiaT");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nawiazh-cnnawia" + "'", str3, "nawiazh-cnnawia");
    }

    @Test
    public void test13667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13667");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("HINA", "JAJAJAJAJAJAJAJAJAJAJAJAJAJ)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test13668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13668");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("x-lvariant-us", 'u');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test13669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13669");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("JAVA.LANG", "                                             italiahI                                             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JAVA.LANG" + "'", str2, "JAVA.LANG");
    }

    @Test
    public void test13670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13670");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("French (France)", "enghI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test13671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13671");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("GNAL.AVAJSTRING[]STRING[]STRING[", "ANIHCzhcinesesexxxxx");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test13672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13672");
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
        java.util.Spliterator<java.util.Locale.LanguageRange> languageRangeSpliterator20 = languageRangeList2.spliterator();
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap22 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList23 = java.util.Locale.LanguageRange.parse("HI", strMap22);
        java.lang.String str25 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) languageRangeList23, "\u53f0\u7063");
        boolean boolean26 = languageRangeList2.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList23);
        java.util.Locale.LanguageRange[] languageRangeArray27 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList28 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList28, languageRangeArray27);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap30 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList31 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList28, strMap30);
        int int32 = languageRangeList28.size();
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor33 = languageRangeList28.listIterator();
        java.util.Locale.LanguageRange languageRange35 = new java.util.Locale.LanguageRange("a");
        java.util.Locale.LanguageRange languageRange37 = new java.util.Locale.LanguageRange("English");
        java.lang.String str39 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) languageRange37, "");
        java.util.Locale.LanguageRange languageRange41 = new java.util.Locale.LanguageRange("English");
        java.util.Locale.LanguageRange[] languageRangeArray42 = new java.util.Locale.LanguageRange[] { languageRange35, languageRange37, languageRange41 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList43 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList43, languageRangeArray42);
        boolean boolean45 = languageRangeList28.retainAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList43);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor46 = languageRangeList43.listIterator();
        java.util.Locale.LanguageRange languageRange47 = languageRangeItor46.next();
        java.util.Locale.LanguageRange languageRange48 = languageRangeItor46.next();
        boolean boolean49 = languageRangeList23.add(languageRange48);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap51 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList52 = java.util.Locale.LanguageRange.parse("ANIHC      ", strMap51);
        java.util.Locale.LanguageRange[] languageRangeArray53 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList54 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList54, languageRangeArray53);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap56 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList57 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList54, strMap56);
        boolean boolean58 = languageRangeList57.isEmpty();
        boolean boolean59 = languageRangeList52.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList57);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap61 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList62 = java.util.Locale.LanguageRange.parse("cHINA", strMap61);
        boolean boolean63 = languageRangeList57.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList62);
        java.util.Spliterator<java.util.Locale.LanguageRange> languageRangeSpliterator64 = languageRangeList62.spliterator();
        boolean boolean65 = languageRangeList23.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList62);
        java.lang.Object obj66 = null;
        boolean boolean67 = languageRangeList62.remove(obj66);
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeList6);
        org.junit.Assert.assertNotNull(languageRangeList9);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + filteringMode16 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode16.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(languageRangeSpliterator20);
        org.junit.Assert.assertNotNull(languageRangeList23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "ArrayList" + "'", str25, "ArrayList");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(languageRangeArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(languageRangeList31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(languageRangeItor33);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Locale.LanguageRange" + "'", str39, "Locale.LanguageRange");
        org.junit.Assert.assertNotNull(languageRangeArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(languageRangeItor46);
        org.junit.Assert.assertNotNull(languageRange47);
        org.junit.Assert.assertNotNull(languageRange48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(languageRangeList52);
        org.junit.Assert.assertNotNull(languageRangeArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(languageRangeList57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(languageRangeList62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(languageRangeSpliterator64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
    }

    @Test
    public void test13673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13673");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("zhcineses", (int) ' ', 92);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test13674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13674");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("ANIHC", 92);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test13675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13675");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "xGNAL.AVAJString[]String[]String[]x");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test13676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13676");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("E!E(TIIWIN", "\u5317\u5370\u5ea6\u6587 (HI!,cHINA)", 34);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test13677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13677");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("Short", (int) '.', 20);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test13678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13678");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("h", "Locale.Builder");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concatWith("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$", (java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "h" + "'", str4, "h");
    }

    @Test
    public void test13679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13679");
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
        languageRangeList1.clear();
        boolean boolean23 = languageRangeList1.remove((java.lang.Object) "GERMAN");
        java.util.function.UnaryOperator<java.util.Locale.LanguageRange> languageRangeUnaryOperator24 = null;
        // The following exception was thrown during execution in test generation
        try {
            languageRangeList1.replaceAll(languageRangeUnaryOperator24);
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test13680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13680");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("                                rArrayL                                                             ", "ANIHC$      $xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", "\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test13681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13681");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaNHC");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test13682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13682");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("\u65e5\u6587", 83, "aaaaaaait_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u65e5\u6587aaaaaaait_CNaaaaaaait_CNaaaaaaait_CNaaaaaaait_CNa" + "'", str3, "\u65e5\u6587aaaaaaait_CNaaaaaaait_CNaaaaaaait_CNaaaaaaait_CNa");
    }

    @Test
    public void test13683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13683");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("ENGLxxxxENGLISHSxxxxENGLISH", "T");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ENGLxxxxENGLISHSxxxxENGLISH" + "'", str2, "ENGLxxxxENGLISHSxxxxENGLISH");
    }

    @Test
    public void test13684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13684");
        java.util.Locale locale1 = new java.util.Locale("I");
        java.lang.String str2 = locale1.getDisplayCountry();
        java.lang.String str3 = locale1.toLanguageTag();
        java.lang.String str4 = locale1.getDisplayLanguage();
        java.lang.String str5 = locale1.getISO3Country();
        java.util.List<java.util.Locale.LanguageRange> languageRangeList7 = java.util.Locale.LanguageRange.parse("hi");
        java.lang.Object[] objArray8 = languageRangeList7.toArray();
        java.util.Spliterator<java.util.Locale.LanguageRange> languageRangeSpliterator9 = languageRangeList7.spliterator();
        java.util.Locale.Builder builder10 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder11 = builder10.clearExtensions();
        java.util.Locale.Builder builder13 = builder11.setLanguageTag("zh-CN");
        java.util.Locale locale14 = builder11.build();
        boolean boolean15 = languageRangeList7.remove((java.lang.Object) locale14);
        java.lang.String str16 = locale14.getDisplayName();
        java.lang.String str17 = locale14.getISO3Country();
        java.util.Locale locale18 = locale14.stripExtensions();
        java.lang.String str19 = locale14.getDisplayCountry();
        java.lang.String str20 = locale1.getDisplayName(locale14);
        org.junit.Assert.assertEquals(locale1.toString(), "i");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "und" + "'", str3, "und");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "i" + "'", str4, "i");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(languageRangeList7);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(languageRangeSpliterator9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_CN");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Chinese (China)" + "'", str16, "Chinese (China)");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "CHN" + "'", str17, "CHN");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "China" + "'", str19, "China");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "i" + "'", str20, "i");
    }

    @Test
    public void test13685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13685");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.setLanguageTag("zh-CN");
        java.util.Locale.Builder builder5 = builder3.setLanguage("CHINA");
        java.util.Locale locale6 = builder3.build();
        java.util.Set<java.lang.String> strSet7 = locale6.getUnicodeLocaleKeys();
        java.lang.String str8 = locale6.getDisplayCountry();
        java.lang.String str9 = locale6.getScript();
        java.util.Locale locale12 = java.util.Locale.forLanguageTag("FR");
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.lowerCase("EnglHI!STRING[]STRING[]SsHI!STRING[]STRING[]S", locale12);
        java.lang.String str14 = locale6.getDisplayName(locale12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = locale12.getUnicodeLocaleType("#####################################Germn");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: #####################################Germn");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "china_CN");
        org.junit.Assert.assertNotNull(strSet7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "China" + "'", str8, "China");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "englhi!string[]string[]sshi!string[]string[]s" + "'", str13, "englhi!string[]string[]sshi!string[]string[]s");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "china (Chine)" + "'", str14, "china (Chine)");
    }

    @Test
    public void test13686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13686");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("Ci_a", 20, "china_cn                             ese(taiwan");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "china_cn        Ci_a" + "'", str3, "china_cn        Ci_a");
    }

    @Test
    public void test13687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13687");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("L.AVAJSTRING[]STRING[]STRING[");
        boolean boolean3 = org.apache.commons.lang3.StringUtils.startsWithAny("############################NHC", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test13688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13688");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("", "jAPA", 39);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test13689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13689");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("CHINOIS (CHINE)444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "", 5);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test13690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13690");
        char[] charArray6 = new char[] { '#', '#', ' ' };
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!", charArray6);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "oL", charArray6);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                             HI!HI!HI!HI!HI!", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "## ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "## ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[#, #,  ]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test13691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13691");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "zh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CTWzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-C");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test13692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13692");
        java.lang.Iterable<java.util.Locale.LanguageRange> languageRangeIterable0 = null;
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join(languageRangeIterable0, "                  hI   Taiwan                  hI   ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test13693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13693");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("\u82f1\u6587", "ArrayList###########");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test13694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13694");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "cINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINA", 17);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "                 a  hinC");
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "\u4e2d\u6587\u53f0\u6e7e\u5730\u533aengliilish)                                  ");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test13695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13695");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hsilgnenc-hzanihchsilgnenc-hzanihchsilgnenc-hzanihchsilgnenc-hzanihchsilgnenc-hzanihchsilgnenc-hzanihchsilgnenc-hzanihchsilgnenc-hzanihchsilgnenc-hzanihchsilgnenc-hzanihchsilgnenc-hzanihchsilgnenc-hzanihchsilgnenc-hzanihchsilgnenc-hzanihchsilgnenc-hzanihchsilgnenc-hzanihchsilgnenc-hzanihchsilgnenc-hzanihchsilgnenc-hzanihchsilgnenc-hzanihchsilgnenc-hzanihchsilgnenc-hzanihchsilgnenc-hzanihchsilgnenc-hzanihchsilgnenc-hzanihchsilgnenc-hzanihchsilgnenc-hzanihchsilgnenc-hzanihchsilgnenc-hzanihchsilgnenc-hzanihchsilgnenc-hzanihchsilgnenc-hz", "...X.AZ.BA.BB.BD.BE.BF.BG.BH.BI.BJ.BL.BM.BN..");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hsilgnenc-hzanihchsilgnenc-hzanihchsilgnenc-hzanihchsilgnenc-hzanihchsilgnenc-hzanihchsilgnenc-hzanihchsilgnenc-hzanihchsilgnenc-hzanihchsilgnenc-hzanihchsilgnenc-hzanihchsilgnenc-hzanihchsilgnenc-hzanihchsilgnenc-hzanihchsilgnenc-hzanihchsilgnenc-hzanihchsilgnenc-hzanihchsilgnenc-hzanihchsilgnenc-hzanihchsilgnenc-hzanihchsilgnenc-hzanihchsilgnenc-hzanihchsilgnenc-hzanihchsilgnenc-hzanihchsilgnenc-hzanihchsilgnenc-hzanihchsilgnenc-hzanihchsilgnenc-hzanihchsilgnenc-hzanihchsilgnenc-hzanihchsilgnenc-hzanihchsilgnenc-hzanihchsilgnenc-hz" + "'", str3, "hsilgnenc-hzanihchsilgnenc-hzanihchsilgnenc-hzanihchsilgnenc-hzanihchsilgnenc-hzanihchsilgnenc-hzanihchsilgnenc-hzanihchsilgnenc-hzanihchsilgnenc-hzanihchsilgnenc-hzanihchsilgnenc-hzanihchsilgnenc-hzanihchsilgnenc-hzanihchsilgnenc-hzanihchsilgnenc-hzanihchsilgnenc-hzanihchsilgnenc-hzanihchsilgnenc-hzanihchsilgnenc-hzanihchsilgnenc-hzanihchsilgnenc-hzanihchsilgnenc-hzanihchsilgnenc-hzanihchsilgnenc-hzanihchsilgnenc-hzanihchsilgnenc-hzanihchsilgnenc-hzanihchsilgnenc-hzanihchsilgnenc-hzanihchsilgnenc-hzanihchsilgnenc-hzanihchsilgnenc-hz");
    }

    @Test
    public void test13696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13696");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("cHINA", strMap1);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList2, strMap3);
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
        java.util.Locale.LanguageRange[] languageRangeArray22 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList23 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList23, languageRangeArray22);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap25 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList26 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList23, strMap25);
        java.util.Locale.LanguageRange[] languageRangeArray27 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList28 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList28, languageRangeArray27);
        boolean boolean30 = languageRangeList23.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList28);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream31 = languageRangeList28.stream();
        boolean boolean32 = languageRangeList9.containsAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList28);
        java.util.Locale.LanguageRange languageRange34 = new java.util.Locale.LanguageRange("English");
        java.lang.String str35 = languageRange34.getRange();
        boolean boolean36 = languageRangeList9.add(languageRange34);
        java.util.Locale.LanguageRange[] languageRangeArray37 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList38 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList38, languageRangeArray37);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap40 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList41 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList38, strMap40);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream42 = languageRangeList38.stream();
        boolean boolean43 = languageRangeList38.isEmpty();
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
        java.lang.String[] strArray88 = new java.lang.String[] { "English", "hi", "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "", "a", "", "China" };
        java.util.ArrayList<java.lang.String> strList89 = new java.util.ArrayList<java.lang.String>();
        boolean boolean90 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList89, strArray88);
        java.util.List<java.lang.Class<?>> wildcardClassList91 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList89);
        java.util.Locale.FilteringMode filteringMode92 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList93 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList45, (java.util.Collection<java.lang.String>) strList89, filteringMode92);
        java.util.Locale.FilteringMode filteringMode94 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList95 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList38, (java.util.Collection<java.lang.String>) strList89, filteringMode94);
        java.lang.String str96 = java.util.Locale.lookupTag(languageRangeList9, (java.util.Collection<java.lang.String>) strList89);
        java.lang.String str97 = java.util.Locale.lookupTag(languageRangeList4, (java.util.Collection<java.lang.String>) strList89);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange99 = languageRangeList4.get(35);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(languageRangeArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(languageRangeList9);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClassList20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(languageRangeArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(languageRangeList26);
        org.junit.Assert.assertNotNull(languageRangeArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(languageRangeStream31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "english" + "'", str35, "english");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(languageRangeArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(languageRangeList41);
        org.junit.Assert.assertNotNull(languageRangeStream42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
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
// flaky:         org.junit.Assert.assertEquals(locale54.toString(), "");
// flaky:         org.junit.Assert.assertEquals("'" + str55 + "' != '" + "China" + "'", str55, "China");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "zh-CN" + "'", str56, "zh-CN");
        org.junit.Assert.assertNotNull(locale57);
        org.junit.Assert.assertEquals(locale57.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale58);
// flaky:         org.junit.Assert.assertEquals(locale58.toString(), "");
// flaky:         org.junit.Assert.assertEquals("'" + str59 + "' != '" + "China" + "'", str59, "China");
        org.junit.Assert.assertNotNull(locale60);
        org.junit.Assert.assertEquals(locale60.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale61);
// flaky:         org.junit.Assert.assertEquals(locale61.toString(), "");
// flaky:         org.junit.Assert.assertEquals("'" + str62 + "' != '" + "China" + "'", str62, "China");
        org.junit.Assert.assertEquals(locale66.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale67);
        org.junit.Assert.assertEquals(locale67.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale68);
// flaky:         org.junit.Assert.assertEquals(locale68.toString(), "");
// flaky:         org.junit.Assert.assertEquals("'" + str69 + "' != '" + "China" + "'", str69, "China");
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
        org.junit.Assert.assertNotNull(strArray88);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertNotNull(wildcardClassList91);
        org.junit.Assert.assertTrue("'" + filteringMode92 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode92.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList93);
        org.junit.Assert.assertTrue("'" + filteringMode94 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode94.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList95);
        org.junit.Assert.assertEquals("'" + str96 + "' != '" + "english" + "'", str96, "english");
        org.junit.Assert.assertEquals("'" + str97 + "' != '" + "china" + "'", str97, "china");
    }

    @Test
    public void test13697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13697");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "italiahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test13698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13698");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("FRAN\307AIS");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=franc?ais");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13699");
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
        java.lang.String str44 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) classArray20, "itfritl");
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
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Class[]" + "'", str44, "Class[]");
    }

    @Test
    public void test13700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13700");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("zhcines", strMap1);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList2, strMap3);
        boolean boolean5 = languageRangeList4.isEmpty();
        java.util.List<java.util.Locale.LanguageRange> languageRangeList7 = java.util.Locale.LanguageRange.parse("hi");
        boolean boolean9 = languageRangeList7.remove((java.lang.Object) "English");
        java.util.Locale.LanguageRange languageRange11 = languageRangeList7.get(0);
        languageRangeList7.clear();
        java.util.List<java.util.Locale.LanguageRange> languageRangeList14 = java.util.Locale.LanguageRange.parse("cnn");
        boolean boolean15 = languageRangeList7.retainAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList14);
        java.util.Locale.LanguageRange[] languageRangeArray16 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList17 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList17, languageRangeArray16);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap19 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList20 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList17, strMap19);
        java.util.Locale.LanguageRange[] languageRangeArray21 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList22 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList22, languageRangeArray21);
        boolean boolean24 = languageRangeList17.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList22);
        languageRangeList17.clear();
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
        java.util.List<java.util.Locale> localeList63 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList17, (java.util.Collection<java.util.Locale>) localeList62);
        java.util.Locale.FilteringMode filteringMode64 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList65 = java.util.Locale.filter(languageRangeList7, (java.util.Collection<java.util.Locale>) localeList63, filteringMode64);
        java.util.Locale locale66 = java.util.Locale.lookup(languageRangeList4, (java.util.Collection<java.util.Locale>) localeList63);
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(languageRangeList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(languageRange11);
        org.junit.Assert.assertNotNull(languageRangeList14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(languageRangeArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(languageRangeList20);
        org.junit.Assert.assertNotNull(languageRangeArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
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
// flaky:         org.junit.Assert.assertEquals(locale36.toString(), "");
// flaky:         org.junit.Assert.assertEquals("'" + str37 + "' != '" + "China" + "'", str37, "China");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "zh-CN" + "'", str38, "zh-CN");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale40);
// flaky:         org.junit.Assert.assertEquals(locale40.toString(), "");
// flaky:         org.junit.Assert.assertEquals("'" + str41 + "' != '" + "China" + "'", str41, "China");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale43);
// flaky:         org.junit.Assert.assertEquals(locale43.toString(), "");
// flaky:         org.junit.Assert.assertEquals("'" + str44 + "' != '" + "China" + "'", str44, "China");
        org.junit.Assert.assertEquals(locale48.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale50);
// flaky:         org.junit.Assert.assertEquals(locale50.toString(), "");
// flaky:         org.junit.Assert.assertEquals("'" + str51 + "' != '" + "China" + "'", str51, "China");
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
        org.junit.Assert.assertTrue("'" + filteringMode64 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode64.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList65);
        org.junit.Assert.assertNull(locale66);
    }

    @Test
    public void test13701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13701");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("OCLE.LGUGERGE", "      444444444444444444444444444444444      ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test13702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13702");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("cn", "Locale.LanguageRang");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray3);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("A", "\u82f1\u6587\u52a0\u62ff\u5927)", 20);
        java.lang.Class<?>[] wildcardClassArray12 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray11);
        java.lang.String[] strArray15 = org.apache.commons.lang3.StringUtils.split("Engls", '#');
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray15, '4', (int) (short) 0, 1);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("fra", strArray11, strArray15);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap22 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList23 = java.util.Locale.LanguageRange.parse("Cina", strMap22);
        java.lang.String[] strArray27 = new java.lang.String[] { "aiaiaiaiaiaiaiaiaia", "zh-CN", "China" };
        java.util.ArrayList<java.lang.String> strList28 = new java.util.ArrayList<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList28, strArray27);
        java.util.Locale.FilteringMode filteringMode30 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList31 = java.util.Locale.filterTags(languageRangeList23, (java.util.Collection<java.lang.String>) strList28, filteringMode30);
        java.lang.String[] strArray33 = org.apache.commons.lang3.StringUtils.splitByCharacterType("ita");
        boolean boolean34 = languageRangeList23.remove((java.lang.Object) strArray33);
        java.lang.String str35 = org.apache.commons.lang3.StringUtils.replaceEach("xxxxxxxxxxFrench (France)xxxxxxxxxx", strArray15, strArray33);
        java.lang.String[] strArray39 = org.apache.commons.lang3.StringUtils.split("cinese (Cina)", "TW", (-1));
        java.lang.String str40 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray39);
        java.lang.Class<?>[] wildcardClassArray41 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray39);
        java.lang.String str42 = org.apache.commons.lang3.StringUtils.replaceEach("AHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HENGLISH", strArray33, strArray39);
        java.lang.String str43 = org.apache.commons.lang3.StringUtils.replaceEach("j", strArray3, strArray39);
        java.lang.String[] strArray44 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String str48 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray44, "                                 Taiwan", 94, 47);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(wildcardClassArray12);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Engls" + "'", str19, "Engls");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "fra" + "'", str20, "fra");
        org.junit.Assert.assertNotNull(languageRangeList23);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + filteringMode30 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode30.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList31);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "xxxxxxxxxxFrench (France)xxxxxxxxxx" + "'", str35, "xxxxxxxxxxFrench (France)xxxxxxxxxx");
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "cinese (Cina)" + "'", str40, "cinese (Cina)");
        org.junit.Assert.assertNotNull(wildcardClassArray41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "AHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HENGLISH" + "'", str42, "AHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HENGLISH");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "j" + "'", str43, "j");
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
    }

    @Test
    public void test13703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13703");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("                                                      JAVA.LANG                                                      ", 745);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          JAVA.LANG                                                      " + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          JAVA.LANG                                                      ");
    }

    @Test
    public void test13704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13704");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setScript("");
        java.util.Locale.Builder builder4 = builder2.setLanguage("HI");
        java.util.Locale.Builder builder5 = builder4.clear();
        java.util.Locale locale6 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str7 = locale6.getDisplayLanguage();
        java.util.Locale locale8 = java.util.Locale.getDefault();
        java.lang.String str9 = locale6.getDisplayCountry(locale8);
        java.util.Locale.Builder builder10 = builder5.setLocale(locale8);
        java.util.Locale.Builder builder11 = builder5.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder13 = builder11.setScript("HI!HI!HI!HI!HI!Hzh_Z!HI!HI!HI!HI!HI");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: HI!HI!HI!HI!HI!Hzh_Z!HI!HI!HI!HI!HI [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_TW");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u4e2d\u6587" + "'", str7, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(locale8);
// flaky:         org.junit.Assert.assertEquals(locale8.toString(), "");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Taiwan" + "'", str9, "Taiwan");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test13705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13705");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("FranceseFranceseFranceseFranceseFrancslgne", "zh-cnenglh", (int) (byte) 0, 747);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zh-cnenglh" + "'", str4, "zh-cnenglh");
    }

    @Test
    public void test13706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13706");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("ahi!hiCinaxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "Chinese (China)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ahi!hiCinaxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "ahi!hiCinaxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test13707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13707");
        java.util.Locale locale3 = new java.util.Locale("...X.AZ.BA.BB.BD.BE.BF.BG.BH.BI.BJ.BL.BM.BN...", "italiano");
        java.lang.String str4 = locale3.toLanguageTag();
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.upperCase("CHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", locale3);
        java.lang.Object obj6 = locale3.clone();
        org.junit.Assert.assertEquals(locale3.toString(), "...x.az.ba.bb.bd.be.bf.bg.bh.bi.bj.bl.bm.bn..._ITALIANO");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "und" + "'", str4, "und");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str5, "CHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "...x.az.ba.bb.bd.be.bf.bg.bh.bi.bj.bl.bm.bn..._ITALIANO");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "...x.az.ba.bb.bd.be.bf.bg.bh.bi.bj.bl.bm.bn..._ITALIANO");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "...x.az.ba.bb.bd.be.bf.bg.bh.bi.bj.bl.bm.bn..._ITALIANO");
    }

    @Test
    public void test13708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13708");
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
        java.lang.String str28 = locale17.getCountry();
        java.util.Locale locale29 = java.util.Locale.ITALIAN;
        java.lang.String str30 = locale29.getLanguage();
        java.lang.String str31 = locale29.getLanguage();
        java.util.Locale locale32 = java.util.Locale.ITALIAN;
        java.util.Locale locale34 = new java.util.Locale("");
        java.lang.String str35 = locale34.getDisplayLanguage();
        java.util.Locale locale36 = java.util.Locale.CANADA;
        java.lang.String str37 = locale36.getDisplayLanguage();
        java.lang.String str38 = locale34.getDisplayScript(locale36);
        java.util.Locale locale40 = java.util.Locale.FRANCE;
        java.lang.String str41 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale40);
        java.lang.String str42 = locale34.getDisplayCountry(locale40);
        java.lang.String str43 = locale32.getDisplayScript(locale34);
        java.util.Locale.setDefault(locale32);
        java.util.Locale locale48 = new java.util.Locale("hi", "hi!", "cHINA");
        java.util.Locale locale49 = java.util.Locale.ITALIAN;
        java.util.Locale locale51 = new java.util.Locale("");
        java.lang.String str52 = locale51.getDisplayLanguage();
        java.util.Locale locale53 = java.util.Locale.CANADA;
        java.lang.String str54 = locale53.getDisplayLanguage();
        java.lang.String str55 = locale51.getDisplayScript(locale53);
        java.util.Locale locale57 = java.util.Locale.FRANCE;
        java.lang.String str58 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale57);
        java.lang.String str59 = locale51.getDisplayCountry(locale57);
        java.lang.String str60 = locale49.getDisplayScript(locale51);
        java.util.Locale.setDefault(locale49);
        java.lang.String str62 = locale48.getDisplayVariant(locale49);
        java.lang.String str63 = locale32.getDisplayLanguage(locale49);
        java.lang.String str64 = locale29.getDisplayLanguage(locale49);
        java.util.Locale locale65 = locale49.stripExtensions();
        java.util.Locale locale66 = java.util.Locale.ITALIAN;
        java.util.Locale locale68 = new java.util.Locale("");
        java.lang.String str69 = locale68.getDisplayLanguage();
        java.util.Locale locale70 = java.util.Locale.CANADA;
        java.lang.String str71 = locale70.getDisplayLanguage();
        java.lang.String str72 = locale68.getDisplayScript(locale70);
        java.util.Locale locale74 = java.util.Locale.FRANCE;
        java.lang.String str75 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale74);
        java.lang.String str76 = locale68.getDisplayCountry(locale74);
        java.lang.String str77 = locale66.getDisplayScript(locale68);
        java.util.Locale locale78 = java.util.Locale.GERMAN;
        java.lang.String str79 = locale68.getDisplayLanguage(locale78);
        java.util.Locale locale82 = new java.util.Locale("");
        java.lang.String str83 = locale82.getDisplayLanguage();
        java.util.Locale locale84 = java.util.Locale.CANADA;
        java.lang.String str85 = locale84.getDisplayLanguage();
        java.lang.String str86 = locale82.getDisplayScript(locale84);
        java.lang.String str87 = org.apache.commons.lang3.StringUtils.lowerCase("a", locale82);
        java.lang.String str88 = locale82.getDisplayScript();
        java.lang.String str89 = locale78.getDisplayLanguage(locale82);
        java.lang.String str90 = locale49.getDisplayName(locale82);
        java.lang.String str92 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) locale49, "ese (Taiwan$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        java.lang.String str93 = locale17.getDisplayCountry(locale49);
        java.lang.String str94 = locale2.getDisplayCountry(locale17);
        java.lang.String str95 = locale2.getDisplayVariant();
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "it");
        org.junit.Assert.assertEquals(locale17.toString(), "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "en_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\u82f1\u6587" + "'", str20, "\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "english" + "'", str24, "english");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "it");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "it" + "'", str30, "it");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "it" + "'", str31, "it");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "it");
        org.junit.Assert.assertEquals(locale34.toString(), "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "en_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str37 + "' != '" + "\u82f1\u6587" + "'", str37, "\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "english" + "'", str41, "english");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals(locale48.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "it");
        org.junit.Assert.assertEquals(locale51.toString(), "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "inglese" + "'", str54, "inglese");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertNotNull(locale57);
        org.junit.Assert.assertEquals(locale57.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "english" + "'", str58, "english");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "cHINA" + "'", str62, "cHINA");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "italiano" + "'", str63, "italiano");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "italiano" + "'", str64, "italiano");
        org.junit.Assert.assertNotNull(locale65);
        org.junit.Assert.assertEquals(locale65.toString(), "it");
        org.junit.Assert.assertNotNull(locale66);
        org.junit.Assert.assertEquals(locale66.toString(), "it");
        org.junit.Assert.assertEquals(locale68.toString(), "");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertNotNull(locale70);
        org.junit.Assert.assertEquals(locale70.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "inglese" + "'", str71, "inglese");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertNotNull(locale74);
        org.junit.Assert.assertEquals(locale74.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "english" + "'", str75, "english");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertNotNull(locale78);
        org.junit.Assert.assertEquals(locale78.toString(), "de");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertEquals(locale82.toString(), "");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "" + "'", str83, "");
        org.junit.Assert.assertNotNull(locale84);
        org.junit.Assert.assertEquals(locale84.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "inglese" + "'", str85, "inglese");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "" + "'", str86, "");
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "a" + "'", str87, "a");
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "" + "'", str88, "");
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "German" + "'", str89, "German");
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "Italian" + "'", str90, "Italian");
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "Locale" + "'", str92, "Locale");
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "" + "'", str93, "");
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "" + "'", str94, "");
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "" + "'", str95, "");
    }

    @Test
    public void test13709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13709");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("fr_CA", (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test13710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13710");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("EN-ca");
        java.lang.String str2 = locale1.getDisplayVariant();
        java.lang.Object obj3 = locale1.clone();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "en_CA");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "en_CA");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "en_CA");
    }

    @Test
    public void test13711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13711");
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
        java.lang.String str42 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList4, '4');
        java.util.Iterator<java.util.Locale.LanguageRange> languageRangeItor43 = languageRangeList4.iterator();
        java.lang.String str45 = org.apache.commons.lang3.StringUtils.join(languageRangeItor43, '.');
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange46 = languageRangeItor43.next();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(languageRangeItor43);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
    }

    @Test
    public void test13712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13712");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "ShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShort");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShort" + "'", str1, "ShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShort");
    }

    @Test
    public void test13713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13713");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("                                 ...inglese (Cnd)xxxxxxxx                                 ", "zh-cnenglish (LOCALE.LANGUAGERANGE)", 11);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test13714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13714");
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) "zxxxxxxxxxxxxxxxxxxx", "                                                                                  HINDI (HI!,CHINA)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang" + "'", str2, "java.lang");
    }

    @Test
    public void test13715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13715");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("Character");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Character" + "'", str1, "Character");
    }

    @Test
    public void test13716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13716");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("ANIHCANIHC", "ReferencePipeline.Head");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test13717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13717");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("NCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCARRAYLISTRING[]NCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCARRAYLISTRING[]NCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCARRAYLISTRING[]NCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCARRAYLISTRING[]NCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCARRAYLISTRING[]NCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCARRAYLIS", "C...", 13);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "NCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCARRAYLISTRING[]NCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCARRAYLISTRING[]NCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCARRAYLISTRING[]NCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCARRAYLISTRING[]NCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCARRAYLISTRING[]NCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCARRAYLIS" + "'", str4, "NCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCARRAYLISTRING[]NCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCARRAYLISTRING[]NCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCARRAYLISTRING[]NCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCARRAYLISTRING[]NCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCARRAYLISTRING[]NCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCARRAYLIS");
    }

    @Test
    public void test13718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13718");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("\u4e2d\u6587", 561, "string[]");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u4e2d\u6587string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string" + "'", str3, "\u4e2d\u6587string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string[]string");
    }

    @Test
    public void test13719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13719");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("ahi!hi! (                 A                 )", 0, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ahi!hi! (                 A                 )" + "'", str3, "ahi!hi! (                 A                 )");
    }

    @Test
    public void test13720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13720");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("CHNaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "A#a#a#a#a#", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test13721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13721");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("cnn");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "cnn" + "'", str1, "cnn");
    }

    @Test
    public void test13722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13722");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("frazh-CNenglis", 98);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test13723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13723");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("tRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRIAD.AE.AF", "frazh-CNenglis", 42);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test13724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13724");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("ANIHC   ENGLTWNSTWN", "Germn");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test13725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13725");
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
        java.lang.String str12 = locale2.getScript();
        java.lang.String str13 = locale2.getDisplayScript();
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
    }

    @Test
    public void test13726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13726");
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
        java.util.function.UnaryOperator<java.util.Locale.LanguageRange> languageRangeUnaryOperator74 = null;
        // The following exception was thrown during execution in test generation
        try {
            languageRangeList67.replaceAll(languageRangeUnaryOperator74);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertEquals(locale25.toString(), "it");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Cina" + "'", str26, "Cina");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "zh-CN" + "'", str27, "zh-CN");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "it");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Cina" + "'", str30, "Cina");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "it");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Cina" + "'", str33, "Cina");
        org.junit.Assert.assertEquals(locale37.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "it");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Cina" + "'", str40, "Cina");
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
    public void test13727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13727");
        java.util.Locale locale1 = new java.util.Locale("###############################EnglHI!STRING[]STRING[]SsHI!STRING[]STRING[]S");
        org.junit.Assert.assertEquals(locale1.toString(), "###############################englhi!string[]string[]sshi!string[]string[]s");
    }

    @Test
    public void test13728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13728");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "senic");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: senic");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13729");
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
        java.util.Locale locale56 = new java.util.Locale("e!e(Tiiwin");
        java.lang.String str57 = locale12.getDisplayLanguage(locale56);
        java.lang.Object obj58 = locale56.clone();
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + category26 + "' != '" + java.util.Locale.Category.FORMAT + "'", category26.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "it");
        org.junit.Assert.assertEquals(locale29.toString(), "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "inglese" + "'", str32, "inglese");
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
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "inglese" + "'", str46, "inglese");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "a" + "'", str48, "a");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "German" + "'", str50, "German");
        org.junit.Assert.assertNotNull(strSet51);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "de" + "'", str53, "de");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals(locale56.toString(), "e!e(tiiwin");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "German" + "'", str57, "German");
        org.junit.Assert.assertNotNull(obj58);
        org.junit.Assert.assertEquals(obj58.toString(), "e!e(tiiwin");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj58), "e!e(tiiwin");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj58), "e!e(tiiwin");
    }

    @Test
    public void test13730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13730");
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
        java.lang.Class<?>[] wildcardClassArray12 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray3);
        java.lang.Class[] classArray14 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray15 = (java.lang.Class<?>[]) classArray14;
        java.lang.Class<?>[] wildcardClassArray16 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray14);
        java.lang.Class<?>[] wildcardClassArray17 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray14);
        java.lang.Class<?>[] wildcardClassArray18 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) classArray14);
        java.lang.Class[] classArray20 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray21 = (java.lang.Class<?>[]) classArray20;
        java.lang.Class<?>[] wildcardClassArray22 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray20);
        java.lang.Class<?>[] wildcardClassArray23 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray20);
        java.lang.Class<?>[] wildcardClassArray24 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray20);
        java.lang.String str25 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray24);
        boolean boolean27 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray18, wildcardClassArray24, true);
        java.lang.Class<?>[] wildcardClassArray28 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray18);
        boolean boolean30 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray3, wildcardClassArray28, true);
        java.lang.Class[] classArray32 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray33 = (java.lang.Class<?>[]) classArray32;
        java.lang.Class<?>[] wildcardClassArray34 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray32);
        java.lang.Class<?>[] wildcardClassArray35 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray32);
        java.lang.Class<?>[] wildcardClassArray36 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray32);
        java.lang.Class<?>[] wildcardClassArray37 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray36);
        java.lang.Class<?>[] wildcardClassArray38 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray36);
        boolean boolean39 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray3, wildcardClassArray38);
        java.lang.Class<?>[] wildcardClassArray40 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray3);
        java.lang.Class<?>[] wildcardClassArray41 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray40);
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertNotNull(classArray6);
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray12);
        org.junit.Assert.assertNotNull(classArray14);
        org.junit.Assert.assertNotNull(wildcardClassArray15);
        org.junit.Assert.assertNotNull(wildcardClassArray16);
        org.junit.Assert.assertNotNull(wildcardClassArray17);
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertNotNull(classArray20);
        org.junit.Assert.assertNotNull(wildcardClassArray21);
        org.junit.Assert.assertNotNull(wildcardClassArray22);
        org.junit.Assert.assertNotNull(wildcardClassArray23);
        org.junit.Assert.assertNotNull(wildcardClassArray24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(classArray32);
        org.junit.Assert.assertNotNull(wildcardClassArray33);
        org.junit.Assert.assertNotNull(wildcardClassArray34);
        org.junit.Assert.assertNotNull(wildcardClassArray35);
        org.junit.Assert.assertNotNull(wildcardClassArray36);
        org.junit.Assert.assertNotNull(wildcardClassArray37);
        org.junit.Assert.assertNotNull(wildcardClassArray38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray40);
        org.junit.Assert.assertNotNull(wildcardClassArray41);
    }

    @Test
    public void test13731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13731");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("\u82f1\u8a9e...xxxxxFrench(France)xxxxxxxxxx...xxxxxFrench(France)xxxxxxxxxx...xxxxxFrench(France)xxxxxxxxxx", "I");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u82f1\u8a9e...xxxxxFrench(France)xxxxxxxxxx...xxxxxFrench(France)xxxxxxxxxx...xxxxxFrench(France)xxxxxxxxxx" + "'", str2, "\u82f1\u8a9e...xxxxxFrench(France)xxxxxxxxxx...xxxxxFrench(France)xxxxxxxxxx...xxxxxFrench(France)xxxxxxxxxx");
    }

    @Test
    public void test13732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13732");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("hI   Taiwan                  hI   xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hI   Taiwan                  hI   xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx" + "'", str2, "hI   Taiwan                  hI   xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
    }

    @Test
    public void test13733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13733");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("t", "ENENENENENENENENENEN");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test13734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13734");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxchn     ", "ACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test13735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13735");
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
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList4, "                 a                  ");
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream19 = languageRangeList4.parallelStream();
        java.util.Locale.LanguageRange[] languageRangeArray20 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList21 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList21, languageRangeArray20);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap23 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList24 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList21, strMap23);
        int int25 = languageRangeList21.size();
        java.util.List<java.util.Locale.LanguageRange> languageRangeList27 = java.util.Locale.LanguageRange.parse("hi");
        boolean boolean29 = languageRangeList27.remove((java.lang.Object) "English");
        boolean boolean30 = languageRangeList21.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList27);
        int int31 = languageRangeList27.size();
        languageRangeList27.clear();
        java.lang.String str34 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList27, '4');
        java.util.Locale.LanguageRange[] languageRangeArray35 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList36 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList36, languageRangeArray35);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap38 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList39 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList36, strMap38);
        int int40 = languageRangeList36.size();
        java.util.List<java.util.Locale.LanguageRange> languageRangeList42 = java.util.Locale.LanguageRange.parse("hi");
        boolean boolean44 = languageRangeList42.remove((java.lang.Object) "English");
        boolean boolean45 = languageRangeList36.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList42);
        java.util.Locale.LanguageRange[] languageRangeArray46 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList47 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList47, languageRangeArray46);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap49 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList50 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList47, strMap49);
        java.lang.String[] strArray58 = new java.lang.String[] { "English", "hi", "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "", "a", "", "China" };
        java.util.ArrayList<java.lang.String> strList59 = new java.util.ArrayList<java.lang.String>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList59, strArray58);
        java.util.List<java.lang.Class<?>> wildcardClassList61 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList59);
        java.lang.String str62 = java.util.Locale.lookupTag(languageRangeList50, (java.util.Collection<java.lang.String>) strList59);
        java.util.List<java.lang.Class<?>> wildcardClassList63 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList59);
        java.util.List<java.lang.String> strList64 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList36, (java.util.Collection<java.lang.String>) strList59);
        java.util.List<java.lang.String> strList65 = java.util.Locale.filterTags(languageRangeList27, (java.util.Collection<java.lang.String>) strList64);
        java.util.List<java.lang.Class<?>> wildcardClassList66 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses(strList65);
        boolean boolean67 = languageRangeList4.remove((java.lang.Object) wildcardClassList66);
        java.util.Locale locale71 = new java.util.Locale("");
        java.util.Set<java.lang.String> strSet72 = locale71.getUnicodeLocaleKeys();
        boolean boolean73 = locale71.hasExtensions();
        java.lang.String str74 = locale71.getVariant();
        java.lang.String str75 = org.apache.commons.lang3.StringUtils.upperCase("String", locale71);
        java.lang.String str76 = org.apache.commons.lang3.StringUtils.lowerCase("chinChinChinChinChiChinChinChinChinC", locale71);
        java.util.Set<java.lang.String> strSet77 = locale71.getUnicodeLocaleAttributes();
        int int78 = languageRangeList4.indexOf((java.lang.Object) strSet77);
        java.lang.String str80 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) strSet77, "");
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClassList15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(languageRangeStream19);
        org.junit.Assert.assertNotNull(languageRangeArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(languageRangeList24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(languageRangeList27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(languageRangeArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(languageRangeList39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(languageRangeList42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(languageRangeArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(languageRangeList50);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(wildcardClassList61);
        org.junit.Assert.assertNull(str62);
        org.junit.Assert.assertNotNull(wildcardClassList63);
        org.junit.Assert.assertNotNull(strList64);
        org.junit.Assert.assertNotNull(strList65);
        org.junit.Assert.assertNotNull(wildcardClassList66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertEquals(locale71.toString(), "");
        org.junit.Assert.assertNotNull(strSet72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "STRING" + "'", str75, "STRING");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "chinchinchinchinchichinchinchinchinc" + "'", str76, "chinchinchinchinchichinchinchinchinc");
        org.junit.Assert.assertNotNull(strSet77);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "java.util" + "'", str80, "java.util");
    }

    @Test
    public void test13736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13736");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("Cina", strMap1);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap4 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList5 = java.util.Locale.LanguageRange.parse("Cina", strMap4);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap6 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList7 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList5, strMap6);
        boolean boolean8 = languageRangeList2.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList5);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList2, "ChinChinChinChinChinChinChinChinChinaaaaaaaaa$");
        java.lang.Object[] objArray11 = languageRangeList2.toArray();
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeList5);
        org.junit.Assert.assertNotNull(languageRangeList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(objArray11);
    }

    @Test
    public void test13737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13737");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("zh_TW", "                                                                                       ese(Taiwan", (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test13738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13738");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("                zH                ", "ZHCINES");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                zH                " + "'", str2, "                zH                ");
    }

    @Test
    public void test13739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13739");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "tRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRIAD.AE.AF", (java.lang.CharSequence) "CHINCHINCHINCHINCHINCHINCHINCHINCHINAAAAAAAAA#");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "tRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRIAD.AE.AF" + "'", charSequence2, "tRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRIAD.AE.AF");
    }

    @Test
    public void test13740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13740");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("", "inglese (Canada)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "inglese (Canada)" + "'", str2, "inglese (Canada)");
    }

    @Test
    public void test13741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13741");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortClassName("aa.ab.ae.af.ak.am.an.ar.as.av.ay.az.ba.be.bg.bh.bi.bm.bn.bo.br.bs.ca.ce.ch.co.cr.cs.cu.cv.cy.da.de.dv.dz.ee.el.en.eo.es.et.eu.fa.ff.fi.fj.fo.fr.fy.ga.gd.gl.gn.gu.gv.ha.he.hi.ho.hr.ht.hu.hy.hz.ia.id.ie.ig.ii.ik.in.io.is.it.iu.iw.ja.ji.jv.ka.kg.ki.kj.kk.kl.km.kn.ko.kr.ks.ku.kv.kw.ky.la.lb.lg.li.ln.lo.lt.lu.lv.mg.mh.mi.mk.ml.mn.mo.mr.ms.mt.my.na.nb.nd.ne.ng.nl.nn.no.nr.nv.ny.oc.oj.om.or.os.pa.pi.pl.ps.pt.qu.rm.rn.ro.ru.rw.sa.sc.sd.se.sg.si.sk.sl.sm.sn.so.sq.sr.ss.st.su.sv.sw.ta.te.tg.th.ti.tk.tl.tn.to.tr.ts.tt.tw.ty.ug.uk.ur.uz.ve.vi.vo.wa.wo.xh.yi.yo.za.zh.zu");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zu" + "'", str1, "zu");
    }

    @Test
    public void test13742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13742");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("...x.az.ba.bb.bd.be.bf.bg.bh.bi.bj.bl.bm.bn..._ITALIANO", "eSESENICHZ.....", 45, 20);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "...x.az.ba.bb.bd.be.eSESENICHZ......_ITALIANO" + "'", str4, "...x.az.ba.bb.bd.be.eSESENICHZ......_ITALIANO");
    }

    @Test
    public void test13743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13743");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "COLLECTI", "italiahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test13744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13744");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("SHORT", "AN       a", 32);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concatWith("acoL", (java.lang.Object[]) strArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "44444444EnglTWNsTWN44444444");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SHORT" + "'", str5, "SHORT");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SHORT" + "'", str7, "SHORT");
    }

    @Test
    public void test13745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13745");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortClassName("aCOL");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aCOL" + "'", str1, "aCOL");
    }

    @Test
    public void test13746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13746");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("CINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINA");
        java.util.Locale locale5 = new java.util.Locale("hi", "hi!", "cHINA");
        java.lang.String str6 = locale5.getDisplayVariant();
        java.util.Locale locale7 = locale5.stripExtensions();
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
        java.lang.String str34 = locale5.getDisplayName(locale15);
        java.lang.String str35 = locale1.getDisplayVariant(locale5);
        java.util.Set<java.lang.String> strSet36 = locale5.getUnicodeLocaleAttributes();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals(locale5.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "cHINA" + "'", str6, "cHINA");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "it");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Cina" + "'", str10, "Cina");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "zh-CN" + "'", str11, "zh-CN");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "zh" + "'", str12, "zh");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "it");
        org.junit.Assert.assertEquals(locale15.toString(), "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "inglese" + "'", str18, "inglese");
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
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Hindi (HI!,cHINA)" + "'", str34, "Hindi (HI!,cHINA)");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(strSet36);
    }

    @Test
    public void test13747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13747");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("ggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 100, 47);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test13748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13748");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("....................................................................................................Hindi (HI!,cHINA)", "latiarfatilatiarfatilatiarfatilatiarfatilatiarfatilatiarfatilatiarfatilatiarfatilatiarfatilatiarfati");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test13749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13749");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageName("Z");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test13750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13750");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("engls", 94);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "engls" + "'", str2, "engls");
    }

    @Test
    public void test13751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13751");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("xxxxxxxxinglese (Canada)xxxxxxxx");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "xxxxxxxx)adanaC( eselgnixxxxxxxx" + "'", str1, "xxxxxxxx)adanaC( eselgnixxxxxxxx");
    }

    @Test
    public void test13752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13752");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("                                                ", "         frazh-CNenglis          ", 93);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test13753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13753");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("\u4e2d\u56fdAD.AE.AFananananananananananananananananananananan", (-1), "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u4e2d\u56fdAD.AE.AFananananananananananananananananananananan" + "'", str3, "\u4e2d\u56fdAD.AE.AFananananananananananananananananananananan");
    }

    @Test
    public void test13754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13754");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("United Kingdom", 47);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "United Kingdom" + "'", str2, "United Kingdom");
    }

    @Test
    public void test13755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13755");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("ZH", "Cnxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test13756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13756");
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
        java.lang.String str74 = org.apache.commons.lang3.StringUtils.join((java.util.Iterator<java.util.Locale.LanguageRange>) languageRangeItor72, "Chin");
        boolean boolean75 = languageRangeList7.equals((java.lang.Object) languageRangeItor72);
        boolean boolean76 = languageRangeItor72.hasNext();
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
        org.junit.Assert.assertEquals(locale31.toString(), "it");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Cina" + "'", str32, "Cina");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "zh-CN" + "'", str33, "zh-CN");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "it");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Cina" + "'", str36, "Cina");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "it");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Cina" + "'", str39, "Cina");
        org.junit.Assert.assertEquals(locale43.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "it");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Cina" + "'", str46, "Cina");
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
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
    }

    @Test
    public void test13757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13757");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "ZH)", (java.lang.CharSequence) "4HI!HI!HI!HI!HI!Hzh_Z!HI!HI!HI!HI!HI444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test13758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13758");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\u4e2d\u570b");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test13759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13759");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("ANIHC      xxxxhIxxx");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=anihc      xxxxhixxx");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13760");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("                                                                            Hindi (HI!,cHINA)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hindi (HI!,cHINA)" + "'", str1, "Hindi (HI!,cHINA)");
    }

    @Test
    public void test13761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13761");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("                                                                                                RGLA", "...x.z.b.bb.bd.be.bf.bg.bh.bi.bj.bl.bm.bn..");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test13762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13762");
        java.util.Locale locale2 = new java.util.Locale("");
        java.lang.String str3 = locale2.getDisplayLanguage();
        java.util.Locale locale4 = java.util.Locale.CANADA;
        java.lang.String str5 = locale4.getDisplayLanguage();
        java.lang.String str6 = locale2.getDisplayScript(locale4);
        java.lang.String str7 = locale4.getDisplayVariant();
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.upperCase("", locale4);
        java.lang.String str9 = locale4.getLanguage();
        java.lang.String str11 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) locale4, "en_CA");
        java.lang.String str12 = locale4.getDisplayLanguage();
        java.lang.String str13 = locale4.getDisplayVariant();
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "inglese" + "'", str5, "inglese");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "en" + "'", str9, "en");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "java.util" + "'", str11, "java.util");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "inglese" + "'", str12, "inglese");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test13763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13763");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("jAPA", 92);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                        jAPA" + "'", str2, "                                                                                        jAPA");
    }

    @Test
    public void test13764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13764");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("hi");
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream2 = languageRangeList1.parallelStream();
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap5 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList6 = java.util.Locale.LanguageRange.parse("it", strMap5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList6, "cinese (Taiwan)");
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor9 = languageRangeList6.listIterator();
        java.util.Locale.LanguageRange languageRange10 = languageRangeItor9.next();
        double double11 = languageRange10.getWeight();
        // The following exception was thrown during execution in test generation
        try {
            languageRangeList1.add(21, languageRange10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 21, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(languageRangeStream2);
        org.junit.Assert.assertNotNull(languageRangeList6);
        org.junit.Assert.assertNotNull(languageRangeItor9);
        org.junit.Assert.assertNotNull(languageRange10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test13765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13765");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName("hindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihind (LOCALE.BUILDER,ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hEnglish)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "BUILDER,ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hEnglish)" + "'", str1, "BUILDER,ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hEnglish)");
    }

    @Test
    public void test13766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13766");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "fr_FR");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test13767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13767");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.setLanguageTag("zh-CN");
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale.Builder builder6 = builder3.setLanguageTag("ANIHC");
        java.util.Locale locale7 = builder3.build();
        java.util.Locale locale9 = java.util.Locale.forLanguageTag("An");
        java.util.Locale.Builder builder10 = builder3.setLocale(locale9);
        java.lang.String str11 = locale9.getDisplayLanguage();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "anihc");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "an");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "aragonese" + "'", str11, "aragonese");
    }

    @Test
    public void test13768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13768");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                           cinaci                                            ", 94);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test13769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13769");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "zh_ZH                                                                                                                   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test13770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13770");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("ac_NE", "englhi!string[]string[]sshi!string[]string[]s", "Hindi (HI!,cHINA)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ac_NE" + "'", str4, "ac_NE");
    }

    @Test
    public void test13771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13771");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.setLanguageTag("zh-CN");
        java.util.Locale.Builder builder5 = builder3.setLanguage("it");
        java.util.Locale.Builder builder7 = builder5.removeUnicodeLocaleAttribute("fra");
        java.util.Locale locale8 = builder7.build();
        java.util.Locale.Builder builder9 = builder7.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder9.removeUnicodeLocaleAttribute("          xxxxxx");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute:           xxxxxx [at index 0]");
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
    public void test13772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13772");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxchn     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxchn" + "'", str1, "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxchn");
    }

    @Test
    public void test13773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13773");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("", "zaachi...zaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test13774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13774");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("ENG", (int) '$');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test13775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13775");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("cHINA", "LOCALE.BUILDER");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "cHINA" + "'", str2, "cHINA");
    }

    @Test
    public void test13776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13776");
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
        java.util.Locale.LanguageRange[] languageRangeArray21 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList22 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList22, languageRangeArray21);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap24 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList25 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList22, strMap24);
        int int26 = languageRangeList22.size();
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor27 = languageRangeList22.listIterator();
        java.util.Locale.LanguageRange languageRange29 = new java.util.Locale.LanguageRange("a");
        java.util.Locale.LanguageRange languageRange31 = new java.util.Locale.LanguageRange("English");
        java.lang.String str33 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) languageRange31, "");
        java.util.Locale.LanguageRange languageRange35 = new java.util.Locale.LanguageRange("English");
        java.util.Locale.LanguageRange[] languageRangeArray36 = new java.util.Locale.LanguageRange[] { languageRange29, languageRange31, languageRange35 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList37 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList37, languageRangeArray36);
        boolean boolean39 = languageRangeList22.retainAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList37);
        boolean boolean40 = languageRangeList4.retainAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList37);
        int int42 = languageRangeList37.lastIndexOf((java.lang.Object) 36);
        java.util.Locale locale46 = new java.util.Locale("zh-CNenglish", "Locale.LanguageRange", "");
        java.util.Locale.setDefault(locale46);
        java.util.Locale locale48 = locale46.stripExtensions();
        java.util.Set<java.lang.String> strSet49 = locale46.getUnicodeLocaleKeys();
        boolean boolean50 = languageRangeList37.remove((java.lang.Object) strSet49);
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
        org.junit.Assert.assertNotNull(languageRangeArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(languageRangeList25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(languageRangeItor27);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Locale.LanguageRange" + "'", str33, "Locale.LanguageRange");
        org.junit.Assert.assertNotNull(languageRangeArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertEquals(locale46.toString(), "zh-cnenglish_LOCALE.LANGUAGERANGE");
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "zh-cnenglish_LOCALE.LANGUAGERANGE");
        org.junit.Assert.assertNotNull(strSet49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test13777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13777");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("French (France)", "elacoL");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test13778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13778");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale locale4 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str5 = locale4.getISO3Language();
        java.util.Locale.Builder builder6 = builder3.setLocale(locale4);
        java.util.Locale.Builder builder8 = builder6.setRegion("ja");
        java.util.Locale.Builder builder9 = builder8.clearExtensions();
        java.util.Locale locale10 = builder9.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder9.setRegion("esesenichz");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: esesenichz [at index 0]");
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
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_JA");
    }

    @Test
    public void test13779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13779");
        java.util.Locale locale1 = java.util.Locale.TAIWAN;
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("", locale1);
        java.lang.String str3 = locale1.getCountry();
        java.lang.String str4 = locale1.toLanguageTag();
        java.lang.String str5 = locale1.getISO3Language();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "TW" + "'", str3, "TW");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zh-TW" + "'", str4, "zh-TW");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "zho" + "'", str5, "zho");
    }

    @Test
    public void test13780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13780");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("\u7fa9\u5927\u5229\u6587", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u7fa9\u5927\u5229\u6587" + "'", str2, "\u7fa9\u5927\u5229\u6587");
    }

    @Test
    public void test13781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13781");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("Engl....englishs....englis", "INGLESE (CANADA)", 11);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test13782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13782");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("Korean (South Korea)", "\u6587\u4e2desenihC");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Korean (South Korea)" + "'", str2, "Korean (South Korea)");
    }

    @Test
    public void test13783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13783");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("444444444][gnirts4444444444", '#', 'x');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444][gnirts4444444444" + "'", str3, "444444444][gnirts4444444444");
    }

    @Test
    public void test13784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13784");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale.Builder builder3 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder5 = builder1.setRegion("zh");
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder6.setUnicodeLocaleKeyword("english (United States)", "xxx");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: english (United States) [at index 0]");
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
    public void test13785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13785");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("anih", "anglais (Canada)                                                                                    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "anih" + "'", str2, "anih");
    }

    @Test
    public void test13786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13786");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("Z", (int) (short) -1, 279);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test13787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13787");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "################################################################################################################lang");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test13788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13788");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("anglais", "anglais");
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("English", "hi", (int) (short) -1);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray9, "zho", (int) 'u', (int) (short) 0);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny("CHINOIS (CHINE)", strArray9);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray9);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny("hindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindi", strArray9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = org.apache.commons.lang3.StringUtils.replaceEach("HI!HI!HI!HI!HI!HI", strArray3, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 8 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test13789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13789");
        java.util.Locale locale3 = new java.util.Locale("");
        java.lang.String str4 = locale3.getDisplayLanguage();
        java.util.Locale locale5 = java.util.Locale.CANADA;
        java.lang.String str6 = locale5.getDisplayLanguage();
        java.lang.String str7 = locale3.getDisplayScript(locale5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.lowerCase("A", locale5);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.lowerCase("china", locale5);
        java.util.Set<java.lang.Character> charSet10 = locale5.getExtensionKeys();
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "English" + "'", str6, "English");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "a" + "'", str8, "a");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "china" + "'", str9, "china");
        org.junit.Assert.assertNotNull(charSet10);
    }

    @Test
    public void test13790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13790");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("...                           ...", 20, 18);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "          ..." + "'", str3, "          ...");
    }

    @Test
    public void test13791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13791");
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
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap95 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList96 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList86, strMap95);
        java.util.function.UnaryOperator<java.util.Locale.LanguageRange> languageRangeUnaryOperator97 = null;
        // The following exception was thrown during execution in test generation
        try {
            languageRangeList86.replaceAll(languageRangeUnaryOperator97);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertEquals(locale38.toString(), "zh-cnenglish_LOCALE.LANGUAGERANGE");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "China" + "'", str39, "China");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "zh-CN" + "'", str40, "zh-CN");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "zh-cnenglish_LOCALE.LANGUAGERANGE");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "China" + "'", str43, "China");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "zh-cnenglish_LOCALE.LANGUAGERANGE");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "China" + "'", str46, "China");
        org.junit.Assert.assertEquals(locale50.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "zh-cnenglish_LOCALE.LANGUAGERANGE");
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
        org.junit.Assert.assertNull(locale93);
        org.junit.Assert.assertNotNull(languageRangeItor94);
        org.junit.Assert.assertNotNull(languageRangeList96);
    }

    @Test
    public void test13792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13792");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("panesexxxxxxxxxxxxxx");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test13793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13793");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "ch");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test13794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13794");
        java.util.Locale locale3 = new java.util.Locale("n       a                                           ", "          xxxxxxx", "it                                           it          AD.AE.AF.AGchnaafraAD.AE.AF.AGchnaaa");
        java.lang.String str4 = locale3.toString();
        org.junit.Assert.assertEquals(locale3.toString(), "n       a                                           _          XXXXXXX_it                                           it          AD.AE.AF.AGchnaafraAD.AE.AF.AGchnaaa");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "n       a                                           _          XXXXXXX_it                                           it          AD.AE.AF.AGchnaafraAD.AE.AF.AGchnaaa" + "'", str4, "n       a                                           _          XXXXXXX_it                                           it          AD.AE.AF.AGchnaafraAD.AE.AF.AGchnaaa");
    }

    @Test
    public void test13795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13795");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("    cn    ", 4, 747);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "cn    " + "'", str3, "cn    ");
    }

    @Test
    public void test13796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13796");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                     ArrayList", "Itali", 350);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test13797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13797");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("...                         zh_C             ...INGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRIN", '4');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test13798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13798");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap3);
        int int5 = languageRangeList1.size();
        java.util.List<java.util.Locale.LanguageRange> languageRangeList7 = java.util.Locale.LanguageRange.parse("hi");
        boolean boolean9 = languageRangeList7.remove((java.lang.Object) "English");
        boolean boolean10 = languageRangeList1.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList7);
        java.util.Locale.LanguageRange languageRange12 = new java.util.Locale.LanguageRange("English");
        java.lang.String str13 = languageRange12.getRange();
        boolean boolean14 = languageRangeList7.add(languageRange12);
        java.util.Collection<java.util.Locale.LanguageRange> languageRangeCollection15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = languageRangeList7.removeAll(languageRangeCollection15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(languageRangeList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "english" + "'", str13, "english");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test13799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13799");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444)4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test13800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13800");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("ko", "zh_C", 99);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test13801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13801");
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
        java.lang.String[] strArray19 = org.apache.commons.lang3.StringUtils.split("Cina", "zho", 10);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray19);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.concatWith("zh-CNnglese", (java.lang.Object[]) strArray19);
        boolean boolean22 = languageRangeList2.contains((java.lang.Object) strArray19);
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList2, "L.AVAJSTRING[]STRING[]STRING[");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList27 = languageRangeList2.subList(47, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 8");
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
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Cina" + "'", str21, "Cina");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test13802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13802");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "enghI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test13803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13803");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("tRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRIAD.AE", "ahi!hi! (                 A                 )");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test13804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13804");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("                                ese (Taiwanese (Taiwanese (Taiwanese (Taiwanese (Taiwanese (Taiwanese (Taiwanese (Taiwan");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=                                ese (taiwanese (taiwanese (taiwanese (taiwanese (taiwanese (taiwanese (taiwanese (taiwan");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13805");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList60 = languageRangeList1.subList(36, 649);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 649");
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
// flaky:         org.junit.Assert.assertEquals(locale16.toString(), "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "China" + "'", str17, "China");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "zh-CN" + "'", str18, "zh-CN");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale20);
// flaky:         org.junit.Assert.assertEquals(locale20.toString(), "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "China" + "'", str21, "China");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale23);
// flaky:         org.junit.Assert.assertEquals(locale23.toString(), "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "China" + "'", str24, "China");
        org.junit.Assert.assertEquals(locale28.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale30);
// flaky:         org.junit.Assert.assertEquals(locale30.toString(), "");
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
    }

    @Test
    public void test13806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13806");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hindi (HI!,cHINA)", "Collections.EmptySet", (int) ' ');
        java.lang.Class<?>[] wildcardClassArray5 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray4);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("CHNAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "\u4e2d\u6587");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEach("GNAL.AVAJSTRING", strArray4, strArray8);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(wildcardClassArray5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "GNAL.AVAJSTRING" + "'", str9, "GNAL.AVAJSTRING");
    }

    @Test
    public void test13807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13807");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortClassName("...x.z.b.bb.bd.be.bf.bg.bh.bi.bj.bl.bm.bn...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test13808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13808");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("it-CN", 81);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                            it-CN" + "'", str2, "                                                                            it-CN");
    }

    @Test
    public void test13809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13809");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("                                                                                            EN_CAEN_CA_EN_CAA", "enenenenenenenenenen");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test13810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13810");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("hi");
        boolean boolean3 = languageRangeList1.remove((java.lang.Object) "English");
        int int5 = languageRangeList1.indexOf((java.lang.Object) "][gnirts");
        java.lang.Object[] objArray6 = languageRangeList1.toArray();
        java.util.List<java.util.Locale.LanguageRange> languageRangeList8 = java.util.Locale.LanguageRange.parse("hi");
        java.lang.Object[] objArray9 = languageRangeList8.toArray();
        java.util.Spliterator<java.util.Locale.LanguageRange> languageRangeSpliterator10 = languageRangeList8.spliterator();
        java.util.Locale.Builder builder11 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder12 = builder11.clearExtensions();
        java.util.Locale.Builder builder14 = builder12.setLanguageTag("zh-CN");
        java.util.Locale locale15 = builder12.build();
        boolean boolean16 = languageRangeList8.remove((java.lang.Object) locale15);
        int int17 = languageRangeList8.size();
        java.util.Spliterator<java.util.Locale.LanguageRange> languageRangeSpliterator18 = languageRangeList8.spliterator();
        boolean boolean19 = languageRangeList1.retainAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList8);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor20 = languageRangeList1.listIterator();
        // The following exception was thrown during execution in test generation
        try {
            languageRangeItor20.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(languageRangeList8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(languageRangeSpliterator10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "zh_CN");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(languageRangeSpliterator18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(languageRangeItor20);
    }

    @Test
    public void test13811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13811");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("HindiANIHC      (HI!,cHINA)", "                                             italiahI                                              ", "fran\347ais (France)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HndANHCffffff(H!,cHNA)" + "'", str3, "HndANHCffffff(H!,cHNA)");
    }

    @Test
    public void test13812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13812");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "ko");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h" + "'", str2, "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
    }

    @Test
    public void test13813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13813");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("cines                                                                                                                                                                                                                                                                                  ", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test13814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13814");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("hi!String[]String[]S", ".....");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test13815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13815");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("ocle.bulde (F   CH,arraylist###########en,CAarraylist###########en,CAarraylist###########en,CAarraylist###########en,CAarraylist###########en,CAarraylist###########en,CAarraylist###########en,CAarraylist###########en,CAarraylist###########en,CAarraylist###########en,CAarraylist###########en,CAarraylist###########en,CAarraylist###########en,CAarraylist###########en,CAarraylist###########en,CAarraylist###########en,CAarraylist###########en,CAarraylist###########en,CAarraylist###########en,CAarraylist###########en,CAarraylist###########en,CAarraylist###########en,CAarraylist###########en,CAarraylist###########en,CAarraylist###########en,CAarraylist###########en,CAarraylist###########en,CAarraylist###########en,CAarraylist###########en,CAarraylist###########en,CAarraylist###########en,CAarraylist###########en,CAarraylist###########en,CAarraylist###########en,CAarraylist###########en,CAarraylist###########)", (int) (short) 100, 3);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test13816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13816");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("\u82f1\u8a9e...xxxxxFrench(France)xxxxxxxxxx...xxxxxFrench(France)xxxxxxxxxx...xxxxxFrench(France)xxxxxxxxxx", "                                                                                   HINDI (HI!,CHINA)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u82f1\u8a9e...xxxxxFrench(France)xxxxxxxxxx...xxxxxFrench(France)xxxxxxxxxx...xxxxxFrench(France)xxxxxxxxxx" + "'", str2, "\u82f1\u8a9e...xxxxxFrench(France)xxxxxxxxxx...xxxxxFrench(France)xxxxxxxxxx...xxxxxFrench(France)xxxxxxxxxx");
    }

    @Test
    public void test13817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13817");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587          ", 47, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587          " + "'", str3, "\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587          ");
    }

    @Test
    public void test13818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13818");
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) "                                        Englisch (Kanada)                                        ", "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang" + "'", str2, "java.lang");
    }

    @Test
    public void test13819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13819");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "EnglHI!STRING[]STRING[]SsHI!STRING[]STRING[]SEnglHI!STRING[]STRING[]SsHI!STRING[]STRING[]SEnglHI!STRING[]STRING[]SsHI!STRING[]STRING[]SEnglHI!STRING[]STRING[]SsHI!STRING[]STRING[]SEnglHI!STRING[]STRING[]SsHI!STRING[]STRING[]SEnglHI!STRING[]STRING[]SsHI!STRING[]STRING[]SEnglHI!STRING[]STRING[]SsHI!STRING[]STRING[]SEnglHI!STRING[]STRING[]SsHI!STRING[]STRING[]SEnglHI!STRING[]STRING[]SsHI!STRING[]STRING[]SEnglHI!STRING[]STRING[]SsHI!STRING[]STRING[]S");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test13820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13820");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h" + "'", str2, "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
    }

    @Test
    public void test13821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13821");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("       hi!", "englishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglish");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       hi!" + "'", str2, "       hi!");
    }

    @Test
    public void test13822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13822");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("ol", (int) 'u');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ololololololololololololololololololololololololololololololololololololololololololololololololololololololololololololololololololololololololololololololololololololololololololololololololololololololololololololololololololololol" + "'", str2, "ololololololololololololololololololololololololololololololololololololololololololololololololololololololololololololololololololololololololololololololololololololololololololololololololololololololololololololololololololololol");
    }

    @Test
    public void test13823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13823");
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
        languageRangeList1.clear();
        java.lang.String str51 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList1, "ANIHCzhcinesesexxxxx");
        java.util.Locale locale53 = new java.util.Locale("ahi!hi!");
        int int54 = languageRangeList1.lastIndexOf((java.lang.Object) locale53);
        java.util.Iterator<java.util.Locale.LanguageRange> languageRangeItor55 = languageRangeList1.iterator();
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
// flaky:         org.junit.Assert.assertEquals(locale16.toString(), "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "China" + "'", str17, "China");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "zh-CN" + "'", str18, "zh-CN");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale20);
// flaky:         org.junit.Assert.assertEquals(locale20.toString(), "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "China" + "'", str21, "China");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale23);
// flaky:         org.junit.Assert.assertEquals(locale23.toString(), "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "China" + "'", str24, "China");
        org.junit.Assert.assertEquals(locale28.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale30);
// flaky:         org.junit.Assert.assertEquals(locale30.toString(), "");
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
        org.junit.Assert.assertNotNull(languageRangeList46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals(locale53.toString(), "ahi!hi!");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertNotNull(languageRangeItor55);
    }

    @Test
    public void test13824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13824");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("java.lang", "$");
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny("fr_FR", strArray4);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "xxxhi!xxxx");
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny("4HI!HI!HI!HI!HI!Hzh_Z!HI!HI!HI!HI!HI444444444444444444444444444444444444444444444444444444444444444", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test13825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13825");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("en", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test13826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13826");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5...4", "italien");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5...4" + "'", str2, "\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5...4");
    }

    @Test
    public void test13827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13827");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("Zxxxxxxxxxxxxxxxxxxx", "chinchinchinchinchinchinchinchinchin$$$$$$$$$#");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test13828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13828");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("aaaaaaaaaaaitaliahI", 39);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test13829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13829");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "L.AVAJSTRING[]STRING[]STRING[$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 97 + "'", int1 == 97);
    }

    @Test
    public void test13830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13830");
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
        java.util.Iterator<java.util.Locale.LanguageRange> languageRangeItor23 = languageRangeList1.iterator();
        int int25 = languageRangeList1.lastIndexOf((java.lang.Object) "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxCHNAAAAA");
        java.util.Locale.LanguageRange[] languageRangeArray26 = new java.util.Locale.LanguageRange[] {};
        java.util.Locale.LanguageRange[] languageRangeArray27 = languageRangeList1.toArray(languageRangeArray26);
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
        org.junit.Assert.assertNotNull(languageRangeItor23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(languageRangeArray26);
        org.junit.Assert.assertNotNull(languageRangeArray27);
    }

    @Test
    public void test13831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13831");
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
        java.util.Locale.Builder builder18 = builder17.clearExtensions();
        java.util.Locale.Builder builder19 = builder18.clear();
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
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder19);
    }

    @Test
    public void test13832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13832");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("\u4e2d\u56fdAD.AE.AF.A", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test13833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13833");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "friFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfricines                                                                                                                                                                                                                                                                                  friFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfriFRSTIiFfri");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test13834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13834");
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
        java.util.Locale.Builder builder24 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder25 = builder24.clearExtensions();
        java.util.Locale.Builder builder26 = builder24.clearExtensions();
        java.util.Locale.Builder builder28 = builder24.removeUnicodeLocaleAttribute("English");
        java.util.Locale locale29 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale30 = java.util.Locale.getDefault();
        java.lang.String str31 = locale29.getDisplayCountry(locale30);
        java.lang.String str32 = locale29.toLanguageTag();
        java.lang.String str33 = locale29.getCountry();
        java.lang.String str34 = locale29.getISO3Country();
        java.util.Locale locale36 = new java.util.Locale("");
        java.lang.String str37 = locale36.getDisplayVariant();
        java.lang.String str38 = locale29.getDisplayLanguage(locale36);
        java.lang.String str39 = locale36.getLanguage();
        java.util.Set<java.lang.Character> charSet40 = locale36.getExtensionKeys();
        java.lang.String str41 = locale36.getVariant();
        java.util.Locale.Builder builder42 = builder28.setLocale(locale36);
        java.lang.String str44 = locale36.getExtension('x');
        java.lang.String str45 = locale36.getDisplayCountry();
        java.lang.String str46 = locale12.getDisplayName(locale36);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "English" + "'", str5, "English");
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "English" + "'", str19, "English");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "a" + "'", str21, "a");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "German" + "'", str23, "German");
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale30);
// flaky:         org.junit.Assert.assertEquals(locale30.toString(), "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "China" + "'", str31, "China");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "zh-CN" + "'", str32, "zh-CN");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "CN" + "'", str33, "CN");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "CHN" + "'", str34, "CHN");
        org.junit.Assert.assertEquals(locale36.toString(), "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Chinese" + "'", str38, "Chinese");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(charSet40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "German" + "'", str46, "German");
    }

    @Test
    public void test13835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13835");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("cinese (Taiwan)", 'u');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "cinese (Taiwan)" + "'", str2, "cinese (Taiwan)");
    }

    @Test
    public void test13836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13836");
        java.util.Locale locale3 = new java.util.Locale("     Chine", "engliIlishESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWA", "GNAL.AVAJ");
        org.junit.Assert.assertEquals(locale3.toString(), "     chine_ENGLIILISHESE (TAIWANESE (TAIWANESE (TAIWANESE (TAIWANESE (TAIWANESE (TAIWANESE (TAIWANESE (TAIWA_GNAL.AVAJ");
    }

    @Test
    public void test13837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13837");
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
        java.util.Locale.LanguageRange languageRange86 = new java.util.Locale.LanguageRange("English");
        java.lang.String str87 = languageRange86.getRange();
        java.util.Locale.LanguageRange languageRange89 = new java.util.Locale.LanguageRange("English");
        java.util.Locale.LanguageRange[] languageRangeArray90 = new java.util.Locale.LanguageRange[] { languageRange83, languageRange86, languageRange89 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList91 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean92 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList91, languageRangeArray90);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream93 = languageRangeList91.stream();
        java.util.Locale.Builder builder94 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder95 = builder94.clearExtensions();
        java.util.Locale.Builder builder96 = builder94.clearExtensions();
        boolean boolean97 = languageRangeList91.contains((java.lang.Object) builder96);
        boolean boolean98 = languageRangeList29.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList91);
        languageRangeList91.clear();
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
// flaky:         org.junit.Assert.assertEquals(locale38.toString(), "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "China" + "'", str39, "China");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "zh-CN" + "'", str40, "zh-CN");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale42);
// flaky:         org.junit.Assert.assertEquals(locale42.toString(), "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "China" + "'", str43, "China");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale45);
// flaky:         org.junit.Assert.assertEquals(locale45.toString(), "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "China" + "'", str46, "China");
        org.junit.Assert.assertEquals(locale50.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale52);
// flaky:         org.junit.Assert.assertEquals(locale52.toString(), "");
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
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "english" + "'", str84, "english");
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "english" + "'", str87, "english");
        org.junit.Assert.assertNotNull(languageRangeArray90);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertNotNull(languageRangeStream93);
        org.junit.Assert.assertNotNull(builder95);
        org.junit.Assert.assertNotNull(builder96);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
    }

    @Test
    public void test13838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13838");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("hi");
        int int3 = languageRangeList1.indexOf((java.lang.Object) '4');
        boolean boolean5 = languageRangeList1.contains((java.lang.Object) 8);
        java.lang.Object[] objArray6 = languageRangeList1.toArray();
        java.util.Locale.LanguageRange[] languageRangeArray7 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList8 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList8, languageRangeArray7);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap10 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList11 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList8, strMap10);
        java.util.Locale.LanguageRange[] languageRangeArray12 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList13 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList13, languageRangeArray12);
        boolean boolean15 = languageRangeList8.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList13);
        java.util.Locale.LanguageRange[] languageRangeArray16 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList17 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList17, languageRangeArray16);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap19 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList20 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList17, strMap19);
        java.util.Locale.LanguageRange[] languageRangeArray21 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList22 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList22, languageRangeArray21);
        boolean boolean24 = languageRangeList17.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList22);
        java.lang.String str26 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList22, "hi!");
        boolean boolean27 = languageRangeList8.remove((java.lang.Object) languageRangeList22);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor28 = languageRangeList8.listIterator();
        java.lang.String str30 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) languageRangeList8, "Chinese (China)");
        java.util.Locale.LanguageRange[] languageRangeArray31 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList32 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList32, languageRangeArray31);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap34 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList35 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList32, strMap34);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor36 = languageRangeList35.listIterator();
        java.lang.String[] strArray38 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList39 = new java.util.ArrayList<java.lang.String>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList39, strArray38);
        java.util.Locale.LanguageRange[] languageRangeArray41 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList42 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList42, languageRangeArray41);
        java.util.Locale locale45 = java.util.Locale.FRANCE;
        java.lang.String str46 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale45);
        java.util.Locale locale47 = java.util.Locale.US;
        java.util.Locale locale48 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale49 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale50 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale51 = java.util.Locale.getDefault();
        java.lang.String str52 = locale50.getDisplayCountry(locale51);
        java.lang.String str53 = locale50.toLanguageTag();
        java.util.Locale locale54 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale55 = java.util.Locale.getDefault();
        java.lang.String str56 = locale54.getDisplayCountry(locale55);
        java.util.Locale locale57 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale58 = java.util.Locale.getDefault();
        java.lang.String str59 = locale57.getDisplayCountry(locale58);
        java.util.Locale locale63 = new java.util.Locale("hi", "hi!", "cHINA");
        java.util.Locale locale64 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale65 = java.util.Locale.getDefault();
        java.lang.String str66 = locale64.getDisplayCountry(locale65);
        java.util.Locale locale68 = new java.util.Locale("");
        java.lang.String str69 = locale68.getDisplayVariant();
        java.util.Locale locale70 = java.util.Locale.KOREAN;
        java.util.Locale locale72 = new java.util.Locale("");
        java.util.Locale locale73 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale[] localeArray74 = new java.util.Locale[] { locale45, locale47, locale48, locale49, locale50, locale55, locale57, locale63, locale65, locale68, locale70, locale72, locale73 };
        java.util.ArrayList<java.util.Locale> localeList75 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList75, localeArray74);
        java.util.List<java.util.Locale> localeList77 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList42, (java.util.Collection<java.util.Locale>) localeList75);
        java.lang.String[] strArray85 = new java.lang.String[] { "English", "hi", "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "", "a", "", "China" };
        java.util.ArrayList<java.lang.String> strList86 = new java.util.ArrayList<java.lang.String>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList86, strArray85);
        java.util.List<java.lang.Class<?>> wildcardClassList88 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList86);
        java.util.Locale.FilteringMode filteringMode89 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList90 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList42, (java.util.Collection<java.lang.String>) strList86, filteringMode89);
        java.util.List<java.lang.String> strList91 = java.util.Locale.filterTags(languageRangeList35, (java.util.Collection<java.lang.String>) strList39, filteringMode89);
        java.util.List<java.lang.Class<?>> wildcardClassList92 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses(strList91);
        java.util.List<java.lang.Class<?>> wildcardClassList93 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses(strList91);
        java.lang.String str94 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList8, (java.util.Collection<java.lang.String>) strList91);
        boolean boolean95 = languageRangeList1.contains((java.lang.Object) str94);
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(languageRangeArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(languageRangeList11);
        org.junit.Assert.assertNotNull(languageRangeArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(languageRangeArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(languageRangeList20);
        org.junit.Assert.assertNotNull(languageRangeArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(languageRangeItor28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "ArrayList" + "'", str30, "ArrayList");
        org.junit.Assert.assertNotNull(languageRangeArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(languageRangeList35);
        org.junit.Assert.assertNotNull(languageRangeItor36);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(languageRangeArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "english" + "'", str46, "english");
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale51);
// flaky:         org.junit.Assert.assertEquals(locale51.toString(), "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "China" + "'", str52, "China");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "zh-CN" + "'", str53, "zh-CN");
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale55);
// flaky:         org.junit.Assert.assertEquals(locale55.toString(), "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "China" + "'", str56, "China");
        org.junit.Assert.assertNotNull(locale57);
        org.junit.Assert.assertEquals(locale57.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale58);
// flaky:         org.junit.Assert.assertEquals(locale58.toString(), "");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "China" + "'", str59, "China");
        org.junit.Assert.assertEquals(locale63.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale64);
        org.junit.Assert.assertEquals(locale64.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale65);
// flaky:         org.junit.Assert.assertEquals(locale65.toString(), "");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "China" + "'", str66, "China");
        org.junit.Assert.assertEquals(locale68.toString(), "");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertNotNull(locale70);
        org.junit.Assert.assertEquals(locale70.toString(), "ko");
        org.junit.Assert.assertEquals(locale72.toString(), "");
        org.junit.Assert.assertNotNull(locale73);
        org.junit.Assert.assertEquals(locale73.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNotNull(localeList77);
        org.junit.Assert.assertNotNull(strArray85);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertNotNull(wildcardClassList88);
        org.junit.Assert.assertTrue("'" + filteringMode89 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode89.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList90);
        org.junit.Assert.assertNotNull(strList91);
        org.junit.Assert.assertNotNull(wildcardClassList92);
        org.junit.Assert.assertNotNull(wildcardClassList93);
        org.junit.Assert.assertNull(str94);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
    }

    @Test
    public void test13839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13839");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap3);
        java.util.Spliterator<java.util.Locale.LanguageRange> languageRangeSpliterator5 = languageRangeList1.spliterator();
        java.util.Locale.LanguageRange[] languageRangeArray6 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList7 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList7, languageRangeArray6);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap9 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList10 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList7, strMap9);
        int int11 = languageRangeList7.size();
        java.util.List<java.util.Locale.LanguageRange> languageRangeList13 = java.util.Locale.LanguageRange.parse("hi");
        boolean boolean15 = languageRangeList13.remove((java.lang.Object) "English");
        boolean boolean16 = languageRangeList7.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList13);
        java.util.Locale.LanguageRange[] languageRangeArray17 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList18 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList18, languageRangeArray17);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap20 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList21 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList18, strMap20);
        java.lang.String[] strArray29 = new java.lang.String[] { "English", "hi", "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "", "a", "", "China" };
        java.util.ArrayList<java.lang.String> strList30 = new java.util.ArrayList<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList30, strArray29);
        java.util.List<java.lang.Class<?>> wildcardClassList32 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList30);
        java.lang.String str33 = java.util.Locale.lookupTag(languageRangeList21, (java.util.Collection<java.lang.String>) strList30);
        java.util.List<java.lang.Class<?>> wildcardClassList34 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList30);
        java.util.List<java.lang.String> strList35 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList7, (java.util.Collection<java.lang.String>) strList30);
        java.util.Locale.LanguageRange[] languageRangeArray36 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList37 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList37, languageRangeArray36);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap39 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList40 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList37, strMap39);
        int int41 = languageRangeList37.size();
        java.util.List<java.util.Locale.LanguageRange> languageRangeList43 = java.util.Locale.LanguageRange.parse("hi");
        boolean boolean45 = languageRangeList43.remove((java.lang.Object) "English");
        boolean boolean46 = languageRangeList37.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList43);
        java.lang.String[] strArray51 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("English", "hi", (int) (short) -1);
        java.lang.String[] strArray54 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("a", "");
        java.lang.String[] strArray55 = org.apache.commons.lang3.StringUtils.stripAll(strArray54);
        java.lang.String[] strArray56 = org.apache.commons.lang3.StringUtils.stripAll(strArray55);
        java.lang.String str57 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", strArray51, strArray55);
        boolean boolean58 = languageRangeList37.equals((java.lang.Object) strArray55);
        boolean boolean59 = languageRangeList7.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList37);
        boolean boolean60 = languageRangeList1.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList7);
        java.lang.String str62 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList1, '#');
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor63 = languageRangeList1.listIterator();
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(languageRangeSpliterator5);
        org.junit.Assert.assertNotNull(languageRangeArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(languageRangeList10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(languageRangeList13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(languageRangeArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(languageRangeList21);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(wildcardClassList32);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(wildcardClassList34);
        org.junit.Assert.assertNotNull(strList35);
        org.junit.Assert.assertNotNull(languageRangeArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(languageRangeList40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(languageRangeList43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h" + "'", str57, "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertNotNull(languageRangeItor63);
    }

    @Test
    public void test13840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13840");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "eSESENICHZ.....", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test13841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13841");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("##############################################", "Chnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Chnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "Chnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test13842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13842");
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
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap26 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList27 = java.util.Locale.LanguageRange.parse("Cina", strMap26);
        java.util.Locale.LanguageRange languageRange29 = new java.util.Locale.LanguageRange("English");
        java.lang.String str31 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) languageRange29, "");
        java.lang.String str32 = languageRange29.getRange();
        boolean boolean33 = languageRangeList27.add(languageRange29);
        java.util.Locale.LanguageRange languageRange35 = new java.util.Locale.LanguageRange("English");
        java.lang.String str36 = languageRange35.getRange();
        java.lang.String str37 = languageRange35.getRange();
        boolean boolean38 = languageRangeList27.add(languageRange35);
        java.lang.String str39 = languageRange35.getRange();
        // The following exception was thrown during execution in test generation
        try {
            languageRangeList15.add(24, languageRange35);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 24, Size: 0");
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
        org.junit.Assert.assertNotNull(languageRangeList27);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Locale.LanguageRange" + "'", str31, "Locale.LanguageRange");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "english" + "'", str32, "english");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "english" + "'", str36, "english");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "english" + "'", str37, "english");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "english" + "'", str39, "english");
    }

    @Test
    public void test13843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13843");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("ZH-CNENGLISH", "n       a                                           ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ZH-CNENGLISH" + "'", str2, "ZH-CNENGLISH");
    }

    @Test
    public void test13844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13844");
        java.util.Locale locale3 = new java.util.Locale("cinaxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", "us", "ANIHC      ");
        java.util.Locale locale4 = locale3.stripExtensions();
        org.junit.Assert.assertEquals(locale3.toString(), "cinaxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx_US_ANIHC      ");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "cinaxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx_US_ANIHC      ");
    }

    @Test
    public void test13845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13845");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "T", false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: T");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13846");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("uuuuuxAuuuuu");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "uuuuuxAuuuuu" + "'", str2, "uuuuuxAuuuuu");
    }

    @Test
    public void test13847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13847");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("English");
        java.lang.String str3 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) languageRange1, "");
        java.util.Locale.LanguageRange languageRange5 = new java.util.Locale.LanguageRange("a");
        java.util.Locale.LanguageRange languageRange7 = new java.util.Locale.LanguageRange("a");
        java.util.Locale.LanguageRange[] languageRangeArray8 = new java.util.Locale.LanguageRange[] { languageRange1, languageRange5, languageRange7 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList9 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList9, languageRangeArray8);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor11 = languageRangeList9.listIterator();
        java.lang.String[] strArray16 = org.apache.commons.lang3.StringUtils.split("english", "cHINA", (int) (byte) 1);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny("Chin", strArray16);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray16, "\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd");
        int int20 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray16);
        java.lang.String[] strArray21 = org.apache.commons.lang3.StringUtils.stripAll(strArray16);
        boolean boolean22 = languageRangeList9.equals((java.lang.Object) strArray16);
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray16, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Locale.LanguageRange" + "'", str3, "Locale.LanguageRange");
        org.junit.Assert.assertNotNull(languageRangeArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(languageRangeItor11);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "english" + "'", str19, "english");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "english" + "'", str24, "english");
    }

    @Test
    public void test13848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13848");
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
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap59 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList60 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList43, strMap59);
        java.util.Spliterator<java.util.Locale.LanguageRange> languageRangeSpliterator61 = languageRangeList60.spliterator();
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
// flaky:         org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "China" + "'", str15, "China");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "zh-CN" + "'", str16, "zh-CN");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale18);
// flaky:         org.junit.Assert.assertEquals(locale18.toString(), "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "China" + "'", str19, "China");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale21);
// flaky:         org.junit.Assert.assertEquals(locale21.toString(), "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "China" + "'", str22, "China");
        org.junit.Assert.assertEquals(locale26.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale28);
// flaky:         org.junit.Assert.assertEquals(locale28.toString(), "");
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
        org.junit.Assert.assertNotNull(languageRangeList60);
        org.junit.Assert.assertNotNull(languageRangeSpliterator61);
    }

    @Test
    public void test13849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13849");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("AN       A");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AN       A" + "'", str1, "AN       A");
    }

    @Test
    public void test13850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13850");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("zh_ZH                                                                                                                   ", "ususususususususususususususususususus");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test13851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13851");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale.Builder builder3 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder5 = builder1.setRegion("zh");
        java.util.Locale.Builder builder6 = builder5.clear();
        java.util.Locale.Builder builder7 = builder6.clearExtensions();
        java.util.Locale.Builder builder9 = builder6.addUnicodeLocaleAttribute("CAN");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder9.addUnicodeLocaleAttribute("ArrayList.ListItr");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: ArrayList.ListItr [at index 0]");
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
    }

    @Test
    public void test13852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13852");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("LANGUAGERANGE", "char[]");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "", 9, 33);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 9");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test13853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13853");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("LOCALE.BUILDE");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=locale.builde");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13854");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("HI!STRING[]STRING[]S                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      ", ".................................................................................$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test13855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13855");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "\uc601\uc5b4");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test13856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13856");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("boolean", "nglish  Hindi (HI!,cHINA");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test13857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13857");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("hsilgnenc-hz", 39, "e!e(tiiwin");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "e!e(tiiwine!ehsilgnenc-hze!e(tiiwine!e(" + "'", str3, "e!e(tiiwine!ehsilgnenc-hze!e(tiiwine!e(");
    }

    @Test
    public void test13858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13858");
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
        java.util.Locale.Builder builder19 = null; // flaky: builder5.setLocale(locale15);
        java.util.Locale.Builder builder20 = null; // flaky: builder19.clearExtensions();
        java.util.Locale.Builder builder21 = null; // flaky: builder20.clear();
        java.util.Locale.Builder builder23 = null; // flaky: builder20.removeUnicodeLocaleAttribute("inglese");
        java.util.Locale locale24 = java.util.Locale.CHINESE;
        java.util.Locale locale25 = java.util.Locale.JAPANESE;
        java.util.Locale locale27 = java.util.Locale.TAIWAN;
        java.lang.String str28 = org.apache.commons.lang3.StringUtils.upperCase("", locale27);
        java.lang.String str29 = locale25.getDisplayVariant(locale27);
        java.util.Set<java.lang.Character> charSet30 = locale27.getExtensionKeys();
        java.util.Set<java.lang.String> strSet31 = locale27.getUnicodeLocaleAttributes();
        java.util.Locale locale34 = new java.util.Locale("ahi!hi!", "                 a                 ");
        java.lang.String str35 = locale27.getDisplayScript(locale34);
        java.lang.String str36 = locale24.getDisplayName(locale27);
        java.util.Locale.Builder builder37 = null; // flaky: builder20.setLocale(locale27);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder39 = null; // flaky: builder37.setLanguage("\u4e2d\u6587\u53f0\u6e7e\u5730\u533aengliilish)                                  ");
// flaky:             org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language:                                  ??engliilish engliilish(engliilish????engliilish)                                   [at index 0]");
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "English" + "'", str11, "English");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale15);
// flaky:         org.junit.Assert.assertEquals(locale15.toString(), "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "China" + "'", str16, "China");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
// flaky:         org.junit.Assert.assertNotNull(builder19);
// flaky:         org.junit.Assert.assertNotNull(builder20);
// flaky:         org.junit.Assert.assertNotNull(builder21);
// flaky:         org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "zh");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "ja");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(charSet30);
        org.junit.Assert.assertNotNull(strSet31);
        org.junit.Assert.assertEquals(locale34.toString(), "ahi!hi!_                 A                 ");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "\u4e2d\u6587" + "'", str36, "\u4e2d\u6587");
// flaky:         org.junit.Assert.assertNotNull(builder37);
    }

    @Test
    public void test13859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13859");
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
        java.util.Locale.FilteringMode filteringMode51 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList52 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList48, filteringMode51);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor54 = languageRangeList1.listIterator((int) (short) 0);
        java.lang.String str56 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList1, ' ');
        java.util.List<java.util.Locale.LanguageRange> languageRangeList58 = java.util.Locale.LanguageRange.parse("hi");
        java.lang.Object[] objArray59 = languageRangeList58.toArray();
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream60 = languageRangeList58.parallelStream();
        java.util.Locale.LanguageRange[] languageRangeArray61 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList62 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList62, languageRangeArray61);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap64 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList65 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList62, strMap64);
        java.util.Locale.LanguageRange[] languageRangeArray66 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList67 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList67, languageRangeArray66);
        boolean boolean69 = languageRangeList62.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList67);
        java.util.Locale.LanguageRange[] languageRangeArray70 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList71 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList71, languageRangeArray70);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap73 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList74 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList71, strMap73);
        java.util.Locale.LanguageRange[] languageRangeArray75 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList76 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList76, languageRangeArray75);
        boolean boolean78 = languageRangeList71.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList76);
        java.lang.String str80 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList76, "hi!");
        boolean boolean81 = languageRangeList62.remove((java.lang.Object) languageRangeList76);
        boolean boolean82 = languageRangeList58.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList76);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList84 = java.util.Locale.LanguageRange.parse("hi");
        boolean boolean86 = languageRangeList84.remove((java.lang.Object) "English");
        java.util.Locale.LanguageRange languageRange88 = languageRangeList84.get(0);
        boolean boolean89 = languageRangeList58.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList84);
        boolean boolean90 = languageRangeList1.retainAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList58);
        java.util.Iterator<java.util.Locale.LanguageRange> languageRangeItor91 = languageRangeList1.iterator();
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "China" + "'", str25, "China");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "zh-CN" + "'", str26, "zh-CN");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale28);
// flaky:         org.junit.Assert.assertEquals(locale28.toString(), "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "China" + "'", str29, "China");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale31);
// flaky:         org.junit.Assert.assertEquals(locale31.toString(), "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "China" + "'", str32, "China");
        org.junit.Assert.assertEquals(locale36.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale38);
// flaky:         org.junit.Assert.assertEquals(locale38.toString(), "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "China" + "'", str39, "China");
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
        org.junit.Assert.assertTrue("'" + filteringMode51 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode51.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList52);
        org.junit.Assert.assertNotNull(languageRangeItor54);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertNotNull(languageRangeList58);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertNotNull(languageRangeStream60);
        org.junit.Assert.assertNotNull(languageRangeArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(languageRangeList65);
        org.junit.Assert.assertNotNull(languageRangeArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(languageRangeArray70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(languageRangeList74);
        org.junit.Assert.assertNotNull(languageRangeArray75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(languageRangeList84);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(languageRange88);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertNotNull(languageRangeItor91);
    }

    @Test
    public void test13860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13860");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "                                                                                                                                                                                                                                                   Italian  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                                                                                   Italian  " + "'", str1, "                                                                                                                                                                                                                                                   Italian  ");
    }

    @Test
    public void test13861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13861");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("ReferencePipeline.Head", '4');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test13862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13862");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("redliuB.elacoL");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test13863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13863");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("zh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglishchinazh-cnenglish");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test13864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13864");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("zaachi...zaa.");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test13865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13865");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("               fr_CA                          ", "###############################EnglHI!STRING[]STRING[]SsHI!STRING[]STRING[]S###############################EnglHI!STRING[]STRING[]SsHI!STRING[]STRING[]S###############################EnglHI!STRING[]STRING[]SsHI!STRING[]STRING[]S###############################EnglHI!STRING[]STRING[]SsHI!STRING[]STRING[]S###############################EnglHI!STRING[]STRING[]SsHI!STRING[]STRING[]S###############################EnglHI!STRING[]STRING[]SsHI!STRING[]STRING[]S###############################EnglHI!STRING[]STRING[]SsHI!STRING[]STRING[]S###############################EnglHI!STRING[]STRING[]SsHI!STRING[]STRING[]S###############################EnglHI!STRING[]STRING[]SsHI!STRING[]STRING[]S", 747);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test13866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13866");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.ENGLISH;
        java.util.Locale.setDefault(category0, locale1);
        java.util.Locale locale3 = java.util.Locale.JAPANESE;
        java.util.Locale locale5 = java.util.Locale.TAIWAN;
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.upperCase("", locale5);
        java.lang.String str7 = locale3.getDisplayVariant(locale5);
        java.util.Locale.setDefault(category0, locale5);
        java.lang.String str9 = locale5.getVariant();
        java.util.Locale.Builder builder10 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder11 = builder10.clearExtensions();
        java.util.Locale locale12 = builder10.build();
        java.util.Locale locale14 = new java.util.Locale("");
        java.util.Set<java.lang.String> strSet15 = locale14.getUnicodeLocaleKeys();
        java.lang.String str16 = locale14.getDisplayName();
        java.util.Locale.Builder builder17 = builder10.setLocale(locale14);
        java.lang.String str18 = locale14.getDisplayName();
        java.util.Locale locale21 = new java.util.Locale("zho", "US");
        java.util.Locale locale22 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str23 = locale21.getDisplayVariant(locale22);
        java.lang.String str24 = locale22.getDisplayScript();
        java.lang.String str25 = locale14.getDisplayLanguage(locale22);
        java.lang.String str26 = locale5.getDisplayLanguage(locale14);
        java.lang.Class<?> wildcardClass27 = locale14.getClass();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ja");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals(locale21.toString(), "zho_US");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Chinese" + "'", str26, "Chinese");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test13867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13867");
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
        java.util.Collection<java.lang.String> strCollection27 = null;
        java.util.List<java.lang.String> strList28 = java.util.Locale.filterTags(languageRangeList11, strCollection27);
        languageRangeList11.clear();
        languageRangeList11.clear();
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
        org.junit.Assert.assertNotNull(strList28);
    }

    @Test
    public void test13868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13868");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("it");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny("ESE (tAIWAN", strArray3);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("\u7fa9\u5927\u5229\u6587", strArray3);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, 'u', 117, 1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test13869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13869");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("Englisch", "44444444444444444ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", 44);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test13870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13870");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("English (Canada)", "AAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test13871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13871");
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
        java.util.Locale.LanguageRange[] languageRangeArray26 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList27 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList27, languageRangeArray26);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap29 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList30 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList27, strMap29);
        int int31 = languageRangeList27.size();
        java.lang.Class[] classArray33 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray34 = (java.lang.Class<?>[]) classArray33;
        java.lang.Class<?>[] wildcardClassArray35 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray33);
        boolean boolean36 = languageRangeList27.equals((java.lang.Object) wildcardClassArray35);
        int int38 = languageRangeList27.indexOf((java.lang.Object) (short) 100);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList40 = java.util.Locale.LanguageRange.parse("hi");
        int int42 = languageRangeList40.indexOf((java.lang.Object) '4');
        java.util.Locale.LanguageRange[] languageRangeArray43 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList44 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList44, languageRangeArray43);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap46 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList47 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList44, strMap46);
        int int48 = languageRangeList44.size();
        java.util.List<java.util.Locale.LanguageRange> languageRangeList50 = java.util.Locale.LanguageRange.parse("hi");
        boolean boolean52 = languageRangeList50.remove((java.lang.Object) "English");
        boolean boolean53 = languageRangeList44.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList50);
        java.util.Locale.LanguageRange[] languageRangeArray54 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList55 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList55, languageRangeArray54);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap57 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList58 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList55, strMap57);
        java.lang.String[] strArray66 = new java.lang.String[] { "English", "hi", "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "", "a", "", "China" };
        java.util.ArrayList<java.lang.String> strList67 = new java.util.ArrayList<java.lang.String>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList67, strArray66);
        java.util.List<java.lang.Class<?>> wildcardClassList69 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList67);
        java.lang.String str70 = java.util.Locale.lookupTag(languageRangeList58, (java.util.Collection<java.lang.String>) strList67);
        java.util.List<java.lang.Class<?>> wildcardClassList71 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList67);
        java.util.List<java.lang.String> strList72 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList44, (java.util.Collection<java.lang.String>) strList67);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap74 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList75 = java.util.Locale.LanguageRange.parse("Cina", strMap74);
        java.lang.String[] strArray79 = new java.lang.String[] { "aiaiaiaiaiaiaiaiaia", "zh-CN", "China" };
        java.util.ArrayList<java.lang.String> strList80 = new java.util.ArrayList<java.lang.String>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList80, strArray79);
        java.util.Locale.FilteringMode filteringMode82 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList83 = java.util.Locale.filterTags(languageRangeList75, (java.util.Collection<java.lang.String>) strList80, filteringMode82);
        java.util.List<java.lang.String> strList84 = java.util.Locale.filterTags(languageRangeList40, (java.util.Collection<java.lang.String>) strList67, filteringMode82);
        java.util.List<java.lang.Class<?>> wildcardClassList85 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses(strList84);
        java.util.List<java.lang.String> strList86 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList27, (java.util.Collection<java.lang.String>) strList84);
        boolean boolean87 = languageRangeList11.remove((java.lang.Object) strList86);
        java.util.List<java.lang.Class<?>> wildcardClassList88 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses(strList86);
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
        org.junit.Assert.assertNotNull(languageRangeArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(languageRangeList30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(classArray33);
        org.junit.Assert.assertNotNull(wildcardClassArray34);
        org.junit.Assert.assertNotNull(wildcardClassArray35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(languageRangeList40);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(languageRangeArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(languageRangeList47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(languageRangeList50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(languageRangeArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(languageRangeList58);
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(wildcardClassList69);
        org.junit.Assert.assertNull(str70);
        org.junit.Assert.assertNotNull(wildcardClassList71);
        org.junit.Assert.assertNotNull(strList72);
        org.junit.Assert.assertNotNull(languageRangeList75);
        org.junit.Assert.assertNotNull(strArray79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertTrue("'" + filteringMode82 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode82.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList83);
        org.junit.Assert.assertNotNull(strList84);
        org.junit.Assert.assertNotNull(wildcardClassList85);
        org.junit.Assert.assertNotNull(strList86);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNotNull(wildcardClassList88);
    }

    @Test
    public void test13872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13872");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("nawiaT( eseengls$$$$$$$$$nawiaT( es", (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test13873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13873");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("italien");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "                                REDLIUB", (int) (short) 0, 44);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test13874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13874");
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
        java.lang.Class<?>[] wildcardClassArray13 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray12);
        java.lang.Class<?>[] wildcardClassArray14 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray13);
        java.lang.Class[] classArray17 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray18 = (java.lang.Class<?>[]) classArray17;
        java.lang.Class<?>[] wildcardClassArray19 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray17);
        java.lang.Class<?>[] wildcardClassArray20 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray17);
        java.lang.Class<?>[] wildcardClassArray21 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) classArray17);
        java.lang.Class[] classArray23 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray24 = (java.lang.Class<?>[]) classArray23;
        java.lang.Class<?>[] wildcardClassArray25 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray23);
        java.lang.Class<?>[] wildcardClassArray26 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray23);
        java.lang.Class<?>[] wildcardClassArray27 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray23);
        java.lang.String str28 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray27);
        boolean boolean30 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray21, wildcardClassArray27, true);
        java.lang.String str31 = org.apache.commons.lang3.StringUtils.concatWith("iiiiiiiiiiiiiiiiiiiiiiiArrayList", (java.lang.Object[]) wildcardClassArray21);
        boolean boolean33 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray14, wildcardClassArray21, true);
        java.lang.Class<?>[] wildcardClassArray34 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray14);
        java.lang.String str38 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray34, "xGNAL.AVAJString[]String[]String[]x", 530, 99);
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertNotNull(classArray6);
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray12);
        org.junit.Assert.assertNotNull(wildcardClassArray13);
        org.junit.Assert.assertNotNull(wildcardClassArray14);
        org.junit.Assert.assertNotNull(classArray17);
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertNotNull(wildcardClassArray19);
        org.junit.Assert.assertNotNull(wildcardClassArray20);
        org.junit.Assert.assertNotNull(wildcardClassArray21);
        org.junit.Assert.assertNotNull(classArray23);
        org.junit.Assert.assertNotNull(wildcardClassArray24);
        org.junit.Assert.assertNotNull(wildcardClassArray25);
        org.junit.Assert.assertNotNull(wildcardClassArray26);
        org.junit.Assert.assertNotNull(wildcardClassArray27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray34);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
    }

    @Test
    public void test13875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13875");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("integer", 52, "\u5357\u97d3");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u5357\u97d3\u5357\u97d3\u5357\u97d3\u5357\u97d3\u5357\u97d3\u5357\u97d3\u5357\u97d3\u5357\u97d3\u5357\u97d3\u5357\u97d3\u5357\u97d3\u5357\u97d3\u5357\u97d3\u5357\u97d3\u5357\u97d3\u5357\u97d3\u5357\u97d3\u5357\u97d3\u5357\u97d3\u5357\u97d3\u5357\u97d3\u5357\u97d3\u5357integer" + "'", str3, "\u5357\u97d3\u5357\u97d3\u5357\u97d3\u5357\u97d3\u5357\u97d3\u5357\u97d3\u5357\u97d3\u5357\u97d3\u5357\u97d3\u5357\u97d3\u5357\u97d3\u5357\u97d3\u5357\u97d3\u5357\u97d3\u5357\u97d3\u5357\u97d3\u5357\u97d3\u5357\u97d3\u5357\u97d3\u5357\u97d3\u5357\u97d3\u5357\u97d3\u5357integer");
    }

    @Test
    public void test13876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13876");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("Collections.EmptySet");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Collections.EmptySet" + "'", str1, "Collections.EmptySet");
    }

    @Test
    public void test13877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13877");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("chinois(chine)4444444444444444444444444444444444444444444444444444444444444444444444444444444444444", '.', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chinois(chine)4444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "chinois(chine)4444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test13878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13878");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder0.removeUnicodeLocaleAttribute("English");
        java.util.Locale.Builder builder6 = builder4.setLanguage("nglese");
        java.util.Locale.Builder builder9 = builder4.setExtension('a', "hI");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder4.setRegion("en-ca");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: en-ca [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test13879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13879");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("string");
        double double2 = languageRange1.getWeight();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test13880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13880");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!henglish_IA_zh_CN", "                                REDLIUB");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test13881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13881");
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
        java.util.Spliterator<java.util.Locale.LanguageRange> languageRangeSpliterator89 = languageRangeList86.spliterator();
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
// flaky:         org.junit.Assert.assertEquals(locale38.toString(), "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "China" + "'", str39, "China");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "zh-CN" + "'", str40, "zh-CN");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale42);
// flaky:         org.junit.Assert.assertEquals(locale42.toString(), "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "China" + "'", str43, "China");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale45);
// flaky:         org.junit.Assert.assertEquals(locale45.toString(), "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "China" + "'", str46, "China");
        org.junit.Assert.assertEquals(locale50.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale52);
// flaky:         org.junit.Assert.assertEquals(locale52.toString(), "");
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
        org.junit.Assert.assertNotNull(languageRangeSpliterator89);
    }

    @Test
    public void test13882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13882");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "            )ANIHc,!IH(idni            )ANIHc,!IH(idni            )ANIHc,!IH(idni            )ANIHc,!IH(idni            )ANIHc,!IH(idni            )ANIHc,!IH(idni            )ANIHc,!IH(idni            )ANIHc,!IH(idni            )ANIHc,!IH(idni            )ANIHc,!IH(idni            )ANIHc,!IH(idni            )ANIHc,!IH(idni", "cina");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 17 + "'", int2 == 17);
    }

    @Test
    public void test13883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13883");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("", "\u4e2d\u570b");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test13884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13884");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H", "EnglHI!STRING[]STRING[]SsHI!STRING[]STRING[]SEnglHI!STRING[]STRING[]SsHI!STRING[]STRING[]SEnglHI!STRING[]STRING[]SsHI!STRING[]STRING[]SEnglHI!STRING[]STRING[]SsHI!STRING[]STRING[]SEnglHI!STRING[]STRING[]SsHI!STRING[]STRING[]SEnglHI!STRING[]STRING[]SsHI!STRING[]STRING[]SEnglHI!STRING[]STRING[]SsHI!STRING[]STRING[]SEnglHI!STRING[]STRING[]SsHI!STRING[]STRING[]SEnglHI!STRING[]STRING[]SsHI!STRING[]STRING[]SEnglHI!STRING[]STRING[]SsHI!STRING[]STRING[]S", 15);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test13885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13885");
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
        java.util.Iterator<java.util.Locale.LanguageRange> languageRangeItor43 = languageRangeList1.iterator();
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
// flaky:         org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "China" + "'", str15, "China");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "zh-CN" + "'", str16, "zh-CN");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale18);
// flaky:         org.junit.Assert.assertEquals(locale18.toString(), "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "China" + "'", str19, "China");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale21);
// flaky:         org.junit.Assert.assertEquals(locale21.toString(), "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "China" + "'", str22, "China");
        org.junit.Assert.assertEquals(locale26.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale28);
// flaky:         org.junit.Assert.assertEquals(locale28.toString(), "");
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
        org.junit.Assert.assertNotNull(languageRangeSpliterator42);
        org.junit.Assert.assertNotNull(languageRangeItor43);
    }

    @Test
    public void test13886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13886");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale.Builder builder3 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder5 = builder1.setRegion("zh");
        java.util.Locale.Builder builder6 = builder5.clear();
        java.util.Locale.Builder builder7 = builder6.clearExtensions();
        java.util.Locale.Builder builder8 = builder6.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder6.setLanguageTag("                                                          avaj                                                          ");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag:                                                           avaj                                                           [at index 0]");
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
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test13887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13887");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.setLanguageTag("zh-CN");
        java.util.Locale.Builder builder5 = builder3.setLanguage("CHINA");
        java.util.Locale locale6 = builder3.build();
        java.util.Locale.Builder builder7 = builder3.clearExtensions();
        java.util.Locale locale8 = builder7.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder7.removeUnicodeLocaleAttribute("                                                                                            Itali");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute:                                                                                             Itali [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "china_CN");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "china_CN");
    }

    @Test
    public void test13888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13888");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxch");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxch" + "'", str1, "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxch");
    }

    @Test
    public void test13889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13889");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "                                redliuB");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test13890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13890");
        java.util.Locale locale3 = new java.util.Locale("\u82f1\u6587\u52a0\u62ff\u5927)", "hi!hi! (                 A                 )#################################################", "ZHCINESESE");
        java.lang.String str5 = locale3.getExtension('u');
        org.junit.Assert.assertEquals(locale3.toString(), "\u82f1\u6587\u52a0\u62ff\u5927)_HI!HI! (                 A                 )#################################################_ZHCINESESE");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test13891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13891");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "               eN                ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "               eN                " + "'", str1, "               eN                ");
    }

    @Test
    public void test13892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13892");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "ENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISH", (java.lang.CharSequence) "..");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test13893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13893");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("ANIHCEN_ca");
        java.util.Locale.setDefault(locale1);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test13894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13894");
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
        java.util.Locale.LanguageRange languageRange30 = new java.util.Locale.LanguageRange("Chine");
        boolean boolean31 = languageRangeList1.add(languageRange30);
        java.lang.String str33 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) languageRange30, "\u4e2d\u56fd");
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
        java.util.Locale.LanguageRange[] languageRangeArray51 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList52 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList52, languageRangeArray51);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap54 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList55 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList52, strMap54);
        java.util.Locale.LanguageRange[] languageRangeArray56 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList57 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList57, languageRangeArray56);
        boolean boolean59 = languageRangeList52.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList57);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream60 = languageRangeList57.stream();
        boolean boolean61 = languageRangeList38.containsAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList57);
        java.util.Locale.LanguageRange languageRange63 = new java.util.Locale.LanguageRange("English");
        java.lang.String str64 = languageRange63.getRange();
        boolean boolean65 = languageRangeList38.add(languageRange63);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor67 = languageRangeList38.listIterator(0);
        boolean boolean68 = languageRange30.equals((java.lang.Object) 0);
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
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Locale.LanguageRange" + "'", str33, "Locale.LanguageRange");
        org.junit.Assert.assertNotNull(languageRangeArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(languageRangeList38);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(wildcardClassList49);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNotNull(languageRangeArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(languageRangeList55);
        org.junit.Assert.assertNotNull(languageRangeArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(languageRangeStream60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "english" + "'", str64, "english");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(languageRangeItor67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test13895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13895");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("An                             ", "ggggggggg", 46);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "An                             " + "'", str3, "An                             ");
    }

    @Test
    public void test13896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13896");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.lang.Class<?>[] wildcardClassArray3 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray1);
        java.lang.Class<?>[] wildcardClassArray4 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray1);
        java.lang.Class<?>[] wildcardClassArray5 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) classArray1);
        java.lang.Class[] classArray7 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray8 = (java.lang.Class<?>[]) classArray7;
        java.lang.Class<?>[] wildcardClassArray9 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray7);
        java.lang.Class<?>[] wildcardClassArray10 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray7);
        java.lang.Class<?>[] wildcardClassArray11 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray7);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray11);
        boolean boolean14 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray5, wildcardClassArray11, true);
        java.lang.Class<?>[] wildcardClassArray15 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray11);
        java.lang.Class<?>[] wildcardClassArray16 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray15);
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertNotNull(wildcardClassArray4);
        org.junit.Assert.assertNotNull(wildcardClassArray5);
        org.junit.Assert.assertNotNull(classArray7);
        org.junit.Assert.assertNotNull(wildcardClassArray8);
        org.junit.Assert.assertNotNull(wildcardClassArray9);
        org.junit.Assert.assertNotNull(wildcardClassArray10);
        org.junit.Assert.assertNotNull(wildcardClassArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray15);
        org.junit.Assert.assertNotNull(wildcardClassArray16);
    }

    @Test
    public void test13897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13897");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                                    ", "A");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "$");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.concatWith("zh-cnenglish (LOCALE.LANGUAGERANGE)", (java.lang.Object[]) strArray5);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray5);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "                                                                                                    " + "'", str6, "                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "                                                                                                    " + "'", str7, "                                                                                                    ");
    }

    @Test
    public void test13898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13898");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", '.');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test13899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13899");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("g", 83, 11);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test13900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13900");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("\u82f1\u8a9e\u30ab\u30ca\u30c0)", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test13901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13901");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("italianojajajajajajajajajajajajajaj", "\u7063\u53f0\u6587\u4e2d");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test13902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13902");
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
        java.lang.Class<?> wildcardClass20 = languageRangeStream19.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test13903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13903");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxzh-hcnczih", "", (int) (short) -1, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxzh-hcnczih" + "'", str4, "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxzh-hcnczih");
    }

    @Test
    public void test13904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13904");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("ese (Taiwan$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$", "Hindi (HI!,cHINA                                                                                                     ", 94);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test13905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13905");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("z...", "zh_ZH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "z..." + "'", str2, "z...");
    }

    @Test
    public void test13906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13906");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("GNAL.AVAJSTRING[]STRING[]STRING[", "hindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHind", 6);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test13907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13907");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fduuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test13908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13908");
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
        java.lang.Class<?>[] wildcardClassArray13 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray12);
        java.lang.Class<?>[] wildcardClassArray14 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray13);
        java.lang.Class[] classArray17 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray18 = (java.lang.Class<?>[]) classArray17;
        java.lang.Class<?>[] wildcardClassArray19 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray17);
        java.lang.Class<?>[] wildcardClassArray20 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray17);
        java.lang.Class<?>[] wildcardClassArray21 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) classArray17);
        java.lang.Class[] classArray23 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray24 = (java.lang.Class<?>[]) classArray23;
        java.lang.Class<?>[] wildcardClassArray25 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray23);
        java.lang.Class<?>[] wildcardClassArray26 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray23);
        java.lang.Class<?>[] wildcardClassArray27 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray23);
        java.lang.String str28 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray27);
        boolean boolean30 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray21, wildcardClassArray27, true);
        java.lang.String str31 = org.apache.commons.lang3.StringUtils.concatWith("iiiiiiiiiiiiiiiiiiiiiiiArrayList", (java.lang.Object[]) wildcardClassArray21);
        boolean boolean33 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray14, wildcardClassArray21, true);
        java.lang.Class<?>[] wildcardClassArray34 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray14);
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertNotNull(classArray6);
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray12);
        org.junit.Assert.assertNotNull(wildcardClassArray13);
        org.junit.Assert.assertNotNull(wildcardClassArray14);
        org.junit.Assert.assertNotNull(classArray17);
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertNotNull(wildcardClassArray19);
        org.junit.Assert.assertNotNull(wildcardClassArray20);
        org.junit.Assert.assertNotNull(wildcardClassArray21);
        org.junit.Assert.assertNotNull(classArray23);
        org.junit.Assert.assertNotNull(wildcardClassArray24);
        org.junit.Assert.assertNotNull(wildcardClassArray25);
        org.junit.Assert.assertNotNull(wildcardClassArray26);
        org.junit.Assert.assertNotNull(wildcardClassArray27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray34);
    }

    @Test
    public void test13909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13909");
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
        java.util.Locale.Builder builder21 = builder19.clearExtensions();
        java.util.Locale locale22 = builder21.build();
        java.util.Locale.Builder builder24 = builder21.setLanguageTag("COLLECTI");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder26 = builder21.setLanguageTag("ShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShort");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: ShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShort [at index 0]");
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "English" + "'", str11, "English");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "China" + "'", str16, "China");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "");
        org.junit.Assert.assertNotNull(builder24);
    }

    @Test
    public void test13910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13910");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("Engls", "xxANIHCxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test13911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13911");
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
        java.lang.String str22 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) languageRangeList1, "cn");
        java.util.Locale locale23 = java.util.Locale.JAPANESE;
        java.util.Locale locale25 = java.util.Locale.TAIWAN;
        java.lang.String str26 = org.apache.commons.lang3.StringUtils.upperCase("", locale25);
        java.lang.String str27 = locale23.getDisplayVariant(locale25);
        java.util.Set<java.lang.Character> charSet28 = locale25.getExtensionKeys();
        java.util.Set<java.lang.String> strSet29 = locale25.getUnicodeLocaleAttributes();
        java.util.List<java.lang.String> strList30 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet29);
        java.util.function.UnaryOperator<java.util.Locale.LanguageRange> languageRangeUnaryOperator31 = null;
        // The following exception was thrown during execution in test generation
        try {
            languageRangeList1.replaceAll(languageRangeUnaryOperator31);
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "java.util" + "'", str22, "java.util");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "ja");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(charSet28);
        org.junit.Assert.assertNotNull(strSet29);
        org.junit.Assert.assertNotNull(strList30);
    }

    @Test
    public void test13912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13912");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "\u4e2d\u6587\u53f0\u6e7e\u5730\u533aengliilish)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test13913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13913");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("hi!String[]String[]S", "xxxahi!hiCinaxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", "                         ");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test13914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13914");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("h$I");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test13915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13915");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "           zxxxxxxxxxxxxxxxxxxx", (java.lang.CharSequence) "ac_NE");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 31 + "'", int2 == 31);
    }

    @Test
    public void test13916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13916");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "Zxxxxxxxxxxxxxxxxxxx", "aragonese");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test13917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13917");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("HI");
        boolean boolean2 = locale1.hasExtensions();
        java.lang.String str3 = locale1.getDisplayLanguage();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Hindi" + "'", str3, "Hindi");
    }

    @Test
    public void test13918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13918");
        java.util.Locale locale2 = new java.util.Locale("LOCLE.LNGUGERNGE");
        java.lang.String str3 = locale2.getDisplayScript();
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.upperCase("", locale2);
        java.lang.String str5 = locale2.getScript();
        java.lang.String str6 = locale2.getDisplayVariant();
        java.lang.String str7 = locale2.getScript();
        java.lang.String str9 = locale2.getExtension('x');
        org.junit.Assert.assertEquals(locale2.toString(), "locle.lngugernge");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test13919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13919");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("ANIHCZHCINESESEXXXXX", (double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=97.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13920");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("                                                                                                   $", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                   $" + "'", str2, "                                                                                                   $");
    }

    @Test
    public void test13921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13921");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "          " + "'", str2, "          ");
    }

    @Test
    public void test13922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13922");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.setLanguageTag("zh-CN");
        java.util.Locale.Builder builder5 = builder3.setLanguage("CHINA");
        java.util.Locale.Builder builder7 = builder5.setLanguageTag("english");
        java.util.Locale locale8 = builder7.build();
        java.util.Locale.Builder builder9 = builder7.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder9.setLanguage("\u82f1\u6587\u52a0\u62ff\u5927)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: ?? (???) [at index 0]");
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
    }

    @Test
    public void test13923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13923");
        java.util.Locale locale1 = new java.util.Locale("");
        java.lang.String str2 = locale1.getDisplayLanguage();
        java.util.Locale locale3 = java.util.Locale.CANADA;
        java.lang.String str4 = locale3.getDisplayLanguage();
        java.lang.String str5 = locale1.getDisplayScript(locale3);
        java.lang.String str7 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) locale3, "lang                                                                                                ");
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "English" + "'", str4, "English");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "java.util" + "'", str7, "java.util");
    }

    @Test
    public void test13924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13924");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("fraHCHNrrayListfraHCHNrrayListfraHCHNrrayListfraHCHNrrayListfraHCHNrrayListfraHCHNrrayListfraHCHNrrayListfraHCHNrrayListfraHCHNrrayList", "HI!HI!HI!HI!HI!Hzh_Z!HI!HI!HI!HI!HI44444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test13925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13925");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("ArrayL", "a#", "Francese");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ArrayL" + "'", str3, "ArrayL");
    }

    @Test
    public void test13926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13926");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("\u4e2d\u6587\u4e2d\u570b)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 23, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u4e2d\u6587\u4e2d\u570b)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "\u4e2d\u6587\u4e2d\u570b)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test13927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13927");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("                  ArrayList.ListItr", 20);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test13928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13928");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("zh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CTWzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-C");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh__#Cnzh");
    }

    @Test
    public void test13929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13929");
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
        java.util.Locale locale17 = locale7.stripExtensions();
        java.lang.String str19 = locale7.getExtension('u');
        java.util.Locale.setDefault(locale7);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
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
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Taiwan" + "'", str11, "Taiwan");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\u4e2d\u6587\u53f0\u7063)" + "'", str14, "\u4e2d\u6587\u53f0\u7063)");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "fr");
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test13930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13930");
        java.util.Locale locale1 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale2 = java.util.Locale.getDefault();
        java.lang.String str3 = locale1.getDisplayCountry(locale2);
        java.lang.String str4 = locale1.toLanguageTag();
        java.lang.String str5 = locale1.getLanguage();
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
        java.util.Locale locale18 = java.util.Locale.GERMAN;
        java.lang.String str19 = locale8.getDisplayLanguage(locale18);
        java.lang.String str20 = locale1.getDisplayCountry(locale8);
        java.lang.String str21 = locale8.getCountry();
        java.util.Locale locale25 = new java.util.Locale("....english", "zhcinesese", ".");
        java.lang.String str26 = locale8.getDisplayName(locale25);
        java.lang.String str27 = locale8.getDisplayName();
        java.lang.String str28 = org.apache.commons.lang3.StringUtils.lowerCase("Germn", locale8);
        java.lang.String str29 = locale8.getDisplayScript();
        java.util.Locale.Category category30 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale31 = java.util.Locale.getDefault(category30);
        java.util.Locale locale32 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str33 = locale32.getDisplayLanguage();
        java.lang.String str34 = locale32.getDisplayScript();
        java.util.Locale.setDefault(category30, locale32);
        java.util.Locale locale36 = java.util.Locale.getDefault(category30);
        java.util.Locale locale37 = java.util.Locale.FRENCH;
        java.util.Locale locale38 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str39 = locale38.getDisplayLanguage();
        java.util.Locale locale40 = java.util.Locale.getDefault();
        java.lang.String str41 = locale38.getDisplayCountry(locale40);
        java.util.Locale locale42 = java.util.Locale.TAIWAN;
        java.lang.String str43 = locale42.getVariant();
        java.lang.String str44 = locale38.getDisplayName(locale42);
        java.lang.String str45 = locale37.getDisplayScript(locale38);
        java.util.Locale.setDefault(category30, locale37);
        java.util.Locale locale47 = java.util.Locale.ITALIAN;
        java.util.Locale locale49 = new java.util.Locale("");
        java.lang.String str50 = locale49.getDisplayLanguage();
        java.util.Locale locale51 = java.util.Locale.CANADA;
        java.lang.String str52 = locale51.getDisplayLanguage();
        java.lang.String str53 = locale49.getDisplayScript(locale51);
        java.util.Locale locale55 = java.util.Locale.FRANCE;
        java.lang.String str56 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale55);
        java.lang.String str57 = locale49.getDisplayCountry(locale55);
        java.lang.String str58 = locale47.getDisplayScript(locale49);
        java.util.Locale locale59 = java.util.Locale.GERMAN;
        java.lang.String str60 = locale49.getDisplayLanguage(locale59);
        java.util.Locale locale63 = new java.util.Locale("");
        java.lang.String str64 = locale63.getDisplayLanguage();
        java.util.Locale locale65 = java.util.Locale.CANADA;
        java.lang.String str66 = locale65.getDisplayLanguage();
        java.lang.String str67 = locale63.getDisplayScript(locale65);
        java.lang.String str68 = org.apache.commons.lang3.StringUtils.lowerCase("a", locale63);
        java.lang.String str69 = locale63.getDisplayScript();
        java.lang.String str70 = locale59.getDisplayLanguage(locale63);
        java.util.Set<java.lang.String> strSet71 = locale59.getUnicodeLocaleAttributes();
        java.util.Locale locale73 = new java.util.Locale("I");
        java.lang.String str74 = locale73.getDisplayCountry();
        java.lang.String str75 = locale73.toLanguageTag();
        java.lang.String str76 = locale59.getDisplayScript(locale73);
        java.util.Locale.setDefault(category30, locale73);
        java.util.Locale locale78 = locale73.stripExtensions();
        java.lang.String str79 = locale8.getDisplayScript(locale78);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Chine" + "'", str3, "Chine");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zh-CN" + "'", str4, "zh-CN");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "zh" + "'", str5, "zh");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "it");
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "anglais" + "'", str11, "anglais");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "english" + "'", str15, "english");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "de");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "China" + "'", str20, "China");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals(locale25.toString(), "....english_ZHCINESESE_.");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "germn" + "'", str28, "germn");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + category30 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category30.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "fr");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "chinois" + "'", str33, "chinois");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "fr");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "\u4e2d\u6587" + "'", str39, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Taiwan" + "'", str41, "Taiwan");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
// flaky:         org.junit.Assert.assertEquals("'" + str44 + "' != '" + "\u4e2d\u6587\u53f0\u7063)" + "'", str44, "\u4e2d\u6587\u53f0\u7063)");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "it");
        org.junit.Assert.assertEquals(locale49.toString(), "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "anglais" + "'", str52, "anglais");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "english" + "'", str56, "english");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "de");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertEquals(locale63.toString(), "");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertNotNull(locale65);
        org.junit.Assert.assertEquals(locale65.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "anglais" + "'", str66, "anglais");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "a" + "'", str68, "a");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "German" + "'", str70, "German");
        org.junit.Assert.assertNotNull(strSet71);
        org.junit.Assert.assertEquals(locale73.toString(), "i");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "und" + "'", str75, "und");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertNotNull(locale78);
        org.junit.Assert.assertEquals(locale78.toString(), "i");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
    }

    @Test
    public void test13931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13931");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "...x.az.ba.bb.bd.be.eSESENICHZ......_ITALIANO", "...                           ...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test13932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13932");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("chnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "LOCLE.LNGUGERNGE");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test13933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13933");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("iaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaia", "wt_hz", "LOCALE.LANGUAGERANGE");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test13934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13934");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.setLanguageTag("zh-CN");
        java.util.Locale.Builder builder5 = builder3.setLanguage("it");
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        java.util.Locale locale7 = builder6.build();
        java.util.Locale.setDefault(locale7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = locale7.getUnicodeLocaleType("$$$$");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: $$$$");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test13935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13935");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("fr", 745, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaafr" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaafr");
    }

    @Test
    public void test13936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13936");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass("class java.lang.String", true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: classjava.lang.String");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13937");
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
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor88 = languageRangeList77.listIterator();
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
        org.junit.Assert.assertEquals(locale25.toString(), "it_CN");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Cina" + "'", str26, "Cina");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "zh-CN" + "'", str27, "zh-CN");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "it_CN");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Cina" + "'", str30, "Cina");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "it_CN");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Cina" + "'", str33, "Cina");
        org.junit.Assert.assertEquals(locale37.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "it_CN");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Cina" + "'", str40, "Cina");
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
        org.junit.Assert.assertNotNull(languageRangeItor88);
    }

    @Test
    public void test13938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13938");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName("FRAN\307AIS");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test13939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13939");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "\u52a0\u62ff\u5927", "f   ch");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test13940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13940");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens(".....", "zh_TW", 747);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.split("cINACINzcINACINA", '.');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("nawiaT( eseengls$$$$$$$$$nawiaT( es", strArray4, strArray7);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "nawiaT( eseengls$$$$$$$$$nawiaT( es" + "'", str8, "nawiaT( eseengls$$$$$$$$$nawiaT( es");
    }

    @Test
    public void test13941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13941");
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
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.util.Iterator<java.util.Locale.LanguageRange>) languageRangeItor6, 'x');
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test13942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13942");
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
        java.lang.Object[] objArray90 = languageRangeList86.toArray();
        java.util.Iterator<java.util.Locale.LanguageRange> languageRangeItor91 = languageRangeList86.iterator();
        java.lang.String str93 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList86, "englCNsCNxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        java.lang.String str95 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList86, 'u');
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
        org.junit.Assert.assertEquals(locale38.toString(), "it_CN");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Cina" + "'", str39, "Cina");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "zh-CN" + "'", str40, "zh-CN");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "it_CN");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Cina" + "'", str43, "Cina");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "it_CN");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Cina" + "'", str46, "Cina");
        org.junit.Assert.assertEquals(locale50.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "it_CN");
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
        org.junit.Assert.assertNotNull(objArray90);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray90), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray90), "[]");
        org.junit.Assert.assertNotNull(languageRangeItor91);
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "" + "'", str93, "");
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "" + "'", str95, "");
    }

    @Test
    public void test13943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13943");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("ad.ae.af.ag.ai.al.am.an.ao.aq.ar.as.at.au.aw.ax.az.ba.bb.bd.be.bf.bg.bh.bi.bj.bl.bm.bn.bo.bq.br.bs.bt.bv.bw.by.bz.ca.cc.cd.cf.cg.ch.ci.ck.cl.cm.cn.co.cr.cu.cv.cw.cx.cy.cz.de.dj.dk.dm.do.dz.ec.ee.eg.eh.er.es.et.fi.fj.fk.fm.fo.fr.ga.gb.gd.ge.gf.gg.gh.gi.gl.gm.gn.gp.gq.gr.gs.gt.gu.gw.gy.hk.hm.hn.hr.ht.hu.id.ie.il.im.in.io.iq.ir.is.it.je.jm.jo.jp.ke.kg.kh.ki.km.kn.kp.kr.kw.ky.kz.la.lb.lc.li.lk.lr.ls.lt.lu.lv.ly.ma.mc.md.me.mf.mg.mh.mk.ml.mm.mn.mo.mp.mq.mr.ms.mt.mu.mv.mw.mx.my.mz.na.nc.ne.nf.ng.ni.nl.no.np.nr.nu.nz.om.pa.pe.pf.pg.ph.pk.pl.pm.pn.pr.ps.pt.pw.py.qa.re.ro.rs.ru.rw.sa.sb.sc.sd.se.sg.sh.si.sj.sk.sl.sm.sn.so.sr.ss.st.sv.sx.sy.sz.tc.td.tf.tg.th.tj.tk.tl.tm.tn.to.tr.tt.tv.tw.tz.ua.ug.um.us.uy.uz.va.vc.ve.vg.vi.vn.vu.wf.ws.ye.yt.za.zm.z", "N       A                                           ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test13944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13944");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("English", "hi!", (int) (byte) 0);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny("China", strArray4);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "a", (int) '4', (int) ' ');
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "twn");
        java.lang.Class<?>[] wildcardClassArray12 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray4);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) wildcardClassArray12);
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
        java.lang.String str45 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) classArray15, '#');
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
        java.lang.Class<?>[] wildcardClassArray62 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray59);
        java.lang.String str64 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) classArray59, "zh-CN");
        java.lang.String str68 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) classArray59, ' ', 100, 0);
        boolean boolean70 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray53, (java.lang.Class<?>[]) classArray59, false);
        boolean boolean71 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray15, wildcardClassArray53);
        boolean boolean73 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray12, wildcardClassArray53, false);
        java.lang.String str74 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) wildcardClassArray12);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(wildcardClassArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "class java.lang.Stringclass java.lang.Stringclass java.lang.String" + "'", str13, "class java.lang.Stringclass java.lang.Stringclass java.lang.String");
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
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(classArray47);
        org.junit.Assert.assertNotNull(wildcardClassArray48);
        org.junit.Assert.assertNotNull(wildcardClassArray49);
        org.junit.Assert.assertNotNull(classArray52);
        org.junit.Assert.assertNotNull(wildcardClassArray53);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(classArray59);
        org.junit.Assert.assertNotNull(wildcardClassArray60);
        org.junit.Assert.assertNotNull(wildcardClassArray61);
        org.junit.Assert.assertNotNull(wildcardClassArray62);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "class java.lang.Stringclass java.lang.Stringclass java.lang.String" + "'", str74, "class java.lang.Stringclass java.lang.Stringclass java.lang.String");
    }

    @Test
    public void test13945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13945");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("\u82f1\u8a9e...xxxxxFrench(France)xxxxxxxxxx...xxxxxFrench(France)xxxxxxxxxx...xxxxxFrench(France)xxxxxxxxxx", "444444444444444444444444444444444444444444444444AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAANIHc", 0);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test13946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13946");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("chinarglAsAchinarglAsAchinarglAsAchinarglAsAchinarglAsAchinarglAsAchinarglAsAchinarglAsAchinarglAsAchina");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=chinarglasachinarglasachinarglasachinarglasachinarglasachinarglasachinarglasachinarglasachinarglasachina");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13947");
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
        java.lang.String str12 = locale3.getISO3Language();
        java.lang.String str13 = locale3.getLanguage();
        java.util.Locale.Builder builder14 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder15 = builder14.clearExtensions();
        java.util.Locale.Builder builder16 = builder14.clearExtensions();
        java.util.Locale.Builder builder17 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder18 = builder17.clearExtensions();
        java.util.Locale locale19 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale.Builder builder20 = builder18.setLocale(locale19);
        java.util.Locale locale21 = builder20.build();
        java.util.Locale locale25 = new java.util.Locale("");
        java.util.Set<java.lang.String> strSet26 = locale25.getUnicodeLocaleKeys();
        boolean boolean27 = locale25.hasExtensions();
        java.lang.String str28 = locale25.getVariant();
        java.lang.String str29 = org.apache.commons.lang3.StringUtils.upperCase("String", locale25);
        java.lang.String str30 = org.apache.commons.lang3.StringUtils.lowerCase("chinChinChinChinChiChinChinChinChinC", locale25);
        java.util.Set<java.lang.String> strSet31 = locale25.getUnicodeLocaleAttributes();
        java.lang.String str32 = locale21.getDisplayName(locale25);
        java.util.Locale.Builder builder33 = builder16.setLocale(locale21);
        java.lang.String str34 = locale21.getDisplayVariant();
        java.lang.String str35 = locale3.getDisplayLanguage(locale21);
        java.util.Set<java.lang.String> strSet36 = locale21.getUnicodeLocaleKeys();
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "inglese" + "'", str4, "inglese");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "it_CN");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Cina" + "'", str9, "Cina");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "eng" + "'", str12, "eng");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "en" + "'", str13, "en");
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "zh_CN");
        org.junit.Assert.assertEquals(locale25.toString(), "");
        org.junit.Assert.assertNotNull(strSet26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "STRING" + "'", str29, "STRING");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "chinchinchinchinchichinchinchinchinc" + "'", str30, "chinchinchinchinchichinchinchinchinc");
        org.junit.Assert.assertNotNull(strSet31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Chinese (China)" + "'", str32, "Chinese (China)");
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "\u82f1\u6587" + "'", str35, "\u82f1\u6587");
        org.junit.Assert.assertNotNull(strSet36);
    }

    @Test
    public void test13948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13948");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("hi", (int) '.', 31);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test13949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13949");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("t           hindi(HI!,cHINA)            ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "t           hindi(HI!,cHINA)" + "'", str1, "t           hindi(HI!,cHINA)");
    }

    @Test
    public void test13950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13950");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("cCHNAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAina (CCHNAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAina)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "cCHNAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAina (CCHNAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAina)" + "'", str1, "cCHNAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAina (CCHNAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAina)");
    }

    @Test
    public void test13951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13951");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hsilgneNC-hz", 'u');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test13952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13952");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("...X.AZ.BA.BB.BD.BE.BF.BG.BH.BI.BJ.BL.BM.BN..._italiano", 34, 97);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".BL.BM.BN..._italiano" + "'", str3, ".BL.BM.BN..._italiano");
    }

    @Test
    public void test13953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13953");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("AHI!HI!                                      ", "SEXXXXXXXXXXXXXX");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test13954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13954");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("Collections.EmptySetitaCollections.EmptySetitaCollections.EmptySetitaCollections.EmptySet", "", 8);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
    }

    @Test
    public void test13955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13955");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "a#");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test13956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13956");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("..italiahiit_cn..italiahiit_cn..italiahiit_cn..italiahi", 563, (int) '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...iahiit_cn..italiahiit_cn..italiahiit_cn..italiahi" + "'", str3, "...iahiit_cn..italiahiit_cn..italiahiit_cn..italiahi");
    }

    @Test
    public void test13957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13957");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("loca", "ese(Taiwan$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test13958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13958");
        java.util.Locale locale2 = new java.util.Locale("Class", "latiarfati");
        java.util.Locale locale3 = locale2.stripExtensions();
        boolean boolean4 = locale3.hasExtensions();
        org.junit.Assert.assertEquals(locale2.toString(), "class_LATIARFATI");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "class_LATIARFATI");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test13959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13959");
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
        java.lang.String str18 = locale5.getDisplayLanguage();
        java.util.Locale locale22 = new java.util.Locale("hindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHind", "locale.builder", "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hEnglish");
        java.util.Locale locale24 = java.util.Locale.TAIWAN;
        java.lang.String str25 = org.apache.commons.lang3.StringUtils.upperCase("", locale24);
        java.lang.String str26 = locale24.getISO3Country();
        java.util.Set<java.lang.Character> charSet27 = locale24.getExtensionKeys();
        java.util.Locale locale28 = locale24.stripExtensions();
        java.util.Locale locale29 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale30 = java.util.Locale.getDefault();
        java.lang.String str31 = locale29.getDisplayCountry(locale30);
        java.lang.String str32 = locale29.toLanguageTag();
        java.util.Locale locale33 = locale29.stripExtensions();
        java.lang.String str34 = locale28.getDisplayName(locale33);
        java.lang.String str35 = locale22.getDisplayName(locale28);
        java.lang.String str36 = locale5.getDisplayName(locale28);
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals(locale22.toString(), "hindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihind_LOCALE.BUILDER_ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hEnglish");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "TWN" + "'", str26, "TWN");
        org.junit.Assert.assertNotNull(charSet27);
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale30);
// flaky:         org.junit.Assert.assertEquals(locale30.toString(), "fr_FR");
// flaky:         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Chine" + "'", str31, "Chine");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "zh-CN" + "'", str32, "zh-CN");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str34 + "' != '" + "\u4e2d\u6587\u53f0\u6e7e\u5730\u533a)" + "'", str34, "\u4e2d\u6587\u53f0\u6e7e\u5730\u533a)");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihind (LOCALE.BUILDER,ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hEnglish)" + "'", str35, "hindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihindihind (LOCALE.BUILDER,ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hEnglish)");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
    }

    @Test
    public void test13960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13960");
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
        java.util.Locale locale39 = java.util.Locale.forLanguageTag("englhi!string[]string[]sshi!string[]string[]s");
        java.lang.String str40 = locale36.getDisplayLanguage(locale39);
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
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Italian" + "'", str40, "Italian");
    }

    @Test
    public void test13961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13961");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("char[]", "\u6cd5\u6587");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test13962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13962");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("isangl", "......44444444EnglTWNsTWN44444444......");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "isangl" + "'", str2, "isangl");
    }

    @Test
    public void test13963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13963");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("slgneslgneslgnefran\347ais (canada)slgneslgneslgne", "f   ch");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test13964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13964");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("italiahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIital..", 'u');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "italiahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIital.." + "'", str2, "italiahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIital..");
    }

    @Test
    public void test13965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13965");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("xxxxxxxxxxxxxxxxxxxxxxxxxChinese", "CHINOIS(CHINE)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "xxxxxxxxxxxxxxxxxxxxxxxxxChinese" + "'", str2, "xxxxxxxxxxxxxxxxxxxxxxxxxChinese");
    }

    @Test
    public void test13966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13966");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("CHN     ", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test13967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13967");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("cinese(Taiwan)", "englTWNsTWN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "cinese(Taiwan)" + "'", str2, "cinese(Taiwan)");
    }

    @Test
    public void test13968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13968");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaZH-CNENGLISH", "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxzh-hcnczih", "Z");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test13969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13969");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("  China   ", "cn (italianojajajajajajajajajajajajajaj)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test13970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13970");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("CHINOIS(CHINE)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "CHINOIS(CHINE" + "'", str1, "CHINOIS(CHINE");
    }

    @Test
    public void test13971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13971");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                    ", "zh-CN", 42);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.endsWithAny("Engls", strArray6);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.concatWith("\u82f1\u6587\u7f8e\u570b)", (java.lang.Object[]) strArray6);
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("zxxxxxxxxxxxxxxxxxxx", "en_CA", 35);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.startsWithAny("iiiiiiiiiiiiiiiiiiiiiiiArrayListiiiiiiiiiiiiiiiiiiiiiiiArrayListiiiiiiiiiiiiiiiiiiiiiiiArrayListiiiiiiiiiiiiiiiiiiiiiiiArrayListiiiiiiiiiiiiiiiiiiiiiiiArrayListiiiiiiiiiiiiiiiiiiiiiiiArrayListiiiiiiiiiiiiiiiiiiiiiiiArrayListiiiiiiiiiiiiiiiiiiiiiiiArrayListiiiiiiiiiiiiiiiiiiiiiiiArrayList", strArray13);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("Hindi (HI!...", strArray6, strArray13);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray13, ' ');
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "                                                                                                    " + "'", str8, "                                                                                                    ");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hindi (HI!..." + "'", str15, "Hindi (HI!...");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "zxxxxxxxxxxxxxxxxxxx" + "'", str17, "zxxxxxxxxxxxxxxxxxxx");
    }

    @Test
    public void test13972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13972");
        java.lang.Class[] classArray2 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray3 = (java.lang.Class<?>[]) classArray2;
        java.lang.Class<?>[] wildcardClassArray4 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray2);
        java.lang.Class<?>[] wildcardClassArray5 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray2);
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) classArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.concatWith("$", (java.lang.Object[]) classArray2);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) classArray2, ' ');
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertNotNull(wildcardClassArray4);
        org.junit.Assert.assertNotNull(wildcardClassArray5);
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test13973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13973");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("444444444444444444444444444", 2, 83);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test13974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13974");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "-CA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test13975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13975");
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
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream51 = languageRangeList1.parallelStream();
        java.util.Locale.LanguageRange[] languageRangeArray52 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList53 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList53, languageRangeArray52);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap55 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList56 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList53, strMap55);
        java.lang.String[] strArray64 = new java.lang.String[] { "English", "hi", "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "", "a", "", "China" };
        java.util.ArrayList<java.lang.String> strList65 = new java.util.ArrayList<java.lang.String>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList65, strArray64);
        java.util.List<java.lang.Class<?>> wildcardClassList67 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList65);
        java.lang.String str68 = java.util.Locale.lookupTag(languageRangeList56, (java.util.Collection<java.lang.String>) strList65);
        java.util.Locale.LanguageRange[] languageRangeArray69 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList70 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList70, languageRangeArray69);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap72 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList73 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList70, strMap72);
        java.util.Locale.LanguageRange[] languageRangeArray74 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList75 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList75, languageRangeArray74);
        boolean boolean77 = languageRangeList70.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList75);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream78 = languageRangeList75.stream();
        boolean boolean79 = languageRangeList56.containsAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList75);
        java.util.Locale.LanguageRange languageRange81 = new java.util.Locale.LanguageRange("English");
        java.lang.String str82 = languageRange81.getRange();
        boolean boolean83 = languageRangeList56.add(languageRange81);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor85 = languageRangeList56.listIterator(0);
        java.lang.String str87 = org.apache.commons.lang3.StringUtils.join((java.util.Iterator<java.util.Locale.LanguageRange>) languageRangeItor85, "                                                                                       ese(Taiwan");
        languageRangeItor85.remove();
        boolean boolean89 = languageRangeList1.equals((java.lang.Object) languageRangeItor85);
        java.util.Locale.LanguageRange languageRange91 = new java.util.Locale.LanguageRange("English");
        java.lang.String str93 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) languageRange91, "");
        boolean boolean94 = languageRangeList1.add(languageRange91);
        double double95 = languageRange91.getWeight();
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
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(wildcardClassList47);
        org.junit.Assert.assertTrue("'" + filteringMode48 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode48.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList49);
        org.junit.Assert.assertNotNull(languageRangeStream50);
        org.junit.Assert.assertNotNull(languageRangeStream51);
        org.junit.Assert.assertNotNull(languageRangeArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(languageRangeList56);
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(wildcardClassList67);
        org.junit.Assert.assertNull(str68);
        org.junit.Assert.assertNotNull(languageRangeArray69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(languageRangeList73);
        org.junit.Assert.assertNotNull(languageRangeArray74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(languageRangeStream78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "english" + "'", str82, "english");
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNotNull(languageRangeItor85);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "Locale.LanguageRange" + "'", str93, "Locale.LanguageRange");
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
        org.junit.Assert.assertTrue("'" + double95 + "' != '" + 1.0d + "'", double95 == 1.0d);
    }

    @Test
    public void test13976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13976");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("HI");
        java.lang.String str2 = locale1.getDisplayName();
        java.util.Locale locale4 = new java.util.Locale("chnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        java.lang.String str5 = locale1.getDisplayScript(locale4);
        java.lang.Object obj6 = locale1.clone();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hindi" + "'", str2, "hindi");
        org.junit.Assert.assertEquals(locale4.toString(), "chnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "hi");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "hi");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "hi");
    }

    @Test
    public void test13977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13977");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "fr-CA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test13978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13978");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("I!Hchizh_TW", "TW");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I!Hchizh_" + "'", str2, "I!Hchizh_");
    }

    @Test
    public void test13979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13979");
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
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(languageRangeItor10, ' ');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(languageRangeItor10, 'a');
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(languageRangeArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(languageRangeStream9);
        org.junit.Assert.assertNotNull(languageRangeItor10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test13980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13980");
        java.util.Locale locale0 = java.util.Locale.PRC;
        java.lang.String str1 = locale0.getDisplayName();
        boolean boolean2 = locale0.hasExtensions();
        java.util.Locale locale4 = java.util.Locale.CHINA;
        java.util.Set<java.lang.Character> charSet5 = locale4.getExtensionKeys();
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.lowerCase("String[]", locale4);
        java.lang.String str7 = locale0.getDisplayScript(locale4);
        java.util.Locale locale8 = locale0.stripExtensions();
        java.lang.String str9 = locale0.getVariant();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "cinese (Cina)" + "'", str1, "cinese (Cina)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(charSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "string[]" + "'", str6, "string[]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test13981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13981");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setScript("");
        java.util.Locale.Builder builder4 = builder2.setLanguage("HI");
        java.util.Locale locale5 = builder4.build();
        java.util.Locale.Builder builder6 = builder4.clearExtensions();
        java.util.Locale.Builder builder7 = builder6.clearExtensions();
        java.util.Locale.Builder builder9 = builder6.setLanguage("ARRAYLIS");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder6.setLanguage("it-CN");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: it-CN [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "hi");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test13982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13982");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale.Builder builder3 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder5 = builder1.setRegion("zh");
        java.util.Locale.Builder builder6 = builder5.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder6.setRegion("Chinaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: Chinaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa [at index 0]");
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
    public void test13983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13983");
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
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.split("  China   ", "en-CA");
        java.lang.Class<?>[] wildcardClassArray13 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray12);
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
        java.lang.Class<?>[] wildcardClassArray45 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers((java.lang.Class<?>[]) classArray39);
        java.lang.Class<?>[] wildcardClassArray46 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray45);
        boolean boolean47 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray13, wildcardClassArray46);
        boolean boolean48 = locale1.equals((java.lang.Object) boolean47);
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
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(wildcardClassArray13);
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
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test13984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13984");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("...x.az.ba.bb.bd.be.bf.bg.bh.bi.bj.bl.bm.bn..._ITALIANO", 9, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...x.az.ba.bb.bd.be.bf.bg.bh.bi.bj.bl.bm.bn..._ITALIANO" + "'", str3, "...x.az.ba.bb.bd.be.bf.bg.bh.bi.bj.bl.bm.bn..._ITALIANO");
    }

    @Test
    public void test13985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13985");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("ahi!hiCinaxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxCHN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ahi!hiCinaxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxCH" + "'", str1, "ahi!hiCinaxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxCH");
    }

    @Test
    public void test13986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13986");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("HI!STRING[...");
        java.lang.String str3 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) strArray1, "    Z");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.lang" + "'", str3, "java.lang");
    }

    @Test
    public void test13987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13987");
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
        java.util.Locale.setDefault(locale2);
        java.lang.String str34 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) locale2, "");
        java.lang.String str35 = locale2.getISO3Language();
        java.lang.String str36 = locale2.getDisplayName();
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "inglese" + "'", str5, "inglese");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "a" + "'", str7, "a");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "it");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Cina" + "'", str12, "Cina");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "zh-CN" + "'", str13, "zh-CN");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "zh" + "'", str14, "zh");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "it");
        org.junit.Assert.assertEquals(locale17.toString(), "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "inglese" + "'", str20, "inglese");
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
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Locale" + "'", str34, "Locale");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
    }

    @Test
    public void test13988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13988");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("##Italian");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.stripAll(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test13989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13989");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("#########################English");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hsilgnE#########################" + "'", str1, "hsilgnE#########################");
    }

    @Test
    public void test13990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13990");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass("GNAL.AVAJString[]String[]String[]", false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: [LGNAL/AVAJString[]String[]String;");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13991");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("chnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "ChinChinChinChinChinChinChinChinChinaaaaaaaaa$");
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny("CLASS[]", strArray3);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny("it-CN", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str5, "chnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test13992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13992");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("zaa.ab.ae.af.ak.am.an.ar.as.av.ay.az.ba.be.bg.bh.bi.bm.bn.bo.br.bs.ca.ce.ch.co.cr.cs.cu.cv.cy.da.de.dv.dz.ee.el.en.eo.es.et.eu.fa.ff.fi.fj.fo.fr.fy.ga.gd.gl.gn.gu.gv.ha.he.hi.ho.hr.ht.hu.hy.hz.ia.id.ie.ig.ii.ik.in.io.is.it.iu.iw.ja.ji.jv.ka.kg.ki.kj.kk.kl.km.kn.ko.kr.ks.ku.kv.kw.ky.la.lb.lg.li.ln.lo.lt.lu.lv.mg.mh.mi.mk.ml.mn.mo.mr.ms.mt.my.na.nb.nd.ne.ng.nl.nn.no.nr.nv.ny.oc.oj.om.or.os.pa.pi.pl.ps.pt.qu.rm.rn.ro.ru.rw.sa.sc.sd.se.sg.si.sk.sl.sm.sn.so.sq.sr.ss.st.su.sv.sw.ta.te.tg.th.ti.tk.tl.tn.to.tr.ts.tt.tw.ty.ug.uk.ur.uz.ve.vi.vo.wa.wo.xh.yi.yo.za.zh.zu", "GGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGL");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test13993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13993");
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
        java.lang.Object[] objArray29 = languageRangeList1.toArray();
        java.lang.String str30 = org.apache.commons.lang3.StringUtils.concat(objArray29);
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
        org.junit.Assert.assertNotNull(objArray29);
    }

    @Test
    public void test13994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13994");
        java.util.Locale locale1 = new java.util.Locale("undaaaaaaaH");
        java.lang.String str2 = locale1.getDisplayName();
        org.junit.Assert.assertEquals(locale1.toString(), "undaaaaaaah");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "undaaaaaaah" + "'", str2, "undaaaaaaah");
    }

    @Test
    public void test13995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13995");
        java.util.Locale locale2 = new java.util.Locale("English (United States)", "de");
        java.lang.String str3 = locale2.getCountry();
        java.lang.String str4 = locale2.getVariant();
        org.junit.Assert.assertEquals(locale2.toString(), "english (united states)_DE");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DE" + "'", str3, "DE");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test13996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13996");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("\u7fa9\u5927\u5229\u6587", "", 3, 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u7fa9\u5927\u5229" + "'", str4, "\u7fa9\u5927\u5229");
    }

    @Test
    public void test13997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13997");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("Collections.EmptySet", "ListfraHAr", 97);
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test13998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13998");
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
        boolean boolean31 = languageRangeList1.contains((java.lang.Object) "\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587          ");
        java.util.Spliterator<java.util.Locale.LanguageRange> languageRangeSpliterator32 = languageRangeList1.spliterator();
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
        org.junit.Assert.assertNotNull(languageRangeSpliterator32);
    }

    @Test
    public void test13999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13999");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.setLanguageTag("zh-CN");
        java.util.Locale.Builder builder5 = builder3.setLanguage("CHINA");
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        java.util.Locale locale8 = new java.util.Locale("zh-cnenglish");
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
        java.util.Locale locale34 = new java.util.Locale("CHN", "hi!");
        java.lang.String str35 = locale12.getDisplayCountry(locale34);
        java.util.Set<java.lang.Character> charSet36 = locale12.getExtensionKeys();
        java.lang.String str37 = locale8.getDisplayLanguage(locale12);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder38 = builder6.setLocale(locale8);
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: zh-cnenglish [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertEquals(locale8.toString(), "zh-cnenglish");
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "English" + "'", str13, "English");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Canada" + "'", str31, "Canada");
        org.junit.Assert.assertEquals(locale34.toString(), "chn_HI!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Canada" + "'", str35, "Canada");
        org.junit.Assert.assertNotNull(charSet36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "zh-cnenglish" + "'", str37, "zh-cnenglish");
    }

    @Test
    public void test14000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test14000");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("ngls", "\u4e2d\u56fdAD");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }
}
